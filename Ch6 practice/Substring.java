import java.util.Scanner;

public class Substring
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter a string ");
        String sent = scan.next();
        
        for( int i = 0; i < sent.length(); i++ )
        {
            for(int p = 0; p <= sent.length() - i; p++)
            {
                System.out.println(sent.substring(p, p + i));
            }
            
        }
    }
}
