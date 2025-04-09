import java.util.Scanner;
class SortingDec
{
    public static void main(String args[])
    {
       Scanner sc =new Scanner(System.in);
       System.out.println("enter size");
       int size=sc.nextInt();
       int a[]=new int[size];
       System.out.println("enter elements");
        for(int x=0;x<=a.length-1;x++)
        {
           a[x]=sc.nextInt();
        }
       SortingDec sorting = new SortingDec();
       System.out.println("after sorting");
       int result[] = sorting.sortingDec(a);
        int secmax=Integer.MIN_VALUE;
       for(int x=0;x<=result.length-1;x++)
       {
            if(result[x]!=result[0])
            secmax =result[x];
            //System.out.println("second max "+secmax); 
       }
       System.out.println("second max "+secmax); 

       
       
          
    }
    int[] sortingDec(int a[])
    {
         for(int x=0;x<=a.length-2;x++)
         {
             for(int y=x+1;y<=a.length-1;y++)
             {
                   if(a[x]<a[y])
                   {
                       int temp=a[x];
                       a[x]=a[y];
                       a[y]=temp;
                      
                   }
             }
         }
	return a;
    }
    

}