import java.util.Scanner;
class Sample
{
  public static void main(String args[])
  {
      Scanner sc =new Scanner(System.in);
      System.out.println("enter number");
      int a[] ={10,20,30,40,50};
      int b[] = new int[a.length];
      for(int x=0,y=0;x<=a.length-1;x++,y++)
      {
          b[y]=a[x];
          System.out.println("b["+x+"]="+b[y]);
      }
     
      
  }
}