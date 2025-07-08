import java.util.ArrayList;

public class Book extends Media {
    private int stock;//numbers of book in stock
    private String ISBN;//ISBN stands for International Standard Book Number, so it's only for book because of that, I specified this propertie to the Book class Only.
    ArrayList<Review> reviews = new ArrayList<>();//it's contain reviews about the Book (Novel , Academic Book , Others(Book)).
    //constructor without reviews list, because not every book should have reviews.
    public Book(String title, String auteur, double price, String ISBN, int stock) {
        super(title, auteur, price);
        this.ISBN = ISBN;
        this.stock = stock;
    }
    //constructor with reviews list.
    public Book(String title, String auteur, double price, int stock, String ISBN, Review initialReview) {
        super(title, auteur, price);
        this.stock = stock;
        this.ISBN = ISBN;
        this.reviews.add(initialReview);//adding the new review to the list of reviews .
    }

    public void addReview(Review review){
        this.reviews.add(review);//add to the arraylist that i have (review) >> new review comes from the end-user.
    }
    public double getAverageRating(){
        //check before getting the avg is it empty reviews or not
        if(reviews.isEmpty()) return 0.0;

        double sum = 0.0;
        for (Review review : reviews) {
            sum += review.getRating();
        }
        return sum /reviews.size();
    }
    public void purchase(User user) {
        if (user != null && user.getPurchaseMediaList() != null) {
            if (this.stock > 0) {
                user.getPurchaseMediaList().add(this);
                stock--;
                System.out.println("Purchase successful! Book: " + getTitle());
            } else {
                System.out.println("Sorry, this book is out of stock.");
            }
        }
    }
    public boolean isBestSeller(){
        return getAverageRating() >= 4.5; //return ether true or false.
    }
    public void restock(int quantity){
        if(quantity <= 0 ){
            System.out.println("wrong quantity it should be more than zero");
        }else{
            stock += quantity;
            System.out.println("📚 [Stock Update] \"" + getTitle() + "\" now has " + stock + " copies in stock.");
        }
    }
    @Override
    public String getMediaType(){
        if(isBestSeller()){
            return "Bestselling Book";
        }else{
            return "Book";
        }
    }

    //Getter & Setter
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public ArrayList<Review> getReviews() {
        if(reviews.isEmpty()) {
            System.out.println("there is no reviews in this Book");
            return reviews;
        }
        return reviews;
    }

    public void setReview(ArrayList<Review> review) {
        this.reviews = review;
    }

    @Override
    public String toString() {
        return "📘 Book Title: " + getTitle() +
                "\nAuthor: " + getAuteur() +
                "\nISBN: " + ISBN +
                "\nStock: " + stock +
                "\nAverage Rating: " +  getAverageRating() +
                "\nType: " + getMediaType();
    }
}

