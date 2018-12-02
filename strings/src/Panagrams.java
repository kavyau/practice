public class Panagrams
{

    private static String removeSpace(String s)
    {
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122)
            {
                temp+=s.charAt(i);
            }
        }
        return temp;
    }

    private static String toLowerCase(String s)
    {
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=65 && s.charAt(i)<=90)
            {
                int k = s.charAt(i);
                sb.append((char)(k+32));
            }
            else{
                sb.append((char)(s.charAt(i)));
            }
        }
        return sb.toString();
    }

    private static String sort(String s)
    {
       String temp="";
       char[] ch=s.toCharArray();
       for(int i=0;i<s.length();i++)
       {
           for(int j=i;j<s.length();j++)
           {
               if(ch[i]>ch[j])
               {
                   char x=ch[i];
                   ch[i]=ch[j];
                   ch[j]=x;
               }
           }
       }
        //System.out.println(String.valueOf(ch));
       return String.valueOf(ch);
    }

    private static String removeDup(String s)
    {
        String temp="";
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)!=s.charAt(i+1))
            {
                temp+=s.charAt(i);
            }
        }
        temp+=s.charAt(s.length()-1);
        //System.out.println("after removing duplicates: "+temp);
        return temp;
    }

    public static void main(String[] args)
    {
        //String s;
        String s="This quick brown fox jumps over the lazy dog";
        Panagrams pan=new Panagrams();
        s=removeSpace(s);
        s = toLowerCase(s);
        s = sort(s);
        s = removeDup(s);

        if (s.length()==26)
        {
            System.out.println("panagram");
        }
        else
        {
            System.out.println("not panagram");
        }
    }












}
