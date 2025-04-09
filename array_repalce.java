class Arrayrepalce
{
   public static void main(String args[])
  {
       int a[]={10,20,30,40,50};
       int y=0,t=0;
       for(int x=0;x<a.length;x++)
       {
             
           t=a[x];
           a[x]=a[a.length-1];
          a[a.length-1]=t;
          System.out.println(a[x]);                                  
          
       }
  }
}