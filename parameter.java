class Method {

	public static void main(String[] args)
	{
              Para para = new Para();
              para.m1(10,2.0);
               Prime p= new Prime();
               p.isPrime(3);
              
	}

}
class Para
{
	void m1(int a,String b)
	{
	   System.out.println(a+" "+b);
	}
	void m1(char a,int b)
	{
		System.out.println(a+" "+b);
		
	}
	void m1(int a,double b)
	{
		System.out.println(a+" "+b);
	}
	void m1(int a,long b)
	{
		System.out.println("int "+a+" "+"long "+b);
	}
	
}
class Prime
{
       int count=0;
      void isPrime(int n)
      {
          for(int x=1;x<=n;x++)
          {
               if(n%x==0)
                {
                     count++;

                }
          }
          if(count==2)
          {
             System.out.println("PRIME");
          }
         else
         {
                System.out.println("not");
         }
      }
}
