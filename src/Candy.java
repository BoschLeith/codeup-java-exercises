// Mon Nov 1 WARM-UP

//Java WarmUp
//		Write a public class named ‘Candy’ - this class should have two public fields, both taking in a string literal as a value.
//		The first would be ‘name’ and the second will be ‘size’.
//		The class will also need two constructors - the first for if we know the name, but not the size. Your first constructor should set some kind of string literal for the size.
//		The second would be for if we know both the name and the size. This second constructor will pass through those arguments into the Candy object being instantiated.
//		BONUS:
//		Write a method for your Candy class - this method should print out a message saying:
//		“Ahh, a [name]! I see that you got the [size] of it. Sounds good! :)”

public class Candy {
		public String name;
		public String size;

		public Candy(String candyName, String candySize){
			name = candyName;
			size = candySize;
		}

		public Candy(String candyName){
			name = candyName;
			size = "Undefined";
		}

		public void getInfo(){
			System.out.printf("Ahh, a %s! I see that you got the %s size of it. Sounds good!", name, size);
		}

		public static void main(String[] args) {
			Candy hersey = new Candy("Hersey");
			System.out.println("hersey.name = " + hersey.name);
			System.out.println("hersey.size = " + hersey.size);
			hersey.getInfo();
		}
}
