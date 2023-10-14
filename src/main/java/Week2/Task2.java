package Week2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int read;
        while(counter < 3)
        {
            System.out.println("Type a number:");
            read = Integer.parseInt(reader.nextLine());
            counter++;
            sum=sum+read;
        }
        System.out.println("Sum: "+sum);
    }
}
