import java.util.Scanner;
class Method
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      System.out.println("ENTER NUMBER");
      Loop ob = new Loop();
      ob.num=s.nextInt();
      ob.extraction();
   }
}

class Loop
{ 
     int num,count=0,temp=0;
     void extraction()
     {
       int temp=num;
        while(num!=0)
        {
        int rem=num%10;
          
          for(int x=1;x<=rem;x++)
          {
              if(rem%x==0)
              {
                count++;
              
              }
          }
        num=num/10;
         }
         if(count==2)
         {
              System.out.println("Prime");
         } 
        else
         {
            System.out.println("not prime");
         }
     }
    
}



ublic class Model1 {

	public static void main(String[] args) {
		 Demo d = new Demo();
         System.out.println(d.m1()+" "+d.m2());
         System.out.println(d.m3());
         System.out.println(d.m4()+" "+d.m5());

	}

}

class Demo
{
    int m1()
    {
    	return 232+33-22;
    }
    double m2()
    {
    	return 3.232+232;
    }
    boolean m3()
    {
    	return 12>13;
    }
    String m4()
    {
    	return "manohar";
    }
    char m5()
    {
    	return 'm';
    }
}