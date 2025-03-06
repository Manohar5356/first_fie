class Number
{ 
  public static void main(String args[])
{
  int a = 20;
  int b = 20;
  if(a>b)
    {
      System.out.println(a+ " is a greater");
    }
  else if(a==b)
    {
      System.out.println("both are same");
    }
  else
     {
      System.out.println(b+ " is a greater");
     }
 }
}


//________________________________
// Using trunary operator 

class Operator
{ 
   public static void main(String args[])
  {
  int x = 11;
  int y = 10;
  String s =(x==y)?"equal":"not equal";
  System.out.println(s);
 }
}