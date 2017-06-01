package com.nineinfosys.basicconverter.Engin;

import java.util.ArrayList;

public class VolumeDryConverter {


	private double liter, barreldryUS, pintdryUS, quartdryUS, peckUS, peckUK, bushelUS, bushelUK, corBiblical, homerBiblical, ephahBiblical, seahBiblical, omerBiblical, cabBiblical, logBiblical;
	private double edtValue;
	private String conversionFrom;

	//private String conversionTo;
	public VolumeDryConverter(String conversionFrom, double edtValue) {
		// TODO Auto-generated constructor stub
		this.conversionFrom = conversionFrom;
		this.edtValue = edtValue;
	}

	public ArrayList<ConversionResults> calculateVolumeDryConversion() {
		ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();
		ConversionResults results = new ConversionResults();

		switch (conversionFrom) {

			case "Liter - L":
				liter = (edtValue) * 1;
				barreldryUS = (edtValue) * 0.0086484898;
				pintdryUS = (edtValue) * 1.8161659684;
				quartdryUS = (edtValue) * 0.9080829842;
				peckUS = (edtValue) * 0.113510373;
				peckUK = (edtValue) * 0.1099846241;
				bushelUS = (edtValue) * 0.0283775933;
				bushelUK = (edtValue) * 0.027496156;
				corBiblical = (edtValue) * 0.0045454548;
				homerBiblical = (edtValue) * 0.0045454548;
				ephahBiblical = (edtValue) * 0.0454545477;
				seahBiblical = (edtValue) * 0.136363643;
				omerBiblical = (edtValue) * 0.4545454767;
				cabBiblical = (edtValue) * 0.818181858;
				logBiblical = (edtValue) * 3.272727432;
				break;
			case "Barrel dry(US) - bbl dry":
				liter = (edtValue) * 115.6271236;
				barreldryUS = (edtValue) * 1;
				pintdryUS = (edtValue) * 209.99804691;
				quartdryUS = (edtValue) * 104.99902346;
				peckUS = (edtValue) * 13.124877932;
				peckUK = (edtValue) * 12.717205731;
				bushelUS = (edtValue) * 3.281219483;
				bushelUK = (edtValue) * 3.1793014328;
				corBiblical = (edtValue) * 0.5255778601;
				homerBiblical = (edtValue) * 0.5255778601;
				ephahBiblical = (edtValue) * 5.2557786015;
				seahBiblical = (edtValue) * 15.767335804;
				omerBiblical = (edtValue) * 52.557786015;
				cabBiblical = (edtValue) * 94.604014826;
				logBiblical = (edtValue) * 378.4160593;
				break;
			case "Pint dry(US) - pt dry":
				liter = (edtValue) * 0.5506104714;
				barreldryUS = (edtValue) * 0.0047619491;
				pintdryUS = (edtValue) * 1;
				quartdryUS = (edtValue) * 0.5;
				peckUS = (edtValue) * 0.0625;
				peckUK = (edtValue) * 0.0605586857;
				bushelUS = (edtValue) * 0.015625;
				bushelUK = (edtValue) * 0.0151396714;
				corBiblical = (edtValue) * 0.002502775;
				homerBiblical = (edtValue) * 0.002502775;
				ephahBiblical = (edtValue) * 0.0250277499;
				seahBiblical = (edtValue) * 0.0750832498;
				omerBiblical = (edtValue) * 0.2502774992;
				cabBiblical = (edtValue) * 0.4504994985;
				logBiblical = (edtValue) * 1.8019979941;
				break;
			case "Quart dry(US) - qt dry":
				liter = (edtValue) * 1.1012209428;
				barreldryUS = (edtValue) * 0.0095238981;
				pintdryUS = (edtValue) * 2;
				quartdryUS = (edtValue) * 1;
				peckUS = (edtValue) * 0.125;
				peckUK = (edtValue) * 0.1211173715;
				bushelUS = (edtValue) * 0.03125;
				bushelUK = (edtValue) * 0.0302793429;
				corBiblical = (edtValue) * 0.00500555;
				homerBiblical = (edtValue) * 0.00500555;
				ephahBiblical = (edtValue) * 0.0500554998;
				seahBiblical = (edtValue) * 0.1501664995;
				omerBiblical = (edtValue) * 0.5005549984;
				cabBiblical = (edtValue) * 0.9009989971;
				logBiblical = (edtValue) * 3.6039959882;
				break;
			case "Peck dry(US) - pk":
				liter = (edtValue) * 8.8097675424;
				barreldryUS = (edtValue) * 0.0761911848;
				pintdryUS = (edtValue) * 16;
				quartdryUS = (edtValue) * 8;
				peckUS = (edtValue) * 1;
				peckUK = (edtValue) * 0.968938972;
				bushelUS = (edtValue) * 0.25;
				bushelUK = (edtValue) * 0.242234743;
				corBiblical = (edtValue) * 0.0400443999;
				homerBiblical = (edtValue) * 0.0400443999;
				ephahBiblical = (edtValue) * 0.4004439987;
				seahBiblical = (edtValue) * 1.2013319961;
				omerBiblical = (edtValue) * 4.0044399869;
				cabBiblical = (edtValue) * 7.2079919764;
				logBiblical = (edtValue) * 28.831967906;
				break;
			case "Peck dry(UK) - pk":
				liter = (edtValue) * 9.09218;
				barreldryUS = (edtValue) * 0.0786336261;
				pintdryUS = (edtValue) * 16.512907895;
				quartdryUS = (edtValue) * 8.2564539473;
				peckUS = (edtValue) * 1.0320567434;
				peckUK = (edtValue) * 1;
				bushelUS = (edtValue) * 0.2580141859;
				bushelUK = (edtValue) * 0.25;
				corBiblical = (edtValue) * 0.0413280929;
				homerBiblical = (edtValue) * 0.0413280929;
				ephahBiblical = (edtValue) * 0.4132809292;
				seahBiblical = (edtValue) * 1.2398427876;
				omerBiblical = (edtValue) * 4.1328092921;
				cabBiblical = (edtValue) * 7.4390567257;
				logBiblical = (edtValue) * 29.756226903;
				break;
			case "Bushel(US) - bu":
				liter = (edtValue) * 35.23907017;
				barreldryUS = (edtValue) * 0.3047647392;
				pintdryUS = (edtValue) * 64;
				quartdryUS = (edtValue) * 32;
				peckUS = (edtValue) * 4;
				peckUK = (edtValue) * 3.875755888;
				bushelUS = (edtValue) * 1;
				bushelUK = (edtValue) * 0.968938972;
				corBiblical = (edtValue) * 0.1601775995;
				homerBiblical = (edtValue) * 0.1601775995;
				ephahBiblical = (edtValue) * 1.6017759948;
				seahBiblical = (edtValue) * 4.8053279843;
				omerBiblical = (edtValue) * 16.017759948;
				cabBiblical = (edtValue) * 28.831967906;
				logBiblical = (edtValue) * 115.32787162;
				break;
			case "Bushel(UK) - bu":
				liter = (edtValue) * 36.36872;
				barreldryUS = (edtValue) * 0.3145345042;
				pintdryUS = (edtValue) * 66.051631578;
				quartdryUS = (edtValue) * 33.025815789;
				peckUS = (edtValue) * 4.1282269736;
				peckUK = (edtValue) * 4;
				bushelUS = (edtValue) * 1.0320567434;
				bushelUK = (edtValue) * 1;
				corBiblical = (edtValue) * 0.1653123717;
				homerBiblical = (edtValue) * 0.1653123717;
				ephahBiblical = (edtValue) * 1.6531237168;
				seahBiblical = (edtValue) * 4.9593711505;
				omerBiblical = (edtValue) * 16.531237168;
				cabBiblical = (edtValue) * 29.756226903;
				logBiblical = (edtValue) * 119.02490761;
				break;
			case "Cor(Biblical) - cor":
				liter = (edtValue) * 219.99998929;
				barreldryUS = (edtValue) * 1.9026676651;
				pintdryUS = (edtValue) * 399.5564936;
				quartdryUS = (edtValue) * 199.7782468;
				peckUS = (edtValue) * 24.97228085;
				peckUK = (edtValue) * 24.196616135;
				bushelUS = (edtValue) * 6.2430702125;
				bushelUK = (edtValue) * 6.0491540338;
				corBiblical = (edtValue) * 1;
				homerBiblical = (edtValue) * 1;
				ephahBiblical = (edtValue) * 10;
				seahBiblical = (edtValue) * 30;
				omerBiblical = (edtValue) * 100;
				cabBiblical = (edtValue) * 180;
				logBiblical = (edtValue) * 720;
				break;
			case "Homer(Biblical) - homer":
				liter = (edtValue) * 219.99998929;
				barreldryUS = (edtValue) * 1.9026676651;
				pintdryUS = (edtValue) * 399.5564936;
				quartdryUS = (edtValue) * 199.7782468;
				peckUS = (edtValue) * 24.97228085;
				peckUK = (edtValue) * 24.196616135;
				bushelUS = (edtValue) * 6.2430702125;
				bushelUK = (edtValue) * 6.0491540338;
				corBiblical = (edtValue) * 1;
				homerBiblical = (edtValue) * 1;
				ephahBiblical = (edtValue) * 10;
				seahBiblical = (edtValue) * 30;
				omerBiblical = (edtValue) * 100;
				cabBiblical = (edtValue) * 180;
				logBiblical = (edtValue) * 720;
				break;
			case "Ephah(Biblical) - ephah":
				liter = (edtValue) * 21.999998929;
				barreldryUS = (edtValue) * 0.1902667665;
				pintdryUS = (edtValue) * 39.95564936;
				quartdryUS = (edtValue) * 19.97782468;
				peckUS = (edtValue) * 2.497228085;
				peckUK = (edtValue) * 2.4196616135;
				bushelUS = (edtValue) * 0.6243070212;
				bushelUK = (edtValue) * 0.6049154034;
				corBiblical = (edtValue) * 0.1;
				homerBiblical = (edtValue) * 0.1;
				ephahBiblical = (edtValue) * 1;
				seahBiblical = (edtValue) * 3;
				omerBiblical = (edtValue) * 10;
				cabBiblical = (edtValue) * 18;
				logBiblical = (edtValue) * 72;
				break;
			case "Seah(Biblical) - seah":
				liter = (edtValue) * 7.3333329764;
				barreldryUS = (edtValue) * 0.0634222555;
				pintdryUS = (edtValue) * 13.318549787;
				quartdryUS = (edtValue) * 6.6592748933;
				peckUS = (edtValue) * 0.8324093617;
				peckUK = (edtValue) * 0.8065538712;
				bushelUS = (edtValue) * 0.2081023404;
				bushelUK = (edtValue) * 0.2016384678;
				corBiblical = (edtValue) * 0.0333333333;
				homerBiblical = (edtValue) * 0.0333333333;
				ephahBiblical = (edtValue) * 0.3333333333;
				seahBiblical = (edtValue) * 1;
				omerBiblical = (edtValue) * 3.3333333333;
				cabBiblical = (edtValue) * 6;
				logBiblical = (edtValue) * 24;
				break;
			case "Omer(Biblical) - omer":
				liter = (edtValue) * 2.1999998929;
				barreldryUS = (edtValue) * 0.0190266767;
				pintdryUS = (edtValue) * 3.995564936;
				quartdryUS = (edtValue) * 1.997782468;
				peckUS = (edtValue) * 0.2497228085;
				peckUK = (edtValue) * 0.2419661614;
				bushelUS = (edtValue) * 0.0624307021;
				bushelUK = (edtValue) * 0.0604915403;
				corBiblical = (edtValue) * 0.01;
				homerBiblical = (edtValue) * 0.01;
				ephahBiblical = (edtValue) * 0.1;
				seahBiblical = (edtValue) * 0.3;
				omerBiblical = (edtValue) * 1;
				cabBiblical = (edtValue) * 1.8;
				logBiblical = (edtValue) * 7.2;
				break;
			case "Cab(Biblical) - cab":
				liter = (edtValue) * 1.2222221627;
				barreldryUS = (edtValue) * 0.0105703759;
				pintdryUS = (edtValue) * 2.2197582978;
				quartdryUS = (edtValue) * 1.1098791489;
				peckUS = (edtValue) * 0.1387348936;
				peckUK = (edtValue) * 0.1344256452;
				bushelUS = (edtValue) * 0.0346837234;
				bushelUK = (edtValue) * 0.0336064113;
				corBiblical = (edtValue) * 0.0055555556;
				homerBiblical = (edtValue) * 0.0055555556;
				ephahBiblical = (edtValue) * 0.0555555556;
				seahBiblical = (edtValue) * 0.1666666667;
				omerBiblical = (edtValue) * 0.5555555556;
				cabBiblical = (edtValue) * 1;
				logBiblical = (edtValue) * 4;
				break;
			case "Log(Biblical) - log":
				liter = (edtValue) * 0.3055555407;
				barreldryUS = (edtValue) * 0.002642594;
				pintdryUS = (edtValue) * 0.5549395744;
				quartdryUS = (edtValue) * 0.2774697872;
				peckUS = (edtValue) * 0.0346837234;
				peckUK = (edtValue) * 0.0336064113;
				bushelUS = (edtValue) * 0.0086709309;
				bushelUK = (edtValue) * 0.0084016028;
				corBiblical = (edtValue) * 0.0013888889;
				homerBiblical = (edtValue) * 0.0013888889;
				ephahBiblical = (edtValue) * 0.0138888889;
				seahBiblical = (edtValue) * 0.0416666667;
				omerBiblical = (edtValue) * 0.1388888889;
				cabBiblical = (edtValue) * 0.25;
				logBiblical = (edtValue) * 1;
				break;

			case "Default":
				break;


		}
		results.setLiter(liter);
		results.setBarreldryUS(barreldryUS);
		results.setPintdryUS(pintdryUS);
		results.setQuartdryUS(quartdryUS);
		results.setPeckUS(peckUS);
		results.setPeckUK(peckUK);
		results.setBushelUS(bushelUS);
		results.setBushelUK(bushelUK);
		results.setCorBiblical(corBiblical);
		results.setHomerBiblical(homerBiblical);
		results.setEphahBiblical(ephahBiblical);
		results.setSeahBiblical(seahBiblical);
		results.setOmerBiblical(omerBiblical);
		results.setCabBiblical(cabBiblical);
		results.setLogBiblical(logBiblical);


		converterArray.add(results);
		return converterArray;
	}


	public class ConversionResults {
		private double liter, barreldryUS, pintdryUS, quartdryUS, peckUS, peckUK, bushelUS, bushelUK, corBiblical, homerBiblical, ephahBiblical, seahBiblical, omerBiblical, cabBiblical, logBiblical;

		public double getLiter() {
			return liter;
		}

		public void setLiter(double liter) {
			this.liter = liter;
		}

		public double getBarreldryUS() {
			return barreldryUS;
		}

		public void setBarreldryUS(double barreldryUS) {
			this.barreldryUS = barreldryUS;
		}

		public double getPintdryUS() {
			return pintdryUS;
		}

		public void setPintdryUS(double pintdryUS) {
			this.pintdryUS = pintdryUS;
		}

		public double getQuartdryUS() {
			return quartdryUS;
		}

		public void setQuartdryUS(double quartdryUS) {
			this.quartdryUS = quartdryUS;
		}

		public double getPeckUS() {
			return peckUS;
		}

		public void setPeckUS(double peckUS) {
			this.peckUS = peckUS;
		}

		public double getPeckUK() {
			return peckUK;
		}

		public void setPeckUK(double peckUK) {
			this.peckUK = peckUK;
		}

		public double getBushelUS() {
			return bushelUS;
		}

		public void setBushelUS(double bushelUS) {
			this.bushelUS = bushelUS;
		}

		public double getBushelUK() {
			return bushelUK;
		}

		public void setBushelUK(double bushelUK) {
			this.bushelUK = bushelUK;
		}

		public double getCorBiblical() {
			return corBiblical;
		}

		public void setCorBiblical(double corBiblical) {
			this.corBiblical = corBiblical;
		}

		public double getHomerBiblical() {
			return homerBiblical;
		}

		public void setHomerBiblical(double homerBiblical) {
			this.homerBiblical = homerBiblical;
		}

		public double getEphahBiblical() {
			return ephahBiblical;
		}

		public void setEphahBiblical(double ephahBiblical) {
			this.ephahBiblical = ephahBiblical;
		}

		public double getSeahBiblical() {
			return seahBiblical;
		}

		public void setSeahBiblical(double seahBiblical) {
			this.seahBiblical = seahBiblical;
		}

		public double getOmerBiblical() {
			return omerBiblical;
		}

		public void setOmerBiblical(double omerBiblical) {
			this.omerBiblical = omerBiblical;
		}

		public double getCabBiblical() {
			return cabBiblical;
		}

		public void setCabBiblical(double cabBiblical) {
			this.cabBiblical = cabBiblical;
		}

		public double getLogBiblical() {
			return logBiblical;
		}

		public void setLogBiblical(double logBiblical) {
			this.logBiblical = logBiblical;
		}

	}
}
