
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams
{
    public static void main(String[] args)
    {
        String s1,s2;
        Scanner scan=new Scanner(System.in);

        System.out.println("enter the first string=");
        s1=scan.nextLine();
        System.out.println("enter the second string=");
        s2=scan.nextLine();

        //removing blank spaces
        s1.replace(" ","");
        s2.replace(" ","");

        //checking length of both strings
        if(s1.length()!=s2.length())
        {
            System.out.println("both the strings are not ANAGRAMS");
        }
        //if not equal then proceed and convert to character arrays
        else
        {
            //converting to upper or lower case
            s1=s1.toLowerCase();
            s2=s2.toLowerCase();

            //converting to character arrays
            char arr1[]=s1.toCharArray();
            char arr2[]=s2.toCharArray();

            //sorting
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            //comparing the sorted arrays
            boolean status=Arrays.equals(arr1,arr2);
            if(status)
            {
                System.out.println("both strings are anagrams");
            }
            else
            {
                System.out.println("both strings are not anagrams");
            }
        }
    }
}
