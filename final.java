class Final
{
      final public static void main(String args[])
      {
         Child child = new Child();
         child.add(	);
         child.add(12);
      }
}
 class Parent
{
     
     final   void add()
    {
       
           System.out.println("x");
    }
}
 class Child extends Parent
{
  
     final void add(int z)
    {
         
           System.out.println(z);
    }  
}