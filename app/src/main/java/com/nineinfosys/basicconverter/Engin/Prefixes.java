package com.nineinfosys.basicconverter.Engin;

import java.util.ArrayList;


public class Prefixes {
	
	private double none,yotta,zetta,exa,peta,tera,giga,mega,kilo,hecto,deka,deci,centi,milli,micro,nano,pico,femto,atto,zepto,yocto;
	private double edtValue;
	private String conversionFrom;
	
			
	

	public Prefixes(String conversionFrom, double edtValue) {
				
				this.conversionFrom = conversionFrom;
				this.edtValue = edtValue;
			}

			public ArrayList<ConversionResults> calculateprefixConversion()
			
		    {
		    	
				ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
					
				ConversionResults results= new ConversionResults();
		    		 	
				switch(conversionFrom)
				
				{
				case "None - none":
					
					none=(edtValue)*1;
					yotta=(edtValue)*1.E-24;
					zetta=(edtValue)*1.E-21;
					exa=(edtValue)*1.E-18;
					peta=(edtValue)*1.E-15;
					tera=(edtValue)*1.E-12;
					giga=(edtValue)*1.E-9;
					mega=(edtValue)*0.000001;
					kilo=(edtValue)*0.001;
					hecto=(edtValue)*0.01;
					deka=(edtValue)*0.1;
					deci=(edtValue)*10;
					centi=(edtValue)*100;
					milli=(edtValue)*1000;
					micro=(edtValue)*1000000;
					nano=(edtValue)*1000000000;
					pico=(edtValue)*1000000000000.00;
					femto=(edtValue)*1000000000000000.00;
					atto=(edtValue)*1000000000000000000.00;
					zepto=(edtValue)*1.E+21;
					yocto=(edtValue)*1.E+24;
					
					 break;
                  case "Yotta - Y":
					
                	  none=(edtValue)*1.E+24;
  					yotta=(edtValue)*1;
  					zetta=(edtValue)*1000;
  					exa=(edtValue)*1000000;
  					peta=(edtValue)*1000000000;
  					tera=(edtValue)*1000000000000.00;
  					giga=(edtValue)*1000000000000000.00;
  					mega=(edtValue)*1000000000000000000.00;
  					kilo=(edtValue)*1.E+21;
  					hecto=(edtValue)*1.E+22;
  					deka=(edtValue)*1.E+23;
  					deci=(edtValue)*1.E+25;
  					centi=(edtValue)*1.E+26;
  					milli=(edtValue)*1.E+27;
  					micro=(edtValue)*1.E+30;
  					nano=(edtValue)*1.E+33;
  					pico=(edtValue)*1.E+36;
  					femto=(edtValue)*1.E+39;
  					atto=(edtValue)*1.E+42;
  					zepto=(edtValue)*1.E+45;
  					yocto=(edtValue)*1.E+48;
					
					
					 break;
                case "Zetta - Z":
	
                	none=(edtValue)*1.E+21;
					yotta=(edtValue)*0.001;
					zetta=(edtValue)*1;
					exa=(edtValue)*1000;
					peta=(edtValue)*1000000;
					tera=(edtValue)*1000000000;
					giga=(edtValue)*1000000000000.00;
					mega=(edtValue)*1000000000000000.00;
					kilo=(edtValue)*1000000000000000100.00;
					hecto=(edtValue)*10000000000000002000.00;
					deka=(edtValue)*100000000000000020000.00;
					deci=(edtValue)*1.E+22;
					centi=(edtValue)*1.E+23;
					milli=(edtValue)*1.E+24;
					micro=(edtValue)*1.E+27;
					nano=(edtValue)*1.E+30;
					pico=(edtValue)*1.E+33;
					femto=(edtValue)*1.E+36;
					atto=(edtValue)*1.E+39;
					zepto=(edtValue)*1.E+42;
					yocto=(edtValue)*1.E+45;
	
	
	
	 break;
case "Exa - E":
	
	none=(edtValue)*999999999999999900.00;
	yotta=(edtValue)*0.000001;
	zetta=(edtValue)*0.001;
	exa=(edtValue)*1;
	peta=(edtValue)*1000;
	tera=(edtValue)*1000000;
	giga=(edtValue)*1000000000;
	mega=(edtValue)*1000000000000.00;
	kilo=(edtValue)*1000000000000000.00;
	hecto=(edtValue)*10000000000000000.00;
	deka=(edtValue)*100000000000000000.00;
	deci=(edtValue)*10000000000000000000.00;
	centi=(edtValue)*100000000000000000000.00;
	milli=(edtValue)*999999999999999900000.00;
	micro=(edtValue)*1.E+24;
	nano=(edtValue)*9.999999999E+26;
	pico=(edtValue)*9.999999999E+29;
	femto=(edtValue)*1.E+33;
	atto=(edtValue)*9.999999999E+35;
	zepto=(edtValue)*1.E+39;
	yocto=(edtValue)*9.999999999E+41;
	
	
	
	 break;
case "Peta - P":
	
	none=(edtValue)*1000000000000000.00;
	yotta=(edtValue)*9.999999999E-10;
	zetta=(edtValue)*9.999999999E-7;
	exa=(edtValue)*0.001;
	peta=(edtValue)*1;
	tera=(edtValue)*1000;
	giga=(edtValue)*1000000;
	mega=(edtValue)*1000000000;
	kilo=(edtValue)*1000000000000.00;
	hecto=(edtValue)*10000000000000.00;
	deka=(edtValue)*100000000000000.00;
	deci=(edtValue)*10000000000000000.00;
	centi=(edtValue)*100000000000000000.00;
	milli=(edtValue)*999999999999999900.00;
	micro=(edtValue)*999999999999999900000.00;
	nano=(edtValue)*1.E+24;
	pico=(edtValue)*9.999999999E+26;
	femto=(edtValue)*9.999999999E+29;
	atto=(edtValue)*1.E+33;
	zepto=(edtValue)*9.999999999E+35;
	yocto=(edtValue)*1.E+39;
	
	
	 break;
case "Tera - T":
	
	none=(edtValue)*1000000000000.00;
	yotta=(edtValue)*1.E-12;
	zetta=(edtValue)*9.999999999E-10;
	exa=(edtValue)*0.000001;
	peta=(edtValue)*0.001;
	tera=(edtValue)*1;
	giga=(edtValue)*1000;
	mega=(edtValue)*1000000;
	kilo=(edtValue)*1000000000;
	hecto=(edtValue)*10000000000.00;
	deka=(edtValue)*100000000000.00;
	deci=(edtValue)*10000000000000.00;
	centi=(edtValue)*100000000000000.00;
	milli=(edtValue)*1000000000000000.00;
	micro=(edtValue)*1000000000000000000.00;
	nano=(edtValue)*1.E+21;
	pico=(edtValue)*1.E+24;
	femto=(edtValue)*1.E+27;
	atto=(edtValue)*1.E+30;
	zepto=(edtValue)*1.E+33;
	yocto=(edtValue)*1.E+36;
	
	
	
	 break;
case "Giga - G":
	
	none=(edtValue)*1000000000;
	yotta=(edtValue)*9.999999999E-16;
	zetta=(edtValue)*9.999999999E-13;
	exa=(edtValue)*1.E-9;
	peta=(edtValue)*0.000001;
	tera=(edtValue)*0.001;
	giga=(edtValue)*1;
	mega=(edtValue)*1000;
	kilo=(edtValue)*1000000;
	hecto=(edtValue)*10000000;
	deka=(edtValue)*100000000;
	deci=(edtValue)*10000000000.00;
	centi=(edtValue)*100000000000.00;
	milli=(edtValue)*1000000000000.00;
	micro=(edtValue)*1000000000000000.00;
	nano=(edtValue)*1000000000000000000.00;
	pico=(edtValue)*1.E+21;
	femto=(edtValue)*1.E+24;
	atto=(edtValue)*9.999999999E+26;
	zepto=(edtValue)*9.999999999E+29;
	yocto=(edtValue)*1.E+33;
	
	
	
	 break;
case "Mega - M":
	
	none=(edtValue)*1000000;
	yotta=(edtValue)*9.999999999E-19;
	zetta=(edtValue)*9.999999999E-16;
	exa=(edtValue)*1.E-12;
	peta=(edtValue)*1.E-9;
	tera=(edtValue)*0.000001;
	giga=(edtValue)*0.001;
	mega=(edtValue)*1;
	kilo=(edtValue)*1000;
	hecto=(edtValue)*10000;
	deka=(edtValue)*100000;
	deci=(edtValue)*10000000;
	centi=(edtValue)*100000000;
	milli=(edtValue)*1000000000;
	micro=(edtValue)*1000000000000.00;
	nano=(edtValue)*1000000000000000.00;
	pico=(edtValue)*1000000000000000000.00;
	femto=(edtValue)*1.E+21;
	atto=(edtValue)*1.E+24;
	zepto=(edtValue)*1.E+27;
	yocto=(edtValue)*1.E+30;
	
	
	 break;
case "Kilo - k":
	
	none=(edtValue)*1000;
	yotta=(edtValue)*1.E-21;
	zetta=(edtValue)*9.999999999E-19;
	exa=(edtValue)*1.E-15;
	peta=(edtValue)*1.E-12;
	tera=(edtValue)*1.E-9;
	giga=(edtValue)*0.000001;
	mega=(edtValue)*0.001;
	kilo=(edtValue)*1;
	hecto=(edtValue)*10;
	deka=(edtValue)*100;
	deci=(edtValue)*10000;
	centi=(edtValue)*100000;
	milli=(edtValue)*1000000;
	micro=(edtValue)*1000000000;
	nano=(edtValue)*1000000000000.00;
	pico=(edtValue)*1000000000000000.00;
	femto=(edtValue)*1000000000000000000.00;
	atto=(edtValue)*1.E+21;
	zepto=(edtValue)*1.E+24;
	yocto=(edtValue)*1.E+27;
	
	
	
	 break;
case "Hecto - h":
	
	none=(edtValue)*100;
	yotta=(edtValue)*9.999999999E-23;
	zetta=(edtValue)*9.999999999E-20;
	exa=(edtValue)*1.E-16;
	peta=(edtValue)*1.E-13;
	tera=(edtValue)*9.999999999E-11;
	giga=(edtValue)*1.E-7;
	mega=(edtValue)*0.0001;
	kilo=(edtValue)*0.1;
	hecto=(edtValue)*1;
	deka=(edtValue)*10;
	deci=(edtValue)*1000;
	centi=(edtValue)*10000;
	milli=(edtValue)*100000;
	micro=(edtValue)*100000000;
	nano=(edtValue)*100000000000.00;
	pico=(edtValue)*100000000000000.00;
	femto=(edtValue)*100000000000000000.00;
	atto=(edtValue)*100000000000000000000.00;
	zepto=(edtValue)*1.E+23;
	yocto=(edtValue)*1.E+26;
	
	
	
	 break;
case "Deka - da":
	
	none=(edtValue)*10;
	yotta=(edtValue)*9.999999999E-24;
	zetta=(edtValue)*9.999999999E-21;
	exa=(edtValue)*1.E-17;
	peta=(edtValue)*1.E-14;
	tera=(edtValue)*1.E-11;
	giga=(edtValue)*1.E-8;
	mega=(edtValue)*0.00001;
	kilo=(edtValue)*0.01;
	hecto=(edtValue)*0.1;
	deka=(edtValue)*1;
	deci=(edtValue)*100;
	centi=(edtValue)*1000;
	milli=(edtValue)*10000;
	micro=(edtValue)*10000000;
	nano=(edtValue)*10000000000.00;
	pico=(edtValue)*10000000000000.00;
	femto=(edtValue)*10000000000000000.00;
	atto=(edtValue)*10000000000000000000.00;
	zepto=(edtValue)*1.E+22;
	yocto=(edtValue)*9.999999999E+24;
	
	
	
	 break;
case "Deci - d":
	
	none=(edtValue)*0.1;
	yotta=(edtValue)*9.999999999E-26;
	zetta=(edtValue)*9.999999999E-23;
	exa=(edtValue)*1.E-19;
	peta=(edtValue)*1.E-16;
	tera=(edtValue)*1.E-13;
	giga=(edtValue)*1.E-10;
	mega=(edtValue)*1.E-7;
	kilo=(edtValue)*0.0001;
	hecto=(edtValue)*0.001;
	deka=(edtValue)*0.01;
	deci=(edtValue)*1;
	centi=(edtValue)*10;
	milli=(edtValue)*100;
	micro=(edtValue)*100000;
	nano=(edtValue)*100000000;
	pico=(edtValue)*100000000000.00;
	femto=(edtValue)*100000000000000.00;
	atto=(edtValue)*100000000000000000.00;
	zepto=(edtValue)*100000000000000000000.00;
	yocto=(edtValue)*1.E+23;
	
	
	 break;
case "Centi - c":
	
	none=(edtValue)*0.01;
	yotta=(edtValue)*9.999999999E-27;
	zetta=(edtValue)*1.E-23;
	exa=(edtValue)*1.E-20;
	peta=(edtValue)*1.E-17;
	tera=(edtValue)*1.E-14;
	giga=(edtValue)*1.E-11;
	mega=(edtValue)*1.E-8;
	kilo=(edtValue)*0.00001;
	hecto=(edtValue)*0.0001;
	deka=(edtValue)*0.001;
	deci=(edtValue)*0.1;
	centi=(edtValue)*1;
	milli=(edtValue)*10;
	micro=(edtValue)*10000;
	nano=(edtValue)*10000000;
	pico=(edtValue)*10000000000.00;
	femto=(edtValue)*10000000000000.00;
	atto=(edtValue)*10000000000000000.00;
	zepto=(edtValue)*10000000000000000000.00;
	yocto=(edtValue)*1.E+22;
	
	 break;
case "Milli - m":
	
	none=(edtValue)*0.001;
	yotta=(edtValue)*9.999999999E-28;
	zetta=(edtValue)*1.E-24;
	exa=(edtValue)*1.E-21;
	peta=(edtValue)*1.E-18;
	tera=(edtValue)*1.E-15;
	giga=(edtValue)*1.E-12;
	mega=(edtValue)*9.999999999E-10;
	kilo=(edtValue)*0.000001;
	hecto=(edtValue)*0.00001;
	deka=(edtValue)*0.0001;
	deci=(edtValue)*0.01;
	centi=(edtValue)*0.1;
	milli=(edtValue)*1;
	micro=(edtValue)*1000;
	nano=(edtValue)*1000000;
	pico=(edtValue)*1000000000;
	femto=(edtValue)*1000000000000.00;
	atto=(edtValue)*1000000000000000.00;
	zepto=(edtValue)*1000000000000000000.00;
	yocto=(edtValue)*1.E+21;
	
	break;
case "Micro - µ":
	
	none=(edtValue)*0.000001;
	yotta=(edtValue)*9.999999999E-31;
	zetta=(edtValue)*9.999999999E-28;
	exa=(edtValue)*1.E-24;
	peta=(edtValue)*1.E-21;
	tera=(edtValue)*1.E-18;
	giga=(edtValue)*1.E-15;
	mega=(edtValue)*1.E-12;
	kilo=(edtValue)*1.E-9;
	hecto=(edtValue)*1.E-8;
	deka=(edtValue)*1.E-7;
	deci=(edtValue)*0.00001;
	centi=(edtValue)*0.0001;
	milli=(edtValue)*0.001;
	micro=(edtValue)*1;
	nano=(edtValue)*1000;
	pico=(edtValue)*1000000;
	femto=(edtValue)*1000000000;
	atto=(edtValue)*1000000000000.00;
	zepto=(edtValue)*1000000000000000.00;
	yocto=(edtValue)*1000000000000000000.00;
	
	 break;
case "Nano - n":
	
	none=(edtValue)*1.E-9;
	yotta=(edtValue)*9.999999999E-34;
	zetta=(edtValue)*9.999999999E-31;
	exa=(edtValue)*1.E-27;
	peta=(edtValue)*1.E-24;
	tera=(edtValue)*1.E-21;
	giga=(edtValue)*1.E-18;
	mega=(edtValue)*9.999999999E-16;
	kilo=(edtValue)*1.E-12;
	hecto=(edtValue)*1.E-11;
	deka=(edtValue)*1.E-10;
	deci=(edtValue)*1.E-8;
	centi=(edtValue)*1.E-7;
	milli=(edtValue)*0.000001;
	micro=(edtValue)*0.001;
	nano=(edtValue)*1;
	pico=(edtValue)*1000;
	femto=(edtValue)*1000000;
	atto=(edtValue)*1000000000;
	zepto=(edtValue)*1000000000000.00;
	yocto=(edtValue)*1000000000000000.00;
	
	 break;
case "Pico - p":
	
	none=(edtValue)*1.E-12;
	yotta=(edtValue)*1.E-36;
	zetta=(edtValue)*9.999999999E-34;
	exa=(edtValue)*1.E-30;
	peta=(edtValue)*1.E-27;
	tera=(edtValue)*1.E-24;
	giga=(edtValue)*1.E-21;
	mega=(edtValue)*9.999999999E-19;
	kilo=(edtValue)*1.E-15;
	hecto=(edtValue)*1.E-14;
	deka=(edtValue)*1.E-13;
	deci=(edtValue)*1.E-11;
	centi=(edtValue)*1.E-10;
	milli=(edtValue)*1.E-9;
	micro=(edtValue)*0.000001;
	nano=(edtValue)*0.001;
	pico=(edtValue)*1;
	femto=(edtValue)*1000;
	atto=(edtValue)*1000000;
	zepto=(edtValue)*1000000000;
	yocto=(edtValue)*1000000000000.00;
	
	 break;
case "Femto - f":
	
	none=(edtValue)*1.E-15;
	yotta=(edtValue)*1.E-39;
	zetta=(edtValue)*1.E-36;
	exa=(edtValue)*1.E-33;
	peta=(edtValue)*1.E-30;
	tera=(edtValue)*1.E-27;
	giga=(edtValue)*1.E-24;
	mega=(edtValue)*1.E-21;
	kilo=(edtValue)*1.E-18;
	hecto=(edtValue)*1.E-17;
	deka=(edtValue)*1.E-16;
	deci=(edtValue)*1.E-14;
	centi=(edtValue)*1.E-13;
	milli=(edtValue)*1.E-12;
	micro=(edtValue)*1.E-9;
	nano=(edtValue)*0.000001;
	pico=(edtValue)*0.001;
	femto=(edtValue)*1;
	atto=(edtValue)*1000;
	zepto=(edtValue)*1000000;
	yocto=(edtValue)*1000000000;
	
	 break;
case "Atto - a":
	
	none=(edtValue)*1.E-18;
	yotta=(edtValue)*9.999999999E-43;
	zetta=(edtValue)*1.E-39;
	exa=(edtValue)*1.E-36;
	peta=(edtValue)*1.E-33;
	tera=(edtValue)*9.999999999E-31;
	giga=(edtValue)*1.E-27;
	mega=(edtValue)*1.E-24;
	kilo=(edtValue)*1.E-21;
	hecto=(edtValue)*1.E-20;
	deka=(edtValue)*1.E-19;
	deci=(edtValue)*1.E-17;
	centi=(edtValue)*1.E-16;
	milli=(edtValue)*1.E-15;
	micro=(edtValue)*1.E-12;
	nano=(edtValue)*1.E-9;
	pico=(edtValue)*0.000001;
	femto=(edtValue)*0.001;
	atto=(edtValue)*1;
	zepto=(edtValue)*1000;
	yocto=(edtValue)*1000000;
	
	 break;
case "Zepto - z":
	
	none=(edtValue)*1.E-21;
	yotta=(edtValue)*1.E-45;
	zetta=(edtValue)*9.999999999E-43;
	exa=(edtValue)*1.E-39;
	peta=(edtValue)*1.E-36;
	tera=(edtValue)*1.E-33;
	giga=(edtValue)*1.E-30;
	mega=(edtValue)*1.E-27;
	kilo=(edtValue)*1.E-24;
	hecto=(edtValue)*1.E-23;
	deka=(edtValue)*1.E-22;
	deci=(edtValue)*1.E-20;
	centi=(edtValue)*1.E-19;
	milli=(edtValue)*1.E-18;
	micro=(edtValue)*1.E-15;
	nano=(edtValue)*1.E-12;
	pico=(edtValue)*1.E-9;
	femto=(edtValue)*0.000001;
	atto=(edtValue)*0.001;
	zepto=(edtValue)*1;
	yocto=(edtValue)*1000;
	
	 break;
case "Yocto - y":
	
	none=(edtValue)*1.E-24;
	yotta=(edtValue)*1.E-48;
	zetta=(edtValue)*1.E-45;
	exa=(edtValue)*1.E-42;
	peta=(edtValue)*1.E-39;
	tera=(edtValue)*1.E-36;
	giga=(edtValue)*1.E-33;
	mega=(edtValue)*9.999999999E-31;
	kilo=(edtValue)*1.E-27;
	hecto=(edtValue)*1.E-26;
	deka=(edtValue)*1.E-25;
	deci=(edtValue)*1.E-23;
	centi=(edtValue)*1.E-22;
	milli=(edtValue)*1.E-21;
	micro=(edtValue)*1.E-18;
	nano=(edtValue)*1.E-15;
	pico=(edtValue)*1.E-12;
	femto=(edtValue)*1.E-9;
	atto=(edtValue)*0.000001;
	zepto=(edtValue)*0.001;
	yocto=(edtValue)*1;
	
	 break;
				
				}
				    results.setNone(none);
	    	         results.setYotta(yotta);
	    	         results.setZetta(zetta); 
	    	         results.setExa(exa);
	    	         results.setPeta(peta);
	    	         results.setTera(tera);
	    	         results.setGiga(giga);
	    	         results.setMega(mega); 
	    	         results.setKilo(kilo);
	    	         results.setHecto(hecto);
	    	         results.setDeka(deka);
	    	         results.setDeci(deci);
	    	         results.setCenti(centi); 
	    	         results.setMilli(milli);
	    	         results.setMicro(micro);
	    	         results.setNano(nano);
	    	         results.setPico(pico);
	    	         results.setFemto(femto);
	    	         results.setAtto(atto); 
	    	         results.setZepto(zepto);
	    	         results.setYocto(yocto);
	    	        
	    	        
	    	         converterArray.add(results);
	    	         
	 			    return converterArray;     
	    	         
			   
			  }
					  public class ConversionResults{
						  
							private double none,yotta,zetta,exa,peta,tera,giga,mega,kilo,hecto,deka,deci,centi,milli,micro,nano,pico,femto,atto,zepto,yocto;

						  
						  public double getNone() {
							return none;
						}

						public void setNone(double none) {
							this.none = none;
						}

						public double getYotta() {
							return yotta;
						}

						public void setYotta(double yotta) {
							this.yotta = yotta;
						}

						public double getZetta() {
							return zetta;
						}

						public void setZetta(double zetta) {
							this.zetta = zetta;
						}

						public double getExa() {
							return exa;
						}

						public void setExa(double exa) {
							this.exa = exa;
						}

						public double getPeta() {
							return peta;
						}

						public void setPeta(double peta) {
							this.peta = peta;
						}

						public double getTera() {
							return tera;
						}

						public void setTera(double tera) {
							this.tera = tera;
						}

						public double getGiga() {
							return giga;
						}

						public void setGiga(double giga) {
							this.giga = giga;
						}

						public double getMega() {
							return mega;
						}

						public void setMega(double mega) {
							this.mega = mega;
						}

						public double getKilo() {
							return kilo;
						}

						public void setKilo(double kilo) {
							this.kilo = kilo;
						}

						public double getHecto() {
							return hecto;
						}

						public void setHecto(double hecto) {
							this.hecto = hecto;
						}

						public double getDeka() {
							return deka;
						}

						public void setDeka(double deka) {
							this.deka = deka;
						}

						public double getDeci() {
							return deci;
						}

						public void setDeci(double deci) {
							this.deci = deci;
						}

						public double getCenti() {
							return centi;
						}

						public void setCenti(double centi) {
							this.centi = centi;
						}

						public double getMilli() {
							return milli;
						}

						public void setMilli(double milli) {
							this.milli = milli;
						}

						public double getMicro() {
							return micro;
						}

						public void setMicro(double micro) {
							this.micro = micro;
						}

						public double getNano() {
							return nano;
						}

						public void setNano(double nano) {
							this.nano = nano;
						}

						public double getPico() {
							return pico;
						}

						public void setPico(double pico) {
							this.pico = pico;
						}

						public double getFemto() {
							return femto;
						}

						public void setFemto(double femto) {
							this.femto = femto;
						}

						public double getAtto() {
							return atto;
						}

						public void setAtto(double atto) {
							this.atto = atto;
						}

						public double getZepto() {
							return zepto;
						}

						public void setZepto(double zepto) {
							this.zepto = zepto;
						}

						public double getYocto() {
							return yocto;
						}

						public void setYocto(double yocto) {
							this.yocto = yocto;
						}


						
						  
						 
			   			   
				  }
          }
