public class Poly
{
    public static void main(String args[])
    {
       Poly p = new Poly();
       p.m1("s",1);
       Main main = new Main();
       main.m1("s",1);
    }
    void m1(int a)
    {
          System.out.println("Manohar");
    }
    void m1(String x)
    {
         System.out.println("bandari");
    }
    void m1(String x,int a)
    {
         System.out.println("patel");
    }
}

 class Main
{
  void m1(String x,int a)
  {
       System.out.println("pa");
  }
}