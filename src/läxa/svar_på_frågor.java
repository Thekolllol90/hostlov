package l�xa;

import l�xa.methoder;

public class svar_p�_fr�gor {
	public static void main(String[] args) {
		System.out.print("Hur mycket v�ger 80 dm^3 j�rn?"); //fr�ga 1
		System.out.println(methoder.volumeToMass(SolidTable.IRON, 0.08)); // svar 1
		System.out.println();
		
		System.out.println("Hur l�ngt hinner Tomas om han l�per med medelhastigheten 2.8 m/s i 60 minuter?"); //fr�ga 2
		System.out.println(methoder.svtDistance(2.8, 3600)); //svar 2
		System.out.println();
		
		System.out.println("Hur mycket energi kr�vs f�r att v�rma upp 5 liter vatten?"); //fr�ga3
		System.out.println(methoder.heat(FluidTable.H20, 5, 100)); //svar 3
		System.out.println();
		
		System.out.println("Hur stort �r det totala trycket 100 meter under havsytan?"); // fr�ga 4
		System.out.println(methoder.pressureUnderWater(100)); //svar 4
		System.out.println();
		
		System.out.println("Tomas som �r 180cm l�ng kastar upp en boll med massan 200 gram i luften s� den f�r starthastigheten 50 km/h. Hur h�gt kommer bollen?"); //fr�ga 5
		System.out.println(Math.pow(Math.sin(90), 2) * methoder.velocityToHeight(50/3.6) + 1.8); //svar 5
		System.out.println();
		
		System.out.println("En bil med massan 740kg accelererar fr�n 0-100 p� 4.4 sekunder. Hur stor effekt har bilens motor uppn�tt?"); //fr�ga 6
		System.out.println(methoder.CarEffect(740, 0, 100, 4.4)); //svar 6
		System.out.println();
		
		System.out.println("En studsboll sl�pps fr�n 10 meters h�jd och varje g�ng den nuddar marken tappar den 1% av sin energi. Hur m�nga g�nger kommer bollen studsa i marken innan den inte studsar h�rge �n 0.5 meter?"); //fr�ga 7
		System.out.println(methoder.Bounce(10, 0.01, 0.5)); //svar 7
		System.out.println();
		
		System.out.println("om en silver kub med l�ngden 7cm accelererar med 7.5 m/s hur stor blir kraften"); //fr�ga 8
		System.out.println(methoder.FMAforce(methoder.volumeToMass(SolidTable.silver, methoder.volume(7)), 7.5)); //svar 8
		System.out.println();
		
		System.out.println("om en boll r�r sig med hastigheten 20 km/h hur l�ng tid tar det f�r den att f�rflyta sig 745m"); //fr�ga 9
		System.out.println(methoder.svtTime(745, methoder.KMHtoMS(20))); //svar 9
		System.out.println();
		
		System.out.println("om sp�nningen �r 30V och resistancen �r 900 - 300 vad blir str�mmen"); //fr�ga 10
		System.out.println(methoder.current(30, 600)); //svar 10
		System.out.println();
	}
	
}
