import java.util.Scanner;
class Position
{
  public static void main(String args[])
  {
     Scanner s = new Scanner(System.in);
     System.out.println("enter number");
     int num=s.nextInt(),rem=0,rev=0,count=0, digit=s.nextInt();	
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
  }
}