class Digit
{
  public static void main(String args[])
  {
    int num = -2456;
    if(num>=0 && num<10)
       {
        System.out.println(num);
       }
    else if(num>=10 && num < 99)
      {
         System.out.println(num%10);
      } 
    else if(num>=100 && num<=999)
       {
         System.out.println(num%100);
       }
    else
       {
         System.out.println("above thriple");
       }
   
  }
}