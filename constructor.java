class Constr
{
  public static void main(String args[])
  {
    Student student = new Student();
    student.print();
    Student student1 = new Student(11,"pavan","pavan@gamil.com","A",312);
    student1.print();
    Student student2 = new Student(11,"pav","pav@gamil.com","A",379);
    student2.print();
       
  }
}

class Student
{
    int roll;
    String name,email,section;
    double marks;
   Student(int r,String n,String e,String s,double m)
       roll=r; 
       name=n;
       email=e;
       section=s;
       marks=m;=0                   	    
       
   }
   Student()
   {
      roll=10;
      name="manohar";
      email="manohar@gamil.com";
      section="A";
      marks=747;
   }
   

   // using this keyword 
   void print()
   {
        System.out.println(roll+" "+name+" "+email+" "+section+" "+marks); 
   }
}