import java.io.FileReader;
import java.io.FileNotFoundException;
class Check
{
     public static void main(String a)
     {
           Check b = new Check();
           b.m3();
     }
     void mani()throws FileNotFoundException 
     {
            main("pavan");
     }
     void m2() 
     { 
          mani();
     }
     void m3()
     {
		m2();
           FileReader fr = new FileReader("C:\\Users\\banda\\condinghubjava");
     }
}