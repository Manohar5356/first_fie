class Loopfizz
{
  public static void main(String args[])
   {
     int start=1,end=100;
     while(start<=end)
       {
          int num=start;
           if(num%3==0 && num%5==0)
             { 
                System.out.println(num +"fizz buzz");
             }
          else if(num%3==0)
             {
                 System.out.println(num +" fizz");
             }
          else if(num%5==0)
             {
                System.out.println(num +"buzz");
             }
            else
              {
                  System.out.println(num);
              }
          start++;
       }
   }
}
