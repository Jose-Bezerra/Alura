public class Movie {
    String name;
    int releaseYear;
    boolean includedInThePlan;
    double sumRating;
    int ratingTotal;
    int durationInMinutes;

    void exibeFichaTechnical() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Duração em minutos: " + durationInMinutes);
        System.out.println("Incluído no plano: " + includedInThePlan);
    }

    void avalia(double nota) {
        sumRating += nota;
        ratingTotal++;
    }

    double pegaMedia() {
        return  sumRating / ratingTotal;
    }

}
