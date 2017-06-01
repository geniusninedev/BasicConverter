package com.nineinfosys.basicconverter.Engin;

import java.util.ArrayList;


public class VolumeLumberConverter {
    private double cubicmeter,cubicfoot,cubicinch,boardfeet ,thousandboardfeet,cord
            ,cord80cubicft,cordfeet ,cunit ,
            pallet ,crosstie ,switchtie,thousandsquarefeet1of8inch,thousandsquarefeet1of4inch,
            thousandsquarefeet3of8inch
            ,thousandsquarefeet1of2inch,thousandsquarefeet3of4inch;
    private double edtValue;
    private String conversionFrom;




    public VolumeLumberConverter(String conversionFrom, int edtValue) {
        // TODO Auto-generated constructor stub
        this.conversionFrom = conversionFrom;
        this.edtValue = edtValue;
    }
    public ArrayList<ConversionResults> calculateVolumeLumberConversions()
    {

        ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();

        ConversionResults results= new ConversionResults();




        switch(conversionFrom)
        {
            case "Cubic meter - m³":
                cubicmeter=(edtValue)*1;
                cubicfoot=(edtValue)*35.31466672;
                cubicinch=(edtValue)*61023.74409;
                boardfeet=(edtValue)*423.7760007;
                thousandboardfeet=(edtValue)*0.4237760007;
                cord=(edtValue)*0.2758958338;
                cord80cubicft=(edtValue)*0.441433334;
                cordfeet=(edtValue)*2.20716667;
                cunit=(edtValue)*0.3531466672;
                pallet=(edtValue)*24.92800004;
                crosstie=(edtValue)*10.59440002;
                switchtie=(edtValue)*6.726603185;
                thousandsquarefeet1of8inch=(edtValue)*3.390208005;
                thousandsquarefeet1of4inch=(edtValue)*1.695104003;
                thousandsquarefeet3of8inch=(edtValue)*1.130069335;
                thousandsquarefeet1of2inch=(edtValue)*0.8475520013;
                thousandsquarefeet3of4inch=(edtValue)*0.5650346675;

                break;

            case "Cubic foot - ft³":
                cubicmeter=(edtValue)*0.0283168466;
                cubicfoot=(edtValue)*1;
                cubicinch=(edtValue)*1727.9999999;
                boardfeet=(edtValue)*12.000000002;
                thousandboardfeet=(edtValue)*0.012;
                cord=(edtValue)*0.0078125;
                cord80cubicft=(edtValue)*0.0125;
                cordfeet=(edtValue)*0.0625;
                cunit=(edtValue)*0.01;
                pallet=(edtValue)*0.705882353;
                crosstie=(edtValue)*0.3000000001;
                switchtie=(edtValue)*0.1904761905;
                thousandsquarefeet1of8inch=(edtValue)*0.096;
                thousandsquarefeet1of4inch=(edtValue)*0.048;
                thousandsquarefeet3of8inch=(edtValue)*0.032;
                thousandsquarefeet1of2inch=(edtValue)*0.024;
                thousandsquarefeet3of4inch=(edtValue)*0.016;

                break;
            case "Cubic inch - in³":

                cubicmeter=(edtValue)*0.0000163871;
                cubicfoot=(edtValue)*0.0005787037;
                cubicinch=(edtValue)*1;
                boardfeet=(edtValue)*0.0069444444;
                thousandboardfeet=(edtValue)*0.0000069444;
                cord=(edtValue)*0.0000045211;
                cord80cubicft=(edtValue)*0.0000072338;
                cordfeet=(edtValue)*0.000036169;
                cunit=(edtValue)*0.000005787;
                pallet=(edtValue)*0.0004084967;
                crosstie=(edtValue)*0.0001736111;
                switchtie=(edtValue)*0.0001102293;
                thousandsquarefeet1of8inch=(edtValue)*0.0000555556;
                thousandsquarefeet1of4inch=(edtValue)*0.0000277778;
                thousandsquarefeet3of8inch=(edtValue)*0.0000185185;
                thousandsquarefeet1of2inch=(edtValue)*0.0000138889;
                thousandsquarefeet3of4inch=(edtValue)*0.0000092593;

                break;

            case "Board feet - boardfeet":
                cubicmeter=(edtValue)*0.0023597372;
                cubicfoot=(edtValue)*0.0833333333;
                cubicinch=(edtValue)*143.99999997;
                boardfeet=(edtValue)*1;
                thousandboardfeet=(edtValue)*0.001;
                cord=(edtValue)*0.0006510417;
                cord80cubicft=(edtValue)*0.0010416667;
                cordfeet=(edtValue)*0.0052083333;
                cunit=(edtValue)*0.0008333333;
                pallet=(edtValue)*0.0588235294;
                crosstie=(edtValue)*0.025;
                switchtie=(edtValue)*0.0158730159;
                thousandsquarefeet1of8inch=(edtValue)*0.008;
                thousandsquarefeet1of4inch=(edtValue)*0.004;
                thousandsquarefeet3of8inch=(edtValue)*0.0026666667;
                thousandsquarefeet1of2inch=(edtValue)*0.002;
                thousandsquarefeet3of4inch=(edtValue)*0.0013333333;

                break;


            case "Thousand board feet - thousand board feet":

                cubicmeter=(edtValue)*2.3597372158;
                cubicfoot=(edtValue)*83.333333322;
                cubicinch=(edtValue)*143999.99997;
                boardfeet=(edtValue)*1000;
                thousandboardfeet=(edtValue)*1;
                cord=(edtValue)*0.6510416667;
                cord80cubicft=(edtValue)*1.0416666665;
                cordfeet=(edtValue)*5.2083333326;
                cunit=(edtValue)*0.8333333332;
                pallet=(edtValue)*58.823529409;
                crosstie=(edtValue)*25.000000006;
                switchtie=(edtValue)*15.873015871;
                thousandsquarefeet1of8inch=(edtValue)*7.9999999986;
                thousandsquarefeet1of4inch=(edtValue)*4.0000000005;
                thousandsquarefeet3of8inch=(edtValue)*2.6666666662;
                thousandsquarefeet1of2inch=(edtValue)*1.9999999998;
                thousandsquarefeet3of4inch=(edtValue)*1.3333333331;

                break;

            case "Cord - cord":

                cubicmeter=(edtValue)*3.6245563633;
                cubicfoot=(edtValue)*127.99999998;
                cubicinch=(edtValue)*221183.99995;
                boardfeet=(edtValue)*1535.9999999;
                thousandboardfeet=(edtValue)*1.5359999999;
                cord=(edtValue)*1;
                cord80cubicft=(edtValue)*1.5999999997;
                cordfeet=(edtValue)*7.9999999986;
                cunit=(edtValue)*1.2799999998;
                pallet=(edtValue)*90.352941169;
                crosstie=(edtValue)*38.400000008;
                switchtie=(edtValue)*24.380952377;
                thousandsquarefeet1of8inch=(edtValue)*12.287999997;
                thousandsquarefeet1of4inch=(edtValue)*6.1440000005;
                thousandsquarefeet3of8inch=(edtValue)*4.0959999991;
                thousandsquarefeet1of2inch=(edtValue)*3.0719999995;
                thousandsquarefeet3of4inch=(edtValue)*2.0479999996;

                break;

            case "Cord(80 cubic ft) - cord":

                cubicmeter=(edtValue)*2.2653477275;
                cubicfoot=(edtValue)*80;
                cubicinch=(edtValue)*138240;
                boardfeet=(edtValue)*960.00000014;
                thousandboardfeet=(edtValue)*0.9600000001;
                cord=(edtValue)*0.6250000001;
                cord80cubicft=(edtValue)*1;
                cordfeet=(edtValue)*5;
                cunit=(edtValue)*0.8;
                pallet=(edtValue)*56.470588241;
                crosstie=(edtValue)*24.000000009;
                switchtie=(edtValue)*15.238095239;
                thousandsquarefeet1of8inch=(edtValue)*7.6799999997;
                thousandsquarefeet1of4inch=(edtValue)*3.840000001;
                thousandsquarefeet3of8inch=(edtValue)*2.5599999999;
                thousandsquarefeet1of2inch=(edtValue)*1.92;
                thousandsquarefeet3of4inch=(edtValue)*1.28;

                break;


            case "Cord feet - cordfeet":
                cubicmeter=(edtValue)*0.4530695455;
                cubicfoot=(edtValue)*16;
                cubicinch=(edtValue)*27647.999999;
                boardfeet=(edtValue)*192.00000003;
                thousandboardfeet=(edtValue)*0.192;
                cord=(edtValue)*0.125;
                cord80cubicft=(edtValue)*0.2;
                cordfeet=(edtValue)*1;
                cunit=(edtValue)*0.16;
                pallet=(edtValue)*11.294117648;
                crosstie=(edtValue)*4.8000000018;
                switchtie=(edtValue)*3.0476190477;
                thousandsquarefeet1of8inch=(edtValue)*1.5359999999;
                thousandsquarefeet1of4inch=(edtValue)*0.7680000002;
                thousandsquarefeet3of8inch=(edtValue)*0.512;
                thousandsquarefeet1of2inch=(edtValue)*0.384;
                thousandsquarefeet3of4inch=(edtValue)*0.256;

                break;


            case "Cunit - cunit":
                cubicmeter=(edtValue)*2.8316846593;
                cubicfoot=(edtValue)*100;
                cubicinch=(edtValue)*172799.99999;
                boardfeet=(edtValue)*1200.0000002;
                thousandboardfeet=(edtValue)*1.2000000002;
                cord=(edtValue)*0.7812500001;
                cord80cubicft=(edtValue)*1.25;
                cordfeet=(edtValue)*6.25;
                cunit=(edtValue)*1;
                pallet=(edtValue)*70.588235301;
                crosstie=(edtValue)*30.000000011;
                switchtie=(edtValue)*19.047619048;
                thousandsquarefeet1of8inch=(edtValue)*9.5999999997;
                thousandsquarefeet1of4inch=(edtValue)*4.8000000012;
                thousandsquarefeet3of8inch=(edtValue)*3.1999999999;
                thousandsquarefeet1of2inch=(edtValue)*2.4000000001;
                thousandsquarefeet3of4inch=(edtValue)*1.5999999999;

                break;


            case "Pallet - pallet":
                cubicmeter=(edtValue)*0.0401155327;
                cubicfoot=(edtValue)*1.4166666665;
                cubicinch=(edtValue)*2447.9999997;
                boardfeet=(edtValue)*17.000000001;
                thousandboardfeet=(edtValue)*0.017;
                cord=(edtValue)*0.0110677083;
                cord80cubicft=(edtValue)*0.0177083333;
                cordfeet=(edtValue)*0.0885416667;
                cunit=(edtValue)*0.0141666667;
                pallet=(edtValue)*1;
                crosstie=(edtValue)*0.4250000001;
                switchtie=(edtValue)*0.2698412698;
                thousandsquarefeet1of8inch=(edtValue)*0.136;
                thousandsquarefeet1of4inch=(edtValue)*0.068;
                thousandsquarefeet3of8inch=(edtValue)*0.0453333333;
                thousandsquarefeet1of2inch=(edtValue)*0.034;
                thousandsquarefeet3of4inch=(edtValue)*0.0226666667;

                break;

            case "Cross tie - crosstie":
                cubicmeter=(edtValue)*0.0943894886;
                cubicfoot=(edtValue)*3.3333333321;
                cubicinch=(edtValue)*5759.9999976;
                boardfeet=(edtValue)*39.999999991;
                thousandboardfeet=(edtValue)*0.04;
                cord=(edtValue)*0.0260416667;
                cord80cubicft=(edtValue)*0.0416666667;
                cordfeet=(edtValue)*0.2083333333;
                cunit=(edtValue)*0.0333333333;
                pallet=(edtValue)*2.3529411758;
                crosstie=(edtValue)*1;
                switchtie=(edtValue)*0.6349206347;
                thousandsquarefeet1of8inch=(edtValue)*0.3199999999;
                thousandsquarefeet1of4inch=(edtValue)*0.16;
                thousandsquarefeet3of8inch=(edtValue)*0.1066666666;
                thousandsquarefeet1of2inch=(edtValue)*0.08;
                thousandsquarefeet3of4inch=(edtValue)*0.0533333333;

                break;



									  /*  case "cubicmeter":
									cubicmeter=(edtValue)*;
									cubicfoot=(edtValue)*;
								cubicinch=(edtValue)*;
									boardfeet=(edtValue)*;
									thousandboardfeet=(edtValue)*;
									cord=(edtValue)*;
									cord80cubicft=(edtValue)*;
									cordfeet=(edtValue)*;
								cunit=(edtValue)*;
									pallet=(edtValue)*;
									crosstie=(edtValue)*;
									switchtie=(edtValue)*;
									thousandsquarefeet1of8inch=(edtValue)*;
									thousandsquarefeet1of4inch=(edtValue)*;
								thousandsquarefeet3of8inch=(edtValue)*;
									thousandsquarefeet1of2inch=(edtValue)*;
									thousandsquarefeet3of4inch=(edtValue)*;

									break;*/

            case "Switch tie - switchtie":
                cubicmeter=(edtValue)*0.1486634446;
                cubicfoot=(edtValue)*5.2499999998;
                cubicinch=(edtValue)*9071.9999994;
                boardfeet=(edtValue)*63.000000007;
                thousandboardfeet=(edtValue)*0.063;
                cord=(edtValue)*0.041015625;
                cord80cubicft=(edtValue)*0.065625;
                cordfeet=(edtValue)*0.328125;
                cunit=(edtValue)*0.0525;
                pallet=(edtValue)*3.7058823532;
                crosstie=(edtValue)*1.5750000005;
                switchtie=(edtValue)*1;
                thousandsquarefeet1of8inch=(edtValue)*0.504;
                thousandsquarefeet1of4inch=(edtValue)*0.2520000001;
                thousandsquarefeet3of8inch=(edtValue)*0.168;
                thousandsquarefeet1of2inch=(edtValue)*0.126;
                thousandsquarefeet3of4inch=(edtValue)*0.084;

                break;


            case "Thousand square feet (1/8inch panels) - ft²":
                cubicmeter=(edtValue)*0.294967152;
                cubicfoot=(edtValue)*10.416666667;
                cubicinch=(edtValue)*18000;
                boardfeet=(edtValue)*125.00000002;
                thousandboardfeet=(edtValue)*0.125;
                cord=(edtValue)*0.0813802084;
                cord80cubicft=(edtValue)*0.1302083333;
                cordfeet=(edtValue)*0.6510416667;
                cunit=(edtValue)*0.1041666667;
                pallet=(edtValue)*7.3529411774;
                crosstie=(edtValue)*3.1250000013;
                switchtie=(edtValue)*1.9841269843;
                thousandsquarefeet1of8inch=(edtValue)*1;
                thousandsquarefeet1of4inch=(edtValue)*0.5000000001;
                thousandsquarefeet3of8inch=(edtValue)*0.3333333333;
                thousandsquarefeet1of2inch=(edtValue)*0.25;
                thousandsquarefeet3of4inch=(edtValue)*0.1666666667;

                break;


            case "Thousand square feet (1/4inch panels) - ft²" :
                cubicmeter=(edtValue)*0.5899343039;
                cubicfoot=(edtValue)*20.833333328;
                cubicinch=(edtValue)*35999.999989;
                boardfeet=(edtValue)*249.99999997;
                thousandboardfeet=(edtValue)*0.25;
                cord=(edtValue)*0.1627604167;
                cord80cubicft=(edtValue)*0.2604166666;
                cordfeet=(edtValue)*1.302083333;
                cunit=(edtValue)*0.2083333333;
                pallet=(edtValue)*14.705882351;
                crosstie=(edtValue)*6.2500000007;
                switchtie=(edtValue)*3.9682539674;
                thousandsquarefeet1of8inch=(edtValue)*1.9999999994;
                thousandsquarefeet1of4inch=(edtValue)*1;
                thousandsquarefeet3of8inch=(edtValue)*0.6666666665;
                thousandsquarefeet1of2inch=(edtValue)*0.4999999999;
                thousandsquarefeet3of4inch=(edtValue)*0.3333333332;

                break;




            case "Thousand square feet (3/8inch panels) - ft²" :
                cubicmeter=(edtValue)*0.8849014561;
                cubicfoot=(edtValue)*31.250000001;
                cubicinch=(edtValue)*54000;
                boardfeet=(edtValue)*375.00000007;
                thousandboardfeet=(edtValue)*0.3750000001;
                cord=(edtValue)*0.2441406251;
                cord80cubicft=(edtValue)*0.390625;
                cordfeet=(edtValue)*1.9531250001;
                cunit=(edtValue)*0.3125;
                pallet=(edtValue)*22.058823532;
                crosstie=(edtValue)*9.3750000039;
                switchtie=(edtValue)*5.9523809528;
                thousandsquarefeet1of8inch=(edtValue)*3;
                thousandsquarefeet1of4inch=(edtValue)*1.5000000004;
                thousandsquarefeet3of8inch=(edtValue)*1;
                thousandsquarefeet1of2inch=(edtValue)*0.75;
                thousandsquarefeet3of4inch=(edtValue)*0.5;

                break;



            case "Thousand square feet (1/2inch panels) - ft²":
                cubicmeter=(edtValue)*1.179868608;
                cubicfoot=(edtValue)*41.666666666;
                cubicinch=(edtValue)*71999.999996;
                boardfeet=(edtValue)*500.00000006;
                thousandboardfeet=(edtValue)*0.5000000001;
                cord=(edtValue)*0.3255208334;
                cord80cubicft=(edtValue)*0.5208333333;
                cordfeet=(edtValue)*2.6041666666;
                cunit=(edtValue)*0.4166666667;
                pallet=(edtValue)*29.411764708;
                crosstie=(edtValue)*12.500000004;
                switchtie=(edtValue)*7.9365079366;
                thousandsquarefeet1of8inch=(edtValue)*3.9999999998;
                thousandsquarefeet1of4inch=(edtValue)*2.0000000005;
                thousandsquarefeet3of8inch=(edtValue)*1.3333333333;
                thousandsquarefeet1of2inch=(edtValue)*1;
                thousandsquarefeet3of4inch=(edtValue)*0.6666666666;

                break;


            case "Thousand square feet (3/4inch panels) - ft²":
                cubicmeter=(edtValue)*1.7698029121;
                cubicfoot=(edtValue)*62.500000002;
                cubicinch=(edtValue)*108000;
                boardfeet=(edtValue)*750.00000013;
                thousandboardfeet=(edtValue)*0.7500000001;
                cord=(edtValue)*0.4882812501;
                cord80cubicft=(edtValue)*0.78125;
                cordfeet=(edtValue)*3.9062500001;
                cunit=(edtValue)*0.625;
                pallet=(edtValue)*44.117647065;
                crosstie=(edtValue)*18.750000008;
                switchtie=(edtValue)*11.904761906;
                thousandsquarefeet1of8inch=(edtValue)*6;
                thousandsquarefeet1of4inch=(edtValue)*3.0000000009;
                thousandsquarefeet3of8inch=(edtValue)*2;
                thousandsquarefeet1of2inch=(edtValue)*1.5000000001;
                thousandsquarefeet3of4inch=(edtValue)*1;

                break;

        }



        results.setCubicmeter(cubicmeter);
        results.setCubicfoot(cubicfoot);

        results.setCubicinch(cubicinch);
        results.setBoardfeet(boardfeet);
        results.setThousandboardfeet(thousandboardfeet);
        results.setCord(cord);
        results.setCord80cubicft(cord80cubicft);
        results.setCordfeet(cordfeet);
        results.setCunit(cunit);
        results.setPallet(pallet);
        results.setCrosstie(crosstie);
        results.setSwitchtie(switchtie);
        results.setThousandsquarefeet1of8inch(thousandsquarefeet1of8inch);
        results.setThousandsquarefeet1of4inch(thousandsquarefeet1of4inch);
        results.setThousandsquarefeet3of8inch(thousandsquarefeet3of8inch);
        results.setThousandsquarefeet1of2inch(thousandsquarefeet1of2inch);
        results.setThousandsquarefeet3of4inch(thousandsquarefeet3of4inch);
        converterArray.add(results);
        return converterArray;

    }



    public class ConversionResults{
        private double cubicmeter,cubicfoot,cubicinch,boardfeet ,thousandboardfeet,cord ,cord80cubicft,cordfeet ,cunit ,
                pallet ,crosstie ,switchtie,thousandsquarefeet1of8inch,thousandsquarefeet1of4inch,
                thousandsquarefeet3of8inch
                ,thousandsquarefeet1of2inch,thousandsquarefeet3of4inch;

        public double getCubicmeter() {
            return cubicmeter;
        }

        public void setCubicmeter(double cubicmeter) {
            this.cubicmeter = cubicmeter;
        }

        public double getCubicfoot() {
            return cubicfoot;
        }

        public void setCubicfoot(double cubicfoot) {
            this.cubicfoot = cubicfoot;
        }

        public double getCubicinch() {
            return cubicinch;
        }

        public void setCubicinch(double cubicinch) {
            this.cubicinch = cubicinch;
        }

        public double getBoardfeet() {
            return boardfeet;
        }

        public void setBoardfeet(double boardfeet) {
            this.boardfeet = boardfeet;
        }

        public double getThousandboardfeet() {
            return thousandboardfeet;
        }

        public void setThousandboardfeet(double thousandboardfeet) {
            this.thousandboardfeet = thousandboardfeet;
        }

        public double getCord() {
            return cord;
        }

        public void setCord(double cord) {
            this.cord = cord;
        }

        public double getCord80cubicft() {
            return cord80cubicft;
        }

        public void setCord80cubicft(double cord80cubicft) {
            this.cord80cubicft = cord80cubicft;
        }

        public double getCordfeet() {
            return cordfeet;
        }

        public void setCordfeet(double cordfeet) {
            this.cordfeet = cordfeet;
        }

        public double getCunit() {
            return cunit;
        }

        public void setCunit(double cunit) {
            this.cunit = cunit;
        }

        public double getPallet() {
            return pallet;
        }

        public void setPallet(double pallet) {
            this.pallet = pallet;
        }

        public double getCrosstie() {
            return crosstie;
        }

        public void setCrosstie(double crosstie) {
            this.crosstie = crosstie;
        }

        public double getSwitchtie() {
            return switchtie;
        }

        public void setSwitchtie(double switchtie) {
            this.switchtie = switchtie;
        }

        public double getThousandsquarefeet1of8inch() {
            return thousandsquarefeet1of8inch;
        }

        public void setThousandsquarefeet1of8inch(double thousandsquarefeet1of8inch) {
            this.thousandsquarefeet1of8inch = thousandsquarefeet1of8inch;
        }

        public double getThousandsquarefeet1of4inch() {
            return thousandsquarefeet1of4inch;
        }

        public void setThousandsquarefeet1of4inch(double thousandsquarefeet1of4inch) {
            this.thousandsquarefeet1of4inch = thousandsquarefeet1of4inch;
        }

        public double getThousandsquarefeet3of8inch() {
            return thousandsquarefeet3of8inch;
        }

        public void setThousandsquarefeet3of8inch(double thousandsquarefeet3of8inch) {
            this.thousandsquarefeet3of8inch = thousandsquarefeet3of8inch;
        }

        public double getThousandsquarefeet1of2inch() {
            return thousandsquarefeet1of2inch;
        }

        public void setThousandsquarefeet1of2inch(double thousandsquarefeet1of2inch) {
            this.thousandsquarefeet1of2inch = thousandsquarefeet1of2inch;
        }

        public double getThousandsquarefeet3of4inch() {
            return thousandsquarefeet3of4inch;
        }

        public void setThousandsquarefeet3of4inch(double thousandsquarefeet3of4inch) {
            this.thousandsquarefeet3of4inch = thousandsquarefeet3of4inch;
        }



    }



 /*   public static class VolumeLumberConverterMain {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            VolumeLumberConverter iA = new VolumeLumberConverter("cubicmeter",1);

            ArrayList<VolumeLumberConverter.ConversionResults> results = iA.calculateVolumeLumberConversions();
            int length = results.size();




            for(int i = 0; i <length; i++){

                VolumeLumberConverter.ConversionResults item  =  results.get(i);

                System.out.println("\n cubicmeter - " +new DecimalFormat("##.################").format( item.getCubicmeter())

                        +
                        "\n cubicfoot - " +new DecimalFormat("##.################").format( item.getCubicfoot())+
                        "\n cubicinch - " +new DecimalFormat("##.################").format( item.getCubicinch())	+

                        "\n boardfeet - " +new DecimalFormat("##.################").format( item.getBoardfeet())
                        +"\n thousandboardfeet - " +new DecimalFormat("##.################").format( item.getThousandboardfeet())+

                        "\n cord - " +new DecimalFormat("##.################").format( item.getCord())	+
                        "\n cord80cubicft - " +new DecimalFormat("##.################").format( item.getCord80cubicft())
                        +	"\n cordfeet - " +new DecimalFormat("##.################").format( item.getCordfeet())+

                        "\n cunit - " +new DecimalFormat("##.################").format( item.getCunit())+
                        "\n pallet - " +new DecimalFormat("##.################").format( item.getPallet())
                        +
                        "\n crosstie - " +new DecimalFormat("##.################").format( item.getCrosstie())+
                        "\n switchtie - " +new DecimalFormat("##.################").format( item.getSwitchtie())
                        +
                        "\n thousandsquarefeet1of8inch - " +new DecimalFormat("##.################").format
                        ( item.getThousandsquarefeet1of8inch())

                        +

                        "\n thousandsquarefeet1of4inch - "
                        + "" +new DecimalFormat("##.################").format( item.getThousandsquarefeet1of4inch())
                        +
                        "\n thousandsquarefeet3of8inch - "
                        + "" +new DecimalFormat("##.################").format( item.getThousandsquarefeet3of8inch())
                        +"\n thousandsquarefeet1of2inch - "
                        + "" +new DecimalFormat("##.################").format( item.getThousandsquarefeet1of2inch())
                        +
                        "\n thousandsquarefeet3of4inch - "
                        + "" +new DecimalFormat("##.################").format( item.getThousandsquarefeet3of4inch())


                );


            }
        }
    }
*/
}
