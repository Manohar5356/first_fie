class Student 
{
 public static void main(String args[])
 {
  int sub1 = 65;
  int sub2 = 37;
  int sub3 = 92;
  int total_marks = sub1+sub2+sub3;
  double percentage =(total_marks/3);
  if(sub1<35||sub2<35||sub3<35)
    {
     System.out.println("student fail");
    }
  else if(percentage<50)
    {
     System.out.println("Student total marks = "+ total_marks);
     System.out.println("student percentage = " + percentage);
     System.out.println("D grade");
    }
  else if(percentage<60)
    {
     System.out.println("Student total marks = "+ total_marks);
     System.out.println("student percentage = " + percentage);
     System.out.println("C grade");
    }
  else if(percentage<70)
    {
     System.out.println("Student total marks = "+ total_marks);
     System.out.println("student percentage = " + percentage);
     System.out.println("B grade");
    }
  else if(percentage < 80)
    {
      System.out.println("Student total marks = "+ total_marks);
     System.out.println("student percentage = " + percentage);
     System.out.println("A grade");
    }
  else if(percentage < 90)
    {
     System.out.println("Student total marks = "+ total_marks);
     System.out.println("student percentage = " + percentage);
     System.out.println("A+ grade");
    }
  else if(percentage<100)
    {
     System.out.println("Student total marks = "+ total_marks);
     System.out.println("student percentage = " + percentage);
     System.out.println("O grade");
    }
  else
    {
     System.out.println("invalid marks");
    }

 }
}