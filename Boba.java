/**
 * @author Riyadhusshadiqin
 * @version 1.0
 */

 /**
  * Mengimport scanner untuk mengambil inputan dari user
  */
  import java.util.Scanner;

  public class Boba extends Minuman
  {   
      public static double runningTotal = 0;
      static Scanner input = new Scanner(System.in);
      
      /**
       * @method contructor untuk boba
       */
      public Boba(){
          super(15000);
      }
  
      /**
       * @method subtotal untuk menghitung subtotal dari minuman
       * @param quantity adalah jumlah dari minuman
       * @param itemPrice adalah harga dari minuman
       * @return subTotal mengembalikan subTotal yang telah dihitung
       */
      public double subTotal(double quantity, double itemPrice){
      double subTotal = super.getquantity()*super.getitemprice();
      System.out.println("Subtotal: "+ subTotal);
      runningTotal += subTotal;
      return subTotal;
      }
      
      /**
       * @method quantity untuk meminta jumlah minuman dari user
       * @return quantity mengembalikan jumlah minuman yang telah diinput user
       */
      public double quantity() {
      System.out.print("Masukkan jumlah: ");       
      double quantity = input.nextDouble();
      super.setquantity(quantity);
      subTotal(super.getquantity(), super.getitemprice());
      return quantity;
      }
      
      /**
       * @method getrunningtotal untuk menyimpan nilai dari subtotal
       * @return runningTotal mengembalikan total dari minuman
       */
      public double getrunningtotal(){
          return runningTotal;
      }
  }