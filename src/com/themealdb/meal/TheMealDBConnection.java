package com.themealdb.meal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class TheMealDBConnection {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a receita que deseja saber: ");
        String receita = leitor.nextLine().toLowerCase().replaceAll("\\s","_" );

        String endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + receita;

        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
