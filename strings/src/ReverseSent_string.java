

//SPLITTING THE STRING...
public class ReverseSent_string
{
    public static void main(String[] args)
    {
        String s="This is my country";

        int count=0;

        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
            {
                count++; //checking for the consecutive spaces if any
            }
        }
        String[] arr=new String[count+1]; //converting string to string type array and give
        int j=0;                          //count of words
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                temp+=s.charAt(i);
            }
            else
            {
                arr[j]=temp;
                j++;
                temp=" "; // store latest word
            }
        }
        arr[j]=temp;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
