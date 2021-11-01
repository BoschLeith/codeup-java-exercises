package movies;

public class Movie {
	private String name;
	private String category;

	public Movie(String name, String category){
		this.name = name;
		this.category = category;
	}

	public Movie(String name){
		this.name = name;
		category = "Undefined";
	}

	public String getName(String name){
		return this.name;
	}

	public String getCategory(String category){
		return this.category;
	}
}
