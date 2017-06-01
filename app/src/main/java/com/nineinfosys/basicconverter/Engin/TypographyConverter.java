package com.nineinfosys.basicconverter.Engin;


import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by Supriya on 15-05-2017.
 */

public class TypographyConverter {
    private double twip,meter,centimeter,millimeter ,characterX,characterY,pixelX,pixelY,inchIn,
            picaComputer,picaPrinters, PostScriptpoint,pointComputer,pointprinter,en;
    private double edtValue;
    private String conversionFrom;



    public TypographyConverter(String conversionFrom, int edtValue) {
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
            case "Twip - twip":
                twip=(edtValue)*1;
                meter=(edtValue)*0.0000176389;
                centimeter=(edtValue)*0.0017638889;
                millimeter=(edtValue)*0.0176388889;
                characterX=(edtValue)*0.0083333333;
                characterY=(edtValue)*0.0041666667;
                pixelX=(edtValue)*0.0666666667;
                pixelY=(edtValue)*0.0666666667;
                inchIn=(edtValue)*0.0006944444;
                picaComputer=(edtValue)*0.0041666667;
                picaPrinters=(edtValue)*0.0041822917;
                PostScriptpoint=(edtValue)*0.05;
                pointComputer=(edtValue)*0.05;
                pointprinter=(edtValue)*0.0501875;
                en=(edtValue)*0.100375;


                break;

            case "Meter - m":
                twip=(edtValue)*56692.913386;
                meter=(edtValue)*1;
                centimeter=(edtValue)*100;
                millimeter=(edtValue)*1000;
                characterX=(edtValue)*472.44094488;
                characterY=(edtValue)*236.22047244;
                pixelX=(edtValue)*3779.5275591;
                pixelY=(edtValue)*3779.5275591;
                inchIn=(edtValue)*39.37007874;
                picaComputer=(edtValue)*236.22047244;
                picaPrinters=(edtValue)*237.10630158;
                PostScriptpoint=(edtValue)*2834.6456693;
                pointComputer=(edtValue)*2834.6456693;
                pointprinter=(edtValue)*2845.2755906;
                en=(edtValue)*5690.5511811;


                break;

            case "Centimeter - cm":
                twip=(edtValue)*566.92913386;
                meter=(edtValue)*0.01;
                centimeter=(edtValue)*1;
                millimeter=(edtValue)*10;
                characterX=(edtValue)*4.7244094488;
                characterY=(edtValue)*2.3622047244;
                pixelX=(edtValue)*37.795275591;
                pixelY=(edtValue)*37.795275591;
                inchIn=(edtValue)*0.3937007874;
                picaComputer=(edtValue)*2.3622047244;
                picaPrinters=(edtValue)*2.3710630158;
                PostScriptpoint=(edtValue)*28.346456693;
                pointComputer=(edtValue)*28.346456693;
                pointprinter=(edtValue)*28.452755906;
                en=(edtValue)*56.905511811;


                break;

            case "Millimeter - mm":
                twip=(edtValue)*56.692913386;
                meter=(edtValue)*0.001;
                centimeter=(edtValue)*0.1;
                millimeter=(edtValue)*1;
                characterX=(edtValue)*0.4724409449;
                characterY=(edtValue)*0.2362204724;
                pixelX=(edtValue)*3.7795275591;
                pixelY=(edtValue)*3.7795275591;
                inchIn=(edtValue)*0.0393700787;
                picaComputer=(edtValue)*0.2362204724;
                picaPrinters=(edtValue)*0.2371063016;
                PostScriptpoint=(edtValue)*2.8346456693;
                pointComputer=(edtValue)*2.8346456693;
                pointprinter=(edtValue)*2.8452755906;
                en=(edtValue)*5.6905511811;


                break;


            case "Character(X) - character(x)":
                twip=(edtValue)*120;
                meter=(edtValue)*0.0021166667;
                centimeter=(edtValue)*0.2116666667;
                millimeter=(edtValue)*2.1166666667;
                characterX=(edtValue)*1;
                characterY=(edtValue)*0.5;
                pixelX=(edtValue)*8;
                pixelY=(edtValue)*8;
                inchIn=(edtValue)*0.0833333333;
                picaComputer=(edtValue)*0.5;
                picaPrinters=(edtValue)*0.501875005;
                PostScriptpoint=(edtValue)*6;
                pointComputer=(edtValue)*6;
                pointprinter=(edtValue)*6.0225;
                en=(edtValue)*12.045;


                break;


            case "Character(Y) - character(y)":
                twip=(edtValue)*240;
                meter=(edtValue)*0.0042333333;
                centimeter=(edtValue)*0.4233333333;
                millimeter=(edtValue)*4.2333333333;
                characterX=(edtValue)*2;
                characterY=(edtValue)*1;
                pixelX=(edtValue)*16;
                pixelY=(edtValue)*16;
                inchIn=(edtValue)*0.1666666667;
                picaComputer=(edtValue)*1;
                picaPrinters=(edtValue)*1.00375001;
                PostScriptpoint=(edtValue)*12;
                pointComputer=(edtValue)*12;
                pointprinter=(edtValue)*12.045;
                en=(edtValue)*24.09;


                break;

            case "Pixel(X) - pixel(x)":
                twip=(edtValue)*15;
                meter=(edtValue)*0.0002645833;
                centimeter=(edtValue)*0.0264583333;
                millimeter=(edtValue)*0.2645833333;
                characterX=(edtValue)*0.125;
                characterY=(edtValue)*0.0625;
                pixelX=(edtValue)*1;
                pixelY=(edtValue)*1;
                inchIn=(edtValue)*0.0104166667;
                picaComputer=(edtValue)*0.0625;
                picaPrinters=(edtValue)*0.0627343756;
                PostScriptpoint=(edtValue)*0.75;
                pointComputer=(edtValue)*0.75;
                pointprinter=(edtValue)*0.7528125;
                en=(edtValue)*1.505625;


                break;

            case "Pixel(Y) - pixel(y)":
                twip=(edtValue)*15;
                meter=(edtValue)*0.0002645833;
                centimeter=(edtValue)*0.0264583333;
                millimeter=(edtValue)*0.2645833333;
                characterX=(edtValue)*0.125;
                characterY=(edtValue)*0.0625;
                pixelX=(edtValue)*1;
                pixelY=(edtValue)*1;
                inchIn=(edtValue)*0.0104166667;
                picaComputer=(edtValue)*0.0625;
                picaPrinters=(edtValue)*0.0627343756;
                PostScriptpoint=(edtValue)*0.75;
                pointComputer=(edtValue)*0.75;
                pointprinter=(edtValue)*0.7528125;
                en=(edtValue)*1.505625;


                break;

            case "Inch - in":
                twip=(edtValue)*1440;
                meter=(edtValue)*0.0254;
                centimeter=(edtValue)*2.54;
                millimeter=(edtValue)*25.4;
                characterX=(edtValue)*12;
                characterY=(edtValue)*6;
                pixelX=(edtValue)*96;
                pixelY=(edtValue)*96;
                inchIn=(edtValue)*1;
                picaComputer=(edtValue)*6;
                picaPrinters=(edtValue)*6.0225000602;
                PostScriptpoint=(edtValue)*72;
                pointComputer=(edtValue)*72;
                pointprinter=(edtValue)*72.27;
                en=(edtValue)*144.54;


                break;


            case "Pica(Computer) - pica":
                twip=(edtValue)*240;
                meter=(edtValue)*0.0042333333;
                centimeter=(edtValue)*0.42333333;
                millimeter=(edtValue)*4.2333333333;
                characterX=(edtValue)*2;
                characterY=(edtValue)*1;
                pixelX=(edtValue)*16;
                pixelY=(edtValue)*16;
                inchIn=(edtValue)*0.1666666667;
                picaComputer=(edtValue)*1;
                picaPrinters=(edtValue)*1.00375001;
                PostScriptpoint=(edtValue)*12;
                pointComputer=(edtValue)*12;
                pointprinter=(edtValue)*12.045;
                en=(edtValue)*24.09;


                break;


            case "Pica(Printer) - pica":
                twip=(edtValue)*239.10336;
                meter=(edtValue)*0.0042175176;
                centimeter=(edtValue)*0.42175176;
                millimeter=(edtValue)*4.2175176;
                characterX=(edtValue)*1.992528;
                characterY=(edtValue)*0.996264;
                pixelX=(edtValue)*15.940224;
                pixelY=(edtValue)*15.940224;
                inchIn=(edtValue)*0.166044;
                picaComputer=(edtValue)*0.996264;
                picaPrinters=(edtValue)*1;
                PostScriptpoint=(edtValue)*11.955168;
                pointComputer=(edtValue)*11.955168;
                pointprinter=(edtValue)*11.99999988;
                en=(edtValue)*23.99999976;


                break;

            case "PostScript point - psp":
                twip=(edtValue)*20;
                meter=(edtValue)*0.0003527778;
                centimeter=(edtValue)*0.0352777778;
                millimeter=(edtValue)*0.3527777778;
                characterX=(edtValue)*0.1666666667;
                characterY=(edtValue)*0.0833333333;
                pixelX=(edtValue)*1.3333333333;
                pixelY=(edtValue)*1.3333333333;
                inchIn=(edtValue)*0.0138888889;
                picaComputer=(edtValue)*0.0833333333;
                picaPrinters=(edtValue)*0.0836458342;
                PostScriptpoint=(edtValue)*1;
                pointComputer=(edtValue)*1;
                pointprinter=(edtValue)*1.00375;
                en=(edtValue)*2.0075;


                break;


            case "Point(Computer) - pt":
                twip=(edtValue)*20;
                meter=(edtValue)*0.0003527778;
                centimeter=(edtValue)*0.0352777778;
                millimeter=(edtValue)*0.3527777778;
                characterX=(edtValue)*0.1666666667;
                characterY=(edtValue)*0.0833333333;
                pixelX=(edtValue)*1.3333333333;
                pixelY=(edtValue)*1.3333333333;
                inchIn=(edtValue)*0.0138888889;
                picaComputer=(edtValue)*0.0833333333;
                picaPrinters=(edtValue)*0.0836458342;
                PostScriptpoint=(edtValue)*1;
                pointComputer=(edtValue)*1;
                pointprinter=(edtValue)*1.00375;
                en=(edtValue)*2.0075;


                break;


            case "Point(Printer) - pt":
                twip=(edtValue)*19.925280199;
                meter=(edtValue)*0.0003514598;
                centimeter=(edtValue)*0.0351459804;
                millimeter=(edtValue)*0.3514598035;
                characterX=(edtValue)*0.1660440017;
                characterY=(edtValue)*0.0830220008;
                pixelX=(edtValue)*1.3283520133;
                pixelY=(edtValue)*1.3283520133;
                inchIn=(edtValue)*0.0138370001;
                picaComputer=(edtValue)*0.0830220008;
                picaPrinters=(edtValue)*0.0833333342;
                PostScriptpoint=(edtValue)*0.99626401;
                pointComputer=(edtValue)*0.99626401;
                pointprinter=(edtValue)*1;
                en=(edtValue)*2;


                break;

            case "En - en":
                twip=(edtValue)*9.9626400996;
                meter=(edtValue)*0.0001757299;
                centimeter=(edtValue)*0.0175729902;
                millimeter=(edtValue)*0.1757299018;
                characterX=(edtValue)*0.0830220008;
                characterY=(edtValue)*0.0415110004;
                pixelX=(edtValue)*0.6641760066;
                pixelY=(edtValue)*0.6641760066;
                inchIn=(edtValue)*0.0069185001;
                picaComputer=(edtValue)*0.0415110004;
                picaPrinters=(edtValue)*0.0416666671;
                PostScriptpoint=(edtValue)*0.498132005;
                pointComputer=(edtValue)*0.498132005;
                pointprinter=(edtValue)*0.5;
                en=(edtValue)*1;


                break;

        }




        results.setTwip(twip);
        results.setMeter(meter);
        results.setCentimeter(centimeter);
        results.setMillimeter(millimeter);
        results.setCharacterX(characterX);
        results.setCharacterY(characterY);
        results.setPixelX(pixelX);
        results.setPixelY(pixelY);

        results.setInchIn(inchIn);

        results.setPicaComputer(picaComputer);
        results.setPicaPrinters(picaPrinters);
        results.setPostScriptpoint(PostScriptpoint);

        results.setPointComputer(pointComputer);
        results.setPointprinter(pointprinter);
        results.setEn(en);
        converterArray.add(results);
        return converterArray;

    }

    public class ConversionResults{
        private double	twip,meter,centimeter,millimeter ,characterX,characterY,pixelX,pixelY,inchIn,
                picaComputer,picaPrinters, PostScriptpoint,pointComputer,pointprinter,en;

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

        public double getCharacterX() {
            return characterX;
        }

        public void setCharacterX(double characterX) {
            this.characterX = characterX;
        }

        public double getCharacterY() {
            return characterY;
        }

        public void setCharacterY(double characterY) {
            this.characterY = characterY;
        }

        public double getPixelX() {
            return pixelX;
        }

        public void setPixelX(double pixelX) {
            this.pixelX = pixelX;
        }

        public double getPixelY() {
            return pixelY;
        }

        public void setPixelY(double pixelY) {
            this.pixelY = pixelY;
        }

        public double getInchIn() {
            return inchIn;
        }

        public void setInchIn(double inchIn) {
            this.inchIn = inchIn;
        }

        public double getPicaComputer() {
            return picaComputer;
        }

        public void setPicaComputer(double picaComputer) {
            this.picaComputer = picaComputer;
        }

        public double getPicaPrinters() {
            return picaPrinters;
        }

        public void setPicaPrinters(double picaPrinters) {
            this.picaPrinters = picaPrinters;
        }

        public double getPostScriptpoint() {
            return PostScriptpoint;
        }

        public void setPostScriptpoint(double postScriptpoint) {
            PostScriptpoint = postScriptpoint;
        }

        public double getPointComputer() {
            return pointComputer;
        }

        public void setPointComputer(double pointComputer) {
            this.pointComputer = pointComputer;
        }

        public double getPointprinter() {
            return pointprinter;
        }

        public void setPointprinter(double pointprinter) {
            this.pointprinter = pointprinter;
        }

        public double getEn() {
            return en;
        }

        public void setEn(double en) {
            this.en = en;
        }







    }


    public static class TypographyConverterMain {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            TypographyConverter iA = new TypographyConverter("twip",1);

            ArrayList<ConversionResults> results = iA.calculateForceConversion();
            int length = results.size();




            for(int i = 0; i <length; i++){

                TypographyConverter.ConversionResults item  =  results.get(i);

                System.out.println("\n twip - " +new DecimalFormat("##.################").format( item.getTwip())+

                        "\n meter- " +new DecimalFormat("##.################").format( item.getMeter())+

                        "\n centimeter - " +new DecimalFormat("##.################").format( item.getCentimeter())+

                        "\n millimeter - " +new DecimalFormat("##.################").format( item.getMillimeter())+

                        "\n characterX - " +new DecimalFormat("##.################").format( item.getCharacterX())+
                        "\n characterY - " +new DecimalFormat("##.################").format( item.getCharacterY())+

                        "\n pixelX - " +new DecimalFormat("##.################").format( item.getPixelX())+

                        "\n pixelY - " +new DecimalFormat("##.################").format( item.getPixelY())
                        +"\n inchIn - " +new DecimalFormat("##.################").format( item.getInchIn()) +
                        "\n picaComputer - " +new DecimalFormat("##.################").format( item.getPicaComputer())+
                        "\n picaPrinters - " +new DecimalFormat("##.################").format( item.getPicaPrinters())	+

                        "\n PostScriptpoint - " +new DecimalFormat("##.################").format( item.getPostScriptpoint())+
                        "\n pointComputer - " +new DecimalFormat("##.################").format( item.getPointComputer())+

                        "\n PostScriptpoint - " +new DecimalFormat("##.################").format( item.getPostScriptpoint())+
                        "\n pointprinter - " +new DecimalFormat("##.################").format( item.getPointprinter())


                        +
                        "\n en - " +new DecimalFormat("##.################").format( item.getEn())

                );


            }
        }
    }

}
