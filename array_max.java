class Arraymax
{
   public static void main(String args[])
   {
      
    int a[]={11,12,23,43,16,17};
    int max=Integer.MIN_VALUE;
    int y=0,position=0;
    for(int x=0;x<a.length;x++)
    {
          if(a[x]>max)
          {
               max=a[x];
               y=x; 
          } 
    }
     position=a[0];
     a[0]= a[y];                                                                                                                                                                                                                                                                                   nn                                                                                                                                                                                                                                                                                                                     
     a[y]=position; 
    for(int x=0;x<a.length;x++)
    {
      System.out.println(a[x]);
    }
 }
} 
   