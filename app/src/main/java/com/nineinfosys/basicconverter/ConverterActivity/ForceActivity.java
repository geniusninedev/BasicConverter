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
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.nineinfosys.basicconverter.ConverterActivityList.ConversionForceListActivity;
import com.nineinfosys.basicconverter.Engin.ForceConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ForceActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher {


    //declaration of designing tools
    private Spinner spinnerConvertFrom, spinnerConvertTo;
    private EditText editTextValue, editTextValueTo;
    Button buttonConvert;
    private FloatingActionButton buttonList, buttonShare, buttonMail, buttonCopy;
    private SwitchCompat switchChangeType;
    private List<String> listForceFirstfrom, listForceFirstTo, listforcefrom, listforceTo;
    private String stringSpinnerFrom, stringSpinnerTo;
    private TextView textViewBasicUnit, textViewAllUnit,textViewConvert;
    double doubleEdittextvalue = 1.0;
    private int basicunit = 10;
    private int allunit = 23;
    private DecimalFormat formatter = null;
    private static final int REQUEST_CODE = 100;

    ForceConverter.ConversionResults item;

    private String strnewton=null;
    private String strkilonewton=null;
    private String strgramforce=null;
    private String strkilogramforce=null;
    private String strtonforce=null;
    private String strexanewton=null;
    private String strpetanewton=null;
    private String strteranewton=null;
    private String strgiganewton=null;
    private String strmeganewton=null;
    private String strhectonewton=null;
    private String strdekanewton=null;
    private String strdecinewton=null;
    private String strcentinewton=null;
    private String strmilinewton=null;
    private String strmicronewton=null;
    private String strnanonewton=null;
    private String strpiconewton=null;
    private String strfemtonewton=null;
    private String strattonewton=null;
    private String strdyne=null;
    private String strjoulepermeter=null;
    private String strjoulepercentimeter=null;
    private String strtonforceshort=null;
    private String strtonforcelong=null;
    private String strkipforce=null;
    private String strkilopoundforce=null;
    private String strpoundforce=null;
    private String strounceforce=null;
    private String strpoundal=null;
    private String strpoundfootpersquaresecond=null;
    private String strpond=null;
    private String strkilopond=null;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);


        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1976d2")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Force");

        formatsetting();

        MobileAds.initialize(ForceActivity.this, getString(R.string.ads_app_id));
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
        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorBlue)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorBlue)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorBlue)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorBlue)));

        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()),ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorBlue)));
        // DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getTrackDrawable()), ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRed)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textViewConvert.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorBlue)));
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#004ba0"));
        }

        textViewBasicUnit.setText(String.valueOf("Basic Units(" + basicunit + ")"));
        textViewAllUnit.setText(String.valueOf("All Units(" + allunit + ")"));


        //adding value to spinner
        listForceFirstfrom = new ArrayList<String>();
        listForceFirstTo = new ArrayList<String>();


        //for first time running spinner
        listForceFirstfrom.add("Newton - N");
        listForceFirstfrom.add("Kilonewton - kN");
        listForceFirstfrom.add("Gram-force - gf");
        listForceFirstfrom.add("Kilogram-force - kgf");
        listForceFirstfrom.add("Dyne - dyn");
        listForceFirstfrom.add("Ton-force(short) - tonf");
        listForceFirstfrom.add("Ton-force(long) - tonf");
        listForceFirstfrom.add("Pound-force - lbf");
        listForceFirstfrom.add("Ounce-force - ozf");
        listForceFirstfrom.add("Poundal - pdl");



        listForceFirstTo.add("Newton - N");
        listForceFirstTo.add("Kilonewton - kN");
        listForceFirstTo.add("Gram-force - gf");
        listForceFirstTo.add("Kilogram-force - kgf");
        listForceFirstTo.add("Dyne - dyn");
        listForceFirstTo.add("Ton-force(short) - tonf");
        listForceFirstTo.add("Ton-force(long) - tonf");
        listForceFirstTo.add("Pound-force - lbf");
        listForceFirstTo.add("Ounce-force - ozf");
        listForceFirstTo.add("Poundal - pdl");
       

        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(ForceActivity.this, android.R.layout.simple_spinner_item, listForceFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(ForceActivity.this, android.R.layout.simple_spinner_item, listForceFirstTo);


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

                listforcefrom = new ArrayList<String>();
                listforceTo = new ArrayList<String>();
                String stringSwitchSate = String.valueOf(isChecked);
                String strBasic = "Basic";
                String strAdvance = "All";
                switch (stringSwitchSate) {

                    case "false":
                        Snackbar.make(buttonView, "You switched to " + strBasic + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listforcefrom.clear();
                        listforceTo.clear();
                        listforcefrom.add("Newton - N");
                        listforcefrom.add("Kilonewton - kN");
                        listforcefrom.add("Gram-force - gf");
                        listforcefrom.add("Kilogram-force - kgf");
                        listforcefrom.add("Dyne - dyn");
                        listforcefrom.add("Ton-force(short) - tonf");
                        listforcefrom.add("Ton-force(long) - tonf");
                        listforcefrom.add("Pound-force - lbf");
                        listforcefrom.add("Ounce-force - ozf");
                        listforcefrom.add("Poundal - pdl");

                        //second spinner
                        listforceTo.add("Newton - N");
                        listforceTo.add("Kilonewton - kN");
                        listforceTo.add("Gram-force - gf");
                        listforceTo.add("Kilogram-force - kgf");
                        listforceTo.add("Dyne - dyn");
                        listforceTo.add("Ton-force(short) - tonf");
                        listforceTo.add("Ton-force(long) - tonf");
                        listforceTo.add("Pound-force - lbf");
                        listforceTo.add("Ounce-force - ozf");
                        listforceTo.add("Poundal - pdl");


                        break;
                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strAdvance + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listforcefrom.clear();
                        listforceTo.clear();
                        listforcefrom.add("Newton - N");
                        listforcefrom.add("Kilonewton - kN");
                        listforcefrom.add("Gram-force - gf");
                        listforcefrom.add("Kilogram-force - kgf");
                        listforcefrom.add("Ton-force(metric) - tf");
                        listforcefrom.add("Exanewton - EN");
                        listforcefrom.add("Petanewton - PT");
                        listforcefrom.add("Teranewton - TN");
                        listforcefrom.add("Giganewton - GN");
                        listforcefrom.add("Meganewton - MN");
                        listforcefrom.add("Hectonewton - hN");
                        listforcefrom.add("Dekanewton - daN");
                        listforcefrom.add("Decinewton - dN");
                        listforcefrom.add("Centinewton - cN");
                        listforcefrom.add("Milinewton - mN");
                        listforcefrom.add("Micronewton - μN");
                        listforcefrom.add("Nanonewton - nN");
                        listforcefrom.add("Piconewton - pN");
                        listforcefrom.add("Femtonewton - fN");
                        listforcefrom.add("Attonewton - aN");
                        listforcefrom.add("Dyne - dyn");
                        listforcefrom.add("Joule/meter - J/m");
                        listforcefrom.add("Joule/centimeter - J/cm");
                        listforcefrom.add("Ton-force(short) - tonf");
                        listforcefrom.add("Ton-force(long) - tonf");
                        listforcefrom.add("Kip-force - kipf");
                        listforcefrom.add("Kilopound-force- kipf");
                        listforcefrom.add("Pound-force - lbf");
                        listforcefrom.add("Ounce-force - ozf");
                        listforcefrom.add("Poundal - pdl");
                        listforcefrom.add("Pound foot/square second - lb*ft/sec²");
                        listforcefrom.add("Pond - p");
                        listforcefrom.add("Kilopond - kp");


                        //2 spinner

                        listforceTo.add("Newton - N");
                        listforceTo.add("Kilonewton - kN");
                        listforceTo.add("Gram-force - gf");
                        listforceTo.add("Kilogram-force - kgf");
                        listforceTo.add("Ton-force(metric) - tf");
                        listforceTo.add("Exanewton - EN");
                        listforceTo.add("Petanewton - PT");
                        listforceTo.add("Teranewton - TN");
                        listforceTo.add("Giganewton - GN");
                        listforceTo.add("Meganewton - MN");
                        listforceTo.add("Hectonewton - hN");
                        listforceTo.add("Dekanewton - daN");
                        listforceTo.add("Decinewton - dN");
                        listforceTo.add("Centinewton - cN");
                        listforceTo.add("Milinewton - mN");
                        listforceTo.add("Micronewton - μN");
                        listforceTo.add("Nanonewton - nN");
                        listforceTo.add("Piconewton - pN");
                        listforceTo.add("Femtonewton - fN");
                        listforceTo.add("Attonewton - aN");
                        listforceTo.add("Dyne - dyn");
                        listforceTo.add("Joule/meter - J/m");
                        listforceTo.add("Joule/centimeter - J/cm");
                        listforceTo.add("Ton-force(short) - tonf");
                        listforceTo.add("Ton-force(long) - tonf");
                        listforceTo.add("Kip-force - kipf");
                        listforceTo.add("Kilopound-force- kipf");
                        listforceTo.add("Pound-force - lbf");
                        listforceTo.add("Ounce-force - ozf");
                        listforceTo.add("Poundal - pdl");
                        listforceTo.add("Pound foot/square second - lb*ft/sec²");
                        listforceTo.add("Pond - p");
                        listforceTo.add("Kilopond - kp");
                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(ForceActivity.this, android.R.layout.simple_spinner_item, listforcefrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(ForceActivity.this, android.R.layout.simple_spinner_item, listforceTo);


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
                Intent i = new Intent(this, ConversionForceListActivity.class);
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

            ForceConverter c = new ForceConverter(strSpinnerFromvalue1, doubleEdittextvalue1);
            ArrayList<ForceConverter.ConversionResults> results = c.calculateForceConversion();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);

                strnewton = String.valueOf(formatter.format(item.getNewton()));
                strkilonewton = String.valueOf(formatter.format(item.getKilonewton()));
                strgramforce = String.valueOf(formatter.format(item.getGramforce()));
                strkilogramforce = String.valueOf(formatter.format(item.getKilogramforce()));
                strtonforce= String.valueOf(formatter.format(item.getTonforce()));
                strexanewton = String.valueOf(formatter.format(item.getExanewton()));
                strpetanewton = String.valueOf(formatter.format(item.getPetanewton()));
                strteranewton = String.valueOf(formatter.format(item.getTeranewton()));
                strgiganewton = String.valueOf(formatter.format(item.getGiganewton()));
                strmeganewton = String.valueOf(formatter.format(item.getMeganewton()));
                strhectonewton = String.valueOf(formatter.format(item.getHectonewton()));
                strdekanewton = String.valueOf(formatter.format(item.getDekanewton()));
                strdecinewton= String.valueOf(formatter.format(item.getDecinewton()));
                strcentinewton = String.valueOf(formatter.format(item.getCentinewton()));
                strmilinewton = String.valueOf(formatter.format(item.getMilinewton()));
                strmicronewton = String.valueOf(formatter.format(item.getMicronewton()));
                strnanonewton = String.valueOf(formatter.format(item.getNanonewton()));
                strpiconewton = String.valueOf(formatter.format(item.getPiconewton()));
                strfemtonewton= String.valueOf(formatter.format(item.getFemtonewton()));
                strattonewton = String.valueOf(formatter.format(item.getAttonewton()));
                strdyne = String.valueOf(formatter.format(item.getDyne()));
                strjoulepermeter = String.valueOf(formatter.format(item.getJoulepermeter()));
                strjoulepercentimeter = String.valueOf(formatter.format(item.getJoulepercentimeter()));
                strtonforceshort = String.valueOf(formatter.format(item.getTonforceshort()));
                strtonforcelong = String.valueOf(formatter.format(item.getTonforcelong()));
                strkipforce = String.valueOf(formatter.format(item.getKipforce()));
                strkilopoundforce= String.valueOf(formatter.format(item.getKilopoundforce()));
                strpoundforce = String.valueOf(formatter.format(item.getPoundforce()));
                strounceforce = String.valueOf(formatter.format(item.getOunceforce()));
                strpoundal = String.valueOf(formatter.format(item.getPoundal()));
                strpoundfootpersquaresecond = String.valueOf(formatter.format(item.getPoundfootpersquaresecond()));
                strpond= String.valueOf(formatter.format(item.getPond()));
                strkilopond = String.valueOf(formatter.format(item.getKilopond()));






                switch (strSpinnerFromvalue1) {
                    case "Newton - N":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilonewton - kN":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Gram-force - gf":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilogram-force - kgf":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ton-force(metric) - tf":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Exanewton - EN":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Petanewton - PT":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Teranewton - TN":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Giganewton - GN":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Meganewton - MN":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Hectonewton - hN":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Dekanewton - daN":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Decinewton - dN":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Centinewton - cN":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Milinewton - mN":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Micronewton - μN":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Nanonewton - nN":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Piconewton - pN":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Femtonewton - fN":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Attonewton - aN":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Dyne - dyn":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Joule/meter - J/m":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Joule/centimeter - J/cm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ounce-force - ozf":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Ton-force(long) - tonf":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kip-force - kipf":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilopound-force- kipf":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound-force - lbf":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ton-force(short) - tonf":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Poundal - pdl":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound foot/square second - lb*ft/sec²":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pond - p":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilopond - kp":
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
            case "Newton - N":
                editTextValueTo.setText(strnewton);
                break;
            case "Kilonewton - kN":
                editTextValueTo.setText(strkilonewton);
                break;

            case "Gram-force - gf":
                editTextValueTo.setText(strgramforce);
                break;
            case "Kilogram-force - kgf":
                editTextValueTo.setText(strkilogramforce);
                break;
            case "Ton-force(metric) - tf":
                editTextValueTo.setText(strtonforce);
                break;
            case "Exanewton - EN":
                editTextValueTo.setText(strexanewton);
                break;
            case "Petanewton - PT":
                editTextValueTo.setText(strpetanewton);
                break;
            case "Teranewton - TN":
                editTextValueTo.setText(strteranewton);
                break;

            case "Giganewton - GN":
                editTextValueTo.setText(strgiganewton);
                break;
            case "Meganewton - MN":
                editTextValueTo.setText(strmeganewton);
                break;

            case "Hectonewton - hN":
                editTextValueTo.setText(strhectonewton);
                break;
            case "Dekanewton - daN":
                editTextValueTo.setText(strdekanewton);
                break;
            case "Decinewton - dN":
                editTextValueTo.setText(strdecinewton);
                break;
            case "Centinewton - cN":
                editTextValueTo.setText(strcentinewton);
                break;

            case "Milinewton - mN":
                editTextValueTo.setText(strmilinewton);
                break;
            case "Micronewton - μN":
                editTextValueTo.setText(strmicronewton);
                break;

            case "Nanonewton - nN":
                editTextValueTo.setText(strnanonewton);
                break;
            case "Piconewton - pN":
                editTextValueTo.setText(strpiconewton);
                break;
            case "Femtonewton - fN":
                editTextValueTo.setText(strfemtonewton);
                break;
            case "Attonewton - aN":
                editTextValueTo.setText(strattonewton);
                break;
            case "Dyne - dyn":
                editTextValueTo.setText(strdyne);
                break;
            case "Joule/meter - J/m":
                editTextValueTo.setText(strjoulepermeter);
                break;

            case "Joule/centimeter - J/cm":
                editTextValueTo.setText(strjoulepercentimeter);
                break;
            case "Ounce-force - ozf":
                editTextValueTo.setText(strounceforce);
                break;
            case "Ton-force(short) - tonf":
                editTextValueTo.setText(strtonforceshort);
                break;

            case "Ton-force(long) - tonf":
                editTextValueTo.setText(strtonforcelong);
                break;
            case "Kip-force - kipf":
                editTextValueTo.setText(strkipforce);
                break;
            case "Pound-force - lbf":
                editTextValueTo.setText(strpoundforce);
                break;
            case "Kilopound-force- kipf":
                editTextValueTo.setText(strkilopoundforce);
                break;

            case "Poundal - pdl":
                editTextValueTo.setText(strpoundal);
                break;
            case "Pound foot/square second - lb*ft/sec²":
                editTextValueTo.setText(strpoundfootpersquaresecond);
                break;
            case "Pond - p":
                editTextValueTo.setText(strpond);
                break;
            case "Kilopond - kp":
                editTextValueTo.setText(strkilopond);
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