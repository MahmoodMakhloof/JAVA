/*****************************************************/
/* Author  : Mahmoud Abbas Makhlouf                  */
/* Date    : 11 NOV 2020                             */
/* Title   : Area of circle                          */
/* Version : V01                                     */
/*****************************************************/

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter Radius Of The Circle ");

        // nextDouble() reads the next double from the keyboard
        double radius = reader.nextDouble();

        double area;
        area = 3.14 * radius * radius ;
        System.out.printf("Area of circle is %.1f Square unit", area);
    }
}