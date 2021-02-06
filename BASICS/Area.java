/****************************************************************/
/* Author  : Mahmoud Abbas Makhlouf                             */
/* Date    : 11 NOV 2020                                        */
/* Title   : Area of circle , triangle , square and Rectangular */
/* Version : V01                                                */
/****************************************************************/

import java.util.Scanner;

public class Area{

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter The shape's character : \n");
        System.out.print("C: Circle   T: Triangle   S: Square    R: Rectangle \n");
        char shape = reader.next().charAt(0);

        
        double area ;

        switch(shape)
        {
            case 'C':
                System.out.print("Enter The Radius Of The Circle :");
                double radius = reader.nextDouble();
                area = 3.14 * radius * radius;
                break;

            case 'T':
                System.out.print("Enter The Base Of Triangle :");
                double base = reader.nextDouble();
                System.out.print("Enter The Highest Of Triangle :");
                double highest = reader.nextDouble();
                area = 0.5 * base * highest ;
                break;

            case 'S':
                System.out.print("Enter The Rib Of The Square :");
                double Rib = reader.nextDouble();
                area = Rib * Rib ;
                break;

            case 'R':
                System.out.print("Enter The Length Of Rectangle :");
                double length = reader.nextDouble();
                System.out.print("Enter The Width Of Rectangle :");
                double width = reader.nextDouble();
                area = length * width ;
                break;


            default:
                System.out.printf("Error! shape is not correct");
                return;
        }

        
        System.out.printf("AREA IS %.1f", area);
    }
}