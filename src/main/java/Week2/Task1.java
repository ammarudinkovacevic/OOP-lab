package Week2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String correct_password = "carrot";
        String secret_password = "jryy qbar";
        String password = null;
        while(!correct_password.equals(password)) {
            System.out.println("Type the password:");
            password = reader.nextLine();
            if (correct_password.equals(password)) {
                System.out.println("Correct!");
                System.out.println("The secret is " + secret_password);
            }
            else
            {
                System.out.println("Wrong!");
            }
        }
    }
}
