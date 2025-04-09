class Lengthstring
{
  public static void main(String args[])
  {
      String s ="mom";
      StringBuffer sb = new StringBuffer(s);
      sb.reverse();
      String s1=sb.toString();
      System.out.println(sb);
      System.out.println(s.equals(s1)?"palindrome":"not an palindrome");
  }
}