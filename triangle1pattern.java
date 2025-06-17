class Pattern
{
   public static void main(String args[])
   {  
        int row=5,col=5;
        int temp=1,temp1=row;
       for(int r=1;r<=row;r++)
       {
          for(int c=1;c<=r;c++)
          {
              if(r%2!=0)
              {
                  System.out.print(temp+" ");
                  temp++;
              }
              else
              {
                  System.out.print(temp1+" ");
                  
              }
              temp1++;
          }
         System.out.println();
       }
   }
}	