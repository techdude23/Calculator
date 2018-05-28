import java.util.Scanner;

public class Calculator {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("--- Calculator ---");
		System.out.println("How would you like to calculate your numbers?");
		System.out.println("[1] Add\n[2] Subtract\n[3] Multiply\n[4] Divide");
		
		int choice = input.nextInt();
		while(choice < 1 || choice > 4) {
			System.out.println("Please enter a valid choice.");
			choice = input.nextInt();
		}
				
		System.out.println("What two numbers are you calculating?");
		System.out.print("Number 1: ");
		float num1 = input.nextFloat();
		
		System.out.print("Number 2: ");
		float num2 = input.nextFloat();
		
		if(choice == 1) {
			// Adding
			System.out.println("You chose to add " + num1 + " and " + num2);
			System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
			
		} else if(choice == 2) {
			// Subtracting
			System.out.println("You chose to subtract " + num1 + " and " + num2);
			System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
			
		} else if(choice == 3) {
			// Multiplying
			System.out.println("You chose to multiply " + num1 + " and " + num2);
			System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
			
		} else if(choice == 4) {
			// Dividing
			System.out.println("You chose to divide " + num1 + " and " + num2);
			System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));
			
		} else {
			// Invalid Inputs
			System.out.println("Please enter a valid choice.");
		}
	}
	
	public static float add(float a, float b) {
		return a + b;
	}
	
	public static float subtract(float a, float b) {
		return a - b;
	}
	
	public static float multiply(float a, float b) {
		return a * b;
	}
	
	public static float divide(float a, float b) {
		return a / b;
	}
	
}
