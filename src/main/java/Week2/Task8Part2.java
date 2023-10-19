package Week2;

import java.util.Scanner;
//* * * * *
//* * * *
//* * *
//* *
//*
public class Task8Part2 {
    public static void drawStarsPiramidInverted(int rows){
        int row_counter = rows;
        while(row_counter >= 1)
        {
            int column_counter = 1;
            while (column_counter <= row_counter)
            {
                System.out.print("* ");
                column_counter++;
            }
            System.out.println();
            row_counter--;
        }
    }
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int numRows = Integer.parseInt(reader.nextLine());
        drawStarsPiramidInverted(numRows);
    }
}
