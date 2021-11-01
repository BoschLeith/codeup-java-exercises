import java.util.Arrays;

public class ArrayLecture {

	public static void main(String[] args) {
		double[] prices = new double[4];
		final int numberOfSides = 6;

		int[] diceSides = new int[numberOfSides];
		diceSides[0] = 1;

		System.out.println("prices.length = " + prices.length);
		System.out.println("diceSides.length = " + diceSides.length);

		System.out.println("diceSides[0] = " + diceSides[0]);

		String[] myBag = {"Snickers", "M&M", "Hersey"};

		System.out.println("myBag.length = " + myBag.length);
		System.out.println("myBag[1] = " + myBag[1]);

		for (int i = 0; i < myBag.length; i++){
			System.out.println(myBag[i]);
		}

		for (String candy : myBag){
			System.out.printf("%s%n", candy);
		}

		String[] anotherBag = new String[12];

		Arrays.fill(anotherBag, "Reese's");
		for (String candy : anotherBag){
			System.out.println(candy);
		}

		System.out.println("Arrays.equals(myBag, anotherBag) = " + Arrays.equals(myBag, anotherBag));

		String[] myBagPlusTwo = Arrays.copyOf(myBag, 5);
		String[] myBagPlusThree = Arrays.copyOf(myBag, myBag.length +3);

		System.out.println("myBagPlusTwo.length = " + myBagPlusTwo.length);
		for (String candy : myBagPlusTwo){
			System.out.println(candy);
		}

		Arrays.sort(myBag);
		for (String candy : myBag){
			System.out.println(candy);
		}

		System.out.println("Arrays.toString(myBag) = " + Arrays.toString(myBag));

		int herseyIndex = Arrays.binarySearch(myBag, "Hersey");
		System.out.println("This should return Hersey: " + myBag[herseyIndex]);

		int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};

		for (int[] row : matrix) {
			System.out.println("+---+---+---+");

			System.out.print("| ");

			for (int n : row) {
				System.out.print(n + " | ");
			}

			System.out.println();
		}

		System.out.println("+---+---+---+");

	}
}