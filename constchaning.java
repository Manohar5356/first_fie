class Chaining 
{
  public static void main(String args[])
  {
   
  }
}

class Product
{
   int id;String name;
   Product()
   {
      this(10);
      System.out.println("default const");
   }
   Product(int id)
   {
      this(10,"gdfgdf");
      System.out.println("parameterized-->int"); 
   }
   Product(int id,String name)
   {
       System.out.println("parameterzied-->int String");
   }
 
}