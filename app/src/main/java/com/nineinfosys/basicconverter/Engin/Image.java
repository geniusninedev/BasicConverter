package com.nineinfosys.basicconverter.Engin;

import java.util.ArrayList;


public class Image {

	
	private double twip,meter,centimeter,millimeter,characterx,charactery,pixelx,pixely,inch,pica,point,en;
	private double edtValue;
	private String conversionFrom;
	
	
	public Image(String conversionFrom, double edtValue) {
				
				this.conversionFrom = conversionFrom;
				this.edtValue = edtValue;
			}
	public ArrayList<ConversionResults> calculateimageConversion()
	{
				ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
					
				ConversionResults results= new ConversionResults();
		    		 	
				switch(conversionFrom)
				
				{
				case "Twip - twip":
					
					twip=(edtValue)*1;
					meter=(edtValue)*0.0000176389;
					centimeter=(edtValue)*0.0017638889;
					millimeter=(edtValue)*0.0176388889;
					characterx=(edtValue)*0.0083333333;
					charactery=(edtValue)*0.0041666667;
					pixelx=(edtValue)*0.0666666667;
					pixely=(edtValue)*0.0666666667;
					inch=(edtValue)*0.0006944444;
					pica=(edtValue)*0.0041666667;
					point=(edtValue)*0.0500000000;
					en=(edtValue)*0.1003750000;
					
					 break;
                  case "Meter - m":
					
                	  twip=(edtValue)*56692.9133858300;
  					meter=(edtValue)*1.0000000000;
  					centimeter=(edtValue)*100.0000000000;
  					millimeter=(edtValue)*1000.0000000000;
  					characterx=(edtValue)*472.4409448819;
  					charactery=(edtValue)*236.22047244009;
  					pixelx=(edtValue)*3779.5275590550;
  					pixely=(edtValue)*3779.5275590550;
  					inch=(edtValue)*39.3700787402;
  					pica=(edtValue)*236.2204724409;
  					point=(edtValue)*2834.6456692910;
  					en=(edtValue)*5690.5511811020;
					
					
					 break;
                case "Centimeter - cm":
	
                	twip=(edtValue)*566.9291338583;
					meter=(edtValue)*0.0100000000;
					centimeter=(edtValue)*1.0000000000;
					millimeter=(edtValue)*10.0000000000;
					characterx=(edtValue)*4.7244094488;
					charactery=(edtValue)*2.3622047244;
					pixelx=(edtValue)*37.7952755906;
					pixely=(edtValue)*37.7952755906;
					inch=(edtValue)*0.3937007874;
					pica=(edtValue)*2.3622047244;
					point=(edtValue)*28.3464566929;
					en=(edtValue)*28.3464566929;
	
	
	
	 break;
case "Millimeter - mm":
	
	twip=(edtValue)*56.6929133858;
	meter=(edtValue)*0.0010000000;
	centimeter=(edtValue)*0.1000000000;
	millimeter=(edtValue)*1.0000000000;
	characterx=(edtValue)*0.4724409449;
	charactery=(edtValue)*0.2362204724;
	pixelx=(edtValue)*3.7795275591;
	pixely=(edtValue)*3.7795275591;
	inch=(edtValue)*-15.9616299213;
	pica=(edtValue)*0.2362204724;
	point=(edtValue)*2.8346456693;
	en=(edtValue)*5.6905511811;
	
	
	
	 break;
case "Character(X) - character(x)":
	
	twip=(edtValue)*120.0000000000;
	meter=(edtValue)*0.0021166667;
	centimeter=(edtValue)*0.2116666667;
	millimeter=(edtValue)*2.1166666667;
	characterx=(edtValue)*1.0000000000;
	charactery=(edtValue)*0.5000000000;
	pixelx=(edtValue)*8.0000000000;
	pixely=(edtValue)*8.0000000000;
	inch=(edtValue)*0.0833333333;
	pica=(edtValue)*0.5000000000;
	point=(edtValue)*6.0000000000;
	en=(edtValue)*12.0450000000;
	
	 break;
case "Character(Y) - character(y)":
	
	twip=(edtValue)*240.0000000000;
	meter=(edtValue)*0.0042333333;
	centimeter=(edtValue)*0.4233333333;
	millimeter=(edtValue)*4.2333333333;
	characterx=(edtValue)*2.0000000000;
	charactery=(edtValue)*1.0000000000;
	pixelx=(edtValue)*16.0000000000;
	pixely=(edtValue)*16.0000000000;
	inch=(edtValue)*0.1666666667;
	pica=(edtValue)*1.0000000000;
	point=(edtValue)*12.0000000000;
	en=(edtValue)*24.0900000000;
	
	
	 break;
case "Pixel(X) - pixel(x)":
	
	twip=(edtValue)*15.0000000000;
	meter=(edtValue)*0.0002645833;
	centimeter=(edtValue)*0.0264583333;
	millimeter=(edtValue)*0.2645833333;
	characterx=(edtValue)*0.1250000000;
	charactery=(edtValue)*0.0625000000;
	pixelx=(edtValue)*1.0000000000;
	pixely=(edtValue)*1.0000000000;
	inch=(edtValue)*0.0104166667;
	pica=(edtValue)*0.0625000000;
	point=(edtValue)*0.7500000000;
	en=(edtValue)*1.5056250000;
	
	
	 break;
case "Pixel(Y) - pixel(y)":
	
	twip=(edtValue)*15.0000000000;
	meter=(edtValue)*0.00026458333;
	centimeter=(edtValue)*0.0264583333;
	millimeter=(edtValue)*0.2645833333;
	characterx=(edtValue)*0.1250000000;
	charactery=(edtValue)*0.0625000000;
	pixelx=(edtValue)*1.0000000000;
	pixely=(edtValue)*1.0000000000;
	inch=(edtValue)*0.0104166667;
	pica=(edtValue)*0.0625000000;
	point=(edtValue)*0.7500000000;
	en=(edtValue)*1.5056250000;
	
	
	 break;
case "Inch - in":
	
	twip=(edtValue)*1440.0000000000;
	meter=(edtValue)*0.0254000000;
	centimeter=(edtValue)*2.5400000000;
	millimeter=(edtValue)*25.4000000000;
	characterx=(edtValue)*12.0000000000;
	charactery=(edtValue)*6.0000000000;
	pixelx=(edtValue)*96.0000000000;
	pixely=(edtValue)*96.0000000000;
	inch=(edtValue)*1.0000000000;
	pica=(edtValue)*6.0000000000;
	point=(edtValue)*72.0000000000;
	en=(edtValue)*144.5400000000;
	
	
	
	 break;
case "Pica - P":
	
	twip=(edtValue)*240.0000000000;
	meter=(edtValue)*0.0042333333;
	centimeter=(edtValue)*0.4233333333;
	millimeter=(edtValue)*4.2333333333;
	characterx=(edtValue)*2.0000000000;
	charactery=(edtValue)*1.0000000000;
	pixelx=(edtValue)*16.0000000000;
	pixely=(edtValue)*16.0000000000;
	inch=(edtValue)*0.1666666667;
	pica=(edtValue)*1.00000000000;
	point=(edtValue)*12.0000000000;
	en=(edtValue)*24.0900000000;
	
	
	
	 break;
case "Point - pt":
	
	twip=(edtValue)*20.0000000000;
	meter=(edtValue)*0.0003527778;
	centimeter=(edtValue)*0.03527777758;
	millimeter=(edtValue)*0.3527777778;
	characterx=(edtValue)*0.1666666667;
	charactery=(edtValue)*0.08333333333;
	pixelx=(edtValue)*1.3333333333;
	pixely=(edtValue)*1.3333333333;
	inch=(edtValue)*0.0138888889;
	pica=(edtValue)*0.0833333333;
	point=(edtValue)*1.0000000000;
	en=(edtValue)*2.0075000000;
	
	
	 break;
case "En - en":
	
	twip=(edtValue)*9.9626400996;
	meter=(edtValue)*0.0001757299;
	centimeter=(edtValue)*0.0175729902;
	millimeter=(edtValue)*0.17572999018;
	characterx=(edtValue)*0.0830220008;
	charactery=(edtValue)*0.0415110004;
	pixelx=(edtValue)*0.6641760066;
	pixely=(edtValue)*0.6641760066;
	inch=(edtValue)*0.0069185001;
	pica=(edtValue)*0.0415110004;
	point=(edtValue)*0.4981320050;
	en=(edtValue)*1.0000000000;
	
	
	 break;

				
				}
				    results.setTwip(twip);
	    	         results.setMeter(meter);
	    	         results.setCentimeter(centimeter); 
	    	         results.setMillimeter(millimeter);
	    	         results.setCharacterx(characterx);
	    	         results.setCharactery(charactery);
	    	         results.setPixelx(pixelx);
	    	         results.setPixely(pixely); 
	    	         results.setInch(inch);
	    	         results.setPica(pica);
	    	         results.setPoint(point);
	    	         results.setEn(en);
	    	         
	    	        
	    	         converterArray.add(results);
	    	         
	 			    return converterArray;     
	    	         
			   
			  }
					  public class ConversionResults{
						  
							private double twip,meter,centimeter,millimeter,characterx,charactery,pixelx,pixely,inch,pica,point,en;

							public double getTwip() {
								return twip;
							}

							public void setTwip(double twip) {
								this.twip = twip;
							}

							public double getMeter() {
								return meter;
							}

							public void setMeter(double meter) {
								this.meter = meter;
							}

							public double getCentimeter() {
								return centimeter;
							}

							public void setCentimeter(double centimeter) {
								this.centimeter = centimeter;
							}

							public double getMillimeter() {
								return millimeter;
							}

							public void setMillimeter(double millimeter) {
								this.millimeter = millimeter;
							}

							public double getCharacterx() {
								return characterx;
							}

							public void setCharacterx(double characterx) {
								this.characterx = characterx;
							}

							public double getCharactery() {
								return charactery;
							}

							public void setCharactery(double charactery) {
								this.charactery = charactery;
							}

							public double getPixelx() {
								return pixelx;
							}

							public void setPixelx(double pixelx) {
								this.pixelx = pixelx;
							}

							public double getPixely() {
								return pixely;
							}

							public void setPixely(double pixely) {
								this.pixely = pixely;
							}

							public double getInch() {
								return inch;
							}

							public void setInch(double inch) {
								this.inch = inch;
							}

							public double getPica() {
								return pica;
							}

							public void setPica(double pica) {
								this.pica = pica;
							}

							public double getPoint() {
								return point;
							}

							public void setPoint(double point) {
								this.point = point;
							}

							public double getEn() {
								return en;
							}

							public void setEn(double en) {
								this.en = en;
							}
  
				  }

            }

