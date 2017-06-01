package com.nineinfosys.basicconverter.Engin;

import java.util.ArrayList;


public class ForceConverter {
	
	private double newton,kilonewton,gramforce,kilogramforce,tonforce,exanewton,petanewton,teranewton,giganewton,meganewton,hectonewton,dekanewton,decinewton,centinewton,milinewton,micronewton,
	nanonewton,piconewton,femtonewton,attonewton,dyne,joulepermeter,joulepercentimeter,tonforceshort,tonforcelong,kipforce,kilopoundforce,poundforce,ounceforce,poundal,poundfootpersquaresecond,pond,kilopond;
	private double edtValue;
	private String conversionFrom;
			
			public ForceConverter(String conversionFrom, double edtValue) {
				// TODO Auto-generated constructor stub
				this.conversionFrom = conversionFrom;
				this.edtValue = edtValue;
			}

			public ArrayList<ConversionResults> calculateForceConversion()
		    {
		    	
				ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
					
				ConversionResults results= new ConversionResults();
		    		 	
				switch(conversionFrom)
				{
				case "Newton - N":
					newton=(edtValue)*1;
					kilonewton=(edtValue)*0.001;
					gramforce=(edtValue)*101.9716213;
					kilogramforce=(edtValue)*0.1019716213;
					tonforce=(edtValue)*0.0001019716;
					exanewton=(edtValue)*1.E-18;
					petanewton=(edtValue)*1.E-15;
					teranewton=(edtValue)*1.E-12;
					giganewton=(edtValue)*1.E-9;
					meganewton=(edtValue)*0.000001;
					hectonewton=(edtValue)*0.01;
					dekanewton=(edtValue)*0.01;
					decinewton=(edtValue)*10;
					centinewton=(edtValue)*100;
					milinewton=(edtValue)*1000;
					micronewton=(edtValue)*1000000;
					nanonewton=(edtValue)*1000000000;
					piconewton=(edtValue)*1000000000000.0;
					femtonewton=(edtValue)*1000000000000000.0;
					attonewton=(edtValue)*1000000000000000000.0;
					dyne=(edtValue)*100000;
					joulepermeter=(edtValue)*1;
					joulepercentimeter=(edtValue)*100;
					tonforceshort=(edtValue)*0.0001124045;
					tonforcelong=(edtValue)*0.0001003611;
					kipforce=(edtValue)*0.0002248089;
					kilopoundforce=(edtValue)*0.0002248089;
					poundforce=(edtValue)*0.2248089431;
					ounceforce=(edtValue)*3.5969430896;
					poundal=(edtValue)*7.2330138512;
					poundfootpersquaresecond=(edtValue)*7.2330138512;
					pond=(edtValue)*101.9716213;
					kilopond=(edtValue)*0.1019716213;
					break;
					
				case "Kilonewton - kN":
					newton=(edtValue)*1000;
					kilonewton=(edtValue)*1;
					gramforce=(edtValue)*101971.6213;
					kilogramforce=(edtValue)*101.9716213;
					tonforce=(edtValue)*0.1019716213;
					exanewton=(edtValue)*1.E-15;
					petanewton=(edtValue)*1.E-12;
					teranewton=(edtValue)*1.E-9;
					giganewton=(edtValue)*0.000001;
					meganewton=(edtValue)*0.001;
					hectonewton=(edtValue)*10;
					dekanewton=(edtValue)*100;
					decinewton=(edtValue)*10000;
					centinewton=(edtValue)*100000;
					milinewton=(edtValue)*1000000;
					micronewton=(edtValue)*1000000000;
					nanonewton=(edtValue)*1000000000000.0;
					piconewton=(edtValue)*1000000000000000.0;
					femtonewton=(edtValue)*1000000000000000000.0;
					attonewton=(edtValue)*1.E+21;
					dyne=(edtValue)*100000000;
					joulepermeter=(edtValue)*1000;
					joulepercentimeter=(edtValue)*100000;
					tonforceshort=(edtValue)*0.1124044715;
					tonforcelong=(edtValue)*0.1003611353;
					kipforce=(edtValue)*0.2248089431;
					kilopoundforce=(edtValue)*0.2248089431;
					poundforce=(edtValue)*224.8089431;
					ounceforce=(edtValue)*3596.9430896;
					poundal=(edtValue)*7233.0138512;
					poundfootpersquaresecond=(edtValue)*7233.0138512;
					pond=(edtValue)*101971.6213;
					kilopond=(edtValue)*101.9716213;
					break;
					
					
				case "Gram-force - gf":
					newton=(edtValue)*0.00980665;
					kilonewton=(edtValue)*0.0000098067;
					gramforce=(edtValue)*1;
					kilogramforce=(edtValue)*0.001;
					tonforce=(edtValue)*0.000001;
					exanewton=(edtValue)*9.80665E-21;
					petanewton=(edtValue)*9.80665E-18;
					teranewton=(edtValue)*9.80665E-15;
					giganewton=(edtValue)*9.80665E-12;
					meganewton=(edtValue)*9.80665E-9;
					hectonewton=(edtValue)*0.0000980665;
					dekanewton=(edtValue)*0.000980665;
					decinewton=(edtValue)*0.0980665;
					centinewton=(edtValue)*0.980665;
					milinewton=(edtValue)*9.80665;
					micronewton=(edtValue)*9806.65;
					nanonewton=(edtValue)*9806650;
					piconewton=(edtValue)*9806650000.0;
					femtonewton=(edtValue)*9806650000000.0;
					attonewton=(edtValue)*9806650000000272.0;
					dyne=(edtValue)*980.665;
					joulepermeter=(edtValue)*0.00980665;
					joulepercentimeter=(edtValue)*0.980665;
					tonforceshort=(edtValue)*0.0000011023;
					tonforcelong=(edtValue)*9.842065276E-7;
					kipforce=(edtValue)*0.0000022046;
					kilopoundforce=(edtValue)*0.0000022046;
					poundforce=(edtValue)*0.0022046226;
					ounceforce=(edtValue)*0.0352739619;
					poundal=(edtValue)*0.0709316353;
					poundfootpersquaresecond=(edtValue)*0.0709316353;
					pond=(edtValue)*1;
					kilopond=(edtValue)*0.001;
					break;
					
					
				case "Kilogram-force - kgf":
					newton=(edtValue)*9.80665;
					kilonewton=(edtValue)*0.00980665;
					gramforce=(edtValue)*1000;
					kilogramforce=(edtValue)*1;
					tonforce=(edtValue)*0.001;
					exanewton=(edtValue)*9.80665E-18;
					petanewton=(edtValue)*9.80665E-15;
					teranewton=(edtValue)*9.80665E-12;
					giganewton=(edtValue)*9.80665E-9;
					meganewton=(edtValue)*0.0000098067;
					hectonewton=(edtValue)*0.0980665;
					dekanewton=(edtValue)*0.980665;
					decinewton=(edtValue)*98.0665;
					centinewton=(edtValue)*980.665;
					milinewton=(edtValue)*9806.65;
					micronewton=(edtValue)*9806650;
					nanonewton=(edtValue)*9806650000.0;
					piconewton=(edtValue)*9806650000000.0;
					femtonewton=(edtValue)*9806650000000272.0;
					attonewton=(edtValue)*9806650000000272000.0;
					dyne=(edtValue)*980665;
					joulepermeter=(edtValue)*9.80665;
					joulepercentimeter=(edtValue)*980.665;
					tonforceshort=(edtValue)*0.0011023113;
					tonforcelong=(edtValue)*0.0009842065;
					kipforce=(edtValue)*0.0022046226;
					kilopoundforce=(edtValue)*0.0022046226;
					poundforce=(edtValue)*2.2046226219;
					ounceforce=(edtValue)*35.27396195;
					poundal=(edtValue)*70.931635284;
					poundfootpersquaresecond=(edtValue)*70.931635284;
					pond=(edtValue)*1000;
					kilopond=(edtValue)*1;
					break;
					
				case "Ton-force(metric) - tf":
					newton=(edtValue)*9806.65;
					kilonewton=(edtValue)*9.80665;
					gramforce=(edtValue)*1000000;
					kilogramforce=(edtValue)*1000;
					tonforce=(edtValue)*1;
					exanewton=(edtValue)*9.80665E-15;
					petanewton=(edtValue)*9.80665E-12;
					teranewton=(edtValue)*9.80665E-9;
					giganewton=(edtValue)*0.0000098067;
					meganewton=(edtValue)*0.00980665;
					hectonewton=(edtValue)*98.0665;
					dekanewton=(edtValue)*980.665;
					decinewton=(edtValue)*98066.5;
					centinewton=(edtValue)*980665;
					milinewton=(edtValue)*9806650;
					micronewton=(edtValue)*9806650000.0;
					nanonewton=(edtValue)*9806650000000.0;
					piconewton=(edtValue)*9806650000000272.0;
					femtonewton=(edtValue)*9806650000000270000.0;
					attonewton=(edtValue)*9.80665E+21;
					dyne=(edtValue)*980665000;
					joulepermeter=(edtValue)*9806.65;
					joulepercentimeter=(edtValue)*980665;
					tonforceshort=(edtValue)*1.1023113109;
					tonforcelong=(edtValue)*0.9842065276;
					kipforce=(edtValue)*2.2046226219;
					kilopoundforce=(edtValue)*2.2046226219;
					poundforce=(edtValue)*2204.6226219;
					ounceforce=(edtValue)*35273.96195;
					poundal=(edtValue)*70931.635284;
					poundfootpersquaresecond=(edtValue)*70931.635284;
					pond=(edtValue)*1000000;
					kilopond=(edtValue)*1000;
					break;
					
					
				case "Exanewton - EN":
					newton=(edtValue)*1000000000000000000.0;
					kilonewton=(edtValue)*1000000000000000.0;
					gramforce=(edtValue)*101971621297790000000.0;
					kilogramforce=(edtValue)*101971621297790000.0;
					tonforce=(edtValue)*101971621297790.0;
					exanewton=(edtValue)*1;
					petanewton=(edtValue)*1000;
					teranewton=(edtValue)*1000000;
					giganewton=(edtValue)*1000000000;
					meganewton=(edtValue)*1000000000000.0;
					hectonewton=(edtValue)*10000000000000000.0;
					dekanewton=(edtValue)*100000000000000000.0;
					decinewton=(edtValue)*10000000000000000000.0;
					centinewton=(edtValue)*100000000000000000000.0;
					milinewton=(edtValue)*1.E+21;
					micronewton=(edtValue)*1.E+24;
					nanonewton=(edtValue)*1.E+27;
					piconewton=(edtValue)*1.E+30;
					femtonewton=(edtValue)*1.E+33;
					attonewton=(edtValue)*1.E+36;
					dyne=(edtValue)*1.E+23;
					joulepermeter=(edtValue)*1000000000000000000.0;
					joulepercentimeter=(edtValue)*100000000000000000000.0;
					tonforceshort=(edtValue)*112404471549860.0;
					tonforcelong=(edtValue)*100361135312500.0;
					kipforce=(edtValue)*224808943100000.0;
					kilopoundforce=(edtValue)*224808943100000.0;
					poundforce=(edtValue)*224808943100000000.0;
					ounceforce=(edtValue)*3596943089600000000.0;
					poundal=(edtValue)*7233013851209900000.0;
					poundfootpersquaresecond=(edtValue)*7233013851209900000.0;
					pond=(edtValue)*101971621297790000000.0;
					kilopond=(edtValue)*101971621297790000.0;
					break;
					
				case "Petanewton - PT":
					newton=(edtValue)*1000000000000000.0;
					kilonewton=(edtValue)*1000000000000.0;
					gramforce=(edtValue)*101971621297790000.0;
					kilogramforce=(edtValue)*101971621297790.0;
					tonforce=(edtValue)*101971621298.0;
					exanewton=(edtValue)*0.001;
					petanewton=(edtValue)*1;
					teranewton=(edtValue)*1000;
					giganewton=(edtValue)*1000000;
					meganewton=(edtValue)*1000000000.0;
					hectonewton=(edtValue)*10000000000000.0;
					dekanewton=(edtValue)*100000000000000.0;
					decinewton=(edtValue)*10000000000000000.0;
					centinewton=(edtValue)*100000000000000000.0;
					milinewton=(edtValue)*1000000000000000000.0;
					micronewton=(edtValue)*1.E+21;
					nanonewton=(edtValue)*1.E+24;
					piconewton=(edtValue)*1.E+27;
					femtonewton=(edtValue)*9.999999999E+29;
					attonewton=(edtValue)*1.E+33;
					dyne=(edtValue)*99999999999999980000.0;
					joulepermeter=(edtValue)*1000000000000000.0;
					joulepercentimeter=(edtValue)*100000000000000000.0;
					tonforceshort=(edtValue)*112404471550.0;
					tonforcelong=(edtValue)*100361135313.0;
					kipforce=(edtValue)*224808943100.0;
					kilopoundforce=(edtValue)*224808943100.0;
					poundforce=(edtValue)*224808943100000.0;
					ounceforce=(edtValue)*3596943089600000.0;
					poundal=(edtValue)*7233013851209900.0;
					poundfootpersquaresecond=(edtValue)*7233013851209900.0;
					pond=(edtValue)*101971621297790000.0;
					kilopond=(edtValue)*101971621297790.0;
					break;
					
				case "Teranewton - TN":
					newton=(edtValue)*1000000000000.0;
					kilonewton=(edtValue)*1000000000.0;
					gramforce=(edtValue)*101971621297790.0;
					kilogramforce=(edtValue)*101971621298.0;
					tonforce=(edtValue)*101971621.3;
					exanewton=(edtValue)*0.000001;
					petanewton=(edtValue)*0.001;
					teranewton=(edtValue)*1;
					giganewton=(edtValue)*1000;
					meganewton=(edtValue)*1000000;
					hectonewton=(edtValue)*10000000000.0;
					dekanewton=(edtValue)*100000000000.0;
					decinewton=(edtValue)*10000000000000.0;
					centinewton=(edtValue)*100000000000000.0;
					milinewton=(edtValue)*1000000000000000.0;
					micronewton=(edtValue)*1000000000000000000.0;
					nanonewton=(edtValue)*1.E+21;
					piconewton=(edtValue)*1.E+24;
					femtonewton=(edtValue)*1.E+27;
					attonewton=(edtValue)*1.E+30;
					dyne=(edtValue)*99999999999999980.0;
					joulepermeter=(edtValue)*1000000000000.0;
					joulepercentimeter=(edtValue)*100000000000000.0;
					tonforceshort=(edtValue)*112404471.55;
					tonforcelong=(edtValue)*100361135.31;
					kipforce=(edtValue)*224808943.1;
					kilopoundforce=(edtValue)*224808943.1;
					poundforce=(edtValue)*224808943100.0;
					ounceforce=(edtValue)*3596943089600.0;
					poundal=(edtValue)*7233013851210.0;
					poundfootpersquaresecond=(edtValue)*7233013851210.0;
					pond=(edtValue)*101971621297790.0;
					kilopond=(edtValue)*101971621298.0;
					break;
					
				case "Giganewton - GN":
					newton=(edtValue)*1000000000.0;
					kilonewton=(edtValue)*1000000;
					gramforce=(edtValue)*101971621298.0;
					kilogramforce=(edtValue)*101971621.3;
					tonforce=(edtValue)*101971.6213;
					exanewton=(edtValue)*1.E-9;
					petanewton=(edtValue)*0.000001;
					teranewton=(edtValue)*0.001;
					giganewton=(edtValue)*1;
					meganewton=(edtValue)*1000;
					hectonewton=(edtValue)*10000000;
					dekanewton=(edtValue)*100000000;
					decinewton=(edtValue)*10000000000.0;
					centinewton=(edtValue)*100000000000.0;
					milinewton=(edtValue)*1000000000000.0;
					micronewton=(edtValue)*1000000000000000000.0;
					nanonewton=(edtValue)*1000000000000000000.0;
					piconewton=(edtValue)*1.E+21;
					femtonewton=(edtValue)*1.E+24;
					attonewton=(edtValue)*1.E+27;
					dyne=(edtValue)*100000000000000.0;
					joulepermeter=(edtValue)*1000000000.0;
					joulepercentimeter=(edtValue)*100000000000.0;
					tonforceshort=(edtValue)*112404.47155;
					tonforcelong=(edtValue)*100361.13531;
					kipforce=(edtValue)*224808.9431;
					kilopoundforce=(edtValue)*224808.9431;
					poundforce=(edtValue)*224808943.1;
					ounceforce=(edtValue)*3596943089.6;
					poundal=(edtValue)*7233013851.2;
					poundfootpersquaresecond=(edtValue)*7233013851.2;
					pond=(edtValue)*101971621298.0;
					kilopond=(edtValue)*101971621.3;
					break;
					
				case "Meganewton - MN":
					newton=(edtValue)*1000000;
					kilonewton=(edtValue)*1000;
					gramforce=(edtValue)*101971621.3;
					kilogramforce=(edtValue)*101971.6213;
					tonforce=(edtValue)*101.9716213;
					exanewton=(edtValue)*1.E-12;
					petanewton=(edtValue)*1.E-9;
					teranewton=(edtValue)*0.000001;
					giganewton=(edtValue)*0.001;
					meganewton=(edtValue)*1;
					hectonewton=(edtValue)*10000;
					dekanewton=(edtValue)*100000;
					decinewton=(edtValue)*10000000;
					centinewton=(edtValue)*100000000;
					milinewton=(edtValue)*1000000000.0;
					micronewton=(edtValue)*1000000000000.0;
					nanonewton=(edtValue)*1000000000000000.0;
					piconewton=(edtValue)*1000000000000000000.0;
					femtonewton=(edtValue)*1.E+21;
					attonewton=(edtValue)*1.E+24;
					dyne=(edtValue)*100000000000.0;
					joulepermeter=(edtValue)*1000000;
					joulepercentimeter=(edtValue)*100000000;
					tonforceshort=(edtValue)*112.40447155;
					tonforcelong=(edtValue)*100.36113531;
					kipforce=(edtValue)*224.8089431;
					kilopoundforce=(edtValue)*224.8089431;
					poundforce=(edtValue)*224808.9431;
					ounceforce=(edtValue)*3596943.0896;
					poundal=(edtValue)*7233013.8512;
					poundfootpersquaresecond=(edtValue)*7233013.8512;
					pond=(edtValue)*101971621.3;
					kilopond=(edtValue)*101971.6213;
					break;
					
					
				case "Hectonewton - hN":
					newton=(edtValue)*100;
					kilonewton=(edtValue)*0.1;
					gramforce=(edtValue)*10197.16213;
					kilogramforce=(edtValue)*10.19716213;
					tonforce=(edtValue)*0.0101971621;
					exanewton=(edtValue)*1.E-16;
					petanewton=(edtValue)*1.E-13;
					teranewton=(edtValue)*1.E-10;
					giganewton=(edtValue)*1.E-7;
					meganewton=(edtValue)*0.0001;
					hectonewton=(edtValue)*1;
					dekanewton=(edtValue)*10;
					decinewton=(edtValue)*1000;
					centinewton=(edtValue)*10000;
					milinewton=(edtValue)*100000;
					micronewton=(edtValue)*100000000;
					nanonewton=(edtValue)*100000000000.0;
					piconewton=(edtValue)*100000000000000.0;
					femtonewton=(edtValue)*100000000000000000.0;
					attonewton=(edtValue)*100000000000000000000.0;
					dyne=(edtValue)*10000000;
					joulepermeter=(edtValue)*100;
					joulepercentimeter=(edtValue)*10000;
					tonforceshort=(edtValue)*0.0112404472;
					tonforcelong=(edtValue)*0.0100361135;
					kipforce=(edtValue)*0.0224808943;
					kilopoundforce=(edtValue)*0.0224808943;
					poundforce=(edtValue)*22.48089431;
					ounceforce=(edtValue)*359.69430896;
					poundal=(edtValue)*723.30138512;
					poundfootpersquaresecond=(edtValue)*723.30138512;
					pond=(edtValue)*10197.16213;
					kilopond=(edtValue)*10.19716213;
					break;
					
					
				case "Dekanewton - daN":
					newton=(edtValue)*10;
					kilonewton=(edtValue)*0.01;
					gramforce=(edtValue)*1019.716213;
					kilogramforce=(edtValue)*1.019716213;
					tonforce=(edtValue)*0.0010197162;
					exanewton=(edtValue)*1.E-17;
					petanewton=(edtValue)*1.E-14;
					teranewton=(edtValue)*1.E-11;
					giganewton=(edtValue)*1.E-8;
					meganewton=(edtValue)*0.00001;
					hectonewton=(edtValue)*0.1;
					dekanewton=(edtValue)*1;
					decinewton=(edtValue)*100;
					centinewton=(edtValue)*1000;
					milinewton=(edtValue)*10000;
					micronewton=(edtValue)*10000000;
					nanonewton=(edtValue)*10000000000.0;
					piconewton=(edtValue)*10000000000000.0;
					femtonewton=(edtValue)*10000000000000000.0;
					attonewton=(edtValue)*10000000000000000000.0;
					dyne=(edtValue)*1000000;
					joulepermeter=(edtValue)*10;
					joulepercentimeter=(edtValue)*1000;
					tonforceshort=(edtValue)*0.0011240447;
					tonforcelong=(edtValue)*0.0010036114;
					kipforce=(edtValue)*0.0022480894;
					kilopoundforce=(edtValue)*0.0022480894;
					poundforce=(edtValue)*2.248089431;
					ounceforce=(edtValue)*35.969430896;
					poundal=(edtValue)*72.330138512;
					poundfootpersquaresecond=(edtValue)*72.330138512;
					pond=(edtValue)*1019.716213;
					kilopond=(edtValue)*1.019716213;
					break;
					
					
				case "Decinewton - dN":
					newton=(edtValue)*0.1;
					kilonewton=(edtValue)*0.0001;
					gramforce=(edtValue)*10.19716213;
					kilogramforce=(edtValue)*0.0101971621;
					tonforce=(edtValue)*0.0000101972;
					exanewton=(edtValue)*1.E-19;
					petanewton=(edtValue)*1.E-16;
					teranewton=(edtValue)*1.E-13;
					giganewton=(edtValue)*1.E-10;
					meganewton=(edtValue)*1.E-7;
					hectonewton=(edtValue)*0.001;
					dekanewton=(edtValue)*0.01;
					decinewton=(edtValue)*1;
					centinewton=(edtValue)*10;
					milinewton=(edtValue)*100;
					micronewton=(edtValue)*100000;
					nanonewton=(edtValue)*100000000;
					piconewton=(edtValue)*100000000000.0;
					femtonewton=(edtValue)*100000000000000.0;
					attonewton=(edtValue)*100000000000000000.0;
					dyne=(edtValue)*10000;
					joulepermeter=(edtValue)*0.1;
					joulepercentimeter=(edtValue)*10;
					tonforceshort=(edtValue)*0.0000112404;
					tonforcelong=(edtValue)*0.0000100361;
					kipforce=(edtValue)*0.0000224809;
					kilopoundforce=(edtValue)*0.0000224809;
					poundforce=(edtValue)*0.0224808943;
					ounceforce=(edtValue)*0.359694309;
					poundal=(edtValue)*0.7233013851;
					poundfootpersquaresecond=(edtValue)*0.7233013851;
					pond=(edtValue)*10.19716213;
					kilopond=(edtValue)*0.0101971621;
					break;
					
				case "Centinewton - cN":
					newton=(edtValue)*0.01;
					kilonewton=(edtValue)*0.00001;
					gramforce=(edtValue)*1.019716213;
					kilogramforce=(edtValue)*0.0010197162;
					tonforce=(edtValue)*0.0000010197;
					exanewton=(edtValue)*1.E-20;
					petanewton=(edtValue)*1.E-17;
					teranewton=(edtValue)*1.E-14;
					giganewton=(edtValue)*1.E-11;
					meganewton=(edtValue)*1.E-8;
					hectonewton=(edtValue)*0.0001;
					dekanewton=(edtValue)*0.001;
					decinewton=(edtValue)*0.1;
					centinewton=(edtValue)*1;
					milinewton=(edtValue)*10;
					micronewton=(edtValue)*10000;
					nanonewton=(edtValue)*10000000;
					piconewton=(edtValue)*10000000000.0;
					femtonewton=(edtValue)*10000000000000.0;
					attonewton=(edtValue)*10000000000000000.0;
					dyne=(edtValue)*1000;
					joulepermeter=(edtValue)*0.01;
					joulepercentimeter=(edtValue)*1;
					tonforceshort=(edtValue)*0.000001124;
					tonforcelong=(edtValue)*0.0000010036;
					kipforce=(edtValue)*0.0000022481;
					kilopoundforce=(edtValue)*0.0000022481;
					poundforce=(edtValue)*0.0022480894;
					ounceforce=(edtValue)*0.0359694309;
					poundal=(edtValue)*0.0723301385;
					poundfootpersquaresecond=(edtValue)*0.0723301385;
					pond=(edtValue)*1.019716213;
					kilopond=(edtValue)*0.0010197162;
					break;
					
					
				case "Milinewton - mN":
					newton=(edtValue)*0.001;
					kilonewton=(edtValue)*0.000001;
					gramforce=(edtValue)*0.1019716213;
					kilogramforce=(edtValue)*0.0001019716;
					tonforce=(edtValue)*1.019716212E-7;
					exanewton=(edtValue)*1.E-21;
					petanewton=(edtValue)*1.E-18;
					teranewton=(edtValue)*1.E-15;
					giganewton=(edtValue)*1.E-12;
					meganewton=(edtValue)*1.E-9;
					hectonewton=(edtValue)*0.00001;
					dekanewton=(edtValue)*0.0001;
					decinewton=(edtValue)*0.01;
					centinewton=(edtValue)*0.1;
					milinewton=(edtValue)*1;
					micronewton=(edtValue)*1000;
					nanonewton=(edtValue)*1000000;
					piconewton=(edtValue)*1000000000;
					femtonewton=(edtValue)*1000000000000.0;
					attonewton=(edtValue)*1000000000000000.0;
					dyne=(edtValue)*100;
					joulepermeter=(edtValue)*0.001;
					joulepercentimeter=(edtValue)*0.1;
					tonforceshort=(edtValue)*1.124044715E-7;
					tonforcelong=(edtValue)*1.003611353E-7;
					kipforce=(edtValue)*2.248089431E-7;
					kilopoundforce=(edtValue)*2.248089431E-7;
					poundforce=(edtValue)*0.0002248089;
					ounceforce=(edtValue)*0.0035969431;
					poundal=(edtValue)*0.0072330139;
					poundfootpersquaresecond=(edtValue)*0.0072330139;
					pond=(edtValue)*0.1019716213;
					kilopond=(edtValue)*0.0001019716;
					break;
					
					
				case "Micronewton - μN":
					newton=(edtValue)*0.000001;
					kilonewton=(edtValue)*1.E-9;
					gramforce=(edtValue)*0.0001019716;
					kilogramforce=(edtValue)*1.019716212E-7;
					tonforce=(edtValue)*1.019716212E-10;
					exanewton=(edtValue)*1.E-24;
					petanewton=(edtValue)*1.E-21;
					teranewton=(edtValue)*1.E-18;
					giganewton=(edtValue)*1.E-15;
					meganewton=(edtValue)*1.E-12;
					hectonewton=(edtValue)*1.E-8;
					dekanewton=(edtValue)*1.E-7;
					decinewton=(edtValue)*0.00001;
					centinewton=(edtValue)*0.0001;
					milinewton=(edtValue)*0.001;
					micronewton=(edtValue)*1;
					nanonewton=(edtValue)*1000;
					piconewton=(edtValue)*1000000;
					femtonewton=(edtValue)*1000000000.0;
					attonewton=(edtValue)*1000000000000.0;
					dyne=(edtValue)*0.1;
					joulepermeter=(edtValue)*0.000001;
					joulepercentimeter=(edtValue)*0.0001;
					tonforceshort=(edtValue)*1.124044715E-10;
					tonforcelong=(edtValue)*1.003611353E-10;
					kipforce=(edtValue)*2.248089431E-10;
					kilopoundforce=(edtValue)*2.248089431E-10;
					poundforce=(edtValue)*2.248089431E-7;
					ounceforce=(edtValue)*0.0000035969;
					poundal=(edtValue)*0.000007233;
					poundfootpersquaresecond=(edtValue)*0.000007233;
					pond=(edtValue)*0.0001019716;
					kilopond=(edtValue)*1.019716212E-7;
					break;
					
					
				case "Nanonewton - nN":
					newton=(edtValue)*1.E-9;
					kilonewton=(edtValue)*1.E-12;
					gramforce=(edtValue)*1.019716212E-7;
					kilogramforce=(edtValue)*1.019716212E-10;
					tonforce=(edtValue)*1.019716212E-13;
					exanewton=(edtValue)*1.E-27;
					petanewton=(edtValue)*1.E-24;
					teranewton=(edtValue)*1.E-21;
					giganewton=(edtValue)*1.E-18;
					meganewton=(edtValue)*1.E-15;
					hectonewton=(edtValue)*1.E-11;
					dekanewton=(edtValue)*1.E-10;
					decinewton=(edtValue)*1.E-8;
					centinewton=(edtValue)*1.E-7;
					milinewton=(edtValue)*0.000001;
					micronewton=(edtValue)*0.001;
					nanonewton=(edtValue)*1;
					piconewton=(edtValue)*1000;
					femtonewton=(edtValue)*1000000;
					attonewton=(edtValue)*1000000000;
					dyne=(edtValue)*0.0001;
					joulepermeter=(edtValue)*1.E-9;
					joulepercentimeter=(edtValue)*1.E-7;
					tonforceshort=(edtValue)*1.124044715E-13;
					tonforcelong=(edtValue)*1.003611353E-13;
					kipforce=(edtValue)*2.248089431E-13;
					kilopoundforce=(edtValue)*2.248089431E-13;
					poundforce=(edtValue)*2.248089431E-10;
					ounceforce=(edtValue)*3.596943089E-9;
					poundal=(edtValue)*7.233013851E-9;
					poundfootpersquaresecond=(edtValue)*7.233013851E-9;
					pond=(edtValue)*1.019716212E-7;
					kilopond=(edtValue)*1.019716212E-10;
					break;
					
					
				case "Piconewton - pN":
					newton=(edtValue)*1.E-12;
					kilonewton=(edtValue)*1.E-15;
					gramforce=(edtValue)*1.019716212E-10;
					kilogramforce=(edtValue)*1.019716212E-13;
					tonforce=(edtValue)*1.019716212E-16;
					exanewton=(edtValue)*9.999999999E-31;
					petanewton=(edtValue)*1.E-27;
					teranewton=(edtValue)*1.E-24;
					giganewton=(edtValue)*1.E-21;
					meganewton=(edtValue)*1.E-18;
					hectonewton=(edtValue)*14;
					dekanewton=(edtValue)*1.E-13;
					decinewton=(edtValue)*1.E-11;
					centinewton=(edtValue)*1.E-10;
					milinewton=(edtValue)*1.E-9;
					micronewton=(edtValue)*0.000001;
					nanonewton=(edtValue)*0.001;
					piconewton=(edtValue)*1;
					femtonewton=(edtValue)*1000;
					attonewton=(edtValue)*1000000;
					dyne=(edtValue)*1.E-7;
					joulepermeter=(edtValue)*1.E-12;
					joulepercentimeter=(edtValue)*1.E-10;
					tonforceshort=(edtValue)*1.124044715E-16;
					tonforcelong=(edtValue)*1.003611353E-16;
					kipforce=(edtValue)*2.248089431E-16;
					kilopoundforce=(edtValue)*2.248089431E-16;
					poundforce=(edtValue)*2.248089431E-13;
					ounceforce=(edtValue)*3.596943089E-12;
					poundal=(edtValue)*7.233013851E-12;
					poundfootpersquaresecond=(edtValue)*7.233013851E-12;
					pond=(edtValue)*1.019716212E-10;
					kilopond=(edtValue)*1.019716212E-13;
					break;
					
				case "Femtonewton - fN":
					newton=(edtValue)*1.E-15;
					kilonewton=(edtValue)*1.E-18;
					gramforce=(edtValue)*1.019716212E-13;
					kilogramforce=(edtValue)*1.019716212E-16;
					tonforce=(edtValue)*1.019716212E-19;
					exanewton=(edtValue)*1.E-33;
					petanewton=(edtValue)*1.E-30;
					teranewton=(edtValue)*1.E-27;
					giganewton=(edtValue)*1.E-24;
					meganewton=(edtValue)*1.E-21;
					hectonewton=(edtValue)*1.E-17;
					dekanewton=(edtValue)*1.E-16;
					decinewton=(edtValue)*1.E-14;
					centinewton=(edtValue)*1.E-13;
					milinewton=(edtValue)*1.E-12;
					micronewton=(edtValue)*1.E-9;
					nanonewton=(edtValue)*0.000001;
					piconewton=(edtValue)*0.001;
					femtonewton=(edtValue)*1;
					attonewton=(edtValue)*1000;
					dyne=(edtValue)*9.999999999E-11;
					joulepermeter=(edtValue)*1.E-15;
					joulepercentimeter=(edtValue)*1.E-13;
					tonforceshort=(edtValue)*1.124044715E-19;
					tonforcelong=(edtValue)*1.003611353E-19;
					kipforce=(edtValue)*2.248089431E-19;
					kilopoundforce=(edtValue)*2.248089431E-19;
					poundforce=(edtValue)*2.248089431E-16;
					ounceforce=(edtValue)*3.596943089E-15;
					poundal=(edtValue)*7.233013851E-15;
					poundfootpersquaresecond=(edtValue)*7.233013851E-15;
					pond=(edtValue)*1.019716212E-13;
					kilopond=(edtValue)*1.019716212E-16;
					break;
					
				case "Attonewton - aN":
					newton=(edtValue)*9.999999999E-19;
					kilonewton=(edtValue)*1.E-21;
					gramforce=(edtValue)*1.019716212E-16;
					kilogramforce=(edtValue)*1.019716212E-19;
					tonforce=(edtValue)*1.019716212E-22;
					exanewton=(edtValue)*1.E-36;
					petanewton=(edtValue)*9.999999999E-34;
					teranewton=(edtValue)*9.999999999E-31;
					giganewton=(edtValue)*1.E-27;
					meganewton=(edtValue)*1.E-24;
					hectonewton=(edtValue)*1.E-20;
					dekanewton=(edtValue)*1.E-19;
					decinewton=(edtValue)*9.999999999E-18;
					centinewton=(edtValue)*1.E-16;
					milinewton=(edtValue)*9.999999999E-16;
					micronewton=(edtValue)*1.E-12;
					nanonewton=(edtValue)*1.E-9;
					piconewton=(edtValue)*0.000001;
					femtonewton=(edtValue)*0.001;
					attonewton=(edtValue)*1;
					dyne=(edtValue)*9.999999999E-14;
					joulepermeter=(edtValue)*9.999999999E-19;
					joulepercentimeter=(edtValue)*1.E-16;
					tonforceshort=(edtValue)*1.124044715E-22;
					tonforcelong=(edtValue)*1.003611353E-22;
					kipforce=(edtValue)*2.248089431E-22;
					kilopoundforce=(edtValue)*2.248089431E-22;
					poundforce=(edtValue)*2.248089431E-19;
					ounceforce=(edtValue)*3.596943089E-18;
					poundal=(edtValue)*7.233013851E-18;
					poundfootpersquaresecond=(edtValue)*7.233013851E-18;
					pond=(edtValue)*1.019716212E-16;
					kilopond=(edtValue)*1.019716212E-19;
					break;
					
				case "Dyne - dyn":
					newton=(edtValue)*0.00001;
					kilonewton=(edtValue)*1.E-8;
					gramforce=(edtValue)*0.0010197162;
					kilogramforce=(edtValue)*0.0000010197;
					tonforce=(edtValue)*1.019716212E-9;
					exanewton=(edtValue)*1.E-23;
					petanewton=(edtValue)*1.E-20;
					teranewton=(edtValue)*1.E-17;
					giganewton=(edtValue)*1.E-14;
					meganewton=(edtValue)*1.E-11;
					hectonewton=(edtValue)*1.E-7;
					dekanewton=(edtValue)*0.000001;
					decinewton=(edtValue)*0.0001;
					centinewton=(edtValue)*0.001;
					milinewton=(edtValue)*0.01;
					micronewton=(edtValue)*10;
					nanonewton=(edtValue)*10000;
					piconewton=(edtValue)*10000000;
					femtonewton=(edtValue)*10000000000.0;
					attonewton=(edtValue)*10000000000000.0;
					dyne=(edtValue)*1;
					joulepermeter=(edtValue)*0.00001;
					joulepercentimeter=(edtValue)*0.001;
					tonforceshort=(edtValue)*1.124044715E-9;
					tonforcelong=(edtValue)*1.003611353E-9;
					kipforce=(edtValue)*2.248089431E-9;
					kilopoundforce=(edtValue)*2.248089431E-9;
					poundforce=(edtValue)*0.0000022481;
					ounceforce=(edtValue)*0.0000359694;
					poundal=(edtValue)*0.0000723301;
					poundfootpersquaresecond=(edtValue)*0.0000723301;
					pond=(edtValue)*0.0010197162;
					kilopond=(edtValue)*0.0000010197;
					break;
					
					
				case "Joule/meter - J/m":
					newton=(edtValue)*1;
					kilonewton=(edtValue)*0.001;
					gramforce=(edtValue)*101.9716213;
					kilogramforce=(edtValue)*0.1019716213;
					tonforce=(edtValue)*0.0001019716;
					exanewton=(edtValue)*1.E-18;
					petanewton=(edtValue)*1.E-15;
					teranewton=(edtValue)*1.E-12;
					giganewton=(edtValue)*1.E-9;
					meganewton=(edtValue)*0.000001;
					hectonewton=(edtValue)*0.01;
					dekanewton=(edtValue)*0.1;
					decinewton=(edtValue)*10;
					centinewton=(edtValue)*100;
					milinewton=(edtValue)*1000;
					micronewton=(edtValue)*1000000;
					nanonewton=(edtValue)*1000000000;
					piconewton=(edtValue)*1000000000000.0;
					femtonewton=(edtValue)*1000000000000000.0;
					attonewton=(edtValue)*1000000000000000000.0;
					dyne=(edtValue)*100000.0;
					joulepermeter=(edtValue)*1;
					joulepercentimeter=(edtValue)*100;
					tonforceshort=(edtValue)*0.0001124045;
					tonforcelong=(edtValue)*0.0001003611;
					kipforce=(edtValue)*0.0002248089;
					kilopoundforce=(edtValue)*0.0002248089;
					poundforce=(edtValue)*0.2248089431;
					ounceforce=(edtValue)*3.5969430896;
					poundal=(edtValue)*7.2330138512;
					poundfootpersquaresecond=(edtValue)*7.2330138512;
					pond=(edtValue)*101.9716213;
					kilopond=(edtValue)*0.1019716213;
					break;
					
				case "Joule/centimeter - J/cm":
					newton=(edtValue)*0.01;
					kilonewton=(edtValue)*0.00001;
					gramforce=(edtValue)*1.019716213;
					kilogramforce=(edtValue)*0.0010197162;
					tonforce=(edtValue)*0.0000010197;
					exanewton=(edtValue)*1.E-20;
					petanewton=(edtValue)*1.E-17;
					teranewton=(edtValue)*1.E-14;
					giganewton=(edtValue)*1.E-11;
					meganewton=(edtValue)*1.E-8;
					hectonewton=(edtValue)*0.0001;
					dekanewton=(edtValue)*0.001;
					decinewton=(edtValue)*0.01;
					centinewton=(edtValue)*1;
					milinewton=(edtValue)*10;
					micronewton=(edtValue)*10000;
					nanonewton=(edtValue)*10000000;
					piconewton=(edtValue)*10000000000.0;
					femtonewton=(edtValue)*10000000000000.0;
					attonewton=(edtValue)*10000000000000000.0;
					dyne=(edtValue)*1000;
					joulepermeter=(edtValue)*0.01;
					joulepercentimeter=(edtValue)*1;
					tonforceshort=(edtValue)*0.000001124;
					tonforcelong=(edtValue)*0.0000010036;
					kipforce=(edtValue)*0.0000022481;
					kilopoundforce=(edtValue)*0.0000022481;
					poundforce=(edtValue)*0.0022480894;
					ounceforce=(edtValue)*0.0359694309;
					poundal=(edtValue)*0.0723301385;
					poundfootpersquaresecond=(edtValue)*0.0723301385;
					pond=(edtValue)*1.019716213;
					kilopond=(edtValue)*0.0010197162;
					break;
					
				case "Ton-force(short) - tonf":
					newton=(edtValue)*8896.4432305;
					kilonewton=(edtValue)*8.8964432305;
					gramforce=(edtValue)*907184.74;
					kilogramforce=(edtValue)*907.18474;
					tonforce=(edtValue)*0.90718474;
					exanewton=(edtValue)*8.89644323E-15;
					petanewton=(edtValue)*8.89644323E-12;
					teranewton=(edtValue)*8.89644323E-9;
					giganewton=(edtValue)*0.0000088964;
					meganewton=(edtValue)*0.0088964432;
					hectonewton=(edtValue)*88.964432305;
					dekanewton=(edtValue)*889.64432305;
					decinewton=(edtValue)*88964.432305;
					centinewton=(edtValue)*889644.32305;
					milinewton=(edtValue)*8896443.2305;
					micronewton=(edtValue)*8896443230.5;
					nanonewton=(edtValue)*8896443230521.0;
					piconewton=(edtValue)*8896443230520624.0;
					femtonewton=(edtValue)*8896443230520623000.0;
					attonewton=(edtValue)*8.89644323E+21;
					dyne=(edtValue)*889644323.05;
					joulepermeter=(edtValue)*8896.4432305;
					joulepercentimeter=(edtValue)*889644.32305;
					tonforceshort=(edtValue)*1;
					tonforcelong=(edtValue)*0.8928571429;
					kipforce=(edtValue)*2;
					kilopoundforce=(edtValue)*2;
					poundforce=(edtValue)*2000;
					ounceforce=(edtValue)*32000;
					poundal=(edtValue)*64348.097113;
					poundfootpersquaresecond=(edtValue)*64348.097113;
					pond=(edtValue)*907184.74;
					kilopond=(edtValue)*907.18474;
					break;
					
					
				case "Ton-force(long) - tonf":
					newton=(edtValue)*9964.0164182;
					kilonewton=(edtValue)*9.9640164182;
					gramforce=(edtValue)*1016046.9088;
					kilogramforce=(edtValue)*1016.0469088;
					tonforce=(edtValue)*1.0160469088;
					exanewton=(edtValue)*9.964016418E-15;
					petanewton=(edtValue)*9.964016418E-12;
					teranewton=(edtValue)*9.964016418E-9;
					giganewton=(edtValue)*0.000009964;
					meganewton=(edtValue)*0.0099640164;
					hectonewton=(edtValue)*99.640164182;
					dekanewton=(edtValue)*996.40164182;
					decinewton=(edtValue)*99640.164182;
					centinewton=(edtValue)*996401.64182;
					milinewton=(edtValue)*9964016.4182;
					micronewton=(edtValue)*9964016418.2;
					nanonewton=(edtValue)*9964016418171.0;
					piconewton=(edtValue)*9964016418170688.0;
					femtonewton=(edtValue)*9964016418170687000.0;
					attonewton=(edtValue)*9.964016418E+21;
					dyne=(edtValue)*996401641.82;
					joulepermeter=(edtValue)*9964.0164182;
					joulepercentimeter=(edtValue)*996401.64182;
					tonforceshort=(edtValue)*1.12;
					tonforcelong=(edtValue)*1;
					kipforce=(edtValue)*2.24;
					kilopoundforce=(edtValue)*2.24;
					poundforce=(edtValue)*2240;
					ounceforce=(edtValue)*35840;
					poundal=(edtValue)*72069.868766;
					poundfootpersquaresecond=(edtValue)*72069.868766;
					pond=(edtValue)*1016.0469088;
					kilopond=(edtValue)*1016.0469088;
					break;
					
				case "Kip-force - kipf":
					newton=(edtValue)*4448.2216153;
					kilonewton=(edtValue)*4.4482216153;
					gramforce=(edtValue)*453592.37;
					kilogramforce=(edtValue)*453.59237;
					tonforce=(edtValue)*0.45359237;
					exanewton=(edtValue)*4.448221615E-15;
					petanewton=(edtValue)*4.448221615E-12;
					teranewton=(edtValue)*4.448221615E-9;
					giganewton=(edtValue)*0.0000044482;
					meganewton=(edtValue)*0.0044482216;
					hectonewton=(edtValue)*44.482216153;
					dekanewton=(edtValue)*444.82216153;
					decinewton=(edtValue)*44482.216153;
					centinewton=(edtValue)*444822.16153;
					milinewton=(edtValue)*4448221.6153;
					micronewton=(edtValue)*4448221615.3;
					nanonewton=(edtValue)*4448221615255.0;
					piconewton=(edtValue)*4448221615254772.0;
					femtonewton=(edtValue)*4448221615254771000.0;
					attonewton=(edtValue)*4.448221615E+21;
					dyne=(edtValue)*444822161.53;
					joulepermeter=(edtValue)*4448.2216153;
					joulepercentimeter=(edtValue)*444822.16153;
					tonforceshort=(edtValue)*0.5;
					tonforcelong=(edtValue)*0.4464285714;
					kipforce=(edtValue)*1;
					kilopoundforce=(edtValue)*1;
					poundforce=(edtValue)*1000;
					ounceforce=(edtValue)*16000;
					poundal=(edtValue)*32174.048556;
					poundfootpersquaresecond=(edtValue)*32174.048556;
					pond=(edtValue)*453592.37;
					kilopond=(edtValue)*453.59237;
					break;
					
				case "Kilopound-force- kipf":
					newton=(edtValue)*4448.2216153;
					kilonewton=(edtValue)*4.4482216153;
					gramforce=(edtValue)*453592.37;
					kilogramforce=(edtValue)*453.59237;
					tonforce=(edtValue)*0.45359237;
					exanewton=(edtValue)*4.448221615E-15;
					petanewton=(edtValue)*4.448221615E-12;
					teranewton=(edtValue)*4.448221615E-9;
					giganewton=(edtValue)*0.0000044482;
					meganewton=(edtValue)*0.0044482216;
					hectonewton=(edtValue)*44.482216153;
					dekanewton=(edtValue)*444.82216153;
					decinewton=(edtValue)*44482.216153;
					centinewton=(edtValue)*444822.16153;
					milinewton=(edtValue)*4448221.6153;
					micronewton=(edtValue)*4448221615.3;
					nanonewton=(edtValue)*4448221615255.0;
					piconewton=(edtValue)*4448221615254772.0;
					femtonewton=(edtValue)*4448221615254771000.0;
					attonewton=(edtValue)*4.448221615E+21;
					dyne=(edtValue)*444822161.53;
					joulepermeter=(edtValue)*4448.2216153;
					joulepercentimeter=(edtValue)*444822.16153;
					tonforceshort=(edtValue)*0.5;
					tonforcelong=(edtValue)*0.4464285714;
					kipforce=(edtValue)*1;
					kilopoundforce=(edtValue)*1;
					poundforce=(edtValue)*1000;
					ounceforce=(edtValue)*16000;
					poundal=(edtValue)*32174.048556;
					poundfootpersquaresecond=(edtValue)*32174.048556;
					pond=(edtValue)*453592.37;
					kilopond=(edtValue)*453.59237;
					break;
					
				case "Pound-force - lbf":
					newton=(edtValue)*4.4482216153;
					kilonewton=(edtValue)*0.0044482216;
					gramforce=(edtValue)*453.59237;
					kilogramforce=(edtValue)*0.45359237;
					tonforce=(edtValue)*0.0004535924;
					exanewton=(edtValue)*4.448221615E-18;
					petanewton=(edtValue)*4.448221615E-15;
					teranewton=(edtValue)*4.448221615E-12;
					giganewton=(edtValue)*4.448221615E-9;
					meganewton=(edtValue)*0.0000044482;
					hectonewton=(edtValue)*0.0444822162;
					dekanewton=(edtValue)*0.4448221615;
					decinewton=(edtValue)*44.482216153;
					centinewton=(edtValue)*444.82216153;
					milinewton=(edtValue)*4448.2216153;
					micronewton=(edtValue)*4448221.6153;
					nanonewton=(edtValue)*4448221615.3;
					piconewton=(edtValue)*4448221615255.0;
					femtonewton=(edtValue)*4448221615254771.0;
					attonewton=(edtValue)*4448221615254771700.0;
					dyne=(edtValue)*444822.16153;
					joulepermeter=(edtValue)*4.4482216153;
					joulepercentimeter=(edtValue)*444.82216153;
					tonforceshort=(edtValue)*0.0005;
					tonforcelong=(edtValue)*0.0004464286;
					kipforce=(edtValue)*0.001;
					kilopoundforce=(edtValue)*0.001;
					poundforce=(edtValue)*1;
					ounceforce=(edtValue)*16;
					poundal=(edtValue)*32.174048556;
					poundfootpersquaresecond=(edtValue)*32.174048556;
					pond=(edtValue)*453.59237;
					kilopond=(edtValue)*0.45359237;
					break;
					
				case "Ounce-force - ozf":
					newton=(edtValue)*0.278013851;
					kilonewton=(edtValue)*0.0002780139;
					gramforce=(edtValue)*28.349523125;
					kilogramforce=(edtValue)*0.0283495231;
					tonforce=(edtValue)*0.0000283495;
					exanewton=(edtValue)*2.780138509E-19;
					petanewton=(edtValue)*2.780138509E-16;
					teranewton=(edtValue)*2.780138509E-13;
					giganewton=(edtValue)*2.780138509E-10;
					meganewton=(edtValue)*2.780138509E-7;
					hectonewton=(edtValue)*0.0027801385;
					dekanewton=(edtValue)*0.0278013851;
					decinewton=(edtValue)*2.7801385095;
					centinewton=(edtValue)*27.801385095;
					milinewton=(edtValue)*278.01385095;
					micronewton=(edtValue)*278013.85095;
					nanonewton=(edtValue)*278013850.95;
					piconewton=(edtValue)*278013850953.0;
					femtonewton=(edtValue)*278013850953423.0;
					attonewton=(edtValue)*278013850953423230.0;
					dyne=(edtValue)*27801.385095;
					joulepermeter=(edtValue)*0.278013851;
					joulepercentimeter=(edtValue)*27.801385095;
					tonforceshort=(edtValue)*0.00003125;
					tonforcelong=(edtValue)*0.0000279018;
					kipforce=(edtValue)*0.0000625;
					kilopoundforce=(edtValue)*0.0000625;
					poundforce=(edtValue)*0.0625;
					ounceforce=(edtValue)*1;
					poundal=(edtValue)*2.0108780348;
					poundfootpersquaresecond=(edtValue)*2.0108780348;
					pond=(edtValue)*28.349523125;
					kilopond=(edtValue)*0.0283495231;
					break;
					
					
				case "Poundal - pdl":
					newton=(edtValue)*0.1382549544;
					kilonewton=(edtValue)*0.000138255;
					gramforce=(edtValue)*14.09808185;
					kilogramforce=(edtValue)*0.0140980819;
					tonforce=(edtValue)*0.0000140981;
					exanewton=(edtValue)*1.382549543E-19;
					petanewton=(edtValue)*1.382549543E-16;
					teranewton=(edtValue)*1.382549543E-13;
					giganewton=(edtValue)*1.382549543E-10;
					meganewton=(edtValue)*1.382549543E-7;
					hectonewton=(edtValue)*0.0013825495;
					dekanewton=(edtValue)*0.0138254954;
					decinewton=(edtValue)*1.3825495438;
					centinewton=(edtValue)*13.825495438;
					milinewton=(edtValue)*138.25495438;
					micronewton=(edtValue)*138254.95438;
					nanonewton=(edtValue)*138254954.38;
					piconewton=(edtValue)*138254954376.0;
					femtonewton=(edtValue)*138254954376000.0;
					attonewton=(edtValue)*138254954375999900.0;
					dyne=(edtValue)*13825.495438;
					joulepermeter=(edtValue)*0.1382549544;
					joulepercentimeter=(edtValue)*13.825495438;
					tonforceshort=(edtValue)*0.0000155405;
					tonforcelong=(edtValue)*0.0000138754;
					kipforce=(edtValue)*0.000031081;
					kilopoundforce=(edtValue)*0.000031081;
					poundforce=(edtValue)*0.0310809502;
					ounceforce=(edtValue)*0.4972952027;
					poundal=(edtValue)*1;
					poundfootpersquaresecond=(edtValue)*1;
					pond=(edtValue)*14.09808185;
					kilopond=(edtValue)*0.0140980819;
					break;
					
					
				case "Pound foot/square second - lb*ft/sec²":
					newton=(edtValue)*0.1382549544;
					kilonewton=(edtValue)*0.000138255;
					gramforce=(edtValue)*14.09808185;
					kilogramforce=(edtValue)*0.0140980819;
					tonforce=(edtValue)*0.0000140981;
					exanewton=(edtValue)*1.382549543E-19;
					petanewton=(edtValue)*1.382549543E-16;
					teranewton=(edtValue)*1.382549543E-13;
					giganewton=(edtValue)*1.382549543E-10;
					meganewton=(edtValue)*1.382549543E-7;
					hectonewton=(edtValue)*0.0013825495;
					dekanewton=(edtValue)*0.0138254954;
					decinewton=(edtValue)*1.3825495438;
					centinewton=(edtValue)*13.825495438;
					milinewton=(edtValue)*138.25495438;
					micronewton=(edtValue)*138254.95438;
					nanonewton=(edtValue)*138254954.38;
					piconewton=(edtValue)*138254954376.0;
					femtonewton=(edtValue)*138254954376000.0;
					attonewton=(edtValue)*138254954375999900.0;
					dyne=(edtValue)*13825.495438;
					joulepermeter=(edtValue)*0.1382549544;
					joulepercentimeter=(edtValue)*13.825495438;
					tonforceshort=(edtValue)*0.0000155405;
					tonforcelong=(edtValue)*0.0000138754;
					kipforce=(edtValue)*0.000031081;
					kilopoundforce=(edtValue)*0.000031081;
					poundforce=(edtValue)*0.0310809502;
					ounceforce=(edtValue)*0.4972952027;
					poundal=(edtValue)*1;
					poundfootpersquaresecond=(edtValue)*1;
					pond=(edtValue)*14.09808185;
					kilopond=(edtValue)*0.0140980819;
					break;
					
					
				case "Pond - p":
					newton=(edtValue)*0.00980665;
					kilonewton=(edtValue)*0.0000098067;
					gramforce=(edtValue)*1;
					kilogramforce=(edtValue)*0.001;
					tonforce=(edtValue)*0.000001;
					exanewton=(edtValue)*9.80665E-21;
					petanewton=(edtValue)*9.80665E-18;
					teranewton=(edtValue)*9.80665E-15;
					giganewton=(edtValue)*9.80665E-12;
					meganewton=(edtValue)*9.80665E-9;
					hectonewton=(edtValue)*0.0000980665;
					dekanewton=(edtValue)*0.000980665;
					decinewton=(edtValue)*0.0980665;
					centinewton=(edtValue)*0.980665;
					milinewton=(edtValue)*9.80665;
					micronewton=(edtValue)*9806.65;
					nanonewton=(edtValue)*9806650;
					piconewton=(edtValue)*9806650000.0;
					femtonewton=(edtValue)*9806650000000.0;
					attonewton=(edtValue)*9806650000000272.0;
					dyne=(edtValue)*980.665;
					joulepermeter=(edtValue)*0.00980665;
					joulepercentimeter=(edtValue)*0.980665;
					tonforceshort=(edtValue)*0.0000011023;
					tonforcelong=(edtValue)*9.842065276E-7;
					kipforce=(edtValue)*0.0000022046;
					kilopoundforce=(edtValue)*0.0000022046;
					poundforce=(edtValue)*0.0022046226;
					ounceforce=(edtValue)*0.0352739619;
					poundal=(edtValue)*0.0709316353;
					poundfootpersquaresecond=(edtValue)*0.0709316353;
					pond=(edtValue)*1;
					kilopond=(edtValue)*0.001;
					break;
					
					
				case "Kilopond - kp":
					newton=(edtValue)*9.80665;
					kilonewton=(edtValue)*0.00980665;
					gramforce=(edtValue)*1000;
					kilogramforce=(edtValue)*1;
					tonforce=(edtValue)*0.001;
					exanewton=(edtValue)*9.80665E-18;
					petanewton=(edtValue)*9.80665E-15;
					teranewton=(edtValue)*9.80665E-12;
					giganewton=(edtValue)*9.80665E-9;
					meganewton=(edtValue)*0.0000098067;
					hectonewton=(edtValue)*0.0980665;
					dekanewton=(edtValue)*0.980665;
					decinewton=(edtValue)*98.0665;
					centinewton=(edtValue)*980.665;
					milinewton=(edtValue)*9806.65;
					micronewton=(edtValue)*9806650;
					nanonewton=(edtValue)*9806650000.0;
					piconewton=(edtValue)*9806650000000.0;
					femtonewton=(edtValue)*9806650000000272.0;
					attonewton=(edtValue)*9806650000000272000.0;
					dyne=(edtValue)*980665;
					joulepermeter=(edtValue)*9.80665;
					joulepercentimeter=(edtValue)*980.665;
					tonforceshort=(edtValue)*0.0011023113;
					tonforcelong=(edtValue)*0.0009842065;
					kipforce=(edtValue)*0.0022046226;
					kilopoundforce=(edtValue)*0.0022046226;
					poundforce=(edtValue)*2.2046226219;
					ounceforce=(edtValue)*35.27396195;
					poundal=(edtValue)*70.931635284;
					poundfootpersquaresecond=(edtValue)*70.931635284;
					pond=(edtValue)*1000;
					kilopond=(edtValue)*1;
					break;
					
					
	
				}
					  results.setNewton(newton);
					  results.setKilonewton(kilonewton);
					  results.setGramforce(gramforce);
					  results.setKilogramforce(kilogramforce);
					  results.setTonforce(tonforce);
					  results.setExanewton(exanewton);
					  results.setPetanewton(petanewton);
					  results.setTeranewton(teranewton);
					  results.setGiganewton(giganewton);
					  results.setMeganewton(meganewton);
					  results.setHectonewton(hectonewton);
					  results.setDekanewton(dekanewton);
					  results.setDecinewton(decinewton);
					  results.setCentinewton(centinewton);
					  results.setMilinewton(milinewton);
					  results.setMicronewton(micronewton);
					  results.setNanonewton(nanonewton);
					  results.setPiconewton(piconewton);
					  results.setFemtonewton(femtonewton);
					  results.setAttonewton(attonewton);
					  results.setDyne(dyne);
					  results.setJoulepermeter(joulepermeter);
					  results.setJoulepercentimeter(joulepercentimeter);
					  results.setTonforceshort(tonforceshort);
					  results.setTonforcelong(tonforcelong);
					  results.setKipforce(kipforce);
					  results.setKilopoundforce(kilopoundforce);
					  results.setPoundforce(poundforce);
					  results.setOunceforce(ounceforce);
					  results.setPoundal(poundal);
					  results.setPoundfootpersquaresecond(poundfootpersquaresecond);
					  results.setPond(pond);
					  results.setKilopond(kilopond);

					  converterArray.add(results);
					    return converterArray;
					    
				    }
							
						public class ConversionResults{
							
							private double newton,kilonewton,gramforce,kilogramforce,tonforce,exanewton,petanewton,teranewton,giganewton,meganewton,hectonewton,dekanewton,decinewton,centinewton,milinewton,micronewton,
							nanonewton,piconewton,femtonewton,attonewton,dyne,joulepermeter,joulepercentimeter,tonforceshort,tonforcelong,kipforce,kilopoundforce,poundforce,ounceforce,poundal,poundfootpersquaresecond,pond,kilopond;

							public double getNewton() {
								return newton;
							}

							public void setNewton(double newton) {
								this.newton = newton;
							}

							public double getKilonewton() {
								return kilonewton;
							}

							public void setKilonewton(double kilonewton) {
								this.kilonewton = kilonewton;
							}

							public double getGramforce() {
								return gramforce;
							}

							public void setGramforce(double gramforce) {
								this.gramforce = gramforce;
							}

							public double getKilogramforce() {
								return kilogramforce;
							}

							public void setKilogramforce(double kilogramforce) {
								this.kilogramforce = kilogramforce;
							}

							public double getTonforce() {
								return tonforce;
							}

							public void setTonforce(double tonforce) {
								this.tonforce = tonforce;
							}

							public double getExanewton() {
								return exanewton;
							}

							public void setExanewton(double exanewton) {
								this.exanewton = exanewton;
							}

							public double getPetanewton() {
								return petanewton;
							}

							public void setPetanewton(double petanewton) {
								this.petanewton = petanewton;
							}

							public double getTeranewton() {
								return teranewton;
							}

							public void setTeranewton(double teranewton) {
								this.teranewton = teranewton;
							}

							public double getGiganewton() {
								return giganewton;
							}

							public void setGiganewton(double giganewton) {
								this.giganewton = giganewton;
							}

							public double getMeganewton() {
								return meganewton;
							}

							public void setMeganewton(double meganewton) {
								this.meganewton = meganewton;
							}

							public double getHectonewton() {
								return hectonewton;
							}

							public void setHectonewton(double hectonewton) {
								this.hectonewton = hectonewton;
							}

							public double getDekanewton() {
								return dekanewton;
							}

							public void setDekanewton(double dekanewton) {
								this.dekanewton = dekanewton;
							}

							public double getDecinewton() {
								return decinewton;
							}

							public void setDecinewton(double decinewton) {
								this.decinewton = decinewton;
							}

							public double getCentinewton() {
								return centinewton;
							}

							public void setCentinewton(double centinewton) {
								this.centinewton = centinewton;
							}

							public double getMilinewton() {
								return milinewton;
							}

							public void setMilinewton(double milinewton) {
								this.milinewton = milinewton;
							}

							public double getMicronewton() {
								return micronewton;
							}

							public void setMicronewton(double micronewton) {
								this.micronewton = micronewton;
							}

							public double getNanonewton() {
								return nanonewton;
							}

							public void setNanonewton(double nanonewton) {
								this.nanonewton = nanonewton;
							}

							public double getPiconewton() {
								return piconewton;
							}

							public void setPiconewton(double piconewton) {
								this.piconewton = piconewton;
							}

							public double getFemtonewton() {
								return femtonewton;
							}

							public void setFemtonewton(double femtonewton) {
								this.femtonewton = femtonewton;
							}

							public double getAttonewton() {
								return attonewton;
							}

							public void setAttonewton(double attonewton) {
								this.attonewton = attonewton;
							}

							public double getDyne() {
								return dyne;
							}

							public void setDyne(double dyne) {
								this.dyne = dyne;
							}

							public double getJoulepermeter() {
								return joulepermeter;
							}

							public void setJoulepermeter(double joulepermeter) {
								this.joulepermeter = joulepermeter;
							}

							public double getJoulepercentimeter() {
								return joulepercentimeter;
							}

							public void setJoulepercentimeter(double joulepercentimeter) {
								this.joulepercentimeter = joulepercentimeter;
							}

							public double getTonforceshort() {
								return tonforceshort;
							}

							public void setTonforceshort(double tonforceshort) {
								this.tonforceshort = tonforceshort;
							}

							public double getTonforcelong() {
								return tonforcelong;
							}

							public void setTonforcelong(double tonforcelong) {
								this.tonforcelong = tonforcelong;
							}

							public double getKipforce() {
								return kipforce;
							}

							public void setKipforce(double kipforce) {
								this.kipforce = kipforce;
							}

							public double getKilopoundforce() {
								return kilopoundforce;
							}

							public void setKilopoundforce(double kilopoundforce) {
								this.kilopoundforce = kilopoundforce;
							}

							public double getPoundforce() {
								return poundforce;
							}

							public void setPoundforce(double poundforce) {
								this.poundforce = poundforce;
							}

							public double getOunceforce() {
								return ounceforce;
							}

							public void setOunceforce(double ounceforce) {
								this.ounceforce = ounceforce;
							}

							public double getPoundal() {
								return poundal;
							}

							public void setPoundal(double poundal) {
								this.poundal = poundal;
							}

							public double getPoundfootpersquaresecond() {
								return poundfootpersquaresecond;
							}

							public void setPoundfootpersquaresecond(double poundfootpersquaresecond) {
								this.poundfootpersquaresecond = poundfootpersquaresecond;
							}

							public double getPond() {
								return pond;
							}

							public void setPond(double pond) {
								this.pond = pond;
							}

							public double getKilopond() {
								return kilopond;
							}

							public void setKilopond(double kilopond) {
								this.kilopond = kilopond;
							}
							
							
							
						}
	
	
	

}
