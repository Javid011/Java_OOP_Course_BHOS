class Movie {
    private String title;
    private String director;
    private int duration;
    private String language;
    private double boxOffice;

    public Movie(String title, String director, int duration, String language, double boxOffice) {
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.language = language;
        this.boxOffice = boxOffice;
    }

    public void showInfo() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Language: " + language);
        System.out.println("Box Office Collection: $" + boxOffice + " million");
    }

    public void calculateRevenue(double additionalRevenue) {
        this.boxOffice += additionalRevenue;
        System.out.println("Updated Box Office Collection: $" + boxOffice + " million");
    }

    public boolean isBlockbuster() {
        return boxOffice > 100;
    }

    public static void main(String[] args) {
        Movie movie = new Movie("Inception", "Christopher Nolan", 148, "English", 829.9);
        movie.showInfo();
        movie.calculateRevenue(50.5);
        System.out.println("Is Blockbuster? " + movie.isBlockbuster());
    }
}
/*
        +------------------------------------------------------+
        |                        Movie                         |
        +------------------------------------------------------+
        | - title : String                                     |
        | - director : String                                  |
        | - duration : int                                     |
        | - language : String                                  |
        | - boxOffice : double                                 |
        +------------------------------------------------------+
        | + Movie(String, String, int, String, double)        |
        | + showInfo() : void                                  |
        | + calculateRevenue(double) : void                   |
        | + isBlockbuster() : boolean                         |
        +------------------------------------------------------+
*/
