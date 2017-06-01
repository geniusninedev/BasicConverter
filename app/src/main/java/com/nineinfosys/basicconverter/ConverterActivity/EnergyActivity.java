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
import com.nineinfosys.basicconverter.ConverterActivityList.ConversionEnergyListActivity;
import com.nineinfosys.basicconverter.Engin.EnergyConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class EnergyActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher {


    //declaration of designing tools
    private Spinner spinnerConvertFrom, spinnerConvertTo;
    private EditText editTextValue, editTextValueTo;
    private FloatingActionButton buttonList, buttonShare, buttonMail, buttonCopy;
    private SwitchCompat switchChangeType;
    private List<String> listtempFirstfrom, listFirsttempTo, listtempfrom, listtempTo;
    private String stringSpinnerFrom, stringSpinnerTo;
    private TextView textViewBasicUnit, textViewAllUnit,textViewConvert;
    double doubleEdittextvalue = 1.0;
    private int basicunit = 14;
    private int allunit = 54;
    private DecimalFormat formatter = null;
    public static final int REQUEST_CODE = 100;


    EnergyConverter.ConversionResults item;
     private String strJoule= null,strKilojoule= null,strKilowatthour= null,strWatthour= null,strCalorienutritional= null,strHorsepowermetrichour= null,strBtuIT= null,strBtuth= null,
    strGigajoule= null,strMegajoule= null,strMillijoule= null,strMicrojoule= null,strNanojoule= null,strAttojoule= null,strMegaelectronvolt= null,strKiloelectronvolt= null,strElectronvolt= null,
    strErg= null,strGigawatthour= null,strMegawatthour= null,strKilowattsecond= null,strWattsecond= null,strNewtonmeter= null,strHorsepowerhour= null,strKilocalorieIT= null,strKilocalorieth= null,
    strCalorieIT= null,strCalorieth= null,strMegaBtuIT = null,strTonhourrefrigeration= null,strFueloilequivalentkiloliter= null,strFueloilequivalentbarrelUS= null,strGigaton= null,strMegaton= null,
    strKiloton= null,strTonexplosives= null,strDynecentimeter= null,strGramforcemeter= null,strGramforcecentimeter= null,strKilogramforcecentimeter= null,strKilogramforcemeter= null,strKilopondmeter= null,
    strPoundforcefoot= null,strPoundforceinch= null,strOunceforceinch= null,strFootpound= null,strInchpound= null,strInchounce= null,strPoundalfoot= null,strTherm= null,strThermEC= null,strThermUS= null,
    strHartreeenergy= null,strRydbergconstant= null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#59db59")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Energy ");

        formatsetting();

        MobileAds.initialize(EnergyActivity.this, getString(R.string.ads_app_id));
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
        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightgreen)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightgreen)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightgreen)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightgreen)));

        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()),ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightgreen)));
       // DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getTrackDrawable()), ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRed)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textViewConvert.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorLightgreen)));
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#0aa828"));
        }

        textViewBasicUnit.setText(String.valueOf("Basic Units(" + basicunit + ")"));
        textViewAllUnit.setText(String.valueOf("All Units(" + allunit + ")"));


        //adding value to spinner
        listtempFirstfrom = new ArrayList<String>();
        listFirsttempTo = new ArrayList<String>();


        //for first time running spinner
        listtempFirstfrom.add("Btu(IT) - btu(IT),Btu");
        listtempFirstfrom.add("Calorie (nutritional) - cal(nutritional)");
        listtempFirstfrom.add("Electron-volt - eV");
        listtempFirstfrom.add("Erg - erg");
        listtempFirstfrom.add("Foot-pound - ft*lbf");
        listtempFirstfrom.add("Giga joule - GJ");
        listtempFirstfrom.add("Joule - J");
        listtempFirstfrom.add("Kilo calorie(IT) - kcal(IT)");
        listtempFirstfrom.add("Kilo joule - kJ");
        listtempFirstfrom.add("Kilo-watt hour - kW*h");
        listtempFirstfrom.add("Mega joule - MJ");
        listtempFirstfrom.add("Calorie (nutritional) - cal(nutritional)");
        listtempFirstfrom.add("Ton (explosives) - ton");
        listtempFirstfrom.add("Watt-hour - W*h");

        //for first time running spinner
        listFirsttempTo.add("Btu(IT) - btu(IT),Btu");
        listFirsttempTo.add("Calorie (nutritional) - cal(nutritional)");
        listFirsttempTo.add("Electron-volt - eV");
        listFirsttempTo.add("Erg - erg");
        listFirsttempTo.add("Foot-pound - ft*lbf");
        listFirsttempTo.add("Giga joule - GJ");
        listFirsttempTo.add("Joule - J");
        listFirsttempTo.add("Kilo calorie(IT) - kcal(IT)");
        listFirsttempTo.add("Kilo joule - kJ");
        listFirsttempTo.add("Kilo-watt hour - kW*h");
        listFirsttempTo.add("Mega joule - MJ");
        listFirsttempTo.add("Calorie (nutritional) - cal(nutritional)");
        listFirsttempTo.add("Ton (explosives) - ton");
        listFirsttempTo.add("Watt-hour - W*h");

        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(EnergyActivity.this, android.R.layout.simple_spinner_item, listtempFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(EnergyActivity.this, android.R.layout.simple_spinner_item, listFirsttempTo);


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

                listtempfrom = new ArrayList<String>();
                listtempTo = new ArrayList<String>();
                String stringSwitchSate = String.valueOf(isChecked);
                String strBasic = "Basic";
                String strAdvance = "All";
                switch (stringSwitchSate) {

                    case "false":
                        Snackbar.make(buttonView, "You switched to " + strBasic + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listtempfrom.clear();
                        listtempTo.clear();
                        listtempfrom.add("Btu(IT) - btu(IT),Btu");
                        listtempfrom.add("Calorie (nutritional) - cal(nutritional)");
                        listtempfrom.add("Electron-volt - eV");
                        listtempfrom.add("Erg - erg");
                        listtempfrom.add("Foot-pound - ft*lbf");
                        listtempfrom.add("Giga joule - GJ");
                        listtempfrom.add("Joule - J");
                        listtempfrom.add("Kilo calorie(IT) - kcal(IT)");
                        listtempfrom.add("Kilo joule - kJ");
                        listtempfrom.add("Kilo-watt hour - kW*h");
                        listtempfrom.add("Mega joule - MJ");
                        listtempfrom.add("Calorie (nutritional) - cal(nutritional)");
                        listtempfrom.add("Ton (explosives) - ton");
                        listtempfrom.add("Watt-hour - W*h");


                        //2 spinner
                        listtempTo.add("Btu(IT) - btu(IT),Btu");
                        listtempTo.add("Calorie (nutritional) - cal(nutritional)");
                        listtempTo.add("Electron-volt - eV");
                        listtempTo.add("Erg - erg");
                        listtempTo.add("Foot-pound - ft*lbf");
                        listtempTo.add("Giga joule - GJ");
                        listtempTo.add("Joule - J");
                        listtempTo.add("Kilo calorie(IT) - kcal(IT)");
                        listtempTo.add("Kilo joule - kJ");
                        listtempTo.add("Kilo-watt hour - kW*h");
                        listtempTo.add("Mega joule - MJ");
                        listtempTo.add("Calorie (nutritional) - cal(nutritional)");
                        listtempTo.add("Ton (explosives) - ton");
                        listtempTo.add("Watt-hour - W*h");
                        break;

                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strAdvance + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listtempfrom.clear();
                        listtempTo.clear();
                        listtempfrom.add("Joule - J");
                        listtempfrom.add("Kilo joule - kJ");
                        listtempfrom.add("Kilo-watt hour - kW*h");
                        listtempfrom.add("Watt-hour - W*h");
                        listtempfrom.add("Calorie (nutritional) - cal(nutritional)");
                        listtempfrom.add("Horsepower (metric) hour - hp*h");
                        listtempfrom.add("Btu(IT) - btu(IT),Btu");
                        listtempfrom.add("Btu(th) - btu(th)");
                        listtempfrom.add("Giga joule - GJ");
                        listtempfrom.add("Mega joule - MJ");
                        listtempfrom.add("Milli joule - mJ");
                        listtempfrom.add("Micro joule - μj");
                        listtempfrom.add("Nano joule - nJ");
                        listtempfrom.add("Atto joule - aJ");
                        listtempfrom.add("Mega electron-volt - MeV");
                        listtempfrom.add("Kilo electron-volt - KeV");
                        listtempfrom.add("Electron-volt - eV");
                        listtempfrom.add("Erg - erg");
                        listtempfrom.add("Giga watt-hour - GW*h");
                        listtempfrom.add("Mega watt-hour - MW*h");
                        listtempfrom.add("Kilo watt-second - kW*s");
                        listtempfrom.add("Watt-second - W*s");
                        listtempfrom.add("Newton meter - N*m");
                        listtempfrom.add("Horse power hour - hp*h");
                        listtempfrom.add("Kilo calorie(IT) - kcal(IT)");
                        listtempfrom.add("Kilo calorie(th) - kcal(th)");
                        listtempfrom.add("Calorie(IT) - cal(IT),cal");
                        listtempfrom.add("Calorie(th) - cal(th)");
                        listtempfrom.add("Mega Btu (IT) - MBtu(IT)");
                        listtempfrom.add("Ton-hour (refrigeration) - ton*h");
                        listtempfrom.add("Fuel oil equivalent @kiloliter - kl");
                        listtempfrom.add("Fuel oil equivalent @barrel (US)  - bbl");
                        listtempfrom.add("Giga ton - Gton");
                        listtempfrom.add("Mega ton - Mton");
                        listtempfrom.add("Kilo ton - kton");
                        listtempfrom.add("Ton (explosives) - ton");
                        listtempfrom.add("Dyne centimeter - dyn*cm");
                        listtempfrom.add("Gram-force meter - gf*m");
                        listtempfrom.add("Gram-force centimeter - gf*cm");
                        listtempfrom.add("Kilogram-force centimeter - kgf*cm");
                        listtempfrom.add("Kilogram-force meter - kgf*m");
                        listtempfrom.add("Kilo pond meter - kp*m");
                        listtempfrom.add("Pound-force foot - lbf*ft");
                        listtempfrom.add("Pound-force inch - lbf*in");
                        listtempfrom.add("Ounce-force inch - ozf*in");
                        listtempfrom.add("Foot-pound - ft*lbf");
                        listtempfrom.add("Inch-pound - in*lbf");
                        listtempfrom.add("Inch-ounce - in*ozf");
                        listtempfrom.add("Poundal foot - pdl*ft");
                        listtempfrom.add("Therm - therm");
                        listtempfrom.add("Therm(EC) - therm");
                        listtempfrom.add("Therm(US) - therm");
                        listtempfrom.add("Hartree energy - He");
                        listtempfrom.add("Rydberg constant - Rc");


                        //second spinner
                        listtempTo.add("Joule - J");
                        listtempTo.add("Kilo joule - kJ");
                        listtempTo.add("Kilo-watt hour - kW*h");
                        listtempTo.add("Watt-hour - W*h");
                        listtempTo.add("Calorie (nutritional) - cal(nutritional)");
                        listtempTo.add("Horsepower (metric) hour - hp*h");
                        listtempTo.add("Btu(IT) - btu(IT),Btu");
                        listtempTo.add("Btu(th) - btu(th)");
                        listtempTo.add("Giga joule - GJ");
                        listtempTo.add("Mega joule - MJ");
                        listtempTo.add("Milli joule - mJ");
                        listtempTo.add("Micro joule - μj");
                        listtempTo.add("Nano joule - nJ");
                        listtempTo.add("Atto joule - aJ");
                        listtempTo.add("Mega electron-volt - MeV");
                        listtempTo.add("Kilo electron-volt - KeV");
                        listtempTo.add("Electron-volt - eV");
                        listtempTo.add("Erg - erg");
                        listtempTo.add("Giga watt-hour - GW*h");
                        listtempTo.add("Mega watt-hour - MW*h");
                        listtempTo.add("Kilo watt-second - kW*s");
                        listtempTo.add("Watt-second - W*s");
                        listtempTo.add("Newton meter - N*m");
                        listtempTo.add("Horse power hour - hp*h");
                        listtempTo.add("Kilo calorie(IT) - kcal(IT)");
                        listtempTo.add("Kilo calorie(th) - kcal(th)");
                        listtempTo.add("Calorie(IT) - cal(IT),cal");
                        listtempTo.add("Calorie(th) - cal(th)");
                        listtempTo.add("Mega Btu (IT) - MBtu(IT)");
                        listtempTo.add("Ton-hour (refrigeration) - ton*h");
                        listtempTo.add("Fuel oil equivalent @kiloliter - kl");
                        listtempTo.add("Fuel oil equivalent @barrel (US)  - bbl");
                        listtempTo.add("Giga ton - Gton");
                        listtempTo.add("Mega ton - Mton");
                        listtempTo.add("Kilo ton - kton");
                        listtempTo.add("Ton (explosives) - ton");
                        listtempTo.add("Dyne centimeter - dyn*cm");
                        listtempTo.add("Gram-force meter - gf*m");
                        listtempTo.add("Gram-force centimeter - gf*cm");
                        listtempTo.add("Kilogram-force centimeter - kgf*cm");
                        listtempTo.add("Kilogram-force meter - kgf*m");
                        listtempTo.add("Kilo pond meter - kp*m");
                        listtempTo.add("Pound-force foot - lbf*ft");
                        listtempTo.add("Pound-force inch - lbf*in");
                        listtempTo.add("Ounce-force inch - ozf*in");
                        listtempTo.add("Foot-pound - ft*lbf");
                        listtempTo.add("Inch-pound - in*lbf");
                        listtempTo.add("Inch-ounce - in*ozf");
                        listtempTo.add("Poundal foot - pdl*ft");
                        listtempTo.add("Therm - therm");
                        listtempTo.add("Therm(EC) - therm");
                        listtempTo.add("Therm(US) - therm");
                        listtempTo.add("Hartree energy - He");
                        listtempTo.add("Rydberg constant - Rc");

                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(EnergyActivity.this, android.R.layout.simple_spinner_item, listtempfrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(EnergyActivity.this, android.R.layout.simple_spinner_item, listtempTo);


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
                Intent i = new Intent(this, ConversionEnergyListActivity.class);
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

            EnergyConverter c = new EnergyConverter(strSpinnerFromvalue1, doubleEdittextvalue1);
            ArrayList<EnergyConverter.ConversionResults> results = c.calculateenergyConversion();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);

                strJoule =String.valueOf(formatter.format( item.getJoule()));
                strKilojoule =String.valueOf(formatter.format(item.getKilojoule()));
                strKilowatthour =String.valueOf(formatter.format(item.getKilowatthour()));
                strWatthour =String.valueOf(formatter.format(item.getWatthour()));
                strCalorienutritional =String.valueOf(formatter.format(item.getCalorie()));
                strHorsepowermetrichour =String.valueOf(formatter.format(item.getHorsepower()));
                strBtuIT =String.valueOf(formatter.format(item.getBtuIT()));
                strBtuth =String.valueOf(formatter.format(item.getBtuth()));
                strGigajoule =String.valueOf(formatter.format(item.getGigajoule()));
                strMegajoule =String.valueOf(formatter.format(item.getMegajoule()));
                strMillijoule =String.valueOf(formatter.format(item.getMillijoule()));
                strMicrojoule =String.valueOf(formatter.format(item.getMicrojoule()));
                strNanojoule =String.valueOf(formatter.format(item.getNanojoule()));
                strAttojoule =String.valueOf(formatter.format(item.getAttojoule()));
                strMegaelectronvolt =String.valueOf(formatter.format(item.getMegaelectronvolt()));
                strKiloelectronvolt =String.valueOf(formatter.format(item.getKiloelectronvolt()));
                strElectronvolt =String.valueOf(formatter.format(item.getElectronvolt()));
                strErg =String.valueOf(formatter.format(item.getErg()));
                strGigawatthour =String.valueOf(formatter.format(item.getGigawatthour()));
                strMegawatthour =String.valueOf(formatter.format(item.getMegawatthour()));
                strKilowattsecond =String.valueOf(formatter.format(item.getKilowattsecond()));
                strWattsecond =String.valueOf(formatter.format(item.getWattsecond()));
                strNewtonmeter =String.valueOf(formatter.format(item.getNewtonmeter()));
                strHorsepowerhour =String.valueOf(formatter.format(item.getHorsepowerhour()));
                strKilocalorieIT =String.valueOf(formatter.format(item.getKilocalorieIT()));
                strKilocalorieth =String.valueOf(formatter.format(item.getKilocalorieth()));
                strCalorieIT =String.valueOf(formatter.format(item.getCalorieit()));
                strCalorieth =String.valueOf(formatter.format(item.getCalorieth()));
                strMegaBtuIT =String.valueOf(formatter.format(item.getMegaBtuIT()));
                strTonhourrefrigeration =String.valueOf(formatter.format(item.getTonhour()));
                strFueloilequivalentkiloliter =String.valueOf(formatter.format(item.getFuelkl()));
                strFueloilequivalentbarrelUS =String.valueOf(formatter.format(item.getFuelb()));
                strGigaton =String.valueOf(formatter.format(item.getGigaton()));
                strMegaton =String.valueOf(formatter.format(item.getMegaton()));
                strKiloton =String.valueOf(formatter.format(item.getKiloton()));
                strTonexplosives =String.valueOf(formatter.format(item.getTon()));
                strDynecentimeter =String.valueOf(formatter.format(item.getDynecm()));
                strGramforcemeter =String.valueOf(formatter.format(item.getGfm()));
                strGramforcecentimeter=String.valueOf(formatter.format(item.getGfcm()));
                strKilogramforcecentimeter =String.valueOf(formatter.format(item.getKgfcm()));
                strKilogramforcemeter =String.valueOf(formatter.format(item.getKgfm()));
                strKilopondmeter =String.valueOf(formatter.format(item.getKpm()));
                strPoundforcefoot =String.valueOf(formatter.format(item.getPff()));
                strPoundforceinch =String.valueOf(formatter.format(item.getPfi()));
                strOunceforceinch =String.valueOf(formatter.format(item.getOfi()));
                strFootpound =String.valueOf(formatter.format(item.getFp()));
                strInchpound =String.valueOf(formatter.format(item.getIp()));
                strInchounce =String.valueOf(formatter.format(item.getIo()));
                strPoundalfoot =String.valueOf(formatter.format(item.getPdlft()));
                strTherm =String.valueOf(formatter.format(item.getTherm()));
                strThermEC =String.valueOf(formatter.format(item.getThermec()));
                strThermUS =String.valueOf(formatter.format(item.getThermus()));
                strHartreeenergy =String.valueOf(formatter.format(item.getHartree()));
                strRydbergconstant =String.valueOf(formatter.format(item.getRydberg()));

                switch (strSpinnerFromvalue1) {
                    case "Joule - J":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilo joule - kJ":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilo-watt hour - kW*h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Watt-hour - W*h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Calorie (nutritional) - cal(nutritional)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Horsepower (metric) hour - hp*h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Btu(IT) - btu(IT),Btu":
                        conversion(strSpinnerTovalue2);
                        break;
                    case  "Btu(th) - btu(th)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case  "Giga joule - GJ":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Mega joule - MJ":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Milli joule - mJ":
                        conversion(strSpinnerTovalue2);
                        break;
                    case  "Micro joule - μj":
                        conversion(strSpinnerTovalue2);
                        break;
                    case  "Nano joule - nJ":
                        conversion(strSpinnerTovalue2);
                        break;
                    case  "Atto joule - aJ":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Mega electron-volt - MeV":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilo electron-volt - KeV":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Electron-volt - eV":
                        conversion(strSpinnerTovalue2);
                        break;
                    case  "Erg - erg":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Giga watt-hour - GW*h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case  "Mega watt-hour - MW*h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilo watt-second - kW*s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Watt-second - W*s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Newton meter - N*m":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Horse power hour - hp*h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilo calorie(IT) - kcal(IT)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilo calorie(th) - kcal(th)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Calorie(IT) - cal(IT),cal":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Calorie(th) - cal(th)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case  "Mega Btu (IT) - MBtu(IT)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ton-hour (refrigeration) - ton*h":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Fuel oil equivalent @kiloliter - kl":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Fuel oil equivalent @barrel (US)  - bbl":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Giga ton - Gton":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Mega ton - Mton":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilo ton - kton":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ton (explosives) - ton":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Dyne centimeter - dyn*cm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gram-force meter - gf*m":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gram-force centimeter - gf*cm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilogram-force centimeter - kgf*cm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilogram-force meter - kgf*m":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilo pond meter - kp*m":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound-force foot - lbf*ft":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pound-force inch - lbf*in":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ounce-force inch - ozf*in":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Foot-pound - ft*lbf":
                        conversion(strSpinnerTovalue2);
                        break;
                    case  "Inch-pound - in*lbf":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Inch-ounce - in*ozf":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Poundal foot - pdl*ft":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Therm - therm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Therm(EC) - therm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case  "Therm(US) - therm":
                        conversion(strSpinnerTovalue2);
                        break;
                    case  "Hartree energy - He":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Rydberg constant - Rc":
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
            case "Joule - J":
                editTextValueTo.setText(strJoule);
                break;
            case "Kilo joule - kJ":
                editTextValueTo.setText(strKilojoule);
                break;
            case "Kilo-watt hour - kW*h":
                editTextValueTo.setText(strKilowatthour);
                break;
            case "Watt-hour - W*h":
                editTextValueTo.setText(strWatthour);
                break;
            case "Calorie (nutritional) - cal(nutritional)":
                editTextValueTo.setText(strCalorienutritional);
                break;
            case "Horsepower (metric) hour - hp*h":
                editTextValueTo.setText(strHorsepowermetrichour);
                break;
            case "Btu(IT) - btu(IT),Btu":
                editTextValueTo.setText(strBtuIT);
                break;
            case  "Btu(th) - btu(th)":
                editTextValueTo.setText(strBtuth);
                break;
            case  "Giga joule - GJ":
                editTextValueTo.setText(strGigajoule);
                break;
            case "Mega joule - MJ":
                editTextValueTo.setText(strMegajoule);
                break;
            case "Milli joule - mJ":
                editTextValueTo.setText(strMillijoule);
                break;
            case  "Micro joule - μj":
                editTextValueTo.setText(strMicrojoule);
                break;
            case  "Nano joule - nJ":
                editTextValueTo.setText(strNanojoule);
                break;
            case  "Atto joule - aJ":
                editTextValueTo.setText(strAttojoule);
                break;
            case "Mega electron-volt - MeV":
                editTextValueTo.setText(strMegaelectronvolt);
                break;
            case "Kilo electron-volt - KeV":
                editTextValueTo.setText(strKiloelectronvolt);
                break;
            case "Electron-volt - eV":
                editTextValueTo.setText(strElectronvolt);
                break;
            case  "Erg - erg":
                editTextValueTo.setText(strErg);
                break;
            case "Giga watt-hour - GW*h":
                editTextValueTo.setText(strGigawatthour);
                break;
            case  "Mega watt-hour - MW*h":
                editTextValueTo.setText(strMegawatthour);
                break;
            case "Kilo watt-second - kW*s":
                editTextValueTo.setText(strKilowattsecond);
                break;
            case "Watt-second - W*s":
                editTextValueTo.setText(strWattsecond);
                break;
            case "Newton meter - N*m":
                editTextValueTo.setText(strNewtonmeter);
                break;
            case "Horse power hour - hp*h":
                editTextValueTo.setText(strHorsepowerhour);
                break;
            case "Kilo calorie(IT) - kcal(IT)":
                editTextValueTo.setText(strKilocalorieIT);
                break;
            case "Kilo calorie(th) - kcal(th)":
                editTextValueTo.setText(strKilocalorieth);
                break;
            case "Calorie(IT) - cal(IT),cal":
                editTextValueTo.setText(strCalorieIT);
                break;
            case "Calorie(th) - cal(th)":
                editTextValueTo.setText(strCalorieth);
                break;
            case  "Mega Btu (IT) - MBtu(IT)":
                editTextValueTo.setText(strMegaBtuIT);
                break;
            case "Ton-hour (refrigeration) - ton*h":
                editTextValueTo.setText(strTonhourrefrigeration);
                break;
            case "Fuel oil equivalent @kiloliter - kl":
                editTextValueTo.setText(strFueloilequivalentkiloliter);
                break;
            case "Fuel oil equivalent @barrel (US)  - bbl":
                editTextValueTo.setText(strFueloilequivalentbarrelUS);
                break;
            case "Giga ton - Gton":
                editTextValueTo.setText(strGigaton);
                break;
            case "Mega ton - Mton":
                editTextValueTo.setText(strMegaton);
                break;
            case "Kilo ton - kton":
                editTextValueTo.setText(strKiloton);
                break;
            case "Ton (explosives) - ton":
                editTextValueTo.setText(strTonexplosives);
                break;
            case "Dyne centimeter - dyn*cm":
                editTextValueTo.setText(strDynecentimeter);
                break;
            case "Gram-force meter - gf*m":
                editTextValueTo.setText(strGramforcemeter);
                break;
            case "Gram-force centimeter - gf*cm":
                editTextValueTo.setText(strGramforcecentimeter);
                break;
            case "Kilogram-force centimeter - kgf*cm":
                editTextValueTo.setText(strKilogramforcecentimeter);
                break;
            case "Kilogram-force meter - kgf*m":
                editTextValueTo.setText(strKilogramforcemeter);
                break;
            case "Kilo pond meter - kp*m":
                editTextValueTo.setText(strKilopondmeter);
                break;
            case "Pound-force foot - lbf*ft":
                editTextValueTo.setText(strPoundforcefoot);
                break;
            case "Pound-force inch - lbf*in":
                editTextValueTo.setText(strPoundforceinch);
                break;
            case "Ounce-force inch - ozf*in":
                editTextValueTo.setText(strOunceforceinch);
                break;
            case "Foot-pound - ft*lbf":
                editTextValueTo.setText(strFootpound);
                break;
            case  "Inch-pound - in*lbf":
                editTextValueTo.setText(strInchpound);
                break;
            case "Inch-ounce - in*ozf":
                editTextValueTo.setText(strInchounce);
                break;
            case "Poundal foot - pdl*ft":
                editTextValueTo.setText(strPoundalfoot);
                break;
            case "Therm - therm":
                editTextValueTo.setText(strTherm);
                break;
            case "Therm(EC) - therm":
                editTextValueTo.setText(strThermEC);
                break;
            case  "Therm(US) - therm":
                editTextValueTo.setText(strThermUS);
                break;
            case  "Hartree energy - He":
                editTextValueTo.setText(strHartreeenergy);
                break;
            case "Rydberg constant - Rc":
                editTextValueTo.setText(strRydbergconstant);
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

  /*   @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.action_settings) {

            Intent i = new Intent(this, ActivitySetting.class);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivityForResult(i, REQUEST_CODE);
            return true;
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

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if(resultCode == RESULT_OK){
                String stredittext=data.getStringExtra("edittextvalue");
                editTextValue.setText(stredittext);
            }
        }
    }
}*/