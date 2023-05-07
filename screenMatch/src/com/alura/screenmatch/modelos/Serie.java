package com.alura.screenmatch.modelos;

public class Serie extends Titulo {

    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    public void setAtiva(boolean b) {
        this.ativa = b;
    }

    public void setTemporadas(int i) {
        this.temporadas = i;
    }

    public void setEpisodiosPorTemporada(int i) {
        this.episodiosPorTemporada = i;
    }

    public void setMinutosPorEpisodio(int i) {
        this.minutosPorEpisodio = i;
    }

    @Override
    public String toString() {
        return "Série: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
