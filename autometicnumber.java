import java.util.Scanner;
class Automatic
{
    public static void main(String agrs[])
    {
         Auto a = new Auto();
         Scanner sc= new Scanner(System.in);
         System.out.println("enter number");
         a.number=sc.nextInt();
         int res = a.isAutomatic();
         int res1=res%100;
         if(res1==a.temp)
         {
             System.out.println("automatic number");
         }
         else
         {
              System.out.println("not a automatic number");
         }
      
    }
}

class Auto
{
      int number,square,temp;
     int isAutomatic()
     {
          temp=number;
          while(number!=0)
          {
               square=(number*number);								
               number=number/100; 
          }
         return square;
     }
    
}