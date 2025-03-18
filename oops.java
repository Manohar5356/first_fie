class Sum
{
     String name;
     int roll;
    public static void main(String args[])
    {
         Student s1 =new Student();
          s1.roll=21;
          s1.name="manohar";
          System.out.println(s1.roll+" "+s1.name);
         Student s2 = new Student();
          s2.roll=53;
          s2.name="mani";
         System.out.println(s2.roll+" "+s2.name);
         Student s3 = new Student();
         s3.per=21;
         s3.per =23;
         System.out.println(s3.per+s3.per);
          Sum n =new Sum();
          n.name="pavan";
          n.roll=12;
         System.out.println(n.name+" "+n.roll);
        
    }
}

class Student
{
   int roll;
   String name;
   double per;
  
}