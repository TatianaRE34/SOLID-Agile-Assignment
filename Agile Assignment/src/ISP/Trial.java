
package agile.assignment;

public class Trial extends User implements SettingsInterface,MovieInterface{

                
    public Trial(String name, String email, String password) {
        super(name, email, password);
    }

    public void deduceCount(){
    //Implementation
    }
    @Override
    public void login(User user) {
     int countDown = 0;
      if (countDown<=0){
                    System.out.println("Trial is over, Subscribe to service to watch more movies.");
      }
      else{
          countDown++;
      }
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
