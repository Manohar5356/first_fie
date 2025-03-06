//check even or odd
//a)if number is even print check perfect sqaure or not
//b)if number is odd print check divisble with 5 or not

class Nested
{
   public static void main(String args[])
   {
     int num = 15;
     if(num%2==0)
       {
          double sqaure=Math.sqrt(num);
          if(sqaure==(int)sqaure)
            {
               System.out.println(num+" even & perfect sqaure");
            }
          else
            {
               System.out.println(num+" even & not a perfect sqaure");
            }
          
       }
     else
       {
           int num2 = num%10;
           if(num2%5==0)
             {
               System.out.println(num +" odd & is divisible by 5");
             }
            else
             {
               System.out.println(num+ " odd & is not a divisible by 5");
             }
 
       }
   }
}


//_____________________________

class Check
{
  public static void main(String args[])
  {
    int num = 17;
    double sqaure = Math.sqrt(num);
    int num2 = num%10;
    String status =(num%2==0)?(sqaure==(int)sqaure)?num+" even & perfect sqaure":num+" even & is not a  perfect sqaure":num2%5==0?num +" odd & is divisible by 5":num +" odd & is not a divisible by 5";
       System.out.println(status);
    
  }

}