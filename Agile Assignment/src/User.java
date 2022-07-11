public class User {
        private String name;
        private String email;
        private String password;
        private String[] favorite;
        private String[] purchase;
        private String[] wishList;
        private int countDown;
        private String couponCode;
        private boolean hasCoupon=false;
        private double buyMovie;
        private String type;//can be only 'T' or 'S'

        public User(String name, String email, String password, double price,String[] favorite, String[] purchase, String[] wishList, int countDown, String couponCode, String type){
            this.name=name;
            this.email=email;
            this.password=password;
            this.favorite=favorite;
            this.purchase=purchase;
            this.wishList=wishList;
            this.countDown=countDown;
            this.couponCode=couponCode;
            this.type=type;
            this.buyMovie=price;
        }

        //set and get methods

        public void logOut(){};

        //LSP
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
        public void deduceCount(){};

        public void addToWishlist(){};
        public void removeFromWishlist(){};
        public void loadWishListOpts(){
            addToWishlist();
            removeFromWishlist();
        };
        public void login(){
            if (type.equals('T')){
                if (countDown<=0){
                    System.out.println("Trial is over, Subscribe to service to watch more movies.");
                }else{
                    deduceCount();
                    purchaseMovie();
                    watch();
                    addFavorite();
                    rateMovie();

                }
            }else if (type.equals('S')){
                loadWishListOpts();
                purchaseMovie();
                watch();
                addFavorite();
                rateMovie();
            }

        }

}
