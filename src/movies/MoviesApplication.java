package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
	public static void main(String[] args) {
		Input input = new Input();

		boolean confirmation = true;

		do {
			System.out.println();
			System.out.println("What would you like to do?");
			System.out.println();
			System.out.println("0 - exit\n" +
					"1 - view all movies\n" +
					"2 - view movies in the animated category\n" +
					"3 - view movies in the drama category\n" +
					"4 - view movies in the horror category\n" +
					"5 - view movies in the scifi category");
			System.out.println();
			System.out.print("Enter your choice: ");
			int userInput = input.getInt();
//			System.out.println("userInput = " + userInput);

			if (userInput == 0){
				confirmation = false;
			} else if (userInput == 1){
				for (Movie movie : MoviesArray.findAll()){
					System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
				}
			} else if (userInput == 2){
				for (Movie movie : MoviesArray.findAll()){
					if (movie.getCategory().equals("animated")){
						System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
					}
				}
			} else if (userInput == 3){
				for (Movie movie : MoviesArray.findAll()){
					if (movie.getCategory().equals("drama")){
						System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
					}
				}
			} else if (userInput == 4){
				for (Movie movie : MoviesArray.findAll()){
					if (movie.getCategory().equals("horror")){
						System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
					}
				}
			} else if (userInput == 5){
				for (Movie movie : MoviesArray.findAll()){
					if (movie.getCategory().equals("scifi")){
						System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
					}
				}
			}
		} while (confirmation);
		





	}
}
