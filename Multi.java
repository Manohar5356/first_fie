class Main
{
    public static void main(String args[])
    {
        Sample sample = new Sample();
        Thread t1 = new Thread(sample,"mani");
        t1.start();
        Thread t2 = new Thread(sample,"manu");
        t2.start();
         
       
 
    }
}

class Sample implements Runnable
{
    public void run()
    {
        for(int x=0;x<=10;x++)
        {
             System.out.println(Thread.currentThread().getName());
        }
    }
}

