import java.util.*;

public class Sum_array

{
    public static void main(String[] args)
    {
        int count,i;
        int sum=0;
        int[] num=new int[50];

        Scanner scan=new Scanner(System.in);
        System.out.println("enter the array size=");
        count=scan.nextInt();

        for(i=0;i<count;i++)
        {
            num[i]=scan.nextInt();
        }

        for(int x:num)
        {
            sum=sum+x;
        }

        System.out.println("Sum of the elements in the array="+sum);
    }
}
