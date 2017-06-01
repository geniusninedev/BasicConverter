package com.nineinfosys.basicconverter.Engin;

import java.util.ArrayList;


public class SoundConverter {
	
	private double bel,decibel,neper;
	
	private double edtValue;
	private String conversionFrom;
		
			
			public SoundConverter(String conversionFrom, double edtValue) {
				// TODO Auto-generated constructor stub
				this.conversionFrom = conversionFrom;
				this.edtValue = edtValue;
			}

			public ArrayList<ConversionResults> calculateSoundConversion()
		    {
		    	
				ArrayList<ConversionResults> soundArray = new ArrayList<ConversionResults>();
					
				ConversionResults results= new ConversionResults();

                switch(conversionFrom)
				{
				case "Bel - B":
					bel=(edtValue)*1;
					decibel=(edtValue)*10;
					neper=(edtValue)*1.151277918;
					break;
					
				case "Decible - dB":
					bel=(edtValue)*0.1;
					decibel=(edtValue)*1;
					neper=(edtValue)*0.1151277918;
					break;	
					
				case "Neper - Np":
					bel=(edtValue)*0.8686000004;
					decibel=(edtValue)*8.6860000037;
					neper=(edtValue)*1;
					break;		
				}
				results.setBel(bel);;
				results.setDecibel(decibel);;
				results.setNeper(neper);;
				
				soundArray.add(results);
		    	 return soundArray;

}
			public class ConversionResults{
	   			   
	   			   private double bel,decibel,neper;

				public double getBel() {
					return bel;
				}

				public void setBel(double bel) {
					this.bel = bel;
				}

				public double getDecibel() {
					return decibel;
				}

				public void setDecibel(double decibel) {
					this.decibel = decibel;
				}

				public double getNeper() {
					return neper;
				}

				public void setNeper(double neper) {
					this.neper = neper;
				}
	   			   
	   		
			}
}
	   			   
	   			   
	   			   
