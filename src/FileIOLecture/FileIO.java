package FileIOLecture;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIO {

	public static void main(String[] args) throws IOException {
		String directory = "./src/FileIOLecture/data";
		String filename = "groceryList.txt";
		Path dataDirectory = Paths.get(directory);
		Path dataFile = Paths.get(directory, filename);

		// if directory does not exist, create directory
		if (Files.notExists(dataDirectory)) {
			Files.createDirectories(dataDirectory);
		}
		// if file does not exist, creat file
		if (Files.notExists(dataFile)) {
			Files.createFile(dataFile);
		}

		// Writes groceryList to groceryList.txt
		List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");
		System.out.println("groceryList = " + groceryList);
		System.out.println();
		Files.write(dataFile, groceryList);

		// Reads all lines in groceryList.txt and prints each line
		List<String> printList = Files.readAllLines(dataFile);
		for (int i = 0; i < printList.size(); i++) {
			System.out.println((i + 1) + ": " + printList.get(i));
		}

		// Adds "eggs" to groceryList.txt and prints new list
		Files.write(dataFile, List.of("eggs"), StandardOpenOption.APPEND);
		System.out.println();
		printList = Files.readAllLines(dataFile);
		for (int i = 0; i < printList.size(); i++) {
			System.out.println((i + 1) + ": " + printList.get(i));
		}

		// Replace "milk" with "cream"
		groceryList = Files.readAllLines(dataFile);
		List<String> newList = new ArrayList<>();
		for (String line : groceryList) {
			if (line.equals("milk")) {
				newList.add("cream");
				continue;
			}
			newList.add(line);
		}

		// Writes newList to groceryList.txt
		Files.write(dataFile, newList);
		// Prints updated groceryList.txt
		printList = Files.readAllLines(dataFile);
		System.out.println();
		for (int i = 0; i < printList.size(); i++) {
			System.out.println((i + 1) + ": " + printList.get(i));
		}
	}
}
