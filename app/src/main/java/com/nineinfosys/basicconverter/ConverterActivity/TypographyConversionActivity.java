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
import com.nineinfosys.basicconverter.ConverterActivityList.ConversionTypographyListActivity;
import com.nineinfosys.basicconverter.Engin.TypographyConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class TypographyConversionActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher  {

    //declaration of designing tools
    private Spinner spinnerConvertFrom,spinnerConvertTo;
    private EditText editTextValue,editTextValueTo;

    private FloatingActionButton buttonList,buttonShare,buttonMail,buttonCopy;
    private SwitchCompat switchChangeType;
    List<String> listForceFirstfrom,listFirstForceTo,listForcefrom,listForceTo;
    private String stringSpinnerFrom,stringSpinnerTo;
    private TextView textViewBasicUnit,textViewAllUnit,textViewConvert;
    double doubleEdittextvalue=1.0;
    private int basicunit=3;
    private int allunit=13;
    DecimalFormat formatter = null;
    private static final int REQUEST_CODE = 100;

    TypographyConverter.ConversionResults item;
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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);

        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#757575")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Typography");


        formatsetting();

        MobileAds.initialize(TypographyConversionActivity.this, getString(R.string.ads_app_id));
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
        listForceFirstfrom = new ArrayList<String>();
        listFirstForceTo = new ArrayList<String>();

        //for first time running spinner
        listForceFirstfrom.add("Twip - twip");
        listForceFirstfrom.add("Meter - m");
        listForceFirstfrom.add("Centimeter - cm");
        listForceFirstfrom.add("Millimeter - mm");

        //2 spinner
        listFirstForceTo.add("Twip - twip");
        listFirstForceTo.add("Meter - m");
        listFirstForceTo.add("Centimeter - cm");
        listFirstForceTo.add("Millimeter - mm");

        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(TypographyConversionActivity.this,android.R.layout.simple_spinner_item, listForceFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(TypographyConversionActivity.this,android.R.layout.simple_spinner_item, listFirstForceTo);


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

                listForcefrom = new ArrayList<String>();
                listForceTo = new ArrayList<String>();
                String stringSwitchSate=String.valueOf(isChecked);
                String strBasic="Basic";
                String strAdvance="All";
                switch(stringSwitchSate)
                {

                    case "false":
                        Snackbar.make(buttonView, "You switched to "+strBasic+" Units", Snackbar.LENGTH_LONG).setAction("ACTION",null).show();
                        listForcefrom.clear();
                        listForceTo.clear();
                        listForcefrom.add("Twip - twip");
                        listForcefrom.add("Meter - m");
                        listForcefrom.add("Centimeter - cm");
                        listForcefrom.add("Millimeter - mm");


                        //2 spinner
                        listForceTo.add("Twip - twip");
                        listForceTo.add("Meter - m");
                        listForceTo.add("Centimeter - cm");
                        listForceTo.add("Millimeter - mm");


                        break;

                    case "true":
                        Snackbar.make(buttonView, "You switched to "+strAdvance+" Units", Snackbar.LENGTH_LONG).setAction("ACTION",null).show();
                        listForcefrom.clear();
                        listForceTo.clear();
                        listForcefrom.add("Twip - twip");
                        listForcefrom.add("Meter - m");
                        listForcefrom.add("Centimeter - cm");
                        listForcefrom.add("Millimeter - mm");
                        listForcefrom.add("Character(X) - character(x)");
                        listForcefrom.add("Character(Y) - character(y)");
                        listForcefrom.add("Pixel(X) - pixel(x)");
                        listForcefrom.add("Pixel(Y) - pixel(y)");
                        listForcefrom.add("Inch - in");
                        listForcefrom.add("Pica(Computer) - pica");
                        listForcefrom.add("Pica(Printer) - pica");
                        listForcefrom.add("PostScript point - psp");
                        listForcefrom.add("Point(Computer) - pt");
                        listForcefrom.add("Point(Printer) - pt");
                        listForcefrom.add("En - en");


                        //2 spinner
                        listForceTo.add("Twip - twip");
                        listForceTo.add("Meter - m");
                        listForceTo.add("Centimeter - cm");
                        listForceTo.add("Millimeter - mm");
                        listForceTo.add("Character(X) - character(x)");
                        listForceTo.add("Character(Y) - character(y)");
                        listForceTo.add("Pixel(X) - pixel(x)");
                        listForceTo.add("Pixel(Y) - pixel(y)");
                        listForceTo.add("Inch - in");
                        listForceTo.add("Pica(Computer) - pica");
                        listForceTo.add("Pica(Printer) - pica");
                        listForceTo.add("PostScript point - psp");
                        listForceTo.add("Point(Computer) - pt");
                        listForceTo.add("Point(Printer) - pt");
                        listForceTo.add("En - en");

                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(TypographyConversionActivity.this,android.R.layout.simple_spinner_item, listForcefrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(TypographyConversionActivity.this,android.R.layout.simple_spinner_item, listForceTo);


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
                Intent i=new Intent(this,ConversionTypographyListActivity.class);
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

            TypographyConverter c = new TypographyConverter(strSpinnerFromvalue1, (int) doubleEdittextvalue1);
            ArrayList<TypographyConverter.ConversionResults> results = c.calculateForceConversion();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);

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

                switch(strSpinnerFromvalue1) {
                    case "Twip - twip":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Meter - m":
                        conversion(strSpinnerTovalue2);
                        break;
                    case  "Centimeter - cm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Millimeter - mm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Character(X) - character(x)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Character(Y) - character(y)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pixel(X) - pixel(x)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pixel(Y) - pixel(y)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Inch - in":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pica(Computer) - pica":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pica(Printer) - pica":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "PostScript point - psp":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Point(Computer) - pt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Point(Printer) - pt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "En - en":
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

            case "Twip - twip":
                editTextValueTo.setText(strTwip);
                break;
            case "Meter - m":
                editTextValueTo.setText(strMeter);
                break;
            case  "Centimeter - cm":
                editTextValueTo.setText(strCentimeter);
                break;
            case "Millimeter - mm":
                editTextValueTo.setText(strMillimeter);
                break;
            case "Character(X) - character(x)":
                editTextValueTo.setText(strCharacterX);
                break;
            case "Character(Y) - character(y)":
                editTextValueTo.setText(strCharacterY);
                break;
            case "Pixel(X) - pixel(x)":
                editTextValueTo.setText(strPixelX);
                break;
            case "Pixel(Y) - pixel(y)":
                editTextValueTo.setText(strPixelY);
                break;
            case "Inch - in":
                editTextValueTo.setText(strInch);
                break;
            case "Pica(Computer) - pica":
                editTextValueTo.setText(strPicacomputer);
                break;
            case "Pica(Printer) - pica":
                editTextValueTo.setText(strPicaprinter);
                break;
            case "PostScript point - psp":
                editTextValueTo.setText(strPostScriptpoint);
                break;
            case "Point(Computer) - pt":
                editTextValueTo.setText(strPointcomputer);
                break;
            case "Point(Printer) - pt":
                editTextValueTo.setText(strPointprinter);
                break;
            case "En - en":
                editTextValueTo.setText(strEn);
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