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
import com.nineinfosys.basicconverter.ConverterActivityList.ConversionCookingListActivity;
import com.nineinfosys.basicconverter.Engin.Cooking;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CookingActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher {

    //declaration of designing tools
    private Spinner spinnerConvertFrom, spinnerConvertTo;
    private EditText editTextValue, editTextValueTo;
    private FloatingActionButton buttonList, buttonShare, buttonMail, buttonCopy;
    private SwitchCompat switchChangeType;
    List<String> listFirstfrom, listFirstTo, listfrom, listTo;
    private String stringSpinnerFrom, stringSpinnerTo;
    private TextView textViewBasicUnit, textViewAllUnit,textViewConvert;
    double doubleEdittextvalue = 1.0;
    private int basicunit = 7;
    private int allunit = 14;
    DecimalFormat formatter = null;

    private static final int REQUEST_CODE = 100;

   private Cooking.ConversionResults item;
    private String strcupeuro=null,strcupus=null,strfluidounce=null,strgrameuro=null,strkgeuro=null,strlitereuro=null,strmleuro=null,strounceus=null,
    strpint=null,strpoundus=null,strtseuro=null,strtsus=null,strteaseuro=null,strteasus=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);


        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#2eaf46")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Cooking");

        formatsetting();

        MobileAds.initialize(CookingActivity.this, getString(R.string.ads_app_id));
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
        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorGreenish)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorGreenish)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorGreenish)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorGreenish)));

        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()),ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorGreenish)));
       // DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getTrackDrawable()), ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorGreenish)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textViewConvert.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorGreenish)));
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#007e17"));
        }

        textViewBasicUnit.setText(String.valueOf("Basic Units(" + basicunit + ")"));
        textViewAllUnit.setText(String.valueOf("All Units(" + allunit + ")"));

        //adding value to spinner
        listFirstfrom = new ArrayList<String>();
        listFirstTo = new ArrayList<String>();


        //for first time running spinner
        listFirstfrom.add("Cup(Euro) - cup");
        listFirstfrom.add("Cup(US) - cup");
        listFirstfrom.add("Gram - g");
        listFirstfrom.add("Kilogram - kg");
        listFirstfrom.add("Liter - li");
        listFirstfrom.add("Table Spoon - tbsp");
        
        listFirstTo.add("Cup(Euro) - cup");
        listFirstTo.add("Cup(US) - cup");
        listFirstTo.add("Gram - g");
        listFirstTo.add("Kilogram - kg");
        listFirstTo.add("Liter - li");
        listFirstTo.add("Table Spoon - tbsp");

        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(CookingActivity.this, android.R.layout.simple_spinner_item, listFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(CookingActivity.this, android.R.layout.simple_spinner_item, listFirstTo);


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
                        listfrom.add("Cup(Euro) - cup");
                        listfrom.add("Cup(US) - cup");
                        listfrom.add("Gram - g");
                        listfrom.add("Kilogram - kg");
                        listfrom.add("Liter - li");
                        listfrom.add("Table Spoon - tbsp");


                        //2 spinner

                        listTo.add("Cup(Euro) - cup");
                        listTo.add("Cup(US) - cup");
                        listTo.add("Gram - g");
                        listTo.add("Kilogram - kg");
                        listTo.add("Liter - li");
                        listTo.add("Table Spoon - tbsp");

                        break;

                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strAdvance + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listfrom.clear();
                        listTo.clear();
                        listfrom.add("Cup(Euro) - cup");
                        listfrom.add("Cup(US) - cup");
                        listfrom.add("Gram - g");
                        listfrom.add("Kilogram - kg");
                        listfrom.add("Liter - li");
                        listfrom.add("Milliliter - ml");
                        listfrom.add("Ounce - oz");
                        listfrom.add("Fluid Ounce - floz");
                        listfrom.add("Pint - pt");
                        listfrom.add("Pound - lb");
                        listfrom.add("Table Spoon(Euro) - tbsp");
                        listfrom.add("Table Spoon(US) - tbsp");
                        listfrom.add("Tea Spoon(Euro) - tsp");
                        listfrom.add("Tea Spoon(US) - tsp");
                        

                        //2 spinner
                        listTo.add("Cup(Euro) - cup");
                        listTo.add("Cup(US) - cup");
                        listTo.add("Gram - g");
                        listTo.add("Kilogram - kg");
                        listTo.add("Liter - li");
                        listTo.add("Milliliter - ml");
                        listTo.add("Ounce - oz");
                        listTo.add("Fluid Ounce - floz");
                        listTo.add("Pint - pt");
                        listTo.add("Pound - lb");
                        listTo.add("Table Spoon(Euro) - tbsp");
                        listTo.add("Table Spoon(US) - tbsp");
                        listTo.add("Tea Spoon(Euro) - tsp");
                        listTo.add("Tea Spoon(US) - tsp");

                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(CookingActivity.this, android.R.layout.simple_spinner_item, listfrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(CookingActivity.this, android.R.layout.simple_spinner_item, listTo);


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
                Intent i = new Intent(this, ConversionCookingListActivity.class);
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

            Cooking c = new Cooking(strSpinnerFromvalue1, doubleEdittextvalue1);
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

              
                switch (strSpinnerFromvalue1) {
                    case "Cup(Euro) - cup":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cup(US) - cup":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gram - g":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilogram - kg":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Liter - li":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Milliliter - ml":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ounce - oz":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Fluid Ounce - floz":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pint - pt":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Pound - lb":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Table Spoon(Euro) - tbsp":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Table Spoon(US) - tbsp":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Tea Spoon(Euro) - tsp":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Tea Spoon(US) - tsp":
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

            case "Cup(Euro) - cup":
                editTextValueTo.setText(strcupeuro);
                break;
            case "Cup(US) - cup":
                editTextValueTo.setText(strcupus);
                break;
            case "Gram - g":
                editTextValueTo.setText(strgrameuro);
                break;
            case "Kilogram - kg":
                editTextValueTo.setText(strkgeuro);
                break;
            case "Liter - li":
                editTextValueTo.setText(strlitereuro);
                break;
            case "Milliliter - ml":
                editTextValueTo.setText(strmleuro);
                break;
            case "Ounce - oz":
                editTextValueTo.setText(strounceus);
                break;

            case "Fluid Ounce - floz":
                editTextValueTo.setText(strfluidounce);
                break;
            case "Pint - pt":
                editTextValueTo.setText(strpint);
                break;

            case "Pound - lb":
                editTextValueTo.setText(strpoundus);
                break;
            case "Table Spoon(Euro) - tbsp":
                editTextValueTo.setText(strtseuro);
                break;
            case "Table Spoon(US) - tbsp":
                editTextValueTo.setText(strtsus);
                break;
            case "Tea Spoon(Euro) - tsp":
                editTextValueTo.setText(strteaseuro);
                break;
            case "Tea Spoon(US) - tsp":
                editTextValueTo.setText(strteasus);
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