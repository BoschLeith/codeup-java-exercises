package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

	public static void GradesApp(HashMap hashMap){

		Input input = new Input();

		boolean confirmation;

		System.out.println("Welcome!\nHere are the GitHub usernames of our students:");

		do {

			System.out.println(hashMap.keySet());
			System.out.println("What student would you like to see more information on?");
			String userInput = input.getString();

			if (!hashMap.containsKey(userInput)){
				System.out.printf("Sorry, no student found with the GitHub username of %s.%n", userInput);
			} else {
				Student usersStudent = (Student) hashMap.get(userInput);
				System.out.printf("GitHub Username: %s%n", userInput);
				System.out.printf("Student Name: %s%n", usersStudent.getName());
				System.out.printf("Current Average: %.2f%n", usersStudent.getGradeAverage());
			}

			System.out.println("Would you like to see another student? [Y or N]");
			String userConfirmation = input.getString();
			confirmation = userConfirmation.equalsIgnoreCase("Y");

		} while (confirmation);
		System.out.println("Goodbye, and have a wonderful day!");
	}



	public static void main(String[] args) {

		// Creates the HashMap students
		HashMap<String, Student> students = new HashMap<>();

		// Creates 4 Students with grades
		Student bosch = new Student("Bosch");
		bosch.addGrade(100);
		bosch.addGrade(50);
		bosch.addGrade(100);

		Student ken = new Student("Ken");
		ken.addGrade(75);
		ken.addGrade(75);
		ken.addGrade(75);

		Student shanshan = new Student("Shanshan");
		shanshan.addGrade(100);
		shanshan.addGrade(100);
		shanshan.addGrade(100);

		Student cody = new Student("Cody");
		cody.addGrade(50);
		cody.addGrade(50);
		cody.addGrade(0);

		// Adds the Student objects with a username key to HashMap
		students.put("BoschLeith", bosch);
		students.put("KenKen", ken);
		students.put("Shanshan2020", shanshan);
		students.put("CodyTheDuck", cody);

		// Runs GradesApp method with the HashMap students
		GradesApp(students);
	}
}
