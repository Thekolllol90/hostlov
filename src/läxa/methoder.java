package läxa;

public class methoder {
	public static void main(String[] args) {
		}
	
	public static double fahrenheitToCelsius(double fahrenheit){
		double Celsius = (fahrenheit-32)*(0.5556);
		return Celsius;
	} 
		
	public static double kelvinToCelsius(double kelvin){
		double Celsius = kelvin - 273.15;
		return Celsius;
	}
	
	public static double fluidPressure(FluidTable fluid , double deep){  
		double Pressure = fluid.density * deep * 9.82; 
		return Pressure;
	}
	
	public static double pressureUnderWater(double deep){
		double Pressure = 0.998 * deep * 9.82;
		return Pressure;
		}
	
	public static double kineticEnergy(double mass, double velocity){
		double Energy = 0.5 * mass * (velocity * velocity);
		return Energy;
	}
	
	public static double potentialEnergy(double mass, double height){ // kolla om rätt 
		double Energy = mass * height * 9.82;
		return Energy;
	}
	
	public static double fallSpeed(double height){  // kolla om rätt
		double Speed = 9.82 * height;
		return Speed;
	}
	
	public static double delta(double first, double last){  //kolla om rätt 
		double delta = first - last;
		return delta;
	}
	
	public static double volumeToMass(FluidTable fluid, double volume){ //kolla om rätt
		double Mass = volume * fluid.density;
		return Mass;
	}
	
	public static double volumeToMass(GasTable gas, double volume){ //kolla
		double Mass = volume * gas.density;
		return Mass;
	}
	
	public static double volumeToMass(SolidTable solid, double volume){ //kolla
		double Mass = volume * solid.density;
		return Mass;
		}

	public static double svtVelocity(double distance, double time){
		double Velocity = distance / time;
		return Velocity;
	}

	public static double svtDistance(double velocity, double time){
		double Distance = time * velocity;
		return Distance;
		}
	
	public static double svtTime(double distance, double velocity){
		double Time = velocity * distance; 
		return Time;
	}
	
	public static double work(double force, double distance){
		double work = force * distance; 
		return work;
	}
	
	public static double power(double work, double time){
		double power = work / time;
		return power;
	}
	
	public static double heat(SolidTable solid, double mass, double deltaT){
		return 0;
	}
	
	public static double heat(FluidTable fluid, double volume, double deltaT){
		return 0;
	}
	
	public static double heat(GasTable gas, double volume, double deltaT){
		return 0;
	}
	
	public static double velocityToHeight(double velocity) {	//kolla
		double Height = velocity / 9.82;
		return Height;
	}
}
