package Week2;

import java.util.Scanner;

public class Task8 {
    public static void drawStarsPiramid(int rows){
        int row_counter = 1;
        while(row_counter <= rows)
        {
            int column_counter = 1;
            while (column_counter <= row_counter)
            {
                System.out.print("* ");
                column_counter++;
            }
            System.out.println();
            row_counter++;
        }
    }
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int numRows = Integer.parseInt(reader.nextLine());
        drawStarsPiramid(numRows);
    }
}
