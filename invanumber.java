import java.util.Scanner;
class Inva
{
   public static void main(String agrs[])
   {
       Inavnumber i = new Inavnumber();
       Scanner sc = new Scanner(System.in);
       i.number=sc.nextInt();
       i.isInva(); 
       i.checkInav();
       if(i.sum>9)
       {
            i.isInva();
             if(i.sum==1)
             {
              System.out.println("inav number");
              } 
             else
             {
                System.out.println("not inav number");
             }
       }
      
       
   }
}
 
class Inavnumber
{
   int number,sum,temp,count;
   void  isInva()
   {
      while(number!=0)
      {
          temp=number;
          int rem=number%10;
           sum=sum+rem;
          number=number/10;
      } 
   }
   void checkInav()
   {
         while(sum>9)
         {
            isInva();
            sum=sum/10;
         }
   }

    
}