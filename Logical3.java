class Converted
{
  public static void main(String args[])
   {
     char let = 'S';
     if(let>='A' && let<='Z')
        {
           let =(char)(let + 32);
           System.out.println(let);
        }  
     else if(let>='a' && let<='z')
         {
           let =(char)(let - 32);
           System.out.println(let);
         }
     else
         {
          System.out.println("invalid");
         }
  
   }
}