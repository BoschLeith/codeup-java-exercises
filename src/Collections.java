import java.util.ArrayList;

public class Collections {
	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<>();

		students.add("Bosch");
		students.add("Ken");
		students.add(0,"Cody");
		students.add(students.size() -2,"Shanshan");
		students.add("Shanshan");

		System.out.println(students);
		System.out.println("students.size() = " + students.size());
		System.out.println("students.get(2) = " + students.get(2));
		System.out.println("students.indexOf(\"Ken\") = " + students.indexOf("Ken"));
		System.out.println("students.contains(\"Bosch\") = " + students.contains("Bosch"));
		System.out.println("students.lastIndexOf(\"Shanshan\") = " + students.lastIndexOf("Shanshan"));
		System.out.println("students.isEmpty() = " + students.isEmpty());
		System.out.println("students.remove(\"Shanshan\") = " + students.remove("Shanshan"));
		System.out.println(students);
	}
}
