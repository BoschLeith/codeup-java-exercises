package GroceryList;

import util.Input;

import java.util.HashMap;
import java.util.Map;

public class Groceries {

	// Adds an item and quantity to category
	public static void addItem(HashMap<String, Integer> category, String item, int quantity){
		category.put(item, quantity);
	}

	// Gets all items in a category and displays items=quantity
	public static void getItems(HashMap<String, Integer> category){
		for (Map.Entry<String, Integer> item: category.entrySet()){
			System.out.println(item);
		}
	}

	// Prompts the user for an item and quantity then addItem()
	public static void addUserItem(HashMap<String, Integer> Category, String catName, Input input){
		System.out.printf("%nAdd an item to %s%n", catName);
		System.out.print("Enter name of item: ");
		String userItem = input.getString();
		System.out.printf("Add a quantity of %s: ", userItem);
		int userQuantity = input.getInt();
		System.out.printf("Add %s x %d%n", userItem, userQuantity);
		addItem(Category, userItem, userQuantity);
		System.out.printf("Your %s list:%n", catName);
		System.out.println(Category);
	}

	public static void GroceryList(){
		Input input = new Input();

		HashMap<String, Integer> Dairy = new HashMap<>();
		HashMap<String, Integer> Produce = new HashMap<>();
		HashMap<String, Integer> Deli = new HashMap<>();
		HashMap<String, Integer> Frozen = new HashMap<>();
		HashMap<String, Integer> Pantry = new HashMap<>();

		System.out.println("1. Dairy\n2. Produce\n3. Deli\n4. Frozen\n5. Pantry\n");
		System.out.print("Pick a category: ");
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
	}

	public static void main(String[] args) {
		GroceryList();
	}
}
