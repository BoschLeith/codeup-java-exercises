package util;

public class InputTest {
	public static void main(String[] args) {
		Input input = new Input();

		System.out.println("You entered: " + input.getString());
		System.out.println(input.yesNo());
		input.getInt(1,10);
		input.getInt();
		input.getDouble(.01, 10);
		input.getDouble();
	}
}
