public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "Superman II";
        myMovie.releaseYear = 1982;

        System.out.println(myMovie);
        System.out.println(myMovie.name);
        System.out.println(myMovie.releaseYear);
    }
}
