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
import com.nineinfosys.basicconverter.ConverterActivityList.ConversionPrefixListActivity;
import com.nineinfosys.basicconverter.Engin.Prefixes;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PrefixActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher {


    //declaration of designing tools
    private Spinner spinnerConvertFrom, spinnerConvertTo;
    private EditText editTextValue, editTextValueTo;
    private FloatingActionButton buttonList, buttonShare, buttonMail, buttonCopy;
    private SwitchCompat switchChangeType;
    List<String> listFirstfrom, listFirstTo, listfrom, listTo;
    private String stringSpinnerFrom, stringSpinnerTo;
    private TextView textViewBasicUnit, textViewAllUnit,textViewConvert;
    double doubleEdittextvalue = 1.0;
    private int basicunit = 9;
    private int allunit = 21;
    DecimalFormat formatter = null;
    private static final int REQUEST_CODE = 100;

   private Prefixes.ConversionResults item;
    private String strnone=null,stryotta=null,strzetta=null,strexa=null,strpeta=null,strtera=null,strgiga=null,strmega=null,strkilo=null,strhecto=null,strdeka=null,strdeci=null,
            strcenti=null,strmilli=null,strmicro=null,strnano=null,strpico=null,strfemto=null,stratto=null,strzepto=null,stryocto=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);


        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#9cc409")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Prefixes");

        formatsetting();

        MobileAds.initialize(PrefixActivity.this, getString(R.string.ads_app_id));
        AdView mAdView = (AdView) findViewById(R.id.adViewUnitConverter);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //initalization of tools and variables
        spinnerConvertFrom = (Spinner) findViewById(R.id.spinnerConvertFrom);
        spinnerConvertTo = (Spinner) findViewById(R.id.spinnerConvertTo);
        textViewBasicUnit = (TextView) findViewById(R.id.textViewBasicUnit);
        textViewAllUnit = (TextView) findViewById(R.id.textViewAllUnit);
        textViewConvert=(TextView) findViewById(R.id.buttonUnitConverter);
        editTextValue = (EditText) findViewById(R.id.edittextFrom);
        editTextValueTo = (EditText) findViewById(R.id.edittextTo);
        buttonCopy = (FloatingActionButton) findViewById(R.id.button_copy);
        buttonList = (FloatingActionButton) findViewById(R.id.button_list_fullreport);
        buttonShare = (FloatingActionButton) findViewById(R.id.button_list_share);
        buttonMail = (FloatingActionButton) findViewById(R.id.button_list_mail);
        switchChangeType = (SwitchCompat) findViewById(R.id.switchButton);

        //changing color dynamically
        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorGreenishyesllow)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorGreenishyesllow)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorGreenishyesllow)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorGreenishyesllow)));

        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()),ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorGreenishyesllow)));

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textViewConvert.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorGreenishyesllow)));
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#699300"));
        }

        textViewBasicUnit.setText(String.valueOf("Basic Units(" + basicunit + ")"));
        textViewAllUnit.setText(String.valueOf("All Units(" + allunit + ")"));

        //adding value to spinner
        listFirstfrom = new ArrayList<String>();
        listFirstTo = new ArrayList<String>();


        //for first time running spinner
        listFirstfrom.add("None - none");
        listFirstfrom.add("Yotta - Y");
        listFirstfrom.add("Zetta - Z");
        listFirstfrom.add("Exa - E");
        listFirstfrom.add("Peta - P");
        listFirstfrom.add("Tera - T");
        listFirstfrom.add("Giga - G");
        listFirstfrom.add("Mega - M");
        listFirstfrom.add("Kilo - k");
        
       
        listFirstTo.add("None - none");
        listFirstTo.add("Yotta - Y");
        listFirstTo.add("Zetta - Z");
        listFirstTo.add("Exa - E");
        listFirstTo.add("Peta - P");
        listFirstTo.add("Tera - T");
        listFirstTo.add("Giga - G");
        listFirstTo.add("Mega - M");
        listFirstTo.add("Kilo - k");
       

        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(PrefixActivity.this, android.R.layout.simple_spinner_item, listFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(PrefixActivity.this, android.R.layout.simple_spinner_item, listFirstTo);


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

                listfrom = new ArrayList<String>();
                listTo = new ArrayList<String>();
                String stringSwitchSate = String.valueOf(isChecked);
                String strBasic = "Basic";
                String strAdvance = "All";
                switch (stringSwitchSate) {

                    case "false":
                        Snackbar.make(buttonView, "You switched to " + strBasic + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listfrom.clear();
                        listTo.clear();
                        listfrom.add("None - none");
                        listfrom.add("Yotta - Y");
                        listfrom.add("Zetta - Z");
                        listfrom.add("Exa - E");
                        listfrom.add("Peta - P");
                        listfrom.add("Tera - T");
                        listfrom.add("Giga - G");
                        listfrom.add("Mega - M");
                        listfrom.add("Kilo - k");

                        //2 spinner
                        listTo.add("None - none");
                        listTo.add("Yotta - Y");
                        listTo.add("Zetta - Z");
                        listTo.add("Exa - E");
                        listTo.add("Peta - P");
                        listTo.add("Tera - T");
                        listTo.add("Giga - G");
                        listTo.add("Mega - M");
                        listTo.add("Kilo - k");

                        break;

                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strAdvance + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listfrom.clear();
                        listTo.clear();
                        listfrom.add("None - none");
                        listfrom.add("Yotta - Y");
                        listfrom.add("Zetta - Z");
                        listfrom.add("Exa - E");
                        listfrom.add("Peta - P");
                        listfrom.add("Tera - T");
                        listfrom.add("Giga - G");
                        listfrom.add("Mega - M");
                        listfrom.add("Kilo - k");
                        listfrom.add("Hecto - h");
                        listfrom.add("Deka - da");
                        listfrom.add("Deci - d");
                        listfrom.add("Centi - c");
                        listfrom.add("Milli - m");
                        listfrom.add("Micro - µ");
                        listfrom.add("Nano - n");
                        listfrom.add("Pico - p");
                        listfrom.add("Femto - f");
                        listfrom.add("Atto - a");
                        listfrom.add("Zepto - z");
                        listfrom.add("Yocto - y");

                        //2 spinner
                        listTo.add("None - none");
                        listTo.add("Yotta - Y");
                        listTo.add("Zetta - Z");
                        listTo.add("Exa - E");
                        listTo.add("Peta - P");
                        listTo.add("Tera - T");
                        listTo.add("Giga - G");
                        listTo.add("Mega - M");
                        listTo.add("Kilo - k");
                        listTo.add("Hecto - h");
                        listTo.add("Deka - da");
                        listTo.add("Deci - d");
                        listTo.add("Centi - c");
                        listTo.add("Milli - m");
                        listTo.add("Micro - µ");
                        listTo.add("Nano - n");
                        listTo.add("Pico - p");
                        listTo.add("Femto - f");
                        listTo.add("Atto - a");
                        listTo.add("Zepto - z");
                        listTo.add("Yocto - y");


                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(PrefixActivity.this, android.R.layout.simple_spinner_item, listfrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(PrefixActivity.this, android.R.layout.simple_spinner_item, listTo);


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

                if (editTextValue.getText().toString().trim().equals("")) {
                    Snackbar.make(adapterView, "Provide Unit Value for Conversion", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                } else {
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

                if (editTextValue.getText().toString().trim().equals("")) {
                    Snackbar.make(adapterView, "Provide Unit Value for Conversion", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                } else {
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
        SharedPreferences sharedPreferences = this.getSharedPreferences(Settings.SHARED_PREF_NAME, Context.MODE_PRIVATE);
        //Fetching thepatient_mobile_Number value form sharedpreferences
        String FormattedString = sharedPreferences.getString(Settings.Format_Selected_SHARED_PREF, "Thousands separator");
        String DecimalplaceString = sharedPreferences.getString(Settings.Decimal_Place_Selected_SHARED_PREF, "2");
        Settings settings = new Settings(FormattedString, DecimalplaceString);
        formatter = settings.setting();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonUnitConverter:
                //switch spinner value
                int spinner1Index = spinnerConvertFrom.getSelectedItemPosition();
                spinnerConvertFrom.setSelection(spinnerConvertTo.getSelectedItemPosition());
                spinnerConvertTo.setSelection(spinner1Index );
                break;

            case R.id.button_list_fullreport:
                doubleEdittextvalue = Double.parseDouble(editTextValue.getText().toString().trim());
                Intent i = new Intent(this, ConversionPrefixListActivity.class);
                i.putExtra("stringSpinnerFrom", stringSpinnerFrom);
                i.putExtra("doubleEdittextvalue", doubleEdittextvalue);
                startActivity(i);
                break;

            case R.id.button_copy:
                String text = editTextValueTo.getText().toString().trim();
                android.content.ClipboardManager clipboardMgr = (android.content.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Copied text", text);
                clipboardMgr.setPrimaryClip(clip);
                Snackbar.make(v, "Conversion Value Copied", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                break;

            case R.id.button_list_share:
                String textTo = editTextValueTo.getText().toString().trim();
                String textFrom = editTextValueTo.getText().toString().trim();

                String shareMessage = textFrom + " " + stringSpinnerFrom + ": " + textTo + " " + stringSpinnerTo;

                try {
                    Intent share = new Intent();
                    share.setAction("android.intent.action.SEND");
                    share.setType("text/plain");
                    share.putExtra("android.intent.extra.TEXT", shareMessage);
                    startActivity(Intent.createChooser(share, ""));

                } catch (Exception e) {
                    e.printStackTrace();
                }
             break;

            case R.id.button_list_mail:
                String textmailTo = editTextValueTo.getText().toString().trim();
                String textmailFrom = editTextValueTo.getText().toString().trim();
                String message = textmailTo + " " + stringSpinnerFrom + " :  " + textmailFrom + "  " + stringSpinnerTo;
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{});
                email.putExtra(Intent.EXTRA_SUBJECT, "Conversion Details");
                email.putExtra(Intent.EXTRA_TEXT, message);
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
            calcualteValue(stringSpinnerFrom, stringSpinnerTo, doubleEdittextvalue);

        } catch (NumberFormatException e) {
            doubleEdittextvalue = 0;

        }


    }

    public void calcualteValue(String strSpinnerFromvalue1, String strSpinnerTovalue2, double doubleEdittextvalue1) {
        try {

            Prefixes c = new Prefixes(strSpinnerFromvalue1, doubleEdittextvalue1);
            ArrayList<Prefixes.ConversionResults> results = c.calculateprefixConversion();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);

                strnone= String.valueOf(formatter.format(item.getNone()));
                stryotta= String.valueOf(formatter.format(item.getYotta()));
                strzetta= String.valueOf(formatter.format(item.getZetta()));
                strexa= String.valueOf(formatter.format(item.getExa()));
                strpeta= String.valueOf(formatter.format(item.getPeta()));
                strtera= String.valueOf(formatter.format(item.getTera()));
                strgiga= String.valueOf(formatter.format(item.getGiga()));
                strmega= String.valueOf(formatter.format(item.getMega()));
                strkilo= String.valueOf(formatter.format(item.getKilo()));
                strhecto= String.valueOf(formatter.format(item.getHecto()));
                strdeka= String.valueOf(formatter.format(item.getDeka()));
                strdeci= String.valueOf(formatter.format(item.getDeci()));
                strcenti= String.valueOf(formatter.format(item.getCenti()));
                strmilli= String.valueOf(formatter.format(item.getMilli()));
                strmicro= String.valueOf(formatter.format(item.getMicro()));
                strnano= String.valueOf(formatter.format(item.getNano()));
                strpico= String.valueOf(formatter.format(item.getPico()));
                strfemto= String.valueOf(formatter.format(item.getFemto()));
                stratto= String.valueOf(formatter.format(item.getAtto()));
                strzepto= String.valueOf(formatter.format(item.getZepto()));
                stryocto= String.valueOf(formatter.format(item.getYocto()));



                switch (strSpinnerFromvalue1) {
                    case "None - none":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Yotta - Y":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Zetta - Z":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Exa - E":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Peta - P":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Tera - T":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Giga - G":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Mega - M":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilo - k":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Hecto - h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Deka - da":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Deci - d":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Centi - c":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Milli - m":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Micro - µ":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Nano - n":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pico - p":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Femto - f":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Atto - a":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Zepto - z":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Yocto - y":
                        conversion(strSpinnerTovalue2);
                        break;

                }
            }


        } catch (NumberFormatException e) {
            doubleEdittextvalue = 0;

        }
    }

    private void conversion(String strSpinnerTovalue2) {

        switch (strSpinnerTovalue2) {
            case "None - none":
               editTextValueTo.setText(strnone);
                break;
            case "Yotta - Y":
               editTextValueTo.setText(stryotta);
                break;
            case "Zetta - Z":
               editTextValueTo.setText(strzetta);
                break;
            case "Exa - E":
               editTextValueTo.setText(strexa);
                break;
            case "Peta - P":
               editTextValueTo.setText(strpeta);
                break;
            case "Tera - T":
               editTextValueTo.setText(strtera);
                break;
            case "Giga - G":
               editTextValueTo.setText(strgiga);
                break;
            case "Mega - M":
               editTextValueTo.setText(strmega);
                break;
            case "Kilo - k":
               editTextValueTo.setText(strkilo);
                break;
            case "Hecto - h":
               editTextValueTo.setText(strhecto);
                break;
            case "Deka - da":
               editTextValueTo.setText(strdeka);
                break;
            case "Deci - d":
               editTextValueTo.setText(strdeci);
                break;
            case "Centi - c":
               editTextValueTo.setText(strcenti);
                break;
            case "Milli - m":
               editTextValueTo.setText(strmilli);
                break;
            case "Micro - µ":
               editTextValueTo.setText(strmicro);
                break;
            case "Nano - n":
               editTextValueTo.setText(strnano);
                break;
            case "Pico - p":
               editTextValueTo.setText(strpico);
                break;
            case "Femto - f":
               editTextValueTo.setText(strfemto);
                break;
            case "Atto - a":
               editTextValueTo.setText(stratto);
                break;
            case "Zepto - z":
               editTextValueTo.setText(strzepto);
                break;
            case "Yocto - y":
               editTextValueTo.setText(stryocto);
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