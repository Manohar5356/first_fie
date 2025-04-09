class Array
{
   public static void main(String args[])
   {
       int a[][]= {{123},{456},{789}};
       int sum=0;
       for(int r=0;r<=a.length-1;r++)
       {
            for(int c=0;c<=a[r].length-1;c++)
            {
                  sum+=a[r][c];
            }
      ;'         
       }
        System.out.println(sum);
   }
}