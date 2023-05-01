package com.alura.screenmatch.modelos;

import com.alura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int totalVisualizacoes;
    private int Numero;
    private Serie serie;

    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }

    public void setNumero(int i) {
        this.Numero = i;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public void settotalVisualizacoes(int i) {
        this.totalVisualizacoes = i;
    }
}
