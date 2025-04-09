class Over
{
    public static void main(String args[])
    { 
       Parent parent = new Child();// Upcasting
       parent.m1(10);
    }
    
}
class Parent 
{
    void m1(int a)
  {
        System.out.println("parent-m1");
  }
}
class Child extends Parent
{
      protected void m1(int a)
     {
        System.out.println("child-m1");
     }
}