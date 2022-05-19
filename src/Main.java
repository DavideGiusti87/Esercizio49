import java.util.Random;
import java.util.Scanner;

/*
While Loop 04
Exercise: While Loop 4

you have an int called number
the user has to guess the value of number
the program:
starts welcoming the user Welcome!
creates a random number (1 <= number <= 10) and assigns it to number
then it asks the user to guess the number
the program stops with a Congratulations! when the user enters the right value
 */
public class Main {
    public static void main(String[] args) {
        int number;
        int answer = 0;

        System.out.println("Welcome!");
        number = new Random().nextInt(1,11);
        //System.out.println(number);

        while (answer!=number){
            System.out.println("Choose an integer from 1 to 10. Type it, hit enter and find out if you guessed right.");
            answer = new Scanner(System.in).nextInt();

            if (answer==number){
                System.out.println("Congratulations!");
            } else{
                System.out.println("Sorry you didn't guess, try again!");
            }
        }
    }
}
