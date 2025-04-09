class Inav
{
  public static void main(String args[])
  {
       
  }
}

class Number
{
   int countDigit()
   {
       int count=0;
       while(num!=0)
       {
         count++;
         num=num/10;
       }
      return count;
   }
   int sumDigit()
   {
       int sum=0;
       while(num>0)
       {
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
       }
   }
   
}