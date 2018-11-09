package läxa;

import läxa.methoder;

public class svar_på_frågor {
	public static void main(String[] args) {
		System.out.print("Hur mycket väger 80 dm^3 järn?"); //fråga 1
		System.out.println(methoder.volumeToMass(SolidTable.IRON, 0.08)); // svar 1
		System.out.println();
		
		System.out.println("Hur långt hinner Tomas om han löper med medelhastigheten 2.8 m/s i 60 minuter?"); //fråga 2
		System.out.println(methoder.svtDistance(2.8, 3600)); //svar 2
		System.out.println();
		
		System.out.println("Hur mycket energi krävs för att värma upp 5 liter vatten?"); //fråga3
		System.out.println(methoder.heat(FluidTable.H20, 5, 100)); //svar 3
		System.out.println();
		
		System.out.println("Hur stort är det totala trycket 100 meter under havsytan?"); // fråga 4
		System.out.println(methoder.pressureUnderWater(100)); //svar 4
		System.out.println();
		
		System.out.println("Tomas som är 180cm lång kastar upp en boll med massan 200 gram i luften så den får starthastigheten 50 km/h. Hur högt kommer bollen?"); //fråga 5
		System.out.println(Math.pow(Math.sin(90), 2) * methoder.velocityToHeight(50/3.6) + 1.8); //svar 5
		System.out.println();
		
		System.out.println("En bil med massan 740kg accelererar från 0-100 på 4.4 sekunder. Hur stor effekt har bilens motor uppnått?"); //fråga 6
		System.out.println(methoder.CarEffect(740, 0, 100, 4.4)); //svar 6
		System.out.println();
		
		System.out.println("En studsboll släpps från 10 meters höjd och varje gång den nuddar marken tappar den 1% av sin energi. Hur många gånger kommer bollen studsa i marken innan den inte studsar hörge än 0.5 meter?"); //fråga 7
		System.out.println(methoder.Bounce(10, 0.01, 0.5)); //svar 7
		System.out.println();
		
		System.out.println("om en silver kub med längden 7cm accelererar med 7.5 m/s hur stor blir kraften"); //fråga 8
		System.out.println(methoder.FMAforce(methoder.volumeToMass(SolidTable.silver, methoder.volume(7)), 7.5)); //svar 8
		System.out.println();
		
		System.out.println("om en boll rör sig med hastigheten 20 km/h hur lång tid tar det för den att förflyta sig 745m"); //fråga 9
		System.out.println(methoder.svtTime(745, methoder.KMHtoMS(20))); //svar 9
		System.out.println();
		
		System.out.println("om spänningen är 30V och resistancen är 900 - 300 vad blir strömmen"); //fråga 10
		System.out.println(methoder.current(30, 600)); //svar 10
		System.out.println();
	}
	
}
