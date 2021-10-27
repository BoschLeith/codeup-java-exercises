import java.util.Scanner;

public class HighLow {

    public static void main(String [] args){
        userNum();
    }

    public static void userNum(){
        Scanner scanner = new Scanner(System.in);

        int randomNumber = randomNum();

        int tries = 5;

        while (tries > 0){
            System.out.printf("Guess a number between 1-100. You have %d guesses.\n", tries);
            System.out.print("Guess a number: ");
            int userInput = scanner.nextInt();
            tries--;

            if (userInput > randomNumber){
                System.out.println("Lower");
            } else if (userInput < randomNumber){
                System.out.println("Higher");
            } else if (userInput == randomNumber) {
                System.out.println("You got it! Good Guess!");
                System.out.printf("It took you: %d guesses", tries -1);
                break;
            }
        }
        if (tries == 0){
            System.out.println("You're out of guesses. Better luck next time!");
        }
    }

    public static int randomNum(){
        int min = 1;
        int max = 100;
        int range = max - min + 1;
        int rand = 0;

        for (int i = 0; i < 1; i++) {
            rand = (int)(Math.random() * range) + min;
            System.out.printf("FOR TESTING\nThe random number is: %d\n", rand);
        }
        return rand;
    }
}
