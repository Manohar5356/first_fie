class Looptable
{
  public static void main(String args[])
  { 
    int start=10,end=1,table=8,pro=1;
    while(start>=end)
    {  
       pro=table*start;
       int square= (int)Math.sqrt(pro);
       if(square*square==pro)
       System.out.println(table+"X"+start+"="+pro);
       start--;
    }
  }
}