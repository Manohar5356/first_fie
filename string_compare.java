	
class Compare
{
   public static void main(String args[])
   {
        String s="abab";
        String res="";
         for(int x=0;x<=s.length()-1;x++)
         {
            for(int y=x+1;y<=s.length()-1;y++)
            {
                    String sub=s.substring(x,y);
                    int count=0;
                    for(int i=0;i<=sub.length()-1;i++)
                    {
                            char letter = sub.charAt(i);
                           if(sub.indexOf(letter)!=sub.lastIndexOf(letter))
                           {
                                 count++;
                           }
                    }
                   if(count==0)
                   {
                       if(res.indexOf(sub)==-1)
                       res =res+sub+" ";
                   }
            }
               
         } 
         System.out.println(res);  
   } 
}