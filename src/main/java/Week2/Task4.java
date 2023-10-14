package Week2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("First number:");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Last number:");
        int num2 = Integer.parseInt(reader.nextLine());
        while(num1<=num2)
        {
            System.out.println(num1);
            num1++;
        }
    }
}
