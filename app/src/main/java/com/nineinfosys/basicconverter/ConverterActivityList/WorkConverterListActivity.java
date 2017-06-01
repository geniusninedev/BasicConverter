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
import com.nineinfosys.basicconverter.Engin.WorkConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.ItemList;
import com.nineinfosys.basicconverter.Supporter.Settings;


import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class WorkConverterListActivity extends AppCompatActivity implements TextWatcher {

    List<ItemList> list = new ArrayList<ItemList>();
    private  String stringSpinnerFrom;
    private double doubleEdittextvalue;
    private EditText edittextConversionListvalue;
    private TextView textconversionFrom,textViewConversionShortform;
    View ChildView ;
    private String strJoule = null;
    private String strKilojoule = null;
    private String strCalorie = null;
    private String strKilocalorie = null;
    private  String strKilowatthour = null;
    private String strKilogramforcemeter = null;
    private String strInchpound = null;

    private String strFootpound = null;
    private String strBtu = null;

    private static final int REQUEST_CODE = 100;
    private File imageFile;
    private Bitmap bitmap;
    private PrintHelper printhelper;

    DecimalFormat formatter = null;


    private RecyclerView rView;
    RecyclerViewConversionListAdapter rcAdapter;
    List<ItemList> rowListItem,rowListItem1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_list);

        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#10b5ce")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#00859d"));
        }


        //format of decimal pint
        formatsetting();

        MobileAds.initialize(WorkConverterListActivity.this, getString(R.string.ads_app_id));
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
            case "Joule - J":
                textconversionFrom.setText("Joule");
                textViewConversionShortform.setText("J");
                break;
            case "Kilojoule - kJ":
                textconversionFrom.setText("Kilojoule");
                textViewConversionShortform.setText("kJ");
                break;
            case "Calorie - cal":
                textconversionFrom.setText("Calorie");
                textViewConversionShortform.setText("cal");
                break;
            case "Kilocalorie - kcal":
                textconversionFrom.setText("Kilocalorie");
                textViewConversionShortform.setText("kcal");
                break;


            case "Kilowatt hour - kw*h":
                textconversionFrom.setText("Kilowatt hour");
                textViewConversionShortform.setText("kw*h");
                break;

            case "Kilogram force meter - kgf*m":
                textconversionFrom.setText("Kilogram force meter");
                textViewConversionShortform.setText("kgf*m");
                break;
            case "Inch pound - in*lbf":
                textconversionFrom.setText("Inch pound");
                textViewConversionShortform.setText("in*lbf");
                break;
            case "Foot pound - ft*lbf":
                textconversionFrom.setText("Foot pound ");
                textViewConversionShortform.setText("ft*lbf");
                break;
            case "Btu - btu":
                textconversionFrom.setText("Btu");
                textViewConversionShortform.setText("btu");
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
        WorkConverter c = new WorkConverter(strSpinnerFrom, (int) doubleEdittextvalue1);
        ArrayList<WorkConverter.ConversionResults> results = c.calculateworkConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            WorkConverter.ConversionResults item = results.get(i);
            strJoule = String.valueOf(formatter.format(item.getJoule()));
            strKilojoule =String.valueOf(formatter.format(item.getKj()));
            strCalorie =String.valueOf(formatter.format(item.getCal()));
            strKilocalorie =String.valueOf(formatter.format(item.getKcal()));
            strKilowatthour = String.valueOf(formatter.format(item.getKwh()));
            strKilogramforcemeter =String.valueOf(formatter.format(item.getKgfm()));
            strInchpound = String.valueOf(formatter.format(item.getInlbf()));
            strFootpound =String.valueOf(formatter.format(item.getFtlbf()));
            strBtu =String.valueOf(formatter.format(item.getBtu()));




            list.add(new ItemList("J","Joule",strJoule,"J"));
            list.add(new ItemList("kJ","Kilojoule",strKilojoule,"kJ"));
            list.add(new ItemList("cal","Calorie",strCalorie,"cal"));
            list.add(new ItemList("kcal","Kilocalorie",strKilocalorie,"kcal"));
            list.add(new ItemList("kw*h","Kilowatt hour",strKilowatthour,"kw*h"));
            list.add(new ItemList("kgf*m","Kilogram force meter",strKilogramforcemeter,"kgf*m"));
            list.add(new ItemList("in*lbf","Inch pound",strInchpound,"in*lbf"));

            list.add(new ItemList("ft*lbf","Foot pound",strFootpound,"ft*lbf"));
            list.add(new ItemList("btu","Btu",strBtu,"btu"));



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
