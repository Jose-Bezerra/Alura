package com.alura.view;

import com.alura.modelo.CartaoCredito;
import com.alura.modelo.Compra;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um limite para seu cartão de crédito em Reais: ");
        double limite = scanner.nextDouble();

        CartaoCredito cartaoCredito = new CartaoCredito(limite);

        int sair = 1;
        while (sair != 0) {

            System.out.print("Descrição da compra: ");
            String descricao = scanner.next();
            System.out.println();
            System.out.print("Digite o valor da compra: ");
            double valor = scanner.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartaoCredito.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada com sucesso!!");
                System.out.println("Digite 0 para sair ou 1 para continuar!");
                sair = scanner.nextInt();
            } else {
                System.out.println("Limite insuficiente do cartão de crédito!");
                sair = 0;
            }
        }

        System.out.println("\n*********************\n");
        System.out.println("Compras realizadas: ");
        Collections.sort(cartaoCredito.getCompras());
        for (Compra item: cartaoCredito.getCompras()) {
            System.out.println(item.getDescricao() + " - " +
                item.getValor());
        }
        System.out.println("\n*********************");

    }
}
