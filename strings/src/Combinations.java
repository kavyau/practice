public class Combinations
{
     StringBuffer output = new StringBuffer();
     String inputstring;
    public Combinations(String str)
    {
        inputstring = str;
        System.out.println("The input string  is  : " + inputstring);
    }


    public static void main (String args[])
    {
        Combinations combo= new Combinations("wxyz");
        System.out.println("");
        System.out.println("");
        System.out.println("All possible combinations are :  ");
        System.out.println("");
        System.out.println("");
        combo.combine(0);
    }


    private void combine(int start )
    {
        for( int i = start; i < inputstring.length(); ++i )
        {
            output.append( inputstring.charAt(i) );
            System.out.println( output );
            if ( i < inputstring.length() )
            {
                combine(i + 1);
            }
            output.setLength( output.length() - 1 );
        }
    }
} 