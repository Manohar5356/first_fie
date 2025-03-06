class Month
{
  public static void main(String args[])
  {
    int month = 1;
    if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
      {
       System.out.println("31 days");
      }
    else if(month==4||month==6||month==9||month==11)
      {
       System.out.println("30 days");
      }
    else if(month==2)
      {
        System.out.println("28 days");
      }
  }
} 

//_________________________________________________

class Logical
{
  public static void main(String args[])
   {
    int month = 4;
    String t = (month==1||month==3||month==5||month==7||month==8||month==10||month==12||month==4||month==6||month==9||month==11)?"31 days":"30 days";
        System.out.println(t);

   }
}