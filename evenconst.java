class Evenconst
{
  public static void main(String args[])
  {
       Number n = new Number();
        int res= n.sum();
        if(n.temp==res)
         {
             System.out.println("plaindrome");
         }
         else
         {
             System.out.println("not plaindrome");
         }
     
  }
}

class Number
{
     int number,rev,temp=number,count;
     Number()
     {
        number=1001;
     }
     void count()
     {    temp=number;
         while(number!=0)
         {
            count++;
             number/=10;
         }
        return ;
     }
    
}