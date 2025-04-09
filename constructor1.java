class Const
{
  public static void main(String args[])
  { 
    Student s = new Student(int s.id);
    s.id=1;
    s.display();
    Student s1 = new Student( s1.name);
    s1.name="manohar";
    s1.display();
    Student s2 = new Student(s2.name);
    
    s2.name="mani";
    s2.display();

  }
}

class Student
{
    int id;String name;
    Student(int id)
    {
        this.id= id;
    }
    Student(String name)
    {
         this.name=name;
    }
    Student(int id,String name)
    {
         this.id=id;
         this.name=name;
    }
    void display()
    {
        System.out.println(id+"  "+name);
    }

}