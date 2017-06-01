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
import com.nineinfosys.basicconverter.ConverterActivityList.ConversionVolumeListActivity;
import com.nineinfosys.basicconverter.Engin.Volume;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class VolumeActivity  extends AppCompatActivity implements View.OnClickListener,TextWatcher {


    //declaration of designing tools
    private Spinner spinnerConvertFrom, spinnerConvertTo;
    private EditText editTextValue, editTextValueTo;

    private FloatingActionButton buttonList, buttonShare, buttonMail, buttonCopy;
    private SwitchCompat switchChangeType;
    private List<String> listVoumeFirstfrom, listVolumeFirstTo, listvolumefrom, listvolumeTo;
    private String stringSpinnerFrom, stringSpinnerTo;
    private TextView textViewBasicUnit, textViewAllUnit,textViewConvert;
    double doubleEdittextvalue = 1.0;
    private int basicunit = 19;
    private int allunit = 76;
    private DecimalFormat formatter = null;

    private Volume.ConversionResults item;

    private String strcubicmeter =null;
    private String strcubickilometer =null;
    private String strcubiccentimeter=null;
    private String strcubicmillimeter=null;
    private String strliter=null;
    private String strmilliliter=null;
    private String strgallon=null;
    private String strquart =null;
    private String strpint =null;
    private String strcup =null;
    private String strtablespoon =null;
    private String strteaspoon =null;
    private String strcubicmile =null;
    private String strcubicyard=null;
    private String strcubicfoot=null;
    private String strcubicinch=null;
    private String strcubicdecimeter=null;
    private String strexaliter =null;
    private String strpetaliter =null;
    private String strteraliter =null;
    private String strgigaliter =null;
    private String strmegaliter =null;
    private String strkiloliter =null;
    private String strhectoliter =null;
    private String strdekaliter =null;
    private String strdeciliter =null;
    private String strcentiliter =null;
    private String strmicroliter =null;
    private String strnanoliter =null;
    private String strpicoliter =null;
    private String strfemtoliter =null;
    private String strattoliter =null;
    private String strcc =null;
    private String strdrop =null;
    private String strbarreloil =null;
    private String strbarrelUS =null;
    private String strbarrelUK =null;
    private String strgallonUK =null;
    private String strquartUK =null;
    private String strpintUK =null;
    private String strcupmetric  =null;
    private String strcupUK =null;
    private String strfluidounceUS=null;
    private String strfluidounceUK=null;
    private String strTablespoonmetric=null;
    private String strTablespoonUK=null;
    private String strdesertspoonUS =null;
    private String strdesertspoonUK  =null;
    private String strTeaspoonmetric =null;
    private String strTeaspoonUK=null;
    private String strGillUS=null;
    private String strGillUK=null;
    private String strMinimUS=null;
    private String strMinimUK=null;
    private String strTonregister=null;
    private String strCcf=null;
    private String strhundredcubicfoot=null;
    private String strAcrefoot=null;
    private String strAcrefootUS=null;
    private String strAcreinch=null;
    private String strDekastere=null;
    private String strStere=null;
    private String strDecistere=null;
    private String strCord=null;
    private String strTun=null;
    private String strHogshead=null;
    private String strBoardfoot=null;
    private String strdramt=null;
    private String strCor=null;
    private String strHomer=null;
    private String strBath=null;
    private String strHin=null;
    private String strCab=null;
    private String strLog=null;
    private String strTaza=null;
    private String strEarthsvolume=null;
    public static final int REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#2eaf46")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Volume");

        formatsetting();


        MobileAds.initialize(VolumeActivity.this, getString(R.string.ads_app_id));
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
        // DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getTrackDrawable()), ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRed)));
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
        listVoumeFirstfrom = new ArrayList<String>();
        listVolumeFirstTo = new ArrayList<String>();


        //for first time running spinner
        listVoumeFirstfrom.add("Liter - L");
        listVoumeFirstfrom.add("Centiliter  - cL");
        listVoumeFirstfrom.add("Milliliter  - mL");
        listVoumeFirstfrom.add("Cubic meter - m^3");
        listVoumeFirstfrom.add("Cubic yard - yd^3");
        listVoumeFirstfrom.add("Cubic foot - ft^3");
        listVoumeFirstfrom.add("Cubic inches - yd^3");
        listVoumeFirstfrom.add("Cubic centimeter - cm^3");
        listVoumeFirstfrom.add("Cubic millimeter - mm^3");
        listVoumeFirstfrom.add("Kiloliter  - kL");
        listVoumeFirstfrom.add("Barrel(US) - bbl");
        listVoumeFirstfrom.add("Tablespoon - tblsp");
        listVoumeFirstfrom.add("Teaspoon - tsp");
        listVoumeFirstfrom.add("Quart(US) - qt");
        listVoumeFirstfrom.add("Gallons(US) - gallon");
        listVoumeFirstfrom.add("Pint(US)  - pt");
        listVoumeFirstfrom.add("Gill(US)  - gi");
        listVoumeFirstfrom.add("Gill(UK)  - gi");

        
        listVolumeFirstTo.add("Liter - L");
        listVolumeFirstTo.add("Centiliter  - cL");
        listVolumeFirstTo.add("Milliliter  - mL");
        listVolumeFirstTo.add("Cubic meter - m^3");
        listVolumeFirstTo.add("Cubic yard - yd^3");
        listVolumeFirstTo.add("Cubic foot - ft^3");
        listVolumeFirstTo.add("Cubic inches - yd^3");
        listVolumeFirstTo.add("Cubic centimeter - cm^3");
        listVolumeFirstTo.add("Cubic millimeter - mm^3");
        listVolumeFirstTo.add("Kiloliter  - kL");
        listVolumeFirstTo.add("Barrel(US) - bbl");
        listVolumeFirstTo.add("Tablespoon - tblsp");
        listVolumeFirstTo.add("Teaspoon - tsp");
        listVolumeFirstTo.add("Quart(US) - qt");
        listVolumeFirstTo.add("Gallons(US) - gallon");
        listVolumeFirstTo.add("Pint(US)  - pt");
        listVolumeFirstTo.add("Gill(US)  - gi");
        listVolumeFirstTo.add("Gill(UK)  - gi");


        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(VolumeActivity.this, android.R.layout.simple_spinner_item, listVoumeFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(VolumeActivity.this, android.R.layout.simple_spinner_item, listVolumeFirstTo);


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

                listvolumefrom = new ArrayList<String>();
                listvolumeTo = new ArrayList<String>();
                String stringSwitchSate = String.valueOf(isChecked);
                String strBasic = "Basic";
                String strAdvance = "All";
                switch (stringSwitchSate) {

                    case "false":
                        Snackbar.make(buttonView, "You switched to " + strAdvance + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listvolumefrom.clear();
                        listvolumeTo.clear();
                        listvolumefrom.add("Liter - L");
                        listvolumefrom.add("Centiliter  - cL");
                        listvolumefrom.add("Milliliter  - mL");
                        listvolumefrom.add("Cubic meter - m^3");
                        listvolumefrom.add("Cubic yard - yd^3");
                        listvolumefrom.add("Cubic foot - ft^3");
                        listvolumefrom.add("Cubic inches - yd^3");
                        listvolumefrom.add("Cubic centimeter - cm^3");
                        listvolumefrom.add("Cubic millimeter - mm^3");
                        listvolumefrom.add("Kiloliter  - kL");
                        listvolumefrom.add("Barrel(US) - bbl");
                        listvolumefrom.add("Tablespoon - tblsp");
                        listvolumefrom.add("Teaspoon - tsp");
                        listvolumefrom.add("Quart(US) - qt");
                        listvolumefrom.add("Gallons(US) - gallon");
                        listvolumefrom.add("Pint(US)  - pt");
                        listvolumefrom.add("Gill(US)  - gi");
                        listvolumefrom.add("Gill(UK)  - gi");

                        //second spinner
                        listvolumeTo.add("Liter - L");
                        listvolumeTo.add("Centiliter  - cL");
                        listvolumeTo.add("Milliliter  - mL");
                        listvolumeTo.add("Cubic meter - m^3");
                        listvolumeTo.add("Cubic yard - yd^3");
                        listvolumeTo.add("Cubic foot - ft^3");
                        listvolumeTo.add("Cubic inches - yd^3");
                        listvolumeTo.add("Cubic centimeter - cm^3");
                        listvolumeTo.add("Cubic millimeter - mm^3");
                        listvolumeTo.add("Kiloliter  - kL");
                        listvolumeTo.add("Barrel(US) - bbl");
                        listvolumeTo.add("Tablespoon - tblsp");
                        listvolumeTo.add("Teaspoon - tsp");
                        listvolumeTo.add("Quart(US) - qt");
                        listvolumeTo.add("Gallons(US) - gallon");
                        listvolumeTo.add("Pint(US)  - pt");
                        listvolumeTo.add("Gill(US)  - gi");
                        listvolumeTo.add("Gill(UK)  - gi");

                        break;
                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strBasic + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listvolumefrom.clear();
                        listvolumeTo.clear();
                        listvolumefrom.add("Cubic meter - m^3");
                        listvolumefrom.add("Cubic kilometer  - km^3");
                        listvolumefrom.add("Cubic centimeter  - cm^3");
                        listvolumefrom.add("Cubic millimeter - mm^3");
                        listvolumefrom.add("Liter - L");
                        listvolumefrom.add("Milliliter  - mL");
                        listvolumefrom.add("Gallons(US) - gallon");
                        listvolumefrom.add("Quart(US) - qt");
                        listvolumefrom.add("Pint(US)  - pt");
                        listvolumefrom.add("Cup(US)  - cup");
                        listvolumefrom.add("Tablespoon - tblsp");
                        listvolumefrom.add("Teaspoon - tsp");
                        listvolumefrom.add("Cubic mile - mi^3");
                        listvolumefrom.add("Cubic yard - yd^3");
                        listvolumefrom.add("Cubic foot - ft^3");
                        listvolumefrom.add("Cubic inch - in^3");
                        listvolumefrom.add("Cubic decimeter - dm^3");
                        listvolumefrom.add("Exaliter - EL");
                        listvolumefrom.add("Petaliter - PL");
                        listvolumefrom.add("Teraliter - TL");
                        listvolumefrom.add("Gigaliter - GL");
                        listvolumefrom.add("Megaliter - ML");
                        listvolumefrom.add("Kiloliter - kL");
                        listvolumefrom.add("Hectoliter - hL");
                        listvolumefrom.add("Dekaliter - daL");
                        listvolumefrom.add("Deciliter - dL");
                        listvolumefrom.add("Centiliter - cL");
                        listvolumefrom.add("Microliter - µL");
                        listvolumefrom.add("Nanoliter - nL");
                        listvolumefrom.add("Picoliter - pL");
                        listvolumefrom.add("Femtoliter - fL");
                        listvolumefrom.add("Attoliter - aL");
                        listvolumefrom.add("Cc - cc");
                        listvolumefrom.add("Drop - drop");
                        listvolumefrom.add("Barrel(oil) - bbl");
                        listvolumefrom.add("Barrel(US) - bbl");
                        listvolumefrom.add("Barrel(UK) - bbl");
                        listvolumefrom.add("Gallon - gallon");
                        listvolumefrom.add("Quart(UK) - qt");
                        listvolumefrom.add("Pint(UK) - pt");
                        listvolumefrom.add("Cup(Metric) - cup");
                        listvolumefrom.add("Cup(UK) - cup");
                        listvolumefrom.add("Fluid ounce(US) - fl oz");
                        listvolumefrom.add("Fluid ounce(UK) - fl oz");
                        listvolumefrom.add("Tablespoon(Metric) - tblsp");
                        listvolumefrom.add("Tablespoon(UK) - tblsp");
                        listvolumefrom.add("Dessertspoon(US) - dsp");
                        listvolumefrom.add("Dessertspoon(UK) - dsp");
                        listvolumefrom.add("Teaspoon(Metric) - tsp");
                        listvolumefrom.add("Teaspoon(UK) - tsp");
                        listvolumefrom.add("Gill(US)  - gi");
                        listvolumefrom.add("Gill(UK)  - gi");
                        listvolumefrom.add("Minim(US)  - min");
                        listvolumefrom.add("Minim(UK)  - min");
                        listvolumefrom.add("Ton register - ton reg");
                        listvolumefrom.add("Ccf  - ccf");
                        listvolumefrom.add("Hundred-cubic foot - 100 ft^3");
                        listvolumefrom.add("Acre-foot - ac*ft");
                        listvolumefrom.add("Acre-foot(US)  - ac*ft");
                        listvolumefrom.add("Acre-inch - ac*in");
                        listvolumefrom.add("Dekastere  - daSt");
                        listvolumefrom.add("Stere  - st");
                        listvolumefrom.add("Decistere  - dSt");
                        listvolumefrom.add("Cord  - cd");
                        listvolumefrom.add("Tun  - tun");
                        listvolumefrom.add("Hogshead  - hogshead");
                        listvolumefrom.add("Board foot  - bft");
                        listvolumefrom.add("Dram  - dr");
                        listvolumefrom.add("Cor(Biblical) - cor");
                        listvolumefrom.add("Homer(Biblical) - homer");
                        listvolumefrom.add("Bath(Biblical) - bath");
                        listvolumefrom.add("Hin(Biblical) - hin");
                        listvolumefrom.add("Cab(Biblical) - cab");
                        listvolumefrom.add("Log(Biblical) - log");
                        listvolumefrom.add("Taza(Spanish) - taza");
                        listvolumefrom.add("Earth's volume - earth");
                       

                        //second spinner
                        listvolumeTo.add("Cubic meter - m^3");
                        listvolumeTo.add("Cubic kilometer  - km^3");
                        listvolumeTo.add("Cubic centimeter  - cm^3");
                        listvolumeTo.add("Cubic millimeter - mm^3");
                        listvolumeTo.add("Liter - L");
                        listvolumeTo.add("Milliliter  - mL");
                        listvolumeTo.add("Gallons(US) - gallon");
                        listvolumeTo.add("Quart(US) - qt");
                        listvolumeTo.add("Pint(US)  - pt");
                        listvolumeTo.add("Cup(US)  - cup");
                        listvolumeTo.add("Tablespoon - tblsp");
                        listvolumeTo.add("Teaspoon - tsp");
                        listvolumeTo.add("Cubic mile - mi^3");
                        listvolumeTo.add("Cubic yard - yd^3");
                        listvolumeTo.add("Cubic foot - ft^3");
                        listvolumeTo.add("Cubic inch - in^3");
                        listvolumeTo.add("Cubic decimeter - dm^3");
                        listvolumeTo.add("Exaliter - EL");
                        listvolumeTo.add("Petaliter - PL");
                        listvolumeTo.add("Teraliter - TL");
                        listvolumeTo.add("Gigaliter - GL");
                        listvolumeTo.add("Megaliter - ML");
                        listvolumeTo.add("Kiloliter - kL");
                        listvolumeTo.add("Hectoliter - hL");
                        listvolumeTo.add("Dekaliter - daL");
                        listvolumeTo.add("Deciliter - dL");
                        listvolumeTo.add("Centiliter - cL");
                        listvolumeTo.add("Microliter - µL");
                        listvolumeTo.add("Nanoliter - nL");
                        listvolumeTo.add("Picoliter - pL");
                        listvolumeTo.add("Femtoliter - fL");
                        listvolumeTo.add("Attoliter - aL");
                        listvolumeTo.add("Cc - cc");
                        listvolumeTo.add("Drop - drop");
                        listvolumeTo.add("Barrel(oil) - bbl");
                        listvolumeTo.add("Barrel(US) - bbl");
                        listvolumeTo.add("Barrel(UK) - bbl");
                        listvolumeTo.add("Gallon - gallon");
                        listvolumeTo.add("Quart(UK) - qt");
                        listvolumeTo.add("Pint(UK) - pt");
                        listvolumeTo.add("Cup(Metric) - cup");
                        listvolumeTo.add("Cup(UK) - cup");
                        listvolumeTo.add("Fluid ounce(US) - fl oz");
                        listvolumeTo.add("Fluid ounce(UK) - fl oz");
                        listvolumeTo.add("Tablespoon(Metric) - tblsp");
                        listvolumeTo.add("Tablespoon(UK) - tblsp");
                        listvolumeTo.add("Dessertspoon(US) - dsp");
                        listvolumeTo.add("Dessertspoon(UK) - dsp");
                        listvolumeTo.add("Teaspoon(Metric) - tsp");
                        listvolumeTo.add("Teaspoon(UK) - tsp");
                        listvolumeTo.add("Gill(US)  - gi");
                        listvolumeTo.add("Gill(UK)  - gi");
                        listvolumeTo.add("Minim(US)  - min");
                        listvolumeTo.add("Minim(UK)  - min");
                        listvolumeTo.add("Ton register - ton reg");
                        listvolumeTo.add("Ccf  - ccf");
                        listvolumeTo.add("Hundred-cubic foot - 100 ft^3");
                        listvolumeTo.add("Acre-foot - ac*ft");
                        listvolumeTo.add("Acre-foot(US)  - ac*ft");
                        listvolumeTo.add("Acre-inch - ac*in");
                        listvolumeTo.add("Dekastere  - daSt");
                        listvolumeTo.add("Stere  - st");
                        listvolumeTo.add("Decistere  - dSt");
                        listvolumeTo.add("Cord  - cd");
                        listvolumeTo.add("Tun  - tun");
                        listvolumeTo.add("Hogshead  - hogshead");
                        listvolumeTo.add("Board foot  - bft");
                        listvolumeTo.add("Dram  - dr");
                        listvolumeTo.add("Cor(Biblical) - cor");
                        listvolumeTo.add("Homer(Biblical) - homer");
                        listvolumeTo.add("Bath(Biblical) - bath");
                        listvolumeTo.add("Hin(Biblical) - hin");
                        listvolumeTo.add("Cab(Biblical) - cab");
                        listvolumeTo.add("Log(Biblical) - log");
                        listvolumeTo.add("Taza(Spanish) - taza");
                        listvolumeTo.add("Earth's volume - earth");
                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(VolumeActivity.this, android.R.layout.simple_spinner_item, listvolumefrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(VolumeActivity.this, android.R.layout.simple_spinner_item, listvolumeTo);


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
                Intent i = new Intent(this, ConversionVolumeListActivity.class);
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

            Volume c = new Volume(strSpinnerFromvalue1, doubleEdittextvalue1);
            ArrayList<Volume.ConversionResults> results = c.calculateVolumeConversion();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);

                strcubicmeter = String.valueOf(formatter.format(item.getCubicmeter()));
                strcubickilometer = String.valueOf(formatter.format(item.getCubickilometer()));
                strcubiccentimeter = String.valueOf(formatter.format(item.getCubiccentimeter()));
                strcubicmillimeter = String.valueOf(formatter.format(item.getCubicmillimeter()));
                strliter= String.valueOf(formatter.format(item.getLiter()));
                strmilliliter = String.valueOf(formatter.format(item.getMilliliter()));
                strgallon = String.valueOf(formatter.format(item.getGallon()));
                strquart = String.valueOf(formatter.format(item.getQuart()));
                strpint = String.valueOf(formatter.format(item.getPintUS()));
                strcup = String.valueOf(formatter.format(item.getCupUS()));
                strtablespoon = String.valueOf(formatter.format(item.getTablespoonUS()));
                strteaspoon = String.valueOf(formatter.format(item.getTeaspoonUS()));
                strcubicmile= String.valueOf(formatter.format(item.getCubicmile()));
                strcubicyard = String.valueOf(formatter.format(item.getCubicyard()));
                strcubicfoot = String.valueOf(formatter.format(item.getCubicfoot()));
                strcubicinch = String.valueOf(formatter.format(item.getCubicinch()));
                strcubicdecimeter = String.valueOf(formatter.format(item.getCubicdecimeter()));
                strexaliter = String.valueOf(formatter.format(item.getExaliter()));
                strpetaliter= String.valueOf(formatter.format(item.getPetaliter()));
                strteraliter = String.valueOf(formatter.format(item.getTeraliter()));
                strgigaliter = String.valueOf(formatter.format(item.getGigaliter()));
                strmegaliter = String.valueOf(formatter.format(item.getMegaliter()));
                strkiloliter = String.valueOf(formatter.format(item.getKiloliter()));
                strhectoliter = String.valueOf(formatter.format(item.getHectoliter()));
                strdekaliter = String.valueOf(formatter.format(item.getDekaliter()));
                strdeciliter = String.valueOf(formatter.format(item.getDeciliter()));
                strcentiliter= String.valueOf(formatter.format(item.getCentiliter()));
                strmicroliter = String.valueOf(formatter.format(item.getMicroliter()));
                strnanoliter = String.valueOf(formatter.format(item.getNanoliter()));
                strpicoliter = String.valueOf(formatter.format(item.getPicoliter()));
                strfemtoliter = String.valueOf(formatter.format(item.getFemtoliter()));
                strattoliter= String.valueOf(formatter.format(item.getAttoliter()));
                strcc = String.valueOf(formatter.format(item.getCc()));
                strdrop = String.valueOf(formatter.format(item.getDrop()));
                strbarreloil = String.valueOf(formatter.format(item.getBarreloil()));
                strbarrelUS= String.valueOf(formatter.format(item.getBarrelUS()));
                strbarrelUK = String.valueOf(formatter.format(item.getBarrelUK()));

                strgallonUK = String.valueOf(formatter.format(item.getGallonUK()));
                strquartUK = String.valueOf(formatter.format(item.getQuartUK()));
                strpintUK = String.valueOf(formatter.format(item.getPintUK()));
                strcupmetric = String.valueOf(formatter.format(item.getCupmetric()));
                strcupUK= String.valueOf(formatter.format(item.getCupUK()));
                strfluidounceUS = String.valueOf(formatter.format(item.getFluidounceUK()));
                strfluidounceUK = String.valueOf(formatter.format(item.getFluidounceUS()));
                strTablespoonmetric = String.valueOf(formatter.format(item.getTablespoonmetric()));
                strTablespoonUK = String.valueOf(formatter.format(item.getTablespoonUK()));
                strdesertspoonUS = String.valueOf(formatter.format(item.getDessertspoonUS()));
                strdesertspoonUK = String.valueOf(formatter.format(item.getDessertspoonUK()));
                strTeaspoonmetric = String.valueOf(formatter.format(item.getTeaspoonmetric()));
                strTeaspoonUK= String.valueOf(formatter.format(item.getTeaspoonUK()));
                strGillUS = String.valueOf(formatter.format(item.getGillUS()));
                strGillUK = String.valueOf(formatter.format(item.getGillUK()));
                strMinimUS = String.valueOf(formatter.format(item.getMinimUS()));
                strMinimUK = String.valueOf(formatter.format(item.getMinimUK()));
                strTonregister = String.valueOf(formatter.format(item.getTonregister()));
                strCcf= String.valueOf(formatter.format(item.getCcf()));
                strhundredcubicfoot = String.valueOf(formatter.format(item.getHundredcubicfoot()));
                strAcrefoot = String.valueOf(formatter.format(item.getAcrefoot()));
                strAcrefootUS = String.valueOf(formatter.format(item.getAcrefootUSsurvey()));
                strAcreinch = String.valueOf(formatter.format(item.getAcreinch()));

                strDekastere = String.valueOf(formatter.format(item.getDekastere()));
                strStere = String.valueOf(formatter.format(item.getStere()));
                strDecistere = String.valueOf(formatter.format(item.getDecistere()));
                strCord = String.valueOf(formatter.format(item.getCord()));
                strTun= String.valueOf(formatter.format(item.getTun()));
                strHogshead = String.valueOf(formatter.format(item.getHogshead()));
                strBoardfoot = String.valueOf(formatter.format(item.getBoardfoot()));
                strdramt = String.valueOf(formatter.format(item.getDram()));
                strCor = String.valueOf(formatter.format(item.getCor()));
                strHomer = String.valueOf(formatter.format(item.getHomerBiblical()));

                strBath = String.valueOf(formatter.format(item.getBathBiblical()));
                strHin = String.valueOf(formatter.format(item.getHinBiblical()));
                strCab = String.valueOf(formatter.format(item.getCabBiblical()));
                strLog = String.valueOf(formatter.format(item.getLogBiblical()));
                strTaza= String.valueOf(formatter.format(item.getTazaSpanish()));
                strEarthsvolume = String.valueOf(formatter.format(item.getEarthsvolume()));


                switch (strSpinnerFromvalue1) {
                    case "Cubic meter - m^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cubic kilometer  - km^3":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Cubic centimeter  - cm^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cubic millimeter - mm^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Liter - L":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Milliliter  - mL":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gallons(US) - gallon":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Quart(US) - qt":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Pint(US)  - pt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cup(US)  - cup":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Tablespoon - tblsp":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Teaspoon - tsp":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cubic mile - mi^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cubic yard - yd^3":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Cubic foot - ft^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cubic inch - in^3":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Cubic decimeter - dm^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Exaliter - EL":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Petaliter - PL":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Teraliter - TL":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gigaliter - GL":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Megaliter - ML":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kiloliter - kL":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Hectoliter - hL":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Dekaliter - daL":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Deciliter - dL":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Centiliter - cL":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Microliter - µL":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Nanoliter - nL":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Picoliter - pL":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Femtoliter - fL":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Attoliter - aL":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Cc - cc":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Drop - drop":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Barrel(oil) - bbl":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Barrel(US) - bbl":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Barrel(UK) - bbl":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gallon - gallon":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Quart(UK) - qt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Pint(UK) - pt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cup(Metric) - cup":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cup(UK) - cup":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Fluid ounce(US) - fl oz":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Fluid ounce(UK) - fl oz":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Tablespoon(Metric) - tblsp":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Tablespoon(UK) - tblsp":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Dessertspoon(US) - dsp":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Dessertspoon(UK) - dsp":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Teaspoon(Metric) - tsp":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Teaspoon(UK) - tsp":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Gill(US)  - gi":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gill(UK)  - gi":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Minim(US)  - min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Minim(UK)  - min":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ton register - ton reg":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ccf  - ccf":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Hundred-cubic foot - 100 ft^3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Acre-foot - ac*ft":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Acre-foot(US)  - ac*ft":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Acre-inch - ac*in":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Dekastere  - daSt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Stere  - st":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Decistere  - dSt":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cord  - cd":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Tun  - tun":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Hogshead  - hogshead":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Board foot  - bft":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Dram  - dr":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Cor(Biblical) - cor":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Homer(Biblical) - homer":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Bath(Biblical) - bath":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Hin(Biblical) - hin":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Cab(Biblical) - cab":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Log(Biblical) - log":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Taza(Spanish) - taza":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Earth's volume - earth":
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
            case "Cubic meter - m^3":
                editTextValueTo.setText(strcubicmeter);
                break;
            case "Cubic kilometer  - km^3":
                editTextValueTo.setText(strcubickilometer);
                break;

            case "Cubic centimeter  - cm^3":
                editTextValueTo.setText(strcubiccentimeter);
                break;
            case "Cubic millimeter - mm^3":
                editTextValueTo.setText(strcubicmillimeter);
                break;
            case "Liter - L":
                editTextValueTo.setText(strliter);
                break;
            case "Milliliter  - mL":
                editTextValueTo.setText(strmilliliter);
                break;
            case "Gallons(US) - gallon":
                editTextValueTo.setText(strgallon);
                break;
            case "Quart(US) - qt":
                editTextValueTo.setText(strquart);
                break;

            case "Pint(US)  - pt":
                editTextValueTo.setText(strpint);
                break;
            case "Cup(US)  - cup":
                editTextValueTo.setText(strcup);
                break;

            case "Tablespoon - tblsp":
                editTextValueTo.setText(strtablespoon);
                break;
            case "Teaspoon - tsp":
                editTextValueTo.setText(strteaspoon);
                break;
            case "Cubic mile - mi^3":
                editTextValueTo.setText(strcubicmile);
                break;
            case "Cubic yard - yd^3":
                editTextValueTo.setText(strcubicyard);
                break;

            case "Cubic foot - ft^3":
                editTextValueTo.setText(strcubicfoot);
                break;
            case "Cubic inch - in^3":
                editTextValueTo.setText(strcubicinch);
                break;

            case "Cubic decimeter - dm^3":
                editTextValueTo.setText(strcubicdecimeter);
                break;
            case "Exaliter - EL":
                editTextValueTo.setText(strexaliter);
                break;
            case "Petaliter - PL":
                editTextValueTo.setText(strpetaliter);
                break;
            case "Teraliter - TL":
                editTextValueTo.setText(strteraliter);
                break;
            case "Gigaliter - GL":
                editTextValueTo.setText(strgigaliter);
                break;
            case "Megaliter - ML":
                editTextValueTo.setText(strmegaliter);
                break;
            case "Kiloliter - kL":
                editTextValueTo.setText(strkiloliter);
                break;

            case "Hectoliter - hL":
                editTextValueTo.setText(strhectoliter);
                break;
            case "Dekaliter - daL":
                editTextValueTo.setText(strdekaliter);
                break;
            case "Deciliter - dL":
                editTextValueTo.setText(strdeciliter);
                break;

            case "Centiliter - cL":
                editTextValueTo.setText(strcentiliter);
                break;
            case "Microliter - µL":
                editTextValueTo.setText(strmicroliter);
                break;
            case "Nanoliter - nL":
                editTextValueTo.setText(strnanoliter);
                break;
            case "Picoliter - pL":
                editTextValueTo.setText(strpicoliter);
                break;

            case "Femtoliter - fL":
                editTextValueTo.setText(strfemtoliter);
                break;
            case "Attoliter - aL":
                editTextValueTo.setText(strattoliter);
                break;

            case "Cc - cc":
                editTextValueTo.setText(strcc);
                break;
            case "Drop - drop":
                editTextValueTo.setText(strdrop);
                break;
            case "Barrel(oil) - bbl":
                editTextValueTo.setText(strbarreloil);
                break;
            case "Barrel(US) - bbl":
                editTextValueTo.setText(strbarrelUS);
                break;
            case "Barrel(UK) - bbl":
                editTextValueTo.setText(strbarrelUK);
                break;
            case "Gallon - gallon":
                editTextValueTo.setText(strgallonUK);
                break;
            case "Quart(UK) - qt":
                editTextValueTo.setText(strquartUK);
                break;
            case "Pint(UK) - pt":
                editTextValueTo.setText(strpintUK);
                break;
            case "Cup(Metric) - cup":
                editTextValueTo.setText(strcupmetric);
                break;
            case "Cup(UK) - cup":
                editTextValueTo.setText(strcupUK);
                break;
            case "Fluid ounce(US) - fl oz":
                editTextValueTo.setText(strfluidounceUS);
                break;
            case "Fluid ounce(UK) - fl oz":
                editTextValueTo.setText(strfluidounceUK);
                break;
            case "Tablespoon(Metric) - tblsp":
                editTextValueTo.setText(strTablespoonmetric);
                break;
            case "Tablespoon(UK) - tblsp":
                editTextValueTo.setText(strTablespoonUK);
                break;
            case "Dessertspoon(US) - dsp":
                editTextValueTo.setText(strdesertspoonUS);
                break;
            case "Dessertspoon(UK) - dsp":
                editTextValueTo.setText(strdesertspoonUK);
                break;
            case "Teaspoon(Metric) - tsp":
                editTextValueTo.setText(strTeaspoonmetric);
                break;
            case "Teaspoon(UK) - tsp":
                editTextValueTo.setText(strTeaspoonUK);
                break;

            case "Gill(US)  - gi":
                editTextValueTo.setText(strGillUS);
                break;
            case "Gill(UK)  - gi":
                editTextValueTo.setText(strGillUK);
                break;
            case "Minim(US)  - min":
                editTextValueTo.setText(strMinimUS);
                break;
            case "Minim(UK)  - min":
                editTextValueTo.setText(strMinimUK);
                break;
            case "Ton register - ton reg":
                editTextValueTo.setText(strTonregister);
                break;
            case "Ccf  - ccf":
                editTextValueTo.setText(strCcf);
                break;
            case "Hundred-cubic foot - 100 ft^3":
                editTextValueTo.setText(strhundredcubicfoot);
                break;
            case "Acre-foot - ac*ft":
                editTextValueTo.setText(strAcrefoot);
                break;
            case "Acre-foot(US)  - ac*ft":
                editTextValueTo.setText(strAcrefootUS);
                break;
            case "Acre-inch - ac*in":
                editTextValueTo.setText(strAcreinch);
                break;
            case "Dekastere  - daSt":
                editTextValueTo.setText(strDekastere);
                break;
            case "Stere  - st":
                editTextValueTo.setText(strStere);
                break;
            case "Decistere  - dSt":
                editTextValueTo.setText(strDecistere);
                break;
            case "Cord  - cd":
                editTextValueTo.setText(strCord);
                break;
            case "Tun  - tun":
                editTextValueTo.setText(strTun);
                break;
            case "Hogshead  - hogshead":
                editTextValueTo.setText(strHogshead);
                break;
            case "Board foot  - bft":
                editTextValueTo.setText(strBoardfoot);
                break;
            case "Dram  - dr":
                editTextValueTo.setText(strdramt);
                break;

            case "Cor(Biblical) - cor":
                editTextValueTo.setText(strCor);
                break;
            case "Homer(Biblical) - homer":
                editTextValueTo.setText(strHomer);
                break;
            case "Bath(Biblical) - bath":
                editTextValueTo.setText(strBath);
                break;
            case "Hin(Biblical) - hin":
                editTextValueTo.setText(strHin);
                break;
            case "Cab(Biblical) - cab":
                editTextValueTo.setText(strCab);
                break;
            case "Log(Biblical) - log":
                editTextValueTo.setText(strLog);
                break;
            case "Taza(Spanish) - taza":
                editTextValueTo.setText(strTaza);
                break;
            case "Earth's volume - earth":
                editTextValueTo.setText(strEarthsvolume);
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