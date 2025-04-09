class Arrayavg
{
  public static void main(String args[])
  {
       int a[]={10,20,30,40,50};
       int sum=0;
       for(int x=0;x<=a.length-1;x++)
       {
           sum=sum+a[x];
       }
       double avg = sum/a.length;
       System.out.println(avg);
  }
}