import java.util.Scanner;
class BinaryDec
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter size");
      int size=sc.nextInt();
      int a[] = new int[size];
      BinaryDec bin = new BinaryDec();
      System.out.println("enter elements");
      for(int x=0;x<=a.length-1;x++)
      {
            a[x]=sc.nextInt();
      }
      bin.sorting(a);
      bin.binary(a);
       
       
   }
   void sorting(int a[])
   {
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
        for(int x=0;x<=a.length-1;x++)
        {
            System.out.println(a[x]);
        }
   }
   int search=12,m=0;
   void binary(int a[])
   {
      int f=0;
      int l=a.length-1;
       while(f<=l)
       {
           int  m=(f+l)/2;
           if(search==a[m])
           {
               System.out.println("element fount "+a[m]);
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
       if(f>l)
       {
           System.out.println("element not found "+a[m]);
       }
   }
}