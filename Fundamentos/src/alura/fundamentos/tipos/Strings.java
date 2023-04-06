package alura.fundamentos.tipos;

public class Strings {
    public static void main(String[] args) {

        //Text Blocks é um recurso do java 15
        //Evita a concatenação com o operador +
        String versos = """
                'Todos os dias quando eu acordo
                Não tenho mais o tempo que passou
                Mas tenho todo tempo do mundo'               
                """;


        System.out.println(versos);
    }
}
