 class Name
{ 
   int num;
   public static void main(String args[])
   {
     Name s = new Name();
     s.num=2;
     s.even ();
     s.prime();

   }
    void even()
   {
       if(num%2==0)
       {
            System.out.println("even number");
       }
       else
       {
        System.out.println("odd number");
       }
   }
   void prime()
   {
        int count=0;
      for(int i=2;i<=num/2;i++)
      {    
          if(num%i==0)
           {
                count++;
                break;
           } 
      }  
       if(count==0)
         {
              System.out.println("prime number");
         }
        else
          {
               System.out.println("not a prime number");
          }
      
   }
}
  
 