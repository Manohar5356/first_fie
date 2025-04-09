import java.util.Arrays;
class Stringunique
{
   public static void main(String args[])
   {
        String s = "hello";
        char a[]=s.toCharArray();
        int b[]=new int[a.length];
        int count=1;
        for(int x=0;x<a.length;x++) 
        {
            count=1;
            if(b[x]==1)
             continue;
              for(int y=x+1;y<a.length;y++)
              {
                      if(a[x]==a[y])
                      {
                            count++;
                            b[y]=1;
                      }
              }
                if(count>1)
               {
                     System.out.println(a[x]);
               }
              System.out.println(a[x]+"  "+count);
            
        }
       
       
        
   }
}