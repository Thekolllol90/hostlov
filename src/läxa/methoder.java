package l�xa;

public class methoder {
	public static void main(String[] args) {
		}
	/**
	 * g�r om fahrenhit till celsius
	 * @param fahrenheit graderna man vill g�ra om 
	 * @return Celsius �r resultatet utav konventeringen 
	 */
	public static double fahrenheitToCelsius(double fahrenheit){ 
		double Celsius = (fahrenheit-32)*(0.5556);
		return Celsius;
	} 
	/**
	 * g�r om kelvin till celsius
	 * @param kelvin graderna man vill g�ra om 
	 * @return Celsius �r resultatet
	 */
	public static double kelvinToCelsius(double kelvin){
		double Celsius = kelvin - 273.15;
		return Celsius;
	}
	/**
	 * r�knar trycket p� visst djup
	 * @param fluid v�tskan man vill r�kna med
	 * @param deep djupet 
	 * @return Pressure trycket som blir 
	 */
	public static double fluidPressure(FluidTable fluid , double deep){  
		double Pressure = fluid.density * deep * 9.82; 
		return Pressure;
	}
	/**
	 * r�knar trycket p� vatten 
	 * @param deep djupet som man vill veta trycket p�	
	 * @return Pressure trycket fr�n vatten 
	 */
	public static double pressureUnderWater(double deep){
		double Pressure = 0.998 * deep * 9.82;
		return Pressure;
		}
	/**
	 * r�cknar ut enegin ett f�rem�lsom r�r sig har
	 * @param mass massan p� f�rem�let
	 * @param velocity hastigheten p� f�rem�let
	 * @return Enegry energin som f�rm�let har
	 */
	public static double kineticEnergy(double mass, double velocity){
		double Energy = 0.5 * mass * (velocity * velocity);
		return Energy;
	}
	/**
	 * r�knar ut den potensiella enegin som ett f�rm�l har
	 * @param mass massan p� f�rem�let
	 * @param height h�jden som f�rem�let befinner sig p�
	 * @return Energy den potensiela enegin som f�rem�let har
	 */
	public static double potentialEnergy(double mass, double height){ 
		double Energy = mass * height * konstanter.g_swe;
		return Energy;
	}
	/**
	 * r�knar ut hastigheten ett falande f�rm�l kommer att ha
	 * @param height h�jden som f�rem�let befinner sig p�
	 * @return Speed f�rem�lets hastighet
	 */
	public static double fallSpeed(double height){ 
		double Speed = Math.sqrt(2 * konstanter.g_swe * height);
		return Speed;
	}
	/**
	 * skillnaden mellan tv� tal
	 * @param first f�rsta tallet 
	 * @param last andra tallet 
	 * @return skillnaden
	 */
	public static double delta(double first, double last){  
		double delta = last - first;
		return delta;
	}
	/**
	 * r�knar ut massa p� ett v�tska
	 * @param fluid v�tskan man vill r�kna med
	 * @param volume volumen som v�tskan har
	 * @return Mass massan som v�tskan har
	 */
	public static double volumeToMass(FluidTable fluid, double volume){ 
		double Mass = volume * fluid.density;
		return Mass;
	}
	/**
	 * r�knar ut massan p� en gas
	 * @param gas gasen man vill r�kna med
	 * @param volume volumen som gasen har
	 * @return Mass massan p� gasen
	 */
	public static double volumeToMass(GasTable gas, double volume){ 
		double Mass = volume * gas.density;
		return Mass;
	}
	/**
	 * r�kar ut massan p� ett fast �mne
	 * @param solid �mnet man vill anv�nda
	 * @param volume volumen som �mnet har
	 * @return Mass massan p� �mnet
	 */
	public static double volumeToMass(SolidTable solid, double volume){ 
		double Mass = volume * solid.density;
		return Mass;
		}
	/**
	 * r�knar ut medel hastighetetn
	 * @param distance sistancen som f�rem�let har flyttat sig
	 * @param time tiden f�rem�let har flyttat sig p�
	 * @return hastigheten som f�rem�let har
	 */
	public static double svtVelocity(double distance, double time){
		double Velocity = distance / time;
		return Velocity;
	}
	/**
	 * r�knar ut distancen ett f�rem�l har flyttat sig 
	 * @param velocity hastigheten som f�rem�let har
	 * @param time tiden det tog f�r f�rem�let att flytta sig
	 * @return distanen f�rem�let flyttat sig
	 */
	public static double svtDistance(double velocity, double time){
		double Distance = time * velocity;
		return Distance;
		}
	/**
	 * r�knar ut tiden det tar f�r ett f�rem�l att flytta sig
	 * @param distance distancen som f�rem�let flyttat sig
	 * @param velocity hastigheten som f�rem�let flyttat sig
	 * @return tiden det tog f�r f�rem�let
	 */
	public static double svtTime(double distance, double velocity){
		double Time = velocity * distance; 
		return Time;
	}
	/**
	 * r�knar ut arbetet som kr�vs f�r att flytta ett f�rem�l
	 * @param force kraften man trycker med
	 * @param distance hur l�ngt f�rem�let ska flyttas
	 * @return arbetet som kr�vs
	 */
	public static double work(double force, double distance){
		double work = force * distance; 
		return work;
	}
	/**
	 * r�knar ut kraften som 
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
	 * r�knar ut hur h�gt n�got kommer
	 * @param velocity hastigheten som f�rem�let har
	 * @return h�jden som f�rem�let n�r
	 */
	public static double velocityToHeight(double velocity) {
		double Height = (velocity*velocity) / (2*konstanter.g_swe);
		return Height;
	}
}
