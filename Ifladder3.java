class ATM 
{
  public static void main(String args[])
  {
    int withdraw = 2000;
    int balance = 15000;
    double rem_balance = balance - withdraw; //15000-40000 = 25000
    if( withdraw<balance) // 25000 > 15000
     {
      System.out.println("withdraw amount= "+withdraw+"  account balance= "+ rem_balance);
     }
    else 
      {
        System.out.println("insuffient balance");
      }
     
  }
}