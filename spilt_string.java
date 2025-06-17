
class Splitstring
{
    public static void main(String args[])
    {
       String s="vital informations conformation resources under seize"; String max_word=" ";
       int max_length=0;
       String str[]=s.split(" ");
       for(String t:str)
       { 
           String s2=t;   
           if(max_length<=s.length())
           {  
                 if(max_length<s2.length())
                 max_length=s2.length();
                 max_word=s2;
           }
           else
            max_word=max_word+" "+s2;
           
           

     }
         System.out.println(max_word);

     }
}