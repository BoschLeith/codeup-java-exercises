package InterfacesAbstractLecture;

public class Company {
	public static void main(String[] args) {

		Employee accountantBot = new Accountant("NumberBot", "Accounting");
		Employee maintenanceBot = new Custodian("CleanerBot", "Maintenance");

		System.out.printf("%n%s, %s%n", accountantBot.name, accountantBot.morningMeeting());
		System.out.printf("%s is doing %s in the %s department until lunch (%s)%n", accountantBot.name, accountantBot.work(), accountantBot.department, accountantBot.lunchTime());
		System.out.printf("%s makes $%d daily%n", accountantBot.name, accountantBot.dailyPay());

		System.out.printf("%n%s, %s%n", maintenanceBot.name, maintenanceBot.morningMeeting());
		System.out.printf("%s is doing %s in the %s department until lunch (%s)%n", maintenanceBot.name, maintenanceBot.work(), maintenanceBot.department, maintenanceBot.lunchTime());
		System.out.printf("%s makes $%d daily%n", maintenanceBot.name, maintenanceBot.dailyPay());

	}
}
