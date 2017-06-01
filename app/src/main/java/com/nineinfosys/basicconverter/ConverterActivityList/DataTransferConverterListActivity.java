package com.nineinfosys.basicconverter.ConverterActivityList;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.print.PrintHelper;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.nineinfosys.basicconverter.Adapter.RecyclerViewConversionListAdapter;
import com.nineinfosys.basicconverter.Engin.DataTransferConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.ItemList;
import com.nineinfosys.basicconverter.Supporter.Settings;


import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class DataTransferConverterListActivity extends AppCompatActivity implements TextWatcher {

    List<ItemList> list = new ArrayList<ItemList>();
    private  String stringSpinnerFrom;
    private double doubleEdittextvalue;
    private EditText edittextConversionListvalue;
    private TextView textconversionFrom,textViewConversionShortform;
    private static final int REQUEST_CODE = 100;
    private File imageFile;
    private Bitmap bitmap;
    private PrintHelper printhelper;

    View ChildView ;
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
    DecimalFormat formatter = null;


    private RecyclerView rView;
    RecyclerViewConversionListAdapter rcAdapter;
    List<ItemList> rowListItem,rowListItem1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_list);

        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#03a9f4")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#007ac1"));
        }


        //format of decimal pint
        formatsetting();

        MobileAds.initialize(DataTransferConverterListActivity.this, getString(R.string.ads_app_id));
        AdView mAdView = (AdView) findViewById(R.id.adViewUnitConverterList);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        edittextConversionListvalue=(EditText)findViewById(R.id.edittextConversionListvalue) ;
        textconversionFrom=(TextView) findViewById(R.id.textViewConversionFrom) ;
        textViewConversionShortform=(TextView) findViewById(R.id.textViewConversionShortform) ;

        //get the value from temperture activity
        stringSpinnerFrom = getIntent().getExtras().getString("stringSpinnerFrom");
        doubleEdittextvalue= getIntent().getExtras().getDouble("doubleEdittextvalue");
        edittextConversionListvalue.setText(String.valueOf(doubleEdittextvalue));

        NamesAndShortform(stringSpinnerFrom);

        //   Toast.makeText(this,"string1 "+stringSpinnerFrom,Toast.LENGTH_LONG).show();
        rowListItem = getAllunitValue(stringSpinnerFrom,doubleEdittextvalue);

        //Initializing Views
        rView = (RecyclerView) findViewById(R.id.recyclerViewConverterList);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(new GridLayoutManager(this, 1));


        //Initializing our superheroes list
        rcAdapter = new RecyclerViewConversionListAdapter(this,rowListItem);
        rView.setAdapter(rcAdapter);

        edittextConversionListvalue.addTextChangedListener(this);



    }

    private void NamesAndShortform(String stringSpinnerFrom) {
        switch (stringSpinnerFrom) {
            case "Bit/second - b/s":
                textconversionFrom.setText("Bit/second");
                textViewConversionShortform.setText("b/s");
                break;
            case "Byte/second - B/s":
                textconversionFrom.setText("Byte/second ");
                textViewConversionShortform.setText("B/s");
                break;
            case "Kilobit/second(SI def.)":
                textconversionFrom.setText("Kilobit/second(SI def.)");
                textViewConversionShortform.setText("(SI def.)");
                break;
            case "Kilobyte/second(SI def.)":
                textconversionFrom.setText("Kilobyte/second(SI def.)");
                textViewConversionShortform.setText("(SI def.)");
                break;
            case "Kilobit/second - kb/s":
                textconversionFrom.setText("Kilobit/second");
                textViewConversionShortform.setText("kb/s");
                break;
            case "Kilobyte/second - kB/s":
                textconversionFrom.setText("Kilobyte/second");
                textViewConversionShortform.setText("kB/s");
                break;
            case "Megabit/second(SI def.)":
                textconversionFrom.setText("Megabit/second(SI def.)");
                textViewConversionShortform.setText("(SI def.)");
                break;
            case "Megabyte/second(SI def.)":
                textconversionFrom.setText("Megabyte/second(SI def.)");
                textViewConversionShortform.setText("(SI def.)");
                break;
            case "Megabit/second - Mb/s":
                textconversionFrom.setText("Megabit/second");
                textViewConversionShortform.setText("Mb/s");
                break;
            case "Megabyte/second - MB/s":
                textconversionFrom.setText("Megabyte/second");
                textViewConversionShortform.setText("MB/s");
                break;
            case "Gigabit/second(SI def.)":
                textconversionFrom.setText("Gigabit/second(SI def.)");
                textViewConversionShortform.setText("(SI def.)");
                break;
            case "Gigabyte/second(SI def.)":
                textconversionFrom.setText("Gigabyte/second(SI def.)");
                textViewConversionShortform.setText("(SI def.)");
                break;
            case "Gigabit/second - Gb/s":
                textconversionFrom.setText("Gigabit/second");
                textViewConversionShortform.setText("Gb/s");
                break;
            case "Gigabyte/second - GB/s":
                textconversionFrom.setText("Gigabyte/second");
                textViewConversionShortform.setText("GB/s");
                break;
            case "Terabit/second(SI def.)":
                textconversionFrom.setText("Terabit/second(SI def.)");
                textViewConversionShortform.setText("(SI def.)");
                break;
            case "Terabyte/second(SI def.)":
                textconversionFrom.setText("Terabyte/second(SI def.)");
                textViewConversionShortform.setText("(SI def.)");
                break;

            case "Terabit/second - Tb/s":
                textconversionFrom.setText("Terabit/second");
                textViewConversionShortform.setText("Tb/s");
                break;
            case "Terabyte/second - TB/S":
                textconversionFrom.setText("Terabyte/second");
                textViewConversionShortform.setText("TB/S");
                break;

            case "Ethernet":
                textconversionFrom.setText("Ethernet");
                textViewConversionShortform.setText("ethernet");
                break;
            case "Ethernet(fast)":
                textconversionFrom.setText("Ethernet(fast)");
                textViewConversionShortform.setText("fast");
                break;
            case "Ethernet(gigabit)":
                textconversionFrom.setText("Ethernet(gigabit)");
                textViewConversionShortform.setText("gigabit");
                break;
            case "OC1":
                textconversionFrom.setText("OC1");
                textViewConversionShortform.setText("OC1");
                break;
            case "OC3":
                textconversionFrom.setText("OC3");
                textViewConversionShortform.setText("OC3");
                break;

            case "OC12":
                textconversionFrom.setText("OC12");
                textViewConversionShortform.setText("OC12");
                break;
            case "OC24":
                textconversionFrom.setText("OC24");
                textViewConversionShortform.setText("OC24");
                break;
            case "OC48":
                textconversionFrom.setText("OC48");
                textViewConversionShortform.setText("OC48");
                break;
            case "OC192":
                textconversionFrom.setText("OC192");
                textViewConversionShortform.setText("OC192");
                break;
            case "OC768":
                textconversionFrom.setText("OC768");
                textViewConversionShortform.setText("OC768");
                break;
            case "ISDN (single channel)":
                textconversionFrom.setText("ISDN (single channel)");
                textViewConversionShortform.setText("ISDN");
                break;

            case "ISDN(dual channel)":
                textconversionFrom.setText("ISDN(dual channel)");
                textViewConversionShortform.setText("ISDN");
                break;
            case "Modem(110)":
                textconversionFrom.setText("Modem(110)");
                textViewConversionShortform.setText("kgf/mm²");
                break;
            case "Modem(300)":
                textconversionFrom.setText("Modem(300)");
                textViewConversionShortform.setText("Modem");
                break;
            case "Modem(1200)":
                textconversionFrom.setText("Modem(1200)");
                textViewConversionShortform.setText("Modem");
                break;
            case "Modem(2400)":
                textconversionFrom.setText("Modem(2400)");
                textViewConversionShortform.setText("Modem");
                break;
            case "Modem(9600)":
                textconversionFrom.setText("Modem(9600)");
                textViewConversionShortform.setText("Modem");
                break;

            case "Modem(14.4k)":
                textconversionFrom.setText("Modem(14.4k)");
                textViewConversionShortform.setText("Modem");
                break;

            case "Modem(28.8k)":
                textconversionFrom.setText("Modem(28.8k)");
                textViewConversionShortform.setText("Modem");
                break;
            case "Modem(33.6k)":
                textconversionFrom.setText("Modem(33.6k)");
                textViewConversionShortform.setText("Modem");
                break;
            case "Modem(56k)":
                textconversionFrom.setText("Modem(56k)");
                textViewConversionShortform.setText("Modem");
                break;
            case "SCSI(Async)":
                textconversionFrom.setText("SCSI(Async)");
                textViewConversionShortform.setText("SCSI");
                break;
            case "SCSI(Sync)":
                textconversionFrom.setText("SCSI(Sync)");
                textViewConversionShortform.setText("SCSI");
                break;
            case "SCSI(Fast)":
                textconversionFrom.setText("SCSI(Fast)");
                textViewConversionShortform.setText("SCSI");
                break;

            case "SCSI(Fast Ultra)":
                textconversionFrom.setText("SCSI(Fast Ultra)");
                textViewConversionShortform.setText("SCSI");
                break;
            case "SCSI(Fast Wide)":
                textconversionFrom.setText("SCSI(Fast Wide)");
                textViewConversionShortform.setText("SCSI");
                break;
            case "SCSI(Fast Ultra Wide)":
                textconversionFrom.setText("SCSI(Fast Ultra Wide)");
                textViewConversionShortform.setText("SCSI");
                break;
            case "SCSI(Ultra-2)":
                textconversionFrom.setText("SCSI(Ultra-2)");
                textViewConversionShortform.setText("Ultra-2");
                break;
            case "SCSI(Ultra-3)":
                textconversionFrom.setText("SCSI(Ultra-3)");
                textViewConversionShortform.setText("Ultra-3");
                break;
            case "SCSI(LVD Ultra 80)":
                textconversionFrom.setText("SCSI(LVD Ultra 80)");
                textViewConversionShortform.setText("(LVD Ultra 80)");
                break;
            case "SCSI(LVD Ultra 160)":
                textconversionFrom.setText("SCSI(LVD Ultra 160)");
                textViewConversionShortform.setText("LVD Ultra 160");
                break;
            case "IDE(PIO mode 0)":
                textconversionFrom.setText("IDE(PIO mode 0)");
                textViewConversionShortform.setText("IDE");
                break;
            case "IDE(PIO mode 1)":
                textconversionFrom.setText("IDE(PIO mode 1)");
                textViewConversionShortform.setText("IDE");
                break;



            case "IDE(PIO mode 2)":
                textconversionFrom.setText("IDE(PIO mode 2)");
                textViewConversionShortform.setText("IDE");
                break;
            case "IDE(PIO mode 3)":
                textconversionFrom.setText("IDE(PIO mode 3)");
                textViewConversionShortform.setText("IDE");
                break;
            case "IDE(PIO mode 4)":
                textconversionFrom.setText("IDE(PIO mode 4)");
                textViewConversionShortform.setText("IDE");
                break;
            case "IDE(DMA mode 0)":
                textconversionFrom.setText("IDE(DMA mode 0)");
                textViewConversionShortform.setText("IDE");
                break;
            case "IDE(DMA mode 1)":
                textconversionFrom.setText("IDE(DMA mode 1)");
                textViewConversionShortform.setText("IDE");
                break;
            case "IDE(DMA mode 2)":
                textconversionFrom.setText("IDE(DMA mode 2)");
                textViewConversionShortform.setText("IDE");
                break;
            case "IDE(UDMA mode 0)":
                textconversionFrom.setText("IDE(UDMA mode 0)");
                textViewConversionShortform.setText("IDE");
                break;
            case "IDE(UDMAmode 1)":
                textconversionFrom.setText("IDE(UDMAmode 1)");
                textViewConversionShortform.setText("IDE");
                break;
            case "IDE(UDMA mode 2)":
                textconversionFrom.setText("IDE(UDMA mode 2)");
                textViewConversionShortform.setText("IDE");
                break;
            case "IDE(UDMA mode 3)":
                textconversionFrom.setText("IDE(UDMA mode 3)");
                textViewConversionShortform.setText("IDE");
                break;
            case "IDE(UDMA mode 4)":
                textconversionFrom.setText("IDE(UDMA mode 4)");
                textViewConversionShortform.setText("IDE");
                break;
            case "IDE(UDMA 33)":
                textconversionFrom.setText("IDE(UDMA 33)");
                textViewConversionShortform.setText("IDE");
                break;
            case "IDE(UDMA 66)":
                textconversionFrom.setText("IDE(UDMA 66)");
                textViewConversionShortform.setText("IDE");
                break;
            case "USB":
                textconversionFrom.setText("USB");
                textViewConversionShortform.setText("USB");
                break;
            case "Firewire(IEEE-1394)":
                textconversionFrom.setText("Firewire(IEEE-1394)");
                textViewConversionShortform.setText("IEEE");
                break;
            case "T0(payload)":
                textconversionFrom.setText("T0(payload)");
                textViewConversionShortform.setText("payload");
                break;

            case "T0(B8ZS payload)":
                textconversionFrom.setText("T0(B8ZS payload)");
                textViewConversionShortform.setText("payload");
                break;
            case "T1(signal)":
                textconversionFrom.setText("T1(signal)");
                textViewConversionShortform.setText("signal");
                break;

            case "T1(payload)":
                textconversionFrom.setText("T1(payload)");
                textViewConversionShortform.setText("payload");
                break;
            case "T1Z(payload)":
                textconversionFrom.setText("T1Z(payload)");
                textViewConversionShortform.setText("payload");
                break;
            case "T1C(signal)":
                textconversionFrom.setText("T1C(signal)");
                textViewConversionShortform.setText("signal");
                break;
            case "T1C(payload)":
                textconversionFrom.setText("T1C(payload)");
                textViewConversionShortform.setText("payload");
                break;
            case "T2(signal)":
                textconversionFrom.setText("T2(signal)");
                textViewConversionShortform.setText("signal");
                break;

            case "T3(signal)":
                textconversionFrom.setText("T3(signal)");
                textViewConversionShortform.setText("signal");
                break;
            case "T3(payload)":
                textconversionFrom.setText("T3(payload)");
                textViewConversionShortform.setText("payload");
                break;
            case "T3Z(payload)":
                textconversionFrom.setText("T3Z(payload)");
                textViewConversionShortform.setText("payload");
                break;
            case "T4(signal)":
                textconversionFrom.setText("T4(signal)");
                textViewConversionShortform.setText("signal");
                break;
            case "E.P.T.A.1(signal)":
                textconversionFrom.setText("E.P.T.A.1(signal)");
                textViewConversionShortform.setText("signal");
                break;
            case "E.P.T.A.1(payload)":
                textconversionFrom.setText("E.P.T.A.1(payload)");
                textViewConversionShortform.setText("payload");
                break;

            case "E.P.T.A.2(signal)":
                textconversionFrom.setText("E.P.T.A.2(signal)");
                textViewConversionShortform.setText("signal");
                break;
            case "E.P.T.A.2(payload)":
                textconversionFrom.setText("E.P.T.A.2(payload)");
                textViewConversionShortform.setText("payload");
                break;
            case "E.P.T.A.3(signal)":
                textconversionFrom.setText("E.P.T.A.3(signal)");
                textViewConversionShortform.setText("signal");
                break;
            case "E.P.T.A.3(payload)":
                textconversionFrom.setText("E.P.T.A.3(payload)");
                textViewConversionShortform.setText("payload");
                break;
            case "H0":
                textconversionFrom.setText("H0");
                textViewConversionShortform.setText("H0");
                break;
            case "H11":
                textconversionFrom.setText("H11");
                textViewConversionShortform.setText("H11");
                break;

            case "H12":
                textconversionFrom.setText("H12");
                textViewConversionShortform.setText("H12");
                break;

            case "Virtual Tributary 1(signal)":
                textconversionFrom.setText("Virtual Tributary 1(signal)");
                textViewConversionShortform.setText("signal");
                break;
            case "Virtual Tributary 1(payload)":
                textconversionFrom.setText("Virtual Tributary 1(payload)");
                textViewConversionShortform.setText("payload");
                break;
            case "Virtual Tributary 2(signal)":
                textconversionFrom.setText("Virtual Tributary 2(signal)");
                textViewConversionShortform.setText("signal");
                break;
            case "Virtual Tributary 2(payload)":
                textconversionFrom.setText("Virtual Tributary 2(payload)");
                textViewConversionShortform.setText("payload");
                break;
            case "Virtual Tributary 6(signal)":
                textconversionFrom.setText("Virtual Tributary 6(signal)");
                textViewConversionShortform.setText("signal");
                break;
            case "Virtual Tributary 6(payload)":
                textconversionFrom.setText("Virtual Tributary 6(payload)");
                textViewConversionShortform.setText("payload");
                break;

            case "STS1(signal)":
                textconversionFrom.setText("STS1(signal)");
                textViewConversionShortform.setText("signal");
                break;
            case "STS1(payload)":
                textconversionFrom.setText("STS1(payload)");
                textViewConversionShortform.setText("payload");
                break;
            case "STS3(signal)":
                textconversionFrom.setText("STS3(signal)");
                textViewConversionShortform.setText("signal");
                break;
            case "STS3(payload)":
                textconversionFrom.setText("STS3(payload)");
                textViewConversionShortform.setText("payload");
                break;
            case "STS3c(signal)":
                textconversionFrom.setText("STS3c(signal)");
                textViewConversionShortform.setText("signal");
                break;
            case "STS3c(payload)":
                textconversionFrom.setText("STS3c(payload)");
                textViewConversionShortform.setText("payload");
                break;
            case "STS12(signal)":
                textconversionFrom.setText("STS12(signal)");
                textViewConversionShortform.setText("signal");
                break;
            case "STS24(signal)":
                textconversionFrom.setText("STS24(signal)");
                textViewConversionShortform.setText("signal");
                break;
            case "STS48(signal)":
                textconversionFrom.setText("STS48(signal)");
                textViewConversionShortform.setText("signal");
                break;
            case "STS192(signal)":
                textconversionFrom.setText("STS192(signal)");
                textViewConversionShortform.setText("signal");
                break;
            case "STM-1(signal)":
                textconversionFrom.setText("STM-1(signal)");
                textViewConversionShortform.setText("signal");
                break;

            case "STM-4(signal)":
                textconversionFrom.setText("STM-4(signal)");
                textViewConversionShortform.setText("signal");
                break;
            case "STM-16(signal)":
                textconversionFrom.setText("STM-16(signal)");
                textViewConversionShortform.setText("signal");
                break;
            case "STM-64(signal)":
                textconversionFrom.setText("STM-1(signal)");
                textViewConversionShortform.setText("signal");
                break;
        }
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

    private List<ItemList> getAllunitValue(String strSpinnerFrom,double doubleEdittextvalue1) {
        DataTransferConverter c = new DataTransferConverter(strSpinnerFrom, (int) doubleEdittextvalue1);
        ArrayList<DataTransferConverter.ConversionResults> results = c.calculateDataTransferConversions();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            DataTransferConverter.ConversionResults item = results.get(i);
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
            strSCSIUltra2 = String.valueOf(formatter.format(item.getSCSIUltra2()));
            strSCSIUltra3 = String.valueOf(formatter.format(item.getSCSIUltra3()));
            strSCSILVDUltra80= String.valueOf(formatter.format(item.getSCSILVDUltra80()));
            strSCSILVDUltra160 = String.valueOf(formatter.format(item.getSCSILVDUltra160()));
            strIDEPIOmode0= String.valueOf(formatter.format(item.getIDEPIOmode0()));
            strIDEPIOmode1 = String.valueOf(formatter.format(item.getIDEPIOmode1()));
            strIDEPIOmode2= String.valueOf(formatter.format(item.getIDEPIOmode2()));
            strIDEPIOmode3 = String.valueOf(formatter.format(item.getIDEPIOmode3()));
            strIDEPIOmode4 = String.valueOf(formatter.format(item.getIDEPIOmode3()));
            strIDEDMAmode0 = String.valueOf(formatter.format(item.getIDEDMAmode0()));
            strIDEDMAmode1= String.valueOf(formatter.format(item.getIDEDMAmode1()));
            strIDEDMAmode2 = String.valueOf(formatter.format(item.getIDEDMAmode2()));
            strIDEUDMAmode0 = String.valueOf(formatter.format(item.getIDEUDMAmode0()));
            strIDEUDMAmode1 = String.valueOf(formatter.format(item.getIDEUDMAmode1()));
            strIDEUDMAmode2 = String.valueOf(formatter.format(item.getIDEUDMAmode2()));
            strIDEUDMAmode3 = String.valueOf(formatter.format(item.getIDEUDMAmode3()));
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


            list.add(new ItemList("b/s","Bit/second ",strBitpersecond,"b/s"));
            list.add(new ItemList("B/s","Byte/second ",strBytepersecond,"B/s"));
            list.add(new ItemList("(SI def.)","Kilobit/second(SI def.)",strKilobitpersecondSI,"(SI def.)"));
            list.add(new ItemList("(SI def.)","Kilobyte/second(SI def.)",strKilobytepersecondSI,"(SI def.)"));
            list.add(new ItemList("kb/s","Kilobit/second",strKilobitpersecond,"kb/s"));
            list.add(new ItemList("kB/s","Kilobyte/second  ",strKilobytepersecond,"kB/s"));
            list.add(new ItemList("(SI def.)","Megabit/second(SI def.)",strMegabitpersecondSI,"(SI def.)"));
            list.add(new ItemList("(SI def.)","Megabyte/second(SI def.)",strMegabytepersecondSI,"(SI def.)"));

            list.add(new ItemList(" Mb/s","Megabit/second",strMegabitpersecond,"Mb/s"));
            list.add(new ItemList("MB/s","Megabyte/second",strMegabytepersecond,"MB/s"));
            list.add(new ItemList("(SI def.)","Gigabit/second(SI def.)",strGigabitpersecondSI,"(SI def.)"));
            list.add(new ItemList("(SI def.)","Gigabyte/second(SI def.)",strGigabytepersecondSI,"(SI def.)"));
            list.add(new ItemList("Gb/s","Gigabit/second ",strGigabitpersecond,"Gb/s"));
            list.add(new ItemList(" GB/s","Gigabyte/second",strGigabytepersecond," GB/s"));
            list.add(new ItemList("(SI def.)","Terabit/second(SI def.)",strTerabitpersecondSI,"(SI def.)"));
            list.add(new ItemList("(SI def.)","Terabyte/second(SI def.)",strTerabytepersecondSI,"(SI def.)"));


            list.add(new ItemList("Tb/s","Terabit/second",strTerabitpersecond,"Tb/s"));
            list.add(new ItemList("TB/S","Terabyte/second",strTerabytepersecond,"TB/S"));
            list.add(new ItemList("ethernet","Ethernet",strEthernet,"ethernet"));
            list.add(new ItemList("fast","Ethernet(fast)",strEthernetfast,"fast"));
            list.add(new ItemList("gigabit","Ethernet(gigabit)",strEthernetgigabit,"gigabit"));
            list.add(new ItemList("OC1","OC1",strOC1,"OC1"));
            list.add(new ItemList("OC3","OC3",strOC3,"OC3"));
            list.add(new ItemList("OC12","OC12",strOC12,"OC12"));

            list.add(new ItemList("OC24","OC24",strOC24,"OC24"));
            list.add(new ItemList("OC48","OC48",strOC48,"OC48"));
            list.add(new ItemList("OC192","OC192",strOC192,"OC192"));
            list.add(new ItemList("OC768","OC768",strOC768,"OC768"));
            list.add(new ItemList("ISDN","ISDN (single channel)",strISDNsinglechannel,"ISDN"));
            list.add(new ItemList("ISDN","ISDN(dual channel)",strISDNdualchannel,"ISDN"));
            list.add(new ItemList("Modem","Modem(110)",strModem110,"Modem"));
            list.add(new ItemList("Modem","Modem(300)",strModem300,"Modem"));


            list.add(new ItemList("Modem","Modem(1200)",strModem1200,"Modem"));
            list.add(new ItemList("Modem","Modem(2400)",strModem2400,"Modem"));
            list.add(new ItemList("Modem","Modem(9600)",strModem9600,"Modem"));
            list.add(new ItemList("Modem","Modem(14.4k)",strModem14k,"Modem"));
            list.add(new ItemList("Modem","Modem(28.8k) ",strmodem28k,"Modem"));
            list.add(new ItemList("Modem","Modem(33.6k)",strModem33k,"Modem"));
            list.add(new ItemList("Modem","Modem(56k)",Modem56k,"Modem"));
            list.add(new ItemList("SCSI","SCSI(Async)",strSCSIAsync,"SCSI"));


            list.add(new ItemList("SCSI","SCSI(Sync)",strSCSISync,"SCSI"));
            list.add(new ItemList("SCSI","SCSI(Fast)",strSCSIFast,"SCSI"));
            list.add(new ItemList("SCSI","SCSI(Fast Ultra)",strSCSIFastUltra,"SCSI"));
            list.add(new ItemList("SCSI","SCSI(Fast Wide)",strSCSIFastWide,"SCSI"));
            list.add(new ItemList("SCSI","SCSI(Fast Ultra Wide)",strSCSIFastUltraWide,"SCSI"));
            list.add(new ItemList("SCSI","SCSI(Ultra-2)",strSCSIUltra2,"SCSI"));
            list.add(new ItemList("SCSI","SCSI(Ultra-3)",strSCSIUltra3,"SCSI"));
            list.add(new ItemList("SCSI","SCSI(LVD Ultra 80)",strSCSILVDUltra80,"SCSI"));
            list.add(new ItemList("SCSI","SCSI(LVD Ultra 160)",strSCSILVDUltra160,"SCSI"));

            list.add(new ItemList("IDE","IDE(PIO mode 0)",strIDEPIOmode0,"at"));
            list.add(new ItemList("IDE","IDE(PIO mode 1)",strIDEPIOmode1,"IDE"));
            list.add(new ItemList("IDE","IDE(PIO mode 2)",strIDEPIOmode2,"IDE"));
            list.add(new ItemList("IDE","IDE(PIO mode 3)",strIDEPIOmode3,"IDE"));
            list.add(new ItemList("IDE","IDE(PIO mode 4)",strIDEPIOmode4,"IDE"));
            list.add(new ItemList("IDE","IDE(DMA mode 0)",strIDEDMAmode0,"IDE"));
            list.add(new ItemList("IDE","IDE(DMA mode 1)",strIDEDMAmode1,"IDE"));
            list.add(new ItemList("IDE","IDE(DMA mode 2)",strIDEDMAmode2,"IDE"));
            list.add(new ItemList("IDE","IDE(UDMA mode 0)",strIDEUDMAmode0,"IDE"));
            list.add(new ItemList("IDE","IDE(UDMAmode 1)",strIDEUDMAmode1,"IDE"));
            list.add(new ItemList("IDE","IDE(UDMA mode 2)",strIDEUDMAmode2,"IDE"));
            list.add(new ItemList("IDE","IDE(UDMA mode 3)",strIDEUDMAmode3,"IDE"));
            list.add(new ItemList("IDE","IDE(UDMA mode 4)",strIDEUDMAmode4,"IDE"));
            list.add(new ItemList("IDE","IDE(UDMA 33)",strIDEUDMA33,"IDE"));
            list.add(new ItemList("IDE","IDE(UDMA 66)",strIDEUDMA66,"IDE"));
            list.add(new ItemList("USB","USB",strUSB,"USB"));
            list.add(new ItemList("Firewire","Firewire(IEEE-1394)",strfirewire,"Firewire"));
            list.add(new ItemList("T0","T0(payload)",strT0payload,"T0"));
            list.add(new ItemList("T0","T0(B8ZS payload)",strT0B8ZSpayload,"T0"));
            list.add(new ItemList("T1","T1(signal)",strT1signal,"T1"));
            list.add(new ItemList("T1","T1(payload)",strT1payload,"T1"));
            list.add(new ItemList("T1Z","T1Z(payload)",strT1Zpayload,"T1Z"));
            list.add(new ItemList("T1C","T1C(signal)",strT1Csignal,"T1C"));

            list.add(new ItemList("T1C","T1C(payload)",strT1Cpayload,"T1C"));
            list.add(new ItemList("T2","T2(signal)",strT2signal,"T2"));
            list.add(new ItemList("T3","T3(signal)",strT3signal,"T3"));
            list.add(new ItemList("T3","T3(payload)",strT3payload,"T3"));
            list.add(new ItemList("T3Z","T3Z(payload)",strT3Zpayload,"T3Z"));
            list.add(new ItemList("T4","T4(signal)",strT4signal,"T4"));
            list.add(new ItemList("signal","E.P.T.A.1(signal)",strEPTA1signal,"signal"));
            list.add(new ItemList("payload","E.P.T.A.1(payload)",strEPTA1payload,"payload"));
            list.add(new ItemList("signal","E.P.T.A.2(signal)",strEPTA2signal,"signal"));
            list.add(new ItemList("payload","E.P.T.A.2(payload)",strEPTA2payload,"payload"));
            list.add(new ItemList("signal","E.P.T.A.3(signal)",strEPTA3signal,"signal"));

            list.add(new ItemList("payload","E.P.T.A.3(payload)",strEPTA3payload,"payload"));
            list.add(new ItemList("H0","H0",strH0,"H0"));
            list.add(new ItemList("H11","H11",strH11,"H11"));
            list.add(new ItemList("H12","H12",strH12,"H12"));
            list.add(new ItemList("signal","Virtual Tributary 1(signal)",strVirtualTributary1signal,"signal"));
            list.add(new ItemList("payload","Virtual Tributary 1(payload)",strVirtualTributary1payload,"payload"));
            list.add(new ItemList("signal","Virtual Tributary 2(signal)",strVirtualTributary2signal,"signal"));
            list.add(new ItemList("payload","Virtual Tributary 2(payload)",strVirtualTributary2payload,"payload"));
            list.add(new ItemList("signal","Virtual Tributary 6(signal)",strVirtualTributary6signal,"signal"));
            list.add(new ItemList("payload","Virtual Tributary 6(payload)",strVirtualTributary6payload,"payload"));
            list.add(new ItemList("signal","STS1(signal)",strSTS1signal,"signal"));

            list.add(new ItemList("payload","STS1(payload)",strSTS1payload,"payload"));
            list.add(new ItemList("signal","STS3(signal)",strSTS3signal,"signal"));
            list.add(new ItemList("payload","STS3(payload)",strSTS3payload,"payload"));

            list.add(new ItemList("signal","STS3c(signal)",strSTS3csignal,"signal"));
            list.add(new ItemList("payload","STS3c(payload)",strSTS3cpayload,"payload"));
            list.add(new ItemList("signal","STS12(signal)",strSTS12signal,"signal"));
            list.add(new ItemList("signal","STS24(signal)",strSTS24signal,"signal"));
            list.add(new ItemList("signal","STS48(signal)",strSTS48signal,"signal"));
            list.add(new ItemList("signal","STS192(signal)",strSTS192signal,"signal"));
            list.add(new ItemList("signal","STM-1(signal)",strSTM1signal,"signal"));
            list.add(new ItemList("signal","SSTM-4(signal)",strSTM4signal,"signal"));
            list.add(new ItemList("signal","STM-16(signal)",strSTM16signal,"signal"));
            list.add(new ItemList("signal","STM-64(signal)",strSTM64signal,"signal"));



        }
        return list;

    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {


        rowListItem.clear();
        try {

            double value = Double.parseDouble(edittextConversionListvalue.getText().toString().trim());

            rowListItem1 = getAllunitValue(stringSpinnerFrom,value);


            rcAdapter = new RecyclerViewConversionListAdapter(this,rowListItem1);
            rView.setAdapter(rcAdapter);

        }
        catch (NumberFormatException e) {
            doubleEdittextvalue = 0;

        }
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Take appropriate action for each action item click
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                break;

            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
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

