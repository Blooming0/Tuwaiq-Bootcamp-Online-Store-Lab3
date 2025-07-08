import java.util.ArrayList;

public class Store {
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Media> medias = new ArrayList<>();

    public void addUser(User user){
        this.users.add(user);
    }
    //I prefer to make it void, so I can print it directly
    public void displayUsers() {
        if (users != null && !users.isEmpty()) {
            System.out.println("📋 Registered Users:");
            int count = 0 ;
            for (User user : users) {
                System.out.println(++count +"- " + user.getUsername() + " (" + user.getEmail() + ")");
            }
        } else {
            System.out.println("🚫 No users registered yet.");
        }
    }
    public void addMedia(Media media){
        medias.add(media);
    }

    public void displayMedias(){
        if (medias != null && !medias.isEmpty()) {
            System.out.println("📋 medias Stores:");
            int count = 0 ;
            for (Media media : medias) {
                System.out.println(++count +"- "+media.toString()+"\n");
            }
        } else {
            System.out.println("🚫 No media items available yet.");
        }
    }


    public Book searchBook(String title) {
        for (Media media : medias) {
            if (media instanceof Book && media.getTitle().equalsIgnoreCase(title)) {
                return (Book) media; // ✅ cast to Book safely
            }
        }
        System.out.println("❌ Book not found with title: " + title);
        return null;
    }

}


