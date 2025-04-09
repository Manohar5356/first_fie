class Checkp
{
    public static void main(String args[])
    {
        String s = "goog";
        String rev="";
        for(int x=s.length()-1;x>=0;x--)
        {
               char letter =s.charAt(x);
               rev=rev+letter;
        }
        System.out.println(s.equals(rev)?"palindrome":"not a palindrome");
    }
}