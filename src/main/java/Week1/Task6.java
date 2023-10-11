package Week1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Enter second number:");
        int num2 = Integer.parseInt(reader.nextLine());
        if(num1>num2)
        {
            System.out.println("Greater number:"+num1);
        }
        else if (num1<num2)
        {
            System.out.println("Greater number:"+num2);
        }
        else
        {
            System.out.println("Number are equal.");
        }
    }
}
