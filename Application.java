import java.util.Scanner;
class Application
{
  public static void main(String args[])
  {
    System.out.println("      WELCOME TO MANOHAR MART       ");
    System.out.println("____--------------------------____");
    int YES = 1;
    int NO = 0,Total_price=0;
    while(YES>NO)
    {
    
        System.out.println("AVAILABLE PRODUCTS ARE"+"\n"+"1.RICE"+"\n"+"2.PULSES"+"\n"+"3.OIL"+"\n"+"4.COOKIES"+"\n"+"5.STATIONARY");
        System.out.println(" ");
        Scanner s = new Scanner(System.in);
        System.out.println(" CHOOSE THE PRODUCT YOU WANT TO PURCHASE :");
        int n =s.nextInt(),bill=0;
        switch(n)
                {
                    case 1:
                           System.out.println(" YOU SELECTED RICE");
                           System.out.println("-------------------------");
                           System.out.println("CHOOSE BRAND TYPE "+"\n"+"1.HMT RICE------1600per 25kg/bag"+"\n"+"2.JAI SREE RAM RICE------1700per 25kg/bag "+"\n"+"3.MYSORE SONA RICE------1800per 25kg/bag ");
                           System.out.println(" ");
                           System.out.println("SELECT YOU WANTED BRAND :");
                           int a = s.nextInt();
                           switch(a)
                                  {
                                     case 1:
                                            System.out.println("          HMT RICE");
                                            System.out.println("Quantity :");
                                            int Quantity=s.nextInt();
                                            bill=bill+Quantity*1600;
                                            System.out.println(            "HMT RICE Quantity "+Quantity+" Bill :"+bill);
                                            break;
                                     case 2:
                                            System.out.println("           JAI SREE RAM RICE");
                                            System.out.println("Quantity :");
                                            int Quantity1=s.nextInt();
                                            bill=bill+Quantity1*1700;
                                            System.out.println(            "JAI SREE RAM RICE Quantity "+Quantity1+" Bill :"+bill);
                                             break;
                                     case 3: 
                                             System.out.println("           MYSORE SONA RICE");
                                             System.out.println("Quantity :");
                                             int Quantity2=s.nextInt();
                                             bill=bill+Quantity2*1800;
                                             System.out.println(            "MYSORE RICE Quantity "+Quantity2+" Bill :"+bill);
                                             break;          
                                  }
                                  break;
                     case 2:
                             System.out.println(" ");
                             System.out.println(" YOU SELECTED PULSES");
                             System.out.println("---------------------");
                             System.out.println("CHOOSE TYPE"+"\n"+"1.Dry Beans----65per/kg"+"\n"+"2.Masoor Dal-----100per/kg"+"\n"+"3.Moong Dal-----150per/kg ");
                             System.out.println(" ");
                             System.out.println("SELECT YOU WANTED BRAND :");
                           int b = s.nextInt();
                           switch(b)
                                  {
                                     case 1:
                                            System.out.println("          DRY BEANS");
                                            System.out.println("Quantity :");
                                            int Quantity=s.nextInt();
                                            bill=bill+Quantity*65;
                                            System.out.println(            "DRY BEANS Quantity "+Quantity+" Bill :"+bill);
                                            break;
                                     case 2:
                                            System.out.println("           MASOOR DAL");
                                            System.out.println("Quantity :");
                                            int Quantity1=s.nextInt();
                                            bill=bill+Quantity1*100;
                                            System.out.println(            "MASOOR DAL Quantity "+Quantity1+" Bill :"+bill);
                                             break;
                                     case 3: 
                                             System.out.println("           MOONG DAL");
                                             System.out.println("Quantity :");
                                             int Quantity2=s.nextInt();
                                             bill=bill+Quantity2*150;
                                             System.out.println(            "MOONG DAL Quantity "+Quantity2+" Bill :"+bill);
                                             break; 
                                         }    
                                 break;
                    case 3:
                             System.out.println(" ");
                             System.out.println(" YOU SELECTED OIL");
                             System.out.println("---------------------");
                             System.out.println("CHOOSE TYPE"+"\n"+"1.FREEDOM OIL----125per/L"+"\n"+"2.GOLD DROP-----150per/L"+"\n"+"3.FORTUNE-----140per/L ");
                             System.out.println(" ");
                             System.out.println("SELECT YOU WANTED BRAND :");
                           int  c = s.nextInt();
                           switch(c)
                                  {
                                     case 1:
                                            System.out.println("          FRREDOM OIL");
                                            System.out.println("Quantity :");
                                            int Quantity=s.nextInt();
                                            bill=bill+Quantity*125;
                                            System.out.println(            "FREEDOM OIL Quantity "+Quantity+" Bill :"+bill);
                                            break;
                                     case 2:
                                            System.out.println("           GLOD DROP OIL");
                                            System.out.println("Quantity :");
                                            int Quantity1=s.nextInt();
                                            bill=bill+Quantity1*150;
                                            System.out.println(            "GLOD DROP OIL Quantity "+Quantity1+" Bill :"+bill);
                                             break;
                                     case 3: 
                                             System.out.println("           FORTUNE OIL");
                                             System.out.println("Quantity :");
                                             int Quantity2=s.nextInt();
                                             bill=bill+Quantity2*140;
                                             System.out.println(            "FORTUNE OIL Quantity "+Quantity2+" Bill :"+bill);
                                             break; 
                                         } 
                                      break;
                 
                   case 4:
                             System.out.println(" ");
                             System.out.println(" YOU SELECTED COOKIES");
                             System.out.println("---------------------");
                             System.out.println("CHOOSE TYPE"+"\n"+"1.CHOCOLATE CHIP COOKIES----200per/100GRMS"+"\n"+"2.PEANUT BUTTER COOKIES-----300per/100GRM"+"\n"+"3.SUGER COOKIES-----400per/100GRM ");
                             System.out.println(" ");
                             System.out.println("SELECT YOU WANTED BRAND :");
                           int d = s.nextInt();
                           switch(d)
                                  {
                                     case 1:
                                            System.out.println("           CHOCOLATE CHIP COOKIES ");
                                            System.out.println("Quantity :");
                                            int Quantity=s.nextInt();
                                            bill=bill+Quantity*200;
                                            System.out.println(            "CHOCOLATE CHIP COOKIES Quantity "+Quantity+" Bill :"+bill);
                                            break;
                                     case 2:
                                            System.out.println("           PEANUT BUTTER COOKIES");
                                            System.out.println("Quantity :");
                                            int Quantity1=s.nextInt();
                                            bill=bill+Quantity1*300;
                                            System.out.println(            "PEANUT BUTTER COOKIES Quantity "+Quantity1+" Bill :"+bill);
                                             break;
                                     case 3: 
                                             System.out.println("           SUGER COOKIES");
                                             System.out.println("Quantity :");
                                             int Quantity2=s.nextInt();
                                             bill=bill+Quantity2*400;
                                             System.out.println(            "SUGER COOKIES Quantity "+Quantity2+" Bill :"+bill);
                                             break; 
                                         }
                                     break;
                    
                   case 5:
                             System.out.println(" ");
                             System.out.println(" YOU SELECTED STATIONARY");
                             System.out.println("---------------------");
                             System.out.println("CHOOSE TYPE"+"\n"+"1.BOOKS----100per/300 P"+"\n"+"2.PENS-----150per/pack"+"\n"+"3.PENCILS-----80per/PACK ");
                             System.out.println(" ");
                             System.out.println("SELECT YOU WANTED BRAND :");
                           int e = s.nextInt();
                           switch(e)
                                  {
                                     case 1:
                                            System.out.println("          BOOKS");
                                            System.out.println("Quantity :");
                                            int Quantity=s.nextInt();
                                            bill=bill+Quantity*100;
                                            System.out.println(            "BOOKS Quantity "+Quantity+" Bill :"+bill);
                                            break;
                                     case 2:
                                            System.out.println("           PENS");
                                            System.out.println("Quantity :");
                                            int Quantity1=s.nextInt();
                                            bill=bill+Quantity1*150;
                                            System.out.println(            "PENS Quantity "+Quantity1+" Bill :"+bill);
                                             break;
                                     case 3: 
                                             System.out.println("           PENCILS");
                                             System.out.println("Quantity :");
                                             int Quantity2=s.nextInt();
                                             bill=bill+Quantity2*80;
                                             System.out.println(            "PENCILS Quantity "+Quantity2+" Bill :"+bill);
                                             break; 
                                         }   
                                     break; 
                    default:
                               System.out.println("Invalid selection, please try again.");
                               continue;
                }
                 Total_price=Total_price+bill;
                  System.out.println("CUURENT BILL FOR THIS ITEAMS - "+ bill);
                  System.out.println("TOTAL BILL - "+Total_price);
                  
                 System.out.print("\nDo you want to buy another item? (1 for YES / 0 for NO): ");
                 int choose =s.nextInt();
                 if(choose==0)
                 {
                      break;
                 }
              
                          
        }
                 double discount = 0;
                    if ( Total_price  >= 3000) 
                    {
                        discount =  Total_price * 0.20;
                    }
                   else if ( Total_price  >= 2000) 
                   {
                        discount = Total_price  * 0.15;
                   } 
                   else if ( Total_price  >= 1000) 
                  {
                        discount = Total_price  * 0.10;
                  }

                 double finalBill = Total_price - discount;

                 System.out.println("\n-----------------------------");
                System.out.println("FINAL TOTAL BILL: " + Total_price);
                System.out.println("DISCOUNT APPLIED: " + discount);
                 System.out.println("TOTAL PAYABLE AFTER DISCOUNT: " + finalBill);
                 System.out.println(" ");
                 System.out.println("______________________________________________________");
                 System.out.println("    THANK YOU FOR SHOPPING AT MANOHAR MART!    ");
                 System.out.println("*********************************************************");
 

  }
}