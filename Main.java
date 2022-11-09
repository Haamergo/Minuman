
/**
 * @author M. Ilhaam Ghiffari
 * @version 1.0
 */

 /**
  * @import scanner untuk mengambil inputan dari user
  */
  import java.util.Scanner;
  public class Main
  {   
      static boolean ordering = true;
      static Scanner input = new Scanner(System.in);
      
  
      /**
       * @method menu untuk menampilkan menu utama
       */
      public static void menu(){
      System.out.println("Selamat datang \n1. Boba (Rp.15000) \n2. Teh (Rp.5000)\n3. Kopi (Rp.10000) \n4. Selesai");
      System.out.print("Pilih Pesanan: ");
  }
     
  public static void main(String[] args) {
      int menuOption;
      Boba Boba = new Boba(); 
      Teh Teh = new Teh();
      Kopi Kopi = new Kopi();
      input = new Scanner(System.in); 
      double totalharga;
      int jumlah;
      do{
  
          menu();
          menuOption = input.nextInt();    
          switch(menuOption){
              case 1:
                  Boba.quantity();
                  break;
              case 2:
                  Teh.quantity();
                  break;
              case 3:
                  Kopi.quantity();
                  break;
              case 4:
                  ordering = false;
                  jumlah =(int)(Boba.getquantity()+Teh.getquantity()+Kopi.getquantity());
                  totalharga = Boba.getrunningtotal()+Teh.getrunningtotal()+Kopi.getrunningtotal();
                  System.out.println("========================================");
                  System.out.println("Jumlah Minuman yang dipesan: "+jumlah);
                  System.out.println("Total harga: "+totalharga);
                  System.out.println("Selamat Minum");
                  System.out.println("========================================");
  
                  break;      
              default:
                  System.out.println("Opsi Tidak Ada");
          }
  
      } while(ordering); {
  }
  }
  }
  