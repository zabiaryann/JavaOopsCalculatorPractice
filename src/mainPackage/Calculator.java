package mainPackage;

//Create a Java Calculator Class that does the following five commands:
public class Calculator {
   
	
	//An add method that takes in two integer numbers and adds them together
	//the call to that method would look like this: add(int num1, int num2)
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	//A subtraction method that takes in two integers and subtracts them from 
	//one another would look like this: subtract( int num1, int num2)
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
	//A multiplication method that takes in two integer numbers and multiplies
	//them together the call to that method would look like this: multiply(int num1, int num2
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	//A division method that takes in two integer numbers and divides them the
	//call to that method would look like this: divide(int num1, int num2)
	public int division(int num1, int num2) {
		if(num2 == 0) {
		System.out.println("Division by zero is not valid!");
	}
		return num1 / num2;
		
	}
	//A square method that takes in one integer and squares it: square(int num1, int num2)*/
	public int square(int num1) {
		return num1 * num1;
	}
}
