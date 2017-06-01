package com.nineinfosys.basicconverter.Engin;

import java.util.ArrayList;

public class TimeConverter {
	private double second,milisecond,minute,hour,day,week,month,year,decade,century,millennium,microsecond,nanosecond,picosecond,femtosecond,attosecond,shake,monthsynodic,
	yearjulian,yearleap,yeartropical,yearsidereal,daysidereal,hoursidereal,minutesidereal,secondsidereal,fortnight,septennial,octennial,novennial,quindecennial,quinquennial,planktime;
	private double edtValue;
	private String conversionFrom;

			public TimeConverter(String conversionFrom, double edtValue) {
				// TODO Auto-generated constructor stub
				this.conversionFrom = conversionFrom;
				this.edtValue = edtValue;
			}

			public ArrayList<ConversionResults> calculateTimeConversion()
		    {
		    	
				ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
					
				ConversionResults results= new ConversionResults();

				switch(conversionFrom)
				{
				case "Second - s":
					second=(edtValue)*1;
					milisecond=(edtValue)*1000;
					minute=(edtValue)*0.0166666667;
					hour=(edtValue)*0.0002777778;
					day=(edtValue)*0.0000115741;
					week=(edtValue)*0.0000016534;
					month=(edtValue)*3.805175038E-7;
					year=(edtValue)*3.170979198E-8;
					decade=(edtValue)*3.170979198E-9;
					century=(edtValue)*3.170979198E-10;
					millennium=(edtValue)*3.170979198E-11;
					microsecond=(edtValue)*1000000;
					nanosecond=(edtValue)*1000000000;
					picosecond=(edtValue)*1000000000000.0;
					femtosecond=(edtValue)*1000000000000000.0;
					attosecond=(edtValue)*1000000000000000000.0;
					shake=(edtValue)*100000000;
					monthsynodic=(edtValue)*3.919349445E-7;
					yearjulian=(edtValue)*3.168808781E-8;
					yearleap=(edtValue)*3.16231532E-8;
					yeartropical=(edtValue)*3.168876059E-8;
					yearsidereal=(edtValue)*3.168753601E-8;
					daysidereal=(edtValue)*0.0000116058;
					hoursidereal=(edtValue)*0.0002785383;
					minutesidereal=(edtValue)*0.0167122986;
					secondsidereal=(edtValue)*1.0027379155;
					fortnight=(edtValue)*8.267195767E-7;
					septennial=(edtValue)*4.529970283E-9;
					octennial=(edtValue)*3.963723997E-9;
					novennial=(edtValue)*3.52331022E-9;
					quindecennial=(edtValue)*2.113986132E-9;
					quinquennial=(edtValue)*6.341958396E-9;
					planktime=(edtValue)*1.855094832E+43;
					break;
					
				case "Millisecond - ms":
					second=(edtValue)*0.001;
					milisecond=(edtValue)*1;
					minute=(edtValue)*0.0000166667;
					hour=(edtValue)*2.777777777E-7;
					day=(edtValue)*1.157407407E-8;
					week=(edtValue)*1.653439153E-9;
					month=(edtValue)*3.805175038E-10;
					year=(edtValue)*3.170979198E-11;
					decade=(edtValue)*3.170979198E-12;
					century=(edtValue)*3.170979198E-13;
					millennium=(edtValue)*3.170979198E-14;
					microsecond=(edtValue)*1000;
					nanosecond=(edtValue)*1000000;
					picosecond=(edtValue)*1000000000;
					femtosecond=(edtValue)*1000000000000.0;
					attosecond=(edtValue)*1000000000000000.0;
					shake=(edtValue)*100000;
					monthsynodic=(edtValue)*3.919349445E-10;
					yearjulian=(edtValue)*3.168808781E-11;
					yearleap=(edtValue)*3.16231532E-11;
					yeartropical=(edtValue)*3.168876059E-11;
					yearsidereal=(edtValue)*3.168753601E-11;
					daysidereal=(edtValue)*1.160576291E-8;
					hoursidereal=(edtValue)*2.785383098E-7;
					minutesidereal=(edtValue)*0.0000167123;
					secondsidereal=(edtValue)*0.0010027379;
					fortnight=(edtValue)*8.267195767E-10;
					septennial=(edtValue)*4.529970283E-12;
					octennial=(edtValue)*3.963723997E-12;
					novennial=(edtValue)*3.52331022E-12;
					quindecennial=(edtValue)*2.113986132E-12;
					quinquennial=(edtValue)*6.341958396E-12;
					planktime=(edtValue)*1.855094832E+40;
					break;
					
				case "Minute - min":
					second=(edtValue)*60;
					milisecond=(edtValue)*60000;
					minute=(edtValue)*1;
					hour=(edtValue)*0.0166666667;
					day=(edtValue)*0.0006944444;
					week=(edtValue)*0.0000992063;
					month=(edtValue)*0.0000228311;
					year=(edtValue)*0.0000019026;
					decade=(edtValue)*1.902587519E-7;
					century=(edtValue)*1.902587519E-8;
					millennium=(edtValue)*1.902587519E-9;
					microsecond=(edtValue)*60000000;
					nanosecond=(edtValue)*60000000000.0;
					picosecond=(edtValue)*60000000000000.0;
					femtosecond=(edtValue)*60000000000000000.0;
					attosecond=(edtValue)*60000000000000000000.0;
					shake=(edtValue)*6000000000.0;
					monthsynodic=(edtValue)*0.0000235161;
					yearjulian=(edtValue)*0.0000019013;
					yearleap=(edtValue)*0.0000018974;
					yeartropical=(edtValue)*0.0000019013;
					yearsidereal=(edtValue)*0.0000019013;
					daysidereal=(edtValue)*0.0006963458;
					hoursidereal=(edtValue)*0.0167122986;
					minutesidereal=(edtValue)*1.0027379155;
					secondsidereal=(edtValue)*60.164274932;
					fortnight=(edtValue)*0.0000496032;
					septennial=(edtValue)*2.71798217E-7;
					octennial=(edtValue)*2.378234398E-7;
					novennial=(edtValue)*2.113986132E-7;
					quindecennial=(edtValue)*1.268391679E-7;
					quinquennial=(edtValue)*3.805175038E-7;
					planktime=(edtValue)*1.113056899E+45;
					break;
					
				case "Hour - h":
					second=(edtValue)*3600;
					milisecond=(edtValue)*3600000;
					minute=(edtValue)*60;
					hour=(edtValue)*1;
					day=(edtValue)*0.0416666667;
					week=(edtValue)*0.005952381;
					month=(edtValue)*0.001369863;
					year=(edtValue)*0.0001141553;
					decade=(edtValue)*0.0000114155;
					century=(edtValue)*0.0000011416;
					millennium=(edtValue)*1.141552511E-7;
					microsecond=(edtValue)*3600000000.0;
					nanosecond=(edtValue)*3600000000000.0;
					picosecond=(edtValue)*3600000000000000.0;
					femtosecond=(edtValue)*3600000000000000000.0;
					attosecond=(edtValue)*3.6E+21;
					shake=(edtValue)*360000000000.0;
					monthsynodic=(edtValue)*0.0014109658;
					yearjulian=(edtValue)*0.0001140771;
					yearleap=(edtValue)*0.0001138434;
					yeartropical=(edtValue)*0.0001140795;
					yearsidereal=(edtValue)*0.0001140751;
					daysidereal=(edtValue)*0.0417807465;
					hoursidereal=(edtValue)*1.0027379155;
					minutesidereal=(edtValue)*60.164274932;
					secondsidereal=(edtValue)*3609.8564959;
					fortnight=(edtValue)*0.0029761905;
					septennial=(edtValue)*0.0000163079;
					octennial=(edtValue)*0.0000142694;
					novennial=(edtValue)*0.0000126839;
					quindecennial=(edtValue)*0.0000076104;
					quinquennial=(edtValue)*0.0000228311;
					planktime=(edtValue)*6.678341396E+46;
					break;
					
				case "Day - d":
					second=(edtValue)*86400;
					milisecond=(edtValue)*86400000;
					minute=(edtValue)*1440;
					hour=(edtValue)*24;
					day=(edtValue)*1;
					week=(edtValue)*0.1428571429;
					month=(edtValue)*0.0328767123;
					year=(edtValue)*0.002739726;
					decade=(edtValue)*0.0002739726;
					century=(edtValue)*0.0000273973;
					millennium=(edtValue)*0.0000027397;
					microsecond=(edtValue)*86400000000.0;
					nanosecond=(edtValue)*86400000000000.0;
					picosecond=(edtValue)*86400000000000000.0;
					femtosecond=(edtValue)*86400000000000000000.0;
					attosecond=(edtValue)*8.64E+22;
					shake=(edtValue)*8640000000000.0;
					monthsynodic=(edtValue)*0.0338631792;
					yearjulian=(edtValue)*0.0027378508;
					yearleap=(edtValue)*0.0027322404;
					yeartropical=(edtValue)*0.0027379089;
					yearsidereal=(edtValue)*0.0027378031;
					daysidereal=(edtValue)*1.0027379155;
					hoursidereal=(edtValue)*24.065709973;
					minutesidereal=(edtValue)*1443.9425984;
					secondsidereal=(edtValue)*86636.555902;
					fortnight=(edtValue)*0.0714285714;
					septennial=(edtValue)*0.0003913894;
					octennial=(edtValue)*0.0003424658;
					novennial=(edtValue)*0.000304414;
					quindecennial=(edtValue)*0.0001826484;
					quinquennial=(edtValue)*0.0005479452;
					planktime=(edtValue)*1.602801935E+48;
					break;
					
				case "Week - week":
					second=(edtValue)*604800;
					milisecond=(edtValue)*604800000;
					minute=(edtValue)*10080;
					hour=(edtValue)*168;
					day=(edtValue)*7;
					week=(edtValue)*1;
					month=(edtValue)*0.2301369863;
					year=(edtValue)*0.0191780822;
					decade=(edtValue)*0.0019178082;
					century=(edtValue)*0.0001917808;
					millennium=(edtValue)*0.0000191781;
					microsecond=(edtValue)*604800000000.0;
					nanosecond=(edtValue)*604800000000002.0;
					picosecond=(edtValue)*604800000000001700.0;
					femtosecond=(edtValue)*604800000000001700000.0;
					attosecond=(edtValue)*6.048E+23;
					shake=(edtValue)*60480000000000.0;
					monthsynodic=(edtValue)*0.2370422545;
					yearjulian=(edtValue)*0.0191649555;
					yearleap=(edtValue)*0.0191256831;
					yeartropical=(edtValue)*0.0191653624;
					yearsidereal=(edtValue)*0.0191646218;
					daysidereal=(edtValue)*7.0191654087;
					hoursidereal=(edtValue)*168.45996981;
					minutesidereal=(edtValue)*10107.598189;
					secondsidereal=(edtValue)*606455.89131;
					fortnight=(edtValue)*0.5;
					septennial=(edtValue)*0.002739726;
					octennial=(edtValue)*0.0023972603;
					novennial=(edtValue)*0.002130898;
					quindecennial=(edtValue)*0.0012785388;
					quinquennial=(edtValue)*0.0038356164;
					planktime=(edtValue)*1.121961354E+49;
					break;
					
				case "Month - month":
					second=(edtValue)*2628000;
					milisecond=(edtValue)*2628000000.0;
					minute=(edtValue)*43800;
					hour=(edtValue)*730;
					day=(edtValue)*30.416666667;
					week=(edtValue)*4.3452380952;
					month=(edtValue)*1;
					year=(edtValue)*0.0833333333;
					decade=(edtValue)*0.0083333333;
					century=(edtValue)*0.0008333333;
					millennium=(edtValue)*0.0000833333;
					microsecond=(edtValue)*2628000000000.0;
					nanosecond=(edtValue)*2628000000000000.0;
					picosecond=(edtValue)*2628000000000000000.0;
					femtosecond=(edtValue)*2.628E+21;
					attosecond=(edtValue)*2.628E+24;
					shake=(edtValue)*262800000000000.0;
					monthsynodic=(edtValue)*1.0300050343;
					yearjulian=(edtValue)*0.0832762948;
					yearleap=(edtValue)*0.0831056466;
					yeartropical=(edtValue)*0.0832780629;
					yearsidereal=(edtValue)*0.0832748446;
					daysidereal=(edtValue)*30.499944931;
					hoursidereal=(edtValue)*731.99867834;
					minutesidereal=(edtValue)*43919.9207;
					secondsidereal=(edtValue)*2635195.242;
					fortnight=(edtValue)*2.1726190476;
					septennial=(edtValue)*0.0119047619;
					octennial=(edtValue)*0.0104166667;
					novennial=(edtValue)*0.0092592593;
					quindecennial=(edtValue)*0.0055555556;
					quinquennial=(edtValue)*0.0166666667;
					planktime=(edtValue)*4.875189219E+49;
					break;
					
				case "Year - y":
					second=(edtValue)*31536000;
					milisecond=(edtValue)*31536000000.0;
					minute=(edtValue)*525600;
					hour=(edtValue)*8760;
					day=(edtValue)*365;
					week=(edtValue)*52.142857143;
					month=(edtValue)*12;
					year=(edtValue)*1;
					decade=(edtValue)*0.1;
					century=(edtValue)*0.01;
					millennium=(edtValue)*0.001;
					microsecond=(edtValue)*31536000000000.0;
					nanosecond=(edtValue)*31536000000000000.0;
					picosecond=(edtValue)*31536000000000000000.0;
					femtosecond=(edtValue)*3.1536E+22;
					attosecond=(edtValue)*3.153599999E+25;
					shake=(edtValue)*3153600000000000.0;
					monthsynodic=(edtValue)*12.360060412;
					yearjulian=(edtValue)*0.9993155373;
					yearleap=(edtValue)*0.9972677596;
					yeartropical=(edtValue)*0.9993367542;
					yearsidereal=(edtValue)*0.9992981357;
					daysidereal=(edtValue)*365.99933917;
					hoursidereal=(edtValue)*8783.98414;
					minutesidereal=(edtValue)*527039.0484;
					secondsidereal=(edtValue)*31622342.904;
					fortnight=(edtValue)*26.071428571;
					septennial=(edtValue)*0.1428571429;
					octennial=(edtValue)*0.125;
					novennial=(edtValue)*0.1111111111;
					quindecennial=(edtValue)*0.0666666667;
					quinquennial=(edtValue)*0.2;
					planktime=(edtValue)*5.850227063E+50;
					break;
					
				case "Decade - decade":
					second=(edtValue)*315360000;
					milisecond=(edtValue)*315360000000.0;
					minute=(edtValue)*5256000;
					hour=(edtValue)*87600;
					day=(edtValue)*3650;
					week=(edtValue)*521.42857143;
					month=(edtValue)*120;
					year=(edtValue)*10;
					decade=(edtValue)*1;
					century=(edtValue)*0.1;
					millennium=(edtValue)*0.1;
					microsecond=(edtValue)*315360000000000.0;
					nanosecond=(edtValue)*315360000000000000.0;
					picosecond=(edtValue)*315360000000000000000.0;
					femtosecond=(edtValue)*3.1536E+23;
					attosecond=(edtValue)*3.1536E+26;
					shake=(edtValue)*31535999999999996.0;
					monthsynodic=(edtValue)*123.60060412;
					yearjulian=(edtValue)*9.993155373;
					yearleap=(edtValue)*9.9726775956;
					yeartropical=(edtValue)*9.9933675424;
					yearsidereal=(edtValue)*9.9929813565;
					daysidereal=(edtValue)*3659.9933917;
					hoursidereal=(edtValue)*87839.8414;
					minutesidereal=(edtValue)*5270390.484;
					secondsidereal=(edtValue)*316223429.04;
					fortnight=(edtValue)*260.71428571;
					septennial=(edtValue)*1.4285714286;
					octennial=(edtValue)*1.25;
					novennial=(edtValue)*1.1111111111;
					quindecennial=(edtValue)*0.6666666667;
					quinquennial=(edtValue)*2;
					planktime=(edtValue)*5.850227063E+51;
					break;
					
				case "Century - century":
					second=(edtValue)*3153600000.0;
					milisecond=(edtValue)*3153600000000.0;
					minute=(edtValue)*52560000;
					hour=(edtValue)*876000;
					day=(edtValue)*36500;
					week=(edtValue)*5214.2857143;
					month=(edtValue)*1200;
					year=(edtValue)*100;
					decade=(edtValue)*10;
					century=(edtValue)*1;
					millennium=(edtValue)*0.1;
					microsecond=(edtValue)*3153600000000000.0;
					nanosecond=(edtValue)*3153600000000000000.0;
					picosecond=(edtValue)*3.1536E+21;
					femtosecond=(edtValue)*3.1536E+24;
					attosecond=(edtValue)*3.1536E+27;
					shake=(edtValue)*315360000000000000.0;
					monthsynodic=(edtValue)*1236.0060412;
					yearjulian=(edtValue)*99.93155373;
					yearleap=(edtValue)*99.726775956;
					yeartropical=(edtValue)*99.933675424;
					yearsidereal=(edtValue)*99.929813565;
					daysidereal=(edtValue)*36599.933917;
					hoursidereal=(edtValue)*878398.414;
					minutesidereal=(edtValue)*52703904.84;
					secondsidereal=(edtValue)*3162234290.4;
					fortnight=(edtValue)*2607.1428571;
					septennial=(edtValue)*14.285714286;
					octennial=(edtValue)*12.5;
					novennial=(edtValue)*11.111111111;
					quindecennial=(edtValue)*6.6666666667;
					quinquennial=(edtValue)*20;
					planktime=(edtValue)*5.850227063E+52;
					break;
					
				case "Millenium - millenium":
					second=(edtValue)*31536000000.0;
					milisecond=(edtValue)*31536000000000.0;
					minute=(edtValue)*525600000;
					hour=(edtValue)*8760000;
					day=(edtValue)*365000;
					week=(edtValue)*52142.857143;
					month=(edtValue)*12000;
					year=(edtValue)*1000;
					decade=(edtValue)*100;
					century=(edtValue)*10;
					millennium=(edtValue)*1;
					microsecond=(edtValue)*31536000000000000.0;
					nanosecond=(edtValue)*31536000000000000000.0;
					picosecond=(edtValue)*3.1536E+22;
					femtosecond=(edtValue)*3.1536E+25;
					attosecond=(edtValue)*3.1536E+28;
					shake=(edtValue)*3153599999999999500.0;
					monthsynodic=(edtValue)*12360.060412;
					yearjulian=(edtValue)*999.3155373;
					yearleap=(edtValue)*997.26775956;
					yeartropical=(edtValue)*999.33675424;
					yearsidereal=(edtValue)*999.29813565;
					daysidereal=(edtValue)*365999.33917;
					hoursidereal=(edtValue)*8783984.14;
					minutesidereal=(edtValue)*527039048.4;
					secondsidereal=(edtValue)*31622342904.0;
					fortnight=(edtValue)*26071.428571;
					septennial=(edtValue)*142.85714286;
					octennial=(edtValue)*125;
					novennial=(edtValue)*111.11111111;
					quindecennial=(edtValue)*66.666666667;
					quinquennial=(edtValue)*200;
					planktime=(edtValue)*5.850227063E+53;
					break;
					
				case "Microsecond - μs":
					second=(edtValue)*0.000001;
					milisecond=(edtValue)*0.001;
					minute=(edtValue)*1.666666666E-8;
					hour=(edtValue)*2.777777777E-10;
					day=(edtValue)*1.157407407E-11;
					week=(edtValue)*1.653439153E-12;
					month=(edtValue)*3.805175038E-13;
					year=(edtValue)*3.170979198E-14;
					decade=(edtValue)*3.170979198E-15;
					century=(edtValue)*3.170979198E-16;
					millennium=(edtValue)*3.170979198E-17;
					microsecond=(edtValue)*1;
					nanosecond=(edtValue)*1000;
					picosecond=(edtValue)*1000000;
					femtosecond=(edtValue)*1000000000;
					attosecond=(edtValue)*1000000000000.0;
					shake=(edtValue)*100;
					monthsynodic=(edtValue)*3.919349445E-13;
					yearjulian=(edtValue)*3.168808781E-14;
					yearleap=(edtValue)*3.16231532E-14;
					yeartropical=(edtValue)*3.168876059E-14;
					yearsidereal=(edtValue)*3.168753601E-14;
					daysidereal=(edtValue)*1.160576291E-11;
					hoursidereal=(edtValue)*2.785383098E-10;
					minutesidereal=(edtValue)*1.671229859E-8;
					secondsidereal=(edtValue)*0.0000010027;
					fortnight=(edtValue)*8.267195767E-13;
					septennial=(edtValue)*4.529970283E-15;
					octennial=(edtValue)*3.963723997E-15;
					novennial=(edtValue)*3.52331022E-15;
					quindecennial=(edtValue)*2.113986132E-15;
					quinquennial=(edtValue)*6.341958396E-15;
					planktime=(edtValue)*1.855094832E+37;
					break;
					
				case "Nanosecond - ns":
					second=(edtValue)*1.E-9;
					milisecond=(edtValue)*0.000001;
					minute=(edtValue)*1.666666666E-11;
					hour=(edtValue)*2.777777777E-13;
					day=(edtValue)*1.157407407E-14;
					week=(edtValue)*1.653439153E-15;
					month=(edtValue)*3.805175038E-16;
					year=(edtValue)*3.170979198E-17;
					decade=(edtValue)*3.170979198E-18;
					century=(edtValue)*3.170979198E-19;
					millennium=(edtValue)*3.170979198E-20;
					microsecond=(edtValue)*0.001;
					nanosecond=(edtValue)*1;
					picosecond=(edtValue)*1000;
					femtosecond=(edtValue)*1000000;
					attosecond=(edtValue)*1000000000;
					shake=(edtValue)*0.1;
					monthsynodic=(edtValue)*3.919349445E-16;
					yearjulian=(edtValue)*3.168808781E-17;
					yearleap=(edtValue)*3.16231532E-17;
					yeartropical=(edtValue)*3.168876059E-17;
					yearsidereal=(edtValue)*3.168753601E-17;
					daysidereal=(edtValue)*1.160576291E-14;
					hoursidereal=(edtValue)*2.785383098E-13;
					minutesidereal=(edtValue)*1.671229859E-11;
					secondsidereal=(edtValue)*1.002737915E-9;
					fortnight=(edtValue)*8.267195767E-16;
					septennial=(edtValue)*4.529970283E-18;
					octennial=(edtValue)*3.963723997E-18;
					novennial=(edtValue)*3.52331022E-18;
					quindecennial=(edtValue)*2.113986132E-18;
					quinquennial=(edtValue)*6.341958396E-18;
					planktime=(edtValue)*1.855094832E+34;
					break;
					
				case "Picosecond - ps":
					second=(edtValue)*1.E-12;
					milisecond=(edtValue)*1.E-9;
					minute=(edtValue)*1.666666666E-14;
					hour=(edtValue)*2.777777777E-16;
					day=(edtValue)*1.157407407E-17;
					week=(edtValue)*1.653439153E-18;
					month=(edtValue)*3.805175038E-19;
					year=(edtValue)*3.170979198E-20;
					decade=(edtValue)*3.170979198E-21;
					century=(edtValue)*3.170979198E-22;
					millennium=(edtValue)*3.170979198E-23;
					microsecond=(edtValue)*0.000001;
					nanosecond=(edtValue)*0.001;
					picosecond=(edtValue)*1;
					femtosecond=(edtValue)*1000;
					attosecond=(edtValue)*1000000;
					shake=(edtValue)*0.0001;
					monthsynodic=(edtValue)*3.919349445E-19;
					yearjulian=(edtValue)*3.168808781E-20;
					yearleap=(edtValue)*3.16231532E-20;
					yeartropical=(edtValue)*3.168876059E-20;
					yearsidereal=(edtValue)*3.168753601E-20;
					daysidereal=(edtValue)*1.160576291E-17;
					hoursidereal=(edtValue)*2.785383098E-16;
					minutesidereal=(edtValue)*1.671229859E-14;
					secondsidereal=(edtValue)*1.002737915E-12;
					fortnight=(edtValue)*8.267195767E-19;
					septennial=(edtValue)*4.529970283E-21;
					octennial=(edtValue)*3.963723997E-21;
					novennial=(edtValue)*3.52331022E-21;
					quindecennial=(edtValue)*2.113986132E-21;
					quinquennial=(edtValue)*6.341958396E-21;
					planktime=(edtValue)*1.855094832E+31;
					break;
					
				case "Femtosecond - fs":
					second=(edtValue)*9.999999999E-16;
					milisecond=(edtValue)*1.E-12;
					minute=(edtValue)*1.666666666E-17;
					hour=(edtValue)*2.777777777E-19;
					day=(edtValue)*1.157407407E-20;
					week=(edtValue)*1.653439153E-21;
					month=(edtValue)*3.805175038E-22;
					year=(edtValue)*3.170979198E-23;
					decade=(edtValue)*3.170979198E-24;
					century=(edtValue)*3.170979198E-25;
					millennium=(edtValue)*3.170979198E-26;
					microsecond=(edtValue)*9.999999999E-10;
					nanosecond=(edtValue)*9.999999999E-10;
					picosecond=(edtValue)*0.001;
					femtosecond=(edtValue)*1;
					attosecond=(edtValue)*1000;
					shake=(edtValue)*1.E-7;
					monthsynodic=(edtValue)*3.919349445E-22;
					yearjulian=(edtValue)*3.168808781E-23;
					yearleap=(edtValue)*3.16231532E-23;
					yeartropical=(edtValue)*3.168876059E-23;
					yearsidereal=(edtValue)*3.168753601E-23;
					daysidereal=(edtValue)*1.160576291E-20;
					hoursidereal=(edtValue)*2.785383098E-19;
					minutesidereal=(edtValue)*1.671229859E-17;
					secondsidereal=(edtValue)*1.002737915E-15;
					fortnight=(edtValue)*8.267195767E-22;
					septennial=(edtValue)*4.529970283E-24;
					octennial=(edtValue)*3.963723997E-24;
					novennial=(edtValue)*3.52331022E-24;
					quindecennial=(edtValue)*2.113986132E-24;
					quinquennial=(edtValue)*6.341958396E-24;
					planktime=(edtValue)*1.855094832E+28;
					break;
					
				case "Attosecond - as":
					second=(edtValue)*1.E-18;
					milisecond=(edtValue)*1.E-15;
					minute=(edtValue)*1.666666666E-20;
					hour=(edtValue)*2.777777777E-22;
					day=(edtValue)*1.157407407E-23;
					week=(edtValue)*1.653439153E-24;
					month=(edtValue)*3.805175038E-25;
					year=(edtValue)*3.170979198E-26;
					decade=(edtValue)*3.170979198E-27;
					century=(edtValue)*3.170979198E-28;
					millennium=(edtValue)*3.170979198E-29;
					microsecond=(edtValue)*1.E-12;
					nanosecond=(edtValue)*1.E-9;
					picosecond=(edtValue)*0.000001;
					femtosecond=(edtValue)*0.001;
					attosecond=(edtValue)*1;
					shake=(edtValue)*9.999999999E-11;
					monthsynodic=(edtValue)*3.919349445E-25;
					yearjulian=(edtValue)*3.168808781E-26;
					yearleap=(edtValue)*3.16231532E-26;
					yeartropical=(edtValue)*3.168876059E-26;
					yearsidereal=(edtValue)*3.168753601E-26;
					daysidereal=(edtValue)*1.160576291E-23;
					hoursidereal=(edtValue)*2.785383098E-22;
					minutesidereal=(edtValue)*1.671229859E-20;
					secondsidereal=(edtValue)*1.002737915E-18;
					fortnight=(edtValue)*8.267195767E-25;
					septennial=(edtValue)*4.529970283E-27;
					octennial=(edtValue)*3.963723997E-27;
					novennial=(edtValue)*3.52331022E-27;
					quindecennial=(edtValue)*2.113986132E-27;
					quinquennial=(edtValue)*6.341958396E-27;
					planktime=(edtValue)*1.855094832E+25;
					break;
					
				case "Shake - shake":
					second=(edtValue)*1.E-8;
					milisecond=(edtValue)*0.00001;
					minute=(edtValue)*1.666666666E-10;
					hour=(edtValue)*2.777777777E-12;
					day=(edtValue)*1.157407407E-13;
					week=(edtValue)*1.653439153E-14;
					month=(edtValue)*3.805175038E-15;
					year=(edtValue)*3.170979198E-16;
					decade=(edtValue)*3.170979198E-17;
					century=(edtValue)*3.170979198E-18;
					millennium=(edtValue)*3.170979198E-19;
					microsecond=(edtValue)*0.01;
					nanosecond=(edtValue)*10;
					picosecond=(edtValue)*10000;
					femtosecond=(edtValue)*10000000;
					attosecond=(edtValue)*10000000000.0;
					shake=(edtValue)*1;
					monthsynodic=(edtValue)*3.919349445E-15;
					yearjulian=(edtValue)*3.168808781E-16;
					yearleap=(edtValue)*3.16231532E-16;
					yeartropical=(edtValue)*3.168876059E-16;
					yearsidereal=(edtValue)*3.168753601E-16;
					daysidereal=(edtValue)*1.160576291E-13;
					hoursidereal=(edtValue)*2.785383098E-12;
					minutesidereal=(edtValue)*1.671229859E-10;
					secondsidereal=(edtValue)*1.002737915E-8;
					fortnight=(edtValue)*8.267195767E-15;
					septennial=(edtValue)*4.529970283E-17;
					octennial=(edtValue)*3.963723997E-17;
					novennial=(edtValue)*3.52331022E-17;
					quindecennial=(edtValue)*2.113986132E-17;
					quinquennial=(edtValue)*6.341958396E-17;
					planktime=(edtValue)*1.855094832E+35;
					break;
					
				case "Month(Synodic) - month":
					second=(edtValue)*2551443.84;
					milisecond=(edtValue)*2551443840.0;
					minute=(edtValue)*42524.064;
					hour=(edtValue)*708.7344;
					day=(edtValue)*29.5306;
					week=(edtValue)*4.2186571429;
					month=(edtValue)*0.9708690411;
					year=(edtValue)*0.0809057534;
					decade=(edtValue)*0.0080905753;
					century=(edtValue)*0.0008090575;
					millennium=(edtValue)*0.0000809058;
					microsecond=(edtValue)*2551443840000.0;
					nanosecond=(edtValue)*2551443839999941.0;
					picosecond=(edtValue)*2551443839999940600.0;
					femtosecond=(edtValue)*2.551443839E+21;
					attosecond=(edtValue)*2.551443839E+24;
					shake=(edtValue)*255144383999994.0;
					monthsynodic=(edtValue)*1;
					yearjulian=(edtValue)*0.0808503765;
					yearleap=(edtValue)*0.0806846995;
					yeartropical=(edtValue)*0.080852093;
					yearsidereal=(edtValue)*0.0808489686;
					daysidereal=(edtValue)*29.611452288;
					hoursidereal=(edtValue)*710.67485492;
					minutesidereal=(edtValue)*42640.491295;
					secondsidereal=(edtValue)*2558429.4777;
					fortnight=(edtValue)*2.1093285714;
					septennial=(edtValue)*0.0115579648;
					octennial=(edtValue)*0.0101132192;
					novennial=(edtValue)*0.0089895282;
					quindecennial=(edtValue)*0.0053937169;
					quinquennial=(edtValue)*0.0161811507;
					planktime=(edtValue)*4.733170282E+49;
					break;
					
				case "Year(Julian) - y":
					second=(edtValue)*31557600;
					milisecond=(edtValue)*31557600000.0;
					minute=(edtValue)*525960;
					hour=(edtValue)*8766;
					day=(edtValue)*365.25;
					week=(edtValue)*52.178571429;
					month=(edtValue)*12.008219178;
					year=(edtValue)*1.0006849315;
					decade=(edtValue)*0.1000684932;
					century=(edtValue)*0.0100068493;
					millennium=(edtValue)*0.0010006849;
					microsecond=(edtValue)*31557600000000.0;
					nanosecond=(edtValue)*31557599999999904.0;
					picosecond=(edtValue)*31557599999999900000.0;
					femtosecond=(edtValue)*3.155759999E+22;
					attosecond=(edtValue)*3.155759999E+25;
					shake=(edtValue)*3155759999999990.0;
					monthsynodic=(edtValue)*12.368526207;
					yearjulian=(edtValue)*1;
					yearleap=(edtValue)*0.9979508197;
					yeartropical=(edtValue)*1.0000212315;
					yearsidereal=(edtValue)*0.9999825864;
					daysidereal=(edtValue)*366.25002365;
					hoursidereal=(edtValue)*8790.0005675;
					minutesidereal=(edtValue)*527400.03405;
					secondsidereal=(edtValue)*31644002.043;
					fortnight=(edtValue)*26.089285714;
					septennial=(edtValue)*0.1429549902;
					octennial=(edtValue)*0.1250856164;
					novennial=(edtValue)*0.1111872146;
					quindecennial=(edtValue)*0.0667123288;
					quinquennial=(edtValue)*0.2001369863;
					planktime=(edtValue)*5.854234068E+50;
					break;
					
			
				case "Year(leap) - y":
					second=(edtValue)*31622400;
					milisecond=(edtValue)*31622400000.0;
					minute=(edtValue)*527040;
					hour=(edtValue)*8784;
					day=(edtValue)*366;
					week=(edtValue)*52.285714286;
					month=(edtValue)*12.032876712;
					year=(edtValue)*1.002739726;
					decade=(edtValue)*0.1002739726;
					century=(edtValue)*0.0100273973;
					millennium=(edtValue)*0.0010027397;
					microsecond=(edtValue)*31622400000000.0;
					nanosecond=(edtValue)*31622400000000050.0;
					picosecond=(edtValue)*31622400000000050000.0;
					femtosecond=(edtValue)*3.16224E+22;
					attosecond=(edtValue)*3.16224E+25;
					shake=(edtValue)*3162240000000005.0;
					monthsynodic=(edtValue)*12.393923591;
					yearjulian=(edtValue)*1.0020533881;
					yearleap=(edtValue)*1;
					yeartropical=(edtValue)*1.0020746632;
					yearsidereal=(edtValue)*1.0020359388;
					daysidereal=(edtValue)*367.00207708;
					hoursidereal=(edtValue)*8808.04985;
					minutesidereal=(edtValue)*528482.991;
					secondsidereal=(edtValue)*31708979.46;
					fortnight=(edtValue)*26.142857143;
					septennial=(edtValue)*0.1432485323;
					octennial=(edtValue)*0.1253424658;
					novennial=(edtValue)*0.1114155251;
					quindecennial=(edtValue)*0.0668493151;
					quinquennial=(edtValue)*0.2005479452;
					planktime=(edtValue)*5.866255082E+50;
					break;
					
				case "Year(tropical) - y":
					second=(edtValue)*31556930;
					milisecond=(edtValue)*31556930000.0;
					minute=(edtValue)*525948.83333;
					hour=(edtValue)*8765.8138889;
					day=(edtValue)*365.24224537;
					week=(edtValue)*52.177463624;
					month=(edtValue)*12.007964231;
					year=(edtValue)*1.0006636859;
					decade=(edtValue)*0.1000663686;
					century=(edtValue)*0.0100066369;
					millennium=(edtValue)*0.0010006637;
					microsecond=(edtValue)*31556930000000.0;
					nanosecond=(edtValue)*31556929999999972.0;
					picosecond=(edtValue)*31556929999999975000.0;
					femtosecond=(edtValue)*3.155692999E+22;
					attosecond=(edtValue)*3.155692999E+25;
					shake=(edtValue)*3155692999999997.0;
					monthsynodic=(edtValue)*12.36826361;
					yearjulian=(edtValue)*0.999978769;
					yearleap=(edtValue)*0.9979296322;
					yeartropical=(edtValue)*1;
					yearsidereal=(edtValue)*0.9999613558;
					daysidereal=(edtValue)*366.24224779;
					hoursidereal=(edtValue)*8789.8139469;
					minutesidereal=(edtValue)*527388.83681;
					secondsidereal=(edtValue)*31643330.209;
					fortnight=(edtValue)*26.088731812;
					septennial=(edtValue)*0.1429519551;
					octennial=(edtValue)*0.1250829607;
					novennial=(edtValue)*0.111184854;
					quindecennial=(edtValue)*0.0667109124;
					quinquennial=(edtValue)*0.2001327372;
					planktime=(edtValue)*5.854109777E+50;
					break;
					
				case "Year(sidereal) - y":
					second=(edtValue)*31558149.54;
					milisecond=(edtValue)*31558149540.0;
					minute=(edtValue)*525969.159;
					hour=(edtValue)*8766.15265;
					day=(edtValue)*365.25636042;
					week=(edtValue)*52.17948006;
					month=(edtValue)*12.008428288;
					year=(edtValue)*1.0007023573;
					decade=(edtValue)*0.1000702357;
					century=(edtValue)*0.0100070236;
					millennium=(edtValue)*0.0010007024;
					microsecond=(edtValue)*31558149540000.0;
					nanosecond=(edtValue)*31558149540000172.0;
					picosecond=(edtValue)*31558149540000174000.0;
					femtosecond=(edtValue)*3.155814954E+22;
					attosecond=(edtValue)*3.155814954E+25;
					shake=(edtValue)*3155814954000017.0;
					monthsynodic=(edtValue)*12.368741591;
					yearjulian=(edtValue)*1.0000174139;
					yearleap=(edtValue)*0.9979681979;
					yeartropical=(edtValue)*1.0000386457;
					yearsidereal=(edtValue)*1;
					daysidereal=(edtValue)*366.25640148;
					hoursidereal=(edtValue)*8790.1536355;
					minutesidereal=(edtValue)*527409.21813;
					secondsidereal=(edtValue)*31644553.088;
					fortnight=(edtValue)*26.08974003;
					septennial=(edtValue)*0.1429574796;
					octennial=(edtValue)*0.1250877947;
					novennial=(edtValue)*0.1111891508;
					quindecennial=(edtValue)*0.0667134905;
					quinquennial=(edtValue)*0.2001404715;
					planktime=(edtValue)*5.854336013E+50;
					break;
					
				case "Day(sidereal) - d":
					second=(edtValue)*86164.09;
					milisecond=(edtValue)*86164090;
					minute=(edtValue)*1436.0681667;
					hour=(edtValue)*23.934469444;
					day=(edtValue)*0.9972695602;
					week=(edtValue)*0.14246708;
					month=(edtValue)*0.0327869444;
					year=(edtValue)*0.0027322454;
					decade=(edtValue)*0.0002732245;
					century=(edtValue)*0.0000273225;
					millennium=(edtValue)*0.0000027322;
					microsecond=(edtValue)*86164090000.0;
					nanosecond=(edtValue)*86164090000000.0;
					picosecond=(edtValue)*86164089999999970.0;
					femtosecond=(edtValue)*86164089999999960000.0;
					attosecond=(edtValue)*8.616408999E+22;
					shake=(edtValue)*8616409000000.0;
					monthsynodic=(edtValue)*0.0337707178;
					yearjulian=(edtValue)*0.0027303753;
					yearleap=(edtValue)*0.0027247802;
					yeartropical=(edtValue)*0.0027304332;
					yearsidereal=(edtValue)*0.0027303277;
					daysidereal=(edtValue)*1;
					hoursidereal=(edtValue)*24;
					minutesidereal=(edtValue)*1440;
					secondsidereal=(edtValue)*86400;
					fortnight=(edtValue)*0.07123354;
					septennial=(edtValue)*0.0003903208;
					octennial=(edtValue)*0.0003415307;
					novennial=(edtValue)*0.0003035828;
					quindecennial=(edtValue)*0.0001821497;
					quinquennial=(edtValue)*0.0005464491;
					planktime=(edtValue)*1.598425581E+48;
					break;
					
				case "Hour(sidereal) - h":
					second=(edtValue)*3590.1704167;
					milisecond=(edtValue)*3590170.4167;
					minute=(edtValue)*59.836173611;
					hour=(edtValue)*0.9972695602;
					day=(edtValue)*0.0415528983;
					week=(edtValue)*0.0059361283;
					month=(edtValue)*0.0013661227;
					year=(edtValue)*0.0001138436;
					decade=(edtValue)*0.0000113844;
					century=(edtValue)*0.0000011384;
					millennium=(edtValue)*1.13843557E-7;
					microsecond=(edtValue)*3590170416.7;
					nanosecond=(edtValue)*3590170416667.0;
					picosecond=(edtValue)*3590170416666682.0;
					femtosecond=(edtValue)*3590170416666681300.0;
					attosecond=(edtValue)*3.590170416E+21;
					shake=(edtValue)*359017041667.0;
					monthsynodic=(edtValue)*0.0014071132;
					yearjulian=(edtValue)*0.0001137656;
					yearleap=(edtValue)*0.0001135325;
					yeartropical=(edtValue)*0.0001137681;
					yearsidereal=(edtValue)*0.0001137637;
					daysidereal=(edtValue)*0.0416666667;
					hoursidereal=(edtValue)*1;
					minutesidereal=(edtValue)*60;
					secondsidereal=(edtValue)*3600;
					fortnight=(edtValue)*0.0029680642;
					septennial=(edtValue)*0.0000162634;
					octennial=(edtValue)*0.0000142304;
					novennial=(edtValue)*0.0000126493;
					quindecennial=(edtValue)*0.0000075896;
					quinquennial=(edtValue)*0.0000227687;
					planktime=(edtValue)*6.660106587E+46;
					break;
					
				case "Minute(sidereal) - min":
					second=(edtValue)*59.836173611;
					milisecond=(edtValue)*59836.173611;
					minute=(edtValue)*0.9972695602;
					hour=(edtValue)*0.0166211593;
					day=(edtValue)*0.0006925483;
					week=(edtValue)*0.0000989355;
					month=(edtValue)*0.0000227687;
					year=(edtValue)*0.0000018974;
					decade=(edtValue)*1.897392618E-7;
					century=(edtValue)*1.897392618E-8;
					millennium=(edtValue)*1.897392618E-9;
					microsecond=(edtValue)*59836173.611;
					nanosecond=(edtValue)*59836173611.0;
					picosecond=(edtValue)*59836173611111.0;
					femtosecond=(edtValue)*59836173611110904.0;
					attosecond=(edtValue)*59836173611110900000.0;
					shake=(edtValue)*5983617361.1;
					monthsynodic=(edtValue)*0.0000234519;
					yearjulian=(edtValue)*0.0000018961;
					yearleap=(edtValue)*0.0000018922;
					yeartropical=(edtValue)*0.0000018961;
					yearsidereal=(edtValue)*0.0000018961;
					daysidereal=(edtValue)*0.0006944444;
					hoursidereal=(edtValue)*0.0166666667;
					minutesidereal=(edtValue)*1;
					secondsidereal=(edtValue)*60;
					fortnight=(edtValue)*0.0000494677;
					septennial=(edtValue)*2.710560883E-7;
					octennial=(edtValue)*2.371740772E-7;
					novennial=(edtValue)*2.10821402E-7;
					quindecennial=(edtValue)*1.264928412E-7;
					quinquennial=(edtValue)*3.794785236E-7;
					planktime=(edtValue)*1.110017764E+45;
					break;
					
				case "Second(sidereal) - s":
					second=(edtValue)*0.9972695602;
					milisecond=(edtValue)*997.26956019;
					minute=(edtValue)*0.0166211593;
					hour=(edtValue)*0.0002770193;
					day=(edtValue)*0.0000115425;
					week=(edtValue)*0.0000016489;
					month=(edtValue)*3.794785236E-7;
					year=(edtValue)*3.16232103E-8;
					decade=(edtValue)*3.16232103E-9;
					century=(edtValue)*3.16232103E-10;
					millennium=(edtValue)*3.16232103E-11;
					microsecond=(edtValue)*997269.56019;
					nanosecond=(edtValue)*997269560.19;
					picosecond=(edtValue)*997269560185.0;
					femtosecond=(edtValue)*997269560185188.0;
					attosecond=(edtValue)*997269560185188000.0;
					shake=(edtValue)*99726956.019;
					monthsynodic=(edtValue)*3.908647897E-7;
					yearjulian=(edtValue)*3.160156539E-8;
					yearleap=(edtValue)*3.153680809E-8;
					yeartropical=(edtValue)*3.160223634E-8;
					yearsidereal=(edtValue)*3.16010151E-8;
					daysidereal=(edtValue)*0.0000115741;
					hoursidereal=(edtValue)*0.0002777778;
					minutesidereal=(edtValue)*0.0166666667;
					secondsidereal=(edtValue)*1;
					fortnight=(edtValue)*8.244622686E-7;
					septennial=(edtValue)*4.517601472E-9;
					octennial=(edtValue)*3.952901288E-9;
					novennial=(edtValue)*3.513690033E-9;
					quindecennial=(edtValue)*2.10821402E-9;
					quinquennial=(edtValue)*6.324642061E-9;
					planktime=(edtValue)*1.850029607E+43;
					break;
					
				case "Fortnight - f":
					second=(edtValue)*1209600;
					milisecond=(edtValue)*1209600000;
					minute=(edtValue)*20160;
					hour=(edtValue)*336;
					day=(edtValue)*14;
					week=(edtValue)*2;
					month=(edtValue)*0.4602739726;
					year=(edtValue)*0.0383561644;
					decade=(edtValue)*0.0038356164;
					century=(edtValue)*0.0003835616;
					millennium=(edtValue)*0.0000383562;
					microsecond=(edtValue)*1209600000000.0;
					nanosecond=(edtValue)*1209599999999980.0;
					picosecond=(edtValue)*1209599999999980300.0;
					femtosecond=(edtValue)*1.209599999E+21;
					attosecond=(edtValue)*1.209599999E+24;
					shake=(edtValue)*120959999999998.0;
					monthsynodic=(edtValue)*0.474084509;
					yearjulian=(edtValue)*0.038329911;
					yearleap=(edtValue)*0.0382513661;
					yeartropical=(edtValue)*0.0383307248;
					yearsidereal=(edtValue)*0.0383292436;
					daysidereal=(edtValue)*14.038330817;
					hoursidereal=(edtValue)*336.91993962;
					minutesidereal=(edtValue)*20215.196377;
					secondsidereal=(edtValue)*1212911.7826;
					fortnight=(edtValue)*1;
					septennial=(edtValue)*0.0054794521;
					octennial=(edtValue)*0.0047945205;
					novennial=(edtValue)*0.004261796;
					quindecennial=(edtValue)*0.0025570776;
					quinquennial=(edtValue)*0.0076712329;
					planktime=(edtValue)*2.243922709E+49;
					break;
					
				case "Septennial - s":
					second=(edtValue)*220752000;
					milisecond=(edtValue)*220752000000.0;
					minute=(edtValue)*3679200;
					hour=(edtValue)*61320;
					day=(edtValue)*2555;
					week=(edtValue)*365;
					month=(edtValue)*84;
					year=(edtValue)*7;
					decade=(edtValue)*0.7;
					century=(edtValue)*0.07;
					millennium=(edtValue)*0.007;
					microsecond=(edtValue)*220752000000004.0;
					nanosecond=(edtValue)*220752000000004400.0;
					picosecond=(edtValue)*220752000000004420000.0;
					femtosecond=(edtValue)*2.20752E+23;
					attosecond=(edtValue)*2.20752E+26;
					shake=(edtValue)*22075200000000440.0;
					monthsynodic=(edtValue)*86.520422883;
					yearjulian=(edtValue)*6.9952087611;
					yearleap=(edtValue)*6.9808743169;
					yeartropical=(edtValue)*6.9953572797;
					yearsidereal=(edtValue)*6.9950869496;
					daysidereal=(edtValue)*2561.9953742;
					hoursidereal=(edtValue)*61487.88898;
					minutesidereal=(edtValue)*3689273.3388;
					secondsidereal=(edtValue)*221356400.33;
					fortnight=(edtValue)*182.5;
					septennial=(edtValue)*1;
					octennial=(edtValue)*0.875;
					novennial=(edtValue)*0.7777777778;
					quindecennial=(edtValue)*0.4666666667;
					quinquennial=(edtValue)*1.4;
					planktime=(edtValue)*4.095158944E+51;
					break;
					
				case "Octennial - o":
					second=(edtValue)*252288000;
					milisecond=(edtValue)*252288000000.0;
					minute=(edtValue)*4204800;
					hour=(edtValue)*70080;
					day=(edtValue)*2920;
					week=(edtValue)*417.14285714;
					month=(edtValue)*96;
					year=(edtValue)*8;
					decade=(edtValue)*0.8;
					century=(edtValue)*0.08;
					millennium=(edtValue)*0.008;
					microsecond=(edtValue)*252288000000000.0;
					nanosecond=(edtValue)*252288000000000000.0;
					picosecond=(edtValue)*252288000000000000000.0;
					femtosecond=(edtValue)*2.52288E+23;
					attosecond=(edtValue)*2.522879999E+26;
					shake=(edtValue)*25228799999999996.0;
					monthsynodic=(edtValue)*98.880483295;
					yearjulian=(edtValue)*7.9945242984;
					yearleap=(edtValue)*7.9781420765;
					yeartropical=(edtValue)*7.9946940339;
					yearsidereal=(edtValue)*7.9943850852;
					daysidereal=(edtValue)*2927.9947133;
					hoursidereal=(edtValue)*70271.87312;
					minutesidereal=(edtValue)*4216312.3872;
					secondsidereal=(edtValue)*252978743.23;
					fortnight=(edtValue)*208.57142857;
					septennial=(edtValue)*1.1428571429;
					octennial=(edtValue)*1;
					novennial=(edtValue)*0.8888888889;
					quindecennial=(edtValue)*0.5333333333;
					quinquennial=(edtValue)*1.6;
					planktime=(edtValue)*4.68018165E+51;
					break;
					
				case "Novennial - n":
					second=(edtValue)*283824000;
					milisecond=(edtValue)*283824000000.0;
					minute=(edtValue)*4730400.0;
					hour=(edtValue)*78840;
					day=(edtValue)*3285;
					week=(edtValue)*469.28571429;
					month=(edtValue)*108;
					year=(edtValue)*9;
					decade=(edtValue)*0.9;
					century=(edtValue)*0.9;
					millennium=(edtValue)*0.009;
					microsecond=(edtValue)*283824000000003.0;
					nanosecond=(edtValue)*283824000000002850.0;
					picosecond=(edtValue)*283824000000002850000.0;
					femtosecond=(edtValue)*2.83824E+23;
					attosecond=(edtValue)*2.83824E+26;
					shake=(edtValue)*28382400000000280.0;
					monthsynodic=(edtValue)*111.24054371;
					yearjulian=(edtValue)*8.9938398357;
					yearleap=(edtValue)*8.9754098361;
					yeartropical=(edtValue)*8.9940307882;
					yearsidereal=(edtValue)*8.9936832209;
					daysidereal=(edtValue)*3293.9940525;
					hoursidereal=(edtValue)*79055.85726;
					minutesidereal=(edtValue)*4743351.4356;
					secondsidereal=(edtValue)*284601086.14;
					fortnight=(edtValue)*234.64285714;
					septennial=(edtValue)*1.2857142857;
					octennial=(edtValue)*1.125;
					novennial=(edtValue)*1;
					quindecennial=(edtValue)*0.6;
					quinquennial=(edtValue)*1.8;
					planktime=(edtValue)*5.265204357E+51;
					break;
					
				case "Quindecennial - q":
					second=(edtValue)*473040000;
					milisecond=(edtValue)*473040000000.0;
					minute=(edtValue)*7884000;
					hour=(edtValue)*131400;
					day=(edtValue)*5475;
					week=(edtValue)*782.14285714;
					month=(edtValue)*180;
					year=(edtValue)*15;
					decade=(edtValue)*1.5;
					century=(edtValue)*0.15;
					millennium=(edtValue)*0.015;
					microsecond=(edtValue)*473039999999998.0;
					nanosecond=(edtValue)*473039999999997630.0;
					picosecond=(edtValue)*473039999999997640000.0;
					femtosecond=(edtValue)*4.730399999E+23;
					attosecond=(edtValue)*4.730399999E+26;
					shake=(edtValue)*47303999999999760.0;
					monthsynodic=(edtValue)*185.40090618;
					yearjulian=(edtValue)*14.98973306;
					yearleap=(edtValue)*14.959016393;
					yeartropical=(edtValue)*14.990051314;
					yearsidereal=(edtValue)*14.989472035;
					daysidereal=(edtValue)*5489.9900875;
					hoursidereal=(edtValue)*131759.7621;
					minutesidereal=(edtValue)*7905585.726;
					secondsidereal=(edtValue)*474335143.56;
					fortnight=(edtValue)*391.07142857;
					septennial=(edtValue)*2.1428571429;
					octennial=(edtValue)*1.875;
					novennial=(edtValue)*1.6666666667;
					quindecennial=(edtValue)*1;
					quinquennial=(edtValue)*3;
					planktime=(edtValue)*8.775340595E+51;
					break;
					
				case "Quinquennial - q":
					second=(edtValue)*157680000.0;
					milisecond=(edtValue)*157680000000.0;
					minute=(edtValue)*2628000;
					hour=(edtValue)*43800;
					day=(edtValue)*1825;
					week=(edtValue)*260.71428571;
					month=(edtValue)*60;
					year=(edtValue)*5;
					decade=(edtValue)*0.5;
					century=(edtValue)*0.05;
					millennium=(edtValue)*0.005;
					microsecond=(edtValue)*157680000000000.0;
					nanosecond=(edtValue)*157680000000000000.0;
					picosecond=(edtValue)*157680000000000000000.0;
					femtosecond=(edtValue)*1.5768E+23;
					attosecond=(edtValue)*1.5768E+26;
					shake=(edtValue)*15767999999999998.0;
					monthsynodic=(edtValue)*61.80030206;
					yearjulian=(edtValue)*4.9965776865;
					yearleap=(edtValue)*4.9863387978;
					yeartropical=(edtValue)*4.9966837712;
					yearsidereal=(edtValue)*4.9964906783;
					daysidereal=(edtValue)*1829.9966958;
					hoursidereal=(edtValue)*43919.9207;
					minutesidereal=(edtValue)*2635195.242;
					secondsidereal=(edtValue)*158111714.52;
					fortnight=(edtValue)*130.35714286;
					septennial=(edtValue)*0.7142857143;
					octennial=(edtValue)*0.625;
					novennial=(edtValue)*0.5555555556;
					quindecennial=(edtValue)*0.3333333333;
					quinquennial=(edtValue)*1;
					planktime=(edtValue)*2.925113531E+51;
					break;
					
				case "Plank time - pt":
					second=(edtValue)*5.390559999E-44;
					milisecond=(edtValue)*5.390559999E-41;
					minute=(edtValue)*8.984266666E-46;
					hour=(edtValue)*1.497377777E-47;
					day=(edtValue)*6.239074074E-49;
					week=(edtValue)*8.912962962E-50;
					month=(edtValue)*2.051202435E-50;
					year=(edtValue)*1.709335362E-51;
					decade=(edtValue)*1.709335362E-52;
					century=(edtValue)*1.709335362E-53;
					millennium=(edtValue)*1.709335362E-54;
					microsecond=(edtValue)*5.390559999E-38;
					nanosecond=(edtValue)*5.390559999E-35;
					picosecond=(edtValue)*5.390559999E-32;
					femtosecond=(edtValue)*5.390559999E-29;
					attosecond=(edtValue)*5.390559999E-26;
					shake=(edtValue)*5.390559999E-36;
					monthsynodic=(edtValue)*2.112748834E-50;
					yearjulian=(edtValue)*1.708165386E-51;
					yearleap=(edtValue)*1.704665047E-51;
					yeartropical=(edtValue)*1.708201653E-51;
					yearsidereal=(edtValue)*1.708135641E-51;
					daysidereal=(edtValue)*6.256156131E-49;
					hoursidereal=(edtValue)*1.501477471E-47;
					minutesidereal=(edtValue)*9.008864829E-46;
					secondsidereal=(edtValue)*5.405318897E-44;
					fortnight=(edtValue)*4.456481481E-50;
					septennial=(edtValue)*2.441907661E-52;
					octennial=(edtValue)*2.136669203E-52;
					novennial=(edtValue)*1.899261514E-52;
					quindecennial=(edtValue)*1.139556908E-52;
					quinquennial=(edtValue)*3.418670725E-52;
					planktime=(edtValue)*1;
					break;
				}
				
				
					 results.setSecond(second);
					 results.setMilisecond(milisecond);
					 results.setMinute(minute);
					 results.setHour(hour);
					 results.setDay(day);
					 results.setWeek(week);
					 results.setMonth(month);
					 results.setYear(year);
					 results.setDecade(decade);
					 results.setCentury(century);
					 results.setMillennium(millennium);
					 results.setMicrosecond(microsecond);
					 results.setNanosecond(nanosecond);
					 results.setPicosecond(picosecond);
					 results.setFemtosecond(femtosecond);
					 results.setAttosecond(attosecond);
					 results.setShake(shake);
					 results.setMonthsynodic(monthsynodic);
					 results.setYearjulian(yearjulian);
					 results.setYearleap(yearleap);
					 results.setYeartropical(yeartropical);
					 results.setYearsidereal(yearsidereal);
					 results.setDaysidereal(daysidereal);
					 results.setHoursidereal(hoursidereal);
					 results.setMinutesidereal(minutesidereal);
					 results.setSecondsidereal(secondsidereal);
					 results.setFortnight(fortnight);
					 results.setSeptennial(septennial);
					 results.setOctennial(octennial);
					 results.setNovennial(novennial);
					 results.setQuindecennial(quindecennial);
					 results.setQuinquennial(quinquennial);
					 results.setPlanktime(planktime);
					
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 converterArray.add(results);
					    return converterArray;
					    
				    }
							
						public class ConversionResults{
							
							private double second,milisecond,minute,hour,day,week,month,year,decade,century,millennium,microsecond,nanosecond,picosecond,femtosecond,attosecond,shake,monthsynodic,
							yearjulian,yearleap,yeartropical,yearsidereal,daysidereal,hoursidereal,minutesidereal,secondsidereal,fortnight,septennial,octennial,novennial,quindecennial,quinquennial,planktime;

							public double getSecond() {
								return second;
							}

							public void setSecond(double second) {
								this.second = second;
							}

							public double getMilisecond() {
								return milisecond;
							}

							public void setMilisecond(double milisecond) {
								this.milisecond = milisecond;
							}

							public double getMinute() {
								return minute;
							}

							public void setMinute(double minute) {
								this.minute = minute;
							}

							public double getHour() {
								return hour;
							}

							public void setHour(double hour) {
								this.hour = hour;
							}

							public double getDay() {
								return day;
							}

							public void setDay(double day) {
								this.day = day;
							}

							public double getWeek() {
								return week;
							}

							public void setWeek(double week) {
								this.week = week;
							}

							public double getMonth() {
								return month;
							}

							public void setMonth(double month) {
								this.month = month;
							}

							public double getYear() {
								return year;
							}

							public void setYear(double year) {
								this.year = year;
							}

							public double getDecade() {
								return decade;
							}

							public void setDecade(double decade) {
								this.decade = decade;
							}

							public double getCentury() {
								return century;
							}

							public void setCentury(double century) {
								this.century = century;
							}

							public double getMillennium() {
								return millennium;
							}

							public void setMillennium(double millennium) {
								this.millennium = millennium;
							}

							public double getMicrosecond() {
								return microsecond;
							}

							public void setMicrosecond(double microsecond) {
								this.microsecond = microsecond;
							}

							public double getNanosecond() {
								return nanosecond;
							}

							public void setNanosecond(double nanosecond) {
								this.nanosecond = nanosecond;
							}

							public double getPicosecond() {
								return picosecond;
							}

							public void setPicosecond(double picosecond) {
								this.picosecond = picosecond;
							}

							public double getFemtosecond() {
								return femtosecond;
							}

							public void setFemtosecond(double femtosecond) {
								this.femtosecond = femtosecond;
							}

							public double getAttosecond() {
								return attosecond;
							}

							public void setAttosecond(double attosecond) {
								this.attosecond = attosecond;
							}

							public double getShake() {
								return shake;
							}

							public void setShake(double shake) {
								this.shake = shake;
							}

							public double getMonthsynodic() {
								return monthsynodic;
							}

							public void setMonthsynodic(double monthsynodic) {
								this.monthsynodic = monthsynodic;
							}

							public double getYearjulian() {
								return yearjulian;
							}

							public void setYearjulian(double yearjulian) {
								this.yearjulian = yearjulian;
							}

							public double getYearleap() {
								return yearleap;
							}

							public void setYearleap(double yearleap) {
								this.yearleap = yearleap;
							}

							public double getYeartropical() {
								return yeartropical;
							}

							public void setYeartropical(double yeartropical) {
								this.yeartropical = yeartropical;
							}

							public double getYearsidereal() {
								return yearsidereal;
							}

							public void setYearsidereal(double yearsidereal) {
								this.yearsidereal = yearsidereal;
							}

							public double getDaysidereal() {
								return daysidereal;
							}

							public void setDaysidereal(double daysidereal) {
								this.daysidereal = daysidereal;
							}

							public double getHoursidereal() {
								return hoursidereal;
							}

							public void setHoursidereal(double hoursidereal) {
								this.hoursidereal = hoursidereal;
							}

							public double getMinutesidereal() {
								return minutesidereal;
							}

							public void setMinutesidereal(double minutesidereal) {
								this.minutesidereal = minutesidereal;
							}

							public double getSecondsidereal() {
								return secondsidereal;
							}

							public void setSecondsidereal(double secondsidereal) {
								this.secondsidereal = secondsidereal;
							}

							public double getFortnight() {
								return fortnight;
							}

							public void setFortnight(double fortnight) {
								this.fortnight = fortnight;
							}

							public double getSeptennial() {
								return septennial;
							}

							public void setSeptennial(double septennial) {
								this.septennial = septennial;
							}

							public double getOctennial() {
								return octennial;
							}

							public void setOctennial(double octennial) {
								this.octennial = octennial;
							}

							public double getNovennial() {
								return novennial;
							}

							public void setNovennial(double novennial) {
								this.novennial = novennial;
							}

							public double getQuindecennial() {
								return quindecennial;
							}

							public void setQuindecennial(double quindecennial) {
								this.quindecennial = quindecennial;
							}

							public double getQuinquennial() {
								return quinquennial;
							}

							public void setQuinquennial(double quinquennial) {
								this.quinquennial = quinquennial;
							}

							public double getPlanktime() {
								return planktime;
							}

							public void setPlanktime(double planktime) {
								this.planktime = planktime;
							}
							
							
						}
					

}
