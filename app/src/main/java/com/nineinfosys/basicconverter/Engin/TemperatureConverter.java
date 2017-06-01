package com.nineinfosys.basicconverter.Engin;

import java.util.ArrayList;

/**
 * Created by AndriodDev5 on 22-04-2017.
 */

public class TemperatureConverter {
    private double Celsius,Fahrenheit,kelvin,Rankine,Newton,Reaumur,Romer,Delisle;
    private double edtValue;
    private String conversionFrom;
    //private String conversionTo;
    public TemperatureConverter(String conversionFrom, double edtValue){
        // TODO Auto-generated constructor stub
        this.conversionFrom = conversionFrom;
        this.edtValue = edtValue;
    }
    public ArrayList<ConversionResults> calculateTemperatureConversion()
    {


        ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();

        ConversionResults results= new ConversionResults();

        switch(conversionFrom)
        {
            case "Celsius - °C":

                Celsius=(edtValue)*1;
                Fahrenheit=(edtValue)*3.38;
                kelvin=(edtValue)*274.15;
                Rankine=(edtValue)*493.47;
                Newton=(edtValue)*0.33;
                Reaumur=(edtValue)*0.8;
                Romer=(edtValue)*8.025;
                Delisle=(edtValue)*-98.50;
                break;

            case "Fahrenheit - °F":

                Celsius=(edtValue)*-17.222222222;
                Fahrenheit=(edtValue)*1;
                kelvin=(edtValue)*255.92777778;
                Rankine=(edtValue)*460.67;
                Newton=(edtValue)*-5.6832300000;
                Reaumur=(edtValue)*-13.777777778;
                Romer=(edtValue)*-1.5417700000;
                Delisle=(edtValue)*-125.8332300000;

                break;

            case "Kelvin - °K":

                Celsius=(edtValue)*-272.15;
                Fahrenheit=(edtValue)*-457.87;
                kelvin=(edtValue)*1;
                Rankine=(edtValue)*1.8;
                Newton=(edtValue)*-89.8095000000;
                Reaumur=(edtValue)*-217.72;
                Romer=(edtValue)*-135.3787500000;
                Delisle=(edtValue)*-508.2250000000;

                break;
            case "Rankine - °R":

                Celsius=(edtValue)*-272.59444444;
                Fahrenheit=(edtValue)*-458.67;
                kelvin=(edtValue)*0.5555555556;
                Rankine=(edtValue)*1;
                Newton=(edtValue)*-89.9545311000;
                Reaumur=(edtValue)*-218.07555556;
                Romer=(edtValue)*-135.6137189000;
                Delisle=(edtValue)*-508.8900311000;

                break;
            case "Newton - °N":

                Celsius=(edtValue)*3.0303030303;
                Fahrenheit=(edtValue)*37.4545000000;
                kelvin=(edtValue)*276.1803030303;
                Rankine=(edtValue)*497.1245000000;
                Newton=(edtValue)*1;
                Reaumur=(edtValue)*2.4242000000;
                Romer=(edtValue)*9.0909000000;
                Delisle=(edtValue)*-95.4545000000;

                break;
            case "Reaumur - °Ré":

                Celsius=(edtValue)*1.25;
                Fahrenheit=(edtValue)*34.25;
                kelvin=(edtValue)*274.4;
                Rankine=(edtValue)*493.92;
                Newton=(edtValue)*0.4125000000;
                Reaumur=(edtValue)*1;
                Romer=(edtValue)*8.1562500000;
                Delisle=(edtValue)*-98.1250000000;

                break;

            case "Romer - °Rø":

                Celsius=(edtValue)*-12.3809523810;
                Fahrenheit=(edtValue)*9.7141000000;
                kelvin=(edtValue)*260.7690476190;
                Rankine=(edtValue)*469.3841000000;
                Newton=(edtValue)*-4.0857050000;
                Reaumur=(edtValue)*-9.9047000000;
                Romer=(edtValue)*1;
                Delisle=(edtValue)*-118.5711500000;

                break;

            case "Delisle - °D":

                Celsius=(edtValue)*67.3333333333;
                Fahrenheit=(edtValue)*153.2000000000;
                kelvin=(edtValue)*340.4833333333;
                Rankine=(edtValue)*613.8700000000;
                Newton=(edtValue)*22.2200000000;
                Reaumur=(edtValue)*53.8663300000;
                Romer=(edtValue)*42.8500000000;
                Delisle=(edtValue)*1;

                break;

            case "Default":
                break;

        }
        results.setCelsius(Celsius);
        results.setFahrenheit(Fahrenheit);
        results.setNewton(Newton);
        results.setKelvin(kelvin);
        results.setRankine(Rankine);
        results.setReaumur(Reaumur);
        results.setRomer(Romer);
        results.setDelisle(Delisle);
        converterArray.add(results);
        return converterArray;
    }

    public class ConversionResults{

        private double Celsius,Fahrenheit,kelvin,Rankine,Newton,Reaumur,Romer,Delisle;

        public double getCelsius() {
            return Celsius;
        }

        public void setCelsius(double celsius) {
            Celsius = celsius;
        }

        public double getFahrenheit() {
            return Fahrenheit;
        }

        public void setFahrenheit(double fahrenheit) {
            Fahrenheit = fahrenheit;
        }

        public double getKelvin() {
            return kelvin;
        }

        public void setKelvin(double kelvin) {
            this.kelvin = kelvin;
        }

        public double getRankine() {
            return Rankine;
        }

        public void setRankine(double rankine) {
            Rankine = rankine;
        }

        public double getNewton() {
            return Newton;
        }

        public void setNewton(double newton) {
            Newton = newton;
        }

        public double getReaumur() {
            return Reaumur;
        }

        public void setReaumur(double reaumur) {
            Reaumur = reaumur;
        }

        public double getRomer() {
            return Romer;
        }

        public void setRomer(double romer) {
            Romer = romer;
        }

        public double getDelisle() {
            return Delisle;
        }

        public void setDelisle(double delisle) {
            Delisle = delisle;
        }
    }
}

