
package ISP;

public class Subscriber extends User implements SettingsInterface,MovieInterface {

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
