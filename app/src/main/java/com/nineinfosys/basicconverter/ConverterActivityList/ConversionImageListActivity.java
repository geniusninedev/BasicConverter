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
import com.nineinfosys.basicconverter.Engin.Image;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.ItemList;
import com.nineinfosys.basicconverter.Supporter.Settings;


import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversionImageListActivity extends AppCompatActivity implements TextWatcher {

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

    private Image.ConversionResults item;
    private String strtwip=null,strmeter=null,strcentimeter=null,strmillimeter=null,strcharacterx=null,strcharactery=null,
            strpixelx=null,strpixely=null,strinch=null,strpica=null,strpoint=null,stren=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_list);

        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1e88e5")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#005cb2"));
        }

        //format of decimal pint
        formatsetting();

        MobileAds.initialize(ConversionImageListActivity.this, getString(R.string.ads_app_id));
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

            case "Twip - twip":
                textconversionFrom.setText("Twip");
                textViewConversionShortform.setText("twip");
                break;
            case "Meter - m":
                textconversionFrom.setText("Meter");
                textViewConversionShortform.setText("m");
                break;
            case "Centimeter - cm":
                textconversionFrom.setText("Centimeer");
                textViewConversionShortform.setText("cm");
                break;
            case "Millimeter - mm":
                textconversionFrom.setText("Millimeter");
                textViewConversionShortform.setText("mm");
                break;
            case "Inch - in":
                textconversionFrom.setText("Inch");
                textViewConversionShortform.setText("in");
                break;
            case "Pixel(X) - pixel(x)":
                textconversionFrom.setText("Pixel(X)");
                textViewConversionShortform.setText("pixel(x)");
                break;
            case "Pixel(Y) - pixel(y)":
                textconversionFrom.setText("Pixel(Y)");
                textViewConversionShortform.setText("pixel(y)");
                break;

            case "Character(X) - character(x)":
                textconversionFrom.setText("Character(X)");
                textViewConversionShortform.setText("character(x)");
                break;
            case "Character(Y) - character(y)":
                textconversionFrom.setText("Character(Y)");
                textViewConversionShortform.setText("character(y)");
                break;

            case "Pica - P":
                textconversionFrom.setText("Pica");
                textViewConversionShortform.setText("P");
                break;
            case "Point - pt":
                textconversionFrom.setText("Point");
                textViewConversionShortform.setText("pt");
                break;
            case "En - en":
                textconversionFrom.setText("En");
                textViewConversionShortform.setText("en");
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
        Image c = new Image(strSpinnerFrom, doubleEdittextvalue1);
        ArrayList<Image.ConversionResults> results = c.calculateimageConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            item = results.get(i);

            strtwip= String.valueOf(formatter.format(item.getTwip()));
            strmeter= String.valueOf(formatter.format(item.getMeter()));
            strcentimeter= String.valueOf(formatter.format(item.getCentimeter()));
            strmillimeter= String.valueOf(formatter.format(item.getMillimeter()));
            strcharacterx= String.valueOf(formatter.format(item.getCharacterx()));
            strcharactery= String.valueOf(formatter.format(item.getCharactery()));
            strpixelx= String.valueOf(formatter.format(item.getPixelx()));
            strpixely= String.valueOf(formatter.format(item.getPixely()));
            strinch= String.valueOf(formatter.format(item.getInch()));
            strpica= String.valueOf(formatter.format(item.getPica()));
            strpoint= String.valueOf(formatter.format(item.getPoint()));
            stren= String.valueOf(formatter.format(item.getEn()));


            list.add(new ItemList("twip","Twip",strtwip,"twip"));
            list.add(new ItemList("m","Meter",strmeter,"m"));
            list.add(new ItemList("cm","Centimeter",strcentimeter,"cm"));
            list.add(new ItemList("mm","Millimeter",strmillimeter,"mm"));
            list.add(new ItemList("in","Inch",strinch,"in"));
            list.add(new ItemList("pixel(x)","Pixel(X)",strpixelx,"pixel(x)"));
            list.add(new ItemList("pixel(y)","Pixel(Y)",strpixely,"pixel(y)"));
            list.add(new ItemList("character(x)","Character(X)",strcharacterx,"character(x)"));
            list.add(new ItemList("character(y)","Character(Y)",strcharactery,"character(y)"));
            list.add(new ItemList("p","Pica",strpica,"p"));
            list.add(new ItemList("pt","Point",strpoint,"pt"));
            list.add(new ItemList("en","En",stren,"en"));




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
