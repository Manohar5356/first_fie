class Arraystore
{
   public static void main(String args[])
   {
       Arraystore arr = new Arraystore();     
        int a[] = {10,20,30,40,50,60,70,80,90};
       arr.even(a);
       arr.odd(a);
   }
    void even(int a[])
    {
        int b[]=new int[a.length];
          int y=0;
        for(int x=0;x<a.length;x++)
        {
              if(x%2==0)
              {
                  b[y]=a[x];
                  System.out.println("b["+y+"]= "+b[y]);
                  y++;
              }
           
        }
         System.out.println("odd");
    }
       void odd(int a[])
       {
              int c[]=new int[a.length];
             int z=0;
            for(int x=0;x<a.length;x++)
            {
              if(x%2!=0)
              {
                 c[z]=a[x];
                  System.out.println("c["+z+"]= "+c[z]);
                 z++;
              }
           }
       }   

}