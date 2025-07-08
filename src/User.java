import java.util.ArrayList;

public class User {
    private String username;
    private String email;
    private ArrayList<Media> purchaseMediaList = new ArrayList<>();
    private ArrayList<Media> shoppingCart = new ArrayList<>();

    //user constructor already (have NOT) a shopping cart and have purchased media
    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }
    //user constructor already (have) a shopping cart and have purchased media
    public User(String username, String email, ArrayList<Media> shoppingCart, ArrayList<Media> purchaseMediaList) {
        this.shoppingCart = shoppingCart;
        this.purchaseMediaList = purchaseMediaList;
        this.email = email;
        this.username = username;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Media> getPurchaseMediaList() {
        return purchaseMediaList;
    }

    public void setPurchaseMediaList(ArrayList<Media> purchaseMediaList) {
        this.purchaseMediaList = purchaseMediaList;
    }

    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }


    public void addToCart(Media media){
        shoppingCart.add(media);
        System.out.println("📥 Added to cart: " + media.getTitle());
    }
    public void removeFromCart(Media media){
        shoppingCart.remove(media);
        System.out.println("📤 remove from cart: " + media.getTitle());
    }
    public void checkout(){
        purchaseMediaList.addAll(shoppingCart);
        shoppingCart.clear();
        System.out.println("🛒 Checkout complete! Items moved to purchased list.");
    }
    //I added this not in the docs
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", purchaseMediaList=" + purchaseMediaList +
                '}';
    }
}
