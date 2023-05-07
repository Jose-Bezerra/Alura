package com.alura.modelo;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        compras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }


    public List<Compra> getCompras() {
        return compras;
    }


    public boolean lancaCompra(Compra compra) {
        if (this.getSaldo() > compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }
}
