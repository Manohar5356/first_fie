class BinaryAcc
{
    public static void main(String args[])
    {
        int a[]={7,12,13,20,25,40,56,89};
        for(int x=0;x<=a.length-1;x++)
        {
            for(int y=0;y<=a.length-1;y++)
            {
                if(a[x]>a[y])
                {
                     int temp=a[x];
                     a[x]=a[y]; 
                     a[x]=temp;
                }
            }
        }
         int f=0;
         int l=a.length-1;
         int search =40;
         int m=0;
        while(f<=l)
        {
             m=(f+l)/2;
             if(search==a[m])
             {
                  System.out.println("element found "+a[m]);
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
               System.out.println("element not found "+a[m]);
        }
    }
}