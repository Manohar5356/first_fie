class Looplastdigit
{
  public static void main(String args[])
  {
     int n=11,n1=15;
     int start=n,end=n1,lastdigit=1;
     while(start<=end)
        {
           lastdigit=start%10;
          //System.out.println(start+" last digit "+lastdigit);
           start++;
        }
        System.out.println("last digit "+lastdigit);
  }
}