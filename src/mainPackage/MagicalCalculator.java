package mainPackage;

/* Create a MagicCalculator that inherits its basic functionality from your calculator
 * and does the following functions:
 * Finds the square root of a number
 * Finds the sin (trigonometry) of a number. [Note: Feel free to use the MATH class]
 * Finds the cosine (trigonometry) of a number. [Note: Feel free to use the MATH class]
 * Finds the tangent (trigonometry) of a number. [Note: Feel free to use the MATH class]
 * Finds the factorial (!) of the number*/
public class MagicalCalculator extends Calculator {

	// empty constructor
	public MagicalCalculator() {
		super(); // this inherits the calculator constructor
	}
	public double squareRoot(double num) {
		return Math.sqrt(num);
	}
	//find the sin of a number
	public double sin(double num) {
		return Math.sin(num);
	}
	//Finds the cosine
	public double cos(double num) {
		return Math.cos(num);
	}
	//Finds the tangent
	public double tan(double num) {
		return Math.tan(num);
	}
	//Finds the factorial
	public double factorial(double num) {
		if(num < 0) {
			throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
		}
		if(num == 0 || num == 1) {
			return 1;
		}
		int result = 1;
		for(int i =2; i < num; i++) {
			result = result * i;
		}
		return result;
	}
	
	
	
	
}
