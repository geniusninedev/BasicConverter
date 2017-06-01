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
import com.nineinfosys.basicconverter.Engin.PowerConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.ItemList;
import com.nineinfosys.basicconverter.Supporter.Settings;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversionPowerListActivity extends AppCompatActivity implements TextWatcher {

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
        setContentView(R.layout.activity_conversion_list);
        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#db290d")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#a10000"));
        }

        //format of decimal pint
        formatsetting();

        MobileAds.initialize(ConversionPowerListActivity.this, getString(R.string.ads_app_id));
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
        switch (stringSpinnerFrom) {
            case "Bit - b":
                textconversionFrom.setText("Bit");
                textViewConversionShortform.setText("b");
                break;
            case "Watt -W":
                textconversionFrom.setText("Watt");                 textViewConversionShortform.setText("W");
                break;
            case "Exawatt -EW":
                textconversionFrom.setText("Exawatt");                 textViewConversionShortform.setText("EW");
                break;
            case "Petawatt -PW":
                textconversionFrom.setText("Petawatt");                 textViewConversionShortform.setText("PW");
                break;
            case "Terawatt -TW":
                textconversionFrom.setText("Terawatt");                 textViewConversionShortform.setText("TW");
                break;
            case "Gigawatt -GW":
                textconversionFrom.setText("Gigawatt");                 textViewConversionShortform.setText("GW");
                break;
            case "Megawatt -MW":
                textconversionFrom.setText("Megawatt");                 textViewConversionShortform.setText("MW");
                break;
            case "Kilowatt -kW":
                textconversionFrom.setText("Kilowatt");                 textViewConversionShortform.setText("kW");
                break;
            case "Hectowatt -hW":
                textconversionFrom.setText("Hectowatt");                 textViewConversionShortform.setText("hW");
                break;
            case "Dekawatt -daW":
                textconversionFrom.setText("Dekawatt");                 textViewConversionShortform.setText("daW");
                break;
            case "Deciwatt -dW":
                textconversionFrom.setText("Deciwatt");                 textViewConversionShortform.setText("dW");
                break;
            case "Centiwatt -cW":
                textconversionFrom.setText("Centiwatt");                 textViewConversionShortform.setText("cW");
                break;
            case "Milliwatt -mW":
                textconversionFrom.setText("Milliwatt");                 textViewConversionShortform.setText("mW");
                break;
            case "Microwatt -μW":
                textconversionFrom.setText("Microwatt");                 textViewConversionShortform.setText("μW");
                break;
            case "Nanowatt -nW":
                textconversionFrom.setText("Nanowatt");                 textViewConversionShortform.setText("nW");
                break;
            case "Picowatt -pW":
                textconversionFrom.setText("Picowatt");                 textViewConversionShortform.setText("pW");
                break;
            case "Femtowatt -fW":
                textconversionFrom.setText("Femtowatt");                 textViewConversionShortform.setText("fW");
                break;
            case "Attowatt -aW":
                textconversionFrom.setText("Attowatt");                 textViewConversionShortform.setText("aW");
                break;
            case "Horsepower -hp,hp(UK)":
                textconversionFrom.setText("Horsepower");                 textViewConversionShortform.setText("hp,hp(UK)");
                break;
            case "Horsepower (550 ft*lbf/s) -hp,hp(UK)":
                textconversionFrom.setText("Horsepower (550 ft*lbf/s)");                 textViewConversionShortform.setText("hp,hp(UK)");
                break;
            case "Horsepower (metric) -hp(metric)":
                textconversionFrom.setText("Horsepower (metric) ");                 textViewConversionShortform.setText("hp(metric)");
                break;
            case "Horsepower (boiler) -hp(boiler)":
                textconversionFrom.setText("Horsepower (boiler) ");                 textViewConversionShortform.setText("hp(boiler)");
                break;
            case "Horsepower (electric) -hp(electric)":
                textconversionFrom.setText("Horsepower (electric) ");                 textViewConversionShortform.setText("hp(electric)");
                break;
            case "Horsepower (water) -hp(water)":
                textconversionFrom.setText("Horsepower (water) ");                 textViewConversionShortform.setText("hp(water)");
                break;
            case "Pferdestarke (ps) -ps":
                textconversionFrom.setText("Pferdestarke (ps) ");                 textViewConversionShortform.setText("ps");
                break;
            case "Btu (IT)/hour -Btu/h":
                textconversionFrom.setText("Btu (IT)/hour ");                 textViewConversionShortform.setText("Btu/h");
                break;
            case "Btu (IT)/minute -Btu/min":
                textconversionFrom.setText("Btu (IT)/minute ");                 textViewConversionShortform.setText("Btu/min");
                break;
            case "Btu (IT)/second -Btu/s":
                textconversionFrom.setText("Btu (IT)/second ");                 textViewConversionShortform.setText("Btu/s");
                break;
            case "Btu (th)/hour -Btu(th)/h":
                textconversionFrom.setText("Btu (th)/hour ");                 textViewConversionShortform.setText("Btu(th)/h");
                break;
            case "Btu (th)/minute -Btu(th)/min":
                textconversionFrom.setText("Btu (th)/minute ");                 textViewConversionShortform.setText("Btu(th)/min");
                break;
            case "Btu (th)/second -Btu(th)/s":
                textconversionFrom.setText("Btu (th)/second ");                 textViewConversionShortform.setText("Btu(th)/s");
                break;
            case "MBtu (IT)/hour -MBtu/h":
                textconversionFrom.setText("MBtu (IT)/hour ");                 textViewConversionShortform.setText("MBtu/h");
                break;
            case "MBH -MBH":
                textconversionFrom.setText("MBH ");                 textViewConversionShortform.setText("MBH");
                break;
            case "Ton (refrigeration) -ton":
                textconversionFrom.setText("Ton (refrigeration) ");                 textViewConversionShortform.setText("ton");
                break;
            case "Kilocalorie (IT)/hour -kcal/h":
                textconversionFrom.setText("Kilocalorie (IT)/hour ");                 textViewConversionShortform.setText("kcal/h");
                break;
            case "Kilocalorie (IT)/minute -kcal/min":
                textconversionFrom.setText("Kilocalorie (IT)/minute ");                 textViewConversionShortform.setText("kcal/min");
                break;
            case "Kilocalorie (IT)/second -kcal/s":
                textconversionFrom.setText("Kilocalorie (IT)/second ");                 textViewConversionShortform.setText("kcal/s");
                break;
            case "Kilocalorie (th)/hour -kcal(th)/h":
                textconversionFrom.setText("Kilocalorie (th)/hour ");                 textViewConversionShortform.setText("kcal(th)/h");
                break;
            case "Kilocalorie (th)/minute -kcal(th)/min":
                textconversionFrom.setText("Kilocalorie (th)/minute ");                 textViewConversionShortform.setText("kcal(th)/min");
                break;
            case "Kilocalorie (th)/second -kcal(th)/s":
                textconversionFrom.setText("Kilocalorie (th)/second ");                 textViewConversionShortform.setText("kcal(th)/s");
                break;
            case "Calorie (IT)/hour -cal/h":
                textconversionFrom.setText("Calorie (IT)/hour ");                 textViewConversionShortform.setText("cal/h");
                break;
            case "Calorie (IT)/minute -cal/min":
                textconversionFrom.setText("Calorie (IT)/minute ");                 textViewConversionShortform.setText("cal/min");
                break;
            case "Calorie (IT)/second -cal/s":
                textconversionFrom.setText("Calorie (IT)/second ");                 textViewConversionShortform.setText("cal/s");
                break;
            case "Calorie (th)/hour -cal(th)/h":
                textconversionFrom.setText("Calorie (th)/hour ");                 textViewConversionShortform.setText("cal(th)/h");
                break;
            case "Calorie (th)/minute -cal(th)/min":
                textconversionFrom.setText("Calorie (th)/minute ");                 textViewConversionShortform.setText("cal(th)/min");
                break;
            case "Calorie (th)/second -cal(th)/s":
                textconversionFrom.setText("Calorie (th)/second ");                 textViewConversionShortform.setText("cal(th)/s");
                break;
            case "Foot pound-force/hour -lbf*ft/h":
                textconversionFrom.setText("Foot pound-force/hour ");                 textViewConversionShortform.setText("lbf*ft/h");
                break;
            case "Foot pound-force/minute -lbf*ft/min":
                textconversionFrom.setText("Foot pound-force/minute ");                 textViewConversionShortform.setText("lbf*ft/min");
                break;
            case "Foot pound-force/second -lbf*ft/s":
                textconversionFrom.setText("Foot pound-force/second ");                 textViewConversionShortform.setText("lbf*ft/s");
                break;
            case "Pound-foot/hour -lbf*ft/h":
                textconversionFrom.setText("Pound-foot/hour ");                 textViewConversionShortform.setText("lbf*ft/h");
                break;
            case "Pound-foot/minute -lbf*ft/min":
                textconversionFrom.setText("Pound-foot/minute ");                 textViewConversionShortform.setText("lbf*ft/min");
                break;
            case "Pound-foot/second -lbf*ft/s":
                textconversionFrom.setText("Pound-foot/second ");                 textViewConversionShortform.setText("lbf*ft/s");
                break;
            case "Erg/second -erg/s":
                textconversionFrom.setText("Erg/second ");                 textViewConversionShortform.setText("erg/s");
                break;
            case "Kilovolt ampere -kV*A":
                textconversionFrom.setText("Kilovolt ampere ");                 textViewConversionShortform.setText("kV*A");
                break;
            case "Volt ampere -V*A":
                textconversionFrom.setText("Volt ampere ");                 textViewConversionShortform.setText("V*A");
                break;
            case "Newton meter/second -N*m/s":
                textconversionFrom.setText("Newton meter/second ");                 textViewConversionShortform.setText("N*m/s");
                break;
            case "Joule/second -J/s":
                textconversionFrom.setText("Joule/second ");                 textViewConversionShortform.setText("J/s");
                break;
            case "Exajoule/second -EJ/s":
                textconversionFrom.setText("Exajoule/second ");                 textViewConversionShortform.setText("EJ/s");
                break;
            case "Petajoule/second -PJ/s":
                textconversionFrom.setText("Petajoule/second ");                 textViewConversionShortform.setText("PJ/s");
                break;
            case "Terajoule/second -TJ/s":
                textconversionFrom.setText("Terajoule/second ");                 textViewConversionShortform.setText("TJ/s");
                break;
            case "Gigajoule/second -GJ/s":
                textconversionFrom.setText("Gigajoule/second ");                 textViewConversionShortform.setText("GJ/s");
                break;
            case "Megajoule/second -MJ/s":
                textconversionFrom.setText("Megajoule/second ");                 textViewConversionShortform.setText("MJ/s");
                break;
            case "Kilojoule/second -kJ/s":
                textconversionFrom.setText("Kilojoule/second");                 textViewConversionShortform.setText("kJ/s");
                break;
            case "Hectojoule/second -hJ/s":
                textconversionFrom.setText("Hectojoule/second ");                 textViewConversionShortform.setText("hJ/s");
                break;
            case "Dekajoule/second -daJ/s":
                textconversionFrom.setText("Dekajoule/second ");                 textViewConversionShortform.setText("daJ/s");
                break;
            case "Decijoule/second -dJ/s":
                textconversionFrom.setText("Decijoule/second ");                 textViewConversionShortform.setText("dJ/s");
                break;
            case "Centijoule/second -CJ/s":
                textconversionFrom.setText("Centijoule/second ");                 textViewConversionShortform.setText("CJ/s");
                break;
            case "Millijoule/second -mJ/s":
                textconversionFrom.setText("Millijoule/second ");                 textViewConversionShortform.setText("mJ/s");
                break;
            case "Microjoule/second -μJ/s":
                textconversionFrom.setText("Microjoule/second ");                 textViewConversionShortform.setText("μJ/s");
                break;
            case "Nanojoule/second -nJ/s":
                textconversionFrom.setText("Nanojoule/second ");                 textViewConversionShortform.setText("nJ/s");
                break;
            case "Picojoule/second -pJ/S":
                textconversionFrom.setText("Picojoule/second ");                 textViewConversionShortform.setText("pJ/S");
                break;
            case "Femtojoule/second -fJ/s":
                textconversionFrom.setText("Femtojoule/second ");                 textViewConversionShortform.setText("fJ/s");
                break;
            case "Attojoule/second -aJ/s":
                textconversionFrom.setText("Attojoule/second ");                 textViewConversionShortform.setText("aJ/s");
                break;
            case "Joule/hour -J/h":
                textconversionFrom.setText("Joule/hour ");                 textViewConversionShortform.setText("J/h");
                break;
            case "Joule/minute -J/min":
                textconversionFrom.setText("Joule/minute ");                 textViewConversionShortform.setText("J/min");
                break;
            case "Kilojoule/hour -kJ/h":
                textconversionFrom.setText("Kilojoule/hour ");                 textViewConversionShortform.setText("kJ/h");
                break;
            case "Kilojoule/minute -kJ/min":
                textconversionFrom.setText("Kilojoule/minute ");                 textViewConversionShortform.setText("kJ/min");
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

        PowerConverter c = new  PowerConverter(strSpinnerFrom,doubleEdittextvalue1);
        ArrayList<PowerConverter.ConversionResults> results = c.calculatePowerConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            PowerConverter.ConversionResults item = results.get(i);



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

            list.add(new ItemList("W","Watt ",strwatt,"W"));
            list.add(new ItemList("EW","Exawatt ",strexawatt,"EW"));
            list.add(new ItemList("PW","Petawatt ",strpetawatt,"PW"));
            list.add(new ItemList("TW","Terawatt ",strterawatt,"TW"));
            list.add(new ItemList("GW","Gigawatt ",strgigawatt,"GW"));
            list.add(new ItemList("MW","Megawatt ",strmegawatt,"MW"));
            list.add(new ItemList("kW","Kilowatt ",strkilowatt,"kW"));
            list.add(new ItemList("hW","Hectowatt ",strhectowatt,"hW"));
            list.add(new ItemList("daW","Dekawatt ",strdekawatt,"daW"));
            list.add(new ItemList("dW","Deciwatt ",strdeciwatt,"dW"));
            list.add(new ItemList("cW","Centiwatt ",strcentiwatt,"cW"));
            list.add(new ItemList("mW","Milliwatt ",strmilliwatt,"mW"));
            list.add(new ItemList("μW"," Microwatt ",strmicrowatt,"μW"));
            list.add(new ItemList("nW"," Nanowatt ",strnanowatt,"nW"));
            list.add(new ItemList("pW"," Picowatt ",strpicowatt,"pW"));
            list.add(new ItemList("fW","Femtowatt ",strfemtowatt,"fW"));
            list.add(new ItemList("aW","Attowatt ",strattowatt,"aW"));
            list.add(new ItemList("hp,hp(UK)"," Horsepower ",strhorsepower,"hp,hp(UK)"));
            list.add(new ItemList("hp,hp(UK)","Horsepower (550 ft*lbf/s) ",strhorsepower550ftlbfs,"hp,hp(UK)"));
            list.add(new ItemList("hp(metric)","Horsepower (metric) ",strhorsepowermetric,"hp(metric)"));
            list.add(new ItemList("hp(boiler)","Horsepower (boiler) ",strhorsepowerboiler,"hp(boiler)"));
            list.add(new ItemList("hp(electric)","Horsepower (electric) ",strhorsepowerelectric,"hp(electric)"));
            list.add(new ItemList("hp(water)","Horsepower (water) ",strhorsepowerwater,"hp(water)"));
            list.add(new ItemList("ps","Pferdestarke (ps) ",strpferdestarkeps,"ps"));
            list.add(new ItemList("Btu/h","Btu (IT)/hour ",strBtuIThour,"Btu/h"));
            list.add(new ItemList("Btu/min","Btu (IT)/minute ",strBtuITminute,"Btu/min"));
            list.add(new ItemList("Btu/s","Btu (IT)/second ",strBtuITsecond,"Btu/s"));
            list.add(new ItemList("Btu(th)/h","Btu (th)/hour ",strBtuthhour,"Btu(th)/h"));
            list.add(new ItemList("Btu(th)/min","Btu (th)/minute ",strBtuthminute,"Btu(th)/min"));
            list.add(new ItemList("Btu(th)/s","Btu (th)/second ",strBtuthsecond,"Btu(th)/s"));
            list.add(new ItemList("MBtu/h","MBtu (IT)/hour ",strMBtuIThour,"MBtu/h"));
            list.add(new ItemList("MBH","MBH ",strMBH,"MBH"));
            list.add(new ItemList("ton","Ton (refrigeration) ",strtonrefrigeration,"ton"));
            list.add(new ItemList("kcal/h","Kilocalorie (IT)/hour ",strkilocalorieIThour,"kcal/h"));
            list.add(new ItemList("kcal/min","Kilocalorie (IT)/minute ",strkilocalorieITminute,"kcal/min"));
            list.add(new ItemList("kcal/s","Kilocalorie (IT)/second ",strkilocalorieITsecond,"kcal/s"));
            list.add(new ItemList("kcal(th)/h"," Kilocalorie (th)/hour ",strkilocaloriethhour,"kcal(th)/h"));
            list.add(new ItemList("kcal(th)/min","Kilocalorie (th)/minute ",strkilocaloriethminute,"kcal(th)/min"));
            list.add(new ItemList("kcal(th)/s","Kilocalorie (th)/second ",strkilocaloriethsecond,"kcal(th)/s"));
            list.add(new ItemList("cal/h"," Calorie (IT)/hour ",strcalorieIThour,"cal/h"));
            list.add(new ItemList("cal/min","Calorie (IT)/minute ",strcalorieITminute,"cal/min"));
            list.add(new ItemList("cal/s","Calorie (IT)/second ",strcalorieITsecond,"cal/s"));
            list.add(new ItemList("cal(th)/h","Calorie (th)/hour ",strcaloriethhour,"cal(th)/h"));
            list.add(new ItemList("cal(th)/min","Calorie (th)/minute ",strcaloriethminute,"cal(th)/min"));
            list.add(new ItemList("cal(th)/s","Calorie (th)/second ",strcaloriethsecond,"cal(th)/s"));
            list.add(new ItemList("lbf*ft/h","Foot pound-force/hour ",strfootpoundforcehour,"lbf*ft/h"));
            list.add(new ItemList("lbf*ft/min","Foot pound-force/minute ",strfootpoundforceminute,"lbf*ft/min"));
            list.add(new ItemList("lbf*ft/s","Foot pound-force/second ",strfootpoundforcesecond,"lbf*ft/s"));
            list.add(new ItemList("lbf*ft/h","Pound-foot/hour ",strpoundfoothour,"lbf*ft/h"));
            list.add(new ItemList("lbf*ft/min","Pound-foot/minute ",strpoundfootminute,"lbf*ft/min"));
            list.add(new ItemList("lbf*ft/s","Pound-foot/second ",strpoundfootsecond,"lbf*ft/s"));
            list.add(new ItemList("erg/s","Erg/second ",strergsecond,"erg/s"));
            list.add(new ItemList("kV*A"," Kilovolt ampere ",strkilovoltampere,"kV*A"));
            list.add(new ItemList("V*A","Volt ampere ",strvoltampere,"V*A"));
            list.add(new ItemList("N*m/s","Newton meter/second ",strnewtonmetersecond,"N*m/s"));
            list.add(new ItemList("J/s","Joule/second ",strjoulesecond,"J/s"));
            list.add(new ItemList("EJ/s","Exajoule/second ",strexajoulesecond,"EJ/s"));
            list.add(new ItemList("PJ/s","Petajoule/second ",strpetajoulesecond,"PJ/s"));
            list.add(new ItemList("TJ/s","Terajoule/second ",strterajoulesecond,"TJ/s"));
            list.add(new ItemList("GJ/s","Gigajoule/second ",strgigajoulesecond,"GJ/s"));
            list.add(new ItemList("MJ/s","Megajoule/second ",strmegajoulesecond,"MJ/s"));
            list.add(new ItemList("kJ/s","Kilojoule/second ",strkilojoulesecond,"kJ/s"));
            list.add(new ItemList("hJ/s","Hectojoule/second ",strhectojoulesecond,"hJ/s"));
            list.add(new ItemList("daJ/s","Dekajoule/second ",strdekajoulesecond,"daJ/s"));
            list.add(new ItemList("dJ/s","Decijoule/second ",strdecijoulesecond,"dJ/s"));
            list.add(new ItemList("CJ/s","Centijoule/second ",strcentijoulesecond,"CJ/s"));
            list.add(new ItemList("mJ/s","Millijoule/second ",strmillijoulesecond,"mJ/s"));
            list.add(new ItemList("μJ/s","Microjoule/second ",strmicrojoulesecond,"μJ/s"));
            list.add(new ItemList("nJ/s","Nanojoule/second ",strnanojoulesecond,"nJ/s"));
            list.add(new ItemList("pJ/S","Picojoule/second ",strpicojoulesecond,"pJ/S"));
            list.add(new ItemList("fJ/s","Femtojoule/second ",strfemtojoulesecond,"fJ/s"));
            list.add(new ItemList("aJ/s","Attojoule/second ",strattojoulesecond,"aJ/s"));
            list.add(new ItemList("J/h","Joule/hour ",strjoulehour,"J/h"));
            list.add(new ItemList("J/min","Joule/minute ",strjouleminute,"J/min"));
            list.add(new ItemList("kJ/h","Kilojoule/hour ",strkilojoulehour,"kJ/h"));
            list.add(new ItemList("kJ/min","Kilojoule/minute ",strkilojouleminute,"kJ/min"));




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
