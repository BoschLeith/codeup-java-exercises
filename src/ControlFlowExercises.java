import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){

//        1. Loop Basics
//        *** do-while Loops ***

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i <= 1000000);

//        *** Refactored to for Loops ***

//        for (int i = 5; i <= 15; i++){
//            System.out.println(i);
//        }

//        for (int i = 0; i <= 100; i+= 2){
//            System.out.println(i);
//        }

//        for (int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }

//        for (long i = 2; i <= 1000000; i *= i){
//            System.out.println(i);
//        }

//        2. Fizzbuzz

//        for (int i = 1; i <= 100; i++){
//            if (i % 15 == 0){
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        3. Display a table of powers

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Continue? [Y/N] ");
//        String userInput = scanner.next();
//
//        boolean confirmation = userInput.equals("Y");
//
//        if (confirmation){
//            System.out.print("What number would you like to go up to? ");
//            int userMulti = scanner.nextInt();
//
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed\n------ | ------- | -----");
//
//            for (int i = 1; i <= userMulti; i ++){
//                int square = i * i;
//                int cubed = i * i * i;
//                System.out.printf("%d      |% -9d|% d     \n", i, square, cubed);
//            }
//        } else {
//            System.out.println("See you next time!");
//        }


//        4. Convert given number grades into letter grades

        Scanner scanner = new Scanner(System.in);
        System.out.print("Continue? [Y/N] ");
        String userInput = scanner.next();

        boolean confirmation = userInput.equals("Y");

        if (confirmation){
            System.out.print("Input a numerical grade from 0 to 100: ");
            int userGrade = scanner.nextInt();

            if (userGrade >= 88){
                System.out.println("A");
            } else if (userGrade < 88 && userGrade >= 80){
                System.out.println("B");
            } else if (userGrade < 80 && userGrade >= 67){
                System.out.println("C");
            } else if (userGrade < 67 && userGrade >= 60){
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        } else {
            System.out.println("See you next time!");
        }

    }
}
