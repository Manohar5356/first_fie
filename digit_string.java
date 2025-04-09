class Digitstring
{
    public static void main(String args[])
    {
        String s = "A1b2c3d4 4321";
        String digit="";
        String rev="";
        for(int x=0;x<=s.length()-1;x++)
        {
            char letter = s.charAt(x);
            if(letter>='0' && letter <='9')
            {
                  digit=digit+letter;
            }
        }
        for(int x=digit.length()-1;x>=0;x--)
        {
            char letter =s.charAt(x);
            rev=rev+letter;
        }
        System.out.println(s.equals(rev)?"palindrome":"not a palindrome");
    }
}