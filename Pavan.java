class Case
{
  public static void main(String args[])
  {
     int a = 20;
     int b = 20;
     int c = 20;
     char symbol = '<';
     switch(symbol) 
             {
               case '>':
                       String res = (a>b && a>c)?"a is greater":"b is big";
                       System.out.println(res);
                       break;
               case '<':
                       String res1=(a<b && a<c)?"a is smaller":"b is small";
                       System.out.println(res1);
                       break;
               case  '=':
                       String res2=(a==b && a==c)?"both equal":"not equal";
                       System.out.println(res2);
                       break;
                default:
                        System.out.println(symbol);
             }
  }
}