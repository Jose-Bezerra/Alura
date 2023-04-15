package alura.fundamentos;

import java.util.Random;
import java.util.Scanner;

public class Divination {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(100);
        int qtdAttempt = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int attempt = sc.nextInt();
            if (attempt == randomNumber) {
                System.out.println("Parabéns você acertou!!");
                break;
            } else if (attempt > randomNumber) {
                System.out.println("Você digitou um número maior...");
                 qtdAttempt++;
            } else {
                System.out.println("você digitou um número menor..");
                qtdAttempt++;
            }
        }

        if (qtdAttempt == 5) {
            System.out.println("Você não conseguiu adivinhar!");
        }


    }
}
