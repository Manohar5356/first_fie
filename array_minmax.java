class Arrayminmax
{
  public static void main(String args[])
  {
          Arrayminmax arr = new Arrayminmax();
         int a[]={1,2,23,43,22,12};
          arr.max(a);
          arr.min(a);
         
   }
         int max=Integer.MIN_VALUE;
         int min=Integer.MAX_VALUE;
         int temp=0,y=0,z=0;
    void max(int a[])
    {
         for(int x=0;x<a.length;x++)
         {
               if(a[x]>max)
               {
                     max=a[x];
                     y=x;
               }
         }
    }
     void min(int a[])
     {
         for(int x=0;x<a.length;x++)
         {
              if(a[x]<min)
              {
                  min=a[x];
                  z=x;
              }
         }
      
          temp=a[y];
          a[y]=a[z];
          a[z]=temp;
          for(int x=0;x<a.length;x++)
          {
               System.out.println(a[x]);
          }
       }
        
}