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
import com.nineinfosys.basicconverter.Engin.TimeConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.ItemList;
import com.nineinfosys.basicconverter.Supporter.Settings;


import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversionTimeListActivity extends AppCompatActivity implements TextWatcher {

   private List<ItemList> list = new ArrayList<ItemList>();
    private  String stringSpinnerFrom;
    private double doubleEdittextvalue;
    private EditText edittextConversionListvalue;
    private TextView textconversionFrom,textViewConversionShortform;
    View ChildView ;
    DecimalFormat formatter = null;
    TimeConverter.ConversionResults item;

    private String strsecond=null;
    private String strmilisecond=null;
    private String strminute=null;
    private String strhour=null;
    private String strday=null;
    private String strweek=null;
    private String strmonth=null;
    private String stryear=null;
    private String strdecade=null;
    private String strcentury=null;
    private String strmillennium=null;
    private String strmicrosecond=null;
    private String strnanosecond=null;
    private String strpicosecond=null;
    private String strfemtosecond=null;
    private String strattosecond=null;
    private String strshake=null;
    private String strmonthsynodic=null;
    private String stryearjulian=null;
    private String stryearleap=null;
    private String stryeartropical=null;
    private String stryearsidereal=null;
    private String strdaysidereal=null;
    private String strhoursidereal=null;
    private String strminutesidereal=null;
    private String strsecondsidereal=null;
    private String strfortnight=null;
    private String strseptennial=null;
    private String stroctennial=null;
    private String strnovennial=null;
    private String strquindecennial=null;
    private String strquinquennial=null;
    private String strplanktime=null;

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
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#e58f0c")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#ad6100"));
        }

        //format of decimal pint
        formatsetting();

        MobileAds.initialize(ConversionTimeListActivity.this, getString(R.string.ads_app_id));
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

            case "Second - s":
                textconversionFrom.setText("Second");
                textViewConversionShortform.setText("s");
                break;
            case "Millisecond - ms":
                textconversionFrom.setText("Millisecond");
                textViewConversionShortform.setText("ms");
                break;

            case "Minute - min":
                textconversionFrom.setText("Minute");
                textViewConversionShortform.setText("min");
                break;
            case "Hour - h":
                textconversionFrom.setText("Hour");
                textViewConversionShortform.setText("h");
                break;
            case "Day - d":
                textconversionFrom.setText("Day");
                textViewConversionShortform.setText("d");
                break;
            case "Week - week":
                textconversionFrom.setText("Week");
                textViewConversionShortform.setText("week");
                break;
            case "Month - month":
                textconversionFrom.setText("Month");
                textViewConversionShortform.setText("month");
                break;
            case "Year - y":
                textconversionFrom.setText("Year");
                textViewConversionShortform.setText("y");
                break;

            case "Decade - decade":
                textconversionFrom.setText("Decade");
                textViewConversionShortform.setText("decade");
                break;
            case "Century - century":
                textconversionFrom.setText("Century");
                textViewConversionShortform.setText("century");
                break;

            case "Millenium - millenium":
                textconversionFrom.setText("Millenium");
                textViewConversionShortform.setText("millenium");
                break;
            case "Microsecond - μs":
                textconversionFrom.setText("Microsecond");
                textViewConversionShortform.setText("μs");
                break;

            case "Nanosecond - ns":
                textconversionFrom.setText("Nanosecond");
                textViewConversionShortform.setText("ns");
                break;
            case "Picosecond - ps":
                textconversionFrom.setText("Picosecond");
                textViewConversionShortform.setText("ps");
                break;

            case "Femtosecond - fs":
                textconversionFrom.setText("Femtosecond");
                textViewConversionShortform.setText("fs");
                break;
            case "Attosecond - as":
                textconversionFrom.setText("Attosecond");
                textViewConversionShortform.setText("as");
                break;

            case "Shake - shake":
                textconversionFrom.setText("Shake");
                textViewConversionShortform.setText("shake");
                break;
            case "Month(Synodic) - month":
                textconversionFrom.setText("Month(Synodic)");
                textViewConversionShortform.setText("month");
                break;
            case "Year(Julian) - y":
                textconversionFrom.setText("Year(Julian)");
                textViewConversionShortform.setText("y");
                break;
            case "Year(leap) - y":
                textconversionFrom.setText("Year(leap)");
                textViewConversionShortform.setText("y");
                break;
            case "Year(tropical) - y":
                textconversionFrom.setText("Year(tropical)");
                textViewConversionShortform.setText("y");
                break;
            case "Year(sidereal) - y":
                textconversionFrom.setText("Year(sidereal)");
                textViewConversionShortform.setText("y");
                break;

            case "Day(sidereal) - d":
                textconversionFrom.setText("Day(sidereal)");
                textViewConversionShortform.setText("d");
                break;
            case "Hour(sidereal) - h":
                textconversionFrom.setText("Hour(sidereal)");
                textViewConversionShortform.setText("h");
                break;
            case "Minute(sidereal) - min":
                textconversionFrom.setText("Minute(sidereal)");
                textViewConversionShortform.setText("min");
                break;

            case "Second(sidereal) - s":
                textconversionFrom.setText("Second(sidereal)");
                textViewConversionShortform.setText("s");
                break;
            case "Fortnight - f":
                textconversionFrom.setText("Fortnight");
                textViewConversionShortform.setText("f");
                break;
            case "Septennial - s":
                textconversionFrom.setText("Septennial");
                textViewConversionShortform.setText("s");
                break;
            case "Octennial - o":
                textconversionFrom.setText("Octennial");
                textViewConversionShortform.setText("o");
                break;

            case "Novennial - n":
                textconversionFrom.setText("Novennial");
                textViewConversionShortform.setText("n");
                break;
            case "Quindecennial - q":
                textconversionFrom.setText("Quindecennial");
                textViewConversionShortform.setText("q");
                break;
            case "Quinquennial - q":
                textconversionFrom.setText("Quinquennial");
                textViewConversionShortform.setText("q");
                break;
            case "Plank time - pt":
                textconversionFrom.setText("Plank time");
                textViewConversionShortform.setText("pt");
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
        TimeConverter c = new TimeConverter(strSpinnerFrom, doubleEdittextvalue1);
        ArrayList<TimeConverter.ConversionResults> results = c.calculateTimeConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            item = results.get(i);

            strsecond = String.valueOf(formatter.format(item.getSecond()));
            strmilisecond = String.valueOf(formatter.format(item.getMilisecond()));
            strminute = String.valueOf(formatter.format(item.getMinute()));
            strhour = String.valueOf(formatter.format(item.getHour()));
            strday= String.valueOf(formatter.format(item.getDay()));
            strweek = String.valueOf(formatter.format(item.getWeek()));
            strmonth = String.valueOf(formatter.format(item.getMonth()));
            stryear = String.valueOf(formatter.format(item.getYear()));
            strdecade = String.valueOf(formatter.format(item.getDecade()));
            strcentury = String.valueOf(formatter.format(item.getCentury()));
            strmillennium = String.valueOf(formatter.format(item.getMillennium()));
            strmicrosecond = String.valueOf(formatter.format(item.getMicrosecond()));
            strnanosecond= String.valueOf(formatter.format(item.getNanosecond()));
            strpicosecond = String.valueOf(formatter.format(item.getPicosecond()));
            strfemtosecond = String.valueOf(formatter.format(item.getFemtosecond()));
            strattosecond = String.valueOf(formatter.format(item.getAttosecond()));
            strshake = String.valueOf(formatter.format(item.getShake()));
            strmonthsynodic = String.valueOf(formatter.format(item.getMonthsynodic()));
            stryearjulian= String.valueOf(formatter.format(item.getYearjulian()));
            stryearleap = String.valueOf(formatter.format(item.getYearleap()));
            stryeartropical = String.valueOf(formatter.format(item.getYeartropical()));
            stryearsidereal = String.valueOf(formatter.format(item.getYearsidereal()));
            strdaysidereal = String.valueOf(formatter.format(item.getDaysidereal()));
            strhoursidereal = String.valueOf(formatter.format(item.getHoursidereal()));
            strminutesidereal = String.valueOf(formatter.format(item.getMinutesidereal()));
            strsecondsidereal = String.valueOf(formatter.format(item.getSecondsidereal()));
            strfortnight= String.valueOf(formatter.format(item.getFortnight()));
            strseptennial = String.valueOf(formatter.format(item.getSeptennial()));
            stroctennial = String.valueOf(formatter.format(item.getOctennial()));
            strnovennial = String.valueOf(formatter.format(item.getNovennial()));
            strquindecennial = String.valueOf(formatter.format(item.getQuindecennial()));
            strquinquennial= String.valueOf(formatter.format(item.getQuinquennial()));
            strplanktime = String.valueOf(formatter.format(item.getPlanktime()));

            list.add(new ItemList("s","Second",strsecond,"s"));
            list.add(new ItemList("ms","Millisecond",strmilisecond,"ms"));
            list.add(new ItemList("min","Minute",strminute,"min"));
            list.add(new ItemList("h","Hour",strhour,"h"));
            list.add(new ItemList("d","Day",strday,"d"));
            list.add(new ItemList("week","Week",strweek,"week"));
            list.add(new ItemList("month","Month",strmonth,"month"));
            list.add(new ItemList("y","Year",stryear,"y"));
            list.add(new ItemList("decade","Decade",strdecade,"decade"));
            list.add(new ItemList("century","Century",strcentury,"century"));
            list.add(new ItemList("millenium","Millenium",strmillennium,"millenium"));
            list.add(new ItemList("μs","Microsecond",strmicrosecond,"μs"));
            list.add(new ItemList("ns","Nanosecond",strnanosecond,"ns"));
            list.add(new ItemList("ps","Picosecond",strpicosecond,"ps"));
            list.add(new ItemList("fs","Femtosecond",strfemtosecond,"fs"));
            list.add(new ItemList("as","Attosecond",strattosecond,"as"));
            list.add(new ItemList("shake","Shake",strshake,"shake"));
            list.add(new ItemList("month","Month(Synodic)",strmonthsynodic,"month"));
            list.add(new ItemList("y","Year(Julian)",stryearjulian,"y"));
            list.add(new ItemList("y","Year(leap)",stryearleap,"y"));
            list.add(new ItemList("y","Year(tropical)",stryeartropical,"y"));
            list.add(new ItemList("y","Year(sidereal)",stryearsidereal,"y"));
            list.add(new ItemList("d","Day(sidereal)",strdaysidereal,"d"));
            list.add(new ItemList("h","Hour(sidereal)",strhoursidereal,"h"));
            list.add(new ItemList("min","Minute(sidereal)",strminutesidereal,"min"));
            list.add(new ItemList("s","Second(sidereal)",strsecondsidereal,"s"));
            list.add(new ItemList("f","Fortnight",strfortnight,"f"));
            list.add(new ItemList("s","Septennial",strseptennial,"s"));
            list.add(new ItemList("o","Octennial",stroctennial,"o"));
            list.add(new ItemList("n","Novennial",strnovennial,"n"));
            list.add(new ItemList("q","Quindecennial",strquindecennial,"q"));
            list.add(new ItemList("q","Quinquennial",strquinquennial,"q"));
            list.add(new ItemList("pt","Plank time",strplanktime,"pt"));



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
