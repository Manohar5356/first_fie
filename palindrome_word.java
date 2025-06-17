import java.util.Arrays;
class Word
{
    public static void main(String args[])
    {
          String s= "mom  dad";
          StringBuffer sb= new StringBuffer(s);
          sb.reverse();
          String s2 =sb.toString();
          String str[]=s2.split(" ");
          for(String t:str)
          {
              System.out.println(s);
            if(s==t)
            {
                 System.out.println(s+" palindrome "+t);
            }
          }
         
   
          
    }
}