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
import com.nineinfosys.basicconverter.Engin.AreaConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.ItemList;
import com.nineinfosys.basicconverter.Supporter.Settings;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversionAreaListActivity extends AppCompatActivity implements TextWatcher {

    List<ItemList> list = new ArrayList<ItemList>();
    private  String stringSpinnerFrom;
    private double doubleEdittextvalue;
    private EditText edittextConversionListvalue;
    private TextView textconversionFrom,textViewConversionShortform;
    View ChildView ;
    DecimalFormat formatter = null;



    private RecyclerView rView;
    RecyclerViewConversionListAdapter rcAdapter;
    List<ItemList> rowListItem,rowListItem1;

    private String strSquareMeter = null;
    private String strSquareKilometer = null;
    private String strSquareCentimeter = null;
    private String strSquareMilimeter = null;
    private String strHectares = null;
    private String strAcre = null;
    private String strSquareMile = null;
    private String strSquareYard = null;
    private String strSquareFoot = null;
    private String strSquareInch = null;
    private String strSquareMicrometer = null;
    private String strSquareHectometer = null;
    private String strSquareDeckameter = null;
    private String strSquareDecimeter = null;
    private String strNanometer = null;
    private String strAre = null;
    private String strBarn = null;
    private String strSquareMileus = null;
    private String strSquarefootus = null;
    private String strCircularinch = null;
    private String strTownship = null;
    private String strSection = null;
    private String strAcreus = null;
    private String strRood= null;

    private String strSquareChain = null;
    private String strSquarerod = null;
    private String strSquarerodus = null;
    private String strSquarePerch = null;
    private String strSquarePole = null;
    private String strSquareMil = null;
    private String strCircularmil = null;
    private String strHomestead = null;
    private String strSabin = null;
    private String strArpent = null;

    private String strCuerda = null;
    private String strPlaza = null;
    private String strVarasCastellanas = null;
    private String strVarasConuqueras = null;
    private String strElectroncrosssection = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_list);

        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //customize toolbar

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#673ab7")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#65499c"));
        }

        //format of decimal pint
        formatsetting();

        MobileAds.initialize(ConversionAreaListActivity.this, getString(R.string.ads_app_id));
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
            case "Square Meter -  m²":
                textconversionFrom.setText("Square Meter");
                textViewConversionShortform.setText("m²");
                break;
            case "Square Kilometer - km²":
                textconversionFrom.setText("Square Kilometer");
                textViewConversionShortform.setText("km²");
                break;
            case "Square Centimeter - cm²":
                textconversionFrom.setText("Square Centimeter");
                textViewConversionShortform.setText("cm²");
                break;
            case "Square Millimeter -  mm²":
                textconversionFrom.setText("Square Millimeter");
                textViewConversionShortform.setText("mm²");
                break;
            case "Hectares - ha":
                textconversionFrom.setText("Hectares");
                textViewConversionShortform.setText("ha");
                break;
            case "Acre - ac":
                textconversionFrom.setText("Acre");
                textViewConversionShortform.setText("ac");
                break;

            case "Square Mile -  mi²":
                textconversionFrom.setText("Square Mile");
                textViewConversionShortform.setText("mi²");
                break;
            case "Square Yard - yd²":
                textconversionFrom.setText("Square Yard");
                textViewConversionShortform.setText("yd²");
                break;
            case "Square Foot - ft²":
                textconversionFrom.setText("Square Foot");
                textViewConversionShortform.setText("ft²");
                break;
            case "Square Inch - in²":
                textconversionFrom.setText("Square Inch");
                textViewConversionShortform.setText("in²");
                break;
            case "Square Micrometer -  μm²":
                textconversionFrom.setText("Square Micrometer");
                textViewConversionShortform.setText(" μm²");
                break;
            case "Square Hectometer - hm²":
                textconversionFrom.setText("Square Hectometer");
                textViewConversionShortform.setText("hm²");
                break;

            case "Square Dekameter - dam²":
                textconversionFrom.setText("Square Dekameter");
                textViewConversionShortform.setText("dam²");
                break;
            case "Square Decimeter -  dm²":
                textconversionFrom.setText("Square Decimeter");
                textViewConversionShortform.setText("dm²");
                break;
            case "Nanometer - nm²":
                textconversionFrom.setText("Nanometer");
                textViewConversionShortform.setText("nm²");
                break;
            case "Are - a":
                textconversionFrom.setText("Are");
                textViewConversionShortform.setText("a");
                break;
            case "Barn -  b":
                textconversionFrom.setText("Barn");
                textViewConversionShortform.setText("b");
                break;
            case "Square Mile (US survey)":
                textconversionFrom.setText("Square Mile");
                textViewConversionShortform.setText("mi²");
                break;
            case "Square foot (US survey)":
                textconversionFrom.setText("Square foot");
                textViewConversionShortform.setText("ft²");
                break;
            case "Circular Inch ":
                textconversionFrom.setText("Circular Inch");
                textViewConversionShortform.setText("circular inch");
                break;

            case "Township":
                textconversionFrom.setText("Township");
                textViewConversionShortform.setText("township");
                break;
            case "Section":
                textconversionFrom.setText("Section");
                textViewConversionShortform.setText("section");
                break;
            case "Acre(US survey) - ac":
                textconversionFrom.setText("Acre");
                textViewConversionShortform.setText("ac");
                break;

            case "Rood":
                textconversionFrom.setText("Rood");
                textViewConversionShortform.setText("rood");
                break;
            case "Square Chain - ch²":
                textconversionFrom.setText("Square Chain");
                textViewConversionShortform.setText("ch²");
                break;
            case "Square rod":
                textconversionFrom.setText("Square rod");
                textViewConversionShortform.setText("rod²");
                break;
            case "Square rod (US survey)":
                textconversionFrom.setText("Square rod");
                textViewConversionShortform.setText("rod²");
                break;
            case "Square Perch ":
                textconversionFrom.setText("Square Perch ");
                textViewConversionShortform.setText("perch²");
                break;
            case "Square Pole ":
                textconversionFrom.setText("Square Pole");
                textViewConversionShortform.setText("pole²");
                break;
            case "Square Mil - mil² ":
                textconversionFrom.setText("Square foot");
                textViewConversionShortform.setText("ft²");
                break;
            case "Cirular Mil":
                textconversionFrom.setText("Cirular Mil");
                textViewConversionShortform.setText("cirular mil");
                break;
            case "Homestead":
                textconversionFrom.setText("Homestead");
                textViewConversionShortform.setText("homestead");
                break;

            case "Sabin":
                textconversionFrom.setText("Sabin");
                textViewConversionShortform.setText("sabin");
                break;
            case "Arpent":
                textconversionFrom.setText("Arpent");
                textViewConversionShortform.setText("arpent");
                break;
            case "Cuerda":
                textconversionFrom.setText("Cuerda");
                textViewConversionShortform.setText("cuerda");
                break;
            case "Plaza":
                textconversionFrom.setText("Plaza");
                textViewConversionShortform.setText("plaza");
                break;
            case "Varas Castellanas Cuad":
                textconversionFrom.setText("Varas Castellanas Cuad");
                textViewConversionShortform.setText("varas castellanas cuad");
                break;
            case "Varas Conuqueras Cuad":
                textconversionFrom.setText("Varas Conuqueras Cuad");
                textViewConversionShortform.setText("varas conuqueras cuad");
                break;
            case "Electron Cross Section ":
                textconversionFrom.setText("Electron Cross Section ");
                textViewConversionShortform.setText("electron cross section ");
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
        AreaConverter c = new AreaConverter(strSpinnerFrom,doubleEdittextvalue1);
        ArrayList<AreaConverter.ConversionResults> results = c.calculateAreaConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            AreaConverter.ConversionResults item = results.get(i);

             strSquareMeter = String.valueOf(formatter.format(item.getSquaremeter()));
             strSquareKilometer = String.valueOf(formatter.format(item.getSquarekilometer()));
             strSquareCentimeter = String.valueOf(formatter.format(item.getSquarecentimeter()));
             strSquareMilimeter = String.valueOf(formatter.format(item.getSquaremilimeter()));
             strHectares = String.valueOf(formatter.format(item.getHectare()));
              strAcre = String.valueOf(formatter.format(item.getAcre()));
              strSquareMile = String.valueOf(formatter.format(item.getSquaremile()));
              strSquareYard = String.valueOf(formatter.format(item.getSquareyard()));
             strSquareFoot = String.valueOf(formatter.format(item.getSquarefoot()));
             strSquareInch = String.valueOf(formatter.format(item.getSquareinch()));

             strSquareMicrometer = String.valueOf(formatter.format(item.getSquaremicrometer()));
            strSquareHectometer = String.valueOf(formatter.format(item.getSquarehectometer()));
             strSquareDeckameter = String.valueOf(formatter.format(item.getSquaredekameter()));
             strSquareDecimeter = String.valueOf(formatter.format(item.getSquaredecimeter()));
              strNanometer = String.valueOf(formatter.format(item.getSquarenanometer()));
              strAre = String.valueOf(formatter.format(item.getAre()));
              strBarn = String.valueOf(formatter.format(item.getBarn()));
              strSquareMileus = String.valueOf(formatter.format(item.getSquaremileus()));
               strSquarefootus = String.valueOf(formatter.format(item.getSquarefootus()));
             strCircularinch = String.valueOf(formatter.format(item.getCircularinch()));

             strTownship = String.valueOf(formatter.format(item.getTownship()));
              strSection = String.valueOf(formatter.format(item.getSection()));
              strAcreus = String.valueOf(formatter.format(item.getAcreus()));
              strRood = String.valueOf(formatter.format(item.getRood()));
              strSquareChain = String.valueOf(formatter.format(item.getSquarechain()));
              strSquarerod = String.valueOf(formatter.format(item.getSquarerod()));
             strSquarerodus = String.valueOf(formatter.format(item.getSquarerodus()));
             strSquarePerch = String.valueOf(formatter.format(item.getSquareperch()));
             strSquarePole = String.valueOf(formatter.format(item.getSquarepole()));
             strSquareMil = String.valueOf(formatter.format(item.getSquaremil()));

              strCircularmil = String.valueOf(formatter.format(item.getCircularmil()));
             strHomestead = String.valueOf(formatter.format(item.getHomestead()));
             strSabin = String.valueOf(formatter.format(item.getSabin()));
             strArpent = String.valueOf(formatter.format(item.getArpent()));
             strCuerda = String.valueOf(formatter.format(item.getCuerda()));
              strPlaza = String.valueOf(formatter.format(item.getPlaza()));
              strVarasCastellanas = String.valueOf(formatter.format(item.getVarascastellanascuad()));
              strVarasConuqueras = String.valueOf(formatter.format(item.getVarasconuquerascaud()));
              strElectroncrosssection = String.valueOf(formatter.format(item.getElectroncrosssection()));

            list.add(new ItemList("m²","Square Meter",strSquareMeter,"m²"));
            list.add(new ItemList("km²","Square Kilometer",strSquareKilometer,"km²"));
            list.add(new ItemList("cm²","Square Centimeter",strSquareCentimeter,"cm²"));
            list.add(new ItemList("mm²","Square Millimeter",strSquareMilimeter,"mm²"));
            list.add(new ItemList("ha","Hectares",strHectares,"ha"));
            list.add(new ItemList("ac","Acre",strAcre,"ac"));
            list.add(new ItemList("mi²","Square Mile",strSquareMile,"mi²"));
            list.add(new ItemList("yd²","Square Yard",strSquareYard,"yd²"));

            list.add(new ItemList("ft²","Square foot",strSquareFoot,"ft²"));
            list.add(new ItemList("km²","Square Inch",strSquareInch,"in²"));
            list.add(new ItemList("μm²","Square Micrometer",strSquareMicrometer,"μm²"));
            list.add(new ItemList("hm²","Square Hectometer",strSquareHectometer,"hm²"));
            list.add(new ItemList("dam²","Dekameter",strSquareDeckameter,"dam²"));
            list.add(new ItemList("dm²","Decimeter",strSquareDecimeter,"dm²"));
            list.add(new ItemList("nm²","Nanometer",strNanometer,"nm²"));
            list.add(new ItemList("a","Are",strAre,"a"));

            list.add(new ItemList("b","Barn",strBarn,"b"));
            list.add(new ItemList("  Square Mile (US survey)","",strSquareMileus,""));
            list.add(new ItemList("  Square foot (US survey)","",strSquarefootus,""));
            list.add(new ItemList("Circular Inch","",strCircularinch,""));
            list.add(new ItemList("Township","",strTownship,""));
            list.add(new ItemList("Section","",strSection,""));
            list.add(new ItemList("ac","Acre(US survey)",strAcreus,"ac"));
            list.add(new ItemList("","Rood",strRood,""));

            list.add(new ItemList("ch²","Square Chain",strSquareChain,"ch²"));
            list.add(new ItemList("Square rod","",strSquarerod,""));
            list.add(new ItemList("  Square rod (US survey)","",strSquarerodus,""));
            list.add(new ItemList("Square Perch","",strSquarePerch,""));
            list.add(new ItemList("Square Pole ","",strSquarePole,""));
            list.add(new ItemList("mil²","Square Mil",strSquareMil,"mil²"));
            list.add(new ItemList("Cirular Mil","",strCircularmil,""));
            list.add(new ItemList("Homestead","",strHomestead,""));

            list.add(new ItemList("Sabin","",strSabin,""));
            list.add(new ItemList("Arpent","",strArpent,""));
            list.add(new ItemList("Cuerda","",strCuerda,""));
            list.add(new ItemList("Plaza","",strPlaza,""));
            list.add(new ItemList("  Varas Castellanas Cuad","",strVarasCastellanas,""));
            list.add(new ItemList("Varas Conuqueras Cuad","",strVarasConuqueras,""));
            list.add(new ItemList("   Electron Cross Section ","",strElectroncrosssection,""));

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
