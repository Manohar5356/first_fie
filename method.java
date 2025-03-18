class Method
{
  public static void main(String args[])
  {
    Demo s = new Demo();
    s.a=10;
    s.b=20;
    s.m1();
      
  }
}
class Demo
{
     int a,b;
    void m1()
    {
         System.out.println(a+b);
    }
}