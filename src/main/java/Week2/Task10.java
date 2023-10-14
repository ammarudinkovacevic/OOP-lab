package Week2;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
   private static int drawNumber(){
       return new Random().nextInt(101);
   }
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int guess_number = drawNumber();
        int guess_made = 0;
        while(true) {
            System.out.print("Guess number:");
            int number = Integer.parseInt(reader.nextLine());
            if(guess_number < number)
            {
                guess_made++;
                System.out.println("The number is lesser, guesses made: "+guess_made);
            }
            else if (guess_number > number)
            {
                guess_made++;
                System.out.println("The number is greater, guess made: "+guess_made);
            }
            else
            {
                System.out.println("Congrualation, your guess is correct!");
                break;
            }
        }
    }
}
