class Main
{
     public static void main(String args[])
     {
         Empolyee emp = new Empolyee(1,"name","it");
         Empolyee emp1 = new Empolyee(2,"manohar","it1");
         Empolyee emp2 = new Empolyee(3,"pavan","it2");
        System.out.println(emp); 
         System.out.println(emp1); 
          System.out.println(emp2); 
        
     }
}

class Empolyee
{
     int empid;
      static String empname;
     static String depname;
     Empolyee(int empolyeeid,String name,String dep)
     {
          this.empid=empolyeeid;
          this.empname=name;
          this.depname=dep;
     }
     public String toString()
     {
        return "empid "+empid+" empname "+empname+" depname "+depname;
     }
    
}