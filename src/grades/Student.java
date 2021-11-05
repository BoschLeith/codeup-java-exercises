package grades;

import java.util.ArrayList;

public class Student {
	private String name;
	private ArrayList<Integer> grades;

	// Student Constructor
	public Student(String name){
		this.name = name;
		this.grades = new ArrayList<>();
	}

	// Returns the student's name
	public String getName(){
		return this.name;
	}

	// Adds the given grade to the grades property
	public void addGrade(int grade){
		grades.add(grade);
	}

	// Returns the average of the students grades
	public double getGradeAverage(){
		double total = 0;
		for (Integer grade : grades){
			total += grade;
		}
		return total/grades.size();
	}

	public static void main(String[] args) {
		Student bosch = new Student("Bosch");
		System.out.println("bosch.getName() = " + bosch.getName());
		bosch.addGrade(50);
		bosch.addGrade(100);
		bosch.addGrade(100);
		bosch.addGrade(100);
		for (Integer grade : bosch.grades) {
			System.out.println(grade);
		}
		System.out.println("bosch.getGradeAverage() = " + bosch.getGradeAverage());
	}
}
