package alura.fundamentos.operadores;

import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        int soma = 0;
        int media = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite um inteiro: ");
            int num = scanner.nextInt();
            soma = soma + num;
        }
        media = soma / 3;
        System.out.println("A sua média foi: " + media);
    }
}
