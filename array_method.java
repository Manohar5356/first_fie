import java.util.Scanner;
class Arraymethod
{
  public static void main(String args[])
  {
       Main main = new Main();
       int a[] = new int[]{10,20,30,40};
       main.m1(a);
      
  }
}

class Main
{
   void m1(int[] a)
   {
       for(int x=0;x<a.length;x++) 
      {
           System.out.println(a[x]);
         
      }    
   }
}