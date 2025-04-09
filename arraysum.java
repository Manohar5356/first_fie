import java.util.Scanner;
class Arraysum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter array elements");
         int sum=0;
        for(int x=0;x<=arr.length-1;x++)
        {
               arr[x]=sc.nextInt();
               sum=sum+arr[x];
        }
        
              System.out.println(sum);
          
        
 

         
    }
}