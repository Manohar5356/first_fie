class Recursionarm
{
    public static void main(String args[])
    {
       Check c = new Check();
        int n=153;
        int countno=c.count(n,0);
         c.armStrong(n,0,countno);
    }
}
class Check
{
   int count=0;
   int count(int num,int count)
   {
      if(num==0)
      {
             return count;
      }
      else
      {
         int rem=num%10;
         count++;
         num=num/10;
        return count(num,count);
      }
   }
   
    int armStrong(int num,int sum,int count)
   {  
       this.sum=sum;
       
       if(num==0)
       {
          return sum;
       }
       else
       {
             int rem=num%10;
             int power = (int)Math.pow(rem,count);
             sum=sum+power;
              num=num/10;
             return armStrong(num,sum,count,temp);
       }
       int checkArm(int num,int sum)
       {
            if(num==sum)
            {
                System.out.println("Armstrong");
            }
       }
   }
    
}