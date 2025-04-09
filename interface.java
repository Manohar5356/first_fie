class Inter
{
    public static void main(String args[])
    {
        Mani mani = new ManiImpl();
        mani.m1();
        mani.m2();
    }
}
class ManiImpl implements Mani
{
   public void m1()
   {
        System.out.println("m1");
   }
   public  void m2()
   {
        System.out.println("m2");
   }
}
interface Mani
{
    public void m1();
  
   public  void m2();
}

