class Shop
{
 public static void main(String args[]) 
  {
   int costprice = 2599;
   int sellingprice = 3000;
   if(costprice<sellingprice)
    {
      int profit = sellingprice -costprice;
     System.out.println("seller made profit  " + profit);
    }else
      {
       int loss = costprice - sellingprice;
        System.out.println("seller made loss  " + loss); 
      }
   
  }
}