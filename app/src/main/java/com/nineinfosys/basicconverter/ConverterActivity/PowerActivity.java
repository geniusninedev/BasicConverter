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
import com.nineinfosys.basicconverter.ConverterActivityList.ConversionPowerListActivity;
import com.nineinfosys.basicconverter.Engin.PowerConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PowerActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher {


    //declaration of designing tools
    private Spinner spinnerConvertFrom, spinnerConvertTo;
    private EditText editTextValue, editTextValueTo;
    private FloatingActionButton buttonList, buttonShare, buttonMail, buttonCopy;
    private SwitchCompat switchChangeType;
    private List<String> listtempFirstfrom, listFirsttempTo, listtempfrom, listtempTo;
    private String stringSpinnerFrom, stringSpinnerTo;
    private TextView textViewBasicUnit, textViewAllUnit,textViewConvert;
    double doubleEdittextvalue = 1.0;
    private int basicunit = 21;
    private int allunit = 76;
    private  DecimalFormat formatter = null;
    private static final int REQUEST_CODE = 100;


    PowerConverter.ConversionResults item;
     private String strwatt=null,strexawatt=null,strpetawatt=null,strterawatt=null,strgigawatt=null,strmegawatt=null,strkilowatt=null,strhectowatt=null,strdekawatt=null,strdeciwatt=null,strcentiwatt=null,
            strmilliwatt=null, strmicrowatt=null,strnanowatt=null,strpicowatt=null,strfemtowatt =null,strattowatt=null,strhorsepower=null,strhorsepower550ftlbfs=null,strhorsepowermetric=null,
            strhorsepowerboiler=null,strhorsepowerelectric=null,strhorsepowerwater=null,strpferdestarkeps=null,strBtuIThour=null,strBtuITminute=null,strBtuITsecond =null,strBtuthhour=null,
            strBtuthminute=null,strBtuthsecond=null,strMBtuIThour=null,strMBH=null,strtonrefrigeration=null,strkilocalorieIThour=null,strkilocalorieITminute=null,strkilocalorieITsecond=null,
            strkilocaloriethhour=null,strkilocaloriethminute =null,strkilocaloriethsecond=null,strcalorieIThour=null,strcalorieITminute=null,strcalorieITsecond=null,strcaloriethhour=null,
            strcaloriethminute=null,strcaloriethsecond=null,strfootpoundforcehour=null,strfootpoundforceminute=null,strfootpoundforcesecond =null,strpoundfoothour=null,strpoundfootminute=null,
            strpoundfootsecond=null,strergsecond=null,strkilovoltampere=null,strvoltampere=null,strnewtonmetersecond=null,strjoulesecond=null,strexajoulesecond=null,strpetajoulesecond=null,
            strterajoulesecond =null,strgigajoulesecond=null,strmegajoulesecond=null,strkilojoulesecond=null,strhectojoulesecond=null,strdekajoulesecond=null,strdecijoulesecond=null,
            strcentijoulesecond=null,strmillijoulesecond=null,strmicrojoulesecond=null,strnanojoulesecond =null,strpicojoulesecond=null,strfemtojoulesecond=null,strattojoulesecond=null,
            strjoulehour=null,strjouleminute=null,strkilojoulehour=null,strkilojouleminute=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);


        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#db290d")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Power");


        formatsetting();

        MobileAds.initialize(PowerActivity.this, getString(R.string.ads_app_id));
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
        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedorange)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedorange)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedorange)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedorange)));

        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()),ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedorange)));
       // DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getTrackDrawable()), ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRed)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textViewConvert.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedorange)));
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#a10000"));
        }

        textViewBasicUnit.setText(String.valueOf("Basic Units(" + basicunit + ")"));
        textViewAllUnit.setText(String.valueOf("All Units(" + allunit + ")"));


        //adding value to spinner
        listtempFirstfrom = new ArrayList<String>();
        listFirsttempTo = new ArrayList<String>();


        //for first time running spinner
        listtempFirstfrom.add("Calorie (IT)/hour -cal/h");
        listtempFirstfrom.add("Calorie (IT)/second -cal/s");
        listtempFirstfrom.add("Erg/second -erg/s");
        listtempFirstfrom.add("Foot pound-force/second -lbf*ft/s");
        listtempFirstfrom.add("Calorie (th)/hour -cal(th)/h");
        listtempFirstfrom.add("Calorie (th)/second -cal(th)/s");
        listtempFirstfrom.add("Horsepower -hp,hp(UK)");
        listtempFirstfrom.add("Horsepower (boiler) -hp(boiler)");
        listtempFirstfrom.add("Horsepower (electric) -hp(electric)");
        listtempFirstfrom.add("Horsepower (metric) -hp(metric)");
        listtempFirstfrom.add("Joule/hour -J/h");
        listtempFirstfrom.add("Joule/second -J/s");
        listtempFirstfrom.add("Kilocalorie (IT)/hour -kcal/h");
        listtempFirstfrom.add("Kilocalorie (IT)/second -kcal/s");
        listtempFirstfrom.add("Pound-foot/second -lbf*ft/s");
        listtempFirstfrom.add("Kilowatt -kW");
        listtempFirstfrom.add("Megawatt -MW");
        listtempFirstfrom.add("Btu (IT)/hour -Btu/h");
        listtempFirstfrom.add("Btu (IT)/minute -Btu/min");
        listtempFirstfrom.add("Btu (IT)/second -Btu/s");
        listtempFirstfrom.add("Watt -W");

        //for first time running spinner
        listFirsttempTo.add("Calorie (IT)/hour -cal/h");
        listFirsttempTo.add("Calorie (IT)/second -cal/s");
        listFirsttempTo.add("Erg/second -erg/s");
        listFirsttempTo.add("Foot pound-force/second -lbf*ft/s");
        listFirsttempTo.add("Calorie (th)/hour -cal(th)/h");
        listFirsttempTo.add("Calorie (th)/second -cal(th)/s");
        listFirsttempTo.add("Horsepower -hp,hp(UK)");
        listFirsttempTo.add("Horsepower (boiler) -hp(boiler)");
        listFirsttempTo.add("Horsepower (electric) -hp(electric)");
        listFirsttempTo.add("Horsepower (metric) -hp(metric)");
        listFirsttempTo.add("Joule/hour -J/h");
        listFirsttempTo.add("Joule/second -J/s");
        listFirsttempTo.add("Kilocalorie (IT)/hour -kcal/h");
        listFirsttempTo.add("Kilocalorie (IT)/second -kcal/s");
        listFirsttempTo.add("Pound-foot/second -lbf*ft/s");
        listFirsttempTo.add("Kilowatt -kW");
        listFirsttempTo.add("Megawatt -MW");
        listFirsttempTo.add("Btu (IT)/hour -Btu/h");
        listFirsttempTo.add("Btu (IT)/minute -Btu/min");
        listFirsttempTo.add("Btu (IT)/second -Btu/s");
        listFirsttempTo.add("Watt -W");

        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(PowerActivity.this, android.R.layout.simple_spinner_item, listtempFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(PowerActivity.this, android.R.layout.simple_spinner_item, listFirsttempTo);


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
                        listtempfrom.add("Calorie (IT)/hour -cal/h");
                        listtempfrom.add("Calorie (IT)/second -cal/s");
                        listtempfrom.add("Erg/second -erg/s");
                        listtempfrom.add("Foot pound-force/second -lbf*ft/s");
                        listtempfrom.add("Calorie (th)/hour -cal(th)/h");
                        listtempfrom.add("Calorie (th)/second -cal(th)/s");
                        listtempfrom.add("Horsepower -hp,hp(UK)");
                        listtempfrom.add("Horsepower (boiler) -hp(boiler)");
                        listtempfrom.add("Horsepower (electric) -hp(electric)");
                        listtempfrom.add("Horsepower (metric) -hp(metric)");
                        listtempfrom.add("Joule/hour -J/h");
                        listtempfrom.add("Joule/second -J/s");
                        listtempfrom.add("Kilocalorie (IT)/hour -kcal/h");
                        listtempfrom.add("Kilocalorie (IT)/second -kcal/s");
                        listtempfrom.add("Pound-foot/second -lbf*ft/s");
                        listtempfrom.add("Kilowatt -kW");
                        listtempfrom.add("Megawatt -MW");
                        listtempfrom.add("Btu (IT)/hour -Btu/h");
                        listtempfrom.add("Btu (IT)/minute -Btu/min");
                        listtempfrom.add("Btu (IT)/second -Btu/s");
                        listtempfrom.add("Watt -W");

                        //2 spinner
                        listtempTo.add("Calorie (IT)/hour -cal/h");
                        listtempTo.add("Calorie (IT)/second -cal/s");
                        listtempTo.add("Erg/second -erg/s");
                        listtempTo.add("Foot pound-force/second -lbf*ft/s");
                        listtempTo.add("Calorie (th)/hour -cal(th)/h");
                        listtempTo.add("Calorie (th)/second -cal(th)/s");
                        listtempTo.add("Horsepower -hp,hp(UK)");
                        listtempTo.add("Horsepower (boiler) -hp(boiler)");
                        listtempTo.add("Horsepower (electric) -hp(electric)");
                        listtempTo.add("Horsepower (metric) -hp(metric)");
                        listtempTo.add("Joule/hour -J/h");
                        listtempTo.add("Joule/second -J/s");
                        listtempTo.add("Kilocalorie (IT)/hour -kcal/h");
                        listtempTo.add("Kilocalorie (IT)/second -kcal/s");
                        listtempTo.add("Pound-foot/second -lbf*ft/s");
                        listtempTo.add("Kilowatt -kW");
                        listtempTo.add("Megawatt -MW");
                        listtempTo.add("Btu (IT)/hour -Btu/h");
                        listtempTo.add("Btu (IT)/minute -Btu/min");
                        listtempTo.add("Btu (IT)/second -Btu/s");
                        listtempTo.add("Watt -W");
                        break;

                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strAdvance + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listtempfrom.clear();
                        listtempTo.clear();
                        listtempfrom.add("Watt -W");
                        listtempfrom.add("Exawatt -EW");
                        listtempfrom.add("Petawatt -PW");
                        listtempfrom.add("Terawatt -TW");
                        listtempfrom.add("Gigawatt -GW");
                        listtempfrom.add("Megawatt -MW");
                        listtempfrom.add("Kilowatt -kW");
                        listtempfrom.add("Hectowatt -hW");
                        listtempfrom.add("Dekawatt -daW");
                        listtempfrom.add("Deciwatt -dW");
                        listtempfrom.add("Centiwatt -cW");
                        listtempfrom.add("Milliwatt -mW");
                        listtempfrom.add("Microwatt -μW");
                        listtempfrom.add("Nanowatt -nW");
                        listtempfrom.add("Picowatt -pW");
                        listtempfrom.add("Femtowatt -fW");
                        listtempfrom.add("Attowatt -aW");
                        listtempfrom.add("Horsepower -hp,hp(UK)");
                        listtempfrom.add("Horsepower (550 ft*lbf/s) -hp,hp(UK)");
                        listtempfrom.add("Horsepower (metric) -hp(metric)");
                        listtempfrom.add("Horsepower (boiler) -hp(boiler)");
                        listtempfrom.add("Horsepower (electric) -hp(electric)");
                        listtempfrom.add("Horsepower (water) -hp(water)");
                        listtempfrom.add("Pferdestarke (ps) -ps");
                        listtempfrom.add("Btu (IT)/hour -Btu/h");
                        listtempfrom.add("Btu (IT)/minute -Btu/min");
                        listtempfrom.add("Btu (IT)/second -Btu/s");
                        listtempfrom.add("Btu (th)/hour -Btu(th)/h");
                        listtempfrom.add("Btu (th)/minute -Btu(th)/min");
                        listtempfrom.add("Btu (th)/second -Btu(th)/s");
                        listtempfrom.add("MBtu (IT)/hour -MBtu/h");
                        listtempfrom.add("MBH -MBH");
                        listtempfrom.add("Ton (refrigeration) -ton");
                        listtempfrom.add("Kilocalorie (IT)/hour -kcal/h");
                        listtempfrom.add("Kilocalorie (IT)/minute -kcal/min");
                        listtempfrom.add("Kilocalorie (IT)/second -kcal/s");
                        listtempfrom.add("Kilocalorie (th)/hour -kcal(th)/h");
                        listtempfrom.add("Kilocalorie (th)/minute -kcal(th)/min");
                        listtempfrom.add("Kilocalorie (th)/second -kcal(th)/s");
                        listtempfrom.add("Calorie (IT)/hour -cal/h");
                        listtempfrom.add("Calorie (IT)/minute -cal/min");
                        listtempfrom.add("Calorie (IT)/second -cal/s");
                        listtempfrom.add("Calorie (th)/hour -cal(th)/h");
                        listtempfrom.add("Calorie (th)/minute -cal(th)/min");
                        listtempfrom.add("Calorie (th)/second -cal(th)/s");
                        listtempfrom.add("Foot pound-force/hour -lbf*ft/h");
                        listtempfrom.add("Foot pound-force/minute -lbf*ft/min");
                        listtempfrom.add("Foot pound-force/second -lbf*ft/s");
                        listtempfrom.add("Pound-foot/hour -lbf*ft/h");
                        listtempfrom.add("Pound-foot/minute -lbf*ft/min");
                        listtempfrom.add("Pound-foot/second -lbf*ft/s");
                        listtempfrom.add("Erg/second -erg/s");
                        listtempfrom.add("Kilovolt ampere -kV*A");
                        listtempfrom.add("Volt ampere -V*A");
                        listtempfrom.add("Newton meter/second -N*m/s");
                        listtempfrom.add("Joule/second -J/s");
                        listtempfrom.add("Exajoule/second -EJ/s");
                        listtempfrom.add("Petajoule/second -PJ/s");
                        listtempfrom.add("Terajoule/second -TJ/s");
                        listtempfrom.add("Gigajoule/second -GJ/s");
                        listtempfrom.add("Megajoule/second -MJ/s");
                        listtempfrom.add("Kilojoule/second -kJ/s");
                        listtempfrom.add("Hectojoule/second -hJ/s");
                        listtempfrom.add("Dekajoule/second -daJ/s");
                        listtempfrom.add("Decijoule/second -dJ/s");
                        listtempfrom.add("Centijoule/second -CJ/s");
                        listtempfrom.add("Millijoule/second -mJ/s");
                        listtempfrom.add("Microjoule/second -μJ/s");
                        listtempfrom.add("Nanojoule/second -nJ/s");
                        listtempfrom.add("Picojoule/second -pJ/S");
                        listtempfrom.add("Femtojoule/second -fJ/s");
                        listtempfrom.add("Attojoule/second -aJ/s");
                        listtempfrom.add("Joule/hour -J/h");
                        listtempfrom.add("Joule/minute -J/min");
                        listtempfrom.add("Kilojoule/hour -kJ/h");
                        listtempfrom.add("Kilojoule/minute -kJ/min");


                        //second spinner
                        listtempTo.add("Watt -W");
                        listtempTo.add("Exawatt -EW");
                        listtempTo.add("Petawatt -PW");
                        listtempTo.add("Terawatt -TW");
                        listtempTo.add("Gigawatt -GW");
                        listtempTo.add("Megawatt -MW");
                        listtempTo.add("Kilowatt -kW");
                        listtempTo.add("Hectowatt -hW");
                        listtempTo.add("Dekawatt -daW");
                        listtempTo.add("Deciwatt -dW");
                        listtempTo.add("Centiwatt -cW");
                        listtempTo.add("Milliwatt -mW");
                        listtempTo.add("Microwatt -μW");
                        listtempTo.add("Nanowatt -nW");
                        listtempTo.add("Picowatt -pW");
                        listtempTo.add("Femtowatt -fW");
                        listtempTo.add("Attowatt -aW");
                        listtempTo.add("Horsepower -hp,hp(UK)");
                        listtempTo.add("Horsepower (550 ft*lbf/s) -hp,hp(UK)");
                        listtempTo.add("Horsepower (metric) -hp(metric)");
                        listtempTo.add("Horsepower (boiler) -hp(boiler)");
                        listtempTo.add("Horsepower (electric) -hp(electric)");
                        listtempTo.add("Horsepower (water) -hp(water)");
                        listtempTo.add("Pferdestarke (ps) -ps");
                        listtempTo.add("Btu (IT)/hour -Btu/h");
                        listtempTo.add("Btu (IT)/minute -Btu/min");
                        listtempTo.add("Btu (IT)/second -Btu/s");
                        listtempTo.add("Btu (th)/hour -Btu(th)/h");
                        listtempTo.add("Btu (th)/minute -Btu(th)/min");
                        listtempTo.add("Btu (th)/second -Btu(th)/s");
                        listtempTo.add("MBtu (IT)/hour -MBtu/h");
                        listtempTo.add("MBH -MBH");
                        listtempTo.add("Ton (refrigeration) -ton");
                        listtempTo.add("Kilocalorie (IT)/hour -kcal/h");
                        listtempTo.add("Kilocalorie (IT)/minute -kcal/min");
                        listtempTo.add("Kilocalorie (IT)/second -kcal/s");
                        listtempTo.add("Kilocalorie (th)/hour -kcal(th)/h");
                        listtempTo.add("Kilocalorie (th)/minute -kcal(th)/min");
                        listtempTo.add("Kilocalorie (th)/second -kcal(th)/s");
                        listtempTo.add("Calorie (IT)/hour -cal/h");
                        listtempTo.add("Calorie (IT)/minute -cal/min");
                        listtempTo.add("Calorie (IT)/second -cal/s");
                        listtempTo.add("Calorie (th)/hour -cal(th)/h");
                        listtempTo.add("Calorie (th)/minute -cal(th)/min");
                        listtempTo.add("Calorie (th)/second -cal(th)/s");
                        listtempTo.add("Foot pound-force/hour -lbf*ft/h");
                        listtempTo.add("Foot pound-force/minute -lbf*ft/min");
                        listtempTo.add("Foot pound-force/second -lbf*ft/s");
                        listtempTo.add("Pound-foot/hour -lbf*ft/h");
                        listtempTo.add("Pound-foot/minute -lbf*ft/min");
                        listtempTo.add("Pound-foot/second -lbf*ft/s");
                        listtempTo.add("Erg/second -erg/s");
                        listtempTo.add("Kilovolt ampere -kV*A");
                        listtempTo.add("Volt ampere -V*A");
                        listtempTo.add( "Newton meter/second -N*m/s");
                        listtempTo.add("Joule/second -J/s");
                        listtempTo.add("Exajoule/second -EJ/s");
                        listtempTo.add("Petajoule/second -PJ/s");
                        listtempTo.add("Terajoule/second -TJ/s");
                        listtempTo.add("Gigajoule/second -GJ/s");
                        listtempTo.add("Megajoule/second -MJ/s");
                        listtempTo.add("Kilojoule/second -kJ/s");
                        listtempTo.add("Hectojoule/second -hJ/s");
                        listtempTo.add("Dekajoule/second -daJ/s");
                        listtempTo.add("Decijoule/second -dJ/s");
                        listtempTo.add("Centijoule/second -CJ/s");
                        listtempTo.add("Millijoule/second -mJ/s");
                        listtempTo.add("Microjoule/second -μJ/s");
                        listtempTo.add("Nanojoule/second -nJ/s");
                        listtempTo.add("Picojoule/second -pJ/S");
                        listtempTo.add("Femtojoule/second -fJ/s");
                        listtempTo.add("Attojoule/second -aJ/s");
                        listtempTo.add("Joule/hour -J/h");
                        listtempTo.add("Joule/minute -J/min");
                        listtempTo.add("Kilojoule/hour -kJ/h");
                        listtempTo.add("Kilojoule/minute -kJ/min");

                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(PowerActivity.this, android.R.layout.simple_spinner_item, listtempfrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(PowerActivity.this, android.R.layout.simple_spinner_item, listtempTo);


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
                Intent i = new Intent(this, ConversionPowerListActivity.class);
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

            PowerConverter c = new PowerConverter(strSpinnerFromvalue1, doubleEdittextvalue1);
            ArrayList<PowerConverter.ConversionResults> results = c.calculatePowerConversion();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);

                strwatt=String.valueOf(formatter.format(item.getWatt()));
                strexawatt=String.valueOf(formatter.format(item.getExawatt()));
                strpetawatt=String.valueOf(formatter.format(item.getPetawatt()));
                strterawatt=String.valueOf(formatter.format(item.getTerawatt()));
                strgigawatt=String.valueOf(formatter.format(item.getGigawatt()));
                strmegawatt=String.valueOf(formatter.format(item.getMegawatt()));
                strkilowatt=String.valueOf(formatter.format(item.getKilowatt()));
                strhectowatt=String.valueOf(formatter.format(item.getHectowatt()));
                strdekawatt=String.valueOf(formatter.format(item.getDekawatt()));
                strdeciwatt=String.valueOf(formatter.format(item.getDeciwatt()));
                strcentiwatt=String.valueOf(formatter.format(item.getCentiwatt()));
                strmilliwatt=String.valueOf(formatter.format(item.getMilliwatt()));
                strmicrowatt=String.valueOf(formatter.format(item.getMicrowatt()));
                strnanowatt=String.valueOf(formatter.format(item.getNanowatt()));
                strpicowatt=String.valueOf(formatter.format(item.getPicowatt()));
                strfemtowatt=String.valueOf(formatter.format(item.getFemtowatt()));
                strattowatt=String.valueOf(formatter.format(item.getAttowatt()));
                strhorsepower=String.valueOf(formatter.format(item.getHorsepower()));
                strhorsepower550ftlbfs=String.valueOf(formatter.format(item.getHorsepower550ftlbfs()));
                strhorsepowermetric=String.valueOf(formatter.format(item.getHorsepowermetric()));
                strhorsepowerboiler=String.valueOf(formatter.format(item.getHorsepowerboiler()));
                strhorsepowerelectric=String.valueOf(formatter.format(item.getHorsepowerelectric()));
                strhorsepowerwater=String.valueOf(formatter.format(item.getHorsepowerwater()));
                strpferdestarkeps=String.valueOf(formatter.format(item.getPferdestarkeps()));
                strBtuIThour=String.valueOf(formatter.format(item.getBtuIThour()));
                strBtuITminute=String.valueOf(formatter.format(item.getBtuITminute()));
                strBtuITsecond=String.valueOf(formatter.format(item.getBtuITsecond()));
                strBtuthhour=String.valueOf(formatter.format(item.getBtuthhour()));
                strBtuthminute=String.valueOf(formatter.format(item.getBtuthminute()));
                strBtuthsecond=String.valueOf(formatter.format(item.getBtuthsecond()));
                strMBtuIThour=String.valueOf(formatter.format(item.getMBtuIThour()));
                strMBH=String.valueOf(formatter.format(item.getMBH()));
                strtonrefrigeration=String.valueOf(formatter.format(item.getTonrefrigeration()));
                strkilocalorieIThour=String.valueOf(formatter.format(item.getKilocalorieIThour()));
                strkilocalorieITminute=String.valueOf(formatter.format(item.getKilocalorieITminute()));
                strkilocalorieITsecond=String.valueOf(formatter.format(item.getKilocalorieITsecond()));
                strkilocaloriethhour=String.valueOf(formatter.format(item.getKilocaloriethhour()));
                strkilocaloriethminute=String.valueOf(formatter.format(item.getKilocaloriethminute()));
                strkilocaloriethsecond=String.valueOf(formatter.format(item.getKilocaloriethsecond()));
                strcalorieIThour=String.valueOf(formatter.format(item.getCalorieIThour()));
                strcalorieITminute=String.valueOf(formatter.format(item.getCalorieITminute()));
                strcalorieITsecond=String.valueOf(formatter.format(item.getCalorieITsecond()));
                strcaloriethhour=String.valueOf(formatter.format(item.getCaloriethhour()));
                strcaloriethminute=String.valueOf(formatter.format(item.getCaloriethminute()));
                strcaloriethsecond=String.valueOf(formatter.format(item.getCaloriethsecond()));
                strfootpoundforcehour=String.valueOf(formatter.format(item.getFootpoundforcehour()));
                strfootpoundforceminute=String.valueOf(formatter.format(item.getFootpoundforceminute()));
                strfootpoundforcesecond=String.valueOf(formatter.format(item.getFootpoundforcesecond()));
                strpoundfoothour=String.valueOf(formatter.format(item.getPoundfoothour()));
                strpoundfootminute=String.valueOf(formatter.format(item.getPoundfootminute()));
                strpoundfootsecond=String.valueOf(formatter.format(item.getPoundfootsecond()));
                strergsecond=String.valueOf(formatter.format(item.getErgsecond()));
                strkilovoltampere=String.valueOf(formatter.format(item.getKilovoltampere()));
                strvoltampere=String.valueOf(formatter.format(item.getVoltampere()));
                strnewtonmetersecond=String.valueOf(formatter.format(item.getNewtonmetersecond()));
                strjoulesecond=String.valueOf(formatter.format(item.getJoulesecond()));
                strexajoulesecond=String.valueOf(formatter.format(item.getExajoulesecond()));
                strpetajoulesecond=String.valueOf(formatter.format(item.getPetajoulesecond()));
                strterajoulesecond=String.valueOf(formatter.format(item.getTerajoulesecond()));
                strgigajoulesecond=String.valueOf(formatter.format(item.getGigajoulesecond()));
                strmegajoulesecond=String.valueOf(formatter.format(item.getMegajoulesecond()));
                strkilojoulesecond=String.valueOf(formatter.format(item.getKilojoulesecond()));
                strhectojoulesecond=String.valueOf(formatter.format(item.getHectojoulesecond()));
                strdekajoulesecond=String.valueOf(formatter.format(item.getDekajoulesecond()));
                strdecijoulesecond=String.valueOf(formatter.format(item.getDecijoulesecond()));
                strcentijoulesecond=String.valueOf(formatter.format(item.getCentijoulesecond()));
                strmillijoulesecond=String.valueOf(formatter.format(item.getMillijoulesecond()));
                strmicrojoulesecond=String.valueOf(formatter.format(item.getMicrojoulesecond()));
                strnanojoulesecond=String.valueOf(formatter.format(item.getNanojoulesecond()));
                strpicojoulesecond=String.valueOf(formatter.format(item.getPicojoulesecond()));
                strfemtojoulesecond=String.valueOf(formatter.format(item.getFemtojoulesecond()));
                strattojoulesecond=String.valueOf(formatter.format(item.getAttojoulesecond()));
                strjoulehour=String.valueOf(formatter.format(item.getJoulehour()));
                strjouleminute=String.valueOf(formatter.format(item.getJouleminute()));
                strkilojoulehour=String.valueOf(formatter.format(item.getKilojoulehour()));
                strkilojouleminute=String.valueOf(formatter.format(item.getKilojouleminute()));

                switch (strSpinnerFromvalue1) {
                    case "Watt -W":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Exawatt -EW":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Petawatt -PW":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Terawatt -TW":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gigawatt -GW":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Megawatt -MW":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilowatt -kW":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Hectowatt -hW":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Dekawatt -daW":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Deciwatt -dW":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Centiwatt -cW":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Milliwatt -mW":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Microwatt -μW":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Nanowatt -nW":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Picowatt -pW":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Femtowatt -fW":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Attowatt -aW":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Horsepower -hp,hp(UK)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Horsepower (550 ft*lbf/s) -hp,hp(UK)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Horsepower (metric) -hp(metric)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Horsepower (boiler) -hp(boiler)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Horsepower (electric) -hp(electric)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Horsepower (water) -hp(water)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pferdestarke (ps) -ps":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Btu (IT)/hour -Btu/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Btu (IT)/minute -Btu/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Btu (IT)/second -Btu/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Btu (th)/hour -Btu(th)/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Btu (th)/minute -Btu(th)/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Btu (th)/second -Btu(th)/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "MBtu (IT)/hour -MBtu/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "MBH -MBH":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ton (refrigeration) -ton":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilocalorie (IT)/hour -kcal/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilocalorie (IT)/minute -kcal/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilocalorie (IT)/second -kcal/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilocalorie (th)/hour -kcal(th)/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilocalorie (th)/minute -kcal(th)/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilocalorie (th)/second -kcal(th)/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Calorie (IT)/hour -cal/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Calorie (IT)/minute -cal/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Calorie (IT)/second -cal/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Calorie (th)/hour -cal(th)/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Calorie (th)/minute -cal(th)/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Calorie (th)/second -cal(th)/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Foot pound-force/hour -lbf*ft/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Foot pound-force/minute -lbf*ft/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Foot pound-force/second -lbf*ft/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound-foot/hour -lbf*ft/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound-foot/minute -lbf*ft/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound-foot/second -lbf*ft/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Erg/second -erg/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilovolt ampere -kV*A":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Volt ampere -V*A":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Newton meter/second -N*m/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Joule/second -J/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Exajoule/second -EJ/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Petajoule/second -PJ/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Terajoule/second -TJ/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gigajoule/second -GJ/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Megajoule/second -MJ/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilojoule/second -kJ/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Hectojoule/second -hJ/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Dekajoule/second -daJ/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Decijoule/second -dJ/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Centijoule/second -CJ/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Millijoule/second -mJ/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Microjoule/second -μJ/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Nanojoule/second -nJ/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Picojoule/second -pJ/S":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Femtojoule/second -fJ/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Attojoule/second -aJ/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Joule/hour -J/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Joule/minute -J/min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilojoule/hour -kJ/h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilojoule/minute -kJ/min":
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
            case "Watt -W":
               editTextValueTo.setText(strwatt);
                break;
            case "Exawatt -EW":
               editTextValueTo.setText(strexawatt);
                break;
            case "Petawatt -PW":
               editTextValueTo.setText(strpetawatt);
                break;
            case "Terawatt -TW":
               editTextValueTo.setText(strterawatt);
                break;
            case "Gigawatt -GW":
               editTextValueTo.setText(strgigawatt);
                break;
            case "Megawatt -MW":
               editTextValueTo.setText(strmegawatt);
                break;
            case "Kilowatt -kW":
               editTextValueTo.setText(strkilowatt);
                break;
            case "Hectowatt -hW":
               editTextValueTo.setText(strhectowatt);
                break;
            case "Dekawatt -daW":
               editTextValueTo.setText(strdekawatt);
                break;
            case "Deciwatt -dW":
               editTextValueTo.setText(strdeciwatt);
                break;
            case "Centiwatt -cW":
               editTextValueTo.setText(strcentiwatt);
                break;
            case "Milliwatt -mW":
               editTextValueTo.setText(strmilliwatt);
                break;
            case "Microwatt -μW":
               editTextValueTo.setText(strmicrowatt);
                break;
            case "Nanowatt -nW":
               editTextValueTo.setText(strnanowatt);
                break;
            case "Picowatt -pW":
               editTextValueTo.setText(strpicowatt);
                break;
            case "Femtowatt -fW":
               editTextValueTo.setText(strfemtowatt);
                break;
            case "Attowatt -aW":
               editTextValueTo.setText(strattowatt);
                break;
            case "Horsepower -hp,hp(UK)":
               editTextValueTo.setText(strhorsepower);
                break;
            case "Horsepower (550 ft*lbf/s) -hp,hp(UK)":
               editTextValueTo.setText(strhorsepower550ftlbfs);
                break;
            case "Horsepower (metric) -hp(metric)":
               editTextValueTo.setText(strhorsepowermetric);
                break;
            case "Horsepower (boiler) -hp(boiler)":
               editTextValueTo.setText(strhorsepowerboiler);
                break;
            case "Horsepower (electric) -hp(electric)":
               editTextValueTo.setText(strhorsepowerelectric);
                break;
            case "Horsepower (water) -hp(water)":
               editTextValueTo.setText(strhorsepowerwater);
                break;
            case "Pferdestarke (ps) -ps":
               editTextValueTo.setText(strpferdestarkeps);
                break;
            case "Btu (IT)/hour -Btu/h":
               editTextValueTo.setText(strBtuIThour);
                break;
            case "Btu (IT)/minute -Btu/min":
               editTextValueTo.setText(strBtuITminute);
                break;
            case "Btu (IT)/second -Btu/s":
               editTextValueTo.setText(strBtuITsecond);
                break;
            case "Btu (th)/hour -Btu(th)/h":
               editTextValueTo.setText(strBtuthhour);
                break;
            case "Btu (th)/minute -Btu(th)/min":
               editTextValueTo.setText(strBtuthminute);
                break;
            case "Btu (th)/second -Btu(th)/s":
               editTextValueTo.setText(strBtuthsecond);
                break;
            case "MBtu (IT)/hour -MBtu/h":
               editTextValueTo.setText(strMBtuIThour);
                break;
            case "MBH -MBH":
               editTextValueTo.setText(strMBH);
                break;
            case "Ton (refrigeration) -ton":
               editTextValueTo.setText(strtonrefrigeration);
                break;
            case "Kilocalorie (IT)/hour -kcal/h":
               editTextValueTo.setText(strkilocalorieIThour);
                break;
            case "Kilocalorie (IT)/minute -kcal/min":
               editTextValueTo.setText(strkilocalorieITminute);
                break;
            case "Kilocalorie (IT)/second -kcal/s":
               editTextValueTo.setText(strkilocalorieITsecond);
                break;
            case "Kilocalorie (th)/hour -kcal(th)/h":
               editTextValueTo.setText(strkilocaloriethhour);
                break;
            case "Kilocalorie (th)/minute -kcal(th)/min":
               editTextValueTo.setText(strkilocaloriethminute);
                break;
            case "Kilocalorie (th)/second -kcal(th)/s":
               editTextValueTo.setText(strkilocaloriethsecond);
                break;
            case "Calorie (IT)/hour -cal/h":
               editTextValueTo.setText(strcalorieIThour);
                break;
            case "Calorie (IT)/minute -cal/min":
               editTextValueTo.setText(strcalorieITminute);
                break;
            case "Calorie (IT)/second -cal/s":
               editTextValueTo.setText(strcalorieITsecond);
                break;
            case "Calorie (th)/hour -cal(th)/h":
               editTextValueTo.setText(strcaloriethhour);
                break;
            case "Calorie (th)/minute -cal(th)/min":
               editTextValueTo.setText(strcaloriethminute);
                break;
            case "Calorie (th)/second -cal(th)/s":
               editTextValueTo.setText(strcaloriethsecond);
                break;
            case "Foot pound-force/hour -lbf*ft/h":
               editTextValueTo.setText(strfootpoundforcehour);
                break;
            case "Foot pound-force/minute -lbf*ft/min":
               editTextValueTo.setText(strfootpoundforceminute);
                break;
            case "Foot pound-force/second -lbf*ft/s":
               editTextValueTo.setText(strfootpoundforcesecond);
                break;
            case "Pound-foot/hour -lbf*ft/h":
               editTextValueTo.setText(strpoundfoothour);
                break;
            case "Pound-foot/minute -lbf*ft/min":
               editTextValueTo.setText(strpoundfootminute);
                break;
            case "Pound-foot/second -lbf*ft/s":
               editTextValueTo.setText(strpoundfootsecond);
                break;
            case "Erg/second -erg/s":
               editTextValueTo.setText(strergsecond);
                break;
            case "Kilovolt ampere -kV*A":
               editTextValueTo.setText(strkilovoltampere);
                break;
            case "Volt ampere -V*A":
               editTextValueTo.setText(strvoltampere);
                break;
            case "Newton meter/second -N*m/s":
               editTextValueTo.setText(strnewtonmetersecond);
                break;
            case "Joule/second -J/s":
               editTextValueTo.setText(strjoulesecond);
                break;
            case "Exajoule/second -EJ/s":
               editTextValueTo.setText(strexajoulesecond);
                break;
            case "Petajoule/second -PJ/s":
               editTextValueTo.setText(strpetajoulesecond);
                break;
            case "Terajoule/second -TJ/s":
               editTextValueTo.setText(strterajoulesecond);
                break;
            case "Gigajoule/second -GJ/s":
               editTextValueTo.setText(strgigajoulesecond);
                break;
            case "Megajoule/second -MJ/s":
               editTextValueTo.setText(strmegajoulesecond);
                break;
            case "Kilojoule/second -kJ/s":
               editTextValueTo.setText(strkilojoulesecond);
                break;
            case "Hectojoule/second -hJ/s":
               editTextValueTo.setText(strhectojoulesecond);
                break;
            case "Dekajoule/second -daJ/s":
               editTextValueTo.setText(strdekajoulesecond);
                break;
            case "Decijoule/second -dJ/s":
               editTextValueTo.setText(strdecijoulesecond);
                break;
            case "Centijoule/second -CJ/s":
               editTextValueTo.setText(strcentijoulesecond);
                break;
            case "Millijoule/second -mJ/s":
               editTextValueTo.setText(strmillijoulesecond);
                break;
            case "Microjoule/second -μJ/s":
               editTextValueTo.setText(strmicrojoulesecond);
                break;
            case "Nanojoule/second -nJ/s":
               editTextValueTo.setText(strnanojoulesecond);
                break;
            case "Picojoule/second -pJ/S":
               editTextValueTo.setText(strpicojoulesecond);
                break;
            case "Femtojoule/second -fJ/s":
               editTextValueTo.setText(strfemtojoulesecond);
                break;
            case "Attojoule/second -aJ/s":
               editTextValueTo.setText(strattojoulesecond);
                break;
            case "Joule/hour -J/h":
               editTextValueTo.setText(strjoulehour);
                break;
            case "Joule/minute -J/min":
               editTextValueTo.setText(strjouleminute);
                break;
            case "Kilojoule/hour -kJ/h":
               editTextValueTo.setText(strkilojoulehour);
                break;
            case "Kilojoule/minute -kJ/min":
               editTextValueTo.setText(strkilojouleminute);
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