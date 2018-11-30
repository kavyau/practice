
public class Permute_string
{
    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        Permute_string perm = new Permute_string();
        perm.permute(str, 0, n - 1);
    }


    private void permute(String str, int l, int r) //l=start index r=ending index
    {
        if (l == r)
            System.out.println(str);
        else
            {
            for (int i = l; i <= r; i++)
            {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }


    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}

