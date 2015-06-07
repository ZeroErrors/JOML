package org.joml.test;

/**
 * Utilities for testing.
 * @author Sebastian Fellner
 */
public class TestUtil {
	/**
	 * Precision for methods that do many operations, giving less accuracy.
	 */
	public static final float MANY_OPS_PRECISION_FLOAT = 0.001f;
	/**
	 * Precision for methods that do basic operations.
	 */
	public static final float STANDARD_PRECISION_FLOAT = 0.000000000000000001f;
	

	/**
	 * Precision for methods that do many operations, giving less accuracy.
	 */
	public static final double MANY_OPS_PRECISION_DOUBLE = 0.001;
	/**
	 * Precision for methods that do basic operations.
	 */
	public static final double STANDARD_PRECISION_DOUBLE = 0.000000000000000001;
	
	/**
	 * Return whether two floating point numbers are equal. They are considered equal when their difference is less than or equal to the precision.
	 * @param a the first number
	 * @param b the second number
	 * @param precision if abs(a - b) <= precision, a and b are considered equal
	 * @return whether a and b are equal
	 * @see #floatCompare(float, float, float)
	 */
	public static boolean floatEqual(float a, float b, float precision) {
		return Math.abs(a - b) <= precision;
	}
	
	/**
	 * Compare two floating point numbers. They are considered equal when their difference is less than or equal to the precision.
	 * @param a the first number
	 * @param b the second number
	 * @param precision if abs(a - b) <= precision, a and b are considered equal
	 * @return 0 if a == b, 1 if a > b, -1 if a < b
	 * @see #floatEqual(float, float, float)
	 */
	public static int floatCompare(float a, float b, float precision) {
		if (Math.abs(a - b) <= precision)
			return 0;
		else if (a > b)
			return 1;
		else
			return -1;
	}
	
	
	/**
	 * Return whether two double-precision floating point numbers are equal. They are considered equal when their difference is 
	 * less than or equal to the precision.
	 * @param a the first number
	 * @param b the second number
	 * @param precision if abs(a - b) <= precision, a and b are considered equal
	 * @return whether a and b are equal
	 * @see #floatCompare(double, double, double)
	 */
	public static boolean doubleEqual(double a, double b, double precision) {
		return Math.abs(a - b) <= precision;
	}
	
	/**
	 * Compare two double-precision floating point numbers. They are considered equal when their difference is 
	 * less than or equal to the precision.
	 * @param a the first number
	 * @param b the second number
	 * @param precision if abs(a - b) <= precision, a and b are considered equal
	 * @return 0 if a == b, 1 if a > b, -1 if a < b
	 * @see #floatEqual(double, double, double)
	 */
	public static int doubleCompare(double a, double b, double precision) {
		if (Math.abs(a - b) <= precision)
			return 0;
		else if (a > b)
			return 1;
		else
			return -1;
	}
}