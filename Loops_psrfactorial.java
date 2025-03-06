class Loopprs
{
  public static void main(String args[])
   {
    int n=5,r=3,nr=n-r;
    int start=1,end=n,n_product=1;
    while(start<=end)
      {
          n_product=n_product*start;
          start++;
      }
      System.out.println(n+" factorial "+n_product);
      int nr_start=1,nr_end=nr,nr_product=1; 
      while(nr_start<=nr_end)
          {
             nr_product=nr_product*nr_start;
              nr_start++;
          }
      System.out.println(n+ " factorial "+nr_product);
      System.out.println(n_product/nr_product);
     
   }
}