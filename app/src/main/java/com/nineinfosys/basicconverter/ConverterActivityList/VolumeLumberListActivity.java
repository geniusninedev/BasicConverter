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
import com.nineinfosys.basicconverter.Engin.VolumeLumberConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.ItemList;
import com.nineinfosys.basicconverter.Supporter.Settings;


import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class VolumeLumberListActivity extends AppCompatActivity implements TextWatcher {

    List<ItemList> list = new ArrayList<ItemList>();
    private  String stringSpinnerFrom;
    private double doubleEdittextvalue;
    private EditText edittextConversionListvalue;
    private TextView textconversionFrom,textViewConversionShortform;
    View ChildView ;
    private String strCubicmeter = null;
    private String strCubicfoot = null;
    private String strCubicinch = null;
    private String strBoardfeet = null;
    private  String strThousandboardfeet = null;
    private String strCord = null;
    private String strCord80cubicft = null;

    private String strCordfeet = null;
    private String strCunit = null;
    private String strPallet = null;
    private  String strCrosstie = null;
    private  String strSwitchtie = null;
    private String strThousandsquarefeet1of8inch = null;

    private String strThousandsquarefeet1of4inch = null;
    private String strThousandsquarefeet3of8inch = null;
    private  String strThousandsquarefeet1of2inch = null;
    private String strThousandsquarefeet3of4inch = null;

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

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#e65f21")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#a02a00"));
        }


        //format of decimal pint
        formatsetting();

        MobileAds.initialize(VolumeLumberListActivity.this, getString(R.string.ads_app_id));
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
            case "Cubic meter - m³":
                textconversionFrom.setText("Cubic cmeter");
                textViewConversionShortform.setText("m³");
                break;
            case "Cubic foot - ft³":
                textconversionFrom.setText("Cubic foot");
                textViewConversionShortform.setText("ft³");
                break;
            case "Cubic inch - in³":
                textconversionFrom.setText("Cubic inch");
                textViewConversionShortform.setText("in³");
                break;
            case "Board feet - boardfeet":
                textconversionFrom.setText("Board feet");
                textViewConversionShortform.setText("boardfeet");
                break;


            case "Thousand board feet - thousand board feet":
                textconversionFrom.setText("Thousand board feet");
                textViewConversionShortform.setText("thousand board feet");
                break;

            case "Cord - cord":
                textconversionFrom.setText("Cord");
                textViewConversionShortform.setText("cord");
                break;
            case "Cord(80 cubic ft) - cord":
                textconversionFrom.setText("Cord(80 cubic ft)");
                textViewConversionShortform.setText("cord");
                break;
            case "Cord feet - cordfeet":
                textconversionFrom.setText("Cord feet");
                textViewConversionShortform.setText("cordfeet");
                break;
            case "Cunit - cunit":
                textconversionFrom.setText("Cunit");
                textViewConversionShortform.setText("cunit");
                break;
            case "Pallet - pallet":
                textconversionFrom.setText("Pallet");
                textViewConversionShortform.setText("pallet");
                break;


            case "Cross tie - crosstie":
                textconversionFrom.setText("Cross tie");
                textViewConversionShortform.setText("crosstie");
                break;

            case  "Switch tie - switchtie":
                textconversionFrom.setText("Switch tie");
                textViewConversionShortform.setText("switchtie");
                break;


            case "Thousand square feet (1/8inch panels) - ft²":
                textconversionFrom.setText("Thousand square feet (1/8inch panels)");
                textViewConversionShortform.setText("ft²");
                break;
            case "Thousand square feet (1/4inch panels) - ft²":
                textconversionFrom.setText("Thousand square feet (1/4inch panels)");
                textViewConversionShortform.setText("ft²");
                break;


            case "Thousand square feet (3/8inch panels) - ft²":
                textconversionFrom.setText("Thousand square feet (3/8inch panels)");
                textViewConversionShortform.setText("ft²");
                break;

            case "Thousand square feet (1/2inch panels) - ft²":
                textconversionFrom.setText("Thousand square feet (1/2inch panels)");
                textViewConversionShortform.setText("ft²");
                break;
            case "Thousand square feet (3/4inch panels) - ft²":
                textconversionFrom.setText("Thousand square feet (3/4inch panels)");
                textViewConversionShortform.setText("ft²");
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
        VolumeLumberConverter c = new VolumeLumberConverter(strSpinnerFrom, (int) doubleEdittextvalue1);
        ArrayList<VolumeLumberConverter.ConversionResults> results = c.calculateVolumeLumberConversions();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            VolumeLumberConverter.ConversionResults item = results.get(i);

            strCubicmeter = String.valueOf(formatter.format(item.getCubicmeter()));
            strCubicfoot =String.valueOf(formatter.format(item.getCubicfoot()));
            strCubicinch =String.valueOf(formatter.format(item.getCubicinch()));
            strBoardfeet =String.valueOf(formatter.format(item.getBoardfeet()));
            strThousandboardfeet = String.valueOf(formatter.format(item.getThousandboardfeet()));
            strCord =String.valueOf(formatter.format(item.getCord()));
            strCord80cubicft = String.valueOf(formatter.format(item.getCord80cubicft()));
            strCordfeet =String.valueOf(formatter.format(item.getCordfeet()));
            strCunit =String.valueOf(formatter.format(item.getCunit()));
            strPallet =String.valueOf(formatter.format(item.getPallet()));
            strCrosstie =String.valueOf(formatter.format(item.getCrosstie()));
            strSwitchtie = String.valueOf(formatter.format(item.getSwitchtie()));
            strThousandsquarefeet1of8inch =String.valueOf(formatter.format(item.getThousandsquarefeet1of8inch()));
            strThousandsquarefeet1of4inch = String.valueOf(formatter.format(item.getThousandsquarefeet1of4inch()));
            strThousandsquarefeet3of8inch =String.valueOf(formatter.format(item.getThousandsquarefeet3of8inch()));
            strThousandsquarefeet1of2inch =String.valueOf(formatter.format(item.getThousandsquarefeet1of2inch()));
            strThousandsquarefeet3of4inch =String.valueOf(formatter.format(item.getThousandsquarefeet3of4inch()));




            list.add(new ItemList("m³","Cubic meter",strCubicmeter,"m³"));
            list.add(new ItemList("ft³","Cubic foot",strCubicfoot,"ft³"));
            list.add(new ItemList("in³","Cubic inch",strCubicinch,"in³"));
            list.add(new ItemList("boardfeet","Board feet",strBoardfeet,"boardfeet"));
            list.add(new ItemList("thousand board feet","Thousand board feet",strThousandboardfeet,"thousand board feet"));
            list.add(new ItemList("cord","Cord",strCord,"cord"));
            list.add(new ItemList("cord","Cord(80 cubic ft)",strCord80cubicft,"cord"));

            list.add(new ItemList("cordfeet","Cord feet",strCordfeet,"cordfeet"));
            list.add(new ItemList("cunit","Cunit",strCunit,"cunit"));
            list.add(new ItemList("pallet","Pallet",strPallet,"pallet"));
            list.add(new ItemList("crosstie","Cross tie",strCrosstie,"crosstie"));
            list.add(new ItemList("switchtie","Switch tie",strSwitchtie,"switchtie"));
            list.add(new ItemList("ft²","Thousand square feet (1/8inch panels)",strThousandsquarefeet1of8inch,"ft²"));
            list.add(new ItemList("ft²","Thousand square feet (1/4inch panels)",strThousandsquarefeet1of4inch,"ft²"));
            list.add(new ItemList("ft²","Thousand square feet (3/8inch panels)",strThousandsquarefeet3of8inch,"ft²"));
            list.add(new ItemList("ft²","Thousand square feet (1/2inch panels)",strThousandsquarefeet1of2inch,"ft²"));
            list.add(new ItemList("ft²","Thousand square feet (3/4inch panels)",strThousandsquarefeet3of4inch,"ft²"));




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

