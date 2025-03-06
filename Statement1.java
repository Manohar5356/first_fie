//divisble by 3 or not
class Statement1
{
 public static void main(String args[])
 {
  int num = 23;
  if(num%3==0) 
   {
    System.out.println(num+" is divisible by" + 3);
   }else 
     {
       System.out.println(num+" is  divisible by" + 3);

      }
 }
}



class Statement2 
{
 public static void main(String args[])
  {
   String gender="female";
   int fee = 50000;
   int scholarship=0;
   if(gender=="female")
    {
      scholarship=20000;
      female_fee = (fee - scholarship);
      System.out.println("scholarship"+ female_fee + "because of female");
    }else 
      {
         scholarship=15000;
          male_fee = fee-scholarship;
       System.out.println("scholarship"+ male_fee + "because of male");
 
      }
   }
 }