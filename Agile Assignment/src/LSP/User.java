package LSP;

public abstract class User {
    private String name;
    private String email;
    private String password;
    private String[] favorite;
    private String[] purchaseList;
    private double buyMovie;

    public User(String name, String email, String password, String[] favorite, String[] purchase, double price) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.favorite = favorite;
        this.purchaseList = purchase;
        this.buyMovie = price;

    }

    //set and get methods

    public void logOut() {
    }

    ;

    public void watch() {
    }

    ;

    public void addFavorite() {
    }

    ;

    public void rateMovie() {
    }

    ;

    public abstract void login();

    public void purchaseMovie() {
        System.out.println("Procedure for buying movies");
    }
}