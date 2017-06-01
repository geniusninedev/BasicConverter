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
import com.nineinfosys.basicconverter.ConverterActivityList.ConversionLenghtListActivity;
import com.nineinfosys.basicconverter.Engin.LengthConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class LengthActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher {


    //declaration of designing tools
    private Spinner spinnerConvertFrom, spinnerConvertTo;
    private EditText editTextValue, editTextValueTo;
    Button buttonConvert;
    private FloatingActionButton buttonList, buttonShare, buttonMail, buttonCopy;
    private SwitchCompat switchChangeType;
    private List<String> listtempFirstfrom, listFirsttempTo, listtempfrom, listtempTo;
    private String stringSpinnerFrom, stringSpinnerTo;
    private TextView textViewBasicUnit, textViewAllUnit,textViewConvert;
    double doubleEdittextvalue = 1.0;
    private int basicunit = 13;
    private int allunit = 92;
    private DecimalFormat formatter = null;
    private static final int REQUEST_CODE = 100;


    LengthConverter.ConversionResults item;
     private String strMeter=null,strKilometer=null,strDecimeter=null,strCentimeter=null,strMillimeter=null,strMicrometer=null,strNanometer=null,strMile=null,strYard=null,strFoot=null,strInch=null,strLightyear=null,
            strExameter=null,strPetameter=null,strTerameter=null,strGigameter=null,strMegameter=null,strHectometer=null,strDekameter=null,strMicron=null,strPicometer=null,strFemtometer=null,strAttometer=null,
            strMegaparsec=null,strKiloparsec=null,strParsec=null,strAstronomicalunit=null,strLeague=null,strNauticalleagueUK=null,strNauticalleagueint=null,strLeaguestatute=null,strNauticalmileUK=null,
            strNauticalmileinternational=null,strMilestatute=null,strMileUSsurvey=null,strMileRoman=null,strKiloyard=null,strFurlong=null,strFurlongUSsurvey=null,strChain=null,strChainUSsurvey=null,
            strRope=null,strRod=null,strRodUSsurvey=null,strPerch=null,strPole=null,strFathom=null,strFathomUSsurvey=null,strEll=null,strFootUSsurvey=null,strLink=null,strLinkUSsurvey=null,strCubitUK=null,
            strHand=null,strSpancloth=null,strFingercloth=null,strNailcloth=null,strInchUSsurvey=null,strBarleycorn=null,strMil=null,strMicroinch=null,strAngstrom=null,strAuoflength=null,strXunit=null,
            strFermi=null,strArpent=null,strPica=null,strPoint=null,strTwip=null,strAln=null,strFamn=null,strCaliber=null,strCentiinch=null,strKen=null,strRussianarchin=null,strRomanactus=null,
            strVaradetarea=null,strVaraconuquera=null,strVaracastellana=null,strCubitGreek=null,strLongreed=null,strReed=null,strLongcubit=null,strHandbreadth=null,strFingerbreadth=null,strPlancklength=null,
            strElectronradiusclassical=null,strBohrradius=null,strEarthsequatorialradius=null,strEarthspolarradius=null,strEarthsdistancefromsun=null,strSunsradius=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);


        //customize toolbar
      /*  android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);*/
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#d3a32b")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Length");



        formatsetting();

        MobileAds.initialize(LengthActivity.this, getString(R.string.ads_app_id));
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
        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.coloryellow)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.coloryellow)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.coloryellow)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.coloryellow)));

        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()),ColorStateList.valueOf(ContextCompat.getColor(this, R.color.coloryellow)));
        // DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getTrackDrawable()), ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRed)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textViewConvert.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.coloryellow)));
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#9e7500"));
        }

        textViewBasicUnit.setText(String.valueOf("Basic Units(" + basicunit + ")"));
        textViewAllUnit.setText(String.valueOf("All Units(" + allunit + ")"));


        //adding value to spinner
        listtempFirstfrom = new ArrayList<String>();
        listFirsttempTo = new ArrayList<String>();


        //for first time running spinner
        listtempFirstfrom.add("Meter -m");
        listtempFirstfrom.add("Kilometer -km");
        listtempFirstfrom.add("Mile -mi,mi(Int)");
        listtempFirstfrom.add("Centimeter -cm");
        listtempFirstfrom.add("Millimeter -mm");
        listtempFirstfrom.add("Foot -ft");
        listtempFirstfrom.add("Inch -in");
        listtempFirstfrom.add("Yard -yd");
        listtempFirstfrom.add("Decimeter -dm");
        listtempFirstfrom.add("Furlong -fur");
        listtempFirstfrom.add("Chain -ch");
        listtempFirstfrom.add("League -lea");
        listtempFirstfrom.add("Nautical mile (UK) -n.mi");

        //for first time running spinner
        listFirsttempTo.add("Meter -m");
        listFirsttempTo.add("Kilometer -km");
        listFirsttempTo.add("Mile -mi,mi(Int)");
        listFirsttempTo.add("Centimeter -cm");
        listFirsttempTo.add("Millimeter -mm");
        listFirsttempTo.add("Foot -ft");
        listFirsttempTo.add("Inch -in");
        listFirsttempTo.add("Yard -yd");
        listFirsttempTo.add("Decimeter -dm");
        listFirsttempTo.add("Furlong -fur");
        listFirsttempTo.add("Chain -ch");
        listFirsttempTo.add("League -lea");
        listFirsttempTo.add("Nautical mile (UK) -n.mi");

        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(LengthActivity.this, android.R.layout.simple_spinner_item, listtempFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(LengthActivity.this, android.R.layout.simple_spinner_item, listFirsttempTo);


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
                        listtempfrom.add("Meter -m");
                        listtempfrom.add("Kilometer -km");
                        listtempfrom.add("Mile -mi,mi(Int)");
                        listtempfrom.add("Centimeter -cm");
                        listtempfrom.add("Millimeter -mm");
                        listtempfrom.add("Foot -ft");
                        listtempfrom.add("Inch -in");
                        listtempfrom.add("Yard -yd");
                        listtempfrom.add("Decimeter -dm");
                        listtempfrom.add("Furlong -fur");
                        listtempfrom.add("Chain -ch");
                        listtempfrom.add("League -lea");
                        listtempfrom.add("Nautical mile (UK) -n.mi");


                        //2 spinner
                        listtempTo.add("Meter -m");
                        listtempTo.add("Kilometer -km");
                        listtempTo.add("Mile -mi,mi(Int)");
                        listtempTo.add("Centimeter -cm");
                        listtempTo.add("Millimeter -mm");
                        listtempTo.add("Foot -ft");
                        listtempTo.add("Inch -in");
                        listtempTo.add("Yard -yd");
                        listtempTo.add("Decimeter -dm");
                        listtempTo.add("Furlong -fur");
                        listtempTo.add("Chain -ch");
                        listtempTo.add("League -lea");
                        listtempTo.add("Nautical mile (UK) -n.mi");
                        break;

                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strAdvance + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listtempfrom.clear();
                        listtempTo.clear();
                        listtempfrom.add("Meter -m");
                        listtempfrom.add("Kilometer -km");
                        listtempfrom.add("Decimeter -dm");
                        listtempfrom.add("Centimeter -cm");
                        listtempfrom.add("Millimeter -mm");
                        listtempfrom.add("Micrometer -μm");
                        listtempfrom.add("Nanometer -nm");
                        listtempfrom.add("Mile -mi,mi(Int)");
                        listtempfrom.add("Yard -yd");
                        listtempfrom.add("Foot -ft");
                        listtempfrom.add("Inch -in");
                        listtempfrom.add("Light year -ly");
                        listtempfrom.add("Exameter -Em");
                        listtempfrom.add("Petameter -Pm");
                        listtempfrom.add("Terameter -Tm");
                        listtempfrom.add("Gigameter -Gm");
                        listtempfrom.add("Megameter -Mm");
                        listtempfrom.add("Hectometer -hm");
                        listtempfrom.add("Dekameter -dam");
                        listtempfrom.add("Micron -μ");
                        listtempfrom.add("Picometer -pm");
                        listtempfrom.add("Femtometer -fm");
                        listtempfrom.add("Attometer -am");
                        listtempfrom.add("Megaparsec -Mpc");
                        listtempfrom.add("Kiloparsec -kpc");
                        listtempfrom.add("Parsec -pc");
                        listtempfrom.add("Astronomical unit -AU,UA");
                        listtempfrom.add("League -lea");
                        listtempfrom.add("Nautical league (UK) -n.lea(UK)");
                        listtempfrom.add("Nautical league (int.) -n.lea");
                        listtempfrom.add("League (statute) -lea(US)");
                        listtempfrom.add("Nautical mile (UK) -n.mi");
                        listtempfrom.add("Nautical mile (international) -n.mi");
                        listtempfrom.add("Mile (statute) -mi,mi(US)");
                        listtempfrom.add("Mile (US survey) -mi,mi(US)");
                        listtempfrom.add("Mile (Roman)-mile");
                        listtempfrom.add("Kiloyard -kyd");
                        listtempfrom.add("Furlong -fur");
                        listtempfrom.add("Furlong (US survey) -fur");
                        listtempfrom.add("Chain -ch");
                        listtempfrom.add("Chain (US survey) -ch");
                        listtempfrom.add("Rope -rope");
                        listtempfrom.add("Rod -rd");
                        listtempfrom.add("Rod (US survey) -rd");
                        listtempfrom.add("Perch -perch");
                        listtempfrom.add("Pole -pole");
                        listtempfrom.add("Fathom -fath");
                        listtempfrom.add("Fathom (US survey) -fath");
                        listtempfrom.add("Ell -ell");
                        listtempfrom.add("Foot (US survey) -ft");
                        listtempfrom.add("Link -li");
                        listtempfrom.add("Link (US survey) -li");
                        listtempfrom.add("Cubit (UK) -cubit");
                        listtempfrom.add("Hand -hand");
                        listtempfrom.add("Span (cloth) -span");
                        listtempfrom.add("Finger (cloth) -finger");
                        listtempfrom.add("Nail (cloth) -nail");
                        listtempfrom.add("Inch (US survey) -in");
                        listtempfrom.add("Barleycorn -barleycorn");
                        listtempfrom.add("Mil -mil,thou");
                        listtempfrom.add("Microinch -μ.in");
                        listtempfrom.add("Angstrom -A");
                        listtempfrom.add("A.u. of length -a.u.,b");
                        listtempfrom.add("X-unit -X");
                        listtempfrom.add("Fermi -F,f");
                        listtempfrom.add("Arpent -Arpent");
                        listtempfrom.add("Pica -pica");
                        listtempfrom.add("Point -Point");
                        listtempfrom.add("Twip  -twip");
                        listtempfrom.add("Aln -aln");
                        listtempfrom.add("Famn -famn");
                        listtempfrom.add("Caliber -cl");
                        listtempfrom.add("Centiinch -cin");
                        listtempfrom.add("Ken -ken");
                        listtempfrom.add("Russian archin -archin");
                        listtempfrom.add("Roman actus -actus");
                        listtempfrom.add("Vara de tarea -v.de.t");
                        listtempfrom.add("Vara conuquera -vc");
                        listtempfrom.add("Vara castellana -vcas");
                        listtempfrom.add("Cubit (Greek) -cubit");
                        listtempfrom.add("Long reed -lreed");
                        listtempfrom.add("Reed -reed");
                        listtempfrom.add("Long cubit -long cubit");
                        listtempfrom.add("Handbreadth -hb");
                        listtempfrom.add("Fingerbreadth -fb");
                        listtempfrom.add("Planck length -Planck");
                        listtempfrom.add("Electron radius (classical) -e-rad");
                        listtempfrom.add("Bohr radius -b,a.u.:");
                        listtempfrom.add("Earth's equatorial radius -Earth");
                        listtempfrom.add("Earth's polar radius -Earth");
                        listtempfrom.add("Earth's distance from sun -Earth");
                        listtempfrom.add("Sun's radius -Sun");


                        //second spinner
                        listtempTo.add("Meter -m");
                        listtempTo.add("Kilometer -km");
                        listtempTo.add("Decimeter -dm");
                        listtempTo.add("Centimeter -cm");
                        listtempTo.add("Millimeter -mm");
                        listtempTo.add("Micrometer -μm");
                        listtempTo.add("Nanometer -nm");
                        listtempTo.add("Mile -mi,mi(Int)");
                        listtempTo.add("Yard -yd");
                        listtempTo.add("Foot -ft");
                        listtempTo.add("Inch -in");
                        listtempTo.add("Light year -ly");
                        listtempTo.add("Exameter -Em");
                        listtempTo.add("Petameter -Pm");
                        listtempTo.add("Terameter -Tm");
                        listtempTo.add("Gigameter -Gm");
                        listtempTo.add("Megameter -Mm");
                        listtempTo.add("Hectometer -hm");
                        listtempTo.add("Dekameter -dam");
                        listtempTo.add("Micron -μ");
                        listtempTo.add("Picometer -pm");
                        listtempTo.add("Femtometer -fm");
                        listtempTo.add("Attometer -am");
                        listtempTo.add("Megaparsec -Mpc");
                        listtempTo.add("Kiloparsec -kpc");
                        listtempTo.add("Parsec -pc");
                        listtempTo.add("Astronomical unit -AU,UA");
                        listtempTo.add("League -lea");
                        listtempTo.add("Nautical league (UK) -n.lea(UK)");
                        listtempTo.add("Nautical league (int.) -n.lea");
                        listtempTo.add("League (statute) -lea(US)");
                        listtempTo.add("Nautical mile (UK) -n.mi");
                        listtempTo.add("Nautical mile (international) -n.mi");
                        listtempTo.add("Mile (statute) -mi,mi(US)");
                        listtempTo.add("Mile (US survey) -mi,mi(US)");
                        listtempTo.add("Mile (Roman)-mile");
                        listtempTo.add("Kiloyard -kyd");
                        listtempTo.add("Furlong -fur");
                        listtempTo.add("Furlong (US survey) -fur");
                        listtempTo.add("Chain -ch");
                        listtempTo.add("Chain (US survey) -ch");
                        listtempTo.add("Rope -rope");
                        listtempTo.add("Rod -rd");
                        listtempTo.add("Rod (US survey) -rd");
                        listtempTo.add("Perch -perch");
                        listtempTo.add("Pole -pole");
                        listtempTo.add("Fathom -fath");
                        listtempTo.add("Fathom (US survey) -fath");
                        listtempTo.add("Ell -ell");
                        listtempTo.add("Foot (US survey) -ft");
                        listtempTo.add("Link -li");
                        listtempTo.add("Link (US survey) -li");
                        listtempTo.add("Cubit (UK) -cubit");
                        listtempTo.add("Hand -hand");
                        listtempTo.add("Span (cloth) -span");
                        listtempTo.add("Finger (cloth) -finger");
                        listtempTo.add("Nail (cloth) -nail");
                        listtempTo.add("Inch (US survey) -in");
                        listtempTo.add("Barleycorn -barleycorn");
                        listtempTo.add("Mil -mil,thou");
                        listtempTo.add("Microinch -μ.in");
                        listtempTo.add("Angstrom -A");
                        listtempTo.add("A.u. of length -a.u.,b");
                        listtempTo.add("X-unit -X");
                        listtempTo.add("Fermi -F,f");
                        listtempTo.add("Arpent -Arpent");
                        listtempTo.add("Pica -pica");
                        listtempTo.add("Point -Point");
                        listtempTo.add("Twip  -twip");
                        listtempTo.add("Aln -aln");
                        listtempTo.add("Famn -famn");
                        listtempTo.add("Caliber -cl");
                        listtempTo.add("Centiinch -cin");
                        listtempTo.add("Ken -ken");
                        listtempTo.add("Russian archin -archin");
                        listtempTo.add("Roman actus -actus");
                        listtempTo.add("Vara de tarea -v.de.t");
                        listtempTo.add("Vara conuquera -vc");
                        listtempTo.add("Vara castellana -vcas");
                        listtempTo.add("Cubit (Greek) -cubit");
                        listtempTo.add("Long reed -lreed");
                        listtempTo.add("Reed -reed");
                        listtempTo.add("Long cubit -long cubit");
                        listtempTo.add("Handbreadth -hb");
                        listtempTo.add("Fingerbreadth -fb");
                        listtempTo.add("Planck length -Planck");
                        listtempTo.add("Electron radius (classical) -e-rad");
                        listtempTo.add("Bohr radius -b,a.u.:");
                        listtempTo.add("Earth's equatorial radius -Earth");
                        listtempTo.add("Earth's polar radius -Earth");
                        listtempTo.add("Earth's distance from sun -Earth");
                        listtempTo.add("Sun's radius -Sun");

                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(LengthActivity.this, android.R.layout.simple_spinner_item, listtempfrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(LengthActivity.this, android.R.layout.simple_spinner_item, listtempTo);


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
                Intent i = new Intent(this, ConversionLenghtListActivity.class);
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

            LengthConverter c = new LengthConverter(strSpinnerFromvalue1, doubleEdittextvalue1);
            ArrayList<LengthConverter.ConversionResults> results = c.calculateLengthConversion();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);
                strMeter=String.valueOf(formatter.format(item.getMeter()));
                strKilometer=String.valueOf(formatter.format(item.getKilometer()));
                strDecimeter=String.valueOf(formatter.format(item.getDecimeter()));
                strCentimeter=String.valueOf(formatter.format(item.getCentimeter()));
                strMillimeter=String.valueOf(formatter.format(item.getMillimeter()));
                strMicrometer=String.valueOf(formatter.format(item.getMicrometer()));
                strNanometer=String.valueOf(formatter.format(item.getNanometer()));
                strMile=String.valueOf(formatter.format(item.getMile()));
                strYard=String.valueOf(formatter.format(item.getYard()));
                strFoot=String.valueOf(formatter.format(item.getFoot()));
                strInch=String.valueOf(formatter.format(item.getInch()));
                strLightyear=String.valueOf(formatter.format(item.getLightyear()));
                strExameter=String.valueOf(formatter.format(item.getExameter()));
                strPetameter=String.valueOf(formatter.format(item.getPetameter()));
                strTerameter=String.valueOf(formatter.format(item.getTerameter()));
                strGigameter=String.valueOf(formatter.format(item.getGigameter()));
                strMegameter=String.valueOf(formatter.format(item.getMegameter()));
                strHectometer=String.valueOf(formatter.format(item.getHectometer()));
                strDekameter=String.valueOf(formatter.format(item.getDekameter()));
                strMicron=String.valueOf(formatter.format(item.getMicron()));
                strPicometer=String.valueOf(formatter.format(item.getPicometer()));
                strFemtometer=String.valueOf(formatter.format(item.getFemtometer()));
                strAttometer=String.valueOf(formatter.format(item.getAttometer()));
                strMegaparsec=String.valueOf(formatter.format(item.getMegaparsec()));
                strKiloparsec=String.valueOf(formatter.format(item.getKiloparsec()));
                strParsec=String.valueOf(formatter.format(item.getParsec()));
                strAstronomicalunit=String.valueOf(formatter.format(item.getAstronomicalunit()));
                strLeague=String.valueOf(formatter.format(item.getLeague()));
                strNauticalleagueUK=String.valueOf(formatter.format(item.getNauticalleagueUK()));
                strNauticalleagueint=String.valueOf(formatter.format(item.getNauticalleagueint()));
                strLeaguestatute=String.valueOf(formatter.format(item.getLeaguestatute()));
                strNauticalmileUK=String.valueOf(formatter.format(item.getNauticalmileUK()));
                strNauticalmileinternational=String.valueOf(formatter.format(item.getNauticalmileinternational()));
                strMilestatute=String.valueOf(formatter.format(item.getMilestatute()));
                strMileUSsurvey=String.valueOf(formatter.format(item.getMileUSsurvey()));
                strMileRoman=String.valueOf(formatter.format(item.getMileRoman()));
                strKiloyard=String.valueOf(formatter.format(item.getKiloyard()));
                strFurlong=String.valueOf(formatter.format(item.getFurlong()));
                strFurlongUSsurvey=String.valueOf(formatter.format(item.getFurlongUSsurvey()));
                strChain=String.valueOf(formatter.format(item.getChain()));
                strChainUSsurvey=String.valueOf(formatter.format(item.getChainUSsurvey()));
                strRope=String.valueOf(formatter.format(item.getRope()));
                strRod=String.valueOf(formatter.format(item.getRod()));
                strRodUSsurvey=String.valueOf(formatter.format(item.getRodUSsurvey()));
                strPerch=String.valueOf(formatter.format(item.getPerch()));
                strPole=String.valueOf(formatter.format(item.getPole()));
                strFathom=String.valueOf(formatter.format(item.getFathom()));
                strFathomUSsurvey=String.valueOf(formatter.format(item.getFathomUSsurvey()));
                strEll=String.valueOf(formatter.format(item.getEll()));
                strFootUSsurvey=String.valueOf(formatter.format(item.getFootUSsurvey()));
                strLink=String.valueOf(formatter.format(item.getLink()));
                strLinkUSsurvey=String.valueOf(formatter.format(item.getLinkUSsurvey()));
                strCubitUK=String.valueOf(formatter.format(item.getCubitUK()));
                strHand=String.valueOf(formatter.format(item.getHand()));
                strSpancloth=String.valueOf(formatter.format(item.getSpancloth()));
                strFingercloth=String.valueOf(formatter.format(item.getFingercloth()));
                strNailcloth=String.valueOf(formatter.format(item.getNailcloth()));
                strInchUSsurvey=String.valueOf(formatter.format(item.getInchUSsurvey()));
                strBarleycorn=String.valueOf(formatter.format(item.getBarleycorn()));
                strMil=String.valueOf(formatter.format(item.getMil()));
                strMicroinch=String.valueOf(formatter.format(item.getMicroinch()));
                strAngstrom=String.valueOf(formatter.format(item.getAngstrom()));
                strAuoflength=String.valueOf(formatter.format(item.getAuoflength()));
                strXunit=String.valueOf(formatter.format(item.getXunit()));
                strFermi=String.valueOf(formatter.format(item.getFermi()));
                strArpent=String.valueOf(formatter.format(item.getArpent()));
                strPica=String.valueOf(formatter.format(item.getPica()));
                strPoint=String.valueOf(formatter.format(item.getPoint()));
                strTwip=String.valueOf(formatter.format(item.getTwip()));
                strAln=String.valueOf(formatter.format(item.getAln()));
                strFamn=String.valueOf(formatter.format(item.getFamn()));
                strCaliber=String.valueOf(formatter.format(item.getCaliber()));
                strCentiinch=String.valueOf(formatter.format(item.getCentiinch()));
                strKen=String.valueOf(formatter.format(item.getKen()));
                strRussianarchin=String.valueOf(formatter.format(item.getRussianarchin()));
                strRomanactus=String.valueOf(formatter.format(item.getRomanactus()));
                strVaradetarea=String.valueOf(formatter.format(item.getVaradetarea()));
                strVaraconuquera=String.valueOf(formatter.format(item.getVaraconuquera()));
                strVaracastellana=String.valueOf(formatter.format(item.getVaracastellana()));
                strCubitGreek=String.valueOf(formatter.format(item.getCubitGreek()));
                strLongreed=String.valueOf(formatter.format(item.getLongreed()));
                strReed=String.valueOf(formatter.format(item.getReed()));
                strLongcubit=String.valueOf(formatter.format(item.getLongcubit()));
                strHandbreadth=String.valueOf(formatter.format(item.getHandbreadth()));
                strFingerbreadth=String.valueOf(formatter.format(item.getFingerbreadth()));
                strPlancklength=String.valueOf(formatter.format(item.getPlancklength()));
                strElectronradiusclassical=String.valueOf(formatter.format(item.getElectronradiusclassical()));
                strBohrradius=String.valueOf(formatter.format(item.getBohrradius()));
                strEarthsequatorialradius=String.valueOf(formatter.format(item.getEarthsequatorialradius()));
                strEarthspolarradius=String.valueOf(formatter.format(item.getEarthspolarradius()));
                strEarthsdistancefromsun=String.valueOf(formatter.format(item.getEarthsdistancefromsun()));
                strSunsradius=String.valueOf(formatter.format(item.getSunsradius()));

                switch (strSpinnerFromvalue1) {
                    case "Meter -m":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilometer -km":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Decimeter -dm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Centimeter -cm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Millimeter -mm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Micrometer -μm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Nanometer -nm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Mile -mi,mi(Int)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Yard -yd":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Foot -ft":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Inch -in":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Light year -ly":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Exameter -Em":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Petameter -Pm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Terameter -Tm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gigameter -Gm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Megameter -Mm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Hectometer -hm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Dekameter -dam":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Micron -μ":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Picometer -pm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Femtometer -fm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Attometer -am":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Megaparsec -Mpc":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kiloparsec -kpc":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Parsec -pc":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Astronomical unit -AU,UA":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "League -lea":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Nautical league (UK) -n.lea(UK)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Nautical league (int.) -n.lea":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "League (statute) -lea(US)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Nautical mile (UK) -n.mi":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Nautical mile (international) -n.mi":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Mile (statute) -mi,mi(US)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Mile (US survey) -mi,mi(US)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Mile (Roman)-mile":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kiloyard -kyd":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Furlong -fur":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Furlong (US survey) -fur":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Chain -ch":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Chain (US survey) -ch":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Rope -rope":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Rod -rd":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Rod (US survey) -rd":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Perch -perch":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pole -pole":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Fathom -fath":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Fathom (US survey) -fath":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ell -ell":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Foot (US survey) -ft":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Link -li":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Link (US survey) -li":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cubit (UK) -cubit":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Hand -hand":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Span (cloth) -span":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Finger (cloth) -finger":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Nail (cloth) -nail":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Inch (US survey) -in":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Barleycorn -barleycorn":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Mil -mil,thou":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Microinch -μ.in":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Angstrom -A":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "A.u. of length -a.u.,b":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "X-unit -X":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Fermi -F,f":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Arpent -Arpent":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pica -pica":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Point -Point":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Twip  -twip":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Aln -aln":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Famn -famn":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Caliber -cl":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Centiinch -cin":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ken -ken":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Russian archin -archin":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Roman actus -actus":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Vara de tarea -v.de.t":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Vara conuquera -vc":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Vara castellana -vcas":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cubit (Greek) -cubit":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Long reed -lreed":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Reed -reed":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Long cubit -long cubit":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Handbreadth -hb":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Fingerbreadth -fb":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Planck length -Planck":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Electron radius (classical) -e-rad":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Bohr radius -b,a.u.:":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Earth's equatorial radius -Earth":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Earth's polar radius -Earth":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Earth's distance from sun -Earth":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Sun's radius -Sun":
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
            case "Meter -m":
                editTextValueTo.setText(strMeter);
                break;
            case "Kilometer -km":
                editTextValueTo.setText(strKilometer);
                break;
            case "Decimeter -dm":
                editTextValueTo.setText(strDecimeter);
                break;
            case "Centimeter -cm":
                editTextValueTo.setText(strCentimeter);
                break;
            case "Millimeter -mm":
                editTextValueTo.setText(strMillimeter);
                break;
            case "Micrometer -μm":
                editTextValueTo.setText(strMicrometer);
                break;
            case "Nanometer -nm":
                editTextValueTo.setText(strNanometer);
                break;
            case "Mile -mi,mi(Int)":
                editTextValueTo.setText(strMile);
                break;
            case "Yard -yd":
                editTextValueTo.setText(strYard);
                break;
            case "Foot -ft":
                editTextValueTo.setText(strFoot);
                break;
            case "Inch -in":
                editTextValueTo.setText(strInch);
                break;
            case "Light year -ly":
                editTextValueTo.setText(strLightyear);
                break;
            case "Exameter -Em":
                editTextValueTo.setText(strExameter);
                break;
            case "Petameter -Pm":
                editTextValueTo.setText(strPetameter);
                break;
            case "Terameter -Tm":
                editTextValueTo.setText(strTerameter);
                break;
            case "Gigameter -Gm":
                editTextValueTo.setText(strGigameter);
                break;
            case "Megameter -Mm":
                editTextValueTo.setText(strMegameter);
                break;
            case "Hectometer -hm":
                editTextValueTo.setText(strHectometer);
                break;
            case "Dekameter -dam":
                editTextValueTo.setText(strDekameter);
                break;
            case "Micron -μ":
                editTextValueTo.setText(strMicron);
                break;
            case "Picometer -pm":
                editTextValueTo.setText(strPicometer);
                break;
            case "Femtometer -fm":
                editTextValueTo.setText(strFemtometer);
                break;
            case "Attometer -am":
                editTextValueTo.setText(strAttometer);
                break;
            case "Megaparsec -Mpc":
                editTextValueTo.setText(strMegaparsec);
                break;
            case "Kiloparsec -kpc":
                editTextValueTo.setText(strKiloparsec);
                break;
            case "Parsec -pc":
                editTextValueTo.setText(strParsec);
                break;
            case "Astronomical unit -AU,UA":
                editTextValueTo.setText(strAstronomicalunit);
                break;
            case "League -lea":
                editTextValueTo.setText(strLeague);
                break;
            case "Nautical league (UK) -n.lea(UK)":
                editTextValueTo.setText(strNauticalleagueUK);
                break;
            case "Nautical league (int.) -n.lea":
                editTextValueTo.setText(strNauticalleagueint);
                break;
            case "League (statute) -lea(US)":
                editTextValueTo.setText(strLeaguestatute);
                break;
            case "Nautical mile (UK) -n.mi":
                editTextValueTo.setText(strNauticalmileUK);
                break;
            case "Nautical mile (international) -n.mi":
                editTextValueTo.setText(strNauticalmileinternational);
                break;
            case "Mile (statute) -mi,mi(US)":
                editTextValueTo.setText(strMilestatute);
                break;
            case "Mile (US survey) -mi,mi(US)":
                editTextValueTo.setText(strMileUSsurvey);
                break;
            case "Mile (Roman)-mile":
                editTextValueTo.setText(strMileRoman);
                break;
            case "Kiloyard -kyd":
                editTextValueTo.setText(strKiloyard);
                break;
            case "Furlong -fur":
                editTextValueTo.setText(strFurlong);
                break;
            case "Furlong (US survey) -fur":
                editTextValueTo.setText(strFurlongUSsurvey);
                break;
            case "Chain -ch":
                editTextValueTo.setText(strChain);
                break;
            case "Chain (US survey) -ch":
                editTextValueTo.setText(strChainUSsurvey);
                break;
            case "Rope -rope":
                editTextValueTo.setText(strRope);
                break;
            case "Rod -rd":
                editTextValueTo.setText(strRod);
                break;
            case "Rod (US survey) -rd":
                editTextValueTo.setText(strRodUSsurvey);
                break;
            case "Perch -perch":
                editTextValueTo.setText(strPerch);
                break;
            case "Pole -pole":
                editTextValueTo.setText(strPole);
                break;
            case "Fathom -fath":
                editTextValueTo.setText(strFathom);
                break;
            case "Fathom (US survey) -fath":
                editTextValueTo.setText(strFathomUSsurvey);
                break;
            case "Ell -ell":
                editTextValueTo.setText(strEll);
                break;
            case "Foot (US survey) -ft":
                editTextValueTo.setText(strFootUSsurvey);
                break;
            case "Link -li":
                editTextValueTo.setText(strLink);
                break;
            case "Link (US survey) -li":
                editTextValueTo.setText(strLinkUSsurvey);
                break;
            case "Cubit (UK) -cubit":
                editTextValueTo.setText(strCubitUK);
                break;
            case "Hand -hand":
                editTextValueTo.setText(strHand);
                break;
            case "Span (cloth) -span":
                editTextValueTo.setText(strSpancloth);
                break;
            case "Finger (cloth) -finger":
                editTextValueTo.setText(strFingercloth);
                break;
            case "Nail (cloth) -nail":
                editTextValueTo.setText(strNailcloth);
                break;
            case "Inch (US survey) -in":
                editTextValueTo.setText(strInchUSsurvey);
                break;
            case "Barleycorn -barleycorn":
                editTextValueTo.setText(strBarleycorn);
                break;
            case "Mil -mil,thou":
                editTextValueTo.setText(strMil);
                break;
            case "Microinch -μ.in":
                editTextValueTo.setText(strMicroinch);
                break;
            case "Angstrom -A":
                editTextValueTo.setText(strAngstrom);
                break;
            case "A.u. of length -a.u.,b":
                editTextValueTo.setText(strAuoflength);
                break;
            case "X-unit -X":
                editTextValueTo.setText(strXunit);
                break;
            case "Fermi -F,f":
                editTextValueTo.setText(strFermi);
                break;
            case "Arpent -Arpent":
                editTextValueTo.setText(strArpent);
                break;
            case "Pica -pica":
                editTextValueTo.setText(strPica);
                break;
            case "Point -Point":
                editTextValueTo.setText(strPoint);
                break;
            case "Twip  -twip":
                editTextValueTo.setText(strTwip);
                break;
            case "Aln -aln":
                editTextValueTo.setText(strAln);
                break;
            case "Famn -famn":
                editTextValueTo.setText(strFamn);
                break;
            case "Caliber -cl":
                editTextValueTo.setText(strCaliber);
                break;
            case "Centiinch -cin":
                editTextValueTo.setText(strCentiinch);
                break;
            case "Ken -ken":
                editTextValueTo.setText(strKen);
                break;
            case "Russian archin -archin":
                editTextValueTo.setText(strRussianarchin);
                break;
            case "Roman actus -actus":
                editTextValueTo.setText(strRomanactus);
                break;
            case "Vara de tarea -v.de.t":
                editTextValueTo.setText(strVaradetarea);
                break;
            case "Vara conuquera -vc":
                editTextValueTo.setText(strVaraconuquera);
                break;
            case "Vara castellana -vcas":
                editTextValueTo.setText(strVaracastellana);
                break;
            case "Cubit (Greek) -cubit":
                editTextValueTo.setText(strCubitGreek);
                break;
            case "Long reed -lreed":
                editTextValueTo.setText(strLongreed);
                break;
            case "Reed -reed":
                editTextValueTo.setText(strReed);
                break;
            case "Long cubit -long cubit":
                editTextValueTo.setText(strLongcubit);
                break;
            case "Handbreadth -hb":
                editTextValueTo.setText(strHandbreadth);
                break;
            case "Fingerbreadth -fb":
                editTextValueTo.setText(strFingerbreadth);
                break;
            case "Planck length -Planck":
                editTextValueTo.setText(strPlancklength);
                break;
            case "Electron radius (classical) -e-rad":
                editTextValueTo.setText(strElectronradiusclassical);
                break;
            case "Bohr radius -b,a.u.:":
                editTextValueTo.setText(strBohrradius);
                break;
            case "Earth's equatorial radius -Earth":
                editTextValueTo.setText(strEarthsequatorialradius);
                break;
            case "Earth's polar radius -Earth":
                editTextValueTo.setText(strEarthspolarradius);
                break;
            case "Earth's distance from sun -Earth":
                editTextValueTo.setText(strEarthsdistancefromsun);
                break;
            case "Sun's radius -Sun":
                editTextValueTo.setText(strSunsradius);
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