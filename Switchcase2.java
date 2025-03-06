class Case
{
  public static void main(String args[])
  {
     int a = 10;
     int b = 15;
     char symbol = '>';
     switch(symbol) 
             {
               case '>':
                       String res = (a>b)?"a is greater":"b is smaller";
                       System.out.println(res);
                       break;
               case '<':
                       String res1=(a<b)?"a is smaller":"b is greater";
                       System.out.println(res1);
                       break;
               case  '=':
                       String res2=(a==b)?"both equal":"not equal";
                       System.out.println(res2);
                       break;
                default:
                        System.out.println(symbol);
             }
  }
}