package movies;

import util.Input;

public class MoviesApplication {
	public static void main(String[] args) {
		Input input = new Input();

		Movie[] movieList = MoviesArray.findAll();

		boolean confirmation = true;

		do {
			System.out.println();
			System.out.println("What would you like to do?");
			System.out.println();
			System.out.println("""
					0 - exit
					1 - view all movies
					2 - view movies in the animated category
					3 - view movies in the drama category
					4 - view movies in the horror category
					5 - view movies in the scifi category
					6 - add a movie""");
			System.out.println();
			System.out.print("Enter your choice: ");
			int userInput = input.getInt();
			System.out.println();

			if (userInput == 0){
				confirmation = false;
			} else if (userInput == 1){
				for (Movie movie : movieList){
					System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
				}
			} else if (userInput == 2){
				for (Movie movie : movieList){
					if (movie.getCategory().equals("animated")){
						System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
					}
				}
			} else if (userInput == 3){
				for (Movie movie : movieList){
					if (movie.getCategory().equals("drama")){
						System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
					}
				}
			} else if (userInput == 4){
				for (Movie movie : movieList){
					if (movie.getCategory().equals("horror")){
						System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
					}
				}
			} else if (userInput == 5){
				for (Movie movie : movieList){
					if (movie.getCategory().equals("scifi")){
						System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
					}
				}
			} else if (userInput == 6){

				System.out.println();
				System.out.println("Enter name of movie: ");
				String movieName = input.getString();
				System.out.println();
				System.out.println("Enter movies category: ");
				String movieCategory = input.getString();

				Movie userMovie = new Movie(movieName, movieCategory);

				movieList = Movie.addMovie(movieList, userMovie);
				for (Movie movie : movieList) {
					System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
				}
			}
		} while (confirmation);
	}
}
