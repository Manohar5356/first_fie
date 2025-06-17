class Pattern
{
   public static void main(String args[])
   {
        int row=5,col=5;
       for(int r=1;r<=row;r++)
       {
          
           for(int c=r;c>=1;c--)
           {
              System.out.print(c+" ");
           } 
          System.out.println();
       }
   }
}