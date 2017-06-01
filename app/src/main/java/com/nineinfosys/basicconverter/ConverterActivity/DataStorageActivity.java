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
import com.nineinfosys.basicconverter.ConverterActivityList.ConversionDataStorageListActivity;
import com.nineinfosys.basicconverter.Engin.DataStorageConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class DataStorageActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher {


    //declaration of designing tools
    private Spinner spinnerConvertFrom, spinnerConvertTo;
    private EditText editTextValue, editTextValueTo;
    private FloatingActionButton buttonList, buttonShare, buttonMail, buttonCopy;
    private SwitchCompat switchChangeType;
    private List<String> listtempFirstfrom, listFirsttempTo, listtempfrom, listtempTo;
    private String stringSpinnerFrom, stringSpinnerTo;
    private TextView textViewBasicUnit, textViewAllUnit,textViewConvert;
    double doubleEdittextvalue = 1.0;
    private int basicunit = 7;
    private int allunit = 41;
    private DecimalFormat formatter = null;
    private static final int REQUEST_CODE = 100;


    DataStorageConverter.ConversionResults item;
     private String strBit=null, strNibble=null, strByte=null, strCharacter=null, strWord=null, strMAPMword=null, strQuadrupleword=null, strBlock=null, strKilobit=null, strKilobyte=null, strKilobyte103bytes=null,
            strMegabit=null, strMegabyte=null, strMegabyte106bytes=null, strGigabit=null, strGigabyte=null, strGigabyte109bytes=null, strTerabit=null, strTerabyte=null, strTerabyte1012bytes=null, strPetabit=null,
            strPetabyte=null, strPetabyte1015bytes=null, strExabit=null, strExabyte=null, strExabyte1018bytes=null, strFloppydisk35DD=null, strFloppydisk35HD=null, strFloppydisk35ED=null, strFloppydisk525DD=null,
            strFloppydisk525HD=null, strZip100=null, strZip250=null, strJaz1GB=null, strJaz2GB=null, strCD74minute=null, strCD80minute=null, strDVD1layer1side=null, strDVD2layer1side=null, strDVD1layer2side=null,
            strDVD2layer2side=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);


        //customize toolbar

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#e65f21")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Data Storage ");

        formatsetting();

        MobileAds.initialize(DataStorageActivity.this, getString(R.string.ads_app_id));
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
        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedishyellow)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedishyellow)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedishyellow)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedishyellow)));

        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()),ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedishyellow)));
       // DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getTrackDrawable()), ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRed)));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textViewConvert.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorRedishyellow)));
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#a02a00"));
        }

        textViewBasicUnit.setText(String.valueOf("Basic Units(" + basicunit + ")"));
        textViewAllUnit.setText(String.valueOf("All Units(" + allunit + ")"));


        //adding value to spinner
        listtempFirstfrom = new ArrayList<String>();
        listFirsttempTo = new ArrayList<String>();


        //for first time running spinner
        listtempFirstfrom.add("Bit - b");
        listtempFirstfrom.add("Byte - B");
        listtempFirstfrom.add("Kilobyte - kB");
        listtempFirstfrom.add("Megabyte - MB");
        listtempFirstfrom.add("Gigabyte - GB");
        listtempFirstfrom.add("Terabyte - TB");
        listtempFirstfrom.add("Petabyte - PB");

        //for first time running spinner
        listFirsttempTo.add("Bit - b");
        listFirsttempTo.add("Byte - B");
        listFirsttempTo.add("Kilobyte - kB");
        listFirsttempTo.add("Megabyte - MB");
        listFirsttempTo.add("Gigabyte - GB");
        listFirsttempTo.add("Terabyte - TB");
        listFirsttempTo.add("Petabyte - PB");

        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(DataStorageActivity.this, android.R.layout.simple_spinner_item, listtempFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(DataStorageActivity.this, android.R.layout.simple_spinner_item, listFirsttempTo);


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
                        listtempfrom.add("Bit - b");
                        listtempfrom.add("Byte - B");
                        listtempfrom.add("Kilobyte - kB");
                        listtempfrom.add("Megabyte - MB");
                        listtempfrom.add("Gigabyte - GB");
                        listtempfrom.add("Terabyte - TB");
                        listtempfrom.add("Petabyte - PB");


                        //2 spinner
                        listtempTo.add("Bit - b");
                        listtempTo.add("Byte - B");
                        listtempTo.add("Kilobyte - kB");
                        listtempTo.add("Megabyte - MB");
                        listtempTo.add("Gigabyte - GB");
                        listtempTo.add("Terabyte - TB");
                        listtempTo.add("Petabyte - PB");
                        break;

                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strAdvance + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listtempfrom.clear();
                        listtempTo.clear();
                        listtempfrom.add("Bit - b");
                        listtempfrom.add("Nibble - n");
                        listtempfrom.add("Byte - B");
                        listtempfrom.add("Character - ch");
                        listtempfrom.add("Word - w");
                        listtempfrom.add("MAPM-word - w");
                        listtempfrom.add("Quadruple-word - w");
                        listtempfrom.add("Block - blk");
                        listtempfrom.add("Kilobit - kb");
                        listtempfrom.add("Kilobyte - kB");
                        listtempfrom.add("Kilobyte (10^3 bytes) - kB");
                        listtempfrom.add("Megabit - Mb");
                        listtempfrom.add("Megabyte - MB");
                        listtempfrom.add("Megabyte (10^6 bytes) - MB");
                        listtempfrom.add("Gigabit - Gb");
                        listtempfrom.add("Gigabyte - GB");
                        listtempfrom.add("Gigabyte (10^9 bytes) - GB");
                        listtempfrom.add("Terabit - Tb");
                        listtempfrom.add("Terabyte - TB");
                        listtempfrom.add("Terabyte (10^12 bytes) - TB");
                        listtempfrom.add("Petabit - Pb");
                        listtempfrom.add("Petabyte - PB");
                        listtempfrom.add("Petabyte (10^15 bytes) - PB");
                        listtempfrom.add("Exabit - Eb");
                        listtempfrom.add("Exabyte - EB");
                        listtempfrom.add("Exabyte (10^18 bytes) - EB");
                        listtempfrom.add("Floppy disk (3.5″, DD) - floppy");
                        listtempfrom.add("Floppy disk (3.5″, HD) - floppy");
                        listtempfrom.add("Floppy disk (3.5″, ED) - floppy");
                        listtempfrom.add("Floppy disk (5.25″, DD) - floppy");
                        listtempfrom.add("Floppy disk (5.25″, HD) - floppy");
                        listtempfrom.add("Zip 100 - Zip");
                        listtempfrom.add("Zip 250 - Zip");
                        listtempfrom.add("Jaz 1GB - Jaz");
                        listtempfrom.add("Jaz 2GB - Jaz");
                        listtempfrom.add("CD (74 minute) - CD");
                        listtempfrom.add("CD (80 minute) - CD");
                        listtempfrom.add("DVD (1 layer, 1 side) - DVD");
                        listtempfrom.add("DVD (2 layer, 1 side) - DVD");
                        listtempfrom.add("DVD (1 layer, 2 side) - DVD");
                        listtempfrom.add("DVD (2 layer, 2 side) - DVD");


                        //second spinner
                        listtempTo.add("Bit - b");
                        listtempTo.add("Nibble - n");
                        listtempTo.add("Byte - B");
                        listtempTo.add("Character - ch");
                        listtempTo.add("Word - w");
                        listtempTo.add("MAPM-word - w");
                        listtempTo.add("Quadruple-word - w");
                        listtempTo.add("Block - blk");
                        listtempTo.add("Kilobit - kb");
                        listtempTo.add("Kilobyte - kB");
                        listtempTo.add("Kilobyte (10^3 bytes) - kB");
                        listtempTo.add("Megabit - Mb");
                        listtempTo.add("Megabyte - MB");
                        listtempTo.add("Megabyte (10^6 bytes) - MB");
                        listtempTo.add("Gigabit - Gb");
                        listtempTo.add("Gigabyte - GB");
                        listtempTo.add("Gigabyte (10^9 bytes) - GB");
                        listtempTo.add("Terabit - Tb");
                        listtempTo.add("Terabyte - TB");
                        listtempTo.add("Terabyte (10^12 bytes) - TB");
                        listtempTo.add("Petabit - Pb");
                        listtempTo.add("Petabyte - PB");
                        listtempTo.add("Petabyte (10^15 bytes) - PB");
                        listtempTo.add("Exabit - Eb");
                        listtempTo.add("Exabyte - EB");
                        listtempTo.add("Exabyte (10^18 bytes) - EB");
                        listtempTo.add("Floppy disk (3.5″, DD) - floppy");
                        listtempTo.add("Floppy disk (3.5″, HD) - floppy");
                        listtempTo.add("Floppy disk (3.5″, ED) - floppy");
                        listtempTo.add("Floppy disk (5.25″, DD) - floppy");
                        listtempTo.add("Floppy disk (5.25″, HD) - floppy");
                        listtempTo.add("Zip 100 - Zip");
                        listtempTo.add("Zip 250 - Zip");
                        listtempTo.add("Jaz 1GB - Jaz");
                        listtempTo.add("Jaz 2GB - Jaz");
                        listtempTo.add("CD (74 minute) - CD");
                        listtempTo.add("CD (80 minute) - CD");
                        listtempTo.add("DVD (1 layer, 1 side) - DVD");
                        listtempTo.add("DVD (2 layer, 1 side) - DVD");
                        listtempTo.add("DVD (1 layer, 2 side) - DVD");
                        listtempTo.add("DVD (2 layer, 2 side) - DVD");

                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(DataStorageActivity.this, android.R.layout.simple_spinner_item, listtempfrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(DataStorageActivity.this, android.R.layout.simple_spinner_item, listtempTo);


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
                Intent i = new Intent(this, ConversionDataStorageListActivity.class);
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

            DataStorageConverter c = new DataStorageConverter(strSpinnerFromvalue1, doubleEdittextvalue1);
            ArrayList<DataStorageConverter.ConversionResults> results = c.calculatestorageConversion();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);

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
                strFloppydisk525HD=String.valueOf(formatter.format(item.getFloppydiskk5()));
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

                switch (strSpinnerFromvalue1) {
                    case "Bit - b":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Nibble - n":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Byte - B":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Character - ch":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Word - w":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "MAPM-word - w":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Quadruple-word - w":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Block - blk":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilobit - kb":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilobyte - kB":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilobyte (10^3 bytes) - kB":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Megabit - Mb":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Megabyte - MB":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Megabyte (10^6 bytes) - MB":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gigabit - Gb":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gigabyte - GB":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gigabyte (10^9 bytes) - GB":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Terabit - Tb":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Terabyte - TB":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Terabyte (10^12 bytes) - TB":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Petabit - Pb":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Petabyte - PB":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Petabyte (10^15 bytes) - PB":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Exabit - Eb":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Exabyte - EB":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Exabyte (10^18 bytes) - EB":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Floppy disk (3.5″, DD) - floppy":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Floppy disk (3.5″, HD) - floppy":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Floppy disk (3.5″, ED) - floppy":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Floppy disk (5.25″, DD) - floppy":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Floppy disk (5.25″, HD) - floppy":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Zip 100 - Zip":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Zip 250 - Zip":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Jaz 1GB - Jaz":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Jaz 2GB - Jaz":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "CD (74 minute) - CD":
                        conversion(strSpinnerTovalue2);
                        break;
                    case  "CD (80 minute) - CD":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "DVD (1 layer, 1 side) - DVD":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "DVD (2 layer, 1 side) - DVD":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "DVD (1 layer, 2 side) - DVD":
                        conversion(strSpinnerTovalue2);
                        break;
                    case  "DVD (2 layer, 2 side) - DVD":
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
            case "Bit - b":
                editTextValueTo.setText(strBit);
                break;
            case "Nibble - n":
                editTextValueTo.setText(strNibble);
                break;
            case "Byte - B":
                editTextValueTo.setText(strByte);
                break;
            case "Character - ch":
                editTextValueTo.setText(strCharacter);
                break;
            case "Word - w":
                editTextValueTo.setText(strWord);
                break;
            case "MAPM-word - w":
                editTextValueTo.setText(strMAPMword);
                break;
            case "Quadruple-word - w":
                editTextValueTo.setText(strQuadrupleword);
                break;
            case "Block - blk":
                editTextValueTo.setText(strBlock);
                break;
            case "Kilobit - kb":
                editTextValueTo.setText(strKilobit);
                break;
            case "Kilobyte - kB":
                editTextValueTo.setText(strKilobyte);
                break;
            case "Kilobyte (10^3 bytes) - kB":
                editTextValueTo.setText(strKilobyte103bytes);
                break;
            case "Megabit - Mb":
                editTextValueTo.setText(strMegabit);
                break;
            case "Megabyte - MB":
                editTextValueTo.setText(strMegabyte);
                break;
            case "Megabyte (10^6 bytes) - MB":
                editTextValueTo.setText(strMegabyte106bytes);
                break;
            case "Gigabit - Gb":
                editTextValueTo.setText(strGigabit);
                break;
            case "Gigabyte - GB":
                editTextValueTo.setText(strGigabyte);
                break;
            case "Gigabyte (10^9 bytes) - GB":
                editTextValueTo.setText(strGigabyte109bytes);
                break;
            case "Terabit - Tb":
                editTextValueTo.setText(strTerabit);
                break;
            case "Terabyte - TB":
                editTextValueTo.setText(strTerabyte);
                break;
            case "Terabyte (10^12 bytes) - TB":
                editTextValueTo.setText(strTerabyte1012bytes);
                break;
            case "Petabit - Pb":
                editTextValueTo.setText(strPetabit);
                break;
            case "Petabyte - PB":
                editTextValueTo.setText(strPetabyte);
                break;
            case "Petabyte (10^15 bytes) - PB":
                editTextValueTo.setText(strPetabyte1015bytes);
                break;
            case "Exabit - Eb":
                editTextValueTo.setText(strExabit);
                break;
            case "Exabyte - EB":
                editTextValueTo.setText(strExabyte);
                break;
            case "Exabyte (10^18 bytes) - EB":
                editTextValueTo.setText(strExabyte1018bytes);
                break;
            case "Floppy disk (3.5″, DD) - floppy":
                editTextValueTo.setText(strFloppydisk35DD);
                break;
            case "Floppy disk (3.5″, HD) - floppy":
                editTextValueTo.setText(strFloppydisk35HD);
                break;
            case "Floppy disk (3.5″, ED) - floppy":
                editTextValueTo.setText(strFloppydisk35ED);
                break;
            case "Floppy disk (5.25″, DD) - floppy":
                editTextValueTo.setText(strFloppydisk525DD);
                break;
            case "Floppy disk (5.25″, HD) - floppy":
                editTextValueTo.setText(strFloppydisk525HD);
                break;
            case "Zip 100 - Zip":
                editTextValueTo.setText(strZip100);
                break;
            case "Zip 250 - Zip":
                editTextValueTo.setText(strZip250);
                break;
            case "Jaz 1GB - Jaz":
                editTextValueTo.setText(strJaz1GB);
                break;
            case "Jaz 2GB - Jaz":
                editTextValueTo.setText(strJaz2GB);
                break;
            case "CD (74 minute) - CD":
                editTextValueTo.setText(strCD74minute);
                break;
            case  "CD (80 minute) - CD":
                editTextValueTo.setText(strCD80minute);
                break;
            case "DVD (1 layer, 1 side) - DVD":
                editTextValueTo.setText(strDVD1layer1side);
                break;
            case "DVD (2 layer, 1 side) - DVD":
                editTextValueTo.setText(strDVD2layer1side);
                break;
            case "DVD (1 layer, 2 side) - DVD":
                editTextValueTo.setText(strDVD1layer2side);
                break;
            case  "DVD (2 layer, 2 side) - DVD":
                editTextValueTo.setText(strDVD2layer2side);
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