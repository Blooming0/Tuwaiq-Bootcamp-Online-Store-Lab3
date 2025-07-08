
//Done
public class Media {
    private String title;
    private String auteur;//الكاتب
    private double price;


    public Media(String title, String auteur, double price) {
        this.title = title;
        this.auteur = auteur;
        this.price = price;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getMediaType(){
        return "Media";
    }


    @Override
    public String toString() {
        return "Media{" +
                "title='" + title + '\'' +
                ", auteur='" + auteur + '\'' +
                ", price=" + price +
                '}';
    }
}

