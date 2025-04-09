import java.util.Arrays;
class Binarystring
{
   public static void main(String args[])
   {
      String s = "hello all good morning";
      char a[] =s.toCharArray();
      Arrays.sort(a);
      char search=' ';
      int f=0;
      int l=a.length-1;
      int m =0;
      while(f<=l)
      {
             m=(f+l)/2;
             if(search==a[m])
             {
                    System.out.println(search +" element found "+a[m]);
                     break;
             }
             else if(search>a[m])
             {
                f=m+1;
             }
             else
             {
                l=m-1;
             }
      }
      if(f>l)
      {
            System.out.println("element not found");
      }
   }
}