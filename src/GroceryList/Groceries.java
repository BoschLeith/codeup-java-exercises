package GroceryList;

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

	public static void main(String[] args) {

		HashMap<String, Integer> Dairy = new HashMap<>();
		HashMap<String, Integer> Produce = new HashMap<>();
		HashMap<String, Integer> Deli = new HashMap<>();
		HashMap<String, Integer> Frozen = new HashMap<>();
		HashMap<String, Integer> Pantry = new HashMap<>();

		addItem(Dairy, "Milk", 2);
		addItem(Dairy,"Ice Cream", 4);
		getItems(Dairy);

	}
}
