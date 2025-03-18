import java.util.Scanner;
class Evenstrong1
{
  public static void main(String args[])
  {
     Scanner s =new Scanner(System.in);
     System.out.println("enter number :");
      int num=s.nextInt(),count=0,temp=num;
	System.out.println(num);
      while(num!=0)
      {
        count++;
        num=num/10;
      }
	System.out.println(count);
         if(count%2==0)
         {     
               num=temp;
              while(num!=0)
              {
                 int rem=num%100;
                 int n1=rem,sum=0;
                   while(n1!=0)
                   {
                      int r =n1%10,fact=1;
                      for(int x=1;x<=r;x++)
                      {
                         fact=fact*x;
                      } 
                       sum=sum+fact;
                        n1 = n1/10;
                   }
                   if(sum==rem)
                   {
                       System.out.println(sum+" strong "+rem);
                   }
		   else 
			System.out.println(rem +" not strong");
                   num=num/100;
                   
              }
            
         }
      
     
  }
}