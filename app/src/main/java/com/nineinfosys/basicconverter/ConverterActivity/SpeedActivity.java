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
import com.nineinfosys.basicconverter.ConverterActivityList.ConversionSpeedListActivity;
import com.nineinfosys.basicconverter.Engin.SpeedConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class SpeedActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher {


    //declaration of designing tools
    private Spinner spinnerConvertFrom, spinnerConvertTo;
    private EditText editTextValue, editTextValueTo;
    private FloatingActionButton buttonList, buttonShare, buttonMail, buttonCopy;
    private SwitchCompat switchChangeType;
    private List<String> listtempFirstfrom, listFirsttempTo, listtempfrom, listtempTo;
    private String stringSpinnerFrom, stringSpinnerTo;
    private TextView textViewBasicUnit, textViewAllUnit,textViewConvert;
    double doubleEdittextvalue = 1.0;
    private int basicunit = 9;
    private int allunit = 32;
    private DecimalFormat formatter = null;
    private static final int REQUEST_CODE = 100;

    
    SpeedConverter.ConversionResults item;
     private String strMetersecond = null, strKilometerhour = null, strMilehour = null, strMeterhour = null, strMeterminute = null, strKilometerminute = null, strKilometersecond = null, strCentimeterhour= null,
            strCentimeterminute= null, strCentimetersecond= null, strMillimeterhour= null, strMillimeterminute= null, strMillimetersecond= null, strFoothour= null, strFootminute= null, strFootsecond= null,
            strYardhour= null, strYardminute= null, strYardsecond= null, strMileminute= null, strMilesecond= null, strKnot= null, strKnotUK= null, strVelocityoflightinvacuum= null,
            strCosmicvelocityfirsthom= null, strCosmicvelocitysecondcosmic= null, strCosmicvelocitythirdcosmic= null, strEarthsvelocityearth= null, strVelocityofsoundinpurewater= null,
            strVelocityofsoundinseawater= null, strMach= null, strMachSIstandard= null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);


        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#48e2be")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Speed");

        formatsetting();


        MobileAds.initialize(SpeedActivity.this, getString(R.string.ads_app_id));
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
        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightGreen)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightGreen)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightGreen)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightGreen)));

        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()),ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightGreen)));
       // DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getTrackDrawable()), ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRed)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textViewConvert.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightGreen)));
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#00af8e"));
        }

        textViewBasicUnit.setText(String.valueOf("Basic Units(" + basicunit + ")"));
        textViewAllUnit.setText(String.valueOf("All Units(" + allunit + ")"));


        //adding value to spinner
        listtempFirstfrom = new ArrayList<String>();
        listFirsttempTo = new ArrayList<String>();


        //for first time running spinner
        listtempFirstfrom.add("Kilometer/hour - km/h");
        listtempFirstfrom.add("Mile/hour - mi/h");
        listtempFirstfrom.add("Meter/second - m/s");
        listtempFirstfrom.add("Knot - knots");
        listtempFirstfrom.add("Mach - mach");
        listtempFirstfrom.add("Yard/second - yd/s");
        listtempFirstfrom.add("Foot/second - ft/s");
        listtempFirstfrom.add("Meter/hour - m/h");
        listtempFirstfrom.add("Velocity of light in vacuum - c");

        //for first time running spinner
        listFirsttempTo.add("Kilometer/hour - km/h");
        listFirsttempTo.add("Mile/hour - mi/h");
        listFirsttempTo.add("Meter/second - m/s");
        listFirsttempTo.add("Knot - knots");
        listFirsttempTo.add("Mach - mach");
        listFirsttempTo.add("Yard/second - yd/s");
        listFirsttempTo.add("Foot/second - ft/s");
        listFirsttempTo.add("Meter/hour - m/h");
        listFirsttempTo.add("Velocity of light in vacuum - c");

        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(SpeedActivity.this, android.R.layout.simple_spinner_item, listtempFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(SpeedActivity.this, android.R.layout.simple_spinner_item, listFirsttempTo);


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

                listtempfrom = new ArrayList<String>();
                listtempTo = new ArrayList<String>();
                String stringSwitchSate = String.valueOf(isChecked);
                String strBasic = "Basic";
                String strAdvance = "All";
                switch (stringSwitchSate) {

                    case "false":
                        Snackbar.make(buttonView, "You switched to " + strBasic + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listtempfrom.clear();
                        listtempTo.clear();
                        listtempfrom.add("Kilometer/hour - km/h");
                        listtempfrom.add("Mile/hour - mi/h");
                        listtempfrom.add("Meter/second - m/s");
                        listtempfrom.add("Knot - knots");
                        listtempfrom.add("Mach - mach");
                        listtempfrom.add("Yard/second - yd/s");
                        listtempfrom.add("Foot/second - ft/s");
                        listtempfrom.add("Meter/hour - m/h");
                        listtempfrom.add("Velocity of light in vacuum - c");

                        //2 spinner
                        listtempTo.add("Kilometer/hour - km/h");
                        listtempTo.add("Mile/hour - mi/h");
                        listtempTo.add("Meter/second - m/s");
                        listtempTo.add("Knot - knots");
                        listtempTo.add("Mach - mach");
                        listtempTo.add("Yard/second - yd/s");
                        listtempTo.add("Foot/second - ft/s");
                        listtempTo.add("Meter/hour - m/h");
                        listtempTo.add("Velocity of light in vacuum - c");
                        break;

                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strAdvance + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listtempfrom.clear();
                        listtempTo.clear();
                        listtempfrom.add("Meter/second - m/s");
                        listtempfrom.add("Kilometer/hour - km/h");
                        listtempfrom.add("Mile/hour - mi/h");
                        listtempfrom.add("Meter/hour - m/h");
                        listtempfrom.add("Meter/minute - m/min");
                        listtempfrom.add("Kilometer/minute - km/min");
                        listtempfrom.add("Kilometer/second - km/s");
                        listtempfrom.add("Centimeter/hour - cm/h");
                        listtempfrom.add("Centimeter/minute - cm/min");
                        listtempfrom.add("Centimeter/second - cm/s");
                        listtempfrom.add("Millimeter/hour - mm/h");
                        listtempfrom.add("Millimeter/minute - mm/min");
                        listtempfrom.add("Millimeter/second - mm/s");
                        listtempfrom.add("Foot/hour - ft/h");
                        listtempfrom.add("Foot/minute - ft/min");
                        listtempfrom.add("Foot/second - ft/s");
                        listtempfrom.add("Yard/hour - yd/h");
                        listtempfrom.add("Yard/minute - yd/min");
                        listtempfrom.add("Yard/second - yd/s");
                        listtempfrom.add("Mile/minute - mi/min");
                        listtempfrom.add("Mile/second - mi/s");
                        listtempfrom.add("Knot - knots");
                        listtempfrom.add("Knot (UK) - knots(UK)");
                        listtempfrom.add("Velocity of light in vacuum - c");
                        listtempfrom.add("Cosmic velocity - first - hom");
                        listtempfrom.add("Cosmic velocity - second - cosmic");
                        listtempfrom.add("Cosmic velocity - third - cosmic");
                        listtempfrom.add("Earth's velocity - earth");
                        listtempfrom.add("Velocity of sound in pure water - sound");
                        listtempfrom.add("Velocity of sound in sea water - sound");
                        listtempfrom.add("Mach - mach");
                        listtempfrom.add("Mach (SI standard) - mach");


                        //second spinner
                        listtempTo.add("Meter/second - m/s");
                        listtempTo.add("Kilometer/hour - km/h");
                        listtempTo.add("Mile/hour - mi/h");
                        listtempTo.add("Meter/hour - m/h");
                        listtempTo.add("Meter/minute - m/min");
                        listtempTo.add("Kilometer/minute - km/min");
                        listtempTo.add("Kilometer/second - km/s");
                        listtempTo.add("Centimeter/hour - cm/h");
                        listtempTo.add("Centimeter/minute - cm/min");
                        listtempTo.add("Centimeter/second - cm/s");
                        listtempTo.add("Millimeter/hour - mm/h");
                        listtempTo.add("Millimeter/minute - mm/min");
                        listtempTo.add("Millimeter/second - mm/s");
                        listtempTo.add("Foot/hour - ft/h");
                        listtempTo.add("Foot/minute - ft/min");
                        listtempTo.add("Foot/second - ft/s");
                        listtempTo.add("Yard/hour - yd/h");
                        listtempTo.add("Yard/minute - yd/min");
                        listtempTo.add("Yard/second - yd/s");
                        listtempTo.add("Mile/minute - mi/min");
                        listtempTo.add("Mile/second - mi/s");
                        listtempTo.add("Knot - knots");
                        listtempTo.add("Knot (UK) - knots(UK)");
                        listtempTo.add("Velocity of light in vacuum - c");
                        listtempTo.add("Cosmic velocity - first - hom");
                        listtempTo.add("Cosmic velocity - second - cosmic");
                        listtempTo.add("Cosmic velocity - third - cosmic");
                        listtempTo.add("Earth's velocity - earth");
                        listtempTo.add("Velocity of sound in pure water - sound");
                        listtempTo.add("Velocity of sound in sea water - sound");
                        listtempTo.add("Mach - mach");
                        listtempTo.add("Mach (SI standard) - mach");

                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(SpeedActivity.this, android.R.layout.simple_spinner_item, listtempfrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(SpeedActivity.this, android.R.layout.simple_spinner_item, listtempTo);


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
                Intent i = new Intent(this, ConversionSpeedListActivity.class);
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

            SpeedConverter c = new SpeedConverter(strSpinnerFromvalue1, doubleEdittextvalue1);
            ArrayList<SpeedConverter.ConversionResults> results = c.calculateSpeedConversion();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);


                strMetersecond = String.valueOf(formatter.format(item.getMeterpersecond()));
                strMeterhour= String.valueOf(formatter.format(item.getMeterperhour()));
                strMilehour = String.valueOf(formatter.format(item.getMileperhour()));
                strKilometerhour  = String.valueOf(formatter.format(item.getKilometerperhour()));
                strMeterminute = String.valueOf(formatter.format(item.getMeterperminute()));
                strKilometerminute = String.valueOf(formatter.format(item.getKilometerpersecond()));
                strKilometersecond = String.valueOf(formatter.format(item.getKilometerpersecond()));
                strCentimeterhour = String.valueOf(formatter.format(item.getCentimeterperhour()));
                strCentimeterminute = String.valueOf(formatter.format(item.getCentimeterperminute()));
                strCentimetersecond = String.valueOf(formatter.format(item.getCentimeterpersecond()));
                strMillimeterhour = String.valueOf(formatter.format(item.getMillimeterperhour()));
                strMillimeterminute = String.valueOf(formatter.format(item.getMillimeterperminute()));
                strMillimetersecond = String.valueOf(formatter.format(item.getMillimeterpersecond()));
                strFoothour = String.valueOf(formatter.format(item.getFootperhour()));
                strFootminute = String.valueOf(formatter.format(item.getFootperminute()));
                strFootsecond = String.valueOf(formatter.format(item.getFootpersecond()));
                strYardhour = String.valueOf(formatter.format(item.getYardperhour()));
                strYardminute = String.valueOf(formatter.format(item.getYardperminute()));
                strYardsecond = String.valueOf(formatter.format(item.getYardpersecond()));
                strMileminute = String.valueOf(formatter.format(item.getMileperminute()));
                strMilesecond = String.valueOf(formatter.format( item.getMilepersecond()));
                strKnot = String.valueOf(formatter.format(item.getKnot()));
                strKnotUK = String.valueOf(formatter.format( item.getKnotUK()));
                strVelocityoflightinvacuum = String.valueOf(formatter.format(item.getVelocotyLVacuum()));
                strCosmicvelocityfirsthom = String.valueOf(formatter.format(item.getCosmicvfirst() ));
                strCosmicvelocitysecondcosmic = String.valueOf(formatter.format(item.getCosmicvsecond()));
                strCosmicvelocitythirdcosmic = String.valueOf(formatter.format( item.getCosmicvthird()));
                strEarthsvelocityearth = String.valueOf(formatter.format(item.getEarthv()));
                strVelocityofsoundinpurewater = String.valueOf(formatter.format( item.getVsoundpurewater()));
                strVelocityofsoundinseawater = String.valueOf(formatter.format(item.getVsoundseawater()));
                strMach = String.valueOf(formatter.format( item.getMach20()));
                strMachSIstandard = String.valueOf(formatter.format(item.getMachsistandard()));

                switch (strSpinnerFromvalue1) {
                    case "Meter/second - m/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilometer/hour - km/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Mile/hour - mi/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Meter/hour - m/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Meter/minute - m/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilometer/minute - km/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilometer/second - km/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Centimeter/hour - cm/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Centimeter/minute - cm/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Centimeter/second - cm/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Millimeter/hour - mm/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Millimeter/minute - mm/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Millimeter/second - mm/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Foot/hour - ft/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Foot/minute - ft/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Foot/second - ft/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Yard/hour - yd/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Yard/minute - yd/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Yard/second - yd/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Mile/minute - mi/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Mile/second - mi/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Knot - knots":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Knot (UK) - knots(UK)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Velocity of light in vacuum - c":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cosmic velocity - first - hom":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cosmic velocity - second - cosmic":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cosmic velocity - third - cosmic":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Earth's velocity - earth":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Velocity of sound in pure water - sound":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Velocity of sound in sea water - sound":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Mach - mach":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Mach (SI standard) - mach":
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
            case "Meter/second - m/s":
                editTextValueTo.setText(strMetersecond);
                break;
            case "Kilometer/hour - km/h":
                editTextValueTo.setText(strKilometerhour);
                break;
            case "Mile/hour - mi/h":
                editTextValueTo.setText(strMilehour);
                break;
            case "Meter/hour - m/h":
                editTextValueTo.setText(strMeterhour);
                break;
            case "Meter/minute - m/min":
                editTextValueTo.setText(strMeterminute);
                break;
            case "Kilometer/minute - km/min":
                editTextValueTo.setText(strKilometerminute);
                break;
            case "Kilometer/second - km/s":
                editTextValueTo.setText(strKilometersecond);
                break;
            case "Centimeter/hour - cm/h":
                editTextValueTo.setText(strCentimeterhour);
                break;
            case "Centimeter/minute - cm/min":
                editTextValueTo.setText(strCentimeterminute);
                break;
            case "Centimeter/second - cm/s":
                editTextValueTo.setText(strCentimetersecond);
                break;
            case "Millimeter/hour - mm/h":
                editTextValueTo.setText(strMillimeterhour);
                break;
            case "Millimeter/minute - mm/min":
                editTextValueTo.setText(strMillimeterminute);
                break;
            case "Millimeter/second - mm/s":
                editTextValueTo.setText(strMillimetersecond);
                break;
            case "Foot/hour - ft/h":
                editTextValueTo.setText(strFoothour);
                break;
            case "Foot/minute - ft/min":
                editTextValueTo.setText(strFootminute);
                break;
            case "Foot/second - ft/s":
                editTextValueTo.setText(strFootsecond);
                break;
            case "Yard/hour - yd/h":
                editTextValueTo.setText(strYardhour);
                break;
            case "Yard/minute - yd/min":
                editTextValueTo.setText(strYardminute);
                break;
            case "Yard/second - yd/s":
                editTextValueTo.setText(strYardsecond);
                break;
            case "Mile/minute - mi/min":
                editTextValueTo.setText(strMileminute);
                break;
            case "Mile/second - mi/s":
                editTextValueTo.setText(strMilesecond);
                break;
            case "Knot - knots":
                editTextValueTo.setText(strKnot);
                break;
            case "Knot (UK) - knots(UK)":
                editTextValueTo.setText(strKnotUK);
                break;
            case "Velocity of light in vacuum - c":
                editTextValueTo.setText(strVelocityoflightinvacuum);
                break;
            case "Cosmic velocity - first - hom":
                editTextValueTo.setText(strCosmicvelocityfirsthom);
                break;
            case "Cosmic velocity - second - cosmic":
                editTextValueTo.setText(strCosmicvelocitysecondcosmic);
                break;
            case "Cosmic velocity - third - cosmic":
                editTextValueTo.setText(strCosmicvelocitythirdcosmic);
                break;
            case "Earth's velocity - earth":
                editTextValueTo.setText(strEarthsvelocityearth);
                break;
            case "Velocity of sound in pure water - sound":
                editTextValueTo.setText(strVelocityofsoundinpurewater);
                break;
            case "Velocity of sound in sea water - sound":
                editTextValueTo.setText(strVelocityofsoundinseawater);
                break;
            case "Mach - mach":
                editTextValueTo.setText(strMach);
                break;
            case "Mach (SI standard) - mach":
                editTextValueTo.setText(strMachSIstandard);
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