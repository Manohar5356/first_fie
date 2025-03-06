class Statement2 
{
 public static void main(String args[])
  {
   String gender="male";
   int fee = 50000;
   int scholarship=0;
   if(gender=="female")
    {
      scholarship=20000;
      int female_fee = (fee - scholarship);
      System.out.println("scholarship " + female_fee + "because of female");
    }else 
      {
         scholarship=15000;
          int male_fee = (fee-scholarship);
       System.out.println("scholarship " + male_fee + "because of male");
 
      }
   }
 }