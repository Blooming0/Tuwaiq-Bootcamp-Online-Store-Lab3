import java.util.ArrayList;

public class Novel extends Book {
    private String genre;

    //without review list
    public Novel(String title, String auteur, double price, String ISBN, int stock, String genre) {
        super(title, auteur, price, ISBN, stock);
        this.genre = genre;
    }
    //with review list
    public Novel(String title, String auteur, double price, int stock, String ISBN, Review initialReview, String genre) {
        super(title, auteur, price, stock, ISBN, initialReview);
        this.genre = genre;
    }
    @Override
    public String getMediaType(){
        return super.getAverageRating()>= 4.5 ?"\"Bestselling Novel\"":"Novel";
    }

    public String toString() {
        return "📖 Novel Title: " + getTitle() +
                "\nAuthor: " + getAuteur() +
                "\nGenre: " + genre +
                "\nISBN: " + getISBN() +
                "\nStock: " + getStock() +
                "\nAverage Rating: " +  getAverageRating() +
                "\nMedia Type: " + getMediaType();
    }
}
