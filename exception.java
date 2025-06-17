import java.util.Scanner; h
import java.io.FileNotFoundException;
import java.io.File;
class Main
{ 
   publlic static void main(String args[]) throws FileNotFoundException
   {
           File f = new File();
           Scanner sc = new Scanner(f);
           whlie(sc.hasNextLine())
           {
                  System.out.println(sc.nextLine());
           }
   }
}