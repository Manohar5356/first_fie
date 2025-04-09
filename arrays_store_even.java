class Arrayeven
{
    public static void main(String args[])
    {
        int a[]={10,20,30,40,50,55,45,23,43,5,67,8,9,3};
        int b[]= new int[a.length];
        int y=0;
        for(int x=0;x<=a.length-1;x++)
        {
             if(a[x]%2==0)
             {
                 b[y]=a[x];
              
                System.out.println("b["+y+"]="+b[y]+" even");
                y++;
             }
        }
          
       for(int x=0;x<=a.length-1;x++)
        {
             if(a[x]%2!=0)
             {
                 b[y]=a[x];
                 System.out.println("b["+y+"]="+b[y]+" odd");
		y++;
             }
        }
    }
}