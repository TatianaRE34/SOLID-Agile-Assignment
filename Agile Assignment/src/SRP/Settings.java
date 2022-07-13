package SRP;
public class Settings {
     private String type;
     private int countDown;
    
     public Settings( int countDown, String type){
            this.countDown=countDown;
            this.type=type;
           
        }

    public void login(){
            if (type.equals('T')){
                if (countDown<=0){
                    System.out.println("Trial is over, Subscribe to service to watch more movies.");
                }else{
                   //Implementation
                   // deduceCount();
                   //purchaseMovie();
                   // watch();
                   // addFavorite();
                   //rateMovie();

                }
            }else if (type.equals('S')){
               //Implementation
               // loadWishListOpts();
               // purchaseMovie();
               // watch();
               // addFavorite();
               //rateMovie();
            }
            
    
}
 public void logOut(){};
}