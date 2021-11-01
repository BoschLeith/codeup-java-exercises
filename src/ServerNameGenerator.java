public class ServerNameGenerator {
	static String[] nouns = {"cat", "dog", "bear", "bat", "duck"};
	static String[] adjectives = {"big", "small", "short", "tall", "fat"};


	static String randomElement(String[] array){

		int min = 1;
		int max = array.length;
		int rand = (int)(Math.random() * (max - min + 1));
		String randElement = "";

		for (int i = 0; i < 1; i++){
			randElement = array[rand];
		}
		return randElement;
	}

	public static void main(String[] args) {
		String randomNoun = randomElement(nouns);
		String randomAdj = randomElement(adjectives);

		System.out.printf("Here is your server name:\n%s-%s", randomNoun, randomAdj);
	}
}
