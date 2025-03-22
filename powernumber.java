import java.util.Scanner;
class Power
{
   public static void main(String args[])
   {
       Powernumber p = new Powernumber();
       Scanner sc = new Scanner(System.in);
       System.out.println("enter number");
       p.number=sc.nextInt();
       p.isPower();
       p.checkPower();
       if(p.sum==p.pro)
       { 
              System.out.println("Power number");
       }
       else
       {
               System.out.println("not a Power number");
       }
   }
}

class Powernumber
{
   int number,rem,sum,pro=1,temp;
   void isPower()
   {
          temp=number;
       while(number!=0)
        {
            rem=number%10;
            sum=sum+rem;
            number=number/10;
       }
      // System.out.println(sum);
   }
   void checkPower()
   {
        number=temp;
       while(number!=0)
       {
            rem=number%10;
             pro=pro*rem;
            number=number/10;
         // System.out.println(pro);
       }
      
   }
}