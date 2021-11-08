package util;

import java.util.Scanner;

public class Input {
	private final Scanner scanner;

	public Input(){
		this.scanner = new Scanner(System.in);
	}

	public String getString(){
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
		try{
			return Integer.parseInt(getString());
		} catch (NumberFormatException e){
			System.out.println("Given input cannot be parsed as an int");
			System.out.println("Enter an integer");
//			e.printStackTrace();
			return getInt();
		}
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
		try{
			return Double.parseDouble(getString());
		} catch (NumberFormatException e){
			System.out.println("Given input cannot be parsed as an double");
			e.printStackTrace();
			return getDouble();
		}
	}
}
