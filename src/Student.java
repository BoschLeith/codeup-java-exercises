public class Student {

	public String name;
	public String cohort;
	private double grade;

//	public Student(String studentName) {
//		name = studentName;
//		cohort = "Unassigned";
//	}
//
//	public Student(String studentName, String assignedCohort) {
//		name = studentName;
//		cohort = assignedCohort;
//	}

	public Student(String name, String cohort) {
		this.name = name;
		this.cohort = cohort;
	}
	public Student(String name) {
		this(name, "Unassigned");
	}
	public Student(String name, String cohort, double grade){
		this.name = name;
		this.cohort = cohort;
		this.grade = grade;
	}
	public String sayHello() {
		return String.format("%s says hello!", this.name);
	}

	public static void main(String[] args){

		Student jane = new Student("Jane Doe", "Zion");
		System.out.print(jane.name + " - ");
		System.out.println(jane.cohort);
		System.out.println(jane.sayHello());

		Student john = new Student("John Doe");
		System.out.print(john.name + " - ");
		System.out.println(john.cohort);
		System.out.println(john.sayHello());

		Student bosch = new Student("Bosch Leith", "Quasar", 90);
		System.out.println("bosch.grade = " + bosch.grade);
	}
}