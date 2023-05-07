package com.alura.screenmatch.Principal;

import com.alura.screenmatch.modelos.Filme;
import com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Filme favorito = new Filme("The Matrix", 1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        Filme outro = new Filme("John Wick", 2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);

        Serie serie = new Serie("La Casa de Papel", 2015);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);

        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(favorito);
        filmes.add(outro);

        System.out.println("Tamanho da lista: " + filmes.size());
        System.out.println("Primeiro da lista: " + filmes.get(0));
        System.out.println(filmes);

    }
}
