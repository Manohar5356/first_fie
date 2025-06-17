class Pattern
{
   public static void main(String args[])
   {
        int row=5,col=5;
         int temp=0;
       for(int r=row;r>=1;r--)
       {
         
           for(int c=1;c<=r;c++)
           {
              System.out.print(temp+" ");
               temp++;
           } 
          System.out.println();
       }
   }
}