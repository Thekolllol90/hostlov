package l�xa;

import l�xa.methoder;

public class svar_p�_fr�gor {
	public static void main(String[] args) {
		System.out.print("80dm^3");
		System.out.println(methoder.volumeToMass(SolidTable.IRON, 0.08)); // fr�ga 1
		
		System.out.println("2.8m/s i 60min");
		System.out.println(methoder.svtDistance(2.8, 3600)); //fr�ga 2
		
		System.out.println("5liter vatten");
		System.out.println(methoder.heat(FluidTable.H20, 5, 100)); //fr�ga 3
		
		System.out.println("100m under vatten");
		System.out.println(methoder.pressureUnderWater(100)); //fr�ga 4
		
		System.out.println("50km/h rakt upp");
		System.out.println(Math.pow(Math.sin(90), 2) * methoder.velocityToHeight(50/3.6) + 1.8); //fr�ga 5
		
		System.out.println("740kg 0-100 4,4s");
		System.out.println(methoder.power(methoder.delta(methoder.kineticEnergy(740, 0),methoder.kineticEnergy(740, (100/3.6))), 4.4)); //fr�ga 6
		
		System.out.println("10m boll");
		double y = 10.0;
        int i = 0;

        while (y > 0.5) {
            y = y * 0.99;
            i++;
        }
        double result = 0;
        result = i; 
		
		
		System.out.println(result); //fr�ga 7
		
		System.out.println("om en silver kub med l�ngden 7cm accelererar med 7.5 m/s hur stor blir kraften");
		System.out.println(methoder.FMAforce(methoder.volumeToMass(SolidTable.silver, methoder.volume(7)), 7.5)); //fr�ga 8
		
		System.out.println("om en boll r�r sig med hastigheten 20 km/h hur l�ng tid tar det f�r den att f�rflyta sig 745m");
		System.out.println(methoder.svtTime(745, methoder.KMHtoMS(20))); //fr�ga 9
		
		System.out.println("om sp�nningen �r 30V och resistancen �r 900 - 300 vad blir str�mmen");
		System.out.println(methoder.current(30, 600));
	}
	
}
