package Week2;

import java.util.Scanner;
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
public class Task9 {
    public static void drawNumberPiramid(int rows){
        int row_counter = 1;
        while(row_counter <= rows)
        {
            int column_counter = 1;
            while (column_counter <= row_counter)
            {
                System.out.print(column_counter + " ");
                column_counter++;
            }
            System.out.println();
            row_counter++;
        }
    }
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int numRows = Integer.parseInt(reader.nextLine());
        drawNumberPiramid(numRows);
    }
}
