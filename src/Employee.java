public class Employee extends Person{

	private String jobTitle;

	public Employee(String employeeName) {
		super(employeeName);
	}

	public void sayHello(){
		System.out.println("Welcome to MegaCorp Inc, how may I help you?");
	}

	public void doWork(){
		System.out.println("Work, work...");
	}

	public static void main(String[] args) {
		Employee bosch = new Employee("Bosch");
		Person ken = new Person("Ken", 28);
		bosch.jobTitle = "Jr Developer";

		ken.sayHello();
		// ken.doWork();
		// Cannot resolve method 'doWork' in 'Person'

		bosch.sayHello();
		bosch.doWork();
		System.out.println("bosch.getName() = " + bosch.getName());
		System.out.println("bosch.jobTitle = " + bosch.jobTitle);
	}

}
