class Loopmathsqrt
{
  public static void main(String args[])
  { 
    int start=10,end=1,table=8,pro=1;
    while(start>=end)
    {
       pro=table*start;
       double square =Math.sqrt(pro);
       System.out.println(table+"X"+start+"="+square);
       start--;
    }
  }
}