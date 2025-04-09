class Main
{
   public static void main(String args[])
   {
        Child child = new Child();
        child.add();
        child.sub();
        child.mul();
        child.div();   
   }
}

class Child
{
     int x =10;
     static int  y = 20;
     static  int z=30;
     static final int i = 40;
     void add()
     {
            System.out.println(x+y+z+i);
     }
      static void sub()
     {
          System.out.println(x-y-z-i);
     }
     final void mul()
     {
          System.out.println(x*y*z*i);
     }
     static final  void div()
     {
            System.out.println(x/y/z/i);
     }
}