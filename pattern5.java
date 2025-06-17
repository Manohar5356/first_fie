class Pattern
{
  public static void main(String args[])
  {
     
      for(char r='A';r<='D';r++)
      {
          char letter =r; 
         for(char c='A';c<='D';c++)
         {
            System.out.print(letter+" ");
            letter++;
       
         }
         System.out.println();
      }
  }
}