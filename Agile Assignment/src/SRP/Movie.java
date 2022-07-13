package SRP;
public class Movie {
    private String type;
    private boolean hasCoupon=false;
    
      public Movie( boolean hasCoupon, String type){
            this.hasCoupon=hasCoupon;
            this.type=type;
           
        }
     public void purchaseMovie(){
            if (hasCoupon==true && type.equals('S')){
                System.out.println("The purchase new price is calculated with the coupon discount applied and deactivate coupon");
            }else{
                System.out.println("Sells at usual price");
            }
        };
        public void watch(){};
        public void addFavorite(){};
        public void rateMovie(){};
}
