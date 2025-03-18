import java.util.Scanner;
class Value
{
  public static void main(String args[])
  {
     Scanner s = new Scanner(System.in);
     System.out.println("enter the table");
     int table=s.nextInt(),start=1;
      System.out.println("enter table "+table+" th table");
     while(start<=10)
     {    
           int pro=table*start;
         System.out.println(table+"X"+start+"="+pro);
       start++;
     }
  }
}