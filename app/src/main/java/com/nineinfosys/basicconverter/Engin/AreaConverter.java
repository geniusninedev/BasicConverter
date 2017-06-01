package com.nineinfosys.basicconverter.Engin;

import java.util.ArrayList;

public class AreaConverter {
	private double squaremeter,squarekilometer,squarecentimeter,squaremilimeter,squaremicrometer,hectare,acre,squaremile,squareyard,squarefoot,squareinch,squarehectometer,
	squaredekameter,squaredecimeter,squarenanometer,are,barn,squaremileus,squarefootus,circularinch,township,section,acreus,rood,squarechain,squarerod,squarerodus,squareperch,
	squarepole,squaremil,circularmil,homestead,sabin,arpent,cuerda,plaza,varascastellanascuad,varasconuquerascaud,electroncrosssection;
	private double edtValue;
	private String conversionFrom;
	
	public AreaConverter(String conversionFrom, double edtValue) {
		// TODO Auto-generated constructor stub
		this.conversionFrom = conversionFrom;
		this.edtValue = edtValue;
	}

	public ArrayList<ConversionResults> calculateAreaConversion()
    {
    	
		ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
			
		ConversionResults results= new ConversionResults();

		switch(conversionFrom)
		{
		case "Square Meter -  m²":
			
			squaremeter=(edtValue)*1;
			squarekilometer=(edtValue)*0.000001;
			squarecentimeter=(edtValue)*10000;
			squaremilimeter=(edtValue)*1000000;
			squaremicrometer=(edtValue)*1000000000000.0;
			hectare=(edtValue)*0.0001;
			acre=(edtValue)*0.0002471054;
			squaremile=(edtValue)*3.861021585E-7;
			squareyard=(edtValue)*1.1959900463;
			squarefoot=(edtValue)*10.763910417;
			squareinch=(edtValue)*1550.0031;
			squarehectometer=(edtValue)*0.0001;
			squaredekameter=(edtValue)*0.01;
			squaredecimeter=(edtValue)*100;
			squarenanometer=(edtValue)*1000000000000000000.0;
			are=(edtValue)*0.01;
			barn=(edtValue)*1.E+28;
			squaremileus=(edtValue)*3.861006141E-7;
			squarefootus=(edtValue)*10.763867361;
			circularinch=(edtValue)*1973.5252414;
			township=(edtValue)*1.072505995E-8;
			section=(edtValue)*3.861021585E-7;
			acreus=(edtValue)*0.0002471044;
			rood=(edtValue)*0.0009884215;
			squarechain=(edtValue)*0.0024710538;
			squarerod=(edtValue)*0.039536861;
			squarerodus=(edtValue)*0.0395367029;
			squareperch=(edtValue)*0.039536861;
			squarepole=(edtValue)*0.039536861;
			squaremil=(edtValue)*1550003100.0;
			circularmil=(edtValue)*1973525241.4;
			homestead=(edtValue)*0.0000015444;
			sabin=(edtValue)*10.763910417;
			arpent=(edtValue)*0.0002474462;
			cuerda=(edtValue)*0.0002544273;
			plaza=(edtValue)*0.00015625;
			varascastellanascuad=(edtValue)*1.4311536386;
			varasconuquerascaud=(edtValue)*0.159017071;
			electroncrosssection=(edtValue)*1.503202964E+28;
		
			
			break;
			
  case "Square Kilometer - km²":
			
			squaremeter=(edtValue)*1000000;
			squarekilometer=(edtValue)*1;
			squarecentimeter=(edtValue)*10000000000.0;
			squaremilimeter=(edtValue)*1000000000000.0;
			squaremicrometer=(edtValue)*1000000000000000000.0;
			hectare=(edtValue)*100;
			acre=(edtValue)*247.10538147;
			squaremile=(edtValue)*0.3861021585;
			squareyard=(edtValue)*1195990.0463;
			squarefoot=(edtValue)*10763910.417;
			squareinch=(edtValue)*1550003100.0;
			squarehectometer=(edtValue)*100;
			squaredekameter=(edtValue)*10000;
			squaredecimeter=(edtValue)*100000000;
			squarenanometer=(edtValue)*1.E+24;
			are=(edtValue)*10000;
			barn=(edtValue)*1.E+34;
			squaremileus=(edtValue)*0.3861006141;
			squarefootus=(edtValue)*10763867.361;
			circularinch=(edtValue)*1973525241.4;
			township=(edtValue)*0.01072506;
			section=(edtValue)*0.3861021585;
			acreus=(edtValue)*247.10439305;
			rood=(edtValue)*988.42152587;
			squarechain=(edtValue)*2471.0538147;
			squarerod=(edtValue)*39536.861035;
			squarerodus=(edtValue)*39536.702887;
			squareperch=(edtValue)*39536.861035;
			squarepole=(edtValue)*39536.861035;
			squaremil=(edtValue)*1550003100006200.0;
			circularmil=(edtValue)*1973525241390000.0;
			homestead=(edtValue)*1.5444086342;
			sabin=(edtValue)*10763910.417;
			arpent=(edtValue)*247.44621648;
			cuerda=(edtValue)*254.42731354;
			plaza=(edtValue)*156.25;
			varascastellanascuad=(edtValue)*1431153.6386;
			varasconuquerascaud=(edtValue)*159017.07096;
			electroncrosssection=(edtValue)*1.503202964E+34;
			
			
			break;
			
  case "Square Centimeter - cm²":
		
		squaremeter=(edtValue)*0.0001;
		squarekilometer=(edtValue)*1.E-10;
		squarecentimeter=(edtValue)*1;
		squaremilimeter=(edtValue)*100;
		squaremicrometer=(edtValue)*100000000;
		hectare=(edtValue)*1.E-8;
		acre=(edtValue)*2.471053814E-8;
		squaremile=(edtValue)*3.861021585E-11;
		squareyard=(edtValue)*0.000119599;
		squarefoot=(edtValue)*0.001076391;
		squareinch=(edtValue)*0.15500031;
		squarehectometer=(edtValue)*1.E-8;
		squaredekameter=(edtValue)*0.000001;
		squaredecimeter=(edtValue)*0.01;
		squarenanometer=(edtValue)*100000000000000.0;
		are=(edtValue)*0.000001;
		barn=(edtValue)*1.E+24;
		squaremileus=(edtValue)*3.861006141E-11;
		squarefootus=(edtValue)*0.0010763867;
		circularinch=(edtValue)*0.1973525241;
		township=(edtValue)*1.072505995E-12;
		section=(edtValue)*3.861021585E-11;
		acreus=(edtValue)*2.47104393E-8;
		rood=(edtValue)*9.884215258E-8;
		squarechain=(edtValue)*2.471053814E-7;
		squarerod=(edtValue)*0.0000039537;
		squarerodus=(edtValue)*0.0000039537;
		squareperch=(edtValue)*0.0000039537;
		squarepole=(edtValue)*0.0000039537;
		squaremil=(edtValue)*155000.31;
		circularmil=(edtValue)*197352.52414;
		homestead=(edtValue)*1.544408634E-10;
		sabin=(edtValue)*0.001076391;
		arpent=(edtValue)*2.474462164E-8;
		cuerda=(edtValue)*2.544273135E-8;
		plaza=(edtValue)*1.5625E-8;
		varascastellanascuad=(edtValue)*0.0001431154;
		varasconuquerascaud=(edtValue)*0.0000159017;
		electroncrosssection=(edtValue)*1.503202964E+24;
		
		
		break;
		
  case "Square Millimeter -  mm²":
		
		squaremeter=(edtValue)*0.000001;
		squarekilometer=(edtValue)*1.E-12;
		squarecentimeter=(edtValue)*0.01;
		squaremilimeter=(edtValue)*1;
		squaremicrometer=(edtValue)*1000000;
		hectare=(edtValue)*1.E-10;
		acre=(edtValue)*2.471053814E-10;
		squaremile=(edtValue)*3.861021585E-13;
		squareyard=(edtValue)*0.000001196;
		squarefoot=(edtValue)*0.0000107639;
		squareinch=(edtValue)*0.0015500031;
		squarehectometer=(edtValue)*1.E-10;
		squaredekameter=(edtValue)*1.E-8;
		squaredecimeter=(edtValue)*0.0001;
		squarenanometer=(edtValue)*1000000000000.0;
		are=(edtValue)*1.E-8;
		barn=(edtValue)*1.E+22;
		squaremileus=(edtValue)*3.861006141E-13;
		squarefootus=(edtValue)*0.0000107639;
		circularinch=(edtValue)*0.0019735252;
		township=(edtValue)*1.072505995E-14;
		section=(edtValue)*3.861021585E-13;
		acreus=(edtValue)*2.47104393E-10;
		rood=(edtValue)*9.884215258E-10;
		squarechain=(edtValue)*2.471053814E-9;
		squarerod=(edtValue)*3.953686103E-8;
		squarerodus=(edtValue)*3.953670288E-8;
		squareperch=(edtValue)*3.953686103E-8;
		squarepole=(edtValue)*3.953686103E-8;
		squaremil=(edtValue)*1550.0031;
		circularmil=(edtValue)*1973.5252414;
		homestead=(edtValue)*1.544408634E-12;
		sabin=(edtValue)*0.0000107639;
		arpent=(edtValue)*2.474462164E-10;
		cuerda=(edtValue)*2.544273135E-10;
		plaza=(edtValue)*1.5625E-10;
		varascastellanascuad=(edtValue)*0.0000014312;
		varasconuquerascaud=(edtValue)*1.590170709E-7;
		electroncrosssection=(edtValue)*1.503202964E+22;
		
		
		break;
		
  case "Square Micrometer -  μm²":
		
		squaremeter=(edtValue)*1.E-12;
		squarekilometer=(edtValue)*1.E-18;
		squarecentimeter=(edtValue)*1.E-8;
		squaremilimeter=(edtValue)*0.000001;
		squaremicrometer=(edtValue)*1;
		hectare=(edtValue)*1.E-16;
		acre=(edtValue)*2.471053814E-16;
		squaremile=(edtValue)*3.861021585E-19;
		squareyard=(edtValue)*1.195990046E-12;
		squarefoot=(edtValue)*1.076391041E-11;
		squareinch=(edtValue)*1.5500031E-9;
		squarehectometer=(edtValue)*1.E-16;
		squaredekameter=(edtValue)*1.E-14;
		squaredecimeter=(edtValue)*1.E-10;
		squarenanometer=(edtValue)*1000000;
		are=(edtValue)*1.E-14;
		barn=(edtValue)*10000000000000000.0;
		squaremileus=(edtValue)*3.861006141E-19;
		squarefootus=(edtValue)*1.076386736E-11;
		circularinch=(edtValue)*1.973525241E-9;
		township=(edtValue)*1.072505995E-20;
		section=(edtValue)*3.861021585E-19;
		acreus=(edtValue)*2.47104393E-16;
		rood=(edtValue)*9.884215258E-16;
		squarechain=(edtValue)*2.471053814E-15;
		squarerod=(edtValue)*3.953686103E-14;
		squarerodus=(edtValue)*3.953670288E-14;
		squareperch=(edtValue)*3.953686103E-14;
		squarepole=(edtValue)*3.953686103E-14;
		squaremil=(edtValue)*0.0015500031;
		circularmil=(edtValue)*0.0019735252;
		homestead=(edtValue)*1.544408634E-18;
		sabin=(edtValue)*1.076391041E-11;
		arpent=(edtValue)*2.474462164E-16;
		cuerda=(edtValue)*2.544273135E-16;
		plaza=(edtValue)*1.5625E-16;
		varascastellanascuad=(edtValue)*1.431153638E-12;
		varasconuquerascaud=(edtValue)*1.590170709E-13;
		electroncrosssection=(edtValue)*15032029647492000.0;
	
		
		break;
		
  case "Hectares - ha":
		
		squaremeter=(edtValue)*10000;
		squarekilometer=(edtValue)*0.01;
		squarecentimeter=(edtValue)*100000000;
		squaremilimeter=(edtValue)*10000000000.0;
		squaremicrometer=(edtValue)*10000000000000000.0;
		hectare=(edtValue)*1;
		acre=(edtValue)*2.4710538147;
		squaremile=(edtValue)*0.0038610216;
		squareyard=(edtValue)*11959.900463;
		squarefoot=(edtValue)*107639.10417;
		squareinch=(edtValue)*15500031;
		squarehectometer=(edtValue)*1;
		squaredekameter=(edtValue)*100;
		squaredecimeter=(edtValue)*1000000;
		squarenanometer=(edtValue)*1.E+22;
		are=(edtValue)*100;
		barn=(edtValue)*1.E+32;
		squaremileus=(edtValue)*0.0038610061;
		squarefootus=(edtValue)*107638.67361;
		circularinch=(edtValue)*19735252.414;
		township=(edtValue)*0.0001072506;
		section=(edtValue)*0.0038610216;
		acreus=(edtValue)*2.4710439305;
		rood=(edtValue)*9.8842152587;
		squarechain=(edtValue)*24.710538147;
		squarerod=(edtValue)*395.36861035;
		squarerodus=(edtValue)*395.36702887;
		squareperch=(edtValue)*395.36861035;
		squarepole=(edtValue)*395.36861035;
		squaremil=(edtValue)*15500031000062.0;
		circularmil=(edtValue)*19735252413900.0;
		homestead=(edtValue)*0.0154440863;
		sabin=(edtValue)*107639.10417;
		arpent=(edtValue)*2.4744621648;
		cuerda=(edtValue)*2.5442731354;
		plaza=(edtValue)*1.5625;
		varascastellanascuad=(edtValue)*14311.536386;
		varasconuquerascaud=(edtValue)*1590.1707096;
		electroncrosssection=(edtValue)*1.503202964E+32;
		
		
		break;
		
  case "Acre - ac":
		
		squaremeter=(edtValue)*4046.8564224;
		squarekilometer=(edtValue)*0.0040468564;
		squarecentimeter=(edtValue)*40468564.224;
		squaremilimeter=(edtValue)*4046856422.4;
		squaremicrometer=(edtValue)*4046856422399924.0;
		hectare=(edtValue)*0.4046856422;
		acre=(edtValue)*1;
		squaremile=(edtValue)*0.0015625;
		squareyard=(edtValue)*4840;
		squarefoot=(edtValue)*43560;
		squareinch=(edtValue)*6272640;
		squarehectometer=(edtValue)*0.4046856422;
		squaredekameter=(edtValue)*40.468564224;
		squaredecimeter=(edtValue)*404685.64224;
		squarenanometer=(edtValue)*4.046856422E+21;
		are=(edtValue)*40.468564224;
		barn=(edtValue)*4.046856422E+31;
		squaremileus=(edtValue)*0.0015624938;
		squarefootus=(edtValue)*43559.82576;
		circularinch=(edtValue)*7986573.2979;
		township=(edtValue)*0.0000434028;
		section=(edtValue)*0.0015625;
		acreus=(edtValue)*0.999996;
		rood=(edtValue)*4;
		squarechain=(edtValue)*10;
		squarerod=(edtValue)*160;
		squarerodus=(edtValue)*159.99936;
		squareperch=(edtValue)*160;
		squarepole=(edtValue)*160;
		squaremil=(edtValue)*6272640000000.0;
		circularmil=(edtValue)*7986573297887.0;
		homestead=(edtValue)*0.00625;
		sabin=(edtValue)*43560;
		arpent=(edtValue)*1.0013793103;
		cuerda=(edtValue)*1.0296308078;
		plaza=(edtValue)*0.632321316;
		varascastellanascuad=(edtValue)*5791.673294;
		varasconuquerascaud=(edtValue)*643.51925488;
		electroncrosssection=(edtValue)*6.083246572E+31;
		
		break;
		
  case "Square Mile -  mi²":
		
		squaremeter=(edtValue)*2589988.1103;
		squarekilometer=(edtValue)*2.5899881103;
		squarecentimeter=(edtValue)*25899881103.0;
		squaremilimeter=(edtValue)*2589988110336.0;
		squaremicrometer=(edtValue)*2589988110335972400.0;
		hectare=(edtValue)*258.99881103;
		acre=(edtValue)*640;
		squaremile=(edtValue)*1;
		squareyard=(edtValue)*3097600;
		squarefoot=(edtValue)*27878400;
		squareinch=(edtValue)*4014489600.0;
		squarehectometer=(edtValue)*258.99881103;
		squaredekameter=(edtValue)*25899.881103;
		squaredecimeter=(edtValue)*258998811.03;
		squarenanometer=(edtValue)*2.58998811E+24;
		are=(edtValue)*25899.881103;
		barn=(edtValue)*2.58998811E+34;
		squaremileus=(edtValue)*0.999996;
		squarefootus=(edtValue)*27878288.487;
		circularinch=(edtValue)*5111406910.6;
		township=(edtValue)*0.0277777778;
		section=(edtValue)*1;
		acreus=(edtValue)*639.99744;
		rood=(edtValue)*2560;
		squarechain=(edtValue)*6400;
		squarerod=(edtValue)*102400;
		squarerodus=(edtValue)*102399.5904;
		squareperch=(edtValue)*102400;
		squarepole=(edtValue)*102400;
		squaremil=(edtValue)*4014489599999957.0;
		circularmil=(edtValue)*5111406910648030.0;
		homestead=(edtValue)*4;
		sabin=(edtValue)*27878400;
		arpent=(edtValue)*640.88275862;
		cuerda=(edtValue)*658.963717;
		plaza=(edtValue)*404.68564224;
		varascastellanascuad=(edtValue)*3706670.9081;
		varasconuquerascaud=(edtValue)*411852.32313;
		electroncrosssection=(edtValue)*3.893277806E+34;
	
		
		break;
		
  case "Square Yard - yd²":
		
		squaremeter=(edtValue)*0.83612736;
		squarekilometer=(edtValue)*8.361273599E-7;
		squarecentimeter=(edtValue)*8361.2736;
		squaremilimeter=(edtValue)*836127.36;
		squaremicrometer=(edtValue)*836127360000.0;
		hectare=(edtValue)*0.0000836127;
		acre=(edtValue)*0.0002066116;
		squaremile=(edtValue)*3.228305785E-7;
		squareyard=(edtValue)*1;
		squarefoot=(edtValue)*9;
		squareinch=(edtValue)*1296;
		squarehectometer=(edtValue)*0.0000836127;
		squaredekameter=(edtValue)*0.0083612736;
		squaredecimeter=(edtValue)*83.612736;
		squarenanometer=(edtValue)*836127359999986200.0;
		are=(edtValue)*0.0083612736;
		barn=(edtValue)*8.361273599E+27;
		squaremileus=(edtValue)*3.228292871E-7;
		squarefootus=(edtValue)*8.999964;
		circularinch=(edtValue)*1650.11845;
		township=(edtValue)*8.967516069E-9;
		section=(edtValue)*3.228305785E-7;
		acreus=(edtValue)*0.0002066107;
		rood=(edtValue)*0.0008264463;
		squarechain=(edtValue)*0.0020661157;
		squarerod=(edtValue)*0.0330578512;
		squarerodus=(edtValue)*0.033057719;
		squareperch=(edtValue)*0.0330578512;
		squarepole=(edtValue)*0.0330578512;
		squaremil=(edtValue)*1296000000.0;
		circularmil=(edtValue)*1650118450.0;
		homestead=(edtValue)*0.0000012913;
		sabin=(edtValue)*9;
		arpent=(edtValue)*0.0002068966;
		cuerda=(edtValue)*0.0002127336;
		plaza=(edtValue)*0.0001306449;
		varascastellanascuad=(edtValue)*1.1966267136;
		varasconuquerascaud=(edtValue)*0.1329585237;
		electroncrosssection=(edtValue)*1.256869126E+28;
	
		
		break;
		
  case "Square Foot - ft²":
		
		squaremeter=(edtValue)*0.09290304;
		squarekilometer=(edtValue)*9.290303999E-8;
		squarecentimeter=(edtValue)*929.0304;
		squaremilimeter=(edtValue)*929.0304;
		squaremicrometer=(edtValue)*92903040000.0;
		hectare=(edtValue)*0.0000092903;
		acre=(edtValue)*0.0000229568;
		squaremile=(edtValue)*3.587006427E-8;
		squareyard=(edtValue)*0.1111111111;
		squarefoot=(edtValue)*1;
		squareinch=(edtValue)*144;
		squarehectometer=(edtValue)*0.0000092903;
		squaredekameter=(edtValue)*0.0009290304;
		squaredecimeter=(edtValue)*9.290304;
		squarenanometer=(edtValue)*92903039999997600.0;
		are=(edtValue)*0.0009290304;
		barn=(edtValue)*9.290303999E+26;
		squaremileus=(edtValue)*3.586992079E-8;
		squarefootus=(edtValue)*0.999996;
		circularinch=(edtValue)*183.34649444;
		township=(edtValue)*9.963906744E-10;
		section=(edtValue)*3.587006427E-8;
		acreus=(edtValue)*0.0000229567;
		rood=(edtValue)*0.0000918274;
		squarechain=(edtValue)*0.0002295684;
		squarerod=(edtValue)*0.0036730946;
		squarerodus=(edtValue)*0.0036730799;
		squareperch=(edtValue)*0.0036730946;
		squarepole=(edtValue)*0.0036730946;
		squaremil=(edtValue)*144000000;
		circularmil=(edtValue)*183346494.44;
		homestead=(edtValue)*1.434802571E-7;
		sabin=(edtValue)*1;
		arpent=(edtValue)*0.0000229885;
		cuerda=(edtValue)*0.0000236371;
		plaza=(edtValue)*0.0000145161;
		varascastellanascuad=(edtValue)*0.1329585237;
		varasconuquerascaud=(edtValue)*0.0147731693;
		electroncrosssection=(edtValue)*1.396521251E+27;
		
		
		break;
		
  case "Square Inch - in²":
		
		squaremeter=(edtValue)*0.00064516;
		squarekilometer=(edtValue)*6.4516E-10;
		squarecentimeter=(edtValue)*6.4516;
		squaremilimeter=(edtValue)*645.16;
		squaremicrometer=(edtValue)*645160000;
		hectare=(edtValue)*6.4516E-8;
		acre=(edtValue)*1.594225079E-7;
		squaremile=(edtValue)*2.490976686E-10;
		squareyard=(edtValue)*0.0007716049;
		squarefoot=(edtValue)*0.0069444444;
		squareinch=(edtValue)*1;
		squarehectometer=(edtValue)*6.4516E-8;
		squaredekameter=(edtValue)*0.0000064516;
		squaredecimeter=(edtValue)*0.064516;
		squarenanometer=(edtValue)*645160000000000.0;
		are=(edtValue)*0.0000064516;
		barn=(edtValue)*6.4516E+24;
		squaremileus=(edtValue)*2.490966722E-10;
		squarefootus=(edtValue)*0.0069444167;
		circularinch=(edtValue)*1.2732395447;
		township=(edtValue)*6.919379683E-12;
		section=(edtValue)*2.490976686E-10;
		acreus=(edtValue)*1.594218702E-7;
		rood=(edtValue)*6.376900316E-7;
		squarechain=(edtValue)*0.0000015942;
		squarerod=(edtValue)*0.0000255076;
		squarerodus=(edtValue)*0.0000255075;
		squareperch=(edtValue)*0.0000255076;
		squarepole=(edtValue)*0.0000255076;
		squaremil=(edtValue)*1000000;
		circularmil=(edtValue)*1273239.5447;
		homestead=(edtValue)*9.963906744E-10;
		sabin=(edtValue)*0.0069444444;
		arpent=(edtValue)*1.59642401E-7;
		cuerda=(edtValue)*1.641463256E-7;
		plaza=(edtValue)*1.0080625E-7;
		varascastellanascuad=(edtValue)*0.0009233231;
		varasconuquerascaud=(edtValue)*0.0001025915;
		electroncrosssection=(edtValue)*9.698064247E+24;
	
		
		break;
		
  case "Square Hectometer - hm²":
		
		squaremeter=(edtValue)*10000;
		squarekilometer=(edtValue)*0.01;
		squarecentimeter=(edtValue)*100000000.0;
		squaremilimeter=(edtValue)*10000000000.0;
		squaremicrometer=(edtValue)*10000000000000000.0;
		hectare=(edtValue)*1;
		acre=(edtValue)*2.4710538147;
		squaremile=(edtValue)*0.0038610216;
		squareyard=(edtValue)*11959.900463;
		squarefoot=(edtValue)*107639.10417;
		squareinch=(edtValue)*15500031;
		squarehectometer=(edtValue)*1;
		squaredekameter=(edtValue)*100;
		squaredecimeter=(edtValue)*1000000;
		squarenanometer=(edtValue)*1.E+22;
		are=(edtValue)*100;
		barn=(edtValue)*1.E+32;
		squaremileus=(edtValue)*0.0038610061;
		squarefootus=(edtValue)*107638.67361;
		circularinch=(edtValue)*19735252.414;
		township=(edtValue)*0.0001072506;
		section=(edtValue)*0.0038610216;
		acreus=(edtValue)*2.4710439305;
		rood=(edtValue)*9.8842152587;
		squarechain=(edtValue)*24.710538147;
		squarerod=(edtValue)*395.36861035;
		squarerodus=(edtValue)*395.36702887;
		squareperch=(edtValue)*395.36861035;
		squarepole=(edtValue)*395.36861035;
		squaremil=(edtValue)*15500031000062.0;
		circularmil=(edtValue)*19735252413900.0;
		homestead=(edtValue)*0.0154440863;
		sabin=(edtValue)*107639.10417;
		arpent=(edtValue)*2.4744621648;
		cuerda=(edtValue)*2.5442731354;
		plaza=(edtValue)*1.5625;
		varascastellanascuad=(edtValue)*14311.536386;
		varasconuquerascaud=(edtValue)*1590.1707096;
		electroncrosssection=(edtValue)*1.503202964E+32;
		
		
		break;
		
  case "Square Dekameter - dam²":
		
		squaremeter=(edtValue)*100;
		squarekilometer=(edtValue)*0.0001;
		squarecentimeter=(edtValue)*1000000;
		squaremilimeter=(edtValue)*100000000;
		squaremicrometer=(edtValue)*100000000000000.0;
		hectare=(edtValue)*0.01;
		acre=(edtValue)*0.0247105381;
		squaremile=(edtValue)*0.0000386102;
		squareyard=(edtValue)*119.59900463;
		squarefoot=(edtValue)*1076.3910417;
		squareinch=(edtValue)*155000.31;
		squarehectometer=(edtValue)*0.01;
		squaredekameter=(edtValue)*1;
		squaredecimeter=(edtValue)*10000;
		squarenanometer=(edtValue)*100000000000000000000.0;
		are=(edtValue)*1;
		barn=(edtValue)*1.E+30;
		squaremileus=(edtValue)*0.0000386101;
		squarefootus=(edtValue)*1076.3867361;
		circularinch=(edtValue)*197352.52414;
		township=(edtValue)*0.0000010725;
		section=(edtValue)*0.0000386102;
		acreus=(edtValue)*0.0247104393;
		rood=(edtValue)*0.0988421526;
		squarechain=(edtValue)*0.2471053815;
		squarerod=(edtValue)*3.9536861035;
		squarerodus=(edtValue)*3.9536702887;
		squareperch=(edtValue)*3.9536861035;
		squarepole=(edtValue)*3.9536861035;
		squaremil=(edtValue)*155000310001.0;
		circularmil=(edtValue)*197352524139.0;
		homestead=(edtValue)*0.0001544409;
		sabin=(edtValue)*1076.3910417;
		arpent=(edtValue)*0.0247446216;
		cuerda=(edtValue)*0.0254427314;
		plaza=(edtValue)*0.015625;
		varascastellanascuad=(edtValue)*143.11536386;
		varasconuquerascaud=(edtValue)*15.901707096;
		electroncrosssection=(edtValue)*1.503202964E+30;
		
		
		break;
		
  case "Square Decimeter -  dm²":
		
		squaremeter=(edtValue)*0.01;
		squarekilometer=(edtValue)*1.E-8;
		squarecentimeter=(edtValue)*100;
		squaremilimeter=(edtValue)*10000;
		squaremicrometer=(edtValue)*10000000000.0;
		hectare=(edtValue)*0.000001;
		acre=(edtValue)*0.0000024711;
		squaremile=(edtValue)*3.861021585E-9;
		squareyard=(edtValue)*0.0119599005;
		squarefoot=(edtValue)*0.1076391042;
		squareinch=(edtValue)*15.500031;
		squarehectometer=(edtValue)*0.000001;
		squaredekameter=(edtValue)*0.0001;
		squaredecimeter=(edtValue)*1;
		squarenanometer=(edtValue)*10000000000000000.0;
		are=(edtValue)*0.0001;
		barn=(edtValue)*1.E+26;
		squaremileus=(edtValue)*3.861006141E-9;
		squarefootus=(edtValue)*0.1076386736;
		circularinch=(edtValue)*19.735252414;
		township=(edtValue)*1.072505995E-10;
		section=(edtValue)*3.861021585E-9;
		acreus=(edtValue)*0.000002471;
		rood=(edtValue)*0.0000098842;
		squarechain=(edtValue)*0.0000247105;
		squarerod=(edtValue)*0.0003953686;
		squarerodus=(edtValue)*0.000395367;
		squareperch=(edtValue)*0.0003953686;
		squarepole=(edtValue)*0.0003953686;
		squaremil=(edtValue)*15500031;
		circularmil=(edtValue)*19735252.414;
		homestead=(edtValue)*1.544408634E-8;
		sabin=(edtValue)*0.1076391042;
		arpent=(edtValue)*0.0000024745;
		cuerda=(edtValue)*0.0000025443;
		plaza=(edtValue)*0.0000015625;
		varascastellanascuad=(edtValue)*0.0143115364;
		varasconuquerascaud=(edtValue)*0.0015901707;
		electroncrosssection=(edtValue)*1.503202964E+26;
	
		
		break;



		
  case "Nanometer - nm²":
		
		squaremeter=(edtValue)*1.E-18;
		squarekilometer=(edtValue)*1.E-24;
		squarecentimeter=(edtValue)*1.E-14;
		squaremilimeter=(edtValue)*1.E-12;
		squaremicrometer=(edtValue)*0.000001;
		hectare=(edtValue)*1.E-22;
		acre=(edtValue)*2.471053814E-22;
		squaremile=(edtValue)*3.861021585E-25;
		squareyard=(edtValue)*1.195990046E-18;
		squarefoot=(edtValue)*1.076391041E-17;
		squareinch=(edtValue)*1.5500031E-15;
		squarehectometer=(edtValue)*1.E-22;
		squaredekameter=(edtValue)*1.E-20;
		squaredecimeter=(edtValue)*1.E-16;
		squarenanometer=(edtValue)*1;
		are=(edtValue)*1.E-20;
		barn=(edtValue)*10000000000.0;
		squaremileus=(edtValue)*3.861006141E-25;
		squarefootus=(edtValue)*1.076386736E-17;
		circularinch=(edtValue)*1.973525241E-15;
		township=(edtValue)*1.072505995E-26;
		section=(edtValue)*3.861021585E-25;
		acreus=(edtValue)*2.47104393E-22;
		rood=(edtValue)*9.884215258E-22;
		squarechain=(edtValue)*2.471053814E-21;
		squarerod=(edtValue)*3.953686103E-20;
		squarerodus=(edtValue)*3.953670288E-20;
		squareperch=(edtValue)*3.953686103E-20;
		squarepole=(edtValue)*3.953686103E-20;
		squaremil=(edtValue)*1.5500031E-9;
		circularmil=(edtValue)*1.973525241E-9;
		homestead=(edtValue)*1.544408634E-24;
		sabin=(edtValue)*1.076391041E-17;
		arpent=(edtValue)*2.474462164E-22;
		cuerda=(edtValue)*2.544273135E-22;
		plaza=(edtValue)*1.5625E-22;
		varascastellanascuad=(edtValue)*1.431153638E-18;
		varasconuquerascaud=(edtValue)*1.590170709E-19;
		electroncrosssection=(edtValue)*15032029647.0;
		
		
		break;
		
  case "Are - a":
		
		squaremeter=(edtValue)*100;
		squarekilometer=(edtValue)*0.0001;
		squarecentimeter=(edtValue)*1000000;
		squaremilimeter=(edtValue)*100000000.0;
		squaremicrometer=(edtValue)*100000000000000.0;
		hectare=(edtValue)*0.01;
		acre=(edtValue)*0.0247105381;
		squaremile=(edtValue)*0.0000386102;
		squareyard=(edtValue)*119.59900463;
		squarefoot=(edtValue)*1076.3910417;
		squareinch=(edtValue)*155000.31;
		squarehectometer=(edtValue)*0.01;
		squaredekameter=(edtValue)*1;
		squaredecimeter=(edtValue)*10000;
		squarenanometer=(edtValue)*100000000000000000000.0;
		are=(edtValue)*1;
		barn=(edtValue)*1.E+30;
		squaremileus=(edtValue)*0.0000386101;
		squarefootus=(edtValue)*1076.3867361;
		circularinch=(edtValue)*197352.52414;
		township=(edtValue)*0.0000010725;
		section=(edtValue)*0.0000386102;
		acreus=(edtValue)*0.0247104393;
		rood=(edtValue)*0.0988421526;
		squarechain=(edtValue)*0.2471053815;
		squarerod=(edtValue)*3.9536861035;
		squarerodus=(edtValue)*3.9536702887;
		squareperch=(edtValue)*3.9536861035;
		squarepole=(edtValue)*3.9536861035;
		squaremil=(edtValue)*155000310001.0;
		circularmil=(edtValue)*197352524139.0;
		homestead=(edtValue)*0.0001544409;
		sabin=(edtValue)*1076.3910417;
		arpent=(edtValue)*0.0247446216;
		cuerda=(edtValue)*0.0254427314;
		plaza=(edtValue)*0.015625;
		varascastellanascuad=(edtValue)*143.11536386;
		varasconuquerascaud=(edtValue)*15.901707096;
		electroncrosssection=(edtValue)*1.503202964E+30;
		
		
		break;
		
  case "Barn -  b":
		
		squaremeter=(edtValue)*1.E-28;
		squarekilometer=(edtValue)*1.E-34;
		squarecentimeter=(edtValue)*1.E-24;
		squaremilimeter=(edtValue)*9.999999999E-23;
		squaremicrometer=(edtValue)*1.E-16;
		hectare=(edtValue)*9.999999999E-33;
		acre=(edtValue)*2.471053814E-32;
		squaremile=(edtValue)*3.861021585E-35;
		squareyard=(edtValue)*1.195990046E-28;
		squarefoot=(edtValue)*1.076391041E-27;
		squareinch=(edtValue)*1.5500031E-25;
		squarehectometer=(edtValue)*9.999999999E-33;
		squaredekameter=(edtValue)*9.999999999E-31;
		squaredecimeter=(edtValue)*1.E-26;
		squarenanometer=(edtValue)*9.999999999E-11;
		are=(edtValue)*9.999999999E-31;
		barn=(edtValue)*1;
		squaremileus=(edtValue)*3.861006141E-35;
		squarefootus=(edtValue)*1.076386736E-27;
		circularinch=(edtValue)*1.973525241E-25;
		township=(edtValue)*1.072505995E-36;
		section=(edtValue)*3.861021585E-35;
		acreus=(edtValue)*2.47104393E-32;
		rood=(edtValue)*9.884215258E-32;
		squarechain=(edtValue)*2.471053814E-31;
		squarerod=(edtValue)*3.953686103E-30;
		squarerodus=(edtValue)*3.953670288E-30;
		squareperch=(edtValue)*3.953686103E-30;
		squarepole=(edtValue)*3.953686103E-30;
		squaremil=(edtValue)*1.5500031E-19;
		circularmil=(edtValue)*1.973525241E-19;
		homestead=(edtValue)*1.544408634E-34;
		sabin=(edtValue)*1.076391041E-27;
		arpent=(edtValue)*2.474462164E-32;
		cuerda=(edtValue)*2.544273135E-32;
		plaza=(edtValue)*1.562499999E-32;
		varascastellanascuad=(edtValue)*1.431153638E-28;
		varasconuquerascaud=(edtValue)*1.590170709E-29;
		electroncrosssection=(edtValue)*1.5032029647;
		
		
		break;
		
  case "Square Mile (US survey)":
		
		squaremeter=(edtValue)*2589998.4703;
		squarekilometer=(edtValue)*2.5899984703;
		squarecentimeter=(edtValue)*25899984703.0;
		squaremilimeter=(edtValue)*2589998470319.0;
		squaremicrometer=(edtValue)*2589998470319495000.0;
		hectare=(edtValue)*258.99984703;
		acre=(edtValue)*640.00256001;
		squaremile=(edtValue)*1.000004;
		squareyard=(edtValue)*3097612.3904;
		squarefoot=(edtValue)*27878511.514;
		squareinch=(edtValue)*4014505658.0;
		squarehectometer=(edtValue)*258.99984703;
		squaredekameter=(edtValue)*25899.984703;
		squaredecimeter=(edtValue)*258999847.03;
		squarenanometer=(edtValue)*2.58999847E+24;
		are=(edtValue)*25899.984703;
		barn=(edtValue)*2.58999847E+34;
		squaremileus=(edtValue)*1;
		squarefootus=(edtValue)*27878400;
		circularinch=(edtValue)*5111427356.3;
		township=(edtValue)*0.0277778889;
		section=(edtValue)*1.000004;
		acreus=(edtValue)*640;
		rood=(edtValue)*2560.01024;
		squarechain=(edtValue)*6400.0256001;
		squarerod=(edtValue)*102400.4096;
		squarerodus=(edtValue)*102400;
		squareperch=(edtValue)*102400.4096;
		squarepole=(edtValue)*102400.4096;
		squaremil=(edtValue)*4014505658006534.0;
		circularmil=(edtValue)*5111427356337012.0;
		homestead=(edtValue)*4.000016;
		sabin=(edtValue)*27878511.514;
		arpent=(edtValue)*640.88532216;
		cuerda=(edtValue)*658.96635286;
		plaza=(edtValue)*404.68726099;
		varascastellanascuad=(edtValue)*3706685.7349;
		varasconuquerascaud=(edtValue)*411853.97054;
		electroncrosssection=(edtValue)*3.893293379E+34;
		
		break;
		
  case "Square Foot (US survey)":
		
		squaremeter=(edtValue)*0.0929034116;
		squarekilometer=(edtValue)*9.290341161E-8;
		squarecentimeter=(edtValue)*929.03411613;
		squaremilimeter=(edtValue)*92903.411613;
		squaremicrometer=(edtValue)*92903411613.0;
		hectare=(edtValue)*0.0000092903;
		acre=(edtValue)*0.0000229569;
		squaremile=(edtValue)*3.587020775E-8;
		squareyard=(edtValue)*0.1111115556;
		squarefoot=(edtValue)*1.000004;
		squareinch=(edtValue)*144.000576;
		squarehectometer=(edtValue)*0.0000092903;
		squaredekameter=(edtValue)*0.0009290341;
		squaredecimeter=(edtValue)*9.2903411613;
		squarenanometer=(edtValue)*92903411613275790.0;
		are=(edtValue)*0.0009290341;
		barn=(edtValue)*9.290341161E+26;
		squaremileus=(edtValue)*3.587006427E-8;
		squarefootus=(edtValue)*1;
		circularinch=(edtValue)*183.34722783;
		township=(edtValue)*9.963946599E-10;
		section=(edtValue)*3.587020775E-8;
		acreus=(edtValue)*0.0000229568;
		rood=(edtValue)*0.0000918277;
		squarechain=(edtValue)*0.0002295693;
		squarerod=(edtValue)*0.0036731093;
		squarerodus=(edtValue)*0.0036730946;
		squareperch=(edtValue)*0.0036731093;
		squarepole=(edtValue)*0.0036731093;
		squaremil=(edtValue)*144000576.0;
		circularmil=(edtValue)*183347227.83;
		homestead=(edtValue)*1.43480831E-7;
		sabin=(edtValue)*1.000004;
		arpent=(edtValue)*0.0000229886;
		cuerda=(edtValue)*0.0000236372;
		plaza=(edtValue)*0.0000145162;
		varascastellanascuad=(edtValue)*0.1329590556;
		varasconuquerascaud=(edtValue)*0.0147732284;
		electroncrosssection=(edtValue)*1.396526837E+27;
		
		
		break;
		
  case "Circular Inch ":
		
		squaremeter=(edtValue)*0.0005067075;
		squarekilometer=(edtValue)*5.06707479E-10;
		squarecentimeter=(edtValue)*5.067074791;
		squaremilimeter=(edtValue)*506.7074791;
		squaremicrometer=(edtValue)*506707479.1;
		hectare=(edtValue)*5.06707479E-8;
		acre=(edtValue)*1.252101449E-7;
		squaremile=(edtValue)*1.956408514E-10;
		squareyard=(edtValue)*0.0006060171;
		squarefoot=(edtValue)*0.0054541539;
		squareinch=(edtValue)*0.7853981634;
		squarehectometer=(edtValue)*5.06707479E-8;
		squaredekameter=(edtValue)*0.0000050671;
		squaredecimeter=(edtValue)*0.0506707479;
		squarenanometer=(edtValue)*506707479097494.0;
		are=(edtValue)*0.0000050671;
		barn=(edtValue)*5.06707479E+24;
		squaremileus=(edtValue)*1.956400688E-10;
		squarefootus=(edtValue)*0.0054541321;
		circularinch=(edtValue)*1;
		township=(edtValue)*5.434468095E-12;
		section=(edtValue)*1.956408514E-10;
		acreus=(edtValue)*1.25209644E-7;
		rood=(edtValue)*5.008405796E-7;
		squarechain=(edtValue)*0.0000012521;
		squarerod=(edtValue)*0.0000200336;
		squarerodus=(edtValue)*0.0000200335;
		squareperch=(edtValue)*0.0000200336;
		squarepole=(edtValue)*0.0000200336;
		squaremil=(edtValue)*785398.1634;
		circularmil=(edtValue)*1000000;
		homestead=(edtValue)*7.825634057E-10;
		sabin=(edtValue)*0.0054541539;
		arpent=(edtValue)*1.253828485E-7;
		cuerda=(edtValue)*1.289202226E-7;
		plaza=(edtValue)*7.91730436E-8;
		varascastellanascuad=(edtValue)*0.0007251763;
		varasconuquerascaud=(edtValue)*0.0000805751;
		electroncrosssection=(edtValue)*7.616841848E+24;
		
		
		break;

  case "Township":
		
		squaremeter=(edtValue)*93239571.972;
		squarekilometer=(edtValue)*93.239571972;
		squarecentimeter=(edtValue)*932395719721.0;
		squaremilimeter=(edtValue)*93239571972099.0;
		squaremicrometer=(edtValue)*93239571972099340000.0;
		hectare=(edtValue)*9323.9571972;
		acre=(edtValue)*23040;
		squaremile=(edtValue)*36;
		squareyard=(edtValue)*111513600.0;
		squarefoot=(edtValue)*1003622400.0;
		squareinch=(edtValue)*144521625600.0;
		squarehectometer=(edtValue)*9323.9571972;
		squaredekameter=(edtValue)*932395.71972;
		squaredecimeter=(edtValue)*9323957197.2;
		squarenanometer=(edtValue)*9.323957197E+25;
		are=(edtValue)*932395.71972;
		barn=(edtValue)*9.323957197E+35;
		squaremileus=(edtValue)*35.999856;
		squarefootus=(edtValue)*1003618385.5;
		circularinch=(edtValue)*184010648783.0;
		township=(edtValue)*1;
		section=(edtValue)*36;
		acreus=(edtValue)*23039.90784;
		rood=(edtValue)*92160;
		squarechain=(edtValue)*230400;
		squarerod=(edtValue)*3686400;
		squarerodus=(edtValue)*3686385.2544;
		squareperch=(edtValue)*3686400;
		squarepole=(edtValue)*3686400;
		squaremil=(edtValue)*144521625600005200.0;
		circularmil=(edtValue)*184010648783337630.0;
		homestead=(edtValue)*144;
		sabin=(edtValue)*1003622400;
		arpent=(edtValue)*23071.77931;
		cuerda=(edtValue)*23722.693812;
		plaza=(edtValue)*14568.683121;
		varascastellanascuad=(edtValue)*133440152.69;
		varasconuquerascaud=(edtValue)*14826683.633;
		electroncrosssection=(edtValue)*1.40158001E+36;
	
		
		break;
		
  case "Section":
		
		squaremeter=(edtValue)*2589988.1103;
		squarekilometer=(edtValue)*2.5899881103;
		squarecentimeter=(edtValue)*25899881103.0;
		squaremilimeter=(edtValue)*2589988110336.0;
		squaremicrometer=(edtValue)*2589988110335972400.0;
		hectare=(edtValue)*258.99881103;
		acre=(edtValue)*640;
		squaremile=(edtValue)*1;
		squareyard=(edtValue)*3097600;
		squarefoot=(edtValue)*27878400;
		squareinch=(edtValue)*4014489600.0;
		squarehectometer=(edtValue)*258.99881103;
		squaredekameter=(edtValue)*25899.881103;
		squaredecimeter=(edtValue)*258998811.03;
		squarenanometer=(edtValue)*2.58998811E+24;
		are=(edtValue)*25899.881103;
		barn=(edtValue)*2.58998811E+34;
		squaremileus=(edtValue)*0.999996;
		squarefootus=(edtValue)*27878288.487;
		circularinch=(edtValue)*5111406910.6;
		township=(edtValue)*0.0277777778;
		section=(edtValue)*1;
		acreus=(edtValue)*639.99744;
		rood=(edtValue)*2560;
		squarechain=(edtValue)*6400;
		squarerod=(edtValue)*102400;
		squarerodus=(edtValue)*102399.5904;
		squareperch=(edtValue)*102400;
		squarepole=(edtValue)*102400;
		squaremil=(edtValue)*4014489599999957.0;
		circularmil=(edtValue)*5111406910648030.0;
		homestead=(edtValue)*4;
		sabin=(edtValue)*27878400;
		arpent=(edtValue)*640.88275862;
		cuerda=(edtValue)*658.963717;
		plaza=(edtValue)*404.68564224;
		varascastellanascuad=(edtValue)*3706670.9081;
		varasconuquerascaud=(edtValue)*411852.32313;
		electroncrosssection=(edtValue)*3.893277806E+34;
		
		
		break;
		
  case "Acre(US survey) - ac":
		
		squaremeter=(edtValue)*4046.8726099;
		squarekilometer=(edtValue)*0.0040468726;
		squarecentimeter=(edtValue)*40468726.099;
		squaremilimeter=(edtValue)*4046872609.9;
		squaremicrometer=(edtValue)*4046872609874218.0;
		hectare=(edtValue)*0.404687261;
		acre=(edtValue)*1.000004;
		squaremile=(edtValue)*0.0015625063;
		squareyard=(edtValue)*4840.0193601;
		squarefoot=(edtValue)*43560.174241;
		squareinch=(edtValue)*6272665.0906;
		squarehectometer=(edtValue)*0.404687261;
		squaredekameter=(edtValue)*40.468726099;
		squaredecimeter=(edtValue)*404687.26099;
		squarenanometer=(edtValue)*4.046872609E+21;
		are=(edtValue)*40.468726099;
		barn=(edtValue)*4.046872609E+31;
		squaremileus=(edtValue)*0.0015625;
		squarefootus=(edtValue)*43560;
		circularinch=(edtValue)*7986605.2443;
		township=(edtValue)*0.000043403;
		section=(edtValue)*0.0015625063;
		acreus=(edtValue)*1;
		rood=(edtValue)*4.000016;
		squarechain=(edtValue)*10.00004;
		squarerod=(edtValue)*160.00064;
		squarerodus=(edtValue)*160;
		squareperch=(edtValue)*160.00064;
		squarepole=(edtValue)*160.00064;
		squaremil=(edtValue)*6272665090635.0;
		circularmil=(edtValue)*7986605244277.0;
		homestead=(edtValue)*0.006250025;
		sabin=(edtValue)*43560.174241;
		arpent=(edtValue)*1.0013833159;
		cuerda=(edtValue)*1.0296349264;
		plaza=(edtValue)*0.6323238453;
		varascastellanascuad=(edtValue)*5791.6964607;
		varasconuquerascaud=(edtValue)*643.52182897;
		electroncrosssection=(edtValue)*6.083270905E+31;
		
		
		break;
		
  case "Rood":
		
		squaremeter=(edtValue)*1011.7141056;
		squarekilometer=(edtValue)*0.0010117141;
		squarecentimeter=(edtValue)*10117141.056;
		squaremilimeter=(edtValue)*1011714105.6;
		squaremicrometer=(edtValue)*1011714105600001.0;
		hectare=(edtValue)*0.1011714106;
		acre=(edtValue)*0.25;
		squaremile=(edtValue)*0.000390625;
		squareyard=(edtValue)*1210;
		squarefoot=(edtValue)*10890;
		squareinch=(edtValue)*1568160;
		squarehectometer=(edtValue)*0.1011714106;
		squaredekameter=(edtValue)*10.117141056;
		squaredecimeter=(edtValue)*101171.41056;
		squarenanometer=(edtValue)*1.011714105E+21;
		are=(edtValue)*10.117141056;
		barn=(edtValue)*1.011714105E+31;
		squaremileus=(edtValue)*0.0003906234;
		squarefootus=(edtValue)*10889.95644;
		circularinch=(edtValue)*1996643.3245;
		township=(edtValue)*0.0000108507;
		section=(edtValue)*0.000390625;
		acreus=(edtValue)*0.249999;
		rood=(edtValue)*1;
		squarechain=(edtValue)*2.5;
		squarerod=(edtValue)*40;
		squarerodus=(edtValue)*39.99984;
		squareperch=(edtValue)*40;
		squarepole=(edtValue)*40;
		squaremil=(edtValue)*1568160000000.0;
		circularmil=(edtValue)*1996643324472.0;
		homestead=(edtValue)*0.0015625;
		sabin=(edtValue)*10890;
		arpent=(edtValue)*0.2503448276;
		cuerda=(edtValue)*0.257407702;
		plaza=(edtValue)*0.158080329;
		varascastellanascuad=(edtValue)*1447.9183235;
		varasconuquerascaud=(edtValue)*160.87981372;
		electroncrosssection=(edtValue)*1.520811643E+31;
		
		break;
		
  case "Square Chain - ch²":
		
		squaremeter=(edtValue)*404.68564224;
		squarekilometer=(edtValue)*0.0004046856;
		squarecentimeter=(edtValue)*4046856.4224;
		squaremilimeter=(edtValue)*404685642.24;
		squaremicrometer=(edtValue)*404685642240009.0;
		hectare=(edtValue)*0.0404685642;
		acre=(edtValue)*0.1;
		squaremile=(edtValue)*0.00015625;
		squareyard=(edtValue)*484;
		squarefoot=(edtValue)*4356;
		squareinch=(edtValue)*627264;
		squarehectometer=(edtValue)*0.0404685642;
		squaredekameter=(edtValue)*4.0468564224;
		squaredecimeter=(edtValue)*40468.564224;
		squarenanometer=(edtValue)*404685642240008700000.0;
		are=(edtValue)*4.0468564224;
		barn=(edtValue)*4.046856422E+30;
		squaremileus=(edtValue)*0.0001562494;
		squarefootus=(edtValue)*4355.982576;
		circularinch=(edtValue)*798657.32979;
		township=(edtValue)*0.0000043403;
		section=(edtValue)*0.00015625;
		acreus=(edtValue)*0.0999996;
		rood=(edtValue)*0.4;
		squarechain=(edtValue)*1;
		squarerod=(edtValue)*16;
		squarerodus=(edtValue)*15.999936;
		squareperch=(edtValue)*16;
		squarepole=(edtValue)*16;
		squaremil=(edtValue)*627264000000.0;
		circularmil=(edtValue)*798657329789.0;
		homestead=(edtValue)*0.000625;
		sabin=(edtValue)*4356;
		arpent=(edtValue)*0.100137931;
		cuerda=(edtValue)*0.1029630808;
		plaza=(edtValue)*0.0632321316;
		varascastellanascuad=(edtValue)*579.1673294;
		varasconuquerascaud=(edtValue)*64.351925488;
		electroncrosssection=(edtValue)*6.083246572E+30;
		
		
		break;
		
  case "Square rod":
		
		squaremeter=(edtValue)*25.29285264;
		squarekilometer=(edtValue)*0.0000252929;
		squarecentimeter=(edtValue)*252928.5264;
		squaremilimeter=(edtValue)*25292852.64;
		squaremicrometer=(edtValue)*25292852640000.0;
		hectare=(edtValue)*0.0025292853;
		acre=(edtValue)*0.00625;
		squaremile=(edtValue)*0.0000097656;
		squareyard=(edtValue)*30.25;
		squarefoot=(edtValue)*272.25;
		squareinch=(edtValue)*39204;
		squarehectometer=(edtValue)*0.0025292853;
		squaredekameter=(edtValue)*0.2529285264;
		squaredecimeter=(edtValue)*2529.285264;
		squarenanometer=(edtValue)*25292852640000290000.0;
		are=(edtValue)*0.2529285264;
		barn=(edtValue)*2.529285264E+29;
		squaremileus=(edtValue)*0.0000097656;
		squarefootus=(edtValue)*272.248911;
		circularinch=(edtValue)*49916.083112;
		township=(edtValue)*2.712673611E-7;
		section=(edtValue)*0.0000097656;
		acreus=(edtValue)*0.006249975;
		rood=(edtValue)*0.025;
		squarechain=(edtValue)*0.0625;
		squarerod=(edtValue)*1;
		squarerodus=(edtValue)*0.999996;
		squareperch=(edtValue)*1;
		squarepole=(edtValue)*1;
		squaremil=(edtValue)*39204000000.0;
		circularmil=(edtValue)*49916083112.0;
		homestead=(edtValue)*0.0000390625;
		sabin=(edtValue)*272.25;
		arpent=(edtValue)*0.0062586207;
		cuerda=(edtValue)*0.0064351925;
		plaza=(edtValue)*0.0039520082;
		varascastellanascuad=(edtValue)*36.197958087;
		varasconuquerascaud=(edtValue)*4.021995343;
		electroncrosssection=(edtValue)*3.802029107E+29;
	
		
		break;
		
  case "Square rod (US survey)":
		
		squaremeter=(edtValue)*25.292953812;
		squarekilometer=(edtValue)*0.000025293;
		squarecentimeter=(edtValue)*252929.53812;
		squaremilimeter=(edtValue)*25292953.812;
		squaremicrometer=(edtValue)*25292953811714.0;
		hectare=(edtValue)*0.0025292954;
		acre=(edtValue)*0.006250025;
		squaremile=(edtValue)*0.0000097657;
		squareyard=(edtValue)*30.250121;
		squarefoot=(edtValue)*272.251089;
		squareinch=(edtValue)*39204.156816;
		squarehectometer=(edtValue)*0.0025292954;
		squaredekameter=(edtValue)*0.2529295381;
		squaredecimeter=(edtValue)*2529.2953812;
		squarenanometer=(edtValue)*25292953811714370000.0;
		are=(edtValue)*0.2529295381;
		barn=(edtValue)*2.529295381E+29;
		squaremileus=(edtValue)*0.0000097656;
		squarefootus=(edtValue)*272.25;
		circularinch=(edtValue)*49916.282777;
		township=(edtValue)*2.712684461E-7;
		section=(edtValue)*0.0000097657;
		acreus=(edtValue)*0.00625;
		rood=(edtValue)*0.0250001;
		squarechain=(edtValue)*0.06250025;
		squarerod=(edtValue)*1.000004;
		squarerodus=(edtValue)*1;
		squareperch=(edtValue)*1.000004;
		squarepole=(edtValue)*1.000004;
		squaremil=(edtValue)*39204156816.0;
		circularmil=(edtValue)*49916282777.0;
		homestead=(edtValue)*0.0000390627;
		sabin=(edtValue)*272.251089;
		arpent=(edtValue)*0.0062586457;
		cuerda=(edtValue)*0.0064352183;
		plaza=(edtValue)*0.003952024;
		varascastellanascuad=(edtValue)*36.19810288;
		varasconuquerascaud=(edtValue)*4.0220114311;
		electroncrosssection=(edtValue)*3.802044315E+29;
		
		break;
		
  case "Square Perch ":
		
		squaremeter=(edtValue)*25.29285264;
		squarekilometer=(edtValue)*0.0000252929;
		squarecentimeter=(edtValue)*252928.5264;
		squaremilimeter=(edtValue)*25292852.64;
		squaremicrometer=(edtValue)*25292852640000.0;
		hectare=(edtValue)*0.0025292853;
		acre=(edtValue)*0.00625;
		squaremile=(edtValue)*0.0000097656;
		squareyard=(edtValue)*30.25;
		squarefoot=(edtValue)*272.25;
		squareinch=(edtValue)*39204;
		squarehectometer=(edtValue)*0.0025292853;
		squaredekameter=(edtValue)*0.2529285264;
		squaredecimeter=(edtValue)*2529.285264;
		squarenanometer=(edtValue)*25292852640000290000.0;
		are=(edtValue)*0.2529285264;
		barn=(edtValue)*2.529285264E+29;
		squaremileus=(edtValue)*0.0000097656;
		squarefootus=(edtValue)*272.248911;
		circularinch=(edtValue)*49916.083112;
		township=(edtValue)*2.712673611E-7;
		section=(edtValue)*0.0000097656;
		acreus=(edtValue)*0.006249975;
		rood=(edtValue)*0.025;
		squarechain=(edtValue)*0.0625;
		squarerod=(edtValue)*1;
		squarerodus=(edtValue)*0.999996;
		squareperch=(edtValue)*1;
		squarepole=(edtValue)*1;
		squaremil=(edtValue)*39204000000.0;
		circularmil=(edtValue)*49916083112.0;
		homestead=(edtValue)*0.0000390625;
		sabin=(edtValue)*272.25;
		arpent=(edtValue)*0.0062586207;
		cuerda=(edtValue)*0.0064351925;
		plaza=(edtValue)*0.0039520082;
		varascastellanascuad=(edtValue)*36.197958087;
		varasconuquerascaud=(edtValue)*4.021995343;
		electroncrosssection=(edtValue)*3.802029107E+29;

		break;

  case "Square Pole ":
		
		squaremeter=(edtValue)*25.29285264;
		squarekilometer=(edtValue)*0.0000252929;
		squarecentimeter=(edtValue)*252928.5264;
		squaremilimeter=(edtValue)*25292852.64;
		squaremicrometer=(edtValue)*25292852640000.0;
		hectare=(edtValue)*0.0025292853;
		acre=(edtValue)*0.00625;
		squaremile=(edtValue)*0.0000097656;
		squareyard=(edtValue)*30.25;
		squarefoot=(edtValue)*272.25;
		squareinch=(edtValue)*39204;
		squarehectometer=(edtValue)*0.0025292853;
		squaredekameter=(edtValue)*0.2529285264;
		squaredecimeter=(edtValue)*2529.285264;
		squarenanometer=(edtValue)*25292852640000290000.0;
		are=(edtValue)*0.2529285264;
		barn=(edtValue)*2.529285264E+29;
		squaremileus=(edtValue)*0.0000097656;
		squarefootus=(edtValue)*272.248911;
		circularinch=(edtValue)*49916.083112;
		township=(edtValue)*2.712673611E-7;
		section=(edtValue)*0.0000097656;
		acreus=(edtValue)*0.006249975;
		rood=(edtValue)*0.025;
		squarechain=(edtValue)*0.0625;
		squarerod=(edtValue)*1;
		squarerodus=(edtValue)*0.999996;
		squareperch=(edtValue)*1;
		squarepole=(edtValue)*1;
		squaremil=(edtValue)*39204000000.0;
		circularmil=(edtValue)*49916083112.0;
		homestead=(edtValue)*0.0000390625;
		sabin=(edtValue)*272.25;
		arpent=(edtValue)*0.0062586207;
		cuerda=(edtValue)*0.0064351925;
		plaza=(edtValue)*0.0039520082;
		varascastellanascuad=(edtValue)*36.197958087;
		varasconuquerascaud=(edtValue)*4.021995343;
		electroncrosssection=(edtValue)*3.802029107E+29;
	
		
		break;
		
  case "Square Mil - mil² ":
		
		squaremeter=(edtValue)*6.4516E-10;
		squarekilometer=(edtValue)*6.4516E-16;
		squarecentimeter=(edtValue)*0.0000064516;
		squaremilimeter=(edtValue)*0.00064516;
		squaremicrometer=(edtValue)*645.16;
		hectare=(edtValue)*6.4516E-14;
		acre=(edtValue)*1.594225079E-13;
		squaremile=(edtValue)*2.490976686E-16;
		squareyard=(edtValue)*7.716049382E-10;
		squarefoot=(edtValue)*6.944444444E-9;
		squareinch=(edtValue)*0.000001;
		squarehectometer=(edtValue)*6.4516E-14;
		squaredekameter=(edtValue)*6.4516E-12;
		squaredecimeter=(edtValue)*6.4516E-8;
		squarenanometer=(edtValue)*645160000.0;
		are=(edtValue)*6.4516E-12;
		barn=(edtValue)*6451600000000000000.0;
		squaremileus=(edtValue)*2.490966722E-16;
		squarefootus=(edtValue)*6.944416666E-9;
		circularinch=(edtValue)*0.0000012732;
		township=(edtValue)*6.919379683E-18;
		section=(edtValue)*2.490976686E-16;
		acreus=(edtValue)*1.594218702E-13;
		rood=(edtValue)*6.376900316E-13;
		squarechain=(edtValue)*1.594225079E-12;
		squarerod=(edtValue)*2.550760126E-11;
		squarerodus=(edtValue)*2.550749923E-11;
		squareperch=(edtValue)*2.550760126E-11;
		squarepole=(edtValue)*2.550760126E-11;
		squaremil=(edtValue)*1;
		circularmil=(edtValue)*1.2732395447;
		homestead=(edtValue)*9.963906744E-16;
		sabin=(edtValue)*6.944444444E-9;
		arpent=(edtValue)*1.59642401E-13;
		cuerda=(edtValue)*1.641463256E-13;
		plaza=(edtValue)*1.0080625E-13;
		varascastellanascuad=(edtValue)*9.233230815E-10;
		varasconuquerascaud=(edtValue)*1.025914535E-10;
		electroncrosssection=(edtValue)*9698064247375940000.0;
	
		
		break;
		
  case "Cirular Mil":
		
		squaremeter=(edtValue)*5.06707479E-10;
		squarekilometer=(edtValue)*5.06707479E-16;
		squarecentimeter=(edtValue)*0.0000050671;
		squaremilimeter=(edtValue)*0.0005067075;
		squaremicrometer=(edtValue)*506.7074791;
		hectare=(edtValue)*5.06707479E-14;
		acre=(edtValue)*1.252101449E-13;
		squaremile=(edtValue)*1.956408514E-16;
		squareyard=(edtValue)*6.060171013E-10;
		squarefoot=(edtValue)*5.454153912E-9;
		squareinch=(edtValue)*7.853981633E-7;
		squarehectometer=(edtValue)*5.06707479E-14;
		squaredekameter=(edtValue)*5.06707479E-12;
		squaredecimeter=(edtValue)*5.06707479E-8;
		squarenanometer=(edtValue)*506707479.1;
		are=(edtValue)*5.06707479E-12;
		barn=(edtValue)*5067074790974939000.0;
		squaremileus=(edtValue)*1.956400688E-16;
		squarefootus=(edtValue)*5.454132095E-9;
		circularinch=(edtValue)*0.000001;
		township=(edtValue)*5.434468095E-18;
		section=(edtValue)*1.956408514E-16;
		acreus=(edtValue)*1.25209644E-13;
		rood=(edtValue)*5.008405796E-13;
		squarechain=(edtValue)*1.252101449E-12;
		squarerod=(edtValue)*2.003362318E-11;
		squarerodus=(edtValue)*2.003354305E-11;
		squareperch=(edtValue)*2.003362318E-11;
		squarepole=(edtValue)*2.003362318E-11;
		squaremil=(edtValue)*0.7853981634;
		circularmil=(edtValue)*1;
		homestead=(edtValue)*7.825634057E-16;
		sabin=(edtValue)*5.454153912E-9;
		arpent=(edtValue)*1.253828485E-13;
		cuerda=(edtValue)*1.289202226E-13;
		plaza=(edtValue)*7.91730436E-14;
		varascastellanascuad=(edtValue)*7.251762524E-10;
		varasconuquerascaud=(edtValue)*8.057513915E-11;
		electroncrosssection=(edtValue)*7616841848399461000.0;
		
		
		break;
		
  case "Homestead":
		
		squaremeter=(edtValue)*647497.02758;
		squarekilometer=(edtValue)*0.6474970276;
		squarecentimeter=(edtValue)*6474970275.8;
		squaremilimeter=(edtValue)*647497027584.0;
		squaremicrometer=(edtValue)*647497027583993100.0;
		hectare=(edtValue)*64.749702758;
		acre=(edtValue)*160;
		squaremile=(edtValue)*0.25;
		squareyard=(edtValue)*774400;
		squarefoot=(edtValue)*6969600;
		squareinch=(edtValue)*1003622400;
		squarehectometer=(edtValue)*64.749702758;
		squaredekameter=(edtValue)*6474.9702758;
		squaredecimeter=(edtValue)*64749702.758;
		squarenanometer=(edtValue)*6.474970275E+23;
		are=(edtValue)*6474.9702758;
		barn=(edtValue)*6.474970275E+33;
		squaremileus=(edtValue)*0.249999;
		squarefootus=(edtValue)*6969572.1216;
		circularinch=(edtValue)*1277851727.7;
		township=(edtValue)*0.0069444444;
		section=(edtValue)*0.25;
		acreus=(edtValue)*159.99936;
		rood=(edtValue)*640;
		squarechain=(edtValue)*1600;
		squarerod=(edtValue)*25600;
		squarerodus=(edtValue)*25599.8976;
		squareperch=(edtValue)*25600;
		squarepole=(edtValue)*25600;
		squaremil=(edtValue)*1003622399999989.0;
		circularmil=(edtValue)*1277851727662007.0;
		homestead=(edtValue)*1;
		sabin=(edtValue)*6969600;
		arpent=(edtValue)*160.22068966;
		cuerda=(edtValue)*164.74092925;
		plaza=(edtValue)*101.17141056;
		varascastellanascuad=(edtValue)*926667.72703;
		varasconuquerascaud=(edtValue)*102963.08078;
		electroncrosssection=(edtValue)*9.733194515E+33;
	
		
		break;
		
		
  case "Sabin":
		
		squaremeter=(edtValue)*0.09290304;
		squarekilometer=(edtValue)*9.290303999E-8;
		squarecentimeter=(edtValue)*929.0304;
		squaremilimeter=(edtValue)*92903.04;
		squaremicrometer=(edtValue)*92903040000.0;
		hectare=(edtValue)*0.0000092903;
		acre=(edtValue)*0.0000229568;
		squaremile=(edtValue)*3.587006427E-8;
		squareyard=(edtValue)*0.1111111111;
		squarefoot=(edtValue)*1;
		squareinch=(edtValue)*144;
		squarehectometer=(edtValue)*0.0000092903;
		squaredekameter=(edtValue)*0.0009290304;
		squaredecimeter=(edtValue)*9.290304;
		squarenanometer=(edtValue)*92903039999997600.0;
		are=(edtValue)*0.0009290304;
		barn=(edtValue)*9.290303999E+26;
		squaremileus=(edtValue)*3.586992079E-8;
		squarefootus=(edtValue)*0.999996;
		circularinch=(edtValue)*183.34649444;
		township=(edtValue)*9.963906744E-10;
		section=(edtValue)*3.587006427E-8;
		acreus=(edtValue)*0.0000229567;
		rood=(edtValue)*0.0000918274;
		squarechain=(edtValue)*0.0002295684;
		squarerod=(edtValue)*0.0036730946;
		squarerodus=(edtValue)*0.0036730799;
		squareperch=(edtValue)*0.0036730946;
		squarepole=(edtValue)*0.0036730946;
		squaremil=(edtValue)*144000000;
		circularmil=(edtValue)*183346494.44;
		homestead=(edtValue)*1.434802571E-7;
		sabin=(edtValue)*1;
		arpent=(edtValue)*0.0000229885;
		cuerda=(edtValue)*0.0000236371;
		plaza=(edtValue)*0.0000145161;
		varascastellanascuad=(edtValue)*0.1329585237;
		varasconuquerascaud=(edtValue)*0.0147731693;
		electroncrosssection=(edtValue)*1.396521251E+27;
		
		
		break;
		
  case "Arpent":
		
		squaremeter=(edtValue)*4041.28224;
		squarekilometer=(edtValue)*0.0040412822;
		squarecentimeter=(edtValue)*40412822.4;
		squaremilimeter=(edtValue)*4041282240.0;
		squaremicrometer=(edtValue)*4041282239999928.0;
		hectare=(edtValue)*0.404128224;
		acre=(edtValue)*0.9986225895;
		squaremile=(edtValue)*0.0015603478;
		squareyard=(edtValue)*4833.3333333;
		squarefoot=(edtValue)*43500;
		squareinch=(edtValue)*6264000;
		squarehectometer=(edtValue)*0.404128224;
		squaredekameter=(edtValue)*40.4128224;
		squaredecimeter=(edtValue)*404128.224;
		squarenanometer=(edtValue)*4.041282239E+21;
		are=(edtValue)*40.4128224;
		barn=(edtValue)*4.041282239E+31;
		squaremileus=(edtValue)*0.0015603416;
		squarefootus=(edtValue)*43499.826;
		circularinch=(edtValue)*7975572.5082;
		township=(edtValue)*0.000043343;
		section=(edtValue)*0.0015603478;
		acreus=(edtValue)*0.998618595;
		rood=(edtValue)*3.9944903581;
		squarechain=(edtValue)*9.9862258953;
		squarerod=(edtValue)*159.77961433;
		squarerodus=(edtValue)*159.77897521;
		squareperch=(edtValue)*159.77961433;
		squarepole=(edtValue)*159.77961433;
		squaremil=(edtValue)*6264000000000.0;
		circularmil=(edtValue)*7975572508221.0;
		homestead=(edtValue)*0.0062413912;
		sabin=(edtValue)*43500;
		arpent=(edtValue)*1;
		cuerda=(edtValue)*1.0282125836;
		plaza=(edtValue)*0.63145035;
		varascastellanascuad=(edtValue)*5783.6957825;
		varasconuquerascaud=(edtValue)*642.63286473;
		electroncrosssection=(edtValue)*6.074867444E+31;

		break;
  case "Cuerda":
		
		squaremeter=(edtValue)*3930.395625;
		squarekilometer=(edtValue)*0.0039303956;
		squarecentimeter=(edtValue)*39303956.25;
		squaremilimeter=(edtValue)*3930395625.0;
		squaremicrometer=(edtValue)*3930395625000000.0;
		hectare=(edtValue)*0.3930395625;
		acre=(edtValue)*0.9712219102;
		squaremile=(edtValue)*0.0015175342;
		squareyard=(edtValue)*4700.7140455;
		squarefoot=(edtValue)*42306.42641;
		squareinch=(edtValue)*6092125.403;
		squarehectometer=(edtValue)*0.3930395625;
		squaredekameter=(edtValue)*39.30395625;
		squaredecimeter=(edtValue)*393039.5625;
		squarenanometer=(edtValue)*3.930395624E+21;
		are=(edtValue)*39.30395625;
		barn=(edtValue)*3.930395624E+31;
		squaremileus=(edtValue)*0.0015175282;
		squarefootus=(edtValue)*42306.257184;
		circularinch=(edtValue)*7756734.9746;
		township=(edtValue)*0.0000421537;
		section=(edtValue)*0.0015175342;
		acreus=(edtValue)*0.9712180253;
		rood=(edtValue)*3.8848876409;
		squarechain=(edtValue)*9.7122191023;
		squarerod=(edtValue)*155.39550564;
		squarerodus=(edtValue)*155.39488406;
		squareperch=(edtValue)*155.39550564;
		squarepole=(edtValue)*155.39550564;
		squaremil=(edtValue)*6092125403001.0;
		circularmil=(edtValue)*7756734974586.0;
		homestead=(edtValue)*0.0060701369;
		sabin=(edtValue)*42306.42641;
		arpent=(edtValue)*0.9725615267;
		cuerda=(edtValue)*1;
		plaza=(edtValue)*0.6141243164;
		varascastellanascuad=(edtValue)*5625;
		varasconuquerascaud=(edtValue)*625;
		electroncrosssection=(edtValue)*5.908182356E+31;
		
		
		break;
		
  case "Plaza":
		
		squaremeter=(edtValue)*6400;
		squarekilometer=(edtValue)*0.0064;
		squarecentimeter=(edtValue)*64000000;
		squaremilimeter=(edtValue)*6400000000.0;
		squaremicrometer=(edtValue)*6400000000000000.0;
		hectare=(edtValue)*0.64;
		acre=(edtValue)*1.5814744414;
		squaremile=(edtValue)*0.0024710538;
		squareyard=(edtValue)*7654.3362963;
		squarefoot=(edtValue)*68889.026667;
		squareinch=(edtValue)*9920019.84;
		squarehectometer=(edtValue)*0.64;
		squaredekameter=(edtValue)*64;
		squaredecimeter=(edtValue)*640000;
		squarenanometer=(edtValue)*6.4E+21;
		are=(edtValue)*64;
		barn=(edtValue)*6.4E+31;
		squaremileus=(edtValue)*0.0024710439;
		squarefootus=(edtValue)*68888.751111;
		circularinch=(edtValue)*12630561.545;
		township=(edtValue)*0.0000686404;
		section=(edtValue)*0.0024710538;
		acreus=(edtValue)*1.5814681155;
		rood=(edtValue)*6.3258977656;
		squarechain=(edtValue)*15.814744414;
		squarerod=(edtValue)*253.03591062;
		squarerodus=(edtValue)*253.03489848;
		squareperch=(edtValue)*253.03591062;
		squarepole=(edtValue)*253.03591062;
		squaremil=(edtValue)*9920019840040.0;
		circularmil=(edtValue)*12630561544896.0;
		homestead=(edtValue)*0.0098842153;
		sabin=(edtValue)*68889.026667;
		arpent=(edtValue)*1.5836557854;
		cuerda=(edtValue)*1.6283348066;
		plaza=(edtValue)*1;
		varascastellanascuad=(edtValue)*9159.3832873;
		varasconuquerascaud=(edtValue)*1017.7092541;
		electroncrosssection=(edtValue)*9.620498974E+31;
		
		
		break;
		
  case "Varas Castellanas Cuad":
		
		squaremeter=(edtValue)*0.698737;
		squarekilometer=(edtValue)*6.987369999E-7;
		squarecentimeter=(edtValue)*6987.37;
		squaremilimeter=(edtValue)*698737;
		squaremicrometer=(edtValue)*698737000000.0;
		hectare=(edtValue)*0.0000698737;
		acre=(edtValue)*0.0001726617;
		squaremile=(edtValue)*2.697838639E-7;
		squareyard=(edtValue)*0.835682497;
		squarefoot=(edtValue)*7.5211424728;
		squareinch=(edtValue)*1083.0445161;
		squarehectometer=(edtValue)*0.0000698737;
		squaredekameter=(edtValue)*0.00698737;
		squaredecimeter=(edtValue)*69.8737;
		squarenanometer=(edtValue)*698736999999984600.0;
		are=(edtValue)*0.00698737;
		barn=(edtValue)*6.987369999E+27;
		squaremileus=(edtValue)*2.697827848E-7;
		squarefootus=(edtValue)*7.5211123883;
		circularinch=(edtValue)*1378.9751066;
		township=(edtValue)*7.49399622E-9;
		section=(edtValue)*2.697838639E-7;
		acreus=(edtValue)*0.000172661;
		rood=(edtValue)*0.0006906467;
		squarechain=(edtValue)*0.0017266167;
		squarerod=(edtValue)*0.0276258677;
		squarerodus=(edtValue)*0.0276257572;
		squareperch=(edtValue)*0.0276258677;
		squarepole=(edtValue)*0.0276258677;
		squaremil=(edtValue)*1083044516.1;
		circularmil=(edtValue)*1378975106.6;
		homestead=(edtValue)*0.0000010791;
		sabin=(edtValue)*7.5211424728;
		arpent=(edtValue)*0.0001728998;
		cuerda=(edtValue)*0.0001777778;
		plaza=(edtValue)*0.0001091777;
		varascastellanascuad=(edtValue)*1;
		varasconuquerascaud=(edtValue)*0.1111111111;
		electroncrosssection=(edtValue)*1.050343529E+28;
		
		break;
			
  case "Varas Conuqueras Cuad":
		
		squaremeter=(edtValue)*6.288633;
		squarekilometer=(edtValue)*0.0000062886;
		squarecentimeter=(edtValue)*62886.33;
		squaremilimeter=(edtValue)*6288633;
		squaremicrometer=(edtValue)*6288633000000.0;
		hectare=(edtValue)*0.0006288633;
		acre=(edtValue)*0.0015539551;
		squaremile=(edtValue)*0.0000024281;
		squareyard=(edtValue)*7.5211424728;
		squarefoot=(edtValue)*67.690282256;
		squareinch=(edtValue)*9747.4006448;
		squarehectometer=(edtValue)*0.0006288633;
		squaredekameter=(edtValue)*0.06288633;
		squaredecimeter=(edtValue)*628.8633;
		squarenanometer=(edtValue)*6288632999999950000.0;
		are=(edtValue)*0.06288633;
		barn=(edtValue)*6.288632999E+28;
		squaremileus=(edtValue)*0.000002428;
		squarefootus=(edtValue)*67.690011495;
		circularinch=(edtValue)*12410.775959;
		township=(edtValue)*6.744596598E-8;
		section=(edtValue)*0.0000024281;
		acreus=(edtValue)*0.0015539488;
		rood=(edtValue)*0.0062158202;
		squarechain=(edtValue)*0.0155395506;
		squarerod=(edtValue)*0.248632809;
		squarerodus=(edtValue)*0.2486318145;
		squareperch=(edtValue)*0.248632809;
		squarepole=(edtValue)*0.248632809;
		squaremil=(edtValue)*9747400644.8;
		circularmil=(edtValue)*12410775959.0;
		homestead=(edtValue)*0.0000097122;
		sabin=(edtValue)*67.690282256;
		arpent=(edtValue)*0.0015560984;
		cuerda=(edtValue)*0.0016;
		plaza=(edtValue)*0.0009825989;
		varascastellanascuad=(edtValue)*9;
		varasconuquerascaud=(edtValue)*1;
		electroncrosssection=(edtValue)*9.453091769E+28;
		
		
		break;
		
  case "Electron Cross Section ":
		
		squaremeter=(edtValue)*6.652461599E-29;
		squarekilometer=(edtValue)*6.652461599E-35;
		squarecentimeter=(edtValue)*6.652461599E-25;
		squaremilimeter=(edtValue)*6.652461599E-23;
		squaremicrometer=(edtValue)*6.652461599E-17;
		hectare=(edtValue)*6.652461599E-33;
		acre=(edtValue)*1.643859061E-32;
		squaremile=(edtValue)*2.568529783E-35;
		squareyard=(edtValue)*7.956277857E-29;
		squarefoot=(edtValue)*7.160650071E-28;
		squareinch=(edtValue)*1.03113361E-25;
		squarehectometer=(edtValue)*6.652461599E-33;
		squaredekameter=(edtValue)*6.652461599E-31;
		squaredecimeter=(edtValue)*6.652461599E-27;
		squarenanometer=(edtValue)*6.652461599E-11;
		are=(edtValue)*6.652461599E-31;
		barn=(edtValue)*0.66524616;
		squaremileus=(edtValue)*2.568519509E-35;
		squarefootus=(edtValue)*7.160621428E-28;
		circularinch=(edtValue)*1.312880088E-25;
		township=(edtValue)*7.134804953E-37;
		section=(edtValue)*2.568529783E-35;
		acreus=(edtValue)*1.643852485E-32;
		rood=(edtValue)*6.575436245E-32;
		squarechain=(edtValue)*1.643859061E-31;
		squarerod=(edtValue)*2.630174498E-30;
		squarerodus=(edtValue)*2.630163977E-30;
		squareperch=(edtValue)*2.630174498E-30;
		squarepole=(edtValue)*2.630174498E-30;
		squaremil=(edtValue)*1.03113361E-19;
		circularmil=(edtValue)*1.312880088E-19;
		homestead=(edtValue)*1.027411913E-34;
		sabin=(edtValue)*7.160650071E-28;
		arpent=(edtValue)*1.646126453E-32;
		cuerda=(edtValue)*1.692567933E-32;
		plaza=(edtValue)*1.039447124E-32;
		varascastellanascuad=(edtValue)*9.520694624E-29;
		varasconuquerascaud=(edtValue)*1.057854958E-29;
		electroncrosssection=(edtValue)*1;
		
		
		break;
			
		}
		 results.setSquaremeter(squaremeter);
		 results.setSquarekilometer(squarekilometer);
		 results.setSquarecentimeter(squarecentimeter);
		 results.setSquaremilimeter(squaremilimeter);
		 results.setSquaremicrometer(squaremicrometer);
		 results.setHectare(hectare);
		 results.setAcre(acre);
		 results.setSquaremile(squaremile);
		 results.setSquareyard(squareyard);
		 results.setSquarefoot(squarefoot);
		 results.setSquareinch(squareinch);
		 results.setSquarehectometer(squarehectometer);
		 results.setSquaredekameter(squaredekameter);
		 results.setSquaredecimeter(squaredecimeter);
		 results.setSquarenanometer(squarenanometer);
		 results.setAre(are);
		 results.setBarn(barn);
		 results.setSquaremileus(squaremileus);
		 results.setSquarefootus(squarefootus);
		 results.setCircularinch(circularinch);
		 results.setTownship(township);
		 results.setSection(section);
		 results.setAcreus(acreus);
		 results.setRood(rood);
		 results.setSquarechain(squarechain);
		 results.setSquarerod(squarerod);
		 results.setSquarerodus(squarerodus);
		 results.setSquareperch(squareperch);
		 results.setSquarepole(squarepole);
		 results.setSquaremil(squaremil);
		 results.setCircularmil(circularmil);
		 results.setHomestead(homestead);
		 results.setSabin(sabin);
		 results.setArpent(arpent);
		 results.setCuerda(cuerda);
		 results.setPlaza(plaza);
		 results.setVarascastellanascuad(varascastellanascuad);
		 results.setVarasconuquerascaud(varasconuquerascaud);
		 results.setElectroncrosssection(electroncrosssection);
		 
		
		 
		 converterArray.add(results);
		    return converterArray;
		    
	    }
				
			public class ConversionResults{
				
				private double squaremeter,squarekilometer,squarecentimeter,squaremilimeter,squaremicrometer,hectare,acre,squaremile,squareyard,squarefoot,squareinch,squarehectometer,
				squaredekameter,squaredecimeter,squarenanometer,are,barn,squaremileus,squarefootus,circularinch,township,section,acreus,rood,squarechain,squarerod,squarerodus,squareperch,
				squarepole,squaremil,circularmil,homestead,sabin,arpent,cuerda,plaza,varascastellanascuad,varasconuquerascaud,electroncrosssection;

				public double getSquaremeter() {
					return squaremeter;
				}

				public void setSquaremeter(double squaremeter) {
					this.squaremeter = squaremeter;
				}

				public double getSquarekilometer() {
					return squarekilometer;
				}

				public void setSquarekilometer(double squarekilometer) {
					this.squarekilometer = squarekilometer;
				}

				public double getSquarecentimeter() {
					return squarecentimeter;
				}

				public void setSquarecentimeter(double squarecentimeter) {
					this.squarecentimeter = squarecentimeter;
				}

				public double getSquaremilimeter() {
					return squaremilimeter;
				}

				public void setSquaremilimeter(double squaremilimeter) {
					this.squaremilimeter = squaremilimeter;
				}

				public double getSquaremicrometer() {
					return squaremicrometer;
				}

				public void setSquaremicrometer(double squaremicrometer) {
					this.squaremicrometer = squaremicrometer;
				}

				public double getHectare() {
					return hectare;
				}

				public void setHectare(double hectare) {
					this.hectare = hectare;
				}

				public double getAcre() {
					return acre;
				}

				public void setAcre(double acre) {
					this.acre = acre;
				}

				public double getSquaremile() {
					return squaremile;
				}

				public void setSquaremile(double squaremile) {
					this.squaremile = squaremile;
				}

				public double getSquareyard() {
					return squareyard;
				}

				public void setSquareyard(double squareyard) {
					this.squareyard = squareyard;
				}

				public double getSquarefoot() {
					return squarefoot;
				}

				public void setSquarefoot(double squarefoot) {
					this.squarefoot = squarefoot;
				}

				public double getSquareinch() {
					return squareinch;
				}

				public void setSquareinch(double squareinch) {
					this.squareinch = squareinch;
				}

				public double getSquarehectometer() {
					return squarehectometer;
				}

				public void setSquarehectometer(double squarehectometer) {
					this.squarehectometer = squarehectometer;
				}

				public double getSquaredekameter() {
					return squaredekameter;
				}

				public void setSquaredekameter(double squaredekameter) {
					this.squaredekameter = squaredekameter;
				}

				public double getSquaredecimeter() {
					return squaredecimeter;
				}

				public void setSquaredecimeter(double squaredecimeter) {
					this.squaredecimeter = squaredecimeter;
				}

				public double getSquarenanometer() {
					return squarenanometer;
				}

				public void setSquarenanometer(double squarenanometer) {
					this.squarenanometer = squarenanometer;
				}

				public double getAre() {
					return are;
				}

				public void setAre(double are) {
					this.are = are;
				}

				public double getBarn() {
					return barn;
				}

				public void setBarn(double barn) {
					this.barn = barn;
				}

				public double getSquaremileus() {
					return squaremileus;
				}

				public void setSquaremileus(double squaremileus) {
					this.squaremileus = squaremileus;
				}

				public double getSquarefootus() {
					return squarefootus;
				}

				public void setSquarefootus(double squarefootus) {
					this.squarefootus = squarefootus;
				}

				public double getCircularinch() {
					return circularinch;
				}

				public void setCircularinch(double circularinch) {
					this.circularinch = circularinch;
				}

				public double getTownship() {
					return township;
				}

				public void setTownship(double township) {
					this.township = township;
				}

				public double getSection() {
					return section;
				}

				public void setSection(double section) {
					this.section = section;
				}

				public double getAcreus() {
					return acreus;
				}

				public void setAcreus(double acreus) {
					this.acreus = acreus;
				}

				public double getRood() {
					return rood;
				}

				public void setRood(double rood) {
					this.rood = rood;
				}

				public double getSquarechain() {
					return squarechain;
				}

				public void setSquarechain(double squarechain) {
					this.squarechain = squarechain;
				}

				public double getSquarerod() {
					return squarerod;
				}

				public void setSquarerod(double squarerod) {
					this.squarerod = squarerod;
				}

				public double getSquarerodus() {
					return squarerodus;
				}

				public void setSquarerodus(double squarerodus) {
					this.squarerodus = squarerodus;
				}

				public double getSquareperch() {
					return squareperch;
				}

				public void setSquareperch(double squareperch) {
					this.squareperch = squareperch;
				}

				public double getSquarepole() {
					return squarepole;
				}

				public void setSquarepole(double squarepole) {
					this.squarepole = squarepole;
				}

				public double getSquaremil() {
					return squaremil;
				}

				public void setSquaremil(double squaremil) {
					this.squaremil = squaremil;
				}

				public double getCircularmil() {
					return circularmil;
				}

				public void setCircularmil(double circularmil) {
					this.circularmil = circularmil;
				}

				public double getHomestead() {
					return homestead;
				}

				public void setHomestead(double homestead) {
					this.homestead = homestead;
				}

				public double getSabin() {
					return sabin;
				}

				public void setSabin(double sabin) {
					this.sabin = sabin;
				}

				public double getArpent() {
					return arpent;
				}

				public void setArpent(double arpent) {
					this.arpent = arpent;
				}

				public double getCuerda() {
					return cuerda;
				}

				public void setCuerda(double cuerda) {
					this.cuerda = cuerda;
				}

				public double getPlaza() {
					return plaza;
				}

				public void setPlaza(double plaza) {
					this.plaza = plaza;
				}

				public double getVarascastellanascuad() {
					return varascastellanascuad;
				}

				public void setVarascastellanascuad(double varascastellanascuad) {
					this.varascastellanascuad = varascastellanascuad;
				}

				public double getVarasconuquerascaud() {
					return varasconuquerascaud;
				}

				public void setVarasconuquerascaud(double varasconuquerascaud) {
					this.varasconuquerascaud = varasconuquerascaud;
				}

				public double getElectroncrosssection() {
					return electroncrosssection;
				}

				public void setElectroncrosssection(double electroncrosssection) {
					this.electroncrosssection = electroncrosssection;
				}
				
				
				
			}
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
