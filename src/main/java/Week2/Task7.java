package Week2;
//*****
//***
//*********
public class Task7 {
    private static void printStars(int amount)
    {
        int counter = 0;
        while(counter < amount)
        {
            System.out.print("*");
            counter++;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        printStars(5);
        printStars(3);
        printStars(9);
    }
}
