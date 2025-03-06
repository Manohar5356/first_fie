class Payment
{
  public static void main(String args[])
  {
    int age = 25;
    if(age>=60)
      {
         String gender = "female";
         if(gender=="female")
           {
              System.out.println("retirement amount of 30,000 you are female senior citizen");
           }
         else
           {
              System.out.println("retirement amount of 35,000 you are male senior citizen");
           }
       } 
       
    else if(age>=18)
           {
              String qulification ="UG";
              if(qulification=="UG")
                 
                   System.out.println("scholarship amount of 30k you are UG");
                 
              else if(qulification=="PG")
                
                    System.out.println("scholarship amount of 40k you are PG");
                
              else
                  
                    System.out.println("scholarship amount of 20k you are not UG and PG");
                  
           }

      
    else
      {
           System.out.println("your are not eligible for scholarship amount & retirement amount you are minor");
      }

  } 
     
}

//using trunary 
// ______________________________________

class Eligible
{
  public static void main(String args[])
   {
    int age = 25;
    String gender="female";
    String qulification = "UG";
    String eligible =(age>=60)?(gender=="female")?"retirement amount of 30,000 you are female senior citizen":"retirement amount of 35,000 you are male senior citizen":(age>=18)?(qulification=="UG")?"scholarship amount of 30k you are UG":qulification=="PG"?"scholarship amount of 40k you are PG":"scholarship amount of 20k you are not UG and PG":"your are not eligible for scholarship amount & retirement amount you are minor";
          System.out.println(eligible);
   }
}