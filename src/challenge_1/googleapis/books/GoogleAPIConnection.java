package challenge_1.googleapis.books;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleAPIConnection {
    public static void main(String[] args) throws IOException, InterruptedException {


        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome do livro que deseja encontrar:");
        String livro = leitor.nextLine().toLowerCase().replaceAll("\\s","+" );

        var key = "AIzaSyCvs9nYyE34jPr1wuMghGlMUBFAWnLyoG4";
        var endereco = "https://www.googleapis.com/books/v1/volumes?q="  + livro +  "+intitle:keyes&key=" + key;


        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}