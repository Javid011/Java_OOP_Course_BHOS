public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Inception", "Christopher Nolan", 148, "English", 829.9);
        movie.showInfo();
        movie.calculateRevenue(50.5);
        System.out.println("Is Blockbuster? " + movie.isBlockbuster());
    }
}
