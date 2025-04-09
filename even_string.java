class Evenstring
{
   public static void main(String args[])
   {
      String s ="HELLO ALL";
      String s1="";
      String s2="";
      String s3="";
      String rev="";
      for(int x=0;x<=s.length()-1;x++)
      {
          if(x%2==0)
          {
               s1=s1+s.charAt(x);
             
          }
          else
          {
               s2=s2+s.charAt(x);
          }
      } 
      s1=s1.toLowerCase();
      System.out.println(s1);
      System.out.println(s2);
      s3=s1+s2;
      System.out.println(s3);
   }
}