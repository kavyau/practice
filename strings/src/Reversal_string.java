public class Reversal_string
{
    public static void main(String[] args)
    {
        String s="Australia is a continent";
        String temp="";

        for(int i=s.length()-1;i>=0;i--)
        {
            temp=temp+s.charAt(i);
        }
        System.out.println(temp);
    }
}
