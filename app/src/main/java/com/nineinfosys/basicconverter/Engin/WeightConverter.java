package com.nineinfosys.basicconverter.Engin;



        import java.util.ArrayList;

public class WeightConverter{

    private double kilogram,gram,milligram,tonmetric,pound,ounce,carat,tonshort,tonlong,atomicmassunit,exagram,petagram,teragram,gigagram,megagram,
            hectogram,dekagram,decigram,centigram,microgram,nanogram,picogram,femtogram,attogram,dalton,kilogramforcesquaresecondpermeter,kilopound,kip,slug,poundforcesquaresecondperfoot,
            poundtroy,poundal,tonus,tonuk,kiloton,quintal,hundredweightus,hundredweightuk,quarterus,quarteruk,stoneus,stoneuk,tonne,pennyweight,scruple,grain,gamma,talent,mina,shekel,bekan,gerah,
            talentbiblicalgreek,minabiblicalgreek,tetradrachmabiblicalgreek,didrachmabiblicalgreek,drachmabiblicalgreek,denariusbiblicalroman,assarionbiblicalroman,quadransbiblicalroman,leptonbiblicalroman,
            planckmass,electronmass,muonmass,protonmass,neutronmass,deuteronmass,earthmass,sunmass;
    private double edtValue;
    private String conversionFrom;
    //private String conversionTo;


    public WeightConverter(String conversionFrom, double edtValue) {
        // TODO Auto-generated constructor stub
        this.conversionFrom = conversionFrom;
        this.edtValue = edtValue;
    }



    public ArrayList<ConversionResults> calculateWeightConversion()
    {

        ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();

        ConversionResults results= new ConversionResults();

        switch(conversionFrom)
        {
            case "Kilogram -  kg":
                kilogram=(edtValue)*1;
                gram=(edtValue)*1000;
                milligram=(edtValue)*1000000;
                tonmetric=(edtValue)*0.001;
                pound=(edtValue)*2.2046226218;
                ounce=(edtValue)*35.27396195;
                carat=(edtValue)*5000;
                tonshort=(edtValue)*0.0011023113;
                tonlong=(edtValue)*0.0009842065;
                atomicmassunit=(edtValue)*6.022136651E+26;
                exagram=(edtValue)*1.E-15;
                petagram=(edtValue)*1.E-12;
                teragram=(edtValue)*1.E-9;
                gigagram=(edtValue)*0.000001;
                megagram=(edtValue)*0.001;
                hectogram=(edtValue)*10;
                dekagram=(edtValue)*100;
                decigram=(edtValue)*10000;
                centigram=(edtValue)*100000;
                microgram=(edtValue)*1000000000;
                nanogram=(edtValue)*1000000000000.0;
                picogram=(edtValue)*1000000000000000.0;
                femtogram=(edtValue)*1000000000000000000.0;
                attogram=(edtValue)*1.E+21;
                dalton=(edtValue)*6.022173643E+26;
                kilogramforcesquaresecondpermeter=(edtValue)*0.1019716213;
                kilopound=(edtValue)*0.0022046226;
                kip=(edtValue)*0.0022046226;
                slug=(edtValue)*0.0685217659;
                poundforcesquaresecondperfoot=(edtValue)*0.0685217659;
                poundtroy=(edtValue)*2.6792288807;
                poundal=(edtValue)*70.988848424;
                tonus=(edtValue)*34.285710367;
                tonuk=(edtValue)*30.612244898;
                kiloton=(edtValue)*0.000001;
                quintal=(edtValue)*0.01;
                hundredweightus=(edtValue)*0.0220462262;
                hundredweightuk=(edtValue)*0.0196841306;
                quarterus=(edtValue)*0.0881849049;
                quarteruk=(edtValue)*0.0787365222;
                stoneus=(edtValue)*0.1763698097;
                stoneuk=(edtValue)*0.1574730444;
                tonne=(edtValue)*0.001;
                pennyweight=(edtValue)*643.01493137;
                scruple=(edtValue)*771.61791764;
                grain=(edtValue)*15432.358353;
                gamma=(edtValue)*1000000000;
                talent=(edtValue)*0.0292397661;
                mina=(edtValue)*1.7543859649;
                shekel=(edtValue)*87.719298246;
                bekan=(edtValue)*175.43859649;
                gerah=(edtValue)*1754.3859649;
                talentbiblicalgreek=(edtValue)*0.0490196078;
                minabiblicalgreek=(edtValue)*2.9411764706;
                tetradrachmabiblicalgreek=(edtValue)*73.529411765;
                didrachmabiblicalgreek=(edtValue)*147.05882353;
                drachmabiblicalgreek=(edtValue)*294.11764706;
                denariusbiblicalroman=(edtValue)*259.74025974;
                assarionbiblicalroman=(edtValue)*4155.8441558;
                quadransbiblicalroman=(edtValue)*16623.376623;
                leptonbiblicalroman=(edtValue)*33246.753247;
                planckmass=(edtValue)*45940892.448;
                electronmass=(edtValue)*1.097768382E+30;
                muonmass=(edtValue)*5.309172492E+27;
                protonmass=(edtValue)*5.978633201E+26;
                neutronmass=(edtValue)*5.970403753E+26;
                deuteronmass=(edtValue)*2.990800894E+26;
                earthmass=(edtValue)*1.673360107E-25;
                sunmass=(edtValue)*5.E-31;
                break;

            case "Gram - g":
                kilogram=(edtValue)*0.001;
                gram=(edtValue)*1;
                milligram=(edtValue)*1000;
                tonmetric=(edtValue)*0.000001;
                pound=(edtValue)*0.0022046226;
                ounce=(edtValue)*0.0352739619;
                carat=(edtValue)*5;
                tonshort=(edtValue)*0.0000011023;
                tonlong=(edtValue)*9.842065276E-7;
                atomicmassunit=(edtValue)*6.022136651E+23;
                exagram=(edtValue)*1.E-18;
                petagram=(edtValue)*1.E-15;
                teragram=(edtValue)*1.E-12;
                gigagram=(edtValue)*1.E-9;
                megagram=(edtValue)*0.000001;
                hectogram=(edtValue)*0.01;
                dekagram=(edtValue)*0.1;
                decigram=(edtValue)*10;
                centigram=(edtValue)*100;
                microgram=(edtValue)*1000000;
                nanogram=(edtValue)*1000000000.0;
                picogram=(edtValue)*1000000000000.0;
                femtogram=(edtValue)*1000000000000000.0;
                attogram=(edtValue)*1000000000000000000.0;
                dalton=(edtValue)*6.022173643E+23;
                kilogramforcesquaresecondpermeter=(edtValue)*0.0001019716;
                kilopound=(edtValue)*0.0000022046;
                kip=(edtValue)*0.0000022046;
                slug=(edtValue)*0.0000685218;
                poundforcesquaresecondperfoot=(edtValue)*0.0000685218;
                poundtroy=(edtValue)*0.0026792289;
                poundal=(edtValue)*0.0709888484;
                tonus=(edtValue)*0.0342857104;
                tonuk=(edtValue)*0.0306122449;
                kiloton=(edtValue)*1.E-9;
                quintal=(edtValue)*0.00001;
                hundredweightus=(edtValue)*0.0000220462;
                hundredweightuk=(edtValue)*0.0000196841;
                quarterus=(edtValue)*0.0000881849;
                quarteruk=(edtValue)*0.0000787365;
                stoneus=(edtValue)*0.0001763698;
                stoneuk=(edtValue)*0.000157473;
                tonne=(edtValue)*0.000001;
                pennyweight=(edtValue)*0.6430149314;
                scruple=(edtValue)*0.7716179176;
                grain=(edtValue)*15.432358353;
                gamma=(edtValue)*1000000;
                talent=(edtValue)*0.0000292398;
                mina=(edtValue)*0.001754386;
                shekel=(edtValue)*0.0877192982;
                bekan=(edtValue)*0.1754385965;
                gerah=(edtValue)*1.7543859649;
                talentbiblicalgreek=(edtValue)*0.0000490196;
                minabiblicalgreek=(edtValue)*0.0029411765;
                tetradrachmabiblicalgreek=(edtValue)*0.0735294118;
                didrachmabiblicalgreek=(edtValue)*0.1470588235;
                drachmabiblicalgreek=(edtValue)*0.2941176471;
                denariusbiblicalroman=(edtValue)*0.2597402597;
                assarionbiblicalroman=(edtValue)*4.1558441558;
                quadransbiblicalroman=(edtValue)*16.623376623;
                leptonbiblicalroman=(edtValue)*33.246753247;
                planckmass=(edtValue)*45940.892448;
                electronmass=(edtValue)*1.097768382E+27;
                muonmass=(edtValue)*5.309172492E+24;
                protonmass=(edtValue)*5.978633201E+23;
                neutronmass=(edtValue)*5.970403753E+23;
                deuteronmass=(edtValue)*2.990800894E+23;
                earthmass=(edtValue)*1.673360107E-28;
                sunmass=(edtValue)*5.E-34;
                break;




            case "Milligram - mg":
                kilogram=(edtValue)*0.000001;
                gram=(edtValue)*0.001;
                milligram=(edtValue)*1;
                tonmetric=(edtValue)*1.E-9;
                pound=(edtValue)*0.0000022046;
                ounce=(edtValue)*0.000035274;
                carat=(edtValue)*0.005;
                tonshort=(edtValue)*1.10231131E-9;
                tonlong=(edtValue)*9.842065276E-10;
                atomicmassunit=(edtValue)*602213665167520000000.0;
                exagram=(edtValue)*1.E-21;
                petagram=(edtValue)*1.E-18;
                teragram=(edtValue)*1.E-15;
                gigagram=(edtValue)*1.E-12;
                megagram=(edtValue)*1.E-9;
                hectogram=(edtValue)*0.00001;
                dekagram=(edtValue)*0.0001;
                decigram=(edtValue)*0.01;
                centigram=(edtValue)*0.1;
                microgram=(edtValue)*1000;
                nanogram=(edtValue)*1000000;
                picogram=(edtValue)*1000000000;
                femtogram=(edtValue)*1000000000000.0;
                attogram=(edtValue)*1000000000000000.0;
                dalton=(edtValue)*602217364335000000000.0;
                kilogramforcesquaresecondpermeter=(edtValue)*1.019716212E-7;
                kilopound=(edtValue)*2.204622621E-9;
                kip=(edtValue)*2.204622621E-9;
                slug=(edtValue)*6.852176585E-8;
                poundforcesquaresecondperfoot=(edtValue)*6.852176585E-8;
                poundtroy=(edtValue)*0.0000026792;
                poundal=(edtValue)*0.0000709888;
                tonus=(edtValue)*0.0000342857;
                tonuk=(edtValue)*0.0000306122;
                kiloton=(edtValue)*1.E-12;
                quintal=(edtValue)*1.E-8;
                hundredweightus=(edtValue)*2.204622621E-8;
                hundredweightuk=(edtValue)*1.968413055E-8;
                quarterus=(edtValue)*8.818490487E-8;
                quarteruk=(edtValue)*7.87365222E-8;
                stoneus=(edtValue)*1.763698097E-7;
                stoneuk=(edtValue)*1.574730444E-7;
                tonne=(edtValue)*1.E-9;
                pennyweight=(edtValue)*0.0006430149;
                scruple=(edtValue)*0.0007716179;
                grain=(edtValue)*0.0154323584;
                gamma=(edtValue)*1000;
                talent=(edtValue)*2.923976608E-8;
                mina=(edtValue)*0.0000017544;
                shekel=(edtValue)*0.0000877193;
                bekan=(edtValue)*0.0001754386;
                gerah=(edtValue)*0.001754386;
                talentbiblicalgreek=(edtValue)*4.901960784E-8;
                minabiblicalgreek=(edtValue)*0.0000029412;
                tetradrachmabiblicalgreek=(edtValue)*0.0000735294;
                didrachmabiblicalgreek=(edtValue)*0.0001470588;
                drachmabiblicalgreek=(edtValue)*0.0002941176;
                denariusbiblicalroman=(edtValue)*0.0002597403;
                assarionbiblicalroman=(edtValue)*0.0041558442;
                quadransbiblicalroman=(edtValue)*0.0166233766;
                leptonbiblicalroman=(edtValue)*0.0332467532;
                planckmass=(edtValue)*45.940892448;
                electronmass=(edtValue)*1.097768382E+24;
                muonmass=(edtValue)*5.309172492E+21;
                protonmass=(edtValue)*597863320194490000000.0;
                neutronmass=(edtValue)*597040375333010000000.0;
                deuteronmass=(edtValue)*299080089460840000000.0;
                earthmass=(edtValue)*1.673360107E-31;
                sunmass=(edtValue)*5.E-37;
                break;


            case "Ton - t":
                kilogram=(edtValue)*1000;
                gram=(edtValue)*1000000;
                milligram=(edtValue)*1000000000;
                tonmetric=(edtValue)*1;
                pound=(edtValue)*2204.6226218;
                ounce=(edtValue)*35273.96195;
                carat=(edtValue)*5000000;
                tonshort=(edtValue)*1.1023113109;
                tonlong=(edtValue)*0.9842065276;
                atomicmassunit=(edtValue)*6.022136651E+29;
                exagram=(edtValue)*1.E-12;
                petagram=(edtValue)*1.E-9;
                teragram=(edtValue)*0.000001;
                gigagram=(edtValue)*0.001;
                megagram=(edtValue)*1;
                hectogram=(edtValue)*10000;
                dekagram=(edtValue)*100000;
                decigram=(edtValue)*10000000;
                centigram=(edtValue)*100000000.0;
                microgram=(edtValue)*1000000000000.0;
                nanogram=(edtValue)*1000000000000000.0;
                picogram=(edtValue)*1000000000000000000.0;
                femtogram=(edtValue)*1.E+21;
                attogram=(edtValue)*1.E+24;
                dalton=(edtValue)*6.022173643E+29;
                kilogramforcesquaresecondpermeter=(edtValue)*2.2046226218;
                kilopound=(edtValue)*101.9716213;
                kip=(edtValue)*2.2046226218;
                slug=(edtValue)*68.521765857;
                poundforcesquaresecondperfoot=(edtValue)*68.521765857;
                poundtroy=(edtValue)*2679.2288807;
                poundal=(edtValue)*70988.848424;
                tonus=(edtValue)*34285.710367;
                tonuk=(edtValue)*30612.244898;
                kiloton=(edtValue)*0.001;
                quintal=(edtValue)*10;
                hundredweightus=(edtValue)*22.046226218;
                hundredweightuk=(edtValue)*19.684130552;
                quarterus=(edtValue)*88.184904874;
                quarteruk=(edtValue)*78.736522209;
                stoneus=(edtValue)*176.36980975;
                stoneuk=(edtValue)*157.47304442;
                tonne=(edtValue)*1;
                pennyweight=(edtValue)*643014.93137;
                scruple=(edtValue)*771617.91764;
                grain=(edtValue)*15432358.353;
                gamma=(edtValue)*1000000000000.0;
                talent=(edtValue)*29.239766082;
                mina=(edtValue)*1754.3859649;
                shekel=(edtValue)*87719.298246;
                bekan=(edtValue)*175438.59649;
                gerah=(edtValue)*1754385.9649;
                talentbiblicalgreek=(edtValue)*49.019607843;
                minabiblicalgreek=(edtValue)*2941.1764706;
                tetradrachmabiblicalgreek=(edtValue)*73529.411765;
                didrachmabiblicalgreek=(edtValue)*147058.82353;
                drachmabiblicalgreek=(edtValue)*294117.64706;
                denariusbiblicalroman=(edtValue)*259740.25974;
                assarionbiblicalroman=(edtValue)*4155844.1558;
                quadransbiblicalroman=(edtValue)*16623376.623;
                leptonbiblicalroman=(edtValue)*33246753.247;
                planckmass=(edtValue)*45940892448.0;
                electronmass=(edtValue)*1.097768382E+33;
                muonmass=(edtValue)*5.309172492E+30;
                protonmass=(edtValue)*5.978633201E+29;
                neutronmass=(edtValue)*5.970403753E+29;
                deuteronmass=(edtValue)*2.990800894E+29;
                earthmass=(edtValue)*1.673360107E-22;
                sunmass=(edtValue)*5.E-28;
                break;

            case "Pound - lbs":
                kilogram=(edtValue)*0.45359237;
                gram=(edtValue)*453.59237;
                milligram=(edtValue)*453592.37;
                tonmetric=(edtValue)*0.0004535924;
                pound=(edtValue)*1;
                ounce=(edtValue)*16;
                carat=(edtValue)*2267.96185;
                tonshort=(edtValue)*0.0005;
                tonlong=(edtValue)*0.0004464286;
                atomicmassunit=(edtValue)*2.731595236E+26;
                exagram=(edtValue)*4.535923699E-16;
                petagram=(edtValue)*4.535923699E-13;
                teragram=(edtValue)*4.535923699E-10;
                gigagram=(edtValue)*4.535923699E-7;
                megagram=(edtValue)*0.0004535924;
                hectogram=(edtValue)*4.5359237;
                dekagram=(edtValue)*45.359237;
                decigram=(edtValue)*4535.9237;
                centigram=(edtValue)*45359.237;
                microgram=(edtValue)*453592370;
                nanogram=(edtValue)*453592370000.0;
                picogram=(edtValue)*453592369999995.0;
                femtogram=(edtValue)*453592369999995000.0;
                attogram=(edtValue)*453592369999995000000.0;
                dalton=(edtValue)*2.731612015E+26;
                kilogramforcesquaresecondpermeter=(edtValue)*0.0462535494;
                kilopound=(edtValue)*0.001;
                kip=(edtValue)*0.001;
                slug=(edtValue)*0.0310809502;
                poundforcesquaresecondperfoot=(edtValue)*0.0310809502;
                poundtroy=(edtValue)*1.2152777778;
                poundal=(edtValue)*32.2;
                tonus=(edtValue)*15.551736623;
                tonuk=(edtValue)*13.885480714;
                kiloton=(edtValue)*4.535923699E-7;
                quintal=(edtValue)*0.0045359237;
                hundredweightus=(edtValue)*0.01;
                hundredweightuk=(edtValue)*0.0089285714;
                quarterus=(edtValue)*0.04;
                quarteruk=(edtValue)*0.0357142857;
                stoneus=(edtValue)*0.08;
                stoneuk=(edtValue)*0.0714285714;
                tonne=(edtValue)*0.0004535924;
                pennyweight=(edtValue)*291.66666667;
                scruple=(edtValue)*350;
                grain=(edtValue)*7000;
                gamma=(edtValue)*453592370;
                talent=(edtValue)*0.0132629348;
                mina=(edtValue)*0.7957760877;
                shekel=(edtValue)*39.788804386;
                bekan=(edtValue)*79.577608772;
                gerah=(edtValue)*795.77608772;
                talentbiblicalgreek=(edtValue)*0.0222349201;
                minabiblicalgreek=(edtValue)*1.3340952059;
                tetradrachmabiblicalgreek=(edtValue)*33.352380147;
                didrachmabiblicalgreek=(edtValue)*66.704760294;
                drachmabiblicalgreek=(edtValue)*133.40952059;
                denariusbiblicalroman=(edtValue)*117.8162;
                assarionbiblicalroman=(edtValue)*1885.0592;
                quadransbiblicalroman=(edtValue)*7540.2368;
                leptonbiblicalroman=(edtValue)*15080.4736;
                planckmass=(edtValue)*20838438.285;
                electronmass=(edtValue)*4.979393625E+29;
                muonmass=(edtValue)*2.408200133E+27;
                protonmass=(edtValue)*2.711862403E+26;
                neutronmass=(edtValue)*2.708129588E+26;
                deuteronmass=(edtValue)*1.356604465E+26;
                earthmass=(edtValue)*7.590233768E-26;
                sunmass=(edtValue)*2.267961849E-31;
                break;


            case "Ounce - oz":
                kilogram=(edtValue)*0.0283495231;
                gram=(edtValue)*28.349523125;
                milligram=(edtValue)*28349.523125;
                tonmetric=(edtValue)*0.0000283495;
                pound=(edtValue)*0.0625;
                ounce=(edtValue)*1;
                carat=(edtValue)*141.74761563;
                tonshort=(edtValue)*0.00003125;
                tonlong=(edtValue)*0.0000279018;
                atomicmassunit=(edtValue)*1.707247022E+25;
                exagram=(edtValue)*2.834952312E-17;
                petagram=(edtValue)*2.834952312E-14;
                teragram=(edtValue)*2.834952312E-11;
                gigagram=(edtValue)*2.834952312E-8;
                megagram=(edtValue)*0.0000283495;
                hectogram=(edtValue)*0.2834952313;
                dekagram=(edtValue)*2.8349523125;
                decigram=(edtValue)*283.49523125;
                centigram=(edtValue)*2834.9523125;
                microgram=(edtValue)*28349523.125;
                nanogram=(edtValue)*28349523125.0;
                picogram=(edtValue)*28349523125000.0;
                femtogram=(edtValue)*28349523125000332.0;
                attogram=(edtValue)*28349523125000330000.0;
                dalton=(edtValue)*1.707257509E+25;
                kilogramforcesquaresecondpermeter=(edtValue)*0.0028908468;
                kilopound=(edtValue)*0.0000625;
                kip=(edtValue)*0.0000625;
                slug=(edtValue)*0.0019425594;
                poundforcesquaresecondperfoot=(edtValue)*0.0019425594;
                poundtroy=(edtValue)*0.0759548611;
                poundal=(edtValue)*2.0125;
                tonus=(edtValue)*0.9719835389;
                tonuk=(edtValue)*0.8678425446;
                kiloton=(edtValue)*2.834952312E-8;
                quintal=(edtValue)*0.0002834952;
                hundredweightus=(edtValue)*0.000625;
                hundredweightuk=(edtValue)*0.0005580357;
                quarterus=(edtValue)*0.0025;
                quarteruk=(edtValue)*0.0022321429;
                stoneus=(edtValue)*0.005;
                stoneuk=(edtValue)*0.0044642857;
                tonne=(edtValue)*0.0000283495;
                pennyweight=(edtValue)*18.229166667;
                scruple=(edtValue)*21.875;
                grain=(edtValue)*437.5;
                gamma=(edtValue)*28349523.125;
                talent=(edtValue)*0.0008289334;
                mina=(edtValue)*0.0497360055;
                shekel=(edtValue)*2.4868002741;
                bekan=(edtValue)*4.9736005482;
                gerah=(edtValue)*49.736005482;
                talentbiblicalgreek=(edtValue)*0.0013896825;
                minabiblicalgreek=(edtValue)*0.0833809504;
                tetradrachmabiblicalgreek=(edtValue)*2.0845237592;
                didrachmabiblicalgreek=(edtValue)*4.1690475184;
                drachmabiblicalgreek=(edtValue)*8.3380950368;
                denariusbiblicalroman=(edtValue)*7.3635125;
                assarionbiblicalroman=(edtValue)*117.8162;
                quadransbiblicalroman=(edtValue)*471.2648;
                leptonbiblicalroman=(edtValue)*942.5296;
                planckmass=(edtValue)*1302402.3928;
                electronmass=(edtValue)*3.112121015E+28;
                muonmass=(edtValue)*1.505125083E+26;
                protonmass=(edtValue)*1.694914002E+25;
                neutronmass=(edtValue)*1.692580992E+25;
                deuteronmass=(edtValue)*8.478777912E+24;
                earthmass=(edtValue)*4.743896105E-27;
                sunmass=(edtValue)*1.417476156E-32;
                break;


            case "Carat - ct":
                kilogram=(edtValue)*0.0002;
                gram=(edtValue)*0.2;
                milligram=(edtValue)*200;
                tonmetric=(edtValue)*2.E-7;
                pound=(edtValue)*0.0004409245;
                ounce=(edtValue)*0.0070547924;
                carat=(edtValue)*1;
                tonshort=(edtValue)*2.204622621E-7;
                tonlong=(edtValue)*1.968413055E-7;
                atomicmassunit=(edtValue)*1.20442733E+23;
                exagram=(edtValue)*2.E-19;
                petagram=(edtValue)*2.E-16;
                teragram=(edtValue)*2.E-13;
                gigagram=(edtValue)*2.E-10;
                megagram=(edtValue)*2.E-7;
                hectogram=(edtValue)*0.002;
                dekagram=(edtValue)*0.02;
                decigram=(edtValue)*2;
                centigram=(edtValue)*20;
                microgram=(edtValue)*200000;
                nanogram=(edtValue)*200000000.0;
                picogram=(edtValue)*200000000000.0;
                femtogram=(edtValue)*200000000000000.0;
                attogram=(edtValue)*200000000000000000.0;
                dalton=(edtValue)*1.204434728E+23;
                kilogramforcesquaresecondpermeter=(edtValue)*0.0000203943;
                kilopound=(edtValue)*4.409245243E-7;
                kip=(edtValue)*4.409245243E-7;
                slug=(edtValue)*0.0000137044;
                poundforcesquaresecondperfoot=(edtValue)*0.0000137044;
                poundtroy=(edtValue)*0.0005358458;
                poundal=(edtValue)*0.0141977697;
                tonus=(edtValue)*0.0068571421;
                tonuk=(edtValue)*0.006122449;
                kiloton=(edtValue)*2.E-10;
                quintal=(edtValue)*0.000002;
                hundredweightus=(edtValue)*0.0000044092;
                hundredweightuk=(edtValue)*0.0000039368;
                quarterus=(edtValue)*0.000017637;
                quarteruk=(edtValue)*0.0000157473;
                stoneus=(edtValue)*0.000035274;
                stoneuk=(edtValue)*0.0000314946;
                tonne=(edtValue)*2.E-7;
                pennyweight=(edtValue)*0.1286029863;
                scruple=(edtValue)*0.1543235835;
                grain=(edtValue)*3.0864716706;
                gamma=(edtValue)*200000;
                talent=(edtValue)*0.000005848;
                mina=(edtValue)*0.0003508772;
                shekel=(edtValue)*0.0175438596;
                bekan=(edtValue)*0.0350877193;
                gerah=(edtValue)*0.350877193;
                talentbiblicalgreek=(edtValue)*0.0000098039;
                minabiblicalgreek=(edtValue)*0.0005882353;
                tetradrachmabiblicalgreek=(edtValue)*0.0147058824;
                didrachmabiblicalgreek=(edtValue)*0.0294117647;
                drachmabiblicalgreek=(edtValue)*0.0588235294;
                denariusbiblicalroman=(edtValue)*0.0519480519;
                assarionbiblicalroman=(edtValue)*0.8311688312;
                quadransbiblicalroman=(edtValue)*3.3246753247;
                leptonbiblicalroman=(edtValue)*6.6493506494;
                planckmass=(edtValue)*9188.1784896;
                electronmass=(edtValue)*2.195536765E+26;
                muonmass=(edtValue)*1.061834498E+24;
                protonmass=(edtValue)*1.19572664E+23;
                neutronmass=(edtValue)*1.19408075E+23;
                deuteronmass=(edtValue)*5.981601789E+22;
                earthmass=(edtValue)*3.346720214E-29;
                sunmass=(edtValue)*1.E-34;
                break;

            case "Ton short US - ton":
                kilogram=(edtValue)*907.18474;
                gram=(edtValue)*907184.74;
                milligram=(edtValue)*907184740;
                tonmetric=(edtValue)*0.90718474;
                pound=(edtValue)*2000;
                ounce=(edtValue)*32000;
                carat=(edtValue)*4535923.7;
                tonshort=(edtValue)*1;
                tonlong=(edtValue)*0.8928571429;
                atomicmassunit=(edtValue)*5.463190472E+29;
                exagram=(edtValue)*9.071847399E-13;
                petagram=(edtValue)*9.071847399E-10;
                teragram=(edtValue)*9.071847399E-7;
                gigagram=(edtValue)*0.0009071847;
                megagram=(edtValue)*0.90718474;
                hectogram=(edtValue)*9071.8474;
                dekagram=(edtValue)*90718.474;
                decigram=(edtValue)*9071847.4;
                centigram=(edtValue)*90718474;
                microgram=(edtValue)*907184740000.0;
                nanogram=(edtValue)*907184739999990.0;
                picogram=(edtValue)*907184739999990100.0;
                femtogram=(edtValue)*907184739999990000000.0;
                attogram=(edtValue)*9.071847399E+23;
                dalton=(edtValue)*5.46322403E+29;
                kilogramforcesquaresecondpermeter=(edtValue)*92.507098754;
                kilopound=(edtValue)*2;
                kip=(edtValue)*2;
                slug=(edtValue)*62.161900343;
                poundforcesquaresecondperfoot=(edtValue)*62.161900343;
                poundtroy=(edtValue)*2430.5555556;
                poundal=(edtValue)*64400;
                tonus=(edtValue)*31103.473245;
                tonuk=(edtValue)*27770.961429;
                kiloton=(edtValue)*0.0009071847;
                quintal=(edtValue)*9.0718474;
                hundredweightus=(edtValue)*20;
                hundredweightuk=(edtValue)*17.857142857;
                quarterus=(edtValue)*80;
                quarteruk=(edtValue)*71.428571429;
                stoneus=(edtValue)*160;
                stoneuk=(edtValue)*142.85714286;
                tonne=(edtValue)*0.90718474;
                pennyweight=(edtValue)*583333.33333;
                scruple=(edtValue)*700000;
                grain=(edtValue)*14000000.0;
                gamma=(edtValue)*907184740000.0;
                talent=(edtValue)*26.525869591;
                mina=(edtValue)*1591.5521754;
                shekel=(edtValue)*79577.608772;
                bekan=(edtValue)*159155.21754;
                gerah=(edtValue)*1591552.1754;
                talentbiblicalgreek=(edtValue)*44.469840196;
                minabiblicalgreek=(edtValue)*2668.1904118;
                tetradrachmabiblicalgreek=(edtValue)*66704.760294;
                didrachmabiblicalgreek=(edtValue)*133409.52059;
                drachmabiblicalgreek=(edtValue)*266819.04118;
                denariusbiblicalroman=(edtValue)*235632.4;
                assarionbiblicalroman=(edtValue)*3770118.4;
                quadransbiblicalroman=(edtValue)*15080473.6;
                leptonbiblicalroman=(edtValue)*30160947.2;
                planckmass=(edtValue)*41676876571.0;
                electronmass=(edtValue)*9.95878725E+32;
                muonmass=(edtValue)*4.816400267E+30;
                protonmass=(edtValue)*5.423724806E+29;
                neutronmass=(edtValue)*5.416259176E+29;
                deuteronmass=(edtValue)*2.713208931E+29;
                earthmass=(edtValue)*1.518046753E-22;
                sunmass=(edtValue)*4.535923699E-28;
                break;

            case "Ton long UK - ton":
                kilogram=(edtValue)*1016.0469088;
                gram=(edtValue)*1016046.9088;
                milligram=(edtValue)*1016046908.8;
                tonmetric=(edtValue)*1.0160469088;
                pound=(edtValue)*2240;
                ounce=(edtValue)*35840;
                carat=(edtValue)*5080234.544;
                tonshort=(edtValue)*1.12;
                tonlong=(edtValue)*1;
                atomicmassunit=(edtValue)*6.118773329E+29;
                exagram=(edtValue)*1.016046908E-12;
                petagram=(edtValue)*1.016046908E-9;
                teragram=(edtValue)*0.000001016;
                gigagram=(edtValue)*0.0010160469;
                megagram=(edtValue)*1.0160469088;
                hectogram=(edtValue)*10160.469088;
                dekagram=(edtValue)*101604.69088;
                decigram=(edtValue)*10160469.088;
                centigram=(edtValue)*101604690.88;
                microgram=(edtValue)*1016046908800.0;
                nanogram=(edtValue)*1016046908800001.0;
                picogram=(edtValue)*1016046908800000600.0;
                femtogram=(edtValue)*1.016046908E+21;
                attogram=(edtValue)*1.016046908E+24;
                dalton=(edtValue)*6.118810914E+29;
                kilogramforcesquaresecondpermeter=(edtValue)*103.6079506;
                kilopound=(edtValue)*2.24;
                kip=(edtValue)*2.24;
                slug=(edtValue)*69.621328384;
                poundforcesquaresecondperfoot=(edtValue)*69.621328384;
                poundtroy=(edtValue)*2722.2222222;
                poundal=(edtValue)*72128;
                tonus=(edtValue)*34835.890035;
                tonuk=(edtValue)*31103.4768;
                kiloton=(edtValue)*0.0010160469;
                quintal=(edtValue)*10.160469088;
                hundredweightus=(edtValue)*22.4;
                hundredweightuk=(edtValue)*20;
                quarterus=(edtValue)*89.6;
                quarteruk=(edtValue)*80;
                stoneus=(edtValue)*179.2;
                stoneuk=(edtValue)*160;
                tonne=(edtValue)*1.0160469088;
                pennyweight=(edtValue)*653333.33333;
                scruple=(edtValue)*784000;
                grain=(edtValue)*15680000;
                gamma=(edtValue)*1016046908800.0;
                talent=(edtValue)*29.708973942;
                mina=(edtValue)*1782.5384365;
                shekel=(edtValue)*89126.921825;
                bekan=(edtValue)*178253.84365;
                gerah=(edtValue)*1782538.4365;
                talentbiblicalgreek=(edtValue)*49.80622102;
                minabiblicalgreek=(edtValue)*2988.3732612;
                tetradrachmabiblicalgreek=(edtValue)*74709.331529;
                didrachmabiblicalgreek=(edtValue)*149418.66306;
                drachmabiblicalgreek=(edtValue)*298837.32612;
                denariusbiblicalroman=(edtValue)*263908.288;
                assarionbiblicalroman=(edtValue)*4222532.608;
                quadransbiblicalroman=(edtValue)*16890130.432;
                leptonbiblicalroman=(edtValue)*33780260.864;
                planckmass=(edtValue)*46678101759.0;
                electronmass=(edtValue)*1.115384172E+33;
                muonmass=(edtValue)*5.394368299E+30;
                protonmass=(edtValue)*6.074571783E+29;
                neutronmass=(edtValue)*6.066210277E+29;
                deuteronmass=(edtValue)*3.038794003E+29;
                earthmass=(edtValue)*1.700212364E-22;
                sunmass=(edtValue)*5.080234544E-28;
                break;

            case "Atomic mass unit - u":
                kilogram=(edtValue)*1.660540199E-27;
                gram=(edtValue)*1.660540199E-24;
                milligram=(edtValue)*1.660540199E-21;
                tonmetric=(edtValue)*1.660540199E-30;
                pound=(edtValue)*3.660864489E-27;
                ounce=(edtValue)*5.857383183E-26;
                carat=(edtValue)*8.302700999E-24;
                tonshort=(edtValue)*1.830432244E-30;
                tonlong=(edtValue)*1.634314504E-30;
                atomicmassunit=(edtValue)*1;
                exagram=(edtValue)*1.660540199E-42;
                petagram=(edtValue)*1.660540199E-39;
                teragram=(edtValue)*1.660540199E-36;
                gigagram=(edtValue)*1.660540199E-33;
                megagram=(edtValue)*1.660540199E-30;
                hectogram=(edtValue)*1.660540199E-26;
                dekagram=(edtValue)*1.660540199E-25;
                decigram=(edtValue)*1.660540199E-23;
                centigram=(edtValue)*1.660540199E-22;
                microgram=(edtValue)*1.660540199E-18;
                nanogram=(edtValue)*1.660540199E-15;
                picogram=(edtValue)*1.660540199E-12;
                femtogram=(edtValue)*1.660540199E-9;
                attogram=(edtValue)*0.0000016605;
                dalton=(edtValue)*1.0000061426;
                kilogramforcesquaresecondpermeter=(edtValue)*1.693279764E-28;
                kilopound=(edtValue)*3.660864489E-30;
                kip=(edtValue)*3.660864489E-30;
                slug=(edtValue)*1.137831467E-28;
                poundforcesquaresecondperfoot=(edtValue)*1.137831467E-28;
                poundtroy=(edtValue)*4.448967261E-27;
                poundal=(edtValue)*1.178798365E-25;
                tonus=(edtValue)*5.693280035E-26;
                tonuk=(edtValue)*5.083286326E-26;
                kiloton=(edtValue)*1.660540199E-33;
                quintal=(edtValue)*1.660540199E-29;
                hundredweightus=(edtValue)*3.660864489E-29;
                hundredweightuk=(edtValue)*3.268629008E-29;
                quarterus=(edtValue)*1.464345795E-28;
                quarteruk=(edtValue)*1.307451603E-28;
                stoneus=(edtValue)*2.928691591E-28;
                stoneuk=(edtValue)*2.614903206E-28;
                tonne=(edtValue)*1.660540199E-30;
                pennyweight=(edtValue)*1.067752142E-24;
                scruple=(edtValue)*1.281302571E-24;
                grain=(edtValue)*2.562605142E-23;
                gamma=(edtValue)*1.660540199E-18;
                talent=(edtValue)*4.855380701E-29;
                mina=(edtValue)*2.913228421E-27;
                shekel=(edtValue)*1.45661421E-25;
                bekan=(edtValue)*2.913228421E-25;
                gerah=(edtValue)*2.913228421E-24;
                talentbiblicalgreek=(edtValue)*8.139902941E-29;
                minabiblicalgreek=(edtValue)*4.883941764E-27;
                tetradrachmabiblicalgreek=(edtValue)*1.220985441E-25;
                didrachmabiblicalgreek=(edtValue)*2.441970882E-25;
                drachmabiblicalgreek=(edtValue)*4.883941764E-25;
                denariusbiblicalroman=(edtValue)*4.313091428E-25;
                assarionbiblicalroman=(edtValue)*6.900946285E-24;
                quadransbiblicalroman=(edtValue)*2.760378514E-23;
                leptonbiblicalroman=(edtValue)*5.520757028E-23;
                planckmass=(edtValue)*7.628669873E-20;
                electronmass=(edtValue)*1822.8885301;
                muonmass=(edtValue)*8.8160943529;
                protonmass=(edtValue)*0.9927760773;
                neutronmass=(edtValue)*0.9914095443;
                deuteronmass=(edtValue)*0.4966345116;
                earthmass=(edtValue)*2.778681726E-52;
                sunmass=(edtValue)*8.302700999E-58;
                break;

            case "Exagram -  Eg":
                kilogram=(edtValue)*1000000000000000.0;
                gram=(edtValue)*1000000000000000000.0;
                milligram=(edtValue)*1.E+21;
                tonmetric=(edtValue)*1000000000000.0;
                pound=(edtValue)*2204622621848800.0;
                ounce=(edtValue)*35273961949580000.0;
                carat=(edtValue)*5000000000000000000.0;
                tonshort=(edtValue)*1102311310924.0;
                tonlong=(edtValue)*984206527611.0;
                atomicmassunit=(edtValue)*6.022136651E+41;
                exagram=(edtValue)*1;
                petagram=(edtValue)*1000;
                teragram=(edtValue)*1000000;
                gigagram=(edtValue)*1000000000;
                megagram=(edtValue)*1000000000000.0;
                hectogram=(edtValue)*10000000000000000.0;
                dekagram=(edtValue)*100000000000000000.0;
                decigram=(edtValue)*10000000000000000000.0;
                centigram=(edtValue)*100000000000000000000.0;
                microgram=(edtValue)*1.E+24;
                nanogram=(edtValue)*1.E+27;
                picogram=(edtValue)*1.E+30;
                femtogram=(edtValue)*1.E+33;
                attogram=(edtValue)*1.E+36;
                dalton=(edtValue)*6.022173643E+41;
                kilogramforcesquaresecondpermeter=(edtValue)*101971621297790.0;
                kilopound=(edtValue)*2204622621849.0;
                kip=(edtValue)*2204622621849.0;
                slug=(edtValue)*68521765856800.0;
                poundforcesquaresecondperfoot=(edtValue)*68521765856792.0;
                poundtroy=(edtValue)*2679228880719000.0;
                poundal=(edtValue)*70988848423600000.0;
                tonus=(edtValue)*34285710367347000.0;
                tonuk=(edtValue)*30612244897960000.0;
                kiloton=(edtValue)*1000000000.0;
                quintal=(edtValue)*10000000000000.0;
                hundredweightus=(edtValue)*22046226218488.0;
                hundredweightuk=(edtValue)*19684130552221.0;
                quarterus=(edtValue)*88184904873951.0;
                quarteruk=(edtValue)*78736522208885.0;
                stoneus=(edtValue)*176369809747900.0;
                stoneuk=(edtValue)*157473044417770.0;
                tonne=(edtValue)*1000000000000.0;
                pennyweight=(edtValue)*643014931370830000.0;
                scruple=(edtValue)*771617917645000000.0;
                grain=(edtValue)*15432358352900000000.0;
                gamma=(edtValue)*1.E+24;
                talent=(edtValue)*29239766081871.0;
                mina=(edtValue)*1754385964912300.0;
                shekel=(edtValue)*87719298245614000.0;
                bekan=(edtValue)*175438596491230000.0;
                gerah=(edtValue)*1754385964912300000.0;
                talentbiblicalgreek=(edtValue)*49019607843137.0;
                minabiblicalgreek=(edtValue)*2941176470588200.0;
                tetradrachmabiblicalgreek=(edtValue)*73529411764706000.0;
                didrachmabiblicalgreek=(edtValue)*147058823529410000.0;
                drachmabiblicalgreek=(edtValue)*294117647058820000.0;
                denariusbiblicalroman=(edtValue)*259740259740260000.0;
                assarionbiblicalroman=(edtValue)*4155844155844200000.0;
                quadransbiblicalroman=(edtValue)*16623376623377000000.0;
                leptonbiblicalroman=(edtValue)*33246753246753000000.0;
                planckmass=(edtValue)*4.594089244E+22;
                electronmass=(edtValue)*1.097768382E+45;
                muonmass=(edtValue)*5.309172492E+42;
                protonmass=(edtValue)*5.978633201E+41;
                neutronmass=(edtValue)*5.970403753E+41;
                deuteronmass=(edtValue)*2.990800894E+41;
                earthmass=(edtValue)*1.673360107E-10;
                sunmass=(edtValue)*5.E-16;
                break;

            case "Petagram - Pg":
                kilogram=(edtValue)*1000000000000.0;
                gram=(edtValue)*1000000000000000.0;
                milligram=(edtValue)*1000000000000000000.0;
                tonmetric=(edtValue)*1000000000.0;
                pound=(edtValue)*2204622621849.0;
                ounce=(edtValue)*35273961949580.0;
                carat=(edtValue)*5000000000000000.0;
                tonshort=(edtValue)*1102311310.9;
                tonlong=(edtValue)*984206527.61;
                atomicmassunit=(edtValue)*6.022136651E+38;
                exagram=(edtValue)*0.001;
                petagram=(edtValue)*1;
                teragram=(edtValue)*1000;
                gigagram=(edtValue)*1000000;
                megagram=(edtValue)*1000000000.0;
                hectogram=(edtValue)*10000000000000.0;
                dekagram=(edtValue)*100000000000000.0;
                decigram=(edtValue)*10000000000000000.0;
                centigram=(edtValue)*100000000000000000.0;
                microgram=(edtValue)*1.E+21;
                nanogram=(edtValue)*1.E+24;
                picogram=(edtValue)*1.E+27;
                femtogram=(edtValue)*9.999999999E+29;
                attogram=(edtValue)*1.E+33;
                dalton=(edtValue)*6.022173643E+38;
                kilogramforcesquaresecondpermeter=(edtValue)*101971621298.0;
                kilopound=(edtValue)*2204622621.8;
                kip=(edtValue)*2204622621.8;
                slug=(edtValue)*68521765857.0;
                poundforcesquaresecondperfoot=(edtValue)*68521765857.0;
                poundtroy=(edtValue)*2679228880719.0;
                poundal=(edtValue)*70988848423600.0;
                tonus=(edtValue)*34285710367347.0;
                tonuk=(edtValue)*30612244897960.0;
                kiloton=(edtValue)*1000000;
                quintal=(edtValue)*10000000000.0;
                hundredweightus=(edtValue)*22046226218.0;
                hundredweightuk=(edtValue)*19684130552.0;
                quarterus=(edtValue)*88184904874.0;
                quarteruk=(edtValue)*78736522209.0;
                stoneus=(edtValue)*176369809748.0;
                stoneuk=(edtValue)*157473044418.0;
                tonne=(edtValue)*1000000000;
                pennyweight=(edtValue)*643014931370830.0;
                scruple=(edtValue)*771617917645000.0;
                grain=(edtValue)*15432358352900000.0;
                gamma=(edtValue)*1.E+21;
                talent=(edtValue)*29239766082.0;
                mina=(edtValue)*1754385964912.0;
                shekel=(edtValue)*87719298245614.0;
                bekan=(edtValue)*175438596491230.0;
                gerah=(edtValue)*1754385964912300.0;
                talentbiblicalgreek=(edtValue)*49019607843.0;
                minabiblicalgreek=(edtValue)*2941176470588.0;
                tetradrachmabiblicalgreek=(edtValue)*73529411764706.0;
                didrachmabiblicalgreek=(edtValue)*147058823529410.0;
                drachmabiblicalgreek=(edtValue)*294117647058820.0;
                denariusbiblicalroman=(edtValue)*259740259740260.0;
                assarionbiblicalroman=(edtValue)*4155844155844200.0;
                quadransbiblicalroman=(edtValue)*16623376623377000.0;
                leptonbiblicalroman=(edtValue)*33246753246753000.0;
                planckmass=(edtValue)*45940892447777000000.0;
                electronmass=(edtValue)*1.097768382E+42;
                muonmass=(edtValue)*5.309172492E+39;
                protonmass=(edtValue)*5.978633201E+38;
                neutronmass=(edtValue)*5.970403753E+38;
                deuteronmass=(edtValue)*2.990800894E+38;
                earthmass=(edtValue)*1.673360107E-13;
                sunmass=(edtValue)*5.E-19;
                break;


            case "Teragram - Tg":
                kilogram=(edtValue)*1000000000.0;
                gram=(edtValue)*1000000000000.0;
                milligram=(edtValue)*1000000000000000.0;
                tonmetric=(edtValue)*1000000;
                pound=(edtValue)*2204622621.8;
                ounce=(edtValue)*35273961950.0;
                carat=(edtValue)*5000000000000.0;
                tonshort=(edtValue)*1102311.3109;
                tonlong=(edtValue)*984206.52761;
                atomicmassunit=(edtValue)*6.022136651E+35;
                exagram=(edtValue)*0.000001;
                petagram=(edtValue)*0.001;
                teragram=(edtValue)*1;
                gigagram=(edtValue)*1000;
                megagram=(edtValue)*1000000;
                hectogram=(edtValue)*10000000000.0;
                dekagram=(edtValue)*100000000000.0;
                decigram=(edtValue)*10000000000000.0;
                centigram=(edtValue)*100000000000000.0;
                microgram=(edtValue)*1000000000000000000.0;
                nanogram=(edtValue)*1.E+21;
                picogram=(edtValue)*1.E+24;
                femtogram=(edtValue)*1.E+27;
                attogram=(edtValue)*1.E+30;
                dalton=(edtValue)*6.022173643E+35;
                kilogramforcesquaresecondpermeter=(edtValue)*101971621.3;
                kilopound=(edtValue)*2204622.6218;
                kip=(edtValue)*2204622.6218;
                slug=(edtValue)*68521765.857;
                poundforcesquaresecondperfoot=(edtValue)*68521765.857;
                poundtroy=(edtValue)*2679228880.7;
                poundal=(edtValue)*70988848424.0;
                tonus=(edtValue)*34285710367.0;
                tonuk=(edtValue)*30612244898.0;
                kiloton=(edtValue)*1000;
                quintal=(edtValue)*10000000.0;
                hundredweightus=(edtValue)*22046226.218;
                hundredweightuk=(edtValue)*19684130.552;
                quarterus=(edtValue)*88184904.874;
                quarteruk=(edtValue)*78736522.209;
                stoneus=(edtValue)*176369809.75;
                stoneuk=(edtValue)*157473044.42;
                tonne=(edtValue)*1000000;
                pennyweight=(edtValue)*643014931371.0;
                scruple=(edtValue)*771617917645.0;
                grain=(edtValue)*15432358352900.0;
                gamma=(edtValue)*1000000000000000000.0;
                talent=(edtValue)*29239766.082;
                mina=(edtValue)*1754385964.9;
                shekel=(edtValue)*87719298246.0;
                bekan=(edtValue)*175438596491.0;
                gerah=(edtValue)*1754385964912.0;
                talentbiblicalgreek=(edtValue)*49019607.843;
                minabiblicalgreek=(edtValue)*2941176470.6;
                tetradrachmabiblicalgreek=(edtValue)*73529411765.0;
                didrachmabiblicalgreek=(edtValue)*147058823529.0;
                drachmabiblicalgreek=(edtValue)*294117647059.0;
                denariusbiblicalroman=(edtValue)*259740259740.0;
                assarionbiblicalroman=(edtValue)*4155844155844.0;
                quadransbiblicalroman=(edtValue)*16623376623377.0;
                leptonbiblicalroman=(edtValue)*33246753246753.0;
                planckmass=(edtValue)*45940892447777000.0;
                electronmass=(edtValue)*1.097768382E+39;
                muonmass=(edtValue)*5.309172492E+36;
                protonmass=(edtValue)*5.978633201E+35;
                neutronmass=(edtValue)*5.970403753E+35;
                deuteronmass=(edtValue)*2.990800894E+35;
                earthmass=(edtValue)*1.673360107E-16;
                sunmass=(edtValue)*5.E-22;
                break;

            case "Gigagram -  Gg":
                kilogram=(edtValue)*1000000;
                gram=(edtValue)*1000000000.0;
                milligram=(edtValue)*1000000000000.0;
                tonmetric=(edtValue)*1000;
                pound=(edtValue)*2204622.6218;
                ounce=(edtValue)*35273961.95;
                carat=(edtValue)*5000000000.0;
                tonshort=(edtValue)*1102.3113109;
                tonlong=(edtValue)*984.20652761;
                atomicmassunit=(edtValue)*6.022136651E+32;
                exagram=(edtValue)*1.E-9;
                petagram=(edtValue)*0.000001;
                teragram=(edtValue)*0.001;
                gigagram=(edtValue)*1;
                megagram=(edtValue)*1000;
                hectogram=(edtValue)*10000000;
                dekagram=(edtValue)*100000000.0;
                decigram=(edtValue)*10000000000.0;
                centigram=(edtValue)*100000000000.0;
                microgram=(edtValue)*1000000000000000.0;
                nanogram=(edtValue)*1000000000000000000.0;
                picogram=(edtValue)*1.E+21;
                femtogram=(edtValue)*1.E+24;
                attogram=(edtValue)*1.E+27;
                dalton=(edtValue)*6.022173643E+32;
                kilogramforcesquaresecondpermeter=(edtValue)*101971.6213;
                kilopound=(edtValue)*2204.6226218;
                kip=(edtValue)*2204.6226218;
                slug=(edtValue)*68521.765857;
                poundforcesquaresecondperfoot=(edtValue)*68521.765857;
                poundtroy=(edtValue)*2679228.8807;
                poundal=(edtValue)*70988848.424;
                tonus=(edtValue)*34285710.367;
                tonuk=(edtValue)*30612244.898;
                kiloton=(edtValue)*1;
                quintal=(edtValue)*10000;
                hundredweightus=(edtValue)*22046.226218;
                hundredweightuk=(edtValue)*19684.130552;
                quarterus=(edtValue)*88184.904874;
                quarteruk=(edtValue)*78736.522209;
                stoneus=(edtValue)*176369.80975;
                stoneuk=(edtValue)*157473.04442;
                tonne=(edtValue)*1000;
                pennyweight=(edtValue)*643014931.37;
                scruple=(edtValue)*771617917.64;
                grain=(edtValue)*15432358353.0;
                gamma=(edtValue)*1000000000000000.0;
                talent=(edtValue)*29239.766082;
                mina=(edtValue)*1754385.9649;
                shekel=(edtValue)*87719298.246;
                bekan=(edtValue)*175438596.49;
                gerah=(edtValue)*1754385964.9;
                talentbiblicalgreek=(edtValue)*49019.607843;
                minabiblicalgreek=(edtValue)*2941176.4706;
                tetradrachmabiblicalgreek=(edtValue)*73529411.765;
                didrachmabiblicalgreek=(edtValue)*147058823.53;
                drachmabiblicalgreek=(edtValue)*294117647.06;
                denariusbiblicalroman=(edtValue)*259740259.74;
                assarionbiblicalroman=(edtValue)*4155844155.8;
                quadransbiblicalroman=(edtValue)*16623376623.0;
                leptonbiblicalroman=(edtValue)*33246753247.0;
                planckmass=(edtValue)*45940892447777.0;
                electronmass=(edtValue)*1.097768382E+36;
                muonmass=(edtValue)*5.309172492E+33;
                protonmass=(edtValue)*5.978633201E+32;
                neutronmass=(edtValue)*5.970403753E+32;
                deuteronmass=(edtValue)*2.990800894E+32;
                earthmass=(edtValue)*1.673360107E-19;
                sunmass=(edtValue)*5.E-25;
                break;

            case "Megagram - Mg":
                kilogram=(edtValue)*1000;
                gram=(edtValue)*1000000;
                milligram=(edtValue)*1000000000.0;
                tonmetric=(edtValue)*1;
                pound=(edtValue)*2204.6226218;
                ounce=(edtValue)*35273.96195;
                carat=(edtValue)*5000000;
                tonshort=(edtValue)*1.1023113109;
                tonlong=(edtValue)*0.9842065276;
                atomicmassunit=(edtValue)*6.022136651E+29;
                exagram=(edtValue)*1.E-12;
                petagram=(edtValue)*1.E-9;
                teragram=(edtValue)*0.000001;
                gigagram=(edtValue)*0.001;
                megagram=(edtValue)*1;
                hectogram=(edtValue)*10000;
                dekagram=(edtValue)*100000;
                decigram=(edtValue)*10000000.0;
                centigram=(edtValue)*100000000.0;
                microgram=(edtValue)*1000000000000.0;
                nanogram=(edtValue)*1000000000000000.0;
                picogram=(edtValue)*1000000000000000000.0;
                femtogram=(edtValue)*1.E+21;
                attogram=(edtValue)*1.E+24;
                dalton=(edtValue)*6.022173643E+29;
                kilogramforcesquaresecondpermeter=(edtValue)*101.9716213;
                kilopound=(edtValue)*2.2046226218;
                kip=(edtValue)*2.2046226218;
                slug=(edtValue)*68.521765857;
                poundforcesquaresecondperfoot=(edtValue)*68.521765857;
                poundtroy=(edtValue)*2679.2288807;
                poundal=(edtValue)*70988.848424;
                tonus=(edtValue)*34285.710367;
                tonuk=(edtValue)*30612.244898;
                kiloton=(edtValue)*0.001;
                quintal=(edtValue)*10;
                hundredweightus=(edtValue)*22.046226218;
                hundredweightuk=(edtValue)*19.684130552;
                quarterus=(edtValue)*88.184904874;
                quarteruk=(edtValue)*78.736522209;
                stoneus=(edtValue)*176.36980975;
                stoneuk=(edtValue)*157.47304442;
                tonne=(edtValue)*1;
                pennyweight=(edtValue)*643014.93137;
                scruple=(edtValue)*771617.91764;
                grain=(edtValue)*15432358.353;
                gamma=(edtValue)*1000000000000.0;
                talent=(edtValue)*29.239766082;
                mina=(edtValue)*1754.3859649;
                shekel=(edtValue)*87719.298246;
                bekan=(edtValue)*175438.59649;
                gerah=(edtValue)*1754385.9649;
                talentbiblicalgreek=(edtValue)*49.019607843;
                minabiblicalgreek=(edtValue)*2941.1764706;
                tetradrachmabiblicalgreek=(edtValue)*73529.411765;
                didrachmabiblicalgreek=(edtValue)*147058.82353;
                drachmabiblicalgreek=(edtValue)*294117.64706;
                denariusbiblicalroman=(edtValue)*259740.25974;
                assarionbiblicalroman=(edtValue)*4155844.1558;
                quadransbiblicalroman=(edtValue)*16623376.623;
                leptonbiblicalroman=(edtValue)*33246753.247;
                planckmass=(edtValue)*45940892448.0;
                electronmass=(edtValue)*1.097768382E+33;
                muonmass=(edtValue)*5.309172492E+30;
                protonmass=(edtValue)*5.978633201E+29;
                neutronmass=(edtValue)*5.970403753E+29;
                deuteronmass=(edtValue)*2.990800894E+29;
                earthmass=(edtValue)*1.673360107E-22;
                sunmass=(edtValue)*5.E-28;
                break;

            case "Hectogram - hg":
                kilogram=(edtValue)*0.1;
                gram=(edtValue)*100;
                milligram=(edtValue)*100000;
                tonmetric=(edtValue)*0.0001;
                pound=(edtValue)*0.2204622622;
                ounce=(edtValue)*3.527396195;
                carat=(edtValue)*500;
                tonshort=(edtValue)*0.0001102311;
                tonlong=(edtValue)*0.0000984207;
                atomicmassunit=(edtValue)*6.022136651E+25;
                exagram=(edtValue)*1.E-16;
                petagram=(edtValue)*1.E-13;
                teragram=(edtValue)*1.E-10;
                gigagram=(edtValue)*1.E-7;
                megagram=(edtValue)*0.0001;
                hectogram=(edtValue)*1;
                dekagram=(edtValue)*10;
                decigram=(edtValue)*1000;
                centigram=(edtValue)*10000;
                microgram=(edtValue)*100000000.0;
                nanogram=(edtValue)*100000000000.0;
                picogram=(edtValue)*100000000000000.0;
                femtogram=(edtValue)*100000000000000000.0;
                attogram=(edtValue)*100000000000000000000.0;
                dalton=(edtValue)*6.022173643E+25;
                kilogramforcesquaresecondpermeter=(edtValue)*0.0101971621;
                kilopound=(edtValue)*0.0002204623;
                kip=(edtValue)*0.0002204623;
                slug=(edtValue)*0.0068521766;
                poundforcesquaresecondperfoot=(edtValue)*0.0068521766;
                poundtroy=(edtValue)*0.2679228881;
                poundal=(edtValue)*7.0988848424;
                tonus=(edtValue)*3.4285710367;
                tonuk=(edtValue)*3.0612244898;
                kiloton=(edtValue)*1.E-7;
                quintal=(edtValue)*0.001;
                hundredweightus=(edtValue)*0.0022046226;
                hundredweightuk=(edtValue)*0.0019684131;
                quarterus=(edtValue)*0.0088184905;
                quarteruk=(edtValue)*0.0078736522;
                stoneus=(edtValue)*0.017636981;
                stoneuk=(edtValue)*0.0157473044;
                tonne=(edtValue)*0.0001;
                pennyweight=(edtValue)*64.301493137;
                scruple=(edtValue)*77.161791764;
                grain=(edtValue)*1543.2358353;
                gamma=(edtValue)*100000000;
                talent=(edtValue)*0.0029239766;
                mina=(edtValue)*0.1754385965;
                shekel=(edtValue)*8.7719298246;
                bekan=(edtValue)*17.543859649;
                gerah=(edtValue)*175.43859649;
                talentbiblicalgreek=(edtValue)*0.0049019608;
                minabiblicalgreek=(edtValue)*0.2941176471;
                tetradrachmabiblicalgreek=(edtValue)*7.3529411765;
                didrachmabiblicalgreek=(edtValue)*14.705882353;
                drachmabiblicalgreek=(edtValue)*29.411764706;
                denariusbiblicalroman=(edtValue)*25.974025974;
                assarionbiblicalroman=(edtValue)*415.58441558;
                quadransbiblicalroman=(edtValue)*1662.3376623;
                leptonbiblicalroman=(edtValue)*3324.6753247;
                planckmass=(edtValue)*4594089.2448;
                electronmass=(edtValue)*1.097768382E+29;
                muonmass=(edtValue)*5.309172492E+26;
                protonmass=(edtValue)*5.978633201E+25;
                neutronmass=(edtValue)*5.970403753E+25;
                deuteronmass=(edtValue)*2.990800894E+25;
                earthmass=(edtValue)*1.673360107E-26;
                sunmass=(edtValue)*5.E-32;
                break;

            case "Dekagram -  dag":
                kilogram=(edtValue)*0.01;
                gram=(edtValue)*10;
                milligram=(edtValue)*10000;
                tonmetric=(edtValue)*0.00001;
                pound=(edtValue)*0.0220462262;
                ounce=(edtValue)*0.3527396195;
                carat=(edtValue)*50;
                tonshort=(edtValue)*0.0000110231;
                tonlong=(edtValue)*0.0000098421;
                atomicmassunit=(edtValue)*6.022136651E+24;
                exagram=(edtValue)*1.E-17;
                petagram=(edtValue)*1.E-14;
                teragram=(edtValue)*1.E-11;
                gigagram=(edtValue)*1.E-8;
                megagram=(edtValue)*0.00001;
                hectogram=(edtValue)*0.1;
                dekagram=(edtValue)*1;
                decigram=(edtValue)*100;
                centigram=(edtValue)*1000;
                microgram=(edtValue)*10000000.0;
                nanogram=(edtValue)*10000000000.0;
                picogram=(edtValue)*10000000000000.0;
                femtogram=(edtValue)*10000000000000000.0;
                attogram=(edtValue)*10000000000000000000.0;
                dalton=(edtValue)*6.022173643E+24;
                kilogramforcesquaresecondpermeter=(edtValue)*0.0010197162;
                kilopound=(edtValue)*0.0000220462;
                kip=(edtValue)*0.0000220462;
                slug=(edtValue)*0.0006852177;
                poundforcesquaresecondperfoot=(edtValue)*0.0006852177;
                poundtroy=(edtValue)*0.0267922888;
                poundal=(edtValue)*0.7098884842;
                tonus=(edtValue)*0.3428571037;
                tonuk=(edtValue)*0.306122449;
                kiloton=(edtValue)*1.E-8;
                quintal=(edtValue)*0.0001;
                hundredweightus=(edtValue)*0.0002204623;
                hundredweightuk=(edtValue)*0.0001968413;
                quarterus=(edtValue)*0.000881849;
                quarteruk=(edtValue)*0.0007873652;
                stoneus=(edtValue)*0.0017636981;
                stoneuk=(edtValue)*0.0015747304;
                tonne=(edtValue)*0.00001;
                pennyweight=(edtValue)*6.4301493137;
                scruple=(edtValue)*7.7161791764;
                grain=(edtValue)*154.32358353;
                gamma=(edtValue)*10000000.0;
                talent=(edtValue)*0.0002923977;
                mina=(edtValue)*0.0175438596;
                shekel=(edtValue)*0.8771929825;
                bekan=(edtValue)*1.7543859649;
                gerah=(edtValue)*17.543859649;
                talentbiblicalgreek=(edtValue)*0.0004901961;
                minabiblicalgreek=(edtValue)*0.0294117647;
                tetradrachmabiblicalgreek=(edtValue)*0.7352941176;
                didrachmabiblicalgreek=(edtValue)*1.4705882353;
                drachmabiblicalgreek=(edtValue)*2.9411764706;
                denariusbiblicalroman=(edtValue)*2.5974025974;
                assarionbiblicalroman=(edtValue)*41.558441558;
                quadransbiblicalroman=(edtValue)*166.23376623;
                leptonbiblicalroman=(edtValue)*332.46753247;
                planckmass=(edtValue)*459408.92448;
                electronmass=(edtValue)*1.097768382E+28;
                muonmass=(edtValue)*5.309172492E+25;
                protonmass=(edtValue)*5.978633201E+24;
                neutronmass=(edtValue)*5.970403753E+24;
                deuteronmass=(edtValue)*2.990800894E+24;
                earthmass=(edtValue)*1.673360107E-27;
                sunmass=(edtValue)*5.E-33;
                break;


            case "Decigram - dg":
                kilogram=(edtValue)*0.0001;
                gram=(edtValue)*0.1;
                milligram=(edtValue)*100;
                tonmetric=(edtValue)*1.E-7;
                pound=(edtValue)*0.0002204623;
                ounce=(edtValue)*0.0035273962;
                carat=(edtValue)*0.5;
                tonshort=(edtValue)*1.10231131E-7;
                tonlong=(edtValue)*9.842065276E-8;
                atomicmassunit=(edtValue)*6.022136651E+22;
                exagram=(edtValue)*1.E-19;
                petagram=(edtValue)*1.E-16;
                teragram=(edtValue)*1.E-13;
                gigagram=(edtValue)*1.E-10;
                megagram=(edtValue)*1.E-7;
                hectogram=(edtValue)*0.001;
                dekagram=(edtValue)*0.01;
                decigram=(edtValue)*1;
                centigram=(edtValue)*10;
                microgram=(edtValue)*100000;
                nanogram=(edtValue)*100000000.0;
                picogram=(edtValue)*100000000000.0;
                femtogram=(edtValue)*100000000000000.0;
                attogram=(edtValue)*100000000000000000.0;
                dalton=(edtValue)*6.022173643E+22;
                kilogramforcesquaresecondpermeter=(edtValue)*0.0000101972;
                kilopound=(edtValue)*2.204622621E-7;
                kip=(edtValue)*2.204622621E-7;
                slug=(edtValue)*0.0000068522;
                poundforcesquaresecondperfoot=(edtValue)*0.0000068522;
                poundtroy=(edtValue)*0.0002679229;
                poundal=(edtValue)*0.0070988848;
                tonus=(edtValue)*0.003428571;
                tonuk=(edtValue)*0.0030612245;
                kiloton=(edtValue)*1.E-10;
                quintal=(edtValue)*0.000001;
                hundredweightus=(edtValue)*0.0000022046;
                hundredweightuk=(edtValue)*0.0000019684;
                quarterus=(edtValue)*0.0000088185;
                quarteruk=(edtValue)*0.0000078737;
                stoneus=(edtValue)*0.000017637;
                stoneuk=(edtValue)*0.0000157473;
                tonne=(edtValue)*1.E-7;
                pennyweight=(edtValue)*0.0643014931;
                scruple=(edtValue)*0.0771617918;
                grain=(edtValue)*1.5432358353;
                gamma=(edtValue)*100000;
                talent=(edtValue)*0.000002924;
                mina=(edtValue)*0.0001754386;
                shekel=(edtValue)*0.0087719298;
                bekan=(edtValue)*0.0175438596;
                gerah=(edtValue)*0.1754385965;
                talentbiblicalgreek=(edtValue)*0.000004902;
                minabiblicalgreek=(edtValue)*0.0002941176;
                tetradrachmabiblicalgreek=(edtValue)*0.0073529412;
                didrachmabiblicalgreek=(edtValue)*0.0147058824;
                drachmabiblicalgreek=(edtValue)*0.0294117647;
                denariusbiblicalroman=(edtValue)*0.025974026;
                assarionbiblicalroman=(edtValue)*0.4155844156;
                quadransbiblicalroman=(edtValue)*1.6623376623;
                leptonbiblicalroman=(edtValue)*3.3246753247;
                planckmass=(edtValue)*4594.0892448;
                electronmass=(edtValue)*1.097768382E+26;
                muonmass=(edtValue)*5.309172492E+23;
                protonmass=(edtValue)*5.978633201E+22;
                neutronmass=(edtValue)*5.970403753E+22;
                deuteronmass=(edtValue)*2.990800894E+22;
                earthmass=(edtValue)*1.673360107E-29;
                sunmass=(edtValue)*5.E-35;
                break;

            case "Centigram - cg":
                kilogram=(edtValue)*0.00001;
                gram=(edtValue)*0.01;
                milligram=(edtValue)*10;
                tonmetric=(edtValue)*1.E-8;
                pound=(edtValue)*0.0000220462;
                ounce=(edtValue)*0.0003527396;
                carat=(edtValue)*0.05;
                tonshort=(edtValue)*1.10231131E-8;
                tonlong=(edtValue)*9.842065276E-9;
                atomicmassunit=(edtValue)*6.022136651E+21;
                exagram=(edtValue)*1.E-20;
                petagram=(edtValue)*1.E-17;
                teragram=(edtValue)*1.E-14;
                gigagram=(edtValue)*1.E-11;
                megagram=(edtValue)*1.E-8;
                hectogram=(edtValue)*0.0001;
                dekagram=(edtValue)*0.001;
                decigram=(edtValue)*0.1;
                centigram=(edtValue)*1;
                microgram=(edtValue)*10000;
                nanogram=(edtValue)*10000000.0;
                picogram=(edtValue)*10000000000.0;
                femtogram=(edtValue)*10000000000000.0;
                attogram=(edtValue)*10000000000000000.0;
                dalton=(edtValue)*6.022173643E+21;
                kilogramforcesquaresecondpermeter=(edtValue)*0.0000010197;
                kilopound=(edtValue)*2.204622621E-8;
                kip=(edtValue)*2.204622621E-8;
                slug=(edtValue)*6.852176585E-7;
                poundforcesquaresecondperfoot=(edtValue)*6.852176585E-7;
                poundtroy=(edtValue)*0.0000267923;
                poundal=(edtValue)*0.0007098885;
                tonus=(edtValue)*0.0003428571;
                tonuk=(edtValue)*0.0003061224;
                kiloton=(edtValue)*1.E-11;
                quintal=(edtValue)*1.E-7;
                hundredweightus=(edtValue)*2.204622621E-7;
                hundredweightuk=(edtValue)*1.968413055E-7;
                quarterus=(edtValue)*8.818490487E-7;
                quarteruk=(edtValue)*7.87365222E-7;
                stoneus=(edtValue)*0.0000017637;
                stoneuk=(edtValue)*0.0000015747;
                tonne=(edtValue)*1.E-8;
                pennyweight=(edtValue)*0.0064301493;
                scruple=(edtValue)*0.0077161792;
                grain=(edtValue)*0.1543235835;
                gamma=(edtValue)*10000;
                talent=(edtValue)*2.923976608E-7;
                mina=(edtValue)*0.0000175439;
                shekel=(edtValue)*0.000877193;
                bekan=(edtValue)*0.001754386;
                gerah=(edtValue)*0.0175438596;
                talentbiblicalgreek=(edtValue)*4.901960784E-7;
                minabiblicalgreek=(edtValue)*0.0000294118;
                tetradrachmabiblicalgreek=(edtValue)*0.0007352941;
                didrachmabiblicalgreek=(edtValue)*0.0014705882;
                drachmabiblicalgreek=(edtValue)*0.0029411765;
                denariusbiblicalroman=(edtValue)*0.0025974026;
                assarionbiblicalroman=(edtValue)*0.0415584416;
                quadransbiblicalroman=(edtValue)*0.1662337662;
                leptonbiblicalroman=(edtValue)*0.3324675325;
                planckmass=(edtValue)*459.40892448;
                electronmass=(edtValue)*1.097768382E+25;
                muonmass=(edtValue)*5.309172492E+22;
                protonmass=(edtValue)*5.978633201E+21;
                neutronmass=(edtValue)*5.970403753E+21;
                deuteronmass=(edtValue)*2.990800894E+21;
                earthmass=(edtValue)*1.673360107E-30;
                sunmass=(edtValue)*5.E-36;
                break;

            case "Microgram - μg":
                kilogram=(edtValue)*1.E-9;
                gram=(edtValue)*0.000001;
                milligram=(edtValue)*0.001;
                tonmetric=(edtValue)*1.E-12;
                pound=(edtValue)*2.204622621E-9;
                ounce=(edtValue)*3.527396194E-8;
                carat=(edtValue)*0.000005;
                tonshort=(edtValue)*1.10231131E-12;
                tonlong=(edtValue)*9.842065276E-13;
                atomicmassunit=(edtValue)*602213665167520000.0;
                exagram=(edtValue)*1.E-24;
                petagram=(edtValue)*1.E-21;
                teragram=(edtValue)*1.E-18;
                gigagram=(edtValue)*1.E-15;
                megagram=(edtValue)*1.E-12;
                hectogram=(edtValue)*1.E-8;
                dekagram=(edtValue)*1.E-7;
                decigram=(edtValue)*0.00001;
                centigram=(edtValue)*0.0001;
                microgram=(edtValue)*1;
                nanogram=(edtValue)*1000;
                picogram=(edtValue)*1000000;
                femtogram=(edtValue)*1000000000.0;
                attogram=(edtValue)*1000000000000.0;
                dalton=(edtValue)*602217364335000000.0;
                kilogramforcesquaresecondpermeter=(edtValue)*1.019716212E-10;
                kilopound=(edtValue)*2.204622621E-12;
                kip=(edtValue)*2.204622621E-12;
                slug=(edtValue)*6.852176585E-11;
                poundforcesquaresecondperfoot=(edtValue)*6.852176585E-11;
                poundtroy=(edtValue)*2.67922888E-9;
                poundal=(edtValue)*7.098884842E-8;
                tonus=(edtValue)*3.428571036E-8;
                tonuk=(edtValue)*3.061224489E-8;
                kiloton=(edtValue)*1.E-15;
                quintal=(edtValue)*1.E-11;
                hundredweightus=(edtValue)*2.204622621E-11;
                hundredweightuk=(edtValue)*1.968413055E-11;
                quarterus=(edtValue)*8.818490487E-11;
                quarteruk=(edtValue)*7.87365222E-11;
                stoneus=(edtValue)*1.763698097E-10;
                stoneuk=(edtValue)*1.574730444E-10;
                tonne=(edtValue)*1.E-12;
                pennyweight=(edtValue)*6.430149313E-7;
                scruple=(edtValue)*7.716179176E-7;
                grain=(edtValue)*0.0000154324;
                gamma=(edtValue)*1;
                talent=(edtValue)*2.923976608E-11;
                mina=(edtValue)*1.754385964E-9;
                shekel=(edtValue)*8.771929824E-8;
                bekan=(edtValue)*1.754385964E-7;
                gerah=(edtValue)*0.0000017544;
                talentbiblicalgreek=(edtValue)*4.901960784E-11;
                minabiblicalgreek=(edtValue)*2.94117647E-9;
                tetradrachmabiblicalgreek=(edtValue)*7.352941176E-8;
                didrachmabiblicalgreek=(edtValue)*1.470588235E-7;
                drachmabiblicalgreek=(edtValue)*2.94117647E-7;
                denariusbiblicalroman=(edtValue)*2.597402597E-7;
                assarionbiblicalroman=(edtValue)*0.0000041558;
                quadransbiblicalroman=(edtValue)*0.0000166234;
                leptonbiblicalroman=(edtValue)*0.0000332468;
                planckmass=(edtValue)*0.0459408924;
                electronmass=(edtValue)*1.097768382E+21;
                muonmass=(edtValue)*5309172492731301000.0;
                protonmass=(edtValue)*597863320194490000.0;
                neutronmass=(edtValue)*597040375333010000.0;
                deuteronmass=(edtValue)*299080089460840000.0;
                earthmass=(edtValue)*1.673360107E-34;
                sunmass=(edtValue)*5.E-40;
                break;

            case "Nanogram  - ng":
                kilogram=(edtValue)*1.E-12;
                gram=(edtValue)*1.E-9;
                milligram=(edtValue)*0.000001;
                tonmetric=(edtValue)*1.E-15;
                pound=(edtValue)*2.204622621E-12;
                ounce=(edtValue)*3.527396194E-11;
                carat=(edtValue)*5.E-9;
                tonshort=(edtValue)*1.10231131E-15;
                tonlong=(edtValue)*9.842065276E-16;
                atomicmassunit=(edtValue)*602213665167520.0;
                exagram=(edtValue)*1.E-27;
                petagram=(edtValue)*1.E-24;
                teragram=(edtValue)*1.E-21;
                gigagram=(edtValue)*1.E-18;
                megagram=(edtValue)*1.E-15;
                hectogram=(edtValue)*1.E-11;
                dekagram=(edtValue)*1.E-10;
                decigram=(edtValue)*1.E-8;
                centigram=(edtValue)*1.E-7;
                microgram=(edtValue)*0.001;
                nanogram=(edtValue)*1;
                picogram=(edtValue)*1000;
                femtogram=(edtValue)*1000000.0;
                attogram=(edtValue)*1000000000;
                dalton=(edtValue)*602217364335000.0;
                kilogramforcesquaresecondpermeter=(edtValue)*1.019716212E-13;
                kilopound=(edtValue)*2.204622621E-15;
                kip=(edtValue)*2.204622621E-15;
                slug=(edtValue)*6.852176585E-14;
                poundforcesquaresecondperfoot=(edtValue)*6.852176585E-14;
                poundtroy=(edtValue)*2.67922888E-12;
                poundal=(edtValue)*7.098884842E-11;
                tonus=(edtValue)*3.428571036E-11;
                tonuk=(edtValue)*3.061224489E-11;
                kiloton=(edtValue)*1.E-18;
                quintal=(edtValue)*1.E-14;
                hundredweightus=(edtValue)*2.204622621E-14;
                hundredweightuk=(edtValue)*1.968413055E-14;
                quarterus=(edtValue)*8.818490487E-14;
                quarteruk=(edtValue)*7.87365222E-14;
                stoneus=(edtValue)*1.763698097E-13;
                stoneuk=(edtValue)*1.574730444E-13;
                tonne=(edtValue)*1.E-15;
                pennyweight=(edtValue)*6.430149313E-10;
                scruple=(edtValue)*7.716179176E-10;
                grain=(edtValue)*1.543235835E-8;
                gamma=(edtValue)*0.001;
                talent=(edtValue)*2.923976608E-14;
                mina=(edtValue)*1.754385964E-12;
                shekel=(edtValue)*8.771929824E-11;
                bekan=(edtValue)*1.754385964E-10;
                gerah=(edtValue)*1.754385964E-9;
                talentbiblicalgreek=(edtValue)*4.901960784E-14;
                minabiblicalgreek=(edtValue)*2.94117647E-12;
                tetradrachmabiblicalgreek=(edtValue)*7.352941176E-11;
                didrachmabiblicalgreek=(edtValue)*1.470588235E-10;
                drachmabiblicalgreek=(edtValue)*2.94117647E-10;
                denariusbiblicalroman=(edtValue)*2.597402597E-10;
                assarionbiblicalroman=(edtValue)*4.155844155E-9;
                quadransbiblicalroman=(edtValue)*1.662337662E-8;
                leptonbiblicalroman=(edtValue)*3.324675324E-8;
                planckmass=(edtValue)*0.0000459409;
                electronmass=(edtValue)*1097768382880799900.0;
                muonmass=(edtValue)*5309172492731300.0;
                protonmass=(edtValue)*597863320194490.0;
                neutronmass=(edtValue)*597040375333010.0;
                deuteronmass=(edtValue)*299080089460840.0;
                earthmass=(edtValue)*1.673360107E-37;
                sunmass=(edtValue)*5.E-43;
                break;


            case "Picogram -  pg":
                kilogram=(edtValue)*1.E-15;
                gram=(edtValue)*1.E-12;
                milligram=(edtValue)*1.E-9;
                tonmetric=(edtValue)*1.E-18;
                pound=(edtValue)*2.204622621E-15;
                ounce=(edtValue)*3.527396194E-14;
                carat=(edtValue)*5.E-12;
                tonshort=(edtValue)*1.10231131E-18;
                tonlong=(edtValue)*9.842065276E-19;
                atomicmassunit=(edtValue)*602213665168.0;
                exagram=(edtValue)*9.999999999E-31;
                petagram=(edtValue)*1.E-27;
                teragram=(edtValue)*1.E-24;
                gigagram=(edtValue)*1.E-21;
                megagram=(edtValue)*1.E-18;
                hectogram=(edtValue)*1.E-14;
                dekagram=(edtValue)*1.E-13;
                decigram=(edtValue)*1.E-11;
                centigram=(edtValue)*1.E-10;
                microgram=(edtValue)*0.000001;
                nanogram=(edtValue)*0.001;
                picogram=(edtValue)*1;
                femtogram=(edtValue)*1000;
                attogram=(edtValue)*1000000.0;
                dalton=(edtValue)*602217364335.0;
                kilogramforcesquaresecondpermeter=(edtValue)*1.019716212E-16;
                kilopound=(edtValue)*2.204622621E-18;
                kip=(edtValue)*2.204622621E-18;
                slug=(edtValue)*6.852176585E-17;
                poundforcesquaresecondperfoot=(edtValue)*6.852176585E-17;
                poundtroy=(edtValue)*2.67922888E-15;
                poundal=(edtValue)*7.098884842E-14;
                tonus=(edtValue)*3.428571036E-14;
                tonuk=(edtValue)*3.061224489E-14;
                kiloton=(edtValue)*1.E-21;
                quintal=(edtValue)*9.999999999E-18;
                hundredweightus=(edtValue)*2.204622621E-17;
                hundredweightuk=(edtValue)*1.968413055E-17;
                quarterus=(edtValue)*8.818490487E-17;
                quarteruk=(edtValue)*7.87365222E-17;
                stoneus=(edtValue)*1.763698097E-16;
                stoneuk=(edtValue)*1.574730444E-16;
                tonne=(edtValue)*1.E-18;
                pennyweight=(edtValue)*6.430149313E-13;
                scruple=(edtValue)*7.716179176E-13;
                grain=(edtValue)*1.543235835E-11;
                gamma=(edtValue)*0.000001;
                talent=(edtValue)*2.923976608E-17;
                mina=(edtValue)*1.754385964E-15;
                shekel=(edtValue)*8.771929824E-14;
                bekan=(edtValue)*1.754385964E-13;
                gerah=(edtValue)*1.754385964E-12;
                talentbiblicalgreek=(edtValue)*4.901960784E-17;
                minabiblicalgreek=(edtValue)*2.94117647E-15;
                tetradrachmabiblicalgreek=(edtValue)*7.352941176E-14;
                didrachmabiblicalgreek=(edtValue)*1.470588235E-13;
                drachmabiblicalgreek=(edtValue)*2.94117647E-13;
                denariusbiblicalroman=(edtValue)*2.597402597E-13;
                assarionbiblicalroman=(edtValue)*4.155844155E-12;
                quadransbiblicalroman=(edtValue)*1.662337662E-11;
                leptonbiblicalroman=(edtValue)*3.324675324E-11;
                planckmass=(edtValue)*4.594089244E-8;
                electronmass=(edtValue)*1097768382880800.0;
                muonmass=(edtValue)*5309172492731.0;
                protonmass=(edtValue)*597863320194.0;
                neutronmass=(edtValue)*597040375333.0;
                deuteronmass=(edtValue)*299080089461.0;
                earthmass=(edtValue)*1.673360107E-40;
                sunmass=(edtValue)*5.E-46;
                break;

            case "Femtogram - fg":
                kilogram=(edtValue)*1.E-18;
                gram=(edtValue)*1.E-15;
                milligram=(edtValue)*1.E-12;
                tonmetric=(edtValue)*1.E-21;
                pound=(edtValue)*2.204622621E-18;
                ounce=(edtValue)*3.527396194E-17;
                carat=(edtValue)*5.E-15;
                tonshort=(edtValue)*1.10231131E-21;
                tonlong=(edtValue)*9.842065276E-22;
                atomicmassunit=(edtValue)*602213665.17;
                exagram=(edtValue)*1.E-33;
                petagram=(edtValue)*1.E-30;
                teragram=(edtValue)*1.E-27;
                gigagram=(edtValue)*1.E-24;
                megagram=(edtValue)*1.E-21;
                hectogram=(edtValue)*1.E-17;
                dekagram=(edtValue)*1.E-16;
                decigram=(edtValue)*1.E-14;
                centigram=(edtValue)*1.E-13;
                microgram=(edtValue)*1.E-9;
                nanogram=(edtValue)*0.000001;
                picogram=(edtValue)*0.001;
                femtogram=(edtValue)*1;
                attogram=(edtValue)*1000;
                dalton=(edtValue)*602217364.34;
                kilogramforcesquaresecondpermeter=(edtValue)*1.019716212E-19;
                kilopound=(edtValue)*2.204622621E-21;
                kip=(edtValue)*2.204622621E-21;
                slug=(edtValue)*6.852176585E-20;
                poundforcesquaresecondperfoot=(edtValue)*6.852176585E-20;
                poundtroy=(edtValue)*2.67922888E-18;
                poundal=(edtValue)*7.098884842E-17;
                tonus=(edtValue)*3.428571036E-17;
                tonuk=(edtValue)*3.061224489E-17;
                kiloton=(edtValue)*1.E-24;
                quintal=(edtValue)*1.E-20;
                hundredweightus=(edtValue)*2.204622621E-20;
                hundredweightuk=(edtValue)*1.968413055E-20;
                quarterus=(edtValue)*8.818490487E-20;
                quarteruk=(edtValue)*7.87365222E-20;
                stoneus=(edtValue)*1.763698097E-19;
                stoneuk=(edtValue)*1.574730444E-19;
                tonne=(edtValue)*1.E-21;
                pennyweight=(edtValue)*6.430149313E-16;
                scruple=(edtValue)*7.716179176E-16;
                grain=(edtValue)*1.543235835E-14;
                gamma=(edtValue)*1.E-9;
                talent=(edtValue)*2.923976608E-20;
                mina=(edtValue)*1.754385964E-18;
                shekel=(edtValue)*8.771929824E-17;
                bekan=(edtValue)*1.754385964E-16;
                gerah=(edtValue)*1.754385964E-15;
                talentbiblicalgreek=(edtValue)*4.901960784E-20;
                minabiblicalgreek=(edtValue)*2.94117647E-18;
                tetradrachmabiblicalgreek=(edtValue)*7.352941176E-17;
                didrachmabiblicalgreek=(edtValue)*1.470588235E-16;
                drachmabiblicalgreek=(edtValue)*2.94117647E-16;
                denariusbiblicalroman=(edtValue)*2.597402597E-16;
                assarionbiblicalroman=(edtValue)*4.155844155E-15;
                quadransbiblicalroman=(edtValue)*1.662337662E-14;
                leptonbiblicalroman=(edtValue)*3.324675324E-14;
                planckmass=(edtValue)*4.594089244E-11;
                electronmass=(edtValue)*1097768382881.0;
                muonmass=(edtValue)*5309172492.7;
                protonmass=(edtValue)*597863320.19;
                neutronmass=(edtValue)*597040375.33;
                deuteronmass=(edtValue)*299080089.46;
                earthmass=(edtValue)*1.673360107E-43;
                sunmass=(edtValue)*5.E-49;
                break;

            case "Attogram - ag":
                kilogram=(edtValue)*1.E-21;
                gram=(edtValue)*9.999999999E-19;
                milligram=(edtValue)*9.999999999E-16;
                tonmetric=(edtValue)*1.E-24;
                pound=(edtValue)*2.204622621E-21;
                ounce=(edtValue)*3.527396194E-20;
                carat=(edtValue)*4.999999999E-18;
                tonshort=(edtValue)*1.10231131E-24;
                tonlong=(edtValue)*9.842065276E-25;
                atomicmassunit=(edtValue)*602213.66517;
                exagram=(edtValue)*1.E-36;
                petagram=(edtValue)*9.999999999E-34;
                teragram=(edtValue)*9.999999999E-31;
                gigagram=(edtValue)*1.E-27;
                megagram=(edtValue)*1.E-24;
                hectogram=(edtValue)*1.E-20;
                dekagram=(edtValue)*1.E-19;
                decigram=(edtValue)*9.999999999E-18;
                centigram=(edtValue)*1.E-16;
                microgram=(edtValue)*1.E-12;
                nanogram=(edtValue)*1.E-9;
                picogram=(edtValue)*0.000001;
                femtogram=(edtValue)*0.001;
                attogram=(edtValue)*1;
                dalton=(edtValue)*602217.36434;
                kilogramforcesquaresecondpermeter=(edtValue)*1.019716212E-22;
                kilopound=(edtValue)*2.204622621E-24;
                kip=(edtValue)*2.204622621E-24;
                slug=(edtValue)*6.852176585E-23;
                poundforcesquaresecondperfoot=(edtValue)*6.852176585E-23;
                poundtroy=(edtValue)*2.67922888E-21;
                poundal=(edtValue)*7.098884842E-20;
                tonus=(edtValue)*3.428571036E-20;
                tonuk=(edtValue)*3.061224489E-20;
                kiloton=(edtValue)*1.E-27;
                quintal=(edtValue)*1.E-23;
                hundredweightus=(edtValue)*2.204622621E-23;
                hundredweightuk=(edtValue)*1.968413055E-23;
                quarterus=(edtValue)*8.818490487E-23;
                quarteruk=(edtValue)*7.87365222E-23;
                stoneus=(edtValue)*1.763698097E-22;
                stoneuk=(edtValue)*1.574730444E-22;
                tonne=(edtValue)*1.E-24;
                pennyweight=(edtValue)*6.430149313E-19;
                scruple=(edtValue)*7.716179176E-19;
                grain=(edtValue)*1.543235835E-17;
                gamma=(edtValue)*1.E-12;
                talent=(edtValue)*2.923976608E-23;
                mina=(edtValue)*1.754385964E-21;
                shekel=(edtValue)*8.771929824E-20;
                bekan=(edtValue)*1.754385964E-19;
                gerah=(edtValue)*1.754385964E-18;
                talentbiblicalgreek=(edtValue)*4.901960784E-23;
                minabiblicalgreek=(edtValue)*2.94117647E-21;
                tetradrachmabiblicalgreek=(edtValue)*7.352941176E-20;
                didrachmabiblicalgreek=(edtValue)*1.470588235E-19;
                drachmabiblicalgreek=(edtValue)*2.94117647E-19;
                denariusbiblicalroman=(edtValue)*2.597402597E-19;
                assarionbiblicalroman=(edtValue)*4.155844155E-18;
                quadransbiblicalroman=(edtValue)*1.662337662E-17;
                leptonbiblicalroman=(edtValue)*3.324675324E-17;
                planckmass=(edtValue)*4.594089244E-14;
                electronmass=(edtValue)*1097768382.9;
                muonmass=(edtValue)*5309172.4927;
                protonmass=(edtValue)*597863.32019;
                neutronmass=(edtValue)*597040.37533;
                deuteronmass=(edtValue)*299080.08946;
                earthmass=(edtValue)*1.673360107E-46;
                sunmass=(edtValue)*5.E-52;
                break;

            case "Dalton - dt":
                kilogram=(edtValue)*1.66053E-27;
                gram=(edtValue)*1.66053E-24;
                milligram=(edtValue)*1.66053E-21;
                tonmetric=(edtValue)*1.66053E-30;
                pound=(edtValue)*3.660842002E-27;
                ounce=(edtValue)*5.857347203E-26;
                carat=(edtValue)*8.30265E-24;
                tonshort=(edtValue)*1.830421001E-30;
                tonlong=(edtValue)*1.634304465E-30;
                atomicmassunit=(edtValue)*0.9999938574;
                exagram=(edtValue)*1.66053E-42;
                petagram=(edtValue)*1.66053E-39;
                teragram=(edtValue)*1.66053E-36;
                gigagram=(edtValue)*1.66053E-33;
                megagram=(edtValue)*1.66053E-30;
                hectogram=(edtValue)*1.66053E-26;
                dekagram=(edtValue)*1.66053E-25;
                decigram=(edtValue)*1.66053E-23;
                centigram=(edtValue)*1.66053E-22;
                microgram=(edtValue)*1.66053E-18;
                nanogram=(edtValue)*1.66053E-15;
                picogram=(edtValue)*1.66053E-12;
                femtogram=(edtValue)*1.66053E-9;
                attogram=(edtValue)*0.0000016605;
                dalton=(edtValue)*1;
                kilogramforcesquaresecondpermeter=(edtValue)*1.693269363E-28;
                kilopound=(edtValue)*3.660842002E-30;
                kip=(edtValue)*3.660842002E-30;
                slug=(edtValue)*1.137824478E-28;
                poundforcesquaresecondperfoot=(edtValue)*1.137824478E-28;
                poundtroy=(edtValue)*4.448939933E-27;
                poundal=(edtValue)*1.178791124E-25;
                tonus=(edtValue)*5.693245063E-26;
                tonuk=(edtValue)*5.083255102E-26;
                kiloton=(edtValue)*1.66053E-33;
                quintal=(edtValue)*1.66053E-29;
                hundredweightus=(edtValue)*3.660842002E-29;
                hundredweightuk=(edtValue)*3.26860893E-29;
                quarterus=(edtValue)*1.4643368E-28;
                quarteruk=(edtValue)*1.307443572E-28;
                stoneus=(edtValue)*2.928673601E-28;
                stoneuk=(edtValue)*2.614887144E-28;
                tonne=(edtValue)*1.66053E-30;
                pennyweight=(edtValue)*1.067745583E-24;
                scruple=(edtValue)*1.2812947E-24;
                grain=(edtValue)*2.562589401E-23;
                gamma=(edtValue)*1.66053E-18;
                talent=(edtValue)*4.855350877E-29;
                mina=(edtValue)*2.913210526E-27;
                shekel=(edtValue)*1.456605263E-25;
                bekan=(edtValue)*2.913210526E-25;
                gerah=(edtValue)*2.913210526E-24;
                talentbiblicalgreek=(edtValue)*8.139852941E-29;
                minabiblicalgreek=(edtValue)*4.883911764E-27;
                tetradrachmabiblicalgreek=(edtValue)*1.220977941E-25;
                didrachmabiblicalgreek=(edtValue)*2.441955882E-25;
                drachmabiblicalgreek=(edtValue)*4.883911764E-25;
                denariusbiblicalroman=(edtValue)*4.313064935E-25;
                assarionbiblicalroman=(edtValue)*6.900903896E-24;
                quadransbiblicalroman=(edtValue)*2.760361558E-23;
                leptonbiblicalroman=(edtValue)*5.520723116E-23;
                planckmass=(edtValue)*7.628623013E-20;
                electronmass=(edtValue)*1822.8773328;
                muonmass=(edtValue)*8.8160401994;
                protonmass=(edtValue)*0.9927699791;
                neutronmass=(edtValue)*0.9914034545;
                deuteronmass=(edtValue)*0.496631461;
                earthmass=(edtValue)*2.778664658E-52;
                sunmass=(edtValue)*8.30265E-58;
                break;

            case "Kilogram-force square second/meter - kg F sq s m- 1":
                kilogram=(edtValue)*9.80665;
                gram=(edtValue)*9806.65;
                milligram=(edtValue)*9806650;
                tonmetric=(edtValue)*0.00980665;
                pound=(edtValue)*21.619962435;
                ounce=(edtValue)*345.91939895;
                carat=(edtValue)*49033.25;
                tonshort=(edtValue)*0.0108099812;
                tonlong=(edtValue)*0.0096517689;
                atomicmassunit=(edtValue)*5.905698639E+27;
                exagram=(edtValue)*9.80665E-15;
                petagram=(edtValue)*9.80665E-12;
                teragram=(edtValue)*9.80665E-9;
                gigagram=(edtValue)*0.0000098067;
                megagram=(edtValue)*0.00980665;
                hectogram=(edtValue)*98.0665;
                dekagram=(edtValue)*980.665;
                decigram=(edtValue)*98066.5;
                centigram=(edtValue)*980665;
                microgram=(edtValue)*9806650000.0;
                nanogram=(edtValue)*9806650000000.0;
                picogram=(edtValue)*9806650000000272.0;
                femtogram=(edtValue)*9806650000000270000.0;
                attogram=(edtValue)*9.80665E+21;
                dalton=(edtValue)*5.905734915E+27;
                kilogramforcesquaresecondpermeter=(edtValue)*1;
                kilopound=(edtValue)*0.0216199624;
                kip=(edtValue)*0.0216199624;
                slug=(edtValue)*0.6719689751;
                poundforcesquaresecondperfoot=(edtValue)*0.6719689751;
                poundtroy=(edtValue)*26.274259903;
                poundal=(edtValue)*696.16279039;
                tonus=(edtValue)*336.22796157;
                tonuk=(edtValue)*300.20357143;
                kiloton=(edtValue)*0.0000098067;
                quintal=(edtValue)*0.0980665;
                hundredweightus=(edtValue)*0.2161996243;
                hundredweightuk=(edtValue)*0.1930353789;
                quarterus=(edtValue)*0.8647984974;
                quarteruk=(edtValue)*0.7721415155;
                stoneus=(edtValue)*1.7295969948;
                stoneuk=(edtValue)*1.544283031;
                tonne=(edtValue)*0.00980665;
                pennyweight=(edtValue)*6305.8223767;
                scruple=(edtValue)*7566.9868521;
                grain=(edtValue)*151339.73704;
                gamma=(edtValue)*9806650000.0;
                talent=(edtValue)*0.286744152;
                mina=(edtValue)*17.204649123;
                shekel=(edtValue)*860.23245614;
                bekan=(edtValue)*1720.4649123;
                gerah=(edtValue)*17204.649123;
                talentbiblicalgreek=(edtValue)*0.4807181373;
                minabiblicalgreek=(edtValue)*28.843088235;
                tetradrachmabiblicalgreek=(edtValue)*721.07720588;
                didrachmabiblicalgreek=(edtValue)*1442.1544118;
                drachmabiblicalgreek=(edtValue)*2884.3088235;
                denariusbiblicalroman=(edtValue)*2547.1818182;
                assarionbiblicalroman=(edtValue)*40754.909091;
                quadransbiblicalroman=(edtValue)*163019.63636;
                leptonbiblicalroman=(edtValue)*326039.27273;
                planckmass=(edtValue)*450526252.92;
                electronmass=(edtValue)*1.076543031E+31;
                muonmass=(edtValue)*5.206519642E+28;
                protonmass=(edtValue)*5.863036328E+27;
                neutronmass=(edtValue)*5.854965996E+27;
                deuteronmass=(edtValue)*2.932973759E+27;
                earthmass=(edtValue)*1.641005689E-24;
                sunmass=(edtValue)*4.903325E-30;
                break;

            case "Kilopound - kip":
                kilogram=(edtValue)*453.59237;
                gram=(edtValue)*453592.37;
                milligram=(edtValue)*453592370.0;
                tonmetric=(edtValue)*0.45359237;
                pound=(edtValue)*1000;
                ounce=(edtValue)*16000;
                carat=(edtValue)*2267961.85;
                tonshort=(edtValue)*0.5;
                tonlong=(edtValue)*0.4464285714;
                atomicmassunit=(edtValue)*2.731595236E+29;
                exagram=(edtValue)*4.535923699E-13;
                petagram=(edtValue)*4.535923699E-10;
                teragram=(edtValue)*4.535923699E-7;
                gigagram=(edtValue)*0.0004535924;
                megagram=(edtValue)*0.45359237;
                hectogram=(edtValue)*4535.9237;
                dekagram=(edtValue)*45359.237;
                decigram=(edtValue)*4535923.7;
                centigram=(edtValue)*45359237;
                microgram=(edtValue)*453592370000.0;
                nanogram=(edtValue)*453592369999995.0;
                picogram=(edtValue)*453592369999995100.0;
                femtogram=(edtValue)*453592369999995000000.0;
                attogram=(edtValue)*4.535923699E+23;
                dalton=(edtValue)*2.731612015E+29;
                kilogramforcesquaresecondpermeter=(edtValue)*46.253549377;
                kilopound=(edtValue)*1;
                kip=(edtValue)*1;
                slug=(edtValue)*31.080950172;
                poundforcesquaresecondperfoot=(edtValue)*31.080950172;
                poundtroy=(edtValue)*1215.2777778;
                poundal=(edtValue)*32200;
                tonus=(edtValue)*15551.736623;
                tonuk=(edtValue)*13885.480714;
                kiloton=(edtValue)*0.0004535924;
                quintal=(edtValue)*4.5359237;
                hundredweightus=(edtValue)*10;
                hundredweightuk=(edtValue)*8.9285714286;
                quarterus=(edtValue)*40;
                quarteruk=(edtValue)*35.714285714;
                stoneus=(edtValue)*80;
                stoneuk=(edtValue)*71.428571429;
                tonne=(edtValue)*0.45359237;
                pennyweight=(edtValue)*291666.66667;
                scruple=(edtValue)*350000;
                grain=(edtValue)*7000000.0;
                gamma=(edtValue)*453592370000.0;
                talent=(edtValue)*13.262934795;
                mina=(edtValue)*795.77608772;
                shekel=(edtValue)*39788.804386;
                bekan=(edtValue)*79577.608772;
                gerah=(edtValue)*795776.08772;
                talentbiblicalgreek=(edtValue)*22.234920098;
                minabiblicalgreek=(edtValue)*1334.0952059;
                tetradrachmabiblicalgreek=(edtValue)*33352.380147;
                didrachmabiblicalgreek=(edtValue)*66704.760294;
                drachmabiblicalgreek=(edtValue)*133409.52059;
                denariusbiblicalroman=(edtValue)*117816.2;
                assarionbiblicalroman=(edtValue)*1885059.2;
                quadransbiblicalroman=(edtValue)*7540236.8;
                leptonbiblicalroman=(edtValue)*15080473.6;
                planckmass=(edtValue)*20838438285.0;
                electronmass=(edtValue)*4.979393625E+32;
                muonmass=(edtValue)*2.408200133E+30;
                protonmass=(edtValue)*2.711862403E+29;
                neutronmass=(edtValue)*2.708129588E+29;
                deuteronmass=(edtValue)*1.356604465E+29;
                earthmass=(edtValue)*7.590233768E-23;
                sunmass=(edtValue)*2.267961849E-28;
                break;

            case "Kip - kip ":
                kilogram=(edtValue)*453.59237;
                gram=(edtValue)*453592.37;
                milligram=(edtValue)*453592370.0;
                tonmetric=(edtValue)*0.45359237;
                pound=(edtValue)*1000;
                ounce=(edtValue)*16000;
                carat=(edtValue)*2267961.85;
                tonshort=(edtValue)*0.5;
                tonlong=(edtValue)*0.4464285714;
                atomicmassunit=(edtValue)*2.731595236E+29;
                exagram=(edtValue)*4.535923699E-13;
                petagram=(edtValue)*4.535923699E-10;
                teragram=(edtValue)*4.535923699E-7;
                gigagram=(edtValue)*0.0004535924;
                megagram=(edtValue)*0.45359237;
                hectogram=(edtValue)*4535.9237;
                dekagram=(edtValue)*45359.237;
                decigram=(edtValue)*4535923.7;
                centigram=(edtValue)*45359237;
                microgram=(edtValue)*453592370000.0;
                nanogram=(edtValue)*453592369999995.0;
                picogram=(edtValue)*453592369999995100.0;
                femtogram=(edtValue)*453592369999995000000.0;
                attogram=(edtValue)*4.535923699E+23;
                dalton=(edtValue)*2.731612015E+29;
                kilogramforcesquaresecondpermeter=(edtValue)*46.253549377;
                kilopound=(edtValue)*1;
                kip=(edtValue)*1;
                slug=(edtValue)*31.080950172;
                poundforcesquaresecondperfoot=(edtValue)*31.080950172;
                poundtroy=(edtValue)*1215.2777778;
                poundal=(edtValue)*32200;
                tonus=(edtValue)*15551.736623;
                tonuk=(edtValue)*13885.480714;
                kiloton=(edtValue)*0.0004535924;
                quintal=(edtValue)*4.5359237;
                hundredweightus=(edtValue)*10;
                hundredweightuk=(edtValue)*8.9285714286;
                quarterus=(edtValue)*40;
                quarteruk=(edtValue)*35.714285714;
                stoneus=(edtValue)*80;
                stoneuk=(edtValue)*71.428571429;
                tonne=(edtValue)*0.45359237;
                pennyweight=(edtValue)*291666.66667;
                scruple=(edtValue)*350000;
                grain=(edtValue)*7000000.0;
                gamma=(edtValue)*453592370000.0;
                talent=(edtValue)*13.262934795;
                mina=(edtValue)*795.77608772;
                shekel=(edtValue)*39788.804386;
                bekan=(edtValue)*79577.608772;
                gerah=(edtValue)*795776.08772;
                talentbiblicalgreek=(edtValue)*22.234920098;
                minabiblicalgreek=(edtValue)*1334.0952059;
                tetradrachmabiblicalgreek=(edtValue)*33352.380147;
                didrachmabiblicalgreek=(edtValue)*66704.760294;
                drachmabiblicalgreek=(edtValue)*133409.52059;
                denariusbiblicalroman=(edtValue)*117816.2;
                assarionbiblicalroman=(edtValue)*1885059.2;
                quadransbiblicalroman=(edtValue)*7540236.8;
                leptonbiblicalroman=(edtValue)*15080473.6;
                planckmass=(edtValue)*20838438285.0;
                electronmass=(edtValue)*4.979393625E+32;
                muonmass=(edtValue)*2.408200133E+30;
                protonmass=(edtValue)*2.711862403E+29;
                neutronmass=(edtValue)*2.708129588E+29;
                deuteronmass=(edtValue)*1.356604465E+29;
                earthmass=(edtValue)*7.590233768E-23;
                sunmass=(edtValue)*2.267961849E-28;
                break;

            case "Slug - slug":
                kilogram=(edtValue)*14.593902937;
                gram=(edtValue)*14593.902937;
                milligram=(edtValue)*14593902.937;
                tonmetric=(edtValue)*0.0145939029;
                pound=(edtValue)*32.174048556;
                ounce=(edtValue)*514.7847769;
                carat=(edtValue)*72969.514686;
                tonshort=(edtValue)*0.0160870243;
                tonlong=(edtValue)*0.0143634145;
                atomicmassunit=(edtValue)*8.788647776E+27;
                exagram=(edtValue)*1.459390293E-14;
                petagram=(edtValue)*1.459390293E-11;
                teragram=(edtValue)*1.459390293E-8;
                gigagram=(edtValue)*0.0000145939;
                megagram=(edtValue)*0.0145939029;
                hectogram=(edtValue)*145.93902937;
                dekagram=(edtValue)*1459.3902937;
                decigram=(edtValue)*145939.02937;
                centigram=(edtValue)*1459390.2937;
                microgram=(edtValue)*14593902937.0;
                nanogram=(edtValue)*14593902937205.0;
                picogram=(edtValue)*14593902937204610.0;
                femtogram=(edtValue)*14593902937204610000.0;
                attogram=(edtValue)*1.459390293E+22;
                dalton=(edtValue)*8.788701762E+27;
                kilogramforcesquaresecondpermeter=(edtValue)*1.4881639436;
                kilopound=(edtValue)*0.0321740486;
                kip=(edtValue)*0.0321740486;
                slug=(edtValue)*1;
                poundforcesquaresecondperfoot=(edtValue)*1;
                poundtroy=(edtValue)*39.100406232;
                poundal=(edtValue)*1036.0043635;
                tonus=(edtValue)*500.36232923;
                tonuk=(edtValue)*446.75213073;
                kiloton=(edtValue)*0.0000145939;
                quintal=(edtValue)*0.1459390294;
                hundredweightus=(edtValue)*0.3217404856;
                hundredweightuk=(edtValue)*0.2872682907;
                quarterus=(edtValue)*1.2869619423;
                quarteruk=(edtValue)*1.1490731627;
                stoneus=(edtValue)*2.5739238845;
                stoneuk=(edtValue)*2.2981463255;
                tonne=(edtValue)*0.0145939029;
                pennyweight=(edtValue)*9384.0974956;
                scruple=(edtValue)*11260.916995;
                grain=(edtValue)*225218.33989;
                gamma=(edtValue)*14593902937.0;
                talent=(edtValue)*0.4267223081;
                mina=(edtValue)*25.603338486;
                shekel=(edtValue)*1280.1669243;
                bekan=(edtValue)*2560.3338486;
                gerah=(edtValue)*25603.338486;
                talentbiblicalgreek=(edtValue)*0.7153873989;
                minabiblicalgreek=(edtValue)*42.923243933;
                tetradrachmabiblicalgreek=(edtValue)*1073.0810983;
                didrachmabiblicalgreek=(edtValue)*2146.1621966;
                drachmabiblicalgreek=(edtValue)*4292.3243933;
                denariusbiblicalroman=(edtValue)*3790.6241395;
                assarionbiblicalroman=(edtValue)*60649.986233;
                quadransbiblicalroman=(edtValue)*242599.94493;
                leptonbiblicalroman=(edtValue)*485199.88986;
                planckmass=(edtValue)*670456925.23;
                electronmass=(edtValue)*1.602072522E+31;
                muonmass=(edtValue)*7.748154803E+28;
                protonmass=(edtValue)*8.725159264E+27;
                neutronmass=(edtValue)*8.713149287E+27;
                deuteronmass=(edtValue)*4.364745796E+27;
                earthmass=(edtValue)*2.442085498E-24;
                sunmass=(edtValue)*7.296951468E-30;
                break;

            case "Pound-force square second/foot - lb F sq s ft-1":
                kilogram=(edtValue)*14.593902937;
                gram=(edtValue)*14593.902937;
                milligram=(edtValue)*14593902.937;
                tonmetric=(edtValue)*0.0145939029;
                pound=(edtValue)*32.174048556;
                ounce=(edtValue)*514.7847769;
                carat=(edtValue)*72969.514686;
                tonshort=(edtValue)*0.0160870243;
                tonlong=(edtValue)*0.0143634145;
                atomicmassunit=(edtValue)*8.788647776E+27;
                exagram=(edtValue)*1.459390293E-14;
                petagram=(edtValue)*1.459390293E-11;
                teragram=(edtValue)*1.459390293E-8;
                gigagram=(edtValue)*0.0000145939;
                megagram=(edtValue)*0.0145939029;
                hectogram=(edtValue)*145.93902937;
                dekagram=(edtValue)*1459.3902937;
                decigram=(edtValue)*145939.02937;
                centigram=(edtValue)*1459390.2937;
                microgram=(edtValue)*14593902937.0;
                nanogram=(edtValue)*14593902937206.0;
                picogram=(edtValue)*14593902937206312.0;
                femtogram=(edtValue)*14593902937206310000.0;
                attogram=(edtValue)*1.459390293E+22;
                dalton=(edtValue)*8.788701762E+27;
                kilogramforcesquaresecondpermeter=(edtValue)*1.4881639436;
                kilopound=(edtValue)*0.0321740486;
                kip=(edtValue)*0.0321740486;
                slug=(edtValue)*1;
                poundforcesquaresecondperfoot=(edtValue)*1;
                poundtroy=(edtValue)*39.100406232;
                poundal=(edtValue)*1036.0043635;
                tonus=(edtValue)*500.36232923;
                tonuk=(edtValue)*446.75213073;
                kiloton=(edtValue)*0.0000145939;
                quintal=(edtValue)*0.1459390294;
                hundredweightus=(edtValue)*0.3217404856;
                hundredweightuk=(edtValue)*0.2872682907;
                quarterus=(edtValue)*1.2869619423;
                quarteruk=(edtValue)*1.1490731627;
                stoneus=(edtValue)*2.5739238845;
                stoneuk=(edtValue)*2.2981463255;
                tonne=(edtValue)*0.0145939029;
                pennyweight=(edtValue)*9384.0974956;
                scruple=(edtValue)*11260.916995;
                grain=(edtValue)*225218.33989;
                gamma=(edtValue)*14593902937.0;
                talent=(edtValue)*0.4267223081;
                mina=(edtValue)*25.603338486;
                shekel=(edtValue)*1280.1669243;
                bekan=(edtValue)*2560.3338486;
                gerah=(edtValue)*25603.338486;
                talentbiblicalgreek=(edtValue)*0.7153873989;
                minabiblicalgreek=(edtValue)*42.923243933;
                tetradrachmabiblicalgreek=(edtValue)*1073.0810983;
                didrachmabiblicalgreek=(edtValue)*2146.1621966;
                drachmabiblicalgreek=(edtValue)*4292.3243933;
                denariusbiblicalroman=(edtValue)*3790.6241395;
                assarionbiblicalroman=(edtValue)*60649.986233;
                quadransbiblicalroman=(edtValue)*242599.94493;
                leptonbiblicalroman=(edtValue)*485199.88986;
                planckmass=(edtValue)*670456925.23;
                electronmass=(edtValue)*1.602072522E+31;
                muonmass=(edtValue)*7.748154803E+28;
                protonmass=(edtValue)*8.725159264E+27;
                neutronmass=(edtValue)*8.713149287E+27;
                deuteronmass=(edtValue)*4.364745796E+27;
                earthmass=(edtValue)*2.442085498E-24;
                sunmass=(edtValue)*7.296951468E-30;
                break;

            case "Pound (troy or apothecary) - lb":
                kilogram=(edtValue)*0.3732417216;
                gram=(edtValue)*373.2417216;
                milligram=(edtValue)*373241.7216;
                tonmetric=(edtValue)*0.0003732417;
                pound=(edtValue)*0.8228571429;
                ounce=(edtValue)*13.165714286;
                carat=(edtValue)*1866.208608;
                tonshort=(edtValue)*0.0004114286;
                tonlong=(edtValue)*0.0003673469;
                atomicmassunit=(edtValue)*2.247712651E+26;
                exagram=(edtValue)*3.732417215E-16;
                petagram=(edtValue)*3.732417215E-13;
                teragram=(edtValue)*3.732417215E-10;
                gigagram=(edtValue)*3.732417215E-7;
                megagram=(edtValue)*0.0003732417;
                hectogram=(edtValue)*3.732417216;
                dekagram=(edtValue)*37.32417216;
                decigram=(edtValue)*3732.417216;
                centigram=(edtValue)*37324.17216;
                microgram=(edtValue)*373241721.6;
                nanogram=(edtValue)*373241721600.0;
                picogram=(edtValue)*373241721600000.0;
                femtogram=(edtValue)*373241721599999740.0;
                attogram=(edtValue)*373241721599999800000.0;
                dalton=(edtValue)*2.247726458E+26;
                kilogramforcesquaresecondpermeter=(edtValue)*0.0380600635;
                kilopound=(edtValue)*0.0008228571;
                kip=(edtValue)*0.0008228571;
                slug=(edtValue)*0.0255751819;
                poundforcesquaresecondperfoot=(edtValue)*0.0255751819;
                poundtroy=(edtValue)*1;
                poundal=(edtValue)*26.496;
                tonus=(edtValue)*12.796857564;
                tonuk=(edtValue)*11.425766988;
                kiloton=(edtValue)*3.732417215E-7;
                quintal=(edtValue)*0.0037324172;
                hundredweightus=(edtValue)*0.0082285714;
                hundredweightuk=(edtValue)*0.0073469388;
                quarterus=(edtValue)*0.0329142857;
                quarteruk=(edtValue)*0.0293877551;
                stoneus=(edtValue)*0.0658285714;
                stoneuk=(edtValue)*0.0587755102;
                tonne=(edtValue)*0.0003732417;
                pennyweight=(edtValue)*240;
                scruple=(edtValue)*288;
                grain=(edtValue)*5760;
                gamma=(edtValue)*373241721.6;
                talent=(edtValue)*0.0109135006;
                mina=(edtValue)*0.6548100379;
                shekel=(edtValue)*32.740501895;
                bekan=(edtValue)*65.481003789;
                gerah=(edtValue)*654.81003789;
                talentbiblicalgreek=(edtValue)*0.0182961628;
                minabiblicalgreek=(edtValue)*1.0977697694;
                tetradrachmabiblicalgreek=(edtValue)*27.444244235;
                didrachmabiblicalgreek=(edtValue)*54.888488471;
                drachmabiblicalgreek=(edtValue)*109.77697694;
                denariusbiblicalroman=(edtValue)*96.945901714;
                assarionbiblicalroman=(edtValue)*1551.1344274;
                quadransbiblicalroman=(edtValue)*6204.5377097;
                leptonbiblicalroman=(edtValue)*12409.075419;
                planckmass=(edtValue)*17147057.789;
                electronmass=(edtValue)*4.097329611E+29;
                muonmass=(edtValue)*1.981604681E+27;
                protonmass=(edtValue)*2.231475349E+26;
                neutronmass=(edtValue)*2.228403775E+26;
                deuteronmass=(edtValue)*1.116291674E+26;
                earthmass=(edtValue)*6.245678072E-26;
                sunmass=(edtValue)*1.866208607E-31;
                break;

            case "Poundal - pdl":
                kilogram=(edtValue)*0.0140867196;
                gram=(edtValue)*14.086719565;
                milligram=(edtValue)*14086.719565;
                tonmetric=(edtValue)*0.0000140867;
                pound=(edtValue)*0.0310559006;
                ounce=(edtValue)*0.4968944099;
                carat=(edtValue)*70.433597826;
                tonshort=(edtValue)*0.000015528;
                tonlong=(edtValue)*0.0000138642;
                atomicmassunit=(edtValue)*8.483215019E+24;
                exagram=(edtValue)*1.408671956E-17;
                petagram=(edtValue)*1.408671956E-14;
                teragram=(edtValue)*1.408671956E-11;
                gigagram=(edtValue)*1.408671956E-8;
                megagram=(edtValue)*0.0000140867;
                hectogram=(edtValue)*0.1408671957;
                dekagram=(edtValue)*1.4086719565;
                decigram=(edtValue)*140.86719565;
                centigram=(edtValue)*1408.6719565;
                microgram=(edtValue)*14086719.565;
                nanogram=(edtValue)*14086719565.0;
                picogram=(edtValue)*14086719565204.0;
                femtogram=(edtValue)*14086719565203616.0;
                attogram=(edtValue)*14086719565203616000.0;
                dalton=(edtValue)*8.483267128E+24;
                kilogramforcesquaresecondpermeter=(edtValue)*0.0014364456;
                kilopound=(edtValue)*0.0000310559;
                kip=(edtValue)*0.0000310559;
                slug=(edtValue)*0.0009652469;
                poundforcesquaresecondperfoot=(edtValue)*0.0009652469;
                poundtroy=(edtValue)*0.0377415459;
                poundal=(edtValue)*1;
                tonus=(edtValue)*0.482973187;
                tonuk=(edtValue)*0.4312261091;
                kiloton=(edtValue)*1.408671956E-8;
                quintal=(edtValue)*0.0001408672;
                hundredweightus=(edtValue)*0.000310559;
                hundredweightuk=(edtValue)*0.0002772848;
                quarterus=(edtValue)*0.001242236;
                quarteruk=(edtValue)*0.0011091393;
                stoneus=(edtValue)*0.002484472;
                stoneuk=(edtValue)*0.0022182786;
                tonne=(edtValue)*0.0000140867;
                pennyweight=(edtValue)*9.0579710145;
                scruple=(edtValue)*10.869565217;
                grain=(edtValue)*217.39130435;
                gamma=(edtValue)*14086719.565;
                talent=(edtValue)*0.0004118924;
                mina=(edtValue)*0.0247135431;
                shekel=(edtValue)*1.2356771548;
                bekan=(edtValue)*2.4713543097;
                gerah=(edtValue)*24.713543097;
                talentbiblicalgreek=(edtValue)*0.0006905255;
                minabiblicalgreek=(edtValue)*0.0414315281;
                tetradrachmabiblicalgreek=(edtValue)*1.0357882033;
                didrachmabiblicalgreek=(edtValue)*2.0715764066;
                drachmabiblicalgreek=(edtValue)*4.1431528133;
                denariusbiblicalroman=(edtValue)*3.6588881988;
                assarionbiblicalroman=(edtValue)*58.54221118;
                quadransbiblicalroman=(edtValue)*234.16884472;
                leptonbiblicalroman=(edtValue)*468.33768944;
                planckmass=(edtValue)*647156.46849;
                electronmass=(edtValue)*1.546395535E+28;
                muonmass=(edtValue)*7.478882402E+25;
                protonmass=(edtValue)*8.421932929E+24;
                neutronmass=(edtValue)*8.410340336E+24;
                deuteronmass=(edtValue)*4.213057347E+24;
                earthmass=(edtValue)*2.357215456E-27;
                sunmass=(edtValue)*7.043359782E-33;
                break;

            case "Ton (assay) (US) - AT)":
                kilogram=(edtValue)*0.02916667;
                gram=(edtValue)*29.16667;
                milligram=(edtValue)*29166.67;
                tonmetric=(edtValue)*0.0000291667;
                pound=(edtValue)*0.0643015005;
                ounce=(edtValue)*1.0288240078;
                carat=(edtValue)*145.83335;
                tonshort=(edtValue)*0.0000321508;
                tonlong=(edtValue)*0.000028706;
                atomicmassunit=(edtValue)*1.756456724E+25;
                exagram=(edtValue)*2.916667E-17;
                petagram=(edtValue)*2.916667E-14;
                teragram=(edtValue)*2.916667E-11;
                gigagram=(edtValue)*2.916667E-8;
                megagram=(edtValue)*0.0000291667;
                hectogram=(edtValue)*0.2916667;
                dekagram=(edtValue)*2.916667;
                decigram=(edtValue)*291.6667;
                centigram=(edtValue)*2916.667;
                microgram=(edtValue)*29166670.0;
                nanogram=(edtValue)*29166670000.0;
                picogram=(edtValue)*29166670000000.0;
                femtogram=(edtValue)*29166670000000330.0;
                attogram=(edtValue)*29166670000000330000.0;
                dalton=(edtValue)*1.756467513E+25;
                kilogramforcesquaresecondpermeter=(edtValue)*0.0029741726;
                kilopound=(edtValue)*0.0000643015;
                kip=(edtValue)*0.0000643015;
                slug=(edtValue)*0.0019985517;
                poundforcesquaresecondperfoot=(edtValue)*0.0019985517;
                poundtroy=(edtValue)*0.0781441846;
                poundal=(edtValue)*2.0705083157;
                tonus=(edtValue)*1;
                tonuk=(edtValue)*0.8928572449;
                kiloton=(edtValue)*2.916667E-8;
                quintal=(edtValue)*0.0002916667;
                hundredweightus=(edtValue)*0.000643015;
                hundredweightuk=(edtValue)*0.0005741205;
                quarterus=(edtValue)*0.00257206;
                quarteruk=(edtValue)*0.0022964822;
                stoneus=(edtValue)*0.00514412;
                stoneuk=(edtValue)*0.0045929643;
                tonne=(edtValue)*0.0000291667;
                pennyweight=(edtValue)*18.754604308;
                scruple=(edtValue)*22.50552517;
                grain=(edtValue)*450.1105034;
                gamma=(edtValue)*29166670.0;
                talent=(edtValue)*0.0008528266;
                mina=(edtValue)*0.0511695965;
                shekel=(edtValue)*2.5584798246;
                bekan=(edtValue)*5.1169596491;
                gerah=(edtValue)*51.169596491;
                talentbiblicalgreek=(edtValue)*0.0014297387;
                minabiblicalgreek=(edtValue)*0.0857843235;
                tetradrachmabiblicalgreek=(edtValue)*2.1446080882;
                didrachmabiblicalgreek=(edtValue)*4.2892161765;
                drachmabiblicalgreek=(edtValue)*8.5784323529;
                denariusbiblicalroman=(edtValue)*7.5757584416;
                assarionbiblicalroman=(edtValue)*121.21213506;
                quadransbiblicalroman=(edtValue)*484.84854026;
                leptonbiblicalroman=(edtValue)*969.69708052;
                planckmass=(edtValue)*1339942.8495;
                electronmass=(edtValue)*3.201824815E+28;
                muonmass=(edtValue)*1.54850882E+26;
                protonmass=(edtValue)*1.743768216E+25;
                neutronmass=(edtValue)*1.74136796E+25;
                deuteronmass=(edtValue)*8.723170272E+24;
                earthmass=(edtValue)*4.880634203E-27;
                sunmass=(edtValue)*1.4583335E-32;
                break;

            case "Ton (assay) (UK) - AT)":
                kilogram=(edtValue)*0.0326666667;
                gram=(edtValue)*32.666666667;
                milligram=(edtValue)*32666.666667;
                tonmetric=(edtValue)*0.0000326667;
                pound=(edtValue)*0.0720176723;
                ounce=(edtValue)*1.152282757;
                carat=(edtValue)*163.33333333;
                tonshort=(edtValue)*0.0000360088;
                tonlong=(edtValue)*0.0000321507;
                atomicmassunit=(edtValue)*1.967231306E+25;
                exagram=(edtValue)*3.266666666E-17;
                petagram=(edtValue)*3.266666666E-14;
                teragram=(edtValue)*3.266666666E-11;
                gigagram=(edtValue)*3.266666666E-8;
                megagram=(edtValue)*0.0000326667;
                hectogram=(edtValue)*0.3266666667;
                dekagram=(edtValue)*3.2666666667;
                decigram=(edtValue)*326.66666667;
                centigram=(edtValue)*3266.6666667;
                microgram=(edtValue)*32666666.667;
                nanogram=(edtValue)*32666666667.0;
                picogram=(edtValue)*32666666666666.0;
                femtogram=(edtValue)*32666666666665790.0;
                attogram=(edtValue)*32666666666665796000.0;
                dalton=(edtValue)*1.96724339E+25;
                kilogramforcesquaresecondpermeter=(edtValue)*0.003331073;
                kilopound=(edtValue)*0.0000720177;
                kip=(edtValue)*0.0000720177;
                slug=(edtValue)*0.0022383777;
                poundforcesquaresecondperfoot=(edtValue)*0.0022383777;
                poundtroy=(edtValue)*0.0875214768;
                poundal=(edtValue)*2.3189690485;
                tonus=(edtValue)*1.119999872;
                tonuk=(edtValue)*1;
                kiloton=(edtValue)*3.266666666E-8;
                quintal=(edtValue)*0.0003266667;
                hundredweightus=(edtValue)*0.0007201767;
                hundredweightuk=(edtValue)*0.0006430149;
                quarterus=(edtValue)*0.0028807069;
                quarteruk=(edtValue)*0.0025720597;
                stoneus=(edtValue)*0.0057614138;
                stoneuk=(edtValue)*0.0051441195;
                tonne=(edtValue)*0.0000326667;
                pennyweight=(edtValue)*21.005154425;
                scruple=(edtValue)*25.20618531;
                grain=(edtValue)*504.12370619;
                gamma=(edtValue)*32666666.667;
                talent=(edtValue)*0.0009551657;
                mina=(edtValue)*0.0573099415;
                shekel=(edtValue)*2.865497076;
                bekan=(edtValue)*5.730994152;
                gerah=(edtValue)*57.30994152;
                talentbiblicalgreek=(edtValue)*0.0016013072;
                minabiblicalgreek=(edtValue)*0.0960784314;
                tetradrachmabiblicalgreek=(edtValue)*2.4019607843;
                didrachmabiblicalgreek=(edtValue)*4.8039215686;
                drachmabiblicalgreek=(edtValue)*9.6078431373;
                denariusbiblicalroman=(edtValue)*8.4848484848;
                assarionbiblicalroman=(edtValue)*135.75757576;
                quadransbiblicalroman=(edtValue)*543.03030303;
                leptonbiblicalroman=(edtValue)*1086.0606061;
                planckmass=(edtValue)*1500735.82;
                electronmass=(edtValue)*3.586043384E+28;
                muonmass=(edtValue)*1.73432968E+26;
                protonmass=(edtValue)*1.953020179E+25;
                neutronmass=(edtValue)*1.950331892E+25;
                deuteronmass=(edtValue)*9.769949589E+24;
                earthmass=(edtValue)*5.466309683E-27;
                sunmass=(edtValue)*1.633333333E-32;
                break;

            case "Kiloton (metric) - kt":
                kilogram=(edtValue)*1000000;
                gram=(edtValue)*1000000000.0;
                milligram=(edtValue)*1000000000000.0;
                tonmetric=(edtValue)*1000;
                pound=(edtValue)*2204622.6218;
                ounce=(edtValue)*35273961.95;
                carat=(edtValue)*5000000000.0;
                tonshort=(edtValue)*1102.3113109;
                tonlong=(edtValue)*984.20652761;
                atomicmassunit=(edtValue)*6.022136651E+32;
                exagram=(edtValue)*1.E-9;
                petagram=(edtValue)*0.000001;
                teragram=(edtValue)*0.001;
                gigagram=(edtValue)*1;
                megagram=(edtValue)*1000;
                hectogram=(edtValue)*10000000.0;
                dekagram=(edtValue)*100000000.0;
                decigram=(edtValue)*10000000000.0;
                centigram=(edtValue)*100000000000.0;
                microgram=(edtValue)*1000000000000000.0;
                nanogram=(edtValue)*1000000000000000000.0;
                picogram=(edtValue)*1.E+21;
                femtogram=(edtValue)*1.E+24;
                attogram=(edtValue)*1.E+27;
                dalton=(edtValue)*6.022173643E+32;
                kilogramforcesquaresecondpermeter=(edtValue)*101971.6213;
                kilopound=(edtValue)*2204.6226218;
                kip=(edtValue)*2204.6226218;
                slug=(edtValue)*68521.765857;
                poundforcesquaresecondperfoot=(edtValue)*68521.765857;
                poundtroy=(edtValue)*2679228.8807;
                poundal=(edtValue)*70988848.424;
                tonus=(edtValue)*34285710.367;
                tonuk=(edtValue)*30612244.898;
                kiloton=(edtValue)*1;
                quintal=(edtValue)*10000;
                hundredweightus=(edtValue)*22046.226218;
                hundredweightuk=(edtValue)*19684.130552;
                quarterus=(edtValue)*88184.904874;
                quarteruk=(edtValue)*78736.522209;
                stoneus=(edtValue)*176369.80975;
                stoneuk=(edtValue)*157473.04442;
                tonne=(edtValue)*1000;
                pennyweight=(edtValue)*643014931.37;
                scruple=(edtValue)*771617917.64;
                grain=(edtValue)*15432358353.0;
                gamma=(edtValue)*1000000000000000.0;
                talent=(edtValue)*29239.766082;
                mina=(edtValue)*1754385.9649;
                shekel=(edtValue)*87719298.246;
                bekan=(edtValue)*175438596.49;
                gerah=(edtValue)*1754385964.9;
                talentbiblicalgreek=(edtValue)*49019.607843;
                minabiblicalgreek=(edtValue)*2941176.4706;
                tetradrachmabiblicalgreek=(edtValue)*73529411.765;
                didrachmabiblicalgreek=(edtValue)*147058823.53;
                drachmabiblicalgreek=(edtValue)*294117647.06;
                denariusbiblicalroman=(edtValue)*259740259.74;
                assarionbiblicalroman=(edtValue)*4155844155.8;
                quadransbiblicalroman=(edtValue)*16623376623.0;
                leptonbiblicalroman=(edtValue)*33246753247.0;
                planckmass=(edtValue)*45940892447777.0;
                electronmass=(edtValue)*1.097768382E+36;
                muonmass=(edtValue)*5.309172492E+33;
                protonmass=(edtValue)*5.978633201E+32;
                neutronmass=(edtValue)*5.970403753E+32;
                deuteronmass=(edtValue)*2.990800894E+32;
                earthmass=(edtValue)*1.673360107E-19;
                sunmass=(edtValue)*5.E-25;
                break;

            case "Qunital (metric) -  cwt":
                kilogram=(edtValue)*100;
                gram=(edtValue)*100000;
                milligram=(edtValue)*100000000.0;
                tonmetric=(edtValue)*0.1;
                pound=(edtValue)*220.46226218;
                ounce=(edtValue)*3527.396195;
                carat=(edtValue)*500000;
                tonshort=(edtValue)*0.1102311311;
                tonlong=(edtValue)*0.0984206528;
                atomicmassunit=(edtValue)*6.022136651E+28;
                exagram=(edtValue)*1.E-13;
                petagram=(edtValue)*1.E-10;
                teragram=(edtValue)*1.E-7;
                gigagram=(edtValue)*0.0001;
                megagram=(edtValue)*0.1;
                hectogram=(edtValue)*1000;
                dekagram=(edtValue)*10000;
                decigram=(edtValue)*1000000;
                centigram=(edtValue)*10000000;
                microgram=(edtValue)*100000000000.0;
                nanogram=(edtValue)*100000000000000.0;
                picogram=(edtValue)*100000000000000000.0;
                femtogram=(edtValue)*100000000000000000000.0;
                attogram=(edtValue)*1.E+23;
                dalton=(edtValue)*6.022173643E+28;
                kilogramforcesquaresecondpermeter=(edtValue)*10.19716213;
                kilopound=(edtValue)*0.2204622622;
                kip=(edtValue)*0.2204622622;
                slug=(edtValue)*6.8521765857;
                poundforcesquaresecondperfoot=(edtValue)*6.8521765857;
                poundtroy=(edtValue)*267.92288807;
                poundal=(edtValue)*7098.8848424;
                tonus=(edtValue)*3428.5710367;
                tonuk=(edtValue)*3061.2244898;
                kiloton=(edtValue)*0.0001;
                quintal=(edtValue)*1;
                hundredweightus=(edtValue)*2.2046226218;
                hundredweightuk=(edtValue)*1.9684130552;
                quarterus=(edtValue)*8.8184904874;
                quarteruk=(edtValue)*7.8736522209;
                stoneus=(edtValue)*17.636980975;
                stoneuk=(edtValue)*15.747304442;
                tonne=(edtValue)*0.1;
                pennyweight=(edtValue)*64301.493137;
                scruple=(edtValue)*77161.791764;
                grain=(edtValue)*1543235.8353;
                gamma=(edtValue)*100000000000.0;
                talent=(edtValue)*2.9239766082;
                mina=(edtValue)*175.43859649;
                shekel=(edtValue)*8771.9298246;
                bekan=(edtValue)*17543.859649;
                gerah=(edtValue)*175438.59649;
                talentbiblicalgreek=(edtValue)*4.9019607843;
                minabiblicalgreek=(edtValue)*294.11764706;
                tetradrachmabiblicalgreek=(edtValue)*7352.9411765;
                didrachmabiblicalgreek=(edtValue)*14705.882353;
                drachmabiblicalgreek=(edtValue)*29411.764706;
                denariusbiblicalroman=(edtValue)*25974.025974;
                assarionbiblicalroman=(edtValue)*415584.41558;
                quadransbiblicalroman=(edtValue)*1662337.6623;
                leptonbiblicalroman=(edtValue)*3324675.3247;
                planckmass=(edtValue)*4594089244.8;
                electronmass=(edtValue)*1.097768382E+32;
                muonmass=(edtValue)*5.309172492E+29;
                protonmass=(edtValue)*5.978633201E+28;
                neutronmass=(edtValue)*5.970403753E+28;
                deuteronmass=(edtValue)*2.990800894E+28;
                earthmass=(edtValue)*1.673360107E-23;
                sunmass=(edtValue)*5.E-29;
                break;

            case "Hundredweight (US) - hwt ":
                kilogram=(edtValue)*45.359237;
                gram=(edtValue)*45359.237;
                milligram=(edtValue)*45359237;
                tonmetric=(edtValue)*0.045359237;
                pound=(edtValue)*100;
                ounce=(edtValue)*1600;
                carat=(edtValue)*226796.185;
                tonshort=(edtValue)*0.05;
                tonlong=(edtValue)*0.0446428571;
                atomicmassunit=(edtValue)*2.731595236E+28;
                exagram=(edtValue)*4.535923699E-14;
                petagram=(edtValue)*4.535923699E-11;
                teragram=(edtValue)*4.535923699E-8;
                gigagram=(edtValue)*0.0000453592;
                megagram=(edtValue)*0.045359237;
                hectogram=(edtValue)*453.59237;
                dekagram=(edtValue)*4535.9237;
                decigram=(edtValue)*453592.37;
                centigram=(edtValue)*4535923.7;
                microgram=(edtValue)*45359237000.0;
                nanogram=(edtValue)*45359237000000.0;
                picogram=(edtValue)*45359236999999500.0;
                femtogram=(edtValue)*45359236999999500000.0;
                attogram=(edtValue)*4.535923699E+22;
                dalton=(edtValue)*2.731612015E+28;
                kilogramforcesquaresecondpermeter=(edtValue)*4.6253549377;
                kilopound=(edtValue)*0.1;
                kip=(edtValue)*0.1;
                slug=(edtValue)*3.1080950172;
                poundforcesquaresecondperfoot=(edtValue)*3.1080950172;
                poundtroy=(edtValue)*121.52777778;
                poundal=(edtValue)*3220;
                tonus=(edtValue)*1555.1736623;
                tonuk=(edtValue)*1388.5480714;
                kiloton=(edtValue)*0.0000453592;
                quintal=(edtValue)*0.45359237;
                hundredweightus=(edtValue)*1;
                hundredweightuk=(edtValue)*0.8928571429;
                quarterus=(edtValue)*4;
                quarteruk=(edtValue)*3.5714285714;
                stoneus=(edtValue)*8;
                stoneuk=(edtValue)*7.1428571429;
                tonne=(edtValue)*0.045359237;
                pennyweight=(edtValue)*29166.666667;
                scruple=(edtValue)*35000;
                grain=(edtValue)*700000;
                gamma=(edtValue)*45359237000.0;
                talent=(edtValue)*1.3262934795;
                mina=(edtValue)*79.577608772;
                shekel=(edtValue)*3978.8804386;
                bekan=(edtValue)*7957.7608772;
                gerah=(edtValue)*79577.608772;
                talentbiblicalgreek=(edtValue)*2.2234920098;
                minabiblicalgreek=(edtValue)*133.40952059;
                tetradrachmabiblicalgreek=(edtValue)*3335.2380147;
                didrachmabiblicalgreek=(edtValue)*6670.4760294;
                drachmabiblicalgreek=(edtValue)*13340.952059;
                denariusbiblicalroman=(edtValue)*11781.62;
                assarionbiblicalroman=(edtValue)*188505.92;
                quadransbiblicalroman=(edtValue)*754023.68;
                leptonbiblicalroman=(edtValue)*1508047.36;
                planckmass=(edtValue)*2083843828.5;
                electronmass=(edtValue)*4.979393625E+31;
                muonmass=(edtValue)*2.408200133E+29;
                protonmass=(edtValue)*2.711862403E+28;
                neutronmass=(edtValue)*2.708129588E+28;
                deuteronmass=(edtValue)*1.356604465E+28;
                earthmass=(edtValue)*7.590233768E-24;
                sunmass=(edtValue)*2.267961849E-29;
                break;

            case "Hundredweight (UK) - hwt":
                kilogram=(edtValue)*50.80234544;
                gram=(edtValue)*50802.34544;
                milligram=(edtValue)*50802345.44;
                tonmetric=(edtValue)*0.0508023454;
                pound=(edtValue)*112;
                ounce=(edtValue)*1732;
                carat=(edtValue)*254011.7272;
                tonshort=(edtValue)*0.056;
                tonlong=(edtValue)*0.5;
                atomicmassunit=(edtValue)*3.059386664E+28;
                exagram=(edtValue)*5.080234544E-14;
                petagram=(edtValue)*5.080234544E-11;
                teragram=(edtValue)*5.080234544E-8;
                gigagram=(edtValue)*0.0000508023;
                megagram=(edtValue)*0.0508023454;
                hectogram=(edtValue)*508.0234544;
                dekagram=(edtValue)*5080.234544;
                decigram=(edtValue)*508023.4544;
                centigram=(edtValue)*5080234.544;
                microgram=(edtValue)*50802345440.0;
                nanogram=(edtValue)*50802345440001.0;
                picogram=(edtValue)*50802345440000550.0;
                femtogram=(edtValue)*50802345440000550000.0;
                attogram=(edtValue)*5.080234544E+22;
                dalton=(edtValue)*3.059405457E+28;
                kilogramforcesquaresecondpermeter=(edtValue)*5.1803975302;
                kilopound=(edtValue)*0.112;
                kip=(edtValue)*0.112;
                slug=(edtValue)*3.4810664192;
                poundforcesquaresecondperfoot=(edtValue)*3.4810664192;
                poundtroy=(edtValue)*136.11111111;
                poundal=(edtValue)*3606.4;
                tonus=(edtValue)*1741.7945017;
                tonuk=(edtValue)*1555.17384;
                kiloton=(edtValue)*0.0000508023;
                quintal=(edtValue)*0.5080234544;
                hundredweightus=(edtValue)*1.12;
                hundredweightuk=(edtValue)*1;
                quarterus=(edtValue)*4.48;
                quarteruk=(edtValue)*4;
                stoneus=(edtValue)*8.96;
                stoneuk=(edtValue)*8;
                tonne=(edtValue)*0.0508023454;
                pennyweight=(edtValue)*32666.666667;
                scruple=(edtValue)*39200;
                grain=(edtValue)*784000;
                gamma=(edtValue)*50802345440.0;
                talent=(edtValue)*1.4854486971;
                mina=(edtValue)*89.126921825;
                shekel=(edtValue)*4456.3460912;
                bekan=(edtValue)*8912.6921825;
                gerah=(edtValue)*89126.921825;
                talentbiblicalgreek=(edtValue)*2.490311051;
                minabiblicalgreek=(edtValue)*149.41866306;
                tetradrachmabiblicalgreek=(edtValue)*3735.4665765;
                didrachmabiblicalgreek=(edtValue)*7470.9331529;
                drachmabiblicalgreek=(edtValue)*14941.866306;
                denariusbiblicalroman=(edtValue)*13195.4144;
                assarionbiblicalroman=(edtValue)*211126.6304;
                quadransbiblicalroman=(edtValue)*844506.5216;
                leptonbiblicalroman=(edtValue)*1689013.0432;
                planckmass=(edtValue)*2333905088.0;
                electronmass=(edtValue)*5.57692086E+31;
                muonmass=(edtValue)*2.697184149E+29;
                protonmass=(edtValue)*3.037285891E+28;
                neutronmass=(edtValue)*3.033105138E+28;
                deuteronmass=(edtValue)*1.519397001E+28;
                earthmass=(edtValue)*8.50106182E-24;
                sunmass=(edtValue)*2.540117272E-29;
                break;

            case "Quarter (US) - qr":
                kilogram=(edtValue)*11.33980925;
                gram=(edtValue)*11339.80925;
                milligram=(edtValue)*11339809.25;
                tonmetric=(edtValue)*0.0113398093;
                pound=(edtValue)*25;
                ounce=(edtValue)*400;
                carat=(edtValue)*56699.04625;
                tonshort=(edtValue)*0.0125;
                tonlong=(edtValue)*0.0111607143;
                atomicmassunit=(edtValue)*6.82898809E+27;
                exagram=(edtValue)*1.133980925E-14;
                petagram=(edtValue)*1.133980925E-11;
                teragram=(edtValue)*1.133980925E-8;
                gigagram=(edtValue)*0.0000113398;
                megagram=(edtValue)*0.0113398093;
                hectogram=(edtValue)*113.3980925;
                dekagram=(edtValue)*1133.980925;
                decigram=(edtValue)*113398.0925;
                centigram=(edtValue)*1133980.925;
                microgram=(edtValue)*11339809250.0;
                nanogram=(edtValue)*11339809250000.0;
                picogram=(edtValue)*11339809250000004.0;
                femtogram=(edtValue)*11339809250000003000.0;
                attogram=(edtValue)*1.133980925E+22;
                dalton=(edtValue)*6.829030038E+27;
                kilogramforcesquaresecondpermeter=(edtValue)*1.1563387344;
                kilopound=(edtValue)*0.025;
                kip=(edtValue)*0.025;
                slug=(edtValue)*0.7770237543;
                poundforcesquaresecondperfoot=(edtValue)*0.7770237543;
                poundtroy=(edtValue)*30.381944444;
                poundal=(edtValue)*805;
                tonus=(edtValue)*388.79341557;
                tonuk=(edtValue)*347.13701786;
                kiloton=(edtValue)*0.0000113398;
                quintal=(edtValue)*0.1133980925;
                hundredweightus=(edtValue)*0.25;
                hundredweightuk=(edtValue)*0.2232142857;
                quarterus=(edtValue)*1;
                quarteruk=(edtValue)*0.8928571429;
                stoneus=(edtValue)*2;
                stoneuk=(edtValue)*1.7857142857;
                tonne=(edtValue)*0.0113398093;
                pennyweight=(edtValue)*7291.6666666;
                scruple=(edtValue)*8750;
                grain=(edtValue)*175000;
                gamma=(edtValue)*11339809250.0;
                talent=(edtValue)*0.3315733699;
                mina=(edtValue)*19.894402193;
                shekel=(edtValue)*994.72010965;
                bekan=(edtValue)*1989.4402193;
                gerah=(edtValue)*19894.402193;
                talentbiblicalgreek=(edtValue)*0.5558730025;
                minabiblicalgreek=(edtValue)*33.352380147;
                tetradrachmabiblicalgreek=(edtValue)*833.80950368;
                didrachmabiblicalgreek=(edtValue)*1667.6190074;
                drachmabiblicalgreek=(edtValue)*3335.2380147;
                denariusbiblicalroman=(edtValue)*2945.405;
                assarionbiblicalroman=(edtValue)*47126.48;
                quadransbiblicalroman=(edtValue)*188505.92;
                leptonbiblicalroman=(edtValue)*377011.84;
                planckmass=(edtValue)*520960957.13;
                electronmass=(edtValue)*1.244848406E+31;
                muonmass=(edtValue)*6.020500334E+28;
                protonmass=(edtValue)*6.779656008E+27;
                neutronmass=(edtValue)*6.77032397E+27;
                deuteronmass=(edtValue)*3.391511164E+27;
                earthmass=(edtValue)*1.897558442E-24;
                sunmass=(edtValue)*5.669904625E-30;
                break;

            case "Quarter (UK) - qr":
                kilogram=(edtValue)*12.70058636;
                gram=(edtValue)*12700.58636;
                milligram=(edtValue)*0.0000127006;
                tonmetric=(edtValue)*0.0127005864;
                pound=(edtValue)*28;
                ounce=(edtValue)*448;
                carat=(edtValue)*63502.9318;
                tonshort=(edtValue)*0.014;
                tonlong=(edtValue)*0.0125;
                atomicmassunit=(edtValue)*7.648466661E+27;
                exagram=(edtValue)*1.270058635E-14;
                petagram=(edtValue)*1.270058635E-11;
                teragram=(edtValue)*1.270058635E-8;
                gigagram=(edtValue)*0.0000127006;
                megagram=(edtValue)*0.0127005864;
                hectogram=(edtValue)*127.0058636;
                dekagram=(edtValue)*1270.058636;
                decigram=(edtValue)*127005.8636;
                centigram=(edtValue)*1270058.636;
                microgram=(edtValue)*12700586360.0;
                nanogram=(edtValue)*12700586360000.0;
                picogram=(edtValue)*12700586359999976.0;
                femtogram=(edtValue)*12700586359999975000.0;
                attogram=(edtValue)*1.270058635E+22;
                dalton=(edtValue)*7.648513643E+27;
                kilogramforcesquaresecondpermeter=(edtValue)*1.2950993826;
                kilopound=(edtValue)*0.028;
                kip=(edtValue)*0.028;
                slug=(edtValue)*0.8702666048;
                poundforcesquaresecondperfoot=(edtValue)*0.8702666048;
                poundtroy=(edtValue)*34.027777778;
                poundal=(edtValue)*901.6;
                tonus=(edtValue)*435.44862543;
                tonuk=(edtValue)*388.79346;
                kiloton=(edtValue)*0.0000127006;
                quintal=(edtValue)*0.1270058636;
                hundredweightus=(edtValue)*0.28;
                hundredweightuk=(edtValue)*0.25;
                quarterus=(edtValue)*1.12;
                quarteruk=(edtValue)*1;
                stoneus=(edtValue)*2.24;
                stoneuk=(edtValue)*2;
                tonne=(edtValue)*0.0127005864;
                pennyweight=(edtValue)*8166.6666666;
                scruple=(edtValue)*9800;
                grain=(edtValue)*196000;
                gamma=(edtValue)*12700586360.0;
                talent=(edtValue)*0.3713621743;
                mina=(edtValue)*22.281730456;
                shekel=(edtValue)*1114.0865228;
                bekan=(edtValue)*2228.1730456;
                gerah=(edtValue)*22281.730456;
                talentbiblicalgreek=(edtValue)*0.6225777627;
                minabiblicalgreek=(edtValue)*37.354665765;
                tetradrachmabiblicalgreek=(edtValue)*933.86664412;
                didrachmabiblicalgreek=(edtValue)*1867.7332882;
                drachmabiblicalgreek=(edtValue)*3735.4665765;
                denariusbiblicalroman=(edtValue)*3298.8536;
                assarionbiblicalroman=(edtValue)*52781.6576;
                quadransbiblicalroman=(edtValue)*211126.6304;
                leptonbiblicalroman=(edtValue)*422253.2608;
                planckmass=(edtValue)*583476271.99;
                electronmass=(edtValue)*1.394230215E+31;
                muonmass=(edtValue)*6.742960374E+28;
                protonmass=(edtValue)*7.593214729E+27;
                neutronmass=(edtValue)*7.582762847E+27;
                deuteronmass=(edtValue)*3.798492504E+27;
                earthmass=(edtValue)*2.125265455E-24;
                sunmass=(edtValue)*6.350293179E-30;
                break;


            case "Stone (US) - st":
                kilogram=(edtValue)*5.669904625;
                gram=(edtValue)*5669.904625;
                milligram=(edtValue)*5669904.625;
                tonmetric=(edtValue)*0.0056699046;
                pound=(edtValue)*12.5;
                ounce=(edtValue)*200;
                carat=(edtValue)*28349.523125;
                tonshort=(edtValue)*0.00625;
                tonlong=(edtValue)*0.0055803571;
                atomicmassunit=(edtValue)*3.414494045E+27;
                exagram=(edtValue)*5.669904625E-15;
                petagram=(edtValue)*5.669904625E-12;
                teragram=(edtValue)*5.669904625E-9;
                gigagram=(edtValue)*0.0000056699;
                megagram=(edtValue)*0.0056699046;
                hectogram=(edtValue)*56.69904625;
                dekagram=(edtValue)*566.9904625;
                decigram=(edtValue)*56699.04625;
                centigram=(edtValue)*566990.4625;
                microgram=(edtValue)*5669904625.0;
                nanogram=(edtValue)*5669904625000.0;
                picogram=(edtValue)*5669904625000066.0;
                femtogram=(edtValue)*5669904625000066000.0;
                attogram=(edtValue)*5.669904625E+21;
                dalton=(edtValue)*3.414515019E+27;
                kilogramforcesquaresecondpermeter=(edtValue)*0.5781693672;
                kilopound=(edtValue)*0.0125;
                kip=(edtValue)*0.0125;
                slug=(edtValue)*0.3885118771;
                poundforcesquaresecondperfoot=(edtValue)*0.3885118771;
                poundtroy=(edtValue)*15.190972222;
                poundal=(edtValue)*402.5;
                tonus=(edtValue)*194.39670778;
                tonuk=(edtValue)*173.56850893;
                kiloton=(edtValue)*0.0000056699;
                quintal=(edtValue)*0.0566990463;
                hundredweightus=(edtValue)*0.125;
                hundredweightuk=(edtValue)*0.1116071429;
                quarterus=(edtValue)*0.5;
                quarteruk=(edtValue)*0.4464285714;
                stoneus=(edtValue)*1;
                stoneuk=(edtValue)*0.8928571429;
                tonne=(edtValue)*0.0056699046;
                pennyweight=(edtValue)*3645.8333333;
                scruple=(edtValue)*4375;
                grain=(edtValue)*87500;
                gamma=(edtValue)*5669904625.0;
                talent=(edtValue)*0.1657866849;
                mina=(edtValue)*9.9472010965;
                shekel=(edtValue)*497.36005482;
                bekan=(edtValue)*994.72010965;
                gerah=(edtValue)*9947.2010965;
                talentbiblicalgreek=(edtValue)*0.2779365012;
                minabiblicalgreek=(edtValue)*16.676190074;
                tetradrachmabiblicalgreek=(edtValue)*416.90475184;
                didrachmabiblicalgreek=(edtValue)*833.80950368;
                drachmabiblicalgreek=(edtValue)*1667.6190074;
                denariusbiblicalroman=(edtValue)*1472.7025;
                assarionbiblicalroman=(edtValue)*23563.24;
                quadransbiblicalroman=(edtValue)*94252.96;
                leptonbiblicalroman=(edtValue)*188505.92;
                planckmass=(edtValue)*260480478.57;
                electronmass=(edtValue)*6.224242031E+30;
                muonmass=(edtValue)*3.010250167E+28;
                protonmass=(edtValue)*3.389828004E+27;
                neutronmass=(edtValue)*3.385161985E+27;
                deuteronmass=(edtValue)*1.695755582E+27;
                earthmass=(edtValue)*9.48779221E-25;
                sunmass=(edtValue)*2.834952312E-30;
                break;

            case "Stone (UK) - st":
                kilogram=(edtValue)*6.35029318;
                gram=(edtValue)*6350.29318;
                milligram=(edtValue)*6350293.18;
                tonmetric=(edtValue)*0.0063502932;
                pound=(edtValue)*14;
                ounce=(edtValue)*224;
                carat=(edtValue)*31751.4659;
                tonshort=(edtValue)*0.007;
                tonlong=(edtValue)*0.00625;
                atomicmassunit=(edtValue)*3.82423333E+27;
                exagram=(edtValue)*6.350293179E-15;
                petagram=(edtValue)*6.350293179E-12;
                teragram=(edtValue)*6.350293179E-9;
                gigagram=(edtValue)*0.0000063503;
                megagram=(edtValue)*0.0063502932;
                hectogram=(edtValue)*63.5029318;
                dekagram=(edtValue)*635.029318;
                decigram=(edtValue)*63502.9318;
                centigram=(edtValue)*635029.318;
                microgram=(edtValue)*6350293180.0;
                nanogram=(edtValue)*6350293180000.0;
                picogram=(edtValue)*6350293179999988.0;
                femtogram=(edtValue)*6350293179999988000.0;
                attogram=(edtValue)*6.350293179E+21;
                dalton=(edtValue)*3.824256821E+27;
                kilogramforcesquaresecondpermeter=(edtValue)*0.6475496913;
                kilopound=(edtValue)*0.014;
                kip=(edtValue)*0.014;
                slug=(edtValue)*0.4351333024;
                poundforcesquaresecondperfoot=(edtValue)*0.4351333024;
                poundtroy=(edtValue)*17.013888889;
                poundal=(edtValue)*450.8;
                tonus=(edtValue)*217.72431272;
                tonuk=(edtValue)*194.39673;
                kiloton=(edtValue)*0.0000063503;
                quintal=(edtValue)*0.0635029318;
                hundredweightus=(edtValue)*0.14;
                hundredweightuk=(edtValue)*0.125;
                quarterus=(edtValue)*0.56;
                quarteruk=(edtValue)*0.5;
                stoneus=(edtValue)*1.12;
                stoneuk=(edtValue)*1;
                tonne=(edtValue)*0.0063502932;
                pennyweight=(edtValue)*4083.3333333;
                scruple=(edtValue)*4900;
                grain=(edtValue)*98000;
                gamma=(edtValue)*6350293180.0;
                talent=(edtValue)*0.1856810871;
                mina=(edtValue)*11.140865228;
                shekel=(edtValue)*557.0432614;
                bekan=(edtValue)*1114.0865228;
                gerah=(edtValue)*11140.865228;
                talentbiblicalgreek=(edtValue)*0.3112888814;
                minabiblicalgreek=(edtValue)*18.677332882;
                tetradrachmabiblicalgreek=(edtValue)*466.93332206;
                didrachmabiblicalgreek=(edtValue)*933.86664412;
                drachmabiblicalgreek=(edtValue)*1867.7332882;
                denariusbiblicalroman=(edtValue)*1649.4268;
                assarionbiblicalroman=(edtValue)*26390.8288;
                quadransbiblicalroman=(edtValue)*105563.3152;
                leptonbiblicalroman=(edtValue)*211126.6304;
                planckmass=(edtValue)*291738135.99;
                electronmass=(edtValue)*6.971151075E+30;
                muonmass=(edtValue)*3.371480187E+28;
                protonmass=(edtValue)*3.796607364E+27;
                neutronmass=(edtValue)*3.791381423E+27;
                deuteronmass=(edtValue)*1.899246252E+27;
                earthmass=(edtValue)*1.062632727E-24;
                sunmass=(edtValue)*3.175146589E-30;
                break;

            case "Tonne - t":
                kilogram=(edtValue)*1000;
                gram=(edtValue)*1000000;
                milligram=(edtValue)*1000000000;
                tonmetric=(edtValue)*1;
                pound=(edtValue)*2204.6226218;
                ounce=(edtValue)*35273.96195;
                carat=(edtValue)*5000000;
                tonshort=(edtValue)*1.1023113109;
                tonlong=(edtValue)*0.9842065276;
                atomicmassunit=(edtValue)*6.022136651E+29;
                exagram=(edtValue)*1.E-12;
                petagram=(edtValue)*1.E-9;
                teragram=(edtValue)*0.000001;
                gigagram=(edtValue)*0.001;
                megagram=(edtValue)*1;
                hectogram=(edtValue)*10000;
                dekagram=(edtValue)*100000;
                decigram=(edtValue)*10000000.0;
                centigram=(edtValue)*100000000;
                microgram=(edtValue)*1000000000000.0;
                nanogram=(edtValue)*1000000000000000.0;
                picogram=(edtValue)*1000000000000000000.0;
                femtogram=(edtValue)*1.E+21;
                attogram=(edtValue)*1.E+24;
                dalton=(edtValue)*6.022173643E+29;
                kilogramforcesquaresecondpermeter=(edtValue)*101.9716213;
                kilopound=(edtValue)*2.2046226218;
                kip=(edtValue)*2.2046226218;
                slug=(edtValue)*68.521765857;
                poundforcesquaresecondperfoot=(edtValue)*68.521765857;
                poundtroy=(edtValue)*2679.2288807;
                poundal=(edtValue)*70988.848424;
                tonus=(edtValue)*34285.710367;
                tonuk=(edtValue)*30612.244898;
                kiloton=(edtValue)*0.001;
                quintal=(edtValue)*10;
                hundredweightus=(edtValue)*22.046226218;
                hundredweightuk=(edtValue)*19.684130552;
                quarterus=(edtValue)*88.184904874;
                quarteruk=(edtValue)*78.736522209;
                stoneus=(edtValue)*176.36980975;
                stoneuk=(edtValue)*157.47304442;
                tonne=(edtValue)*1;
                pennyweight=(edtValue)*643014.93137;
                scruple=(edtValue)*771617.91764;
                grain=(edtValue)*15432358.353;
                gamma=(edtValue)*1000000000000.0;
                talent=(edtValue)*29.239766082;
                mina=(edtValue)*1754.3859649;
                shekel=(edtValue)*87719.298246;
                bekan=(edtValue)*175438.59649;
                gerah=(edtValue)*1754385.9649;
                talentbiblicalgreek=(edtValue)*49.019607843;
                minabiblicalgreek=(edtValue)*2941.1764706;
                tetradrachmabiblicalgreek=(edtValue)*73529.411765;
                didrachmabiblicalgreek=(edtValue)*147058.82353;
                drachmabiblicalgreek=(edtValue)*294117.64706;
                denariusbiblicalroman=(edtValue)*259740.25974;
                assarionbiblicalroman=(edtValue)*4155844.1558;
                quadransbiblicalroman=(edtValue)*16623376.623;
                leptonbiblicalroman=(edtValue)*33246753.247;
                planckmass=(edtValue)*45940892448.0;
                electronmass=(edtValue)*1.097768382E+33;
                muonmass=(edtValue)*5.309172492E+30;
                protonmass=(edtValue)*5.978633201E+29;
                neutronmass=(edtValue)*5.970403753E+29;
                deuteronmass=(edtValue)*2.990800894E+29;
                earthmass=(edtValue)*1.673360107E-22;
                sunmass=(edtValue)*5.E-28;
                break;

            case "Pennyweight - pwt":
                kilogram=(edtValue)*0.0015551738;
                gram=(edtValue)*1.55517384;
                milligram=(edtValue)*1555.17384;
                tonmetric=(edtValue)*0.0000015552;
                pound=(edtValue)*0.0034285714;
                ounce=(edtValue)*0.0548571429;
                carat=(edtValue)*7.7758692;
                tonshort=(edtValue)*0.0000017143;
                tonlong=(edtValue)*0.0000015306;
                atomicmassunit=(edtValue)*9.365469381E+23;
                exagram=(edtValue)*1.55517384E-18;
                petagram=(edtValue)*1.55517384E-15;
                teragram=(edtValue)*1.55517384E-12;
                gigagram=(edtValue)*1.55517384E-9;
                megagram=(edtValue)*0.0000015552;
                hectogram=(edtValue)*0.0155517384;
                dekagram=(edtValue)*0.155517384;
                decigram=(edtValue)*15.5517384;
                centigram=(edtValue)*155.517384;
                microgram=(edtValue)*1555173.84;
                nanogram=(edtValue)*1555173840.0;
                picogram=(edtValue)*1555173840004.0;
                femtogram=(edtValue)*1555173840004183.0;
                attogram=(edtValue)*1555173840004183300.0;
                dalton=(edtValue)*9.36552691E+23;
                kilogramforcesquaresecondpermeter=(edtValue)*0.0001585836;
                kilopound=(edtValue)*0.0000034286;
                kip=(edtValue)*0.0000034286;
                slug=(edtValue)*0.0001065633;
                poundforcesquaresecondperfoot=(edtValue)*0.0001065633;
                poundtroy=(edtValue)*0.0041666667;
                poundal=(edtValue)*0.1104;
                tonus=(edtValue)*0.0533202398;
                tonuk=(edtValue)*0.0476073624;
                kiloton=(edtValue)*1.55517384E-9;
                quintal=(edtValue)*0.0000155517;
                hundredweightus=(edtValue)*0.0000342857;
                hundredweightuk=(edtValue)*0.0000306122;
                quarterus=(edtValue)*0.0001371429;
                quarteruk=(edtValue)*0.000122449;
                stoneus=(edtValue)*0.0002742857;
                stoneuk=(edtValue)*0.000244898;
                tonne=(edtValue)*0.0000015552;
                pennyweight=(edtValue)*1;
                scruple=(edtValue)*1.2;
                grain=(edtValue)*24;
                gamma=(edtValue)*1555173.84;
                talent=(edtValue)*0.0000454729;
                mina=(edtValue)*0.0027283752;
                shekel=(edtValue)*0.1364187579;
                bekan=(edtValue)*0.2728375158;
                gerah=(edtValue)*2.7283751579;
                talentbiblicalgreek=(edtValue)*0.000076234;
                minabiblicalgreek=(edtValue)*0.0045740407;
                tetradrachmabiblicalgreek=(edtValue)*0.1143510176;
                didrachmabiblicalgreek=(edtValue)*0.2287020353;
                drachmabiblicalgreek=(edtValue)*0.4574040706;
                denariusbiblicalroman=(edtValue)*0.4039412571;
                assarionbiblicalroman=(edtValue)*6.4630601143;
                quadransbiblicalroman=(edtValue)*25.852240457;
                leptonbiblicalroman=(edtValue)*51.704480914;
                planckmass=(edtValue)*71446.074121;
                electronmass=(edtValue)*1.707220671E+27;
                muonmass=(edtValue)*8.256686172E+24;
                protonmass=(edtValue)*9.297813954E+23;
                neutronmass=(edtValue)*9.285015731E+23;
                deuteronmass=(edtValue)*4.651215311E+23;
                earthmass=(edtValue)*2.602365863E-28;
                sunmass=(edtValue)*7.7758692E-34;
                break;


            case "Scruple (apothecary)- s.ap":
                kilogram=(edtValue)*0.0012959782;
                gram=(edtValue)*1.2959782;
                milligram=(edtValue)*1295.9782;
                tonmetric=(edtValue)*0.000001296;
                pound=(edtValue)*0.0028571429;
                ounce=(edtValue)*0.0457142857;
                carat=(edtValue)*6.479891;
                tonshort=(edtValue)*0.0000014286;
                tonlong=(edtValue)*0.0000012755;
                atomicmassunit=(edtValue)*7.804557818E+23;
                exagram=(edtValue)*1.2959782E-18;
                petagram=(edtValue)*1.2959782E-15;
                teragram=(edtValue)*1.2959782E-12;
                gigagram=(edtValue)*1.2959782E-9;
                megagram=(edtValue)*0.000001296;
                hectogram=(edtValue)*0.012959782;
                dekagram=(edtValue)*0.12959782;
                decigram=(edtValue)*12.959782;
                centigram=(edtValue)*129.59782;
                microgram=(edtValue)*1295978.2;
                nanogram=(edtValue)*1295978200;
                picogram=(edtValue)*1295978200003.0;
                femtogram=(edtValue)*1295978200003479.0;
                attogram=(edtValue)*1295978200003479600.0;
                dalton=(edtValue)*7.804605758E+23;
                kilogramforcesquaresecondpermeter=(edtValue)*0.000132153;
                kilopound=(edtValue)*0.0000028571;
                kip=(edtValue)*0.0000028571;
                slug=(edtValue)*0.0000888027;
                poundforcesquaresecondperfoot=(edtValue)*0.0000888027;
                poundtroy=(edtValue)*0.0034722222;
                poundal=(edtValue)*0.092;
                tonus=(edtValue)*0.0444335332;
                tonuk=(edtValue)*0.039672802;
                kiloton=(edtValue)*1.2959782E-9;
                quintal=(edtValue)*0.0000129598;
                hundredweightus=(edtValue)*0.0000285714;
                hundredweightuk=(edtValue)*0.0000255102;
                quarterus=(edtValue)*0.0001142857;
                quarteruk=(edtValue)*0.0001020408;
                stoneus=(edtValue)*0.0002285714;
                stoneuk=(edtValue)*0.0002040816;
                tonne=(edtValue)*0.000001296;
                pennyweight=(edtValue)*0.8333333333;
                scruple=(edtValue)*1;
                grain=(edtValue)*20;
                gamma=(edtValue)*1295978.2;
                talent=(edtValue)*0.0000378941;
                mina=(edtValue)*0.002273646;
                shekel=(edtValue)*0.1136822982;
                bekan=(edtValue)*0.2273645965;
                gerah=(edtValue)*2.2736459649;
                talentbiblicalgreek=(edtValue)*0.0000635283;
                minabiblicalgreek=(edtValue)*0.0038117006;
                tetradrachmabiblicalgreek=(edtValue)*0.0952925147;
                didrachmabiblicalgreek=(edtValue)*0.1905850294;
                drachmabiblicalgreek=(edtValue)*0.3811700588;
                denariusbiblicalroman=(edtValue)*0.3366177143;
                assarionbiblicalroman=(edtValue)*5.3858834286;
                quadransbiblicalroman=(edtValue)*21.543533714;
                leptonbiblicalroman=(edtValue)*43.087067429;
                planckmass=(edtValue)*59538.395101;
                electronmass=(edtValue)*1.422683892E+27;
                muonmass=(edtValue)*6.88057181E+24;
                protonmass=(edtValue)*7.748178295E+23;
                neutronmass=(edtValue)*7.737513109E+23;
                deuteronmass=(edtValue)*3.876012759E+23;
                earthmass=(edtValue)*2.168638219E-28;
                sunmass=(edtValue)*6.479891E-34;
                break;

            case "Grain - gr":
                kilogram=(edtValue)*0.0000647989;
                gram=(edtValue)*0.06479891;
                milligram=(edtValue)*64.79891;
                tonmetric=(edtValue)*6.479891E-8;
                pound=(edtValue)*0.0001428571;
                ounce=(edtValue)*0.0022857143;
                carat=(edtValue)*0.32399455;
                tonshort=(edtValue)*7.142857142E-8;
                tonlong=(edtValue)*6.37755102E-8;
                atomicmassunit=(edtValue)*3.902278909E+22;
                exagram=(edtValue)*6.479891E-20;
                petagram=(edtValue)*6.479891E-17;
                teragram=(edtValue)*6.479891E-14;
                gigagram=(edtValue)*6.479891E-11;
                megagram=(edtValue)*6.479891E-8;
                hectogram=(edtValue)*0.0006479891;
                dekagram=(edtValue)*0.006479891;
                decigram=(edtValue)*0.6479891;
                centigram=(edtValue)*6.479891;
                microgram=(edtValue)*64798.91;
                nanogram=(edtValue)*64798910;
                picogram=(edtValue)*64798910000.0;
                femtogram=(edtValue)*64798910000174.0;
                attogram=(edtValue)*64798910000173970.0;
                dalton=(edtValue)*3.902302879E+22;
                kilogramforcesquaresecondpermeter=(edtValue)*0.0000066076;
                kilopound=(edtValue)*1.428571428E-7;
                kip=(edtValue)*1.428571428E-7;
                slug=(edtValue)*0.0000044401;
                poundforcesquaresecondperfoot=(edtValue)*0.0000044401;
                poundtroy=(edtValue)*0.0001736111;
                poundal=(edtValue)*0.0046;
                tonus=(edtValue)*0.0022216767;
                tonuk=(edtValue)*0.0019836401;
                kiloton=(edtValue)*6.479891E-11;
                quintal=(edtValue)*6.479891E-7;
                hundredweightus=(edtValue)*0.0000014286;
                hundredweightuk=(edtValue)*0.0000012755;
                quarterus=(edtValue)*0.0000057143;
                quarteruk=(edtValue)*0.000005102;
                stoneus=(edtValue)*0.0000114286;
                stoneuk=(edtValue)*0.0000102041;
                tonne=(edtValue)*6.479891E-8;
                pennyweight=(edtValue)*0.0416666667;
                scruple=(edtValue)*0.05;
                grain=(edtValue)*1;
                gamma=(edtValue)*64798.91;
                talent=(edtValue)*0.0000018947;
                mina=(edtValue)*0.0001136823;
                shekel=(edtValue)*0.0056841149;
                bekan=(edtValue)*0.0113682298;
                gerah=(edtValue)*0.1136822982;
                talentbiblicalgreek=(edtValue)*0.0000031764;
                minabiblicalgreek=(edtValue)*0.000190585;
                tetradrachmabiblicalgreek=(edtValue)*0.0047646257;
                didrachmabiblicalgreek=(edtValue)*0.0095292515;
                drachmabiblicalgreek=(edtValue)*0.0190585029;
                denariusbiblicalroman=(edtValue)*0.0168308857;
                assarionbiblicalroman=(edtValue)*0.2692941714;
                quadransbiblicalroman=(edtValue)*1.0771766857;
                leptonbiblicalroman=(edtValue)*2.1543533714;
                planckmass=(edtValue)*2976.9197551;
                electronmass=(edtValue)*7.113419464E+25;
                muonmass=(edtValue)*3.440285905E+23;
                protonmass=(edtValue)*3.874089147E+22;
                neutronmass=(edtValue)*3.868756554E+22;
                deuteronmass=(edtValue)*1.938006379E+22;
                earthmass=(edtValue)*1.084319109E-29;
                sunmass=(edtValue)*3.2399455E-35;
                break;

            case "Gamma - gamma":
                kilogram=(edtValue)*1.E-9;
                gram=(edtValue)*0.000001;
                milligram=(edtValue)*0.001;
                tonmetric=(edtValue)*1.E-12;
                pound=(edtValue)*2.204622621E-9;
                ounce=(edtValue)*3.527396194E-8;
                carat=(edtValue)*0.000005;
                tonshort=(edtValue)*1.10231131E-12;
                tonlong=(edtValue)*9.842065276E-13;
                atomicmassunit=(edtValue)*602213665167520000.0;
                exagram=(edtValue)*1.E-24;
                petagram=(edtValue)*1.E-21;
                teragram=(edtValue)*1.E-18;
                gigagram=(edtValue)*1.E-15;
                megagram=(edtValue)*1.E-12;
                hectogram=(edtValue)*1.E-8;
                dekagram=(edtValue)*1.E-7;
                decigram=(edtValue)*0.00001;
                centigram=(edtValue)*0.0001;
                microgram=(edtValue)*1;
                nanogram=(edtValue)*1000;
                picogram=(edtValue)*1000000;
                femtogram=(edtValue)*1000000000.0;
                attogram=(edtValue)*1000000000000.0;
                dalton=(edtValue)*602217364335000000.0;
                kilogramforcesquaresecondpermeter=(edtValue)*1.019716212E-10;
                kilopound=(edtValue)*2.204622621E-12;
                kip=(edtValue)*2.204622621E-12;
                slug=(edtValue)*6.852176585E-11;
                poundforcesquaresecondperfoot=(edtValue)*6.852176585E-11;
                poundtroy=(edtValue)*2.67922888E-9;
                poundal=(edtValue)*7.098884842E-8;
                tonus=(edtValue)*3.428571036E-8;
                tonuk=(edtValue)*3.061224489E-8;
                kiloton=(edtValue)*1.E-15;
                quintal=(edtValue)*1.E-11;
                hundredweightus=(edtValue)*2.204622621E-11;
                hundredweightuk=(edtValue)*1.968413055E-11;
                quarterus=(edtValue)*8.818490487E-11;
                quarteruk=(edtValue)*7.87365222E-11;
                stoneus=(edtValue)*1.763698097E-10;
                stoneuk=(edtValue)*1.574730444E-10;
                tonne=(edtValue)*1.E-12;
                pennyweight=(edtValue)*6.430149313E-7;
                scruple=(edtValue)*7.716179176E-7;
                grain=(edtValue)*0.0000154324;
                gamma=(edtValue)*1;
                talent=(edtValue)*2.923976608E-11;
                mina=(edtValue)*1.754385964E-9;
                shekel=(edtValue)*8.771929824E-8;
                bekan=(edtValue)*1.754385964E-7;
                gerah=(edtValue)*0.0000017544;
                talentbiblicalgreek=(edtValue)*4.901960784E-11;
                minabiblicalgreek=(edtValue)*2.94117647E-9;
                tetradrachmabiblicalgreek=(edtValue)*7.352941176E-8;
                didrachmabiblicalgreek=(edtValue)*1.470588235E-7;
                drachmabiblicalgreek=(edtValue)*2.94117647E-7;
                denariusbiblicalroman=(edtValue)*2.597402597E-7;
                assarionbiblicalroman=(edtValue)*0.0000041558;
                quadransbiblicalroman=(edtValue)*0.0000166234;
                leptonbiblicalroman=(edtValue)*0.0000332468;
                planckmass=(edtValue)*0.0459408924;
                electronmass=(edtValue)*1.097768382E+21;
                muonmass=(edtValue)*5309172492731301000.0;
                protonmass=(edtValue)*597863320194490000.0;
                neutronmass=(edtValue)*597040375333010000.0;
                deuteronmass=(edtValue)*299080089460840000.0;
                earthmass=(edtValue)*1.673360107E-34;
                sunmass=(edtValue)*5.E-40;
                break;

            case "Talent (Biblical Hebrew) - talent":
                kilogram=(edtValue)*34.2;
                gram=(edtValue)*34200;
                milligram=(edtValue)*34200000;
                tonmetric=(edtValue)*0.0342;
                pound=(edtValue)*75.398093667;
                ounce=(edtValue)*1206.3694987;
                carat=(edtValue)*171000;
                tonshort=(edtValue)*0.0376990468;
                tonlong=(edtValue)*0.0336598632;
                atomicmassunit=(edtValue)*2.059570734E+28;
                exagram=(edtValue)*3.42E-14;
                petagram=(edtValue)*3.42E-11;
                teragram=(edtValue)*3.42E-8;
                gigagram=(edtValue)*0.0000342;
                megagram=(edtValue)*0.0342;
                hectogram=(edtValue)*342;
                dekagram=(edtValue)*3420;
                decigram=(edtValue)*342000;
                centigram=(edtValue)*3420000;
                microgram=(edtValue)*34200000000.0;
                nanogram=(edtValue)*34200000000000.0;
                picogram=(edtValue)*34200000000000404.0;
                femtogram=(edtValue)*34200000000000400000.0;
                attogram=(edtValue)*3.42E+22;
                dalton=(edtValue)*2.059583386E+28;
                kilogramforcesquaresecondpermeter=(edtValue)*3.4874294484;
                kilopound=(edtValue)*0.0753980937;
                kip=(edtValue)*0.0753980937;
                slug=(edtValue)*2.3434443923;
                poundforcesquaresecondperfoot=(edtValue)*2.3434443923;
                poundtroy=(edtValue)*91.629627721;
                poundal=(edtValue)*2427.8186161;
                tonus=(edtValue)*1172.5712946;
                tonuk=(edtValue)*1046.9387755;
                kiloton=(edtValue)*0.0000342;
                quintal=(edtValue)*0.342;
                hundredweightus=(edtValue)*0.7539809367;
                hundredweightuk=(edtValue)*0.6731972649;
                quarterus=(edtValue)*3.0159237467;
                quarteruk=(edtValue)*2.6927890595;
                stoneus=(edtValue)*6.0318474934;
                stoneuk=(edtValue)*5.3855781191;
                tonne=(edtValue)*0.0342;
                pennyweight=(edtValue)*21991.110653;
                scruple=(edtValue)*26389.332783;
                grain=(edtValue)*527786.65567;
                gamma=(edtValue)*34200000000.0;
                talent=(edtValue)*1;
                mina=(edtValue)*60;
                shekel=(edtValue)*3000;
                bekan=(edtValue)*6000;
                gerah=(edtValue)*60000;
                talentbiblicalgreek=(edtValue)*1.6764705882;
                minabiblicalgreek=(edtValue)*100.58823529;
                tetradrachmabiblicalgreek=(edtValue)*2514.7058824;
                didrachmabiblicalgreek=(edtValue)*5029.4117647;
                drachmabiblicalgreek=(edtValue)*10058.823529;
                denariusbiblicalroman=(edtValue)*8883.1168831;
                assarionbiblicalroman=(edtValue)*142129.87013;
                quadransbiblicalroman=(edtValue)*568519.48052;
                leptonbiblicalroman=(edtValue)*1137038.961;
                planckmass=(edtValue)*1571178521.7;
                electronmass=(edtValue)*3.754367869E+31;
                muonmass=(edtValue)*1.815736992E+29;
                protonmass=(edtValue)*2.044692555E+28;
                neutronmass=(edtValue)*2.041878083E+28;
                deuteronmass=(edtValue)*1.022853905E+28;
                earthmass=(edtValue)*5.722891566E-24;
                sunmass=(edtValue)*1.71E-29;
                break;

            case "Mina (Biblical Hebrew) - mina":
                kilogram=(edtValue)*0.57;
                gram=(edtValue)*570;
                milligram=(edtValue)*570000;
                tonmetric=(edtValue)*0.00057;
                pound=(edtValue)*1.2566348945;
                ounce=(edtValue)*20.106158311;
                carat=(edtValue)*2850;
                tonshort=(edtValue)*0.0006283174;
                tonlong=(edtValue)*0.0005609977;
                atomicmassunit=(edtValue)*3.432617891E+26;
                exagram=(edtValue)*5.699999999E-16;
                petagram=(edtValue)*5.699999999E-13;
                teragram=(edtValue)*5.699999999E-10;
                gigagram=(edtValue)*5.699999999E-7;
                megagram=(edtValue)*0.00057;
                hectogram=(edtValue)*5.7;
                dekagram=(edtValue)*57;
                decigram=(edtValue)*5700;
                centigram=(edtValue)*57000;
                microgram=(edtValue)*570000000;
                nanogram=(edtValue)*570000000000.0;
                picogram=(edtValue)*569999999999994.0;
                femtogram=(edtValue)*569999999999993700.0;
                attogram=(edtValue)*569999999999993800000.0;
                dalton=(edtValue)*3.432638976E+26;
                kilogramforcesquaresecondpermeter=(edtValue)*0.0581238241;
                kilopound=(edtValue)*0.0012566349;
                kip=(edtValue)*0.0012566349;
                slug=(edtValue)*0.0390574065;
                poundforcesquaresecondperfoot=(edtValue)*0.0390574065;
                poundtroy=(edtValue)*1.527160462;
                poundal=(edtValue)*40.463643601;
                tonus=(edtValue)*19.542854909;
                tonuk=(edtValue)*17.448979592;
                kiloton=(edtValue)*5.699999999E-7;
                quintal=(edtValue)*0.0057;
                hundredweightus=(edtValue)*0.0125663489;
                hundredweightuk=(edtValue)*0.0112199544;
                quarterus=(edtValue)*0.0502653958;
                quarteruk=(edtValue)*0.0448798177;
                stoneus=(edtValue)*0.1005307916;
                stoneuk=(edtValue)*0.0897596353;
                tonne=(edtValue)*0.00057;
                pennyweight=(edtValue)*366.51851088;
                scruple=(edtValue)*439.82221306;
                grain=(edtValue)*8796.4442612;
                gamma=(edtValue)*570000000.0;
                talent=(edtValue)*0.0166666667;
                mina=(edtValue)*1;
                shekel=(edtValue)*50;
                bekan=(edtValue)*100;
                gerah=(edtValue)*1000;
                talentbiblicalgreek=(edtValue)*0.0279411765;
                minabiblicalgreek=(edtValue)*1.6764705882;
                tetradrachmabiblicalgreek=(edtValue)*41.911764706;
                didrachmabiblicalgreek=(edtValue)*83.823529412;
                drachmabiblicalgreek=(edtValue)*167.64705882;
                denariusbiblicalroman=(edtValue)*148.05194805;
                assarionbiblicalroman=(edtValue)*2368.8311688;
                quadransbiblicalroman=(edtValue)*9475.3246753;
                leptonbiblicalroman=(edtValue)*18950.649351;
                planckmass=(edtValue)*26186308.695;
                electronmass=(edtValue)*6.257279782E+29;
                muonmass=(edtValue)*3.02622832E+27;
                protonmass=(edtValue)*3.407820925E+26;
                neutronmass=(edtValue)*3.403130139E+26;
                deuteronmass=(edtValue)*1.704756509E+26;
                earthmass=(edtValue)*9.53815261E-26;
                sunmass=(edtValue)*2.849999999E-31;
                break;

            case "Shekal (Biblical Hebrew) - shekal":
                kilogram=(edtValue)*0.0114;
                gram=(edtValue)*11.4;
                milligram=(edtValue)*11400;
                tonmetric=(edtValue)*0.0000114;
                pound=(edtValue)*0.0251326979;
                ounce=(edtValue)*0.4021231662;
                carat=(edtValue)*57;
                tonshort=(edtValue)*0.0000125663;
                tonlong=(edtValue)*0.00001122;
                atomicmassunit=(edtValue)*6.865235782E+24;
                exagram=(edtValue)*1.14E-17;
                petagram=(edtValue)*1.14E-14;
                teragram=(edtValue)*1.14E-11;
                gigagram=(edtValue)*1.14E-8;
                megagram=(edtValue)*0.0000114;
                hectogram=(edtValue)*0.114;
                dekagram=(edtValue)*1.14;
                decigram=(edtValue)*114;
                centigram=(edtValue)*1140;
                microgram=(edtValue)*11400000;
                nanogram=(edtValue)*11400000000.0;
                picogram=(edtValue)*11400000000000.0;
                femtogram=(edtValue)*11400000000000004.0;
                attogram=(edtValue)*11400000000000004000.0;
                dalton=(edtValue)*6.865277953E+24;
                kilogramforcesquaresecondpermeter=(edtValue)*0.0011624765;
                kilopound=(edtValue)*0.0000251327;
                kip=(edtValue)*0.0000251327;
                slug=(edtValue)*0.0007811481;
                poundforcesquaresecondperfoot=(edtValue)*0.0007811481;
                poundtroy=(edtValue)*0.0305432092;
                poundal=(edtValue)*0.809272872;
                tonus=(edtValue)*0.3908570982;
                tonuk=(edtValue)*0.3489795918;
                kiloton=(edtValue)*1.14E-8;
                quintal=(edtValue)*0.000114;
                hundredweightus=(edtValue)*0.000251327;
                hundredweightuk=(edtValue)*0.0002243991;
                quarterus=(edtValue)*0.0010053079;
                quarteruk=(edtValue)*0.0008975964;
                stoneus=(edtValue)*0.0020106158;
                stoneuk=(edtValue)*0.0017951927;
                tonne=(edtValue)*0.0000114;
                pennyweight=(edtValue)*7.3303702176;
                scruple=(edtValue)*8.7964442612;
                grain=(edtValue)*175.92888522;
                gamma=(edtValue)*11400000;
                talent=(edtValue)*0.0003333333;
                mina=(edtValue)*0.02;
                shekel=(edtValue)*1;
                bekan=(edtValue)*2;
                gerah=(edtValue)*20;
                talentbiblicalgreek=(edtValue)*0.0005588235;
                minabiblicalgreek=(edtValue)*0.0335294118;
                tetradrachmabiblicalgreek=(edtValue)*0.8382352941;
                didrachmabiblicalgreek=(edtValue)*1.6764705882;
                drachmabiblicalgreek=(edtValue)*3.3529411765;
                denariusbiblicalroman=(edtValue)*2.961038961;
                assarionbiblicalroman=(edtValue)*47.376623377;
                quadransbiblicalroman=(edtValue)*189.50649351;
                leptonbiblicalroman=(edtValue)*379.01298701;
                planckmass=(edtValue)*523726.1739;
                electronmass=(edtValue)*1.251455956E+28;
                muonmass=(edtValue)*6.052456641E+25;
                protonmass=(edtValue)*6.81564185E+24;
                neutronmass=(edtValue)*6.806260278E+24;
                deuteronmass=(edtValue)*3.409513019E+24;
                earthmass=(edtValue)*1.907630522E-27;
                sunmass=(edtValue)*5.7E-33;
                break;

            case "Bekan (Biblical Hebrew) - bekan":
                kilogram=(edtValue)*0.0057;
                gram=(edtValue)*5.7;
                milligram=(edtValue)*5700;
                tonmetric=(edtValue)*0.0000057;
                pound=(edtValue)*0.0125663489;
                ounce=(edtValue)*0.2010615831;
                carat=(edtValue)*28.5;
                tonshort=(edtValue)*0.0000062832;
                tonlong=(edtValue)*0.00000561;
                atomicmassunit=(edtValue)*3.432617891E+24;
                exagram=(edtValue)*5.699999999E-18;
                petagram=(edtValue)*5.699999999E-15;
                teragram=(edtValue)*5.699999999E-12;
                gigagram=(edtValue)*5.699999999E-9;
                megagram=(edtValue)*0.0000057;
                hectogram=(edtValue)*0.057;
                dekagram=(edtValue)*0.57;
                decigram=(edtValue)*57;
                centigram=(edtValue)*570;
                microgram=(edtValue)*5700000;
                nanogram=(edtValue)*5700000000.0;
                picogram=(edtValue)*5700000000000.0;
                femtogram=(edtValue)*5699999999999936.0;
                attogram=(edtValue)*5699999999999937000.0;
                dalton=(edtValue)*3.432638976E+24;
                kilogramforcesquaresecondpermeter=(edtValue)*0.0005812382;
                kilopound=(edtValue)*0.0000125663;
                kip=(edtValue)*0.0000125663;
                slug=(edtValue)*0.0003905741;
                poundforcesquaresecondperfoot=(edtValue)*0.0003905741;
                poundtroy=(edtValue)*0.0152716046;
                poundal=(edtValue)*0.404636436;
                tonus=(edtValue)*0.1954285491;
                tonuk=(edtValue)*0.1744897959;
                kiloton=(edtValue)*5.699999999E-9;
                quintal=(edtValue)*0.000057;
                hundredweightus=(edtValue)*0.0001256635;
                hundredweightuk=(edtValue)*0.0001121995;
                quarterus=(edtValue)*0.000502654;
                quarteruk=(edtValue)*0.0004487982;
                stoneus=(edtValue)*0.0010053079;
                stoneuk=(edtValue)*0.0008975964;
                tonne=(edtValue)*0.0000057;
                pennyweight=(edtValue)*3.6651851088;
                scruple=(edtValue)*4.3982221306;
                grain=(edtValue)*87.964442612;
                gamma=(edtValue)*5700000;
                talent=(edtValue)*0.0001666667;
                mina=(edtValue)*0.01;
                shekel=(edtValue)*0.5;
                bekan=(edtValue)*1;
                gerah=(edtValue)*10;
                talentbiblicalgreek=(edtValue)*0.0002794118;
                minabiblicalgreek=(edtValue)*0.0167647059;
                tetradrachmabiblicalgreek=(edtValue)*0.4191176471;
                didrachmabiblicalgreek=(edtValue)*0.8382352941;
                drachmabiblicalgreek=(edtValue)*1.6764705882;
                denariusbiblicalroman=(edtValue)*1.4805194805;
                assarionbiblicalroman=(edtValue)*23.688311688;
                quadransbiblicalroman=(edtValue)*94.753246753;
                leptonbiblicalroman=(edtValue)*189.50649351;
                planckmass=(edtValue)*261863.08695;
                electronmass=(edtValue)*6.257279782E+27;
                muonmass=(edtValue)*3.02622832E+25;
                protonmass=(edtValue)*3.407820925E+24;
                neutronmass=(edtValue)*3.403130139E+24;
                deuteronmass=(edtValue)*1.704756509E+24;
                earthmass=(edtValue)*9.53815261E-28;
                sunmass=(edtValue)*2.849999999E-33;
                break;

            case "Gereh (Biblical Hebrew) - gereh":
                kilogram=(edtValue)*0.00057;
                gram=(edtValue)*0.57;
                milligram=(edtValue)*570;
                tonmetric=(edtValue)*5.699999999E-7;
                pound=(edtValue)*0.0012566349;
                ounce=(edtValue)*0.0201061583;
                carat=(edtValue)*2.85;
                tonshort=(edtValue)*6.283174472E-7;
                tonlong=(edtValue)*5.609977207E-7;
                atomicmassunit=(edtValue)*3.432617891E+23;
                exagram=(edtValue)*5.699999999E-19;
                petagram=(edtValue)*5.699999999E-16;
                teragram=(edtValue)*5.699999999E-13;
                gigagram=(edtValue)*5.699999999E-10;
                megagram=(edtValue)*5.699999999E-7;
                hectogram=(edtValue)*0.0057;
                dekagram=(edtValue)*0.057;
                decigram=(edtValue)*5.7;
                centigram=(edtValue)*57;
                microgram=(edtValue)*570000;
                nanogram=(edtValue)*570000000.0;
                picogram=(edtValue)*570000000000.0;
                femtogram=(edtValue)*569999999999994.0;
                attogram=(edtValue)*569999999999993700.0;
                dalton=(edtValue)*3.432638976E+23;
                kilogramforcesquaresecondpermeter=(edtValue)*0.0000581238;
                kilopound=(edtValue)*0.0000012566;
                kip=(edtValue)*0.0000012566;
                slug=(edtValue)*0.0000390574;
                poundforcesquaresecondperfoot=(edtValue)*0.0000390574;
                poundtroy=(edtValue)*0.0015271605;
                poundal=(edtValue)*0.0404636436;
                tonus=(edtValue)*0.0195428549;
                tonuk=(edtValue)*0.0174489796;
                kiloton=(edtValue)*5.699999999E-10;
                quintal=(edtValue)*0.0000057;
                hundredweightus=(edtValue)*0.0000125663;
                hundredweightuk=(edtValue)*0.00001122;
                quarterus=(edtValue)*0.0000502654;
                quarteruk=(edtValue)*0.0000448798;
                stoneus=(edtValue)*0.0001005308;
                stoneuk=(edtValue)*0.0000897596;
                tonne=(edtValue)*5.699999999E-7;
                pennyweight=(edtValue)*0.3665185109;
                scruple=(edtValue)*0.4398222131;
                grain=(edtValue)*8.7964442612;
                gamma=(edtValue)*570000;
                talent=(edtValue)*0.0000166667;
                mina=(edtValue)*0.001;
                shekel=(edtValue)*0.05;
                bekan=(edtValue)*0.1;
                gerah=(edtValue)*1;
                talentbiblicalgreek=(edtValue)*0.0000279412;
                minabiblicalgreek=(edtValue)*0.0016764706;
                tetradrachmabiblicalgreek=(edtValue)*0.0419117647;
                didrachmabiblicalgreek=(edtValue)*0.0838235294;
                drachmabiblicalgreek=(edtValue)*0.1676470588;
                denariusbiblicalroman=(edtValue)*0.1480519481;
                assarionbiblicalroman=(edtValue)*2.3688311688;
                quadransbiblicalroman=(edtValue)*9.4753246753;
                leptonbiblicalroman=(edtValue)*18.950649351;
                planckmass=(edtValue)*26186.308695;
                electronmass=(edtValue)*6.257279782E+26;
                muonmass=(edtValue)*3.02622832E+24;
                protonmass=(edtValue)*3.407820925E+23;
                neutronmass=(edtValue)*3.403130139E+23;
                deuteronmass=(edtValue)*1.704756509E+23;
                earthmass=(edtValue)*9.53815261E-29;
                sunmass=(edtValue)*2.849999999E-34;
                break;

            case "Talent (Biblical Greek) - talent":
                kilogram=(edtValue)*20.4;
                gram=(edtValue)*20400;
                milligram=(edtValue)*20400000;
                tonmetric=(edtValue)*0.0204;
                pound=(edtValue)*44.974301486;
                ounce=(edtValue)*719.58882377;
                carat=(edtValue)*102000;
                tonshort=(edtValue)*0.0224871507;
                tonlong=(edtValue)*0.0200778132;
                atomicmassunit=(edtValue)*1.228515876E+28;
                exagram=(edtValue)*2.04E-14;
                petagram=(edtValue)*2.04E-11;
                teragram=(edtValue)*2.04E-8;
                gigagram=(edtValue)*0.0000204;
                megagram=(edtValue)*0.0204;
                hectogram=(edtValue)*204;
                dekagram=(edtValue)*2040;
                decigram=(edtValue)*204000;
                centigram=(edtValue)*2040000;
                microgram=(edtValue)*20400000000.0;
                nanogram=(edtValue)*20400000000000.0;
                picogram=(edtValue)*20400000000000108.0;
                femtogram=(edtValue)*20400000000000106000.0;
                attogram=(edtValue)*2.04E+22;
                dalton=(edtValue)*1.228523423E+28;
                kilogramforcesquaresecondpermeter=(edtValue)*2.0802210745;
                kilopound=(edtValue)*0.0449743015;
                kip=(edtValue)*0.0449743015;
                slug=(edtValue)*1.3978440235;
                poundforcesquaresecondperfoot=(edtValue)*1.3978440235;
                poundtroy=(edtValue)*54.656269167;
                poundal=(edtValue)*1448.1725078;
                tonus=(edtValue)*699.42849149;
                tonuk=(edtValue)*624.48979592;
                kiloton=(edtValue)*0.0000204;
                quintal=(edtValue)*0.204;
                hundredweightus=(edtValue)*0.4497430149;
                hundredweightuk=(edtValue)*0.4015562633;
                quarterus=(edtValue)*1.7989720594;
                quarteruk=(edtValue)*1.6062250531;
                stoneus=(edtValue)*3.5979441189;
                stoneuk=(edtValue)*3.2124501061;
                tonne=(edtValue)*0.0204;
                pennyweight=(edtValue)*13117.5046;
                scruple=(edtValue)*15741.00552;
                grain=(edtValue)*314820.1104;
                gamma=(edtValue)*20400000000.0;
                talent=(edtValue)*0.5964912281;
                mina=(edtValue)*35.789473684;
                shekel=(edtValue)*1789.4736842;
                bekan=(edtValue)*3578.9473684;
                gerah=(edtValue)*35789.473684;
                talentbiblicalgreek=(edtValue)*1;
                minabiblicalgreek=(edtValue)*60;
                tetradrachmabiblicalgreek=(edtValue)*1500;
                didrachmabiblicalgreek=(edtValue)*3000;
                drachmabiblicalgreek=(edtValue)*6000;
                denariusbiblicalroman=(edtValue)*5298.7012987;
                assarionbiblicalroman=(edtValue)*84779.220779;
                quadransbiblicalroman=(edtValue)*339116.88312;
                leptonbiblicalroman=(edtValue)*678233.76623;
                planckmass=(edtValue)*937194205.93;
                electronmass=(edtValue)*2.239447501E+31;
                muonmass=(edtValue)*1.083071188E+29;
                protonmass=(edtValue)*1.219641173E+28;
                neutronmass=(edtValue)*1.217962365E+28;
                deuteronmass=(edtValue)*6.101233825E+27;
                earthmass=(edtValue)*3.413654618E-24;
                sunmass=(edtValue)*1.02E-29;
                break;

            case "Mina (Biblical Greek) - mina ":
                kilogram=(edtValue)*0.34;
                gram=(edtValue)*340;
                milligram=(edtValue)*340000;
                tonmetric=(edtValue)*0.00034;
                pound=(edtValue)*0.7495716914;
                ounce=(edtValue)*11.993147063;
                carat=(edtValue)*1700;
                tonshort=(edtValue)*0.0003747858;
                tonlong=(edtValue)*0.0003346302;
                atomicmassunit=(edtValue)*2.047526461E+26;
                exagram=(edtValue)*3.4E-16;
                petagram=(edtValue)*3.4E-13;
                teragram=(edtValue)*3.4E-10;
                gigagram=(edtValue)*3.4E-7;
                megagram=(edtValue)*0.00034;
                hectogram=(edtValue)*3.4;
                dekagram=(edtValue)*34;
                decigram=(edtValue)*3400;
                centigram=(edtValue)*34000;
                microgram=(edtValue)*340000000.0;
                nanogram=(edtValue)*340000000000.0;
                picogram=(edtValue)*340000000000004.0;
                femtogram=(edtValue)*340000000000004030.0;
                attogram=(edtValue)*340000000000004060000.0;
                dalton=(edtValue)*2.047539038E+26;
                kilogramforcesquaresecondpermeter=(edtValue)*0.0346703512;
                kilopound=(edtValue)*0.0007495717;
                kip=(edtValue)*0.0007495717;
                slug=(edtValue)*0.0232974004;
                poundforcesquaresecondperfoot=(edtValue)*0.0232974004;
                poundtroy=(edtValue)*0.9109378194;
                poundal=(edtValue)*24.136208464;
                tonus=(edtValue)*11.657141525;
                tonuk=(edtValue)*10.408163265;
                kiloton=(edtValue)*3.4E-7;
                quintal=(edtValue)*0.0034;
                hundredweightus=(edtValue)*0.0074957169;
                hundredweightuk=(edtValue)*0.0066926044;
                quarterus=(edtValue)*0.0299828677;
                quarteruk=(edtValue)*0.0267704176;
                stoneus=(edtValue)*0.0599657353;
                stoneuk=(edtValue)*0.0535408351;
                tonne=(edtValue)*0.00034;
                pennyweight=(edtValue)*218.62507667;
                scruple=(edtValue)*262.350092;
                grain=(edtValue)*5247.00184;
                gamma=(edtValue)*340000000.0;
                talent=(edtValue)*0.0099415205;
                mina=(edtValue)*0.5964912281;
                shekel=(edtValue)*29.824561404;
                bekan=(edtValue)*59.649122807;
                gerah=(edtValue)*596.49122807;
                talentbiblicalgreek=(edtValue)*0.0166666667;
                minabiblicalgreek=(edtValue)*1;
                tetradrachmabiblicalgreek=(edtValue)*25;
                didrachmabiblicalgreek=(edtValue)*50;
                drachmabiblicalgreek=(edtValue)*100;
                denariusbiblicalroman=(edtValue)*88.311688312;
                assarionbiblicalroman=(edtValue)*1412.987013;
                quadransbiblicalroman=(edtValue)*5651.9480519;
                leptonbiblicalroman=(edtValue)*11303.896104;
                planckmass=(edtValue)*15619903.432;
                electronmass=(edtValue)*3.732412501E+29;
                muonmass=(edtValue)*1.805118647E+27;
                protonmass=(edtValue)*2.032735288E+26;
                neutronmass=(edtValue)*2.029937276E+26;
                deuteronmass=(edtValue)*1.016872304E+26;
                earthmass=(edtValue)*5.689424364E-26;
                sunmass=(edtValue)*1.7E-31;
                break;


            case "Tetradrachma (Biblical Greek) - tetd":
                kilogram=(edtValue)*0.0136;
                gram=(edtValue)*13.6;
                milligram=(edtValue)*13600;
                tonmetric=(edtValue)*0.0000136;
                pound=(edtValue)*0.0299828677;
                ounce=(edtValue)*0.4797258825;
                carat=(edtValue)*68;
                tonshort=(edtValue)*0.0000149914;
                tonlong=(edtValue)*0.0000133852;
                atomicmassunit=(edtValue)*8.190105846E+24;
                exagram=(edtValue)*1.359999999E-17;
                petagram=(edtValue)*1.359999999E-14;
                teragram=(edtValue)*1.359999999E-11;
                gigagram=(edtValue)*1.359999999E-8;
                megagram=(edtValue)*0.0000136;
                hectogram=(edtValue)*0.136;
                dekagram=(edtValue)*1.36;
                decigram=(edtValue)*136;
                centigram=(edtValue)*1360;
                microgram=(edtValue)*13600000;
                nanogram=(edtValue)*13600000000.0;
                picogram=(edtValue)*13600000000000.0;
                femtogram=(edtValue)*13599999999999978.0;
                attogram=(edtValue)*13599999999999980000.0;
                dalton=(edtValue)*8.190156154E+24;
                kilogramforcesquaresecondpermeter=(edtValue)*0.001386814;
                kilopound=(edtValue)*0.0000299829;
                kip=(edtValue)*0.0000299829;
                slug=(edtValue)*0.000931896;
                poundforcesquaresecondperfoot=(edtValue)*0.000931896;
                poundtroy=(edtValue)*0.0364375128;
                poundal=(edtValue)*0.9654483386;
                tonus=(edtValue)*0.466285661;
                tonuk=(edtValue)*0.4163265306;
                kiloton=(edtValue)*1.359999999E-8;
                quintal=(edtValue)*0.000136;
                hundredweightus=(edtValue)*0.0002998287;
                hundredweightuk=(edtValue)*0.0002677042;
                quarterus=(edtValue)*0.0011993147;
                quarteruk=(edtValue)*0.0010708167;
                stoneus=(edtValue)*0.0023986294;
                stoneuk=(edtValue)*0.0021416334;
                tonne=(edtValue)*0.0000136;
                pennyweight=(edtValue)*8.7450030666;
                scruple=(edtValue)*10.49400368;
                grain=(edtValue)*209.8800736;
                gamma=(edtValue)*13600000;
                talent=(edtValue)*0.0003976608;
                mina=(edtValue)*0.0238596491;
                shekel=(edtValue)*1.1929824561;
                bekan=(edtValue)*2.3859649123;
                gerah=(edtValue)*23.859649123;
                talentbiblicalgreek=(edtValue)*0.0006666667;
                minabiblicalgreek=(edtValue)*0.04;
                tetradrachmabiblicalgreek=(edtValue)*1;
                didrachmabiblicalgreek=(edtValue)*2;
                drachmabiblicalgreek=(edtValue)*4;
                denariusbiblicalroman=(edtValue)*3.5324675325;
                assarionbiblicalroman=(edtValue)*56.519480519;
                quadransbiblicalroman=(edtValue)*226.07792208;
                leptonbiblicalroman=(edtValue)*452.15584416;
                planckmass=(edtValue)*624796.13729;
                electronmass=(edtValue)*1.492965E+28;
                muonmass=(edtValue)*7.22047459E+25;
                protonmass=(edtValue)*8.130941154E+24;
                neutronmass=(edtValue)*8.119749104E+24;
                deuteronmass=(edtValue)*4.067489216E+24;
                earthmass=(edtValue)*2.275769745E-27;
                sunmass=(edtValue)*6.799999999E-33;
                break;

            case "Didrachma (Biblical Greek) - didrachma":
                kilogram=(edtValue)*0.0068;
                gram=(edtValue)*6.8;
                milligram=(edtValue)*6800;
                tonmetric=(edtValue)*0.0000068;
                pound=(edtValue)*0.0149914338;
                ounce=(edtValue)*0.2398629413;
                carat=(edtValue)*34;
                tonshort=(edtValue)*0.0000074957;
                tonlong=(edtValue)*0.0000066926;
                atomicmassunit=(edtValue)*4.095052923E+24;
                exagram=(edtValue)*6.8E-18;
                petagram=(edtValue)*6.8E-15;
                teragram=(edtValue)*6.8E-12;
                gigagram=(edtValue)*6.8E-9;
                megagram=(edtValue)*0.0000068;
                hectogram=(edtValue)*0.068;
                dekagram=(edtValue)*0.68;
                decigram=(edtValue)*68;
                centigram=(edtValue)*680;
                microgram=(edtValue)*6800000;
                nanogram=(edtValue)*6800000000.0;
                picogram=(edtValue)*6800000000000.0;
                femtogram=(edtValue)*6800000000000082.0;
                attogram=(edtValue)*6800000000000083000.0;
                dalton=(edtValue)*4.095078077E+24;
                kilogramforcesquaresecondpermeter=(edtValue)*0.000693407;
                kilopound=(edtValue)*0.0000149914;
                kip=(edtValue)*0.0000149914;
                slug=(edtValue)*0.000465948;
                poundforcesquaresecondperfoot=(edtValue)*0.000465948;
                poundtroy=(edtValue)*0.0182187564;
                poundal=(edtValue)*0.4827241693;
                tonus=(edtValue)*0.2331428305;
                tonuk=(edtValue)*0.2081632653;
                kiloton=(edtValue)*6.8E-9;
                quintal=(edtValue)*0.000068;
                hundredweightus=(edtValue)*0.0001499143;
                hundredweightuk=(edtValue)*0.0001338521;
                quarterus=(edtValue)*0.0005996574;
                quarteruk=(edtValue)*0.0005354084;
                stoneus=(edtValue)*0.0011993147;
                stoneuk=(edtValue)*0.0010708167;
                tonne=(edtValue)*0.0000068;
                pennyweight=(edtValue)*4.3725015333;
                scruple=(edtValue)*5.24700184;
                grain=(edtValue)*104.9400368;
                gamma=(edtValue)*6800000;
                talent=(edtValue)*0.0001988304;
                mina=(edtValue)*0.5964912281;
                shekel=(edtValue)*1.1929824561;
                bekan=(edtValue)*11.929824561;
                gerah=(edtValue)*0.0003333333;
                talentbiblicalgreek=(edtValue)*0.02;
                minabiblicalgreek=(edtValue)*0.5;
                tetradrachmabiblicalgreek=(edtValue)*1;
                didrachmabiblicalgreek=(edtValue)*2;
                drachmabiblicalgreek=(edtValue)*1.7662337662;
                denariusbiblicalroman=(edtValue)*28.25974026;
                assarionbiblicalroman=(edtValue)*113.03896104;
                quadransbiblicalroman=(edtValue)*226.07792208;
                leptonbiblicalroman=(edtValue)*312398.06864;
                planckmass=(edtValue)*7.464825003E+27;
                electronmass=(edtValue)*7.464825003E+27;
                muonmass=(edtValue)*3.610237295E+25;
                protonmass=(edtValue)*4.065470577E+24;
                neutronmass=(edtValue)*4.059874552E+24;
                deuteronmass=(edtValue)*2.033744608E+24;
                earthmass=(edtValue)*1.137884872E-27;
                sunmass=(edtValue)*3.4E-33;
                break;

            case "Drachma (Biblical Greek) - drachma ":
                kilogram=(edtValue)*0.0034;
                gram=(edtValue)*3.4;
                milligram=(edtValue)*3400;
                tonmetric=(edtValue)*0.0000034;
                pound=(edtValue)*0.0074957169;
                ounce=(edtValue)*0.1199314706;
                carat=(edtValue)*17;
                tonshort=(edtValue)*0.0000037479;
                tonlong=(edtValue)*0.0000033463;
                atomicmassunit=(edtValue)*2.047526461E+24;
                exagram=(edtValue)*3.4E-18;
                petagram=(edtValue)*3.4E-15;
                teragram=(edtValue)*3.4E-12;
                gigagram=(edtValue)*3.4E-9;
                megagram=(edtValue)*0.0000034;
                hectogram=(edtValue)*0.034;
                dekagram=(edtValue)*0.34;
                decigram=(edtValue)*34;
                centigram=(edtValue)*340;
                microgram=(edtValue)*3400000;
                nanogram=(edtValue)*3400000000.0;
                picogram=(edtValue)*3400000000000.0;
                femtogram=(edtValue)*3400000000000041.00;
                attogram=(edtValue)*3400000000000041500.0;
                dalton=(edtValue)*2.047539038E+24;
                kilogramforcesquaresecondpermeter=(edtValue)*0.0003467035;
                kilopound=(edtValue)*0.0000074957;
                kip=(edtValue)*0.0000074957;
                slug=(edtValue)*0.000232974;
                poundforcesquaresecondperfoot=(edtValue)*0.000232974;
                poundtroy=(edtValue)*0.0091093782;
                poundal=(edtValue)*0.2413620846;
                tonus=(edtValue)*0.1165714152;
                tonuk=(edtValue)*0.1040816327;
                kiloton=(edtValue)*3.4E-9;
                quintal=(edtValue)*0.000034;
                hundredweightus=(edtValue)*0.0000749572;
                hundredweightuk=(edtValue)*0.000066926;
                quarterus=(edtValue)*0.0002998287;
                quarteruk=(edtValue)*0.0002677042;
                stoneus=(edtValue)*0.0005996574;
                stoneuk=(edtValue)*0.0005354084;
                tonne=(edtValue)*0.0000034;
                pennyweight=(edtValue)*2.1862507667;
                scruple=(edtValue)*2.62350092;
                grain=(edtValue)*52.4700184;
                gamma=(edtValue)*3400000;
                talent=(edtValue)*0.0000994152;
                mina=(edtValue)*0.0059649123;
                shekel=(edtValue)*0.298245614;
                bekan=(edtValue)*0.5964912281;
                gerah=(edtValue)*5.9649122807;
                talentbiblicalgreek=(edtValue)*0.0001666667;
                minabiblicalgreek=(edtValue)*0.01;
                tetradrachmabiblicalgreek=(edtValue)*0.25;
                didrachmabiblicalgreek=(edtValue)*0.5;
                drachmabiblicalgreek=(edtValue)*1;
                denariusbiblicalroman=(edtValue)*0.8831168831;
                assarionbiblicalroman=(edtValue)*14.12987013;
                quadransbiblicalroman=(edtValue)*56.519480519;
                leptonbiblicalroman=(edtValue)*113.03896104;
                planckmass=(edtValue)*156199.03432;
                electronmass=(edtValue)*3.732412501E+27;
                muonmass=(edtValue)*1.805118647E+25;
                protonmass=(edtValue)*2.032735288E+24;
                neutronmass=(edtValue)*2.029937276E+24;
                deuteronmass=(edtValue)*1.016872304E+24;
                earthmass=(edtValue)*5.689424364E-28;
                sunmass=(edtValue)*1.7E-33;
                break;

            case "Denarius (Biblical Roman) - denarius":
                kilogram=(edtValue)*0.00385;
                gram=(edtValue)*3.85;
                milligram=(edtValue)*3850;
                tonmetric=(edtValue)*0.00000385;
                pound=(edtValue)*0.0084877971;
                ounce=(edtValue)*0.1358047535;
                carat=(edtValue)*19.25;
                tonshort=(edtValue)*0.0000042439;
                tonlong=(edtValue)*0.0000037892;
                atomicmassunit=(edtValue)*2.31852261E+24;
                exagram=(edtValue)*3.849999999E-18;
                petagram=(edtValue)*3.849999999E-15;
                teragram=(edtValue)*3.849999999E-12;
                gigagram=(edtValue)*3.849999999E-9;
                megagram=(edtValue)*0.00000385;
                hectogram=(edtValue)*0.0385;
                dekagram=(edtValue)*0.385;
                decigram=(edtValue)*38.5;
                centigram=(edtValue)*385;
                microgram=(edtValue)*3850000;
                nanogram=(edtValue)*3850000000.0;
                picogram=(edtValue)*3850000000000.0;
                femtogram=(edtValue)*3849999999999996.0;
                attogram=(edtValue)*3849999999999996400.0;
                dalton=(edtValue)*2.318536852E+24;
                kilogramforcesquaresecondpermeter=(edtValue)*0.0003925907;
                kilopound=(edtValue)*0.0000084878;
                kip=(edtValue)*0.0000084878;
                slug=(edtValue)*0.0002638088;
                poundforcesquaresecondperfoot=(edtValue)*0.0002638088;
                poundtroy=(edtValue)*0.0103150312;
                poundal=(edtValue)*0.2733070664;
                tonus=(edtValue)*0.1319999849;
                tonuk=(edtValue)*0.1178571429;
                kiloton=(edtValue)*3.849999999E-9;
                quintal=(edtValue)*0.0000385;
                hundredweightus=(edtValue)*0.000084878;
                hundredweightuk=(edtValue)*0.0000757839;
                quarterus=(edtValue)*0.0003395119;
                quarteruk=(edtValue)*0.0003031356;
                stoneus=(edtValue)*0.0006790238;
                stoneuk=(edtValue)*0.0006062712;
                tonne=(edtValue)*0.00000385;
                pennyweight=(edtValue)*2.4756074858;
                scruple=(edtValue)*2.9707289829;
                grain=(edtValue)*59.414579659;
                gamma=(edtValue)*3850000;
                talent=(edtValue)*0.0001125731;
                mina=(edtValue)*0.006754386;
                shekel=(edtValue)*0.3377192982;
                bekan=(edtValue)*0.6754385965;
                gerah=(edtValue)*6.7543859649;
                talentbiblicalgreek=(edtValue)*0.0001887255;
                minabiblicalgreek=(edtValue)*0.0113235294;
                tetradrachmabiblicalgreek=(edtValue)*0.2830882353;
                didrachmabiblicalgreek=(edtValue)*0.5661764706;
                drachmabiblicalgreek=(edtValue)*1.1323529412;
                denariusbiblicalroman=(edtValue)*1;
                assarionbiblicalroman=(edtValue)*16;
                quadransbiblicalroman=(edtValue)*64;
                leptonbiblicalroman=(edtValue)*128;
                planckmass=(edtValue)*176872.43592;
                electronmass=(edtValue)*4.226408274E+27;
                muonmass=(edtValue)*2.044031409E+25;
                protonmass=(edtValue)*2.301773782E+24;
                neutronmass=(edtValue)*2.298605445E+24;
                deuteronmass=(edtValue)*1.151458344E+24;
                earthmass=(edtValue)*6.442436412E-28;
                sunmass=(edtValue)*1.924999999E-33;
                break;

            case "Assarion (Biblical Roman) - assarion":
                kilogram=(edtValue)*0.000240625;
                gram=(edtValue)*0.240625;
                milligram=(edtValue)*240.625;
                tonmetric=(edtValue)*2.406249999E-7;
                pound=(edtValue)*0.0005304873;
                ounce=(edtValue)*0.0084877971;
                carat=(edtValue)*1.203125;
                tonshort=(edtValue)*2.652436591E-7;
                tonlong=(edtValue)*2.368246957E-7;
                atomicmassunit=(edtValue)*1.449076631E+23;
                exagram=(edtValue)*2.406249999E-19;
                petagram=(edtValue)*2.406249999E-16;
                teragram=(edtValue)*2.406249999E-13;
                gigagram=(edtValue)*2.406249999E-10;
                megagram=(edtValue)*2.406249999E-7;
                hectogram=(edtValue)*0.00240625;
                dekagram=(edtValue)*0.0240625;
                decigram=(edtValue)*2.40625;
                centigram=(edtValue)*24.0625;
                microgram=(edtValue)*240625;
                nanogram=(edtValue)*240625000;
                picogram=(edtValue)*240625000000.0;
                femtogram=(edtValue)*240624999999997.0;
                attogram=(edtValue)*240624999999997470.0;
                dalton=(edtValue)*1.449085532E+23;
                kilogramforcesquaresecondpermeter=(edtValue)*0.0000245369;
                kilopound=(edtValue)*5.304873183E-7;
                kip=(edtValue)*5.304873183E-7;
                slug=(edtValue)*0.000016488;
                poundforcesquaresecondperfoot=(edtValue)*0.000016488;
                poundtroy=(edtValue)*0.0006446894;
                poundal=(edtValue)*0.0170816917;
                tonus=(edtValue)*0.0082499991;
                tonuk=(edtValue)*0.0073660714;
                kiloton=(edtValue)*2.406249999E-10;
                quintal=(edtValue)*0.0000024062;
                hundredweightus=(edtValue)*0.0000053049;
                hundredweightuk=(edtValue)*0.0000047365;
                quarterus=(edtValue)*0.0000212195;
                quarteruk=(edtValue)*0.000018946;
                stoneus=(edtValue)*0.000042439;
                stoneuk=(edtValue)*0.000037892;
                tonne=(edtValue)*2.406249999E-7;
                pennyweight=(edtValue)*0.1547254679;
                scruple=(edtValue)*0.1856705614;
                grain=(edtValue)*3.7134112287;
                gamma=(edtValue)*240625;
                talent=(edtValue)*0.0000070358;
                mina=(edtValue)*0.0004221491;
                shekel=(edtValue)*0.0211074561;
                bekan=(edtValue)*0.0422149123;
                gerah=(edtValue)*0.4221491228;
                talentbiblicalgreek=(edtValue)*0.0000117953;
                minabiblicalgreek=(edtValue)*0.0007077206;
                tetradrachmabiblicalgreek=(edtValue)*0.0176930147;
                didrachmabiblicalgreek=(edtValue)*0.0353860294;
                drachmabiblicalgreek=(edtValue)*0.0707720588;
                denariusbiblicalroman=(edtValue)*0.0625;
                assarionbiblicalroman=(edtValue)*1;
                quadransbiblicalroman=(edtValue)*4;
                leptonbiblicalroman=(edtValue)*8;
                planckmass=(edtValue)*11054.527245;
                electronmass=(edtValue)*2.641505171E+26;
                muonmass=(edtValue)*1.277519631E+24;
                protonmass=(edtValue)*1.438608614E+23;
                neutronmass=(edtValue)*1.436628403E+23;
                deuteronmass=(edtValue)*7.196614652E+22;
                earthmass=(edtValue)*4.026522757E-29;
                sunmass=(edtValue)*1.203124999E-34;
                break;


            case "Auadrans (Biblical Roman) -  quadranns":
                kilogram=(edtValue)*0.0000601562;
                gram=(edtValue)*0.06015625;
                milligram=(edtValue)*60.15625;
                tonmetric=(edtValue)*6.015624999E-8;
                pound=(edtValue)*0.0001326218;
                ounce=(edtValue)*0.0021219493;
                carat=(edtValue)*0.30078125;
                tonshort=(edtValue)*6.631091479E-8;
                tonlong=(edtValue)*5.920617392E-8;
                atomicmassunit=(edtValue)*3.622691579E+22;
                exagram=(edtValue)*6.015624999E-20;
                petagram=(edtValue)*6.015624999E-17;
                teragram=(edtValue)*6.015624999E-14;
                gigagram=(edtValue)*6.015624999E-11;
                megagram=(edtValue)*6.015624999E-8;
                hectogram=(edtValue)*0.0006015625;
                dekagram=(edtValue)*0.006015625;
                decigram=(edtValue)*0.6015625;
                centigram=(edtValue)*6.015625;
                microgram=(edtValue)*60156.25;
                nanogram=(edtValue)*60156250;
                picogram=(edtValue)*60156250000.0;
                femtogram=(edtValue)*60156249999999.0;
                attogram=(edtValue)*60156249999998640.0;
                dalton=(edtValue)*3.622713832E+22;
                kilogramforcesquaresecondpermeter=(edtValue)*0.0000061342;
                kilopound=(edtValue)*1.326218295E-7;
                kip=(edtValue)*1.326218295E-7;
                slug=(edtValue)*0.000004122;
                poundforcesquaresecondperfoot=(edtValue)*0.000004122;
                poundtroy=(edtValue)*0.0001611724;
                poundal=(edtValue)*0.0042704229;
                tonus=(edtValue)*0.0020624998;
                tonuk=(edtValue)*0.0018415179;
                kiloton=(edtValue)*6.015624999E-11;
                quintal=(edtValue)*6.015624999E-7;
                hundredweightus=(edtValue)*0.0000013262;
                hundredweightuk=(edtValue)*0.0000011841;
                quarterus=(edtValue)*0.0000053049;
                quarteruk=(edtValue)*0.0000047365;
                stoneus=(edtValue)*0.0000106097;
                stoneuk=(edtValue)*0.000009473;
                tonne=(edtValue)*6.015624999E-8;
                pennyweight=(edtValue)*0.038681367;
                scruple=(edtValue)*0.0464176404;
                grain=(edtValue)*0.9283528072;
                gamma=(edtValue)*60156.25;
                talent=(edtValue)*0.000001759;
                mina=(edtValue)*0.0001055373;
                shekel=(edtValue)*0.005276864;
                bekan=(edtValue)*0.0105537281;
                gerah=(edtValue)*0.1055372807;
                talentbiblicalgreek=(edtValue)*0.0000029488;
                minabiblicalgreek=(edtValue)*0.0001769301;
                tetradrachmabiblicalgreek=(edtValue)*0.0044232537;
                didrachmabiblicalgreek=(edtValue)*0.0088465074;
                drachmabiblicalgreek=(edtValue)*0.0176930147;
                denariusbiblicalroman=(edtValue)*0.015625;
                assarionbiblicalroman=(edtValue)*0.25;
                quadransbiblicalroman=(edtValue)*1;
                leptonbiblicalroman=(edtValue)*2;
                planckmass=(edtValue)*2763.6318113;
                electronmass=(edtValue)*6.603762928E+25;
                muonmass=(edtValue)*3.193799077E+23;
                protonmass=(edtValue)*3.596521535E+22;
                neutronmass=(edtValue)*3.591571007E+22;
                deuteronmass=(edtValue)*1.799153663E+22;
                earthmass=(edtValue)*1.006630689E-29;
                sunmass=(edtValue)*3.007812499E-35;
                break;

            case "Lepton (Biblical Roman) - lepton":
                kilogram=(edtValue)*0.0000300781;
                gram=(edtValue)*0.030078125;
                milligram=(edtValue)*30.078125;
                tonmetric=(edtValue)*3.0078125E-8;
                pound=(edtValue)*0.0000663109;
                ounce=(edtValue)*0.0010609746;
                carat=(edtValue)*0.150390625;
                tonshort=(edtValue)*3.315545739E-8;
                tonlong=(edtValue)*2.960308696E-8;
                atomicmassunit=(edtValue)*1.811345789E+22;
                exagram=(edtValue)*3.0078125E-20;
                petagram=(edtValue)*3.0078125E-17;
                teragram=(edtValue)*3.0078125E-14;
                gigagram=(edtValue)*3.0078125E-11;
                megagram=(edtValue)*3.0078125E-8;
                hectogram=(edtValue)*0.0003007813;
                dekagram=(edtValue)*0.0030078125;
                decigram=(edtValue)*0.30078125;
                centigram=(edtValue)*3.0078125;
                microgram=(edtValue)*30078.125;
                nanogram=(edtValue)*30078125;
                picogram=(edtValue)*30078125000.0;
                femtogram=(edtValue)*30078125000000.0;
                attogram=(edtValue)*30078125000000224.0;
                dalton=(edtValue)*1.811356916E+22;
                kilogramforcesquaresecondpermeter=(edtValue)*0.0000030671;
                kilopound=(edtValue)*6.631091479E-8;
                kip=(edtValue)*6.631091479E-8;
                slug=(edtValue)*0.000002061;
                poundforcesquaresecondperfoot=(edtValue)*0.000002061;
                poundtroy=(edtValue)*0.0000805862;
                poundal=(edtValue)*0.0021352115;
                tonus=(edtValue)*0.0010312499;
                tonuk=(edtValue)*0.0009207589;
                kiloton=(edtValue)*3.0078125E-11;
                quintal=(edtValue)*3.0078125E-7;
                hundredweightus=(edtValue)*6.631091479E-7;
                hundredweightuk=(edtValue)*5.920617392E-7;
                quarterus=(edtValue)*0.0000026524;
                quarteruk=(edtValue)*0.0000023682;
                stoneus=(edtValue)*0.0000053049;
                stoneuk=(edtValue)*0.0000047365;
                tonne=(edtValue)*3.0078125E-8;
                pennyweight=(edtValue)*0.0193406835;
                scruple=(edtValue)*0.0232088202;
                grain=(edtValue)*0.4641764036;
                gamma=(edtValue)*30078.125;
                talent=(edtValue)*8.794773391E-7;
                mina=(edtValue)*0.0000527686;
                shekel=(edtValue)*0.002638432;
                bekan=(edtValue)*0.005276864;
                gerah=(edtValue)*0.0527686404;
                talentbiblicalgreek=(edtValue)*0.0000014744;
                minabiblicalgreek=(edtValue)*0.0000884651;
                tetradrachmabiblicalgreek=(edtValue)*0.0022116268;
                didrachmabiblicalgreek=(edtValue)*0.0044232537;
                drachmabiblicalgreek=(edtValue)*0.0088465074;
                denariusbiblicalroman=(edtValue)*0.0078125;
                assarionbiblicalroman=(edtValue)*0.125;
                quadransbiblicalroman=(edtValue)*0.5;
                leptonbiblicalroman=(edtValue)*1;
                planckmass=(edtValue)*1381.8159057;
                electronmass=(edtValue)*3.301881464E+25;
                muonmass=(edtValue)*1.596899538E+23;
                protonmass=(edtValue)*1.798260767E+22;
                neutronmass=(edtValue)*1.795785503E+22;
                deuteronmass=(edtValue)*8.995768315E+21;
                earthmass=(edtValue)*5.033153447E-30;
                sunmass=(edtValue)*1.50390625E-35;
                break;

            case "Planck mass - Planck mass":
                kilogram=(edtValue)*2.176709999E-8;
                gram=(edtValue)*0.0000217671;
                milligram=(edtValue)*0.0217671;
                tonmetric=(edtValue)*2.176709999E-11;
                pound=(edtValue)*4.798824107E-8;
                ounce=(edtValue)*7.678118571E-7;
                carat=(edtValue)*0.0001088355;
                tonshort=(edtValue)*2.399412053E-11;
                tonlong=(edtValue)*2.14233219E-11;
                atomicmassunit=(edtValue)*13108445071067836000.0;
                exagram=(edtValue)*2.176709999E-23;
                petagram=(edtValue)*2.176709999E-20;
                teragram=(edtValue)*2.176709999E-17;
                gigagram=(edtValue)*2.176709999E-14;
                megagram=(edtValue)*2.176709999E-11;
                hectogram=(edtValue)*2.176709999E-7;
                dekagram=(edtValue)*0.0000021767;
                decigram=(edtValue)*0.000217671;
                centigram=(edtValue)*0.00217671;
                microgram=(edtValue)*21.7671;
                nanogram=(edtValue)*21767.1;
                picogram=(edtValue)*21767100;
                femtogram=(edtValue)*21767100000.0;
                attogram=(edtValue)*21767100000000.0;
                dalton=(edtValue)*13108525591216290000.0;
                kilogramforcesquaresecondpermeter=(edtValue)*2.219626477E-9;
                kilopound=(edtValue)*4.798824107E-11;
                kip=(edtValue)*4.798824107E-11;
                slug=(edtValue)*1.491520129E-9;
                poundforcesquaresecondperfoot=(edtValue)*1.491520129E-9;
                poundtroy=(edtValue)*5.831904296E-8;
                poundal=(edtValue)*0.0000015452;
                tonus=(edtValue)*7.463004861E-7;
                tonuk=(edtValue)*6.663397959E-7;
                kiloton=(edtValue)*2.176709999E-14;
                quintal=(edtValue)*2.176709999E-10;
                hundredweightus=(edtValue)*4.798824107E-10;
                hundredweightuk=(edtValue)*4.284664381E-10;
                quarterus=(edtValue)*1.919529642E-9;
                quarteruk=(edtValue)*1.713865752E-9;
                stoneus=(edtValue)*3.839059285E-9;
                stoneuk=(edtValue)*3.427731505E-9;
                tonne=(edtValue)*2.176709999E-11;
                pennyweight=(edtValue)*0.0000139966;
                scruple=(edtValue)*0.0000167959;
                grain=(edtValue)*0.0003359177;
                gamma=(edtValue)*21.7671;
                talent=(edtValue)*6.364649122E-10;
                mina=(edtValue)*3.818789473E-8;
                shekel=(edtValue)*0.0000019094;
                bekan=(edtValue)*0.0000038188;
                gerah=(edtValue)*0.0000381879;
                talentbiblicalgreek=(edtValue)*1.067014705E-9;
                minabiblicalgreek=(edtValue)*6.402088235E-8;
                tetradrachmabiblicalgreek=(edtValue)*0.0000016005;
                didrachmabiblicalgreek=(edtValue)*0.000003201;
                drachmabiblicalgreek=(edtValue)*0.0000064021;
                denariusbiblicalroman=(edtValue)*0.0000056538;
                assarionbiblicalroman=(edtValue)*0.0000904607;
                quadransbiblicalroman=(edtValue)*0.0003618427;
                leptonbiblicalroman=(edtValue)*0.0007236854;
                planckmass=(edtValue)*1;
                electronmass=(edtValue)*2.389523416E+22;
                muonmass=(edtValue)*115565288566530700000.0;
                protonmass=(edtValue)*13013750677005396000.0;
                neutronmass=(edtValue)*12995837553911075000.0;
                deuteronmass=(edtValue)*6510106215303006000.0;
                earthmass=(edtValue)*3.642419678E-33;
                sunmass=(edtValue)*1.088354999E-38;
                break;

            case "Electron mass (rest) -  e-":
                kilogram=(edtValue)*9.109389699E-31;
                gram=(edtValue)*9.109389699E-28;
                milligram=(edtValue)*9.109389699E-25;
                tonmetric=(edtValue)*9.109389699E-34;
                pound=(edtValue)*2.00827666E-30;
                ounce=(edtValue)*3.213242656E-29;
                carat=(edtValue)*4.554694849E-27;
                tonshort=(edtValue)*1.00413833E-33;
                tonlong=(edtValue)*8.965520805E-34;
                atomicmassunit=(edtValue)*0.0005485799;
                exagram=(edtValue)*9.109389699E-46;
                petagram=(edtValue)*9.109389699E-43;
                teragram=(edtValue)*9.109389699E-40;
                gigagram=(edtValue)*9.109389699E-37;
                megagram=(edtValue)*9.109389699E-34;
                hectogram=(edtValue)*9.109389699E-30;
                dekagram=(edtValue)*9.109389699E-29;
                decigram=(edtValue)*9.109389699E-27;
                centigram=(edtValue)*9.109389699E-26;
                microgram=(edtValue)*9.109389699E-22;
                nanogram=(edtValue)*9.109389699E-19;
                picogram=(edtValue)*9.109389699E-16;
                femtogram=(edtValue)*9.109389699E-13;
                attogram=(edtValue)*9.109389699E-10;
                dalton=(edtValue)*0.0005485833;
                kilogramforcesquaresecondpermeter=(edtValue)*9.288992367E-32;
                kilopound=(edtValue)*2.00827666E-33;
                kip=(edtValue)*2.00827666E-33;
                slug=(edtValue)*6.241914681E-32;
                poundforcesquaresecondperfoot=(edtValue)*6.241914681E-32;
                poundtroy=(edtValue)*2.440613996E-30;
                poundal=(edtValue)*6.466650846E-29;
                tonus=(edtValue)*3.123218968E-29;
                tonuk=(edtValue)*2.788588683E-29;
                kiloton=(edtValue)*9.109389699E-37;
                quintal=(edtValue)*9.109389699E-33;
                hundredweightus=(edtValue)*2.00827666E-32;
                hundredweightuk=(edtValue)*1.793104161E-32;
                quarterus=(edtValue)*8.033106641E-32;
                quarteruk=(edtValue)*7.172416644E-32;
                stoneus=(edtValue)*1.606621328E-31;
                stoneuk=(edtValue)*1.434483328E-31;
                tonne=(edtValue)*9.109389699E-34;
                pennyweight=(edtValue)*5.857473592E-28;
                scruple=(edtValue)*7.028968311E-28;
                grain=(edtValue)*1.405793662E-26;
                gamma=(edtValue)*9.109389699E-22;
                talent=(edtValue)*2.663564239E-32;
                mina=(edtValue)*1.598138543E-30;
                shekel=(edtValue)*7.990692719E-29;
                bekan=(edtValue)*1.598138543E-28;
                gerah=(edtValue)*1.598138543E-27;
                talentbiblicalgreek=(edtValue)*4.465387107E-32;
                minabiblicalgreek=(edtValue)*2.679232264E-30;
                tetradrachmabiblicalgreek=(edtValue)*6.698080661E-29;
                didrachmabiblicalgreek=(edtValue)*1.339616132E-28;
                drachmabiblicalgreek=(edtValue)*2.679232264E-28;
                denariusbiblicalroman=(edtValue)*2.366075246E-28;
                assarionbiblicalroman=(edtValue)*3.785720394E-27;
                quadransbiblicalroman=(edtValue)*1.514288157E-26;
                leptonbiblicalroman=(edtValue)*3.028576315E-26;
                planckmass=(edtValue)*4.184934924E-23;
                electronmass=(edtValue)*1;
                muonmass=(edtValue)*0.0048363321;
                protonmass=(edtValue)*0.0005438673;
                neutronmass=(edtValue)*0.0005438673;
                deuteronmass=(edtValue)*0.0002724437;
                earthmass=(edtValue)*1.524328932E-55;
                sunmass=(edtValue)*4.554694849E-61;
                break;

            case "Muon mass - M":
                kilogram=(edtValue)*1.8835327E-28;
                gram=(edtValue)*1.8835327E-25;
                milligram=(edtValue)*1.8835327E-22;
                tonmetric=(edtValue)*1.8835327E-31;
                pound=(edtValue)*4.152478799E-28;
                ounce=(edtValue)*6.643966079E-27;
                carat=(edtValue)*9.4176635E-25;
                tonshort=(edtValue)*2.076239399E-31;
                tonlong=(edtValue)*1.853785178E-31;
                atomicmassunit=(edtValue)*0.1134289131;
                exagram=(edtValue)*1.8835327E-43;
                petagram=(edtValue)*1.8835327E-40;
                teragram=(edtValue)*1.8835327E-37;
                gigagram=(edtValue)*1.8835327E-34;
                megagram=(edtValue)*1.8835327E-31;
                hectogram=(edtValue)*1.8835327E-27;
                dekagram=(edtValue)*1.8835327E-26;
                decigram=(edtValue)*1.8835327E-24;
                centigram=(edtValue)*1.8835327E-23;
                microgram=(edtValue)*1.8835327E-19;
                nanogram=(edtValue)*1.8835327E-16;
                picogram=(edtValue)*1.8835327E-13;
                femtogram=(edtValue)*1.8835327E-10;
                attogram=(edtValue)*1.8835327E-7;
                dalton=(edtValue)*0.1134296098;
                kilogramforcesquaresecondpermeter=(edtValue)*1.920668831E-29;
                kilopound=(edtValue)*4.152478799E-31;
                kip=(edtValue)*4.152478799E-31;
                slug=(edtValue)*1.290629866E-29;
                poundforcesquaresecondperfoot=(edtValue)*1.290629866E-29;
                poundtroy=(edtValue)*5.046415207E-28;
                poundal=(edtValue)*1.337098173E-26;
                tonus=(edtValue)*6.457825661E-27;
                tonuk=(edtValue)*5.765916428E-27;
                kiloton=(edtValue)*1.8835327E-34;
                quintal=(edtValue)*1.8835327E-30;
                hundredweightus=(edtValue)*4.152478799E-30;
                hundredweightuk=(edtValue)*3.707570356E-30;
                quarterus=(edtValue)*1.660991519E-29;
                quarteruk=(edtValue)*1.483028142E-29;
                stoneus=(edtValue)*3.321983039E-29;
                stoneuk=(edtValue)*2.966056285E-29;
                tonne=(edtValue)*1.8835327E-31;
                pennyweight=(edtValue)*1.211139649E-25;
                scruple=(edtValue)*1.453367579E-25;
                grain=(edtValue)*2.906735159E-24;
                gamma=(edtValue)*1.8835327E-19;
                talent=(edtValue)*5.507405555E-30;
                mina=(edtValue)*3.304443333E-28;
                shekel=(edtValue)*1.652221666E-26;
                bekan=(edtValue)*3.304443333E-26;
                gerah=(edtValue)*3.304443333E-25;
                talentbiblicalgreek=(edtValue)*9.233003431E-30;
                minabiblicalgreek=(edtValue)*5.539802058E-28;
                tetradrachmabiblicalgreek=(edtValue)*1.384950514E-26;
                didrachmabiblicalgreek=(edtValue)*2.769901029E-26;
                drachmabiblicalgreek=(edtValue)*5.539802058E-26;
                denariusbiblicalroman=(edtValue)*4.892292727E-26;
                assarionbiblicalroman=(edtValue)*7.827668363E-25;
                quadransbiblicalroman=(edtValue)*3.131067345E-24;
                leptonbiblicalroman=(edtValue)*6.26213469E-24;
                planckmass=(edtValue)*8.653117319E-21;
                electronmass=(edtValue)*206.76826462;
                muonmass=(edtValue)*1;
                protonmass=(edtValue)*0.1126095114;
                neutronmass=(edtValue)*0.112454507;
                deuteronmass=(edtValue)*0.0563327128;
                earthmass=(edtValue)*3.15182848E-53;
                sunmass=(edtValue)*9.4176635E-59;
                break;

            case "Proton mass - p":
                kilogram=(edtValue)*1.672623099E-27;
                gram=(edtValue)*1.672623099E-24;
                milligram=(edtValue)*1.672623099E-21;
                tonmetric=(edtValue)*1.672623099E-30;
                pound=(edtValue)*3.687502724E-27;
                ounce=(edtValue)*5.900004358E-26;
                carat=(edtValue)*8.363115499E-24;
                tonshort=(edtValue)*1.843751362E-30;
                tonlong=(edtValue)*1.646206573E-30;
                atomicmassunit=(edtValue)*1.0072764875;
                exagram=(edtValue)*1.672623099E-42;
                petagram=(edtValue)*1.672623099E-39;
                teragram=(edtValue)*1.672623099E-36;
                gigagram=(edtValue)*1.672623099E-33;
                megagram=(edtValue)*1.672623099E-30;
                hectogram=(edtValue)*1.672623099E-26;
                dekagram=(edtValue)*1.672623099E-25;
                decigram=(edtValue)*1.672623099E-23;
                centigram=(edtValue)*1.672623099E-22;
                microgram=(edtValue)*1.672623099E-18;
                nanogram=(edtValue)*1.672623099E-15;
                picogram=(edtValue)*1.672623099E-12;
                femtogram=(edtValue)*1.672623099E-9;
                attogram=(edtValue)*0.0000016726;
                dalton=(edtValue)*1.0072826748;
                kilogramforcesquaresecondpermeter=(edtValue)*1.705600893E-28;
                kilopound=(edtValue)*3.687502724E-30;
                kip=(edtValue)*3.687502724E-30;
                slug=(edtValue)*1.146110884E-28;
                poundforcesquaresecondperfoot=(edtValue)*1.146110884E-28;
                poundtroy=(edtValue)*4.481340116E-27;
                poundal=(edtValue)*1.187375877E-25;
                tonus=(edtValue)*5.734707116E-26;
                tonuk=(edtValue)*5.120274795E-26;
                kiloton=(edtValue)*1.672623099E-33;
                quintal=(edtValue)*1.672623099E-29;
                hundredweightus=(edtValue)*3.687502724E-29;
                hundredweightuk=(edtValue)*3.292413146E-29;
                quarterus=(edtValue)*1.475001089E-28;
                quarteruk=(edtValue)*1.316965258E-28;
                stoneus=(edtValue)*2.950002179E-28;
                stoneuk=(edtValue)*2.633930517E-28;
                tonne=(edtValue)*1.672623099E-30;
                pennyweight=(edtValue)*1.075521627E-24;
                scruple=(edtValue)*1.290625953E-24;
                grain=(edtValue)*2.581251906E-23;
                gamma=(edtValue)*1.672623099E-18;
                talent=(edtValue)*4.890710818E-29;
                mina=(edtValue)*2.934426491E-27;
                shekel=(edtValue)*1.467213245E-25;
                bekan=(edtValue)*2.934426491E-25;
                gerah=(edtValue)*2.934426491E-24;
                talentbiblicalgreek=(edtValue)*8.199132843E-29;
                minabiblicalgreek=(edtValue)*4.919479705E-27;
                tetradrachmabiblicalgreek=(edtValue)*1.229869926E-25;
                didrachmabiblicalgreek=(edtValue)*2.459739852E-25;
                drachmabiblicalgreek=(edtValue)*4.919479705E-25;
                denariusbiblicalroman=(edtValue)*4.344475584E-25;
                assarionbiblicalroman=(edtValue)*6.951160935E-24;
                quadransbiblicalroman=(edtValue)*2.780464374E-23;
                leptonbiblicalroman=(edtValue)*5.560928748E-23;
                planckmass=(edtValue)*7.684179794E-20;
                electronmass=(edtValue)*1836.1527557;
                muonmass=(edtValue)*8.8802445532;
                protonmass=(edtValue)*1;
                neutronmass=(edtValue)*0.9986235234;
                deuteronmass=(edtValue)*0.5002482664;
                earthmass=(edtValue)*2.798900769E-52;
                sunmass=(edtValue)*8.363115499E-58;
                break;

            case "Neutron mass - n":
                kilogram=(edtValue)*1.6749286E-27;
                gram=(edtValue)*1.6749286E-24;
                milligram=(edtValue)*1.6749286E-21;
                tonmetric=(edtValue)*1.6749286E-30;
                pound=(edtValue)*3.692585481E-27;
                ounce=(edtValue)*5.90813677E-26;
                carat=(edtValue)*8.374643E-24;
                tonshort=(edtValue)*1.84629274E-30;
                tonlong=(edtValue)*1.648475661E-30;
                atomicmassunit=(edtValue)*1.0086648911;
                exagram=(edtValue)*1.6749286E-42;
                petagram=(edtValue)*1.6749286E-39;
                teragram=(edtValue)*1.6749286E-36;
                gigagram=(edtValue)*1.6749286E-33;
                megagram=(edtValue)*1.6749286E-30;
                hectogram=(edtValue)*1.6749286E-26;
                dekagram=(edtValue)*1.6749286E-25;
                decigram=(edtValue)*1.6749286E-23;
                centigram=(edtValue)*1.6749286E-22;
                microgram=(edtValue)*1.6749286E-18;
                nanogram=(edtValue)*1.6749286E-15;
                picogram=(edtValue)*1.6749286E-12;
                femtogram=(edtValue)*1.6749286E-9;
                attogram=(edtValue)*0.0000016749;
                dalton=(edtValue)*1.0086710869;
                kilogramforcesquaresecondpermeter=(edtValue)*1.707951849E-28;
                kilopound=(edtValue)*3.692585481E-30;
                kip=(edtValue)*3.692585481E-30;
                slug=(edtValue)*1.147690653E-28;
                poundforcesquaresecondperfoot=(edtValue)*1.147690653E-28;
                poundtroy=(edtValue)*4.487517078E-27;
                poundal=(edtValue)*1.189012525E-25;
                tonus=(edtValue)*5.742611686E-26;
                tonuk=(edtValue)*5.127332448E-26;
                kiloton=(edtValue)*1.6749286E-33;
                quintal=(edtValue)*1.6749286E-29;
                hundredweightus=(edtValue)*3.692585481E-29;
                hundredweightuk=(edtValue)*3.296951322E-29;
                quarterus=(edtValue)*1.477034192E-28;
                quarteruk=(edtValue)*1.318780529E-28;
                stoneus=(edtValue)*2.954068385E-28;
                stoneuk=(edtValue)*2.637561058E-28;
                tonne=(edtValue)*1.6749286E-30;
                pennyweight=(edtValue)*1.077004098E-24;
                scruple=(edtValue)*1.292404918E-24;
                grain=(edtValue)*2.584809837E-23;
                gamma=(edtValue)*1.6749286E-18;
                talent=(edtValue)*4.897452046E-29;
                mina=(edtValue)*2.938471228E-27;
                shekel=(edtValue)*1.469235614E-25;
                bekan=(edtValue)*2.938471228E-25;
                gerah=(edtValue)*2.938471228E-24;
                talentbiblicalgreek=(edtValue)*8.210434313E-29;
                minabiblicalgreek=(edtValue)*4.926260588E-27;
                tetradrachmabiblicalgreek=(edtValue)*1.231565147E-25;
                didrachmabiblicalgreek=(edtValue)*2.463130294E-25;
                drachmabiblicalgreek=(edtValue)*4.926260588E-25;
                denariusbiblicalroman=(edtValue)*4.350463896E-25;
                assarionbiblicalroman=(edtValue)*6.960742233E-24;
                quadransbiblicalroman=(edtValue)*2.784296893E-23;
                leptonbiblicalroman=(edtValue)*5.568593787E-23;
                planckmass=(edtValue)*7.694771467E-20;
                electronmass=(edtValue)*1838.6836607;
                muonmass=(edtValue)*8.8924848504;
                protonmass=(edtValue)*1.0013783739;
                neutronmass=(edtValue)*1;
                deuteronmass=(edtValue)*0.5009377955;
                earthmass=(edtValue)*2.802758701E-52;
                sunmass=(edtValue)*8.374643E-58;
                break;

            case "Deuteron mass - D":
                kilogram=(edtValue)*3.343585999E-27;
                gram=(edtValue)*3.343585999E-24;
                milligram=(edtValue)*3.343585999E-21;
                tonmetric=(edtValue)*3.343585999E-30;
                pound=(edtValue)*7.371345333E-27;
                ounce=(edtValue)*1.179415253E-25;
                carat=(edtValue)*1.671792999E-23;
                tonshort=(edtValue)*3.685672666E-30;
                tonlong=(edtValue)*3.290779166E-30;
                atomicmassunit=(edtValue)*2.0135531799;
                exagram=(edtValue)*3.343585999E-42;
                petagram=(edtValue)*3.343585999E-39;
                teragram=(edtValue)*3.343585999E-36;
                gigagram=(edtValue)*3.343585999E-33;
                megagram=(edtValue)*3.343585999E-30;
                hectogram=(edtValue)*3.343585999E-26;
                dekagram=(edtValue)*3.343585999E-25;
                decigram=(edtValue)*3.343585999E-23;
                centigram=(edtValue)*3.343585999E-22;
                microgram=(edtValue)*3.343585999E-18;
                nanogram=(edtValue)*3.343585999E-15;
                picogram=(edtValue)*3.343585999E-12;
                femtogram=(edtValue)*3.343585999E-9;
                attogram=(edtValue)*0.0000033436;
                dalton=(edtValue)*2.0135655483;
                kilogramforcesquaresecondpermeter=(edtValue)*3.409508853E-28;
                kilopound=(edtValue)*7.371345333E-30;
                kip=(edtValue)*7.371345333E-30;
                slug=(edtValue)*2.29108417E-28;
                poundforcesquaresecondperfoot=(edtValue)*2.29108417E-28;
                poundtroy=(edtValue)*8.958232176E-27;
                poundal=(edtValue)*2.373573197E-25;
                tonus=(edtValue)*1.146372211E-25;
                tonuk=(edtValue)*1.023546734E-25;
                kiloton=(edtValue)*3.343585999E-33;
                quintal=(edtValue)*3.343585999E-29;
                hundredweightus=(edtValue)*7.371345333E-29;
                hundredweightuk=(edtValue)*6.581558333E-29;
                quarterus=(edtValue)*2.948538133E-28;
                quarteruk=(edtValue)*2.632623333E-28;
                stoneus=(edtValue)*5.897076266E-28;
                stoneuk=(edtValue)*5.265246666E-28;
                tonne=(edtValue)*3.343585999E-30;
                pennyweight=(edtValue)*2.149975722E-24;
                scruple=(edtValue)*2.579970866E-24;
                grain=(edtValue)*5.159941733E-23;
                gamma=(edtValue)*3.343585999E-18;
                talent=(edtValue)*9.776567251E-29;
                mina=(edtValue)*5.86594035E-27;
                shekel=(edtValue)*2.932970175E-25;
                bekan=(edtValue)*5.86594035E-25;
                gerah=(edtValue)*5.86594035E-24;
                talentbiblicalgreek=(edtValue)*1.639012745E-28;
                minabiblicalgreek=(edtValue)*9.83407647E-27;
                tetradrachmabiblicalgreek=(edtValue)*2.458519117E-25;
                didrachmabiblicalgreek=(edtValue)*4.917038235E-25;
                drachmabiblicalgreek=(edtValue)*9.83407647E-25;
                denariusbiblicalroman=(edtValue)*8.684638961E-25;
                assarionbiblicalroman=(edtValue)*1.389542233E-23;
                quadransbiblicalroman=(edtValue)*5.558168935E-23;
                leptonbiblicalroman=(edtValue)*1.111633787E-22;
                planckmass=(edtValue)*1.536073248E-19;
                electronmass=(edtValue)*3670.4829962;
                muonmass=(edtValue)*17.751674818;
                protonmass=(edtValue)*1.9990074273;
                neutronmass=(edtValue)*1.9962558404;
                deuteronmass=(edtValue)*1;
                earthmass=(edtValue)*5.595023427E-52;
                sunmass=(edtValue)*1.671792999E-57;
                break;


            case "Earth's mass - Earth":
                kilogram=(edtValue)*5.976E+24;
                gram=(edtValue)*5.976E+27;
                milligram=(edtValue)*5.976E+30;
                tonmetric=(edtValue)*5.976E+21;
                pound=(edtValue)*1.317482478E+25;
                ounce=(edtValue)*2.107971966E+26;
                carat=(edtValue)*2.988E+28;
                tonshort=(edtValue)*6.587412394E+21;
                tonlong=(edtValue)*5.881618209E+21;
                atomicmassunit=(edtValue)*3.598828863E+51;
                exagram=(edtValue)*5976000000.0;
                petagram=(edtValue)*5976000000000.0;
                teragram=(edtValue)*5976000000000168.0;
                gigagram=(edtValue)*5976000000000167000.0;
                megagram=(edtValue)*5.976E+21;
                hectogram=(edtValue)*5.976E+25;
                dekagram=(edtValue)*5.976E+26;
                decigram=(edtValue)*5.976E+28;
                centigram=(edtValue)*5.976E+29;
                microgram=(edtValue)*5.976E+33;
                nanogram=(edtValue)*5.976E+36;
                picogram=(edtValue)*5.976E+39;
                femtogram=(edtValue)*5.976E+42;
                attogram=(edtValue)*5.976E+45;
                dalton=(edtValue)*5.976E+51;
                kilogramforcesquaresecondpermeter=(edtValue)*6.093824088E+23;
                kilopound=(edtValue)*1.317482478E+22;
                kip=(edtValue)*1.317482478E+22;
                slug=(edtValue)*4.094860727E+23;
                poundforcesquaresecondperfoot=(edtValue)*4.094860727E+23;
                poundtroy=(edtValue)*1.601107179E+25;
                poundal=(edtValue)*4.242293581E+26;
                tonus=(edtValue)*2.048914051E+26;
                tonuk=(edtValue)*1.829387755E+26;
                kiloton=(edtValue)*5976000000000167000.0;
                quintal=(edtValue)*5.976E+22;
                hundredweightus=(edtValue)*1.317482478E+23;
                hundredweightuk=(edtValue)*1.176323641E+23;
                quarterus=(edtValue)*5.269929915E+23;
                quarteruk=(edtValue)*4.705294567E+23;
                stoneus=(edtValue)*1.053985983E+24;
                stoneuk=(edtValue)*9.410589134E+23;
                tonne=(edtValue)*5.976E+21;
                pennyweight=(edtValue)*3.842657229E+27;
                scruple=(edtValue)*4.611188675E+27;
                grain=(edtValue)*9.222377351E+28;
                gamma=(edtValue)*5.976E+33;
                talent=(edtValue)*1.747368421E+23;
                mina=(edtValue)*1.048421052E+25;
                shekel=(edtValue)*5.242105263E+26;
                bekan=(edtValue)*1.048421052E+27;
                gerah=(edtValue)*1.048421052E+28;
                talentbiblicalgreek=(edtValue)*2.929411764E+23;
                minabiblicalgreek=(edtValue)*1.757647058E+25;
                tetradrachmabiblicalgreek=(edtValue)*4.394117647E+26;
                didrachmabiblicalgreek=(edtValue)*8.788235294E+26;
                drachmabiblicalgreek=(edtValue)*1.757647058E+27;
                denariusbiblicalroman=(edtValue)*1.552207792E+27;
                assarionbiblicalroman=(edtValue)*2.483532467E+28;
                quadransbiblicalroman=(edtValue)*9.93412987E+28;
                leptonbiblicalroman=(edtValue)*1.986825974E+29;
                planckmass=(edtValue)*2.745427732E+32;
                electronmass=(edtValue)*6.560263856E+54;
                muonmass=(edtValue)*3.172761481E+52;
                protonmass=(edtValue)*3.572831201E+51;
                neutronmass=(edtValue)*3.567913282E+51;
                deuteronmass=(edtValue)*1.787302614E+51;
                earthmass=(edtValue)*1;
                sunmass=(edtValue)*0.000002988;
                break;

            case "Sun mass - Sun":
                kilogram=(edtValue)*1.999999999E+30;
                gram=(edtValue)*2.E+33;
                milligram=(edtValue)*1.999999999E+36;
                tonmetric=(edtValue)*1.999999999E+27;
                pound=(edtValue)*4.409245243E+30;
                ounce=(edtValue)*7.054792389E+31;
                carat=(edtValue)*1.E+34;
                tonshort=(edtValue)*2.204622621E+27;
                tonlong=(edtValue)*1.968413055E+27;
                atomicmassunit=(edtValue)*1.20442733E+57;
                exagram=(edtValue)*2000000000000000.0;
                petagram=(edtValue)*1999999999999999700.0;
                teragram=(edtValue)*1.999999999E+21;
                gigagram=(edtValue)*2.E+24;
                megagram=(edtValue)*1.999999999E+27;
                hectogram=(edtValue)*2.E+31;
                dekagram=(edtValue)*1.999999999E+32;
                decigram=(edtValue)*2.E+34;
                centigram=(edtValue)*2.E+35;
                microgram=(edtValue)*2.E+39;
                nanogram=(edtValue)*1.999999999E+42;
                picogram=(edtValue)*2.E+45;
                femtogram=(edtValue)*1.999999999E+48;
                attogram=(edtValue)*2.E+51;
                dalton=(edtValue)*1.204434728E+57;
                kilogramforcesquaresecondpermeter=(edtValue)*2.039432425E+29;
                kilopound=(edtValue)*4.409245243E+27;
                kip=(edtValue)*4.409245243E+27;
                slug=(edtValue)*4.409245243E+27;
                poundforcesquaresecondperfoot=(edtValue)*1.370435317E+29;
                poundtroy=(edtValue)*5.358457761E+30;
                poundal=(edtValue)*1.419776968E+32;
                tonus=(edtValue)*6.857142073E+31;
                tonuk=(edtValue)*6.122448979E+31;
                kiloton=(edtValue)*2.E+24;
                quintal=(edtValue)*2.E+28;
                hundredweightus=(edtValue)*4.409245243E+28;
                hundredweightuk=(edtValue)*3.93682611E+28;
                quarterus=(edtValue)*1.763698097E+29;
                quarteruk=(edtValue)*1.574730444E+29;
                stoneus=(edtValue)*3.527396194E+29;
                stoneuk=(edtValue)*3.149460888E+29;
                tonne=(edtValue)*1.999999999E+27;
                pennyweight=(edtValue)*1.286029862E+33;
                scruple=(edtValue)*1.543235835E+33;
                grain=(edtValue)*3.08647167E+34;
                gamma=(edtValue)*2.E+39;
                talent=(edtValue)*5.847953216E+28;
                mina=(edtValue)*3.508771929E+30;
                shekel=(edtValue)*1.754385964E+32;
                bekan=(edtValue)*3.508771929E+32;
                gerah=(edtValue)*3.508771929E+33;
                talentbiblicalgreek=(edtValue)*9.803921568E+28;
                minabiblicalgreek=(edtValue)*5.882352941E+30;
                tetradrachmabiblicalgreek=(edtValue)*1.470588235E+32;
                didrachmabiblicalgreek=(edtValue)*2.94117647E+32;
                drachmabiblicalgreek=(edtValue)*5.882352941E+32;
                denariusbiblicalroman=(edtValue)*5.194805194E+32;
                assarionbiblicalroman=(edtValue)*8.311688311E+33;
                quadransbiblicalroman=(edtValue)*3.324675324E+34;
                leptonbiblicalroman=(edtValue)*6.649350649E+34;
                planckmass=(edtValue)*9.188178489E+37;
                electronmass=(edtValue)*2.195536765E+60;
                muonmass=(edtValue)*1.061834498E+58;
                protonmass=(edtValue)*1.19572664E+57;
                neutronmass=(edtValue)*1.19408075E+57;
                deuteronmass=(edtValue)*5.981601789E+56;
                earthmass=(edtValue)*334672.02142;
                sunmass=(edtValue)*1;
                break;
        }









        results.setKilogram(kilogram);
        results.setGram(gram);
        results.setMilligram(milligram);
        results.setTonmetric(tonmetric);
        results.setPound(pound);
        results.setOunce(ounce);
        results.setCarat(carat);
        results.setTonshort(tonshort);
        results.setTonlong(tonlong);
        results.setAtomicmassunit(atomicmassunit);
        results.setExagram(exagram);
        results.setPetagram(petagram);
        results.setTeragram(teragram);
        results.setGigagram(gigagram);
        results.setMegagram(megagram);
        results.setHectogram(hectogram);
        results.setDekagram(dekagram);
        results.setDecigram(decigram);
        results.setCentigram(centigram);
        results.setMicrogram(microgram);
        results.setNanogram(nanogram);
        results.setPicogram(picogram);
        results.setFemtogram(femtogram);
        results.setAttogram(attogram);
        results.setDalton(dalton);
        results.setKilogramforcesquaresecondpermeter(kilogramforcesquaresecondpermeter);
        results.setKilopound(kilopound);
        results.setKip(kip);
        results.setSlug(slug);
        results.setPoundforcesquaresecondperfoot(poundforcesquaresecondperfoot);
        results.setPoundtroy(poundtroy);
        results.setPoundal(poundal);
        results.setTonus(tonus);
        results.setTonuk(tonuk);
        results.setKiloton(kiloton);
        results.setQuintal(quintal);
        results.setHundredweightus(hundredweightus);
        results.setHundredweightuk(hundredweightuk);
        results.setQuarterus(quarterus);
        results.setQuarteruk(quarteruk);
        results.setStoneus(stoneus);
        results.setStoneuk(stoneuk);
        results.setTonne(tonne);
        results.setPennyweight(pennyweight);
        results.setScruple(scruple);
        results.setGrain(grain);
        results.setGamma(gamma);
        results.setTalent(talent);
        results.setMina(mina);
        results.setShekel(shekel);
        results.setBekan(bekan);
        results.setGerah(gerah);
        results.setTalentbiblicalgreek(talentbiblicalgreek);
        results.setMinabiblicalgreek(minabiblicalgreek);
        results.setTetradrachmabiblicalgreek(tetradrachmabiblicalgreek);
        results.setDidrachmabiblicalgreek(didrachmabiblicalgreek);
        results.setDrachmabiblicalgreek(didrachmabiblicalgreek);
        results.setDenariusbiblicalroman(denariusbiblicalroman);
        results.setAssarionbiblicalroman(assarionbiblicalroman);
        results.setQuadransbiblicalroman(quadransbiblicalroman);
        results.setLeptonbiblicalroman(leptonbiblicalroman);
        results.setPlanckmass(planckmass);
        results.setElectronmass(electronmass);
        results.setMuonmass(muonmass);
        results.setProtonmass(protonmass);
        results.setNeutronmass(neutronmass);
        results.setDeuteronmass(deuteronmass);
        results.setEarthmass(earthmass);
        results.setSunmass(sunmass);

        converterArray.add(results);
        return converterArray;

    }
    public class ConversionResults{


        private double kilogram,gram,milligram,tonmetric,pound,ounce,carat,tonshort,tonlong,atomicmassunit,exagram,petagram,teragram,gigagram,megagram,
                hectogram,dekagram,decigram,centigram,microgram,nanogram,picogram,femtogram,attogram,dalton,kilogramforcesquaresecondpermeter,kilopound,kip,slug,poundforcesquaresecondperfoot,
                poundtroy,poundal,tonus,tonuk,kiloton,quintal,hundredweightus,hundredweightuk,quarterus,quarteruk,stoneus,stoneuk,tonne,pennyweight,scruple,grain,gamma,talent,mina,shekel,bekan,gerah,
                talentbiblicalgreek,minabiblicalgreek,tetradrachmabiblicalgreek,didrachmabiblicalgreek,drachmabiblicalgreek,denariusbiblicalroman,assarionbiblicalroman,quadransbiblicalroman,leptonbiblicalroman,planckmass,electronmass,muonmass,protonmass,
                neutronmass,deuteronmass,earthmass,sunmass;

        public double getKilogram() {
            return kilogram;
        }

        public void setKilogram(double kilogram) {
            this.kilogram = kilogram;
        }

        public double getGram() {
            return gram;
        }

        public void setGram(double gram) {
            this.gram = gram;
        }

        public double getMilligram() {
            return milligram;
        }

        public void setMilligram(double milligram) {
            this.milligram = milligram;
        }

        public double getTonmetric() {
            return tonmetric;
        }

        public void setTonmetric(double tonmetric) {
            this.tonmetric = tonmetric;
        }

        public double getPound() {
            return pound;
        }

        public void setPound(double pound) {
            this.pound = pound;
        }

        public double getOunce() {
            return ounce;
        }

        public void setOunce(double ounce) {
            this.ounce = ounce;
        }

        public double getCarat() {
            return carat;
        }

        public void setCarat(double carat) {
            this.carat = carat;
        }

        public double getTonshort() {
            return tonshort;
        }

        public void setTonshort(double tonshort) {
            this.tonshort = tonshort;
        }

        public double getTonlong() {
            return tonlong;
        }

        public void setTonlong(double tonlong) {
            this.tonlong = tonlong;
        }

        public double getAtomicmassunit() {
            return atomicmassunit;
        }

        public void setAtomicmassunit(double atomicmassunit) {
            this.atomicmassunit = atomicmassunit;
        }

        public double getExagram() {
            return exagram;
        }

        public void setExagram(double exagram) {
            this.exagram = exagram;
        }

        public double getPetagram() {
            return petagram;
        }

        public void setPetagram(double petagram) {
            this.petagram = petagram;
        }

        public double getTeragram() {
            return teragram;
        }

        public void setTeragram(double teragram) {
            this.teragram = teragram;
        }

        public double getGigagram() {
            return gigagram;
        }

        public void setGigagram(double gigagram) {
            this.gigagram = gigagram;
        }

        public double getMegagram() {
            return megagram;
        }

        public void setMegagram(double megagram) {
            this.megagram = megagram;
        }

        public double getHectogram() {
            return hectogram;
        }

        public void setHectogram(double hectogram) {
            this.hectogram = hectogram;
        }

        public double getDekagram() {
            return dekagram;
        }

        public void setDekagram(double dekagram) {
            this.dekagram = dekagram;
        }

        public double getDecigram() {
            return decigram;
        }

        public void setDecigram(double decigram) {
            this.decigram = decigram;
        }

        public double getCentigram() {
            return centigram;
        }

        public void setCentigram(double centigram) {
            this.centigram = centigram;
        }

        public double getMicrogram() {
            return microgram;
        }

        public void setMicrogram(double microgram) {
            this.microgram = microgram;
        }

        public double getNanogram() {
            return nanogram;
        }

        public void setNanogram(double nanogram) {
            this.nanogram = nanogram;
        }

        public double getPicogram() {
            return picogram;
        }

        public void setPicogram(double picogram) {
            this.picogram = picogram;
        }

        public double getFemtogram() {
            return femtogram;
        }

        public void setFemtogram(double femtogram) {
            this.femtogram = femtogram;
        }

        public double getAttogram() {
            return attogram;
        }

        public void setAttogram(double attogram) {
            this.attogram = attogram;
        }

        public double getDalton() {
            return dalton;
        }

        public void setDalton(double dalton) {
            this.dalton = dalton;
        }

        public double getKilogramforcesquaresecondpermeter() {
            return kilogramforcesquaresecondpermeter;
        }

        public void setKilogramforcesquaresecondpermeter(
                double kilogramforcesquaresecondpermeter) {
            this.kilogramforcesquaresecondpermeter = kilogramforcesquaresecondpermeter;
        }

        public double getKilopound() {
            return kilopound;
        }

        public void setKilopound(double kilopound) {
            this.kilopound = kilopound;
        }

        public double getKip() {
            return kip;
        }

        public void setKip(double kip) {
            this.kip = kip;
        }

        public double getSlug() {
            return slug;
        }

        public void setSlug(double slug) {
            this.slug = slug;
        }

        public double getPoundforcesquaresecondperfoot() {
            return poundforcesquaresecondperfoot;
        }

        public void setPoundforcesquaresecondperfoot(
                double poundforcesquaresecondperfoot) {
            this.poundforcesquaresecondperfoot = poundforcesquaresecondperfoot;
        }

        public double getPoundtroy() {
            return poundtroy;
        }

        public void setPoundtroy(double poundtroy) {
            this.poundtroy = poundtroy;
        }

        public double getPoundal() {
            return poundal;
        }

        public void setPoundal(double poundal) {
            this.poundal = poundal;
        }

        public double getTonus() {
            return tonus;
        }

        public void setTonus(double tonus) {
            this.tonus = tonus;
        }

        public double getTonuk() {
            return tonuk;
        }

        public void setTonuk(double tonuk) {
            this.tonuk = tonuk;
        }

        public double getKiloton() {
            return kiloton;
        }

        public void setKiloton(double kiloton) {
            this.kiloton = kiloton;
        }

        public double getQuintal() {
            return quintal;
        }

        public void setQuintal(double quintal) {
            this.quintal = quintal;
        }

        public double getHundredweightus() {
            return hundredweightus;
        }

        public void setHundredweightus(double hundredweightus) {
            this.hundredweightus = hundredweightus;
        }

        public double getHundredweightuk() {
            return hundredweightuk;
        }

        public void setHundredweightuk(double hundredweightuk) {
            this.hundredweightuk = hundredweightuk;
        }

        public double getQuarterus() {
            return quarterus;
        }

        public void setQuarterus(double quarterus) {
            this.quarterus = quarterus;
        }

        public double getQuarteruk() {
            return quarteruk;
        }

        public void setQuarteruk(double quarteruk) {
            this.quarteruk = quarteruk;
        }

        public double getStoneus() {
            return stoneus;
        }

        public void setStoneus(double stoneus) {
            this.stoneus = stoneus;
        }

        public double getStoneuk() {
            return stoneuk;
        }

        public void setStoneuk(double stoneuk) {
            this.stoneuk = stoneuk;
        }

        public double getTonne() {
            return tonne;
        }

        public void setTonne(double tonne) {
            this.tonne = tonne;
        }

        public double getPennyweight() {
            return pennyweight;
        }

        public void setPennyweight(double pennyweight) {
            this.pennyweight = pennyweight;
        }

        public double getScruple() {
            return scruple;
        }

        public void setScruple(double scruple) {
            this.scruple = scruple;
        }

        public double getGrain() {
            return grain;
        }

        public void setGrain(double grain) {
            this.grain = grain;
        }

        public double getGamma() {
            return gamma;
        }

        public void setGamma(double gamma) {
            this.gamma = gamma;
        }

        public double getTalent() {
            return talent;
        }

        public void setTalent(double talent) {
            this.talent = talent;
        }

        public double getMina() {
            return mina;
        }

        public void setMina(double mina) {
            this.mina = mina;
        }

        public double getShekel() {
            return shekel;
        }

        public void setShekel(double shekel) {
            this.shekel = shekel;
        }

        public double getBekan() {
            return bekan;
        }

        public void setBekan(double bekan) {
            this.bekan = bekan;
        }

        public double getGerah() {
            return gerah;
        }

        public void setGerah(double gerah) {
            this.gerah = gerah;
        }

        public double getTalentbiblicalgreek() {
            return talentbiblicalgreek;
        }

        public void setTalentbiblicalgreek(double talentbiblicalgreek) {
            this.talentbiblicalgreek = talentbiblicalgreek;
        }

        public double getMinabiblicalgreek() {
            return minabiblicalgreek;
        }

        public void setMinabiblicalgreek(double minabiblicalgreek) {
            this.minabiblicalgreek = minabiblicalgreek;
        }

        public double getTetradrachmabiblicalgreek() {
            return tetradrachmabiblicalgreek;
        }

        public void setTetradrachmabiblicalgreek(double tetradrachmabiblicalgreek) {
            this.tetradrachmabiblicalgreek = tetradrachmabiblicalgreek;
        }

        public double getDidrachmabiblicalgreek() {
            return didrachmabiblicalgreek;
        }

        public void setDidrachmabiblicalgreek(double didrachmabiblicalgreek) {
            this.didrachmabiblicalgreek = didrachmabiblicalgreek;
        }

        public double getDrachmabiblicalgreek() {
            return drachmabiblicalgreek;
        }

        public void setDrachmabiblicalgreek(double drachmabiblicalgreek) {
            this.drachmabiblicalgreek = drachmabiblicalgreek;
        }

        public double getDenariusbiblicalroman() {
            return denariusbiblicalroman;
        }

        public void setDenariusbiblicalroman(double denariusbiblicalroman) {
            this.denariusbiblicalroman = denariusbiblicalroman;
        }

        public double getAssarionbiblicalroman() {
            return assarionbiblicalroman;
        }

        public void setAssarionbiblicalroman(double assarionbiblicalroman) {
            this.assarionbiblicalroman = assarionbiblicalroman;
        }

        public double getQuadransbiblicalroman() {
            return quadransbiblicalroman;
        }

        public void setQuadransbiblicalroman(double quadransbiblicalroman) {
            this.quadransbiblicalroman = quadransbiblicalroman;
        }

        public double getLeptonbiblicalroman() {
            return leptonbiblicalroman;
        }

        public void setLeptonbiblicalroman(double leptonbiblicalroman) {
            this.leptonbiblicalroman = leptonbiblicalroman;
        }

        public double getPlanckmass() {
            return planckmass;
        }

        public void setPlanckmass(double planckmass) {
            this.planckmass = planckmass;
        }

        public double getElectronmass() {
            return electronmass;
        }

        public void setElectronmass(double electronmass) {
            this.electronmass = electronmass;
        }

        public double getMuonmass() {
            return muonmass;
        }

        public void setMuonmass(double muonmass) {
            this.muonmass = muonmass;
        }

        public double getProtonmass() {
            return protonmass;
        }

        public void setProtonmass(double protonmass) {
            this.protonmass = protonmass;
        }

        public double getNeutronmass() {
            return neutronmass;
        }

        public void setNeutronmass(double neutronmass) {
            this.neutronmass = neutronmass;
        }

        public double getDeuteronmass() {
            return deuteronmass;
        }

        public void setDeuteronmass(double deuteronmass) {
            this.deuteronmass = deuteronmass;
        }

        public double getEarthmass() {
            return earthmass;
        }

        public void setEarthmass(double earthmass) {
            this.earthmass = earthmass;
        }

        public double getSunmass() {
            return sunmass;
        }

        public void setSunmass(double sunmass) {
            this.sunmass = sunmass;
        }


    }
}


