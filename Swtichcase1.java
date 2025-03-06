class Case
{
  public static void main(String args[])
   {
      int num = 10;
      int num2 = 5;
      char symbol = '+';
      switch(symbol) {
               case '+':
                    System.out.println(num+num2);
                      break;
                case '-':
                      System.out.println(num-num2);
                       break;
                 case '*':
                     System.out.println(num*num2);
                      break;
                case '/':
                     System.out.println(num/num2);
                     break;
               case '%':
                     System.out.println(num%num2);
                     break;
               default :
                     System.out.println(symbol);
                     break;
       }
   }
}
 