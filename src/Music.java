import java.util.ArrayList;

public class Music extends Media {
    private String artist;

    public Music(String title, String auteur, double price, String artist) {
        super(title, auteur, price);
        this.artist = artist;
    }
    public void listen(User user){
        user.getPurchaseMediaList().add(this);
    }
    public ArrayList<Music> generatePlayList(ArrayList<Music> musicCatalog){
        ArrayList<Music> similarMusic = new ArrayList<>();
        //المطلوب من الفنكشن اخراج الاغاني المتشابهه بناء على تشابه الكاتبين للاغاني
        //هذا ⬆️ اللوجيك اللي انا ماشي عليه
        System.out.println("Similar Music by artist(Auteur) \""+getAuteur()+"\" .");
        boolean found = false;
        for (Music music : musicCatalog) {
            if (music != this && music.getAuteur().equalsIgnoreCase(this.getAuteur())) {
                similarMusic.add(music);
            }
        }
        if(found){
            return similarMusic;
        }else{
            System.out.println("there is no similar Music recording to the artist(Auteur)");
            return similarMusic;
        }
    }

    @Override
    public  String getMediaType(){
        return (getPrice()>=10)?"Premium Music":"Music";
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "🎶 Music {" +
                "\n  Title: " + getTitle() +
                "\n  (Auteur): " + getAuteur() +
                "\n  Performer: " + artist +
                "\n  Price: $" + getPrice() +
                "\n  Type: " + getMediaType() +
                "\n}";
    }
}
