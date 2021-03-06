package GroceryList;

import util.Input;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Groceries {

	// Adds an item and quantity to category
	public static void addItem(HashMap<String, Integer> category, String item, int quantity){
		category.put(item, quantity);
	}

	// Prompts the user for an item and quantity then addItem()
	public static void addUserItem(HashMap<String, Integer> Category, String catName, Input input){
		System.out.printf("%nAdd an item to %s%n", catName);
		System.out.print("Enter name of item: ");
		String userItem = input.getString();
		System.out.printf("Add a quantity of %s: ", userItem);
		int userQuantity = input.getInt();
		addItem(Category, userItem, userQuantity);
		System.out.printf("%nYour %s list:%n", catName);
		sortCategoryItems(Category);
		System.out.println();
	}

	// Gets all items in a category and displays "items x quantity" alphabetically
	public static void sortCategoryItems(HashMap<String, Integer> Category) {
		TreeMap<String, Integer> sorted = new TreeMap<>(Category);
		for (Map.Entry<String, Integer> entry : sorted.entrySet())
			System.out.println(entry.getKey() + " x " + entry.getValue());
	}

	public static void GroceryList(){
		Input input = new Input();

		boolean confirmation;

		HashMap<String, Integer> Dairy = new HashMap<>();
		HashMap<String, Integer> Produce = new HashMap<>();
		HashMap<String, Integer> Deli = new HashMap<>();
		HashMap<String, Integer> Frozen = new HashMap<>();
		HashMap<String, Integer> Pantry = new HashMap<>();

		System.out.println("*** Create a grocery list ***");
		do {
			System.out.println("\nPick a category of grocery: ");
			System.out.println("\n1. Dairy\n2. Produce\n3. Deli\n4. Frozen\n5. Pantry\n");
			System.out.print("ENTER a category #: ");
			int usersCategory = input.getInt();

			if (usersCategory == 1){
				addUserItem(Dairy, "Dairy", input);
			} else if (usersCategory == 2){
				addUserItem(Produce, "Produce", input);
			} else if (usersCategory == 3){
				addUserItem(Deli, "Deli", input);
			} else if (usersCategory == 4){
				addUserItem(Frozen, "Frozen", input);
			} else if (usersCategory == 5){
				addUserItem(Pantry, "Pantry", input);
			} else {
				GroceryList();
			}
			System.out.println("Would you like to:\n1. Add another item to your list \nor\n2. Finalize your grocery list?\nENTER [1] or [2]");
			String userConfirmation = input.getString();
			confirmation = userConfirmation.equals("1");
		} while (confirmation);
		System.out.println("\nYour final grocery list is: ");
		sortCategoryItems(Dairy);
		sortCategoryItems(Produce);
		sortCategoryItems(Deli);
		sortCategoryItems(Frozen);
		sortCategoryItems(Pantry);
	}

	public static void main(String[] args) {
		GroceryList();
	}
}
