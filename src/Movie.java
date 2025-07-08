import java.util.ArrayList;

public class Movie extends Media {
    private int duration;

    public Movie(String title, String auteur, double price, int duration) {
        super(title, auteur, price);
        this.duration = duration;
    }

    public void watch(User user){

        user.getPurchaseMediaList().add(this);
    }
    public ArrayList<Movie> recommendSimilarMovies(ArrayList<Movie> movieCatalog){
        ArrayList<Movie> similarMovies = new ArrayList<>();
        System.out.println("Similar Movies by Director \""+getAuteur()+"\" .");
        boolean found = false;
        for (Movie movie : movieCatalog) {
            // Skip this movie itself
            //skip this movie that I'm referencing it right now.
            if (movie != this && movie.getAuteur().equalsIgnoreCase(this.getAuteur())) {
                similarMovies.add(movie);
                found = true;
            }
        }
        if(found){
            return similarMovies;
        }else{
            System.out.println("there is no similar movies recording to the Director");
            return similarMovies;
        }
    }

    @Override
    public String getMediaType(){
        return (duration >= 120) ? "Long Movie" : "Movie" ;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "🎥 Movie {" +
                "\n  Title: " + getTitle() +
                "\n  Director: " + getAuteur() +
                "\n  Duration: " + duration + " minutes" +
                "\n  Price: $" + getPrice() +
                "\n  Type: " + getMediaType() +
                "\n}";
    }
}

