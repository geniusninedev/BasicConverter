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
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.nineinfosys.basicconverter.ConverterActivityList.ConversionPressureListAvtivity;
import com.nineinfosys.basicconverter.Engin.PressureConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PressureActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher {

    //declaration of designing tools
    private Spinner spinnerConvertFrom, spinnerConvertTo;
    private EditText editTextValue, editTextValueTo;
    Button buttonConvert;
    private FloatingActionButton buttonList, buttonShare, buttonMail, buttonCopy;
    private SwitchCompat switchChangeType;
    private List<String> listPressureFirsttempTo, listPressureFirstfrom,listpressureTo,listpressurefrom;
    private String stringSpinnerFrom, stringSpinnerTo;
    private TextView textViewBasicUnit, textViewAllUnit,textViewConvert;
    double doubleEdittextvalue = 1.0;
    private int basicunit = 12;
    private int allunit = 52;
    private  DecimalFormat formatter = null;
    private static final int REQUEST_CODE = 100;

    PressureConverter.ConversionResults item;
    private String strPascal = null;
    private String strKilopascal = null;
    private  String strBar = null;
    private String strPsi = null;
    private String strKsi = null;
    private String strStandardAtmosphere = null;
    private String strExapascal = null;
    private  String strPetapascal = null;
    private String strTerapascal = null;
    private String strGigaPascal = null;
    private String strMegapascal = null;
    private String strHectopascal = null;
    private String strDekapasal = null;
    private String strDecipasal = null;
    private String strCentipascal = null;
    private String strMilipascal = null;
    private String strMicropascal = null;
    private String strNanoPascal = null;

    private String strPicopascal = null;
    private String strFemtopascal = null;
    private String strAttopasal = null;
    private String strNewtonSmeter = null;
    private String strNewtonSCm = null;
    private String strNewtonSMm = null;
    private String strKilonewtonSmeter = null;
    private String strMillibar = null;
    private String strMicrobar = null;
    private String strDyneSCm = null;
    private String strKilogramforceSm = null;
    private String strKilogramforceSCm = null;
    private String strKilogramforceMm = null;
    private String stGramforceSCm = null;
    private String strTonforceshortfoot = null;
    private  String strTonforceshortinch = null;
    private String strTonforcelongfoot = null;

    private String strTonforcelonginch = null;
    private String strkipforceSinch = null;
    private String strPoundforceSfoot = null;
    private String strPoundforceSinch= null;
    private String strPoundalSfoot = null;
    private  String strTorr = null;
    private  String stCentimetermercury = null;
    private String strMillimetermercury = null;
    private String stInchmercury = null;
    private String strInchmercury60 = null;
    private String stCentimeterwater = null;
    private String strMillimeterwater = null;
    private  String strInchwater= null;
    private  String strfootwater = null;
    private   String strInchwater60= null;
    private   String strFootwater60 = null;
    private   String strAtmospheretechnical= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);

        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#757575")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Pressure ");

        formatsetting();

        MobileAds.initialize(PressureActivity.this, getString(R.string.ads_app_id));
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

        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorGray)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorGray)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorGray)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorGray)));
        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()),ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorGray)));


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textViewConvert.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorGray)));
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#707070"));
        }


        textViewBasicUnit.setText(String.valueOf("Basic Units(" + basicunit + ")"));
        textViewAllUnit.setText(String.valueOf("All Units(" + allunit + ")"));


        //adding value to spinner
        listPressureFirstfrom = new ArrayList<String>();
        listPressureFirsttempTo = new ArrayList<String>();

        //for first time running spinner
        listPressureFirstfrom.add("Pascal - Pa");
        listPressureFirstfrom.add("Kilopascal - kPa");
        listPressureFirstfrom.add("Bar - b");
        listPressureFirstfrom.add("Atmosphere - atm");
        listPressureFirstfrom.add("Hectopascal - hPa");
        listPressureFirstfrom.add("Millibar - mbar");
        listPressureFirstfrom.add("Millimeter Mercury");
        listPressureFirstfrom.add("Kilogram-force/square cm - kgf/cm²");
        listPressureFirstfrom.add("Kilogram-force/square meter - kgf/m²");
        listPressureFirstfrom.add("Pound-force/square foot - psf");
        listPressureFirstfrom.add("Pound-force/square inch - psi");
        listPressureFirstfrom.add("Torr - torr");

        //for first time running spinner
        listPressureFirsttempTo.add("Pascal - Pa");
        listPressureFirsttempTo.add("Kilopascal - kPa");
        listPressureFirsttempTo.add("Bar - b");
        listPressureFirsttempTo.add("Atmosphere - atm");
        listPressureFirsttempTo.add("Hectopascal - hPa");
        listPressureFirsttempTo.add("Millibar - mbar");
        listPressureFirsttempTo.add("Millimeter Mercury");
        listPressureFirsttempTo.add("Kilogram-force/square cm - kgf/cm²");
        listPressureFirsttempTo.add("Kilogram-force/square meter - kgf/m²");
        listPressureFirsttempTo.add("Pound-force/square foot - psf");
        listPressureFirsttempTo.add("Pound-force/square inch - psi");
        listPressureFirsttempTo.add("Torr - torr");

        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(PressureActivity.this, android.R.layout.simple_spinner_item, listPressureFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(PressureActivity.this, android.R.layout.simple_spinner_item, listPressureFirsttempTo);


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

                listpressurefrom = new ArrayList<String>();
                listpressureTo = new ArrayList<String>();
                String stringSwitchSate = String.valueOf(isChecked);
                String strBasic = "Basic";
                String strAdvance = "All";
                switch (stringSwitchSate) {

                    case "false":
                        Snackbar.make(buttonView, "You switched to " + strBasic + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listpressurefrom.clear();
                        listpressureTo.clear();

                        //for first time running spinner
                        listpressurefrom.add("Pascal - Pa");
                        listpressurefrom.add("Kilopascal - kPa");
                        listpressurefrom.add("bar - b");
                        listpressurefrom.add("Atmosphere - atm");
                        listpressurefrom.add("Hectopascal - hPa");
                        listpressurefrom.add("Millibar - mbar");
                        listpressurefrom.add("Millimeter Mercury");
                        listpressurefrom.add("Kilogram-force/square cm - kgf/cm²");
                        listpressurefrom.add("Kilogram-force/square meter - kgf/m²");
                        listpressurefrom.add("Pound-force/square foot - psf");
                        listpressurefrom.add("Pound-force/square inch - psi");
                        listpressurefrom.add("Torr - torr");

                        //for first time running spinner
                        listpressureTo.add("Pascal - Pa");
                        listpressureTo.add("Kilopascal - kPa");
                        listpressureTo.add("bar - b");
                        listpressureTo.add("Atmosphere - atm");
                        listpressureTo.add("Hectopascal - hPa");
                        listpressureTo.add("Millibar - mbar");
                        listpressureTo.add("Millimeter Mercury");
                        listpressureTo.add("Kilogram-force/square cm - kgf/cm²");
                        listpressureTo.add("Kilogram-force/square meter - kgf/m²");
                        listpressureTo.add("Pound-force/square foot - psf");
                        listpressureTo.add("Pound-force/square inch - psi");
                        listpressureTo.add("Torr - torr");
                        break;

                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strAdvance + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listpressurefrom.clear();
                        listpressureTo.clear();

                        //for first  running spinner
                        listpressurefrom.add("Pascal - Pa");
                        listpressurefrom.add("Kilopascal - kPa");
                        listpressurefrom.add("Bar - b");
                        listpressurefrom.add("Psi - psi");
                        listpressurefrom.add("Ksi - ksi");
                        listpressurefrom.add("Atmosphere - atm");
                        listpressurefrom.add("Exapascal - EPa");
                        listpressurefrom.add("Petapascal - PPa");
                        listpressurefrom.add("Terapascal - TPa");
                        listpressurefrom.add("Gigapascal - GPa");
                        listpressurefrom.add("Megapascal - MPa");
                        listpressurefrom.add("Hectopascal - hPa");
                        listpressurefrom.add("Deckapascal - daPa");
                        listpressurefrom.add("Decipascal - dPa");
                        listpressurefrom.add("Centipascal - cPa");
                        listpressurefrom.add("Millipascal - mPa");
                        listpressurefrom.add("Micropascal - μPa");
                        listpressurefrom.add("Nanopascal - nPa");
                        listpressurefrom.add("Picopascal - pPa");
                        listpressurefrom.add("Femtopascal - fPa");
                        listpressurefrom.add("Attopascal - aPa");
                        listpressurefrom.add("Newton/square meter - N/m²");
                        listpressurefrom.add("Newton/square centimeter - N/cm²");
                        listpressurefrom.add("Newton/square millimeter - N/mm²");
                        listpressurefrom.add("Kilonewton/square meter - kN/m²");
                        listpressurefrom.add("Millibar - mbar");
                        listpressurefrom.add("Microbar - μbar");
                        listpressurefrom.add("Dyne/square centimeter - dyn/cm²");
                        listpressurefrom.add("Kilogram-force/square meter - kgf/m²");
                        listpressurefrom.add("Kilogram-force/square cm - kgf/cm²");
                        listpressurefrom.add("Kilogram-force/square mm - kgf/mm²");
                        listpressurefrom.add("Gram-force/square cm - gf/cm²");
                        listpressurefrom.add("Ton-force(short)/sq. foot - tonf/ft²");
                        listpressurefrom.add("Ton-force(short)/sq. inch - tonf/in²");
                        listpressurefrom.add("Ton-force(long)/sq. foot - tonf/ft²");
                        listpressurefrom.add("Ton-force(long)/sq. inch - tonf/in²");
                        listpressurefrom.add("Kip-force/square inch - kipf/in²");
                        listpressurefrom.add("Pound-force/square foot - lbf/ft²");
                        listpressurefrom.add("Pound-force/square inch - lbf/in²");
                        listpressurefrom.add("Poundal/square foot - pdl/ft²");
                        listpressurefrom.add("Torr - torr");
                        listpressurefrom.add("Centimeter mercury(0°C) - cmHg");
                        listpressurefrom.add("Millimeter mercury(0°C) - mmHg");
                        listpressurefrom.add("Inch mercury(32°F) - inHg");
                        listpressurefrom.add("Centimeter water(4°C) - cmAq");
                        listpressurefrom.add("Millimeter water(4°C) - mmAq");
                        listpressurefrom.add("Inch water(4°C) - inAq");
                        listpressurefrom.add("Foot water(4°C) - ftAq");
                        listpressurefrom.add("Inch water(60°C) - inAq");
                        listpressurefrom.add("Foot water(60°C) - ftAq");
                        listpressurefrom.add("Atmosphere technical - at");


                        //for second running spinner
                        listpressureTo.add("Pascal - Pa");
                        listpressureTo.add("Kilopascal - kPa");
                        listpressureTo.add("Bar - b");
                        listpressureTo.add("Psi - psi");
                        listpressureTo.add("Ksi - ksi");
                        listpressureTo.add("Atmosphere - atm");
                        listpressureTo.add("Exapascal - EPa");
                        listpressureTo.add("Petapascal - PPa");
                        listpressureTo.add("Terapascal - TPa");
                        listpressureTo.add("Gigapascal - GPa");
                        listpressureTo.add("Megapascal - MPa");
                        listpressureTo.add("Hectopascal - hPa");
                        listpressureTo.add("Deckapascal - daPa");
                        listpressureTo.add("Decipascal - dPa");
                        listpressureTo.add("Centipascal - cPa");
                        listpressureTo.add("Millipascal - mPa");
                        listpressureTo.add("Micropascal - μPa");
                        listpressureTo.add("Nanopascal - nPa");
                        listpressureTo.add("Picopascal - pPa");
                        listpressureTo.add("Femtopascal - fPa");
                        listpressureTo.add("Attopascal - aPa");
                        listpressureTo.add("Newton/square meter - N/m²");
                        listpressureTo.add("Newton/square centimeter - N/cm²");
                        listpressureTo.add("Newton/square millimeter - N/mm²");
                        listpressureTo.add("Kilonewton/square meter - kN/m²");
                        listpressureTo.add("Millibar - mbar");
                        listpressureTo.add("Microbar - μbar");
                        listpressureTo.add("Dyne/square centimeter - dyn/cm²");
                        listpressureTo.add("Kilogram-force/square meter - kgf/m²");
                        listpressureTo.add("Kilogram-force/square cm - kgf/cm²");
                        listpressureTo.add("Kilogram-force/square mm - kgf/mm²");
                        listpressureTo.add("Gram-force/square cm - gf/cm²");
                        listpressureTo.add("Ton-force(short)/sq. foot - tonf/ft²");
                        listpressureTo.add("Ton-force(short)/sq. inch - tonf/in²");
                        listpressureTo.add("Ton-force(long)/sq. foot - tonf/ft²");
                        listpressureTo.add("Ton-force(long)/sq. inch - tonf/in²");
                        listpressureTo.add("Kip-force/square inch - kipf/in²");
                        listpressureTo.add("Pound-force/square foot - lbf/ft²");
                        listpressureTo.add("Pound-force/square inch - lbf/in²");
                        listpressureTo.add("Poundal/square foot - pdl/ft²");
                        listpressureTo.add("Torr - torr");
                        listpressureTo.add("Centimeter mercury(0°C) - cmHg");
                        listpressureTo.add("Millimeter mercury(0°C) - mmHg");
                        listpressureTo.add("Inch mercury(32°F) - inHg");
                        listpressureTo.add("Centimeter water(4°C) - cmAq");
                        listpressureTo.add("Millimeter water(4°C) - mmAq");
                        listpressureTo.add("Inch water(4°C) - inAq");
                        listpressureTo.add("Foot water(4°C) - ftAq");
                        listpressureTo.add("Inch water(60°C) - inAq");
                        listpressureTo.add("Foot water(60°C) - ftAq");
                        listpressureTo.add("Atmosphere technical - at");

                    break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(PressureActivity.this, android.R.layout.simple_spinner_item, listpressurefrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(PressureActivity.this, android.R.layout.simple_spinner_item, listpressureTo);


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
                Intent i = new Intent(this,ConversionPressureListAvtivity.class);
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

            PressureConverter c = new PressureConverter(strSpinnerFromvalue1, doubleEdittextvalue1);
            ArrayList<PressureConverter.ConversionResults> results = c.calculatePressureConversion();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);

                strPascal = String.valueOf(formatter.format(item.getPascal()));
                strKilopascal =String.valueOf(formatter.format(item.getKilopascal()));
                strBar =String.valueOf(formatter.format(item.getBar()));
                strPsi =String.valueOf(formatter.format(item.getPsi()));
                strKsi = String.valueOf(formatter.format(item.getKsi()));
                strStandardAtmosphere =String.valueOf(formatter.format(item.getAtmospherestandard()));
                strExapascal =String.valueOf(formatter.format(item.getExapascal()));
                strPetapascal =String.valueOf(formatter.format(item.getPetapascal()));
                strTerapascal = String.valueOf(formatter.format(item.getTerapascal()));
                strGigaPascal = String.valueOf(formatter.format(item.getGigapascal()));
                strMegapascal =String.valueOf(formatter.format(item.getMegapascal()));
                strHectopascal = String.valueOf(formatter.format(item.getHectopascal()));
                strDekapasal = String.valueOf(formatter.format(item.getDekapascal()));
                strDecipasal =String.valueOf(formatter.format(item.getDecipascal()));
                strCentipascal =String.valueOf(formatter.format(item.getCentipascal()));
                strMilipascal = String.valueOf(formatter.format(item.getMilipascal()));
                strMicropascal = String.valueOf(formatter.format(item.getMicropascal()));
                strNanoPascal = String.valueOf(formatter.format(item.getNanopascal()));

                 strPicopascal = String.valueOf(formatter.format(item.getPicopascal()));
                 strFemtopascal = String.valueOf(formatter.format(item.getFemtopascal()));
                 strAttopasal = String.valueOf(formatter.format(item.getAttopascal()));
                 strNewtonSmeter = String.valueOf(formatter.format(item.getNewtonsm()));
                 strNewtonSCm = String.valueOf(formatter.format(item.getNewtonscm()));
                 strNewtonSMm = String.valueOf(formatter.format(item.getNewtonsmm()));
                 strKilonewtonSmeter =String.valueOf(formatter.format(item.getKilonewtonsm()));
                 strMillibar =String.valueOf(formatter.format(item.getMbar()));
                 strMicrobar = String.valueOf(formatter.format(item.getMicrobar()));
                 strDyneSCm = String.valueOf(formatter.format(item.getDynescm()));
                 strKilogramforceSm = String.valueOf(formatter.format(item.getKilogramforcesm()));
                 strKilogramforceSCm = String.valueOf(formatter.format(item.getKilometerforcescm()));
                 strKilogramforceMm = String.valueOf(formatter.format(item.getKilometersmm()));
                 stGramforceSCm =String.valueOf(formatter.format(item.getGramforcescm()));
                 strTonforceshortfoot = String.valueOf(formatter.format(item.getTonforceshortsfoot()));
                 strTonforceshortinch = String.valueOf(formatter.format(item.getTonforceshortsinch()));
                 strTonforcelongfoot = String.valueOf(formatter.format(item.getTonforcelongsfoot()));

                 strTonforcelonginch = String.valueOf(formatter.format(item.getTonforcelongsinch()));
                 strkipforceSinch = String.valueOf(formatter.format(item.getKipforcesinch()));
                 strPoundforceSfoot = String.valueOf(formatter.format(item.getPoundforcesinch()));
                 strPoundforceSinch= String.valueOf(formatter.format(item.getPoundforcesinch()));
                 strPoundalSfoot = String.valueOf(formatter.format(item.getPoundalsfoot()));
                 strTorr = String.valueOf(formatter.format(item.getTorr()));
                 stCentimetermercury = String.valueOf(formatter.format(item.getCmmercury()));
                 strMillimetermercury = String.valueOf(formatter.format(item.getMilimeterofmercury()));
                 stInchmercury = String.valueOf(formatter.format(item.getInchmercury()));
                 //strInchmercury60 = String.valueOf(formatter.format(item.getCelsius()));
                 stCentimeterwater = String.valueOf(formatter.format(item.getCmwater()));
                 strMillimeterwater = String.valueOf(formatter.format(item.getMmwater()));
                 strInchwater= String.valueOf(formatter.format(item.getInchwaterc()));
                 strfootwater = String.valueOf(formatter.format(item.getFootwaterc()));
                 strInchwater60= String.valueOf(formatter.format(item.getInchwaterf()));
                 strFootwater60 = String.valueOf(formatter.format(item.getFootwaterf()));
                 strAtmospheretechnical= String.valueOf(formatter.format(item.getAtomspheretechnical()));



                switch (strSpinnerFromvalue1) {
                    case "Pascal - Pa":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilopascal - kPa":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Bar - b":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Psi - psi":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ksi - ksi":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Atmosphere - atm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Exapascal - EPa":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Petapascal - PPa":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Terapascal - TPa":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gigapascal - GPa":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Megapascal - MPa":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Hectopascal - hPa":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Deckapascal - daPa":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Decipascal - dPa":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Centipascal - cPa":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Millipascal - mPa":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Micropascal - μPa":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Nanopascal - nPa":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Picopascal - pPa":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Femtopascal - fPa":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Attopascal - aPa":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Newton/square meter - N/m²":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Newton/square centimeter - N/cm²":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Newton/square millimeter - N/mm²":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Kilonewton/square meter - kN/m²":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Millibar - mbar":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Microbar - μbar":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Dyne/square centimeter - dyn/cm²":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Kilogram-force/square meter - kgf/m²":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilogram-force/square cm - kgf/cm²":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Kilogram-force/square mm - kgf/mm²":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gram-force/square cm - gf/cm²":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Ton-force(short)/sq. foot - tonf/ft²":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ton-force(short)/sq. inch - tonf/in²":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Ton-force(long)/sq. foot - tonf/ft²":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ton-force(long)/sq. inch - tonf/in²":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Kip-force/square inch - kipf/in²":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound-force/square foot - lbf/ft²":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Pound-force/square inch - lbf/in²":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Poundal/square foot - pdl/ft²":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Torr - torr":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Centimeter mercury(0°C) - cmHg":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Millimeter mercury(0°C) - mmHg":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Inch mercury(32°F) - inHg":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Centimeter water(4°C) - cmAq":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Millimeter water(4°C) - mmAq":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Inch water(4°C) - inAq":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Foot water(4°C) - ftAq":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Inch water(60°C) - inAq":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Foot water(60°C) - ftAq":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Atmosphere technical - at":
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
            case "Pascal - Pa":
                editTextValueTo.setText(strPascal);
                break;
            case "Kilopascal - kPa":
                editTextValueTo.setText(strKilopascal);
                break;
            case "Bar - b":
                editTextValueTo.setText(strBar);
                break;
            case "Psi - psi":
                editTextValueTo.setText(strPsi);
                break;
            case "Ksi - ksi":
                editTextValueTo.setText(strKsi);
                break;
            case "Atmosphere - atm":
                editTextValueTo.setText(strStandardAtmosphere);
                break;
            case "Exapascal - EPa":
                editTextValueTo.setText(strExapascal);
                break;
            case "Petapascal - PPa":
                editTextValueTo.setText(strPetapascal);
                break;
            case "Terapascal - TPa":
                editTextValueTo.setText(strTerapascal);
                break;
            case "Gigapascal - GPa":
                editTextValueTo.setText(strGigaPascal);
                break;
            case "Megapascal - MPa":
                editTextValueTo.setText(strMegapascal);
                break;
            case "Hectopascal - hPa":
                editTextValueTo.setText(strHectopascal);
                break;
            case "Deckapascal - daPa":
                editTextValueTo.setText(strDekapasal);
                break;
            case "Decipascal - dPa":
                editTextValueTo.setText(strDecipasal);
                break;
            case "Centipascal - cPa":
                editTextValueTo.setText(strCentipascal);
                break;
            case "Millipascal - mPa":
                editTextValueTo.setText(strMilipascal);
                break;

            case "Micropascal - μPa":
                editTextValueTo.setText(strMicropascal);
                break;
            case "Nanopascal - nPa":
                editTextValueTo.setText(strNanoPascal);
                break;

            case "Picopascal - pPa":
                editTextValueTo.setText(strPicopascal);
                break;
            case "Femtopascal - fPa":
                editTextValueTo.setText(strFemtopascal);
                break;
            case "Attopascal - aPa":
                editTextValueTo.setText(strAttopasal);
                break;
            case "Newton/square meter - N/m²":
                editTextValueTo.setText(strNewtonSmeter);
                break;
            case "Newton/square centimeter - N/cm²":
                editTextValueTo.setText(strNewtonSCm);
                break;

            case "Newton/square millimeter - N/mm²":
                editTextValueTo.setText(strNewtonSMm);
                break;
            case "Kilonewton/square meter - kN/m²":
                editTextValueTo.setText(strKilonewtonSmeter);
                break;
            case "Millibar - mbar":
                editTextValueTo.setText(strMillibar);
                break;
            case "Microbar - μbar":
                editTextValueTo.setText(strMicrobar);
                break;
            case "Dyne/square centimeter - dyn/cm²":
                editTextValueTo.setText(strDyneSCm);
                break;
            case "Kilogram-force/square meter - kgf/m²":
                editTextValueTo.setText(strKilogramforceSm);
                break;

            case "Kilogram-force/square cm - kgf/cm²":
                editTextValueTo.setText(strKilogramforceSCm);
                break;
            case "Kilogram-force/square mm - kgf/mm²":
                editTextValueTo.setText(strKilogramforceMm);
                break;
            case "Gram-force/square cm - gf/cm²":
                editTextValueTo.setText(stGramforceSCm);
                break;
            case "Ton-force(short)/sq. foot - tonf/ft²":
                editTextValueTo.setText(strTonforceshortfoot);
                break;
            case "Ton-force(short)/sq. inch - tonf/in²":
                editTextValueTo.setText(strTonforceshortinch);
                break;
            case "Ton-force(long)/sq. foot - tonf/ft²":
                editTextValueTo.setText(strTonforcelongfoot);
                break;

            case "Ton-force(long)/sq. inch - tonf/in²":
                editTextValueTo.setText(strTonforcelonginch);
                break;

            case "Kip-force/square inch - kipf/in²":
                editTextValueTo.setText(strkipforceSinch);
                break;
            case "Pound-force/square foot - lbf/ft²":
                editTextValueTo.setText(strPoundforceSfoot);
                break;
            case "Pound-force/square inch - lbf/in²":
                editTextValueTo.setText(strPoundforceSinch);
                break;
            case "Poundal/square foot - pdl/ft²":
                editTextValueTo.setText(strPoundalSfoot);
                break;
            case "Torr - torr":
                editTextValueTo.setText(strTorr);
                break;
            case "Centimeter mercury(0°C) - cmHg":
                editTextValueTo.setText(stCentimetermercury);
                break;

            case "Millimeter mercury(0°C) - mmHg":
                editTextValueTo.setText(strMillimetermercury);
                break;
            case "Inch mercury(32°F) - inHg":
                editTextValueTo.setText(stInchmercury);
                break;
            case "Centimeter water(4°C) - cmAq":
                editTextValueTo.setText(stCentimeterwater);
                break;
            case "Millimeter water(4°C) - mmAq":
                editTextValueTo.setText(strMillimeterwater);
                break;
            case "Inch water(4°C) - inAq":
                editTextValueTo.setText(strInchwater);
                break;
            case "Foot water(4°C) - ftAq":
                editTextValueTo.setText(strfootwater);
                break;
            case "Inch water(60°C) - inAq":
                editTextValueTo.setText(strInchwater60);
                break;
            case "Foot water(60°C) - ftAq":
                editTextValueTo.setText(strFootwater60);
                break;
            case "Atmosphere technical - at":
                editTextValueTo.setText(strAtmospheretechnical);
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