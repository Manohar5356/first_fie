class ArrayRecursion
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5};
       Check c = new Check();
      // for(int temp:a)
       {
         c.sum(a,0,0);
       } 
    }
}

class Check
{
    void sum(int a[],int start,int sum)
    {
       if(start==a.length)
       {
         System.out.println(sum);
       }
       else
       {
            sum=sum+a[start];
            sum(a,start+1,sum);
       }
    
           
    }
}