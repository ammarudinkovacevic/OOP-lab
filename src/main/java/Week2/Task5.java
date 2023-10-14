package Week2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int number = Integer.parseInt(reader.nextLine());
        int result = (int)Math.pow(2,number);
        System.out.println("The result is "+result);
    }
}
