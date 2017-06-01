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
import com.nineinfosys.basicconverter.ConverterActivityList.VolumeLumberListActivity;
import com.nineinfosys.basicconverter.Engin.VolumeLumberConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class VolumeLumberConverterActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher {

    //declaration of designing tools
    private Spinner spinnerConvertFrom, spinnerConvertTo;
    private EditText editTextValue, editTextValueTo;
    private FloatingActionButton buttonList, buttonShare, buttonMail, buttonCopy;
    private SwitchCompat switchChangeType;
    List<String> listLinearChargeFirsttempTo, listLinearChargeFirstfrom,listLinearChargeTo,listLinearChargefrom;
    private String stringSpinnerFrom, stringSpinnerTo;
    private TextView textViewBasicUnit, textViewAllUnit,textViewConvert;
    double doubleEdittextvalue = 1.0;
    private int basicunit = 4;
    private int allunit = 17;
    DecimalFormat formatter = null;
    private static final int REQUEST_CODE = 100;

    VolumeLumberConverter.ConversionResults item;
    private String strCubicmeter = null;
    private String strCubicfoot = null;
    private String strCubicinch = null;
    private String strBoardfeet = null;
    private  String strThousandboardfeet = null;
    private String strCord = null;
    private String strCord80cubicft = null;

    private String strCordfeet = null;
    private String strCunit = null;
    private String strPallet = null;
    private  String strCrosstie = null;
    private  String strSwitchtie = null;
    private String strThousandsquarefeet1of8inch = null;

    private String strThousandsquarefeet1of4inch = null;
    private String strThousandsquarefeet3of8inch = null;
    private  String strThousandsquarefeet1of2inch = null;
    private String strThousandsquarefeet3of4inch = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);

        //customize toolbar
      /*  android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);*/
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#e65f21")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Volume Lumber");

        formatsetting();

        MobileAds.initialize(VolumeLumberConverterActivity.this, getString(R.string.ads_app_id));
        AdView mAdView = (AdView) findViewById(R.id.adViewUnitConverter);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //initalization of tools and variables
        spinnerConvertFrom = (Spinner) findViewById(R.id.spinnerConvertFrom);
        spinnerConvertTo = (Spinner) findViewById(R.id.spinnerConvertTo);
        textViewBasicUnit = (TextView) findViewById(R.id.textViewBasicUnit);
        textViewConvert=(TextView) findViewById(R.id.buttonUnitConverter);
        textViewAllUnit = (TextView) findViewById(R.id.textViewAllUnit);
        editTextValue = (EditText) findViewById(R.id.edittextFrom);
        editTextValueTo = (EditText) findViewById(R.id.edittextTo);
        buttonCopy = (FloatingActionButton) findViewById(R.id.button_copy);
        buttonList = (FloatingActionButton) findViewById(R.id.button_list_fullreport);
        buttonShare = (FloatingActionButton) findViewById(R.id.button_list_share);
        buttonMail = (FloatingActionButton) findViewById(R.id.button_list_mail);
        switchChangeType = (SwitchCompat) findViewById(R.id.switchButton);

        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedishyellow)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedishyellow)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedishyellow)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedishyellow)));
        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()),ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedishyellow)));


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textViewConvert.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedishyellow)));
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#a02a00"));
        }


        textViewBasicUnit.setText(String.valueOf("Basic Units(" + basicunit + ")"));
        textViewAllUnit.setText(String.valueOf("All Units(" + allunit + ")"));


        //adding value to spinner
        listLinearChargeFirstfrom = new ArrayList<String>();
        listLinearChargeFirsttempTo = new ArrayList<String>();

        //for first time running spinner
        listLinearChargeFirstfrom.add("Cubic meter - m³");
        listLinearChargeFirstfrom.add("Cubic foot - ft³");
        listLinearChargeFirstfrom.add("Cubic inch - in³");
        listLinearChargeFirstfrom.add("Board feet - boardfeet");
        //for first time running spinner
        listLinearChargeFirsttempTo.add("Cubic meter - m³");
        listLinearChargeFirsttempTo.add("Cubic foot - ft³");
        listLinearChargeFirsttempTo.add("Cubic inch - in³");
        listLinearChargeFirsttempTo.add("Board feet - boardfeet");
        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(VolumeLumberConverterActivity.this, android.R.layout.simple_spinner_item, listLinearChargeFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(VolumeLumberConverterActivity.this, android.R.layout.simple_spinner_item, listLinearChargeFirsttempTo);


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

                listLinearChargefrom = new ArrayList<String>();
                listLinearChargeTo = new ArrayList<String>();
                String stringSwitchSate = String.valueOf(isChecked);
                String strBasic = "Basic";
                String strAdvance = "All";
                switch (stringSwitchSate) {

                    case "false":
                        Snackbar.make(buttonView, "You switched to " + strBasic + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listLinearChargefrom.clear();
                        listLinearChargeTo.clear();

                        //for first time running spinner
                        listLinearChargefrom.add("Cubic meter - m³");
                        listLinearChargefrom.add("Cubic foot - ft³");
                        listLinearChargefrom.add("Cubic inch - in³");
                        listLinearChargefrom.add("Board feet - boardfeet");
                        //for first time running spinner



                        listLinearChargeTo.add("Cubic meter - m³");
                        listLinearChargeTo.add("Cubic foot - ft³");
                        listLinearChargeTo.add("Cubic inch - in³");
                        listLinearChargeTo.add("Board feet - boardfeet");

                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strAdvance + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listLinearChargefrom.clear();
                        listLinearChargeTo.clear();

                        //for first  running spinner

                        listLinearChargefrom.add("Cubic meter - m³");
                        listLinearChargefrom.add("Cubic foot - ft³");
                        listLinearChargefrom.add("Cubic inch - in³");
                        listLinearChargefrom.add("Board feet - boardfeet");
                        listLinearChargefrom.add("Thousand board feet - thousand board feet");
                        listLinearChargefrom.add("Cord - cord");
                        listLinearChargefrom.add("Cord(80 cubic ft) - cord");
                        listLinearChargefrom.add("Cord feet - cordfeet");
                        listLinearChargefrom.add("Cunit - cunit");
                        listLinearChargefrom.add("Pallet - pallet");
                        listLinearChargefrom.add("Cross tie - crosstie");
                        listLinearChargefrom.add("Switch tie - switchtie");
                        listLinearChargefrom.add("Thousand square feet (1/8inch panels) - ft²");
                        listLinearChargefrom.add("Thousand square feet (1/4inch panels) - ft²");
                        listLinearChargefrom.add("Thousand square feet (3/8inch panels) - ft²");
                        listLinearChargefrom.add("Thousand square feet (1/2inch panels) - ft²");
                        listLinearChargefrom.add("Thousand square feet (3/4inch panels) - ft²");


                        //for second running spinner
                        listLinearChargeTo.add("Cubic meter - m³");
                        listLinearChargeTo.add("Cubic foot - ft³");
                        listLinearChargeTo.add("Cubic inch - in³");
                        listLinearChargeTo.add("Board feet - boardfeet");
                        listLinearChargeTo.add("Thousand board feet - thousand board feet");
                        listLinearChargeTo.add("Cord - cord");
                        listLinearChargeTo.add("Cord(80 cubic ft) - cord");
                        listLinearChargeTo.add("Cord feet - cordfeet");
                        listLinearChargeTo.add("Cunit - cunit");
                        listLinearChargeTo.add("Pallet - pallet");
                        listLinearChargeTo.add("Cross tie - crosstie");
                        listLinearChargeTo.add("Switch tie - switchtie");

                        listLinearChargeTo.add("Thousand square feet (1/8inch panels) - ft²");
                        listLinearChargeTo.add("Thousand square feet (1/4inch panels) - ft²");
                        listLinearChargeTo.add("Thousand square feet (3/8inch panels) - ft²");
                        listLinearChargeTo.add("Thousand square feet (1/2inch panels) - ft²");
                        listLinearChargeTo.add("Thousand square feet (3/4inch panels) - ft²");

                        break;



                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(VolumeLumberConverterActivity.this, android.R.layout.simple_spinner_item, listLinearChargefrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(VolumeLumberConverterActivity.this, android.R.layout.simple_spinner_item, listLinearChargeTo);


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
                Intent i = new Intent(this,VolumeLumberListActivity.class);
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

            //   Toast.makeText(this, "string12" + stringSpinnerFrom + "\n string13" + stringSpinnerTo + "string14" + doubleEdittextvalue, Toast.LENGTH_LONG).show();
        } catch (NumberFormatException e) {
            doubleEdittextvalue = 0;

        }


    }

    public void calcualteValue(String strSpinnerFromvalue1, String strSpinnerTovalue2, double doubleEdittextvalue1) {



        try {

            VolumeLumberConverter c = new VolumeLumberConverter(strSpinnerFromvalue1, (int) doubleEdittextvalue1);
            ArrayList<VolumeLumberConverter.ConversionResults> results = c.calculateVolumeLumberConversions();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);

                strCubicmeter = String.valueOf(formatter.format(item.getCubicmeter()));
                strCubicfoot =String.valueOf(formatter.format(item.getCubicfoot()));
                strCubicinch =String.valueOf(formatter.format(item.getCubicinch()));
                strBoardfeet =String.valueOf(formatter.format(item.getBoardfeet()));
                strThousandboardfeet = String.valueOf(formatter.format(item.getThousandboardfeet()));
                strCord =String.valueOf(formatter.format(item.getCord()));
                strCord80cubicft = String.valueOf(formatter.format(item.getCord80cubicft()));
                strCordfeet =String.valueOf(formatter.format(item.getCordfeet()));
                strCunit =String.valueOf(formatter.format(item.getCunit()));
                strPallet =String.valueOf(formatter.format(item.getPallet()));
                strCrosstie =String.valueOf(formatter.format(item.getCrosstie()));
                strSwitchtie = String.valueOf(formatter.format(item.getSwitchtie()));
                strThousandsquarefeet1of8inch =String.valueOf(formatter.format(item.getThousandsquarefeet1of8inch()));
                strThousandsquarefeet1of4inch = String.valueOf(formatter.format(item.getThousandsquarefeet1of4inch()));
                strThousandsquarefeet3of8inch =String.valueOf(formatter.format(item.getThousandsquarefeet3of8inch()));
                strThousandsquarefeet1of2inch =String.valueOf(formatter.format(item.getThousandsquarefeet1of2inch()));
                strThousandsquarefeet3of4inch =String.valueOf(formatter.format(item.getThousandsquarefeet3of4inch()));



                switch (strSpinnerFromvalue1) {
                    case "Cubic meter - m³":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cubic foot - ft³":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Cubic inch - in³":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Board feet - boardfeet" :
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Thousand board feet - thousand board feet":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cord - cord":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cord(80 cubic ft) - cord":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cord feet - cordfeet":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cunit - cunit" :
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Pallet - pallet":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cross tie - crosstie":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Switch tie - switchtie":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Thousand square feet (1/8inch panels) - ft²" :
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Thousand square feet (1/4inch panels) - ft²":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Thousand square feet (3/8inch panels) - ft²":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Thousand square feet (1/2inch panels) - ft²":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Thousand square feet (3/4inch panels) - ft²" :
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


            case "Cubic meter - m³":
                editTextValueTo.setText(strCubicmeter);
                break;
            case "Cubic foot - ft³":
                editTextValueTo.setText(strCubicfoot);
                break;

            case "Cubic inch - in³":
                editTextValueTo.setText(strCubicinch);
                break;
            case "Board feet - boardfeet" :
                editTextValueTo.setText(strBoardfeet);
                break;
            case "Thousand board feet - thousand board feet":
                editTextValueTo.setText(strThousandboardfeet);
                break;
            case "Cord - cord":
                editTextValueTo.setText(strCord);
                break;
            case "Cord(80 cubic ft) - cord":
                editTextValueTo.setText(strCord80cubicft);
                break;
            case "Cord feet - cordfeet":
                editTextValueTo.setText(strCordfeet);
                break;
            case "Cunit - cunit" :
                editTextValueTo.setText(strCunit);
                break;

            case "Pallet - pallet":
                editTextValueTo.setText(strPallet);
                break;
            case "Cross tie - crosstie":
                editTextValueTo.setText(strCrosstie);
                break;
            case "Switch tie - switchtie":
                editTextValueTo.setText(strSwitchtie);
                break;
            case "Thousand square feet (1/8inch panels) - ft²" :
                editTextValueTo.setText(strThousandsquarefeet1of8inch);
                break;
            case "Thousand square feet (1/4inch panels) - ft²":
                editTextValueTo.setText(strThousandsquarefeet1of4inch);
                break;

            case "Thousand square feet (3/8inch panels) - ft²":
                editTextValueTo.setText(strThousandsquarefeet3of8inch);
                break;
            case "Thousand square feet (1/2inch panels) - ft²":
                editTextValueTo.setText(strThousandsquarefeet1of2inch);
                break;

            case "Thousand square feet (3/4inch panels) - ft²" :
                editTextValueTo.setText(strThousandsquarefeet3of4inch);
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