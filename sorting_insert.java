class Sorting_insert
{
   public static void main(String args[])
   {
         int a[]={15,43,23,12,16};
         int search = 23;
         int index = 0;
         for(int x=0;x<=a.length-1;x++)
         {
               if(search==a[x])
               {
                   index=x;
               }
             
         }
         for(int i=index;i<a.length-1;i++)
         { 
              a[i]=a[i+1];
         }
         for(int x=0;x<a.length-1;x++)
         {
           System.out.println(a[x]);
         }
       
         
   }
}