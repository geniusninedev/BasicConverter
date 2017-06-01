package com.nineinfosys.basicconverter.Engin;


        import java.util.ArrayList;


public class WorkConverter {

    private double joule,kj,cal,kcal,kwh,kgfm,inlbf,ftlbf,btu;
    private double edtValue;
    private String conversionFrom;




    public WorkConverter(String conversionFrom, int edtValue) {

        this.conversionFrom = conversionFrom;
        this.edtValue = edtValue;
    }



    public ArrayList<ConversionResults> calculateworkConversion()

    {

        ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();

        ConversionResults results= new ConversionResults();

        switch(conversionFrom)

        {
            case "Joule - J":



                joule=(edtValue)*1;
                kj=(edtValue)*0.001;
                cal=(edtValue)*0.239006;
                kcal=(edtValue)*0.000239;
                kwh=(edtValue)*2.7778E-7;
                kgfm=(edtValue)*0.101972;
                inlbf=(edtValue)*8.850746;
                ftlbf=(edtValue)*0.737562;
                btu=(edtValue)*0.000948;

                break;

            case "Kilojoule - kJ":

                joule=(edtValue)*1000;
                kj=(edtValue)*1;
                cal=(edtValue)*239.005736;
                kcal=(edtValue)*0.239006;
                kwh=(edtValue)*0.000278;
                kgfm=(edtValue)*101.971621;
                inlbf=(edtValue)*8850.74579;
                ftlbf=(edtValue)*737.562149;
                btu=(edtValue)*0.947817;


                break;

            case "Calorie - cal" :

                joule=(edtValue)*4.184;
                kj=(edtValue)*0.004184;
                cal=(edtValue)*1;
                kcal=(edtValue)*0.001;
                kwh=(edtValue)*0.000001;
                kgfm=(edtValue)*0.426649;
                inlbf=(edtValue)*37.03152;
                ftlbf=(edtValue)*3.08596;
                btu=(edtValue)*0.003966;
                break;

            case "Kilocalorie - kcal":

                joule=(edtValue)*4184;
                kj=(edtValue)*4.184;
                cal=(edtValue)*1000;
                kcal=(edtValue)*1;
                kwh=(edtValue)*0.001162;
                kgfm=(edtValue)*426.649264;
                inlbf=(edtValue)*37031.5204;
                ftlbf=(edtValue)*3085.96003;
                btu=(edtValue)*3.965667;


                break;

            case "Kilowatt hour - kw*h":

                joule=(edtValue)*3600000;
                kj=(edtValue)*3600;
                cal=(edtValue)*860420.65;
                kcal=(edtValue)*860.42065;
                kwh=(edtValue)*1;
                kgfm=(edtValue)*367097.837;
                inlbf=(edtValue)*31862684.8;
                ftlbf=(edtValue)*2655223.74;
                btu=(edtValue)*3412.14163;

                break;

            case "Kilogram force meter - kgf*m":

                joule=(edtValue)*9.80665;
                kj=(edtValue)*0.009807;
                cal=(edtValue)*2.343846;
                kcal=(edtValue)*0.002344;
                kwh=(edtValue)*0.000003;
                kgfm=(edtValue)*1;
                inlbf=(edtValue)*86.796166;
                ftlbf=(edtValue)*7.233014;
                btu=(edtValue)*0.009295;



                break;

            case "Inch pound - in*lbf":

                joule=(edtValue)*0.112985;
                kj=(edtValue)*0.000113;
                cal=(edtValue)*0.027004;
                kcal=(edtValue)*0.000027;
                kwh=(edtValue)*3.1385E-8;
                kgfm=(edtValue)*0.011521;
                inlbf=(edtValue)*1;
                ftlbf=(edtValue)*0.083333;
                btu=(edtValue)*0.000107;



                break;

            case "Foot pound - ft*lbf" :

                joule=(edtValue)*1.355818;
                kj=(edtValue)*0.001356;
                cal=(edtValue)*0.324048;
                kcal=(edtValue)*0.000324;
                kwh=(edtValue)*3.7662E-7;
                kgfm=(edtValue)*0.138255;
                inlbf=(edtValue)*12;
                ftlbf=(edtValue)*1;
                btu=(edtValue)*0.001285;

                break;

            case "Btu - btu":
                joule=(edtValue)*1055.05585;
                kj=(edtValue)*1.055056;
                cal=(edtValue)*252.164401;
                kcal=(edtValue)*0.252164;
                kwh=(edtValue)*0.000293;
                kgfm=(edtValue)*107.585756;
                inlbf=(edtValue)*9338.03115;
                ftlbf=(edtValue)*778.169262;
                btu=(edtValue)*1;

                break;



        }
        results.setJoule(joule);
        results.setKj(kj);
        results.setCal(cal);
        results.setKcal(kcal);
        results.setKwh(kwh);
        results.setKgfm(kgfm);
        results.setInlbf(inlbf);
        results.setFtlbf(ftlbf);
        results.setBtu(btu);


        converterArray.add(results);

        return converterArray;


    }
    public class ConversionResults{

        private double joule,kj,cal,kcal,kwh,kgfm,inlbf,ftlbf,btu;

        public double getJoule() {
            return joule;
        }

        public void setJoule(double joule) {
            this.joule = joule;
        }

        public double getKj() {
            return kj;
        }

        public void setKj(double kj) {
            this.kj = kj;
        }

        public double getCal() {
            return cal;
        }

        public void setCal(double cal) {
            this.cal = cal;
        }

        public double getKcal() {
            return kcal;
        }

        public void setKcal(double kcal) {
            this.kcal = kcal;
        }

        public double getKwh() {
            return kwh;
        }

        public void setKwh(double kwh) {
            this.kwh = kwh;
        }

        public double getKgfm() {
            return kgfm;
        }

        public void setKgfm(double kgfm) {
            this.kgfm = kgfm;
        }

        public double getInlbf() {
            return inlbf;
        }

        public void setInlbf(double inlbf) {
            this.inlbf = inlbf;
        }

        public double getFtlbf() {
            return ftlbf;
        }

        public void setFtlbf(double ftlbf) {
            this.ftlbf = ftlbf;
        }

        public double getBtu() {
            return btu;
        }

        public void setBtu(double btu) {
            this.btu = btu;
        }


    }
}
