package InterfacesAbstractLecture;

public class Custodian extends Employee{

	public Custodian(String name, String department) {
		super(name, department);
	}

	public String work(){
		return "maintenance work";
	}

	public String morningMeeting() {
		return "Report to maintenance department";
	}

	public String lunchTime() {
		return "1:00 - 2:30PM";
	}

	public int dailyPay() {
		return 100;
	}

}
