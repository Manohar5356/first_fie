class Newstring
{
   public static void main(String args[])
   {
        String s = "manohar";
        String s1 = "manohar";
        String sc = new String("pavan");
        String sc1 = new String("pavan");
        System.out.println(s+" "+sc);
       System.out.println(s.equals(sc));
       System.out.println(s==sc);
       System.out.println(s==s1);
       System.out.println(sc.equals(sc1));
   }
}