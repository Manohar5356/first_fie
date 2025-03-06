class Value 
{
 public static void main(String args[]) 
  {
   int num = 102;
   char capital = 'M';
   char small = 'n';
   if(num>100) 
     {
       capital = (char)(capital+32);
       System.out.println(capital); 
     }else
      {
        small = (char)(small - 32);
        System.out.println(small);
       }
  }
}