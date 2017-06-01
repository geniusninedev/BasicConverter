package com.nineinfosys.basicconverter.Engin;

import java.util.ArrayList;


public class SpeedConverter {
	private double meterpersecond,meterperhour,meterperminute,kilometerperhour,kilometerperminute,kilometerpersecond,centimeterperhour,centimeterperminute,centimeterpersecond,
	millimeterperhour,millimeterperminute,millimeterpersecond,footperhour,footperminute,footpersecond,yardperhour,yardperminute,yardpersecond,mileperhour,mileperminute,milepersecond,
	knot,knotUK,velocotyLVacuum,cosmicvfirst,cosmicvsecond,cosmicvthird,earthv,vsoundpurewater,vsoundseawater,mach20,machsistandard;
	private double edtValue;
	private String conversionFrom;
	//private String conversionTo;
	public SpeedConverter(String conversionFrom, double edtValue){
		// TODO Auto-generated constructor stub
		this.conversionFrom = conversionFrom;
		this.edtValue = edtValue;
	}
	public ArrayList<ConversionResults> calculateSpeedConversion()
    {
    	
		ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
			
		ConversionResults results= new ConversionResults();
		switch(conversionFrom)
		{

		case "Meter/second - m/s":
			
			meterpersecond=(edtValue)*1;
			meterperhour=(edtValue)*3600.0000000000;
			meterperminute=(edtValue)*60.0000000000;
			kilometerperhour=(edtValue)*3.6000000000;
			kilometerperminute=(edtValue)*0.0600000000;
			kilometerpersecond=(edtValue)*0.0010000000;
			centimeterperhour=(edtValue)*360000.0000000000;
			centimeterperminute=(edtValue)*6000.0000000000;
			centimeterpersecond=(edtValue)*100.0000000000;
			millimeterperhour=(edtValue)*3600000.0000000000;
			millimeterperminute=(edtValue)*60000.0000000000;
			millimeterpersecond=(edtValue)*1000.0000000000;
			footperhour=(edtValue)*11811.0236220000;
			footperminute=(edtValue)*196.8503937000;
			footpersecond=(edtValue)*3.2808398950;
			yardperhour=(edtValue)*3937.0078740000;
			yardperminute=(edtValue)*65.6167979000;
			yardpersecond=(edtValue)*1.0936132980;
			mileperhour=(edtValue)*2.2369362920;
			mileperminute=(edtValue)*0.0372822720;
			milepersecond=(edtValue)*0.0006213710;
			knot=(edtValue)*1.9438444920;
			knotUK=(edtValue)*1.9426025690;
			velocotyLVacuum=(edtValue)*0.0000000030;
			cosmicvfirst=(edtValue)*0.0001265820;
			cosmicvsecond=(edtValue)*0.0000892860;
			cosmicvthird=(edtValue)*0.0000599880;
			earthv=(edtValue)*0.0000335970;
			vsoundpurewater=(edtValue)*0.0006744450;
			vsoundseawater=(edtValue)*0.0006572030;
			mach20=(edtValue)*0.0029103610;
			machsistandard=(edtValue)*0.0033892970;
			
			break;
			
		case "Meter/hour - m/h":
			
			meterpersecond=(edtValue)*0.0002777780;
			meterperhour=(edtValue)*1.0000000000;
			meterperminute=(edtValue)*0.0166666670;
			kilometerperhour=(edtValue)*0.0010000000;
			kilometerperminute=(edtValue)*0.0000166670;
			kilometerpersecond=(edtValue)*0.0000002780;
			centimeterperhour=(edtValue)*100.0000000000;
			centimeterperminute=(edtValue)*1.6666666670;
			centimeterpersecond=(edtValue)*0.0277777780;
			millimeterperhour=(edtValue)*1000.0000000000;
			millimeterperminute=(edtValue)*16.6666666670;
			millimeterpersecond=(edtValue)*0.2777777780;
			footperhour=(edtValue)*3.2808398950;
			footperminute=(edtValue)*0.05466806650;
			footpersecond=(edtValue)*0.0009113440;
			yardperhour=(edtValue)*1.0936132980;
			yardperminute=(edtValue)*0.0182268880;
			yardpersecond=(edtValue)*0.0003037810;
			mileperhour=(edtValue)*0.0006213710;
			mileperminute=(edtValue)*0.0000103560;
			milepersecond=(edtValue)*0.0000001730;
			knot=(edtValue)*0.0005399570;
			knotUK=(edtValue)*0.0005396120;
			velocotyLVacuum=(edtValue)*0.0000000000;
			cosmicvfirst=(edtValue)*0.0000000350;
			cosmicvsecond=(edtValue)*0.0000000250;
			cosmicvthird=(edtValue)*0.0000000170;
			earthv=(edtValue)*0.0000000090;
			vsoundpurewater=(edtValue)*0.0000001870;
			vsoundseawater=(edtValue)*0.0000001830;
			mach20=(edtValue)*0.0000008080;
			machsistandard=(edtValue)*0.0000009410;
			
			break;
			
		case "Meter/minute - m/min":
			
			meterpersecond=(edtValue)*0.0166666670;
			meterperhour=(edtValue)*60.0000000000;
			meterperminute=(edtValue)*1.0000000000;
			kilometerperhour=(edtValue)*0.0600000000;
			kilometerperminute=(edtValue)*0.0010000000;
			kilometerpersecond=(edtValue)*0.0000166670;
			centimeterperhour=(edtValue)*6000.0000000000;
			centimeterperminute=(edtValue)*100.0000000000;
			centimeterpersecond=(edtValue)*1.6666666670;
			millimeterperhour=(edtValue)*60000.0000000000;
			millimeterperminute=(edtValue)*1000.0000000000;
			millimeterpersecond=(edtValue)*16.6666666670;
			footperhour=(edtValue)*196.8503937000;
			footperminute=(edtValue)*3.2808398950;
			footpersecond=(edtValue)*0.0546806650;
			yardperhour=(edtValue)*65.6167979000;
			yardperminute=(edtValue)*1.0936132980 ;
			yardpersecond=(edtValue)*0.0182268880;
			mileperhour=(edtValue)*0.0372822720;
			mileperminute=(edtValue)*0.0006213710;
			milepersecond=(edtValue)*0.0000103560;
			knot=(edtValue)*0.0323767090;
			knotUK=(edtValue)*0.0323767090;
			velocotyLVacuum=(edtValue)*0.0000000001;
			cosmicvfirst=(edtValue)*0.0000021100;
			cosmicvsecond=(edtValue)*0.0000014880;
			cosmicvthird=(edtValue)*0.0000010000;
			earthv=(edtValue)*0.0000005600;
			vsoundpurewater=(edtValue)*0.0000112410;
			vsoundseawater=(edtValue)*0.0000109530;
			mach20=(edtValue)*0.0000485060;
			machsistandard=(edtValue)*0.0000564880;
			
			break;	
		case "Kilometer/hour - km/h":
			
			meterpersecond=(edtValue)*0.2777777778;
			meterperhour=(edtValue)*1000.0000000000;
			meterperminute=(edtValue)*16.666666667;
			kilometerperhour=(edtValue)*1.0000000000;
			kilometerperminute=(edtValue)*0.0166666667;
			kilometerpersecond=(edtValue)*0.0002777778;
			centimeterperhour=(edtValue)*100000.0000000000;
			centimeterperminute=(edtValue)*1666.6666667;
			centimeterpersecond=(edtValue)*27.777777778;
			millimeterperhour=(edtValue)*1000000.0000000000;
			millimeterperminute=(edtValue)*16666.666667;
			millimeterpersecond=(edtValue)*277.77777778;
			footperhour=(edtValue)*3280.839895;
			footperminute=(edtValue)*54.680664917;
			footpersecond=(edtValue)*0.9113444153;
			yardperhour=(edtValue)*1093.6132983;
			yardperminute=(edtValue)*18.226888306;
			yardpersecond=(edtValue)*0.3037814718;
			mileperhour=(edtValue)*0.6213711922;
			mileperminute=(edtValue)*0.0103561865;
			milepersecond=(edtValue)*0.0001726031;
			knot=(edtValue)*0.5399568035;
			knotUK=(edtValue)*0.5396118248;
			velocotyLVacuum=(edtValue)*9.265669311E-10;
			cosmicvfirst=(edtValue)*0.0000351617;
			cosmicvsecond=(edtValue)*0.0000248016;
			cosmicvthird=(edtValue)*0.0000166633;
			earthv=(edtValue)*0.0000093324;
			vsoundpurewater=(edtValue)*0.0001873459;
			vsoundseawater=(edtValue)*0.0001825564;
			mach20=(edtValue)*0.0008084336;
			machsistandard=(edtValue)*0.0009414715;
			
			
			break;	
		case "Kilometer/minute - km/min":

			meterpersecond=(edtValue)*16.666666667;
			meterperhour=(edtValue)*37.282271534;
			meterperminute=(edtValue)*1000.0000000000;
			kilometerperhour=(edtValue)*60;
			kilometerperminute=(edtValue)*1.0000000000;
			kilometerpersecond=(edtValue)*0.0166666667;
			centimeterperhour=(edtValue)*6000000.0000000000;
			centimeterperminute=(edtValue)*100000.0000000000;
			centimeterpersecond=(edtValue)*1666.6666667;
			millimeterperhour=(edtValue)*60000000.0000000000;
			millimeterperminute=(edtValue)*1000000.0000000000;
			millimeterpersecond=(edtValue)*16666.666667;
			footperhour=(edtValue)*196850.3937;
			footperminute=(edtValue)*3280.839895;
			footpersecond=(edtValue)*54.680664917;
			yardperhour=(edtValue)*65616.7979;
			yardperminute=(edtValue)*1093.6132983;
			yardpersecond=(edtValue)*18.226888306;
			mileperhour=(edtValue)*37.282271534;
			mileperminute=(edtValue)*0.6213711922;
			milepersecond=(edtValue)*0.0103561865;
			knot=(edtValue)*32.397408207;
			knotUK=(edtValue)*32.37670949;
			velocotyLVacuum=(edtValue)*5.559401586E-8;
			cosmicvfirst=(edtValue)*0.0021097046;
			cosmicvsecond=(edtValue)*0.0014880952;
			cosmicvthird=(edtValue)*0.0009998;
			earthv=(edtValue)*0.0005599418;
			vsoundpurewater=(edtValue)*0.0112407545;
			vsoundseawater=(edtValue)*0.0109533824;
			mach20=(edtValue)*0.0485060147;
			machsistandard=(edtValue)*0.0564882902;
			
			break;	
		case "Kilometer/second - km/s":
			
			meterpersecond=(edtValue)*1000;
			kilometerperhour=(edtValue)*3600.0000000000;
			mileperhour=(edtValue)*2236.9362921;
			meterperhour=(edtValue)*3600000.0000000000;
			meterperminute=(edtValue)*60000.0000000000;
			kilometerperminute=(edtValue)*60.0000000000;
			kilometerpersecond=(edtValue)*1.0000000000;
			centimeterperhour=(edtValue)*360000000.0000000000;
			centimeterperminute=(edtValue)*6000000.0000000000;
			centimeterpersecond=(edtValue)*100000.0000000000;
			millimeterperhour=(edtValue)*3600000000.0000000000;
			millimeterperminute=(edtValue)*60000000.0000000000;
			millimeterpersecond=(edtValue)*1000000.0000000000;
			footperhour=(edtValue)*11811023.622;
			footperminute=(edtValue)*196850.3937;
			footpersecond=(edtValue)*3280.839895;
			yardperhour=(edtValue)*3937007.874;
			yardperminute=(edtValue)*65616.7979;
			yardpersecond=(edtValue)*1093.6132983;
			mileperminute=(edtValue)*37.282271534;
			milepersecond=(edtValue)*0.6213711922;
			knot=(edtValue)*1943.8444924;
			knotUK=(edtValue)*1942.6025694;
			velocotyLVacuum=(edtValue)*0.0000033356;
			cosmicvfirst=(edtValue)*0.1265822785;
			cosmicvsecond=(edtValue)*0.0892857143;
			cosmicvthird=(edtValue)*0.0599880024;
			earthv=(edtValue)*0.033596506;
			vsoundpurewater=(edtValue)*0.6744452688;
			vsoundseawater=(edtValue)*0.6572029443;
			mach20=(edtValue)*2.9103608847;
			machsistandard=(edtValue)*3.3892974122;
			
			
			
			break;
			
		case "Centimeter/hour - cm/h":
			
			meterpersecond=(edtValue)*0.0000027778;
			kilometerperhour=(edtValue)*0.00001;
			mileperhour=(edtValue)*0.0000062137;
			meterperhour=(edtValue)*0.01;
			meterperminute=(edtValue)*0.0001666667;
			kilometerperminute=(edtValue)*1.666666666E-7;
			kilometerpersecond=(edtValue)*2.777777777E-9;
			centimeterperhour=(edtValue)*1.0000000000;
			centimeterperminute=(edtValue)*0.0166666667;
			centimeterpersecond=(edtValue)*0.0002777778;
			millimeterperhour=(edtValue)*10.0000000000;
			millimeterperminute=(edtValue)*0.1666666667;
			millimeterpersecond=(edtValue)*0.0027777778;
			footperhour=(edtValue)*0.032808399;
			footperminute=(edtValue)*0.0005468066;
			footpersecond=(edtValue)*0.0000091134;
			yardperhour=(edtValue)*0.010936133;
			yardperminute=(edtValue)*0.0001822689;
			yardpersecond=(edtValue)*0.0000030378;
			mileperminute=(edtValue)*1.035618653E-7;
			milepersecond=(edtValue)*1.726031089E-9;
			knot=(edtValue)*0.0000053996;
			knotUK=(edtValue)*0.0000053961;
			velocotyLVacuum=(edtValue)*9.265669311E-15;
			cosmicvfirst=(edtValue)*3.516174402E-10;
			cosmicvsecond=(edtValue)*2.48015873E-10;
			cosmicvthird=(edtValue)*1.666333399E-10;
			earthv=(edtValue)*9.332362767E-11;
			vsoundpurewater=(edtValue)*1.873459079E-9;
			vsoundseawater=(edtValue)*1.825563734E-9;
			mach20=(edtValue)*8.08433579E-9;
			machsistandard=(edtValue)*9.414715033E-9;
			
			break;		
			
		case "Centimeter/minute - cm/min":
			
			meterpersecond=(edtValue)*0.0001666667;
			kilometerperhour=(edtValue)*0.0006;
			mileperhour=(edtValue)*0.0003728227;
			meterperhour=(edtValue)*0.6;
			meterperminute=(edtValue)*0.01;
			kilometerperminute=(edtValue)*0.00001;
			kilometerpersecond=(edtValue)*1.666666666E-7;
			centimeterperhour=(edtValue)*60;
			centimeterperminute=(edtValue)*1.0000000000;
			centimeterpersecond=(edtValue)*0.0166666667;
			millimeterperhour=(edtValue)*600.0000000000;
			millimeterperminute=(edtValue)*10.0000000000;
			millimeterpersecond=(edtValue)*0.1666666667;
			footperhour=(edtValue)*1.968503937;
			footperminute=(edtValue)*0.032808399;
			footpersecond=(edtValue)*0.0005468066;
			yardperhour=(edtValue)*0.656167979;
			yardperminute=(edtValue)*0.010936133;
			yardpersecond=(edtValue)*0.0001822689;
			mileperminute=(edtValue)*0.0000062137;
			milepersecond=(edtValue)*1.035618653E-7;
			knot=(edtValue)*0.0003239741;
			knotUK=(edtValue)*0.0003237671;
			velocotyLVacuum=(edtValue)*5.559401586E-13;
			cosmicvfirst=(edtValue)*2.109704641E-8;
			cosmicvsecond=(edtValue)*1.488095238E-8;
			cosmicvthird=(edtValue)*9.998000399E-9;
			earthv=(edtValue)*5.59941766E-9;
			vsoundpurewater=(edtValue)*1.124075447E-7;
			vsoundseawater=(edtValue)*1.09533824E-7;
			mach20=(edtValue)*4.850601474E-7;
			machsistandard=(edtValue)*5.64882902E-7;
			
			break;		
			
       case "Centimeter/second - cm/s":
			
    	    meterpersecond=(edtValue)*0.01;
			kilometerperhour=(edtValue)*0.036;
			mileperhour=(edtValue)*0.0223693629;
			meterperhour=(edtValue)*36;
			meterperminute=(edtValue)*0.6;
			kilometerperminute=(edtValue)*0.0006;
			kilometerpersecond=(edtValue)*0.00001;
			centimeterperhour=(edtValue)*3600.0000000000;
			centimeterperminute=(edtValue)*60.0000000000;
			centimeterpersecond=(edtValue)*1.0000000000;
			millimeterperhour=(edtValue)*36000.0000000000;
			millimeterperminute=(edtValue)*600.0000000000;
			millimeterpersecond=(edtValue)*10.0000000000;
			footperhour=(edtValue)*118.11023622;
			footperminute=(edtValue)*1.968503937;
			footpersecond=(edtValue)*0.032808399;
			yardperhour=(edtValue)*39.37007874;
			yardperminute=(edtValue)*0.656167979;
			yardpersecond=(edtValue)*0.010936133;
			mileperminute=(edtValue)*0.0003728227;
			milepersecond=(edtValue)*0.0000062137;
			knot=(edtValue)*0.0194384449;
			knotUK=(edtValue)*0.0194260257;
			velocotyLVacuum=(edtValue)*3.335640951E-11;
			cosmicvfirst=(edtValue)*0.0000012658;
			cosmicvsecond=(edtValue)*8.928571428E-7;
			cosmicvthird=(edtValue)*5.998800239E-7;
			earthv=(edtValue)*3.359650596E-7;
			vsoundpurewater=(edtValue)*0.0000067445;
			vsoundseawater=(edtValue)*0.000006572;
			mach20=(edtValue)*0.0000291036;
			machsistandard=(edtValue)*0.000033893;
			
			break;	
			
       case "Millimeter/hour - mm/h":
			
   	        meterpersecond=(edtValue)*2.777777777E-7;
			kilometerperhour=(edtValue)*0.000001;
			mileperhour=(edtValue)*6.213711922E-7;
			meterperhour=(edtValue)*0.001;
			meterperminute=(edtValue)*0.0000166667;
			kilometerperminute=(edtValue)*1.666666666E-8;
			kilometerpersecond=(edtValue)*2.777777777E-10;
			centimeterperhour=(edtValue)*0.1;
			centimeterperminute=(edtValue)*0.0016666667;
			centimeterpersecond=(edtValue)*0.0000277778;
			millimeterperhour=(edtValue)*1.0000000000;
			millimeterperminute=(edtValue)*0.0166666667;
			millimeterpersecond=(edtValue)*0.0002777778;
			footperhour=(edtValue)*0.0032808399;
			footperminute=(edtValue)*0.0000546807;
			footpersecond=(edtValue)*9.113444152E-7;
			yardperhour=(edtValue)*0.0010936133;
			yardperminute=(edtValue)*0.0000182269;
			yardpersecond=(edtValue)*3.037814717E-7;
			mileperminute=(edtValue)*1.035618653E-8;
			milepersecond=(edtValue)*1.726031089E-10;
			knot=(edtValue)*5.399568034E-7;
			knotUK=(edtValue)*5.396118248E-7;
			velocotyLVacuum=(edtValue)*9.265669311E-16;
			cosmicvfirst=(edtValue)*3.516174402E-11;
			cosmicvsecond=(edtValue)*2.48015873E-11;
			cosmicvthird=(edtValue)*1.666333399E-11;
			earthv=(edtValue)*9.332362767E-12;
			vsoundpurewater=(edtValue)*1.873459079E-10;
			vsoundseawater=(edtValue)*1.825563734E-10;
			mach20=(edtValue)*8.08433579E-10;
			machsistandard=(edtValue)*9.414715033E-10;
			
			break;	
			
       case "Millimeter/minute - mm/min":
			
   	        meterpersecond=(edtValue)*0.0000166667;
			kilometerperhour=(edtValue)*0.00006;
			mileperhour=(edtValue)*0.0000372823;
			meterperhour=(edtValue)*0.06;
			meterperminute=(edtValue)*0.001;
			kilometerperminute=(edtValue)*0.000001;
			kilometerpersecond=(edtValue)*1.666666666E-8;
			centimeterperhour=(edtValue)*6;
			centimeterperminute=(edtValue)*0.1;
			centimeterpersecond=(edtValue)*0.0016666667;
			millimeterperhour=(edtValue)*60;
			millimeterperminute=(edtValue)*1.0000000000;
			millimeterpersecond=(edtValue)*0.0166666667;
			footperhour=(edtValue)*0.1968503937;
			footperminute=(edtValue)*0.0032808399;
			footpersecond=(edtValue)*0.0000546807;
			yardperhour=(edtValue)*0.0656167979;
			yardperminute=(edtValue)*0.0010936133;
			yardpersecond=(edtValue)*0.0000182269;
			mileperminute=(edtValue)*6.213711922E-7;
			milepersecond=(edtValue)*1.035618653E-8;
			knot=(edtValue)*0.0000323974;
			knotUK=(edtValue)*0.0000323767;
			velocotyLVacuum=(edtValue)*5.559401586E-14;
			cosmicvfirst=(edtValue)*2.109704641E-9;
			cosmicvsecond=(edtValue)*1.488095238E-9;
			cosmicvthird=(edtValue)*9.998000399E-10;
			earthv=(edtValue)*5.59941766E-10;
			vsoundpurewater=(edtValue)*1.124075447E-8;
			vsoundseawater=(edtValue)*1.09533824E-8;
			mach20=(edtValue)*4.850601474E-8;
			machsistandard=(edtValue)*5.64882902E-8;
			
			break;	
			
			
       case "Millimeter/second - mm/s":
			
   	        meterpersecond=(edtValue)*0.001;
			kilometerperhour=(edtValue)*0.0036;
			mileperhour=(edtValue)*0.0022369363;
			meterperhour=(edtValue)*3.6;
			meterperminute=(edtValue)*0.06;
			kilometerperminute=(edtValue)*0.00006;
			kilometerpersecond=(edtValue)*0.000001;
			centimeterperhour=(edtValue)*360;
			centimeterperminute=(edtValue)*6.0000000000;
			centimeterpersecond=(edtValue)*0.1;
			millimeterperhour=(edtValue)*3600.0000000000;
			millimeterperminute=(edtValue)*60.0000000000;
			millimeterpersecond=(edtValue)*1.0000000000;
			footperhour=(edtValue)*11.811023622;
			footperminute=(edtValue)*0.1968503937;
			footpersecond=(edtValue)*0.0032808399;
			yardperhour=(edtValue)*3.937007874;
			yardperminute=(edtValue)*0.0656167979;
			yardpersecond=(edtValue)*0.0010936133;
			mileperminute=(edtValue)*0.0000372823;
			milepersecond=(edtValue)*6.213711922E-7;
			knot=(edtValue)*0.0019438445;
			knotUK=(edtValue)*0.0019426026;
			velocotyLVacuum=(edtValue)*3.335640951E-12;
			cosmicvfirst=(edtValue)*1.265822784E-7;
			cosmicvsecond=(edtValue)*8.928571428E-8;
			cosmicvthird=(edtValue)*5.998800239E-8;
			earthv=(edtValue)*3.359650596E-8;
			vsoundpurewater=(edtValue)*6.744452687E-7;
			vsoundseawater=(edtValue)*6.572029442E-7;
			mach20=(edtValue)*0.0000029104;
			machsistandard=(edtValue)*0.0000033893;
			
			break;	
			
			
       case "Foot/hour - ft/h":
			
   	        meterpersecond=(edtValue)*0.0000846667;
			kilometerperhour=(edtValue)*0.0003048;
			mileperhour=(edtValue)*0.0001893939;
			meterperhour=(edtValue)*0.3048;
			meterperminute=(edtValue)*0.00508;
			kilometerperminute=(edtValue)*0.00000508;
			kilometerpersecond=(edtValue)*8.466666666E-8;
			centimeterperhour=(edtValue)*30.48;
			centimeterperminute=(edtValue)*0.508;
			centimeterpersecond=(edtValue)*0.0084666667;
			millimeterperhour=(edtValue)*304.8;
			millimeterperminute=(edtValue)*5.08;
			millimeterpersecond=(edtValue)*0.0846666667;
			footperhour=(edtValue)*1;
			footperminute=(edtValue)*0.0166666667;
			footpersecond=(edtValue)*0.0002777778;
			yardperhour=(edtValue)*0.3333333333;
			yardperminute=(edtValue)*0.0055555556;
			yardpersecond=(edtValue)*0.0000925926;
			mileperminute=(edtValue)*0.0000031566;
			milepersecond=(edtValue)*5.26094276E-8;
			knot=(edtValue)*0.0001645788;
			knotUK=(edtValue)*0.0001644737;
			velocotyLVacuum=(edtValue)*2.824176006E-13;
			cosmicvfirst=(edtValue)*1.071729957E-8;
			cosmicvsecond=(edtValue)*7.559523809E-9;
			cosmicvthird=(edtValue)*5.078984203E-9;
			earthv=(edtValue)*2.844504171E-9;
			vsoundpurewater=(edtValue)*5.710303275E-8;
			vsoundseawater=(edtValue)*5.564318261E-8;
			mach20=(edtValue)*2.464105549E-7;
			machsistandard=(edtValue)*2.869605142E-7;
			
			break;	
			
			
       case "Foot/minute - ft/min":
			
   	    meterpersecond=(edtValue)*0.00508;
			kilometerperhour=(edtValue)*0.018288;
			mileperhour=(edtValue)*0.0113636364;
			meterperhour=(edtValue)*18.288;
			meterperminute=(edtValue)*0.3048;
			kilometerperminute=(edtValue)*0.0003048;
			kilometerpersecond=(edtValue)*0.00000508;
			centimeterperhour=(edtValue)*1828.8;
			centimeterperminute=(edtValue)*30.48;
			centimeterpersecond=(edtValue)*0.508;
			millimeterperhour=(edtValue)*18288.0000000000;
			millimeterperminute=(edtValue)*304.8;
			millimeterpersecond=(edtValue)*5.08;
			footperhour=(edtValue)*60;
			footperminute=(edtValue)*1;
			footpersecond=(edtValue)*0.0166666667;
			yardperhour=(edtValue)*20;
			yardperminute=(edtValue)*0.3333333333;
			yardpersecond=(edtValue)*0.0055555556;
			mileperminute=(edtValue)*0.0001893939;
			milepersecond=(edtValue)*0.0000031566;
			knot=(edtValue)*0.00987473;
			knotUK=(edtValue)*0.0098684211;
			velocotyLVacuum=(edtValue)*1.694505603E-11;
			cosmicvfirst=(edtValue)*6.430379746E-7;
			cosmicvsecond=(edtValue)*4.535714285E-7;
			cosmicvthird=(edtValue)*3.047390521E-7;
			earthv=(edtValue)*1.706702502E-7;
			vsoundpurewater=(edtValue)*0.0000034262;
			vsoundseawater=(edtValue)*0.0000033386;
			mach20=(edtValue)*0.0000147846;
			machsistandard=(edtValue)*0.0000172176;
			
			break;	
			
       case "Foot/second - ft/s":
			
   	    meterpersecond=(edtValue)*0.3048;
			kilometerperhour=(edtValue)*1.09728;
			mileperhour=(edtValue)*0.6818181818;
			meterperhour=(edtValue)*1097.28;
			meterperminute=(edtValue)*18.288;
			kilometerperminute=(edtValue)*0.018288;
			kilometerpersecond=(edtValue)*0.0003048;
			centimeterperhour=(edtValue)*109728;
			centimeterperminute=(edtValue)*1828.8;
			centimeterpersecond=(edtValue)*30.48;
			millimeterperhour=(edtValue)*1097280;
			millimeterperminute=(edtValue)*18288.0000000000;
			millimeterpersecond=(edtValue)*304.8;
			footperhour=(edtValue)*3600;
			footperminute=(edtValue)*60;
			footpersecond=(edtValue)*1;
			yardperhour=(edtValue)*1200;
			yardperminute=(edtValue)*20;
			yardpersecond=(edtValue)*0.3333333333;
			mileperminute=(edtValue)*0.0113636364;
			milepersecond=(edtValue)*0.0001893939;
			knot=(edtValue)*0.5924838013;
			knotUK=(edtValue)*0.5921052632;
			velocotyLVacuum=(edtValue)*1.016703362E-9;
			cosmicvfirst=(edtValue)*0.0000385823;
			cosmicvsecond=(edtValue)*0.0000272143;
			cosmicvthird=(edtValue)*0.0000182843;
			earthv=(edtValue)*0.0000102402;
			vsoundpurewater=(edtValue)*0.0002055709;
			vsoundseawater=(edtValue)*0.0002003155;
			mach20=(edtValue)*0.000887078;
			machsistandard=(edtValue)*0.0010330579;
			
			break;	
			
       case "Yard/hour - yd/h":
			
   	    meterpersecond=(edtValue)*0.000254;
			kilometerperhour=(edtValue)*0.0009144;
			mileperhour=(edtValue)*0.0005681818;
			meterperhour=(edtValue)*0.9144;
			meterperminute=(edtValue)*0.01524;
			kilometerperminute=(edtValue)*0.00001524;
			kilometerpersecond=(edtValue)*2.54E-7;
			centimeterperhour=(edtValue)*91.44;
			centimeterperminute=(edtValue)*1.524;
			centimeterpersecond=(edtValue)*0.0254;
			millimeterperhour=(edtValue)*914.4;
			millimeterperminute=(edtValue)*15.24;
			millimeterpersecond=(edtValue)*0.254;
			footperhour=(edtValue)*3;
			footperminute=(edtValue)*0.05;
			footpersecond=(edtValue)*0.0008333333;
			yardperhour=(edtValue)*1;
			yardperminute=(edtValue)*0.0166666667;
			yardpersecond=(edtValue)*0.0002777778;
			mileperminute=(edtValue)*0.0000094697;
			milepersecond=(edtValue)*1.578282828E-7;
			knot=(edtValue)*0.0004937365;
			knotUK=(edtValue)*0.0004934211;
			velocotyLVacuum=(edtValue)*8.472528018E-13;
			cosmicvfirst=(edtValue)*3.215189873E-8;
			cosmicvsecond=(edtValue)*2.267857142E-8;
			cosmicvthird=(edtValue)*1.52369526E-8;
			earthv=(edtValue)*8.533512514E-9;
			vsoundpurewater=(edtValue)*1.713090982E-7;
			vsoundseawater=(edtValue)*1.669295478E-7;
			mach20=(edtValue)*7.392316647E-7;
			machsistandard=(edtValue)*8.608815426E-7;
			
			break;	
			
       case "Yard/minute - yd/min":
			
   	    meterpersecond=(edtValue)*0.01524;
			kilometerperhour=(edtValue)*0.054864;
			mileperhour=(edtValue)*0.0340909091;
			meterperhour=(edtValue)*54.864;
			meterperminute=(edtValue)*0.9144;
			kilometerperminute=(edtValue)*0.0009144;
			kilometerpersecond=(edtValue)*0.00001524;
			centimeterperhour=(edtValue)*5486.4;
			centimeterperminute=(edtValue)*91.44;
			centimeterpersecond=(edtValue)*1.524;
			millimeterperhour=(edtValue)*54864.0000000000;
			millimeterperminute=(edtValue)*914.4;
			millimeterpersecond=(edtValue)*15.24;
			footperhour=(edtValue)*180;
			footperminute=(edtValue)*3;
			footpersecond=(edtValue)*0.05;
			yardperhour=(edtValue)*60;
			yardperminute=(edtValue)*1;
			yardpersecond=(edtValue)*0.0166666667;
			mileperminute=(edtValue)*0.0005681818;
			milepersecond=(edtValue)*0.0000094697;
			knot=(edtValue)*0.0296241901;
			knotUK=(edtValue)*0.0296052632;
			velocotyLVacuum=(edtValue)*5.08351681E-11;
			cosmicvfirst=(edtValue)*0.0000019291;
			cosmicvsecond=(edtValue)*0.0000013607;
			cosmicvthird=(edtValue)*9.142171565E-7;
			earthv=(edtValue)*5.120107508E-7;
			vsoundpurewater=(edtValue)*0.0000102785;
			vsoundseawater=(edtValue)*0.0000100158;
			mach20=(edtValue)*0.0000443539;
			machsistandard=(edtValue)*0.0000516529;
			
			break;	
			
       case "Yard/second - yd/s":
			
   	    meterpersecond=(edtValue)*0.9144;
			kilometerperhour=(edtValue)*3.29184;
			mileperhour=(edtValue)*2.0454545455;
			meterperhour=(edtValue)*3291.84;
			meterperminute=(edtValue)*54.864;
			kilometerperminute=(edtValue)*0.054864;
			kilometerpersecond=(edtValue)*0.0009144;
			centimeterperhour=(edtValue)*329184.0000000000;
			centimeterperminute=(edtValue)*5486.4;
			centimeterpersecond=(edtValue)*91.44;
			millimeterperhour=(edtValue)*3291840.0000000000;
			millimeterperminute=(edtValue)*54864.0000000000;
			millimeterpersecond=(edtValue)*914.4;
			footperhour=(edtValue)*10800;
			footperminute=(edtValue)*180;
			footpersecond=(edtValue)*3;
			yardperhour=(edtValue)*3600;
			yardperminute=(edtValue)*60;
			yardpersecond=(edtValue)*1;
			mileperminute=(edtValue)*0.0340909091;
			milepersecond=(edtValue)*0.0005681818;
			knot=(edtValue)*1.7774514039;
			knotUK=(edtValue)*1.7763157895;
			velocotyLVacuum=(edtValue)*3.050110086E-9;
			cosmicvfirst=(edtValue)*0.0001157468;
			cosmicvsecond=(edtValue)*0.0000816429;
			cosmicvthird=(edtValue)*0.000054853;
			earthv=(edtValue)*0.0000307206;
			vsoundpurewater=(edtValue)*0.0006167128;
			vsoundseawater=(edtValue)*0.0006009464;
			mach20=(edtValue)*0.002661234;
			machsistandard=(edtValue)*0.0030991736;
			
			break;	
			
       case "Mile/hour - mi/h":
			
   	    meterpersecond=(edtValue)*0.44704;
			kilometerperhour=(edtValue)*1.609344;
			mileperhour=(edtValue)*1;
			meterperhour=(edtValue)*1609.344;
			meterperminute=(edtValue)*26.8224;
			kilometerperminute=(edtValue)*0.0268224;
			kilometerpersecond=(edtValue)*0.00044704;
			centimeterperhour=(edtValue)*160934.4;
			centimeterperminute=(edtValue)*2682.24;
			centimeterpersecond=(edtValue)*44.704;
			millimeterperhour=(edtValue)*1609344.0000000000;
			millimeterperminute=(edtValue)*26822.4;
			millimeterpersecond=(edtValue)*447.04;
			footperhour=(edtValue)*5280;
			footperminute=(edtValue)*88;
			footpersecond=(edtValue)*1.4666666667;
			yardperhour=(edtValue)*1760;
			yardperminute=(edtValue)*29.333333333;
			yardpersecond=(edtValue)*0.4888888889;
			mileperminute=(edtValue)*0.0166666667;
			milepersecond=(edtValue)*0.0002777778;
			knot=(edtValue)*0.8689762419;
			knotUK=(edtValue)*0.8684210526;
			velocotyLVacuum=(edtValue)*1.491164931E-9;
			cosmicvfirst=(edtValue)*0.0000565873;
			cosmicvsecond=(edtValue)*0.0000399143;
			cosmicvthird=(edtValue)*0.000026817;
			earthv=(edtValue)*0.000015019;
			vsoundpurewater=(edtValue)*0.000301504;
			vsoundseawater=(edtValue)*0.000293796;
			mach20=(edtValue)*0.0013010477;
			machsistandard=(edtValue)*0.0015151515;
			
			break;	
			
       case "Mile/minute - mi/min":
			
   	        meterpersecond=(edtValue)*26.8224;
			kilometerperhour=(edtValue)*96.56064;
			mileperhour=(edtValue)*60;
			meterperhour=(edtValue)*96560.64;
			meterperminute=(edtValue)*1609.344;
			kilometerperminute=(edtValue)*1.609344;
			kilometerpersecond=(edtValue)*0.0268224;
			centimeterperhour=(edtValue)*9656064.0000000000;
			centimeterperminute=(edtValue)*160934.4;
			centimeterpersecond=(edtValue)*2682.24;
			millimeterperhour=(edtValue)*96560640.0000000000;
			millimeterperminute=(edtValue)*1609344.0000000000;
			millimeterpersecond=(edtValue)*26822.4;
			footperhour=(edtValue)*316800;
			footperminute=(edtValue)*5280;
			footpersecond=(edtValue)*88;
			yardperhour=(edtValue)*105600;
			yardperminute=(edtValue)*1760;
			yardpersecond=(edtValue)*29.333333333;
			mileperminute=(edtValue)*1;
			milepersecond=(edtValue)*0.0166666667;
			knot=(edtValue)*52.138574514;
			knotUK=(edtValue)*52.105263158;
			velocotyLVacuum=(edtValue)*8.946989587E-8;
			cosmicvfirst=(edtValue)*0.0033952405;
			cosmicvsecond=(edtValue)*0.0023948571;
			cosmicvthird=(edtValue)*0.0016090222;
			earthv=(edtValue)*0.0009011389;
			vsoundpurewater=(edtValue)*0.0180902408;
			vsoundseawater=(edtValue)*0.0176277603;
			mach20=(edtValue)*0.0780628638;
			machsistandard=(edtValue)*0.0909090909  ;
			
			break;	
			
       case "Mile/second - mi/s":
			
   	    meterpersecond=(edtValue)*1609.344;
			kilometerperhour=(edtValue)*5793.6384;
			mileperhour=(edtValue)*3600;
			meterperhour=(edtValue)*5793638.4;
			meterperminute=(edtValue)*96560.64;
			kilometerperminute=(edtValue)*96.56064;
			kilometerpersecond=(edtValue)*1.609344;
			centimeterperhour=(edtValue)*579363840.0000000000;
			centimeterperminute=(edtValue)*9656064.0000000000;
			centimeterpersecond=(edtValue)*160934.4;
			millimeterperhour=(edtValue)*5793638400.0000000000;
			millimeterperminute=(edtValue)*96560640.0000000000;
			millimeterpersecond=(edtValue)*1609344.0000000000;
			footperhour=(edtValue)*19008000;
			footperminute=(edtValue)*316800;
			footpersecond=(edtValue)*5280;
			yardperhour=(edtValue)*6336000;
			yardperminute=(edtValue)*105600;
			yardpersecond=(edtValue)*1760;
			mileperminute=(edtValue)*60;
			milepersecond=(edtValue)*1;
			knot=(edtValue)*3128.3144708;
			knotUK=(edtValue)*3126.3157895;
			velocotyLVacuum=(edtValue)*0.0000053682;
			cosmicvfirst=(edtValue)*0.2037144304;
			cosmicvsecond=(edtValue)*0.1436914286;
			cosmicvthird=(edtValue)*0.0965413317;
			earthv=(edtValue)*0.0540683353;
			vsoundpurewater=(edtValue)*1.0854144466;
			vsoundseawater=(edtValue)*1.0576656151;
			mach20=(edtValue)*4.6837718277;
			machsistandard=(edtValue)*5.4545454545;
			
			break;	
			
			
       case "Knot - knots":
			
   	        meterpersecond=(edtValue)*0.5144444444;
			kilometerperhour=(edtValue)*1.852;
			mileperhour=(edtValue)*1.150779448;
			meterperhour=(edtValue)*1852;
			meterperminute=(edtValue)*30.866666667;
			kilometerperminute=(edtValue)*0.0308666667;
			kilometerpersecond=(edtValue)*0.0005144444;
			centimeterperhour=(edtValue)*185200.0000000000;
			centimeterperminute=(edtValue)*3086.6666667;
			centimeterpersecond=(edtValue)*51.444444444;
			millimeterperhour=(edtValue)*1852000;
			millimeterperminute=(edtValue)*30866.666667;
			millimeterpersecond=(edtValue)*514.44444444;
			footperhour=(edtValue)*6076.1154856;
			footperminute=(edtValue)*101.26859143;
			footpersecond=(edtValue)*1.6878098571;
			yardperhour=(edtValue)*2025.3718285;
			yardperminute=(edtValue)*33.756197142;
			yardpersecond=(edtValue)*0.5626032857;
			mileperminute=(edtValue)*0.0191796575;
			milepersecond=(edtValue)*0.000319661;
			knot=(edtValue)*1;
			knotUK=(edtValue)*0.9993610996;
			velocotyLVacuum=(edtValue)*1.716001956E-9;
			cosmicvfirst=(edtValue)*0.0000651195;
			cosmicvsecond=(edtValue)*0.0000459325;
			cosmicvthird=(edtValue)*0.0000308605;
			earthv=(edtValue)*0.0000172835;
			vsoundpurewater=(edtValue)*0.0003469646;
			vsoundseawater=(edtValue)*0.0003380944;
			mach20=(edtValue)*0.001497219;
			machsistandard=(edtValue)*0.0017436052;
			
			break;	
			
			
       case "Knot (UK) - knots(UK)":
			
   	    meterpersecond=(edtValue)*0.5147733333;
			kilometerperhour=(edtValue)*1.853184;
			mileperhour=(edtValue)*1.1515151515;
			meterperhour=(edtValue)*1853.184;
			meterperminute=(edtValue)*30.8864;
			kilometerperminute=(edtValue)*0.0308864;
			kilometerpersecond=(edtValue)*0.0005147733;
			centimeterperhour=(edtValue)*185318.4;
			centimeterperminute=(edtValue)*3088.64;
			centimeterpersecond=(edtValue)*51.477333333;
			millimeterperhour=(edtValue)*1853184.0000000000;
			millimeterperminute=(edtValue)*30886.4;
			millimeterpersecond=(edtValue)*514.77333333;
			footperhour=(edtValue)*6080;
			footperminute=(edtValue)*101.33333333;
			footpersecond=(edtValue)*1.6888888889;
			yardperhour=(edtValue)*2026.6666667;
			yardperminute=(edtValue)*33.777777778;
			yardpersecond=(edtValue)*0.562962963;
			mileperminute=(edtValue)*0.0191919192;
			milepersecond=(edtValue)*0.0003198653;
			knot=(edtValue)*1.0006393089;
			knotUK=(edtValue)*1;
			velocotyLVacuum=(edtValue)*1.717099011E-9;
			cosmicvfirst=(edtValue)*0.0000651612;
			cosmicvsecond=(edtValue)*0.0000459619;
			cosmicvthird=(edtValue)*0.0000308802;
			earthv=(edtValue)*0.0000172946;
			vsoundpurewater=(edtValue)*0.0003471864;
			vsoundseawater=(edtValue)*0.0003383106;
			mach20=(edtValue)*0.0014981762;
			machsistandard=(edtValue)*0.0017447199;
			
			break;	
			
			
       case "Velocity of light in vacuum - c":
			
   	        meterpersecond=(edtValue)*299792458;
			kilometerperhour=(edtValue)*1079252848.8;
			mileperhour=(edtValue)*670616629.38;
			meterperhour=(edtValue)*1079252848800.0000000000;
			meterperminute=(edtValue)*17987547480.0000000000;
			kilometerperminute=(edtValue)*17987547.48;
			kilometerpersecond=(edtValue)*299792.458;
			centimeterperhour=(edtValue)*107925284880000.0000000000;
			centimeterperminute=(edtValue)*1798754748000.0000000000;
			centimeterpersecond=(edtValue)*29979245800.0000000000;
			millimeterperhour=(edtValue)*1079252848799998.0000000000;
			millimeterperminute=(edtValue)*17987547480000.0000000000;
			millimeterpersecond=(edtValue)*299792458000.0000000000;
			footperhour=(edtValue)*3540855803150.0000000000;
			footperminute=(edtValue)*59014263386.0000000000;
			footpersecond=(edtValue)*983571056.43;
			yardperhour=(edtValue)*1180285267717.0000000000;
			yardperminute=(edtValue)*19671421129.0000000000;
			yardpersecond=(edtValue)*327857018.81;
			mileperminute=(edtValue)*11176943.823;
			milepersecond=(edtValue)*186282.39705;
			knot=(edtValue)*582749918.36;
			knotUK=(edtValue)*582377599.2;
			velocotyLVacuum=(edtValue)*1;
			cosmicvfirst=(edtValue)*37948.412405;
			cosmicvsecond=(edtValue)*26767.18375;
			cosmicvthird=(edtValue)*17983.95069;
			earthv=(edtValue)*10071.979103;
			vsoundpurewater=(edtValue)*202193.60491;
			vsoundseawater=(edtValue)*197024.48607;
			mach20=(edtValue)*872504.24331;
			machsistandard=(edtValue)*1016085.8021;
			
			break;	
			
       case "Cosmic velocity - first - hom":
			
   	         meterpersecond=(edtValue)*7900;
			kilometerperhour=(edtValue)*28440;
			mileperhour=(edtValue)*17671.796707;
			meterperhour=(edtValue)*28440000;
			meterperminute=(edtValue)*474000;
			kilometerperminute=(edtValue)*474;
			kilometerpersecond=(edtValue)*7.9;
			centimeterperhour=(edtValue)*2844000000.0000000000;
			centimeterperminute=(edtValue)*47400000.0000000000;
			centimeterpersecond=(edtValue)*790000.0000000000;
			millimeterperhour=(edtValue)*28440000000.0000000000;
			millimeterperminute=(edtValue)*474000000.0000000000;
			millimeterpersecond=(edtValue)*7900000.0000000000;
			footperhour=(edtValue)*93307086.614;
			footperminute=(edtValue)*1555118.1102;
			footpersecond=(edtValue)*25918.635171;
			yardperhour=(edtValue)*31102362.205;
			yardperminute=(edtValue)*518372.70341;
			yardpersecond=(edtValue)*8639.5450569;
			mileperminute=(edtValue)*294.52994512;
			milepersecond=(edtValue)*4.9088324187;
			knot=(edtValue)*15356.37149;
			knotUK=(edtValue)*15346.560298;
			velocotyLVacuum=(edtValue)*0.0000263516;
			cosmicvfirst=(edtValue)*1;
			cosmicvsecond=(edtValue)*0.7053571429;
			cosmicvthird=(edtValue)*0.473905219;
			earthv=(edtValue)*0.2654123971;
			vsoundpurewater=(edtValue)*5.3281176233;
			vsoundseawater=(edtValue)*5.1919032597;
			mach20=(edtValue)*22.99185099;
			machsistandard=(edtValue)*26.775449556;
			
			break;	
			
       case "Cosmic velocity - second - cosmic":
			
   	    meterpersecond=(edtValue)*11200;
			kilometerperhour=(edtValue)*40320;
			mileperhour=(edtValue)*25053.686471;
			meterperhour=(edtValue)*40320000;
			meterperminute=(edtValue)*672000;
			kilometerperminute=(edtValue)*672;
			kilometerpersecond=(edtValue)*11.2;
			centimeterperhour=(edtValue)*4032000000.0000000000;
			centimeterperminute=(edtValue)*67200000.0000000000;
			centimeterpersecond=(edtValue)*1120000.0000000000;
			millimeterperhour=(edtValue)*40320000000.0000000000;
			millimeterperminute=(edtValue)*672000000.0000000000;
			millimeterpersecond=(edtValue)*11200000.0000000000;
			footperhour=(edtValue)*132283464.57;
			footperminute=(edtValue)*2204724.4094;
			footpersecond=(edtValue)*36745.406824;
			yardperhour=(edtValue)*44094488.189;
			yardperminute=(edtValue)*734908.13648;
			yardpersecond=(edtValue)*12248.468941;
			mileperminute=(edtValue)*417.56144118;
			milepersecond=(edtValue)*6.9593573531;
			knot=(edtValue)*21771.058315;
			knotUK=(edtValue)*21757.148777;
			velocotyLVacuum=(edtValue)*0.0000373592;
			cosmicvfirst=(edtValue)*1.417721519;
			cosmicvsecond=(edtValue)*1;
			cosmicvthird=(edtValue)*0.6718656269;
			earthv=(edtValue)*0.3762808668;
			vsoundpurewater=(edtValue)*7.5537870102;
			vsoundseawater=(edtValue)*7.3606729758;
			mach20=(edtValue)*32.596041909;
			machsistandard=(edtValue)*37.960131017;
			
			break;	
			
       case "Cosmic velocity - third - cosmic":
			
   	    meterpersecond=(edtValue)*16670;
			kilometerperhour=(edtValue)*60012;
			mileperhour=(edtValue)*37289.727989;
			meterperhour=(edtValue)*60012000;
			meterperminute=(edtValue)*1000200;
			kilometerperminute=(edtValue)*1000.2;
			kilometerpersecond=(edtValue)*16.67;
			centimeterperhour=(edtValue)*6001200000.0000000000;
			centimeterperminute=(edtValue)*100020000.0000000000;
			centimeterpersecond=(edtValue)*1667000.0000000000;
			millimeterperhour=(edtValue)*60012000000.0000000000;
			millimeterperminute=(edtValue)*1000200000.0000000000;
			millimeterpersecond=(edtValue)*16670000.0000000000;
			footperhour=(edtValue)*196889763.78;
			footperminute=(edtValue)*3281496.063;
			footpersecond=(edtValue)*54691.60105;
			yardperhour=(edtValue)*65629921.26;
			yardperminute=(edtValue)*1093832.021;
			yardpersecond=(edtValue)*18230.533683;
			mileperminute=(edtValue)*621.49546648;
			milepersecond=(edtValue)*10.358257775;
			knot=(edtValue)*32403.887689;
			knotUK=(edtValue)*32383.184832;
			velocotyLVacuum=(edtValue)*0.0000556051;
			cosmicvfirst=(edtValue)*2.1101265823;
			cosmicvsecond=(edtValue)*1.4883928571;
			cosmicvthird=(edtValue)*1;
			earthv=(edtValue)*0.5600537544;
			vsoundpurewater=(edtValue)*11.24300263;
			vsoundseawater=(edtValue)*10.955573081;
			mach20=(edtValue)*48.515715949;
			machsistandard=(edtValue)*56.499587861;
			
			break;	
			
       case "Earth's velocity - earth":
			
   	    meterpersecond=(edtValue)*29765;
			kilometerperhour=(edtValue)*107154;
			mileperhour=(edtValue)*66582.408733;
			meterperhour=(edtValue)*107154000;
			meterperminute=(edtValue)*1785900;
			kilometerperminute=(edtValue)*1785.9;
			kilometerpersecond=(edtValue)*29.765;
			centimeterperhour=(edtValue)*10715400000.0000000000;
			centimeterperminute=(edtValue)*178590000.0000000000;
			centimeterpersecond=(edtValue)*2976500.0000000000;
			millimeterperhour=(edtValue)*107154000000.0000000000;
			millimeterperminute=(edtValue)*1785900000.0000000000;
			millimeterpersecond=(edtValue)*29765000.0000000000;
			footperhour=(edtValue)*351555118.11;
			footperminute=(edtValue)*5859251.9685;
			footpersecond=(edtValue)*97654.199475;
			yardperhour=(edtValue)*117185039.37;
			yardperminute=(edtValue)*1953083.9895;
			yardpersecond=(edtValue)*32551.399825;
			mileperminute=(edtValue)*1109.7068122;
			milepersecond=(edtValue)*18.495113537;
			knot=(edtValue)*57858.531317;
			knotUK=(edtValue)*57821.565479;
			velocotyLVacuum=(edtValue)*0.0000992854;
			cosmicvfirst=(edtValue)*3.767721519;
			cosmicvsecond=(edtValue)*2.6575892857;
			cosmicvthird=(edtValue)*1.7855428914;
			earthv=(edtValue)*1;
			vsoundpurewater=(edtValue)*20.074863425;
			vsoundseawater=(edtValue)*19.561645636;
			mach20=(edtValue)*86.626891735;
			machsistandard=(edtValue)*100.88243747;
			
			break;	
			
			
			
       case "Velocity of sound in pure water - sound":
			
   	    meterpersecond=(edtValue)*1482.7;
			kilometerperhour=(edtValue)*5337.72;
			mileperhour=(edtValue)*3316.7054402;
			meterperhour=(edtValue)*5337720;
			meterperminute=(edtValue)*88962;
			kilometerperminute=(edtValue)*88.962;
			kilometerpersecond=(edtValue)*1.4827;
			centimeterperhour=(edtValue)*533772000.0000000000;
			centimeterperminute=(edtValue)*8896200.0000000000;
			centimeterpersecond=(edtValue)*148270.0000000000;
			millimeterperhour=(edtValue)*5337720000.0000000000;
			millimeterperminute=(edtValue)*88962000.0000000000;
			millimeterpersecond=(edtValue)*1482700.0000000000;
			footperhour=(edtValue)*17512204.724;
			footperminute=(edtValue)*291870.07874;
			footpersecond=(edtValue)*4864.5013123;
			yardperhour=(edtValue)*5837401.5748;
			yardperminute=(edtValue)*97290.026247;
			yardpersecond=(edtValue)*1621.5004374;
			mileperminute=(edtValue)*55.278424004;
			milepersecond=(edtValue)*0.9213070667;
			knot=(edtValue)*2882.1382289;
			knotUK=(edtValue)*2880.2968297;
			velocotyLVacuum=(edtValue)*0.0000049458;
			cosmicvfirst=(edtValue)*0.1876835443;
			cosmicvsecond=(edtValue)*0.1323839286;
			cosmicvthird=(edtValue)*0.0889442112;
			earthv=(edtValue)*0.0498135394;
			vsoundpurewater=(edtValue)*1;
			vsoundseawater=(edtValue)*0.9744348055;
			mach20=(edtValue)*4.3151920838;
			machsistandard=(edtValue)*5.0253112731;
			
			break;	
			
       case "Velocity of sound in sea water - sound":
			
   	    meterpersecond=(edtValue)*1521.6;
			kilometerperhour=(edtValue)*5477.76;
			mileperhour=(edtValue)*3403.722262;
			meterperhour=(edtValue)*5477760;
			meterperminute=(edtValue)*91296;
			kilometerperminute=(edtValue)*91.296;
			kilometerpersecond=(edtValue)*1.5216;
			centimeterperhour=(edtValue)*547776000.0000000000;
			centimeterperminute=(edtValue)*9129600.0000000000;
			centimeterpersecond=(edtValue)*152160.0000000000;
			millimeterperhour=(edtValue)*5477760000.0000000000;
			millimeterperminute=(edtValue)*91296000.0000000000;
			millimeterpersecond=(edtValue)*1521600.0000000000;
			footperhour=(edtValue)*17971653.543;
			footperminute=(edtValue)*299527.55906;
			footpersecond=(edtValue)*4992.1259843;
			yardperhour=(edtValue)*5990551.1811;
			yardperminute=(edtValue)*99842.519685;
			yardpersecond=(edtValue)*1664.0419948;
			mileperminute=(edtValue)*56.728704366;
			milepersecond=(edtValue)*0.9454784061;
			knot=(edtValue)*2957.7537797;
			knotUK=(edtValue)*2955.8640696;
			velocotyLVacuum=(edtValue)*0.0000050755;
			cosmicvfirst=(edtValue)*0.1926075949;
			cosmicvsecond=(edtValue)*0.1358571429;
			cosmicvthird=(edtValue)*0.0912777445;
			earthv=(edtValue)*0.0511204435;
			vsoundpurewater=(edtValue)*1.026235921;
			vsoundseawater=(edtValue)*1;
			mach20=(edtValue)*4.4284051222;
			machsistandard=(edtValue)*5.1571549424;
			
			break;	
			
			
       case "Mach - mach":
			
   	        meterpersecond=(edtValue)*343.6;
			kilometerperhour=(edtValue)*1236.96;
			mileperhour=(edtValue)*768.61130995;
			meterperhour=(edtValue)*1236960;
			meterperminute=(edtValue)*20616;
			kilometerperminute=(edtValue)*20.616;
			kilometerpersecond=(edtValue)*0.3436;
			centimeterperhour=(edtValue)*123696000.0000000000;
			centimeterperminute=(edtValue)*2061600.0000000000;
			centimeterpersecond=(edtValue)*34360.0000000000;
			millimeterperhour=(edtValue)*1236960000.0000000000;
			millimeterperminute=(edtValue)*20616000.0000000000;
			millimeterpersecond=(edtValue)*343600.0000000000;
			footperhour=(edtValue)*4058267.7165;
			footperminute=(edtValue)*67637.795276;
			footpersecond=(edtValue)*1127.2965879;
			yardperhour=(edtValue)*1352755.9055;
			yardperminute=(edtValue)*22545.931759;
			yardpersecond=(edtValue)*375.76552931;
			mileperminute=(edtValue)*12.810188499;
			milepersecond=(edtValue)*0.2135031417;
			knot=(edtValue)*667.9049676;
			knotUK=(edtValue)*667.47824285;
			velocotyLVacuum=(edtValue)*0.0000011461;
			cosmicvfirst=(edtValue)*0.0434936709;
			cosmicvsecond=(edtValue)*0.0306785714;
			cosmicvthird=(edtValue)*0.0206118776;
			earthv=(edtValue)*0.0115437594;
			vsoundpurewater=(edtValue)*0.2317393943;
			vsoundseawater=(edtValue)*0.2258149317;
			mach20=(edtValue)*1;
			machsistandard=(edtValue)*1.1645625908;
			
			break;	
			
			
       case "Mach (SI standard) - mach":

   	        meterpersecond=(edtValue)*295.0464;
			kilometerperhour=(edtValue)*1062.16704;
			mileperhour=(edtValue)*660;
			meterperhour=(edtValue)*1062167.04;
			meterperminute=(edtValue)*17702.784;
			kilometerperminute=(edtValue)*17.702784;
			kilometerpersecond=(edtValue)*0.2950464;
			centimeterperhour=(edtValue)*106216704;
			centimeterperminute=(edtValue)*1770278.4;
			centimeterpersecond=(edtValue)*29504.64;
			millimeterperhour=(edtValue)*1062167040.0000000000;
			millimeterperminute=(edtValue)*17702784.0000000000;
			millimeterpersecond=(edtValue)*295046.4;
			footperhour=(edtValue)*3484800;
			footperminute=(edtValue)*58080;
			footpersecond=(edtValue)*968;
			yardperhour=(edtValue)*1161600;
			yardperminute=(edtValue)*19360;
			yardpersecond=(edtValue)*322.66666667;
			mileperminute=(edtValue)*11;
			milepersecond=(edtValue)*0.1833333333;
			knot=(edtValue)*573.52431965;
			knotUK=(edtValue)*573.15789474;
			velocotyLVacuum=(edtValue)*9.841688545E-7;
			cosmicvfirst=(edtValue)*0.0373476456;
			cosmicvsecond=(edtValue)*0.0263434286;
			cosmicvthird=(edtValue)*0.0176992442;
			earthv=(edtValue)*0.0099125281;
			vsoundpurewater=(edtValue)*0.1989926485;
			vsoundseawater=(edtValue)*0.1939053628;
			mach20=(edtValue)*0.8586915017;
			machsistandard=(edtValue)*1;
			break;
		}
		 results.setMeterpersecond(meterpersecond);
		 results.setKilometerperhour(kilometerperhour);
		 results.setMileperhour(mileperhour);
		 results.setMeterperhour(meterperhour);
		 results.setMeterperminute(meterperminute);
		 results.setKilometerperminute(kilometerperminute);
		 results.setKilometerpersecond(kilometerpersecond);
		 results.setCentimeterperhour(centimeterperhour);
		 results.setCentimeterperminute(centimeterperminute);
		 results.setCentimeterpersecond(centimeterpersecond);
		 results.setMillimeterperhour(millimeterperhour);
		 results.setMillimeterperminute(millimeterperminute);
		 results.setMillimeterpersecond(millimeterpersecond);
		 results.setFootperhour(footperhour);
		 results.setFootperminute(footperminute);
		 results.setFootpersecond(footpersecond);
		 results.setYardperhour(yardperhour);
		 results.setYardperminute(yardperminute);
		 results.setYardpersecond(yardpersecond);
		 results.setMileperminute(mileperminute);
		 results.setMilepersecond(milepersecond);
		 results.setKnot(knot);
		 results.setKnotUK(knotUK);
		 results.setVelocotyLVacuum(velocotyLVacuum);
		 results.setCosmicvfirst(cosmicvfirst);
		 results.setCosmicvsecond(cosmicvsecond);
		 results.setCosmicvthird(cosmicvthird);
		 results.setEarthv(earthv);
		 results.setVsoundpurewater(vsoundpurewater);
		 results.setVsoundseawater(vsoundseawater);
		 results.setMach20(mach20);
		 results.setMachsistandard(machsistandard);
		 converterArray.add(results);
		return converterArray;
}

	public class ConversionResults{
		private double meterpersecond,meterperhour,meterperminute,kilometerperhour,kilometerperminute,kilometerpersecond,centimeterperhour,centimeterperminute,centimeterpersecond,
		millimeterperhour,millimeterperminute,millimeterpersecond,footperhour,footperminute,footpersecond,yardperhour,yardperminute,yardpersecond,mileperhour,mileperminute,milepersecond,
		knot,knotUK,velocotyLVacuum,cosmicvfirst,cosmicvsecond,cosmicvthird,earthv,vsoundpurewater,vsoundseawater,mach20,machsistandard;

		public double getMeterpersecond() {
			return meterpersecond;
		}

		public void setMeterpersecond(double meterpersecond) {
			this.meterpersecond = meterpersecond;
		}

		public double getMeterperhour() {
			return meterperhour;
		}

		public void setMeterperhour(double meterperhour) {
			this.meterperhour = meterperhour;
		}

		public double getMeterperminute() {
			return meterperminute;
		}

		public void setMeterperminute(double meterperminute) {
			this.meterperminute = meterperminute;
		}

		public double getKilometerperhour() {
			return kilometerperhour;
		}

		public void setKilometerperhour(double kilometerperhour) {
			this.kilometerperhour = kilometerperhour;
		}

		public double getKilometerperminute() {
			return kilometerperminute;
		}

		public void setKilometerperminute(double kilometerperminute) {
			this.kilometerperminute = kilometerperminute;
		}

		public double getKilometerpersecond() {
			return kilometerpersecond;
		}

		public void setKilometerpersecond(double kilometerpersecond) {
			this.kilometerpersecond = kilometerpersecond;
		}

		public double getCentimeterperhour() {
			return centimeterperhour;
		}

		public void setCentimeterperhour(double centimeterperhour) {
			this.centimeterperhour = centimeterperhour;
		}

		public double getCentimeterperminute() {
			return centimeterperminute;
		}

		public void setCentimeterperminute(double centimeterperminute) {
			this.centimeterperminute = centimeterperminute;
		}

		public double getCentimeterpersecond() {
			return centimeterpersecond;
		}

		public void setCentimeterpersecond(double centimeterpersecond) {
			this.centimeterpersecond = centimeterpersecond;
		}

		public double getMillimeterperhour() {
			return millimeterperhour;
		}

		public void setMillimeterperhour(double millimeterperhour) {
			this.millimeterperhour = millimeterperhour;
		}

		public double getMillimeterperminute() {
			return millimeterperminute;
		}

		public void setMillimeterperminute(double millimeterperminute) {
			this.millimeterperminute = millimeterperminute;
		}

		public double getMillimeterpersecond() {
			return millimeterpersecond;
		}

		public void setMillimeterpersecond(double millimeterpersecond) {
			this.millimeterpersecond = millimeterpersecond;
		}

		public double getFootperhour() {
			return footperhour;
		}

		public void setFootperhour(double footperhour) {
			this.footperhour = footperhour;
		}

		public double getFootperminute() {
			return footperminute;
		}

		public void setFootperminute(double footperminute) {
			this.footperminute = footperminute;
		}

		public double getFootpersecond() {
			return footpersecond;
		}

		public void setFootpersecond(double footpersecond) {
			this.footpersecond = footpersecond;
		}

		public double getYardperhour() {
			return yardperhour;
		}

		public void setYardperhour(double yardperhour) {
			this.yardperhour = yardperhour;
		}

		public double getYardperminute() {
			return yardperminute;
		}

		public void setYardperminute(double yardperminute) {
			this.yardperminute = yardperminute;
		}

		public double getYardpersecond() {
			return yardpersecond;
		}

		public void setYardpersecond(double yardpersecond) {
			this.yardpersecond = yardpersecond;
		}

		public double getMileperhour() {
			return mileperhour;
		}

		public void setMileperhour(double mileperhour) {
			this.mileperhour = mileperhour;
		}

		public double getMileperminute() {
			return mileperminute;
		}

		public void setMileperminute(double mileperminute) {
			this.mileperminute = mileperminute;
		}

		public double getMilepersecond() {
			return milepersecond;
		}

		public void setMilepersecond(double milepersecond) {
			this.milepersecond = milepersecond;
		}

		public double getKnot() {
			return knot;
		}

		public void setKnot(double knot) {
			this.knot = knot;
		}

		public double getKnotUK() {
			return knotUK;
		}

		public void setKnotUK(double knotUK) {
			this.knotUK = knotUK;
		}

		public double getVelocotyLVacuum() {
			return velocotyLVacuum;
		}

		public void setVelocotyLVacuum(double velocotyLVacuum) {
			this.velocotyLVacuum = velocotyLVacuum;
		}

		public double getCosmicvfirst() {
			return cosmicvfirst;
		}

		public void setCosmicvfirst(double cosmicvfirst) {
			this.cosmicvfirst = cosmicvfirst;
		}

		public double getCosmicvsecond() {
			return cosmicvsecond;
		}

		public void setCosmicvsecond(double cosmicvsecond) {
			this.cosmicvsecond = cosmicvsecond;
		}

		public double getCosmicvthird() {
			return cosmicvthird;
		}

		public void setCosmicvthird(double cosmicvthird) {
			this.cosmicvthird = cosmicvthird;
		}

		public double getEarthv() {
			return earthv;
		}

		public void setEarthv(double earthv) {
			this.earthv = earthv;
		}

		public double getVsoundpurewater() {
			return vsoundpurewater;
		}

		public void setVsoundpurewater(double vsoundpurewater) {
			this.vsoundpurewater = vsoundpurewater;
		}

		public double getVsoundseawater() {
			return vsoundseawater;
		}

		public void setVsoundseawater(double vsoundseawater) {
			this.vsoundseawater = vsoundseawater;
		}

		public double getMach20() {
			return mach20;
		}

		public void setMach20(double mach20) {
			this.mach20 = mach20;
		}

		public double getMachsistandard() {
			return machsistandard;
		}

		public void setMachsistandard(double machsistandard) {
			this.machsistandard = machsistandard;
		}
		
}
}
