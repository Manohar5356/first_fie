class Arraybubble
{
     public static void main(String args[])
     {
            int a[]={12,23,54,-1,43,32,1};
            for(int x=0;x<=a.length-2;x++)
            {
                for(int y=0;y<=a.length-2-x;y++)
                {
                    if(a[y]>a[y+1])
                    {
                       int temp=a[y];
                        a[y]=a[y+1];
                        a[y+1]=temp;
                    }
                }        
            }
           for(int x=0;x<=a.length-1;x++)
           {
                System.out.println(a[x]);
           }
     }
}