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

	public String getName(){
		return name;
	}

	public String getCategory(){
		return category;
	}

	public void setName(){
		this.name = name;
	}

	public void setCategory(){
		this.category = category;
	}
}
