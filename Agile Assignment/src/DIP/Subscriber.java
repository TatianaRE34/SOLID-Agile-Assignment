public class Subscriber implements IUser{
    
    private String couponCode;
    

    public void  loadWishListOpts(){
        //Implementation
    }

    @Override
    public void login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void logOut() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addFavorite() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rateMovie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void logout() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
