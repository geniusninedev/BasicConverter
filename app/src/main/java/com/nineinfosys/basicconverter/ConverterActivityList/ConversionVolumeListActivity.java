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
import com.nineinfosys.basicconverter.Engin.Volume;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.ItemList;
import com.nineinfosys.basicconverter.Supporter.Settings;


import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversionVolumeListActivity extends AppCompatActivity implements TextWatcher {

    List<ItemList> list = new ArrayList<ItemList>();
    private  String stringSpinnerFrom;
    private double doubleEdittextvalue;
    private EditText edittextConversionListvalue;
    private TextView textconversionFrom,textViewConversionShortform;
    View ChildView ;
    DecimalFormat formatter = null;
    Volume.ConversionResults item;

    private static final int REQUEST_CODE = 100;
    private File imageFile;
    private Bitmap bitmap;
    private PrintHelper printhelper;

    private String strcubicmeter =null;
    private String strcubickilometer =null;
    private String strcubiccentimeter=null;
    private String strcubicmillimeter=null;
    private String strliter=null;
    private String strmilliliter=null;
    private String strgallon=null;
    private String strquart =null;
    private String strpint =null;
    private String strcup =null;
    private String strtablespoon =null;
    private String strteaspoon =null;
    private String strcubicmile =null;
    private String strcubicyard=null;
    private String strcubicfoot=null;
    private String strcubicinch=null;
    private String strcubicdecimeter=null;
    private String strexaliter =null;
    private String strpetaliter =null;
    private String strteraliter =null;
    private String strgigaliter =null;
    private String strmegaliter =null;
    private String strkiloliter =null;
    private String strhectoliter =null;
    private String strdekaliter =null;
    private String strdeciliter =null;
    private String strcentiliter =null;
    private String strmicroliter =null;
    private String strnanoliter =null;
    private String strpicoliter =null;
    private String strfemtoliter =null;
    private String strattoliter =null;
    private String strcc =null;
    private String strdrop =null;
    private String strbarreloil =null;
    private String strbarrelUS =null;
    private String strbarrelUK =null;
    private String strgallonUK =null;
    private String strquartUK =null;
    private String strpintUK =null;
    private String strcupmetric  =null;
    private String strcupUK =null;
    private String strfluidounceUS=null;
    private String strfluidounceUK=null;
    private String strTablespoonmetric=null;
    private String strTablespoonUK=null;
    private String strdesertspoonUS =null;
    private String strdesertspoonUK  =null;
    private String strTeaspoonmetric =null;
    private String strTeaspoonUK=null;
    private String strGillUS=null;
    private String strGillUK=null;
    private String strMinimUS=null;
    private String strMinimUK=null;
    private String strTonregister=null;
    private String strCcf=null;
    private String strhundredcubicfoot=null;
    private String strAcrefoot=null;
    private String strAcrefootUS=null;
    private String strAcreinch=null;
    private String strDekastere=null;
    private String strStere=null;
    private String strDecistere=null;
    private String strCord=null;
    private String strTun=null;
    private String strHogshead=null;
    private String strBoardfoot=null;
    private String strdramt=null;
    private String strCor=null;
    private String strHomer=null;
    private String strBath=null;
    private String strHin=null;
    private String strCab=null;
    private String strLog=null;
    private String strTaza=null;
    private String strEarthsvolume=null;
    private RecyclerView rView;
    RecyclerViewConversionListAdapter rcAdapter;
    List<ItemList> rowListItem,rowListItem1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_list);

        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#2eaf46")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#007e17"));
        }

        //format of decimal pint
        formatsetting();

        MobileAds.initialize(ConversionVolumeListActivity.this, getString(R.string.ads_app_id));
        AdView mAdView = (AdView) findViewById(R.id.adViewUnitConverterList);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        edittextConversionListvalue=(EditText)findViewById(R.id.edittextConversionListvalue) ;
        textconversionFrom=(TextView) findViewById(R.id.textViewConversionFrom) ;
        textViewConversionShortform=(TextView) findViewById(R.id.textViewConversionShortform) ;

        //get the value from temperture activity
        stringSpinnerFrom = getIntent().getExtras().getString("stringSpinnerFrom");
        doubleEdittextvalue= getIntent().getExtras().getDouble("doubleEdittextvalue");
        edittextConversionListvalue.setText(String.valueOf(doubleEdittextvalue));

        NamesAndShortform(stringSpinnerFrom);


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

            case "Cubic meter - m^3":
                 textconversionFrom.setText("Cubic meter");
                 textViewConversionShortform.setText("m^3");
                break;
            case "Cubic kilometer  - km^3":
                 textconversionFrom.setText("Cubic kilometer");
                textViewConversionShortform.setText("km^3");
                break;

            case "Cubic centimeter  - cm^3":
                 textconversionFrom.setText("Cubic centimeter");
                textViewConversionShortform.setText("cm^3");
                break;
            case "Cubic millimeter - mm^3":
                 textconversionFrom.setText("Cubic millimeter");
                 textViewConversionShortform.setText("mm^3");
                break;
            case "Liter - L":
                 textconversionFrom.setText("Liter");
                 textViewConversionShortform.setText("L");
                break;
            case "Milliliter  - mL":
                 textconversionFrom.setText("Milliliter");
                textViewConversionShortform.setText("mL");
                break;
            case "Gallons(US) - gallon":
                 textconversionFrom.setText("Gallons(US)");
                 textViewConversionShortform.setText("gallon");
                break;
            case "Quart(US) - qt":
                 textconversionFrom.setText("Quart(US)");
                textViewConversionShortform.setText("qt");
                break;

            case "Pint(US)  - pt":
                 textconversionFrom.setText("Pint(US)");
                textViewConversionShortform.setText("pt");
                break;
            case "Cup(US)  - cup":
                 textconversionFrom.setText("Cup(US)");
                textViewConversionShortform.setText("cup");
                break;

            case "Tablespoon - tblsp":
                 textconversionFrom.setText("Tablespoon");
                textViewConversionShortform.setText("tblsp");
                break;
            case "Teaspoon - tsp":
                 textconversionFrom.setText("Teaspoon");
                textViewConversionShortform.setText("tsp");
                break;
            case "Cubic mile - mi^3":
                 textconversionFrom.setText("Cubic mile");
                textViewConversionShortform.setText("mi^3");
                break;
            case "Cubic yard - yd^3":
                 textconversionFrom.setText("Cubic yard");
                textViewConversionShortform.setText("yd^3");
                break;

            case "Cubic foot - ft^3":
                 textconversionFrom.setText("Cubic foot");
                textViewConversionShortform.setText("ft^3");
                break;
            case "Cubic inch - in^3":
                 textconversionFrom.setText("Cubic inch");
                textViewConversionShortform.setText("in^3");
                break;

            case "Cubic decimeter - dm^3":
                 textconversionFrom.setText("Cubic decimeter");
                textViewConversionShortform.setText("dm^3");
                break;
            case "Exaliter - EL":
                 textconversionFrom.setText("Exaliter");
                textViewConversionShortform.setText("EL");
                break;
            case "Petaliter - PL":
                 textconversionFrom.setText("Petaliter");
                textViewConversionShortform.setText("PL");
                break;
            case "Teraliter - TL":
                 textconversionFrom.setText("Teraliter");
                textViewConversionShortform.setText("TL");
                break;
            case "Gigaliter - GL":
                 textconversionFrom.setText("Gigaliter");
                textViewConversionShortform.setText("GL");
                break;

            case "Megaliter - ML":
                 textconversionFrom.setText("Megaliter");
                textViewConversionShortform.setText("ML");
                break;
            case "Kiloliter - kL":
                 textconversionFrom.setText("Kiloliter");
                textViewConversionShortform.setText("kL");
                break;

            case "Hectoliter - hL":
                 textconversionFrom.setText("Hectoliter");
                textViewConversionShortform.setText("hL");
                break;
            case "Dekaliter - daL":
                 textconversionFrom.setText("Dekaliter");
                textViewConversionShortform.setText("daL");
                break;
            case "Deciliter - dL":
                 textconversionFrom.setText("Deciliter");
                textViewConversionShortform.setText("dL");
                break;

            case "Centiliter - cL":
                 textconversionFrom.setText("Centiliter");
                textViewConversionShortform.setText("cL");
                break;
            case "Microliter - µL":
                 textconversionFrom.setText("Microliter");
                textViewConversionShortform.setText("µL");
                break;
            case "Nanoliter - nL":
                 textconversionFrom.setText("Nanoliter");
                textViewConversionShortform.setText("nL");
                break;
            case "Picoliter - pL":
                 textconversionFrom.setText("Picoliter");
                textViewConversionShortform.setText("pL");
                break;

            case "Femtoliter - fL":
                 textconversionFrom.setText("Femtoliter");
                textViewConversionShortform.setText("fL");
                break;
            case "Attoliter - aL":
                 textconversionFrom.setText("Attoliter");
                textViewConversionShortform.setText("aL");
                break;

            case "Cc - cc":
                 textconversionFrom.setText("Cc");
                textViewConversionShortform.setText("cc");
                break;
            case "Drop - drop":
                 textconversionFrom.setText("Drop");
                textViewConversionShortform.setText("drop");
                break;
            case "Barrel(oil) - bbl":
                 textconversionFrom.setText("Barrel(oil)");
                textViewConversionShortform.setText("bbl");
                break;
            case "Barrel(US) - bbl":
                 textconversionFrom.setText("Barrel(US)");
                textViewConversionShortform.setText("bbl");
                break;
            case "Barrel(UK) - bbl":
                 textconversionFrom.setText("Barrel(UK)");
                textViewConversionShortform.setText("bbl");
                break;
            case "Gallon - gallon":
                 textconversionFrom.setText("Gallon");
                textViewConversionShortform.setText("gallon");
                break;
            case "Quart(UK) - qt":
                 textconversionFrom.setText("Quart(UK)");
                textViewConversionShortform.setText("qt");
                break;
            case "Pint(UK) - pt":
                 textconversionFrom.setText("Pint(UK)");
                textViewConversionShortform.setText("pt");
                break;
            case "Cup(Metric) - cup":
                 textconversionFrom.setText("Cup(Metric)");
                textViewConversionShortform.setText("cup");
                break;
            case "Cup(UK) - cup":
                 textconversionFrom.setText("Cup(UK)");
                textViewConversionShortform.setText("cup");
                break;
            case "Fluid ounce(US) - fl oz":
                 textconversionFrom.setText("Fluid ounce(US)");
                textViewConversionShortform.setText("fl oz");
                break;
            case "Fluid ounce(UK) - fl oz":
                 textconversionFrom.setText("Fluid ounce(UK)");
                textViewConversionShortform.setText("fl oz");
                break;
            case "Tablespoon(Metric) - tblsp":
                 textconversionFrom.setText("Tablespoon(Metric)");
                textViewConversionShortform.setText("tblsp");
                break;
            case "Tablespoon(UK) - tblsp":
                 textconversionFrom.setText("Tablespoon(UK)");
                textViewConversionShortform.setText("tblsp");
                break;
            case "Dessertspoon(US) - dsp":
                 textconversionFrom.setText("Dessertspoon(US)");
                textViewConversionShortform.setText("dsp");
                break;
            case "Dessertspoon(UK) - dsp":
                 textconversionFrom.setText("Dessertspoon(UK)");
                textViewConversionShortform.setText("dsp");
                break;
            case "Teaspoon(Metric) - tsp":
                 textconversionFrom.setText("Teaspoon(Metric)");
                textViewConversionShortform.setText("tsp");
                break;
            case "Teaspoon(UK) - tsp":
                 textconversionFrom.setText("Teaspoon(UK)");
                textViewConversionShortform.setText("tsp");
                break;

            case "Gill(US)  - gi":
                 textconversionFrom.setText("Gill(US)");
                textViewConversionShortform.setText("gi");
                break;
            case "Gill(UK)  - gi":
                 textconversionFrom.setText("Gill(UK)");
                textViewConversionShortform.setText("gi");
                break;
            case "Minim(US)  - min":
                 textconversionFrom.setText("Minim(US)");
                textViewConversionShortform.setText("min");
                break;
            case "Minim(UK)  - min":
                 textconversionFrom.setText("Minim(UK)");
                textViewConversionShortform.setText("min");
                break;
            case "Ton register - ton reg":
                 textconversionFrom.setText("Ton register");
                textViewConversionShortform.setText("ton reg");
                break;
            case "Ccf  - ccf":
                 textconversionFrom.setText("Ccf");
                textViewConversionShortform.setText("ccf");
                break;
            case "Hundred-cubic foot - 100 ft^3":
                 textconversionFrom.setText("Hundred-cubic foot");
                textViewConversionShortform.setText("100 ft^3");
                break;
            case "Acre-foot - ac*ft":
                 textconversionFrom.setText("Acre-foot");
                textViewConversionShortform.setText("ac*ft");
                break;
            case "Acre-foot(US)  - ac*ft":
                 textconversionFrom.setText("Acre-foot(US)");
                textViewConversionShortform.setText("ac*ft");
                break;
            case "Acre-inch - ac*in":
                 textconversionFrom.setText("Acre-inch");
                textViewConversionShortform.setText("ac*in");
                break;
            case "Dekastere  - daSt":
                 textconversionFrom.setText("Dekastere");
                textViewConversionShortform.setText("daSt");
                break;
            case "Stere  - st":
                 textconversionFrom.setText("Stere");
                textViewConversionShortform.setText("st");
                break;
            case "Decistere  - dSt":
                 textconversionFrom.setText("Decistere");
                textViewConversionShortform.setText("dSt");
                break;
            case "Cord  - cd":
                 textconversionFrom.setText("Cord");
                textViewConversionShortform.setText("cord");
                break;
            case "Tun  - tun":
                 textconversionFrom.setText("Tun");
                textViewConversionShortform.setText("tun");
                break;
            case "Hogshead  - hogshead":
                 textconversionFrom.setText("Hogshead");
                textViewConversionShortform.setText("hogshead");
                break;
            case "Board foot  - bft":
                 textconversionFrom.setText("Board foot");
                textViewConversionShortform.setText("bft");
                break;
            case "Dram  - dr":
                 textconversionFrom.setText("Dram");
                textViewConversionShortform.setText("dr");
                break;

            case "Cor(Biblical) - cor":
                 textconversionFrom.setText("Cor(Biblical)");
                textViewConversionShortform.setText("cor");
                break;
            case "Homer(Biblical) - homer":
                 textconversionFrom.setText("Homer(Biblical)");
                textViewConversionShortform.setText("homer");
                break;
            case "Bath(Biblical) - bath":
                 textconversionFrom.setText("Bath(Biblical)");
                textViewConversionShortform.setText("bath");
                break;
            case "Hin(Biblical) - hin":
                 textconversionFrom.setText("Hin(Biblical)");
                textViewConversionShortform.setText("hin");
                break;
            case "Cab(Biblical) - cab":
                 textconversionFrom.setText("Cab(Biblical)");
                textViewConversionShortform.setText("cab");
                break;
            case "Log(Biblical) - log":
                 textconversionFrom.setText("Log(Biblical)");
                textViewConversionShortform.setText("log");
                break;
            case "Taza(Spanish) - taza":
                 textconversionFrom.setText("Taza(Spanish)");
                textViewConversionShortform.setText("taza");
                break;
            case "Earth's volume - earth":
                 textconversionFrom.setText("Earth's volume");
                textViewConversionShortform.setText("earth");
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
        Volume c = new Volume(strSpinnerFrom, doubleEdittextvalue1);
        ArrayList<Volume.ConversionResults> results = c.calculateVolumeConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            item = results.get(i);

            strcubicmeter = String.valueOf(formatter.format(item.getCubicmeter()));
            strcubickilometer = String.valueOf(formatter.format(item.getCubickilometer()));
            strcubiccentimeter = String.valueOf(formatter.format(item.getCubiccentimeter()));
            strcubicmillimeter = String.valueOf(formatter.format(item.getCubicmillimeter()));
            strliter= String.valueOf(formatter.format(item.getLiter()));
            strmilliliter = String.valueOf(formatter.format(item.getMilliliter()));
            strgallon = String.valueOf(formatter.format(item.getGallon()));
            strquart = String.valueOf(formatter.format(item.getQuart()));
            strpint = String.valueOf(formatter.format(item.getPintUS()));
            strcup = String.valueOf(formatter.format(item.getCupUS()));
            strtablespoon = String.valueOf(formatter.format(item.getTablespoonUS()));
            strteaspoon = String.valueOf(formatter.format(item.getTeaspoonUS()));
            strcubicmile= String.valueOf(formatter.format(item.getCubicmile()));
            strcubicyard = String.valueOf(formatter.format(item.getCubicyard()));
            strcubicfoot = String.valueOf(formatter.format(item.getCubicfoot()));
            strcubicinch = String.valueOf(formatter.format(item.getCubicinch()));
            strcubicdecimeter = String.valueOf(formatter.format(item.getCubicdecimeter()));
            strexaliter = String.valueOf(formatter.format(item.getExaliter()));
            strpetaliter= String.valueOf(formatter.format(item.getPetaliter()));
            strteraliter = String.valueOf(formatter.format(item.getTeraliter()));
            strgigaliter = String.valueOf(formatter.format(item.getGigaliter()));
            strmegaliter = String.valueOf(formatter.format(item.getMegaliter()));
            strkiloliter = String.valueOf(formatter.format(item.getKiloliter()));
            strhectoliter = String.valueOf(formatter.format(item.getHectoliter()));
            strdekaliter = String.valueOf(formatter.format(item.getDekaliter()));
            strdeciliter = String.valueOf(formatter.format(item.getDeciliter()));
            strcentiliter= String.valueOf(formatter.format(item.getCentiliter()));
            strmicroliter = String.valueOf(formatter.format(item.getMicroliter()));
            strnanoliter = String.valueOf(formatter.format(item.getNanoliter()));
            strpicoliter = String.valueOf(formatter.format(item.getPicoliter()));
            strfemtoliter = String.valueOf(formatter.format(item.getFemtoliter()));
            strattoliter= String.valueOf(formatter.format(item.getAttoliter()));
            strcc = String.valueOf(formatter.format(item.getCc()));
            strdrop = String.valueOf(formatter.format(item.getDrop()));
            strbarreloil = String.valueOf(formatter.format(item.getBarreloil()));
            strbarrelUS= String.valueOf(formatter.format(item.getBarrelUS()));
            strbarrelUK = String.valueOf(formatter.format(item.getBarrelUK()));

            strgallonUK = String.valueOf(formatter.format(item.getGallonUK()));
            strquartUK = String.valueOf(formatter.format(item.getQuartUK()));
            strpintUK = String.valueOf(formatter.format(item.getPintUK()));
            strcupmetric = String.valueOf(formatter.format(item.getCupmetric()));
            strcupUK= String.valueOf(formatter.format(item.getCupUK()));
            strfluidounceUS = String.valueOf(formatter.format(item.getFluidounceUK()));
            strfluidounceUK = String.valueOf(formatter.format(item.getFluidounceUS()));
            strTablespoonmetric = String.valueOf(formatter.format(item.getTablespoonmetric()));
            strTablespoonUK = String.valueOf(formatter.format(item.getTablespoonUK()));
            strdesertspoonUS = String.valueOf(formatter.format(item.getDessertspoonUS()));
            strdesertspoonUK = String.valueOf(formatter.format(item.getDessertspoonUK()));
            strTeaspoonmetric = String.valueOf(formatter.format(item.getTeaspoonmetric()));
            strTeaspoonUK= String.valueOf(formatter.format(item.getTeaspoonUK()));
            strGillUS = String.valueOf(formatter.format(item.getGillUS()));
            strGillUK = String.valueOf(formatter.format(item.getGillUK()));
            strMinimUS = String.valueOf(formatter.format(item.getMinimUS()));
            strMinimUK = String.valueOf(formatter.format(item.getMinimUK()));
            strTonregister = String.valueOf(formatter.format(item.getTonregister()));
            strCcf= String.valueOf(formatter.format(item.getCcf()));
            strhundredcubicfoot = String.valueOf(formatter.format(item.getHundredcubicfoot()));
            strAcrefoot = String.valueOf(formatter.format(item.getAcrefoot()));
            strAcrefootUS = String.valueOf(formatter.format(item.getAcrefootUSsurvey()));
            strAcreinch = String.valueOf(formatter.format(item.getAcreinch()));

            strDekastere = String.valueOf(formatter.format(item.getDekastere()));
            strStere = String.valueOf(formatter.format(item.getStere()));
            strDecistere = String.valueOf(formatter.format(item.getDecistere()));
            strCord = String.valueOf(formatter.format(item.getCord()));
            strTun= String.valueOf(formatter.format(item.getTun()));
            strHogshead = String.valueOf(formatter.format(item.getHogshead()));
            strBoardfoot = String.valueOf(formatter.format(item.getBoardfoot()));
            strdramt = String.valueOf(formatter.format(item.getDram()));
            strCor = String.valueOf(formatter.format(item.getCor()));
            strHomer = String.valueOf(formatter.format(item.getHomerBiblical()));

            strBath = String.valueOf(formatter.format(item.getBathBiblical()));
            strHin = String.valueOf(formatter.format(item.getHinBiblical()));
            strCab = String.valueOf(formatter.format(item.getCabBiblical()));
            strLog = String.valueOf(formatter.format(item.getLogBiblical()));
            strTaza= String.valueOf(formatter.format(item.getTazaSpanish()));
            strEarthsvolume = String.valueOf(formatter.format(item.getEarthsvolume()));

            list.add(new ItemList("m^3","Cubic meter",strcubicmeter,"m^3"));
            list.add(new ItemList("km^3","Cubic kilometer",strcubickilometer,"km^3"));
            list.add(new ItemList("cm^3","Cubic centimeter",strcubiccentimeter,"cm^3"));
            list.add(new ItemList("mm^3","Cubic millimeter",strcubicmillimeter,"mm^3"));
            list.add(new ItemList("L","Liter",strliter,"L"));
            list.add(new ItemList("mL","Milliliter",strmilliliter,"mL"));
            list.add(new ItemList("gallon","Gallons(US)",strgallon,"gallon"));
            list.add(new ItemList("qt","Quart(US)",strquart,"qt"));
            list.add(new ItemList("pt","Pint(US)",strpint,"pt"));
            list.add(new ItemList("cup","Cup(US)",strcup,"cup"));
            list.add(new ItemList("tblsp","Tablespoon",strtablespoon,"tblsp"));
            list.add(new ItemList("tsp","Teaspoon",strteaspoon,"tsp"));
            list.add(new ItemList("mi^3","Cubic mile",strcubicmile,"mi^3"));
            list.add(new ItemList("yd^3","Cubic yard",strcubicyard,"yd^3"));
            list.add(new ItemList("ft^3","Cubic foot",strcubicfoot,"ft^3"));
            list.add(new ItemList("in^3","Cubic inch",strcubicinch,"in^3"));
            list.add(new ItemList("dm^3","Cubic decimeter",strcubicdecimeter,"dm^3"));
            list.add(new ItemList("EL","Exaliter",strexaliter,"EL"));
            list.add(new ItemList("PL","Petaliter",strpetaliter,"PL"));
            list.add(new ItemList("TL","Teraliter",strteraliter,"TL"));
            list.add(new ItemList("GL","Gigaliter",strgigaliter,"GL"));
            list.add(new ItemList("ML","Megaliter",strmegaliter,"ML"));
            list.add(new ItemList("kL","Kiloliter",strkiloliter,"kL"));
            list.add(new ItemList("hL","Hectoliter",strhectoliter,"hL"));
            list.add(new ItemList("daL","Dekaliter",strdekaliter,"daL"));
            list.add(new ItemList("dL","Deciliter",strdeciliter,"dL"));
            list.add(new ItemList("cL","Centiliter",strcentiliter,"cL"));
            list.add(new ItemList("µL","Microliter",strmicroliter,"µL"));
            list.add(new ItemList("nL","Nanoliter",strnanoliter,"nL"));
            list.add(new ItemList("pL","Picoliter",strpicoliter,"pL"));
            list.add(new ItemList("fL","Femtoliter",strfemtoliter,"fL"));
            list.add(new ItemList("aL","Attoliter",strattoliter,"aL"));
            list.add(new ItemList("cc","Cc",strcc,"cc"));
            list.add(new ItemList("drop","Drop",strdrop,"drop"));
            list.add(new ItemList("bbl","Barrel(oil)",strbarreloil,"bbl"));
            list.add(new ItemList("bbl","Barrel(US)",strbarrelUS,"bbl"));
            list.add(new ItemList("bbl","Barrel(UK)",strbarrelUK,"bbl"));

            list.add(new ItemList("gallon","Gallon",strgallonUK,"gallon"));
            list.add(new ItemList("qt","Quart(UK)",strquartUK,"qt"));
            list.add(new ItemList("pt","Pint(UK)",strpintUK,"pt"));
            list.add(new ItemList("cup","Cup(Metric)",strcupmetric,"cup"));
            list.add(new ItemList("cup","Cup(UK)",strcupUK,"cup"));
            list.add(new ItemList("fl oz","Fluid ounce(US)",strfluidounceUS,"fl oz"));
            list.add(new ItemList("fl oz","Fluid ounce(UK)",strfluidounceUK,"fl oz"));
            list.add(new ItemList("tblsp","Tablespoon(Metric)",strTablespoonmetric,"tblsp"));
            list.add(new ItemList("tblsp","Tablespoon(UK)",strTablespoonUK,"tblsp"));
            list.add(new ItemList("dsp","Dessertspoon(US)",strdesertspoonUS,"dsp"));
            list.add(new ItemList("dsp","Dessertspoon(UK)",strdesertspoonUK,"dsp"));
            list.add(new ItemList("tsp","Teaspoon(Metric)",strTeaspoonmetric,"tsp"));
            list.add(new ItemList("tsp","Teaspoon(UK)",strTeaspoonUK,"tsp"));
            list.add(new ItemList("gi","Gill(US)",strGillUS,"gi"));
            list.add(new ItemList("gi","Gill(UK)",strGillUK,"gi"));
            list.add(new ItemList("min","Minim(US)",strMinimUS,"min"));
            list.add(new ItemList("min","Minim(UK)",strMinimUK,"min"));
            list.add(new ItemList("ton reg","Ton register",strTonregister,"ton reg"));
            list.add(new ItemList("ccf","Ccf",strCcf,"ccf"));
            list.add(new ItemList("100 ft^3","Hundred-cubic foot",strhundredcubicfoot,"100 ft^3"));
            list.add(new ItemList("ac*ft","Acre-foot",strAcrefoot,"ac*ft"));
            list.add(new ItemList("ac*ft","Acre-foot(US)",strAcrefootUS,"ac*ft"));
            list.add(new ItemList("ac*in","Acre-inch",strAcreinch,"ac*in"));
            list.add(new ItemList("dSt","Dekastere",strDekastere,"dSt"));
            list.add(new ItemList("dst","Decistere",strDecistere,"dst"));
            list.add(new ItemList("st","Stere",strStere,"st"));
            list.add(new ItemList("cd","Cord",strCord,"cd"));
            list.add(new ItemList("tun","Tun",strTun,"tun"));
            list.add(new ItemList("hogshead","Hogshead",strHogshead,"hogshead"));
            list.add(new ItemList("bft","Board foot",strBoardfoot,"bft"));
            list.add(new ItemList("dr","Dram",strdramt,"dr"));
            list.add(new ItemList("cor","  Cor(Biblical)",strCor,"cor"));
            list.add(new ItemList("homer","Homer(Biblical)",strHomer,"homer"));
            list.add(new ItemList("bath","Bath(Biblical)",strBath,"bath"));
            list.add(new ItemList("hin","Hin(Biblical)",strHin,"hin"));
            list.add(new ItemList("cab","Cab(Biblical)",strCab,"cab"));
            list.add(new ItemList("log","Log(Biblical)",strLog,"log"));
            list.add(new ItemList("taza","Taza(Spanish)",strTaza,"taza"));
            list.add(new ItemList("earth","Earth's volume",strEarthsvolume,"earth"));


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
