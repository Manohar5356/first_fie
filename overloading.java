class Main
{
  public static void main(String args[])
  {
       Main main = new Main();
         main.m1();
       System.out.println(main.m1('m'));
     
  }
  void m1()
  {
      System.out.println("no parameter");
  }
  int m1(int x)
  {
      return x;
  }
  String m1(String x)
  {
     return "manohar";
  }
  char m1(char x)
  {
        return 'x';
  }
  
}