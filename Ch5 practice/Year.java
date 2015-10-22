import java.util.Scanner;



public class Year
{
    public static boolean isLeapYear(int year)
    {
        return (year % 400 ==0 || (year % 4 ==0 && year % 100 !=0));
    }
    
    public static void main(String[] agrs)
    {
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = in.nextInt();
        if (Year.isLeapYear(year))
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not a leap year");
    }
}
}

