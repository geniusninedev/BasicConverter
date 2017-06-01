package com.nineinfosys.basicconverter.ConverterActivity;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.nineinfosys.basicconverter.ConverterActivityList.ConversionVolumeDryListActivity;
import com.nineinfosys.basicconverter.Engin.VolumeDryConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class VolumeDryActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher {


    //declaration of designing tools
    private Spinner spinnerConvertFrom, spinnerConvertTo;
    private EditText editTextValue, editTextValueTo;
    private FloatingActionButton buttonList, buttonShare, buttonMail, buttonCopy;
    private SwitchCompat switchChangeType;
    List<String> listVolumeFirstfrom, listVolumeFirstTo, listVolumefrom, listVolumeTo;
    private String stringSpinnerFrom, stringSpinnerTo;
    private TextView textViewBasicUnit, textViewAllUnit,textViewConvert;
    double doubleEdittextvalue = 1.0;
    private int basicunit = 5;
    private int allunit = 15;
    private DecimalFormat formatter = null;
    private static final int REQUEST_CODE = 100;

    VolumeDryConverter.ConversionResults item;
    private String strLiter = null;
    private String strBarreldryUS = null;
    private  String strPintdryUS = null;
    private String strQuartdryUS = null;
    private  String strPeckUS = null;
    private  String strPeckUK = null;
    private  String strBushelUS = null;
    private  String strBushelUK = null;
    private  String strCorBiblical = null;
    private  String strHomerBiblical = null;
    private String strEphahBiblical = null;
    private  String strSeahBiblical = null;
    private  String strOmerBiblical = null;
    private String strCabBiblical = null;
    private String strLogBiblical = null;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);


        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#27d8d5")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Volume Dry");

        formatsetting();

        MobileAds.initialize(VolumeDryActivity.this, getString(R.string.ads_app_id));
        AdView mAdView = (AdView) findViewById(R.id.adViewUnitConverter);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //initalization of tools and variables
        spinnerConvertFrom = (Spinner) findViewById(R.id.spinnerConvertFrom);
        spinnerConvertTo = (Spinner) findViewById(R.id.spinnerConvertTo);
        textViewBasicUnit = (TextView) findViewById(R.id.textViewBasicUnit);
        textViewAllUnit = (TextView) findViewById(R.id.textViewAllUnit);
        textViewConvert=(TextView) findViewById(R.id.buttonUnitConverter);
        editTextValue = (EditText) findViewById(R.id.edittextFrom);
        editTextValueTo = (EditText) findViewById(R.id.edittextTo);
        buttonCopy = (FloatingActionButton) findViewById(R.id.button_copy);
        buttonList = (FloatingActionButton) findViewById(R.id.button_list_fullreport);
        buttonShare = (FloatingActionButton) findViewById(R.id.button_list_share);
        buttonMail = (FloatingActionButton) findViewById(R.id.button_list_mail);
        switchChangeType = (SwitchCompat) findViewById(R.id.switchButton);

        //changing color dynamically
        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightskyblue)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightskyblue)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightskyblue)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightskyblue)));

        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()),ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightskyblue)));
        // DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getTrackDrawable()), ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRed)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textViewConvert.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightskyblue)));
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#00a6a4"));
        }

        textViewBasicUnit.setText(String.valueOf("Basic Units(" + basicunit + ")"));
        textViewAllUnit.setText(String.valueOf("All Units(" + allunit + ")"));


        //adding value to spinner
        listVolumeFirstfrom = new ArrayList<String>();
        listVolumeFirstTo = new ArrayList<String>();


        //for first time running spinner
        listVolumeFirstfrom.add("Liter - L");
        listVolumeFirstfrom.add("Barrel dry(US) - bbl dry");
        listVolumeFirstfrom.add("Pint dry(US) - pt dry");
        listVolumeFirstfrom.add("Quart dry(US) - qt dry");
        listVolumeFirstfrom.add("Peck dry(US) - pk");

        listVolumeFirstTo.add("Liter - L");
        listVolumeFirstTo.add("Barrel dry(US) - bbl dry");
        listVolumeFirstTo.add("Pint dry(US) - pt dry");
        listVolumeFirstTo.add("Quart dry(US) - qt dry");
        listVolumeFirstTo.add("Peck dry(US) - pk");

        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(VolumeDryActivity.this, android.R.layout.simple_spinner_item, listVolumeFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(VolumeDryActivity.this, android.R.layout.simple_spinner_item, listVolumeFirstTo);


        // Drop down layout style - list view with radio button
        Adapter.setDropDownViewResource(android.R.layout.simple_list_item_checked);
        AdapterTempTo.setDropDownViewResource(android.R.layout.simple_list_item_checked);

        // attaching data adapter to spinner
        spinnerConvertFrom.setAdapter(Adapter);
        spinnerConvertTo.setAdapter(AdapterTempTo);

        //switch converttype
        switchChangeType.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                listVolumefrom = new ArrayList<String>();
                listVolumeTo = new ArrayList<String>();
                String stringSwitchSate = String.valueOf(isChecked);
                String strBasic = "Basic";
                String strAdvance = "All";
                switch (stringSwitchSate) {

                    case "false":
                        Snackbar.make(buttonView, "You switched to " + strBasic + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listVolumefrom.clear();
                        listVolumeTo.clear();
                        listVolumefrom.add("Liter - L");
                        listVolumefrom.add("Barrel dry(US) - bbl dry");
                        listVolumefrom.add("Pint dry(US) - pt dry");
                        listVolumefrom.add("Quart dry(US) - qt dry");
                        listVolumefrom.add("Peck dry(US) - pk");

                        //2 spinner
                        listVolumeTo.add("Liter - L");
                        listVolumeTo.add("Barrel dry(US) - bbl dry");
                        listVolumeTo.add("Pint dry(US) - pt dry");
                        listVolumeTo.add("Quart dry(US) - qt dry");
                        listVolumeTo.add("Peck dry(US) - pk");
                        break;

                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strAdvance + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listVolumefrom.clear();
                        listVolumeTo.clear();
                        listVolumefrom.add("Liter - L");
                        listVolumefrom.add("Barrel dry(US) - bbl dry");
                        listVolumefrom.add("Pint dry(US) - pt dry");
                        listVolumefrom.add("Quart dry(US) - qt dry");
                        listVolumefrom.add("Peck dry(US) - pk");
                        listVolumefrom.add("Peck dry(UK) - pk");
                        listVolumefrom.add("Bushel(US) - bu");
                        listVolumefrom.add("Bushel(UK) - bu");
                        listVolumefrom.add("Cor(Biblical) - cor");
                        listVolumefrom.add("Homer(Biblical) - homer");
                        listVolumefrom.add("Ephah(Biblical) - ephah");
                        listVolumefrom.add("Seah(Biblical) - seah");
                        listVolumefrom.add("Omer(Biblical) - omer");
                        listVolumefrom.add("Cab(Biblical) - cab");
                        listVolumefrom.add("Log(Biblical) - log");

                        //second spinner
                        listVolumeTo.add("Liter - L");
                        listVolumeTo.add("Barrel dry(US) - bbl dry");
                        listVolumeTo.add("Pint dry(US) - pt dry");
                        listVolumeTo.add("Quart dry(US) - qt dry");
                        listVolumeTo.add("Peck dry(US) - pk");
                        listVolumeTo.add("Peck dry(UK) - pk");
                        listVolumeTo.add("Bushel(US) - bu");
                        listVolumeTo.add("Bushel(UK) - bu");
                        listVolumeTo.add("Cor(Biblical) - cor");
                        listVolumeTo.add("Homer(Biblical) - homer");
                        listVolumeTo.add("Ephah(Biblical) - ephah");
                        listVolumeTo.add("Seah(Biblical) - seah");
                        listVolumeTo.add("Omer(Biblical) - omer");
                        listVolumeTo.add("Cab(Biblical) - cab");
                        listVolumeTo.add("Log(Biblical) - log");


                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(VolumeDryActivity.this, android.R.layout.simple_spinner_item, listVolumefrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(VolumeDryActivity.this, android.R.layout.simple_spinner_item, listVolumeTo);


                // Drop down layout style - list view with radio button
                Adapter2.setDropDownViewResource(android.R.layout.simple_list_item_checked);
                AdapterTempTo2.setDropDownViewResource(android.R.layout.simple_list_item_checked);

                // attaching data adapter to spinner
                spinnerConvertFrom.setAdapter(Adapter2);
                spinnerConvertTo.setAdapter(AdapterTempTo2);

            }
        });

        editTextValue.addTextChangedListener(this);
        buttonList.setOnClickListener(this);
        buttonShare.setOnClickListener(this);
        buttonMail.setOnClickListener(this);
        buttonCopy.setOnClickListener(this);
        textViewConvert.setOnClickListener(this);


        spinnerConvertFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (editTextValue.getText().toString().trim().equals("")) {
                    Snackbar.make(adapterView, "Provide Unit Value for Conversion", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                } else {
                    doubleEdittextvalue = Double.parseDouble(editTextValue.getText().toString().trim());
                    stringSpinnerFrom = spinnerConvertFrom.getSelectedItem().toString().trim();
                    stringSpinnerTo = spinnerConvertTo.getSelectedItem().toString().trim();

                    calcualteValue(stringSpinnerFrom, stringSpinnerTo, doubleEdittextvalue);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinnerConvertTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (editTextValue.getText().toString().trim().equals("")) {
                    Snackbar.make(adapterView, "Provide Unit Value for Conversion", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                } else {
                    doubleEdittextvalue = Double.parseDouble(editTextValue.getText().toString().trim());
                    stringSpinnerFrom = spinnerConvertFrom.getSelectedItem().toString().trim();
                    stringSpinnerTo = spinnerConvertTo.getSelectedItem().toString().trim();

                    calcualteValue(stringSpinnerFrom, stringSpinnerTo, doubleEdittextvalue);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    private void formatsetting() {
        //fetching value from sharedpreference
        SharedPreferences sharedPreferences = this.getSharedPreferences(Settings.SHARED_PREF_NAME, Context.MODE_PRIVATE);
        //Fetching thepatient_mobile_Number value form sharedpreferences
        String FormattedString = sharedPreferences.getString(Settings.Format_Selected_SHARED_PREF, "Thousands separator");
        String DecimalplaceString = sharedPreferences.getString(Settings.Decimal_Place_Selected_SHARED_PREF, "2");
        Settings settings = new Settings(FormattedString, DecimalplaceString);
        formatter = settings.setting();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonUnitConverter:
                //switch spinner value
                int spinner1Index = spinnerConvertFrom.getSelectedItemPosition();
                spinnerConvertFrom.setSelection(spinnerConvertTo.getSelectedItemPosition());
                spinnerConvertTo.setSelection(spinner1Index );
                break;

            case R.id.button_list_fullreport:
                doubleEdittextvalue = Double.parseDouble(editTextValue.getText().toString().trim());
                Intent i = new Intent(this, ConversionVolumeDryListActivity.class);
                i.putExtra("stringSpinnerFrom", stringSpinnerFrom);
                i.putExtra("doubleEdittextvalue", doubleEdittextvalue);
                startActivity(i);
                break;

            case R.id.button_copy:
                String text = editTextValueTo.getText().toString().trim();
                android.content.ClipboardManager clipboardMgr = (android.content.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Copied text", text);
                clipboardMgr.setPrimaryClip(clip);
                Snackbar.make(v, "Conversion Value Copied", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                break;

            case R.id.button_list_share:
                String textTo = editTextValueTo.getText().toString().trim();
                String textFrom = editTextValueTo.getText().toString().trim();

                String shareMessage = textFrom + " " + stringSpinnerFrom + ": " + textTo + " " + stringSpinnerTo;

                try {
                    Intent share = new Intent();
                    share.setAction("android.intent.action.SEND");
                    share.setType("text/plain");
                    share.putExtra("android.intent.extra.TEXT", shareMessage);
                    startActivity(Intent.createChooser(share, ""));

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            case R.id.button_list_mail:
                String textmailTo = editTextValueTo.getText().toString().trim();
                String textmailFrom = editTextValueTo.getText().toString().trim();
                String message = textmailTo + " " + stringSpinnerFrom + " :  " + textmailFrom + "  " + stringSpinnerTo;
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{});
                email.putExtra(Intent.EXTRA_SUBJECT, "Conversion Details");
                email.putExtra(Intent.EXTRA_TEXT, message);
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Select Email Client"));
                break;

        }

    }


    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

        try {

            doubleEdittextvalue = Double.parseDouble(editTextValue.getText().toString().trim());
            stringSpinnerFrom = spinnerConvertFrom.getSelectedItem().toString().trim();
            stringSpinnerTo = spinnerConvertTo.getSelectedItem().toString().trim();
            calcualteValue(stringSpinnerFrom, stringSpinnerTo, doubleEdittextvalue);

        } catch (NumberFormatException e) {
            doubleEdittextvalue = 0;

        }


    }

    public void calcualteValue(String strSpinnerFromvalue1, String strSpinnerTovalue2, double doubleEdittextvalue1) {



        try {

            VolumeDryConverter c = new VolumeDryConverter(strSpinnerFromvalue1, doubleEdittextvalue1);
            ArrayList<VolumeDryConverter.ConversionResults> results = c.calculateVolumeDryConversion();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);

                strLiter = String.valueOf(formatter.format(item.getLiter()));
                strBarreldryUS = String.valueOf(formatter.format(item.getBarreldryUS()));
                strPintdryUS = String.valueOf(formatter.format(item.getPintdryUS()));
                strQuartdryUS = String.valueOf(formatter.format(item.getQuartdryUS()));
                strPeckUS= String.valueOf(formatter.format(item.getPeckUS()));
                strPeckUK = String.valueOf(formatter.format(item.getPeckUK()));
                strBushelUS = String.valueOf(formatter.format(item.getBushelUS()));
                strBushelUK = String.valueOf(formatter.format(item.getBushelUK()));
                strCorBiblical = String.valueOf(formatter.format(item.getCorBiblical()));
                strHomerBiblical = String.valueOf(formatter.format(item.getHomerBiblical()));
                strEphahBiblical = String.valueOf(formatter.format(item.getEphahBiblical()));
                strSeahBiblical = String.valueOf(formatter.format(item.getSeahBiblical()));
                strOmerBiblical= String.valueOf(formatter.format(item.getOmerBiblical()));
                strCabBiblical = String.valueOf(formatter.format(item.getCabBiblical()));
                strLogBiblical = String.valueOf(formatter.format(item.getLogBiblical()));


                switch (strSpinnerFromvalue1) {
                    case "Liter - L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Barrel dry(US) - bbl dry":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Pint dry(US) - pt dry":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Quart dry(US) - qt dry":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Peck dry(US) - pk":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Peck dry(UK) - pk":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Bushel(US) - bu":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Bushel(UK) - bu":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Cor(Biblical) - cor":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Homer(Biblical) - homer":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Ephah(Biblical) - ephah":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Seah(Biblical) - seah":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Omer(Biblical) - omer":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cab(Biblical) - cab":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Log(Biblical) - log":
                        conversion(strSpinnerTovalue2);
                        break;
                }
            }


        } catch (NumberFormatException e) {
            doubleEdittextvalue = 0;

        }
    }

    private void conversion(String strSpinnerTovalue2) {


        switch (strSpinnerTovalue2) {
            case "Liter - L":
                editTextValueTo.setText(strLiter);
                break;
            case "Barrel dry(US) - bbl dry":
                editTextValueTo.setText(strBarreldryUS);
                break;

            case "Pint dry(US) - pt dry":
                editTextValueTo.setText(strPintdryUS);
                break;
            case "Quart dry(US) - qt dry":
                editTextValueTo.setText(strQuartdryUS);
                break;
            case "Peck dry(US) - pk":
                editTextValueTo.setText(strPeckUS);
                break;
            case "Peck dry(UK) - pk":
                editTextValueTo.setText(strPeckUK);
                break;
            case "Bushel(US) - bu":
                editTextValueTo.setText(strBushelUS);
                break;
            case "Bushel(UK) - bu":
                editTextValueTo.setText(strBushelUK);
                break;

            case "Cor(Biblical) - cor":
                editTextValueTo.setText(strCorBiblical);
                break;
            case "Homer(Biblical) - homer":
                editTextValueTo.setText(strHomerBiblical);
                break;

            case "Ephah(Biblical) - ephah":
                editTextValueTo.setText(strEphahBiblical);
                break;
            case "Seah(Biblical) - seah":
                editTextValueTo.setText(strSeahBiblical);
                break;
            case "Omer(Biblical) - omer":
                editTextValueTo.setText(strOmerBiblical);
                break;
            case "Cab(Biblical) - cab":
                editTextValueTo.setText(strCabBiblical);
                break;
            case "Log(Biblical) - log":
                editTextValueTo.setText(strLogBiblical);
                break;
        }


    }


    @Override
    public void afterTextChanged(Editable s) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == android.R.id.home) {

            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                this.finish();
                return true;
        }
        return super.onKeyDown(keyCode, event);
    }



}