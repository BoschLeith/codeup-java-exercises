package shapes;

import util.Input;

public class CircleApp {

	public static void main(String[] args) {
		Input input = new Input();

		System.out.print("Enter the radius of a circle: ");
		double userRadius = input.getDouble();

		Circle userCircle = new Circle(userRadius);
		System.out.printf("Your circles area is = %.2f\n", userCircle.getArea());
		System.out.printf("Your circles circumference = %.2f", userCircle.getCircumference());
	}
}
