package läxa;

public enum GasTable {

	AIR(1.29, 1.01), 
	O2(1.43, 0.92), 
	klor(3.21, 0.5),
	argon(1.78, 0.52),
	metan(0.72, 2.21);

	double density;
	double heatCapacity;

	GasTable(double d, double hc) {
		density = d;
		heatCapacity = hc * 1E3; // 1E3 = 1*10^3
	}
}
