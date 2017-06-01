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
import com.nineinfosys.basicconverter.Engin.LengthConverter;
import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.ItemList;
import com.nineinfosys.basicconverter.Supporter.Settings;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ConversionLenghtListActivity extends AppCompatActivity implements TextWatcher {

    List<ItemList> list = new ArrayList<ItemList>();
    private  String stringSpinnerFrom;
    private double doubleEdittextvalue;
    private EditText edittextConversionListvalue;
    private TextView textconversionFrom,textViewConversionShortform;
    View ChildView ;
    DecimalFormat formatter = null;


    private RecyclerView rView;
    RecyclerViewConversionListAdapter rcAdapter;
    List<ItemList> rowListItem,rowListItem1;

    private static final int REQUEST_CODE = 100;
    private File imageFile;
    private Bitmap bitmap;
    private PrintHelper printhelper;

    private String strMeter=null,strKilometer=null,strDecimeter=null,strCentimeter=null,strMillimeter=null,strMicrometer=null,strNanometer=null,strMile=null,strYard=null,strFoot=null,strInch=null,strLightyear=null,
            strExameter=null,strPetameter=null,strTerameter=null,strGigameter=null,strMegameter=null,strHectometer=null,strDekameter=null,strMicron=null,strPicometer=null,strFemtometer=null,strAttometer=null,
            strMegaparsec=null,strKiloparsec=null,strParsec=null,strAstronomicalunit=null,strLeague=null,strNauticalleagueUK=null,strNauticalleagueint=null,strLeaguestatute=null,strNauticalmileUK=null,
            strNauticalmileinternational=null,strMilestatute=null,strMileUSsurvey=null,strMileRoman=null,strKiloyard=null,strFurlong=null,strFurlongUSsurvey=null,strChain=null,strChainUSsurvey=null,
            strRope=null,strRod=null,strRodUSsurvey=null,strPerch=null,strPole=null,strFathom=null,strFathomUSsurvey=null,strEll=null,strFootUSsurvey=null,strLink=null,strLinkUSsurvey=null,strCubitUK=null,
            strHand=null,strSpancloth=null,strFingercloth=null,strNailcloth=null,strInchUSsurvey=null,strBarleycorn=null,strMil=null,strMicroinch=null,strAngstrom=null,strAuoflength=null,strXunit=null,
            strFermi=null,strArpent=null,strPica=null,strPoint=null,strTwip=null,strAln=null,strFamn=null,strCaliber=null,strCentiinch=null,strKen=null,strRussianarchin=null,strRomanactus=null,
            strVaradetarea=null,strVaraconuquera=null,strVaracastellana=null,strCubitGreek=null,strLongreed=null,strReed=null,strLongcubit=null,strHandbreadth=null,strFingerbreadth=null,strPlancklength=null,
            strElectronradiusclassical=null,strBohrradius=null,strEarthsequatorialradius=null,strEarthspolarradius=null,strEarthsdistancefromsun=null,strSunsradius=null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_list);

        //keyboard hidden first time
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //customize toolbar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#d3a32b")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Conversion Report");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#9e7500"));
        }

        //format of decimal pint
        formatsetting();

        MobileAds.initialize(ConversionLenghtListActivity.this, getString(R.string.ads_app_id));
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
            case "Meter -m":
                textconversionFrom.setText("Meter");                 textViewConversionShortform.setText("m");
                break;
            case "Kilometer -km":
                textconversionFrom.setText("Kilometer");                 textViewConversionShortform.setText("km");
                break;
            case "Decimeter -dm":
                textconversionFrom.setText("Decimeter");                 textViewConversionShortform.setText("dm");
                break;
            case "Centimeter -cm":
                textconversionFrom.setText("Centimeter");                 textViewConversionShortform.setText("cm");
                break;
            case "Millimeter -mm":
                textconversionFrom.setText("Millimeter");                 textViewConversionShortform.setText("mm");
                break;
            case "Micrometer -μm":
                textconversionFrom.setText("Micrometer");                 textViewConversionShortform.setText("μm");
                break;
            case "Nanometer -nm":
                textconversionFrom.setText("Nanometer");                 textViewConversionShortform.setText("nm");
                break;
            case "Mile -mi,mi(Int)":
                textconversionFrom.setText("Mile");                 textViewConversionShortform.setText("mi,mi(Int)");
                break;
            case "Yard -yd":
                textconversionFrom.setText("Yard");                 textViewConversionShortform.setText("yd");
                break;
            case "Foot -ft":
                textconversionFrom.setText("Foot");                 textViewConversionShortform.setText("ft");
                break;
            case "Inch -in":
                textconversionFrom.setText("Inch");                 textViewConversionShortform.setText("in");
                break;
            case "Light year -ly":
                textconversionFrom.setText("Light year");                 textViewConversionShortform.setText("ly");
                break;
            case "Exameter -Em":
                textconversionFrom.setText("Exameter");                 textViewConversionShortform.setText("Em");
                break;
            case "Petameter -Pm":
                textconversionFrom.setText("Petameter");                 textViewConversionShortform.setText("Pm");
                break;
            case "Terameter -Tm":
                textconversionFrom.setText("Terameter");                 textViewConversionShortform.setText("Tm");
                break;
            case "Gigameter -Gm":
                textconversionFrom.setText("Gigameter");                 textViewConversionShortform.setText("Gm");
                break;
            case "Megameter -Mm":
                textconversionFrom.setText("Megameter");                 textViewConversionShortform.setText("Mm");
                break;
            case "Hectometer -hm":
                textconversionFrom.setText("Hectometer");                 textViewConversionShortform.setText("hm");
                break;
            case "Dekameter -dam":
                textconversionFrom.setText("Dekameter");                 textViewConversionShortform.setText("dam");
                break;
            case "Micron -μ":
                textconversionFrom.setText("Micron");                 textViewConversionShortform.setText("μ");
                break;
            case "Picometer -pm":
                textconversionFrom.setText("Picometer");                 textViewConversionShortform.setText("pm");
                break;
            case "Femtometer -fm":
                textconversionFrom.setText("Femtometer");                 textViewConversionShortform.setText("fm");
                break;
            case "Attometer -am":
                textconversionFrom.setText("Attometer");                 textViewConversionShortform.setText("am");
                break;
            case "Megaparsec -Mpc":
                textconversionFrom.setText("Megaparsec");                 textViewConversionShortform.setText("Mpc");
                break;
            case "Kiloparsec -kpc":
                textconversionFrom.setText("Kiloparsec");                 textViewConversionShortform.setText("kpc");
                break;
            case "Parsec -pc":
                textconversionFrom.setText("Parsec");                 textViewConversionShortform.setText("pc");
                break;
            case "Astronomical unit -AU,UA":
                textconversionFrom.setText("Astronomical unit");                 textViewConversionShortform.setText("AU,UA");
                break;
            case "League -lea":
                textconversionFrom.setText("League");                 textViewConversionShortform.setText("lea");
                break;
            case "Nautical league (UK) -n.lea(UK)":
                textconversionFrom.setText("Nautical league (UK)");                 textViewConversionShortform.setText("n.lea(UK)");
                break;
            case "Nautical league (int.) -n.lea":
                textconversionFrom.setText("Nautical league (int.)");                 textViewConversionShortform.setText("n.lea");
                break;
            case "League (statute) -lea(US)":
                textconversionFrom.setText("League (statute)");                 textViewConversionShortform.setText("lea(US)");
                break;
            case "Nautical mile (UK) -n.mi":
                textconversionFrom.setText("Nautical mile (UK)");                 textViewConversionShortform.setText("n.mi");
                break;
            case "Nautical mile (international) -n.mi":
                textconversionFrom.setText("Nautical mile (international)");                 textViewConversionShortform.setText("n.mi");
                break;
            case "Mile (statute) -mi,mi(US)":
                textconversionFrom.setText("Mile (statute)");                 textViewConversionShortform.setText("mi,mi(US)");
                break;
            case "Mile (US survey) -mi,mi(US)":
                textconversionFrom.setText("Mile (US survey)");                 textViewConversionShortform.setText("mi,mi(US)");
                break;
            case "Mile (Roman)-mile":
                textconversionFrom.setText("Mile (Roman)");                 textViewConversionShortform.setText("mile");
                break;
            case "Kiloyard -kyd":
                textconversionFrom.setText("Kiloyard");                 textViewConversionShortform.setText("kyd");
                break;
            case "Furlong -fur":
                textconversionFrom.setText("Furlong");                 textViewConversionShortform.setText("fur");
                break;
            case "Furlong (US survey) -fur":
                textconversionFrom.setText("Furlong (US survey)");                 textViewConversionShortform.setText("fur");
                break;
            case "Chain -ch":
                textconversionFrom.setText("Chain");                 textViewConversionShortform.setText("ch");
                break;
            case "Chain (US survey) -ch":
                textconversionFrom.setText("Chain (US survey)");                 textViewConversionShortform.setText("ch");
                break;
            case "Rope -rope":
                textconversionFrom.setText("Rope");                 textViewConversionShortform.setText("rope");
                break;
            case "Rod -rd":
                textconversionFrom.setText("Rod");                 textViewConversionShortform.setText("rd");
                break;
            case "Rod (US survey) -rd":
                textconversionFrom.setText("Rod (US survey)");                 textViewConversionShortform.setText("rd");
                break;
            case "Perch -perch":
                textconversionFrom.setText("Perch");                 textViewConversionShortform.setText("perch");
                break;
            case "Pole -pole":
                textconversionFrom.setText("Pole");                 textViewConversionShortform.setText("pole");
                break;
            case "Fathom -fath":
                textconversionFrom.setText("Fathom");                 textViewConversionShortform.setText("fath");
                break;
            case "Fathom (US survey) -fath":
                textconversionFrom.setText("Fathom (US survey)");                 textViewConversionShortform.setText("fath");
                break;
            case "Ell -ell":
                textconversionFrom.setText("Ell");                 textViewConversionShortform.setText("ell");
                break;
            case "Foot (US survey) -ft":
                textconversionFrom.setText("Foot (US survey)");                 textViewConversionShortform.setText("ft");
                break;
            case "Link -li":
                textconversionFrom.setText("Link");                 textViewConversionShortform.setText("li");
                break;
            case "Link (US survey) -li":
                textconversionFrom.setText("Link (US survey)");                 textViewConversionShortform.setText("li");
                break;
            case "Cubit (UK) -cubit":
                textconversionFrom.setText("Cubit (UK)");                 textViewConversionShortform.setText("cubit");
                break;
            case "Hand -hand":
                textconversionFrom.setText("Hand");                 textViewConversionShortform.setText("hand");
                break;
            case "Span (cloth) -span":
                textconversionFrom.setText("Span (cloth)");                 textViewConversionShortform.setText("span");
                break;
            case "Finger (cloth) -finger":
                textconversionFrom.setText("Finger (cloth)");                 textViewConversionShortform.setText("finger");
                break;
            case "Nail (cloth) -nail":
                textconversionFrom.setText("Nail (cloth)");                 textViewConversionShortform.setText("nail");
                break;
            case "Inch (US survey) -in":
                textconversionFrom.setText("Inch (US survey)");                 textViewConversionShortform.setText("in");
                break;
            case "Barleycorn -barleycorn":
                textconversionFrom.setText("Barleycorn");                 textViewConversionShortform.setText("barleycorn");
                break;
            case "Mil -mil,thou":
                textconversionFrom.setText("Mil");                 textViewConversionShortform.setText("mil,thou");
                break;
            case "Microinch -μ.in":
                textconversionFrom.setText("Microinch");                 textViewConversionShortform.setText("μ.in");
                break;
            case "Angstrom -A":
                textconversionFrom.setText("Angstrom");                 textViewConversionShortform.setText("A");
                break;
            case "A.u. of length -a.u.,b":
                textconversionFrom.setText("A.u. of length");                 textViewConversionShortform.setText("a.u.,b");
                break;
            case "X-unit -X":
                textconversionFrom.setText("X-unit");                 textViewConversionShortform.setText("X");
                break;
            case "Fermi -F,f":
                textconversionFrom.setText("Fermi");                 textViewConversionShortform.setText("F,f");
                break;
            case "Arpent -Arpent":
                textconversionFrom.setText("Arpent");                 textViewConversionShortform.setText("Arpent");
                break;
            case "Pica -pica":
                textconversionFrom.setText("Pica");                 textViewConversionShortform.setText("pica");
                break;
            case "Point -Point":
                textconversionFrom.setText("Point");                 textViewConversionShortform.setText("Point");
                break;
            case "Twip  -twip":
                textconversionFrom.setText("Twip");                 textViewConversionShortform.setText("twip");
                break;
            case "Aln -aln":
                textconversionFrom.setText("Aln");                 textViewConversionShortform.setText("aln");
                break;
            case "Famn -famn":
                textconversionFrom.setText("Famn");                 textViewConversionShortform.setText("famn");
                break;
            case "Caliber -cl":
                textconversionFrom.setText("Caliber");                 textViewConversionShortform.setText("cl");
                break;
            case "Centiinch -cin":
                textconversionFrom.setText("Centiinch");                 textViewConversionShortform.setText("cin");
                break;
            case "Ken -ken":
                textconversionFrom.setText("Ken");                 textViewConversionShortform.setText("ken");
                break;
            case "Russian archin -archin":
                textconversionFrom.setText("Russian archin");                 textViewConversionShortform.setText("archin");
                break;
            case "Roman actus -actus":
                textconversionFrom.setText("Roman actus");                 textViewConversionShortform.setText("actus");
                break;
            case "Vara de tarea -v.de.t":
                textconversionFrom.setText("Vara de tarea");                 textViewConversionShortform.setText("v.de.t");
                break;
            case "Vara conuquera -vc":
                textconversionFrom.setText("Vara conuquera");                 textViewConversionShortform.setText("vc");
                break;
            case "Vara castellana -vcas":
                textconversionFrom.setText("Vara castellana");                 textViewConversionShortform.setText("vcas");
                break;
            case "Cubit (Greek) -cubit":
                textconversionFrom.setText("Cubit (Greek)");                 textViewConversionShortform.setText("cubit");
                break;
            case "Long reed -lreed":
                textconversionFrom.setText("Long reed");                 textViewConversionShortform.setText("lreed");
                break;
            case "Reed -reed":
                textconversionFrom.setText("Reed");                 textViewConversionShortform.setText("reed");
                break;
            case "Long cubit -long cubit":
                textconversionFrom.setText("Long cubit");                 textViewConversionShortform.setText("long cubit");
                break;
            case "Handbreadth -hb":
                textconversionFrom.setText("Handbreadth");                 textViewConversionShortform.setText("hb");
                break;
            case "Fingerbreadth -fb":
                textconversionFrom.setText("Fingerbreadth");                 textViewConversionShortform.setText("fb");
                break;
            case "Planck length -Planck":
                textconversionFrom.setText("Planck length");                 textViewConversionShortform.setText("Planck");
                break;
            case "Electron radius (classical) -e-rad":
                textconversionFrom.setText("Electron radius (classical)");                 textViewConversionShortform.setText("e-rad");
                break;
            case "Bohr radius -b,a.u.:":
                textconversionFrom.setText("Bohr radius");                 textViewConversionShortform.setText("b,a.u.:");
                break;
            case "Earth's equatorial radius -Earth":
                textconversionFrom.setText("Earth's equatorial radius");                 textViewConversionShortform.setText("Earth");
                break;
            case "Earth's polar radius -Earth":
                textconversionFrom.setText("Earth's polar radius");                 textViewConversionShortform.setText("Earth");
                break;
            case "Earth's distance from sun -Earth":
                textconversionFrom.setText("Earth's distance from sun");                 textViewConversionShortform.setText("Earth");
                break;
            case "Sun's radius -Sun":
                textconversionFrom.setText("Sun's radius");                 textViewConversionShortform.setText("Sun");
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

        LengthConverter c = new  LengthConverter(strSpinnerFrom,doubleEdittextvalue1);
        ArrayList<LengthConverter.ConversionResults> results = c.calculateLengthConversion();
        int length = results.size();
        for (int i = 0; i < length; i++) {
            LengthConverter.ConversionResults item = results.get(i);


            strMeter=String.valueOf(formatter.format(item.getMeter()));
            strKilometer=String.valueOf(formatter.format(item.getKilometer()));
            strDecimeter=String.valueOf(formatter.format(item.getDecimeter()));
            strCentimeter=String.valueOf(formatter.format(item.getCentimeter()));
            strMillimeter=String.valueOf(formatter.format(item.getMillimeter()));
            strMicrometer=String.valueOf(formatter.format(item.getMicrometer()));
            strNanometer=String.valueOf(formatter.format(item.getNanometer()));
            strMile=String.valueOf(formatter.format(item.getMile()));
            strYard=String.valueOf(formatter.format(item.getYard()));
            strFoot=String.valueOf(formatter.format(item.getFoot()));
            strInch=String.valueOf(formatter.format(item.getInch()));
            strLightyear=String.valueOf(formatter.format(item.getLightyear()));
            strExameter=String.valueOf(formatter.format(item.getExameter()));
            strPetameter=String.valueOf(formatter.format(item.getPetameter()));
            strTerameter=String.valueOf(formatter.format(item.getTerameter()));
            strGigameter=String.valueOf(formatter.format(item.getGigameter()));
            strMegameter=String.valueOf(formatter.format(item.getMegameter()));
            strHectometer=String.valueOf(formatter.format(item.getHectometer()));
            strDekameter=String.valueOf(formatter.format(item.getDekameter()));
            strMicron=String.valueOf(formatter.format(item.getMicron()));
            strPicometer=String.valueOf(formatter.format(item.getPicometer()));
            strFemtometer=String.valueOf(formatter.format(item.getFemtometer()));
            strAttometer=String.valueOf(formatter.format(item.getAttometer()));
            strMegaparsec=String.valueOf(formatter.format(item.getMegaparsec()));
            strKiloparsec=String.valueOf(formatter.format(item.getKiloparsec()));
            strParsec=String.valueOf(formatter.format(item.getParsec()));
            strAstronomicalunit=String.valueOf(formatter.format(item.getAstronomicalunit()));
            strLeague=String.valueOf(formatter.format(item.getLeague()));
            strNauticalleagueUK=String.valueOf(formatter.format(item.getNauticalleagueUK()));
            strNauticalleagueint=String.valueOf(formatter.format(item.getNauticalleagueint()));
            strLeaguestatute=String.valueOf(formatter.format(item.getLeaguestatute()));
            strNauticalmileUK=String.valueOf(formatter.format(item.getNauticalmileUK()));
            strNauticalmileinternational=String.valueOf(formatter.format(item.getNauticalmileinternational()));
            strMilestatute=String.valueOf(formatter.format(item.getMilestatute()));
            strMileUSsurvey=String.valueOf(formatter.format(item.getMileUSsurvey()));
            strMileRoman=String.valueOf(formatter.format(item.getMileRoman()));
            strKiloyard=String.valueOf(formatter.format(item.getKiloyard()));
            strFurlong=String.valueOf(formatter.format(item.getFurlong()));
            strFurlongUSsurvey=String.valueOf(formatter.format(item.getFurlongUSsurvey()));
            strChain=String.valueOf(formatter.format(item.getChain()));
            strChainUSsurvey=String.valueOf(formatter.format(item.getChainUSsurvey()));
            strRope=String.valueOf(formatter.format(item.getRope()));
            strRod=String.valueOf(formatter.format(item.getRod()));
            strRodUSsurvey=String.valueOf(formatter.format(item.getRodUSsurvey()));
            strPerch=String.valueOf(formatter.format(item.getPerch()));
            strPole=String.valueOf(formatter.format(item.getPole()));
            strFathom=String.valueOf(formatter.format(item.getFathom()));
            strFathomUSsurvey=String.valueOf(formatter.format(item.getFathomUSsurvey()));
            strEll=String.valueOf(formatter.format(item.getEll()));
            strFootUSsurvey=String.valueOf(formatter.format(item.getFootUSsurvey()));
            strLink=String.valueOf(formatter.format(item.getLink()));
            strLinkUSsurvey=String.valueOf(formatter.format(item.getLinkUSsurvey()));
            strCubitUK=String.valueOf(formatter.format(item.getCubitUK()));
            strHand=String.valueOf(formatter.format(item.getHand()));
            strSpancloth=String.valueOf(formatter.format(item.getSpancloth()));
            strFingercloth=String.valueOf(formatter.format(item.getFingercloth()));
            strNailcloth=String.valueOf(formatter.format(item.getNailcloth()));
            strInchUSsurvey=String.valueOf(formatter.format(item.getInchUSsurvey()));
            strBarleycorn=String.valueOf(formatter.format(item.getBarleycorn()));
            strMil=String.valueOf(formatter.format(item.getMil()));
            strMicroinch=String.valueOf(formatter.format(item.getMicroinch()));
            strAngstrom=String.valueOf(formatter.format(item.getAngstrom()));
            strAuoflength=String.valueOf(formatter.format(item.getAuoflength()));
            strXunit=String.valueOf(formatter.format(item.getXunit()));
            strFermi=String.valueOf(formatter.format(item.getFermi()));
            strArpent=String.valueOf(formatter.format(item.getArpent()));
            strPica=String.valueOf(formatter.format(item.getPica()));
            strPoint=String.valueOf(formatter.format(item.getPoint()));
            strTwip=String.valueOf(formatter.format(item.getTwip()));
            strAln=String.valueOf(formatter.format(item.getAln()));
            strFamn=String.valueOf(formatter.format(item.getFamn()));
            strCaliber=String.valueOf(formatter.format(item.getCaliber()));
            strCentiinch=String.valueOf(formatter.format(item.getCentiinch()));
            strKen=String.valueOf(formatter.format(item.getKen()));
            strRussianarchin=String.valueOf(formatter.format(item.getRussianarchin()));
            strRomanactus=String.valueOf(formatter.format(item.getRomanactus()));
            strVaradetarea=String.valueOf(formatter.format(item.getVaradetarea()));
            strVaraconuquera=String.valueOf(formatter.format(item.getVaraconuquera()));
            strVaracastellana=String.valueOf(formatter.format(item.getVaracastellana()));
            strCubitGreek=String.valueOf(formatter.format(item.getCubitGreek()));
            strLongreed=String.valueOf(formatter.format(item.getLongreed()));
            strReed=String.valueOf(formatter.format(item.getReed()));
            strLongcubit=String.valueOf(formatter.format(item.getLongcubit()));
            strHandbreadth=String.valueOf(formatter.format(item.getHandbreadth()));
            strFingerbreadth=String.valueOf(formatter.format(item.getFingerbreadth()));
            strPlancklength=String.valueOf(formatter.format(item.getPlancklength()));
            strElectronradiusclassical=String.valueOf(formatter.format(item.getElectronradiusclassical()));
            strBohrradius=String.valueOf(formatter.format(item.getBohrradius()));
            strEarthsequatorialradius=String.valueOf(formatter.format(item.getEarthsequatorialradius()));
            strEarthspolarradius=String.valueOf(formatter.format(item.getEarthspolarradius()));
            strEarthsdistancefromsun=String.valueOf(formatter.format(item.getEarthsdistancefromsun()));
            strSunsradius=String.valueOf(formatter.format(item.getSunsradius()));

            list.add(new ItemList("m","Meter",strMeter,"m"));
            list.add(new ItemList("km","Kilometer",strKilometer,"km"));
            list.add(new ItemList("dm","Decimeter",strDecimeter,"dm"));
            list.add(new ItemList("cm","Centimeter",strCentimeter,"cm"));
            list.add(new ItemList("mm","Millimeter",strMillimeter,"mm"));
            list.add(new ItemList("μm","Micrometer",strMicrometer,"μm"));
            list.add(new ItemList("nm","Nanometer",strNanometer,"nm"));
            list.add(new ItemList("mi,mi(Int)","Mile",strMile,"mi,mi(Int)"));
            list.add(new ItemList("yd","Yard",strYard,"yd"));
            list.add(new ItemList("ft","Foot",strFoot,"ft"));
            list.add(new ItemList("in","Inch",strInch,"in"));
            list.add(new ItemList("ly","Light year",strLightyear,"ly"));
            list.add(new ItemList("Em","Exameter",strExameter,"Em"));
            list.add(new ItemList("Pm","Petameter",strPetameter,"Pm"));
            list.add(new ItemList("Tm","Terameter",strTerameter,"Tm"));
            list.add(new ItemList("Gm","Gigameter",strGigameter,"Gm"));
            list.add(new ItemList("Mm","Megameter",strMegameter,"Mm"));
            list.add(new ItemList("hm","Hectometer",strHectometer,"hm"));
            list.add(new ItemList("dam","Dekameter",strDekameter,"dam"));
            list.add(new ItemList("μ","Micron",strMicron,"μ"));
            list.add(new ItemList("pm","Picometer",strPicometer,"pm"));
            list.add(new ItemList("fm","Femtometer",strFemtometer,"fm"));
            list.add(new ItemList("am","Attometer",strAttometer,"am"));
            list.add(new ItemList("Mpc","Megaparsec",strMegameter,"Mpc"));
            list.add(new ItemList("kpc","Kiloparsec",strKiloparsec,"kpc"));
            list.add(new ItemList("pc","Parsec",strParsec,"pc"));
            list.add(new ItemList("AU,UA","Astronomical unit",strAstronomicalunit,"AU,UA"));
            list.add(new ItemList("lea","League",strLeague,"lea"));
            list.add(new ItemList("n.lea(UK)","Nautical league (UK)",strNauticalleagueUK,"n.lea(UK)"));
            list.add(new ItemList("n.lea","Nautical league (int.)",strNauticalleagueint,"n.lea"));
            list.add(new ItemList("lea(US)","League (statute)",strLeaguestatute,"lea(US)"));
            list.add(new ItemList("n.mi","Nautical mile (UK)",strNauticalmileUK,"n.mi"));
            list.add(new ItemList("n.mi","Nautical mile (international)",strNauticalmileinternational,"n.mi"));
            list.add(new ItemList("mi,mi(US)","Mile (statute)",strMilestatute,"mi,mi(US)"));
            list.add(new ItemList("mi,mi(US)","Mile (US survey)",strMileUSsurvey,"mi,mi(US)"));
            list.add(new ItemList("mile","Mile (Roman)",strMileRoman,"mile"));
            list.add(new ItemList("kyd","Kiloyard",strKiloyard,"kyd"));
            list.add(new ItemList("fur","Furlong",strFurlong,"fur"));
            list.add(new ItemList("fur","Furlong (US survey)",strFurlongUSsurvey,"fur"));
            list.add(new ItemList("ch","Chain",strChain,"ch"));
            list.add(new ItemList("ch","Chain (US survey)",strChainUSsurvey,"ch"));
            list.add(new ItemList("rope","Rope",strRope,"rope"));
            list.add(new ItemList("rd","Rod",strRod,"rd"));
            list.add(new ItemList("rd","Rod (US survey)",strRodUSsurvey,"rd"));
            list.add(new ItemList("perch","Perch",strPerch,"perch"));
            list.add(new ItemList("pole","Pole",strPole,"pole"));
            list.add(new ItemList("fath","Fathom",strFathom,"fath"));
            list.add(new ItemList("fath","Fathom (US survey)",strFathomUSsurvey,"fath"));
            list.add(new ItemList("ell","Ell",strEll,"ell"));
            list.add(new ItemList("ft","Foot (US survey)",strFootUSsurvey,"ft"));
            list.add(new ItemList("li","Link",strLink,"li"));
            list.add(new ItemList("li","Link (US survey)",strLinkUSsurvey,"li"));
            list.add(new ItemList("cubit","Cubit (UK)",strCubitUK,"cubit"));
            list.add(new ItemList("hand","Hand",strHand,"hand"));
            list.add(new ItemList("span","Span (cloth)",strSpancloth,"span"));
            list.add(new ItemList("finger","Finger (cloth)",strFingercloth,"finger"));
            list.add(new ItemList("nail","Nail (cloth)",strNailcloth,"nail"));
            list.add(new ItemList("in","Inch (US survey)",strInchUSsurvey,"in"));
            list.add(new ItemList("barleycorn","Barleycorn",strBarleycorn,"barleycorn"));
            list.add(new ItemList("mil,thou","Mil",strMil,"mil,thou"));
            list.add(new ItemList("μ.in","Microinch",strMicroinch,"μ.in"));
            list.add(new ItemList("A","Angstrom",strAngstrom,"A"));
            list.add(new ItemList("a.u.,b","A.u. of length",strAuoflength,"a.u.,b"));
            list.add(new ItemList("X","X-unit",strXunit,"X"));
            list.add(new ItemList("F,f","Fermi",strFermi,"F,f"));
            list.add(new ItemList("Arpent","Arpent",strArpent,"Arpent"));
            list.add(new ItemList("pica","Pica",strPica,"pica"));
            list.add(new ItemList("Point","Point",strPoint,"Point"));
            list.add(new ItemList("twip","Twip ",strTwip,"twip"));
            list.add(new ItemList("aln","Aln",strAln,"aln"));
            list.add(new ItemList("famn","Famn",strFamn,"famn"));
            list.add(new ItemList("cl","Caliber",strCaliber,"cl"));
            list.add(new ItemList("cin","Centiinch",strCentiinch,"cin"));
            list.add(new ItemList("ken","Ken",strKen,"ken"));
            list.add(new ItemList("archin","Russian archin",strRussianarchin,"archin"));
            list.add(new ItemList("actus","Roman actus",strRomanactus,"actus"));
            list.add(new ItemList("v.de.t","Vara de tarea",strVaradetarea,"v.de.t"));
            list.add(new ItemList("vc","Vara conuquera",strVaraconuquera,"vc"));
            list.add(new ItemList("vcas","Vara castellana",strVaracastellana,"vcas"));
            list.add(new ItemList("cubit","Cubit (Greek)",strCubitGreek,"cubit"));
            list.add(new ItemList("lreed","Long reed",strLongreed,"lreed"));
            list.add(new ItemList("reed","Reed",strReed,"reed"));
            list.add(new ItemList("long cubit","Long cubit",strLongcubit,"long cubit"));
            list.add(new ItemList("hb","Handbreadth",strHandbreadth,"hb"));
            list.add(new ItemList("fb","Fingerbreadth",strFingerbreadth,"fb"));
            list.add(new ItemList("Planck","Planck length",strPlancklength,"Planck"));
            list.add(new ItemList("e-rad","Electron radius (classical)",strElectronradiusclassical,"e-rad"));
            list.add(new ItemList("b,a.u.:","Bohr radius",strBohrradius,"b,a.u.:"));
            list.add(new ItemList("Earth","Earth's equatorial radius",strEarthsequatorialradius,"Earth"));
            list.add(new ItemList("Earth","Earth's polar radius",strEarthspolarradius,"Earth"));
            list.add(new ItemList("Earth","Earth's distance from sun",strEarthsdistancefromsun,"Earth"));
            list.add(new ItemList("Sun","Sun's radius",strSunsradius,"Sun"));

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
