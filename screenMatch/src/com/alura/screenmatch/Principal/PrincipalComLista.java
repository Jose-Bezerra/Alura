package com.alura.screenmatch.Principal;

import com.alura.screenmatch.modelos.Filme;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 1999);
        favorito.avalia(10);

        Filme outroFilme = new Filme("John Wick", 2014);
        outroFilme.avalia(9);

        Serie serie = new Serie("La Casa de Papel", 2017);


        List<Titulo> lista = new ArrayList<>();
        lista.add(favorito);
        lista.add(outroFilme);
        lista.add(serie);

//        for (Titulo item: lista) {
//            System.out.println("Nome: " + item.getNome());
//            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
//                System.out.println("Classificação " + filme.getClassificacao());
//            }
//        }


        Collections.sort(lista);
        System.out.println(lista);

    }
}
