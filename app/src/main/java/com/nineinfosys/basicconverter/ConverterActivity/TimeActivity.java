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
import com.nineinfosys.basicconverter.ConverterActivityList.ConversionTimeListActivity;
import com.nineinfosys.basicconverter.Engin.TimeConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class TimeActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher {


    //declaration of designing tools
    private Spinner spinnerConvertFrom, spinnerConvertTo;
    private EditText editTextValue, editTextValueTo;

    private FloatingActionButton buttonList, buttonShare, buttonMail, buttonCopy;
    private SwitchCompat switchChangeType;
    private List<String> listTimeFirstfrom, listTimeFirstTo, listtimefrom, listtimeTo;
    private String stringSpinnerFrom, stringSpinnerTo;
    private TextView textViewBasicUnit, textViewAllUnit,textViewConvert;
    double doubleEdittextvalue = 1.0;
    private int basicunit = 10;
    private int allunit = 23;
    private DecimalFormat formatter = null;
    public static final int REQUEST_CODE = 100;

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




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);


        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#e58f0c")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Time");

        formatsetting();

        MobileAds.initialize(TimeActivity.this, getString(R.string.ads_app_id));
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
        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.coloryellowish)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.coloryellowish)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.coloryellowish)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.coloryellowish)));

        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()),ColorStateList.valueOf(ContextCompat.getColor(this, R.color.coloryellowish)));
        // DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getTrackDrawable()), ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRed)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textViewConvert.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.coloryellowish)));
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#ad6100"));
        }

        textViewBasicUnit.setText(String.valueOf("Basic Units(" + basicunit + ")"));
        textViewAllUnit.setText(String.valueOf("All Units(" + allunit + ")"));


        //adding value to spinner
        listTimeFirstfrom = new ArrayList<String>();
        listTimeFirstTo = new ArrayList<String>();


        //for first time running spinner
        listTimeFirstfrom.add("Second - s");
        listTimeFirstfrom.add("Minute - min");
        listTimeFirstfrom.add("Hour - h");
        listTimeFirstfrom.add("Day - d");
        listTimeFirstfrom.add("Week - week");
        listTimeFirstfrom.add("Month - month");
        listTimeFirstfrom.add("Year - y");
        listTimeFirstfrom.add("Decade - decade");
        listTimeFirstfrom.add("Century - century");
        listTimeFirstfrom.add("Millenium - millenium");




        listTimeFirstTo.add("Second - s");
        listTimeFirstTo.add("Minute - min");
        listTimeFirstTo.add("Hour - h");
        listTimeFirstTo.add("Day - d");
        listTimeFirstTo.add("Week - week");
        listTimeFirstTo.add("Month - month");
        listTimeFirstTo.add("Year - y");
        listTimeFirstTo.add("Decade - decade");
        listTimeFirstTo.add("Century - century");
        listTimeFirstTo.add("Millenium - millenium");


        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(TimeActivity.this, android.R.layout.simple_spinner_item, listTimeFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(TimeActivity.this, android.R.layout.simple_spinner_item, listTimeFirstTo);


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

                listtimefrom = new ArrayList<String>();
                listtimeTo = new ArrayList<String>();
                String stringSwitchSate = String.valueOf(isChecked);
                String strBasic = "Basic";
                String strAdvance = "All";
                switch (stringSwitchSate) {

                    case "false":
                        Snackbar.make(buttonView, "You switched to " + strBasic + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listtimefrom.clear();
                        listtimeTo.clear();
                        listtimefrom.add("Second - s");
                        listtimefrom.add("Minute - min");
                        listtimefrom.add("Hour - h");
                        listtimefrom.add("Day - d");
                        listtimefrom.add("Week - week");
                        listtimefrom.add("Month - month");
                        listtimefrom.add("Year - y");
                        listtimefrom.add("Decade - decade");
                        listtimefrom.add("Century - century");
                        listtimefrom.add("Millenium - millenium");

                    //second spinner
                        listtimeTo.add("Second - s");
                        listtimeTo.add("Minute - min");
                        listtimeTo.add("Hour - h");
                        listtimeTo.add("Day - d");
                        listtimeTo.add("Week - week");
                        listtimeTo.add("Month - month");
                        listtimeTo.add("Year - y");
                        listtimeTo.add("Decade - decade");
                        listtimeTo.add("Century - century");
                        listtimeTo.add("Millenium - millenium");


                        break;
                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strAdvance+ " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listtimefrom.clear();
                        listtimeTo.clear();
                        listtimefrom.add("Second - s");
                        listtimefrom.add("Millisecond - ms");
                        listtimefrom.add("Minute - min");
                        listtimefrom.add("Hour - h");
                        listtimefrom.add("Day - d");
                        listtimefrom.add("Week - week");
                        listtimefrom.add("Month - month");
                        listtimefrom.add("Year - y");
                        listtimefrom.add("Decade - decade");
                        listtimefrom.add("Century - century");
                        listtimefrom.add("Millenium - millenium");
                        listtimefrom.add("Microsecond - μs");
                        listtimefrom.add("Nanosecond - ns");
                        listtimefrom.add("Picosecond - ps");
                        listtimefrom.add("Femtosecond - fs");
                        listtimefrom.add("Attosecond - as");
                        listtimefrom.add("Shake - shake");
                        listtimefrom.add("Month(Synodic) - month");
                        listtimefrom.add("Year(Julian) - y");
                        listtimefrom.add("Year(leap) - y");
                        listtimefrom.add("Year(tropical) - y");
                        listtimefrom.add("Year(sidereal) - y");
                        listtimefrom.add("Day(sidereal) - d");
                        listtimefrom.add("Hour(sidereal) - h");
                        listtimefrom.add("Minute(sidereal) - min");
                        listtimefrom.add("Second(sidereal) - s");
                        listtimefrom.add("Fortnight - f");
                        listtimefrom.add("Septennial - s");
                        listtimefrom.add("Octennial - o");
                        listtimefrom.add("Novennial - n");
                        listtimefrom.add("Quindecennial - q");
                        listtimefrom.add("Quinquennial - q");
                        listtimefrom.add("Plank time - pt");


                        //2 spinner

                        listtimeTo.add("Second - s");
                        listtimeTo.add("Millisecond - ms");
                        listtimeTo.add("Minute - min");
                        listtimeTo.add("Hour - h");
                        listtimeTo.add("Day - d");
                        listtimeTo.add("Week - week");
                        listtimeTo.add("Month - month");
                        listtimeTo.add("Year - y");
                        listtimeTo.add("Decade - decade");
                        listtimeTo.add("Century - century");
                        listtimeTo.add("Millenium - millenium");
                        listtimeTo.add("Microsecond - μs");
                        listtimeTo.add("Nanosecond - ns");
                        listtimeTo.add("Picosecond - ps");
                        listtimeTo.add("Femtosecond - fs");
                        listtimeTo.add("Attosecond - as");
                        listtimeTo.add("Shake - shake");
                        listtimeTo.add("Month(Synodic) - month");
                        listtimeTo.add("Year(Julian) - y");
                        listtimeTo.add("Year(leap) - y");
                        listtimeTo.add("Year(tropical) - y");
                        listtimeTo.add("Year(sidereal) - y");
                        listtimeTo.add("Day(sidereal) - d");
                        listtimeTo.add("Hour(sidereal) - h");
                        listtimeTo.add("Minute(sidereal) - min");
                        listtimeTo.add("Second(sidereal) - s");
                        listtimeTo.add("Fortnight - f");
                        listtimeTo.add("Septennial - s");
                        listtimeTo.add("Octennial - o");
                        listtimeTo.add("Novennial - n");
                        listtimeTo.add("Quindecennial - q");
                        listtimeTo.add("Quinquennial - q");
                        listtimeTo.add("Plank time - pt");

                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(TimeActivity.this, android.R.layout.simple_spinner_item, listtimefrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(TimeActivity.this, android.R.layout.simple_spinner_item, listtimeTo);


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
                Intent i = new Intent(this, ConversionTimeListActivity.class);
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

            TimeConverter c = new TimeConverter(strSpinnerFromvalue1, doubleEdittextvalue1);
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


                switch (strSpinnerFromvalue1) {
                
                    case "Second - s":
                         conversion(strSpinnerTovalue2);
                        break;
                    case "Millisecond - ms":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Minute - min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Hour - h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Day - d":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Week - week":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Month - month":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Year - y":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Decade - decade":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Century - century":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Millenium - millenium":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Microsecond - μs":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Nanosecond - ns":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Picosecond - ps":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Femtosecond - fs":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Attosecond - as":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Shake - shake":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Month(Synodic) - month":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Year(Julian) - y":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Year(leap) - y":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Year(tropical) - y":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Year(sidereal) - y":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Day(sidereal) - d":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Hour(sidereal) - h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Minute(sidereal) - min":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Second(sidereal) - s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Fortnight - f":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Septennial - s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Octennial - o":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Novennial - n":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Quindecennial - q":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Quinquennial - q":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Plank time - pt":
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
            case "Second - s":
                editTextValueTo.setText(strsecond);
                break;
            case "Millisecond - ms":
                editTextValueTo.setText(strmilisecond);
                break;

            case "Minute - min":
                editTextValueTo.setText(strminute);
                break;
            case "Hour - h":
                editTextValueTo.setText(strhour);
                break;
            case "Day - d":
                editTextValueTo.setText(strday);
                break;
            case "Week - week":
                editTextValueTo.setText(strweek);
                break;
            case "Month - month":
                editTextValueTo.setText(strmonth);
                break;
            case "Year - y":
                editTextValueTo.setText(stryear);
                break;

            case "Decade - decade":
                editTextValueTo.setText(strdecade);
                break;
            case "Century - century":
                editTextValueTo.setText(strcentury);
                break;

            case "Millenium - millenium":
                editTextValueTo.setText(strmillennium);
                break;
            case "Microsecond - μs":
                editTextValueTo.setText(strmicrosecond);
                break;
            case "Nanosecond - ns":
                editTextValueTo.setText(strnanosecond);
                break;
            case "Picosecond - ps":
                editTextValueTo.setText(strpicosecond);
                break;

            case "Femtosecond - fs":
                editTextValueTo.setText(strfemtosecond);
                break;
            case "Attosecond - as":
                editTextValueTo.setText(strattosecond);
                break;

            case "Shake - shake":
                editTextValueTo.setText(strshake);
                break;
            case "Month(Synodic) - month":
                editTextValueTo.setText(strmonthsynodic);
                break;
            case "Year(Julian) - y":
                editTextValueTo.setText(stryearjulian);
                break;
            case "Year(leap) - y":
                editTextValueTo.setText(stryearleap);
                break;
            case "Year(tropical) - y":
                editTextValueTo.setText(stryeartropical);
                break;
            case "Year(sidereal) - y":
                editTextValueTo.setText(stryearsidereal);
                break;

            case "Day(sidereal) - d":
                editTextValueTo.setText(strdaysidereal);
                break;
            case "Hour(sidereal) - h":
                editTextValueTo.setText(strhoursidereal);
                break;
            case "Minute(sidereal) - min":
                editTextValueTo.setText(strminutesidereal);
                break;

            case "Second(sidereal) - s":
                editTextValueTo.setText(strsecondsidereal);
                break;
            case "Fortnight - f":
                editTextValueTo.setText(strfortnight);
                break;
            case "Septennial - s":
                editTextValueTo.setText(strseptennial);
                break;
            case "Octennial - o":
                editTextValueTo.setText(stroctennial);
                break;

            case "Novennial - n":
                editTextValueTo.setText(strnovennial);
                break;
            case "Quindecennial - q":
                editTextValueTo.setText(strquindecennial);
                break;
            case "Quinquennial - q":
                editTextValueTo.setText(strquinquennial);
                break;
            case "Plank time - pt":
                editTextValueTo.setText(strplanktime);
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