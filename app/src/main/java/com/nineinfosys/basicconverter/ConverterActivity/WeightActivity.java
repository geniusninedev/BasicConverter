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
import com.nineinfosys.basicconverter.ConverterActivityList.ConversionWeightListActivity;
import com.nineinfosys.basicconverter.Engin.WeightConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class WeightActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher  {

    //declaration of designing tools
    private Spinner spinnerConvertFrom,spinnerConvertTo;
    private EditText editTextValue,editTextValueTo;

    private FloatingActionButton buttonList,buttonShare,buttonMail,buttonCopy;
    private SwitchCompat switchChangeType;
    private List<String> listFirstWeightTo,listWeightFirstfrom,listWeightfrom,listWeightTo;
    private String stringSpinnerFrom,stringSpinnerTo;
    private TextView textViewBasicUnit,textViewAllUnit,textViewConvert;
    private double doubleEdittextvalue=1.0;
    private int basicunit=9;
    private int allunit=70;
    private static final int REQUEST_CODE = 100;
    DecimalFormat formatter = null;

    WeightConverter.ConversionResults item;

     private String strKilogram = null,strGram = null,strMilligram = null,strTonmetric= null,strPound = null,strOunce = null, strCarat = null,strTonshort = null,strTonlong = null,strAtomicmassunit = null,
    strExagram = null,strPetagram = null,strTeragram = null,strGigagram = null,strMegagram = null,strHectogram = null,strDekagram = null,strDecigram = null,strCentigram = null,strMicrogram = null,strNanogram = null,
             strPicogram = null,strFemtogram = null,strAttogram= null;
  

    private String strDalton = null;
    private String strKilogramforcesquaresecondpermeter = null;
    private String strPoundforcesquaresecondperfoot = null;

    private String strKilopound = null;
    private String strKip = null;
    private String strslug = null;

    private String strPoundtroy = null;
    private String strPoundal = null;
    private String strTonus = null;
    private String strTonuk = null;
    private String strKiloton = null;
    private String strQuintal = null;
    private String strHundredweightus = null;

    private String strHundredweightuk = null;
    private String strQuarterus = null;

    private String strQuarteruk = null;
    private String strStoneus = null;
    private String strStoneuk = null;

    private String strTonne = null;
    private String strPennyweight= null;
    private String strScruple = null;

    private String strGrain= null;
    private String strGamma = null;
    private String strTalent = null;

    private String strMina = null;
    private String strShekel = null;
    private String strBekan = null;

    private String strGerah = null;
    private String strTalentbiblicalgreek = null;
    private String strMinabiblicalgreek = null;

    private String strTetradrachmabiblicalgreek = null;
    private String strDidrachmabiblicalgreek = null;
    private String strDrachmabiblicalgreek = null;

    private String strDenariusbiblicalroman= null;
    private String strAssarionbiblicalroman = null;
    private String strQuadransbiblicalroman = null;

    private String strLeptonbiblicalroman = null;
    private String strPlanckmass = null;
    private String strElectronmass = null;

    private String strMuonmass = null;
    private String strProtonmass = null;
    private String strNeutronmass = null;


    private String strDeuteronmass = null;
    private String strEarthmass = null;
    private String strSunmass = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);

        //customize toolbar
 /*   android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.app_bar);
    setSupportActionBar(toolbar);*/
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#757575")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Weight ");


        formatsetting();

        MobileAds.initialize(WeightActivity.this, getString(R.string.ads_app_id));
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
        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorBlack)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorBlack)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorBlack)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorBlack)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textViewConvert.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorBlack)));
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#494949"));
        }

        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()),ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorBlack)));
        textViewBasicUnit.setText(String.valueOf("Basic Units("+basicunit+")"));
        textViewAllUnit.setText(String.valueOf("All Units("+allunit+")"));


        //adding value to spinner
        listWeightFirstfrom = new ArrayList<String>();
        listFirstWeightTo = new ArrayList<String>();


        //for first time running spinner
        listWeightFirstfrom.add("Kilogram -  kg");
        listWeightFirstfrom.add("Pound - lbs");
        listWeightFirstfrom.add("Gram - g");
        listWeightFirstfrom.add("Ounce - oz");
        listWeightFirstfrom.add("Carat - ct");
        listWeightFirstfrom.add("Milligram - mg");
        listWeightFirstfrom.add("Microgram - μg");
        listWeightFirstfrom.add("Ton - t");
        listWeightFirstfrom.add("Atomic mass unit - u");


        //2 spinner
        listFirstWeightTo.add("Kilogram -  kg");
        listFirstWeightTo.add("Pound - lbs");
        listFirstWeightTo.add("Gram - g");
        listFirstWeightTo.add("Ounce - oz");
        listFirstWeightTo.add("Carat - ct");
        listFirstWeightTo.add("Milligram - mg");
        listFirstWeightTo.add("Microgram - μg");
        listFirstWeightTo.add("Ton - t");
        listFirstWeightTo.add("Atomic mass unit - u");

        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(WeightActivity.this,android.R.layout.simple_spinner_item, listWeightFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(WeightActivity.this,android.R.layout.simple_spinner_item, listFirstWeightTo);


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

                listWeightfrom = new ArrayList<String>();
                listWeightTo = new ArrayList<String>();
                String stringSwitchSate=String.valueOf(isChecked);
                String strBasic="Basic";
                String strAdvance="All";
                switch(stringSwitchSate)
                {

                    case "false":
                        Snackbar.make(buttonView, "You switched to "+strBasic+" Units", Snackbar.LENGTH_LONG).setAction("ACTION",null).show();
                        listWeightfrom.clear();
                        listWeightTo.clear();
                        listWeightfrom.add("Kilogram -  kg");
                        listWeightfrom.add("Pound - lbs");
                        listWeightfrom.add("Gram - g");
                        listWeightfrom.add("Ounce - oz");
                        listWeightfrom.add("Carat - ct");
                        listWeightfrom.add("Milligram - mg");
                        listWeightfrom.add("Microgram - μg");
                        listWeightfrom.add("Ton - t");
                        listWeightfrom.add("Atomic mass unit - u");


                        //2 spinner
                        listWeightTo.add("Kilogram -  kg");
                        listWeightTo.add("Pound - lbs");
                        listWeightTo.add("Gram - g");
                        listWeightTo.add("Ounce - oz");
                        listWeightTo.add("Carat - ct");
                        listWeightTo.add("Milligram - mg");
                        listWeightTo.add("Microgram - μg");
                        listWeightTo.add("Ton - t");
                        listWeightTo.add("Atomic mass unit - u");
                        break;

                    case "true":
                        Snackbar.make(buttonView, "You switched to "+strAdvance+" Units", Snackbar.LENGTH_LONG).setAction("ACTION",null).show();
                        listWeightfrom.clear();
                        listWeightTo.clear();

                        listWeightfrom.add("Kilogram -  kg");
                        listWeightfrom.add("Gram - g");
                        listWeightfrom.add("Milligram - mg");
                        listWeightfrom.add("Ton - t");
                        listWeightfrom.add("Pound - lbs");
                        listWeightfrom.add("Ounce - oz");
                        listWeightfrom.add("Carat - ct");
                        listWeightfrom.add("Ton short US - ton");
                        listWeightfrom.add("Ton long UK - ton");
                        listWeightfrom.add("Atomic mass unit - u");

                        listWeightfrom.add("Exagram -  Eg");
                        listWeightfrom.add("Petagram - Pg");
                        listWeightfrom.add("Teragram - Tg");
                        listWeightfrom.add("Gigagram -  Gg");
                        listWeightfrom.add("Megagram - Mg");
                        listWeightfrom.add("Hectogram - hg");
                        listWeightfrom.add("Dekagram -  dag");
                        listWeightfrom.add("Decigram - dg");
                        listWeightfrom.add("Centigram - cg");
                        listWeightfrom.add("Microgram - μg");

                        listWeightfrom.add("Nanogram  - ng");
                        listWeightfrom.add("Picogram -  pg");
                        listWeightfrom.add("Femtogram - fg");
                        listWeightfrom.add("Attogram - ag");
                        listWeightfrom.add("Dalton - dt");
                        listWeightfrom.add("Kilogram-force square second/meter - kg F sq s m- 1");
                        listWeightfrom.add("Kilopound - kip");
                        listWeightfrom.add("Kip - kip ");
                        listWeightfrom.add("Slug - slug ");
                        listWeightfrom.add("Pound-force square second/foot - lb F sq s ft-1 ");

                        listWeightfrom.add("Pound (troy or apothecary) - lb");
                        listWeightfrom.add("Poundal - pdl");
                        listWeightfrom.add("Ton (assay) (UK) - AT)");
                        listWeightfrom.add("Ton (assay) (US) - AT)");
                        listWeightfrom.add("Kiloton (metric) - kt");
                        listWeightfrom.add("Qunital (metric) -  cwt");
                        listWeightfrom.add("Hundredweight (US) - hwt ");
                        listWeightfrom.add("Hundredweight (UK) - hwt");
                        listWeightfrom.add("Quarter (US) - qr ");

                        listWeightfrom.add("Quarter (UK) - qr ");
                        listWeightfrom.add("Stone (US) - st");
                        listWeightfrom.add("Stone (UK) - st");
                        listWeightfrom.add("Sonne - t");
                        listWeightfrom.add("Pennyweight - pwt");
                        listWeightfrom.add("Scruple (apothecary)- s.ap");
                        listWeightfrom.add("Grain - gr");
                        listWeightfrom.add("Gamma - gamma");
                        listWeightfrom.add("Talent (Biblical Hebrew) - talent ");

                        listWeightfrom.add("Mina (Biblical Hebrew) - mina");
                        listWeightfrom.add("Shekal (Biblical Hebrew) - shekal");
                        listWeightfrom.add("Bekan (Biblical Hebrew) - bekan");
                        listWeightfrom.add("Gereh (Biblical Hebrew) - gereh");
                        listWeightfrom.add("Talent (Biblical Greek) - talent");
                        listWeightfrom.add("Mina (Biblical Greek) - mina ");
                        listWeightfrom.add("Tetradrachma (Biblical Greek) - tetd");
                        listWeightfrom.add("Didrachma (Biblical Greek) - didrachma");
                        listWeightfrom.add("Drachma (Biblical Greek) - drachma ");

                        listWeightfrom.add("Denarius (Biblical Roman) - denarius");
                        listWeightfrom.add("Assarion (Biblical Roman) - assarion");
                        listWeightfrom.add("Quadrans (Biblical Roman) -  quadranns" );
                        listWeightfrom.add("Lepton (Biblical Roman) - lepton");
                        listWeightfrom.add("Planck mass - Planck mass");
                        listWeightfrom.add("Electron mass (rest) -  e-");
                        listWeightfrom.add("Muon mass - M");
                        listWeightfrom.add("Proton mass - p");
                        listWeightfrom.add("Neutron mass - n ");

                        listWeightfrom.add("Deuteron mass - D");
                        listWeightfrom.add("Earth's mass - Earth");
                        listWeightfrom.add("Sun mass - Sun");



                        //second spinner
                        listWeightTo.add("Kilogram -  kg");
                        listWeightTo.add("Gram - g");
                        listWeightTo.add("Milligram - mg");
                        listWeightTo.add("Ton - t");
                        listWeightTo.add("Pound - lbs");
                        listWeightTo.add("Ounce - oz");
                        listWeightTo.add("Carat - ct");
                        listWeightTo.add("Ton short US - ton");
                        listWeightTo.add("Ton long UK - ton");
                        listWeightTo.add("Atomic mass unit - u");

                        listWeightTo.add("Exagram -  Eg");
                        listWeightTo.add("Petagram - Pg");
                        listWeightTo.add("Teragram - Tg");
                        listWeightTo.add("Gigagram -  Gg");
                        listWeightTo.add("Megagram - Mg");
                        listWeightTo.add("Hectogram - hg");
                        listWeightTo.add("Dekagram -  dag");
                        listWeightTo.add("Decigram - dg");
                        listWeightTo.add("Centigram - cg");
                        listWeightTo.add("Microgram - μg");

                        listWeightTo.add("Nanogram  - ng");
                        listWeightTo.add("Picogram -  pg");
                        listWeightTo.add("Femtogram - fg");
                        listWeightTo.add("Attogram - ag");
                        listWeightTo.add("Dalton - dt");
                        listWeightTo.add("Kilogram-force square second/meter - kg F sq s m- 1");
                        listWeightTo.add("Kilopound - kip");
                        listWeightTo.add("Kip - kip ");
                        listWeightTo.add("Slug - slug ");
                        listWeightTo.add("Pound-force square second/foot - lb F sq s ft-1 ");

                        listWeightTo.add("Pound (troy or apothecary) - lb");
                        listWeightTo.add("Poundal - pdl");
                        listWeightTo.add("Ton (assay) (UK) - AT)");
                        listWeightTo.add("Ton (assay) (US) - AT)");
                        listWeightTo.add("Kiloton (metric) - kt");
                        listWeightTo.add("Qunital (metric) -  cwt");
                        listWeightTo.add("Hundredweight (US) - hwt ");
                        listWeightTo.add("Hundredweight (UK) - hwt");
                        listWeightTo.add("Quarter (US) - qr ");

                        listWeightTo.add("Quarter (UK) - qr ");
                        listWeightTo.add("Stone (US) - st");
                        listWeightTo.add("Stone (UK) - st");
                        listWeightTo.add("Sonne - t");
                        listWeightTo.add("Pennyweight - pwt");
                        listWeightTo.add("Scruple (apothecary)- s.ap");
                        listWeightTo.add("Grain - gr");
                        listWeightTo.add("Gamma - gamma");
                        listWeightTo.add("Talent (Biblical Hebrew) - talent ");

                        listWeightTo.add("Mina (Biblical Hebrew) - mina");
                        listWeightTo.add("Shekal (Biblical Hebrew) - shekal");
                        listWeightTo.add("Bekan (Biblical Hebrew) - bekan");
                        listWeightTo.add("Gereh (Biblical Hebrew) - gereh");
                        listWeightTo.add("Talent (Biblical Greek) - talent");
                        listWeightTo.add("Mina (Biblical Greek) - mina ");
                        listWeightTo.add("Tetradrachma (Biblical Greek) - tetd");
                        listWeightTo.add("Didrachma (Biblical Greek) - didrachma");
                        listWeightTo.add("Drachma (Biblical Greek) - drachma ");

                        listWeightTo.add("Denarius (Biblical Roman) - denarius");
                        listWeightTo.add("Assarion (Biblical Roman) - assarion");
                        listWeightTo.add("Quadrans (Biblical Roman) -  quadranns" );
                        listWeightTo.add("Lepton (Biblical Roman) - lepton");
                        listWeightTo.add("Planck mass - Planck mass");
                        listWeightTo.add("Electron mass (rest) -  e-");
                        listWeightTo.add("Muon mass - M");
                        listWeightTo.add("Proton mass - p");
                        listWeightTo.add("Neutron mass - n ");

                        listWeightTo.add("Deuteron mass - D");
                        listWeightTo.add("Earth's mass - Earth");
                        listWeightTo.add("Sun mass - Sun");


                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(WeightActivity.this,android.R.layout.simple_spinner_item, listWeightfrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(WeightActivity.this,android.R.layout.simple_spinner_item, listWeightTo);


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
    /*  @Override
      protected void onRestart() {

          // TODO Auto-generated method stub
          super.onRestart();
          Intent i = new Intent(AreaActivity.this, AreaActivity.class);  //your class
          startActivity(i);
          finish();

      }*/
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
                Intent i=new Intent(this,ConversionWeightListActivity.class);
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

            WeightConverter c = new WeightConverter(strSpinnerFromvalue1,doubleEdittextvalue1);
            ArrayList<WeightConverter.ConversionResults> results = c.calculateWeightConversion();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);

                strKilogram = String.valueOf(formatter.format(item. getKilogram()));
                strGram = String.valueOf(formatter.format(item.getGram()));
                strMilligram = String.valueOf(formatter.format(item.getMilligram()));
                strTonmetric = String.valueOf(formatter.format(item.getTonmetric()));
                strPound = String.valueOf(formatter.format(item.getPound()));
                strOunce = String.valueOf(formatter.format(item.getOunce()));
               strCarat = String.valueOf(formatter.format(item.getCarat()));
                strTonshort = String.valueOf(formatter.format(item.getTonshort()));
                strTonlong = String.valueOf(formatter.format(item.getTonlong()));
                strAtomicmassunit = String.valueOf(formatter.format(item.getAtomicmassunit()));

                strExagram = String.valueOf(formatter.format(item.getExagram()));
                strPetagram = String.valueOf(formatter.format(item.getPetagram()));
                strTeragram = String.valueOf(formatter.format(item.getTeragram()));
                strGigagram = String.valueOf(formatter.format(item.getGigagram()));
                strMegagram = String.valueOf(formatter.format(item.getMegagram()));
                strHectogram = String.valueOf(formatter.format(item.getHectogram()));
                strDekagram = String.valueOf(formatter.format(item.getDekagram()));
                strDecigram = String.valueOf(formatter.format(item.getDecigram()));
                strCentigram = String.valueOf(formatter.format(item.getCentigram()));
                strMicrogram = String.valueOf(formatter.format(item.getMicrogram()));

                strNanogram = String.valueOf(formatter.format(item.getNanogram()));
                strPicogram = String.valueOf(formatter.format(item.getPicogram()));
                strFemtogram = String.valueOf(formatter.format(item.getFemtogram()));
                strAttogram = String.valueOf(formatter.format(item.getAttogram()));
                strDalton = String.valueOf(formatter.format(item.getDalton()));
                strKilogramforcesquaresecondpermeter = String.valueOf(formatter.format(item.getKilopound()));
                strKilopound = String.valueOf(formatter.format(item.getKilopound()));
                strKip = String.valueOf(formatter.format(item.getKip()));
                strslug = String.valueOf(formatter.format(item.getSlug()));
                strPoundforcesquaresecondperfoot = String.valueOf(formatter.format(item.getPoundforcesquaresecondperfoot()));

                strPoundtroy = String.valueOf(formatter.format(item.getPoundtroy()));
                strPoundal = String.valueOf(formatter.format(item.getPoundal()));
                strTonus = String.valueOf(formatter.format(item.getTonus()));
                strTonuk = String.valueOf(formatter.format(item.getTonuk()));
                strKiloton = String.valueOf(formatter.format(item.getKiloton()));
                strQuintal = String.valueOf(formatter.format(item.getQuintal()));
                strHundredweightus = String.valueOf(formatter.format(item.getHundredweightus()));
                strHundredweightuk = String.valueOf(formatter.format(item.getHundredweightuk()));
                strQuarterus = String.valueOf(formatter.format(item.getQuarterus()));

                strQuarteruk = String.valueOf(formatter.format(item.getQuarteruk()));
                strStoneuk = String.valueOf(formatter.format(item.getStoneuk()));
                strStoneuk = String.valueOf(formatter.format(item.getStoneuk()));

                strTonne = String.valueOf(formatter.format(item.getTonne()));
                strPennyweight = String.valueOf(formatter.format(item.getPennyweight()));
                strScruple = String.valueOf(formatter.format(item.getScruple()));
                strGrain = String.valueOf(formatter.format(item.getGrain()));
                strGamma = String.valueOf(formatter.format(item.getGamma()));
                strTalent = String.valueOf(formatter.format(item.getTalent()));
                strMina = String.valueOf(formatter.format(item.getMina()));
                strShekel = String.valueOf(formatter.format(item.getShekel()));
                strBekan = String.valueOf(formatter.format(item.getBekan()));

                strGerah = String.valueOf(formatter.format(item.getGerah()));
                strTalentbiblicalgreek = String.valueOf(formatter.format(item.getTalentbiblicalgreek()));
                strMinabiblicalgreek = String.valueOf(formatter.format(item.getMinabiblicalgreek()));

                strTetradrachmabiblicalgreek = String.valueOf(formatter.format(item.getTetradrachmabiblicalgreek()));
                strDidrachmabiblicalgreek = String.valueOf(formatter.format(item.getDidrachmabiblicalgreek()));
                strDrachmabiblicalgreek = String.valueOf(formatter.format(item.getDrachmabiblicalgreek()));
                strDenariusbiblicalroman = String.valueOf(formatter.format(item.getDenariusbiblicalroman()));
                strAssarionbiblicalroman = String.valueOf(formatter.format(item.getAssarionbiblicalroman()));
                strQuadransbiblicalroman = String.valueOf(formatter.format(item.getQuadransbiblicalroman()));
                strLeptonbiblicalroman = String.valueOf(formatter.format(item.getLeptonbiblicalroman()));
                strPlanckmass = String.valueOf(formatter.format(item.getPlanckmass()));
                strElectronmass = String.valueOf(formatter.format(item.getElectronmass()));
                strMuonmass = String.valueOf(formatter.format(item.getMuonmass()));
                strProtonmass = String.valueOf(formatter.format(item.getProtonmass()));
                strNeutronmass = String.valueOf(formatter.format(item.getNeutronmass()));
                strDeuteronmass = String.valueOf(formatter.format(item.getDeuteronmass()));
                strEarthmass = String.valueOf(formatter.format(item.getEarthmass()));

                strSunmass = String.valueOf(formatter.format(item.getSunmass()));


                switch(strSpinnerFromvalue1) {
                    case "Kilogram -  kg":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gram - g":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Milligram - mg":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ton - t":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound - lbs":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ounce - oz":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Carat - ct":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ton short US - ton":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Ton long UK - ton":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Exagram -  Eg":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Petagram - Pg":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Teragram - Tg":
                        conversion(strSpinnerTovalue2);
                        break;


                    case "Gigagram -  Gg":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Megagram - Mg":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Hectogram - hg":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Dekagram -  dag":
                        conversion(strSpinnerTovalue2);
                        break;


                    case "Decigram - dg":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Centigram - cg":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Microgram - μg":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Nanogram - ng":
                        conversion(strSpinnerTovalue2);
                        break;


                    case "Picogram -  pg":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Femtogram - fg":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Attogram - ag":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Dalton - dt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilogram-force square second/meter - kg F sq s m- 1":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Kilopound - kip":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Kip - kip":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Slug - slug ":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound-force square second/foot - lb F sq s ft-1 ":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Pound (troy or apothecary) - lb ":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Poundal - pdl":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Ton (assay) (UK) - AT)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Ton (assay) (US) - AT)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Kiloton (metric) - kt":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Qunital (metric) -  cwt":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Hundredweight (US) - hwt":
                        conversion(strSpinnerTovalue2);
                        break;


                    case "Hundredweight (UK) - hwt":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Quarter (US) - qr":
                        conversion(strSpinnerTovalue2);
                        break;

                    case " Quarter (UK) - qr":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Stone (US) - st":
                        conversion(strSpinnerTovalue2);
                        break;


                    case "Stone (UK) - st":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Tonne - t":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Pennyweight - pwt":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Scruple (apothecary)- s.ap":
                        conversion(strSpinnerTovalue2);
                        break;


                    case "Grain - gr":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Gamma - gamma":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Talent (Biblical Hebrew) - talent ":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Mina (Biblical Hebrew) - mina":
                        conversion(strSpinnerTovalue2);
                        break;


                    case "Shekal (Biblical Hebrew) - shekal":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Bekan (Biblical Hebrew) - bekan":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Gereh (Biblical Hebrew) - gereh":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Talent (Biblical Greek) - talent":
                        conversion(strSpinnerTovalue2);
                        break;


                    case "Mina (Biblical Greek) - mina ":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Tetradrachma (Biblical Greek) - tetd":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Didrachma (Biblical Greek) - didrachma":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Drachma (Biblical Greek) - drachma":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Denarius (Biblical Roman) - denarius":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Assarion (Biblical Roman) - assarion ":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Quadrans (Biblical Roman) -  quadranns":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Lepton (Biblical Roman) - lepton":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Planck mass - Planck mass ":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Electron mass (rest) -  e-":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Muon mass - M":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Proton mass - p":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Neutron mass - n":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Deuteron mass - D":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Earth's mass - Earth":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Sun mass - Sun":
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
            case "Kilogram -  kg":
                editTextValueTo.setText(strKilogram);
                break;
            case "Gram - g":
                editTextValueTo.setText(strGram);
                break;
            case "Milligram - mg":
                editTextValueTo.setText(strMilligram);
                break;
            case "Ton - t":
                editTextValueTo.setText(strTonmetric);
                break;
            case "Pound - lbs":
                editTextValueTo.setText(strPound);
                break;
            case "Ounce - oz":
                editTextValueTo.setText(strOunce);
                break;
            case "Carat - ct":
                editTextValueTo.setText(strCarat);
                break;
            case "Ton short US - ton":
                editTextValueTo.setText(strTonshort);
                break;

            case "Ton long UK - ton":
                editTextValueTo.setText(strTonlong);
                break;
            case "Exagram -  Eg":
                editTextValueTo.setText(strExagram);
                break;
            case "Petagram - Pg":
                editTextValueTo.setText(strPetagram);
                break;

            case "Teragram - Tg":
                editTextValueTo.setText(strTeragram);
                break;


            case "Gigagram -  Gg":
                editTextValueTo.setText(strGigagram);
                break;

            case "Megagram - Mg":
                editTextValueTo.setText(strMegagram);
                break;

            case "Hectogram - hg":
                editTextValueTo.setText(strHectogram);
                break;
            case "Dekagram -  dag":
                editTextValueTo.setText(strDekagram);
                break;


            case "Decigram - dg":
                editTextValueTo.setText(strDecigram);
                break;

            case "Centigram - cg":
                editTextValueTo.setText(strCentigram);
                break;

            case "Microgram - μg":
                editTextValueTo.setText(strMicrogram);
                break;

            case "Nanogram - ng":
                editTextValueTo.setText(strNanogram);
                break;


            case "Picogram -  pg":
                editTextValueTo.setText(strPicogram);
                break;

            case "Femtogram - fg":
                editTextValueTo.setText(strFemtogram);
                break;
            case "Attogram - ag":
                editTextValueTo.setText(strAttogram);
                break;

            case "Dalton - dt":
                editTextValueTo.setText(strDalton);
                break;
            case "Kilogram-force square second/meter - kg F sq s m- 1":
                editTextValueTo.setText(strKilogramforcesquaresecondpermeter);
                break;

            case "Kilopound - kip":
                editTextValueTo.setText(strKilopound);
                break;

            case "Kip - kip":
                editTextValueTo.setText(strKip);
                break;

            case "Slug - slug ":
                editTextValueTo.setText(strslug);
                break;
            case "Pound-force square second/foot - lb F sq s ft-1 ":
                editTextValueTo.setText(strPoundforcesquaresecondperfoot);
                break;

            case "Pound (troy or apothecary) - lb ":
                editTextValueTo.setText(strPound);
                break;

            case "Poundal - pdl":
                editTextValueTo.setText(strPoundal);
                break;

            case "Ton (assay) (UK) - AT)":
                editTextValueTo.setText(strTonuk);
                break;

            case "Ton (assay) (US) - AT)":
                editTextValueTo.setText(strTonus);
                break;

            case "Kiloton (metric) - kt":
                editTextValueTo.setText(strKiloton);
                break;

            case "Qunital (metric) -  cwt":
                editTextValueTo.setText(strQuintal);
                break;

            case "Hundredweight (US) - hwt":
                editTextValueTo.setText(strHundredweightus);
                break;


            case "Hundredweight (UK) - hwt":
                editTextValueTo.setText(strHundredweightuk);
                break;

            case "Quarter (US) - qr":
                editTextValueTo.setText(strQuarterus);
                break;

            case "Quarter (UK) - qr":
                editTextValueTo.setText(strQuarteruk);
                break;

            case "Stone (US) - st":
                editTextValueTo.setText(strStoneus);
                break;


            case "Stone (UK) - st":
                editTextValueTo.setText(strStoneuk);
                break;

            case "Tonne - t":
                editTextValueTo.setText(strTonne);
                break;

            case "Pennyweight - pwt":
                editTextValueTo.setText(strPennyweight);
                break;

            case "Scruple (apothecary)- s.ap":
                editTextValueTo.setText(strScruple);
                break;


            case "Grain - gr":
                editTextValueTo.setText(strGrain);
                break;

            case "Gamma - gamma":
                editTextValueTo.setText(strGamma);
                break;

            case "Talent (Biblical Hebrew) - talent ":
                editTextValueTo.setText(strTalent);
                break;

            case "Mina (Biblical Hebrew) - mina":
                editTextValueTo.setText(strMina);
                break;


            case "Shekal (Biblical Hebrew) - shekal":
                editTextValueTo.setText(strShekel);
                break;

            case "Bekan (Biblical Hebrew) - bekan":
                editTextValueTo.setText(strBekan);
                break;

            case "Gereh (Biblical Hebrew) - gereh":
                editTextValueTo.setText(strGerah);
                break;

            case "Talent (Biblical Greek) - talent":
                editTextValueTo.setText(strTalentbiblicalgreek);
                break;


            case "Mina (Biblical Greek) - mina ":
                editTextValueTo.setText(strMinabiblicalgreek);
                break;

            case "Tetradrachma (Biblical Greek) - tetd":
                editTextValueTo.setText(strTetradrachmabiblicalgreek);
                break;

            case "Didrachma (Biblical Greek) - didrachma":
                editTextValueTo.setText(strDidrachmabiblicalgreek);
                break;

            case "Drachma (Biblical Greek) - drachma":
                editTextValueTo.setText(strDrachmabiblicalgreek);
                break;

            case "Denarius (Biblical Roman) - denarius":
                editTextValueTo.setText(strDenariusbiblicalroman);
                break;

            case "Assarion (Biblical Roman) - assarion ":
                editTextValueTo.setText(strAssarionbiblicalroman);
                break;

            case "Quadrans (Biblical Roman) -  quadranns":
                editTextValueTo.setText(strQuadransbiblicalroman);
                break;

            case "Lepton (Biblical Roman) - lepton":
                editTextValueTo.setText(strLeptonbiblicalroman);
                break;

            case "Planck mass - Planck mass ":
                editTextValueTo.setText(strPlanckmass);
                break;

            case "Electron mass (rest) -  e-":
                editTextValueTo.setText(strElectronmass);
                break;

            case "Muon mass - M":
                editTextValueTo.setText(strMuonmass);
                break;

            case "Proton mass - p":
                editTextValueTo.setText(strProtonmass);
                break;

            case "Neutron mass - n":
                editTextValueTo.setText(strNeutronmass);
                break;

            case "Deuteron mass - D":
                editTextValueTo.setText(strDeuteronmass);
                break;

            case "Earth's mass - Earth":
                editTextValueTo.setText(strEarthmass);
                break;

            case "Sun mass - Sun":
                editTextValueTo.setText(strSunmass);
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