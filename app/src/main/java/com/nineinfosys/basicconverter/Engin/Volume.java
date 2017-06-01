package com.nineinfosys.basicconverter.Engin;

import java.text.DecimalFormat;
import java.util.ArrayList;


public class Volume {
	
	private double cubicmeter ,cubickilometer, cubiccentimeter, cubicmillimeter,liter ,milliliter ,gallon ,quart  , pintUS  ,cupUS , tablespoonUS ,teaspoonUS,cubicmile ,cubicyard , cubicfoot,cubicinch  ,cubicdecimeter,exaliter ,
	petaliter ,teraliter  ,gigaliter  ,megaliter ,kiloliter ,hectoliter ,dekaliter , deciliter , centiliter , microliter , nanoliter ,picoliter ,femtoliter ,attoliter ,cc , drop , barreloil,barrelUS, barrelUK , gallonUK
	, quartUK ,pintUK,cupmetric,cupUK, fluidounceUS,fluidounceUK,tablespoonmetric,tablespoonUK,dessertspoonUS , dessertspoonUK,teaspoonmetric , teaspoonUK,gillUS, gillUK,minimUS , minimUK ,tonregister ,ccf ,hundresdcubicfoot,acrefoot,acrefootUSsurvey, acreinch ,dekastere ,stere ,decistere ,cord,tun,hogshead,boardfoot , dram ,cor ,homerBiblical, bathBiblical,hinBiblical,cabBiblical, logBiblical,TazaSpanish,Earthsvolume;
	private double edtValue;
	private String conversionFrom;
	
	

	public Volume(String conversionFrom, double edtValue) {
		// TODO Auto-generated constructor stub
		this.conversionFrom = conversionFrom;
		this.edtValue = edtValue;
	}

	public ArrayList<ConversionResults> calculateVolumeConversion()
    {
    	
		ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
			
		ConversionResults results= new ConversionResults();
		switch(conversionFrom)
		{
		 case "Cubic meter - m^3":
	  			
			 cubicmeter();
			 break;
				
		 case "Cubic kilometer  - km^3":
	  			cubickilometer();
	  			break;
				
		 case "Cubic centimeter  - cm^3":
	  			cubiccentimeter();
	  			break;
				
		 case "Cubic millimeter - mm^3":
	  			cubicmilimeter();
	  			break;
				
		 case "Liter - L":
	  			liter();
	  			break;
		 case "Milliliter  - mL":
	  			milliliter();
	  			break;
					
		 case "Gallons(US) - gallon":
	  			gallonus();
	  			break;
				
		 case "Quart(US) - qt":
	  			quartus();
	  			break;
				
		 case "Pint(US)  - pt":
	  			pintus();
	  			break;
				
		 case "Cup(US)  - cup":
	  			cupus();
	  			break;
				
		 case "Tablespoon - tblsp":
	  			
			    cubicmeter=(edtValue)*0.0000147868;
			    cubickilometer=(edtValue)*1.478676478E-14 ;
			    cubiccentimeter=(edtValue)*14.786764781;
			    cubicmillimeter=(edtValue)*14786.764781;
			    liter=(edtValue)*0.0147867648;
			    milliliter=(edtValue)*14.786764781;
			    gallon=(edtValue)*0.00390625;
			    quart=(edtValue)*0.015625;
			    pintUS=(edtValue)*0.03125;
			    cupUS=(edtValue)*0.0625;
			    tablespoonUS=(edtValue)*1;
			    teaspoonUS=(edtValue)*3;
			    cubicmile=(edtValue)*3.547533529E-15;
			    cubicyard=(edtValue)*0.0000193404;
			    cubicfoot=(edtValue)*0.0005221897;
			    cubicinch=(edtValue)*0.90234375;
			    cubicdecimeter=(edtValue)*0.0147867648;
			    exaliter=(edtValue)*1.478676478E-20;
			    petaliter=(edtValue)*1.478676478E-17;
			    teraliter=(edtValue)*1.478676478E-14;
			    gigaliter=(edtValue)*1.478676478E-11;
			    megaliter=(edtValue)*1.478676478E-8;
			    kiloliter=(edtValue)*0.0000147868;
			    hectoliter=(edtValue)*0.0001478676;
			    dekaliter=(edtValue)*0.0014786765;
			    deciliter=(edtValue)*0.1478676478;
			    centiliter=(edtValue)*1.4786764781;
			    microliter=(edtValue)*14786.764781;
			    nanoliter=(edtValue)*14786764.781;
			    picoliter=(edtValue)*14786764781.0;
			    femtoliter=(edtValue)*14786764781250.0;
			    attoliter=(edtValue)*14786764781249998.0;
			    cc=(edtValue)*14.786764781;
	  			
			    drop=(edtValue)*295.73529562;
			    barreloil=(edtValue)*0.000093006 ;
			    barrelUS=(edtValue)*0.0001240079;
			    barrelUK=(edtValue)*0.0000903509;
			    gallonUK=(edtValue)*0.0032526335;
			    quartUK=(edtValue)*0.0130105341;
			    pintUK=(edtValue)*0.0260210683;
			    cupmetric=(edtValue)*0.0591470591;
			    cupUK=(edtValue)*0.0520421365;
			    fluidounceUS=(edtValue)*0.5;
			    fluidounceUK=(edtValue)*0.5204213654;
			    tablespoonmetric=(edtValue)*0.9857843188;
			    tablespoonUK=(edtValue)*0.8326741846;
			    dessertspoonUS=(edtValue)*1.5;
	  			
			    dessertspoonUK=(edtValue)*1.2490112769;
			    teaspoonmetric=(edtValue)*2.9573529562;
			    teaspoonUK=(edtValue)*2.4980225539;
			    gillUS=(edtValue)*0.125;
			    gillUK=(edtValue)*0.1040842731;
			    minimUS=(edtValue)*240;
			    minimUK=(edtValue)*249.80225539;
			    tonregister=(edtValue)*0.0000052219;
			    ccf=(edtValue)*0.0000052219;
			    hundresdcubicfoot=(edtValue)*0.0000052219;
			    acrefoot=(edtValue)*1.19878253E-8;
			    acrefootUSsurvey=(edtValue)*1.198775337E-8;
			    
			    
			    
			    acreinch=(edtValue)*1.438539036E-7;
			    dekastere=(edtValue)*0.0000014787;
			    stere=(edtValue)*0.0000147868;
			    decistere=(edtValue)*0.0001478676;
			    cord=(edtValue)*0.0000040796;
			    tun=(edtValue)*0.000015501;
			    hogshead=(edtValue)*0.000062004;
			    boardfoot=(edtValue)*0.006266276;
			    dram=(edtValue)*4;
			    cor=(edtValue)*0.0000672126;
			    homerBiblical=(edtValue)*0.0000672126;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.0006721257;
			    hinBiblical=(edtValue)*0.004032754;
			    cabBiblical=(edtValue)*0.0120982621;
			    logBiblical=(edtValue)*0.0483930484;
			    TazaSpanish=(edtValue)*0.0625;
			    Earthsvolume=(edtValue)*1.365352242E-26;
			    
	  			break;
				
		 case "Teaspoon - tsp":
	  			
			    cubicmeter=(edtValue)*0.0000049289;
			    cubickilometer=(edtValue)*4.928921593E-15 ;
			    cubiccentimeter=(edtValue)*4.9289215937;
			    cubicmillimeter=(edtValue)*4928.9215937;
			    liter=(edtValue)*0.0049289216;
			    milliliter=(edtValue)*4.9289215937;
			    gallon=(edtValue)*0.0013020833;
			    quart=(edtValue)*0.0052083333;
			    pintUS=(edtValue)*0.0104166667;
			    cupUS=(edtValue)*0.0208333333;
			    tablespoonUS=(edtValue)*0.3333333333;
			    teaspoonUS=(edtValue)*1;
			    cubicmile=(edtValue)*1.182511176E-15;
			    cubicyard=(edtValue)*0.0000064468;
			    cubicfoot=(edtValue)*0.0001740632;
			    cubicinch=(edtValue)*0.30078125;
			    cubicdecimeter=(edtValue)*0.0049289216;
			    exaliter=(edtValue)*4.928921593E-21;
			    petaliter=(edtValue)*4.928921593E-18;
			    teraliter=(edtValue)*4.928921593E-15;
			    gigaliter=(edtValue)*4.928921593E-12;
			    megaliter=(edtValue)*4.928921593E-9;
			    kiloliter=(edtValue)*0.0000049289;
			    hectoliter=(edtValue)*0.0000492892;
			    dekaliter=(edtValue)*0.0004928922;
			    deciliter=(edtValue)*0.0492892159;
			    centiliter=(edtValue)*0.4928921594;
			    microliter=(edtValue)*4928.9215937;
			    nanoliter=(edtValue)*4928921.5937;
			    picoliter=(edtValue)*4928921593.7;
			    femtoliter=(edtValue)*4928921593750.0;
			    attoliter=(edtValue)*4928921593749952.0;
			    cc=(edtValue)*4.9289215937;
	  			
			    drop=(edtValue)*98.578431875;
			    barreloil=(edtValue)* 0.000031002;
			    barrelUS=(edtValue)*0.000041336;
			    barrelUK=(edtValue)*0.000030117;
			    gallonUK=(edtValue)*0.0010842112;
			    quartUK=(edtValue)*0.0043368447;
			    pintUK=(edtValue)*0.0086736894;
			    cupmetric=(edtValue)*0.0197156864;
			    cupUK=(edtValue)*0.0173473788;
			    fluidounceUS=(edtValue)*0.1666666667;
			    fluidounceUK=(edtValue)*0.1734737885;
			    tablespoonmetric=(edtValue)*0.3285947729;
			    tablespoonUK=(edtValue)*0.2775580615;
			    dessertspoonUS=(edtValue)*0.5;
	  			
			    dessertspoonUK=(edtValue)*0.4163370923;
			    teaspoonmetric=(edtValue)*0.9857843187;
			    teaspoonUK=(edtValue)*0.8326741846;
			    gillUS=(edtValue)*0.0416666667;
			    gillUK=(edtValue)*0.0346947577;
			    minimUS=(edtValue)*80;
			    minimUK=(edtValue)*83.267418463;
			    tonregister=(edtValue)*0.0000017406;
			    ccf=(edtValue)*0.0000017406;
			    hundresdcubicfoot=(edtValue)*0.0000017406;
			    acrefoot=(edtValue)*3.995941767E-9;
			    acrefootUSsurvey=(edtValue)*3.995917791E-9;
			    
			    
			    
			    acreinch=(edtValue)*4.79513012E-8;
			    dekastere=(edtValue)*4.928921593E-7;
			    stere=(edtValue)*0.0000049289;
			    decistere=(edtValue)*0.0000492892;
			    cord=(edtValue)*0.0000013599;
			    tun=(edtValue)*0.000005167;
			    hogshead=(edtValue)*0.000020668;
			    boardfoot=(edtValue)*0.0020887587;
			    dram=(edtValue)*1.3333333333;
			    cor=(edtValue)*0.0000224042;
			    homerBiblical=(edtValue)*0.0000224042;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.0002240419;
			    hinBiblical=(edtValue)*0.0013442513;
			    cabBiblical=(edtValue)*0.0013442513;
			    logBiblical=(edtValue)*0.0161310161;
			    TazaSpanish=(edtValue)*0.0208333333;
			    Earthsvolume=(edtValue)*4.55117414E-27;
			    
	  			break;
				
		 case "Cubic mile - mi^3":
	  			
			    cubicmeter=(edtValue)*4168181825.4;
			    cubickilometer=(edtValue)*4.1681818254 ;
			    cubiccentimeter=(edtValue)*4168181825440540.0;
			    cubicmillimeter=(edtValue)*4168181825440539600.0;
			    liter=(edtValue)*4168181825441.0;
			    milliliter=(edtValue)*4168181825440540.0;
			    gallon=(edtValue)*1101117147429.0;
			    quart=(edtValue)*4404468589714.0;
			    pintUS=(edtValue)*8808937179429.0;
			    cupUS=(edtValue)*17617874358857.0;
			    tablespoonUS=(edtValue)*281885989741712.0;
			    teaspoonUS=(edtValue)*845657969225143.0;
			    cubicmile=(edtValue)*1;
			    cubicyard=(edtValue)*5451776000.0;
			    cubicfoot=(edtValue)*147197952000.0;
			    cubicinch=(edtValue)*254358061055996.0;
			    cubicdecimeter=(edtValue)*4168181825441.0;
			    exaliter=(edtValue)*0.0000041682;
			    petaliter=(edtValue)*0.0041681818;
			    teraliter=(edtValue)*4.1681818254;
			    gigaliter=(edtValue)*4168.1818254;
			    megaliter=(edtValue)*4168181.8254;
			    kiloliter=(edtValue)*4168181825.4;
			    hectoliter=(edtValue)*41681818254.0;
			    dekaliter=(edtValue)*416818182544.0;
			    deciliter=(edtValue)*41681818254405.0;
			    centiliter=(edtValue)*416818182544054.0;
			    microliter=(edtValue)*4168181825440539600.0;
			    nanoliter=(edtValue)*4.168181825E+21;
			    picoliter=(edtValue)*4.168181825E+24;
			    femtoliter=(edtValue)*4.168181825E+27;
			    attoliter=(edtValue)*4.168181825E+30;
			    cc=(edtValue)*4168181825440540.0;
	  			
			    drop=(edtValue)*83363636508810780.0;
			    barreloil=(edtValue)* 26217074939.0;
			    barrelUS=(edtValue)*34956099918.0;
			    barrelUK=(edtValue)*25468661748.0;
			    gallonUK=(edtValue)*916871822916.0;
			    quartUK=(edtValue)*3667487291664.0;
			    pintUK=(edtValue)*7334974583329.0;
			    cupmetric=(edtValue)*16672727301762.0;
			    cupUK=(edtValue)*14669949166657.0;
			    fluidounceUS=(edtValue)*140942994870856.0;
			    fluidounceUK=(edtValue)*146699491666572.0;
			    tablespoonmetric=(edtValue)*277878788362704.0;
			    tablespoonUK=(edtValue)*234719186666513.0;
			    dessertspoonUS=(edtValue)*422828984612572.0;
	  			
			    dessertspoonUK=(edtValue)*352078779999774.0;
			    teaspoonmetric=(edtValue)*833636365088108.0;
			    teaspoonUK=(edtValue)*704157559999548.0;
			    gillUS=(edtValue)*35235748717714.0;
			    gillUK=(edtValue)*29339898333314.0;
			    minimUS=(edtValue)*67652637538012280.0;
			    minimUK=(edtValue)*70415755999954810.0;
			    tonregister=(edtValue)*1471979520;
			    ccf=(edtValue)*1471979520;
			    hundresdcubicfoot=(edtValue)*1471979520;
			    acrefoot=(edtValue)*3379200;
			    acrefootUSsurvey=(edtValue)*3379179.7248;
			    
			    
			    
			    acreinch=(edtValue)*40550400;
			    dekastere=(edtValue)*416818182.54;
			    stere=(edtValue)*4168181825.4;
			    decistere=(edtValue)*41681818254.0;
			    cord=(edtValue)*1149984000;
			    tun=(edtValue)*4369512489.8;
			    hogshead=(edtValue)*17478049959.0;
			    boardfoot=(edtValue)*1766375424000.0;
			    dram=(edtValue)*1127543958966830.0;
			    cor=(edtValue)*18946281025.0;
			    homerBiblical=(edtValue)*18946281025.0;
	  			
	  			
			    
			    bathBiblical=(edtValue)*189462810247.0;
			    hinBiblical=(edtValue)*1136776861484.0;
			    cabBiblical=(edtValue)*3410330584451.0;
			    logBiblical=(edtValue)*13641322337806.0;
			    TazaSpanish=(edtValue)*13641322337806.0;
			    Earthsvolume=(edtValue)*3.84873668E-12;
			    
	  			break;
				
	  			
		 case "Cubic yard - yd^3":
	  			
			    cubicmeter=(edtValue)*0.764554858;
			    cubickilometer=(edtValue)*7.645548579E-10 ;
			    cubiccentimeter=(edtValue)*764554.85798;
			    cubicmillimeter=(edtValue)*764554857.98;
			    liter=(edtValue)*764.55485798;
			    milliliter=(edtValue)*764554.85798;
			    gallon=(edtValue)*201.97402597;
			    quart=(edtValue)*807.8961039;
			    pintUS=(edtValue)*1615.7922078;
			    cupUS=(edtValue)*3231.5844156;
			    tablespoonUS=(edtValue)*51705.350649;
			    teaspoonUS=(edtValue)*155116.05195;
			    cubicmile=(edtValue)*1.83426465E-10;
			    cubicyard=(edtValue)*1;
			    cubicfoot=(edtValue)*27;
			    cubicinch=(edtValue)*46656;
			    cubicdecimeter=(edtValue)*764.55485798;
			    exaliter=(edtValue)*7.645548579E-16;
			    petaliter=(edtValue)*7.645548579E-13;
			    teraliter=(edtValue)*7.645548579E-10;
			    gigaliter=(edtValue)*7.645548579E-7;
			    megaliter=(edtValue)*0.0007645549;
			    kiloliter=(edtValue)*0.764554858;
			    hectoliter=(edtValue)*7.6455485798;
			    dekaliter=(edtValue)*76.455485798;
			    deciliter=(edtValue)*7645.5485798;
			    centiliter=(edtValue)*76455.485798;
			    microliter=(edtValue)*764554857.98;
			    nanoliter=(edtValue)*764554857984.0;
			    picoliter=(edtValue)*764554857983996.0;
			    femtoliter=(edtValue)*764554857983995500.0;
			    attoliter=(edtValue)*764554857983995500000.0;
			    cc=(edtValue)*764554.85798;
	  			
			    drop=(edtValue)*15291097.16;
			    barreloil=(edtValue)*4.8089053803 ;
			    barrelUS=(edtValue)*6.4118738404;
			    barrelUK=(edtValue)*4.6716265943;
			    gallonUK=(edtValue)*168.17855739;
			    quartUK=(edtValue)*672.71422958;
			    pintUK=(edtValue)*1345.4284592;
			    cupmetric=(edtValue)*3058.2194319;
			    cupUK=(edtValue)*2690.8569183;
			    fluidounceUS=(edtValue)*25852.675325;
			    fluidounceUK=(edtValue)*26908.569183;
			    tablespoonmetric=(edtValue)*50970.323866;
			    tablespoonUK=(edtValue)*43053.710693;
			    dessertspoonUS=(edtValue)*77558.025974;
	  			
			    dessertspoonUK=(edtValue)*64580.566039;
			    teaspoonmetric=(edtValue)*152910.9716;
			    teaspoonUK=(edtValue)*129161.13208;
			    gillUS=(edtValue)*6463.1688312;
			    gillUK=(edtValue)*5381.7138366;
			    minimUS=(edtValue)*12409284.156;
			    minimUK=(edtValue)*12916113.208;
			    tonregister=(edtValue)*0.27;
			    ccf=(edtValue)*0.27;
			    hundresdcubicfoot=(edtValue)*0.27;
			    acrefoot=(edtValue)*0.0006198347;
			    acrefootUSsurvey=(edtValue)*0.000619831;
			    
			    
			    
			    acreinch=(edtValue)*0.0074380165;
			    dekastere=(edtValue)*0.0764554858;
			    stere=(edtValue)*0.764554858;
			    decistere=(edtValue)*7.6455485798;
			    cord=(edtValue)*0.2109375;
			    tun=(edtValue)*0.8014842301;
			    hogshead=(edtValue)*3.2059369202;
			    boardfoot=(edtValue)*324;
			    dram=(edtValue)*206821.4026;
			    cor=(edtValue)*3.4752493545;
			    homerBiblical=(edtValue)*3.4752493545;
	  			
	  			
			    
			    bathBiblical=(edtValue)*34.752493545;
			    hinBiblical=(edtValue)*208.51496127;
			    cabBiblical=(edtValue)*625.54488381;
			    logBiblical=(edtValue)*2502.1795352;
			    TazaSpanish=(edtValue)*3231.5844156;
			    Earthsvolume=(edtValue)*7.059601643E-22;
			    
	  			break;
				
	  			
		 case "Cubic foot - ft^3":
	  			
			    cubicmeter=(edtValue)*0.0283168466;
			    cubickilometer=(edtValue)*2.831684659E-11 ;
			    cubiccentimeter=(edtValue)*28316.846592;
			    cubicmillimeter=(edtValue)*28316846.592;
			    liter=(edtValue)*28.316846592;
			    milliliter=(edtValue)*28316.846592;
			    gallon=(edtValue)*7.4805194805;
			    quart=(edtValue)*29.922077922;
			    pintUS=(edtValue)*59.844155844;
			    cupUS=(edtValue)*119.68831169;
			    tablespoonUS=(edtValue)*1915.012987;
			    teaspoonUS=(edtValue)*5745.038961;
			    cubicmile=(edtValue)*6.79357278E-12;
			    cubicyard=(edtValue)*0.037037037;
			    cubicfoot=(edtValue)*1;
			    cubicinch=(edtValue)*1728;
			    cubicdecimeter=(edtValue)*28.316846592;
			    exaliter=(edtValue)*2.831684659E-17;
			    petaliter=(edtValue)*2.831684659E-14;
			    teraliter=(edtValue)*2.831684659E-11;
			    gigaliter=(edtValue)*2.831684659E-8;
			    megaliter=(edtValue)*0.0000283168;
			    kiloliter=(edtValue)*0.0283168466;
			    hectoliter=(edtValue)*0.2831684659;
			    dekaliter=(edtValue)*2.8316846592;
			    deciliter=(edtValue)*283.16846592;
			    centiliter=(edtValue)*2831.6846592;
			    microliter=(edtValue)*28316846.592;
			    nanoliter=(edtValue)*28316846592.0;
			    picoliter=(edtValue)*28316846592000.0;
			    femtoliter=(edtValue)*28316846591999668.0;
			    attoliter=(edtValue)*28316846591999670000.0;
			    cc=(edtValue)*28316.846592;
	  			
			    drop=(edtValue)*566336.93184;
			    barreloil=(edtValue)*0.1781076067 ;
			    barrelUS=(edtValue)*0.2374768089;
			    barrelUK=(edtValue)*0.1730232072;
			    gallonUK=(edtValue)*6.228835459;
			    quartUK=(edtValue)*24.915341836;
			    pintUK=(edtValue)*49.830683672;
			    cupmetric=(edtValue)*113.26738637;
			    cupUK=(edtValue)*99.661367345;
			    fluidounceUS=(edtValue)*957.50649351;
			    fluidounceUK=(edtValue)*996.61367345;
			    tablespoonmetric=(edtValue)*1887.7897728;
			    tablespoonUK=(edtValue)*1594.5818775;
			    dessertspoonUS=(edtValue)*2872.5194805;
	  			
			    dessertspoonUK=(edtValue)*2391.8728163;
			    teaspoonmetric=(edtValue)*5663.3693184;
			    teaspoonUK=(edtValue)*4783.7456325;
			    gillUS=(edtValue)*239.37662338;
			    gillUK=(edtValue)*199.32273469;
			    minimUS=(edtValue)*459603.11688;
			    minimUK=(edtValue)*478374.56325;
			    tonregister=(edtValue)*0.01;
			    ccf=(edtValue)*0.01;
			    hundresdcubicfoot=(edtValue)*0.01;
			    acrefoot=(edtValue)*0.0000229568;
			    acrefootUSsurvey=(edtValue)*0.0000229567;
			    
			    
			    
			    acreinch=(edtValue)*0.0002754821;
			    dekastere=(edtValue)*0.0028316847;
			    stere=(edtValue)*0.0283168466;
			    decistere=(edtValue)*0.2831684659;
			    cord=(edtValue)*0.0078125;
			    tun=(edtValue)*0.0296846011;
			    hogshead=(edtValue)*0.1187384045;
			    boardfoot=(edtValue)*12;
			    dram=(edtValue)*7660.0519481;
			    cor=(edtValue)*0.1287129391;
			    homerBiblical=(edtValue)*0.1287129391;
	  			
	  			
			    
			    bathBiblical=(edtValue)*1.2871293905;
			    hinBiblical=(edtValue)*7.7227763433;
			    cabBiblical=(edtValue)*23.16832903;
			    logBiblical=(edtValue)*92.673316119;
			    TazaSpanish=(edtValue)*119.68831169;
			    Earthsvolume=(edtValue)*2.614667275E-23;
			    
	  			break;
				
	  			
		 case "Cubic inch - in^3":
	  			
			    cubicmeter=(edtValue)*1.513117636E-26;
			    cubickilometer=(edtValue)*1.6387064E-14 ;
			    cubiccentimeter=(edtValue)*16.387064;
			    cubicmillimeter=(edtValue)*16387.064;
			    liter=(edtValue)*0.016387064;
			    milliliter=(edtValue)*16.387064;
			    gallon=(edtValue)*0.0043290043;
			    quart=(edtValue)*0.0173160173;
			    pintUS=(edtValue)*0.0346320346;
			    cupUS=(edtValue)*0.0692640693;
			    tablespoonUS=(edtValue)*1.1082251082;
			    teaspoonUS=(edtValue)*3.3246753247;
			    cubicmile=(edtValue)*3.931465729E-15;
			    cubicyard=(edtValue)*0.0000214335;
			    cubicfoot=(edtValue)*0.0005787037;
			    cubicinch=(edtValue)*1;
			    cubicdecimeter=(edtValue)*0.016387064;
			    exaliter=(edtValue)*1.6387064E-20;
			    petaliter=(edtValue)*1.6387064E-17;
			    teraliter=(edtValue)*1.6387064E-14;
			    gigaliter=(edtValue)*1.6387064E-11;
			    megaliter=(edtValue)*1.6387064E-8;
			    kiloliter=(edtValue)*0.0000163871;
			    hectoliter=(edtValue)*0.0001638706;
			    dekaliter=(edtValue)*0.0016387064;
			    deciliter=(edtValue)*0.16387064;
			    centiliter=(edtValue)*1.6387064;
			    microliter=(edtValue)*16387.064;
			    nanoliter=(edtValue)*16387064;
			    picoliter=(edtValue)*163870640000.0;
			    femtoliter=(edtValue)*16387064000000.0;
			    attoliter=(edtValue)*16387064000000076.0;
			    cc=(edtValue)*16.387064;
	  			
			    drop=(edtValue)*327.74128;
			    barreloil=(edtValue)*0.0001030715 ;
			    barrelUS=(edtValue)*0.0001374287;
			    barrelUK=(edtValue)*0.0001001292;
			    gallonUK=(edtValue)*0.0036046501;
			    quartUK=(edtValue)*0.0144186006;
			    pintUK=(edtValue)*0.0288372012;
			    cupmetric=(edtValue)*0.065548256;
			    cupUK=(edtValue)*0.0576744024;
			    fluidounceUS=(edtValue)*0.5541125541;
			    fluidounceUK=(edtValue)*0.576744024;
			    tablespoonmetric=(edtValue)*1.0924709333;
			    tablespoonUK=(edtValue)*0.9227904384;
			    dessertspoonUS=(edtValue)*1.6623376623;
	  			
			    dessertspoonUK=(edtValue)*1.3841856576;
			    teaspoonmetric=(edtValue)*3.2774128;
			    teaspoonUK=(edtValue)*2.7683713151;
			    gillUS=(edtValue)*0.1385281385;
			    gillUK=(edtValue)*0.1153488048;
			    minimUS=(edtValue)*265.97402597;
			    minimUK=(edtValue)*276.83713151;
			    tonregister=(edtValue)*0.000005787;
			    ccf=(edtValue)*0.000005787;
			    hundresdcubicfoot=(edtValue)*0.000005787;
			    acrefoot=(edtValue)*1.328520899E-8;
			    acrefootUSsurvey=(edtValue)*1.328512928E-8;
			    
			    
			    
			    acreinch=(edtValue)*1.594225079E-7;
			    dekastere=(edtValue)*0.0000016387;
			    stere=(edtValue)*0.0000163871;
			    decistere=(edtValue)*0.0001638706;
			    cord=(edtValue)*0.0000045211;
			    tun=(edtValue)*0.0000171786;
			    hogshead=(edtValue)*0.0000687144;
			    boardfoot=(edtValue)*0.0069444444;
			    dram=(edtValue)*4.4329004329;
			    cor=(edtValue)*0.0000744867;
			    homerBiblical=(edtValue)*0.0000744867;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.0007448665;
			    hinBiblical=(edtValue)*0.0044691993;
			    cabBiblical=(edtValue)*0.0134075978;
			    logBiblical=(edtValue)*0.0536303913;
			    TazaSpanish=(edtValue)*0.0692640693;
			    Earthsvolume=(edtValue)*1.513117636E-26;
			    
	  			break;
				
	  			
		 case "Cubic decimeter - dm^3":
	  			
			    cubicmeter=(edtValue)*0.001;
			    cubickilometer=(edtValue)* 1.E-12;
			    cubiccentimeter=(edtValue)*1000;
			    cubicmillimeter=(edtValue)*1000000;
			    liter=(edtValue)*1;
			    milliliter=(edtValue)*1000;
			    gallon=(edtValue)*0.2641720524;
			    quart=(edtValue)*1.0566882094;
			    pintUS=(edtValue)*2.1133764189;
			    cupUS=(edtValue)*4.2267528377;
			    tablespoonUS=(edtValue)*67.628045404;
			    teaspoonUS=(edtValue)*202.88413621;
			    cubicmile=(edtValue)*2.399127585E-13;
			    cubicyard=(edtValue)*0.0013079506;
			    cubicfoot=(edtValue)*0.0353146667;
			    cubicinch=(edtValue)*61.023744095;
			    cubicdecimeter=(edtValue)*1;
			    exaliter=(edtValue)*1.E-18;
			    petaliter=(edtValue)*1.E-15;
			    teraliter=(edtValue)*1.E-12;
			    gigaliter=(edtValue)*1.E-9;
			    megaliter=(edtValue)*0.000001;
			    kiloliter=(edtValue)*0.001;
			    hectoliter=(edtValue)*0.01;
			    dekaliter=(edtValue)*0.1;
			    deciliter=(edtValue)*10;
			    centiliter=(edtValue)*100;
			    microliter=(edtValue)*1000000;
			    nanoliter=(edtValue)*1000000;
			    picoliter=(edtValue)*1000000000000.0;
			    femtoliter=(edtValue)*1000000000000000.0;
			    attoliter=(edtValue)*1000000000000000000.0;
			    cc=(edtValue)*1000;
	  			
			    drop=(edtValue)*20000;
			    barreloil=(edtValue)* 0.0062898108;
			    barrelUS=(edtValue)*0.0083864144;
			    barrelUK=(edtValue)*0.0061102569;
			    gallonUK=(edtValue)*0.2199692483;
			    quartUK=(edtValue)*0.8798769932;
			    pintUK=(edtValue)*1.7597539864;
			    cupmetric=(edtValue)*4;
			    cupUK=(edtValue)*3.5195079728;
			    fluidounceUS=(edtValue)*33.814022702;
			    fluidounceUK=(edtValue)*35.195079728;
			    tablespoonmetric=(edtValue)*66.666666667;
			    tablespoonUK=(edtValue)*56.312127565;
			    dessertspoonUS=(edtValue)*101.44206811;
	  			
			    dessertspoonUK=(edtValue)*84.468191347;
			    teaspoonmetric=(edtValue)*200;
			    teaspoonUK=(edtValue)*168.93638269;
			    gillUS=(edtValue)*8.4535056755;
			    gillUK=(edtValue)*7.0390159456;
			    minimUS=(edtValue)*16230.730897;
			    minimUK=(edtValue)*16893.638269;
			    tonregister=(edtValue)*0.0003531467;
			    ccf=(edtValue)*0.0003531467;
			    hundresdcubicfoot=(edtValue)*0.0003531467;
			    acrefoot=(edtValue)*8.107131937E-7;
			    acrefootUSsurvey=(edtValue)*8.107083295E-7;
			    
			    
			    
			    acreinch=(edtValue)*0.0000097286;
			    dekastere=(edtValue)*0.0001;
			    stere=(edtValue)*0.001;
			    decistere=(edtValue)*0.01;
			    cord=(edtValue)*0.0002758958;
			    tun=(edtValue)*0.0010483018;
			    hogshead=(edtValue)*0.0041932072;
			    boardfoot=(edtValue)*0.4237760007;
			    dram=(edtValue)*270.51218161;
			    cor=(edtValue)*0.0045454545;
			    homerBiblical=(edtValue)*0.0045454545;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.0454545455;
			    hinBiblical=(edtValue)*0.2727272727;
			    cabBiblical=(edtValue)*0.8181818182;
			    logBiblical=(edtValue)*3.2727272727;
			    TazaSpanish=(edtValue)*4.2267528377;
			    Earthsvolume=(edtValue)*9.233610341E-25;
			    
	  			break;
				
	  			
		 case "Exaliter - EL":
	  			
			    cubicmeter=(edtValue)*1000000000000000.0;
			    cubickilometer=(edtValue)*1000000.0 ;
			    cubiccentimeter=(edtValue)*999999999999999900000.0;
			    cubicmillimeter=(edtValue)*1.E+24;
			    liter=(edtValue)*999999999999999900.0;
			    milliliter=(edtValue)*999999999999999900000.0;
			    gallon=(edtValue)*264172052358149980.0;
			    quart=(edtValue)*1056688209432599900.0;
			    pintUS=(edtValue)*2113376418865199900.0;
			    cupUS=(edtValue)*4226752837730399700.0;
			    tablespoonUS=(edtValue)*67628045403685994000.0;
			    teaspoonUS=(edtValue)*202884136211060000000.0;
			    cubicmile=(edtValue)*239912.75858;
			    cubicyard=(edtValue)*1307950619314400.0;
			    cubicfoot=(edtValue)*35314666721489000.0;
			    cubicinch=(edtValue)*61023744094731990000.0;
			    cubicdecimeter=(edtValue)*999999999999999900.0;
			    exaliter=(edtValue)*1;
			    petaliter=(edtValue)*1000;
			    teraliter=(edtValue)*1000000;
			    gigaliter=(edtValue)*1000000000;
			    megaliter=(edtValue)*1000000000000.0;
			    kiloliter=(edtValue)*1000000000000000.0;
			    hectoliter=(edtValue)*10000000000000000.0;
			    dekaliter=(edtValue)*99999999999999980.0;
			    deciliter=(edtValue)*10000000000000000000.0;
			    centiliter=(edtValue)*100000000000000000000.0;
			    microliter=(edtValue)*1.E+24;
			    nanoliter=(edtValue)*9.999999999E+26;
			    picoliter=(edtValue)*1.E+30;
			    femtoliter=(edtValue)*1.E+33;
			    attoliter=(edtValue)*9.999999999E+35;
			    cc=(edtValue)*999999999999999900000.0;
	  			
			    drop=(edtValue)*2.E+22;
			    barreloil=(edtValue)*6289810770432100.0 ;
			    barrelUS=(edtValue)*8386414360576100.0;
			    barrelUK=(edtValue)*6110256897196900.0;
			    gallonUK=(edtValue)*219969248299090000.0;
			    quartUK=(edtValue)*879876993196350000.0;
			    pintUK=(edtValue)*1759753986392700000.0;
			    cupmetric=(edtValue)*3519507972785400000.0;
			    cupUK=(edtValue)*33814022701842997000.0;
			    fluidounceUS=(edtValue)*35195079727854000000.0;
			    fluidounceUK=(edtValue)*66666666666666990000.0;
			    tablespoonmetric=(edtValue)*56312127564565996000.0;
			    tablespoonUK=(edtValue)*56312127564565996000.0;
			    dessertspoonUS=(edtValue)*101442068105530000000.0;
	  			
			    dessertspoonUK=(edtValue)*84468191346849990000.0;
			    teaspoonmetric=(edtValue)*200000000000000000000.0;
			    teaspoonUK=(edtValue)*168936382693699980000.0;
			    gillUS=(edtValue)*8453505675460799000.0;
			    gillUK=(edtValue)*7039015945570800000.0;
			    minimUS=(edtValue)*1.623073089E+22;
			    minimUK=(edtValue)*1.689363826E+22;
			    tonregister=(edtValue)*353146667214890.0;
			    ccf=(edtValue)*353146667214890.0;
			    hundresdcubicfoot=(edtValue)*353146667214890.0;
			    acrefoot=(edtValue)*810713193790.0;
			    acrefootUSsurvey=(edtValue)*810708329520.0;
			    
			    
			    
			    acreinch=(edtValue)*9728558325479.0;
			    dekastere=(edtValue)*100000000000000.0;
			    stere=(edtValue)*1000000000000000.0;
			    decistere=(edtValue)*10000000000000000.0;
			    cord=(edtValue)*275895833761630.0;
			    tun=(edtValue)*1048301795072000.0;
			    hogshead=(edtValue)*4193207180288100.0;
			    boardfoot=(edtValue)*423776000657860000.0;
			    dram=(edtValue)*270512181614739980000.0;
			    cor=(edtValue)*4545454545454600.0;
			    homerBiblical=(edtValue)*4545454545454600.0;
	  			
	  			
			    
			    bathBiblical=(edtValue)*4545454545454600.0;
			    hinBiblical=(edtValue)*272727272727269980.0;
			    cabBiblical=(edtValue)*818181818181819900.0;
			    logBiblical=(edtValue)*3272727272727299600.0;
			    TazaSpanish=(edtValue)*4226752837730399700.0;
			    Earthsvolume=(edtValue)*9.233610341E-7;
			    
	  			break;
				
	  			
		 case "Petaliter - PL":
	  			
			    cubicmeter=(edtValue)*1000000000000.0;
			    cubickilometer=(edtValue)*1000 ;
			    cubiccentimeter=(edtValue)*1000000000000000000.0;
			    cubicmillimeter=(edtValue)*1.E+21;
			    liter=(edtValue)*1000000000000000.0;
			    milliliter=(edtValue)*1000000000000000000.0;
			    gallon=(edtValue)*264172052358150.0;
			    quart=(edtValue)*1056688209432600.0;
			    pintUS=(edtValue)*2113376418865200.0;
			    cupUS=(edtValue)*4226752837730400.0;
			    tablespoonUS=(edtValue)*67628045403686000.0;
			    teaspoonUS=(edtValue)*202884136211060000.0;
			    cubicmile=(edtValue)*239.91275858;
			    cubicyard=(edtValue)*1307950619314.0;
			    cubicfoot=(edtValue)*35314666721489.0;
			    cubicinch=(edtValue)*61023744094732000.0;
			    cubicdecimeter=(edtValue)*1000000000000000.0;
			    exaliter=(edtValue)*0.001;
			    petaliter=(edtValue)*1;
			    teraliter=(edtValue)*1000;
			    gigaliter=(edtValue)*1000000;
			    megaliter=(edtValue)*1000000000;
			    kiloliter=(edtValue)*1000000000000.0;
			    hectoliter=(edtValue)*10000000000000.0;
			    dekaliter=(edtValue)*100000000000000.0;
			    deciliter=(edtValue)*10000000000000000.0;
			    centiliter=(edtValue)*100000000000000000.0;
			    microliter=(edtValue)*1.E+21;
			    nanoliter=(edtValue)*1.E+24;
			    picoliter=(edtValue)*1.E+27;
			    femtoliter=(edtValue)*9.999999999E+29;
			    attoliter=(edtValue)*1.E+33;
			    cc=(edtValue)*1000000000000000000.0;
	  			
			    drop=(edtValue)*20000000000000000000.0;
			    barreloil=(edtValue)*6289810770432.0 ;
			    barrelUS=(edtValue)*8386414360576.0;
			    barrelUK=(edtValue)*6110256897197.0;
			    gallonUK=(edtValue)*219969248299090.0;
			    quartUK=(edtValue)*879876993196350.0;
			    pintUK=(edtValue)*1759753986392700.0;
			    cupmetric=(edtValue)*4000000000000000.0;
			    cupUK=(edtValue)*3519507972785400.0;
			    fluidounceUS=(edtValue)*33814022701843000.0;
			    fluidounceUK=(edtValue)*35195079727854000.0;
			    tablespoonmetric=(edtValue)*66666666666667000.0;
			    tablespoonUK=(edtValue)*56312127564566000.0;
			    dessertspoonUS=(edtValue)*101442068105530000.0;
	  			
			    dessertspoonUK=(edtValue)*84468191346850000.0;
			    teaspoonmetric=(edtValue)*200000000000000000.0;
			    teaspoonUK=(edtValue)*168936382693700000.0;
			    gillUS=(edtValue)*8453505675460800.0;
			    gillUK=(edtValue)*7039015945570800.0;
			    minimUS=(edtValue)*16230730896884998000.0;
			    minimUK=(edtValue)*16893638269370000000.0;
			    tonregister=(edtValue)*353146667215.0;
			    ccf=(edtValue)*353146667215.0;
			    hundresdcubicfoot=(edtValue)*353146667215.0;
			    acrefoot=(edtValue)*810713193.79;
			    acrefootUSsurvey=(edtValue)*810708329.52;
			    
			    
			    
			    acreinch=(edtValue)*9728558325.5;
			    dekastere=(edtValue)*100000000000.0;
			    stere=(edtValue)*1000000000000.0;
			    decistere=(edtValue)*10000000000000.0;
			    cord=(edtValue)*275895833762.0;
			    tun=(edtValue)*1048301795072.0;
			    hogshead=(edtValue)*4193207180288.0;
			    boardfoot=(edtValue)*423776000657860.0;
			    dram=(edtValue)*270512181614740000.0;
			    cor=(edtValue)*4545454545455.0;
			    homerBiblical=(edtValue)*4545454545455.0;
	  			
	  			
			    
			    bathBiblical=(edtValue)*45454545454546.0;
			    hinBiblical=(edtValue)*272727272727270.0;
			    cabBiblical=(edtValue)*818181818181820.0;
			    logBiblical=(edtValue)*3272727272727300.0;
			    TazaSpanish=(edtValue)*4226752837730400.0;
			    Earthsvolume=(edtValue)*9.233610341E-10;
			    
	  			break;
				
	  			
		 case "Teraliter - TL":
	  			
			    cubicmeter=(edtValue)*1000000000;
			    cubickilometer=(edtValue)*1 ;
			    cubiccentimeter=(edtValue)*1000000000000000.0;
			    cubicmillimeter=(edtValue)*1000000000000000000.0;
			    liter=(edtValue)*1000000000000.0;
			    milliliter=(edtValue)*1000000000000000.0;
			    gallon=(edtValue)*264172052358.0;
			    quart=(edtValue)*1056688209433.0;
			    pintUS=(edtValue)*2113376418865.0;
			    cupUS=(edtValue)*4226752837730.0;
			    tablespoonUS=(edtValue)*67628045403686.0;
			    teaspoonUS=(edtValue)*202884136211060.0;
			    cubicmile=(edtValue)*0.2399127586;
			    cubicyard=(edtValue)*1307950619.3;
			    cubicfoot=(edtValue)*35314666721.0;
			    cubicinch=(edtValue)*61023744094732.0;
			    cubicdecimeter=(edtValue)*1000000000000.0;
			    exaliter=(edtValue)*0.000001;
			    petaliter=(edtValue)*0.001;
			    teraliter=(edtValue)*1;
			    gigaliter=(edtValue)*1000;
			    megaliter=(edtValue)*1000000;
			    kiloliter=(edtValue)*1000000000;
			    hectoliter=(edtValue)*10000000000.0;
			    dekaliter=(edtValue)*100000000000.0;
			    deciliter=(edtValue)*10000000000000.0;
			    centiliter=(edtValue)*100000000000000.0;
			    microliter=(edtValue)*1000000000000000000.0;
			    nanoliter=(edtValue)*1.E+21;
			    picoliter=(edtValue)*1.E+24;
			    femtoliter=(edtValue)*1.E+27;
			    attoliter=(edtValue)*1.E+30;
			    cc=(edtValue)*1000000000000000.0;
	  			
			    drop=(edtValue)*20000000000000000.0;
			    barreloil=(edtValue)*6289810770.4 ;
			    barrelUS=(edtValue)*8386414360.6;
			    barrelUK=(edtValue)*6110256897.2;
			    gallonUK=(edtValue)*219969248299.0;
			    quartUK=(edtValue)*879876993196.0;
			    pintUK=(edtValue)*1759753986393.0;
			    cupmetric=(edtValue)*4000000000000.0;
			    cupUK=(edtValue)*3519507972785.0;
			    fluidounceUS=(edtValue)*33814022701843.0;
			    fluidounceUK=(edtValue)*35195079727854.0;
			    tablespoonmetric=(edtValue)*66666666666667.0;
			    tablespoonUK=(edtValue)*56312127564566.0;
			    dessertspoonUS=(edtValue)*101442068105530.0;
	  			
			    dessertspoonUK=(edtValue)*84468191346850.0;
			    teaspoonmetric=(edtValue)*200000000000000.0;
			    teaspoonUK=(edtValue)*168936382693700.0;
			    gillUS=(edtValue)*8453505675461.0;
			    gillUK=(edtValue)*7039015945571.0;
			    minimUS=(edtValue)*16230730896884998.0;
			    minimUK=(edtValue)*16893638269370000.0;
			    tonregister=(edtValue)*353146667.21;
			    ccf=(edtValue)*353146667.21;
			    hundresdcubicfoot=(edtValue)*353146667.21;
			    acrefoot=(edtValue)*810713.19379;
			    acrefootUSsurvey=(edtValue)*810708.32952;
			    
			    
			    
			    acreinch=(edtValue)*9728558.3255;
			    dekastere=(edtValue)*100000000;
			    stere=(edtValue)*1000000000;
			    decistere=(edtValue)*10000000000.0;
			    cord=(edtValue)*275895833.76;
			    tun=(edtValue)*1048301795.1;
			    hogshead=(edtValue)*4193207180.3;
			    boardfoot=(edtValue)*423776000658.0;
			    dram=(edtValue)*270512181614740.0;
			    cor=(edtValue)*4545454545.5;
			    homerBiblical=(edtValue)*4545454545.5;
	  			
	  			
			    
			    bathBiblical=(edtValue)*45454545455.0;
			    hinBiblical=(edtValue)*272727272727.0;
			    cabBiblical=(edtValue)*818181818182.0;
			    logBiblical=(edtValue)*3272727272727.0;
			    TazaSpanish=(edtValue)*4226752837730.0;
			    Earthsvolume=(edtValue)*9.233610341E-13;
			    
	  			break;
				
	  			
		 case "Gigaliter - GL":
	  			
			    cubicmeter=(edtValue)*1000000;
			    cubickilometer=(edtValue)*0.001 ;
			    cubiccentimeter=(edtValue)*1000000000000.0;
			    cubicmillimeter=(edtValue)*1000000000000000.0;
			    liter=(edtValue)*1000000000.0;
			    milliliter=(edtValue)*1000000000000.0;
			    gallon=(edtValue)*264172052.36;
			    quart=(edtValue)*1056688209.4;
			    pintUS=(edtValue)*2113376418.9;
			    cupUS=(edtValue)*4226752837.7;
			    tablespoonUS=(edtValue)*67628045404.0;
			    teaspoonUS=(edtValue)*202884136211.0;
			    cubicmile=(edtValue)*0.0002399128;
			    cubicyard=(edtValue)*1307950.6193;
			    cubicfoot=(edtValue)*35314666.721;
			    cubicinch=(edtValue)*61023744095.0;
			    cubicdecimeter=(edtValue)*1000000000.0;
			    exaliter=(edtValue)*1.E-9;
			    petaliter=(edtValue)*0.000001;
			    teraliter=(edtValue)*0.001;
			    gigaliter=(edtValue)*1;
			    megaliter=(edtValue)*1000;
			    kiloliter=(edtValue)*1000000;
			    hectoliter=(edtValue)*10000000;
			    dekaliter=(edtValue)*100000000;
			    deciliter=(edtValue)*10000000000.0;
			    centiliter=(edtValue)*100000000000.0;
			    microliter=(edtValue)*1000000000000000.0;
			    nanoliter=(edtValue)*1000000000000000000.0;
			    picoliter=(edtValue)*1.E+21;
			    femtoliter=(edtValue)*1.E+24;
			    attoliter=(edtValue)*1.E+27;
			    cc=(edtValue)*1000000000000.0;
	  			
			    drop=(edtValue)*20000000000000.0;
			    barreloil=(edtValue)*6289810.7704 ;
			    barrelUS=(edtValue)*8386414.3606;
			    barrelUK=(edtValue)*6110256.8972;
			    gallonUK=(edtValue)*219969248.3;
			    quartUK=(edtValue)*879876993.2;
			    pintUK=(edtValue)*1759753986.4;
			    cupmetric=(edtValue)*4000000000.0;
			    cupUK=(edtValue)*3519507972.8;
			    fluidounceUS=(edtValue)*33814022702.0;
			    fluidounceUK=(edtValue)*35195079728.0;
			    tablespoonmetric=(edtValue)*66666666667.0;
			    tablespoonUK=(edtValue)*56312127565.0;
			    dessertspoonUS=(edtValue)*101442068106.0;
	  			
			    dessertspoonUK=(edtValue)*84468191347.0;
			    teaspoonmetric=(edtValue)*200000000000.0;
			    teaspoonUK=(edtValue)*168936382694.0;
			    gillUS=(edtValue)*8453505675.5;
			    gillUK=(edtValue)*7039015945.6;
			    minimUS=(edtValue)*16230730896885.0;
			    minimUK=(edtValue)*16893638269370.0;
			    tonregister=(edtValue)*353146.66721;
			    ccf=(edtValue)*353146.66721;
			    hundresdcubicfoot=(edtValue)*353146.66721;
			    acrefoot=(edtValue)*810.71319379;
			    acrefootUSsurvey=(edtValue)*810.70832952;
			    
			    
			    
			    acreinch=(edtValue)*9728.5583255;
			    dekastere=(edtValue)*100000;
			    stere=(edtValue)*1000000;
			    decistere=(edtValue)*10000000;
			    cord=(edtValue)*275895.83376;
			    tun=(edtValue)*1048301.7951;
			    hogshead=(edtValue)*4193207.1803;
			    boardfoot=(edtValue)*423776000.66;
			    dram=(edtValue)*270512181615.0;
			    cor=(edtValue)*4545454.5455;
			    homerBiblical=(edtValue)*4545454.5455;
	  			
	  			
			    
			    bathBiblical=(edtValue)*45454545.455;
			    hinBiblical=(edtValue)*272727272.73;
			    cabBiblical=(edtValue)*818181818.18;
			    logBiblical=(edtValue)*3272727272.7;
			    TazaSpanish=(edtValue)*4226752837.7;
			    Earthsvolume=(edtValue)*9.233610341E-16;
			    
	  			break;
				
	  			
		 case "Megaliter - ML":
	  			
			    cubicmeter=(edtValue)*1000;
			    cubickilometer=(edtValue)* 0.000001;
			    cubiccentimeter=(edtValue)*1000000000;
			    cubicmillimeter=(edtValue)*1000000000000.0;
			    liter=(edtValue)*1000000.0;
			    milliliter=(edtValue)*1000000000.0;
			    gallon=(edtValue)*264172.05236;
			    quart=(edtValue)*1056688.2094;
			    pintUS=(edtValue)*2113376.4189;
			    cupUS=(edtValue)*4226752.8377;
			    tablespoonUS=(edtValue)*67628045.404;
			    teaspoonUS=(edtValue)*202884136.21;
			    cubicmile=(edtValue)*2.399127585E-7;
			    cubicyard=(edtValue)*1307.9506193;
			    cubicfoot=(edtValue)*35314.666721;
			    cubicinch=(edtValue)*61023744.095;
			    cubicdecimeter=(edtValue)*1000000;
			    exaliter=(edtValue)*1.E-12;
			    petaliter=(edtValue)*1.E-9;
			    teraliter=(edtValue)*0.000001;
			    gigaliter=(edtValue)*0.001;
			    megaliter=(edtValue)*1;
			    kiloliter=(edtValue)*1000;
			    hectoliter=(edtValue)*10000;
			    dekaliter=(edtValue)*100000;
			    deciliter=(edtValue)*10000000;
			    centiliter=(edtValue)*100000000;
			    microliter=(edtValue)*1000000000000.0;
			    nanoliter=(edtValue)*1000000000000000.0;
			    picoliter=(edtValue)*1000000000000000100.0;
			    femtoliter=(edtValue)*1.E+21;
			    attoliter=(edtValue)*1.E+24;
			    cc=(edtValue)*1000000000.0;
	  			
			    drop=(edtValue)*20000000000.0;
			    barreloil=(edtValue)*6289.8107704 ;
			    barrelUS=(edtValue)*8386.4143606;
			    barrelUK=(edtValue)*6110.2568972;
			    gallonUK=(edtValue)*219969.2483;
			    quartUK=(edtValue)*879876.9932;
			    pintUK=(edtValue)*1759753.9864;
			    cupmetric=(edtValue)*4000000;
			    cupUK=(edtValue)*3519507.9728;
			    fluidounceUS=(edtValue)*33814022.702;
			    fluidounceUK=(edtValue)*35195079.728;
			    tablespoonmetric=(edtValue)*66666666.667;
			    tablespoonUK=(edtValue)*56312127.565;
			    dessertspoonUS=(edtValue)*101442068.11;
	  			
			    dessertspoonUK=(edtValue)*84468191.347;
			    teaspoonmetric=(edtValue)*200000000;
			    teaspoonUK=(edtValue)*168936382.69;
			    gillUS=(edtValue)*8453505.6755;
			    gillUK=(edtValue)*7039015.9456;
			    minimUS=(edtValue)*16230730897.0;
			    minimUK=(edtValue)*16893638269.0;
			    tonregister=(edtValue)*353.14666721;
			    ccf=(edtValue)*353.14666721;
			    hundresdcubicfoot=(edtValue)*353.14666721;
			    acrefoot=(edtValue)*0.8107131938;
			    acrefootUSsurvey=(edtValue)*0.8107131938;
			    
			    
			    
			    acreinch=(edtValue)*9.7285583255;
			    dekastere=(edtValue)*100;
			    stere=(edtValue)*1000;
			    decistere=(edtValue)*10000;
			    cord=(edtValue)*275.89583376;
			    tun=(edtValue)*1048.3017951;
			    hogshead=(edtValue)*4193.2071803;
			    boardfoot=(edtValue)*423776.00066;
			    dram=(edtValue)*270512181.61;
			    cor=(edtValue)*4545.4545455;
			    homerBiblical=(edtValue)*4545.4545455;
	  			
	  			
			    
			    bathBiblical=(edtValue)*45454.545455;
			    hinBiblical=(edtValue)*272727.27273;
			    cabBiblical=(edtValue)*818181.81818;
			    logBiblical=(edtValue)*3272727.2727;
			    TazaSpanish=(edtValue)*4226752.8377;
			    Earthsvolume=(edtValue)*9.233610341E-19;
			    
	  			break;
				
	  			
		 case "Kiloliter - kL":
	  			
			    cubicmeter=(edtValue)*1;
			    cubickilometer=(edtValue)* 1.E-9;
			    cubiccentimeter=(edtValue)*1000000;
			    cubicmillimeter=(edtValue)*1000000000;
			    liter=(edtValue)*1000;
			    milliliter=(edtValue)*1000000;
			    gallon=(edtValue)*264.17205236;
			    quart=(edtValue)*1056.6882094;
			    pintUS=(edtValue)*2113.3764189;
			    cupUS=(edtValue)*4226.7528377;
			    tablespoonUS=(edtValue)*67628.045404;
			    teaspoonUS=(edtValue)*202884.13621;
			    cubicmile=(edtValue)*2.399127585E-10;
			    cubicyard=(edtValue)*1.3079506193;
			    cubicfoot=(edtValue)*35.314666721;
			    cubicinch=(edtValue)*61023.744095;
			    cubicdecimeter=(edtValue)*1000;
			    exaliter=(edtValue)*1.E-15;
			    petaliter=(edtValue)*1.E-12;
			    teraliter=(edtValue)*1.E-9;
			    gigaliter=(edtValue)*0.000001;
			    megaliter=(edtValue)*0.001;
			    kiloliter=(edtValue)*1;
			    hectoliter=(edtValue)*10;
			    dekaliter=(edtValue)*100;
			    deciliter=(edtValue)*10000;
			    centiliter=(edtValue)*100000;
			    microliter=(edtValue)*1000000000;
			    nanoliter=(edtValue)*1000000000000.0;
			    picoliter=(edtValue)*1000000000000000.0;
			    femtoliter=(edtValue)*1000000000000000000.0;
			    attoliter=(edtValue)*1.E+21;
			    cc=(edtValue)*1000000;
	  			
			    drop=(edtValue)*20000000;
			    barreloil=(edtValue)*6.2898107704 ;
			    barrelUS=(edtValue)*8.3864143606;
			    barrelUK=(edtValue)*6.1102568972;
			    gallonUK=(edtValue)*219.9692483;
			    quartUK=(edtValue)*879.8769932;
			    pintUK=(edtValue)*1759.7539864;
			    cupmetric=(edtValue)*4000;
			    cupUK=(edtValue)*3519.5079728;
			    fluidounceUS=(edtValue)*33814.022702;
			    fluidounceUK=(edtValue)*35195.079728;
			    tablespoonmetric=(edtValue)*66666.666667;
			    tablespoonUK=(edtValue)*56312.127565;
			    dessertspoonUS=(edtValue)*101442.06811;
	  			
			    dessertspoonUK=(edtValue)*84468.191347;
			    teaspoonmetric=(edtValue)*200000;
			    teaspoonUK=(edtValue)*168936.38269;
			    gillUS=(edtValue)*8453.5056755;
			    gillUK=(edtValue)*7039.0159456;
			    minimUS=(edtValue)*16230730.897;
			    minimUK=(edtValue)*16893638.269;
			    tonregister=(edtValue)*0.3531466672;
			    ccf=(edtValue)*0.3531466672;
			    hundresdcubicfoot=(edtValue)*0.3531466672;
			    acrefoot=(edtValue)*0.0008107132;
			    acrefootUSsurvey=(edtValue)*0.0008107083;
			    
			    
			    
			    acreinch=(edtValue)*0.0097285583;
			    dekastere=(edtValue)*0.1;
			    stere=(edtValue)*1;
			    decistere=(edtValue)*10;
			    cord=(edtValue)*0.2758958338;
			    tun=(edtValue)*1.0483017951;
			    hogshead=(edtValue)*4.1932071803;
			    boardfoot=(edtValue)*423.77600066;
			    dram=(edtValue)*270512.18161;
			    cor=(edtValue)*4.5454545455;
			    homerBiblical=(edtValue)*4.5454545455;
	  			
	  			
			    
			    bathBiblical=(edtValue)*45.454545455;
			    hinBiblical=(edtValue)*272.72727273;
			    cabBiblical=(edtValue)*818.18181818;
			    logBiblical=(edtValue)*3272.7272727;
			    TazaSpanish=(edtValue)*4226.7528377;
			    Earthsvolume=(edtValue)*9.233610341E-22;
			    
	  			break;
				
	  			
		 case "Hectoliter - hL":
	  			
			    cubicmeter=(edtValue)*0.1;
			    cubickilometer=(edtValue)* 1.E-10;
			    cubiccentimeter=(edtValue)*100000;
			    cubicmillimeter=(edtValue)*100000000;
			    liter=(edtValue)*100;
			    milliliter=(edtValue)*100000;
			    gallon=(edtValue)*26.417205236;
			    quart=(edtValue)*105.66882094;
			    pintUS=(edtValue)*211.33764189;
			    cupUS=(edtValue)*422.67528377;
			    tablespoonUS=(edtValue)*6762.8045404;
			    teaspoonUS=(edtValue)*20288.413621;
			    cubicmile=(edtValue)*2.399127585E-11;
			    cubicyard=(edtValue)*0.1307950619;
			    cubicfoot=(edtValue)*3.5314666721;
			    cubicinch=(edtValue)*6102.3744095;
			    cubicdecimeter=(edtValue)*100;
			    exaliter=(edtValue)*1.E-16;
			    petaliter=(edtValue)*1.E-13;
			    teraliter=(edtValue)*1.E-10;
			    gigaliter=(edtValue)*1.E-7;
			    megaliter=(edtValue)*0.0001;
			    kiloliter=(edtValue)*0.1;
			    hectoliter=(edtValue)*1;
			    dekaliter=(edtValue)*10;
			    deciliter=(edtValue)*1000;
			    centiliter=(edtValue)*10000;
			    microliter=(edtValue)*100000000;
			    nanoliter=(edtValue)*100000000000.0;
			    picoliter=(edtValue)*100000000000000.0;
			    femtoliter=(edtValue)*100000000000000000.0;
			    attoliter=(edtValue)*100000000000000000000.0;
			    cc=(edtValue)*100000;
	  			
			    drop=(edtValue)*2000000;
			    barreloil=(edtValue)*0.628981077 ;
			    barrelUS=(edtValue)*0.8386414361;
			    barrelUK=(edtValue)*0.6110256897;
			    gallonUK=(edtValue)*21.99692483;
			    quartUK=(edtValue)*87.98769932;
			    pintUK=(edtValue)*175.97539864;
			    cupmetric=(edtValue)*400;
			    cupUK=(edtValue)*351.95079728;
			    fluidounceUS=(edtValue)*3381.4022702;
			    fluidounceUK=(edtValue)*3519.5079728;
			    tablespoonmetric=(edtValue)*6666.6666667;
			    tablespoonUK=(edtValue)*5631.2127565;
			    dessertspoonUS=(edtValue)*10144.206811;
	  			
			    dessertspoonUK=(edtValue)*8446.8191347;
			    teaspoonmetric=(edtValue)*20000;
			    teaspoonUK=(edtValue)*16893.638269;
			    gillUS=(edtValue)*845.35056755;
			    gillUK=(edtValue)*703.90159456;
			    minimUS=(edtValue)*1623073.0897;
			    minimUK=(edtValue)*1689363.8269;
			    tonregister=(edtValue)*0.0353146667;
			    ccf=(edtValue)*0.0353146667;
			    hundresdcubicfoot=(edtValue)*0.0353146667;
			    acrefoot=(edtValue)*0.0000810713;
			    acrefootUSsurvey=(edtValue)*0.0000810708;
			    
			    
			    
			    acreinch=(edtValue)*0.0009728558;
			    dekastere=(edtValue)*0.01;
			    stere=(edtValue)*0.1;
			    decistere=(edtValue)*1;
			    cord=(edtValue)*0.0275895834;
			    tun=(edtValue)*0.1048301795;
			    hogshead=(edtValue)*0.419320718;
			    boardfoot=(edtValue)*42.377600066;
			    dram=(edtValue)*27051.218161;
			    cor=(edtValue)*0.4545454545;
			    homerBiblical=(edtValue)*0.4545454545;
	  			
	  			
			    
			    bathBiblical=(edtValue)*4.5454545455;
			    hinBiblical=(edtValue)*27.272727273;
			    cabBiblical=(edtValue)*81.818181818;
			    logBiblical=(edtValue)*327.27272727;
			    TazaSpanish=(edtValue)*422.67528377;
			    Earthsvolume=(edtValue)*9.233610341E-23;
			    
	  			break;
				
		 case "Dekaliter - daL":
	  			
			    cubicmeter=(edtValue)*0.01;
			    cubickilometer=(edtValue)* 1.E-11;
			    cubiccentimeter=(edtValue)*10000;
			    cubicmillimeter=(edtValue)*10000000;
			    liter=(edtValue)*10;
			    milliliter=(edtValue)*10000;
			    gallon=(edtValue)*2.6417205236;
			    quart=(edtValue)*10.566882094;
			    pintUS=(edtValue)*21.133764189;
			    cupUS=(edtValue)*42.267528377;
			    tablespoonUS=(edtValue)*676.28045404;
			    teaspoonUS=(edtValue)*2028.8413621;
			    cubicmile=(edtValue)*2.399127585E-12;
			    cubicyard=(edtValue)*0.0130795062;
			    cubicfoot=(edtValue)*0.3531466672;
			    cubicinch=(edtValue)*610.23744095;
			    cubicdecimeter=(edtValue)*10;
			    exaliter=(edtValue)*1.E-17;
			    petaliter=(edtValue)*1.E-14;
			    teraliter=(edtValue)*1.E-11;
			    gigaliter=(edtValue)*1.E-8;
			    megaliter=(edtValue)*0.00001;
			    kiloliter=(edtValue)*0.01;
			    hectoliter=(edtValue)*0.1;
			    dekaliter=(edtValue)*1;
			    deciliter=(edtValue)*100;
			    centiliter=(edtValue)*1000;
			    microliter=(edtValue)*10000000;
			    nanoliter=(edtValue)*10000000000.0;
			    picoliter=(edtValue)*10000000000000.0;
			    femtoliter=(edtValue)*10000000000000000.0;
			    attoliter=(edtValue)*10000000000000000000.0;
			    cc=(edtValue)*10000;
	  			
			    drop=(edtValue)*200000;
			    barreloil=(edtValue)* 0.0628981077;
			    barrelUS=(edtValue)*0.0838641436;
			    barrelUK=(edtValue)*0.061102569;
			    gallonUK=(edtValue)*2.199692483;
			    quartUK=(edtValue)*8.798769932;
			    pintUK=(edtValue)*17.597539864;
			    cupmetric=(edtValue)*40;
			    cupUK=(edtValue)*35.195079728;
			    fluidounceUS=(edtValue)*338.14022702;
			    fluidounceUK=(edtValue)*351.95079728;
			    tablespoonmetric=(edtValue)*666.66666667;
			    tablespoonUK=(edtValue)*563.12127565;
			    dessertspoonUS=(edtValue)*1014.4206811;
	  			
			    dessertspoonUK=(edtValue)*844.68191347;
			    teaspoonmetric=(edtValue)*2000;
			    teaspoonUK=(edtValue)*1689.3638269;
			    gillUS=(edtValue)*84.535056755;
			    gillUK=(edtValue)*70.390159456;
			    minimUS=(edtValue)*162307.30897;
			    minimUK=(edtValue)*168936.38269;
			    tonregister=(edtValue)*0.0035314667;
			    ccf=(edtValue)*0.0035314667;
			    hundresdcubicfoot=(edtValue)*0.0035314667;
			    acrefoot=(edtValue)*0.0000081071;
			    acrefootUSsurvey=(edtValue)*0.0000081071;
			    
			    
			    
			    acreinch=(edtValue)*0.0000972856;
			    dekastere=(edtValue)*0.001;
			    stere=(edtValue)*0.01;
			    decistere=(edtValue)*0.1;
			    cord=(edtValue)*0.0027589583;
			    tun=(edtValue)*0.010483018;
			    hogshead=(edtValue)*0.0419320718;
			    boardfoot=(edtValue)*4.2377600066;
			    dram=(edtValue)*2705.1218161;
			    cor=(edtValue)*0.0454545455;
			    homerBiblical=(edtValue)*0.0454545455;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.4545454545;
			    hinBiblical=(edtValue)*2.7272727273;
			    cabBiblical=(edtValue)*8.1818181818;
			    logBiblical=(edtValue)*32.727272727;
			    TazaSpanish=(edtValue)*42.267528377;
			    Earthsvolume=(edtValue)*9.233610341E-24;
			    
	  			break;
				
		 case "Deciliter - dL":
	  			
			    cubicmeter=(edtValue)*0.0001;
			    cubickilometer=(edtValue)*1.E-13 ;
			    cubiccentimeter=(edtValue)*100;
			    cubicmillimeter=(edtValue)*100000;
			    liter=(edtValue)*0.1;
			    milliliter=(edtValue)*100;
			    gallon=(edtValue)*0.0264172052;
			    quart=(edtValue)*0.1056688209;
			    pintUS=(edtValue)*0.2113376419;
			    cupUS=(edtValue)*0.4226752838;
			    tablespoonUS=(edtValue)*6.7628045404;
			    teaspoonUS=(edtValue)*20.288413621;
			    cubicmile=(edtValue)*2.399127585E-14;
			    cubicyard=(edtValue)*0.0001307951;
			    cubicfoot=(edtValue)*0.0035314667;
			    cubicinch=(edtValue)*6.1023744095;
			    cubicdecimeter=(edtValue)*0.1;
			    exaliter=(edtValue)*1.E-19;
			    petaliter=(edtValue)*1.E-16;
			    teraliter=(edtValue)*1.E-13;
			    gigaliter=(edtValue)*1.E-10;
			    megaliter=(edtValue)*1.E-7;
			    kiloliter=(edtValue)*0.0001;
			    hectoliter=(edtValue)*0.001;
			    dekaliter=(edtValue)*0.01;
			    deciliter=(edtValue)*1;
			    centiliter=(edtValue)*10;
			    microliter=(edtValue)*100000;
			    nanoliter=(edtValue)*100000000;
			    picoliter=(edtValue)*100000000000.0;
			    femtoliter=(edtValue)*100000000000000.0;
			    attoliter=(edtValue)*100000000000000.0;
			    cc=(edtValue)*100;
	  			
			    drop=(edtValue)*2000;
			    barreloil=(edtValue)*0.0006289811 ;
			    barrelUS=(edtValue)*0.0008386414;
			    barrelUK=(edtValue)*0.0006110257;
			    gallonUK=(edtValue)*0.0219969248;
			    quartUK=(edtValue)*0.0879876993;
			    pintUK=(edtValue)*0.1759753986;
			    cupmetric=(edtValue)*0.4;
			    cupUK=(edtValue)*0.3519507973;
			    fluidounceUS=(edtValue)*3.3814022702;
			    fluidounceUK=(edtValue)*3.5195079728;
			    tablespoonmetric=(edtValue)*6.6666666667;
			    tablespoonUK=(edtValue)*5.6312127565;
			    dessertspoonUS=(edtValue)*10.144206811;
	  			
			    dessertspoonUK=(edtValue)*8.4468191347;
			    teaspoonmetric=(edtValue)*20;
			    teaspoonUK=(edtValue)*16.893638269;
			    gillUS=(edtValue)*0.8453505675;
			    gillUK=(edtValue)*0.7039015946;
			    minimUS=(edtValue)*1623.0730897;
			    minimUK=(edtValue)*1689.3638269;
			    tonregister=(edtValue)*0.0000353147;
			    ccf=(edtValue)*0.0000353147;
			    hundresdcubicfoot=(edtValue)*0.0000353147;
			    acrefoot=(edtValue)*8.107131937E-8;
			    acrefootUSsurvey=(edtValue)*8.107083295E-8;
			    
			    
			    
			    acreinch=(edtValue)*9.728558325E-7;
			    dekastere=(edtValue)*0.00001;
			    stere=(edtValue)*0.0001;
			    decistere=(edtValue)*0.001;
			    cord=(edtValue)*0.0000275896;
			    tun=(edtValue)*0.0001048302;
			    hogshead=(edtValue)*0.0004193207;
			    boardfoot=(edtValue)*0.0423776001;
			    dram=(edtValue)*27.051218161;
			    cor=(edtValue)*0.0004545455;
			    homerBiblical=(edtValue)*0.0004545455;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.0045454545;
			    hinBiblical=(edtValue)*0.0272727273;
			    cabBiblical=(edtValue)*0.0818181818;
			    logBiblical=(edtValue)*0.3272727273;
			    TazaSpanish=(edtValue)*0.4226752838;
			    Earthsvolume=(edtValue)*9.233610341E-26;
			    
	  			break;
				
	  			
		 case "Centiliter - cL":
	  			
			    cubicmeter=(edtValue)*0.00001;
			    cubickilometer=(edtValue)*1.E-14 ;
			    cubiccentimeter=(edtValue)*10;
			    cubicmillimeter=(edtValue)*10000;
			    liter=(edtValue)*0.01;
			    milliliter=(edtValue)*10;
			    gallon=(edtValue)*0.0026417205;
			    quart=(edtValue)*0.0105668821;
			    pintUS=(edtValue)*0.0211337642;
			    cupUS=(edtValue)*0.0422675284;
			    tablespoonUS=(edtValue)*0.676280454;
			    teaspoonUS=(edtValue)*2.0288413621;
			    cubicmile=(edtValue)*2.399127585E-15;
			    cubicyard=(edtValue)*0.0000130795;
			    cubicfoot=(edtValue)*0.0003531467;
			    cubicinch=(edtValue)*0.6102374409;
			    cubicdecimeter=(edtValue)*0.01;
			    exaliter=(edtValue)*1.E-20;
			    petaliter=(edtValue)*1.E-17;
			    teraliter=(edtValue)*1.E-14;
			    gigaliter=(edtValue)*1.E-11;
			    megaliter=(edtValue)*1.E-8;
			    kiloliter=(edtValue)*0.00001;
			    hectoliter=(edtValue)*0.0001;
			    dekaliter=(edtValue)*0.001;
			    deciliter=(edtValue)*0.1;
			    centiliter=(edtValue)*1;
			    microliter=(edtValue)*10000;
			    nanoliter=(edtValue)*10000000;
			    picoliter=(edtValue)*10000000000.0;
			    femtoliter=(edtValue)*10000000000000.0;
			    attoliter=(edtValue)*10000000000000000.0;
			    cc=(edtValue)*10;
	  			
			    drop=(edtValue)*200;
			    barreloil=(edtValue)*0.0000628981 ;
			    barrelUS=(edtValue)*0.0000838641;
			    barrelUK=(edtValue)*0.0000611026;
			    gallonUK=(edtValue)*0.0021996925;
			    quartUK=(edtValue)*0.0087987699;
			    pintUK=(edtValue)*0.0175975399;
			    cupmetric=(edtValue)*0.04;
			    cupUK=(edtValue)*0.0351950797;
			    fluidounceUS=(edtValue)*0.338140227;
			    fluidounceUK=(edtValue)*0.3519507973;
			    tablespoonmetric=(edtValue)*0.6666666667;
			    tablespoonUK=(edtValue)*0.5631212756;
			    dessertspoonUS=(edtValue)*1.0144206811;
	  			
			    dessertspoonUK=(edtValue)*0.8446819135;
			    teaspoonmetric=(edtValue)*2;
			    teaspoonUK=(edtValue)*1.6893638269;
			    gillUS=(edtValue)*0.0845350568;
			    gillUK=(edtValue)*0.0703901595;
			    minimUS=(edtValue)*162.30730897;
			    minimUK=(edtValue)*168.93638269;
			    tonregister=(edtValue)*0.0000035315;
			    ccf=(edtValue)*0.0000035315;
			    hundresdcubicfoot=(edtValue)*0.0000035315;
			    acrefoot=(edtValue)*8.107131937E-9;
			    acrefootUSsurvey=(edtValue)*8.107083295E-9;
			    
			    
			    
			    acreinch=(edtValue)*9.728558325E-8;
			    dekastere=(edtValue)*0.000001;
			    stere=(edtValue)*0.00001;
			    decistere=(edtValue)*0.0001;
			    cord=(edtValue)*0.000002759;
			    tun=(edtValue)*0.000010483;
			    hogshead=(edtValue)*0.0000419321;
			    boardfoot=(edtValue)*0.00423776;
			    dram=(edtValue)*2.7051218161;
			    cor=(edtValue)*0.0000454545;
			    homerBiblical=(edtValue)*0.0000454545;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.0004545455;
			    hinBiblical=(edtValue)*0.0027272727;
			    cabBiblical=(edtValue)*0.0081818182;
			    logBiblical=(edtValue)*0.0327272727;
			    TazaSpanish=(edtValue)*0.0422675284;
			    Earthsvolume=(edtValue)*9.233610341E-27;
			    
	  			break;
				
	  			
		 case "Microliter - µL":
	  			
			    cubicmeter=(edtValue)*1.E-9;
			    cubickilometer=(edtValue)* 1.E-18;
			    cubiccentimeter=(edtValue)*0.001;
			    cubicmillimeter=(edtValue)*1;
			    liter=(edtValue)*0.000001;
			    milliliter=(edtValue)*0.001;
			    gallon=(edtValue)*2.641720523E-7;
			    quart=(edtValue)*0.0000010567;
			    pintUS=(edtValue)*0.0000021134;
			    cupUS=(edtValue)*0.0000042268;
			    tablespoonUS=(edtValue)*0.000067628;
			    teaspoonUS=(edtValue)*0.0002028841;
			    cubicmile=(edtValue)*2.399127585E-19;
			    cubicyard=(edtValue)*1.307950619E-9;
			    cubicfoot=(edtValue)*3.531466672E-8;
			    cubicinch=(edtValue)*0.0000610237;
			    cubicdecimeter=(edtValue)*0.000001;
			    exaliter=(edtValue)*1.E-24;
			    petaliter=(edtValue)*1.E-21;
			    teraliter=(edtValue)*1.E-18;
			    gigaliter=(edtValue)*1.E-15;
			    megaliter=(edtValue)*1.E-12;
			    kiloliter=(edtValue)*1.E-9;
			    hectoliter=(edtValue)*1.E-8;
			    dekaliter=(edtValue)*1.E-7;
			    deciliter=(edtValue)*0.00001;
			    centiliter=(edtValue)*0.0001;
			    microliter=(edtValue)*1;
			    nanoliter=(edtValue)*1000;
			    picoliter=(edtValue)*1000000;
			    femtoliter=(edtValue)*1000000000.0;
			    attoliter=(edtValue)*1000000000000.0;
			    cc=(edtValue)*0.001;
	  			
			    drop=(edtValue)*0.02;
			    barreloil=(edtValue)*6.28981077E-9 ;
			    barrelUS=(edtValue)*8.38641436E-9;
			    barrelUK=(edtValue)*6.110256897E-9;
			    gallonUK=(edtValue)*2.199692482E-7;
			    quartUK=(edtValue)*8.798769931E-7;
			    pintUK=(edtValue)*0.0000017598;
			    cupmetric=(edtValue)*0.000004;
			    cupUK=(edtValue)*0.0000035195;
			    fluidounceUS=(edtValue)*0.000033814;
			    fluidounceUK=(edtValue)*0.0000351951;
			    tablespoonmetric=(edtValue)*0.0000666667;
			    tablespoonUK=(edtValue)*0.0000563121;
			    dessertspoonUS=(edtValue)*0.0001014421;
	  			
			    dessertspoonUK=(edtValue)*0.0000844682;
			    teaspoonmetric=(edtValue)*0.0002;
			    teaspoonUK=(edtValue)*0.0001689364;
			    gillUS=(edtValue)*0.0000084535;
			    gillUK=(edtValue)*0.000007039;
			    minimUS=(edtValue)*0.0162307309;
			    minimUK=(edtValue)*0.0168936383;
			    tonregister=(edtValue)*3.531466672E-10;
			    ccf=(edtValue)*3.531466672E-10;
			    hundresdcubicfoot=(edtValue)*3.531466672E-10;
			    acrefoot=(edtValue)*8.107131937E-13;
			    acrefootUSsurvey=(edtValue)*8.107083295E-13;
			    
			    
			    
			    acreinch=(edtValue)*9.728558325E-12;
			    dekastere=(edtValue)*1.E-10;
			    stere=(edtValue)*1.E-9;
			    decistere=(edtValue)*1.E-8;
			    cord=(edtValue)*2.758958337E-10;
			    tun=(edtValue)*1.048301795E-9;
			    hogshead=(edtValue)*4.19320718E-9;
			    boardfoot=(edtValue)*4.237760006E-7;
			    dram=(edtValue)*0.0002705122;
			    cor=(edtValue)*4.545454545E-9;
			    homerBiblical=(edtValue)*4.545454545E-9;
	  			
	  			
			    
			    bathBiblical=(edtValue)*4.545454545E-8;
			    hinBiblical=(edtValue)*2.727272727E-7;
			    cabBiblical=(edtValue)*8.181818181E-7;
			    logBiblical=(edtValue)*0.0000032727;
			    TazaSpanish=(edtValue)*0.0000042268;
			    Earthsvolume=(edtValue)*9.233610341E-31;
			    
	  			break;
				
	  			
		 case "Nanoliter - nL":
	  			
			    cubicmeter=(edtValue)*1.E-12;
			    cubickilometer=(edtValue)* 1.E-21;
			    cubiccentimeter=(edtValue)*0.000001;
			    cubicmillimeter=(edtValue)*0.001;
			    liter=(edtValue)*1.E-9;
			    milliliter=(edtValue)*0.000001;
			    gallon=(edtValue)*2.641720523E-10;
			    quart=(edtValue)*1.056688209E-9;
			    pintUS=(edtValue)*2.113376418E-9;
			    cupUS=(edtValue)*4.226752837E-9;
			    tablespoonUS=(edtValue)*6.76280454E-8;
			    teaspoonUS=(edtValue)*2.028841362E-7;
			    cubicmile=(edtValue)*2.399127585E-22;
			    cubicyard=(edtValue)*1.307950619E-12;
			    cubicfoot=(edtValue)*3.531466672E-11;
			    cubicinch=(edtValue)*6.102374409E-8;
			    cubicdecimeter=(edtValue)*1.E-9;
			    exaliter=(edtValue)*1.E-27;
			    petaliter=(edtValue)*1.E-24;
			    teraliter=(edtValue)*1.E-21;
			    gigaliter=(edtValue)*1.E-18;
			    megaliter=(edtValue)*1.E-15;
			    kiloliter=(edtValue)*1.E-12;
			    hectoliter=(edtValue)*1.E-11;
			    dekaliter=(edtValue)*1.E-10;
			    deciliter=(edtValue)*1.E-8;
			    centiliter=(edtValue)*1.E-7;
			    microliter=(edtValue)*0.001;
			    nanoliter=(edtValue)*1;
			    picoliter=(edtValue)*1000;
			    femtoliter=(edtValue)*1000000;
			    attoliter=(edtValue)*1000000000;
			    cc=(edtValue)*0.000001;
	  			
			    drop=(edtValue)*0.00002;
			    barreloil=(edtValue)*6.28981077E-12 ;
			    barrelUS=(edtValue)*8.38641436E-12;
			    barrelUK=(edtValue)*6.110256897E-12;
			    gallonUK=(edtValue)*2.199692482E-10;
			    quartUK=(edtValue)*8.798769931E-10;
			    pintUK=(edtValue)*1.759753986E-9;
			    cupmetric=(edtValue)*4.E-9;
			    cupUK=(edtValue)*3.519507972E-9;
			    fluidounceUS=(edtValue)*3.38140227E-8;
			    fluidounceUK=(edtValue)*3.519507972E-8;
			    tablespoonmetric=(edtValue)*6.666666666E-8;
			    tablespoonUK=(edtValue)*5.631212756E-8;
			    dessertspoonUS=(edtValue)*1.014420681E-7;
	  			
			    dessertspoonUK=(edtValue)*8.446819134E-8;
			    teaspoonmetric=(edtValue)*2.E-7;
			    teaspoonUK=(edtValue)*1.689363826E-7;
			    gillUS=(edtValue)*8.453505675E-9;
			    gillUK=(edtValue)*7.039015945E-9;
			    minimUS=(edtValue)*0.0000162307;
			    minimUK=(edtValue)*0.0000168936;
			    tonregister=(edtValue)*3.531466672E-13;
			    ccf=(edtValue)*3.531466672E-13;
			    hundresdcubicfoot=(edtValue)*3.531466672E-13;
			    acrefoot=(edtValue)*8.107131937E-16;
			    acrefootUSsurvey=(edtValue)*8.107083295E-16;
			    
			    
			    
			    acreinch=(edtValue)*9.728558325E-15;
			    dekastere=(edtValue)*1.E-13;
			    stere=(edtValue)*1.E-12;
			    decistere=(edtValue)*1.E-11;
			    cord=(edtValue)*2.758958337E-13;
			    tun=(edtValue)*1.048301795E-12;
			    hogshead=(edtValue)*4.19320718E-12;
			    boardfoot=(edtValue)*4.237760006E-10;
			    dram=(edtValue)*2.705121816E-7;
			    cor=(edtValue)*4.545454545E-12;
			    homerBiblical=(edtValue)*4.545454545E-12;
	  			
	  			
			    
			    bathBiblical=(edtValue)*4.545454545E-11;
			    hinBiblical=(edtValue)*2.727272727E-10;
			    cabBiblical=(edtValue)*8.181818181E-10;
			    logBiblical=(edtValue)*3.272727272E-9;
			    TazaSpanish=(edtValue)*4.226752837E-9;
			    Earthsvolume=(edtValue)*9.233610341E-34;
			    
	  			break;
				
	  			
		 case "Picoliter - pL":
	  			
			    cubicmeter=(edtValue)*9.999999999E-16;
			    cubickilometer=(edtValue)* 1.E-24;
			    cubiccentimeter=(edtValue)*9.999999999E-10;
			    cubicmillimeter=(edtValue)*0.000001;
			    liter=(edtValue)*1.E-12;
			    milliliter=(edtValue)*9.999999999E-10;
			    gallon=(edtValue)*2.641720523E-13;
			    quart=(edtValue)*1.056688209E-12;
			    pintUS=(edtValue)*2.113376418E-12;
			    cupUS=(edtValue)*4.226752837E-12;
			    tablespoonUS=(edtValue)*6.76280454E-11;
			    teaspoonUS=(edtValue)*2.028841362E-10;
			    cubicmile=(edtValue)*2.399127585E-25;
			    cubicyard=(edtValue)*1.307950619E-15;
			    cubicfoot=(edtValue)*3.531466672E-14;
			    cubicinch=(edtValue)*6.102374409E-11;
			    cubicdecimeter=(edtValue)*1.E-12;
			    exaliter=(edtValue)*9.999999999E-31;
			    petaliter=(edtValue)*9.999999999E-28;
			    teraliter=(edtValue)*1.E-24;
			    gigaliter=(edtValue)*1.E-21;
			    megaliter=(edtValue)*9.999999999E-19;
			    kiloliter=(edtValue)*9.999999999E-16;
			    hectoliter=(edtValue)*9.999999999E-15;
			    dekaliter=(edtValue)*9.999999999E-14;
			    deciliter=(edtValue)*1.E-11;
			    centiliter=(edtValue)*9.999999999E-11;
			    microliter=(edtValue)*0.000001;
			    nanoliter=(edtValue)*0.001;
			    picoliter=(edtValue)*1;
			    femtoliter=(edtValue)*1000;
			    attoliter=(edtValue)*1000000;
			    cc=(edtValue)*9.999999999E-10;
	  			
			    drop=(edtValue)*1.999999999E-8;
			    barreloil=(edtValue)*6.28981077E-15 ;
			    barrelUS=(edtValue)*8.38641436E-15;
			    barrelUK=(edtValue)*6.110256897E-15;
			    gallonUK=(edtValue)*2.199692482E-13;
			    quartUK=(edtValue)*8.798769931E-13;
			    pintUK=(edtValue)*1.759753986E-12;
			    cupmetric=(edtValue)*4.E-12;
			    cupUK=(edtValue)*3.519507972E-12;
			    fluidounceUS=(edtValue)*3.38140227E-11;
			    fluidounceUK=(edtValue)*3.519507972E-11;
			    tablespoonmetric=(edtValue)*6.666666666E-11;
			    tablespoonUK=(edtValue)*5.631212756E-11;
			    dessertspoonUS=(edtValue)*1.014420681E-10;
	  			
			    dessertspoonUK=(edtValue)*8.446819134E-11;
			    teaspoonmetric=(edtValue)*1.999999999E-10;
			    teaspoonUK=(edtValue)*1.689363826E-10;
			    gillUS=(edtValue)*8.453505675E-12;
			    gillUK=(edtValue)*7.039015945E-12;
			    minimUS=(edtValue)*1.623073089E-8;
			    minimUK=(edtValue)*1.689363826E-8;
			    tonregister=(edtValue)*3.531466672E-16;
			    ccf=(edtValue)*3.531466672E-16;
			    hundresdcubicfoot=(edtValue)*3.531466672E-16;
			    acrefoot=(edtValue)*8.107131937E-19;
			    acrefootUSsurvey=(edtValue)*8.107083295E-19;
			    
			    
			    
			    acreinch=(edtValue)*9.728558325E-18;
			    dekastere=(edtValue)*9.999999999E-17;
			    stere=(edtValue)*9.999999999E-16;
			    decistere=(edtValue)*9.999999999E-15;
			    cord=(edtValue)*2.758958337E-16;
			    tun=(edtValue)*1.048301795E-15;
			    hogshead=(edtValue)*4.19320718E-15;
			    boardfoot=(edtValue)*4.237760006E-13;
			    dram=(edtValue)*2.705121816E-10;
			    cor=(edtValue)*4.545454545E-15;
			    homerBiblical=(edtValue)*4.545454545E-15;
	  			
	  			
			    
			    bathBiblical=(edtValue)*4.545454545E-14;
			    hinBiblical=(edtValue)*2.727272727E-13;
			    cabBiblical=(edtValue)*8.181818181E-13;
			    logBiblical=(edtValue)*3.272727272E-12;
			    TazaSpanish=(edtValue)*4.226752837E-12;
			    Earthsvolume=(edtValue)*9.233610341E-37;
			    
	  			break;
				
	  			
		 case "Femtoliter - fL":
	  			
			    cubicmeter=(edtValue)*1.E-18;
			    cubickilometer=(edtValue)*1.E-27 ;
			    cubiccentimeter=(edtValue)*1.E-12;
			    cubicmillimeter=(edtValue)*1.E-9;
			    liter=(edtValue)*1.E-15;
			    milliliter=(edtValue)*1.E-12;
			    gallon=(edtValue)*2.641720523E-16;
			    quart=(edtValue)*1.056688209E-15;
			    pintUS=(edtValue)*2.113376418E-15;
			    cupUS=(edtValue)*4.226752837E-15;
			    tablespoonUS=(edtValue)*6.76280454E-14;
			    teaspoonUS=(edtValue)*2.028841362E-13;
			    cubicmile=(edtValue)*2.399127585E-28;
			    cubicyard=(edtValue)*1.307950619E-18;
			    cubicfoot=(edtValue)*3.531466672E-17;
			    cubicinch=(edtValue)*6.102374409E-14;
			    cubicdecimeter=(edtValue)*1.E-15;
			    exaliter=(edtValue)*1.E-33;
			    petaliter=(edtValue)*1.E-30;
			    teraliter=(edtValue)*1.E-27;
			    gigaliter=(edtValue)*1.E-24;
			    megaliter=(edtValue)*1.E-21;
			    kiloliter=(edtValue)*1.E-18;
			    hectoliter=(edtValue)*1.E-17;
			    dekaliter=(edtValue)*1.E-16;
			    deciliter=(edtValue)*1.E-14;
			    centiliter=(edtValue)*1.E-13;
			    microliter=(edtValue)*1.E-9;
			    nanoliter=(edtValue)*0.000001;
			    picoliter=(edtValue)*0.001;
			    femtoliter=(edtValue)*1;
			    attoliter=(edtValue)*1000;
			    cc=(edtValue)*1.E-12;
	  			
			    drop=(edtValue)*2.E-11;
			    barreloil=(edtValue)*6.28981077E-18 ;
			    barrelUS=(edtValue)*8.38641436E-18;
			    barrelUK=(edtValue)*6.110256897E-18;
			    gallonUK=(edtValue)*2.199692482E-16;
			    quartUK=(edtValue)*8.798769931E-16;
			    pintUK=(edtValue)*1.759753986E-15;
			    cupmetric=(edtValue)*4.E-15;
			    cupUK=(edtValue)*3.519507972E-15;
			    fluidounceUS=(edtValue)*3.38140227E-14;
			    fluidounceUK=(edtValue)*3.519507972E-14;
			    tablespoonmetric=(edtValue)*6.666666666E-14;
			    tablespoonUK=(edtValue)*5.631212756E-14;
			    dessertspoonUS=(edtValue)*1.014420681E-13;
	  			
			    dessertspoonUK=(edtValue)*8.446819134E-14;
			    teaspoonmetric=(edtValue)*2.E-13;
			    teaspoonUK=(edtValue)*1.689363826E-13;
			    gillUS=(edtValue)*8.453505675E-15;
			    gillUK=(edtValue)*7.039015945E-15;
			    minimUS=(edtValue)*1.623073089E-11;
			    minimUK=(edtValue)*1.689363826E-11;
			    tonregister=(edtValue)*3.531466672E-19;
			    ccf=(edtValue)*3.531466672E-19;
			    hundresdcubicfoot=(edtValue)*3.531466672E-19;
			    acrefoot=(edtValue)*8.107131937E-22;
			    acrefootUSsurvey=(edtValue)*8.107083295E-22;
			    
			    
			    
			    acreinch=(edtValue)*9.728558325E-21;
			    dekastere=(edtValue)*1.E-19;
			    stere=(edtValue)*1.E-18;
			    decistere=(edtValue)*1.E-17;
			    cord=(edtValue)*2.758958337E-19;
			    tun=(edtValue)*1.048301795E-18;
			    hogshead=(edtValue)*4.19320718E-18;
			    boardfoot=(edtValue)*4.237760006E-16;
			    dram=(edtValue)*2.705121816E-13;
			    cor=(edtValue)*4.545454545E-18;
			    homerBiblical=(edtValue)*4.545454545E-18;
	  			
	  			
			    
			    bathBiblical=(edtValue)*4.545454545E-17;
			    hinBiblical=(edtValue)*2.727272727E-16;
			    cabBiblical=(edtValue)*8.181818181E-16;
			    logBiblical=(edtValue)*3.272727272E-15;
			    TazaSpanish=(edtValue)*4.226752837E-15;
			    Earthsvolume=(edtValue)*9.233610341E-40;
			    
	  			break;
				
	  			
		 case "Attoliter - aL":
	  			
			    cubicmeter=(edtValue)*1.E-21;
			    cubickilometer=(edtValue)*1.E-30 ;
			    cubiccentimeter=(edtValue)*1.E-15;
			    cubicmillimeter=(edtValue)*1.E-12;
			    liter=(edtValue)*1.E-18;
			    milliliter=(edtValue)*1.E-15;
			    gallon=(edtValue)*2.641720523E-19;
			    quart=(edtValue)*1.056688209E-18;
			    pintUS=(edtValue)*2.113376418E-18;
			    cupUS=(edtValue)*4.226752837E-18;
			    tablespoonUS=(edtValue)*6.76280454E-17;
			    teaspoonUS=(edtValue)*2.028841362E-16;
			    cubicmile=(edtValue)*2.399127585E-31;
			    cubicyard=(edtValue)*1.307950619E-21;
			    cubicfoot=(edtValue)*3.531466672E-20;
			    cubicinch=(edtValue)*6.102374409E-17;
			    cubicdecimeter=(edtValue)*1.E-18;
			    exaliter=(edtValue)*1.E-36;
			    petaliter=(edtValue)*1.E-33;
			    teraliter=(edtValue)*1.E-30;
			    gigaliter=(edtValue)*1.E-27;
			    megaliter=(edtValue)*1.E-24;
			    kiloliter=(edtValue)*1.E-21;
			    hectoliter=(edtValue)*1.E-20;
			    dekaliter=(edtValue)*1.E-19;
			    deciliter=(edtValue)*1.E-17;
			    centiliter=(edtValue)*1.E-16;
			    microliter=(edtValue)*1.E-12;
			    nanoliter=(edtValue)*1.E-9;
			    picoliter=(edtValue)*0.000001;
			    femtoliter=(edtValue)*0.001;
			    attoliter=(edtValue)*1;
			    cc=(edtValue)*1.E-15;
	  			
			    drop=(edtValue)*2.E-14;
			    barreloil=(edtValue)*6.28981077E-21 ;
			    barrelUS=(edtValue)*8.38641436E-21;
			    barrelUK=(edtValue)*8.38641436E-21;
			    gallonUK=(edtValue)*2.199692482E-19;
			    quartUK=(edtValue)*8.798769931E-19;
			    pintUK=(edtValue)*1.759753986E-18;
			    cupmetric=(edtValue)*4.E-18;
			    cupUK=(edtValue)*3.519507972E-18;
			    fluidounceUS=(edtValue)*3.38140227E-17;
			    fluidounceUK=(edtValue)*3.519507972E-17;
			    tablespoonmetric=(edtValue)*6.666666666E-17;
			    tablespoonUK=(edtValue)*5.631212756E-17;
			    dessertspoonUS=(edtValue)*1.014420681E-16;
	  			
			    dessertspoonUK=(edtValue)*8.446819134E-17;
			    teaspoonmetric=(edtValue)*2.E-16;
			    teaspoonUK=(edtValue)*1.689363826E-16;
			    gillUS=(edtValue)*8.453505675E-18;
			    gillUK=(edtValue)*7.039015945E-18;
			    minimUS=(edtValue)*1.623073089E-14;
			    minimUK=(edtValue)*1.689363826E-14;
			    tonregister=(edtValue)*3.531466672E-22;
			    ccf=(edtValue)*3.531466672E-22;
			    hundresdcubicfoot=(edtValue)*3.531466672E-22;
			    acrefoot=(edtValue)*8.107131937E-25;
			    acrefootUSsurvey=(edtValue)*8.107083295E-25;
			    
			    
			    
			    acreinch=(edtValue)*9.728558325E-24;
			    dekastere=(edtValue)*1.E-22;
			    stere=(edtValue)*1.E-21;
			    decistere=(edtValue)*1.E-20;
			    cord=(edtValue)*2.758958337E-22;
			    tun=(edtValue)*1.048301795E-21;
			    hogshead=(edtValue)*4.19320718E-21;
			    boardfoot=(edtValue)*4.237760006E-19;
			    dram=(edtValue)*2.705121816E-16;
			    cor=(edtValue)*4.545454545E-21;
			    homerBiblical=(edtValue)*4.545454545E-21;
	  			
	  			
			    
			    bathBiblical=(edtValue)*4.545454545E-20;
			    hinBiblical=(edtValue)*2.727272727E-19;
			    cabBiblical=(edtValue)*8.181818181E-19;
			    logBiblical=(edtValue)*3.272727272E-18;
			    TazaSpanish=(edtValue)*4.226752837E-18;
			    Earthsvolume=(edtValue)*9.233610341E-43;
			    
	  			break;
				
	  			
		 case "Cc - cc":
	  			
			    cubicmeter=(edtValue)*0.000001;
			    cubickilometer=(edtValue)*1.E-15 ;
			    cubiccentimeter=(edtValue)*1;
			    cubicmillimeter=(edtValue)*1000;
			    liter=(edtValue)*0.001;
			    milliliter=(edtValue)*1;
			    gallon=(edtValue)*0.0002641721;
			    quart=(edtValue)*0.0010566882;
			    pintUS=(edtValue)*0.0021133764;
			    cupUS=(edtValue)*0.0042267528;
			    tablespoonUS=(edtValue)*0.0676280454;
			    teaspoonUS=(edtValue)*0.2028841362;
			    cubicmile=(edtValue)*2.399127585E-16;
			    cubicyard=(edtValue)*0.000001308;
			    cubicfoot=(edtValue)*0.0000353147;
			    cubicinch=(edtValue)*0.0610237441;
			    cubicdecimeter=(edtValue)*0.001;
			    exaliter=(edtValue)*1.E-21;
			    petaliter=(edtValue)*1.E-18;
			    teraliter=(edtValue)*1.E-15;
			    gigaliter=(edtValue)*1.E-12;
			    megaliter=(edtValue)*1.E-9;
			    kiloliter=(edtValue)*0.000001;
			    hectoliter=(edtValue)*0.00001;
			    dekaliter=(edtValue)*0.0001;
			    deciliter=(edtValue)*0.01;
			    centiliter=(edtValue)*0.1;
			    microliter=(edtValue)*1000;
			    nanoliter=(edtValue)*1000000;
			    picoliter=(edtValue)*1000000000;
			    femtoliter=(edtValue)*1000000000000.0;
			    attoliter=(edtValue)*1000000000000000.0;
			    cc=(edtValue)*1;
	  			
			    drop=(edtValue)*20;
			    barreloil=(edtValue)*0.0000062898 ;
			    barrelUS=(edtValue)*0.0000083864;
			    barrelUK=(edtValue)*0.0000061103;
			    gallonUK=(edtValue)*0.0002199692;
			    quartUK=(edtValue)*0.000879877;
			    pintUK=(edtValue)*0.001759754;
			    cupmetric=(edtValue)*0.004;
			    cupUK=(edtValue)*0.003519508;
			    fluidounceUS=(edtValue)*0.0338140227;
			    fluidounceUK=(edtValue)*0.0351950797;
			    tablespoonmetric=(edtValue)*0.0666666667;
			    tablespoonUK=(edtValue)*0.0563121276;
			    dessertspoonUS=(edtValue)*0.1014420681;
	  			
			    dessertspoonUK=(edtValue)*0.0844681913;
			    teaspoonmetric=(edtValue)*0.2;
			    teaspoonUK=(edtValue)*0.2;
			    gillUS=(edtValue)*0.0084535057;
			    gillUK=(edtValue)*0.0070390159;
			    minimUS=(edtValue)*16.230730897;
			    minimUK=(edtValue)*16.893638269;
			    tonregister=(edtValue)*3.531466672E-7;
			    ccf=(edtValue)*3.531466672E-7;
			    hundresdcubicfoot=(edtValue)*3.531466672E-7;
			    acrefoot=(edtValue)*8.107131937E-10;
			    acrefootUSsurvey=(edtValue)*8.107083295E-10;
			    
			    
			    
			    acreinch=(edtValue)*9.728558325E-9;
			    dekastere=(edtValue)*1.E-7;
			    stere=(edtValue)*0.000001;
			    decistere=(edtValue)*0.00001;
			    cord=(edtValue)*2.758958337E-7;
			    tun=(edtValue)*0.0000010483;
			    hogshead=(edtValue)*0.0000041932;
			    boardfoot=(edtValue)*0.000423776;
			    dram=(edtValue)*0.2705121816;
			    cor=(edtValue)*0.0000045455;
			    homerBiblical=(edtValue)*0.0000045455;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.0000454545;
			    hinBiblical=(edtValue)*0.0002727273 ;
			    cabBiblical=(edtValue)*0.0008181818;
			    logBiblical=(edtValue)*0.0032727273;
			    TazaSpanish=(edtValue)*0.0042267528;
			    Earthsvolume=(edtValue)*9.233610341E-28;
			    
	  			break;
				
	  			
		 case "Drop - drop":
	  			
			    cubicmeter=(edtValue)*5.E-8;
			    cubickilometer=(edtValue)*5.E-17;
			    cubiccentimeter=(edtValue)*0.05;
			    cubicmillimeter=(edtValue)*50;
			    liter=(edtValue)*0.00005;
			    milliliter=(edtValue)*0.05;
			    gallon=(edtValue)*0.0000132086;
			    quart=(edtValue)*0.0000528344;
			    pintUS=(edtValue)*0.0001056688;
			    cupUS=(edtValue)*0.0002113376;
			    tablespoonUS=(edtValue)*0.0033814023;
			    teaspoonUS=(edtValue)*0.0101442068;
			    cubicmile=(edtValue)*1.199563792E-17;
			    cubicyard=(edtValue)*6.539753096E-8;
			    cubicfoot=(edtValue)*0.0000017657;
			    cubicinch=(edtValue)*0.0030511872;
			    cubicdecimeter=(edtValue)*0.00005;
			    exaliter=(edtValue)*5.E-23;
			    petaliter=(edtValue)*5.E-20;
			    teraliter=(edtValue)*5.E-17;
			    gigaliter=(edtValue)*5.E-14;
			    megaliter=(edtValue)*5.E-11;
			    kiloliter=(edtValue)*5.E-8;
			    hectoliter=(edtValue)*5.E-7;
			    dekaliter=(edtValue)*0.000005;
			    deciliter=(edtValue)*0.0005;
			    centiliter=(edtValue)*0.005;
			    microliter=(edtValue)*50;
			    nanoliter=(edtValue)*50000;
			    picoliter=(edtValue)*50000000;
			    femtoliter=(edtValue)*50000000000.0;
			    attoliter=(edtValue)*50000000000000.0;
			    cc=(edtValue)*0.05;
	  			
			    drop=(edtValue)*1;
			    barreloil=(edtValue)* 3.144905385E-7;
			    barrelUS=(edtValue)*3.144905385E-7;
			    barrelUK=(edtValue)*3.144905385E-7;
			    gallonUK=(edtValue)*0.0000109985;
			    quartUK=(edtValue)*0.0000439938;
			    pintUK=(edtValue)*0.0000879877;
			    cupmetric=(edtValue)*0.0002;
			    cupUK=(edtValue)*0.0001759754;
			    fluidounceUS=(edtValue)*0.0016907011;
			    fluidounceUK=(edtValue)*0.001759754;
			    tablespoonmetric=(edtValue)*0.0033333333;
			    tablespoonUK=(edtValue)*0.0028156064;
			    dessertspoonUS=(edtValue)*0.0050721034;
	  			
			    dessertspoonUK=(edtValue)*0.0042234096;
			    teaspoonmetric=(edtValue)*0.01;
			    teaspoonUK=(edtValue)*0.0084468191;
			    gillUS=(edtValue)*0.0004226753;
			    gillUK=(edtValue)*0.0004226753;
			    minimUS=(edtValue)*0.8115365448;
			    minimUK=(edtValue)*0.8446819135;
			    tonregister=(edtValue)*1.765733336E-8;
			    ccf=(edtValue)*1.765733336E-8;
			    hundresdcubicfoot=(edtValue)*1.765733336E-8;
			    acrefoot=(edtValue)*4.053565968E-11;
			    acrefootUSsurvey=(edtValue)*4.053541647E-11;
			    
			    
			    
			    acreinch=(edtValue)*4.864279162E-10;
			    dekastere=(edtValue)*5.E-9;
			    stere=(edtValue)*5.E-8;
			    decistere=(edtValue)*5.E-7;
			    cord=(edtValue)*1.379479168E-8;
			    tun=(edtValue)*5.241508975E-8;
			    hogshead=(edtValue)*2.09660359E-7;
			    boardfoot=(edtValue)*0.0000211888;
			    dram=(edtValue)*0.0135256091;
			    cor=(edtValue)*2.272727272E-7;
			    homerBiblical=(edtValue)*2.272727272E-7;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.0000022727;
			    hinBiblical=(edtValue)*0.0000136364;
			    cabBiblical=(edtValue)*0.0000409091;
			    logBiblical=(edtValue)*0.0001636364;
			    TazaSpanish=(edtValue)*0.0002113376;
			    Earthsvolume=(edtValue)*4.61680517E-29;
			    
	  			break;
				
	  			
		 case "Barrel(oil) - bbl":
	  			
			    cubicmeter=(edtValue)*0.1589872949;
			    cubickilometer=(edtValue)*1.589872949E-10 ;
			    cubiccentimeter=(edtValue)*158987.29493;
			    cubicmillimeter=(edtValue)*158987294.93;
			    liter=(edtValue)*158.98729493;
			    milliliter=(edtValue)*158987.29493;
			    gallon=(edtValue)*42;
			    quart=(edtValue)*168;
			    pintUS=(edtValue)*336;
			    cupUS=(edtValue)*672;
			    tablespoonUS=(edtValue)*10752;
			    teaspoonUS=(edtValue)*32256;
			    cubicmile=(edtValue)*3.81430805E-11;
			    cubicyard=(edtValue)*3.81430805E-11;
			    cubicfoot=(edtValue)*5.6145833333;
			    cubicinch=(edtValue)*9702;
			    cubicdecimeter=(edtValue)*158.98729493;
			    exaliter=(edtValue)*1.589872949E-16;
			    petaliter=(edtValue)*1.589872949E-13;
			    teraliter=(edtValue)*1.589872949E-10;
			    gigaliter=(edtValue)*1.589872949E-7;
			    megaliter=(edtValue)*0.0001589873;
			    kiloliter=(edtValue)*0.1589872949;
			    hectoliter=(edtValue)*1.5898729493;
			    dekaliter=(edtValue)*15.898729493;
			    deciliter=(edtValue)*1589.8729493;
			    centiliter=(edtValue)*15898.729493;
			    microliter=(edtValue)*158987294.93;
			    nanoliter=(edtValue)*158987294928.0;
			    picoliter=(edtValue)*158987294928000.0;
			    femtoliter=(edtValue)*158987294928000130.0;
			    attoliter=(edtValue)*158987294928000120000.0;
			    cc=(edtValue)*158987.29493;
	  			
			    drop=(edtValue)*3179745.8986;
			    barreloil=(edtValue)*1 ;
			    barrelUS=(edtValue)*1.3333333333;
			    barrelUK=(edtValue)*0.9714532154;
			    gallonUK=(edtValue)*34.972315754;
			    quartUK=(edtValue)*139.88926302;
			    pintUK=(edtValue)*279.77852604;
			    cupmetric=(edtValue)*635.94917971;
			    cupUK=(edtValue)*559.55705207;
			    fluidounceUS=(edtValue)*5376;
			    fluidounceUK=(edtValue)*5595.5705207;
			    tablespoonmetric=(edtValue)*10599.152995;
			    tablespoonUK=(edtValue)*8952.9128331;
			    dessertspoonUS=(edtValue)*16128;
	  			
			    dessertspoonUK=(edtValue)*13429.36925;
			    teaspoonmetric=(edtValue)*31797.458986;
			    teaspoonUK=(edtValue)*26858.738499;
			    gillUS=(edtValue)*1344;
			    gillUK=(edtValue)*1119.1141041;
			    minimUS=(edtValue)*2580480;
			    minimUK=(edtValue)*2685873.8499;
			    tonregister=(edtValue)*0.0561458333;
			    ccf=(edtValue)*0.0561458333;
			    hundresdcubicfoot=(edtValue)*0.0561458333;
			    acrefoot=(edtValue)*0.0001288931;
			    acrefootUSsurvey=(edtValue)*0.0001288923;
			    
			    
			    
			    acreinch=(edtValue)*0.0015467172;
			    dekastere=(edtValue)*0.0158987295;
			    stere=(edtValue)*0.1589872949;
			    decistere=(edtValue)*1.5898729493;
			    cord=(edtValue)*0.0438639323;
			    tun=(edtValue)*0.1666666667;
			    hogshead=(edtValue)*0.6666666667;
			    boardfoot=(edtValue)*67.375;
			    dram=(edtValue)*43008;
			    cor=(edtValue)*0.7226695224;
			    homerBiblical=(edtValue)*0.7226695224;
	  			
	  			
			    
			    bathBiblical=(edtValue)*7.226695224;
			    hinBiblical=(edtValue)*43.360171344;
			    cabBiblical=(edtValue)*130.08051403;
			    logBiblical=(edtValue)*520.32205613;
			    TazaSpanish=(edtValue)*672;
			    Earthsvolume=(edtValue)*1.46802673E-22;
			    
	  			break;
				
	  			
		 case "Barrel(US) - bbl":
	  			
			    cubicmeter=(edtValue)*0.1192404712;
			    cubickilometer=(edtValue)* 1.192404711E-10;
			    cubiccentimeter=(edtValue)*119240.4712;
			    cubicmillimeter=(edtValue)*119240471.2;
			    liter=(edtValue)*119.2404712;
			    milliliter=(edtValue)*119240.4712;
			    gallon=(edtValue)*31.5;
			    quart=(edtValue)*126;
			    pintUS=(edtValue)*252;
			    cupUS=(edtValue)*504;
			    tablespoonUS=(edtValue)*8064;
			    teaspoonUS=(edtValue)*24192;
			    cubicmile=(edtValue)*2.860731037E-11;
			    cubicyard=(edtValue)*0.1559606481;
			    cubicfoot=(edtValue)*4.2109375;
			    cubicinch=(edtValue)*7276.5;
			    cubicdecimeter=(edtValue)*119.2404712;
			    exaliter=(edtValue)*1.192404711E-16;
			    petaliter=(edtValue)*1.192404711E-13;
			    teraliter=(edtValue)*1.192404711E-10;
			    gigaliter=(edtValue)*1.192404711E-7;
			    megaliter=(edtValue)*0.0001192405;
			    kiloliter=(edtValue)*0.1192404712;
			    hectoliter=(edtValue)*1.192404712;
			    dekaliter=(edtValue)*11.92404712;
			    deciliter=(edtValue)*1192.404712;
			    centiliter=(edtValue)*11924.04712;
			    microliter=(edtValue)*119240471.2;
			    nanoliter=(edtValue)*119240471196.0;
			    picoliter=(edtValue)*119240471196001.0;
			    femtoliter=(edtValue)*119240471196000560.0;
			    attoliter=(edtValue)*1192404711960005700000.0;
			    cc=(edtValue)*119240.4712;
	  			
			    drop=(edtValue)*2384809.4239;
			    barreloil=(edtValue)*0.75 ;
			    barrelUS=(edtValue)*1;
			    barrelUK=(edtValue)*0.7285899116;
			    gallonUK=(edtValue)*26.229236816;
			    quartUK=(edtValue)*104.91694726;
			    pintUK=(edtValue)*209.83389453;
			    cupmetric=(edtValue)*476.96188478;
			    cupUK=(edtValue)*419.66778905;
			    fluidounceUS=(edtValue)*4032;
			    fluidounceUK=(edtValue)*4196.6778905;
			    tablespoonmetric=(edtValue)*7949.3647464;
			    tablespoonUK=(edtValue)*6714.6846248;
			    dessertspoonUS=(edtValue)*12096;
	  			
			    dessertspoonUK=(edtValue)*10072.026937;
			    teaspoonmetric=(edtValue)*23848.094239;
			    teaspoonUK=(edtValue)*20144.053875;
			    gillUS=(edtValue)*1008;
			    gillUK=(edtValue)*839.33557811;
			    minimUS=(edtValue)*1935360;
			    minimUK=(edtValue)*2014405.3875;
			    tonregister=(edtValue)*0.042109375;
			    ccf=(edtValue)*0.042109375;
			    hundresdcubicfoot=(edtValue)*0.042109375;
			    acrefoot=(edtValue)*0.0000966698;
			    acrefootUSsurvey=(edtValue)*0.0000966692;
			    
			    
			    
			    acreinch=(edtValue)*0.0011600379;
			    dekastere=(edtValue)*0.0119240471;
			    stere=(edtValue)*0.0119240471;
			    decistere=(edtValue)*0.0119240471;
			    cord=(edtValue)*0.0119240471;
			    tun=(edtValue)*0.125;
			    hogshead=(edtValue)*0.5;
			    boardfoot=(edtValue)*50.53125;
			    dram=(edtValue)*32256;
			    cor=(edtValue)*0.5420021418;
			    homerBiblical=(edtValue)*0.5420021418;
	  			
	  			
			    
			    bathBiblical=(edtValue)*5.420021418;
			    hinBiblical=(edtValue)*32.520128508;
			    cabBiblical=(edtValue)*97.560385524;
			    logBiblical=(edtValue)*390.2415421;
			    TazaSpanish=(edtValue)*504;
			    Earthsvolume=(edtValue)*1.101020047E-22;
			    
	  			break;
				
	  			
		 case "Barrel(UK) - bbl":
	  			
			    cubicmeter=(edtValue)*0.16365924;
			    cubickilometer=(edtValue)* 1.636592399E-10;
			    cubiccentimeter=(edtValue)*163659.24;
			    cubicmillimeter=(edtValue)*163659240;
			    liter=(edtValue)*163.65924;
			    milliliter=(edtValue)*163659.24;
			    gallon=(edtValue)*43.234197318;
			    quart=(edtValue)*172.93678927;
			    pintUS=(edtValue)*345.87357855;
			    cupUS=(edtValue)*691.74715709;
			    tablespoonUS=(edtValue)*11067.954513;
			    teaspoonUS=(edtValue)*33203.86354;
			    cubicmile=(edtValue)*3.926393973E-11;
			    cubicyard=(edtValue)*0.2140582043;
			    cubicfoot=(edtValue)*5.7795715165;
			    cubicinch=(edtValue)*9987.0995805;
			    cubicdecimeter=(edtValue)*163.65924;
			    exaliter=(edtValue)*1.636592399E-16;
			    petaliter=(edtValue)*1.636592399E-13;
			    teraliter=(edtValue)*1.636592399E-10;
			    gigaliter=(edtValue)*1.636592399E-7;
			    megaliter=(edtValue)*0.0001636592;
			    kiloliter=(edtValue)*0.16365924;
			    hectoliter=(edtValue)*1.6365924;
			    dekaliter=(edtValue)*16.365924;
			    deciliter=(edtValue)*1636.5924;
			    centiliter=(edtValue)*16365.924;
			    microliter=(edtValue)*163659240;
			    nanoliter=(edtValue)*163659240000.0;
			    picoliter=(edtValue)*163659240000000.0;
			    femtoliter=(edtValue)*163659239999999520.0;
			    attoliter=(edtValue)*163659239999999540000.0;
			    cc=(edtValue)*163659.24;
	  			
			    drop=(edtValue)*3273184.8;
			    barreloil=(edtValue)*1.0293856504 ;
			    barrelUS=(edtValue)*1.3725142006;
			    barrelUK=(edtValue)*1;
			    gallonUK=(edtValue)*36;
			    quartUK=(edtValue)*144;
			    pintUK=(edtValue)*288;
			    cupmetric=(edtValue)*654.63696;
			    cupUK=(edtValue)*576;
			    fluidounceUS=(edtValue)*5533.9772567;
			    fluidounceUK=(edtValue)*5760;
			    tablespoonmetric=(edtValue)*10910.616;
			    tablespoonUK=(edtValue)*9216;
			    dessertspoonUS=(edtValue)*16601.93177;
	  			
			    dessertspoonUK=(edtValue)*13824;
			    teaspoonmetric=(edtValue)*32731.848;
			    teaspoonUK=(edtValue)*27648;
			    gillUS=(edtValue)*1383.4943142;
			    gillUK=(edtValue)*1152;
			    minimUS=(edtValue)*2656309.0832;
			    minimUK=(edtValue)*2764800;
			    tonregister=(edtValue)*0.0577957152;
			    ccf=(edtValue)*0.0577957152;
			    hundresdcubicfoot=(edtValue)*0.0577957152;
			    acrefoot=(edtValue)*0.0001326807;
			    acrefootUSsurvey=(edtValue)*0.0001326799;
			    
			    
			    
			    acreinch=(edtValue)*0.0015921685;
			    dekastere=(edtValue)*0.016365924;
			    stere=(edtValue)*0.16365924;
			    decistere=(edtValue)*1.6365924;
			    cord=(edtValue)*0.0451529025;
			    tun=(edtValue)*0.1715642751;
			    hogshead=(edtValue)*0.6862571003;
			    boardfoot=(edtValue)*69.354858198;
			    dram=(edtValue)*44271.818054;
			    cor=(edtValue)*0.7439056364;
			    homerBiblical=(edtValue)*0.7439056364;
	  			
	  			
			    
			    bathBiblical=(edtValue)*7.4390563636;
			    hinBiblical=(edtValue)*44.634338182;
			    cabBiblical=(edtValue)*133.90301455;
			    logBiblical=(edtValue)*535.61205818;
			    TazaSpanish=(edtValue)*691.74715709;
			    Earthsvolume=(edtValue)*1.51116565E-22;
			    
	  			break;
				
	  			
		 case "Gallon - gallon":
	  			
			    cubicmeter=(edtValue)*0.00454609;
			    cubickilometer=(edtValue)* 4.546089999E-12;
			    cubiccentimeter=(edtValue)*4546.09;
			    cubicmillimeter=(edtValue)*4546090;
			    liter=(edtValue)*4.54609;
			    milliliter=(edtValue)*4546.09;
			    gallon=(edtValue)*1.2009499255;
			    quart=(edtValue)*4.803799702;
			    pintUS=(edtValue)*9.607599404;
			    cupUS=(edtValue)*19.215198808;
			    tablespoonUS=(edtValue)*307.44318093;
			    teaspoonUS=(edtValue)*922.32954279;
			    cubicmile=(edtValue)*1.090664992E-12;
			    cubicyard=(edtValue)*0.0059460612;
			    cubicfoot=(edtValue)*0.1605436532;
			    cubicinch=(edtValue)*277.41943279;
			    cubicdecimeter=(edtValue)*4.54609;
			    exaliter=(edtValue)*4.546089999E-18;
			    petaliter=(edtValue)*4.546089999E-15;
			    teraliter=(edtValue)*4.546089999E-12;
			    gigaliter=(edtValue)*4.546089999E-9;
			    megaliter=(edtValue)*0.0000045461;
			    kiloliter=(edtValue)*0.00454609;
			    hectoliter=(edtValue)*0.0454609;
			    dekaliter=(edtValue)*0.454609;
			    deciliter=(edtValue)*45.4609;
			    centiliter=(edtValue)*454.609;
			    microliter=(edtValue)*4546090;
			    nanoliter=(edtValue)*4546090000.0;
			    picoliter=(edtValue)*4546090000000.0;
			    femtoliter=(edtValue)*4546089999999954.0;
			    attoliter=(edtValue)*4546089999999954400.0;
			    cc=(edtValue)*4546.09;
	  			
			    drop=(edtValue)* 90921.8;
			    barreloil=(edtValue)*0.0285940458 ;
			    barrelUS=(edtValue)*0.0381253945;
			    barrelUK=(edtValue)*0.0277777778;
			    gallonUK=(edtValue)*1;
			    quartUK=(edtValue)*4;
			    pintUK=(edtValue)*8;
			    cupmetric=(edtValue)*18.18436;
			    cupUK=(edtValue)*16;
			    fluidounceUS=(edtValue)*153.72159046;
			    fluidounceUK=(edtValue)*160;
			    tablespoonmetric=(edtValue)*303.07266667;
			    tablespoonUK=(edtValue)*256;
			    dessertspoonUS=(edtValue)*461.16477139;
	  			
			    dessertspoonUK=(edtValue)*384;
			    teaspoonmetric=(edtValue)*909.218;
			    teaspoonUK=(edtValue)*768;
			    gillUS=(edtValue)*38.430397616;
			    gillUK=(edtValue)*32;
			    minimUS=(edtValue)*73786.363423;
			    minimUK=(edtValue)*76800;
			    tonregister=(edtValue)*0.0016054365;
			    ccf=(edtValue)*0.0016054365;
			    hundresdcubicfoot=(edtValue)*0.0016054365;
			    acrefoot=(edtValue)*0.0000036856;
			    acrefootUSsurvey=(edtValue)*0.0000036856;
			    
			    
			    
			    acreinch=(edtValue)*0.0000036856;
			    dekastere=(edtValue)*0.000454609;
			    stere=(edtValue)*0.00454609;
			    decistere=(edtValue)*0.0454609;
			    cord=(edtValue)*0.0012542473;
			    tun=(edtValue)*0.0047656743;
			    hogshead=(edtValue)*0.0190626972;
			    boardfoot=(edtValue)*1.9265238388;
			    dram=(edtValue)*1229.7727237;
			    cor=(edtValue)*0.0206640455;
			    homerBiblical=(edtValue)*0.0206640455;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.2066404545;
			    hinBiblical=(edtValue)*1.2398427273;
			    cabBiblical=(edtValue)*3.7195281818;
			    logBiblical=(edtValue)*14.878112727;
			    TazaSpanish=(edtValue)*19.215198808;
			    Earthsvolume=(edtValue)*4.197682363E-24;
			    
	  			break;
				
		 case "Quart(UK) - qt":
	  			
			    cubicmeter=(edtValue)*0.0011365225;
			    cubickilometer=(edtValue)*1.1365225E-12;
			    cubiccentimeter=(edtValue)* 1136.5225;
			    cubicmillimeter=(edtValue)* 1136522.5;
			    liter=(edtValue)* 1.1365225;
			    milliliter=(edtValue)* 1136.5225;
			    gallon=(edtValue)*0.3002374814 ;
			    quart=(edtValue)* 1.2009499255;
			    pintUS=(edtValue)*2.401899851 ;
			    cupUS=(edtValue)*4.803799702;
			    tablespoonUS=(edtValue)* 76.860795232;
			    teaspoonUS=(edtValue)* 230.5823857;
			    cubicmile=(edtValue)* 2.726662481E-13;
			    cubicyard=(edtValue)*0.0014865153 ;
			    cubicfoot=(edtValue)* 0.0401359133;
			    cubicinch=(edtValue)*69.354858198 ;
			    cubicdecimeter=(edtValue)* 1.1365225;
			    exaliter=(edtValue)* 1.1365225E-18;
			    petaliter=(edtValue)*1.1365225E-15 ;
			    teraliter=(edtValue)*1.1365225E-12 ;
			    gigaliter=(edtValue)* 1.1365225E-9;
			    megaliter=(edtValue)* 0.0000011365;
			    kiloliter=(edtValue)* 0.0000011365;
			    hectoliter=(edtValue)* 0.0011365225;
			    dekaliter=(edtValue)*0.011365225 ;
			    deciliter=(edtValue)*0.11365225 ;
			    centiliter=(edtValue)* 11.365225;
			    microliter=(edtValue)*1136522.5 ;
			    nanoliter=(edtValue)* 1136522500.0;
			    picoliter=(edtValue)*1136522500000.0;
			    femtoliter=(edtValue)* 1136522500000002.0;
			    attoliter=(edtValue)* 1136522500000001400.0;
			    cc=(edtValue)* 1136.5225;
	  			
			    drop=(edtValue)* 22730.45;
			    barreloil=(edtValue)*0.0071485115;
			    barrelUS=(edtValue)*0.0095313486 ;
			    barrelUK=(edtValue)* 0.0069444444;
			    gallonUK=(edtValue)* 0.25;
			    quartUK=(edtValue)* 1;
			    pintUK=(edtValue)*2 ;
			    cupmetric=(edtValue)* 4.54609 ;
			    cupUK=(edtValue)*4 ;
			    fluidounceUS=(edtValue)* 38.430397616;
			    fluidounceUK=(edtValue)*40 ;
			    tablespoonmetric=(edtValue)*75.768166667 ;
			    tablespoonUK=(edtValue) * 64;
			    dessertspoonUS=(edtValue)* 115.29119285;
	  			
			    dessertspoonUK=(edtValue)* 96;
			    teaspoonmetric=(edtValue)* 227.3045;
			    teaspoonUK=(edtValue)*192 ;
			    gillUS=(edtValue)*9.607599404 ;
			    gillUK=(edtValue)*8 ;
			    minimUS=(edtValue)* 18446.590856;
			    minimUK=(edtValue)* 19200;
			    tonregister=(edtValue)*0.0004013591 ; 
			    ccf=(edtValue)*0.0004013591 ;
			    hundresdcubicfoot=(edtValue)* 0.0004013591;
			    acrefoot=(edtValue)* 9.213937857E-7;
			    acrefootUSsurvey=(edtValue)*9.213882574E-7 ;
			    
			    
			    
			    acreinch=(edtValue)*0.0000110567 ;
			    dekastere=(edtValue)* 0.0001136523;
			    stere=(edtValue)*0.0011365225 ;
			    decistere=(edtValue)* 0.011365225;
			    cord=(edtValue)* 0.0003135618;
			    tun=(edtValue)*0.0011914186 ;
			    hogshead=(edtValue)* 0.0047656743;
			    boardfoot=(edtValue)*0.4816309597 ;
			    dram=(edtValue)* 307.44318093;
			    cor=(edtValue)*0.0051660114;
			    homerBiblical=(edtValue)*0.0051660114 ;
	  			
	  			
			    
			    bathBiblical=(edtValue)* 0.0516601136;
			    hinBiblical=(edtValue)*0.3099606818 ;
			    cabBiblical=(edtValue)*0.9298820455 ;
			    logBiblical=(edtValue)*3.7195281818 ;
			    TazaSpanish=(edtValue)* 4.803799702;
			    Earthsvolume=(edtValue)*1.04942059E-24;
			    
	  			break;
				
	  			
		 case "Pint(UK) - pt":
	  			
			    cubicmeter=(edtValue)*0.0005682613;
			    cubickilometer=(edtValue)*5.6826125E-13 ;
			    cubiccentimeter=(edtValue)*568.26125;
			    cubicmillimeter=(edtValue)*568261.25;
			    liter=(edtValue)*0.56826125;
			    milliliter=(edtValue)*568.26125;
			    gallon=(edtValue)*0.1501187407;
			    quart=(edtValue)*0.6004749628;
			    pintUS=(edtValue)*1.2009499255;
			    cupUS=(edtValue)*2.401899851;
			    tablespoonUS=(edtValue)*38.430397616;
			    teaspoonUS=(edtValue)*115.29119285;
			    cubicmile=(edtValue)*1.36333124E-13;
			    cubicyard=(edtValue)*0.0007432577;
			    cubicfoot=(edtValue)*0.0200679567;
			    cubicinch=(edtValue)*34.677429099;
			    cubicdecimeter=(edtValue)*0.56826125;
			    exaliter=(edtValue)*5.6826125E-19;
			    petaliter=(edtValue)*5.6826125E-16;
			    teraliter=(edtValue)*5.6826125E-13;
			    gigaliter=(edtValue)*5.6826125E-10;
			    megaliter=(edtValue)*5.6826125E-7;
			    kiloliter=(edtValue)*0.0005682613;
			    hectoliter=(edtValue)*0.0056826125;
			    dekaliter=(edtValue)*0.056826125;
			    deciliter=(edtValue)*5.6826125;
			    centiliter=(edtValue)*56.826125;
			    microliter=(edtValue)*568261.25;
			    nanoliter=(edtValue)*568261250.0;
			    picoliter=(edtValue)*568261250000.0;
			    femtoliter=(edtValue)*568261250000001.0;
			    attoliter=(edtValue)*568261250000000700.0;
			    cc=(edtValue)*568.26125;
	  			
			    drop=(edtValue)*11365.225;
			    barreloil=(edtValue)* 0.0035742557;
			    barrelUS=(edtValue)*0.0047656743;
			    barrelUK=(edtValue)*0.0034722222;
			    gallonUK=(edtValue)*0.125;
			    quartUK=(edtValue)*0.5;
			    pintUK=(edtValue)*1;
			    cupmetric=(edtValue)*2.273045;
			    cupUK=(edtValue)*2;
			    fluidounceUS=(edtValue)*19.215198808;
			    fluidounceUK=(edtValue)*20;
			    tablespoonmetric=(edtValue)*37.884083333;
			    tablespoonUK=(edtValue)*32;
			    dessertspoonUS=(edtValue)*57.645596424;
	  			
			    dessertspoonUK=(edtValue)*48;
			    teaspoonmetric=(edtValue)*113.65225;
			    teaspoonUK=(edtValue)*96;
			    gillUS=(edtValue)*4.803799702;
			    gillUK=(edtValue)*4;
			    minimUS=(edtValue)*9223.2954279;
			    minimUK=(edtValue)*9600;
			    tonregister=(edtValue)*0.0002006796;
			    ccf=(edtValue)*0.0002006796;
			    hundresdcubicfoot=(edtValue)*0.0002006796;
			    acrefoot=(edtValue)*4.606968928E-7;
			    acrefootUSsurvey=(edtValue)*4.606941287E-7;
			    
			    
			    
			    acreinch=(edtValue)*0.0000055284;
			    dekastere=(edtValue)*0.0000568261;
			    stere=(edtValue)*0.0005682613;
			    decistere=(edtValue)*0.0056826125;
			    cord=(edtValue)*0.0001567809;
			    tun=(edtValue)*0.0005957093;
			    hogshead=(edtValue)*0.0023828372;
			    boardfoot=(edtValue)*0.2408154799;
			    dram=(edtValue)*153.72159046;
			    cor=(edtValue)*0.0025830057;
			    homerBiblical=(edtValue)*0.0025830057;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.0258300568;
			    hinBiblical=(edtValue)*0.1549803409;
			    cabBiblical=(edtValue)*0.4649410227;
			    logBiblical=(edtValue)*1.8597640909;
			    TazaSpanish=(edtValue)*2.401899851;
			    Earthsvolume=(edtValue)*5.247102954E-25;
			    
	  			break;
				
	  			
		 case "Cup(Metric) - cup":
	  			
			    cubicmeter=(edtValue)*0.00025;
			    cubickilometer=(edtValue)* 2.5E-13;
			    cubiccentimeter=(edtValue)*250;
			    cubicmillimeter=(edtValue)*250000;
			    liter=(edtValue)*0.25;
			    milliliter=(edtValue)*250;
			    gallon=(edtValue)*0.0660430131;
			    quart=(edtValue)*0.2641720524;
			    pintUS=(edtValue)*0.5283441047;
			    cupUS=(edtValue)*1.0566882094;
			    tablespoonUS=(edtValue)*16.907011351;
			    teaspoonUS=(edtValue)*50.721034053;
			    cubicmile=(edtValue)*5.997818964E-14;
			    cubicyard=(edtValue)*0.0003269877;
			    cubicfoot=(edtValue)*0.0088286667;
			    cubicinch=(edtValue)*15.255936024;
			    cubicdecimeter=(edtValue)*0.25;
			    exaliter=(edtValue)*2.5E-19;
			    petaliter=(edtValue)*2.5E-16;
			    teraliter=(edtValue)*2.5E-13;
			    gigaliter=(edtValue)*2.5E-10;
			    megaliter=(edtValue)*2.5E-7;
			    kiloliter=(edtValue)*0.00025;
			    hectoliter=(edtValue)*0.0025;
			    dekaliter=(edtValue)*0.025;
			    deciliter=(edtValue)*2.5;
			    centiliter=(edtValue)*25;
			    microliter=(edtValue)*250000;
			    nanoliter=(edtValue)*250000000.0;
			    picoliter=(edtValue)*250000000000.0;
			    femtoliter=(edtValue)*250000000000000.0;
			    attoliter=(edtValue)*250000000000000000.0;
			    cc=(edtValue)*250;
	  			
			    drop=(edtValue)*5000;
			    barreloil=(edtValue)* 0.0015724527;
			    barrelUS=(edtValue)*0.0020966036;
			    barrelUK=(edtValue)*0.0015275642;
			    gallonUK=(edtValue)*0.0549923121;
			    quartUK=(edtValue)*0.2199692483;
			    pintUK=(edtValue)*0.4399384966;
			    cupmetric=(edtValue)*1;
			    cupUK=(edtValue)*0.8798769932;
			    fluidounceUS=(edtValue)*8.4535056755;
			    fluidounceUK=(edtValue)*8.798769932;
			    tablespoonmetric=(edtValue)*16.666666667;
			    tablespoonUK=(edtValue)*14.078031891;
			    dessertspoonUS=(edtValue)*25.360517026;
	  			
			    dessertspoonUK=(edtValue)*21.117047837;
			    teaspoonmetric=(edtValue)*50;
			    teaspoonUK=(edtValue)*42.234095673;
			    gillUS=(edtValue)*2.1133764189;
			    gillUK=(edtValue)*1.7597539864;
			    minimUS=(edtValue)*4057.6827242;
			    minimUK=(edtValue)*4223.4095673;
			    tonregister=(edtValue)*0.0000882867;
			    ccf=(edtValue)*0.0000882867;
			    hundresdcubicfoot=(edtValue)*0.0000882867;
			    acrefoot=(edtValue)*2.026782984E-7;
			    acrefootUSsurvey=(edtValue)*2.026770823E-7;
			    
			    
			    
			    acreinch=(edtValue)*0.0000024321;
			    dekastere=(edtValue)*0.000025;
			    stere=(edtValue)*0.00025;
			    decistere=(edtValue)*0.0025;
			    cord=(edtValue)*0.000068974;
			    tun=(edtValue)*0.0002620754;
			    hogshead=(edtValue)*0.0010483018;
			    boardfoot=(edtValue)*0.1059440002;
			    dram=(edtValue)*67.628045404;
			    cor=(edtValue)*0.0011363636;
			    homerBiblical=(edtValue)*0.0011363636;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.0113636364;
			    hinBiblical=(edtValue)*0.0681818182;
			    cabBiblical=(edtValue)*0.2045454545;
			    logBiblical=(edtValue)*0.8181818182;
			    TazaSpanish=(edtValue)*1.0566882094;
			    Earthsvolume=(edtValue)*2.308402585E-25;
			    
	  			break;
				
	  			
		 case "Cup(UK) - cup":
	  			
			    cubicmeter=(edtValue)*0.0002841306;
			    cubickilometer=(edtValue)*2.84130625E-13 ;
			    cubiccentimeter=(edtValue)*284.130625;
			    cubicmillimeter=(edtValue)*284130.625;
			    liter=(edtValue)*0.284130625;
			    milliliter=(edtValue)*284.130625;
			    gallon=(edtValue)*0.0750593703;
			    quart=(edtValue)*0.3002374814;
			    pintUS=(edtValue)*0.6004749628;
			    cupUS=(edtValue)*1.2009499255;
			    tablespoonUS=(edtValue)*19.215198808;
			    teaspoonUS=(edtValue)*57.645596424;
			    cubicmile=(edtValue)*6.816656204E-14;
			    cubicyard=(edtValue)*0.0003716288;
			    cubicfoot=(edtValue)*0.0100339783;
			    cubicinch=(edtValue)*17.338714549;
			    cubicdecimeter=(edtValue)*0.284130625;
			    exaliter=(edtValue)*2.84130625E-19;
			    petaliter=(edtValue)*2.84130625E-16;
			    teraliter=(edtValue)*2.84130625E-13;
			    gigaliter=(edtValue)*2.84130625E-10;
			    megaliter=(edtValue)*2.84130625E-7;
			    kiloliter=(edtValue)*0.0002841306;
			    hectoliter=(edtValue)*0.0028413063;
			    dekaliter=(edtValue)*0.0284130625;
			    deciliter=(edtValue)*2.84130625;
			    centiliter=(edtValue)*28.4130625;
			    microliter=(edtValue)*284130.625;
			    nanoliter=(edtValue)*284130625;
			    picoliter=(edtValue)*284130625000.0;
			    femtoliter=(edtValue)*284130625000000.0;
			    attoliter=(edtValue)*284130625000000350.0;
			    cc=(edtValue)*284.130625;
	  			
			    drop=(edtValue)*5682.6125;
			    barreloil=(edtValue)* 0.0017871279;
			    barrelUS=(edtValue)*0.0023828372;
			    barrelUK=(edtValue)*0.0017361111;
			    gallonUK=(edtValue)*0.0625;
			    quartUK=(edtValue)*0.25;
			    pintUK=(edtValue)*0.5;
			    cupmetric=(edtValue)*1.1365225;
			    cupUK=(edtValue)*1;
			    fluidounceUS=(edtValue)*9.607599404;
			    fluidounceUK=(edtValue)*10;
			    tablespoonmetric=(edtValue)*18.942041667;
			    tablespoonUK=(edtValue)*16;
			    dessertspoonUS=(edtValue)*28.822798212;
	  			
			    dessertspoonUK=(edtValue)*24;
			    teaspoonmetric=(edtValue)*56.826125;
			    teaspoonUK=(edtValue)*48;
			    gillUS=(edtValue)*2.401899851;
			    gillUK=(edtValue)*2;
			    minimUS=(edtValue)*4611.6477139;
			    minimUK=(edtValue)*4800;
			    tonregister=(edtValue)*0.0001003398;
			    ccf=(edtValue)*0.0001003398;
			    hundresdcubicfoot=(edtValue)*0.0001003398;
			    acrefoot=(edtValue)*2.303484464E-7;
			    acrefootUSsurvey=(edtValue)*2.303470643E-7;
			    
			    
			    
			    acreinch=(edtValue)*0.0000027642;
			    dekastere=(edtValue)*0.0000284131;
			    stere=(edtValue)*0.0002841306;
			    decistere=(edtValue)*0.0028413063;
			    cord=(edtValue)*0.0000783905;
			    tun=(edtValue)*0.0002978546;
			    hogshead=(edtValue)*0.0011914186;
			    boardfoot=(edtValue)*0.1204077399;
			    dram=(edtValue)*76.860795232;
			    cor=(edtValue)*0.0012915028;
			    homerBiblical=(edtValue)*0.0012915028;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.0129150284;
			    hinBiblical=(edtValue)*0.0774901705;
			    cabBiblical=(edtValue)*0.2324705114;
			    logBiblical=(edtValue)*0.9298820455;
			    TazaSpanish=(edtValue)*1.2009499255;
			    Earthsvolume=(edtValue)*2.623551477E-25;
			    
	  			break;
				
	  			
		 case "Fluid ounce(US) - fl oz":
	  			
			    cubicmeter=(edtValue)*0.0000295735;
			    cubickilometer=(edtValue)* 2.957352956E-14;
			    cubiccentimeter=(edtValue)*29.573529562;
			    cubicmillimeter=(edtValue)*29573.529562;
			    liter=(edtValue)*0.0295735296;
			    milliliter=(edtValue)*29.573529562;
			    gallon=(edtValue)*0.0078125;
			    quart=(edtValue)*0.03125;
			    pintUS=(edtValue)*0.0625;
			    cupUS=(edtValue)*0.125;
			    tablespoonUS=(edtValue)*2;
			    teaspoonUS=(edtValue)*6;
			    cubicmile=(edtValue)*7.095067058E-15;
			    cubicyard=(edtValue)*0.0000386807;
			    cubicfoot=(edtValue)*0.0010443793;
			    cubicinch=(edtValue)*1.8046875;
			    cubicdecimeter=(edtValue)*0.0295735296;
			    exaliter=(edtValue)*2.957352956E-20;
			    petaliter=(edtValue)*2.957352956E-17;
			    teraliter=(edtValue)*2.957352956E-14;
			    gigaliter=(edtValue)*2.957352956E-11;
			    megaliter=(edtValue)*2.957352956E-8;
			    kiloliter=(edtValue)*0.0000295735;
			    hectoliter=(edtValue)*0.0002957353;
			    dekaliter=(edtValue)*0.002957353;
			    deciliter=(edtValue)*0.2957352956;
			    centiliter=(edtValue)*2.9573529562;
			    microliter=(edtValue)*29573.529562;
			    nanoliter=(edtValue)*29573529.562;
			    picoliter=(edtValue)*29573529563.0;
			    femtoliter=(edtValue)*29573529562500.0;
			    attoliter=(edtValue)*29573529562499996.0;
			    cc=(edtValue)*29.573529562;
	  			
			    drop=(edtValue)*591.47059125;
			    barreloil=(edtValue)*0.0001860119 ;
			    barrelUS=(edtValue)*0.0002480159;
			    barrelUK=(edtValue)*0.0001807019;
			    gallonUK=(edtValue)*0.0065052671;
			    quartUK=(edtValue)*0.0260210683;
			    pintUK=(edtValue)*0.0520421365;
			    cupmetric=(edtValue)*0.1182941183;
			    cupUK=(edtValue)*0.1040842731;
			    fluidounceUS=(edtValue)*1;
			    fluidounceUK=(edtValue)*1.0408427308;
			    tablespoonmetric=(edtValue)*1.9715686375;
			    tablespoonUK=(edtValue)*1.6653483693;
			    dessertspoonUS=(edtValue)*3;
	  			
			    dessertspoonUK=(edtValue)*2.4980225539;
			    teaspoonmetric=(edtValue)*5.9147059125;
			    teaspoonUK=(edtValue)*4.9960451078;
			    gillUS=(edtValue)*0.25;
			    gillUK=(edtValue)*0.2081685462;
			    minimUS=(edtValue)*480;
			    minimUK=(edtValue)*499.60451078;
			    tonregister=(edtValue)*0.0000104438;
			    ccf=(edtValue)*0.0000104438;
			    hundresdcubicfoot=(edtValue)*0.0000104438;
			    acrefoot=(edtValue)*2.39756506E-8;
			    acrefootUSsurvey=(edtValue)*2.397550674E-8;
			    
			    
			    
			    acreinch=(edtValue)*2.877078072E-7;
			    dekastere=(edtValue)*0.0000029574;
			    stere=(edtValue)*0.0000295735;
			    decistere=(edtValue)*0.0002957353;
			    cord=(edtValue)*0.0000081592;
			    tun=(edtValue)*0.000031002;
			    hogshead=(edtValue)*0.0001240079;
			    boardfoot=(edtValue)*0.0125325521;
			    dram=(edtValue)*8;
			    cor=(edtValue)*0.0001344251;
			    homerBiblical=(edtValue)*0.0001344251;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.0013442513;
			    hinBiblical=(edtValue)*0.0080655081;
			    cabBiblical=(edtValue)*0.0241965242;
			    logBiblical=(edtValue)*0.0967860968;
			    TazaSpanish=(edtValue)*0.125;
			    Earthsvolume=(edtValue)*2.730704484E-26;
			    
	  			break;
				
	  			
		 case "Fluid ounce(UK) - fl oz":
	  			
			    cubicmeter=(edtValue)*0.0000284131;
			    cubickilometer=(edtValue)*2.84130625E-14 ;
			    cubiccentimeter=(edtValue)*28.4130625;
			    cubicmillimeter=(edtValue)*28413.0625;
			    liter=(edtValue)*0.0284130625;
			    milliliter=(edtValue)*28.4130625;
			    gallon=(edtValue)*28.4130625;
			    quart=(edtValue)*0.0300237481;
			    pintUS=(edtValue)*0.0600474963;
			    cupUS=(edtValue)*0.1200949926;
			    tablespoonUS=(edtValue)*1.9215198808;
			    teaspoonUS=(edtValue)*5.7645596424;
			    cubicmile=(edtValue)*6.816656204E-15;
			    cubicyard=(edtValue)*0.0000371629;
			    cubicfoot=(edtValue)*0.0010033978;
			    cubicinch=(edtValue)*1.7338714549;
			    cubicdecimeter=(edtValue)*0.0284130625;
			    exaliter=(edtValue)*2.84130625E-20;
			    petaliter=(edtValue)*2.84130625E-17;
			    teraliter=(edtValue)*2.84130625E-14;
			    gigaliter=(edtValue)*2.84130625E-11;
			    megaliter=(edtValue)*2.84130625E-8;
			    kiloliter=(edtValue)*0.0000284131;
			    hectoliter=(edtValue)*0.0002841306;
			    dekaliter=(edtValue)*0.0028413063;
			    deciliter=(edtValue)*0.284130625;
			    centiliter=(edtValue)*2.84130625;
			    microliter=(edtValue)*28413.0625;
			    nanoliter=(edtValue)*28413062.5;
			    picoliter=(edtValue)*28413062500.0;
			    femtoliter=(edtValue)*28413062500000.0;
			    attoliter=(edtValue)*28413062500000036.0;
			    cc=(edtValue)*28.4130625;
	  			
			    drop=(edtValue)*568.26125;
			    barreloil=(edtValue)* 0.0001787128;
			    barrelUS=(edtValue)*0.0002382837;
			    barrelUK=(edtValue)*0.0001736111;
			    gallonUK=(edtValue)*0.00625;
			    quartUK=(edtValue)*0.025;
			    pintUK=(edtValue)*0.05;
			    cupmetric=(edtValue)*0.11365225;
			    cupUK=(edtValue)*0.1;
			    fluidounceUS=(edtValue)*0.9607599404;
			    fluidounceUK=(edtValue)*1;
			    tablespoonmetric=(edtValue)*1.8942041667;
			    tablespoonUK=(edtValue)*1.6;
			    dessertspoonUS=(edtValue)*2.8822798212;
	  			
			    dessertspoonUK=(edtValue)*2.4;
			    teaspoonmetric=(edtValue)*5.6826125;
			    teaspoonUK=(edtValue)*4.8;
			    gillUS=(edtValue)*0.2401899851;
			    gillUK=(edtValue)*0.2;
			    minimUS=(edtValue)*461.16477139;
			    minimUK=(edtValue)*480;
			    tonregister=(edtValue)*0.000010034;
			    ccf=(edtValue)*0.000010034;
			    hundresdcubicfoot=(edtValue)*0.000010034;
			    acrefoot=(edtValue)*2.303484464E-8;
			    acrefootUSsurvey=(edtValue)*2.303470643E-8;
			    
			    
			    
			    acreinch=(edtValue)*2.764181357E-7;
			    dekastere=(edtValue)*0.0000028413;
			    stere=(edtValue)*0.0000284131;
			    decistere=(edtValue)*0.0002841306;
			    cord=(edtValue)*0.000007839;
			    tun=(edtValue)*0.0000297855;
			    hogshead=(edtValue)*0.0001191419;
			    boardfoot=(edtValue)*0.012040774;
			    dram=(edtValue)*7.6860795232;
			    cor=(edtValue)*0.0001291503;
			    homerBiblical=(edtValue)*0.0001291503;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.0012915028;
			    hinBiblical=(edtValue)*0.007749017;
			    cabBiblical=(edtValue)*0.0232470511;
			    logBiblical=(edtValue)*0.0929882045;
			    TazaSpanish=(edtValue)*0.1200949926;
			    Earthsvolume=(edtValue)*2.623551477E-26;
			    
	  			break;
				
	  			
		 case "Tablespoon(Metric) - tblsp":
	  			
			    cubicmeter=(edtValue)*0.000015;
			    cubickilometer=(edtValue)*1.499999999E-14 ;
			    cubiccentimeter=(edtValue)*15;
			    cubicmillimeter=(edtValue)*15000;
			    liter=(edtValue)*0.015;
			    milliliter=(edtValue)*15;
			    gallon=(edtValue)*0.0039625808;
			    quart=(edtValue)*0.0158503231;
			    pintUS=(edtValue)*0.0317006463;
			    cupUS=(edtValue)*0.0634012926;
			    tablespoonUS=(edtValue)*1.0144206811;
			    teaspoonUS=(edtValue)*3.0432620432;
			    cubicmile=(edtValue)*3.598691378E-15;
			    cubicyard=(edtValue)*0.0000196193;
			    cubicfoot=(edtValue)*0.00052972;
			    cubicinch=(edtValue)*0.9153561614;
			    cubicdecimeter=(edtValue)*0.015;
			    exaliter=(edtValue)*1.499999999E-20;
			    petaliter=(edtValue)*1.499999999E-17;
			    teraliter=(edtValue)*1.499999999E-14;
			    gigaliter=(edtValue)*1.499999999E-11;
			    megaliter=(edtValue)*1.499999999E-8;
			    kiloliter=(edtValue)*0.000015;
			    hectoliter=(edtValue)*0.00015;
			    dekaliter=(edtValue)*0.0015;
			    deciliter=(edtValue)*0.15;
			    centiliter=(edtValue)*1.5;
			    microliter=(edtValue)*15000;
			    nanoliter=(edtValue)*15000000.0;
			    picoliter=(edtValue)*15000000000.0;
			    femtoliter=(edtValue)*15000000000000.0;
			    attoliter=(edtValue)*14999999999999924.0;
			    cc=(edtValue)*15;
	  			
			    drop=(edtValue)*300;
			    barreloil=(edtValue)*0.0000943472 ;
			    barrelUS=(edtValue)*0.0001257962;
			    barrelUK=(edtValue)*0.0000916539;
			    gallonUK=(edtValue)*0.0032995387;
			    quartUK=(edtValue)*0.0131981549;
			    pintUK=(edtValue)*0.0263963098;
			    cupmetric=(edtValue)*0.06;
			    cupUK=(edtValue)*0.0527926196;
			    fluidounceUS=(edtValue)*0.5072103405;
			    fluidounceUK=(edtValue)*0.5279261959;
			    tablespoonmetric=(edtValue)*1;
			    tablespoonUK=(edtValue)*0.8446819135;
			    dessertspoonUS=(edtValue)*1.5216310216;
	  			
			    dessertspoonUK=(edtValue)*1.2670228702;
			    teaspoonmetric=(edtValue)*3;
			    teaspoonUK=(edtValue)*2.5340457404;
			    gillUS=(edtValue)*0.1268025851;
			    gillUK=(edtValue)*0.1055852392;
			    minimUS=(edtValue)*243.46096345;
			    minimUK=(edtValue)*253.40457404;
			    tonregister=(edtValue)*0.0000052972;
			    ccf=(edtValue)*0.0000052972;
			    hundresdcubicfoot=(edtValue)*0.0000052972;
			    acrefoot=(edtValue)*1.21606979E-8;
			    acrefootUSsurvey=(edtValue)*1.216062494E-8;
			    
			    
			    
			    acreinch=(edtValue)*1.459283748E-7;
			    dekastere=(edtValue)*0.0000015;
			    stere=(edtValue)*0.000015;
			    decistere=(edtValue)*0.00015;
			    cord=(edtValue)*0.0000041384;
			    tun=(edtValue)*0.0000157245;
			    hogshead=(edtValue)*0.0000628981;
			    boardfoot=(edtValue)*0.00635664;
			    dram=(edtValue)*4.0576827242;
			    cor=(edtValue)*0.0000681818;
			    homerBiblical=(edtValue)*0.0000681818;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.0006818182;
			    hinBiblical=(edtValue)*0.0040909091;
			    cabBiblical=(edtValue)*0.0122727273;
			    logBiblical=(edtValue)*0.0490909091;
			    TazaSpanish=(edtValue)*0.0634012926;
			    Earthsvolume=(edtValue)*1.385041551E-26;
			    
	  			break;
				
	  			
		 case "Tablespoon(UK) - tblsp":
	  			
			    cubicmeter=(edtValue)*0.0000177582;
			    cubickilometer=(edtValue)*1.775816406E-14 ;
			    cubiccentimeter=(edtValue)*17.758164063;
			    cubicmillimeter=(edtValue)*17758.164063;
			    liter=(edtValue)*0.0177581641;
			    milliliter=(edtValue)*17.758164063;
			    gallon=(edtValue)*0.0046912106;
			    quart=(edtValue)*0.0187648426;
			    pintUS=(edtValue)*0.0375296852;
			    cupUS=(edtValue)*0.0750593703;
			    tablespoonUS=(edtValue)*1.2009499255;
			    teaspoonUS=(edtValue)*3.6028497765;
			    cubicmile=(edtValue)*4.260410127E-15;
			    cubicyard=(edtValue)*0.0000232268;
			    cubicfoot=(edtValue)*0.0006271236;
			    cubicinch=(edtValue)*1.0836696593;
			    cubicdecimeter=(edtValue)*0.0177581641;
			    exaliter=(edtValue)*1.775816406E-20;
			    petaliter=(edtValue)*1.775816406E-17;
			    teraliter=(edtValue)*1.775816406E-14;
			    gigaliter=(edtValue)*1.775816406E-11;
			    megaliter=(edtValue)*1.775816406E-8;
			    kiloliter=(edtValue)*0.0000177582;
			    hectoliter=(edtValue)*0.0001775816;
			    dekaliter=(edtValue)*0.0017758164;
			    deciliter=(edtValue)*0.1775816406;
			    centiliter=(edtValue)*1.7758164063;
			    microliter=(edtValue)*17758.164063;
			    nanoliter=(edtValue)*17758164.063;
			    picoliter=(edtValue)*17758164063.0;
			    femtoliter=(edtValue)*17758164062500.0;
			    attoliter=(edtValue)*17758164062500148.0;
			    cc=(edtValue)*17.758164063;
	  			
			    drop=(edtValue)*355.16328125;
			    barreloil=(edtValue)*0.0001116955 ;
			    barrelUS=(edtValue)*0.0001489273;
			    barrelUK=(edtValue)*0.0001085069;
			    gallonUK=(edtValue)*0.00390625;
			    quartUK=(edtValue)*0.015625;
			    pintUK=(edtValue)*0.03125;
			    cupmetric=(edtValue)*0.0710326563;
			    cupUK=(edtValue)*0.0625;
			    fluidounceUS=(edtValue)*0.6004749628;
			    fluidounceUK=(edtValue)*0.625;
			    tablespoonmetric=(edtValue)*1.1838776042;
			    tablespoonUK=(edtValue)*1;
			    dessertspoonUS=(edtValue)*1.8014248883;
	  			
			    dessertspoonUK=(edtValue)*1.5;
			    teaspoonmetric=(edtValue)*3.5516328125;
			    teaspoonUK=(edtValue)*3;
			    gillUS=(edtValue)*0.1501187407;
			    gillUK=(edtValue)*0.125;
			    minimUS=(edtValue)*288.22798212;
			    minimUK=(edtValue)*300;
			    tonregister=(edtValue)*0.0000062712;
			    ccf=(edtValue)*0.0000062712;
			    hundresdcubicfoot=(edtValue)*0.0000062712;
			    acrefoot=(edtValue)*1.43967779E-8;
			    acrefootUSsurvey=(edtValue)*1.439669152E-8;
			    
			    
			    
			    acreinch=(edtValue)*1.727613348E-7;
			    dekastere=(edtValue)*0.0000017758;
			    stere=(edtValue)*0.0000177582;
			    decistere=(edtValue)*0.0001775816;
			    cord=(edtValue)*0.0000048994;
			    tun=(edtValue)*0.0000186159;
			    hogshead=(edtValue)*0.0000744637;
			    boardfoot=(edtValue)*0.0075254837;
			    dram=(edtValue)*4.803799702;
			    cor=(edtValue)*0.0000807189;
			    homerBiblical=(edtValue)*0.0000807189;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.0008071893;
			    hinBiblical=(edtValue)*0.0048431357;
			    cabBiblical=(edtValue)*0.014529407;
			    logBiblical=(edtValue)*0.0581176278;
			    TazaSpanish=(edtValue)*0.0750593703;
			    Earthsvolume=(edtValue)*1.639719673E-26;
			    
	  			break;
				
	  			
		 case "Dessertspoon(US) - dsp":
	  			
			    cubicmeter=(edtValue)*0.0000098578;
			    cubickilometer=(edtValue)* 9.857843187E-15;
			    cubiccentimeter=(edtValue)*9.8578431875;
			    cubicmillimeter=(edtValue)*9857.8431875;
			    liter=(edtValue)*0.0098578432;
			    milliliter=(edtValue)*9.8578431875;
			    gallon=(edtValue)*0.0026041667;
			    quart=(edtValue)*0.0104166667;
			    pintUS=(edtValue)*0.0208333333;
			    cupUS=(edtValue)*0.0416666667;
			    tablespoonUS=(edtValue)*0.6666666667;
			    teaspoonUS=(edtValue)*2;
			    cubicmile=(edtValue)*2.365022352E-15;
			    cubicyard=(edtValue)*0.0000128936;
			    cubicfoot=(edtValue)*0.0003481264;
			    cubicinch=(edtValue)*0.6015625;
			    cubicdecimeter=(edtValue)*0.0098578432;
			    exaliter=(edtValue)*9.857843187E-21;
			    petaliter=(edtValue)*9.857843187E-18;
			    teraliter=(edtValue)*9.857843187E-15;
			    gigaliter=(edtValue)*9.857843187E-12;
			    megaliter=(edtValue)*9.857843187E-9;
			    kiloliter=(edtValue)*0.0000098578;
			    hectoliter=(edtValue)*0.0000985784;
			    dekaliter=(edtValue)*0.0009857843;
			    deciliter=(edtValue)*0.0985784319;
			    centiliter=(edtValue)*0.9857843187;
			    microliter=(edtValue)*9857.8431875;
			    nanoliter=(edtValue)*9857843.1875;
			    picoliter=(edtValue)*9857843187.5;
			    femtoliter=(edtValue)*9857843187500.0;
			    attoliter=(edtValue)*9857843187499902.0;
			    cc=(edtValue)*9.8578431875;
	  			
			    drop=(edtValue)*197.15686375;
			    barreloil=(edtValue)*0.000062004 ;
			    barrelUS=(edtValue)*0.000082672;
			    barrelUK=(edtValue)*0.000060234;
			    gallonUK=(edtValue)*0.0021684224;
			    quartUK=(edtValue)*0.0086736894;
			    pintUK=(edtValue)*0.0173473788;
			    cupmetric=(edtValue)*0.0394313727;
			    cupUK=(edtValue)*0.0346947577;
			    fluidounceUS=(edtValue)*0.3333333333;
			    fluidounceUK=(edtValue)*0.3469475769;
			    tablespoonmetric=(edtValue)*0.6571895458;
			    tablespoonUK=(edtValue)*0.5551161231;
			    dessertspoonUS=(edtValue)*1;
	  			
			    dessertspoonUK=(edtValue)*0.8326741846;
			    teaspoonmetric=(edtValue)*1.9715686375;
			    teaspoonUK=(edtValue)*1.6653483693;
			    gillUS=(edtValue)*0.0833333333;
			    gillUK=(edtValue)*0.0693895154;
			    minimUS=(edtValue)*160;
			    minimUK=(edtValue)*166.53483693;
			    tonregister=(edtValue)*0.0000034813;
			    ccf=(edtValue)*0.0000034813;
			    hundresdcubicfoot=(edtValue)*0.0000034813;
			    acrefoot=(edtValue)*7.991883534E-9;
			    acrefootUSsurvey=(edtValue)*7.991835583E-9;
			    
			    
			    
			    acreinch=(edtValue)*9.590260241E-8;
			    dekastere=(edtValue)*9.857843187E-7;
			    stere=(edtValue)*0.0000098578;
			    decistere=(edtValue)*0.0000985784;
			    cord=(edtValue)*0.0000027197;
			    tun=(edtValue)*0.000010334;
			    hogshead=(edtValue)*0.000041336;
			    boardfoot=(edtValue)*0.0041775174;
			    dram=(edtValue)*0.0041775174;
			    cor=(edtValue)*0.0000448084;
			    homerBiblical=(edtValue)*0.0000448084;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.0004480838;
			    hinBiblical=(edtValue)*0.0026885027;
			    cabBiblical=(edtValue)*0.0080655081;
			    logBiblical=(edtValue)*0.0322620322;
			    TazaSpanish=(edtValue)*0.0416666667;
			    Earthsvolume=(edtValue)*9.10234828E-27;
			    
	  			break;
				
	  			
		 case "Dessertspoon(UK) - dsp":
	  			
			    cubicmeter=(edtValue)*0.0000118388;
			    cubickilometer=(edtValue)*1.183877604E-14 ;
			    cubiccentimeter=(edtValue)*11.838776042;
			    cubicmillimeter=(edtValue)*11838.776042;
			    liter=(edtValue)*0.011838776;
			    milliliter=(edtValue)*11.838776042;
			    gallon=(edtValue)*0.0031274738;
			    quart=(edtValue)*0.0125098951;
			    pintUS=(edtValue)*0.0250197901;
			    cupUS=(edtValue)*0.0500395802;
			    tablespoonUS=(edtValue)*0.8006332837;
			    teaspoonUS=(edtValue)*2.401899851;
			    cubicmile=(edtValue)*2.840273418E-15;
			    cubicyard=(edtValue)*0.0000154845;
			    cubicfoot=(edtValue)*0.0004180824;
			    cubicinch=(edtValue)*0.7224464396;
			    cubicdecimeter=(edtValue)*0.011838776;
			    exaliter=(edtValue)*1.183877604E-20;
			    petaliter=(edtValue)*1.183877604E-17;
			    teraliter=(edtValue)*1.183877604E-14;
			    gigaliter=(edtValue)*1.183877604E-11;
			    megaliter=(edtValue)*1.183877604E-8;
			    kiloliter=(edtValue)*0.0000118388;
			    hectoliter=(edtValue)*0.0001183878;
			    dekaliter=(edtValue)*0.0011838776;
			    deciliter=(edtValue)*0.1183877604;
			    centiliter=(edtValue)*1.1838776042;
			    microliter=(edtValue)*11838.776042;
			    nanoliter=(edtValue)*11838776.042;
			    picoliter=(edtValue)*11838776042.0;
			    femtoliter=(edtValue)*11838776041667.0;
			    attoliter=(edtValue)*11838776041666626.0;
			    cc=(edtValue)*11.838776042;
	  			
			    drop=(edtValue)*236.77552083;
			    barreloil=(edtValue)* 0.0000744637;
			    barrelUS=(edtValue)*0.0000992849;
			    barrelUK=(edtValue)*0.000072338;
			    gallonUK=(edtValue)*0.0026041667;
			    quartUK=(edtValue)*0.0026041667;
			    pintUK=(edtValue)*0.0208333333;
			    cupmetric=(edtValue)*0.0473551042;
			    cupUK=(edtValue)*0.0416666667;
			    fluidounceUS=(edtValue)*0.4003166418;
			    fluidounceUK=(edtValue)*0.4166666667;
			    tablespoonmetric=(edtValue)*0.7892517361;
			    tablespoonUK=(edtValue)*0.6666666667;
			    dessertspoonUS=(edtValue)*1.2009499255;
	  			
			    dessertspoonUK=(edtValue)*1;
			    teaspoonmetric=(edtValue)*2.3677552083;
			    teaspoonUK=(edtValue)*2;
			    gillUS=(edtValue)*0.1000791605;
			    gillUK=(edtValue)*0.0833333333;
			    minimUS=(edtValue)*192.15198808;
			    minimUK=(edtValue)*200;
			    tonregister=(edtValue)*0.0000041808;
			    ccf=(edtValue)*0.0000041808;
			    hundresdcubicfoot=(edtValue)*0.0000041808;
			    acrefoot=(edtValue)*9.597851935E-9;
			    acrefootUSsurvey=(edtValue)*9.597794348E-9;
			    
			    
			    
			    acreinch=(edtValue)*1.151742232E-7;
			    dekastere=(edtValue)*0.0000011839;
			    stere=(edtValue)*0.0000118388;
			    decistere=(edtValue)*0.0000118388;
			    cord=(edtValue)*0.0000032663;
			    tun=(edtValue)*0.0000124106;
			    hogshead=(edtValue)*0.0000496424;
			    boardfoot=(edtValue)*0.0050169892;
			    dram=(edtValue)*3.2025331347;
			    cor=(edtValue)*0.0000538126;
			    homerBiblical=(edtValue)*0.0000538126;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.0005381262;
			    hinBiblical=(edtValue)*0.0032287571;
			    cabBiblical=(edtValue)*0.0096862713;
			    logBiblical=(edtValue)*0.0387450852;
			    TazaSpanish=(edtValue)*0.0500395802;
			    Earthsvolume=(edtValue)*1.093146448E-26;
			    
	  			break;
				
	  			
		 case "Teaspoon(Metric) - tsp":
	  			
			    cubicmeter=(edtValue)*0.000005;
			    cubickilometer=(edtValue)*5.E-15 ;
			    cubiccentimeter=(edtValue)*5;
			    cubicmillimeter=(edtValue)*5000;
			    liter=(edtValue)*0.005;
			    milliliter=(edtValue)*5;
			    gallon=(edtValue)*0.0013208603;
			    quart=(edtValue)*0.005283441;
			    pintUS=(edtValue)*0.0105668821;
			    cupUS=(edtValue)*0.0211337642;
			    tablespoonUS=(edtValue)*0.338140227;
			    teaspoonUS=(edtValue)*1.0144206811;
			    cubicmile=(edtValue)*1.199563792E-15;
			    cubicyard=(edtValue)*0.0000065398;
			    cubicfoot=(edtValue)*0.0001765733;
			    cubicinch=(edtValue)*0.3051187205;
			    cubicdecimeter=(edtValue)*0.005;
			    exaliter=(edtValue)*5.E-21;
			    petaliter=(edtValue)*5.E-18;
			    teraliter=(edtValue)*5.E-15;
			    gigaliter=(edtValue)*5.E-12;
			    megaliter=(edtValue)*5.E-9;
			    kiloliter=(edtValue)*0.000005;
			    hectoliter=(edtValue)*0.00005;
			    dekaliter=(edtValue)*0.0005;
			    deciliter=(edtValue)*0.05;
			    centiliter=(edtValue)*0.5;
			    microliter=(edtValue)*5000;
			    nanoliter=(edtValue)*5000000;
			    picoliter=(edtValue)*5000000000.;
			    femtoliter=(edtValue)*5000000000000.0;
			    attoliter=(edtValue)*5000000000000000.0;
			    cc=(edtValue)*5;
	  			
			    drop=(edtValue)*100;
			    barreloil=(edtValue)*0.0000314491 ;
			    barrelUS=(edtValue)*0.0000419321;
			    barrelUK=(edtValue)*0.0000305513;
			    gallonUK=(edtValue)*0.0010998462;
			    quartUK=(edtValue)*0.004399385;
			    pintUK=(edtValue)*0.0087987699;
			    cupmetric=(edtValue)*0.02;
			    cupUK=(edtValue)*0.0175975399;
			    fluidounceUS=(edtValue)*0.1690701135;
			    fluidounceUK=(edtValue)*0.1759753986;
			    tablespoonmetric=(edtValue)*0.3333333333;
			    tablespoonUK=(edtValue)*0.2815606378;
			    dessertspoonUS=(edtValue)*0.5072103405;
	  			
			    dessertspoonUK=(edtValue)*0.4223409567;
			    teaspoonmetric=(edtValue)*1;
			    teaspoonUK=(edtValue)*0.8446819135;
			    gillUS=(edtValue)*0.0422675284;
			    gillUK=(edtValue)*0.0351950797;
			    minimUS=(edtValue)*81.153654484;
			    minimUK=(edtValue)*84.468191347;
			    tonregister=(edtValue)*0.0000017657;
			    ccf=(edtValue)*0.0000017657;
			    hundresdcubicfoot=(edtValue)*0.0000017657;
			    acrefoot=(edtValue)*4.053565968E-9;
			    acrefootUSsurvey=(edtValue)*4.053541647E-9;
			    
			    
			    
			    acreinch=(edtValue)*4.864279162E-8;
			    dekastere=(edtValue)*5.E-7;
			    stere=(edtValue)*0.000005;
			    decistere=(edtValue)*0.00005;
			    cord=(edtValue)*0.0000013795;
			    tun=(edtValue)*0.0000052415;
			    hogshead=(edtValue)*0.000020966;
			    boardfoot=(edtValue)*0.00211888;
			    dram=(edtValue)*1.3525609081;
			    cor=(edtValue)*0.0000227273;
			    homerBiblical=(edtValue)*0.0000227273;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.0002272727;
			    hinBiblical=(edtValue)*0.0013636364;
			    cabBiblical=(edtValue)*0.0040909091;
			    logBiblical=(edtValue)*0.0163636364;
			    TazaSpanish=(edtValue)*0.0211337642;
			    Earthsvolume=(edtValue)*4.61680517E-27;
			    
	  			break;
				
	  			
		 case "Teaspoon(UK) - tsp":
	  			
			    cubicmeter=(edtValue)*0.0000059194;
			    cubickilometer=(edtValue)* 5.91938802E-15;
			    cubiccentimeter=(edtValue)*5.9193880208;
			    cubicmillimeter=(edtValue)*5919.3880208;
			    liter=(edtValue)*0.005919388;
			    milliliter=(edtValue)*5.9193880208;
			    gallon=(edtValue)*0.0015637369;
			    quart=(edtValue)*0.0062549475;
			    pintUS=(edtValue)*0.0125098951;
			    cupUS=(edtValue)*0.0250197901;
			    tablespoonUS=(edtValue)*0.4003166418;
			    teaspoonUS=(edtValue)*1.2009499255;
			    cubicmile=(edtValue)*1.420136709E-15;
			    cubicyard=(edtValue)*0.0000077423;
			    cubicfoot=(edtValue)*0.0002090412;
			    cubicinch=(edtValue)*0.3612232198;
			    cubicdecimeter=(edtValue)*0.005919388;
			    exaliter=(edtValue)*5.91938802E-21;
			    petaliter=(edtValue)*5.91938802E-18;
			    teraliter=(edtValue)*5.91938802E-15;
			    gigaliter=(edtValue)*5.91938802E-12;
			    megaliter=(edtValue)*5.91938802E-9;
			    kiloliter=(edtValue)*0.0000059194;
			    hectoliter=(edtValue)*0.0000591939;
			    dekaliter=(edtValue)*0.0005919388;
			    deciliter=(edtValue)*0.0591938802;
			    centiliter=(edtValue)*0.5919388021;
			    microliter=(edtValue)*5919.3880208;
			    nanoliter=(edtValue)*5919388.0208;
			    picoliter=(edtValue)*5919388020.8;
			    femtoliter=(edtValue)*5919388020833.0;
			    attoliter=(edtValue)*5919388020833314.0;
			    cc=(edtValue)*5.9193880208;
	  			
			    drop=(edtValue)*118.38776042;
			    barreloil=(edtValue)*0.0000372318 ;
			    barrelUS=(edtValue)*0.0000496424;
			    barrelUK=(edtValue)*0.000036169;
			    gallonUK=(edtValue)*0.0013020833;
			    quartUK=(edtValue)*0.0052083333;
			    pintUK=(edtValue)*0.0104166667;
			    cupmetric=(edtValue)*0.0236775521;
			    cupUK=(edtValue)*0.0208333333;
			    fluidounceUS=(edtValue)*0.2001583209;
			    fluidounceUK=(edtValue)*0.2083333333;
			    tablespoonmetric=(edtValue)*0.3946258681;
			    tablespoonUK=(edtValue)*0.3333333333;
			    dessertspoonUS=(edtValue)*0.6004749628;
	  			
			    dessertspoonUK=(edtValue)*0.5;
			    teaspoonmetric=(edtValue)*1.1838776042;
			    teaspoonUK=(edtValue)*1;
			    gillUS=(edtValue)*0.0500395802;
			    gillUK=(edtValue)*0.0416666667;
			    minimUS=(edtValue)*96.07599404;
			    minimUK=(edtValue)*100;
			    tonregister=(edtValue)*0.0000020904;
			    ccf=(edtValue)*0.0000020904;
			    hundresdcubicfoot=(edtValue)*0.0000020904;
			    acrefoot=(edtValue)*4.798925967E-9;
			    acrefootUSsurvey=(edtValue)*4.798897174E-9;
			    
			    
			    
			    acreinch=(edtValue)*5.758711161E-8;
			    dekastere=(edtValue)*5.91938802E-7;
			    stere=(edtValue)*0.0000059194;
			    decistere=(edtValue)*0.0000591939;
			    cord=(edtValue)*0.0000016331;
			    tun=(edtValue)*0.0000062053;
			    hogshead=(edtValue)*0.0000248212;
			    boardfoot=(edtValue)*0.0025084946;
			    dram=(edtValue)*1.6012665673;
			    cor=(edtValue)*0.0000269063;
			    homerBiblical=(edtValue)*0.0000269063;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.0002690631;
			    hinBiblical=(edtValue)*0.0016143786;
			    cabBiblical=(edtValue)*0.0048431357;
			    logBiblical=(edtValue)*0.0193725426;
			    TazaSpanish=(edtValue)*0.0250197901;
			    Earthsvolume=(edtValue)*5.465732244E-27;
			    
	  			break;

				
			 case "Gill(US)  - gi":
		  			
				    cubicmeter=(edtValue)*0.0001182941;
				    cubickilometer=(edtValue)*1.182941182E-13 ;
				    cubiccentimeter=(edtValue)*1.182941182E-13;
				    cubicmillimeter=(edtValue)*118294.11825;
				    liter=(edtValue)*0.1182941182;
				    milliliter=(edtValue)*118.29411825;
				    gallon=(edtValue)*0.03125;
				    quart=(edtValue)*0.125;
				    pintUS=(edtValue)*0.25;
				    cupUS=(edtValue)*0.5;
				    tablespoonUS=(edtValue)*8;
				    teaspoonUS=(edtValue)*24;
				    cubicmile=(edtValue)*2.838026823E-14;
				    cubicyard=(edtValue)*0.0001547229;
				    cubicfoot=(edtValue)*0.0041775174;
				    cubicinch=(edtValue)*7.21875;
				    cubicdecimeter=(edtValue)*0.1182941182;
				    exaliter=(edtValue)*1.182941182E-19;
				    petaliter=(edtValue)*1.182941182E-16;
				    teraliter=(edtValue)*1.182941182E-13;
				    gigaliter=(edtValue)*1.182941182E-10;
				    megaliter=(edtValue)*1.182941182E-7;
				    kiloliter=(edtValue)*0.0001182941;
				    hectoliter=(edtValue)*0.0011829412;
				    dekaliter=(edtValue)*0.0118294118;
				    deciliter=(edtValue)*1.1829411825;
				    centiliter=(edtValue)*11.829411825;
				    microliter=(edtValue)*118294.11825;
				    nanoliter=(edtValue)*118294118.25;
				    picoliter=(edtValue)*118294118250.0;
				    femtoliter=(edtValue)*118294118249999.0;
				    attoliter=(edtValue)*118294118249999280.0;
				    cc=(edtValue)*118.29411825;
		  			
				    drop=(edtValue)*2365.882365;
				    barreloil=(edtValue)*0.0007440476 ;
				    barrelUS=(edtValue)*0.0009920635;
				    barrelUK=(edtValue)*0.0007228075;
				    gallonUK=(edtValue)*0.0260210683;
				    quartUK=(edtValue)*0.1040842731;
				    pintUK=(edtValue)*0.2081685462;
				    cupmetric=(edtValue)*0.473176473;
				    cupUK=(edtValue)*0.4163370923;
				    fluidounceUS=(edtValue)*4;
				    fluidounceUK=(edtValue)*4.1633709231;
				    tablespoonmetric=(edtValue)*7.88627455;
				    tablespoonUK=(edtValue)*6.661393477;
				    dessertspoonUS=(edtValue)*12;
		  			
				    dessertspoonUK=(edtValue)*9.9920902155;
				    teaspoonmetric=(edtValue)*23.65882365;
				    teaspoonUK=(edtValue)*19.984180431;
				    gillUS=(edtValue)*1;
				    gillUK=(edtValue)*0.8326741846;
				    minimUS=(edtValue)*1920;
				    minimUK=(edtValue)*1998.4180431;
				    tonregister=(edtValue)*0.0000417752;
				    ccf=(edtValue)*0.0000417752;
				    hundresdcubicfoot=(edtValue)*0.0000417752;
				    acrefoot=(edtValue)*9.590260241E-8;
				    acrefootUSsurvey=(edtValue)*9.590202699E-8;
				    
				    
				    
				    acreinch=(edtValue)*0.0000011508;
				    dekastere=(edtValue)*0.0000118294;
				    stere=(edtValue)*0.0001182941;
				    decistere=(edtValue)*0.0011829412;
				    cord=(edtValue)*0.0000326369;
				    tun=(edtValue)*0.0001240079;
				    hogshead=(edtValue)*0.0004960317;
				    boardfoot=(edtValue)*0.0501302083;
				    dram=(edtValue)*32;
				    cor=(edtValue)*0.0005377005;
				    homerBiblical=(edtValue)*0.0005377005;
		  			
		  			
				    
				    bathBiblical=(edtValue)*0.0053770054;
				    hinBiblical=(edtValue)*0.0322620322;
				    cabBiblical=(edtValue)*0.0967860967;
				    logBiblical=(edtValue)*0.387144387;
				    TazaSpanish=(edtValue)*0.5;
				    Earthsvolume=(edtValue)*1.092281793E-25;
				    
		  			break;
					
			 case "Gill(UK)  - gi":
		  			
				    cubicmeter=(edtValue)*0.0001420653;
				    cubickilometer=(edtValue)*1.420653125E-13 ;
				    cubiccentimeter=(edtValue)*142.0653125;
				    cubicmillimeter=(edtValue)*142065.3125;
				    liter=(edtValue)*0.1420653125;
				    milliliter=(edtValue)*142.0653125;
				    gallon=(edtValue)*0.0375296852;
				    quart=(edtValue)*0.1501187407;
				    pintUS=(edtValue)*0.3002374814;
				    cupUS=(edtValue)*0.6004749628;
				    tablespoonUS=(edtValue)*9.607599404;
				    teaspoonUS=(edtValue)*28.822798212;
				    cubicmile=(edtValue)*3.408328102E-14;
				    cubicyard=(edtValue)*0.0001858144;
				    cubicfoot=(edtValue)*0.0050169892;
				    cubicinch=(edtValue)*8.6693572747;
				    cubicdecimeter=(edtValue)*0.1420653125;
				    exaliter=(edtValue)*1.420653125E-19;
				    petaliter=(edtValue)*1.420653125E-16;
				    teraliter=(edtValue)*1.420653125E-13;
				    gigaliter=(edtValue)*1.420653125E-10;
				    megaliter=(edtValue)*1.420653125E-7;
				    kiloliter=(edtValue)*0.0001420653;
				    hectoliter=(edtValue)*0.0014206531;
				    dekaliter=(edtValue)*0.0142065313;
				    deciliter=(edtValue)*1.420653125;
				    centiliter=(edtValue)*14.20653125;
				    microliter=(edtValue)*142065.3125;
				    nanoliter=(edtValue)*142065312.5;
				    picoliter=(edtValue)*142065312500.0;
				    femtoliter=(edtValue)*142065312500000.0;
				    attoliter=(edtValue)*142065312500000180.0;
				    cc=(edtValue)*142.0653125;
		  			
				    drop=(edtValue)*2841.30625;
				    barreloil=(edtValue)*0.0008935639 ;
				    barrelUS=(edtValue)*0.0011914186;
				    barrelUK=(edtValue)*0.0008680556;
				    gallonUK=(edtValue)*0.03125;
				    quartUK=(edtValue)*0.125;
				    pintUK=(edtValue)*0.25;
				    cupmetric=(edtValue)*0.56826125;
				    cupUK=(edtValue)*0.5;
				    fluidounceUS=(edtValue)*4.803799702;
				    fluidounceUK=(edtValue)*5;
				    tablespoonmetric=(edtValue)*9.4710208333;
				    tablespoonUK=(edtValue)*8;
				    dessertspoonUS=(edtValue)*14.411399106;
		  			
				    dessertspoonUK=(edtValue)*12;
				    teaspoonmetric=(edtValue)*28.4130625;
				    teaspoonUK=(edtValue)*24;
				    gillUS=(edtValue)*1.2009499255;
				    gillUK=(edtValue)*1;
				    minimUS=(edtValue)*2305.823857;
				    minimUK=(edtValue)*2400;
				    tonregister=(edtValue)*0.0000501699;
				    ccf=(edtValue)*0.0000501699;
				    hundresdcubicfoot=(edtValue)*0.0000501699;
				    acrefoot=(edtValue)*1.151742232E-7;
				    acrefootUSsurvey=(edtValue)*1.151735321E-7;
				    
				    acreinch=(edtValue)*0.0000013821;
				    dekastere=(edtValue)*0.0000142065;
				    stere=(edtValue)*0.0001420653;
				    decistere=(edtValue)*0.0014206531;
				    cord=(edtValue)*0.0000391952;
				    tun=(edtValue)*0.0001489273;
				    hogshead=(edtValue)*0.0005957093;
				    boardfoot=(edtValue)*0.06020387;
				    dram=(edtValue)*38.430397616;
				    cor=(edtValue)*0.0006457514;
				    homerBiblical=(edtValue)*0.0006457514;
				    bathBiblical=(edtValue)*0.0064575142;
				    hinBiblical=(edtValue)*0.0387450852;
				    cabBiblical=(edtValue)*0.1162352557;
				    logBiblical=(edtValue)*0.4649410227;
				    TazaSpanish=(edtValue)*0.6004749628;
				    Earthsvolume=(edtValue)*1.311775738E-25;
				    
		  			break;

		 case "Minim(US)  - min":
	  			
			    cubicmeter=(edtValue)*6.161151992E-8;
			    cubickilometer=(edtValue)* 6.161151992E-17;
			    cubiccentimeter=(edtValue)*0.0616115199;
			    cubicmillimeter=(edtValue)*61.611519922;
			    liter=(edtValue)*0.0000616115;
			    milliliter=(edtValue)*0.0616115199;
			    gallon=(edtValue)*0.000016276;
			    quart=(edtValue)*0.0000651042;
			    pintUS=(edtValue)*0.0001302083;
			    cupUS=(edtValue)*0.0002604167;
			    tablespoonUS=(edtValue)*0.0041666667;
			    teaspoonUS=(edtValue)*0.0125;
			    cubicmile=(edtValue)*1.47813897E-17;
			    cubicyard=(edtValue)*8.058482563E-8;
			    cubicfoot=(edtValue)*0.0000021758;
			    cubicinch=(edtValue)*0.0037597656;
			    cubicdecimeter=(edtValue)*0.0000616115;
			    exaliter=(edtValue)*6.161151992E-23;
			    petaliter=(edtValue)*6.161151992E-20;
			    teraliter=(edtValue)*6.161151992E-17;
			    gigaliter=(edtValue)*6.161151992E-14;
			    megaliter=(edtValue)*6.161151992E-11;
			    kiloliter=(edtValue)*6.161151992E-8;
			    hectoliter=(edtValue)*6.161151992E-7;
			    dekaliter=(edtValue)*0.0000061612;
			    deciliter=(edtValue)*0.0006161152;
			    centiliter=(edtValue)*0.006161152;
			    microliter=(edtValue)*61.611519922;
			    nanoliter=(edtValue)*61611.519922;
			    picoliter=(edtValue)*61611519.922;
			    femtoliter=(edtValue)*61611519922.0;
			    attoliter=(edtValue)*61611519921874.0;
			    cc=(edtValue)*0.0616115199;
	  			
			    drop=(edtValue)*1.2322303984;
			    barreloil=(edtValue)* 3.875248015E-7;
			    barrelUS=(edtValue)*5.166997354E-7;
			    barrelUK=(edtValue)*3.764622145E-7;
			    gallonUK=(edtValue)*0.0000135526;
			    quartUK=(edtValue)*0.0000542106;
			    pintUK=(edtValue)*0.0001084211;
			    cupmetric=(edtValue)*0.0002464461;
			    cupUK=(edtValue)*0.0002168422;
			    fluidounceUS=(edtValue)*0.0020833333;
			    fluidounceUK=(edtValue)*0.0021684224;
			    tablespoonmetric=(edtValue)*0.0041074347;
			    tablespoonUK=(edtValue)*0.0034694758;
			    dessertspoonUS=(edtValue)*0.00625;
	  			
			    dessertspoonUK=(edtValue)*0.0052042137;
			    teaspoonmetric=(edtValue)*0.012322304;
			    teaspoonUK=(edtValue)*0.0104084273;
			    gillUS=(edtValue)*0.0005208333;
			    gillUK=(edtValue)*0.0004336845;
			    minimUS=(edtValue)*0.0004336845;
			    minimUK=(edtValue)*1;
			    tonregister=(edtValue)*1.0408427308;
			    ccf=(edtValue)*2.175790292E-8;
			    hundresdcubicfoot=(edtValue)*2.175790292E-8;
			    acrefoot=(edtValue)*4.994927209E-11;
			    acrefootUSsurvey=(edtValue)*4.994897239E-11;
			    
			    
			    
			    acreinch=(edtValue)*5.99391265E-10;
			    dekastere=(edtValue)*6.161151992E-9;
			    stere=(edtValue)*6.161151992E-8;
			    decistere=(edtValue)*6.161151992E-7;
			    cord=(edtValue)*1.699836165E-8;
			    tun=(edtValue)*6.458746693E-8;
			    hogshead=(edtValue)*2.583498677E-7;
			    boardfoot=(edtValue)*0.0000261095;
			    dram=(edtValue)*0.0166666667;
			    cor=(edtValue)*2.800523632E-7;
			    homerBiblical=(edtValue)*2.800523632E-7;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.0000028005;
			    hinBiblical=(edtValue)*0.0000168031;
			    cabBiblical=(edtValue)*0.0000504094;
			    logBiblical=(edtValue)*0.0002016377;
			    TazaSpanish=(edtValue)*0.0002604167;
			    Earthsvolume=(edtValue)*5.688967675E-29;
			    
	  			break;
				
	  			
		 case "Minim(UK)  - min":
	  			
			    cubicmeter=(edtValue)*5.91938802E-8;
			    cubickilometer=(edtValue)* 5.91938802E-17;
			    cubiccentimeter=(edtValue)*0.0591938802;
			    cubicmillimeter=(edtValue)*59.193880208;
			    liter=(edtValue)*0.0000591939;
			    milliliter=(edtValue)*0.0591938802;
			    gallon=(edtValue)*0.0000156374;
			    quart=(edtValue)*0.0000625495;
			    pintUS=(edtValue)*0.000125099;
			    cupUS=(edtValue)*0.0002501979;
			    tablespoonUS=(edtValue)*0.0040031664;
			    teaspoonUS=(edtValue)*0.0120094993;
			    cubicmile=(edtValue)*1.420136709E-17;
			    cubicyard=(edtValue)*7.742267227E-8;
			    cubicfoot=(edtValue)*0.0000020904;
			    cubicinch=(edtValue)*0.0036122322;
			    cubicdecimeter=(edtValue)*0.0000591939;
			    exaliter=(edtValue)*5.91938802E-23;
			    petaliter=(edtValue)*5.91938802E-20;
			    teraliter=(edtValue)*5.91938802E-17;
			    gigaliter=(edtValue)*5.91938802E-14;
			    megaliter=(edtValue)*5.91938802E-11;
			    kiloliter=(edtValue)*5.91938802E-8;
			    hectoliter=(edtValue)*5.91938802E-7;
			    dekaliter=(edtValue)*0.0000059194;
			    deciliter=(edtValue)*0.0005919388;
			    centiliter=(edtValue)*0.005919388;
			    microliter=(edtValue)*59.193880208;
			    nanoliter=(edtValue)*59193.880208;
			    picoliter=(edtValue)*59193880.208;
			    femtoliter=(edtValue)*59193880208.0;
			    attoliter=(edtValue)*59193880208333.0;
			    cc=(edtValue)*0.0591938802;
	  			
			    drop=(edtValue)*1.1838776042;
			    barreloil=(edtValue)* 3.723183052E-7;
			    barrelUS=(edtValue)*4.96424407E-7;
			    barrelUK=(edtValue)*3.616898148E-7;
			    gallonUK=(edtValue)*0.0000130208;
			    quartUK=(edtValue)*0.0000520833;
			    pintUK=(edtValue)*0.0001041667;
			    cupmetric=(edtValue)*0.0002367755;
			    cupUK=(edtValue)*0.0002083333;
			    fluidounceUS=(edtValue)*0.0020015832;
			    fluidounceUK=(edtValue)*0.0020833333;
			    tablespoonmetric=(edtValue)*0.0039462587;
			    tablespoonUK=(edtValue)*0.0033333333;
			    dessertspoonUS=(edtValue)*0.0060047496;
	  			
			    dessertspoonUK=(edtValue)*0.005;
			    teaspoonmetric=(edtValue)*0.011838776;
			    teaspoonUK=(edtValue)*0.01;
			    gillUS=(edtValue)*0.0005003958;
			    gillUK=(edtValue)*0.0004166667;
			    minimUS=(edtValue)*0.9607599404;
			    minimUK=(edtValue)*1;
			    tonregister=(edtValue)*2.090412151E-8;
			    ccf=(edtValue)*2.090412151E-8;
			    hundresdcubicfoot=(edtValue)*2.090412151E-8;
			    acrefoot=(edtValue)*4.798925967E-11;
			    acrefootUSsurvey=(edtValue)*4.798897174E-11;
			    
			    
			    
			    acreinch=(edtValue)*5.758711161E-10;
			    dekastere=(edtValue)*5.91938802E-9;
			    stere=(edtValue)*5.91938802E-8;
			    decistere=(edtValue)*5.91938802E-7;
			    cord=(edtValue)*1.633134493E-8;
			    tun=(edtValue)*6.205305087E-8;
			    hogshead=(edtValue)*2.482122035E-7;
			    boardfoot=(edtValue)*0.0000250849;
			    dram=(edtValue)*0.0160126657;
			    cor=(edtValue)*2.690630918E-7;
			    homerBiblical=(edtValue)*2.690630918E-7;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.0000026906;
			    hinBiblical=(edtValue)*0.0000161438;
			    cabBiblical=(edtValue)*0.0000484314;
			    logBiblical=(edtValue)*0.0001937254;
			    TazaSpanish=(edtValue)*0.0002501979;
			    Earthsvolume=(edtValue)*5.465732244E-29;
			    
	  			break;
				
	  			
		 case "Ton register - ton reg":
	  			
			    cubicmeter=(edtValue)*2.8316846592;
			    cubickilometer=(edtValue)*2.831684659E-9 ;
			    cubiccentimeter=(edtValue)*2831684.6592;
			    cubicmillimeter=(edtValue)*2831684659.2;
			    liter=(edtValue)*2831.6846592;
			    milliliter=(edtValue)*2831684.6592;
			    gallon=(edtValue)*748.05194805;
			    quart=(edtValue)*2992.2077922;
			    pintUS=(edtValue)*5984.4155844;
			    cupUS=(edtValue)*11968.831169;
			    tablespoonUS=(edtValue)*191501.2987;
			    teaspoonUS=(edtValue)*574503.8961;
			    cubicmile=(edtValue)*6.79357278E-10;
			    cubicyard=(edtValue)*3.7037037037;
			    cubicfoot=(edtValue)*100;
			    cubicinch=(edtValue)*172800;
			    cubicdecimeter=(edtValue)*2831.6846592;
			    exaliter=(edtValue)*2.831684659E-15;
			    petaliter=(edtValue)*2.831684659E-12;
			    teraliter=(edtValue)*2.831684659E-9;
			    gigaliter=(edtValue)*0.0000028317;
			    megaliter=(edtValue)*0.0028316847;
			    kiloliter=(edtValue)*2.8316846592;
			    hectoliter=(edtValue)*28.316846592;
			    dekaliter=(edtValue)*283.16846592;
			    deciliter=(edtValue)*28316.846592;
			    centiliter=(edtValue)*283168.46592;
			    microliter=(edtValue)*2831684659.2;
			    nanoliter=(edtValue)*2831684659200.0;
			    picoliter=(edtValue)*2831684659199968.0;
			    femtoliter=(edtValue)*2831684659199967000.0;
			    attoliter=(edtValue)*2.831684659E+21;
			    cc=(edtValue)*2831684.6592;
	  			
			    drop=(edtValue)*56633693.184;
			    barreloil=(edtValue)*17.810760668 ;
			    barrelUS=(edtValue)*23.747680891;
			    barrelUK=(edtValue)*17.30232072;
			    gallonUK=(edtValue)*622.8835459;
			    quartUK=(edtValue)*2491.5341836;
			    pintUK=(edtValue)*4983.0683672;
			    cupmetric=(edtValue)*11326.738637;
			    cupUK=(edtValue)*9966.1367345;
			    fluidounceUS=(edtValue)*95750.649351;
			    fluidounceUK=(edtValue)*99661.367345;
			    tablespoonmetric=(edtValue)*188778.97728;
			    tablespoonUK=(edtValue)*159458.18775;
			    dessertspoonUS=(edtValue)*287251.94805;
	  			
			    dessertspoonUK=(edtValue)*239187.28163;
			    teaspoonmetric=(edtValue)*566336.93184;
			    teaspoonUK=(edtValue)*478374.56325;
			    gillUS=(edtValue)*23937.662338;
			    gillUK=(edtValue)*19932.273469;
			    minimUS=(edtValue)*45960311.688;
			    minimUK=(edtValue)*47837456.325;
			    tonregister=(edtValue)*1;
			    ccf=(edtValue)*1;
			    hundresdcubicfoot=(edtValue)*1;
			    acrefoot=(edtValue)*0.0022956841;
			    acrefootUSsurvey=(edtValue)*0.0022956703;
			    
			    
			    
			    acreinch=(edtValue)*0.0022956703;
			    dekastere=(edtValue)*0.2831684659;
			    stere=(edtValue)*2.8316846592;
			    decistere=(edtValue)*28.316846592;
			    cord=(edtValue)*0.78125;
			    tun=(edtValue)*2.9684601113;
			    hogshead=(edtValue)*11.873840445;
			    boardfoot=(edtValue)*1200;
			    dram=(edtValue)*766005.19481;
			    cor=(edtValue)*12.871293905;
			    homerBiblical=(edtValue)*12.871293905;
	  			
	  			
			    
			    bathBiblical=(edtValue)*128.71293905;
			    hinBiblical=(edtValue)*772.27763433;
			    cabBiblical=(edtValue)*2316.832903;
			    logBiblical=(edtValue)*9267.3316119;
			    TazaSpanish=(edtValue)*11968.831169;
			    Earthsvolume=(edtValue)*2.614667275E-21;
			    
	  			break;
				
	  			
		 case "Ccf  - ccf":
	  			
			    cubicmeter=(edtValue)*2.8316846592;
			    cubickilometer=(edtValue)*2.831684659E-9 ;
			    cubiccentimeter=(edtValue)*2831684.6592;
			    cubicmillimeter=(edtValue)*2831684659.2;
			    liter=(edtValue)*2831.6846592;
			    milliliter=(edtValue)*2831684.6592;
			    gallon=(edtValue)*748.05194805;
			    quart=(edtValue)*2992.2077922;
			    pintUS=(edtValue)*5984.4155844;
			    cupUS=(edtValue)*11968.831169;
			    tablespoonUS=(edtValue)*191501.2987;
			    teaspoonUS=(edtValue)*574503.8961;
			    cubicmile=(edtValue)*6.79357278E-10;
			    cubicyard=(edtValue)*3.7037037037;
			    cubicfoot=(edtValue)*100;
			    cubicinch=(edtValue)*172800;
			    cubicdecimeter=(edtValue)*2831.6846592;
			    exaliter=(edtValue)*2.831684659E-15;
			    petaliter=(edtValue)*2.831684659E-12;
			    teraliter=(edtValue)*2.831684659E-9;
			    gigaliter=(edtValue)*0.0000028317;
			    megaliter=(edtValue)*0.0028316847;
			    kiloliter=(edtValue)*2.8316846592;
			    hectoliter=(edtValue)*28.316846592;
			    dekaliter=(edtValue)*283.16846592;
			    deciliter=(edtValue)*28316.846592;
			    centiliter=(edtValue)*283168.46592;
			    microliter=(edtValue)*2831684659.2;
			    nanoliter=(edtValue)*2831684659200.0;
			    picoliter=(edtValue)*2831684659199968.0;
			    femtoliter=(edtValue)*2831684659199967000.0;
			    attoliter=(edtValue)*2.831684659E+21;
			    cc=(edtValue)*2831684.6592;
	  			
			    drop=(edtValue)*56633693.184;
			    barreloil=(edtValue)* 17.810760668;
			    barrelUS=(edtValue)*23.747680891;
			    barrelUK=(edtValue)*17.30232072;
			    gallonUK=(edtValue)*622.8835459;
			    quartUK=(edtValue)*2491.5341836;
			    pintUK=(edtValue)*4983.0683672;
			    cupmetric=(edtValue)*11326.738637;
			    cupUK=(edtValue)*9966.1367345;
			    fluidounceUS=(edtValue)*95750.649351;
			    fluidounceUK=(edtValue)*99661.367345;
			    tablespoonmetric=(edtValue)*188778.97728;
			    tablespoonUK=(edtValue)*159458.18775;
			    dessertspoonUS=(edtValue)*287251.94805;
	  			
			    dessertspoonUK=(edtValue)*239187.28163;
			    teaspoonmetric=(edtValue)*566336.93184;
			    teaspoonUK=(edtValue)*478374.56325;
			    gillUS=(edtValue)*23937.662338;
			    gillUK=(edtValue)*19932.273469;
			    minimUS=(edtValue)*45960311.688;
			    minimUK=(edtValue)*47837456.325;
			    tonregister=(edtValue)*1;
			    ccf=(edtValue)*1;
			    hundresdcubicfoot=(edtValue)*1;
			    acrefoot=(edtValue)*0.0022956841;
			    acrefootUSsurvey=(edtValue)*0.0022956703;
			    
			    
			    
			    acreinch=(edtValue)*0.0275482094;
			    dekastere=(edtValue)*0.2831684659;
			    stere=(edtValue)*2.8316846592;
			    decistere=(edtValue)*28.316846592;
			    cord=(edtValue)*0.78125;
			    tun=(edtValue)*2.9684601113;
			    hogshead=(edtValue)*11.873840445;
			    boardfoot=(edtValue)*1200;
			    dram=(edtValue)*766005.19481;
			    cor=(edtValue)*12.871293905;
			    homerBiblical=(edtValue)*12.871293905;
	  			
	  			
			    
			    bathBiblical=(edtValue)*128.71293905;
			    hinBiblical=(edtValue)*772.27763433;
			    cabBiblical=(edtValue)*2316.832903;
			    logBiblical=(edtValue)*9267.3316119;
			    TazaSpanish=(edtValue)*11968.831169;
			    Earthsvolume=(edtValue)*2.614667275E-21;
			    
	  			break;
				
	  			
		 case "Hundred-cubic foot - 100 ft^3":
	  			
			    cubicmeter=(edtValue)*2.8316846592;
			    cubickilometer=(edtValue)* 2.831684659E-9;
			    cubiccentimeter=(edtValue)*2831684.6592;
			    cubicmillimeter=(edtValue)*2831684659.2;
			    liter=(edtValue)*2831.6846592;
			    milliliter=(edtValue)*2831684.6592;
			    gallon=(edtValue)*748.05194805;
			    quart=(edtValue)*2992.2077922;
			    pintUS=(edtValue)*2992.2077922;
			    cupUS=(edtValue)*11968.831169;
			    tablespoonUS=(edtValue)*191501.2987;
			    teaspoonUS=(edtValue)*574503.8961;
			    cubicmile=(edtValue)*6.79357278E-10;
			    cubicyard=(edtValue)*3.7037037037;
			    cubicfoot=(edtValue)*100;
			    cubicinch=(edtValue)*172800;
			    cubicdecimeter=(edtValue)*2831.6846592;
			    exaliter=(edtValue)*2.831684659E-15;
			    petaliter=(edtValue)*2.831684659E-12;
			    teraliter=(edtValue)*2.831684659E-9;
			    gigaliter=(edtValue)*0.0000028317;
			    megaliter=(edtValue)*0.0028316847;
			    kiloliter=(edtValue)*2.8316846592;
			    hectoliter=(edtValue)*28.316846592;
			    dekaliter=(edtValue)*283.16846592;
			    deciliter=(edtValue)*28316.846592;
			    centiliter=(edtValue)*283168.46592;
			    microliter=(edtValue)*2831684659.2;
			    nanoliter=(edtValue)*2831684659200.0;
			    picoliter=(edtValue)*2831684659199968.0;
			    femtoliter=(edtValue)*2831684659199967000.0;
			    attoliter=(edtValue)*2.831684659E+21;
			    cc=(edtValue)*2831684.6592;
	  			
			    drop=(edtValue)*56633693.184;
			    barreloil=(edtValue)*17.810760668 ;
			    barrelUS=(edtValue)*23.747680891;
			    barrelUK=(edtValue)*17.30232072;
			    gallonUK=(edtValue)*622.8835459;
			    quartUK=(edtValue)*2491.5341836;
			    pintUK=(edtValue)*4983.0683672;
			    cupmetric=(edtValue)*11326.738637;
			    cupUK=(edtValue)*9966.1367345;
			    fluidounceUS=(edtValue)*95750.649351;
			    fluidounceUK=(edtValue)*99661.367345;
			    tablespoonmetric=(edtValue)*188778.97728;
			    tablespoonUK=(edtValue)*159458.18775;
			    dessertspoonUS=(edtValue)*287251.94805;
	  			
			    dessertspoonUK=(edtValue)*239187.28163;
			    teaspoonmetric=(edtValue)*566336.93184;
			    teaspoonUK=(edtValue)*478374.56325;
			    gillUS=(edtValue)*23937.662338;
			    gillUK=(edtValue)*19932.273469;
			    minimUS=(edtValue)*45960311.688;
			    minimUK=(edtValue)*47837456.325;
			    tonregister=(edtValue)*1;
			    ccf=(edtValue)*1;
			    hundresdcubicfoot=(edtValue)*1;
			    acrefoot=(edtValue)*0.0022956841;
			    acrefootUSsurvey=(edtValue)*0.0022956703;
			    
			    
			    
			    acreinch=(edtValue)*0.0275482094;
			    dekastere=(edtValue)*0.2831684659;
			    stere=(edtValue)*2.8316846592;
			    decistere=(edtValue)*28.316846592;
			    cord=(edtValue)*0.78125;
			    tun=(edtValue)*2.9684601113;
			    hogshead=(edtValue)*11.873840445;
			    boardfoot=(edtValue)*1200;
			    dram=(edtValue)*766005.19481;
			    cor=(edtValue)*12.871293905;
			    homerBiblical=(edtValue)*12.871293905;
	  			
	  			
			    
			    bathBiblical=(edtValue)*128.71293905;
			    hinBiblical=(edtValue)*772.27763433;
			    cabBiblical=(edtValue)*2316.832903;
			    logBiblical=(edtValue)*9267.3316119;
			    TazaSpanish=(edtValue)*11968.831169;
			    Earthsvolume=(edtValue)*2.614667275E-21;
			    
	  			break;
				
	  			
		 case "Acre-foot - ac*ft":
	  			
			    cubicmeter=(edtValue)*1233.4818375;
			    cubickilometer=(edtValue)*0.0000012335 ;
			    cubiccentimeter=(edtValue)*1233481837.5;
			    cubicmillimeter=(edtValue)*1233481837548.0;
			    liter=(edtValue)*1233481.8375;
			    milliliter=(edtValue)*1233481837.5;
			    gallon=(edtValue)*325851.42857;
			    quart=(edtValue)*1303405.7143;
			    pintUS=(edtValue)*2606811.4286;
			    cupUS=(edtValue)*5213622.8571;
			    tablespoonUS=(edtValue)*83417965.714;
			    teaspoonUS=(edtValue)*250253897.14;
			    cubicmile=(edtValue)*2.959280303E-7;
			    cubicyard=(edtValue)*1613.3333333;
			    cubicfoot=(edtValue)*43560;
			    cubicinch=(edtValue)*75271680;
			    cubicdecimeter=(edtValue)*1233481.8375;
			    exaliter=(edtValue)*1.233481837E-12;
			    petaliter=(edtValue)*1.233481837E-9;
			    teraliter=(edtValue)*0.0000012335;
			    gigaliter=(edtValue)*0.0012334818;
			    megaliter=(edtValue)*1.2334818375;
			    kiloliter=(edtValue)*1233.4818375;
			    hectoliter=(edtValue)*12334.818375;
			    dekaliter=(edtValue)*123348.18375;
			    deciliter=(edtValue)*12334818.375;
			    centiliter=(edtValue)*123348183.75;
			    microliter=(edtValue)*1233481837548.0;
			    nanoliter=(edtValue)*1233481837547524.0;
			    picoliter=(edtValue)*1233481837547524000.0;
			    femtoliter=(edtValue)*1.233481837E+21;
			    attoliter=(edtValue)*1.233481837E+24;
			    cc=(edtValue)*1233481837.5;
	  			
			    drop=(edtValue)*24669636751.0;
			    barreloil=(edtValue)* 7758.3673469;
			    barrelUS=(edtValue)*10344.489796;
			    barrelUK=(edtValue)*7536.8909054;
			    gallonUK=(edtValue)*271328.0726;
			    quartUK=(edtValue)*1085312.2904;
			    pintUK=(edtValue)*2170624.5808;
			    cupmetric=(edtValue)*4933927.3502;
			    cupUK=(edtValue)*4341249.1615;
			    fluidounceUS=(edtValue)*41708982.857;
			    fluidounceUK=(edtValue)*43412491.615;
			    tablespoonmetric=(edtValue)*82232122.503;
			    tablespoonUK=(edtValue)*69459986.585;
			    dessertspoonUS=(edtValue)*125126948.57;
	  			
			    dessertspoonUK=(edtValue)*104189979.88;
			    teaspoonmetric=(edtValue)*246696367.51;
			    teaspoonUK=(edtValue)*208379959.75;
			    gillUS=(edtValue)*10427245.714;
			    gillUK=(edtValue)*8682498.3231;
			    minimUS=(edtValue)*20020311771.0;
			    minimUK=(edtValue)*20837995975.0;
			    tonregister=(edtValue)*435.6;
			    ccf=(edtValue)*435.6;
			    hundresdcubicfoot=(edtValue)*435.6;
			    acrefoot=(edtValue)*1;
			    acrefootUSsurvey=(edtValue)*0.999994;
			    
			    
			    
			    acreinch=(edtValue)*12;
			    dekastere=(edtValue)*123.34818375;
			    stere=(edtValue)*1233.4818375;
			    decistere=(edtValue)*12334.818375;
			    cord=(edtValue)*340.3125;
			    tun=(edtValue)*1293.0612245;
			    hogshead=(edtValue)*5172.244898;
			    boardfoot=(edtValue)*522720;
			    dram=(edtValue)*333671862.86;
			    cor=(edtValue)*5606.7356252;
			    homerBiblical=(edtValue)*5606.7356252;
	  			
	  			
			    
			    bathBiblical=(edtValue)*56067.356252;
			    hinBiblical=(edtValue)*336404.13751;
			    cabBiblical=(edtValue)*1009212.4125;
			    logBiblical=(edtValue)*4036849.6502;
			    TazaSpanish=(edtValue)*5213622.8571;
			    Earthsvolume=(edtValue)*1.138949065E-18;
			    
	  			break;
				
	  			
		 case "Acre-foot(US)  - ac*ft":
	  			
			    cubicmeter=(edtValue)*1233.4892385;
			    cubickilometer=(edtValue)* 0.0000012335;
			    cubiccentimeter=(edtValue)*1233489238.5;
			    cubicmillimeter=(edtValue)*1233489238468.0;
			    liter=(edtValue)*1233489.2385;
			    milliliter=(edtValue)*1233489238.5;
			    gallon=(edtValue)*325853.38369;
			    quart=(edtValue)*1303413.5348;
			    pintUS=(edtValue)*2606827.0695;
			    cupUS=(edtValue)*5213654.139;
			    tablespoonUS=(edtValue)*83418466.224;
			    teaspoonUS=(edtValue)*250255398.67;
			    cubicmile=(edtValue)*2.959298058E-7;
			    cubicyard=(edtValue)*1613.3430134;
			    cubicfoot=(edtValue)*43560.261361;
			    cubicinch=(edtValue)*75272131.632;
			    cubicdecimeter=(edtValue)*1233489.2385;
			    exaliter=(edtValue)*1.233489238E-12;
			    petaliter=(edtValue)*1.233489238E-9;
			    teraliter=(edtValue)*0.0000012335;
			    gigaliter=(edtValue)*0.0012334892;
			    megaliter=(edtValue)*1.2334892385;
			    kiloliter=(edtValue)*1233.4892385;
			    hectoliter=(edtValue)*12334.892385;
			    dekaliter=(edtValue)*123348.92385;
			    deciliter=(edtValue)*12334892.385;
			    centiliter=(edtValue)*123348923.85;
			    microliter=(edtValue)*1233489238468.0;
			    nanoliter=(edtValue)*1233489238468147.0;
			    picoliter=(edtValue)*1233489238468146700.0;
			    femtoliter=(edtValue)*1.233489238E+21;
			    attoliter=(edtValue)*1.233489238E+24;
			    cc=(edtValue)*1233489238.5;
	  			
			    drop=(edtValue)*24669784769.0;
			    barreloil=(edtValue)* 7758.4138973;
			    barrelUS=(edtValue)*10344.551863;
			    barrelUK=(edtValue)*7536.936127;
			    gallonUK=(edtValue)*271329.70057;
			    quartUK=(edtValue)*1085318.8023;
			    pintUK=(edtValue)*2170637.6046;
			    cupmetric=(edtValue)*4933956.9539;
			    cupUK=(edtValue)*4341275.2091;
			    fluidounceUS=(edtValue)*41709233.112;
			    fluidounceUK=(edtValue)*43412752.091;
			    tablespoonmetric=(edtValue)*82232615.898;
			    tablespoonUK=(edtValue)*69460403.346;
			    dessertspoonUS=(edtValue)*125127699.34;
	  			
			    dessertspoonUK=(edtValue)*104190605.02;
			    teaspoonmetric=(edtValue)*246697847.69;
			    teaspoonUK=(edtValue)*208381210.04;
			    gillUS=(edtValue)*10427308.278;
			    gillUK=(edtValue)*8682550.4183;
			    minimUS=(edtValue)*20020431894.0;
			    minimUK=(edtValue)*20838121004.0;
			    tonregister=(edtValue)*435.60261361;
			    ccf=(edtValue)*435.60261361;
			    hundresdcubicfoot=(edtValue)*435.60261361;
			    acrefoot=(edtValue)*1.000006;
			    acrefootUSsurvey=(edtValue)*1;
			    
			    
			    
			    acreinch=(edtValue)*12.000072;
			    dekastere=(edtValue)*123.34892385;
			    stere=(edtValue)*1233.4892385;
			    decistere=(edtValue)*12334.892385;
			    cord=(edtValue)*340.31454188;
			    tun=(edtValue)*1293.0689829;
			    hogshead=(edtValue)*5172.2759316;
			    boardfoot=(edtValue)*522723.13633;
			    dram=(edtValue)*333673864.9;
			    cor=(edtValue)*5606.7692658;
			    homerBiblical=(edtValue)*5606.7692658;
	  			
	  			
			    
			    bathBiblical=(edtValue)*56067.692658;
			    hinBiblical=(edtValue)*336406.15595;
			    cabBiblical=(edtValue)*1009218.4678;
			    logBiblical=(edtValue)*4036873.8714;
			    TazaSpanish=(edtValue)*5213654.139;
			    Earthsvolume=(edtValue)*1.138955898E-18;
			    
	  			break;
				
		 case "Acre-inch - ac*in":
	  			
			    cubicmeter=(edtValue)*102.79015313;
			    cubickilometer=(edtValue)* 1.027901531E-7;
			    cubiccentimeter=(edtValue)*102790153.13;
			    cubicmillimeter=(edtValue)*102790153129.0;
			    liter=(edtValue)*102790.15313;
			    milliliter=(edtValue)*102790153.13;
			    gallon=(edtValue)*27154.285714;
			    quart=(edtValue)*108617.14286;
			    pintUS=(edtValue)*217234.28571;
			    cupUS=(edtValue)*434468.57143;
			    tablespoonUS=(edtValue)*6951497.1429;
			    teaspoonUS=(edtValue)*20854491.429;
			    cubicmile=(edtValue)*2.466066919E-8;
			    cubicyard=(edtValue)*134.44444444;
			    cubicfoot=(edtValue)*3630;
			    cubicinch=(edtValue)*6272640;
			    cubicdecimeter=(edtValue)*102790.15313;
			    exaliter=(edtValue)*1.027901531E-13;
			    petaliter=(edtValue)*1.027901531E-10;
			    teraliter=(edtValue)*1.027901531E-7;
			    gigaliter=(edtValue)*0.0001027902;
			    megaliter=(edtValue)*0.1027901531;
			    kiloliter=(edtValue)*102.79015313;
			    hectoliter=(edtValue)*1027.9015313;
			    dekaliter=(edtValue)*10279.015313;
			    deciliter=(edtValue)*1027901.5313;
			    centiliter=(edtValue)*10279015.313;
			    microliter=(edtValue)*102790153129.0;
			    nanoliter=(edtValue)*102790153128961.0;
			    picoliter=(edtValue)*102790153128960540.0;
			    femtoliter=(edtValue)*102790153128960540000.0;
			    attoliter=(edtValue)*1.027901531E+23;
			    cc=(edtValue)*102790153.13;
	  			
			    drop=(edtValue)*2055803062.6;
			    barreloil=(edtValue)*646.53061224 ;
			    barrelUS=(edtValue)*862.04081633;
			    barrelUK=(edtValue)*628.07424212;
			    gallonUK=(edtValue)*22610.672716;
			    quartUK=(edtValue)*90442.690865;
			    pintUK=(edtValue)*180885.38173;
			    cupmetric=(edtValue)*411160.61252;
			    cupUK=(edtValue)*361770.76346;
			    fluidounceUS=(edtValue)*3475748.5714;
			    fluidounceUK=(edtValue)*3617707.6346;
			    tablespoonmetric=(edtValue)*6852676.8753;
			    tablespoonUK=(edtValue)*5788332.2154;
			    dessertspoonUS=(edtValue)*10427245.714;
	  			
			    dessertspoonUK=(edtValue)*8682498.3231;
			    teaspoonmetric=(edtValue)*20558030.626;
			    teaspoonUK=(edtValue)*17364996.646;
			    gillUS=(edtValue)*868937.14286;
			    gillUK=(edtValue)*723541.52692;
			    minimUS=(edtValue)*1668359314.3;
			    minimUK=(edtValue)*1736499664.6;
			    tonregister=(edtValue)*36.3;
			    ccf=(edtValue)*36.3;
			    hundresdcubicfoot=(edtValue)*36.3;
			    acrefoot=(edtValue)*0.0833333333;
			    acrefootUSsurvey=(edtValue)*0.0833328333;
			    
			    
			    
			    acreinch=(edtValue)*1;
			    dekastere=(edtValue)*10.279015313;
			    stere=(edtValue)*102.79015313;
			    decistere=(edtValue)*1027.9015313;
			    cord=(edtValue)*28.359375;
			    tun=(edtValue)*107.75510204;
			    hogshead=(edtValue)*431.02040816;
			    boardfoot=(edtValue)*43560;
			    dram=(edtValue)*27805988.571;
			    cor=(edtValue)*467.22796877;
			    homerBiblical=(edtValue)*467.22796877;
	  			
	  			
			    
			    bathBiblical=(edtValue)*4672.2796877;
			    hinBiblical=(edtValue)*28033.678126;
			    cabBiblical=(edtValue)*84101.034378;
			    logBiblical=(edtValue)*336404.13751;
			    TazaSpanish=(edtValue)*434468.57143;
			    Earthsvolume=(edtValue)*9.491242209E-20;
			    
	  			break;
				
	  			
	  			
		 case "Dekastere  - daSt":
	  			
			    cubicmeter=(edtValue)*10;
			    cubickilometer=(edtValue)* 1.E-8;
			    cubiccentimeter=(edtValue)*10000000;
			    cubicmillimeter=(edtValue)*10000000000.0;
			    liter=(edtValue)*10000;
			    milliliter=(edtValue)*10000000;
			    gallon=(edtValue)*2641.7205236;
			    quart=(edtValue)*10566.882094;
			    pintUS=(edtValue)*21133.764189;
			    cupUS=(edtValue)*42267.528377;
			    tablespoonUS=(edtValue)*676280.45404;
			    teaspoonUS=(edtValue)*2028841.3621;
			    cubicmile=(edtValue)*2.399127585E-9;
			    cubicyard=(edtValue)*13.079506193;
			    cubicfoot=(edtValue)*353.14666721;
			    cubicinch=(edtValue)*610237.44095;
			    cubicdecimeter=(edtValue)*10000;
			    exaliter=(edtValue)*1.E-14;
			    petaliter=(edtValue)*1.E-11;
			    teraliter=(edtValue)*1.E-8;
			    gigaliter=(edtValue)*0.00001;
			    megaliter=(edtValue)*0.01;
			    kiloliter=(edtValue)*10;
			    hectoliter=(edtValue)*100;
			    dekaliter=(edtValue)*1000;
			    deciliter=(edtValue)*100000;
			    centiliter=(edtValue)*1000000;
			    microliter=(edtValue)*10000000000.0;
			    nanoliter=(edtValue)*10000000000000.0;
			    picoliter=(edtValue)*10000000000000000.0;
			    femtoliter=(edtValue)*10000000000000000000.0;
			    attoliter=(edtValue)*1.E+22;
			    cc=(edtValue)*10000000;
	  			
			    drop=(edtValue)*200000000;
			    barreloil=(edtValue)*62.898107704 ;
			    barrelUS=(edtValue)*83.864143606;
			    barrelUK=(edtValue)*61.102568972;
			    gallonUK=(edtValue)*2199.692483;
			    quartUK=(edtValue)*8798.769932;
			    pintUK=(edtValue)*17597.539864;
			    cupmetric=(edtValue)*40000;
			    cupUK=(edtValue)*35195.079728;
			    fluidounceUS=(edtValue)*338140.22702;
			    fluidounceUK=(edtValue)*351950.79728;
			    tablespoonmetric=(edtValue)*666666.66667;
			    tablespoonUK=(edtValue)*563121.27565;
			    dessertspoonUS=(edtValue)*1014420.6811;
	  			
			    dessertspoonUK=(edtValue)*844681.91347;
			    teaspoonmetric=(edtValue)*2000000;
			    teaspoonUK=(edtValue)*1689363.8269;
			    gillUS=(edtValue)*84535.056755;
			    gillUK=(edtValue)*70390.159456;
			    minimUS=(edtValue)*162307308.97;
			    minimUK=(edtValue)*168936382.69;
			    tonregister=(edtValue)*3.5314666721;
			    ccf=(edtValue)*3.531466672;
			    hundresdcubicfoot=(edtValue)*3.5314666721;
			    acrefoot=(edtValue)*0.0081071319;
			    acrefootUSsurvey=(edtValue)*0.0081070833;
			    
			    
			    
			    acreinch=(edtValue)*0.0972855833;
			    dekastere=(edtValue)*1;
			    stere=(edtValue)*10;
			    decistere=(edtValue)*100;
			    cord=(edtValue)*2.7589583376;
			    tun=(edtValue)*10.483017951;
			    hogshead=(edtValue)*41.932071803;
			    boardfoot=(edtValue)*4237.7600066;
			    dram=(edtValue)*2705121.8161;
			    cor=(edtValue)*45.454545455;
			    homerBiblical=(edtValue)*45.454545455;
	  			
	  			
			    
			    bathBiblical=(edtValue)*454.54545455;
			    hinBiblical=(edtValue)*2727.2727273;
			    cabBiblical=(edtValue)*8181.8181818;
			    logBiblical=(edtValue)*32727.272727;
			    TazaSpanish=(edtValue)*42267.528377;
			    Earthsvolume=(edtValue)*9.233610341E-21;
			    
	  			break;
				
	  			
		 case "Stere  - st":
	  			
			    cubicmeter=(edtValue)*1;
			    cubickilometer=(edtValue)*1.E-9 ;
			    cubiccentimeter=(edtValue)*1000000;
			    cubicmillimeter=(edtValue)*1000000000;
			    liter=(edtValue)*1000;
			    milliliter=(edtValue)*1000000;
			    gallon=(edtValue)*264.17205236;
			    quart=(edtValue)*1056.6882094;
			    pintUS=(edtValue)*2113.3764189;
			    cupUS=(edtValue)*4226.7528377;
			    tablespoonUS=(edtValue)*67628.045404;
			    teaspoonUS=(edtValue)*202884.13621;
			    cubicmile=(edtValue)*2.399127585E-10;
			    cubicyard=(edtValue)*1.3079506193;
			    cubicfoot=(edtValue)*35.314666721;
			    cubicinch=(edtValue)*61023.744095;
			    cubicdecimeter=(edtValue)*1000;
			    exaliter=(edtValue)*1.E-15;
			    petaliter=(edtValue)*1.E-12;
			    teraliter=(edtValue)*1.E-9;
			    gigaliter=(edtValue)*0.000001;
			    megaliter=(edtValue)*0.001;
			    kiloliter=(edtValue)*1;
			    hectoliter=(edtValue)*10;
			    dekaliter=(edtValue)*100;
			    deciliter=(edtValue)*10000;
			    centiliter=(edtValue)*100000;
			    microliter=(edtValue)*1000000000;
			    nanoliter=(edtValue)*1000000000000.0;
			    picoliter=(edtValue)*1000000000000000.0;
			    femtoliter=(edtValue)*1000000000000000000.0;
			    attoliter=(edtValue)*1.E+21;
			    cc=(edtValue)*1000000;
	  			
			    drop=(edtValue)*20000000;
			    barreloil=(edtValue)*6.2898107704 ;
			    barrelUS=(edtValue)*8.3864143606;
			    barrelUK=(edtValue)*6.1102568972;
			    gallonUK=(edtValue)*219.9692483;
			    quartUK=(edtValue)*879.8769932;
			    pintUK=(edtValue)*1759.7539864;
			    cupmetric=(edtValue)*4000;
			    cupUK=(edtValue)*3519.5079728;
			    fluidounceUS=(edtValue)*33814.022702;
			    fluidounceUK=(edtValue)*35195.079728;
			    tablespoonmetric=(edtValue)*66666.666667;
			    tablespoonUK=(edtValue)*56312.127565;
			    dessertspoonUS=(edtValue)*101442.06811;
	  			
			    dessertspoonUK=(edtValue)*84468.191347;
			    teaspoonmetric=(edtValue)*200000;
			    teaspoonUK=(edtValue)*168936.38269;
			    gillUS=(edtValue)*8453.5056755;
			    gillUK=(edtValue)*7039.0159456;
			    minimUS=(edtValue)*16230730.897;
			    minimUK=(edtValue)*16893638.269;
			    tonregister=(edtValue)*0.3531466672;
			    ccf=(edtValue)*0.3531466672;
			    hundresdcubicfoot=(edtValue)*0.3531466672;
			    acrefoot=(edtValue)*0.0008107132;
			    acrefootUSsurvey=(edtValue)*0.0008107083;
			    
			    
			    
			    acreinch=(edtValue)*0.0097285583;
			    dekastere=(edtValue)*0.1;
			    stere=(edtValue)*1;
			    decistere=(edtValue)*10;
			    cord=(edtValue)*0.2758958338;
			    tun=(edtValue)*1.0483017951;
			    hogshead=(edtValue)*4.1932071803;
			    boardfoot=(edtValue)*423.77600066;
			    dram=(edtValue)*270512.18161;
			    cor=(edtValue)*4.5454545455;
			    homerBiblical=(edtValue)*4.5454545455;
	  			
	  			
			    
			    bathBiblical=(edtValue)*45.454545455;
			    hinBiblical=(edtValue)*272.72727273;
			    cabBiblical=(edtValue)*818.18181818;
			    logBiblical=(edtValue)*3272.7272727;
			    TazaSpanish=(edtValue)*4226.7528377;
			    Earthsvolume=(edtValue)*9.233610341E-22;
			    
	  			break;
				
	  			
		 case "Decistere  - dSt":
	  			
			    cubicmeter=(edtValue)*0.1;
			    cubickilometer=(edtValue)* 1.E-10;
			    cubiccentimeter=(edtValue)*100000;
			    cubicmillimeter=(edtValue)*100000000;
			    liter=(edtValue)*100;
			    milliliter=(edtValue)*100000;
			    gallon=(edtValue)*26.417205236;
			    quart=(edtValue)*105.66882094;
			    pintUS=(edtValue)*211.33764189;
			    cupUS=(edtValue)*422.67528377;
			    tablespoonUS=(edtValue)*6762.8045404;
			    teaspoonUS=(edtValue)*20288.413621;
			    cubicmile=(edtValue)*2.399127585E-11;
			    cubicyard=(edtValue)*0.1307950619;
			    cubicfoot=(edtValue)*3.5314666721;
			    cubicinch=(edtValue)*6102.3744095;
			    cubicdecimeter=(edtValue)*100;
			    exaliter=(edtValue)*1.E-16;
			    petaliter=(edtValue)*1.E-13;
			    teraliter=(edtValue)*1.E-10;
			    gigaliter=(edtValue)*1.E-7;
			    megaliter=(edtValue)*0.0001;
			    kiloliter=(edtValue)*0.1;
			    hectoliter=(edtValue)*1;
			    dekaliter=(edtValue)*10;
			    deciliter=(edtValue)*1000;
			    centiliter=(edtValue)*10000;
			    microliter=(edtValue)*100000000.0;
			    nanoliter=(edtValue)*100000000000.0;
			    picoliter=(edtValue)*100000000000000.0;
			    femtoliter=(edtValue)*100000000000000000.0;
			    attoliter=(edtValue)*100000000000000000000.0;
			    cc=(edtValue)*100000;
	  			
			    drop=(edtValue)*2000000;
			    barreloil=(edtValue)* 0.628981077;
			    barrelUS=(edtValue)*0.8386414361;
			    barrelUK=(edtValue)*0.6110256897;
			    gallonUK=(edtValue)*21.99692483;
			    quartUK=(edtValue)*87.98769932;
			    pintUK=(edtValue)*175.97539864;
			    cupmetric=(edtValue)*400;
			    cupUK=(edtValue)*351.95079728;
			    fluidounceUS=(edtValue)*3381.4022702;
			    fluidounceUK=(edtValue)*3519.5079728;
			    tablespoonmetric=(edtValue)*6666.6666667;
			    tablespoonUK=(edtValue)*5631.2127565;
			    dessertspoonUS=(edtValue)*10144.206811;
	  			
			    dessertspoonUK=(edtValue)*8446.8191347;
			    teaspoonmetric=(edtValue)*20000;
			    teaspoonUK=(edtValue)*16893.638269;
			    gillUS=(edtValue)*845.35056755;
			    gillUK=(edtValue)*703.90159456;
			    minimUS=(edtValue)*1623073.0897;
			    minimUK=(edtValue)*1689363.8269;
			    tonregister=(edtValue)*0.0353146667;
			    ccf=(edtValue)*0.0353146667;
			    hundresdcubicfoot=(edtValue)*0.0353146667;
			    acrefoot=(edtValue)*0.0000810713;
			    acrefootUSsurvey=(edtValue)*0.0000810708;
			    
			    
			    
			    acreinch=(edtValue)*0.0009728558;
			    dekastere=(edtValue)*0.01;
			    stere=(edtValue)*0.1;
			    decistere=(edtValue)*1;
			    cord=(edtValue)*0.0275895834;
			    tun=(edtValue)*0.1048301795;
			    hogshead=(edtValue)*0.419320718;
			    boardfoot=(edtValue)*42.377600066;
			    dram=(edtValue)*27051.218161;
			    cor=(edtValue)*0.4545454545;
			    homerBiblical=(edtValue)*0.4545454545;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.4545454545;
			    hinBiblical=(edtValue)*27.272727273;
			    cabBiblical=(edtValue)*81.818181818;
			    logBiblical=(edtValue)*327.27272727;
			    TazaSpanish=(edtValue)*422.67528377;
			    Earthsvolume=(edtValue)*9.233610341E-23;
			    
	  			break;
				
	  			
		 case "Cord  - cd":
	  			
			    cubicmeter=(edtValue)*3.6245563638;
			    cubickilometer=(edtValue)* 3.624556363E-9;
			    cubiccentimeter=(edtValue)*3624556.3638;
			    cubicmillimeter=(edtValue)*3624556363.8;
			    liter=(edtValue)*3624.5563638;
			    milliliter=(edtValue)*3624556.3638;
			    gallon=(edtValue)*957.50649351;
			    quart=(edtValue)*3830.025974;
			    pintUS=(edtValue)*7660.0519481;
			    cupUS=(edtValue)*15320.103896;
			    tablespoonUS=(edtValue)*245121.66234;
			    teaspoonUS=(edtValue)*735364.98701;
			    cubicmile=(edtValue)*8.695773158E-10;
			    cubicyard=(edtValue)*4.7407407407;
			    cubicfoot=(edtValue)*128;
			    cubicinch=(edtValue)*221184;
			    cubicdecimeter=(edtValue)*3624.5563638;
			    exaliter=(edtValue)*3.624556363E-15;
			    petaliter=(edtValue)*3.624556363E-12;
			    teraliter=(edtValue)*3.624556363E-9;
			    gigaliter=(edtValue)*0.0000036246;
			    megaliter=(edtValue)*0.0036245564;
			    kiloliter=(edtValue)*3.6245563638;
			    hectoliter=(edtValue)*36.245563638;
			    dekaliter=(edtValue)*362.45563638;
			    deciliter=(edtValue)*36245.563638;
			    centiliter=(edtValue)*362455.63638;
			    microliter=(edtValue)*3624556363.8;
			    nanoliter=(edtValue)*3624556363776.0;
			    picoliter=(edtValue)*3624556363775995.0;
			    femtoliter=(edtValue)*3624556363775994400.0;
			    attoliter=(edtValue)*3.624556363E+21;
			    cc=(edtValue)*3624556.3638;
	  			
			    drop=(edtValue)*72491127.276;
			    barreloil=(edtValue)*22.797773655 ;
			    barrelUS=(edtValue)*30.39703154;
			    barrelUK=(edtValue)*22.146970521;
			    gallonUK=(edtValue)*797.29093876;
			    quartUK=(edtValue)*3189.163755;
			    pintUK=(edtValue)*6378.3275101;
			    cupmetric=(edtValue)*14498.225455;
			    cupUK=(edtValue)*12756.65502;
			    fluidounceUS=(edtValue)*122560.83117;
			    fluidounceUK=(edtValue)*127566.5502;
			    tablespoonmetric=(edtValue)*241637.09092;
			    tablespoonUK=(edtValue)*204106.48032;
			    dessertspoonUS=(edtValue)*367682.49351;
	  			
			    dessertspoonUK=(edtValue)*306159.72048;
			    teaspoonmetric=(edtValue)*724911.27276;
			    teaspoonUK=(edtValue)*612319.44097;
			    gillUS=(edtValue)*30640.207792;
			    gillUK=(edtValue)*25513.31004;
			    minimUS=(edtValue)*58829198.961;
			    minimUK=(edtValue)*61231944.097;
			    tonregister=(edtValue)*1.28;
			    ccf=(edtValue)*1.28;
			    hundresdcubicfoot=(edtValue)*1.28;
			    acrefoot=(edtValue)*0.0029384757;
			    acrefootUSsurvey=(edtValue)*0.002938458;
			    
			    
			    
			    acreinch=(edtValue)*0.035261708;
			    dekastere=(edtValue)*0.3624556364;
			    stere=(edtValue)*3.6245563638;
			    decistere=(edtValue)*36.245563638;
			    cord=(edtValue)*1;
			    tun=(edtValue)*3.7996289425;
			    hogshead=(edtValue)*15.19851577;
			    boardfoot=(edtValue)*1536;
			    dram=(edtValue)*980486.64935;
			    cor=(edtValue)*16.475256199;
			    homerBiblical=(edtValue)*16.475256199;
	  			
	  			
			    
			    bathBiblical=(edtValue)*164.75256199;
			    hinBiblical=(edtValue)*988.51537194;
			    cabBiblical=(edtValue)*2965.5461158;
			    logBiblical=(edtValue)*11862.184463;
			    TazaSpanish=(edtValue)*15320.103896;
			    Earthsvolume=(edtValue)*3.346774112E-21;
			    
	  			break;
		
		 case "Tun  - tun":
	  			
			    cubicmeter=(edtValue)*0.9539237696;
			    cubickilometer=(edtValue)*9.539237695E-10 ;
			    cubiccentimeter=(edtValue)*953923.76957;
			    cubicmillimeter=(edtValue)*953923769.57;
			    liter=(edtValue)*953.92376957;
			    milliliter=(edtValue)*953923.76957;
			    gallon=(edtValue)*252;
			    quart=(edtValue)*1008;
			    pintUS=(edtValue)*2016;
			    cupUS=(edtValue)*4032;
			    tablespoonUS=(edtValue)*64512;
			    teaspoonUS=(edtValue)*193536;
			    cubicmile=(edtValue)*2.28858483E-10;
			    cubicyard=(edtValue)*1.2476851852;
			    cubicfoot=(edtValue)*33.6875;
			    cubicinch=(edtValue)*58212;
			    cubicdecimeter=(edtValue)*953.92376957;
			    exaliter=(edtValue)*9.539237695E-16;
			    petaliter=(edtValue)*9.539237695E-13;
			    teraliter=(edtValue)*9.539237695E-10;
			    gigaliter=(edtValue)*9.539237695E-7;
			    megaliter=(edtValue)*0.0009539238;
			    kiloliter=(edtValue)*0.9539237696;
			    hectoliter=(edtValue)*9.5392376957;
			    dekaliter=(edtValue)*95.392376957;
			    deciliter=(edtValue)*9539.2376957;
			    centiliter=(edtValue)*95392.376957;
			    microliter=(edtValue)*953923769.57;
			    nanoliter=(edtValue)*953923769568.0;
			    picoliter=(edtValue)*953923769568016.0;
			    femtoliter=(edtValue)*953923769568016000.0;
			    attoliter=(edtValue)*953923769568016000000.0;
			    cc=(edtValue)*953923.76957;
	  			
			    drop=(edtValue)*19078475.391;
			    barreloil=(edtValue)*6 ;
			    barrelUS=(edtValue)*8;
			    barrelUK=(edtValue)*5.8287192924;
			    gallonUK=(edtValue)*209.83389453;
			    quartUK=(edtValue)*839.33557811;
			    pintUK=(edtValue)*1678.6711562;
			    cupmetric=(edtValue)*3815.6950783;
			    cupUK=(edtValue)*3357.3423124;
			    fluidounceUS=(edtValue)*32256;
			    fluidounceUK=(edtValue)*33573.423124;
			    tablespoonmetric=(edtValue)*63594.917971;
			    tablespoonUK=(edtValue)*53717.476999;
			    dessertspoonUS=(edtValue)*96768;
	  			
			    dessertspoonUK=(edtValue)*80576.215498;
			    teaspoonmetric=(edtValue)*190784.75391;
			    teaspoonUK=(edtValue)*161152.431;
			    gillUS=(edtValue)*8064;
			    gillUK=(edtValue)*6714.6846248;
			    minimUS=(edtValue)*15482880;
			    minimUK=(edtValue)*16115243.1;
			    tonregister=(edtValue)*0.336875;
			    ccf=(edtValue)*0.336875;
			    hundresdcubicfoot=(edtValue)*0.0007733586;
			    acrefoot=(edtValue)*0.0007733539;
			    acrefootUSsurvey=(edtValue)*0.0007733539;
			    
			    
			    
			    acreinch=(edtValue)*0.009280303;
			    dekastere=(edtValue)*0.095392377;
			    stere=(edtValue)*0.9539237696;
			    decistere=(edtValue)*9.5392376957;
			    cord=(edtValue)*0.2631835938;
			    tun=(edtValue)*1;
			    hogshead=(edtValue)*4;
			    boardfoot=(edtValue)*404.25;
			    dram=(edtValue)*258048;
			    cor=(edtValue)*4.3360171344;
			    homerBiblical=(edtValue)*4.3360171344;
	  			
	  			
			    
			    bathBiblical=(edtValue)*43.360171344;
			    hinBiblical=(edtValue)*260.16102806;
			    cabBiblical=(edtValue)*780.48308419;
			    logBiblical=(edtValue)*3121.9323368;
			    TazaSpanish=(edtValue)*4032;
			    Earthsvolume=(edtValue)*8.808160383E-22;
			    
	  			break;
				
	  			
		 case "Hogshead  - hogshead":
	  			
			    cubicmeter=(edtValue)*0.2384809424;
			    cubickilometer=(edtValue)* 2.384809423E-10;
			    cubiccentimeter=(edtValue)*238480.94239;
			    cubicmillimeter=(edtValue)*238480942.39;
			    liter=(edtValue)*238.48094239;
			    milliliter=(edtValue)*238480.94239;
			    gallon=(edtValue)*63;
			    quart=(edtValue)*252;
			    pintUS=(edtValue)*504;
			    cupUS=(edtValue)*1008;
			    tablespoonUS=(edtValue)*16128;
			    teaspoonUS=(edtValue)*48384;
			    cubicmile=(edtValue)*5.721462075E-11;
			    cubicyard=(edtValue)*0.3119212963;
			    cubicfoot=(edtValue)*8.421875;
			    cubicinch=(edtValue)*14553;
			    cubicdecimeter=(edtValue)*238.48094239;
			    exaliter=(edtValue)*2.384809423E-16;
			    petaliter=(edtValue)*2.384809423E-13;
			    teraliter=(edtValue)*2.384809423E-10;
			    gigaliter=(edtValue)*2.384809423E-7;
			    megaliter=(edtValue)*0.0002384809;
			    kiloliter=(edtValue)*0.2384809424;
			    hectoliter=(edtValue)*2.3848094239;
			    dekaliter=(edtValue)*23.848094239;
			    deciliter=(edtValue)*2384.8094239;
			    centiliter=(edtValue)*23848.094239;
			    microliter=(edtValue)*238480942.39;
			    nanoliter=(edtValue)*238480942392.0;
			    picoliter=(edtValue)*238480942391998.0;
			    femtoliter=(edtValue)*238480942391998300.0;
			    attoliter=(edtValue)*238480942391998320000.0;
			    cc=(edtValue)*238480.94239;
	  			
			    drop=(edtValue)*4769618.8478;
			    barreloil=(edtValue)* 1.5;
			    barrelUS=(edtValue)*2;
			    barrelUK=(edtValue)*1.4571798231;
			    gallonUK=(edtValue)*52.458473632;
			    quartUK=(edtValue)*209.83389453;
			    pintUK=(edtValue)*419.66778905;
			    cupmetric=(edtValue)*953.92376957;
			    cupUK=(edtValue)*839.33557811;
			    fluidounceUS=(edtValue)*8064;
			    fluidounceUK=(edtValue)*8393.3557811;
			    tablespoonmetric=(edtValue)*15898.729493;
			    tablespoonUK=(edtValue)*13429.36925;
			    dessertspoonUS=(edtValue)*24192;
	  			
			    dessertspoonUK=(edtValue)*20144.053875;
			    teaspoonmetric=(edtValue)*47696.188478;
			    teaspoonUK=(edtValue)*40288.107749;
			    gillUS=(edtValue)*2016;
			    gillUK=(edtValue)*1678.6711562;
			    minimUS=(edtValue)*3870720;
			    minimUK=(edtValue)*4028810.7749;
			    tonregister=(edtValue)*0.08421875;
			    ccf=(edtValue)*0.08421875;
			    hundresdcubicfoot=(edtValue)*0.08421875;
			    acrefoot=(edtValue)*0.0001933396;
			    acrefootUSsurvey=(edtValue)*0.0001933385;
			    
			    
			    
			    acreinch=(edtValue)*0.0023200758;
			    dekastere=(edtValue)*0.0238480942;
			    stere=(edtValue)*0.2384809424;
			    decistere=(edtValue)*2.3848094239;
			    cord=(edtValue)*0.0657958984;
			    tun=(edtValue)*0.25;
			    hogshead=(edtValue)*1;
			    boardfoot=(edtValue)*101.0625;
			    dram=(edtValue)*64512;
			    cor=(edtValue)*1.0840042836;
			    homerBiblical=(edtValue)*1.0840042836;
	  			
	  			
			    
			    bathBiblical=(edtValue)*10.840042836;
			    hinBiblical=(edtValue)*65.040257016;
			    cabBiblical=(edtValue)*195.12077105;
			    logBiblical=(edtValue)*780.48308419;
			    TazaSpanish=(edtValue)*1008;
			    Earthsvolume=(edtValue)*2.202040095E-22;
			    
	  			break;
				
	  			
		 case "Board foot  - bft":
	  			
			    cubicmeter=(edtValue)*0.0023597372;
			    cubickilometer=(edtValue)*2.359737216E-12 ;
			    cubiccentimeter=(edtValue)*2359.737216;
			    cubicmillimeter=(edtValue)*2359737.216;
			    liter=(edtValue)*2.359737216;
			    milliliter=(edtValue)*2359.737216;
			    gallon=(edtValue)*0.6233766234;
			    quart=(edtValue)*2.4935064935;
			    pintUS=(edtValue)*4.987012987;
			    cupUS=(edtValue)*9.974025974;
			    tablespoonUS=(edtValue)*159.58441558;
			    teaspoonUS=(edtValue)*478.75324675;
			    cubicmile=(edtValue)*5.66131065E-13;
			    cubicyard=(edtValue)*0.0030864198;
			    cubicfoot=(edtValue)*0.0833333333;
			    cubicinch=(edtValue)*144;
			    cubicdecimeter=(edtValue)*2.359737216;
			    exaliter=(edtValue)*2.359737216E-18;
			    petaliter=(edtValue)*2.359737216E-15;
			    teraliter=(edtValue)*2.359737216E-12;
			    gigaliter=(edtValue)*2.359737216E-9;
			    megaliter=(edtValue)*0.0000023597;
			    kiloliter=(edtValue)*0.0023597372;
			    hectoliter=(edtValue)*0.0235973722;
			    dekaliter=(edtValue)*0.2359737216;
			    deciliter=(edtValue)*23.59737216;
			    centiliter=(edtValue)*235.9737216;
			    microliter=(edtValue)*2359737.216;
			    nanoliter=(edtValue)*2359737216.0;
			    picoliter=(edtValue)*2359737216000.0;
			    femtoliter=(edtValue)*2359737216000017.0;
			    attoliter=(edtValue)*2359737216000017000.0;
			    cc=(edtValue)*2359.737216;
	  			
			    drop=(edtValue)*47194.74432;
			    barreloil=(edtValue)* 0.0148423006;
			    barrelUS=(edtValue)*0.0197897341;
			    barrelUK=(edtValue)*0.0144186006;
			    gallonUK=(edtValue)*0.5190696216;
			    quartUK=(edtValue)*2.0762784863;
			    pintUK=(edtValue)*4.1525569727;
			    cupmetric=(edtValue)*9.438948864;
			    cupUK=(edtValue)*8.3051139454;
			    fluidounceUS=(edtValue)*79.792207792;
			    fluidounceUK=(edtValue)*83.051139454;
			    tablespoonmetric=(edtValue)*157.3158144;
			    tablespoonUK=(edtValue)*132.88182313;
			    dessertspoonUS=(edtValue)*239.37662338;
	  			
			    dessertspoonUK=(edtValue)*199.32273469;
			    teaspoonmetric=(edtValue)*471.9474432;
			    teaspoonUK=(edtValue)*398.64546938;
			    gillUS=(edtValue)*19.948051948;
			    gillUK=(edtValue)*16.610227891;
			    minimUS=(edtValue)*38300.25974;
			    minimUK=(edtValue)*39864.546938;
			    tonregister=(edtValue)*0.0008333333;
			    ccf=(edtValue)*0.0008333333;
			    hundresdcubicfoot=(edtValue)*0.0008333333;
			    acrefoot=(edtValue)*0.0000019131;
			    acrefootUSsurvey=(edtValue)*0.0000019131;
			    
			    
			    
			    acreinch=(edtValue)*0.0000229568;
			    dekastere=(edtValue)*0.0002359737;
			    stere=(edtValue)*0.0023597372;
			    decistere=(edtValue)*0.0235973722;
			    cord=(edtValue)*0.0006510417;
			    tun=(edtValue)*0.0024737168;
			    hogshead=(edtValue)*0.009894867;
			    boardfoot=(edtValue)*1;
			    dram=(edtValue)*638.33766234;
			    cor=(edtValue)*0.0107260783;
			    homerBiblical=(edtValue)*0.0107260783;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.1072607825;
			    hinBiblical=(edtValue)*0.6435646953;
			    cabBiblical=(edtValue)*1.9306940858;
			    logBiblical=(edtValue)*7.7227763433;
			    TazaSpanish=(edtValue)*9.974025974;
			    Earthsvolume=(edtValue)*2.178889396E-24;
			    
	  			break;
				
	  			
		 case "Dram  - dr":
	  			
			    cubicmeter=(edtValue)*0.0000036967;
			    cubickilometer=(edtValue)* 3.696691195E-15;
			    cubiccentimeter=(edtValue)*3.6966911953;
			    cubicmillimeter=(edtValue)*3696.6911953;
			    liter=(edtValue)*0.0036966912;
			    milliliter=(edtValue)*3.6966911953;
			    gallon=(edtValue)*0.0009765625;
			    quart=(edtValue)*0.00390625;
			    pintUS=(edtValue)*0.0078125;
			    cupUS=(edtValue)*0.015625;
			    tablespoonUS=(edtValue)*0.25;
			    teaspoonUS=(edtValue)*0.75;
			    cubicmile=(edtValue)*8.868833822E-16;
			    cubicyard=(edtValue)*0.0000048351;
			    cubicfoot=(edtValue)*0.0001305474;
			    cubicinch=(edtValue)*0.2255859375;
			    cubicdecimeter=(edtValue)*0.0036966912;
			    exaliter=(edtValue)*3.696691195E-21;
			    petaliter=(edtValue)*3.696691195E-18;
			    teraliter=(edtValue)*3.696691195E-15;
			    gigaliter=(edtValue)*3.696691195E-12;
			    megaliter=(edtValue)*3.696691195E-9;
			    kiloliter=(edtValue)*0.0000036967;
			    hectoliter=(edtValue)*0.0000369669;
			    dekaliter=(edtValue)*0.0003696691;
			    deciliter=(edtValue)*0.036966912;
			    centiliter=(edtValue)*0.3696691195;
			    microliter=(edtValue)*3696.6911953;
			    nanoliter=(edtValue)*3696691.1953;
			    picoliter=(edtValue)*3696691195.3;
			    femtoliter=(edtValue)*3696691195313.0;
			    attoliter=(edtValue)*3696691195312554.0;
			    cc=(edtValue)*3.6966911953;
	  			
			    drop=(edtValue)*73.933823906;
			    barreloil=(edtValue)*0.0000232515 ;
			    barrelUS=(edtValue)*0.000031002;
			    barrelUK=(edtValue)*0.0000225877;
			    gallonUK=(edtValue)*0.0008131584;
			    quartUK=(edtValue)*0.0032526335;
			    pintUK=(edtValue)*0.0065052671;
			    cupmetric=(edtValue)*0.0147867648;
			    cupUK=(edtValue)*0.0130105341;
			    fluidounceUS=(edtValue)*0.125;
			    fluidounceUK=(edtValue)*0.1301053413;
			    tablespoonmetric=(edtValue)*0.2464460797;
			    tablespoonUK=(edtValue)*0.2081685462;
			    dessertspoonUS=(edtValue)*0.375;
	  			
			    dessertspoonUK=(edtValue)*0.3122528192;
			    teaspoonmetric=(edtValue)*0.7393382391;
			    teaspoonUK=(edtValue)*0.6245056385;
			    gillUS=(edtValue)*0.03125;
			    gillUK=(edtValue)*0.0260210683;
			    minimUS=(edtValue)*60;
			    minimUK=(edtValue)*62.450563847;
			    tonregister=(edtValue)*0.0000013055;
			    ccf=(edtValue)*0.0000013055;
			    hundresdcubicfoot=(edtValue)*0.0000013055;
			    acrefoot=(edtValue)*2.996956325E-9;
			    acrefootUSsurvey=(edtValue)*2.996938343E-9;
			    
			    
			    
			    acreinch=(edtValue)*3.59634759E-8;
			    dekastere=(edtValue)*3.696691195E-7;
			    stere=(edtValue)*0.0000036967;
			    decistere=(edtValue)*0.0000369669;
			    cord=(edtValue)*0.0000010199;
			    tun=(edtValue)*0.0000038752;
			    hogshead=(edtValue)*0.000015501;
			    boardfoot=(edtValue)*0.001566569;
			    dram=(edtValue)*1;
			    cor=(edtValue)*0.0000168031;
			    homerBiblical=(edtValue)*0.0000168031;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.0001680314;
			    hinBiblical=(edtValue)*0.0010081885;
			    cabBiblical=(edtValue)*0.0030245655;
			    logBiblical=(edtValue)*0.0120982621;
			    TazaSpanish=(edtValue)*0.015625;
			    Earthsvolume=(edtValue)*3.413380605E-27;
			    
	  			break;
				
	  			
		 case "Cor(Biblical) - cor":
	  			
			    cubicmeter=(edtValue)*0.22;
			    cubickilometer=(edtValue)*2.199999999E-10 ;
			    cubiccentimeter=(edtValue)*220000;
			    cubicmillimeter=(edtValue)*220000000;
			    liter=(edtValue)*220;
			    milliliter=(edtValue)*220000;
			    gallon=(edtValue)*58.117851519;
			    quart=(edtValue)*232.47140608;
			    pintUS=(edtValue)*464.94281215;
			    cupUS=(edtValue)*929.8856243;
			    tablespoonUS=(edtValue)*14878.169989;
			    teaspoonUS=(edtValue)*44634.509966;
			    cubicmile=(edtValue)*5.278080688E-11;
			    cubicyard=(edtValue)*0.2877491362;
			    cubicfoot=(edtValue)*7.7692266787;
			    cubicinch=(edtValue)*13425.223701;
			    cubicdecimeter=(edtValue)*220;
			    exaliter=(edtValue)*2.199999999E-16;
			    petaliter=(edtValue)*2.199999999E-13;
			    teraliter=(edtValue)*2.199999999E-10;
			    gigaliter=(edtValue)*2.199999999E-7;
			    megaliter=(edtValue)*0.00022;
			    kiloliter=(edtValue)*0.22;
			    hectoliter=(edtValue)*2.2;
			    dekaliter=(edtValue)*22;
			    deciliter=(edtValue)*2200;
			    centiliter=(edtValue)*22000;
			    microliter=(edtValue)*220000000;
			    nanoliter=(edtValue)*220000000;
			    picoliter=(edtValue)*220000000000.0;
			    femtoliter=(edtValue)*219999999999997.0;
			    attoliter=(edtValue)*219999999999997380.0;
			    cc=(edtValue)*220000;
	  			
			    drop=(edtValue)*4400000;
			    barreloil=(edtValue)*1.3837583695 ;
			    barrelUS=(edtValue)*1.8450111593;
			    barrelUK=(edtValue)*1.3442565174;
			    gallonUK=(edtValue)*48.393234626;
			    quartUK=(edtValue)*193.5729385;
			    pintUK=(edtValue)*387.14587701;
			    cupmetric=(edtValue)*880;
			    cupUK=(edtValue)*774.29175401;
			    fluidounceUS=(edtValue)*7439.0849944;
			    fluidounceUK=(edtValue)*7742.9175401;
			    tablespoonmetric=(edtValue)*14666.666667;
			    tablespoonUK=(edtValue)*12388.668064;
			    dessertspoonUS=(edtValue)*22317.254983;
	  			
			    dessertspoonUK=(edtValue)*18583.002096;
			    teaspoonmetric=(edtValue)*44000;
			    teaspoonUK=(edtValue)*37166.004193;
			    gillUS=(edtValue)*1859.7712486;
			    gillUK=(edtValue)*1548.583508;
			    minimUS=(edtValue)*3570760.7973;
			    minimUK=(edtValue)*3716600.4193;
			    tonregister=(edtValue)*0.0776922668;
			    ccf=(edtValue)*0.0776922668;
			    hundresdcubicfoot=(edtValue)*0.0776922668;
			    acrefoot=(edtValue)*0.0001783569;
			    acrefootUSsurvey=(edtValue)*0.0001783558;
			    
			    
			    
			    acreinch=(edtValue)*0.0021402828;
			    dekastere=(edtValue)*0.022;
			    stere=(edtValue)*0.22;
			    decistere=(edtValue)*2.2;
			    cord=(edtValue)*0.0606970834;
			    tun=(edtValue)*0.2306263949;
			    hogshead=(edtValue)*0.9225055797;
			    boardfoot=(edtValue)*93.230720145;
			    dram=(edtValue)*59512.679955;
			    cor=(edtValue)*1;
			    homerBiblical=(edtValue)*1;
	  			
	  			
			    
			    bathBiblical=(edtValue)*10;
			    hinBiblical=(edtValue)*60;
			    cabBiblical=(edtValue)*180;
			    logBiblical=(edtValue)*720;
			    TazaSpanish=(edtValue)*929.8856243;
			    Earthsvolume=(edtValue)*2.031394275E-22;
			    
	  			break;
				
	  			
		 case "Homer(Biblical) - homer":
	  			
			    cubicmeter=(edtValue)*0.22;
			    cubickilometer=(edtValue)*2.199999999E-10 ;
			    cubiccentimeter=(edtValue)*220000;
			    cubicmillimeter=(edtValue)*220000000;
			    liter=(edtValue)*220;
			    milliliter=(edtValue)*220000;
			    gallon=(edtValue)*58.117851519;
			    quart=(edtValue)*232.47140608;
			    pintUS=(edtValue)*464.94281215;
			    cupUS=(edtValue)*929.8856243;
			    tablespoonUS=(edtValue)*14878.169989;
			    teaspoonUS=(edtValue)*44634.509966;
			    cubicmile=(edtValue)*5.278080688E-11;
			    cubicyard=(edtValue)*0.2877491362;
			    cubicfoot=(edtValue)*7.7692266787;
			    cubicinch=(edtValue)*13425.223701;
			    cubicdecimeter=(edtValue)*220;
			    exaliter=(edtValue)*2.199999999E-16;
			    petaliter=(edtValue)*2.199999999E-13;
			    teraliter=(edtValue)*2.199999999E-10;
			    gigaliter=(edtValue)*2.199999999E-7;
			    megaliter=(edtValue)*0.00022;
			    kiloliter=(edtValue)*0.22;
			    hectoliter=(edtValue)*2.2;
			    dekaliter=(edtValue)*22;
			    deciliter=(edtValue)*2200;
			    centiliter=(edtValue)*22000;
			    microliter=(edtValue)*220000000;
			    nanoliter=(edtValue)*220000000000.0;
			    picoliter=(edtValue)*219999999999997.0;
			    femtoliter=(edtValue)*219999999999997380.0;
			    attoliter=(edtValue)*219999999999997380000.0;
			    cc=(edtValue)*220000;
	  			
			    drop=(edtValue)*4400000;
			    barreloil=(edtValue)* 1.3837583695;
			    barrelUS=(edtValue)*1.8450111593;
			    barrelUK=(edtValue)*1.3442565174;
			    gallonUK=(edtValue)*48.393234626;
			    quartUK=(edtValue)*193.5729385;
			    pintUK=(edtValue)*387.14587701;
			    cupmetric=(edtValue)*880;
			    cupUK=(edtValue)*774.29175401;
			    fluidounceUS=(edtValue)*7439.0849944;
			    fluidounceUK=(edtValue)*7742.9175401;
			    tablespoonmetric=(edtValue)*14666.666667;
			    tablespoonUK=(edtValue)*12388.668064;
			    dessertspoonUS=(edtValue)*22317.254983;
	  			
			    dessertspoonUK=(edtValue)*18583.002096;
			    teaspoonmetric=(edtValue)*44000;
			    teaspoonUK=(edtValue)*37166.004193;
			    gillUS=(edtValue)*1859.7712486;
			    gillUK=(edtValue)*1548.583508;
			    minimUS=(edtValue)*3570760.7973;
			    minimUK=(edtValue)*3716600.4193;
			    tonregister=(edtValue)*0.0776922668;
			    ccf=(edtValue)*0.0776922668;
			    hundresdcubicfoot=(edtValue)*0.0776922668;
			    acrefoot=(edtValue)*0.0001783569;
			    acrefootUSsurvey=(edtValue)*0.0001783558;
			    
			    
			    
			    acreinch=(edtValue)*0.0021402828;
			    dekastere=(edtValue)*0.022;
			    stere=(edtValue)*0.22;
			    decistere=(edtValue)*2.2;
			    cord=(edtValue)*0.0606970834;
			    tun=(edtValue)*0.2306263949;
			    hogshead=(edtValue)*0.9225055797;
			    boardfoot=(edtValue)*93.230720145;
			    dram=(edtValue)*59512.679955;
			    cor=(edtValue)*1;
			    homerBiblical=(edtValue)*1;
	  			
	  			
			    
			    bathBiblical=(edtValue)*10;
			    hinBiblical=(edtValue)*60;
			    cabBiblical=(edtValue)*180;
			    logBiblical=(edtValue)*720;
			    TazaSpanish=(edtValue)*929.8856243;
			    Earthsvolume=(edtValue)*2.031394275E-22;
			    
	  			break;
				
	  			
		 case "Bath(Biblical) - bath":
	  			
			    cubicmeter=(edtValue)*0.022;
			    cubickilometer=(edtValue)*2.199999999E-11 ;
			    cubiccentimeter=(edtValue)*22000;
			    cubicmillimeter=(edtValue)*22000000;
			    liter=(edtValue)*22;
			    milliliter=(edtValue)*22000;
			    gallon=(edtValue)*5.8117851519;
			    quart=(edtValue)*23.247140608;
			    pintUS=(edtValue)*46.494281215;
			    cupUS=(edtValue)*92.98856243;
			    tablespoonUS=(edtValue)*1487.8169989;
			    teaspoonUS=(edtValue)*4463.4509966;
			    cubicmile=(edtValue)*5.278080688E-12;
			    cubicyard=(edtValue)*0.0287749136;
			    cubicfoot=(edtValue)*0.7769226679;
			    cubicinch=(edtValue)*1342.5223701;
			    cubicdecimeter=(edtValue)*22;
			    exaliter=(edtValue)*2.199999999E-17;
			    petaliter=(edtValue)*2.199999999E-14;
			    teraliter=(edtValue)*2.199999999E-11;
			    gigaliter=(edtValue)*2.199999999E-8;
			    megaliter=(edtValue)*0.000022;
			    kiloliter=(edtValue)*0.022;
			    hectoliter=(edtValue)*0.22;
			    dekaliter=(edtValue)*2.2;
			    deciliter=(edtValue)*220;
			    centiliter=(edtValue)*2200;
			    microliter=(edtValue)*22000000;
			    nanoliter=(edtValue)*22000000000.0;
			    picoliter=(edtValue)*22000000000000.0;
			    femtoliter=(edtValue)*21999999999999736.0;
			    attoliter=(edtValue)*21999999999999734000.0;
			    cc=(edtValue)*22000;
	  			
			    drop=(edtValue)*440000;
			    barreloil=(edtValue)* 0.1383758369;
			    barrelUS=(edtValue)*0.1845011159;
			    barrelUK=(edtValue)*0.1344256517;
			    gallonUK=(edtValue)*4.8393234626;
			    quartUK=(edtValue)*19.35729385;
			    pintUK=(edtValue)*38.714587701;
			    cupmetric=(edtValue)*88;
			    cupUK=(edtValue)*77.429175401;
			    fluidounceUS=(edtValue)*743.90849944;
			    fluidounceUK=(edtValue)*774.29175401;
			    tablespoonmetric=(edtValue)*1466.6666667;
			    tablespoonUK=(edtValue)*1238.8668064;
			    dessertspoonUS=(edtValue)*2231.7254983;
	  			
			    dessertspoonUK=(edtValue)*1858.3002096;
			    teaspoonmetric=(edtValue)*4400;
			    teaspoonUK=(edtValue)*3716.6004193;
			    gillUS=(edtValue)*185.97712486;
			    gillUK=(edtValue)*154.8583508;
			    minimUS=(edtValue)*357076.07973;
			    minimUK=(edtValue)*371660.04193;
			    tonregister=(edtValue)*0.0077692267;
			    ccf=(edtValue)*0.0077692267;
			    hundresdcubicfoot=(edtValue)*0.0077692267;
			    acrefoot=(edtValue)*0.0000178357;
			    acrefootUSsurvey=(edtValue)*0.0000178356;
			    
			    
			    
			    acreinch=(edtValue)*0.0002140283;
			    dekastere=(edtValue)*0.0022;
			    stere=(edtValue)*0.022;
			    decistere=(edtValue)*0.22;
			    cord=(edtValue)*0.0060697083;
			    tun=(edtValue)*0.0230626395;
			    hogshead=(edtValue)*0.092250558;
			    boardfoot=(edtValue)*9.3230720145;
			    dram=(edtValue)*5951.2679955;
			    cor=(edtValue)*0.1;
			    homerBiblical=(edtValue)*0.1;
	  			
	  			
			    
			    bathBiblical=(edtValue)*1;
			    hinBiblical=(edtValue)*6;
			    cabBiblical=(edtValue)*18;
			    logBiblical=(edtValue)*72;
			    TazaSpanish=(edtValue)*92.98856243;
			    Earthsvolume=(edtValue)*2.031394275E-23;
			    
	  			break;
				
	  			
		 case "Hin(Biblical) - hin":
	  			
			    cubicmeter=(edtValue)*0.0036666667;
			    cubickilometer=(edtValue)*3.666666666E-12 ;
			    cubiccentimeter=(edtValue)*3666.6666667;
			    cubicmillimeter=(edtValue)*3666666.6667;
			    liter=(edtValue)*3.6666666667;
			    milliliter=(edtValue)*3666.6666667;
			    gallon=(edtValue)*0.9686308586;
			    quart=(edtValue)*3.8745234346;
			    pintUS=(edtValue)*7.7490468692;
			    cupUS=(edtValue)*15.498093738;
			    tablespoonUS=(edtValue)*247.96949981;
			    teaspoonUS=(edtValue)*743.90849944;
			    cubicmile=(edtValue)*8.796801147E-13;
			    cubicyard=(edtValue)*0.0047958189;
			    cubicfoot=(edtValue)*0.1294871113;
			    cubicinch=(edtValue)*223.75372835;
			    cubicdecimeter=(edtValue)*3.6666666667;
			    exaliter=(edtValue)*3.666666666E-18;
			    petaliter=(edtValue)*3.666666666E-15;
			    teraliter=(edtValue)*3.666666666E-12;
			    gigaliter=(edtValue)*3.666666666E-9;
			    megaliter=(edtValue)*0.0000036667;
			    kiloliter=(edtValue)*0.0036666667;
			    hectoliter=(edtValue)*0.0366666667;
			    dekaliter=(edtValue)*0.3666666667;
			    deciliter=(edtValue)*36.666666667;
			    centiliter=(edtValue)*366.66666667;
			    microliter=(edtValue)*3666666.6667;
			    nanoliter=(edtValue)*3666666666.7;
			    picoliter=(edtValue)*3666666666667.0;
			    femtoliter=(edtValue)*3666666666666703.0;
			    attoliter=(edtValue)*3666666666666703000.0;
			    cc=(edtValue)*3666.6666667;
	  			
			    drop=(edtValue)*73333.333333;
			    barreloil=(edtValue)*0.0230626395 ;
			    barrelUS=(edtValue)*0.030750186;
			    barrelUK=(edtValue)*0.0224042753;
			    gallonUK=(edtValue)*0.8065539104;
			    quartUK=(edtValue)*3.2262156417;
			    pintUK=(edtValue)*6.4524312834;
			    cupmetric=(edtValue)*14.666666667;
			    cupUK=(edtValue)*12.904862567;
			    fluidounceUS=(edtValue)*123.98474991;
			    fluidounceUK=(edtValue)*129.04862567;
			    tablespoonmetric=(edtValue)*244.44444444;
			    tablespoonUK=(edtValue)*206.47780107;
			    dessertspoonUS=(edtValue)*371.95424972;
	  			
			    dessertspoonUK=(edtValue)*309.71670161;
			    teaspoonmetric=(edtValue)*733.33333333;
			    teaspoonUK=(edtValue)*619.43340321;
			    gillUS=(edtValue)*30.996187477;
			    gillUK=(edtValue)*25.809725134;
			    minimUS=(edtValue)*59512.679955;
			    minimUK=(edtValue)*61943.340321;
			    tonregister=(edtValue)*0.0012948711;
			    ccf=(edtValue)*0.0012948711;
			    hundresdcubicfoot=(edtValue)*0.0012948711;
			    acrefoot=(edtValue)*0.0000029726;
			    acrefootUSsurvey=(edtValue)*0.0000029726;
			    
			    
			    
			    acreinch=(edtValue)*0.0000356714;
			    dekastere=(edtValue)*0.0003666667;
			    stere=(edtValue)*0.0036666667;
			    decistere=(edtValue)*0.0366666667;
			    cord=(edtValue)*0.0010116181;
			    tun=(edtValue)*0.0038437732;
			    hogshead=(edtValue)*0.015375093;
			    boardfoot=(edtValue)*1.5538453357;
			    dram=(edtValue)*991.87799925;
			    cor=(edtValue)*0.0166666667;
			    homerBiblical=(edtValue)*0.0166666667;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.1666666667;
			    hinBiblical=(edtValue)*1;
			    cabBiblical=(edtValue)*3;
			    logBiblical=(edtValue)*12;
			    TazaSpanish=(edtValue)*15.498093738;
			    Earthsvolume=(edtValue)*3.385657125E-24;
			    
	  			break;
				
	  			
		 case "Cab(Biblical) - cab":
	  			
			    cubicmeter=(edtValue)*0.0012222222;
			    cubickilometer=(edtValue)*1.222222222E-12 ;
			    cubiccentimeter=(edtValue)*1222.2222222;
			    cubicmillimeter=(edtValue)*1222222.2222;
			    liter=(edtValue)*1.2222222222;
			    milliliter=(edtValue)*1222.2222222;
			    gallon=(edtValue)*0.3228769529;
			    quart=(edtValue)*1.2915078115;
			    pintUS=(edtValue)*2.5830156231;
			    cupUS=(edtValue)*5.1660312461;
			    tablespoonUS=(edtValue)*82.656499938;
			    teaspoonUS=(edtValue)*247.96949981;
			    cubicmile=(edtValue)*2.932267049E-13;
			    cubicyard=(edtValue)*0.0015986063;
			    cubicfoot=(edtValue)*0.0431623704;
			    cubicinch=(edtValue)*74.584576116;
			    cubicdecimeter=(edtValue)*1.2222222222;
			    exaliter=(edtValue)*1.222222222E-18;
			    petaliter=(edtValue)*1.222222222E-15;
			    teraliter=(edtValue)*1.222222222E-12;
			    gigaliter=(edtValue)*1.222222222E-9;
			    megaliter=(edtValue)*0.0000012222;
			    kiloliter=(edtValue)*0.0012222222;
			    hectoliter=(edtValue)*0.0122222222;
			    dekaliter=(edtValue)*0.1222222222;
			    deciliter=(edtValue)*12.222222222;
			    centiliter=(edtValue)*122.22222222;
			    microliter=(edtValue)*1222222.2222;
			    nanoliter=(edtValue)*1222222222.2;
			    picoliter=(edtValue)*1222222222222.0;
			    femtoliter=(edtValue)*1222222222222220.0;
			    attoliter=(edtValue)*1222222222222219500.0;
			    cc=(edtValue)*1222.2222222;
	  			
			    drop=(edtValue)*24444.444444;
			    barreloil=(edtValue)*0.0076875465 ;
			    barrelUS=(edtValue)*0.010250062;
			    barrelUK=(edtValue)*0.0074680918;
			    gallonUK=(edtValue)*0.2688513035;
			    quartUK=(edtValue)*1.0754052139;
			    pintUK=(edtValue)*2.1508104278;
			    cupmetric=(edtValue)*4.8888888889;
			    cupUK=(edtValue)*4.3016208556;
			    fluidounceUS=(edtValue)*41.328249969;
			    fluidounceUK=(edtValue)*43.016208556;
			    tablespoonmetric=(edtValue)*81.481481481;
			    tablespoonUK=(edtValue)*68.82593369;
			    dessertspoonUS=(edtValue)*123.98474991;
	  			
			    dessertspoonUK=(edtValue)*103.23890054;
			    teaspoonmetric=(edtValue)*244.44444444;
			    teaspoonUK=(edtValue)*206.47780107;
			    gillUS=(edtValue)*10.332062492;
			    gillUK=(edtValue)*8.6032417113;
			    minimUS=(edtValue)*19837.559985;
			    minimUK=(edtValue)*20647.780107;
			    tonregister=(edtValue)*0.0004316237;
			    ccf=(edtValue)*0.0004316237;
			    hundresdcubicfoot=(edtValue)*0.0004316237;
			    acrefoot=(edtValue)*9.908716812E-7;
			    acrefootUSsurvey=(edtValue)*9.90865736E-7;
			    
			    
			    
			    acreinch=(edtValue)*0.0000118905;
			    dekastere=(edtValue)*0.0001222222;
			    stere=(edtValue)*0.0012222222;
			    decistere=(edtValue)*0.0122222222;
			    cord=(edtValue)*0.000337206;
			    tun=(edtValue)*0.0012812577;
			    hogshead=(edtValue)*0.005125031;
			    boardfoot=(edtValue)*0.5179484452;
			    dram=(edtValue)*330.62599975;
			    cor=(edtValue)*0.0055555556;
			    homerBiblical=(edtValue)*0.0055555556;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.0555555556;
			    hinBiblical=(edtValue)*0.3333333333;
			    cabBiblical=(edtValue)*1;
			    logBiblical=(edtValue)*4;
			    TazaSpanish=(edtValue)*5.1660312461;
			    Earthsvolume=(edtValue)*1.128552375E-24;
			    
	  			break;
				
	  			
		 case "Log(Biblical) - log":
	  			
			    cubicmeter=(edtValue)*0.0003055556;
			    cubickilometer=(edtValue)*3.055555555E-13 ;
			    cubiccentimeter=(edtValue)*305.55555556;
			    cubicmillimeter=(edtValue)*305555.55556;
			    liter=(edtValue)*0.3055555556;
			    milliliter=(edtValue)*305.55555556;
			    gallon=(edtValue)*0.0807192382;
			    quart=(edtValue)*0.3228769529;
			    pintUS=(edtValue)*0.6457539058;
			    cupUS=(edtValue)*1.2915078115;
			    tablespoonUS=(edtValue)*20.664124984;
			    teaspoonUS=(edtValue)*61.992374953;
			    cubicmile=(edtValue)*7.330667623E-14;
			    cubicyard=(edtValue)*0.0003996516;
			    cubicfoot=(edtValue)*0.0107905926;
			    cubicinch=(edtValue)*18.646144029;
			    cubicdecimeter=(edtValue)*0.3055555556;
			    exaliter=(edtValue)*3.055555555E-19;
			    petaliter=(edtValue)*3.055555555E-16;
			    teraliter=(edtValue)*3.055555555E-13;
			    gigaliter=(edtValue)*3.055555555E-10;
			    megaliter=(edtValue)*3.055555555E-7;
			    kiloliter=(edtValue)*0.0003055556;
			    hectoliter=(edtValue)*0.0030555556;
			    dekaliter=(edtValue)*0.0305555556;
			    deciliter=(edtValue)*3.0555555556;
			    centiliter=(edtValue)*30.555555556;
			    microliter=(edtValue)*305555.55556;
			    nanoliter=(edtValue)*305555555.56;
			    picoliter=(edtValue)*305555555556.0;
			    femtoliter=(edtValue)*305555555555553.0;
			    attoliter=(edtValue)*305555555555553000.0;
			    cc=(edtValue)*305.55555556;
	  			
			    drop=(edtValue)*6111.1111111;
			    barreloil=(edtValue)* 0.0019218866;
			    barrelUS=(edtValue)*0.0025625155;
			    barrelUK=(edtValue)*0.0018670229;
			    gallonUK=(edtValue)*0.0672128259;
			    quartUK=(edtValue)*0.2688513035;
			    pintUK=(edtValue)*0.537702607;
			    cupmetric=(edtValue)*1.2222222222;
			    cupUK=(edtValue)*1.0754052139;
			    fluidounceUS=(edtValue)*10.332062492;
			    fluidounceUK=(edtValue)*10.754052139;
			    tablespoonmetric=(edtValue)*20.37037037;
			    tablespoonUK=(edtValue)*17.206483423;
			    dessertspoonUS=(edtValue)*30.996187477;
	  			
			    dessertspoonUK=(edtValue)*25.809725134;
			    teaspoonmetric=(edtValue)*61.111111111;
			    teaspoonUK=(edtValue)*51.619450268;
			    gillUS=(edtValue)*2.5830156231;
			    gillUK=(edtValue)*2.1508104278;
			    minimUS=(edtValue)*4959.3899963;
			    minimUK=(edtValue)*5161.9450268;
			    tonregister=(edtValue)*0.0001079059;
			    ccf=(edtValue)*0.0001079059;
			    hundresdcubicfoot=(edtValue)*0.0001079059;
			    acrefoot=(edtValue)*2.477179203E-7;
			    acrefootUSsurvey=(edtValue)*2.47716434E-7;
			    
			    
			    
			    acreinch=(edtValue)*0.0000029726;
			    dekastere=(edtValue)*0.0000305556;
			    stere=(edtValue)*0.0003055556;
			    decistere=(edtValue)*0.0030555556;
			    cord=(edtValue)*0.0000843015;
			    tun=(edtValue)*0.0003203144;
			    hogshead=(edtValue)*0.0012812577;
			    boardfoot=(edtValue)*0.1294871113;
			    dram=(edtValue)*82.656499938;
			    cor=(edtValue)*0.0013888889;
			    homerBiblical=(edtValue)*0.0013888889;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.0138888889;
			    hinBiblical=(edtValue)*0.0833333333;
			    cabBiblical=(edtValue)*0.25;
			    logBiblical=(edtValue)*1;
			    TazaSpanish=(edtValue)*1.2915078115;
			    Earthsvolume=(edtValue)*2.821380937E-25;
			    
	  			break;
				
	  			
		 case "Taza(Spanish) - taza":
	  			
			    cubicmeter=(edtValue)*0.0002365882;
			    cubickilometer=(edtValue)*2.365882364E-13 ;
			    cubiccentimeter=(edtValue)*236.5882365;
			    cubicmillimeter=(edtValue)*236588.2365;
			    liter=(edtValue)*0.2365882365;
			    milliliter=(edtValue)*236.5882365;
			    gallon=(edtValue)*0.0625;
			    quart=(edtValue)*0.25;
			    pintUS=(edtValue)*0.5;
			    cupUS=(edtValue)*1;
			    tablespoonUS=(edtValue)*16;
			    teaspoonUS=(edtValue)*48;
			    cubicmile=(edtValue)*5.676053646E-14;
			    cubicyard=(edtValue)*0.0003094457;
			    cubicfoot=(edtValue)*0.0083550347;
			    cubicinch=(edtValue)*14.4375;
			    cubicdecimeter=(edtValue)*0.2365882365;
			    exaliter=(edtValue)*2.365882364E-19;
			    petaliter=(edtValue)*2.365882364E-16;
			    teraliter=(edtValue)*2.365882364E-13;
			    gigaliter=(edtValue)*2.365882364E-10;
			    megaliter=(edtValue)*2.365882364E-7;
			    kiloliter=(edtValue)*0.0002365882;
			    hectoliter=(edtValue)*0.0023658824;
			    dekaliter=(edtValue)*0.0236588236;
			    deciliter=(edtValue)*2.365882365;
			    centiliter=(edtValue)*23.65882365;
			    microliter=(edtValue)*236588.2365;
			    nanoliter=(edtValue)*236588236.5;
			    picoliter=(edtValue)*236588236500.0;
			    femtoliter=(edtValue)*236588236499999.0;
			    attoliter=(edtValue)*236588236499998560.0;
			    cc=(edtValue)*236.5882365;
	  			
			    drop=(edtValue)*4731.76473;
			    barreloil=(edtValue)*0.0014880952 ;
			    barrelUS=(edtValue)*0.001984127;
			    barrelUK=(edtValue)*0.0014456149;
			    gallonUK=(edtValue)*0.0520421365;
			    quartUK=(edtValue)*0.2081685462;
			    pintUK=(edtValue)*0.4163370923;
			    cupmetric=(edtValue)*0.946352946;
			    cupUK=(edtValue)*0.8326741846;
			    fluidounceUS=(edtValue)*8;
			    fluidounceUK=(edtValue)*8.3267418463;
			    tablespoonmetric=(edtValue)*15.7725491;
			    tablespoonUK=(edtValue)*13.322786954;
			    dessertspoonUS=(edtValue)*24;
	  			
			    dessertspoonUK=(edtValue)*19.984180431;
			    teaspoonmetric=(edtValue)*47.3176473;
			    teaspoonUK=(edtValue)*39.968360862;
			    gillUS=(edtValue)*2;
			    gillUK=(edtValue)*1.6653483693;
			    minimUS=(edtValue)*3840;
			    minimUK=(edtValue)*3996.8360862;
			    tonregister=(edtValue)*0.0000835503;
			    ccf=(edtValue)*0.0000835503;
			    hundresdcubicfoot=(edtValue)*0.0000835503;
			    acrefoot=(edtValue)*1.918052048E-7;
			    acrefootUSsurvey=(edtValue)*1.918040539E-7;
			    
			    
			    
			    acreinch=(edtValue)*0.0000023017;
			    dekastere=(edtValue)*0.0000236588;
			    stere=(edtValue)*0.0002365882;
			    decistere=(edtValue)*0.0023658824;
			    cord=(edtValue)*0.0000652737;
			    tun=(edtValue)*0.0002480159;
			    hogshead=(edtValue)*0.0009920635;
			    boardfoot=(edtValue)*0.1002604167;
			    dram=(edtValue)*64;
			    cor=(edtValue)*0.0010754011;
			    homerBiblical=(edtValue)*0.0010754011;
	  			
	  			
			    
			    bathBiblical=(edtValue)*0.0107540108;
			    hinBiblical=(edtValue)*0.0645240645;
			    cabBiblical=(edtValue)*0.1935721935;
			    logBiblical=(edtValue)*0.774288774;
			    TazaSpanish=(edtValue)*1;
			    Earthsvolume=(edtValue)*2.184563587E-25;
			    
	  			break;
				
	  			
		 case "Earth's volume - earth":
	  			
			    cubicmeter=(edtValue)*1.082999999E+21;
			    cubickilometer=(edtValue)*1083000000000.0;
			    cubiccentimeter=(edtValue)*1.082999999E+27;
			    cubicmillimeter=(edtValue)*1.082999999E+30;
			    liter=(edtValue)*1.082999999E+24;
			    milliliter=(edtValue)*1.082999999E+27;
			    gallon=(edtValue)*2.860983327E+23;
			    quart=(edtValue)*1.14439333E+24;
			    pintUS=(edtValue)*2.288786661E+24;
			    cupUS=(edtValue)*4.577573323E+24;
			    tablespoonUS=(edtValue)*7.324117317E+25;
			    teaspoonUS=(edtValue)*2.197235195E+26;
			    cubicmile=(edtValue)*259825517541.0;
			    cubicyard=(edtValue)*1.41651052E+21;
			    cubicfoot=(edtValue)*3.824578405E+22;
			    cubicinch=(edtValue)*6.608871485E+25;
			    cubicdecimeter=(edtValue)*1.082999999E+24;
			    exaliter=(edtValue)*1083000;
			    petaliter=(edtValue)*1083000000;
			    teraliter=(edtValue)*1083000000000.0;
			    gigaliter=(edtValue)*1082999999999998.0;
			    megaliter=(edtValue)*1082999999999998000.0;
			    kiloliter=(edtValue)*1.082999999E+21;
			    hectoliter=(edtValue)*1.082999999E+22;
			    dekaliter=(edtValue)*1.082999999E+23;
			    deciliter=(edtValue)*1.082999999E+25;
			    centiliter=(edtValue)*1.082999999E+26;
			    microliter=(edtValue)*1.082999999E+30;
			    nanoliter=(edtValue)*1.082999999E+33;
			    picoliter=(edtValue)*1.082999999E+36;
			    femtoliter=(edtValue)*1.082999999E+39;
			    attoliter=(edtValue)*1.082999999E+42;
			    cc=(edtValue)*1.082999999E+27;
	  			
			    drop=(edtValue)*2.165999999E+28;
			    barreloil=(edtValue)*6.811865064E+21 ;
			    barrelUS=(edtValue)*9.082486752E+21;
			    barrelUK=(edtValue)*6.617408219E+21;
			    gallonUK=(edtValue)*2.382266959E+23;
			    quartUK=(edtValue)*9.529067836E+23;
			    pintUK=(edtValue)*1.905813567E+24;
			    cupmetric=(edtValue)*4.331999999E+24;
			    cupUK=(edtValue)*3.811627134E+24;
			    fluidounceUS=(edtValue)*3.662058658E+25;
			    fluidounceUK=(edtValue)*3.811627134E+25;
			    tablespoonmetric=(edtValue)*7.22E+25;
			    tablespoonUK=(edtValue)*6.098603415E+25;
			    dessertspoonUS=(edtValue)*1.098617597E+26;
	  			
			    dessertspoonUK=(edtValue)*9.147905122E+25;
			    teaspoonmetric=(edtValue)*2.165999999E+26;
			    teaspoonUK=(edtValue)*1.829581024E+26;
			    gillUS=(edtValue)*9.155146646E+24;
			    gillUK=(edtValue)*7.623254269E+24;
			    minimUS=(edtValue)*1.757788156E+28;
			    minimUK=(edtValue)*1.829581024E+28;
			    tonregister=(edtValue)*382457840593725160000.0;
			    ccf=(edtValue)*382457840593725160000.0;
			    hundresdcubicfoot=(edtValue)*382457840593725160000.0;
			    acrefoot=(edtValue)*878002388874470800.0;
			    acrefootUSsurvey=(edtValue)*877997120870678100.0;
			    
			    
			    
			    acreinch=(edtValue)*10536028666493628000.0;
			    dekastere=(edtValue)*108299999999999790000.0;
			    stere=(edtValue)*1.082999999E+21;
			    decistere=(edtValue)*1.082999999E+22;
			    cord=(edtValue)*298795187963844760000.0;
			    tun=(edtValue)*1.135310844E+21;
			    hogshead=(edtValue)*4.541243376E+21;
			    boardfoot=(edtValue)*4.589494087E+23;
			    dram=(edtValue)*2.929646926E+26;
			    cor=(edtValue)*4.922727272E+21;
			    homerBiblical=(edtValue)*4.922727272E+21;
	  			
	  			
			    
			    bathBiblical=(edtValue)*4.922727272E+22;
			    hinBiblical=(edtValue)*2.953636363E+23;
			    cabBiblical=(edtValue)*8.86090909E+23;
			    logBiblical=(edtValue)*3.544363636E+24;
			    TazaSpanish=(edtValue)*4.577573323E+24;
			    Earthsvolume=(edtValue)*1;
			    
	  	
		}
		
		
		
		results. setCubicmeter( cubicmeter) ;

		results.setCubickilometer( cubickilometer) ;

		results.  setCubiccentimeter( cubiccentimeter) ;

		results.  setCubicmillimeter( cubicmillimeter) ;

		results .setLiter( liter);

		results.  setMilliliter( milliliter);

		results.  setGallon( gallon);
		results.  setQuart( quart);
        results.  setPintUS(pintUS);
		
		results.  setCupUS( cupUS) ;

		results.  setTablespoonUS( tablespoonUS) ;

		results.  setTeaspoonUS( teaspoonUS);

		results.  setCubicmile( cubicmile); 

		results.  setCubicyard( cubicyard) ;

		results.  setCubicfoot( cubicfoot) ;

		results.  setCubicinch( cubicinch) ;

		results.  setCubicdecimeter( cubicdecimeter);

		results.  setExaliter( exaliter);


		results.  setPetaliter( petaliter) ;
		results.  setTeraliter( teraliter) ;

		results.  setGigaliter( gigaliter) ;

		results.  setMegaliter( megaliter) ;

		results.  setKiloliter( kiloliter) ;

		results.  setHectoliter( hectoliter) ;

		results.  setDekaliter( dekaliter) ;

		results.  setDeciliter( deciliter) ;

		results.  setCentiliter( centiliter) ;

		results.  setMicroliter( microliter); 

		results.  setNanoliter( nanoliter) ;

		results.  setPicoliter( picoliter) ;

		results.  setFemtoliter( femtoliter) ;

		results.  setAttoliter( attoliter) ;

		results.  setCc( cc);

		results.  setDrop( drop) ;

		results.  setBarreloil( barreloil);

		results.  setBarrelUS( barrelUS) ;

		results.  setBarrelUK( barrelUK) ;

		results.  setGallonUK( gallonUK) ;

		results.  setQuartUK( quartUK);

		results.  setPintUK( pintUK) ;

		results.  setCupmetric( cupmetric) ;

		results.  setCupUK( cupUK) ;
		results.  setFluidounceUS( fluidounceUS) ;

		results.  setFluidounceUK( fluidounceUK);

		results.  setTablespoonmetric( tablespoonmetric) ;

		results.  setTablespoonUK( tablespoonUK); 

		results.  setDessertspoonUS( dessertspoonUS);

		results.  setDessertspoonUK( dessertspoonUK) ;

		results.  setTeaspoonmetric( teaspoonmetric) ;
		

		results.  setTeaspoonUK( teaspoonUK) ;

		results.  setGillUS( gillUS);

		results.  setGillUK( gillUK) ;

		results.  setMinimUS( minimUS);

		results.  setMinimUK( minimUK);
		results.  setTonregister( tonregister) ;

		results.  setCcf( ccf);

		results. setHundredcubicfoot (hundresdcubicfoot);
		results.  setAcrefoot( acrefoot) ;

		results.  setAcrefootUSsurvey( acrefootUSsurvey) ;
		
		results.  setAcreinch( acreinch) ;

		results.  setDekastere( dekastere) ;

		results.  setStere( stere);

		results.  setDecistere( decistere); 

		results.  setCord( cord) ;

		results.  setTun( tun) ;

		results.  setHogshead( hogshead) ;

		results.  setBoardfoot( boardfoot);

		results.  setDram( dram); 
		results.  setCor( cor) ;

		results.  setHomerBiblical( homerBiblical); 

		results.  setBathBiblical( bathBiblical); 

		results.  setHinBiblical( hinBiblical) ;

		results.  setCabBiblical( cabBiblical) ;

	 results. setLogBiblical( logBiblical);

	results.  setTazaSpanish( TazaSpanish) ;

	results. setEarthsvolume(Earthsvolume) ;
			
		
		
		  converterArray.add(results);
		  return converterArray;

		
    }

	private void cupus() {
		cubicmeter=(edtValue)*0.0002365882;
		cubickilometer=(edtValue)* 2.365882364E-13;
		cubiccentimeter=(edtValue)*236.5882365;
		cubicmillimeter=(edtValue)*236588.2365;
		liter=(edtValue)*0.2365882365;
		milliliter=(edtValue)*236.5882365;
		gallon=(edtValue)*0.0625;
		quart=(edtValue)*0.25;
		pintUS=(edtValue)*0.5;
		cupUS=(edtValue)*1;
		tablespoonUS=(edtValue)*16;
		teaspoonUS=(edtValue)*48;
		cubicmile=(edtValue)*5.676053646E-14;
		cubicyard=(edtValue)*0.0003094457;
		cubicfoot=(edtValue)*0.0083550347;
		cubicinch=(edtValue)*14.4375;
		cubicdecimeter=(edtValue)*0.2365882365;
		exaliter=(edtValue)*2.365882364E-19;
		petaliter=(edtValue)*2.365882364E-16;
		teraliter=(edtValue)*2.365882364E-13;
		gigaliter=(edtValue)*2.365882364E-10;
		megaliter=(edtValue)*2.365882364E-7;
		kiloliter=(edtValue)*0.0002365882;
		hectoliter=(edtValue)*0.0023658824;
		dekaliter=(edtValue)*0.0236588236;
		deciliter=(edtValue)*2.365882365;
		centiliter=(edtValue)*23.65882365;
		microliter=(edtValue)*236588.2365;
		nanoliter=(edtValue)*236588236.5;
		picoliter=(edtValue)*236588236500.0;
		femtoliter=(edtValue)*236588236499999.0;
		attoliter=(edtValue)*236588236499998560.0;
		cc=(edtValue)*236.5882365;

		drop=(edtValue)*4731.76473;
		barreloil=(edtValue)*0.0014880952 ;
		barrelUS=(edtValue)*0.001984127;
		barrelUK=(edtValue)*0.0014456149;
		gallonUK=(edtValue)*0.0520421365;
		quartUK=(edtValue)*0.2081685462;
		pintUK=(edtValue)*0.4163370923;
		cupmetric=(edtValue)*0.946352946;
		cupUK=(edtValue)*0.8326741846;
		fluidounceUS=(edtValue)*8;
		fluidounceUK=(edtValue)*8.3267418463;
		tablespoonmetric=(edtValue)*15.7725491;
		tablespoonUK=(edtValue)*13.322786954;
		dessertspoonUS=(edtValue)*24;

		dessertspoonUK=(edtValue)*19.984180431;
		teaspoonmetric=(edtValue)*47.3176473;
		teaspoonUK=(edtValue)*39.968360862;
		gillUS=(edtValue)*2;
		gillUK=(edtValue)*1.6653483693;
		minimUS=(edtValue)*3840;
		minimUK=(edtValue)*3996.8360862;
		tonregister=(edtValue)*0.0000835503;
		ccf=(edtValue)*0.0000835503;
		hundresdcubicfoot=(edtValue)*0.0000835503;
		acrefoot=(edtValue)*1.918052048E-7;
		acrefootUSsurvey=(edtValue)*1.918040539E-7;

		acreinch=(edtValue)*0.0000023017;
		dekastere=(edtValue)*0.0000236588;
		stere=(edtValue)*0.0002365882;
		decistere=(edtValue)*0.0023658824;
		cord=(edtValue)*0.0000652737;
		tun=(edtValue)*0.0002480159;
		hogshead=(edtValue)*0.0009920635;
		boardfoot=(edtValue)*0.1002604167;
		dram=(edtValue)*64;
		cor=(edtValue)*0.0010754011;
		homerBiblical=(edtValue)*0.0010754011;

		bathBiblical=(edtValue)*0.0107540108;
		hinBiblical=(edtValue)*0.0645240645;
		cabBiblical=(edtValue)*0.1935721935;
		logBiblical=(edtValue)*0.774288774;
		TazaSpanish=(edtValue)*1;
		Earthsvolume=(edtValue)*2.184563587E-25;

	}

	private void pintus() {
		cubicmeter=(edtValue)*0.0004731765;
		cubickilometer=(edtValue)*4.731764729E-13 ;
		cubiccentimeter=(edtValue)*473.176473;
		cubicmillimeter=(edtValue)*473176.473;
		liter=(edtValue)*0.473176473;
		milliliter=(edtValue)*473.176473;
		gallon=(edtValue)*0.125;
		quart=(edtValue)*0.5;
		pintUS=(edtValue)*1;
		cupUS=(edtValue)*2;
		tablespoonUS=(edtValue)*32;
		teaspoonUS=(edtValue)*96;
		cubicmile=(edtValue)*1.135210729E-13;
		cubicyard=(edtValue)*0.0006188915;
		cubicfoot=(edtValue)*0.0167100694;
		cubicinch=(edtValue)*28.875;
		cubicdecimeter=(edtValue)*0.473176473;
		exaliter=(edtValue)*4.731764729E-19;
		petaliter=(edtValue)*4.731764729E-16;
		teraliter=(edtValue)*4.731764729E-13;
		gigaliter=(edtValue)*4.731764729E-10;
		megaliter=(edtValue)*4.731764729E-7;
		kiloliter=(edtValue)*0.0004731765;
		hectoliter=(edtValue)*0.0047317647;
		dekaliter=(edtValue)*0.0473176473;
		deciliter=(edtValue)*4.73176473;
		centiliter=(edtValue)*47.3176473;
		microliter=(edtValue)*473176.473;
		nanoliter=(edtValue)*473176473.0;
		picoliter=(edtValue)*473176473000.0;
		femtoliter=(edtValue)*473176472999997.0;
		attoliter=(edtValue)*473176472999997100.0;
		cc=(edtValue)*473.176473;

		drop=(edtValue)*9463.52946;
		barreloil=(edtValue)*0.0029761905 ;
		barrelUS=(edtValue)*0.003968254;
		barrelUK=(edtValue)*0.0028912298;
		gallonUK=(edtValue)*0.1040842731;
		quartUK=(edtValue)*0.4163370923;
		pintUK=(edtValue)*0.8326741846;
		cupmetric=(edtValue)*1.892705892;
		cupUK=(edtValue)*1.6653483693;
		fluidounceUS=(edtValue)*16;
		fluidounceUK=(edtValue)*16.653483693;
		tablespoonmetric=(edtValue)*31.5450982;
		tablespoonUK=(edtValue)*26.645573908;
		dessertspoonUS=(edtValue)*48;

		dessertspoonUK=(edtValue)*39.968360862;
		teaspoonmetric=(edtValue)*94.6352946;
		teaspoonUK=(edtValue)*79.936721724;
		gillUS=(edtValue)*4;
		gillUK=(edtValue)*3.3306967385;
		minimUS=(edtValue)*7680;
		minimUK=(edtValue)*7993.6721724;
		tonregister=(edtValue)*0.0001671007;
		ccf=(edtValue)*0.0001671007;
		hundresdcubicfoot=(edtValue)*0.0001671007;
		acrefoot=(edtValue)*3.836104096E-7;
		acrefootUSsurvey=(edtValue)*3.836081079E-7;

		acreinch=(edtValue)*0.0000046033;
		dekastere=(edtValue)*0.0000473176;
		stere=(edtValue)*0.0004731765;
		decistere=(edtValue)*0.0047317647;
		cord=(edtValue)*0.0001305474;
		tun=(edtValue)*0.0004960317;
		hogshead=(edtValue)*0.001984127;
		boardfoot=(edtValue)*0.2005208333;
		dram=(edtValue)*128;
		cor=(edtValue)*0.0021508022;
		homerBiblical=(edtValue)*0.0021508022;

		bathBiblical=(edtValue)*0.0215080215;
		hinBiblical=(edtValue)*0.129048129;
		cabBiblical=(edtValue)*0.387144387;
		logBiblical=(edtValue)*1.548577548;
		TazaSpanish=(edtValue)*2;
		Earthsvolume=(edtValue)*4.369127174E-25;

	}

	private void quartus() {
		cubicmeter=(edtValue)*0.0009463529;
		cubickilometer=(edtValue)* 9.463529459E-13;
		cubiccentimeter=(edtValue)*946.352946;
		cubicmillimeter=(edtValue)*946352.946;
		liter=(edtValue)*946352.946;
		milliliter=(edtValue)*946.352946;
		gallon=(edtValue)*0.25;
		quart=(edtValue)*1;
		pintUS=(edtValue)*2;
		cupUS=(edtValue)*4;
		tablespoonUS=(edtValue)*64;
		teaspoonUS=(edtValue)*192;
		cubicmile=(edtValue)*2.270421458E-13;
		cubicyard=(edtValue)*0.0012377829;
		cubicfoot=(edtValue)*0.0334201389;
		cubicinch=(edtValue)*57.75;
		cubicdecimeter=(edtValue)*0.946352946;
		exaliter=(edtValue)*9.463529459E-19;
		petaliter=(edtValue)*9.463529459E-16;
		teraliter=(edtValue)*9.463529459E-13;
		gigaliter=(edtValue)*9.463529459E-10;
		megaliter=(edtValue)*9.463529459E-7;
		kiloliter=(edtValue)*0.0009463529;
		hectoliter=(edtValue)*0.0094635295;
		dekaliter=(edtValue)*0.0946352946;
		deciliter=(edtValue)*9.46352946;
		centiliter=(edtValue)*94.6352946;
		microliter=(edtValue)*946352.946;
		nanoliter=(edtValue)*946352946;
		picoliter=(edtValue)*946352946000.0;
		femtoliter=(edtValue)*946352945999994.0;
		attoliter=(edtValue)*946352945999994200.0;
		cc=(edtValue)*946.352946;

		drop=(edtValue)*18927.05892;
		barreloil=(edtValue)*0.005952381 ;
		barrelUS=(edtValue)*0.0079365079;
		barrelUK=(edtValue)*0.0057824596;
		gallonUK=(edtValue)*0.2081685462;
		quartUK=(edtValue)*0.8326741846;
		pintUK=(edtValue)*1.6653483693;
		cupmetric=(edtValue)*3.785411784;
		cupUK=(edtValue)*3.3306967385;
		fluidounceUS=(edtValue)*32;
		fluidounceUK=(edtValue)*33.306967385;
		tablespoonmetric=(edtValue)*63.0901964;
		tablespoonUK=(edtValue)*53.291147816;
		dessertspoonUS=(edtValue)*96;

		dessertspoonUK=(edtValue)*79.936721724;
		teaspoonmetric=(edtValue)*189.2705892;
		teaspoonUK=(edtValue)*159.87344345;
		gillUS=(edtValue)*8;
		gillUK=(edtValue)*6.661393477;
		minimUS=(edtValue)*15360;
		minimUK=(edtValue)*15987.344345;
		tonregister=(edtValue)*0.0003342014;
		ccf=(edtValue)*0.0003342014;
		hundresdcubicfoot=(edtValue)*0.0003342014;
		acrefoot=(edtValue)*7.672208193E-7;
		acrefootUSsurvey=(edtValue)*7.672162159E-7;

		acreinch=(edtValue)*0.0000092066;
		dekastere=(edtValue)*0.0000946353;
		stere=(edtValue)*0.0009463529;
		decistere=(edtValue)*0.0094635295;
		cord=(edtValue)*0.0002610948;
		tun=(edtValue)*0.0009920635;
		hogshead=(edtValue)*0.003968254;
		boardfoot=(edtValue)*0.4010416667;
		dram=(edtValue)*256;
		cor=(edtValue)*0.0043016043;
		homerBiblical=(edtValue)*0.0043016043;

		bathBiblical=(edtValue)*0.043016043;
		hinBiblical=(edtValue)*0.258096258;
		cabBiblical=(edtValue)*0.774288774;
		logBiblical=(edtValue)*3.097155096;
		TazaSpanish=(edtValue)*4;
		Earthsvolume=(edtValue)*8.738254349E-25;
	}

	private void gallonus() {
		cubicmeter=(edtValue)*0.0037854118;
		cubickilometer=(edtValue)*3.785411783E-12 ;
		cubiccentimeter=(edtValue)*3785.411784;
		cubicmillimeter=(edtValue)*3785411.784;
		liter=(edtValue)*3.785411784;
		milliliter=(edtValue)*3785.411784;
		gallon=(edtValue)*1;
		quart=(edtValue)*4;
		pintUS=(edtValue)*8;
		cupUS=(edtValue)*16;
		tablespoonUS=(edtValue)*256;
		teaspoonUS=(edtValue)*768;
		cubicmile=(edtValue)*9.081685834E-13;
		cubicyard=(edtValue)*0.0049511317;
		cubicfoot=(edtValue)*0.1336805556;
		cubicinch=(edtValue)*231;
		cubicdecimeter=(edtValue)*3.785411784;
		exaliter=(edtValue)*3.785411783E-18;
		petaliter=(edtValue)*3.785411783E-15;
		teraliter=(edtValue)*3.785411783E-12;
		gigaliter=(edtValue)*3.785411783E-9;
		megaliter=(edtValue)*0.0000037854;
		kiloliter=(edtValue)*0.0037854118;
		hectoliter=(edtValue)*0.0378541178;
		dekaliter=(edtValue)*0.3785411784;
		deciliter=(edtValue)*37.85411784;
		centiliter=(edtValue)*378.5411784;
		microliter=(edtValue)*3785411.784;
		nanoliter=(edtValue)*3785411784.0;
		picoliter=(edtValue)*3785411784000.0;
		femtoliter=(edtValue)*3785411783999977.0;
		attoliter=(edtValue)*3785411783999977000.0;
		cc=(edtValue)*3785.411784;

		drop=(edtValue)*75708.23568;
		barreloil=(edtValue)*0.0238095238 ;
		barrelUS=(edtValue)*0.0317460317;
		barrelUK=(edtValue)*0.0231298385;
		gallonUK=(edtValue)*0.8326741846;
		quartUK=(edtValue)*3.3306967385;
		pintUK=(edtValue)*6.661393477;
		cupmetric=(edtValue)*15.141647136;
		cupUK=(edtValue)*13.322786954;
		fluidounceUS=(edtValue)*128;
		fluidounceUK=(edtValue)*133.22786954;
		tablespoonmetric=(edtValue)*252.3607856;
		tablespoonUK=(edtValue)*213.16459127;
		dessertspoonUS=(edtValue)*384;

		dessertspoonUK=(edtValue)*319.7468869;
		teaspoonmetric=(edtValue)*757.0823568;
		teaspoonUK=(edtValue)*639.4937738;
		gillUS=(edtValue)*32;
		gillUK=(edtValue)*26.645573908;
		minimUS=(edtValue)*61440;
		minimUK=(edtValue)*63949.37738;
		tonregister=(edtValue)*0.0013368056;
		ccf=(edtValue)*0.0013368056;
		hundresdcubicfoot=(edtValue)*0.0013368056;
		acrefoot=(edtValue)*0.0000030689;
		acrefootUSsurvey=(edtValue)*0.0000030689;

		acreinch=(edtValue)*0.0000368266;
		dekastere=(edtValue)*0.0003785412;
		stere=(edtValue)*0.0037854118;
		decistere=(edtValue)*0.0378541178;
		cord=(edtValue)*0.0010443793;
		tun=(edtValue)*0.003968254;
		hogshead=(edtValue)*0.0158730159;
		boardfoot=(edtValue)*1.6041666667;
		dram=(edtValue)*1024;
		cor=(edtValue)*0.0172064172;
		homerBiblical=(edtValue)*0.0172064172;

		bathBiblical=(edtValue)*0.172064172;
		hinBiblical=(edtValue)*1.032385032;
		cabBiblical=(edtValue)*3.097155096;
		logBiblical=(edtValue)*12.388620384;
		TazaSpanish=(edtValue)*16;
		Earthsvolume=(edtValue)*3.495301739E-24;

	}

	private void milliliter() {
		cubicmeter=(edtValue)*0.000001;
		cubickilometer=(edtValue)*1.E-15 ;
		cubiccentimeter=(edtValue)*1;
		cubicmillimeter=(edtValue)*1000;
		liter=(edtValue)*0.001;
		milliliter=(edtValue)*1;
		gallon=(edtValue)*0.0002641721;
		quart=(edtValue)*0.0010566882;
		pintUS=(edtValue)*0.0021133764;
		cupUS=(edtValue)*0.0042267528;
		tablespoonUS=(edtValue)*0.0676280454;
		teaspoonUS=(edtValue)*0.2028841362;
		cubicmile=(edtValue)*2.399127585E-16;
		cubicyard=(edtValue)*0.000001308;
		cubicfoot=(edtValue)*0.0000353147;
		cubicinch=(edtValue)*0.0610237441;
		cubicdecimeter=(edtValue)*0.001;
		exaliter=(edtValue)*1.E-21;
		petaliter=(edtValue)*1.E-18;
		teraliter=(edtValue)*1.E-15;
		gigaliter=(edtValue)*1.E-12;
		megaliter=(edtValue)*1.E-9;
		kiloliter=(edtValue)*0.000001;
		hectoliter=(edtValue)*0.00001;
		dekaliter=(edtValue)*0.0001;
		deciliter=(edtValue)*0.01;
		centiliter=(edtValue)*0.1;
		microliter=(edtValue)*1000;
		nanoliter=(edtValue)*1000000;
		picoliter=(edtValue)*1000000000;
		femtoliter=(edtValue)*1000000000000.0;
		attoliter=(edtValue)*1000000000000000.0;
		cc=(edtValue)*1;

		drop=(edtValue)*20;
		barreloil=(edtValue)* 0.0000062898;
		barrelUS=(edtValue)*0.0000083864;
		barrelUK=(edtValue)*0.0000061103;
		gallonUK=(edtValue)*0.0002199692;
		quartUK=(edtValue)*0.000879877;
		pintUK=(edtValue)*0.001759754;
		cupmetric=(edtValue)*0.004;
		cupUK=(edtValue)*0.003519508;
		fluidounceUS=(edtValue)*0.0338140227;
		fluidounceUK=(edtValue)*0.0351950797;
		tablespoonmetric=(edtValue)*0.0666666667;
		tablespoonUK=(edtValue)*0.0563121276;
		dessertspoonUS=(edtValue)*0.1014420681;

		dessertspoonUK=(edtValue)*0.0844681913;
		teaspoonmetric=(edtValue)*0.2;
		teaspoonUK=(edtValue)*0.1689363827;
		gillUS=(edtValue)*0.0084535057;
		gillUK=(edtValue)*0.0070390159;
		minimUS=(edtValue)*16.230730897;
		minimUK=(edtValue)*16.893638269;
		tonregister=(edtValue)*3.531466672E-7;
		ccf=(edtValue)*3.531466672E-7;
		hundresdcubicfoot=(edtValue)*3.531466672E-7;
		acrefoot=(edtValue)*8.107131937E-10;
		acrefootUSsurvey=(edtValue)*8.107083295E-10;

		acreinch=(edtValue)*9.728558325E-9;
		dekastere=(edtValue)*1.E-7;
		stere=(edtValue)*0.000001;
		decistere=(edtValue)*0.00001;
		cord=(edtValue)*2.758958337E-7;
		tun=(edtValue)*0.0000010483;
		hogshead=(edtValue)*0.0000041932;
		boardfoot=(edtValue)*0.000423776;
		dram=(edtValue)*0.2705121816;
		cor=(edtValue)*0.0000045455;
		homerBiblical=(edtValue)*0.0000045455;

		bathBiblical=(edtValue)*0.0000454545;
		hinBiblical=(edtValue)*0.0002727273;
		cabBiblical=(edtValue)*0.0008181818;
		logBiblical=(edtValue)*0.0032727273;
		TazaSpanish=(edtValue)*0.0042267528;
		Earthsvolume=(edtValue)*9.233610341E-28;

	}

	private void liter() {
		cubicmeter=(edtValue)*0.001;
		cubickilometer=(edtValue)*1.E-12 ;
		cubiccentimeter=(edtValue)*1000;
		cubicmillimeter=(edtValue)*1000000;
		liter=(edtValue)*1;
		milliliter=(edtValue)*1000;
		gallon=(edtValue)*0.2641720524;
		quart=(edtValue)*1.0566882094;
		pintUS=(edtValue)*2.1133764189;
		cupUS=(edtValue)*4.2267528377;
		tablespoonUS=(edtValue)*67.628045404;
		teaspoonUS=(edtValue)*202.88413621;
		cubicmile=(edtValue)*2.399127585E-13;
		cubicyard=(edtValue)*0.0013079506;
		cubicfoot=(edtValue)*0.0353146667;
		cubicinch=(edtValue)*61.023744095;
		cubicdecimeter=(edtValue)*1;
		exaliter=(edtValue)*1.E-18;
		petaliter=(edtValue)*1.E-15;
		teraliter=(edtValue)*1.E-12;
		gigaliter=(edtValue)*1.E-9;
		megaliter=(edtValue)*0.000001;
		kiloliter=(edtValue)*0.001;
		hectoliter=(edtValue)*0.01;
		dekaliter=(edtValue)*0.1;
		deciliter=(edtValue)*10;
		centiliter=(edtValue)*100;
		microliter=(edtValue)*1000000;
		nanoliter=(edtValue)*1000000000.0;
		picoliter=(edtValue)*1000000000000.0;
		femtoliter=(edtValue)*1000000000000000.0;
		attoliter=(edtValue)*1000000000000000000.0;
		cc=(edtValue)*1000;

		drop=(edtValue)*20000;
		barreloil=(edtValue)*0.0062898108 ;
		barrelUS=(edtValue)*0.0083864144;
		barrelUK=(edtValue)*0.0061102569;
		gallonUK=(edtValue)*0.2199692483;
		quartUK=(edtValue)*0.8798769932;
		pintUK=(edtValue)*1.7597539864;
		cupmetric=(edtValue)*4;
		cupUK=(edtValue)*3.5195079728;
		fluidounceUS=(edtValue)*33.814022702;
		fluidounceUK=(edtValue)*35.195079728;
		tablespoonmetric=(edtValue)*66.666666667;
		tablespoonUK=(edtValue)*56.312127565;
		dessertspoonUS=(edtValue)*101.44206811;

		dessertspoonUK=(edtValue)*84.468191347;
		teaspoonmetric=(edtValue)*200;
		teaspoonUK=(edtValue)*168.93638269;
		gillUS=(edtValue)*8.4535056755;
		gillUK=(edtValue)*7.0390159456;
		minimUS=(edtValue)*16230.730897;
		minimUK=(edtValue)*16893.638269;
		tonregister=(edtValue)*0.0003531467;
		ccf=(edtValue)*0.0003531467;
		hundresdcubicfoot=(edtValue)*0.0003531467;
		acrefoot=(edtValue)*8.107131937E-7;
		acrefootUSsurvey=(edtValue)*8.107083295E-7;
		acreinch=(edtValue)*0.0000097286;
		dekastere=(edtValue)*0.0001;
		stere=(edtValue)*0.001;
		decistere=(edtValue)*0.01;
		cord=(edtValue)*0.0002758958;
		tun=(edtValue)*0.0010483018;
		hogshead=(edtValue)*0.0041932072;
		boardfoot=(edtValue)*0.4237760007;
		dram=(edtValue)*270.51218161;
		cor=(edtValue)*0.0045454545;
		homerBiblical=(edtValue)*0.0045454545;
		bathBiblical=(edtValue)*0.0454545455;
		hinBiblical=(edtValue)*0.2727272727;
		cabBiblical=(edtValue)*0.8181818182;
		logBiblical=(edtValue)*3.2727272727;
		TazaSpanish=(edtValue)*4.2267528377;
		Earthsvolume=(edtValue)*9.233610341E-25;

	}

	private void cubicmilimeter() {
		cubicmeter=(edtValue)*1.E-9;
		cubickilometer=(edtValue)*1.E-18 ;
		cubiccentimeter=(edtValue)*0.001;
		cubicmillimeter=(edtValue)* 1;
		liter=(edtValue)*0.000001;
		milliliter=(edtValue)*0.001;
		gallon=(edtValue)*2.641720523E-7;
		quart=(edtValue)*0.0000010567;
		pintUS=(edtValue)*0.0000021134;
		cupUS=(edtValue)*0.0000042268;
		tablespoonUS=(edtValue)*0.000067628;
		teaspoonUS=(edtValue)*0.0002028841;
		cubicmile=(edtValue)*2.399127585E-19;
		cubicyard=(edtValue)*1.307950619E-9;
		cubicfoot=(edtValue)*3.531466672E-8;
		cubicinch=(edtValue)*0.0000610237;
		cubicdecimeter=(edtValue)*0.000001;
		exaliter=(edtValue)*1.E-24;
		petaliter=(edtValue)*1.E-21;
		teraliter=(edtValue)*1.E-18;
		gigaliter=(edtValue)*1.E-15;
		megaliter=(edtValue)*1.E-12;
		kiloliter=(edtValue)*1.E-9;
		hectoliter=(edtValue)*1.E-8;
		dekaliter=(edtValue)*1.E-7;
		deciliter=(edtValue)*0.00001;
		centiliter=(edtValue)*0.0001;
		microliter=(edtValue)*1;
		nanoliter=(edtValue)*1000;
		picoliter=(edtValue)*1000000;
		femtoliter=(edtValue)*1000000000;
		attoliter=(edtValue)*1000000000000.0;
		cc=(edtValue)*0.001;

		drop=(edtValue)*0.02;
		barreloil=(edtValue)*6.28981077E-9 ;
		barrelUS=(edtValue)*8.38641436E-9;
		barrelUK=(edtValue)*6.110256897E-9;
		gallonUK=(edtValue)*2.199692482E-7;
		quartUK=(edtValue)*8.798769931E-7;
		pintUK=(edtValue)*0.0000017598;
		cupmetric=(edtValue)*0.000004;
		cupUK=(edtValue)*0.0000035195;
		fluidounceUS=(edtValue)*0.000033814;
		fluidounceUK=(edtValue)*0.0000351951;
		tablespoonmetric=(edtValue)*0.0000666667;
		tablespoonUK=(edtValue)*0.0000563121;
		dessertspoonUS=(edtValue)*0.0001014421;

		dessertspoonUK=(edtValue)*0.0000844682;
		teaspoonmetric=(edtValue)*0.0002;
		teaspoonUK=(edtValue)*0.0001689364;
		gillUS=(edtValue)*0.0000084535;
		gillUK=(edtValue)*0.000007039;
		minimUS=(edtValue)*0.0162307309;
		minimUK=(edtValue)*0.0168936383;
		tonregister=(edtValue)*3.531466672E-10;
		ccf=(edtValue)*3.531466672E-10;
		hundresdcubicfoot=(edtValue)*3.531466672E-10;
		acrefoot=(edtValue)*8.107131937E-13;
		acrefootUSsurvey=(edtValue)*8.107083295E-13;
		acreinch=(edtValue)*9.728558325E-12;
		dekastere=(edtValue)*1.E-10;
		stere=(edtValue)*1.E-9;
		decistere=(edtValue)*1.E-8;
		cord=(edtValue)*2.758958337E-10;
		tun=(edtValue)*2.758958337E-10;
		hogshead=(edtValue)*4.19320718E-9;
		boardfoot=(edtValue)*4.237760006E-7;
		dram=(edtValue)*0.0002705122;
		cor=(edtValue)*4.545454545E-9;
		homerBiblical=(edtValue)*4.545454545E-9;

		bathBiblical=(edtValue)*4.545454545E-8;
		hinBiblical=(edtValue)*2.727272727E-7;
		cabBiblical=(edtValue)*8.181818181E-7;
		logBiblical=(edtValue)*0.0000032727;
		TazaSpanish=(edtValue)*0.0000042268;
		Earthsvolume=(edtValue)*9.233610341E-31;

	}

	private void cubiccentimeter() {
		cubicmeter=(edtValue)*0.000001;
		cubickilometer=(edtValue)*1.E-15 ;
		cubiccentimeter=(edtValue)*1;
		cubicmillimeter=(edtValue)*1000;
		liter=(edtValue)*0.001;
		milliliter=(edtValue)*1;
		gallon=(edtValue)*0.0002641721;
		quart=(edtValue)*0.0010566882;
		pintUS=(edtValue)*0.0021133764;
		cupUS=(edtValue)*0.0042267528;
		tablespoonUS=(edtValue)*0.0676280454;
		teaspoonUS=(edtValue)*0.2028841362;
		cubicmile=(edtValue)*2.399127585E-16;
		cubicyard=(edtValue)*0.000001308;
		cubicfoot=(edtValue)*0.0000353147;
		cubicinch=(edtValue)*0.0610237441;
		cubicdecimeter=(edtValue)*0.001;
		exaliter=(edtValue)*1.E-21;
		petaliter=(edtValue)*1.E-18;
		teraliter=(edtValue)*1.E-15;
		gigaliter=(edtValue)*1.E-12;
		megaliter=(edtValue)*1.E-9;
		kiloliter=(edtValue)*0.000001;
		hectoliter=(edtValue)*0.00001;
		dekaliter=(edtValue)*0.0001;
		deciliter=(edtValue)*0.01;
		centiliter=(edtValue)*0.1;
		microliter=(edtValue)*1000;
		nanoliter=(edtValue)*1000000;
		picoliter=(edtValue)*1000000000;
		femtoliter=(edtValue)*1000000000000.0;
		attoliter=(edtValue)*1000000000000000.0;
		cc=(edtValue)*1;

		drop=(edtValue)*20;
		barreloil=(edtValue)*0.0000062898 ;
		barrelUS=(edtValue)*0.0000083864;
		barrelUK=(edtValue)*0.0000061103;
		gallonUK=(edtValue)*0.0002199692;
		quartUK=(edtValue)*0.000879877;
		pintUK=(edtValue)*0.001759754;
		cupmetric=(edtValue)*0.004;
		cupUK=(edtValue)*0.003519508;
		fluidounceUS=(edtValue)*0.0338140227;
		fluidounceUK=(edtValue)*0.0351950797;
		tablespoonmetric=(edtValue)*0.0666666667;
		tablespoonUK=(edtValue)*0.0563121276;
		dessertspoonUS=(edtValue)*0.1014420681;

		dessertspoonUK=(edtValue)*0.0844681913;
		teaspoonmetric=(edtValue)*0.2;
		teaspoonUK=(edtValue)*0.1689363827;
		gillUS=(edtValue)*0.0084535057;
		gillUK=(edtValue)*0.0070390159;
		minimUS=(edtValue)*16.230730897;
		minimUK=(edtValue)*16.893638269;
		tonregister=(edtValue)*3.531466672E-7;
		ccf=(edtValue)*3.531466672E-7;
		hundresdcubicfoot=(edtValue)*3.531466672E-7;
		acrefoot=(edtValue)*8.107131937E-10;
		acrefootUSsurvey=(edtValue)*8.107083295E-10;

		acreinch=(edtValue)*9.728558325E-9;
		dekastere=(edtValue)*1.E-7;
		stere=(edtValue)*0.000001;
		decistere=(edtValue)*0.00001;
		cord=(edtValue)*2.758958337E-7;
		tun=(edtValue)*0.0000010483;
		hogshead=(edtValue)*0.0000041932;
		boardfoot=(edtValue)*0.000423776;
		dram=(edtValue)*0.2705121816;
		cor=(edtValue)*0.0000045455;
		homerBiblical=(edtValue)*0.0000045455;
     	bathBiblical=(edtValue)*0.0000454545;
		hinBiblical=(edtValue)*0.0002727273;
		cabBiblical=(edtValue)*0.0008181818;
		logBiblical=(edtValue)*0.0032727273;
		TazaSpanish=(edtValue)*0.0042267528;
		Earthsvolume=(edtValue)*9.233610341E-28;
	}

	private void cubickilometer() {
		cubicmeter=(edtValue)*1000000000;
		cubickilometer=(edtValue)*1 ;
		cubiccentimeter=(edtValue)*1000000000000000.0;
		cubicmillimeter=(edtValue)*1000000000000000000.0;
		liter=(edtValue)*1000000000000.0;
		milliliter=(edtValue)*1000000000000000.0;
		gallon=(edtValue)*264172052358.0;
		quart=(edtValue)*1056688209433.0;
		pintUS=(edtValue)*2113376418865.0;
		cupUS=(edtValue)*4226752837730.0;
		tablespoonUS=(edtValue)*67628045403686.0;
		teaspoonUS=(edtValue)*202884136211060.0;
		cubicmile=(edtValue)*0.2399127586;
		cubicyard=(edtValue)*1307950619.3;
		cubicfoot=(edtValue)*35314666721.0;
		cubicinch=(edtValue)*61023744094732.0;
		cubicdecimeter=(edtValue)*1000000000000.0;
		exaliter=(edtValue)*0.000001;
		petaliter=(edtValue)*0.001;
		teraliter=(edtValue)*1;
		gigaliter=(edtValue)*1000;
		megaliter=(edtValue)*1000000;
		kiloliter=(edtValue)*1000000000;
		hectoliter=(edtValue)*10000000000.0;
		dekaliter=(edtValue)*100000000000.0;
		deciliter=(edtValue)*10000000000000.0;
		centiliter=(edtValue)*100000000000000.0;
		microliter=(edtValue)*1000000000000000000.0;
		nanoliter=(edtValue)*1.E+21;
		picoliter=(edtValue)*1.E+24;
		femtoliter=(edtValue)*1.E+27;
		attoliter=(edtValue)*1.E+30;
		cc=(edtValue)*1000000000000000.0;

		drop=(edtValue)*20000000000000000.0;
		barreloil=(edtValue)*6289810770.4 ;
		barrelUS=(edtValue)*8386414360.6;
		barrelUK=(edtValue)*6110256897.2;
		gallonUK=(edtValue)*219969248299.0;
		quartUK=(edtValue)*879876993196.0;
		pintUK=(edtValue)*1759753986393.0;
		cupmetric=(edtValue)*4000000000000.0;
		cupUK=(edtValue)*3519507972785.0;
		fluidounceUS=(edtValue)*33814022701843.0;
		fluidounceUK=(edtValue)*35195079727854.0;
		tablespoonmetric=(edtValue)*66666666666667.0;
		tablespoonUK=(edtValue)*56312127564566.0;
		dessertspoonUS=(edtValue)*101442068105530.0;

		dessertspoonUK=(edtValue)*84468191346850.0;
		teaspoonmetric=(edtValue)*200000000000000.0;
		teaspoonUK=(edtValue)*168936382693700.0;
		gillUS=(edtValue)*8453505675461.0;
		gillUK=(edtValue)*7039015945571.0;
		minimUS=(edtValue)*16230730896884998.0;
		minimUK=(edtValue)*16893638269370000.0;
		tonregister=(edtValue)*353146667.21;
		ccf=(edtValue)*353146667.21;
		hundresdcubicfoot=(edtValue)*353146667.21;
		acrefoot=(edtValue)*810713.19379;
		acrefootUSsurvey=(edtValue)*810708.32952;

		acreinch=(edtValue)*9728558.3255;
		dekastere=(edtValue)*100000000;
		stere=(edtValue)*1000000000;
		decistere=(edtValue)*10000000000.0;
		cord=(edtValue)*275895833.76;
		tun=(edtValue)*1048301795.1;
		hogshead=(edtValue)*4193207180.3;
		boardfoot=(edtValue)*423776000658.0;
		dram=(edtValue)*270512181614740.0;
		cor=(edtValue)*4545454545.5;
		homerBiblical=(edtValue)*4545454545.5;

		bathBiblical=(edtValue)*45454545455.0;
		hinBiblical=(edtValue)*272727272727.0;
		cabBiblical=(edtValue)*818181818182.0;
		logBiblical=(edtValue)*3272727272727.0;
		TazaSpanish=(edtValue)*4226752837730.0;
		Earthsvolume=(edtValue)*9.233610341E-13;
	}

	private void cubicmeter() {
		cubicmeter=(edtValue)*1;
		cubickilometer=(edtValue)*1.E-9;
		cubiccentimeter=(edtValue)*1000000;
		cubicmillimeter=(edtValue)*1000000000;
		liter=(edtValue)*1000;
		milliliter=(edtValue)*1000000;
		gallon=(edtValue)*264.17205236;
		quart=(edtValue)*1056.6882094;
		pintUS=(edtValue)*2113.3764189;
		cupUS=(edtValue)*4226.7528377;
		tablespoonUS=(edtValue)*67628.045404;
		teaspoonUS=(edtValue)*202884.13621;
		cubicmile=(edtValue)*2.399127585E-10;
		cubicyard=(edtValue)*1.3079506193;
		cubicfoot=(edtValue)*35.314666721;
		cubicinch=(edtValue)*61023.744095;
		cubicdecimeter=(edtValue)*1000;
		exaliter=(edtValue)*1.E-15;
		petaliter=(edtValue)*1.E-12;
		teraliter=(edtValue)*1.E-9;
		gigaliter=(edtValue)*0.000001;
		megaliter=(edtValue)*0.001;
		kiloliter=(edtValue)*1;
		hectoliter=(edtValue)*10;
		dekaliter=(edtValue)*100;
		deciliter=(edtValue)*10000;
		centiliter=(edtValue)*100000;
		microliter=(edtValue)*1000000000;
		nanoliter=(edtValue)*1000000000000.0;
		picoliter=(edtValue)*1000000000000000.0;
		femtoliter=(edtValue)*1000000000000000000.0;
		attoliter=(edtValue)*1.E+21;
		cc=(edtValue)*1000000;

		drop=(edtValue)*20000000;
		barreloil=(edtValue)*6.2898107704 ;
		barrelUS=(edtValue)*8.3864143606;
		barrelUK=(edtValue)*6.1102568972;
		gallonUK=(edtValue)*219.9692483;
		quartUK=(edtValue)*879.8769932;
		pintUK=(edtValue)*1759.7539864;
		cupmetric=(edtValue)*4000;
		cupUK=(edtValue)*3519.5079728;
		fluidounceUS=(edtValue)*33814.022702;
		fluidounceUK=(edtValue)*35195.079728;
		tablespoonmetric=(edtValue)*66666.666667;
		tablespoonUK=(edtValue)*56312.127565;
		dessertspoonUS=(edtValue)*101442.06811;

		dessertspoonUK=(edtValue)*84468.191347;
		teaspoonmetric=(edtValue)*200000;
		teaspoonUK=(edtValue)*168936.38269;
		gillUS=(edtValue)*8453.5056755;
		gillUK=(edtValue)*7039.0159456;
		minimUS=(edtValue)*16230730.897;
		minimUK=(edtValue)*16893638.269;
		tonregister=(edtValue)*0.3531466672;
		ccf=(edtValue)*0.3531466672;
		hundresdcubicfoot=(edtValue)*0.3531466672;
		acrefoot=(edtValue)*0.0008107132;
		acrefootUSsurvey=(edtValue)*0.0008107083;

		acreinch=(edtValue)*0.0097285583;
		dekastere=(edtValue)*0.1;
		stere=(edtValue)*1;
		decistere=(edtValue)*10;
		cord=(edtValue)*0.2758958338;
		tun=(edtValue)*1.0483017951;
		hogshead=(edtValue)*4.1932071803;
		boardfoot=(edtValue)*423.77600066;
		dram=(edtValue)*270512.18161;
		cor=(edtValue)*4.5454545455;
		homerBiblical=(edtValue)*4.5454545455;
		bathBiblical=(edtValue)*45.454545455;
		hinBiblical=(edtValue)*272.72727273;
		cabBiblical=(edtValue)*818.18181818;
		logBiblical=(edtValue)*3272.7272727;
		TazaSpanish=(edtValue)*4226.7528377;
		Earthsvolume=(edtValue)*9.233610341E-22;


	}


	public class ConversionResults{
	private double cubicmeter ,cubickilometer, cubiccentimeter, cubicmillimeter,liter ,milliliter ,gallon ,quart  , pintUS  ,cupUS , tablespoonUS ,teaspoonUS,cubicmile ,cubicyard , cubicfoot,cubicinch  ,cubicdecimeter,exaliter ,
	petaliter ,teraliter  ,gigaliter  ,megaliter ,kiloliter ,hectoliter ,dekaliter , deciliter , centiliter , microliter , nanoliter ,picoliter ,femtoliter ,attoliter ,cc , drop , barreloil,barrelUS, barrelUK , gallonUK
	, quartUK ,pintUK,cupmetric,cupUK, fluidounceUS,fluidounceUK,tablespoonmetric,tablespoonUK,dessertspoonUS , dessertspoonUK,teaspoonmetric , teaspoonUK,gillUS, gillUK,minimUS , minimUK ,tonregister ,ccf ,hundredcubicfoot,acrefoot,acrefootUSsurvey, acreinch ,dekastere ,stere ,decistere ,cord,tun,hogshead,boardfoot , dram ,cor ,homerBiblical, bathBiblical,hinBiblical,cabBiblical, logBiblical,TazaSpanish,Earthsvolume;

	public double getCubicmeter() {
		return cubicmeter;
	}

	public void setCubicmeter(double cubicmeter) {
		this.cubicmeter = cubicmeter;
	}

	public double getCubickilometer() {
		return cubickilometer;
	}

	public void setCubickilometer(double cubickilometer) {
		this.cubickilometer = cubickilometer;
	}

	public double getCubiccentimeter() {
		return cubiccentimeter;
	}

	public void setCubiccentimeter(double cubiccentimeter) {
		this.cubiccentimeter = cubiccentimeter;
	}

	public double getCubicmillimeter() {
		return cubicmillimeter;
	}

	public void setCubicmillimeter(double cubicmillimeter) {
		this.cubicmillimeter = cubicmillimeter;
	}

	public double getLiter() {
		return liter;
	}

	public void setLiter(double liter) {
		this.liter = liter;
	}

	public double getMilliliter() {
		return milliliter;
	}

	public void setMilliliter(double milliliter) {
		this.milliliter = milliliter;
	}

	public double getGallon() {
		return gallon;
	}

	public void setGallon(double gallon) {
		this.gallon = gallon;
	}

	public double getQuart() {
		return quart;
	}

	public void setQuart(double quart) {
		this.quart = quart;
	}

	public double getPintUS() {
		return pintUS;
	}

	public void setPintUS(double pintUS) {
		this.pintUS = pintUS;
	}

	public double getCupUS() {
		return cupUS;
	}

	public void setCupUS(double cupUS) {
		this.cupUS = cupUS;
	}

	public double getTablespoonUS() {
		return tablespoonUS;
	}

	public void setTablespoonUS(double tablespoonUS) {
		this.tablespoonUS = tablespoonUS;
	}

	public double getTeaspoonUS() {
		return teaspoonUS;
	}

	public void setTeaspoonUS(double teaspoonUS) {
		this.teaspoonUS = teaspoonUS;
	}

	public double getCubicmile() {
		return cubicmile;
	}

	public void setCubicmile(double cubicmile) {
		this.cubicmile = cubicmile;
	}

	public double getCubicyard() {
		return cubicyard;
	}

	public void setCubicyard(double cubicyard) {
		this.cubicyard = cubicyard;
	}

	public double getCubicfoot() {
		return cubicfoot;
	}

	public void setCubicfoot(double cubicfoot) {
		this.cubicfoot = cubicfoot;
	}

	public double getCubicinch() {
		return cubicinch;
	}

	public void setCubicinch(double cubicinch) {
		this.cubicinch = cubicinch;
	}

	public double getCubicdecimeter() {
		return cubicdecimeter;
	}

	public void setCubicdecimeter(double cubicdecimeter) {
		this.cubicdecimeter = cubicdecimeter;
	}

	public double getExaliter() {
		return exaliter;
	}

	public void setExaliter(double exaliter) {
		this.exaliter = exaliter;
	}

	public double getPetaliter() {
		return petaliter;
	}

	public void setPetaliter(double petaliter) {
		this.petaliter = petaliter;
	}

	public double getTeraliter() {
		return teraliter;
	}

	public void setTeraliter(double teraliter) {
		this.teraliter = teraliter;
	}

	public double getGigaliter() {
		return gigaliter;
	}

	public void setGigaliter(double gigaliter) {
		this.gigaliter = gigaliter;
	}

	public double getMegaliter() {
		return megaliter;
	}

	public void setMegaliter(double megaliter) {
		this.megaliter = megaliter;
	}

	public double getKiloliter() {
		return kiloliter;
	}

	public void setKiloliter(double kiloliter) {
		this.kiloliter = kiloliter;
	}

	public double getHectoliter() {
		return hectoliter;
	}

	public void setHectoliter(double hectoliter) {
		this.hectoliter = hectoliter;
	}

	public double getDekaliter() {
		return dekaliter;
	}

	public void setDekaliter(double dekaliter) {
		this.dekaliter = dekaliter;
	}

	public double getDeciliter() {
		return deciliter;
	}

	public void setDeciliter(double deciliter) {
		this.deciliter = deciliter;
	}

	public double getCentiliter() {
		return centiliter;
	}

	public void setCentiliter(double centiliter) {
		this.centiliter = centiliter;
	}

	public double getMicroliter() {
		return microliter;
	}

	public void setMicroliter(double microliter) {
		this.microliter = microliter;
	}

	public double getNanoliter() {
		return nanoliter;
	}

	public void setNanoliter(double nanoliter) {
		this.nanoliter = nanoliter;
	}

	public double getPicoliter() {
		return picoliter;
	}

	public void setPicoliter(double picoliter) {
		this.picoliter = picoliter;
	}

	public double getFemtoliter() {
		return femtoliter;
	}

	public void setFemtoliter(double femtoliter) {
		this.femtoliter = femtoliter;
	}

	public double getAttoliter() {
		return attoliter;
	}

	public void setAttoliter(double attoliter) {
		this.attoliter = attoliter;
	}

	public double getCc() {
		return cc;
	}

	public void setCc(double cc) {
		this.cc = cc;
	}

	public double getDrop() {
		return drop;
	}

	public void setDrop(double drop) {
		this.drop = drop;
	}

	public double getBarreloil() {
		return barreloil;
	}

	public void setBarreloil(double barreloil) {
		this.barreloil = barreloil;
	}

	public double getBarrelUS() {
		return barrelUS;
	}

	public void setBarrelUS(double barrelUS) {
		this.barrelUS = barrelUS;
	}

	public double getBarrelUK() {
		return barrelUK;
	}

	public void setBarrelUK(double barrelUK) {
		this.barrelUK = barrelUK;
	}

	public double getGallonUK() {
		return gallonUK;
	}

	public void setGallonUK(double gallonUK) {
		this.gallonUK = gallonUK;
	}

	public double getQuartUK() {
		return quartUK;
	}

	public void setQuartUK(double quartUK) {
		this.quartUK = quartUK;
	}

	public double getPintUK() {
		return pintUK;
	}

	public void setPintUK(double pintUK) {
		this.pintUK = pintUK;
	}

	public double getCupmetric() {
		return cupmetric;
	}

	public void setCupmetric(double cupmetric) {
		this.cupmetric = cupmetric;
	}

	public double getCupUK() {
		return cupUK;
	}

	public void setCupUK(double cupUK) {
		this.cupUK = cupUK;
	}

	public double getFluidounceUS() {
		return fluidounceUS;
	}

	public void setFluidounceUS(double fluidounceUS) {
		this.fluidounceUS = fluidounceUS;
	}

	public double getFluidounceUK() {
		return fluidounceUK;
	}

	public void setFluidounceUK(double fluidounceUK) {
		this.fluidounceUK = fluidounceUK;
	}

	public double getTablespoonmetric() {
		return tablespoonmetric;
	}

	public void setTablespoonmetric(double tablespoonmetric) {
		this.tablespoonmetric = tablespoonmetric;
	}

	public double getTablespoonUK() {
		return tablespoonUK;
	}

	public void setTablespoonUK(double tablespoonUK) {
		this.tablespoonUK = tablespoonUK;
	}

	public double getDessertspoonUS() {
		return dessertspoonUS;
	}

	public void setDessertspoonUS(double dessertspoonUS) {
		this.dessertspoonUS = dessertspoonUS;
	}

	public double getDessertspoonUK() {
		return dessertspoonUK;
	}

	public void setDessertspoonUK(double dessertspoonUK) {
		this.dessertspoonUK = dessertspoonUK;
	}

	public double getTeaspoonmetric() {
		return teaspoonmetric;
	}

	public void setTeaspoonmetric(double teaspoonmetric) {
		this.teaspoonmetric = teaspoonmetric;
	}

	public double getTeaspoonUK() {
		return teaspoonUK;
	}

	public void setTeaspoonUK(double teaspoonUK) {
		this.teaspoonUK = teaspoonUK;
	}

	public double getGillUS() {
		return gillUS;
	}

	public void setGillUS(double gillUS) {
		this.gillUS = gillUS;
	}

	public double getGillUK() {
		return gillUK;
	}

	public void setGillUK(double gillUK) {
		this.gillUK = gillUK;
	}

	public double getMinimUS() {
		return minimUS;
	}

	public void setMinimUS(double minimUS) {
		this.minimUS = minimUS;
	}

	public double getMinimUK() {
		return minimUK;
	}

	public void setMinimUK(double minimUK) {
		this.minimUK = minimUK;
	}

	public double getTonregister() {
		return tonregister;
	}

	public void setTonregister(double tonregister) {
		this.tonregister = tonregister;
	}

	public double getCcf() {
		return ccf;
	}

	public void setCcf(double ccf) {
		this.ccf = ccf;
	}
	
	
	public double getHundredcubicfoot() {
		return hundredcubicfoot;
	}

	public void setHundredcubicfoot(double hundredcubicfoot) {
		this.hundredcubicfoot = hundredcubicfoot;
	}

	public double getAcrefoot() {
		return acrefoot;
	}

	public void setAcrefoot(double acrefoot) {
		this.acrefoot = acrefoot;
	}

	public double getAcrefootUSsurvey() {
		return acrefootUSsurvey;
	}

	public void setAcrefootUSsurvey(double acrefootUSsurvey) {
		this.acrefootUSsurvey = acrefootUSsurvey;
	}

	public double getAcreinch() {
		return acreinch;
	}

	public void setAcreinch(double acreinch) {
		this.acreinch = acreinch;
	}

	public double getDekastere() {
		return dekastere;
	}

	public void setDekastere(double dekastere) {
		this.dekastere = dekastere;
	}

	public double getStere() {
		return stere;
	}

	public void setStere(double stere) {
		this.stere = stere;
	}

	public double getDecistere() {
		return decistere;
	}

	public void setDecistere(double decistere) {
		this.decistere = decistere;
	}

	public double getCord() {
		return cord;
	}

	public void setCord(double cord) {
		this.cord = cord;
	}

	public double getTun() {
		return tun;
	}

	public void setTun(double tun) {
		this.tun = tun;
	}

	public double getHogshead() {
		return hogshead;
	}

	public void setHogshead(double hogshead) {
		this.hogshead = hogshead;
	}

	public double getBoardfoot() {
		return boardfoot;
	}

	public void setBoardfoot(double boardfoot) {
		this.boardfoot = boardfoot;
	}

	public double getDram() {
		return dram;
	}

	public void setDram(double dram) {
		this.dram = dram;
	}

	public double getCor() {
		return cor;
	}

	public void setCor(double cor) {
		this.cor = cor;
	}

	public double getHomerBiblical() {
		return homerBiblical;
	}

	public void setHomerBiblical(double homerBiblical) {
		this.homerBiblical = homerBiblical;
	}

	public double getBathBiblical() {
		return bathBiblical;
	}

	public void setBathBiblical(double bathBiblical) {
		this.bathBiblical = bathBiblical;
	}

	public double getHinBiblical() {
		return hinBiblical;
	}

	public void setHinBiblical(double hinBiblical) {
		this.hinBiblical = hinBiblical;
	}

	public double getCabBiblical() {
		return cabBiblical;
	}

	public void setCabBiblical(double cabBiblical) {
		this.cabBiblical = cabBiblical;
	}

	public double getLogBiblical() {
		return logBiblical;
	}

	public void setLogBiblical(double logBiblical) {
		this.logBiblical = logBiblical;
	}

	public double getTazaSpanish() {
		return TazaSpanish;
	}

	public void setTazaSpanish(double tazaSpanish) {
		TazaSpanish = tazaSpanish;
	}

	public double getEarthsvolume() {
		return Earthsvolume;
	}

	public void setEarthsvolume(double earthsvolume) {
		Earthsvolume = earthsvolume;
	}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Volume iA = new Volume("cc",1);
		
		ArrayList<ConversionResults> results = iA.calculateVolumeConversion();
		int length = results.size();

	

		
		for(int i = 0; i <length; i++){
			
			ConversionResults item  =  results.get(i);
			
			
			
			
			
			
			System.out.println("\n cubicmeter - " +new DecimalFormat("##.################").format( item.getCubicmeter())
					+"\n cubickilometer- " +new DecimalFormat("##.################").format( item.getCubickilometer())
					+"\n cubiccentimeter - " +new DecimalFormat("##.################").format( item.getCubiccentimeter())+
					
					"\n cubicmillimeter - " +new DecimalFormat("##.################").format( item.getCubicmillimeter())+
					"\n liter - " +new DecimalFormat("##.################").format( item.getLiter())+
					
					"\n milliliter- " +new DecimalFormat("##.################").format( item.getMilliliter())+
					"\n gallon- " +new DecimalFormat("##.################").format( item.getGallon())+
					"\n quart - " +new DecimalFormat("##.################").format( item.getQuart())+
					"\n pintUS - " +new DecimalFormat("##.################").format( item.getPintUS())+
					"\n cupUS - " +new DecimalFormat("##.################").format( item.getCupUS())+
					"\n tablespoonUS - " +new DecimalFormat("##.################").format( item.getTablespoonUS())+
					
					"\n teaspoonUS - " +new DecimalFormat("##.################").format( item.getTeaspoonUS())+	
					"\n cubicmile - " +new DecimalFormat("##.################").format( item.getCubicmile())+
					"\n cubicyard - " +new DecimalFormat("##.################").format( item.getCubicyard())+
					"\n cubicfoot - " +new DecimalFormat("##.################").format( item.getCubicfoot())+
					"\n cubicinch - " +new DecimalFormat("##.################").format( item.getCubicinch())+
					"\n cubicdecimeter- " +new DecimalFormat("##.################").format( item.getCubicdecimeter())+	
					"\n exaliter - " +new DecimalFormat("##.################").format( item.getExaliter())+
					
					"\n petaliter - " +new DecimalFormat("##.################").format( item.getPetaliter())+	
					"\n teraliter - " +new DecimalFormat("##.################").format( item.getTeraliter())+
					"\n gigaliter - " +new DecimalFormat("##.################").format( item.getGigaliter())+
					"\n megaliter - " +new DecimalFormat("##.################").format( item.getMegaliter())+
					"\n kiloliter- " +new DecimalFormat("##.################").format( item.getKiloliter())+
					"\n hectoliter- " +new DecimalFormat("##.################").format( item.getHectoliter())+	
					"\n dekaliter - " +new DecimalFormat("##.################").format( item.getDekaliter())+
					"\n deciliter - " +new DecimalFormat("##.################").format( item.getDeciliter())+
					"\n centiliter - " +new DecimalFormat("##.################").format( item.getCentiliter())+
					"\n microliter - " +new DecimalFormat("##.################").format( item.getMicroliter())+
					"\n nanoliter- " +new DecimalFormat("##.################").format( item.getNanoliter())+
					"\n picoliter- " +new DecimalFormat("##.################").format( item.getPicoliter())+
					"\n femtoliter - " +new DecimalFormat("##.################").format( item.getFemtoliter())+
					"\n attoliter - " +new DecimalFormat("##.################").format( item.getAttoliter())+
					"\n cc - " +new DecimalFormat("##.################").format( item.getCc())+
					
					
					
					

					
					"\n drop- " +new DecimalFormat("##.################").format( item.getDrop())+	
					"\n barreloil - " +new DecimalFormat("##.################").format( item.getBarreloil())+
					"\n barrelUS - " +new DecimalFormat("##.################").format( item.getBarrelUS())+
					"\n barrelUK - " +new DecimalFormat("##.################").format( item.getBarrelUK())+
					"\n gallonUK - " +new DecimalFormat("##.################").format( item.getGallonUK())+
					"\n quartUK- " +new DecimalFormat("##.################").format( item.getQuartUK())+
					"\n pintUK- " +new DecimalFormat("##.################").format( item.getPintUK())+
					"\n cupmetric - " +new DecimalFormat("##.################").format( item.getCupmetric())+
					"\n cupUK - " +new DecimalFormat("##.################").format( item.getCupUK())+
					"\n fluidounceUS - " +new DecimalFormat("##.################").format( item.getFluidounceUS())+
					
					
					"\n fluidounceUK- " +new DecimalFormat("##.################").format( item.getFluidounceUK())+	
					"\n tablespoonmetric - " +new DecimalFormat("##.################").format( item.getTablespoonmetric())+
					"\n tablespoonUK - " +new DecimalFormat("##.################").format( item.getTablespoonUK())+
					
					"\n dessertspoonUS - " +new DecimalFormat("##.################").format( item.getDessertspoonUS())+
					"\n dessertspoonUK - " +new DecimalFormat("##.################").format( item.getDessertspoonUK())+
					"\n teaspoonmetric- " +new DecimalFormat("##.################").format( item.getTeaspoonmetric())+
					"\n teaspoonUK- " +new DecimalFormat("##.################").format( item.getTeaspoonUK())+
					"\n gillUS - " +new DecimalFormat("##.################").format( item.getGillUS())+
					"\n gillUK - " +new DecimalFormat("##.################").format( item.getGillUK())+
					"\n minimUS - " +new DecimalFormat("##.################").format( item.getMinimUS())+
					
					"\n minimUK- " +new DecimalFormat("##.################").format( item.getMinimUK())+
					"\n tonregister - " +new DecimalFormat("##.################").format( item.getTonregister())+
					"\n ccf - " +new DecimalFormat("##.################").format( item.getCcf())+
					"\n hundredcubicfoot - " +new DecimalFormat("##.################").format( item.getHundredcubicfoot())+
					
				"\n acrefoot- " +new DecimalFormat("##.################").format( item.getAcrefoot())+
					"\n acrefootUSsurvey - " +new DecimalFormat("##.################").format( item.getAcrefootUSsurvey())+
					"\n acreinch - " +new DecimalFormat("##.################").format( item.getAcreinch())+
					"\n dekastere - " +new DecimalFormat("##.################").format( item.getDekastere())+
					
					
					"\n stere- " +new DecimalFormat("##.################").format( item.getStere())+
					"\n decistere - " +new DecimalFormat("##.################").format( item.getDecistere())+
					"\n cord - " +new DecimalFormat("##.################").format( item.getCord())+
					"\n tun - " +new DecimalFormat("##.################").format( item.getTun())+
					
					
					"\n hogshead- " +new DecimalFormat("##.################").format( item.getHogshead())+
					"\n boardfoot - " +new DecimalFormat("##.################").format( item.getBoardfoot())+
					"\n dram - " +new DecimalFormat("##.################").format( item.getDram())+
					"\n cor - " +new DecimalFormat("##.################").format( item.getCor())+
					
					
					
					"\n bathBiblical- " +new DecimalFormat("##.################").format( item.getBathBiblical())+
					"\n hinBiblical - " +new DecimalFormat("##.################").format( item.getHinBiblical())+
					"\n cabBiblical - " +new DecimalFormat("##.################").format( item.getCabBiblical())+
					"\n logBiblical - " +new DecimalFormat("##.################").format( item.getLogBiblical())+
					"\n TazaSpanish - " +new DecimalFormat("##.################").format( item.getTazaSpanish())+
					"\n Earthsvolume - " +new DecimalFormat("##.################").format( item.getEarthsvolume())
					
					
					
					
					);
	
	
	
		}
	}
	
	
	
}
