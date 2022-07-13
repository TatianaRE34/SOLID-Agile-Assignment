
package agile.assignment;

public class Subscriber extends User implements SettingsInterface,MovieInterface {

private String couponCode;
    public Subscriber(String name, String email, String password) {
        super(name, email, password);
    }

    public void  loadWishListOpts(){
        //Implementation
    }
    @Override
    public void login(User user) {
        
    }

    @Override
    public void logOut(User user) {
       
    }

    @Override
    public void purchaseMovie() {
    boolean hasCoupon = false;
         if (hasCoupon==true ){
                System.out.println("The purchase new price is calculated with the coupon discount applied and deactivate coupon");
            }else{
                System.out.println("Sells at usual price");
            }
    }

    @Override
    public void watch() {
        
    }

    @Override
    public void addFavorite() {
        
    }

    @Override
    public void rateMovie() {
        
    }
    
}
