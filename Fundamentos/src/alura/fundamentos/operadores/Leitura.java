package alura.fundamentos.operadores;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua banda favorita: ");
        String band = sc.next();
        System.out.println(band);
    }
}
