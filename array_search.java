import java.util.Scanner;
class Arraysearch
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      int a[]={9,8,7,6,5,4,3,2,1};
      System.out.println("enter search number");
      int search=sc.nextInt();
      for(int x=0;x<=a.length-1;x++)
      {
           if(search==a[x])
           {
                System.out.println(a[x]+" persent in array element "+search);
           }
         
      }
      
   }
}