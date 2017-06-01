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
import com.nineinfosys.basicconverter.ConverterActivityList.ConversionFuelListActivity;
import com.nineinfosys.basicconverter.Engin.Fuel;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class FuelActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher {


    //declaration of designing tools
    private Spinner spinnerConvertFrom, spinnerConvertTo;
    private EditText editTextValue, editTextValueTo;

    private FloatingActionButton buttonList, buttonShare, buttonMail, buttonCopy;
    private SwitchCompat switchChangeType;
    private List<String> listFuelFirstfrom, listFuelFirstTo, listfuelfrom, listfuelTo;
    private String stringSpinnerFrom, stringSpinnerTo;
    private TextView textViewBasicUnit, textViewAllUnit,textViewConvert;
    double doubleEdittextvalue = 1.0;
    private int basicunit = 4;
    private int allunit = 37;
    private DecimalFormat formatter = null;
    private static final int REQUEST_CODE = 100;

    Fuel.ConversionResults item;

    private String strmeterliter=null;
    private String strexameterliter=null;
    private String strpetameterliter=null;
    private String strterameterliter=null;
    private String strgigameterliter=null;
    private String strmegameterliter=null;
    private String strkilometerliter=null;
    private String strhectometerliter=null;
    private String strdekameterliter=null;
    private String strcentimeterliter=null;
    private String strmileusliter=null;
    private String strnauticalmilelite=null;
    private String strnauticalmilegallon=null;
    private String strkilometergallon=null;
    private String strmetergallonus=null;
    private String strmetergallonUK=null;
    private String strmilegallonus=null;
    private String strmilegallonuk=null;
    private String strmetercubicmeter=null;
    private String strmetercubiccm=null;
    private String strmetercubicyard=null;
    private String strmetercubicfoot=null;
    private String strmetercubicinch=null;
    private String strmeterquartUS=null;
    private String strmeterquartuk=null;
    private String strmeterpintUS=null;
    private String strmeterpintuk=null;
    private String strmetercupUS=null;
    private String strmetercupUk=null;
    private String strmeterfluidounceus=null;
    private String strmeterfluidounceuk=null;
    private String strlitermeter=null;
    private String strliter100km=null;
    private String strgallonUSmile=null;
    private String strgallonUS100mi=null;
    private String strgallonUKmile=null;
    private String strgallonUK100mi=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);


        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#e65f21")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Fuel");

        formatsetting();

        MobileAds.initialize(FuelActivity.this, getString(R.string.ads_app_id));
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
        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedishyellow)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedishyellow)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedishyellow)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedishyellow)));

        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()),ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedishyellow)));
        // DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getTrackDrawable()), ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRed)));
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
        listFuelFirstfrom = new ArrayList<String>();
        listFuelFirstTo = new ArrayList<String>();


        //for first time running spinner
        listFuelFirstfrom.add("Meter/liter - m/L");
        listFuelFirstfrom.add("Kilometer/liter - km/L");
        listFuelFirstfrom.add("Liter/100 km - L/100 km");
        listFuelFirstfrom.add("Gallon(US)/mile - gallon/mi");

        listFuelFirstTo.add("Meter/liter - m/L");
        listFuelFirstTo.add("Kilometer/liter - km/L");
        listFuelFirstTo.add("Liter/100 km - L/100 km");
        listFuelFirstTo.add("Gallon(US)/mile - gallon/mi");


        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(FuelActivity.this, android.R.layout.simple_spinner_item, listFuelFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(FuelActivity.this, android.R.layout.simple_spinner_item, listFuelFirstTo);


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

                listfuelfrom = new ArrayList<String>();
                listfuelTo = new ArrayList<String>();
                String stringSwitchSate = String.valueOf(isChecked);
                String strBasic = "Basic";
                String strAdvance = "All";
                switch (stringSwitchSate) {

                    case "false":
                        Snackbar.make(buttonView, "You switched to " + strBasic + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listfuelfrom.clear();
                        listfuelTo.clear();
                        listfuelfrom.add("Meter/liter - m/L");
                        listfuelfrom.add("Kilometer/liter - km/L");
                        listfuelfrom.add("Liter/100 km - L/100 km");
                        listfuelfrom.add("Gallon(US)/mile - gallon/mi");
                        //second spinner
                        listfuelTo.add("Meter/liter - m/L");
                        listfuelTo.add("Kilometer/liter - km/L");
                        listfuelTo.add("Liter/100 km - L/100 km");
                        listfuelTo.add("Gallon(US)/mile - gallon/mi");




                        break;
                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strAdvance + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listfuelfrom.clear();
                        listfuelTo.clear();
                        listfuelfrom.add("Meter/liter - m/L");
                        listfuelfrom.add("Exameter/liter - Em/L");
                        listfuelfrom.add("Petameter/liter - Pm/L");
                        listfuelfrom.add("Terameter/liter - Tm/L");
                        listfuelfrom.add("Gigameter/liter - Gm/L");
                        listfuelfrom.add("Megameter/liter - Mm/L");
                        listfuelfrom.add("Kilometer/liter - km/L");
                        listfuelfrom.add("Hectometer/liter - hm/L");
                        listfuelfrom.add("Dekameter/liter - dam/L");
                        listfuelfrom.add("Centimeter/liter - cm/L");
                        listfuelfrom.add("Mile(US)/liter - mi/L");
                        listfuelfrom.add("Nautical mile/liter - n.mile/L");
                        listfuelfrom.add("Nautical mile/gallon(US)  - n.mile/gallon");
                        listfuelfrom.add("Kilometer/gallon - km/gallon");
                        listfuelfrom.add("Meter/gallon(US) - m/gallon");
                        listfuelfrom.add("Meter/gallon(UK) - m/gallon");
                        listfuelfrom.add("Mile/gallon(US) - mi/gallon");
                        listfuelfrom.add("Mile/gallon(UK) - mi/gallon");
                        listfuelfrom.add("Meter/cubic meter - m/m^3");
                        listfuelfrom.add("Meter/cubic centimeter - m/cm^3");
                        listfuelfrom.add("Meter/cubic yard - m/yd^3");
                        listfuelfrom.add("Meter/cubic foot - m/ft^3");
                        listfuelfrom.add("Meter/cubic inch - m/in^3");
                        listfuelfrom.add("Meter/quart(US) - m/q");
                        listfuelfrom.add("Meter/quart(UK) - m/q");
                        listfuelfrom.add("Meter/pint(US) - m/pt");
                        listfuelfrom.add("Meter/pint(UK) - m/pt");
                        listfuelfrom.add("Meter/cup(US) - m/cup");
                        listfuelfrom.add("Meter/cup(UK) - m/cup");
                        listfuelfrom.add("Meter/fluid ounce(US) - m/floz");
                        listfuelfrom.add("Meter/fluid ounce(UK) - m/floz");
                        listfuelfrom.add("Liter/meter - L/m");
                        listfuelfrom.add("Liter/100 km - L/100 km");
                        listfuelfrom.add("Gallon(US)/mile - gallon/mi");
                        listfuelfrom.add("Gallon(US)/100 mile - gallon/100 mi");
                        listfuelfrom.add("Gallon(UK)/mile - gallon/mi");
                        listfuelfrom.add("Gallon(UK)/100 mile - gallon/100 mi");

                        //2 spinner
                        listfuelTo.add("Meter/liter - m/L");
                        listfuelTo.add("Exameter/liter - Em/L");
                        listfuelTo.add("Petameter/liter - Pm/L");
                        listfuelTo.add("Terameter/liter - Tm/L");
                        listfuelTo.add("Gigameter/liter - Gm/L");
                        listfuelTo.add("Megameter/liter - Mm/L");
                        listfuelTo.add("Kilometer/liter - km/L");
                        listfuelTo.add("Hectometer/liter - hm/L");
                        listfuelTo.add("Dekameter/liter - dam/L");
                        listfuelTo.add("Centimeter/liter - cm/L");
                        listfuelTo.add("Mile(US)/liter - mi/L");
                        listfuelTo.add("Nautical mile/liter - n.mile/L");
                        listfuelTo.add("Nautical mile/gallon(US)  - n.mile/gallon");
                        listfuelTo.add("Kilometer/gallon - km/gallon");
                        listfuelTo.add("Meter/gallon(US) - m/gallon");
                        listfuelTo.add("Meter/gallon(UK) - m/gallon");
                        listfuelTo.add("Mile/gallon(US) - mi/gallon");
                        listfuelTo.add("Mile/gallon(UK) - mi/gallon");
                        listfuelTo.add("Meter/cubic meter - m/m^3");
                        listfuelTo.add("Meter/cubic centimeter - m/cm^3");
                        listfuelTo.add("Meter/cubic yard - m/yd^3");
                        listfuelTo.add("Meter/cubic foot - m/ft^3");
                        listfuelTo.add("Meter/cubic inch - m/in^3");
                        listfuelTo.add("Meter/quart(US) - m/q");
                        listfuelTo.add("Meter/quart(UK) - m/q");
                        listfuelTo.add("Meter/pint(US) - m/pt");
                        listfuelTo.add("Meter/pint(UK) - m/pt");
                        listfuelTo.add("Meter/cup(US) - m/cup");
                        listfuelTo.add("Meter/cup(UK) - m/cup");
                        listfuelTo.add("Meter/fluid ounce(US) - m/floz");
                        listfuelTo.add("Meter/fluid ounce(UK) - m/floz");
                        listfuelTo.add("Liter/meter - L/m");
                        listfuelTo.add("Liter/100 km - L/100 km");
                        listfuelTo.add("Gallon(US)/mile - gallon/mi");
                        listfuelTo.add("Gallon(US)/100 mile - gallon/100 mi");
                        listfuelTo.add("Gallon(UK)/mile - gallon/mi");
                        listfuelTo.add("Gallon(UK)/100 mile - gallon/100 mi");
                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(FuelActivity.this, android.R.layout.simple_spinner_item, listfuelfrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(FuelActivity.this, android.R.layout.simple_spinner_item, listfuelTo);


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
                Intent i = new Intent(this, ConversionFuelListActivity.class);
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

            Fuel c = new Fuel(strSpinnerFromvalue1, doubleEdittextvalue1);
            ArrayList<Fuel.ConversionResults> results = c.calculatefuelConversion();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);

                strmeterliter = String.valueOf(formatter.format(item.getMeterliter()));
                strexameterliter = String.valueOf(formatter.format(item.getExameterliter()));
                strpetameterliter = String.valueOf(formatter.format(item.getPetameterliter()));
                strterameterliter = String.valueOf(formatter.format(item.getTerameterliter()));
                strgigameterliter= String.valueOf(formatter.format(item.getGigameterliter()));
                strmegameterliter = String.valueOf(formatter.format(item.getMegameterliter()));
                strkilometerliter = String.valueOf(formatter.format(item.getKilometerliter()));
                strhectometerliter = String.valueOf(formatter.format(item.getHectometerliter()));
                strdekameterliter = String.valueOf(formatter.format(item.getDekameterliter()));
                strcentimeterliter = String.valueOf(formatter.format(item.getCentimeterliter()));
                strmileusliter = String.valueOf(formatter.format(item.getMileusliter()));
                strnauticalmilelite = String.valueOf(formatter.format(item.getNauticalmilelite()));
                strnauticalmilegallon= String.valueOf(formatter.format(item.getNauticalmilegallon()));
                strkilometergallon = String.valueOf(formatter.format(item.getKilometergallon()));
                strmetergallonus = String.valueOf(formatter.format(item.getMetergallonus()));
                strmetergallonUK = String.valueOf(formatter.format(item.getMetergallonUK()));
                strmilegallonus = String.valueOf(formatter.format(item.getMilegallonus()));
                strmilegallonuk = String.valueOf(formatter.format(item.getMilegallonuk()));
                strmetercubicmeter= String.valueOf(formatter.format(item.getMetercubicmeter()));
                strmetercubiccm = String.valueOf(formatter.format(item.getMetercubiccm()));
                strmetercubicyard = String.valueOf(formatter.format(item.getMetercubicyard()));
                strmetercubicfoot = String.valueOf(formatter.format(item.getMetercubicfoot()));
                strmetercubicinch = String.valueOf(formatter.format(item.getMetercubicinch()));
                strmeterquartUS = String.valueOf(formatter.format(item.getMeterquartUS()));
                strmeterquartuk = String.valueOf(formatter.format(item.getMeterquartuk()));
                strmeterpintUS = String.valueOf(formatter.format(item.getMeterpintUS()));
                strmeterpintuk= String.valueOf(formatter.format(item.getMeterpintuk()));
                strmetercupUS = String.valueOf(formatter.format(item.getMetercupUS()));
                strmetercupUk = String.valueOf(formatter.format(item.getMetercupk()));
                strmeterfluidounceus = String.valueOf(formatter.format(item.getMeterfluidounceus()));
                strmeterfluidounceuk = String.valueOf(formatter.format(item.getMeterfluidounceuk()));
                strlitermeter= String.valueOf(formatter.format(item.getLitermeter()));
                strliter100km = String.valueOf(formatter.format(item.getLiter100km()));
                strgallonUSmile = String.valueOf(formatter.format(item.getGallonUSmile()));
                strgallonUS100mi = String.valueOf(formatter.format(item.getGallonUS100mi()));
                strgallonUKmile= String.valueOf(formatter.format(item.getGallonUKmile()));
                strgallonUK100mi = String.valueOf(formatter.format(item.getGallonUK100mi()));


                switch (strSpinnerFromvalue1) {

                    case "Meter/liter - m/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Exameter/liter - Em/L":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Petameter/liter - Pm/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Terameter/liter - Tm/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gigameter/liter - Gm/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Megameter/liter - Mm/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilometer/liter - km/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Hectometer/liter - hm/L":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Dekameter/liter - dam/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Centimeter/liter - cm/L":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Mile(US)/liter - mi/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Nautical mile/liter - n.mile/L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Nautical mile/gallon(US)  - n.mile/gallon":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilometer/gallon - km/gallon":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Meter/gallon(US) - m/gallon":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Meter/gallon(UK) - m/gallon":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Mile/gallon(US) - mi/gallon":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Mile/gallon(UK) - mi/gallon":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Meter/cubic meter - m/m^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Meter/cubic centimeter - m/cm^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Meter/cubic yard - m/yd^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Meter/cubic foot - m/ft^3":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Meter/cubic inch - m/in^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Meter/quart(US) - m/q":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Meter/quart(UK) - m/q":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Meter/pint(US) - m/pt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Meter/pint(UK) - m/pt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Meter/cup(US) - m/cup":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Meter/cup(UK) - m/cup":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Meter/fluid ounce(US) - m/floz":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Meter/fluid ounce(UK) - m/floz":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Liter/meter - L/m":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Liter/100 km - L/100 km":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gallon(US)/mile - gallon/mi":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gallon(US)/100 mile - gallon/100 mi":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gallon(UK)/mile - gallon/mi":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gallon(UK)/100 mile - gallon/100 mi":
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
         
            case "Meter/liter - m/L":
              editTextValueTo.setText(strmeterliter);
                break;
            case "Exameter/liter - Em/L":
              editTextValueTo.setText(strexameterliter);
                break;

            case "Petameter/liter - Pm/L":
              editTextValueTo.setText(strpetameterliter);
                break;
            case "Terameter/liter - Tm/L":
              editTextValueTo.setText(strterameterliter);
                break;
            case "Gigameter/liter - Gm/L":
              editTextValueTo.setText(strgigameterliter);
                break;
            case "Megameter/liter - Mm/L":
              editTextValueTo.setText(strmegameterliter);
                break;
            case "Kilometer/liter - km/L":
              editTextValueTo.setText(strkilometerliter);
                break;
            case "Hectometer/liter - hm/L":
              editTextValueTo.setText(strhectometerliter);
                break;

            case "Dekameter/liter - dam/L":
              editTextValueTo.setText(strdekameterliter);
                break;
            case "Centimeter/liter - cm/L":
              editTextValueTo.setText(strcentimeterliter);
                break;

            case "Mile(US)/liter - mi/L":
              editTextValueTo.setText(strmileusliter);
                break;
            case "Nautical mile/liter - n.mile/L":
              editTextValueTo.setText(strnauticalmilelite);
                break;
            case "Nautical mile/gallon(US)  - n.mile/gallon":
              editTextValueTo.setText(strnauticalmilegallon);
                break;
            case "Kilometer/gallon - km/gallon":
              editTextValueTo.setText(strkilometergallon);
                break;

            case "Meter/gallon(US) - m/gallon":
              editTextValueTo.setText(strmetergallonus);
                break;
            case "Meter/gallon(UK) - m/gallon":
              editTextValueTo.setText(strmetergallonUK);
                break;

            case "Mile/gallon(US) - mi/gallon":
              editTextValueTo.setText(strmilegallonus);
                break;
            case "Mile/gallon(UK) - mi/gallon":
              editTextValueTo.setText(strmilegallonuk);
                break;
            case "Meter/cubic meter - m/m^3":
              editTextValueTo.setText(strmetercubicmeter);
                break;
            case "Meter/cubic centimeter - m/cm^3":
              editTextValueTo.setText(strmetercubiccm);
                break;
            case "Meter/cubic yard - m/yd^3":
              editTextValueTo.setText(strmetercubicyard);
                break;
            case "Meter/cubic foot - m/ft^3":
              editTextValueTo.setText(strmetercubicfoot);
                break;

            case "Meter/cubic inch - m/in^3":
              editTextValueTo.setText(strmetercubicinch);
                break;
            case "Meter/quart(US) - m/q":
              editTextValueTo.setText(strmeterquartUS);
                break;
            case "Meter/quart(UK) - m/q":
              editTextValueTo.setText(strmeterquartuk);
                break;

            case "Meter/pint(US) - m/pt":
              editTextValueTo.setText(strmeterpintUS);
                break;
            case "Meter/pint(UK) - m/pt":
              editTextValueTo.setText(strmeterpintuk);
                break;
            case "Meter/cup(US) - m/cup":
              editTextValueTo.setText(strmetercupUS);
                break;
            case "Meter/cup(UK) - m/cup":
              editTextValueTo.setText(strmetercupUk);
                break;

            case "Meter/fluid ounce(US) - m/floz":
              editTextValueTo.setText(strmeterfluidounceus);
                break;
            case "Meter/fluid ounce(UK) - m/floz":
              editTextValueTo.setText(strmeterfluidounceuk);
                break;
            case "Liter/meter - L/m":
              editTextValueTo.setText(strlitermeter);
                break;
            case "Liter/100 km - L/100 km":
              editTextValueTo.setText(strliter100km);
                break;
            case "Gallon(US)/mile - gallon/mi":
              editTextValueTo.setText(strgallonUSmile);
                break;
            case "Gallon(US)/100 mile - gallon/100 mi":
              editTextValueTo.setText(strgallonUS100mi);
                break;
            case "Gallon(UK)/mile - gallon/mi":
              editTextValueTo.setText(strgallonUKmile);
                break;
            case "Gallon(UK)/100 mile - gallon/100 mi":
              editTextValueTo.setText(strgallonUK100mi);
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