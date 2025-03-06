class Product
{
  public static void main(String args[])
  {
      String pname ="pens box";
      int pcode = 3245;
      int price = 350;
      int pquantity = 15;
      int ptotal = price*pquantity;
      double discount =0;
      if(ptotal>1000 && ptotal<2000)
         {
            discount=ptotal*10.0/100;
           //System.out.println(discount);
           //System.out.println("discount = "+discount);
         }
      else if(ptotal>2000 && ptotal<3000) 
          {
             discount = ptotal*15.0/100;
           //System.out.println(discount);
           //System.out.println("discount = "+discount);

          }
     else if(ptotal>3000 && ptotal<4000)
          {
              discount = ptotal*20.0/100;
           //System.out.println(discount);
           //System.out.println("discount1 = "+discount);

          }
    else if(ptotal>4000)
          {
              discount = ptotal*30.0/100;
              if(discount>=1400)
                {
                   discount=1400;
                }
         
           //System.out.println(discount);
           // System.out.println("discount2 ="+discount);

          }
      
   double finalprice = ptotal;
   double tax = finalprice*18.0/100;
   double bill =finalprice+tax;
    System.out.println("product name = "+pname);
    System.out.println("product code = "+pcode);
    System.out.println("product totalprice = "+ptotal);
    System.out.println("product tax = "+ tax);
    System.out.println("product discount = "+discount);
    System.out.println("product bill Amount = "+bill );
     
     
         
  }
}