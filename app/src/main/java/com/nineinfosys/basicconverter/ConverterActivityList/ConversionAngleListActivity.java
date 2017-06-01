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
import com.nineinfosys.basicconverter.Engin.AngleConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.ItemList;
import com.nineinfosys.basicconverter.Supporter.Settings;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversionAngleListActivity extends AppCompatActivity implements TextWatcher {

    List<ItemList> list = new ArrayList<ItemList>();
    private  String stringSpinnerFrom;
    private double doubleEdittextvalue;
    private EditText edittextConversionListvalue;
    private TextView textconversionFrom,textViewConversionShortform;
    View ChildView ;
    DecimalFormat formatter = null;
    private String strDegree = null;
    private String strRadian = null;
    private  String strGradian = null;
    private String strMinute = null;
    private  String strSecond = null;
    private  String strGon = null;
    private  String strSign = null;
    private  String strMil = null;
    private  String strRevolution = null;
    private  String strCircle = null;
    private String strTurn = null;
    private  String strQuadrant = null;
    private  String strRightangle = null;
    private String strSextant = null;

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
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#a05445")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#6e291d"));
        }

        //format of decimal pint
        formatsetting();

        MobileAds.initialize(ConversionAngleListActivity.this, getString(R.string.ads_app_id));
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

            case "Degree - °":
                textconversionFrom.setText("Degree");
                textViewConversionShortform.setText("°");
                break;
            case "Radian - rad":
                textconversionFrom.setText("Radian");
                textViewConversionShortform.setText("rad");
                break;
            case "Grad - ^g":
                textconversionFrom.setText("Grad");
                textViewConversionShortform.setText("^g");
                break;
            case "Minute - '":
                textconversionFrom.setText("Minute");
                textViewConversionShortform.setText("'");
                break;
            case "Second -  ″ ":
                textconversionFrom.setText("Second");
                textViewConversionShortform.setText("″");
                break;
            case "Gon - gon":
                textconversionFrom.setText("Gon");
                textViewConversionShortform.setText("gon");
                break;
            case "Sign - sign":
                textconversionFrom.setText("Sign");
                textViewConversionShortform.setText("sign");
                break;
            case "Mil - mil":
                textconversionFrom.setText("Mil");
                textViewConversionShortform.setText("mil");
                break;
            case "Revolution - r":
                textconversionFrom.setText("Revolution");
                textViewConversionShortform.setText("r");
                break;
            case "Circle - ∅":
                textconversionFrom.setText("Circle");
                textViewConversionShortform.setText("∅");
                break;
            case "Turn - turn":
                textconversionFrom.setText("Turn");
                textViewConversionShortform.setText("turn");
                break;
            case "Quadrant - 90°":
                textconversionFrom.setText("Quadrant");
                textViewConversionShortform.setText("90°");
                break;
            case "Right angle - 90°":
                textconversionFrom.setText("Right angle");
                textViewConversionShortform.setText("90°");
                break;
            case "Sextant - 60°":
                textconversionFrom.setText("Sextant");
                textViewConversionShortform.setText("60°");
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
        AngleConverter c = new AngleConverter(strSpinnerFrom,doubleEdittextvalue1);
        ArrayList<AngleConverter.ConversionResults> results = c.calculateAngleConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            AngleConverter.ConversionResults item = results.get(i);

            strDegree = String.valueOf(formatter.format(item.getDegree()));
            strRadian = String.valueOf(formatter.format(item.getRadian()));
            strGradian = String.valueOf(formatter.format(item.getGradian()));
            strMinute = String.valueOf(formatter.format(item.getMinute()));
            strSecond= String.valueOf(formatter.format(item.getSecond()));
            strGon = String.valueOf(formatter.format(item.getGon()));
            strSign = String.valueOf(formatter.format(item.getSign()));
            strMil = String.valueOf(formatter.format(item.getMil()));
            strRevolution = String.valueOf(formatter.format(item.getRevolution()));
            strCircle = String.valueOf(formatter.format(item.getCircle()));
            strTurn = String.valueOf(formatter.format(item.getTurn()));
            strQuadrant = String.valueOf(formatter.format(item.getQuadrant()));
            strRightangle= String.valueOf(formatter.format(item.getRightangle()));
            strSextant = String.valueOf(formatter.format(item.getSextant()));

            list.add(new ItemList("°","Degree",strDegree,"°"));
            list.add(new ItemList("rad","Radian",strRadian,"rad"));
            list.add(new ItemList("^g","Grad",strGradian,"^g"));
            list.add(new ItemList("'","Minute",strMinute,"'"));
            list.add(new ItemList("″","Second",strSecond,"″"));
            list.add(new ItemList("gon","Gon",strGon,"gon"));
            list.add(new ItemList("sign","Sign",strSign,"sign"));
            list.add(new ItemList("mil","Mil",strMil,"mil"));
            list.add(new ItemList("revolution","Revolution",strRevolution,"revolution"));
            list.add(new ItemList("∅","Circle",strCircle,"∅"));
            list.add(new ItemList("turn","Turn",strTurn,"turn"));
            list.add(new ItemList("90°","Quadrant",strQuadrant,"90°"));
            list.add(new ItemList("90°","Right angle",strRightangle,"90°"));
            list.add(new ItemList("60°","Sextant",strSextant,"60°"));



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

   /* private void creatPdf() {
        pdf();
        printhelper.printBitmap("Your list",bitmap);
    }

    private void shareIt() {
        pdf();
        Uri uri = Uri.fromFile(imageFile);
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("image*//*");
        String shareBody = "List of all Unit values.";
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "List of Units");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        sharingIntent.putExtra(Intent.EXTRA_STREAM, uri);
        startActivity(Intent.createChooser(sharingIntent, "Share via"));

    }

    private void pdf() {
        printhelper=new PrintHelper(ConversionAngleListActivity.this);
        printhelper.setScaleMode(PrintHelper.SCALE_MODE_FIT);
        Date now = new Date();
        android.text.format.DateFormat.format("yyyy-MM-dd_hh:mm:ss", now);
        // image naming and path  to include sd card  appending name you choose for file
        String mPath = Environment.getExternalStorageDirectory().toString() + "/" + now + ".JPEG";
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);
        RelativeLayout root = (RelativeLayout) inflater.inflate(R.layout.activity_conversion_list, null); //RelativeLayout is root view of my UI(xml) file.
        root.setDrawingCacheEnabled(true);

        bitmap= getBitmapFromView(this.getWindow().findViewById(R.id.relativelayout));
        imageFile = new File(mPath);
        try{
            FileOutputStream outputStream = new FileOutputStream(imageFile);
            // Toast.makeText(ConversionEnergyListActivity.this,"Image path : "+imageFile,Toast.LENGTH_LONG).show();
            int quality = 100;
            bitmap.compress(Bitmap.CompressFormat.JPEG, quality, outputStream);
            outputStream.flush();
            outputStream.close();

            // openScreenshot(imageFile);
        } catch (Throwable e) {
            // Several error may come out with file handling or OOM
            e.printStackTrace();
        }
    }

    //create bitmap from view and returns it
    private Bitmap getBitmapFromView(View view) {
        //Define a bitmap with the same size as the view
        Bitmap returnedBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(),Bitmap.Config.ARGB_8888);
        //Bind a canvas to it
        Canvas canvas = new Canvas(returnedBitmap);
        //Get the view's background
        Drawable bgDrawable =view.getBackground();
        if (bgDrawable!=null) {
            //has background drawable, then draw it on the canvas
            bgDrawable.draw(canvas);
        }   else{
            //does not have background drawable, then draw white background on the canvas
            canvas.drawColor(Color.WHITE);
        }
        // draw the view on the canvas
        view.draw(canvas);
        //return the bitmap
        return returnedBitmap;
    }*/
}
