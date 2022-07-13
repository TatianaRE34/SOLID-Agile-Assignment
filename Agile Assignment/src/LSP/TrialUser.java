package LSP;


import OCP.User;

public class TrialUser extends User {
    private int countDown;

    public TrialUser(String name, String email, String password, String[] favorite,double price, String[] purchase, int countDown){
        super(name,email,password,favorite,purchase,price);
        this.countDown=countDown;
    }
    //SETTERS AND GETTERS
    public void deduceCount(){};
    public void login(){
        if (countDown<=0){
            System.out.println("Trial is over, Subscribe to service to watch more movies.");
        }else{
            deduceCount();
            super.purchaseMovie();
            super.watch();
            super.addFavorite();
            super.rateMovie();
        };
    }
}