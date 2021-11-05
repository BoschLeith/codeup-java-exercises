import java.util.ArrayList;
import java.util.HashMap;

public class Collections {
	public static void main(String[] args) {

		// ArrayList Lecture Notes
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

		// HashMap Lecture Notes
		HashMap<String, String> usernames = new HashMap<>();

		usernames.put("Ryan", "Ryan01");
		usernames.put("Zach", "Zach02");
		usernames.put("Fernando", "Fernando03");
		usernames.put("Justin", "Justin04");

		System.out.println();
		System.out.println(usernames);
		System.out.println("usernames.get(\"Zach\") = " + usernames.get("Zach"));
		System.out.println("usernames.getOrDefault(\"Alex\", \"No username found\") = " + usernames.getOrDefault("Alex", "No username found"));
		System.out.println("usernames.containsKey(\"Ryan\") = " + usernames.containsKey("Ryan"));
		System.out.println("usernames.containsValue(\"Fernando03\") = " + usernames.containsValue("Fernando03"));

		System.out.println();
		usernames.putIfAbsent("Bosch", "Bosch05");
		usernames.putIfAbsent("Ryan", "Ryan01");
		System.out.println(usernames);
		usernames.remove("Fernando");
		System.out.println(usernames);
		usernames.replace("Justin", "Justin004");
		System.out.println(usernames);
		usernames.clear();
		System.out.println("usernames = " + usernames);
		System.out.println("usernames.isEmpty() = " + usernames.isEmpty());
	}
}
