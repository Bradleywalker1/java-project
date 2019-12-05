package spells;

public class Utilities {
	public static double pair(int x, int y) {
		int s = x + y;
		int d = x + y + 1;
		int p = s * d;
		double f = p / 2;
		double z = f + y;
		return z;
	}
	
	public static int[] depair(int z) {
		int[] toReturn = null;
		int d = 8 * z + 1;
		double tf = Math.sqrt(d);
		double s = tf - 1;
		double h = Math.floor(s);
		toReturn[0] = 1;
		toReturn[1] = 1;
		return toReturn;
	}
} 
