import java.util.Arrays;
class Anagram
{
   public static void main(String args[])
   {
       String s1="att";
       String s2="tat";
       char a[]=s1.toCharArray();
       char b[]=s2.toCharArray();
       Arrays.sort(a); 
       Arrays.sort(b);     
      System.out.println(Arrays.equals(a,b)?"anagram":"not an anagram");
   }
}