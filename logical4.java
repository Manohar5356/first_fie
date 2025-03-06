class Check
{
  public static void main(String args[])
   {
       //int day = 731;
       //int year = day/365;
       //int m=day%365/30 ;// remaining days 
	//int month=m/30;// remaing/30=months remaining days% other days
	//int days=m%30;
      // double m = month/30; 
       
       //System.out.println(year+ " "+ month +" "+days); 
       
   }
}


class Maths
{
   public static void main(String args[])
   {
      int days=730;
      int year = days/365;
      int month = days - (year*365);
      int m= month/30;
      double day = m%30;
      System.out.println(year + " "+ m +" " + day);
   }
}