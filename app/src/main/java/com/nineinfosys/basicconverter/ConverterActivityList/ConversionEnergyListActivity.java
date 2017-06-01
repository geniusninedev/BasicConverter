package com.nineinfosys.basicconverter.ConverterActivityList;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.nineinfosys.basicconverter.Adapter.RecyclerViewConversionListAdapter;
import com.nineinfosys.basicconverter.Engin.EnergyConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.ItemList;
import com.nineinfosys.basicconverter.Supporter.Settings;


import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversionEnergyListActivity extends AppCompatActivity implements TextWatcher {

    private static RecyclerView rView;
    List<ItemList> list = new ArrayList<ItemList>();
    private String stringSpinnerFrom;
    private double doubleEdittextvalue;
    private EditText edittextConversionListvalue;
    private TextView textconversionFrom, textViewConversionShortform;
    View ChildView;
    DecimalFormat formatter = null;

    // public RecyclerView rView;
    RecyclerViewConversionListAdapter rcAdapter;
    List<ItemList> rowListItem, rowListItem1;


    private String strJoule = null, strKilojoule = null, strKilowatthour = null, strWatthour = null, strCalorienutritional = null, strHorsepowermetrichour = null, strBtuIT = null, strBtuth = null,
            strGigajoule = null, strMegajoule = null, strMillijoule = null, strMicrojoule = null, strNanojoule = null, strAttojoule = null, strMegaelectronvolt = null, strKiloelectronvolt = null, strElectronvolt = null,
            strErg = null, strGigawatthour = null, strMegawatthour = null, strKilowattsecond = null, strWattsecond = null, strNewtonmeter = null, strHorsepowerhour = null, strKilocalorieIT = null, strKilocalorieth = null,
            strCalorieIT = null, strCalorieth = null, strMegaBtuIT = null, strTonhourrefrigeration = null, strFueloilequivalentkiloliter = null, strFueloilequivalentbarrelUS = null, strGigaton = null, strMegaton = null,
            strKiloton = null, strTonexplosives = null, strDynecentimeter = null, strGramforcemeter = null, strGramforcecentimeter = null, strKilogramforcecentimeter = null, strKilogramforcemeter = null, strKilopondmeter = null,
            strPoundforcefoot = null, strPoundforceinch = null, strOunceforceinch = null, strFootpound = null, strInchpound = null, strInchounce = null, strPoundalfoot = null, strTherm = null, strThermEC = null, strThermUS = null,
            strHartreeenergy = null, strRydbergconstant = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_list);

        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#59db59")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        MobileAds.initialize(ConversionEnergyListActivity.this, getString(R.string.ads_app_id));
        AdView mAdView = (AdView) findViewById(R.id.adViewUnitConverterList);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#0aa828"));
        }

        //for displayinf overflow button in actionbar
        try {
            ViewConfiguration config = ViewConfiguration.get(this);
            Field menuKeyField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
            if (menuKeyField != null) {
                menuKeyField.setAccessible(true);
                menuKeyField.setBoolean(config, false);
            }
        } catch (Exception ex) {
            // Ignore
        }


        //format of decimal pint
        formatsetting();

        // ll = (ScrollView)findViewById(R.id.linearlayout);
        edittextConversionListvalue = (EditText) findViewById(R.id.edittextConversionListvalue);
        textconversionFrom = (TextView) findViewById(R.id.textViewConversionFrom);
        textViewConversionShortform = (TextView) findViewById(R.id.textViewConversionShortform);

        //get the value from temperture activity
        stringSpinnerFrom = getIntent().getExtras().getString("stringSpinnerFrom");
        doubleEdittextvalue = getIntent().getExtras().getDouble("doubleEdittextvalue");
        edittextConversionListvalue.setText(String.valueOf(doubleEdittextvalue));

        NamesAndShortform(stringSpinnerFrom);

        //   Toast.makeText(this,"string1 "+stringSpinnerFrom,Toast.LENGTH_LONG).show();
        rowListItem = getAllunitValue(stringSpinnerFrom, doubleEdittextvalue);

        //Initializing Views
        rView = (RecyclerView) findViewById(R.id.recyclerViewConverterList);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(new GridLayoutManager(this, 1));


        //Initializing our superheroes list
        rcAdapter = new RecyclerViewConversionListAdapter(this, rowListItem);
        rView.setAdapter(rcAdapter);

        edittextConversionListvalue.addTextChangedListener(this);

    }


    private void NamesAndShortform(String stringSpinnerFrom) {
        switch (stringSpinnerFrom) {
            case "Joule - J":
                textconversionFrom.setText("Joule");
                textViewConversionShortform.setText("J");
                break;
            case "Kilo joule - kJ":
                textconversionFrom.setText("Kilo joule");
                textViewConversionShortform.setText("kJ");
                break;
            case "Kilo-watt hour - kW*h":
                textconversionFrom.setText("Kilo-watt hour");
                textViewConversionShortform.setText("kW*h");
                break;
            case "Watt-hour - W*h":
                textconversionFrom.setText("Watt-hour");
                textViewConversionShortform.setText("W*h");
                break;
            case "Calorie (nutritional) - cal(nutritional)":
                textconversionFrom.setText("Calorie (nutritional)");
                textViewConversionShortform.setText("cal(nutritional)");
                break;
            case "Horsepower (metric) hour - hp*h":
                textconversionFrom.setText("Horsepower (metric) hour");
                textViewConversionShortform.setText("hp*h");
                break;
            case "Btu(IT) - btu(IT),Btu":
                textconversionFrom.setText("Btu(IT)");
                textViewConversionShortform.setText("btu(IT),Btu");
                break;
            case "Btu(th) - btu(th)":
                textconversionFrom.setText("Btu(th)");
                textViewConversionShortform.setText("btu(th)");
                break;
            case "Giga joule - GJ":
                textconversionFrom.setText("Giga joule");
                textViewConversionShortform.setText("GJ");
                break;
            case "Mega joule - MJ":
                textconversionFrom.setText("Mega joule");
                textViewConversionShortform.setText("MJ");
                break;
            case "Milli joule - mJ":
                textconversionFrom.setText("Milli joule");
                textViewConversionShortform.setText("mJ");
                break;
            case "Micro joule - μj":
                textconversionFrom.setText("Micro joule");
                textViewConversionShortform.setText("μj");
                break;
            case "Nano joule - nJ":
                textconversionFrom.setText("Nano joule");
                textViewConversionShortform.setText("nJ");
                break;
            case "Atto joule - aJ":
                textconversionFrom.setText("Atto joule");
                textViewConversionShortform.setText("aJ");
                break;
            case "Mega electron-volt - MeV":
                textconversionFrom.setText("Mega electron-volt");
                textViewConversionShortform.setText("MeV");
                break;
            case "Kilo electron-volt - KeV":
                textconversionFrom.setText("Kilo electron-volt");
                textViewConversionShortform.setText("KeV");
                break;
            case "Electron-volt - eV":
                textconversionFrom.setText("Electron-volt");
                textViewConversionShortform.setText("eV");
                break;
            case "Erg - erg":
                textconversionFrom.setText("Erg");
                textViewConversionShortform.setText("erg");
                break;
            case "Giga watt-hour - GW*h":
                textconversionFrom.setText("Giga watt-hour");
                textViewConversionShortform.setText("GW*h");
                break;
            case "Mega watt-hour - MW*h":
                textconversionFrom.setText("Mega watt-hour");
                textViewConversionShortform.setText("MW*h");
                break;
            case "Kilo watt-second - kW*s":
                textconversionFrom.setText("Kilo watt-second");
                textViewConversionShortform.setText("kW*s");
                break;
            case "Watt-second - W*s":
                textconversionFrom.setText("Watt-second");
                textViewConversionShortform.setText("W*s");
                break;
            case "Newton meter - N*m":
                textconversionFrom.setText("Newton meter");
                textViewConversionShortform.setText("N*m");
                break;
            case "Horse power hour - hp*h":
                textconversionFrom.setText("Horse power hour");
                textViewConversionShortform.setText("hp*h");
                break;
            case "Kilo calorie(IT) - kcal(IT)":
                textconversionFrom.setText("Kilo calorie(IT)");
                textViewConversionShortform.setText("kcal(IT)");
                break;
            case "Kilo calorie(th) - kcal(th)":
                textconversionFrom.setText("Kilo calorie(th)");
                textViewConversionShortform.setText("kcal(th)");
                break;
            case "Calorie(IT) - cal(IT),cal":
                textconversionFrom.setText("Calorie(IT)");
                textViewConversionShortform.setText("cal(IT),cal");
                break;
            case "Calorie(th) - cal(th)":
                textconversionFrom.setText("Calorie(th)");
                textViewConversionShortform.setText("cal(th)");
                break;
            case "Mega Btu (IT) - MBtu(IT)":
                textconversionFrom.setText("Mega Btu (IT)");
                textViewConversionShortform.setText("MBtu(IT)");
                break;
            case "Ton-hour (refrigeration) - ton*h":
                textconversionFrom.setText("Ton-hour (refrigeration)");
                textViewConversionShortform.setText("ton*h");
                break;
            case "Fuel oil equivalent @kiloliter - kl":
                textconversionFrom.setText("Fuel oil equivalent @kiloliter");
                textViewConversionShortform.setText("kl");
                break;
            case "Fuel oil equivalent @barrel (US)  - bbl":
                textconversionFrom.setText("Fuel oil equivalent @barrel (US)");
                textViewConversionShortform.setText("bbl");
                break;
            case "Giga ton - Gton":
                textconversionFrom.setText("Giga ton");
                textViewConversionShortform.setText("Gton");
                break;
            case "Mega ton - Mton":
                textconversionFrom.setText("Mega ton");
                textViewConversionShortform.setText("Mton");
                break;
            case "Kilo ton - kton":
                textconversionFrom.setText("Kilo ton");
                textViewConversionShortform.setText("kton");
                break;
            case "Ton (explosives) - ton":
                textconversionFrom.setText("Ton (explosives)");
                textViewConversionShortform.setText("ton");
                break;
            case "Dyne centimeter - dyn*cm":
                textconversionFrom.setText("Dyne centimeter");
                textViewConversionShortform.setText("dyn*cm");
                break;
            case "Gram-force meter - gf*m":
                textconversionFrom.setText("Gram-force meter");
                textViewConversionShortform.setText("gf*m");
                break;
            case "Gram-force centimeter - gf*cm":
                textconversionFrom.setText("Gram-force centimeter");
                textViewConversionShortform.setText("gf*cm");
                break;
            case "Kilogram-force centimeter - kgf*cm":
                textconversionFrom.setText("Kilogram-force centimeter");
                textViewConversionShortform.setText("kgf*cm");
                break;
            case "Kilogram-force meter - kgf*m":
                textconversionFrom.setText("Kilogram-force meter");
                textViewConversionShortform.setText("kgf*m");
                break;
            case "Kilo pond meter - kp*m":
                textconversionFrom.setText("Kilo pond meter");
                textViewConversionShortform.setText("kp*m");
                break;
            case "Pound-force foot - lbf*ft":
                textconversionFrom.setText("Pound-force foot");
                textViewConversionShortform.setText("lbf*ft");
                break;
            case "Pound-force inch - lbf*in":
                textconversionFrom.setText("Pound-force inch");
                textViewConversionShortform.setText("lbf*in");
                break;
            case "Ounce-force inch - ozf*in":
                textconversionFrom.setText("Ounce-force inch");
                textViewConversionShortform.setText("ozf*in");
                break;
            case "Foot-pound - ft*lbf":
                textconversionFrom.setText("Foot-pound");
                textViewConversionShortform.setText("ft*lbf");
                break;
            case "Inch-pound - in*lbf":
                textconversionFrom.setText("Inch-pound");
                textViewConversionShortform.setText("in*lbf");
                break;
            case "Inch-ounce - in*ozf":
                textconversionFrom.setText("Inch-ounce");
                textViewConversionShortform.setText("in*ozf");
                break;
            case "Poundal foot - pdl*ft":
                textconversionFrom.setText("Poundal foot");
                textViewConversionShortform.setText("pdl*ft");
                break;
            case "Therm - therm":
                textconversionFrom.setText("Therm");
                textViewConversionShortform.setText("therm");
                break;
            case "Therm(EC) - therm":
                textconversionFrom.setText("Therm(EC)");
                textViewConversionShortform.setText("therm");
                break;
            case "Therm(US) - therm":
                textconversionFrom.setText("Therm(US)");
                textViewConversionShortform.setText("therm");
                break;
            case "Hartree energy - He":
                textconversionFrom.setText("Hartree energy");
                textViewConversionShortform.setText("He");
                break;
            case "Rydberg constant - Rc":
                textconversionFrom.setText("Rydberg constant");
                textViewConversionShortform.setText("Rc");
                break;
        }
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

    private List<ItemList> getAllunitValue(String strSpinnerFrom, double doubleEdittextvalue1) {

        EnergyConverter c = new EnergyConverter(strSpinnerFrom, doubleEdittextvalue1);
        ArrayList<EnergyConverter.ConversionResults> results = c.calculateenergyConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            EnergyConverter.ConversionResults item = results.get(i);


            strJoule = String.valueOf(formatter.format(item.getJoule()));
            strKilojoule = String.valueOf(formatter.format(item.getKilojoule()));
            strKilowatthour = String.valueOf(formatter.format(item.getKilowatthour()));
            strWatthour = String.valueOf(formatter.format(item.getWatthour()));
            strCalorienutritional = String.valueOf(formatter.format(item.getCalorie()));
            strHorsepowermetrichour = String.valueOf(formatter.format(item.getHorsepower()));
            strBtuIT = String.valueOf(formatter.format(item.getBtuIT()));
            strBtuth = String.valueOf(formatter.format(item.getBtuth()));
            strGigajoule = String.valueOf(formatter.format(item.getGigajoule()));
            strMegajoule = String.valueOf(formatter.format(item.getMegajoule()));
            strMillijoule = String.valueOf(formatter.format(item.getMillijoule()));
            strMicrojoule = String.valueOf(formatter.format(item.getMicrojoule()));
            strNanojoule = String.valueOf(formatter.format(item.getNanojoule()));
            strAttojoule = String.valueOf(formatter.format(item.getAttojoule()));
            strMegaelectronvolt = String.valueOf(formatter.format(item.getMegaelectronvolt()));
            strKiloelectronvolt = String.valueOf(formatter.format(item.getKiloelectronvolt()));
            strElectronvolt = String.valueOf(formatter.format(item.getElectronvolt()));
            strErg = String.valueOf(formatter.format(item.getErg()));
            strGigawatthour = String.valueOf(formatter.format(item.getGigawatthour()));
            strMegawatthour = String.valueOf(formatter.format(item.getMegawatthour()));
            strKilowattsecond = String.valueOf(formatter.format(item.getKilowattsecond()));
            strWattsecond = String.valueOf(formatter.format(item.getWattsecond()));
            strNewtonmeter = String.valueOf(formatter.format(item.getNewtonmeter()));
            strHorsepowerhour = String.valueOf(formatter.format(item.getHorsepowerhour()));
            strKilocalorieIT = String.valueOf(formatter.format(item.getKilocalorieIT()));
            strKilocalorieth = String.valueOf(formatter.format(item.getKilocalorieth()));
            strCalorieIT = String.valueOf(formatter.format(item.getCalorieit()));
            strCalorieth = String.valueOf(formatter.format(item.getCalorieth()));
            strMegaBtuIT = String.valueOf(formatter.format(item.getMegaBtuIT()));
            strTonhourrefrigeration = String.valueOf(formatter.format(item.getTonhour()));
            strFueloilequivalentkiloliter = String.valueOf(formatter.format(item.getFuelkl()));
            strFueloilequivalentbarrelUS = String.valueOf(formatter.format(item.getFuelb()));
            strGigaton = String.valueOf(formatter.format(item.getGigaton()));
            strMegaton = String.valueOf(formatter.format(item.getMegaton()));
            strKiloton = String.valueOf(formatter.format(item.getKiloton()));
            strTonexplosives = String.valueOf(formatter.format(item.getTon()));
            strDynecentimeter = String.valueOf(formatter.format(item.getDynecm()));
            strGramforcemeter = String.valueOf(formatter.format(item.getGfm()));
            strGramforcecentimeter = String.valueOf(formatter.format(item.getGfcm()));
            strKilogramforcecentimeter = String.valueOf(formatter.format(item.getKgfcm()));
            strKilogramforcemeter = String.valueOf(formatter.format(item.getKgfm()));
            strKilopondmeter = String.valueOf(formatter.format(item.getKpm()));
            strPoundforcefoot = String.valueOf(formatter.format(item.getPff()));
            strPoundforceinch = String.valueOf(formatter.format(item.getPfi()));
            strOunceforceinch = String.valueOf(formatter.format(item.getOfi()));
            strFootpound = String.valueOf(formatter.format(item.getFp()));
            strInchpound = String.valueOf(formatter.format(item.getIp()));
            strInchounce = String.valueOf(formatter.format(item.getIo()));
            strPoundalfoot = String.valueOf(formatter.format(item.getPdlft()));
            strTherm = String.valueOf(formatter.format(item.getTherm()));
            strThermEC = String.valueOf(formatter.format(item.getThermec()));
            strThermUS = String.valueOf(formatter.format(item.getThermus()));
            strHartreeenergy = String.valueOf(formatter.format(item.getHartree()));
            strRydbergconstant = String.valueOf(formatter.format(item.getRydberg()));


            list.add(new ItemList("J", "Joule", strJoule, "J"));
            list.add(new ItemList("kJ", "Kilo joule", strKilojoule, "kJ"));
            list.add(new ItemList("kW*h", "Kilo-watt hour", strKilowatthour, "kW*h"));
            list.add(new ItemList("W*h", "Watt-hour", strWatthour, "W*h"));
            list.add(new ItemList("cal(nutritional)", "Calorie (nutritional)", strCalorienutritional, "cal(nutritional)"));
            list.add(new ItemList("hp*h", "Horsepower (metric) hour", strHorsepowermetrichour, "hp*h"));
            list.add(new ItemList("btu(IT),Btu", "Btu(IT) ", strBtuIT, "btu(IT),Btu"));
            list.add(new ItemList("btu(th)", "Btu(th) ", strBtuth, "btu(th)"));
            list.add(new ItemList("GJ", "Giga joule ", strGigajoule, "GJ"));
            list.add(new ItemList("MJ", "Mega joule ", strMegajoule, "MJ"));
            list.add(new ItemList("mJ", "Milli joule ", strMillijoule, "mJ"));
            list.add(new ItemList("μj", "Micro joule", strMicrojoule, "μj"));
            list.add(new ItemList("nJ", "Nano joule ", strNanojoule, "nJ"));
            list.add(new ItemList("aJ", "Atto joule ", strAttojoule, "aJ"));
            list.add(new ItemList("MeV", "Mega electron-volt ", strMegaelectronvolt, "MeV"));
            list.add(new ItemList("KeV", "Kilo electron-volt ", strKiloelectronvolt, "KeV"));
            list.add(new ItemList("eV", "Electron-volt ", strElectronvolt, "eV"));
            list.add(new ItemList("erg", "Erg ", strErg, "erg"));
            list.add(new ItemList("GW*h", "Giga watt-hour ", strGigawatthour, "GW*h"));
            list.add(new ItemList("MW*h", "Mega watt-hour", strMegawatthour, "MW*h"));
            list.add(new ItemList("kW*s", "Kilo watt-second ", strKilowattsecond, "kW*s"));
            list.add(new ItemList("W*s", "Watt-second ", strWattsecond, "W*s"));
            list.add(new ItemList("N*m", "Newton meter ", strNewtonmeter, "N*m"));
            list.add(new ItemList("hp*h", "Horse power hour ", strHorsepowerhour, "hp*h"));
            list.add(new ItemList("kcal(IT)", "Kilo calorie(IT) ", strKilocalorieIT, "kcal(IT)"));
            list.add(new ItemList("kcal(th)", "Kilo calorie(th) ", strKilocalorieth, "kcal(th)"));
            list.add(new ItemList("cal(IT),cal", "Calorie(IT)", strCalorieIT, "cal(IT),cal"));
            list.add(new ItemList("cal(th)", "Calorie(th) ", strCalorieth, "cal(th)"));
            list.add(new ItemList("MBtu(IT)", "Mega Btu (IT) ", strMegaBtuIT, "MBtu(IT)"));
            list.add(new ItemList("ton*h", "Ton-hour (refrigeration) ", strTonhourrefrigeration, "ton*h"));
            list.add(new ItemList("kl", "Fuel oil equivalent @kiloliter", strFueloilequivalentkiloliter, "kl"));
            list.add(new ItemList("bbl", "Fuel oil equivalent @barrel (US) ", strFueloilequivalentbarrelUS, "bbl"));
            list.add(new ItemList("Gton", "Giga ton ", strGigaton, "Gton"));
            list.add(new ItemList("Mton", "Mega ton ", strMegaton, "Mton"));
            list.add(new ItemList("kton", "Kilo ton ", strKiloton, "kton"));
            list.add(new ItemList("ton", "Ton (explosives) ", strTonexplosives, "ton"));
            list.add(new ItemList("dyn*cm", "Dyne centimeter ", strDynecentimeter, "dyn*cm"));
            list.add(new ItemList("gf*m", "Gram-force meter ", strGramforcemeter, "gf*m"));
            list.add(new ItemList("gf*cm", "Gram-force centimeter ", strGramforcecentimeter, "gf*cm"));
            list.add(new ItemList("kgf*cm", "Kilogram-force centimeter ", strKilogramforcecentimeter, "kgf*cm"));
            list.add(new ItemList("kgf*m", "Kilogram-force meter ", strKilogramforcemeter, "kgf*m"));
            list.add(new ItemList("kp*m", "Kilo pond meter ", strKilopondmeter, "kp*m"));
            list.add(new ItemList("lbf*ft", "Pound-force foot ", strPoundforcefoot, "lbf*ft"));
            list.add(new ItemList("lbf*in", "Pound-force inch ", strPoundforceinch, "lbf*in"));
            list.add(new ItemList("ozf*in", "Ounce-force inch ", strOunceforceinch, "ozf*in"));
            list.add(new ItemList("ft*lbf", "Foot-pound ", strFootpound, "ft*lbf"));
            list.add(new ItemList("in*lbf", "Inch-pound ", strInchpound, "in*lbf"));
            list.add(new ItemList("in*ozf", "Inch-ounce ", strInchounce, "in*ozf"));
            list.add(new ItemList("pdl*ft", "Poundal foot ", strPoundalfoot, "pdl*ft"));
            list.add(new ItemList("therm", "Therm ", strTherm, "therm"));
            list.add(new ItemList("therm", "Therm(EC) ", strThermEC, "therm"));
            list.add(new ItemList("therm", "Therm(US) ", strThermUS, "therm"));
            list.add(new ItemList("He", "Hartree energy ", strHartreeenergy, "He"));
            list.add(new ItemList("Rc", "Rydberg constant ", strRydbergconstant, "Rc"));


        }
        return list;

    }
   /* @Override
    protected void onRestart() {

        // TODO Auto-generated method stub
        super.onRestart();
        Intent i = new Intent(ConversionTempListActivity.this, ConversionTempListActivity.class);
        i.putExtra("stringSpinnerFrom", stringSpinnerFrom);
        i.putExtra("doubleEdittextvalue", doubleEdittextvalue);
        startActivity(i);
        finish();

    }*/

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {


        rowListItem.clear();
        try {

            double value = Double.parseDouble(edittextConversionListvalue.getText().toString().trim());

            rowListItem1 = getAllunitValue(stringSpinnerFrom, value);


            rcAdapter = new RecyclerViewConversionListAdapter(this, rowListItem1);
            rView.setAdapter(rcAdapter);
        } catch (NumberFormatException e) {
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
