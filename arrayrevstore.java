import java.util.Scanner;
class Arrayrev
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int a[]={10,20,30,40,50};
       int b[]=new int[a.length];
       for(int x=a.length-1,y=0;x>=0;x--,y++)
       {
              b[y]=a[x];
            System.out.println(b[y]);
        }
        
       
      
       
           
    }
}