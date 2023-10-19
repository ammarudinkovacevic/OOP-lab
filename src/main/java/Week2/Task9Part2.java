package Week2;

import java.util.Scanner;
//1
//2 2
//3 3 3
//4 4 4 4
//5 5 5 5 5
public class Task9Part2 {

    public static void drawNumbersPiramid(int rows){
        int row_counter = 1;
        while(row_counter <= rows){
            int column_counter = 1;
            int number = row_counter;
            while(column_counter <= row_counter){
                System.out.print(number + " ");
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
        drawNumbersPiramid(numRows);
    }
}
