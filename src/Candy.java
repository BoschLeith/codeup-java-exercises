// Mon Nov 1 WARM-UP
//Java WarmUp
//		Write a public class named ‘Candy’ - this class should have two public fields, both taking in a string literal as a value.
//		The first would be ‘name’ and the second will be ‘size’.
//		The class will also need two constructors - the first for if we know the name, but not the size. Your first constructor should set some kind of string literal for the size.
//		The second would be for if we know both the name and the size. This second constructor will pass through those arguments into the Candy object being instantiated.
//		BONUS:
//		Write a method for your Candy class - this method should print out a message saying:
//		“Ahh, a [name]! I see that you got the [size] of it. Sounds good! :)”

// Tue Nov 2 WARM-UP
// Java WarmUp
//		Add a description property to Candy that is an array of strings. Add a constructor that includes the description property.
// 		BONUS: Set up, in your main method, an array of Candy objects named "myBag" - iterate through the Candy objects and describe them.

import java.util.Arrays;

public class Candy {
		public String name;
		public String size;
		public String[] descriptors;

		public Candy(String candyName, String candySize){
			name = candyName;
			size = candySize;
		}

		public Candy(String candyName){
			name = candyName;
			size = "Undefined";
		}

		public Candy(String candyName, String candySize, String[] candyDescriptors){
			name = candyName;
			size = candySize;
			descriptors = candyDescriptors;
		}

		public void getInfo(){
			System.out.printf("Ahh, a %s! I see that you got the %s size of it. Sounds good!%n", name, size);
		}

		public void getDescription(){
			System.out.printf("I have a piece of %s this is %s and could be described as %s%n", name, size, Arrays.toString(descriptors));
		}

		public static void main(String[] args) {
			Candy hersey = new Candy("Hersey");
			Candy reese = new Candy("Reese's", "bite-size", new String[]{"Chocolate", "Peanut butter"});
			Candy snickers = new Candy("Snickers", "fun-size");

			System.out.println("hersey.name = " + hersey.name);
			System.out.println("hersey.size = " + hersey.size);
			hersey.getInfo();

			Candy[] myBag = {reese, hersey, snickers};
			for (Candy candy : myBag){
				candy.getDescription();
			}
		}
}
