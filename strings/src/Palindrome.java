import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter string 1");
         String s=scan.nextLine();

         String reverse="";

         for(int i=s.length()-1;i>=0;i--)
         {
             reverse+=s.charAt(i);
         }

         if (reverse.equals(s))
         {
             System.out.println("palindrome");
         }
         else
        {
            System.out.println("not palindrome");
        }
    }
}
