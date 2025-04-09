class StaticQ
{
    public static void main(String args[])
    {
      Child m = new Child();
     m.add();
     m.m2(); 
   }
} 

 class Main
{
     static int x;
      void m1()
     {
         System.out.println("x");
     }
 
}

 class Child extends Main
{
       final static int x =11;
      final static void add()
     { 
        System.out.println(x+" c");
     }
      final static void m2()
     {
         System.out.println(x+" c1");
     }
 
}