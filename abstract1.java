class Simple
{
    public static void main(String args[])
    {
         Child child = new Child();
         child.add();
    }
}

class Parent
{
     public final abstract void add();
}
class Child extends Parent
{

    public void add()
    {
         System.out.println("abstract method");
    }

}