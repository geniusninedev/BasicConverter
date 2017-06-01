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
import com.nineinfosys.basicconverter.Engin.TypographyConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.ItemList;
import com.nineinfosys.basicconverter.Supporter.Settings;


import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversionTypographyListActivity extends AppCompatActivity implements TextWatcher {

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

    private String  strTwip = null;
    private String  strMeter  = null;
    private String   strCentimeter  = null;
    private String  strMillimeter = null;
    private String     strCharacterX = null;
    private String    strCharacterY = null;
    private String  strPixelX = null;
    private String  strPixelY = null;
    private String strInch = null;
    private String  strPicacomputer = null;
    private String  strPicaprinter = null;
    private String  strPostScriptpoint = null;
    private String strPointcomputer = null;
    private String  strPointprinter = null;
    private String strEn = null;




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

        MobileAds.initialize(ConversionTypographyListActivity.this, getString(R.string.ads_app_id));
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

            case "Twip - twip":
                textconversionFrom.setText("Twip");
                textViewConversionShortform.setText("twip");
                break;
            case "Meter - m":
                textconversionFrom.setText("Meter");
                textViewConversionShortform.setText("m");
                break;
            case  "Centimeter - cm":
                textconversionFrom.setText("Centimeter");
                textViewConversionShortform.setText("cm");
                break;
            case "Millimeter - mm":
                textconversionFrom.setText("Millimeter");
                textViewConversionShortform.setText("mm");
                break;
            case "Character(X) - character(x)":
                textconversionFrom.setText("Character");
                textViewConversionShortform.setText("X");
                break;
            case "Character(Y) - character(y)":
                textconversionFrom.setText("Character");
                textViewConversionShortform.setText("Y");
                break;
            case "Pixel(X) - pixel(x)":
                textconversionFrom.setText("Pixel");
                textViewConversionShortform.setText("X");
                break;
            case "Pixel(Y) - pixel(y)":
                textconversionFrom.setText("Pixel");
                textViewConversionShortform.setText("Y");
                break;
            case "Inch - in":
                textconversionFrom.setText("Inch");
                textViewConversionShortform.setText("in");
                break;
            case "Pica(Computer) - pica":
                textconversionFrom.setText("Pica");
                textViewConversionShortform.setText("computer");
                break;
            case "Pica(Printer) - pica":
                textconversionFrom.setText("Pica");
                textViewConversionShortform.setText("printer's");
                break;
            case "PostScript point - psp":
                textconversionFrom.setText("PostScript point");
                textViewConversionShortform.setText("post");
                break;
            case "Point(Computer) - pt":
                textconversionFrom.setText("Point");
                textViewConversionShortform.setText("computer");
                break;
            case "Point(Printer) - pt":
                textconversionFrom.setText("Point");
                textViewConversionShortform.setText("printer's");
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
        TypographyConverter c = new TypographyConverter(strSpinnerFrom,(int)doubleEdittextvalue1);
        ArrayList<TypographyConverter.ConversionResults> results = c.calculateForceConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            TypographyConverter.ConversionResults item = results.get(i);


              strTwip = String.valueOf(formatter.format(item.getTwip()));
              strMeter = String.valueOf(formatter.format(item.getMeter()));
               strCentimeter = String.valueOf(formatter.format(item.getCentimeter()));
              strMillimeter = String.valueOf(formatter.format(item.getMillimeter()));

             strCharacterX = String.valueOf(formatter.format(item.getCharacterX()));
             strCharacterY = String.valueOf(formatter.format(item.getCharacterY()));
             strPixelX = String.valueOf(formatter.format(item.getPixelX()));
              strPixelY = String.valueOf(formatter.format(item.getPixelY()));

              strInch = String.valueOf(formatter.format(item.getInchIn()));
              strPicacomputer = String.valueOf(formatter.format(item.getPicaComputer()));
             strPicaprinter = String.valueOf(formatter.format(item.getPicaPrinters()));
              strPostScriptpoint = String.valueOf(formatter.format(item.getPostScriptpoint()));
             strPointcomputer = String.valueOf(formatter.format(item.getPointComputer()));
              strPointprinter = String.valueOf(formatter.format(item.getPointprinter()));
             strEn = String.valueOf(formatter.format(item.getEn()));

            list.add(new ItemList("twip","Twip",strTwip,"twip"));
            list.add(new ItemList("m","Meter",strMeter,"m"));
            list.add(new ItemList("cm","Centimeter",strCentimeter,"cm"));
            list.add(new ItemList("mm","Millimeter",strMillimeter,"mm"));
            list.add(new ItemList("character(x)","Character(X)",strCharacterX,"character(x)"));


            list.add(new ItemList("character(y)","Character(Y)",strCharacterY,"character(y)"));
            list.add(new ItemList("pixel(x)","Pixel(X)",strPixelX,"pixel(x)"));
            list.add(new ItemList("pixel(y)"," Pixel(Y)",strPixelY,"pixel(y)"));
            list.add(new ItemList("in","Inch",strInch,"in"));
            list.add(new ItemList("pica","Pica(Computer)",strPicacomputer,"pica"));
            list.add(new ItemList("pica","Pica(Printer)",strPicaprinter,"pica"));
            list.add(new ItemList("psp","PostScript point",strPostScriptpoint,"psp"));
            list.add(new ItemList("pt","Point(Computer)",strPointcomputer,"pt"));
            list.add(new ItemList("pt","Point(Printer)",strPointprinter,"pt"));
            list.add(new ItemList("en","En",strEn,"en"));
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
