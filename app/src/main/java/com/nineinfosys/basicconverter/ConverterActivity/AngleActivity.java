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
import com.nineinfosys.basicconverter.ConverterActivityList.ConversionAngleListActivity;
import com.nineinfosys.basicconverter.Engin.AngleConverter;

import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class AngleActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher {


    //declaration of designing tools
    private Spinner spinnerConvertFrom, spinnerConvertTo;
    private EditText editTextValue, editTextValueTo;
    private FloatingActionButton buttonList, buttonShare, buttonMail, buttonCopy;
    private SwitchCompat switchChangeType;
    private List<String> listangleFirstfrom, listFirstangleTo, listanglefrom, listangleTo;
    private String stringSpinnerFrom, stringSpinnerTo;
    private TextView textViewBasicUnit, textViewAllUnit, textViewConvert;
    double doubleEdittextvalue = 1.0;
    private int basicunit = 3;
    private int allunit = 14;
    private DecimalFormat formatter = null;
    private static final int REQUEST_CODE = 100;

    AngleConverter.ConversionResults item;
    private String strDegree = null;
    private String strRadian = null;
    private String strGradian = null;
    private String strMinute = null;
    private String strSecond = null;
    private String strGon = null;
    private String strSign = null;
    private String strMil = null;
    private String strRevolution = null;
    private String strCircle = null;
    private String strTurn = null;
    private String strQuadrant = null;
    private String strRightangle = null;
    private String strSextant = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);


        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#a05445")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Angle");

        formatsetting();

        MobileAds.initialize(AngleActivity.this, getString(R.string.ads_app_id));
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
        textViewConvert = (TextView) findViewById(R.id.buttonUnitConverter);
        editTextValue = (EditText) findViewById(R.id.edittextFrom);
        editTextValueTo = (EditText) findViewById(R.id.edittextTo);
        buttonCopy = (FloatingActionButton) findViewById(R.id.button_copy);
        buttonList = (FloatingActionButton) findViewById(R.id.button_list_fullreport);
        buttonShare = (FloatingActionButton) findViewById(R.id.button_list_share);
        buttonMail = (FloatingActionButton) findViewById(R.id.button_list_mail);
        switchChangeType = (SwitchCompat) findViewById(R.id.switchButton);

        //changing color dynamically
        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorBrown)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorBrown)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorBrown)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorBrown)));

        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()), ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorBrown)));
        // DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getTrackDrawable()), ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRed)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textViewConvert.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorBrown)));
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#6e291d"));
        }

        textViewBasicUnit.setText(String.valueOf("Basic Units(" + basicunit + ")"));
        textViewAllUnit.setText(String.valueOf("All Units(" + allunit + ")"));


        //adding value to spinner
        listangleFirstfrom = new ArrayList<String>();
        listFirstangleTo = new ArrayList<String>();


        //for first time running spinner
        listangleFirstfrom.add("Degree - °");
        listangleFirstfrom.add("Radian - rad");
        listangleFirstfrom.add("Grad - ^g");


        listFirstangleTo.add("Degree - °");
        listFirstangleTo.add("Radian - rad");
        listFirstangleTo.add("Grad - ^g");

        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(AngleActivity.this, android.R.layout.simple_spinner_item, listangleFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(AngleActivity.this, android.R.layout.simple_spinner_item, listFirstangleTo);


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

                listanglefrom = new ArrayList<String>();
                listangleTo = new ArrayList<String>();
                String stringSwitchSate = String.valueOf(isChecked);
                String strBasic = "Basic";
                String strAdvance = "All";
                switch (stringSwitchSate) {

                    case "false":
                        Snackbar.make(buttonView, "You switched to " + strBasic + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listanglefrom.clear();
                        listangleTo.clear();
                        listanglefrom.add("Degree - °");
                        listanglefrom.add("Radian - rad");
                        listanglefrom.add("Grad - ^g");

                        //2 spinner
                        listangleTo.add("Degree - °");
                        listangleTo.add("Radian - rad");
                        listangleTo.add("Grad - ^g");
                        break;

                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strAdvance + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listanglefrom.clear();
                        listangleTo.clear();
                        listanglefrom.add("Degree - °");
                        listanglefrom.add("Radian - rad");
                        listanglefrom.add("Grad - ^g");
                        listanglefrom.add("Minute - '");
                        listanglefrom.add("Second -  ″ ");
                        listanglefrom.add("Gon - gon");
                        listanglefrom.add("Sign - sign");
                        listanglefrom.add("Mil - mil");
                        listanglefrom.add("Revolution - r");
                        listanglefrom.add("Circle - ∅");
                        listanglefrom.add("Turn - turn");
                        listanglefrom.add("Quadrant - 90°");
                        listanglefrom.add("Right angle - 90°");
                        listanglefrom.add("Sextant - 60°");

                        //second spinner
                        listangleTo.add("Degree - °");
                        listangleTo.add("Radian - rad");
                        listangleTo.add("Grad - ^g");
                        listangleTo.add("Minute - '");
                        listangleTo.add("Second -  ″ ");
                        listangleTo.add("Gon - gon");
                        listangleTo.add("Sign - sign");
                        listangleTo.add("Mil - mil");
                        listangleTo.add("Revolution - r");
                        listangleTo.add("Circle - ∅");
                        listangleTo.add("Turn - turn");
                        listangleTo.add("Quadrant - 90°");
                        listangleTo.add("Right angle - 90°");
                        listangleTo.add("Sextant - 60°");


                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(AngleActivity.this, android.R.layout.simple_spinner_item, listanglefrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(AngleActivity.this, android.R.layout.simple_spinner_item, listangleTo);


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
                spinnerConvertTo.setSelection(spinner1Index);
                break;

            case R.id.button_list_fullreport:
                doubleEdittextvalue = Double.parseDouble(editTextValue.getText().toString().trim());
                Intent i = new Intent(this, ConversionAngleListActivity.class);
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

    private void calcualteValue(String strSpinnerFromvalue1, String strSpinnerTovalue2, double doubleEdittextvalue1) {

        try {

            AngleConverter c = new AngleConverter(strSpinnerFromvalue1, doubleEdittextvalue1);
            ArrayList<AngleConverter.ConversionResults> results = c.calculateAngleConversion();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);

                strDegree = String.valueOf(formatter.format(item.getDegree()));
                strRadian = String.valueOf(formatter.format(item.getRadian()));
                strGradian = String.valueOf(formatter.format(item.getGradian()));
                strMinute = String.valueOf(formatter.format(item.getMinute()));
                strSecond = String.valueOf(formatter.format(item.getSecond()));
                strGon = String.valueOf(formatter.format(item.getGon()));
                strSign = String.valueOf(formatter.format(item.getSign()));
                strMil = String.valueOf(formatter.format(item.getMil()));
                strRevolution = String.valueOf(formatter.format(item.getRevolution()));
                strCircle = String.valueOf(formatter.format(item.getCircle()));
                strTurn = String.valueOf(formatter.format(item.getTurn()));
                strQuadrant = String.valueOf(formatter.format(item.getQuadrant()));
                strRightangle = String.valueOf(formatter.format(item.getRightangle()));
                strSextant = String.valueOf(formatter.format(item.getSextant()));


                switch (strSpinnerFromvalue1) {
                    case "Degree - °":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Radian - rad":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Grad - ^g":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Minute - '":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Second -  ″ ":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gon - gon":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Sign - sign":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Mil - mil":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Revolution - r":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Circle - ∅":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Turn - turn":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Quadrant - 90°":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Right angle - 90°":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Sextant - 60°":
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
            case "Degree - °":
                editTextValueTo.setText(strDegree);
                break;
            case "Radian - rad":
                editTextValueTo.setText(strRadian);
                break;
            case "Grad - ^g":
                editTextValueTo.setText(strGradian);
                break;
            case "Minute - '":
                editTextValueTo.setText(strMinute);
                break;
            case "Second -  ″ ":
                editTextValueTo.setText(strSecond);
                break;
            case "Gon - gon":
                editTextValueTo.setText(strGon);
                break;
            case "Sign - sign":
                editTextValueTo.setText(strSign);
                break;
            case "Mil - mil":
                editTextValueTo.setText(strMil);
                break;
            case "Revolution - r":
                editTextValueTo.setText(strRevolution);
                break;
            case "Circle - ∅":
                editTextValueTo.setText(strCircle);
                break;
            case "Turn - turn":
                editTextValueTo.setText(strTurn);
                break;
            case "Quadrant - 90°":
                editTextValueTo.setText(strQuadrant);
                break;
            case "Right angle - 90°":
                editTextValueTo.setText(strRightangle);
                break;
            case "Sextant - 60°":
                editTextValueTo.setText(strSextant);
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