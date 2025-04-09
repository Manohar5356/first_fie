import java.util.Scanner;
class SortingAcc
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter elements");
     int a[]={14,21,13,16,18};
     SortingAcc sorting = new SortingAcc();
     sorting.sorting(a);
     for(int x=0;x<=a.length-1;x++)
     {
        System.out.println(a[x]);
     }
       
  }
   int temp;
  void sorting(int a[])
  {
      for(int x=0;x<=a.length-2;x++)
      {
           for(int y=x+1;y<=a.length-1;y++)
           {
                if(a[x]>a[y])
                {
                 temp=a[x];
                 a[x]=a[y];
                 a[y]=temp;
                }
           }
      }
  }  
}