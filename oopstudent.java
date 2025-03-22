import java.util.Scanner;
class Student
{
  public static void main(String args[])
  {
     Demo demo = new Demo();
     Scanner s = new Scanner(System.in); 
      System.out.println("ENTER MARKS");
     demo.roll=1;demo.name="manohar";demo.m1=s.nextInt();demo.m2=s.nextInt();demo.m3=s.nextInt();
     demo.calTotal();
     demo.calPer();
     demo.calSchoolarship();
  }
}

class Demo
{
     int roll,m1,m2,m3,total;
     String name;
     double percentage;
     void calTotal()
     {
         total = m1+m2+m3;
         System.out.println("total marks  "+total);
     }
     void calPer()
     {
        percentage=total/300.0*100;
        System.out.println("PERCENTAGE  "+percentage);
     }
     void calSchoolarship()
     {
         if(percentage>=90 && percentage<=100)
         {
               char section='A';
               System.out.println("SECTION"+" "+section+" "+"schoolarship given 20000");
         }
         else if(percentage>=80 && percentage<90)
         {
                char section='B';
               System.out.println("SECTION"+" "+section+" "+"schoolarship given  15000");
         }
         else if(percentage>=70 && percentage<80)
         {
               char section='C';
               System.out.println("SECTION"+" "+section+" "+"schoolarship given  10000");
         }
         else if(percentage>=60 && percentage<70)
         {
               char section='D';
               System.out.println("SECTION"+" "+section+" "+"schoolarship given  5000");
         }
         else
         {
                  System.out.println("not eligile for schoolarship");
         }
     }
}