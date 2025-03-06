class Loopleap
{
  public static void main(String args[])
   {
     int start=1600,end=2000;
     while(start<=end)
       {
          int leapyear=start;
          if(leapyear%4==0&&leapyear%100!=0||leapyear%400==0)
           {
             if(leapyear%6==0)
               System.out.println("LEAPYEAR "+leapyear);
           }
         start++;
       }
   }
}