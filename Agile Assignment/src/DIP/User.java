public class User {
    private IUser user;
    private final String name;
    private final String email;
    private final String password;
   
    public User(String name, String email, String password){
            this.name=name;
            this.email=email;
            this.password=password;
        }
    /**
     * @return the user
     */
    public IUser getUser() {
        return user;
    }
    
    public void setUser(IUser u) {
        user = u;
    }
    public void use(){
    user.login();
    user.logout();
    user.purchaseMovie();
    user.watch();
    user.rateMovie();
    user.addFavorite();    
    
    }
    
}
