import java.net.Inet4Address;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first number:");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number:");
        int num2 = Integer.parseInt(reader.nextLine());
        if(num1>num2)
        {
            System.out.println("Greater number:"+num1);
        }
        else if (num1==num2)
        {
            System.out.println("Numbers are equal.");
        }
        else
        {
            System.out.println("Greater number:"+num2);
        }
    }
}