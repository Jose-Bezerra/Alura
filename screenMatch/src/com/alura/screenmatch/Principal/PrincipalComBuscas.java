package com.alura.screenmatch.Principal;

import com.alura.screenmatch.excecao.ErroConversaoAnoException;
import com.alura.screenmatch.modelos.Titulo;
import com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBuscas {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do filme para busca: ");
        var busca = sc.nextLine();
        var chave  =  "2a164075";
        var endereco = "https://www.omdbapi.com/?t=" +  busca.replace(" ", "+") + "&apikey=" + chave;

        try {
            //O client simula o navegador
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            //System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            TituloOmdb tituloOmdb = gson.fromJson(json, TituloOmdb.class);

            System.out.println(tituloOmdb);
            Titulo meuTitulo = new Titulo(tituloOmdb);
            System.out.println("Titulo já traduzido!");
            System.out.println(meuTitulo);
        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro!");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro no endereço..");
        } catch (ErroConversaoAnoException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("O programa finalizou!");
        }
    }
}
