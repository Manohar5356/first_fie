class Simplestring
{
   public static void main(String args[])
   {
          String s = "hello all @ goodmorning 123";
          System.out.println(s.length());
          int digit=0,vowel=0,consoants=0,capital=0,small=0,space=0,symbols=0;
          for(int x=0;x<=s.length()-1;x++)
          {
                char letter = s.charAt(x);
                if(letter>='0'&&letter<='9')
                {
                    digit++;
                }
                else if(letter>='A' && letter<='Z')
                {
                    capital++;
                    if(letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U')
                    {
                           vowel++;
                    }
                    else
                    {
                        consoants++;
                    }
                }
                else if(letter>='a' && letter<='z')
                {
                    small++;
                    if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u')
                    {
                           vowel++;
                    }
                    else
                    {
                        consoants++;
                    }
                }
                 else if(letter==' ')
                 {
                       space++;
                 }
                 else
                 {
                       symbols++;
                 }
          }
           System.out.println("no of digits "+digit);
           System.out.println("no of capital letters "+capital);
           System.out.println("no of small letter "+small);
           System.out.println("no of vowels "+vowel);
           System.out.println("no of consoants "+consoants);
           System.out.println("no of space "+space);
           System.out.println("no of symbols "+symbols);
   }
}
 