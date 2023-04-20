import com.alura.screenmatch.modelos.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("Superman II");
        myMovie.setReleaseYear(1982);
        myMovie.setDurationInMinutes(144);
        myMovie.setIncludedInThePlan(true);
        myMovie.avalia(8);
        myMovie.avalia(9);
        myMovie.avalia(7);

        System.out.println("Média de avaliação do filme: " + myMovie.pegaMedia());
    }
}
