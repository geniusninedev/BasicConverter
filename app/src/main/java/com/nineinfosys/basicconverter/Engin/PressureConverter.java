package com.nineinfosys.basicconverter.Engin;

import java.util.ArrayList;


public class PressureConverter {
	private double kilopascal,pascal,exapascal,petapascal,terapascal,gigapascal,megapascal,hectopascal,dekapascal,decipascal,centipascal,milipascal,micropascal,nanopascal,picopascal,femtopascal,attopascal,newtonsm,
	newtonscm,newtonsmm,kilonewtonsm,bar,mbar,microbar,dynescm,kilogramforcesm,kilometerforcescm,kilometersmm,gramforcescm,tonforceshortsfoot,tonforceshortsinch,tonforcelongsfoot,tonforcelongsinch,kipforcesinch,ksi,poundforcesfoot,poundforcesinch,
	psi,poundalsfoot,torr,cmmercury,milimeterofmercury,inchmercury,cmwater,mmwater,inchwaterc,footwaterc,inchwaterf,footwaterf,atomspheretechnical,atmospherestandard;
	
	
	private double edtValue;
	private String conversionFrom;
	//private String conversionTo;	
			public PressureConverter(String conversionFrom, double edtValue) {
				// TODO Auto-generated constructor stub
				this.conversionFrom = conversionFrom;
				this.edtValue = edtValue;
			}

			public ArrayList<ConversionResults> calculatePressureConversion()
		    {
				ArrayList<ConversionResults> angleArray = new ArrayList<ConversionResults>();
					
				ConversionResults results= new ConversionResults();

				switch(conversionFrom)
				{
				
				case "Pascal - Pa":
					
					pascal=(edtValue)*1;
					exapascal=(edtValue)*1.E-18;
					petapascal=(edtValue)*1.E-15 ;
					kilopascal=(edtValue)*0.001 ;
					terapascal=(edtValue)*1.E-12;
					gigapascal=(edtValue)*1.E-9;
					megapascal=(edtValue)* 0.000001;
					hectopascal=(edtValue)*0.01;
					dekapascal=(edtValue)*0.1;
					decipascal=(edtValue)*10;
					centipascal=(edtValue)*100;
					milipascal=(edtValue)*1000;
					micropascal=(edtValue)*1000000;
					nanopascal=(edtValue)*1000000000;
					picopascal=(edtValue)*1000000000000.0;
					femtopascal=(edtValue)*1000000000000000.00;
					attopascal=(edtValue)*1000000000000000000.00;
					newtonsm=(edtValue)*1;
					newtonscm=(edtValue)*0.0001;
					newtonsmm=(edtValue)*0.000001;
					kilonewtonsm=(edtValue)*0.001;
					bar=(edtValue)*0.00001;
					mbar=(edtValue)*0.01;
					microbar=(edtValue)*10;
					dynescm=(edtValue)*10;
					kilogramforcesm=(edtValue)*0.1019716213;
					kilometerforcescm=(edtValue)*0.0000101972;
					kilometersmm=(edtValue)*1.019716212E-7;
					gramforcescm=(edtValue)*0.0101971621;
					tonforceshortsfoot=(edtValue)*0.0000104427;
					tonforceshortsinch=(edtValue)*7.251886886E-8;
					tonforcelongsfoot=(edtValue)*0.0000093239;
					tonforcelongsinch=(edtValue)*6.474899005E-8;
					kipforcesinch=(edtValue)*1.450377377E-7;
					ksi=(edtValue)*0.0000001450;
					poundforcesfoot=(edtValue)*0.0208854342;
					poundforcesinch=(edtValue)*0.0001450377;
					psi=(edtValue)*0.0001450377;
					poundalsfoot=(edtValue)*0.6719689751;
					torr=(edtValue)*0.0075006168;
					cmmercury=(edtValue)*0.0007500638;
					milimeterofmercury=(edtValue)*0.0075006376;
					inchmercury=(edtValue)*0.0002953006;
					cmwater=(edtValue)*0.0101974429;
					mmwater=(edtValue)*0.1019744289;
					inchwaterc=(edtValue)*0.0040147421;
					footwaterc=(edtValue)*0.0003345623;
					inchwaterf=(edtValue)*0.0040185981;
					footwaterf=(edtValue)*0.0003348832;
					atomspheretechnical=(edtValue)*0.0000101972;
					atmospherestandard=(edtValue)*0.0000098692;
				
				 break;
				 
		case "Kilopascal - kPa":
					
			pascal=(edtValue)*1000;
			exapascal=(edtValue)*1.E-15;
			petapascal=(edtValue)*1.E-12 ;
			kilopascal=(edtValue)*1 ;
			terapascal=(edtValue)*1.E-9;
			gigapascal=(edtValue)*0.000001;
			megapascal=(edtValue)*0.001;
			hectopascal=(edtValue)*10;
			dekapascal=(edtValue)*100;
			decipascal=(edtValue)*10000;
			centipascal=(edtValue)*100000;
			milipascal=(edtValue)*1000000;
			micropascal=(edtValue)*1000000000;
			nanopascal=(edtValue)*1000000000000.00;
			picopascal=(edtValue)*1000000000000000.00;
			femtopascal=(edtValue)*1000000000000000000.0;
			attopascal=(edtValue)*1.E+21;
			newtonsm=(edtValue)*1000;
			newtonscm=(edtValue)*0.1;
			newtonsmm=(edtValue)*0.001;
			kilonewtonsm=(edtValue)*1;
			bar=(edtValue)*0.01;
			mbar=(edtValue)*10;
			microbar=(edtValue)*10000;
			dynescm=(edtValue)*10000;
			kilogramforcesm=(edtValue)*101.9716213;
			kilometerforcescm=(edtValue)*0.0101971621;
			kilometersmm=(edtValue)*0.0001019716;
			gramforcescm=(edtValue)*10.19716213;
			tonforceshortsfoot=(edtValue)*0.0104427171;
			tonforceshortsinch=(edtValue)*0.0000725189;
			tonforcelongsfoot=(edtValue)*0.0093238546;
			tonforcelongsinch=(edtValue)*0.000064749;
			kipforcesinch=(edtValue)*0.0001450377;
			ksi=(edtValue)*0.0001450377;
			poundforcesfoot=(edtValue)*20.885434233;
			poundforcesinch=(edtValue)*0.1450377377;
			psi=(edtValue)*0.1450377377;
			poundalsfoot=(edtValue)*671.96897514;
			torr=(edtValue)*7.500616827;
			cmmercury=(edtValue)*0.7500637554;
			milimeterofmercury=(edtValue)*7.5006375542;
			inchmercury=(edtValue)*0.2953005865;
			cmwater=(edtValue)*10.197442889;
			mmwater=(edtValue)*101.97442889;
			inchwaterc=(edtValue)*4.0147421331;
			footwaterc=(edtValue)*0.3345622922;
			inchwaterf=(edtValue)*4.0185980719;
			footwaterf=(edtValue)*0.3348831727;
			atomspheretechnical=(edtValue)*0.0101971621;
			atmospherestandard=(edtValue)*0.0098692327;
				
				 break;
				 
				 
				 
		case "Exapascal - EPa":
			
			pascal=(edtValue)*1000000000000000000.00;
			exapascal=(edtValue)*1;
			petapascal=(edtValue)*1000 ;
			kilopascal=(edtValue)*1000000000000000.00 ;
			terapascal=(edtValue)*1000000;
			gigapascal=(edtValue)*1000000000;
			megapascal=(edtValue)*1000000000000.00;
			hectopascal=(edtValue)*10000000000000000.00;
			dekapascal=(edtValue)*100000000000000000.00;
			decipascal=(edtValue)*10000000000000000000.00;
			centipascal=(edtValue)*100000000000000000000.00;
			milipascal=(edtValue)*1.E+21;
			micropascal=(edtValue)*1.E+24;
			nanopascal=(edtValue)*1.E+27;
			picopascal=(edtValue)*1.E+30;
			femtopascal=(edtValue)*1.E+33;
			attopascal=(edtValue)*1.E+36;
			newtonsm=(edtValue)*1000000000000000000.00;
			newtonscm=(edtValue)*100000000000000.00;
			newtonsmm=(edtValue)*1000000000000.00;
			kilonewtonsm=(edtValue)*1000000000000000.00;
			bar=(edtValue)*10000000000000.00;
			mbar=(edtValue)*10000000000000000.00;
			microbar=(edtValue)*10000000000000000000.00;
			dynescm=(edtValue)*10000000000000000000.00;
			kilogramforcesm=(edtValue)*101971621297790000.00;
			kilometerforcescm=(edtValue)*10197162129779.00;
			kilometersmm=(edtValue)*101971621298.00;
			gramforcescm=(edtValue)*10197162129779000.0;
			tonforceshortsfoot=(edtValue)*10442717116574.0;
			tonforceshortsinch=(edtValue)*72518868865.0;
			tonforcelongsfoot=(edtValue)*9323854568371.00;
			tonforcelongsinch=(edtValue)*64748990058.00;
			kipforcesinch=(edtValue)*145037737730.0;
			ksi=(edtValue)*145037737730.0;
			poundforcesfoot=(edtValue)*20885434233120000.0;
			poundforcesinch=(edtValue)*145037737730000.00;
			psi=(edtValue)*145037737730000.00;
			poundalsfoot=(edtValue)*671968975139510000.00;
			torr=(edtValue)*7500616827040000.0;
			cmmercury=(edtValue)*750063755419210.0;
			milimeterofmercury=(edtValue)*7500637554192100.0;
			inchmercury=(edtValue)*295300586466960.0;
			cmwater=(edtValue)*10197442889221000.0;
			mmwater=(edtValue)*101974428892210000.0;
			inchwaterc=(edtValue)*4014742133112800.0;
			footwaterc=(edtValue)*334562292153180.0;
			inchwaterf=(edtValue)*4018598071876600.0;
			footwaterf=(edtValue)*334883172656390.00;
			atomspheretechnical=(edtValue)*10197162129779.0;
			atmospherestandard=(edtValue)*9869232667160.0;
				
			 break;
			 
      case "Petapascal - pPa":
			
			pascal=(edtValue)*1000000000000000.00;
			exapascal=(edtValue)*0.001;
			petapascal=(edtValue)*1 ;
			kilopascal=(edtValue)*1000000000000.00 ;
			terapascal=(edtValue)*1000;
			gigapascal=(edtValue)*1000000;
			megapascal=(edtValue)*1000000000.00;
			hectopascal=(edtValue)*10000000000000.00;
			dekapascal=(edtValue)*100000000000000.00;
			decipascal=(edtValue)*10000000000000000.00;
			centipascal=(edtValue)*100000000000000000.00;
			milipascal=(edtValue)*1000000000000000000.0;
			micropascal=(edtValue)*1.E+21;
			nanopascal=(edtValue)*1.E+24;
			picopascal=(edtValue)*1.E+27;
			femtopascal=(edtValue)*9.999999999E+29;
			attopascal=(edtValue)*1.E+33;
			newtonsm=(edtValue)*1000000000000000.00;
			newtonscm=(edtValue)*100000000000.00;
			newtonsmm=(edtValue)*1000000000.00;
			kilonewtonsm=(edtValue)*1000000000000.00;
			bar=(edtValue)*10000000000.00;
			mbar=(edtValue)*10000000000000.00;
			microbar=(edtValue)*10000000000000000.00;
			dynescm=(edtValue)*10000000000000000.00;
			kilogramforcesm=(edtValue)*101971621297790.00;
			kilometerforcescm=(edtValue)*10197162130.00;
			kilometersmm=(edtValue)*101971621.3;
			gramforcescm=(edtValue)*10197162129779.0;
			tonforceshortsfoot=(edtValue)*10442717117.0;
			tonforceshortsinch=(edtValue)*72518868.865;
			tonforcelongsfoot=(edtValue)*9323854568.4;
			tonforcelongsinch=(edtValue)*64748990.058;
			kipforcesinch=(edtValue)*145037737.73;
			ksi=(edtValue)*145037737.73;
			poundforcesfoot=(edtValue)*20885434233120.0;
			poundforcesinch=(edtValue)*145037737730.00;
			psi=(edtValue)*145037737730.00;
			poundalsfoot=(edtValue)*671968975139510.00;
			torr=(edtValue)*7500616827040.0;
			cmmercury=(edtValue)*750063755419.0;
			milimeterofmercury=(edtValue)*7500637554192.0;
			inchmercury=(edtValue)*295300586467.0;
			cmwater=(edtValue)*10197442889221.0;
			mmwater=(edtValue)*101974428892210.0;
			inchwaterc=(edtValue)*4014742133113.0;
			footwaterc=(edtValue)*334562292153.0;
			inchwaterf=(edtValue)*4018598071877.0;
			footwaterf=(edtValue)*334883172656.00;
			atomspheretechnical=(edtValue)*10197162130.0;
			atmospherestandard=(edtValue)*9869232667.2;
				
			 break; 
			 
      case "Terapascal - TPa":
			
			pascal=(edtValue)*1000000000000.00;
			exapascal=(edtValue)*0.000001;
			petapascal=(edtValue)*0.001 ;
			kilopascal=(edtValue)*1000000000.00 ;
			terapascal=(edtValue)*1;
			gigapascal=(edtValue)*1000;
			megapascal=(edtValue)*1000000.00;
			hectopascal=(edtValue)*10000000000.00;
			dekapascal=(edtValue)*100000000000.00;
			decipascal=(edtValue)*10000000000000.00;
			centipascal=(edtValue)*100000000000000.00;
			milipascal=(edtValue)*1000000000000000.0;
			micropascal=(edtValue)*1000000000000000000.0;
			nanopascal=(edtValue)*1.E+21;
			picopascal=(edtValue)*1.E+24;
			femtopascal=(edtValue)*1.E+27;
			attopascal=(edtValue)*1.E+30;
			newtonsm=(edtValue)*1000000000000.0;
			newtonscm=(edtValue)*100000000.00;
			newtonsmm=(edtValue)*1000000.00;
			kilonewtonsm=(edtValue)*1000000000.00;
			bar=(edtValue)*10000000.00;
			mbar=(edtValue)*10000000000.00;
			microbar=(edtValue)*10000000000000.00;
			dynescm=(edtValue)*10000000000000.00;
			kilogramforcesm=(edtValue)*101971621298.00;
			kilometerforcescm=(edtValue)*10197162.13;
			kilometersmm=(edtValue)*101971.6213;
			gramforcescm=(edtValue)*10197162130.0;
			tonforceshortsfoot=(edtValue)*10442717.117;
			tonforceshortsinch=(edtValue)*72518.868865;
			tonforcelongsfoot=(edtValue)*9323854.5684;
			tonforcelongsinch=(edtValue)*64748.990058;
			kipforcesinch=(edtValue)*145037.73773;
			ksi=(edtValue)*145037.73773;
			poundforcesfoot=(edtValue)*20885434233.0;
			poundforcesinch=(edtValue)*145037737.73;
			psi=(edtValue)*145037737.73;
			poundalsfoot=(edtValue)*671968975140.0;
			torr=(edtValue)*7500616827.0;
			cmmercury=(edtValue)*750063755.42;
			milimeterofmercury=(edtValue)*7500637554.2;
			inchmercury=(edtValue)*295300586.47;
			cmwater=(edtValue)*10197442889.0;
			mmwater=(edtValue)*101974428892.0;
			inchwaterc=(edtValue)*4014742133.1;
			footwaterc=(edtValue)*334562292.15;
			inchwaterf=(edtValue)*4018598071.9;
			footwaterf=(edtValue)*334883172.66;
			atomspheretechnical=(edtValue)*10197162.13;
			atmospherestandard=(edtValue)*9869232.6672;
				
			 break; 
			 
		
			 
      case "Gigapascal - GPa":
			
			pascal=(edtValue)*1000000000.00;
			exapascal=(edtValue)*1.E-9;
			petapascal=(edtValue)*0.000001;
			kilopascal=(edtValue)*1000000.00 ;
			terapascal=(edtValue)*0.001;
			gigapascal=(edtValue)*1;
			megapascal=(edtValue)*1000;
			hectopascal=(edtValue)*10000000.0;
			dekapascal=(edtValue)*100000000;
			decipascal=(edtValue)*10000000000.0;
			centipascal=(edtValue)*100000000000.00;
			milipascal=(edtValue)*1000000000000.0;
			micropascal=(edtValue)*1000000000000000.0;
			nanopascal=(edtValue)*1000000000000000000.0;
			picopascal=(edtValue)*1.E+21;
			femtopascal=(edtValue)*1.E+24;
			attopascal=(edtValue)*1.E+27;
			newtonsm=(edtValue)*1000000000.0;
			newtonscm=(edtValue)*100000;
			newtonsmm=(edtValue)*1000;
			kilonewtonsm=(edtValue)*1000000.00;
			bar=(edtValue)*10000.0;
			mbar=(edtValue)*10000000.0;
			microbar=(edtValue)*10000000000.0;
			dynescm=(edtValue)*10000000000.0;
			kilogramforcesm=(edtValue)*101971621.3;
			kilometerforcescm=(edtValue)*10197.16213;
			kilometersmm=(edtValue)*101.9716213;
			gramforcescm=(edtValue)*10197162.13;
			tonforceshortsfoot=(edtValue)*10442.717117;
			tonforceshortsinch=(edtValue)*72.518868865;
			tonforcelongsfoot=(edtValue)*9323.8545684;
			tonforcelongsinch=(edtValue)*64.748990058;
			kipforcesinch=(edtValue)*145.03773773;
			ksi=(edtValue)*145.03773773;
			poundforcesfoot=(edtValue)*20885434.233;
			poundforcesinch=(edtValue)*145037737.73;
			psi=(edtValue)*145037.73773;
			poundalsfoot=(edtValue)*671968975.14;
			torr=(edtValue)*7500616.827;
			cmmercury=(edtValue)*750063.75542;
			milimeterofmercury=(edtValue)*7500637.5542;
			inchmercury=(edtValue)*295300.58647;
			cmwater=(edtValue)*10197442.889;
			mmwater=(edtValue)*101974428.89;
			inchwaterc=(edtValue)*4014742.1331;
			footwaterc=(edtValue)*334562.29215;
			inchwaterf=(edtValue)*4018598.0719;
			footwaterf=(edtValue)*334883.17266;
			atomspheretechnical=(edtValue)*10197.16213;
			atmospherestandard=(edtValue)*9869.2326672;
				
			 break; 	
			 
			 
      case "Megapascal - MPa":
			
			pascal=(edtValue)*1000000;
			exapascal=(edtValue)*1.E-12;
			petapascal=(edtValue)*1.E-9;
			kilopascal=(edtValue)*1000;
			terapascal=(edtValue)*0.000001;
			gigapascal=(edtValue)*0.001;
			megapascal=(edtValue)*1;
			hectopascal=(edtValue)*10000;
			dekapascal=(edtValue)*100000;
			decipascal=(edtValue)*10000000;
			centipascal=(edtValue)*100000000;
			milipascal=(edtValue)*1000000000.0;
			micropascal=(edtValue)*1000000000000.0;
			nanopascal=(edtValue)*1000000000000000.0;
			picopascal=(edtValue)*1000000000000000000.0;
			femtopascal=(edtValue)*1.E+21;
			attopascal=(edtValue)*1.E+24;
			newtonsm=(edtValue)*1000000;
			newtonscm=(edtValue)*100;
			newtonsmm=(edtValue)*1;
			kilonewtonsm=(edtValue)*1000.00;
			bar=(edtValue)*10.0;
			mbar=(edtValue)*10000.0;
			microbar=(edtValue)*10000000.0;
			dynescm=(edtValue)*10000000.0;
			kilogramforcesm=(edtValue)*101971.6213;
			kilometerforcescm=(edtValue)*10.19716213;
			kilometersmm=(edtValue)*0.1019716213;
			gramforcescm=(edtValue)*10197.16213;
			tonforceshortsfoot=(edtValue)*10.442717117;
			tonforceshortsinch=(edtValue)*0.0725188689;
			tonforcelongsfoot=(edtValue)*9.3238545684;
			tonforcelongsinch=(edtValue)*0.0647489901;
			kipforcesinch=(edtValue)*0.1450377377;
			ksi=(edtValue)*0.1450377377;
			poundforcesfoot=(edtValue)*20885.434233;
			poundforcesinch=(edtValue)*145.03773773;
			psi=(edtValue)*145.03773773;
			poundalsfoot=(edtValue)*671968.97514;
			torr=(edtValue)*7500.616827;
			cmmercury=(edtValue)*750.06375542;
			milimeterofmercury=(edtValue)*7500.6375542;
			inchmercury=(edtValue)*295300.58647;
			cmwater=(edtValue)*10197.442889;
			mmwater=(edtValue)*101974.42889;
			inchwaterc=(edtValue)*4014.7421331;
			footwaterc=(edtValue)*334.56229215;
			inchwaterf=(edtValue)*4018.5980719;
			footwaterf=(edtValue)*334.88317266;
			atomspheretechnical=(edtValue)*10.19716213;
			atmospherestandard=(edtValue)*9.8692326672;
				
			 break; 	 
			 
		
			 
      case "Hectopascal - hPa":
			
			pascal=(edtValue)*100;
			exapascal=(edtValue)*1.E-16;
			petapascal=(edtValue)*1.E-13;
			kilopascal=(edtValue)*0.1;
			terapascal=(edtValue)*1.E-10;
			gigapascal=(edtValue)*1.E-7;
			megapascal=(edtValue)*0.0001;
			hectopascal=(edtValue)*1;
			dekapascal=(edtValue)*10;
			decipascal=(edtValue)*1000;
			centipascal=(edtValue)*10000;
			milipascal=(edtValue)*100000;
			micropascal=(edtValue)*100000000.0;
			nanopascal=(edtValue)*100000000000.0;
			picopascal=(edtValue)*100000000000000.0;
			femtopascal=(edtValue)*100000000000000000.0;
			attopascal=(edtValue)*100000000000000000000.0;
			newtonsm=(edtValue)*100;
			newtonscm=(edtValue)*0.01;
			newtonsmm=(edtValue)*0.0001;
			kilonewtonsm=(edtValue)*0.1;
			bar=(edtValue)*0.001;
			mbar=(edtValue)*1;
			microbar=(edtValue)*1000;
			dynescm=(edtValue)*1000;
			kilogramforcesm=(edtValue)*10.19716213;
			kilometerforcescm=(edtValue)*0.0010197162;
			kilometersmm=(edtValue)*0.0000101972;
			gramforcescm=(edtValue)*1.019716213;
			tonforceshortsfoot=(edtValue)*0.0010442717;
			tonforceshortsinch=(edtValue)*0.0000072519;
			tonforcelongsfoot=(edtValue)*0.0009323855;
			tonforcelongsinch=(edtValue)*0.0000064749;
			kipforcesinch=(edtValue)*0.0000145038;
			ksi=(edtValue)*0.0000145038;
			poundforcesfoot=(edtValue)*2.0885434233;
			poundforcesinch=(edtValue)*0.0145037738;
			psi=(edtValue)*0.0145037738;
			poundalsfoot=(edtValue)*67.196897514;
			torr=(edtValue)*0.7500616827;
			cmmercury=(edtValue)*0.0750063755;
			milimeterofmercury=(edtValue)*0.7500637554;
			inchmercury=(edtValue)*0.0295300586;
			cmwater=(edtValue)*1.0197442889;
			mmwater=(edtValue)*10.197442889;
			inchwaterc=(edtValue)*0.4014742133;
			footwaterc=(edtValue)*0.0334562292;
			inchwaterf=(edtValue)*0.4018598072;
			footwaterf=(edtValue)*0.0334883173;
			atomspheretechnical=(edtValue)*0.0010197162;
			atmospherestandard=(edtValue)*0.0009869233;
				
			 break; 	 	 
			 
      case "Deckapascal - daPa":
			
			pascal=(edtValue)*10;
			exapascal=(edtValue)*1.E-17;
			petapascal=(edtValue)*1.E-14;
			kilopascal=(edtValue)*0.01;
			terapascal=(edtValue)*1.E-11;
			gigapascal=(edtValue)*1.E-8;
			megapascal=(edtValue)*0.00001;
			hectopascal=(edtValue)*0.1;
			dekapascal=(edtValue)*1;
			decipascal=(edtValue)*100;
			centipascal=(edtValue)*1000;
			milipascal=(edtValue)*10000;
			micropascal=(edtValue)*10000000;
			nanopascal=(edtValue)*10000000000.0;
			picopascal=(edtValue)*10000000000000.0;
			femtopascal=(edtValue)*10000000000000000.0;
			attopascal=(edtValue)*10000000000000000000.0;
			newtonsm=(edtValue)*10;
			newtonscm=(edtValue)*0.001;
			newtonsmm=(edtValue)*0.00001;
			kilonewtonsm=(edtValue)*0.01;
			bar=(edtValue)*0.0001;
			mbar=(edtValue)*0.1;
			microbar=(edtValue)*100;
			dynescm=(edtValue)*100;
			kilogramforcesm=(edtValue)*1.019716213;
			kilometerforcescm=(edtValue)*0.0001019716;
			kilometersmm=(edtValue)*0.0000010197;
			gramforcescm=(edtValue)*0.1019716213;
			tonforceshortsfoot=(edtValue)*0.0001044272;
			tonforceshortsinch=(edtValue)*7.251886886E-7;
			tonforcelongsfoot=(edtValue)*0.0009323855;
			tonforcelongsinch=(edtValue)*6.474899005E-7;
			kipforcesinch=(edtValue)*0.0000014504;
			ksi=(edtValue)*0.0000014504;
			poundforcesfoot=(edtValue)*2.0885434233;
			poundforcesinch=(edtValue)*0.0014503774;
			psi=(edtValue)*0.0014503774;
			poundalsfoot=(edtValue)*6.7196897514;
			torr=(edtValue)*0.0750061683;
			cmmercury=(edtValue)*0.0075006376;
			milimeterofmercury=(edtValue)*0.0750063755;
			inchmercury=(edtValue)*0.0029530059;
			cmwater=(edtValue)*0.1019744289;
			mmwater=(edtValue)*1.0197442889;
			inchwaterc=(edtValue)*0.0401474213;
			footwaterc=(edtValue)*0.0033456229;
			inchwaterf=(edtValue)*0.0401859807;
			footwaterf=(edtValue)*0.0033488317;
			atomspheretechnical=(edtValue)*0.0001019716;
			atmospherestandard=(edtValue)*0.0000986923;
				
			 break; 	 	 	 
			 
      case "Decipascal - dPa":
			
			pascal=(edtValue)*0.1;
			exapascal=(edtValue)*1.E-19;
			petapascal=(edtValue)*1.E-16;
			kilopascal=(edtValue)*0.0001;
			terapascal=(edtValue)*1.E-13;
			gigapascal=(edtValue)*1.E-10;
			megapascal=(edtValue)*1.E-7;
			hectopascal=(edtValue)*0.001;
			dekapascal=(edtValue)*0.01;
			decipascal=(edtValue)*1;
			centipascal=(edtValue)*10;
			milipascal=(edtValue)*100;
			micropascal=(edtValue)*100000;
			nanopascal=(edtValue)*100000000.0;
			picopascal=(edtValue)*100000000000.0;
			femtopascal=(edtValue)*100000000000000.0;
			attopascal=(edtValue)*100000000000000000.0;
			newtonsm=(edtValue)*0.1;
			newtonscm=(edtValue)*0.00001;
			newtonsmm=(edtValue)*1.E-7;
			kilonewtonsm=(edtValue)*0.0001;
			bar=(edtValue)*0.000001;
			mbar=(edtValue)*0.001;
			microbar=(edtValue)*1;
			dynescm=(edtValue)*1;
			kilogramforcesm=(edtValue)*0.0101971621;
			kilometerforcescm=(edtValue)*0.0000010197;
			kilometersmm=(edtValue)*1.019716212E-8;
			gramforcescm=(edtValue)*0.0010197162;
			tonforceshortsfoot=(edtValue)*0.0000010443;
			tonforceshortsinch=(edtValue)*7.251886886E-9;
			tonforcelongsfoot=(edtValue)*9.323854568E-7;
			tonforcelongsinch=(edtValue)*6.474899005E-9;
			kipforcesinch=(edtValue)*1.450377377E-8;
			ksi=(edtValue)*1.450377377E-8;
			poundforcesfoot=(edtValue)*0.0020885434;
			poundforcesinch=(edtValue)*0.0000145038;
			psi=(edtValue)*0.0000145038;
			poundalsfoot=(edtValue)*0.0671968975;
			torr=(edtValue)*0.0007500617;
			cmmercury=(edtValue)*0.0000750064;
			milimeterofmercury=(edtValue)*0.0007500638;
			inchmercury=(edtValue)*0.0000295301;
			cmwater=(edtValue)*0.0010197443;
			mmwater=(edtValue)*0.0101974429;
			inchwaterc=(edtValue)*0.0004014742;
			footwaterc=(edtValue)*0.0000334562;
			inchwaterf=(edtValue)*0.0004018598;
			footwaterf=(edtValue)*0.0000334883;
			atomspheretechnical=(edtValue)*0.0000010197;
			atmospherestandard=(edtValue)*9.869232667E-7;
				
			 break; 	 	 	  
			 
      case "Centipascal - cPa":
			
			pascal=(edtValue)*0.01;
			exapascal=(edtValue)*1.E-20;
			petapascal=(edtValue)*1.E-17;
			kilopascal=(edtValue)*0.00001;
			terapascal=(edtValue)*1.E-14;
			gigapascal=(edtValue)*1.E-11;
			megapascal=(edtValue)*1.E-8;
			hectopascal=(edtValue)*0.0001;
			dekapascal=(edtValue)*0.001;
			decipascal=(edtValue)*0.1;
			centipascal=(edtValue)*1;
			milipascal=(edtValue)*10;
			micropascal=(edtValue)*10000;
			nanopascal=(edtValue)*10000000.0;
			picopascal=(edtValue)*10000000000.0;
			femtopascal=(edtValue)*10000000000000.0;
			attopascal=(edtValue)*10000000000000000.0;
			newtonsm=(edtValue)*0.01;
			newtonscm=(edtValue)*0.000001;
			newtonsmm=(edtValue)*1.E-8;
			kilonewtonsm=(edtValue)*0.00001;
			bar=(edtValue)*1.E-7;
			mbar=(edtValue)*0.0001;
			microbar=(edtValue)*0.1;
			dynescm=(edtValue)*0.1;
			kilogramforcesm=(edtValue)*0.0010197162;
			kilometerforcescm=(edtValue)*1.019716212E-7;
			kilometersmm=(edtValue)*1.019716212E-9;
			gramforcescm=(edtValue)*0.0001019716;
			tonforceshortsfoot=(edtValue)*1.044271711E-7;
			tonforceshortsinch=(edtValue)*7.251886886E-10;
			tonforcelongsfoot=(edtValue)*9.323854568E-8;
			tonforcelongsinch=(edtValue)*6.474899005E-10;
			kipforcesinch=(edtValue)*1.450377377E-9;
			ksi=(edtValue)*1.450377377E-9;
			poundforcesfoot=(edtValue)*0.0002088543;
			poundforcesinch=(edtValue)*0.0000014504;
			psi=(edtValue)*0.0000014504;
			poundalsfoot=(edtValue)*0.0067196898;
			torr=(edtValue)*0.0000750062;
			cmmercury=(edtValue)*0.0000075006;
			milimeterofmercury=(edtValue)*0.0000750064;
			inchmercury=(edtValue)*0.000002953;
			cmwater=(edtValue)*0.0001019744;
			mmwater=(edtValue)*0.0010197443;
			inchwaterc=(edtValue)*0.0000401474;
			footwaterc=(edtValue)*0.0000033456;
			inchwaterf=(edtValue)*0.000040186;
			footwaterf=(edtValue)*0.0000033488;
			atomspheretechnical=(edtValue)*1.019716212E-7;
			atmospherestandard=(edtValue)*9.869232667E-8;
				
			break; 	 	
			
      case "Millipascal - mPa":
			
			pascal=(edtValue)*0.001;
			exapascal=(edtValue)*1.E-21;
			petapascal=(edtValue)*1.E-18;
			kilopascal=(edtValue)*0.000001;
			terapascal=(edtValue)*1.E-15;
			gigapascal=(edtValue)*1.E-12;
			megapascal=(edtValue)*1.E-9;
			hectopascal=(edtValue)*0.00001;
			dekapascal=(edtValue)*0.0001;
			decipascal=(edtValue)*0.01;
			centipascal=(edtValue)*0.1;
			milipascal=(edtValue)*1;
			micropascal=(edtValue)*1000;
			nanopascal=(edtValue)*1000000;
			picopascal=(edtValue)*1000000000.0;
			femtopascal=(edtValue)*1000000000000.0;
			attopascal=(edtValue)*1000000000000000.0;
			newtonsm=(edtValue)*0.001;
			newtonscm=(edtValue)*1.E-7;
			newtonsmm=(edtValue)*1.E-9;
			kilonewtonsm=(edtValue)*0.000001;
			bar=(edtValue)*1.E-8;
			mbar=(edtValue)*0.00001;
			microbar=(edtValue)*0.01;
			dynescm=(edtValue)*0.01;
			kilogramforcesm=(edtValue)*0.0001019716;
			kilometerforcescm=(edtValue)*1.019716212E-8;
			kilometersmm=(edtValue)*1.019716212E-10;
			gramforcescm=(edtValue)*0.0000101972;
			tonforceshortsfoot=(edtValue)*1.044271711E-8;
			tonforceshortsinch=(edtValue)*7.251886886E-11;
			tonforcelongsfoot=(edtValue)*9.323854568E-9;
			tonforcelongsinch=(edtValue)*6.474899005E-11;
			kipforcesinch=(edtValue)*1.450377377E-10;
			ksi=(edtValue)*1.450377377E-10;
			poundforcesfoot=(edtValue)*0.0000208854;
			poundforcesinch=(edtValue)*1.450377377E-7;
			psi=(edtValue)*1.450377377E-7;
			poundalsfoot=(edtValue)*0.000671969;
			torr=(edtValue)*0.0000075006;
			cmmercury=(edtValue)*7.500637554E-7;
			milimeterofmercury=(edtValue)*0.0000075006;
			inchmercury=(edtValue)*2.953005864E-7;
			cmwater=(edtValue)*0.0000101974;
			mmwater=(edtValue)*0.0001019744;
			inchwaterc=(edtValue)*0.0000401474;
			footwaterc=(edtValue)*3.345622921E-7;
			inchwaterf=(edtValue)*0.0000040186;
			footwaterf=(edtValue)*3.348831726E-7;
			atomspheretechnical=(edtValue)*1.019716212E-8;
			atmospherestandard=(edtValue)*9.869232667E-9;
				
			 break; 
			 
      case "Micropascal - μPa":
			
			pascal=(edtValue)*0.000001;
			exapascal=(edtValue)*1.E-24;
			petapascal=(edtValue)*1.E-21;
			kilopascal=(edtValue)*1.E-9;
			terapascal=(edtValue)*1.E-18;
			gigapascal=(edtValue)*1.E-15;
			megapascal=(edtValue)*1.E-12;
			hectopascal=(edtValue)*1.E-8;
			dekapascal=(edtValue)*1.E-7;
			decipascal=(edtValue)*0.00001;
			centipascal=(edtValue)*0.0001;
			milipascal=(edtValue)*0.001;
			micropascal=(edtValue)*1;
			nanopascal=(edtValue)*1000;
			picopascal=(edtValue)*1000000.0;
			femtopascal=(edtValue)*1000000000.0;
			attopascal=(edtValue)*1000000000000.0;
			newtonsm=(edtValue)*0.000001;
			newtonscm=(edtValue)*1.E-10;
			newtonsmm=(edtValue)*1.E-12;
			kilonewtonsm=(edtValue)*1.E-9;
			bar=(edtValue)*1.E-11;
			mbar=(edtValue)*1.E-8;
			microbar=(edtValue)*0.00001;
			dynescm=(edtValue)*0.00001;
			kilogramforcesm=(edtValue)*1.019716212E-7;
			kilometerforcescm=(edtValue)*1.019716212E-11;
			kilometersmm=(edtValue)*1.019716212E-13;
			gramforcescm=(edtValue)*1.019716212E-8;
			tonforceshortsfoot=(edtValue)*1.044271711E-11;
			tonforceshortsinch=(edtValue)*7.251886886E-14;
			tonforcelongsfoot=(edtValue)*9.323854568E-12;
			tonforcelongsinch=(edtValue)*6.474899005E-14;
			kipforcesinch=(edtValue)*1.450377377E-13;
			ksi=(edtValue)*1.450377377E-13;
			poundforcesfoot=(edtValue)*2.088543423E-8;
			poundforcesinch=(edtValue)*1.450377377E-10;
			psi=(edtValue)*1.450377377E-10;
			poundalsfoot=(edtValue)*6.719689751E-7;
			torr=(edtValue)*7.500616827E-9;
			cmmercury=(edtValue)*7.500637554E-10;
			milimeterofmercury=(edtValue)*7.500637554E-9;
			inchmercury=(edtValue)*2.953005864E-10;
			cmwater=(edtValue)*1.019744288E-8;
			mmwater=(edtValue)*1.019744288E-7;
			inchwaterc=(edtValue)*4.014742133E-9;
			footwaterc=(edtValue)*3.345622921E-10;
			inchwaterf=(edtValue)*4.018598071E-9;
			footwaterf=(edtValue)*3.348831726E-10;
			atomspheretechnical=(edtValue)*1.019716212E-11;
			atmospherestandard=(edtValue)*9.869232667E-12;
				
			 break;  
			 
			 
      case "Nanopascal - nPa":
			
			pascal=(edtValue)*1.E-9;
			exapascal=(edtValue)*1.E-27;
			petapascal=(edtValue)*1.E-24;
			kilopascal=(edtValue)*1.E-12;
			terapascal=(edtValue)*1.E-21;
			gigapascal=(edtValue)*1.E-18;
			megapascal=(edtValue)*1.E-15;
			hectopascal=(edtValue)*1.E-11;
			dekapascal=(edtValue)*1.E-10;
			decipascal=(edtValue)*1.E-8;
			centipascal=(edtValue)*1.E-7;
			milipascal=(edtValue)*0.000001;
			micropascal=(edtValue)*0.001;
			nanopascal=(edtValue)*1;
			picopascal=(edtValue)*1000.0;
			femtopascal=(edtValue)*1000000.0;
			attopascal=(edtValue)*1000000000.0;
			newtonsm=(edtValue)*1.E-9;
			newtonscm=(edtValue)*1.E-13;
			newtonsmm=(edtValue)*1.E-15;
			kilonewtonsm=(edtValue)*1.E-12;
			bar=(edtValue)*1.E-14;
			mbar=(edtValue)*1.E-11;
			microbar=(edtValue)*1.E-8;
			dynescm=(edtValue)*1.E-8;
			kilogramforcesm=(edtValue)*1.019716212E-10;
			kilometerforcescm=(edtValue)*1.019716212E-14;
			kilometersmm=(edtValue)*1.019716212E-16;
			gramforcescm=(edtValue)*1.019716212E-11;
			tonforceshortsfoot=(edtValue)*1.044271711E-14;
			tonforceshortsinch=(edtValue)*7.251886886E-17;
			tonforcelongsfoot=(edtValue)*9.323854568E-15;
			tonforcelongsinch=(edtValue)*6.474899005E-17;
			kipforcesinch=(edtValue)*1.450377377E-16;
			ksi=(edtValue)*1.450377377E-16;
			poundforcesfoot=(edtValue)*2.088543423E-11;
			poundforcesinch=(edtValue)*1.450377377E-13;
			psi=(edtValue)*1.450377377E-13;
			poundalsfoot=(edtValue)*6.719689751E-10;
			torr=(edtValue)*7.500616827E-12;
			cmmercury=(edtValue)*7.500637554E-13;
			milimeterofmercury=(edtValue)*7.500637554E-12;
			inchmercury=(edtValue)*2.953005864E-13;
			cmwater=(edtValue)*1.019744288E-11;
			mmwater=(edtValue)*1.019744288E-10;
			inchwaterc=(edtValue)*4.014742133E-12;
			footwaterc=(edtValue)*3.345622921E-13;
			inchwaterf=(edtValue)*4.018598071E-12;
			footwaterf=(edtValue)*3.348831726E-13;
			atomspheretechnical=(edtValue)*1.019716212E-14;
			atmospherestandard=(edtValue)*9.869232667E-15;
				
			 break;  
			 
      case "Picopascal - pPa":
			
			pascal=(edtValue)*1.E-12;
			exapascal=(edtValue)*9.999999999E-31;
			petapascal=(edtValue)*1.E-27;
			kilopascal=(edtValue)*1.E-15;
			terapascal=(edtValue)*1.E-24;
			gigapascal=(edtValue)*1.E-21;
			megapascal=(edtValue)*1.E-18;
			hectopascal=(edtValue)*1.E-14;
			dekapascal=(edtValue)*1.E-13;
			decipascal=(edtValue)*1.E-11;
			centipascal=(edtValue)*1.E-10;
			milipascal=(edtValue)*1.E-9;
			micropascal=(edtValue)*0.000001;
			nanopascal=(edtValue)*0.001;
			picopascal=(edtValue)*1;
			femtopascal=(edtValue)*1000.0;
			attopascal=(edtValue)*1000000.0;
			newtonsm=(edtValue)*1.E-12;
			newtonscm=(edtValue)*1.E-16;
			newtonsmm=(edtValue)*1.E-18;
			kilonewtonsm=(edtValue)*1.E-15;
			bar=(edtValue)*9.999999999E-18;
			mbar=(edtValue)*1.E-14;
			microbar=(edtValue)*1.E-11;
			dynescm=(edtValue)*1.E-11;
			kilogramforcesm=(edtValue)*1.019716212E-13;
			kilometerforcescm=(edtValue)*1.019716212E-17;
			kilometersmm=(edtValue)*1.019716212E-19;
			gramforcescm=(edtValue)*1.019716212E-14;
			tonforceshortsfoot=(edtValue)*1.044271711E-17;
			tonforceshortsinch=(edtValue)*7.251886886E-20;
			tonforcelongsfoot=(edtValue)*9.323854568E-18;
			tonforcelongsinch=(edtValue)*6.474899005E-20;
			kipforcesinch=(edtValue)*1.450377377E-19;
			ksi=(edtValue)*1.450377377E-19;
			poundforcesfoot=(edtValue)*2.088543423E-14;
			poundforcesinch=(edtValue)*1.450377377E-16;
			psi=(edtValue)*1.450377377E-16;
			poundalsfoot=(edtValue)*6.719689751E-13;
			torr=(edtValue)*7.500616827E-15;
			cmmercury=(edtValue)*7.500637554E-16;
			milimeterofmercury=(edtValue)*7.500637554E-15;
			inchmercury=(edtValue)*2.953005864E-16;
			cmwater=(edtValue)*1.019744288E-14;
			mmwater=(edtValue)*1.019744288E-13;
			inchwaterc=(edtValue)*4.014742133E-15;
			footwaterc=(edtValue)*3.345622921E-16;
			inchwaterf=(edtValue)*4.018598071E-15;
			footwaterf=(edtValue)*3.348831726E-16;
			atomspheretechnical=(edtValue)*1.019716212E-17;
			atmospherestandard=(edtValue)*9.869232667E-18;
				
			 break;  	 
			 
			 
   
			 
      case "Femtopascal - fPa":
			
			pascal=(edtValue)*1.E-15;
			exapascal=(edtValue)*1.E-33;
			petapascal=(edtValue)*1.E-30;
			kilopascal=(edtValue)*1.E-18;
			terapascal=(edtValue)*1.E-27;
			gigapascal=(edtValue)*1.E-24;
			megapascal=(edtValue)*1.E-21;
			hectopascal=(edtValue)*1.E-17;
			dekapascal=(edtValue)*1.E-16;
			decipascal=(edtValue)*1.E-14;
			centipascal=(edtValue)*1.E-13;
			milipascal=(edtValue)*1.E-12;
			micropascal=(edtValue)*1.E-9;
			nanopascal=(edtValue)*0.000001;
			picopascal=(edtValue)*0.001;
			femtopascal=(edtValue)*1;
			attopascal=(edtValue)*1000;
			newtonsm=(edtValue)*1.E-15;
			newtonscm=(edtValue)*1.E-19;
			newtonsmm=(edtValue)*1.E-21;
			kilonewtonsm=(edtValue)*1.E-18;
			bar=(edtValue)*1.E-20;
			mbar=(edtValue)*1.E-17;
			microbar=(edtValue)*1.E-14;
			dynescm=(edtValue)*1.E-14;
			kilogramforcesm=(edtValue)*1.019716212E-16;
			kilometerforcescm=(edtValue)*1.019716212E-20;
			kilometersmm=(edtValue)*1.019716212E-22;
			gramforcescm=(edtValue)*1.019716212E-17;
			tonforceshortsfoot=(edtValue)*1.044271711E-20;
			tonforceshortsinch=(edtValue)*7.251886886E-23;
			tonforcelongsfoot=(edtValue)*9.323854568E-21;
			tonforcelongsinch=(edtValue)*6.474899005E-23;
			kipforcesinch=(edtValue)*1.450377377E-22;
			ksi=(edtValue)*1.450377377E-22;
			poundforcesfoot=(edtValue)*2.088543423E-17;
			poundforcesinch=(edtValue)*1.450377377E-19;
			psi=(edtValue)*1.450377377E-19;
			poundalsfoot=(edtValue)*6.719689751E-16;
			torr=(edtValue)*7.500616827E-18;
			cmmercury=(edtValue)*7.500637554E-19;
			milimeterofmercury=(edtValue)*7.500637554E-18;
			inchmercury=(edtValue)*2.953005864E-19;
			cmwater=(edtValue)*1.019744288E-17;
			mmwater=(edtValue)*1.019744288E-16;
			inchwaterc=(edtValue)*4.014742133E-18;
			footwaterc=(edtValue)*3.345622921E-19;
			inchwaterf=(edtValue)*4.018598071E-18;
			footwaterf=(edtValue)*3.348831726E-19;
			atomspheretechnical=(edtValue)*1.019716212E-20;
			atmospherestandard=(edtValue)*9.869232667E-21;
				
			 break;  	 	 
			 
			 
      case "Attopascal - aPa":
			
			pascal=(edtValue)*9.999999999E-19;
			exapascal=(edtValue)*1.E-36;
			petapascal=(edtValue)*9.999999999E-34;
			kilopascal=(edtValue)*1.E-21;
			terapascal=(edtValue)*9.999999999E-31;
			gigapascal=(edtValue)*1.E-27;
			megapascal=(edtValue)*1.E-24;
			hectopascal=(edtValue)*1.E-20;
			dekapascal=(edtValue)*1.E-19;
			decipascal=(edtValue)*9.999999999E-18;
			centipascal=(edtValue)*1.E-16;
			milipascal=(edtValue)*9.999999999E-16;
			micropascal=(edtValue)*1.E-12;
			nanopascal=(edtValue)*1.E-9;
			picopascal=(edtValue)*0.000001;
			femtopascal=(edtValue)*0.001;
			attopascal=(edtValue)*1;
			newtonsm=(edtValue)*9.999999999E-19;
			newtonscm=(edtValue)*9.999999999E-23;
			newtonsmm=(edtValue)*1.E-24;
			kilonewtonsm=(edtValue)*1.E-21;
			bar=(edtValue)*1.E-23;
			mbar=(edtValue)*1.E-20;
			microbar=(edtValue)*9.999999999E-18;
			dynescm=(edtValue)*9.999999999E-18;
			kilogramforcesm=(edtValue)*1.019716212E-19;
			kilometerforcescm=(edtValue)*1.019716212E-23;
			kilometersmm=(edtValue)*1.019716212E-25;
			gramforcescm=(edtValue)*1.019716212E-20;
			tonforceshortsfoot=(edtValue)*1.044271711E-23;
			tonforceshortsinch=(edtValue)*7.251886886E-26;
			tonforcelongsfoot=(edtValue)*9.323854568E-24;
			tonforcelongsinch=(edtValue)*6.474899005E-26;
			kipforcesinch=(edtValue)*1.450377377E-25;
			ksi=(edtValue)*1.450377377E-25;
			poundforcesfoot=(edtValue)*2.088543423E-20;
			poundforcesinch=(edtValue)*1.450377377E-22;
			psi=(edtValue)*1.450377377E-22;
			poundalsfoot=(edtValue)*6.719689751E-19;
			torr=(edtValue)*7.500616827E-21;
			cmmercury=(edtValue)*7.500637554E-22;
			milimeterofmercury=(edtValue)*7.500637554E-21;
			inchmercury=(edtValue)*2.953005864E-22;
			cmwater=(edtValue)*1.019744288E-20;
			mmwater=(edtValue)*1.019744288E-19;
			inchwaterc=(edtValue)*4.014742133E-21;
			footwaterc=(edtValue)*3.345622921E-22;
			inchwaterf=(edtValue)*4.018598071E-21;
			footwaterf=(edtValue)*3.348831726E-22;
			atomspheretechnical=(edtValue)*1.019716212E-23;
			atmospherestandard=(edtValue)*9.869232667E-24;
				
			 break;  	 	 
			 
		
      case "Newton/square meter - N/m²":
			
			pascal=(edtValue)*1;
			exapascal=(edtValue)*1.E-18;
			petapascal=(edtValue)*1.E-15;
			kilopascal=(edtValue)*0.001;
			terapascal=(edtValue)*1.E-12;
			gigapascal=(edtValue)*1.E-9;
			megapascal=(edtValue)*0.000001;
			hectopascal=(edtValue)*0.01;
			dekapascal=(edtValue)*0.1;
			decipascal=(edtValue)*10;
			centipascal=(edtValue)*100;
			milipascal=(edtValue)*1000;
			micropascal=(edtValue)*1000000;
			nanopascal=(edtValue)*1000000000;
			picopascal=(edtValue)*1000000000000.00;
			femtopascal=(edtValue)*1000000000000000.00;
			attopascal=(edtValue)*1000000000000000000.0;
			newtonsm=(edtValue)*1;
			newtonscm=(edtValue)*0.0001;
			newtonsmm=(edtValue)*0.000001;
			kilonewtonsm=(edtValue)*0.001;
			bar=(edtValue)*0.00001;
			mbar=(edtValue)*0.01;
			microbar=(edtValue)*10;
			dynescm=(edtValue)*10;
			kilogramforcesm=(edtValue)*0.1019716213;
			kilometerforcescm=(edtValue)*0.0000101972;
			kilometersmm=(edtValue)*1.019716212E-7;
			gramforcescm=(edtValue)*0.0101971621;
			tonforceshortsfoot=(edtValue)*0.0000104427;
			tonforceshortsinch=(edtValue)*7.251886886E-8;
			tonforcelongsfoot=(edtValue)*0.0000093239;
			tonforcelongsinch=(edtValue)*6.474899005E-8;
			kipforcesinch=(edtValue)*1.450377377E-7;
			ksi=(edtValue)*1.450377377E-7;
			poundforcesfoot=(edtValue)*0.0208854342;
			poundforcesinch=(edtValue)*0.0001450377;
			psi=(edtValue)*0.0001450377;
			poundalsfoot=(edtValue)*0.0075006168;
			torr=(edtValue)*0.0075006168;
			cmmercury=(edtValue)*0.0007500638;
			milimeterofmercury=(edtValue)*0.0075006376;
			inchmercury=(edtValue)*0.0002953006;
			cmwater=(edtValue)*0.0101974429;
			mmwater=(edtValue)*0.1019744289;
			inchwaterc=(edtValue)*0.0040147421;
			footwaterc=(edtValue)*0.0003345623;
			inchwaterf=(edtValue)*0.0040185981;
			footwaterf=(edtValue)*0.0003348832;
			atomspheretechnical=(edtValue)*0.0000101972;
			atmospherestandard=(edtValue)*0.0000098692;
				
			 break;  	
			 
      case "Newton/square centimeter - N/cm²":
			
			pascal=(edtValue)*10000;
			exapascal=(edtValue)*1.E-14;
			petapascal=(edtValue)*1.E-11;
			kilopascal=(edtValue)*10;
			terapascal=(edtValue)*1.E-8;
			gigapascal=(edtValue)*0.00001;
			megapascal=(edtValue)*0.01;
			hectopascal=(edtValue)*100;
			dekapascal=(edtValue)*1000;
			decipascal=(edtValue)*100000;
			centipascal=(edtValue)*1000000;
			milipascal=(edtValue)*10000000;
			micropascal=(edtValue)*10000000000.0;
			nanopascal=(edtValue)*10000000000000.0;
			picopascal=(edtValue)*10000000000000000.00;
			femtopascal=(edtValue)*10000000000000000000.00;
			attopascal=(edtValue)*1.E+22;
			newtonsm=(edtValue)*10000;
			newtonscm=(edtValue)*1;
			newtonsmm=(edtValue)*0.01;
			kilonewtonsm=(edtValue)*10;
			bar=(edtValue)*0.1;
			mbar=(edtValue)*100;
			microbar=(edtValue)*100000;
			dynescm=(edtValue)*100000;
			kilogramforcesm=(edtValue)*1019.716213;
			kilometerforcescm=(edtValue)*0.1019716213;
			kilometersmm=(edtValue)*0.0010197162;
			gramforcescm=(edtValue)*101.9716213;
			tonforceshortsfoot=(edtValue)*0.1044271712;
			tonforceshortsinch=(edtValue)*0.0007251887;
			tonforcelongsfoot=(edtValue)*0.0932385457;
			tonforcelongsinch=(edtValue)*0.0006474899;
			kipforcesinch=(edtValue)*0.0014503774;
			ksi=(edtValue)*0.0014503774;
			poundforcesfoot=(edtValue)*208.85434233;
			poundforcesinch=(edtValue)*1.4503773773;
			psi=(edtValue)*1.4503773773;
			poundalsfoot=(edtValue)*6719.6897514;
			torr=(edtValue)*75.00616827;
			cmmercury=(edtValue)*7.5006375542;
			milimeterofmercury=(edtValue)*75.006375542;
			inchmercury=(edtValue)*2.9530058647;
			cmwater=(edtValue)*101.97442889;
			mmwater=(edtValue)*1019.7442889;
			inchwaterc=(edtValue)*40.147421331;
			footwaterc=(edtValue)*3.3456229215;
			inchwaterf=(edtValue)*40.185980719;
			footwaterf=(edtValue)*3.3488317266;
			atomspheretechnical=(edtValue)*0.1019716213;
			atmospherestandard=(edtValue)*0.0986923267;
				
			 break;  	 	 	 
			 
      case "Newton/square millimeter - N/mm²":
			
			pascal=(edtValue)*1000000;
			exapascal=(edtValue)*1.E-12;
			petapascal=(edtValue)*1.E-9;
			kilopascal=(edtValue)*1000;
			terapascal=(edtValue)*0.000001;
			gigapascal=(edtValue)*0.001;
			megapascal=(edtValue)*1;
			hectopascal=(edtValue)*10000;
			dekapascal=(edtValue)*100000;
			decipascal=(edtValue)*10000000;
			centipascal=(edtValue)*100000000;
			milipascal=(edtValue)*1000000000;
			micropascal=(edtValue)*1000000000000.0;
			nanopascal=(edtValue)*1000000000000000.0;
			picopascal=(edtValue)*1000000000000000000.00;
			femtopascal=(edtValue)*1.E+21;
			attopascal=(edtValue)*1.E+24;
			newtonsm=(edtValue)*1000000;
			newtonscm=(edtValue)*100;
			newtonsmm=(edtValue)*1;
			kilonewtonsm=(edtValue)*1000;
			bar=(edtValue)*10;
			mbar=(edtValue)*10000;
			microbar=(edtValue)*10000000;
			dynescm=(edtValue)*10000000;
			kilogramforcesm=(edtValue)*101971.6213;
			kilometerforcescm=(edtValue)*10.19716213;
			kilometersmm=(edtValue)*0.1019716213;
			gramforcescm=(edtValue)*10197.16213;
			tonforceshortsfoot=(edtValue)*10.442717117;
			tonforceshortsinch=(edtValue)*0.0725188689;
			tonforcelongsfoot=(edtValue)*9.3238545684;
			tonforcelongsinch=(edtValue)*0.0647489901;
			kipforcesinch=(edtValue)*0.1450377377;
			ksi=(edtValue)*0.0014503774;
			poundforcesfoot=(edtValue)*208.85434233;
			poundforcesinch=(edtValue)*1.4503773773;
			psi=(edtValue)*145.03773773;
			poundalsfoot=(edtValue)*671968.97514;
			torr=(edtValue)*7500.616827;
			cmmercury=(edtValue)*750.06375542;
			milimeterofmercury=(edtValue)*7500.6375542;
			inchmercury=(edtValue)*295.30058647;
			cmwater=(edtValue)*10197.442889;
			mmwater=(edtValue)*101974.42889;
			inchwaterc=(edtValue)*4014.7421331;
			footwaterc=(edtValue)*334.56229215;
			inchwaterf=(edtValue)*4018.5980719;
			footwaterf=(edtValue)*334.88317266;
			atomspheretechnical=(edtValue)*10.19716213;
			atmospherestandard=(edtValue)*9.8692326672;
				
			 break;  	 	 	 	 
			 
			 
			 
      case "Kilonewton/square meter - kN/m²":
			
			pascal=(edtValue)*1000;
			exapascal=(edtValue)*1.E-15;
			petapascal=(edtValue)*1.E-12;
			kilopascal=(edtValue)*1;
			terapascal=(edtValue)*1.E-9;
			gigapascal=(edtValue)*0.000001;
			megapascal=(edtValue)*0.001;
			hectopascal=(edtValue)*10;
			dekapascal=(edtValue)*100;
			decipascal=(edtValue)*10000;
			centipascal=(edtValue)*100000;
			milipascal=(edtValue)*1000000;
			micropascal=(edtValue)*1000000000.0;
			nanopascal=(edtValue)*1000000000000.0;
			picopascal=(edtValue)*1000000000000000.00;
			femtopascal=(edtValue)*1000000000000000000.0;
			attopascal=(edtValue)*1.E+21;
			newtonsm=(edtValue)*1000;
			newtonscm=(edtValue)*0.1;
			newtonsmm=(edtValue)*0.001;
			kilonewtonsm=(edtValue)*1;
			bar=(edtValue)*0.01;
			mbar=(edtValue)*10;
			microbar=(edtValue)*10000;
			dynescm=(edtValue)*10000;
			kilogramforcesm=(edtValue)*101.9716213;
			kilometerforcescm=(edtValue)*0.0101971621;
			kilometersmm=(edtValue)*0.0001019716;
			gramforcescm=(edtValue)*10.19716213;
			tonforceshortsfoot=(edtValue)*0.0104427171;
			tonforceshortsinch=(edtValue)*0.0000725189;
			tonforcelongsfoot=(edtValue)*0.0093238546;
			tonforcelongsinch=(edtValue)*0.000064749;
			kipforcesinch=(edtValue)*0.1450377377;
			ksi=(edtValue)*0.0001450377;
			poundforcesfoot=(edtValue)*20.885434233;
			poundforcesinch=(edtValue)*0.1450377377;
			psi=(edtValue)*0.1450377377;
			poundalsfoot=(edtValue)*671.96897514;
			torr=(edtValue)*7.500616827;
			cmmercury=(edtValue)*0.7500637554;
			milimeterofmercury=(edtValue)*7.5006375542;
			inchmercury=(edtValue)*0.2953005865;
			cmwater=(edtValue)*10.197442889;
			mmwater=(edtValue)*101.97442889;
			inchwaterc=(edtValue)*4.0147421331;
			footwaterc=(edtValue)*0.3345622922;
			inchwaterf=(edtValue)*4.0185980719;
			footwaterf=(edtValue)*0.3348831727;
			atomspheretechnical=(edtValue)*0.0101971621;
			atmospherestandard=(edtValue)*0.0098692327;
				
			 break;  	 	 	 	 	 
			 
			 
      case "Bar - b":
			
			pascal=(edtValue)*100000;
			exapascal=(edtValue)*1.E-13;
			petapascal=(edtValue)*1.E-10;
			kilopascal=(edtValue)*100;
			terapascal=(edtValue)*1.E-7;
			gigapascal=(edtValue)*0.0001;
			megapascal=(edtValue)*0.1;
			hectopascal=(edtValue)*1000;
			dekapascal=(edtValue)*10000;
			decipascal=(edtValue)*1000000;
			centipascal=(edtValue)*10000000;
			milipascal=(edtValue)*100000000;
			micropascal=(edtValue)*100000000000.0;
			nanopascal=(edtValue)*100000000000000.0;
			picopascal=(edtValue)*100000000000000000.00;
			femtopascal=(edtValue)*100000000000000000000.0;
			attopascal=(edtValue)*1.E+23;
			newtonsm=(edtValue)*100000;
			newtonscm=(edtValue)*10;
			newtonsmm=(edtValue)*0.1;
			kilonewtonsm=(edtValue)*100;
			bar=(edtValue)*1;
			mbar=(edtValue)*1000;
			microbar=(edtValue)*1000000;
			dynescm=(edtValue)*1000000;
			kilogramforcesm=(edtValue)*10197.16213;
			kilometerforcescm=(edtValue)*1.019716213;
			kilometersmm=(edtValue)*0.0101971621;
			gramforcescm=(edtValue)*1019.716213;
			tonforceshortsfoot=(edtValue)*1.0442717117;
			tonforceshortsinch=(edtValue)*0.0072518869;
			tonforcelongsfoot=(edtValue)*0.9323854568;
			tonforcelongsinch=(edtValue)*0.006474899;
			kipforcesinch=(edtValue)*0.0145037738;
			ksi=(edtValue)*0.0145037738;
			poundforcesfoot=(edtValue)*2088.5434233;
			poundforcesinch=(edtValue)*14.503773773;
			psi=(edtValue)*14.503773773;
			poundalsfoot=(edtValue)*67196.897514;
			torr=(edtValue)*750.0616827;
			cmmercury=(edtValue)*75.006375542;
			milimeterofmercury=(edtValue)*750.06375542;
			inchmercury=(edtValue)*29.530058647;
			cmwater=(edtValue)*1019.7442889;
			mmwater=(edtValue)*10197.442889;
			inchwaterc=(edtValue)*401.47421331;
			footwaterc=(edtValue)*33.456229215;
			inchwaterf=(edtValue)*401.85980719;
			footwaterf=(edtValue)*33.488317266;
			atomspheretechnical=(edtValue)*1.019716213;
			atmospherestandard=(edtValue)*0.9869232667;
				
			 break;  	 	 	 	 	 	
			 
			
			 
      case "Millibar - mbar":
			
			pascal=(edtValue)*100;
			exapascal=(edtValue)*1.E-16;
			petapascal=(edtValue)*1.E-13;
			kilopascal=(edtValue)*0.1;
			terapascal=(edtValue)*1.E-10;
			gigapascal=(edtValue)*1.E-7;
			megapascal=(edtValue)*0.0001;
			hectopascal=(edtValue)*1;
			dekapascal=(edtValue)*10;
			decipascal=(edtValue)*1000;
			centipascal=(edtValue)*10000;
			milipascal=(edtValue)*100000;
			micropascal=(edtValue)*100000000.0;
			nanopascal=(edtValue)*100000000000.0;
			picopascal=(edtValue)*100000000000000.00;
			femtopascal=(edtValue)*100000000000000000.0;
			attopascal=(edtValue)*100000000000000000000.0;
			newtonsm=(edtValue)*100;
			newtonscm=(edtValue)*0.01;
			newtonsmm=(edtValue)*0.0001;
			kilonewtonsm=(edtValue)*0.1;
			bar=(edtValue)*0.001;
			mbar=(edtValue)*1;
			microbar=(edtValue)*1000;
			dynescm=(edtValue)*1000;
			kilogramforcesm=(edtValue)*10.19716213;
			kilometerforcescm=(edtValue)*0.0010197162;
			kilometersmm=(edtValue)*0.0000101972;
			gramforcescm=(edtValue)*1.019716213;
			tonforceshortsfoot=(edtValue)*0.0010442717;
			tonforceshortsinch=(edtValue)*0.0000072519;
			tonforcelongsfoot=(edtValue)*0.0009323855;
			tonforcelongsinch=(edtValue)*0.0000064749;
			kipforcesinch=(edtValue)*0.0000145038;
			ksi=(edtValue)*0.0000145038;
			poundforcesfoot=(edtValue)*2.0885434233;
			poundforcesinch=(edtValue)*0.0145037738;
			psi=(edtValue)*0.0145037738;
			poundalsfoot=(edtValue)*67.196897514;
			torr=(edtValue)*0.7500616827;
			cmmercury=(edtValue)*0.0750063755;
			milimeterofmercury=(edtValue)*0.7500637554;
			inchmercury=(edtValue)*0.0295300586;
			cmwater=(edtValue)*1.0197442889;
			mmwater=(edtValue)*10.197442889;
			inchwaterc=(edtValue)*0.4014742133;
			footwaterc=(edtValue)*0.0334562292;
			inchwaterf=(edtValue)*0.4018598072;
			footwaterf=(edtValue)*0.0334883173;
			atomspheretechnical=(edtValue)*0.0010197162;
			atmospherestandard=(edtValue)*0.0009869233;
				
			 break;  	 	 	 	 	 		 
			 
			 
      case "Microbar - μbar":
			
			pascal=(edtValue)*0.1;
			exapascal=(edtValue)*1.E-19;
			petapascal=(edtValue)*1.E-16;
			kilopascal=(edtValue)*0.0001;
			terapascal=(edtValue)*1.E-13;
			gigapascal=(edtValue)*1.E-10;
			megapascal=(edtValue)*1.E-7;
			hectopascal=(edtValue)*0.001;
			dekapascal=(edtValue)*0.01;
			decipascal=(edtValue)*1;
			centipascal=(edtValue)*10;
			milipascal=(edtValue)*100;
			micropascal=(edtValue)*100000.0;
			nanopascal=(edtValue)*100000000.0;
			picopascal=(edtValue)*100000000000.00;
			femtopascal=(edtValue)*100000000000000.0;
			attopascal=(edtValue)*100000000000000000.0;
			newtonsm=(edtValue)*0.1;
			newtonscm=(edtValue)*0.00001;
			newtonsmm=(edtValue)*1.E-7;
			kilonewtonsm=(edtValue)*0.0001;
			bar=(edtValue)*0.000001;
			mbar=(edtValue)*0.001;
			microbar=(edtValue)*1;
			dynescm=(edtValue)*1;
			kilogramforcesm=(edtValue)*0.0101971621;
			kilometerforcescm=(edtValue)*0.0000010197;
			kilometersmm=(edtValue)*1.019716212E-8;
			gramforcescm=(edtValue)*0.0010197162;
			tonforceshortsfoot=(edtValue)*0.0000010443;
			tonforceshortsinch=(edtValue)*7.251886886E-9;
			tonforcelongsfoot=(edtValue)*9.323854568E-7;
			tonforcelongsinch=(edtValue)*6.474899005E-9;
			kipforcesinch=(edtValue)*1.450377377E-8;
			ksi=(edtValue)*1.450377377E-8;
			poundforcesfoot=(edtValue)*0.0020885434;
			poundforcesinch=(edtValue)*0.0000145038;
			psi=(edtValue)*0.0000145038;
			poundalsfoot=(edtValue)*0.0671968975;
			torr=(edtValue)*0.0007500617;
			cmmercury=(edtValue)*0.0000750064;
			milimeterofmercury=(edtValue)*0.0007500638;
			inchmercury=(edtValue)*0.0000295301;
			cmwater=(edtValue)*0.0010197443;
			mmwater=(edtValue)*0.0101974429;
			inchwaterc=(edtValue)*0.0004014742;
			footwaterc=(edtValue)*0.0000334562;
			inchwaterf=(edtValue)*0.0004018598;
			footwaterf=(edtValue)*0.0000334883;
			atomspheretechnical=(edtValue)*0.0000010197;
			atmospherestandard=(edtValue)*9.869232667E-7;
				
			 break;  	 	 	 	
			 
			 
      case "Dyne/square centimeter - dyn/cm²":
			
			pascal=(edtValue)*0.1;
			exapascal=(edtValue)*1.E-19;
			petapascal=(edtValue)*1.E-16;
			kilopascal=(edtValue)*0.0001;
			terapascal=(edtValue)*1.E-13;
			gigapascal=(edtValue)*1.E-10;
			megapascal=(edtValue)*1.E-7;
			hectopascal=(edtValue)*0.001;
			dekapascal=(edtValue)*0.01;
			decipascal=(edtValue)*1;
			centipascal=(edtValue)*10;
			milipascal=(edtValue)*100;
			micropascal=(edtValue)*100000.0;
			nanopascal=(edtValue)*100000000.0;
			picopascal=(edtValue)*100000000000.00;
			femtopascal=(edtValue)*100000000000000.0;
			attopascal=(edtValue)*100000000000000000.0;
			newtonsm=(edtValue)*0.1;
			newtonscm=(edtValue)*0.00001;
			newtonsmm=(edtValue)*1.E-7;
			kilonewtonsm=(edtValue)*0.0001;
			bar=(edtValue)*0.000001;
			mbar=(edtValue)*0.001;
			microbar=(edtValue)*1;
			dynescm=(edtValue)*1;
			kilogramforcesm=(edtValue)*0.0101971621;
			kilometerforcescm=(edtValue)*0.0000010197;
			kilometersmm=(edtValue)*1.019716212E-8;
			gramforcescm=(edtValue)*0.0010197162;
			tonforceshortsfoot=(edtValue)*0.0000010443;
			tonforceshortsinch=(edtValue)*7.251886886E-9;
			tonforcelongsfoot=(edtValue)*9.323854568E-7;
			tonforcelongsinch=(edtValue)*6.474899005E-9;
			kipforcesinch=(edtValue)*1.450377377E-8;
			ksi=(edtValue)*1.450377377E-8;
			poundforcesfoot=(edtValue)*0.0020885434;
			poundforcesinch=(edtValue)*0.0000145038;
			psi=(edtValue)*0.0000145038;
			poundalsfoot=(edtValue)*0.0671968975;
			torr=(edtValue)*0.0007500617;
			cmmercury=(edtValue)*0.0000750064;
			milimeterofmercury=(edtValue)*0.0007500638;
			inchmercury=(edtValue)*0.0000295301;
			cmwater=(edtValue)*0.0010197443;
			mmwater=(edtValue)*0.0101974429;
			inchwaterc=(edtValue)*0.0004014742;
			footwaterc=(edtValue)*0.0000334562;
			inchwaterf=(edtValue)*0.0004018598;
			footwaterf=(edtValue)*0.0000334883;
			atomspheretechnical=(edtValue)*0.0000010197;
			atmospherestandard=(edtValue)*9.869232667E-7;
				
			 break;  	 	 	 	 
			 
			 
      case "Kilogram-force/square meter - kgf/m²":
			
			pascal=(edtValue)*9.80665;
			exapascal=(edtValue)*9.80665E-18;
			petapascal=(edtValue)*9.80665E-15;
			kilopascal=(edtValue)*0.00980665;
			terapascal=(edtValue)*9.80665E-12;
			gigapascal=(edtValue)*9.80665E-9;
			megapascal=(edtValue)*0.0000098067;
			hectopascal=(edtValue)*0.0980665;
			dekapascal=(edtValue)*0.980665;
			decipascal=(edtValue)*98.0665;
			centipascal=(edtValue)*980.665;
			milipascal=(edtValue)*9806.65;
			micropascal=(edtValue)*9806650;
			nanopascal=(edtValue)*9806650000.0;
			picopascal=(edtValue)*9806650000000.00;
			femtopascal=(edtValue)*9806650000000272.0;
			attopascal=(edtValue)*9806650000000272000.0;
			newtonsm=(edtValue)*9.80665;
			newtonscm=(edtValue)*0.000980665;
			newtonsmm=(edtValue)*0.0000098067;
			kilonewtonsm=(edtValue)*0.00980665;
			bar=(edtValue)*0.0000980665;
			mbar=(edtValue)*0.0980665;
			microbar=(edtValue)*98.0665;
			dynescm=(edtValue)*98.0665;
			kilogramforcesm=(edtValue)*1;
			kilometerforcescm=(edtValue)*0.0001;
			kilometersmm=(edtValue)*0.000001;
			gramforcescm=(edtValue)*0.1;
			tonforceshortsfoot=(edtValue)*0.0001024081;
			tonforceshortsinch=(edtValue)*7.111671653E-7;
			tonforcelongsfoot=(edtValue)*0.0000914358;
			tonforcelongsinch=(edtValue)*6.349706833E-7;
			kipforcesinch=(edtValue)*0.0000014223;
			ksi=(edtValue)*0.0000014223;
			poundforcesfoot=(edtValue)*0.2048161436;
			poundforcesinch=(edtValue)*0.0014223343;
			psi=(edtValue)*0.0014223343;
			poundalsfoot=(edtValue)*6.5897645501;
			torr=(edtValue)*0.073555924;
			cmmercury=(edtValue)*0.0073556127;
			milimeterofmercury=(edtValue)*0.0735561273;
			inchmercury=(edtValue)*0.0028959095;
			cmwater=(edtValue)*0.1000027533;
			mmwater=(edtValue)*1.0000275331;
			inchwaterc=(edtValue)*0.0393711709;
			footwaterc=(edtValue)*0.0032809353;
			inchwaterf=(edtValue)*0.0394089848;
			footwaterf=(edtValue)*0.0032840821;
			atomspheretechnical=(edtValue)*0.0001;
			atmospherestandard=(edtValue)*0.0000967841;
				
			 break;  	 	 	 	  
			 
			 
      case "Kilogram-force/square cm - kgf/cm²":
			
			pascal=(edtValue)*98066.5;
			exapascal=(edtValue)*9.80665E-14;
			petapascal=(edtValue)*9.80665E-11;
			kilopascal=(edtValue)*98.0665;
			terapascal=(edtValue)*9.80665E-8;
			gigapascal=(edtValue)*0.0000980665;
			megapascal=(edtValue)*0.0980665;
			hectopascal=(edtValue)*980.665;
			dekapascal=(edtValue)*9806.65;
			decipascal=(edtValue)*980665;
			centipascal=(edtValue)*9806650;
			milipascal=(edtValue)*98066500;
			micropascal=(edtValue)*98066500000.0;
			nanopascal=(edtValue)*98066500000003.0;
			picopascal=(edtValue)*98066500000002720.00;
			femtopascal=(edtValue)*98066500000002700000.0;
			attopascal=(edtValue)*9.80665E+22;
			newtonsm=(edtValue)*98066.5;
			newtonscm=(edtValue)*9.80665;
			newtonsmm=(edtValue)*0.0980665;
			kilonewtonsm=(edtValue)*98.0665;
			bar=(edtValue)*0.980665;
			mbar=(edtValue)*980.665;
			microbar=(edtValue)*980665;
			dynescm=(edtValue)*980665;
			kilogramforcesm=(edtValue)*10000;
			kilometerforcescm=(edtValue)*1;
			kilometersmm=(edtValue)*0.01;
			gramforcescm=(edtValue)*1000;
			tonforceshortsfoot=(edtValue)*1.0240807181;
			tonforceshortsinch=(edtValue)*0.0071116717;
			tonforcelongsfoot=(edtValue)*0.914357784;
			tonforcelongsinch=(edtValue)*0.0063497068;
			kipforcesinch=(edtValue)*0.0142233433;
			ksi=(edtValue)*0.0142233433;
			poundforcesfoot=(edtValue)*2048.1614362;
			poundforcesinch=(edtValue)*14.223343307;
			psi=(edtValue)*14.223343307;
			poundalsfoot=(edtValue)*65897.645501;
			torr=(edtValue)*735.55924007;
			cmmercury=(edtValue)*73.556127271;
			milimeterofmercury=(edtValue)*735.56127271;
			inchmercury=(edtValue)*28.959094963;
			cmwater=(edtValue)*1000.0275331;
			mmwater=(edtValue)*10000.275331;
			inchwaterc=(edtValue)*393.7117094;
			footwaterc=(edtValue)*32.809353023;
			inchwaterf=(edtValue)*394.08984782;
			footwaterf=(edtValue)*32.840820651;
			atomspheretechnical=(edtValue)*1;
			atmospherestandard=(edtValue)*0.9678411054;
				
			 break;  	 	 	 	  	 
			 
      case "Kilogram-force/square mm - kgf/mm²":
			
			pascal=(edtValue)*9806650;
			exapascal=(edtValue)*9.80665E-12;
			petapascal=(edtValue)*9.80665E-9;
			kilopascal=(edtValue)*98.0665;
			terapascal=(edtValue)*0.0000098067;
			gigapascal=(edtValue)*0.00980665;
			megapascal=(edtValue)*9.80665;
			hectopascal=(edtValue)*98066.5;
			dekapascal=(edtValue)*980665;
			decipascal=(edtValue)*98066500;
			centipascal=(edtValue)*980665000;
			milipascal=(edtValue)*9806650000.0;
			micropascal=(edtValue)*9806650000000.0;
			nanopascal=(edtValue)*9806650000000272.0;
			picopascal=(edtValue)*9806650000000272000.00;
			femtopascal=(edtValue)*9.80665E+21;
			attopascal=(edtValue)*9.80665E+24;
			newtonsm=(edtValue)*9806650;
			newtonscm=(edtValue)*980.665;
			newtonsmm=(edtValue)*9.80665;
			kilonewtonsm=(edtValue)*9806.65;
			bar=(edtValue)*98.0665;
			mbar=(edtValue)*98066.5;
			microbar=(edtValue)*98066500;
			dynescm=(edtValue)*98066500;
			kilogramforcesm=(edtValue)*1000000;
			kilometerforcescm=(edtValue)*100;
			kilometersmm=(edtValue)*1;
			gramforcescm=(edtValue)*100000;
			tonforceshortsfoot=(edtValue)*102.40807181;
			tonforceshortsinch=(edtValue)*0.7111671654;
			tonforcelongsfoot=(edtValue)*91.435778403;
			tonforcelongsinch=(edtValue)*0.6349706834;
			kipforcesinch=(edtValue)*1.4223343307;
			ksi=(edtValue)*1.4223343307;
			poundforcesfoot=(edtValue)*204816.14362;
			poundforcesinch=(edtValue)*1422.3343307;
			psi=(edtValue)*1422.3343307;
			poundalsfoot=(edtValue)*6589764.5501;
			torr=(edtValue)*73555.924007;
			cmmercury=(edtValue)*7355.6127271;
			milimeterofmercury=(edtValue)*73556.127271;
			inchmercury=(edtValue)*2895.9094963;
			cmwater=(edtValue)*100002.75331;
			mmwater=(edtValue)*1000027.5331;
			inchwaterc=(edtValue)*39371.17094;
			footwaterc=(edtValue)*3280.9353023;
			inchwaterf=(edtValue)*39408.984782;
			footwaterf=(edtValue)*3284.0820651;
			atomspheretechnical=(edtValue)*100;
			atmospherestandard=(edtValue)*96.784110535;
				
			 break;  	 	 	 	  	  
			 
			 
      case "Gram-force/square cm - gf/cm²":
			
   			pascal=(edtValue)*98.0665;
   			exapascal=(edtValue)*9.80665E-17;
   			petapascal=(edtValue)*9.80665E-14;
   			kilopascal=(edtValue)*0.0980665;
   			terapascal=(edtValue)*9.80665E-11;
   			gigapascal=(edtValue)*9.80665E-8;
   			megapascal=(edtValue)*0.0000980665;
   			hectopascal=(edtValue)*0.980665;
   			dekapascal=(edtValue)*9.80665;
   			decipascal=(edtValue)*980.665;
   			centipascal=(edtValue)*9806.65;
   			milipascal=(edtValue)*98066.5;
   			micropascal=(edtValue)*98066500;
   			nanopascal=(edtValue)*98066500000.0;
   			picopascal=(edtValue)*98066500000003.00;
   			femtopascal=(edtValue)*98066500000002700.0;
   			attopascal=(edtValue)*98066500000002720000.0;
   			newtonsm=(edtValue)*98.0665;
   			newtonscm=(edtValue)*0.00980665;
   			newtonsmm=(edtValue)*0.0000980665;
   			kilonewtonsm=(edtValue)*0.0980665;
   			bar=(edtValue)*0.000980665;
   			mbar=(edtValue)*0.980665;
   			microbar=(edtValue)*980.665;
   			dynescm=(edtValue)*980.665;
   			kilogramforcesm=(edtValue)*10;
   			kilometerforcescm=(edtValue)*0.001;
   			kilometersmm=(edtValue)*0.00001;
   			gramforcescm=(edtValue)*1;
   			tonforceshortsfoot=(edtValue)*0.0010240807;
   			tonforceshortsinch=(edtValue)*0.0000071117;
   			tonforcelongsfoot=(edtValue)*0.0009143578;
   			tonforcelongsinch=(edtValue)*0.0000063497;
   			kipforcesinch=(edtValue)*0.0000142233;
   			ksi=(edtValue)*0.0000142233;
   			poundforcesfoot=(edtValue)*2.0481614362;
   			poundforcesinch=(edtValue)*0.0142233433;
   			psi=(edtValue)*0.0142233433;
   			poundalsfoot=(edtValue)*65.897645501;
   			torr=(edtValue)*0.7355592401;
   			cmmercury=(edtValue)*0.0735561273;
   			milimeterofmercury=(edtValue)*0.7355612727;
   			inchmercury=(edtValue)*0.028959095;
   			cmwater=(edtValue)*1.0000275331;
   			mmwater=(edtValue)*10.000275331;
   			inchwaterc=(edtValue)*0.3937117094;
   			footwaterc=(edtValue)*0.032809353;
   			inchwaterf=(edtValue)*0.3940898478;
   			footwaterf=(edtValue)*0.0328408207;
   			atomspheretechnical=(edtValue)*0.001;
   			atmospherestandard=(edtValue)*0.0009678411;
   				
   			 break;  	 	 	
   			 
      case "Ton-force(short)/sq. foot - tonf/ft²":
			
 			pascal=(edtValue)*95760.517961;
 			exapascal=(edtValue)*9.576051796E-14;
 			petapascal=(edtValue)*9.576051796E-11;
 			kilopascal=(edtValue)*95.760517961;
 			terapascal=(edtValue)*9.576051796E-8;
 			gigapascal=(edtValue)*0.0000957605;
 			megapascal=(edtValue)*0.095760518;
 			hectopascal=(edtValue)*957.60517961;
 			dekapascal=(edtValue)*9576.0517961;
 			decipascal=(edtValue)*957605.17961;
 			centipascal=(edtValue)*9576051.7961;
 			milipascal=(edtValue)*95760517.961;
 			micropascal=(edtValue)*95760517961.0;
 			nanopascal=(edtValue)*95760517960681.0;
 			picopascal=(edtValue)*95760517960681440.00;
 			femtopascal=(edtValue)*95760517960681440000.0;
 			attopascal=(edtValue)*9.576051796E+22;
 			newtonsm=(edtValue)*95760.517961;
 			newtonscm=(edtValue)*9.5760517961;
 			newtonsmm=(edtValue)*0.095760518;
 			kilonewtonsm=(edtValue)*95.760517961;
 			bar=(edtValue)*0.9576051796;
 			mbar=(edtValue)*957.60517961;
 			microbar=(edtValue)*957605.17961;
 			dynescm=(edtValue)*957605.17961;
 			kilogramforcesm=(edtValue)*9764.8552728;
 			kilometerforcescm=(edtValue)*0.9764855273;
 			kilometersmm=(edtValue)*0.0097648553;
 			gramforcescm=(edtValue)*976.48552728;
 			tonforceshortsfoot=(edtValue)*1;
 			tonforceshortsinch=(edtValue)*0.0069444444;
 			tonforcelongsfoot=(edtValue)*0.8928571429;
 			tonforcelongsinch=(edtValue)*0.0062003968;
 			kipforcesinch=(edtValue)*0.0138888889;
 			ksi=(edtValue)*0.0138888889;
 			poundforcesfoot=(edtValue)*2000;
 			poundforcesinch=(edtValue)*13.888888889;
 			psi=(edtValue)*13.888888889;
 			poundalsfoot=(edtValue)*64348.097113;
 			torr=(edtValue)*718.26295238;
 			cmmercury=(edtValue)*71.826493722;
 			milimeterofmercury=(edtValue)*718.26493722;
 			inchmercury=(edtValue)*28.278137114;
 			cmwater=(edtValue)*976.51241295;
 			mmwater=(edtValue)*9765.1241295;
 			inchwaterc=(edtValue)*384.45378615;
 			footwaterc=(edtValue)*32.037858387;
 			inchwaterf=(edtValue)*384.82303284;
 			footwaterf=(edtValue)*32.06858607;
 			atomspheretechnical=(edtValue)*0.9764855273;
 			atmospherestandard=(edtValue)*0.9450828321;
 				
 			 break;
 			 
 			 
      case "Ton-force(short)/sq. inch - tonf/in²":
			
			pascal=(edtValue)*13789514.586;
			exapascal=(edtValue)*1.378951458E-11;
			petapascal=(edtValue)*1.378951458E-8;
			kilopascal=(edtValue)*13789.514586;
			terapascal=(edtValue)*0.0000137895;
			gigapascal=(edtValue)*0.0137895146;
			megapascal=(edtValue)*13.789514586;
			hectopascal=(edtValue)*137895.14586;
			dekapascal=(edtValue)*1378951.4586;
			decipascal=(edtValue)*137895145.86;
			centipascal=(edtValue)*1378951458.6;
			milipascal=(edtValue)*13789514586.0;
			micropascal=(edtValue)*13789514586338.0;
			nanopascal=(edtValue)*13789514586337598.0;
			picopascal=(edtValue)*13789514586337597000.00;
			femtopascal=(edtValue)*1.378951458E+22;
			attopascal=(edtValue)*13789514.586;
			newtonsm=(edtValue)*13789514.586;
			newtonscm=(edtValue)*1378.9514586;
			newtonsmm=(edtValue)*13.789514586;
			kilonewtonsm=(edtValue)*13789.514586;
			bar=(edtValue)*137.89514586;
			mbar=(edtValue)*137895.14586;
			microbar=(edtValue)*137895145.86;
			dynescm=(edtValue)*137895145.86;
			kilogramforcesm=(edtValue)*1406139.1593;
			kilometerforcescm=(edtValue)*140.61391593;
			kilometersmm=(edtValue)*1.4061391593;
			gramforcescm=(edtValue)*140613.91593;
			tonforceshortsfoot=(edtValue)*144;
			tonforceshortsinch=(edtValue)*1;
			tonforcelongsfoot=(edtValue)*128.57142857;
			tonforcelongsinch=(edtValue)*0.8928571429;
			kipforcesinch=(edtValue)*2;
			ksi=(edtValue)*2;
			poundforcesfoot=(edtValue)*288000;
			poundforcesinch=(edtValue)*2000;
			psi=(edtValue)*2000;
			poundalsfoot=(edtValue)*9266125.9843;
			torr=(edtValue)*103429.86514;
			cmmercury=(edtValue)*10343.015096;
			milimeterofmercury=(edtValue)*103430.15096;
			inchmercury=(edtValue)*4072.0517444;
			cmwater=(edtValue)*140617.78746;
			mmwater=(edtValue)*1406177.8746;
			inchwaterc=(edtValue)*55361.345205;
			footwaterc=(edtValue)*4613.4516077;
			inchwaterf=(edtValue)*55414.516729;
			footwaterf=(edtValue)*4617.8763941;
			atomspheretechnical=(edtValue)*140.61391593;
			atmospherestandard=(edtValue)*136.09192782;
				
			 break;	 
			 
      case "Ton-force(long)/sq. foot - tonf/ft²":
			
			pascal=(edtValue)*107251.78012;
			exapascal=(edtValue)*1.072517801E-13;
			petapascal=(edtValue)*1.072517801E-10;
			kilopascal=(edtValue)*107.25178012;
			terapascal=(edtValue)*1.072517801E-7;
			gigapascal=(edtValue)*0.0001072518;
			megapascal=(edtValue)*0.1072517801;
			hectopascal=(edtValue)*1072.5178012;
			dekapascal=(edtValue)*10725.178012;
			decipascal=(edtValue)*1072517.8012;
			centipascal=(edtValue)*10725178.012;
			milipascal=(edtValue)*107251780.12;
			micropascal=(edtValue)*107251780116.0;
			nanopascal=(edtValue)*107251780115952.00;
			picopascal=(edtValue)*107251780115952210.0;
			femtopascal=(edtValue)*107251780115952200000.00;
			attopascal=(edtValue)*1.072517801E+23;
			newtonsm=(edtValue)*107251.78012;
			newtonscm=(edtValue)*10.725178012;
			newtonsmm=(edtValue)*0.1072517801;
			kilonewtonsm=(edtValue)*107.25178012;
			bar=(edtValue)*1.0725178012;
			mbar=(edtValue)*1072.5178012;
			microbar=(edtValue)*1072517.8012;
			dynescm=(edtValue)*1072517.8012;
			kilogramforcesm=(edtValue)*10936.637905;
			kilometerforcescm=(edtValue)*1.0936637905;
			kilometersmm=(edtValue)*0.0109366379;
			gramforcescm=(edtValue)*1093.6637905;
			tonforceshortsfoot=(edtValue)*1.12;
			tonforceshortsinch=(edtValue)*0.0077777778;
			tonforcelongsfoot=(edtValue)*1;
			tonforcelongsinch=(edtValue)*0.0069444444;
			kipforcesinch=(edtValue)*0.0155555556;
			ksi=(edtValue)*0.0155555556;
			poundforcesfoot=(edtValue)*2240;
			poundforcesinch=(edtValue)*15.555555556;
			psi=(edtValue)*15.555555556;
			poundalsfoot=(edtValue)*72069.868766;
			torr=(edtValue)*804.45450667;
			cmmercury=(edtValue)*80.445672969;
			milimeterofmercury=(edtValue)*804.45672969;
			inchmercury=(edtValue)*31.671513568;
			cmwater=(edtValue)*1093.6939025;
			mmwater=(edtValue)*10936.939025;
			inchwaterc=(edtValue)*430.58824048;
			footwaterc=(edtValue)*35.882401393;
			inchwaterf=(edtValue)*431.00179678;
			footwaterf=(edtValue)*35.916816398;
			atomspheretechnical=(edtValue)*1.0936637905;
			atmospherestandard=(edtValue)*1.0584927719;
				
			 break;	  
			 
			 
      case "Ton-force(long)/sq. inch - tonf/in²":
			
			pascal=(edtValue)*15444256.337;
			exapascal=(edtValue)*1.544425633E-11;
			petapascal=(edtValue)*1.544425633E-8;
			kilopascal=(edtValue)*15444.256337;
			terapascal=(edtValue)*0.0000154443;
			gigapascal=(edtValue)*0.0154442563;
			megapascal=(edtValue)*15.444256337;
			hectopascal=(edtValue)*154442.56337;
			dekapascal=(edtValue)*1544425.6337;
			decipascal=(edtValue)*154442563.37;
			centipascal=(edtValue)*1544425633.7;
			milipascal=(edtValue)*15444256337.0;
			micropascal=(edtValue)*15444256336697.00;
			nanopascal=(edtValue)*15444256336697158.00;
			picopascal=(edtValue)*15444256336697158000.0;
			femtopascal=(edtValue)*1.544425633E+22;
			attopascal=(edtValue)*1.544425633E+25;
			newtonsm=(edtValue)*15444256.337;
			newtonscm=(edtValue)*1544.4256337;
			newtonsmm=(edtValue)*15.444256337;
			kilonewtonsm=(edtValue)*15444.256337;
			bar=(edtValue)*154.44256337;
			mbar=(edtValue)*154442.56337;
			microbar=(edtValue)*154442563.37;
			dynescm=(edtValue)*154442563.37;
			kilogramforcesm=(edtValue)*1574875.8584;
			kilometerforcescm=(edtValue)*157.48758584;
			kilometersmm=(edtValue)*1.5748758584;
			gramforcescm=(edtValue)*157487.58584;
			tonforceshortsfoot=(edtValue)*161.28;
			tonforceshortsinch=(edtValue)*1.12;
			tonforcelongsfoot=(edtValue)*144;
			tonforcelongsinch=(edtValue)*1;
			kipforcesinch=(edtValue)*2.24;
			ksi=(edtValue)*2.24;
			poundforcesfoot=(edtValue)*322560;
			poundforcesinch=(edtValue)*2240;
			psi=(edtValue)*2240;
			poundalsfoot=(edtValue)*10378061.102;
			torr=(edtValue)*115841.44896;
			cmmercury=(edtValue)*11584.176908;
			milimeterofmercury=(edtValue)*115841.76908;
			inchmercury=(edtValue)*4560.6979538;
			cmwater=(edtValue)*157491.92196;
			mmwater=(edtValue)*1574919.2196;
			inchwaterc=(edtValue)*62004.70663;
			footwaterc=(edtValue)*5167.0658006;
			inchwaterf=(edtValue)*62064.258736;
			footwaterf=(edtValue)*5172.0215614;
			atomspheretechnical=(edtValue)*157.48758584;
			atmospherestandard=(edtValue)*152.42295916;
				
			 break;	   
			 
			 
      case "Kip-force/square inch - kipf/in²":
			
			pascal=(edtValue)*6894757.2932;
			exapascal=(edtValue)*6.894757293E-12;
			petapascal=(edtValue)*6.894757293E-9;
			kilopascal=(edtValue)*6894.7572932;
			terapascal=(edtValue)*0.0000068948;
			gigapascal=(edtValue)*0.0068947573;
			megapascal=(edtValue)*6.8947572932;
			hectopascal=(edtValue)*68947.572932;
			dekapascal=(edtValue)*689475.72932;
			decipascal=(edtValue)*68947572.932;
			centipascal=(edtValue)*689475729.32;
			milipascal=(edtValue)*6894757293.2;
			micropascal=(edtValue)*6894757293178.0;
			nanopascal=(edtValue)*6894757293178308.00;
			picopascal=(edtValue)*6894757293178308000.0;
			femtopascal=(edtValue)*6.894757293E+21;
			attopascal=(edtValue)*6.894757293E+24;
			newtonsm=(edtValue)*6894757.2932;
			newtonscm=(edtValue)*689.47572932;
			newtonsmm=(edtValue)*6.8947572932;
			kilonewtonsm=(edtValue)*6894.7572932;
			bar=(edtValue)*68.947572932;
			mbar=(edtValue)*68947.572932;
			microbar=(edtValue)*68947572.932;
			dynescm=(edtValue)*68947572.932;
			kilogramforcesm=(edtValue)*703069.57964;
			kilometerforcescm=(edtValue)*70.306957964;
			kilometersmm=(edtValue)*0.7030695796;
			gramforcescm=(edtValue)*70306.957964;
			tonforceshortsfoot=(edtValue)*72;
			tonforceshortsinch=(edtValue)*0.5;
			tonforcelongsfoot=(edtValue)*64.285714286;
			tonforcelongsinch=(edtValue)*0.4464285714;
			kipforcesinch=(edtValue)*1;
			ksi=(edtValue)*1;
			poundforcesfoot=(edtValue)*144000;
			poundforcesinch=(edtValue)*1000;
			psi=(edtValue)*1000;
			poundalsfoot=(edtValue)*4633062.9921;
			torr=(edtValue)*51714.932572;
			cmmercury=(edtValue)*5171.507548;
			milimeterofmercury=(edtValue)*51715.07548;
			inchmercury=(edtValue)*2036.0258722;
			cmwater=(edtValue)*70308.893732;
			mmwater=(edtValue)*703088.93732;
			inchwaterc=(edtValue)*27680.672603;
			footwaterc=(edtValue)*2306.7258038;
			inchwaterf=(edtValue)*27707.258364;
			footwaterf=(edtValue)*2308.938197;
			atomspheretechnical=(edtValue)*70.306957964;
			atmospherestandard=(edtValue)*68.04596391;
				
			 break;	    
			 
		
      case "Ksi - ksi":
			
			pascal=(edtValue)*6894757.2932;
			exapascal=(edtValue)*6.894757293E-12;
			petapascal=(edtValue)*6.894757293E-9;
			kilopascal=(edtValue)*6894.7572932;
			terapascal=(edtValue)*0.0000068948;
			gigapascal=(edtValue)*0.0068947573;
			megapascal=(edtValue)*6.8947572932;
			hectopascal=(edtValue)*68947.572932;
			dekapascal=(edtValue)*689475.72932;
			decipascal=(edtValue)*68947572.932;
			centipascal=(edtValue)*689475729.32;
			milipascal=(edtValue)*6894757293.2;
			micropascal=(edtValue)*6894757293178.0;
			nanopascal=(edtValue)*6894757293178308.00;
			picopascal=(edtValue)*6894757293178308000.0;
			femtopascal=(edtValue)*6.894757293E+21;
			attopascal=(edtValue)*6.894757293E+24;
			newtonsm=(edtValue)*6894757.2932;
			newtonscm=(edtValue)*689.47572932;
			newtonsmm=(edtValue)*6.8947572932;
			kilonewtonsm=(edtValue)*6894.7572932;
			bar=(edtValue)*68.947572932;
			mbar=(edtValue)*68947.572932;
			microbar=(edtValue)*68947572.932;
			dynescm=(edtValue)*68947572.932;
			kilogramforcesm=(edtValue)*703069.57964;
			kilometerforcescm=(edtValue)*70.306957964;
			kilometersmm=(edtValue)*0.7030695796;
			gramforcescm=(edtValue)*70306.957964;
			tonforceshortsfoot=(edtValue)*72;
			tonforceshortsinch=(edtValue)*0.5;
			tonforcelongsfoot=(edtValue)*64.285714286;
			tonforcelongsinch=(edtValue)*0.4464285714;
			kipforcesinch=(edtValue)*1;
			ksi=(edtValue)*1;
			poundforcesfoot=(edtValue)*144000;
			poundforcesinch=(edtValue)*1000;
			psi=(edtValue)*1000;
			poundalsfoot=(edtValue)*4633062.9921;
			torr=(edtValue)*51714.932572;
			cmmercury=(edtValue)*5171.507548;
			milimeterofmercury=(edtValue)*51715.07548;
			inchmercury=(edtValue)*2036.0258722;
			cmwater=(edtValue)*70308.893732;
			mmwater=(edtValue)*703088.93732;
			inchwaterc=(edtValue)*27680.672603;
			footwaterc=(edtValue)*2306.7258038;
			inchwaterf=(edtValue)*27707.258364;
			footwaterf=(edtValue)*2308.938197;
			atomspheretechnical=(edtValue)*70.306957964;
			atmospherestandard=(edtValue)*68.04596391;
				
			 break;	    
			 
      case "Pound-force/square foot - lbf/ft²":
			
			pascal=(edtValue)*47.88025898;
			exapascal=(edtValue)*4.788025898E-17;
			petapascal=(edtValue)*4.788025898E-14;
			kilopascal=(edtValue)*0.047880259;
			terapascal=(edtValue)*4.788025898E-11;
			gigapascal=(edtValue)*4.788025898E-8;
			megapascal=(edtValue)*0.0000478803;
			hectopascal=(edtValue)*0.4788025898;
			dekapascal=(edtValue)*4.788025898;
			decipascal=(edtValue)*478.8025898;
			centipascal=(edtValue)*4788.025898;
			milipascal=(edtValue)*47880.25898;
			micropascal=(edtValue)*47880258.98;
			nanopascal=(edtValue)*47880258980.00;
			picopascal=(edtValue)*47880258980405.0;
			femtopascal=(edtValue)*47880258980404904.0;
			attopascal=(edtValue)*47880258980404910000.00;
			newtonsm=(edtValue)*47.88025898;
			newtonscm=(edtValue)*0.0047880259;
			newtonsmm=(edtValue)*0.0000478803;
			kilonewtonsm=(edtValue)*0.047880259;
			bar=(edtValue)*0.0004788026;
			mbar=(edtValue)*0.4788025898;
			microbar=(edtValue)*478.8025898;
			dynescm=(edtValue)*478.8025898;
			kilogramforcesm=(edtValue)*4.8824276364;
			kilometerforcescm=(edtValue)*0.0004882428;
			kilometersmm=(edtValue)*0.0000048824;
			gramforcescm=(edtValue)*0.4882427636;
			tonforceshortsfoot=(edtValue)*0.0005;
			tonforceshortsinch=(edtValue)*0.0000034722;
			tonforcelongsfoot=(edtValue)*0.0004464286;
			tonforcelongsinch=(edtValue)*0.0000031002;
			kipforcesinch=(edtValue)*0.0000069444;
			ksi=(edtValue)*0.0000069444;
			poundforcesfoot=(edtValue)*1;
			poundforcesinch=(edtValue)*0.0069444444;
			psi=(edtValue)*0.0069444444;
			poundalsfoot=(edtValue)*32.174048556;
			torr=(edtValue)*0.3591314762;
			cmmercury=(edtValue)*0.0359132469;
			milimeterofmercury=(edtValue)*0.3591324686;
			inchmercury=(edtValue)*0.0141390686;
			cmwater=(edtValue)*0.4882562065;
			mmwater=(edtValue)*4.8825620647;
			inchwaterc=(edtValue)*0.1922268931;
			footwaterc=(edtValue)*0.0160189292;
			inchwaterf=(edtValue)*0.1924115164;
			footwaterf=(edtValue)*0.016034293;
			atomspheretechnical=(edtValue)*0.0004882428;
			atmospherestandard=(edtValue)*0.0004725414;
				
			 break;	    	 	 
			 
      case "Pound-force/square inch - lbf/in²":
			
			pascal=(edtValue)*6894.7572932;
			exapascal=(edtValue)*6.894757293E-15;
			petapascal=(edtValue)*6.894757293E-12;
			kilopascal=(edtValue)*6.8947572932;
			terapascal=(edtValue)*6.894757293E-9;
			gigapascal=(edtValue)*0.0000068948;
			megapascal=(edtValue)*0.0068947573;
			hectopascal=(edtValue)*68.947572932;
			dekapascal=(edtValue)*689.47572932;
			decipascal=(edtValue)*68947.572932;
			centipascal=(edtValue)*689475.72932;
			milipascal=(edtValue)*6894757.2932;
			micropascal=(edtValue)*6894757293.2;
			nanopascal=(edtValue)*6894757293178.0;
			picopascal=(edtValue)*6894757293178308.0;
			femtopascal=(edtValue)*6894757293178307000.0;
			attopascal=(edtValue)*6.894757293E+21;
			newtonsm=(edtValue)*6894.7572932;
			newtonscm=(edtValue)*0.6894757293;
			newtonsmm=(edtValue)*0.0068947573;
			kilonewtonsm=(edtValue)*6.8947572932;
			bar=(edtValue)*0.0689475729;
			mbar=(edtValue)*68.947572932;
			microbar=(edtValue)*68947.572932;
			dynescm=(edtValue)*68947.572932;
			kilogramforcesm=(edtValue)*703.06957964;
			kilometerforcescm=(edtValue)*0.070306958;
			kilometersmm=(edtValue)*0.0007030696;
			gramforcescm=(edtValue)*70.306957964;
			tonforceshortsfoot=(edtValue)*0.072;
			tonforceshortsinch=(edtValue)*0.0005;
			tonforcelongsfoot=(edtValue)*0.0642857143;
			tonforcelongsinch=(edtValue)*0.0004464286;
			kipforcesinch=(edtValue)*0.001;
			ksi=(edtValue)*0.001;
			poundforcesfoot=(edtValue)*144;
			poundforcesinch=(edtValue)*1;
			psi=(edtValue)*1;
			poundalsfoot=(edtValue)*4633.0629921;
			torr=(edtValue)*51.714932572;
			cmmercury=(edtValue)*5.171507548;
			milimeterofmercury=(edtValue)*51.71507548;
			inchmercury=(edtValue)*2.0360258722;
			cmwater=(edtValue)*70.308893732;
			mmwater=(edtValue)*703.08893732;
			inchwaterc=(edtValue)*27.680672603;
			footwaterc=(edtValue)*2.3067258038;
			inchwaterf=(edtValue)*27.707258364;
			footwaterf=(edtValue)*2.308938197;
			atomspheretechnical=(edtValue)*0.070306958;
			atmospherestandard=(edtValue)*0.0680459639;
				
			 break;	    	 	 	 
   			 
			 
      case "Psi - psi":
			
			pascal=(edtValue)*6894.7572932;
			exapascal=(edtValue)*6.894757293E-15;
			petapascal=(edtValue)*6.894757293E-12;
			kilopascal=(edtValue)*6.8947572932;
			terapascal=(edtValue)*6.894757293E-9;
			gigapascal=(edtValue)*0.0000068948;
			megapascal=(edtValue)*0.0068947573;
			hectopascal=(edtValue)*68.947572932;
			dekapascal=(edtValue)*689.47572932;
			decipascal=(edtValue)*68947.572932;
			centipascal=(edtValue)*689475.72932;
			milipascal=(edtValue)*6894757.2932;
			micropascal=(edtValue)*6894757293.2;
			nanopascal=(edtValue)*6894757293178.0;
			picopascal=(edtValue)*6894757293178308.0;
			femtopascal=(edtValue)*6894757293178307000.0;
			attopascal=(edtValue)*6.894757293E+21;
			newtonsm=(edtValue)*6894.7572932;
			newtonscm=(edtValue)*0.6894757293;
			newtonsmm=(edtValue)*0.0068947573;
			kilonewtonsm=(edtValue)*6.8947572932;
			bar=(edtValue)*0.0689475729;
			mbar=(edtValue)*68.947572932;
			microbar=(edtValue)*68947.572932;
			dynescm=(edtValue)*68947.572932;
			kilogramforcesm=(edtValue)*703.06957964;
			kilometerforcescm=(edtValue)*0.070306958;
			kilometersmm=(edtValue)*0.0007030696;
			gramforcescm=(edtValue)*70.306957964;
			tonforceshortsfoot=(edtValue)*0.072;
			tonforceshortsinch=(edtValue)*0.0005;
			tonforcelongsfoot=(edtValue)*0.0642857143;
			tonforcelongsinch=(edtValue)*0.0004464286;
			kipforcesinch=(edtValue)*0.001;
			ksi=(edtValue)*0.001;
			poundforcesfoot=(edtValue)*144;
			poundforcesinch=(edtValue)*1;
			psi=(edtValue)*1;
			poundalsfoot=(edtValue)*4633.0629921;
			torr=(edtValue)*51.714932572;
			cmmercury=(edtValue)*5.171507548;
			milimeterofmercury=(edtValue)*51.71507548;
			inchmercury=(edtValue)*2.0360258722;
			cmwater=(edtValue)*70.308893732;
			mmwater=(edtValue)*703.08893732;
			inchwaterc=(edtValue)*27.680672603;
			footwaterc=(edtValue)*2.3067258038;
			inchwaterf=(edtValue)*27.707258364;
			footwaterf=(edtValue)*2.308938197;
			atomspheretechnical=(edtValue)*0.070306958;
			atmospherestandard=(edtValue)*0.0680459639;
				
			 break;	    	 	 	 
			 
			 
      case "Poundal/square foot - pdl/ft²":
			
			pascal=(edtValue)*1.4881639436;
			exapascal=(edtValue)*1.488163943E-18;
			petapascal=(edtValue)*1.488163943E-15;
			kilopascal=(edtValue)*0.0014881639;
			terapascal=(edtValue)*1.488163943E-12;
			gigapascal=(edtValue)*1.488163943E-9;
			megapascal=(edtValue)*0.0000014882;
			hectopascal=(edtValue)*0.0148816394;
			dekapascal=(edtValue)*0.1488163944;
			decipascal=(edtValue)*14.881639436;
			centipascal=(edtValue)*148.81639436;
			milipascal=(edtValue)*1488.1639436;
			micropascal=(edtValue)*1488163.9436;
			nanopascal=(edtValue)*1488163943.6;
			picopascal=(edtValue)*1488163943570.0;
			femtopascal=(edtValue)*1488163943569547.0;
			attopascal=(edtValue)*1488163943569547000.00;
			newtonsm=(edtValue)*1.4881639436;
			newtonscm=(edtValue)*0.0001488164;
			newtonsmm=(edtValue)*0.0000014882;
			kilonewtonsm=(edtValue)*0.0014881639;
			bar=(edtValue)*0.0000148816;
			mbar=(edtValue)*0.0148816394;
			microbar=(edtValue)*14.881639436;
			dynescm=(edtValue)*14.881639436;
			kilogramforcesm=(edtValue)*0.1517504901;
			kilometerforcescm=(edtValue)*0.000015175;
			kilometersmm=(edtValue)*1.5175049E-7;
			gramforcescm=(edtValue)*0.015175049;
			tonforceshortsfoot=(edtValue)*0.0000155405;
			tonforceshortsinch=(edtValue)*1.079199658E-7;
			tonforcelongsfoot=(edtValue)*0.0000138754;
			tonforcelongsinch=(edtValue)*9.635711238E-8;
			kipforcesinch=(edtValue)*2.158399317E-7;
			ksi=(edtValue)*2.158399317E-7;
			poundforcesfoot=(edtValue)*0.0310809502;
			poundforcesinch=(edtValue)*0.0002158399;
			psi=(edtValue)*0.0002158399;
			poundalsfoot=(edtValue)*1;
			torr=(edtValue)*0.0111621475;
			cmmercury=(edtValue)*0.0011162178;
			milimeterofmercury=(edtValue)*0.0111621784;
			inchmercury=(edtValue)*0.0004394557;
			cmwater=(edtValue)*0.0151754668;
			mmwater=(edtValue)*0.1517546682;
			inchwaterc=(edtValue)*0.0059745945;
			footwaterc=(edtValue)*0.0004978835;
			inchwaterf=(edtValue)*0.0059803328;
			footwaterf=(edtValue)*0.0004983611;
			atomspheretechnical=(edtValue)*0.000015175;
			atmospherestandard=(edtValue)*0.000014687;
				
			 break;	  
			 
			 
			 
      case "Torr - torr":
			
			pascal=(edtValue)*133.32236842;
			exapascal=(edtValue)*1.333223684E-16;
			petapascal=(edtValue)*1.333223684E-13;
			kilopascal=(edtValue)*0.1333223684;
			terapascal=(edtValue)*1.333223684E-10;
			gigapascal=(edtValue)*1.333223684E-7;
			megapascal=(edtValue)*0.0001333224;
			hectopascal=(edtValue)*1.3332236842;
			dekapascal=(edtValue)*13.332236842;
			decipascal=(edtValue)*1333.2236842;
			centipascal=(edtValue)*13332.236842;
			milipascal=(edtValue)*133322.36842;
			micropascal=(edtValue)*133322368.42;
			nanopascal=(edtValue)*133322368421.0;
			picopascal=(edtValue)*133322368421083.00;
			femtopascal=(edtValue)*133322368421082800.0;
			attopascal=(edtValue)*133322368421082810000.00;
			newtonsm=(edtValue)*133.32236842;
			newtonscm=(edtValue)*0.0133322368;
			newtonsmm=(edtValue)*0.0001333224;
			kilonewtonsm=(edtValue)*0.1333223684;
			bar=(edtValue)*0.0013332237;
			mbar=(edtValue)*1.3332236842;
			microbar=(edtValue)*1333.2236842;
			dynescm=(edtValue)*1333.2236842;
			kilogramforcesm=(edtValue)*13.595098063;
			kilometerforcescm=(edtValue)*0.0013595098;
			kilometersmm=(edtValue)*0.0000135951;
			gramforcescm=(edtValue)*1.3595098063;
			tonforceshortsfoot=(edtValue)*0.0013922478;
			tonforceshortsinch=(edtValue)*0.0000096684;
			tonforcelongsfoot=(edtValue)*0.0012430784;
			tonforcelongsinch=(edtValue)*0.0000086325;
			kipforcesinch=(edtValue)*0.0000193368;
			ksi=(edtValue)*0.0000193368;
			poundforcesfoot=(edtValue)*2.7844955575;
			poundforcesinch=(edtValue)*0.0193367747;
			psi=(edtValue)*0.0193367747;
			poundalsfoot=(edtValue)*89.588495271;
			torr=(edtValue)*1;
			cmmercury=(edtValue)*0.1000002763;
			milimeterofmercury=(edtValue)*1.0000027634;
			inchmercury=(edtValue)*0.0393701736;
			cmwater=(edtValue)*1.3595472378;
			mmwater=(edtValue)*13.595472378;
			inchwaterc=(edtValue)*0.5352549298;
			footwaterc=(edtValue)*0.0446046372;
			inchwaterf=(edtValue)*0.5357690127;
			footwaterf=(edtValue)*0.0446474177;
			atomspheretechnical=(edtValue)*0.0013595098;
			atmospherestandard=(edtValue)*0.0013157895;
				
			 break;	  
			 
			 
			 
      case "Centimeter mercury(0°C) - cmHg":
			
			pascal=(edtValue)*1333.22;
			exapascal=(edtValue)*1.33322E-15;
			petapascal=(edtValue)*1.33322E-12;
			kilopascal=(edtValue)*1.33322;
			terapascal=(edtValue)*1.33322E-9;
			gigapascal=(edtValue)*0.0000013332;
			megapascal=(edtValue)*0.00133322;
			hectopascal=(edtValue)*13.3322;
			dekapascal=(edtValue)*133.322;
			decipascal=(edtValue)*13332.2;
			centipascal=(edtValue)*133322;
			milipascal=(edtValue)*1333220;
			micropascal=(edtValue)*1333220000;
			nanopascal=(edtValue)*1333220000000.0;
			picopascal=(edtValue)*1333220000000001.00;
			femtopascal=(edtValue)*1333220000000001000.0;
			attopascal=(edtValue)*1.33322E+21;
			newtonsm=(edtValue)*1333.22;
			newtonscm=(edtValue)*0.133322;
			newtonsmm=(edtValue)*0.00133322;
			kilonewtonsm=(edtValue)*1.33322;
			bar=(edtValue)*0.0133322;
			mbar=(edtValue)*13.3322;
			microbar=(edtValue)*13332.2;
			dynescm=(edtValue)*13332.2;
			kilogramforcesm=(edtValue)*135.95060495;
			kilometerforcescm=(edtValue)*0.0135950605;
			kilometersmm=(edtValue)*0.0001359506;
			gramforcescm=(edtValue)*13.595060495;
			tonforceshortsfoot=(edtValue)*0.0139224393;
			tonforceshortsinch=(edtValue)*0.0000966836;
			tonforcelongsfoot=(edtValue)*0.0124307494;
			tonforcelongsinch=(edtValue)*0.0000863246;
			kipforcesinch=(edtValue)*0.0001933672;
			ksi=(edtValue)*0.0001933672;
			poundforcesfoot=(edtValue)*27.844878628;
			poundforcesinch=(edtValue)*0.1933672127;
			psi=(edtValue)*0.1933672127;
			poundalsfoot=(edtValue)*895.88247704;
			torr=(edtValue)*9.9999723661;
			cmmercury=(edtValue)*1;
			milimeterofmercury=(edtValue)*10;
			inchmercury=(edtValue)*0.3937006479;
			cmwater=(edtValue)*13.595434809;
			mmwater=(edtValue)*135.95434809;
			inchwaterc=(edtValue)*5.3525345067;
			footwaterc=(edtValue)*0.4460451391;
			inchwaterf=(edtValue)*5.3576753214;
			footwaterf=(edtValue)*0.4464729434;
			atomspheretechnical=(edtValue)*0.0135950605;
			atmospherestandard=(edtValue)*0.0131578584;
				
			 break;	  
			 
			 
			 
      case "Millimeter mercury(0°C) - mmHg":
			
 			pascal=(edtValue)*133.322;
 			exapascal=(edtValue)*1.33322E-16;
 			petapascal=(edtValue)*1.33322E-13;
 			kilopascal=(edtValue)*0.133322;
 			terapascal=(edtValue)*1.33322E-10;
 			gigapascal=(edtValue)*1.33322E-7;
 			megapascal=(edtValue)*0.000133322;
 			hectopascal=(edtValue)*1.33322;
 			dekapascal=(edtValue)*13.3322;
 			decipascal=(edtValue)*1333.22;
 			centipascal=(edtValue)*13332.2;
 			milipascal=(edtValue)*133322;
 			micropascal=(edtValue)*133322000;
 			nanopascal=(edtValue)*133322000000.0;
 			picopascal=(edtValue)*133322000000000.00;
 			femtopascal=(edtValue)*133322000000000110.0;
 			attopascal=(edtValue)*133322000000000110000.0;
 			newtonsm=(edtValue)*133.322;
 			newtonscm=(edtValue)*0.0133322;
 			newtonsmm=(edtValue)*0.000133322;
 			kilonewtonsm=(edtValue)*0.133322;
 			bar=(edtValue)*0.00133322;
 			mbar=(edtValue)*1.33322;
 			microbar=(edtValue)*1333.22;
 			dynescm=(edtValue)*1333.22;
 			kilogramforcesm=(edtValue)*13.595060495;
 			kilometerforcescm=(edtValue)*0.001359506;
 			kilometersmm=(edtValue)*0.0000135951;
 			gramforcescm=(edtValue)*1.3595060495;
 			tonforceshortsfoot=(edtValue)*0.0013922439;
 			tonforceshortsinch=(edtValue)*0.0000096684;
 			tonforcelongsfoot=(edtValue)*0.0012430749;
 			tonforcelongsinch=(edtValue)*0.0000086325;
 			kipforcesinch=(edtValue)*0.0000193367;
 			ksi=(edtValue)*0.0000193367;
 			poundforcesfoot=(edtValue)*2.7844878628;
 			poundforcesinch=(edtValue)*0.0193367213;
 			psi=(edtValue)*0.0193367213;
 			poundalsfoot=(edtValue)*89.588247704;
 			torr=(edtValue)*0.9999972366;
 			cmmercury=(edtValue)*0.1;
 			milimeterofmercury=(edtValue)*1;
 			inchmercury=(edtValue)*0.0393700648;
 			cmwater=(edtValue)*1.3595434809;
 			mmwater=(edtValue)*13.595434809;
 			inchwaterc=(edtValue)*0.5352534507;
 			footwaterc=(edtValue)*0.0446045139;
 			inchwaterf=(edtValue)*0.5357675321;
 			footwaterf=(edtValue)*0.0446472943;
 			atomspheretechnical=(edtValue)*0.001359506;
 			atmospherestandard=(edtValue)*0.0013157858;
 				
 			 break;	  
 			 
 			 
      case "Inch mercury(32°F) - inHg":
			
			pascal=(edtValue)*3386.38;
			exapascal=(edtValue)*3.38638E-15;
			petapascal=(edtValue)*3.38638E-12;
			kilopascal=(edtValue)*3.38638;
			terapascal=(edtValue)*3.38638E-9;
			gigapascal=(edtValue)*0.0000033864;
			megapascal=(edtValue)*0.00338638;
			hectopascal=(edtValue)*33.8638;
			dekapascal=(edtValue)*338.638;
			decipascal=(edtValue)*33863.8;
			centipascal=(edtValue)*338638;
			milipascal=(edtValue)*3386380;
			micropascal=(edtValue)*3386380000.0;
			nanopascal=(edtValue)*3386380000000.0;
			picopascal=(edtValue)*3386380000000054.00;
			femtopascal=(edtValue)*3386380000000054000.0;
			attopascal=(edtValue)*3.38638E+21;
			newtonsm=(edtValue)*3386.38;
			newtonscm=(edtValue)*0.338638;
			newtonsmm=(edtValue)*0.00338638;
			kilonewtonsm=(edtValue)*3.38638;
			bar=(edtValue)*0.0338638;
			mbar=(edtValue)*33.8638;
			microbar=(edtValue)*33863.8;
			dynescm=(edtValue)*33863.8;
			kilogramforcesm=(edtValue)*345.31465893;
			kilometerforcescm=(edtValue)*0.001359506;
			kilometersmm=(edtValue)*0.0003453147;
			gramforcescm=(edtValue)*34.531465893;
			tonforceshortsfoot=(edtValue)*0.0353630084;
			tonforceshortsinch=(edtValue)*0.0002455764;
			tonforcelongsfoot=(edtValue)*0.0315741146;
			tonforcelongsinch=(edtValue)*0.0002192647;
			kipforcesinch=(edtValue)*0.0004911529;
			ksi=(edtValue)*0.0004911529;
			poundforcesfoot=(edtValue)*70.726016778;
			poundforcesinch=(edtValue)*0.4911528943;
			psi=(edtValue)*0.4911528943;
			poundalsfoot=(edtValue)*2275.542298;
			torr=(edtValue)*25.399938811;
			cmmercury=(edtValue)*2.5400009001;
			milimeterofmercury=(edtValue)*25.400009001;
			inchmercury=(edtValue)*1;
			cmwater=(edtValue)*34.532416651;
			mmwater=(edtValue)*345.32416651;
			inchwaterc=(edtValue)*13.595442465;
			footwaterc=(edtValue)*1.1329550549;
			inchwaterf=(edtValue)*13.608500139;
			footwaterf=(edtValue)*1.1340416782;
			atomspheretechnical=(edtValue)*0.0345314659;
			atmospherestandard=(edtValue)*0.0334209721;
				
			 break;	  
			 
 			 
      case "Centimeter water(4°C) - cmAq":
			
			pascal=(edtValue)*98.0638;
			exapascal=(edtValue)*9.80638E-17;
			petapascal=(edtValue)*9.80638E-14;
			kilopascal=(edtValue)*0.0980638;
			terapascal=(edtValue)*9.80638E-11;
			gigapascal=(edtValue)*9.80638E-8;
			megapascal=(edtValue)*0.0000980638;
			hectopascal=(edtValue)*0.980638;
			dekapascal=(edtValue)*9.80638;
			decipascal=(edtValue)*980.638;
			centipascal=(edtValue)*9806.38;
			milipascal=(edtValue)*98063.8;
			micropascal=(edtValue)*98063800.0;
			nanopascal=(edtValue)*98063800000.0;
			picopascal=(edtValue)*98063800000001.00;
			femtopascal=(edtValue)*98063800000000940.0;
			attopascal=(edtValue)*98063800000000950000.0;
			newtonsm=(edtValue)*98.0638;
			newtonscm=(edtValue)*0.00980638;
			newtonsmm=(edtValue)*0.0000980638;
			kilonewtonsm=(edtValue)*0.0980638;
			bar=(edtValue)*0.000980638;
			mbar=(edtValue)*0.980638;
			microbar=(edtValue)*980.638;
			dynescm=(edtValue)*980.638;
			kilogramforcesm=(edtValue)*9.9997246766;
			kilometerforcescm=(edtValue)*0.0009999725;
			kilometersmm=(edtValue)*0.0000099997;
			gramforcescm=(edtValue)*0.9999724677;
			tonforceshortsfoot=(edtValue)*0.0010240525;
			tonforceshortsinch=(edtValue)*0.0000071115;
			tonforcelongsfoot=(edtValue)*0.0009143326;
			tonforcelongsinch=(edtValue)*0.0000063495;
			kipforcesinch=(edtValue)*0.000014223;
			ksi=(edtValue)*0.000014223;
			poundforcesfoot=(edtValue)*2.0481050455;
			poundforcesinch=(edtValue)*0.0142229517;
			psi=(edtValue)*0.0142229517;
			poundalsfoot=(edtValue)*65.895831184;
			torr=(edtValue)*0.7355389884;
			cmmercury=(edtValue)*0.0735541021;
			milimeterofmercury=(edtValue)*0.735541021;
			inchmercury=(edtValue)*0.0289582977;
			cmwater=(edtValue)*1;
			mmwater=(edtValue)*10;
			inchwaterc=(edtValue)*0.3937008696;
			footwaterc=(edtValue)*0.0328084497;
			inchwaterf=(edtValue)*0.3940789976;
			footwaterf=(edtValue)*0.0328399165;
			atomspheretechnical=(edtValue)*0.0009999725;
			atmospherestandard=(edtValue)*0.0009678145;
				
			 break;	  
			 
      case "Millimeter water(4°C) - mmAq":
			
			pascal=(edtValue)*9.80638;
			exapascal=(edtValue)*9.80638E-18;
			petapascal=(edtValue)*9.80638E-15;
			kilopascal=(edtValue)*0.00980638;
			terapascal=(edtValue)*9.80638E-12;
			gigapascal=(edtValue)*9.80638E-9;
			megapascal=(edtValue)*0.0000098064;
			hectopascal=(edtValue)*0.0980638;
			dekapascal=(edtValue)*0.980638;
			decipascal=(edtValue)*98.0638;
			centipascal=(edtValue)*980.638;
			milipascal=(edtValue)*9806.38;
			micropascal=(edtValue)*9806380;
			nanopascal=(edtValue)*9806380000.0;
			picopascal=(edtValue)*9806380000000.00;
			femtopascal=(edtValue)*9806380000000094.0;
			attopascal=(edtValue)*9806380000000096000.0;
			newtonsm=(edtValue)*9.80638;
			newtonscm=(edtValue)*0.000980638;
			newtonsmm=(edtValue)*0.0000098064;
			kilonewtonsm=(edtValue)*0.00980638;
			bar=(edtValue)*0.0000980638;
			mbar=(edtValue)*0.0980638;
			microbar=(edtValue)*98.0638;
			dynescm=(edtValue)*98.0638;
			kilogramforcesm=(edtValue)*0.9999724677;
			kilometerforcescm=(edtValue)*0.0000999972;
			kilometersmm=(edtValue)*9.999724676E-7;
			gramforcescm=(edtValue)*0.0999972468;
			tonforceshortsfoot=(edtValue)*0.0001024053;
			tonforceshortsinch=(edtValue)*7.111475852E-7;
			tonforcelongsfoot=(edtValue)*0.0000914333;
			tonforcelongsinch=(edtValue)*6.349532011E-7;
			kipforcesinch=(edtValue)*0.0000014223;
			ksi=(edtValue)*0.0000014223;
			poundforcesfoot=(edtValue)*0.2048105046;
			poundforcesinch=(edtValue)*0.0014222952;
			psi=(edtValue)*0.0014222952;
			poundalsfoot=(edtValue)*6.5895831184;
			torr=(edtValue)*0.0735538988;
			cmmercury=(edtValue)*0.0073554102;
			milimeterofmercury=(edtValue)*0.0735541021;
			inchmercury=(edtValue)*0.0028958298;
			cmwater=(edtValue)*0.1;
			mmwater=(edtValue)*1;
			inchwaterc=(edtValue)*0.039370087;
			footwaterc=(edtValue)*0.003280845;
			inchwaterf=(edtValue)*0.0394078998;
			footwaterf=(edtValue)*0.0032839916;
			atomspheretechnical=(edtValue)*0.0000999972;
			atmospherestandard=(edtValue)*0.0000967814;
				
			 break;	  
			 
			 
      case "Inch water(4°C) - inAq":
			
			pascal=(edtValue)*249.082;
			exapascal=(edtValue)*2.490819999E-16;
			petapascal=(edtValue)*2.490819999E-13;
			kilopascal=(edtValue)*0.249082;
			terapascal=(edtValue)*2.490819999E-10;
			gigapascal=(edtValue)*2.490819999E-7;
			megapascal=(edtValue)*0.000249082;
			hectopascal=(edtValue)*2.49082;
			dekapascal=(edtValue)*24.9082;
			decipascal=(edtValue)*2490.82;
			centipascal=(edtValue)*24908.2;
			milipascal=(edtValue)*249082;
			micropascal=(edtValue)*249082000;
			nanopascal=(edtValue)*249082000000.0;
			picopascal=(edtValue)*249081999999999.00;
			femtopascal=(edtValue)*249081999999999400.0;
			attopascal=(edtValue)*249081999999999400000.0;
			newtonsm=(edtValue)*249.082;
			newtonscm=(edtValue)*0.0249082;
			newtonsmm=(edtValue)*0.000249082;
			kilonewtonsm=(edtValue)*0.249082;
			bar=(edtValue)*0.00249082;
			mbar=(edtValue)*2.49082;
			microbar=(edtValue)*2490.82;
			dynescm=(edtValue)*2490.82;
			kilogramforcesm=(edtValue)*25.399295376;
			kilometerforcescm=(edtValue)*0.0025399295;
			kilometersmm=(edtValue)*0.0000253993;
			gramforcescm=(edtValue)*2.5399295376;
			tonforceshortsfoot=(edtValue)*0.0026010929;
			tonforceshortsinch=(edtValue)*0.0000180631;
			tonforcelongsfoot=(edtValue)*0.0023224043;
			tonforcelongsinch=(edtValue)*0.0000161278;
			kipforcesinch=(edtValue)*0.0000361263;
			ksi=(edtValue)*0.0000361263;
			poundforcesfoot=(edtValue)*5.2021857297;
			poundforcesinch=(edtValue)*0.0361262898;
			psi=(edtValue)*0.0361262898;
			poundalsfoot=(edtValue)*167.37537627;
			torr=(edtValue)*1.8682686405;
			cmmercury=(edtValue)*0.1868273803;
			milimeterofmercury=(edtValue)*1.8682738033;
			inchmercury=(edtValue)*0.0735540607;
			cmwater=(edtValue)*2.5399994697;
			mmwater=(edtValue)*25.399994697;
			inchwaterc=(edtValue)*1;
			footwaterc=(edtValue)*0.0833334449;
			inchwaterf=(edtValue)*1.0009604449;
			footwaterf=(edtValue)*0.0834133704;
			atomspheretechnical=(edtValue)*0.0025399295;
			atmospherestandard=(edtValue)*0.0024582482;
				
			 break;	  	 
			 
      case "Foot water(4°C) - ftAq":
			
   			pascal=(edtValue)*2988.98;
   			exapascal=(edtValue)*2.988979999E-15;
   			petapascal=(edtValue)*2.988979999E-12;
   			kilopascal=(edtValue)*2.98898;
   			terapascal=(edtValue)*2.988979999E-9;
   			gigapascal=(edtValue)*0.000002989;
   			megapascal=(edtValue)*0.00298898;
   			hectopascal=(edtValue)*29.8898;
   			dekapascal=(edtValue)*298.898;
   			decipascal=(edtValue)*29889.8;
   			centipascal=(edtValue)*298898;
   			milipascal=(edtValue)*2988980;
   			micropascal=(edtValue)*2988980000.0;
   			nanopascal=(edtValue)*2988980000000.0;
   			picopascal=(edtValue)*2988979999999965.00;
   			femtopascal=(edtValue)*2988979999999964000.0;
   			attopascal=(edtValue)*2.988979999E+21;
   			newtonsm=(edtValue)*2988.98;
   			newtonscm=(edtValue)*0.298898;
   			newtonsmm=(edtValue)*0.00298898;
   			kilonewtonsm=(edtValue)*2.98898;
   			bar=(edtValue)*0.0298898;
   			mbar=(edtValue)*29.8898;
   			microbar=(edtValue)*29889.8;
   			dynescm=(edtValue)*29889.8;
   			kilogramforcesm=(edtValue)*304.79113663;
   			kilometerforcescm=(edtValue)*0.0304791137;
   			kilometersmm=(edtValue)*0.0003047911;
   			gramforcescm=(edtValue)*30.479113663;
   			tonforceshortsfoot=(edtValue)*0.0312130726;
   			tonforceshortsinch=(edtValue)*0.0002167574;
   			tonforcelongsfoot=(edtValue)*0.0278688148;
   			tonforcelongsinch=(edtValue)*0.0001935334;
   			kipforcesinch=(edtValue)*0.0004335149;
   			ksi=(edtValue)*0.0004335149;
   			poundforcesfoot=(edtValue)*62.426145214;
   			poundforcesinch=(edtValue)*0.4335148973;
   			psi=(edtValue)*0.4335148973;
   			poundalsfoot=(edtValue)*2008.5018273;
   			torr=(edtValue)*22.419193684;
   			cmmercury=(edtValue)*2.2419255637;
   			milimeterofmercury=(edtValue)*22.419255637;
   			inchmercury=(edtValue)*0.8826475469;
   			cmwater=(edtValue)*30.479952847;
   			mmwater=(edtValue)*304.79952847;
   			inchwaterc=(edtValue)*11.999983941;
   			footwaterc=(edtValue)*1;
   			inchwaterf=(edtValue)*12.011509265;
   			footwaterf=(edtValue)*1.0009591054;
   			atomspheretechnical=(edtValue)*0.0304791137;
   			atmospherestandard=(edtValue)*0.0294989391;
   				
   			 break;	  	 	 
   			 
   			 
      case "Inch water(60°C) - inAq":
			
 			pascal=(edtValue)*248.843;
 			exapascal=(edtValue)*2.48843E-16;
 			petapascal=(edtValue)*2.48843E-13;
 			kilopascal=(edtValue)*0.248843;
 			terapascal=(edtValue)*2.48843E-10;
 			gigapascal=(edtValue)*2.48843E-7;
 			megapascal=(edtValue)*0.000248843;
 			hectopascal=(edtValue)*2.48843;
 			dekapascal=(edtValue)*24.8843;
 			decipascal=(edtValue)*2488.43;
 			centipascal=(edtValue)*24884.3;
 			milipascal=(edtValue)*248843;
 			micropascal=(edtValue)*248843000.0;
 			nanopascal=(edtValue)*248843000000.0;
 			picopascal=(edtValue)*248843000000003.00;
 			femtopascal=(edtValue)*248843000000002780.0;
 			attopascal=(edtValue)*248843000000002820000.0;
 			newtonsm=(edtValue)*248.843;
 			newtonscm=(edtValue)*0.0248843;
 			newtonsmm=(edtValue)*0.000248843;
 			kilonewtonsm=(edtValue)*0.248843;
 			bar=(edtValue)*0.00248843;
 			mbar=(edtValue)*2.48843;
 			microbar=(edtValue)*2488.43;
 			dynescm=(edtValue)*2488.43;
 			kilogramforcesm=(edtValue)*25.374924159;
 			kilometerforcescm=(edtValue)*0.0025374924;
 			kilometersmm=(edtValue)*0.0000253749;
 			gramforcescm=(edtValue)*2.5374924159;
 			tonforceshortsfoot=(edtValue)*0.0025985971;
 			tonforceshortsinch=(edtValue)*0.0000180458;
 			tonforcelongsfoot=(edtValue)*0.0023201759;
 			tonforcelongsinch=(edtValue)*0.0000161123;
 			kipforcesinch=(edtValue)*0.0000360916;
 			ksi=(edtValue)*0.0000360916;
 			poundforcesfoot=(edtValue)*5.1971941109;
 			poundforcesinch=(edtValue)*0.0360916258;
 			psi=(edtValue)*0.0360916258;
 			poundalsfoot=(edtValue)*167.21477568;
 			torr=(edtValue)*1.8664759931;
 			cmmercury=(edtValue)*0.1866481151;
 			milimeterofmercury=(edtValue)*1.8664811509;
 			inchmercury=(edtValue)*0.0734834838;
 			cmwater=(edtValue)*2.5375622809;
 			mmwater=(edtValue)*25.375622809;
 			inchwaterc=(edtValue)*0.9990404766;
 			footwaterc=(edtValue)*0.0832534845;
 			inchwaterf=(edtValue)*1;
 			footwaterf=(edtValue)*0.0833333333;
 			atomspheretechnical=(edtValue)*0.0025374924;
 			atmospherestandard=(edtValue)*0.0024558895;
 				
 			 break;	  	 	 	 
 			 
      case "Foot water(60°C) - ftAq":
			
			pascal=(edtValue)*2986.116;
			exapascal=(edtValue)*2.986115999E-15;
			petapascal=(edtValue)*2.986115999E-12;
			kilopascal=(edtValue)*2.986116;
			terapascal=(edtValue)*2.986115999E-9;
			gigapascal=(edtValue)*0.0000029861;
			megapascal=(edtValue)*0.002986116;
			hectopascal=(edtValue)*29.86116;
			dekapascal=(edtValue)*298.6116;
			decipascal=(edtValue)*29861.16;
			centipascal=(edtValue)*298611.6;
			milipascal=(edtValue)*2986116;
			micropascal=(edtValue)*2986116000.0;
			nanopascal=(edtValue)*2986116000000.0;
			picopascal=(edtValue)*2986115999999974.00;
			femtopascal=(edtValue)*2986115999999974000.0;
			attopascal=(edtValue)*2.986115999E+21;
			newtonsm=(edtValue)*2986.116;
			newtonscm=(edtValue)*0.2986116;
			newtonsmm=(edtValue)*0.002986116;
			kilonewtonsm=(edtValue)*2.986116;
			bar=(edtValue)*0.02986116;
			mbar=(edtValue)*29.86116;
			microbar=(edtValue)*29861.16;
			dynescm=(edtValue)*29861.16;
			kilogramforcesm=(edtValue)*304.4990899;
			kilometerforcescm=(edtValue)*0.030449909;
			kilometersmm=(edtValue)*0.0003044991;
			gramforcescm=(edtValue)*30.44990899;
			tonforceshortsfoot=(edtValue)*0.0311831647;
			tonforceshortsinch=(edtValue)*0.0002165498;
			tonforcelongsfoot=(edtValue)*0.0278421113;
			tonforcelongsinch=(edtValue)*0.000193348;
			kipforcesinch=(edtValue)*0.0004330995;
			ksi=(edtValue)*0.0004330995;
			poundforcesfoot=(edtValue)*62.36632933;
			poundforcesinch=(edtValue)*0.4330995092;
			psi=(edtValue)*0.4330995092;
			poundalsfoot=(edtValue)*2006.5773082;
			torr=(edtValue)*22.397711917;
			cmmercury=(edtValue)*2.2397773811;
			milimeterofmercury=(edtValue)*22.397773811;
			inchmercury=(edtValue)*0.8818018061;
			cmwater=(edtValue)*30.450747371;
			mmwater=(edtValue)*304.50747371;
			inchwaterc=(edtValue)*11.98848572;
			footwaterc=(edtValue)*0.9990418136;
			inchwaterf=(edtValue)*12;
			footwaterf=(edtValue)*1;
			atomspheretechnical=(edtValue)*0.030449909;
			atmospherestandard=(edtValue)*0.0294706736;
				
			 break;	  	 	 
			 
      case "Atmosphere technical - at":
			
			pascal=(edtValue)*98066.5;
			exapascal=(edtValue)*9.80665E-14;
			petapascal=(edtValue)*9.80665E-11;
			kilopascal=(edtValue)*98.0665;
			terapascal=(edtValue)*9.80665E-8;
			gigapascal=(edtValue)*0.0000980665;
			megapascal=(edtValue)*0.0980665;
			hectopascal=(edtValue)*980.665;
			dekapascal=(edtValue)*9806.65;
			decipascal=(edtValue)*980665;
			centipascal=(edtValue)*9806650;
			milipascal=(edtValue)*98066500;
			micropascal=(edtValue)*98066500000.0;
			nanopascal=(edtValue)*98066500000003.0;
			picopascal=(edtValue)*98066500000002720.00;
			femtopascal=(edtValue)*98066500000002700000.0;
			attopascal=(edtValue)*9.80665E+22;
			newtonsm=(edtValue)*98066.5;
			newtonscm=(edtValue)*9.80665;
			newtonsmm=(edtValue)*0.0980665;
			kilonewtonsm=(edtValue)*98.0665;
			bar=(edtValue)*0.980665;
			mbar=(edtValue)*980.665;
			microbar=(edtValue)*980665;
			dynescm=(edtValue)*980665;
			kilogramforcesm=(edtValue)*10000;
			kilometerforcescm=(edtValue)*1;
			kilometersmm=(edtValue)*0.01;
			gramforcescm=(edtValue)*1000;
			tonforceshortsfoot=(edtValue)*1.0240807181;
			tonforceshortsinch=(edtValue)*0.0071116717;
			tonforcelongsfoot=(edtValue)*0.914357784;
			tonforcelongsinch=(edtValue)*0.0063497068;
			kipforcesinch=(edtValue)*0.0142233433;
			ksi=(edtValue)*0.0142233433;
			poundforcesfoot=(edtValue)*2048.1614362;
			poundforcesinch=(edtValue)*14.223343307;
			psi=(edtValue)*14.223343307;
			poundalsfoot=(edtValue)*65897.645501;
			torr=(edtValue)*735.55924007;
			cmmercury=(edtValue)*73.556127271;
			milimeterofmercury=(edtValue)*735.56127271;
			inchmercury=(edtValue)*28.959094963;
			cmwater=(edtValue)*1000.0275331;
			mmwater=(edtValue)*10000.275331;
			inchwaterc=(edtValue)*393.7117094;
			footwaterc=(edtValue)*32.809353023;
			inchwaterf=(edtValue)*394.08984782;
			footwaterf=(edtValue)*32.840820651;
			atomspheretechnical=(edtValue)*1;
			atmospherestandard=(edtValue)*0.9678411054;
				
			 break;	  	 	 	 
			 
			 
      case "Atmosphere - atm":
			
			pascal=(edtValue)*101325;
			exapascal=(edtValue)*1.01325E-13;
			petapascal=(edtValue)*1.01325E-10;
			kilopascal=(edtValue)*101.325;
			terapascal=(edtValue)*1.01325E-7;
			gigapascal=(edtValue)*0.000101325;
			megapascal=(edtValue)*0.101325;
			hectopascal=(edtValue)*1013.25;
			dekapascal=(edtValue)*1013.25;
			decipascal=(edtValue)*1013250;
			centipascal=(edtValue)*10132500;
			milipascal=(edtValue)*101325000;
			micropascal=(edtValue)*101325000000.0;
			nanopascal=(edtValue)*101325000000000.0;
			picopascal=(edtValue)*101325000000000300.00;
			femtopascal=(edtValue)*101325000000000300000.0;
			attopascal=(edtValue)*1.01325E+23;
			newtonsm=(edtValue)*101325;
			newtonscm=(edtValue)*10.1325;
			newtonsmm=(edtValue)*0.101325;
			kilonewtonsm=(edtValue)*101.325;
			bar=(edtValue)*1.01325;
			mbar=(edtValue)*1013.25;
			microbar=(edtValue)*1013250;
			dynescm=(edtValue)*1013250;
			kilogramforcesm=(edtValue)*10332.274528;
			kilometerforcescm=(edtValue)*1.0332274528;
			kilometersmm=(edtValue)*0.0103322745;
			gramforcescm=(edtValue)*1033.2274528;
			tonforceshortsfoot=(edtValue)*1.0581083118;
			tonforceshortsinch=(edtValue)*0.0073479744;
			tonforcelongsfoot=(edtValue)*0.9447395641;
			tonforcelongsinch=(edtValue)*0.0065606914;
			kipforcesinch=(edtValue)*0.0146959488;
			ksi=(edtValue)*0.0146959488;
			poundforcesfoot=(edtValue)*2116.2166237;
			poundforcesinch=(edtValue)*14.695948775;
			psi=(edtValue)*14.695948775;
			poundalsfoot=(edtValue)*68087.256406;
			torr=(edtValue)*760;
			cmmercury=(edtValue)*76.000210018;
			milimeterofmercury=(edtValue)*760.00210018;
			inchmercury=(edtValue)*29.921331924;
			cmwater=(edtValue)*1033.2559008;
			mmwater=(edtValue)*10332.559008;
			inchwaterc=(edtValue)*406.79374664;
			footwaterc=(edtValue)*33.899524252;
			inchwaterf=(edtValue)*407.18444963;
			footwaterf=(edtValue)*33.932037469;
			atomspheretechnical=(edtValue)*1.0332274528;
			atmospherestandard=(edtValue)*1;
				
			 break;	  	 	 	 	 
			 
 			 
   			 
   			 
		}
				results.setKilopascal(kilopascal);
				results.setPascal(pascal);
				results.setExapascal(exapascal);
				results.setPetapascal(petapascal);
				results.setTerapascal(terapascal);
				results.setGigapascal(gigapascal);
				results.setMegapascal(megapascal);
				results.setHectopascal(hectopascal);
				results.setDekapascal(dekapascal);
				results.setDecipascal(decipascal);
				results.setCentipascal(centipascal);
				results.setMilipascal(milipascal);
				results.setMicropascal(micropascal);
				results.setNanopascal(nanopascal);
				results.setPicopascal(picopascal);
				results.setFemtopascal(femtopascal);
				results.setAttopascal(attopascal);
				results.setNewtonsm(kilonewtonsm);
				results.setNewtonscm(newtonscm);
				results.setNewtonsmm(newtonsmm);
				results.setKilonewtonsm(kilonewtonsm);
				results.setBar(bar);
				results.setMbar(mbar);
				results.setMicrobar(microbar);
				results.setDynescm(dynescm);
				results.setKilogramforcesm(kilogramforcesm);
				results.setKilometerforcescm(kilometerforcescm);
				results.setKilometersmm(kilometersmm);
				results.setGramforcescm(gramforcescm);
				results.setTonforceshortsfoot(tonforceshortsfoot);
				results.setTonforceshortsinch(tonforceshortsinch);
				results.setTonforcelongsfoot(tonforcelongsfoot);
				results.setTonforcelongsinch(tonforcelongsinch);
				results.setKipforcesinch(kipforcesinch);
				results.setKsi(ksi);
				results.setPoundforcesfoot(poundforcesfoot);
				results.setPoundforcesinch(poundforcesinch);
				results.setPoundalsfoot(poundalsfoot);
				results.setTorr(torr);
				results.setCmmercury(cmmercury);
				results.setMilimeterofmercury(milimeterofmercury);
				results.setInchmercury(inchmercury);
				results.setCmwater(cmwater);
				results.setMmwater(mmwater);
				results.setInchwaterc(inchwaterc);
				results.setFootwaterc(footwaterc);
				results.setInchwaterf(inchwaterf);
				results.setFootwaterf(footwaterf);
				results.setAtomspheretechnical(atomspheretechnical);
				results.setAtmospherestandard(atmospherestandard);
				
				 angleArray.add(results);
		    	 return angleArray;
		    }
			
			 public class ConversionResults{
	   			   
				 private double kilopascal,pascal,exapascal,petapascal,terapascal,gigapascal,megapascal,hectopascal,dekapascal,decipascal,centipascal,milipascal,micropascal,nanopascal,picopascal,femtopascal,attopascal,newtonsm,
					newtonscm,newtonsmm,kilonewtonsm,bar,mbar,microbar,dynescm,kilogramforcesm,kilometerforcescm,kilometersmm,gramforcescm,tonforceshortsfoot,tonforceshortsinch,tonforcelongsfoot,tonforcelongsinch,kipforcesinch,ksi,poundforcesfoot,poundforcesinch,
					psi,poundalsfoot,torr,cmmercury,milimeterofmercury,inchmercury,cmwater,mmwater,inchwaterc,footwaterc,inchwaterf,footwaterf,atomspheretechnical,atmospherestandard;

				public double getKilopascal() {
					return kilopascal;
				}

				public void setKilopascal(double kilopascal) {
					this.kilopascal = kilopascal;
				}

				public double getPascal() {
					return pascal;
				}

				public void setPascal(double pascal) {
					this.pascal = pascal;
				}

				public double getExapascal() {
					return exapascal;
				}

				public void setExapascal(double exapascal) {
					this.exapascal = exapascal;
				}

				public double getPetapascal() {
					return petapascal;
				}

				public void setPetapascal(double petapascal) {
					this.petapascal = petapascal;
				}

				public double getTerapascal() {
					return terapascal;
				}

				public void setTerapascal(double terapascal) {
					this.terapascal = terapascal;
				}

				public double getGigapascal() {
					return gigapascal;
				}

				public void setGigapascal(double gigapascal) {
					this.gigapascal = gigapascal;
				}

				public double getMegapascal() {
					return megapascal;
				}

				public void setMegapascal(double megapascal) {
					this.megapascal = megapascal;
				}

				public double getHectopascal() {
					return hectopascal;
				}

				public void setHectopascal(double hectopascal) {
					this.hectopascal = hectopascal;
				}

				public double getDekapascal() {
					return dekapascal;
				}

				public void setDekapascal(double dekapascal) {
					this.dekapascal = dekapascal;
				}

				public double getDecipascal() {
					return decipascal;
				}

				public void setDecipascal(double decipascal) {
					this.decipascal = decipascal;
				}

				public double getCentipascal() {
					return centipascal;
				}

				public void setCentipascal(double centipascal) {
					this.centipascal = centipascal;
				}

				public double getMilipascal() {
					return milipascal;
				}

				public void setMilipascal(double milipascal) {
					this.milipascal = milipascal;
				}

				public double getMicropascal() {
					return micropascal;
				}

				public void setMicropascal(double micropascal) {
					this.micropascal = micropascal;
				}

				public double getNanopascal() {
					return nanopascal;
				}

				public void setNanopascal(double nanopascal) {
					this.nanopascal = nanopascal;
				}

				public double getPicopascal() {
					return picopascal;
				}

				public void setPicopascal(double picopascal) {
					this.picopascal = picopascal;
				}

				public double getFemtopascal() {
					return femtopascal;
				}

				public void setFemtopascal(double femtopascal) {
					this.femtopascal = femtopascal;
				}

				public double getAttopascal() {
					return attopascal;
				}

				public void setAttopascal(double attopascal) {
					this.attopascal = attopascal;
				}

				public double getNewtonsm() {
					return newtonsm;
				}

				public void setNewtonsm(double newtonsm) {
					this.newtonsm = newtonsm;
				}

				public double getNewtonscm() {
					return newtonscm;
				}

				public void setNewtonscm(double newtonscm) {
					this.newtonscm = newtonscm;
				}

				public double getNewtonsmm() {
					return newtonsmm;
				}

				public void setNewtonsmm(double newtonsmm) {
					this.newtonsmm = newtonsmm;
				}

				public double getKilonewtonsm() {
					return kilonewtonsm;
				}

				public void setKilonewtonsm(double kilonewtonsm) {
					this.kilonewtonsm = kilonewtonsm;
				}

				public double getBar() {
					return bar;
				}

				public void setBar(double bar) {
					this.bar = bar;
				}

				public double getMbar() {
					return mbar;
				}

				public void setMbar(double mbar) {
					this.mbar = mbar;
				}

				public double getMicrobar() {
					return microbar;
				}

				public void setMicrobar(double microbar) {
					this.microbar = microbar;
				}

				public double getDynescm() {
					return dynescm;
				}

				public void setDynescm(double dynescm) {
					this.dynescm = dynescm;
				}

				public double getKilogramforcesm() {
					return kilogramforcesm;
				}

				public void setKilogramforcesm(double kilogramforcesm) {
					this.kilogramforcesm = kilogramforcesm;
				}

				public double getKilometerforcescm() {
					return kilometerforcescm;
				}

				public void setKilometerforcescm(double kilometerforcescm) {
					this.kilometerforcescm = kilometerforcescm;
				}

				public double getKilometersmm() {
					return kilometersmm;
				}

				public void setKilometersmm(double kilometersmm) {
					this.kilometersmm = kilometersmm;
				}

				public double getGramforcescm() {
					return gramforcescm;
				}

				public void setGramforcescm(double gramforcescm) {
					this.gramforcescm = gramforcescm;
				}

				public double getTonforceshortsfoot() {
					return tonforceshortsfoot;
				}

				public void setTonforceshortsfoot(double tonforceshortsfoot) {
					this.tonforceshortsfoot = tonforceshortsfoot;
				}

				public double getTonforceshortsinch() {
					return tonforceshortsinch;
				}

				public void setTonforceshortsinch(double tonforceshortsinch) {
					this.tonforceshortsinch = tonforceshortsinch;
				}

				public double getTonforcelongsfoot() {
					return tonforcelongsfoot;
				}

				public void setTonforcelongsfoot(double tonforcelongsfoot) {
					this.tonforcelongsfoot = tonforcelongsfoot;
				}

				public double getTonforcelongsinch() {
					return tonforcelongsinch;
				}

				public void setTonforcelongsinch(double tonforcelongsinch) {
					this.tonforcelongsinch = tonforcelongsinch;
				}

				public double getKipforcesinch() {
					return kipforcesinch;
				}

				public void setKipforcesinch(double kipforcesinch) {
					this.kipforcesinch = kipforcesinch;
				}

				public double getKsi() {
					return ksi;
				}

				public void setKsi(double ksi) {
					this.ksi = ksi;
				}

				public double getPoundforcesfoot() {
					return poundforcesfoot;
				}

				public void setPoundforcesfoot(double poundforcesfoot) {
					this.poundforcesfoot = poundforcesfoot;
				}

				public double getPoundforcesinch() {
					return poundforcesinch;
				}

				public void setPoundforcesinch(double poundforcesinch) {
					this.poundforcesinch = poundforcesinch;
				}

				public double getPsi() {
					return psi;
				}

				public void setPsi(double psi) {
					this.psi = psi;
				}

				public double getPoundalsfoot() {
					return poundalsfoot;
				}

				public void setPoundalsfoot(double poundalsfoot) {
					this.poundalsfoot = poundalsfoot;
				}

				public double getTorr() {
					return torr;
				}

				public void setTorr(double torr) {
					this.torr = torr;
				}

				public double getCmmercury() {
					return cmmercury;
				}

				public void setCmmercury(double cmmercury) {
					this.cmmercury = cmmercury;
				}

				public double getMilimeterofmercury() {
					return milimeterofmercury;
				}

				public void setMilimeterofmercury(double milimeterofmercury) {
					this.milimeterofmercury = milimeterofmercury;
				}

				public double getInchmercury() {
					return inchmercury;
				}

				public void setInchmercury(double inchmercury) {
					this.inchmercury = inchmercury;
				}

				public double getCmwater() {
					return cmwater;
				}

				public void setCmwater(double cmwater) {
					this.cmwater = cmwater;
				}

				public double getMmwater() {
					return mmwater;
				}

				public void setMmwater(double mmwater) {
					this.mmwater = mmwater;
				}

				public double getInchwaterc() {
					return inchwaterc;
				}

				public void setInchwaterc(double inchwaterc) {
					this.inchwaterc = inchwaterc;
				}

				public double getFootwaterc() {
					return footwaterc;
				}

				public void setFootwaterc(double footwaterc) {
					this.footwaterc = footwaterc;
				}

				public double getInchwaterf() {
					return inchwaterf;
				}

				public void setInchwaterf(double inchwaterf) {
					this.inchwaterf = inchwaterf;
				}

				public double getFootwaterf() {
					return footwaterf;
				}

				public void setFootwaterf(double footwaterf) {
					this.footwaterf = footwaterf;
				}

				public double getAtomspheretechnical() {
					return atomspheretechnical;
				}

				public void setAtomspheretechnical(double atomspheretechnical) {
					this.atomspheretechnical = atomspheretechnical;
				}

				public double getAtmospherestandard() {
					return atmospherestandard;
				}

				public void setAtmospherestandard(double atmospherestandard) {
					this.atmospherestandard = atmospherestandard;
				}

			 }
			
					
				 

}
