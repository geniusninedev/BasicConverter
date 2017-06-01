package com.nineinfosys.basicconverter.Engin;

import java.util.ArrayList;


public class EnergyConverter {
	
	private double joule,kilojoule,kilowatthour,watthour,calorie,horsepower,BtuIT,Btuth,gigajoule,megajoule,millijoule,microjoule,nanojoule,attojoule,megaelectronvolt,
                   kiloelectronvolt,electronvolt,erg,gigawatthour,megawatthour,kilowattsecond,wattsecond,newtonmeter,horsepowerhour,kilocalorieIT,kilocalorieth,calorieit,
                   calorieth,megaBtuIT,tonhour,fuelkl,fuelb,gigaton,megaton,kiloton,ton,dynecm,gfm,gfcm,kgfcm,kgfm,kpm,pff,pfi,ofi,fp,ip,io,pdlft,therm,thermec,thermus,Hartree,Rydberg;

private double edtValue;

private String conversionFrom;


public EnergyConverter(String conversionFrom, double edtValue) {
	
	this.conversionFrom = conversionFrom;
	this.edtValue = edtValue;
}


public ArrayList<ConversionResults> calculateenergyConversion()

{

	ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
		
	ConversionResults results= new ConversionResults();
		 	
	switch(conversionFrom)
	
	{   
	
	case "Joule - J":
		
		joule=(edtValue)*1;
		kilojoule=(edtValue)*0.001;
		kilowatthour=(edtValue)*2.777777777E-7;
		watthour=(edtValue)*0.0002777778;
		calorie=(edtValue)*0.0002388459;
		horsepower=(edtValue)*3.776726714E-7;
		BtuIT=(edtValue)*0.0009478171;
		Btuth=(edtValue)*0.0009484517;
		gigajoule=(edtValue)*9.999999999E-10;
		megajoule=(edtValue)*0.000001;
		millijoule=(edtValue)*1000;
		microjoule=(edtValue)*1000000;
		nanojoule=(edtValue)*1000000000;
		attojoule=(edtValue)*1000000000000000000.00;
		megaelectronvolt=(edtValue)*6241506363094.00;
		kiloelectronvolt=(edtValue)*6241506363094000.00;
		electronvolt=(edtValue)*6241506363094000000.00;
		erg=(edtValue)*10000000;
		gigawatthour=(edtValue)*2.777777777E-13;
		megawatthour=(edtValue)*2.777777777E-10;
		kilowattsecond=(edtValue)*0.001;
		wattsecond=(edtValue)*1;
		newtonmeter=(edtValue)*1;
		horsepowerhour=(edtValue)*3.725061361E-7;
		kilocalorieIT=(edtValue)*0.0002388459;
		kilocalorieth=(edtValue)*0.0002390057;
		calorieit=(edtValue)*0.2388458966;
		calorieth=(edtValue)*0.2390057361;
		megaBtuIT=(edtValue)*9.478171203E-10;
		tonhour=(edtValue)*7.898476002E-8;
		fuelkl=(edtValue)*2.487708977E-11;
		fuelb=(edtValue)*1.566639868E-10;
		gigaton=(edtValue)*2.390057361E-19;
		megaton=(edtValue)*2.390057361E-16;
		kiloton=(edtValue)*2.390057361E-13;
		ton=(edtValue)*2.390057361E-10;
		dynecm=(edtValue)*10000000;
		gfm=(edtValue)*101.9716213;
		gfcm=(edtValue)*10197.16213;
		kgfcm=(edtValue)*10.19716213;
		kgfm=(edtValue)*0.1019716213;
		kpm=(edtValue)*0.1019716213;
		pff=(edtValue)*0.7375621493;
		pfi=(edtValue)*8.8507457916;
		ofi=(edtValue)*141.61193267;
		fp=(edtValue)*0.7375621493;
		ip=(edtValue)*8.8507457916;
		io=(edtValue)*141.61193267;
		pdlft=(edtValue)*23.730360457;
		therm=(edtValue)*9.478169879E-9;
		thermec=(edtValue)*9.478169879E-9;
		thermus=(edtValue)*9.480434279E-9;
		Hartree=(edtValue)*229371044869059970.00;
		Rydberg=(edtValue)*458742089738119940.00;
		
		
		 break;
   case "Kilo joule - kJ":
		
	   joule=(edtValue)*1000;
		kilojoule=(edtValue)*1;
		kilowatthour=(edtValue)*0.0002777778;
		watthour=(edtValue)*0.2777777778;
		calorie=(edtValue)*0.2388458966;
		horsepower=(edtValue)*0.0003776727;
		BtuIT=(edtValue)*0.9478171203;
		Btuth=(edtValue)*0.9484516527;
		gigajoule=(edtValue)*0.000001;
		megajoule=(edtValue)*0.001;
		millijoule=(edtValue)*1000000;
		microjoule=(edtValue)*1000000000;
		nanojoule=(edtValue)*1000000000000.00;
		attojoule=(edtValue)*1.E+21;
		megaelectronvolt=(edtValue)*6241506363094002.00;
		kiloelectronvolt=(edtValue)*6241506363094001000.00;
		electronvolt=(edtValue)*6.241506363E+21;
		erg=(edtValue)*10000000000.00;
		gigawatthour=(edtValue)*2.777777777E-10;
		megawatthour=(edtValue)*2.777777777E-7;
		kilowattsecond=(edtValue)*1;
		wattsecond=(edtValue)*1000;
		newtonmeter=(edtValue)*1000;
		horsepowerhour=(edtValue)*0.0003725061;
		kilocalorieIT=(edtValue)*0.2388458966;
		kilocalorieth=(edtValue)*0.2390057361;
		calorieit=(edtValue)*238.84589663;
		calorieth=(edtValue)*239.00573614;
		megaBtuIT=(edtValue)*9.478171203E-7;
		tonhour=(edtValue)*0.0000789848;
		fuelkl=(edtValue)*2.487708977E-8;
		fuelb=(edtValue)*1.566639868E-7;
		gigaton=(edtValue)*2.390057361E-16;
		megaton=(edtValue)*2.390057361E-13;
		kiloton=(edtValue)*2.390057361E-10;
		ton=(edtValue)*2.390057361E-7;
		dynecm=(edtValue)*10000000000.00;
		gfm=(edtValue)*101971.6213;
		gfcm=(edtValue)*10197162.13;
		kgfcm=(edtValue)*10197.16213;
		kgfm=(edtValue)*101.9716213;
		kpm=(edtValue)*101.9716213;
		pff=(edtValue)*737.5621493;
		pfi=(edtValue)*8850.7457916;
		ofi=(edtValue)*141611.93267;
		fp=(edtValue)*737.5621493;
		ip=(edtValue)*8850.7457916;
		io=(edtValue)*141611.93267;
		pdlft=(edtValue)*23730.360457;
		therm=(edtValue)*0.0000094782;
		thermec=(edtValue)*0.0000094782;
		thermus=(edtValue)*0.0000094804;
		Hartree=(edtValue)*229371044869060000000.00;
		Rydberg=(edtValue)*458742089738120000000.00;
		
		 break;
 case "Kilo-watt hour - kW*h":

	 joule=(edtValue)*3600000;
		kilojoule=(edtValue)*3600;
		kilowatthour=(edtValue)*1;
		watthour=(edtValue)*1000;
		calorie=(edtValue)*859.84522786;
		horsepower=(edtValue)*1.3596216173;
		BtuIT=(edtValue)*3412.1416331;
		Btuth=(edtValue)*3414.4259497;
		gigajoule=(edtValue)*0.0036;
		megajoule=(edtValue)*3.6;
		millijoule=(edtValue)*3600000000.00;
		microjoule=(edtValue)*3600000000000.00;
		nanojoule=(edtValue)*3599999999999971.00;
		attojoule=(edtValue)*3.599999999E+24;
		megaelectronvolt=(edtValue)*22469422907138220000.00;
		kiloelectronvolt=(edtValue)*2.24694229E+22;
		electronvolt=(edtValue)*2.24694229E+25;
		erg=(edtValue)*36000000000000.00;
		gigawatthour=(edtValue)*0.000001;
		megawatthour=(edtValue)*0.001;
		kilowattsecond=(edtValue)*3600;
		wattsecond=(edtValue)*3600000;
		newtonmeter=(edtValue)*3600000;
		horsepowerhour=(edtValue)*1.34102209;
		kilocalorieIT=(edtValue)*859.84522786;
		kilocalorieth=(edtValue)*860.4206501;
		calorieit=(edtValue)*859845.22786;
		calorieth=(edtValue)*860420.6501;
		megaBtuIT=(edtValue)*0.0034121416;
		tonhour=(edtValue)*0.2843451361;
		fuelkl=(edtValue)*0.0000895575;
		fuelb=(edtValue)*0.0005639904;
		gigaton=(edtValue)*8.6042065E-13;
		megaton=(edtValue)*8.6042065E-10;
		kiloton=(edtValue)*8.6042065E-7;
		ton=(edtValue)*0.0008604207;
		dynecm=(edtValue)*36000000000000.00;
		gfm=(edtValue)*367097836.68;
		gfcm=(edtValue)*36709783668.00;
		kgfcm=(edtValue)*36709783.668;
		kgfm=(edtValue)*367097.83668;
		kpm=(edtValue)*367097.83668;
		pff=(edtValue)*2655223.7375;
		pfi=(edtValue)*31862684.85;
		ofi=(edtValue)*509802957.6;
		fp=(edtValue)*2655223.7375;
		ip=(edtValue)*31862684.85;
		io=(edtValue)*509802957.6;
		pdlft=(edtValue)*85429297.646;
		therm=(edtValue)*0.0341214116;
		thermec=(edtValue)*0.0341214116;
		thermus=(edtValue)*0.0341295634;
		Hartree=(edtValue)*8.257357615E+23;
		Rydberg=(edtValue)*1.651471523E+24;


break;

case "Watt-hour - W*h":

	 joule=(edtValue)*3600;
		kilojoule=(edtValue)*3.6;
		kilowatthour=(edtValue)*0.001;
		watthour=(edtValue)*1;
		calorie=(edtValue)*0.8598452279;
		horsepower=(edtValue)*0.0013596216;
		BtuIT=(edtValue)*3.4121416331;
		Btuth=(edtValue)*3.4144259497;
		gigajoule=(edtValue)*0.0000036;
		megajoule=(edtValue)*0.0036;
		millijoule=(edtValue)*3600000;
		microjoule=(edtValue)*3600000000.00;
		nanojoule=(edtValue)*3600000000000.00;
		attojoule=(edtValue)*3.599999999E+21;
		megaelectronvolt=(edtValue)*22469422907138220.00;
		kiloelectronvolt=(edtValue)*22469422907138220000.00;
		electronvolt=(edtValue)*2.24694229E+22;
		erg=(edtValue)*36000000000.00;
		gigawatthour=(edtValue)*1.E-9;
		megawatthour=(edtValue)*0.000001;
		kilowattsecond=(edtValue)*3.6;
		wattsecond=(edtValue)*3600;
		newtonmeter=(edtValue)*3600;
		horsepowerhour=(edtValue)*0.0013410221;
		kilocalorieIT=(edtValue)*0.8598452279;
		kilocalorieth=(edtValue)*0.8604206501;
		calorieit=(edtValue)*859.84522786;
		calorieth=(edtValue)*860.4206501;
		megaBtuIT=(edtValue)*0.0000034121;
		tonhour=(edtValue)*0.0002843451;
		fuelkl=(edtValue)*8.955752317E-8;
		fuelb=(edtValue)*5.639903525E-7;
		gigaton=(edtValue)*8.6042065E-16;
		megaton=(edtValue)*8.6042065E-13;
		kiloton=(edtValue)*8.6042065E-10;
		ton=(edtValue)*8.6042065E-7;
		dynecm=(edtValue)*36000000000.00;
		gfm=(edtValue)*367097.83668;
		gfcm=(edtValue)*36709783.668;
		kgfcm=(edtValue)*36709.783668;
		kgfm=(edtValue)*367.09783668;
		kpm=(edtValue)*367.09783668;
		pff=(edtValue)*2655.2237375;
		pfi=(edtValue)*31862.68485;
		ofi=(edtValue)*509802.9576;
		fp=(edtValue)*2655.2237375;
		ip=(edtValue)*31862.68485;
		io=(edtValue)*509802.9576;
		pdlft=(edtValue)*85429.297646;
		therm=(edtValue)*0.0000341214;
		thermec=(edtValue)*0.0000341214;
		thermus=(edtValue)*0.0000341296;
		Hartree=(edtValue)*825735761528609300000.00;
		Rydberg=(edtValue)*1.651471523E+21;



break;
case "Calorie (nutritional) - cal(nutritional)":

	 joule=(edtValue)*4186.8;
		kilojoule=(edtValue)*4.1868;
		kilowatthour=(edtValue)*0.001163;
		watthour=(edtValue)*1.163;
		calorie=(edtValue)*1;
		horsepower=(edtValue)*0.0015812399;
		BtuIT=(edtValue)*3.9683207193;
		Btuth=(edtValue)*3.9709773795;
		gigajoule=(edtValue)*0.0000041868;
		megajoule=(edtValue)*0.0041868;
		millijoule=(edtValue)*4186800;
		microjoule=(edtValue)*4186800000.00;
		nanojoule=(edtValue)*4186800000000.00;
		attojoule=(edtValue)*4.186799999E+21;
		megaelectronvolt=(edtValue)*26131938841001516.00;
		kiloelectronvolt=(edtValue)*26131938841001517000.00;
		electronvolt=(edtValue)*2.613193884E+22;
		erg=(edtValue)*41868000000.00;
		gigawatthour=(edtValue)*1.162999999E-9;
		megawatthour=(edtValue)*0.000001163;
		kilowattsecond=(edtValue)*4.1868;
		wattsecond=(edtValue)*4186.8;
		newtonmeter=(edtValue)*4186.8;
		horsepowerhour=(edtValue)*0.0015596087;
		kilocalorieIT=(edtValue)*1;
		kilocalorieth=(edtValue)*1.0006692161;
		calorieit=(edtValue)*1000;
		calorieth=(edtValue)*1000.6692161;
		megaBtuIT=(edtValue)*0.0000039683;
		tonhour=(edtValue)*0.0003306934;
		fuelkl=(edtValue)*1.041553994E-7;
		fuelb=(edtValue)*6.5592078E-7;
		gigaton=(edtValue)*1.000669216E-15;
		megaton=(edtValue)*1.000669216E-12;
		kiloton=(edtValue)*1.000669216E-9;
		ton=(edtValue)*0.0000010007;
		dynecm=(edtValue)*41868000000.00;
		gfm=(edtValue)*426934.78406;
		gfcm=(edtValue)*42693478.406;
		kgfcm=(edtValue)*42693.478406;
		kgfm=(edtValue)*426.93478406;
		kpm=(edtValue)*426.93478406;
		pff=(edtValue)*3088.0252067;
		pfi=(edtValue)*37056.30248;
		ofi=(edtValue)*592900.83968;
		fp=(edtValue)*3088.0252067;
		ip=(edtValue)*37056.30248;
		io=(edtValue)*592900.83968;
		pdlft=(edtValue)*99354.273162;
		therm=(edtValue)*0.0000396832;
		thermec=(edtValue)*0.0000396832;
		thermus=(edtValue)*0.0000396927;
		Hartree=(edtValue)*960330690657764000000.00;
		Rydberg=(edtValue)*1.920661381E+21;

break;

case "Horsepower (metric) hour - hp*h":
	
	joule=(edtValue)*2647795.5;
	kilojoule=(edtValue)*2647.7955;
	kilowatthour=(edtValue)*0.73549875;
	watthour=(edtValue)*735.49875;
	calorie=(edtValue)*632.41509028;
	horsepower=(edtValue)*1;
	BtuIT=(edtValue)*2509.625906;
	Btuth=(edtValue)*2511.306018;
	gigajoule=(edtValue)*0.0026477955;
	megajoule=(edtValue)*2.6477955;
	millijoule=(edtValue)*2647795500.00;
	microjoule=(edtValue)*2647795500000.00;
	nanojoule=(edtValue)*2647795499999977.00;
	attojoule=(edtValue)*2.647795499E+24;
	megaelectronvolt=(edtValue)*16526232461421517000.00;
	kiloelectronvolt=(edtValue)*1.652623246E+22;
	electronvolt=(edtValue)*1.652623246E+25;
	erg=(edtValue)*26477955000000.00;
	gigawatthour=(edtValue)*7.354987499E-7;
	megawatthour=(edtValue)*0.0007354987;
	kilowattsecond=(edtValue)*2647.7955;
	wattsecond=(edtValue)*2647795.5;
	newtonmeter=(edtValue)*2647795.5;
	horsepowerhour=(edtValue)*0.9863200709;
	kilocalorieIT=(edtValue)*632.41509028;
	kilocalorieth=(edtValue)*632.83831262;
	calorieit=(edtValue)*632415.09028;
	calorieth=(edtValue)*632838.31262;
	megaBtuIT=(edtValue)*0.0025096259;
	tonhour=(edtValue)*0.2091354922;
	fuelkl=(edtValue)*0.0000658694;
	fuelb=(edtValue)*0.0004148142;
	gigaton=(edtValue)*6.328383126E-13;
	megaton=(edtValue)*6.328383126E-10;
	kiloton=(edtValue)*6.328383126E-7;
	ton=(edtValue)*0.0006328383;
	dynecm=(edtValue)*26477955000000.0;
	gfm=(edtValue)*270000000.01;
	gfcm=(edtValue)*27000000001.0;
	kgfcm=(edtValue)*27000000.001;
	kgfm=(edtValue)*270000.00001;
	kpm=(edtValue)*270000.00001;
	pff=(edtValue)*1952913.7399;
	pfi=(edtValue)*23434964.879;
	ofi=(edtValue)*374959438.06;
	fp=(edtValue)*1952913.7399;
	ip=(edtValue)*23434964.879;
	io=(edtValue)*374959438.06;
	pdlft=(edtValue)*62833141.632;
	therm=(edtValue)*0.0250962556;
	thermec=(edtValue)*0.0250962556;
	thermus=(edtValue)*0.0251022512;
	Hartree=(edtValue)*6.073276204E+23;
	Rydberg=(edtValue)*1.21465524E+24;
	
	
	 break;
case "Btu(IT) - btu(IT),Btu":
	
   joule=(edtValue)*1055.0558526;
	kilojoule=(edtValue)*1.0550558526;
	kilowatthour=(edtValue)*0.0002930711;
	watthour=(edtValue)*0.2930710702;
	calorie=(edtValue)*0.2519957611;
	horsepower=(edtValue)*0.0003984658;
	BtuIT=(edtValue)*1;
	Btuth=(edtValue)*1.0006694671;
	gigajoule=(edtValue)*0.0000010551;
	megajoule=(edtValue)*0.0010550559;
	millijoule=(edtValue)*1055055.8526;
	microjoule=(edtValue)*1055055852.6;
	nanojoule=(edtValue)*1055055852620.00;
	attojoule=(edtValue)*1.055055852E+21;
	megaelectronvolt=(edtValue)*6585137817547276.00;
	kiloelectronvolt=(edtValue)*6585137817547276000.00;
	electronvolt=(edtValue)*6.585137817E+21;
	erg=(edtValue)*10550558526.00;
	gigawatthour=(edtValue)*2.930710701E-10;
	megawatthour=(edtValue)*2.930710701E-7;
	kilowattsecond=(edtValue)*1.0550558526;
	wattsecond=(edtValue)*1055.0558526;
	newtonmeter=(edtValue)*1055.0558526;
	horsepowerhour=(edtValue)*0.0003930148;
	kilocalorieIT=(edtValue)*0.2519957611;
	kilocalorieth=(edtValue)*0.2521644007;
	calorieit=(edtValue)*251.99576111;
	calorieth=(edtValue)*252.16440072;
	megaBtuIT=(edtValue)*0.000001;
	tonhour=(edtValue)*0.0000833333;
	fuelkl=(edtValue)*2.624671916E-8;
	fuelb=(edtValue)*1.652892561E-7;
	gigaton=(edtValue)*2.521644007E-16;
	megaton=(edtValue)*2.521644007E-13;
	kiloton=(edtValue)*2.521644007E-10;
	ton=(edtValue)*2.521644007E-7;
	dynecm=(edtValue)*10550558526.00;
	gfm=(edtValue)*107585.75585;
	gfcm=(edtValue)*10758575.585;
	kgfcm=(edtValue)*10758.575585;
	kgfm=(edtValue)*107.58575585;
	kpm=(edtValue)*107.58575585;
	pff=(edtValue)*778.16926229;
	pfi=(edtValue)*9338.0311475;
	ofi=(edtValue)*149408.49836;
	fp=(edtValue)*778.16926229;
	ip=(edtValue)*9338.0311475;
	io=(edtValue)*149408.49836;
	pdlft=(edtValue)*25036.855685;
	therm=(edtValue)*0.00001;
	thermec=(edtValue)*0.00001;
	thermus=(edtValue)*0.0000100024;
	Hartree=(edtValue)*241999263310665650000.00;
	Rydberg=(edtValue)*483998526621331300000.00;
	
	
	 break;
case "Btu(th) - btu(th)":

 joule=(edtValue)*1054.35;
	kilojoule=(edtValue)*1.05435;
	kilowatthour=(edtValue)*0.000292875;
	watthour=(edtValue)*0.292875;
	calorie=(edtValue)*0.2518271711;
	horsepower=(edtValue)*0.0003981992;
	BtuIT=(edtValue)*0.9993309808;
	Btuth=(edtValue)*1;
	gigajoule=(edtValue)*0.0000010543;
	megajoule=(edtValue)*0.00105435;
	millijoule=(edtValue)*1054350;
	microjoule=(edtValue)*1054350000;
	nanojoule=(edtValue)*1054349999974.00;
	attojoule=(edtValue)*1.054349999E+21;
	megaelectronvolt=(edtValue)*6580732233768610.00;
	kiloelectronvolt=(edtValue)*6580732233768610000.00;
	electronvolt=(edtValue)*6.580732233E+21;
	erg=(edtValue)*10543500000.00;
	gigawatthour=(edtValue)*2.928749999E-10;
	megawatthour=(edtValue)*2.928749999E-7;
	kilowattsecond=(edtValue)*1.05435;
	wattsecond=(edtValue)*1054.35;
	newtonmeter=(edtValue)*1054.35;
	horsepowerhour=(edtValue)*0.0003927518;
	kilocalorieIT=(edtValue)*0.2518271711;
	kilocalorieth=(edtValue)*0.2519956979;
	calorieit=(edtValue)*251.8271711;
	calorieth=(edtValue)*251.99569789;
	megaBtuIT=(edtValue)*9.993309807E-7;
	tonhour=(edtValue)*0.0000832776;
	fuelkl=(edtValue)*2.62291596E-8;
	fuelb=(edtValue)*1.651786745E-7;
	gigaton=(edtValue)*2.519956978E-16;
	megaton=(edtValue)*2.519956978E-13;
	kiloton=(edtValue)*2.519956978E-10;
	ton=(edtValue)*2.519956978E-7;
	dynecm=(edtValue)*10543500000.00;
	gfm=(edtValue)*107513.77892;
	gfcm=(edtValue)*10751377.892;
	kgfcm=(edtValue)*10751.377892;
	kgfm=(edtValue)*107.51377892;
	kpm=(edtValue)*107.51377892;
	pff=(edtValue)*777.6486521;
	pfi=(edtValue)*9331.7838251;
	ofi=(edtValue)*149308.5412;
	fp=(edtValue)*777.6486521;
	ip=(edtValue)*9331.7838251;
	io=(edtValue)*149308.5412;
	pdlft=(edtValue)*25020.105547;
	therm=(edtValue)*0.0000099933;
	thermec=(edtValue)*0.0000099933;
	thermus=(edtValue)*0.0000099957;
	Hartree=(edtValue)*241837361151830030000.00;
	Rydberg=(edtValue)*483674722303660060000.00;


break;

case "Giga joule - GJ":

 joule=(edtValue)*1000000000;
	kilojoule=(edtValue)*1000000;
	kilowatthour=(edtValue)*277.77777778;
	watthour=(edtValue)*277777.77778;
	calorie=(edtValue)*238845.89663;
	horsepower=(edtValue)*377.67267147;
	BtuIT=(edtValue)*947817.12031;
	Btuth=(edtValue)*948451.6527;
	gigajoule=(edtValue)*1;
	megajoule=(edtValue)*1000;
	millijoule=(edtValue)*1000000000000.00;
	microjoule=(edtValue)*1000000000000000.00;
	nanojoule=(edtValue)*1000000000000000000.00;
	attojoule=(edtValue)*1.E+27;
	megaelectronvolt=(edtValue)*6.241506363E+21;
	kiloelectronvolt=(edtValue)*6.241506363E+24;
	electronvolt=(edtValue)*6.241506363E+27;
	erg=(edtValue)*10000000000000000.00;
	gigawatthour=(edtValue)*0.0002777778;
	megawatthour=(edtValue)*0.2777777778;
	kilowattsecond=(edtValue)*1000000;
	wattsecond=(edtValue)*1000000000;
	newtonmeter=(edtValue)*1000000000;
	horsepowerhour=(edtValue)*372.50613611;
	kilocalorieIT=(edtValue)*238845.89663;
	kilocalorieth=(edtValue)*239005.73614;
	calorieit=(edtValue)*238845896.63;
	calorieth=(edtValue)*239005736.14;
	megaBtuIT=(edtValue)*0.9478171203;
	tonhour=(edtValue)*78.984760026;
	fuelkl=(edtValue)*0.0248770898;
	fuelb=(edtValue)*0.1566639868;
	gigaton=(edtValue)*2.390057361E-10;
	megaton=(edtValue)*2.390057361E-7;
	kiloton=(edtValue)*0.0002390057;
	ton=(edtValue)*0.2390057361;
	dynecm=(edtValue)*10000000000000000.00;
	gfm=(edtValue)*101971621301.00;
	gfcm=(edtValue)*10197162130094.00;
	kgfcm=(edtValue)*10197162130.00;
	kgfm=(edtValue)*101971621.3;
	kpm=(edtValue)*101971621.3;
	pff=(edtValue)*737562149.3;
	pfi=(edtValue)*8850745791.6;
	ofi=(edtValue)*141611932666.00;
	fp=(edtValue)*737562149.3;
	ip=(edtValue)*8850745791.6;
	io=(edtValue)*141611932666.00;
	pdlft=(edtValue)*23730360457.00;
	therm=(edtValue)*9.4781698791;
	thermec=(edtValue)*9.4781698791;
	thermus=(edtValue)*9.4804342797;
	Hartree=(edtValue)*2.293710448E+26;
	Rydberg=(edtValue)*4.587420897E+26;



break;
case "Mega joule - MJ":

 joule=(edtValue)*1000000;
	kilojoule=(edtValue)*1000;
	kilowatthour=(edtValue)*0.2777777778;
	watthour=(edtValue)*277.77777778;
	calorie=(edtValue)*238.84589663;
	horsepower=(edtValue)*0.3776726715;
	BtuIT=(edtValue)*947.81712031;
	Btuth=(edtValue)*948.4516527;
	gigajoule=(edtValue)*0.001;
	megajoule=(edtValue)*1;
	millijoule=(edtValue)*1000000000;
	microjoule=(edtValue)*1000000000000.00;
	nanojoule=(edtValue)*1000000000000000.00;
	attojoule=(edtValue)*1.E+24;
	megaelectronvolt=(edtValue)*6241506363094001000.00;
	kiloelectronvolt=(edtValue)*6.241506363E+21;
	electronvolt=(edtValue)*6.241506363E+24;
	erg=(edtValue)*10000000000000.00;
	gigawatthour=(edtValue)*2.777777777E-7;
	megawatthour=(edtValue)*0.0002777778;
	kilowattsecond=(edtValue)*1000;
	wattsecond=(edtValue)*1000000;
	newtonmeter=(edtValue)*1000000;
	horsepowerhour=(edtValue)*0.3725061361;
	kilocalorieIT=(edtValue)*238.84589663;
	kilocalorieth=(edtValue)*239.00573614;
	calorieit=(edtValue)*238845.89663;
	calorieth=(edtValue)*239005.73614;
	megaBtuIT=(edtValue)*0.0009478171;
	tonhour=(edtValue)*0.07898476;
	fuelkl=(edtValue)*0.0000248771;
	fuelb=(edtValue)*0.000156664;
	gigaton=(edtValue)*2.390057361E-13;
	megaton=(edtValue)*2.390057361E-10;
	kiloton=(edtValue)*2.390057361E-7;
	ton=(edtValue)*0.0002390057;
	dynecm=(edtValue)*10000000000000.00;
	gfm=(edtValue)*101971621.3;
	kgfcm=(edtValue)*10197162.13;
	kgfm=(edtValue)*101971.6213;
	kpm=(edtValue)*101971.6213;
	pff=(edtValue)*737562.1493;
	pfi=(edtValue)*8850745.7916;
	ofi=(edtValue)*141611932.67;
	fp=(edtValue)*737562.1493;
	ip=(edtValue)*8850745.7916;
	io=(edtValue)*141611932.67;
	pdlft=(edtValue)*23730360.457;
	therm=(edtValue)*0.0094781699;
	thermec=(edtValue)*0.0094781699;
	thermus=(edtValue)*0.0094804343;
	Hartree=(edtValue)*2.293710448E+23;
	Rydberg=(edtValue)*4.587420897E+23;

break;
case "Milli joule - mJ":
	
	joule=(edtValue)*0.001;
	kilojoule=(edtValue)*0.000001;
	kilowatthour=(edtValue)*2.777777777E-10;
	watthour=(edtValue)*2.777777777E-7;
	calorie=(edtValue)*2.388458966E-7;
	horsepower=(edtValue)*3.776726714E-10;
	BtuIT=(edtValue)*9.478171203E-7;
	Btuth=(edtValue)*9.484516527E-7;
	gigajoule=(edtValue)*1.E-12;
	megajoule=(edtValue)*1.E-9;
	millijoule=(edtValue)*1;
	microjoule=(edtValue)*1000;
	nanojoule=(edtValue)*1000000;
	attojoule=(edtValue)*1000000000000000.00;
	megaelectronvolt=(edtValue)*6241506363.1;
	kiloelectronvolt=(edtValue)*6241506363094.00;
	electronvolt=(edtValue)*6241506363094002.00;
	erg=(edtValue)*10000;
	gigawatthour=(edtValue)*2.777777777E-16;
	megawatthour=(edtValue)*2.777777777E-13;
	kilowattsecond=(edtValue)*0.000001;
	wattsecond=(edtValue)*0.001;
	newtonmeter=(edtValue)*0.001;
	horsepowerhour=(edtValue)*3.725061361E-10;
	kilocalorieIT=(edtValue)*2.388458966E-7;
	kilocalorieth=(edtValue)*2.390057361E-7;
	calorieit=(edtValue)*0.0002388459;
	calorieth=(edtValue)*0.0002390057;
	megaBtuIT=(edtValue)*9.478171203E-13;
	tonhour=(edtValue)*7.898476002E-11;
	fuelkl=(edtValue)*2.487708977E-14;
	fuelb=(edtValue)*1.566639868E-13;
	gigaton=(edtValue)*2.390057361E-22;
	megaton=(edtValue)*2.390057361E-19;
	kiloton=(edtValue)*2.390057361E-16;
	ton=(edtValue)*2.390057361E-13;
	dynecm=(edtValue)*10000;
	gfm=(edtValue)*0.1019716213;
	gfcm=(edtValue)*10.19716213;
	kgfcm=(edtValue)*0.0101971621;
	kgfm=(edtValue)*0.0001019716;
	kpm=(edtValue)*0.0001019716;
	pff=(edtValue)*0.0007375621;
	pfi=(edtValue)*0.0088507458;
	ofi=(edtValue)*0.1416119327;
	fp=(edtValue)*0.0007375621;
	ip=(edtValue)*0.0088507458;
	io=(edtValue)*0.1416119327;
	pdlft=(edtValue)*0.0237303605;
	therm=(edtValue)*9.478169879E-12;
	thermec=(edtValue)*9.478169879E-12;
	thermus=(edtValue)*9.480434279E-12;
	Hartree=(edtValue)*229371044869060.00;
	Rydberg=(edtValue)*458742089738120.00;
	
	
	 break;
case "Micro joule - μj":
	
   joule=(edtValue)*0.000001;
	kilojoule=(edtValue)*9.999999999E-10;
	kilowatthour=(edtValue)*2.777777777E-13;
	watthour=(edtValue)*2.777777777E-10;
	calorie=(edtValue)*2.388458966E-10;
	horsepower=(edtValue)*3.776726714E-13;
	BtuIT=(edtValue)*9.478171203E-10;
	Btuth=(edtValue)*9.484516527E-10;
	gigajoule=(edtValue)*9.999999999E-16;
	megajoule=(edtValue)*1.E-12;
	millijoule=(edtValue)*0.001;
	microjoule=(edtValue)*1;
	nanojoule=(edtValue)*1000;
	attojoule=(edtValue)*1000000000000.00;
	megaelectronvolt=(edtValue)*6241506.3631;
	kiloelectronvolt=(edtValue)*6241506363.1;
	electronvolt=(edtValue)*6241506363094.00;
	erg=(edtValue)*10;
	gigawatthour=(edtValue)*2.777777777E-19;
	megawatthour=(edtValue)*2.777777777E-16;
	kilowattsecond=(edtValue)*9.999999999E-10;
	wattsecond=(edtValue)*0.000001;
	newtonmeter=(edtValue)*0.000001;
	horsepowerhour=(edtValue)*3.725061361E-13;
	kilocalorieIT=(edtValue)*2.388458966E-10;
	kilocalorieth=(edtValue)*2.390057361E-10;
	calorieit=(edtValue)*2.388458966E-7;
	calorieth=(edtValue)*2.390057361E-7;
	megaBtuIT=(edtValue)*9.478171203E-16;
	tonhour=(edtValue)*7.898476002E-14;
	fuelkl=(edtValue)*2.487708977E-17;
	fuelb=(edtValue)*1.566639868E-16;
	gigaton=(edtValue)*2.390057361E-25;
	megaton=(edtValue)*2.390057361E-22;
	kiloton=(edtValue)*2.390057361E-19;
	ton=(edtValue)*2.390057361E-16;
	dynecm=(edtValue)*10;
	gfm=(edtValue)*0.0001019716;
	gfcm=(edtValue)*0.0101971621;
	kgfcm=(edtValue)*0.0000101972;
	kgfm=(edtValue)*1.019716213E-7;
	kpm=(edtValue)*1.019716213E-7;
	pff=(edtValue)*7.375621493E-7;
	pfi=(edtValue)*0.0000088507;
	ofi=(edtValue)*0.0001416119;
	fp=(edtValue)*7.375621493E-7;
	ip=(edtValue)*0.0000088507;
	io=(edtValue)*0.0001416119;
	pdlft=(edtValue)*0.0000237304;
	therm=(edtValue)*9.478169879E-15;
	thermec=(edtValue)*9.478169879E-15;
	thermus=(edtValue)*9.480434279E-15;
	Hartree=(edtValue)*229371044869.00;
	Rydberg=(edtValue)*458742089738.00;
	
	
	 break;
case "Nano joule - nJ":

 joule=(edtValue)*1.E-9;
	kilojoule=(edtValue)*1.E-12;
	kilowatthour=(edtValue)*2.777777777E-16;
	watthour=(edtValue)*2.777777777E-13;
	calorie=(edtValue)*2.388458966E-13;
	horsepower=(edtValue)*3.776726714E-16;
	BtuIT=(edtValue)*9.478171203E-13;
	Btuth=(edtValue)*9.484516527E-13;
	gigajoule=(edtValue)*1.E-18;
	megajoule=(edtValue)*1.E-15;
	millijoule=(edtValue)*0.000001;
	microjoule=(edtValue)*0.001;
	nanojoule=(edtValue)*1;
	attojoule=(edtValue)*1000000000;
	megaelectronvolt=(edtValue)*6241.5063631;
	kiloelectronvolt=(edtValue)*6241506.3631;
	electronvolt=(edtValue)*6241506363.1;
	erg=(edtValue)*0.01;
	gigawatthour=(edtValue)*2.777777777E-22;
	megawatthour=(edtValue)*2.777777777E-19;
	kilowattsecond=(edtValue)*1.E-12;
	wattsecond=(edtValue)*1.E-9;
	newtonmeter=(edtValue)*1.E-9;
	horsepowerhour=(edtValue)*3.725061361E-16;
	kilocalorieIT=(edtValue)*2.388458966E-13;
	kilocalorieth=(edtValue)*2.390057361E-13;
	calorieit=(edtValue)*2.388458966E-10;
	calorieth=(edtValue)*2.390057361E-10;
	megaBtuIT=(edtValue)*9.478171203E-19;
	tonhour=(edtValue)*7.898476002E-17;
	fuelkl=(edtValue)*2.487708977E-20;
	fuelb=(edtValue)*1.566639868E-19;
	gigaton=(edtValue)*2.390057361E-28;
	megaton=(edtValue)*2.390057361E-25;
	kiloton=(edtValue)*2.390057361E-22;
	ton=(edtValue)*2.390057361E-19;
	dynecm=(edtValue)*0.01;
	gfm=(edtValue)*1.019716213E-7;
	gfcm=(edtValue)*0.0000101972;
	kgfcm=(edtValue)*1.019716213E-8;
	kgfm=(edtValue)*1.019716213E-10;
	kpm=(edtValue)*1.019716213E-10;
	pff=(edtValue)*7.375621493E-10;
	pfi=(edtValue)*8.850745791E-9;
	ofi=(edtValue)*1.416119326E-7;
	fp=(edtValue)*7.375621493E-10;
	ip=(edtValue)*8.850745791E-9;
	io=(edtValue)*1.416119326E-7;
	pdlft=(edtValue)*2.373036045E-8;
	therm=(edtValue)*9.478169879E-18;
	thermec=(edtValue)*9.478169879E-18;
	thermus=(edtValue)*9.480434279E-18;
	Hartree=(edtValue)*229371044.87;
	Rydberg=(edtValue)*458742089.74;


break;

case "Atto joule - aJ":

 joule=(edtValue)*9.999999999E-19;
	kilojoule=(edtValue)*1.E-21;
	kilowatthour=(edtValue)*2.777777777E-25;
	watthour=(edtValue)*2.777777777E-22;
	calorie=(edtValue)*2.388458966E-22;
	horsepower=(edtValue)*3.776726714E-25;
	BtuIT=(edtValue)*9.478171203E-22;
	Btuth=(edtValue)*9.484516527E-22;
	gigajoule=(edtValue)*9.999999999E-28;
	megajoule=(edtValue)*1.E-24;
	millijoule=(edtValue)*9.999999999E-16;
	microjoule=(edtValue)*1.E-12;
	nanojoule=(edtValue)*9.999999999E-10;
	attojoule=(edtValue)*1;
	megaelectronvolt=(edtValue)*0.0000062415;
	kiloelectronvolt=(edtValue)*0.0062415064;
	electronvolt=(edtValue)*6.2415063631;
	erg=(edtValue)*9.999999999E-12;
	gigawatthour=(edtValue)*2.777777777E-31;
	megawatthour=(edtValue)*2.777777777E-28;
	kilowattsecond=(edtValue)*1.E-21;
	wattsecond=(edtValue)*9.999999999E-19;
	newtonmeter=(edtValue)*9.999999999E-19;
	horsepowerhour=(edtValue)*3.725061361E-25;
	kilocalorieIT=(edtValue)*2.388458966E-22;
	kilocalorieth=(edtValue)*2.390057361E-22;
	calorieit=(edtValue)*2.388458966E-19;
	calorieth=(edtValue)*2.390057361E-19;
	megaBtuIT=(edtValue)*9.478171203E-28;
	tonhour=(edtValue)*7.898476002E-26;
	fuelkl=(edtValue)*2.487708977E-29;
	fuelb=(edtValue)*1.566639868E-28;
	gigaton=(edtValue)*2.390057361E-37;
	megaton=(edtValue)*2.390057361E-34;
	kiloton=(edtValue)*2.390057361E-31;
	ton=(edtValue)*2.390057361E-28;
	dynecm=(edtValue)*9.999999999E-12;
	gfm=(edtValue)*1.019716213E-16;
	gfcm=(edtValue)*1.019716213E-14;
	kgfcm=(edtValue)*1.019716213E-17;
	kgfm=(edtValue)*1.019716213E-19;
	kpm=(edtValue)*1.019716213E-19;
	pff=(edtValue)*7.375621492E-19;
	pfi=(edtValue)*8.850745791E-18;
	ofi=(edtValue)*1.416119326E-16;
	fp=(edtValue)*7.375621492E-19;
	ip=(edtValue)*8.850745791E-18;
	io=(edtValue)*1.416119326E-16;
	pdlft=(edtValue)*2.373036045E-17;
	therm=(edtValue)*9.478169879E-27;
	thermec=(edtValue)*9.478169879E-27;
	thermus=(edtValue)*9.480434279E-27;
	Hartree=(edtValue)*0.2293710449;
	Rydberg=(edtValue)*0.4587420897;



break;
case "Mega electron-volt - MeV":

 joule=(edtValue)*1.60217733E-13;
	kilojoule=(edtValue)*1.60217733E-16;
	kilowatthour=(edtValue)*4.450492583E-20;
	watthour=(edtValue)*4.450492583E-17;
	calorie=(edtValue)*3.826734809E-17;
	horsepower=(edtValue)*6.050985923E-20;
	BtuIT=(edtValue)*1.518571103E-16;
	Btuth=(edtValue)*1.519587736E-16;
	gigajoule=(edtValue)*1.60217733E-22;
	megajoule=(edtValue)*1.60217733E-19;
	millijoule=(edtValue)*1.60217733E-10;
	microjoule=(edtValue)*1.60217733E-7;
	nanojoule=(edtValue)*0.0001602177;
	attojoule=(edtValue)*160217.733;
	megaelectronvolt=(edtValue)*1;
	kiloelectronvolt=(edtValue)*1000;
	electronvolt=(edtValue)*1000000;
	erg=(edtValue)*0.0000016022;
	gigawatthour=(edtValue)*4.450492583E-26;
	megawatthour=(edtValue)*4.450492583E-23;
	kilowattsecond=(edtValue)*1.60217733E-16;
	wattsecond=(edtValue)*1.60217733E-13;
	newtonmeter=(edtValue)*1.60217733E-13;
	horsepowerhour=(edtValue)*5.968208865E-20;
	kilocalorieIT=(edtValue)*3.826734809E-17;
	kilocalorieth=(edtValue)*3.829295721E-17;
	calorieit=(edtValue)*3.826734809E-14;
	calorieth=(edtValue)*3.829295721E-14;
	megaBtuIT=(edtValue)*1.518571103E-22;
	tonhour=(edtValue)*1.265475919E-20;
	fuelkl=(edtValue)*1.265475919E-20;
	fuelb=(edtValue)*2.510034881E-23;
	gigaton=(edtValue)*3.829295721E-32;
	megaton=(edtValue)*3.829295721E-29;
	kiloton=(edtValue)*3.829295721E-26;
	ton=(edtValue)*3.829295721E-23;
	dynecm=(edtValue)*0.0000016022;
	gfm=(edtValue)*1.633766199E-11;
	gfcm=(edtValue)*1.633766199E-9;
	kgfcm=(edtValue)*1.633766199E-12;
	kgfm=(edtValue)*1.633766199E-14;
	kpm=(edtValue)*1.633766199E-14;
	pff=(edtValue)*1.181705355E-13;
	pfi=(edtValue)*1.418046426E-12;
	ofi=(edtValue)*2.268874281E-11;
	fp=(edtValue)*1.181705355E-13;
	ip=(edtValue)*1.418046426E-12;
	io=(edtValue)*2.268874281E-11;
	pdlft=(edtValue)*3.802024555E-12;
	therm=(edtValue)*1.518570891E-21;
	thermec=(edtValue)*1.518570891E-21;
	thermus=(edtValue)*1.518933688E-21;
	Hartree=(edtValue)*36749.308825;
	Rydberg=(edtValue)*73498.61765;

break;
case "Kilo electron-volt - KeV":
	
	joule=(edtValue)*1.60217733E-16;
	kilojoule=(edtValue)*1.60217733E-19;
	kilowatthour=(edtValue)*4.450492583E-23;
	watthour=(edtValue)*4.450492583E-20;
	calorie=(edtValue)*3.826734809E-20;
	horsepower=(edtValue)*6.050985923E-23;
	BtuIT=(edtValue)*1.518571103E-19;
	Btuth=(edtValue)*1.519587736E-19;
	gigajoule=(edtValue)*1.60217733E-25;
	megajoule=(edtValue)*1.60217733E-22;
	millijoule=(edtValue)*1.60217733E-13;
	microjoule=(edtValue)*1.60217733E-10;
	nanojoule=(edtValue)*1.60217733E-7;
	attojoule=(edtValue)*160.217733;
	megaelectronvolt=(edtValue)*0.001;
	kiloelectronvolt=(edtValue)*1;
	electronvolt=(edtValue)*1000.00;
	erg=(edtValue)*1.60217733E-9;
	gigawatthour=(edtValue)*4.450492583E-29;
	megawatthour=(edtValue)*4.450492583E-26;
	kilowattsecond=(edtValue)*1.60217733E-19;
	wattsecond=(edtValue)*1.60217733E-16;
	newtonmeter=(edtValue)*1.60217733E-16;
	horsepowerhour=(edtValue)*5.968208865E-23;
	kilocalorieIT=(edtValue)*3.826734809E-20;
	kilocalorieth=(edtValue)*3.829295721E-20;
	calorieit=(edtValue)*3.826734809E-17;
	calorieth=(edtValue)*3.829295721E-17;
	megaBtuIT=(edtValue)*1.518571103E-25;
	tonhour=(edtValue)*1.265475919E-23;
	fuelkl=(edtValue)*3.985750926E-27;
	fuelb=(edtValue)*2.510034881E-26;
	gigaton=(edtValue)*3.829295721E-35;
	megaton=(edtValue)*3.829295721E-32;
	kiloton=(edtValue)*3.829295721E-29;
	ton=(edtValue)*3.829295721E-26;
	dynecm=(edtValue)*1.60217733E-9;
	gfm=(edtValue)*1.633766199E-14;
	gfcm=(edtValue)*1.633766199E-12;
	kgfcm=(edtValue)*1.633766199E-15;
	kgfm=(edtValue)*1.633766199E-17;
	kpm=(edtValue)*1.633766199E-17;
	pff=(edtValue)*1.181705355E-16;
	pfi=(edtValue)*1.418046426E-15;
	ofi=(edtValue)*2.268874281E-14;
	fp=(edtValue)*1.181705355E-16;
	ip=(edtValue)*1.418046426E-15;
	io=(edtValue)*2.268874281E-14;
	pdlft=(edtValue)*3.802024555E-15;
	therm=(edtValue)*1.518570891E-24;
	thermec=(edtValue)*1.518570891E-24;
	thermus=(edtValue)*1.518933688E-24;
	Hartree=(edtValue)*36.749308825;
	Rydberg=(edtValue)*73.49861765;
	
	
	 break;
case "Electron-volt - eV":
	
   joule=(edtValue)*1.60217733E-19;
	kilojoule=(edtValue)*1.60217733E-22;
	kilowatthour=(edtValue)*4.450492583E-26;
	watthour=(edtValue)*4.450492583E-23;
	calorie=(edtValue)*3.826734809E-23;
	horsepower=(edtValue)*6.050985923E-26;
	BtuIT=(edtValue)*1.518571103E-22;
	Btuth=(edtValue)*1.519587736E-22;
	gigajoule=(edtValue)*1.60217733E-28;
	megajoule=(edtValue)*1.60217733E-25;
	millijoule=(edtValue)*1.60217733E-16;
	microjoule=(edtValue)*1.60217733E-13;
	nanojoule=(edtValue)*1.60217733E-10;
	attojoule=(edtValue)*0.160217733;
	megaelectronvolt=(edtValue)*0.000001;
	kiloelectronvolt=(edtValue)*0.001;
	electronvolt=(edtValue)*1;
	erg=(edtValue)*1.60217733E-12;
	gigawatthour=(edtValue)*4.450492583E-32;
	megawatthour=(edtValue)*4.450492583E-29;
	kilowattsecond=(edtValue)*1.60217733E-22;
	wattsecond=(edtValue)*1.60217733E-19;
	newtonmeter=(edtValue)*1.60217733E-19;
	horsepowerhour=(edtValue)*5.968208865E-26;
	kilocalorieIT=(edtValue)*3.826734809E-23;
	kilocalorieth=(edtValue)*3.829295721E-23;
	calorieit=(edtValue)*3.826734809E-20;
	calorieth=(edtValue)*3.829295721E-20;
	megaBtuIT=(edtValue)*1.518571103E-28;
	tonhour=(edtValue)*1.265475919E-26;
	fuelkl=(edtValue)*3.985750926E-30;
	fuelb=(edtValue)*2.510034881E-29;
	gigaton=(edtValue)*3.829295721E-38;
	megaton=(edtValue)*3.829295721E-35;
	kiloton=(edtValue)*3.829295721E-32;
	ton=(edtValue)*3.829295721E-29;
	dynecm=(edtValue)*1.60217733E-12;
	gfm=(edtValue)*1.633766199E-17;
	gfcm=(edtValue)*1.633766199E-15;
	kgfcm=(edtValue)*1.633766199E-18;
	kgfm=(edtValue)*1.633766199E-20;
	kpm=(edtValue)*1.633766199E-20;
	pff=(edtValue)*1.181705355E-19;
	pfi=(edtValue)*1.418046426E-18;
	ofi=(edtValue)*2.268874281E-17;
	fp=(edtValue)*1.181705355E-19;
	ip=(edtValue)*1.418046426E-18;
	io=(edtValue)*2.268874281E-17;
	pdlft=(edtValue)*3.802024555E-18;
	therm=(edtValue)*1.518570891E-27;
	thermec=(edtValue)*1.518570891E-27;
	thermus=(edtValue)*1.518933688E-27;
	Hartree=(edtValue)*0.0367493088;
	Rydberg=(edtValue)*0.0734986176;
	
	
	 break;
	 
case "Erg - erg":

 joule=(edtValue)*1.E-7;
	kilojoule=(edtValue)*9.999999999E-11;
	kilowatthour=(edtValue)*2.777777777E-14;
	watthour=(edtValue)*2.777777777E-11;
	calorie=(edtValue)*2.388458966E-11;
	horsepower=(edtValue)*3.776726714E-14;
	BtuIT=(edtValue)*9.478171203E-11;
	Btuth=(edtValue)*9.484516527E-11;
	gigajoule=(edtValue)*1.E-16;
	megajoule=(edtValue)*1.E-13;
	millijoule=(edtValue)*0.0001;
	microjoule=(edtValue)*0.1;
	nanojoule=(edtValue)*100;
	attojoule=(edtValue)*100000000000.00;
	megaelectronvolt=(edtValue)*624150.63631;
	kiloelectronvolt=(edtValue)*624150636.31;
	electronvolt=(edtValue)*624150636309.00;
	erg=(edtValue)*1;
	gigawatthour=(edtValue)*2.777777777E-20;
	megawatthour=(edtValue)*2.777777777E-17;
	kilowattsecond=(edtValue)*9.999999999E-11;
	wattsecond=(edtValue)*1.E-7;
	newtonmeter=(edtValue)*1.E-7;
	horsepowerhour=(edtValue)*3.725061361E-14;
	kilocalorieIT=(edtValue)*2.388458966E-11;
	kilocalorieth=(edtValue)*2.390057361E-11;
	calorieit=(edtValue)*2.388458966E-8;
	calorieth=(edtValue)*2.390057361E-8;
	megaBtuIT=(edtValue)*9.478171203E-17;
	tonhour=(edtValue)*7.898476002E-15;
	fuelkl=(edtValue)*2.487708977E-18;
	fuelb=(edtValue)*1.566639868E-17;
	gigaton=(edtValue)*2.390057361E-26;
	megaton=(edtValue)*2.390057361E-23;
	kiloton=(edtValue)*2.390057361E-20;
	ton=(edtValue)*2.390057361E-17;
	dynecm=(edtValue)*1;
	gfm=(edtValue)*0.0000101972;
	gfcm=(edtValue)*0.0010197162;
	kgfcm=(edtValue)*0.0000010197;
	kgfm=(edtValue)*1.019716213E-8;
	kpm=(edtValue)*1.019716213E-8;
	pff=(edtValue)*7.375621493E-8;
	pfi=(edtValue)*8.850745791E-7;
	ofi=(edtValue)*0.0000141612;
	fp=(edtValue)*7.375621493E-8;
	ip=(edtValue)*8.850745791E-7;
	io=(edtValue)*0.0000141612;
	pdlft=(edtValue)*0.000002373;
	therm=(edtValue)*9.478169879E-16;
	thermec=(edtValue)*9.478169879E-16;
	thermus=(edtValue)*9.480434279E-16;
	Hartree=(edtValue)*22937104487.00;
	Rydberg=(edtValue)*45874208974.00;


break;

case "Giga watt-hour - GW*h":

 joule=(edtValue)*3600000000000.00;
	kilojoule=(edtValue)*3600000000.00;
	kilowatthour=(edtValue)*1000000;
	watthour=(edtValue)*1000000000;
	calorie=(edtValue)*859845227.86;
	horsepower=(edtValue)*1359621.6173;
	BtuIT=(edtValue)*3412141633.1;
	Btuth=(edtValue)*3414425949.7;
	gigajoule=(edtValue)*3600;
	megajoule=(edtValue)*3600000;
	millijoule=(edtValue)*3599999999999971.00;
	microjoule=(edtValue)*3599999999999971300.00;
	nanojoule=(edtValue)*3.599999999E+21;
	attojoule=(edtValue)*3.599999999E+30;
	megaelectronvolt=(edtValue)*2.24694229E+25;
	kiloelectronvolt=(edtValue)*2.24694229E+28;
	electronvolt=(edtValue)*2.24694229E+31;
	erg=(edtValue)*35999999999999710000.00;
	gigawatthour=(edtValue)*1;
	megawatthour=(edtValue)*1000;
	kilowattsecond=(edtValue)*3600000000.00;
	wattsecond=(edtValue)*3600000000000.00;
	newtonmeter=(edtValue)*3600000000000.00;
	horsepowerhour=(edtValue)*1341022.09;
	kilocalorieIT=(edtValue)*859845227.86;
	kilocalorieth=(edtValue)*860420650.1;
	calorieit=(edtValue)*859845227859.00;
	calorieth=(edtValue)*860420650096.00;
	megaBtuIT=(edtValue)*3412.1416331;
	tonhour=(edtValue)*284345.13609;
	fuelkl=(edtValue)*89.557523179;
	fuelb=(edtValue)*563.99035258;
	gigaton=(edtValue)*8.6042065E-7;
	megaton=(edtValue)*0.0008604207;
	kiloton=(edtValue)*0.8604206501;
	ton=(edtValue)*860.4206501;
	dynecm=(edtValue)*35999999999999710000.00;
	gfm=(edtValue)*367097836683381.00;
	gfcm=(edtValue)*36709783668338104.00;
	kgfcm=(edtValue)*36709783668338.00;
	kgfm=(edtValue)*367097836683.00;
	kpm=(edtValue)*367097836683.00;
	pff=(edtValue)*2655223737480.00;
	pfi=(edtValue)*31862684849760.00;
	ofi=(edtValue)*509802957596156.00;
	fp=(edtValue)*2655223737480.00;
	ip=(edtValue)*31862684849760.00;
	io=(edtValue)*509802957596156.00;
	pdlft=(edtValue)*85429297645559.00;
	therm=(edtValue)*34121.411565;
	thermec=(edtValue)*34121.411565;
	thermus=(edtValue)*34129.563407;
	Hartree=(edtValue)*8.257357615E+29;
	Rydberg=(edtValue)*1.651471523E+30;



break;
case "Mega watt-hour - MW*h":

 joule=(edtValue)*3600000000.00;
	kilojoule=(edtValue)*3600000;
	kilowatthour=(edtValue)*1000;
	watthour=(edtValue)*1000000;
	calorie=(edtValue)*859845.22786;
	horsepower=(edtValue)*1359.6216173;
	BtuIT=(edtValue)*3412141.6331;
	Btuth=(edtValue)*3414425.9497;
	gigajoule=(edtValue)*3.6;
	megajoule=(edtValue)*3600;
	millijoule=(edtValue)*3600000000000.00;
	microjoule=(edtValue)*3599999999999972.00;
	nanojoule=(edtValue)*3599999999999971300.00;
	attojoule=(edtValue)*3.599999999E+27;
	megaelectronvolt=(edtValue)*2.24694229E+22;
	kiloelectronvolt=(edtValue)*2.24694229E+25;
	electronvolt=(edtValue)*2.24694229E+28;
	erg=(edtValue)*35999999999999710.00;
	gigawatthour=(edtValue)*0.001;
	megawatthour=(edtValue)*1;
	kilowattsecond=(edtValue)*3600000;
	wattsecond=(edtValue)*3600000000.00;
	newtonmeter=(edtValue)*3600000000.00;
	horsepowerhour=(edtValue)*1341.02209;
	kilocalorieIT=(edtValue)*859845.22786;
	kilocalorieth=(edtValue)*860420.6501;
	calorieit=(edtValue)*859845227.86;
	calorieth=(edtValue)*860420650.1;
	megaBtuIT=(edtValue)*3.4121416331;
	tonhour=(edtValue)*284.34513609;
	fuelkl=(edtValue)*0.0895575232;
	fuelb=(edtValue)*0.5639903526;
	gigaton=(edtValue)*8.6042065E-10;
	megaton=(edtValue)*8.6042065E-7;
	kiloton=(edtValue)*0.0008604207;
	ton=(edtValue)*0.8604206501;
	dynecm=(edtValue)*35999999999999710.00;
	gfm=(edtValue)*367097836683.00;
	gfcm=(edtValue)*36709783668338.00;
	kgfcm=(edtValue)*36709783668.00;
	kgfm=(edtValue)*367097836.68;
	kpm=(edtValue)*367097836.68;
	pff=(edtValue)*2655223737.5;
	pfi=(edtValue)*31862684850.00;
	ofi=(edtValue)*509802957596.00;
	fp=(edtValue)*2655223737.5;
	ip=(edtValue)*31862684850.00;
	io=(edtValue)*509802957596.00;
	pdlft=(edtValue)*85429297646.00;
	therm=(edtValue)*34.121411565;
	thermec=(edtValue)*34.121411565;
	thermus=(edtValue)*34.129563407;
	Hartree=(edtValue)*8.257357615E+26;
	Rydberg=(edtValue)*1.651471523E+27;

break;

case "Kilo watt-second - kW*s":
	
	joule=(edtValue)*1000;
	kilojoule=(edtValue)*1;
	kilowatthour=(edtValue)*0.0002777778;
	watthour=(edtValue)*0.2777777778;
	calorie=(edtValue)*0.2388458966;
	horsepower=(edtValue)*0.0003776727;
	BtuIT=(edtValue)*0.9478171203;
	Btuth=(edtValue)*0.9484516527;
	gigajoule=(edtValue)*0.000001;
	megajoule=(edtValue)*0.001;
	millijoule=(edtValue)*1000000;
	microjoule=(edtValue)*1000000000;
	nanojoule=(edtValue)*1000000000000.00;
	attojoule=(edtValue)*1.E+21;
	megaelectronvolt=(edtValue)*6241506363094002.00;
	kiloelectronvolt=(edtValue)*6241506363094001000.00;
	electronvolt=(edtValue)*6.241506363E+21;
	erg=(edtValue)*10000000000.00;
	gigawatthour=(edtValue)*2.777777777E-10;
	megawatthour=(edtValue)*2.777777777E-7;
	kilowattsecond=(edtValue)*1;
	wattsecond=(edtValue)*1000;
	newtonmeter=(edtValue)*1000;
	horsepowerhour=(edtValue)*0.0003725061;
	kilocalorieIT=(edtValue)*0.2388458966;
	kilocalorieth=(edtValue)*0.2390057361;
	calorieit=(edtValue)*238.84589663;
	calorieth=(edtValue)*239.00573614;
	megaBtuIT=(edtValue)*9.478171203E-7;
	tonhour=(edtValue)*0.0000789848;
	fuelkl=(edtValue)*2.487708977E-8;
	fuelb=(edtValue)*1.566639868E-7;
	gigaton=(edtValue)*2.390057361E-16;
	megaton=(edtValue)*2.390057361E-13;
	kiloton=(edtValue)*2.390057361E-10;
	ton=(edtValue)*2.390057361E-7;
	dynecm=(edtValue)*10000000000.00;
	gfm=(edtValue)*101971.6213;
	gfcm=(edtValue)*10197162.13;
	kgfcm=(edtValue)*10197.16213;
	kgfm=(edtValue)*101.9716213;
	kpm=(edtValue)*101.9716213;
	pff=(edtValue)*737.5621493;
	pfi=(edtValue)*8850.7457916;
	ofi=(edtValue)*141611.93267;
	fp=(edtValue)*737.5621493;
	ip=(edtValue)*8850.7457916;
	io=(edtValue)*141611.93267;
	pdlft=(edtValue)*23730.360457;
	therm=(edtValue)*0.0000094782;
	thermec=(edtValue)*0.0000094782;
	thermus=(edtValue)*0.0000094804;
	Hartree=(edtValue)*229371044869060000000.00;
	Rydberg=(edtValue)*458742089738120000000.00;
	
	
	 break;

case "Watt-second - W*s":

joule=(edtValue)*1;
kilojoule=(edtValue)*0.001;
kilowatthour=(edtValue)*2.777777777E-7;
watthour=(edtValue)*0.0002777778;
calorie=(edtValue)*0.0002388459;
horsepower=(edtValue)*3.776726714E-7;
BtuIT=(edtValue)*0.0009478171;
Btuth=(edtValue)*0.0009484517;
gigajoule=(edtValue)*9.999999999E-10;
megajoule=(edtValue)*0.000001;
millijoule=(edtValue)*1000;
microjoule=(edtValue)*1000000;
nanojoule=(edtValue)*1000000000;
attojoule=(edtValue)*1000000000000000000.00;
megaelectronvolt=(edtValue)*6241506363094.00;
kiloelectronvolt=(edtValue)*6241506363094000.00;
electronvolt=(edtValue)*6241506363094000000.00;
erg=(edtValue)*10000000;
gigawatthour=(edtValue)*2.777777777E-13;
megawatthour=(edtValue)*2.777777777E-10;
kilowattsecond=(edtValue)*0.001;
wattsecond=(edtValue)*1;
newtonmeter=(edtValue)*1;
horsepowerhour=(edtValue)*3.725061361E-7;
kilocalorieIT=(edtValue)*0.0002388459;
kilocalorieth=(edtValue)*0.0002390057;
calorieit=(edtValue)*0.2388458966;
calorieth=(edtValue)*0.2390057361;
megaBtuIT=(edtValue)*9.478171203E-10;
tonhour=(edtValue)*7.898476002E-8;
fuelkl=(edtValue)*2.487708977E-11;
fuelb=(edtValue)*1.566639868E-10;
gigaton=(edtValue)*2.390057361E-19;
megaton=(edtValue)*2.390057361E-16;
kiloton=(edtValue)*2.390057361E-13;
ton=(edtValue)*2.390057361E-10;
dynecm=(edtValue)*10000000;
gfm=(edtValue)*101.9716213;
gfcm=(edtValue)*10197.16213;
kgfcm=(edtValue)*10.19716213;
kgfm=(edtValue)*0.1019716213;
kpm=(edtValue)*0.1019716213;
pff=(edtValue)*0.7375621493;
pfi=(edtValue)*8.8507457916;
ofi=(edtValue)*141.61193267;
fp=(edtValue)*0.7375621493;
ip=(edtValue)*8.8507457916;
io=(edtValue)*141.61193267;
pdlft=(edtValue)*23.730360457;
therm=(edtValue)*9.478169879E-9;
thermec=(edtValue)*9.478169879E-9;
thermus=(edtValue)*9.480434279E-9;
Hartree=(edtValue)*229371044869059970.00;
Rydberg=(edtValue)*458742089738119940.00;


 break;
case "Newton meter - N*m":

joule=(edtValue)*1;
kilojoule=(edtValue)*0.001;
kilowatthour=(edtValue)*2.777777777E-7;
watthour=(edtValue)*0.0002777778;
calorie=(edtValue)*0.0002388459;
horsepower=(edtValue)*3.776726714E-7;
BtuIT=(edtValue)*0.0009478171;
Btuth=(edtValue)*0.0009484517;
gigajoule=(edtValue)*9.999999999E-10;
megajoule=(edtValue)*0.000001;
millijoule=(edtValue)*1000;
microjoule=(edtValue)*1000000;
nanojoule=(edtValue)*1000000000;
attojoule=(edtValue)*1000000000000000000.00;
megaelectronvolt=(edtValue)*6241506363094.00;
kiloelectronvolt=(edtValue)*6241506363094000.00;
electronvolt=(edtValue)*6241506363094000000.00;
erg=(edtValue)*10000000;
gigawatthour=(edtValue)*2.777777777E-13;
megawatthour=(edtValue)*2.777777777E-10;
kilowattsecond=(edtValue)*0.001;
wattsecond=(edtValue)*1;
newtonmeter=(edtValue)*1;
horsepowerhour=(edtValue)*3.725061361E-7;
kilocalorieIT=(edtValue)*0.0002388459;
kilocalorieth=(edtValue)*0.0002390057;
calorieit=(edtValue)*0.2388458966;
calorieth=(edtValue)*0.2390057361;
megaBtuIT=(edtValue)*9.478171203E-10;
tonhour=(edtValue)*7.898476002E-8;
fuelkl=(edtValue)*2.487708977E-11;
fuelb=(edtValue)*1.566639868E-10;
gigaton=(edtValue)*2.390057361E-19;
megaton=(edtValue)*2.390057361E-16;
kiloton=(edtValue)*2.390057361E-13;
ton=(edtValue)*2.390057361E-10;
dynecm=(edtValue)*10000000;
gfm=(edtValue)*101.9716213;
gfcm=(edtValue)*10197.16213;
kgfcm=(edtValue)*10.19716213;
kgfm=(edtValue)*0.1019716213;
kpm=(edtValue)*0.1019716213;
pff=(edtValue)*0.7375621493;
pfi=(edtValue)*8.8507457916;
ofi=(edtValue)*141.61193267;
fp=(edtValue)*0.7375621493;
ip=(edtValue)*8.8507457916;
io=(edtValue)*141.61193267;
pdlft=(edtValue)*23.730360457;
therm=(edtValue)*9.478169879E-9;
thermec=(edtValue)*9.478169879E-9;
thermus=(edtValue)*9.480434279E-9;
Hartree=(edtValue)*229371044869059970.00;
Rydberg=(edtValue)*458742089738119940.00;


break;

case "Horse power hour - hp*h":

joule=(edtValue)*2684519.5369;
kilojoule=(edtValue)*2684.5195369;
kilowatthour=(edtValue)*0.7456998714;
watthour=(edtValue)*745.69987136;
calorie=(edtValue)*641.1864758;
horsepower=(edtValue)*1.0138696651;
BtuIT=(edtValue)*2544.4335769;
Btuth=(edtValue)*2546.1369915;
gigajoule=(edtValue)*0.0026845195;
megajoule=(edtValue)*2.6845195369;
millijoule=(edtValue)*2684519536.9;
microjoule=(edtValue)*2684519536886.00;
nanojoule=(edtValue)*2684519536885561.00;
attojoule=(edtValue)*2.684519536E+24;
megaelectronvolt=(edtValue)*16755445771321390000.00;
kiloelectronvolt=(edtValue)*1.675544577E+22;
electronvolt=(edtValue)*1.675544577E+250;
erg=(edtValue)*26845195368856.00;
gigawatthour=(edtValue)*7.456998713E-7;
megawatthour=(edtValue)*0.0007456999;
kilowattsecond=(edtValue)*2684.5195369;
wattsecond=(edtValue)*2684519.5369;
newtonmeter=(edtValue)*2684519.5369;
horsepowerhour=(edtValue)*1;
kilocalorieIT=(edtValue)*641.1864758;
kilocalorieth=(edtValue)*641.61556809;
calorieit=(edtValue)*641186.4758;
calorieth=(edtValue)*641615.56809;
megaBtuIT=(edtValue)*0.0025444336;
tonhour=(edtValue)*0.2120361314;
fuelkl=(edtValue)*0.000066783;
fuelb=(edtValue)*0.0004205675;
gigaton=(edtValue)*6.41615568E-13;
megaton=(edtValue)*6.41615568E-10;
kiloton=(edtValue)*6.41615568E-7;
ton=(edtValue)*0.0006416156;
dynecm=(edtValue)*26845195368856.00;
gfm=(edtValue)*273744809.59;
gfcm=(edtValue)*27374480959.00;
kgfcm=(edtValue)*27374480.959;
kgfm=(edtValue)*273744.80959;
kpm=(edtValue)*273744.80959;
pff=(edtValue)*1979999.9995;
pfi=(edtValue)*23759999.994;
ofi=(edtValue)*380159999.9;
fp=(edtValue)*1979999.9995;
ip=(edtValue)*23759999.994;
io=(edtValue)*380159999.9;
pdlft=(edtValue)*63704616.264;
therm=(edtValue)*0.0254443322;
thermec=(edtValue)*0.0254443322;
thermus=(edtValue)*0.025450411;
Hartree=(edtValue)*6.157510511E+23;
Rydberg=(edtValue)*1.231502102E+24;



break;
case "Kilo calorie(IT) - kcal(IT)":

joule=(edtValue)*4186.8;
kilojoule=(edtValue)*4.1868;
kilowatthour=(edtValue)*0.001163;
watthour=(edtValue)*1.163;
calorie=(edtValue)*1;
horsepower=(edtValue)*0.0015812399;
BtuIT=(edtValue)*3.9683207193;
Btuth=(edtValue)*3.9709773795;
gigajoule=(edtValue)*0.0000041868;
megajoule=(edtValue)*0.0041868;
millijoule=(edtValue)*4186800;
microjoule=(edtValue)*4186800000.00;
nanojoule=(edtValue)*4186800000000.00;
attojoule=(edtValue)*4.186799999E+21;
megaelectronvolt=(edtValue)*26131938841001516.00;
kiloelectronvolt=(edtValue)*26131938841001517000.00;
electronvolt=(edtValue)*2.613193884E+22;
erg=(edtValue)*41868000000.00;
gigawatthour=(edtValue)*1.162999999E-9;
megawatthour=(edtValue)*0.000001163;
kilowattsecond=(edtValue)*4.1868;
wattsecond=(edtValue)*4186.8;
newtonmeter=(edtValue)*4186.8;
horsepowerhour=(edtValue)*0.0015596087;
kilocalorieIT=(edtValue)*1;
kilocalorieth=(edtValue)*1.0006692161;
calorieit=(edtValue)*1000;
calorieth=(edtValue)*1000.6692161;
megaBtuIT=(edtValue)*0.0000039683;
tonhour=(edtValue)*0.0003306934;
fuelkl=(edtValue)*1.041553994E-7;
fuelb=(edtValue)*6.5592078E-7;
gigaton=(edtValue)*1.000669216E-15;
megaton=(edtValue)*1.000669216E-12;
kiloton=(edtValue)*1.000669216E-9;
ton=(edtValue)*0.0000010007;
dynecm=(edtValue)*41868000000.00;
gfm=(edtValue)*426934.78406;
gfcm=(edtValue)*42693478.406;
kgfcm=(edtValue)*42693.478406;
kgfm=(edtValue)*426.93478406;
kpm=(edtValue)*426.93478406;
pff=(edtValue)*3088.0252067;
pfi=(edtValue)*37056.30248;
ofi=(edtValue)*592900.83968;
fp=(edtValue)*3088.0252067;
ip=(edtValue)*37056.30248;
io=(edtValue)*592900.83968;
pdlft=(edtValue)*99354.273162;
therm=(edtValue)*0.0000396832;
thermec=(edtValue)*0.0000396832;
thermus=(edtValue)*0.0000396927;
Hartree=(edtValue)*960330690657764000000.00;
Rydberg=(edtValue)*1.920661381E+21;

break;
case "Kilo calorie(th) - kcal(th)":

joule=(edtValue)*4184;
kilojoule=(edtValue)*4.184;
kilowatthour=(edtValue)*0.0011622222;
watthour=(edtValue)*1.1622222222;
calorie=(edtValue)*0.9993312315;
horsepower=(edtValue)*0.0015801825;
BtuIT=(edtValue)*3.9656668314;
Btuth=(edtValue)*3.9683217149;
gigajoule=(edtValue)*0.000004184;
megajoule=(edtValue)*0.004184;
millijoule=(edtValue)*4184000;
microjoule=(edtValue)*4184000000.00;
nanojoule=(edtValue)*4184000000000.00;
attojoule=(edtValue)*4.183999999E+21;
megaelectronvolt=(edtValue)*26114462623185000.00;
kiloelectronvolt=(edtValue)*26114462623185002000.00;
electronvolt=(edtValue)*2.611446262E+22;
erg=(edtValue)*41840000000.00;
gigawatthour=(edtValue)*1.162222222E-9;
megawatthour=(edtValue)*0.0000011622;
kilowattsecond=(edtValue)*4.184;
wattsecond=(edtValue)*4184;
newtonmeter=(edtValue)*4184;
horsepowerhour=(edtValue)*0.0015585657;
kilocalorieIT=(edtValue)*0.9993312315;
kilocalorieth=(edtValue)*1;
calorieit=(edtValue)*999.33123149;
calorieth=(edtValue)*1000;
megaBtuIT=(edtValue)*0.0000039657;
tonhour=(edtValue)*0.0003304722;
fuelkl=(edtValue)*1.040857436E-7;
fuelb=(edtValue)*6.554821208E-7;
gigaton=(edtValue)*1.E-15;
megaton=(edtValue)*1.E-12;
kiloton=(edtValue)*1.E-9;
ton=(edtValue)*0.000001;
dynecm=(edtValue)*41840000000.00;
gfm=(edtValue)*426649.26352;
gfcm=(edtValue)*42664926.352;
kgfcm=(edtValue)*42664.926352;
kgfm=(edtValue)*426.64926352;
kpm=(edtValue)*426.64926352;
pff=(edtValue)*3085.9600327;
pfi=(edtValue)*37031.520392;
ofi=(edtValue)*592504.32627;
fp=(edtValue)*3085.9600327;
ip=(edtValue)*37031.520392;
io=(edtValue)*592504.32627;
pdlft=(edtValue)*99287.828153;
therm=(edtValue)*0.0000396567;
thermec=(edtValue)*0.0000396567;
thermus=(edtValue)*0.0000396661;
Hartree=(edtValue)*959688451732136100000.00;
Rydberg=(edtValue)*1.919376903E+21;


 break;
case "Calorie(IT) - cal(IT),cal":

joule=(edtValue)*4.1868;
kilojoule=(edtValue)*0.0041868;
kilowatthour=(edtValue)*0.000001163;
watthour=(edtValue)*0.001163;
calorie=(edtValue)*0.001;
horsepower=(edtValue)*0.0000015812;
BtuIT=(edtValue)*0.0039683207;
Btuth=(edtValue)*0.0039709774;
gigajoule=(edtValue)*4.186799999E-9;
megajoule=(edtValue)*0.0000041868;
millijoule=(edtValue)*4186.8;
microjoule=(edtValue)*4186800;
nanojoule=(edtValue)*4186800000.00;
attojoule=(edtValue)*4186799999999929300.00;
megaelectronvolt=(edtValue)*26131938841002.00;
kiloelectronvolt=(edtValue)*26131938841001520.00;
electronvolt=(edtValue)*26131938841001517000.00;
erg=(edtValue)*41868000;
gigawatthour=(edtValue)*1.162999999E-12;
megawatthour=(edtValue)*1.162999999E-9;
kilowattsecond=(edtValue)*0.0041868;
wattsecond=(edtValue)*4.1868;
newtonmeter=(edtValue)*4.1868;
horsepowerhour=(edtValue)*0.0000015596;
kilocalorieIT=(edtValue)*0.001;
kilocalorieth=(edtValue)*0.0010006692;
calorieit=(edtValue)*1;
calorieth=(edtValue)*1.0006692161;
megaBtuIT=(edtValue)*3.968320719E-9;
tonhour=(edtValue)*3.306933932E-7;
fuelkl=(edtValue)*1.041553994E-10;
fuelb=(edtValue)*6.5592078E-10;
gigaton=(edtValue)*1.000669216E-18;
megaton=(edtValue)*1.000669216E-15;
kiloton=(edtValue)*1.000669216E-12;
ton=(edtValue)*1.000669216E-9;
dynecm=(edtValue)*41868000;
gfm=(edtValue)*426.93478406;
gfcm=(edtValue)*42693.478406;
kgfcm=(edtValue)*42.693478406;
kgfm=(edtValue)*0.4269347841;
kpm=(edtValue)*0.4269347841;
pff=(edtValue)*3.0880252067;
pfi=(edtValue)*37.05630248;
ofi=(edtValue)*592.90083968;
fp=(edtValue)*3.0880252067;
ip=(edtValue)*37.05630248;
io=(edtValue)*592.90083968;
pdlft=(edtValue)*99.354273162;
therm=(edtValue)*3.968320164E-8;
thermec=(edtValue)*3.968320164E-8;
thermus=(edtValue)*3.969268224E-8;
Hartree=(edtValue)*960330690657764100.00;
Rydberg=(edtValue)*1920661381315528200.00;


 break;
case "Calorie(th) - cal(th)":

joule=(edtValue)*4.184;
kilojoule=(edtValue)*0.004184;
kilowatthour=(edtValue)*0.0000011622;
watthour=(edtValue)*0.0011622222;
calorie=(edtValue)*0.0009993312;
horsepower=(edtValue)*0.0000015802;
BtuIT=(edtValue)*0.0039656668;
Btuth=(edtValue)*0.0039683217;
gigajoule=(edtValue)*4.183999999E-9;
megajoule=(edtValue)*0.000004184;
millijoule=(edtValue)*4184;
microjoule=(edtValue)*4184000;
nanojoule=(edtValue)*4184000000.000;
attojoule=(edtValue)*4183999999999953400.00;
megaelectronvolt=(edtValue)*26114462623185.00;
kiloelectronvolt=(edtValue)*26114462623185004.00;
electronvolt=(edtValue)*26114462623185002000.00;
erg=(edtValue)*41840000;
gigawatthour=(edtValue)*1.162222222E-12;
megawatthour=(edtValue)*1.162222222E-9;
kilowattsecond=(edtValue)*0.004184;
wattsecond=(edtValue)*4.184;
newtonmeter=(edtValue)*4.184;
horsepowerhour=(edtValue)*0.0000015586;
kilocalorieIT=(edtValue)*0.0009993312;
kilocalorieth=(edtValue)*0.001;
calorieit=(edtValue)*0.9993312315;
calorieth=(edtValue)*1;
megaBtuIT=(edtValue)*3.965666831E-9;
tonhour=(edtValue)*3.304722359E-7;
fuelkl=(edtValue)*1.040857436E-10;
fuelb=(edtValue)*6.554821208E-10;
gigaton=(edtValue)*1.E-18;
megaton=(edtValue)*1.E-15;
kiloton=(edtValue)*1.E-12;
ton=(edtValue)*1.E-9;
dynecm=(edtValue)*41840000;
gfm=(edtValue)*426.64926352;
gfcm=(edtValue)*42664.926352;
kgfcm=(edtValue)*42.664926352;
kgfm=(edtValue)*0.4266492635;
kpm=(edtValue)*0.4266492635;
pff=(edtValue)*3.0859600327;
pfi=(edtValue)*37.031520392;
ofi=(edtValue)*592.50432627;
fp=(edtValue)*3.0859600327;
ip=(edtValue)*37.031520392;
io=(edtValue)*592.50432627;
pdlft=(edtValue)*99.287828153;
therm=(edtValue)*3.965666277E-8;
thermec=(edtValue)*3.965666277E-8;
thermus=(edtValue)*3.966613702E-8;
Hartree=(edtValue)*959688451732136200.00;
Rydberg=(edtValue)*1919376903464272400.00;


break;

case "Mega Btu (IT) - MBtu(IT)":

joule=(edtValue)*1055055852.6;
kilojoule=(edtValue)*1055055.8526;
kilowatthour=(edtValue)*293.07107017;
watthour=(edtValue)*293071.07017;
calorie=(edtValue)*251995.76111;
horsepower=(edtValue)*398.46576241;
BtuIT=(edtValue)*1000000;
Btuth=(edtValue)*1000669.4671;
gigajoule=(edtValue)*1.0550558526;
megajoule=(edtValue)*1055.0558526;
millijoule=(edtValue)*1055055852620.00;
microjoule=(edtValue)*1055055852619997.00;
nanojoule=(edtValue)*1055055852619996800.00;
attojoule=(edtValue)*1.055055852E+27;
megaelectronvolt=(edtValue)*6.585137817E+21;
kiloelectronvolt=(edtValue)*6.585137817E+24;
electronvolt=(edtValue)*6.585137817E+27;
erg=(edtValue)*10550558526199968.00;
gigawatthour=(edtValue)*0.0002930711;
megawatthour=(edtValue)*0.2930710702;
kilowattsecond=(edtValue)*1055055.8526;
wattsecond=(edtValue)*1055055852.6;
newtonmeter=(edtValue)*1055055852.6;
horsepowerhour=(edtValue)*393.01477904;
kilocalorieIT=(edtValue)*251995.76111;
kilocalorieth=(edtValue)*252164.40072;
calorieit=(edtValue)*251995761.11;
calorieth=(edtValue)*252164400.72;
megaBtuIT=(edtValue)*1;
tonhour=(edtValue)*83.333333333;
fuelkl=(edtValue)*0.0262467192;
fuelb=(edtValue)*0.1652892562;
gigaton=(edtValue)*2.521644007E-10;
megaton=(edtValue)*2.521644007E-7;
kiloton=(edtValue)*0.0002521644;
ton=(edtValue)*0.2521644007;
dynecm=(edtValue)*10550558526199968.00;
gfm=(edtValue)*107585755855.00;
gfcm=(edtValue)*10758575585471.00;
kgfcm=(edtValue)*10758575585.00;
kgfm=(edtValue)*107585755.85;
kpm=(edtValue)*107585755.85;
pff=(edtValue)*778169262.29;
pfi=(edtValue)*9338031147.5;
ofi=(edtValue)*149408498360.00;
fp=(edtValue)*778169262.29;
ip=(edtValue)*9338031147.5;
io=(edtValue)*149408498360.00;
pdlft=(edtValue)*25036855685.00;
therm=(edtValue)*9.9999986031;
thermec=(edtValue)*9.9999986031;
thermus=(edtValue)*10.002387672;
Hartree=(edtValue)*2.419992633E+26;
Rydberg=(edtValue)*4.839985266E+26;



break;
case "Ton-hour (refrigeration) - ton*h":

joule=(edtValue)*12660670.231;
kilojoule=(edtValue)*12660.670231;
kilowatthour=(edtValue)*3.5168528421;
watthour=(edtValue)*3516.8528421;
calorie=(edtValue)*3023.9491333;
horsepower=(edtValue)*4.781589149;
BtuIT=(edtValue)*12000;
Btuth=(edtValue)*12008.033605;
gigajoule=(edtValue)*0.0126606702;
megajoule=(edtValue)*12.660670231;
millijoule=(edtValue)*12660670231.00;
microjoule=(edtValue)*12660670231440.00;
nanojoule=(edtValue)*12660670231439962.00;
attojoule=(edtValue)*1.266067023E+25;
megaelectronvolt=(edtValue)*79021653810567320000.00;
kiloelectronvolt=(edtValue)*7.902165381E+22;
electronvolt=(edtValue)*7.902165381E+25;
erg=(edtValue)*126606702314400.00;
gigawatthour=(edtValue)*0.0000035169;
megawatthour=(edtValue)*0.0035168528;
kilowattsecond=(edtValue)*12660.670231;
wattsecond=(edtValue)*12660670.231;
newtonmeter=(edtValue)*12660670.231;
horsepowerhour=(edtValue)*4.7161773485;
kilocalorieIT=(edtValue)*3023.9491333;
kilocalorieth=(edtValue)*3025.9728087;
calorieit=(edtValue)*3023949.1333;
calorieth=(edtValue)*3025972.8087;
megaBtuIT=(edtValue)*0.012;
tonhour=(edtValue)*1;
fuelkl=(edtValue)*0.0003149606;
fuelb=(edtValue)*0.0019834711;
gigaton=(edtValue)*3.025972808E-12;
megaton=(edtValue)*3.025972808E-9;
kiloton=(edtValue)*0.000003026;
ton=(edtValue)*0.0030259728;
dynecm=(edtValue)*126606702314400.00;
gfm=(edtValue)*1291029070.3;
gfcm=(edtValue)*129102907026.00;
kgfcm=(edtValue)*129102907.03;
kgfm=(edtValue)*1291029.0703;
kpm=(edtValue)*1291029.0703;
pff=(edtValue)*9338031.1475;
pfi=(edtValue)*112056373.77;
ofi=(edtValue)*1792901980.3;
fp=(edtValue)*9338031.1475;
ip=(edtValue)*112056373.77;
io=(edtValue)*1792901980.3;
pdlft=(edtValue)*300442268.22;
therm=(edtValue)*0.1199999832;
thermec=(edtValue)*0.1199999832;
thermus=(edtValue)*0.1200286521;
Hartree=(edtValue)*2.903991159E+24;
Rydberg=(edtValue)*5.807982319E+24;

break;
case "Fuel oil equivalent @kiloliter - kl":

joule=(edtValue)*40197627985.00;
kilojoule=(edtValue)*40197627.985;
kilowatthour=(edtValue)*11166.007774;
watthour=(edtValue)*11166007.774;
calorie=(edtValue)*9601038.4983;
horsepower=(edtValue)*15181.545548;
BtuIT=(edtValue)*38100000;
Btuth=(edtValue)*38125506.697;
gigajoule=(edtValue)*40.197627985;
megajoule=(edtValue)*40197.627985;
millijoule=(edtValue)*40197627984822.00;
microjoule=(edtValue)*40197627984822130.00;
nanojoule=(edtValue)*40197627984822125000.00;
attojoule=(edtValue)*4.019762798E+28;
megaelectronvolt=(edtValue)*2.508937508E+23;
kiloelectronvolt=(edtValue)*2.508937508E+26;
electronvolt=(edtValue)*2.508937508E+29;
erg=(edtValue)*401976279848221200.00;
gigawatthour=(edtValue)*0.0111660078;
megawatthour=(edtValue)*11.166007774;
kilowattsecond=(edtValue)*40197627.985;
wattsecond=(edtValue)*40197627985.00;
newtonmeter=(edtValue)*40197627985.00;
horsepowerhour=(edtValue)*14973.863081;
kilocalorieIT=(edtValue)*9601038.4983;
kilocalorieth=(edtValue)*9607463.6675;
calorieit=(edtValue)*9601038498.3;
calorieth=(edtValue)*9607463667.5;
megaBtuIT=(edtValue)*38.1;
tonhour=(edtValue)*3175;
fuelkl=(edtValue)*1;
fuelb=(edtValue)*6.2975206612;
gigaton=(edtValue)*9.607463667E-9;
megaton=(edtValue)*0.0000096075;
kiloton=(edtValue)*0.0096074637;
ton=(edtValue)*9.6074636675;
dynecm=(edtValue)*401976279848221200.00;
gfm=(edtValue)*4099017298064.00;
gfcm=(edtValue)*409901729806435.00;
kgfcm=(edtValue)*409901729806.00;
kgfm=(edtValue)*4099017298.1;
kpm=(edtValue)*4099017298.1;
pff=(edtValue)*29648248893.00;
pfi=(edtValue)*355778986719.00;
ofi=(edtValue)*5692463787503.00;
fp=(edtValue)*29648248893.00;
ip=(edtValue)*355778986719.00;
io=(edtValue)*5692463787503.00;
pdlft=(edtValue)*953904201600.00;
therm=(edtValue)*380.99994678;
thermec=(edtValue)*380.99994678;
thermus=(edtValue)*381.09097031;
Hartree=(edtValue)*9.220171932E+27;
Rydberg=(edtValue)*1.844034386E+28;


 break;
case "Fuel oil equivalent @barrel (US)  - bbl":

joule=(edtValue)*6383087908.4;
kilojoule=(edtValue)*6383087.9084;
kilowatthour=(edtValue)*1773.0799745;
watthour=(edtValue)*1773079.9745;
calorie=(edtValue)*1524574.3547;
horsepower=(edtValue)*2410.7178626;
BtuIT=(edtValue)*6050000;
Btuth=(edtValue)*6054050.276;
gigajoule=(edtValue)*6.3830879084;
megajoule=(edtValue)*6383.0879084;
millijoule=(edtValue)*6383087908351.00;
microjoule=(edtValue)*6383087908350898.00;
nanojoule=(edtValue)*6383087908350897000.00;
attojoule=(edtValue)*6.383087908E+27;
megaelectronvolt=(edtValue)*3.984008379E+22;
kiloelectronvolt=(edtValue)*3.984008379E+25;
electronvolt=(edtValue)*3.984008379E+28;
erg=(edtValue)*63830879083508970.00;
gigawatthour=(edtValue)*0.00177308;
megawatthour=(edtValue)*1.7730799745;
kilowattsecond=(edtValue)*6383087.9084;
wattsecond=(edtValue)*6383087908.4;
newtonmeter=(edtValue)*6383087908.4;
horsepowerhour=(edtValue)*2377.7394132;
kilocalorieIT=(edtValue)*1524574.3547;
kilocalorieth=(edtValue)*1525594.6244;
calorieit=(edtValue)*1524574354.7;
calorieth=(edtValue)*1525594624.4;
megaBtuIT=(edtValue)*6.05;
tonhour=(edtValue)*504.16666667;
fuelkl=(edtValue)*0.1587926509;
fuelb=(edtValue)*1;
gigaton=(edtValue)*1.525594624E-9;
megaton=(edtValue)*0.0000015256;
kiloton=(edtValue)*0.0015255946;
ton=(edtValue)*1.5255946244;
dynecm=(edtValue)*63830879083508970.00;
gfm=(edtValue)*650893822921.00;
gfcm=(edtValue)*65089382292097.00;
kgfcm=(edtValue)*65089382292.00;
kgfm=(edtValue)*650893822.92;
kpm=(edtValue)*650893822.92;
pff=(edtValue)*4707924036.9;
pfi=(edtValue)*56495088442.00;
ofi=(edtValue)*903921415076.00;
fp=(edtValue)*4707924036.9;
ip=(edtValue)*56495088442.00;
io=(edtValue)*903921415076.00;
pdlft=(edtValue)*151472976895.00;
therm=(edtValue)*60.499991549;
thermec=(edtValue)*60.499991549;
thermus=(edtValue)*60.514445417;
Hartree=(edtValue)*1.464095543E+27;
Rydberg=(edtValue)*2.928191086E+27;


 break;
case "Giga ton - Gton":

joule=(edtValue)*4183999999999953000.00;
kilojoule=(edtValue)*4183999999999952.00;
kilowatthour=(edtValue)*1162222222222.00;
watthour=(edtValue)*1162222222222218.00;
calorie=(edtValue)*999331231489449.00;
horsepower=(edtValue)*1580182457444.00;
BtuIT=(edtValue)*3965666831390886.00;
Btuth=(edtValue)*3968321714896755.00;
gigajoule=(edtValue)*4184000000.00;
megajoule=(edtValue)*4184000000000.00;
millijoule=(edtValue)*4.183999999E+21;
microjoule=(edtValue)*4.183999999E+24;
nanojoule=(edtValue)*4.183999999E+27;
attojoule=(edtValue)*4.183999999E+36;
megaelectronvolt=(edtValue)*2.611446262E+31;
kiloelectronvolt=(edtValue)*2.611446262E+34;
electronvolt=(edtValue)*2.611446262E+37;
erg=(edtValue)*4.183999999E+25;
gigawatthour=(edtValue)*1162222.2222;
megawatthour=(edtValue)*1162222222.2;
kilowattsecond=(edtValue)*4183999999999952.00;
wattsecond=(edtValue)*4183999999999953000.00;
newtonmeter=(edtValue)*4183999999999953000.00;
horsepowerhour=(edtValue)*1558565673489.00;
kilocalorieIT=(edtValue)*999331231489449.00;
kilocalorieth=(edtValue)*1000000000000000.00;
calorieit=(edtValue)*999331231489448600.00;
calorieth=(edtValue)*999999999999999900.00;
megaBtuIT=(edtValue)*3965666831.4;
tonhour=(edtValue)*330472235949.00;
fuelkl=(edtValue)*104085743.61;
fuelb=(edtValue)*655482120.89;
gigaton=(edtValue)*1;
megaton=(edtValue)*1000;
kiloton=(edtValue)*1000000;
ton=(edtValue)*1000000000;
dynecm=(edtValue)*4.183999999E+25;
gfm=(edtValue)*426649263523128100000.00;
gfcm=(edtValue)*4.266492635E+22;
kgfcm=(edtValue)*42664926352312810000.00;
kgfm=(edtValue)*426649263523128100.00;
kpm=(edtValue)*426649263523128100.00;
pff=(edtValue)*3085960032671165000.00;
pfi=(edtValue)*37031520392053980000.00;
ofi=(edtValue)*37031520392053980000.00;
fp=(edtValue)*3085960032671165000.00;
ip=(edtValue)*3085960032671165000.00;
io=(edtValue)*592504326272863700000.00;
pdlft=(edtValue)*99287828152505270000.00;
therm=(edtValue)*39656662774.00;
thermec=(edtValue)*39656662774.00;
thermus=(edtValue)*39666137026.00;
Hartree=(edtValue)*9.596884517E+35;
Rydberg=(edtValue)*1.919376903E+36;


break;

case "Mega ton - Mton":

joule=(edtValue)*4183999999999954.00;
kilojoule=(edtValue)*4184000000000.00;
kilowatthour=(edtValue)*1162222222.2;
watthour=(edtValue)*1162222222222.00;
calorie=(edtValue)*999331231489.00;
horsepower=(edtValue)*1580182457.4;
BtuIT=(edtValue)*3965666831391.00;
Btuth=(edtValue)*3968321714897.00;
gigajoule=(edtValue)*4184000;
megajoule=(edtValue)*4184000000.00;
millijoule=(edtValue)*4183999999999953000.00;
microjoule=(edtValue)*4.183999999E+21;
nanojoule=(edtValue)*4.183999999E+24;
attojoule=(edtValue)*4.183999999E+33;
megaelectronvolt=(edtValue)*2.611446262E+28;
kiloelectronvolt=(edtValue)*2.611446262E+31;
electronvolt=(edtValue)*2.611446262E+34;
erg=(edtValue)*4.183999999E+22;
gigawatthour=(edtValue)*1162.2222222;
megawatthour=(edtValue)*1162222.2222;
kilowattsecond=(edtValue)*4184000000000.00;
wattsecond=(edtValue)*4183999999999954.00;
newtonmeter=(edtValue)*4183999999999954.00;
horsepowerhour=(edtValue)*1558565673.5;
kilocalorieIT=(edtValue)*999331231489.00;
kilocalorieth=(edtValue)*1000000000000.00;
calorieit=(edtValue)*999331231489449.00;
calorieth=(edtValue)*1000000000000000.00;
megaBtuIT=(edtValue)*3965666.8314;
tonhour=(edtValue)*330472235.95;
fuelkl=(edtValue)*104085.74361;
fuelb=(edtValue)*655482.12089;
gigaton=(edtValue)*0.001;
megaton=(edtValue)*1;
kiloton=(edtValue)*1000;
ton=(edtValue)*1000000;
dynecm=(edtValue)*4.183999999E+22;
gfm=(edtValue)*426649263523128200.00;
gfcm=(edtValue)*42664926352312810000.00;
kgfcm=(edtValue)*42664926352312820.00;
kgfm=(edtValue)*426649263523128.00;
kpm=(edtValue)*426649263523128.00;
pff=(edtValue)*3085960032671166.00;
pfi=(edtValue)*37031520392053980.00;
ofi=(edtValue)*592504326272863700.00;
fp=(edtValue)*3085960032671166.00;
ip=(edtValue)*37031520392053980.00;
io=(edtValue)*592504326272863700.00;
pdlft=(edtValue)*99287828152505280.00;
therm=(edtValue)*39656662.774;
thermec=(edtValue)*39656662.774;
thermus=(edtValue)*39666137.026;
Hartree=(edtValue)*9.596884517E+32;
Rydberg=(edtValue)*1.919376903E+33;



break;
case "Kilo ton - kton":

joule=(edtValue)*4184000000000.00;
kilojoule=(edtValue)*4184000000.00;
kilowatthour=(edtValue)*1162222.2222;
watthour=(edtValue)*1162222222.2;
calorie=(edtValue)*999331231.49;
horsepower=(edtValue)*1580182.4574;
BtuIT=(edtValue)*3965666831.4;
Btuth=(edtValue)*3968321714.9;
gigajoule=(edtValue)*4184;
megajoule=(edtValue)*4184000;
millijoule=(edtValue)*4183999999999953.00;
microjoule=(edtValue)*4183999999999953000.00;
nanojoule=(edtValue)*4.183999999E+21;
attojoule=(edtValue)*4.183999999E+30;
megaelectronvolt=(edtValue)*2.611446262E+25;
kiloelectronvolt=(edtValue)*2.611446262E+28;
electronvolt=(edtValue)*2.611446262E+31;
erg=(edtValue)*41839999999999525000.00;
gigawatthour=(edtValue)*1.1622222222;
megawatthour=(edtValue)*1162.2222222;
kilowattsecond=(edtValue)*4184000000.00;
wattsecond=(edtValue)*4184000000000.00;
newtonmeter=(edtValue)*4184000000000.00;
horsepowerhour=(edtValue)*1558565.6735;
kilocalorieIT=(edtValue)*999331231.49;
kilocalorieth=(edtValue)*1000000000;
calorieit=(edtValue)*999331231489.00;
calorieth=(edtValue)*1000000000000.00;
megaBtuIT=(edtValue)*3965.6668314;
tonhour=(edtValue)*330472.23595;
fuelkl=(edtValue)*104.08574361;
fuelb=(edtValue)*655.48212089;
gigaton=(edtValue)*0.000001;
megaton=(edtValue)*0.001;
kiloton=(edtValue)*1;
ton=(edtValue)*1000;
dynecm=(edtValue)*41839999999999525000.00;
gfm=(edtValue)*426649263523128.00;
gfcm=(edtValue)*42664926352312820.00;
kgfcm=(edtValue)*42664926352313.00;
kgfm=(edtValue)*426649263523.00;
kpm=(edtValue)*426649263523.00;
pff=(edtValue)*3085960032671.00;
pfi=(edtValue)*37031520392054.00;
ofi=(edtValue)*592504326272864.00;
fp=(edtValue)*3085960032671.00;
ip=(edtValue)*37031520392054.00;
io=(edtValue)*592504326272864.00;
pdlft=(edtValue)*99287828152505.00;
therm=(edtValue)*39656.662774;
thermec=(edtValue)*39656.662774;
thermus=(edtValue)*39666.137026;
Hartree=(edtValue)*9.596884517E+29;
Rydberg=(edtValue)*1.919376903E+30;

break;

case "Ton (explosives) - ton":
	
	joule=(edtValue)*4184000000.00;
	kilojoule=(edtValue)*4184000.00;
	kilowatthour=(edtValue)*1162.2222222;
	watthour=(edtValue)*1162222.2222;
	calorie=(edtValue)*999331.23149;
	horsepower=(edtValue)*1580.1824574;
	BtuIT=(edtValue)*3965666.8314;
	Btuth=(edtValue)*3968321.7149;
	gigajoule=(edtValue)*4.184;
	megajoule=(edtValue)*4184;
	millijoule=(edtValue)*4184000000000.00;
	microjoule=(edtValue)*4183999999999953.00;
	nanojoule=(edtValue)*4183999999999953000.00;
	attojoule=(edtValue)*4.183999999E+27;
	megaelectronvolt=(edtValue)*2.611446262E+22;
	kiloelectronvolt=(edtValue)*2.611446262E+25;
	electronvolt=(edtValue)*2.611446262E+28;
	erg=(edtValue)*41839999999999530.00;
	gigawatthour=(edtValue)*0.0011622222;
	megawatthour=(edtValue)*1.1622222222;
	kilowattsecond=(edtValue)*4184000;
	wattsecond=(edtValue)*4184000000.00;
	newtonmeter=(edtValue)*4184000000.00;
	horsepowerhour=(edtValue)*1558.5656735;
	kilocalorieIT=(edtValue)*999331.23149;
	kilocalorieth=(edtValue)*1000000;
	calorieit=(edtValue)*999331231.49;
	calorieth=(edtValue)*1000000000;
	megaBtuIT=(edtValue)*3.9656668314;
	tonhour=(edtValue)*330.47223595;
	fuelkl=(edtValue)*0.1040857436;
	fuelb=(edtValue)*0.6554821209;
	gigaton=(edtValue)*1.E-9;
	megaton=(edtValue)*0.000001;
	kiloton=(edtValue)*0.001;
	ton=(edtValue)*1;
	dynecm=(edtValue)*41839999999999530.00;
	gfm=(edtValue)*426649263523.00;
	gfcm=(edtValue)*42664926352313.00;
	kgfcm=(edtValue)*42664926352.00;
	kgfm=(edtValue)*426649263.52;
	kpm=(edtValue)*426649263.52;
	pff=(edtValue)*3085960032.7;
	pfi=(edtValue)*37031520392.00;
	ofi=(edtValue)*592504326273.00;
	fp=(edtValue)*3085960032.7;
	ip=(edtValue)*37031520392.00;
	io=(edtValue)*592504326273.00;
	pdlft=(edtValue)*99287828153.00;
	therm=(edtValue)*39.656662774;
	thermec=(edtValue)*39.656662774;
	thermus=(edtValue)*39.666137026;
	Hartree=(edtValue)*9.596884517E+26;
	Rydberg=(edtValue)*1.919376903E+27;
	
	
	 break;
case "Dyne centimeter - dyn*cm":
	
   joule=(edtValue)*1.E-7;
	kilojoule=(edtValue)*9.999999999E-11;
	kilowatthour=(edtValue)*2.777777777E-14;
	watthour=(edtValue)*2.777777777E-11;
	calorie=(edtValue)*2.388458966E-11;
	horsepower=(edtValue)*3.776726714E-14;
	BtuIT=(edtValue)*9.478171203E-11;
	Btuth=(edtValue)*9.484516527E-11;
	gigajoule=(edtValue)*1.E-16;
	megajoule=(edtValue)*1.E-13;
	millijoule=(edtValue)*0.0001;
	microjoule=(edtValue)*0.1;
	nanojoule=(edtValue)*100;
	attojoule=(edtValue)*100000000000.00;
	megaelectronvolt=(edtValue)*624150.63631;
	kiloelectronvolt=(edtValue)*624150636.31;
	electronvolt=(edtValue)*624150636309.00;
	erg=(edtValue)*1;
	gigawatthour=(edtValue)*2.777777777E-20;
	megawatthour=(edtValue)*2.777777777E-17;
	kilowattsecond=(edtValue)*9.999999999E-11;
	wattsecond=(edtValue)*1.E-7;
	newtonmeter=(edtValue)*1.E-7;
	horsepowerhour=(edtValue)*3.725061361E-14;
	kilocalorieIT=(edtValue)*2.388458966E-11;
	kilocalorieth=(edtValue)*2.390057361E-11;
	calorieit=(edtValue)*2.388458966E-8;
	calorieth=(edtValue)*2.390057361E-8;
	megaBtuIT=(edtValue)*9.478171203E-17;
	tonhour=(edtValue)*7.898476002E-15;
	fuelkl=(edtValue)*2.487708977E-18;
	fuelb=(edtValue)*1.566639868E-17;
	gigaton=(edtValue)*2.390057361E-26;
	megaton=(edtValue)*2.390057361E-23;
	kiloton=(edtValue)*2.390057361E-20;
	ton=(edtValue)*2.390057361E-17;
	dynecm=(edtValue)*1;
	gfm=(edtValue)*0.0000101972;
	gfcm=(edtValue)*0.0010197162;
	kgfcm=(edtValue)*0.0000010197;
	kgfm=(edtValue)*1.019716213E-8;
	kpm=(edtValue)*1.019716213E-8;
	pff=(edtValue)*7.375621493E-8;
	pfi=(edtValue)*8.850745791E-7;
	ofi=(edtValue)*0.0000141612;
	fp=(edtValue)*7.375621493E-8;
	ip=(edtValue)*8.850745791E-7;
	io=(edtValue)*0.0000141612;
	pdlft=(edtValue)*0.000002373;
	therm=(edtValue)*9.478169879E-16;
	thermec=(edtValue)*9.478169879E-16;
	thermus=(edtValue)*9.480434279E-16;
	Hartree=(edtValue)*22937104487.00;
	Rydberg=(edtValue)*45874208974.00;
	
	
	 break;
case "Gram-force meter - gf*m":

 joule=(edtValue)*0.00980665;
	kilojoule=(edtValue)*0.0000098066;
	kilowatthour=(edtValue)*2.724069444E-9;
	watthour=(edtValue)*0.0000027241;
	calorie=(edtValue)*0.0000023423;
	horsepower=(edtValue)*3.703703703E-9;
	BtuIT=(edtValue)*0.0000092949;
	Btuth=(edtValue)*0.0000093011;
	gigajoule=(edtValue)*9.806649999E-12;
	megajoule=(edtValue)*9.806649999E-9;
	millijoule=(edtValue)*9.8066499997;
	microjoule=(edtValue)*9806.6499997;
	nanojoule=(edtValue)*9806649.9997;
	attojoule=(edtValue)*9806649999697336.00;
	megaelectronvolt=(edtValue)*61208268374.00;
	kiloelectronvolt=(edtValue)*61208268373747.00;
	electronvolt=(edtValue)*61208268373746690.00;
	erg=(edtValue)*98066.499997;
	gigawatthour=(edtValue)*2.724069444E-15;
	megawatthour=(edtValue)*2.724069444E-12;
	kilowattsecond=(edtValue)*0.0000098066;
	wattsecond=(edtValue)*0.00980665;
	newtonmeter=(edtValue)*0.00980665;
	horsepowerhour=(edtValue)*3.653037299E-9;
	kilocalorieIT=(edtValue)*0.0000023423;
	kilocalorieth=(edtValue)*0.0000023438;
	calorieit=(edtValue)*0.0023422781;
	calorieth=(edtValue)*0.0023438456;
	megaBtuIT=(edtValue)*9.294910762E-12;
	tonhour=(edtValue)*7.745758968E-10;
	fuelkl=(edtValue)*2.439609124E-13;
	fuelb=(edtValue)*1.536348886E-12;
	gigaton=(edtValue)*2.343845602E-21;
	megaton=(edtValue)*2.343845602E-18;
	kiloton=(edtValue)*2.343845602E-15;
	ton=(edtValue)*2.343845602E-12;
	dynecm=(edtValue)*98066.499997;
	gfm=(edtValue)*1;
	gfcm=(edtValue)*100;
	kgfcm=(edtValue)*0.1;
	kgfm=(edtValue)*0.001;
	kpm=(edtValue)*0.001;
	pff=(edtValue)*0.0072330139;
	pfi=(edtValue)*0.0867961662;
	ofi=(edtValue)*1.3887386594;
	fp=(edtValue)*0.0072330139;
	ip=(edtValue)*0.0867961662;
	io=(edtValue)*1.3887386594;
	pdlft=(edtValue)*0.2327153394;
	therm=(edtValue)*9.294909464E-11;
	thermec=(edtValue)*9.294909464E-11;
	thermus=(edtValue)*9.297130082E-11;
	Hartree=(edtValue)*2249361557095745.00;
	Rydberg=(edtValue)*4498723114191489.00;


break;

case "Gram-force centimeter - gf*cm":

 joule=(edtValue)*0.0000980665;
	kilojoule=(edtValue)*9.806649999E-8;
	kilowatthour=(edtValue)*2.724069444E-11;
	watthour=(edtValue)*2.724069444E-8;
	calorie=(edtValue)*2.342278112E-8;
	horsepower=(edtValue)*3.703703703E-11;
	BtuIT=(edtValue)*9.294910762E-8;
	Btuth=(edtValue)*9.301133399E-8;
	gigajoule=(edtValue)*9.806649999E-14;
	megajoule=(edtValue)*9.806649999E-11;
	millijoule=(edtValue)*0.0980665;
	microjoule=(edtValue)*98.066499997;
	nanojoule=(edtValue)*98066.499997;
	attojoule=(edtValue)*98066499996973.00;
	megaelectronvolt=(edtValue)*612082683.74;
	kiloelectronvolt=(edtValue)*612082683737.00;
	electronvolt=(edtValue)*612082683737467.00;
	erg=(edtValue)*980.66499997;
	gigawatthour=(edtValue)*2.724069444E-17;
	megawatthour=(edtValue)*2.724069444E-14;
	kilowattsecond=(edtValue)*9.806649999E-8;
	wattsecond=(edtValue)*0.0000980665;
	newtonmeter=(edtValue)*0.0000980665;
	horsepowerhour=(edtValue)*3.653037299E-11;
	kilocalorieIT=(edtValue)*2.342278112E-8;
	kilocalorieth=(edtValue)*2.343845602E-8;
	calorieit=(edtValue)*0.0000234228;
	calorieth=(edtValue)*0.0000234385;
	megaBtuIT=(edtValue)*9.294910762E-14;
	tonhour=(edtValue)*7.745758968E-12;
	fuelkl=(edtValue)*2.439609124E-15;
	fuelb=(edtValue)*1.536348886E-14;
	gigaton=(edtValue)*2.343845602E-23;
	megaton=(edtValue)*2.343845602E-20;
	kiloton=(edtValue)*2.343845602E-17;
	ton=(edtValue)*2.343845602E-14;
	dynecm=(edtValue)*980.66499997;
	gfm=(edtValue)*0.01;
	gfcm=(edtValue)*1;
	kgfcm=(edtValue)*0.001;
	kgfm=(edtValue)*0.00001;
	kpm=(edtValue)*0.00001;
	pff=(edtValue)*0.0000723301;
	pfi=(edtValue)*0.0008679617;
	ofi=(edtValue)*0.0138873866;
	fp=(edtValue)*0.0000723301;
	ip=(edtValue)*0.0008679617;
	io=(edtValue)*0.0138873866;
	pdlft=(edtValue)*0.0023271534;
	therm=(edtValue)*9.294909464E-13;
	thermec=(edtValue)*9.294909464E-13;
	thermus=(edtValue)*9.297130082E-13;
	Hartree=(edtValue)*22493615570957.00;
	Rydberg=(edtValue)*44987231141915.00;



break;
case "Kilogram-force centimeter - kgf*cm":

 joule=(edtValue)*0.0980665;
	kilojoule=(edtValue)*0.0000980665;
	kilowatthour=(edtValue)*2.724069444E-8;
	watthour=(edtValue)*0.0000272407;
	calorie=(edtValue)*0.0000234228;
	horsepower=(edtValue)*3.703703703E-8;
	BtuIT=(edtValue)*0.0000929491;
	Btuth=(edtValue)*0.0000930113;
	gigajoule=(edtValue)*9.806649999E-11;
	megajoule=(edtValue)*9.806649999E-8;
	millijoule=(edtValue)*98.066499997;
	microjoule=(edtValue)*98066.499997;
	nanojoule=(edtValue)*98066499.997;
	attojoule=(edtValue)*98066499996973360.00;
	megaelectronvolt=(edtValue)*612082683737.00;
	kiloelectronvolt=(edtValue)*612082683737467.00;
	electronvolt=(edtValue)*612082683737466900.00;
	erg=(edtValue)*980664.99997;
	gigawatthour=(edtValue)*2.724069444E-14;
	megawatthour=(edtValue)*2.724069444E-11;
	kilowattsecond=(edtValue)*0.0000980665;
	wattsecond=(edtValue)*0.0980665;
	newtonmeter=(edtValue)*0.0980665;
	horsepowerhour=(edtValue)*3.653037299E-8;
	kilocalorieIT=(edtValue)*0.0000234228;
	kilocalorieth=(edtValue)*0.0000234385;
	calorieit=(edtValue)*0.0234227811;
	calorieth=(edtValue)*0.023438456;
	megaBtuIT=(edtValue)*9.294910762E-11;
	tonhour=(edtValue)*7.745758968E-9;
	fuelkl=(edtValue)*2.439609124E-12;
	fuelb=(edtValue)*1.536348886E-11;
	gigaton=(edtValue)*2.343845602E-20;
	megaton=(edtValue)*2.343845602E-17;
	kiloton=(edtValue)*2.343845602E-14;
	ton=(edtValue)*2.343845602E-11;
	dynecm=(edtValue)*980664.99997;
	gfm=(edtValue)*10;
	gfcm=(edtValue)*1000;
	kgfcm=(edtValue)*1;
	kgfm=(edtValue)*0.01;
	kpm=(edtValue)*0.01;
	pff=(edtValue)*0.0723301385;
	pfi=(edtValue)*0.8679616621;
	ofi=(edtValue)*13.887386594;
	fp=(edtValue)*0.0723301385;
	ip=(edtValue)*0.8679616621;
	io=(edtValue)*13.887386594;
	pdlft=(edtValue)*2.3271533937;
	therm=(edtValue)*9.294909464E-10;
	thermec=(edtValue)*9.294909464E-10;
	thermus=(edtValue)*9.297130082E-10;
	Hartree=(edtValue)*22493615570957444.00;
	Rydberg=(edtValue)*44987231141914890.00;

break;

case "Kilogram-force meter - kgf*m":

joule=(edtValue)*9.8066499997;
kilojoule=(edtValue)*0.00980665;
kilowatthour=(edtValue)*0.0000027241;
watthour=(edtValue)*0.0027240694;
calorie=(edtValue)*0.0023422781;
horsepower=(edtValue)*0.0000037037;
BtuIT=(edtValue)*0.0092949108;
Btuth=(edtValue)*0.0093011334;
gigajoule=(edtValue)*9.806649999E-9;
megajoule=(edtValue)*0.0000098066;
millijoule=(edtValue)*9806.6499997;
microjoule=(edtValue)*9806649.9997;
nanojoule=(edtValue)*9806649999.7;
attojoule=(edtValue)*9806649999697334000.00;
megaelectronvolt=(edtValue)*61208268373747.00;
kiloelectronvolt=(edtValue)*61208268373746690.00;
electronvolt=(edtValue)*61208268373746690000.00;
erg=(edtValue)*98066499.997;
gigawatthour=(edtValue)*2.724069444E-12;
megawatthour=(edtValue)*2.724069444E-9;
kilowattsecond=(edtValue)*0.00980665;
wattsecond=(edtValue)*9.8066499997;
newtonmeter=(edtValue)*9.8066499997;
horsepowerhour=(edtValue)*0.000003653;
kilocalorieIT=(edtValue)*0.0023422781;
kilocalorieth=(edtValue)*0.0023438456;
calorieit=(edtValue)*2.3422781121;
calorieth=(edtValue)*2.3438456022;
megaBtuIT=(edtValue)*9.294910762E-9;
tonhour=(edtValue)*7.745758968E-7;
fuelkl=(edtValue)*2.439609124E-10;
fuelb=(edtValue)*1.536348886E-9;
gigaton=(edtValue)*2.343845602E-18;
megaton=(edtValue)*2.390057361E-16;
kiloton=(edtValue)*2.343845602E-12;
ton=(edtValue)*2.343845602E-9;
dynecm=(edtValue)*98066499.997;
gfm=(edtValue)*1000;
gfcm=(edtValue)*100000;
kgfcm=(edtValue)*100;
kgfm=(edtValue)*1;
kpm=(edtValue)*1;
pff=(edtValue)*7.2330138512;
pfi=(edtValue)*86.796166215;
ofi=(edtValue)*1388.7386594;
fp=(edtValue)*7.2330138512;
ip=(edtValue)*86.796166215;
io=(edtValue)*1388.7386594;
pdlft=(edtValue)*232.71533937;
therm=(edtValue)*9.294909464E-8;
thermec=(edtValue)*9.297130082E-8;
thermus=(edtValue)*9.480434279E-9;
Hartree=(edtValue)*2249361557095744300.00;
Rydberg=(edtValue)*4498723114191488500.00;


 break;
case "Kilo pond meter - kp*m":

joule=(edtValue)*9.8066499997;
kilojoule=(edtValue)*0.00980665;
kilowatthour=(edtValue)*0.0000027241;
watthour=(edtValue)*0.0027240694;
calorie=(edtValue)*0.0023422781;
horsepower=(edtValue)*0.0000037037;
BtuIT=(edtValue)*0.0092949108;
Btuth=(edtValue)*0.0093011334;
gigajoule=(edtValue)*9.806649999E-9;
megajoule=(edtValue)*0.0000098066;
millijoule=(edtValue)*9806.6499997;
microjoule=(edtValue)*9806649.9997;
nanojoule=(edtValue)*9806649999.7;
attojoule=(edtValue)*9806649999697334000.00;
megaelectronvolt=(edtValue)*61208268373747.00;
kiloelectronvolt=(edtValue)*61208268373746690.00;
electronvolt=(edtValue)*61208268373746690000.00;
erg=(edtValue)*98066499.997;
gigawatthour=(edtValue)*2.724069444E-12;
megawatthour=(edtValue)*2.724069444E-9;
kilowattsecond=(edtValue)*0.00980665;
wattsecond=(edtValue)*9.8066499997;
newtonmeter=(edtValue)*9.8066499997;
horsepowerhour=(edtValue)*0.000003653;
kilocalorieIT=(edtValue)*0.0023422781;
kilocalorieth=(edtValue)*0.0023438456;
calorieit=(edtValue)*2.3422781121;
calorieth=(edtValue)*2.3438456022;
megaBtuIT=(edtValue)*9.294910762E-9;
tonhour=(edtValue)*7.745758968E-7;
fuelkl=(edtValue)*2.439609124E-10;
fuelb=(edtValue)*1.536348886E-9;
gigaton=(edtValue)*2.343845602E-18;
megaton=(edtValue)*2.343845602E-15;
kiloton=(edtValue)*2.343845602E-12;
ton=(edtValue)*2.343845602E-9;
dynecm=(edtValue)*98066499.997;
gfm=(edtValue)*1000;
gfcm=(edtValue)*100000;
kgfcm=(edtValue)*100;
kgfm=(edtValue)*1;
kpm=(edtValue)*1;
pff=(edtValue)*7.2330138512;
pfi=(edtValue)*86.796166215;
ofi=(edtValue)*1388.7386594;
fp=(edtValue)*7.2330138512;
ip=(edtValue)*86.796166215;
io=(edtValue)*1388.7386594;
pdlft=(edtValue)*232.71533937;
therm=(edtValue)*9.294909464E-8;
thermec=(edtValue)*9.294909464E-8;
thermus=(edtValue)*9.297130082E-8;
Hartree=(edtValue)*2249361557095744300.00;
Rydberg=(edtValue)*4498723114191488500.00;


 break;
case "Pound-force foot - lbf*ft":

joule=(edtValue)*1.3558179483;
kilojoule=(edtValue)*0.0013558179;
kilowatthour=(edtValue)*3.766160967E-7;
watthour=(edtValue)*0.0003766161;
calorie=(edtValue)*0.0003238316;
horsepower=(edtValue)*5.120553865E-7;
BtuIT=(edtValue)*0.0012850675;
Btuth=(edtValue)*0.0012859278;
gigajoule=(edtValue)*1.355817948E-9;
megajoule=(edtValue)*0.0000013558;
millijoule=(edtValue)*1355.8179483;
microjoule=(edtValue)*1355817.9483;
nanojoule=(edtValue)*1355817948.3;
attojoule=(edtValue)*1355817948289608700.00;
megaelectronvolt=(edtValue)*8462346351447.00;
kiloelectronvolt=(edtValue)*8462346351446646.00;
electronvolt=(edtValue)*8462346351446645000.00;
erg=(edtValue)*13558179.483;
gigawatthour=(edtValue)*3.766160967E-13;
megawatthour=(edtValue)*3.766160967E-10;
kilowattsecond=(edtValue)*0.0013558179;
wattsecond=(edtValue)*1.3558179483;
newtonmeter=(edtValue)*1.3558179483;
horsepowerhour=(edtValue)*5.050505051E-7;
kilocalorieIT=(edtValue)*0.0003238316;
kilocalorieth=(edtValue)*0.0003240483;
calorieit=(edtValue)*0.3238315535;
calorieth=(edtValue)*0.3240482668;
megaBtuIT=(edtValue)*1.285067463E-9;
tonhour=(edtValue)*1.070889552E-7;
fuelkl=(edtValue)*3.372880481E-11;
fuelb=(edtValue)*2.124078451E-10;
gigaton=(edtValue)*3.240482667E-19;
megaton=(edtValue)*3.240482667E-16;
kiloton=(edtValue)*3.240482667E-13;
ton=(edtValue)*3.240482667E-10;
dynecm=(edtValue)*13558179.483;
gfm=(edtValue)*138.25495438;
gfcm=(edtValue)*13825.495438;
kgfcm=(edtValue)*13.825495438;
kgfm=(edtValue)*0.1382549544;
kpm=(edtValue)*0.1382549544;
pff=(edtValue)*1;
pfi=(edtValue)*12;
ofi=(edtValue)*192;
fp=(edtValue)*1;
ip=(edtValue)*12;
io=(edtValue)*192;
pdlft=(edtValue)*32.174048627;
therm=(edtValue)*1.285067283E-8;
thermec=(edtValue)*1.285067283E-8;
thermus=(edtValue)*1.285374295E-8;
Hartree=(edtValue)*310985379451412700.00;
Rydberg=(edtValue)*621970758902825300.00;


break;

case "Pound-force inch - lbf*in":

joule=(edtValue)*0.112984829;
kilojoule=(edtValue)*0.0001129848;
kilowatthour=(edtValue)*3.138467472E-8;
watthour=(edtValue)*0.0000313847;
calorie=(edtValue)*0.000026986;
horsepower=(edtValue)*4.267128221E-8;
BtuIT=(edtValue)*0.000107089;
Btuth=(edtValue)*0.0001071606;
gigajoule=(edtValue)*1.12984829E-10;
megajoule=(edtValue)*1.12984829E-7;
millijoule=(edtValue)*112.98482902;
microjoule=(edtValue)*112984.82902;
nanojoule=(edtValue)*112984829.02;
attojoule=(edtValue)*112984829024134060.00;
megaelectronvolt=(edtValue)*705195529287.00;
kiloelectronvolt=(edtValue)*705195529287220.00;
electronvolt=(edtValue)*705195529287220400.00;
erg=(edtValue)*1129848.2902;
gigawatthour=(edtValue)*3.138467472E-14;
megawatthour=(edtValue)*3.138467472E-11;
kilowattsecond=(edtValue)*0.0001129848;
wattsecond=(edtValue)*0.112984829;
newtonmeter=(edtValue)*0.112984829;
horsepowerhour=(edtValue)*4.208754209E-8;
kilocalorieIT=(edtValue)*0.000026986;
kilocalorieth=(edtValue)*0.000027004;
calorieit=(edtValue)*0.0269859628;
calorieth=(edtValue)*0.0270040222;
megaBtuIT=(edtValue)*1.070889552E-10;
tonhour=(edtValue)*8.924079607E-9;
fuelkl=(edtValue)*2.810733734E-12;
fuelb=(edtValue)*1.770065376E-11;
gigaton=(edtValue)*2.700402223E-20;
megaton=(edtValue)*2.700402223E-17;
kiloton=(edtValue)*2.700402223E-14;
ton=(edtValue)*2.700402223E-11;
dynecm=(edtValue)*1129848.2902;
gfm=(edtValue)*11.521246198;
gfcm=(edtValue)*1152.1246198;
kgfcm=(edtValue)*1.1521246198;
kgfm=(edtValue)*0.0115212462;
kpm=(edtValue)*0.0115212462;
pff=(edtValue)*0.0833333333;
pfi=(edtValue)*1;
ofi=(edtValue)*16;
fp=(edtValue)*0.0833333333;
ip=(edtValue)*1;
io=(edtValue)*16;
pdlft=(edtValue)*2.6811707189;
therm=(edtValue)*1.070889403E-9;
thermec=(edtValue)*1.070889403E-9;
thermus=(edtValue)*1.071145246E-9;
Hartree=(edtValue)*25915448287617724.00;
Rydberg=(edtValue)*51830896575235450.00;



break;
case "Ounce-force inch - ozf*in":

joule=(edtValue)*0.0070615518;
kilojoule=(edtValue)*0.0000070616;
kilowatthour=(edtValue)*1.96154217E-9;
watthour=(edtValue)*0.0000019615;
calorie=(edtValue)*0.0000016866;
horsepower=(edtValue)*2.666955138E-90;
BtuIT=(edtValue)*0.0000066931;
Btuth=(edtValue)*0.0000066975;
gigajoule=(edtValue)*7.061551814E-12;
megajoule=(edtValue)*7.061551814E-9;
millijoule=(edtValue)*7.061551814;
microjoule=(edtValue)*7061.551814;
nanojoule=(edtValue)*7061551.814;
attojoule=(edtValue)*7061551814008380.00;
megaelectronvolt=(edtValue)*44074720580.00;
kiloelectronvolt=(edtValue)*44074720580451.0;
electronvolt=(edtValue)*44074720580451270.0;
erg=(edtValue)*70615.51814;
gigawatthour=(edtValue)*1.96154217E-15;
megawatthour=(edtValue)*1.96154217E-12;
kilowattsecond=(edtValue)*0.0000070616;
wattsecond=(edtValue)*0.0070615518;
newtonmeter=(edtValue)*0.0070615518;
horsepowerhour=(edtValue)*2.630471381E-9;
kilocalorieIT=(edtValue)*0.0000016866;
kilocalorieth=(edtValue)*0.0000016878;
calorieit=(edtValue)*0.0016866227;
calorieth=(edtValue)*0.0016877514;
megaBtuIT=(edtValue)*6.693059705E-12;
tonhour=(edtValue)*5.577549754E-10;
fuelkl=(edtValue)*1.756708584E-13;
fuelb=(edtValue)*1.10629086E-12;
gigaton=(edtValue)*1.687751389E-21;
megaton=(edtValue)*1.687751389E-18;
kiloton=(edtValue)*1.687751389E-15;
ton=(edtValue)*1.687751389E-12;
dynecm=(edtValue)*70615.51814;
gfm=(edtValue)*0.7200778874;
gfcm=(edtValue)*72.007788738;
kgfcm=(edtValue)*0.0720077887;
kgfm=(edtValue)*0.0007200779;
kpm=(edtValue)*0.0007200779;
pff=(edtValue)*0.0052083333;
pfi=(edtValue)*0.0625;
ofi=(edtValue)*1;
fp=(edtValue)*0.0052083333;
ip=(edtValue)*0.0625;
io=(edtValue)*1;
	pdlft=(edtValue)*0.1675731699;
therm=(edtValue)*6.69305877E-11;
thermec=(edtValue)*6.69305877E-11;
thermus=(edtValue)*6.694657788E-11;
Hartree=(edtValue)*1619715517976108.0;
Rydberg=(edtValue)*3239431035952216.0;

break;
case "Foot-pound - ft*lbf":

joule=(edtValue)*1.3558179483;
kilojoule=(edtValue)*0.0013558179;
kilowatthour=(edtValue)*3.766160967E-7;
watthour=(edtValue)*0.0003766161;
calorie=(edtValue)*0.0003238316;
horsepower=(edtValue)*5.120553865E-7;
BtuIT=(edtValue)*0.0012850675;
Btuth=(edtValue)*0.0012859278;
gigajoule=(edtValue)*1.355817948E-9;
megajoule=(edtValue)*0.0000013558;
millijoule=(edtValue)*1355.8179483;
microjoule=(edtValue)*1355817.9483;
nanojoule=(edtValue)*1355817948.3;
attojoule=(edtValue)*1355817948289608700.0;
megaelectronvolt=(edtValue)*8462346351447.0;
kiloelectronvolt=(edtValue)*8462346351446646.0;
electronvolt=(edtValue)*8462346351446645000.0;
erg=(edtValue)*13558179.483;
gigawatthour=(edtValue)*3.766160967E-13;
megawatthour=(edtValue)*3.766160967E-10;
kilowattsecond=(edtValue)*0.0013558179;
wattsecond=(edtValue)*1.3558179483;
newtonmeter=(edtValue)*1.3558179483;
horsepowerhour=(edtValue)*5.050505051E-7;
kilocalorieIT=(edtValue)*0.0003238316;
kilocalorieth=(edtValue)*0.0003240483;
calorieit=(edtValue)*0.3238315535;
calorieth=(edtValue)*0.3240482668;
megaBtuIT=(edtValue)*1.285067463E-9;
tonhour=(edtValue)*1.070889552E-7;
fuelkl=(edtValue)*3.372880481E-11;
fuelb=(edtValue)*2.124078451E-10;
gigaton=(edtValue)*3.240482667E-19;
megaton=(edtValue)*3.240482667E-16;
kiloton=(edtValue)*3.240482667E-13;
ton=(edtValue)*3.240482667E-10;
dynecm=(edtValue)*13558179.483;
gfm=(edtValue)*138.25495438;
gfcm=(edtValue)*13825.495438;
kgfcm=(edtValue)*13.825495438;
kgfm=(edtValue)*0.1382549544;
kpm=(edtValue)*0.1382549544;
pff=(edtValue)*1;
pfi=(edtValue)*12;
ofi=(edtValue)*192;
fp=(edtValue)*1;
ip=(edtValue)*12;
io=(edtValue)*192;
pdlft=(edtValue)*32.174048627;
therm=(edtValue)*1.285067283E-8;
thermec=(edtValue)*1.285067283E-8;
thermus=(edtValue)*1.285374295E-8;
Hartree=(edtValue)*310985379451412700.0;
Rydberg=(edtValue)*621970758902825300.0;


 break;
case "Inch-pound - in*lbf":

joule=(edtValue)*0.112984829;
kilojoule=(edtValue)*0.0001129848;
kilowatthour=(edtValue)*3.138467472E-8;
watthour=(edtValue)*0.0000313847;
calorie=(edtValue)*0.000026986;
horsepower=(edtValue)*4.267128221E-8;
BtuIT=(edtValue)*0.000107089;
Btuth=(edtValue)*0.0001071606;
gigajoule=(edtValue)*1.12984829E-10;
megajoule=(edtValue)*1.12984829E-7;
millijoule=(edtValue)*112.98482902;
microjoule=(edtValue)*112984.82902;
nanojoule=(edtValue)*112984829.02;
attojoule=(edtValue)*112984829024134060.0;
megaelectronvolt=(edtValue)*705195529287.0;
kiloelectronvolt=(edtValue)*705195529287220.0;
electronvolt=(edtValue)*705195529287220400.0;
erg=(edtValue)*1129848.2902;
gigawatthour=(edtValue)*3.138467472E-14;
megawatthour=(edtValue)*3.138467472E-11;
kilowattsecond=(edtValue)*0.0001129848;
wattsecond=(edtValue)*0.112984829;
newtonmeter=(edtValue)*0.112984829;
horsepowerhour=(edtValue)*4.208754209E-8;
kilocalorieIT=(edtValue)*0.000026986;
kilocalorieth=(edtValue)*0.000027004;
calorieit=(edtValue)*0.0269859628;
calorieth=(edtValue)*0.0270040222;
megaBtuIT=(edtValue)*1.070889552E-10;
tonhour=(edtValue)*8.924079607E-9;
fuelkl=(edtValue)*2.810733734E-12;
fuelb=(edtValue)*1.770065376E-11;
gigaton=(edtValue)*2.700402223E-20;
megaton=(edtValue)*2.700402223E-17;
kiloton=(edtValue)*2.700402223E-14;
ton=(edtValue)*2.700402223E-11;
dynecm=(edtValue)*1129848.2902;
gfm=(edtValue)*11.521246198;
gfcm=(edtValue)*1152.1246198;
kgfcm=(edtValue)*1.1521246198;
kgfm=(edtValue)*0.0115212462;
kpm=(edtValue)*0.0115212462;
pff=(edtValue)*0.0833333333;
pfi=(edtValue)*1;
ofi=(edtValue)*16;
fp=(edtValue)*0.0833333333;
ip=(edtValue)*1;
io=(edtValue)*16;
pdlft=(edtValue)*2.6811707189;
therm=(edtValue)*1.070889403E-9;
thermec=(edtValue)*1.070889403E-9;
thermus=(edtValue)*1.071145246E-9;
Hartree=(edtValue)*25915448287617724.0;
Rydberg=(edtValue)*51830896575235450.0;


 break;
case "Inch-ounce - in*ozf":

joule=(edtValue)*0.0070615518;
kilojoule=(edtValue)*0.0000070616;
kilowatthour=(edtValue)*1.96154217E-9;
watthour=(edtValue)*0.0000019615;
calorie=(edtValue)*0.0000016866;
horsepower=(edtValue)*2.666955138E-9;
BtuIT=(edtValue)*0.0000066931;
Btuth=(edtValue)*0.0000066975;
gigajoule=(edtValue)*7.061551814E-12;
megajoule=(edtValue)*7.061551814E-9;
millijoule=(edtValue)*7.061551814;
microjoule=(edtValue)*7061.551814;
nanojoule=(edtValue)*7061551.814;
attojoule=(edtValue)*7061551814008380.0;
megaelectronvolt=(edtValue)*44074720580.0;
kiloelectronvolt=(edtValue)*44074720580451.0;
electronvolt=(edtValue)*44074720580451270.0;
erg=(edtValue)*70615.51814;
gigawatthour=(edtValue)*1.96154217E-15;
megawatthour=(edtValue)*1.96154217E-12;
kilowattsecond=(edtValue)*0.0000070616;
wattsecond=(edtValue)*0.0070615518;
newtonmeter=(edtValue)*0.0070615518;
horsepowerhour=(edtValue)*2.630471381E-9;
kilocalorieIT=(edtValue)*0.0000016866;
kilocalorieth=(edtValue)*0.0000016878;
calorieit=(edtValue)*0.0016866227;
calorieth=(edtValue)*0.0016877514;
megaBtuIT=(edtValue)*6.693059705E-12;
tonhour=(edtValue)*5.577549754E-10;
fuelkl=(edtValue)*1.756708584E-13;
fuelb=(edtValue)*1.10629086E-12;
gigaton=(edtValue)*1.687751389E-21;
megaton=(edtValue)*1.687751389E-18;
kiloton=(edtValue)*1.687751389E-15;
ton=(edtValue)*1.687751389E-12;
dynecm=(edtValue)*70615.51814;
gfm=(edtValue)*0.7200778874;
gfcm=(edtValue)*72.007788738;
kgfcm=(edtValue)*0.0720077887;
kgfm=(edtValue)*0.0007200779;
kpm=(edtValue)*0.0007200779;
pff=(edtValue)*0.0052083333;
pfi=(edtValue)*0.0625;
ofi=(edtValue)*1;
fp=(edtValue)*0.0052083333;
ip=(edtValue)*0.0625;
io=(edtValue)*1;
pdlft=(edtValue)*0.1675731699;
therm=(edtValue)*6.69305877E-11;
thermec=(edtValue)*6.69305877E-11;
thermus=(edtValue)*6.694657788E-11;
Hartree=(edtValue)*1619715517976108.0;
Rydberg=(edtValue)*3239431035952216.0;


break;

case "Poundal foot - pdl*ft":

joule=(edtValue)*0.04214011;
kilojoule=(edtValue)*0.0000421401;
kilowatthour=(edtValue)*1.170558611E-8;
watthour=(edtValue)*0.0000117056;
calorie=(edtValue)*0.000010065;
horsepower=(edtValue)*1.591516791E-8;
BtuIT=(edtValue)*0.0000399411;
Btuth=(edtValue)*0.0000399679;
gigajoule=(edtValue)*4.214010999E-11;
megajoule=(edtValue)*4.214010999E-8;
millijoule=(edtValue)*42.14011;
microjoule=(edtValue)*42140.11;
nanojoule=(edtValue)*42140110;
attojoule=(edtValue)*42140109999922290.0;
megaelectronvolt=(edtValue)*263017764706.0;
kiloelectronvolt=(edtValue)*263017764705996.0;
electronvolt=(edtValue)*263017764705996030.0;
erg=(edtValue)*421401.1;
gigawatthour=(edtValue)*1.170558611E-14;
megawatthour=(edtValue)*1.170558611E-11;
kilowattsecond=(edtValue)*0.0000421401;
wattsecond=(edtValue)*0.04214011;
newtonmeter=(edtValue)*0.04214011;
horsepowerhour=(edtValue)*1.569744955E-8;
kilocalorieIT=(edtValue)*0.000010065;
kilocalorieth=(edtValue)*0.0000100717;
calorieit=(edtValue)*0.0100649924;
calorieth=(edtValue)*0.010071728;
megaBtuIT=(edtValue)*3.99411177E-11;
tonhour=(edtValue)*3.328426475E-9;
fuelkl=(edtValue)*1.048323299E-12;
fuelb=(edtValue)*6.601837637E-12;
gigaton=(edtValue)*1.007172801E-20;
megaton=(edtValue)*1.007172801E-17;
kiloton=(edtValue)*1.007172801E-14;
ton=(edtValue)*1.007172801E-11;
dynecm=(edtValue)*421401.1;
gfm=(edtValue)*4.2970953385;
gfcm=(edtValue)*429.70953385;
kgfcm=(edtValue)*0.4297095338;
kgfm=(edtValue)*0.0042970953;
kpm=(edtValue)*0.0042970953;
pff=(edtValue)*0.0310809501;
pfi=(edtValue)*0.3729714012;
ofi=(edtValue)*5.9675424198;
fp=(edtValue)*0.0310809501;
ip=(edtValue)*0.3729714012;
io=(edtValue)*5.9675424198;
pdlft=(edtValue)*1;
therm=(edtValue)*3.994111213E-10;
thermec=(edtValue)*3.994111213E-10;
thermus=(edtValue)*3.995065433E-10;
Hartree=(edtValue)*9665721061579298.0;
Rydberg=(edtValue)*19331442123158596.0;



break;
case "Therm - therm":

joule=(edtValue)*105505600;
kilojoule=(edtValue)*105505.6;
kilowatthour=(edtValue)*29.307111111;
watthour=(edtValue)*29307.111111;
calorie=(edtValue)*25199.579631;
horsepower=(edtValue)*39.846581807;
BtuIT=(edtValue)*100000.01397;
Btuth=(edtValue)*100066.96069;
gigajoule=(edtValue)*0.1055056;
megajoule=(edtValue)*105.5056;
millijoule=(edtValue)*105505600000.0;
microjoule=(edtValue)*105505600000000.0;
nanojoule=(edtValue)*105505599999999740.0;
attojoule=(edtValue)*1.055055999E+26;
megaelectronvolt=(edtValue)*658513873742048800000.0;
kiloelectronvolt=(edtValue)*6.585138737E+23;
electronvolt=(edtValue)*6.585138737E+26;
erg=(edtValue)*1055055999999998.0;
gigawatthour=(edtValue)*0.0000293071;
megawatthour=(edtValue)*0.0293071111;
kilowattsecond=(edtValue)*105505.6;
wattsecond=(edtValue)*105505600;
newtonmeter=(edtValue)*105505600;
horsepowerhour=(edtValue)*39.301483394;
kilocalorieIT=(edtValue)*25199.579631;
kilocalorieth=(edtValue)*25216.443595;
calorieit=(edtValue)*25199579.631;
calorieth=(edtValue)*25216443.595;
megaBtuIT=(edtValue)*0.100000014;
tonhour=(edtValue)*8.3333344974;
fuelkl=(edtValue)*0.0026246723;
fuelb=(edtValue)*0.0165289279;
gigaton=(edtValue)*2.521644359E-11;
megaton=(edtValue)*2.521644359E-8;
kiloton=(edtValue)*0.0000252164;
ton=(edtValue)*0.0252164436;
dynecm=(edtValue)*1055055999999998.0;
gfm=(edtValue)*10758577088.0;
gfcm=(edtValue)*1075857708833.0;
kgfcm=(edtValue)*1075857708.8;
kgfm=(edtValue)*10758577.088;
kpm=(edtValue)*10758577.088;
pff=(edtValue)*77816937.099;
pfi=(edtValue)*933803245.19;
ofi=(edtValue)*14940851923.0;
fp=(edtValue)*77816937.099;
ip=(edtValue)*933803245.19;
io=(edtValue)*14940851923.0;
pdlft=(edtValue)*2503685918.2;
therm=(edtValue)*1;
thermec=(edtValue)*1;
thermus=(edtValue)*1.0002389069;
Hartree=(edtValue)*2.419992971E+25;
Rydberg=(edtValue)*4.839985942E+25;

break;
case "Therm(EC) - therm":

joule=(edtValue)*105505600;
kilojoule=(edtValue)*105505.6;
kilowatthour=(edtValue)*29.307111111;
watthour=(edtValue)*29307.111111;
calorie=(edtValue)*25199.579631;
horsepower=(edtValue)*39.846581807;
BtuIT=(edtValue)*100000.01397;
Btuth=(edtValue)*100066.96069;
gigajoule=(edtValue)*0.1055056;
megajoule=(edtValue)*105.5056;
millijoule=(edtValue)*105505600000.0;
microjoule=(edtValue)*105505600000000.0;
nanojoule=(edtValue)*105505599999999740.0;
attojoule=(edtValue)*1.055055999E+26;
megaelectronvolt=(edtValue)*658513873742048800000.0;
kiloelectronvolt=(edtValue)*6.585138737E+23;
electronvolt=(edtValue)*6.585138737E+26;
erg=(edtValue)*1055055999999998.0;
gigawatthour=(edtValue)*0.0000293071;
megawatthour=(edtValue)*0.0293071111;
kilowattsecond=(edtValue)*105505.6;
wattsecond=(edtValue)*105505600;
newtonmeter=(edtValue)*105505600;
horsepowerhour=(edtValue)*39.301483394;
kilocalorieIT=(edtValue)*25199.579631;
kilocalorieth=(edtValue)*25216.443595;
calorieit=(edtValue)*25199579.631;
calorieth=(edtValue)*25216443.595;
megaBtuIT=(edtValue)*0.100000014;
tonhour=(edtValue)*8.3333344974;
fuelkl=(edtValue)*0.0026246723;
fuelb=(edtValue)*0.0165289279;
gigaton=(edtValue)*2.521644359E-11;
megaton=(edtValue)*2.521644359E-8;
kiloton=(edtValue)*0.0000252164;
ton=(edtValue)*0.0252164436;
dynecm=(edtValue)*1055055999999998.0;
gfm=(edtValue)*10758577088.0;
gfcm=(edtValue)*1075857708833.0;
kgfcm=(edtValue)*1075857708.8;
kgfm=(edtValue)*10758577.088;
kpm=(edtValue)*10758577.088;
pff=(edtValue)*77816937.099;
pfi=(edtValue)*933803245.19;
ofi=(edtValue)*14940851923.0;
fp=(edtValue)*77816937.099;
ip=(edtValue)*933803245.19;
io=(edtValue)*14940851923.0;
pdlft=(edtValue)*2503685918.2;
therm=(edtValue)*1;
thermec=(edtValue)*1;
thermus=(edtValue)*1.0002389069;
Hartree=(edtValue)*2.419992971E+25;
Rydberg=(edtValue)*4.839985942E+25;


 break;
case "Therm(US) - therm":

joule=(edtValue)*105480400;
kilojoule=(edtValue)*105480.4;
kilowatthour=(edtValue)*29.300111111;
watthour=(edtValue)*29300.111111;
calorie=(edtValue)*25193.560715;
horsepower=(edtValue)*39.837064456;
BtuIT=(edtValue)*99976.128977;
Btuth=(edtValue)*100043.05971;
gigajoule=(edtValue)*0.1054804;
megajoule=(edtValue)*105.4804;
millijoule=(edtValue)*105480400000.0;
microjoule=(edtValue)*105480399999999.0;
nanojoule=(edtValue)*105480399999998740.0;
attojoule=(edtValue)*1.054803999E+26;
megaelectronvolt=(edtValue)*658356587781692500000.0;
kiloelectronvolt=(edtValue)*6.583565877E+23;
electronvolt=(edtValue)*6.583565877E+26;
erg=(edtValue)*1054803999999987.0;
gigawatthour=(edtValue)*0.0000293001;
megawatthour=(edtValue)*0.0293001111;
kilowattsecond=(edtValue)*105480.4;
wattsecond=(edtValue)*105480400;
newtonmeter=(edtValue)*105480400;
horsepowerhour=(edtValue)*39.292096239;
kilocalorieIT=(edtValue)*25193.560715;
kilocalorieth=(edtValue)*25210.42065;
calorieit=(edtValue)*25193560.715;
calorieth=(edtValue)*25210420.65;
megaBtuIT=(edtValue)*0.099976129;
tonhour=(edtValue)*8.3313440815;
fuelkl=(edtValue)*0.0026240454;
fuelb=(edtValue)*0.01652498;
gigaton=(edtValue)*2.521042065E-11;
megaton=(edtValue)*2.521042065E-8;
kiloton=(edtValue)*0.0000252104;
ton=(edtValue)*0.0252104207;
dynecm=(edtValue)*1054803999999987.0;
gfm=(edtValue)*10756007403.0;
gfcm=(edtValue)*1075600740347.0;
kgfcm=(edtValue)*1075600740.3;
kgfm=(edtValue)*10756007.403;
kpm=(edtValue)*10756007.403;
pff=(edtValue)*77798350.533;
pfi=(edtValue)*933580206.4;
ofi=(edtValue)*14937283302.0;
fp=(edtValue)*77798350.533;
ip=(edtValue)*933580206.4;
io=(edtValue)*14937283302.0;
pdlft=(edtValue)*2503087913.2;
therm=(edtValue)*0.9997611501;
thermec=(edtValue)*0.9997611501;
thermus=(edtValue)*1;
Hartree=(edtValue)*2.419414956E+25;
Rydberg=(edtValue)*4.838829912E+25;


 break;
case "Hartree energy - He":

joule=(edtValue)*4.359748199E-18;
kilojoule=(edtValue)*4.359748199E-21;
kilowatthour=(edtValue)*1.211041166E-24;
watthour=(edtValue)*1.211041166E-21;
calorie=(edtValue)*1.041307967E-21;
horsepower=(edtValue)*1.646557749E-24;
BtuIT=(edtValue)*4.132243984E-21;
Btuth=(edtValue)*4.135010385E-21;
gigajoule=(edtValue)*4.359748199E-27;
megajoule=(edtValue)*4.359748199E-24;
millijoule=(edtValue)*4.359748199E-15;
microjoule=(edtValue)*4.359748199E-12;
nanojoule=(edtValue)*4.359748199E-9;
attojoule=(edtValue)*4.3597482;
megaelectronvolt=(edtValue)*0.0000272114;
kiloelectronvolt=(edtValue)*0.0272113961;
electronvolt=(edtValue)*27.211396132;
erg=(edtValue)*4.359748199E-11;
gigawatthour=(edtValue)*1.211041166E-30;
megawatthour=(edtValue)*1.211041166E-27;
kilowattsecond=(edtValue)*4.359748199E-21;
wattsecond=(edtValue)*4.359748199E-18;
newtonmeter=(edtValue)*4.359748199E-18;
horsepowerhour=(edtValue)*1.624032956E-24;
kilocalorieIT=(edtValue)*1.041307967E-21;
kilocalorieth=(edtValue)*1.042004827E-21;
calorieit=(edtValue)*1.041307967E-18;
calorieth=(edtValue)*1.042004827E-18;
megaBtuIT=(edtValue)*4.132243984E-27;
tonhour=(edtValue)*3.443536653E-25;
fuelkl=(edtValue)*1.084578473E-28;
fuelb=(edtValue)*6.830155345E-28;
gigaton=(edtValue)*1.042004827E-36;
megaton=(edtValue)*1.042004827E-33;
kiloton=(edtValue)*1.042004827E-30;
ton=(edtValue)*1.042004827E-27;
dynecm=(edtValue)*4.359748199E-11;
gfm=(edtValue)*4.445705924E-16;
gfcm=(edtValue)*4.445705924E-14;
kgfcm=(edtValue)*4.445705924E-17;
kgfm=(edtValue)*4.445705924E-19;
kpm=(edtValue)*4.445705924E-19;
pff=(edtValue)*3.215585252E-18;
pfi=(edtValue)*3.858702303E-17;
ofi=(edtValue)*6.173923685E-16;
fp=(edtValue)*3.215585252E-18;
ip=(edtValue)*3.858702303E-17;
io=(edtValue)*6.173923685E-16;
pdlft=(edtValue)*1.034583962E-16;
therm=(edtValue)*4.132243406E-26;
thermec=(edtValue)*4.132243406E-26;
thermus=(edtValue)*4.133230628E-26;
Hartree=(edtValue)*1;
Rydberg=(edtValue)*2;


break;

case "Rydberg constant - Rc":

joule=(edtValue)*2.179874099E-18;
kilojoule=(edtValue)*2.179874099E-21;
kilowatthour=(edtValue)*6.055205833E-25;
watthour=(edtValue)*6.055205833E-22;
calorie=(edtValue)*5.206539839E-22;
horsepower=(edtValue)*8.232788748E-25;
BtuIT=(edtValue)*2.066121992E-21;
Btuth=(edtValue)*2.067505192E-21;
gigajoule=(edtValue)*2.179874099E-27;
megajoule=(edtValue)*2.179874099E-24;
millijoule=(edtValue)*2.179874099E-15;
microjoule=(edtValue)*2.179874099E-12;
nanojoule=(edtValue)*2.179874099E-9;
attojoule=(edtValue)*2.1798741;
megaelectronvolt=(edtValue)*0.0000136057;
kiloelectronvolt=(edtValue)*0.0136056981;
electronvolt=(edtValue)*13.605698066;
erg=(edtValue)*2.179874099E-11;
gigawatthour=(edtValue)*6.055205833E-31;
megawatthour=(edtValue)*6.055205833E-28;
kilowattsecond=(edtValue)*2.179874099E-21;
wattsecond=(edtValue)*2.179874099E-18;
newtonmeter=(edtValue)*2.179874099E-18;
horsepowerhour=(edtValue)*8.120164781E-25;
kilocalorieIT=(edtValue)*5.206539839E-22;
kilocalorieth=(edtValue)*5.210024139E-22;
calorieit=(edtValue)*5.206539839E-19;
calorieth=(edtValue)*5.210024139E-19;
megaBtuIT=(edtValue)*2.066121992E-27;
tonhour=(edtValue)*1.721768326E-25;
fuelkl=(edtValue)*5.422892367E-29;
fuelb=(edtValue)*3.415077672E-28;
gigaton=(edtValue)*5.210024139E-37;
megaton=(edtValue)*5.210024139E-34;
kiloton=(edtValue)*5.210024139E-31;
ton=(edtValue)*5.210024139E-28;
dynecm=(edtValue)*2.179874099E-11;
gfm=(edtValue)*2.222852962E-16;
gfcm=(edtValue)*2.222852962E-14;
kgfcm=(edtValue)*2.222852962E-17;
kgfm=(edtValue)*2.222852962E-19;
kpm=(edtValue)*2.222852962E-19;
pff=(edtValue)*1.607792626E-18;
pfi=(edtValue)*1.929351151E-17;
ofi=(edtValue)*3.086961842E-16;
fp=(edtValue)*1.607792626E-18;
ip=(edtValue)*1.929351151E-17;
io=(edtValue)*3.086961842E-16;
pdlft=(edtValue)*5.172919814E-17;
therm=(edtValue)*2.066121703E-26;
thermec=(edtValue)*2.066121703E-26;
thermus=(edtValue)*2.066615314E-26;
Hartree=(edtValue)*0.5;
Rydberg=(edtValue)*1;



break;


	
	}
    
	    results.setJoule(joule);
      results.setKilojoule(kilojoule);
      results.setKilowatthour(kilowatthour); 
      results.setWatthour(watthour);
      results.setCalorie(calorie);
      results.setHorsepower(horsepower);
      results.setBtuIT(BtuIT);
      results.setBtuth(Btuth); 
      results.setGigajoule(gigajoule);
      results.setMegajoule(megajoule);
      results.setMillijoule(millijoule);
      results.setMicrojoule(microjoule);
      results.setNanojoule(nanojoule);
      results.setAttojoule(attojoule);
      results.setMegaelectronvolt(megaelectronvolt); 
      results.setKiloelectronvolt(kiloelectronvolt);
      results.setElectronvolt(electronvolt);
      results.setErg(erg);
      results.setGigawatthour(gigawatthour);
      results.setMegawatthour(megawatthour); 
      results.setKilowattsecond(kilowattsecond);
      results.setWattsecond(wattsecond);
      results.setNewtonmeter(newtonmeter);
      results.setHorsepowerhour(horsepowerhour);
      results.setKilocalorieIT(kilocalorieIT);
      results.setKilocalorieth(kilocalorieth);
      results.setCalorieit(calorieit); 
      results.setCalorieth(calorieth);
      results.setMegaBtuIT(megaBtuIT);
      results.setTonhour(tonhour);
      results.setFuelkl(fuelkl);
      results.setFuelb(fuelb); 
      results.setGigaton(gigaton);
      results.setMegaton(megaton);
      results.setKiloton(kiloton);
      results.setTon(ton);
      results.setDynecm(dynecm);
      results.setGfm(gfm);
      results.setGfcm(gfcm);
      results.setKgfcm(kgfcm);
      results.setKgfm(kgfm);
      results.setKpm(kpm);
      results.setPff(pff);
      results.setPfi(pfi); 
      results.setOfi(ofi);
      results.setFp(fp);
      results.setIp(ip);
      results.setIo(io);
      results.setPdlft(pdlft); 
      results.setTherm(therm);
      results.setThermec(thermec);
      results.setThermus(thermus);
      results.setHartree(Hartree);
      results.setRydberg(Rydberg);
      
     
      converterArray.add(results);
      
	    return converterArray;     
      

}
		  public class ConversionResults{
			  
				private double joule,kilojoule,kilowatthour,watthour,calorie,horsepower,BtuIT,Btuth,gigajoule,megajoule,millijoule,microjoule,nanojoule,attojoule,megaelectronvolt,
			    kiloelectronvolt,electronvolt,erg,gigawatthour,megawatthour,kilowattsecond,wattsecond,newtonmeter,horsepowerhour,kilocalorieIT,kilocalorieth,calorieit,
			    calorieth,megaBtuIT,tonhour,fuelkl,fuelb,gigaton,megaton,kiloton,ton,dynecm,gfm,gfcm,kgfcm,kgfm,kpm,pff,pfi,ofi,fp,ip,io,pdlft,therm,thermec,thermus,Hartree,Rydberg;

				public double getJoule() {
					return joule;
				}

				public void setJoule(double joule) {
					this.joule = joule;
				}

				public double getKilojoule() {
					return kilojoule;
				}

				public void setKilojoule(double kilojoule) {
					this.kilojoule = kilojoule;
				}

				public double getKilowatthour() {
					return kilowatthour;
				}

				public void setKilowatthour(double kilowatthour) {
					this.kilowatthour = kilowatthour;
				}

				public double getWatthour() {
					return watthour;
				}

				public void setWatthour(double watthour) {
					this.watthour = watthour;
				}

				public double getCalorie() {
					return calorie;
				}

				public void setCalorie(double calorie) {
					this.calorie = calorie;
				}

				public double getHorsepower() {
					return horsepower;
				}

				public void setHorsepower(double horsepower) {
					this.horsepower = horsepower;
				}

				public double getBtuIT() {
					return BtuIT;
				}

				public void setBtuIT(double btuIT) {
					BtuIT = btuIT;
				}

				public double getBtuth() {
					return Btuth;
				}

				public void setBtuth(double btuth) {
					Btuth = btuth;
				}

				public double getGigajoule() {
					return gigajoule;
				}

				public void setGigajoule(double gigajoule) {
					this.gigajoule = gigajoule;
				}

				public double getMegajoule() {
					return megajoule;
				}

				public void setMegajoule(double megajoule) {
					this.megajoule = megajoule;
				}

				public double getMillijoule() {
					return millijoule;
				}

				public void setMillijoule(double millijoule) {
					this.millijoule = millijoule;
				}

				public double getMicrojoule() {
					return microjoule;
				}

				public void setMicrojoule(double microjoule) {
					this.microjoule = microjoule;
				}

				public double getNanojoule() {
					return nanojoule;
				}

				public void setNanojoule(double nanojoule) {
					this.nanojoule = nanojoule;
				}

				public double getAttojoule() {
					return attojoule;
				}

				public void setAttojoule(double attojoule) {
					this.attojoule = attojoule;
				}

				public double getMegaelectronvolt() {
					return megaelectronvolt;
				}

				public void setMegaelectronvolt(double megaelectronvolt) {
					this.megaelectronvolt = megaelectronvolt;
				}

				public double getKiloelectronvolt() {
					return kiloelectronvolt;
				}

				public void setKiloelectronvolt(double kiloelectronvolt) {
					this.kiloelectronvolt = kiloelectronvolt;
				}

				public double getElectronvolt() {
					return electronvolt;
				}

				public void setElectronvolt(double electronvolt) {
					this.electronvolt = electronvolt;
				}

				public double getErg() {
					return erg;
				}

				public void setErg(double erg) {
					this.erg = erg;
				}

				public double getGigawatthour() {
					return gigawatthour;
				}

				public void setGigawatthour(double gigawatthour) {
					this.gigawatthour = gigawatthour;
				}

				public double getMegawatthour() {
					return megawatthour;
				}

				public void setMegawatthour(double megawatthour) {
					this.megawatthour = megawatthour;
				}

				public double getKilowattsecond() {
					return kilowattsecond;
				}

				public void setKilowattsecond(double kilowattsecond) {
					this.kilowattsecond = kilowattsecond;
				}

				public double getWattsecond() {
					return wattsecond;
				}

				public void setWattsecond(double wattsecond) {
					this.wattsecond = wattsecond;
				}

				public double getNewtonmeter() {
					return newtonmeter;
				}

				public void setNewtonmeter(double newtonmeter) {
					this.newtonmeter = newtonmeter;
				}

				public double getHorsepowerhour() {
					return horsepowerhour;
				}

				public void setHorsepowerhour(double horsepowerhour) {
					this.horsepowerhour = horsepowerhour;
				}

				public double getKilocalorieIT() {
					return kilocalorieIT;
				}

				public void setKilocalorieIT(double kilocalorieIT) {
					this.kilocalorieIT = kilocalorieIT;
				}

				public double getKilocalorieth() {
					return kilocalorieth;
				}

				public void setKilocalorieth(double kilocalorieth) {
					this.kilocalorieth = kilocalorieth;
				}

				public double getCalorieit() {
					return calorieit;
				}

				public void setCalorieit(double calorieit) {
					this.calorieit = calorieit;
				}

				public double getCalorieth() {
					return calorieth;
				}

				public void setCalorieth(double calorieth) {
					this.calorieth = calorieth;
				}

				public double getMegaBtuIT() {
					return megaBtuIT;
				}

				public void setMegaBtuIT(double megaBtuIT) {
					this.megaBtuIT = megaBtuIT;
				}

				public double getTonhour() {
					return tonhour;
				}

				public void setTonhour(double tonhour) {
					this.tonhour = tonhour;
				}

				public double getFuelkl() {
					return fuelkl;
				}

				public void setFuelkl(double fuelkl) {
					this.fuelkl = fuelkl;
				}

				public double getFuelb() {
					return fuelb;
				}

				public void setFuelb(double fuelb) {
					this.fuelb = fuelb;
				}

				public double getGigaton() {
					return gigaton;
				}

				public void setGigaton(double gigaton) {
					this.gigaton = gigaton;
				}

				public double getMegaton() {
					return megaton;
				}

				public void setMegaton(double megaton) {
					this.megaton = megaton;
				}

				public double getKiloton() {
					return kiloton;
				}

				public void setKiloton(double kiloton) {
					this.kiloton = kiloton;
				}

				public double getTon() {
					return ton;
				}

				public void setTon(double ton) {
					this.ton = ton;
				}

				public double getDynecm() {
					return dynecm;
				}

				public void setDynecm(double dynecm) {
					this.dynecm = dynecm;
				}

				public double getGfm() {
					return gfm;
				}

				public void setGfm(double gfm) {
					this.gfm = gfm;
				}

				public double getGfcm() {
					return gfcm;
				}

				public void setGfcm(double gfcm) {
					this.gfcm = gfcm;
				}

				public double getKgfcm() {
					return kgfcm;
				}

				public void setKgfcm(double kgfcm) {
					this.kgfcm = kgfcm;
				}

				public double getKgfm() {
					return kgfm;
				}

				public void setKgfm(double kgfm) {
					this.kgfm = kgfm;
				}

				public double getKpm() {
					return kpm;
				}

				public void setKpm(double kpm) {
					this.kpm = kpm;
				}

				public double getPff() {
					return pff;
				}

				public void setPff(double pff) {
					this.pff = pff;
				}

				public double getPfi() {
					return pfi;
				}

				public void setPfi(double pfi) {
					this.pfi = pfi;
				}

				public double getOfi() {
					return ofi;
				}

				public void setOfi(double ofi) {
					this.ofi = ofi;
				}

				public double getFp() {
					return fp;
				}

				public void setFp(double fp) {
					this.fp = fp;
				}

				public double getIp() {
					return ip;
				}

				public void setIp(double ip) {
					this.ip = ip;
				}

				public double getIo() {
					return io;
				}

				public void setIo(double io) {
					this.io = io;
				}

				public double getPdlft() {
					return pdlft;
				}

				public void setPdlft(double pdlft) {
					this.pdlft = pdlft;
				}

				public double getTherm() {
					return therm;
				}

				public void setTherm(double therm) {
					this.therm = therm;
				}

				public double getThermec() {
					return thermec;
				}

				public void setThermec(double thermec) {
					this.thermec = thermec;
				}

				public double getThermus() {
					return thermus;
				}

				public void setThermus(double thermus) {
					this.thermus = thermus;
				}

				public double getHartree() {
					return Hartree;
				}

				public void setHartree(double hartree) {
					Hartree = hartree;
				}

				public double getRydberg() {
					return Rydberg;
				}

				public void setRydberg(double rydberg) {
					Rydberg = rydberg;
				}

				

				

			  
		  }
}