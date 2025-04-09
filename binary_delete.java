import java.util.Scanner;
class Binary_delete
{
   public static void main(String args[])
   {
      int a[] = {21,12,43,22,56,13};
      for(int x=0;x<=a.length-1;x++)
      { 
          for(int y=0;y<=a.length-1;y++)
          {
                 if(a[x]<a[y])
                 {
                     int temp=a[x];
                      a[x]=a[y];
                      a[y]=temp;
                 }
          }
      }
       Scanner sc = new Scanner(System.in);
      int f=0;
      int l=a.length-1;
      int m =0;
      int index=0;
      int search=43;
      while(f<=l)
      {
            m=(f+l)/2;
            if(search==a[m])
            {
                 index=m;
                System.out.println(index);
                 break;
            }
            else if(search>a[m])
            {
                f=m+1;
            }
            else
            {
               l=m-1;  
            }
         
      }
        System.out.println("after" );
      for(int i=index;i<a.length-1;i++)
      {
           a[i]=a[i+1];
      }
       a[a.length-1]=0;
       for(int x=0;x<=a.length-1;x++)
       {
              System.out.println(a[x]);
       }

   }
}