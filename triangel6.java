class Pattern
{
   public static void main(String args[])
   {
        int row=5,col=5;
         int temp=row+1;
       for(int r=1;r<=row;r++ )
       {
           temp=temp-r;
           for(int c=1;c<=r;c++)
           {
               System.out.print(temp+" ");
               temp++;
           } 
          System.out.println();
       }
   }
}