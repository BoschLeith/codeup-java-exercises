public class Person {
	private String name;

	public Person(String name) {
//TODO: Accepts a `String` value and sets the person's name to the passed string.
		this.name = name;
	}

	public String getName(){
//TODO: return the person's name
		return this.name = name;
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

//		Person person1 = new Person("John");
//		Person person2 = new Person("John");
//		System.out.println(person1.getName().equals(person2.getName()));
//		System.out.println(person1 == person2);

//		Person person1 = new Person("John");
//		Person person2 = person1;
//		System.out.println(person1 == person2);

//		Person person1 = new Person("John");
//		Person person2 = person1;
//		System.out.println(person1.getName());
//		System.out.println(person2.getName());
//		person2.setName("Jane");
//		System.out.println(person1.getName());
//		System.out.println(person2.getName());
	}
}