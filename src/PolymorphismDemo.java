public class PolymorphismDemo {
	public static void doWork(Worker w){
		System.out.println(w.work());
	}

	public static void main(String[] args) {
		Worker bosch = new Worker();
		Worker ken = new Manager();

		doWork(bosch);
		doWork(ken);
	}
}
