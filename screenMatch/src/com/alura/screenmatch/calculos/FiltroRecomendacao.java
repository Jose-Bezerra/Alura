package com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtrar(Classificavel c) {
        if (c.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos no momento!");
        } else if (c.getClassificacao() >= 2) {
            System.out.println("Bem avaliado no momento!");
        } else {
            System.out.println("Coloque na sua lista para assistir.");
        }
    }
}
