package InterfacesAbstractLecture;

abstract class Employee implements DailyWork{

	protected String name;
	protected String department;

	public Employee(String name, String department){
		this.name = name;
		this.department = department;
	}

	public String getName(){
		return this.name;
	}

	public String getDepartment(){
		return this.department;
	}

// work() method is no longer needed, implemented from DailyWork interface
//	public abstract String work();

}
