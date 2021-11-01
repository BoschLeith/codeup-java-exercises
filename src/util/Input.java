package util;

import java.util.Scanner;

public class Input {
	private Scanner scanner;

	public Input(){
		this.scanner = new Scanner(System.in);
	}

	public String getString(){
//		System.out.print("Enter a string: ");
		return this.scanner.nextLine();
	}

	public boolean yesNo(){
		System.out.print("Enter YES or NO: ");
		String userInput = this.scanner.nextLine();
		return userInput.equalsIgnoreCase("Y") || userInput.equalsIgnoreCase("Yes");
	}

	public int getInt(int min, int max){
		System.out.printf("Enter a number between %d and %d: ", min, max);
		int userInput = this.scanner.nextInt();

		if (userInput >= min && userInput <= max){
			System.out.printf("%d is between %d and %d\n", userInput, min, max);
			return userInput;
		}
		System.out.printf("%d is not between %d and %d. Try again.\n", userInput, min, max);
		return getInt(min, max);
	}

	public int getInt(){
//		System.out.print("Enter an integer: ");
		int userInput = Integer.parseInt(this.scanner.nextLine());
//		System.out.printf("Your integer is: %d\n", userInput);
		return userInput;
	}

	public double getDouble(double min, double max){
		System.out.printf("Enter a number between %.2f and %.2f: ", min,  max);
		double userInput = this.scanner.nextDouble();

		if (userInput >= min && userInput <= max){
			System.out.printf("%.2f is between %.2f and %.2f\n", userInput, min, max);
			return userInput;
		}
		System.out.printf("%.2f is not between %.2f and %.2f. Try again.\n", userInput, min, max);
		return getDouble(min, max);
	}

	public double getDouble(){
//		System.out.print("Enter a double: ");
//		System.out.printf("Your double is: %.2f\n", userInput);
		return this.scanner.nextDouble();
	}
}
