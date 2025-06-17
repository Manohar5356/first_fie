class Pattern
{
   public static void main(String args[])
   {
        int row=4,col=4;
       for(int r=1;r<=row;r++)
       {
           int temp=1;
           for(int c=1;c<=r;c++)
           {
             if(c==1||c==r||r==row)
             {
                 System.out.print(c+" ");
                 
             }
              else
             {
                  System.out.print(" "+" ");
             }
           } 
          System.out.println();
       }
   }
}	