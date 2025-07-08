import java.util.ArrayList;

public class AcademicBook extends Book {
    private String subject ;
    //Academic Book without Review
    public AcademicBook(String title, String auteur, double price, String ISBN, int stock, String subject) {
        super(title, auteur, price, ISBN, stock);
        this.subject = subject;
    }
    //Academic Book with Review
    public AcademicBook(String title, String auteur, double price, int stock, String ISBN, Review initialReview, String subject) {
        super(title, auteur, price, stock, ISBN, initialReview);
        this.subject = subject;
    }
    @Override
    public String getMediaType(){
        return super.getAverageRating()>= 4.5 ?"Bestselling AcademicBook":"AcademicBook";
    }

    @Override
    public String toString() {
        return "📘 Academic Book {" +
                "\n  Title: " + getTitle() +
                "\n  Author: " + getAuteur() +
                "\n  Subject: " + subject +
                "\n  ISBN: " + getISBN() +
                "\n  Stock: " + getStock() +
                "\nAverage Rating: " +  getAverageRating() +
                "\n  Media Type: " + getMediaType() +
                "\n}";
    }
}
