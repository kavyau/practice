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
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=65 && s.charAt(i)<=90)
            {
                temp+=(char)(s.charAt(i)-32);
            }
        }
        return temp;
    }

    private static String sort(String s)
    {
       String temp="";
       char[] ch=s.toCharArray();
       for(int i=0;i<s.length()-1;i++)
       {
           for(int j=0;j<s.length();j++)
           {
               if(ch[i]>ch[j])
               {
                   char x=ch[i];
                   ch[i]=ch[j];
                   ch[j]=x;
               }
           }
       }
       for(int i=0;i<s.length()-1;i++)
       {
           temp+=s.charAt(i);
       }
       return temp;
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
        return temp;
    }

    public static void main(String[] args)
    {
        //String s;
        String s="This quick brown fox jumps over the lazy dog";
        Panagrams pan=new Panagrams();
        s=removeSpace(s);
        toLowerCase(s);
        sort(s);
        removeDup(s);

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
