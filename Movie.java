public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    @Override
    public String toString() {
        return "Фильм: " + title + "\nСтудия: " + studio + "\nРейтинг: " + rating;
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("Фокус", "RatPac-Dune Entertainment", "R");
        Movie movie2 = new Movie("Главный герой", "20th Century Studios");

        System.out.println(movie1);
        System.out.println();
        System.out.println(movie2);
    }
}
