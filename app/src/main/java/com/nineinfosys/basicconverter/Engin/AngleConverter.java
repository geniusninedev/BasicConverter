package com.nineinfosys.basicconverter.Engin;

import java.util.ArrayList;


public class AngleConverter {
	
	 private double gradian,degree,radian,minute,second,gon,sign,mil,revolution,circle,turn,quadrant,rightangle,sextant;
	private double edtValue;
	private String conversionFrom;
	//private String conversionTo;
			
		
			public AngleConverter(String conversionFrom, double edtValue) {
			super();
			this.conversionFrom = conversionFrom;
			
			this.edtValue = edtValue;
			
		}
				
		
		public ArrayList<ConversionResults> calculateAngleConversion()
	    {
	    	
			ArrayList<ConversionResults> angleArray = new ArrayList<ConversionResults>();
				
			ConversionResults results= new ConversionResults();

			switch(conversionFrom)
			{
			case "Degree - °":
				
				  degree=(edtValue)*1;	
				  radian=(edtValue)*0.0174532925;
				  gradian=(edtValue)*1.1111111111;
	    		  minute=(edtValue)*60;
	    		  second=(edtValue)*3600;
	    		  gon=(edtValue)*1.1111111111;
	    		  sign=(edtValue)*0.0333333333;
	    		  mil=(edtValue)*17.777777778;
	    		  revolution=(edtValue)*0.0027777778;
	    		  circle=(edtValue)*0.0027777778;
	    		  turn=(edtValue)*0.0027777778;
	    		  quadrant=(edtValue)*0.0111111111;
	    		  rightangle=(edtValue)*0.0111111111;
	    		  sextant=(edtValue)*0.0166666667;
	    		  break;
	    		  
	    	        
			   case "Grad - ^g" :
				      degree=(edtValue)*0.9;	
					  radian=(edtValue)*0.0157079633;
		    		  gradian=(edtValue)*1;
		    		  minute=(edtValue)*54;
		    		  second=(edtValue)*3240;
		    		  gon=(edtValue)*1;
		    		  sign=(edtValue)*0.03;
		    		  mil=(edtValue)*16;
		    		  revolution=(edtValue)*0.0025;
		    		  circle=(edtValue)*0.0025;
		    		  turn=(edtValue)*0.0025;
		    		  quadrant=(edtValue)*0.01;
		    		  rightangle=(edtValue)*0.01;
		    		  sextant=(edtValue)*0.015;
				  
					break;
					
			case "Radian - rad" :
				 degree=(edtValue)*57.295779513;		  
	    		  radian=(edtValue)*1;
	    		  gradian=(edtValue)*63.661977237;
	    		  minute=(edtValue)*3437.7467708;
	    		  second=(edtValue)*206264.80625;
	    		  gon=(edtValue)*63.661977237;
	    		  sign=(edtValue)*1.9098593171;
	    		  mil=(edtValue)*1018.5916358;
	    		  revolution=(edtValue)*0.1591549431;
	    		  circle=(edtValue)*0.1591549431;
	    		  turn=(edtValue)*0.1591549431;
	    		  quadrant=(edtValue)*0.6366197724;
	    		  rightangle=(edtValue)*0.6366197724;
	    		  sextant=(edtValue)*0.9549296586;
	    		
	    		  break;
	    		  
			case "Minute - '" :
				 degree=(edtValue)*0.0166666667;		  
	    		  radian=(edtValue)*0.0002908882;
	    		  gradian=(edtValue)*0.0185185185;
	    		  minute=(edtValue)*1;
	    		  second=(edtValue)*60;
	    		  gon=(edtValue)*0.0185185185;
	    		  sign=(edtValue)*0.0005555556;
	    		  mil=(edtValue)*0.2962962963;
	    		  revolution=(edtValue)*0.0000462963;
	    		  circle=(edtValue)*0.0000462963;
	    		  turn=(edtValue)*0.0000462963;
	    		  quadrant=(edtValue)*0.0001851852;
	    		  rightangle=(edtValue)*0.0001851852;
	    		  sextant=(edtValue)*0.0002777778;
	    		
	    		  break;	  
	    		  
			case "Second -  ″ " :
				  degree=(edtValue)*0.0002777778;		  
	    		  radian=(edtValue)*0.0000048481;
	    		  gradian=(edtValue)*0.000308642;
	    		  minute=(edtValue)*0.0166666667;
	    		  second=(edtValue)*1;
	    		  gon=(edtValue)*0.000308642;
	    		  sign=(edtValue)*0.0000092593;
	    		  mil=(edtValue)*0.0049382716;
	    		  revolution=(edtValue)*7.716049382E-7;
	    		  circle=(edtValue)*7.716049382E-7;
	    		  turn=(edtValue)*7.716049382E-7;
	    		  quadrant=(edtValue)*0.0000030864;
	    		  rightangle=(edtValue)*0.0000030864;
	    		  sextant=(edtValue)*0.0000046296;
	    		
	    		  break;	  
	    		  
			case "Gon - gon" :
				  degree=(edtValue)*0.9;		  
	    		  radian=(edtValue)*0.0157079633;
	    		  gradian=(edtValue)*1;
	    		  minute=(edtValue)*54;
	    		  second=(edtValue)*3240;
	    		  gon=(edtValue)*1;
	    		  sign=(edtValue)*0.03;
	    		  mil=(edtValue)*16;
	    		  revolution=(edtValue)*0.0025;
	    		  circle=(edtValue)*0.0025;
	    		  turn=(edtValue)*0.0025;
	    		  quadrant=(edtValue)*0.01;
	    		  rightangle=(edtValue)*0.01;
	    		  sextant=(edtValue)*0.015;
	    		
	    		  break;	  
	    		  
			case "Sign - sign" :
				  degree=(edtValue)*30;		  
	    		  radian=(edtValue)*0.5235987756;
	    		  gradian=(edtValue)*33.333333333;
	    		  minute=(edtValue)*1800;
	    		  second=(edtValue)*108000;
	    		  gon=(edtValue)*33.333333333;
	    		  sign=(edtValue)*1;
	    		  mil=(edtValue)*533.33333333;
	    		  revolution=(edtValue)*0.0833333333;
	    		  circle=(edtValue)*0.0833333333;
	    		  turn=(edtValue)*0.0833333333;
	    		  quadrant=(edtValue)*0.3333333333;
	    		  rightangle=(edtValue)*0.3333333333;
	    		  sextant=(edtValue)*0.5;
	    		
	    		  break;	  	  
	    		  
			case "Mil - mil" :
				  degree=(edtValue)*0.05625;		  
	    		  radian=(edtValue)*0.0009817477;
	    		  gradian=(edtValue)*0.0625;
	    		  minute=(edtValue)*3.375;
	    		  second=(edtValue)*202.5;
	    		  gon=(edtValue)*0.0625;
	    		  sign=(edtValue)*0.001875;
	    		  mil=(edtValue)*1;
	    		  revolution=(edtValue)*0.00015625;
	    		  circle=(edtValue)*0.00015625;
	    		  turn=(edtValue)*0.00015625;
	    		  quadrant=(edtValue)*0.000625;
	    		  rightangle=(edtValue)*0.000625;
	    		  sextant=(edtValue)*0.0009375;
	    		
	    		  break;	
	    		  
			case "Revolution - r" :
				  degree=(edtValue)*360;		  
	    		  radian=(edtValue)*6.2831853072;
	    		  gradian=(edtValue)*400;
	    		  minute=(edtValue)*21600;
	    		  second=(edtValue)*1296000;
	    		  gon=(edtValue)*400;
	    		  sign=(edtValue)*12;
	    		  mil=(edtValue)*6400;
	    		  revolution=(edtValue)*1;
	    		  circle=(edtValue)*1;
	    		  turn=(edtValue)*1;
	    		  quadrant=(edtValue)*4;
	    		  rightangle=(edtValue)*4;
	    		  sextant=(edtValue)*6;
	    		
	    		  break;	
	    		  
			case "Circle - ∅" :
				  degree=(edtValue)*360;		  
	    		  radian=(edtValue)*6.2831853072;
	    		  gradian=(edtValue)*400;
	    		  minute=(edtValue)*21600;
	    		  second=(edtValue)*1296000;
	    		  gon=(edtValue)*400;
	    		  sign=(edtValue)*12;
	    		  mil=(edtValue)*6400;
	    		  revolution=(edtValue)*1;
	    		  circle=(edtValue)*1;
	    		  turn=(edtValue)*1;
	    		  quadrant=(edtValue)*4;
	    		  rightangle=(edtValue)*4;
	    		  sextant=(edtValue)*6;
	    		
	    		  break;	
	    		  
			case "Turn - turn" :
				  degree=(edtValue)*360;		  
	    		  radian=(edtValue)*6.2831853072;
	    		  gradian=(edtValue)*400;
	    		  minute=(edtValue)*21600;
	    		  second=(edtValue)*1296000;
	    		  gon=(edtValue)*400;
	    		  sign=(edtValue)*12;
	    		  mil=(edtValue)*6400;
	    		  revolution=(edtValue)*1;
	    		  circle=(edtValue)*1;
	    		  turn=(edtValue)*1;
	    		  quadrant=(edtValue)*4;
	    		  rightangle=(edtValue)*4;
	    		  sextant=(edtValue)*6;
	    		
	    		  break;		  
	    		  
			case "Quadrant - 90°" :
				  degree=(edtValue)*90;		  
	    		  radian=(edtValue)*1.5707963268;
	    		  gradian=(edtValue)*100;
	    		  minute=(edtValue)*5400;
	    		  second=(edtValue)*324000;
	    		  gon=(edtValue)*100;
	    		  sign=(edtValue)*3;
	    		  mil=(edtValue)*1600;
	    		  revolution=(edtValue)*0.25;
	    		  circle=(edtValue)*0.25;
	    		  turn=(edtValue)*0.25;
	    		  quadrant=(edtValue)*1;
	    		  rightangle=(edtValue)*1;
	    		  sextant=(edtValue)*1.5;
	    		
	    		  break;	
	    		  
			case "Right angle - 90°" :
				  degree=(edtValue)*90;		  
	    		  radian=(edtValue)*1.5707963268;
	    		  gradian=(edtValue)*100;
	    		  minute=(edtValue)*5400;
	    		  second=(edtValue)*324000;
	    		  gon=(edtValue)*100;
	    		  sign=(edtValue)*3;
	    		  mil=(edtValue)*1600;
	    		  revolution=(edtValue)*0.25;
	    		  circle=(edtValue)*0.25;
	    		  turn=(edtValue)*0.25;
	    		  quadrant=(edtValue)*1;
	    		  rightangle=(edtValue)*1;
	    		  sextant=(edtValue)*1.5;
	    		
	    		  break;		  
	    		  
			case "Sextant - 60°" :
				  degree=(edtValue)*60;		  
	    		  radian=(edtValue)*1.0471975512;
	    		  gradian=(edtValue)*66.666666667;
	    		  minute=(edtValue)*3600;
	    		  second=(edtValue)*216000;
	    		  gon=(edtValue)*66.666666667;
	    		  sign=(edtValue)*2;
	    		  mil=(edtValue)*1066.6666667;
	    		  revolution=(edtValue)*0.1666666667;
	    		  circle=(edtValue)*0.1666666667;
	    		  turn=(edtValue)*0.1666666667;
	    		  quadrant=(edtValue)*0.666666667;
	    		  rightangle=(edtValue)*0.666666667;
	    		  sextant=(edtValue)*1;
	    		
	    		  break;		  	  
			}
			       results.setDegree(degree); 
	    	       results.setGradian(gradian);
	    	       results.setRadian(radian); 
	    	       results.setMinute(minute);
	    	       results.setSecond(second);
	    	       results.setGon(gon);
	    	       results.setSign(sign);
	    	       results.setMil(mil);
	    	       results.setRevolution(revolution);
	    	       results.setCircle(circle);
	    	       results.setTurn(turn);
	    	       results.setQuadrant(quadrant);
	    	       results.setRightangle(rightangle);
	    	       results.setSextant(sextant);
				
			 angleArray.add(results);
	    	return angleArray;
	    }

		
		
		
	   public class ConversionResults{
		   
		   
		private double gradian,degree,radian,minute,second,gon,sign,mil,revolution,circle,turn,quadrant,rightangle,sextant;

		public double getGradian() {
			return gradian;
		}

		public void setGradian(double gradian) {
			this.gradian = gradian;
		}

		public double getDegree() {
			return degree;
		}

		public void setDegree(double degree) {
			this.degree = degree;
		}

		public double getRadian() {
			return radian;
		}

		public void setRadian(double radian) {
			this.radian = radian;
		}

		public double getMinute() {
			return minute;
		}

		public void setMinute(double minute) {
			this.minute = minute;
		}

		public double getSecond() {
			return second;
		}

		public void setSecond(double second) {
			this.second = second;
		}

		public double getGon() {
			return gon;
		}

		public void setGon(double gon) {
			this.gon = gon;
		}

		public double getSign() {
			return sign;
		}

		public void setSign(double sign) {
			this.sign = sign;
		}

		public double getMil() {
			return mil;
		}

		public void setMil(double mil) {
			this.mil = mil;
		}

		public double getRevolution() {
			return revolution;
		}

		public void setRevolution(double revolution) {
			this.revolution = revolution;
		}

		public double getCircle() {
			return circle;
		}

		public void setCircle(double circle) {
			this.circle = circle;
		}

		public double getTurn() {
			return turn;
		}

		public void setTurn(double turn) {
			this.turn = turn;
		}

		public double getQuadrant() {
			return quadrant;
		}

		public void setQuadrant(double quadrant) {
			this.quadrant = quadrant;
		}

		public double getRightangle() {
			return rightangle;
		}

		public void setRightangle(double rightangle) {
			this.rightangle = rightangle;
		}

		public double getSextant() {
			return sextant;
		}

		public void setSextant(double sextant) {
			this.sextant = sextant;
		}
		
		   
	   }
	}
