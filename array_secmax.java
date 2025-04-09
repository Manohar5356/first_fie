class Arraymax2
{
   public static void main(String args[])
   {
      Arraymax2 max = new Arraymax2();
      int a[]=new int[]{1,2,3,4,5,6,32,54,67,878,89,989};
      max.max(a);
   
   }
   void max(int a[])
   {
      int max=Integer.MIN_VALUE,secondmax=Integer.MIN_VALUE;
        for(int x=0;x<a.length;x++)
        {
            if(max<a[x])
            {
                max=a[x];
            }
        }
        System.out.println("first max "+max);
        for(int x=0;x<a.length;x++)
        {
            if(secondmax<a[x] && max!=a[x])
            {
                secondmax=a[x];
            }
        }
       System.out.println("second max "+secondmax);
   }
}