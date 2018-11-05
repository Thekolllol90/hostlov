package läxa;

import java.lang.reflect.Method;

import läxa.methoder;

public class svar_på_frågor {
	public static void main(String[] args) {
		System.out.print("80dm^3");
		System.out.println(methoder.volumeToMass(SolidTable.IRON, 0.08)); // fråga 1
		
		System.out.println("2.8m/s i 60min");
		System.out.println(methoder.svtDistance(2.8, 3600)); //fråga 2
		
		System.out.println("5liter vatten");
		System.out.println(methoder.heat(FluidTable.H20, 5, 100)); //fråga 3
		
		System.out.println("100m under vatten");
		System.out.println(methoder.pressureUnderWater(100)); //fråga 4
		
		System.out.println("50km/h rakt upp");
		System.out.println(Math.pow(Math.sin(90), 2) * methoder.velocityToHeight(50/3.6) + 1.8); //fråga 5
		
		System.out.println("740kg 0-100 4,4s");
		double mass = 740;
        double time = 4.4;
        double velocity = 100 / 3.6;
        double acc = velocity / 4.4;
        double force = mass * acc;
        double work = methoder.work(force, methoder.svtDistance(velocity, time));
        double power = methoder.power(work, time);
        double result = power;
		System.out.println(result); //fråga 6
		
		System.out.println("10m boll");
		double y = 10.0;
        int i = 0;

        while (y > 0.5) {
            y = y * 0.99;
            i++;
        }

        result = (double)i; 
		
		
		System.out.println(result);
		
	}
}
