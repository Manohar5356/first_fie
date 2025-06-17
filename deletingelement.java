//deleting element
class Delete
{
    public static void main(String args[])
    {
         int a[] = {10,20,30,40,50};
         int n=30;
         
         int b[]=new int[a.length-1];
int y=0;
          for(int x=0;x<a.length;x++)
          {
           
              if(a[x]==n)
              { 
                   continue;
            
               } 
              else
              {
                 b[y]=a[x];
                 y++;
              }
          }
         for(int x=0;x<b.length;x++)
          {
                System.out.println(b[x]);
          }
    }
}