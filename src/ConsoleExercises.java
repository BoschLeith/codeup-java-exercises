import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args){

//        double pi = 3.14159;
//
//        System.out.printf("The value of pi is approximately %.2f.", pi);

        Scanner scanner = new Scanner(System.in);



//        1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();

//        2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

//        System.out.print("Enter 3 words: ");
//        String userWords = scanner.next();
//        System.out.println(userWords);
//        System.out.println("" + scanner.next());
//        System.out.println("" + scanner.next());

//        3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//        4. Rewrite the above example using the nextLine method.

//        System.out.print("Enter a sentence: ");
//        String userSentence = scanner.nextLine();
//        System.out.println(userSentence);

//        1. Prompt the user to enter values of length and width of a classroom at Codeup. Use the nextLine method to get user input and parse the resulting string to a numeric type.

//        System.out.print("Enter the length, width, and height of the room: ");
//        String userLength = scanner.next();
//        String userWidth = "" + scanner.next();
//        String userHeight = "" + scanner.next();
//        int length = Integer.parseInt(userLength);
//        int width = Integer.parseInt(userWidth);
//        int height = Integer.parseInt(userHeight);
//        int area = length * width;
//        int perimeter = (length * 2) + (width * 2);
//        int volume = length * width * height;
//        System.out.printf("The area of the room is: %s. The perimeter is: %s. The volume is: %s.",area, perimeter, volume );

        System.out.print("Enter the length: ");
        int userLength = scanner.nextInt();

        System.out.print("Enter the width: ");
        int userWidth = scanner.nextInt();

        System.out.print("Enter the height: ");
        int userHeight = scanner.nextInt();

        int area = userLength * userWidth;
        int perimeter = (userLength * 2) + (userWidth * 2);
        int volume = userLength * userWidth * userHeight;

        System.out.printf("The area of the room is: %s. The perimeter is: %s. The volume is: %s.",area, perimeter, volume );

    }

}
