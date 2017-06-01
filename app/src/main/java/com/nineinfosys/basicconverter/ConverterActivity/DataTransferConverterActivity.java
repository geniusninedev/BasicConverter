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
import com.nineinfosys.basicconverter.ConverterActivityList.DataTransferConverterListActivity;
import com.nineinfosys.basicconverter.Engin.DataTransferConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.Settings;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class DataTransferConverterActivity extends AppCompatActivity implements View.OnClickListener,TextWatcher {

    //declaration of designing tools
    private Spinner spinnerConvertFrom, spinnerConvertTo;
    private EditText editTextValue, editTextValueTo;

    private FloatingActionButton buttonList, buttonShare, buttonMail, buttonCopy;
    private SwitchCompat switchChangeType;
    private List<String> listPressureFirsttempTo, listPressureFirstfrom,listpressureTo,listpressurefrom;
    private String stringSpinnerFrom, stringSpinnerTo;
    private TextView textViewBasicUnit, textViewAllUnit,textViewConvert;
    private double doubleEdittextvalue = 1.0;
    private int basicunit = 21;
    private int allunit = 107;
    private DecimalFormat formatter = null;
    private static final int REQUEST_CODE = 100;

    DataTransferConverter.ConversionResults item;
    private String strBitpersecond = null;
    private String strBytepersecond = null;
    private  String strKilobitpersecondSI = null;
    private String strKilobytepersecondSI = null;
    private String strKilobitpersecond = null;
    private String strKilobytepersecond = null;
    private String strMegabitpersecondSI = null;
    private  String strMegabytepersecondSI = null;
    private String strMegabitpersecond = null;
    private String strMegabytepersecond = null;
    private String strGigabitpersecondSI = null;
    private String strGigabytepersecondSI = null;
    private String strGigabitpersecond = null;
    private String strGigabytepersecond = null;
    private String strTerabitpersecondSI = null;
    private String strTerabytepersecondSI = null;
    private String strTerabitpersecond = null;
    private String strTerabytepersecond = null;

    private String strEthernet = null;
    private String strEthernetfast = null;
    private String strEthernetgigabit = null;
    private String strOC1 = null;
    private String strOC3 = null;
    private String strOC12 = null;
    private String strOC24 = null;
    private String strOC48 = null;
    private String strOC192 = null;
    private String strOC768 = null;
    private String strISDNsinglechannel = null;
    private String strISDNdualchannel = null;
    private String strModem110 = null;
    private String strModem300 = null;
    private String strModem1200 = null;
    private  String strModem2400 = null;
    private String strModem9600 = null;

    private String strModem14k = null;
    private String strmodem28k = null;
    private String strModem33k = null;
    private String Modem56k= null;
    private String strSCSIAsync = null;
    private  String strSCSISync = null;
    private  String strSCSIFast = null;
    private String strSCSIFastUltra = null;
    private String strSCSIFastWide = null;
    private String strSCSIFastUltraWide = null;
    private String strSCSIUltra2 = null;
    private String strSCSIUltra3 = null;
    private  String strSCSILVDUltra80= null;
    private  String strSCSILVDUltra160 = null;
    private   String strIDEPIOmode0= null;
    private   String strIDEPIOmode1 = null;
    private   String strIDEPIOmode2= null;

    private String strIDEPIOmode3 = null;
    private String strIDEPIOmode4 = null;
    private String strIDEDMAmode0= null;
    private String strIDEDMAmode1 = null;
    private  String strIDEDMAmode2 = null;
    private  String strIDEUDMAmode0 = null;
    private String strIDEUDMAmode1 = null;
    private String strIDEUDMAmode2 = null;
    private String strIDEUDMAmode3 = null;
    private String strIDEUDMAmode4 = null;
    private String strIDEUDMA33 = null;
    private  String strIDEUDMA66= null;
    private  String strUSB = null;
    private   String strfirewire= null;
    private   String strT0payload = null;
    private   String strT0B8ZSpayload= null;
    private String strT1signal = null;
    private String strT1payload = null;
    private String strT1Zpayload= null;
    private String strT1Csignal = null;
    private  String strT1Cpayload = null;
    private  String strT2signal = null;
    private String strT3signal = null;
    private String strT3payload = null;
    private String strT3Zpayload = null;
    private String strT4signal = null;
    private String strEPTA1signal = null;
    private  String strEPTA1payload= null;
    private  String strEPTA2signal = null;
    private   String strEPTA2payload= null;
    private   String strEPTA3signal = null;
    private   String strEPTA3payload= null;
    private String strH0 = null;
    private String strH11 = null;
    private String strH12= null;
    private String strVirtualTributary1signal = null;
    private  String strVirtualTributary1payload = null;
    private  String strVirtualTributary2signal = null;
    private String strVirtualTributary2payload = null;
    private String strVirtualTributary6signal = null;
    private String strVirtualTributary6payload = null;
    private String strSTS1signal = null;
    private String strSTS1payload = null;
    private  String strSTS3signal= null;
    private  String strSTS3payload = null;
    private   String strSTS3csignal= null;
    private   String strSTS3cpayload = null;
    private   String strSTS12signal= null;

    private String strSTS24signal = null;
    private String strSTS48signal = null;
    private String strSTS192signal= null;
    private String strSTM1signal = null;
    private  String strSTM4signal = null;
    private  String strSTM16signal = null;
    private String strSTM64signal = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_converter);

        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#03a9f4")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Data Transfer");

        formatsetting();

        MobileAds.initialize(DataTransferConverterActivity.this, getString(R.string.ads_app_id));
        AdView mAdView = (AdView) findViewById(R.id.adViewUnitConverter);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //initalization of tools and variables
        spinnerConvertFrom = (Spinner) findViewById(R.id.spinnerConvertFrom);
        spinnerConvertTo = (Spinner) findViewById(R.id.spinnerConvertTo);
        textViewBasicUnit = (TextView) findViewById(R.id.textViewBasicUnit);
        textViewConvert=(TextView) findViewById(R.id.buttonUnitConverter);
        textViewAllUnit = (TextView) findViewById(R.id.textViewAllUnit);
        editTextValue = (EditText) findViewById(R.id.edittextFrom);
        editTextValueTo = (EditText) findViewById(R.id.edittextTo);
        buttonCopy = (FloatingActionButton) findViewById(R.id.button_copy);
        buttonList = (FloatingActionButton) findViewById(R.id.button_list_fullreport);
        buttonShare = (FloatingActionButton) findViewById(R.id.button_list_share);
        buttonMail = (FloatingActionButton) findViewById(R.id.button_list_mail);
        switchChangeType = (SwitchCompat) findViewById(R.id.switchButton);

        buttonCopy.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorskyblue)));
        buttonList.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorskyblue)));
        buttonShare.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorskyblue)));
        buttonMail.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorskyblue)));
        DrawableCompat.setTintList(DrawableCompat.wrap(switchChangeType.getThumbDrawable()),ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorskyblue)));


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            textViewConvert.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorskyblue)));
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#007ac1"));
        }


        textViewBasicUnit.setText(String.valueOf("Basic Units(" + basicunit + ")"));
        textViewAllUnit.setText(String.valueOf("All Units(" + allunit + ")"));


        //adding value to spinner
        listPressureFirstfrom = new ArrayList<String>();
        listPressureFirsttempTo = new ArrayList<String>();

        //for first time running spinner
        listPressureFirstfrom.add("Bit/second - b/s");
        listPressureFirstfrom.add("Byte/second - B/s");
        listPressureFirstfrom.add("Kilobit/second(SI def.)");
        listPressureFirstfrom.add("Kilobyte/second(SI def.)");
        listPressureFirstfrom.add("Kilobit/second - kb/s");
        listPressureFirstfrom.add("Kilobyte/second - kB/s");
        listPressureFirstfrom.add("Megabit/second(SI def.)");
        listPressureFirstfrom.add("Megabyte/second(SI def.)");
        listPressureFirstfrom.add("Megabit/second - Mb/s");
        listPressureFirstfrom.add("Megabyte/second - MB/s");
        listPressureFirstfrom.add("Gigabit/second(SI def.)");
        listPressureFirstfrom.add("Gigabyte/second(SI def.)");
        listPressureFirstfrom.add("Gigabit/second - Gb/s");
        listPressureFirstfrom.add("Gigabyte/second - GB/s");
        listPressureFirstfrom.add("Terabit/second(SI def.)");
        listPressureFirstfrom.add("Terabyte/second(SI def.)");
        listPressureFirstfrom.add("Terabit/second - Tb/s");
        listPressureFirstfrom.add("Terabyte/second - TB/S");
        listPressureFirstfrom.add("Ethernet");
        listPressureFirstfrom.add("Ethernet(fast)");
        listPressureFirstfrom.add("Ethernet(gigabit)");

        //for first time running spinner
        listPressureFirsttempTo.add("Bit/second - b/s");
        listPressureFirsttempTo.add("Byte/second - B/s");
        listPressureFirsttempTo.add("Kilobit/second(SI def.)");
        listPressureFirsttempTo.add("Kilobyte/second(SI def.)");
        listPressureFirsttempTo.add("Kilobit/second - kb/s");
        listPressureFirsttempTo.add("Kilobyte/second - kB/s");
        listPressureFirsttempTo.add("Megabit/second(SI def.)");
        listPressureFirsttempTo.add("Megabyte/second(SI def.)");
        listPressureFirsttempTo.add("Megabit/second - Mb/s");
        listPressureFirsttempTo.add("Megabyte/second - MB/s");
        listPressureFirsttempTo.add("Gigabit/second(SI def.)");
        listPressureFirsttempTo.add("Gigabyte/second(SI def.)");
        listPressureFirsttempTo.add("Gigabit/second - Gb/s");
        listPressureFirsttempTo.add("Gigabyte/second - GB/s");
        listPressureFirsttempTo.add("Terabit/second(SI def.)");
        listPressureFirsttempTo.add("Terabyte/second(SI def.)");
        listPressureFirsttempTo.add("Terabit/second - Tb/s");
        listPressureFirsttempTo.add("Terabyte/second - TB/S");
        listPressureFirsttempTo.add("Ethernet");
        listPressureFirsttempTo.add("Ethernet(fast)");
        listPressureFirsttempTo.add("Ethernet(gigabit)");

        // Creating adapter for spinner
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(DataTransferConverterActivity.this, android.R.layout.simple_spinner_item, listPressureFirstfrom);
        ArrayAdapter<String> AdapterTempTo = new ArrayAdapter<String>(DataTransferConverterActivity.this, android.R.layout.simple_spinner_item, listPressureFirsttempTo);


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

                listpressurefrom = new ArrayList<String>();
                listpressureTo = new ArrayList<String>();
                String stringSwitchSate = String.valueOf(isChecked);
                String strBasic = "Basic";
                String strAdvance = "All";
                switch (stringSwitchSate) {

                    case "false":
                        Snackbar.make(buttonView, "You switched to " + strBasic + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listpressurefrom.clear();
                        listpressureTo.clear();

                        //for first time running spinner
                        listpressurefrom.add("Bit/second - b/s");
                        listpressurefrom.add("Byte/second - B/s");
                        listpressurefrom.add("Kilobit/second(SI def.)");
                        listpressurefrom.add("Kilobyte/second(SI def.)");
                        listpressurefrom.add("Kilobit/second - kb/s");
                        listpressurefrom.add("Kilobyte/second - kB/s");
                        listpressurefrom.add("Megabit/second(SI def.)");
                        listpressurefrom.add("Megabyte/second(SI def.)");
                        listpressurefrom.add("Megabit/second - Mb/s");
                        listpressurefrom.add("Megabyte/second - MB/s");
                        listpressurefrom.add("Gigabit/second(SI def.)");
                        listpressurefrom.add("Gigabyte/second(SI def.)");
                        listpressurefrom.add("Gigabit/second - Gb/s");
                        listpressurefrom.add("Gigabyte/second - GB/s");
                        listpressurefrom.add("Terabit/second(SI def.)");
                        listpressurefrom.add("Terabyte/second(SI def.)");
                        listpressurefrom.add("Terabit/second - Tb/s");
                        listpressurefrom.add("Terabyte/second - TB/S");
                        listpressurefrom.add("Ethernet");
                        listpressurefrom.add("Ethernet(fast)");
                        listpressurefrom.add("Ethernet(gigabit)");
                        //for first time running spinner
                        listpressureTo.add("Bit/second - b/s");
                        listpressureTo.add("Byte/second - B/s");
                        listpressureTo.add("Kilobit/second(SI def.)");
                        listpressureTo.add("Kilobyte/second(SI def.)");
                        listpressureTo.add("Kilobit/second - kb/s");
                        listpressureTo.add("Kilobyte/second - kB/s");
                        listpressureTo.add("Megabit/second(SI def.)");
                        listpressureTo.add("Megabyte/second(SI def.)");
                        listpressureTo.add("Megabit/second - Mb/s");
                        listpressureTo.add("Megabyte/second - MB/s");
                        listpressureTo.add("Gigabit/second(SI def.)");
                        listpressureTo.add("Gigabyte/second(SI def.)");
                        listpressureTo.add("Gigabit/second - Gb/s");
                        listpressureTo.add("Gigabyte/second - GB/s");
                        listpressureTo.add("Terabit/second(SI def.)");
                        listpressureTo.add("Terabyte/second(SI def.)");
                        listpressureTo.add("Terabit/second - Tb/s");
                        listpressureTo.add("Terabyte/second - TB/S");
                        listpressureTo.add("Ethernet");
                        listpressureTo.add("Ethernet(fast)");
                        listpressureTo.add("Ethernet(gigabit)");
                        break;

                    case "true":
                        Snackbar.make(buttonView, "You switched to " + strAdvance + " Units", Snackbar.LENGTH_LONG).setAction("ACTION", null).show();
                        listpressurefrom.clear();
                        listpressureTo.clear();

                        //for first  running spinner
                        listpressurefrom.add("Bit/second - b/s");
                        listpressurefrom.add("Byte/second - B/s");
                        listpressurefrom.add("Kilobit/second(SI def.)");
                        listpressurefrom.add("Kilobyte/second(SI def.)");
                        listpressurefrom.add("Kilobit/second - kb/s");
                        listpressurefrom.add("Kilobyte/second - kB/s");
                        listpressurefrom.add("Megabit/second(SI def.)");
                        listpressurefrom.add("Megabyte/second(SI def.)");
                        listpressurefrom.add("Megabit/second - Mb/s");
                        listpressurefrom.add("Megabyte/second - MB/s");
                        listpressurefrom.add("Gigabit/second(SI def.)");
                        listpressurefrom.add("Gigabyte/second(SI def.)");
                        listpressurefrom.add("Gigabit/second - Gb/s");
                        listpressurefrom.add("Gigabyte/second - GB/s");
                        listpressurefrom.add("Terabit/second(SI def.)");
                        listpressurefrom.add("Terabyte/second(SI def.)");
                        listpressurefrom.add("Terabit/second - Tb/s");
                        listpressurefrom.add("Terabyte/second - TB/S");
                        listpressurefrom.add("Ethernet");
                        listpressurefrom.add("Ethernet(fast)");
                        listpressurefrom.add("Ethernet(gigabit)");
                        listpressurefrom.add("OC1");
                        listpressurefrom.add("OC3");
                        listpressurefrom.add("OC12");
                        listpressurefrom.add("OC24");
                        listpressurefrom.add("OC48");
                        listpressurefrom.add("OC192");
                        listpressurefrom.add("OC768");
                        listpressurefrom.add("ISDN (single channel)");
                        listpressurefrom.add("ISDN(dual channel)");
                        listpressurefrom.add("Modem(110)");
                        listpressurefrom.add("Modem(300)");
                        listpressurefrom.add("Modem(1200)");
                        listpressurefrom.add("Modem(2400)");
                        listpressurefrom.add("Modem(9600)");
                        listpressurefrom.add("Modem(14.4k)");
                        listpressurefrom.add("Modem(28.8k)");
                        listpressurefrom.add("Modem(33.6k)");
                        listpressurefrom.add("Modem(56k)");
                        listpressurefrom.add("SCSI(Async)");
                        listpressurefrom.add("SCSI(Sync)");
                        listpressurefrom.add("SCSI(Fast)");
                        listpressurefrom.add("SCSI(Fast Ultra)");
                        listpressurefrom.add("SCSI(Fast Wide)");
                        listpressurefrom.add("SCSI(Fast Ultra Wide)");
                        listpressurefrom.add("SCSI(Ultra-2)");
                        listpressurefrom.add("SCSI(Ultra-3)");
                        listpressurefrom.add("SCSI(LVD Ultra 80)");
                        listpressurefrom.add("SCSI(LVD Ultra 160)");
                        listpressurefrom.add("IDE(PIO mode 0)");
                        listpressurefrom.add("IDE(PIO mode 1)");
                        listpressurefrom.add("IDE(PIO mode 2)");
                        listpressurefrom.add("IDE(PIO mode 3)");
                        listpressurefrom.add("IDE(PIO mode 4)");
                        listpressurefrom.add("IDE(DMA mode 0)");
                        listpressurefrom.add("IDE(DMA mode 1)");
                        listpressurefrom.add("IDE(DMA mode 2)");
                        listpressurefrom.add("IDE(UDMA mode 0)");
                        listpressurefrom.add("IDE(UDMAmode 1)");
                        listpressurefrom.add("IDE(UDMA mode 2)");
                        listpressurefrom.add("IDE(UDMA mode 3)");
                        listpressurefrom.add("IDE(UDMA mode 4)");
                        listpressurefrom.add("IDE(UDMA 33)");
                        listpressurefrom.add("IDE(UDMA 66)");
                        listpressurefrom.add("USB" );
                        listpressurefrom.add("Firewire(IEEE-1394)");
                        listpressurefrom.add("T0(payload)");
                        listpressurefrom.add("T0(B8ZS payload)");
                        listpressurefrom.add("T1(signal)");
                        listpressurefrom.add("T1(payload)");
                        listpressurefrom.add("T1Z(payload)");
                        listpressurefrom.add("T1C(signal)");
                        listpressurefrom.add("T1C(payload)");
                        listpressurefrom.add("T2(signal)");
                        listpressurefrom.add("T3(signal)");
                        listpressurefrom.add("T3(payload)");
                        listpressurefrom.add("T3Z(payload)");
                        listpressurefrom.add("T4(signal)");
                        listpressurefrom.add("E.P.T.A.1(signal)");
                        listpressurefrom.add("E.P.T.A.1(payload)");
                        listpressurefrom.add("E.P.T.A.2(signal)");
                        listpressurefrom.add("E.P.T.A.2(payload)");
                        listpressurefrom.add("E.P.T.A.3(signal)");
                        listpressurefrom.add("E.P.T.A.3(payload)");
                        listpressurefrom.add("H0");
                        listpressurefrom.add("H11");
                        listpressurefrom.add("Virtual Tributary 1(signal)");
                        listpressurefrom.add("Virtual Tributary 1(payload)");
                        listpressurefrom.add("Virtual Tributary 2(signal)");
                        listpressurefrom.add("Virtual Tributary 2(payload)");
                        listpressurefrom.add("Virtual Tributary 6(signal)");
                        listpressurefrom.add("Virtual Tributary 6(payload)");
                        listpressurefrom.add("STS1(signal)");
                        listpressurefrom.add("STS1(payload)");
                        listpressurefrom.add("STS3(signal)");
                        listpressurefrom.add("STS3(payload)");
                        listpressurefrom.add("STS3c(signal)");
                        listpressurefrom.add("STS3c(payload)");
                        listpressurefrom.add("STS12(signal)");
                        listpressurefrom.add("STS24(signal)");
                        listpressurefrom.add("STS48(signal)");
                        listpressurefrom.add("STS192(signal)");
                        listpressurefrom.add("STM-1(signal)");
                        listpressurefrom.add("STM-4(signal)");
                        listpressurefrom.add("STM-16(signal)");
                        listpressurefrom.add("STM-64(signal)");
                      

                        //for second running spinner
                        listpressureTo.add("Bit/second - b/s");
                        listpressureTo.add("Byte/second - B/s");
                        listpressureTo.add("Kilobit/second(SI def.)");
                        listpressureTo.add("Kilobyte/second(SI def.)");
                        listpressureTo.add("Kilobit/second - kb/s");
                        listpressureTo.add("Kilobyte/second - kB/s");
                        listpressureTo.add("Megabit/second(SI def.)");
                        listpressureTo.add("Megabyte/second(SI def.)");
                        listpressureTo.add("Megabit/second - Mb/s");
                        listpressureTo.add("Megabyte/second - MB/s");
                        listpressureTo.add("Gigabit/second(SI def.)");
                        listpressureTo.add("Gigabyte/second(SI def.)");
                        listpressureTo.add("Gigabit/second - Gb/s");
                        listpressureTo.add("Gigabyte/second - GB/s");
                        listpressureTo.add("Terabit/second(SI def.)");
                        listpressureTo.add("Terabyte/second(SI def.)");
                        listpressureTo.add("Terabit/second - Tb/s");
                        listpressureTo.add("Terabyte/second - TB/S");
                        listpressureTo.add("Ethernet");
                        listpressureTo.add("Ethernet(fast)");
                        listpressureTo.add("Ethernet(gigabit)");
                        listpressureTo.add("OC1");
                        listpressureTo.add("OC3");
                        listpressureTo.add("OC12");
                        listpressureTo.add("OC24");
                        listpressureTo.add("OC48");
                        listpressureTo.add("OC192");
                        listpressureTo.add("OC768");
                        listpressureTo.add("ISDN (single channel)");
                        listpressureTo.add("ISDN(dual channel)");
                        listpressureTo.add("Modem(110)");
                        listpressureTo.add("Modem(300)");
                        listpressureTo.add("Modem(1200)");
                        listpressureTo.add("Modem(2400)");
                        listpressureTo.add("Modem(9600)");
                        listpressureTo.add("Modem(14.4k)");
                        listpressureTo.add("Modem(28.8k)");
                        listpressureTo.add("Modem(33.6k)");
                        listpressureTo.add("Modem(56k)");
                        listpressureTo.add("SCSI(Async)");
                        listpressureTo.add("SCSI(Sync)");
                        listpressureTo.add("SCSI(Fast)");
                        listpressureTo.add("SCSI(Fast Ultra)");
                        listpressureTo.add("SCSI(Fast Wide)");
                        listpressureTo.add("SCSI(Fast Ultra Wide)");
                        listpressureTo.add("SCSI(Ultra-2)");
                        listpressureTo.add("SCSI(Ultra-3)");
                        listpressureTo.add("SCSI(LVD Ultra 80)");
                        listpressureTo.add("SCSI(LVD Ultra 160)");
                        listpressureTo.add("IDE(PIO mode 0)");
                        listpressureTo.add("IDE(PIO mode 1)");
                        listpressureTo.add("IDE(PIO mode 2)");
                        listpressureTo.add("IDE(PIO mode 3)");
                        listpressureTo.add("IDE(PIO mode 4)");
                        listpressureTo.add("IDE(DMA mode 0)");
                        listpressureTo.add("IDE(DMA mode 1)");
                        listpressureTo.add("IDE(DMA mode 2)");
                        listpressureTo.add("IDE(UDMA mode 0)");
                        listpressureTo.add("IDE(UDMAmode 1)");
                        listpressureTo.add("IDE(UDMA mode 2)");
                        listpressureTo.add("IDE(UDMA mode 3)");
                        listpressureTo.add("IDE(UDMA mode 4)");
                        listpressureTo.add("IDE(UDMA 33)");
                        listpressureTo.add("IDE(UDMA 66)");
                        listpressureTo.add("USB" );
                        listpressureTo.add("Firewire(IEEE-1394)");
                        listpressureTo.add("T0(payload)");
                        listpressureTo.add("T0(B8ZS payload)");
                        listpressureTo.add("T1(signal)");
                        listpressureTo.add("T1(payload)");
                        listpressureTo.add("T1Z(payload)");
                        listpressureTo.add("T1C(signal)");
                        listpressureTo.add("T1C(payload)");
                        listpressureTo.add("T2(signal)");
                        listpressureTo.add("T3(signal)");
                        listpressureTo.add("T3(payload)");
                        listpressureTo.add("T3Z(payload)");
                        listpressureTo.add("T4(signal)");
                        listpressureTo.add("E.P.T.A.1(signal)");
                        listpressureTo.add("E.P.T.A.1(payload)");
                        listpressureTo.add("E.P.T.A.2(signal)");
                        listpressureTo.add("E.P.T.A.2(payload)");
                        listpressureTo.add("E.P.T.A.3(signal)");
                        listpressureTo.add("E.P.T.A.3(payload)");
                        listpressureTo.add("H0");
                        listpressureTo.add("H11");
                        listpressureTo.add("Virtual Tributary 1(signal)");
                        listpressureTo.add("Virtual Tributary 1(payload)");
                        listpressureTo.add("Virtual Tributary 2(signal)");
                        listpressureTo.add("Virtual Tributary 2(payload)");
                        listpressureTo.add("Virtual Tributary 6(signal)");
                        listpressureTo.add("Virtual Tributary 6(payload)");
                        listpressureTo.add("STS1(signal)");
                        listpressureTo.add("STS1(payload)");
                        listpressureTo.add("STS3(signal)");
                        listpressureTo.add("STS3(payload)");
                        listpressureTo.add("STS3c(signal)");
                        listpressureTo.add("STS3c(payload)");
                        listpressureTo.add("STS12(signal)");
                        listpressureTo.add("STS24(signal)");
                        listpressureTo.add("STS48(signal)");
                        listpressureTo.add("STS192(signal)");
                        listpressureTo.add("STM-1(signal)");
                        listpressureTo.add("STM-4(signal)");
                        listpressureTo.add("STM-16(signal)");
                        listpressureTo.add("STM-64(signal)");


                        break;
                }
                // Creating adapter for spinner
                ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(DataTransferConverterActivity.this, android.R.layout.simple_spinner_item, listpressurefrom);
                ArrayAdapter<String> AdapterTempTo2 = new ArrayAdapter<String>(DataTransferConverterActivity.this, android.R.layout.simple_spinner_item, listpressureTo);


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
                Intent i = new Intent(this,DataTransferConverterListActivity.class);
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

            DataTransferConverter c = new DataTransferConverter(strSpinnerFromvalue1, (int) doubleEdittextvalue1);
            ArrayList<DataTransferConverter.ConversionResults> results = c.calculateDataTransferConversions();
            int length = results.size();
            for (int i = 0; i < length; i++) {
                item = results.get(i);

                strBitpersecond = String.valueOf(formatter.format(item.getBitpersecond()));
                strBytepersecond =String.valueOf(formatter.format(item.getBytepersecond()));
                strKilobitpersecondSI =String.valueOf(formatter.format(item.getKilobitpersecondSI()));
                strKilobytepersecondSI =String.valueOf(formatter.format(item.getKilobytepersecondSI()));
                strKilobitpersecond = String.valueOf(formatter.format(item.getKilobitpersecond()));
                strKilobytepersecond =String.valueOf(formatter.format(item.getKilobytepersecond()));
                strMegabitpersecondSI =String.valueOf(formatter.format(item.getMegabitpersecondSI()));
                strMegabytepersecondSI =String.valueOf(formatter.format(item.getMegabytepersecondSI()));
                strMegabitpersecond = String.valueOf(formatter.format(item.getMegabitpersecond()));
                strMegabytepersecond = String.valueOf(formatter.format(item.getMegabytepersecond()));
                strGigabitpersecondSI =String.valueOf(formatter.format(item.getGigabitpersecondSI()));
                strGigabytepersecondSI = String.valueOf(formatter.format(item.getGigabytepersecondSI()));
                strGigabitpersecond = String.valueOf(formatter.format(item.getGigabitpersecond()));
                strGigabytepersecond = String.valueOf(formatter.format(item.getGigabytepersecond()));

                strTerabitpersecondSI =String.valueOf(formatter.format(item.getTerabitpersecondSI()));
                strTerabytepersecondSI=String.valueOf(formatter.format(item.getTerabytepersecondSI()));
                strTerabitpersecond = String.valueOf(formatter.format(item.getTerabitpersecond()));
                strTerabytepersecond = String.valueOf(formatter.format(item.getTerabytepersecond()));
                strEthernet = String.valueOf(formatter.format(item.getEthernet()));

                strEthernetfast = String.valueOf(formatter.format(item.getEthernetfast()));
                strEthernetgigabit = String.valueOf(formatter.format(item.getEthernetgigabit()));
                strOC1 = String.valueOf(formatter.format(item.getOC1()));
                strOC3 = String.valueOf(formatter.format(item.getOC3()));
                strOC12 = String.valueOf(formatter.format(item.getOC12()));
                strOC24 = String.valueOf(formatter.format(item.getOC24()));
                strOC48 =String.valueOf(formatter.format(item.getOC48()));
                strOC192 =String.valueOf(formatter.format(item.getOC192()));
                strOC768 = String.valueOf(formatter.format(item.getOC768()));
                strISDNsinglechannel = String.valueOf(formatter.format(item.getISDNsinglechannel()));
                strISDNdualchannel = String.valueOf(formatter.format(item.getISDNdualchannel()));
                strModem110 = String.valueOf(formatter.format(item.getModem110()));
                strModem300 = String.valueOf(formatter.format(item.getModem300()));
                strModem1200 =String.valueOf(formatter.format(item.getModem1200()));
                strModem2400 = String.valueOf(formatter.format(item.getModem2400()));
                strModem9600 = String.valueOf(formatter.format(item.getModem9600()));
                strModem14k = String.valueOf(formatter.format(item.getModem14k()));

                strmodem28k = String.valueOf(formatter.format(item.getModem28k()));
                strModem33k = String.valueOf(formatter.format(item.getModem33k()));
                Modem56k = String.valueOf(formatter.format(item.getModem56k()));
                strSCSIAsync= String.valueOf(formatter.format(item.getSCSIAsync()));
                strSCSISync = String.valueOf(formatter.format(item.getSCSISync()));
                strSCSIFast = String.valueOf(formatter.format(item.getSCSIFast()));
                strSCSIFastUltra = String.valueOf(formatter.format(item.getSCSIFastUltra()));
                strSCSIFastWide = String.valueOf(formatter.format(item.getSCSIFast()));
                strSCSIFastUltraWide = String.valueOf(formatter.format(item.getSCSIFastUltraWide()));
                //strInchmercury60 = String.valueOf(formatter.format(item.getCelsius()));
                strSCSIUltra2 = String.valueOf(formatter.format(item.getSCSIUltra2()));
                strSCSIUltra3 = String.valueOf(formatter.format(item.getSCSIUltra3()));
                strSCSILVDUltra80= String.valueOf(formatter.format(item.getSCSILVDUltra80()));
                strSCSILVDUltra160 = String.valueOf(formatter.format(item.getSCSILVDUltra160()));
                strIDEPIOmode0= String.valueOf(formatter.format(item.getIDEPIOmode0()));
                strIDEPIOmode1 = String.valueOf(formatter.format(item.getIDEPIOmode1()));
                strIDEPIOmode2= String.valueOf(formatter.format(item.getIDEPIOmode2()));
                strIDEPIOmode3 = String.valueOf(formatter.format(item.getIDEPIOmode3()));
                strIDEPIOmode4 = String.valueOf(formatter.format(item.getIDEPIOmode4()));
                strIDEDMAmode0 = String.valueOf(formatter.format(item.getIDEDMAmode0()));
                strIDEDMAmode1= String.valueOf(formatter.format(item.getIDEDMAmode1()));
                strIDEDMAmode2 = String.valueOf(formatter.format(item.getIDEDMAmode2()));
                strIDEUDMAmode0 = String.valueOf(formatter.format(item.getIDEUDMAmode0()));
                strIDEUDMAmode1 = String.valueOf(formatter.format(item.getIDEUDMAmode1()));
                strIDEUDMAmode2 = String.valueOf(formatter.format(item.getIDEUDMAmode2()));
                strIDEUDMAmode3 = String.valueOf(formatter.format(item.getIDEUDMAmode3()));
                //strInchmercury60 = String.valueOf(formatter.format(item.getCelsius()));
                strIDEUDMAmode4 = String.valueOf(formatter.format(item.getIDEUDMAmode4()));
                strIDEUDMA33 = String.valueOf(formatter.format(item.getIDEUDMA33()));
                strIDEUDMA66= String.valueOf(formatter.format(item.getIDEUDMA66()));
                strUSB = String.valueOf(formatter.format(item.getUSB()));
                strfirewire= String.valueOf(formatter.format(item.getFirewire()));
                strT0payload = String.valueOf(formatter.format(item.getT0payload()));
                strT0B8ZSpayload= String.valueOf(formatter.format(item.getT0B8ZSpayload()));
                strT1signal = String.valueOf(formatter.format(item.getT1signal()));
                strT1payload = String.valueOf(formatter.format(item.getT1payload()));
                strT1Zpayload = String.valueOf(formatter.format(item.getT1Zpayload()));
                strT1Csignal= String.valueOf(formatter.format(item.getT1Csignal()));
                strT1Cpayload = String.valueOf(formatter.format(item.getT1Cpayload()));
                strT2signal = String.valueOf(formatter.format(item.getT2signal()));
                strT3signal = String.valueOf(formatter.format(item.getT3signal()));
                strT3payload = String.valueOf(formatter.format(item.getT3payload()));
                strT3Zpayload = String.valueOf(formatter.format(item.getT3Zpayload()));
                strT4signal = String.valueOf(formatter.format(item.getT4signal()));
                strEPTA1signal = String.valueOf(formatter.format(item.getEPTA1signal()));
                strEPTA1payload= String.valueOf(formatter.format(item.getEPTA1payload()));
                strEPTA2signal = String.valueOf(formatter.format(item.getEPTA2signal()));
                strEPTA2payload= String.valueOf(formatter.format(item.getEPTA2payload()));
                strEPTA3signal = String.valueOf(formatter.format(item.getEPTA3signal()));
                strEPTA3payload= String.valueOf(formatter.format(item.getEPTA3payload()));
                strH0= String.valueOf(formatter.format(item.getH0()));
                strH11 = String.valueOf(formatter.format(item.getH11()));
                strH12 = String.valueOf(formatter.format(item.getH12()));
                strVirtualTributary1signal = String.valueOf(formatter.format(item.getVirtualTributary1signal()));
                strVirtualTributary1payload = String.valueOf(formatter.format(item.getVirtualTributary1payload()));
                strVirtualTributary2signal = String.valueOf(formatter.format(item.getVirtualTributary2signal()));
                strVirtualTributary2payload = String.valueOf(formatter.format(item.getVirtualTributary2payload()));
                strVirtualTributary6signal = String.valueOf(formatter.format(item.getVirtualTributary6signal()));
                strVirtualTributary6payload= String.valueOf(formatter.format(item.getVirtualTributary6payload()));
                strSTS1signal = String.valueOf(formatter.format(item.getSTS1signal()));
                strSTS1payload= String.valueOf(formatter.format(item.getSTS1payload()));
                strSTS3signal = String.valueOf(formatter.format(item.getSTS3signal()));
                strSTS3payload= String.valueOf(formatter.format(item.getSTS3payload()));

                strSTS3csignal= String.valueOf(formatter.format(item.getSTS3csignal()));
                strSTS3cpayload = String.valueOf(formatter.format(item.getSTS3cpayload()));
                strSTS12signal = String.valueOf(formatter.format(item.getSTS12signal()));
                strSTS24signal = String.valueOf(formatter.format(item.getSTS24signal()));
                strSTS48signal = String.valueOf(formatter.format(item.getSTS48signal()));
                strSTS192signal = String.valueOf(formatter.format(item.getSTS192signal()));
                strSTM1signal = String.valueOf(formatter.format(item.getSTM1signal()));
                strSTM4signal = String.valueOf(formatter.format(item.getSTM4signal()));
                strSTM16signal= String.valueOf(formatter.format(item.getSTM16signal()));
                strSTM64signal = String.valueOf(formatter.format(item.getSTM64signal()));




                switch (strSpinnerFromvalue1) {
                    case "Bit/second - b/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Byte/second - B/s":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Kilobit/second(SI def.)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilobyte/second(SI def.)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilobit/second - kb/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Kilobyte/second - kB/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Megabit/second(SI def.)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Megabyte/second(SI def.)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Megabit/second - Mb/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Megabyte/second - MB/s":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Gigabit/second(SI def.)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gigabyte/second(SI def.)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gigabit/second - Gb/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Gigabyte/second - GB/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Terabit/second(SI def.)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Terabyte/second(SI def.)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Terabit/second - Tb/s":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Terabyte/second - TB/S":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Ethernet":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Ethernet(fast)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Ethernet(gigabit)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "OC1":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "OC3":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "OC12":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "OC24":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "OC48":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "OC192":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "OC768":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "ISDN (single channel)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "ISDN(dual channel)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Modem(110)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Modem(300)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Modem(1200)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Modem(2400)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Modem(9600)" :
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Modem(14.4k)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Modem(28.8k)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Modem(33.6k)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Modem(56k)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "SCSI(Async)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "SCSI(Sync)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "SCSI(Fast)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "SCSI(Fast Ultra)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "SCSI(Fast Wide)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "SCSI(Fast Ultra Wide)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "SCSI(Ultra-2)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "SCSI(Ultra-3)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "SCSI(LVD Ultra 80)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "SCSI(LVD Ultra 160)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "IDE(PIO mode 0)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "IDE(PIO mode 1)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "IDE(PIO mode 2)" :
                        conversion(strSpinnerTovalue2);
                        break;
                    case "IDE(PIO mode 3)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "IDE(PIO mode 4)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "IDE(DMA mode 0)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "IDE(DMA mode 1)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "IDE(DMA mode 2)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "IDE(UDMA mode 0)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "IDE(UDMAmode 1)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "IDE(UDMA mode 2)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "IDE(UDMA mode 3)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "IDE(UDMA mode 4)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "IDE(UDMA 33)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "IDE(UDMA 66)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "USB":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Firewire(IEEE-1394)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "T0(payload)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "T0(B8ZS payload)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "T1(signal)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "T1(payload)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "T1Z(payload)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "T1C(signal)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "T1C(payload)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "T2(signal)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "T3(signal)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "T3(payload)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "T3Z(payload)" :
                        conversion(strSpinnerTovalue2);
                        break;

                    case "T4(signal)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "E.P.T.A.1(signal)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "E.P.T.A.1(payload)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "E.P.T.A.2(signal)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "E.P.T.A.2(payload)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "E.P.T.A.3(signal)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "E.P.T.A.3(payload)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "H0":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "H11" :
                        conversion(strSpinnerTovalue2);
                        break;
                    case "H12" :
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Virtual Tributary 1(signal)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Virtual Tributary 1(payload)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Virtual Tributary 2(signal)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Virtual Tributary 2(payload)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "Virtual Tributary 6(signal)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "Virtual Tributary 6(payload)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "STS1(signal)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "STS1(payload)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "STS3(signal)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "STS3(payload)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "STS3c(signal)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "STS3c(payload)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "STS12(signal)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "STS24(signal)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "STS48(signal)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case"STS192(signal)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "STM-1(signal)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case "STM-4(signal)":
                        conversion(strSpinnerTovalue2);
                        break;

                    case "STM-16(signal)":
                        conversion(strSpinnerTovalue2);
                        break;
                    case"STM-64(signal)":
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
            case "Bit/second - b/s":
                editTextValueTo.setText(strBitpersecond);
                break;
            case "Byte/second - B/s":
                editTextValueTo.setText(strBytepersecond);
                break;

            case "Kilobit/second(SI def.)":
                 editTextValueTo.setText(strKilobitpersecondSI);
                break;
            case "Kilobyte/second(SI def.)":
                 editTextValueTo.setText(strKilobytepersecondSI);
                break;
            case "Kilobit/second - kb/s":
                 editTextValueTo.setText(strKilobitpersecond);
                break;
            case "Kilobyte/second - kB/s":
                 editTextValueTo.setText(strKilobytepersecond);
                break;
            case "Megabit/second(SI def.)":
                 editTextValueTo.setText(strMegabitpersecondSI);
                break;
            case "Megabyte/second(SI def.)":
                 editTextValueTo.setText(strMegabytepersecondSI);
                break;
            case "Megabit/second - Mb/s":
                 editTextValueTo.setText(strMegabitpersecond);
                break;
            case "Megabyte/second - MB/s":
                 editTextValueTo.setText(strMegabytepersecond);
                break;

            case "Gigabit/second(SI def.)":
                 editTextValueTo.setText(strGigabitpersecondSI);
                break;
            case "Gigabyte/second(SI def.)":
                 editTextValueTo.setText(strGigabytepersecondSI);
                break;
            case "Gigabit/second - Gb/s":
                 editTextValueTo.setText(strGigabitpersecond);
                break;
            case "Gigabyte/second - GB/s":
                 editTextValueTo.setText(strGigabytepersecond);
                break;
            case "Terabit/second(SI def.)":
                 editTextValueTo.setText(strTerabitpersecondSI);
                break;
            case "Terabyte/second(SI def.)":
                 editTextValueTo.setText(strTerabytepersecondSI);
                break;

            case "Terabit/second - Tb/s":
                 editTextValueTo.setText(strTerabitpersecond);
                break;
            case "Terabyte/second - TB/S":
                 editTextValueTo.setText(strTerabytepersecond);
                break;

            case "Ethernet":
                 editTextValueTo.setText(strEthernet);
                break;
            case "Ethernet(fast)":
                 editTextValueTo.setText(strEthernetfast);
                break;

            case "Ethernet(gigabit)":
                 editTextValueTo.setText(strEthernetgigabit);
                break;
            case "OC1":
                 editTextValueTo.setText(strOC1);
                break;

            case "OC3":
                 editTextValueTo.setText(strOC3);
                break;
            case "OC12":
                 editTextValueTo.setText(strOC12);
                break;

            case "OC24":
                 editTextValueTo.setText(strOC24);
                break;
            case "OC48":
                 editTextValueTo.setText(strOC48);
                break;

            case "OC192":
                 editTextValueTo.setText(strOC192);
                break;
            case "OC768":
                 editTextValueTo.setText(strOC768);
                break;

            case "ISDN (single channel)":
                 editTextValueTo.setText(strISDNsinglechannel);
                break;
            case "ISDN(dual channel)":
                 editTextValueTo.setText(strISDNdualchannel);
                break;

            case "Modem(110)":
                 editTextValueTo.setText(strModem110);
                break;
            case "Modem(300)":
                 editTextValueTo.setText(strModem300);
                break;

            case "Modem(1200)":
                 editTextValueTo.setText(strModem1200);
                break;
            case "Modem(2400)":
                 editTextValueTo.setText(strModem2400);
                break;

            case "Modem(9600)":
                 editTextValueTo.setText(strModem9600);
                break;
            case "Modem(14.4k)":
                 editTextValueTo.setText(strModem14k);
                break;

            case "Modem(28.8k)":
                 editTextValueTo.setText(strmodem28k);
                break;
            case "Modem(33.6k)":
                 editTextValueTo.setText(strModem33k);
                break;

            case "Modem(56k)":
                 editTextValueTo.setText(Modem56k);
                break;
            case "SCSI(Async)":
                 editTextValueTo.setText(strSCSIAsync);
                break;

            case "SCSI(Sync)":
                 editTextValueTo.setText(strSCSISync);
                break;
            case "SCSI(Fast)":
                 editTextValueTo.setText(strSCSIFast);
                break;

            case "SCSI(Fast Ultra)":
                 editTextValueTo.setText(strSCSIFastUltra);
                break;
            case "SCSI(Fast Wide)":
                 editTextValueTo.setText(strSCSIFastWide);
                break;

            case "SCSI(Fast Ultra Wide)":
                 editTextValueTo.setText(strSCSIFastUltraWide);
                break;
            case "SCSI(Ultra-2)":
                 editTextValueTo.setText(strSCSIUltra2);
                break;

            case "SCSI(Ultra-3)":
                 editTextValueTo.setText(strSCSIUltra3);
                break;
            case "SCSI(LVD Ultra 80)":
                 editTextValueTo.setText(strSCSILVDUltra80);
                break;

            case "SCSI(LVD Ultra 160)":
                 editTextValueTo.setText(strSCSILVDUltra160);
                break;
            case "IDE(PIO mode 0)":
                 editTextValueTo.setText(strIDEPIOmode0);
                break;
            case "IDE(PIO mode 1)":
                 editTextValueTo.setText(strIDEPIOmode1);
                break;
            case "IDE(PIO mode 2)":
                 editTextValueTo.setText(strIDEPIOmode2);
                break;
            case "IDE(PIO mode 3)":
                 editTextValueTo.setText(strIDEPIOmode3);
                break;

            case "IDE(PIO mode 4)":
                 editTextValueTo.setText(strIDEPIOmode4);
                break;
            case "IDE(DMA mode 0)":
                 editTextValueTo.setText(strIDEDMAmode0);
                break;
            case "IDE(DMA mode 1)":
                 editTextValueTo.setText(strIDEDMAmode1);
                break;
            case "IDE(DMA mode 2)":
                 editTextValueTo.setText(strIDEDMAmode2);
                break;
            case "IDE(UDMA mode 0)":
                 editTextValueTo.setText(strIDEUDMAmode0);
                break;
            case "IDE(UDMAmode 1)":
                 editTextValueTo.setText(strIDEUDMAmode1);
                break;
            case "IDE(UDMA mode 2)":
                 editTextValueTo.setText(strIDEUDMAmode2);
                break;
            case "IDE(UDMA mode 3)":
                 editTextValueTo.setText(strIDEUDMAmode3);
                break;

            case "IDE(UDMA mode 4)":
                 editTextValueTo.setText(strIDEUDMAmode4);
                break;
            case "IDE(UDMA 33)":
                 editTextValueTo.setText(strIDEUDMA33);
                break;
            case "IDE(UDMA 66)":
                 editTextValueTo.setText(strIDEUDMA66);
                break;
            case "USB":
                 editTextValueTo.setText(strUSB);
                break;
            case "Firewire(IEEE-1394)":
                 editTextValueTo.setText(strfirewire);
                break;
            case "T0(payload)":
                 editTextValueTo.setText(strT0payload);
                break;

            case "T0(B8ZS payload)":
                 editTextValueTo.setText(strT0B8ZSpayload);
                break;
            case "T1(signal)":
                 editTextValueTo.setText(strT1signal);
                break;

            case "T1(payload)":
                 editTextValueTo.setText(strT1payload);
                break;
            case "T1Z(payload)":
                 editTextValueTo.setText(strT1Zpayload);
                break;

            case "T1C(signal)":
                 editTextValueTo.setText(strT1Csignal);
                break;
            case "T1C(payload)":
                 editTextValueTo.setText(strT1Cpayload);
                break;

            case "T2(signal)":
                 editTextValueTo.setText(strT2signal);
                break;
            case "T3(signal)":
                 editTextValueTo.setText(strT3signal);
                break;

            case "T3(payload)":
                 editTextValueTo.setText(strT3payload);
                break;
            case "T3Z(payload)":
                 editTextValueTo.setText(strT3Zpayload);
                break;

            case "T4(signal)":
                 editTextValueTo.setText(strT4signal);
                break;
            case "E.P.T.A.1(signal)":
                 editTextValueTo.setText(strEPTA1signal);
                break;

            case "E.P.T.A.1(payload)":
                 editTextValueTo.setText(strEPTA1payload);
                break;
            case "E.P.T.A.2(signal)":
                 editTextValueTo.setText(strEPTA2signal);
                break;

            case "E.P.T.A.2(payload)":
                 editTextValueTo.setText(strEPTA2payload);
                break;
            case "E.P.T.A.3(signal)":
                 editTextValueTo.setText(strEPTA3signal);
                break;

            case "E.P.T.A.3(payload)":
                 editTextValueTo.setText(strEPTA3payload);
                break;
            case "H0":
                 editTextValueTo.setText(strH0);
                break;

            case "H11":
                 editTextValueTo.setText(strH11);
                break;
            case "H12":
                 editTextValueTo.setText(strH12);
                break;

            case "Virtual Tributary 1(signal)":
                 editTextValueTo.setText(strVirtualTributary1signal);
                break;
            case "Virtual Tributary 1(payload)":
                 editTextValueTo.setText(strVirtualTributary1payload);
                break;

            case "Virtual Tributary 2(signal)":
                 editTextValueTo.setText(strVirtualTributary2signal);
                break;
            case "Virtual Tributary 2(payload)":
                 editTextValueTo.setText(strVirtualTributary2payload);
                break;

            case "Virtual Tributary 6(signal)":
                 editTextValueTo.setText(strVirtualTributary6signal);
                break;
            case "Virtual Tributary 6(payload)":
                 editTextValueTo.setText(strVirtualTributary6payload);
                break;

            case "STS1(signal)":
                 editTextValueTo.setText(strSTS1signal);
                break;
            case "STS1(payload)":
                 editTextValueTo.setText(strSTS1payload);
                break;

            case "STS3(signal)":
                 editTextValueTo.setText(strSTS3signal);
                break;
            case "STS3(payload)":
                 editTextValueTo.setText(strSTS3payload);
                break;

            case "STS3c(signal)":
                 editTextValueTo.setText(strSTS3csignal);
                break;
            case "STS3c(payload)":
                 editTextValueTo.setText(strSTS3cpayload);
                break;

            case "STS12(signal)":
                 editTextValueTo.setText(strSTS12signal);
                break;
            case "STS24(signal)":
                 editTextValueTo.setText(strSTS24signal);
                break;
            case "STS48(signal)":
                 editTextValueTo.setText(strSTS48signal);
                break;
            case "STS192(signal)":
                 editTextValueTo.setText(strSTS192signal);
                break;
            case "STM-1(signal)":
                 editTextValueTo.setText(strSTM1signal);
                break;
            case "STM-4(signal)":
                 editTextValueTo.setText(strSTM4signal);
                break;

            case "STM-16(signal)":
                 editTextValueTo.setText(strSTM16signal);
                break;
            case "STM-64(signal)":
                 editTextValueTo.setText(strSTM64signal);
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