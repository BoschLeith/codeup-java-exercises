import java.util.Arrays;

public class ArraysExercises {

	public static void main(String[] args) {

//		What happens when you run the following code? Why is Arrays.toString necessary?
		int[] numbers = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(numbers));

//		Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
		String[] people = {"Edmond", "Amelia", "Yuki"};

		System.out.println("person.length = " + people.length);

		for (String person : people){
			System.out.println(person);
		}

		System.out.println(Arrays.toString(addPerson(people, "Bosch")));
	}

//	Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
	static String[] addPerson(String[] array, String person){
		String[] newArray = Arrays.copyOf(array, array.length + 1);
		newArray[newArray.length - 1] = person;
		return newArray;
	}

}
