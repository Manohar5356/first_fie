class Strong
{
  public static void main(String args[])
  {
      int num=145,sum=0,temp=num;
      while(num!=0)
      {
         int rem=num%10;
          int pro=1;
         for(int x=1;x<=rem;x++)
         {
             pro=pro*x;
           
         }
           if(pro==rem)
           {
             System.out.println(rem+" is equal to "+pro);
           }
          sum=sum+pro;
           num=num/10;
      }
      System.out.println(sum==temp?temp+" strong "+sum:"not strong");
  }
}