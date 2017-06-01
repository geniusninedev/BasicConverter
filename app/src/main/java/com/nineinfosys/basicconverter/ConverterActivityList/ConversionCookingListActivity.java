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
import com.nineinfosys.basicconverter.Engin.Cooking;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.ItemList;
import com.nineinfosys.basicconverter.Supporter.Settings;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversionCookingListActivity extends AppCompatActivity implements TextWatcher {

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

    private Cooking.ConversionResults item;
    private String strcupeuro=null,strcupus=null,strfluidounce=null,strgrameuro=null,strkgeuro=null,strlitereuro=null,strmleuro=null,strounceus=null,
            strpint=null,strpoundus=null,strtseuro=null,strtsus=null,strteaseuro=null,strteasus=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_list);

        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#2eaf46")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#007e17"));
        }

        //format of decimal pint
        formatsetting();

        MobileAds.initialize(ConversionCookingListActivity.this, getString(R.string.ads_app_id));
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

            case "Cup(Euro) - cup":
               textconversionFrom.setText("Cup(Euro)");
               textViewConversionShortform.setText("cup");
                break;
            case "Cup(US) - cup":
               textconversionFrom.setText("Cup(US)");
                textViewConversionShortform.setText("cup");
                break;
            case "Gram - g":
               textconversionFrom.setText("Gram");
                textViewConversionShortform.setText("g");
                break;
            case "Kilogram - kg":
               textconversionFrom.setText("Kilogram");
                textViewConversionShortform.setText("kg");
                break;
            case "Liter - li":
               textconversionFrom.setText("Liter");
                textViewConversionShortform.setText("li");
                break;
            case "Milliliter - ml":
               textconversionFrom.setText("Milliliter");
                textViewConversionShortform.setText("ml");
                break;
            case "Ounce - oz":
               textconversionFrom.setText("Ounce");
                textViewConversionShortform.setText("oz");
                break;

            case "Fluid Ounce - floz":
               textconversionFrom.setText("Fluid Ounce");
                textViewConversionShortform.setText("oz");
                break;
            case "Pint - pt":
               textconversionFrom.setText("Pint");
                textViewConversionShortform.setText("pt");
                break;

            case "Pound - lb":
               textconversionFrom.setText("Pound");
                textViewConversionShortform.setText("lb");
                break;
            case "Table Spoon(Euro) - tbsp":
               textconversionFrom.setText("Table Spoon(Euro)");
                textViewConversionShortform.setText("tbsp");
                break;
            case "Table Spoon(US) - tbsp":
               textconversionFrom.setText("Table Spoon(US)");
                textViewConversionShortform.setText("tbsp");
                break;
            case "Tea Spoon(Euro) - tsp":
               textconversionFrom.setText("Tea Spoon(Euro)");
                textViewConversionShortform.setText("tsp");
                break;
            case "Tea Spoon(US) - tsp":
               textconversionFrom.setText("Tea Spoon(US)");
                textViewConversionShortform.setText("tsp");
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
        Cooking c = new Cooking(strSpinnerFrom, doubleEdittextvalue1);
        ArrayList<Cooking.ConversionResults> results = c.calculatecookingConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            item = results.get(i);

            strcupeuro= String.valueOf(formatter.format(item.getCupeuro()));
            strcupus= String.valueOf(formatter.format(item.getCupus()));
            strfluidounce= String.valueOf(formatter.format(item.getFluidounce()));
            strgrameuro= String.valueOf(formatter.format(item.getGrameuro()));
            strkgeuro= String.valueOf(formatter.format(item.getKgeuro()));
            strlitereuro= String.valueOf(formatter.format(item.getLitereuro()));
            strmleuro= String.valueOf(formatter.format(item.getMleuro()));
            strounceus= String.valueOf(formatter.format(item.getOunceus()));
            strpint= String.valueOf(formatter.format(item.getPint()));
            strpoundus= String.valueOf(formatter.format(item.getPoundus()));
            strtseuro= String.valueOf(formatter.format(item.getTseuro()));
            strtsus= String.valueOf(formatter.format(item.getTsus()));
            strteaseuro= String.valueOf(formatter.format(item.getTeaseuro()));
            strteasus= String.valueOf(formatter.format(item.getTeasus()));

            list.add(new ItemList("cup","Cup(Euro)",strcupeuro,"cup"));
            list.add(new ItemList("cup","Cup(US)",strcupus,"cup"));
            list.add(new ItemList("g","Gram",strgrameuro,"g"));
            list.add(new ItemList("kg","Kilogram",strkgeuro,"kg"));
            list.add(new ItemList("li","Liter",strlitereuro,"li"));
            list.add(new ItemList("ml","Milliliter",strmleuro,"ml"));
            list.add(new ItemList("oz","Ounce",strounceus,"oz"));
            list.add(new ItemList("floz","Fluid Ounce",strfluidounce,"floz"));
            list.add(new ItemList("pt","Pint",strpint,"pt"));
            list.add(new ItemList("lb","Pound",strpoundus,"lb"));
            list.add(new ItemList("tbsp","Table Spoon(Euro)",strtseuro,"tbsp"));
            list.add(new ItemList("tbsp","Table Spoon(US)",strtsus,"tbsp"));
            list.add(new ItemList("tsp","Tea Spoon(Euro)",strteaseuro,"tsp"));
            list.add(new ItemList("tsp","Tea Spoon(US)",strteasus,"tsp"));

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
