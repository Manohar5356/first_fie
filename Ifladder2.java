class Vowel
{
   public static void main(String args[])
   {
     char x = 'a';
     if(x=='a')
       {
          System.out.println("vowel");
       } 
    else if(x=='e')
       {
         System.out.println("vowel");
       }
    else if(x=='i')
       {
         System.out.println("vowel");
       }
    else if(x=='o')
       {
         System.out.println("vowel");
       }
    else if(x=='u')
       {
         System.out.println("vowel");
       }
    else 
       {
        System.out.println("cansonaant");
       }
   }
}


//______________________________2 method____________
 
class Logical
{
  public static void main(String args[])
   {
    char x = 'a';
    if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
      {
        System.out.println("vowel");
      }
    else 
      {
        System.out.println("cansonant");
      }
   }
}

//__________________________3 method____________


class Vowel1
{
   public static void main(String args[])
   {
    char x = 'a';
    String y = (x=='a'||x=='e'||x=='i'||x=='o'||x=='u')?"vowel":"cansonant";
     System.out.println(y);
  
   }
}