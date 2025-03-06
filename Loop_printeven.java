class Loopeven
{
  public static void main(String args[])
  {
       int start=1,end=100,sum=0,temp=start;
        long product=1l;
       while(start<=end)
       {
           int num=start;
           if(num%2==0)
             {
               sum=sum+num;
             }
           else
             {
                product=product*num;
             }
           start++;
       }
     System.out.println("sum of even number between "+temp+" and "+end+" is "+sum);
     System.out.println("sum of odd number between "+temp+" and "+end+" is "+product);
  }
}