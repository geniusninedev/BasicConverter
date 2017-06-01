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
import com.nineinfosys.basicconverter.Engin.DataStorageConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.ItemList;
import com.nineinfosys.basicconverter.Supporter.Settings;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversionDataStorageListActivity extends AppCompatActivity implements TextWatcher {

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
    private  List<ItemList> rowListItem,rowListItem1;

   private String strBit=null, strNibble=null, strByte=null, strCharacter=null, strWord=null, strMAPMword=null, strQuadrupleword=null, strBlock=null, strKilobit=null, strKilobyte=null, strKilobyte103bytes=null,
            strMegabit=null, strMegabyte=null, strMegabyte106bytes=null, strGigabit=null, strGigabyte=null, strGigabyte109bytes=null, strTerabit=null, strTerabyte=null, strTerabyte1012bytes=null, strPetabit=null,
            strPetabyte=null, strPetabyte1015bytes=null, strExabit=null, strExabyte=null, strExabyte1018bytes=null, strFloppydisk35DD=null, strFloppydisk35HD=null, strFloppydisk35ED=null, strFloppydisk525DD=null,
            strFloppydisk525sHD=null, strZip100=null, strZip250=null, strJaz1GB=null, strJaz2GB=null, strCD74minute=null, strCD80minute=null, strDVD1layer1side=null, strDVD2layer1side=null, strDVD1layer2side=null,
            strDVD2layer2side=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_list);

        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#e65f21")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        MobileAds.initialize(ConversionDataStorageListActivity.this, getString(R.string.ads_app_id));
        AdView mAdView = (AdView) findViewById(R.id.adViewUnitConverterList);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#a02a00"));
        }
        //format of decimal pint
        formatsetting();


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
            case "Bit - b":
                textconversionFrom.setText("Bit");
                textViewConversionShortform.setText("b");
                break;
            case "Nibble - n":
                textconversionFrom.setText("Nibble");
                textViewConversionShortform.setText("n");
                break;
            case "Byte - B":
                textconversionFrom.setText("Byte");
                textViewConversionShortform.setText("B");
                break;
            case "Character - ch":
                textconversionFrom.setText("Character");
                textViewConversionShortform.setText("ch");
                break;
            case "Word - w":
                textconversionFrom.setText("Word");
                textViewConversionShortform.setText("w");
                break;
            case "MAPM-word - w":
                textconversionFrom.setText("MAPM-word");
                textViewConversionShortform.setText("w");
                break;
            case "Quadruple-word - w":
                textconversionFrom.setText("Quadruple-word");
                textViewConversionShortform.setText("w");
                break;
            case "Block - blk":
                textconversionFrom.setText("Block");
                textViewConversionShortform.setText("blk");
                break;
            case "Kilobit - kb":
                textconversionFrom.setText("Kilobit");
                textViewConversionShortform.setText("kb");
                break;
            case "Kilobyte - kB":
                textconversionFrom.setText("Kilobyte");
                textViewConversionShortform.setText("kB");
                break;
            case "Kilobyte (10^3 bytes) - kB":
                textconversionFrom.setText("Kilobyte (10^3 bytes)");
                textViewConversionShortform.setText("kB");
                break;
            case "Megabit - Mb":
                textconversionFrom.setText("Megabit");
                textViewConversionShortform.setText("Mb");
                break;
            case "Megabyte - MB":
                textconversionFrom.setText("Megabyte");
                textViewConversionShortform.setText("MB");
                break;
            case "Megabyte (10^6 bytes) - MB":
                textconversionFrom.setText("Megabyte (10^6 bytes)");
                textViewConversionShortform.setText("MB");
                break;
            case "Gigabit - Gb":
                textconversionFrom.setText("Gigabit");
                textViewConversionShortform.setText("Gb");
                break;
            case "Gigabyte - GB":
                textconversionFrom.setText("Gigabyte");
                textViewConversionShortform.setText("GB");
                break;
            case "Gigabyte (10^9 bytes) - GB":
                textconversionFrom.setText("Gigabyte (10^9 bytes)");
                textViewConversionShortform.setText("GB");
                break;
            case "Terabit - Tb":
                textconversionFrom.setText("Terabit");
                textViewConversionShortform.setText("Tb");
                break;
            case "Terabyte - TB":
                textconversionFrom.setText("Terabyte");
                textViewConversionShortform.setText("TB");
                break;
            case "Terabyte (10^12 bytes) - TB":
                textconversionFrom.setText("Terabyte (10^12 bytes)");
                textViewConversionShortform.setText("TB");
                break;
            case "Petabit - Pb":
                textconversionFrom.setText("Petabit");
                textViewConversionShortform.setText("Pb");
                break;
            case "Petabyte - PB":
                textconversionFrom.setText("Petabyte");
                textViewConversionShortform.setText("PB");
                break;
            case "Petabyte (10^15 bytes) - PB":
                textconversionFrom.setText("Petabyte (10^15 bytes)");
                textViewConversionShortform.setText("PB");
                break;
            case "Exabit - Eb":
                textconversionFrom.setText("Exabit");
                textViewConversionShortform.setText("Eb");
                break;
            case "Exabyte - EB":
                textconversionFrom.setText("Exabyte");
                textViewConversionShortform.setText("EB");
                break;
            case "Exabyte (10^18 bytes) - EB":
                textconversionFrom.setText("Exabyte (10^18 bytes)");
                textViewConversionShortform.setText("EB");
                break;
            case "Floppy disk (3.5″, DD) - floppy":
                textconversionFrom.setText("Floppy disk (3.5″, DD)");
                textViewConversionShortform.setText("floppy");
                break;
            case "Floppy disk (3.5″, HD) - floppy":
                textconversionFrom.setText("Floppy disk (3.5″, HD");
                textViewConversionShortform.setText("floppy");
                break;
            case "Floppy disk (3.5″, ED) - floppy":
                textconversionFrom.setText("Floppy disk (3.5″, ED)");
                textViewConversionShortform.setText("floppy");
                break;
            case "Floppy disk (5.25″, DD) - floppy":
                textconversionFrom.setText("Floppy disk (5.25″, DD)");
                textViewConversionShortform.setText("floppy");
                break;
            case "Floppy disk (5.25″, HD) - floppy":
                textconversionFrom.setText("Floppy disk (5.25″, HD)");
                textViewConversionShortform.setText("floppy");
                break;
            case "Zip 100 - Zip":
                textconversionFrom.setText("Zip 100");
                textViewConversionShortform.setText("Zip");
                break;
            case "Zip 250 - Zip":
                textconversionFrom.setText("Zip 250");
                textViewConversionShortform.setText("Zip");
                break;
            case "Jaz 1GB - Jaz":
                textconversionFrom.setText("Jaz 1GB");
                textViewConversionShortform.setText("Jaz");
                break;
            case "Jaz 2GB - Jaz":
                textconversionFrom.setText("Jaz 2GB");
                textViewConversionShortform.setText("Jaz");
                break;
            case "CD (74 minute) - CD":
                textconversionFrom.setText("CD (74 minute)");
                textViewConversionShortform.setText("CD");
                break;
            case  "CD (80 minute) - CD":
                textconversionFrom.setText("CD (80 minute)");
                textViewConversionShortform.setText("CD");
                break;
            case "DVD (1 layer, 1 side) - DVD":
                textconversionFrom.setText("DVD (1 layer, 1 side");
                textViewConversionShortform.setText("DVD");
                break;
            case "DVD (2 layer, 1 side) - DVD":
                textconversionFrom.setText("DVD (2 layer, 1 side)");
                textViewConversionShortform.setText("DVD");
                break;
            case "DVD (1 layer, 2 side) - DVD":
                textconversionFrom.setText("DVD (1 layer, 2 side)");
                textViewConversionShortform.setText("DVD");
                break;
            case  "DVD (2 layer, 2 side) - DVD":
                textconversionFrom.setText("DVD (2 layer, 2 side)");
                textViewConversionShortform.setText("DVD");
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

        DataStorageConverter c = new  DataStorageConverter(strSpinnerFrom,doubleEdittextvalue1);
        ArrayList<DataStorageConverter.ConversionResults> results = c.calculatestorageConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            DataStorageConverter.ConversionResults item = results.get(i);



            strBit=String.valueOf(formatter.format(item.getBitt()));
            strNibble=String.valueOf(formatter.format(item.getNibblee()));
            strByte=String.valueOf(formatter.format(item.getBytee()));
            strCharacter=String.valueOf(formatter.format(item.getCharacterr()));
            strWord=String.valueOf(formatter.format(item.getWordd()));
            strMAPMword=String.valueOf(formatter.format(item.getMapmwordd()));
            strQuadrupleword=String.valueOf(formatter.format(item.getQuadd()));
            strBlock=String.valueOf(formatter.format(item.getBlockk()));
            strKilobit=String.valueOf(formatter.format(item.getKilobitt()));
            strKilobyte=String.valueOf(formatter.format(item.getKilobytee()));
            strKilobyte103bytes=String.valueOf(formatter.format(item.getKilobytee2()));
            strMegabit=String.valueOf(formatter.format(item.getMegabitt()));
            strMegabyte=String.valueOf(formatter.format(item.getMegabytee()));
            strMegabyte106bytes=String.valueOf(formatter.format(item.getMegabytee2()));
            strGigabit=String.valueOf(formatter.format(item.getGigabitt()));
            strGigabyte=String.valueOf(formatter.format(item.getGigabytee()));
            strGigabyte109bytes=String.valueOf(formatter.format(item.getGigabytee2()));
            strTerabit=String.valueOf(formatter.format(item.getTerabitt()));
            strTerabyte=String.valueOf(formatter.format(item.getTerabytee()));
            strTerabyte1012bytes=String.valueOf(formatter.format(item.getTerabytee2()));
            strPetabit=String.valueOf(formatter.format(item.getPetabitt()));
            strPetabyte=String.valueOf(formatter.format(item.getPetabytee()));
            strPetabyte1015bytes=String.valueOf(formatter.format(item.getPetabytee2()));
            strExabit=String.valueOf(formatter.format(item.getExabitt()));
            strExabyte=String.valueOf(formatter.format(item.getExabytee()));
            strExabyte1018bytes=String.valueOf(formatter.format(item.getExabytee2()));
            strFloppydisk35DD=String.valueOf(formatter.format(item.getFloppydiskk1()));
            strFloppydisk35HD=String.valueOf(formatter.format(item.getFloppydiskk2()));
            strFloppydisk35ED=String.valueOf(formatter.format(item.getFloppydiskk3()));
            strFloppydisk525DD=String.valueOf(formatter.format(item.getFloppydiskk4()));
            strFloppydisk525sHD=String.valueOf(formatter.format(item.getFloppydiskk5()));
            strZip100=String.valueOf(formatter.format(item.getZip1()));
            strZip250=String.valueOf(formatter.format(item.getZip2()));
            strJaz1GB=String.valueOf(formatter.format(item.getJaz1()));
            strJaz2GB=String.valueOf(formatter.format(item.getJaz2()));
            strCD74minute=String.valueOf(formatter.format(item.getCd1()));
            strCD80minute=String.valueOf(formatter.format(item.getCd2()));
            strDVD1layer1side=String.valueOf(formatter.format(item.getDvd1()));
            strDVD2layer1side=String.valueOf(formatter.format(item.getDvd2()));
            strDVD1layer2side=String.valueOf(formatter.format(item.getDvd3()));
            strDVD2layer2side=String.valueOf(formatter.format(item.getDvd4()));

            list.add(new ItemList("b","Bit",strBit,"b"));
            list.add(new ItemList("n","Nibble",strNibble,"n"));
            list.add(new ItemList("B","Byte",strByte,"B"));
            list.add(new ItemList("ch","Character",strCharacter,"ch"));
            list.add(new ItemList("w","Word",strWord,"w"));
            list.add(new ItemList("w","MAPM-word",strMAPMword,"w"));
            list.add(new ItemList("w","Quadruple-word",strQuadrupleword,"w"));
            list.add(new ItemList("blk","Block",strBlock,"blk"));
            list.add(new ItemList("kb","Kilobit",strKilobit,"kb"));
            list.add(new ItemList("kB","Kilobyte",strKilobyte,"kB"));
            list.add(new ItemList("kB","Kilobyte (10^3 bytes)",strKilobyte103bytes,"kB"));
            list.add(new ItemList("Mb","Megabit",strMegabit,"Mb"));
            list.add(new ItemList("MB","Megabyte",strMegabyte,"MB"));
            list.add(new ItemList("MB","Megabyte (10^6 bytes)",strMegabyte106bytes,"MB"));
            list.add(new ItemList("Gb","Gigabit",strGigabit,"Gb"));
            list.add(new ItemList("GB","Gigabyte",strGigabyte,"GB"));
            list.add(new ItemList("GB","Gigabyte (10^9 bytes)",strGigabyte109bytes,"GB"));
            list.add(new ItemList("Tb","Terabit",strTerabit,"Tb"));
            list.add(new ItemList("TB","Terabyte",strTerabyte,"TB"));
            list.add(new ItemList("TB","Terabyte (10^12 bytes)",strTerabyte1012bytes,"TB"));
            list.add(new ItemList("Pb","Petabit",strPetabit,"Pb"));
            list.add(new ItemList("PB","Petabyte",strPetabyte,"PB"));
            list.add(new ItemList("PB","Petabyte (10^15 bytes)",strPetabyte1015bytes,"PB"));
            list.add(new ItemList("Eb","Exabit",strExabit,"Eb"));
            list.add(new ItemList("EB","Exabyte",strExabyte,"EB"));
            list.add(new ItemList("EB","Exabyte (10^18 bytes)",strExabyte1018bytes,"EB"));
            list.add(new ItemList("floppy","Floppy disk (3.5″, DD)",strFloppydisk35DD,"floppy"));
            list.add(new ItemList("floppy","Floppy disk (3.5″, HD)",strFloppydisk35HD,"floppy"));
            list.add(new ItemList("floppy","Floppy disk (3.5″, ED)",strFloppydisk35ED,"floppy"));
            list.add(new ItemList("floppy","Floppy disk (5.25″, DD)",strFloppydisk525DD,"floppy"));
            list.add(new ItemList("floppy","Floppy disk (5.25″, HD)",strFloppydisk525sHD,"floppy"));
            list.add(new ItemList("Zip","Zip 100",strZip100,"Zip"));
            list.add(new ItemList("Zip","Zip 250",strZip250,"Zip"));
            list.add(new ItemList("Jaz","Jaz 1GB",strJaz1GB,"Jaz"));
            list.add(new ItemList("Jaz","Jaz 2GB",strJaz2GB,"Jaz"));
            list.add(new ItemList("CD","CD (74 minute)",strCD74minute,"CD"));
            list.add(new ItemList("CD","CD (80 minute)",strCD80minute,"CD"));
            list.add(new ItemList("DVD","DVD (1 layer, 1 side)",strDVD1layer1side,"DVD"));
            list.add(new ItemList("DVD","DVD (2 layer, 1 side)",strDVD2layer1side,"DVD"));
            list.add(new ItemList("DVD","DVD (1 layer, 2 side)",strDVD1layer2side,"DVD"));
            list.add(new ItemList("DVD","DVD (2 layer, 2 side)",strDVD2layer2side,"DVD"));




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
