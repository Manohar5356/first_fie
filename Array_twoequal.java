class Arraytwo
{ 
   public static void main(String args[])
   {
       int a[] = {10,12,30};
       int b[] = {30,11,20};
       if(a.length==b.length)
       {   int y = 0;
           for(int x=0;x<=a.length-1;x++)
           {
                if(a[x]==a[y])
                {
                       System.out.println("equal");
                }
               
           }
       }
       else
       {
             System.out.println("not equal");
       }

   }
}