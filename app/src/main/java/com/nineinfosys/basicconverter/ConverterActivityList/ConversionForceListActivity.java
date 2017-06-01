package com.nineinfosys.basicconverter.ConverterActivityList;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
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
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.nineinfosys.basicconverter.Adapter.RecyclerViewConversionListAdapter;
import com.nineinfosys.basicconverter.Engin.ForceConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.ItemList;
import com.nineinfosys.basicconverter.Supporter.Settings;


import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversionForceListActivity extends AppCompatActivity implements TextWatcher {

    List<ItemList> list = new ArrayList<ItemList>();
    private  String stringSpinnerFrom;
    private double doubleEdittextvalue;
    private EditText edittextConversionListvalue;
    private TextView textconversionFrom,textViewConversionShortform;
    View ChildView ;
    DecimalFormat formatter = null;
    ForceConverter.ConversionResults item;
    private static final int REQUEST_CODE = 100;
    private File imageFile;
    private Bitmap bitmap;
    private PrintHelper printhelper;

    private String strnewton=null;
    private String strkilonewton=null;
    private String strgramforce=null;
    private String strkilogramforce=null;
    private String strtonforce=null;
    private String strexanewton=null;
    private String strpetanewton=null;
    private String strteranewton=null;
    private String strgiganewton=null;
    private String strmeganewton=null;
    private String strhectonewton=null;
    private String strdekanewton=null;
    private String strdecinewton=null;
    private String strcentinewton=null;
    private String strmilinewton=null;
    private String strmicronewton=null;
    private String strnanonewton=null;
    private String strpiconewton=null;
    private String strfemtonewton=null;
    private String strattonewton=null;
    private String strdyne=null;
    private String strjoulepermeter=null;
    private String strjoulepercentimeter=null;
    private String strtonforceshort=null;
    private String strtonforcelong=null;
    private String strkipforce=null;
    private String strkilopoundforce=null;
    private String strpoundforce=null;
    private String strounceforce=null;
    private String strpoundal=null;
    private String strpoundfootpersquaresecond=null;
    private String strpond=null;
    private String strkilopond=null;



    private RecyclerView rView;
    RecyclerViewConversionListAdapter rcAdapter;
    List<ItemList> rowListItem,rowListItem1;
    // Storage Permissions variables
    private static final int REQUEST_EXTERNAL_STORAGE = 1;
    private static String[] PERMISSIONS_STORAGE = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };
    View contentroot;
    ScrollView sv = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_list);

        sv = (ScrollView) findViewById(R.id.scrollView);
        contentroot = findViewById(R.id.relativelayout);
        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1976d2")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#004ba0"));
        }

        //format of decimal pint
        formatsetting();

        MobileAds.initialize(ConversionForceListActivity.this, getString(R.string.ads_app_id));
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

            case "Newton - N":
                textconversionFrom.setText("Newton");
                textViewConversionShortform.setText("N");
                
                break;
            case "Kilonewton - kN":
                textconversionFrom.setText("Kilonewton");
                textViewConversionShortform.setText("kN");
                break;

            case "Gram-force - gf":
                textconversionFrom.setText("Gram-force");
                textViewConversionShortform.setText("gf");
                break;
            case "Kilogram-force - kgf":
                textconversionFrom.setText("Kilogram-force");
                textViewConversionShortform.setText("kgf");
                break;
            case "Ton-force(metric) - tf":
                textconversionFrom.setText("Ton-force(metric)");
                textViewConversionShortform.setText("tf");
                break;
            case "Exanewton - EN":
                textconversionFrom.setText("Exanewton");
                textViewConversionShortform.setText("EN");
                break;
            case "Petanewton - PT":
                textconversionFrom.setText("Petanewton");
                textViewConversionShortform.setText("PT");
                break;
            case "Teranewton - TN":
                textconversionFrom.setText("Teranewton");
                textViewConversionShortform.setText("TN");
                break;

            case "Giganewton - GN":
                textconversionFrom.setText("Giganewton");
                textViewConversionShortform.setText("GN");
                break;
            case "Meganewton - MN":
                textconversionFrom.setText("Meganewton");
                textViewConversionShortform.setText("MN");
                break;

            case "Hectonewton - hN":
                textconversionFrom.setText("Hectonewton");
                textViewConversionShortform.setText("hN");
                break;
            case "Dekanewton - daN":
                textconversionFrom.setText("Dekanewton");
                textViewConversionShortform.setText("daN");
                break;
            case "Decinewton - dN":
                textconversionFrom.setText("Decinewton");
                textViewConversionShortform.setText("dN");
                break;
            case "Centinewton - cN":
                textconversionFrom.setText("Centinewton");
                textViewConversionShortform.setText("cN");
                break;

            case "Milinewton - mN":
                textconversionFrom.setText("Milinewton");
                textViewConversionShortform.setText("mN");
                break;
            case "Micronewton - μN":
                textconversionFrom.setText("Micronewton");
                textViewConversionShortform.setText("μN");
                break;

            case "Nanonewton - nN":
                textconversionFrom.setText("Nanonewton");
                textViewConversionShortform.setText("nN");
                break;
            case "Piconewton - pN":
                textconversionFrom.setText("Piconewton");
                textViewConversionShortform.setText("pN");
                break;
            case "Femtonewton - fN":
                textconversionFrom.setText("Femtonewton");
                textViewConversionShortform.setText("fN");
                break;
            case "Attonewton - aN":
                textconversionFrom.setText("Attonewton");
                textViewConversionShortform.setText("aN");
                break;
            case "Dyne - dyn":
                textconversionFrom.setText("Dyne");
                textViewConversionShortform.setText("dyn");
                break;
            case "Joule/meter - J/m":
                textconversionFrom.setText("Joule/meter");
                textViewConversionShortform.setText("J/m");
                break;

            case "Joule/centimeter - J/cm":
                textconversionFrom.setText("Joule/centimeter");
                textViewConversionShortform.setText("J/cm");
                break;
            case "Ounce-force - ozf":
                textconversionFrom.setText("Ounce-force");
                textViewConversionShortform.setText("ozf");
                break;

            case "Ton-force(long) - tonf":
                textconversionFrom.setText("Ton-force(long)");
                textViewConversionShortform.setText("tonf");
                break;
            case "Kip-force - kipf":
                textconversionFrom.setText("Kip-force");
                textViewConversionShortform.setText("kipf");
                break;
            case "Kilopound-force- kipf":
                textconversionFrom.setText("Kilopound-force");
                textViewConversionShortform.setText("kipf");
                break;
            case "Pound-force - lbf":
                textconversionFrom.setText("Pound-force");
                textViewConversionShortform.setText("lbf");
                break;
            case "Ton-force(short) - tonf":
                textconversionFrom.setText("Ton-force(short)");
                textViewConversionShortform.setText("tonf");
                break;

            case "Poundal - pdl":
                textconversionFrom.setText("Poundal");
                textViewConversionShortform.setText("pdl");
                break;
            case "Pound foot/square second - lb*ft/sec²":
                textconversionFrom.setText("Pound foot/square second");
                textViewConversionShortform.setText("lb*ft/sec²");
                break;
            case "Pond - p":
                textconversionFrom.setText("Pond");
                textViewConversionShortform.setText("p");
                break;
            case "Kilopond - kp":
                textconversionFrom.setText("Kilopond");
                textViewConversionShortform.setText("kp");
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
        ForceConverter c = new ForceConverter(strSpinnerFrom, doubleEdittextvalue1);
        ArrayList<ForceConverter.ConversionResults> results = c.calculateForceConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            item = results.get(i);

            strnewton = String.valueOf(formatter.format(item.getNewton()));
            strkilonewton = String.valueOf(formatter.format(item.getKilonewton()));
            strgramforce = String.valueOf(formatter.format(item.getGramforce()));
            strkilogramforce = String.valueOf(formatter.format(item.getKilogramforce()));
            strtonforce= String.valueOf(formatter.format(item.getTonforce()));
            strexanewton = String.valueOf(formatter.format(item.getExanewton()));
            strpetanewton = String.valueOf(formatter.format(item.getPetanewton()));
            strteranewton = String.valueOf(formatter.format(item.getTeranewton()));
            strgiganewton = String.valueOf(formatter.format(item.getGiganewton()));
            strmeganewton = String.valueOf(formatter.format(item.getMeganewton()));
            strhectonewton = String.valueOf(formatter.format(item.getHectonewton()));
            strdekanewton = String.valueOf(formatter.format(item.getDekanewton()));
            strdecinewton= String.valueOf(formatter.format(item.getDecinewton()));
            strcentinewton = String.valueOf(formatter.format(item.getCentinewton()));
            strmilinewton = String.valueOf(formatter.format(item.getMilinewton()));
            strmicronewton = String.valueOf(formatter.format(item.getMicronewton()));
            strnanonewton = String.valueOf(formatter.format(item.getNanonewton()));
            strpiconewton = String.valueOf(formatter.format(item.getPiconewton()));
            strfemtonewton= String.valueOf(formatter.format(item.getFemtonewton()));
            strattonewton = String.valueOf(formatter.format(item.getAttonewton()));
            strdyne = String.valueOf(formatter.format(item.getDyne()));
            strjoulepermeter = String.valueOf(formatter.format(item.getJoulepermeter()));
            strjoulepercentimeter = String.valueOf(formatter.format(item.getJoulepercentimeter()));
            strtonforceshort = String.valueOf(formatter.format(item.getTonforceshort()));
            strtonforcelong = String.valueOf(formatter.format(item.getTonforcelong()));
            strkipforce = String.valueOf(formatter.format(item.getKipforce()));
            strkilopoundforce= String.valueOf(formatter.format(item.getKilopoundforce()));
            strpoundforce = String.valueOf(formatter.format(item.getPoundforce()));
            strounceforce = String.valueOf(formatter.format(item.getOunceforce()));
            strpoundal = String.valueOf(formatter.format(item.getPoundal()));
            strpoundfootpersquaresecond = String.valueOf(formatter.format(item.getPoundfootpersquaresecond()));
            strpond= String.valueOf(formatter.format(item.getPond()));
            strkilopond = String.valueOf(formatter.format(item.getKilopond()));

            list.add(new ItemList("N","Newton",strnewton,"N"));
            list.add(new ItemList("kN","Kilonewton",strkilonewton,"kN"));
            list.add(new ItemList("gf","Gram-force",strgramforce,"gf"));
            list.add(new ItemList("kgf","Kilogram-force",strkilogramforce,"kgf"));
            list.add(new ItemList("tf","Ton-force(metric)",strtonforce,"tf"));
            list.add(new ItemList("EN","Exanewton",strexanewton,"EN"));
            list.add(new ItemList("PT","Petanewton",strpetanewton,"PT"));
            list.add(new ItemList("TN","Teranewton",strteranewton,"TN"));
            list.add(new ItemList("GN","Giganewton",strgiganewton,"GN"));
            list.add(new ItemList("MN","Meganewton",strmeganewton,"MN"));
            list.add(new ItemList("hN","Hectonewton",strhectonewton,"hN"));
            list.add(new ItemList("daN","Dekanewton",strdekanewton,"daN"));
            list.add(new ItemList("dN","Decinewton",strdecinewton,"dN"));
            list.add(new ItemList("cN","Centinewton",strcentinewton,"cN"));
            list.add(new ItemList("mN","Milinewton",strmilinewton,"mN"));
            list.add(new ItemList("μN","Micronewton",strmicronewton,"μN"));
            list.add(new ItemList("nN","Nanonewton",strnanonewton,"nN"));
            list.add(new ItemList("pN","Piconewton",strpiconewton,"pN"));
            list.add(new ItemList("fN","Femtonewton",strfemtonewton,"fN"));
            list.add(new ItemList("aN","Attonewton",strattonewton,"aN"));
            list.add(new ItemList("dyn","Dyne",strdyne,"dyn"));
            list.add(new ItemList("J/m","Joule/meter",strjoulepermeter,"J/m"));
            list.add(new ItemList("J/cm","Joule/centimeter",strjoulepercentimeter,"J/cm"));
            list.add(new ItemList("tonf","Ton-force(short)",strtonforceshort,"tonf"));
            list.add(new ItemList("kipf","Kip-force",strtonforcelong,"kipf"));
            list.add(new ItemList("kipf","Kilopound-force",strkipforce,"kipf"));
            list.add(new ItemList("lbf","Pound-force",strkilopoundforce,"lbf"));
            list.add(new ItemList("ozf","Ounce-force",strpoundforce,"ozf"));
            list.add(new ItemList("pdl","Poundal",strounceforce,"pdl"));
            list.add(new ItemList("lb*ft/sec²","Pound foot/square second",strpoundal,"lb*ft/sec²"));
            list.add(new ItemList("rad","Radian",strpoundfootpersquaresecond,"rad"));
            list.add(new ItemList("p","Pond",strpond,"p"));
            list.add(new ItemList("kp","Kilopond",strkilopond,"kp"));



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
    //persmission method.
    public static void verifyStoragePermissions(Activity activity) {
        // Check if we have read or write permission
        int writePermission = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        int readPermission = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_EXTERNAL_STORAGE);

        if (writePermission != PackageManager.PERMISSION_GRANTED || readPermission != PackageManager.PERMISSION_GRANTED) {
            // We don't have permission so prompt the user
            ActivityCompat.requestPermissions(
                    activity,
                    PERMISSIONS_STORAGE,
                    REQUEST_EXTERNAL_STORAGE
            );
        }
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
