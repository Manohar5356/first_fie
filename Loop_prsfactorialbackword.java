class Loopbackword
{
   public static void main(String arhs[])
   {
      int start=5,end=1,n_product=1;
      while(start>=end)
          {
             n_product=n_product*start;
             System.out.println(start+" factorial "+n_product);
             start--;
          }
   }

}