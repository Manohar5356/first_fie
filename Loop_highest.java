class Highest
{
  public static void main(String args[])
  {
    int num=12,num1=15,start=0,end=1,count=0,max=0,smax=0;
    if(num<num1)
       start=num;
     else
        start=num1;
     while(start>=end)
     {
        if(num%start==0 && num1%start==0)
         {
              count++;
         }
           if(count==1)
         {
             max=start;  
         }
       else if(count==2)
        {
             smax=start;
        }
     start--;
     }
        System.out.println(max+" is highest");
        System.out.println(smax+" is second highest");
      
  }
}



class Check
{
 public static void main(String args[])
 {
   for(int x=1;x<=1000000000 ';x++)
   {
	int num=x,sum=0,count=0,temp=num;
	while(num!=0)
	{
		count++;
		num=num/10;
	}
	num=temp;
	while(num!=0)
	{
		int rem=num%10;
		sum=sum+(int)Math.pow(rem,count);
		num=num/10;
	}
    
	if(sum==temp)
		System.out.println(temp);
	}
 }
}