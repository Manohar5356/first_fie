import java.util.Scan/
/ner;
class Inav
{
   public static void main(String agrs[])
   {
       Inavnumber i = new Inavnumber();
       Scanner sc = new Scanner(System.in);
       System.out.println("enter number");5
       i.number=sc.nextInt();
       i.isInva();
       i.checkInav();            
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
 
class Inavnumber
{
   int number,sum,temp;
   void  isInva()
   {
      while(number!=0)
      {
         int rem=number%10;
         sum=sum+rem;
        number=number/10;
      
      }
     System.out.println(sum); 
   }
   void checkInav()
   {
      while(sum>9)
      {
           isInva();
         sum=sum/10;
      }
      System.out.println(sum);
   }   
}