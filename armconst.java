class Armconst
{
  public static void main(String args[])
  {
     Armstrong a = new Armstrong();
     a.count();
     int res=a.checkSum();
     if(res==a.temp)
     { 
         System.out.println("armstrong");
     } 
     else
     {
          System.out.println("not armstrong");
     }

  }
}

class Armstrong
{
    int number,count,sum,temp;
    Armstrong()
    {
        number=379;
        count=0;
        sum=0;
    }
   void count()
   {
     temp=number;
    while(number!=0)
    {
         count++;
         number/=10;
    }
   }
    int checkSum()
   {
      number=temp;
      while(number!=0)
     {
        int rem=number%10;
        int square =(int)Math.pow(rem,count);
        sum=sum+square;
        number=number/10;        
     }
    return sum; 
   }
}