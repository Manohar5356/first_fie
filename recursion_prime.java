class Recursion
{
   public static void main(String args[])
   {
       int a[] = {121,101,23,54,77,3};
       Check c = new Check();
       for(int temp:a)
        {
           c.prime(temp,1,0);
        }
      System.out.println("palindrome number");
        
       for(int temp:a)
         c.palindrome(temp,0,temp);
   }
}
class Check
{
   void prime(int n,int start,int count)
   {
       if(start>n)
       {
          if(count==2)
          {
               System.out.println(n+" prime number");
          }
        
       }
       else
       {
            if(n%start==0)
            {
                count++;
            }
            prime(n,start+1,count);
       }
   }
 void palindrome(int num,int rev,int temp)
 {
   if(num==0)
   {
      if(temp==rev)
      {
           System.out.println(temp+" is a palindrome");
      } 
   }
   else
   {
        int rem=num%10;
        rev=rev*10+rem;
        num=num/10;
        palindrome(num,rev,temp);
   }

 }
}