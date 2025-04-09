class Arraymin
{
   public static void main(String args[])
   {
       int a[] ={20,30,12,1};
       int min=Integer.MAX_VALUE;
       int secmin =Integer.MAX_VALUE;
       for(int x=0;x<a.length;x++)
       {
         if(a[x]<min)
         {
             min=a[x];
             
         }
       }
         System.out.println(min);
      for(int x=0;x<a.length;x++)
      {
           if(a[x]>min&&a[x]!=min)
           {
                 secmin=a[x];
           } 
      }
         System.out.println(secmin);
   }

 

}