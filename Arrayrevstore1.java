
class Arrayrev1
{
    public static void main(String args[])
    {
      
       int a[]={10,20,30,40,50};
       int b[]={60,70,80,};
       int c[]= new int[a.length+b.length];
       int y=0;
       for(int x=0;x<=a.length-1;x++)
       {
           c[y]=a[x];
	   y++;
            
       }
	
       for(int x=0;x<=b.length-1;x++)
       {
            c[y]=b[x];
	    y++;
       }
        for(int x=0;x<=c.length-1;x++)
        {
             System.out.println(c[x]);
        }
        
    }
}