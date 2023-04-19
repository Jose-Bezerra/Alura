public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "Superman II";
        myMovie.releaseYear = 1982;

        myMovie.name = "Superman 2";
        myMovie.avalia(8.0);
        myMovie.avalia(8.9);
        myMovie.avalia(10);

        System.out.println("Média de avaliação do filme: " + myMovie.pegaMedia());
        System.out.println(myMovie.ratingTotal);
        System.out.println(myMovie.sumRating);
        myMovie.sumRating = 10;
    }
}
