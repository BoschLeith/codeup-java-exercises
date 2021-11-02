public class Person {
	private String name;
	protected int age;

	// Default Person constructor for Employee class
	public Person(){}

	public Person(String name) {
//TODO: Accepts a `String` value and sets the person's name to the passed string.
		this.name = name;
	}

	// Person constructor that utilizes name and age fields
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName(){
//TODO: return the person's name
		return name;
	}

	public void setName(String name){
//TODO: change the name property to the passed value
		this.name = name;
	}

	public void sayHello(){
//TODO: print a message to the console using the person's name
		System.out.printf("Hello, %s!\n", this.name);
	}

	public static void main(String[] args){
		Person bosch = new Person("Bosch");

		System.out.println("bosch.getName() = " + bosch.getName());
		bosch.setName("Bosch Leith");
		bosch.sayHello();

	}
}