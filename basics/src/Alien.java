public class Alien implements LangTranslator
{
    @Override
    public String fromDefault(String langTokens)
    {
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<langTokens.length();i++)
        {
            sb.append((char)(langTokens.charAt(i)+3));
        }
        return sb.toString();
    }

    @Override
    public String toDefault(String langTokens)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<langTokens.length();i++)
        {
            sb.append((char)(langTokens.charAt(i)-3));
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        Alien a=new Alien();
        String x="java";
        String y="mdyd";

        x=a.fromDefault(x);
        y=a.toDefault(y);

        System.out.println(y);
        System.out.println(x);
    }
}
