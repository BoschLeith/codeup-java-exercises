package InterfacesAbstractLecture;

public class Accountant extends Employee {

	public Accountant(String name, String department) {
		super(name, department);
	}

	public String work(){
		return "accounting work";
	}

	public String morningMeeting() {
		return "Report to accounting department";
	}

	public String lunchTime() {
		return "12:00 - 1:30PM";
	}

	public int dailyPay() {
		return 200;
	}

}
