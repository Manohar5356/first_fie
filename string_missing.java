class Missing
{
   public static void main(String args[])
   {
      String s ="a lazy dog",s2=""; 
      for(int x=0;x<=s.length()-1;x++)
      {
            char letter = s.charAt(x);
           if(s.indexOf(letter)==s.lastIndexOf(letter))
           {
                   if(s2.indexOf(letter)==-1)
                   {
                      s2=s2+letter;
                   }
           }
       }
         System.out.println(s2);
      
   }
}