
/**

 * @author M. Ilhaam Ghiffari
 * @version 1.0
 */


 /**
  * @abstract_class Minuman adalah class abstract untuk jenis-jenis minuman
  */
  public abstract class Minuman
  {
      private double itemPrice;
      private double quantity;
      
  
      /**
       * @method constructor untuk minuman
       */
      public Minuman(){}
      
      /**
       * @method Minuman untuk membuat class minuman dengan harga yang ditentukan
       * @param itemprice adalah harga minuman yang diinginkan
       */
      public Minuman(double itemprice){
      this.itemPrice = itemprice;
      }
      
      /**
       * @method getitemprice adalah method untuk mendapatkan harga minuman
       * @return itemprice mengembalikan harga minuman
       */
      public double getitemprice(){
          return itemPrice;
      }
      
      /**
       * @method getquantity untuk mendapatkan jumlah minuman
       * @return quantity mengembalakian jumalah minuman
       */
      public double getquantity(){
          return quantity;
      }
      
      /**
       * @method setquantity untuk mengatur jumlah minuman
       * @param quantity adalah jumlah minuman yang di inginkan
       */
      public void setquantity(double quantity){
          this.quantity = quantity;
      }
      
      /**
       * @abstract_method subtotal adalah method untuk menghitung subtotal minuman
       */
      abstract double subTotal(double quantity, double itemPrice);
      
  }
     