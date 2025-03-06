class Fizz 
{
  public static void main(String args[])
  {
      int num = 17;
      if(num%3==0 && num%5==0)
        {
          System.out.println("fizz and buzz");
        }
      else if(num%3==0)
         {
           System.out.println("fizz");
         } 
      else if(num%5==0)
          {
             System.out.println("buzz");
          }
      else
          {
            System.out.println(num);
          }
  }
}