class Prime
{
   public static void main(String args[])
   {
      int num=14678 ;
      while(num!=0)
      {
           int rem=num%10;
           int count=0;
           for(int start=1;start<=rem;start++)
           {
               if(rem%start==0)
               {
                   count++;
               }
           }
         if(count==2)
         {
             System.out.println(rem+" is prime number");
           }
         num=num/10;
      }
   }
}mi89