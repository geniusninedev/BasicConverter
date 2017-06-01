package com.nineinfosys.basicconverter.ConverterActivity;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.nineinfosys.basicconverter.ConverterActivityList.ConversionAreaListActivity;
import com.nineinfosys.basicconverter.Engin.AreaConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class AreaActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher  {

    //declaration of designing tools
    private Spinner spinnerConvertFrom,spinnerConvertTo;
    private EditText editTextValue,editTextValueTo;

    private FloatingActionButton buttonList,buttonShare,buttonMail,buttonCopy;
    private SwitchCompat switchChangeType;
    private List<String> listFirstAreaTo,listAreaFirstfrom,listAreafrom,listAreaTo;
    private String stringSpinnerFrom,stringSpinnerTo;
    private TextView textViewBasicUnit,textViewAllUnit,textViewConvert;
    double doubleEdittextvalue=1.0;
    private int basicunit=10;
    private int allunit=39;
    private DecimalFormat formatter = null;
    private static final int REQUEST_CODE = 100;

    AreaConverter.ConversionResults item;
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
        setContentView(R.layout.layout_converter);

    //customize toolbar

    getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#7e57c2")));
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    getSupportActionBar().setHomeButtonEnabled(true);
    getSupportActionBar().setTitle("Area ");


    formatsetting();

        MobileAds.initialize(AreaActivity.this, getString(R.string.ads_app_id));
        AdView mAdView = (AdView) findViewById(R.id.adViewUnitConverter);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
     //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

    //initalization of tools and variables
    spinnerConvertFrom=(Spinner)findViewById(R.id.spinnerConvertFrom);
    spinnerConvertTo=(Spinner)findViewById(R.id.spinnerConvertTo);
    textViewBasicUnit=(TextView)findViewById(R.id.textViewBasicUnit);
    textViewAllUnit=(TextView)findViewById(R.id.textViewAllUnit);
    editTextValue=(EditText)findViewById(R.id.edittextFrom);
    editTextValueTo=(EditText)findViewById(R.id.edittextTo);
    textViewConvert=(TextView) findViewById(R.id.buttonUnitConverter);
    buttonCopy=(FloatingActionButton)findViewById(R.id.button_copy);
    buttonList=(FloatingActionButton) findViewById(R.id.button_list_fullreport);
    buttonShare=(FloatingActionButton)findViewById(R.id.button_list_share);
    buttonMail=(FloatingActionButton)findViewById(R.id.button_list_mail);
    switchChangeType=(SwitchCompat)findViewById(R.id.switchButton);


        //setting button color dynamically
        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorViolet)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorViolet)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorViolet)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorViolet)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textViewConvert.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorViolet)));
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#65499c"));
        }

        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()),ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorViolet)));
        textViewBasicUnit.setText(String.valueOf("Basic Units("+basicunit+")"));
        textViewAllUnit.setText(String.valueOf("All Units("+allunit+")"));


    //adding value to spinner
    listAreaFirstfrom = new ArrayList<String>();
    listFirstAreaTo = new ArrayList<String>();


    //for first time running spinner
        listAreaFirstfrom.add("Square Meter -  m²");
        listAreaFirstfrom.add("Square Kilometer - km²");
        listAreaFirstfrom.add("Square Centimeter - cm²");
        listAreaFirstfrom.add("Square Millimeter -  mm²");
        listAreaFirstfrom.add("Hectares - ha");
        listAreaFirstfrom.add("Acre - ac");
        listAreaFirstfrom.add("Square Mile -  mi²");
        listAreaFirstfrom.add("Square Yard - yd²");
        listAreaFirstfrom.add("Square Foot - ft²");
        listAreaFirstfrom.add("Square Inch - in²");



        listFirstAreaTo.add("Square Meter -  m²");
        listFirstAreaTo.add("Square Kilometer - km²");
        listFirstAreaTo.add("Square Centimeter - cm²");
        listFirstAreaTo.add("Square Millimeter -  mm²");
        listFirstAreaTo.add("Hectares - ha");
        listFirstAreaTo.add("Acre - ac");
        listFirstAreaTo.add("Square Mile -  mi²");
        listFirstAreaTo.add("Square Yard - yd²");
        listFirstAreaTo.add("Square Foot - ft²");
        listFirstAreaTo.add("Square Inch - in²");

    // Creating adapter for spinner
    ArrayAdapter<String> Adapter = new ArrayAdapter<String>(AreaActivity.this,android.R.layout.simple_spinner_item, listAreaFirstfrom);
    ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(AreaActivity.this,android.R.layout.simple_spinner_item, listFirstAreaTo);


    // Drop down layout style - list view with radio button
        Adapter.setDropDownViewResource(android.R.layout.simple_list_item_checked);
        AdapterTempTo.setDropDownViewResource(android.R.layout.simple_list_item_checked);

    // attaching data adapter to spinner
        spinnerConvertFrom.setAdapter(Adapter);
        spinnerConvertTo.setAdapter(AdapterTempTo);

    //switch converttype
        switchChangeType.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            listAreafrom = new ArrayList<String>();
            listAreaTo = new ArrayList<String>();
            String stringSwitchSate=String.valueOf(isChecked);
            String strBasic="Basic";
            String strAdvance="All";
            switch(stringSwitchSate)
            {

                case "false":
                    Snackbar.make(buttonView, "You switched to "+strBasic+" Units", Snackbar.LENGTH_LONG).setAction("ACTION",null).show();
                    listAreafrom.clear();
                    listAreaTo.clear();
                    listAreafrom.add("Square Meter -  m²");
                    listAreafrom.add("Square Kilometer - km²");
                    listAreafrom.add("Square Centimeter - cm²");
                    listAreafrom.add("Square Millimeter -  mm²");
                    listAreafrom.add("Hectares - ha");
                    listAreafrom.add("Acre - ac");
                    listAreafrom.add("Square Mile -  mi²");
                    listAreafrom.add("Square Yard - yd²");
                    listAreafrom.add("Square Foot - ft²");
                    listAreafrom.add("Square Inch - in²");

                    //2 spinner
                    listAreaTo.add("Square Meter -  m²");
                    listAreaTo.add("Square Kilometer - km²");
                    listAreaTo.add("Square Centimeter - cm²");
                    listAreaTo.add("Square Millimeter -  mm²");
                    listAreaTo.add("Hectares - ha");
                    listAreaTo.add("Acre - ac");
                    listAreaTo.add("Square Mile -  mi²");
                    listAreaTo.add("Square Yard - yd²");
                    listAreaTo.add("Square Foot - ft²");
                    listAreaTo.add("Square Inch - in²");
                    break;

                case "true":
                    Snackbar.make(buttonView, "You switched to "+strAdvance+" Units", Snackbar.LENGTH_LONG).setAction("ACTION",null).show();
                    listAreafrom.clear();
                    listAreaTo.clear();
                    listAreafrom.add("Square Meter -  m²");
                    listAreafrom.add("Square Kilometer - km²");
                    listAreafrom.add("Square Centimeter - cm²");
                    listAreafrom.add("Square Millimeter -  mm²");
                    listAreafrom.add("Hectares - ha");
                    listAreafrom.add("Acre - ac");
                    listAreafrom.add("Square Mile -  mi²");
                    listAreafrom.add("Square Yard - yd²");
                    listAreafrom.add("Square Foot - ft²");
                    listAreafrom.add("Square Inch - in²");

                    listAreafrom.add("Square Micrometer -  μm²");
                    listAreafrom.add("Square Hectometer - hm²");
                    listAreafrom.add("Square Dekameter - dam²");
                    listAreafrom.add("Square Decimeter -  dm²");
                    listAreafrom.add("Nanometer - nm²");
                    listAreafrom.add("Are - a");
                    listAreafrom.add("Barn -  b");
                    listAreafrom.add("Square Mile (US survey)");
                    listAreafrom.add("Square Foot (US survey)");
                    listAreafrom.add("Circular Inch ");

                    listAreafrom.add("Township");
                    listAreafrom.add("Section");
                    listAreafrom.add("Acre(US survey) - ac");
                    listAreafrom.add("Rood");
                    listAreafrom.add("Square Chain - ch²");
                    listAreafrom.add("Square rod");
                    listAreafrom.add("Square rod (US survey)");
                    listAreafrom.add("Square Perch ");
                    listAreafrom.add("Square Pole ");
                    listAreafrom.add("Square Mil - mil² ");

                    listAreafrom.add("Cirular Mil");
                    listAreafrom.add("Homestead");
                    listAreafrom.add("Sabin");
                    listAreafrom.add("Arpent");
                    listAreafrom.add("Cuerda");
                    listAreafrom.add("Plaza");
                    listAreafrom.add("Varas Castellanas Cuad");
                    listAreafrom.add("Varas Conuqueras Cuad");
                    listAreafrom.add("Electron Cross Section ");


                    //second spinner
                    listAreaTo.add("Square Meter -  m²");
                    listAreaTo.add("Square Kilometer - km²");
                    listAreaTo.add("Square Centimeter - cm²");
                    listAreaTo.add("Square Millimeter -  mm²");
                    listAreaTo.add("Hectares - ha");
                    listAreaTo.add("Acre - ac");
                    listAreaTo.add("Square Mile -  mi²");
                    listAreaTo.add("Square Yard - yd²");
                    listAreaTo.add("Square Foot - ft²");
                    listAreaTo.add("Square Inch - in²");

                    listAreaTo.add("Square Micrometer -  μm²");
                    listAreaTo.add("Square Hectometer - hm²");
                    listAreaTo.add("Square Dekameter - dam²");
                    listAreaTo.add("Square Decimeter -  dm²");
                    listAreaTo.add("Nanometer - nm²");
                    listAreaTo.add("Are - a");
                    listAreaTo.add("Barn -  b");
                    listAreaTo.add("Square Mile (US survey)");
                    listAreaTo.add("Square Foot (US survey)");
                    listAreaTo.add("Circular Inch ");

                    listAreaTo.add("Township");
                    listAreaTo.add("Section");
                    listAreaTo.add("Acre(US survey) - ac");
                    listAreaTo.add("Rood");
                    listAreaTo.add("Square Chain - ch²");
                    listAreaTo.add("Square rod");
                    listAreaTo.add("Square rod (US survey)");
                    listAreaTo.add("Square Perch ");
                    listAreaTo.add("Square Pole ");
                    listAreaTo.add("Square Mil - mil² ");

                    listAreaTo.add("Cirular Mil");
                    listAreaTo.add("Homestead");
                    listAreaTo.add("Sabin");
                    listAreaTo.add("Arpent");
                    listAreaTo.add("Cuerda");
                    listAreaTo.add("Plaza");
                    listAreaTo.add("Varas Castellanas Cuad");
                    listAreaTo.add("Varas Conuqueras Cuad");
                    listAreaTo.add("Electron Cross Section ");

                    break;
            }
            // Creating adapter for spinner
            ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(AreaActivity.this,android.R.layout.simple_spinner_item, listAreafrom);
            ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(AreaActivity.this,android.R.layout.simple_spinner_item, listAreaTo);


            // Drop down layout style - list view with radio button
            Adapter2.setDropDownViewResource(android.R.layout.simple_list_item_checked);
            AdapterTempTo2.setDropDownViewResource(android.R.layout.simple_list_item_checked);

            // attaching data adapter to spinner
            spinnerConvertFrom.setAdapter(Adapter2);
            spinnerConvertTo.setAdapter(AdapterTempTo2);


        }
    });

        editTextValue.addTextChangedListener(this);
        buttonList.setOnClickListener(this);
        buttonShare.setOnClickListener(this);
        buttonMail.setOnClickListener(this);
        buttonCopy.setOnClickListener(this);
        textViewConvert.setOnClickListener(this);


        spinnerConvertFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            if(editTextValue.getText().toString().trim().equals(""))
            {
                Snackbar.make(adapterView, "Provide Unit Value for Conversion", Snackbar.LENGTH_LONG).setAction("ACTION",null).show();
            }
            else
            {
                doubleEdittextvalue = Double.parseDouble(editTextValue.getText().toString().trim());
                stringSpinnerFrom = spinnerConvertFrom.getSelectedItem().toString().trim();
                stringSpinnerTo = spinnerConvertTo.getSelectedItem().toString().trim();

                calcualteValue(stringSpinnerFrom, stringSpinnerTo, doubleEdittextvalue);
            }

        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    });

        spinnerConvertTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            if(editTextValue.getText().toString().trim().equals(""))
            {
                Snackbar.make(adapterView, "Provide Unit Value for Conversion", Snackbar.LENGTH_LONG).setAction("ACTION",null).show();
            }
            else {
                doubleEdittextvalue = Double.parseDouble(editTextValue.getText().toString().trim());
                stringSpinnerFrom = spinnerConvertFrom.getSelectedItem().toString().trim();
                stringSpinnerTo = spinnerConvertTo.getSelectedItem().toString().trim();

                calcualteValue(stringSpinnerFrom, stringSpinnerTo, doubleEdittextvalue);
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    });




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


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.buttonUnitConverter:
                //switch spinner value
                int spinner1Index = spinnerConvertFrom.getSelectedItemPosition();
                spinnerConvertFrom.setSelection(spinnerConvertTo.getSelectedItemPosition());
                spinnerConvertTo.setSelection(spinner1Index );
                break;

            case R.id.button_list_fullreport:
                doubleEdittextvalue= Double.parseDouble(editTextValue.getText().toString().trim());
                Intent i=new Intent(this,ConversionAreaListActivity.class);
                i.putExtra("stringSpinnerFrom", stringSpinnerFrom);
                i.putExtra("doubleEdittextvalue", doubleEdittextvalue);
                startActivity(i);
                break;

            case R.id.button_copy:
                String text= editTextValueTo.getText().toString().trim();
                android.content.ClipboardManager clipboardMgr = (android.content.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Copied text", text);
                clipboardMgr.setPrimaryClip(clip);
                Snackbar.make(v, "Conversion Value Copied", Snackbar.LENGTH_LONG).setAction("ACTION",null).show();
                break;

            case R.id.button_list_share:
                String textTo= editTextValueTo.getText().toString().trim();
                String textFrom= editTextValueTo.getText().toString().trim();

                String shareMessage=textFrom+" "+stringSpinnerFrom+": "+textTo+" "+stringSpinnerTo;

                try {
                    Intent share = new Intent();
                    share.setAction("android.intent.action.SEND");
                    share.setType("text/plain");
                    share.putExtra("android.intent.extra.TEXT",shareMessage);
                    startActivity(Intent.createChooser(share, ""));

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            case R.id.button_list_mail:
                String textmailTo= editTextValueTo.getText().toString().trim();
                String textmailFrom= editTextValueTo.getText().toString().trim();
                String message= textmailTo+" "+stringSpinnerFrom+" :  "+textmailFrom+"  "+stringSpinnerTo;
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{ });
                email.putExtra(Intent.EXTRA_SUBJECT, "Conversion Details");
                email.putExtra(Intent.EXTRA_TEXT,message );
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Select Email Client"));
                break;

        }

    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

        try {

            doubleEdittextvalue = Double.parseDouble(editTextValue.getText().toString().trim());
            stringSpinnerFrom = spinnerConvertFrom.getSelectedItem().toString().trim();
            stringSpinnerTo = spinnerConvertTo.getSelectedItem().toString().trim();
            calcualteValue(stringSpinnerFrom,stringSpinnerTo,doubleEdittextvalue);

            //   Toast.makeText(this, "string12" + stringSpinnerFrom + "\n string13" + stringSpinnerTo + "string14" + doubleEdittextvalue, Toast.LENGTH_LONG).show();
        }
        catch (NumberFormatException e) {
            doubleEdittextvalue = 0;

        }


    }
    public void calcualteValue(String strSpinnerFromvalue1,String strSpinnerTovalue2,double doubleEdittextvalue1)
    {


        try {

            AreaConverter c = new AreaConverter(strSpinnerFromvalue1,doubleEdittextvalue1);
            ArrayList<AreaConverter.ConversionResults> results = c.calculateAreaConversion();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);

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


                switch(strSpinnerFromvalue1) {
                    case "Square Meter -  m²":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Square Kilometer - km²":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Square Centimeter - cm²":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Square Millimeter -  mm²":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Hectares - ha":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Acre - ac":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Square Mile -  mi²":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Square Yard - yd²":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Square foot - ft²":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Square Inch - in²":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Square Micrometer -  μm²":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Square Hectometer - hm²":
                        conversion(strSpinnerTovalue2);
                        break;


                    case "Square Dekameter - dam²":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Square Decimeter -  dm²":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Nanometer - nm²":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Are - a":
                        conversion(strSpinnerTovalue2);
                        break;


                    case "Barn -  b":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Square Mile (US survey)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Square foot (US survey)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Circular Inch":
                        conversion(strSpinnerTovalue2);
                        break;


                    case "Township":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Section":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Acre(US survey) - ac":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Rood":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Square Chain - ch²":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Square rod":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Square rod (US survey)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Square Perch ":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Square Pole ":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Square Mil - mil² ":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Cirular Mil":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Homestead":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Sabin":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Arpent":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Cuerda":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Plaza":
                        conversion(strSpinnerTovalue2);
                        break;


                    case "Varas Castellanas Cuad":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Varas Conuqueras Cuad":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Electron Cross Section ":
                        conversion(strSpinnerTovalue2);
                        break;
                }


            }


        }
        catch (NumberFormatException e) {
            doubleEdittextvalue = 0;

        }

    }

    private void conversion(String strSpinnerTovalue2) {
        switch (strSpinnerTovalue2) {
            case "Square Meter -  m²":
                editTextValueTo.setText(strSquareMeter);
                break;
            case "Square Kilometer - km²":
                editTextValueTo.setText(strSquareKilometer);
                break;
            case "Square Centimeter - cm²":
                editTextValueTo.setText(strSquareCentimeter);
                break;
            case "Square Millimeter -  mm²":
                editTextValueTo.setText(strSquareMilimeter);
                break;
            case "Hectares - ha":
                editTextValueTo.setText(strHectares);
                break;
            case "Acre - ac":
                editTextValueTo.setText(strAcre);
                break;
            case "Square Mile -  mi²":
                editTextValueTo.setText(strSquareMile);
                break;
            case "Square Yard - yd²":
                editTextValueTo.setText(strSquareYard);
                break;
            case "Square foot - ft²":
                editTextValueTo.setText(strSquareFoot);
                break;
            case "Square Inch - in²":
                editTextValueTo.setText(strSquareInch);
                break;



            case "Square Micrometer -  μm²":
                editTextValueTo.setText(strSquareMicrometer);
                break;
            case "Square Hectometer - hm²":
                editTextValueTo.setText(strSquareHectometer);
                break;
            case "Square Dekameter - dam²":
                editTextValueTo.setText(strSquareDeckameter);
                break;
            case "Square Decimeter -  dm²":
                editTextValueTo.setText(strSquareDecimeter);
                break;
            case "Nanometer - nm²":
                editTextValueTo.setText(strNanometer);
                break;
            case "Are - a":
                editTextValueTo.setText(strAre);
                break;
            case "Barn -  b":
                editTextValueTo.setText(strBarn);
                break;
            case "Square Mile (US survey)":
                editTextValueTo.setText(strSquareMileus);
                break;
            case "Square foot (US survey)":
                editTextValueTo.setText(strSquarefootus);
                break;
            case "Circular Inch":
                editTextValueTo.setText(strCircularinch);
                break;



            case "Township":
                editTextValueTo.setText(strTownship);
                break;
            case "Section":
                editTextValueTo.setText(strSection);
                break;
            case "Acre(US survey) - ac":
                editTextValueTo.setText(strAcreus);
                break;
            case "Rood":
                editTextValueTo.setText(strRood);
                break;
            case "Square Chain - ch²":
                editTextValueTo.setText(strSquareChain);
                break;
            case "Square rod":
                editTextValueTo.setText(strSquarerod);
                break;
            case "Square rod (US survey)":
                editTextValueTo.setText(strSquarerodus);
                break;
            case "Square Perch ":
                editTextValueTo.setText(strSquarePerch);
                break;
            case "Square Pole ":
                editTextValueTo.setText(strSquarePole);
                break;
            case "Square Mil - mil² ":
                editTextValueTo.setText(strSquareMil);
                break;


            case "Cirular Mil":
                editTextValueTo.setText(strCircularmil);
                break;
            case "Homestead":
                editTextValueTo.setText(strHomestead);
                break;
            case "Sabin":
                editTextValueTo.setText(strSabin);
                break;
            case "Arpent":
                editTextValueTo.setText(strArpent);
                break;
            case "Cuerda":
                editTextValueTo.setText(strCuerda);
                break;
            case "Plaza":
                editTextValueTo.setText(strPlaza);
                break;
            case "Varas Castellanas Cuad":
                editTextValueTo.setText(strVarasCastellanas);
                break;
            case "Varas Conuqueras Cuad":
                editTextValueTo.setText(strVarasConuqueras);
                break;
            case "Electron Cross Section ":
                editTextValueTo.setText(strElectroncrosssection);
                break;





        }
    }

    @Override
    public void afterTextChanged(Editable s) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == android.R.id.home) {

            this.finish();
        }

        return super.onOptionsItemSelected(item);
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