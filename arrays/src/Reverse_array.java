import java.util.*;

public class Reverse_array

{
    public static void main (String[] args)
    {
        int i,j,temp;
        int[] array = new int[100];
        Scanner scan = new Scanner (System.in);

        System.out.println ("enter the array size=");

        int count = scan.nextInt ();

        for (i=0;i<count;i++)
        {
            array[i] = scan.nextInt ();
        }
        j = i - 1;
        i = 0;
        scan.close ();

        while (i < j)
        {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            j--;
            i++;
        }

        System.out.println ("Reversed array=");
        for (i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
