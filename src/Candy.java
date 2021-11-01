// Mon Nov 1 WARM-UP

public class Candy {
		public String name;
		public String size;

		public Candy(String candyName, String candySize){
			name = candyName;
			size = candySize;
		}

		public Candy(String candyName){
			name = candyName;
			size = "Undefined";
		}

		public void getInfo(){
			System.out.printf("Ahh, a %s! I see that you got the %s size of it. Sounds good!", name, size);
		}

		public static void main(String[] args) {
			Candy hersey = new Candy("Hersey");
			System.out.println("hersey.name = " + hersey.name);
			System.out.println("hersey.size = " + hersey.size);
			hersey.getInfo();
		}
}
