package com.nineinfosys.basicconverter.Engin;

import java.util.ArrayList;


public class Fuel {
	
	
	private double meterliter,exameterliter,petameterliter,terameterliter,gigameterliter,megameterliter,kilometerliter,hectometerliter,dekameterliter,centimeterliter,
	               mileusliter,nauticalmilelite,nauticalmilegallon,kilometergallon,metergallonus,metergallonUK,milegallonus,milegallonuk,metercubicmeter,metercubiccm,
	               metercubicyard,metercubicfoot,metercubicinch,meterquartUS,meterquartuk,meterpintUS,meterpintuk,metercupUS,metercupk,meterfluidounceus,
	               meterfluidounceuk,litermeter,liter100km,gallonUSmile,gallonUS100mi,gallonUKmile,gallonUK100mi;
	
	private double edtValue;
	
	private String conversionFrom;
	
	
	public Fuel(String conversionFrom, double edtValue) {
				
				this.conversionFrom = conversionFrom;
				this.edtValue = edtValue;
			}

			
			public ArrayList<ConversionResults> calculatefuelConversion()
			
		    {
		    
				ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
					
				ConversionResults results= new ConversionResults();
				switch(conversionFrom)
				{
				
				case "Meter/liter - m/L":
					
					meterliter=(edtValue)*1;
					exameterliter=(edtValue)*1.E-18;
					petameterliter=(edtValue)*9.999999999E-16;
					terameterliter=(edtValue)*1.E-12;
					gigameterliter=(edtValue)*1.E-9;
					megameterliter=(edtValue)*0.000001;
					kilometerliter=(edtValue)*0.001;
					hectometerliter=(edtValue)*0.01;
					dekameterliter=(edtValue)*0.1;
					centimeterliter=(edtValue)*100;
					mileusliter=(edtValue)*0.0006213712;
					nauticalmilelite=(edtValue)*0.0005395941;
					nauticalmilegallon=(edtValue)*0.0020425858;
					kilometergallon=(edtValue)*0.0037854118;
					metergallonus=(edtValue)*3.7854117834;
					metergallonUK=(edtValue)*4.5460992939;
					milegallonus=(edtValue)*0.0023521458;
					milegallonuk=(edtValue)*0.0028248094;
					metercubicmeter=(edtValue)*1000;
					metercubiccm=(edtValue)*0.001;
					metercubicyard=(edtValue)*764.55485817;
					metercubicfoot=(edtValue)*28.316846593;
					metercubicinch=(edtValue)*0.016387064;
					meterquartUS=(edtValue)*0.9463529464;
					meterquartuk=(edtValue)*1.136524823;
					meterpintUS=(edtValue)*0.473176473;
					meterpintuk=(edtValue)*0.5682624117;
					metercupUS=(edtValue)*0.2365882365;
					metercupk=(edtValue)*0.2841312059;
					meterfluidounceus=(edtValue)*0.0295735296;
					meterfluidounceuk=(edtValue)*0.0284131206;
					litermeter=(edtValue)*1;
					liter100km=(edtValue)*100000;
					gallonUSmile=(edtValue)*425.1437075;
					gallonUS100mi=(edtValue)*42514.37075;
					gallonUKmile=(edtValue)*354.00618996;
					gallonUK100mi=(edtValue)*35400.618996;
					
					 break;
                  case "Exameter/liter - Em/L":
					meterliter=(edtValue)*1000000000000000000.00;
  					exameterliter=(edtValue)*1;
  					petameterliter=(edtValue)*1000;
  					terameterliter=(edtValue)*1000000;
  					gigameterliter=(edtValue)*1000000000.0;
  					megameterliter=(edtValue)*1000000000000.00;
  					kilometerliter=(edtValue)*1000000000000000.00;
  					hectometerliter=(edtValue)*10000000000000000.00;
  					dekameterliter=(edtValue)*100000000000000000.00;
  					centimeterliter=(edtValue)*100000000000000000000.00;
  					mileusliter=(edtValue)*621371192237330.00;
  					nauticalmilelite=(edtValue)*539594075032580.00;
  					nauticalmilegallon=(edtValue)*2042585769811100.00;
  					kilometergallon=(edtValue)*3785411783400300.00;
  					metergallonus=(edtValue)*3785411783400300000.00;
  					metergallonUK=(edtValue)*4546099293920499700.00;
  					milegallonus=(edtValue)*2352145832947600.00;
  					milegallonuk=(edtValue)*2824809362796700.00;
  					metercubicmeter=(edtValue)*1.E+21;
  					metercubiccm=(edtValue)*1000000000000000.00;
  					metercubicyard=(edtValue)*764554858167780000000.00;
  					metercubicfoot=(edtValue)*28316846593194000000.00;
  					metercubicinch=(edtValue)*16387064001271000.00;
  					meterquartUS=(edtValue)*946352946387420000.00;
  					meterquartuk=(edtValue)*1136524822963399800.00;
  					meterpintUS=(edtValue)*473176472969819970.00;
  					meterpintuk=(edtValue)*568262411675480000.00;
  					metercupUS=(edtValue)*236588236484909980.00;
  					metercupk=(edtValue)*284131205918470000.00;
  					meterfluidounceus=(edtValue)*29573529564112000.00;
  					meterfluidounceuk=(edtValue)*28413120591846996.00;
  					litermeter=(edtValue)*1.E-18;
  					liter100km=(edtValue)*1.E-13;
  					gallonUSmile=(edtValue)*4.251437074E-16;
  					gallonUS100mi=(edtValue)*4.251437074E-14;
  					gallonUKmile=(edtValue)*3.540061899E-16;
  					gallonUK100mi=(edtValue)*3.540061899E-14;
					
					
					 break;
                case "Petameter/liter - Pm/L":
	
                	meterliter=(edtValue)*1000000000000000.00;
					exameterliter=(edtValue)*0.001;
					petameterliter=(edtValue)*1;
					terameterliter=(edtValue)*1000;
					gigameterliter=(edtValue)*1000000;
					megameterliter=(edtValue)*1000000000;
					kilometerliter=(edtValue)*1000000000000.00;
					hectometerliter=(edtValue)*10000000000000.00;
					dekameterliter=(edtValue)*100000000000000.00;
					centimeterliter=(edtValue)*100000000000000000.00;
					mileusliter=(edtValue)*621371192237.00;
					nauticalmilelite=(edtValue)*539594075033.00;
					nauticalmilegallon=(edtValue)*2042585769811.00;
					kilometergallon=(edtValue)*3785411783400.00;
					metergallonus=(edtValue)*3785411783400300.00;
					metergallonUK=(edtValue)*4546099293920500.00;
					milegallonus=(edtValue)*2352145832948.00;
					milegallonuk=(edtValue)*2824809362797.00;
					metercubicmeter=(edtValue)*1000000000000000000.00;
					metercubiccm=(edtValue)*1000000000000.00;
					metercubicyard=(edtValue)*764554858167780100.00;
					metercubicfoot=(edtValue)*28316846593194000.00;
					metercubicinch=(edtValue)*16387064001271.00;
					meterquartUS=(edtValue)*946352946387420.00;
					meterquartuk=(edtValue)*1136524822963400.00;
					meterpintUS=(edtValue)*473176472969820.00;
					meterpintuk=(edtValue)*568262411675480.00;
					metercupUS=(edtValue)*236588236484910.00;
					metercupk=(edtValue)*284131205918470.00;
					meterfluidounceus=(edtValue)*29573529564112.00;
					meterfluidounceuk=(edtValue)*28413120591847.00;
					litermeter=(edtValue)*1.E-15;
					liter100km=(edtValue)*1.E-10;
					gallonUSmile=(edtValue)*4.251437074E-13;
					gallonUS100mi=(edtValue)*4.251437074E-11;
					gallonUKmile=(edtValue)*3.540061899E-13;
					gallonUK100mi=(edtValue)*3.540061899E-11;
	
				 break;
	 
			case "Terameter/liter - Tm/L":
	
				meterliter=(edtValue)*1000000000000.00;
				exameterliter=(edtValue)*0.000001;
				petameterliter=(edtValue)*0.001;
				terameterliter=(edtValue)*1;
				gigameterliter=(edtValue)*1000;
				megameterliter=(edtValue)*1000000;
				kilometerliter=(edtValue)*1000000000;
				hectometerliter=(edtValue)*10000000000.00;
				dekameterliter=(edtValue)*100000000000.00;
				centimeterliter=(edtValue)*100000000000000.00;
				mileusliter=(edtValue)*621371192.24;
				nauticalmilelite=(edtValue)*539594075.03;
				nauticalmilegallon=(edtValue)*2042585769.8;
				kilometergallon=(edtValue)*3785411783.4;
				metergallonus=(edtValue)*3785411783400.00;
				metergallonUK=(edtValue)*4546099293921.00;
				milegallonus=(edtValue)*2352145832.9;
				milegallonuk=(edtValue)*2824809362.8;
				metercubicmeter=(edtValue)*1000000000000000.00;
				metercubiccm=(edtValue)*1000000000;
				metercubicyard=(edtValue)*764554858167780.00;
				metercubicfoot=(edtValue)*28316846593194.00;
				metercubicinch=(edtValue)*16387064001.00;
				meterquartUS=(edtValue)*946352946387.00;
				meterquartuk=(edtValue)*1136524822963.00;
				meterpintUS=(edtValue)*473176472970.00;
				meterpintuk=(edtValue)*568262411675.00;
				metercupUS=(edtValue)*236588236485.00;
				metercupk=(edtValue)*284131205918.00;
				meterfluidounceus=(edtValue)*29573529564.00;
				meterfluidounceuk=(edtValue)*28413120592.00;
				litermeter=(edtValue)*1.E-12;
				liter100km=(edtValue)*1.E-7;
				gallonUSmile=(edtValue)*4.251437074E-10;
				gallonUS100mi=(edtValue)*4.251437074E-8;
				gallonUKmile=(edtValue)*3.540061899E-10;
				gallonUK100mi=(edtValue)*3.540061899E-8;
	 		break;
case "Gigameter/liter - Gm/L":
	
	meterliter=(edtValue)*1000000000;
	exameterliter=(edtValue)*1.E-9;
	petameterliter=(edtValue)*0.000001;
	terameterliter=(edtValue)*0.001;
	gigameterliter=(edtValue)*1;
	megameterliter=(edtValue)*1000;
	kilometerliter=(edtValue)*1000000;
	hectometerliter=(edtValue)*10000000;
	dekameterliter=(edtValue)*100000000;
	centimeterliter=(edtValue)*100000000000.00;
	mileusliter=(edtValue)*621371.19224;
	nauticalmilelite=(edtValue)*539594.07503;
	nauticalmilegallon=(edtValue)*2042585.7698;
	kilometergallon=(edtValue)*3785411.7834;
	metergallonus=(edtValue)*3785411783.4;
	metergallonUK=(edtValue)*4546099293.9;
	milegallonus=(edtValue)*2352145.8329;
	milegallonuk=(edtValue)*2824809.3628;
	metercubicmeter=(edtValue)*1000000000000.00;
	metercubiccm=(edtValue)*1000000;
	metercubicyard=(edtValue)*764554858168.00;
	metercubicfoot=(edtValue)*28316846593.00;
	metercubicinch=(edtValue)*16387064.001;
	meterquartUS=(edtValue)*946352946.39;
	meterquartuk=(edtValue)*1136524823;
	meterpintUS=(edtValue)*473176472.97;
	meterpintuk=(edtValue)*568262411.68;
	metercupUS=(edtValue)*236588236.48;
	metercupk=(edtValue)*284131205.92;
	meterfluidounceus=(edtValue)*29573529.564;
	meterfluidounceuk=(edtValue)*28413120.592;
	litermeter=(edtValue)*1.E-9;
	liter100km=(edtValue)*0.0001;
	gallonUSmile=(edtValue)*4.251437074E-7;
	gallonUS100mi=(edtValue)*0.0000425144;
	gallonUKmile=(edtValue)*3.540061899E-7;
	gallonUK100mi=(edtValue)*0.0000354006;
	
	 break;
case "Megameter/liter - Mm/L":
	
	meterliter=(edtValue)*1000000;
	exameterliter=(edtValue)*1.E-12;
	petameterliter=(edtValue)*9.999999999E-10;
	terameterliter=(edtValue)*0.000001;
	gigameterliter=(edtValue)*0.001;
	megameterliter=(edtValue)*1;
	kilometerliter=(edtValue)*1000;
	hectometerliter=(edtValue)*10000;
	dekameterliter=(edtValue)*100000;
	centimeterliter=(edtValue)*100000000;
	mileusliter=(edtValue)*621.37119224;
	nauticalmilelite=(edtValue)*539.59407503;
	nauticalmilegallon=(edtValue)*2042.5857698;
	kilometergallon=(edtValue)*3785.4117834;
	metergallonus=(edtValue)*3785411.7834;
	metergallonUK=(edtValue)*4546099.2939;
	milegallonus=(edtValue)*2352.1458329;
	milegallonuk=(edtValue)*2824.8093628;
	metercubicmeter=(edtValue)*1000000000;
	metercubiccm=(edtValue)*1000;
	metercubicyard=(edtValue)*764554858.17;
	metercubicfoot=(edtValue)*28316846.593;
	metercubicinch=(edtValue)*16387.064001;
	meterquartUS=(edtValue)*946352.94639;
	meterquartuk=(edtValue)*1136524.823;
	meterpintUS=(edtValue)*473176.47297;
	meterpintuk=(edtValue)*568262.41168;
	metercupUS=(edtValue)*236588.23648;
	metercupk=(edtValue)*284131.20592;
	meterfluidounceus=(edtValue)*29573.529564;
	meterfluidounceuk=(edtValue)*28413.120592;
	litermeter=(edtValue)*0.000001;
	liter100km=(edtValue)*0.1;
	gallonUSmile=(edtValue)*0.0004251437;
	gallonUS100mi=(edtValue)*0.0425143707;
	gallonUKmile=(edtValue)*0.0003540062;
	gallonUK100mi=(edtValue)*0.035400619;
	
	
	 break;
case "Kilometer/liter - km/L":
	
	meterliter=(edtValue)*1000;
	exameterliter=(edtValue)*1.E-15;
	petameterliter=(edtValue)*1.E-12;
	terameterliter=(edtValue)*1.E-9;
	gigameterliter=(edtValue)*0.000001;
	megameterliter=(edtValue)*0.001;
	kilometerliter=(edtValue)*1;
	hectometerliter=(edtValue)*10;
	dekameterliter=(edtValue)*100;
	centimeterliter=(edtValue)*100000;
	mileusliter=(edtValue)*0.6213711922;
	nauticalmilelite=(edtValue)*0.539594075;
	nauticalmilegallon=(edtValue)*2.0425857698;
	kilometergallon=(edtValue)*3.7854117834;
	metergallonus=(edtValue)*3785.4117834;
	metergallonUK=(edtValue)*4546.0992939;
	milegallonus=(edtValue)*2.3521458329;
	milegallonuk=(edtValue)*2.8248093628;
	metercubicmeter=(edtValue)*1000000;
	metercubiccm=(edtValue)*1;
	metercubicyard=(edtValue)*764554.85817;
	metercubicfoot=(edtValue)*28316.846593;
	metercubicinch=(edtValue)*16.387064001;
	meterquartUS=(edtValue)*946.35294639;
	meterquartuk=(edtValue)*1136.524823;
	meterpintUS=(edtValue)*473.17647297;
	meterpintuk=(edtValue)*568.26241168;
	metercupUS=(edtValue)*236.58823648;
	metercupk=(edtValue)*284.13120592;
	meterfluidounceus=(edtValue)*29.573529564;
	meterfluidounceuk=(edtValue)*28.413120592;
	litermeter=(edtValue)*0.001;
	liter100km=(edtValue)*100;
	gallonUSmile=(edtValue)*0.4251437075;
	gallonUS100mi=(edtValue)*42.51437075;
	gallonUKmile=(edtValue)*0.35400619;
	gallonUK100mi=(edtValue)*35.400618996;
	
	
	 break;
case "Hectometer/liter - hm/L":
	
	meterliter=(edtValue)*100;
	exameterliter=(edtValue)*1.E-16;
	petameterliter=(edtValue)*9.999999999E-14;
	terameterliter=(edtValue)*1.E-10;
	gigameterliter=(edtValue)*1.E-7;
	megameterliter=(edtValue)*0.0001;
	kilometerliter=(edtValue)*0.1;
	hectometerliter=(edtValue)*1;
	dekameterliter=(edtValue)*10;
	centimeterliter=(edtValue)*10000;
	mileusliter=(edtValue)*0.0621371192;
	nauticalmilelite=(edtValue)*0.0539594075;
	nauticalmilegallon=(edtValue)*0.204258577;
	kilometergallon=(edtValue)*0.3785411783;
	metergallonus=(edtValue)*378.54117834;
	metergallonUK=(edtValue)*454.60992939;
	milegallonus=(edtValue)*0.2352145833;
	milegallonuk=(edtValue)*0.2824809363;
	metercubicmeter=(edtValue)*100000;
	metercubiccm=(edtValue)*0.1;
	metercubicyard=(edtValue)*76455.485817;
	metercubicfoot=(edtValue)*2831.6846593;
	metercubicinch=(edtValue)*1.6387064001;
	meterquartUS=(edtValue)*94.635294639;
	meterquartuk=(edtValue)*113.6524823;
	meterpintUS=(edtValue)*47.317647297;
	meterpintuk=(edtValue)*56.826241168;
	metercupUS=(edtValue)*23.658823648;
	metercupk=(edtValue)*28.413120592;
	meterfluidounceus=(edtValue)*2.9573529564;
	meterfluidounceuk=(edtValue)*2.8413120592;
	litermeter=(edtValue)*0.01;
	liter100km=(edtValue)*1000;
	gallonUSmile=(edtValue)*4.251437075;
	gallonUS100mi=(edtValue)*425.1437075;
	gallonUKmile=(edtValue)*3.5400618996;
	gallonUK100mi=(edtValue)*354.00618996;
	
	
	 break;
case "Dekameter/liter - dam/L":
	
	meterliter=(edtValue)*10;
	exameterliter=(edtValue)*1.E-17;
	petameterliter=(edtValue)*1.E-14;
	terameterliter=(edtValue)*1.E-11;
	gigameterliter=(edtValue)*1.E-8;
	megameterliter=(edtValue)*0.00001;
	kilometerliter=(edtValue)*0.01;
	hectometerliter=(edtValue)*0.1;
	dekameterliter=(edtValue)*1;
	centimeterliter=(edtValue)*1000;
	mileusliter=(edtValue)*0.0062137119;
	nauticalmilelite=(edtValue)*0.0053959408;
	nauticalmilegallon=(edtValue)*0.0204258577;
	kilometergallon=(edtValue)*0.0378541178;
	metergallonus=(edtValue)*37.854117834;
	metergallonUK=(edtValue)*45.460992939;
	milegallonus=(edtValue)*0.0235214583;
	milegallonuk=(edtValue)*0.0282480936;
	metercubicmeter=(edtValue)*10000;
	metercubiccm=(edtValue)*0.01;
	metercubicyard=(edtValue)*7645.5485817;
	metercubicfoot=(edtValue)*283.16846593;
	metercubicinch=(edtValue)*0.16387064;
	meterquartUS=(edtValue)*9.4635294639;
	meterquartuk=(edtValue)*11.36524823;
	meterpintUS=(edtValue)*4.7317647297;
	meterpintuk=(edtValue)*5.6826241168;
	metercupUS=(edtValue)*2.3658823648;
	metercupk=(edtValue)*2.8413120592;
	meterfluidounceus=(edtValue)*0.2957352956;
	meterfluidounceuk=(edtValue)*0.2841312059;
	litermeter=(edtValue)*0.1;
	liter100km=(edtValue)*10000;
	gallonUSmile=(edtValue)*42.51437075;
	gallonUS100mi=(edtValue)*4251.437075;
	gallonUKmile=(edtValue)*35.400618996;
	gallonUK100mi=(edtValue)*3540.0618996;
	
	
	 break;
case "Centimeter/liter - cm/L":
	
	meterliter=(edtValue)*0.01;
	exameterliter=(edtValue)*1.E-20;
	petameterliter=(edtValue)*9.999999999E-18;
	terameterliter=(edtValue)*1.E-14;
	gigameterliter=(edtValue)*1.E-11;
	megameterliter=(edtValue)*1.E-8;
	kilometerliter=(edtValue)*0.00001;
	hectometerliter=(edtValue)*0.0001;
	dekameterliter=(edtValue)*0.001;
	centimeterliter=(edtValue)*1;
	mileusliter=(edtValue)*0.0000062137;
	nauticalmilelite=(edtValue)*0.0000053959;
	nauticalmilegallon=(edtValue)*0.0000204259;
	kilometergallon=(edtValue)*0.0000378541;
	metergallonus=(edtValue)*0.0378541178;
	metergallonUK=(edtValue)*0.0454609929;
	milegallonus=(edtValue)*0.0000235215;
	milegallonuk=(edtValue)*0.0000282481;
	metercubicmeter=(edtValue)*10;
	metercubiccm=(edtValue)*0.00001;
	metercubicyard=(edtValue)*7.6455485817;
	metercubicfoot=(edtValue)*0.2831684659;
	metercubicinch=(edtValue)*0.0001638706;
	meterquartUS=(edtValue)*0.0094635295;
	meterquartuk=(edtValue)*0.0113652482;
	meterpintUS=(edtValue)*0.0047317647;
	meterpintuk=(edtValue)*0.0056826241;
	metercupUS=(edtValue)*0.0023658824;
	metercupk=(edtValue)*0.0028413121;
	meterfluidounceus=(edtValue)*0.0002957353;
	meterfluidounceuk=(edtValue)*0.0002841312;
	litermeter=(edtValue)*100;
	liter100km=(edtValue)*10000000;
	gallonUSmile=(edtValue)*42514.37075;
	gallonUS100mi=(edtValue)*4251437.075;
	gallonUKmile=(edtValue)*35400.618996;
	gallonUK100mi=(edtValue)*3540061.8996;
	
	
	
	 break;
case "Mile(US)/liter - mi/L":
	
	meterliter=(edtValue)*1609.344;
	exameterliter=(edtValue)*1.609344E-15;
	petameterliter=(edtValue)*1.609344E-12;
	terameterliter=(edtValue)*1.609344E-9;
	gigameterliter=(edtValue)*0.0000016093;
	megameterliter=(edtValue)*0.001609344;
	kilometerliter=(edtValue)*1.609344;
	hectometerliter=(edtValue)*16.09344;
	dekameterliter=(edtValue)*160.9344;
	centimeterliter=(edtValue)*160934.4;
	mileusliter=(edtValue)*1;
	nauticalmilelite=(edtValue)*0.8683924871;
	nauticalmilegallon=(edtValue)*3.2872231531;
	kilometergallon=(edtValue)*6.0920297411;
	metergallonus=(edtValue)*6092.0297411;
	metergallonUK=(edtValue)*7316.2376221;
	milegallonus=(edtValue)*3.7854117834;
	milegallonuk=(edtValue)*4.5460899992;
	metercubicmeter=(edtValue)*1609344;
	metercubiccm=(edtValue)*1.609344;
	metercubicyard=(edtValue)*1230431.7737;
	metercubicfoot=(edtValue)*45571.547164;
	metercubicinch=(edtValue)*26.372423128;
	meterquartUS=(edtValue)*1523.0074362;
	meterquartuk=(edtValue)*1829.0594047;
	meterpintUS=(edtValue)*761.50371772;
	meterpintuk=(edtValue)*914.52970266;
	metercupUS=(edtValue)*380.75185886;
	metercupk=(edtValue)*457.26485146;
	meterfluidounceus=(edtValue)*47.593982363;
	meterfluidounceuk=(edtValue)*45.726485146;
	litermeter=(edtValue)*0.0006213712;
	liter100km=(edtValue)*62.137119224;
	gallonUSmile=(edtValue)*0.2641720524;
	gallonUS100mi=(edtValue)*26.41720524;
	gallonUKmile=(edtValue)*0.2199692483;
	gallonUK100mi=(edtValue)*21.996924831;
	
	
	 break;
case "Nautical mile/liter - n.mile/L":
	
	meterliter=(edtValue)*1853.24496;
	exameterliter=(edtValue)*1.85324496E-15;
	petameterliter=(edtValue)*1.85324496E-12;
	terameterliter=(edtValue)*1.85324496E-9;
	gigameterliter=(edtValue)*0.0000018532;
	megameterliter=(edtValue)*0.001853245;
	kilometerliter=(edtValue)*1.85324496;
	hectometerliter=(edtValue)*18.5324496;
	dekameterliter=(edtValue)*185.324496;
	centimeterliter=(edtValue)*185324.496;
	mileusliter=(edtValue)*1.1515530303;
	nauticalmilelite=(edtValue)*1;
	nauticalmilegallon=(edtValue)*3.7854117833;
	kilometergallon=(edtValue)*7.0152953091;
	metergallonus=(edtValue)*7015.2953091;
	metergallonUK=(edtValue)*8425.0356041;
	milegallonus=(edtValue)*4.3591024101;
	milegallonuk=(edtValue)*5.2350637146;
	metercubicmeter=(edtValue)*1853244.96;
	metercubiccm=(edtValue)*1.85324496;
	metercubicyard=(edtValue)*1416907.4375;
	metercubicfoot=(edtValue)*52478.053232;
	metercubicinch=(edtValue)*30.36924377;
	meterquartUS=(edtValue)*1753.8238283;
	meterquartuk=(edtValue)*2106.2589001;
	meterpintUS=(edtValue)*876.91191372;
	meterpintuk=(edtValue)*1053.1294504;
	metercupUS=(edtValue)*438.45595686;
	metercupk=(edtValue)*526.56472535;
	meterfluidounceus=(edtValue)*54.806994614;
	meterfluidounceuk=(edtValue)*52.656472535;
	litermeter=(edtValue)*0.0005395941;
	liter100km=(edtValue)*53.959407503;
	gallonUSmile=(edtValue)*0.2294050256;
	gallonUS100mi=(edtValue)*22.94050256;
	gallonUKmile=(edtValue)*0.1910196426;
	gallonUK100mi=(edtValue)*19.101964263;
	
	
	 break;
	 
case "Nautical mile/gallon(US)  - n.mile/gallon":
	
	meterliter=(edtValue)*489.5755247;
	exameterliter=(edtValue)*4.895755246E-16;
	petameterliter=(edtValue)*4.895755246E-13;
	terameterliter=(edtValue)*4.895755246E-10;
	gigameterliter=(edtValue)*4.895755246E-7;
	megameterliter=(edtValue)*0.0004895755;
	kilometerliter=(edtValue)*0.4895755247;
	hectometerliter=(edtValue)*4.895755247;
	dekameterliter=(edtValue)*48.95755247;
	centimeterliter=(edtValue)*48957.55247;
	mileusliter=(edtValue)*0.3042081275;
	nauticalmilelite=(edtValue)*0.2641720524;
	nauticalmilegallon=(edtValue)*1;
	kilometergallon=(edtValue)*1.8532449601;
	metergallonus=(edtValue)*1853.2449601;
	metergallonUK=(edtValue)*2225.6589472;
	milegallonus=(edtValue)*1.1515530303;
	milegallonuk=(edtValue)*1.382957526;
	metercubicmeter=(edtValue)*489575.5247;
	metercubiccm=(edtValue)*0.4895755247;
	metercubicyard=(edtValue)*374307.34585;
	metercubicfoot=(edtValue)*13863.235029;
	metercubicinch=(edtValue)*8.0227054567;
	meterquartUS=(edtValue)*463.31124028;
	meterquartuk=(edtValue)*556.41473654;
	meterpintUS=(edtValue)*231.65562003;
	meterpintuk=(edtValue)*278.20736836;
	metercupUS=(edtValue)*115.82781001;
	metercupk=(edtValue)*139.10368422;
	meterfluidounceus=(edtValue)*14.478476254;
	meterfluidounceuk=(edtValue)*13.910368422;
	litermeter=(edtValue)*0.0020425858;
	liter100km=(edtValue)*204.25857698;
	gallonUSmile=(edtValue)*0.8683924871;
	gallonUS100mi=(edtValue)*86.839248706;
	gallonUKmile=(edtValue)*0.723088006;
	gallonUK100mi=(edtValue)*72.308800603;
	
	 break;
  case "Kilometer/gallon - km/gallon":
	
	  meterliter=(edtValue)*264.1720524;
		exameterliter=(edtValue)*2.641720523E-16;
		petameterliter=(edtValue)*2.641720523E-13;
		terameterliter=(edtValue)*2.641720523E-10;
		gigameterliter=(edtValue)*2.641720523E-7;
		megameterliter=(edtValue)*0.0002641721;
		kilometerliter=(edtValue)*0.2641720524;
		hectometerliter=(edtValue)*2.641720524;
		dekameterliter=(edtValue)*26.41720524;
		centimeterliter=(edtValue)*26417.20524;
		mileusliter=(edtValue)*0.1641489032;
		nauticalmilelite=(edtValue)*0.1425456743;
		nauticalmilegallon=(edtValue)*0.539594075;
		kilometergallon=(edtValue)*1;
		metergallonus=(edtValue)*1000;
		metergallonUK=(edtValue)*1200.9523809;
		milegallonus=(edtValue)*0.6213711922;
		milegallonuk=(edtValue)*0.746235687;
		metercubicmeter=(edtValue)*264172.0524;
		metercubiccm=(edtValue)*0.2641720524;
		metercubicyard=(edtValue)*201974.02605;
		metercubicfoot=(edtValue)*7480.519482;
		metercubicinch=(edtValue)*4.32900433;
		meterquartUS=(edtValue)*250.00000014;
		meterquartuk=(edtValue)*300.23809509;
		meterpintUS=(edtValue)*125.00000001;
		meterpintuk=(edtValue)*150.11904759;
		metercupUS=(edtValue)*62.500000006;
		metercupk=(edtValue)*75.059523818;
		meterfluidounceus=(edtValue)*7.8125000017;
		meterfluidounceuk=(edtValue)*7.5059523818;
		litermeter=(edtValue)*0.0037854118;
		liter100km=(edtValue)*378.54117834;
		gallonUSmile=(edtValue)*1.609344;
		gallonUS100mi=(edtValue)*160.9344;
		gallonUKmile=(edtValue)*1.3400592029;
		gallonUK100mi=(edtValue)*134.00592029;
	
	
	 break;
case "Meter/gallon(US) - m/gallon":

	meterliter=(edtValue)*0.2641720524;
	exameterliter=(edtValue)*2.641720523E-19;
	petameterliter=(edtValue)*2.641720523E-16;
	terameterliter=(edtValue)*2.641720523E-13;
	gigameterliter=(edtValue)*2.641720523E-10;
	megameterliter=(edtValue)*2.641720523E-7;
	kilometerliter=(edtValue)*0.0002641721;
	hectometerliter=(edtValue)*0.0026417205;
	dekameterliter=(edtValue)*0.0264172052;
	centimeterliter=(edtValue)*26.41720524;
	mileusliter=(edtValue)*0.0001641489;
	nauticalmilelite=(edtValue)*0.0001425457;
	nauticalmilegallon=(edtValue)*0.0005395941;
	kilometergallon=(edtValue)*0.001;
	metergallonus=(edtValue)*1;
	metergallonUK=(edtValue)*1.2009523809;
	milegallonus=(edtValue)*0.0006213712;
	milegallonuk=(edtValue)*0.0007462357;
	metercubicmeter=(edtValue)*264.1720524;
	metercubiccm=(edtValue)*0.0002641721;
	metercubicyard=(edtValue)*201.97402605;
	metercubicfoot=(edtValue)*7.480519482;
	metercubicinch=(edtValue)*0.0043290043;
	meterquartUS=(edtValue)*0.2500000001;
	meterquartuk=(edtValue)*0.3002380951;
	meterpintUS=(edtValue)*0.125;
	meterpintuk=(edtValue)*0.1501190476;
	metercupUS=(edtValue)*0.0625;
	metercupk=(edtValue)*0.0750595238;
	meterfluidounceus=(edtValue)*0.0078125;
	meterfluidounceuk=(edtValue)*0.0075059524;
	litermeter=(edtValue)*3.7854117834;
	liter100km=(edtValue)*378541.17834;
	gallonUSmile=(edtValue)*1609.344;
	gallonUS100mi=(edtValue)*160934.4;
	gallonUKmile=(edtValue)*1340.0592029;
	gallonUK100mi=(edtValue)*134005.92029;



break;
case "Meter/gallon(UK) - m/gallon":

meterliter=(edtValue)*0.2199687986;
exameterliter=(edtValue)*2.199687985E-19;
petameterliter=(edtValue)*2.199687985E-16;
terameterliter=(edtValue)*2.199687985E-13;
gigameterliter=(edtValue)*2.199687985E-10;
megameterliter=(edtValue)*2.199687985E-7;
kilometerliter=(edtValue)*0.0002199688;
hectometerliter=(edtValue)*0.002199688;
dekameterliter=(edtValue)*0.0219968799;
centimeterliter=(edtValue)*21.99687986;
mileusliter=(edtValue)*0.0001366823;
nauticalmilelite=(edtValue)*0.0001186939;
nauticalmilegallon=(edtValue)*0.0004493051;
kilometergallon=(edtValue)*0.0008326725;
metergallonus=(edtValue)*0.8326724822;
metergallonUK=(edtValue)*1;
milegallonus=(edtValue)*0.0005173987;
milegallonuk=(edtValue)*0.0006213699;
metercubicmeter=(edtValue)*219.9687986;
metercubiccm=(edtValue)*0.0002199688;
metercubicyard=(edtValue)*168.17821361;
metercubicfoot=(edtValue)*6.2288227252;
metercubicinch=(edtValue)*0.0036046428;
meterquartUS=(edtValue)*0.2081681207;
meterquartuk=(edtValue)*0.2499999999;
meterpintUS=(edtValue)*0.1040840603;
meterpintuk=(edtValue)*0.125;
metercupUS=(edtValue)*0.0520420301;
metercupk=(edtValue)*0.0625;
meterfluidounceus=(edtValue)*0.0065052538;
meterfluidounceuk=(edtValue)*0.00625;
litermeter=(edtValue)*4.5460992939;
liter100km=(edtValue)*454609.92939;
gallonUSmile=(edtValue)*1932.7455085;
gallonUS100mi=(edtValue)*193274.55085;
gallonUKmile=(edtValue)*1609.3472902;
gallonUK100mi=(edtValue)*160934.72902;



break;
case "Mile/gallon(US) - mi/gallon":

meterliter=(edtValue)*425.1437075;
exameterliter=(edtValue)*4.251437074E-16;
petameterliter=(edtValue)*4.251437074E-13;
terameterliter=(edtValue)*4.251437074E-10;
gigameterliter=(edtValue)*4.251437074E-7;
megameterliter=(edtValue)*0.0004251437;
kilometerliter=(edtValue)*0.4251437075;
hectometerliter=(edtValue)*4.251437075;
dekameterliter=(edtValue)*42.51437075;
centimeterliter=(edtValue)*42514.37075;
mileusliter=(edtValue)*0.2641720524;
nauticalmilelite=(edtValue)*0.2294050256;
nauticalmilegallon=(edtValue)*0.8683924871;
kilometergallon=(edtValue)*1.609344;
metergallonus=(edtValue)*1609.344;
metergallonUK=(edtValue)*1932.7455085;
milegallonus=(edtValue)*1;
milegallonuk=(edtValue)*1.2009499255;
metercubicmeter=(edtValue)*425143.7075;
metercubiccm=(edtValue)*0.4251437075;
metercubicyard=(edtValue)*325045.68699;
metercubicfoot=(edtValue)*12038.729145;
metercubicinch=(edtValue)*6.9668571445;
meterquartUS=(edtValue)*402.33600023;
meterquartuk=(edtValue)*483.1863769;
meterpintUS=(edtValue)*201.16800002;
meterpintuk=(edtValue)*241.59318853;
metercupUS=(edtValue)*100.58400001;
metercupk=(edtValue)*120.7965943;
meterfluidounceus=(edtValue)*12.573000003;
meterfluidounceuk=(edtValue)*12.07965943;
litermeter=(edtValue)*0.0023521458;
liter100km=(edtValue)*235.21458329;
gallonUSmile=(edtValue)*1;
gallonUS100mi=(edtValue)*99.999999999;
gallonUKmile=(edtValue)*0.8326741845;
gallonUK100mi=(edtValue)*83.267418454;

break;
case "Mile/gallon(UK) - mi/gallon":

meterliter=(edtValue)*354.00619;
exameterliter=(edtValue)*3.5400619E-16;
petameterliter=(edtValue)*3.5400619E-13;
terameterliter=(edtValue)*3.5400619E-10;
gigameterliter=(edtValue)*3.5400619E-7;
megameterliter=(edtValue)*0.0003540062;
kilometerliter=(edtValue)*0.35400619;
hectometerliter=(edtValue)*3.5400619;
dekameterliter=(edtValue)*35.400619;
centimeterliter=(edtValue)*35400.619;
mileusliter=(edtValue)*0.2199692483;
nauticalmilelite=(edtValue)*0.1910196426;
nauticalmilegallon=(edtValue)*0.7230880061;
kilometergallon=(edtValue)*1.340059203;
metergallonus=(edtValue)*1340.059203;
metergallonUK=(edtValue)*1609.3472904;
milegallonus=(edtValue)*0.8326741846;
milegallonuk=(edtValue)*1;
metercubicmeter=(edtValue)*354006.19;
metercubiccm=(edtValue)*0.35400619;
metercubicyard=(edtValue)*270657.15239;
metercubicfoot=(edtValue)*10024.338975;
metercubicinch=(edtValue)*5.8011220924;
meterquartUS=(edtValue)*335.01480095;
meterquartuk=(edtValue)*402.33682242;
meterpintUS=(edtValue)*167.50740039;
meterpintuk=(edtValue)*201.16841128;
metercupUS=(edtValue)*83.753700197;
metercupk=(edtValue)*100.58420567;
meterfluidounceus=(edtValue)*10.469212526;
meterfluidounceuk=(edtValue)*10.058420567;
litermeter=(edtValue)*0.0028248094;
liter100km=(edtValue)*282.48093628;
gallonUSmile=(edtValue)*1.2009499255;
gallonUS100mi=(edtValue)*120.09499255;
gallonUKmile=(edtValue)*0.9999999999;
gallonUK100mi=(edtValue)*99.999999988;


break;
case "Meter/cubic meter - m/m^3":

meterliter=(edtValue)*0.001;
exameterliter=(edtValue)*1.E-21;
petameterliter=(edtValue)*9.999999999E-19;
terameterliter=(edtValue)*1.E-15;
gigameterliter=(edtValue)*1.E-12;
megameterliter=(edtValue)*1.E-9;
kilometerliter=(edtValue)*0.000001;
hectometerliter=(edtValue)*0.00001;
dekameterliter=(edtValue)*0.0001;
centimeterliter=(edtValue)*0.1;
mileusliter=(edtValue)*6.213711922E-7;
nauticalmilelite=(edtValue)*5.39594075E-7;
nauticalmilegallon=(edtValue)*0.0000020426;
kilometergallon=(edtValue)*0.0000037854;
metergallonus=(edtValue)*0.0037854118;
metergallonUK=(edtValue)*0.0045460993;
milegallonus=(edtValue)*0.0000023521;
milegallonuk=(edtValue)*0.0000028248;
metercubicmeter=(edtValue)*1;
metercubiccm=(edtValue)*0.000001;
metercubicyard=(edtValue)*0.7645548582;
metercubicfoot=(edtValue)*0.0283168466;
metercubicinch=(edtValue)*0.0000163871;
meterquartUS=(edtValue)*0.0009463529;
meterquartuk=(edtValue)*0.0011365248;
meterpintUS=(edtValue)*0.0004731765;
meterpintuk=(edtValue)*0.0005682624;
metercupUS=(edtValue)*0.0002365882;
metercupk=(edtValue)*0.0002841312;
meterfluidounceus=(edtValue)*0.0000295735;
meterfluidounceuk=(edtValue)*0.0000284131;
litermeter=(edtValue)*1000;
liter100km=(edtValue)*100000000;
gallonUSmile=(edtValue)*425143.7075;
gallonUS100mi=(edtValue)*42514370.75;
gallonUKmile=(edtValue)*354006.18996;
gallonUK100mi=(edtValue)*35400618.996;


break;
case "Meter/cubic centimeter - m/cm^3":

meterliter=(edtValue)*1000;
exameterliter=(edtValue)*1.E-15;
petameterliter=(edtValue)*1.E-12;
terameterliter=(edtValue)*1.E-9;
gigameterliter=(edtValue)*0.000001;
megameterliter=(edtValue)*0.001;
kilometerliter=(edtValue)*1;
hectometerliter=(edtValue)*10;
dekameterliter=(edtValue)*100;
centimeterliter=(edtValue)*100000;
mileusliter=(edtValue)*0.6213711922;
nauticalmilelite=(edtValue)*0.539594075;
nauticalmilegallon=(edtValue)*2.0425857698;
kilometergallon=(edtValue)*3.7854117834;
metergallonus=(edtValue)*3785.4117834;
metergallonUK=(edtValue)*4546.0992939;
milegallonus=(edtValue)*2.3521458329;
milegallonuk=(edtValue)*2.8248093628;
metercubicmeter=(edtValue)*1000000;
metercubiccm=(edtValue)*1;
metercubicyard=(edtValue)*764554.85817;
metercubicfoot=(edtValue)*28316.846593;
metercubicinch=(edtValue)*16.387064001;
meterquartUS=(edtValue)*946.35294639;
meterquartuk=(edtValue)*1136.524823;
meterpintUS=(edtValue)*473.17647297;
meterpintuk=(edtValue)*568.26241168;
metercupUS=(edtValue)*236.58823648;
metercupk=(edtValue)*284.13120592;
meterfluidounceus=(edtValue)*29.573529564;
meterfluidounceuk=(edtValue)*28.413120592;
litermeter=(edtValue)*0.001;
liter100km=(edtValue)*100;
gallonUSmile=(edtValue)*0.4251437075;
gallonUS100mi=(edtValue)*42.51437075;
gallonUKmile=(edtValue)*0.35400619;
gallonUK100mi=(edtValue)*35.400618996;


break;
case "Meter/cubic yard - m/yd^3":

meterliter=(edtValue)*0.0013079506;
exameterliter=(edtValue)*1.307950618E-21;
petameterliter=(edtValue)*1.307950618E-18;
terameterliter=(edtValue)*1.307950618E-15;
gigameterliter=(edtValue)*1.307950618E-12;
megameterliter=(edtValue)*1.307950618E-9;
kilometerliter=(edtValue)*0.000001308;
hectometerliter=(edtValue)*0.0000130795;
dekameterliter=(edtValue)*0.0000130795;
centimeterliter=(edtValue)*0.1307950619;
mileusliter=(edtValue)*8.127228355E-7;
nauticalmilelite=(edtValue)*7.057624044E-7;
nauticalmilegallon=(edtValue)*0.0000026716;
kilometergallon=(edtValue)*0.0000049511;
metergallonus=(edtValue)*0.0049511317;
metergallonUK=(edtValue)*0.0059460734;
milegallonus=(edtValue)*0.0000030765;
milegallonuk=(edtValue)*0.0000036947;
metercubicmeter=(edtValue)*1.307950619;
metercubiccm=(edtValue)*0.000001308;
metercubicyard=(edtValue)*1;
metercubicfoot=(edtValue)*0.037037037;
metercubicinch=(edtValue)*0.0000214335;
meterquartUS=(edtValue)*0.0012377829;
meterquartuk=(edtValue)*0.0014865183;
meterpintUS=(edtValue)*0.0006188915;
meterpintuk=(edtValue)*0.0007432592;
metercupUS=(edtValue)*0.0003094457;
metercupk=(edtValue)*0.0003716296;
meterfluidounceus=(edtValue)*0.0000386807;
meterfluidounceuk=(edtValue)*0.000037163;
litermeter=(edtValue)*764.55485817;
liter100km=(edtValue)*76455485.817;
gallonUSmile=(edtValue)*325045.68699;
gallonUS100mi=(edtValue)*32504568.699;
gallonUKmile=(edtValue)*270657.15235;
gallonUK100mi=(edtValue)*27065715.235;


break;
case "Meter/cubic foot - m/ft^3":

meterliter=(edtValue)*0.0353146667;
exameterliter=(edtValue)*3.531466671E-20;
petameterliter=(edtValue)*3.531466671E-17;
terameterliter=(edtValue)*3.531466671E-14;
gigameterliter=(edtValue)*3.531466671E-11;
megameterliter=(edtValue)*3.531466671E-8;
kilometerliter=(edtValue)*0.0000353147;
hectometerliter=(edtValue)*0.0003531467;
dekameterliter=(edtValue)*0.0035314667;
centimeterliter=(edtValue)*3.531466672;
mileusliter=(edtValue)*0.0000219435;
nauticalmilelite=(edtValue)*0.0000190556;
nauticalmilegallon=(edtValue)*0.0000721332;
kilometergallon=(edtValue)*0.0001336806;
metergallonus=(edtValue)*0.1336805555;
metergallonUK=(edtValue)*0.1605439814;
milegallonus=(edtValue)*0.0000830652;
milegallonuk=(edtValue)*0.0000997572;
metercubicmeter=(edtValue)*35.31466672;
metercubiccm=(edtValue)*0.0000353147;
metercubicyard=(edtValue)*27.000000005;
metercubicfoot=(edtValue)*1;
metercubicinch=(edtValue)*0.0005787037;
meterquartUS=(edtValue)*0.0334201389;
meterquartuk=(edtValue)*0.0401359953;
meterpintUS=(edtValue)*0.0167100694;
meterpintuk=(edtValue)*0.0200679977;
metercupUS=(edtValue)*0.0083550347;
metercupk=(edtValue)*0.0100339988;
meterfluidounceus=(edtValue)*0.0010443793;
meterfluidounceuk=(edtValue)*0.0010033999;
litermeter=(edtValue)*28.316846593;
liter100km=(edtValue)*2831684.6593;
gallonUSmile=(edtValue)*12038.729145;
gallonUS100mi=(edtValue)*1203872.9145;
gallonUKmile=(edtValue)*10024.338974;
gallonUK100mi=(edtValue)*1002433.8974;



break;
case "Meter/cubic inch - m/in^3":

meterliter=(edtValue)*61.02374409;
exameterliter=(edtValue)*6.102374408E-17;
petameterliter=(edtValue)*6.102374408E-14;
terameterliter=(edtValue)*6.102374408E-11;
gigameterliter=(edtValue)*6.102374408E-8;
megameterliter=(edtValue)*0.0000610237;
kilometerliter=(edtValue)*0.0610237441;
hectometerliter=(edtValue)*0.6102374409;
dekameterliter=(edtValue)*6.102374409;
centimeterliter=(edtValue)*6102.374409;
mileusliter=(edtValue)*0.0379183966;
nauticalmilelite=(edtValue)*0.0329280507;
nauticalmilegallon=(edtValue)*0.1246462313;
kilometergallon=(edtValue)*0.2309999999;
metergallonus=(edtValue)*230.99999995;
metergallonUK=(edtValue)*277.41999992;
milegallonus=(edtValue)*0.1435367454;
milegallonuk=(edtValue)*0.1723804437;
metercubicmeter=(edtValue)*61023.74409;
metercubiccm=(edtValue)*0.0610237441;
metercubicyard=(edtValue)*46656.000008;
metercubicfoot=(edtValue)*1727.9999999;
metercubicinch=(edtValue)*1;
meterquartUS=(edtValue)*57.750000019;
meterquartuk=(edtValue)*69.354999948;
meterpintUS=(edtValue)*28.874999996;
meterpintuk=(edtValue)*34.677499986;
metercupUS=(edtValue)*14.437499998;
metercupk=(edtValue)*17.338749998;
meterfluidounceus=(edtValue)*1.8046875;
meterfluidounceuk=(edtValue)*1.7338749998;
litermeter=(edtValue)*0.016387064;
liter100km=(edtValue)*1638.7064001;
gallonUSmile=(edtValue)*6.9668571445;
gallonUS100mi=(edtValue)*696.68571445;
gallonUKmile=(edtValue)*5.8011220917;
gallonUK100mi=(edtValue)*580.11220917;


break;
case "Meter/quart(US) - m/q":

meterliter=(edtValue)*1.056688209;
exameterliter=(edtValue)*1.056688209E-18;
petameterliter=(edtValue)*1.056688209E-15;
terameterliter=(edtValue)*1.056688209E-12;
gigameterliter=(edtValue)*1.056688209E-9;
megameterliter=(edtValue)*0.0000010567;
kilometerliter=(edtValue)*0.0010566882;
hectometerliter=(edtValue)*0.0105668821;
dekameterliter=(edtValue)*0.1056688209;
centimeterliter=(edtValue)*105.6688209;
mileusliter=(edtValue)*0.0006565956;
nauticalmilelite=(edtValue)*0.0005701827;
nauticalmilegallon=(edtValue)*0.0021583763;
kilometergallon=(edtValue)*0.004;
metergallonus=(edtValue)*3.9999999977;
metergallonUK=(edtValue)*4.8038095208;
milegallonus=(edtValue)*0.0024854848;
milegallonuk=(edtValue)*0.0029849427;
metercubicmeter=(edtValue)*1056.688209;
metercubiccm=(edtValue)*0.0010566882;
metercubicyard=(edtValue)*807.89610376;
metercubicfoot=(edtValue)*29.922077911;
metercubicinch=(edtValue)*0.0173160173;
meterquartUS=(edtValue)*1;
meterquartuk=(edtValue)*1.2009523797;
meterpintUS=(edtValue)*0.4999999998;
meterpintuk=(edtValue)*0.60047619;
metercupUS=(edtValue)*0.2499999999;
metercupk=(edtValue)*0.3002380951;
meterfluidounceus=(edtValue)*0.03125;
meterfluidounceuk=(edtValue)*0.0300238095;
litermeter=(edtValue)*0.9463529464;
liter100km=(edtValue)*94635.294639;
gallonUSmile=(edtValue)*402.33600023;
gallonUS100mi=(edtValue)*40233.600023;
gallonUKmile=(edtValue)*335.0148009;
gallonUK100mi=(edtValue)*33501.48009;


break;

case "Meter/quart(UK) - m/q":
	
	meterliter=(edtValue)*0.8798751948;
	exameterliter=(edtValue)*8.798751948E-19;
	petameterliter=(edtValue)*8.798751948E-16;
	terameterliter=(edtValue)*8.798751948E-13;
	gigameterliter=(edtValue)*8.798751948E-10;
	megameterliter=(edtValue)*8.798751948E-7;
	kilometerliter=(edtValue)*0.0008798752;
	hectometerliter=(edtValue)*0.0087987519;
	dekameterliter=(edtValue)*0.0879875195;
	centimeterliter=(edtValue)*87.98751948;
	mileusliter=(edtValue)*0.0005467291;
	nauticalmilelite=(edtValue)*0.0004747754;
	nauticalmilegallon=(edtValue)*0.0017972206;
	kilometergallon=(edtValue)*0.0033306899;
	metergallonus=(edtValue)*3.3306899303;
	metergallonUK=(edtValue)*4.0000000018;
	milegallonus=(edtValue)*0.0020695948;
	milegallonuk=(edtValue)*0.0024854797;
	metercubicmeter=(edtValue)*879.8751948;
	metercubiccm=(edtValue)*0.0008798752;
	metercubicyard=(edtValue)*672.71285477;
	metercubicfoot=(edtValue)*24.915290912;
	metercubicinch=(edtValue)*0.0144185711;
	meterquartUS=(edtValue)*0.8326724831;
	meterquartuk=(edtValue)*1;
	meterpintUS=(edtValue)*0.4163362413;
	meterpintuk=(edtValue)*0.5000000002;
	metercupUS=(edtValue)*0.2081681207;
	metercupk=(edtValue)*0.2500000002;
	meterfluidounceus=(edtValue)*0.0260210151;
	meterfluidounceuk=(edtValue)*0.025;
	litermeter=(edtValue)*1.136524823;
	liter100km=(edtValue)*113652.4823;
	gallonUSmile=(edtValue)*483.1863769;
	gallonUS100mi=(edtValue)*48318.63769;
	gallonUKmile=(edtValue)*402.33682237;
	gallonUK100mi=(edtValue)*40233.682237;
	
	 break;
  case "Meter/pint(US) - m/pt":
	
	  meterliter=(edtValue)*2.113376419;
		exameterliter=(edtValue)*2.113376418E-18;
		petameterliter=(edtValue)*2.113376418E-15;
		terameterliter=(edtValue)*2.113376418E-12;
		gigameterliter=(edtValue)*2.113376418E-9;
		megameterliter=(edtValue)*0.0000021134;
		kilometerliter=(edtValue)*0.0021133764;
		hectometerliter=(edtValue)*0.0211337642;
		dekameterliter=(edtValue)*0.2113376419;
		centimeterliter=(edtValue)*211.3376419;
		mileusliter=(edtValue)*0.0013131912;
		nauticalmilelite=(edtValue)*0.0011403654;
		nauticalmilegallon=(edtValue)*0.0043167526;
		kilometergallon=(edtValue)*0.008;
		metergallonus=(edtValue)*7.9999999992;
		metergallonUK=(edtValue)*9.6076190462;
		milegallonus=(edtValue)*0.0049709695;
		milegallonuk=(edtValue)*0.0059698855;
		metercubicmeter=(edtValue)*2113.376419;
		metercubiccm=(edtValue)*0.0021133764;
		metercubicyard=(edtValue)*1615.7922083;
		metercubicfoot=(edtValue)*59.84415585;
		metercubicinch=(edtValue)*0.0346320346;
		meterquartUS=(edtValue)*2.0000000009;
		meterquartuk=(edtValue)*2.4019047605;
		meterpintUS=(edtValue)*1;
		meterpintuk=(edtValue)*1.2009523806;
		metercupUS=(edtValue)*0.5;
		metercupk=(edtValue)*0.6004761905;
		meterfluidounceus=(edtValue)*0.0625;
		meterfluidounceuk=(edtValue)*0.060047619;
		litermeter=(edtValue)*0.473176473;
		liter100km=(edtValue)*47317.647297;
		gallonUSmile=(edtValue)*201.16800002;
		gallonUS100mi=(edtValue)*20116.800002;
		gallonUKmile=(edtValue)*167.50740037;
		gallonUK100mi=(edtValue)*16750.740037;
	
	
	 break;
case "Meter/pint(UK) - m/pt":

	meterliter=(edtValue)*1.759750389;
	exameterliter=(edtValue)*1.759750388E-18;
	petameterliter=(edtValue)*1.759750388E-15;
	terameterliter=(edtValue)*1.759750388E-12;
	gigameterliter=(edtValue)*1.759750388E-9;
	megameterliter=(edtValue)*0.0000017598;
	kilometerliter=(edtValue)*0.0017597504;
	hectometerliter=(edtValue)*0.0175975039;
	dekameterliter=(edtValue)*0.1759750389;
	centimeterliter=(edtValue)*175.9750389;
	mileusliter=(edtValue)*0.0010934582;
	nauticalmilelite=(edtValue)*0.0009495509;
	nauticalmilegallon=(edtValue)*0.0035944411;
	kilometergallon=(edtValue)*0.0066613799;
	metergallonus=(edtValue)*6.6613798584;
	metergallonUK=(edtValue)*8.0000000009;
	milegallonus=(edtValue)*0.0041391895;
	milegallonuk=(edtValue)*0.0049709594;
	metercubicmeter=(edtValue)*1759.750389;
	metercubiccm=(edtValue)*0.0017597504;
	metercubicyard=(edtValue)*1345.4257091;
	metercubicfoot=(edtValue)*49.830581808;
	metercubicinch=(edtValue)*0.0288371423;
	meterquartUS=(edtValue)*1.6653449655;
	meterquartuk=(edtValue)*1.9999999993;
	meterpintUS=(edtValue)*0.8326724824;
	meterpintuk=(edtValue)*1;
	metercupUS=(edtValue)*0.4163362412;
	metercupk=(edtValue)*0.5000000001;
	meterfluidounceus=(edtValue)*0.0520420302;
	meterfluidounceuk=(edtValue)*0.05;
	litermeter=(edtValue)*0.5682624117;
	liter100km=(edtValue)*56826.241168;
	gallonUSmile=(edtValue)*241.59318853;
	gallonUS100mi=(edtValue)*24159.318853;
	gallonUKmile=(edtValue)*201.16841125;
	gallonUK100mi=(edtValue)*20116.841125;



break;
case "Meter/cup(US) - m/cup":

meterliter=(edtValue)*4.226752838;
exameterliter=(edtValue)*4.226752837E-18;
petameterliter=(edtValue)*4.226752837E-15;
terameterliter=(edtValue)*4.226752837E-12;
gigameterliter=(edtValue)*4.226752837E-9;
megameterliter=(edtValue)*0.0000042268;
kilometerliter=(edtValue)*0.0042267528;
hectometerliter=(edtValue)*0.0422675284;
dekameterliter=(edtValue)*0.4226752838;
centimeterliter=(edtValue)*422.6752838;
mileusliter=(edtValue)*0.0026263825;
nauticalmilelite=(edtValue)*0.0022807308;
nauticalmilegallon=(edtValue)*0.0086335052;
kilometergallon=(edtValue)*0.016;
metergallonus=(edtValue)*15.999999998;
metergallonUK=(edtValue)*19.215238092;
milegallonus=(edtValue)*0.0099419391;
milegallonuk=(edtValue)*0.011939771;
metercubicmeter=(edtValue)*4226.752838;
metercubiccm=(edtValue)*0.0042267528;
metercubicyard=(edtValue)*3231.5844166;
metercubicfoot=(edtValue)*119.6883117;
metercubicinch=(edtValue)*0.0692640693;
meterquartUS=(edtValue)*4.0000000019;
meterquartuk=(edtValue)*4.8038095209;
meterpintUS=(edtValue)*2;
meterpintuk=(edtValue)*2.4019047613;
metercupUS=(edtValue)*1;
metercupk=(edtValue)*1.200952381;
meterfluidounceus=(edtValue)*0.125;
meterfluidounceuk=(edtValue)*0.1200952381;
litermeter=(edtValue)*0.2365882365;
liter100km=(edtValue)*23658.823648;
gallonUSmile=(edtValue)*100.58400001;
gallonUS100mi=(edtValue)*10058.400001;
gallonUKmile=(edtValue)*83.753700186;
gallonUK100mi=(edtValue)*8375.3700186;



break;
case "Meter/cup(UK) - m/cup":

meterliter=(edtValue)*3.519500777;
exameterliter=(edtValue)*3.519500776E-18;
petameterliter=(edtValue)*3.519500776E-15;
terameterliter=(edtValue)*3.519500776E-12;
gigameterliter=(edtValue)*3.519500776E-9;
megameterliter=(edtValue)*0.0000035195;
kilometerliter=(edtValue)*0.0035195008;
hectometerliter=(edtValue)*0.0351950078;
dekameterliter=(edtValue)*0.3519500777;
centimeterliter=(edtValue)*351.9500777;
mileusliter=(edtValue)*0.0021869164;
nauticalmilelite=(edtValue)*0.0018991018;
nauticalmilegallon=(edtValue)*0.0071888822;
kilometergallon=(edtValue)*0.0133227597;
metergallonus=(edtValue)*13.322759713;
metergallonUK=(edtValue)*15.999999997;
milegallonus=(edtValue)*0.0082783791;
milegallonuk=(edtValue)*0.0099419187;
metercubicmeter=(edtValue)*3519.500777;
metercubiccm=(edtValue)*0.0035195008;
metercubicyard=(edtValue)*2690.8514174;
metercubicfoot=(edtValue)*99.661163587;
metercubicinch=(edtValue)*0.0576742845;
meterquartUS=(edtValue)*3.3306899301;
meterquartuk=(edtValue)*3.9999999975;
meterpintUS=(edtValue)*1.6653449643;
meterpintuk=(edtValue)*1.9999999994;
metercupUS=(edtValue)*0.8326724821;
metercupk=(edtValue)*1;
meterfluidounceus=(edtValue)*0.1040840603;
meterfluidounceuk=(edtValue)*0.1;
litermeter=(edtValue)*0.2841312059;
liter100km=(edtValue)*28413.120592;
gallonUSmile=(edtValue)*120.7965943;
gallonUS100mi=(edtValue)*12079.65943;
gallonUKmile=(edtValue)*100.58420565;
gallonUK100mi=(edtValue)*10058.420565;

break;
case "Meter/fluid ounce(US) - m/floz":

meterliter=(edtValue)*33.8140227;
exameterliter=(edtValue)*3.381402269E-17;
petameterliter=(edtValue)*3.381402269E-14;
terameterliter=(edtValue)*3.381402269E-11;
gigameterliter=(edtValue)*3.381402269E-18;
megameterliter=(edtValue)*0.000033814;
kilometerliter=(edtValue)*0.0338140227;
hectometerliter=(edtValue)*0.338140227;
dekameterliter=(edtValue)*3.38140227;
centimeterliter=(edtValue)*3381.40227;
mileusliter=(edtValue)*0.0210110596;
nauticalmilelite=(edtValue)*0.0182458463;
nauticalmilegallon=(edtValue)*0.0690680416;
kilometergallon=(edtValue)*0.128;
metergallonus=(edtValue)*127.99999997;
metergallonUK=(edtValue)*153.72190472;
milegallonus=(edtValue)*0.0795355126;
milegallonuk=(edtValue)*0.0955181679;
metercubicmeter=(edtValue)*33814.0227;
metercubiccm=(edtValue)*0.0338140227;
metercubicyard=(edtValue)*25852.675329;
metercubicfoot=(edtValue)*957.50649349;
metercubicinch=(edtValue)*0.5541125541;
meterquartUS=(edtValue)*32.000000011;
meterquartuk=(edtValue)*38.430476163;
meterpintUS=(edtValue)*15.999999998;
meterpintuk=(edtValue)*19.215238088;
metercupUS=(edtValue)*7.9999999991;
metercupk=(edtValue)*9.6076190467;
meterfluidounceus=(edtValue)*1;
meterfluidounceuk=(edtValue)*0.9607619047;
litermeter=(edtValue)*0.0295735296;
liter100km=(edtValue)*2957.3529564;
gallonUSmile=(edtValue)*12.573000003;
gallonUS100mi=(edtValue)*1257.3000003;
gallonUKmile=(edtValue)*10.469212525;
gallonUK100mi=(edtValue)*1046.9212525;


break;
case "Meter/fluid ounce(UK) - m/floz":

meterliter=(edtValue)*35.19500777;
exameterliter=(edtValue)*3.519500776E-17;
petameterliter=(edtValue)*3.519500776E-14;
terameterliter=(edtValue)*3.519500776E-11;
gigameterliter=(edtValue)*3.519500776E-8;
megameterliter=(edtValue)*0.000035195;
kilometerliter=(edtValue)*0.0351950078;
hectometerliter=(edtValue)*0.3519500777;
dekameterliter=(edtValue)*3.519500777;
centimeterliter=(edtValue)*3519.500777;
mileusliter=(edtValue)*0.0218691639;
nauticalmilelite=(edtValue)*0.0189910177;
nauticalmilegallon=(edtValue)*0.071888822;
kilometergallon=(edtValue)*0.1332275971;
metergallonus=(edtValue)*133.22759713;
metergallonUK=(edtValue)*159.99999997;
milegallonus=(edtValue)*0.0827837909;
milegallonuk=(edtValue)*0.0994191875;
metercubicmeter=(edtValue)*35195.00777;
metercubiccm=(edtValue)*0.0351950078;
metercubicyard=(edtValue)*26908.514174;
metercubicfoot=(edtValue)*996.61163587;
metercubicinch=(edtValue)*0.5767428449;
meterquartUS=(edtValue)*33.306899301;
meterquartuk=(edtValue)*39.999999975;
meterpintUS=(edtValue)*16.653449643;
meterpintuk=(edtValue)*19.999999994;
metercupUS=(edtValue)*8.3267248214;
metercupk=(edtValue)*10;
meterfluidounceus=(edtValue)*1.0408406028;
meterfluidounceuk=(edtValue)*1;
litermeter=(edtValue)*0.0284131206;
liter100km=(edtValue)*2841.3120592;
gallonUSmile=(edtValue)*12.07965943;
gallonUS100mi=(edtValue)*1207.965943;
gallonUKmile=(edtValue)*10.058420565;
gallonUK100mi=(edtValue)*1005.8420565;


break;
case "Liter/meter - L/m":

meterliter=(edtValue)*1;
exameterliter=(edtValue)*1.E-18;
petameterliter=(edtValue)*1.E-15;
terameterliter=(edtValue)*1.E-12;
gigameterliter=(edtValue)*1.E-9;
megameterliter=(edtValue)*0.000001;
kilometerliter=(edtValue)*0.001;
hectometerliter=(edtValue)*0.01;
dekameterliter=(edtValue)*0.1;
centimeterliter=(edtValue)*100;
mileusliter=(edtValue)*0.0006213712;
nauticalmilelite=(edtValue)*0.0005395941;
nauticalmilegallon=(edtValue)*0.0020425858;
kilometergallon=(edtValue)*0.0037854118;
metergallonus=(edtValue)*3.7854117834;
metergallonUK=(edtValue)*4.5460992939;
milegallonus=(edtValue)*0.0023521458;
milegallonuk=(edtValue)*0.0028248094;
metercubicmeter=(edtValue)*1000;
metercubiccm=(edtValue)*0.001;
metercubicyard=(edtValue)*764.55485817;
metercubicfoot=(edtValue)*28.316846593;
metercubicinch=(edtValue)*0.016387064;
meterquartUS=(edtValue)*0.9463529464;
meterquartuk=(edtValue)*1.136524823;
meterpintUS=(edtValue)*0.473176473;
meterpintuk=(edtValue)*0.5682624117;
metercupUS=(edtValue)*0.2365882365;
metercupk=(edtValue)*0.2841312059;
meterfluidounceus=(edtValue)*0.0295735296;
meterfluidounceuk=(edtValue)*0.0284131206;
litermeter=(edtValue)*1;
liter100km=(edtValue)*100000;
gallonUSmile=(edtValue)*425.1437075;
gallonUS100mi=(edtValue)*42514.37075;
gallonUKmile=(edtValue)*354.00618996;
gallonUK100mi=(edtValue)*35400.618996;


break;
case "Liter/100 km - L/100 km":

meterliter=(edtValue)*100000;
exameterliter=(edtValue)*1.E-13;
petameterliter=(edtValue)*1.E-10;
terameterliter=(edtValue)*1.E-7;
gigameterliter=(edtValue)*0.0001;
megameterliter=(edtValue)*0.1;
kilometerliter=(edtValue)*100;
hectometerliter=(edtValue)*1000;
dekameterliter=(edtValue)*10000;
centimeterliter=(edtValue)*10000000;
mileusliter=(edtValue)*62.137119224;
nauticalmilelite=(edtValue)*53.959407503;
nauticalmilegallon=(edtValue)*204.25857698;
kilometergallon=(edtValue)*378.54117834;
metergallonus=(edtValue)*378541.17834;
metergallonUK=(edtValue)*454609.92939;
milegallonus=(edtValue)*235.21458329;
milegallonuk=(edtValue)*282.48093628;
metercubicmeter=(edtValue)*100000000;
metercubiccm=(edtValue)*100;
metercubicyard=(edtValue)*76455485.817;
metercubicfoot=(edtValue)*2831684.6593;
metercubicinch=(edtValue)*1638.7064001;
meterquartUS=(edtValue)*94635.294639;
meterquartuk=(edtValue)*113652.4823;
meterpintUS=(edtValue)*47317.647297;
meterpintuk=(edtValue)*56826.241168;
metercupUS=(edtValue)*23658.823648;
metercupk=(edtValue)*28413.120592;
meterfluidounceus=(edtValue)*2957.3529564;
meterfluidounceuk=(edtValue)*2841.3120592;
litermeter=(edtValue)*0.00001;
liter100km=(edtValue)*1;
gallonUSmile=(edtValue)*0.0042514371;
gallonUS100mi=(edtValue)*0.4251437075;
gallonUKmile=(edtValue)*0.0035400619;
gallonUK100mi=(edtValue)*0.35400619;


break;
case "Gallon(US)/mile - gallon/mi":

meterliter=(edtValue)*425.1437075;
exameterliter=(edtValue)*4.251437074E-16;
petameterliter=(edtValue)*4.251437074E-13;
terameterliter=(edtValue)*4.251437074E-10;
gigameterliter=(edtValue)*4.251437074E-7;
megameterliter=(edtValue)*0.0004251437;
kilometerliter=(edtValue)*0.4251437075;
hectometerliter=(edtValue)*4.251437075;
dekameterliter=(edtValue)*42.51437075;
centimeterliter=(edtValue)*42514.37075;
mileusliter=(edtValue)*0.2641720524;
nauticalmilelite=(edtValue)*0.2294050256;
nauticalmilegallon=(edtValue)*0.8683924871;
kilometergallon=(edtValue)*1.609344;
metergallonus=(edtValue)*1609.344;
metergallonUK=(edtValue)*1932.7455085;
milegallonus=(edtValue)*1;
milegallonuk=(edtValue)*1.2009499255;
metercubicmeter=(edtValue)*425143.7075;
metercubiccm=(edtValue)*0.4251437075;
metercubicyard=(edtValue)*325045.68699;
metercubicfoot=(edtValue)*12038.7291454;
metercubicinch=(edtValue)*6.9668571445;
meterquartUS=(edtValue)*402.33600023;
meterquartuk=(edtValue)*483.1863769;
meterpintUS=(edtValue)*201.16800002;
meterpintuk=(edtValue)*241.59318853;
metercupUS=(edtValue)*100.58400001;
metercupk=(edtValue)*120.7965943;
meterfluidounceus=(edtValue)*12.573000003;
meterfluidounceuk=(edtValue)*12.07965943;
litermeter=(edtValue)*0.0023521458;
liter100km=(edtValue)*235.2145833;
gallonUSmile=(edtValue)*1;
gallonUS100mi=(edtValue)*100;
gallonUKmile=(edtValue)*0.8326741845;
gallonUK100mi=(edtValue)*83.267418455;



break;
case "Gallon(US)/100 mile - gallon/100 mi":

meterliter=(edtValue)*42514.37075;
exameterliter=(edtValue)*4.251437074E-14;
petameterliter=(edtValue)*4.251437074E-11;
terameterliter=(edtValue)*4.251437074E-8;
gigameterliter=(edtValue)*0.0000425144;
megameterliter=(edtValue)*0.0425143707;
kilometerliter=(edtValue)*42.51437075;
hectometerliter=(edtValue)*425.1437075;
dekameterliter=(edtValue)*4251.437075;
centimeterliter=(edtValue)*4251437.075;
mileusliter=(edtValue)*26.41720524;
nauticalmilelite=(edtValue)*22.94050256;
nauticalmilegallon=(edtValue)*86.839248706;
kilometergallon=(edtValue)*160.9344;
metergallonus=(edtValue)*160934.4;
metergallonUK=(edtValue)*193274.55085;
milegallonus=(edtValue)*99.999999999;
milegallonuk=(edtValue)*120.09499255;
metercubicmeter=(edtValue)*42514370.75;
metercubiccm=(edtValue)*42.51437075;
metercubicyard=(edtValue)*32504568.699;
metercubicfoot=(edtValue)*1203872.9145;
metercubicinch=(edtValue)*696.68571445;
meterquartUS=(edtValue)*40233.600023;
meterquartuk=(edtValue)*48318.63769;
meterpintUS=(edtValue)*20116.800002;
meterpintuk=(edtValue)*24159.318853;
metercupUS=(edtValue)*10058.400001;
metercupk=(edtValue)*12079.65943;
meterfluidounceus=(edtValue)*1257.3000003;
meterfluidounceuk=(edtValue)*1207.965943;
litermeter=(edtValue)*0.0000235215;
liter100km=(edtValue)*2.352145833;
gallonUSmile=(edtValue)*0.01;
gallonUS100mi=(edtValue)*1;
gallonUKmile=(edtValue)*0.0083267418;
gallonUK100mi=(edtValue)*0.8326741845;


break;
case "Gallon(UK)/mile - gallon/mi":

meterliter=(edtValue)*354.00618996;
exameterliter=(edtValue)*3.540061899E-16;
petameterliter=(edtValue)*3.540061899E-13;
terameterliter=(edtValue)*3.540061899E-10;
gigameterliter=(edtValue)*3.540061899E-7;
megameterliter=(edtValue)*0.0003540062;
kilometerliter=(edtValue)*0.35400619;
hectometerliter=(edtValue)*3.5400618996;
dekameterliter=(edtValue)*35.400618996;
centimeterliter=(edtValue)*35400.618996;
mileusliter=(edtValue)*0.2199692483;
nauticalmilelite=(edtValue)*0.1910196426;
nauticalmilegallon=(edtValue)*0.723088006;
kilometergallon=(edtValue)*1.3400592029;
metergallonus=(edtValue)*1340.0592029;
metergallonUK=(edtValue)*1609.3472902;
milegallonus=(edtValue)*0.8326741845;
milegallonuk=(edtValue)*0.9999999999;
metercubicmeter=(edtValue)*354006.18996;
metercubiccm=(edtValue)*0.35400619;
metercubicyard=(edtValue)*270657.15235;
metercubicfoot=(edtValue)*10024.338974;
metercubicinch=(edtValue)*5.8011220917;
meterquartUS=(edtValue)*335.0148009;
meterquartuk=(edtValue)*402.33682237;
meterpintUS=(edtValue)*167.50740037;
meterpintuk=(edtValue)*201.16841125;
metercupUS=(edtValue)*83.7537001868;
metercupk=(edtValue)*100.58420565;
meterfluidounceus=(edtValue)*10.469212525;
meterfluidounceuk=(edtValue)*10.058420565;
litermeter=(edtValue)*0.0028248094;
liter100km=(edtValue)*282.48093631;
gallonUSmile=(edtValue)*1.2009499256;
gallonUS100mi=(edtValue)*120.09499256;
gallonUKmile=(edtValue)*1;
gallonUK100mi=(edtValue)*100;


break;

case "Gallon(UK)/100 mile - gallon/100 mi":

meterliter=(edtValue)*35400.618996;
exameterliter=(edtValue)*3.540061899E-14;
petameterliter=(edtValue)*3.540061899E-11;
terameterliter=(edtValue)*3.540061899E-8;
gigameterliter=(edtValue)*0.0000354006;
megameterliter=(edtValue)*0.035400619;
kilometerliter=(edtValue)*35.400618996;
hectometerliter=(edtValue)*354.00618996;
dekameterliter=(edtValue)*3540.0618996;
centimeterliter=(edtValue)*3540061.8996;
mileusliter=(edtValue)*21.996924831;
nauticalmilelite=(edtValue)*19.101964263;
nauticalmilegallon=(edtValue)*72.308800603;
kilometergallon=(edtValue)*134.00592029;
metergallonus=(edtValue)*134005.92029;
metergallonUK=(edtValue)*160934.72902;
milegallonus=(edtValue)*83.267418454;
milegallonuk=(edtValue)*99.999999988;
metercubicmeter=(edtValue)*35400618.996;
metercubiccm=(edtValue)*35.400618996;
metercubicyard=(edtValue)*27065715.235;
metercubicfoot=(edtValue)*1002433.8974;
metercubicinch=(edtValue)*580.11220917;
meterquartUS=(edtValue)*33501.48009;
meterquartuk=(edtValue)*40233.682237;
meterpintUS=(edtValue)*16750.7400370;
meterpintuk=(edtValue)*20116.841125;
metercupUS=(edtValue)*8375.3700186;
metercupk=(edtValue)*10058.420565;
meterfluidounceus=(edtValue)*1046.9212525;
meterfluidounceuk=(edtValue)*1005.8420565;
litermeter=(edtValue)*0.0000282481;
liter100km=(edtValue)*2.8248093631;
gallonUSmile=(edtValue)*0.0120094993;
gallonUS100mi=(edtValue)*1.2009499256;
gallonUKmile=(edtValue)*0.01;
gallonUK100mi=(edtValue)*1;


break;

				
				}
				    results.setMeterliter(meterliter);
	    	         results.setExameterliter(exameterliter);
	    	         results.setPetameterliter(petameterliter); 
	    	         results.setTerameterliter(terameterliter);
	    	         results.setGigameterliter(gigameterliter);
	    	         results.setMegameterliter(megameterliter);
	    	         results.setKilometerliter(kilometerliter);
	    	         results.setHectometerliter(hectometerliter); 
	    	         results.setDekameterliter(dekameterliter);
	    	         results.setCentimeterliter(centimeterliter);
	    	         results.setMileusliter(mileusliter);
	    	         results.setNauticalmilelite(nauticalmilelite);
	    	         results.setNauticalmilegallon(nauticalmilegallon);
	    	         results.setKilometergallon(kilometergallon);
	    	         results.setMetergallonus(metergallonus); 
	    	         results.setMetergallonUK(metergallonUK);
	    	         results.setMilegallonus(milegallonus);
	    	         results.setMilegallonuk(milegallonuk);
	    	         results.setMetercubicmeter(metercubicmeter);
	    	         results.setMetercubiccm(metercubiccm); 
	    	         results.setMetercubicyard(metercubicyard);
	    	         results.setMetercubicfoot(metercubicfoot);
	    	         results.setMetercubicinch(metercubicinch);
	    	         results.setMeterquartUS(meterquartUS);
	    	         results.setMeterquartuk(meterquartuk);
	    	         results.setMeterpintUS(meterpintUS);
	    	         results.setMeterpintuk(meterpintuk); 
	    	         results.setMetercupUS(metercupUS);
	    	         results.setMetercupk(metercupk);
	    	         results.setMeterfluidounceus(meterfluidounceus);
	    	         results.setMeterfluidounceuk(meterfluidounceuk);
	    	         results.setLitermeter(litermeter); 
	    	         results.setLiter100km(liter100km);
	    	         results.setGallonUSmile(gallonUSmile);
	    	         results.setGallonUS100mi(gallonUS100mi);
	    	         results.setGallonUKmile(gallonUKmile);
	    	         results.setGallonUK100mi(gallonUK100mi);
	    	         
	    	        
	    	         converterArray.add(results);
	    	         
	 			    return converterArray;     
	    	         
			   
			  }
					  public class ConversionResults{
						  
							private double meterliter,exameterliter,petameterliter,terameterliter,gigameterliter,megameterliter,kilometerliter,hectometerliter,dekameterliter,centimeterliter,
				                           mileusliter,nauticalmilelite,nauticalmilegallon,kilometergallon,metergallonus,metergallonUK,milegallonus,milegallonuk,metercubicmeter,metercubiccm,
				                           metercubicyard,metercubicfoot,metercubicinch,meterquartUS,meterquartuk,meterpintUS,meterpintuk,metercupUS,metercupk,meterfluidounceus,
				                            meterfluidounceuk,litermeter,liter100km,gallonUSmile,gallonUS100mi,gallonUKmile,gallonUK100mi;

							public double getMeterliter() {
								return meterliter;
							}

							public void setMeterliter(double meterliter) {
								this.meterliter = meterliter;
							}

							public double getExameterliter() {
								return exameterliter;
							}

							public void setExameterliter(double exameterliter) {
								this.exameterliter = exameterliter;
							}

							public double getPetameterliter() {
								return petameterliter;
							}

							public void setPetameterliter(double petameterliter) {
								this.petameterliter = petameterliter;
							}

							public double getTerameterliter() {
								return terameterliter;
							}

							public void setTerameterliter(double terameterliter) {
								this.terameterliter = terameterliter;
							}

							public double getGigameterliter() {
								return gigameterliter;
							}

							public void setGigameterliter(double gigameterliter) {
								this.gigameterliter = gigameterliter;
							}

							public double getMegameterliter() {
								return megameterliter;
							}

							public void setMegameterliter(double megameterliter) {
								this.megameterliter = megameterliter;
							}

							public double getKilometerliter() {
								return kilometerliter;
							}

							public void setKilometerliter(double kilometerliter) {
								this.kilometerliter = kilometerliter;
							}

							public double getHectometerliter() {
								return hectometerliter;
							}

							public void setHectometerliter(double hectometerliter) {
								this.hectometerliter = hectometerliter;
							}

							public double getDekameterliter() {
								return dekameterliter;
							}

							public void setDekameterliter(double dekameterliter) {
								this.dekameterliter = dekameterliter;
							}

							public double getCentimeterliter() {
								return centimeterliter;
							}

							public void setCentimeterliter(double centimeterliter) {
								this.centimeterliter = centimeterliter;
							}

							public double getMileusliter() {
								return mileusliter;
							}

							public void setMileusliter(double mileusliter) {
								this.mileusliter = mileusliter;
							}

							public double getNauticalmilelite() {
								return nauticalmilelite;
							}

							public void setNauticalmilelite(double nauticalmilelite) {
								this.nauticalmilelite = nauticalmilelite;
							}

							public double getNauticalmilegallon() {
								return nauticalmilegallon;
							}

							public void setNauticalmilegallon(double nauticalmilegallon) {
								this.nauticalmilegallon = nauticalmilegallon;
							}

							public double getKilometergallon() {
								return kilometergallon;
							}

							public void setKilometergallon(double kilometergallon) {
								this.kilometergallon = kilometergallon;
							}

							public double getMetergallonus() {
								return metergallonus;
							}

							public void setMetergallonus(double metergallonus) {
								this.metergallonus = metergallonus;
							}

							public double getMetergallonUK() {
								return metergallonUK;
							}

							public void setMetergallonUK(double metergallonUK) {
								this.metergallonUK = metergallonUK;
							}

							public double getMilegallonus() {
								return milegallonus;
							}

							public void setMilegallonus(double milegallonus) {
								this.milegallonus = milegallonus;
							}

							public double getMilegallonuk() {
								return milegallonuk;
							}

							public void setMilegallonuk(double milegallonuk) {
								this.milegallonuk = milegallonuk;
							}

							public double getMetercubicmeter() {
								return metercubicmeter;
							}

							public void setMetercubicmeter(double metercubicmeter) {
								this.metercubicmeter = metercubicmeter;
							}

							public double getMetercubiccm() {
								return metercubiccm;
							}

							public void setMetercubiccm(double metercubiccm) {
								this.metercubiccm = metercubiccm;
							}

							public double getMetercubicyard() {
								return metercubicyard;
							}

							public void setMetercubicyard(double metercubicyard) {
								this.metercubicyard = metercubicyard;
							}

							public double getMetercubicfoot() {
								return metercubicfoot;
							}

							public void setMetercubicfoot(double metercubicfoot) {
								this.metercubicfoot = metercubicfoot;
							}

							public double getMetercubicinch() {
								return metercubicinch;
							}

							public void setMetercubicinch(double metercubicinch) {
								this.metercubicinch = metercubicinch;
							}

							public double getMeterquartUS() {
								return meterquartUS;
							}

							public void setMeterquartUS(double meterquartUS) {
								this.meterquartUS = meterquartUS;
							}

							public double getMeterquartuk() {
								return meterquartuk;
							}

							public void setMeterquartuk(double meterquartuk) {
								this.meterquartuk = meterquartuk;
							}

							public double getMeterpintUS() {
								return meterpintUS;
							}

							public void setMeterpintUS(double meterpintUS) {
								this.meterpintUS = meterpintUS;
							}

							public double getMeterpintuk() {
								return meterpintuk;
							}

							public void setMeterpintuk(double meterpintuk) {
								this.meterpintuk = meterpintuk;
							}

							public double getMetercupUS() {
								return metercupUS;
							}

							public void setMetercupUS(double metercupUS) {
								this.metercupUS = metercupUS;
							}

							public double getMetercupk() {
								return metercupk;
							}

							public void setMetercupk(double metercupk) {
								this.metercupk = metercupk;
							}

							public double getMeterfluidounceus() {
								return meterfluidounceus;
							}

							public void setMeterfluidounceus(double meterfluidounceus) {
								this.meterfluidounceus = meterfluidounceus;
							}

							public double getMeterfluidounceuk() {
								return meterfluidounceuk;
							}

							public void setMeterfluidounceuk(double meterfluidounceuk) {
								this.meterfluidounceuk = meterfluidounceuk;
							}

							public double getLitermeter() {
								return litermeter;
							}

							public void setLitermeter(double litermeter) {
								this.litermeter = litermeter;
							}

							public double getLiter100km() {
								return liter100km;
							}

							public void setLiter100km(double liter100km) {
								this.liter100km = liter100km;
							}

							public double getGallonUSmile() {
								return gallonUSmile;
							}

							public void setGallonUSmile(double gallonUSmile) {
								this.gallonUSmile = gallonUSmile;
							}

							public double getGallonUS100mi() {
								return gallonUS100mi;
							}

							public void setGallonUS100mi(double gallonUS100mi) {
								this.gallonUS100mi = gallonUS100mi;
							}

							public double getGallonUKmile() {
								return gallonUKmile;
							}

							public void setGallonUKmile(double gallonUKmile) {
								this.gallonUKmile = gallonUKmile;
							}

							public double getGallonUK100mi() {
								return gallonUK100mi;
							}

							public void setGallonUK100mi(double gallonUK100mi) {
								this.gallonUK100mi = gallonUK100mi;
							}

							

						  
					  }
}
