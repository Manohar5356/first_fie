class Arrayunqiue
{
   public static void main(String args[])
   {
      int a[]={50,10,10,20,20,20,20,20,11,20,43,43,43,16};
      int b[]= new int[a.length];
      int last=0;
      int max=0; 
      int leastcount=0;
      for(int x=0;x<=a.length-1;x++)
      {
          if(b[x]==1)
            continue;
            int count=1;
            for(int y=x+1;y<=a.length-1;y++)
            {
                 if(a[x]==a[y])
                 {
                      count++;
                      b[y]=1;
                 }
            }
            if(count>1)
            {
               //System.out.println(count);
              if(count%2==0)
              {
                 last=a[x];
                     System.out.println(last);
              }
            }
             // System.out.println(last);
         
      }
     // System.out.println(last);
   }
}
