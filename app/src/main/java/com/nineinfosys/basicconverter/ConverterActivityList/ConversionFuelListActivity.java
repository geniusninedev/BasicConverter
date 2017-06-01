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
import com.nineinfosys.basicconverter.Engin.Fuel;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.ItemList;
import com.nineinfosys.basicconverter.Supporter.Settings;


import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversionFuelListActivity extends AppCompatActivity implements TextWatcher {

    List<ItemList> list = new ArrayList<ItemList>();
    private  String stringSpinnerFrom;
    private double doubleEdittextvalue;
    private EditText edittextConversionListvalue;
    private TextView textconversionFrom,textViewConversionShortform;
    View ChildView ;
    DecimalFormat formatter = null;
    Fuel.ConversionResults item;

    private static final int REQUEST_CODE = 100;
    private File imageFile;
    private Bitmap bitmap;
    private PrintHelper printhelper;


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

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#e65f21")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        MobileAds.initialize(ConversionFuelListActivity.this, getString(R.string.ads_app_id));
        AdView mAdView = (AdView) findViewById(R.id.adViewUnitConverterList);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#a02a00"));
        }
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
            
            case "Meter/liter - m/L":
                 textconversionFrom.setText("Meter/liter");
                textViewConversionShortform.setText("m/L");
                break;
            case "Exameter/liter - Em/L":
                 textconversionFrom.setText("Exameter/liter");
                textViewConversionShortform.setText("Em/L");
                break;

            case "Petameter/liter - Pm/L":
                 textconversionFrom.setText("Petameter/liter");
                textViewConversionShortform.setText("Pm/L");
                break;
            case "Terameter/liter - Tm/L":
                 textconversionFrom.setText("Terameter/liter");
                textViewConversionShortform.setText("Tm/L");
                break;
            case "Gigameter/liter - Gm/L":
                 textconversionFrom.setText("Gigameter/liter");
                textViewConversionShortform.setText("Gm/L");
                break;
            case "Megameter/liter - Mm/L":
                 textconversionFrom.setText("Megameter/liter");
                textViewConversionShortform.setText("Mm/L");
                break;
            case "Kilometer/liter - km/L":
                 textconversionFrom.setText("Kilometer/liter");
                textViewConversionShortform.setText("km/L");
                break;
            case "Hectometer/liter - hm/L":
                 textconversionFrom.setText("Hectometer/liter");
                textViewConversionShortform.setText("hm/L");
                break;

            case "Dekameter/liter - dam/L":
                 textconversionFrom.setText("Dekameter/liter");
                textViewConversionShortform.setText("dam/L");
                break;
            case "Centimeter/liter - cm/L":
                 textconversionFrom.setText("Centimeter/liter");
                textViewConversionShortform.setText("cm/L");
                break;

            case "Mile(US)/liter - mi/L":
                 textconversionFrom.setText("Mile(US)/liter");
                textViewConversionShortform.setText("mi/L");
                break;
            case "Nautical mile/liter - n.mile/L":
                 textconversionFrom.setText("Nautical mile/liter");
                textViewConversionShortform.setText("n.mile/L");
                break;
            case "Nautical mile/gallon(US)  - n.mile/gallon":
                 textconversionFrom.setText("Nautical mile/gallon(US)");
                textViewConversionShortform.setText("n.mile/gallon");
                break;
            case "Kilometer/gallon - km/gallon":
                 textconversionFrom.setText("Kilometer/gallon");
                textViewConversionShortform.setText("km/gallon");
                break;

            case "Meter/gallon(US) - m/gallon":
                 textconversionFrom.setText("Meter/gallon(US)");
                textViewConversionShortform.setText("m/gallon");
                break;
            case "Meter/gallon(UK) - m/gallon":
                 textconversionFrom.setText("Meter/gallon(UK)");
                textViewConversionShortform.setText("m/gallon");
                break;

            case "Mile/gallon(US) - mi/gallon":
                 textconversionFrom.setText("Mile/gallon(US)");
                textViewConversionShortform.setText("mi/gallon");
                break;
            case "Mile/gallon(UK) - mi/gallon":
                 textconversionFrom.setText("Mile/gallon(UK)");
                textViewConversionShortform.setText("mi/gallon");
                break;
            case "Meter/cubic meter - m/m^3":
                 textconversionFrom.setText("Meter/cubic meter");
                textViewConversionShortform.setText("m/m^3");
                break;
            case "Meter/cubic centimeter - m/cm^3":
                 textconversionFrom.setText("Meter/cubic centimeter");
                textViewConversionShortform.setText("m/cm^3");
                break;
            case "Meter/cubic yard - m/yd^3":
                 textconversionFrom.setText("Meter/cubic yard");
                textViewConversionShortform.setText("m/yd^3");
                break;
            case "Meter/cubic foot - m/ft^3":
                 textconversionFrom.setText("Meter/cubic foot");
                textViewConversionShortform.setText("m/ft^3");
                break;

            case "Meter/cubic inch - m/in^3":
                 textconversionFrom.setText("Meter/cubic inch");
                textViewConversionShortform.setText("m/in^3");
                break;
            case "Meter/quart(US) - m/q":
                 textconversionFrom.setText("Meter/quart(US)");
                textViewConversionShortform.setText("m/q");
                break;
            case "Meter/quart(UK) - m/q":
                 textconversionFrom.setText("Meter/quart(UK)");
                textViewConversionShortform.setText("m/q");
                break;

            case "Meter/pint(US) - m/pt":
                 textconversionFrom.setText("Meter/pint(US)");
                textViewConversionShortform.setText("m/pt");
                break;
            case "Meter/pint(UK) - m/pt":
                 textconversionFrom.setText("Meter/pint(UK)");
                textViewConversionShortform.setText("m/pt");
                break;
            case "Meter/cup(US) - m/cup":
                 textconversionFrom.setText("Meter/cup(US)");
                textViewConversionShortform.setText("m/cup");
                break;
            case "Meter/cup(UK) - m/cup":
                 textconversionFrom.setText("Meter/cup(UK)");
                textViewConversionShortform.setText("m/cup");
                break;

            case "Meter/fluid ounce(US) - m/floz":
                 textconversionFrom.setText("Meter/fluid ounce(US)");
                textViewConversionShortform.setText(" m/floz");
                break;
            case "Meter/fluid ounce(UK) - m/floz":
                 textconversionFrom.setText("Meter/fluid ounce(UK)");
                textViewConversionShortform.setText(" m/floz");
                break;
            case "Liter/meter - L/m":
                 textconversionFrom.setText("Liter/meter");
                textViewConversionShortform.setText("L/m");
                break;
            case "Liter/100 km - L/100 km":
                 textconversionFrom.setText("Liter/100 km");
                textViewConversionShortform.setText("L/100 km");
                break;
            case "Gallon(US)/mile - gallon/mi":
                 textconversionFrom.setText("Gallon(US)/mile");
                textViewConversionShortform.setText("gallon/mi");
                break;
            case "Gallon(US)/100 mile - gallon/100 mi":
                 textconversionFrom.setText("Gallon(US)/100 mile");
                textViewConversionShortform.setText("gallon/100 mi");
                break;
            case "Gallon(UK)/mile - gallon/mi":
                 textconversionFrom.setText("Gallon(UK)/mile");
                textViewConversionShortform.setText("gallon/mi");
                break;
            case "Gallon(UK)/100 mile - gallon/100 mi":
                 textconversionFrom.setText("Gallon(UK)/100 mile");
                textViewConversionShortform.setText("gallon/100 mi");
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
        Fuel c = new Fuel(strSpinnerFrom, doubleEdittextvalue1);
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


            list.add(new ItemList("m/L","Meter/liter",strmeterliter,"m/L"));
            list.add(new ItemList("Em/L","Exameter/liter",strexameterliter,"Em/L"));
            list.add(new ItemList("Pm/L","Petameter/liter",strpetameterliter,"Pm/L"));
            list.add(new ItemList("Tm/L","Terameter/liter",strterameterliter,"Tm/L"));
            list.add(new ItemList("Gm/L","Gigameter/liter",strgigameterliter,"Gm/L"));
            list.add(new ItemList("Mm/L","Megameter/liter",strmegameterliter,"Mm/L"));
            list.add(new ItemList("km/L","Kilometer/liter",strkilometerliter,"km/L"));
            list.add(new ItemList("hm/L","Hectometer/liter",strhectometerliter,"hm/L"));
            list.add(new ItemList("dam/L","Dekameter/liter",strdekameterliter,"dam/L"));
            list.add(new ItemList("cm/L","Centimeter/liter",strcentimeterliter,"cm/L"));
            list.add(new ItemList("mi/L","Mile(US)/liter",strmileusliter,"mi/L"));
            list.add(new ItemList("n.mile/L","Nautical mile/liter",strnauticalmilelite,"n.mile/L"));
            list.add(new ItemList("n.mile/gallon","Nautical mile/gallon(US)",strnauticalmilegallon,"n.mile/gallon"));
            list.add(new ItemList("km/gallon","Kilometer/gallon",strkilometergallon,"km/gallon"));
            list.add(new ItemList("m/gallon","Meter/gallon(US)",strmetergallonus,"m/gallon"));
            list.add(new ItemList("m/gallon","Meter/gallon(UK)",strmetergallonUK," m/gallon"));
            list.add(new ItemList("mi/gallon","Mile/gallon(US)",strmilegallonus,"mi/gallon"));
            list.add(new ItemList("mi/gallon","Mile/gallon(UK)",strmilegallonuk,"mi/gallon"));
            list.add(new ItemList("m/m^3","Meter/cubic meter",strmetercubicmeter,"m/m^3"));
            list.add(new ItemList("m/cm^3","Meter/cubic centimeter",strmetercubiccm,"m/cm^3"));
            list.add(new ItemList("m/yd^3","Meter/cubic yard",strmetercubicyard,"m/yd^3"));
            list.add(new ItemList("m/ft^3","Meter/cubic foot",strmetercubicfoot,"m/ft^3"));
            list.add(new ItemList("m/in^3","Meter/cubic inch",strmetercubicinch,"m/in^3"));
            list.add(new ItemList("m/q","Meter/quart(US)",strmeterquartUS,"m/q"));
            list.add(new ItemList("m/q","Meter/quart(UK)",strmeterquartuk,"m/q"));
            list.add(new ItemList("m/pt","Meter/pint(US)",strmeterpintUS,"m/pt"));
            list.add(new ItemList("m/pt","Meter/pint(UK)",strmeterpintuk,"m/pt"));
            list.add(new ItemList("m/cup","Meter/cup(US)",strmetercupUS,"m/cup"));
            list.add(new ItemList("m/cup","Meter/cup(UK)",strmetercupUk,"m/cup"));
            list.add(new ItemList("m/floz","Meter/fluid ounce(US)",strmeterfluidounceus,"m/floz"));
            list.add(new ItemList("m/floz","Meter/fluid ounce(UK)",strmeterfluidounceuk,"m/floz"));
            list.add(new ItemList("L/m","Liter/meter",strlitermeter,"L/m"));
            list.add(new ItemList("L/100 km","Liter/100 km",strliter100km,"L/100 km"));
            list.add(new ItemList("gallon/mi","Gallon(US)/mile",strgallonUSmile,"gallon/mi"));
            list.add(new ItemList("gallon/100  mi","Gallon(US)/100 mile",strgallonUS100mi,"gallon/100 mi"));
            list.add(new ItemList("gallon/mi","Gallon(UK)/mile",strgallonUKmile,"gallon/mi"));
            list.add(new ItemList("gallon/100 mi","Gallon(UK)/100 mile",strgallonUK100mi,"gallon/100 mi"));

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
