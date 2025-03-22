class Para
{
   public static void main(String args[])
   {
       Prime p = new Prime();
       int res = p.isPrime(8,0);
       System.out.println(p.checkPrime(res));
      
   }
}

class Prime
{
   int isPrime(int num,int count)
   {
       for(int x=1;x<=num;x++)
       {
          if(num%x==0)
           count++;
       }
     return count;
   }
   String checkPrime(int count)
   {
       if(count==2)
       {
               return "PRIME";
        }
        else
        {
                return "NOT PRIME";
        }
   }
}