package com.nineinfosys.basicconverter.Engin;

import java.util.ArrayList;


public class DataStorageConverter {

	 private double bitt,nibblee,bytee,characterr,wordd,mapmwordd,quadd,blockk,kilobitt,kilobytee,
	                kilobytee2,megabitt,megabytee,megabytee2,gigabitt,gigabytee,gigabytee2,terabitt,terabytee,terabytee2,
	                petabitt,petabytee,petabytee2,exabitt,exabytee,exabytee2,floppydiskk1,floppydiskk2,floppydiskk3,floppydiskk4,
	                floppydiskk5,zip1,zip2,jaz1,jaz2,cd1,cd2,dvd1,dvd2,dvd3,dvd4;

	  
		private double edtValue;
		private String conversionFrom;
		
				
		

		public DataStorageConverter(String conversionFrom, double edtValue) {
					
					this.conversionFrom = conversionFrom;
					this.edtValue = edtValue;
				}

				

				public ArrayList<ConversionResults> calculatestorageConversion()
				
			    {
			    	
					ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
						
					ConversionResults results= new ConversionResults();
			    		 	
					switch(conversionFrom)
					
					{
					
					case "Bit - b":
						
					
						bitt=(edtValue)*1;
						nibblee=(edtValue)*0.25;
						bytee=(edtValue)*0.125;
						characterr=(edtValue)*0.125;
						wordd=(edtValue)*0.0625;
						mapmwordd=(edtValue)*0.03125;
						quadd=(edtValue)*0.015625;
						blockk=(edtValue)*0.0002441406;
						kilobitt=(edtValue)*0.0009765625;
						kilobytee=(edtValue)*0.0001220703;
						kilobytee2=(edtValue)*0.000125;
						megabitt=(edtValue)*9.536743164E-7;
						megabytee=(edtValue)*1.192092895E-7;
						megabytee2=(edtValue)*1.25E-7;
						gigabitt=(edtValue)*9.313225746E-10;
						gigabytee=(edtValue)*1.164153218E-10;
						gigabytee2=(edtValue)*1.25E-10;
						terabitt=(edtValue)*9.094947017E-13;
						terabytee=(edtValue)*1.136868377E-13;
						terabytee2=(edtValue)*1.25E-13;
						petabitt=(edtValue)*8.881784197E-16;
						petabytee=(edtValue)*1.110223024E-16;
						petabytee2=(edtValue)*1.25E-16;
						exabitt=(edtValue)*8.673617379E-19;
						exabytee=(edtValue)*1.084202172E-19;
						exabytee2=(edtValue)*1.25E-19;
						floppydiskk1=(edtValue)*1.715072883E-7;
						floppydiskk2=(edtValue)*8.575364418E-8;
						floppydiskk3=(edtValue)*4.287682209E-8;
						floppydiskk4=(edtValue)*3.430145767E-7;
						floppydiskk5=(edtValue)*1.029694749E-7;
						zip1=(edtValue)*1.244624813E-9;
						zip2=(edtValue)*4.978499255E-10;
						jaz1=(edtValue)*1.164153218E-10;
						jaz2=(edtValue)*5.820766091E-11;
						cd1=(edtValue)*1.83537884E-10;
						cd2=(edtValue)*1.697725428E-10;
						dvd1=(edtValue)*2.47692174E-11;
						dvd2=(edtValue)*1.369592021E-11;
						dvd3=(edtValue)*1.23846087E-11;
						dvd4=(edtValue)*6.847960107E-12;


						 break;

	                  case "Nibble - n":

	                	    bitt=(edtValue)*4;
							nibblee=(edtValue)*1;
							bytee=(edtValue)*0.5;
							characterr=(edtValue)*0.5;
							wordd=(edtValue)*0.25;
							mapmwordd=(edtValue)*0.125;
							quadd=(edtValue)*0.0625;
							blockk=(edtValue)*0.0009765625;
							kilobitt=(edtValue)*0.00390625;
							kilobytee=(edtValue)*0.0004882813;
							kilobytee2=(edtValue)*0.0005;
							megabitt=(edtValue)*0.0000038147;
							megabytee=(edtValue)*4.768371582E-7;
							megabytee2=(edtValue)*5.E-7;
							gigabitt=(edtValue)*3.725290298E-9;
							gigabytee=(edtValue)*4.656612873E-10;
							gigabytee2=(edtValue)*5.E-10;
							terabitt=(edtValue)*3.637978807E-12;
							terabytee=(edtValue)*4.547473508E-13;
							terabytee2=(edtValue)*5.E-13;
							petabitt=(edtValue)*3.552713678E-15;
							petabytee=(edtValue)*4.440892098E-16;
							petabytee2=(edtValue)*5.E-16;
							exabitt=(edtValue)*3.469446951E-18;
							exabytee=(edtValue)*4.336808689E-19;
							exabytee2=(edtValue)*5.E-19;
							floppydiskk1=(edtValue)*6.860291534E-7;
							floppydiskk2=(edtValue)*3.430145767E-7;
							floppydiskk3=(edtValue)*1.715072883E-7;
							floppydiskk4=(edtValue)*0.0000013721;
							floppydiskk5=(edtValue)*4.118778996E-7;
							zip1=(edtValue)*4.978499255E-9;
							zip2=(edtValue)*1.991399702E-9;
							jaz1=(edtValue)*4.656612873E-10;
							jaz2=(edtValue)*2.328306436E-10;
							cd1=(edtValue)*7.34151536E-10;
							cd2=(edtValue)*6.790901713E-10;
							dvd1=(edtValue)*9.907686963E-11;
							dvd2=(edtValue)*5.478368085E-11;
							dvd3=(edtValue)*4.953843481E-11;
							dvd4=(edtValue)*2.739184042E-11;

						 break;
	                case "Byte - B":

	                	bitt=(edtValue)*8;
						nibblee=(edtValue)*2;
						bytee=(edtValue)*1;
						characterr=(edtValue)*1;
						wordd=(edtValue)*0.5;
						mapmwordd=(edtValue)*0.25;
						quadd=(edtValue)*0.125;
						blockk=(edtValue)*0.001953125;
						kilobitt=(edtValue)*0.0078125;
						kilobytee=(edtValue)*0.0009765625;
						kilobytee2=(edtValue)*0.001;
						megabitt=(edtValue)*0.0000076294;
						megabytee=(edtValue)*9.536743164E-7;
						megabytee2=(edtValue)*0.000001;
						gigabitt=(edtValue)*7.450580596E-9;
						gigabytee=(edtValue)*9.313225746E-10;
						gigabytee2=(edtValue)*1.E-9;
						terabitt=(edtValue)*7.275957614E-12;
						terabytee=(edtValue)*9.094947017E-13;
						terabytee2=(edtValue)*1.E-12;
						petabitt=(edtValue)*7.105427357E-15;
						petabytee=(edtValue)*8.881784197E-16;
						petabytee2=(edtValue)*1.E-15;
						exabitt=(edtValue)*6.938893903E-18;
						exabytee=(edtValue)*8.673617379E-19;
						exabytee2=(edtValue)*1.E-18;
						floppydiskk1=(edtValue)*0.0000013721;
						floppydiskk2=(edtValue)*6.860291534E-7;
						floppydiskk3=(edtValue)*3.430145767E-7;
						floppydiskk4=(edtValue)*0.0000027441;
						floppydiskk5=(edtValue)*8.237557992E-7;
						zip1=(edtValue)*9.956998511E-9;
						zip2=(edtValue)*3.982799404E-9;
						jaz1=(edtValue)*9.313225746E-10;
						jaz2=(edtValue)*4.656612873E-10;
						cd1=(edtValue)*1.468303072E-9;
						cd2=(edtValue)*1.358180342E-9;
						dvd1=(edtValue)*1.981537392E-10;
						dvd2=(edtValue)*1.095673617E-10;
						dvd3=(edtValue)*9.907686963E-11;
						dvd4=(edtValue)*5.478368085E-11;


		 break;
	case "Character - ch":
		bitt=(edtValue)*8;
		nibblee=(edtValue)*2;
		bytee=(edtValue)*1;
		characterr=(edtValue)*1;
		wordd=(edtValue)*0.5;
		mapmwordd=(edtValue)*0.25;
		quadd=(edtValue)*0.125;
		blockk=(edtValue)*0.001953125;
		kilobitt=(edtValue)*0.0078125;
		kilobytee=(edtValue)*0.0009765625;
		kilobytee2=(edtValue)*0.001;
		megabitt=(edtValue)*0.0000076294;
		megabytee=(edtValue)*9.536743164E-7;
		megabytee2=(edtValue)*0.000001;
		gigabitt=(edtValue)*7.450580596E-9;
		gigabytee=(edtValue)*9.313225746E-10;
		gigabytee2=(edtValue)*1.E-9;
		terabitt=(edtValue)*7.275957614E-12;
		terabytee=(edtValue)*9.094947017E-13;
		terabytee2=(edtValue)*1.E-12;
		petabitt=(edtValue)*7.105427357E-15;
		petabytee=(edtValue)*8.881784197E-16;
		petabytee2=(edtValue)*1.E-15;
		exabitt=(edtValue)*6.938893903E-18;
		exabytee=(edtValue)*8.673617379E-19;
		exabytee2=(edtValue)*1.E-18;
		floppydiskk1=(edtValue)*0.0000013721;
		floppydiskk2=(edtValue)*6.860291534E-7;
		floppydiskk3=(edtValue)*3.430145767E-7;
		floppydiskk4=(edtValue)*0.0000027441;
		floppydiskk5=(edtValue)*8.237557992E-7;
		zip1=(edtValue)*9.956998511E-9;
		zip2=(edtValue)*3.982799404E-9;
		jaz1=(edtValue)*9.313225746E-10;
		jaz2=(edtValue)*4.656612873E-10;
		cd1=(edtValue)*1.468303072E-9;
		cd2=(edtValue)*1.358180342E-9;
		dvd1=(edtValue)*1.981537392E-10;
		dvd2=(edtValue)*1.095673617E-10;
		dvd3=(edtValue)*9.907686963E-11;
		dvd4=(edtValue)*5.478368085E-11;



		 break;
	case "Word - w":

		bitt=(edtValue)*16;
		nibblee=(edtValue)*4;
		bytee=(edtValue)*2;
		characterr=(edtValue)*2;
		wordd=(edtValue)*1;
		mapmwordd=(edtValue)*0.5;
		quadd=(edtValue)*0.25;
		blockk=(edtValue)*0.00390625;
		kilobitt=(edtValue)*0.015625;
		kilobytee=(edtValue)*0.001953125;
		kilobytee2=(edtValue)*0.002;
		megabitt=(edtValue)*0.0000152588;
		megabytee=(edtValue)*0.0000019073;
		megabytee2=(edtValue)*0.000002;
		gigabitt=(edtValue)*1.490116119E-8;
		gigabytee=(edtValue)*1.862645149E-9;
		gigabytee2=(edtValue)*2.E-9;
		terabitt=(edtValue)*1.455191522E-11;
		terabytee=(edtValue)*1.818989403E-12;
		terabytee2=(edtValue)*2.E-12;
		petabitt=(edtValue)*1.421085471E-14;
		petabytee=(edtValue)*1.776356839E-15;
		petabytee2=(edtValue)*2.E-15;
		exabitt=(edtValue)*1.38777878E-17;
		exabytee=(edtValue)*1.734723475E-18;
		exabytee2=(edtValue)*2.E-18;
		floppydiskk1=(edtValue)*0.0000027441;
		floppydiskk2=(edtValue)*0.0000013721;
		floppydiskk3=(edtValue)*6.860291534E-7;
		floppydiskk4=(edtValue)*0.0000054882;
		floppydiskk5=(edtValue)*0.0000016475;
		zip1=(edtValue)*1.991399702E-8;
		zip2=(edtValue)*7.965598809E-9;
		jaz1=(edtValue)*1.862645149E-9;
		jaz2=(edtValue)*9.313225746E-10;
		cd1=(edtValue)*2.936606144E-9;
		cd2=(edtValue)*2.716360685E-9;
		dvd1=(edtValue)*3.963074785E-10;
		dvd2=(edtValue)*2.191347234E-10;
		dvd3=(edtValue)*1.981537392E-10;
		dvd4=(edtValue)*1.095673617E-10;


		 break;
	case "MAPM-word - w":

		bitt=(edtValue)*32;
		nibblee=(edtValue)*8;
		bytee=(edtValue)*4;
		characterr=(edtValue)*4;
		wordd=(edtValue)*2;
		mapmwordd=(edtValue)*1;
		quadd=(edtValue)*0.5;
		blockk=(edtValue)*0.0078125;
		kilobitt=(edtValue)*0.03125;
		kilobytee=(edtValue)*0.00390625;
		kilobytee2=(edtValue)*0.004;
		megabitt=(edtValue)*0.0000305176;
		megabytee=(edtValue)*0.0000038147;
		megabytee2=(edtValue)*0.000004;
		gigabitt=(edtValue)*2.980232238E-8;
		gigabytee=(edtValue)*3.725290298E-9;
		gigabytee2=(edtValue)*4.E-9;
		terabitt=(edtValue)*2.910383045E-11;
		terabytee=(edtValue)*3.637978807E-12;
		terabytee2=(edtValue)*4.E-12;
		petabitt=(edtValue)*2.842170943E-14;
		petabytee=(edtValue)*3.552713678E-15;
		petabytee2=(edtValue)*4.E-15;
		exabitt=(edtValue)*2.775557561E-17;
		exabytee=(edtValue)*3.469446951E-18;
		exabytee2=(edtValue)*4.E-18;
		floppydiskk1=(edtValue)*0.0000054882;
		floppydiskk2=(edtValue)*0.0000027441;
		floppydiskk3=(edtValue)*0.0000013721;
		floppydiskk4=(edtValue)*0.0000109765;
		floppydiskk5=(edtValue)*0.000003295;
		zip1=(edtValue)*3.982799404E-8;
		zip2=(edtValue)*1.593119761E-8;
		jaz1=(edtValue)*3.725290298E-9;
		jaz2=(edtValue)*1.862645149E-9;
		cd1=(edtValue)*5.873212288E-9;
		cd2=(edtValue)*5.43272137E-9;
		dvd1=(edtValue)*7.926149571E-10;
		dvd2=(edtValue)*4.382694468E-10;
		dvd3=(edtValue)*3.963074785E-10;
		dvd4=(edtValue)*2.191347234E-10;


		 break;
	case "Quadruple-word - w":

		bitt=(edtValue)*64;
		nibblee=(edtValue)*16;
		bytee=(edtValue)*8;
		characterr=(edtValue)*8;
		wordd=(edtValue)*4;
		mapmwordd=(edtValue)*2;
		quadd=(edtValue)*1;
		blockk=(edtValue)*0.015625;
		kilobitt=(edtValue)*0.0625;
		kilobytee=(edtValue)*0.0078125;
		kilobytee2=(edtValue)*0.008;
		megabitt=(edtValue)*0.0000610352;
		megabytee=(edtValue)*0.0000076294;
		megabytee2=(edtValue)*0.000008;
		gigabitt=(edtValue)*5.960464477E-8;
		gigabytee=(edtValue)*7.450580596E-9;
		gigabytee2=(edtValue)*8.E-9;
		terabitt=(edtValue)*5.820766091E-11;
		terabytee=(edtValue)*7.275957614E-12;
		terabytee2=(edtValue)*8.E-12;
		petabitt=(edtValue)*5.684341886E-14;
		petabytee=(edtValue)*7.105427357E-15;
		petabytee2=(edtValue)*8.E-15;
		exabitt=(edtValue)*5.551115123E-17;
		exabytee=(edtValue)*6.938893903E-18;
		exabytee2=(edtValue)*8.E-18;
		floppydiskk1=(edtValue)*0.0000109765;
		floppydiskk2=(edtValue)*0.0000054882;
		floppydiskk3=(edtValue)*0.0000027441;
		floppydiskk4=(edtValue)*0.0000219529;
		floppydiskk5=(edtValue)*0.00000659;
		zip1=(edtValue)*7.965598809E-8;
		zip2=(edtValue)*3.186239523E-8;
		jaz1=(edtValue)*7.450580596E-9;
		jaz2=(edtValue)*3.725290298E-9;
		cd1=(edtValue)*1.174642457E-8;
		cd2=(edtValue)*1.086544274E-8;
		dvd1=(edtValue)*1.585229914E-9;
		dvd2=(edtValue)*8.765388937E-10;
		dvd3=(edtValue)*7.926149571E-10;
		dvd4=(edtValue)*4.382694468E-10;


		 break;
	case "Block - blk":

		bitt=(edtValue)*4096;
		nibblee=(edtValue)*1024;
		bytee=(edtValue)*512;
		characterr=(edtValue)*512;
		wordd=(edtValue)*256;
		mapmwordd=(edtValue)*128;
		quadd=(edtValue)*64;
		blockk=(edtValue)*1;
		kilobitt=(edtValue)*4;
		kilobytee=(edtValue)*0.5;
		kilobytee2=(edtValue)*0.512;
		megabitt=(edtValue)*0.00390625;
		megabytee=(edtValue)*0.0004882812;
		megabytee2=(edtValue)*0.000512;
		gigabitt=(edtValue)*0.0000038147;
		gigabytee=(edtValue)*4.768371582E-7;
		gigabytee2=(edtValue)*5.12E-7;
		terabitt=(edtValue)*3.725290298E-9;
		terabytee=(edtValue)*4.656612873E-10;
		terabytee2=(edtValue)*5.12E-10;
		petabitt=(edtValue)*3.637978807E-12;
		petabytee=(edtValue)*4.547473508E-13;
		petabytee2=(edtValue)*5.12E-13;
		exabitt=(edtValue)*3.552713678E-15;
		exabytee=(edtValue)*4.440892098E-16;
		exabytee2=(edtValue)*5.12E-16;
		floppydiskk1=(edtValue)*0.0007024939;
		floppydiskk2=(edtValue)*0.0003512469;
		floppydiskk3=(edtValue)*0.0001756235;
		floppydiskk4=(edtValue)*0.0014049877;
		floppydiskk5=(edtValue)*0.000421763;
		zip1=(edtValue)*0.000005098;
		zip2=(edtValue)*0.0000020392;
		jaz1=(edtValue)*4.768371582E-7;
		jaz2=(edtValue)*2.384185791E-7;
		cd1=(edtValue)*7.517711728E-7;
		cd2=(edtValue)*6.953883354E-7;
		dvd1=(edtValue)*1.014547145E-7;
		dvd2=(edtValue)*5.60984892E-8;
		dvd3=(edtValue)*5.072735725E-8;
		dvd4=(edtValue)*2.80492446E-8;

		 break;
	case "Kilobit - kb":

		bitt=(edtValue)*1024;
		nibblee=(edtValue)*256;
		bytee=(edtValue)*128;
		characterr=(edtValue)*128;
		wordd=(edtValue)*64;
		mapmwordd=(edtValue)*32;
		quadd=(edtValue)*16;
		blockk=(edtValue)*0.25;
		kilobitt=(edtValue)*1;
		kilobytee=(edtValue)*0.125;
		kilobytee2=(edtValue)*0.128;
		megabitt=(edtValue)*0.0009765625;
		megabytee=(edtValue)*0.0001220703;
		megabytee2=(edtValue)*0.000128;
		gigabitt=(edtValue)*9.536743164E-7;
		gigabytee=(edtValue)*1.192092895E-7;
		gigabytee2=(edtValue)*1.28E-7;
		terabitt=(edtValue)*9.313225746E-10;
		terabytee=(edtValue)*1.164153218E-10;
		terabytee2=(edtValue)*1.28E-10;
		petabitt=(edtValue)*9.094947017E-13;
		petabytee=(edtValue)*1.136868377E-13;
		petabytee2=(edtValue)*1.28E-13;
		exabitt=(edtValue)*8.881784197E-16;
		exabytee=(edtValue)*1.110223024E-16;
		exabytee2=(edtValue)*1.28E-16;
		floppydiskk1=(edtValue)*0.0001756235;
		floppydiskk2=(edtValue)*0.0000878117;
		floppydiskk3=(edtValue)*0.0000439059;
		floppydiskk4=(edtValue)*0.0003512469;
		floppydiskk5=(edtValue)*0.0001054407;
		zip1=(edtValue)*0.0000012745;
		zip2=(edtValue)*5.097983237E-7;
		jaz1=(edtValue)*1.192092895E-7;
		jaz2=(edtValue)*5.960464477E-8;
		cd1=(edtValue)*1.879427932E-7;
		cd2=(edtValue)*1.738470838E-7;
		dvd1=(edtValue)*2.536367862E-8;
		dvd2=(edtValue)*1.40246223E-8;
		dvd3=(edtValue)*1.268183931E-8;
		dvd4=(edtValue)*7.01231115E-9;



		 break;
	case "Kilobyte - kB":

		bitt=(edtValue)*8192;
		nibblee=(edtValue)*2048;
		bytee=(edtValue)*1024;
		characterr=(edtValue)*1024;
		wordd=(edtValue)*512;
		mapmwordd=(edtValue)*256;
		quadd=(edtValue)*128;
		blockk=(edtValue)*2;
		kilobitt=(edtValue)*8;
		kilobytee=(edtValue)*1;
		kilobytee2=(edtValue)*1.024;
		megabitt=(edtValue)*0.0078125;
		megabytee=(edtValue)*0.0009765625;
		megabytee2=(edtValue)*0.001024;
		gigabitt=(edtValue)*0.0000076294;
		gigabytee=(edtValue)*9.536743164E-7;
		gigabytee2=(edtValue)*0.000001024;
		terabitt=(edtValue)*7.450580596E-9;
		terabytee=(edtValue)*9.313225746E-10;
		terabytee2=(edtValue)*1.024E-9;
		petabitt=(edtValue)*7.275957614E-12;
		petabytee=(edtValue)*9.094947017E-13;
		petabytee2=(edtValue)*1.024E-12;
		exabitt=(edtValue)*7.105427357E-15;
		exabytee=(edtValue)*8.881784197E-16;
		exabytee2=(edtValue)*1.024E-15;
		floppydiskk1=(edtValue)*0.0014049877;
		floppydiskk2=(edtValue)*0.0007024939;
		floppydiskk3=(edtValue)*0.0003512469;
		floppydiskk4=(edtValue)*0.0028099754;
		floppydiskk5=(edtValue)*0.0008435259;
		zip1=(edtValue)*0.000010196;
		zip2=(edtValue)*0.0000040784;
		jaz1=(edtValue)*9.536743164E-7;
		jaz2=(edtValue)*4.768371582E-7;
		cd1=(edtValue)*0.0000015035;
		cd2=(edtValue)*0.0000013908;
		dvd1=(edtValue)*2.02909429E-7;
		dvd2=(edtValue)*1.121969784E-7;
		dvd3=(edtValue)*1.014547145E-7;
		dvd4=(edtValue)*5.60984892E-8;


		 break;
	case "Kilobyte (10^3 bytes) - kB":

		bitt=(edtValue)*8000;
		nibblee=(edtValue)*2000;
		bytee=(edtValue)*1000;
		characterr=(edtValue)*1000;
		wordd=(edtValue)*500;
		mapmwordd=(edtValue)*250;
		quadd=(edtValue)*125;
		blockk=(edtValue)*1.953125;
		kilobitt=(edtValue)*7.8125;
		kilobytee=(edtValue)*0.9765625;
		kilobytee2=(edtValue)*1;
		megabitt=(edtValue)*0.0076293945;
		megabytee=(edtValue)*0.0009536743;
		megabytee2=(edtValue)*0.001;
		gigabitt=(edtValue)*0.0000074506;
		gigabytee=(edtValue)*9.313225746E-7;
		gigabytee2=(edtValue)*0.000001;
		terabitt=(edtValue)*7.275957614E-9;
		terabytee=(edtValue)*9.094947017E-10;
		terabytee2=(edtValue)*9.999999999E-10;
		petabitt=(edtValue)*7.105427357E-12;
		petabytee=(edtValue)*8.881784197E-13;
		petabytee2=(edtValue)*1.E-12;
		exabitt=(edtValue)*6.938893903E-15;
		exabytee=(edtValue)*8.673617379E-16;
		exabytee2=(edtValue)*9.999999999E-16;
		floppydiskk1=(edtValue)*0.0013720583;
		floppydiskk2=(edtValue)*0.0006860292;
		floppydiskk3=(edtValue)*0.0003430146;
		floppydiskk4=(edtValue)*0.0027441166;
		floppydiskk5=(edtValue)*0.0008237558;
		zip1=(edtValue)*0.000009957;
		zip2=(edtValue)*0.0000039828;
		jaz1=(edtValue)*9.313225746E-7;
		jaz2=(edtValue)*4.656612873E-7;
		cd1=(edtValue)*0.0000014683;
		cd2=(edtValue)*0.0000013582;
		dvd1=(edtValue)*1.981537392E-7;
		dvd2=(edtValue)*1.095673617E-7;
		dvd3=(edtValue)*9.907686963E-8;
		dvd4=(edtValue)*5.478368085E-8;



		 break;
	case "Megabit - Mb":

		bitt=(edtValue)*1048576;
		nibblee=(edtValue)*262144;
		bytee=(edtValue)*131072;
		characterr=(edtValue)*131072;
		wordd=(edtValue)*65536;
		mapmwordd=(edtValue)*32768;
		quadd=(edtValue)*16384;
		blockk=(edtValue)*256;
		kilobitt=(edtValue)*1024;
		kilobytee=(edtValue)*128;
		kilobytee2=(edtValue)*131.072;
		megabitt=(edtValue)*1;
		megabytee=(edtValue)*0.125;
		megabytee2=(edtValue)*0.131072;
		gigabitt=(edtValue)*0.0009765625;
		gigabytee=(edtValue)*0.0001220703;
		gigabytee2=(edtValue)*0.000131072;
		terabitt=(edtValue)*9.536743164E-7;
		terabytee=(edtValue)*1.192092895E-7;
		terabytee2=(edtValue)*1.31072E-7;
		petabitt=(edtValue)*9.313225746E-10;
		petabytee=(edtValue)*1.164153218E-10;
		petabytee2=(edtValue)*1.31072E-10;
		exabitt=(edtValue)*9.094947017E-13;
		exabytee=(edtValue)*1.136868377E-13;
		exabytee2=(edtValue)*1.31072E-13;
		floppydiskk1=(edtValue)*0.1798384264;
		floppydiskk2=(edtValue)*0.0899192132;
		floppydiskk3=(edtValue)*0.0449596066;
		floppydiskk4=(edtValue)*0.3596768528;
		floppydiskk5=(edtValue)*0.1079713201;
		zip1=(edtValue)*0.0013050837;
		zip2=(edtValue)*0.0005220335;
		jaz1=(edtValue)*0.0001220703;
		jaz2=(edtValue)*0.0000610352;
		cd1=(edtValue)*0.0001924534;
		cd2=(edtValue)*0.0001780194;
		dvd1=(edtValue)*0.0000259724;
		dvd2=(edtValue)*0.0000143612;
		dvd3=(edtValue)*0.0000129862;
		dvd4=(edtValue)*0.0000071806;

		 break;

case "Megabyte - MB":

	bitt=(edtValue)*8388608;
	nibblee=(edtValue)*2097152;
	bytee=(edtValue)*1048576;
	characterr=(edtValue)*1048576;
	wordd=(edtValue)*524288;
	mapmwordd=(edtValue)*262144;
	quadd=(edtValue)*131072;
	blockk=(edtValue)*2048;
	kilobitt=(edtValue)*8192;
	kilobytee=(edtValue)*1024;
	kilobytee2=(edtValue)*1048.576;
	megabitt=(edtValue)*8;
	megabytee=(edtValue)*1;
	megabytee2=(edtValue)*1.048576;
	gigabitt=(edtValue)*0.0078125;
	gigabytee=(edtValue)*0.0009765625;
	gigabytee2=(edtValue)*0.001048576;
	terabitt=(edtValue)*0.0000076294;
	terabytee=(edtValue)*9.536743164E-7;
	terabytee2=(edtValue)*0.0000010486;
	petabitt=(edtValue)*7.450580596E-9;
	petabytee=(edtValue)*9.313225746E-10;
	petabytee2=(edtValue)*1.048576E-9;
	exabitt=(edtValue)*7.275957614E-12;
	exabytee=(edtValue)*1.048576E-12;
	exabytee2=(edtValue)*9.094947017E-13;
	floppydiskk1=(edtValue)*1.4387074113;
	floppydiskk2=(edtValue)*0.7193537057;
	floppydiskk3=(edtValue)*0.3596768528;
	floppydiskk4=(edtValue)*2.8774148226;
	floppydiskk5=(edtValue)*0.8637705609;
	zip1=(edtValue)*0.0104406697;
	zip2=(edtValue)*0.0041762679;
	jaz1=(edtValue)*0.0009765625;
	jaz2=(edtValue)*0.0004882813;
	cd1=(edtValue)*0.0015396274;
	cd2=(edtValue)*0.0014241553;
	dvd1=(edtValue)*0.0002077793;
	dvd2=(edtValue)*0.0001148897;
	dvd3=(edtValue)*0.0001038896;
	dvd4=(edtValue)*0.0000574449;

		break;
	case "Megabyte (10^6 bytes) - MB":

		bitt=(edtValue)*8000000;
		nibblee=(edtValue)*2000000;
		bytee=(edtValue)*1000000;
		characterr=(edtValue)*1000000;
		wordd=(edtValue)*500000;
		mapmwordd=(edtValue)*250000;
		quadd=(edtValue)*125000;
		blockk=(edtValue)*1953.125;
		kilobitt=(edtValue)*7812.5;
		kilobytee=(edtValue)*976.5625;
		kilobytee2=(edtValue)*1000;
		megabitt=(edtValue)*7.6293945313;
		megabytee=(edtValue)*0.9536743164;
		megabytee2=(edtValue)*1;
		gigabitt=(edtValue)*0.0074505806;
		gigabytee=(edtValue)*0.0009313226;
		gigabytee2=(edtValue)*0.001;
		terabitt=(edtValue)*0.000007276;
		terabytee=(edtValue)*9.094947017E-7;
		terabytee2=(edtValue)*0.000001;
		petabitt=(edtValue)*7.105427357E-9;
		petabytee=(edtValue)*8.881784197E-10;
		petabytee2=(edtValue)*1.E-9;
		exabitt=(edtValue)*6.938893903E-12;
		exabytee=(edtValue)*8.673617379E-13;
		exabytee2=(edtValue)*1.E-12;
		floppydiskk1=(edtValue)*1.372058307;
		floppydiskk2=(edtValue)*0.6860291535;
		floppydiskk3=(edtValue)*0.3430145767;
		floppydiskk4=(edtValue)*2.744116614;
		floppydiskk5=(edtValue)*0.8237557992;
		zip1=(edtValue)*0.0099569985;
		zip2=(edtValue)*0.0039827994;
		jaz1=(edtValue)*0.0009313226;
		jaz2=(edtValue)*0.0004656613;
		cd1=(edtValue)*0.0014683031;
		cd2=(edtValue)*0.0013581803;
		dvd1=(edtValue)*0.0001981537;
		dvd2=(edtValue)*0.0001095674;
		dvd3=(edtValue)*0.0000990769;
		dvd4=(edtValue)*0.0000547837;

		 break;

	case "Gigabit - Gb":

		bitt=(edtValue)*1073741824;
		nibblee=(edtValue)*268435456;
		bytee=(edtValue)*134217728;
		characterr=(edtValue)*134217728;
		wordd=(edtValue)*67108864;
		mapmwordd=(edtValue)*33554432;
		quadd=(edtValue)*16777216;
		blockk=(edtValue)*262144;
		kilobitt=(edtValue)*1048576;
		kilobytee=(edtValue)*131072;
		kilobytee2=(edtValue)*134217.728;
		megabitt=(edtValue)*1024;
		megabytee=(edtValue)*128;
		megabytee2=(edtValue)*134.217728;
		gigabitt=(edtValue)*1;
		gigabytee=(edtValue)*0.125;
		gigabytee2=(edtValue)*0.134217728;
		terabitt=(edtValue)*0.0009765625;
		terabytee=(edtValue)*0.0001220703;
		terabytee2=(edtValue)*0.0001342177;
		petabitt=(edtValue)*9.536743164E-7;
		petabytee=(edtValue)*1.192092895E-7;
		petabytee2=(edtValue)*1.342177279E-7;
		exabitt=(edtValue)*9.313225746E-10;
		exabytee=(edtValue)*1.164153218E-10;
		exabytee2=(edtValue)*1.342177279E-10;
		floppydiskk1=(edtValue)*184.15454865;
		floppydiskk2=(edtValue)*92.077274324;
		floppydiskk3=(edtValue)*46.038637162;
		floppydiskk4=(edtValue)*368.3090973;
		floppydiskk5=(edtValue)*110.5626318;
		zip1=(edtValue)*1.3364057179;
		zip2=(edtValue)*0.5345622872;
		jaz1=(edtValue)*0.125;
		jaz2=(edtValue)*0.0625;
		cd1=(edtValue)*0.1970723023;
		cd2=(edtValue)*0.1822918798;
		dvd1=(edtValue)*0.0265957447;
		dvd2=(edtValue)*0.0147058824;
		dvd3=(edtValue)*0.0132978723;
		dvd4=(edtValue)*0.0073529412;

		 break;
	case "Gigabyte - GB":

		bitt=(edtValue)*8589934592.0;
		nibblee=(edtValue)*2147483648.0;
		bytee=(edtValue)*1073741824.0;
		characterr=(edtValue)*1073741824.0;
		wordd=(edtValue)*536870912.0;
		mapmwordd=(edtValue)*268435456.0;
		quadd=(edtValue)*134217728.000;
		blockk=(edtValue)*2097152.0;
		kilobitt=(edtValue)*8388608.0;
		kilobytee=(edtValue)*1048576.0;
		kilobytee2=(edtValue)*1073741.824;
		megabitt=(edtValue)*8192.000;
		megabytee=(edtValue)*1024.000;
		megabytee2=(edtValue)*1073.741824;
		gigabitt=(edtValue)*8.0;
		gigabytee=(edtValue)*1.0;
		gigabytee2=(edtValue)*1.073741824;
		terabitt=(edtValue)*0.0078125;
		terabytee=(edtValue)*0.0009765625;
		terabytee2=(edtValue)*0.0010737418;
		petabitt=(edtValue)*0.0000076294;
		petabytee=(edtValue)*9.536743164E-7;
		petabytee2=(edtValue)*0.0000010737;
		exabitt=(edtValue)*7.450580596E-9;
		exabytee=(edtValue)*9.313225746E-10;
		exabytee2=(edtValue)*1.073741824E-9;
		floppydiskk1=(edtValue)*1473.2363892;
		floppydiskk2=(edtValue)*736.61819459;
		floppydiskk3=(edtValue)*368.3090973;
		floppydiskk4=(edtValue)*2946.4727784;
		floppydiskk5=(edtValue)*884.50105441;
		zip1=(edtValue)*10.691245743;
		zip2=(edtValue)*4.2764982973;
		jaz1=(edtValue)*1;
		jaz2=(edtValue)*0.5;
		cd1=(edtValue)*1.5765784188;
		cd2=(edtValue)*1.4583350385;
		dvd1=(edtValue)*0.2127659574;
		dvd2=(edtValue)*0.1176470588;
		dvd3=(edtValue)*0.1063829787;
		dvd4=(edtValue)*0.0588235294;

		 break;
	case "Gigabyte (10^9 bytes) - GB":

		bitt=(edtValue)*8000000000.0;
		nibblee=(edtValue)*2000000000.0;
		bytee=(edtValue)*1000000000.0;
		characterr=(edtValue)*1000000000.0;
		wordd=(edtValue)*500000000.0;
		mapmwordd=(edtValue)*250000000.0;
		quadd=(edtValue)*125000000.0;
		blockk=(edtValue)*1953125.0;
		kilobitt=(edtValue)*7812500.0;
		kilobytee=(edtValue)*976562.5;
		kilobytee2=(edtValue)*1000000.0;
		megabitt=(edtValue)*7629.3945313;
		megabytee=(edtValue)*953.67431641;
		megabytee2=(edtValue)*1000;
		gigabitt=(edtValue)*7.4505805969;
		gigabytee=(edtValue)*0.9313225746;
		gigabytee2=(edtValue)*1;
		terabitt=(edtValue)*0.0009094947;
		terabytee=(edtValue)*0.0009094947;
		terabytee2=(edtValue)*0.001;
		petabitt=(edtValue)*0.0000071054;
		petabytee=(edtValue)*8.881784197E-7;
		petabytee2=(edtValue)*0.000001;
		exabitt=(edtValue)*6.938893903E-9;
		exabytee=(edtValue)*8.673617379E-10;
		exabytee2=(edtValue)*1.E-9;
		floppydiskk1=(edtValue)*1372.058307;
		floppydiskk2=(edtValue)*686.02915349;
		floppydiskk3=(edtValue)*343.01457675;
		floppydiskk4=(edtValue)*2744.116614;
		floppydiskk5=(edtValue)*823.75579924;
		zip1=(edtValue)*9.9569985114;
		zip2=(edtValue)*3.9827994046;
		jaz1=(edtValue)*0.9313225746;
		jaz2=(edtValue)*0.4656612873;
		cd1=(edtValue)*1.468303072;
		cd2=(edtValue)*1.3581803427;
		dvd1=(edtValue)*0.1981537393;
		dvd2=(edtValue)*0.1095673617;
		dvd3=(edtValue)*0.0990768696;
		dvd4=(edtValue)*0.0547836809;

		 break;
case "Terabit - Tb":

	bitt=(edtValue)*1099511628000.0;
	nibblee=(edtValue)*274877906900.0;
	bytee=(edtValue)*137438953500.0;
	characterr=(edtValue)*137438953500.0;
	wordd=(edtValue)*68719476740.0;
	mapmwordd=(edtValue)*34359738370.0;
	quadd=(edtValue)*17179869180.000;
	blockk=(edtValue)*268435456.000;
	kilobitt=(edtValue)*1073741824.000;
	kilobytee=(edtValue)*134217728.000;
	kilobytee2=(edtValue)*137438953.470;
	megabitt=(edtValue)*1048576.000;
	megabytee=(edtValue)*131072.000;
	megabytee2=(edtValue)*137438.95347;
	gigabitt=(edtValue)*1024;
	gigabytee=(edtValue)*128;
	gigabytee2=(edtValue)*137.439;
	terabitt=(edtValue)*1;
	terabytee=(edtValue)*0.125;
	terabytee2=(edtValue)*0.1374389535;
	petabitt=(edtValue)*0.0009765625;
	petabytee=(edtValue)*0.0001220703;
	petabytee2=(edtValue)*0.000137439;
	exabitt=(edtValue)*9.536743164E-7;
	exabytee=(edtValue)*1.192092895E-7;
	exabytee2=(edtValue)*1.374389534E-7;
	floppydiskk1=(edtValue)*188574.25782;
	floppydiskk2=(edtValue)*94287.128908;
	floppydiskk3=(edtValue)*47143.564454;
	floppydiskk4=(edtValue)*377148.51563;
	floppydiskk5=(edtValue)*113216.13496;
	zip1=(edtValue)*1368.4794551;
	zip2=(edtValue)*547.39178205;
	jaz1=(edtValue)*128;
	jaz2=(edtValue)*64;
	cd1=(edtValue)*201.8020376;
	cd2=(edtValue)*186.66688492;
	dvd1=(edtValue)*27.234042553;
	dvd2=(edtValue)*15.058823529;
	dvd3=(edtValue)*13.617021277;
	dvd4=(edtValue)*7.5294117647;

		 break;
case "Terabyte - TB":

	bitt=(edtValue)*8796093022000.0;
	nibblee=(edtValue)*2199023256000.0;
	bytee=(edtValue)*1099511628000.0;
	characterr=(edtValue)*1099511628000.0;
	wordd=(edtValue)*549755813900.0;
	mapmwordd=(edtValue)*274877906900.0;
	quadd=(edtValue)*137438953500.0;
	blockk=(edtValue)*2147483648.0;
	kilobitt=(edtValue)*8589934592.0;
	kilobytee=(edtValue)*1073741824.000;
	kilobytee2=(edtValue)*1099511627.800;
	megabitt=(edtValue)*8388608.000;
	megabytee=(edtValue)*1048576.000;
	megabytee2=(edtValue)*1099511.628;
	gigabitt=(edtValue)*8192;
	gigabytee=(edtValue)*1024;
	gigabytee2=(edtValue)*1099.5116278;
	terabitt=(edtValue)*8;
	terabytee=(edtValue)*1;
	terabytee2=(edtValue)*1.0995116278;
	petabitt=(edtValue)*0.0078125;
	petabytee=(edtValue)*0.0009765625;
	petabytee2=(edtValue)*0.0010995116;
	exabitt=(edtValue)*9.536743164E-7;
	exabytee=(edtValue)*0.0000010995;
	exabytee2=(edtValue)*1508594.0625;
	floppydiskk1=(edtValue)*1508594.062;
	floppydiskk2=(edtValue)*754297.03126;
	floppydiskk3=(edtValue)*377148.51563;
	floppydiskk4=(edtValue)*3017188.125;
	floppydiskk5=(edtValue)*905729.07971;
	zip1=(edtValue)*10947.835641;
	zip2=(edtValue)*4379.1342564;
	jaz1=(edtValue)*1024;
	jaz2=(edtValue)*512;
	cd1=(edtValue)*1614.4163008;
	cd2=(edtValue)*1493.3350794;
	dvd1=(edtValue)*217.87234043;
	dvd2=(edtValue)*120.47058824;
	dvd3=(edtValue)*108.93617021;
	dvd4=(edtValue)*60.235294118;

break;
case "Terabyte (10^12 bytes) - TB":

	bitt=(edtValue)*8000000000000.0;
	nibblee=(edtValue)*2000000000000.0;
	bytee=(edtValue)*1000000000000.0;
	characterr=(edtValue)*1000000000000.0;
	wordd=(edtValue)*500000000000.0;
	mapmwordd=(edtValue)*250000000000.0;
	quadd=(edtValue)*125000000000.0;
	blockk=(edtValue)*1953125000.0;
	kilobitt=(edtValue)*7812500000.0;
	kilobytee=(edtValue)*976562500.0;
	kilobytee2=(edtValue)*1000000000.0;
	megabitt=(edtValue)*7629394.5313;
	megabytee=(edtValue)*953674.31641;
	megabytee2=(edtValue)*1000000;
	gigabitt=(edtValue)*7450.5805969;
	gigabytee=(edtValue)*931.32257462;
	gigabytee2=(edtValue)*1000;
	terabitt=(edtValue)*7.2759576142;
	terabytee=(edtValue)*0.9094947018;
	terabytee2=(edtValue)*1;
	petabitt=(edtValue)*0.0071054274;
	petabytee=(edtValue)*0.0008881784;
	petabytee2=(edtValue)*0.001;
	exabitt=(edtValue)*0.0000069389;
	exabytee=(edtValue)*8.673617379E-7;
	exabytee2=(edtValue)*0.000001;
	floppydiskk1=(edtValue)*1372058.307;
	floppydiskk2=(edtValue)*686029.15349;
	floppydiskk3=(edtValue)*343014.57675;
	floppydiskk4=(edtValue)*2744116.614;
	floppydiskk5=(edtValue)*823755.79924;
	zip1=(edtValue)*9956.9985114;
	zip2=(edtValue)*3982.7994046;
	jaz1=(edtValue)*931.32257462;
	jaz2=(edtValue)*465.66128731;
	cd1=(edtValue)*1468.303072;
	cd2=(edtValue)*1358.1803427;
	dvd1=(edtValue)*198.15373928;
	dvd2=(edtValue)*109.56736172;
	dvd3=(edtValue)*99.07686964;
	dvd4=(edtValue)*54.78368086;

break;
						case "Petabit - Pb":


							bitt=(edtValue)*1125899906842631.0;
							nibblee=(edtValue)*281474976710658.0;
							bytee=(edtValue)*140737488355329.0;
							characterr=(edtValue)*140737488355329.0;
							wordd=(edtValue)*70368744177664.0;
							mapmwordd=(edtValue)*35184372088832.0;
							quadd=(edtValue)*17592186044416.0;
							blockk=(edtValue)*274877906944.0;
							kilobitt=(edtValue)*1099511627776.0;
							kilobytee=(edtValue)*137438953472.0;
							kilobytee2=(edtValue)*140737488355.0;
							megabitt=(edtValue)*1073741824;
							megabytee=(edtValue)*134217728;
							megabytee2=(edtValue)*140737488.36;
							gigabitt=(edtValue)*1048576;
							gigabytee=(edtValue)*131072;
							gigabytee2=(edtValue)*140737.48836;
							terabitt=(edtValue)*1024;
							terabytee=(edtValue)*128;
							terabytee2=(edtValue)*140.73748836;
							petabitt=(edtValue)*1;
							petabytee=(edtValue)*0.125;
							petabytee2=(edtValue)*0.1407374884;
							exabitt=(edtValue)*0.0009765625;
							exabytee=(edtValue)*0.0001220703;
							exabytee2=(edtValue)*0.0001407375;
							floppydiskk1=(edtValue)*193100040;
							floppydiskk2=(edtValue)*96550020.001;
							floppydiskk3=(edtValue)*48275010.001;
							floppydiskk4=(edtValue)*386200080.01;
							floppydiskk5=(edtValue)*115933322.2;
							zip1=(edtValue)*1401322.9621;
							zip2=(edtValue)*560529.18482;
							jaz1=(edtValue)*131072;
							jaz2=(edtValue)*65536;
							cd1=(edtValue)*206645.2865;
							cd2=(edtValue)*191146.89016;
							dvd1=(edtValue)*27887.659574;
							dvd2=(edtValue)*15420.235294;
							dvd3=(edtValue)*13943.829787;
							dvd4=(edtValue)*7710.1176471;


							break;
						case "Petabyte - PB":

							bitt=(edtValue)*9007199254740640.0;
							nibblee=(edtValue)*2251799813685160.0;
							bytee=(edtValue)*1125899906842580.0;
							characterr=(edtValue)*1125899906842580.0;
							wordd=(edtValue)*562949953421290.0;
							mapmwordd=(edtValue)*281474976710645.0;
							quadd=(edtValue)*140737488355322.0;
							blockk=(edtValue)*2199023255552.0;
							kilobitt=(edtValue)*8796093022208.0;
							kilobytee=(edtValue)*1099511627776.0;
							kilobytee2=(edtValue)*1125899906843.0;
							megabitt=(edtValue)*8589934592.0;
							megabytee=(edtValue)*1073741824;
							megabytee2=(edtValue)*1125899906.8;
							gigabitt=(edtValue)*8388608;
							gigabytee=(edtValue)*1048576;
							gigabytee2=(edtValue)*1125899.9068;
							terabitt=(edtValue)*8192;
							terabytee=(edtValue)*1024;
							terabytee2=(edtValue)*1125.8999068;
							petabitt=(edtValue)*8;
							petabytee=(edtValue)*1;
							petabytee2=(edtValue)*1.1258999068;
							exabitt=(edtValue)*0.0078125;
							exabytee=(edtValue)*0.0009765625;
							exabytee2=(edtValue)*0.0011258999;
							floppydiskk1=(edtValue)*1544800320;
							floppydiskk2=(edtValue)*772400160.01;
							floppydiskk3=(edtValue)*386200080.01;
							floppydiskk4=(edtValue)*3089600640.0;
							floppydiskk5=(edtValue)*927466577.63;
							zip1=(edtValue)*11210583.696;
							zip2=(edtValue)*4484233.4786;
							jaz1=(edtValue)*1048576;
							jaz2=(edtValue)*524288;
							cd1=(edtValue)*1653162.292;
							cd2=(edtValue)*1529175.1213;
							dvd1=(edtValue)*223101.2766;
							dvd2=(edtValue)*123361.88235;
							dvd3=(edtValue)*111550.6383;
							dvd4=(edtValue)*61680.941176;

							break;
						case "Petabyte (10^15 bytes) - PB":

							bitt=(edtValue)*8000000000000000.0;
							nibblee=(edtValue)*2000000000000000.0;
							bytee=(edtValue)*1000000000000000.0;
							characterr=(edtValue)*1000000000000000.0;
							wordd=(edtValue)*500000000000000.0;
							mapmwordd=(edtValue)*250000000000000.0;
							quadd=(edtValue)*125000000000000.0;
							blockk=(edtValue)*1953125000000.0;
							kilobitt=(edtValue)*7812500000000.0;
							kilobytee=(edtValue)*976562500000.0;
							kilobytee2=(edtValue)*1000000000000.0;
							megabitt=(edtValue)*7629394531.3;
							megabytee=(edtValue)*953674316.41;
							megabytee2=(edtValue)*1000000000;
							gigabitt=(edtValue)*7450580.5969;
							gigabytee=(edtValue)*931322.57462;
							gigabytee2=(edtValue)*1000000;
							terabitt=(edtValue)*7275.9576142;
							terabytee=(edtValue)*909.49470177;
							terabytee2=(edtValue)*1000;
							petabitt=(edtValue)*7.1054273576;
							petabytee=(edtValue)*0.8881784197;
							petabytee2=(edtValue)*1;
							exabitt=(edtValue)*0.0069388939;
							exabytee=(edtValue)*0.0008673617;
							exabytee2=(edtValue)*0.001;
							floppydiskk1=(edtValue)*1372058307;
							floppydiskk2=(edtValue)*686029153.49;
							floppydiskk3=(edtValue)*343014576.75;
							floppydiskk4=(edtValue)*2744116614.0;
							floppydiskk5=(edtValue)*823755799.24;
							zip1=(edtValue)*9956998.5114;
							zip2=(edtValue)*3982799.4046;
							jaz1=(edtValue)*931322.57462;
							jaz2=(edtValue)*465661.28731;
							cd1=(edtValue)*1468303.072;
							cd2=(edtValue)*1358180.3427;
							dvd1=(edtValue)*198153.73928;
							dvd2=(edtValue)*109567.36172;
							dvd3=(edtValue)*99076.86964;
							dvd4=(edtValue)*54783.68086;


							break;
						case "Exabit - Eb":

							bitt=(edtValue)*1152921504606851600.0;
							nibblee=(edtValue)*288230376151712900.0;
							bytee=(edtValue)*144115188075856450.0;
							characterr=(edtValue)*144115188075856450.0;
							wordd=(edtValue)*72057594037928220.0;
							mapmwordd=(edtValue)*36028797018964110.0;
							quadd=(edtValue)*18014398509482056.0;
							blockk=(edtValue)*281474976710657.0;
							kilobitt=(edtValue)*1125899906842629.0;
							kilobytee=(edtValue)*140737488355329.0;
							kilobytee2=(edtValue)*144115188075856.0;
							megabitt=(edtValue)*1099511627776.0;
							megabytee=(edtValue)*137438953472.0;
							megabytee2=(edtValue)*144115188076.0;
							gigabitt=(edtValue)*1073741824;
							gigabytee=(edtValue)*134217728;
							gigabytee2=(edtValue)*144115188.08;
							terabitt=(edtValue)*1048576;
							terabytee=(edtValue)*131072;
							terabytee2=(edtValue)*144115.18808;
							petabitt=(edtValue)*1024;
							petabytee=(edtValue)*128;
							petabytee2=(edtValue)*144.11518808;
							exabitt=(edtValue)*1;
							exabytee=(edtValue)*0.125;
							exabytee2=(edtValue)*0.1441151881;
							floppydiskk1=(edtValue)*197734440963.0;
							floppydiskk2=(edtValue)*98867220481.0;
							floppydiskk3=(edtValue)*49433610241.0;
							floppydiskk4=(edtValue)*395468881926.0;
							floppydiskk5=(edtValue)*118715721936.0;
							zip1=(edtValue)*1434954713.1;
							zip2=(edtValue)*573981885.26;
							jaz1=(edtValue)*134217728;
							jaz2=(edtValue)*67108864;
							cd1=(edtValue)*211604773.38;
							cd2=(edtValue)*195734415.53;
							dvd1=(edtValue)*28556963.404;
							dvd2=(edtValue)*15790320.941;
							dvd3=(edtValue)*14278481.702;
							dvd4=(edtValue)*7895160.4706;



							break;
						case "Exabyte - EB":

							bitt=(edtValue)*9223372036854813000.0;
							nibblee=(edtValue)*2305843009213703000.0;
							bytee=(edtValue)*1152921504606851600.0;
							characterr=(edtValue)*1152921504606851600.0;
							wordd=(edtValue)*576460752303425800.0;
							mapmwordd=(edtValue)*288230376151712900.0;
							quadd=(edtValue)*144115188075856450.0;
							blockk=(edtValue)*2251799813685257.0;
							kilobitt=(edtValue)*9007199254741028.0;
							kilobytee=(edtValue)*1125899906842629.0;
							kilobytee2=(edtValue)*1152921504606852.0;
							megabitt=(edtValue)*8796093022208.0;
							megabytee=(edtValue)*1099511627776.0;
							megabytee2=(edtValue)*1152921504607.0;
							gigabitt=(edtValue)*8589934592.0;
							gigabytee=(edtValue)*1073741824;
							gigabytee2=(edtValue)*1152921504.6;
							terabitt=(edtValue)*8388608;
							terabytee=(edtValue)*1048576;
							terabytee2=(edtValue)*1152921.5046;
							petabitt=(edtValue)*8192;
							petabytee=(edtValue)*1024;
							petabytee2=(edtValue)*1152.9215046;
							exabitt=(edtValue)*8;
							exabytee=(edtValue)*1;
							exabytee2=(edtValue)*1.1529215046;
							floppydiskk1=(edtValue)*1581875527703.0;
							floppydiskk2=(edtValue)*790937763852.0;
							floppydiskk3=(edtValue)*395468881926.0;
							floppydiskk4=(edtValue)*3163751055406.0;
							floppydiskk5=(edtValue)*949725775489.0;
							zip1=(edtValue)*11479637705.0;
							zip2=(edtValue)*4591855082.0;
							jaz1=(edtValue)*1073741824;
							jaz2=(edtValue)*536870912;
							cd1=(edtValue)*1692838187;
							cd2=(edtValue)*1565875324.2;
							dvd1=(edtValue)*228455707.23;
							dvd2=(edtValue)*126322567.53;
							dvd3=(edtValue)*114227853.62;
							dvd4=(edtValue)*63161283.765;


							break;
						case "Exabyte (10^18 bytes) - EB":

							bitt=(edtValue)*8000000000000000000.0;
							nibblee=(edtValue)*2000000000000000000.0;
							bytee=(edtValue)*1000000000000000000.0;
							characterr=(edtValue)*1000000000000000000.0;
							wordd=(edtValue)*500000000000000000.0;
							mapmwordd=(edtValue)*250000000000000000.0;
							quadd=(edtValue)*125000000000000000.0;
							blockk=(edtValue)*1953125000000000.0;
							kilobitt=(edtValue)*7812500000000000.0;
							kilobytee=(edtValue)*976562500000000.0;
							kilobytee2=(edtValue)*1000000000000000.0;
							megabitt=(edtValue)*7629394531250.0;
							megabytee=(edtValue)*953674316406.0;
							megabytee2=(edtValue)*1000000000000.0;
							gigabitt=(edtValue)*7450580596.9;
							gigabytee=(edtValue)*931322574.62;
							gigabytee2=(edtValue)*1000000000;
							terabitt=(edtValue)*7275957.6142;
							terabytee=(edtValue)*909494.70177;
							terabytee2=(edtValue)*1000000;
							petabitt=(edtValue)*7105.4273576;
							petabytee=(edtValue)*888.1784197;
							petabytee2=(edtValue)*1000;
							exabitt=(edtValue)*6.9388939039;
							exabytee=(edtValue)*0.867361738;
							exabytee2=(edtValue)*1;
							floppydiskk1=(edtValue)*1372058306990.0;
							floppydiskk2=(edtValue)*686029153495.0;
							floppydiskk3=(edtValue)*343014576747.0;
							floppydiskk4=(edtValue)*2744116613980.0;
							floppydiskk5=(edtValue)*823755799241.0;
							zip1=(edtValue)*9956998511.4;
							zip2=(edtValue)*3982799404.6;
							jaz1=(edtValue)*931322574.62;
							jaz2=(edtValue)*465661287.31;
							cd1=(edtValue)*1468303072;
							cd2=(edtValue)*1358180342.7;
							dvd1=(edtValue)*198153739.28;
							dvd2=(edtValue)*109567361.72;
							dvd3=(edtValue)*99076869.64;
							dvd4=(edtValue)*54783680.86;


							break;
						case "Floppy disk (3.5″, DD) - floppy":

							bitt=(edtValue)*5830656;
							nibblee=(edtValue)*1457664;
							bytee=(edtValue)*728832;
							characterr=(edtValue)*728832;
							wordd=(edtValue)*364416;
							mapmwordd=(edtValue)*182208;
							quadd=(edtValue)*91104;
							blockk=(edtValue)*1423.5;
							kilobitt=(edtValue)*5694;
							kilobytee=(edtValue)*711.75;
							kilobytee2=(edtValue)*728.832;
							megabitt=(edtValue)*5.560546875;
							megabytee=(edtValue)*0.6950683594;
							megabytee2=(edtValue)*0.6950683594;
							gigabitt=(edtValue)*0.6950683594;
							gigabytee=(edtValue)*0.0006787777;
							gigabytee2=(edtValue)*0.000728832;
							terabitt=(edtValue)*0.000005303;
							terabytee=(edtValue)*6.628688424E-7;
							terabytee2=(edtValue)*7.288319999E-7;
							petabitt=(edtValue)*5.178662831E-9;
							petabytee=(edtValue)*6.473328539E-10;
							petabytee2=(edtValue)*7.288319999E-10;
							exabitt=(edtValue)*5.057287921E-12;
							exabytee=(edtValue)*6.321609902E-13;
							exabytee2=(edtValue)*7.288319999E-13;
							floppydiskk1=(edtValue)*1;
							floppydiskk2=(edtValue)*0.5;
							floppydiskk3=(edtValue)*0.25;
							floppydiskk4=(edtValue)*2;
							floppydiskk5=(edtValue)*0.6003795867;
							zip1=(edtValue)*0.0072569791;
							zip2=(edtValue)*0.0029027917;
							jaz1=(edtValue)*0.0006787777;
							jaz2=(edtValue)*0.0003393888;
							cd1=(edtValue)*0.0010701463;
							cd2=(edtValue)*0.0009898853;
							dvd1=(edtValue)*0.0001444208;
							dvd2=(edtValue)*0.0000798562;
							dvd3=(edtValue)*0.0000722104;
							dvd4=(edtValue)*0.0000399281;


							break;
						case "Floppy disk (3.5″, HD) - floppy":

							bitt=(edtValue)*11661312;
							nibblee=(edtValue)*2915328;
							bytee=(edtValue)*1457664;
							characterr=(edtValue)*1457664;
							wordd=(edtValue)*728832;
							mapmwordd=(edtValue)*364416;
							quadd=(edtValue)*182208;
							blockk=(edtValue)*2847;
							kilobitt=(edtValue)*11388;
							kilobytee=(edtValue)*1423.5;
							kilobytee2=(edtValue)*1457.664;
							megabitt=(edtValue)*11.12109375;
							megabytee=(edtValue)*1.3901367187;
							megabytee2=(edtValue)*1.457664;
							gigabitt=(edtValue)*0.0108604431;
							gigabytee=(edtValue)*0.0013575554;
							gigabytee2=(edtValue)*0.001457664;
							terabitt=(edtValue)*0.0000106059;
							terabytee=(edtValue)*0.0000013257;
							terabytee2=(edtValue)*0.0000014577;
							petabitt=(edtValue)*1.035732566E-8;
							petabytee=(edtValue)*1.294665707E-9;
							petabytee2=(edtValue)*1.457664E-9;
							exabitt=(edtValue)*1.011457584E-11;
							exabytee=(edtValue)*1.26432198E-12;
							exabytee2=(edtValue)*1.457664E-12;
							floppydiskk1=(edtValue)*2;
							floppydiskk2=(edtValue)*1;
							floppydiskk3=(edtValue)*0.5;
							floppydiskk4=(edtValue)*4;
							floppydiskk5=(edtValue)*1.2007591733;
							zip1=(edtValue)*0.0145139583;
							zip2=(edtValue)*0.0058055833;
							jaz1=(edtValue)*0.0013575554;
							jaz2=(edtValue)*0.0006787777;
							cd1=(edtValue)*0.0021402925;
							cd2=(edtValue)*0.0019797706;
							dvd1=(edtValue)*0.0002888416;
							dvd2=(edtValue)*0.0001597124;
							dvd3=(edtValue)*0.0001444208;
							dvd4=(edtValue)*0.0000798562;

							break;

						case "Floppy disk (3.5″, ED) - floppy":

							bitt=(edtValue)*23322624;
							nibblee=(edtValue)*5830656;
							bytee=(edtValue)*2915328;
							characterr=(edtValue)*2915328;
							wordd=(edtValue)*1457664;
							mapmwordd=(edtValue)*728832;
							quadd=(edtValue)*364416;
							blockk=(edtValue)*5694;
							kilobitt=(edtValue)*22776;
							kilobytee=(edtValue)*2847;
							kilobytee2=(edtValue)*2915.328;
							megabitt=(edtValue)*22.2421875;
							megabytee=(edtValue)*2.7802734375;
							megabytee2=(edtValue)*2.915328;
							gigabitt=(edtValue)*0.0217208862;
							gigabytee=(edtValue)*0.0027151108;
							gigabytee2=(edtValue)*0.002915328;
							terabitt=(edtValue)*0.0000212118;
							terabytee=(edtValue)*0.0000026515;
							terabytee2=(edtValue)*0.0000029153;
							petabitt=(edtValue)*2.071465132E-8;
							petabytee=(edtValue)*2.589331415E-9;
							petabytee2=(edtValue)*2.915327999E-9;
							exabitt=(edtValue)*2.022915168E-11;
							exabytee=(edtValue)*2.52864396E-12;
							exabytee2=(edtValue)*2.915327999E-12;
							floppydiskk1=(edtValue)*4;
							floppydiskk2=(edtValue)*2;
							floppydiskk3=(edtValue)*1;
							floppydiskk4=(edtValue)*8;
							floppydiskk5=(edtValue)*2.4015183467;
							zip1=(edtValue)*0.0290279166;
							zip2=(edtValue)*0.0116111666;
							jaz1=(edtValue)*0.0027151108;
							jaz2=(edtValue)*0.0013575554;
							cd1=(edtValue)*0.0042805851;
							cd2=(edtValue)*0.0039595412;
							dvd1=(edtValue)*0.0005776831;
							dvd2=(edtValue)*0.0003194248;
							dvd3=(edtValue)*0.0002888416;
							dvd4=(edtValue)*0.0001597124;


							break;

						case "Floppy disk (5.25″, DD) - floppy":

							bitt=(edtValue)*2915328;
							nibblee=(edtValue)*728832;
							bytee=(edtValue)*364416;
							characterr=(edtValue)*364416;
							wordd=(edtValue)*182208;
							mapmwordd=(edtValue)*91104;
							quadd=(edtValue)*45552;
							blockk=(edtValue)*711.75;
							kilobitt=(edtValue)*2847;
							kilobytee=(edtValue)*355.875;
							kilobytee2=(edtValue)*364.416;
							megabitt=(edtValue)*2.7802734375;
							megabytee=(edtValue)*0.3475341797;
							megabytee2=(edtValue)*0.364416;
							gigabitt=(edtValue)*0.0027151108;
							gigabytee=(edtValue)*0.0003393888;
							gigabytee2=(edtValue)*0.000364416;
							terabitt=(edtValue)*0.0000026515;
							terabytee=(edtValue)*3.314344212E-7;
							terabytee2=(edtValue)*3.64416E-7;
							petabitt=(edtValue)*2.589331415E-9;
							petabytee=(edtValue)*3.236664269E-10;
							petabytee2=(edtValue)*3.64416E-10;
							exabitt=(edtValue)*2.52864396E-12;
							exabytee=(edtValue)*3.160804951E-13;
							exabytee2=(edtValue)*3.64416E-13;
							floppydiskk1=(edtValue)*0.5;
							floppydiskk2=(edtValue)*0.25;
							floppydiskk3=(edtValue)*0.125;
							floppydiskk4=(edtValue)*1;
							floppydiskk5=(edtValue)*0.3001897933;
							zip1=(edtValue)*0.0036284896;
							zip2=(edtValue)*0.0014513958;
							jaz1=(edtValue)*0.0003393888;
							jaz2=(edtValue)*0.0001696944;
							cd1=(edtValue)*0.0005350731;
							cd2=(edtValue)*0.0004949426;
							dvd1=(edtValue)*0.0000722104;
							dvd2=(edtValue)*0.0000399281;
							dvd3=(edtValue)*0.0000361052;
							dvd4=(edtValue)*0.000019964;



							break;
						case "Floppy disk (5.25″, HD) - floppy":

							bitt=(edtValue)*9711616;
							nibblee=(edtValue)*2427904;
							bytee=(edtValue)*1213952;
							characterr=(edtValue)*1213952;
							wordd=(edtValue)*606976;
							mapmwordd=(edtValue)*303488;
							quadd=(edtValue)*151744;
							blockk=(edtValue)*2371;
							kilobitt=(edtValue)*9484;
							kilobytee=(edtValue)*1185.5;
							kilobytee2=(edtValue)*1213.952;
							megabitt=(edtValue)*9.26171875;
							megabytee=(edtValue)*1.1577148438;
							megabytee2=(edtValue)*1.213952;
							gigabitt=(edtValue)*0.0090446472;
							gigabytee=(edtValue)*0.0011305809;
							gigabytee2=(edtValue)*0.001213952;
							terabitt=(edtValue)*0.0000088327;
							terabytee=(edtValue)*0.0000011041;
							terabytee2=(edtValue)*0.000001214;
							petabitt=(edtValue)*8.625647751E-9;
							petabytee=(edtValue)*1.078205968E-9;
							petabytee2=(edtValue)*1.213952E-9;
							exabitt=(edtValue)*8.423484132E-12;
							exabytee=(edtValue)*1.052935516E-12;
							exabytee2=(edtValue)*1.213952E-12;
							floppydiskk1=(edtValue)*1.6656129259;
							floppydiskk2=(edtValue)*0.8328064629;
							floppydiskk3=(edtValue)*0.4164032315;
							floppydiskk4=(edtValue)*3.3312258518;
							floppydiskk5=(edtValue)*1;
							zip1=(edtValue)*0.0120873183;
							zip2=(edtValue)*0.0048349273;
							jaz1=(edtValue)*0.0011305809;
							jaz2=(edtValue)*0.0005652905;
							cd1=(edtValue)*0.0017824495;
							cd2=(edtValue)*0.0016487657;
							dvd1=(edtValue)*0.0002405491;
							dvd2=(edtValue)*0.0001330095;
							dvd3=(edtValue)*0.0001202746;
							dvd4=(edtValue)*0.0000665048;


							break;
						case "Zip 100 - Zip":

							bitt=(edtValue)*803454976;
							nibblee=(edtValue)*200863744;
							bytee=(edtValue)*100431872;
							characterr=(edtValue)*100431872;
							wordd=(edtValue)*50215936;
							mapmwordd=(edtValue)*25107968;
							quadd=(edtValue)*12553984;
							blockk=(edtValue)*196156;
							kilobitt=(edtValue)*784624;
							kilobytee=(edtValue)*98078;
							kilobytee2=(edtValue)*100431.872;
							megabitt=(edtValue)*766.234375;
							megabytee=(edtValue)*95.779296875;
							megabytee2=(edtValue)*100.431872;
							gigabitt=(edtValue)*0.7482757568;
							gigabytee=(edtValue)*0.0935344696;
							gigabytee2=(edtValue)*0.100431872;
							terabitt=(edtValue)*0.000730738;
							terabytee=(edtValue)*0.0000913423;
							terabytee2=(edtValue)*0.0001004319;
							petabitt=(edtValue)*7.136113708E-7;
							petabytee=(edtValue)*8.920142136E-8;
							petabytee2=(edtValue)*1.00431872E-7;
							exabitt=(edtValue)*6.968861043E-10;
							exabytee=(edtValue)*8.711076304E-11;
							exabytee2=(edtValue)*1.00431872E-10;
							floppydiskk1=(edtValue)*137.79838426;
							floppydiskk2=(edtValue)*68.899192132;
							floppydiskk3=(edtValue)*34.449596066;
							floppydiskk4=(edtValue)*275.59676853;
							floppydiskk5=(edtValue)*82.731336989;
							zip1=(edtValue)*1;
							zip2=(edtValue)*0.4;
							jaz1=(edtValue)*0.0935344696;
							jaz2=(edtValue)*0.0467672348;
							cd1=(edtValue)*0.1474644262;
							cd2=(edtValue)*0.1364045943;
							dvd1=(edtValue)*0.019900951;
							dvd2=(edtValue)*0.0110040552;
							dvd3=(edtValue)*0.0099504755;
							dvd4=(edtValue)*0.0055020276;



							break;
						case "Zip 250 - Zip":

							bitt=(edtValue)*2008637440;
							nibblee=(edtValue)*502159360;
							bytee=(edtValue)*251079680;
							characterr=(edtValue)*251079680;
							wordd=(edtValue)*125539840;
							mapmwordd=(edtValue)*62769920;
							quadd=(edtValue)*31384960;
							blockk=(edtValue)*490390;
							kilobitt=(edtValue)*1961560;
							kilobytee=(edtValue)*245195;
							kilobytee2=(edtValue)*251079.68;
							megabitt=(edtValue)*1915.5859375;
							megabytee=(edtValue)*239.44824219;
							megabytee2=(edtValue)*251.07968;
							gigabitt=(edtValue)*1.8706893921;
							gigabytee=(edtValue)*0.233836174;
							gigabytee2=(edtValue)*0.25107968;
							terabitt=(edtValue)*0.0018268451;
							terabytee=(edtValue)*0.0002283556;
							terabytee2=(edtValue)*0.0002510797;
							petabitt=(edtValue)*0.000001784;
							petabytee=(edtValue)*2.230035534E-7;
							petabytee2=(edtValue)*2.5107968E-7;
							exabitt=(edtValue)*1.74221526E-9;
							exabytee=(edtValue)*2.177769076E-10;
							exabytee2=(edtValue)*2.5107968E-10;
							floppydiskk1=(edtValue)*344.49596066;
							floppydiskk2=(edtValue)*172.24798033;
							floppydiskk3=(edtValue)*86.123990165;
							floppydiskk4=(edtValue)*688.99192132;
							floppydiskk5=(edtValue)*206.82834247;
							zip1=(edtValue)*2.5;
							zip2=(edtValue)*1;
							jaz1=(edtValue)*0.233836174;
							jaz2=(edtValue)*0.116918087;
							cd1=(edtValue)*0.3686610655;
							cd2=(edtValue)*0.3410114858;
							dvd1=(edtValue)*0.0497523774;
							dvd2=(edtValue)*0.0275101381;
							dvd3=(edtValue)*0.0248761887;
							dvd4=(edtValue)*0.0137550691;

							break;

						case "Jaz 1GB - Jaz":

							bitt=(edtValue)*0.0137550691;
							nibblee=(edtValue)*2147483648.0;
							bytee=(edtValue)*1073741824;
							characterr=(edtValue)*1073741824;
							wordd=(edtValue)*536870912;
							mapmwordd=(edtValue)*268435456;
							quadd=(edtValue)*134217728;
							blockk=(edtValue)*2097152;
							kilobitt=(edtValue)*8388608;
							kilobytee=(edtValue)*1048576;
							kilobytee2=(edtValue)*1073741.824;
							megabitt=(edtValue)*8192;
							megabytee=(edtValue)*1024;
							megabytee2=(edtValue)*1073.741824;
							gigabitt=(edtValue)*8;
							gigabytee=(edtValue)*1;
							gigabytee2=(edtValue)*1.073741824;
							terabitt=(edtValue)*0.0078125;
							terabytee=(edtValue)*0.0009765625;
							terabytee2=(edtValue)*0.0010737418;
							petabitt=(edtValue)*0.0000076294;
							petabytee=(edtValue)*9.536743164E-7;
							petabytee2=(edtValue)*0.0000010737;
							exabitt=(edtValue)*7.450580596E-9;
							exabytee=(edtValue)*9.313225746E-10;
							exabytee2=(edtValue)*1.073741824E-9;
							floppydiskk1=(edtValue)*1473.2363892;
							floppydiskk2=(edtValue)*736.61819459;
							floppydiskk3=(edtValue)*368.3090973;
							floppydiskk4=(edtValue)*2946.4727784;
							floppydiskk5=(edtValue)*884.50105441;
							zip1=(edtValue)*10.691245743;
							zip2=(edtValue)*4.2764982973;
							jaz1=(edtValue)*1;
							jaz2=(edtValue)*0.5;
							cd1=(edtValue)*1.5765784188;
							cd2=(edtValue)*1.4583350385;
							dvd1=(edtValue)*0.2127659574;
							dvd2=(edtValue)*0.1176470588;
							dvd3=(edtValue)*0.1063829787;
							dvd4=(edtValue)*0.0588235294;

							break;
						case "Jaz 2GB - Jaz":

							bitt=(edtValue)*17179869184.0;
							nibblee=(edtValue)*4294967296.0;
							bytee=(edtValue)*2147483648.0;
							characterr=(edtValue)*2147483648.0;
							wordd=(edtValue)*1073741824;
							mapmwordd=(edtValue)*536870912;
							quadd=(edtValue)*268435456;
							blockk=(edtValue)*4194304;
							kilobitt=(edtValue)*16777216;
							kilobytee=(edtValue)*2097152;
							kilobytee2=(edtValue)*2147483.648;
							megabitt=(edtValue)*16384;
							megabytee=(edtValue)*2048;
							megabytee2=(edtValue)*2147.483648;
							gigabitt=(edtValue)*16;
							gigabytee=(edtValue)*2;
							gigabytee2=(edtValue)*2.147483648;
							terabitt=(edtValue)*0.015625;
							terabytee=(edtValue)*0.001953125;
							terabytee2=(edtValue)*0.0021474836;
							petabitt=(edtValue)*0.0000152588;
							petabytee=(edtValue)*0.0000019073;
							petabytee2=(edtValue)*0.0000019073;
							exabitt=(edtValue)*1.490116119E-8;
							exabytee=(edtValue)*1.862645149E-9;
							exabytee2=(edtValue)*2.147483648E-9;
							floppydiskk1=(edtValue)*2946.4727784;
							floppydiskk2=(edtValue)*1473.2363892;
							floppydiskk3=(edtValue)*736.61819459;
							floppydiskk4=(edtValue)*5892.9455567;
							floppydiskk5=(edtValue)*1769.0021088;
							zip1=(edtValue)*21.382491486;
							zip2=(edtValue)*8.5529965945;
							jaz1=(edtValue)*2;
							jaz2=(edtValue)*1;
							cd1=(edtValue)*3.1531568375;
							cd2=(edtValue)*2.9166700769;
							dvd1=(edtValue)*0.4255319149;
							dvd2=(edtValue)*0.2352941176;
							dvd3=(edtValue)*0.2127659574;
							dvd4=(edtValue)*0.1176470588;

							break;

						case "CD (74 minute) - CD":

							bitt=(edtValue)*5448466432.0;
							nibblee=(edtValue)*1362116608;
							bytee=(edtValue)*681058304;
							characterr=(edtValue)*681058304;
							wordd=(edtValue)*340529152;
							mapmwordd=(edtValue)*170264576;
							quadd=(edtValue)*85132288;
							blockk=(edtValue)*1330192;
							kilobitt=(edtValue)*5320768;
							kilobytee=(edtValue)*665096;
							kilobytee2=(edtValue)*681058.304;
							megabitt=(edtValue)*5196.0625;
							megabytee=(edtValue)*649.5078125;
							megabytee2=(edtValue)*681.058304;
							gigabitt=(edtValue)*5.0742797852;
							gigabytee=(edtValue)*0.6342849731;
							gigabytee2=(edtValue)*0.681058304;
							terabitt=(edtValue)*0.0049553514;
							terabytee=(edtValue)*0.0006194189;
							terabytee2=(edtValue)*0.0006810583;
							petabitt=(edtValue)*0.0000048392;
							petabytee=(edtValue)*6.049012881E-7;
							petabytee2=(edtValue)*6.810583039E-7;
							exabitt=(edtValue)*4.725791313E-9;
							exabytee=(edtValue)*5.907239142E-10;
							exabytee2=(edtValue)*6.810583039E-10;
							floppydiskk1=(edtValue)*934.45170355;
							floppydiskk2=(edtValue)*467.22585177;
							floppydiskk3=(edtValue)*233.61292589;
							floppydiskk4=(edtValue)*1868.9034071;
							floppydiskk5=(edtValue)*561.02572754;
							zip1=(edtValue)*6.7812965191;
							zip2=(edtValue)*2.7125186076;
							jaz1=(edtValue)*0.6342849731;
							jaz2=(edtValue)*0.3171424866;
							cd1=(edtValue)*1;
							cd2=(edtValue)*0.9250000007;
							dvd1=(edtValue)*0.1349542496;
							dvd2=(edtValue)*0.0746217615;
							dvd3=(edtValue)*0.0674771248;
							dvd4=(edtValue)*0.0373108808;

							break;
						case "CD (80 minute) - CD":

							bitt=(edtValue)*5890233976.0;
							nibblee=(edtValue)*1472558494;
							bytee=(edtValue)*736279247;
							characterr=(edtValue)*736279247;
							wordd=(edtValue)*368139623.5;
							mapmwordd=(edtValue)*184069811.75;
							quadd=(edtValue)*92034905.875;
							blockk=(edtValue)*1438045.4043;
							kilobitt=(edtValue)*5752181.6172;
							kilobytee=(edtValue)*719022.70215;
							kilobytee2=(edtValue)*736279.247;
							megabitt=(edtValue)*5617.3648605;
							megabytee=(edtValue)*702.17060757;
							megabytee2=(edtValue)*736.279247;
							gigabitt=(edtValue)*5.4857078716;
							gigabytee=(edtValue)*0.685713484;
							gigabytee2=(edtValue)*0.736279247;
							terabitt=(edtValue)*0.0053571366;
							terabytee=(edtValue)*0.0006696421;
							terabytee2=(edtValue)*0.0007362792;
							petabitt=(edtValue)*0.0000052316;
							petabytee=(edtValue)*6.53947338E-7;
							petabytee2=(edtValue)*7.36279247E-7;
							exabitt=(edtValue)*5.108963578E-9;
							exabytee=(edtValue)*6.386204473E-10;
							exabytee2=(edtValue)*7.36279247E-10;
							floppydiskk1=(edtValue)*1010.2180571;
							floppydiskk2=(edtValue)*505.10902856;
							floppydiskk3=(edtValue)*252.55451428;
							floppydiskk4=(edtValue)*2020.4361142;
							floppydiskk5=(edtValue)*606.51429958;
							zip1=(edtValue)*7.3311313663;
							zip2=(edtValue)*2.9324525465;
							jaz1=(edtValue)*0.685713484;
							jaz2=(edtValue)*0.342856742;
							cd1=(edtValue)*1.0810810802;
							cd2=(edtValue)*1;
							dvd1=(edtValue)*0.1458964859;
							dvd2=(edtValue)*0.0806721746;
							dvd3=(edtValue)*0.072948243;
							dvd4=(edtValue)*0.0403360873;

							break;
						case "DVD (1 layer, 1 side) - DVD":

							bitt=(edtValue)*40372692582.0;
							nibblee=(edtValue)*10093173146.0;
							bytee=(edtValue)*5046586572.8;
							characterr=(edtValue)*5046586572.8;
							wordd=(edtValue)*2523293286.4;
							mapmwordd=(edtValue)*1261646643.2;
							quadd=(edtValue)*630823321.6;
							blockk=(edtValue)*9856614.4;
							kilobitt=(edtValue)*39426457.6;
							kilobytee=(edtValue)*4928307.2;
							kilobytee2=(edtValue)*5046586.5728;
							megabitt=(edtValue)*38502.4;
							megabytee=(edtValue)*4812.8;
							megabytee2=(edtValue)*5046.5865728;
							gigabitt=(edtValue)*37.6;
							gigabytee=(edtValue)*4.7;
							gigabytee2=(edtValue)*5.0465865728;
							terabitt=(edtValue)*0.03671875;
							terabytee=(edtValue)*0.0045898438;
							terabytee2=(edtValue)*0.0050465866;
							petabitt=(edtValue)*0.0000358582;
							petabytee=(edtValue)*0.0000044823;
							petabytee2=(edtValue)*0.0000050466;
							exabitt=(edtValue)*3.50177288E-8;
							exabytee=(edtValue)*4.3772161E-9;
							exabytee2=(edtValue)*5.046586572E-9;
							floppydiskk1=(edtValue)*6924.2110292;
							floppydiskk2=(edtValue)*3462.1055146;
							floppydiskk3=(edtValue)*1731.0527573;
							floppydiskk4=(edtValue)*13848.422058;
							floppydiskk5=(edtValue)*4157.1549557;
							zip1=(edtValue)*50.248854993;
							zip2=(edtValue)*20.099541997;
							jaz1=(edtValue)*4.7;
							jaz2=(edtValue)*2.35;
							cd1=(edtValue)*7.4099185681;
							cd2=(edtValue)*6.8541746808;
							dvd1=(edtValue)*1;
							dvd2=(edtValue)*0.5529411765;
							dvd3=(edtValue)*0.5;
							dvd4=(edtValue)*0.2764705882;

							break;
						case "DVD (2 layer, 1 side) - DVD":

							bitt=(edtValue)*73014444032.0;
							nibblee=(edtValue)*18253611008.0;
							bytee=(edtValue)*9126805504.0;
							characterr=(edtValue)*9126805504.0;
							wordd=(edtValue)*4563402752.0;
							mapmwordd=(edtValue)*2281701376.0;
							quadd=(edtValue)*1140850688;
							blockk=(edtValue)*17825792;
							kilobitt=(edtValue)*71303168;
							kilobytee=(edtValue)*8912896;
							kilobytee2=(edtValue)*9126805.504;
							megabitt=(edtValue)*69632;
							megabytee=(edtValue)*8704;
							megabytee2=(edtValue)*9126.805504;
							gigabitt=(edtValue)*68;
							gigabytee=(edtValue)*8.5;
							gigabytee2=(edtValue)*9.126805504;
							terabitt=(edtValue)*0.06640625;
							terabytee=(edtValue)*0.0083007812;
							terabytee2=(edtValue)*0.0091268055;
							petabitt=(edtValue)*0.0000648499;
							petabytee=(edtValue)*0.0000081062;
							petabytee2=(edtValue)*0.0000091268;
							exabitt=(edtValue)*6.332993507E-8;
							exabytee=(edtValue)*7.916241884E-9;
							exabytee2=(edtValue)*9.126805503E-9;
							floppydiskk1=(edtValue)*12522.509308;
							floppydiskk2=(edtValue)*6261.254654;
							floppydiskk3=(edtValue)*3130.627327;
							floppydiskk4=(edtValue)*25045.018616;
							floppydiskk5=(edtValue)*7518.2589625;
							zip1=(edtValue)*90.875588817;
							zip2=(edtValue)*36.350235527;
							jaz1=(edtValue)*8.5;
							jaz2=(edtValue)*4.25;
							cd1=(edtValue)*13.400916559;
							cd2=(edtValue)*12.395847827;
							dvd1=(edtValue)*1.8085106383;
							dvd2=(edtValue)*1;
							dvd3=(edtValue)*0.9042553191;
							dvd4=(edtValue)*0.5;

							break;
						case "DVD (1 layer, 2 side) - DVD":

							bitt=(edtValue)*80745385165.0;
							nibblee=(edtValue)*20186346291.0;
							bytee=(edtValue)*10093173146.0;
							characterr=(edtValue)*10093173146.0;
							wordd=(edtValue)*5046586572.8;
							mapmwordd=(edtValue)*2523293286.4;
							quadd=(edtValue)*1261646643.2;
							blockk=(edtValue)*19713228.8;
							kilobitt=(edtValue)*78852915.2;
							kilobytee=(edtValue)*9856614.4;
							kilobytee2=(edtValue)*10093173.146;
							megabitt=(edtValue)*77004.8;
							megabytee=(edtValue)*9625.6;
							megabytee2=(edtValue)*10093.173146;
							gigabitt=(edtValue)*75.2;
							gigabytee=(edtValue)*9.4;
							gigabytee2=(edtValue)*10.093173146;
							terabitt=(edtValue)*0.0734375;
							terabytee=(edtValue)*0.0091796875;
							terabytee2=(edtValue)*0.0100931731;
							petabitt=(edtValue)*0.0000717163;
							petabytee=(edtValue)*0.0000089645;
							petabytee2=(edtValue)*0.0000100932;
							exabitt=(edtValue)*7.003545761E-8;
							exabytee=(edtValue)*8.754432201E-9;
							exabytee2=(edtValue)*1.009317314E-8;
							floppydiskk1=(edtValue)*13848.422058;
							floppydiskk2=(edtValue)*6924.2110292;
							floppydiskk3=(edtValue)*3462.1055146;
							floppydiskk4=(edtValue)*27696.844117;
							floppydiskk5=(edtValue)*8314.3099114;
							zip1=(edtValue)*100.49770999;
							zip2=(edtValue)*40.199083994;
							jaz1=(edtValue)*9.4;
							jaz2=(edtValue)*4.7;
							cd1=(edtValue)*14.819837136;
							cd2=(edtValue)*13.708349362;
							dvd1=(edtValue)*2;
							dvd2=(edtValue)*1.1058823529;
							dvd3=(edtValue)*1;
							dvd4=(edtValue)*0.5529411765;

							break;
						case "DVD (2 layer, 2 side) - DVD":

							bitt=(edtValue)*146028888064.0;
							nibblee=(edtValue)*(edtValue)*36507222016.0;
							bytee=(edtValue)*18253611008.0;
							characterr=(edtValue)*18253611008.0;
							wordd=(edtValue)*9126805504.0;
							mapmwordd=(edtValue)*4563402752.0;
							quadd=(edtValue)*2281701376.0;
							blockk=(edtValue)*35651584;
							kilobitt=(edtValue)*142606336;
							kilobytee=(edtValue)*17825792;
							kilobytee2=(edtValue)*18253611.008;
							megabitt=(edtValue)*139264;
							megabytee=(edtValue)*17408;
							megabytee2=(edtValue)*18253.611008;
							gigabitt=(edtValue)*136;
							gigabytee=(edtValue)*17;
							gigabytee2=(edtValue)*18.253611008;
							terabitt=(edtValue)*0.1328125;
							terabytee=(edtValue)*0.0166015625;
							terabytee2=(edtValue)*0.018253611;
							petabitt=(edtValue)*0.0001296997;
							petabytee=(edtValue)*0.0000162125;
							petabytee2=(edtValue)*0.0000182536;
							exabitt=(edtValue)*1.266598701E-7;
							exabytee=(edtValue)*1.583248376E-8;
							exabytee2=(edtValue)*1.8253611E-8;
							floppydiskk1=(edtValue)*25045.018616;
							floppydiskk2=(edtValue)*12522.509308;
							floppydiskk3=(edtValue)*6261.254654;
							floppydiskk4=(edtValue)*50090.037232;
							floppydiskk5=(edtValue)*15036.517925;
							zip1=(edtValue)*181.75117763;
							zip2=(edtValue)*72.700471054;
							jaz1=(edtValue)*17;
							jaz2=(edtValue)*8.5;
							cd1=(edtValue)*26.801833119;
							cd2=(edtValue)*24.791695654;
							dvd1=(edtValue)*3.6170212766;
							dvd2=(edtValue)*2;
							dvd3=(edtValue)*1.8085106383;
							dvd4=(edtValue)*1;

							break;
					}   
					
					    results.setBitt(bitt);
		    	         results.setNibblee(nibblee);
		    	         results.setBytee(bytee); 
		    	         results.setCharacterr(characterr);
		    	         results.setWordd(wordd);
		    	         results.setMapmwordd(mapmwordd);
		    	         results.setQuadd(quadd);
		    	         results.setBlockk(blockk); 
		    	         results.setKilobitt(kilobitt);
		    	         results.setKilobytee(kilobytee);
		    	         results.setKilobytee2(kilobytee2);
		    	         results.setMegabitt(megabitt);
		    	         results.setMegabytee(megabytee); 
		    	         results.setMegabytee2(megabytee2);
		    	         results.setGigabitt(gigabitt);
		    	         results.setGigabytee(gigabytee);
		    	         results.setGigabytee2(gigabytee2);
		    	         results.setTerabitt(terabitt);
		    	         results.setTerabytee(terabytee);
		    	         results.setTerabytee2(terabytee2);
		    	         results.setPetabitt(petabitt);
		    	         results.setPetabytee(petabytee);
		    	         results.setPetabytee2(petabytee2); 
		    	         results.setExabitt(exabitt);
		    	         results.setExabytee(exabytee);
		    	         results.setExabytee2(exabytee2);
		    	         results.setFloppydiskk1(floppydiskk1);
		    	         results.setFloppydiskk2(floppydiskk2); 
		    	         results.setFloppydiskk3(floppydiskk3);
		    	         results.setFloppydiskk4(floppydiskk4);
		    	         results.setFloppydiskk5(floppydiskk5);
		    	         results.setZip1(zip1);
		    	         results.setZip2(zip2); 
		    	         results.setJaz1(jaz1);
		    	         results.setJaz2(jaz2);
		    	         results.setCd1(cd1);
		    	         results.setCd2(cd2);
		    	         results.setDvd1(dvd1);
		    	         results.setDvd2(dvd2);
		    	         results.setDvd3(dvd3);
		    	         results.setDvd4(dvd4);
		    	         
		    	        
		    	         converterArray.add(results);
		    	         
		 			    return converterArray;     
		    	         
				   
				  }
						  public class ConversionResults{
							  
							  private double bitt,nibblee,bytee,characterr,wordd,mapmwordd,quadd,blockk,kilobitt,kilobytee,
							  
				                             kilobytee2,megabitt,megabytee,megabytee2,gigabitt,gigabytee,gigabytee2,terabitt,terabytee,terabytee2,
				                             
				                             petabitt,petabytee,petabytee2,exabitt,exabytee,exabytee2,floppydiskk1,floppydiskk2,floppydiskk3,floppydiskk4,
				                             
				                             floppydiskk5,zip1,zip2,jaz1,jaz2,cd1,cd2,dvd1,dvd2,dvd3,dvd4;
							  

							public double getBitt() {
								return bitt;
							}

							public void setBitt(double bitt) {
								this.bitt = bitt;
							}

							public double getNibblee() {
								return nibblee;
							}

							public void setNibblee(double nibblee) {
								this.nibblee = nibblee;
							}

							public double getBytee() {
								return bytee;
							}

							public void setBytee(double bytee) {
								this.bytee = bytee;
							}

							public double getCharacterr() {
								return characterr;
							}

							public void setCharacterr(double characterr) {
								this.characterr = characterr;
							}

							public double getWordd() {
								return wordd;
							}

							public void setWordd(double wordd) {
								this.wordd = wordd;
							}

							public double getMapmwordd() {
								return mapmwordd;
							}

							public void setMapmwordd(double mapmwordd) {
								this.mapmwordd = mapmwordd;
							}

							public double getQuadd() {
								return quadd;
							}

							public void setQuadd(double quadd) {
								this.quadd = quadd;
							}

							public double getBlockk() {
								return blockk;
							}

							public void setBlockk(double blockk) {
								this.blockk = blockk;
							}

							public double getKilobitt() {
								return kilobitt;
							}

							public void setKilobitt(double kilobitt) {
								this.kilobitt = kilobitt;
							}

							public double getKilobytee() {
								return kilobytee;
							}

							public void setKilobytee(double kilobytee) {
								this.kilobytee = kilobytee;
							}

							public double getKilobytee2() {
								return kilobytee2;
							}

							public void setKilobytee2(double kilobytee2) {
								this.kilobytee2 = kilobytee2;
							}

							public double getMegabitt() {
								return megabitt;
							}

							public void setMegabitt(double megabitt) {
								this.megabitt = megabitt;
							}

							public double getMegabytee() {
								return megabytee;
							}

							public void setMegabytee(double megabytee) {
								this.megabytee = megabytee;
							}

							public double getMegabytee2() {
								return megabytee2;
							}

							public void setMegabytee2(double megabytee2) {
								this.megabytee2 = megabytee2;
							}

							public double getGigabitt() {
								return gigabitt;
							}

							public void setGigabitt(double gigabitt) {
								this.gigabitt = gigabitt;
							}

							public double getGigabytee() {
								return gigabytee;
							}

							public void setGigabytee(double gigabytee) {
								this.gigabytee = gigabytee;
							}

							public double getGigabytee2() {
								return gigabytee2;
							}

							public void setGigabytee2(double gigabytee2) {
								this.gigabytee2 = gigabytee2;
							}

							public double getTerabitt() {
								return terabitt;
							}

							public void setTerabitt(double terabitt) {
								this.terabitt = terabitt;
							}

							public double getTerabytee() {
								return terabytee;
							}

							public void setTerabytee(double terabytee) {
								this.terabytee = terabytee;
							}

							public double getTerabytee2() {
								return terabytee2;
							}

							public void setTerabytee2(double terabytee2) {
								this.terabytee2 = terabytee2;
							}

							public double getPetabitt() {
								return petabitt;
							}

							public void setPetabitt(double petabitt) {
								this.petabitt = petabitt;
							}

							public double getPetabytee() {
								return petabytee;
							}

							public void setPetabytee(double petabytee) {
								this.petabytee = petabytee;
							}

							public double getPetabytee2() {
								return petabytee2;
							}

							public void setPetabytee2(double petabytee2) {
								this.petabytee2 = petabytee2;
							}

							public double getExabitt() {
								return exabitt;
							}

							public void setExabitt(double exabitt) {
								this.exabitt = exabitt;
							}

							public double getExabytee() {
								return exabytee;
							}

							public void setExabytee(double exabytee) {
								this.exabytee = exabytee;
							}

							public double getExabytee2() {
								return exabytee2;
							}

							public void setExabytee2(double exabytee2) {
								this.exabytee2 = exabytee2;
							}

							public double getFloppydiskk1() {
								return floppydiskk1;
							}

							public void setFloppydiskk1(double floppydiskk1) {
								this.floppydiskk1 = floppydiskk1;
							}

							public double getFloppydiskk2() {
								return floppydiskk2;
							}

							public void setFloppydiskk2(double floppydiskk2) {
								this.floppydiskk2 = floppydiskk2;
							}

							public double getFloppydiskk3() {
								return floppydiskk3;
							}

							public void setFloppydiskk3(double floppydiskk3) {
								this.floppydiskk3 = floppydiskk3;
							}

							public double getFloppydiskk4() {
								return floppydiskk4;
							}

							public void setFloppydiskk4(double floppydiskk4) {
								this.floppydiskk4 = floppydiskk4;
							}

							public double getFloppydiskk5() {
								return floppydiskk5;
							}

							public void setFloppydiskk5(double floppydiskk5) {
								this.floppydiskk5 = floppydiskk5;
							}

							public double getZip1() {
								return zip1;
							}

							public void setZip1(double zip1) {
								this.zip1 = zip1;
							}

							public double getZip2() {
								return zip2;
							}

							public void setZip2(double zip2) {
								this.zip2 = zip2;
							}

							public double getJaz1() {
								return jaz1;
							}

							public void setJaz1(double jaz1) {
								this.jaz1 = jaz1;
							}

							public double getJaz2() {
								return jaz2;
							}

							public void setJaz2(double jaz2) {
								this.jaz2 = jaz2;
							}

							public double getCd1() {
								return cd1;
							}

							public void setCd1(double cd1) {
								this.cd1 = cd1;
							}

							public double getCd2() {
								return cd2;
							}

							public void setCd2(double cd2) {
								this.cd2 = cd2;
							}

							public double getDvd1() {
								return dvd1;
							}

							public void setDvd1(double dvd1) {
								this.dvd1 = dvd1;
							}

							public double getDvd2() {
								return dvd2;
							}

							public void setDvd2(double dvd2) {
								this.dvd2 = dvd2;
							}

							public double getDvd3() {
								return dvd3;
							}

							public void setDvd3(double dvd3) {
								this.dvd3 = dvd3;
							}

							public double getDvd4() {
								return dvd4;
							}

							public void setDvd4(double dvd4) {
								this.dvd4 = dvd4;
							}

							
						   
					  }
	          }
