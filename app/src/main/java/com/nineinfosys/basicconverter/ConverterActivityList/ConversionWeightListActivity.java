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
import com.nineinfosys.basicconverter.Engin.WeightConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.ItemList;
import com.nineinfosys.basicconverter.Supporter.Settings;


import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


public class ConversionWeightListActivity extends AppCompatActivity implements TextWatcher{

    List<ItemList> list = new ArrayList<ItemList>();
    private  String stringSpinnerFrom;
    private double doubleEdittextvalue;
    private EditText edittextConversionListvalue;
    private TextView textconversionFrom,textViewConversionShortform;
    View ChildView ;
    DecimalFormat formatter = null;
    private static final int REQUEST_CODE = 100;
    private File imageFile;
    private Bitmap bitmap;
    private PrintHelper printhelper;



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
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#757575")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#494949"));
        }

        //format of decimal pint
        formatsetting();

        MobileAds.initialize(ConversionWeightListActivity.this, getString(R.string.ads_app_id));
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
        switch(stringSpinnerFrom)
        {
            case "Kilogram -  kg":
                textconversionFrom.setText("Kilogram");
                textViewConversionShortform.setText("kg");
                break;
            case "Gram - g":
                textconversionFrom.setText("Gram");
                textViewConversionShortform.setText("g");
                break;
            case "Milligram - mg":
                textconversionFrom.setText("Milligram");
                textViewConversionShortform.setText("mg");
                break;
            case "Ton - t":
                textconversionFrom.setText("Ton");
                textViewConversionShortform.setText("t");
                break;
            case "Pound - lbs":
                textconversionFrom.setText("Pound ");
                textViewConversionShortform.setText("lbs");
                break;
            case "Ounce - oz":
                textconversionFrom.setText("Ounce ");
                textViewConversionShortform.setText("oz");
                break;

            case "Carat - ct":
                textconversionFrom.setText("Carat");
                textViewConversionShortform.setText(" ct");
                break;
            case "Ton short US - ton":
                textconversionFrom.setText("Ton short US ");
                textViewConversionShortform.setText(" ton");
                break;
            case "Ton long UK - ton":
                textconversionFrom.setText("Ton long UK ");
                textViewConversionShortform.setText("ton");
                break;
            case "Atomic mass unit - u":
                textconversionFrom.setText("Atomic mass unit ");
                textViewConversionShortform.setText("u");
                break;
            case "Exagram -  Eg":
                textconversionFrom.setText("Exagram ");
                textViewConversionShortform.setText("Eg");
                break;
            case "petagram - Pg":
                textconversionFrom.setText("Petagram ");
                textViewConversionShortform.setText("Pg");
                break;
            case "Teragram - Tg":
                textconversionFrom.setText("Teragram ");
                textViewConversionShortform.setText("Tg");
                break;

            case "Gigagram -  Gg":
                textconversionFrom.setText("Gigagram ");
                textViewConversionShortform.setText(" Gg");
                break;
            case "Megagram - Mg":
                textconversionFrom.setText("Megagram ");
                textViewConversionShortform.setText("Mg");
                break;
            case "Hectogram - hg":
                textconversionFrom.setText("Hectogram ");
                textViewConversionShortform.setText(" hg");
                break;
            case "Decigram - dg":
                textconversionFrom.setText("Decigram");
                textViewConversionShortform.setText("dg");
                break;
            case "Dekagram -  dag":
                textconversionFrom.setText("Dekagram");
                textViewConversionShortform.setText("dag");
                break;
            case "Centigram - cg":
                textconversionFrom.setText("Centigram ");
                textViewConversionShortform.setText("cg");
                break;
            case "Microgram - μg":
                textconversionFrom.setText(" Microgram");
                textViewConversionShortform.setText("μg");
                break;
            case "Nanogram - ng":
                textconversionFrom.setText("Nanogram");
                textViewConversionShortform.setText("ng");
                break;

            case "Picogram -  pg":
                textconversionFrom.setText("Picogram");
                textViewConversionShortform.setText("pg");
                break;
            case "Femtogram - fg":
                textconversionFrom.setText("Femtogram");
                textViewConversionShortform.setText("fg");
                break;
            case "Attogram - ag":
                textconversionFrom.setText("Attogram");
                textViewConversionShortform.setText("ag");
                break;

            case "Dalton - dt":
                textconversionFrom.setText("Dalton");
                textViewConversionShortform.setText("dt");
                break;
            case "Kilogram-force square second/meter - kg F sq s m- 1":
                textconversionFrom.setText("Kilogram-force square second/meter ");
                textViewConversionShortform.setText("kg F sq s m- 1");
                break;
            case "Kilopound - kip":
                textconversionFrom.setText(" Kilopound");
                textViewConversionShortform.setText("kip");
                break;
            case "Kip - kip":
                textconversionFrom.setText(" Kip");
                textViewConversionShortform.setText("kip");
                break;
            case "Slug - slug ":
                textconversionFrom.setText("Slug  ");
                textViewConversionShortform.setText("slug");
                break;
            case "Pound-force square second/foot - lb F sq s ft-1 ":
                textconversionFrom.setText("Pound-force square second/foot ");
                textViewConversionShortform.setText("lb F sq s ft-1 ");
                break;
            case "Pound (troy or apothecary) - lb ":
                textconversionFrom.setText("Pound (troy or apothecary) ");
                textViewConversionShortform.setText("lb");
                break;
            case "Poundal - pdl":
                textconversionFrom.setText(" Poundal");
                textViewConversionShortform.setText("pdl ");
                break;
            case "Ton (assay) (UK) - AT)":
                textconversionFrom.setText("Ton (assay) (UK)");
                textViewConversionShortform.setText("AT");
                break;

            case "Ton (assay) (US) - AT)":
                textconversionFrom.setText("Ton (assay) (US)");
                textViewConversionShortform.setText("AT");
                break;
            case "Kiloton (metric) - kt":
                textconversionFrom.setText("Kiloton (metric)");
                textViewConversionShortform.setText("kt");
                break;
            case "Qunital (metric) -  cwt":
                textconversionFrom.setText("Qunital (metric)");
                textViewConversionShortform.setText("cwt");
                break;
            case "Hundredweight (US) - hwt":
                textconversionFrom.setText("Hundredweight (US)");
                textViewConversionShortform.setText("hwt");
                break;

            case "Hundredweight (UK) - hwt":
                textconversionFrom.setText("Hundredweight (UK)");
                textViewConversionShortform.setText("hwt");
                break;
            case "Quarter (US) - qr":
                textconversionFrom.setText("Quarter (US)");
                textViewConversionShortform.setText("qr");
                break;
            case "Quarter (UK) - qr":
                textconversionFrom.setText("Quarter (UK)");
                textViewConversionShortform.setText("qr");
                break;
            case "Stone (US) - st":
                textconversionFrom.setText("Stone (US)");
                textViewConversionShortform.setText("st");
                break;
            case "Stone (UK) - st":
                textconversionFrom.setText("Stone (UK)");
                textViewConversionShortform.setText("st");
                break;
            case "Tonne - t":
                textconversionFrom.setText("Tonne");
                textViewConversionShortform.setText("t");
                break;
            case "Pennyweight - pwt":
                textconversionFrom.setText("Pennyweight");
                textViewConversionShortform.setText("pwt");
                break;
            case "Scruple (apothecary)- s.ap":
                textconversionFrom.setText("Scruple (apothecary)");
                textViewConversionShortform.setText("s.ap");
                break;
            case "Grain - gr":
                textconversionFrom.setText("Grain");
                textViewConversionShortform.setText("gr");
                break;
            case "Gamma - gamma":
                textconversionFrom.setText("Gamma");
                textViewConversionShortform.setText("gamma");
                break;
            case "Talent (Biblical Hebrew) - talent ":
                textconversionFrom.setText("Talent (Biblical Hebrew)");
                textViewConversionShortform.setText("talent");
                break;
            case "Mina (Biblical Hebrew) - mina":
                textconversionFrom.setText("Mina (Biblical Hebrew)");
                textViewConversionShortform.setText("mina");
                break;
            case "Shekal (Biblical Hebrew) - shekal":
                textconversionFrom.setText("Shekal (Biblical Hebrew)");
                textViewConversionShortform.setText("shekal");
                break;
            case "Bekan (Biblical Hebrew) - bekan":
                textconversionFrom.setText("Bekan (Biblical Hebrew)");
                textViewConversionShortform.setText("bekan");
                break;
            case "Gereh (Biblical Hebrew) - gereh":
                textconversionFrom.setText("gereh (Biblical Hebrew)");
                textViewConversionShortform.setText("gereh");
                break;
            case "Talent (Biblical Greek) - talent":
                textconversionFrom.setText("Talent (Biblical Greek)");
                textViewConversionShortform.setText("talent");
                break;
            case "Mina (Biblical Greek) - mina ":
                textconversionFrom.setText("Mina (Biblical Greek)");
                textViewConversionShortform.setText("mina");
                break;
            case "Tetradrachma (Biblical Greek) - tetd":
                textconversionFrom.setText("Tetradrachma (Biblical Greek)");
                textViewConversionShortform.setText("tetd");
                break;
            case "Didrachma (Biblical Greek) - didrachma":
                textconversionFrom.setText("Didrachma (Biblical Greek) ");
                textViewConversionShortform.setText("didrachma");
                break;

            case "Drachma (Biblical Greek) - drachma":
                textconversionFrom.setText("Drachma (Biblical Greek)");
                textViewConversionShortform.setText("drachma");
                break;
            case "Denarius (Biblical Roman) - denarius":
                textconversionFrom.setText("Denarius (Biblical Roman)");
                textViewConversionShortform.setText("denarius");
                break;
            case "Assarion (Biblical Roman) - assarion ":
                textconversionFrom.setText("Assarion (Biblical Roman)");
                textViewConversionShortform.setText("assarion");
                break;
            case "Quadrans (Biblical Roman) -  quadranns":
                textconversionFrom.setText("Quadrans (Biblical Roman)");
                textViewConversionShortform.setText("quadranns");
                break;
            case "Lepton (Biblical Roman) - lepton":
                textconversionFrom.setText("Lepton (Biblical Roman)");
                textViewConversionShortform.setText("lepton");
                break;


            case "Planck mass - Planck mass ":
                textconversionFrom.setText("Planck mass ");
                textViewConversionShortform.setText("Planck mass");
                break;
            case "Electron mass (rest) -  e-":
                textconversionFrom.setText("Electron mass (rest");
                textViewConversionShortform.setText("e-");
                break;
            case "Muon mass - M":
                textconversionFrom.setText("Muon mass");
                textViewConversionShortform.setText("M");
                break;
            case "Proton mass - p":
                textconversionFrom.setText("Proton mass");
                textViewConversionShortform.setText("p");
                break;
            case "Neutron mass - n":
                textconversionFrom.setText("Neutron mass");
                textViewConversionShortform.setText("n");
                break;
            case "Deuteron mass - D":
                textconversionFrom.setText("Deuteron mass");
                textViewConversionShortform.setText("D");
                break;

            case "Earth's mass - Earth":
                textconversionFrom.setText("Earth's mass");
                textViewConversionShortform.setText("Earth");
                break;
            case "Sun mass - Sun":
                textconversionFrom.setText("Sun mass");
                textViewConversionShortform.setText("Sun");
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
        WeightConverter c = new WeightConverter(strSpinnerFrom,doubleEdittextvalue1);
        ArrayList<WeightConverter.ConversionResults> results = c.calculateWeightConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            WeightConverter.ConversionResults item = results.get(i);

           String strKilogram = String.valueOf(formatter.format(item. getKilogram()));
            String strGram = String.valueOf(formatter.format(item.getGram()));
            String strMilligram = String.valueOf(formatter.format(item.getMilligram()));
            String strTonmetric = String.valueOf(formatter.format(item.getTonmetric()));
            String strPound = String.valueOf(formatter.format(item.getPound()));
            String strOunce = String.valueOf(formatter.format(item.getOunce()));
            String strCarat = String.valueOf(formatter.format(item.getCarat()));
            String strTonshort = String.valueOf(formatter.format(item.getTonshort()));
            String strTonlong = String.valueOf(formatter.format(item.getTonlong()));
            String strAtomicmassunit = String.valueOf(formatter.format(item.getAtomicmassunit()));

            String strExagram = String.valueOf(formatter.format(item.getExagram()));
            String strPetagram = String.valueOf(formatter.format(item.getPetagram()));
            String strTeragram = String.valueOf(formatter.format(item.getTeragram()));
            String strGigagram = String.valueOf(formatter.format(item.getGigagram()));
            String strMegagram = String.valueOf(formatter.format(item.getMegagram()));
            String  strHectogram = String.valueOf(formatter.format(item.getHectogram()));
            String  strDekagram = String.valueOf(formatter.format(item.getDekagram()));
            String  strDecigram = String.valueOf(formatter.format(item.getDecigram()));
            String strCentigram = String.valueOf(formatter.format(item.getCentigram()));
            String strMicrogram = String.valueOf(formatter.format(item.getMicrogram()));

            String strNanogram = String.valueOf(formatter.format(item.getNanogram()));
            String strPicogram = String.valueOf(formatter.format(item.getPicogram()));
            String  strFemtogram = String.valueOf(formatter.format(item.getFemtogram()));
            String strAttogram = String.valueOf(formatter.format(item.getAttogram()));
            String strDalton = String.valueOf(formatter.format(item.getDalton()));
            String strKilogramforcesquaresecondpermeter = String.valueOf(formatter.format(item.getKilopound()));
            String strKilopound = String.valueOf(formatter.format(item.getKilopound()));
            String strKip = String.valueOf(formatter.format(item.getKip()));
            String  strslug = String.valueOf(formatter.format(item.getSlug()));
            String  strPoundforcesquaresecondperfoot = String.valueOf(formatter.format(item.getPoundforcesquaresecondperfoot()));

            String strPoundtroy = String.valueOf(formatter.format(item.getPoundtroy()));
            String strPoundal = String.valueOf(formatter.format(item.getPoundal()));
            String  strTonus = String.valueOf(formatter.format(item.getTonus()));
            String  strTonuk = String.valueOf(formatter.format(item.getTonuk()));
            String strKiloton = String.valueOf(formatter.format(item.getKiloton()));
            String strQuintal = String.valueOf(formatter.format(item.getQuintal()));
            String  strHundredweightus = String.valueOf(formatter.format(item.getHundredweightus()));
            String strHundredweightuk = String.valueOf(formatter.format(item.getHundredweightuk()));
            String  strQuarterus = String.valueOf(formatter.format(item.getQuarterus()));

            String  strQuarteruk = String.valueOf(formatter.format(item.getQuarteruk()));
            String strStoneuk = String.valueOf(formatter.format(item.getStoneuk()));
            String   strStoneus = String.valueOf(formatter.format(item.getStoneuk()));

            String  strTonne = String.valueOf(formatter.format(item.getTonne()));
            String strPennyweight = String.valueOf(formatter.format(item.getPennyweight()));
            String strScruple = String.valueOf(formatter.format(item.getScruple()));
            String strGrain = String.valueOf(formatter.format(item.getGrain()));
            String strGamma = String.valueOf(formatter.format(item.getGamma()));
            String  strTalent = String.valueOf(formatter.format(item.getTalent()));
            String strMina = String.valueOf(formatter.format(item.getMina()));
            String strShekel = String.valueOf(formatter.format(item.getShekel()));
            String strBekan = String.valueOf(formatter.format(item.getBekan()));

            String strGerah = String.valueOf(formatter.format(item.getGerah()));
            String strTalentbiblicalgreek = String.valueOf(formatter.format(item.getTalentbiblicalgreek()));
            String strMinabiblicalgreek = String.valueOf(formatter.format(item.getMinabiblicalgreek()));

            String  strTetradrachmabiblicalgreek = String.valueOf(formatter.format(item.getTetradrachmabiblicalgreek()));
            String strDidrachmabiblicalgreek = String.valueOf(formatter.format(item.getDidrachmabiblicalgreek()));
            String strDrachmabiblicalgreek = String.valueOf(formatter.format(item.getDrachmabiblicalgreek()));
            String strDenariusbiblicalroman = String.valueOf(formatter.format(item.getDenariusbiblicalroman()));
            String strAssarionbiblicalroman = String.valueOf(formatter.format(item.getAssarionbiblicalroman()));
            String strQuadransbiblicalroman = String.valueOf(formatter.format(item.getQuadransbiblicalroman()));
            String strLeptonbiblicalroman = String.valueOf(formatter.format(item.getLeptonbiblicalroman()));
            String strPlanckmass = String.valueOf(formatter.format(item.getPlanckmass()));
            String  strElectronmass = String.valueOf(formatter.format(item.getElectronmass()));
            String  strMuonmass = String.valueOf(formatter.format(item.getMuonmass()));
            String   strProtonmass = String.valueOf(formatter.format(item.getProtonmass()));
            String   strNeutronmass = String.valueOf(formatter.format(item.getNeutronmass()));
            String  strDeuteronmass = String.valueOf(formatter.format(item.getDeuteronmass()));
            String  strEarthmass = String.valueOf(formatter.format(item.getEarthmass()));

            String strSunmass = String.valueOf(formatter.format(item.getSunmass()));


            list.add(new ItemList("kg","Kilogram",strKilogram,"kg"));
            list.add(new ItemList("g","Gram",strGram,"g"));
            list.add(new ItemList("mg","Milligram",strMilligram,"mg"));
            list.add(new ItemList("t","Ton",strTonmetric,"t"));
            list.add(new ItemList("lbs","Pound",strPound,"lbs"));
            list.add(new ItemList("oz","Ounce",strOunce,"oz"));
            list.add(new ItemList("ct"," Carat",strCarat,"ct"));


            list.add(new ItemList("ton","Ton short US",strTonshort,"ton"));
            list.add(new ItemList("ton","Ton long UK ",strTonlong,"ton"));
            list.add(new ItemList("u","Atomic mass unit",strAtomicmassunit,"u"));
            list.add(new ItemList("Eg","Exagram",strExagram,"Eg"));
            list.add(new ItemList("Pg","Petagram ",strPetagram,"Pg"));
            list.add(new ItemList("Tg","Teragram ",strTeragram,"Tg"));


            list.add(new ItemList("Gg","Gigagram",strGigagram,"Gg"));
            list.add(new ItemList("Mg","Megagram",strMegagram,"Mg"));
            list.add(new ItemList("hg","Hectogram",strHectogram,"hg"));
            list.add(new ItemList("dag"," Dekagram",strDekagram,"dag"));
            list.add(new ItemList("dg","Decigram ",strDecigram,"dg"));


            list.add(new ItemList("cg","Centigram",strCentigram,"cg"));
            list.add(new ItemList(" μg","Microgram ",strMicrogram,"μg"));
            list.add(new ItemList("ng","Nanogram",strNanogram,"ng"));
            list.add(new ItemList("pg","Picogram",strPicogram,"pg"));
            list.add(new ItemList("fg","Femtogram ",strFemtogram,"fg"));


            list.add(new ItemList("ag","Attogram",strAttogram,"ag"));
            list.add(new ItemList("dt","Dalton",strDalton,"dt"));
            list.add(new ItemList("kg F sq s m- 1","Kilogram-force square second/meter",strKilogramforcesquaresecondpermeter,"kg F sq s m- 1"));
            list.add(new ItemList("kip"," Kilopond",strKilopound,"kip"));
            list.add(new ItemList("kip","Kip ",strKip,"kip"));


            list.add(new ItemList("slug","Slug",strslug,"slug"));
            list.add(new ItemList("lb F sq s ft-1","Pound-force square second/foot ",strPoundforcesquaresecondperfoot,"lb F sq s ft-1"));
            list.add(new ItemList("lb ","Pound (troy or apothecary)",strPoundtroy,"lb"));
            list.add(new ItemList("pdl"," Poundal",strPoundal,"pdl"));
            list.add(new ItemList("AT"," Ton (assay) (UK)",strTonuk,"AT"));


            list.add(new ItemList(" AT","Ton (assay) (US) ",strTonus,"AT"));
            list.add(new ItemList("kt","Kiloton",strKiloton,"kt"));
            list.add(new ItemList("cwt","Qunital (metric)",strQuintal,"cwt"));
            list.add(new ItemList("hwt","Hundredweight (US) ",strHundredweightus,"hwt"));
            list.add(new ItemList("hwt"," Hundredweight (UK) ",strHundredweightuk,"hwt"));


            list.add(new ItemList("qr","Quarter (US) ",strQuarterus,"qr"));
            list.add(new ItemList("qr","Quarter (UK) ",strQuarteruk,"qr"));
            list.add(new ItemList("st","Stone (US)",strStoneus,"st"));
            list.add(new ItemList("st"," Stone (UK)",strStoneuk,"st"));
            list.add(new ItemList("t"," Tonne",strTonne,"t"));
            list.add(new ItemList("pwt","Pennyweight",strPennyweight,"pwt"));
            list.add(new ItemList("s.ap","Scruple (apothecary)",strScruple,"s.ap"));
            list.add(new ItemList(" gr","Grain ",strGrain,"gr"));
            list.add(new ItemList("gamma","Gamma ",strGamma,"gamma"));
            list.add(new ItemList("talent ","Talent (Biblical Hebrew)",strTalent,"talent"));
            list.add(new ItemList("mina","Mina (Biblical Hebrew) ",strMina,"mina"));
            list.add(new ItemList("shekal","Shekal (Biblical Hebrew)",strShekel,"shekal"));
            list.add(new ItemList("bekan","Bekan (Biblical Hebrew)",strBekan,"bekan"));
            list.add(new ItemList(" gereh"," Gereh (Biblical Hebrew)",strGerah,"gereh"));
            list.add(new ItemList("talent"," Talent (Biblical Greek) ",strTalentbiblicalgreek,"talent"));

            list.add(new ItemList("mina","Mina (Biblical Greek)",strMinabiblicalgreek,"mina"));
            list.add(new ItemList(" tetd","Tetradrachma (Biblical Greek) ",strTetradrachmabiblicalgreek,"tetd"));
            list.add(new ItemList(" didrachma","Didrachma (Biblical Greek) ",strDidrachmabiblicalgreek,"didrachma"));
            list.add(new ItemList("drachma","Drachma (Biblical Greek) ",strDrachmabiblicalgreek,"drachma"));
            list.add(new ItemList(" denarius","Denarius (Biblical Roman)  ",strDenariusbiblicalroman,"denarius"));
            list.add(new ItemList("assarion ","Assarion (Biblical Roman)",strAssarionbiblicalroman,"assarion"));
            list.add(new ItemList("quadranns","Quadrans (Biblical Roman)",strQuadransbiblicalroman,"quadranns"));
            list.add(new ItemList("lepton","Lepton (Biblical Roman)",strLeptonbiblicalroman,"lepton"));
            list.add(new ItemList(" Planck mass","Planck mass ",strPlanckmass,"Planck mass"));
            list.add(new ItemList("e-","Electron mass (rest) ",strElectronmass,"e-"));
            list.add(new ItemList("M","Muon mass",strMuonmass,"M"));
            list.add(new ItemList("p","Proton mass ",strProtonmass,"p"));
            list.add(new ItemList(" n","Neutron mass ",strNeutronmass,"n"));
            list.add(new ItemList(" D","Deuteron mass  ",strDeuteronmass,"D"));
            list.add(new ItemList("Earth","Earth's mass ",strEarthmass,"Earth"));
            list.add(new ItemList("Sun","Sun mass",strSunmass,"Sun"));




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
