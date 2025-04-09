import java.util.Scanner;
class Arraymethod1
{
  public static void main(String args[])
  {
	Main main=new Main();
         Scanner sc = new Scanner(System.in);
          System.out.println("enter size");
         int size = sc.nextInt();
	int a[] = new int[size];
        main.search(a);
        
   
  }
}
 
class Main 
{
    void search(int[] a)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements");
        
        for(int x=0;x<a.length;x++)
        {
           a[x]=sc.nextInt();
        }
        System.out.println("enter search");
        int search=sc.nextInt(),count=0;
        for(int x=0;x<a.length;x++)
        {
            
            if(a[x]==search)
		{
			count++;
			break;
		}
        }
	if(count>0)
	{
		System.out.println("element found");
	}
	else
		System.out.println("element not found");
    }
}