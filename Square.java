class Square 
{
 public static void main(String args[]) // perfect square or not   
  {
   int num = 16;
   double num2 = Math.sqrt(num);//
   //double num3=num2*num2;//
   if(num==num2*num2)
   {
       System.out.println(num + " is a perfect square");
   }else
    {
     System.out.println(num + " is not a perfect square");
     }
   
  }
}

