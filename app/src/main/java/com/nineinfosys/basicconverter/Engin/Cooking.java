package com.nineinfosys.basicconverter.Engin;

import java.util.ArrayList;


public class Cooking {
	
	
	private double cupeuro,cupus,fluidounce,grameuro,kgeuro,litereuro,mleuro,ounceus,pint,poundus,tseuro,tsus,teaseuro,teasus;
	
	private double edtValue;
	
	private String conversionFrom;
	
	public Cooking(String conversionFrom, double edtValue) {
		
		this.conversionFrom = conversionFrom;
		
		this.edtValue = edtValue;
	}

	public ArrayList<ConversionResults> calculatecookingConversion()
	
    {
    
		ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
			
		ConversionResults results= new ConversionResults();
    		 	
		switch(conversionFrom)
		{
		case "Cup(Euro) - cup":
			
			cupeuro=(edtValue)*1;
			cupus=(edtValue)*1.014;
			fluidounce=(edtValue)*8.115;
			grameuro=(edtValue)*240.000;
			kgeuro=(edtValue)*0.240;
			litereuro=(edtValue)*0.240;
			mleuro=(edtValue)*240.000;
			ounceus=(edtValue)*8.466;
			pint=(edtValue)*0.507;
			poundus=(edtValue)*0.529;
			tseuro=(edtValue)*16.000;
			tsus=(edtValue)*16.231;
			teaseuro=(edtValue)*48.000;
			teasus=(edtValue)*48.692;
			
			 break;
			 
          case "Cup(US) - cup":
			
        	  cupeuro=(edtValue)*0.986;
  			cupus=(edtValue)*1.000;
  			fluidounce=(edtValue)*8.000;
  			grameuro=(edtValue)*236.588;
  			kgeuro=(edtValue)*0.237;
  			litereuro=(edtValue)*0.237;
  			mleuro=(edtValue)*236.588;
  			ounceus=(edtValue)*8.345;
  			pint=(edtValue)*0.500;
  			poundus=(edtValue)*0.522;
  			tseuro=(edtValue)*15.773;
  			tsus=(edtValue)*16.000;
  			teaseuro=(edtValue)*47.318;
  			teasus=(edtValue)*48.000;
			
			
			 break;
			 
        case "Fluid Ounce - floz":

        	cupeuro=(edtValue)*0.123;
			cupus=(edtValue)*0.125;
			fluidounce=(edtValue)*1.000;
			grameuro=(edtValue)*29.574;
			kgeuro=(edtValue)*0.030;
			litereuro=(edtValue)*0.030;
			mleuro=(edtValue)*29.574;
			ounceus=(edtValue)*1.043;
			pint=(edtValue)*0.062;
			poundus=(edtValue)*0.065;
			tseuro=(edtValue)*1.972;
			tsus=(edtValue)*2.000;
			teaseuro=(edtValue)*5.915;
			teasus=(edtValue)*6.000;

          break;

          case "Gram - g":

        	  cupeuro=(edtValue)*0.004;
        		 cupus=(edtValue)*0.004;
        		 fluidounce=(edtValue)*0.034;
        		 grameuro=(edtValue)*1.000;
        		 kgeuro=(edtValue)*0.001;
        		 litereuro=(edtValue)*0.001;
        		 mleuro=(edtValue)*1.000;
        		ounceus=(edtValue)*0.035;
        		pint=(edtValue)*0.002;
        		poundus=(edtValue)*0.002;
        		tseuro=(edtValue)*0.067;
        		tsus=(edtValue)*0.068;
        		teaseuro=(edtValue)*0.200;
        		teasus=(edtValue)*0.203;

                break;

case "Kilogram - kg":

	cupeuro=(edtValue)*4.167;
	cupus=(edtValue)*4.227;
	fluidounce=(edtValue)*33.814;
	grameuro=(edtValue)*1000.000;
	kgeuro=(edtValue)*1.000;
	litereuro=(edtValue)*1.000;
	mleuro=(edtValue)*1000.000;
	ounceus=(edtValue)*35.274;
	pint=(edtValue)*2.113;
	poundus=(edtValue)*2.205;
	tseuro=(edtValue)*66.667;
	tsus=(edtValue)*67.628;
	teaseuro=(edtValue)*200.000;
	teasus=(edtValue)*202.884;

break;

case "Liter - li":

	cupeuro=(edtValue)*4.167;
	cupus=(edtValue)*4.227;
	fluidounce=(edtValue)*33.814;
	grameuro=(edtValue)*1000.000;
	kgeuro=(edtValue)*1.000;
	litereuro=(edtValue)*1.000;
	mleuro=(edtValue)*1000.000;
	ounceus=(edtValue)*35.274;
	pint=(edtValue)*2.113;
	poundus=(edtValue)*2.205;
	tseuro=(edtValue)*66.667;
	tsus=(edtValue)*67.628;
	teaseuro=(edtValue)*200.000;
	teasus=(edtValue)*202.884;

break;

case "Milliliter - ml":

	cupeuro=(edtValue)*0.004;
	cupus=(edtValue)*0.004;
	fluidounce=(edtValue)*0.034;
	grameuro=(edtValue)*1.000;
	kgeuro=(edtValue)*0.001;
	litereuro=(edtValue)*0.001;
	mleuro=(edtValue)*1;
	ounceus=(edtValue)*0.035;
	pint=(edtValue)*0.002;
	poundus=(edtValue)*0.002;
	tseuro=(edtValue)*0.067;
	tsus=(edtValue)*0.068;
	teaseuro=(edtValue)*0.200;
	teasus=(edtValue)*0.203;


break;

case "Ounce - oz":

	cupeuro=(edtValue)*0.118;
	cupus=(edtValue)*0.120;
	fluidounce=(edtValue)*0.959;
	grameuro=(edtValue)*28.350;
	kgeuro=(edtValue)*0.028;
	litereuro=(edtValue)*0.028;
	mleuro=(edtValue)*28.350;
	ounceus=(edtValue)*1;
	pint=(edtValue)*0.060;
	poundus=(edtValue)*0.062;
	tseuro=(edtValue)*1.890;
	tsus=(edtValue)*1.917;
	teaseuro=(edtValue)*5.670;
	teasus=(edtValue)*5.752;


break;

case "Pint - pt":

	cupeuro=(edtValue)*1.972;
	cupus=(edtValue)*1.000;
	fluidounce=(edtValue)*16.000;
	grameuro=(edtValue)*473.176;
	kgeuro=(edtValue)*0.473;
	litereuro=(edtValue)*0.473;
	mleuro=(edtValue)*473.176;
	ounceus=(edtValue)*16.691;
	pint=(edtValue)*1.000;
	poundus=(edtValue)*1.043;
	tseuro=(edtValue)*31.545;
	tsus=(edtValue)*32.000;
	teaseuro=(edtValue)*94.635;
	teasus=(edtValue)*96.000;



break;

case "Pound - lb":

	cupeuro=(edtValue)*1.890;
	cupus=(edtValue)*1.917;
	fluidounce=(edtValue)*15.338;
	grameuro=(edtValue)*453.592;
	kgeuro=(edtValue)*0.454;
	litereuro=(edtValue)*0.454;
	mleuro=(edtValue)*453.592;
	ounceus=(edtValue)*16.000;
	pint=(edtValue)*0.959;
	poundus=(edtValue)*1.000;
	tseuro=(edtValue)*30.239;
	tsus=(edtValue)*30.676;
	teaseuro=(edtValue)*90.718;
	teasus=(edtValue)*92.027;



break;

case "Table Spoon(Euro) - tbsp":

	cupeuro=(edtValue)*0.062;
	cupus=(edtValue)*0.063;
	fluidounce=(edtValue)*0.507;
	grameuro=(edtValue)*15.000;
	kgeuro=(edtValue)*0.015;
	litereuro=(edtValue)*0.015;
	mleuro=(edtValue)*15.000;
	ounceus=(edtValue)*0.529;
	pint=(edtValue)*0.032;
	poundus=(edtValue)*0.033;
	tseuro=(edtValue)*1.000;
	tsus=(edtValue)*1.014;
	teaseuro=(edtValue)*3.000;
	teasus=(edtValue)*3.043;

break;

case "Table Spoon(US) - tbsp":

	cupeuro=(edtValue)*0.062;
	cupus=(edtValue)*0.062;
	fluidounce=(edtValue)*0.500;
	grameuro=(edtValue)*14.787;
	kgeuro=(edtValue)*0.015;
	litereuro=(edtValue)*0.015;
	mleuro=(edtValue)*14.787;
	ounceus=(edtValue)*0.522;
	pint=(edtValue)*0.031;
	poundus=(edtValue)*0.033;
	tseuro=(edtValue)*0.986;
	tsus=(edtValue)*1.000;
	teaseuro=(edtValue)*2.957;
	teasus=(edtValue)*3.000;


break;

case "Tea Spoon(Euro) - tsp":

	cupeuro=(edtValue)*0.021;
	cupus=(edtValue)*0.021;
	fluidounce=(edtValue)*0.169;
	grameuro=(edtValue)*5.000;
	kgeuro=(edtValue)*0.005;
	litereuro=(edtValue)*0.005;
	mleuro=(edtValue)*5.000;
	ounceus=(edtValue)*0.176;
	pint=(edtValue)*0.011;
	poundus=(edtValue)*0.011;
	tseuro=(edtValue)*0.033;
	tsus=(edtValue)*0.338;
	teaseuro=(edtValue)*1.000;
	teasus=(edtValue)*1.014;


break;

case "Tea Spoon(US) - tsp":

	cupeuro=(edtValue)*0.021;
	cupus=(edtValue)*0.021;
	fluidounce=(edtValue)*0.167;
	grameuro=(edtValue)*4.929;
	kgeuro=(edtValue)*0.005;
	litereuro=(edtValue)*0.005;
	mleuro=(edtValue)*4.929;
	ounceus=(edtValue)*0.174;
	pint=(edtValue)*0.010;
	poundus=(edtValue)*0.011;
	tseuro=(edtValue)*0.329;
	tsus=(edtValue)*0.333;
	teaseuro=(edtValue)*0.986;
	teasus=(edtValue)*1.000;


 break;

		}
		
		    results.setCupeuro(cupeuro);
	         results.setCupus(cupus);
	         results.setFluidounce(fluidounce); 
	         results.setGrameuro(grameuro);
	         results.setKgeuro(kgeuro);
	         results.setLitereuro(litereuro);
	         results.setMleuro(mleuro);
	         results.setOunceus(ounceus); 
	         results.setPint(pint);
	         results.setPoundus(poundus);
	         results.setTseuro(tseuro);
	         results.setTsus(tsus);
	         results.setTeaseuro(teaseuro);
	         results.setTeasus(teasus);
	         
	        
	         converterArray.add(results);
	         
			    return converterArray;     
	 
    }
	
  public class ConversionResults{
	
	private double cupeuro,cupus,fluidounce,grameuro,kgeuro,litereuro,mleuro,ounceus,pint,poundus,tseuro,tsus,teaseuro,teasus;

	  
	public double getCupeuro() {
		return cupeuro;
	}

	public void setCupeuro(double cupeuro) {
		this.cupeuro = cupeuro;
	}

	public double getCupus() {
		return cupus;
	}

	public void setCupus(double cupus) {
		this.cupus = cupus;
	}

	public double getFluidounce() {
		return fluidounce;
	}

	public void setFluidounce(double fluidounce) {
		this.fluidounce = fluidounce;
	}

	public double getGrameuro() {
		return grameuro;
	}

	public void setGrameuro(double grameuro) {
		this.grameuro = grameuro;
	}

	public double getKgeuro() {
		return kgeuro;
	}

	public void setKgeuro(double kgeuro) {
		this.kgeuro = kgeuro;
	}

	public double getLitereuro() {
		return litereuro;
	}

	public void setLitereuro(double litereuro) {
		this.litereuro = litereuro;
	}

	public double getMleuro() {
		return mleuro;
	}

	public void setMleuro(double mleuro) {
		this.mleuro = mleuro;
	}

	public double getOunceus() {
		return ounceus;
	}

	public void setOunceus(double ounceus) {
		this.ounceus = ounceus;
	}

	public double getPint() {
		return pint;
	}

	public void setPint(double pint) {
		this.pint = pint;
	}

	public double getPoundus() {
		return poundus;
	}

	public void setPoundus(double poundus) {
		this.poundus = poundus;
	}

	public double getTseuro() {
		return tseuro;
	}

	public void setTseuro(double tseuro) {
		this.tseuro = tseuro;
	}

	public double getTsus() {
		return tsus;
	}

	public void setTsus(double tsus) {
		this.tsus = tsus;
	}

	public double getTeaseuro() {
		return teaseuro;
	}

	public void setTeaseuro(double teaseuro) {
		this.teaseuro = teaseuro;
	}

	public double getTeasus() {
		return teasus;
	}

	public void setTeasus(double teasus) {
		this.teasus = teasus;
	}
 }
	   
}
