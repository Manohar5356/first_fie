import java.util.Scanner;
 class Evil
{
    public static void main(String args[])
    {
         Checkevil c = new Checkevil();
         Scanner sc = new Scanner(System.in);
         System.out.println("enter number");
         c.number=sc.nextInt();
         c.isEvil();
         int res =c.checkEvil();
         if(res==c.temp)
         {
              System.out.println(res+" EVIL NUMBER "+c.temp);
         } 
         else
         {
              System.out.println(res+" NOT A EVIL NUMBER "+c.temp);
         }
          
         
    }
}

class Checkevil
{   
     int number,power,sum,temp;
    void isEvil()
    {
          temp=number;
         while(number!=0)
         {
            power=(int)Math.pow(number,2);
            number=number/10;  
         }
    } 
    int checkEvil()
   {
      while(power!=0)
      {
          int rem=power%10;
          sum=sum+rem;
          power=power/10;
           
      }
     return sum;
   }
}