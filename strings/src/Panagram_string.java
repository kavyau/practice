
public class Panagram_string
{

    public static boolean checkPanagram (String str)
    {
        boolean[] mark = new boolean[26];

        // For indexing in mark[]
        int index = 0;

        for (int i = 0; i < str.length(); i++)
        {
            // If uppercase character, subtract 'A' to find index.
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
            {
                index = str.charAt(i) - 'A';
            }
            // If lowercase character, subtract 'a' to find index.
            else if('a' <= str.charAt(i) && str.charAt(i) <= 'z')
            {
                index = str.charAt(i) - 'a';
            }
            // Mark current character
            mark[index] = true;
        }

        //if any character is unmarked
        for (int i = 0; i <= 25; i++)
        {
            if (mark[i] == false)
                return (false);
        }
        // If all characters were present
        return (true);
    }


    public static void main(String[] args)
    {
        String str = "The quick brown fox jumps over the lazy dog";

        if (checkPanagram(str) == true)
            System.out.print(str + " is a panagram.");
        else
            System.out.print(str+ " is not a panagram.");

    }
}
