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
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.nineinfosys.basicconverter.Adapter.RecyclerViewConversionListAdapter;
import com.nineinfosys.basicconverter.Engin.VolumeDryConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.ItemList;
import com.nineinfosys.basicconverter.Supporter.Settings;


import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversionVolumeDryListActivity extends AppCompatActivity implements TextWatcher {

   private List<ItemList> list = new ArrayList<ItemList>();
    private  String stringSpinnerFrom;
    private double doubleEdittextvalue;
    private EditText edittextConversionListvalue;
    private TextView textconversionFrom,textViewConversionShortform;

    DecimalFormat formatter = null;
    VolumeDryConverter.ConversionResults item;
    private String strLiter = null;
    private String strBarreldryUS = null;
    private  String strPintdryUS = null;
    private String strQuartdryUS = null;
    private  String strPeckUS = null;
    private  String strPeckUK = null;
    private  String strBushelUS = null;
    private  String strBushelUK = null;
    private  String strCorBiblical = null;
    private  String strHomerBiblical = null;
    private String strEphahBiblical = null;
    private  String strSeahBiblical = null;
    private  String strOmerBiblical = null;
    private String strCabBiblical = null;
    private String strLogBiblical = null;

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
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#27d8d5")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#00a6a4"));
        }

        //format of decimal pint
        formatsetting();

        MobileAds.initialize(ConversionVolumeDryListActivity.this, getString(R.string.ads_app_id));
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
             
            case "Liter - L":
                textconversionFrom.setText("Liter");
                textViewConversionShortform.setText("L");
                break;
            case "Barrel dry(US) - bbl dry":
                textconversionFrom.setText("Barrel dry(US)");
                textViewConversionShortform.setText("bbl dry");
                break;

            case "Pint dry(US) - pt dry":
                textconversionFrom.setText("Pint dry(US)");
                textViewConversionShortform.setText("pt dry");
                break;
            case "Quart dry(US) - qt dry":
                textconversionFrom.setText("Quart dry(US)");
                textViewConversionShortform.setText("qt dry");
                break;
            case "Peck dry(US) - pk":
                textconversionFrom.setText("Peck dry(US)");
                textViewConversionShortform.setText("pk");
                break;
            case "Peck dry(UK) - pk":
                textconversionFrom.setText("Peck dry(UK)");
                textViewConversionShortform.setText("pk");
                break;
            case "Bushel(US) - bu":
                textconversionFrom.setText("Bushel(US)");
                textViewConversionShortform.setText("bu");
                break;
            case "Bushel(UK) - bu":
                textconversionFrom.setText("Bushel(UK)");
                textViewConversionShortform.setText("bu");
                break;

            case "Cor(Biblical) - cor":
                textconversionFrom.setText("Cor(Biblical)");
                textViewConversionShortform.setText("cor");
                break;
            case "Homer(Biblical) - homer":
                textconversionFrom.setText("Homer(Biblical)");
                textViewConversionShortform.setText("homer");
                break;

            case "Ephah(Biblical) - ephah":
                textconversionFrom.setText("Ephah(Biblical)");
                textViewConversionShortform.setText("ephah");
                break;
            case "Seah(Biblical) - seah":
                textconversionFrom.setText("Seah(Biblical)");
                textViewConversionShortform.setText("seah");
                break;
            case "Omer(Biblical) - omer":
                textconversionFrom.setText("Omer(Biblical)");
                textViewConversionShortform.setText("omer");
                break;
            case "Cab(Biblical) - cab":
                textconversionFrom.setText("Cab(Biblical)");
                textViewConversionShortform.setText("cab");
                break;
            case "Log(Biblical) - log":
                textconversionFrom.setText("Log(Biblical)");
                textViewConversionShortform.setText("log");
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
        VolumeDryConverter c = new VolumeDryConverter(strSpinnerFrom, doubleEdittextvalue1);
        ArrayList<VolumeDryConverter.ConversionResults> results = c.calculateVolumeDryConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            item = results.get(i);

            strLiter = String.valueOf(formatter.format(item.getLiter()));
            strBarreldryUS = String.valueOf(formatter.format(item.getBarreldryUS()));
            strPintdryUS = String.valueOf(formatter.format(item.getPintdryUS()));
            strQuartdryUS = String.valueOf(formatter.format(item.getQuartdryUS()));
            strPeckUS= String.valueOf(formatter.format(item.getPeckUS()));
            strPeckUK = String.valueOf(formatter.format(item.getPeckUK()));
            strBushelUS = String.valueOf(formatter.format(item.getBushelUS()));
            strBushelUK = String.valueOf(formatter.format(item.getBushelUK()));
            strCorBiblical = String.valueOf(formatter.format(item.getCorBiblical()));
            strHomerBiblical = String.valueOf(formatter.format(item.getHomerBiblical()));
            strEphahBiblical = String.valueOf(formatter.format(item.getEphahBiblical()));
            strSeahBiblical = String.valueOf(formatter.format(item.getSeahBiblical()));
            strOmerBiblical= String.valueOf(formatter.format(item.getOmerBiblical()));
            strCabBiblical = String.valueOf(formatter.format(item.getCabBiblical()));
            strLogBiblical = String.valueOf(formatter.format(item.getLogBiblical()));

            list.add(new ItemList("L","Liter",strLiter,"L"));
            list.add(new ItemList("bbl dry","Barrel dry(US)",strBarreldryUS,"bbl dry"));
            list.add(new ItemList("pt dry","Pint dry(US)",strPintdryUS,"pt dry"));
            list.add(new ItemList("qt dry","Quart dry(US)",strQuartdryUS,"qt dry"));
            list.add(new ItemList("pk","Peck dry(US)",strPeckUS,"pk"));
            list.add(new ItemList("pk","Peck dry(UK)",strPeckUK,"pk"));
            list.add(new ItemList("bu","Bushel(US)",strBushelUS,"bu"));
            list.add(new ItemList("bu","Bushel(UK)",strBushelUK,"bu"));
            list.add(new ItemList("cor","Cor(Biblical)",strCorBiblical,"cor"));
            list.add(new ItemList("homer","Homer(Biblical)",strHomerBiblical,"homer"));
            list.add(new ItemList("ephah","Ephah(Biblical)",strEphahBiblical,"ephah"));
            list.add(new ItemList("seah","Seah(Biblical)",strSeahBiblical,"seah"));
            list.add(new ItemList("omer","Omer(Biblical)",strOmerBiblical,"omer"));
            list.add(new ItemList("cab","Cab(Biblical)",strCabBiblical,"cab"));
            list.add(new ItemList("log","Log(Biblical)",strLogBiblical,"log"));



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
