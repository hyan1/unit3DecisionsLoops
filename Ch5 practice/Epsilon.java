/**
 * Write a program that reads a floating-point number and prints "Zero" if the number is zero. Otherwise
 * print
 */


import java.util.Scanner;

public class Epsilon
{
    public static final double EPSILON = 1e-12;
    
    public static void main(String[] arg)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a floating-point number: ");
        double i = in.nextDouble();
        
        String adj = "";
        
        if(Math.abs(i) < 1.0)
        {
            adj = "small";
        }
        else if( Math.abs(i) > 1000000 )
        {
            adj = "Large";
        }
        if( Math.abs(i-0)< EPSILON)
        {
            System.out.println("It's a zero");
        }
        else if( i>0)
        {
            System.out.println("It's a " + adj + "postive number.");
        }
        else
        {
            System.out.println("It's a " + adj + "negative number.");
        }
        
    }
    
}
