import java.util.Scanner;
class Position
{
  public static void main(String args[])
  {
     Scanner s = new Scanner(System.in);
     System.out.println("enter number :" );
     int num=s.nextInt();
     System.out.println("enter digit position :");
     int digit= s.nextInt(),rem=0,count=0,rev=0,temp=num;
     while(num!=0)
     {
        rem=num%10;
        rev=rev*10+rem;
        num=num/10;
     }
      while(rev!=0)
      {
         rem=rev%10;
         
         count++;
         if(count==digit)
         {
            System.out.println(rem);
             break;
         }
          rev=rev/10;
      } 
       int temp2=temp,count2=0;
       while(temp2!=0)
       {
         int rem1=temp2%10;
          if(rem==rem1)
          {
                       count2++;

          }
          temp2=temp2/10;
          
       }
    System.out.println("as occured "+count2+" times");
  }
}