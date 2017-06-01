package com.nineinfosys.basicconverter.ConverterActivityList;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.print.PrintHelper;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.nineinfosys.basicconverter.Adapter.RecyclerViewConversionListAdapter;
import com.nineinfosys.basicconverter.Engin.PressureConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.ItemList;
import com.nineinfosys.basicconverter.Supporter.Settings;


import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversionPressureListAvtivity extends AppCompatActivity implements TextWatcher {

    List<ItemList> list = new ArrayList<ItemList>();
    private  String stringSpinnerFrom;
    private double doubleEdittextvalue;
    private EditText edittextConversionListvalue;
    private TextView textconversionFrom,textViewConversionShortform;
    View ChildView ;

    private static final int REQUEST_CODE = 100;
    private File imageFile;
    private Bitmap bitmap;
    private PrintHelper printhelper;

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
    DecimalFormat formatter = null;


    private RecyclerView rView;
    RecyclerViewConversionListAdapter rcAdapter;
    List<ItemList> rowListItem,rowListItem1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_list);

        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#757575")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#707070"));
        }

        MobileAds.initialize(ConversionPressureListAvtivity.this, getString(R.string.ads_app_id));
        AdView mAdView = (AdView) findViewById(R.id.adViewUnitConverterList);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        //format of decimal pint
        formatsetting();


        edittextConversionListvalue=(EditText)findViewById(R.id.edittextConversionListvalue) ;
        textconversionFrom=(TextView) findViewById(R.id.textViewConversionFrom) ;
        textViewConversionShortform=(TextView) findViewById(R.id.textViewConversionShortform) ;

        //get the value from temperture activity
        stringSpinnerFrom = getIntent().getExtras().getString("stringSpinnerFrom");
        doubleEdittextvalue= getIntent().getExtras().getDouble("doubleEdittextvalue");
        edittextConversionListvalue.setText(String.valueOf(doubleEdittextvalue));

        NamesAndShortform(stringSpinnerFrom);

        //   Toast.makeText(this,"string1 "+stringSpinnerFrom,Toast.LENGTH_LONG).show();
        rowListItem = getAllunitValue(stringSpinnerFrom,doubleEdittextvalue);

        //Initializing Views
        rView = (RecyclerView) findViewById(R.id.recyclerViewConverterList);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(new GridLayoutManager(this, 1));


        //Initializing our superheroes list
        rcAdapter = new RecyclerViewConversionListAdapter(this,rowListItem);
        rView.setAdapter(rcAdapter);

        edittextConversionListvalue.addTextChangedListener(this);



    }


    private void NamesAndShortform(String stringSpinnerFrom) {
        switch (stringSpinnerFrom) {
            case "Pascal - Pa":
                textconversionFrom.setText("Pascal");
                textViewConversionShortform.setText("Pa");
                break;
            case "Kilopascal - kPa":
                textconversionFrom.setText("Kilopascal");
                textViewConversionShortform.setText("kPa");
                break;
            case "Bar - b":
                textconversionFrom.setText("Bar");
                textViewConversionShortform.setText("b");
                break;
            case "Psi - psi":
                textconversionFrom.setText("Psi");
                textViewConversionShortform.setText("psi");
                break;
            case "Ksi - ksi":
                textconversionFrom.setText("Ksi");
                textViewConversionShortform.setText("ksi");
                break;
            case "Atmosphere - atm":
                textconversionFrom.setText("Atmosphere");
                textViewConversionShortform.setText("atm");
                break;
            case "Exapascal - EPa":
                textconversionFrom.setText("Exapascal");
                textViewConversionShortform.setText("EPa");
                break;
            case "Petapascal - PPa":
                textconversionFrom.setText("Petapascal");
                textViewConversionShortform.setText("PPa");
                break;
            case "Terapascal - TPa":
                textconversionFrom.setText("Terapascal");
                textViewConversionShortform.setText("TPa");
                break;
            case "Gigapascal - GPa":
                textconversionFrom.setText("Gigapascal");
                textViewConversionShortform.setText("GPa");
                break;
            case "Megapascal - MPa":
                textconversionFrom.setText("Megapascal");
                textViewConversionShortform.setText("MPa");
                break;
            case "Hectopascal - hPa":
                textconversionFrom.setText("Hectopascal");
                textViewConversionShortform.setText("hPa");
                break;
            case "Deckapascal - daPa":
                textconversionFrom.setText("Deckapascal");
                textViewConversionShortform.setText("daPa");
                break;
            case "Decipascal - dPa":
                textconversionFrom.setText("Decipascal");
                textViewConversionShortform.setText("dPa");
                break;
            case "Centipascal - cPa":
                textconversionFrom.setText("Centipascal");
                textViewConversionShortform.setText("cPa");
                break;
            case "Millipascal - mPa":
                textconversionFrom.setText("Millipascal");
                textViewConversionShortform.setText("mPa");
                break;

            case "Micropascal - μPa":
                textconversionFrom.setText("Micropascal");
                textViewConversionShortform.setText("μPa");
                break;
            case "Nanopascal - nPa":
                textconversionFrom.setText("Nanopascal");
                textViewConversionShortform.setText("nPa");
                break;

            case "Picopascal - pPa":
                textconversionFrom.setText("Picopascal");
                textViewConversionShortform.setText("pPa");
                break;
            case "Femtopascal - fPa":
                textconversionFrom.setText("Femtopascal");
                textViewConversionShortform.setText("fPa");
                break;
            case "Attopascal - aPa":
                textconversionFrom.setText("Attopascal");
                textViewConversionShortform.setText("aPa");
                break;
            case "Newton/square meter - N/m²":
                textconversionFrom.setText("Newton/square meter");
                textViewConversionShortform.setText("N/m²");
                break;
            case "Newton/square centimeter - N/cm²":
                textconversionFrom.setText("Newton/square centimeter");
                textViewConversionShortform.setText("N/cm²");
                break;

            case "Newton/square millimeter - N/mm²":
                textconversionFrom.setText("Newton/square millimeter");
                textViewConversionShortform.setText("N/mm²");
                break;
            case "Kilonewton/square meter - kN/m²":
                textconversionFrom.setText("Kilonewton/square meter");
                textViewConversionShortform.setText("kN/m²");
                break;
            case "Millibar - mbar":
                textconversionFrom.setText("Millibar");
                textViewConversionShortform.setText("mbar");
                break;
            case "Microbar - μbar":
                textconversionFrom.setText("Microbar");
                textViewConversionShortform.setText("μbar");
                break;
            case "Dyne/square centimeter - dyn/cm²":
                textconversionFrom.setText("Dyne/square centimeter");
                textViewConversionShortform.setText("dyn/cm²");
                break;
            case "Kilogram-force/square meter - kgf/m²":
                textconversionFrom.setText("Kilogram-force/square meter");
                textViewConversionShortform.setText("kgf/m²");
                break;

            case "Kilogram-force/square cm - kgf/cm²":
                textconversionFrom.setText("Kilogram-force/square cm");
                textViewConversionShortform.setText("kgf/cm²");
                break;
            case "Kilogram-force/square mm - kgf/mm²":
                textconversionFrom.setText("Kilogram-force/square mm");
                textViewConversionShortform.setText("kgf/mm²");
                break;
            case "Gram-force/square cm - gf/cm²":
                textconversionFrom.setText("Gram-force/square cm");
                textViewConversionShortform.setText("gf/cm²");
                break;
            case "Ton-force(short)/sq. foot - tonf/ft²":
                textconversionFrom.setText("Ton-force(short)/sq. foot");
                textViewConversionShortform.setText("tonf/ft²");
                break;
            case "Ton-force(short)/sq. inch - tonf/in²":
                textconversionFrom.setText("Ton-force(short)/sq. inch");
                textViewConversionShortform.setText("tonf/in²");
                break;
            case "Ton-force(long)/sq. foot - tonf/ft²":
                textconversionFrom.setText("Ton-force(long)/sq. foot");
                textViewConversionShortform.setText("tonf/ft²");
                break;

            case "Ton-force(long)/sq. inch - tonf/in²":
                textconversionFrom.setText("Ton-force(long)/sq. inch");
                textViewConversionShortform.setText("tonf/in²");
                break;

            case "Kip-force/square inch - kipf/in²":
                textconversionFrom.setText("Kip-force/square inch");
                textViewConversionShortform.setText("kipf/in²");
                break;
            case "Pound-force/square foot - lbf/ft²":
                textconversionFrom.setText("Pound-force/square foot");
                textViewConversionShortform.setText("lbf/ft²");
                break;
            case "Pound-force/square inch - lbf/in²":
                textconversionFrom.setText("Pound-force/square inch");
                textViewConversionShortform.setText("lbf/in²");
                break;
            case "Poundal/square foot - pdl/ft²":
                textconversionFrom.setText("Poundal/square foot");
                textViewConversionShortform.setText("pdl/ft²");
                break;
            case "Torr - torr":
                textconversionFrom.setText("Torr");
                textViewConversionShortform.setText("torr");
                break;
            case "Centimeter mercury(0°C) - cmHg":
                textconversionFrom.setText("Centimeter mercury(0°C)");
                textViewConversionShortform.setText("cmHg");
                break;

            case "Millimeter mercury(0°C) - mmHg":
                textconversionFrom.setText("Millimeter mercury(0°C)");
                textViewConversionShortform.setText("mmHg");
                break;
            case "Inch mercury(32°F) - inHg":
                textconversionFrom.setText("Inch mercury(32°F)");
                textViewConversionShortform.setText("inHg");
                break;
            case "Centimeter water(4°C) - cmAq":
                textconversionFrom.setText("Centimeter water(4°C)");
                textViewConversionShortform.setText("cmAq");
                break;
            case "Millimeter water(4°C) - mmAq":
                textconversionFrom.setText("Millimeter water(4°C)");
                textViewConversionShortform.setText("mmAq");
                break;
            case "Inch water(4°C) - inAq":
                textconversionFrom.setText("Inch water(4°C)");
                textViewConversionShortform.setText(" inAq");
                break;
            case "Foot water(4°C) - ftAq":
                textconversionFrom.setText("Foot water(4°C)");
                textViewConversionShortform.setText("ftAq");
                break;
            case "Inch water(60°C) - inAq":
                textconversionFrom.setText("Inch water(60°C)");
                textViewConversionShortform.setText("inAq");
                break;
            case "Foot water(60°C) - ftAq":
                textconversionFrom.setText("Foot water(60°C)");
                textViewConversionShortform.setText("ftAq");
                break;
            case "Atmosphere technical - at":
                textconversionFrom.setText("Atmosphere technical");
                textViewConversionShortform.setText("at");
                break;
        }
    }

    private void formatsetting() {
        //fetching value from sharedpreference
        SharedPreferences sharedPreferences =this.getSharedPreferences(Settings.SHARED_PREF_NAME, Context.MODE_PRIVATE);
        //Fetching thepatient_mobile_Number value form sharedpreferences
        String  FormattedString = sharedPreferences.getString(Settings.Format_Selected_SHARED_PREF,"Thousands separator");
        String DecimalplaceString= sharedPreferences.getString(Settings.Decimal_Place_Selected_SHARED_PREF,"2");
        Settings settings=new Settings(FormattedString,DecimalplaceString);
        formatter= settings.setting();
    }

    private List<ItemList> getAllunitValue(String strSpinnerFrom,double doubleEdittextvalue1) {
        PressureConverter c = new PressureConverter(strSpinnerFrom,doubleEdittextvalue1);
        ArrayList<PressureConverter.ConversionResults> results = c.calculatePressureConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            PressureConverter.ConversionResults item = results.get(i);

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


            list.add(new ItemList("Pa","Pascal ",strPascal,"Pa"));
            list.add(new ItemList("kPa","Kilopascal ",strKilopascal,"kPa"));
            list.add(new ItemList("b","Bar",strBar,"b"));
            list.add(new ItemList("psi","Psi",strPsi,"psi"));
            list.add(new ItemList("ksi","Ksi",strKsi,"ksi"));
            list.add(new ItemList("atm","Atmosphere",strStandardAtmosphere,"atm"));
            list.add(new ItemList("EPa","Exapascal",strExapascal,"EPa"));
            list.add(new ItemList("PPa","Petapascal",strPetapascal,"PPa"));

            list.add(new ItemList("TPa","Terapascal",strTerapascal,"TPa"));
            list.add(new ItemList("GPa","Gigapascal",strGigaPascal,"GPa"));
            list.add(new ItemList("MPa","Megapascal",strMegapascal," MPa"));
            list.add(new ItemList("hPa","Hectopascal",strHectopascal,"hPa"));
            list.add(new ItemList("daPa","Deckapascal",strDekapasal,"daPa"));
            list.add(new ItemList("dPa","Decipascal",strDecipasal,"dPa"));
            list.add(new ItemList("cPa","Centipascal",strCentipascal,"cPa"));
            list.add(new ItemList("mPa","Millipascal",strMilipascal,"mPa"));


            list.add(new ItemList("μPa","Micropascal",strMicropascal,"μPa"));
            list.add(new ItemList("nPa","Nanopascal",strNanoPascal,"nPa"));
            list.add(new ItemList("pPa","Picopascal",strPicopascal,"pPa"));
            list.add(new ItemList("fPa","Femtopascal",strFemtopascal,"fPa"));
            list.add(new ItemList("aPa","Attopascal",strAttopasal,"aPa"));
            list.add(new ItemList("N/m²","Newton/square meter",strNewtonSmeter,"N/m²"));
            list.add(new ItemList("N/cm²","Newton/square centimeter",strNewtonSCm,"N/cm²"));
            list.add(new ItemList("N/mm²","Newton/square millimeter",strNewtonSMm,"N/mm²"));

            list.add(new ItemList("kN/m²","Kilonewton/square meter",strKilonewtonSmeter,"kN/m²"));
            list.add(new ItemList("mbar","Millibar",strMillibar,"mbar"));
            list.add(new ItemList("μbar","Microbar",strMicrobar,"μbar"));
            list.add(new ItemList("dyn/cm²","Dyne/square centimeter",strDyneSCm,"dyn/cm²"));
            list.add(new ItemList("kgf/m²","Kilogram-force/square meter",strKilogramforceSm,"kgf/m²"));
            list.add(new ItemList("kgf/cm²","Kilogram-force/square cm",strKilogramforceSCm,"kgf/cm²"));
            list.add(new ItemList("kgf/mm²","Kilogram-force/square mm",strKilogramforceMm,"kgf/mm²"));
            list.add(new ItemList("gf/cm²","Gram-force/square cm",stGramforceSCm,"gf/cm²"));


            list.add(new ItemList("tonf/ft²","Ton-force(short)/sq. foot",strTonforceshortfoot,"tonf/ft²"));
            list.add(new ItemList("tonf/in²","Ton-force(short)/sq. inch",strTonforceshortinch,"tonf/in²"));
            list.add(new ItemList("tonf/ft²","Ton-force(long)/sq. foot",strTonforcelongfoot,"tonf/ft²"));
            list.add(new ItemList("tonf/in²","Ton-force(long)/sq. inch",strTonforcelonginch,"tonf/in²"));
            list.add(new ItemList("kipf/in²","Kip-force/square inch - ",strkipforceSinch,"kipf/in²"));
            list.add(new ItemList("lbf/ft²","Pound-force/square foot",strPoundforceSfoot,"lbf/ft²"));
            list.add(new ItemList("lbf/in²","Pound-force/square inch",strPoundforceSinch,"lbf/in²"));
            list.add(new ItemList("pdl/ft²","Poundal/square foot",strPoundalSfoot,"pdl/ft²"));


            list.add(new ItemList("torr","Torr",strTorr,"torr"));
            list.add(new ItemList("cmHg","Centimeter mercury(0°C)",stCentimetermercury,"cmHg"));
            list.add(new ItemList("mmHg","Millimeter mercury(0°C)",strMillimetermercury,"mmHg"));
            list.add(new ItemList("inHg","Inch mercury(32°F)",stInchmercury,"inHg"));
            list.add(new ItemList("cmAq","Centimeter water(4°C)",stCentimeterwater,"cmAq"));
            list.add(new ItemList("mmAq","Millimeter water(4°C)",strMillimeterwater,"mmAq"));
            list.add(new ItemList("inAq","Inch water(4°C)",strInchwater,"inAq"));
            list.add(new ItemList("ftAq","Foot water(4°C)",strfootwater,"ftAq"));
            list.add(new ItemList("inAq","Inch water(60°C)",strInchwater60,"inAq"));
            list.add(new ItemList("ftAq","Foot water(60°C)",strFootwater60,"ftAq"));
            list.add(new ItemList("at","Atmosphere technical",strAtmospheretechnical,"at"));

        }
        return list;

    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {


        rowListItem.clear();
        try {

            double value = Double.parseDouble(edittextConversionListvalue.getText().toString().trim());

            rowListItem1 = getAllunitValue(stringSpinnerFrom,value);


            rcAdapter = new RecyclerViewConversionListAdapter(this,rowListItem1);
            rView.setAdapter(rcAdapter);

        }
        catch (NumberFormatException e) {
            doubleEdittextvalue = 0;

        }
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Take appropriate action for each action item click
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                break;

            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
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
