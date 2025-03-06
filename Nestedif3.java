class Check
{
  public static void main(String args[])
  {
    int num = 17;
    double sqaure = Math.sqrt(num);
    int num2 = num%10;
    String status =(num%2==0)?(sqaure==(int)sqaure)?num+" even & perfect sqaure":num+" even & is not a  perfect sqaure":num2%5==0?num +" odd & is divisible by 5":num +" odd & is not a divisible by 5";
       System.out.println(status);
    
  }

}