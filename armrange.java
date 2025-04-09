class Armrange
{
    public static void main(String args[])
    {
       int res=0;
       Armstrong a = new Armstrong();
       for(int i=1;i<=400;i++)
       {
            a.number=i;
            a.count();
            res=a.checkSum();

       }
      
         if(res==a.temp)
     { 
         System.out.println(res +" armstrong");
     } 
     else
     {
          System.out.println(res+" not armstrong");
     }


    }
}

class Armstrong
{
    int number,count,temp, sum;
      void count()
   {
     temp=number;
    while(number!=0)
    {
         count++;
         number/=10;
    }
    System.out.println(count);
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
      System.out.println(sum);
    return sum;
   }

}