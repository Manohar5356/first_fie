class Looptable
{
  public static void main(String args[])
  {
     int start=1,end=10,table=2,product=0;
     while(start<=end)
       {
         product=table*start;
         System.out.println(table+"X"+start+"="+product);
         start++;
       }
  }
}