class LogicalAnd
{
   public static void main(String args[])
   {
     int num = 27;
      int num2=num%10;
     if(num%3==0 && num%5==0)
       {
         System.out.println("fizz");
       }
     else if(num2%7==0 || num2%9==0)
          {
            System.out.println("buzz");
          }
     else
        {
         System.out.println(num+" not divible");
        }
   } 
}
