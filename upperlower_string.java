class Upperlower
{
   public static void main(String args[])
   {
        String s = "aPpLE @ 1";
        String res="";
        for(int x=0;x<=s.length()-1;x++)
        {
              char letter =s.charAt(x);
              if(letter>='A' && letter<='Z')
              {
                   res =res+(char)(letter+32);  
              }
              else if(letter>='a' && letter<='z')
              {
                  res =res+ (char)(letter-32);                                         
              }
              else
              {
                  res=res+letter;
              }
        }
        System.out.println(res);
   }
}