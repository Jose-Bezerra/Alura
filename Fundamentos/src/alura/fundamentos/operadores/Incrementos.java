package alura.fundamentos.operadores;

public class Incrementos {
    public static void main(String[] args) {

        int a = 9;
        int b = 11;

        //Primeiro executa a expressão para depois atribuir o incremento à variável
        System.out.println(a++);

        //Primeiro atribui o incremento à variável para depois executar a expressão
        System.out.println(--b);
    }
}
