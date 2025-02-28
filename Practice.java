class Shop
{
 public static void main(String args[]) 
  {
   int costprice = 2599;
   int sellingprice = 1499;
   if(costprice>sellingprice)
    {
      int profit = costprice - sellingprice;
     System.out.println("seller made profit" + profit);
    }else
      {
       int loss = costprice - sellingprice;
        System.out.println("seller made loss" + loss);
      }
   
  }
}