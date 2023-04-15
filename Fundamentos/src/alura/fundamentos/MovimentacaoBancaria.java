package alura.fundamentos;

import java.util.Scanner;

public class MovimentacaoBancaria {

    public static void main(String[] args) {
       String dadosCliente = """
               ********************************
               Dados Inicias Do Cliente
                
               Nome: José Bezerra Filho
               Tipo Conta: Corrente
               Saldo Inicial: R$ 2500,00
               ********************************
               """;

        System.out.println(dadosCliente);

        String menuOperacoes = """
                1 - Consultar Saldos
                2 - Receber Valor
                3 - Transferir Valor
                4 - Sair
                """;

        System.out.println(menuOperacoes);

        double saldo = 2500;
        Scanner sc = new Scanner(System.in);
        int option = 0;

        while (option != 4) {
            System.out.print("Digite sua opção: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor para receber: R$ ");
                    saldo += sc.nextDouble();
                    System.out.println("Saldo Atual: R$ " + saldo);
                    break;
                case 3:
                    System.out.println("Digite o valor para transferência: R$ ");
                    double value = sc.nextDouble();
                    if (value > saldo) {
                        System.out.println("Saldo inferior ao valor solicitado!");
                    } else {
                        saldo -= value;
                        System.out.println("Transferência realizada com sucesso!");
                        System.out.println("Saldo Atual: R$ " + saldo);
                    }
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Saindo do sistema.");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }

    }
}
