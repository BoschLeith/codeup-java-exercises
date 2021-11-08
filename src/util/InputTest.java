package util;

public class InputTest {
	public static void main(String[] args) {
		Input input = new Input();

		System.out.println("Enter an integer");
		int userInt = input.getInt();
		System.out.printf("Your integer is: %d%n", userInt);
		input.getDouble();
	}
}
