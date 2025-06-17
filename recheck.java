class Check
{
    public static void main(String args[])
    {
      int a[]={1,22,16,19,20};
      int f=0;
      int l=a.length-1;
      int search = 22;
      while(f<=1)
      { 
            int m=(f+l)/2;
            if(search==a[m])
            {
              System.out.println("found "+a[m]);
              break; 
            }
            else if(search>a[m])
            {
                 f=m+1;
             }
              else
               {
                  l=m-1;
               }
      }
       if(f>l)
        {
              System.out.println("not found");
         }
    } 

}