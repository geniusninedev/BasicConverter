package com.nineinfosys.basicconverter.Engin;

import java.util.ArrayList;


public class DataTransferConverter {

    private double bitpersecond,bytepersecond, kilobitpersecondSI,kilobytepersecondSI,kilobitpersecond,

    kilobytepersecond,megabitpersecondSI,megabytepersecondSI,megabitpersecond,megabytepersecond,

    gigabitpersecondSI,gigabytepersecondSI,gigabitpersecond,gigabytepersecond,terabitpersecondSI,

    terabytepersecondSI,terabitpersecond,terabytepersecond,ethernet,ethernetfast,ethernetgigabit,OC1,

    OC3,OC12,OC24,OC48,OC192,OC768,ISDNsinglechannel,ISDNdualchannel,modem110,modem300,modem1200,

    modem2400,modem9600 ,modem14k,modem28k,modem33k,modem56k,SCSIAsync,SCSISync,SCSIFast,SCSIFastUltra

            ,SCSIFastWide,SCSIFastUltraWide, SCSIUltra2 ,SCSIUltra3,SCSILVDUltra80 ,SCSILVDUltra160

            ,IDEPIOmode0,IDEPIOmode1,IDEPIOmode2,IDEPIOmode3,IDEPIOmode4,IDEDMAmode0,IDEDMAmode1,IDEDMAmode2

            ,IDEUDMAmode0,IDEUDMAmode1,IDEUDMAmode2,IDEUDMAmode3,IDEUDMAmode4, IDEUDMA33,IDEUDMA66,USB ,firewire ,T0payload,

    T0B8ZSpayload,T1signal,T1payload,T1Zpayload,T1Csignal,T1Cpayload,T2signal,T3signal,T3payload ,T3Zpayload

            ,T4signal, EPTA1signal,  EPTA1payload,EPTA2signal,EPTA2payload,EPTA3signal,EPTA3payload

            ,H0 ,H11 ,H12 ,VirtualTributary1signal,VirtualTributary1payload,VirtualTributary2signal,VirtualTributary2payload

            ,VirtualTributary6signal,VirtualTributary6payload,STS1signal,STS1payload,STS3signal,STS3payload,STS3csignal,STS3cpayload

            ,STS12signal,STS24signal,STS48signal,STS192signal, STM1signal ,STM4signal,STM16signal,STM64signal;

    private double edtValue;
    private String conversionFrom;

    public DataTransferConverter(String conversionFrom, int edtValue) {
        // TODO Auto-generated constructor stub
        this.conversionFrom = conversionFrom;
        this.edtValue = edtValue;
    }


    public ArrayList<ConversionResults> calculateDataTransferConversions()
    {

        ArrayList<ConversionResults> converterArray = new ArrayList<ConversionResults>();

        ConversionResults results= new ConversionResults();

        switch(conversionFrom)
        {
            case "Bit/second - b/s":
                 BitPerSecond();

                break;


            case "Byte/second - B/s":

                 Bytepersecond();

                break;

            case "Kilobit/second(SI def.)":
                KilobitpersecondSI();

                break;

            case "Kilobyte/second(SI def.)":
                KilobytepersecondSI();
                break;


            case "Kilobit/second - kb/s":
                Kilobitpersecond();

                break;


            case "Kilobyte/second - kB/s":
                Kilobytepersecond();
                break;


            case "Megabit/second(SI def.)":
                MegabitpersecondSI();
                break;

            case "Megabyte/second(SI def.)":
                MegabytepersecondSI();
                break;



            case "Megabit/second - Mb/s":
                  Megabitpersecond();
                break;

            case "Megabyte/second - MB/s":
                Megabytepersecond();
                break;

            case "Gigabit/second(SI def.)":
              GigabitpersecondSI();
                break;

            case "Gigabyte/second(SI def.)":
                GigabytepersecondSI();
                break;


            case "Gigabit/second - Gb/s":
                Gigabitpersecond();
                break;


            case "Gigabyte/second - GB/s":
                Gigabytepersecond();
                break;

            case "Terabit/second(SI def.)":
               TerabitpersecondSI();
                break;

            case "Terabyte/second(SI def.)":
                TerabytepersecondSI();
                break;


            case "Terabit/second - Tb/s":
                Terabitpersecond();
                break;

            case "Terabyte/second - TB/S":
                Terabytepersecond();
                break;

            case "Ethernet":
                ethernet();
                break;

            case "Ethernet(fast)":
                Ethernetfast();

                break;
            case "Ethernet(gigabit)":
                ethernetgigabit();

                break;
            case "OC1":
                oc1();
                break;

            case "OC3":
                oc3();
                break;

            case "OC12":
                oc12();
                break;

            case "OC24":
                oc24();
                break;

            case "OC48":
                oc48();
                break;

            case "OC192":
                oc192();
                break;

            case "OC768":
                oc768();
                break;

            case "ISDN (single channel)":
                ISDNsinglechannel();
                break;


            case "ISDN(dual channel)":
                ISDNdualchannel();


                break;
            case "Modem(110)":
                Modem110();
                break;


            case "Modem(300)":
                Modem300();

                break;

            case "Modem(1200)":
                Modem1200();
                break;


            case "Modem(2400)":
                Modem2400();
                break;

            case "Modem(9600)" :
                Modem9600();
                break;


            case "Modem(14.4k)":
                Modem14();


                break;


            case "Modem(28.8k)":
                Modem28();

                break;

            case "Modem(33.6k)":
                Modem33();

                break;



            case "Modem(56k)":
                Modem56k();


                break;

            case "SCSI(Async)":
                SCSIAsync();


                break;

            case "SCSI(Sync)":
                SCSISync();
                break;



            case "SCSI(Fast)" :
                SCSIFast();
                break;


            case "SCSI(Fast Ultra)":
                SCSIFastUltra();
                break;


            case "SCSI(Fast Wide)":
                SCSIFastWide();
                break;


            case "SCSI(Fast Ultra Wide)":
                SCSIFastUltraWide();
                break;

            case "SCSI(Ultra-2)":
                SCSIUltra2();
                break;



            case "SCSI(Ultra-3)":
                SCSIUltra3();
                break;


            case "SCSI(LVD Ultra 80)":
                SCSILVDUltra80();
                break;

            case "SCSI(LVD Ultra 160)":
                SCSILVDUltra160();


                break;
            case "IDE(PIO mode 0)":
                IDEPIOmode0();
                break;

            case "IDE(PIO mode 1)":
                IDEPIOmode1();
                break;


            case "IDE(PIO mode 2)" :
                IDEPIOmode2();
                break;


            case "IDE(PIO mode 3)":
                IDEPIOmode3();
                break;

            case "IDE(PIO mode 4)":
                IDEPIOmode4();
                break;

            case "IDE(DMA mode 0)":
                IDEDMAmode0();
                break;

            case "IDE(DMA mode 1)":
                IDEDMAmode1();


                break;

            case "IDE(DMA mode 2)":
                IDEDMAmode2();
                break;


            case "IDE(UDMA mode 0)":
                IDEUDMAmode0();


                break;
            case "IDE(UDMAmode 1)":
                IDEUDMAmode1();


                break;
            case "IDE(UDMA mode 2)":
                IDEUDMAmode2();


                break;

            case "IDE(UDMA mode 3)":
                IDEUDMAmode3();


                break;
            case "IDE(UDMA mode 4)":
                IDEUDMAmode4();

                break;

            case "IDE(UDMA 33)":
                IDEUDMA33();


                break;

            case "IDE(UDMA 66)":
                IDEUDMA66();
                break;

            case "USB":
                USB();
                break;

            case "Firewire(IEEE-1394)" :
                FirewireIEEE1394();

                break;

            case "T0(payload)":
                T0payload();


                break;

            case "T0(B8ZS payload)":
                T0B8ZSpayload();
                break;

            case "T1(signal)":
                T1signal();



                break;

            case "T1(payload)":
                T1payload();



                break;


            case "T1Z(payload)":

                bitpersecond=(edtValue)*1544000;

                bytepersecond=(edtValue)*193000;

                kilobitpersecondSI=(edtValue)*1544;

                kilobytepersecondSI=(edtValue)*193;

                kilobitpersecond=(edtValue)*1507.8125;

                kilobytepersecond=(edtValue)*188.4765625;

                megabitpersecondSI=(edtValue)*1.544;

                megabytepersecondSI=(edtValue)*0.193;

                megabitpersecond=(edtValue)*1.4724731445;

                megabytepersecond=(edtValue)*0.1840591431;

                gigabitpersecondSI=(edtValue)*0.001544;

                gigabytepersecondSI=(edtValue)*0.000193;

                gigabitpersecond=(edtValue)*0.0014379621;

                gigabytepersecond=(edtValue)*0.0001797453;

                terabitpersecondSI=(edtValue)*0.000001544;

                terabytepersecondSI=(edtValue)*1.93E-7;

                terabitpersecond=(edtValue)*0.0000014043;

                terabytepersecond=(edtValue)*1.755324774E-7;

                ethernet=(edtValue)*0.1544;

                ethernetfast=(edtValue)*0.01544;

                ethernetgigabit=(edtValue)*0.001544;

                OC1=(edtValue)*0.0297839506;

                OC3=(edtValue)*0.0099279835;

                OC12=(edtValue)*0.0024819959;

                OC24=(edtValue)*0.0012409979;

                OC48=(edtValue)*0.000620499;

                OC192=(edtValue)*0.0001551247;

                OC768=(edtValue)*0.0000387812;

                ISDNsinglechannel=(edtValue)*24.125;

                ISDNdualchannel=(edtValue)*12.0625;

                modem110=(edtValue)*14036.363636;

                modem300=(edtValue)*5146.6666667;

                modem1200=(edtValue)*1286.6666667;

                modem2400=(edtValue)*643.33333333;

                modem9600=(edtValue)*160.83333333;

                modem14k=(edtValue)*107.22222222;

                modem28k=(edtValue)*53.611111111;

                modem33k=(edtValue)*45.952380952;

                modem56k=(edtValue)*27.571428571;

                SCSIAsync=(edtValue)*0.1286666667;

                SCSISync=(edtValue)*0.0386;

                SCSIFast=(edtValue)*0.0193;

                SCSIFastUltra=(edtValue)*0.00965;


                SCSIFastWide=(edtValue)*0.00965;

                SCSIFastUltraWide=(edtValue)*0.004825;

                SCSIUltra2=(edtValue)*0.0024125;

                SCSIUltra3=(edtValue)*0.00120625;

                SCSILVDUltra80=(edtValue)*0.0024125;


                SCSILVDUltra160=(edtValue)*0.00120625;

                IDEPIOmode0=(edtValue)*0.0584848485;

                IDEPIOmode1=(edtValue)*0.0371153846;

                IDEPIOmode2=(edtValue)*0.023253012;

                IDEPIOmode3=(edtValue)*0.0173873874;

                IDEPIOmode4=(edtValue)*0.011626506;

                IDEDMAmode0=(edtValue)*0.045952381;

                IDEDMAmode1=(edtValue)*0.0145112782;

                IDEDMAmode2=(edtValue)*0.011626506;

                IDEUDMAmode0=(edtValue)*0.011626506;

                IDEUDMAmode1=(edtValue)*0.00772;

                IDEUDMAmode2=(edtValue)*0.0058484848;

                IDEUDMAmode3=(edtValue)*0.00386;

                IDEUDMAmode4=(edtValue)*0.0029242424;

                IDEUDMA33=(edtValue)*0.0058484848;

                IDEUDMA66=(edtValue)*0.0029242424;

                USB=(edtValue)*0.1286666667;

                firewire=(edtValue)*0.00386;

                T0payload=(edtValue)*27.571428571;

                T0B8ZSpayload=(edtValue)*24.125;

                T1signal=(edtValue)*1;

                T1payload=(edtValue)*1.1488095238;

                T1Zpayload=(edtValue)*1;

                T1Csignal=(edtValue)*0.4898477157;

                T1Cpayload=(edtValue)*0.5744047619;

                T2signal=(edtValue)*0.2446134347;

                T3signal=(edtValue)*0.0345135908;

                T3payload=(edtValue)*0.0410289116;

                T3Zpayload=(edtValue)*0.0359002976;

                T4signal=(edtValue)*0.0056314192;

                EPTA1signal=(edtValue)*0.75390625;

                EPTA1payload=(edtValue)*0.8041666667;

                EPTA2signal=(edtValue)*0.1827651515;

                EPTA2payload=(edtValue)*0.2010416667;

                EPTA3signal=(edtValue)*0.0449255121;

                EPTA3payload=(edtValue)*0.0502604167;

                H0=(edtValue)*4.0208333333;

                H11=(edtValue)*1.0052083333;

                H12=(edtValue)*0.8041666667;

                VirtualTributary1signal=(edtValue)*0.8935185185;

                VirtualTributary1payload=(edtValue)*1;

                VirtualTributary2signal=(edtValue)*0.6701388889;

                VirtualTributary2payload=(edtValue)*0.75390625;

                VirtualTributary6signal=(edtValue)*0.2446134347;

                VirtualTributary6payload=(edtValue)*0.2573333333;

                STS1signal=(edtValue)*0.0297839506;

                STS1payload=(edtValue)*0.0311919192;

                STS3signal=(edtValue)*0.0099279835;

                STS3payload=(edtValue)*0.0102703278;

                STS3csignal=(edtValue)*0.0099279835;

                STS3cpayload=(edtValue)*0.0102703278;

                STS12signal=(edtValue)*0.0024819959;

                STS24signal=(edtValue)*0.0012409979;

                STS48signal=(edtValue)*0.000620499;

                STS192signal=(edtValue)*0.0001551247;

                STM1signal=(edtValue)*0.0099279835;

                STM4signal=(edtValue)*0.0024819959;

                STM16signal=(edtValue)*0.000620499;

                STM64signal=(edtValue)*0.0001551247;

                break;

            case "T1C(signal)":

                bitpersecond=(edtValue)*3152000.0;

                bytepersecond=(edtValue)*394000.0;

                kilobitpersecondSI=(edtValue)*3152;

                kilobytepersecondSI=(edtValue)*394;

                kilobitpersecond=(edtValue)*3078.125;

                kilobytepersecond=(edtValue)*384.765625;

                megabitpersecondSI=(edtValue)*3.152;

                megabytepersecondSI=(edtValue)*0.394;

                megabitpersecond=(edtValue)*3.0059814453;

                megabytepersecond=(edtValue)*0.3757476807;

                gigabitpersecondSI=(edtValue)*0.003152;

                gigabytepersecondSI=(edtValue)*0.000394;

                gigabitpersecond=(edtValue)*0.0029355288;

                gigabytepersecond=(edtValue)*0.0003669411;

                terabitpersecondSI=(edtValue)*0.000003152;

                terabytepersecondSI=(edtValue)*3.94E-7;

                terabitpersecond=(edtValue)*0.0000028667;

                terabytepersecond=(edtValue)*3.583409124E-7;

                ethernet=(edtValue)*0.3152;

                ethernetfast=(edtValue)*0.03152;

                ethernetgigabit=(edtValue)*0.003152;

                OC1=(edtValue)*0.0608024691;

                OC3=(edtValue)*0.0202674897;

                OC12=(edtValue)*0.0050668724;

                OC24=(edtValue)*0.0025334362;

                OC48=(edtValue)*0.0012667181;

                OC192=(edtValue)*0.0003166795;

                OC768=(edtValue)*0.0000791699;

                ISDNsinglechannel=(edtValue)*49.25;

                ISDNdualchannel=(edtValue)*24.625;

                modem110=(edtValue)*28654.545455;

                modem300=(edtValue)*10506.666667;

                modem1200=(edtValue)*2626.6666667;

                modem2400=(edtValue)*1313.3333333;

                modem9600=(edtValue)*328.33333333;

                modem14k=(edtValue)*218.88888889;

                modem28k=(edtValue)*109.44444444;

                modem33k=(edtValue)*93.80952381;

                modem56k=(edtValue)*56.285714286;

                SCSIAsync=(edtValue)*0.2626666667;

                SCSISync=(edtValue)*0.0788;

                SCSIFast=(edtValue)*0.0394;

                SCSIFastUltra=(edtValue)*0.0197;


                SCSIFastWide=(edtValue)*0.0197;

                SCSIFastUltraWide=(edtValue)*0.00985;

                SCSIUltra2=(edtValue)*0.004925;

                SCSIUltra3=(edtValue)*0.0024625;

                SCSILVDUltra80=(edtValue)*0.004925;


                SCSILVDUltra160=(edtValue)*0.0024625;

                IDEPIOmode0=(edtValue)*0.1193939394;

                IDEPIOmode1=(edtValue)*0.0757692308;

                IDEPIOmode2=(edtValue)*0.0474698795;

                IDEPIOmode3=(edtValue)*0.0354954955;

                IDEPIOmode4=(edtValue)*0.0237349398;

                IDEDMAmode0=(edtValue)*0.0938095238;

                IDEDMAmode1=(edtValue)*0.0296240602;

                IDEDMAmode2=(edtValue)*0.0237349398;

                IDEUDMAmode0=(edtValue)*0.0237349398;

                IDEUDMAmode1=(edtValue)*0.01576;

                IDEUDMAmode2=(edtValue)*0.0119393939;

                IDEUDMAmode3=(edtValue)*0.00788;

                IDEUDMAmode4=(edtValue)*0.005969697;

                IDEUDMA33=(edtValue)*0.0119393939;

                IDEUDMA66=(edtValue)*0.005969697;

                USB=(edtValue)*0.2626666667;

                firewire=(edtValue)*0.00788;

                T0payload=(edtValue)*56.285714286;

                T0B8ZSpayload=(edtValue)*49.25;

                T1signal=(edtValue)*2.0414507772;

                T1payload=(edtValue)*2.3452380952;

                T1Zpayload=(edtValue)*2.0414507772;

                T1Csignal=(edtValue)*1;

                T1Cpayload=(edtValue)*1.1726190476;

                T2signal=(edtValue)*0.4993662864;

                T3signal=(edtValue)*0.0704577969;

                T3payload=(edtValue)*0.0837585034;

                T3Zpayload=(edtValue)*0.0732886905;

                T4signal=(edtValue)*0.0114962652;

                EPTA1signal=(edtValue)*1.5390625;

                EPTA1payload=(edtValue)*1.6416666667;

                EPTA2signal=(edtValue)*0.3731060606;

                EPTA2payload=(edtValue)*0.4104166667;

                EPTA3signal=(edtValue)*0.0917132216;

                EPTA3payload=(edtValue)*0.1026041667;

                H0=(edtValue)*8.2083333333;

                H11=(edtValue)*2.0520833333;

                H12=(edtValue)*1.6416666667;

                VirtualTributary1signal=(edtValue)*1.8240740741;

                VirtualTributary1payload=(edtValue)*2.0414507772;

                VirtualTributary2signal=(edtValue)*1.3680555556;

                VirtualTributary2payload=(edtValue)*1.5390625;

                VirtualTributary6signal=(edtValue)*0.4993662864;

                VirtualTributary6payload=(edtValue)*0.5253333333;

                STS1signal=(edtValue)*0.0608024691;

                STS1payload=(edtValue)*0.0608024691;

                STS3signal=(edtValue)*0.0202674897;

                STS3payload=(edtValue)*0.0209663687;

                STS3csignal=(edtValue)*0.0202674897;

                STS3cpayload=(edtValue)*0.0209663687;

                STS12signal=(edtValue)*0.0050668724;

                STS24signal=(edtValue)*0.0025334362;

                STS48signal=(edtValue)*0.0012667181;

                STS192signal=(edtValue)*0.0003166795;

                STM1signal=(edtValue)*0.0202674897;

                STM4signal=(edtValue)*0.0050668724;

                STM16signal=(edtValue)*0.0012667181;

                STM64signal=(edtValue)*0.0003166795;

                break;

            case "T1C(payload)":

                bitpersecond=(edtValue)*2688000.0;

                bytepersecond=(edtValue)*336000.0;

                kilobitpersecondSI=(edtValue)*2688;

                kilobytepersecondSI=(edtValue)*336;

                kilobitpersecond=(edtValue)*2625;

                kilobytepersecond=(edtValue)*328.125;

                megabitpersecondSI=(edtValue)*2.688;

                megabytepersecondSI=(edtValue)*0.336;

                megabitpersecond=(edtValue)*2.5634765625;

                megabytepersecond=(edtValue)*0.3204345703;

                gigabitpersecondSI=(edtValue)*0.002688;

                gigabytepersecondSI=(edtValue)*0.000336;

                gigabitpersecond=(edtValue)*0.0025033951;

                gigabytepersecond=(edtValue)*0.0003129244;

                terabitpersecondSI=(edtValue)*0.000002688;

                terabytepersecondSI=(edtValue)*3.359999999E-7;

                terabitpersecond=(edtValue)*0.0000024447;

                terabytepersecond=(edtValue)*3.055902197E-7;

                ethernet=(edtValue)*0.2688;

                ethernetfast=(edtValue)*0.02688;

                ethernetgigabit=(edtValue)*0.002688;

                OC1=(edtValue)*0.0518518519;

                OC3=(edtValue)*0.0172839506;

                OC12=(edtValue)*0.0043209877;

                OC24=(edtValue)*0.0021604938;

                OC48=(edtValue)*0.0010802469;

                OC192=(edtValue)*0.0002700617;

                OC768=(edtValue)*0.0000675154;

                ISDNsinglechannel=(edtValue)*42;

                ISDNdualchannel=(edtValue)*21;

                modem110=(edtValue)*24436.363636;

                modem300=(edtValue)*8960;

                modem1200=(edtValue)*2240;

                modem2400=(edtValue)*1120;

                modem9600=(edtValue)*280;

                modem14k=(edtValue)*186.66666667;

                modem28k=(edtValue)*93.333333333;

                modem33k=(edtValue)*80;

                modem56k=(edtValue)*48;

                SCSIAsync=(edtValue)*0.224;

                SCSISync=(edtValue)*0.0672;

                SCSIFast=(edtValue)*0.0336;

                SCSIFastUltra=(edtValue)*0.0168;


                SCSIFastWide=(edtValue)*0.0168;

                SCSIFastUltraWide=(edtValue)*0.0084;

                SCSIUltra2=(edtValue)*0.0042;

                SCSIUltra3=(edtValue)*0.0021;

                SCSILVDUltra80=(edtValue)*0.0042;


                SCSILVDUltra160=(edtValue)*0.0021;

                IDEPIOmode0=(edtValue)*0.1018181818;

                IDEPIOmode1=(edtValue)*0.0646153846;

                IDEPIOmode2=(edtValue)*0.0404819277;

                IDEPIOmode3=(edtValue)*0.0302702703;

                IDEPIOmode4=(edtValue)*0.0202409639;

                IDEDMAmode0=(edtValue)*0.08;

                IDEDMAmode1=(edtValue)*0.0252631579;

                IDEDMAmode2=(edtValue)*0.0202409639;

                IDEUDMAmode0=(edtValue)*0.0202409639;

                IDEUDMAmode1=(edtValue)*0.01344;

                IDEUDMAmode2=(edtValue)*0.0101818182;

                IDEUDMAmode3=(edtValue)*0.00672;

                IDEUDMAmode4=(edtValue)*0.0050909091;

                IDEUDMA33=(edtValue)*0.0101818182;

                IDEUDMA66=(edtValue)*0.0050909091;

                USB=(edtValue)*0.224;

                firewire=(edtValue)*0.00672;

                T0payload=(edtValue)*48;

                T0B8ZSpayload=(edtValue)*42;

                T1signal=(edtValue)*1.7409326425;

                T1payload=(edtValue)*2;

                T1Zpayload=(edtValue)*1.7409326425;

                T1Csignal=(edtValue)*0.8527918782;

                T1Cpayload=(edtValue)*1;

                T2signal=(edtValue)*0.4258555133;

                T3signal=(edtValue)*0.0600858369;

                T3payload=(edtValue)*0.0714285714;

                T3Zpayload=(edtValue)*0.0625;

                T4signal=(edtValue)*0.0098039216;

                EPTA1signal=(edtValue)*1.3125;

                EPTA1payload=(edtValue)*1.4;

                EPTA2signal=(edtValue)*0.3181818182;

                EPTA2payload=(edtValue)*0.35;

                EPTA3signal=(edtValue)*0.0782122905;

                EPTA3payload=(edtValue)*0.0875;

                H0=(edtValue)*7;

                H11=(edtValue)*1.75;

                H12=(edtValue)*1.4;

                VirtualTributary1signal=(edtValue)*1.5555555556;

                VirtualTributary1payload=(edtValue)*1.7409326425;

                VirtualTributary2signal=(edtValue)*1.1666666667;

                VirtualTributary2payload=(edtValue)*1.3125;

                VirtualTributary6signal=(edtValue)*0.4258555133;

                VirtualTributary6payload=(edtValue)*0.448;

                STS1signal=(edtValue)*0.0518518519;

                STS1payload=(edtValue)*0.0543030303;

                STS3signal=(edtValue)*0.0172839506;

                STS3payload=(edtValue)*0.0178799489;

                STS3csignal=(edtValue)*0.0043209877;

                STS3cpayload=(edtValue)*0.0021604938;

                STS12signal=(edtValue)*0.0010802469;

                STS24signal=(edtValue)*0.0002700617;

                STS48signal=(edtValue)*0.0010802469;

                STS192signal=(edtValue)*0.0002700617;

                STM1signal=(edtValue)*0.0172839506;

                STM4signal=(edtValue)*0.0043209877;

                STM16signal=(edtValue)*0.0010802469;

                STM64signal=(edtValue)*0.0002700617;

                break;

            case "T2(signal)":

                bitpersecond=(edtValue)*6312000.0;

                bytepersecond=(edtValue)*789000;

                kilobitpersecondSI=(edtValue)*6312;

                kilobytepersecondSI=(edtValue)*789;

                kilobitpersecond=(edtValue)*6164.0625;

                kilobytepersecond=(edtValue)*770.5078125;

                megabitpersecondSI=(edtValue)*6.312;

                megabytepersecondSI=(edtValue)*0.789;

                megabitpersecond=(edtValue)*6.0195922852;

                megabytepersecond=(edtValue)*0.7524490356;

                gigabitpersecondSI=(edtValue)*0.7524490356;

                gigabytepersecondSI=(edtValue)*0.000789;

                gigabitpersecond=(edtValue)*0.0058785081;

                gigabytepersecond=(edtValue)*0.0007348135;

                terabitpersecondSI=(edtValue)*0.000006312;

                terabytepersecondSI=(edtValue)*7.89E-7;

                terabitpersecond=(edtValue)*0.0000057407;

                terabytepersecond=(edtValue)*7.175913196E-7;

                ethernet=(edtValue)*0.6312;

                ethernetfast=(edtValue)*0.06312;

                ethernetgigabit=(edtValue)*0.006312;

                OC1=(edtValue)*0.1217592593;

                OC3=(edtValue)*0.0405864198;

                OC12=(edtValue)*0.0101466049;

                OC24=(edtValue)*0.0050733025;

                OC48=(edtValue)*0.0025366512;

                OC192=(edtValue)*0.0025366512;

                OC768=(edtValue)*0.0001585407;

                ISDNsinglechannel=(edtValue)*98.625;

                ISDNdualchannel=(edtValue)*49.3125;

                modem110=(edtValue)*57381.818182;

                modem300=(edtValue)*21040;

                modem1200=(edtValue)*5260;

                modem2400=(edtValue)*2630;

                modem9600=(edtValue)*657.5;

                modem14k=(edtValue)*438.33333333;

                modem28k=(edtValue)*219.16666667;

                modem33k=(edtValue)*187.85714286;

                modem56k=(edtValue)*112.71428571;

                SCSIAsync=(edtValue)*0.526;

                SCSISync=(edtValue)*0.1578;

                SCSIFast=(edtValue)*0.0789;

                SCSIFastUltra=(edtValue)*0.03945;


                SCSIFastWide=(edtValue)*0.03945;

                SCSIFastUltraWide=(edtValue)*0.019725;

                SCSIUltra2=(edtValue)*0.0098625;

                SCSIUltra3=(edtValue)*0.00493125;

                SCSILVDUltra80=(edtValue)*0.0098625;


                SCSILVDUltra160=(edtValue)*0.00493125;

                IDEPIOmode0=(edtValue)*0.2390909091;

                IDEPIOmode1=(edtValue)*0.1517307692;

                IDEPIOmode2=(edtValue)*0.095060241;

                IDEPIOmode3=(edtValue)*0.0710810811;

                IDEPIOmode4=(edtValue)*0.0475301205;

                IDEDMAmode0=(edtValue)*0.1878571429;

                IDEDMAmode1=(edtValue)*0.0593233083;

                IDEDMAmode2=(edtValue)*0.0475301205;

                IDEUDMAmode0=(edtValue)*0.0475301205;

                IDEUDMAmode1=(edtValue)*0.03156;

                IDEUDMAmode2=(edtValue)*0.0239090909;

                IDEUDMAmode3=(edtValue)*0.01578;

                IDEUDMAmode4=(edtValue)*0.0119545455;

                IDEUDMA33=(edtValue)*0.0239090909;

                IDEUDMA66=(edtValue)*0.0119545455;

                USB=(edtValue)*0.526;

                firewire=(edtValue)*0.01578;

                T0payload=(edtValue)*112.71428571;

                T0B8ZSpayload=(edtValue)*98.625;

                T1signal=(edtValue)*4.0880829016;

                T1payload=(edtValue)*4.6964285714;

                T1Zpayload=(edtValue)*4.0880829016;

                T1Csignal=(edtValue)*2.0025380711;

                T1Cpayload=(edtValue)*2.3482142857;

                T2signal=(edtValue)*1;

                T3signal=(edtValue)*0.1410944206;

                T3payload=(edtValue)*0.1677295918;

                T3Zpayload=(edtValue)*0.1467633929;

                T4signal=(edtValue)*0.0230217087;

                EPTA1signal=(edtValue)*3.08203125;

                EPTA1payload=(edtValue)*3.2875;

                EPTA2signal=(edtValue)*0.7471590909;

                EPTA2payload=(edtValue)*0.821875;

                EPTA3signal=(edtValue)*0.1836592179;

                EPTA3payload=(edtValue)*0.20546875;

                H0=(edtValue)*16.4375;

                H11=(edtValue)*4.109375;

                H12=(edtValue)*3.2875;

                VirtualTributary1signal=(edtValue)*3.6527777778;

                VirtualTributary1payload=(edtValue)*4.0880829016;

                VirtualTributary2signal=(edtValue)*2.7395833333;

                VirtualTributary2payload=(edtValue)*3.08203125;

                VirtualTributary6signal=(edtValue)*1;

                VirtualTributary6payload=(edtValue)*1.052;

                STS1signal=(edtValue)*0.1217592593;

                STS1payload=(edtValue)*0.1275151515;

                STS3signal=(edtValue)*0.0405864198;

                STS3payload=(edtValue)*0.0419859515;

                STS3csignal=(edtValue)*0.0405864198;

                STS3cpayload=(edtValue)*0.0419859515;

                STS12signal=(edtValue)*0.0101466049;

                STS24signal=(edtValue)*0.0050733025;

                STS48signal=(edtValue)*0.0025366512;

                STS192signal=(edtValue)*0.0006341628;

                STM1signal=(edtValue)*0.0405864198;

                STM4signal=(edtValue)*0.0101466049;

                STM16signal=(edtValue)*0.0025366512;

                STM64signal=(edtValue)*0.0006341628;

                break;

            case "T3(signal)":

                bitpersecond=(edtValue)*44736000.0;

                bytepersecond=(edtValue)*5592000.0;

                kilobitpersecondSI=(edtValue)*44736;

                kilobytepersecondSI=(edtValue)*5592;

                kilobitpersecond=(edtValue)*43687.5;

                kilobytepersecond=(edtValue)*5460.9375;

                megabitpersecondSI=(edtValue)*44.736;

                megabytepersecondSI=(edtValue)*5.592;

                megabitpersecond=(edtValue)*42.663574219;

                megabytepersecond=(edtValue)*5.3329467773;

                gigabitpersecondSI=(edtValue)*0.044736;

                gigabytepersecondSI=(edtValue)*0.005592;

                gigabitpersecond=(edtValue)*0.0416636467;

                gigabytepersecond=(edtValue)*0.0052079558;

                terabitpersecondSI=(edtValue)*0.000044736;

                terabytepersecondSI=(edtValue)*0.000005592;

                terabitpersecond=(edtValue)*0.0000406872;

                terabytepersecond=(edtValue)*0.0000050859;

                ethernet=(edtValue)*4.4736;

                ethernetfast=(edtValue)*0.44736;

                ethernetgigabit=(edtValue)*0.044736;

                OC1=(edtValue)*0.862962963;

                OC3=(edtValue)*0.287654321;

                OC12=(edtValue)*0.0719135802;

                OC24=(edtValue)*0.0359567901;

                OC48=(edtValue)*0.0179783951;

                OC192=(edtValue)*0.0044945988;

                OC768=(edtValue)*0.0011236497;

                ISDNsinglechannel=(edtValue)*699;

                ISDNdualchannel=(edtValue)*349.5;

                modem110=(edtValue)*406690.90909;

                modem300=(edtValue)*149120;

                modem1200=(edtValue)*37280;

                modem2400=(edtValue)*18640;

                modem9600=(edtValue)*4660;

                modem14k=(edtValue)*3106.6666667;

                modem28k=(edtValue)*1553.3333333;

                modem33k=(edtValue)*1331.4285714;

                modem56k=(edtValue)*798.85714286;

                SCSIAsync=(edtValue)*3.728;

                SCSISync=(edtValue)*1.1184;

                SCSIFast=(edtValue)*0.5592;

                SCSIFastUltra=(edtValue)*0.2796;


                SCSIFastWide=(edtValue)*0.2796;

                SCSIFastUltraWide=(edtValue)*0.1398;

                SCSIUltra2=(edtValue)*0.0699;

                SCSIUltra3=(edtValue)*0.03495;

                SCSILVDUltra80=(edtValue)*0.0699;


                SCSILVDUltra160=(edtValue)*0.03495;

                IDEPIOmode0=(edtValue)*1.6945454545;

                IDEPIOmode1=(edtValue)*1.0753846154;

                IDEPIOmode2=(edtValue)*0.6737349398;

                IDEPIOmode3=(edtValue)*0.5037837838;

                IDEPIOmode4=(edtValue)*0.3368674699;

                IDEDMAmode0=(edtValue)*1.3314285714;

                IDEDMAmode1=(edtValue)*0.4204511278;

                IDEDMAmode2=(edtValue)*0.3368674699;

                IDEUDMAmode0=(edtValue)*0.3368674699;

                IDEUDMAmode1=(edtValue)*0.22368;

                IDEUDMAmode2=(edtValue)*0.1694545455;

                IDEUDMAmode3=(edtValue)*0.11184;

                IDEUDMAmode4=(edtValue)*0.0847272727;

                IDEUDMA33=(edtValue)*0.1694545455;

                IDEUDMA66=(edtValue)*0.0847272727;

                USB=(edtValue)*3.728;

                firewire=(edtValue)*0.11184;

                T0payload=(edtValue)*798.85714286;

                T0B8ZSpayload=(edtValue)*699;

                T1signal=(edtValue)*28.974093264;

                T1payload=(edtValue)*33.285714286;

                T1Zpayload=(edtValue)*28.974093264;

                T1Csignal=(edtValue)*14.192893401;

                T1Cpayload=(edtValue)*16.642857143;

                T2signal=(edtValue)*7.0874524715;

                T3signal=(edtValue)*1;

                T3payload=(edtValue)*1.1887755102;

                T3Zpayload=(edtValue)*1.0401785714;

                T4signal=(edtValue)*0.1631652661;

                EPTA1signal=(edtValue)*21.84375;

                EPTA1payload=(edtValue)*23.3;

                EPTA2signal=(edtValue)*5.2954545455;

                EPTA2payload=(edtValue)*5.825;

                EPTA3signal=(edtValue)*1.3016759777;

                EPTA3payload=(edtValue)*1.45625;

                H0=(edtValue)*116.5;

                H11=(edtValue)*29.125;

                H12=(edtValue)*23.3;

                VirtualTributary1signal=(edtValue)*25.888888889;

                VirtualTributary1payload=(edtValue)*28.974093264;

                VirtualTributary2signal=(edtValue)*19.416666667;

                VirtualTributary2payload=(edtValue)*21.84375;

                VirtualTributary6signal=(edtValue)*7.0874524715;

                VirtualTributary6payload=(edtValue)*7.456;

                STS1signal=(edtValue)*0.862962963;

                STS1payload=(edtValue)*0.9037575758;

                STS3signal=(edtValue)*0.287654321;

                STS3payload=(edtValue)*0.2975734355;

                STS3csignal=(edtValue)*0.287654321;

                STS3cpayload=(edtValue)*0.2975734355;

                STS12signal=(edtValue)*0.0719135802;

                STS24signal=(edtValue)*0.0359567901;

                STS48signal=(edtValue)*0.0179783951;

                STS192signal=(edtValue)*0.0044945988;

                STM1signal=(edtValue)*0.287654321;

                STM4signal=(edtValue)*0.0719135802;

                STM16signal=(edtValue)*0.0179783951;

                STM64signal=(edtValue)*0.0044945988;

                break;
            case "T3(payload)" :

                bitpersecond=(edtValue)*37632000;

                bytepersecond=(edtValue)*4704000;

                kilobitpersecondSI=(edtValue)*37632;

                kilobytepersecondSI=(edtValue)*4704;

                kilobitpersecond=(edtValue)*36750;

                kilobytepersecond=(edtValue)*4593.75;

                megabitpersecondSI=(edtValue)*37.632;

                megabytepersecondSI=(edtValue)*4.704;

                megabitpersecond=(edtValue)*35.888671875;

                megabytepersecond=(edtValue)*4.4860839844;

                gigabitpersecondSI=(edtValue)*0.037632;

                gigabytepersecondSI=(edtValue)*0.004704;

                gigabitpersecond=(edtValue)*0.0350475311;

                gigabytepersecond=(edtValue)*0.0043809414;

                terabitpersecondSI=(edtValue)*0.000037632;

                terabytepersecondSI=(edtValue)*0.000004704;

                terabitpersecond=(edtValue)*0.0000342261;

                terabytepersecond=(edtValue)*0.0000042783;

                ethernet=(edtValue)*3.7632;

                ethernetfast=(edtValue)*0.37632;

                ethernetgigabit=(edtValue)*0.037632;

                OC1=(edtValue)*0.7259259259;

                OC3=(edtValue)*0.7259259259;

                OC12=(edtValue)*0.7259259259;

                OC24=(edtValue)*0.0302469136;

                OC48=(edtValue)*0.0151234568;

                OC192=(edtValue)*0.0151234568;

                OC768=(edtValue)*0.000945216;

                ISDNsinglechannel=(edtValue)*588;

                ISDNdualchannel=(edtValue)*294;

                modem110=(edtValue)*342109.09091;

                modem300=(edtValue)*125440;

                modem1200=(edtValue)*31360;

                modem2400=(edtValue)*15680;

                modem9600=(edtValue)*3920;

                modem14k=(edtValue)*2613.3333333;

                modem28k=(edtValue)*1306.6666667;

                modem33k=(edtValue)*1120;

                modem56k=(edtValue)*672;

                SCSIAsync=(edtValue)*3.136;

                SCSISync=(edtValue)*0.9408;

                SCSIFast=(edtValue)*0.4704;

                SCSIFastUltra=(edtValue)*0.2352;


                SCSIFastWide=(edtValue)*0.2352;

                SCSIFastUltraWide=(edtValue)*0.1176;

                SCSIUltra2=(edtValue)*0.0588;

                SCSIUltra3=(edtValue)*0.0294;

                SCSILVDUltra80=(edtValue)*0.0588;


                SCSILVDUltra160=(edtValue)*0.0294;

                IDEPIOmode0=(edtValue)*1.4254545455;

                IDEPIOmode1=(edtValue)*0.9046153846;

                IDEPIOmode2=(edtValue)*0.566746988;

                IDEPIOmode3=(edtValue)*0.4237837838;

                IDEPIOmode4=(edtValue)*0.283373494;

                IDEDMAmode0=(edtValue)*1.12;

                IDEDMAmode1=(edtValue)*0.3536842105;

                IDEDMAmode2=(edtValue)*0.283373494;

                IDEUDMAmode0=(edtValue)*0.283373494;

                IDEUDMAmode1=(edtValue)*0.18816;

                IDEUDMAmode2=(edtValue)*0.1425454545;

                IDEUDMAmode3=(edtValue)*0.09408;

                IDEUDMAmode4=(edtValue)*0.0712727273;

                IDEUDMA33=(edtValue)*0.1425454545;

                IDEUDMA66=(edtValue)*0.0712727273;

                USB=(edtValue)*3.136;

                firewire=(edtValue)*0.09408;

                T0payload=(edtValue)*672;

                T0B8ZSpayload=(edtValue)*588;

                T1signal=(edtValue)*24.373056995;

                T1payload=(edtValue)*28;

                T1Zpayload=(edtValue)*24.373056995;

                T1Csignal=(edtValue)*11.939086294;

                T1Cpayload=(edtValue)*14;

                T2signal=(edtValue)*5.9619771863;

                T3signal=(edtValue)*0.8412017167;

                T3payload=(edtValue)*1;

                T3Zpayload=(edtValue)*0.875;

                T4signal=(edtValue)*0.137254902;

                EPTA1signal=(edtValue)*18.375;

                EPTA1payload=(edtValue)*19.6;

                EPTA2signal=(edtValue)*4.4545454545;

                EPTA2payload=(edtValue)*4.9;

                EPTA3signal=(edtValue)*1.094972067;

                EPTA3payload=(edtValue)*1.225;

                H0=(edtValue)*98;

                H11=(edtValue)*24.5;

                H12=(edtValue)*19.6;

                VirtualTributary1signal=(edtValue)*21.777777778;

                VirtualTributary1payload=(edtValue)*21.777777778;

                VirtualTributary2signal=(edtValue)*16.333333333;

                VirtualTributary2payload=(edtValue)*18.375;

                VirtualTributary6signal=(edtValue)*5.9619771863;

                VirtualTributary6payload=(edtValue)*6.272;

                STS1signal=(edtValue)*0.7259259259;

                STS1payload=(edtValue)*0.7602424242;

                STS3signal=(edtValue)*0.2419753086;

                STS3payload=(edtValue)*0.2503192848;

                STS3csignal=(edtValue)*0.2419753086;

                STS3cpayload=(edtValue)*0.2503192848;

                STS12signal=(edtValue)*0.0604938272;

                STS24signal=(edtValue)*0.0302469136;

                STS48signal=(edtValue)*0.0151234568;

                STS192signal=(edtValue)*0.0037808642;

                STM1signal=(edtValue)*0.2419753086;

                STM4signal=(edtValue)*0.0604938272;

                STM16signal=(edtValue)*0.0151234568;

                STM64signal=(edtValue)*0.0037808642;

                break;


            case "T3Z(payload)" :

                bitpersecond=(edtValue)*43008000;

                bytepersecond=(edtValue)*5376000.0;

                kilobitpersecondSI=(edtValue)*43008;

                kilobytepersecondSI=(edtValue)*5376;

                kilobitpersecond=(edtValue)*42000;

                kilobytepersecond=(edtValue)*5250;

                megabitpersecondSI=(edtValue)*43.008;

                megabytepersecondSI=(edtValue)*5.376;

                megabitpersecond=(edtValue)*41.015625;

                megabytepersecond=(edtValue)*5.126953125;

                gigabitpersecondSI=(edtValue)*0.043008;

                gigabytepersecondSI=(edtValue)*0.005376;

                gigabitpersecond=(edtValue)*0.0400543213;

                gigabytepersecond=(edtValue)*0.0050067902;

                terabitpersecondSI=(edtValue)*0.000043008;

                terabytepersecondSI=(edtValue)*0.000005376;

                terabitpersecond=(edtValue)*0.0000391155;

                terabytepersecond=(edtValue)*0.0000048894;

                ethernet=(edtValue)*4.3008;

                ethernetfast=(edtValue)*0.43008;

                ethernetgigabit=(edtValue)*0.043008;

                OC1=(edtValue)*0.8296296296;

                OC3=(edtValue)*0.2765432099;

                OC12=(edtValue)*0.0691358025;

                OC24=(edtValue)*0.0345679012;

                OC48=(edtValue)*0.0172839506;

                OC192=(edtValue)*0.0043209877;

                OC768=(edtValue)*0.0010802469;

                ISDNsinglechannel=(edtValue)*672;

                ISDNdualchannel=(edtValue)*336;

                modem110=(edtValue)*390981.81818;

                modem300=(edtValue)*143360;

                modem1200=(edtValue)*35840;

                modem2400=(edtValue)*17920;

                modem9600=(edtValue)*4480;

                modem14k=(edtValue)*2986.6666667;

                modem28k=(edtValue)*1493.3333333;

                modem33k=(edtValue)*1280;

                modem56k=(edtValue)*768;

                SCSIAsync=(edtValue)*3.584;

                SCSISync=(edtValue)*1.0752;

                SCSIFast=(edtValue)*0.5376;

                SCSIFastUltra=(edtValue)*0.2688;


                SCSIFastWide=(edtValue)*0.2688;

                SCSIFastUltraWide=(edtValue)*0.1344;

                SCSIUltra2=(edtValue)*0.0672;

                SCSIUltra3=(edtValue)*0.0336;

                SCSILVDUltra80=(edtValue)*0.0672;


                SCSILVDUltra160=(edtValue)*0.0336;

                IDEPIOmode0=(edtValue)*1.6290909091;

                IDEPIOmode1=(edtValue)*1.0338461538;

                IDEPIOmode2=(edtValue)*0.6477108434;

                IDEPIOmode3=(edtValue)*0.4843243243;

                IDEPIOmode4=(edtValue)*0.3238554217;

                IDEDMAmode0=(edtValue)*1.28;

                IDEDMAmode1=(edtValue)*0.4042105263;

                IDEDMAmode2=(edtValue)*0.3238554217;

                IDEUDMAmode0=(edtValue)*0.3238554217;

                IDEUDMAmode1=(edtValue)*0.21504;

                IDEUDMAmode2=(edtValue)*0.1629090909;

                IDEUDMAmode3=(edtValue)*0.10752;

                IDEUDMAmode4=(edtValue)*0.0814545455;

                IDEUDMA33=(edtValue)*0.1629090909;

                IDEUDMA66=(edtValue)*0.0814545455;

                USB=(edtValue)*3.584;

                firewire=(edtValue)*0.10752;

                T0payload=(edtValue)*768;

                T0B8ZSpayload=(edtValue)*672;

                T1signal=(edtValue)*27.85492228;

                T1payload=(edtValue)*32;

                T1Zpayload=(edtValue)*27.85492228;

                T1Csignal=(edtValue)*13.644670051;

                T1Cpayload=(edtValue)*16;

                T2signal=(edtValue)*6.8136882129;

                T3signal=(edtValue)*0.9613733906;

                T3payload=(edtValue)*1.1428571429;

                T3Zpayload=(edtValue)*1;

                T4signal=(edtValue)*0.1568627451;

                EPTA1signal=(edtValue)*21;

                EPTA1payload=(edtValue)*22.4;

                EPTA2signal=(edtValue)*5.0909090909;

                EPTA2payload=(edtValue)*5.6;

                EPTA3signal=(edtValue)*1.251396648;

                EPTA3payload=(edtValue)*1.4;

                H0=(edtValue)*112;

                H11=(edtValue)*28;

                H12=(edtValue)*22.4;

                VirtualTributary1signal=(edtValue)*24.888888889;

                VirtualTributary1payload=(edtValue)*27.85492228;

                VirtualTributary2signal=(edtValue)*18.666666667;

                VirtualTributary2payload=(edtValue)*21;

                VirtualTributary6signal=(edtValue)*6.8136882129;

                VirtualTributary6payload=(edtValue)*7.168;

                STS1signal=(edtValue)*0.8296296296;

                STS1payload=(edtValue)*0.8688484848;

                STS3signal=(edtValue)*0.2765432099;

                STS3payload=(edtValue)*0.2860791826;

                STS3csignal=(edtValue)*0.2765432099;

                STS3cpayload=(edtValue)*0.2860791826;

                STS12signal=(edtValue)*0.0691358025;

                STS24signal=(edtValue)*0.0345679012;

                STS48signal=(edtValue)*0.0172839506;

                STS192signal=(edtValue)*0.0043209877;

                STM1signal=(edtValue)*0.2765432099;

                STM4signal=(edtValue)*0.0691358025;

                STM16signal=(edtValue)*0.0172839506;

                STM64signal=(edtValue)*0.0043209877;

                break;

            case "T4(signal)":

                bitpersecond=(edtValue)*274176000.0;

                bytepersecond=(edtValue)*34272000.0;

                kilobitpersecondSI=(edtValue)*274176;

                kilobytepersecondSI=(edtValue)*34272;

                kilobitpersecond=(edtValue)*267750;

                kilobytepersecond=(edtValue)*33468.75;

                megabitpersecondSI=(edtValue)*274.176;

                megabytepersecondSI=(edtValue)*34.272;

                megabitpersecond=(edtValue)*261.47460938;

                megabytepersecond=(edtValue)*32.684326172;

                gigabitpersecondSI=(edtValue)*0.274176;

                gigabytepersecondSI=(edtValue)*0.034272;

                gigabitpersecond=(edtValue)*0.2553462982;

                gigabytepersecond=(edtValue)*0.0319182873;

                terabitpersecondSI=(edtValue)*0.000274176;

                terabytepersecondSI=(edtValue)*0.000034272;

                terabitpersecond=(edtValue)*0.0002493616;

                terabytepersecond=(edtValue)*0.0000311702;

                ethernet=(edtValue)*27.4176;

                ethernetfast=(edtValue)*2.74176;

                ethernetgigabit=(edtValue)*0.274176;

                OC1=(edtValue)*5.2888888889;

                OC3=(edtValue)*1.762962963;

                OC12=(edtValue)*0.4407407407;

                OC24=(edtValue)*0.2203703704;

                OC48=(edtValue)*0.1101851852;

                OC192=(edtValue)*0.0275462963;

                OC768=(edtValue)*0.0068865741;

                ISDNsinglechannel=(edtValue)*4284;

                ISDNdualchannel=(edtValue)*2142;

                modem110=(edtValue)*2492509.0909;

                modem300=(edtValue)*913920;

                modem1200=(edtValue)*228480;

                modem2400=(edtValue)*114240;

                modem9600=(edtValue)*28560;

                modem14k=(edtValue)*19040;

                modem28k=(edtValue)*9520;

                modem33k=(edtValue)*8160;

                modem56k=(edtValue)*4896;

                SCSIAsync=(edtValue)*22.848;

                SCSISync=(edtValue)*6.8544;

                SCSIFast=(edtValue)*3.4272;

                SCSIFastUltra=(edtValue)*1.7136;


                SCSIFastWide=(edtValue)*1.7136;

                SCSIFastUltraWide=(edtValue)*0.8568;

                SCSIUltra2=(edtValue)*0.4284;

                SCSIUltra3=(edtValue)*0.2142;

                SCSILVDUltra80=(edtValue)*0.4284;


                SCSILVDUltra160=(edtValue)*0.2142;

                IDEPIOmode0=(edtValue)*10.385454545;

                IDEPIOmode1=(edtValue)*6.5907692308;

                IDEPIOmode2=(edtValue)*4.1291566265;

                IDEPIOmode3=(edtValue)*3.0875675676;

                IDEPIOmode4=(edtValue)*2.0645783133;

                IDEDMAmode0=(edtValue)*8.16;

                IDEDMAmode1=(edtValue)*2.5768421053;

                IDEDMAmode2=(edtValue)*2.0645783133;

                IDEUDMAmode0=(edtValue)*2.0645783133;

                IDEUDMAmode1=(edtValue)*1.37088;

                IDEUDMAmode2=(edtValue)*1.0385454545;

                IDEUDMAmode3=(edtValue)*0.68544;

                IDEUDMAmode4=(edtValue)*0.5192727273;

                IDEUDMA33=(edtValue)*1.0385454545;

                IDEUDMA66=(edtValue)*0.5192727273;

                USB=(edtValue)*22.848;

                firewire=(edtValue)*0.68544;

                T0payload=(edtValue)*4896;

                T0B8ZSpayload=(edtValue)*4284;

                T1signal=(edtValue)*177.57512953;

                T1payload=(edtValue)*204;

                T1Zpayload=(edtValue)*177.57512953;

                T1Csignal=(edtValue)*86.984771574;

                T1Cpayload=(edtValue)*102;

                T2signal=(edtValue)*43.437262357;

                T3signal=(edtValue)*43.437262357;

                T3payload=(edtValue)*7.2857142857;

                T3Zpayload=(edtValue)*6.375;

                T4signal=(edtValue)*1;

                EPTA1signal=(edtValue)*133.875;

                EPTA1payload=(edtValue)*142.8;

                EPTA2signal=(edtValue)*32.454545455;

                EPTA2payload=(edtValue)*35.7;

                EPTA3signal=(edtValue)*7.9776536313;

                EPTA3payload=(edtValue)*8.925;

                H0=(edtValue)*714;

                H11=(edtValue)*178.5;

                H12=(edtValue)*142.8;

                VirtualTributary1signal=(edtValue)*158.66666667;

                VirtualTributary1payload=(edtValue)*177.57512953;

                VirtualTributary2signal=(edtValue)*119;

                VirtualTributary2payload=(edtValue)*133.875;

                VirtualTributary6signal=(edtValue)*43.437262357;

                VirtualTributary6payload=(edtValue)*45.696;

                STS1signal=(edtValue)*5.2888888889;

                STS1payload=(edtValue)*5.5389090909;

                STS3signal=(edtValue)*1.762962963;

                STS3payload=(edtValue)*1.8237547893;

                STS3csignal=(edtValue)*1.762962963;

                STS3cpayload=(edtValue)*1.8237547893;

                STS12signal=(edtValue)*0.4407407407;

                STS24signal=(edtValue)*0.2203703704;

                STS48signal=(edtValue)*0.1101851852;

                STS192signal=(edtValue)*0.0275462963;

                STM1signal=(edtValue)*1.762962963;

                STM4signal=(edtValue)*0.4407407407;

                STM16signal=(edtValue)*0.1101851852;

                STM64signal=(edtValue)*0.0275462963;

                break;


            case "E.P.T.A.1(signal)":

                bitpersecond=(edtValue)*2048000.0;

                bytepersecond=(edtValue)*256000.0;

                kilobitpersecondSI=(edtValue)*2048;

                kilobytepersecondSI=(edtValue)*256;

                kilobitpersecond=(edtValue)*2000;

                kilobytepersecond=(edtValue)*250;

                megabitpersecondSI=(edtValue)*2.048;

                megabytepersecondSI=(edtValue)*0.256;

                megabitpersecond=(edtValue)*1.953125;

                megabytepersecond=(edtValue)*0.244140625;

                gigabitpersecondSI=(edtValue)*0.002048;

                gigabytepersecondSI=(edtValue)*0.000256;

                gigabitpersecond=(edtValue)*0.0019073486;

                gigabytepersecond=(edtValue)*0.0002384186;

                terabitpersecondSI=(edtValue)*0.000002048;

                terabytepersecondSI=(edtValue)*2.56E-7;

                terabitpersecond=(edtValue)*0.0000018626;

                terabytepersecond=(edtValue)*2.328306436E-7;

                ethernet=(edtValue)*0.2048;

                ethernetfast=(edtValue)*0.02048;

                ethernetgigabit=(edtValue)*0.002048;

                OC1=(edtValue)*0.0395061728;

                OC3=(edtValue)*0.0131687243;

                OC12=(edtValue)*0.0032921811;

                OC24=(edtValue)*0.0016460905;

                OC48=(edtValue)*0.0016460905;

                OC192=(edtValue)*0.0002057613;

                OC768=(edtValue)*0.0000514403;

                ISDNsinglechannel=(edtValue)*32;

                ISDNdualchannel=(edtValue)*16;

                modem110=(edtValue)*18618.181818;

                modem300=(edtValue)*6826.6666667;

                modem1200=(edtValue)*1706.6666667;

                modem2400=(edtValue)*853.33333333;

                modem9600=(edtValue)*213.33333333;

                modem14k=(edtValue)*142.22222222;

                modem28k=(edtValue)*71.111111111;

                modem33k=(edtValue)*60.952380952;

                modem56k=(edtValue)*36.571428571;

                SCSIAsync=(edtValue)*0.1706666667;

                SCSISync=(edtValue)*0.0512;

                SCSIFast=(edtValue)*0.0256;

                SCSIFastUltra=(edtValue)*0.0128;


                SCSIFastWide=(edtValue)*0.0128;

                SCSIFastUltraWide=(edtValue)*0.0064;

                SCSIUltra2=(edtValue)*0.0032;

                SCSIUltra3=(edtValue)*0.0016;

                SCSILVDUltra80=(edtValue)*0.0032;


                SCSILVDUltra160=(edtValue)*0.0016;

                IDEPIOmode0=(edtValue)*0.0775757576;

                IDEPIOmode1=(edtValue)*0.0492307692;

                IDEPIOmode2=(edtValue)*0.0308433735;

                IDEPIOmode3=(edtValue)*0.0230630631;

                IDEPIOmode4=(edtValue)*0.0154216867;

                IDEDMAmode0=(edtValue)*0.060952381;

                IDEDMAmode1=(edtValue)*0.0192481203;

                IDEDMAmode2=(edtValue)*0.0154216867;

                IDEUDMAmode0=(edtValue)*0.0154216867;

                IDEUDMAmode1=(edtValue)*0.01024;

                IDEUDMAmode2=(edtValue)*0.0077575758;

                IDEUDMAmode3=(edtValue)*0.00512;

                IDEUDMAmode4=(edtValue)*0.0038787879;

                IDEUDMA33=(edtValue)*0.0077575758;

                IDEUDMA66=(edtValue)*0.0038787879;

                USB=(edtValue)*0.1706666667;

                firewire=(edtValue)*0.00512;

                T0payload=(edtValue)*36.571428571;

                T0B8ZSpayload=(edtValue)*32;

                T1signal=(edtValue)*1.3264248705;

                T1payload=(edtValue)*1.5238095238;

                T1Zpayload=(edtValue)*1.3264248705;

                T1Csignal=(edtValue)*0.6497461929;

                T1Cpayload=(edtValue)*0.7619047619;

                T2signal=(edtValue)*0.3244613435;

                T3signal=(edtValue)*0.0457796853;

                T3payload=(edtValue)*0.0544217687;

                T3Zpayload=(edtValue)*0.0476190476;

                T4signal=(edtValue)*0.0074696545;

                EPTA1signal=(edtValue)*1;

                EPTA1payload=(edtValue)*1.0666666667;

                EPTA2signal=(edtValue)*0.2424242424;

                EPTA2payload=(edtValue)*0.2666666667;

                EPTA3signal=(edtValue)*0.0595903166;

                EPTA3payload=(edtValue)*0.0666666667;

                H0=(edtValue)*5.3333333333;

                H11=(edtValue)*1.3333333333;

                H12=(edtValue)*1.0666666667;

                VirtualTributary1signal=(edtValue)*1.1851851852;

                VirtualTributary1payload=(edtValue)*1.3264248705;

                VirtualTributary2signal=(edtValue)*0.8888888889;

                VirtualTributary2payload=(edtValue)*1;

                VirtualTributary6signal=(edtValue)*0.3244613435;

                VirtualTributary6payload=(edtValue)*0.3413333333;

                STS1signal=(edtValue)*0.3413333333;

                STS1payload=(edtValue)*0.0413737374;

                STS3signal=(edtValue)*0.0131687243;

                STS3payload=(edtValue)*0.0136228182;

                STS3csignal=(edtValue)*0.0131687243;

                STS3cpayload=(edtValue)*0.0136228182;

                STS12signal=(edtValue)*0.0032921811;

                STS24signal=(edtValue)*0.0016460905;

                STS48signal=(edtValue)*0.0008230453;

                STS192signal=(edtValue)*0.0002057613;

                STM1signal=(edtValue)*0.0131687243;

                STM4signal=(edtValue)*0.0032921811;

                STM16signal=(edtValue)*0.0008230453;

                STM64signal=(edtValue)*0.0002057613;

                break;


            case "E.P.T.A.1(payload)":

                bitpersecond=(edtValue)*1920000;

                bytepersecond=(edtValue)*240000;

                kilobitpersecondSI=(edtValue)*1920;

                kilobytepersecondSI=(edtValue)*240;

                kilobitpersecond=(edtValue)*1875;

                kilobytepersecond=(edtValue)*234.375;

                megabitpersecondSI=(edtValue)*1.92;

                megabytepersecondSI=(edtValue)*0.24;

                megabitpersecond=(edtValue)*1.8310546875;

                megabytepersecond=(edtValue)*0.2288818359;

                gigabitpersecondSI=(edtValue)*0.00192;

                gigabytepersecondSI=(edtValue)*0.00024;

                gigabitpersecond=(edtValue)*0.0017881393;

                gigabytepersecond=(edtValue)*0.0002235174;

                terabitpersecondSI=(edtValue)*0.00000192;

                terabytepersecondSI=(edtValue)*2.4E-7;

                terabitpersecond=(edtValue)*0.0000017462;

                terabytepersecond=(edtValue)*2.182787284E-7;

                ethernet=(edtValue)*0.192;

                ethernetfast=(edtValue)*0.0192;

                ethernetgigabit=(edtValue)*0.00192;

                OC1=(edtValue)*0.037037037;

                OC3=(edtValue)*0.012345679;

                OC12=(edtValue)*0.0030864198;

                OC24=(edtValue)*0.0015432099;

                OC48=(edtValue)*0.0007716049;

                OC192=(edtValue)*0.0001929012;

                OC768=(edtValue)*0.0000482253;

                ISDNsinglechannel=(edtValue)*30;

                ISDNdualchannel=(edtValue)*15;

                modem110=(edtValue)*17454.545455;

                modem300=(edtValue)*6400;

                modem1200=(edtValue)*1600;

                modem2400=(edtValue)*800;

                modem9600=(edtValue)*200;

                modem14k=(edtValue)*133.33333333;

                modem28k=(edtValue)*66.666666667;

                modem33k=(edtValue)*57.142857143;

                modem56k=(edtValue)*34.285714286;

                SCSIAsync=(edtValue)*0.16;

                SCSISync=(edtValue)*0.048;

                SCSIFast=(edtValue)*0.024;

                SCSIFastUltra=(edtValue)*0.012;


                SCSIFastWide=(edtValue)*0.012;

                SCSIFastUltraWide=(edtValue)*0.006;

                SCSIUltra2=(edtValue)*0.003;

                SCSIUltra3=(edtValue)*0.0015;

                SCSILVDUltra80=(edtValue)*0.003;


                SCSILVDUltra160=(edtValue)*0.0015;

                IDEPIOmode0=(edtValue)*0.0727272727;

                IDEPIOmode1=(edtValue)*0.0461538462;

                IDEPIOmode2=(edtValue)*0.0289156627;

                IDEPIOmode3=(edtValue)*0.0216216216;

                IDEPIOmode4=(edtValue)*0.0144578313;

                IDEDMAmode0=(edtValue)*0.0571428571;

                IDEDMAmode1=(edtValue)*0.0180451128;

                IDEDMAmode2=(edtValue)*0.0144578313;

                IDEUDMAmode0=(edtValue)*0.0144578313;

                IDEUDMAmode1=(edtValue)*0.0096;

                IDEUDMAmode2=(edtValue)*0.0072727273;

                IDEUDMAmode3=(edtValue)*0.0048;

                IDEUDMAmode4=(edtValue)*0.0036363636;

                IDEUDMA33=(edtValue)*0.0072727273;

                IDEUDMA66=(edtValue)*0.0036363636;

                USB=(edtValue)*0.16;

                firewire=(edtValue)*0.0048;

                T0payload=(edtValue)*34.285714286;

                T0B8ZSpayload=(edtValue)*30;

                T1signal=(edtValue)*1.2435233161;

                T1payload=(edtValue)*1.4285714286;

                T1Zpayload=(edtValue)*1.2435233161;

                T1Csignal=(edtValue)*0.6091370558;

                T1Cpayload=(edtValue)*0.7142857143;

                T2signal=(edtValue)*0.3041825095;

                T3signal=(edtValue)*0.0429184549;

                T3payload=(edtValue)*0.0510204082;

                T3Zpayload=(edtValue)*0.0446428571;

                T4signal=(edtValue)*0.0070028011;

                EPTA1signal=(edtValue)*0.9375;

                EPTA1payload=(edtValue)*1;

                EPTA2signal=(edtValue)*0.2272727273;

                EPTA2payload=(edtValue)*0.25;

                EPTA3signal=(edtValue)*0.0558659218;

                EPTA3payload=(edtValue)*0.0625;

                H0=(edtValue)*5;

                H11=(edtValue)*1.25;

                H12=(edtValue)*1;

                VirtualTributary1signal=(edtValue)*1.1111111111;

                VirtualTributary1payload=(edtValue)*1.2435233161;

                VirtualTributary2signal=(edtValue)*0.8333333333;

                VirtualTributary2payload=(edtValue)*0.9375;

                VirtualTributary6signal=(edtValue)*0.3041825095;

                VirtualTributary6payload=(edtValue)*0.32;

                STS1signal=(edtValue)*0.037037037;

                STS1payload=(edtValue)*0.0387878788;

                STS3signal=(edtValue)*0.012345679;

                STS3payload=(edtValue)*0.0127713921;

                STS3csignal=(edtValue)*0.012345679;

                STS3cpayload=(edtValue)*0.0127713921;

                STS12signal=(edtValue)*0.0030864198;

                STS24signal=(edtValue)*0.0015432099;

                STS48signal=(edtValue)*0.0007716049;

                STS192signal=(edtValue)*0.0001929012;

                STM1signal=(edtValue)*0.012345679;

                STM4signal=(edtValue)*0.0030864198;

                STM16signal=(edtValue)*0.0007716049;

                STM64signal=(edtValue)*0.0001929012;

                break;


            case "E.P.T.A.2(signal)":

                bitpersecond=(edtValue)*8448000;

                bytepersecond=(edtValue)*1056000;

                kilobitpersecondSI=(edtValue)*8448;

                kilobytepersecondSI=(edtValue)*1056;

                kilobitpersecond=(edtValue)*8250;

                kilobytepersecond=(edtValue)*1031.25;

                megabitpersecondSI=(edtValue)*8.448;

                megabytepersecondSI=(edtValue)*1.056;

                megabitpersecond=(edtValue)*8.056640625;

                megabytepersecond=(edtValue)*1.0070800781;

                gigabitpersecondSI=(edtValue)*0.008448;

                gigabytepersecondSI=(edtValue)*0.001056;

                gigabitpersecond=(edtValue)*0.0078678131;

                gigabytepersecond=(edtValue)*0.0009834766;

                terabitpersecondSI=(edtValue)*0.000008448;

                terabytepersecondSI=(edtValue)*0.000001056;

                terabitpersecond=(edtValue)*0.0000076834;

                terabytepersecond=(edtValue)*9.60426405E-7;

                ethernet=(edtValue)*0.8448;

                ethernetfast=(edtValue)*0.08448;

                ethernetgigabit=(edtValue)*0.008448;

                OC1=(edtValue)*0.162962963;

                OC3=(edtValue)*0.0543209877;

                OC12=(edtValue)*0.0135802469;

                OC24=(edtValue)*0.0067901235;

                OC48=(edtValue)*0.0033950617;

                OC192=(edtValue)*0.0008487654;

                OC768=(edtValue)*0.0002121914;

                ISDNsinglechannel=(edtValue)*132;

                ISDNdualchannel=(edtValue)*66;

                modem110=(edtValue)*76800;

                modem300=(edtValue)*28160;

                modem1200=(edtValue)*7040;

                modem2400=(edtValue)*3520;

                modem9600=(edtValue)*880;

                modem14k=(edtValue)*586.66666667;

                modem28k=(edtValue)*293.33333333;

                modem33k=(edtValue)*251.42857143;

                modem56k=(edtValue)*150.85714286;

                SCSIAsync=(edtValue)*0.704;

                SCSISync=(edtValue)*0.2112;

                SCSIFast=(edtValue)*0.1056;

                SCSIFastUltra=(edtValue)*0.0528;


                SCSIFastWide=(edtValue)*0.0528;

                SCSIFastUltraWide=(edtValue)*0.0264;

                SCSIUltra2=(edtValue)*0.0132;

                SCSIUltra3=(edtValue)*0.0066;

                SCSILVDUltra80=(edtValue)*0.0132;


                SCSILVDUltra160=(edtValue)*0.0066;

                IDEPIOmode0=(edtValue)*0.32;

                IDEPIOmode1=(edtValue)*0.2030769231;

                IDEPIOmode2=(edtValue)*0.1272289157;

                IDEPIOmode3=(edtValue)*0.0951351351;

                IDEPIOmode4=(edtValue)*0.0636144578;

                IDEDMAmode0=(edtValue)*0.2514285714;

                IDEDMAmode1=(edtValue)*0.0793984962;

                IDEDMAmode2=(edtValue)*0.0636144578;

                IDEUDMAmode0=(edtValue)*0.0636144578;

                IDEUDMAmode1=(edtValue)*0.04224;

                IDEUDMAmode2=(edtValue)*0.032;

                IDEUDMAmode3=(edtValue)*0.02112;

                IDEUDMAmode4=(edtValue)*0.016;

                IDEUDMA33=(edtValue)*0.032;

                IDEUDMA66=(edtValue)*0.016;

                USB=(edtValue)*0.704;

                firewire=(edtValue)*0.02112;

                T0payload=(edtValue)*150.85714286;

                T0B8ZSpayload=(edtValue)*132;

                T1signal=(edtValue)*5.4715025907;

                T1payload=(edtValue)*6.2857142857;

                T1Zpayload=(edtValue)*5.4715025907;

                T1Csignal=(edtValue)*2.6802030457;

                T1Cpayload=(edtValue)*3.1428571429;

                T2signal=(edtValue)*1.3384030418;

                T3signal=(edtValue)*0.1888412017;

                T3payload=(edtValue)*0.2244897959;

                T3Zpayload=(edtValue)*0.1964285714;

                T4signal=(edtValue)*0.0308123249;

                EPTA1signal=(edtValue)*4.125;

                EPTA1payload=(edtValue)*4.4;

                EPTA2signal=(edtValue)*1;

                EPTA2payload=(edtValue)*1.1;

                EPTA3signal=(edtValue)*0.2458100559;

                EPTA3payload=(edtValue)*0.275;

                H0=(edtValue)*22;

                H11=(edtValue)*5.5;

                H12=(edtValue)*4.4;

                VirtualTributary1signal=(edtValue)*4.8888888889;

                VirtualTributary1payload=(edtValue)*5.4715025907;

                VirtualTributary2signal=(edtValue)*3.6666666667;

                VirtualTributary2payload=(edtValue)*4.125;

                VirtualTributary6signal=(edtValue)*1.3384030418;

                VirtualTributary6payload=(edtValue)*1.408;

                STS1signal=(edtValue)*0.162962963;

                STS1payload=(edtValue)*0.1706666667;

                STS3signal=(edtValue)*0.0543209877;

                STS3payload=(edtValue)*0.0561941252;

                STS3csignal=(edtValue)*0.0543209877;

                STS3cpayload=(edtValue)*0.0561941252;

                STS12signal=(edtValue)*0.0135802469;

                STS24signal=(edtValue)*0.0067901235;

                STS48signal=(edtValue)*0.0033950617;

                STS192signal=(edtValue)*0.0008487654;

                STM1signal=(edtValue)*0.0543209877;

                STM4signal=(edtValue)*0.0135802469;

                STM16signal=(edtValue)*0.0033950617;

                STM64signal=(edtValue)*0.0008487654;

                break;


            case "E.P.T.A.2(payload)":

                bitpersecond=(edtValue)*7680000.0;

                bytepersecond=(edtValue)*960000;

                kilobitpersecondSI=(edtValue)*7680;

                kilobytepersecondSI=(edtValue)*960;

                kilobitpersecond=(edtValue)*7500;

                kilobytepersecond=(edtValue)*937.5;

                megabitpersecondSI=(edtValue)*7.68;

                megabytepersecondSI=(edtValue)*0.96;

                megabitpersecond=(edtValue)*7.32421875;

                megabytepersecond=(edtValue)*0.9155273438;

                gigabitpersecondSI=(edtValue)*0.00768;

                gigabytepersecondSI=(edtValue)*0.00096;

                gigabitpersecond=(edtValue)*0.0071525574;

                gigabytepersecond=(edtValue)*0.0008940697;

                terabitpersecondSI=(edtValue)*0.00000768;

                terabytepersecondSI=(edtValue)*9.6E-7;

                terabitpersecond=(edtValue)*0.0000069849;

                terabytepersecond=(edtValue)*8.731149137E-7;

                ethernet=(edtValue)*0.768;

                ethernetfast=(edtValue)*0.0768;

                ethernetgigabit=(edtValue)*0.00768;

                OC1=(edtValue)*0.1481481481;

                OC3=(edtValue)*0.049382716;

                OC12=(edtValue)*0.012345679;

                OC24=(edtValue)*0.0061728395;

                OC48=(edtValue)*0.0030864198;

                OC192=(edtValue)*0.0007716049;

                OC768=(edtValue)*0.0001929012;

                ISDNsinglechannel=(edtValue)*120;

                ISDNdualchannel=(edtValue)*60;

                modem110=(edtValue)*69818.181818;

                modem300=(edtValue)*25600;

                modem1200=(edtValue)*6400;

                modem2400=(edtValue)*3200;

                modem9600=(edtValue)*800;

                modem14k=(edtValue)*533.33333333;

                modem28k=(edtValue)*266.66666667;

                modem33k=(edtValue)*228.57142857;

                modem56k=(edtValue)*137.14285714;

                SCSIAsync=(edtValue)*0.64;

                SCSISync=(edtValue)*0.192;

                SCSIFast=(edtValue)*0.096;

                SCSIFastUltra=(edtValue)*0.048;


                SCSIFastWide=(edtValue)*0.048;

                SCSIFastUltraWide=(edtValue)*0.024;

                SCSIUltra2=(edtValue)*0.012;

                SCSIUltra3=(edtValue)*0.006;

                SCSILVDUltra80=(edtValue)*0.012;


                SCSILVDUltra160=(edtValue)*0.006;

                IDEPIOmode0=(edtValue)*0.2909090909;

                IDEPIOmode1=(edtValue)*0.1846153846;

                IDEPIOmode2=(edtValue)*0.1156626506;

                IDEPIOmode3=(edtValue)*0.0864864865;

                IDEPIOmode4=(edtValue)*0.0578313253;

                IDEDMAmode0=(edtValue)*0.2285714286;

                IDEDMAmode1=(edtValue)*0.0721804511;

                IDEDMAmode2=(edtValue)*0.0578313253;

                IDEUDMAmode0=(edtValue)*0.0578313253;

                IDEUDMAmode1=(edtValue)*0.0384;

                IDEUDMAmode2=(edtValue)*0.0290909091;

                IDEUDMAmode3=(edtValue)*0.0192;

                IDEUDMAmode4=(edtValue)*0.0145454545;

                IDEUDMA33=(edtValue)*0.0290909091;

                IDEUDMA66=(edtValue)*0.0145454545;

                USB=(edtValue)*0.64;

                firewire=(edtValue)*0.0192;

                T0payload=(edtValue)*137.14285714;

                T0B8ZSpayload=(edtValue)*120;

                T1signal=(edtValue)*4.9740932642;

                T1payload=(edtValue)*5.7142857143;

                T1Zpayload=(edtValue)*4.9740932642;

                T1Csignal=(edtValue)*2.4365482234;

                T1Cpayload=(edtValue)*2.8571428571;

                T2signal=(edtValue)*1.216730038;

                T3signal=(edtValue)*0.1716738197;

                T3payload=(edtValue)*0.2040816327;

                T3Zpayload=(edtValue)*0.1785714286;

                T4signal=(edtValue)*0.0280112045;

                EPTA1signal=(edtValue)*3.75;

                EPTA1payload=(edtValue)*4;

                EPTA2signal=(edtValue)*0.9090909091;

                EPTA2payload=(edtValue)*1;

                EPTA3signal=(edtValue)*0.2234636872;

                EPTA3payload=(edtValue)*0.25;

                H0=(edtValue)*20;

                H11=(edtValue)*5;

                H12=(edtValue)*4;

                VirtualTributary1signal=(edtValue)*4.4444444444;

                VirtualTributary1payload=(edtValue)*4.9740932642;

                VirtualTributary2signal=(edtValue)*3.3333333333;

                VirtualTributary2payload=(edtValue)*3.75;

                VirtualTributary6signal=(edtValue)*1.216730038;

                VirtualTributary6payload=(edtValue)*1.28;

                STS1signal=(edtValue)*0.1481481481;

                STS1payload=(edtValue)*0.1551515152;

                STS3signal=(edtValue)*0.049382716;

                STS3payload=(edtValue)*0.0510855683;

                STS3csignal=(edtValue)*0.049382716;

                STS3cpayload=(edtValue)*0.0510855683;

                STS12signal=(edtValue)*0.012345679;

                STS24signal=(edtValue)*0.0061728395;

                STS48signal=(edtValue)*0.0030864198;

                STS192signal=(edtValue)*0.0007716049;

                STM1signal=(edtValue)*0.049382716;

                STM4signal=(edtValue)*0.012345679;

                STM16signal=(edtValue)*0.0030864198;

                STM64signal=(edtValue)*0.0007716049;

                break;


            case "E.P.T.A.3(signal)":

                bitpersecond=(edtValue)*34368000.0;

                bytepersecond=(edtValue)*4296000.0;

                kilobitpersecondSI=(edtValue)*34368;

                kilobytepersecondSI=(edtValue)*4296;

                kilobitpersecond=(edtValue)*33562.5;

                kilobytepersecond=(edtValue)*4195.3125;

                megabitpersecondSI=(edtValue)*34.368;

                megabytepersecondSI=(edtValue)*4.296;

                megabitpersecond=(edtValue)*32.775878906;

                megabytepersecond=(edtValue)*4.0969848633;

                gigabitpersecondSI=(edtValue)*0.034368;

                gigabytepersecondSI=(edtValue)*0.004296;

                gigabitpersecond=(edtValue)*0.0320076942;

                gigabytepersecond=(edtValue)*0.0040009618;

                terabitpersecondSI=(edtValue)*0.000034368;

                terabytepersecondSI=(edtValue)*0.000004296;

                terabitpersecond=(edtValue)*0.0000312575;

                terabytepersecond=(edtValue)*0.0000039072;

                ethernet=(edtValue)*3.4368;

                ethernetfast=(edtValue)*0.34368;

                ethernetgigabit=(edtValue)*0.034368;

                OC1=(edtValue)*0.662962963;

                OC3=(edtValue)*0.2209876543;

                OC12=(edtValue)*0.0552469136;

                OC24=(edtValue)*0.0276234568;

                OC48=(edtValue)*0.0138117284;

                OC192=(edtValue)*0.0034529321;

                OC768=(edtValue)*0.000863233;

                ISDNsinglechannel=(edtValue)*537;

                ISDNdualchannel=(edtValue)*268.5;

                modem110=(edtValue)*312436.36364;

                modem300=(edtValue)*114560;

                modem1200=(edtValue)*28640;

                modem2400=(edtValue)*14320;

                modem9600=(edtValue)*3580;

                modem14k=(edtValue)*2386.6666667;

                modem28k=(edtValue)*1193.3333333;

                modem33k=(edtValue)*1022.8571429;

                modem56k=(edtValue)*613.71428571;

                SCSIAsync=(edtValue)*2.864;

                SCSISync=(edtValue)*0.8592;

                SCSIFast=(edtValue)*0.4296;

                SCSIFastUltra=(edtValue)*0.2148;


                SCSIFastWide=(edtValue)*0.2148;

                SCSIFastUltraWide=(edtValue)*0.1074;

                SCSIUltra2=(edtValue)*0.0537;

                SCSIUltra3=(edtValue)*0.02685;

                SCSILVDUltra80=(edtValue)*0.0537;


                SCSILVDUltra160=(edtValue)*0.02685;

                IDEPIOmode0=(edtValue)*1.3018181818;

                IDEPIOmode1=(edtValue)*0.8261538462;

                IDEPIOmode2=(edtValue)*0.5175903614;

                IDEPIOmode3=(edtValue)*0.387027027;

                IDEPIOmode4=(edtValue)*0.2587951807;

                IDEDMAmode0=(edtValue)*1.0228571429;

                IDEDMAmode1=(edtValue)*0.3230075188;

                IDEDMAmode2=(edtValue)*0.2587951807;

                IDEUDMAmode0=(edtValue)*0.2587951807;

                IDEUDMAmode1=(edtValue)*0.17184;

                IDEUDMAmode2=(edtValue)*0.1301818182;

                IDEUDMAmode3=(edtValue)*0.08592;

                IDEUDMAmode4=(edtValue)*0.0650909091;

                IDEUDMA33=(edtValue)*0.1301818182;

                IDEUDMA66=(edtValue)*0.0650909091;

                USB=(edtValue)*2.864;

                firewire=(edtValue)*0.08592;

                T0payload=(edtValue)*613.71428571;

                T0B8ZSpayload=(edtValue)*537;

                T1signal=(edtValue)*22.259067358;

                T1payload=(edtValue)*25.571428571;

                T1Zpayload=(edtValue)*22.259067358;

                T1Csignal=(edtValue)*10.903553299;

                T1Cpayload=(edtValue)*12.785714286;

                T2signal=(edtValue)*5.4448669202;

                T3signal=(edtValue)*0.7682403433;

                T3payload=(edtValue)*0.9132653061;

                T3Zpayload=(edtValue)*0.7991071429;

                T4signal=(edtValue)*0.1253501401;

                EPTA1signal=(edtValue)*16.78125;

                EPTA1payload=(edtValue)*17.9;

                EPTA2signal=(edtValue)*4.0681818182;

                EPTA2payload=(edtValue)*4.475;

                EPTA3signal=(edtValue)*1;

                EPTA3payload=(edtValue)*1.11875;

                H0=(edtValue)*89.5;

                H11=(edtValue)*22.375;

                H12=(edtValue)*17.9;

                VirtualTributary1signal=(edtValue)*19.888888889;

                VirtualTributary1payload=(edtValue)*22.259067358;

                VirtualTributary2signal=(edtValue)*14.916666667;

                VirtualTributary2payload=(edtValue)*16.78125;

                VirtualTributary6signal=(edtValue)*5.4448669202;

                VirtualTributary6payload=(edtValue)*5.728;

                STS1signal=(edtValue)*0.662962963;

                STS1payload=(edtValue)*0.6943030303;

                STS3signal=(edtValue)*0.2209876543;

                STS3payload=(edtValue)*0.2286079183;

                STS3csignal=(edtValue)*0.2209876543;

                STS3cpayload=(edtValue)*0.2286079183;

                STS12signal=(edtValue)*0.0552469136;

                STS24signal=(edtValue)*0.0276234568;

                STS48signal=(edtValue)*0.0138117284;

                STS192signal=(edtValue)*0.0034529321;

                STM1signal=(edtValue)*0.2209876543;

                STM4signal=(edtValue)*0.0552469136;

                STM16signal=(edtValue)*0.0138117284;

                STM64signal=(edtValue)*0.0034529321;

                break;

            case "E.P.T.A.3(payload)":

                bitpersecond=(edtValue)*30720000.0;

                bytepersecond=(edtValue)*3840000.0;

                kilobitpersecondSI=(edtValue)*30720;

                kilobytepersecondSI=(edtValue)*3840;

                kilobitpersecond=(edtValue)*30000;

                kilobytepersecond=(edtValue)*3750;

                megabitpersecondSI=(edtValue)*30.72;

                megabytepersecondSI=(edtValue)*3.84;

                megabitpersecond=(edtValue)*29.296875;

                megabytepersecond=(edtValue)*3.662109375;

                gigabitpersecondSI=(edtValue)*0.03072;

                gigabytepersecondSI=(edtValue)*0.00384;

                gigabitpersecond=(edtValue)*0.0286102295;

                gigabytepersecond=(edtValue)*0.0035762787;

                terabitpersecondSI=(edtValue)*0.00003072;

                terabytepersecondSI=(edtValue)*0.00000384;

                terabitpersecond=(edtValue)*0.0000279397;

                terabytepersecond=(edtValue)*0.0000034925;

                ethernet=(edtValue)*3.072;

                ethernetfast=(edtValue)*0.3072;

                ethernetgigabit=(edtValue)*0.03072;

                OC1=(edtValue)*0.5925925926;

                OC3=(edtValue)*0.1975308642;

                OC12=(edtValue)*0.049382716;

                OC24=(edtValue)*0.024691358;

                OC48=(edtValue)*0.012345679;

                OC192=(edtValue)*0.0030864198;

                OC768=(edtValue)*0.0007716049;

                ISDNsinglechannel=(edtValue)*480;

                ISDNdualchannel=(edtValue)*240;

                modem110=(edtValue)*279272.72727;

                modem300=(edtValue)*102400;

                modem1200=(edtValue)*25600;

                modem2400=(edtValue)*12800;

                modem9600=(edtValue)*3200;

                modem14k=(edtValue)*2133.3333333;

                modem28k=(edtValue)*1066.6666667;

                modem33k=(edtValue)*914.28571429;

                modem56k=(edtValue)*548.57142857;

                SCSIAsync=(edtValue)*2.56;

                SCSISync=(edtValue)*0.768;

                SCSIFast=(edtValue)*0.384;

                SCSIFastUltra=(edtValue)*0.192;


                SCSIFastWide=(edtValue)*0.192;

                SCSIFastUltraWide=(edtValue)*0.096;

                SCSIUltra2=(edtValue)*0.048;

                SCSIUltra3=(edtValue)*0.024;

                SCSILVDUltra80=(edtValue)*0.048;


                SCSILVDUltra160=(edtValue)*0.024;

                IDEPIOmode0=(edtValue)*1.1636363636;

                IDEPIOmode1=(edtValue)*0.7384615385;

                IDEPIOmode2=(edtValue)*0.4626506024;

                IDEPIOmode3=(edtValue)*0.3459459459;

                IDEPIOmode4=(edtValue)*0.2313253012;

                IDEDMAmode0=(edtValue)*0.9142857143;

                IDEDMAmode1=(edtValue)*0.2887218045;

                IDEDMAmode2=(edtValue)*0.2313253012;

                IDEUDMAmode0=(edtValue)*0.2313253012;

                IDEUDMAmode1=(edtValue)*0.1536;

                IDEUDMAmode2=(edtValue)*0.1163636364;

                IDEUDMAmode3=(edtValue)*0.0768;

                IDEUDMAmode4=(edtValue)*0.0581818182;

                IDEUDMA33=(edtValue)*0.1163636364;

                IDEUDMA66=(edtValue)*0.0581818182;

                USB=(edtValue)*2.56;

                firewire=(edtValue)*0.0768;

                T0payload=(edtValue)*548.57142857;

                T0B8ZSpayload=(edtValue)*480;

                T1signal=(edtValue)*19.896373057;

                T1payload=(edtValue)*22.857142857;

                T1Zpayload=(edtValue)*19.896373057;

                T1Csignal=(edtValue)*9.7461928934;

                T1Cpayload=(edtValue)*11.428571429;

                T2signal=(edtValue)*4.8669201521;

                T3signal=(edtValue)*0.686695279;

                T3payload=(edtValue)*0.8163265306;

                T3Zpayload=(edtValue)*0.7142857143;

                T4signal=(edtValue)*0.1120448179;

                EPTA1signal=(edtValue)*15;

                EPTA1payload=(edtValue)*16;

                EPTA2signal=(edtValue)*3.6363636364;

                EPTA2payload=(edtValue)*4;

                EPTA3signal=(edtValue)*0.8938547486;

                EPTA3payload=(edtValue)*1;

                H0=(edtValue)*80;

                H11=(edtValue)*20;

                H12=(edtValue)*16;

                VirtualTributary1signal=(edtValue)*17.777777778;

                VirtualTributary1payload=(edtValue)*19.896373057;

                VirtualTributary2signal=(edtValue)*13.333333333;

                VirtualTributary2payload=(edtValue)*15;

                VirtualTributary6signal=(edtValue)*4.8669201521;

                VirtualTributary6payload=(edtValue)*5.12;

                STS1signal=(edtValue)*0.5925925926;

                STS1payload=(edtValue)*0.6206060606;

                STS3signal=(edtValue)*0.1975308642;

                STS3payload=(edtValue)*0.2043422733;

                STS3csignal=(edtValue)*0.1975308642;

                STS3cpayload=(edtValue)*0.2043422733;

                STS12signal=(edtValue)*0.049382716;

                STS24signal=(edtValue)*0.024691358;

                STS48signal=(edtValue)*0.012345679;

                STS192signal=(edtValue)*0.0030864198;

                STM1signal=(edtValue)*0.1975308642;

                STM4signal=(edtValue)*0.049382716;

                STM16signal=(edtValue)*0.012345679;

                STM64signal=(edtValue)*0.0030864198;

                break;

            case  "H0":

                bitpersecond=(edtValue)*384000;

                bytepersecond=(edtValue)*48000;

                kilobitpersecondSI=(edtValue)*384;

                kilobytepersecondSI=(edtValue)*48;

                kilobitpersecond=(edtValue)*375;

                kilobytepersecond=(edtValue)*46.875;

                megabitpersecondSI=(edtValue)*0.384;

                megabytepersecondSI=(edtValue)*0.048;

                megabitpersecond=(edtValue)*0.3662109375;

                megabytepersecond=(edtValue)*0.0457763672;

                gigabitpersecondSI=(edtValue)*0.000384;

                gigabytepersecondSI=(edtValue)*0.000048;

                gigabitpersecond=(edtValue)*0.0003576279;

                gigabytepersecond=(edtValue)*0.0000447035;

                terabitpersecondSI=(edtValue)*3.839999999E-7;

                terabytepersecondSI=(edtValue)*4.799999999E-8;

                terabitpersecond=(edtValue)*3.492459654E-7;

                terabytepersecond=(edtValue)*4.365574568E-8;

                ethernet=(edtValue)*0.0384;

                ethernetfast=(edtValue)*0.00384;

                ethernetgigabit=(edtValue)*0.000384;

                OC1=(edtValue)*0.0074074074;

                OC3=(edtValue)*0.0024691358;

                OC12=(edtValue)*0.000617284;

                OC24=(edtValue)*0.000308642;

                OC48=(edtValue)*0.000154321;

                OC192=(edtValue)*0.0000385802;

                OC768=(edtValue)*0.0000096451;

                ISDNsinglechannel=(edtValue)*6;

                ISDNdualchannel=(edtValue)*3;

                modem110=(edtValue)*3490.9090909;

                modem300=(edtValue)*1280;

                modem1200=(edtValue)*320;

                modem2400=(edtValue)*160;

                modem9600=(edtValue)*40;

                modem14k=(edtValue)*26.666666667;

                modem28k=(edtValue)*13.333333333;

                modem33k=(edtValue)*11.428571429;

                modem56k=(edtValue)*6.8571428571;

                SCSIAsync=(edtValue)*0.032;

                SCSISync=(edtValue)*0.0096;

                SCSIFast=(edtValue)*0.0048;

                SCSIFastUltra=(edtValue)*0.0024;


                SCSIFastWide=(edtValue)*0.0024;

                SCSIFastUltraWide=(edtValue)*0.0012;

                SCSIUltra2=(edtValue)*0.0006;

                SCSIUltra3=(edtValue)*0.0003;

                SCSILVDUltra80=(edtValue)*0.0006;


                SCSILVDUltra160=(edtValue)*0.0003;

                IDEPIOmode0=(edtValue)*0.0145454545;

                IDEPIOmode1=(edtValue)*0.0092307692;

                IDEPIOmode2=(edtValue)*0.0057831325;

                IDEPIOmode3=(edtValue)*0.0043243243;

                IDEPIOmode4=(edtValue)*0.0028915663;

                IDEDMAmode0=(edtValue)*0.0114285714;

                IDEDMAmode1=(edtValue)*0.0036090226;

                IDEDMAmode2=(edtValue)*0.0028915663;

                IDEUDMAmode0=(edtValue)*0.0028915663;

                IDEUDMAmode1=(edtValue)*0.00192;

                IDEUDMAmode2=(edtValue)*0.0014545455;

                IDEUDMAmode3=(edtValue)*0.00096;

                IDEUDMAmode4=(edtValue)*0.0007272727;

                IDEUDMA33=(edtValue)*0.0014545455;

                IDEUDMA66=(edtValue)*0.0007272727;

                USB=(edtValue)*0.032;

                firewire=(edtValue)*0.00096;

                T0payload=(edtValue)*6.8571428571;

                T0B8ZSpayload=(edtValue)*6;

                T1signal=(edtValue)*0.2487046632;

                T1payload=(edtValue)*0.2857142857;

                T1Zpayload=(edtValue)*0.2487046632;

                T1Csignal=(edtValue)*0.1218274112;

                T1Cpayload=(edtValue)*0.1428571429;

                T2signal=(edtValue)*0.0608365019;

                T3signal=(edtValue)*0.008583691;

                T3payload=(edtValue)*0.0102040816;

                T3Zpayload=(edtValue)*0.0089285714;

                T4signal=(edtValue)*0.0014005602;

                EPTA1signal=(edtValue)*0.1875;

                EPTA1payload=(edtValue)*0.2;

                EPTA2signal=(edtValue)*0.0454545455;

                EPTA2payload=(edtValue)*0.05;

                EPTA3signal=(edtValue)*0.0111731844;

                EPTA3payload=(edtValue)*0.0125;

                H0=(edtValue)*1;

                H11=(edtValue)*0.25;

                H12=(edtValue)*0.2;

                VirtualTributary1signal=(edtValue)*0.2222222222;

                VirtualTributary1payload=(edtValue)*0.2487046632;

                VirtualTributary2signal=(edtValue)*0.1666666667;

                VirtualTributary2payload=(edtValue)*0.1875;

                VirtualTributary6signal=(edtValue)*0.0608365019;

                VirtualTributary6payload=(edtValue)*0.064;

                STS1signal=(edtValue)*0.0074074074;

                STS1payload=(edtValue)*0.0077575758;

                STS3signal=(edtValue)*0.0024691358;

                STS3payload=(edtValue)*0.0025542784;

                STS3csignal=(edtValue)*0.0024691358;

                STS3cpayload=(edtValue)*0.0025542784;

                STS12signal=(edtValue)*0.000617284;

                STS24signal=(edtValue)*0.000308642;

                STS48signal=(edtValue)*0.000154321;

                STS192signal=(edtValue)*0.0000385802;

                STM1signal=(edtValue)*0.0024691358;

                STM4signal=(edtValue)*0.000617284;

                STM16signal=(edtValue)*0.000154321;

                STM64signal=(edtValue)*0.0000385802;

                break;

            case  "H11":

                bitpersecond=(edtValue)*1536000;

                bytepersecond=(edtValue)*192000;

                kilobitpersecondSI=(edtValue)*1536;

                kilobytepersecondSI=(edtValue)*192;

                kilobitpersecond=(edtValue)*1500;

                kilobytepersecond=(edtValue)*187.5;

                megabitpersecondSI=(edtValue)*1.536;

                megabytepersecondSI=(edtValue)*0.192;

                megabitpersecond=(edtValue)*1.46484375;

                megabytepersecond=(edtValue)*0.1831054687;

                gigabitpersecondSI=(edtValue)*0.001536;

                gigabytepersecondSI=(edtValue)*0.000192;

                gigabitpersecond=(edtValue)*0.0014305115;

                gigabytepersecond=(edtValue)*0.0001788139;

                terabitpersecondSI=(edtValue)*0.000001536;

                terabytepersecondSI=(edtValue)*1.919999999E-7;

                terabitpersecond=(edtValue)*0.000001397;

                terabytepersecond=(edtValue)*1.746229827E-7;

                ethernet=(edtValue)*0.1536;

                ethernetfast=(edtValue)*0.01536;

                ethernetgigabit=(edtValue)*0.001536;

                OC1=(edtValue)*0.0296296296;

                OC3=(edtValue)*0.0098765432;

                OC12=(edtValue)*0.0024691358;

                OC24=(edtValue)*0.0012345679;

                OC48=(edtValue)*0.000617284;

                OC192=(edtValue)*0.000154321;

                OC768=(edtValue)*0.0000385802;

                ISDNsinglechannel=(edtValue)*24;

                ISDNdualchannel=(edtValue)*12;

                modem110=(edtValue)*13963.636364;

                modem300=(edtValue)*5120;

                modem1200=(edtValue)*1280;

                modem2400=(edtValue)*640;

                modem9600=(edtValue)*160;

                modem14k=(edtValue)*106.66666667;

                modem28k=(edtValue)*53.333333333;

                modem33k=(edtValue)*45.714285714;

                modem56k=(edtValue)*27.428571429;

                SCSIAsync=(edtValue)*0.128;

                SCSISync=(edtValue)*0.0384;

                SCSIFast=(edtValue)*0.0192;

                SCSIFastUltra=(edtValue)*0.0096;


                SCSIFastWide=(edtValue)*0.0096;

                SCSIFastUltraWide=(edtValue)*0.0048;

                SCSIUltra2=(edtValue)*0.0024;

                SCSIUltra3=(edtValue)*0.0012;

                SCSILVDUltra80=(edtValue)*0.0024;


                SCSILVDUltra160=(edtValue)*0.0012;

                IDEPIOmode0=(edtValue)*0.0581818182;

                IDEPIOmode1=(edtValue)*0.0369230769;

                IDEPIOmode2=(edtValue)*0.0231325301;

                IDEPIOmode3=(edtValue)*0.0172972973;

                IDEPIOmode4=(edtValue)*0.0115662651;

                IDEDMAmode0=(edtValue)*0.0457142857;

                IDEDMAmode1=(edtValue)*0.0144360902;

                IDEDMAmode2=(edtValue)*0.0115662651;

                IDEUDMAmode0=(edtValue)*0.0115662651;

                IDEUDMAmode1=(edtValue)*0.00768;

                IDEUDMAmode2=(edtValue)*0.0058181818;

                IDEUDMAmode3=(edtValue)*0.00384;

                IDEUDMAmode4=(edtValue)*0.0029090909;

                IDEUDMA33=(edtValue)*0.0058181818;

                IDEUDMA66=(edtValue)*0.0029090909;

                USB=(edtValue)*0.128;

                firewire=(edtValue)*0.00384;

                T0payload=(edtValue)*27.428571429;

                T0B8ZSpayload=(edtValue)*24;

                T1signal=(edtValue)*0.9948186528;

                T1payload=(edtValue)*1.1428571429;

                T1Zpayload=(edtValue)*0.9948186528;

                T1Csignal=(edtValue)*0.4873096447;

                T1Cpayload=(edtValue)*0.5714285714;

                T2signal=(edtValue)*0.2433460076;

                T3signal=(edtValue)*0.0343347639;

                T3payload=(edtValue)*0.0408163265;

                T3Zpayload=(edtValue)*0.0357142857;

                T4signal=(edtValue)*0.0056022409;

                EPTA1signal=(edtValue)*0.75;

                EPTA1payload=(edtValue)*0.8;

                EPTA2signal=(edtValue)*0.1818181818;

                EPTA2payload=(edtValue)*0.2;

                EPTA3signal=(edtValue)*0.0446927374;

                EPTA3payload=(edtValue)*0.05;

                H0=(edtValue)*4;

                H11=(edtValue)*1;

                H12=(edtValue)*0.8;

                VirtualTributary1signal=(edtValue)*0.8888888889;

                VirtualTributary1payload=(edtValue)*0.9948186528;

                VirtualTributary2signal=(edtValue)*0.6666666667;

                VirtualTributary2payload=(edtValue)*0.75;

                VirtualTributary6signal=(edtValue)*0.2433460076;

                VirtualTributary6payload=(edtValue)*0.256;

                STS1signal=(edtValue)*0.0296296296;

                STS1payload=(edtValue)*0.031030303;

                STS3signal=(edtValue)*0.0098765432;

                STS3payload=(edtValue)*0.0102171137;

                STS3csignal=(edtValue)*0.0098765432;

                STS3cpayload=(edtValue)*0.0102171137;

                STS12signal=(edtValue)*0.0024691358;

                STS24signal=(edtValue)*0.0012345679;

                STS48signal=(edtValue)*0.000617284;

                STS192signal=(edtValue)*0.000154321;

                STM1signal=(edtValue)*0.0098765432;

                STM4signal=(edtValue)*0.0024691358;

                STM16signal=(edtValue)*0.000617284;

                STM64signal=(edtValue)*0.000154321;

                break;
            case "H12":

                bitpersecond=(edtValue)*1920000;

                bytepersecond=(edtValue)*240000;

                kilobitpersecondSI=(edtValue)*1920;

                kilobytepersecondSI=(edtValue)*240;

                kilobitpersecond=(edtValue)*1875;

                kilobytepersecond=(edtValue)*234.375;

                megabitpersecondSI=(edtValue)*1.92;

                megabytepersecondSI=(edtValue)*0.24;

                megabitpersecond=(edtValue)*1.8310546875;

                megabytepersecond=(edtValue)*0.2288818359;

                gigabitpersecondSI=(edtValue)*0.00192;

                gigabytepersecondSI=(edtValue)*0.00024;

                gigabitpersecond=(edtValue)*0.0017881393;

                gigabytepersecond=(edtValue)*0.0002235174;

                terabitpersecondSI=(edtValue)*0.00000192;

                terabytepersecondSI=(edtValue)*2.4E-7;

                terabitpersecond=(edtValue)*0.0000017462;

                terabytepersecond=(edtValue)*2.182787284E-7;

                ethernet=(edtValue)*0.192;

                ethernetfast=(edtValue)*0.0192;

                ethernetgigabit=(edtValue)*0.00192;

                OC1=(edtValue)*0.037037037;

                OC3=(edtValue)*0.012345679;

                OC12=(edtValue)*0.0030864198;

                OC24=(edtValue)*0.0015432099;

                OC48=(edtValue)*0.0007716049;

                OC192=(edtValue)*0.0001929012;

                OC768=(edtValue)*0.0000482253;

                ISDNsinglechannel=(edtValue)*30;

                ISDNdualchannel=(edtValue)*15;

                modem110=(edtValue)*17454.545455;

                modem300=(edtValue)*6400;

                modem1200=(edtValue)*1600;

                modem2400=(edtValue)*800;

                modem9600=(edtValue)*200;

                modem14k=(edtValue)*133.33333333;

                modem28k=(edtValue)*66.666666667;

                modem33k=(edtValue)*57.142857143;

                modem56k=(edtValue)*34.285714286;

                SCSIAsync=(edtValue)*0.16;

                SCSISync=(edtValue)*0.048;

                SCSIFast=(edtValue)*0.024;

                SCSIFastUltra=(edtValue)*0.012;


                SCSIFastWide=(edtValue)*0.012;

                SCSIFastUltraWide=(edtValue)*0.006;

                SCSIUltra2=(edtValue)*0.003;

                SCSIUltra3=(edtValue)*0.0015;

                SCSILVDUltra80=(edtValue)*0.003;


                SCSILVDUltra160=(edtValue)*0.0015;

                IDEPIOmode0=(edtValue)*0.0727272727;

                IDEPIOmode1=(edtValue)*0.0461538462;

                IDEPIOmode2=(edtValue)*0.0289156627;

                IDEPIOmode3=(edtValue)*0.0216216216;

                IDEPIOmode4=(edtValue)*0.0144578313;

                IDEDMAmode0=(edtValue)*0.0571428571;

                IDEDMAmode1=(edtValue)*0.0180451128;

                IDEDMAmode2=(edtValue)*0.0144578313;

                IDEUDMAmode0=(edtValue)*0.0144578313;

                IDEUDMAmode1=(edtValue)*0.0096;

                IDEUDMAmode2=(edtValue)*0.0072727273;

                IDEUDMAmode3=(edtValue)*0.0048;

                IDEUDMAmode4=(edtValue)*0.0036363636;

                IDEUDMA33=(edtValue)*0.0072727273;

                IDEUDMA66=(edtValue)*0.0036363636;

                USB=(edtValue)*0.16;

                firewire=(edtValue)*0.0048;

                T0payload=(edtValue)*34.285714286;

                T0B8ZSpayload=(edtValue)*30;

                T1signal=(edtValue)*1.2435233161;

                T1payload=(edtValue)*1.4285714286;

                T1Zpayload=(edtValue)*1.2435233161;

                T1Csignal=(edtValue)*0.6091370558;

                T1Cpayload=(edtValue)*0.7142857143;

                T2signal=(edtValue)*0.3041825095;

                T3signal=(edtValue)*0.0429184549;

                T3payload=(edtValue)*0.0510204082;

                T3Zpayload=(edtValue)*0.0446428571;

                T4signal=(edtValue)*0.0070028011;

                EPTA1signal=(edtValue)*0.9375;

                EPTA1payload=(edtValue)*1;

                EPTA2signal=(edtValue)*0.2272727273;

                EPTA2payload=(edtValue)*0.25;

                EPTA3signal=(edtValue)*0.0558659218;

                EPTA3payload=(edtValue)*0.0625;

                H0=(edtValue)*5;

                H11=(edtValue)*1.25;

                H12=(edtValue)*1;

                VirtualTributary1signal=(edtValue)*1.1111111111;

                VirtualTributary1payload=(edtValue)*1.2435233161;

                VirtualTributary2signal=(edtValue)*0.8333333333;

                VirtualTributary2payload=(edtValue)*0.9375;

                VirtualTributary6signal=(edtValue)*0.3041825095;

                VirtualTributary6payload=(edtValue)*0.32;

                STS1signal=(edtValue)*0.037037037;

                STS1payload=(edtValue)*0.0387878788;

                STS3signal=(edtValue)*0.012345679;

                STS3payload=(edtValue)*0.0127713921;

                STS3csignal=(edtValue)*0.012345679;

                STS3cpayload=(edtValue)*0.0127713921;

                STS12signal=(edtValue)*0.0030864198;

                STS24signal=(edtValue)*0.0015432099;

                STS48signal=(edtValue)*0.0007716049;

                STS192signal=(edtValue)*0.0001929012;

                STM1signal=(edtValue)*0.012345679;

                STM4signal=(edtValue)*0.0030864198;

                STM16signal=(edtValue)*0.0007716049;

                STM64signal=(edtValue)*0.0001929012;

                break;
            case  "Virtual Tributary 1(signal)":

                bitpersecond=(edtValue)*1728000.0;

                bytepersecond=(edtValue)*216000;

                kilobitpersecondSI=(edtValue)*1728;

                kilobytepersecondSI=(edtValue)*216;

                kilobitpersecond=(edtValue)*1687.5;

                kilobytepersecond=(edtValue)*210.9375;

                megabitpersecondSI=(edtValue)*1.728;

                megabytepersecondSI=(edtValue)*0.216;

                megabitpersecond=(edtValue)*1.6479492188;

                megabytepersecond=(edtValue)*0.2059936523;

                gigabitpersecondSI=(edtValue)*0.001728;

                gigabytepersecondSI=(edtValue)*0.000216;

                gigabitpersecond=(edtValue)*0.0016093254;

                gigabytepersecond=(edtValue)*0.0002011657;

                terabitpersecondSI=(edtValue)*0.000001728;

                terabytepersecondSI=(edtValue)*2.16E-7;

                terabitpersecond=(edtValue)*0.0000015716;

                terabytepersecond=(edtValue)*1.964508555E-7;

                ethernet=(edtValue)*0.1728;

                ethernetfast=(edtValue)*0.01728;

                ethernetgigabit=(edtValue)*0.001728;

                OC1=(edtValue)*0.0333333333;

                OC3=(edtValue)*0.0111111111;

                OC12=(edtValue)*0.0027777778;

                OC24=(edtValue)*0.0013888889;

                OC48=(edtValue)*0.0006944444;

                OC192=(edtValue)*0.0001736111;

                OC768=(edtValue)*0.0000434028;

                ISDNsinglechannel=(edtValue)*27;

                ISDNdualchannel=(edtValue)*13.5;

                modem110=(edtValue)*15709.090909;

                modem300=(edtValue)*5760;

                modem1200=(edtValue)*1440;

                modem2400=(edtValue)*720;

                modem9600=(edtValue)*180;

                modem14k=(edtValue)*120;

                modem28k=(edtValue)*60;

                modem33k=(edtValue)*51.428571429;

                modem56k=(edtValue)*30.857142857;

                SCSIAsync=(edtValue)*0.144;

                SCSISync=(edtValue)*0.0432;

                SCSIFast=(edtValue)*0.0216;

                SCSIFastUltra=(edtValue)*0.0108;


                SCSIFastWide=(edtValue)*0.0108;

                SCSIFastUltraWide=(edtValue)*0.0054;

                SCSIUltra2=(edtValue)*0.0027;

                SCSIUltra3=(edtValue)*0.00135;

                SCSILVDUltra80=(edtValue)*0.0027;


                SCSILVDUltra160=(edtValue)*0.00135;

                IDEPIOmode0=(edtValue)*0.0654545455;

                IDEPIOmode1=(edtValue)*0.0415384615;

                IDEPIOmode2=(edtValue)*0.0260240964;

                IDEPIOmode3=(edtValue)*0.0194594595;

                IDEPIOmode4=(edtValue)*0.0130120482;

                IDEDMAmode0=(edtValue)*0.0514285714;

                IDEDMAmode1=(edtValue)*0.0162406015;

                IDEDMAmode2=(edtValue)*0.0130120482;

                IDEUDMAmode0=(edtValue)*0.0130120482;

                IDEUDMAmode1=(edtValue)*0.00864;

                IDEUDMAmode2=(edtValue)*0.0065454545;

                IDEUDMAmode3=(edtValue)*0.00432;

                IDEUDMAmode4=(edtValue)*0.0032727273;

                IDEUDMA33=(edtValue)*0.0065454545;

                IDEUDMA66=(edtValue)*0.0032727273;

                USB=(edtValue)*0.144;

                firewire=(edtValue)*0.00432;

                T0payload=(edtValue)*30.857142857;

                T0B8ZSpayload=(edtValue)*27;

                T1signal=(edtValue)*1.1191709845;

                T1payload=(edtValue)*1.2857142857;

                T1Zpayload=(edtValue)*1.1191709845;

                T1Csignal=(edtValue)*0.5482233503;

                T1Cpayload=(edtValue)*0.6428571429;

                T2signal=(edtValue)*0.2737642586;

                T3signal=(edtValue)*0.0386266094;

                T3payload=(edtValue)*0.0459183673;

                T3Zpayload=(edtValue)*0.0401785714;

                T4signal=(edtValue)*0.006302521;

                EPTA1signal=(edtValue)*0.84375;

                EPTA1payload=(edtValue)*0.9;

                EPTA2signal=(edtValue)*0.2045454545;

                EPTA2payload=(edtValue)*0.225;

                EPTA3signal=(edtValue)*0.0502793296;

                EPTA3payload=(edtValue)*0.05625;

                H0=(edtValue)*4.5;

                H11=(edtValue)*1.125;

                H12=(edtValue)*0.9;

                VirtualTributary1signal=(edtValue)*1;

                VirtualTributary1payload=(edtValue)*1.1191709845;

                VirtualTributary2signal=(edtValue)*0.75;

                VirtualTributary2payload=(edtValue)*0.84375;

                VirtualTributary6signal=(edtValue)*0.2737642586;

                VirtualTributary6payload=(edtValue)*0.288;

                STS1signal=(edtValue)*0.0333333333;

                STS1payload=(edtValue)*0.0349090909;

                STS3signal=(edtValue)*.0111111111;

                STS3payload=(edtValue)*0.0114942529;

                STS3csignal=(edtValue)*0.0111111111;

                STS3cpayload=(edtValue)*0.0114942529;

                STS12signal=(edtValue)*0.0027777778;

                STS24signal=(edtValue)*0.0013888889;

                STS48signal=(edtValue)*0.0006944444;

                STS192signal=(edtValue)*0.0001736111;

                STM1signal=(edtValue)*0.0111111111;

                STM4signal=(edtValue)*0.0027777778;

                STM16signal=(edtValue)*0.0006944444;

                STM64signal=(edtValue)*0.0001736111;

                break;
            case "Virtual Tributary 1(payload)":

                bitpersecond=(edtValue)*1544000.0;

                bytepersecond=(edtValue)*193000.0;

                kilobitpersecondSI=(edtValue)*1544;

                kilobytepersecondSI=(edtValue)*1507.8125;

                kilobitpersecond=(edtValue)*188.4765625;

                kilobytepersecond=(edtValue)*1.544;

                megabitpersecondSI=(edtValue)*0.193;

                megabytepersecondSI=(edtValue)*1.4724731445;

                megabitpersecond=(edtValue)*0.1840591431;

                megabytepersecond=(edtValue)*0.001544;

                gigabitpersecondSI=(edtValue)*0.000193;

                gigabytepersecondSI=(edtValue)*0.0014379621;

                gigabitpersecond=(edtValue)*0.0001797453;

                gigabytepersecond=(edtValue)*0.000001544;

                terabitpersecondSI=(edtValue)*1.93E-7;

                terabytepersecondSI=(edtValue)*0.0000014043;

                terabitpersecond=(edtValue)*1.755324774E-7;

                terabytepersecond=(edtValue)*0.1544;

                ethernet=(edtValue)*0.001544;

                ethernetfast=(edtValue)*0.01544;

                ethernetgigabit=(edtValue)*0.001544;

                OC1=(edtValue)*0.0297839506;

                OC3=(edtValue)*0.0099279835;

                OC12=(edtValue)*0.0024819959;

                OC24=(edtValue)*0.0012409979;

                OC48=(edtValue)*0.000620499;

                OC192=(edtValue)*0.0001551247;

                OC768=(edtValue)*0.0000387812;

                ISDNsinglechannel=(edtValue)*24.125;

                ISDNdualchannel=(edtValue)*12.0625;

                modem110=(edtValue)*14036.363636;

                modem300=(edtValue)*5146.6666667;

                modem1200=(edtValue)*1286.6666667;

                modem2400=(edtValue)*643.33333333;

                modem9600=(edtValue)*160.83333333;

                modem14k=(edtValue)*107.22222222;

                modem28k=(edtValue)*53.611111111;

                modem33k=(edtValue)*45.952380952;

                modem56k=(edtValue)*27.571428571;

                SCSIAsync=(edtValue)*0.1286666667;

                SCSISync=(edtValue)*0.0386;

                SCSIFast=(edtValue)*0.0193;

                SCSIFastUltra=(edtValue)*0.00965;


                SCSIFastWide=(edtValue)*0.00965;

                SCSIFastUltraWide=(edtValue)*0.004825;

                SCSIUltra2=(edtValue)*0.0024125;

                SCSIUltra3=(edtValue)*0.00120625;

                SCSILVDUltra80=(edtValue)*0.0024125;


                SCSILVDUltra160=(edtValue)*0.00120625;

                IDEPIOmode0=(edtValue)*0.0584848485;

                IDEPIOmode1=(edtValue)*0.0371153846;

                IDEPIOmode2=(edtValue)*0.023253012;

                IDEPIOmode3=(edtValue)*0.0173873874;

                IDEPIOmode4=(edtValue)*0.011626506;

                IDEDMAmode0=(edtValue)*0.045952381;

                IDEDMAmode1=(edtValue)*0.0145112782;

                IDEDMAmode2=(edtValue)*0.011626506;

                IDEUDMAmode0=(edtValue)*0.011626506;

                IDEUDMAmode1=(edtValue)*0.00772;

                IDEUDMAmode2=(edtValue)*0.0058484848;

                IDEUDMAmode3=(edtValue)*0.00386;

                IDEUDMAmode4=(edtValue)*0.0029242424;

                IDEUDMA33=(edtValue)*0.0058484848;

                IDEUDMA66=(edtValue)*0.0029242424;

                USB=(edtValue)*0.1286666667;

                firewire=(edtValue)*0.00386;

                T0payload=(edtValue)*27.571428571;

                T0B8ZSpayload=(edtValue)*24.125;

                T1signal=(edtValue)*1;

                T1payload=(edtValue)*1.1488095238;

                T1Zpayload=(edtValue)*1;

                T1Csignal=(edtValue)*0.4898477157;

                T1Cpayload=(edtValue)*0.5744047619;

                T2signal=(edtValue)*0.2446134347;

                T3signal=(edtValue)*0.0345135908;

                T3payload=(edtValue)*0.0410289116;

                T3Zpayload=(edtValue)*0.0359002976;

                T4signal=(edtValue)*0.0056314192;

                EPTA1signal=(edtValue)*0.75390625;

                EPTA1payload=(edtValue)*0.8041666667;

                EPTA2signal=(edtValue)*0.1827651515;

                EPTA2payload=(edtValue)*0.2010416667;

                EPTA3signal=(edtValue)*0.0449255121;

                EPTA3payload=(edtValue)*0.0502604167;

                H0=(edtValue)*4.0208333333;

                H11=(edtValue)*1.0052083333;

                H12=(edtValue)*0.8041666667;

                VirtualTributary1signal=(edtValue)*0.8935185185;

                VirtualTributary1payload=(edtValue)*1;

                VirtualTributary2signal=(edtValue)*0.6701388889;

                VirtualTributary2payload=(edtValue)*0.75390625;

                VirtualTributary6signal=(edtValue)*0.2446134347;

                VirtualTributary6payload=(edtValue)*0.2573333333;

                STS1signal=(edtValue)*0.0297839506;

                STS1payload=(edtValue)*0.0311919192;

                STS3signal=(edtValue)*0.0099279835;

                STS3payload=(edtValue)*0.0102703278;

                STS3csignal=(edtValue)*0.0099279835;

                STS3cpayload=(edtValue)*0.0102703278;

                STS12signal=(edtValue)*0.0024819959;

                STS24signal=(edtValue)*0.0012409979;

                STS48signal=(edtValue)*0.000620499;

                STS192signal=(edtValue)*0.0001551247;

                STM1signal=(edtValue)*0.0099279835;

                STM4signal=(edtValue)*0.0024819959;

                STM16signal=(edtValue)*0.000620499;

                STM64signal=(edtValue)*0.0001551247;

                break;
            case "Virtual Tributary 2(signal)":

                bitpersecond=(edtValue)*2304000;

                bytepersecond=(edtValue)*288000;

                kilobitpersecondSI=(edtValue)*2304;

                kilobytepersecondSI=(edtValue)*288;

                kilobitpersecond=(edtValue)*2250;

                kilobytepersecond=(edtValue)*281.25;

                megabitpersecondSI=(edtValue)*2.304;

                megabytepersecondSI=(edtValue)*0.288;

                megabitpersecond=(edtValue)*2.197265625;

                megabytepersecond=(edtValue)*0.2746582031;

                gigabitpersecondSI=(edtValue)*0.002304;

                gigabytepersecondSI=(edtValue)*0.000288;

                gigabitpersecond=(edtValue)*0.0021457672;

                gigabytepersecond=(edtValue)*0.0002682209;

                terabitpersecondSI=(edtValue)*0.000002304;

                terabytepersecondSI=(edtValue)*2.879999999E-7;

                terabitpersecond=(edtValue)*0.0000020955;

                terabytepersecond=(edtValue)*2.619344741E-7;

                ethernet=(edtValue)*0.2304;

                ethernetfast=(edtValue)*0.02304;

                ethernetgigabit=(edtValue)*0.002304;

                OC1=(edtValue)*0.0444444444;

                OC3=(edtValue)*0.0148148148;

                OC12=(edtValue)*0.0037037037;

                OC24=(edtValue)*0.0018518519;

                OC48=(edtValue)*0.0018518519;

                OC192=(edtValue)*0.0002314815;

                OC768=(edtValue)*0.0000578704;

                ISDNsinglechannel=(edtValue)*36;

                ISDNdualchannel=(edtValue)*18;

                modem110=(edtValue)*20945.454545;

                modem300=(edtValue)*7680;

                modem1200=(edtValue)*1920;

                modem2400=(edtValue)*960;

                modem9600=(edtValue)*240;

                modem14k=(edtValue)*160;

                modem28k=(edtValue)*80;

                modem33k=(edtValue)*68.571428571;

                modem56k=(edtValue)*41.142857143;

                SCSIAsync=(edtValue)*0.192;

                SCSISync=(edtValue)*0.0576;

                SCSIFast=(edtValue)*0.0288;

                SCSIFastUltra=(edtValue)*0.0144;


                SCSIFastWide=(edtValue)*0.0144;

                SCSIFastUltraWide=(edtValue)*0.0072;

                SCSIUltra2=(edtValue)*0.0036;

                SCSIUltra3=(edtValue)*0.0018;

                SCSILVDUltra80=(edtValue)*0.0036;


                SCSILVDUltra160=(edtValue)*0.0018;

                IDEPIOmode0=(edtValue)*0.0872727273;

                IDEPIOmode1=(edtValue)*0.0553846154;

                IDEPIOmode2=(edtValue)*0.0346987952;

                IDEPIOmode3=(edtValue)*0.0259459459;

                IDEPIOmode4=(edtValue)*0.0173493976;

                IDEDMAmode0=(edtValue)*0.0685714286;

                IDEDMAmode1=(edtValue)*0.0216541353;

                IDEDMAmode2=(edtValue)*0.0173493976;

                IDEUDMAmode0=(edtValue)*0.0173493976;

                IDEUDMAmode1=(edtValue)*0.01152;

                IDEUDMAmode2=(edtValue)*0.0087272727;

                IDEUDMAmode3=(edtValue)*0.00576;

                IDEUDMAmode4=(edtValue)*0.0043636364;

                IDEUDMA33=(edtValue)*0.0087272727;

                IDEUDMA66=(edtValue)*0.0043636364;

                USB=(edtValue)*0.192;

                firewire=(edtValue)*0.00576;

                T0payload=(edtValue)*41.142857143;

                T0B8ZSpayload=(edtValue)*36;

                T1signal=(edtValue)*1.4922279793;

                T1payload=(edtValue)*1.7142857143;

                T1Zpayload=(edtValue)*1.4922279793;

                T1Csignal=(edtValue)*0.730964467;

                T1Cpayload=(edtValue)*0.8571428571;

                T2signal=(edtValue)*0.3650190114;

                T3signal=(edtValue)*0.0515021459;

                T3payload=(edtValue)*0.0612244898;

                T3Zpayload=(edtValue)*0.0535714286;

                T4signal=(edtValue)*0.0084033613;

                EPTA1signal=(edtValue)*1.125;

                EPTA1payload=(edtValue)*1.2;

                EPTA2signal=(edtValue)*0.2727272727;

                EPTA2payload=(edtValue)*0.3;

                EPTA3signal=(edtValue)*0.0670391061;

                EPTA3payload=(edtValue)*0.075;

                H0=(edtValue)*6;

                H11=(edtValue)*1.5;

                H12=(edtValue)*1.2;

                VirtualTributary1signal=(edtValue)*1.3333333333;

                VirtualTributary1payload=(edtValue)*1.4922279793;

                VirtualTributary2signal=(edtValue)*1;

                VirtualTributary2payload=(edtValue)*1.125;

                VirtualTributary6signal=(edtValue)*0.3650190114;

                VirtualTributary6payload=(edtValue)*0.384;

                STS1signal=(edtValue)*0.0444444444;

                STS1payload=(edtValue)*0.0465454545;

                STS3signal=(edtValue)*0.0148148148;

                STS3payload=(edtValue)*0.0153256705;

                STS3csignal=(edtValue)*0.0148148148;

                STS3cpayload=(edtValue)*0.0153256705;

                STS12signal=(edtValue)*0.0037037037;

                STS24signal=(edtValue)*0.0018518519;

                STS48signal=(edtValue)*0.0009259259;

                STS192signal=(edtValue)*0.0002314815;

                STM1signal=(edtValue)*0.0148148148;

                STM4signal=(edtValue)*0.0037037037;

                STM16signal=(edtValue)*0.0009259259;

                STM64signal=(edtValue)*0.0002314815;

                break;

            case "Virtual Tributary 2(payload)":

                bitpersecond=(edtValue)*2048000.0;

                bytepersecond=(edtValue)*256000;

                kilobitpersecondSI=(edtValue)*2048;

                kilobytepersecondSI=(edtValue)*256;

                kilobitpersecond=(edtValue)*2000;

                kilobytepersecond=(edtValue)*250;

                megabitpersecondSI=(edtValue)*2.048;

                megabytepersecondSI=(edtValue)*0.256;

                megabitpersecond=(edtValue)*1.953125;

                megabytepersecond=(edtValue)*0.244140625;

                gigabitpersecondSI=(edtValue)*0.002048;

                gigabytepersecondSI=(edtValue)*0.000256;

                gigabitpersecond=(edtValue)*0.0019073486;

                gigabytepersecond=(edtValue)*0.0002384186;

                terabitpersecondSI=(edtValue)*0.000002048;

                terabytepersecondSI=(edtValue)*2.56E-7;

                terabitpersecond=(edtValue)*0.0000018626;

                terabytepersecond=(edtValue)*2.328306436E-7;

                ethernet=(edtValue)*0.2048;

                ethernetfast=(edtValue)*0.02048;

                ethernetgigabit=(edtValue)*0.002048;

                OC1=(edtValue)*0.0395061728;

                OC3=(edtValue)*0.0131687243;

                OC12=(edtValue)*0.0032921811;

                OC24=(edtValue)*0.0016460905;

                OC48=(edtValue)*0.0008230453;

                OC192=(edtValue)*0.0002057613;

                OC768=(edtValue)*0.0000514403;

                ISDNsinglechannel=(edtValue)*32;

                ISDNdualchannel=(edtValue)*16;

                modem110=(edtValue)*18618.181818;

                modem300=(edtValue)*6826.6666667;

                modem1200=(edtValue)*1706.6666667;

                modem2400=(edtValue)*853.33333333;

                modem9600=(edtValue)*213.33333333;

                modem14k=(edtValue)*142.22222222;

                modem28k=(edtValue)*71.111111111;

                modem33k=(edtValue)*60.952380952;

                modem56k=(edtValue)*36.571428571;

                SCSIAsync=(edtValue)*0.1706666667;

                SCSISync=(edtValue)*0.0512;

                SCSIFast=(edtValue)*0.0256;

                SCSIFastUltra=(edtValue)*0.0128;


                SCSIFastWide=(edtValue)*0.0128;

                SCSIFastUltraWide=(edtValue)*0.0064;

                SCSIUltra2=(edtValue)*0.0032;

                SCSIUltra3=(edtValue)*0.0016;

                SCSILVDUltra80=(edtValue)*0.0032;


                SCSILVDUltra160=(edtValue)*0.0016;

                IDEPIOmode0=(edtValue)*0.0775757576;

                IDEPIOmode1=(edtValue)*0.0492307692;

                IDEPIOmode2=(edtValue)*0.0308433735;

                IDEPIOmode3=(edtValue)*0.0230630631;

                IDEPIOmode4=(edtValue)*0.0154216867;

                IDEDMAmode0=(edtValue)*0.060952381;

                IDEDMAmode1=(edtValue)*0.0192481203;

                IDEDMAmode2=(edtValue)*0.0154216867;

                IDEUDMAmode0=(edtValue)*0.0154216867;

                IDEUDMAmode1=(edtValue)*0.01024;

                IDEUDMAmode2=(edtValue)*0.0077575758;

                IDEUDMAmode3=(edtValue)*0.00512;

                IDEUDMAmode4=(edtValue)*0.0038787879;

                IDEUDMA33=(edtValue)*0.0077575758;

                IDEUDMA66=(edtValue)*0.0038787879;

                USB=(edtValue)*0.1706666667;

                firewire=(edtValue)*0.00512;

                T0payload=(edtValue)*36.571428571;

                T0B8ZSpayload=(edtValue)*32;

                T1signal=(edtValue)*1.3264248705;

                T1payload=(edtValue)*1.5238095238;

                T1Zpayload=(edtValue)*1.3264248705;

                T1Csignal=(edtValue)*0.6497461929;

                T1Cpayload=(edtValue)*0.7619047619;

                T2signal=(edtValue)*0.3244613435;

                T3signal=(edtValue)*0.0457796853;

                T3payload=(edtValue)*0.0544217687;

                T3Zpayload=(edtValue)*0.0476190476;

                T4signal=(edtValue)*0.0074696545;

                EPTA1signal=(edtValue)*1;

                EPTA1payload=(edtValue)*1.0666666667;

                EPTA2signal=(edtValue)*0.2424242424;

                EPTA2payload=(edtValue)*0.2666666667;

                EPTA3signal=(edtValue)*0.0595903166;

                EPTA3payload=(edtValue)*0.0666666667;

                H0=(edtValue)*5.3333333333;

                H11=(edtValue)*1.3333333333;

                H12=(edtValue)*1.0666666667;

                VirtualTributary1signal=(edtValue)*1.1851851852;

                VirtualTributary1payload=(edtValue)*1.3264248705;

                VirtualTributary2signal=(edtValue)*0.8888888889;

                VirtualTributary2payload=(edtValue)*1;

                VirtualTributary6signal=(edtValue)*0.3244613435;

                VirtualTributary6payload=(edtValue)*0.3413333333;

                STS1signal=(edtValue)*0.0395061728;

                STS1payload=(edtValue)*0.0413737374;

                STS3signal=(edtValue)*0.0131687243;

                STS3payload=(edtValue)*0.0136228182;

                STS3csignal=(edtValue)*0.0131687243;

                STS3cpayload=(edtValue)*0.0136228182;

                STS12signal=(edtValue)*0.0032921811;

                STS24signal=(edtValue)*0.0016460905;

                STS48signal=(edtValue)*0.0008230453;

                STS192signal=(edtValue)*0.0002057613;

                STM1signal=(edtValue)*0.0131687243;

                STM4signal=(edtValue)*0.0032921811;

                STM16signal=(edtValue)*0.0008230453;

                STM64signal=(edtValue)*0.0002057613;

                break;

            case  "Virtual Tributary 6(signal)":

                bitpersecond=(edtValue)*6312000.0;

                bytepersecond=(edtValue)*789000;

                kilobitpersecondSI=(edtValue)*6312;

                kilobytepersecondSI=(edtValue)*789;

                kilobitpersecond=(edtValue)*6164.0625;

                kilobytepersecond=(edtValue)*770.5078125;

                megabitpersecondSI=(edtValue)*6.312;

                megabytepersecondSI=(edtValue)*0.789;

                megabitpersecond=(edtValue)*6.0195922852;

                megabytepersecond=(edtValue)*0.7524490356;

                gigabitpersecondSI=(edtValue)*0.006312;

                gigabytepersecondSI=(edtValue)*0.000789;

                gigabitpersecond=(edtValue)*0.0058785081;

                gigabytepersecond=(edtValue)*0.0007348135;

                terabitpersecondSI=(edtValue)*0.000006312;

                terabytepersecondSI=(edtValue)*7.89E-7;

                terabitpersecond=(edtValue)*0.0000057407;

                terabytepersecond=(edtValue)*7.175913196E-7;

                ethernet=(edtValue)*0.6312;

                ethernetfast=(edtValue)*0.06312;

                ethernetgigabit=(edtValue)*0.006312;

                OC1=(edtValue)*0.1217592593;

                OC3=(edtValue)*0.0405864198;

                OC12=(edtValue)*0.0101466049;

                OC24=(edtValue)*0.0050733025;

                OC48=(edtValue)*0.0025366512;

                OC192=(edtValue)*0.0006341628;

                OC768=(edtValue)*0.0001585407;

                ISDNsinglechannel=(edtValue)*98.625;

                ISDNdualchannel=(edtValue)*49.3125;

                modem110=(edtValue)*57381.818182;

                modem300=(edtValue)*21040;

                modem1200=(edtValue)*5260;

                modem2400=(edtValue)*2630;

                modem9600=(edtValue)*657.5;

                modem14k=(edtValue)*438.33333333;

                modem28k=(edtValue)*219.16666667;

                modem33k=(edtValue)*187.85714286;

                modem56k=(edtValue)*112.71428571;

                SCSIAsync=(edtValue)*0.526;

                SCSISync=(edtValue)*0.1578;

                SCSIFast=(edtValue)*0.0789;

                SCSIFastUltra=(edtValue)*0.03945;


                SCSIFastWide=(edtValue)*0.03945;

                SCSIFastUltraWide=(edtValue)*0.019725;

                SCSIUltra2=(edtValue)*0.0098625;

                SCSIUltra3=(edtValue)*0.00493125;

                SCSILVDUltra80=(edtValue)*0.0098625;


                SCSILVDUltra160=(edtValue)*0.00493125;

                IDEPIOmode0=(edtValue)*0.2390909091;

                IDEPIOmode1=(edtValue)*0.1517307692;

                IDEPIOmode2=(edtValue)*0.095060241;

                IDEPIOmode3=(edtValue)*0.0710810811;

                IDEPIOmode4=(edtValue)*0.0475301205;

                IDEDMAmode0=(edtValue)*0.1878571429;

                IDEDMAmode1=(edtValue)*0.0593233083;

                IDEDMAmode2=(edtValue)*0.0475301205;

                IDEUDMAmode0=(edtValue)*0.0475301205;

                IDEUDMAmode1=(edtValue)*0.03156;

                IDEUDMAmode2=(edtValue)*0.0239090909;

                IDEUDMAmode3=(edtValue)*0.01578;

                IDEUDMAmode4=(edtValue)*0.0119545455;

                IDEUDMA33=(edtValue)*0.0239090909;

                IDEUDMA66=(edtValue)*0.0119545455;

                USB=(edtValue)*0.526;

                firewire=(edtValue)*0.01578;

                T0payload=(edtValue)*112.71428571;

                T0B8ZSpayload=(edtValue)*98.625;

                T1signal=(edtValue)*4.0880829016;

                T1payload=(edtValue)*4.6964285714;

                T1Zpayload=(edtValue)*4.0880829016;

                T1Csignal=(edtValue)*2.0025380711;

                T1Cpayload=(edtValue)*2.3482142857;

                T2signal=(edtValue)*1;

                T3signal=(edtValue)*0.1410944206;

                T3payload=(edtValue)*0.1677295918;

                T3Zpayload=(edtValue)*0.1467633929;

                T4signal=(edtValue)*0.0230217087;

                EPTA1signal=(edtValue)*3.08203125;

                EPTA1payload=(edtValue)*3.2875;

                EPTA2signal=(edtValue)*0.7471590909;

                EPTA2payload=(edtValue)*0.821875;

                EPTA3signal=(edtValue)*0.1836592179;

                EPTA3payload=(edtValue)*0.20546875;

                H0=(edtValue)*16.4375;

                H11=(edtValue)*4.109375;

                H12=(edtValue)*3.2875;

                VirtualTributary1signal=(edtValue)*3.6527777778;

                VirtualTributary1payload=(edtValue)*4.0880829016;

                VirtualTributary2signal=(edtValue)*2.7395833333;

                VirtualTributary2payload=(edtValue)*3.08203125;

                VirtualTributary6signal=(edtValue)*1;

                VirtualTributary6payload=(edtValue)*1.052;

                STS1signal=(edtValue)*0.1217592593;

                STS1payload=(edtValue)*0.1275151515;

                STS3signal=(edtValue)*0.0405864198;

                STS3payload=(edtValue)*0.0419859515;

                STS3csignal=(edtValue)*0.0405864198;

                STS3cpayload=(edtValue)*0.0419859515;

                STS12signal=(edtValue)*0.0101466049;

                STS24signal=(edtValue)*0.0050733025;

                STS48signal=(edtValue)*0.0025366512;

                STS192signal=(edtValue)*0.0006341628;

                STM1signal=(edtValue)*0.0405864198;

                STM4signal=(edtValue)*0.0101466049;

                STM16signal=(edtValue)*0.0025366512;

                STM64signal=(edtValue)*0.0006341628;

                break;

            case "Virtual Tributary 6(payload)":

                bitpersecond=(edtValue)*6000000.0;

                bytepersecond=(edtValue)*750000;

                kilobitpersecondSI=(edtValue)*6000;

                kilobytepersecondSI=(edtValue)*750;

                kilobitpersecond=(edtValue)*5859.375;

                kilobytepersecond=(edtValue)*732.421875;

                megabitpersecondSI=(edtValue)*6;

                megabytepersecondSI=(edtValue)*0.75;

                megabitpersecond=(edtValue)*5.7220458984;

                megabytepersecond=(edtValue)*0.7152557373;

                gigabitpersecondSI=(edtValue)*0.006;

                gigabytepersecondSI=(edtValue)*0.00075;

                gigabitpersecond=(edtValue)*0.0055879354;

                gigabytepersecond=(edtValue)*0.0006984919;

                terabitpersecondSI=(edtValue)*0.000006;

                terabytepersecondSI=(edtValue)*7.499999999E-7;

                terabitpersecond=(edtValue)*0.000005457;

                terabytepersecond=(edtValue)*6.821210263E-7;

                ethernet=(edtValue)*0.6;

                ethernetfast=(edtValue)*0.06;

                ethernetgigabit=(edtValue)*0.006;

                OC1=(edtValue)*0.1157407407;

                OC3=(edtValue)*0.0385802469;

                OC12=(edtValue)*0.0096450617;

                OC24=(edtValue)*0.0048225309;

                OC48=(edtValue)*0.0024112654;

                OC192=(edtValue)*0.0006028164;

                OC768=(edtValue)*0.0001507041;

                ISDNsinglechannel=(edtValue)*93.75;

                ISDNdualchannel=(edtValue)*46.875;

                modem110=(edtValue)*54545.454545;

                modem300=(edtValue)*20000;

                modem1200=(edtValue)*5000;

                modem2400=(edtValue)*2500;

                modem9600=(edtValue)*625;

                modem14k=(edtValue)*416.66666667;

                modem28k=(edtValue)*208.33333333;

                modem33k=(edtValue)*178.57142857;

                modem56k=(edtValue)*107.14285714;

                SCSIAsync=(edtValue)*0.5;

                SCSISync=(edtValue)*0.15;

                SCSIFast=(edtValue)*0.075;

                SCSIFastUltra=(edtValue)*0.0375;


                SCSIFastWide=(edtValue)*0.0375;

                SCSIFastUltraWide=(edtValue)*0.01875;

                SCSIUltra2=(edtValue)*0.009375;

                SCSIUltra3=(edtValue)*0.0046875;

                SCSILVDUltra80=(edtValue)*0.009375;


                SCSILVDUltra160=(edtValue)*0.0046875;

                IDEPIOmode0=(edtValue)*0.2272727273;

                IDEPIOmode1=(edtValue)*0.1442307692;

                IDEPIOmode2=(edtValue)*0.0903614458;

                IDEPIOmode3=(edtValue)*0.0675675676;

                IDEPIOmode4=(edtValue)*0.0451807229;

                IDEDMAmode0=(edtValue)*0.1785714286;

                IDEDMAmode1=(edtValue)*0.0563909774;

                IDEDMAmode2=(edtValue)*0.0451807229;

                IDEUDMAmode0=(edtValue)*0.0451807229;

                IDEUDMAmode1=(edtValue)*0.03;

                IDEUDMAmode2=(edtValue)*0.0227272727;

                IDEUDMAmode3=(edtValue)*0.015;

                IDEUDMAmode4=(edtValue)*0.0113636364;

                IDEUDMA33=(edtValue)*0.0227272727;

                IDEUDMA66=(edtValue)*0.0113636364;

                USB=(edtValue)*0.5;

                firewire=(edtValue)*0.015;

                T0payload=(edtValue)*107.14285714;

                T0B8ZSpayload=(edtValue)*93.75;

                T1signal=(edtValue)*3.8860103627;

                T1payload=(edtValue)*4.4642857143;

                T1Zpayload=(edtValue)*3.8860103627;

                T1Csignal=(edtValue)*1.9035532995;

                T1Cpayload=(edtValue)*2.2321428571;

                T2signal=(edtValue)*0.9505703422;

                T3signal=(edtValue)*0.1341201717;

                T3payload=(edtValue)*0.1594387755;

                T3Zpayload=(edtValue)*0.1395089286;

                T4signal=(edtValue)*0.0218837535;

                EPTA1signal=(edtValue)*2.9296875;

                EPTA1payload=(edtValue)*3.125;

                EPTA2signal=(edtValue)*0.7102272727;

                EPTA2payload=(edtValue)*0.78125;

                EPTA3signal=(edtValue)*0.1745810056;

                EPTA3payload=(edtValue)*0.1953125;

                H0=(edtValue)*15.625;

                H11=(edtValue)*3.90625;

                H12=(edtValue)*3.125;

                VirtualTributary1signal=(edtValue)*3.4722222222;

                VirtualTributary1payload=(edtValue)*3.8860103627;

                VirtualTributary2signal=(edtValue)*2.6041666667;

                VirtualTributary2payload=(edtValue)*2.9296875;

                VirtualTributary6signal=(edtValue)*0.9505703422;

                VirtualTributary6payload=(edtValue)*1;

                STS1signal=(edtValue)*0.1157407407;

                STS1payload=(edtValue)*0.1212121212;

                STS3signal=(edtValue)*0.0385802469;

                STS3payload=(edtValue)*0.0399106003;

                STS3csignal=(edtValue)*0.0385802469;

                STS3cpayload=(edtValue)*0.0399106003;

                STS12signal=(edtValue)*0.0096450617;

                STS24signal=(edtValue)*0.0048225309;

                STS48signal=(edtValue)*0.0024112654;

                STS192signal=(edtValue)*0.0006028164;

                STM1signal=(edtValue)*0.0385802469;

                STM4signal=(edtValue)*0.0096450617;

                STM16signal=(edtValue)*0.0024112654;

                STM64signal=(edtValue)*0.0006028164;

                break;

            case "STS1(signal)":

                bitpersecond=(edtValue)*51840000.0;

                bytepersecond=(edtValue)*6480000;

                kilobitpersecondSI=(edtValue)*51840;

                kilobytepersecondSI=(edtValue)*6480;

                kilobitpersecond=(edtValue)*50625;

                kilobytepersecond=(edtValue)*6328.125;

                megabitpersecondSI=(edtValue)*51.84;

                megabytepersecondSI=(edtValue)*6.48;

                megabitpersecond=(edtValue)*49.438476563;

                megabytepersecond=(edtValue)*6.1798095703;

                gigabitpersecondSI=(edtValue)*0.05184;

                gigabytepersecondSI=(edtValue)*0.00648;

                gigabitpersecond=(edtValue)*0.0482797623;

                gigabytepersecond=(edtValue)*0.0060349703;

                terabitpersecondSI=(edtValue)*0.00005184;

                terabytepersecondSI=(edtValue)*0.00000648;

                terabitpersecond=(edtValue)*0.0000471482;

                terabytepersecond=(edtValue)*0.0000058935;

                ethernet=(edtValue)*5.184;

                ethernetfast=(edtValue)*0.5184;

                ethernetgigabit=(edtValue)*0.05184;

                OC1=(edtValue)*1;

                OC3=(edtValue)*0.3333333333;

                OC12=(edtValue)*0.0833333333;

                OC24=(edtValue)*0.0416666667;

                OC48=(edtValue)*0.0208333333;

                OC192=(edtValue)*0.0052083333;

                OC768=(edtValue)*0.0013020833;

                ISDNsinglechannel=(edtValue)*810;

                ISDNdualchannel=(edtValue)*405;

                modem110=(edtValue)*471272.72727;

                modem300=(edtValue)*172800;

                modem1200=(edtValue)*43200;

                modem2400=(edtValue)*21600;

                modem9600=(edtValue)*5400;

                modem14k=(edtValue)*3600;

                modem28k=(edtValue)*1800;

                modem33k=(edtValue)*1542.8571429;

                modem56k=(edtValue)*925.71428571;

                SCSIAsync=(edtValue)*4.32;

                SCSISync=(edtValue)*1.296;

                SCSIFast=(edtValue)*0.648;

                SCSIFastUltra=(edtValue)*0.324;


                SCSIFastWide=(edtValue)*0.324;

                SCSIFastUltraWide=(edtValue)*0.162;

                SCSIUltra2=(edtValue)*0.081;

                SCSIUltra3=(edtValue)*0.0405;

                SCSILVDUltra80=(edtValue)*0.081;


                SCSILVDUltra160=(edtValue)*0.0405;

                IDEPIOmode0=(edtValue)*1.9636363636;

                IDEPIOmode1=(edtValue)*1.2461538462;

                IDEPIOmode2=(edtValue)*0.7807228916;

                IDEPIOmode3=(edtValue)*0.5837837838;

                IDEPIOmode4=(edtValue)*0.3903614458;

                IDEDMAmode0=(edtValue)*0.3903614458;

                IDEDMAmode1=(edtValue)*0.4872180451;

                IDEDMAmode2=(edtValue)*0.3903614458;

                IDEUDMAmode0=(edtValue)*0.3903614458;

                IDEUDMAmode1=(edtValue)*0.2592;

                IDEUDMAmode2=(edtValue)*0.1963636364;

                IDEUDMAmode3=(edtValue)*0.1296;

                IDEUDMAmode4=(edtValue)*0.0981818182;

                IDEUDMA33=(edtValue)*0.1963636364;

                IDEUDMA66=(edtValue)*0.0981818182;

                USB=(edtValue)*4.32;

                firewire=(edtValue)*0.1296;

                T0payload=(edtValue)*925.71428571;

                T0B8ZSpayload=(edtValue)*810;

                T1signal=(edtValue)*33.575129534;

                T1payload=(edtValue)*38.571428571;

                T1Zpayload=(edtValue)*33.575129534;

                T1Csignal=(edtValue)*16.446700508;

                T1Cpayload=(edtValue)*19.285714286;

                T2signal=(edtValue)*8.2129277567;

                T3signal=(edtValue)*1.1587982833;

                T3payload=(edtValue)*1.3775510204;

                T3Zpayload=(edtValue)*1.2053571429;

                T4signal=(edtValue)*0.1890756303;

                EPTA1signal=(edtValue)*25.3125;

                EPTA1payload=(edtValue)*27;

                EPTA2signal=(edtValue)*6.1363636364;

                EPTA2payload=(edtValue)*6.75;

                EPTA3signal=(edtValue)*1.5083798883;

                EPTA3payload=(edtValue)*1.6875;

                H0=(edtValue)*135;

                H11=(edtValue)*33.75;

                H12=(edtValue)*27;

                VirtualTributary1signal=(edtValue)*30;

                VirtualTributary1payload=(edtValue)*33.575129534;

                VirtualTributary2signal=(edtValue)*22.5;

                VirtualTributary2payload=(edtValue)*25.3125;

                VirtualTributary6signal=(edtValue)*8.2129277567;

                VirtualTributary6payload=(edtValue)*8.64;

                STS1signal=(edtValue)*1;

                STS1payload=(edtValue)*1.0472727273;

                STS3signal=(edtValue)*0.3333333333;

                STS3payload=(edtValue)*0.3448275862;

                STS3csignal=(edtValue)*0.3333333333;

                STS3cpayload=(edtValue)*0.3448275862;

                STS12signal=(edtValue)*0.0833333333;

                STS24signal=(edtValue)*0.0416666667;

                STS48signal=(edtValue)*0.0208333333;

                STS192signal=(edtValue)*0.0052083333;

                STM1signal=(edtValue)*0.3333333333;

                STM4signal=(edtValue)*0.0833333333;

                STM16signal=(edtValue)*0.0208333333;

                STM64signal=(edtValue)*0.0052083333;

                break;

            case "STS1(payload)":

                bitpersecond=(edtValue)*49500000.0;

                bytepersecond=(edtValue)*6187500.0;

                kilobitpersecondSI=(edtValue)*49500;

                kilobytepersecondSI=(edtValue)*6187.5;

                kilobitpersecond=(edtValue)*48339.84375;

                kilobytepersecond=(edtValue)*6042.4804688;

                megabitpersecondSI=(edtValue)*49.5;

                megabytepersecondSI=(edtValue)*6.1875;

                megabitpersecond=(edtValue)*47.206878662;

                megabytepersecond=(edtValue)*5.9008598328;

                gigabitpersecondSI=(edtValue)*0.0495;

                gigabytepersecondSI=(edtValue)*0.0061875;

                gigabitpersecond=(edtValue)*0.0461004674;

                gigabytepersecond=(edtValue)*0.0057625584;

                terabitpersecondSI=(edtValue)*0.0000495;

                terabytepersecondSI=(edtValue)*0.0000061875;

                terabitpersecond=(edtValue)*0.00004502;

                terabytepersecond=(edtValue)*0.0000056275;

                ethernet=(edtValue)*4.95;

                ethernetfast=(edtValue)*0.495;

                ethernetgigabit=(edtValue)*0.0495;

                OC1=(edtValue)*0.9548611111;

                OC3=(edtValue)*0.318287037;

                OC12=(edtValue)*0.0795717593;

                OC24=(edtValue)*0.0397858796;

                OC48=(edtValue)*0.0198929398;

                OC192=(edtValue)*0.004973235;

                OC768=(edtValue)*0.0012433087;

                ISDNsinglechannel=(edtValue)*773.4375;

                ISDNdualchannel=(edtValue)*386.71875;

                modem110=(edtValue)*450000;

                modem300=(edtValue)*165000;

                modem1200=(edtValue)*41250;

                modem2400=(edtValue)*20625;

                modem9600=(edtValue)*5156.25;

                modem14k=(edtValue)*3437.5;

                modem28k=(edtValue)*1718.75;

                modem33k=(edtValue)*1473.2142857;

                modem56k=(edtValue)*883.92857143;

                SCSIAsync=(edtValue)*4.125;

                SCSISync=(edtValue)*1.2375;

                SCSIFast=(edtValue)*0.61875;

                SCSIFastUltra=(edtValue)*0.309375;


                SCSIFastWide=(edtValue)*0.309375;

                SCSIFastUltraWide=(edtValue)*0.1546875;

                SCSIUltra2=(edtValue)*0.07734375;

                SCSIUltra3=(edtValue)*0.038671875;

                SCSILVDUltra80=(edtValue)*0.07734375;


                SCSILVDUltra160=(edtValue)*0.038671875;

                IDEPIOmode0=(edtValue)*1.875;

                IDEPIOmode1=(edtValue)*1.1899038462;

                IDEPIOmode2=(edtValue)*0.7454819277;

                IDEPIOmode3=(edtValue)*0.5574324324;

                IDEPIOmode4=(edtValue)*0.3727409639;

                IDEDMAmode0=(edtValue)*1.4732142857;

                IDEDMAmode1=(edtValue)*0.4652255639;

                IDEDMAmode2=(edtValue)*0.3727409639;

                IDEUDMAmode0=(edtValue)*0.3727409639;

                IDEUDMAmode1=(edtValue)*0.2475;

                IDEUDMAmode2=(edtValue)*0.1875;

                IDEUDMAmode3=(edtValue)*0.12375;

                IDEUDMAmode4=(edtValue)*0.09375;

                IDEUDMA33=(edtValue)*0.1875;

                IDEUDMA66=(edtValue)*0.09375;

                USB=(edtValue)*4.125;

                firewire=(edtValue)*0.12375;

                T0payload=(edtValue)*883.92857143;

                T0B8ZSpayload=(edtValue)*773.4375;

                T1signal=(edtValue)*32.059585492;

                T1payload=(edtValue)*36.830357143;

                T1Zpayload=(edtValue)*32.059585492;

                T1Csignal=(edtValue)*15.704314721;

                T1Cpayload=(edtValue)*18.415178571;

                T2signal=(edtValue)*7.8422053232;

                T3signal=(edtValue)*1.1064914163;

                T3payload=(edtValue)*1.315369898;

                T3Zpayload=(edtValue)*1.1509486607;

                T4signal=(edtValue)*0.1805409664;

                EPTA1signal=(edtValue)*24.169921875;

                EPTA1payload=(edtValue)*25.78125;

                EPTA2signal=(edtValue)*5.859375;

                EPTA2payload=(edtValue)*6.4453125;

                EPTA3signal=(edtValue)*1.4402932961;

                EPTA3payload=(edtValue)*1.611328125;

                H0=(edtValue)*128.90625;

                H11=(edtValue)*32.2265625;

                H12=(edtValue)*25.78125;

                VirtualTributary1signal=(edtValue)*28.645833333;

                VirtualTributary1payload=(edtValue)*32.059585492;

                VirtualTributary2signal=(edtValue)*21.484375;

                VirtualTributary2payload=(edtValue)*24.169921875;

                VirtualTributary6signal=(edtValue)*7.8422053232;

                VirtualTributary6payload=(edtValue)*8.25;

                STS1signal=(edtValue)*0.9548611111;

                STS1payload=(edtValue)*1;

                STS3signal=(edtValue)*0.318287037;

                STS3payload=(edtValue)*0.3292624521;

                STS3csignal=(edtValue)*0.318287037;

                STS3cpayload=(edtValue)*0.3292624521;

                STS12signal=(edtValue)*0.0795717593;

                STS24signal=(edtValue)*0.0397858796;

                STS48signal=(edtValue)*0.0198929398;

                STS192signal=(edtValue)*0.004973235;

                STM1signal=(edtValue)*0.318287037;

                STM4signal=(edtValue)*0.0795717593;

                STM16signal=(edtValue)*0.0198929398;

                STM64signal=(edtValue)*0.004973235;

                break;
            case "STS3(signal)":

                bitpersecond=(edtValue)*155520000.0;

                bytepersecond=(edtValue)*19440000.0;

                kilobitpersecondSI=(edtValue)*155520;

                kilobytepersecondSI=(edtValue)*19440;

                kilobitpersecond=(edtValue)*151875;

                kilobytepersecond=(edtValue)*18984.375;

                megabitpersecondSI=(edtValue)*155.52;

                megabytepersecondSI=(edtValue)*19.44;

                megabitpersecond=(edtValue)*148.31542969;

                megabytepersecond=(edtValue)*18.539428711;

                gigabitpersecondSI=(edtValue)*0.15552;

                gigabytepersecondSI=(edtValue)*0.01944;

                gigabitpersecond=(edtValue)*0.1448392868;

                gigabytepersecond=(edtValue)*0.0181049109;

                terabitpersecondSI=(edtValue)*0.00015552;

                terabytepersecondSI=(edtValue)*0.00001944;

                terabitpersecond=(edtValue)*0.0001414446;

                terabytepersecond=(edtValue)*0.0000176806;

                ethernet=(edtValue)*15.552;

                ethernetfast=(edtValue)*1.5552;

                ethernetgigabit=(edtValue)*0.15552;

                OC1=(edtValue)*3;

                OC3=(edtValue)*1;

                OC12=(edtValue)*0.25;

                OC24=(edtValue)*0.125;

                OC48=(edtValue)*0.625;

                OC192=(edtValue)*0.015625;

                OC768=(edtValue)*0.00390625;

                ISDNsinglechannel=(edtValue)*2430;

                ISDNdualchannel=(edtValue)*1215;

                modem110=(edtValue)*1413818.1818;

                modem300=(edtValue)*518400;

                modem1200=(edtValue)*129600;

                modem2400=(edtValue)*64800;

                modem9600=(edtValue)*16200;

                modem14k=(edtValue)*10800;

                modem28k=(edtValue)*5400;

                modem33k=(edtValue)*4628.5714286;

                modem56k=(edtValue)*2777.1428571;

                SCSIAsync=(edtValue)*12.96;

                SCSISync=(edtValue)*3.888;

                SCSIFast=(edtValue)*1.944;

                SCSIFastUltra=(edtValue)*0.972;


                SCSIFastWide=(edtValue)*0.972;

                SCSIFastUltraWide=(edtValue)*0.486;

                SCSIUltra2=(edtValue)*0.243;

                SCSIUltra3=(edtValue)*0.1215;

                SCSILVDUltra80=(edtValue)*0.243;


                SCSILVDUltra160=(edtValue)*0.1215;

                IDEPIOmode0=(edtValue)*5.8909090909;

                IDEPIOmode1=(edtValue)*3.7384615385;

                IDEPIOmode2=(edtValue)*2.3421686747;

                IDEPIOmode3=(edtValue)*1.7513513514;

                IDEPIOmode4=(edtValue)*1.7513513514;

                IDEDMAmode0=(edtValue)*1.1710843373;

                IDEDMAmode1=(edtValue)*4.6285714286;

                IDEDMAmode2=(edtValue)*1.4616541353;

                IDEUDMAmode0=(edtValue)*1.1710843373;

                IDEUDMAmode1=(edtValue)*1.1710843373;

                IDEUDMAmode2=(edtValue)*0.7776;

                IDEUDMAmode3=(edtValue)*0.5890909091;

                IDEUDMAmode4=(edtValue)*0.3888;

                IDEUDMA33=(edtValue)*0.2945454545;

                IDEUDMA66=(edtValue)*0.5890909091;

                USB=(edtValue)*12.96;

                firewire=(edtValue)*0.3888;

                T0payload=(edtValue)*2777.1428571;

                T0B8ZSpayload=(edtValue)*2430;

                T1signal=(edtValue)*100.7253886;

                T1payload=(edtValue)*115.71428571;

                T1Zpayload=(edtValue)*100.7253886;

                T1Csignal=(edtValue)*49.340101523;

                T1Cpayload=(edtValue)*57.857142857;

                T2signal=(edtValue)*24.63878327;

                T3signal=(edtValue)*3.4763948498;

                T3payload=(edtValue)*4.1326530612;

                T3Zpayload=(edtValue)*3.6160714286;

                T4signal=(edtValue)*0.5672268908;

                EPTA1signal=(edtValue)*75.9375;

                EPTA1payload=(edtValue)*81;

                EPTA2signal=(edtValue)*18.409090909;

                EPTA2payload=(edtValue)*20.25;

                EPTA3signal=(edtValue)*4.5251396648;

                EPTA3payload=(edtValue)*5.0625;

                H0=(edtValue)*405;

                H11=(edtValue)*101.25;

                H12=(edtValue)*81;

                VirtualTributary1signal=(edtValue)*90;

                VirtualTributary1payload=(edtValue)*100.7253886;

                VirtualTributary2signal=(edtValue)*67.5;

                VirtualTributary2payload=(edtValue)*75.9375;

                VirtualTributary6signal=(edtValue)*24.63878327;

                VirtualTributary6payload=(edtValue)*25.92;

                STS1signal=(edtValue)*3;

                STS1payload=(edtValue)*3.1418181818;

                STS3signal=(edtValue)*1;

                STS3payload=(edtValue)*1.0344827586;

                STS3csignal=(edtValue)*1;

                STS3cpayload=(edtValue)*1.0344827586;

                STS12signal=(edtValue)*0.25;

                STS24signal=(edtValue)*0.125;

                STS48signal=(edtValue)*0.0625;

                STS192signal=(edtValue)*0.015625;

                STM1signal=(edtValue)*1;

                STM4signal=(edtValue)*0.25;

                STM16signal=(edtValue)*0.0625;

                STM64signal=(edtValue)*0.015625;

                break;


            case "STS3(payload)":

                bitpersecond=(edtValue)*150336000.0;

                bytepersecond=(edtValue)*18792000.0;

                kilobitpersecondSI=(edtValue)*150336;

                kilobytepersecondSI=(edtValue)*18792;

                kilobitpersecond=(edtValue)*146812.5;

                kilobytepersecond=(edtValue)*18351.5625;

                megabitpersecondSI=(edtValue)*150.336;

                megabytepersecondSI=(edtValue)*18.792;

                megabitpersecond=(edtValue)*143.37158203;

                megabytepersecond=(edtValue)*17.921447754;

                gigabitpersecondSI=(edtValue)*0.150336;

                gigabytepersecondSI=(edtValue)*0.018792;

                gigabitpersecond=(edtValue)*0.1400113106;

                gigabytepersecond=(edtValue)*0.0175014138;

                terabitpersecondSI=(edtValue)*0.000150336;

                terabytepersecondSI=(edtValue)*0.000018792;

                terabitpersecond=(edtValue)*0.0001367298;

                terabytepersecond=(edtValue)*0.0000170912;

                ethernet=(edtValue)*15.0336;

                ethernetfast=(edtValue)*1.50336;

                ethernetgigabit=(edtValue)*0.150336;

                OC1=(edtValue)*2.9;

                OC3=(edtValue)*0.9666666667;

                OC12=(edtValue)*0.2416666667;

                OC24=(edtValue)*0.1208333333;

                OC48=(edtValue)*0.0604166667;

                OC192=(edtValue)*0.0151041667;

                OC768=(edtValue)*0.0037760417;

                ISDNsinglechannel=(edtValue)*2349;

                ISDNdualchannel=(edtValue)*1174.5;

                modem110=(edtValue)*1366690.9091;

                modem300=(edtValue)*501120;

                modem1200=(edtValue)*125280;

                modem2400=(edtValue)*62640;

                modem9600=(edtValue)*15660;

                modem14k=(edtValue)*10440;

                modem28k=(edtValue)*5220;

                modem33k=(edtValue)*4474.2857143;

                modem56k=(edtValue)*2684.5714286;

                SCSIAsync=(edtValue)*12.528;

                SCSISync=(edtValue)*3.7584;

                SCSIFast=(edtValue)*1.8792;

                SCSIFastUltra=(edtValue)*0.9396;


                SCSIFastWide=(edtValue)*0.9396;

                SCSIFastUltraWide=(edtValue)*0.4698;

                SCSIUltra2=(edtValue)*0.2349;

                SCSIUltra3=(edtValue)*0.11745;

                SCSILVDUltra80=(edtValue)*0.2349;


                SCSILVDUltra160=(edtValue)*0.11745;

                IDEPIOmode0=(edtValue)*5.6945454545;

                IDEPIOmode1=(edtValue)*3.6138461538;

                IDEPIOmode2=(edtValue)*2.2640963855;

                IDEPIOmode3=(edtValue)*1.692972973;

                IDEPIOmode4=(edtValue)*1.1320481928;

                IDEDMAmode0=(edtValue)*4.4742857143;

                IDEDMAmode1=(edtValue)*1.4129323308;

                IDEDMAmode2=(edtValue)*1.1320481928;

                IDEUDMAmode0=(edtValue)*1.1320481928;

                IDEUDMAmode1=(edtValue)*0.75168;

                IDEUDMAmode2=(edtValue)*0.5694545455;

                IDEUDMAmode3=(edtValue)*0.37584;

                IDEUDMAmode4=(edtValue)*0.2847272727;

                IDEUDMA33=(edtValue)*0.5694545455;

                IDEUDMA66=(edtValue)*0.2847272727;

                USB=(edtValue)*12.528;

                firewire=(edtValue)*0.37584;

                T0payload=(edtValue)*2684.5714286;

                T0B8ZSpayload=(edtValue)*2349;

                T1signal=(edtValue)*97.367875648;

                T1payload=(edtValue)*111.85714286;

                T1Zpayload=(edtValue)*97.367875648;

                T1Csignal=(edtValue)*47.695431472;

                T1Cpayload=(edtValue)*55.928571429;

                T2signal=(edtValue)*23.817490494;

                T3signal=(edtValue)*3.3605150215;

                T3payload=(edtValue)*3.9948979592;

                T3Zpayload=(edtValue)*3.4955357143;

                T4signal=(edtValue)*3.4955357143;

                EPTA1signal=(edtValue)*73.40625;

                EPTA1payload=(edtValue)*78.3;

                EPTA2signal=(edtValue)*17.795454545;

                EPTA2payload=(edtValue)*19.575;

                EPTA3signal=(edtValue)*4.374301676;

                EPTA3payload=(edtValue)*4.89375;

                H0=(edtValue)*391.5;

                H11=(edtValue)*97.875;

                H12=(edtValue)*78.3;

                VirtualTributary1signal=(edtValue)*78.3;

                VirtualTributary1payload=(edtValue)*97.367875648;

                VirtualTributary2signal=(edtValue)*65.25;

                VirtualTributary2payload=(edtValue)*73.40625;

                VirtualTributary6signal=(edtValue)*23.817490494;

                VirtualTributary6payload=(edtValue)*25.056;

                STS1signal=(edtValue)*2.9;

                STS1payload=(edtValue)*3.0370909091;

                STS3signal=(edtValue)*0.9666666667;

                STS3payload=(edtValue)*1;

                STS3csignal=(edtValue)*0.9666666667;

                STS3cpayload=(edtValue)*1;

                STS12signal=(edtValue)*0.2416666667;

                STS24signal=(edtValue)*0.2416666667;

                STS48signal=(edtValue)*0.0604166667;

                STS192signal=(edtValue)*0.0151041667;

                STM1signal=(edtValue)*0.9666666667;

                STM4signal=(edtValue)*0.2416666667;

                STM16signal=(edtValue)*0.0604166667;

                STM64signal=(edtValue)*0.0151041667;

                break;

            case "STS3c(signal)":

                bitpersecond=(edtValue)*155520000.0;

                bytepersecond=(edtValue)*19440000.0;

                kilobitpersecondSI=(edtValue)*155520.0;

                kilobytepersecondSI=(edtValue)*19440.0;

                kilobitpersecond=(edtValue)*151875.0;

                kilobytepersecond=(edtValue)*18984.375;

                megabitpersecondSI=(edtValue)*155.52;

                megabytepersecondSI=(edtValue)*19.44;

                megabitpersecond=(edtValue)*148.31542969;

                megabytepersecond=(edtValue)*18.539428711;

                gigabitpersecondSI=(edtValue)*0.15552;

                gigabytepersecondSI=(edtValue)*0.01944;

                gigabitpersecond=(edtValue)*0.1448392868;

                gigabytepersecond=(edtValue)*0.0181049109;

                terabitpersecondSI=(edtValue)*0.00015552;

                terabytepersecondSI=(edtValue)*0.00001944;

                terabitpersecond=(edtValue)*0.0001414446;

                terabytepersecond=(edtValue)*0.0000176806;

                ethernet=(edtValue)*15.552;

                ethernetfast=(edtValue)*1.5552;

                ethernetgigabit=(edtValue)*0.15552;

                OC1=(edtValue)*3;

                OC3=(edtValue)*1;

                OC12=(edtValue)*0.25;

                OC24=(edtValue)*0.125;

                OC48=(edtValue)*0.0625;

                OC192=(edtValue)*0.015625;

                OC768=(edtValue)*0.00390625;

                ISDNsinglechannel=(edtValue)*2430;

                ISDNdualchannel=(edtValue)*1215;

                modem110=(edtValue)*1413818.1818;

                modem300=(edtValue)*518400;

                modem1200=(edtValue)*129600;

                modem2400=(edtValue)*64800;

                modem9600=(edtValue)*16200;

                modem14k=(edtValue)*10800;

                modem28k=(edtValue)*5400;

                modem33k=(edtValue)*4628.5714286;

                modem56k=(edtValue)*4628.5714286;

                SCSIAsync=(edtValue)*12.96;

                SCSISync=(edtValue)*3.888;

                SCSIFast=(edtValue)*1.944;

                SCSIFastUltra=(edtValue)*0.972;


                SCSIFastWide=(edtValue)*0.972;

                SCSIFastUltraWide=(edtValue)*0.486;

                SCSIUltra2=(edtValue)*0.243;

                SCSIUltra3=(edtValue)*0.1215;

                SCSILVDUltra80=(edtValue)*0.243;


                SCSILVDUltra160=(edtValue)*0.1215;

                IDEPIOmode0=(edtValue)*5.8909090909;

                IDEPIOmode1=(edtValue)*3.7384615385;

                IDEPIOmode2=(edtValue)*2.3421686747;

                IDEPIOmode3=(edtValue)*1.7513513514;

                IDEPIOmode4=(edtValue)*1.1710843373;

                IDEDMAmode0=(edtValue)*4.6285714286;

                IDEDMAmode1=(edtValue)*1.4616541353;

                IDEDMAmode2=(edtValue)*1.1710843373;

                IDEUDMAmode0=(edtValue)*1.1710843373;

                IDEUDMAmode1=(edtValue)*0.7776;

                IDEUDMAmode2=(edtValue)*0.5890909091;

                IDEUDMAmode3=(edtValue)*0.3888;

                IDEUDMAmode4=(edtValue)*0.2945454545;

                IDEUDMA33=(edtValue)*0.5890909091;

                IDEUDMA66=(edtValue)*0.2945454545;

                USB=(edtValue)*12.96;

                firewire=(edtValue)*0.3888;

                T0payload=(edtValue)*2777.1428571;

                T0B8ZSpayload=(edtValue)*2430;

                T1signal=(edtValue)*100.7253886;

                T1payload=(edtValue)*115.71428571;

                T1Zpayload=(edtValue)*100.7253886;

                T1Csignal=(edtValue)*49.340101523;

                T1Cpayload=(edtValue)*57.857142857;

                T2signal=(edtValue)*24.63878327;

                T3signal=(edtValue)*3.4763948498;

                T3payload=(edtValue)*4.1326530612;

                T3Zpayload=(edtValue)*3.6160714286;

                T4signal=(edtValue)*0.5672268908;

                EPTA1signal=(edtValue)*75.9375;

                EPTA1payload=(edtValue)*81;

                EPTA2signal=(edtValue)*18.409090909;

                EPTA2payload=(edtValue)*20.25;

                EPTA3signal=(edtValue)*4.5251396648;

                EPTA3payload=(edtValue)*5.0625;

                H0=(edtValue)*405;

                H11=(edtValue)*101.25;

                H12=(edtValue)*81;

                VirtualTributary1signal=(edtValue)*90;

                VirtualTributary1payload=(edtValue)*100.7253886;

                VirtualTributary2signal=(edtValue)*67.5;

                VirtualTributary2payload=(edtValue)*75.9375;

                VirtualTributary6signal=(edtValue)*24.63878327;

                VirtualTributary6payload=(edtValue)*25.92;

                STS1signal=(edtValue)*3;

                STS1payload=(edtValue)*3.1418181818;

                STS3signal=(edtValue)*1;

                STS3payload=(edtValue)*1.0344827586;

                STS3csignal=(edtValue)*1;

                STS3cpayload=(edtValue)*1.0344827586;

                STS12signal=(edtValue)*0.25;

                STS24signal=(edtValue)*0.125;

                STS48signal=(edtValue)*0.0625;

                STS192signal=(edtValue)*0.015625;

                STM1signal=(edtValue)*1;

                STM4signal=(edtValue)*0.25;

                STM16signal=(edtValue)*0.0625;

                STM64signal=(edtValue)*0.015625;

                break;


            case "STS3c(payload)":

                bitpersecond=(edtValue)*150336000.0;

                bytepersecond=(edtValue)*18792000.0;

                kilobitpersecondSI=(edtValue)*150336.0;

                kilobytepersecondSI=(edtValue)*18792.0;

                kilobitpersecond=(edtValue)*146812.5;

                kilobytepersecond=(edtValue)*18351.5625;

                megabitpersecondSI=(edtValue)*150.336;

                megabytepersecondSI=(edtValue)*18.792;

                megabitpersecond=(edtValue)*143.37158203;

                megabytepersecond=(edtValue)*17.921447754;

                gigabitpersecondSI=(edtValue)*0.150336;

                gigabytepersecondSI=(edtValue)*0.018792;

                gigabitpersecond=(edtValue)*0.1400113106;

                gigabytepersecond=(edtValue)*0.0175014138;

                terabitpersecondSI=(edtValue)*0.000150336;

                terabytepersecondSI=(edtValue)*0.000018792;

                terabitpersecond=(edtValue)*0.0001367298;

                terabytepersecond=(edtValue)*0.0000170912;

                ethernet=(edtValue)*15.0336;

                ethernetfast=(edtValue)*1.50336;

                ethernetgigabit=(edtValue)*0.150336;

                OC1=(edtValue)*2.9;

                OC3=(edtValue)*0.9666666667;

                OC12=(edtValue)*0.2416666667;

                OC24=(edtValue)*0.1208333333;

                OC48=(edtValue)*0.0604166667;

                OC192=(edtValue)*0.0151041667;

                OC768=(edtValue)*0.0037760417;

                ISDNsinglechannel=(edtValue)*2349;

                ISDNdualchannel=(edtValue)*1174.5;

                modem110=(edtValue)*1366690.9091;

                modem300=(edtValue)*501120;

                modem1200=(edtValue)*125280;

                modem2400=(edtValue)*62640;

                modem9600=(edtValue)*15660;

                modem14k=(edtValue)*10440;

                modem28k=(edtValue)*5220;

                modem33k=(edtValue)*4474.2857143;

                modem56k=(edtValue)*2684.5714286;

                SCSIAsync=(edtValue)*12.528;

                SCSISync=(edtValue)*3.7584;

                SCSIFast=(edtValue)*1.8792;

                SCSIFastUltra=(edtValue)*0.9396;


                SCSIFastWide=(edtValue)*0.9396;

                SCSIFastUltraWide=(edtValue)*0.4698;

                SCSIUltra2=(edtValue)*0.2349;

                SCSIUltra3=(edtValue)*0.11745;

                SCSILVDUltra80=(edtValue)*0.2349;


                SCSILVDUltra160=(edtValue)*0.11745;

                IDEPIOmode0=(edtValue)*5.6945454545;

                IDEPIOmode1=(edtValue)*3.6138461538;

                IDEPIOmode2=(edtValue)*2.2640963855;

                IDEPIOmode3=(edtValue)*1.692972973;

                IDEPIOmode4=(edtValue)*1.1320481928;

                IDEDMAmode0=(edtValue)*4.4742857143;

                IDEDMAmode1=(edtValue)*1.4129323308;

                IDEDMAmode2=(edtValue)*1.1320481928;

                IDEUDMAmode0=(edtValue)*1.1320481928;

                IDEUDMAmode1=(edtValue)*0.75168;

                IDEUDMAmode2=(edtValue)*0.5694545455;

                IDEUDMAmode3=(edtValue)*0.37584;

                IDEUDMAmode4=(edtValue)*0.2847272727;

                IDEUDMA33=(edtValue)*0.5694545455;

                IDEUDMA66=(edtValue)*0.2847272727;

                USB=(edtValue)*12.528;

                firewire=(edtValue)*0.37584;

                T0payload=(edtValue)*2684.5714286;

                T0B8ZSpayload=(edtValue)*2349;

                T1signal=(edtValue)*97.367875648;

                T1payload=(edtValue)*111.85714286;

                T1Zpayload=(edtValue)*97.367875648;

                T1Csignal=(edtValue)*47.695431472;

                T1Cpayload=(edtValue)*55.928571429;

                T2signal=(edtValue)*23.817490494;

                T3signal=(edtValue)*3.3605150215;

                T3payload=(edtValue)*3.9948979592;

                T3Zpayload=(edtValue)*3.4955357143;

                T4signal=(edtValue)*0.5483193277;

                EPTA1signal=(edtValue)*73.40625;

                EPTA1payload=(edtValue)*78.3;

                EPTA2signal=(edtValue)*17.795454545;

                EPTA2payload=(edtValue)*19.575;

                EPTA3signal=(edtValue)*4.374301676;

                EPTA3payload=(edtValue)*4.89375;

                H0=(edtValue)*391.5;

                H11=(edtValue)*97.875;

                H12=(edtValue)*78.3;

                VirtualTributary1signal=(edtValue)*87;

                VirtualTributary1payload=(edtValue)*97.367875648;

                VirtualTributary2signal=(edtValue)*65.25;

                VirtualTributary2payload=(edtValue)*73.40625;

                VirtualTributary6signal=(edtValue)*23.817490494;

                VirtualTributary6payload=(edtValue)*25.056;

                STS1signal=(edtValue)*2.9;

                STS1payload=(edtValue)*3.0370909091;

                STS3signal=(edtValue)*0.9666666667;

                STS3payload=(edtValue)*1;

                STS3csignal=(edtValue)*0.9666666667;

                STS3cpayload=(edtValue)*1;

                STS12signal=(edtValue)*0.2416666667;

                STS24signal=(edtValue)*0.1208333333;

                STS48signal=(edtValue)*0.0604166667;

                STS192signal=(edtValue)*0.0151041667;

                STM1signal=(edtValue)*0.9666666667;

                STM4signal=(edtValue)*0.2416666667;

                STM16signal=(edtValue)*0.0604166667;

                STM64signal=(edtValue)*0.0151041667;

                break;

            case "STS12(signal)":

                bitpersecond=(edtValue)*622080000.0;

                bytepersecond=(edtValue)*77760000.0;

                kilobitpersecondSI=(edtValue)*622080.0;

                kilobytepersecondSI=(edtValue)*77760.0;

                kilobitpersecond=(edtValue)*607500.0;

                kilobytepersecond=(edtValue)*75937.5;

                megabitpersecondSI=(edtValue)*622.08;

                megabytepersecondSI=(edtValue)*77.76;

                megabitpersecond=(edtValue)*593.26171875;

                megabytepersecond=(edtValue)*74.157714844;

                gigabitpersecondSI=(edtValue)*0.62208;

                gigabytepersecondSI=(edtValue)*0.07776;

                gigabitpersecond=(edtValue)*0.5793571472;

                gigabytepersecond=(edtValue)*0.0724196434;

                terabitpersecondSI=(edtValue)*0.00062208;

                terabytepersecondSI=(edtValue)*0.00007776;

                terabitpersecond=(edtValue)*0.0005657785;

                terabytepersecond=(edtValue)*0.0000707223;

                ethernet=(edtValue)*62.208;

                ethernetfast=(edtValue)*6.2208;

                ethernetgigabit=(edtValue)*0.62208;

                OC1=(edtValue)*12;

                OC3=(edtValue)*4;

                OC12=(edtValue)*1;

                OC24=(edtValue)*0.5;

                OC48=(edtValue)*0.25;

                OC192=(edtValue)*0.0625;

                OC768=(edtValue)*0.015625;

                ISDNsinglechannel=(edtValue)*9720;

                ISDNdualchannel=(edtValue)*4860;

                modem110=(edtValue)*5655272.7273;

                modem300=(edtValue)*2073600;

                modem1200=(edtValue)*518400;

                modem2400=(edtValue)*259200;

                modem9600=(edtValue)*64800;

                modem14k=(edtValue)*43200;

                modem28k=(edtValue)*21600;

                modem33k=(edtValue)*18514.285714;

                modem56k=(edtValue)*11108.571429;

                SCSIAsync=(edtValue)*51.84;

                SCSISync=(edtValue)*15.552;

                SCSIFast=(edtValue)*7.776;

                SCSIFastUltra=(edtValue)*3.888;


                SCSIFastWide=(edtValue)*3.888;

                SCSIFastUltraWide=(edtValue)*1.944;

                SCSIUltra2=(edtValue)*0.972;

                SCSIUltra3=(edtValue)*0.486;

                SCSILVDUltra80=(edtValue)*0.972;


                SCSILVDUltra160=(edtValue)*0.486;

                IDEPIOmode0=(edtValue)*23.563636364;

                IDEPIOmode1=(edtValue)*14.953846154;

                IDEPIOmode2=(edtValue)*9.3686746988;

                IDEPIOmode3=(edtValue)*7.0054054054;

                IDEPIOmode4=(edtValue)*4.6843373494;

                IDEDMAmode0=(edtValue)*18.514285714;

                IDEDMAmode1=(edtValue)*5.8466165414;

                IDEDMAmode2=(edtValue)*4.6843373494;

                IDEUDMAmode0=(edtValue)*4.6843373494;

                IDEUDMAmode1=(edtValue)*3.1104;

                IDEUDMAmode2=(edtValue)*2.3563636364;

                IDEUDMAmode3=(edtValue)*1.5552;

                IDEUDMAmode4=(edtValue)*1.1781818182;

                IDEUDMA33=(edtValue)*2.3563636364;

                IDEUDMA66=(edtValue)*1.1781818182;

                USB=(edtValue)*51.84;

                firewire=(edtValue)*1.5552;

                T0payload=(edtValue)*11108.571429;

                T0B8ZSpayload=(edtValue)*9720;

                T1signal=(edtValue)*402.9015544;

                T1payload=(edtValue)*462.85714286;

                T1Zpayload=(edtValue)*402.9015544;

                T1Csignal=(edtValue)*197.36040609;

                T1Cpayload=(edtValue)*231.42857143;

                T2signal=(edtValue)*98.55513308;

                T3signal=(edtValue)*13.905579399;

                T3payload=(edtValue)*16.530612245;

                T3Zpayload=(edtValue)*14.464285714;

                T4signal=(edtValue)*2.268907563;

                EPTA1signal=(edtValue)*303.75;

                EPTA1payload=(edtValue)*324;

                EPTA2signal=(edtValue)*73.636363636;

                EPTA2payload=(edtValue)*81;

                EPTA3signal=(edtValue)*18.100558659;

                EPTA3payload=(edtValue)*20.25;

                H0=(edtValue)*1620;

                H11=(edtValue)*405;

                H12=(edtValue)*324;

                VirtualTributary1signal=(edtValue)*360;

                VirtualTributary1payload=(edtValue)*402.9015544;

                VirtualTributary2signal=(edtValue)*270;

                VirtualTributary2payload=(edtValue)*303.75;

                VirtualTributary6signal=(edtValue)*98.55513308;

                VirtualTributary6payload=(edtValue)*103.68;

                STS1signal=(edtValue)*12;

                STS1payload=(edtValue)*12.567272727;

                STS3signal=(edtValue)*4;

                STS3payload=(edtValue)*4.1379310345;

                STS3csignal=(edtValue)*4;

                STS3cpayload=(edtValue)*4.1379310345;

                STS12signal=(edtValue)*1;

                STS24signal=(edtValue)*0.5;

                STS48signal=(edtValue)*0.25;

                STS192signal=(edtValue)*0.0625;

                STM1signal=(edtValue)*4;

                STM4signal=(edtValue)*1;

                STM16signal=(edtValue)*0.25;

                STM64signal=(edtValue)*0.0625;

                break;

            case "STS24(signal)":

                bitpersecond=(edtValue)*11244160000.0;

                bytepersecond=(edtValue)*155520000.0;

                kilobitpersecondSI=(edtValue)*1244160.0;

                kilobytepersecondSI=(edtValue)*155520.0;

                kilobitpersecond=(edtValue)*1215000.0;

                kilobytepersecond=(edtValue)*1215000;

                megabitpersecondSI=(edtValue)*1244.16;

                megabytepersecondSI=(edtValue)*155.52;

                megabitpersecond=(edtValue)*1186.5234375;

                megabytepersecond=(edtValue)*148.31542969;

                gigabitpersecondSI=(edtValue)*1.24416;

                gigabytepersecondSI=(edtValue)*0.15552;

                gigabitpersecond=(edtValue)*1.1587142944;

                gigabytepersecond=(edtValue)*0.1448392868;

                terabitpersecondSI=(edtValue)*0.00124416;

                terabytepersecondSI=(edtValue)*0.00015552;

                terabitpersecond=(edtValue)*0.0011315569;

                terabytepersecond=(edtValue)*0.0001414446;

                ethernet=(edtValue)*124.416;

                ethernetfast=(edtValue)*12.4416;

                ethernetgigabit=(edtValue)*1.24416;

                OC1=(edtValue)*24;

                OC3=(edtValue)*8;

                OC12=(edtValue)*2;

                OC24=(edtValue)*1;

                OC48=(edtValue)*0.5;

                OC192=(edtValue)*0.125;

                OC768=(edtValue)*0.03125;

                ISDNsinglechannel=(edtValue)*19440;

                ISDNdualchannel=(edtValue)*9720;

                modem110=(edtValue)*11310545.455;

                modem300=(edtValue)*4147200;

                modem1200=(edtValue)*1036800;

                modem2400=(edtValue)*518400;

                modem9600=(edtValue)*129600;

                modem14k=(edtValue)*86400;

                modem28k=(edtValue)*43200;

                modem33k=(edtValue)*37028.571429;

                modem56k=(edtValue)*22217.142857;

                SCSIAsync=(edtValue)*103.68;

                SCSISync=(edtValue)*31.104;

                SCSIFast=(edtValue)*15.552;

                SCSIFastUltra=(edtValue)*7.776;


                SCSIFastWide=(edtValue)*7.776;

                SCSIFastUltraWide=(edtValue)*3.888;

                SCSIUltra2=(edtValue)*1.944;

                SCSIUltra3=(edtValue)*0.972;

                SCSILVDUltra80=(edtValue)*1.944;


                SCSILVDUltra160=(edtValue)*0.972;

                IDEPIOmode0=(edtValue)*47.127272727;

                IDEPIOmode1=(edtValue)*29.907692308;

                IDEPIOmode2=(edtValue)*18.737349398;

                IDEPIOmode3=(edtValue)*14.010810811;

                IDEPIOmode4=(edtValue)*9.3686746988;

                IDEDMAmode0=(edtValue)*37.028571429;

                IDEDMAmode1=(edtValue)*11.693233083;

                IDEDMAmode2=(edtValue)*9.3686746988;

                IDEUDMAmode0=(edtValue)*9.3686746988;

                IDEUDMAmode1=(edtValue)*6.2208;

                IDEUDMAmode2=(edtValue)*4.7127272727;

                IDEUDMAmode3=(edtValue)*3.1104;

                IDEUDMAmode4=(edtValue)*2.3563636364;

                IDEUDMA33=(edtValue)*4.7127272727;

                IDEUDMA66=(edtValue)*2.3563636364;

                USB=(edtValue)*103.68;

                firewire=(edtValue)*3.1104;

                T0payload=(edtValue)*22217.142857;

                T0B8ZSpayload=(edtValue)*19440;

                T1signal=(edtValue)*805.80310881;

                T1payload=(edtValue)*925.71428571;

                T1Zpayload=(edtValue)*805.80310881;

                T1Csignal=(edtValue)*394.72081218;

                T1Cpayload=(edtValue)*462.85714286;

                T2signal=(edtValue)*197.11026616;

                T3signal=(edtValue)*27.811158798;

                T3payload=(edtValue)*33.06122449;

                T3Zpayload=(edtValue)*28.928571429;

                T4signal=(edtValue)*4.5378151261;

                EPTA1signal=(edtValue)*607.5;

                EPTA1payload=(edtValue)*648;

                EPTA2signal=(edtValue)*147.27272727;

                EPTA2payload=(edtValue)*162;

                EPTA3signal=(edtValue)*36.201117318;

                EPTA3payload=(edtValue)*40.5;

                H0=(edtValue)*3240;

                H11=(edtValue)*810;

                H12=(edtValue)*648;

                VirtualTributary1signal=(edtValue)*720;

                VirtualTributary1payload=(edtValue)*805.80310881;

                VirtualTributary2signal=(edtValue)*540;

                VirtualTributary2payload=(edtValue)*197.11026616;

                VirtualTributary6signal=(edtValue)*207.36;

                VirtualTributary6payload=(edtValue)*24;

                STS1signal=(edtValue)*25.134545455;

                STS1payload=(edtValue)*8;

                STS3signal=(edtValue)*8.275862069;

                STS3payload=(edtValue)*8;

                STS3csignal=(edtValue)*8.275862069;

                STS3cpayload=(edtValue)*2;

                STS12signal=(edtValue)*1;

                STS24signal=(edtValue)*0.5;

                STS48signal=(edtValue)*0.5;

                STS192signal=(edtValue)*0.125;

                STM1signal=(edtValue)*8;

                STM4signal=(edtValue)*2;

                STM16signal=(edtValue)*0.5;

                STM64signal=(edtValue)*0.125;

                break;

            case "STS48(signal)":

                bitpersecond=(edtValue)*12488320000.0;

                bytepersecond=(edtValue)*311040000.0;

                kilobitpersecondSI=(edtValue)*2488320.0;

                kilobytepersecondSI=(edtValue)*311040.0;

                kilobitpersecond=(edtValue)*2430000.0;

                kilobytepersecond=(edtValue)*303750.0;

                megabitpersecondSI=(edtValue)*2488.32;

                megabytepersecondSI=(edtValue)*311.04;

                megabitpersecond=(edtValue)*2373.046875;

                megabytepersecond=(edtValue)*296.63085937;

                gigabitpersecondSI=(edtValue)*2.48832;

                gigabytepersecondSI=(edtValue)*0.31104;

                gigabitpersecond=(edtValue)*2.3174285889;

                gigabytepersecond=(edtValue)*0.2896785736;

                terabitpersecondSI=(edtValue)*0.00248832;

                terabytepersecondSI=(edtValue)*0.00031104;

                terabitpersecond=(edtValue)*0.0022631139;

                terabytepersecond=(edtValue)*0.0002828892;

                ethernet=(edtValue)*248.832;

                ethernetfast=(edtValue)*24.8832;

                ethernetgigabit=(edtValue)*2.48832;

                OC1=(edtValue)*48;

                OC3=(edtValue)*16;

                OC12=(edtValue)*4;

                OC24=(edtValue)*2;

                OC48=(edtValue)*1;

                OC192=(edtValue)*0.25;

                OC768=(edtValue)*0.0625;

                ISDNsinglechannel=(edtValue)*38880;

                ISDNdualchannel=(edtValue)*19440;

                modem110=(edtValue)*22621090.909;

                modem300=(edtValue)*8294400;

                modem1200=(edtValue)*2073600;

                modem2400=(edtValue)*1036800;

                modem9600=(edtValue)*259200;

                modem14k=(edtValue)*172800;

                modem28k=(edtValue)*86400;

                modem33k=(edtValue)*74057.142857;

                modem56k=(edtValue)*44434.285714;

                SCSIAsync=(edtValue)*207.36;

                SCSISync=(edtValue)*62.208;

                SCSIFast=(edtValue)*31.104;

                SCSIFastUltra=(edtValue)*15.552;


                SCSIFastWide=(edtValue)*15.552;

                SCSIFastUltraWide=(edtValue)*15.552;

                SCSIUltra2=(edtValue)*7.776;

                SCSIUltra3=(edtValue)*3.888;

                SCSILVDUltra80=(edtValue)*1.944;


                SCSILVDUltra160=(edtValue)*3.888;

                IDEPIOmode0=(edtValue)*1.944;

                IDEPIOmode1=(edtValue)*94.254545455;

                IDEPIOmode2=(edtValue)*37.474698795;

                IDEPIOmode3=(edtValue)*28.021621622;

                IDEPIOmode4=(edtValue)*18.737349398;

                IDEDMAmode0=(edtValue)*74.057142857;

                IDEDMAmode1=(edtValue)*23.386466165;

                IDEDMAmode2=(edtValue)*18.737349398;

                IDEUDMAmode0=(edtValue)*18.737349398;

                IDEUDMAmode1=(edtValue)*12.4416;

                IDEUDMAmode2=(edtValue)*9.4254545455;

                IDEUDMAmode3=(edtValue)*6.2208;

                IDEUDMAmode4=(edtValue)*4.7127272727;

                IDEUDMA33=(edtValue)*9.4254545455;

                IDEUDMA66=(edtValue)*4.7127272727;

                USB=(edtValue)*207.36;

                firewire=(edtValue)*6.2208;

                T0payload=(edtValue)*44434.285714;

                T0B8ZSpayload=(edtValue)*38880;

                T1signal=(edtValue)*1611.6062176;

                T1payload=(edtValue)*1851.4285714;

                T1Zpayload=(edtValue)*1611.6062176;

                T1Csignal=(edtValue)*789.44162437;

                T1Cpayload=(edtValue)*925.71428571;

                T2signal=(edtValue)*394.22053232;

                T3signal=(edtValue)*55.622317597;

                T3payload=(edtValue)*66.12244898;

                T3Zpayload=(edtValue)*57.857142857;

                T4signal=(edtValue)*9.0756302521;

                EPTA1signal=(edtValue)*1215;

                EPTA1payload=(edtValue)*1296;

                EPTA2signal=(edtValue)*294.54545455;

                EPTA2payload=(edtValue)*294.54545455;

                EPTA3signal=(edtValue)*72.402234637;

                EPTA3payload=(edtValue)*81;

                H0=(edtValue)*6480;

                H11=(edtValue)*1620;

                H12=(edtValue)*1296;

                VirtualTributary1signal=(edtValue)*1440;

                VirtualTributary1payload=(edtValue)*1611.6062176;

                VirtualTributary2signal=(edtValue)*1080;

                VirtualTributary2payload=(edtValue)*1215;

                VirtualTributary6signal=(edtValue)*394.22053232;

                VirtualTributary6payload=(edtValue)*414.72;

                STS1signal=(edtValue)*48;

                STS1payload=(edtValue)*50.269090909;

                STS3signal=(edtValue)*16;

                STS3payload=(edtValue)*16.551724138;

                STS3csignal=(edtValue)*16;

                STS3cpayload=(edtValue)*16.551724138;

                STS12signal=(edtValue)*4;

                STS24signal=(edtValue)*2;

                STS48signal=(edtValue)*1;

                STS192signal=(edtValue)*0.25;

                STM1signal=(edtValue)*16;

                STM4signal=(edtValue)*4;

                STM16signal=(edtValue)*1;

                STM64signal=(edtValue)*0.25;

                break;

            case "STS192(signal)":

                bitpersecond=(edtValue)*9953280000.0;

                bytepersecond=(edtValue)*1244160000.0;

                kilobitpersecondSI=(edtValue)*9953280.0;

                kilobytepersecondSI=(edtValue)*1244160.0;

                kilobitpersecond=(edtValue)*9720000.0;

                kilobytepersecond=(edtValue)*1215000.0;

                megabitpersecondSI=(edtValue)*9953.28;

                megabytepersecondSI=(edtValue)*1244.16;

                megabitpersecond=(edtValue)*9492.1875;

                megabytepersecond=(edtValue)*1186.5234375;

                gigabitpersecondSI=(edtValue)*9.95328;

                gigabytepersecondSI=(edtValue)*1.24416;

                gigabitpersecond=(edtValue)*9.2697143555;

                gigabytepersecond=(edtValue)*1.1587142944;

                terabitpersecondSI=(edtValue)*0.00995328;

                terabytepersecondSI=(edtValue)*0.00124416;

                terabitpersecond=(edtValue)*0.0090524554;

                terabytepersecond=(edtValue)*0.0011315569;

                ethernet=(edtValue)*995.328;

                ethernetfast=(edtValue)*99.5328;

                ethernetgigabit=(edtValue)*9.95328;

                OC1=(edtValue)*192;

                OC3=(edtValue)*64;

                OC12=(edtValue)*16;

                OC24=(edtValue)*8;

                OC48=(edtValue)*4;

                OC192=(edtValue)*1;

                OC768=(edtValue)*0.25;

                ISDNsinglechannel=(edtValue)*155520;

                ISDNdualchannel=(edtValue)*77760;

                modem110=(edtValue)*90484363.636;

                modem300=(edtValue)*33177600;

                modem1200=(edtValue)*8294400;

                modem2400=(edtValue)*4147200;

                modem9600=(edtValue)*1036800;

                modem14k=(edtValue)*691200;

                modem28k=(edtValue)*345600.0;

                modem33k=(edtValue)*296228.57143;

                modem56k=(edtValue)*177737.14286;

                SCSIAsync=(edtValue)*829.44;

                SCSISync=(edtValue)*248.832;

                SCSIFast=(edtValue)*124.416;

                SCSIFastUltra=(edtValue)*62.208;


                SCSIFastWide=(edtValue)*62.208;

                SCSIFastUltraWide=(edtValue)*31.104;

                SCSIUltra2=(edtValue)*15.552;

                SCSIUltra3=(edtValue)*7.776;

                SCSILVDUltra80=(edtValue)*15.552;


                SCSILVDUltra160=(edtValue)*7.776;

                IDEPIOmode0=(edtValue)*377.01818182;

                IDEPIOmode1=(edtValue)*239.26153846;

                IDEPIOmode2=(edtValue)*149.89879518;

                IDEPIOmode3=(edtValue)*112.08648649;

                IDEPIOmode4=(edtValue)*74.94939759;

                IDEDMAmode0=(edtValue)*296.22857143;

                IDEDMAmode1=(edtValue)*93.545864662;

                IDEDMAmode2=(edtValue)*74.94939759;

                IDEUDMAmode0=(edtValue)*74.94939759;

                IDEUDMAmode1=(edtValue)*49.7664;

                IDEUDMAmode2=(edtValue)*37.701818182;

                IDEUDMAmode3=(edtValue)*24.8832;

                IDEUDMAmode4=(edtValue)*18.850909091;

                IDEUDMA33=(edtValue)*37.701818182;

                IDEUDMA66=(edtValue)*18.850909091;

                USB=(edtValue)*829.44;

                firewire=(edtValue)*24.8832;

                T0payload=(edtValue)*177737.14286;

                T0B8ZSpayload=(edtValue)*155520;

                T1signal=(edtValue)*6446.4248705;

                T1payload=(edtValue)*7405.7142857;

                T1Zpayload=(edtValue)*6446.4248705;

                T1Csignal=(edtValue)*3157.7664975;

                T1Cpayload=(edtValue)*3702.8571429;

                T2signal=(edtValue)*1576.8821293;

                T3signal=(edtValue)*222.48927039;

                T3payload=(edtValue)*264.48979592;

                T3Zpayload=(edtValue)*231.42857143;

                T4signal=(edtValue)*36.302521008;

                EPTA1signal=(edtValue)*4860;

                EPTA1payload=(edtValue)*5184;

                EPTA2signal=(edtValue)*1178.1818182;

                EPTA2payload=(edtValue)*1296;

                EPTA3signal=(edtValue)*289.60893855;

                EPTA3payload=(edtValue)*324;

                H0=(edtValue)*25920;

                H11=(edtValue)*6480;

                H12=(edtValue)*5184;

                VirtualTributary1signal=(edtValue)*5760;

                VirtualTributary1payload=(edtValue)*6446.4248705;

                VirtualTributary2signal=(edtValue)*4320;

                VirtualTributary2payload=(edtValue)*4860;

                VirtualTributary6signal=(edtValue)*1576.8821293;

                VirtualTributary6payload=(edtValue)*1658.88;

                STS1signal=(edtValue)*192;

                STS1payload=(edtValue)*201.07636364;

                STS3signal=(edtValue)*64;

                STS3payload=(edtValue)*66.206896552;

                STS3csignal=(edtValue)*64;

                STS3cpayload=(edtValue)*66.206896552;

                STS12signal=(edtValue)*16;

                STS24signal=(edtValue)*8;

                STS48signal=(edtValue)*4;

                STS192signal=(edtValue)*1;

                STM1signal=(edtValue)*64;

                STM4signal=(edtValue)*16;

                STM16signal=(edtValue)*4;

                STM64signal=(edtValue)*1;

                break;


            case "STM-1(signal)":

                bitpersecond=(edtValue)*155520000;

                bytepersecond=(edtValue)*19440000;

                kilobitpersecondSI=(edtValue)*155520;

                kilobytepersecondSI=(edtValue)*19440;

                kilobitpersecond=(edtValue)*151875;

                kilobytepersecond=(edtValue)*18984.375;

                megabitpersecondSI=(edtValue)*155.52;

                megabytepersecondSI=(edtValue)*19.44;

                megabitpersecond=(edtValue)*148.31542969;

                megabytepersecond=(edtValue)*18.539428711;

                gigabitpersecondSI=(edtValue)*0.15552;

                gigabytepersecondSI=(edtValue)*0.01944;

                gigabitpersecond=(edtValue)*0.1448392868;

                gigabytepersecond=(edtValue)*0.0181049109;

                terabitpersecondSI=(edtValue)*0.00015552;

                terabytepersecondSI=(edtValue)*0.00001944;

                terabitpersecond=(edtValue)*0.0001414446;

                terabytepersecond=(edtValue)*0.0000176806;

                ethernet=(edtValue)*15.552;

                ethernetfast=(edtValue)*1.5552;

                ethernetgigabit=(edtValue)*0.15552;

                OC1=(edtValue)*3;

                OC3=(edtValue)*1;

                OC12=(edtValue)*0.25;

                OC24=(edtValue)*0.125;

                OC48=(edtValue)*0.0625;

                OC192=(edtValue)*0.015625;

                OC768=(edtValue)*0.00390625;

                ISDNsinglechannel=(edtValue)*2430;

                ISDNdualchannel=(edtValue)*1215;

                modem110=(edtValue)*1413818.1818;

                modem300=(edtValue)*518400;

                modem1200=(edtValue)*129600;

                modem2400=(edtValue)*64800;

                modem9600=(edtValue)*16200;

                modem14k=(edtValue)*10800;

                modem28k=(edtValue)*5400;

                modem33k=(edtValue)*4628.5714286;

                modem56k=(edtValue)*2777.1428571;

                SCSIAsync=(edtValue)*12.96;

                SCSISync=(edtValue)*3.888;

                SCSIFast=(edtValue)*1.944;

                SCSIFastUltra=(edtValue)*0.972;


                SCSIFastWide=(edtValue)*0.972;

                SCSIFastUltraWide=(edtValue)*0.486;

                SCSIUltra2=(edtValue)*0.243;

                SCSIUltra3=(edtValue)*0.1215;

                SCSILVDUltra80=(edtValue)*0.243;


                SCSILVDUltra160=(edtValue)*0.1215;

                IDEPIOmode0=(edtValue)*5.8909090909;

                IDEPIOmode1=(edtValue)*3.7384615385;

                IDEPIOmode2=(edtValue)*2.3421686747;

                IDEPIOmode3=(edtValue)*1.7513513514;

                IDEPIOmode4=(edtValue)*1.1710843373;

                IDEDMAmode0=(edtValue)*4.6285714286;

                IDEDMAmode1=(edtValue)*1.4616541353;

                IDEDMAmode2=(edtValue)*1.1710843373;

                IDEUDMAmode0=(edtValue)*1.1710843373;

                IDEUDMAmode1=(edtValue)*0.7776;

                IDEUDMAmode2=(edtValue)*0.5890909091;

                IDEUDMAmode3=(edtValue)*0.3888;

                IDEUDMAmode4=(edtValue)*0.2945454545;

                IDEUDMA33=(edtValue)*0.5890909091;

                IDEUDMA66=(edtValue)*0.2945454545;

                USB=(edtValue)*12.96;

                firewire=(edtValue)*0.3888;

                T0payload=(edtValue)*2777.1428571;

                T0B8ZSpayload=(edtValue)*2430;

                T1signal=(edtValue)*100.7253886;

                T1payload=(edtValue)*115.71428571;

                T1Zpayload=(edtValue)*100.7253886;

                T1Csignal=(edtValue)*49.340101523;

                T1Cpayload=(edtValue)*57.857142857;

                T2signal=(edtValue)*24.63878327;

                T3signal=(edtValue)*3.4763948498;

                T3payload=(edtValue)*4.1326530612;

                T3Zpayload=(edtValue)*3.6160714286;

                T4signal=(edtValue)*0.5672268908;

                EPTA1signal=(edtValue)*75.9375;

                EPTA1payload=(edtValue)*81;

                EPTA2signal=(edtValue)*18.409090909;

                EPTA2payload=(edtValue)*20.25;

                EPTA3signal=(edtValue)*4.5251396648;

                EPTA3payload=(edtValue)*5.0625;

                H0=(edtValue)*405;

                H11=(edtValue)*101.25;

                H12=(edtValue)*81;

                VirtualTributary1signal=(edtValue)*90;

                VirtualTributary1payload=(edtValue)*100.7253886;

                VirtualTributary2signal=(edtValue)*67.5;

                VirtualTributary2payload=(edtValue)*75.9375;

                VirtualTributary6signal=(edtValue)*24.63878327;

                VirtualTributary6payload=(edtValue)*25.92;

                STS1signal=(edtValue)*3;

                STS1payload=(edtValue)*3.1418181818;

                STS3signal=(edtValue)*1;

                STS3payload=(edtValue)*1.0344827586;

                STS3csignal=(edtValue)*1;

                STS3cpayload=(edtValue)*1.0344827586;

                STS12signal=(edtValue)*0.25;

                STS24signal=(edtValue)*0.125;

                STS48signal=(edtValue)*0.0625;

                STS192signal=(edtValue)*0.015625;

                STM1signal=(edtValue)*1;

                STM4signal=(edtValue)*0.25;

                STM16signal=(edtValue)*0.0625;

                STM64signal=(edtValue)*0.015625;

                break;

            case "STM-4(signal)":

                bitpersecond=(edtValue)*622080000.0;

                bytepersecond=(edtValue)*77760000.0;

                kilobitpersecondSI=(edtValue)*622080;

                kilobytepersecondSI=(edtValue)*77760;

                kilobitpersecond=(edtValue)*607500;

                kilobytepersecond=(edtValue)*75937.5;

                megabitpersecondSI=(edtValue)*622.08;

                megabytepersecondSI=(edtValue)*77.76;

                megabitpersecond=(edtValue)*593.26171875;

                megabytepersecond=(edtValue)*74.157714844;

                gigabitpersecondSI=(edtValue)*0.62208;

                gigabytepersecondSI=(edtValue)*0.07776;

                gigabitpersecond=(edtValue)*0.5793571472;

                gigabytepersecond=(edtValue)*0.0724196434;

                terabitpersecondSI=(edtValue)*0.00062208;

                terabytepersecondSI=(edtValue)*0.00007776;

                terabitpersecond=(edtValue)*0.0005657785;

                terabytepersecond=(edtValue)*0.0000707223;

                ethernet=(edtValue)*62.208;

                ethernetfast=(edtValue)*6.2208;

                ethernetgigabit=(edtValue)*0.62208;

                OC1=(edtValue)*12;

                OC3=(edtValue)*4;

                OC12=(edtValue)*1;

                OC24=(edtValue)*0.5;

                OC48=(edtValue)*0.25;

                OC192=(edtValue)*0.0625;

                OC768=(edtValue)*0.015625;

                ISDNsinglechannel=(edtValue)*9720;

                ISDNdualchannel=(edtValue)*4860;

                modem110=(edtValue)*5655272.7273;

                modem300=(edtValue)*2073600;

                modem1200=(edtValue)*518400;

                modem2400=(edtValue)*259200;

                modem9600=(edtValue)*64800;

                modem14k=(edtValue)*43200;

                modem28k=(edtValue)*21600;

                modem33k=(edtValue)*18514.285714;

                modem56k=(edtValue)*11108.571429;

                SCSIAsync=(edtValue)*51.84;

                SCSISync=(edtValue)*15.552;

                SCSIFast=(edtValue)*7.776;

                SCSIFastUltra=(edtValue)*3.888;


                SCSIFastWide=(edtValue)*3.888;

                SCSIFastUltraWide=(edtValue)*1.944;

                SCSIUltra2=(edtValue)*0.972;

                SCSIUltra3=(edtValue)*0.486;

                SCSILVDUltra80=(edtValue)*0.972;


                SCSILVDUltra160=(edtValue)*0.486;

                IDEPIOmode0=(edtValue)*23.563636364;

                IDEPIOmode1=(edtValue)*14.953846154;

                IDEPIOmode2=(edtValue)*9.3686746988;

                IDEPIOmode3=(edtValue)*7.0054054054;

                IDEPIOmode4=(edtValue)*4.6843373494;

                IDEDMAmode0=(edtValue)*18.514285714;

                IDEDMAmode1=(edtValue)*5.8466165414;

                IDEDMAmode2=(edtValue)*4.6843373494;

                IDEUDMAmode0=(edtValue)*4.6843373494;

                IDEUDMAmode1=(edtValue)*3.1104;

                IDEUDMAmode2=(edtValue)*2.3563636364;

                IDEUDMAmode3=(edtValue)*1.5552;

                IDEUDMAmode4=(edtValue)*1.1781818182;

                IDEUDMA33=(edtValue)*1.1781818182;

                IDEUDMA66=(edtValue)*1.1781818182;

                USB=(edtValue)*51.84;

                firewire=(edtValue)*1.5552;

                T0payload=(edtValue)*11108.571429;

                T0B8ZSpayload=(edtValue)*9720;

                T1signal=(edtValue)*402.9015544;

                T1payload=(edtValue)*462.85714286;

                T1Zpayload=(edtValue)*402.9015544;

                T1Csignal=(edtValue)*197.36040609;

                T1Cpayload=(edtValue)*197.36040609;

                T2signal=(edtValue)*98.55513308;

                T3signal=(edtValue)*13.905579399;

                T3payload=(edtValue)*16.530612245;

                T3Zpayload=(edtValue)*14.464285714;

                T4signal=(edtValue)*2.268907563;

                EPTA1signal=(edtValue)*303.75;

                EPTA1payload=(edtValue)*324;

                EPTA2signal=(edtValue)*73.636363636;

                EPTA2payload=(edtValue)*81;

                EPTA3signal=(edtValue)*18.100558659;

                EPTA3payload=(edtValue)*20.25;

                H0=(edtValue)*1620;

                H11=(edtValue)*405;

                H12=(edtValue)*324;

                VirtualTributary1signal=(edtValue)*360;

                VirtualTributary1payload=(edtValue)*402.9015544;

                VirtualTributary2signal=(edtValue)*270;

                VirtualTributary2payload=(edtValue)*303.75;

                VirtualTributary6signal=(edtValue)*98.55513308;

                VirtualTributary6payload=(edtValue)*103.68;

                STS1signal=(edtValue)*12;

                STS1payload=(edtValue)*12.567272727;

                STS3signal=(edtValue)*4;

                STS3payload=(edtValue)*4.1379310345;

                STS3csignal=(edtValue)*4;

                STS3cpayload=(edtValue)*4.1379310345;

                STS12signal=(edtValue)*1;

                STS24signal=(edtValue)*0.5;

                STS48signal=(edtValue)*0.25;

                STS192signal=(edtValue)*0.0625;

                STM1signal=(edtValue)*4;

                STM4signal=(edtValue)*1;

                STM16signal=(edtValue)*0.25;

                STM64signal=(edtValue)*0.0625;

                break;
            case "STM-16(signal)":

                bitpersecond=(edtValue)*2488320000.0;

                bytepersecond=(edtValue)*311040000.0;

                kilobitpersecondSI=(edtValue)*2488320.0;

                kilobytepersecondSI=(edtValue)*311040.0;

                kilobitpersecond=(edtValue)*2430000.0;

                kilobytepersecond=(edtValue)*303750;

                megabitpersecondSI=(edtValue)*2488.32;

                megabytepersecondSI=(edtValue)*311.04;

                megabitpersecond=(edtValue)*2373.046875;

                megabytepersecond=(edtValue)*296.63085937;

                gigabitpersecondSI=(edtValue)*2.48832;

                gigabytepersecondSI=(edtValue)*0.31104;

                gigabitpersecond=(edtValue)*2.3174285889;

                gigabytepersecond=(edtValue)*0.2896785736;

                terabitpersecondSI=(edtValue)*0.00248832;

                terabytepersecondSI=(edtValue)*0.00031104;

                terabitpersecond=(edtValue)*0.0022631139;

                terabytepersecond=(edtValue)*0.0002828892;

                ethernet=(edtValue)*248.832;

                ethernetfast=(edtValue)*24.8832;

                ethernetgigabit=(edtValue)*2.48832;

                OC1=(edtValue)*48;

                OC3=(edtValue)*16;

                OC12=(edtValue)*4;

                OC24=(edtValue)*2;

                OC48=(edtValue)*1;

                OC192=(edtValue)*0.25;

                OC768=(edtValue)*0.0625;

                ISDNsinglechannel=(edtValue)*38880;

                ISDNdualchannel=(edtValue)*19440;

                modem110=(edtValue)*22621090.909;

                modem300=(edtValue)*8294400;

                modem1200=(edtValue)*2073600;

                modem2400=(edtValue)*1036800;

                modem9600=(edtValue)*259200;

                modem14k=(edtValue)*172800;

                modem28k=(edtValue)*86400;

                modem33k=(edtValue)*74057.142857;

                modem56k=(edtValue)*44434.285714;

                SCSIAsync=(edtValue)*207.36;

                SCSISync=(edtValue)*62.208;

                SCSIFast=(edtValue)*31.104;

                SCSIFastUltra=(edtValue)*15.552;


                SCSIFastWide=(edtValue)*15.552;

                SCSIFastUltraWide=(edtValue)*7.776;

                SCSIUltra2=(edtValue)*3.888;

                SCSIUltra3=(edtValue)*1.944;

                SCSILVDUltra80=(edtValue)*3.888;


                SCSILVDUltra160=(edtValue)*1.944;

                IDEPIOmode0=(edtValue)*94.254545455;

                IDEPIOmode1=(edtValue)*59.815384615;

                IDEPIOmode2=(edtValue)*37.474698795;

                IDEPIOmode3=(edtValue)*28.021621622;

                IDEPIOmode4=(edtValue)*18.737349398;

                IDEDMAmode0=(edtValue)*74.057142857;

                IDEDMAmode1=(edtValue)*23.386466165;

                IDEDMAmode2=(edtValue)*18.737349398;

                IDEUDMAmode0=(edtValue)*18.737349398;

                IDEUDMAmode1=(edtValue)*12.4416;

                IDEUDMAmode2=(edtValue)*9.4254545455;

                IDEUDMAmode3=(edtValue)*6.2208;

                IDEUDMAmode4=(edtValue)*4.7127272727;

                IDEUDMA33=(edtValue)*9.4254545455;

                IDEUDMA66=(edtValue)*4.7127272727;

                USB=(edtValue)*207.36;

                firewire=(edtValue)*6.2208;

                T0payload=(edtValue)*44434.285714;

                T0B8ZSpayload=(edtValue)*38880;

                T1signal=(edtValue)*1611.6062176;

                T1payload=(edtValue)*1851.4285714;

                T1Zpayload=(edtValue)*1611.6062176;

                T1Csignal=(edtValue)*789.44162437;

                T1Cpayload=(edtValue)*925.71428571;

                T2signal=(edtValue)*394.22053232;

                T3signal=(edtValue)*55.622317597;

                T3payload=(edtValue)*66.12244898;

                T3Zpayload=(edtValue)*57.857142857;

                T4signal=(edtValue)*9.0756302521;

                EPTA1signal=(edtValue)*1215;

                EPTA1payload=(edtValue)*1296;

                EPTA2signal=(edtValue)*294.54545455;

                EPTA2payload=(edtValue)*324;

                EPTA3signal=(edtValue)*72.402234637;

                EPTA3payload=(edtValue)*81;

                H0=(edtValue)*6480;

                H11=(edtValue)*1620;

                H12=(edtValue)*1296;

                VirtualTributary1signal=(edtValue)*1440;

                VirtualTributary1payload=(edtValue)*1611.6062176;

                VirtualTributary2signal=(edtValue)*1080;

                VirtualTributary2payload=(edtValue)*1215;

                VirtualTributary6signal=(edtValue)*394.22053232;

                VirtualTributary6payload=(edtValue)*414.72;

                STS1signal=(edtValue)*48;

                STS1payload=(edtValue)*50.269090909;

                STS3signal=(edtValue)*16;

                STS3payload=(edtValue)*16.551724138;

                STS3csignal=(edtValue)*16;

                STS3cpayload=(edtValue)*16.551724138;

                STS12signal=(edtValue)*4;

                STS24signal=(edtValue)*2;

                STS48signal=(edtValue)*1;

                STS192signal=(edtValue)*0.25;

                STM1signal=(edtValue)*16;

                STM4signal=(edtValue)*4;

                STM16signal=(edtValue)*0.0625;

                STM64signal=(edtValue)*0.015625;
                break;

            case "STM-64(signal)":

                bitpersecond=(edtValue)*9953280000.0;

                bytepersecond=(edtValue)*1244160000;

                kilobitpersecondSI=(edtValue)*9953280;

                kilobytepersecondSI=(edtValue)*1244160;

                kilobitpersecond=(edtValue)*9720000;

                kilobytepersecond=(edtValue)*1215000;

                megabitpersecondSI=(edtValue)*9953.28;

                megabytepersecondSI=(edtValue)*1244.16;

                megabitpersecond=(edtValue)*9492.1875;

                megabytepersecond=(edtValue)*1186.5234375;

                gigabitpersecondSI=(edtValue)*9.95328;

                gigabytepersecondSI=(edtValue)*1.24416;

                gigabitpersecond=(edtValue)*9.2697143555;

                gigabytepersecond=(edtValue)*1.1587142944;

                terabitpersecondSI=(edtValue)*0.00995328;

                terabytepersecondSI=(edtValue)*0.00124416;

                terabitpersecond=(edtValue)*0.0090524554;

                terabytepersecond=(edtValue)*0.0011315569;

                ethernet=(edtValue)*995.328;

                ethernetfast=(edtValue)*99.5328;

                ethernetgigabit=(edtValue)*9.95328;

                OC1=(edtValue)*192;

                OC3=(edtValue)*64;

                OC12=(edtValue)*16;

                OC24=(edtValue)*8;

                OC48=(edtValue)*4;

                OC192=(edtValue)*1;

                OC768=(edtValue)*0.25;

                ISDNsinglechannel=(edtValue)*155520;

                ISDNdualchannel=(edtValue)*77760;

                modem110=(edtValue)*90484363.636;

                modem300=(edtValue)*33177600;

                modem1200=(edtValue)*8294400;

                modem2400=(edtValue)*4147200;

                modem9600=(edtValue)*1036800;

                modem14k=(edtValue)*691200;

                modem28k=(edtValue)*345600;

                modem33k=(edtValue)*296228.57143;

                modem56k=(edtValue)*177737.14286;

                SCSIAsync=(edtValue)*829.44;

                SCSISync=(edtValue)*248.832;

                SCSIFast=(edtValue)*124.416;

                SCSIFastUltra=(edtValue)*62.208;


                SCSIFastWide=(edtValue)*62.208;

                SCSIFastUltraWide=(edtValue)*31.104;

                SCSIUltra2=(edtValue)*15.552;

                SCSIUltra3=(edtValue)*7.776;

                SCSILVDUltra80=(edtValue)*15.552;


                SCSILVDUltra160=(edtValue)*7.776;

                IDEPIOmode0=(edtValue)*377.01818182;

                IDEPIOmode1=(edtValue)*239.26153846;

                IDEPIOmode2=(edtValue)*149.89879518;

                IDEPIOmode3=(edtValue)*112.08648649;

                IDEPIOmode4=(edtValue)*74.94939759;

                IDEDMAmode0=(edtValue)*296.22857143;

                IDEDMAmode1=(edtValue)*93.545864662;

                IDEDMAmode2=(edtValue)*74.94939759;

                IDEUDMAmode0=(edtValue)*74.94939759;

                IDEUDMAmode1=(edtValue)*49.7664;

                IDEUDMAmode2=(edtValue)*37.701818182;

                IDEUDMAmode3=(edtValue)*24.8832;

                IDEUDMAmode4=(edtValue)*18.850909091;

                IDEUDMA33=(edtValue)*37.701818182;

                IDEUDMA66=(edtValue)*18.850909091;

                USB=(edtValue)*829.44;

                firewire=(edtValue)*24.8832;

                T0payload=(edtValue)*177737.14286;

                T0B8ZSpayload=(edtValue)*155520;

                T1signal=(edtValue)*6446.4248705;

                T1payload=(edtValue)*7405.7142857;

                T1Zpayload=(edtValue)*6446.4248705;

                T1Csignal=(edtValue)*3157.7664975;

                T1Cpayload=(edtValue)*3702.8571429;

                T2signal=(edtValue)*1576.8821293;

                T3signal=(edtValue)*222.48927039;

                T3payload=(edtValue)*264.48979592;

                T3Zpayload=(edtValue)*231.42857143;

                T4signal=(edtValue)*36.302521008;

                EPTA1signal=(edtValue)*4860;

                EPTA1payload=(edtValue)*5184;

                EPTA2signal=(edtValue)*1178.1818182;

                EPTA2payload=(edtValue)*1296;

                EPTA3signal=(edtValue)*289.60893855;

                EPTA3payload=(edtValue)*324;

                H0=(edtValue)*25920;

                H11=(edtValue)*6480;

                H12=(edtValue)*5184;

                VirtualTributary1signal=(edtValue)*5760;

                VirtualTributary1payload=(edtValue)*6446.4248705;

                VirtualTributary2signal=(edtValue)*4320;

                VirtualTributary2payload=(edtValue)*4860;

                VirtualTributary6signal=(edtValue)*1576.8821293;

                VirtualTributary6payload=(edtValue)*1658.88;

                STS1signal=(edtValue)*192;

                STS1payload=(edtValue)*201.07636364;

                STS3signal=(edtValue)*64;

                STS3payload=(edtValue)*66.206896552;

                STS3csignal=(edtValue)*64;

                STS3cpayload=(edtValue)*66.206896552;

                STS12signal=(edtValue)*16;

                STS24signal=(edtValue)*8;

                STS48signal=(edtValue)*4;

                STS192signal=(edtValue)*1;

                STM1signal=(edtValue)*64;

                STM4signal=(edtValue)*16;

                STM16signal=(edtValue)*4;

                STM64signal=(edtValue)*1;

                break;





        }

        results.setBitpersecond(bitpersecond);
        results.setBytepersecond(bytepersecond);

        results.setKilobitpersecondSI(kilobitpersecondSI);
        results.setKilobytepersecondSI(kilobytepersecondSI);

        results.setKilobitpersecond(kilobitpersecond);
        results.setKilobytepersecond(kilobytepersecond);

        results.setMegabitpersecondSI(megabitpersecondSI);
        results.setMegabytepersecondSI(megabytepersecondSI);

        results.setMegabitpersecond(megabitpersecond);
        results.setMegabytepersecond(megabytepersecond);

        results.setGigabitpersecondSI(gigabitpersecondSI);
        results.setGigabytepersecondSI(gigabytepersecondSI);

        results.setGigabitpersecond(gigabitpersecond);
        results.setGigabytepersecond(gigabytepersecond);

        results.setTerabitpersecondSI(terabitpersecondSI);
        results.setTerabytepersecondSI(terabytepersecondSI);


        results.setTerabitpersecond(terabitpersecond);
        results.setTerabytepersecond(terabytepersecond);

        results.setEthernet(ethernet);
        results.setEthernetfast(ethernetfast);


        results.setEthernetgigabit(ethernetgigabit);
        results.setOC1(OC1);


        results.setOC3(OC3);
        results.setOC12(OC12);


        results.setOC24(OC24);
        results.setOC48(OC48);

        results.setOC192(OC192);
        results.setOC768(OC768);

        results.setISDNsinglechannel(ISDNsinglechannel);
        results.setISDNdualchannel(ISDNdualchannel);

        results.setModem110(modem110);
        results.setModem300(modem300);

        results.setModem1200(modem1200);
        results.setModem2400(modem2400);

        results.setModem9600(modem9600);
        results.setModem14k(modem14k);


        results.setModem28k(modem28k);
        results.setModem33k(modem33k);


        results.setModem56k(modem56k);
        results.setSCSIAsync(SCSIAsync);


        results.setSCSISync(SCSISync);
        results.setSCSIFast(SCSIFast);


        results.setSCSIFastUltra(SCSIFastUltra);
        results.setSCSIFastWide(SCSIFastWide);


        results.setSCSIFastUltraWide(SCSIFastUltraWide);
        results.setSCSIUltra2(SCSIUltra2);


        results.setSCSIUltra3(SCSIUltra3);
        results.setSCSILVDUltra80(SCSILVDUltra80);

        results.setSCSILVDUltra160(SCSILVDUltra160);
        results.setIDEPIOmode0(IDEPIOmode0);


        results.setIDEPIOmode1(IDEPIOmode1);
        results.setIDEPIOmode2(IDEPIOmode2);

        results.setIDEPIOmode3(IDEPIOmode3);
        results.setIDEPIOmode4(IDEPIOmode4);

        results.setIDEDMAmode0(IDEDMAmode0);
        results.setIDEDMAmode1(IDEDMAmode1);

        results.setIDEDMAmode2(IDEDMAmode2);
        results.setIDEUDMAmode0 (IDEUDMAmode0);

        results.setIDEUDMAmode1 (IDEUDMAmode1);
        results.setIDEUDMAmode2 (IDEUDMAmode2);

        results. setIDEUDMAmode3( IDEUDMAmode3) ;
        results. setIDEUDMAmode4( IDEUDMAmode4);

        results. setIDEUDMA33( IDEUDMA33) ;
        results. setIDEUDMA66( IDEUDMA66);

        results. setUSB( USB);
        results. setFirewire( firewire) ;

        results. setT0payload( T0payload);
        results. setT0B8ZSpayload(T0B8ZSpayload) ;

        results. setT1signal( T1signal) ;
        results. setT1payload( T1payload);

        results. setT1Zpayload( T1Zpayload);
        results. setT1Csignal( T1Csignal);

        results. setT1Cpayload( T1Cpayload) ;
        results. setT2signal( T2signal) ;

        results. setT3signal( T3signal);
        results. setT3payload( T3payload);

        results. setT3Zpayload( T3Zpayload);
        results. setT4signal( T4signal);

        results. setEPTA1signal( EPTA1signal) ;
        results. setEPTA1payload( EPTA1payload);

        results. setEPTA2signal( EPTA2signal);
        results. setEPTA2payload( EPTA2payload) ;

        results. setEPTA3signal( EPTA3signal) ;
        results. setEPTA3payload( EPTA3payload) ;

        results. setH0( H0) ;
        results. setH11( H11);

        results. setH12( H12);
        results. setVirtualTributary1signal( VirtualTributary1signal);

        results. setVirtualTributary1payload( VirtualTributary1payload);
        results. setVirtualTributary2signal( VirtualTributary2signal);

        results. setVirtualTributary2payload( VirtualTributary2payload);
        results. setVirtualTributary6signal( VirtualTributary6signal) ;

        results. setVirtualTributary6payload( VirtualTributary6payload) ;
        results. setSTS1signal( STS1signal);

        results. setSTS1payload( STS1payload);
        results. setSTS3signal( STS3signal);

        results. setSTS3payload( STS3payload);
        results. setSTS3csignal( STS3csignal);

        results. setSTS3cpayload( STS3cpayload);
        results. setSTS12signal( STS12signal) ;

        results. setSTS24signal( STS24signal);
        results. setSTS48signal( STS48signal);

        results. setSTS192signal( STS192signal) ;
        results. setSTM1signal( STM1signal) ;

        results. setSTM4signal( STM4signal) ;
        results. setSTM16signal( STM16signal);

        results. setSTM64signal( STM64signal);

        converterArray.add(results);
        return converterArray;


    }

    private void T1payload() {
        bitpersecond=(edtValue)*1344000.0;

        bytepersecond=(edtValue)*168000;

        kilobitpersecondSI=(edtValue)*1344;

        kilobytepersecondSI=(edtValue)*168;

        kilobitpersecond=(edtValue)*1312.5;

        kilobytepersecond=(edtValue)*164.0625;

        megabitpersecondSI=(edtValue)*1.344;

        megabytepersecondSI=(edtValue)*0.168;

        megabitpersecond=(edtValue)*1.2817382812;

        megabytepersecond=(edtValue)*0.1602172852;

        gigabitpersecondSI=(edtValue)*0.001344;

        gigabytepersecondSI=(edtValue)*0.000168;

        gigabitpersecond=(edtValue)*0.0012516975;

        gigabytepersecond=(edtValue)*0.0001564622;

        terabitpersecondSI=(edtValue)*0.000001344;

        terabytepersecondSI=(edtValue)*1.679999999E-7;

        terabitpersecond=(edtValue)*0.0000012224;

        terabytepersecond=(edtValue)*1.527951098E-7;

        ethernet=(edtValue)*0.1344;

        ethernetfast=(edtValue)*0.01344;

        ethernetgigabit=(edtValue)*0.001344;

        OC1=(edtValue)*0.0259259259;

        OC3=(edtValue)*0.0086419753;

        OC12=(edtValue)*0.0021604938;

        OC24=(edtValue)*0.0010802469;

        OC48=(edtValue)*0.0005401235;

        OC192=(edtValue)*0.0001350309;

        OC768=(edtValue)*0.0000337577;

        ISDNsinglechannel=(edtValue)*21;

        ISDNdualchannel=(edtValue)*10.5;

        modem110=(edtValue)*12218.181818;

        modem300=(edtValue)*4480;

        modem1200=(edtValue)*1120;

        modem2400=(edtValue)*560;

        modem9600=(edtValue)*140;

        modem14k=(edtValue)*93.333333333;

        modem28k=(edtValue)*46.666666667;

        modem33k=(edtValue)*40;

        modem56k=(edtValue)*24;

        SCSIAsync=(edtValue)*0.112;

        SCSISync=(edtValue)*0.0336;

        SCSIFast=(edtValue)*0.0168;

        SCSIFastUltra=(edtValue)*0.0084;


        SCSIFastWide=(edtValue)*0.0084;

        SCSIFastUltraWide=(edtValue)*0.0042;

        SCSIUltra2=(edtValue)*0.0021;

        SCSIUltra3=(edtValue)*0.00105;

        SCSILVDUltra80=(edtValue)*0.0021;


        SCSILVDUltra160=(edtValue)*0.00105;

        IDEPIOmode0=(edtValue)*0.0509090909;

        IDEPIOmode1=(edtValue)*0.0323076923;

        IDEPIOmode2=(edtValue)*0.0202409639;

        IDEPIOmode3=(edtValue)*0.0151351351;

        IDEPIOmode4=(edtValue)*0.0101204819;

        IDEDMAmode0=(edtValue)*0.04;

        IDEDMAmode1=(edtValue)*0.0126315789;

        IDEDMAmode2=(edtValue)*0.0101204819;

        IDEUDMAmode0=(edtValue)*0.0101204819;

        IDEUDMAmode1=(edtValue)*0.00672;

        IDEUDMAmode2=(edtValue)*0.0050909091;

        IDEUDMAmode3=(edtValue)*0.00336;

        IDEUDMAmode4=(edtValue)*0.0025454545;

        IDEUDMA33=(edtValue)*0.0050909091;

        IDEUDMA66=(edtValue)*0.0025454545;

        USB=(edtValue)*0.112;

        firewire=(edtValue)*0.00336;

        T0payload=(edtValue)*24;

        T0B8ZSpayload=(edtValue)*21;

        T1signal=(edtValue)*0.8704663212;

        T1payload=(edtValue)*1;

        T1Zpayload=(edtValue)*0.8704663212;

        T1Csignal=(edtValue)*0.4263959391;

        T1Cpayload=(edtValue)*0.5;

        T2signal=(edtValue)*0.2129277567;

        T3signal=(edtValue)*0.0300429185;

        T3payload=(edtValue)*0.0357142857;

        T3Zpayload=(edtValue)*0.03125;

        T4signal=(edtValue)*0.0049019608;

        EPTA1signal=(edtValue)*0.65625;

        EPTA1payload=(edtValue)*0.7;

        EPTA2signal=(edtValue)*0.1590909091;

        EPTA2payload=(edtValue)*0.175;

        EPTA3signal=(edtValue)*0.0391061453;

        EPTA3payload=(edtValue)*0.04375;

        H0=(edtValue)*3.5;

        H11=(edtValue)*0.875;

        H12=(edtValue)*0.7;

        VirtualTributary1signal=(edtValue)*0.7777777778;

        VirtualTributary1payload=(edtValue)*0.8704663212;

        VirtualTributary2signal=(edtValue)*0.5833333333;

        VirtualTributary2payload=(edtValue)*0.65625;

        VirtualTributary6signal=(edtValue)*0.2129277567;

        VirtualTributary6payload=(edtValue)*0.224;

        STS1signal=(edtValue)*0.0259259259;

        STS1payload=(edtValue)*0.0271515152;

        STS3signal=(edtValue)*0.0086419753;

        STS3payload=(edtValue)*0.0089399745;

        STS3csignal=(edtValue)*0.0086419753;

        STS3cpayload=(edtValue)*0.0089399745;

        STS12signal=(edtValue)*0.0021604938;

        STS24signal=(edtValue)*0.0010802469;

        STS48signal=(edtValue)*0.0005401235;

        STS192signal=(edtValue)*0.0001350309;

        STM1signal=(edtValue)*0.0086419753;

        STM4signal=(edtValue)*0.0021604938;

        STM16signal=(edtValue)*0.0005401235;

        STM64signal=(edtValue)*0.0001350309;
    }

    private void T1signal() {

        bitpersecond=(edtValue)*1544000;

        bytepersecond=(edtValue)*193000;

        kilobitpersecondSI=(edtValue)*1544;

        kilobytepersecondSI=(edtValue)*193;

        kilobitpersecond=(edtValue)*1507.8125;

        kilobytepersecond=(edtValue)*188.4765625;

        megabitpersecondSI=(edtValue)*1.544;

        megabytepersecondSI=(edtValue)*0.193;

        megabitpersecond=(edtValue)*1.4724731445;

        megabytepersecond=(edtValue)*0.1840591431;

        gigabitpersecondSI=(edtValue)*0.001544;

        gigabytepersecondSI=(edtValue)*0.000193;

        gigabitpersecond=(edtValue)*0.0014379621;

        gigabytepersecond=(edtValue)*0.0001797453;

        terabitpersecondSI=(edtValue)*0.000001544;

        terabytepersecondSI=(edtValue)*1.93E-7;

        terabitpersecond=(edtValue)*0.0000014043;

        terabytepersecond=(edtValue)*1.755324774E-7;

        ethernet=(edtValue)*0.1544;

        ethernetfast=(edtValue)*0.01544;

        ethernetgigabit=(edtValue)*0.001544;

        OC1=(edtValue)*0.0297839506;

        OC3=(edtValue)*0.0099279835;

        OC12=(edtValue)*0.0024819959;

        OC24=(edtValue)*0.0012409979;

        OC48=(edtValue)*0.000620499;

        OC192=(edtValue)*0.0001551247;

        OC768=(edtValue)*0.0000387812;

        ISDNsinglechannel=(edtValue)*24.125;

        ISDNdualchannel=(edtValue)*12.0625;

        modem110=(edtValue)*14036.363636;

        modem300=(edtValue)*5146.6666667;

        modem1200=(edtValue)*1286.6666667;

        modem2400=(edtValue)*643.33333333;

        modem9600=(edtValue)*160.83333333;

        modem14k=(edtValue)*107.22222222;

        modem28k=(edtValue)*53.611111111;

        modem33k=(edtValue)*45.952380952;

        modem56k=(edtValue)*27.571428571;

        SCSIAsync=(edtValue)*0.1286666667;

        SCSISync=(edtValue)*0.0386;

        SCSIFast=(edtValue)*0.0193;

        SCSIFastUltra=(edtValue)*0.00965;


        SCSIFastWide=(edtValue)*0.00965;

        SCSIFastUltraWide=(edtValue)*0.004825;

        SCSIUltra2=(edtValue)*0.0024125;

        SCSIUltra3=(edtValue)*0.00120625;

        SCSILVDUltra80=(edtValue)*0.0024125;


        SCSILVDUltra160=(edtValue)*0.00120625;

        IDEPIOmode0=(edtValue)*0.0584848485;

        IDEPIOmode1=(edtValue)*0.0371153846;

        IDEPIOmode2=(edtValue)*0.023253012;

        IDEPIOmode3=(edtValue)*0.0173873874;

        IDEPIOmode4=(edtValue)*0.011626506;

        IDEDMAmode0=(edtValue)*0.045952381;

        IDEDMAmode1=(edtValue)*0.0145112782;

        IDEDMAmode2=(edtValue)*0.011626506;

        IDEUDMAmode0=(edtValue)*0.011626506;

        IDEUDMAmode1=(edtValue)*0.00772;

        IDEUDMAmode2=(edtValue)*0.0058484848;

        IDEUDMAmode3=(edtValue)*0.00386;

        IDEUDMAmode4=(edtValue)*0.0029242424;

        IDEUDMA33=(edtValue)*0.0058484848;

        IDEUDMA66=(edtValue)*0.0029242424;

        USB=(edtValue)*0.1286666667;

        firewire=(edtValue)*0.00386;

        T0payload=(edtValue)*27.571428571;

        T0B8ZSpayload=(edtValue)*24.125;

        T1signal=(edtValue)*1;

        T1payload=(edtValue)*1.1488095238;

        T1Zpayload=(edtValue)*1;

        T1Csignal=(edtValue)*0.4898477157;

        T1Cpayload=(edtValue)*0.5744047619;

        T2signal=(edtValue)*0.2446134347;

        T3signal=(edtValue)*0.0345135908;

        T3payload=(edtValue)*0.0410289116;

        T3Zpayload=(edtValue)*0.0359002976;

        T4signal=(edtValue)*0.0056314192;

        EPTA1signal=(edtValue)*0.75390625;

        EPTA1payload=(edtValue)*0.8041666667;

        EPTA2signal=(edtValue)*0.1827651515;

        EPTA2payload=(edtValue)*0.2010416667;

        EPTA3signal=(edtValue)*0.0449255121;

        EPTA3payload=(edtValue)*0.0502604167;

        H0=(edtValue)*4.0208333333;

        H11=(edtValue)*1.0052083333;

        H12=(edtValue)*0.8041666667;

        VirtualTributary1signal=(edtValue)*0.8935185185;

        VirtualTributary1payload=(edtValue)*1;

        VirtualTributary2signal=(edtValue)*0.6701388889;

        VirtualTributary2payload=(edtValue)*0.75390625;

        VirtualTributary6signal=(edtValue)*0.2446134347;

        VirtualTributary6payload=(edtValue)*0.2573333333;

        STS1signal=(edtValue)*0.0297839506;

        STS1payload=(edtValue)*0.0311919192;

        STS3signal=(edtValue)*0.0099279835;

        STS3payload=(edtValue)*0.0102703278;

        STS3csignal=(edtValue)*0.0099279835;

        STS3cpayload=(edtValue)*0.0102703278;

        STS12signal=(edtValue)*0.0024819959;

        STS24signal=(edtValue)*0.0012409979;

        STS48signal=(edtValue)*0.000620499;

        STS192signal=(edtValue)*0.0001551247;

        STM1signal=(edtValue)*0.0099279835;

        STM4signal=(edtValue)*0.0024819959;

        STM16signal=(edtValue)*0.000620499;

        STM64signal=(edtValue)*0.0001551247;
    }

    private void T0B8ZSpayload() {

        bitpersecond=(edtValue)*64000;

        bytepersecond=(edtValue)*8000;

        kilobitpersecondSI=(edtValue)*64;

        kilobytepersecondSI=(edtValue)*8;

        kilobitpersecond=(edtValue)*62.5;

        kilobytepersecond=(edtValue)*7.8125;

        megabitpersecondSI=(edtValue)*0.064;

        megabytepersecondSI=(edtValue)*0.008;

        megabitpersecond=(edtValue)*0.0610351563;

        megabytepersecond=(edtValue)*0.0076293945;

        gigabitpersecondSI=(edtValue)*0.000064;

        gigabytepersecondSI=(edtValue)*0.000008;

        gigabitpersecond=(edtValue)*0.0000596046;

        gigabytepersecond=(edtValue)*0.0000074506;

        terabitpersecondSI=(edtValue)*6.4E-8;

        terabytepersecondSI=(edtValue)*8.E-9;

        terabitpersecond=(edtValue)*5.820766091E-8;

        terabytepersecond=(edtValue)*7.275957614E-9;

        ethernet=(edtValue)*0.0064;

        ethernetfast=(edtValue)*0.00064;

        ethernetgigabit=(edtValue)*0.000064;

        OC1=(edtValue)*0.0012345679;

        OC3=(edtValue)*0.0004115226;

        OC12=(edtValue)*0.0001028807;

        OC24=(edtValue)*0.0000514403;

        OC48=(edtValue)*0.0000257202;

        OC192=(edtValue)*0.00000643;

        OC768=(edtValue)*0.0000016075;

        ISDNsinglechannel=(edtValue)*1;

        ISDNdualchannel=(edtValue)*0.5;

        modem110=(edtValue)*581.81818182;

        modem300=(edtValue)*213.33333333;

        modem1200=(edtValue)*53.333333333;

        modem2400=(edtValue)*26.666666667;

        modem9600=(edtValue)*6.6666666667;

        modem14k=(edtValue)*4.4444444444;

        modem28k=(edtValue)*2.2222222222;

        modem33k=(edtValue)*1.9047619048;

        modem56k=(edtValue)*1.1428571429;

        SCSIAsync=(edtValue)*0.0053333333;

        SCSISync=(edtValue)*0.0016;

        SCSIFast=(edtValue)*0.0008;

        SCSIFastUltra=(edtValue)*0.0004;


        SCSIFastWide=(edtValue)*0.0004;

        SCSIFastUltraWide=(edtValue)*0.0002;

        SCSIUltra2=(edtValue)*0.0001;

        SCSIUltra3=(edtValue)*0.00005;

        SCSILVDUltra80=(edtValue)*0.0001;


        SCSILVDUltra160=(edtValue)*0.00005;

        IDEPIOmode0=(edtValue)*0.0024242424;

        IDEPIOmode1=(edtValue)*0.0015384615;

        IDEPIOmode2=(edtValue)*0.0009638554;

        IDEPIOmode3=(edtValue)*0.0007207207;

        IDEPIOmode4=(edtValue)*0.0004819277;

        IDEDMAmode0=(edtValue)*0.0019047619;

        IDEDMAmode1=(edtValue)*0.0006015038;

        IDEDMAmode2=(edtValue)*0.0004819277;

        IDEUDMAmode0=(edtValue)*0.0004819277;

        IDEUDMAmode1=(edtValue)*0.00032;

        IDEUDMAmode2=(edtValue)*0.0002424242;

        IDEUDMAmode3=(edtValue)*0.00016;

        IDEUDMAmode4=(edtValue)*0.0001212121;

        IDEUDMA33=(edtValue)*0.0002424242;

        IDEUDMA66=(edtValue)*0.0001212121;

        USB=(edtValue)*0.0053333333;

        firewire=(edtValue)*0.00016;

        T0payload=(edtValue)*1.1428571429;

        T0B8ZSpayload=(edtValue)*1;

        T1signal=(edtValue)*0.0414507772;

        T1payload=(edtValue)*0.0476190476;

        T1Zpayload=(edtValue)*0.0414507772;

        T1Csignal=(edtValue)*0.0203045685;

        T1Cpayload=(edtValue)*0.0238095238;

        T2signal=(edtValue)*0.010139417;

        T3signal=(edtValue)*0.0014306152;

        T3payload=(edtValue)*0.0017006803;

        T3Zpayload=(edtValue)*0.0014880952;

        T4signal=(edtValue)*0.0002334267;

        EPTA1signal=(edtValue)*0.03125;

        EPTA1payload=(edtValue)*0.0333333333;

        EPTA2signal=(edtValue)*0.0075757576;

        EPTA2payload=(edtValue)*0.0083333333;

        EPTA3signal=(edtValue)*0.0018621974;

        EPTA3payload=(edtValue)*0.0020833333;

        H0=(edtValue)*0.1666666667;

        H11=(edtValue)*0.0416666667;

        H12=(edtValue)*0.0333333333;

        VirtualTributary1signal=(edtValue)*0.037037037;

        VirtualTributary1payload=(edtValue)*0.0414507772;

        VirtualTributary2signal=(edtValue)*0.0277777778;

        VirtualTributary2payload=(edtValue)*0.03125;

        VirtualTributary6signal=(edtValue)*0.010139417;

        VirtualTributary6payload=(edtValue)*0.0106666667;

        STS1signal=(edtValue)*0.0012345679;

        STS1payload=(edtValue)*0.0012929293;

        STS3signal=(edtValue)*0.0004115226;

        STS3payload=(edtValue)*0.0004257131;

        STS3csignal=(edtValue)*0.0004115226;

        STS3cpayload=(edtValue)*0.0004257131;

        STS12signal=(edtValue)*0.0001028807;

        STS24signal=(edtValue)*0.0000514403;

        STS48signal=(edtValue)*0.0000257202;

        STS192signal=(edtValue)*0.00000643;

        STM1signal=(edtValue)*0.0004115226;

        STM4signal=(edtValue)*0.0001028807;

        STM16signal=(edtValue)*0.0000257202;

        STM64signal=(edtValue)*0.00000643;
    }

    private void T0payload() {

        bitpersecond=(edtValue)*56000;

        bytepersecond=(edtValue)*7000;

        kilobitpersecondSI=(edtValue)*56;

        kilobytepersecondSI=(edtValue)*7;

        kilobitpersecond=(edtValue)*54.6875;

        kilobytepersecond=(edtValue)*6.8359375;

        megabitpersecondSI=(edtValue)*0.056;

        megabytepersecondSI=(edtValue)*0.007;

        megabitpersecond=(edtValue)*0.0534057617;

        megabytepersecond=(edtValue)*0.0066757202;

        gigabitpersecondSI=(edtValue)*0.000056;

        gigabytepersecondSI=(edtValue)*0.000007;

        gigabitpersecond=(edtValue)*0.0000521541;

        gigabytepersecond=(edtValue)*0.0000065193;

        terabitpersecondSI=(edtValue)*5.599999999E-8;

        terabytepersecondSI=(edtValue)*6.999999999E-9;

        terabitpersecond=(edtValue)*5.093170329E-8;

        terabytepersecond=(edtValue)*6.366462912E-9;

        ethernet=(edtValue)*0.0056;

        ethernetfast=(edtValue)*0.00056;

        ethernetgigabit=(edtValue)*0.000056;

        OC1=(edtValue)*0.0010802469;

        OC3=(edtValue)*0.0003600823;

        OC12=(edtValue)*0.0000900206;

        OC24=(edtValue)*0.0000450103;

        OC48=(edtValue)*0.0000225051;

        OC192=(edtValue)*0.0000056263;

        OC768=(edtValue)*0.0000014066;

        ISDNsinglechannel=(edtValue)*0.875;

        ISDNdualchannel=(edtValue)*0.4375;

        modem110=(edtValue)*509.09090909;

        modem300=(edtValue)*186.66666667;

        modem1200=(edtValue)*46.666666667;

        modem2400=(edtValue)*23.333333333;

        modem9600=(edtValue)*5.8333333333;

        modem14k=(edtValue)*3.8888888889;

        modem28k=(edtValue)*1.9444444444;

        modem33k=(edtValue)*1.6666666667;

        modem56k=(edtValue)*1;

        SCSIAsync=(edtValue)*0.0046666667;

        SCSISync=(edtValue)*0.0014;

        SCSIFast=(edtValue)*0.0007;

        SCSIFastUltra=(edtValue)*0.00035;


        SCSIFastWide=(edtValue)*0.00035;

        SCSIFastUltraWide=(edtValue)*0.000175;

        SCSIUltra2=(edtValue)*0.0000875;

        SCSIUltra3=(edtValue)*0.00004375;

        SCSILVDUltra80=(edtValue)*0.0000875;


        SCSILVDUltra160=(edtValue)*0.00004375;

        IDEPIOmode0=(edtValue)*0.0021212121;

        IDEPIOmode1=(edtValue)*0.0013461538;

        IDEPIOmode2=(edtValue)*0.0008433735;

        IDEPIOmode3=(edtValue)*0.0006306306;

        IDEPIOmode4=(edtValue)*0.0004216867;

        IDEDMAmode0=(edtValue)*0.0016666667;

        IDEDMAmode1=(edtValue)*0.0005263158;

        IDEDMAmode2=(edtValue)*0.0004216867;

        IDEUDMAmode0=(edtValue)*0.0004216867;

        IDEUDMAmode1=(edtValue)*0.00028;

        IDEUDMAmode2=(edtValue)*0.0002121212;

        IDEUDMAmode3=(edtValue)*0.00014;

        IDEUDMAmode4=(edtValue)*0.0001060606;

        IDEUDMA33=(edtValue)*0.0002121212;

        IDEUDMA66=(edtValue)*0.0001060606;

        USB=(edtValue)*0.0046666667;

        firewire=(edtValue)*0.00014;

        T0payload=(edtValue)*1;

        T0B8ZSpayload=(edtValue)*0.875;

        T1signal=(edtValue)*0.0362694301;

        T1payload=(edtValue)*0.0416666667;

        T1Zpayload=(edtValue)*0.0362694301;

        T1Csignal=(edtValue)*0.0177664975;

        T1Cpayload=(edtValue)*0.0208333333;

        T2signal=(edtValue)*0.0088719899;

        T3signal=(edtValue)*0.0012517883;

        T3payload=(edtValue)*0.0014880952;

        T3Zpayload=(edtValue)*0.0013020833;

        T4signal=(edtValue)*0.0002042484;

        EPTA1signal=(edtValue)*0.02734375;

        EPTA1payload=(edtValue)*0.0291666667;

        EPTA2signal=(edtValue)*0.0066287879;

        EPTA2payload=(edtValue)*0.0072916667;

        EPTA3signal=(edtValue)*0.0016294227;

        EPTA3payload=(edtValue)*0.0018229167;

        H0=(edtValue)*0.1458333333;

        H11=(edtValue)*0.0364583333;

        H12=(edtValue)*0.0291666667;

        VirtualTributary1signal=(edtValue)*0.0324074074;

        VirtualTributary1payload=(edtValue)*0.0362694301;

        VirtualTributary2signal=(edtValue)*0.0243055556;

        VirtualTributary2payload=(edtValue)*0.02734375;

        VirtualTributary6signal=(edtValue)*0.0088719899;

        VirtualTributary6payload=(edtValue)*0.0093333333;

        STS1signal=(edtValue)*0.0010802469;

        STS1payload=(edtValue)*0.0011313131;

        STS3signal=(edtValue)*0.0003600823;

        STS3payload=(edtValue)*0.0003724989;

        STS3csignal=(edtValue)*0.0003600823;

        STS3cpayload=(edtValue)*0.0003724989;

        STS12signal=(edtValue)*0.0000900206;

        STS24signal=(edtValue)*0.0000450103;

        STS48signal=(edtValue)*0.0000225051;

        STS192signal=(edtValue)*0.0000056263;

        STM1signal=(edtValue)*0.0003600823;

        STM4signal=(edtValue)*0.0000900206;

        STM16signal=(edtValue)*0.0000225051;

        STM64signal=(edtValue)*0.0000056263;

    }

    private void FirewireIEEE1394() {

        bitpersecond=(edtValue)*400000000;

        bytepersecond=(edtValue)*50000000;

        kilobitpersecondSI=(edtValue)*400000;

        kilobytepersecondSI=(edtValue)*50000;

        kilobitpersecond=(edtValue)*390625;

        kilobytepersecond=(edtValue)*48828.125;

        megabitpersecondSI=(edtValue)*400;

        megabytepersecondSI=(edtValue)*50;

        megabitpersecond=(edtValue)*381.46972656;

        megabytepersecond=(edtValue)*47.68371582;

        gigabitpersecondSI=(edtValue)*0.4;

        gigabytepersecondSI=(edtValue)*0.05;

        gigabitpersecond=(edtValue)*0.3725290298;

        gigabytepersecond=(edtValue)*0.0465661287;

        terabitpersecondSI=(edtValue)*0.0004;

        terabytepersecondSI=(edtValue)*0.00005;

        terabitpersecond=(edtValue)*0.0003637979;

        terabytepersecond=(edtValue)*0.0000454747;

        ethernet=(edtValue)*40;

        ethernetfast=(edtValue)*4;

        ethernetgigabit=(edtValue)*0.4;

        OC1=(edtValue)*7.7160493827;

        OC3=(edtValue)*2.5720164609;

        OC12=(edtValue)*0.6430041152;

        OC24=(edtValue)*0.3215020576;

        OC48=(edtValue)*0.1607510288;

        OC192=(edtValue)*0.0401877572;

        OC768=(edtValue)*0.0100469393;

        ISDNsinglechannel=(edtValue)*6250;

        ISDNdualchannel=(edtValue)*3125;

        modem110=(edtValue)*3636363.6364;

        modem300=(edtValue)*1333333.3333;

        modem1200=(edtValue)*333333.33333;

        modem2400=(edtValue)*166666.66667;

        modem9600=(edtValue)*41666.666667;

        modem14k=(edtValue)*27777.777778;

        modem28k=(edtValue)*13888.888889;

        modem33k=(edtValue)*11904.761905;

        modem56k=(edtValue)*7142.8571429;

        SCSIAsync=(edtValue)*33.333333333;

        SCSISync=(edtValue)*10;

        SCSIFast=(edtValue)*5;

        SCSIFastUltra=(edtValue)*2.5;


        SCSIFastWide=(edtValue)*2.5;

        SCSIFastUltraWide=(edtValue)*1.25;

        SCSIUltra2=(edtValue)*0.625;

        SCSIUltra3=(edtValue)*0.3125;

        SCSILVDUltra80=(edtValue)*0.625;


        SCSILVDUltra160=(edtValue)*0.3125;

        IDEPIOmode0=(edtValue)*15.151515152;

        IDEPIOmode1=(edtValue)*9.6153846154;

        IDEPIOmode2=(edtValue)*6.0240963855;

        IDEPIOmode3=(edtValue)*4.5045045045;

        IDEPIOmode4=(edtValue)*3.0120481928;

        IDEDMAmode0=(edtValue)*11.904761905;

        IDEDMAmode1=(edtValue)*3.7593984962;

        IDEDMAmode2=(edtValue)*3.0120481928;

        IDEUDMAmode0=(edtValue)*3.0120481928;

        IDEUDMAmode1=(edtValue)*2;

        IDEUDMAmode2=(edtValue)*1.5151515152;

        IDEUDMAmode3=(edtValue)*1;

        IDEUDMAmode4=(edtValue)*0.7575757576;

        IDEUDMA33=(edtValue)*1.5151515152;

        IDEUDMA66=(edtValue)*0.7575757576;

        USB=(edtValue)*33.333333333;

        firewire=(edtValue)*1;

        T0payload=(edtValue)*7142.8571429;

        T0B8ZSpayload=(edtValue)*6250;

        T1signal=(edtValue)*259.06735751;

        T1payload=(edtValue)*297.61904762;

        T1Zpayload=(edtValue)*259.06735751;

        T1Csignal=(edtValue)*126.9035533;

        T1Cpayload=(edtValue)*148.80952381;

        T2signal=(edtValue)*63.371356147;

        T3signal=(edtValue)*8.9413447783;

        T3payload=(edtValue)*10.629251701;

        T3Zpayload=(edtValue)*9.3005952381;

        T4signal=(edtValue)*1.4589169001;

        EPTA1signal=(edtValue)*195.3125;

        EPTA1payload=(edtValue)*208.33333333;

        EPTA2signal=(edtValue)*47.348484848;

        EPTA2payload=(edtValue)*52.083333333;

        EPTA3signal=(edtValue)*11.638733706;

        EPTA3payload=(edtValue)*13.020833333;

        H0=(edtValue)*1041.6666667;

        H11=(edtValue)*260.41666667;

        H12=(edtValue)*208.33333333;

        VirtualTributary1signal=(edtValue)*231.48148148;

        VirtualTributary1payload=(edtValue)*259.06735751;

        VirtualTributary2signal=(edtValue)*173.61111111;

        VirtualTributary2payload=(edtValue)*195.3125;

        VirtualTributary6signal=(edtValue)*63.371356147;

        VirtualTributary6payload=(edtValue)*66.666666667;

        STS1signal=(edtValue)*7.7160493827;

        STS1payload=(edtValue)*8.0808080808;

        STS3signal=(edtValue)*2.5720164609;

        STS3payload=(edtValue)*2.6607066837;

        STS3csignal=(edtValue)*2.5720164609;

        STS3cpayload=(edtValue)*2.6607066837;

        STS12signal=(edtValue)*0.6430041152;

        STS24signal=(edtValue)*0.3215020576;

        STS48signal=(edtValue)*0.1607510288;

        STS192signal=(edtValue)*0.0401877572;

        STM1signal=(edtValue)*2.5720164609;

        STM4signal=(edtValue)*0.6430041152;

        STM16signal=(edtValue)*0.1607510288;

        STM64signal=(edtValue)*0.0401877572;
    }

    private void USB() {
        bitpersecond=(edtValue)*12000000;

        bytepersecond=(edtValue)*1500000;

        kilobitpersecondSI=(edtValue)*12000;

        kilobytepersecondSI=(edtValue)*1500;

        kilobitpersecond=(edtValue)*11718.75;

        kilobytepersecond=(edtValue)*1464.84375;

        megabitpersecondSI=(edtValue)*12;

        megabytepersecondSI=(edtValue)*1.5;

        megabitpersecond=(edtValue)*11.444091797;

        megabytepersecond=(edtValue)*1.4305114746;

        gigabitpersecondSI=(edtValue)*0.012;

        gigabytepersecondSI=(edtValue)*0.0015;

        gigabitpersecond=(edtValue)*0.0111758709;

        gigabytepersecond=(edtValue)*0.0013969839;

        terabitpersecondSI=(edtValue)*0.000012;

        terabytepersecondSI=(edtValue)*0.0000015;

        terabitpersecond=(edtValue)*0.0000109139;

        terabytepersecond=(edtValue)*0.0000013642;

        ethernet=(edtValue)*1.2;

        ethernetfast=(edtValue)*0.12;

        ethernetgigabit=(edtValue)*0.012;

        OC1=(edtValue)*0.2314814815;

        OC3=(edtValue)*0.0771604938;

        OC12=(edtValue)*0.0192901235;

        OC24=(edtValue)*0.0096450617;

        OC48=(edtValue)*0.0048225309;

        OC192=(edtValue)*0.0012056327;

        OC768=(edtValue)*0.0003014082;

        ISDNsinglechannel=(edtValue)*187.5;

        ISDNdualchannel=(edtValue)*93.75;

        modem110=(edtValue)*109090.90909;

        modem300=(edtValue)*40000;

        modem1200=(edtValue)*10000;

        modem2400=(edtValue)*5000;

        modem9600=(edtValue)*1250;

        modem14k=(edtValue)*833.33333333;

        modem28k=(edtValue)*416.66666667;

        modem33k=(edtValue)*357.14285714;

        modem56k=(edtValue)*214.28571429;

        SCSIAsync=(edtValue)*1;

        SCSISync=(edtValue)*0.3;

        SCSIFast=(edtValue)*0.15;

        SCSIFastUltra=(edtValue)*0.075;


        SCSIFastWide=(edtValue)*0.075;

        SCSIFastUltraWide=(edtValue)*0.0375;

        SCSIUltra2=(edtValue)*0.01875;

        SCSIUltra3=(edtValue)*0.009375;

        SCSILVDUltra80=(edtValue)*0.01875;


        SCSILVDUltra160=(edtValue)*0.009375;

        IDEPIOmode0=(edtValue)*0.4545454545;

        IDEPIOmode1=(edtValue)*0.2884615385;

        IDEPIOmode2=(edtValue)*0.1807228916;

        IDEPIOmode3=(edtValue)*0.1351351351;

        IDEPIOmode4=(edtValue)*0.0903614458;

        IDEDMAmode0=(edtValue)*0.3571428571;

        IDEDMAmode1=(edtValue)*0.1127819549;

        IDEDMAmode2=(edtValue)*0.0903614458;

        IDEUDMAmode0=(edtValue)*0.0903614458;

        IDEUDMAmode1=(edtValue)*0.06;

        IDEUDMAmode2=(edtValue)*0.0454545455;

        IDEUDMAmode3=(edtValue)*0.03;

        IDEUDMAmode4=(edtValue)*0.0227272727;

        IDEUDMA33=(edtValue)*0.0454545455;

        IDEUDMA66=(edtValue)*0.0227272727;

        USB=(edtValue)*1;

        firewire=(edtValue)*0.03;

        T0payload=(edtValue)*214.28571429;

        T0B8ZSpayload=(edtValue)*187.5;

        T1signal=(edtValue)*7.7720207254;

        T1payload=(edtValue)*8.9285714286;

        T1Zpayload=(edtValue)*7.7720207254;

        T1Csignal=(edtValue)*3.807106599;

        T1Cpayload=(edtValue)*4.4642857143;

        T2signal=(edtValue)*1.9011406844;

        T3signal=(edtValue)*0.2682403433;

        T3payload=(edtValue)*0.318877551;

        T3Zpayload=(edtValue)*0.2790178571;

        T4signal=(edtValue)*0.043767507;

        EPTA1signal=(edtValue)*5.859375;

        EPTA1payload=(edtValue)*6.25;

        EPTA2signal=(edtValue)*1.4204545455;

        EPTA2payload=(edtValue)*1.5625;

        EPTA3signal=(edtValue)*0.3491620112;

        EPTA3payload=(edtValue)*0.390625;

        H0=(edtValue)*31.25;

        H11=(edtValue)*7.8125;

        H12=(edtValue)*6.25;

        VirtualTributary1signal=(edtValue)*6.9444444444;

        VirtualTributary1payload=(edtValue)*7.7720207254;

        VirtualTributary2signal=(edtValue)*5.2083333333;

        VirtualTributary2payload=(edtValue)*5.859375;

        VirtualTributary6signal=(edtValue)*1.9011406844;

        VirtualTributary6payload=(edtValue)*2;

        STS1signal=(edtValue)*0.2314814815;

        STS1payload=(edtValue)*0.2424242424;

        STS3signal=(edtValue)*0.0771604938;

        STS3payload=(edtValue)*0.0798212005;

        STS3csignal=(edtValue)*0.0771604938;

        STS3cpayload=(edtValue)*0.0798212005;

        STS12signal=(edtValue)*0.0192901235;

        STS24signal=(edtValue)*0.0096450617;

        STS48signal=(edtValue)*0.0048225309;

        STS192signal=(edtValue)*0.0012056327;

        STM1signal=(edtValue)*0.0771604938;

        STM4signal=(edtValue)*0.0192901235;

        STM16signal=(edtValue)*0.0048225309;

        STM64signal=(edtValue)*0.0012056327;
    }


    private void IDEUDMA66() {
        bitpersecond=(edtValue)*528000000;

        bytepersecond=(edtValue)*66000000;

        kilobitpersecondSI=(edtValue)*528000;

        kilobytepersecondSI=(edtValue)*66000;

        kilobitpersecond=(edtValue)*515625;

        kilobytepersecond=(edtValue)*64453.125;

        megabitpersecondSI=(edtValue)*528;

        megabytepersecondSI=(edtValue)*66;

        megabitpersecond=(edtValue)*503.54003906;

        megabytepersecond=(edtValue)*62.942504883;

        gigabitpersecondSI=(edtValue)*0.528;

        gigabytepersecondSI=(edtValue)*0.066;

        gigabitpersecond=(edtValue)*0.4917383194;

        gigabytepersecond=(edtValue)*0.0614672899;

        terabitpersecondSI=(edtValue)*0.000528;

        terabytepersecondSI=(edtValue)*0.000066;

        terabitpersecond=(edtValue)*0.0004802132;

        terabytepersecond=(edtValue)*0.0000600267;

        ethernet=(edtValue)*52.8;

        ethernetfast=(edtValue)*5.28;

        ethernetgigabit=(edtValue)*0.528;

        OC1=(edtValue)*10.185185185;

        OC3=(edtValue)*3.3950617284;

        OC12=(edtValue)*0.8487654321;

        OC24=(edtValue)*0.424382716;

        OC48=(edtValue)*0.212191358;

        OC192=(edtValue)*0.0530478395;

        OC768=(edtValue)*0.0132619599;

        ISDNsinglechannel=(edtValue)*8250;

        ISDNdualchannel=(edtValue)*4125;

        modem110=(edtValue)*4800000;

        modem300=(edtValue)*1760000;

        modem1200=(edtValue)*440000;

        modem2400=(edtValue)*220000;

        modem9600=(edtValue)*55000;

        modem14k=(edtValue)*36666.666667;

        modem28k=(edtValue)*18333.333333;

        modem33k=(edtValue)*15714.285714;

        modem56k=(edtValue)*9428.5714286;

        SCSIAsync=(edtValue)*44;

        SCSISync=(edtValue)*13.2;

        SCSIFast=(edtValue)*6.6;

        SCSIFastUltra=(edtValue)*3.3;


        SCSIFastWide=(edtValue)*3.3;

        SCSIFastUltraWide=(edtValue)*1.65;

        SCSIUltra2=(edtValue)*0.825;

        SCSIUltra3=(edtValue)*0.4125;

        SCSILVDUltra80=(edtValue)*0.825;


        SCSILVDUltra160=(edtValue)*0.4125;

        IDEPIOmode0=(edtValue)*20;

        IDEPIOmode1=(edtValue)*12.692307692;

        IDEPIOmode2=(edtValue)*7.9518072289;

        IDEPIOmode3=(edtValue)*5.9459459459;

        IDEPIOmode4=(edtValue)*3.9759036145;

        IDEDMAmode0=(edtValue)*15.714285714;

        IDEDMAmode1=(edtValue)*4.962406015;

        IDEDMAmode2=(edtValue)*3.9759036145;

        IDEUDMAmode0=(edtValue)*3.9759036145;

        IDEUDMAmode1=(edtValue)*2.64;

        IDEUDMAmode2=(edtValue)*2;

        IDEUDMAmode3=(edtValue)*1.32;

        IDEUDMAmode4=(edtValue)*1;

        IDEUDMA33=(edtValue)*2;

        IDEUDMA66=(edtValue)*1;

        USB=(edtValue)*44;

        firewire=(edtValue)*1.32;

        T0payload=(edtValue)*9428.5714286;

        T0B8ZSpayload=(edtValue)*8250;

        T1signal=(edtValue)*341.96891192;

        T1payload=(edtValue)*392.85714286;

        T1Zpayload=(edtValue)*341.96891192;

        T1Csignal=(edtValue)*167.51269036;

        T1Cpayload=(edtValue)*196.42857143;

        T2signal=(edtValue)*83.650190114;

        T3signal=(edtValue)*11.802575107;

        T3payload=(edtValue)*14.030612245;

        T3Zpayload=(edtValue)*12.276785714;

        T4signal=(edtValue)*1.9257703081;

        EPTA1signal=(edtValue)*257.8125;

        EPTA1payload=(edtValue)*275;

        EPTA2signal=(edtValue)*62.5;

        EPTA2payload=(edtValue)*68.75;

        EPTA3signal=(edtValue)*15.363128492;

        EPTA3payload=(edtValue)*17.1875;

        H0=(edtValue)*1375;

        H11=(edtValue)*343.75;

        H12=(edtValue)*275;

        VirtualTributary1signal=(edtValue)*305.55555556;

        VirtualTributary1payload=(edtValue)*341.96891192;

        VirtualTributary2signal=(edtValue)*229.16666667;

        VirtualTributary2payload=(edtValue)*257.8125;

        VirtualTributary6signal=(edtValue)*83.650190114;

        VirtualTributary6payload=(edtValue)*88;

        STS1signal=(edtValue)*10.185185185;

        STS1payload=(edtValue)*10.666666667;

        STS3signal=(edtValue)*3.3950617284;

        STS3payload=(edtValue)*3.5121328225;

        STS3csignal=(edtValue)*3.3950617284;

        STS3cpayload=(edtValue)*3.5121328225;

        STS12signal=(edtValue)*0.8487654321;

        STS24signal=(edtValue)*0.424382716;

        STS48signal=(edtValue)*0.212191358;

        STS192signal=(edtValue)*0.0530478395;

        STM1signal=(edtValue)*3.3950617284;

        STM4signal=(edtValue)*0.8487654321;

        STM16signal=(edtValue)*0.212191358;

        STM64signal=(edtValue)*0.0530478395;
    }

    private void IDEUDMA33() {
        bitpersecond=(edtValue)*264000000;

        bytepersecond=(edtValue)*33000000;

        kilobitpersecondSI=(edtValue)*264000;

        kilobytepersecondSI=(edtValue)*33000;

        kilobitpersecond=(edtValue)*257812.5;

        kilobytepersecond=(edtValue)*32226.5625;

        megabitpersecondSI=(edtValue)*264;

        megabytepersecondSI=(edtValue)*33;

        megabitpersecond=(edtValue)*251.77001953;

        megabytepersecond=(edtValue)*31.471252441;

        gigabitpersecondSI=(edtValue)*0.264;

        gigabytepersecondSI=(edtValue)*0.033;

        gigabitpersecond=(edtValue)*0.2458691597;

        gigabytepersecond=(edtValue)*0.030733645;

        terabitpersecondSI=(edtValue)*0.000264;

        terabytepersecondSI=(edtValue)*0.000033;

        terabitpersecond=(edtValue)*0.0002401066;

        terabytepersecond=(edtValue)*0.0000300133;

        ethernet=(edtValue)*26.4;

        ethernetfast=(edtValue)*2.64;

        ethernetgigabit=(edtValue)*0.264;

        OC1=(edtValue)*5.0925925926;

        OC3=(edtValue)*1.6975308642;

        OC12=(edtValue)*0.424382716;

        OC24=(edtValue)*0.212191358;

        OC48=(edtValue)*0.106095679;

        OC192=(edtValue)*0.106095679;

        OC768=(edtValue)*0.0066309799;

        ISDNsinglechannel=(edtValue)*4125;

        ISDNdualchannel=(edtValue)*2062.5;

        modem110=(edtValue)*2400000;

        modem300=(edtValue)*880000;

        modem1200=(edtValue)*220000;

        modem2400=(edtValue)*110000;

        modem9600=(edtValue)*27500;

        modem14k=(edtValue)*18333.333333;

        modem28k=(edtValue)*9166.6666667;

        modem33k=(edtValue)*7857.1428571;

        modem56k=(edtValue)*4714.2857143;

        SCSIAsync=(edtValue)*22;

        SCSISync=(edtValue)*6.6;

        SCSIFast=(edtValue)*3.3;

        SCSIFastUltra=(edtValue)*1.65;


        SCSIFastWide=(edtValue)*1.65;

        SCSIFastUltraWide=(edtValue)*0.825;

        SCSIUltra2=(edtValue)*0.4125;

        SCSIUltra3=(edtValue)*0.20625;

        SCSILVDUltra80=(edtValue)*0.4125;


        SCSILVDUltra160=(edtValue)*0.20625;

        IDEPIOmode0=(edtValue)*10;

        IDEPIOmode1=(edtValue)*6.3461538462;

        IDEPIOmode2=(edtValue)*3.9759036145;

        IDEPIOmode3=(edtValue)*2.972972973;

        IDEPIOmode4=(edtValue)*1.9879518072;

        IDEDMAmode0=(edtValue)*7.8571428571;

        IDEDMAmode1=(edtValue)*2.4812030075;

        IDEDMAmode2=(edtValue)*1.9879518072;

        IDEUDMAmode0=(edtValue)*1.9879518072;

        IDEUDMAmode1=(edtValue)*1.32;

        IDEUDMAmode2=(edtValue)*1;

        IDEUDMAmode3=(edtValue)*0.66;

        IDEUDMAmode4=(edtValue)*0.5;

        IDEUDMA33=(edtValue)*1;

        IDEUDMA66=(edtValue)*0.5;

        USB=(edtValue)*22;

        firewire=(edtValue)*0.66;

        T0payload=(edtValue)*4714.2857143;

        T0B8ZSpayload=(edtValue)*4125;

        T1signal=(edtValue)*170.98445596;

        T1payload=(edtValue)*196.42857143;

        T1Zpayload=(edtValue)*170.98445596;

        T1Csignal=(edtValue)*83.756345178;

        T1Cpayload=(edtValue)*98.214285714;

        T2signal=(edtValue)*41.825095057;

        T3signal=(edtValue)*5.9012875536;

        T3payload=(edtValue)*7.0153061224;

        T3Zpayload=(edtValue)*6.1383928571;

        T4signal=(edtValue)*0.9628851541;

        EPTA1signal=(edtValue)*128.90625;

        EPTA1payload=(edtValue)*137.5;

        EPTA2signal=(edtValue)*31.25;

        EPTA2payload=(edtValue)*34.375;

        EPTA3signal=(edtValue)*7.6815642458;

        EPTA3payload=(edtValue)*8.59375;

        H0=(edtValue)*687.5;

        H11=(edtValue)*171.875;

        H12=(edtValue)*137.5;

        VirtualTributary1signal=(edtValue)*152.77777778;

        VirtualTributary1payload=(edtValue)*170.98445596;

        VirtualTributary2signal=(edtValue)*114.58333333;

        VirtualTributary2payload=(edtValue)*128.90625;

        VirtualTributary6signal=(edtValue)*41.825095057;

        VirtualTributary6payload=(edtValue)*44;

        STS1signal=(edtValue)*5.0925925926;

        STS1payload=(edtValue)*5.3333333333;

        STS3signal=(edtValue)*1.6975308642;

        STS3payload=(edtValue)*1.7560664112;

        STS3csignal=(edtValue)*1.6975308642;

        STS3cpayload=(edtValue)*1.7560664112;

        STS12signal=(edtValue)*0.424382716;

        STS24signal=(edtValue)*0.212191358;

        STS48signal=(edtValue)*0.106095679;

        STS192signal=(edtValue)*0.0265239198;

        STM1signal=(edtValue)*1.6975308642;

        STM4signal=(edtValue)*0.424382716;

        STM16signal=(edtValue)*0.106095679;

        STM64signal=(edtValue)*0.0265239198;

    }

    private void IDEUDMAmode4() {
        bitpersecond=(edtValue)*528000000.0;

        bytepersecond=(edtValue)*66000000;

        kilobitpersecondSI=(edtValue)*528000;

        kilobytepersecondSI=(edtValue)*66000;

        kilobitpersecond=(edtValue)*515625;

        kilobytepersecond=(edtValue)*64453.125;

        megabitpersecondSI=(edtValue)*528;

        megabytepersecondSI=(edtValue)*66;

        megabitpersecond=(edtValue)*503.54003906;

        megabytepersecond=(edtValue)*62.942504883;

        gigabitpersecondSI=(edtValue)*0.528;

        gigabytepersecondSI=(edtValue)*0.066;

        gigabitpersecond=(edtValue)*0.4917383194;

        gigabytepersecond=(edtValue)*0.0614672899;

        terabitpersecondSI=(edtValue)*0.000528;

        terabytepersecondSI=(edtValue)*0.000066;

        terabitpersecond=(edtValue)*0.0004802132;

        terabytepersecond=(edtValue)*0.0000600267;

        ethernet=(edtValue)*52.8;

        ethernetfast=(edtValue)*5.28;

        ethernetgigabit=(edtValue)*0.528;

        OC1=(edtValue)*10.185185185;

        OC3=(edtValue)*3.3950617284;

        OC12=(edtValue)*0.8487654321;

        OC24=(edtValue)*0.424382716;

        OC48=(edtValue)*0.212191358;

        OC192=(edtValue)*0.0530478395;

        OC768=(edtValue)*0.0132619599;

        ISDNsinglechannel=(edtValue)*8250;

        ISDNdualchannel=(edtValue)*4125;

        modem110=(edtValue)*4800000;

        modem300=(edtValue)*1760000;

        modem1200=(edtValue)*440000;

        modem2400=(edtValue)*220000;

        modem9600=(edtValue)*55000;

        modem14k=(edtValue)*36666.666667;

        modem28k=(edtValue)*18333.333333;

        modem33k=(edtValue)*15714.285714;

        modem56k=(edtValue)*9428.5714286;

        SCSIAsync=(edtValue)*44;

        SCSISync=(edtValue)*44;

        SCSIFast=(edtValue)*6.6;

        SCSIFastUltra=(edtValue)*3.3;


        SCSIFastWide=(edtValue)*3.3;

        SCSIFastUltraWide=(edtValue)*1.65;

        SCSIUltra2=(edtValue)*0.825;

        SCSIUltra3=(edtValue)*0.4125;

        SCSILVDUltra80=(edtValue)*0.825;


        SCSILVDUltra160=(edtValue)*0.4125;

        IDEPIOmode0=(edtValue)*20;

        IDEPIOmode1=(edtValue)*12.692307692;

        IDEPIOmode2=(edtValue)*7.9518072289;

        IDEPIOmode3=(edtValue)*5.9459459459;

        IDEPIOmode4=(edtValue)*3.9759036145;

        IDEDMAmode0=(edtValue)*15.714285714;

        IDEDMAmode1=(edtValue)*4.962406015;

        IDEDMAmode2=(edtValue)*3.9759036145;

        IDEUDMAmode0=(edtValue)*3.9759036145;

        IDEUDMAmode1=(edtValue)*2.64;

        IDEUDMAmode2=(edtValue)*2;

        IDEUDMAmode3=(edtValue)*1.32;

        IDEUDMAmode4=(edtValue)*1;

        IDEUDMA33=(edtValue)*2;

        IDEUDMA66=(edtValue)*1;

        USB=(edtValue)*44;

        firewire=(edtValue)*1.32;

        T0payload=(edtValue)*9428.5714286;

        T0B8ZSpayload=(edtValue)*8250;

        T1signal=(edtValue)*341.96891192;

        T1payload=(edtValue)*392.85714286;

        T1Zpayload=(edtValue)*341.96891192;

        T1Csignal=(edtValue)*167.51269036;

        T1Cpayload=(edtValue)*196.42857143;

        T2signal=(edtValue)*83.650190114;

        T3signal=(edtValue)*11.802575107;

        T3payload=(edtValue)*14.030612245;

        T3Zpayload=(edtValue)*12.276785714;

        T4signal=(edtValue)*1.9257703081;

        EPTA1signal=(edtValue)*257.8125;

        EPTA1payload=(edtValue)*275;

        EPTA2signal=(edtValue)*62.5;

        EPTA2payload=(edtValue)*68.75;

        EPTA3signal=(edtValue)*15.363128492;

        EPTA3payload=(edtValue)*17.1875;

        H0=(edtValue)*1375;

        H11=(edtValue)*343.75;

        H12=(edtValue)*275;

        VirtualTributary1signal=(edtValue)*305.55555556;

        VirtualTributary1payload=(edtValue)*341.96891192;

        VirtualTributary2signal=(edtValue)*229.16666667;

        VirtualTributary2payload=(edtValue)*257.8125;

        VirtualTributary6signal=(edtValue)*83.650190114;

        VirtualTributary6payload=(edtValue)*88;

        STS1signal=(edtValue)*10.185185185;

        STS1payload=(edtValue)*10.666666667;

        STS3signal=(edtValue)*3.3950617284;

        STS3payload=(edtValue)*3.5121328225;

        STS3csignal=(edtValue)*3.3950617284;

        STS3cpayload=(edtValue)*3.5121328225;

        STS12signal=(edtValue)*0.8487654321;

        STS24signal=(edtValue)*0.424382716;

        STS48signal=(edtValue)*0.212191358;

        STS192signal=(edtValue)*0.0530478395;

        STM1signal=(edtValue)*3.3950617284;

        STM4signal=(edtValue)*0.8487654321;

        STM16signal=(edtValue)*0.212191358;

        STM64signal=(edtValue)*0.0530478395;

    }


    private void IDEUDMAmode3() {

        bitpersecond=(edtValue)*400000000.0;

        bytepersecond=(edtValue)*50000000.0;

        kilobitpersecondSI=(edtValue)*400000;

        kilobytepersecondSI=(edtValue)*50000;

        kilobitpersecond=(edtValue)*390625;

        kilobytepersecond=(edtValue)*48828.125;

        megabitpersecondSI=(edtValue)*400;

        megabytepersecondSI=(edtValue)*50;

        megabitpersecond=(edtValue)*381.46972656;

        megabytepersecond=(edtValue)*47.68371582;

        gigabitpersecondSI=(edtValue)*0.4;

        gigabytepersecondSI=(edtValue)*0.05;

        gigabitpersecond=(edtValue)*0.3725290298;

        gigabytepersecond=(edtValue)*0.0465661287;

        terabitpersecondSI=(edtValue)*0.0004;

        terabytepersecondSI=(edtValue)*0.00005;

        terabitpersecond=(edtValue)*0.0003637979;

        terabytepersecond=(edtValue)*0.0000454747;

        ethernet=(edtValue)*40;

        ethernetfast=(edtValue)*4;

        ethernetgigabit=(edtValue)*0.4;

        OC1=(edtValue)*7.7160493827;

        OC3=(edtValue)*2.5720164609;

        OC12=(edtValue)*0.6430041152;

        OC24=(edtValue)*0.3215020576;

        OC48=(edtValue)*0.1607510288;

        OC192=(edtValue)*0.0401877572;

        OC768=(edtValue)*0.0100469393;

        ISDNsinglechannel=(edtValue)*6250;

        ISDNdualchannel=(edtValue)*3125;

        modem110=(edtValue)*3636363.6364;

        modem300=(edtValue)*1333333.3333;

        modem1200=(edtValue)*333333.33333;

        modem2400=(edtValue)*166666.66667;

        modem9600=(edtValue)*41666.666667;

        modem14k=(edtValue)*27777.777778;

        modem28k=(edtValue)*13888.888889;

        modem33k=(edtValue)*11904.761905;

        modem56k=(edtValue)*7142.8571429;

        SCSIAsync=(edtValue)*33.333333333;

        SCSISync=(edtValue)*10;

        SCSIFast=(edtValue)*5;

        SCSIFastUltra=(edtValue)*2.5;


        SCSIFastWide=(edtValue)*2.5;

        SCSIFastUltraWide=(edtValue)*1.25;

        SCSIUltra2=(edtValue)*0.625;

        SCSIUltra3=(edtValue)*0.3125;

        SCSILVDUltra80=(edtValue)*0.625;


        SCSILVDUltra160=(edtValue)*0.3125;

        IDEPIOmode0=(edtValue)*15.151515152;

        IDEPIOmode1=(edtValue)*9.6153846154;

        IDEPIOmode2=(edtValue)*6.0240963855;

        IDEPIOmode3=(edtValue)*4.5045045045;

        IDEPIOmode4=(edtValue)*3.0120481928;

        IDEDMAmode0=(edtValue)*11.904761905;

        IDEDMAmode1=(edtValue)*3.7593984962;

        IDEDMAmode2=(edtValue)*3.0120481928;

        IDEUDMAmode0=(edtValue)*3.0120481928;

        IDEUDMAmode1=(edtValue)*2;

        IDEUDMAmode2=(edtValue)*1.5151515152;

        IDEUDMAmode3=(edtValue)*1;

        IDEUDMAmode4=(edtValue)*0.7575757576;

        IDEUDMA33=(edtValue)*1.5151515152;

        IDEUDMA66=(edtValue)*0.7575757576;

        USB=(edtValue)*33.333333333;

        firewire=(edtValue)*1;

        T0payload=(edtValue)*7142.8571429;

        T0B8ZSpayload=(edtValue)*6250;

        T1signal=(edtValue)*259.06735751;

        T1payload=(edtValue)*297.61904762;

        T1Zpayload=(edtValue)*259.06735751;

        T1Csignal=(edtValue)*126.9035533;

        T1Cpayload=(edtValue)*148.80952381;

        T2signal=(edtValue)*63.371356147;

        T3signal=(edtValue)*8.9413447783;

        T3payload=(edtValue)*10.629251701;

        T3Zpayload=(edtValue)*9.3005952381;

        T4signal=(edtValue)*1.4589169001;

        EPTA1signal=(edtValue)*195.3125;

        EPTA1payload=(edtValue)*208.33333333;

        EPTA2signal=(edtValue)*47.348484848;

        EPTA2payload=(edtValue)*52.083333333;

        EPTA3signal=(edtValue)*11.638733706;

        EPTA3payload=(edtValue)*13.020833333;

        H0=(edtValue)*13.020833333;

        H11=(edtValue)*260.41666667;

        H12=(edtValue)*208.33333333;

        VirtualTributary1signal=(edtValue)*231.48148148;

        VirtualTributary1payload=(edtValue)*259.06735751;

        VirtualTributary2signal=(edtValue)*173.61111111;

        VirtualTributary2payload=(edtValue)*195.3125;

        VirtualTributary6signal=(edtValue)*63.371356147;

        VirtualTributary6payload=(edtValue)*66.666666667;

        STS1signal=(edtValue)*7.7160493827;

        STS1payload=(edtValue)*8.0808080808;

        STS3signal=(edtValue)*2.5720164609;

        STS3payload=(edtValue)*2.6607066837;

        STS3csignal=(edtValue)*2.5720164609;

        STS3cpayload=(edtValue)*2.6607066837;

        STS12signal=(edtValue)*0.6430041152;

        STS24signal=(edtValue)*0.3215020576;

        STS48signal=(edtValue)*0.1607510288;

        STS192signal=(edtValue)*0.0401877572;

        STM1signal=(edtValue)*2.5720164609;

        STM4signal=(edtValue)*0.6430041152;

        STM16signal=(edtValue)*0.1607510288;

        STM64signal=(edtValue)*0.0401877572;
    }


    private void IDEUDMAmode2() {
        bitpersecond=(edtValue)*264000000;

        bytepersecond=(edtValue)*33000000;

        kilobitpersecondSI=(edtValue)*264000;

        kilobytepersecondSI=(edtValue)*33000;

        kilobitpersecond=(edtValue)*257812.5;

        kilobytepersecond=(edtValue)*32226.5625;

        megabitpersecondSI=(edtValue)*264;

        megabytepersecondSI=(edtValue)*33;

        megabitpersecond=(edtValue)*251.77001953;

        megabytepersecond=(edtValue)*31.471252441;

        gigabitpersecondSI=(edtValue)*0.264;

        gigabytepersecondSI=(edtValue)*0.033;

        gigabitpersecond=(edtValue)*0.2458691597;

        gigabytepersecond=(edtValue)*0.030733645;

        terabitpersecondSI=(edtValue)*0.000264;

        terabytepersecondSI=(edtValue)*0.000033;

        terabitpersecond=(edtValue)*0.0002401066;

        terabytepersecond=(edtValue)*0.0000300133;

        ethernet=(edtValue)*26.4;

        ethernetfast=(edtValue)*2.64;

        ethernetgigabit=(edtValue)*0.264;

        OC1=(edtValue)*5.0925925926;

        OC3=(edtValue)*1.6975308642;

        OC12=(edtValue)*0.424382716;

        OC24=(edtValue)*0.212191358;

        OC48=(edtValue)*0.106095679;

        OC192=(edtValue)*0.0265239198;

        OC768=(edtValue)*0.0066309799;

        ISDNsinglechannel=(edtValue)*4125;

        ISDNdualchannel=(edtValue)*2062.5;

        modem110=(edtValue)*2400000;

        modem300=(edtValue)*880000;

        modem1200=(edtValue)*220000;

        modem2400=(edtValue)*110000;

        modem9600=(edtValue)*27500;

        modem14k=(edtValue)*18333.333333;

        modem28k=(edtValue)*9166.6666667;

        modem33k=(edtValue)*7857.1428571;

        modem56k=(edtValue)*4714.2857143;

        SCSIAsync=(edtValue)*22;

        SCSISync=(edtValue)*6.6;

        SCSIFast=(edtValue)*3.3;

        SCSIFastUltra=(edtValue)*1.65;


        SCSIFastWide=(edtValue)*1.65;

        SCSIFastUltraWide=(edtValue)*0.825;

        SCSIUltra2=(edtValue)*0.4125;

        SCSIUltra3=(edtValue)*0.20625;

        SCSILVDUltra80=(edtValue)*0.4125;


        SCSILVDUltra160=(edtValue)*0.20625;

        IDEPIOmode0=(edtValue)*10;

        IDEPIOmode1=(edtValue)*6.3461538462;

        IDEPIOmode2=(edtValue)*3.9759036145;

        IDEPIOmode3=(edtValue)*2.972972973;

        IDEPIOmode4=(edtValue)*1.9879518072;

        IDEDMAmode0=(edtValue)*7.8571428571;

        IDEDMAmode1=(edtValue)*2.4812030075;

        IDEDMAmode2=(edtValue)*1.9879518072;

        IDEUDMAmode0=(edtValue)*1.9879518072;

        IDEUDMAmode1=(edtValue)*1.32;

        IDEUDMAmode2=(edtValue)*1;

        IDEUDMAmode3=(edtValue)*0.66;

        IDEUDMAmode4=(edtValue)*0.5;

        IDEUDMA33=(edtValue)*1;

        IDEUDMA66=(edtValue)*0.5;

        USB=(edtValue)*22;

        firewire=(edtValue)*0.66;

        T0payload=(edtValue)*4714.2857143;

        T0B8ZSpayload=(edtValue)*4125;

        T1signal=(edtValue)*170.98445596;

        T1payload=(edtValue)*196.42857143;

        T1Zpayload=(edtValue)*170.98445596;

        T1Csignal=(edtValue)*83.756345178;

        T1Cpayload=(edtValue)*98.214285714;

        T2signal=(edtValue)*41.825095057;

        T3signal=(edtValue)*5.9012875536;

        T3payload=(edtValue)*7.0153061224;

        T3Zpayload=(edtValue)*6.1383928571;

        T4signal=(edtValue)*0.9628851541;

        EPTA1signal=(edtValue)*128.90625;

        EPTA1payload=(edtValue)*137.5;

        EPTA2signal=(edtValue)*31.25;

        EPTA2payload=(edtValue)*34.375;

        EPTA3signal=(edtValue)*7.6815642458;

        EPTA3payload=(edtValue)*8.59375;

        H0=(edtValue)*687.5;

        H11=(edtValue)*171.875;

        H12=(edtValue)*137.5;

        VirtualTributary1signal=(edtValue)*152.77777778;

        VirtualTributary1payload=(edtValue)*170.98445596;

        VirtualTributary2signal=(edtValue)*114.58333333;

        VirtualTributary2payload=(edtValue)*128.90625;

        VirtualTributary6signal=(edtValue)*41.825095057;

        VirtualTributary6payload=(edtValue)*44;

        STS1signal=(edtValue)*5.0925925926;

        STS1payload=(edtValue)*5.3333333333;

        STS3signal=(edtValue)*1.6975308642;

        STS3payload=(edtValue)*1.7560664112;

        STS3csignal=(edtValue)*1.6975308642;

        STS3cpayload=(edtValue)*1.7560664112;

        STS12signal=(edtValue)*0.424382716;

        STS24signal=(edtValue)*0.212191358;

        STS48signal=(edtValue)*0.106095679;

        STS192signal=(edtValue)*0.0265239198;

        STM1signal=(edtValue)*1.6975308642;

        STM4signal=(edtValue)*0.424382716;

        STM16signal=(edtValue)*0.106095679;

        STM64signal=(edtValue)*0.0265239198;

    }

    private void IDEUDMAmode1() {
        bitpersecond=(edtValue)*200000000;

        bytepersecond=(edtValue)*25000000;

        kilobitpersecondSI=(edtValue)*200000;

        kilobytepersecondSI=(edtValue)*25000;

        kilobitpersecond=(edtValue)*195312.5;

        kilobytepersecond=(edtValue)*24414.0625;

        megabitpersecondSI=(edtValue)*200;

        megabytepersecondSI=(edtValue)*25;

        megabitpersecond=(edtValue)*190.73486328;

        megabytepersecond=(edtValue)*23.84185791;

        gigabitpersecondSI=(edtValue)*0.2;

        gigabytepersecondSI=(edtValue)*0.025;

        gigabitpersecond=(edtValue)*0.1862645149;

        gigabytepersecond=(edtValue)*0.0232830644;

        terabitpersecondSI=(edtValue)*0.0002;

        terabytepersecondSI=(edtValue)*0.000025;

        terabitpersecond=(edtValue)*0.0001818989;

        terabytepersecond=(edtValue)*0.0000227374;

        ethernet=(edtValue)*20;

        ethernetfast=(edtValue)*2;

        ethernetgigabit=(edtValue)*0.2;

        OC1=(edtValue)*3.8580246914;

        OC3=(edtValue)*1.2860082305;

        OC12=(edtValue)*0.3215020576;

        OC24=(edtValue)*0.1607510288;

        OC48=(edtValue)*0.0803755144;

        OC192=(edtValue)*0.0200938786;

        OC768=(edtValue)*0.0050234697;

        ISDNsinglechannel=(edtValue)*3125;

        ISDNdualchannel=(edtValue)*1562.5;

        modem110=(edtValue)*1562.5;

        modem300=(edtValue)*666666.66667;

        modem1200=(edtValue)*166666.66667;

        modem2400=(edtValue)*83333.333333;

        modem9600=(edtValue)*20833.333333;

        modem14k=(edtValue)*13888.888889;

        modem28k=(edtValue)*6944.4444444;

        modem33k=(edtValue)*5952.3809524;

        modem56k=(edtValue)*3571.4285714;

        SCSIAsync=(edtValue)*16.666666667;

        SCSISync=(edtValue)*5;

        SCSIFast=(edtValue)*2.5;

        SCSIFastUltra=(edtValue)*1.25;


        SCSIFastWide=(edtValue)*1.25;

        SCSIFastUltraWide=(edtValue)*0.625;

        SCSIUltra2=(edtValue)*0.3125;

        SCSIUltra3=(edtValue)*0.15625;

        SCSILVDUltra80=(edtValue)*0.3125;


        SCSILVDUltra160=(edtValue)*0.15625;

        IDEPIOmode0=(edtValue)*7.5757575758;

        IDEPIOmode1=(edtValue)*4.8076923077;

        IDEPIOmode2=(edtValue)*3.0120481928;

        IDEPIOmode3=(edtValue)*2.2522522523;

        IDEPIOmode4=(edtValue)*1.5060240964;

        IDEDMAmode0=(edtValue)*5.9523809524;

        IDEDMAmode1=(edtValue)*1.8796992481;

        IDEDMAmode2=(edtValue)*1.5060240964;

        IDEUDMAmode0=(edtValue)*1.5060240964;

        IDEUDMAmode1=(edtValue)*1;

        IDEUDMAmode2=(edtValue)*0.7575757576;

        IDEUDMAmode3=(edtValue)*0.5;

        IDEUDMAmode4=(edtValue)*0.3787878788;

        IDEUDMA33=(edtValue)*0.7575757576;

        IDEUDMA66=(edtValue)*0.3787878788;

        USB=(edtValue)*16.666666667;

        firewire=(edtValue)*0.5;

        T0payload=(edtValue)*3571.4285714;

        T0B8ZSpayload=(edtValue)*3125;

        T1signal=(edtValue)*129.53367876;

        T1payload=(edtValue)*148.80952381;

        T1Zpayload=(edtValue)*129.53367876;

        T1Csignal=(edtValue)*63.45177665;

        T1Cpayload=(edtValue)*74.404761905;

        T2signal=(edtValue)*31.685678074;

        T3signal=(edtValue)*4.4706723891;

        T3payload=(edtValue)*5.3146258503;

        T3Zpayload=(edtValue)*4.650297619;

        T4signal=(edtValue)*0.72945845;

        EPTA1signal=(edtValue)*97.65625;

        EPTA1payload=(edtValue)*104.16666667;

        EPTA2signal=(edtValue)*23.674242424;

        EPTA2payload=(edtValue)*26.041666667;

        EPTA3signal=(edtValue)*5.8193668529;

        EPTA3payload=(edtValue)*6.5104166667;

        H0=(edtValue)*520.83333333;

        H11=(edtValue)*130.20833333;

        H12=(edtValue)*104.16666667;

        VirtualTributary1signal=(edtValue)*115.74074074;

        VirtualTributary1payload=(edtValue)*129.53367876;

        VirtualTributary2signal=(edtValue)*86.805555556;

        VirtualTributary2payload=(edtValue)*97.65625;

        VirtualTributary6signal=(edtValue)*31.685678074;

        VirtualTributary6payload=(edtValue)*33.333333333;

        STS1signal=(edtValue)*3.8580246914;

        STS1payload=(edtValue)*4.0404040404;

        STS3signal=(edtValue)*1.2860082305;

        STS3payload=(edtValue)*1.3303533418;

        STS3csignal=(edtValue)*1.2860082305;

        STS3cpayload=(edtValue)*1.3303533418;

        STS12signal=(edtValue)*0.3215020576;

        STS24signal=(edtValue)*0.1607510288;

        STS48signal=(edtValue)*0.0803755144;

        STS192signal=(edtValue)*0.0200938786;

        STM1signal=(edtValue)*1.2860082305;

        STM4signal=(edtValue)*0.3215020576;

        STM16signal=(edtValue)*0.0803755144;

        STM64signal=(edtValue)*0.0200938786;

    }

    private void IDEUDMAmode0() {
        bitpersecond=(edtValue)*132800000;

        bytepersecond=(edtValue)*16600000;

        kilobitpersecondSI=(edtValue)*132800;

        kilobytepersecondSI=(edtValue)*16600;

        kilobitpersecond=(edtValue)*129687.5;

        kilobytepersecond=(edtValue)*16210.9375;

        megabitpersecondSI=(edtValue)*132.8;

        megabytepersecondSI=(edtValue)*16.6;

        megabitpersecond=(edtValue)*126.64794922;

        megabytepersecond=(edtValue)*15.830993652;

        gigabitpersecondSI=(edtValue)*0.1328;

        gigabytepersecondSI=(edtValue)*0.0166;

        gigabitpersecond=(edtValue)*0.1236796379;

        gigabytepersecond=(edtValue)*0.0154599547;

        terabitpersecondSI=(edtValue)*0.0001328;

        terabytepersecondSI=(edtValue)*0.0000166;

        terabitpersecond=(edtValue)*0.0001207809;

        terabytepersecond=(edtValue)*0.0000150976;

        ethernet=(edtValue)*13.28;

        ethernetfast=(edtValue)*1.328;

        ethernetgigabit=(edtValue)*0.1328;

        OC1=(edtValue)*2.5617283951;

        OC3=(edtValue)*0.853909465;

        OC12=(edtValue)*0.2134773663;

        OC24=(edtValue)*0.1067386831;

        OC48=(edtValue)*0.0533693416;

        OC192=(edtValue)*0.0133423354;

        OC768=(edtValue)*0.0033355838;

        ISDNsinglechannel=(edtValue)*2075;

        ISDNdualchannel=(edtValue)*1037.5;

        modem110=(edtValue)*1207272.7273;

        modem300=(edtValue)*442666.66667;

        modem1200=(edtValue)*110666.66667;

        modem2400=(edtValue)*55333.333333;

        modem9600=(edtValue)*13833.333333;

        modem14k=(edtValue)*9222.2222222;

        modem28k=(edtValue)*4611.1111111;

        modem33k=(edtValue)*3952.3809524;

        modem56k=(edtValue)*2371.4285714;

        SCSIAsync=(edtValue)*11.066666667;

        SCSISync=(edtValue)*3.32;

        SCSIFast=(edtValue)*1.66;

        SCSIFastUltra=(edtValue)*0.83;


        SCSIFastWide=(edtValue)*0.83;

        SCSIFastUltraWide=(edtValue)*0.415;

        SCSIUltra2=(edtValue)*0.2075;

        SCSIUltra3=(edtValue)*0.10375;

        SCSILVDUltra80=(edtValue)*0.2075;


        SCSILVDUltra160=(edtValue)*0.10375;

        IDEPIOmode0=(edtValue)*5.0303030303;

        IDEPIOmode1=(edtValue)*3.1923076923;

        IDEPIOmode2=(edtValue)*2;

        IDEPIOmode3=(edtValue)*1.4954954955;

        IDEPIOmode4=(edtValue)*1;

        IDEDMAmode0=(edtValue)*3.9523809524;

        IDEDMAmode1=(edtValue)*1.2481203008;

        IDEDMAmode2=(edtValue)*1;

        IDEUDMAmode0=(edtValue)*1;

        IDEUDMAmode1=(edtValue)*0.664;

        IDEUDMAmode2=(edtValue)*0.503030303;

        IDEUDMAmode3=(edtValue)*0.332;

        IDEUDMAmode4=(edtValue)*0.2515151515;

        IDEUDMA33=(edtValue)*0.503030303;

        IDEUDMA66=(edtValue)*0.2515151515;

        USB=(edtValue)*11.066666667;

        firewire=(edtValue)*0.332;

        T0payload=(edtValue)*2371.4285714;

        T0B8ZSpayload=(edtValue)*2075;

        T1signal=(edtValue)*86.010362694;

        T1payload=(edtValue)*98.80952381;

        T1Zpayload=(edtValue)*86.010362694;

        T1Csignal=(edtValue)*42.131979695;

        T1Cpayload=(edtValue)*49.404761905;

        T2signal=(edtValue)*21.039290241;

        T3signal=(edtValue)*2.9685264664;

        T3payload=(edtValue)*3.5289115646;

        T3Zpayload=(edtValue)*3.087797619;

        T4signal=(edtValue)*0.4843604108;

        EPTA1signal=(edtValue)*64.84375;

        EPTA1payload=(edtValue)*69.166666667;

        EPTA2signal=(edtValue)*15.71969697;

        EPTA2payload=(edtValue)*17.291666667;

        EPTA3signal=(edtValue)*3.8640595903;

        EPTA3payload=(edtValue)*4.3229166667;

        H0=(edtValue)*345.83333333;

        H11=(edtValue)*86.458333333;

        H12=(edtValue)*69.166666667;

        VirtualTributary1signal=(edtValue)*76.851851852;

        VirtualTributary1payload=(edtValue)*86.010362694;

        VirtualTributary2signal=(edtValue)*57.638888889;

        VirtualTributary2payload=(edtValue)*64.84375;

        VirtualTributary6signal=(edtValue)*21.039290241;

        VirtualTributary6payload=(edtValue)*22.133333333;

        STS1signal=(edtValue)*2.5617283951;

        STS1payload=(edtValue)*2.6828282828;

        STS3signal=(edtValue)*0.853909465;

        STS3payload=(edtValue)*0.883354619;

        STS3csignal=(edtValue)*0.853909465;

        STS3cpayload=(edtValue)*0.883354619;

        STS12signal=(edtValue)*0.2134773663;

        STS24signal=(edtValue)*0.1067386831;

        STS48signal=(edtValue)*0.0533693416;

        STS192signal=(edtValue)*0.0133423354;

        STM1signal=(edtValue)*0.853909465;

        STM4signal=(edtValue)*0.2134773663;

        STM16signal=(edtValue)*0.0533693416;

        STM64signal=(edtValue)*0.0133423354;

    }

    private void IDEDMAmode2() {
        bitpersecond=(edtValue)*132800000;

        bytepersecond=(edtValue)*16600000;

        kilobitpersecondSI=(edtValue)*132800;

        kilobytepersecondSI=(edtValue)*16600;

        kilobitpersecond=(edtValue)*129687.5;

        kilobytepersecond=(edtValue)*16210.9375;

        megabitpersecondSI=(edtValue)*132.8;

        megabytepersecondSI=(edtValue)*16.6;

        megabitpersecond=(edtValue)*126.64794922;

        megabytepersecond=(edtValue)*15.830993652;

        gigabitpersecondSI=(edtValue)*0.1328;

        gigabytepersecondSI=(edtValue)*0.0166;

        gigabitpersecond=(edtValue)*0.1236796379;

        gigabytepersecond=(edtValue)*0.0154599547;

        terabitpersecondSI=(edtValue)*0.0001328;

        terabytepersecondSI=(edtValue)*0.0000166;

        terabitpersecond=(edtValue)*0.0001207809;

        terabytepersecond=(edtValue)*0.0000150976;

        ethernet=(edtValue)*13.28;

        ethernetfast=(edtValue)*1.328;

        ethernetgigabit=(edtValue)*0.1328;

        OC1=(edtValue)*2.5617283951;

        OC3=(edtValue)*0.853909465;

        OC12=(edtValue)*0.2134773663;

        OC24=(edtValue)*0.1067386831;

        OC48=(edtValue)*0.0533693416;

        OC192=(edtValue)*0.0133423354;

        OC768=(edtValue)*0.0033355838;

        ISDNsinglechannel=(edtValue)*2075;

        ISDNdualchannel=(edtValue)*1037.5;

        modem110=(edtValue)*1207272.7273;

        modem300=(edtValue)*442666.66667;

        modem1200=(edtValue)*110666.66667;

        modem2400=(edtValue)*55333.333333;

        modem9600=(edtValue)*13833.333333;

        modem14k=(edtValue)*9222.2222222;

        modem28k=(edtValue)*4611.1111111;

        modem33k=(edtValue)*3952.3809524;

        modem56k=(edtValue)*2371.4285714;

        SCSIAsync=(edtValue)*11.066666667;

        SCSISync=(edtValue)*3.32;

        SCSIFast=(edtValue)*1.66;

        SCSIFastUltra=(edtValue)*0.83;


        SCSIFastWide=(edtValue)*0.83;

        SCSIFastUltraWide=(edtValue)*0.415;

        SCSIUltra2=(edtValue)*0.2075;

        SCSIUltra3=(edtValue)*0.10375;

        SCSILVDUltra80=(edtValue)*0.2075;


        SCSILVDUltra160=(edtValue)*0.10375;

        IDEPIOmode0=(edtValue)*5.0303030303;

        IDEPIOmode1=(edtValue)*3.1923076923;

        IDEPIOmode2=(edtValue)*2;

        IDEPIOmode3=(edtValue)*1.4954954955;

        IDEPIOmode4=(edtValue)*1;

        IDEDMAmode0=(edtValue)*3.9523809524;

        IDEDMAmode1=(edtValue)*1.2481203008;

        IDEDMAmode2=(edtValue)*1;

        IDEUDMAmode0=(edtValue)*1;

        IDEUDMAmode1=(edtValue)*0.664;

        IDEUDMAmode2=(edtValue)*0.503030303;

        IDEUDMAmode3=(edtValue)*0.332;

        IDEUDMAmode4=(edtValue)*0.2515151515;

        IDEUDMA33=(edtValue)*0.503030303;

        IDEUDMA66=(edtValue)*0.2515151515;

        USB=(edtValue)*11.066666667;

        firewire=(edtValue)*0.332;

        T0payload=(edtValue)*2371.4285714;

        T0B8ZSpayload=(edtValue)*2075;

        T1signal=(edtValue)*86.010362694;

        T1payload=(edtValue)*98.80952381;

        T1Zpayload=(edtValue)*86.010362694;

        T1Csignal=(edtValue)*42.131979695;

        T1Cpayload=(edtValue)*49.404761905;

        T2signal=(edtValue)*21.039290241;

        T3signal=(edtValue)*2.9685264664;

        T3payload=(edtValue)*3.5289115646;

        T3Zpayload=(edtValue)*3.087797619;

        T4signal=(edtValue)*0.4843604108;

        EPTA1signal=(edtValue)*64.84375;

        EPTA1payload=(edtValue)*69.166666667;

        EPTA2signal=(edtValue)*15.71969697;

        EPTA2payload=(edtValue)*17.291666667;

        EPTA3signal=(edtValue)*3.8640595903;

        EPTA3payload=(edtValue)*4.3229166667;

        H0=(edtValue)*345.83333333;

        H11=(edtValue)*86.458333333;

        H12=(edtValue)*69.166666667;

        VirtualTributary1signal=(edtValue)*76.851851852;

        VirtualTributary1payload=(edtValue)*86.010362694;

        VirtualTributary2signal=(edtValue)*57.638888889;

        VirtualTributary2payload=(edtValue)*64.84375;

        VirtualTributary6signal=(edtValue)*21.039290241;

        VirtualTributary6payload=(edtValue)*22.133333333;

        STS1signal=(edtValue)*2.5617283951;

        STS1payload=(edtValue)*2.6828282828;

        STS3signal=(edtValue)*0.853909465;

        STS3payload=(edtValue)*0.883354619;

        STS3csignal=(edtValue)*0.853909465;

        STS3cpayload=(edtValue)*0.883354619;

        STS12signal=(edtValue)*0.2134773663;

        STS24signal=(edtValue)*0.1067386831;

        STS48signal=(edtValue)*0.0533693416;

        STS192signal=(edtValue)*0.0133423354;

        STM1signal=(edtValue)*0.853909465;

        STM4signal=(edtValue)*0.2134773663;

        STM16signal=(edtValue)*0.0533693416;

        STM64signal=(edtValue)*0.0133423354;

    }

    private void IDEDMAmode1() {
        bitpersecond=(edtValue)*106400000;

        bytepersecond=(edtValue)*13300000;

        kilobitpersecondSI=(edtValue)*106400;

        kilobytepersecondSI=(edtValue)*13300;

        kilobitpersecond=(edtValue)*103906.25;

        kilobytepersecond=(edtValue)*12988.28125;

        megabitpersecondSI=(edtValue)*106.4;

        megabytepersecondSI=(edtValue)*13.3;

        megabitpersecond=(edtValue)*101.47094727;

        megabytepersecond=(edtValue)*12.683868408;

        gigabitpersecondSI=(edtValue)*0.1064;

        gigabytepersecondSI=(edtValue)*0.0133;

        gigabitpersecond=(edtValue)*0.0990927219;

        gigabytepersecond=(edtValue)*0.0123865902;

        terabitpersecondSI=(edtValue)*0.0001064;

        terabytepersecondSI=(edtValue)*0.0000133;

        terabitpersecond=(edtValue)*0.0000967702;

        terabytepersecond=(edtValue)*0.0000120963;

        ethernet=(edtValue)*10.64;

        ethernetfast=(edtValue)*1.064;

        ethernetgigabit=(edtValue)*0.1064;

        OC1=(edtValue)*2.0524691358;

        OC3=(edtValue)*0.6841563786;

        OC12=(edtValue)*0.1710390947;

        OC24=(edtValue)*0.0855195473;

        OC48=(edtValue)*0.0427597737;

        OC192=(edtValue)*0.0106899434;

        OC768=(edtValue)*0.0026724859;

        ISDNsinglechannel=(edtValue)*1662.5;

        ISDNdualchannel=(edtValue)*831.25;

        modem110=(edtValue)*967272.72727;

        modem300=(edtValue)*354666.66667;

        modem1200=(edtValue)*88666.666667;

        modem2400=(edtValue)*44333.333333;

        modem9600=(edtValue)*11083.333333;

        modem14k=(edtValue)*7388.8888889;

        modem28k=(edtValue)*3694.4444444;

        modem33k=(edtValue)*3166.6666667;

        modem56k=(edtValue)*1900;

        SCSIAsync=(edtValue)*8.8666666667;

        SCSISync=(edtValue)*2.66;

        SCSIFast=(edtValue)*1.33;

        SCSIFastUltra=(edtValue)*0.665;


        SCSIFastWide=(edtValue)*0.665;

        SCSIFastUltraWide=(edtValue)*0.3325;

        SCSIUltra2=(edtValue)*0.16625;

        SCSIUltra3=(edtValue)*0.083125;

        SCSILVDUltra80=(edtValue)*0.16625;


        SCSILVDUltra160=(edtValue)*0.083125;

        IDEPIOmode0=(edtValue)*4.0303030303;

        IDEPIOmode1=(edtValue)*2.5576923077;

        IDEPIOmode2=(edtValue)*1.6024096386;

        IDEPIOmode3=(edtValue)*1.1981981982;

        IDEPIOmode4=(edtValue)*0.8012048193;

        IDEDMAmode0=(edtValue)*3.1666666667;

        IDEDMAmode1=(edtValue)*1;

        IDEDMAmode2=(edtValue)*0.8012048193;

        IDEUDMAmode0=(edtValue)*0.8012048193;

        IDEUDMAmode1=(edtValue)*0.532;

        IDEUDMAmode2=(edtValue)*0.403030303;

        IDEUDMAmode3=(edtValue)*0.266;

        IDEUDMAmode4=(edtValue)*0.2015151515;

        IDEUDMA33=(edtValue)*0.403030303;

        IDEUDMA66=(edtValue)*0.2015151515;

        USB=(edtValue)*8.8666666667;

        firewire=(edtValue)*0.266;

        T0payload=(edtValue)*1900;

        T0B8ZSpayload=(edtValue)*1662.5;

        T1signal=(edtValue)*68.911917098;

        T1payload=(edtValue)*79.166666667;

        T1Zpayload=(edtValue)*68.911917098;

        T1Csignal=(edtValue)*33.756345178;

        T1Cpayload=(edtValue)*39.583333333;

        T2signal=(edtValue)*16.856780735;

        T3signal=(edtValue)*2.378397711;

        T3payload=(edtValue)*2.8273809524;

        T3Zpayload=(edtValue)*2.4739583333;

        T4signal=(edtValue)*0.3880718954;

        EPTA1signal=(edtValue)*51.953125;

        EPTA1payload=(edtValue)*55.416666667;

        EPTA2signal=(edtValue)*12.59469697;

        EPTA2payload=(edtValue)*13.854166667;

        EPTA3signal=(edtValue)*3.0959031657;

        EPTA3payload=(edtValue)*3.4635416667;

        H0=(edtValue)*277.08333333;

        H11=(edtValue)*69.270833333;

        H12=(edtValue)*55.416666667;

        VirtualTributary1signal=(edtValue)*61.574074074;

        VirtualTributary1payload=(edtValue)*68.911917098;

        VirtualTributary2signal=(edtValue)*46.180555556;

        VirtualTributary2payload=(edtValue)*51.953125;

        VirtualTributary6signal=(edtValue)*16.856780735;

        VirtualTributary6payload=(edtValue)*17.733333333;

        STS1signal=(edtValue)*2.0524691358;

        STS1payload=(edtValue)*2.1494949495;

        STS3signal=(edtValue)*0.6841563786;

        STS3payload=(edtValue)*0.7077479779;

        STS3csignal=(edtValue)*0.6841563786;

        STS3cpayload=(edtValue)*0.7077479779;

        STS12signal=(edtValue)*0.1710390947;

        STS24signal=(edtValue)*0.0855195473;

        STS48signal=(edtValue)*0.0427597737;

        STS192signal=(edtValue)*0.0106899434;

        STM1signal=(edtValue)*0.6841563786;

        STM4signal=(edtValue)*0.1710390947;

        STM16signal=(edtValue)*0.0427597737;

        STM64signal=(edtValue)*0.0106899434;

    }

    private void IDEDMAmode0() {
        bitpersecond=(edtValue)*33600000;

        bytepersecond=(edtValue)*4200000;

        kilobitpersecondSI=(edtValue)*33600;

        kilobytepersecondSI=(edtValue)*4200;

        kilobitpersecond=(edtValue)*32812.5;

        kilobytepersecond=(edtValue)*4101.5625;

        megabitpersecondSI=(edtValue)*33.6;

        megabytepersecondSI=(edtValue)*4.2;

        megabitpersecond=(edtValue)*32.043457031;

        megabytepersecond=(edtValue)*4.0054321289;

        gigabitpersecondSI=(edtValue)*0.0336;

        gigabytepersecondSI=(edtValue)*0.0042;

        gigabitpersecond=(edtValue)*0.0312924385;

        gigabytepersecond=(edtValue)*0.0039115548;

        terabitpersecondSI=(edtValue)*0.0000336;

        terabytepersecondSI=(edtValue)*0.0000042;

        terabitpersecond=(edtValue)*0.000030559;

        terabytepersecond=(edtValue)*0.0000038199;

        ethernet=(edtValue)*3.36;

        ethernetfast=(edtValue)*0.336;

        ethernetgigabit=(edtValue)*0.0336;

        OC1=(edtValue)*0.6481481481;

        OC3=(edtValue)*0.2160493827;

        OC12=(edtValue)*0.0540123457;

        OC24=(edtValue)*0.0270061728;

        OC48=(edtValue)*0.0135030864;

        OC192=(edtValue)*0.0033757716;

        OC768=(edtValue)*0.0008439429;

        ISDNsinglechannel=(edtValue)*525;

        ISDNdualchannel=(edtValue)*262.5;

        modem110=(edtValue)*305454.54545;

        modem300=(edtValue)*112000;

        modem1200=(edtValue)*28000;

        modem2400=(edtValue)*14000;

        modem9600=(edtValue)*3500;

        modem14k=(edtValue)*2333.3333333;

        modem28k=(edtValue)*1166.6666667;

        modem33k=(edtValue)*1000;

        modem56k=(edtValue)*600;

        SCSIAsync=(edtValue)*2.8;

        SCSISync=(edtValue)*0.84;

        SCSIFast=(edtValue)*0.42;

        SCSIFastUltra=(edtValue)*0.21;


        SCSIFastWide=(edtValue)*0.21;

        SCSIFastUltraWide=(edtValue)*0.105;

        SCSIUltra2=(edtValue)*0.0525;

        SCSIUltra3=(edtValue)*0.02625;

        SCSILVDUltra80=(edtValue)*0.0525;


        SCSILVDUltra160=(edtValue)*0.02625;

        IDEPIOmode0=(edtValue)*1.2727272727;

        IDEPIOmode1=(edtValue)*0.8076923077;

        IDEPIOmode2=(edtValue)*0.5060240964;

        IDEPIOmode3=(edtValue)*0.3783783784;

        IDEPIOmode4=(edtValue)*0.2530120482;

        IDEDMAmode0=(edtValue)*1;

        IDEDMAmode1=(edtValue)*0.3157894737;

        IDEDMAmode2=(edtValue)*0.2530120482;

        IDEUDMAmode0=(edtValue)*0.2530120482;

        IDEUDMAmode1=(edtValue)*0.168;

        IDEUDMAmode2=(edtValue)*0.1272727273;

        IDEUDMAmode3=(edtValue)*0.084;

        IDEUDMAmode4=(edtValue)*0.0636363636;

        IDEUDMA33=(edtValue)*0.1272727273;

        IDEUDMA66=(edtValue)*0.0636363636;

        USB=(edtValue)*2.8;

        firewire=(edtValue)*0.084;

        T0payload=(edtValue)*600;

        T0B8ZSpayload=(edtValue)*525;

        T1signal=(edtValue)*21.761658031;

        T1payload=(edtValue)*25;

        T1Zpayload=(edtValue)*21.761658031;

        T1Csignal=(edtValue)*10.659898477;

        T1Cpayload=(edtValue)*12.5;

        T2signal=(edtValue)*5.3231939163;

        T3signal=(edtValue)*0.7510729614;

        T3payload=(edtValue)*0.8928571429;

        T3Zpayload=(edtValue)*0.78125;

        T4signal=(edtValue)*0.1225490196;

        EPTA1signal=(edtValue)*16.40625;

        EPTA1payload=(edtValue)*17.5;

        EPTA2signal=(edtValue)*3.9772727273;

        EPTA2payload=(edtValue)*4.375;

        EPTA3signal=(edtValue)*0.9776536313;

        EPTA3payload=(edtValue)*1.09375;

        H0=(edtValue)*87.5;

        H11=(edtValue)*21.875;

        H12=(edtValue)*17.5;

        VirtualTributary1signal=(edtValue)*19.444444444;

        VirtualTributary1payload=(edtValue)*21.761658031;

        VirtualTributary2signal=(edtValue)*14.583333333;

        VirtualTributary2payload=(edtValue)*16.40625;

        VirtualTributary6signal=(edtValue)*5.3231939163;

        VirtualTributary6payload=(edtValue)*5.6;

        STS1signal=(edtValue)*0.6481481481;

        STS1payload=(edtValue)*0.6787878788;

        STS3signal=(edtValue)*0.2160493827;

        STS3payload=(edtValue)*0.2234993614;

        STS3csignal=(edtValue)*0.2160493827;

        STS3cpayload=(edtValue)*0.2234993614;

        STS12signal=(edtValue)*0.0540123457;

        STS24signal=(edtValue)*0.0270061728;

        STS48signal=(edtValue)*0.0135030864;

        STS192signal=(edtValue)*0.0033757716;

        STM1signal=(edtValue)*0.2160493827;

        STM4signal=(edtValue)*0.0540123457;

        STM16signal=(edtValue)*0.0135030864;

        STM64signal=(edtValue)*0.0033757716;

    }

    private void IDEPIOmode4() {

        bitpersecond=(edtValue)*132800000;

        bytepersecond=(edtValue)*16600000;

        kilobitpersecondSI=(edtValue)*132800;

        kilobytepersecondSI=(edtValue)*16600;

        kilobitpersecond=(edtValue)*129687.5;

        kilobytepersecond=(edtValue)*16210.9375;

        megabitpersecondSI=(edtValue)*132.8;

        megabytepersecondSI=(edtValue)*16.6;

        megabitpersecond=(edtValue)*126.64794922;

        megabytepersecond=(edtValue)*15.830993652;

        gigabitpersecondSI=(edtValue)*0.1328;

        gigabytepersecondSI=(edtValue)*0.0166;

        gigabitpersecond=(edtValue)*0.1236796379;

        gigabytepersecond=(edtValue)*0.0154599547;

        terabitpersecondSI=(edtValue)*0.0001328;

        terabytepersecondSI=(edtValue)*0.0000166;

        terabitpersecond=(edtValue)*0.0001207809;

        terabytepersecond=(edtValue)*0.0000150976;

        ethernet=(edtValue)*13.28;

        ethernetfast=(edtValue)*1.328;

        ethernetgigabit=(edtValue)*0.1328;

        OC1=(edtValue)*2.5617283951;

        OC3=(edtValue)*0.853909465;

        OC12=(edtValue)*0.2134773663;

        OC24=(edtValue)*0.1067386831;

        OC48=(edtValue)*0.0533693416;

        OC192=(edtValue)*0.0133423354;

        OC768=(edtValue)*0.0033355838;

        ISDNsinglechannel=(edtValue)*2075;

        ISDNdualchannel=(edtValue)*1037.5;

        modem110=(edtValue)*1207272.7273;

        modem300=(edtValue)*442666.66667;

        modem1200=(edtValue)*110666.66667;

        modem2400=(edtValue)*55333.333333;

        modem9600=(edtValue)*13833.333333;

        modem14k=(edtValue)*9222.2222222;

        modem28k=(edtValue)*4611.1111111;

        modem33k=(edtValue)*3952.3809524;

        modem56k=(edtValue)*2371.4285714;

        SCSIAsync=(edtValue)*11.066666667;

        SCSISync=(edtValue)*3.32;

        SCSIFast=(edtValue)*1.66;

        SCSIFastUltra=(edtValue)*0.83;


        SCSIFastWide=(edtValue)*0.83;

        SCSIFastUltraWide=(edtValue)*0.415;

        SCSIUltra2=(edtValue)*0.2075;

        SCSIUltra3=(edtValue)*0.10375;

        SCSILVDUltra80=(edtValue)*0.2075;


        SCSILVDUltra160=(edtValue)*0.10375;

        IDEPIOmode0=(edtValue)*5.0303030303;

        IDEPIOmode1=(edtValue)*3.1923076923;

        IDEPIOmode2=(edtValue)*2;

        IDEPIOmode3=(edtValue)*1.4954954955;

        IDEPIOmode4=(edtValue)*1;

        IDEDMAmode0=(edtValue)*3.9523809524;

        IDEDMAmode1=(edtValue)*1.2481203008;

        IDEDMAmode2=(edtValue)*1;

        IDEUDMAmode0=(edtValue)*1;

        IDEUDMAmode1=(edtValue)*0.664;

        IDEUDMAmode2=(edtValue)*0.503030303;

        IDEUDMAmode3=(edtValue)*0.332;

        IDEUDMAmode4=(edtValue)*0.2515151515;

        IDEUDMA33=(edtValue)*0.503030303;

        IDEUDMA66=(edtValue)*0.2515151515;

        USB=(edtValue)*11.066666667;

        firewire=(edtValue)*0.332;

        T0payload=(edtValue)*2371.4285714;

        T0B8ZSpayload=(edtValue)*2075;

        T1signal=(edtValue)*86.010362694;

        T1payload=(edtValue)*98.80952381;

        T1Zpayload=(edtValue)*86.010362694;

        T1Csignal=(edtValue)*42.131979695;

        T1Cpayload=(edtValue)*49.404761905;

        T2signal=(edtValue)*21.039290241;

        T3signal=(edtValue)*2.9685264664;

        T3payload=(edtValue)*3.5289115646;

        T3Zpayload=(edtValue)*3.087797619;

        T4signal=(edtValue)*0.4843604108;

        EPTA1signal=(edtValue)*64.84375;

        EPTA1payload=(edtValue)*69.166666667;

        EPTA2signal=(edtValue)*15.71969697;

        EPTA2payload=(edtValue)*17.291666667;

        EPTA3signal=(edtValue)*3.8640595903;

        EPTA3payload=(edtValue)*4.3229166667;

        H0=(edtValue)*345.83333333;

        H11=(edtValue)*86.458333333;

        H12=(edtValue)*69.166666667;

        VirtualTributary1signal=(edtValue)*76.851851852;

        VirtualTributary1payload=(edtValue)*86.010362694;

        VirtualTributary2signal=(edtValue)*57.638888889;

        VirtualTributary2payload=(edtValue)*64.84375;

        VirtualTributary6signal=(edtValue)*21.039290241;

        VirtualTributary6payload=(edtValue)*22.133333333;

        STS1signal=(edtValue)*2.5617283951;

        STS1payload=(edtValue)*2.6828282828;

        STS3signal=(edtValue)*0.853909465;

        STS3payload=(edtValue)*0.883354619;

        STS3csignal=(edtValue)*0.853909465;

        STS3cpayload=(edtValue)*0.883354619;

        STS12signal=(edtValue)*0.2134773663;

        STS24signal=(edtValue)*0.1067386831;

        STS48signal=(edtValue)*0.0533693416;

        STS192signal=(edtValue)*0.0133423354;

        STM1signal=(edtValue)*0.853909465;

        STM4signal=(edtValue)*0.2134773663;

        STM16signal=(edtValue)*0.0533693416;

        STM64signal=(edtValue)*0.0133423354;

    }

    private void IDEPIOmode3() {
        bitpersecond=(edtValue)*88800000;

        bytepersecond=(edtValue)*11100000;

        kilobitpersecondSI=(edtValue)*88800;

        kilobytepersecondSI=(edtValue)*11100;

        kilobitpersecond=(edtValue)*86718.75;

        kilobytepersecond=(edtValue)*10839.84375;

        megabitpersecondSI=(edtValue)*88.8;

        megabytepersecondSI=(edtValue)*11.1;

        megabitpersecond=(edtValue)*84.686279297;

        megabytepersecond=(edtValue)*10.585784912;

        gigabitpersecondSI=(edtValue)*0.0888;

        gigabytepersecondSI=(edtValue)*0.0111;

        gigabitpersecond=(edtValue)*0.0827014446;

        gigabytepersecond=(edtValue)*0.0103376806;

        terabitpersecondSI=(edtValue)*0.0000888;

        terabytepersecondSI=(edtValue)*0.0000111;

        terabitpersecond=(edtValue)*0.0000807631;

        terabytepersecond=(edtValue)*0.0000100954;

        ethernet=(edtValue)*8.88;

        ethernetfast=(edtValue)*0.888;

        ethernetgigabit=(edtValue)*0.0888;

        OC1=(edtValue)*1.712962963;

        OC3=(edtValue)*0.5709876543;

        OC12=(edtValue)*0.1427469136;

        OC24=(edtValue)*0.0713734568;

        OC48=(edtValue)*0.0356867284;

        OC192=(edtValue)*0.0089216821;

        OC768=(edtValue)*0.0022304205;

        ISDNsinglechannel=(edtValue)*1387.5;

        ISDNdualchannel=(edtValue)*693.75;

        modem110=(edtValue)*807272.72727;

        modem300=(edtValue)*296000;

        modem1200=(edtValue)*74000;

        modem2400=(edtValue)*37000;

        modem9600=(edtValue)*9250;

        modem14k=(edtValue)*6166.6666667;

        modem28k=(edtValue)*3083.3333333;

        modem33k=(edtValue)*2642.8571429;

        modem56k=(edtValue)*1585.7142857;

        SCSIAsync=(edtValue)*7.4;

        SCSISync=(edtValue)*2.22;

        SCSIFast=(edtValue)*1.11;

        SCSIFastUltra=(edtValue)*0.555;


        SCSIFastWide=(edtValue)*0.555;

        SCSIFastUltraWide=(edtValue)*0.2775;

        SCSIUltra2=(edtValue)*0.13875;

        SCSIUltra3=(edtValue)*0.069375;

        SCSILVDUltra80=(edtValue)*0.13875;


        SCSILVDUltra160=(edtValue)*0.069375;

        IDEPIOmode0=(edtValue)*3.3636363636;

        IDEPIOmode1=(edtValue)*2.1346153846;

        IDEPIOmode2=(edtValue)*1.3373493976;

        IDEPIOmode3=(edtValue)*1;

        IDEPIOmode4=(edtValue)*0.6686746988;

        IDEDMAmode0=(edtValue)*2.6428571429;

        IDEDMAmode1=(edtValue)*0.8345864662;

        IDEDMAmode2=(edtValue)*0.6686746988;

        IDEUDMAmode0=(edtValue)*0.6686746988;

        IDEUDMAmode1=(edtValue)*0.444;

        IDEUDMAmode2=(edtValue)*0.3363636364;

        IDEUDMAmode3=(edtValue)*0.222;

        IDEUDMAmode4=(edtValue)*0.1681818182;

        IDEUDMA33=(edtValue)*0.3363636364;

        IDEUDMA66=(edtValue)*0.1681818182;

        USB=(edtValue)*7.4;

        firewire=(edtValue)*0.222;

        T0payload=(edtValue)*1585.7142857;

        T0B8ZSpayload=(edtValue)*1387.5;

        T1signal=(edtValue)*57.512953368;

        T1payload=(edtValue)*66.071428571;

        T1Zpayload=(edtValue)*57.512953368;

        T1Csignal=(edtValue)*28.172588832;

        T1Cpayload=(edtValue)*33.035714286;

        T2signal=(edtValue)*14.068441065;

        T3signal=(edtValue)*1.9849785408;

        T3payload=(edtValue)*2.3596938776;

        T3Zpayload=(edtValue)*2.0647321429;

        T4signal=(edtValue)*0.3238795518;

        EPTA1signal=(edtValue)*43.359375;

        EPTA1payload=(edtValue)*46.25;

        EPTA2signal=(edtValue)*10.511363636;

        EPTA2payload=(edtValue)*11.5625;

        EPTA3signal=(edtValue)*2.5837988827;

        EPTA3payload=(edtValue)*2.890625;

        H0=(edtValue)*231.25;

        H11=(edtValue)*57.8125;

        H12=(edtValue)*46.25;

        VirtualTributary1signal=(edtValue)*51.388888889;

        VirtualTributary1payload=(edtValue)*57.512953368;

        VirtualTributary2signal=(edtValue)*38.541666667;

        VirtualTributary2payload=(edtValue)*43.359375;

        VirtualTributary6signal=(edtValue)*14.068441065;

        VirtualTributary6payload=(edtValue)*14.8;

        STS1signal=(edtValue)*1.712962963;

        STS1payload=(edtValue)*1.7939393939;

        STS3signal=(edtValue)*0.5709876543;

        STS3payload=(edtValue)*0.5906768838;

        STS3csignal=(edtValue)*0.5709876543;

        STS3cpayload=(edtValue)*0.5906768838;

        STS12signal=(edtValue)*0.1427469136;

        STS24signal=(edtValue)*0.0713734568;

        STS48signal=(edtValue)*0.0356867284;

        STS192signal=(edtValue)*0.0089216821;

        STM1signal=(edtValue)*0.5709876543;

        STM4signal=(edtValue)*0.1427469136;

        STM16signal=(edtValue)*0.0356867284;

        STM64signal=(edtValue)*0.0089216821;

    }

    private void IDEPIOmode2() {
        bitpersecond=(edtValue)*66400000;

        bytepersecond=(edtValue)*8300000;

        kilobitpersecondSI=(edtValue)*66400;

        kilobytepersecondSI=(edtValue)*8300;

        kilobitpersecond=(edtValue)*64843.75;

        kilobytepersecond=(edtValue)*8105.46875;

        megabitpersecondSI=(edtValue)*66.4;

        megabytepersecondSI=(edtValue)*8.3;

        megabitpersecond=(edtValue)*63.323974609;

        megabytepersecond=(edtValue)*7.9154968262;

        gigabitpersecondSI=(edtValue)*0.0664;

        gigabytepersecondSI=(edtValue)*0.0083;

        gigabitpersecond=(edtValue)*0.061839819;

        gigabytepersecond=(edtValue)*0.0077299774;

        terabitpersecondSI=(edtValue)*0.0000664;

        terabytepersecondSI=(edtValue)*0.0000083;

        terabitpersecond=(edtValue)*0.0000603904;

        terabytepersecond=(edtValue)*0.0000075488;

        ethernet=(edtValue)*6.64;

        ethernetfast=(edtValue)*0.664;

        ethernetgigabit=(edtValue)*0.0664;

        OC1=(edtValue)*1.2808641975;

        OC3=(edtValue)*0.4269547325;

        OC12=(edtValue)*0.1067386831;

        OC24=(edtValue)*0.0533693416;

        OC48=(edtValue)*0.0266846708;

        OC192=(edtValue)*0.0066711677;

        OC768=(edtValue)*0.0016677919;

        ISDNsinglechannel=(edtValue)*1037.5;

        ISDNdualchannel=(edtValue)*518.75;

        modem110=(edtValue)*603636.36364;

        modem300=(edtValue)*221333.33333;

        modem1200=(edtValue)*55333.333333;

        modem2400=(edtValue)*27666.666667;

        modem9600=(edtValue)*6916.6666667;

        modem14k=(edtValue)*4611.1111111;

        modem28k=(edtValue)*2305.5555556;

        modem33k=(edtValue)*1976.1904762;

        modem56k=(edtValue)*1185.7142857;

        SCSIAsync=(edtValue)*5.5333333333;

        SCSISync=(edtValue)*1.66;

        SCSIFast=(edtValue)*0.83;

        SCSIFastUltra=(edtValue)*0.415;


        SCSIFastWide=(edtValue)*0.415;

        SCSIFastUltraWide=(edtValue)*0.2075;

        SCSIUltra2=(edtValue)*0.10375;

        SCSIUltra3=(edtValue)*0.051875;

        SCSILVDUltra80=(edtValue)*0.10375;


        SCSILVDUltra160=(edtValue)*0.051875;

        IDEPIOmode0=(edtValue)*2.5151515152;

        IDEPIOmode1=(edtValue)*1.5961538462;

        IDEPIOmode2=(edtValue)*1;

        IDEPIOmode3=(edtValue)*0.7477477477;

        IDEPIOmode4=(edtValue)*0.5;

        IDEDMAmode0=(edtValue)*1.9761904762;

        IDEDMAmode1=(edtValue)*0.6240601504;

        IDEDMAmode2=(edtValue)*0.5;

        IDEUDMAmode0=(edtValue)*0.5;

        IDEUDMAmode1=(edtValue)*0.332;

        IDEUDMAmode2=(edtValue)*0.2515151515;

        IDEUDMAmode3=(edtValue)*0.166;

        IDEUDMAmode4=(edtValue)*0.1257575758;

        IDEUDMA33=(edtValue)*0.2515151515;

        IDEUDMA66=(edtValue)*0.1257575758;

        USB=(edtValue)*5.5333333333;

        firewire=(edtValue)*0.166;

        T0payload=(edtValue)*1185.7142857;

        T0B8ZSpayload=(edtValue)*1037.5;

        T1signal=(edtValue)*43.005181347;

        T1payload=(edtValue)*49.404761905;

        T1Zpayload=(edtValue)*43.005181347;

        T1Csignal=(edtValue)*21.065989848;

        T1Cpayload=(edtValue)*24.702380952;

        T2signal=(edtValue)*10.51964512;

        T3signal=(edtValue)*1.4842632332;

        T3payload=(edtValue)*1.7644557823;

        T3Zpayload=(edtValue)*1.5438988095;

        T4signal=(edtValue)*0.2421802054;

        EPTA1signal=(edtValue)*32.421875;

        EPTA1payload=(edtValue)*34.583333333;

        EPTA2signal=(edtValue)*7.8598484848;

        EPTA2payload=(edtValue)*8.6458333333;

        EPTA3signal=(edtValue)*1.9320297952;

        EPTA3payload=(edtValue)*2.1614583333;

        H0=(edtValue)*172.91666667;

        H11=(edtValue)*43.229166667;

        H12=(edtValue)*34.583333333;

        VirtualTributary1signal=(edtValue)*38.425925926;

        VirtualTributary1payload=(edtValue)*43.005181347;

        VirtualTributary2signal=(edtValue)*28.819444444;

        VirtualTributary2payload=(edtValue)*32.421875;

        VirtualTributary6signal=(edtValue)*10.51964512;

        VirtualTributary6payload=(edtValue)*11.066666667;

        STS1signal=(edtValue)*1.2808641975;

        STS1payload=(edtValue)*1.3414141414;

        STS3signal=(edtValue)*0.4269547325;

        STS3payload=(edtValue)*0.4416773095;

        STS3csignal=(edtValue)*0.4269547325;

        STS3cpayload=(edtValue)*0.4416773095;

        STS12signal=(edtValue)*0.1067386831;

        STS24signal=(edtValue)*0.0533693416;

        STS48signal=(edtValue)*0.0266846708;

        STS192signal=(edtValue)*0.0066711677;

        STM1signal=(edtValue)*0.4269547325;

        STM4signal=(edtValue)*0.1067386831;

        STM16signal=(edtValue)*0.0266846708;
        STM64signal=(edtValue)*0.0066711677;

    }

    private void IDEPIOmode1() {
        bitpersecond=(edtValue)*41600000;

        bytepersecond=(edtValue)*5200000;

        kilobitpersecondSI=(edtValue)*41600;

        kilobytepersecondSI=(edtValue)*5200;

        kilobitpersecond=(edtValue)*40625;

        kilobytepersecond=(edtValue)*5078.125;

        megabitpersecondSI=(edtValue)*41.6;

        megabytepersecondSI=(edtValue)*5.2;

        megabitpersecond=(edtValue)*39.672851562;

        megabytepersecond=(edtValue)*4.9591064453;

        gigabitpersecondSI=(edtValue)*0.0416;

        gigabytepersecondSI=(edtValue)*0.0052;

        gigabitpersecond=(edtValue)*0.0387430191;

        gigabytepersecond=(edtValue)*0.0048428774;

        terabitpersecondSI=(edtValue)*0.0000416;

        terabytepersecondSI=(edtValue)*0.0000052;

        terabitpersecond=(edtValue)*0.000037835;

        terabytepersecond=(edtValue)*0.0000047294;

        ethernet=(edtValue)*4.16;

        ethernetfast=(edtValue)*0.416;

        ethernetgigabit=(edtValue)*0.0416;

        OC1=(edtValue)*0.8024691358;

        OC3=(edtValue)*0.2674897119;

        OC12=(edtValue)*0.066872428;

        OC24=(edtValue)*0.033436214;

        OC48=(edtValue)*0.016718107;

        OC192=(edtValue)*0.0041795267;

        OC768=(edtValue)*0.0010448817;

        ISDNsinglechannel=(edtValue)*650;

        ISDNdualchannel=(edtValue)*325;

        modem110=(edtValue)*378181.81818;

        modem300=(edtValue)*138666.66667;

        modem1200=(edtValue)*34666.666667;

        modem2400=(edtValue)*17333.333333;

        modem9600=(edtValue)*4333.3333333;

        modem14k=(edtValue)*2888.8888889;

        modem28k=(edtValue)*1444.4444444;

        modem33k=(edtValue)*1238.0952381;

        modem56k=(edtValue)*742.85714286;

        SCSIAsync=(edtValue)*3.4666666667;

        SCSISync=(edtValue)*1.04;

        SCSIFast=(edtValue)*0.52;

        SCSIFastUltra=(edtValue)*0.26;


        SCSIFastWide=(edtValue)*0.26;

        SCSIFastUltraWide=(edtValue)*0.13;

        SCSIUltra2=(edtValue)*0.065;

        SCSIUltra3=(edtValue)*0.0325;

        SCSILVDUltra80=(edtValue)*0.065;


        SCSILVDUltra160=(edtValue)*0.0325;

        IDEPIOmode0=(edtValue)*1.5757575758;

        IDEPIOmode1=(edtValue)*1;

        IDEPIOmode2=(edtValue)*0.6265060241;

        IDEPIOmode3=(edtValue)*0.4684684685;

        IDEPIOmode4=(edtValue)*0.313253012;

        IDEDMAmode0=(edtValue)*1.2380952381;

        IDEDMAmode1=(edtValue)*0.3909774436;

        IDEDMAmode2=(edtValue)*0.313253012;

        IDEUDMAmode0=(edtValue)*0.313253012;

        IDEUDMAmode1=(edtValue)*0.208;

        IDEUDMAmode2=(edtValue)*0.1575757576;

        IDEUDMAmode3=(edtValue)*0.104;

        IDEUDMAmode4=(edtValue)*0.0787878788;

        IDEUDMA33=(edtValue)*0.1575757576;

        IDEUDMA66=(edtValue)*0.0787878788;

        USB=(edtValue)*3.4666666667;

        firewire=(edtValue)*0.104;

        T0payload=(edtValue)*742.85714286;

        T0B8ZSpayload=(edtValue)*650;

        T1signal=(edtValue)*26.943005181;

        T1payload=(edtValue)*30.952380952;

        T1Zpayload=(edtValue)*26.943005181;

        T1Csignal=(edtValue)*13.197969543;

        T1Cpayload=(edtValue)*15.476190476;

        T2signal=(edtValue)*6.5906210393;

        T3signal=(edtValue)*0.9298998569;

        T3payload=(edtValue)*1.1054421769;

        T3Zpayload=(edtValue)*0.9672619048;

        T4signal=(edtValue)*0.1517273576;

        EPTA1signal=(edtValue)*20.3125;

        EPTA1payload=(edtValue)*21.666666667;

        EPTA2signal=(edtValue)*4.9242424242;

        EPTA2payload=(edtValue)*5.4166666667;

        EPTA3signal=(edtValue)*1.2104283054;

        EPTA3payload=(edtValue)*1.3541666667;

        H0=(edtValue)*108.33333333;

        H11=(edtValue)*27.083333333;

        H12=(edtValue)*21.666666667;

        VirtualTributary1signal=(edtValue)*24.074074074;

        VirtualTributary1payload=(edtValue)*26.943005181;

        VirtualTributary2signal=(edtValue)*18.055555556;

        VirtualTributary2payload=(edtValue)*20.3125;

        VirtualTributary6signal=(edtValue)*6.5906210393;

        VirtualTributary6payload=(edtValue)*6.9333333333;

        STS1signal=(edtValue)*0.8024691358;

        STS1payload=(edtValue)*0.8404040404;

        STS3signal=(edtValue)*0.2674897119;

        STS3payload=(edtValue)*0.2767134951;

        STS3csignal=(edtValue)*0.2674897119;

        STS3cpayload=(edtValue)*0.2767134951;

        STS12signal=(edtValue)*0.066872428;

        STS24signal=(edtValue)*0.033436214;

        STS48signal=(edtValue)*0.016718107;

        STS192signal=(edtValue)*0.0041795267;

        STM1signal=(edtValue)*0.2674897119;

        STM4signal=(edtValue)*0.066872428;

        STM16signal=(edtValue)*0.016718107;

        STM64signal=(edtValue)*0.0041795267;
    }

    private void IDEPIOmode0() {
        bitpersecond=(edtValue)*26400000;

        bytepersecond=(edtValue)*3300000;

        kilobitpersecondSI=(edtValue)*26400;

        kilobytepersecondSI=(edtValue)*3300;

        kilobitpersecond=(edtValue)*25781.25;

        kilobytepersecond=(edtValue)*3222.65625;

        megabitpersecondSI=(edtValue)*26.4;

        megabytepersecondSI=(edtValue)*3.3;

        megabitpersecond=(edtValue)*25.177001953;

        megabytepersecond=(edtValue)*3.1471252441;

        gigabitpersecondSI=(edtValue)*0.0264;

        gigabytepersecondSI=(edtValue)*0.0033;

        gigabitpersecond=(edtValue)*0.024586916;

        gigabytepersecond=(edtValue)*0.0030733645;

        terabitpersecondSI=(edtValue)*0.0000264;

        terabytepersecondSI=(edtValue)*0.0000033;

        terabitpersecond=(edtValue)*0.0000240107;

        terabytepersecond=(edtValue)*0.0000030013;

        ethernet=(edtValue)*2.64;

        ethernetfast=(edtValue)*0.264;

        ethernetgigabit=(edtValue)*0.0264;

        OC1=(edtValue)*0.5092592593;

        OC3=(edtValue)*0.1697530864;

        OC12=(edtValue)*0.0424382716;

        OC24=(edtValue)*0.0212191358;

        OC48=(edtValue)*0.0106095679;

        OC192=(edtValue)*0.002652392;

        OC768=(edtValue)*0.000663098;

        ISDNsinglechannel=(edtValue)*412.5;

        ISDNdualchannel=(edtValue)*206.25;

        modem110=(edtValue)*240000;

        modem300=(edtValue)*88000;

        modem1200=(edtValue)*22000;

        modem2400=(edtValue)*11000;

        modem9600=(edtValue)*2750;

        modem14k=(edtValue)*1833.3333333;

        modem28k=(edtValue)*916.66666667;

        modem33k=(edtValue)*785.71428571;

        modem56k=(edtValue)*471.42857143;

        SCSIAsync=(edtValue)*2.2;

        SCSISync=(edtValue)*0.66;

        SCSIFast=(edtValue)*0.33;

        SCSIFastUltra=(edtValue)*0.165;


        SCSIFastWide=(edtValue)*0.165;

        SCSIFastUltraWide=(edtValue)*0.0825;

        SCSIUltra2=(edtValue)*0.04125;

        SCSIUltra3=(edtValue)*0.020625;

        SCSILVDUltra80=(edtValue)*0.04125;


        SCSILVDUltra160=(edtValue)*0.020625;

        IDEPIOmode0=(edtValue)*1;

        IDEPIOmode1=(edtValue)*0.6346153846;

        IDEPIOmode2=(edtValue)*0.3975903614;

        IDEPIOmode3=(edtValue)*0.2972972973;

        IDEPIOmode4=(edtValue)*0.1987951807;

        IDEDMAmode0=(edtValue)*0.7857142857;

        IDEDMAmode1=(edtValue)*0.2481203008;

        IDEDMAmode2=(edtValue)*0.1987951807;

        IDEUDMAmode0=(edtValue)*0.1987951807;

        IDEUDMAmode1=(edtValue)*0.132;

        IDEUDMAmode2=(edtValue)*0.1;

        IDEUDMAmode3=(edtValue)*0.066;

        IDEUDMAmode4=(edtValue)*0.05;

        IDEUDMA33=(edtValue)*0.1;

        IDEUDMA66=(edtValue)*0.05;

        USB=(edtValue)*2.2;

        firewire=(edtValue)*0.066;

        T0payload=(edtValue)*471.42857143;

        T0B8ZSpayload=(edtValue)*412.5;

        T1signal=(edtValue)*17.098445596;

        T1payload=(edtValue)*19.642857143;

        T1Zpayload=(edtValue)*17.098445596;

        T1Csignal=(edtValue)*8.3756345178;

        T1Cpayload=(edtValue)*9.8214285714;

        T2signal=(edtValue)*4.1825095057;

        T3signal=(edtValue)*0.5901287554;

        T3payload=(edtValue)*0.7015306122;

        T3Zpayload=(edtValue)*0.6138392857;

        T4signal=(edtValue)*0.0962885154;

        EPTA1signal=(edtValue)*12.890625;

        EPTA1payload=(edtValue)*13.75;

        EPTA2signal=(edtValue)*3.125;

        EPTA2payload=(edtValue)*3.4375;

        EPTA3signal=(edtValue)*0.7681564246;

        EPTA3payload=(edtValue)*0.859375;

        H0=(edtValue)*68.75;

        H11=(edtValue)*17.1875;

        H12=(edtValue)*13.75;

        VirtualTributary1signal=(edtValue)*15.277777778;

        VirtualTributary1payload=(edtValue)*17.098445596;

        VirtualTributary2signal=(edtValue)*11.458333333;

        VirtualTributary2payload=(edtValue)*12.890625;

        VirtualTributary6signal=(edtValue)*4.1825095057;

        VirtualTributary6payload=(edtValue)*4.4;

        STS1signal=(edtValue)*0.5092592593;

        STS1payload=(edtValue)*0.5333333333;

        STS3signal=(edtValue)*0.1697530864;

        STS3payload=(edtValue)*0.1756066411;

        STS3csignal=(edtValue)*0.1697530864;

        STS3cpayload=(edtValue)*0.1756066411;

        STS12signal=(edtValue)*0.0424382716;

        STS24signal=(edtValue)*0.0212191358;

        STS48signal=(edtValue)*0.0106095679;

        STS192signal=(edtValue)*0.002652392;

        STM1signal=(edtValue)*0.1697530864;

        STM4signal=(edtValue)*0.0424382716;

        STM16signal=(edtValue)*0.0106095679;

        STM64signal=(edtValue)*0.002652392;

    }

    private void SCSILVDUltra160() {
        bitpersecond=(edtValue)*1280000000;

        bytepersecond=(edtValue)*160000000;

        kilobitpersecondSI=(edtValue)*1280000;

        kilobytepersecondSI=(edtValue)*160000;

        kilobitpersecond=(edtValue)*1250000;

        kilobytepersecond=(edtValue)*156250;

        megabitpersecondSI=(edtValue)*1280;

        megabytepersecondSI=(edtValue)*160;

        megabitpersecond=(edtValue)*1220.703125;

        megabytepersecond=(edtValue)*152.58789062;

        gigabitpersecondSI=(edtValue)*1.28;

        gigabytepersecondSI=(edtValue)*0.16;

        gigabitpersecond=(edtValue)*1.1920928955;

        gigabytepersecond=(edtValue)*0.1490116119;

        terabitpersecondSI=(edtValue)*0.00128;

        terabytepersecondSI=(edtValue)*0.00016;

        terabitpersecond=(edtValue)*0.0011641532;

        terabytepersecond=(edtValue)*0.0001455192;

        ethernet=(edtValue)*128;

        ethernetfast=(edtValue)*12.8;

        ethernetgigabit=(edtValue)*1.28;

        OC1=(edtValue)*24.691358025;

        OC3=(edtValue)*8.2304526749;

        OC12=(edtValue)*2.0576131687;

        OC24=(edtValue)*1.0288065844;

        OC48=(edtValue)*0.5144032922;

        OC192=(edtValue)*0.128600823;

        OC768=(edtValue)*0.0321502058;

        ISDNsinglechannel=(edtValue)*20000;

        ISDNdualchannel=(edtValue)*10000;

        modem110=(edtValue)*11636363.636;

        modem300=(edtValue)*4266666.6667;

        modem1200=(edtValue)*1066666.6667;

        modem2400=(edtValue)*533333.33333;

        modem9600=(edtValue)*133333.33333;

        modem14k=(edtValue)*88888.888889;

        modem28k=(edtValue)*44444.444444;

        modem33k=(edtValue)*38095.238095;

        modem56k=(edtValue)*22857.142857;

        SCSIAsync=(edtValue)*106.66666667;

        SCSISync=(edtValue)*32;

        SCSIFast=(edtValue)*16;

        SCSIFastUltra=(edtValue)*8;


        SCSIFastWide=(edtValue)*8;

        SCSIFastUltraWide=(edtValue)*4;

        SCSIUltra2=(edtValue)*2;

        SCSIUltra3=(edtValue)*1;

        SCSILVDUltra80=(edtValue)*2;


        SCSILVDUltra160=(edtValue)*1;

        IDEPIOmode0=(edtValue)*48.484848485;

        IDEPIOmode1=(edtValue)*30.769230769;

        IDEPIOmode2=(edtValue)*19.277108434;

        IDEPIOmode3=(edtValue)*14.414414414;

        IDEPIOmode4=(edtValue)*9.6385542169                                                      ;

        IDEDMAmode0=(edtValue)*38.095238095;

        IDEDMAmode1=(edtValue)*12.030075188;

        IDEDMAmode2=(edtValue)*9.6385542169;

        IDEUDMAmode0=(edtValue)*9.6385542169;

        IDEUDMAmode1=(edtValue)*6.4;

        IDEUDMAmode2=(edtValue)*4.8484848485;

        IDEUDMAmode3=(edtValue)*3.2;

        IDEUDMAmode4=(edtValue)*2.4242424242;

        IDEUDMA33=(edtValue)*4.8484848485;

        IDEUDMA66=(edtValue)*2.4242424242;

        USB=(edtValue)*106.66666667;

        firewire=(edtValue)*3.2;

        T0payload=(edtValue)*22857.142857;

        T0B8ZSpayload=(edtValue)*20000;

        T1signal=(edtValue)*829.01554404;

        T1payload=(edtValue)*952.38095238;

        T1Zpayload=(edtValue)*829.01554404;

        T1Csignal=(edtValue)*406.09137056;

        T1Cpayload=(edtValue)*476.19047619;

        T2signal=(edtValue)*202.78833967;

        T3signal=(edtValue)*28.61230329;

        T3payload=(edtValue)*34.013605442;

        T3Zpayload=(edtValue)*29.761904762;

        T4signal=(edtValue)*4.6685340803;

        EPTA1signal=(edtValue)*625;

        EPTA1payload=(edtValue)*666.66666667;

        EPTA2signal=(edtValue)*151.51515152;

        EPTA2payload=(edtValue)*166.66666667;

        EPTA3signal=(edtValue)*37.243947858;

        EPTA3payload=(edtValue)*41.666666667;

        H0=(edtValue)*3333.3333333;

        H11=(edtValue)*833.33333333;

        H12=(edtValue)*666.66666667;

        VirtualTributary1signal=(edtValue)*740.74074074;

        VirtualTributary1payload=(edtValue)*829.01554404;

        VirtualTributary2signal=(edtValue)*555.55555556;

        VirtualTributary2payload=(edtValue)*625;

        VirtualTributary6signal=(edtValue)*202.78833967;

        VirtualTributary6payload=(edtValue)*213.33333333;

        STS1signal=(edtValue)*24.691358025;

        STS1payload=(edtValue)*25.858585859;

        STS3signal=(edtValue)*8.2304526749;

        STS3payload=(edtValue)*8.5142613878;

        STS3csignal=(edtValue)*8.2304526749;

        STS3cpayload=(edtValue)*8.5142613878;

        STS12signal=(edtValue)*2.0576131687;

        STS24signal=(edtValue)*1.0288065844;

        STS48signal=(edtValue)*0.5144032922;

        STS192signal=(edtValue)*0.128600823;

        STM1signal=(edtValue)*8.2304526749;

        STM4signal=(edtValue)*2.0576131687;

        STM16signal=(edtValue)*0.5144032922;

        STM64signal=(edtValue)*0.128600823;

    }

    private void SCSILVDUltra80() {
        bitpersecond=(edtValue)*640000000;

        bytepersecond=(edtValue)*80000000;

        kilobitpersecondSI=(edtValue)*640000;

        kilobytepersecondSI=(edtValue)*80000;

        kilobitpersecond=(edtValue)*625000;

        kilobytepersecond=(edtValue)*78125;

        megabitpersecondSI=(edtValue)*640;

        megabytepersecondSI=(edtValue)*80;

        megabitpersecond=(edtValue)*610.3515625;

        megabytepersecond=(edtValue)*76.293945312;

        gigabitpersecondSI=(edtValue)*0.64;

        gigabytepersecondSI=(edtValue)*0.08;

        gigabitpersecond=(edtValue)*0.5960464478;

        gigabytepersecond=(edtValue)*0.074505806;

        terabitpersecondSI=(edtValue)*0.00064;

        terabytepersecondSI=(edtValue)*0.00008;

        terabitpersecond=(edtValue)*0.0005820766;

        terabytepersecond=(edtValue)*0.0000727596;

        ethernet=(edtValue)*64;

        ethernetfast=(edtValue)*6.4;

        ethernetgigabit=(edtValue)*0.64;

        OC1=(edtValue)*12.345679012;

        OC3=(edtValue)*4.1152263374;

        OC12=(edtValue)*1.0288065844;

        OC24=(edtValue)*0.5144032922;

        OC48=(edtValue)*0.2572016461;

        OC192=(edtValue)*0.0643004115;

        OC768=(edtValue)*0.0160751029;

        ISDNsinglechannel=(edtValue)*10000;

        ISDNdualchannel=(edtValue)*5000;

        modem110=(edtValue)*5818181.8182;

        modem300=(edtValue)*2133333.3333;

        modem1200=(edtValue)*533333.33333;

        modem2400=(edtValue)*266666.66667;

        modem9600=(edtValue)*66666.666667;

        modem14k=(edtValue)*44444.444444;

        modem28k=(edtValue)*22222.222222;

        modem33k=(edtValue)*19047.619048;

        modem56k=(edtValue)*11428.571429;

        SCSIAsync=(edtValue)*53.333333333;

        SCSISync=(edtValue)*16;

        SCSIFast=(edtValue)*8;

        SCSIFastUltra=(edtValue)*4;

        SCSIFastWide=(edtValue)*4;

        SCSIFastUltraWide=(edtValue)*2;

        SCSIUltra2=(edtValue)*1;

        SCSIUltra3=(edtValue)*0.5;

        SCSILVDUltra80=(edtValue)*1;


        SCSILVDUltra160=(edtValue)*0.5;

        IDEPIOmode0=(edtValue)*24.242424242;

        IDEPIOmode1=(edtValue)*15.384615385;

        IDEPIOmode2=(edtValue)*9.6385542169;

        IDEPIOmode3=(edtValue)*7.2072072072;

        IDEPIOmode4=(edtValue)*4.8192771084;

        IDEDMAmode0=(edtValue)*19.047619048;

        IDEDMAmode1=(edtValue)*6.015037594;

        IDEDMAmode2=(edtValue)*4.8192771084;

        IDEUDMAmode0=(edtValue)*4.8192771084;

        IDEUDMAmode1=(edtValue)*3.2;

        IDEUDMAmode2=(edtValue)*2.4242424242;

        IDEUDMAmode3=(edtValue)*1.6;

        IDEUDMAmode4=(edtValue)*1.2121212121;

        IDEUDMA33=(edtValue)*2.4242424242;

        IDEUDMA66=(edtValue)*1.2121212121;

        USB=(edtValue)*53.333333333;

        firewire=(edtValue)*1.6;

        T0payload=(edtValue)*11428.571429;

        T0B8ZSpayload=(edtValue)*10000;

        T1signal=(edtValue)*414.50777202;

        T1payload=(edtValue)*476.19047619;

        T1Zpayload=(edtValue)*414.50777202;

        T1Csignal=(edtValue)*203.04568528;

        T1Cpayload=(edtValue)*238.0952381;

        T2signal=(edtValue)*101.39416984;

        T3signal=(edtValue)*14.306151645;

        T3payload=(edtValue)*17.006802721;

        T3Zpayload=(edtValue)*14.880952381;

        T4signal=(edtValue)*2.3342670401;

        EPTA1signal=(edtValue)*312.5;

        EPTA1payload=(edtValue)*333.33333333;

        EPTA2signal=(edtValue)*75.757575758;

        EPTA2payload=(edtValue)*83.333333333;

        EPTA3signal=(edtValue)*18.621973929;

        EPTA3payload=(edtValue)*20.833333333;

        H0=(edtValue)*1666.6666667;

        H11=(edtValue)*416.66666667;

        H12=(edtValue)*333.33333333;

        VirtualTributary1signal=(edtValue)*370.37037037;

        VirtualTributary1payload=(edtValue)*414.50777202;

        VirtualTributary2signal=(edtValue)*277.77777778;

        VirtualTributary2payload=(edtValue)*312.5;

        VirtualTributary6signal=(edtValue)*101.39416984;

        VirtualTributary6payload=(edtValue)*106.66666667;

        STS1signal=(edtValue)*12.345679012;

        STS1payload=(edtValue)*12.929292929;

        STS3signal=(edtValue)*4.1152263374;

        STS3payload=(edtValue)*4.2571306939;

        STS3csignal=(edtValue)*4.1152263374;

        STS3cpayload=(edtValue)*4.2571306939;

        STS12signal=(edtValue)*1.0288065844;

        STS24signal=(edtValue)*0.5144032922;

        STS48signal=(edtValue)*0.2572016461;

        STS192signal=(edtValue)*0.0643004115;

        STM1signal=(edtValue)*4.1152263374;

        STM4signal=(edtValue)*1.0288065844;

        STM16signal=(edtValue)*0.2572016461;

        STM64signal=(edtValue)*0.0643004115;

    }

    private void SCSIUltra3() {
        bitpersecond=(edtValue)*1280000000;

        bytepersecond=(edtValue)*160000000;

        kilobitpersecondSI=(edtValue)*1280000;

        kilobytepersecondSI=(edtValue)*160000;

        kilobitpersecond=(edtValue)*1250000;

        kilobytepersecond=(edtValue)*156250;

        megabitpersecondSI=(edtValue)*1280;

        megabytepersecondSI=(edtValue)*160;

        megabitpersecond=(edtValue)*1220.703125;

        megabytepersecond=(edtValue)*152.58789062;

        gigabitpersecondSI=(edtValue)*1.28;

        gigabytepersecondSI=(edtValue)*0.16;

        gigabitpersecond=(edtValue)*1.1920928955;

        gigabytepersecond=(edtValue)*0.1490116119;

        terabitpersecondSI=(edtValue)*0.00128;

        terabytepersecondSI=(edtValue)*0.00016;

        terabitpersecond=(edtValue)*0.0011641532;

        terabytepersecond=(edtValue)*0.0001455192;

        ethernet=(edtValue)*128;

        ethernetfast=(edtValue)*12.8;

        ethernetgigabit=(edtValue)*1.28;

        OC1=(edtValue)*24.691358025;

        OC3=(edtValue)*8.2304526749;

        OC12=(edtValue)*2.0576131687;

        OC24=(edtValue)*1.0288065844;

        OC48=(edtValue)*0.5144032922;

        OC192=(edtValue)*0.128600823;

        OC768=(edtValue)*0.0321502058;

        ISDNsinglechannel=(edtValue)*20000;

        ISDNdualchannel=(edtValue)*10000;

        modem110=(edtValue)*11636363.636;

        modem300=(edtValue)*4266666.6667;

        modem1200=(edtValue)*1066666.6667;

        modem2400=(edtValue)*533333.33333;

        modem9600=(edtValue)*133333.33333;

        modem14k=(edtValue)*88888.888889;

        modem28k=(edtValue)*44444.444444;

        modem33k=(edtValue)*38095.238095;

        modem56k=(edtValue)*22857.142857;

        SCSIAsync=(edtValue)*106.66666667;

        SCSISync=(edtValue)*32;

        SCSIFast=(edtValue)*16;

        SCSIFastUltra=(edtValue)*8;


        SCSIFastWide=(edtValue)*8;

        SCSIFastUltraWide=(edtValue)*4;

        SCSIUltra2=(edtValue)*2;

        SCSIUltra3=(edtValue)*1;

        SCSILVDUltra80=(edtValue)*2;


        SCSILVDUltra160=(edtValue)*1;

        IDEPIOmode0=(edtValue)*48.484848485;

        IDEPIOmode1=(edtValue)*30.769230769;

        IDEPIOmode2=(edtValue)*19.277108434;

        IDEPIOmode3=(edtValue)*14.414414414;

        IDEPIOmode4=(edtValue)*9.6385542169;

        IDEDMAmode0=(edtValue)*38.095238095;

        IDEDMAmode1=(edtValue)*12.030075188;

        IDEDMAmode2=(edtValue)*9.6385542169;

        IDEUDMAmode0=(edtValue)*9.6385542169;

        IDEUDMAmode1=(edtValue)*6.4;

        IDEUDMAmode2=(edtValue)*4.8484848485;

        IDEUDMAmode3=(edtValue)*3.2;

        IDEUDMAmode4=(edtValue)*2.4242424242;

        IDEUDMA33=(edtValue)*4.8484848485;

        IDEUDMA66=(edtValue)*2.4242424242;

        USB=(edtValue)*106.66666667;

        firewire=(edtValue)*3.2;

        T0payload=(edtValue)*22857.142857;

        T0B8ZSpayload=(edtValue)*20000;

        T1signal=(edtValue)*829.01554404;

        T1payload=(edtValue)*952.38095238;

        T1Zpayload=(edtValue)*829.01554404;

        T1Csignal=(edtValue)*406.09137056;

        T1Cpayload=(edtValue)*476.19047619;

        T2signal=(edtValue)*202.78833967;

        T3signal=(edtValue)*28.61230329;

        T3payload=(edtValue)*34.013605442;

        T3Zpayload=(edtValue)*29.761904762;

        T4signal=(edtValue)*4.6685340803;

        EPTA1signal=(edtValue)*625;

        EPTA1payload=(edtValue)*666.66666667;

        EPTA2signal=(edtValue)*151.51515152;

        EPTA2payload=(edtValue)*166.66666667;

        EPTA3signal=(edtValue)*37.243947858;

        EPTA3payload=(edtValue)*41.666666667;

        H0=(edtValue)*3333.3333333;

        H11=(edtValue)*833.33333333;

        H12=(edtValue)*666.66666667;

        VirtualTributary1signal=(edtValue)*740.74074074;

        VirtualTributary1payload=(edtValue)*829.01554404;

        VirtualTributary2signal=(edtValue)*555.55555556;

        VirtualTributary2payload=(edtValue)*625;

        VirtualTributary6signal=(edtValue)*202.78833967;

        VirtualTributary6payload=(edtValue)*213.33333333;

        STS1signal=(edtValue)*24.691358025;

        STS1payload=(edtValue)*25.858585859;

        STS3signal=(edtValue)*8.2304526749;

        STS3payload=(edtValue)*8.5142613878;

        STS3csignal=(edtValue)*8.2304526749;

        STS3cpayload=(edtValue)*8.5142613878;

        STS12signal=(edtValue)*2.0576131687;

        STS24signal=(edtValue)*1.0288065844;

        STS48signal=(edtValue)*0.5144032922;

        STS192signal=(edtValue)*0.128600823;

        STM1signal=(edtValue)*8.2304526749;

        STM4signal=(edtValue)*2.0576131687;

        STM16signal=(edtValue)*0.5144032922;

        STM64signal=(edtValue)*0.128600823;

    }

    private void SCSIUltra2() {
        bitpersecond=(edtValue)*640000000;

        bytepersecond=(edtValue)*80000000;

        kilobitpersecondSI=(edtValue)*640000;

        kilobytepersecondSI=(edtValue)*80000;

        kilobitpersecond=(edtValue)*625000;

        kilobytepersecond=(edtValue)*78125;

        megabitpersecondSI=(edtValue)*640;

        megabytepersecondSI=(edtValue)*80;

        megabitpersecond=(edtValue)*610.3515625;

        megabytepersecond=(edtValue)*76.293945312;

        gigabitpersecondSI=(edtValue)*0.64;

        gigabytepersecondSI=(edtValue)*0.08;

        gigabitpersecond=(edtValue)*0.5960464478;

        gigabytepersecond=(edtValue)*0.074505806;

        terabitpersecondSI=(edtValue)*0.00064;

        terabytepersecondSI=(edtValue)*0.00008;

        terabitpersecond=(edtValue)*0.0005820766;

        terabytepersecond=(edtValue)*0.0000727596;

        ethernet=(edtValue)*64;

        ethernetfast=(edtValue)*6.4;

        ethernetgigabit=(edtValue)*0.64;

        OC1=(edtValue)*12.345679012;

        OC3=(edtValue)*4.1152263374;

        OC12=(edtValue)*1.0288065844;

        OC24=(edtValue)*0.5144032922;

        OC48=(edtValue)*0.2572016461;

        OC192=(edtValue)*0.0643004115;

        OC768=(edtValue)*0.0160751029;

        ISDNsinglechannel=(edtValue)*10000;

        ISDNdualchannel=(edtValue)*5000;

        modem110=(edtValue)*5818181.8182;

        modem300=(edtValue)*2133333.3333;

        modem1200=(edtValue)*533333.33333;

        modem2400=(edtValue)*266666.66667;

        modem9600=(edtValue)*66666.666667;

        modem14k=(edtValue)*44444.444444;

        modem28k=(edtValue)*22222.222222;

        modem33k=(edtValue)*19047.619048;

        modem56k=(edtValue)*11428.571429;

        SCSIAsync=(edtValue)*53.333333333;

        SCSISync=(edtValue)*16;

        SCSIFast=(edtValue)*8;

        SCSIFastUltra=(edtValue)*4;


        SCSIFastWide=(edtValue)*4;

        SCSIFastUltraWide=(edtValue)*2;

        SCSIUltra2=(edtValue)*1;

        SCSIUltra3=(edtValue)*0.5;

        SCSILVDUltra80=(edtValue)*1;


        SCSILVDUltra160=(edtValue)*0.5;

        IDEPIOmode0=(edtValue)*24.242424242;

        IDEPIOmode1=(edtValue)*15.384615385;

        IDEPIOmode2=(edtValue)*9.6385542169;

        IDEPIOmode3=(edtValue)*7.2072072072;

        IDEPIOmode4=(edtValue)*4.8192771084;

        IDEDMAmode0=(edtValue)*19.047619048;

        IDEDMAmode1=(edtValue)*6.015037594;

        IDEDMAmode2=(edtValue)*4.8192771084;

        IDEUDMAmode0=(edtValue)*4.8192771084;

        IDEUDMAmode1=(edtValue)*3.2;

        IDEUDMAmode2=(edtValue)*2.4242424242;

        IDEUDMAmode3=(edtValue)*1.6;

        IDEUDMAmode4=(edtValue)*1.2121212121;

        IDEUDMA33=(edtValue)*2.4242424242;

        IDEUDMA66=(edtValue)*1.2121212121;

        USB=(edtValue)*53.333333333;

        firewire=(edtValue)*1.6;

        T0payload=(edtValue)*11428.571429;

        T0B8ZSpayload=(edtValue)*10000;

        T1signal=(edtValue)*414.50777202;

        T1payload=(edtValue)*476.19047619;

        T1Zpayload=(edtValue)*414.50777202;

        T1Csignal=(edtValue)*203.04568528;

        T1Cpayload=(edtValue)*238.0952381;

        T2signal=(edtValue)*101.39416984;

        T3signal=(edtValue)*14.306151645;

        T3payload=(edtValue)*17.006802721;

        T3Zpayload=(edtValue)*14.880952381;

        T4signal=(edtValue)*2.3342670401;

        EPTA1signal=(edtValue)*312.5;

        EPTA1payload=(edtValue)*333.33333333;

        EPTA2signal=(edtValue)*75.757575758;

        EPTA2payload=(edtValue)*83.333333333;

        EPTA3signal=(edtValue)*18.621973929;

        EPTA3payload=(edtValue)*20.833333333;

        H0=(edtValue)*1666.6666667;

        H11=(edtValue)*416.66666667;

        H12=(edtValue)*333.33333333;

        VirtualTributary1signal=(edtValue)*370.37037037;

        VirtualTributary1payload=(edtValue)*414.50777202;

        VirtualTributary2signal=(edtValue)*277.77777778;

        VirtualTributary2payload=(edtValue)*312.5;

        VirtualTributary6signal=(edtValue)*101.39416984;

        VirtualTributary6payload=(edtValue)*106.66666667;

        STS1signal=(edtValue)*12.345679012;

        STS1payload=(edtValue)*12.929292929;

        STS3signal=(edtValue)*4.1152263374;

        STS3payload=(edtValue)*4.2571306939;

        STS3csignal=(edtValue)*4.1152263374;

        STS3cpayload=(edtValue)*4.2571306939;

        STS12signal=(edtValue)*1.0288065844;

        STS24signal=(edtValue)*0.5144032922;

        STS48signal=(edtValue)*0.2572016461;

        STS192signal=(edtValue)*0.0643004115;

        STM1signal=(edtValue)*4.1152263374;

        STM4signal=(edtValue)*1.0288065844;

        STM16signal=(edtValue)*0.2572016461;

        STM64signal=(edtValue)*0.0643004115;

    }

    private void SCSIFastUltraWide() {
        bitpersecond=(edtValue)*320000000;

        bytepersecond=(edtValue)*40000000;

        kilobitpersecondSI=(edtValue)*320000;

        kilobytepersecondSI=(edtValue)*40000;

        kilobitpersecond=(edtValue)*312500;

        kilobytepersecond=(edtValue)*39062.5;

        megabitpersecondSI=(edtValue)*320;

        megabytepersecondSI=(edtValue)*40;

        megabitpersecond=(edtValue)*305.17578125;

        megabytepersecond=(edtValue)*38.146972656;

        gigabitpersecondSI=(edtValue)*0.32;

        gigabytepersecondSI=(edtValue)*0.04;

        gigabitpersecond=(edtValue)*0.2980232239;

        gigabytepersecond=(edtValue)*0.037252903;

        terabitpersecondSI=(edtValue)*0.00032;

        terabytepersecondSI=(edtValue)*0.00004;

        terabitpersecond=(edtValue)*0.0002910383;

        terabytepersecond=(edtValue)*0.0000363798;

        ethernet=(edtValue)*32;

        ethernetfast=(edtValue)*3.2;

        ethernetgigabit=(edtValue)*0.32;

        OC1=(edtValue)*6.1728395062;

        OC3=(edtValue)*2.0576131687;

        OC12=(edtValue)*0.5144032922;

        OC24=(edtValue)*0.2572016461;

        OC48=(edtValue)*0.128600823;

        OC192=(edtValue)*0.0321502058;

        OC768=(edtValue)*0.0080375514;

        ISDNsinglechannel=(edtValue)*5000;

        ISDNdualchannel=(edtValue)*2500;

        modem110=(edtValue)*2909090.9091;

        modem300=(edtValue)*1066666.6667;

        modem1200=(edtValue)*266666.66667;

        modem2400=(edtValue)*133333.33333;

        modem9600=(edtValue)*33333.333333;

        modem14k=(edtValue)*22222.222222;

        modem28k=(edtValue)*11111.111111;

        modem33k=(edtValue)*9523.8095238;

        modem56k=(edtValue)*5714.2857143;

        SCSIAsync=(edtValue)*26.666666667;

        SCSISync=(edtValue)*8;

        SCSIFast=(edtValue)*4;

        SCSIFastUltra=(edtValue)*2;


        SCSIFastWide=(edtValue)*2;

        SCSIFastUltraWide=(edtValue)*1;

        SCSIUltra2=(edtValue)*0.5;

        SCSIUltra3=(edtValue)*0.25;

        SCSILVDUltra80=(edtValue)*0.5;


        SCSILVDUltra160=(edtValue)*0.25;

        IDEPIOmode0=(edtValue)*12.121212121;

        IDEPIOmode1=(edtValue)*7.6923076923;

        IDEPIOmode2=(edtValue)*4.8192771084;

        IDEPIOmode3=(edtValue)*3.6036036036;

        IDEPIOmode4=(edtValue)*2.4096385542;

        IDEDMAmode0=(edtValue)*9.5238095238;

        IDEDMAmode1=(edtValue)*3.007518797;

        IDEDMAmode2=(edtValue)*2.4096385542;

        IDEUDMAmode0=(edtValue)*2.4096385542;

        IDEUDMAmode1=(edtValue)*1.6;

        IDEUDMAmode2=(edtValue)*1.2121212121;

        IDEUDMAmode3=(edtValue)*0.8;

        IDEUDMAmode4=(edtValue)*0.6060606061;

        IDEUDMA33=(edtValue)*1.2121212121;

        IDEUDMA66=(edtValue)*0.6060606061;

        USB=(edtValue)*26.666666667;

        firewire=(edtValue)*0.8;

        T0payload=(edtValue)*5714.2857143;

        T0B8ZSpayload=(edtValue)*5000;

        T1signal=(edtValue)*207.25388601;

        T1payload=(edtValue)*238.0952381;

        T1Zpayload=(edtValue)*207.25388601;

        T1Csignal=(edtValue)*101.52284264;

        T1Cpayload=(edtValue)*119.04761905;

        T2signal=(edtValue)*50.697084918;

        T3signal=(edtValue)*7.1530758226;

        T3payload=(edtValue)*8.5034013605;

        T3Zpayload=(edtValue)*7.4404761905;

        T4signal=(edtValue)*1.1671335201;

        EPTA1signal=(edtValue)*156.25;

        EPTA1payload=(edtValue)*166.66666667;

        EPTA2signal=(edtValue)*37.878787879;

        EPTA2payload=(edtValue)*41.666666667;

        EPTA3signal=(edtValue)*9.3109869646;

        EPTA3payload=(edtValue)*10.416666667;

        H0=(edtValue)*833.33333333;

        H11=(edtValue)*208.33333333;

        H12=(edtValue)*166.66666667;

        VirtualTributary1signal=(edtValue)*185.18518519;

        VirtualTributary1payload=(edtValue)*207.25388601;

        VirtualTributary2signal=(edtValue)*138.88888889;

        VirtualTributary2payload=(edtValue)*156.25;

        VirtualTributary6signal=(edtValue)*50.697084918;

        VirtualTributary6payload=(edtValue)*53.333333333;

        STS1signal=(edtValue)*6.1728395062;

        STS1payload=(edtValue)*6.4646464646;

        STS3signal=(edtValue)*2.0576131687;

        STS3payload=(edtValue)*2.128565347;

        STS3csignal=(edtValue)*2.0576131687;

        STS3cpayload=(edtValue)*2.128565347;

        STS12signal=(edtValue)*0.5144032922;

        STS24signal=(edtValue)*0.2572016461;

        STS48signal=(edtValue)*0.128600823;

        STS192signal=(edtValue)*0.0321502058;

        STM1signal=(edtValue)*2.0576131687;

        STM4signal=(edtValue)*0.5144032922;

        STM16signal=(edtValue)*0.128600823;

        STM64signal=(edtValue)*0.0321502058;

    }

    private void SCSIFastWide() {
        bitpersecond=(edtValue)*160000000;

        bytepersecond=(edtValue)*20000000;

        kilobitpersecondSI=(edtValue)*160000;

        kilobytepersecondSI=(edtValue)*20000;

        kilobitpersecond=(edtValue)*156250;

        kilobytepersecond=(edtValue)*19531.25;

        megabitpersecondSI=(edtValue)*160;

        megabytepersecondSI=(edtValue)*20;

        megabitpersecond=(edtValue)*152.58789063;

        megabytepersecond=(edtValue)*19.073486328;

        gigabitpersecondSI=(edtValue)*0.16;

        gigabytepersecondSI=(edtValue)*0.02;

        gigabitpersecond=(edtValue)*0.1490116119;

        gigabytepersecond=(edtValue)*0.0186264515;

        terabitpersecondSI=(edtValue)*0.00016;

        terabytepersecondSI=(edtValue)*0.00002;

        terabitpersecond=(edtValue)*0.0001455192;

        terabytepersecond=(edtValue)*0.0000181899;

        ethernet=(edtValue)*16;

        ethernetfast=(edtValue)*1.6;

        ethernetgigabit=(edtValue)*0.16;

        OC1=(edtValue)*3.0864197531;

        OC3=(edtValue)*1.0288065844;

        OC12=(edtValue)*0.2572016461;

        OC24=(edtValue)*0.128600823;

        OC48=(edtValue)*0.0643004115;

        OC192=(edtValue)*0.0160751029;

        OC768=(edtValue)*0.0040187757;

        ISDNsinglechannel=(edtValue)*2500;

        ISDNdualchannel=(edtValue)*1250;

        modem110=(edtValue)*1454545.4545;

        modem300=(edtValue)*533333.33333;

        modem1200=(edtValue)*133333.33333;

        modem2400=(edtValue)*66666.666667;

        modem9600=(edtValue)*16666.666667;

        modem14k=(edtValue)*11111.111111;

        modem28k=(edtValue)*5555.5555556;

        modem33k=(edtValue)*4761.9047619;

        modem56k=(edtValue)*2857.1428571;

        SCSIAsync=(edtValue)*13.333333333;

        SCSISync=(edtValue)*4;

        SCSIFast=(edtValue)*2;

        SCSIFastUltra=(edtValue)*1;


        SCSIFastWide=(edtValue)*1;

        SCSIFastUltraWide=(edtValue)*0.5;

        SCSIUltra2=(edtValue)*0.25;

        SCSIUltra3=(edtValue)*0.125;

        SCSILVDUltra80=(edtValue)*0.25;


        SCSILVDUltra160=(edtValue)*0.125;

        IDEPIOmode0=(edtValue)*6.0606060606;

        IDEPIOmode1=(edtValue)*3.8461538462;

        IDEPIOmode2=(edtValue)*2.4096385542;

        IDEPIOmode3=(edtValue)*1.8018018018;

        IDEPIOmode4=(edtValue)*1.2048192771;

        IDEDMAmode0=(edtValue)*4.7619047619;

        IDEDMAmode1=(edtValue)*1.5037593985;

        IDEDMAmode2=(edtValue)*1.2048192771;

        IDEUDMAmode0=(edtValue)*1.2048192771;

        IDEUDMAmode1=(edtValue)*0.8;

        IDEUDMAmode2=(edtValue)*0.6060606061;

        IDEUDMAmode3=(edtValue)*0.4;

        IDEUDMAmode4=(edtValue)*0.303030303;

        IDEUDMA33=(edtValue)*0.6060606061;

        IDEUDMA66=(edtValue)*0.303030303;

        USB=(edtValue)*13.333333333;

        firewire=(edtValue)*0.4;

        T0payload=(edtValue)*2857.1428571;

        T0B8ZSpayload=(edtValue)*2500;

        T1signal=(edtValue)*103.62694301;

        T1payload=(edtValue)*119.04761905;

        T1Zpayload=(edtValue)*103.62694301;

        T1Csignal=(edtValue)*50.76142132;

        T1Cpayload=(edtValue)*59.523809524;

        T2signal=(edtValue)*25.348542459;

        T3signal=(edtValue)*3.5765379113;

        T3payload=(edtValue)*4.2517006803;

        T3Zpayload=(edtValue)*3.7202380952;

        T4signal=(edtValue)*0.58356676;

        EPTA1signal=(edtValue)*78.125;

        EPTA1payload=(edtValue)*83.333333333;

        EPTA2signal=(edtValue)*18.939393939;

        EPTA2payload=(edtValue)*20.833333333;

        EPTA3signal=(edtValue)*4.6554934823;

        EPTA3payload=(edtValue)*5.2083333333;

        H0=(edtValue)*416.66666667;

        H11=(edtValue)*104.16666667;

        H12=(edtValue)*83.333333333;

        VirtualTributary1signal=(edtValue)*92.592592593;

        VirtualTributary1payload=(edtValue)*103.62694301;

        VirtualTributary2signal=(edtValue)*69.444444444;

        VirtualTributary2payload=(edtValue)*78.125;

        VirtualTributary6signal=(edtValue)*25.348542459;

        VirtualTributary6payload=(edtValue)*26.666666667;

        STS1signal=(edtValue)*3.0864197531;

        STS1payload=(edtValue)*3.2323232323;

        STS3signal=(edtValue)*1.0288065844;

        STS3payload=(edtValue)*1.0642826735;

        STS3csignal=(edtValue)*1.0288065844;

        STS3cpayload=(edtValue)*1.0642826735;

        STS12signal=(edtValue)*0.2572016461;

        STS24signal=(edtValue)*0.128600823;

        STS48signal=(edtValue)*0.0643004115;

        STS192signal=(edtValue)*0.0160751029;

        STM1signal=(edtValue)*1.0288065844;

        STM4signal=(edtValue)*0.2572016461;

        STM16signal=(edtValue)*0.0643004115;

        STM64signal=(edtValue)*0.0160751029;

    }

    private void SCSIFastUltra() {
        bitpersecond=(edtValue)*160000000;

        bytepersecond=(edtValue)*20000000;

        kilobitpersecondSI=(edtValue)*160000;

        kilobytepersecondSI=(edtValue)*20000;

        kilobitpersecond=(edtValue)*156250;

        kilobytepersecond=(edtValue)*19531.25;

        megabitpersecondSI=(edtValue)*160;

        megabytepersecondSI=(edtValue)*20;

        megabitpersecond=(edtValue)*152.58789063;

        megabytepersecond=(edtValue)*19.073486328;

        gigabitpersecondSI=(edtValue)*0.16;

        gigabytepersecondSI=(edtValue)*0.02;

        gigabitpersecond=(edtValue)*0.1490116119;

        gigabytepersecond=(edtValue)*0.0186264515;

        terabitpersecondSI=(edtValue)*0.00016;

        terabytepersecondSI=(edtValue)*0.00002;

        terabitpersecond=(edtValue)*0.0001455192;

        terabytepersecond=(edtValue)*0.0000181899;

        ethernet=(edtValue)*16;

        ethernetfast=(edtValue)*1.6;

        ethernetgigabit=(edtValue)*0.16;

        OC1=(edtValue)*3.0864197531;

        OC3=(edtValue)*1.0288065844;

        OC12=(edtValue)*0.2572016461;

        OC24=(edtValue)*0.128600823;

        OC48=(edtValue)*0.0643004115;

        OC192=(edtValue)*0.0160751029;

        OC768=(edtValue)*0.0040187757;

        ISDNsinglechannel=(edtValue)*2500;

        ISDNdualchannel=(edtValue)*1250;

        modem110=(edtValue)*1454545.4545;

        modem300=(edtValue)*533333.33333;

        modem1200=(edtValue)*133333.33333;

        modem2400=(edtValue)*66666.666667;

        modem9600=(edtValue)*16666.666667;

        modem14k=(edtValue)*11111.111111;

        modem28k=(edtValue)*5555.5555556;

        modem33k=(edtValue)*4761.9047619;

        modem56k=(edtValue)*2857.1428571;

        SCSIAsync=(edtValue)*13.333333333;

        SCSISync=(edtValue)*4;

        SCSIFast=(edtValue)*2;

        SCSIFastUltra=(edtValue)*1;


        SCSIFastWide=(edtValue)*1;

        SCSIFastUltraWide=(edtValue)*0.5;

        SCSIUltra2=(edtValue)*0.25;

        SCSIUltra3=(edtValue)*0.125;

        SCSILVDUltra80=(edtValue)*0.25;


        SCSILVDUltra160=(edtValue)*0.125;

        IDEPIOmode0=(edtValue)*6.0606060606;

        IDEPIOmode1=(edtValue)*3.8461538462;

        IDEPIOmode2=(edtValue)*2.4096385542;

        IDEPIOmode3=(edtValue)*1.8018018018;

        IDEPIOmode4=(edtValue)*1.2048192771;

        IDEDMAmode0=(edtValue)*4.7619047619;

        IDEDMAmode1=(edtValue)*1.5037593985;

        IDEDMAmode2=(edtValue)*1.2048192771;

        IDEUDMAmode0=(edtValue)*1.2048192771;

        IDEUDMAmode1=(edtValue)*0.8;

        IDEUDMAmode2=(edtValue)*0.6060606061;

        IDEUDMAmode3=(edtValue)*0.4;

        IDEUDMAmode4=(edtValue)*0.303030303;

        IDEUDMA33=(edtValue)*0.6060606061;

        IDEUDMA66=(edtValue)*0.303030303;

        USB=(edtValue)*13.333333333;

        firewire=(edtValue)*0.4;

        T0payload=(edtValue)*2857.1428571;

        T0B8ZSpayload=(edtValue)*2500;

        T1signal=(edtValue)*103.62694301;

        T1payload=(edtValue)*119.04761905;

        T1Zpayload=(edtValue)*103.62694301;

        T1Csignal=(edtValue)*50.76142132;

        T1Cpayload=(edtValue)*59.523809524;

        T2signal=(edtValue)*25.348542459;

        T3signal=(edtValue)*3.5765379113;

        T3payload=(edtValue)*4.2517006803;

        T3Zpayload=(edtValue)*3.7202380952;

        T4signal=(edtValue)*0.58356676;

        EPTA1signal=(edtValue)*78.125;

        EPTA1payload=(edtValue)*83.333333333;

        EPTA2signal=(edtValue)*18.939393939;

        EPTA2payload=(edtValue)*20.833333333;

        EPTA3signal=(edtValue)*4.6554934823;

        EPTA3payload=(edtValue)*5.2083333333;

        H0=(edtValue)*416.66666667;

        H11=(edtValue)*104.16666667;

        H12=(edtValue)*83.333333333;

        VirtualTributary1signal=(edtValue)*92.592592593;

        VirtualTributary1payload=(edtValue)*103.62694301;

        VirtualTributary2signal=(edtValue)*69.444444444;

        VirtualTributary2payload=(edtValue)*78.125;

        VirtualTributary6signal=(edtValue)*25.348542459;

        VirtualTributary6payload=(edtValue)*26.666666667;

        STS1signal=(edtValue)*3.0864197531;

        STS1payload=(edtValue)*3.2323232323;

        STS3signal=(edtValue)*1.0288065844;

        STS3payload=(edtValue)*1.0642826735;

        STS3csignal=(edtValue)*1.0288065844;

        STS3cpayload=(edtValue)*1.0642826735;

        STS12signal=(edtValue)*0.2572016461;

        STS24signal=(edtValue)*0.128600823;

        STS48signal=(edtValue)*0.0643004115;

        STS192signal=(edtValue)*0.0160751029;

        STM1signal=(edtValue)*1.0288065844;

        STM4signal=(edtValue)*0.2572016461;

        STM16signal=(edtValue)*0.0643004115;

        STM64signal=(edtValue)*0.0160751029;

    }

    private void SCSIFast() {
        bitpersecond=(edtValue)*80000000;

        bytepersecond=(edtValue)*10000000;

        kilobitpersecondSI=(edtValue)*80000;

        kilobytepersecondSI=(edtValue)*10000;

        kilobitpersecond=(edtValue)*78125;

        kilobytepersecond=(edtValue)*9765.625;

        megabitpersecondSI=(edtValue)*80;

        megabytepersecondSI=(edtValue)*10;

        megabitpersecond=(edtValue)*76.293945313;

        megabytepersecond=(edtValue)*9.5367431641;

        gigabitpersecondSI=(edtValue)*0.08;

        gigabytepersecondSI=(edtValue)*0.01;

        gigabitpersecond=(edtValue)*0.074505806;

        gigabytepersecond=(edtValue)*0.0093132257;

        terabitpersecondSI=(edtValue)*0.00008;

        terabytepersecondSI=(edtValue)*0.00001;

        terabitpersecond=(edtValue)*0.0000727596;

        terabytepersecond=(edtValue)*0.0000090949;

        ethernet=(edtValue)*8;

        ethernetfast=(edtValue)*0.8;

        ethernetgigabit=(edtValue)*0.08;

        OC1=(edtValue)*1.5432098765;

        OC3=(edtValue)*0.5144032922;

        OC12=(edtValue)*0.128600823;

        OC24=(edtValue)*0.0643004115;

        OC48=(edtValue)*0.0321502058;

        OC192=(edtValue)*0.0080375514;

        OC768=(edtValue)*0.0020093879;

        ISDNsinglechannel=(edtValue)*1250;

        ISDNdualchannel=(edtValue)*625;

        modem110=(edtValue)*727272.72727;

        modem300=(edtValue)*266666.66667;

        modem1200=(edtValue)*66666.666667;

        modem2400=(edtValue)*33333.333333;

        modem9600=(edtValue)*8333.3333333;

        modem14k=(edtValue)*5555.5555556;

        modem28k=(edtValue)*2777.7777778;

        modem33k=(edtValue)*2380.952381;

        modem56k=(edtValue)*1428.5714286;

        SCSIAsync=(edtValue)*6.6666666667;

        SCSISync=(edtValue)*2;

        SCSIFast=(edtValue)*1;

        SCSIFastUltra=(edtValue)*0.5;


        SCSIFastWide=(edtValue)*0.5;

        SCSIFastUltraWide=(edtValue)*0.25;

        SCSIUltra2=(edtValue)*0.125;

        SCSIUltra3=(edtValue)*0.0625;

        SCSILVDUltra80=(edtValue)*0.125;


        SCSILVDUltra160=(edtValue)*0.0625;

        IDEPIOmode0=(edtValue)*3.0303030303;

        IDEPIOmode1=(edtValue)*1.9230769231;

        IDEPIOmode2=(edtValue)*1.2048192771;

        IDEPIOmode3=(edtValue)*0.9009009009;

        IDEPIOmode4=(edtValue)*0.6024096386;

        IDEDMAmode0=(edtValue)*2.380952381;

        IDEDMAmode1=(edtValue)*0.7518796992;

        IDEDMAmode2=(edtValue)*0.6024096386;

        IDEUDMAmode0=(edtValue)*0.6024096386;

        IDEUDMAmode1=(edtValue)*0.4;

        IDEUDMAmode2=(edtValue)*0.303030303;

        IDEUDMAmode3=(edtValue)*0.2;

        IDEUDMAmode4=(edtValue)*0.1515151515;

        IDEUDMA33=(edtValue)*0.303030303;

        IDEUDMA66=(edtValue)*0.1515151515;

        USB=(edtValue)*6.6666666667;

        firewire=(edtValue)*0.2;

        T0payload=(edtValue)*1428.5714286;

        T0B8ZSpayload=(edtValue)*1250;

        T1signal=(edtValue)*51.813471503;

        T1payload=(edtValue)*59.523809524;

        T1Zpayload=(edtValue)*51.813471503;

        T1Csignal=(edtValue)*25.38071066;

        T1Cpayload=(edtValue)*29.761904762;

        T2signal=(edtValue)*12.674271229;

        T3signal=(edtValue)*1.7882689557;

        T3payload=(edtValue)*2.1258503401;

        T3Zpayload=(edtValue)*1.8601190476;

        T4signal=(edtValue)*0.29178338;

        EPTA1signal=(edtValue)*39.0625;

        EPTA1payload=(edtValue)*41.666666667;

        EPTA2signal=(edtValue)*9.4696969697;

        EPTA2payload=(edtValue)*10.416666667;

        EPTA3signal=(edtValue)*2.3277467412;

        EPTA3payload=(edtValue)*2.6041666667;

        H0=(edtValue)*208.33333333;

        H11=(edtValue)*52.083333333;

        H12=(edtValue)*41.666666667;

        VirtualTributary1signal=(edtValue)*46.296296296;

        VirtualTributary1payload=(edtValue)*51.813471503;

        VirtualTributary2signal=(edtValue)*34.722222222;

        VirtualTributary2payload=(edtValue)*39.0625;

        VirtualTributary6signal=(edtValue)*12.674271229;

        VirtualTributary6payload=(edtValue)*13.333333333;

        STS1signal=(edtValue)*1.5432098765;

        STS1payload=(edtValue)*1.6161616162;

        STS3signal=(edtValue)*0.5144032922;

        STS3payload=(edtValue)*0.5321413367;

        STS3csignal=(edtValue)*0.5144032922;

        STS3cpayload=(edtValue)*0.5321413367;

        STS12signal=(edtValue)*0.128600823;

        STS24signal=(edtValue)*0.0643004115;

        STS48signal=(edtValue)*0.0321502058;

        STS192signal=(edtValue)*0.0080375514;

        STM1signal=(edtValue)*0.5144032922;

        STM4signal=(edtValue)*0.128600823;

        STM16signal=(edtValue)*0.0321502058;

        STM64signal=(edtValue)*0.0080375514;

    }

    private void SCSISync() {

        bitpersecond=(edtValue)*40000000;

        bytepersecond=(edtValue)*5000000;

        kilobitpersecondSI=(edtValue)*40000;

        kilobytepersecondSI=(edtValue)*5000;

        kilobitpersecond=(edtValue)*39062.5;

        kilobytepersecond=(edtValue)*4882.8125;

        megabitpersecondSI=(edtValue)*40;

        megabytepersecondSI=(edtValue)*5;

        megabitpersecond=(edtValue)*38.146972656;

        megabytepersecond=(edtValue)*4.768371582;

        gigabitpersecondSI=(edtValue)*0.04;

        gigabytepersecondSI=(edtValue)*0.005;

        gigabitpersecond=(edtValue)*0.037252903;

        gigabytepersecond=(edtValue)*0.0046566129;

        terabitpersecondSI=(edtValue)*0.00004;

        terabytepersecondSI=(edtValue)*0.000005;

        terabitpersecond=(edtValue)*0.0000363798;

        terabytepersecond=(edtValue)*0.0000045475;

        ethernet=(edtValue)*4;

        ethernetfast=(edtValue)*0.4;

        ethernetgigabit=(edtValue)*0.04;

        OC1=(edtValue)*0.7716049383;

        OC3=(edtValue)*0.2572016461;

        OC12=(edtValue)*0.0643004115;

        OC24=(edtValue)*0.0321502058;

        OC48=(edtValue)*0.0160751029;

        OC192=(edtValue)*0.0040187757;

        OC768=(edtValue)*0.0010046939;

        ISDNsinglechannel=(edtValue)*625;

        ISDNdualchannel=(edtValue)*312.5;

        modem110=(edtValue)*363636.36364;

        modem300=(edtValue)*133333.33333;

        modem1200=(edtValue)*33333.333333;

        modem2400=(edtValue)*16666.666667;

        modem9600=(edtValue)*4166.6666667;

        modem14k=(edtValue)*2777.7777778;

        modem28k=(edtValue)*1388.8888889;

        modem33k=(edtValue)*1190.4761905;

        modem56k=(edtValue)*714.28571429;

        SCSIAsync=(edtValue)*3.3333333333;

        SCSISync=(edtValue)*1;

        SCSIFast=(edtValue)*0.5;

        SCSIFastUltra=(edtValue)*0.25;


        SCSIFastWide=(edtValue)*0.25;

        SCSIFastUltraWide=(edtValue)*0.125;

        SCSIUltra2=(edtValue)*0.0625;

        SCSIUltra3=(edtValue)*0.03125;

        SCSILVDUltra80=(edtValue)*0.0625;


        SCSILVDUltra160=(edtValue)*0.03125;

        IDEPIOmode0=(edtValue)*1.5151515152;

        IDEPIOmode1=(edtValue)*0.9615384615;

        IDEPIOmode2=(edtValue)*0.6024096386;

        IDEPIOmode3=(edtValue)*0.4504504505;

        IDEPIOmode4=(edtValue)*0.3012048193;

        IDEDMAmode0=(edtValue)*1.1904761905;

        IDEDMAmode1=(edtValue)*0.3759398496;

        IDEDMAmode2=(edtValue)*0.3012048193;

        IDEUDMAmode0=(edtValue)*0.3012048193;

        IDEUDMAmode1=(edtValue)*0.2;

        IDEUDMAmode2=(edtValue)*0.1515151515;

        IDEUDMAmode3=(edtValue)*0.1;

        IDEUDMAmode4=(edtValue)*0.0757575758;

        IDEUDMA33=(edtValue)*0.1515151515;

        IDEUDMA66=(edtValue)*0.0757575758;

        USB=(edtValue)*3.3333333333;

        firewire=(edtValue)*0.1;

        T0payload=(edtValue)*714.28571429;

        T0B8ZSpayload=(edtValue)*625;

        T1signal=(edtValue)*25.906735751;

        T1payload=(edtValue)*29.761904762;

        T1Zpayload=(edtValue)*25.906735751;

        T1Csignal=(edtValue)*12.69035533;

        T1Cpayload=(edtValue)*14.880952381;

        T2signal=(edtValue)*6.3371356147;

        T3signal=(edtValue)*0.8941344778;

        T3payload=(edtValue)*1.0629251701;

        T3Zpayload=(edtValue)*0.9300595238;

        T4signal=(edtValue)*0.14589169;

        EPTA1signal=(edtValue)*19.53125;

        EPTA1payload=(edtValue)*20.833333333;

        EPTA2signal=(edtValue)*4.7348484848;

        EPTA2payload=(edtValue)*5.2083333333;

        EPTA3signal=(edtValue)*1.1638733706;

        EPTA3payload=(edtValue)*1.3020833333;

        H0=(edtValue)*104.16666667;

        H11=(edtValue)*26.041666667;

        H12=(edtValue)*20.833333333;

        VirtualTributary1signal=(edtValue)*23.148148148;

        VirtualTributary1payload=(edtValue)*25.906735751;

        VirtualTributary2signal=(edtValue)*17.361111111;

        VirtualTributary2payload=(edtValue)*19.53125;

        VirtualTributary6signal=(edtValue)*6.3371356147;

        VirtualTributary6payload=(edtValue)*6.6666666667;

        STS1signal=(edtValue)*0.7716049383;

        STS1payload=(edtValue)*0.8080808081;

        STS3signal=(edtValue)*0.2572016461;

        STS3payload=(edtValue)*0.2660706684;

        STS3csignal=(edtValue)*0.2572016461;

        STS3cpayload=(edtValue)*0.2660706684;

        STS12signal=(edtValue)*0.0643004115;

        STS24signal=(edtValue)*0.0321502058;

        STS48signal=(edtValue)*0.0160751029;

        STS192signal=(edtValue)*0.0040187757;

        STM1signal=(edtValue)*0.2572016461;

        STM4signal=(edtValue)*0.0643004115;

        STM16signal=(edtValue)*0.0160751029;

        STM64signal=(edtValue)*0.0040187757;

    }

    private void SCSIAsync() {
        bitpersecond=(edtValue)*12000000;

        bytepersecond=(edtValue)*1500000;

        kilobitpersecondSI=(edtValue)*12000;

        kilobytepersecondSI=(edtValue)*1500;

        kilobitpersecond=(edtValue)*11718.75;

        kilobytepersecond=(edtValue)*1464.84375;

        megabitpersecondSI=(edtValue)*12;

        megabytepersecondSI=(edtValue)*1.5;

        megabitpersecond=(edtValue)*11.444091797;

        megabytepersecond=(edtValue)*1.4305114746;

        gigabitpersecondSI=(edtValue)*0.012;

        gigabytepersecondSI=(edtValue)*0.0015;

        gigabitpersecond=(edtValue)*0.0111758709;

        gigabytepersecond=(edtValue)*0.0013969839;

        terabitpersecondSI=(edtValue)*0.000012;

        terabytepersecondSI=(edtValue)*0.0000015;

        terabitpersecond=(edtValue)*0.0000109139;

        terabytepersecond=(edtValue)*0.0000013642;

        ethernet=(edtValue)*1.2;

        ethernetfast=(edtValue)*0.12;

        ethernetgigabit=(edtValue)*0.012;

        OC1=(edtValue)*0.2314814815;

        OC3=(edtValue)*0.0771604938;

        OC12=(edtValue)*0.0192901235;

        OC24=(edtValue)*0.0096450617;

        OC48=(edtValue)*0.0048225309;

        OC192=(edtValue)*0.0012056327;

        OC768=(edtValue)*0.0003014082;

        ISDNsinglechannel=(edtValue)*187.5;

        ISDNdualchannel=(edtValue)*93.75;

        modem110=(edtValue)*109090.90909;

        modem300=(edtValue)*40000;

        modem1200=(edtValue)*10000;

        modem2400=(edtValue)*5000;

        modem9600=(edtValue)*1250;

        modem14k=(edtValue)*833.33333333;

        modem28k=(edtValue)*416.66666667;

        modem33k=(edtValue)*357.14285714;

        modem56k=(edtValue)*214.28571429;

        SCSIAsync=(edtValue)*1;

        SCSISync=(edtValue)*0.3;

        SCSIFast=(edtValue)*0.15;

        SCSIFastUltra=(edtValue)*0.075;


        SCSIFastWide=(edtValue)*0.075;

        SCSIFastUltraWide=(edtValue)*0.0375;

        SCSIUltra2=(edtValue)*0.01875;

        SCSIUltra3=(edtValue)*0.009375;

        SCSILVDUltra80=(edtValue)*0.01875;


        SCSILVDUltra160=(edtValue)*0.009375;

        IDEPIOmode0=(edtValue)*0.4545454545;

        IDEPIOmode1=(edtValue)*0.2884615385;

        IDEPIOmode2=(edtValue)*0.1807228916;

        IDEPIOmode3=(edtValue)*0.1351351351;

        IDEPIOmode4=(edtValue)*0.0903614458;

        IDEDMAmode0=(edtValue)*0.3571428571;

        IDEDMAmode1=(edtValue)*0.1127819549;

        IDEDMAmode2=(edtValue)*0.0903614458;

        IDEUDMAmode0=(edtValue)*0.0903614458;

        IDEUDMAmode1=(edtValue)*0.06;

        IDEUDMAmode2=(edtValue)*0.0454545455;

        IDEUDMAmode3=(edtValue)*0.03;

        IDEUDMAmode4=(edtValue)*0.0227272727;

        IDEUDMA33=(edtValue)*0.0454545455;

        IDEUDMA66=(edtValue)*0.0227272727;

        USB=(edtValue)*1;

        firewire=(edtValue)*0.03;

        T0payload=(edtValue)*214.28571429;

        T0B8ZSpayload=(edtValue)*187.5;

        T1signal=(edtValue)*7.7720207254;

        T1payload=(edtValue)*8.9285714286;

        T1Zpayload=(edtValue)*7.7720207254;

        T1Csignal=(edtValue)*3.807106599;

        T1Cpayload=(edtValue)*4.4642857143;

        T2signal=(edtValue)*1.9011406844;

        T3signal=(edtValue)*0.2682403433;

        T3payload=(edtValue)*0.318877551;

        T3Zpayload=(edtValue)*0.2790178571;

        T4signal=(edtValue)*0.043767507;

        EPTA1signal=(edtValue)*5.859375;

        EPTA1payload=(edtValue)*6.25;

        EPTA2signal=(edtValue)*1.4204545455;

        EPTA2payload=(edtValue)*1.5625;

        EPTA3signal=(edtValue)*0.3491620112;

        EPTA3payload=(edtValue)*0.390625;

        H0=(edtValue)*31.25;

        H11=(edtValue)*7.8125;

        H12=(edtValue)*6.25;

        VirtualTributary1signal=(edtValue)*6.9444444444;

        VirtualTributary1payload=(edtValue)*7.7720207254;

        VirtualTributary2signal=(edtValue)*5.2083333333;

        VirtualTributary2payload=(edtValue)*5.859375;

        VirtualTributary6signal=(edtValue)*1.9011406844;

        VirtualTributary6payload=(edtValue)*2;

        STS1signal=(edtValue)*0.2314814815;

        STS1payload=(edtValue)*0.2424242424;

        STS3signal=(edtValue)*0.0771604938;

        STS3payload=(edtValue)*0.0798212005;

        STS3csignal=(edtValue)*0.0771604938;

        STS3cpayload=(edtValue)*0.0798212005;

        STS12signal=(edtValue)*0.0192901235;

        STS24signal=(edtValue)*0.0096450617;

        STS48signal=(edtValue)*0.0048225309;

        STS192signal=(edtValue)*0.0012056327;

        STM1signal=(edtValue)*0.0771604938;

        STM4signal=(edtValue)*0.0192901235;

        STM16signal=(edtValue)*0.0048225309;

        STM64signal=(edtValue)*0.0012056327;

    }

    private void Modem56k() {

        bitpersecond=(edtValue)*56000;

        bytepersecond=(edtValue)*7000;

        kilobitpersecondSI=(edtValue)*56;

        kilobytepersecondSI=(edtValue)*7;

        kilobitpersecond=(edtValue)*54.6875;

        kilobytepersecond=(edtValue)*6.8359375;

        megabitpersecondSI=(edtValue)*0.056;

        megabytepersecondSI=(edtValue)*0.007;

        megabitpersecond=(edtValue)*0.0534057617;

        megabytepersecond=(edtValue)*0.0066757202;

        gigabitpersecondSI=(edtValue)*0.000056;

        gigabytepersecondSI=(edtValue)*0.000007;

        gigabitpersecond=(edtValue)*0.0000521541;

        gigabytepersecond=(edtValue)*0.0000065193;

        terabitpersecondSI=(edtValue)*5.599999999E-8;

        terabytepersecondSI=(edtValue)*6.999999999E-9;

        terabitpersecond=(edtValue)*5.093170329E-8;

        terabytepersecond=(edtValue)*6.366462912E-9;

        ethernet=(edtValue)*0.0056;

        ethernetfast=(edtValue)*0.00056;

        ethernetgigabit=(edtValue)*0.000056;

        OC1=(edtValue)*0.0010802469;

        OC3=(edtValue)*0.0003600823;

        OC12=(edtValue)*0.0000900206;

        OC24=(edtValue)*0.0000450103;

        OC48=(edtValue)*0.0000225051;

        OC192=(edtValue)*0.0000056263;

        OC768=(edtValue)*0.0000014066;

        ISDNsinglechannel=(edtValue)*0.875;

        ISDNdualchannel=(edtValue)*0.4375;

        modem110=(edtValue)*509.09090909;

        modem300=(edtValue)*186.66666667;

        modem1200=(edtValue)*46.666666667;

        modem2400=(edtValue)*23.333333333;

        modem9600=(edtValue)*5.8333333333;

        modem14k=(edtValue)*3.8888888889;

        modem28k=(edtValue)*1.9444444444;

        modem33k=(edtValue)*1.6666666667;

        modem56k=(edtValue)*1;

        SCSIAsync=(edtValue)*0.0046666667;

        SCSISync=(edtValue)*0.0014;

        SCSIFast=(edtValue)*0.0007;

        SCSIFastUltra=(edtValue)*0.00035;


        SCSIFastWide=(edtValue)*0.00035;

        SCSIFastUltraWide=(edtValue)*0.000175;

        SCSIUltra2=(edtValue)*0.0000875;

        SCSIUltra3=(edtValue)*0.00004375;

        SCSILVDUltra80=(edtValue)*0.0000875;


        SCSILVDUltra160=(edtValue)*0.00004375;

        IDEPIOmode0=(edtValue)*0.0021212121;

        IDEPIOmode1=(edtValue)*0.0013461538;

        IDEPIOmode2=(edtValue)*0.0008433735;

        IDEPIOmode3=(edtValue)*0.0006306306;

        IDEPIOmode4=(edtValue)*0.0004216867;

        IDEDMAmode0=(edtValue)*0.0016666667;

        IDEDMAmode1=(edtValue)*0.0005263158;

        IDEDMAmode2=(edtValue)*0.0004216867;

        IDEUDMAmode0=(edtValue)*0.0004216867;

        IDEUDMAmode1=(edtValue)*0.00028;

        IDEUDMAmode2=(edtValue)*0.0002121212;

        IDEUDMAmode3=(edtValue)*0.00014;

        IDEUDMAmode4=(edtValue)*0.0001060606;

        IDEUDMA33=(edtValue)*0.0002121212;

        IDEUDMA66=(edtValue)*0.0001060606;

        USB=(edtValue)*0.0046666667;

        firewire=(edtValue)*0.00014;

        T0payload=(edtValue)*1;

        T0B8ZSpayload=(edtValue)*0.875;

        T1signal=(edtValue)*0.0362694301;

        T1payload=(edtValue)*0.0416666667;

        T1Zpayload=(edtValue)*0.0362694301;

        T1Csignal=(edtValue)*0.0177664975;

        T1Cpayload=(edtValue)*0.0208333333;

        T2signal=(edtValue)*0.0088719899;

        T3signal=(edtValue)*0.0012517883;

        T3payload=(edtValue)*0.0014880952;

        T3Zpayload=(edtValue)*0.0013020833;

        T4signal=(edtValue)*0.0002042484;

        EPTA1signal=(edtValue)*0.02734375;

        EPTA1payload=(edtValue)*0.0291666667;

        EPTA2signal=(edtValue)*0.0066287879;

        EPTA2payload=(edtValue)*0.0072916667;

        EPTA3signal=(edtValue)*0.0016294227;

        EPTA3payload=(edtValue)*0.0018229167;

        H0=(edtValue)*0.1458333333;

        H11=(edtValue)*0.0364583333;

        H12=(edtValue)*0.0291666667;

        VirtualTributary1signal=(edtValue)*0.0324074074;

        VirtualTributary1payload=(edtValue)*0.0362694301;

        VirtualTributary2signal=(edtValue)*0.0243055556;

        VirtualTributary2payload=(edtValue)*0.02734375;

        VirtualTributary6signal=(edtValue)*0.0088719899;

        VirtualTributary6payload=(edtValue)*0.0093333333;

        STS1signal=(edtValue)*0.0010802469;

        STS1payload=(edtValue)*0.0011313131;

        STS3signal=(edtValue)*0.0003600823;

        STS3payload=(edtValue)*0.0003724989;

        STS3csignal=(edtValue)*0.0003600823;

        STS3cpayload=(edtValue)*0.0003724989;

        STS12signal=(edtValue)*0.0000900206;

        STS24signal=(edtValue)*0.0000450103;

        STS48signal=(edtValue)*0.0000225051;

        STS192signal=(edtValue)*0.0000056263;

        STM1signal=(edtValue)*0.0003600823;

        STM4signal=(edtValue)*0.0000900206;

        STM16signal=(edtValue)*0.0000225051;

        STM64signal=(edtValue)*0.0000056263;
    }

    private void Modem33() {

        bitpersecond=(edtValue)*33600;

        bytepersecond=(edtValue)*4200;

        kilobitpersecondSI=(edtValue)*33.6;

        kilobytepersecondSI=(edtValue)*4.2;

        kilobitpersecond=(edtValue)*32.8125;

        kilobytepersecond=(edtValue)*4.1015625;

        megabitpersecondSI=(edtValue)*0.0336;

        megabytepersecondSI=(edtValue)*0.0042;

        megabitpersecond=(edtValue)*0.032043457;

        megabytepersecond=(edtValue)*0.0040054321;

        gigabitpersecondSI=(edtValue)*0.0000336;

        gigabytepersecondSI=(edtValue)*0.0000042;

        gigabitpersecond=(edtValue)*0.0000312924;

        gigabytepersecond=(edtValue)*0.0000039116;

        terabitpersecondSI=(edtValue)*3.359999999E-8;

        terabytepersecondSI=(edtValue)*4.199999999E-9;

        terabitpersecond=(edtValue)*3.055902197E-8;

        terabytepersecond=(edtValue)*3.819877747E-9;

        ethernet=(edtValue)*0.00336;

        ethernetfast=(edtValue)*0.000336;

        ethernetgigabit=(edtValue)*0.0000336;

        OC1=(edtValue)*0.0006481481;

        OC3=(edtValue)*0.0002160494;

        OC12=(edtValue)*0.0000540123;

        OC24=(edtValue)*0.0000270062;

        OC48=(edtValue)*0.0000135031;

        OC192=(edtValue)*0.0000033758;

        OC768=(edtValue)*8.439429012E-7;

        ISDNsinglechannel=(edtValue)*0.525;

        ISDNdualchannel=(edtValue)*0.2625;

        modem110=(edtValue)*305.45454545;

        modem300=(edtValue)*112;

        modem1200=(edtValue)*28;

        modem2400=(edtValue)*14;

        modem9600=(edtValue)*3.5;

        modem14k=(edtValue)*2.3333333333;

        modem28k=(edtValue)*1.1666666667;

        modem33k=(edtValue)*1;

        modem56k=(edtValue)*0.6;

        SCSIAsync=(edtValue)*0.0028;

        SCSISync=(edtValue)*0.00084;

        SCSIFast=(edtValue)*0.00042;

        SCSIFastUltra=(edtValue)*0.00021;


        SCSIFastWide=(edtValue)*0.00021;

        SCSIFastUltraWide=(edtValue)*0.000105;

        SCSIUltra2=(edtValue)*0.0000525;

        SCSIUltra3=(edtValue)*0.00002625;

        SCSILVDUltra80=(edtValue)*0.0000525;


        SCSILVDUltra160=(edtValue)*0.00002625;

        IDEPIOmode0=(edtValue)*0.0012727273;

        IDEPIOmode1=(edtValue)*0.0008076923;

        IDEPIOmode2=(edtValue)*0.0005060241;

        IDEPIOmode3=(edtValue)*0.0003783784;

        IDEPIOmode4=(edtValue)*0.000253012;

        IDEDMAmode0=(edtValue)*0.001;

        IDEDMAmode1=(edtValue)*0.0003157895;

        IDEDMAmode2=(edtValue)*0.000253012;

        IDEUDMAmode0=(edtValue)*0.000253012;

        IDEUDMAmode1=(edtValue)*0.000168;

        IDEUDMAmode2=(edtValue)*0.0001272727;

        IDEUDMAmode3=(edtValue)*0.000084;

        IDEUDMAmode4=(edtValue)*0.0000636364;

        IDEUDMA33=(edtValue)*0.0001272727;

        IDEUDMA66=(edtValue)*0.0000636364;

        USB=(edtValue)*0.0028;

        firewire=(edtValue)*0.000084;

        T0payload=(edtValue)*0.6;

        T0B8ZSpayload=(edtValue)*0.525;

        T1signal=(edtValue)*0.021761658;

        T1payload=(edtValue)*0.025;

        T1Zpayload=(edtValue)*0.021761658;

        T1Csignal=(edtValue)*0.0106598985;

        T1Cpayload=(edtValue)*0.0125;

        T2signal=(edtValue)*0.0053231939;

        T3signal=(edtValue)*0.000751073;

        T3payload=(edtValue)*0.0008928571;

        T3Zpayload=(edtValue)*0.00078125;

        T4signal=(edtValue)*0.000122549;

        EPTA1signal=(edtValue)*0.01640625;

        EPTA1payload=(edtValue)*0.0175;

        EPTA2signal=(edtValue)*0.0039772727;

        EPTA2payload=(edtValue)*0.004375;

        EPTA3signal=(edtValue)*0.0009776536;

        EPTA3payload=(edtValue)*0.00109375;

        H0=(edtValue)*0.0875;

        H11=(edtValue)*0.021875;

        H12=(edtValue)*0.0175;

        VirtualTributary1signal=(edtValue)*0.0194444444;

        VirtualTributary1payload=(edtValue)*0.021761658;

        VirtualTributary2signal=(edtValue)*0.0145833333;

        VirtualTributary2payload=(edtValue)*0.01640625;

        VirtualTributary6signal=(edtValue)*0.0053231939;

        VirtualTributary6payload=(edtValue)*0.0056;

        STS1signal=(edtValue)*0.0006481481;

        STS1payload=(edtValue)*0.0006787879;

        STS3signal=(edtValue)*0.0002160494;

        STS3payload=(edtValue)*0.0002234994;

        STS3csignal=(edtValue)*0.0002160494;

        STS3cpayload=(edtValue)*0.0002234994;

        STS12signal=(edtValue)*0.0000540123;

        STS24signal=(edtValue)*0.0000270062;

        STS48signal=(edtValue)*0.0000135031;

        STS192signal=(edtValue)*0.0000033758;

        STM1signal=(edtValue)*0.0002160494;

        STM4signal=(edtValue)*0.0000540123;

        STM16signal=(edtValue)*0.0000135031;

        STM64signal=(edtValue)*0.0000033758;

    }

    private void Modem28() {

        bitpersecond=(edtValue)*28800;

        bytepersecond=(edtValue)*3600;

        kilobitpersecondSI=(edtValue)*28.8;

        kilobytepersecondSI=(edtValue)*3.6;

        kilobitpersecond=(edtValue)*28.125;

        kilobytepersecond=(edtValue)*3.515625;

        megabitpersecondSI=(edtValue)*0.0288;

        megabytepersecondSI=(edtValue)*0.0036;

        megabitpersecond=(edtValue)*0.0274658203;

        megabytepersecond=(edtValue)*0.0034332275;

        gigabitpersecondSI=(edtValue)*0.0000288;

        gigabytepersecondSI=(edtValue)*0.0000036;

        gigabitpersecond=(edtValue)*0.0000268221;

        gigabytepersecond=(edtValue)*0.0000033528;

        terabitpersecondSI=(edtValue)*2.88E-8;

        terabytepersecondSI=(edtValue)*3.6E-9;

        terabitpersecond=(edtValue)*2.619344741E-8;

        terabytepersecond=(edtValue)*3.274180926E-9;

        ethernet=(edtValue)*0.00288;

        ethernetfast=(edtValue)*0.000288;

        ethernetgigabit=(edtValue)*0.0000288;

        OC1=(edtValue)*0.0005555556;

        OC3=(edtValue)*0.0001851852;

        OC12=(edtValue)*0.0000462963;

        OC24=(edtValue)*0.0000231481;

        OC48=(edtValue)*0.0000115741;

        OC192=(edtValue)*0.0000028935;

        OC768=(edtValue)*7.233796296E-7;

        ISDNsinglechannel=(edtValue)*0.45;

        ISDNdualchannel=(edtValue)*0.225;

        modem110=(edtValue)*261.81818182;

        modem300=(edtValue)*96;

        modem1200=(edtValue)*24;

        modem2400=(edtValue)*12;

        modem9600=(edtValue)*3;

        modem14k=(edtValue)*2;

        modem28k=(edtValue)*1;

        modem33k=(edtValue)*0.8571428571;

        modem56k=(edtValue)*0.5142857143;

        SCSIAsync=(edtValue)*0.0024;

        SCSISync=(edtValue)*0.00072;

        SCSIFast=(edtValue)*0.00036;

        SCSIFastUltra=(edtValue)*0.00018;


        SCSIFastWide=(edtValue)*0.00018;

        SCSIFastUltraWide=(edtValue)*0.00009;

        SCSIUltra2=(edtValue)*0.000045;

        SCSIUltra3=(edtValue)*0.0000225;

        SCSILVDUltra80=(edtValue)*0.000045;


        SCSILVDUltra160=(edtValue)*0.0000225;

        IDEPIOmode0=(edtValue)*0.0010909091;

        IDEPIOmode1=(edtValue)*0.0006923077;

        IDEPIOmode2=(edtValue)*0.0004337349;

        IDEPIOmode3=(edtValue)*0.0003243243;

        IDEPIOmode4=(edtValue)*0.0002168675;

        IDEDMAmode0=(edtValue)*0.0008571429;

        IDEDMAmode1=(edtValue)*0.0002706767;

        IDEDMAmode2=(edtValue)*0.0002168675;

        IDEUDMAmode0=(edtValue)*0.0002168675;

        IDEUDMAmode1=(edtValue)*0.000144;

        IDEUDMAmode2=(edtValue)*0.0001090909;

        IDEUDMAmode3=(edtValue)*0.000072;

        IDEUDMAmode4=(edtValue)*0.0000545455;

        IDEUDMA33=(edtValue)*0.0001090909;

        IDEUDMA66=(edtValue)*0.0000545455;

        USB=(edtValue)*0.0024;

        firewire=(edtValue)*0.000072;

        T0payload=(edtValue)*0.5142857143;

        T0B8ZSpayload=(edtValue)*0.45;

        T1signal=(edtValue)*0.0186528497;

        T1payload=(edtValue)*0.0214285714;

        T1Zpayload=(edtValue)*0.0186528497;

        T1Csignal=(edtValue)*0.0091370558;

        T1Cpayload=(edtValue)*0.0107142857;

        T2signal=(edtValue)*0.0045627376;

        T3signal=(edtValue)*0.0006437768;

        T3payload=(edtValue)*0.0007653061;

        T3Zpayload=(edtValue)*0.0006696429;

        T4signal=(edtValue)*0.000105042;

        EPTA1signal=(edtValue)*0.0140625;

        EPTA1payload=(edtValue)*0.015;

        EPTA2signal=(edtValue)*0.0034090909;

        EPTA2payload=(edtValue)*0.00375;

        EPTA3signal=(edtValue)*0.0008379888;

        EPTA3payload=(edtValue)*0.0009375;

        H0=(edtValue)*0.075;

        H11=(edtValue)*0.01875;

        H12=(edtValue)*0.015;

        VirtualTributary1signal=(edtValue)*0.0166666667;

        VirtualTributary1payload=(edtValue)*0.0186528497;

        VirtualTributary2signal=(edtValue)*0.0125;

        VirtualTributary2payload=(edtValue)*0.0140625;

        VirtualTributary6signal=(edtValue)*0.0045627376;

        VirtualTributary6payload=(edtValue)*0.0048;

        STS1signal=(edtValue)*0.0005555556;

        STS1payload=(edtValue)*0.0005818182;

        STS3signal=(edtValue)*0.0001851852;

        STS3payload=(edtValue)*0.0001915709;

        STS3csignal=(edtValue)*0.0001851852;

        STS3cpayload=(edtValue)*0.0001915709;

        STS12signal=(edtValue)*0.0000462963;

        STS24signal=(edtValue)*0.0000231481;

        STS48signal=(edtValue)*0.0000115741;

        STS192signal=(edtValue)*0.0000028935;

        STM1signal=(edtValue)*0.0001851852;

        STM4signal=(edtValue)*0.0000462963;

        STM16signal=(edtValue)*0.0000115741;

        STM64signal=(edtValue)*0.0000028935;

    }

    private void Modem14() {
        bitpersecond=(edtValue)*14400;

        bytepersecond=(edtValue)*1800;

        kilobitpersecondSI=(edtValue)*14.4;

        kilobytepersecondSI=(edtValue)*1.8;

        kilobitpersecond=(edtValue)*14.0625;

        kilobytepersecond=(edtValue)*1.7578125;

        megabitpersecondSI=(edtValue)*0.0144;

        megabytepersecondSI=(edtValue)*0.0018;

        megabitpersecond=(edtValue)*0.0137329102;

        megabytepersecond=(edtValue)*0.0017166138;

        gigabitpersecondSI=(edtValue)*0.0000144;

        gigabytepersecondSI=(edtValue)*0.0000018;

        gigabitpersecond=(edtValue)*0.000013411;

        gigabytepersecond=(edtValue)*0.0000016764;

        terabitpersecondSI=(edtValue)*1.44E-8;

        terabytepersecondSI=(edtValue)*1.8E-9;

        terabitpersecond=(edtValue)*1.30967237E-8;

        terabytepersecond=(edtValue)*1.637090463E-9;

        ethernet=(edtValue)*0.00144;

        ethernetfast=(edtValue)*0.000144;

        ethernetgigabit=(edtValue)*0.0000144;

        OC1=(edtValue)*0.0002777778;

        OC3=(edtValue)*0.0000925926;

        OC12=(edtValue)*0.0000231481;

        OC24=(edtValue)*0.0000115741;

        OC48=(edtValue)*0.000005787;

        OC192=(edtValue)*0.0000014468;

        OC768=(edtValue)*3.616898148E-7;

        ISDNsinglechannel=(edtValue)*0.225;

        ISDNdualchannel=(edtValue)*0.1125;

        modem110=(edtValue)*130.90909091;

        modem300=(edtValue)*48;

        modem1200=(edtValue)*12;

        modem2400=(edtValue)*6;

        modem9600=(edtValue)*1.5;

        modem14k=(edtValue)*1;

        modem28k=(edtValue)*0.5;

        modem33k=(edtValue)*0.4285714286;

        modem56k=(edtValue)*0.2571428571;

        SCSIAsync=(edtValue)*0.0012;

        SCSISync=(edtValue)*0.00036;

        SCSIFast=(edtValue)*0.00018;

        SCSIFastUltra=(edtValue)*0.00009;


        SCSIFastWide=(edtValue)*0.00009;

        SCSIFastUltraWide=(edtValue)*0.000045;

        SCSIUltra2=(edtValue)*0.0000225;

        SCSIUltra3=(edtValue)*0.00001125;

        SCSILVDUltra80=(edtValue)*	0.0000225;


        SCSILVDUltra160=(edtValue)*0.00001125;

        IDEPIOmode0=(edtValue)*0.0005454545;

        IDEPIOmode1=(edtValue)*0.0003461538;

        IDEPIOmode2=(edtValue)*0.0002168675;

        IDEPIOmode3=(edtValue)*0.0001621622;

        IDEPIOmode4=(edtValue)*0.0001084337;

        IDEDMAmode0=(edtValue)*0.0004285714;

        IDEDMAmode1=(edtValue)*0.0001353383;

        IDEDMAmode2=(edtValue)*0.0001084337;

        IDEUDMAmode0=(edtValue)*0.0001084337;

        IDEUDMAmode1=(edtValue)*0.000072;

        IDEUDMAmode2=(edtValue)*0.0000545455;

        IDEUDMAmode3=(edtValue)*0.000036;

        IDEUDMAmode4=(edtValue)*0.0000272727;

        IDEUDMA33=(edtValue)*0.0000545455;

        IDEUDMA66=(edtValue)*0.0000272727;

        USB=(edtValue)*0.0012;

        firewire=(edtValue)*0.000036;

        T0payload=(edtValue)*0.2571428571;

        T0B8ZSpayload=(edtValue)*0.225;

        T1signal=(edtValue)*0.0093264249;

        T1payload=(edtValue)*0.0107142857;

        T1Zpayload=(edtValue)*0.0093264249;

        T1Csignal=(edtValue)*0.0045685279;

        T1Cpayload=(edtValue)*0.0053571429;

        T2signal=(edtValue)*0.0022813688;

        T3signal=(edtValue)*0.0003218884;

        T3payload=(edtValue)*0.0003826531;

        T3Zpayload=(edtValue)*0.0003348214;

        T4signal=(edtValue)*0.000052521;

        EPTA1signal=(edtValue)*0.00703125;

        EPTA1payload=(edtValue)*0.0075;

        EPTA2signal=(edtValue)*0.0017045455;

        EPTA2payload=(edtValue)*0.001875;

        EPTA3signal=(edtValue)*0.0004189944;

        EPTA3payload=(edtValue)*0.00046875;

        H0=(edtValue)*0.0375;

        H11=(edtValue)*0.009375;

        H12=(edtValue)*0.0075;

        VirtualTributary1signal=(edtValue)*0.0083333333;

        VirtualTributary1payload=(edtValue)*0.0093264249;

        VirtualTributary2signal=(edtValue)*0.00625;

        VirtualTributary2payload=(edtValue)*0.00703125;

        VirtualTributary6signal=(edtValue)*0.0022813688;

        VirtualTributary6payload=(edtValue)*0.0024;

        STS1signal=(edtValue)*0.0002777778;

        STS1payload=(edtValue)*0.0002909091;

        STS3signal=(edtValue)*0.0000925926;

        STS3payload=(edtValue)*0.0000957854;

        STS3csignal=(edtValue)*0.0000925926;

        STS3cpayload=(edtValue)*0.0000957854;

        STS12signal=(edtValue)*0.0000231481;

        STS24signal=(edtValue)*0.0000115741;

        STS48signal=(edtValue)*0.000005787;

        STS192signal=(edtValue)*0.0000014468;

        STM1signal=(edtValue)*0.0000925926;

        STM4signal=(edtValue)*0.0000231481;

        STM16signal=(edtValue)*0.000005787;

        STM64signal=(edtValue)*0.0000014468;



    }


    private void Modem9600() {
        bitpersecond=(edtValue)*9600;

        bytepersecond=(edtValue)*1200;

        kilobitpersecondSI=(edtValue)*9.6;

        kilobytepersecondSI=(edtValue)*1.2;

        kilobitpersecond=(edtValue)*9.375;

        kilobytepersecond=(edtValue)*1.171875;

        megabitpersecondSI=(edtValue)*0.0096;

        megabytepersecondSI=(edtValue)*0.0012;

        megabitpersecond=(edtValue)*0.0091552734;

        megabytepersecond=(edtValue)*0.0011444092;

        gigabitpersecondSI=(edtValue)*0.0000096;

        gigabytepersecondSI=(edtValue)*0.0000012;

        gigabitpersecond=(edtValue)*0.0000089407;

        gigabytepersecond=(edtValue)*0.0000011176;

        terabitpersecondSI=(edtValue)*9.599999999E-9;

        terabytepersecondSI=(edtValue)*1.199999999E-9;

        terabitpersecond=(edtValue)*8.731149137E-9;

        terabytepersecond=(edtValue)*1.091393642E-9;

        ethernet=(edtValue)*0.00096;

        ethernetfast=(edtValue)*0.000096;

        ethernetgigabit=(edtValue)*0.0000096;

        OC1=(edtValue)*0.0001851852;

        OC3=(edtValue)*0.0000617284;

        OC12=(edtValue)*0.0000154321;

        OC24=(edtValue)*0.000007716;

        OC48=(edtValue)*0.000003858;

        OC192=(edtValue)*9.645061728E-7;

        OC768=(edtValue)*2.411265432E-7;

        ISDNsinglechannel=(edtValue)*0.15;

        ISDNdualchannel=(edtValue)*0.075;

        modem110=(edtValue)*87.272727273;

        modem300=(edtValue)*32;

        modem1200=(edtValue)*8;

        modem2400=(edtValue)*4;

        modem9600=(edtValue)*1;

        modem14k=(edtValue)*0.6666666667;

        modem28k=(edtValue)*0.3333333333;

        modem33k=(edtValue)*0.2857142857;

        modem56k=(edtValue)*0.2857142857;

        SCSIAsync=(edtValue)*0.0008;

        SCSISync=(edtValue)*0.00024;

        SCSIFast=(edtValue)*0.00012;

        SCSIFastUltra=(edtValue)*0.00006;


        SCSIFastWide=(edtValue)*0.00006;

        SCSIFastUltraWide=(edtValue)*0.00003;

        SCSIUltra2=(edtValue)*0.000015;

        SCSIUltra3=(edtValue)*0.0000075;

        SCSILVDUltra80=(edtValue)*0.000015;


        SCSILVDUltra160=(edtValue)*0.0000075;

        IDEPIOmode0=(edtValue)*0.0003636364;

        IDEPIOmode1=(edtValue)*0.0002307692;

        IDEPIOmode2=(edtValue)*0.0001445783;

        IDEPIOmode3=(edtValue)*0.0001081081;

        IDEPIOmode4=(edtValue)*0.0000722892;

        IDEDMAmode0=(edtValue)*0.0002857143;

        IDEDMAmode1=(edtValue)*0.0000902256;

        IDEDMAmode2=(edtValue)*0.0000722892;

        IDEUDMAmode0=(edtValue)*0.0000722892;

        IDEUDMAmode1=(edtValue)*0.000048;

        IDEUDMAmode2=(edtValue)*0.0000363636;

        IDEUDMAmode3=(edtValue)*0.000024;

        IDEUDMAmode4=(edtValue)*0.0000181818;

        IDEUDMA33=(edtValue)*0.0000363636;

        IDEUDMA66=(edtValue)*0.0000181818;

        USB=(edtValue)*0.0008;

        firewire=(edtValue)*0.000024;

        T0payload=(edtValue)*0.1714285714;

        T0B8ZSpayload=(edtValue)*0.15;

        T1signal=(edtValue)*0.0062176166;

        T1payload=(edtValue)*0.0071428571;

        T1Zpayload=(edtValue)*0.0062176166;

        T1Csignal=(edtValue)*0.0030456853;

        T1Cpayload=(edtValue)*0.0035714286;

        T2signal=(edtValue)*0.0015209125;

        T3signal=(edtValue)*0.0002145923;

        T3payload=(edtValue)*0.000255102;

        T3Zpayload=(edtValue)*0.0002232143;

        T4signal=(edtValue)*0.000035014;

        EPTA1signal=(edtValue)*0.0046875;

        EPTA1payload=(edtValue)*0.005;

        EPTA2signal=(edtValue)*0.0011363636;

        EPTA2payload=(edtValue)*0.00125;

        EPTA3signal=(edtValue)*0.0002793296;

        EPTA3payload=(edtValue)*0.0003125;

        H0=(edtValue)*0.025;

        H11=(edtValue)*0.00625;

        H12=(edtValue)*0.005;

        VirtualTributary1signal=(edtValue)*0.0055555556;

        VirtualTributary1payload=(edtValue)*0.0062176166;

        VirtualTributary2signal=(edtValue)*0.0041666667;

        VirtualTributary2payload=(edtValue)*0.0046875;

        VirtualTributary6signal=(edtValue)*0.0015209125;

        VirtualTributary6payload=(edtValue)*0.0016;

        STS1signal=(edtValue)*0.0001851852;

        STS1payload=(edtValue)*0.0001939394;

        STS3signal=(edtValue)*0.0000617284;

        STS3payload=(edtValue)*0.000063857;

        STS3csignal=(edtValue)*0.0000617284;

        STS3cpayload=(edtValue)*0.000063857;

        STS12signal=(edtValue)*0.0000154321;

        STS24signal=(edtValue)*0.000007716;

        STS48signal=(edtValue)*0.000003858;

        STS192signal=(edtValue)*9.645061728E-7;

        STM1signal=(edtValue)*0.0000617284;

        STM4signal=(edtValue)*0.0000154321;

        STM16signal=(edtValue)*0.000003858;

        STM64signal=(edtValue)*9.645061728E-7;
    }

    private void Modem2400() {

        bitpersecond=(edtValue)*2400;

        bytepersecond=(edtValue)*300;

        kilobitpersecondSI=(edtValue)*2.4;

        kilobytepersecondSI=(edtValue)*0.3;

        kilobitpersecond=(edtValue)*2.34375;

        kilobytepersecond=(edtValue)*0.29296875;

        megabitpersecondSI=(edtValue)*0.0024;

        megabytepersecondSI=(edtValue)*0.0003;

        megabitpersecond=(edtValue)*0.0022888184;

        megabytepersecond=(edtValue)*0.0002861023;

        gigabitpersecondSI=(edtValue)*0.0000024;

        gigabytepersecondSI=(edtValue)*2.999999999E-7;

        gigabitpersecond=(edtValue)*0.0000022352;

        gigabytepersecond=(edtValue)*2.793967723E-7;

        terabitpersecondSI=(edtValue)*2.399999999E-9;

        terabytepersecondSI=(edtValue)*2.999999999E-10;

        terabitpersecond=(edtValue)*2.182787284E-9;

        terabytepersecond=(edtValue)*2.728484105E-10;

        ethernet=(edtValue)*0.00024;

        ethernetfast=(edtValue)*0.000024;

        ethernetgigabit=(edtValue)*0.0000024;

        OC1=(edtValue)*0.0000462963;

        OC3=(edtValue)*0.0000154321;

        OC12=(edtValue)*0.000003858;

        OC24=(edtValue)*0.000001929;

        OC48=(edtValue)*9.645061728E-7;

        OC192=(edtValue)*2.411265432E-7;

        OC768=(edtValue)*6.02816358E-8;

        ISDNsinglechannel=(edtValue)*0.0375;

        ISDNdualchannel=(edtValue)*0.01875;

        modem110=(edtValue)*21.818181818;

        modem300=(edtValue)*8;

        modem1200=(edtValue)*2;

        modem2400=(edtValue)*1;

        modem9600=(edtValue)*0.25;

        modem14k=(edtValue)*0.1666666667;

        modem28k=(edtValue)*0.0833333333;

        modem33k=(edtValue)*0.0714285714;

        modem56k=(edtValue)*0.0428571429;

        SCSIAsync=(edtValue)*0.0002;

        SCSISync=(edtValue)*0.00006;

        SCSIFast=(edtValue)*0.00003;

        SCSIFastUltra=(edtValue)*0.000015;


        SCSIFastWide=(edtValue)*0.000015;

        SCSIFastUltraWide=(edtValue)*0.0000075;

        SCSIUltra2=(edtValue)*0.00000375;

        SCSIUltra3=(edtValue)*0.000001875;

        SCSILVDUltra80=(edtValue)*0.00000375;


        SCSILVDUltra160=(edtValue)*0.000001875;

        IDEPIOmode0=(edtValue)*0.0000909091;

        IDEPIOmode1=(edtValue)*0.0000576923;

        IDEPIOmode2=(edtValue)*0.0000361446;

        IDEPIOmode3=(edtValue)*0.000027027;

        IDEPIOmode4=(edtValue)*0.0000180723;

        IDEDMAmode0=(edtValue)*0.0000714286;

        IDEDMAmode1=(edtValue)*0.0000225564;

        IDEDMAmode2=(edtValue)*0.0000180723;

        IDEUDMAmode0=(edtValue)*0.0000180723;

        IDEUDMAmode1=(edtValue)*0.000012;

        IDEUDMAmode2=(edtValue)*0.0000090909;

        IDEUDMAmode3=(edtValue)*0.000006;

        IDEUDMAmode4=(edtValue)*0.0000045455;

        IDEUDMA33=(edtValue)*0.0000090909;

        IDEUDMA66=(edtValue)*0.0000045455;

        USB=(edtValue)*0.0002;

        firewire=(edtValue)*0.000006;

        T0payload=(edtValue)*0.0428571429;

        T0B8ZSpayload=(edtValue)*0.0375;

        T1signal=(edtValue)*0.0015544041;

        T1payload=(edtValue)*0.0017857143;

        T1Zpayload=(edtValue)*0.0015544041;

        T1Csignal=(edtValue)*0.0007614213;

        T1Cpayload=(edtValue)*0.0008928571;

        T2signal=(edtValue)*0.0003802281;

        T3signal=(edtValue)*0.0000536481;

        T3payload=(edtValue)*0.0000637755;

        T3Zpayload=(edtValue)*0.0000558036;

        T4signal=(edtValue)*0.0000087535;

        EPTA1signal=(edtValue)*0.001171875;

        EPTA1payload=(edtValue)*0.00125;

        EPTA2signal=(edtValue)*0.0002840909;

        EPTA2payload=(edtValue)*0.0003125;

        EPTA3signal=(edtValue)*0.0000698324;

        EPTA3payload=(edtValue)*0.000078125;

        H0=(edtValue)*0.00625;

        H11=(edtValue)*0.0015625;

        H12=(edtValue)*0.00125;

        VirtualTributary1signal=(edtValue)*0.0013888889;

        VirtualTributary1payload=(edtValue)*0.0015544041;

        VirtualTributary2signal=(edtValue)*0.0010416667;

        VirtualTributary2payload=(edtValue)*0.001171875;

        VirtualTributary6signal=(edtValue)*0.0003802281;

        VirtualTributary6payload=(edtValue)*0.0004;

        STS1signal=(edtValue)*0.0000462963;

        STS1payload=(edtValue)*0.0000484848;

        STS3signal=(edtValue)*0.0000154321;

        STS3payload=(edtValue)*0.0000159642;

        STS3csignal=(edtValue)*0.0000154321;

        STS3cpayload=(edtValue)*0.0000159642;

        STS12signal=(edtValue)*0.000003858;

        STS24signal=(edtValue)*0.000001929;

        STS48signal=(edtValue)*9.645061728E-7;

        STS192signal=(edtValue)*2.411265432E-7;

        STM1signal=(edtValue)*0.0000154321;

        STM4signal=(edtValue)*0.000003858;

        STM16signal=(edtValue)*9.645061728E-7;

        STM64signal=(edtValue)*2.411265432E-7;



    }

    private void Modem1200() {

        bitpersecond=(edtValue)*1200;

        bytepersecond=(edtValue)*150;

        kilobitpersecondSI=(edtValue)*1.2;

        kilobytepersecondSI=(edtValue)*0.15;

        kilobitpersecond=(edtValue)*1.171875;

        kilobytepersecond=(edtValue)*0.146484375;

        megabitpersecondSI=(edtValue)*0.0012;

        megabytepersecondSI=(edtValue)*0.00015;

        megabitpersecond=(edtValue)*0.0011444092;

        megabytepersecond=(edtValue)*0.0001430511;

        gigabitpersecondSI=(edtValue)*0.0000012;

        gigabytepersecondSI=(edtValue)*1.5E-7;

        gigabitpersecond=(edtValue)*0.0000011176;

        gigabytepersecond=(edtValue)*1.396983861E-7;

        terabitpersecondSI=(edtValue)*1.2E-9;

        terabytepersecondSI=(edtValue)*1.5E-10;

        terabitpersecond=(edtValue)*1.091393642E-9;

        terabytepersecond=(edtValue)*1.364242052E-10;

        ethernet=(edtValue)*0.00012;

        ethernetfast=(edtValue)*0.000012;

        ethernetgigabit=(edtValue)*0.0000012;

        OC1=(edtValue)*0.0000231481;

        OC3=(edtValue)*0.000007716;

        OC12=(edtValue)*0.000001929;

        OC24=(edtValue)*9.645061728E-7;

        OC48=(edtValue)*4.822530864E-7;

        OC192=(edtValue)*1.205632716E-7;

        OC768=(edtValue)*3.01408179E-8;

        ISDNsinglechannel=(edtValue)*0.01875;

        ISDNdualchannel=(edtValue)*0.009375;

        modem110=(edtValue)*10.909090909;

        modem300=(edtValue)*4;

        modem1200=(edtValue)*1;

        modem2400=(edtValue)*0.5;

        modem9600=(edtValue)*0.125;

        modem14k=(edtValue)*0.0833333333;

        modem28k=(edtValue)*0.0416666667;

        modem33k=(edtValue)*0.0357142857;

        modem56k=(edtValue)*0.0214285714;

        SCSIAsync=(edtValue)*0.0001;

        SCSISync=(edtValue)*0.00003;

        SCSIFast=(edtValue)*0.000015;

        SCSIFastUltra=(edtValue)*0.0000075;


        SCSIFastWide=(edtValue)*0.0000075;

        SCSIFastUltraWide=(edtValue)*0.00000375;

        SCSIUltra2=(edtValue)*0.000001875;

        SCSIUltra3=(edtValue)*9.375E-7;

        SCSILVDUltra80=(edtValue)*0.000001875;


        SCSILVDUltra160=(edtValue)*9.375E-7;

        IDEPIOmode0=(edtValue)*0.0000454545;

        IDEPIOmode1=(edtValue)*0.0000288462;

        IDEPIOmode2=(edtValue)*0.0000180723;

        IDEPIOmode3=(edtValue)*0.0000135135;

        IDEPIOmode4=(edtValue)*0.0000090361;

        IDEDMAmode0=(edtValue)*0.0000357143;

        IDEDMAmode1=(edtValue)*0.0000112782;

        IDEDMAmode2=(edtValue)*0.0000090361;

        IDEUDMAmode0=(edtValue)*0.0000090361;

        IDEUDMAmode1=(edtValue)*0.000006;

        IDEUDMAmode2=(edtValue)*0.0000045455;

        IDEUDMAmode3=(edtValue)*0.000003;

        IDEUDMAmode4=(edtValue)*0.0000022727;

        IDEUDMA33=(edtValue)*0.0000045455;

        IDEUDMA66=(edtValue)*0.0000022727;

        USB=(edtValue)*0.0001;

        firewire=(edtValue)*0.000003;

        T0payload=(edtValue)*0.0214285714;

        T0B8ZSpayload=(edtValue)*0.01875;

        T1signal=(edtValue)*0.0007772021;

        T1payload=(edtValue)*0.0008928571;

        T1Zpayload=(edtValue)*0.0007772021;

        T1Csignal=(edtValue)*0.0003807107;

        T1Cpayload=(edtValue)*0.0004464286;

        T2signal=(edtValue)*0.0001901141;

        T3signal=(edtValue)*0.000026824;

        T3payload=(edtValue)*0.0000318878;

        T3Zpayload=(edtValue)*0.0000279018;

        T4signal=(edtValue)*0.0000043768;

        EPTA1signal=(edtValue)*0.0005859375;

        EPTA1payload=(edtValue)*0.000625;

        EPTA2signal=(edtValue)*0.0001420455;

        EPTA2payload=(edtValue)*0.00015625;

        EPTA3signal=(edtValue)*0.0000349162;

        EPTA3payload=(edtValue)*0.0000390625;

        H0=(edtValue)*0.003125;

        H11=(edtValue)*0.00078125;

        H12=(edtValue)*0.000625;

        VirtualTributary1signal=(edtValue)*0.0006944444;

        VirtualTributary1payload=(edtValue)*0.0007772021;

        VirtualTributary2signal=(edtValue)*0.0005208333;

        VirtualTributary2payload=(edtValue)*0.0005859375;

        VirtualTributary6signal=(edtValue)*0.0001901141;

        VirtualTributary6payload=(edtValue)*0.0002;

        STS1signal=(edtValue)*0.0000231481;

        STS1payload=(edtValue)*0.0000242424;

        STS3signal=(edtValue)*0.000007716;

        STS3payload=(edtValue)*0.0000079821;

        STS3csignal=(edtValue)*0.000007716;

        STS3cpayload=(edtValue)*0.0000079821;

        STS12signal=(edtValue)*0.000001929;

        STS24signal=(edtValue)*9.645061728E-7;

        STS48signal=(edtValue)*4.822530864E-7;

        STS192signal=(edtValue)*1.205632716E-7;

        STM1signal=(edtValue)*0.000007716;

        STM4signal=(edtValue)*0.000001929;

        STM16signal=(edtValue)*4.822530864E-7;

        STM64signal=(edtValue)*1.205632716E-7;


    }

    private void Modem300() {

        bitpersecond=(edtValue)*300;

        bytepersecond=(edtValue)*37.5;

        kilobitpersecondSI=(edtValue)*0.3;

        kilobytepersecondSI=(edtValue)*0.0375;

        kilobitpersecond=(edtValue)*0.29296875;

        kilobytepersecond=(edtValue)*0.0366210938;

        megabitpersecondSI=(edtValue)*0.0003;

        megabytepersecondSI=(edtValue)*0.0000375;

        megabitpersecond=(edtValue)*0.0002861023;

        megabytepersecond=(edtValue)*0.0000357628;

        gigabitpersecondSI=(edtValue)*3.E-7;

        gigabytepersecondSI=(edtValue)*3.75E-8;

        gigabitpersecond=(edtValue)*2.793967723E-7;

        gigabytepersecond=(edtValue)*3.492459654E-8;

        terabitpersecondSI=(edtValue)*3.E-10;

        terabytepersecondSI=(edtValue)*3.75E-11;

        terabitpersecond=(edtValue)*2.728484105E-10;

        terabytepersecond=(edtValue)*3.410605131E-11;

        ethernet=(edtValue)*0.00003;

        ethernetfast=(edtValue)*0.000003;

        ethernetgigabit=(edtValue)*3.E-7;

        OC1=(edtValue)*0.000005787;

        OC3=(edtValue)*0.000001929;

        OC12=(edtValue)*4.822530864E-7;

        OC24=(edtValue)*2.411265432E-7;

        OC48=(edtValue)*1.205632716E-7;

        OC192=(edtValue)*3.01408179E-8;

        OC768=(edtValue)*7.535204475E-9;

        ISDNsinglechannel=(edtValue)*0.0046875;

        ISDNdualchannel=(edtValue)*0.00234375;

        modem110=(edtValue)*2.7272727273;

        modem300=(edtValue)*1;

        modem1200=(edtValue)*0.25;

        modem2400=(edtValue)*0.125;

        modem9600=(edtValue)*0.03125;

        modem14k=(edtValue)*0.0208333333;

        modem28k=(edtValue)*0.0104166667;

        modem33k=(edtValue)*0.0089285714;

        modem56k=(edtValue)*0.0053571429;

        SCSIAsync=(edtValue)*0.000025;

        SCSISync=(edtValue)*0.0000075;

        SCSIFast=(edtValue)*0.00000375;

        SCSIFastUltra=(edtValue)*0.000001875;


        SCSIFastWide=(edtValue)*0.000001875;

        SCSIFastUltraWide=(edtValue)*9.375E-7;

        SCSIUltra2=(edtValue)*4.6875E-7;

        SCSIUltra3=(edtValue)*2.34375E-7;

        SCSILVDUltra80=(edtValue)*4.6875E-7;


        SCSILVDUltra160=(edtValue)*2.34375E-7;

        IDEPIOmode0=(edtValue)*0.0000113636;

        IDEPIOmode1=(edtValue)*0.0000072115;

        IDEPIOmode2=(edtValue)*0.0000045181;

        IDEPIOmode3=(edtValue)*0.0000033784;

        IDEPIOmode4=(edtValue)*0.000002259;

        IDEDMAmode0=(edtValue)*0.0000089286;

        IDEDMAmode1=(edtValue)*0.0000028195;

        IDEDMAmode2=(edtValue)*0.000002259;

        IDEUDMAmode0=(edtValue)*0.000002259;

        IDEUDMAmode1=(edtValue)*0.0000015;

        IDEUDMAmode2=(edtValue)*0.0000011364;

        IDEUDMAmode3=(edtValue)*7.5E-7;

        IDEUDMAmode4=(edtValue)*5.681818181E-7;

        IDEUDMA33=(edtValue)*0.0000011364;

        IDEUDMA66=(edtValue)*5.681818181E-7;

        USB=(edtValue)*0.000025;

        firewire=(edtValue)*7.5E-7;

        T0payload=(edtValue)*0.0053571429;

        T0B8ZSpayload=(edtValue)*0.0046875;

        T1signal=(edtValue)*0.0001943005;

        T1payload=(edtValue)*0.0002232143;

        T1Zpayload=(edtValue)*0.0001943005;

        T1Csignal=(edtValue)*0.0000951777;

        T1Cpayload=(edtValue)*0.0001116071;

        T2signal=(edtValue)*0.0000475285;

        T3signal=(edtValue)*0.000006706;

        T3payload=(edtValue)*0.0000079719;

        T3Zpayload=(edtValue)*0.0000069754;

        T4signal=(edtValue)*0.0000010942;

        EPTA1signal=(edtValue)*0.0001464844;

        EPTA1payload=(edtValue)*0.00015625;

        EPTA2signal=(edtValue)*0.0000355114;

        EPTA2payload=(edtValue)*0.0000390625;

        EPTA3signal=(edtValue)*0.0000087291;

        EPTA3payload=(edtValue)*0.0000097656;

        H0=(edtValue)*0.00078125;

        H11=(edtValue)*0.0001953125;

        H12=(edtValue)*0.00015625;

        VirtualTributary1signal=(edtValue)*0.0001736111;

        VirtualTributary1payload=(edtValue)*0.0001943005;

        VirtualTributary2signal=(edtValue)*0.0001302083;

        VirtualTributary2payload=(edtValue)*0.0001464844;

        VirtualTributary6signal=(edtValue)*0.0000475285;

        VirtualTributary6payload=(edtValue)*0.00005;

        STS1signal=(edtValue)*0.000005787;

        STS1payload=(edtValue)*0.0000060606;

        STS3signal=(edtValue)*0.000001929;

        STS3payload=(edtValue)*0.0000019955;

        STS3csignal=(edtValue)*0.000001929;

        STS3cpayload=(edtValue)*0.0000019955;

        STS12signal=(edtValue)*4.822530864E-7;

        STS24signal=(edtValue)*2.411265432E-7;

        STS48signal=(edtValue)*1.205632716E-7;

        STS192signal=(edtValue)*3.01408179E-8;

        STM1signal=(edtValue)*0.000001929;

        STM4signal=(edtValue)*4.822530864E-7;

        STM16signal=(edtValue)*1.205632716E-7;

        STM64signal=(edtValue)*3.01408179E-8;

    }

    private void Modem110() {

        bitpersecond=(edtValue)*110;

        bytepersecond=(edtValue)*13.75;

        kilobitpersecondSI=(edtValue)*0.11;

        kilobytepersecondSI=(edtValue)*0.01375;

        kilobitpersecond=(edtValue)*0.107421875;

        kilobytepersecond=(edtValue)*0.0134277344;

        megabitpersecondSI=(edtValue)*0.00011;

        megabytepersecondSI=(edtValue)*0.00001375;

        megabitpersecond=(edtValue)*0.0001049042;

        megabytepersecond=(edtValue)*0.000013113;

        gigabitpersecondSI=(edtValue)*1.099999999E-7;

        gigabytepersecondSI=(edtValue)*1.374999999E-8;

        gigabitpersecond=(edtValue)*1.024454832E-7;

        gigabytepersecond=(edtValue)*1.28056854E-8;

        terabitpersecondSI=(edtValue)*1.099999999E-10;

        terabytepersecondSI=(edtValue)*1.374999999E-11;

        terabitpersecond=(edtValue)*1.000444171E-10;

        terabytepersecond=(edtValue)*1.250555214E-11;

        ethernet=(edtValue)*0.000011;

        ethernetfast=(edtValue)*0.0000011;

        ethernetgigabit=(edtValue)*1.099999999E-7;

        OC1=(edtValue)*0.0000021219;

        OC3=(edtValue)*7.073045267E-7;

        OC12=(edtValue)*1.768261316E-7;

        OC24=(edtValue)*8.841306584E-8;

        OC48=(edtValue)*4.420653292E-8;

        OC192=(edtValue)*1.105163323E-8;

        OC768=(edtValue)*2.762908307E-9;

        ISDNsinglechannel=(edtValue)*0.00171875;

        ISDNdualchannel=(edtValue)*0.000859375;

        modem110=(edtValue)*1;

        modem300=(edtValue)*0.3666666667;

        modem1200=(edtValue)*0.0916666667;

        modem2400=(edtValue)*0.0458333333;

        modem9600=(edtValue)*0.0114583333;

        modem14k=(edtValue)*0.0076388889;

        modem28k=(edtValue)*0.0038194444;

        modem33k=(edtValue)*0.0032738095;

        modem56k=(edtValue)*0.0019642857;

        SCSIAsync=(edtValue)*0.0000091667;

        SCSISync=(edtValue)*0.00000275;

        SCSIFast=(edtValue)*0.000001375;

        SCSIFastUltra=(edtValue)*6.874999999E-7;


        SCSIFastWide=(edtValue)*6.874999999E-7;

        SCSIFastUltraWide=(edtValue)*3.437499999E-7;

        SCSIUltra2=(edtValue)*1.718749999E-7;

        SCSIUltra3=(edtValue)*8.593749999E-8;

        SCSILVDUltra80=(edtValue)*1.718749999E-7;


        SCSILVDUltra160=(edtValue)*8.593749999E-8;

        IDEPIOmode0=(edtValue)*0.0000041667;

        IDEPIOmode1=(edtValue)*0.0000026442;

        IDEPIOmode2=(edtValue)*0.0000016566;

        IDEPIOmode3=(edtValue)*0.0000012387;

        IDEPIOmode4=(edtValue)*8.28313253E-7;

        IDEDMAmode0=(edtValue)*0.0000032738;

        IDEDMAmode1=(edtValue)*0.0000010338;

        IDEDMAmode2=(edtValue)*8.28313253E-7;

        IDEUDMAmode0=(edtValue)*8.28313253E-7;

        IDEUDMAmode1=(edtValue)*5.499999999E-7;

        IDEUDMAmode2=(edtValue)*4.166666666E-7;

        IDEUDMAmode3=(edtValue)*2.749999999E-7;

        IDEUDMAmode4=(edtValue)*2.083333333E-7;

        IDEUDMA33=(edtValue)*4.166666666E-7;

        IDEUDMA66=(edtValue)*2.083333333E-7;

        USB=(edtValue)*0.0000091667;

        firewire=(edtValue)*2.749999999E-7;

        T0payload=(edtValue)*0.0019642857;

        T0B8ZSpayload=(edtValue)*0.00171875;

        T1signal=(edtValue)*0.0000712435;

        T1payload=(edtValue)*0.0000818452;

        T1Zpayload=(edtValue)*0.0000712435;

        T1Csignal=(edtValue)*0.0000348985;

        T1Cpayload=(edtValue)*0.0000409226;

        T2signal=(edtValue)*0.0000174271;

        T3signal=(edtValue)*0.0000024589;

        T3payload=(edtValue)*0.000002923;

        T3Zpayload=(edtValue)*0.0000025577;

        T4signal=(edtValue)*4.012021475E-7;

        EPTA1signal=(edtValue)*0.0000537109;

        EPTA1payload=(edtValue)*0.0000572917;

        EPTA2signal=(edtValue)*0.0000130208;

        EPTA2payload=(edtValue)*0.0000143229;

        EPTA3signal=(edtValue)*0.0000032007;

        EPTA3payload=(edtValue)*0.0000035807;

        H0=(edtValue)*0.0002864583;

        H11=(edtValue)*0.0000716146;

        H12=(edtValue)*0.0000572917;

        VirtualTributary1signal=(edtValue)*0.0000636574;

        VirtualTributary1payload=(edtValue)*0.0000712435;

        VirtualTributary2signal=(edtValue)*0.0000477431;

        VirtualTributary2payload=(edtValue)*0.0000537109;

        VirtualTributary6signal=(edtValue)*0.0000174271;

        VirtualTributary6payload=(edtValue)*0.0000183333;

        STS1signal=(edtValue)*0.0000021219;

        STS1payload=(edtValue)*0.0000022222;

        STS3signal=(edtValue)*7.073045267E-7;

        STS3payload=(edtValue)*7.31694338E-7;

        STS3csignal=(edtValue)*7.073045267E-7;

        STS3cpayload=(edtValue)*7.31694338E-7;

        STS12signal=(edtValue)*1.768261316E-7;

        STS24signal=(edtValue)*8.841306584E-8;

        STS48signal=(edtValue)*4.420653292E-8;

        STS192signal=(edtValue)*1.105163323E-8;

        STM1signal=(edtValue)*7.073045267E-7;

        STM4signal=(edtValue)*1.768261316E-7;

        STM16signal=(edtValue)*4.420653292E-8;

        STM64signal=(edtValue)*1.105163323E-8;

    }

    private void ISDNdualchannel() {
        bitpersecond=(edtValue)*128000;

        bytepersecond=(edtValue)*16000;

        kilobitpersecondSI=(edtValue)*128;

        kilobytepersecondSI=(edtValue)*16;

        kilobitpersecond=(edtValue)*125;

        kilobytepersecond=(edtValue)*15.625;

        megabitpersecondSI=(edtValue)*0.128;

        megabytepersecondSI=(edtValue)*0.016;

        megabitpersecond=(edtValue)*0.1220703125;

        megabytepersecond=(edtValue)*0.0152587891;

        gigabitpersecondSI=(edtValue)*0.000128;

        gigabytepersecondSI=(edtValue)*0.000016;

        gigabitpersecond=(edtValue)*0.0001192093;

        gigabytepersecond=(edtValue)*0.0000149012;

        terabitpersecondSI=(edtValue)*1.28E-7;

        terabytepersecondSI=(edtValue)*1.6E-8;

        terabitpersecond=(edtValue)*1.164153218E-7;

        terabytepersecond=(edtValue)*1.455191522E-8;

        ethernet=(edtValue)*0.0128;

        ethernetfast=(edtValue)*0.00128;

        ethernetgigabit=(edtValue)*0.000128;

        OC1=(edtValue)*0.0024691358;

        OC3=(edtValue)*0.0008230453;

        OC12=(edtValue)*0.0002057613;

        OC24=(edtValue)*0.0001028807;

        OC48=(edtValue)*0.0000514403;

        OC192=(edtValue)*0.0000128601;

        OC768=(edtValue)*0.000003215;

        ISDNsinglechannel=(edtValue)*2;

        ISDNdualchannel=(edtValue)*1;

        modem110=(edtValue)*1163.6363636;

        modem300=(edtValue)*426.66666667;

        modem1200=(edtValue)*106.66666667;

        modem2400=(edtValue)*53.333333333;

        modem9600=(edtValue)*13.333333333;

        modem14k=(edtValue)*8.8888888889;

        modem28k=(edtValue)*4.4444444444;

        modem33k=(edtValue)*3.8095238095;

        modem56k=(edtValue)*2.2857142857;

        SCSIAsync=(edtValue)*0.0106666667;

        SCSISync=(edtValue)*0.0032;

        SCSIFast=(edtValue)*0.0016;

        SCSIFastUltra=(edtValue)*0.0008;


        SCSIFastWide=(edtValue)*0.0008;

        SCSIFastUltraWide=(edtValue)*0.0004;

        SCSIUltra2=(edtValue)*0.0002;

        SCSIUltra3=(edtValue)*0.0001;

        SCSILVDUltra80=(edtValue)*0.0002;


        SCSILVDUltra160=(edtValue)*0.0001;

        IDEPIOmode0=(edtValue)*0.0048484848;

        IDEPIOmode1=(edtValue)*0.0030769231;

        IDEPIOmode2=(edtValue)*0.0019277108;

        IDEPIOmode3=(edtValue)*0.0014414414;

        IDEPIOmode4=(edtValue)*0.0009638554;

        IDEDMAmode0=(edtValue)*0.0038095238;

        IDEDMAmode1=(edtValue)*0.0012030075;

        IDEDMAmode2=(edtValue)*0.0009638554;

        IDEUDMAmode0=(edtValue)*0.0009638554;

        IDEUDMAmode1=(edtValue)*0.00064;

        IDEUDMAmode2=(edtValue)*0.0004848485;

        IDEUDMAmode3=(edtValue)*0.00032;

        IDEUDMAmode4=(edtValue)*0.0002424242;

        IDEUDMA33=(edtValue)*0.0004848485;

        IDEUDMA66=(edtValue)*0.0002424242;

        USB=(edtValue)*0.0106666667;

        firewire=(edtValue)*0.00032;

        T0payload=(edtValue)*2.2857142857;

        T0B8ZSpayload=(edtValue)*2;

        T1signal=(edtValue)*0.0829015544;

        T1payload=(edtValue)*0.0952380952;

        T1Zpayload=(edtValue)*0.0829015544;

        T1Csignal=(edtValue)*0.0406091371;

        T1Cpayload=(edtValue)*0.0476190476;

        T2signal=(edtValue)*0.020278834;

        T3signal=(edtValue)*0.0028612303;

        T3payload=(edtValue)*0.0034013605;

        T3Zpayload=(edtValue)*0.0029761905;

        T4signal=(edtValue)*0.0004668534;

        EPTA1signal=(edtValue)*0.0625;

        EPTA1payload=(edtValue)*0.0666666667;

        EPTA2signal=(edtValue)*0.0151515152;

        EPTA2payload=(edtValue)*0.0166666667;

        EPTA3signal=(edtValue)*0.0037243948;

        EPTA3payload=(edtValue)*0.0041666667;

        H0=(edtValue)*0.3333333333;

        H11=(edtValue)*0.0833333333;

        H12=(edtValue)*0.0666666667;

        VirtualTributary1signal=(edtValue)*0.0740740741;

        VirtualTributary1payload=(edtValue)*0.0829015544;

        VirtualTributary2signal=(edtValue)*0.0555555556;

        VirtualTributary2payload=(edtValue)*0.0625;

        VirtualTributary6signal=(edtValue)*0.020278834;

        VirtualTributary6payload=(edtValue)*0.0213333333;

        STS1signal=(edtValue)*0.0024691358;

        STS1payload=(edtValue)*0.0025858586;

        STS3signal=(edtValue)*0.0008230453;

        STS3payload=(edtValue)*0.0008514261;

        STS3csignal=(edtValue)*0.0008230453;

        STS3cpayload=(edtValue)*0.0008514261;

        STS12signal=(edtValue)*0.0002057613;

        STS24signal=(edtValue)*0.0001028807;

        STS48signal=(edtValue)*0.0000514403;

        STS192signal=(edtValue)*0.0000128601;

        STM1signal=(edtValue)*0.0008230453;

        STM4signal=(edtValue)*0.0002057613;

        STM16signal=(edtValue)*0.0000514403;

        STM64signal=(edtValue)*0.0000128601;

    }

    private void ISDNsinglechannel() {
        bitpersecond=(edtValue)*64000;

        bytepersecond=(edtValue)*8000;

        kilobitpersecondSI=(edtValue)*64;

        kilobytepersecondSI=(edtValue)*8;

        kilobitpersecond=(edtValue)*62.5;

        kilobytepersecond=(edtValue)*7.8125;

        megabitpersecondSI=(edtValue)*0.064;

        megabytepersecondSI=(edtValue)*0.008;

        megabitpersecond=(edtValue)*0.0610351563;

        megabytepersecond=(edtValue)*0.0076293945;

        gigabitpersecondSI=(edtValue)*0.000064;

        gigabytepersecondSI=(edtValue)*0.000008;

        gigabitpersecond=(edtValue)*0.0000596046;

        gigabytepersecond=(edtValue)*0.0000074506;

        terabitpersecondSI=(edtValue)*6.4E-8;

        terabytepersecondSI=(edtValue)*8.E-9;

        terabitpersecond=(edtValue)*5.820766091E-8;

        terabytepersecond=(edtValue)*7.275957614E-9;

        ethernet=(edtValue)*0.0064;

        ethernetfast=(edtValue)*0.00064;

        ethernetgigabit=(edtValue)*0.000064;

        OC1=(edtValue)*0.0012345679;

        OC3=(edtValue)*0.0004115226;

        OC12=(edtValue)*0.0001028807;

        OC24=(edtValue)*0.0000514403;

        OC48=(edtValue)*0.0000257202;

        OC192=(edtValue)*0.00000643;

        OC768=(edtValue)*0.0000016075;

        ISDNsinglechannel=(edtValue)*1;

        ISDNdualchannel=(edtValue)*0.5;

        modem110=(edtValue)*581.81818182;

        modem300=(edtValue)*213.33333333;

        modem1200=(edtValue)*53.333333333;

        modem2400=(edtValue)*26.666666667;

        modem9600=(edtValue)*6.6666666667;

        modem14k=(edtValue)*4.4444444444;

        modem28k=(edtValue)*2.2222222222;

        modem33k=(edtValue)*1.9047619048;

        modem56k=(edtValue)*1.1428571429;

        SCSIAsync=(edtValue)*0.0053333333;

        SCSISync=(edtValue)*0.0016;

        SCSIFast=(edtValue)*0.0008;

        SCSIFastUltra=(edtValue)*0.0004;


        SCSIFastWide=(edtValue)*0.0004;

        SCSIFastUltraWide=(edtValue)*0.0002;

        SCSIUltra2=(edtValue)*0.0001;

        SCSIUltra3=(edtValue)*0.00005;

        SCSILVDUltra80=(edtValue)*0.0001;


        SCSILVDUltra160=(edtValue)*0.00005;

        IDEPIOmode0=(edtValue)*0.0024242424;

        IDEPIOmode1=(edtValue)*0.0015384615;

        IDEPIOmode2=(edtValue)*0.0009638554;

        IDEPIOmode3=(edtValue)*0.0007207207;

        IDEPIOmode4=(edtValue)*0.0004819277;

        IDEDMAmode0=(edtValue)*0.0019047619;

        IDEDMAmode1=(edtValue)*0.0006015038;

        IDEDMAmode2=(edtValue)*0.0004819277;

        IDEUDMAmode0=(edtValue)*0.0004819277;

        IDEUDMAmode1=(edtValue)*0.00032;

        IDEUDMAmode2=(edtValue)*0.0002424242;

        IDEUDMAmode3=(edtValue)*0.00016;

        IDEUDMAmode4=(edtValue)*0.0001212121;

        IDEUDMA33=(edtValue)*0.0002424242;

        IDEUDMA66=(edtValue)*0.0001212121;

        USB=(edtValue)*0.0053333333;

        firewire=(edtValue)*0.00016;

        T0payload=(edtValue)*1.1428571429;

        T0B8ZSpayload=(edtValue)*1;

        T1signal=(edtValue)*0.0414507772;

        T1payload=(edtValue)*0.0476190476;

        T1Zpayload=(edtValue)*0.0414507772;

        T1Csignal=(edtValue)*0.0203045685;

        T1Cpayload=(edtValue)*0.0238095238;

        T2signal=(edtValue)*0.010139417;

        T3signal=(edtValue)*0.0014306152;

        T3payload=(edtValue)*0.0017006803;

        T3Zpayload=(edtValue)*0.0014880952;

        T4signal=(edtValue)*0.0002334267;

        EPTA1signal=(edtValue)*0.03125;

        EPTA1payload=(edtValue)*0.0333333333;

        EPTA2signal=(edtValue)*0.0075757576;

        EPTA2payload=(edtValue)*0.0083333333;

        EPTA3signal=(edtValue)*0.0018621974;

        EPTA3payload=(edtValue)*0.0020833333;

        H0=(edtValue)*0.1666666667;

        H11=(edtValue)*0.0416666667;

        H12=(edtValue)*0.0333333333;

        VirtualTributary1signal=(edtValue)*0.037037037;

        VirtualTributary1payload=(edtValue)*0.0414507772;

        VirtualTributary2signal=(edtValue)*0.0277777778;

        VirtualTributary2payload=(edtValue)*0.03125;

        VirtualTributary6signal=(edtValue)*0.010139417;

        VirtualTributary6payload=(edtValue)*0.0106666667;

        STS1signal=(edtValue)*0.0012345679;

        STS1payload=(edtValue)*0.0012929293;

        STS3signal=(edtValue)*0.0004115226;

        STS3payload=(edtValue)*0.0004257131;

        STS3csignal=(edtValue)*0.0004115226;

        STS3cpayload=(edtValue)*0.0004257131;

        STS12signal=(edtValue)*0.0001028807;

        STS24signal=(edtValue)*0.0000514403;

        STS48signal=(edtValue)*0.0000257202;

        STS192signal=(edtValue)*0.00000643;

        STM1signal=(edtValue)*0.0004115226;

        STM4signal=(edtValue)*0.0001028807;

        STM16signal=(edtValue)*0.0000257202;

        STM64signal=(edtValue)*0.00000643;

    }

    private void oc768() {
        bitpersecond=(edtValue)*0.39813120000E-1;

        bytepersecond=(edtValue)*0.4976640000E-1;

        kilobitpersecondSI=(edtValue)*39813120;

        kilobytepersecondSI=(edtValue)*4976640;

        kilobitpersecond=(edtValue)*38880000;

        kilobytepersecond=(edtValue)*4860000;

        megabitpersecondSI=(edtValue)*39813.12;

        megabytepersecondSI=(edtValue)*4976.64;

        megabitpersecond=(edtValue)*37968.75;

        megabytepersecond=(edtValue)*4746.09375;

        gigabitpersecondSI=(edtValue)*39.81312;

        gigabytepersecondSI=(edtValue)*4.97664;

        gigabitpersecond=(edtValue)*37.078857422;

        gigabytepersecond=(edtValue)*4.6348571777;

        terabitpersecondSI=(edtValue)*0.03981312;

        terabytepersecondSI=(edtValue)*0.00497664;

        terabitpersecond=(edtValue)*0.0362098217;

        terabytepersecond=(edtValue)*0.0045262277;

        ethernet=(edtValue)*3981.312;

        ethernetfast=(edtValue)*398.1312;

        ethernetgigabit=(edtValue)*39.81312;

        OC1=(edtValue)*768;

        OC3=(edtValue)*256;

        OC12=(edtValue)*64;

        OC24=(edtValue)*32;

        OC48=(edtValue)*16;

        OC192=(edtValue)*4;

        OC768=(edtValue)*1;

        ISDNsinglechannel=(edtValue)*622080;

        ISDNdualchannel=(edtValue)*311040;

        modem110=(edtValue)*361937454.55;

        modem300=(edtValue)*132710400;

        modem1200=(edtValue)*33177600;

        modem2400=(edtValue)*16588800;

        modem9600=(edtValue)*4147200;

        modem14k=(edtValue)*2764800;

        modem28k=(edtValue)*1382400;

        modem33k=(edtValue)*1184914.2857;

        modem56k=(edtValue)*710948.57143;

        SCSIAsync=(edtValue)*3317.76;

        SCSISync=(edtValue)*995.328;

        SCSIFast=(edtValue)*497.664;

        SCSIFastUltra=(edtValue)*248.832;


        SCSIFastWide=(edtValue)*248.832;

        SCSIFastUltraWide=(edtValue)*124.416;

        SCSIUltra2=(edtValue)*62.208;

        SCSIUltra3=(edtValue)*31.104;

        SCSILVDUltra80=(edtValue)*62.208;


        SCSILVDUltra160=(edtValue)*31.104;

        IDEPIOmode0=(edtValue)*1508.0727273;

        IDEPIOmode1=(edtValue)*957.04615385;

        IDEPIOmode2=(edtValue)*599.59518072;

        IDEPIOmode3=(edtValue)*448.34594595;

        IDEPIOmode4=(edtValue)*299.79759036;

        IDEDMAmode0=(edtValue)*1184.9142857;

        IDEDMAmode1=(edtValue)*374.18345865;

        IDEDMAmode2=(edtValue)*299.79759036;

        IDEUDMAmode0=(edtValue)*299.79759036;

        IDEUDMAmode1=(edtValue)*199.0656;

        IDEUDMAmode2=(edtValue)*150.80727273;

        IDEUDMAmode3=(edtValue)*99.5328;

        IDEUDMAmode4=(edtValue)*75.403636364;

        IDEUDMA33=(edtValue)*150.80727273;

        IDEUDMA66=(edtValue)*75.403636364;

        USB=(edtValue)*3317.76;

        firewire=(edtValue)*99.5328;

        T0payload=(edtValue)*710948.57143;

        T0B8ZSpayload=(edtValue)*622080;

        T1signal=(edtValue)*25785.699482;

        T1payload=(edtValue)*29622.857143;

        T1Zpayload=(edtValue)*25785.699482;

        T1Csignal=(edtValue)*12631.06599;

        T1Cpayload=(edtValue)*14811.428571;

        T2signal=(edtValue)*6307.5285171;

        T3signal=(edtValue)*889.95708155;

        T3payload=(edtValue)*1057.9591837;

        T3Zpayload=(edtValue)*925.71428571;

        T4signal=(edtValue)*145.21008403;

        EPTA1signal=(edtValue)*19440;

        EPTA1payload=(edtValue)*20736;

        EPTA2signal=(edtValue)*4712.7272727;

        EPTA2payload=(edtValue)*5184;

        EPTA3signal=(edtValue)*1158.4357542;

        EPTA3payload=(edtValue)*1296;

        H0=(edtValue)*103680;

        H11=(edtValue)*25920;

        H12=(edtValue)*20736;

        VirtualTributary1signal=(edtValue)*23040;

        VirtualTributary1payload=(edtValue)*25785.699482;

        VirtualTributary2signal=(edtValue)*17280;

        VirtualTributary2payload=(edtValue)*19440;

        VirtualTributary6signal=(edtValue)*6307.5285171;

        VirtualTributary6payload=(edtValue)*6635.52;

        STS1signal=(edtValue)*768;

        STS1payload=(edtValue)*804.30545455;

        STS3signal=(edtValue)*256;

        STS3payload=(edtValue)*264.82758621;

        STS3csignal=(edtValue)*256;

        STS3cpayload=(edtValue)*264.82758621;

        STS12signal=(edtValue)*64;

        STS24signal=(edtValue)*32;

        STS48signal=(edtValue)*16;

        STS192signal=(edtValue)*4;

        STM1signal=(edtValue)*256;

        STM4signal=(edtValue)*64;

        STM16signal=(edtValue)*16;

        STM64signal=(edtValue)*4;

    }

    private void oc192() {


        bitpersecond=(edtValue)*0.9953280000E-1;

        bytepersecond=(edtValue)*1244160000;

        kilobitpersecondSI=(edtValue)*9953280;

        kilobytepersecondSI=(edtValue)*1244160;

        kilobitpersecond=(edtValue)*9720000;

        kilobytepersecond=(edtValue)*1215000;

        megabitpersecondSI=(edtValue)*9953.28;

        megabytepersecondSI=(edtValue)*1244.16;

        megabitpersecond=(edtValue)*9492.1875;

        megabytepersecond=(edtValue)*1186.5234375;

        gigabitpersecondSI=(edtValue)*9.95328;

        gigabytepersecondSI=(edtValue)*1.24416;

        gigabitpersecond=(edtValue)*9.2697143555;

        gigabytepersecond=(edtValue)*1.1587142944;

        terabitpersecondSI=(edtValue)*0.00995328;

        terabytepersecondSI=(edtValue)*0.00124416;

        terabitpersecond=(edtValue)*0.0090524554;

        terabytepersecond=(edtValue)*0.0011315569;

        ethernet=(edtValue)*995.328;

        ethernetfast=(edtValue)*99.5328;

        ethernetgigabit=(edtValue)*9.95328;

        OC1=(edtValue)*192;

        OC3=(edtValue)*64;

        OC12=(edtValue)*16;

        OC24=(edtValue)*8;

        OC48=(edtValue)*4;

        OC192=(edtValue)*1;

        OC768=(edtValue)*0.25;

        ISDNsinglechannel=(edtValue)*155520;

        ISDNdualchannel=(edtValue)*77760;

        modem110=(edtValue)*90484363.636;

        modem300=(edtValue)*33177600;

        modem1200=(edtValue)*8294400;

        modem2400=(edtValue)*4147200;

        modem9600=(edtValue)*1036800;

        modem14k=(edtValue)*691200;

        modem28k=(edtValue)*345600;

        modem33k=(edtValue)*296228.57143;

        modem56k=(edtValue)*177737.14286;

        SCSIAsync=(edtValue)*829.44;

        SCSISync=(edtValue)*248.832;

        SCSIFast=(edtValue)*124.416;

        SCSIFastUltra=(edtValue)*62.208;


        SCSIFastWide=(edtValue)*62.208;

        SCSIFastUltraWide=(edtValue)*31.104;

        SCSIUltra2=(edtValue)*15.552;

        SCSIUltra3=(edtValue)*7.776;

        SCSILVDUltra80=(edtValue)*15.552;


        SCSILVDUltra160=(edtValue)*7.776;

        IDEPIOmode0=(edtValue)*377.01818182;

        IDEPIOmode1=(edtValue)*239.26153846;

        IDEPIOmode2=(edtValue)*149.89879518;

        IDEPIOmode3=(edtValue)*112.08648649;

        IDEPIOmode4=(edtValue)*74.94939759;

        IDEDMAmode0=(edtValue)*296.22857143;

        IDEDMAmode1=(edtValue)*93.545864662;

        IDEDMAmode2=(edtValue)*74.94939759;

        IDEUDMAmode0=(edtValue)*74.94939759;

        IDEUDMAmode1=(edtValue)*49.7664;

        IDEUDMAmode2=(edtValue)*37.701818182;

        IDEUDMAmode3=(edtValue)*24.8832;

        IDEUDMAmode4=(edtValue)*18.850909091;

        IDEUDMA33=(edtValue)*37.701818182;

        IDEUDMA66=(edtValue)*18.850909091;

        USB=(edtValue)*829.44;

        firewire=(edtValue)*24.8832;

        T0payload=(edtValue)*177737.14286;

        T0B8ZSpayload=(edtValue)*155520;

        T1signal=(edtValue)*6446.4248705;

        T1payload=(edtValue)*7405.7142857;

        T1Zpayload=(edtValue)*6446.4248705;

        T1Csignal=(edtValue)*3157.7664975;

        T1Cpayload=(edtValue)*3702.8571429;

        T2signal=(edtValue)*1576.8821293;

        T3signal=(edtValue)*222.48927039;

        T3payload=(edtValue)*264.48979592;

        T3Zpayload=(edtValue)*231.42857143;

        T4signal=(edtValue)*36.302521008;

        EPTA1signal=(edtValue)*4860;

        EPTA1payload=(edtValue)*5184;

        EPTA2signal=(edtValue)*1178.1818182;

        EPTA2payload=(edtValue)*1296;

        EPTA3signal=(edtValue)*289.60893855;

        EPTA3payload=(edtValue)*324;

        H0=(edtValue)*25920;

        H11=(edtValue)*6480;

        H12=(edtValue)*5184;

        VirtualTributary1signal=(edtValue)*5760;

        VirtualTributary1payload=(edtValue)*6446.4248705;

        VirtualTributary2signal=(edtValue)*4320;

        VirtualTributary2payload=(edtValue)*4860;

        VirtualTributary6signal=(edtValue)*1576.8821293;

        VirtualTributary6payload=(edtValue)*1658.88;

        STS1signal=(edtValue)*192;

        STS1payload=(edtValue)*201.07636364;

        STS3signal=(edtValue)*64;

        STS3payload=(edtValue)*66.206896552;

        STS3csignal=(edtValue)*64;

        STS3cpayload=(edtValue)*66.206896552;

        STS12signal=(edtValue)*16;

        STS24signal=(edtValue)*8;

        STS48signal=(edtValue)*4;

        STS192signal=(edtValue)*1;

        STM1signal=(edtValue)*64;

        STM4signal=(edtValue)*16;

        STM16signal=(edtValue)*4;

        STM64signal=(edtValue)*1;
    }

    private void oc48() {
        bitpersecond=(edtValue)*0.2488320000E-1;

        bytepersecond=(edtValue)*311040000;

        kilobitpersecondSI=(edtValue)*2488320;

        kilobytepersecondSI=(edtValue)*311040;

        kilobitpersecond=(edtValue)*2430000;

        kilobytepersecond=(edtValue)*303750;

        megabitpersecondSI=(edtValue)*2488.32;

        megabytepersecondSI=(edtValue)*311.04;

        megabitpersecond=(edtValue)*2373.046875;

        megabytepersecond=(edtValue)*296.63085937;

        gigabitpersecondSI=(edtValue)*2.48832;

        gigabytepersecondSI=(edtValue)*0.31104;

        gigabitpersecond=(edtValue)*2.3174285889;

        gigabytepersecond=(edtValue)*0.2896785736;

        terabitpersecondSI=(edtValue)*0.00248832;

        terabytepersecondSI=(edtValue)*0.00031104;

        terabitpersecond=(edtValue)*0.0022631139;

        terabytepersecond=(edtValue)*0.0002828892;

        ethernet=(edtValue)*248.832;

        ethernetfast=(edtValue)*24.8832;

        ethernetgigabit=(edtValue)*2.48832;

        OC1=(edtValue)*48;

        OC3=(edtValue)*16;

        OC12=(edtValue)*4;

        OC24=(edtValue)*2;

        OC48=(edtValue)*1;

        OC192=(edtValue)*0.25;

        OC768=(edtValue)*0.0625;

        ISDNsinglechannel=(edtValue)*38880;

        ISDNdualchannel=(edtValue)*19440;

        modem110=(edtValue)*22621090.909;

        modem300=(edtValue)*8294400;

        modem1200=(edtValue)*2073600;

        modem2400=(edtValue)*1036800;

        modem9600=(edtValue)*259200;

        modem14k=(edtValue)*172800;

        modem28k=(edtValue)*86400;

        modem33k=(edtValue)*74057.142857;

        modem56k=(edtValue)*44434.285714;

        SCSIAsync=(edtValue)*207.36;

        SCSISync=(edtValue)*62.208;

        SCSIFast=(edtValue)*31.104;

        SCSIFastUltra=(edtValue)*15.552;


        SCSIFastWide=(edtValue)*15.552;

        SCSIFastUltraWide=(edtValue)*7.776;

        SCSIUltra2=(edtValue)*3.888;

        SCSIUltra3=(edtValue)*1.944;

        SCSILVDUltra80=(edtValue)*3.888;


        SCSILVDUltra160=(edtValue)*1.944;

        IDEPIOmode0=(edtValue)*94.254545455;

        IDEPIOmode1=(edtValue)*59.815384615;

        IDEPIOmode2=(edtValue)*37.474698795;

        IDEPIOmode3=(edtValue)*28.021621622;

        IDEPIOmode4=(edtValue)*18.737349398;

        IDEDMAmode0=(edtValue)*74.057142857;

        IDEDMAmode1=(edtValue)*23.386466165;

        IDEDMAmode2=(edtValue)*18.737349398;

        IDEUDMAmode0=(edtValue)*18.737349398;

        IDEUDMAmode1=(edtValue)*12.4416;

        IDEUDMAmode2=(edtValue)*9.4254545455;

        IDEUDMAmode3=(edtValue)*6.2208;

        IDEUDMAmode4=(edtValue)*4.7127272727;

        IDEUDMA33=(edtValue)*9.4254545455;

        IDEUDMA66=(edtValue)*4.7127272727;

        USB=(edtValue)*207.36;

        firewire=(edtValue)*6.2208;

        T0payload=(edtValue)*44434.285714;

        T0B8ZSpayload=(edtValue)*38880;

        T1signal=(edtValue)*1611.6062176;

        T1payload=(edtValue)*1851.4285714;

        T1Zpayload=(edtValue)*1611.6062176;

        T1Csignal=(edtValue)*789.44162437;

        T1Cpayload=(edtValue)*925.71428571;

        T2signal=(edtValue)*394.22053232;

        T3signal=(edtValue)*55.622317597;

        T3payload=(edtValue)*66.12244898;

        T3Zpayload=(edtValue)*57.857142857;

        T4signal=(edtValue)*9.0756302521;

        EPTA1signal=(edtValue)*1215;

        EPTA1payload=(edtValue)*1296;

        EPTA2signal=(edtValue)*294.54545455;

        EPTA2payload=(edtValue)*324;

        EPTA3signal=(edtValue)*72.402234637;

        EPTA3payload=(edtValue)*81;

        H0=(edtValue)*6480;

        H11=(edtValue)*1620;

        H12=(edtValue)*1296;

        VirtualTributary1signal=(edtValue)*1440;

        VirtualTributary1payload=(edtValue)*1611.6062176;

        VirtualTributary2signal=(edtValue)*1080;

        VirtualTributary2payload=(edtValue)*1215;

        VirtualTributary6signal=(edtValue)*394.22053232;

        VirtualTributary6payload=(edtValue)*414.72;

        STS1signal=(edtValue)*48;

        STS1payload=(edtValue)*50.269090909;

        STS3signal=(edtValue)*16;

        STS3payload=(edtValue)*16.551724138;

        STS3csignal=(edtValue)*16;


        STS3cpayload=(edtValue)*16.551724138;

        STS12signal=(edtValue)*4;

        STS24signal=(edtValue)*2;

        STS48signal=(edtValue)*1;

        STS192signal=(edtValue)*0.25;

        STM1signal=(edtValue)*16;

        STM4signal=(edtValue)*4;

        STM16signal=(edtValue)*1;

        STM64signal=(edtValue)*0.25;

    }

    private void oc24() {


        bitpersecond=(edtValue)*1244160000;
        bytepersecond=(edtValue)*155520000;

        kilobitpersecondSI=(edtValue)*1244160;

        kilobytepersecondSI=(edtValue)*155520;

        kilobitpersecond=(edtValue)*1215000;

        kilobytepersecond=(edtValue)*151875;

        megabitpersecondSI=(edtValue)*1244.16;

        megabytepersecondSI=(edtValue)*155.52;

        megabitpersecond=(edtValue)*1186.5234375;

        megabytepersecond=(edtValue)*148.31542969;

        gigabitpersecondSI=(edtValue)*1.24416;

        gigabytepersecondSI=(edtValue)*0.15552;

        gigabitpersecond=(edtValue)*1.1587142944;

        gigabytepersecond=(edtValue)*0.1448392868;

        terabitpersecondSI=(edtValue)*0.00124416;

        terabytepersecondSI=(edtValue)*0.00015552;

        terabitpersecond=(edtValue)*0.0011315569;

        terabytepersecond=(edtValue)*0.0001414446;

        ethernet=(edtValue)*124.416;

        ethernetfast=(edtValue)*12.4416;

        ethernetgigabit=(edtValue)*1.24416;

        OC1=(edtValue)*24;

        OC3=(edtValue)*8;

        OC12=(edtValue)*2;

        OC24=(edtValue)*1;

        OC48=(edtValue)*0.5;

        OC192=(edtValue)*0.125;

        OC768=(edtValue)*0.03125;

        ISDNsinglechannel=(edtValue)*19440;

        ISDNdualchannel=(edtValue)*9720;

        modem110=(edtValue)*11310545.455;

        modem300=(edtValue)*4147200;

        modem1200=(edtValue)*1036800;

        modem2400=(edtValue)*518400;

        modem9600=(edtValue)*129600;

        modem14k=(edtValue)*86400;

        modem28k=(edtValue)*43200;

        modem33k=(edtValue)*37028.571429;

        modem56k=(edtValue)*22217.142857;

        SCSIAsync=(edtValue)*103.68;

        SCSISync=(edtValue)*31.104;

        SCSIFast=(edtValue)*15.552;

        SCSIFastUltra=(edtValue)*7.776;


        SCSIFastWide=(edtValue)*7.776;

        SCSIFastUltraWide=(edtValue)*3.888;

        SCSIUltra2=(edtValue)*1.944;

        SCSIUltra3=(edtValue)*0.972;

        SCSILVDUltra80=(edtValue)*1.944;


        SCSILVDUltra160=(edtValue)*0.972;

        IDEPIOmode0=(edtValue)*47.127272727;

        IDEPIOmode1=(edtValue)*29.907692308;

        IDEPIOmode2=(edtValue)*18.737349398;

        IDEPIOmode3=(edtValue)*14.010810811;

        IDEPIOmode4=(edtValue)*9.3686746988;

        IDEDMAmode0=(edtValue)*37.028571429;

        IDEDMAmode1=(edtValue)*11.693233083;

        IDEDMAmode2=(edtValue)*9.3686746988;

        IDEUDMAmode0=(edtValue)*9.3686746988;

        IDEUDMAmode1=(edtValue)*6.2208;

        IDEUDMAmode2=(edtValue)*4.7127272727;

        IDEUDMAmode3=(edtValue)*3.1104;

        IDEUDMAmode4=(edtValue)*2.3563636364;

        IDEUDMA33=(edtValue)*4.7127272727;

        IDEUDMA66=(edtValue)*2.3563636364;

        USB=(edtValue)*103.68;

        firewire=(edtValue)*3.1104;

        T0payload=(edtValue)*22217.142857;

        T0B8ZSpayload=(edtValue)*19440;

        T1signal=(edtValue)*805.80310881;

        T1payload=(edtValue)*925.71428571;

        T1Zpayload=(edtValue)*805.80310881;

        T1Csignal=(edtValue)*394.72081218;

        T1Cpayload=(edtValue)*462.85714286;

        T2signal=(edtValue)*197.11026616;

        T3signal=(edtValue)*27.811158798;

        T3payload=(edtValue)*33.06122449;

        T3Zpayload=(edtValue)*28.928571429;

        T4signal=(edtValue)*4.5378151261;

        EPTA1signal=(edtValue)*607.5;

        EPTA1payload=(edtValue)*648;

        EPTA2signal=(edtValue)*147.27272727;

        EPTA2payload=(edtValue)*162;

        EPTA3signal=(edtValue)*36.201117318;

        EPTA3payload=(edtValue)*40.5;

        H0=(edtValue)*3240;

        H11=(edtValue)*810;

        H12=(edtValue)*648;

        VirtualTributary1signal=(edtValue)*720;

        VirtualTributary1payload=(edtValue)*805.80310881;

        VirtualTributary2signal=(edtValue)*540;

        VirtualTributary2payload=(edtValue)*607.5;

        VirtualTributary6signal=(edtValue)*197.11026616;

        VirtualTributary6payload=(edtValue)*207.36;

        STS1signal=(edtValue)*24;

        STS1payload=(edtValue)*25.134545455;

        STS3signal=(edtValue)*8;

        STS3payload=(edtValue)*8.275862069;

        STS3csignal=(edtValue)*8;

        STS3cpayload=(edtValue)*8.275862069;

        STS12signal=(edtValue)*2;

        STS24signal=(edtValue)*1;

        STS48signal=(edtValue)*0.5;

        STS192signal=(edtValue)*0.125;

        STM1signal=(edtValue)*8;

        STM4signal=(edtValue)*2;

        STM16signal=(edtValue)*0.5;

        STM64signal=(edtValue)*0.125;

    }

    private void oc12() {

        bitpersecond=(edtValue)*622080000;

        bytepersecond=(edtValue)*77760000;

        kilobitpersecondSI=(edtValue)*622080;

        kilobytepersecondSI=(edtValue)*77760;

        kilobitpersecond=(edtValue)*607500;

        kilobytepersecond=(edtValue)*75937.5;

        megabitpersecondSI=(edtValue)*622.08;

        megabytepersecondSI=(edtValue)*77.76;

        megabitpersecond=(edtValue)*593.26171875;

        megabytepersecond=(edtValue)*74.157714844;

        gigabitpersecondSI=(edtValue)*0.62208;

        gigabytepersecondSI=(edtValue)*0.07776;

        gigabitpersecond=(edtValue)*0.5793571472;

        gigabytepersecond=(edtValue)*0.0724196434;

        terabitpersecondSI=(edtValue)*0.00062208;

        terabytepersecondSI=(edtValue)*0.00007776;

        terabitpersecond=(edtValue)*0.0005657785;

        terabytepersecond=(edtValue)*0.0000707223;

        ethernet=(edtValue)*62.208;

        ethernetfast=(edtValue)*6.2208;

        ethernetgigabit=(edtValue)*0.62208;

        OC1=(edtValue)*12;

        OC3=(edtValue)*4;

        OC12=(edtValue)*1;

        OC24=(edtValue)*0.5;

        OC48=(edtValue)*0.25;

        OC192=(edtValue)*0.0625;

        OC768=(edtValue)*0.015625;

        ISDNsinglechannel=(edtValue)*9720;

        ISDNdualchannel=(edtValue)*4860;

        modem110=(edtValue)*5655272.7273;

        modem300=(edtValue)*2073600;

        modem1200=(edtValue)*518400;

        modem2400=(edtValue)*259200;

        modem9600=(edtValue)*64800;

        modem14k=(edtValue)*43200;

        modem28k=(edtValue)*21600;

        modem33k=(edtValue)*18514.285714;

        modem56k=(edtValue)*11108.571429;

        SCSIAsync=(edtValue)*51.84;

        SCSISync=(edtValue)*15.552;

        SCSIFast=(edtValue)*7.776;

        SCSIFastUltra=(edtValue)*3.888;


        SCSIFastWide=(edtValue)*3.888;

        SCSIFastUltraWide=(edtValue)*1.944;

        SCSIUltra2=(edtValue)*0.972;

        SCSIUltra3=(edtValue)*0.486;

        SCSILVDUltra80=(edtValue)*0.972;


        SCSILVDUltra160=(edtValue)*0.486;

        IDEPIOmode0=(edtValue)*23.563636364;

        IDEPIOmode1=(edtValue)*14.953846154;

        IDEPIOmode2=(edtValue)*9.3686746988;

        IDEPIOmode3=(edtValue)*7.0054054054;

        IDEPIOmode4=(edtValue)*4.6843373494;

        IDEDMAmode0=(edtValue)*18.514285714;

        IDEDMAmode1=(edtValue)*5.8466165414;

        IDEDMAmode2=(edtValue)*4.6843373494;

        IDEUDMAmode0=(edtValue)*4.6843373494;

        IDEUDMAmode1=(edtValue)*3.1104;

        IDEUDMAmode2=(edtValue)*2.3563636364;

        IDEUDMAmode3=(edtValue)*1.5552;

        IDEUDMAmode4=(edtValue)*1.1781818182;

        IDEUDMA33=(edtValue)*2.3563636364;

        IDEUDMA66=(edtValue)*1.1781818182;

        USB=(edtValue)*51.84;

        firewire=(edtValue)*1.5552;

        T0payload=(edtValue)*11108.571429;

        T0B8ZSpayload=(edtValue)*9720;

        T1signal=(edtValue)*402.9015544;

        T1payload=(edtValue)*462.85714286;

        T1Zpayload=(edtValue)*402.9015544;

        T1Csignal=(edtValue)*197.36040609;

        T1Cpayload=(edtValue)*231.42857143;

        T2signal=(edtValue)*98.55513308;

        T3signal=(edtValue)*13.905579399;

        T3payload=(edtValue)*16.530612245;

        T3Zpayload=(edtValue)*14.464285714;

        T4signal=(edtValue)*2.268907563;

        EPTA1signal=(edtValue)*303.75;

        EPTA1payload=(edtValue)*324;

        EPTA2signal=(edtValue)*73.636363636;

        EPTA2payload=(edtValue)*81;

        EPTA3signal=(edtValue)*18.100558659;

        EPTA3payload=(edtValue)*20.25;

        H0=(edtValue)*1620;

        H11=(edtValue)*405;

        H12=(edtValue)*324;

        VirtualTributary1signal=(edtValue)*360;

        VirtualTributary1payload=(edtValue)*402.9015544;

        VirtualTributary2signal=(edtValue)*270;

        VirtualTributary2payload=(edtValue)*303.75;

        VirtualTributary6signal=(edtValue)*98.55513308;

        VirtualTributary6payload=(edtValue)*103.68;

        STS1signal=(edtValue)*12;

        STS1payload=(edtValue)*12.567272727;

        STS3signal=(edtValue)*4;

        STS3payload=(edtValue)*4.1379310345;

        STS3csignal=(edtValue)*4;

        STS3cpayload=(edtValue)*4.1379310345;

        STS12signal=(edtValue)*1;

        STS24signal=(edtValue)*0.5;

        STS48signal=(edtValue)*0.25;

        STS192signal=(edtValue)*0.0625;

        STM1signal=(edtValue)*4;

        STM4signal=(edtValue)*1;

        STM16signal=(edtValue)*0.25;

        STM64signal=(edtValue)*0.0625;

    }

    private void oc3() {
        bitpersecond=(edtValue)*155520000;

        bytepersecond=(edtValue)*19440000;

        kilobitpersecondSI=(edtValue)*155520;

        kilobytepersecondSI=(edtValue)*19440;

        kilobitpersecond=(edtValue)*151875;

        kilobytepersecond=(edtValue)*18984.375;

        megabitpersecondSI=(edtValue)*155.52;

        megabytepersecondSI=(edtValue)*19.44;

        megabitpersecond=(edtValue)*148.31542969;

        megabytepersecond=(edtValue)*18.539428711;

        gigabitpersecondSI=(edtValue)*0.15552;

        gigabytepersecondSI=(edtValue)*0.01944;

        gigabitpersecond=(edtValue)*0.1448392868;

        gigabytepersecond=(edtValue)*0.0181049109;

        terabitpersecondSI=(edtValue)*0.00015552;

        terabytepersecondSI=(edtValue)*0.00001944;

        terabitpersecond=(edtValue)*0.0001414446;

        terabytepersecond=(edtValue)*0.0000176806;

        ethernet=(edtValue)*15.552;

        ethernetfast=(edtValue)*1.5552;

        ethernetgigabit=(edtValue)*0.15552;

        OC1=(edtValue)*3;

        OC3=(edtValue)*1;

        OC12=(edtValue)*0.25;

        OC24=(edtValue)*0.125;

        OC48=(edtValue)*0.0625;

        OC192=(edtValue)*0.015625;

        OC768=(edtValue)*0.00390625;

        ISDNsinglechannel=(edtValue)*2430;

        ISDNdualchannel=(edtValue)*1215;

        modem110=(edtValue)*1413818.1818;

        modem300=(edtValue)*518400;

        modem1200=(edtValue)*129600;

        modem2400=(edtValue)*64800;

        modem9600=(edtValue)*16200;

        modem14k=(edtValue)*10800;

        modem28k=(edtValue)*5400;

        modem33k=(edtValue)*4628.5714286;

        modem56k=(edtValue)*2777.1428571;

        SCSIAsync=(edtValue)*12.96;

        SCSISync=(edtValue)*3.888;

        SCSIFast=(edtValue)*1.944;

        SCSIFastUltra=(edtValue)*0.972;


        SCSIFastWide=(edtValue)*0.972;

        SCSIFastUltraWide=(edtValue)*0.486;

        SCSIUltra2=(edtValue)*0.243;

        SCSIUltra3=(edtValue)*0.1215;

        SCSILVDUltra80=(edtValue)*0.243;


        SCSILVDUltra160=(edtValue)*0.1215;

        IDEPIOmode0=(edtValue)*5.8909090909;

        IDEPIOmode1=(edtValue)*3.7384615385;

        IDEPIOmode2=(edtValue)*2.3421686747;

        IDEPIOmode3=(edtValue)*1.7513513514;

        IDEPIOmode4=(edtValue)*1.1710843373;

        IDEDMAmode0=(edtValue)*4.6285714286;

        IDEDMAmode1=(edtValue)*1.4616541353;

        IDEDMAmode2=(edtValue)*1.1710843373;

        IDEUDMAmode0=(edtValue)*1.1710843373;

        IDEUDMAmode1=(edtValue)*0.7776;

        IDEUDMAmode2=(edtValue)*0.5890909091;

        IDEUDMAmode3=(edtValue)*0.3888;

        IDEUDMAmode4=(edtValue)*0.2945454545;

        IDEUDMA33=(edtValue)*0.5890909091;

        IDEUDMA66=(edtValue)*0.2945454545;

        USB=(edtValue)*12.96;

        firewire=(edtValue)*0.3888;

        T0payload=(edtValue)*2777.1428571;

        T0B8ZSpayload=(edtValue)*2430;

        T1signal=(edtValue)*100.7253886;

        T1payload=(edtValue)*115.71428571;

        T1Zpayload=(edtValue)*100.7253886;

        T1Csignal=(edtValue)*49.340101523;

        T1Cpayload=(edtValue)*57.857142857;

        T2signal=(edtValue)*24.63878327;

        T3signal=(edtValue)*3.4763948498;

        T3payload=(edtValue)*4.1326530612;

        T3Zpayload=(edtValue)*3.6160714286;

        T4signal=(edtValue)*0.5672268908;

        EPTA1signal=(edtValue)*75.9375;

        EPTA1payload=(edtValue)*81;

        EPTA2signal=(edtValue)*18.409090909;

        EPTA2payload=(edtValue)*20.25;

        EPTA3signal=(edtValue)*4.5251396648;

        EPTA3payload=(edtValue)*5.0625;

        H0=(edtValue)*405;

        H11=(edtValue)*101.25;

        H12=(edtValue)*81;

        VirtualTributary1signal=(edtValue)*90;

        VirtualTributary1payload=(edtValue)*100.7253886;

        VirtualTributary2signal=(edtValue)*67.5;

        VirtualTributary2payload=(edtValue)*75.9375;

        VirtualTributary6signal=(edtValue)*24.63878327;

        VirtualTributary6payload=(edtValue)*25.92;

        STS1signal=(edtValue)*3;

        STS1payload=(edtValue)*3.1418181818;

        STS3signal=(edtValue)*1;

        STS3payload=(edtValue)*1.0344827586;

        STS3csignal=(edtValue)*1;

        STS3cpayload=(edtValue)*1.0344827586;

        STS12signal=(edtValue)*0.25;

        STS24signal=(edtValue)*0.125;

        STS48signal=(edtValue)*0.0625;

        STS192signal=(edtValue)*0.015625;

        STM1signal=(edtValue)*1;

        STM4signal=(edtValue)*0.25;

        STM16signal=(edtValue)*0.0625;

        STM64signal=(edtValue)*0.015625;

    }

    private void oc1() {
        bitpersecond=(edtValue)*51840000;

        bytepersecond=(edtValue)*6480000;

        kilobitpersecondSI=(edtValue)*51840;

        kilobytepersecondSI=(edtValue)*6480;

        kilobitpersecond=(edtValue)*50625;

        kilobytepersecond=(edtValue)*6328.125;

        megabitpersecondSI=(edtValue)*51.84;

        megabytepersecondSI=(edtValue)*6.48;

        megabitpersecond=(edtValue)*49.438476563;

        megabytepersecond=(edtValue)*6.1798095703;

        gigabitpersecondSI=(edtValue)*0.05184;

        gigabytepersecondSI=(edtValue)*0.00648;

        gigabitpersecond=(edtValue)*0.0482797623;

        gigabytepersecond=(edtValue)*0.0060349703;

        terabitpersecondSI=(edtValue)*0.00005184;

        terabytepersecondSI=(edtValue)*0.00000648;

        terabitpersecond=(edtValue)*0.0000471482;

        terabytepersecond=(edtValue)*0.0000058935;

        ethernet=(edtValue)*5.184;

        ethernetfast=(edtValue)*0.5184;

        ethernetgigabit=(edtValue)*0.05184;

        OC1=(edtValue)*1;

        OC3=(edtValue)*0.3333333333;

        OC12=(edtValue)*0.0833333333;

        OC24=(edtValue)*0.0416666667;

        OC48=(edtValue)*0.0208333333;

        OC192=(edtValue)*0.0052083333;

        OC768=(edtValue)*0.0013020833;

        ISDNsinglechannel=(edtValue)*810;

        ISDNdualchannel=(edtValue)*405;

        modem110=(edtValue)*471272.72727;

        modem300=(edtValue)*172800;

        modem1200=(edtValue)*43200;

        modem2400=(edtValue)*21600;

        modem9600=(edtValue)*5400;

        modem14k=(edtValue)*3600;

        modem28k=(edtValue)*1800;

        modem33k=(edtValue)*1542.8571429;

        modem56k=(edtValue)*925.71428571;

        SCSIAsync=(edtValue)*4.32;

        SCSISync=(edtValue)*1.296;

        SCSIFast=(edtValue)*0.648;

        SCSIFastUltra=(edtValue)*0.324;


        SCSIFastWide=(edtValue)*0.324;

        SCSIFastUltraWide=(edtValue)*0.162;

        SCSIUltra2=(edtValue)*0.081;

        SCSIUltra3=(edtValue)*0.0405;

        SCSILVDUltra80=(edtValue)*0.081;


        SCSILVDUltra160=(edtValue)*0.0405;

        IDEPIOmode0=(edtValue)*1.9636363636;

        IDEPIOmode1=(edtValue)*1.2461538462;

        IDEPIOmode2=(edtValue)*0.7807228916;

        IDEPIOmode3=(edtValue)*0.5837837838;

        IDEPIOmode4=(edtValue)*0.3903614458;

        IDEDMAmode0=(edtValue)*1.5428571429;

        IDEDMAmode1=(edtValue)*0.4872180451;

        IDEDMAmode2=(edtValue)*0.3903614458;

        IDEUDMAmode0=(edtValue)*0.3903614458;

        IDEUDMAmode1=(edtValue)*0.2592;

        IDEUDMAmode2=(edtValue)*0.1963636364;

        IDEUDMAmode3=(edtValue)*0.1296;

        IDEUDMAmode4=(edtValue)*0.0981818182;

        IDEUDMA33=(edtValue)*0.1963636364;

        IDEUDMA66=(edtValue)*0.0981818182;

        USB=(edtValue)*4.32;

        firewire=(edtValue)*0.1296;

        T0payload=(edtValue)*925.71428571;

        T0B8ZSpayload=(edtValue)*810;

        T1signal=(edtValue)*33.575129534;

        T1payload=(edtValue)*38.571428571;

        T1Zpayload=(edtValue)*33.575129534;

        T1Csignal=(edtValue)*16.446700508;

        T1Cpayload=(edtValue)*19.285714286;

        T2signal=(edtValue)*8.2129277567;

        T3signal=(edtValue)*1.1587982833;

        T3payload=(edtValue)*1.3775510204;

        T3Zpayload=(edtValue)*1.2053571429;

        T4signal=(edtValue)*0.1890756303;

        EPTA1signal=(edtValue)*25.3125;

        EPTA1payload=(edtValue)*27;

        EPTA2signal=(edtValue)*6.1363636364;

        EPTA2payload=(edtValue)*6.75;

        EPTA3signal=(edtValue)*1.5083798883;

        EPTA3payload=(edtValue)*1.6875;

        H0=(edtValue)*135;

        H11=(edtValue)*33.75;

        H12=(edtValue)*27;

        VirtualTributary1signal=(edtValue)*30;

        VirtualTributary1payload=(edtValue)*33.575129534;

        VirtualTributary2signal=(edtValue)*22.5;

        VirtualTributary2payload=(edtValue)*25.3125;

        VirtualTributary6signal=(edtValue)*8.2129277567;

        VirtualTributary6payload=(edtValue)*8.64;

        STS1signal=(edtValue)*1;

        STS1payload=(edtValue)*1.0472727273;

        STS3signal=(edtValue)*0.3333333333;

        STS3payload=(edtValue)*0.3448275862;

        STS3csignal=(edtValue)*0.3333333333;

        STS3cpayload=(edtValue)*0.3448275862;

        STS12signal=(edtValue)*0.0833333333;

        STS24signal=(edtValue)*0.0416666667;

        STS48signal=(edtValue)*0.0208333333;

        STS192signal=(edtValue)*0.0052083333;

        STM1signal=(edtValue)*0.3333333333;

        STM4signal=(edtValue)*0.0833333333;

        STM16signal=(edtValue)*0.0208333333;

        STM64signal=(edtValue)*0.0052083333;
    }

    private void ethernetgigabit() {
        bitpersecond=(edtValue)*1000000000;

        bytepersecond=(edtValue)*125000000;

        kilobitpersecondSI=(edtValue)*1000000;

        kilobytepersecondSI=(edtValue)*125000;

        kilobitpersecond=(edtValue)*976562.5;

        kilobytepersecond=(edtValue)*122070.3125;

        megabitpersecondSI=(edtValue)*1000;

        megabytepersecondSI=(edtValue)*125;

        megabitpersecond=(edtValue)*953.67431641;

        megabytepersecond=(edtValue)*119.20928955;

        gigabitpersecondSI=(edtValue)*1;

        gigabytepersecondSI=(edtValue)*0.125;

        gigabitpersecond=(edtValue)*0.9313225746;

        gigabytepersecond=(edtValue)*0.1164153218;

        terabitpersecondSI=(edtValue)*0.001;

        terabytepersecondSI=(edtValue)*0.000125;

        terabitpersecond=(edtValue)*0.0009094947;

        terabytepersecond=(edtValue)*0.0001136868;

        ethernet=(edtValue)*100;

        ethernetfast=(edtValue)*10;

        ethernetgigabit=(edtValue)*1;

        OC1=(edtValue)*19.290123457;

        OC3=(edtValue)*6.4300411523;

        OC12=(edtValue)*1.6075102881;

        OC24=(edtValue)*0.803755144;

        OC48=(edtValue)*0.401877572;

        OC192=(edtValue)*0.100469393;

        OC768=(edtValue)*0.0251173483;

        ISDNsinglechannel=(edtValue)*15625;

        ISDNdualchannel=(edtValue)*7812.5;

        modem110=(edtValue)*9090909.0909;

        modem300=(edtValue)*3333333.3333;

        modem1200=(edtValue)*833333.33333;

        modem2400=(edtValue)*416666.66667;

        modem9600=(edtValue)*104166.66667;

        modem14k=(edtValue)*69444.444444;

        modem28k=(edtValue)*34722.222222;

        modem33k=(edtValue)*29761.904762;

        modem56k=(edtValue)*17857.142857;

        SCSIAsync=(edtValue)*83.333333333;

        SCSISync=(edtValue)*25;

        SCSIFast=(edtValue)*12.5;

        SCSIFastUltra=(edtValue)*6.25;


        SCSIFastWide=(edtValue)*6.25;

        SCSIFastUltraWide=(edtValue)*3.125;

        SCSIUltra2=(edtValue)*1.5625;

        SCSIUltra3=(edtValue)*0.78125;

        SCSILVDUltra80=(edtValue)*1.5625;


        SCSILVDUltra160=(edtValue)*0.78125;

        IDEPIOmode0=(edtValue)*37.878787879;

        IDEPIOmode1=(edtValue)*24.038461538;

        IDEPIOmode2=(edtValue)*15.060240964;

        IDEPIOmode3=(edtValue)*11.261261261;

        IDEPIOmode4=(edtValue)*7.5301204819;

        IDEDMAmode0=(edtValue)*29.761904762;

        IDEDMAmode1=(edtValue)*9.3984962406;

        IDEDMAmode2=(edtValue)*7.5301204819;

        IDEUDMAmode0=(edtValue)*7.5301204819;

        IDEUDMAmode1=(edtValue)*5;

        IDEUDMAmode2=(edtValue)*3.7878787879;

        IDEUDMAmode3=(edtValue)*2.5;

        IDEUDMAmode4=(edtValue)*1.8939393939;

        IDEUDMA33=(edtValue)*3.7878787879;

        IDEUDMA66=(edtValue)*1.8939393939;

        USB=(edtValue)*83.333333333;

        firewire=(edtValue)*2.5;

        T0payload=(edtValue)*17857.142857;

        T0B8ZSpayload=(edtValue)*15625;

        T1signal=(edtValue)*647.66839378;

        T1payload=(edtValue)*744.04761905;

        T1Zpayload=(edtValue)*647.66839378;

        T1Csignal=(edtValue)*317.25888325;

        T1Cpayload=(edtValue)*372.02380952;

        T2signal=(edtValue)*158.42839037;

        T3signal=(edtValue)*22.353361946;

        T3payload=(edtValue)*26.573129252;

        T3Zpayload=(edtValue)*23.251488095;

        T4signal=(edtValue)*3.6472922502;

        EPTA1signal=(edtValue)*488.28125;

        EPTA1payload=(edtValue)*520.83333333;

        EPTA2signal=(edtValue)*118.37121212;

        EPTA2payload=(edtValue)*130.20833333;

        EPTA3signal=(edtValue)*29.096834264;

        EPTA3payload=(edtValue)*32.552083333;

        H0=(edtValue)*2604.1666667;

        H11=(edtValue)*651.04166667;

        H12=(edtValue)*520.83333333;

        VirtualTributary1signal=(edtValue)*578.7037037;

        VirtualTributary1payload=(edtValue)*647.66839378;

        VirtualTributary2signal=(edtValue)*434.02777778;

        VirtualTributary2payload=(edtValue)*488.28125;

        VirtualTributary6signal=(edtValue)*158.42839037;

        VirtualTributary6payload=(edtValue)*166.66666667;

        STS1signal=(edtValue)*19.290123457;

        STS1payload=(edtValue)*20.202020202;

        STS3signal=(edtValue)*6.4300411523;

        STS3payload=(edtValue)*6.6517667092;

        STS3csignal=(edtValue)*6.4300411523;

        STS3cpayload=(edtValue)*6.6517667092;

        STS12signal=(edtValue)*1.6075102881;

        STS24signal=(edtValue)*0.803755144;

        STS48signal=(edtValue)*0.401877572;

        STS192signal=(edtValue)*0.100469393;

        STM1signal=(edtValue)*6.4300411523;

        STM4signal=(edtValue)*1.6075102881;

        STM16signal=(edtValue)*0.401877572;

        STM64signal=(edtValue)*0.100469393;

    }

    private void Ethernetfast() {

        bitpersecond=(edtValue)*100000000;

        bytepersecond=(edtValue)*12500000;

        kilobitpersecondSI=(edtValue)*100000;

        kilobytepersecondSI=(edtValue)*12500;

        kilobitpersecond=(edtValue)*97656.25;

        kilobytepersecond=(edtValue)*12207.03125;

        megabitpersecondSI=(edtValue)*100;

        megabytepersecondSI=(edtValue)*12.5;

        megabitpersecond=(edtValue)*95.367431641;

        megabytepersecond=(edtValue)*11.920928955;

        gigabitpersecondSI=(edtValue)*0.1;

        gigabytepersecondSI=(edtValue)*0.0125;

        gigabitpersecond=(edtValue)*0.0931322575;

        gigabytepersecond=(edtValue)*0.0116415322;

        terabitpersecondSI=(edtValue)*0.0001;

        terabytepersecondSI=(edtValue)*0.0000125;

        terabitpersecond=(edtValue)*0.0000909495;

        terabytepersecond=(edtValue)*0.0000113687;

        ethernet=(edtValue)*10;

        ethernetfast=(edtValue)*1;

        ethernetgigabit=(edtValue)*0.1;

        OC1=(edtValue)*1.9290123457;

        OC3=(edtValue)*0.6430041152;

        OC12=(edtValue)*0.1607510288;

        OC24=(edtValue)*0.0803755144;

        OC48=(edtValue)*0.0401877572;

        OC192=(edtValue)*0.0100469393;

        OC768=(edtValue)*0.0025117348;

        ISDNsinglechannel=(edtValue)*1562.5;

        ISDNdualchannel=(edtValue)*781.25;

        modem110=(edtValue)*909090.90909;

        modem300=(edtValue)*333333.33333;

        modem1200=(edtValue)*83333.333333;

        modem2400=(edtValue)*41666.666667;

        modem9600=(edtValue)*10416.666667;

        modem14k=(edtValue)*6944.4444444;

        modem28k=(edtValue)*3472.2222222;

        modem33k=(edtValue)*2976.1904762;

        modem56k=(edtValue)*1785.7142857;

        SCSIAsync=(edtValue)*8.3333333333;

        SCSISync=(edtValue)*2.5;

        SCSIFast=(edtValue)*1.25;

        SCSIFastUltra=(edtValue)*0.625;


        SCSIFastWide=(edtValue)*0.625;

        SCSIFastUltraWide=(edtValue)*0.3125;

        SCSIUltra2=(edtValue)*0.15625;

        SCSIUltra3=(edtValue)*0.078125;

        SCSILVDUltra80=(edtValue)*0.15625;


        SCSILVDUltra160=(edtValue)*0.078125;

        IDEPIOmode0=(edtValue)*3.7878787879;

        IDEPIOmode1=(edtValue)*2.4038461538;

        IDEPIOmode2=(edtValue)*1.5060240964;

        IDEPIOmode3=(edtValue)*1.1261261261;

        IDEPIOmode4=(edtValue)*0.7530120482;

        IDEDMAmode0=(edtValue)*2.9761904762;

        IDEDMAmode1=(edtValue)*0.9398496241;

        IDEDMAmode2=(edtValue)*0.7530120482;

        IDEUDMAmode0=(edtValue)*0.7530120482;

        IDEUDMAmode1=(edtValue)*0.5;

        IDEUDMAmode2=(edtValue)*0.3787878788;

        IDEUDMAmode3=(edtValue)*0.25;

        IDEUDMAmode4=(edtValue)*0.1893939394;

        IDEUDMA33=(edtValue)*0.3787878788;

        IDEUDMA66=(edtValue)*0.1893939394;

        USB=(edtValue)*8.3333333333;

        firewire=(edtValue)*0.25;

        T0payload=(edtValue)*1785.7142857;

        T0B8ZSpayload=(edtValue)*1562.5;

        T1signal=(edtValue)*64.766839378;

        T1payload=(edtValue)*74.404761905;

        T1Zpayload=(edtValue)*64.766839378;

        T1Csignal=(edtValue)*31.725888325;

        T1Cpayload=(edtValue)*37.202380952;

        T2signal=(edtValue)*15.842839037;

        T3signal=(edtValue)*2.2353361946;

        T3payload=(edtValue)*2.6573129252;

        T3Zpayload=(edtValue)*2.3251488095;

        T4signal=(edtValue)*0.364729225;

        EPTA1signal=(edtValue)*48.828125;

        EPTA1payload=(edtValue)*52.083333333;

        EPTA2signal=(edtValue)*11.837121212;

        EPTA2payload=(edtValue)*13.020833333;

        EPTA3signal=(edtValue)*2.9096834264;

        EPTA3payload=(edtValue)*3.2552083333;

        H0=(edtValue)*260.41666667;

        H11=(edtValue)*65.104166667;

        H12=(edtValue)*52.083333333;

        VirtualTributary1signal=(edtValue)*57.87037037;

        VirtualTributary1payload=(edtValue)*64.766839378;

        VirtualTributary2signal=(edtValue)*43.402777778;

        VirtualTributary2payload=(edtValue)*48.828125;

        VirtualTributary6signal=(edtValue)*15.842839037;

        VirtualTributary6payload=(edtValue)*16.666666667;

        STS1signal=(edtValue)*1.9290123457;

        STS1payload=(edtValue)*2.0202020202;

        STS3signal=(edtValue)*0.6430041152;

        STS3payload=(edtValue)*0.6651766709;

        STS3csignal=(edtValue)*0.6430041152;

        STS3cpayload=(edtValue)*0.6651766709;

        STS12signal=(edtValue)*0.1607510288;

        STS24signal=(edtValue)*0.0803755144;

        STS48signal=(edtValue)*0.0401877572;

        STS192signal=(edtValue)*0.0100469393;

        STM1signal=(edtValue)*0.6430041152;

        STM4signal=(edtValue)*0.1607510288;

        STM16signal=(edtValue)*0.0401877572;

        STM64signal=(edtValue)*0.0100469393;

    }

    private void ethernet() {
        bitpersecond=(edtValue)*10000000;

        bytepersecond=(edtValue)*1250000;

        kilobitpersecondSI=(edtValue)*10000;

        kilobytepersecondSI=(edtValue)*1250;

        kilobitpersecond=(edtValue)*9765.625;

        kilobytepersecond=(edtValue)*1220.703125;

        megabitpersecondSI=(edtValue)*10;

        megabytepersecondSI=(edtValue)*1.25;

        megabitpersecond=(edtValue)*9.5367431641;

        megabytepersecond=(edtValue)*1.1920928955;

        gigabitpersecondSI=(edtValue)*0.01;

        gigabytepersecondSI=(edtValue)*0.00125;

        gigabitpersecond=(edtValue)*0.0093132257;

        gigabytepersecond=(edtValue)*0.0011641532;

        terabitpersecondSI=(edtValue)*0.00001;

        terabytepersecondSI=(edtValue)*0.00000125;

        terabitpersecond=(edtValue)*0.0000090949;

        terabytepersecond=(edtValue)*0.0000011369;

        ethernet=(edtValue)*1;

        ethernetfast=(edtValue)*0.1;

        ethernetgigabit=(edtValue)*0.01;

        OC1=(edtValue)*0.1929012346;

        OC3=(edtValue)*0.0643004115;

        OC12=(edtValue)*0.0160751029;

        OC24=(edtValue)*0.0080375514;

        OC48=(edtValue)*0.0040187757;

        OC192=(edtValue)*0.0010046939;

        OC768=(edtValue)*0.0002511735;

        ISDNsinglechannel=(edtValue)*156.25;

        ISDNdualchannel=(edtValue)*78.125;

        modem110=(edtValue)*90909.090909;

        modem300=(edtValue)*33333.333333;

        modem1200=(edtValue)*8333.3333333;

        modem2400=(edtValue)*4166.6666667;

        modem9600=(edtValue)*1041.6666667;

        modem14k=(edtValue)*694.44444444;

        modem28k=(edtValue)*347.22222222;

        modem33k=(edtValue)*297.61904762;

        modem56k=(edtValue)*178.57142857;

        SCSIAsync=(edtValue)*0.8333333333;

        SCSISync=(edtValue)*0.25;

        SCSIFast=(edtValue)*0.125;

        SCSIFastUltra=(edtValue)*0.0625;


        SCSIFastWide=(edtValue)*0.0625;

        SCSIFastUltraWide=(edtValue)*0.03125;

        SCSIUltra2=(edtValue)*0.015625;

        SCSIUltra3=(edtValue)*0.0078125;

        SCSILVDUltra80=(edtValue)*0.015625;


        SCSILVDUltra160=(edtValue)*0.0078125;

        IDEPIOmode0=(edtValue)*0.3787878788;

        IDEPIOmode1=(edtValue)*0.2403846154;

        IDEPIOmode2=(edtValue)*0.1506024096;

        IDEPIOmode3=(edtValue)*0.1126126126;

        IDEPIOmode4=(edtValue)*0.0753012048;

        IDEDMAmode0=(edtValue)*0.2976190476;

        IDEDMAmode1=(edtValue)*0.0939849624;

        IDEDMAmode2=(edtValue)*0.0753012048;

        IDEUDMAmode0=(edtValue)*0.0753012048;

        IDEUDMAmode1=(edtValue)*0.05;

        IDEUDMAmode2=(edtValue)*0.0378787879;

        IDEUDMAmode3=(edtValue)*0.025;

        IDEUDMAmode4=(edtValue)*0.0189393939;

        IDEUDMA33=(edtValue)*0.0378787879;

        IDEUDMA66=(edtValue)*0.0189393939;

        USB=(edtValue)*0.8333333333;

        firewire=(edtValue)*0.025;

        T0payload=(edtValue)*178.57142857;

        T0B8ZSpayload=(edtValue)*156.25;

        T1signal=(edtValue)*6.4766839378;

        T1payload=(edtValue)*7.4404761905;

        T1Zpayload=(edtValue)*6.4766839378;

        T1Csignal=(edtValue)*3.1725888325;

        T1Cpayload=(edtValue)*3.7202380952;

        T2signal=(edtValue)*1.5842839037;

        T3signal=(edtValue)*0.2235336195;

        T3payload=(edtValue)*0.2657312925;

        T3Zpayload=(edtValue)*0.232514881;

        T4signal=(edtValue)*0.0364729225;

        EPTA1signal=(edtValue)*4.8828125;

        EPTA1payload=(edtValue)*5.2083333333;

        EPTA2signal=(edtValue)*1.1837121212;

        EPTA2payload=(edtValue)*1.3020833333;

        EPTA3signal=(edtValue)*0.2909683426;

        EPTA3payload=(edtValue)*0.3255208333;

        H0=(edtValue)*26.041666667;

        H11=(edtValue)*6.5104166667;

        H12=(edtValue)*5.2083333333;

        VirtualTributary1signal=(edtValue)*5.787037037;

        VirtualTributary1payload=(edtValue)*6.4766839378;

        VirtualTributary2signal=(edtValue)*4.3402777778;

        VirtualTributary2payload=(edtValue)*4.8828125;

        VirtualTributary6signal=(edtValue)*1.5842839037;

        VirtualTributary6payload=(edtValue)*1.6666666667;

        STS1signal=(edtValue)*0.1929012346;

        STS1payload=(edtValue)*0.202020202;

        STS3signal=(edtValue)*0.0643004115;

        STS3payload=(edtValue)*0.0665176671;

        STS3csignal=(edtValue)*0.0643004115;

        STS3cpayload=(edtValue)*0.0665176671;

        STS12signal=(edtValue)*0.0160751029;

        STS24signal=(edtValue)*0.0080375514;

        STS48signal=(edtValue)*0.0040187757;

        STS192signal=(edtValue)*0.0010046939;

        STM1signal=(edtValue)*0.0643004115;

        STM4signal=(edtValue)*0.0160751029;

        STM16signal=(edtValue)*0.0040187757;

        STM64signal=(edtValue)*0.0010046939;


    }
    public void BitPerSecond()
    {

        bitpersecond=(edtValue)*1;

        bytepersecond=(edtValue)*0.125;

        kilobitpersecondSI=(edtValue)*0.001;

        kilobytepersecondSI=(edtValue)*0.000125;

        kilobitpersecond=(edtValue)*0.0009765625;

        kilobytepersecond=(edtValue)*0.0001220703;

        megabitpersecondSI=(edtValue)*0.000001;

        megabytepersecondSI=(edtValue)*1.25E-7;

        megabitpersecond=(edtValue)*9.536743164E-7;

        megabytepersecond=(edtValue)*1.192092895E-7;

        gigabitpersecondSI=(edtValue)*1.E-9;

        gigabytepersecondSI=(edtValue)*1.25E-10;

        gigabitpersecond=(edtValue)*9.313225746E-10;

        gigabytepersecond=(edtValue)*1.164153218E-10;

        terabitpersecondSI=(edtValue)*1.E-12;

        terabytepersecondSI=(edtValue)*1.25E-13;

        terabitpersecond=(edtValue)*9.094947017E-13;

        terabytepersecond=(edtValue)*1.136868377E-13;

        ethernet=(edtValue)*1.E-7;

        ethernetfast=(edtValue)*1.E-8;

        ethernetgigabit=(edtValue)*1.E-9;

        OC1=(edtValue)*1.929012345E-8;

        OC3=(edtValue)*6.430041152E-9;

        OC12=(edtValue)*1.607510288E-9;

        OC24=(edtValue)*8.03755144E-10;

        OC48=(edtValue)*4.01877572E-10;

        OC192=(edtValue)*1.00469393E-10;

        OC768=(edtValue)*2.511734825E-11;

        ISDNsinglechannel=(edtValue)*0.000015625;

        ISDNdualchannel=(edtValue)*0.0000078125;

        modem110=(edtValue)*0.0090909091;

        modem300=(edtValue)*0.0033333333;

        modem1200=(edtValue)*0.0008333333;

        modem2400=(edtValue)*0.0004166667;

        modem9600=(edtValue)*0.0001041667;

        modem14k=(edtValue)*0.0000694444;

        modem28k=(edtValue)*0.0000347222;

        modem33k=(edtValue)*0.0000297619;

        modem56k=(edtValue)*0.0000178571;

        SCSIAsync=(edtValue)*8.333333333E-8;

        SCSISync=(edtValue)*2.5E-8;

        SCSIFast=(edtValue)*1.25E-8;

        SCSIFastUltra=(edtValue)*6.25E-9;


        SCSIFastWide=(edtValue)*6.25E-9;

        SCSIFastUltraWide=(edtValue)*3.125E-9;

        SCSIUltra2=(edtValue)*1.5625E-9;

        SCSIUltra3=(edtValue)*7.8125E-10;

        SCSILVDUltra80=(edtValue)*1.5625E-9;


        SCSILVDUltra160=(edtValue)*7.8125E-10;

        IDEPIOmode0=(edtValue)*3.787878787E-8;

        IDEPIOmode1=(edtValue)*2.403846153E-8;

        IDEPIOmode2=(edtValue)*1.506024096E-8;

        IDEPIOmode3=(edtValue)*1.126126126E-8;

        IDEPIOmode4=(edtValue)*7.530120481E-9;

        IDEDMAmode0=(edtValue)*2.976190476E-8;

        IDEDMAmode1=(edtValue)*9.39849624E-9;

        IDEDMAmode2=(edtValue)*7.530120481E-9;

        IDEUDMAmode0=(edtValue)*7.530120481E-9;

        IDEUDMAmode1=(edtValue)*5.E-9;

        IDEUDMAmode2=(edtValue)*3.787878787E-9;

        IDEUDMAmode3=(edtValue)*2.5E-9;

        IDEUDMAmode4=(edtValue)*1.893939393E-9;

        IDEUDMA33=(edtValue)*3.787878787E-9;

        IDEUDMA66=(edtValue)*1.893939393E-9;

        USB=(edtValue)*8.333333333E-8;

        firewire=(edtValue)*2.5E-9;

        T0payload=(edtValue)*0.0000178571;

        T0B8ZSpayload=(edtValue)*0.000015625;

        T1signal=(edtValue)*6.476683937E-7;

        T1payload=(edtValue)*7.44047619E-7;

        T1Zpayload=(edtValue)*6.476683937E-7;

        T1Csignal=(edtValue)*3.172588832E-7;

        T1Cpayload=(edtValue)*3.720238095E-7;

        T2signal=(edtValue)*1.584283903E-7;

        T3signal=(edtValue)*2.235336194E-8;

        T3payload=(edtValue)*2.657312925E-8;

        T3Zpayload=(edtValue)*2.325148809E-8;

        T4signal=(edtValue)*3.64729225E-9;

        EPTA1signal=(edtValue)*4.8828125E-7;

        EPTA1payload=(edtValue)*5.208333333E-7;

        EPTA2signal=(edtValue)*1.183712121E-7;

        EPTA2payload=(edtValue)*1.302083333E-7;

        EPTA3signal=(edtValue)*2.909683426E-8;

        EPTA3payload=(edtValue)*3.255208333E-8;

        H0=(edtValue)*0.0000026042;

        H11=(edtValue)*6.510416666E-7;

        H12=(edtValue)*5.208333333E-7;

        VirtualTributary1signal=(edtValue)*5.787037037E-7;

        VirtualTributary1payload=(edtValue)*6.476683937E-7;

        VirtualTributary2signal=(edtValue)*4.340277777E-7;

        VirtualTributary2payload=(edtValue)*4.8828125E-7;

        VirtualTributary6signal=(edtValue)*1.584283903E-7;

        VirtualTributary6payload=(edtValue)*1.666666666E-7;

        STS1signal=(edtValue)*1.929012345E-8;

        STS1payload=(edtValue)*2.02020202E-8;

        STS3signal=(edtValue)*6.430041152E-9;

        STS3payload=(edtValue)*6.651766709E-9;

        STS3csignal=(edtValue)*6.430041152E-9;

        STS3cpayload=(edtValue)*6.651766709E-9;

        STS12signal=(edtValue)*1.607510288E-9;

        STS24signal=(edtValue)*8.03755144E-10;

        STS48signal=(edtValue)*4.01877572E-10;

        STS192signal=(edtValue)*1.00469393E-10;

        STM1signal=(edtValue)*6.430041152E-9;

        STM4signal=(edtValue)*1.607510288E-9;

        STM16signal=(edtValue)*4.01877572E-10;

        STM64signal=(edtValue)*1.00469393E-10;
    }

    public void Bytepersecond()
    {
        bitpersecond=(edtValue)*8;

        bytepersecond=(edtValue)*1;

        kilobitpersecondSI=(edtValue)*0.008;

        kilobytepersecondSI=(edtValue)*0.001;

        kilobitpersecond=(edtValue)*0.0078125;

        kilobytepersecond=(edtValue)*0.0009765625;

        megabitpersecondSI=(edtValue)*0.000008;

        megabytepersecondSI=(edtValue)*0.000001;

        megabitpersecond=(edtValue)*0.0000076294;

        megabytepersecond=(edtValue)*9.536743164E-7;

        gigabitpersecondSI=(edtValue)*8.E-9;

        gigabytepersecondSI=(edtValue)*1.E-9;

        gigabitpersecond=(edtValue)*7.450580596E-9;

        gigabytepersecond=(edtValue)*9.313225746E-10;

        terabitpersecondSI=(edtValue)*8.E-12;

        terabytepersecondSI=(edtValue)*1.E-12;

        terabitpersecond=(edtValue)*7.275957614E-12;

        terabytepersecond=(edtValue)*9.094947017E-13;

        ethernet=(edtValue)*8.E-7;

        ethernetfast=(edtValue)*8.E-8;

        ethernetgigabit=(edtValue)*8.E-9;

        OC1=(edtValue)*1.543209876E-7;

        OC3=(edtValue)*5.144032921E-8;

        OC12=(edtValue)*1.28600823E-8;

        OC24=(edtValue)*6.430041152E-9;

        OC48=(edtValue)*3.215020576E-9;

        OC192=(edtValue)*8.03755144E-10;

        OC768=(edtValue)*2.00938786E-10;

        ISDNsinglechannel=(edtValue)*0.000125;

        ISDNdualchannel=(edtValue)*0.0000625;

        modem110=(edtValue)*0.0727272727;

        modem300=(edtValue)*0.0266666667;

        modem1200=(edtValue)*0.0066666667;

        modem2400=(edtValue)*0.0033333333;

        modem9600=(edtValue)*0.0008333333;

        modem14k=(edtValue)*0.0005555556;

        modem28k=(edtValue)*0.0002777778;

        modem33k=(edtValue)*0.0002380952;

        modem56k=(edtValue)*0.0001428571;

        SCSIAsync=(edtValue)*6.666666666E-7;

        SCSISync=(edtValue)*2.E-7;

        SCSIFast=(edtValue)*1.E-7;

        SCSIFastUltra=(edtValue)*5.E-8;


        SCSIFastWide=(edtValue)*5.E-8;

        SCSIFastUltraWide=(edtValue)*2.5E-8;

        SCSIUltra2=(edtValue)*1.25E-8;

        SCSIUltra3=(edtValue)*6.25E-9;

        SCSILVDUltra80=(edtValue)*1.25E-8;


        SCSILVDUltra160=(edtValue)*6.25E-9;

        IDEPIOmode0=(edtValue)*3.03030303E-7;

        IDEPIOmode1=(edtValue)*1.923076923E-7;

        IDEPIOmode2=(edtValue)*1.204819277E-7;

        IDEPIOmode3=(edtValue)*9.009009009E-8;

        IDEPIOmode4=(edtValue)*6.024096385E-8;

        IDEDMAmode0=(edtValue)*2.38095238E-7;

        IDEDMAmode1=(edtValue)*7.518796992E-8;

        IDEDMAmode2=(edtValue)*6.024096385E-8;

        IDEUDMAmode0=(edtValue)*6.024096385E-8;

        IDEUDMAmode1=(edtValue)*4.E-8;

        IDEUDMAmode2=(edtValue)*3.03030303E-8;

        IDEUDMAmode3=(edtValue)*2.E-8;

        IDEUDMAmode4=(edtValue)*1.515151515E-8;

        IDEUDMA33=(edtValue)*3.03030303E-8;

        IDEUDMA66=(edtValue)*1.515151515E-8;

        USB=(edtValue)*6.666666666E-7;

        firewire=(edtValue)*2.E-8;

        T0payload=(edtValue)*0.0001428571;

        T0B8ZSpayload=(edtValue)*0.000125;

        T1signal=(edtValue)*0.0000051813;

        T1payload=(edtValue)*0.0000059524;

        T1Zpayload=(edtValue)*0.0000051813;

        T1Csignal=(edtValue)*0.0000025381;

        T1Cpayload=(edtValue)*0.0000029762;

        T2signal=(edtValue)*0.0000012674;

        T3signal=(edtValue)*1.788268955E-7;

        T3payload=(edtValue)*2.12585034E-7;

        T3Zpayload=(edtValue)*1.860119047E-7;

        T4signal=(edtValue)*2.9178338E-8;

        EPTA1signal=(edtValue)*0.0000039063;

        EPTA1payload=(edtValue)*0.0000041667;

        EPTA2signal=(edtValue)*9.469696969E-7;

        EPTA2payload=(edtValue)*0.0000010417;

        EPTA3signal=(edtValue)*2.327746741E-7;

        EPTA3payload=(edtValue)*2.604166666E-7;

        H0=(edtValue)*0.0000208333;

        H11=(edtValue)*0.0000052083;

        H12=(edtValue)*0.0000041667;

        VirtualTributary1signal=(edtValue)*0.0000046296;

        VirtualTributary1payload=(edtValue)*0.0000051813;

        VirtualTributary2signal=(edtValue)*0.0000034722;

        VirtualTributary2payload=(edtValue)*0.0000039063;

        VirtualTributary6signal=(edtValue)*0.0000012674;

        VirtualTributary6payload=(edtValue)*0.0000013333;

        STS1signal=(edtValue)*1.543209876E-7;

        STS1payload=(edtValue)*1.616161616E-7;

        STS3signal=(edtValue)*5.144032921E-8;

        STS3payload=(edtValue)*5.321413367E-8;

        STS3csignal=(edtValue)*5.144032921E-8;

        STS3cpayload=(edtValue)*5.321413367E-8;

        STS12signal=(edtValue)*1.28600823E-8;

        STS24signal=(edtValue)*6.430041152E-9;

        STS48signal=(edtValue)*3.215020576E-9;

        STS192signal=(edtValue)*8.03755144E-10;

        STM1signal=(edtValue)*5.144032921E-8;

        STM4signal=(edtValue)*1.28600823E-8;

        STM16signal=(edtValue)*3.215020576E-9;

        STM64signal=(edtValue)*8.03755144E-10;
    }

    public void KilobitpersecondSI()
    {
        bitpersecond=(edtValue)*1000;

        bytepersecond=(edtValue)*125;

        kilobitpersecondSI=(edtValue)*1;

        kilobytepersecondSI=(edtValue)*0.125;

        kilobitpersecond=(edtValue)*0.9765625;

        kilobytepersecond=(edtValue)*0.1220703125;

        megabitpersecondSI=(edtValue)*0.001;

        megabytepersecondSI=(edtValue)*0.000125;

        megabitpersecond=(edtValue)*0.0009536743;

        megabytepersecond=(edtValue)*0.0001192093;

        gigabitpersecondSI=(edtValue)*0.000001;

        gigabytepersecondSI=(edtValue)*1.25E-7;

        gigabitpersecond=(edtValue)*9.313225746E-7;

        gigabytepersecond=(edtValue)*1.164153218E-7;

        terabitpersecondSI=(edtValue)*1.E-9;

        terabytepersecondSI=(edtValue)*1.25E-10;

        terabitpersecond=(edtValue)*9.094947017E-10;

        terabytepersecond=(edtValue)*1.136868377E-10;

        ethernet=(edtValue)*0.0001;

        ethernetfast=(edtValue)*0.00001;

        ethernetgigabit=(edtValue)*0.000001;

        OC1=(edtValue)*0.0000192901;

        OC3=(edtValue)*0.00000643;

        OC12=(edtValue)*0.0000016075;

        OC24=(edtValue)*8.03755144E-7;

        OC48=(edtValue)*4.01877572E-7;

        OC192=(edtValue)*1.00469393E-7;

        OC768=(edtValue)*2.511734825E-8;

        ISDNsinglechannel=(edtValue)*0.015625;

        ISDNdualchannel=(edtValue)*0.0078125;

        modem110=(edtValue)*9.0909090909;

        modem300=(edtValue)*3.3333333333;

        modem1200=(edtValue)*0.8333333333;

        modem2400=(edtValue)*0.4166666667;

        modem9600=(edtValue)*0.1041666667;

        modem14k=(edtValue)*0.0694444444;

        modem28k=(edtValue)*0.0347222222;

        modem33k=(edtValue)*0.0297619048;

        modem56k=(edtValue)*0.0178571429;

        SCSIAsync=(edtValue)*0.0000833333;

        SCSISync=(edtValue)*0.000025;

        SCSIFast=(edtValue)*0.0000125;

        SCSIFastUltra=(edtValue)*0.00000625;


        SCSIFastWide=(edtValue)*0.00000625;

        SCSIFastUltraWide=(edtValue)*0.000003125;

        SCSIUltra2=(edtValue)*0.0000015625;

        SCSIUltra3=(edtValue)*7.8125E-7;

        SCSILVDUltra80=(edtValue)*0.0000015625;


        SCSILVDUltra160=(edtValue)*7.8125E-7;

        IDEPIOmode0=(edtValue)*0.0000378788;

        IDEPIOmode1=(edtValue)*0.0000240385;

        IDEPIOmode2=(edtValue)*0.0000150602;

        IDEPIOmode3=(edtValue)*0.0000112613;

        IDEPIOmode4=(edtValue)*0.0000075301;

        IDEDMAmode0=(edtValue)*0.0000297619;

        IDEDMAmode1=(edtValue)*0.0000093985;

        IDEDMAmode2=(edtValue)*0.0000075301;

        IDEUDMAmode0=(edtValue)*0.0000075301;

        IDEUDMAmode1=(edtValue)*0.000005;

        IDEUDMAmode2=(edtValue)*0.0000037879;

        IDEUDMAmode3=(edtValue)*0.0000025;

        IDEUDMAmode4=(edtValue)*0.0000018939;

        IDEUDMA33=(edtValue)*0.0000037879;

        IDEUDMA66=(edtValue)*0.0000018939;

        USB=(edtValue)*0.0000833333;

        firewire=(edtValue)*0.0000025;

        T0payload=(edtValue)*0.0178571429;

        T0B8ZSpayload=(edtValue)*0.015625;

        T1signal=(edtValue)*0.0006476684;

        T1payload=(edtValue)*0.0007440476;

        T1Zpayload=(edtValue)*0.0006476684;

        T1Csignal=(edtValue)*0.0003172589;

        T1Cpayload=(edtValue)*0.0003720238;

        T2signal=(edtValue)*0.0001584284;

        T3signal=(edtValue)*0.0000223534;

        T3payload=(edtValue)*0.0000265731;

        T3Zpayload=(edtValue)*0.0000232515;

        T4signal=(edtValue)*0.0000036473;

        EPTA1signal=(edtValue)*0.0004882813;

        EPTA1payload=(edtValue)*0.0005208333;

        EPTA2signal=(edtValue)*0.0001183712;

        EPTA2payload=(edtValue)*0.0001302083;

        EPTA3signal=(edtValue)*0.0000290968;

        EPTA3payload=(edtValue)*0.0000325521;

        H0=(edtValue)*0.0026041667;

        H11=(edtValue)*0.0006510417;

        H12=(edtValue)*0.0005208333;

        VirtualTributary1signal=(edtValue)*0.0005787037;

        VirtualTributary1payload=(edtValue)*0.0006476684;

        VirtualTributary2signal=(edtValue)*0.0004340278;

        VirtualTributary2payload=(edtValue)*0.0004882813;

        VirtualTributary6signal=(edtValue)*0.0001584284;

        VirtualTributary6payload=(edtValue)*0.0001666667;

        STS1signal=(edtValue)*0.0000192901;

        STS1payload=(edtValue)*0.000020202;

        STS3signal=(edtValue)*0.00000643;

        STS3payload=(edtValue)*0.0000066518;

        STS3csignal=(edtValue)*0.00000643;

        STS3cpayload=(edtValue)*0.0000066518;

        STS12signal=(edtValue)*0.0000016075;

        STS24signal=(edtValue)*8.03755144E-7;

        STS48signal=(edtValue)*4.01877572E-7;

        STS192signal=(edtValue)*1.00469393E-7;

        STM1signal=(edtValue)*0.00000643;

        STM4signal=(edtValue)*0.0000016075;

        STM16signal=(edtValue)*4.01877572E-7;

        STM64signal=(edtValue)*1.00469393E-7;

    }
    public void KilobytepersecondSI()
    {

        bitpersecond=(edtValue)*8000;

        bytepersecond=(edtValue)*1000;

        kilobitpersecondSI=(edtValue)*8;

        kilobytepersecondSI=(edtValue)*1;

        kilobitpersecond=(edtValue)*7.8125;

        kilobytepersecond=(edtValue)*0.9765625;

        megabitpersecondSI=(edtValue)*0.008;

        megabytepersecondSI=(edtValue)*0.001;

        megabitpersecond=(edtValue)*0.0076293945;

        megabytepersecond=(edtValue)*0.0009536743;

        gigabitpersecondSI=(edtValue)*0.000008;

        gigabytepersecondSI=(edtValue)*0.000001;

        gigabitpersecond=(edtValue)*0.0000074506;

        gigabytepersecond=(edtValue)*9.313225746E-7;

        terabitpersecondSI=(edtValue)*8.E-9;

        terabytepersecondSI=(edtValue)*1.E-9;

        terabitpersecond=(edtValue)*7.275957614E-9;

        terabytepersecond=(edtValue)*9.094947017E-10;

        ethernet=(edtValue)*0.0008;

        ethernetfast=(edtValue)*0.00008;

        ethernetgigabit=(edtValue)*0.000008;

        OC1=(edtValue)*0.000154321;

        OC3=(edtValue)*0.0000514403;

        OC12=(edtValue)*0.0000128601;

        OC24=(edtValue)*0.00000643;

        OC48=(edtValue)*0.000003215;

        OC192=(edtValue)*8.03755144E-7;

        OC768=(edtValue)*2.00938786E-7;

        ISDNsinglechannel=(edtValue)*0.125;

        ISDNdualchannel=(edtValue)*0.0625;

        modem110=(edtValue)*72.727272727;

        modem300=(edtValue)*26.666666667;

        modem1200=(edtValue)*6.6666666667;

        modem2400=(edtValue)*3.3333333333;

        modem9600=(edtValue)*0.8333333333;

        modem14k=(edtValue)*0.5555555556;

        modem28k=(edtValue)*0.2777777778;

        modem33k=(edtValue)*0.2380952381;

        modem56k=(edtValue)*0.1428571429;

        SCSIAsync=(edtValue)*0.0006666667;

        SCSISync=(edtValue)*0.0002;

        SCSIFast=(edtValue)*0.0001;

        SCSIFastUltra=(edtValue)*0.00005;


        SCSIFastWide=(edtValue)*0.00005;

        SCSIFastUltraWide=(edtValue)*0.000025;

        SCSIUltra2=(edtValue)*0.0000125;

        SCSIUltra3=(edtValue)*0.00000625;

        SCSILVDUltra80=(edtValue)*0.0000125;


        SCSILVDUltra160=(edtValue)*0.00000625;

        IDEPIOmode0=(edtValue)*0.0003030303;

        IDEPIOmode1=(edtValue)*0.0001923077;

        IDEPIOmode2=(edtValue)*0.0001204819;

        IDEPIOmode3=(edtValue)*0.0000900901;

        IDEPIOmode4=(edtValue)*0.000060241;

        IDEDMAmode0=(edtValue)*0.0002380952;

        IDEDMAmode1=(edtValue)*0.000075188;

        IDEDMAmode2=(edtValue)*0.000060241;

        IDEUDMAmode0=(edtValue)*0.000060241;

        IDEUDMAmode1=(edtValue)*0.00004;

        IDEUDMAmode2=(edtValue)*0.000030303;

        IDEUDMAmode3=(edtValue)*0.00002;

        IDEUDMAmode4=(edtValue)*0.0000151515;

        IDEUDMA33=(edtValue)*0.000030303;

        IDEUDMA66=(edtValue)*0.0000151515;

        USB=(edtValue)*0.0006666667;

        firewire=(edtValue)*0.00002;

        T0payload=(edtValue)*0.1428571429;

        T0B8ZSpayload=(edtValue)*0.125;

        T1signal=(edtValue)*0.0051813472;

        T1payload=(edtValue)*0.005952381;

        T1Zpayload=(edtValue)*0.0051813472;

        T1Csignal=(edtValue)*0.0025380711;

        T1Cpayload=(edtValue)*0.0029761905;

        T2signal=(edtValue)*0.0012674271;

        T3signal=(edtValue)*0.0001788269;

        T3payload=(edtValue)*0.000212585;

        T3Zpayload=(edtValue)*0.0001860119;

        T4signal=(edtValue)*0.0000291783;

        EPTA1signal=(edtValue)*0.00390625;

        EPTA1payload=(edtValue)*0.0041666667;

        EPTA2signal=(edtValue)*0.0009469697;

        EPTA2payload=(edtValue)*0.0010416667;

        EPTA3signal=(edtValue)*0.0002327747;

        EPTA3payload=(edtValue)*0.0002604167;

        H0=(edtValue)*0.0208333333;

        H11=(edtValue)*0.0052083333;

        H12=(edtValue)*0.0041666667;

        VirtualTributary1signal=(edtValue)*0.0046296296;

        VirtualTributary1payload=(edtValue)*0.0051813472;

        VirtualTributary2signal=(edtValue)*0.0034722222;

        VirtualTributary2payload=(edtValue)*0.00390625;

        VirtualTributary6signal=(edtValue)*0.0012674271;

        VirtualTributary6payload=(edtValue)*0.0013333333;

        STS1signal=(edtValue)*0.000154321;

        STS1payload=(edtValue)*0.0001616162;

        STS3signal=(edtValue)*0.0000514403;

        STS3payload=(edtValue)*0.0000532141;

        STS3csignal=(edtValue)*0.0000514403;

        STS3cpayload=(edtValue)*0.0000532141;

        STS12signal=(edtValue)*0.0000128601;

        STS24signal=(edtValue)*0.00000643;

        STS48signal=(edtValue)*0.000003215;

        STS192signal=(edtValue)*8.03755144E-7;

        STM1signal=(edtValue)*0.0000514403;

        STM4signal=(edtValue)*0.0000128601;

        STM16signal=(edtValue)*0.000003215;

        STM64signal=(edtValue)*8.03755144E-7;

    }
    public void Kilobitpersecond()
    {
        bitpersecond=(edtValue)*1024;

        bytepersecond=(edtValue)*128;

        kilobitpersecondSI=(edtValue)*1.024;

        kilobytepersecondSI=(edtValue)*0.128;

        kilobitpersecond=(edtValue)*1;

        kilobytepersecond=(edtValue)*0.125;

        megabitpersecondSI=(edtValue)*0.001024;

        megabytepersecondSI=(edtValue)*0.000128;

        megabitpersecond=(edtValue)*0.0009765625;

        megabytepersecond=(edtValue)*0.0001220703;

        gigabitpersecondSI=(edtValue)*0.000001024;

        gigabytepersecondSI=(edtValue)*1.28E-7;

        gigabitpersecond=(edtValue)*9.536743164E-7;

        gigabytepersecond=(edtValue)*1.192092895E-7;

        terabitpersecondSI=(edtValue)*1.024E-9;

        terabytepersecondSI=(edtValue)*1.28E-10;

        terabitpersecond=(edtValue)*9.313225746E-10;

        terabytepersecond=(edtValue)*1.164153218E-10;

        ethernet=(edtValue)*0.0001024;

        ethernetfast=(edtValue)*0.00001024;

        ethernetgigabit=(edtValue)*0.000001024;

        OC1=(edtValue)*0.0000197531;

        OC3=(edtValue)*0.0000065844;

        OC12=(edtValue)*0.0000016461;

        OC24=(edtValue)*8.230452674E-7;

        OC48=(edtValue)*4.115226337E-7;

        OC192=(edtValue)*1.028806584E-7;

        OC768=(edtValue)*2.57201646E-8;

        ISDNsinglechannel=(edtValue)*0.016;

        ISDNdualchannel=(edtValue)*0.008;

        modem110=(edtValue)*9.3090909091;

        modem300=(edtValue)*3.4133333333;

        modem1200=(edtValue)*0.8533333333;

        modem2400=(edtValue)*0.4266666667;

        modem9600=(edtValue)*0.1066666667;

        modem14k=(edtValue)*0.0711111111;

        modem28k=(edtValue)*0.0355555556;

        modem33k=(edtValue)*0.0304761905;

        modem56k=(edtValue)*0.0182857143;

        SCSIAsync=(edtValue)*0.0000853333;

        SCSISync=(edtValue)*0.0000256;

        SCSIFast=(edtValue)*0.0000128;

        SCSIFastUltra=(edtValue)*0.0000064;


        SCSIFastWide=(edtValue)*0.0000064;

        SCSIFastUltraWide=(edtValue)*0.0000032;

        SCSIUltra2=(edtValue)*0.0000016;

        SCSIUltra3=(edtValue)*8.E-7;

        SCSILVDUltra80=(edtValue)*0.0000016;


        SCSILVDUltra160=(edtValue)*8.E-7;

        IDEPIOmode0=(edtValue)*0.0000387879;

        IDEPIOmode1=(edtValue)*0.0000246154;

        IDEPIOmode2=(edtValue)*0.0000154217;

        IDEPIOmode3=(edtValue)*0.0000115315;

        IDEPIOmode4=(edtValue)*0.0000077108;

        IDEDMAmode0=(edtValue)*0.0000304762;

        IDEDMAmode1=(edtValue)*0.0000096241;

        IDEDMAmode2=(edtValue)*0.0000077108;

        IDEUDMAmode0=(edtValue)*0.0000077108;

        IDEUDMAmode1=(edtValue)*0.00000512;

        IDEUDMAmode2=(edtValue)*0.0000038788;

        IDEUDMAmode3=(edtValue)*0.00000256;

        IDEUDMAmode4=(edtValue)*0.0000019394;

        IDEUDMA33=(edtValue)*0.0000038788;

        IDEUDMA66=(edtValue)*0.0000019394;

        USB=(edtValue)*0.0000853333;

        firewire=(edtValue)*0.00000256;

        T0payload=(edtValue)*0.0182857143;

        T0B8ZSpayload=(edtValue)*0.016;

        T1signal=(edtValue)*0.0006632124;

        T1payload=(edtValue)*0.0007619048;

        T1Zpayload=(edtValue)*0.0006632124;

        T1Csignal=(edtValue)*0.0003248731;

        T1Cpayload=(edtValue)*0.0003809524;

        T2signal=(edtValue)*0.0001622307;

        T3signal=(edtValue)*0.0000228898;

        T3payload=(edtValue)*0.0000272109;

        T3Zpayload=(edtValue)*0.0000238095;

        T4signal=(edtValue)*0.0000037348;

        EPTA1signal=(edtValue)*0.0005;

        EPTA1payload=(edtValue)*0.0005333333;

        EPTA2signal=(edtValue)*0.0001212121;

        EPTA2payload=(edtValue)*0.0001333333;

        EPTA3signal=(edtValue)*0.0000297952;

        EPTA3payload=(edtValue)*0.0000333333;

        H0=(edtValue)*0.0026666667;

        H11=(edtValue)*0.0006666667;

        H12=(edtValue)*0.0005333333;

        VirtualTributary1signal=(edtValue)*0.0005925926;

        VirtualTributary1payload=(edtValue)*0.0006632124;

        VirtualTributary2signal=(edtValue)*0.0004444444;

        VirtualTributary2payload=(edtValue)*0.0005;

        VirtualTributary6signal=(edtValue)*0.0001622307;

        VirtualTributary6payload=(edtValue)*0.0001706667;

        STS1signal=(edtValue)*0.0000197531;

        STS1payload=(edtValue)*0.0000206869;

        STS3signal=(edtValue)*0.0000065844;

        STS3payload=(edtValue)*0.0000068114;

        STS3csignal=(edtValue)*0.0000065844;

        STS3cpayload=(edtValue)*0.0000068114;

        STS12signal=(edtValue)*0.0000016461;

        STS24signal=(edtValue)*8.230452674E-7;

        STS48signal=(edtValue)*4.115226337E-7;

        STS192signal=(edtValue)*1.028806584E-7;

        STM1signal=(edtValue)*0.0000065844;

        STM4signal=(edtValue)*0.0000016461;

        STM16signal=(edtValue)*4.115226337E-7;

        STM64signal=(edtValue)*1.028806584E-7;

    }
    public void  Kilobytepersecond()
    {
        bitpersecond=(edtValue)*8192;

        bytepersecond=(edtValue)*1024;

        kilobitpersecondSI=(edtValue)*8.192;

        kilobytepersecondSI=(edtValue)*1.024;

        kilobitpersecond=(edtValue)*8;

        kilobytepersecond=(edtValue)*1;

        megabitpersecondSI=(edtValue)*0.008192;

        megabytepersecondSI=(edtValue)*0.001024;

        megabitpersecond=(edtValue)*0.0078125;

        megabytepersecond=(edtValue)*0.0009765625;

        gigabitpersecondSI=(edtValue)*0.000008192;

        gigabytepersecondSI=(edtValue)*0.000001024;

        gigabitpersecond=(edtValue)*0.0000076294;

        gigabytepersecond=(edtValue)*9.536743164E-7;

        terabitpersecondSI=(edtValue)*8.192E-9;

        terabytepersecondSI=(edtValue)*1.024E-9;

        terabitpersecond=(edtValue)*7.450580596E-9;

        terabytepersecond=(edtValue)*9.313225746E-10;

        ethernet=(edtValue)*0.0008192;

        ethernetfast=(edtValue)*0.00008192;

        ethernetgigabit=(edtValue)*0.000008192;

        OC1=(edtValue)*0.0001580247;

        OC3=(edtValue)*0.0000526749;

        OC12=(edtValue)*0.0000131687;

        OC24=(edtValue)*0.0000065844;

        OC48=(edtValue)*0.0000032922;

        OC192=(edtValue)*8.230452674E-7;

        OC768=(edtValue)*2.057613168E-7;

        ISDNsinglechannel=(edtValue)*0.128;

        ISDNdualchannel=(edtValue)*0.064;

        modem110=(edtValue)*74.472727273;

        modem300=(edtValue)*27.306666667;

        modem1200=(edtValue)*6.8266666667;

        modem2400=(edtValue)*3.4133333333;

        modem9600=(edtValue)*0.8533333333;

        modem14k=(edtValue)*0.5688888889;

        modem28k=(edtValue)*0.2844444444;

        modem33k=(edtValue)*0.2438095238;

        modem56k=(edtValue)*0.1462857143;

        SCSIAsync=(edtValue)*0.0006826667;

        SCSISync=(edtValue)*0.0002048;

        SCSIFast=(edtValue)*0.0001024;

        SCSIFastUltra=(edtValue)*0.0000512;

        SCSIFastWide=(edtValue)*0.0000512;

        SCSIFastUltraWide=(edtValue)*0.0000256;

        SCSIUltra2=(edtValue)*0.0000128;

        SCSIUltra3=(edtValue)*0.0000064;

        SCSILVDUltra80=(edtValue)*0.0000128;


        SCSILVDUltra160=(edtValue)*0.0000064;

        IDEPIOmode0=(edtValue)*0.000310303;

        IDEPIOmode1=(edtValue)*0.0001969231;

        IDEPIOmode2=(edtValue)*0.0001233735;

        IDEPIOmode3=(edtValue)*0.0000922523;

        IDEPIOmode4=(edtValue)*0.0000616867;

        IDEDMAmode0=(edtValue)*0.0002438095;

        IDEDMAmode1=(edtValue)*0.0000769925;

        IDEDMAmode2=(edtValue)*0.0000616867;

        IDEUDMAmode0=(edtValue)*0.0000616867;

        IDEUDMAmode1=(edtValue)*0.00004096;

        IDEUDMAmode2=(edtValue)*0.0000310303;

        IDEUDMAmode3=(edtValue)*0.00002048;

        IDEUDMAmode4=(edtValue)*0.0000155152;

        IDEUDMA33=(edtValue)*0.0000310303;

        IDEUDMA66=(edtValue)*0.0000155152;

        USB=(edtValue)*0.0006826667;

        firewire=(edtValue)*0.00002048;

        T0payload=(edtValue)*0.1462857143;

        T0B8ZSpayload=(edtValue)*0.128;

        T1signal=(edtValue)*0.0053056995;

        T1payload=(edtValue)*0.0060952381;

        T1Zpayload=(edtValue)*0.0053056995;

        T1Csignal=(edtValue)*0.0025989848;

        T1Cpayload=(edtValue)*0.003047619;

        T2signal=(edtValue)*0.0012978454;

        T3signal=(edtValue)*0.0001831187;

        T3payload=(edtValue)*0.0002176871;

        T3Zpayload=(edtValue)*0.0001904762;

        T4signal=(edtValue)*0.0000298786;

        EPTA1signal=(edtValue)*0.004;

        EPTA1payload=(edtValue)*0.0042666667;

        EPTA2signal=(edtValue)*0.000969697;

        EPTA2payload=(edtValue)*0.0010666667;

        EPTA3signal=(edtValue)*0.0002383613;

        EPTA3payload=(edtValue)*0.0002666667;

        H0=(edtValue)*0.0213333333;

        H11=(edtValue)*0.0053333333;

        H12=(edtValue)*0.0042666667;

        VirtualTributary1signal=(edtValue)*0.0047407407;

        VirtualTributary1payload=(edtValue)*0.0053056995;

        VirtualTributary2signal=(edtValue)*0.0035555556;

        VirtualTributary2payload=(edtValue)*0.004;

        VirtualTributary6signal=(edtValue)*0.0012978454;

        VirtualTributary6payload=(edtValue)*0.0013653333;

        STS1signal=(edtValue)*0.0001580247;

        STS1payload=(edtValue)*0.0001654949;

        STS3signal=(edtValue)*0.0000526749;

        STS3payload=(edtValue)*0.0000544913;

        STS3csignal=(edtValue)*0.0000526749;

        STS3cpayload=(edtValue)*0.0000544913;

        STS12signal=(edtValue)*0.0000131687;

        STS24signal=(edtValue)*0.0000065844;

        STS48signal=(edtValue)*0.0000032922;

        STS192signal=(edtValue)*8.230452674E-7;

        STM1signal=(edtValue)*0.0000526749;

        STM4signal=(edtValue)*0.0000131687;

        STM16signal=(edtValue)*0.0000032922;

        STM64signal=(edtValue)*8.230452674E-7;
    }
    public void MegabitpersecondSI()
    {
        bitpersecond=(edtValue)*1000000;

        bytepersecond=(edtValue)*125000;

        kilobitpersecondSI=(edtValue)*1000;

        kilobytepersecondSI=(edtValue)*125;

        kilobitpersecond=(edtValue)*976.5625;

        kilobytepersecond=(edtValue)*122.0703125;

        megabitpersecondSI=(edtValue)*1;

        megabytepersecondSI=(edtValue)*0.125;

        megabitpersecond=(edtValue)*0.9536743164;

        megabytepersecond=(edtValue)*0.1192092896;

        gigabitpersecondSI=(edtValue)*0.001;

        gigabytepersecondSI=(edtValue)*0.000125;

        gigabitpersecond=(edtValue)*0.0009313226;

        gigabytepersecond=(edtValue)*0.0001164153;

        terabitpersecondSI=(edtValue)*0.000001;

        terabytepersecondSI=(edtValue)*1.25E-7;

        terabitpersecond=(edtValue)*9.094947017E-7;

        terabytepersecond=(edtValue)*1.136868377E-7;

        ethernet=(edtValue)*0.1;

        ethernetfast=(edtValue)*0.01;

        ethernetgigabit=(edtValue)*0.001;

        OC1=(edtValue)*0.0192901235;

        OC3=(edtValue)*0.0064300412;

        OC12=(edtValue)*0.0016075103;

        OC24=(edtValue)*0.0008037551;

        OC48=(edtValue)*0.0004018776;

        OC192=(edtValue)*0.0001004694;

        OC768=(edtValue)*0.0000251173;

        ISDNsinglechannel=(edtValue)*15.625;

        ISDNdualchannel=(edtValue)*7.8125;

        modem110=(edtValue)*9090.9090909;

        modem300=(edtValue)*3333.3333333;

        modem1200=(edtValue)*833.33333333;

        modem2400=(edtValue)*416.66666667;

        modem9600=(edtValue)*104.16666667;

        modem14k=(edtValue)*69.444444444;

        modem28k=(edtValue)*34.722222222;

        modem33k=(edtValue)*29.761904762;

        modem56k=(edtValue)*17.857142857;

        SCSIAsync=(edtValue)*0.0833333333;

        SCSISync=(edtValue)*0.025;

        SCSIFast=(edtValue)*0.0125;

        SCSIFastUltra=(edtValue)*0.00625;


        SCSIFastWide=(edtValue)*0.00625;

        SCSIFastUltraWide=(edtValue)*0.003125;

        SCSIUltra2=(edtValue)*0.0015625;

        SCSIUltra3=(edtValue)*0.00078125;

        SCSILVDUltra80=(edtValue)*0.0015625;


        SCSILVDUltra160=(edtValue)*0.00078125;

        IDEPIOmode0=(edtValue)*0.0378787879;

        IDEPIOmode1=(edtValue)*0.0240384615;

        IDEPIOmode2=(edtValue)*0.015060241;

        IDEPIOmode3=(edtValue)*0.0112612613;

        IDEPIOmode4=(edtValue)*0.0075301205;

        IDEDMAmode0=(edtValue)*0.0297619048;

        IDEDMAmode1=(edtValue)*0.0093984962;

        IDEDMAmode2=(edtValue)*0.0075301205;

        IDEUDMAmode0=(edtValue)*0.0075301205;

        IDEUDMAmode1=(edtValue)*0.005;

        IDEUDMAmode2=(edtValue)*0.0037878788;

        IDEUDMAmode3=(edtValue)*0.0025;

        IDEUDMAmode4=(edtValue)*0.0018939394;

        IDEUDMA33=(edtValue)*0.0037878788;

        IDEUDMA66=(edtValue)*0.0018939394;

        USB=(edtValue)*0.0833333333;

        firewire=(edtValue)*0.0025;

        T0payload=(edtValue)*17.857142857;

        T0B8ZSpayload=(edtValue)*15.625;

        T1signal=(edtValue)*0.6476683938;

        T1payload=(edtValue)*0.744047619;

        T1Zpayload=(edtValue)*0.6476683938;

        T1Csignal=(edtValue)*0.3172588832;

        T1Cpayload=(edtValue)*0.3720238095;

        T2signal=(edtValue)*0.1584283904;

        T3signal=(edtValue)*0.0223533619;

        T3payload=(edtValue)*0.0265731293;

        T3Zpayload=(edtValue)*0.0232514881;

        T4signal=(edtValue)*0.0036472923;

        EPTA1signal=(edtValue)*0.48828125;

        EPTA1payload=(edtValue)*0.5208333333;

        EPTA2signal=(edtValue)*0.1183712121;

        EPTA2payload=(edtValue)*0.1302083333;

        EPTA3signal=(edtValue)*0.0290968343;

        EPTA3payload=(edtValue)*0.0325520833;

        H0=(edtValue)*2.6041666667;

        H11=(edtValue)*0.6510416667;

        H12=(edtValue)*0.5208333333;

        VirtualTributary1signal=(edtValue)*0.5787037037;

        VirtualTributary1payload=(edtValue)*0.6476683938;

        VirtualTributary2signal=(edtValue)*0.4340277778;

        VirtualTributary2payload=(edtValue)*0.48828125;

        VirtualTributary6signal=(edtValue)*0.1584283904;

        VirtualTributary6payload=(edtValue)*0.1666666667;

        STS1signal=(edtValue)*0.0192901235;

        STS1payload=(edtValue)*0.0202020202;

        STS3signal=(edtValue)*0.0064300412;

        STS3payload=(edtValue)*0.0066517667;

        STS3csignal=(edtValue)*0.0064300412;

        STS3cpayload=(edtValue)*0.0066517667;

        STS12signal=(edtValue)*0.0016075103;

        STS24signal=(edtValue)*0.0008037551;

        STS48signal=(edtValue)*0.0004018776;

        STS192signal=(edtValue)*0.0001004694;

        STM1signal=(edtValue)*0.0064300412;

        STM4signal=(edtValue)*0.0016075103;

        STM16signal=(edtValue)*0.0004018776;

        STM64signal=(edtValue)*0.0001004694;

    }
    public void MegabytepersecondSI()
    {

        bitpersecond=(edtValue)*8000000;

        bytepersecond=(edtValue)*1000000;

        kilobitpersecondSI=(edtValue)*8000;

        kilobytepersecondSI=(edtValue)*1000;

        kilobitpersecond=(edtValue)*7812.5;

        kilobytepersecond=(edtValue)*976.5625;

        megabitpersecondSI=(edtValue)*8;

        megabytepersecondSI=(edtValue)*1;

        megabitpersecond=(edtValue)*7.6293945313;

        megabytepersecond=(edtValue)*0.9536743164;

        gigabitpersecondSI=(edtValue)*0.008;

        gigabytepersecondSI=(edtValue)*0.001;

        gigabitpersecond=(edtValue)*0.0074505806;

        gigabytepersecond=(edtValue)*0.0009313226;

        terabitpersecondSI=(edtValue)*0.000008;

        terabytepersecondSI=(edtValue)*0.000001;

        terabitpersecond=(edtValue)*0.000007276;

        terabytepersecond=(edtValue)*0.000007276;

        ethernet=(edtValue)*0.8;

        ethernetfast=(edtValue)*0.08;

        ethernetgigabit=(edtValue)*0.008;

        OC1=(edtValue)*0.1543209877;

        OC3=(edtValue)*0.0514403292;

        OC12=(edtValue)*0.0128600823;

        OC24=(edtValue)*0.0064300412;

        OC48=(edtValue)*0.0032150206;

        OC192=(edtValue)*0.0008037551;

        OC768=(edtValue)*0.0002009388;

        ISDNsinglechannel=(edtValue)*125;

        ISDNdualchannel=(edtValue)*62.5;

        modem110=(edtValue)*72727.272727;

        modem300=(edtValue)*26666.666667;

        modem1200=(edtValue)*6666.6666667;

        modem2400=(edtValue)*3333.3333333;

        modem9600=(edtValue)*833.33333333;

        modem14k=(edtValue)*555.55555556;

        modem28k=(edtValue)*277.77777778;

        modem33k=(edtValue)*238.0952381;

        modem56k=(edtValue)*142.85714286;

        SCSIAsync=(edtValue)*0.6666666667;

        SCSISync=(edtValue)*0.2;

        SCSIFast=(edtValue)*0.1;

        SCSIFastUltra=(edtValue)*0.05;


        SCSIFastWide=(edtValue)*0.05;

        SCSIFastUltraWide=(edtValue)*0.025;

        SCSIUltra2=(edtValue)*0.0125;

        SCSIUltra3=(edtValue)*0.00625;

        SCSILVDUltra80=(edtValue)*0.0125;


        SCSILVDUltra160=(edtValue)*0.00625;

        IDEPIOmode0=(edtValue)*0.303030303;

        IDEPIOmode1=(edtValue)*0.1923076923;

        IDEPIOmode2=(edtValue)*0.1204819277;

        IDEPIOmode3=(edtValue)*0.0900900901;

        IDEPIOmode4=(edtValue)*0.0602409639;

        IDEDMAmode0=(edtValue)*0.2380952381;

        IDEDMAmode1=(edtValue)*0.0751879699;

        IDEDMAmode2=(edtValue)*0.0602409639;

        IDEUDMAmode0=(edtValue)*0.0602409639;

        IDEUDMAmode1=(edtValue)*0.04;

        IDEUDMAmode2=(edtValue)*0.0303030303;

        IDEUDMAmode3=(edtValue)*0.02;

        IDEUDMAmode4=(edtValue)*0.0151515152;

        IDEUDMA33=(edtValue)*0.0303030303;

        IDEUDMA66=(edtValue)*0.0151515152;

        USB=(edtValue)*0.6666666667;

        firewire=(edtValue)*0.02;

        T0payload=(edtValue)*142.85714286;

        T0B8ZSpayload=(edtValue)*125;

        T1signal=(edtValue)*5.1813471503;

        T1payload=(edtValue)*5.9523809524;

        T1Zpayload=(edtValue)*5.1813471503;

        T1Csignal=(edtValue)*2.538071066;

        T1Cpayload=(edtValue)*2.9761904762;

        T2signal=(edtValue)*1.2674271229;

        T3signal=(edtValue)*0.1788268956;

        T3payload=(edtValue)*0.212585034;

        T3Zpayload=(edtValue)*0.1860119048;

        T4signal=(edtValue)*0.029178338;

        EPTA1signal=(edtValue)*3.90625;

        EPTA1payload=(edtValue)*4.1666666667;

        EPTA2signal=(edtValue)*0.946969697;

        EPTA2payload=(edtValue)*1.0416666667;

        EPTA3signal=(edtValue)*0.2327746741;

        EPTA3payload=(edtValue)*0.2604166667;

        H0=(edtValue)*20.833333333;

        H11=(edtValue)*5.2083333333;

        H12=(edtValue)*4.1666666667;

        VirtualTributary1signal=(edtValue)*4.6296296296;

        VirtualTributary1payload=(edtValue)*5.1813471503;

        VirtualTributary2signal=(edtValue)*3.4722222222;

        VirtualTributary2payload=(edtValue)*3.90625;

        VirtualTributary6signal=(edtValue)*1.2674271229;

        VirtualTributary6payload=(edtValue)*1.3333333333;

        STS1signal=(edtValue)*0.1543209877;

        STS1payload=(edtValue)*0.1616161616;

        STS3signal=(edtValue)*0.0514403292;

        STS3payload=(edtValue)*0.0532141337;

        STS3csignal=(edtValue)*0.0514403292;

        STS3cpayload=(edtValue)*0.0532141337;

        STS12signal=(edtValue)*0.0128600823;

        STS24signal=(edtValue)*0.0064300412;

        STS48signal=(edtValue)*0.0032150206;

        STS192signal=(edtValue)*0.0008037551;

        STM1signal=(edtValue)*0.0514403292;

        STM4signal=(edtValue)*0.0128600823;

        STM16signal=(edtValue)*0.0032150206;

        STM64signal=(edtValue)*0.0008037551;

    }
    public void Megabitpersecond()
    {
        bitpersecond=(edtValue)*1048576;

        bytepersecond=(edtValue)*131072;

        kilobitpersecondSI=(edtValue)*1048.576;

        kilobytepersecondSI=(edtValue)*131.072;

        kilobitpersecond=(edtValue)*1024;

        kilobytepersecond=(edtValue)*128;

        megabitpersecondSI=(edtValue)*1.048576;

        megabytepersecondSI=(edtValue)*0.131072;

        megabitpersecond=(edtValue)*1;

        megabytepersecond=(edtValue)*0.125;

        gigabitpersecondSI=(edtValue)*0.001048576;

        gigabytepersecondSI=(edtValue)*0.000131072;

        gigabitpersecond=(edtValue)*0.0009765625;

        gigabytepersecond=(edtValue)*0.0001220703;

        terabitpersecondSI=(edtValue)*0.0000010486;

        terabytepersecondSI=(edtValue)*1.31072E-7;

        terabitpersecond=(edtValue)*9.536743164E-7;

        terabytepersecond=(edtValue)*1.192092895E-7;

        ethernet=(edtValue)*0.1048576;

        ethernetfast=(edtValue)*0.01048576;

        ethernetgigabit=(edtValue)*0.001048576;

        OC1=(edtValue)*0.0202271605;

        OC3=(edtValue)*0.0067423868;

        OC12=(edtValue)*0.0016855967;

        OC24=(edtValue)*0.0008427984;

        OC48=(edtValue)*0.0004213992;

        OC192=(edtValue)*0.0001053498;

        OC768=(edtValue)*0.0000263374;

        ISDNsinglechannel=(edtValue)*16.384;

        ISDNdualchannel=(edtValue)*8.192;

        modem110=(edtValue)*9532.5090909;

        modem300=(edtValue)*3495.2533333;

        modem1200=(edtValue)*873.81333333;

        modem2400=(edtValue)*436.90666667;

        modem9600=(edtValue)*109.22666667;

        modem14k=(edtValue)*72.817777778;

        modem28k=(edtValue)*36.408888889;

        modem33k=(edtValue)*31.207619048;

        modem56k=(edtValue)*18.724571429;

        SCSIAsync=(edtValue)*0.0873813333;

        SCSISync=(edtValue)*0.0262144;

        SCSIFast=(edtValue)*0.0131072;

        SCSIFastUltra=(edtValue)*0.0065536;


        SCSIFastWide=(edtValue)*0.0065536;

        SCSIFastUltraWide=(edtValue)*0.0032768;

        SCSIUltra2=(edtValue)*0.0016384;

        SCSIUltra3=(edtValue)*0.0008192;

        SCSILVDUltra80=(edtValue)*0.0016384;


        SCSILVDUltra160=(edtValue)*0.0008192;

        IDEPIOmode0=(edtValue)*0.0397187879;

        IDEPIOmode1=(edtValue)*0.0252061538;

        IDEPIOmode2=(edtValue)*0.0157918072;

        IDEPIOmode3=(edtValue)*0.0118082883;

        IDEPIOmode4=(edtValue)*0.0078959036;

        IDEDMAmode0=(edtValue)*0.031207619;

        IDEDMAmode1=(edtValue)*0.0098550376;

        IDEDMAmode2=(edtValue)*0.0078959036;

        IDEUDMAmode0=(edtValue)*0.0078959036;

        IDEUDMAmode1=(edtValue)*0.00524288;

        IDEUDMAmode2=(edtValue)*0.0039718788;

        IDEUDMAmode3=(edtValue)*0.00262144;

        IDEUDMAmode4=(edtValue)*0.0019859394;

        IDEUDMA33=(edtValue)*0.0039718788;

        IDEUDMA66=(edtValue)*0.0019859394;

        USB=(edtValue)*0.0873813333;

        firewire=(edtValue)*0.00262144;

        T0payload=(edtValue)*18.724571429;

        T0B8ZSpayload=(edtValue)*16.384;

        T1signal=(edtValue)*0.6791295337;

        T1payload=(edtValue)*0.7801904762;

        T1Zpayload=(edtValue)*0.6791295337;

        T1Csignal=(edtValue)*0.3326700508;

        T1Cpayload=(edtValue)*0.3900952381;

        T2signal=(edtValue)*0.1661242079;

        T3signal=(edtValue)*0.0234391989;

        T3payload=(edtValue)*0.0278639456;

        T3Zpayload=(edtValue)*0.0243809524;

        T4signal=(edtValue)*0.0038244631;

        EPTA1signal=(edtValue)*0.512;

        EPTA1payload=(edtValue)*0.5461333333;

        EPTA2signal=(edtValue)*0.1241212121;

        EPTA2payload=(edtValue)*0.1365333333;

        EPTA3signal=(edtValue)*0.0305102421;

        EPTA3payload=(edtValue)*0.0341333333;

        H0=(edtValue)*2.7306666667;

        H11=(edtValue)*0.6826666667;

        H12=(edtValue)*0.5461333333;

        VirtualTributary1signal=(edtValue)*0.6068148148;

        VirtualTributary1payload=(edtValue)*0.6791295337;

        VirtualTributary2signal=(edtValue)*0.4551111111;

        VirtualTributary2payload=(edtValue)*0.512;

        VirtualTributary6signal=(edtValue)*0.1661242079;

        VirtualTributary6payload=(edtValue)*0.1747626667;

        STS1signal=(edtValue)*0.0202271605;

        STS1payload=(edtValue)*0.0211833535;

        STS3signal=(edtValue)*0.0067423868;

        STS3payload=(edtValue)*0.0069748829;

        STS3csignal=(edtValue)*0.0067423868;

        STS3cpayload=(edtValue)*0.0069748829;

        STS12signal=(edtValue)*0.0016855967;

        STS24signal=(edtValue)*0.0008427984;

        STS48signal=(edtValue)*0.0004213992;

        STS192signal=(edtValue)*0.0001053498;

        STM1signal=(edtValue)*0.0067423868;

        STM4signal=(edtValue)*0.0016855967;

        STM16signal=(edtValue)*0.0004213992;

        STM64signal=(edtValue)*0.0001053498;

    }
    public void Megabytepersecond()
    {
        bitpersecond=(edtValue)*8388608;

        bytepersecond=(edtValue)*1048576;

        kilobitpersecondSI=(edtValue)*8388.608;

        kilobytepersecondSI=(edtValue)*1048.576;

        kilobitpersecond=(edtValue)*8192;

        kilobytepersecond=(edtValue)*1024;

        megabitpersecondSI=(edtValue)*8.388608;

        megabytepersecondSI=(edtValue)*1.048576;

        megabitpersecond=(edtValue)*8;

        megabytepersecond=(edtValue)*1;

        gigabitpersecondSI=(edtValue)*0.008388608;

        gigabytepersecondSI=(edtValue)*0.001048576;

        gigabitpersecond=(edtValue)*0.0078125;

        gigabytepersecond=(edtValue)*0.0009765625;

        terabitpersecondSI=(edtValue)*0.0000083886;

        terabytepersecondSI=(edtValue)*0.0000010486;

        terabitpersecond=(edtValue)*0.0000076294;

        terabytepersecond=(edtValue)*9.536743164E-7;

        ethernet=(edtValue)*0.8388608;

        ethernetfast=(edtValue)*0.08388608;

        ethernetgigabit=(edtValue)*0.008388608;

        OC1=(edtValue)*0.161817284;

        OC3=(edtValue)*0.0539390947;

        OC12=(edtValue)*0.0134847737;

        OC24=(edtValue)*0.0067423868;

        OC48=(edtValue)*0.0033711934;

        OC192=(edtValue)*0.0008427984;

        OC768=(edtValue)*0.0002106996;

        ISDNsinglechannel=(edtValue)*131.072;

        ISDNdualchannel=(edtValue)*65.536;

        modem110=(edtValue)*76260.072727;

        modem300=(edtValue)*27962.026667;

        modem1200=(edtValue)*6990.5066667;

        modem2400=(edtValue)*3495.2533333;

        modem9600=(edtValue)*873.81333333;

        modem14k=(edtValue)*582.54222222;

        modem28k=(edtValue)*291.27111111;

        modem33k=(edtValue)*249.66095238;

        modem56k=(edtValue)*149.79657143;

        SCSIAsync=(edtValue)*0.6990506667;

        SCSISync=(edtValue)*0.2097152;

        SCSIFast=(edtValue)*0.1048576;

        SCSIFastUltra=(edtValue)*0.0524288;


        SCSIFastWide=(edtValue)*0.0524288;

        SCSIFastUltraWide=(edtValue)*0.0262144;

        SCSIUltra2=(edtValue)*0.0131072;

        SCSIUltra3=(edtValue)*0.0065536;

        SCSILVDUltra80=(edtValue)*0.0131072;


        SCSILVDUltra160=(edtValue)*0.0065536;

        IDEPIOmode0=(edtValue)*0.317750303;

        IDEPIOmode1=(edtValue)*0.2016492308;

        IDEPIOmode2=(edtValue)*0.1263344578;

        IDEPIOmode3=(edtValue)*0.0944663063;

        IDEPIOmode4=(edtValue)*0.0631672289;

        IDEDMAmode0=(edtValue)*0.2496609524;

        IDEDMAmode1=(edtValue)*0.0788403008;

        IDEDMAmode2=(edtValue)*0.0631672289;

        IDEUDMAmode0=(edtValue)*0.0631672289;

        IDEUDMAmode1=(edtValue)*0.04194304;

        IDEUDMAmode2=(edtValue)*0.0317750303;

        IDEUDMAmode3=(edtValue)*0.02097152;

        IDEUDMAmode4=(edtValue)*0.0158875152;

        IDEUDMA33=(edtValue)*0.0317750303;

        IDEUDMA66=(edtValue)*0.0158875152;

        USB=(edtValue)*0.6990506667;

        firewire=(edtValue)*0.02097152;

        T0payload=(edtValue)*149.79657143;

        T0B8ZSpayload=(edtValue)*131.072;

        T1signal=(edtValue)*5.4330362694;

        T1payload=(edtValue)*6.2415238095;

        T1Zpayload=(edtValue)*5.4330362694;

        T1Csignal=(edtValue)*2.6613604061;

        T1Cpayload=(edtValue)*3.1207619048;

        T2signal=(edtValue)*1.3289936629;

        T3signal=(edtValue)*0.1875135908;

        T3payload=(edtValue)*0.2229115646;

        T3Zpayload=(edtValue)*0.195047619;

        T4signal=(edtValue)*0.0305957049;

        EPTA1signal=(edtValue)*4.096;

        EPTA1payload=(edtValue)*4.3690666667;

        EPTA2signal=(edtValue)*0.992969697;

        EPTA2payload=(edtValue)*1.0922666667;

        EPTA3signal=(edtValue)*0.2440819367;

        EPTA3payload=(edtValue)*0.2730666667;

        H0=(edtValue)*21.845333333;

        H11=(edtValue)*5.4613333333;

        H12=(edtValue)*4.3690666667;

        VirtualTributary1signal=(edtValue)*4.8545185185;

        VirtualTributary1payload=(edtValue)*5.4330362694;

        VirtualTributary2signal=(edtValue)*3.6408888889;

        VirtualTributary2payload=(edtValue)*4.096;

        VirtualTributary6signal=(edtValue)*1.3289936629;

        VirtualTributary6payload=(edtValue)*1.3981013333;

        STS1signal=(edtValue)*0.161817284;

        STS1payload=(edtValue)*0.1694668283;

        STS3signal=(edtValue)*0.0539390947;

        STS3payload=(edtValue)*0.0557990634;

        STS3csignal=(edtValue)*0.0539390947;

        STS3cpayload=(edtValue)*0.0557990634;

        STS12signal=(edtValue)*0.0134847737;

        STS24signal=(edtValue)*0.0067423868;

        STS48signal=(edtValue)*0.0033711934;

        STS192signal=(edtValue)*0.0008427984;

        STM1signal=(edtValue)*0.0539390947;

        STM4signal=(edtValue)*0.0134847737;

        STM16signal=(edtValue)*0.0033711934;

        STM64signal=(edtValue)*0.0008427984;

    }
    public void GigabitpersecondSI()
    {
        bitpersecond=(edtValue)*1000000000;

        bytepersecond=(edtValue)*125000000;

        kilobitpersecondSI=(edtValue)*1000000;

        kilobytepersecondSI=(edtValue)*125000;

        kilobitpersecond=(edtValue)*976562.5;

        kilobytepersecond=(edtValue)*122070.3125;

        megabitpersecondSI=(edtValue)*1000;

        megabytepersecondSI=(edtValue)*125;

        megabitpersecond=(edtValue)*953.67431641;

        megabytepersecond=(edtValue)*119.20928955;

        gigabitpersecondSI=(edtValue)*1;

        gigabytepersecondSI=(edtValue)*0.125;

        gigabitpersecond=(edtValue)*0.9313225746;

        gigabytepersecond=(edtValue)*0.1164153218;

        terabitpersecondSI=(edtValue)*0.001;

        terabytepersecondSI=(edtValue)*0.000125;

        terabitpersecond=(edtValue)*0.0009094947;

        terabytepersecond=(edtValue)*0.0001136868;

        ethernet=(edtValue)*100;

        ethernetfast=(edtValue)*10;

        ethernetgigabit=(edtValue)*1;

        OC1=(edtValue)*19.290123457;

        OC3=(edtValue)*6.4300411523;

        OC12=(edtValue)*1.6075102881;

        OC24=(edtValue)*0.803755144;

        OC48=(edtValue)*0.401877572;

        OC192=(edtValue)*0.100469393;

        OC768=(edtValue)*0.0251173483;

        ISDNsinglechannel=(edtValue)*15625;

        ISDNdualchannel=(edtValue)*7812.5;

        modem110=(edtValue)*9090909.0909;

        modem300=(edtValue)*3333333.3333;

        modem1200=(edtValue)*833333.33333;

        modem2400=(edtValue)*416666.66667;

        modem9600=(edtValue)*104166.66667;

        modem14k=(edtValue)*69444.444444;

        modem28k=(edtValue)*34722.222222;

        modem33k=(edtValue)*29761.904762;

        modem56k=(edtValue)*17857.142857;

        SCSIAsync=(edtValue)*83.333333333;

        SCSISync=(edtValue)*25;

        SCSIFast=(edtValue)*12.5;

        SCSIFastUltra=(edtValue)*6.25;


        SCSIFastWide=(edtValue)*6.25;

        SCSIFastUltraWide=(edtValue)*3.125;

        SCSIUltra2=(edtValue)*1.5625;

        SCSIUltra3=(edtValue)*0.78125;

        SCSILVDUltra80=(edtValue)*1.5625;


        SCSILVDUltra160=(edtValue)*0.78125;

        IDEPIOmode0=(edtValue)*37.878787879;

        IDEPIOmode1=(edtValue)*24.038461538;

        IDEPIOmode2=(edtValue)*15.060240964;

        IDEPIOmode3=(edtValue)*11.261261261;

        IDEPIOmode4=(edtValue)*7.5301204819;

        IDEDMAmode0=(edtValue)*29.761904762;

        IDEDMAmode1=(edtValue)*9.3984962406;

        IDEDMAmode2=(edtValue)*7.5301204819;

        IDEUDMAmode0=(edtValue)*7.5301204819;

        IDEUDMAmode1=(edtValue)*5;

        IDEUDMAmode2=(edtValue)*3.7878787879;

        IDEUDMAmode3=(edtValue)*2.5;

        IDEUDMAmode4=(edtValue)*1.8939393939;

        IDEUDMA33=(edtValue)*3.7878787879;

        IDEUDMA66=(edtValue)*1.8939393939;

        USB=(edtValue)*83.333333333;

        firewire=(edtValue)*2.5;

        T0payload=(edtValue)*17857.142857;

        T0B8ZSpayload=(edtValue)*15625;

        T1signal=(edtValue)*647.66839378;

        T1payload=(edtValue)*744.04761905;

        T1Zpayload=(edtValue)*647.66839378;

        T1Csignal=(edtValue)*317.25888325;

        T1Cpayload=(edtValue)*372.02380952;

        T2signal=(edtValue)*158.42839037;

        T3signal=(edtValue)*22.353361946;

        T3payload=(edtValue)*26.573129252;

        T3Zpayload=(edtValue)*23.251488095;

        T4signal=(edtValue)*3.6472922502;

        EPTA1signal=(edtValue)*488.28125;

        EPTA1payload=(edtValue)*520.83333333;

        EPTA2signal=(edtValue)*118.37121212;

        EPTA2payload=(edtValue)*130.20833333;

        EPTA3signal=(edtValue)*29.096834264;

        EPTA3payload=(edtValue)*32.552083333;

        H0=(edtValue)*2604.1666667;

        H11=(edtValue)*651.04166667;

        H12=(edtValue)*520.83333333;

        VirtualTributary1signal=(edtValue)*578.7037037;

        VirtualTributary1payload=(edtValue)*647.66839378;

        VirtualTributary2signal=(edtValue)*434.02777778;

        VirtualTributary2payload=(edtValue)*488.28125;

        VirtualTributary6signal=(edtValue)*158.42839037;

        VirtualTributary6payload=(edtValue)*166.66666667;

        STS1signal=(edtValue)*19.290123457;

        STS1payload=(edtValue)*20.202020202;

        STS3signal=(edtValue)*6.4300411523;

        STS3payload=(edtValue)*6.6517667092;

        STS3csignal=(edtValue)*6.4300411523;

        STS3cpayload=(edtValue)*6.6517667092;

        STS12signal=(edtValue)*1.6075102881;

        STS24signal=(edtValue)*0.803755144;

        STS48signal=(edtValue)*0.401877572;

        STS192signal=(edtValue)*0.100469393;

        STM1signal=(edtValue)*6.4300411523;

        STM4signal=(edtValue)*1.6075102881;



        STM16signal=(edtValue)*0.401877572;

        STM64signal=(edtValue)*0.100469393;
    }
    public void GigabytepersecondSI()
    {
        bitpersecond=(edtValue)*8E-9;

        bytepersecond=(edtValue)*1000000000;

        kilobitpersecondSI=(edtValue)*8000000;

        kilobytepersecondSI=(edtValue)*1000000;

        kilobitpersecond=(edtValue)*7812500;

        kilobytepersecond=(edtValue)*976562.5;

        megabitpersecondSI=(edtValue)*8000;

        megabytepersecondSI=(edtValue)*1000;

        megabitpersecond=(edtValue)*7629.3945313;

        megabytepersecond=(edtValue)*953.67431641;

        gigabitpersecondSI=(edtValue)*8;

        gigabytepersecondSI=(edtValue)*1;

        gigabitpersecond=(edtValue)*7.4505805969;

        gigabytepersecond=(edtValue)*0.9313225746;

        terabitpersecondSI=(edtValue)*0.008;

        terabytepersecondSI=(edtValue)*0.001;

        terabitpersecond=(edtValue)*0.0072759576;

        terabytepersecond=(edtValue)*0.0009094947;

        ethernet=(edtValue)*800;

        ethernetfast=(edtValue)*80;

        ethernetgigabit=(edtValue)*8;

        OC1=(edtValue)*154.32098765;

        OC3=(edtValue)*51.440329218;

        OC12=(edtValue)*12.860082305;

        OC24=(edtValue)*6.4300411523;

        OC48=(edtValue)*3.2150205761;

        OC192=(edtValue)*0.803755144;

        OC768=(edtValue)*0.200938786;

        ISDNsinglechannel=(edtValue)*125000;

        ISDNdualchannel=(edtValue)*62500;

        modem110=(edtValue)*72727272.727;

        modem300=(edtValue)*26666666.667;

        modem1200=(edtValue)*6666666.6667;

        modem2400=(edtValue)*3333333.3333;

        modem9600=(edtValue)*833333.33333;

        modem14k=(edtValue)*555555.55556;

        modem28k=(edtValue)*277777.77778;

        modem33k=(edtValue)*238095.2381;

        modem56k=(edtValue)*142857.14286;

        SCSIAsync=(edtValue)*666.66666667;

        SCSISync=(edtValue)*200;

        SCSIFast=(edtValue)*100;

        SCSIFastUltra=(edtValue)*50;


        SCSIFastWide=(edtValue)*50;

        SCSIFastUltraWide=(edtValue)*25;

        SCSIUltra2=(edtValue)*12.2;

        SCSIUltra3=(edtValue)*6.25;

        SCSILVDUltra80=(edtValue)*12.5;


        SCSILVDUltra160=(edtValue)*6.25;

        IDEPIOmode0=(edtValue)*303.03030303;

        IDEPIOmode1=(edtValue)*192.30769231;

        IDEPIOmode2=(edtValue)*120.48192771;

        IDEPIOmode3=(edtValue)*90.09009009;

        IDEPIOmode4=(edtValue)*60.240963855;

        IDEDMAmode0=(edtValue)*238.0952381;

        IDEDMAmode1=(edtValue)*75.187969925;

        IDEDMAmode2=(edtValue)*60.240963855;

        IDEUDMAmode0=(edtValue)*60.240963855;

        IDEUDMAmode1=(edtValue)*40;

        IDEUDMAmode2=(edtValue)*30.303030303;

        IDEUDMAmode3=(edtValue)*20;

        IDEUDMAmode4=(edtValue)*15.151515152;

        IDEUDMA33=(edtValue)*30.303030303;

        IDEUDMA66=(edtValue)*15.151515152;

        USB=(edtValue)*666.66666667;

        firewire=(edtValue)*20;

        T0payload=(edtValue)*142857.14286;

        T0B8ZSpayload=(edtValue)*125000;

        T1signal=(edtValue)*5181.3471503;

        T1payload=(edtValue)*5952.3809524;

        T1Zpayload=(edtValue)*5181.3471503;

        T1Csignal=(edtValue)*2538.071066;

        T1Cpayload=(edtValue)*2976.1904762;

        T2signal=(edtValue)*1267.4271229;

        T3signal=(edtValue)*178.82689557;

        T3payload=(edtValue)*212.58503401;

        T3Zpayload=(edtValue)*186.01190476;

        T4signal=(edtValue)*29.178338002;

        EPTA1signal=(edtValue)*3906.25;

        EPTA1payload=(edtValue)*4166.6666667;

        EPTA2signal=(edtValue)*946.96969697;

        EPTA2payload=(edtValue)*1041.6666667;

        EPTA3signal=(edtValue)*232.77467412;

        EPTA3payload=(edtValue)*260.41666667;

        H0=(edtValue)*20833.333333;

        H11=(edtValue)*5208.3333333;

        H12=(edtValue)*4166.6666667;

        VirtualTributary1signal=(edtValue)*4629.6296296;

        VirtualTributary1payload=(edtValue)*5181.3471503;

        VirtualTributary2signal=(edtValue)*3472.2222222;

        VirtualTributary2payload=(edtValue)*3906.25;

        VirtualTributary6signal=(edtValue)*1267.4271229;

        VirtualTributary6payload=(edtValue)*1333.3333333;

        STS1signal=(edtValue)*154.32098765;

        STS1payload=(edtValue)*161.61616162;

        STS3signal=(edtValue)*51.440329218;

        STS3payload=(edtValue)*53.214133674;

        STS3csignal=(edtValue)*51.440329218;

        STS3cpayload=(edtValue)*53.214133674;

        STS12signal=(edtValue)*12.860082305;

        STS24signal=(edtValue)*6.4300411523;

        STS48signal=(edtValue)*3.2150205761;

        STS192signal=(edtValue)*0.803755144;

        STM1signal=(edtValue)*51.440329218;

        STM4signal=(edtValue)*12.860082305;

        STM16signal=(edtValue)*3.2150205761;

        STM64signal=(edtValue)*0.803755144;

    }
    public void Gigabitpersecond()
    {
        bitpersecond=(edtValue)*1073741824;

        bytepersecond=(edtValue)*134217728;

        kilobitpersecondSI=(edtValue)*1073741.824;

        kilobytepersecondSI=(edtValue)*134217.728;

        kilobitpersecond=(edtValue)*1048576;

        kilobytepersecond=(edtValue)*131072;

        megabitpersecondSI=(edtValue)*1073.741824;

        megabytepersecondSI=(edtValue)*134.217728;

        megabitpersecond=(edtValue)*1024;

        megabytepersecond=(edtValue)*128;

        gigabitpersecondSI=(edtValue)*1.073741824;

        gigabytepersecondSI=(edtValue)*0.134217728;

        gigabitpersecond=(edtValue)*1;

        gigabytepersecond=(edtValue)*0.125;

        terabitpersecondSI=(edtValue)*0.0010737418;

        terabytepersecondSI=(edtValue)*0.0001342177;

        terabitpersecond=(edtValue)*0.0009765625;

        terabytepersecond=(edtValue)*0.0001220703;

        ethernet=(edtValue)*107.3741824;

        ethernetfast=(edtValue)*10.73741824;

        ethernetgigabit=(edtValue)*1.073741824;

        OC1=(edtValue)*20.712612346;

        OC3=(edtValue)*6.9042041152;

        OC12=(edtValue)*1.7260510288;

        OC24=(edtValue)*0.8630255144;

        OC48=(edtValue)*0.4315127572;

        OC192=(edtValue)*0.1078781893;

        OC768=(edtValue)*0.0269695473;

        ISDNsinglechannel=(edtValue)*16777.216;

        ISDNdualchannel=(edtValue)*8388.608;

        modem110=(edtValue)*9761289.3091;

        modem300=(edtValue)*3579139.4133;

        modem1200=(edtValue)*894784.85333;

        modem2400=(edtValue)*447392.42667;

        modem9600=(edtValue)*111848.10667;

        modem14k=(edtValue)*74565.404444;

        modem28k=(edtValue)*37282.702222;

        modem33k=(edtValue)*31956.601905;

        modem56k=(edtValue)*19173.961143;

        SCSIAsync=(edtValue)*89.478485333;

        SCSISync=(edtValue)*26.8435456;

        SCSIFast=(edtValue)*13.4217728;

        SCSIFastUltra=(edtValue)*6.7108864;


        SCSIFastWide=(edtValue)*6.7108864;

        SCSIFastUltraWide=(edtValue)*3.3554432;

        SCSIUltra2=(edtValue)*1.6777216;

        SCSIUltra3=(edtValue)*0.8388608;

        SCSILVDUltra80=(edtValue)*1.6777216;


        SCSILVDUltra160=(edtValue)*0.8388608;

        IDEPIOmode0=(edtValue)*40.672038788;

        IDEPIOmode1=(edtValue)*25.811101538;

        IDEPIOmode2=(edtValue)*16.170810602;

        IDEPIOmode3=(edtValue)*12.091687207;

        IDEPIOmode4=(edtValue)*8.0854053012;

        IDEDMAmode0=(edtValue)*31.956601905;

        IDEDMAmode1=(edtValue)*10.091558496;

        IDEDMAmode2=(edtValue)*8.0854053012;

        IDEUDMAmode0=(edtValue)*8.0854053012;

        IDEUDMAmode1=(edtValue)*5.36870912;

        IDEUDMAmode2=(edtValue)*4.0672038788;

        IDEUDMAmode3=(edtValue)*2.68435456;

        IDEUDMAmode4=(edtValue)*2.0336019394;

        IDEUDMA33=(edtValue)*4.0672038788;

        IDEUDMA66=(edtValue)*2.0336019394;

        USB=(edtValue)*89.478485333;

        firewire=(edtValue)*2.68435456;

        T0payload=(edtValue)*19173.961143;

        T0B8ZSpayload=(edtValue)*16777.216;

        T1signal=(edtValue)*695.42864249;

        T1payload=(edtValue)*798.91504762;

        T1Zpayload=(edtValue)*695.42864249;

        T1Csignal=(edtValue)*340.65413198;

        T1Cpayload=(edtValue)*399.45752381;

        T2signal=(edtValue)*170.11118885;

        T3signal=(edtValue)*24.001739628;

        T3payload=(edtValue)*28.532680272;

        T3Zpayload=(edtValue)*24.966095238;

        T4signal=(edtValue)*3.9162502334;

        EPTA1signal=(edtValue)*524.288;

        EPTA1payload=(edtValue)*559.24053333;

        EPTA2signal=(edtValue)*127.10012121;

        EPTA2payload=(edtValue)*139.81013333;

        EPTA3signal=(edtValue)*31.242487896;

        EPTA3payload=(edtValue)*34.952533333;

        H0=(edtValue)*2796.2026667;

        H11=(edtValue)*699.05066667;

        H12=(edtValue)*559.24053333;

        VirtualTributary1signal=(edtValue)*621.37837037;

        VirtualTributary1payload=(edtValue)*695.42864249;

        VirtualTributary2signal=(edtValue)*466.03377778;

        VirtualTributary2payload=(edtValue)*524.288;

        VirtualTributary6signal=(edtValue)*170.11118885;

        VirtualTributary6payload=(edtValue)*178.95697067;

        STS1signal=(edtValue)*20.712612346;

        STS1payload=(edtValue)*21.69175402;

        STS3signal=(edtValue)*6.9042041152;

        STS3payload=(edtValue)*7.1422801192;

        STS3csignal=(edtValue)*6.9042041152;

        STS3cpayload=(edtValue)*7.1422801192;

        STS12signal=(edtValue)*1.7260510288;

        STS24signal=(edtValue)*0.8630255144;

        STS48signal=(edtValue)*0.4315127572;

        STS192signal=(edtValue)*0.1078781893;

        STM1signal=(edtValue)*6.9042041152;

        STM4signal=(edtValue)*1.7260510288;

        STM16signal=(edtValue)*0.4315127572;

        STM64signal=(edtValue)*0.1078781893;
    }
    public void  Gigabytepersecond()
    {
        bitpersecond=(edtValue)*0.08589934592E-2;

        bytepersecond=(edtValue)*1073741824;

        kilobitpersecondSI=(edtValue)*8589934.592;

        kilobytepersecondSI=(edtValue)*1073741.824;

        kilobitpersecond=(edtValue)*8388608;

        kilobytepersecond=(edtValue)*1048576;

        megabitpersecondSI=(edtValue)*8589.934592;

        megabytepersecondSI=(edtValue)*1073.741824;

        megabitpersecond=(edtValue)*8192;

        megabytepersecond=(edtValue)*1024;

        gigabitpersecondSI=(edtValue)*8.589934592;

        gigabytepersecondSI=(edtValue)*1.073741824;

        gigabitpersecond=(edtValue)*8;

        gigabytepersecond=(edtValue)*1;

        terabitpersecondSI=(edtValue)*0.0085899346;

        terabytepersecondSI=(edtValue)*0.0010737418;

        terabitpersecond=(edtValue)*0.0078125;

        terabytepersecond=(edtValue)*0.0009765625;

        ethernet=(edtValue)*858.9934592;

        ethernetfast=(edtValue)*85.89934592;

        ethernetgigabit=(edtValue)*8.589934592;

        OC1=(edtValue)*165.70089877;

        OC3=(edtValue)*55.233632922;

        OC12=(edtValue)*13.80840823;

        OC24=(edtValue)*6.9042041152;

        OC48=(edtValue)*3.4521020576;

        OC192=(edtValue)*0.8630255144;

        OC768=(edtValue)*0.2157563786;

        ISDNsinglechannel=(edtValue)*134217.728;

        ISDNdualchannel=(edtValue)*67108.864;

        modem110=(edtValue)*78090314.473;

        modem300=(edtValue)*28633115.307;

        modem1200=(edtValue)*7158278.8267;

        modem2400=(edtValue)*3579139.4133;

        modem9600=(edtValue)*894784.85333;

        modem14k=(edtValue)*596523.23556;

        modem28k=(edtValue)*298261.61778;

        modem33k=(edtValue)*255652.81524;

        modem56k=(edtValue)*153391.68914;

        SCSIAsync=(edtValue)*715.82788267;

        SCSISync=(edtValue)*214.7483648;

        SCSIFast=(edtValue)*107.3741824;

        SCSIFastUltra=(edtValue)*53.6870912;


        SCSIFastWide=(edtValue)*53.6870912;

        SCSIFastUltraWide=(edtValue)*26.8435456;

        SCSIUltra2=(edtValue)*13.4217728;

        SCSIUltra3=(edtValue)*6.7108864;

        SCSILVDUltra80=(edtValue)*13.4217728;


        SCSILVDUltra160=(edtValue)*6.7108864;

        IDEPIOmode0=(edtValue)*325.3763103;

        IDEPIOmode1=(edtValue)*206.48881231;

        IDEPIOmode2=(edtValue)*129.36648482;

        IDEPIOmode3=(edtValue)*96.733497658;

        IDEPIOmode4=(edtValue)*64.68324241;

        IDEDMAmode0=(edtValue)*255.65281524;

        IDEDMAmode1=(edtValue)*80.73246797;

        IDEDMAmode2=(edtValue)*64.68324241;

        IDEUDMAmode0=(edtValue)*64.68324241;

        IDEUDMAmode1=(edtValue)*42.94967296;

        IDEUDMAmode2=(edtValue)*32.53763103;

        IDEUDMAmode3=(edtValue)*21.47483648;

        IDEUDMAmode4=(edtValue)*16.268815515;

        IDEUDMA33=(edtValue)*32.53763103;

        IDEUDMA66=(edtValue)*16.268815515;

        USB=(edtValue)*715.82788267;

        firewire=(edtValue)*21.47483648;

        T0payload=(edtValue)*153391.68914;

        T0B8ZSpayload=(edtValue)*134217.728;

        T1signal=(edtValue)*5563.4291399;

        T1payload=(edtValue)*6391.320381;

        T1Zpayload=(edtValue)*5563.4291399;

        T1Csignal=(edtValue)*2725.2330558;

        T1Cpayload=(edtValue)*3195.6601905;

        T2signal=(edtValue)*1360.8895108;

        T3signal=(edtValue)*192.01391702;

        T3payload=(edtValue)*228.26144218;

        T3Zpayload=(edtValue)*199.7287619;

        T4signal=(edtValue)*31.330001867;

        EPTA1signal=(edtValue)*4194.304;

        EPTA1payload=(edtValue)*4473.9242667;

        EPTA2signal=(edtValue)*1016.8009697;

        EPTA2payload=(edtValue)*1118.4810667;

        EPTA3signal=(edtValue)*249.93990317;

        EPTA3payload=(edtValue)*279.62026667;

        H0=(edtValue)*22369.621333;

        H11=(edtValue)*5592.4053333;

        H12=(edtValue)*4473.9242667;

        VirtualTributary1signal=(edtValue)*4971.026963;

        VirtualTributary1payload=(edtValue)*5563.4291399;

        VirtualTributary2signal=(edtValue)*3728.2702222;

        VirtualTributary2payload=(edtValue)*4194.304;

        VirtualTributary6signal=(edtValue)*1360.8895108;

        VirtualTributary6payload=(edtValue)*1431.6557653;

        STS1signal=(edtValue)*165.70089877;

        STS1payload=(edtValue)*173.53403216;

        STS3signal=(edtValue)*55.233632922;

        STS3payload=(edtValue)*57.138240954;

        STS3csignal=(edtValue)*55.233632922;

        STS3cpayload=(edtValue)*57.138240954;

        STS12signal=(edtValue)*13.80840823;

        STS24signal=(edtValue)*6.9042041152;

        STS48signal=(edtValue)*3.4521020576;

        STS192signal=(edtValue)*0.8630255144;

        STM1signal=(edtValue)*55.233632922;

        STM4signal=(edtValue)*13.80840823;

        STM16signal=(edtValue)*3.4521020576;

        STM64signal=(edtValue)*0.8630255144;

    }
    public void TerabitpersecondSI()
    {
        bitpersecond=(edtValue)*1E12;

        bytepersecond=(edtValue)*125E9;

        kilobitpersecondSI=(edtValue)*1000000000;

        kilobytepersecondSI=(edtValue)*125000000;

        kilobitpersecond=(edtValue)*976562500;

        kilobytepersecond=(edtValue)*122070312.5;

        megabitpersecondSI=(edtValue)*1000000;

        megabytepersecondSI=(edtValue)*125000;

        megabitpersecond=(edtValue)*953674.31641;

        megabytepersecond=(edtValue)*119209.28955;

        gigabitpersecondSI=(edtValue)*1000;

        gigabytepersecondSI=(edtValue)*125;

        gigabitpersecond=(edtValue)*931.32257462;

        gigabytepersecond=(edtValue)*116.41532183;

        terabitpersecondSI=(edtValue)*1;

        terabytepersecondSI=(edtValue)*0.125;

        terabitpersecond=(edtValue)*0.9094947018;

        terabytepersecond=(edtValue)*0.1136868377;

        ethernet=(edtValue)*100000;

        ethernetfast=(edtValue)*10000;

        ethernetgigabit=(edtValue)*1000;

        OC1=(edtValue)*19290.123457;

        OC3=(edtValue)*6430.0411523;

        OC12=(edtValue)*1607.5102881;

        OC24=(edtValue)*803.75514403;

        OC48=(edtValue)*401.87757202;

        OC192=(edtValue)*100.469393;

        OC768=(edtValue)*25.117348251;

        ISDNsinglechannel=(edtValue)*15625000;

        ISDNdualchannel=(edtValue)*7812500;

        modem110=(edtValue)*9090909090.9;

        modem300=(edtValue)*3333333333.3;

        modem1200=(edtValue)*833333333.33;

        modem2400=(edtValue)*416666666.67;

        modem9600=(edtValue)*104166666.67;

        modem14k=(edtValue)*69444444.444;

        modem28k=(edtValue)*34722222.222;

        modem33k=(edtValue)*29761904.762;

        modem56k=(edtValue)*17857142.857;

        SCSIAsync=(edtValue)*83333.333333;

        SCSISync=(edtValue)*25000;

        SCSIFast=(edtValue)*12500;

        SCSIFastUltra=(edtValue)*6250;


        SCSIFastWide=(edtValue)*6250;

        SCSIFastUltraWide=(edtValue)*3125;

        SCSIUltra2=(edtValue)*1562.5;

        SCSIUltra3=(edtValue)*781.25;

        SCSILVDUltra80=(edtValue)*1562.5;


        SCSILVDUltra160=(edtValue)*781.25;

        IDEPIOmode0=(edtValue)*37878.787879;

        IDEPIOmode1=(edtValue)*24038.461538;

        IDEPIOmode2=(edtValue)*15060.240964;

        IDEPIOmode3=(edtValue)*11261.261261;

        IDEPIOmode4=(edtValue)*7530.1204819;

        IDEDMAmode0=(edtValue)*29761.904762;

        IDEDMAmode1=(edtValue)*9398.4962406;

        IDEDMAmode2=(edtValue)*7530.1204819;

        IDEUDMAmode0=(edtValue)*7530.1204819;

        IDEUDMAmode1=(edtValue)*5000;

        IDEUDMAmode2=(edtValue)*3787.8787879;

        IDEUDMAmode3=(edtValue)*2500;

        IDEUDMAmode4=(edtValue)*1893.9393939;

        IDEUDMA33=(edtValue)*3787.8787879;

        IDEUDMA66=(edtValue)*1893.9393939;

        USB=(edtValue)*83333.333333;

        firewire=(edtValue)*2500;

        T0payload=(edtValue)*17857142.857;

        T0B8ZSpayload=(edtValue)*15625000;

        T1signal=(edtValue)*647668.39378;

        T1payload=(edtValue)*744047.61905;

        T1Zpayload=(edtValue)*647668.39378;

        T1Csignal=(edtValue)*317258.88325;

        T1Cpayload=(edtValue)*372023.80952;

        T2signal=(edtValue)*158428.39037;

        T3signal=(edtValue)*22353.361946;

        T3payload=(edtValue)*26573.129252;

        T3Zpayload=(edtValue)*23251.488095;

        T4signal=(edtValue)*3647.2922502;

        EPTA1signal=(edtValue)*488281.25;

        EPTA1payload=(edtValue)*520833.33333;

        EPTA2signal=(edtValue)*118371.21212;

        EPTA2payload=(edtValue)*130208.33333;

        EPTA3signal=(edtValue)*29096.834264;

        EPTA3payload=(edtValue)*32552.083333;

        H0=(edtValue)*2604166.6667;

        H11=(edtValue)*651041.66667;

        H12=(edtValue)*520833.33333;

        VirtualTributary1signal=(edtValue)*578703.7037;

        VirtualTributary1payload=(edtValue)*647668.39378;

        VirtualTributary2signal=(edtValue)*434027.77778;

        VirtualTributary2payload=(edtValue)*488281.25;

        VirtualTributary6signal=(edtValue)*158428.39037;

        VirtualTributary6payload=(edtValue)*166666.66667;

        STS1signal=(edtValue)*19290.123457;

        STS1payload=(edtValue)*20202.020202;

        STS3signal=(edtValue)*6430.0411523;

        STS3payload=(edtValue)*6651.7667092;

        STS3csignal=(edtValue)*6430.0411523;

        STS3cpayload=(edtValue)*6651.7667092;

        STS12signal=(edtValue)*1607.5102881;

        STS24signal=(edtValue)*803.75514403;

        STS48signal=(edtValue)*401.87757202;

        STS192signal=(edtValue)*100.469393;

        STM1signal=(edtValue)*6430.0411523;

        STM4signal=(edtValue)*1607.5102881;

        STM16signal=(edtValue)*401.87757202;

        STM64signal=(edtValue)*100.469393;
    }
    public void TerabytepersecondSI()
    {
        bitpersecond=(edtValue)*8E12;

        bytepersecond=(edtValue)*1E12;

        kilobitpersecondSI=(edtValue)*8E9;

        kilobytepersecondSI=(edtValue)*1000000000;

        kilobitpersecond=(edtValue)*7.812500000E-1;

        kilobytepersecond=(edtValue)*976562500;

        megabitpersecondSI=(edtValue)*8000000;

        megabytepersecondSI=(edtValue)*1000000;

        megabitpersecond=(edtValue)*7629394.5313;

        megabytepersecond=(edtValue)*953674.31641;

        gigabitpersecondSI=(edtValue)*8000;

        gigabytepersecondSI=(edtValue)*1000;

        gigabitpersecond=(edtValue)*7450.5805969;

        gigabytepersecond=(edtValue)*931.32257462;

        terabitpersecondSI=(edtValue)*8;

        terabytepersecondSI=(edtValue)*1;

        terabitpersecond=(edtValue)*7.2759576142;

        terabytepersecond=(edtValue)*0.9094947018;

        ethernet=(edtValue)*800000;

        ethernetfast=(edtValue)*80000;

        ethernetgigabit=(edtValue)*8000;

        OC1=(edtValue)*154320.98765;

        OC3=(edtValue)*51440.329218;

        OC12=(edtValue)*12860.082305;

        OC24=(edtValue)*6430.0411523;

        OC48=(edtValue)*3215.0205761;

        OC192=(edtValue)*803.75514403;

        OC768=(edtValue)*200.93878601;

        ISDNsinglechannel=(edtValue)*125000000;

        ISDNdualchannel=(edtValue)*62500000;

        modem110=(edtValue)*7.2727272727E-1;

        modem300=(edtValue)*2.6666666667E-1;

        modem1200=(edtValue)*6666666666.7;

        modem2400=(edtValue)*3333333333.3;

        modem9600=(edtValue)*833333333.33;

        modem14k=(edtValue)*555555555.56;

        modem28k=(edtValue)*277777777.78;

        modem33k=(edtValue)*238095238.1;

        modem56k=(edtValue)*142857142.86;

        SCSIAsync=(edtValue)*666666.66667;

        SCSISync=(edtValue)*200000;

        SCSIFast=(edtValue)*100000;

        SCSIFastUltra=(edtValue)*50000;


        SCSIFastWide=(edtValue)*50000;

        SCSIFastUltraWide=(edtValue)*25000;

        SCSIUltra2=(edtValue)*12500;

        SCSIUltra3=(edtValue)*6250;

        SCSILVDUltra80=(edtValue)*12500;


        SCSILVDUltra160=(edtValue)*6250;

        IDEPIOmode0=(edtValue)*303030.30303;

        IDEPIOmode1=(edtValue)*192307.69231;

        IDEPIOmode2=(edtValue)*120481.92771;

        IDEPIOmode3=(edtValue)*90090.09009;

        IDEPIOmode4=(edtValue)*60240.963855;

        IDEDMAmode0=(edtValue)*238095.2381;

        IDEDMAmode1=(edtValue)*75187.969925;

        IDEDMAmode2=(edtValue)*60240.963855;

        IDEUDMAmode0=(edtValue)*60240.963855;

        IDEUDMAmode1=(edtValue)*40000;

        IDEUDMAmode2=(edtValue)*30303.030303;

        IDEUDMAmode3=(edtValue)*20000;

        IDEUDMAmode4=(edtValue)*15151.515152;

        IDEUDMA33=(edtValue)*30303.030303;

        IDEUDMA66=(edtValue)*15151.515152;

        USB=(edtValue)*666666.66667;

        firewire=(edtValue)*20000;

        T0payload=(edtValue)*142857142.86;

        T0B8ZSpayload=(edtValue)*125000000;

        T1signal=(edtValue)*5181347.1503;

        T1payload=(edtValue)*5952380.9524;

        T1Zpayload=(edtValue)*5181347.1503;

        T1Csignal=(edtValue)*2538071.066;

        T1Cpayload=(edtValue)*2976190.4762;

        T2signal=(edtValue)*1267427.1229;

        T3signal=(edtValue)*178826.89557;

        T3payload=(edtValue)*212585.03401;

        T3Zpayload=(edtValue)*186011.90476;

        T4signal=(edtValue)*29178.338002;

        EPTA1signal=(edtValue)*3906250;

        EPTA1payload=(edtValue)*4166666.6667;

        EPTA2signal=(edtValue)*946969.69697;

        EPTA2payload=(edtValue)*1041666.6667;

        EPTA3signal=(edtValue)*232774.67412;

        EPTA3payload=(edtValue)*260416.66667;

        H0=(edtValue)*20833333.333;

        H11=(edtValue)*5208333.3333;

        H12=(edtValue)*4166666.6667;

        VirtualTributary1signal=(edtValue)*4629629.6296;

        VirtualTributary1payload=(edtValue)*5181347.1503;

        VirtualTributary2signal=(edtValue)*3472222.2222;

        VirtualTributary2payload=(edtValue)*3906250;

        VirtualTributary6signal=(edtValue)*1267427.1229;

        VirtualTributary6payload=(edtValue)*1333333.3333;

        STS1signal=(edtValue)*154320.98765;

        STS1payload=(edtValue)*161616.16162;

        STS3signal=(edtValue)*51440.329218;

        STS3payload=(edtValue)*53214.133674;

        STS3csignal=(edtValue)*51440.329218;

        STS3cpayload=(edtValue)*53214.133674;

        STS12signal=(edtValue)*12860.082305;

        STS24signal=(edtValue)*6430.0411523;

        STS48signal=(edtValue)*3215.0205761;

        STS192signal=(edtValue)*803.75514403;

        STM1signal=(edtValue)*51440.329218;

        STM4signal=(edtValue)*12860.082305;

        STM16signal=(edtValue)*3215.0205761;

        STM64signal=(edtValue)*803.75514403;
    }
    private void Terabitpersecond()
    {

        bitpersecond=(edtValue)*0.1099511627776E-1;

        bytepersecond=(edtValue)*0.137438953472E-1;

        kilobitpersecondSI=(edtValue)*1099511627.8;

        kilobytepersecondSI=(edtValue)*137438953.47;

        kilobitpersecond=(edtValue)*1073741824;

        kilobytepersecond=(edtValue)*134217728;

        megabitpersecondSI=(edtValue)*1099511.6278;

        megabytepersecondSI=(edtValue)*137438.95347;

        megabitpersecond=(edtValue)*1048576;

        megabytepersecond=(edtValue)*131072;

        gigabitpersecondSI=(edtValue)*1099.5116278;

        gigabytepersecondSI=(edtValue)*137.43895347;

        gigabitpersecond=(edtValue)*1024;

        gigabytepersecond=(edtValue)*128;

        terabitpersecondSI=(edtValue)*1.0995116278;

        terabytepersecondSI=(edtValue)*0.1374389535;

        terabitpersecond=(edtValue)*1;

        terabytepersecond=(edtValue)*0.125;

        ethernet=(edtValue)*109951.16278;

        ethernetfast=(edtValue)*10995.116278;

        ethernetgigabit=(edtValue)*1099.5116278;

        OC1=(edtValue)*21209.715042;

        OC3=(edtValue)*7069.905014;

        OC12=(edtValue)*1767.4762535;

        OC24=(edtValue)*883.73812675;

        OC48=(edtValue)*441.86906337;

        OC192=(edtValue)*110.46726584;

        OC768=(edtValue)*27.616816461;

        ISDNsinglechannel=(edtValue)*17179869.184;

        ISDNdualchannel=(edtValue)*8589934.592;

        modem110=(edtValue)*9995560252.5;

        modem300=(edtValue)*3665038759.3;

        modem1200=(edtValue)*916259689.81;

        modem2400=(edtValue)*458129844.91;

        modem9600=(edtValue)*114532461.23;

        modem14k=(edtValue)*76354974.151;

        modem28k=(edtValue)*38177487.076;

        modem33k=(edtValue)*32723560.35;

        modem56k=(edtValue)*19634136.21;

        SCSIAsync=(edtValue)*91625.968981;

        SCSISync=(edtValue)*27487.790694;

        SCSIFast=(edtValue)*13743.895347;

        SCSIFastUltra=(edtValue)*6871.9476736;


        SCSIFastWide=(edtValue)*6871.9476736;

        SCSIFastUltraWide=(edtValue)*3435.9738368;

        SCSIUltra2=(edtValue)*1717.9869184;

        SCSIUltra3=(edtValue)*858.9934592;

        SCSILVDUltra80=(edtValue)*1717.9869184;


        SCSILVDUltra160=(edtValue)*858.9934592;

        IDEPIOmode0=(edtValue)*41648.167719;

        IDEPIOmode1=(edtValue)*26430.567975;

        IDEPIOmode2=(edtValue)*16558.910057;

        IDEPIOmode3=(edtValue)*12381.8877;

        IDEPIOmode4=(edtValue)*8279.4550284;

        IDEDMAmode0=(edtValue)*32723.56035;

        IDEDMAmode1=(edtValue)*10333.7559;

        IDEDMAmode2=(edtValue)*8279.4550284;

        IDEUDMAmode0=(edtValue)*8279.4550284;

        IDEUDMAmode1=(edtValue)*5497.5581389;

        IDEUDMAmode2=(edtValue)*4164.8167719;

        IDEUDMAmode3=(edtValue)*2748.7790694;

        IDEUDMAmode4=(edtValue)*2082.4083859;

        IDEUDMA33=(edtValue)*4164.8167719;

        IDEUDMA66=(edtValue)*2082.4083859;

        USB=(edtValue)*91625.968981;

        firewire=(edtValue)*2748.7790694;

        T0payload=(edtValue)*19634136.21;

        T0B8ZSpayload=(edtValue)*17179869.184;

        T1signal=(edtValue)*712118.92991;

        T1payload=(edtValue)*818089.00876;

        T1Zpayload=(edtValue)*712118.92991;

        T1Csignal=(edtValue)*348829.83115;

        T1Cpayload=(edtValue)*409044.50438;

        T2signal=(edtValue)*174193.85738;

        T3signal=(edtValue)*24577.781379;

        T3payload=(edtValue)*29217.464599;

        T3Zpayload=(edtValue)*25565.281524;

        T4signal=(edtValue)*4010.240239;

        EPTA1signal=(edtValue)*536870.912;

        EPTA1payload=(edtValue)*572662.30613;

        EPTA2signal=(edtValue)*130150.52412;

        EPTA2payload=(edtValue)*143165.57653;

        EPTA3signal=(edtValue)*31992.307605;

        EPTA3payload=(edtValue)*35791.394133;

        H0=(edtValue)*2863311.5307;

        H11=(edtValue)*715827.88267;

        H12=(edtValue)*572662.30613;

        VirtualTributary1signal=(edtValue)*636291.45126;

        VirtualTributary1payload=(edtValue)*712118.92991;

        VirtualTributary2signal=(edtValue)*477218.58844;

        VirtualTributary2payload=(edtValue)*536870.912;

        VirtualTributary6signal=(edtValue)*174193.85738;

        VirtualTributary6payload=(edtValue)*183251.93796;

        STS1signal=(edtValue)*21209.715042;

        STS1payload=(edtValue)*22212.356117;

        STS3signal=(edtValue)*7069.905014;

        STS3payload=(edtValue)*7313.6948421;

        STS3csignal=(edtValue)*7069.905014;

        STS3cpayload=(edtValue)*7313.6948421;

        STS12signal=(edtValue)*1767.4762535;

        STS24signal=(edtValue)*883.73812675;

        STS48signal=(edtValue)*441.86906337;

        STS192signal=(edtValue)*110.46726584;

        STM1signal=(edtValue)*7069.905014;

        STM4signal=(edtValue)*1767.4762535;

        STM16signal=(edtValue)*441.86906337;

        STM64signal=(edtValue)*110.46726584;
    }
    public void Terabytepersecond()
    {

        bitpersecond=(edtValue)*0.8796093022208E-1;

        bytepersecond=(edtValue)*0.1099511627776E-1;

        kilobitpersecondSI=(edtValue)*8796093022.2;

        kilobytepersecondSI=(edtValue)*1099511627.8;

        kilobitpersecond=(edtValue)*0.8589934592E-1;

        kilobytepersecond=(edtValue)*1073741824;

        megabitpersecondSI=(edtValue)*8796093.0222;

        megabytepersecondSI=(edtValue)*1099511.6278;

        megabitpersecond=(edtValue)*8388608;

        megabytepersecond=(edtValue)*1048576;

        gigabitpersecondSI=(edtValue)*8796.0930222;

        gigabytepersecondSI=(edtValue)*1099.5116278;

        gigabitpersecond=(edtValue)*8192;

        gigabytepersecond=(edtValue)*1024;

        terabitpersecondSI=(edtValue)*8.7960930222;

        terabytepersecondSI=(edtValue)*1.0995116278;

        terabitpersecond=(edtValue)*8;

        terabytepersecond=(edtValue)*1;

        ethernet=(edtValue)*879609.30222;

        ethernetfast=(edtValue)*87960.930222;

        ethernetgigabit=(edtValue)*8796.0930222;

        OC1=(edtValue)*169677.72034;

        OC3=(edtValue)*56559.240112;

        OC12=(edtValue)*14139.810028;

        OC24=(edtValue)*7069.905014;

        OC48=(edtValue)*3534.952507;

        OC192=(edtValue)*883.73812675;

        OC768=(edtValue)*220.93453169;

        ISDNsinglechannel=(edtValue)*137438953.47;

        ISDNdualchannel=(edtValue)*68719476.736;

        modem110=(edtValue)*0.79964482020E-1;

        modem300=(edtValue)*0.29320310074E-1;

        modem1200=(edtValue)*7330077518.5;

        modem2400=(edtValue)*3665038759.3;

        modem9600=(edtValue)*916259689.81;

        modem14k=(edtValue)*610839793.21;

        modem28k=(edtValue)*305419896.6;

        modem33k=(edtValue)*261788482.8;

        modem56k=(edtValue)*157073089.68;

        SCSIAsync=(edtValue)*733007.75185;

        SCSISync=(edtValue)*219902.32556;

        SCSIFast=(edtValue)*109951.16278;

        SCSIFastUltra=(edtValue)*54975.581389;


        SCSIFastWide=(edtValue)*54975.581389;

        SCSIFastUltraWide=(edtValue)*27487.790694;

        SCSIUltra2=(edtValue)*13743.895347;

        SCSIUltra3=(edtValue)*6871.9476736;

        SCSILVDUltra80=(edtValue)*13743.895347;


        SCSILVDUltra160=(edtValue)*6871.9476736;

        IDEPIOmode0=(edtValue)*333185.34175;

        IDEPIOmode1=(edtValue)*211444.5438;

        IDEPIOmode2=(edtValue)*132471.28045;

        IDEPIOmode3=(edtValue)*99055.101601;

        IDEPIOmode4=(edtValue)*66235.640227;

        IDEDMAmode0=(edtValue)*261788.4828;

        IDEDMAmode1=(edtValue)*82670.047201;

        IDEDMAmode2=(edtValue)*66235.640227;

        IDEUDMAmode0=(edtValue)*66235.640227;

        IDEUDMAmode1=(edtValue)*43980.465111;

        IDEUDMAmode2=(edtValue)*33318.534175;

        IDEUDMAmode3=(edtValue)*21990.232556;

        IDEUDMAmode4=(edtValue)*16659.267088;

        IDEUDMA33=(edtValue)*33318.534175;

        IDEUDMA66=(edtValue)*16659.267088;

        USB=(edtValue)*733007.75185;

        firewire=(edtValue)*21990.232556;

        T0payload=(edtValue)*157073089.68;

        T0B8ZSpayload=(edtValue)*137438953.47;

        T1signal=(edtValue)*5696951.4393;

        T1payload=(edtValue)*6544712.0701;

        T1Zpayload=(edtValue)*5696951.4393;

        T1Csignal=(edtValue)*2790638.6492;

        T1Cpayload=(edtValue)*3272356.035;

        T2signal=(edtValue)*1393550.859;

        T3signal=(edtValue)*196622.25103;

        T3payload=(edtValue)*233739.71679;

        T3Zpayload=(edtValue)*204522.25219;

        T4signal=(edtValue)*32081.921912;

        EPTA1signal=(edtValue)*4294967.296;

        EPTA1payload=(edtValue)*4581298.4491;

        EPTA2signal=(edtValue)*1041204.193;

        EPTA2payload=(edtValue)*1145324.6123;

        EPTA3signal=(edtValue)*255938.46084;

        EPTA3payload=(edtValue)*286331.15307;

        H0=(edtValue)*22906492.245;

        H11=(edtValue)*5726623.0613;

        H12=(edtValue)*4581298.4491;

        VirtualTributary1signal=(edtValue)*5090331.6101;

        VirtualTributary1payload=(edtValue)*5696951.4393;

        VirtualTributary2signal=(edtValue)*3817748.7076;

        VirtualTributary2payload=(edtValue)*4294967.296;

        VirtualTributary6signal=(edtValue)*1393550.859;

        VirtualTributary6payload=(edtValue)*1466015.5037;

        STS1signal=(edtValue)*169677.72034;

        STS1payload=(edtValue)*177698.84893;

        STS3signal=(edtValue)*56559.240112;

        STS3payload=(edtValue)*58509.558736;

        STS3csignal=(edtValue)*56559.240112;

        STS3cpayload=(edtValue)*58509.558736;

        STS12signal=(edtValue)*14139.810028;

        STS24signal=(edtValue)*7069.905014;

        STS48signal=(edtValue)*3534.952507;

        STS192signal=(edtValue)*883.73812675;

        STM1signal=(edtValue)*56559.240112;

        STM4signal=(edtValue)*14139.810028;

        STM16signal=(edtValue)*3534.952507;

        STM64signal=(edtValue)*883.73812675;

    }




    public class ConversionResults{

        private double bitpersecond,bytepersecond, kilobitpersecondSI,kilobytepersecondSI,kilobitpersecond,
                kilobytepersecond,megabitpersecondSI,megabytepersecondSI,megabitpersecond,megabytepersecond,
                gigabitpersecondSI,gigabytepersecondSI,gigabitpersecond,gigabytepersecond,terabitpersecondSI,
                terabytepersecondSI,terabitpersecond,terabytepersecond,ethernet,ethernetfast,ethernetgigabit,OC1,
                OC3,OC12,OC24,OC48,OC192,OC768,ISDNsinglechannel,ISDNdualchannel,modem110,modem300,modem1200,
                modem2400,modem9600 ,modem14k,modem28k,modem33k,modem56k,SCSIAsync,SCSISync,SCSIFast,SCSIFastUltra
                ,SCSIFastWide,SCSIFastUltraWide, SCSIUltra2 ,SCSIUltra3,SCSILVDUltra80 ,SCSILVDUltra160
                ,IDEPIOmode0,IDEPIOmode1,IDEPIOmode2,IDEPIOmode3,IDEPIOmode4,IDEDMAmode0,IDEDMAmode1,IDEDMAmode2
                ,IDEUDMAmode0,IDEUDMAmode1,IDEUDMAmode2,IDEUDMAmode3,IDEUDMAmode4, IDEUDMA33,IDEUDMA66,USB ,firewire ,T0payload,
                T0B8ZSpayload,T1signal,T1payload,T1Zpayload,T1Csignal,T1Cpayload,T2signal,T3signal,T3payload ,T3Zpayload
                ,T4signal, EPTA1signal,  EPTA1payload,EPTA2signal,EPTA2payload,EPTA3signal,EPTA3payload
                ,H0 ,H11 ,H12 ,VirtualTributary1signal,VirtualTributary1payload,VirtualTributary2signal,VirtualTributary2payload
                ,VirtualTributary6signal,VirtualTributary6payload,STS1signal,STS1payload,STS3signal,STS3payload,STS3csignal,STS3cpayload
                ,STS12signal,STS24signal,STS48signal,STS192signal, STM1signal ,STM4signal,STM16signal,STM64signal;

        public double getBitpersecond() {
            return bitpersecond;
        }

        public void setBitpersecond(double bitpersecond) {
            this.bitpersecond = bitpersecond;
        }

        public double getBytepersecond() {
            return bytepersecond;
        }

        public void setBytepersecond(double bytepersecond) {
            this.bytepersecond = bytepersecond;
        }

        public double getKilobitpersecondSI() {
            return kilobitpersecondSI;
        }

        public void setKilobitpersecondSI(double kilobitpersecondSI) {
            this.kilobitpersecondSI = kilobitpersecondSI;
        }

        public double getKilobytepersecondSI() {
            return kilobytepersecondSI;
        }

        public void setKilobytepersecondSI(double kilobytepersecondSI) {
            this.kilobytepersecondSI = kilobytepersecondSI;
        }

        public double getKilobitpersecond() {
            return kilobitpersecond;
        }

        public void setKilobitpersecond(double kilobitpersecond) {
            this.kilobitpersecond = kilobitpersecond;
        }

        public double getKilobytepersecond() {
            return kilobytepersecond;
        }

        public void setKilobytepersecond(double kilobytepersecond) {
            this.kilobytepersecond = kilobytepersecond;
        }

        public double getMegabitpersecondSI() {
            return megabitpersecondSI;
        }

        public void setMegabitpersecondSI(double megabitpersecondSI) {
            this.megabitpersecondSI = megabitpersecondSI;
        }

        public double getMegabytepersecondSI() {
            return megabytepersecondSI;
        }

        public void setMegabytepersecondSI(double megabytepersecondSI) {
            this.megabytepersecondSI = megabytepersecondSI;
        }

        public double getMegabitpersecond() {
            return megabitpersecond;
        }

        public void setMegabitpersecond(double megabitpersecond) {
            this.megabitpersecond = megabitpersecond;
        }

        public double getMegabytepersecond() {
            return megabytepersecond;
        }

        public void setMegabytepersecond(double megabytepersecond) {
            this.megabytepersecond = megabytepersecond;
        }

        public double getGigabitpersecondSI() {
            return gigabitpersecondSI;
        }

        public void setGigabitpersecondSI(double gigabitpersecondSI) {
            this.gigabitpersecondSI = gigabitpersecondSI;
        }

        public double getGigabytepersecondSI() {
            return gigabytepersecondSI;
        }

        public void setGigabytepersecondSI(double gigabytepersecondSI) {
            this.gigabytepersecondSI = gigabytepersecondSI;
        }

        public double getGigabitpersecond() {
            return gigabitpersecond;
        }

        public void setGigabitpersecond(double gigabitpersecond) {
            this.gigabitpersecond = gigabitpersecond;
        }

        public double getGigabytepersecond() {
            return gigabytepersecond;
        }

        public void setGigabytepersecond(double gigabytepersecond) {
            this.gigabytepersecond = gigabytepersecond;
        }

        public double getTerabitpersecondSI() {
            return terabitpersecondSI;
        }

        public void setTerabitpersecondSI(double terabitpersecondSI) {
            this.terabitpersecondSI = terabitpersecondSI;
        }

        public double getTerabytepersecondSI() {
            return terabytepersecondSI;
        }

        public void setTerabytepersecondSI(double terabytepersecondSI) {
            this.terabytepersecondSI = terabytepersecondSI;
        }

        public double getTerabitpersecond() {
            return terabitpersecond;
        }

        public void setTerabitpersecond(double terabitpersecond) {
            this.terabitpersecond = terabitpersecond;
        }

        public double getTerabytepersecond() {
            return terabytepersecond;
        }

        public void setTerabytepersecond(double terabytepersecond) {
            this.terabytepersecond = terabytepersecond;
        }

        public double getEthernet() {
            return ethernet;
        }

        public void setEthernet(double ethernet) {
            this.ethernet = ethernet;
        }

        public double getEthernetfast() {
            return ethernetfast;
        }

        public void setEthernetfast(double ethernetfast) {
            this.ethernetfast = ethernetfast;
        }

        public double getEthernetgigabit() {
            return ethernetgigabit;
        }

        public void setEthernetgigabit(double ethernetgigabit) {
            this.ethernetgigabit = ethernetgigabit;
        }

        public double getOC1() {
            return OC1;
        }

        public void setOC1(double oC1) {
            OC1 = oC1;
        }

        public double getOC3() {
            return OC3;
        }

        public void setOC3(double oC3) {
            OC3 = oC3;
        }

        public double getOC12() {
            return OC12;
        }

        public void setOC12(double oC12) {
            OC12 = oC12;
        }
        public void setOC24(double oC24) {
            OC24 = oC24;
        }
        public double getOC24() {
            return OC24;
        }

        public void ISDNsinglechannel(double oC24) {
            OC24 = oC24;
        }

        public double getOC48() {
            return OC48;
        }

        public void setOC48(double oC48) {
            OC48 = oC48;
        }

        public double getOC192() {
            return OC192;
        }

        public void setOC192(double oC192) {
            OC192 = oC192;
        }

        public double getOC768() {
            return OC768;
        }

        public void setOC768(double oC768) {
            OC768 = oC768;
        }

        public double getISDNsinglechannel() {
            return ISDNsinglechannel;
        }

        public void setISDNsinglechannel(double iSDNsinglechannel) {
            ISDNsinglechannel = iSDNsinglechannel;
        }

        public double getISDNdualchannel() {
            return ISDNdualchannel;
        }

        public void setISDNdualchannel(double iSDNdualchannel) {
            ISDNdualchannel = iSDNdualchannel;
        }

        public double getModem110() {
            return modem110;
        }

        public void setModem110(double modem110) {
            this.modem110 = modem110;
        }

        public double getModem300() {
            return modem300;
        }

        public void setModem300(double modem300) {
            this.modem300 = modem300;
        }

        public double getModem1200() {
            return modem1200;
        }

        public void setModem1200(double modem1200) {
            this.modem1200 = modem1200;
        }

        public double getModem2400() {
            return modem2400;
        }

        public void setModem2400(double modem2400) {
            this.modem2400 = modem2400;
        }

        public double getModem9600() {
            return modem9600;
        }

        public void setModem9600(double modem9600) {
            this.modem9600 = modem9600;
        }

        public double getModem14k() {
            return modem14k;
        }

        public void setModem14k(double modem14k) {
            this.modem14k = modem14k;
        }

        public double getModem28k() {
            return modem28k;
        }

        public void setModem28k(double modem28k) {
            this.modem28k = modem28k;
        }

        public double getModem33k() {
            return modem33k;
        }

        public void setModem33k(double modem36k) {
            this.modem33k = modem36k;
        }

        public double getModem56k() {
            return modem56k;
        }

        public void setModem56k(double modem56k) {
            this.modem56k = modem56k;
        }

        public double getSCSIAsync() {
            return SCSIAsync;
        }

        public void setSCSIAsync(double sCSIAsync) {
            SCSIAsync = sCSIAsync;
        }

        public double getSCSISync() {
            return SCSISync;
        }

        public void setSCSISync(double sCSISync) {
            SCSISync = sCSISync;
        }

        public double getSCSIFast() {
            return SCSIFast;
        }

        public void setSCSIFast(double sCSIFast) {
            SCSIFast = sCSIFast;
        }

        public double getSCSIFastUltra() {
            return SCSIFastUltra;
        }

        public void setSCSIFastUltra(double sCSIFastUltra) {
            SCSIFastUltra = sCSIFastUltra;
        }

        public double getSCSIFastWide() {
            return SCSIFastWide;
        }

        public void setSCSIFastWide(double sCSIFastWide) {
            SCSIFastWide = sCSIFastWide;
        }

        public double getSCSIFastUltraWide() {
            return SCSIFastUltraWide;
        }

        public void setSCSIFastUltraWide(double sCSIFastUltraWide) {
            SCSIFastUltraWide = sCSIFastUltraWide;
        }

        public double getSCSIUltra2() {
            return SCSIUltra2;
        }

        public void setSCSIUltra2(double sCSIUltra2) {
            SCSIUltra2 = sCSIUltra2;
        }

        public double getSCSIUltra3() {
            return SCSIUltra3;
        }

        public void setSCSIUltra3(double sCSIUltra3) {
            SCSIUltra3 = sCSIUltra3;
        }

        public double getSCSILVDUltra80() {
            return SCSILVDUltra80;
        }

        public void setSCSILVDUltra80(double sCSILVDUltra80) {
            SCSILVDUltra80 = sCSILVDUltra80;
        }

        public double getSCSILVDUltra160() {
            return SCSILVDUltra160;
        }

        public void setSCSILVDUltra160(double sCSILVDUltra160) {
            SCSILVDUltra160 = sCSILVDUltra160;
        }

        public double getIDEPIOmode0() {
            return IDEPIOmode0;
        }

        public void setIDEPIOmode0(double iDEPIOmode0) {
            IDEPIOmode0 = iDEPIOmode0;
        }

        public double getIDEPIOmode1() {
            return IDEPIOmode1;
        }

        public void setIDEPIOmode1(double iDEPIOmode1) {
            IDEPIOmode1 = iDEPIOmode1;
        }

        public double getIDEPIOmode2() {
            return IDEPIOmode2;
        }

        public void setIDEPIOmode2(double iDEPIOmode2) {
            IDEPIOmode2 = iDEPIOmode2;
        }

        public double getIDEPIOmode3() {
            return IDEPIOmode3;
        }

        public void setIDEPIOmode3(double iDEPIOmode3) {
            IDEPIOmode3 = iDEPIOmode3;
        }

        public double getIDEPIOmode4() {
            return IDEPIOmode4;
        }

        public void setIDEPIOmode4(double iDEPIOmode4) {
            IDEPIOmode4 = iDEPIOmode4;
        }

        public double getIDEDMAmode0() {
            return IDEDMAmode0;
        }

        public void setIDEDMAmode0(double iDEDMAmode0) {
            IDEDMAmode0 = iDEDMAmode0;
        }

        public double getIDEDMAmode1() {
            return IDEDMAmode1;
        }

        public void setIDEDMAmode1(double iDEDMAmode1) {
            IDEDMAmode1 = iDEDMAmode1;
        }

        public double getIDEDMAmode2() {
            return IDEDMAmode2;
        }

        public void setIDEDMAmode2(double iDEDMAmode2) {
            IDEDMAmode2 = iDEDMAmode2;
        }

        public double getIDEUDMAmode0() {
            return IDEUDMAmode0;
        }

        public void setIDEUDMAmode0(double iDEUDMAmode0) {
            IDEUDMAmode0 = iDEUDMAmode0;
        }


        public double getIDEUDMAmode1() {
            return IDEUDMAmode1;
        }

        public void setIDEUDMAmode1(double iDEUDMAmode1) {
            IDEUDMAmode1 = iDEUDMAmode1;
        }
        public double getIDEUDMAmode2() {
            return IDEUDMAmode2;
        }

        public void setIDEUDMAmode2(double iDEUDMAmode2) {
            IDEUDMAmode2 = iDEUDMAmode2;
        }

        public double getIDEUDMAmode3() {
            return IDEUDMAmode3;
        }

        public void setIDEUDMAmode3(double iDEUDMAmode3) {
            IDEUDMAmode3 = iDEUDMAmode3;
        }

        public double getIDEUDMAmode4() {
            return IDEUDMAmode4;
        }

        public void setIDEUDMAmode4(double iDEUDMAmode4) {
            IDEUDMAmode4 = iDEUDMAmode4;
        }

        public double getIDEUDMA33() {
            return IDEUDMA33;
        }

        public void setIDEUDMA33(double iDEUDMA33) {
            IDEUDMA33 = iDEUDMA33;
        }

        public double getIDEUDMA66() {
            return IDEUDMA66;
        }

        public void setIDEUDMA66(double iDEUDMA66) {
            IDEUDMA66 = iDEUDMA66;
        }

        public double getUSB() {
            return USB;
        }

        public void setUSB(double uSB) {
            USB = uSB;
        }

        public double getFirewire() {
            return firewire;
        }

        public void setFirewire(double firewire) {
            this.firewire = firewire;
        }

        public double getT0payload() {
            return T0payload;
        }

        public void setT0payload(double t0payload) {
            T0payload = t0payload;
        }

        public double getT0B8ZSpayload() {
            return T0B8ZSpayload;
        }

        public void setT0B8ZSpayload(double t0b8zSpayload) {
            T0B8ZSpayload = t0b8zSpayload;
        }

        public double getT1signal() {
            return T1signal;
        }

        public void setT1signal(double t1signal) {
            T1signal = t1signal;
        }

        public double getT1payload() {
            return T1payload;
        }

        public void setT1payload(double t1payload) {
            T1payload = t1payload;
        }

        public double getT1Zpayload() {
            return T1Zpayload;
        }

        public void setT1Zpayload(double t1Zpayload) {
            T1Zpayload = t1Zpayload;
        }

        public double getT1Csignal() {
            return T1Csignal;
        }

        public void setT1Csignal(double t1Csignal) {
            T1Csignal = t1Csignal;
        }

        public double getT1Cpayload() {
            return T1Cpayload;
        }

        public void setT1Cpayload(double t1Cpayload) {
            T1Cpayload = t1Cpayload;
        }

        public double getT2signal() {
            return T2signal;
        }

        public void setT2signal(double t2signal) {
            T2signal = t2signal;
        }

        public double getT3signal() {
            return T3signal;
        }

        public void setT3signal(double t3signal) {
            T3signal = t3signal;
        }

        public double getT3payload() {
            return T3payload;
        }

        public void setT3payload(double t3payload) {
            T3payload = t3payload;
        }

        public double getT3Zpayload() {
            return T3Zpayload;
        }

        public void setT3Zpayload(double t3Zpayload) {
            T3Zpayload = t3Zpayload;
        }

        public double getT4signal() {
            return T4signal;
        }

        public void setT4signal(double t4signal) {
            T4signal = t4signal;
        }

        public double getEPTA1signal() {
            return EPTA1signal;
        }

        public void setEPTA1signal(double ePTA1signal) {
            EPTA1signal = ePTA1signal;
        }

        public double getEPTA1payload() {
            return EPTA1payload;
        }

        public void setEPTA1payload(double ePTA1payload) {
            EPTA1payload = ePTA1payload;
        }

        public double getEPTA2signal() {
            return EPTA2signal;
        }

        public void setEPTA2signal(double ePTA2signal) {
            EPTA2signal = ePTA2signal;
        }

        public double getEPTA2payload() {
            return EPTA2payload;
        }

        public void setEPTA2payload(double ePTA2payload) {
            EPTA2payload = ePTA2payload;
        }

        public double getEPTA3signal() {
            return EPTA3signal;
        }

        public void setEPTA3signal(double ePTA3signal) {
            EPTA3signal = ePTA3signal;
        }

        public double getEPTA3payload() {
            return EPTA3payload;
        }

        public void setEPTA3payload(double ePTA3payload) {
            EPTA3payload = ePTA3payload;
        }

        public double getH0() {
            return H0;
        }

        public void setH0(double h0) {
            H0 = h0;
        }

        public double getH11() {
            return H11;
        }

        public void setH11(double h11) {
            H11 = h11;
        }

        public double getH12() {
            return H12;
        }

        public void setH12(double h12) {
            H12 = h12;
        }

        public double getVirtualTributary1signal() {
            return VirtualTributary1signal;
        }

        public void setVirtualTributary1signal(double virtualTributary1signal) {
            VirtualTributary1signal = virtualTributary1signal;
        }

        public double getVirtualTributary1payload() {
            return VirtualTributary1payload;
        }

        public void setVirtualTributary1payload(double virtualTributary1payload) {
            VirtualTributary1payload = virtualTributary1payload;
        }

        public double getVirtualTributary2signal() {
            return VirtualTributary2signal;
        }

        public void setVirtualTributary2signal(double virtualTributary2signal) {
            VirtualTributary2signal = virtualTributary2signal;
        }

        public double getVirtualTributary2payload() {
            return VirtualTributary2payload;
        }

        public void setVirtualTributary2payload(double virtualTributary2payload) {
            VirtualTributary2payload = virtualTributary2payload;
        }

        public double getVirtualTributary6signal() {
            return VirtualTributary6signal;
        }

        public void setVirtualTributary6signal(double virtualTributary6signal) {
            VirtualTributary6signal = virtualTributary6signal;
        }

        public double getVirtualTributary6payload() {
            return VirtualTributary6payload;
        }

        public void setVirtualTributary6payload(double virtualTributary6payload) {
            VirtualTributary6payload = virtualTributary6payload;
        }

        public double getSTS1signal() {
            return STS1signal;
        }

        public void setSTS1signal(double sTS1signal) {
            STS1signal = sTS1signal;
        }

        public double getSTS1payload() {
            return STS1payload;
        }

        public void setSTS1payload(double sTS1payload) {
            STS1payload = sTS1payload;
        }

        public double getSTS3signal() {
            return STS3signal;
        }

        public void setSTS3signal(double sTS3signal) {
            STS3signal = sTS3signal;
        }

        public double getSTS3payload() {
            return STS3payload;
        }

        public void setSTS3payload(double sTS3payload) {
            STS3payload = sTS3payload;
        }

        public double getSTS3csignal() {
            return STS3csignal;
        }

        public void setSTS3csignal(double sTS3csignal) {
            STS3csignal = sTS3csignal;
        }

        public double getSTS3cpayload() {
            return STS3cpayload;
        }

        public void setSTS3cpayload(double sTS3cpayload) {
            STS3cpayload = sTS3cpayload;
        }

        public double getSTS12signal() {
            return STS12signal;
        }

        public void setSTS12signal(double sTS12signal) {
            STS12signal = sTS12signal;
        }

        public double getSTS24signal() {
            return STS24signal;
        }

        public void setSTS24signal(double sTS24signal) {
            STS24signal = sTS24signal;
        }

        public double getSTS48signal() {
            return STS48signal;
        }

        public void setSTS48signal(double sTS48signal) {
            STS48signal = sTS48signal;
        }

        public double getSTS192signal() {
            return STS192signal;
        }

        public void setSTS192signal(double sTS192signal) {
            STS192signal = sTS192signal;
        }

        public double getSTM1signal() {
            return STM1signal;
        }

        public void setSTM1signal(double sTM1signal) {
            STM1signal = sTM1signal;
        }

        public double getSTM4signal() {
            return STM4signal;
        }

        public void setSTM4signal(double sTM4signal) {
            STM4signal = sTM4signal;
        }

        public double getSTM16signal() {
            return STM16signal;
        }

        public void setSTM16signal(double sTM16signal) {
            STM16signal = sTM16signal;
        }

        public double getSTM64signal() {
            return STM64signal;
        }

        public void setSTM64signal(double sTM64signal) {
            STM64signal = sTM64signal;
        }


    }

}
