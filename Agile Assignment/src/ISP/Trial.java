
package ISP;

public class Trial extends User implements SettingsInterface,MovieInterface{

    public Trial(String name, String email, String password) {
        super(name, email, password);
    }

    public void deduceCount(){
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
