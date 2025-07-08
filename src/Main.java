public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        // 1. Create 5 Users
        User u1 = new User("Hassan", "hassan@email.com");
        User u2 = new User("Lama", "lama@email.com");
        User u3 = new User("Khaled", "khaled@email.com");
        User u4 = new User("Noor", "noor@email.com");
        User u5 = new User("Rami", "rami@email.com");

        store.addUser(u1);
        store.addUser(u2);
        store.addUser(u3);
        store.addUser(u4);
        store.addUser(u5);


        store.displayUsers();


        // 2. Create 5 objects from each Media subclass

        // Books
        Book b1 = new Book("Java Basics", "Ahmed Ali", 55.0, "978-001", 5);
        Book b2 = new Book("Clean Code", "Robert C. Martin", 70.0, "978-002", 2);
        Review r1 = new Review("Khaled", 5.0, "Best Java intro");
        b1.addReview(r1);

        // Novels
        Novel n1 = new Novel("Moonlight", "Layla Hassan", 45.0, "978-111", 3, "Romance");
        Novel n2 = new Novel("Whispers", "Layla Hassan", 50.0, 2, "978-112", new Review("Noor", 4.7, "Emotional and deep"), "Romance");
        n1.addReview(new Review("Lama", 4.6, "Amazing novel!"));

        // AcademicBooks
        AcademicBook a1 = new AcademicBook("AI for Beginners", "Dr. Saeed", 90.0, "978-200", 3, "Computer Science");
        AcademicBook a2 = new AcademicBook("Advanced Math", "Dr. Majed", 100.0, 2, "978-201", new Review("Rami", 4.8, "Great for exams"), "Mathematics");

        // Movies
        Movie m1 = new Movie("Inception", "Nolan", 45.0, 148);
        Movie m2 = new Movie("Tenet", "Nolan", 40.0, 120);

        // Music
        Music mu1 = new Music("Hope", "Nashid", 9.0, "Maher Zain");
        Music mu2 = new Music("Peace", "Nashid", 12.0, "Sami Yusuf");

        // Add media to store
        store.addMedia(b1);
        store.addMedia(b2);
        store.addMedia(n1);
        store.addMedia(n2);
        store.addMedia(a1);
        store.addMedia(a2);
        store.addMedia(m1);
        store.addMedia(m2);
        store.addMedia(mu1);
        store.addMedia(mu2);

        store.displayMedias();
//
//        // 3. Simulate usage
//
//        // a. Users purchase different books
//        b1.purchase(u1);
//        b2.purchase(u2);
//        n2.purchase(u3);
//        a2.purchase(u4);
//        a1.purchase(u5);
//
//        // b. Users checkout from cart
//        u1.addToCart(n1);
//        u1.addToCart(mu1);
//        u1.checkout();
//
//        // c. Watch movies and listen to music
//        m1.watch(u2);
//        mu2.listen(u2);
//
//        // d. Show similar movies by director
//        m1.recommendSimilarMovies(new java.util.ArrayList<>(java.util.List.of(m1, m2)));
//
//        // e. Generate playlist
//        mu1.generatePlayList(new java.util.ArrayList<>(java.util.List.of(mu1, mu2)));
//
//        // 4. Display users and media
//        System.out.println("\n==== Users ====");
//        store.displayUsers();
//
//        System.out.println("\n==== Media in Store ====");
//        store.displayMedias();
//
//        System.out.println("\n==== Hassan's Purchased Items ====");
//        for (Media m : u1.getPurchaseMediaList()) {
//            System.out.println("- " + m.getTitle() + " [" + m.getMediaType() + "]");
//        }
    }
}