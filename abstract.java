class Sample
{
   public static void main(String args[])
   {
       Child child = new Child();
        System.out.println(child.add());
         System.out.println(child.sub());
          System.out.println(child.mul());
         System.out.println(child.div());
          System.out.println(child.mod());
   } 
}

abstract class Parent
{
    int a;
    int b;
   Parent()
   {
      a=10;
      b=20;
   }
   int add()
   {
       return (a+b);
   }
    abstract int  sub();
   int mul()
   {
         return (a*b);
   }

        
}
class Child extends Parent
{
     int x;
     int y;
     Child()
     {
          x=12;
          y=10;
     }
     int div()
     {
          return (x/y);
     }
     int mod()
     {
       return (x%y);
     }
     public int sub()
     {
       return super.a-super.b;
     }
}