class Pattern
{
   public static void main(String args[])
   {  
        int row=5,col=5;
        int temp=1,sum=0;
       for(int r=1;r<=row;r++)
       {
           temp=temp+r;
	   sum=temp;
       
           for(int c=1;c<=r;c++)
           {
              temp--;
             System.out.print(temp+" ");
//             temp++;
             
           } 
           temp=sum;
          System.out.println();
       }
   }
}	