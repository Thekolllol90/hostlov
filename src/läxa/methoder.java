package läxa;

public class methoder {
	public static void main(String[] args) {
		}
	/**
	 * gör om fahrenhit till celsius
	 * @param fahrenheit graderna man vill göra om 
	 * @return Celsius är resultatet utav konventeringen 
	 */
	public static double fahrenheitToCelsius(double fahrenheit){ 
		double Celsius = (fahrenheit-32)*(0.5556);
		return Celsius;
	} 
	/**
	 * gör om kelvin till celsius
	 * @param kelvin graderna man vill göra om 
	 * @return Celsius är resultatet
	 */
	public static double kelvinToCelsius(double kelvin){
		double Celsius = kelvin - 273.15;
		return Celsius;
	}
	/**
	 * räknar trycket på visst djup
	 * @param fluid vätskan man vill räkna med
	 * @param deep djupet 
	 * @return Pressure trycket som blir 
	 */
	public static double fluidPressure(FluidTable fluid , double deep){  
		double Pressure = fluid.density * deep * 9.82; 
		return Pressure;
	}
	/**
	 * räknar trycket på vatten 
	 * @param deep djupet som man vill veta trycket på	
	 * @return Pressure trycket från vatten 
	 */
	public static double pressureUnderWater(double deep){
		double Pressure = 0.998 * deep * 9.82;
		return Pressure;
		}
	/**
	 * räcknar ut enegin ett föremålsom rör sig har
	 * @param mass massan på föremålet
	 * @param velocity hastigheten på föremålet
	 * @return Enegry energin som förmålet har
	 */
	public static double kineticEnergy(double mass, double velocity){
		double Energy = 0.5 * mass * (velocity * velocity);
		return Energy;
	}
	/**
	 * räknar ut den potensiella enegin som ett förmål har
	 * @param mass massan på föremålet
	 * @param height höjden som föremålet befinner sig på
	 * @return Energy den potensiela enegin som föremålet har
	 */
	public static double potentialEnergy(double mass, double height){ 
		double Energy = mass * height * konstanter.g_swe;
		return Energy;
	}
	/**
	 * räknar ut hastigheten ett falande förmål kommer att ha
	 * @param height höjden som föremålet befinner sig på
	 * @return Speed föremålets hastighet
	 */
	public static double fallSpeed(double height){ 
		double Speed = Math.sqrt(2 * konstanter.g_swe * height);
		return Speed;
	}
	/**
	 * skillnaden mellan två tal
	 * @param first första tallet 
	 * @param last andra tallet 
	 * @return skillnaden
	 */
	public static double delta(double first, double last){  
		double delta = last - first;
		return delta;
	}
	/**
	 * räknar ut massa på ett vätska
	 * @param fluid vätskan man vill räkna med
	 * @param volume volumen som vätskan har
	 * @return Mass massan som vätskan har
	 */
	public static double volumeToMass(FluidTable fluid, double volume){ 
		double Mass = volume * fluid.density;
		return Mass;
	}
	/**
	 * räknar ut massan på en gas
	 * @param gas gasen man vill räkna med
	 * @param volume volumen som gasen har
	 * @return Mass massan på gasen
	 */
	public static double volumeToMass(GasTable gas, double volume){ 
		double Mass = volume * gas.density;
		return Mass;
	}
	/**
	 * räkar ut massan på ett fast ämne
	 * @param solid ämnet man vill använda
	 * @param volume volumen som ämnet har
	 * @return Mass massan på ämnet
	 */
	public static double volumeToMass(SolidTable solid, double volume){ 
		double Mass = volume * solid.density;
		return Mass;
		}
	/**
	 * räknar ut medel hastighetetn
	 * @param distance sistancen som föremålet har flyttat sig
	 * @param time tiden föremålet har flyttat sig på
	 * @return hastigheten som föremålet har
	 */
	public static double svtVelocity(double distance, double time){
		double Velocity = distance / time;
		return Velocity;
	}
	/**
	 * räknar ut distancen ett föremål har flyttat sig 
	 * @param velocity hastigheten som föremålet har
	 * @param time tiden det tog för föremålet att flytta sig
	 * @return distanen föremålet flyttat sig
	 */
	public static double svtDistance(double velocity, double time){
		double Distance = time * velocity;
		return Distance;
		}
	/**
	 * räknar ut tiden det tar för ett föremål att flytta sig
	 * @param distance distancen som föremålet flyttat sig
	 * @param velocity hastigheten som föremålet flyttat sig
	 * @return tiden det tog för föremålet
	 */
	public static double svtTime(double distance, double velocity){
		double Time = velocity * distance; 
		return Time;
	}
	/**
	 * räknar ut arbetet som krävs för att flytta ett föremål
	 * @param force kraften man trycker med
	 * @param distance hur långt föremålet ska flyttas
	 * @return arbetet som krävs
	 */
	public static double work(double force, double distance){
		double work = force * distance; 
		return work;
	}
	/**
	 * räknar ut kraften som 
	 * @param work
	 * @param time
	 * @return
	 */
	public static double power(double work, double time){
		double power = work / time;
		return power;
	}
	
	public static double heat(SolidTable solid, double mass, double deltaT){
		double heat = solid.heatCapacity * mass * deltaT;
		return heat;
	}
	
	public static double heat(FluidTable fluid, double volume, double deltaT){
		double heat = fluid.heatCapacity * volume * deltaT;
		return heat;
	}
	
	public static double heat(GasTable gas, double volume, double deltaT){
		double heat = gas.heatCapacity * volume * deltaT;
		return heat;
	}
	/**
	 * räknar ut hur högt något kommer
	 * @param velocity hastigheten som föremålet har
	 * @return höjden som föremålet når
	 */
	public static double velocityToHeight(double velocity) {
		double Height = (velocity*velocity) / (2*konstanter.g_swe);
		return Height;
	}
}
