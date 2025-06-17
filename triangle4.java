class Pattern
{
   public static void main(String args[])
   {
        int row=5,col=5;
      
       for(int r=1;r<=row;r++)
       {
         int temp=r;
           for(int c=r;c>=1;c--)
           {
              System.out.print(temp+" ");
              temp++;
           } 
            
          System.out.println();
       }
   }
}