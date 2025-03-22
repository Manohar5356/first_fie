class Parameter
{
  public static void main(String args[])
  {
       Check c = new Check();
       int res = c.rev(133);
       System.out.println(c.isPlan(res,133));
      
  }
}

class Check
{
       int temp,rev;
      
      int rev(int num)
      {
          temp=num;
          while(num!=0)
          {
             
             int rem=num%10;
             rev=rev*10+rem;
             num=num/10;
          }
         return rev;
      }
      String isPlan(int rev,int num)
    {
          num=temp;
          if(rev==num)
          {
              return "is plaindrome";
          }
          else
          {
               return "not is plaindrome";
          }
    }
}