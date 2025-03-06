class Check
{
  public static void main(String args[])
  {
     char letter = '*';
     if(letter>='A' && letter<='Z')
         {
           System.out.println("captial letter");
         }
     else if(letter>='a' && letter<='z')
          {
             System.out.println("small letter");
          }
     else if(letter>=0 && letter<10)
          {
             System.out.println("digit");
          }
     else if(letter==' ')
          { 
             System.out.println("space");
          }
     else
         {
            System.out.println("symbol");
         }
  }
}