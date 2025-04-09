class Array
{
  public static void main(String args[])
  {
     Number n = new Number();
     n.x=10;
  }
}

class Number
{
    int x;
    void add()
    {
    
    }
    void add(int x)
    {
        System.out.println("int"+x);
    }
    void add(byte x)
    {
      System.out.println("byte"+x);
    }
    viod add(short x)
    {
       System.out.println("short"+x);
    }
    void add(double x)
    {
       System.out.println("double"+x);
    }
    void add(float x);
    {
       System.out.println("flaot"+x);
    }
    void add(char x)
    {
       System.out.println("char"+x);
    }
}