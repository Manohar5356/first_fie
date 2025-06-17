class Methods
{
    public static void main(String args[])
    {
           String s ="hello 12 and 13 good 14 15";
           String str[]=s.split(" ");
           String s2="";
           int sum=0;
          
           for(String t:str)
           {
               s2=t;
          
                if(Character.isDigit(s2))
                 {
                       int num = Character.getNumericValue(s2);
                        sum=sum+num;
                 }
           }
           System.out.println(sum);
    }
}