package mainPackage;

public class Main {

	public static void main(String[] args) {
		 
		   //********************************************
		   //Calculator class
		   Calculator calc = new Calculator();
		   System.out.println("");
	        // Perform some calculations using the Calculator methods
	        int num1 = 20;
	        int num2 = 5;
	        
	        int addition = calc.add(num1, num2);
	        System.out.println("Addion is: "+addition);
	        
	        int subtract = calc.subtract(num1, num2);
	        System.out.println("Subtraction is: "+subtract);
	        
	        int multiply = calc.multiply(num1, num2);
	        System.out.println("Multiplication is: "+multiply);
	        
	        int division = calc.add(num1, num2);
	        System.out.println("Division is: "+division);
	        
	        int squar = calc.add(num1, num2);
	        System.out.println("Squar is: "+squar);
	        System.out.println("===== END OF CALCULATOR CLASS ======");
	        //End of calculator class.
	        
	        // Magical calculator class
	        MagicalCalculator magicCalculator = new MagicalCalculator();

	        double num = 16.0;

	        double squareRootResult = magicCalculator.squareRoot(num);
	        System.out.println("Square Root of " + num + ": " + squareRootResult);

	        double sinResult = magicCalculator.sin(num);
	        System.out.println("Sin(" + num + "): " + sinResult);

	        double cosResult = magicCalculator.cos(num);
	        System.out.println("Cos(" + num + "): " + cosResult);

	        double tanResult = magicCalculator.tan(num);
	        System.out.println("Tan(" + num + "): " + tanResult);

	        int factorialResult = (int) magicCalculator.factorial(5);
	        System.out.println("Factorial of 5: " + factorialResult);
	}

}
