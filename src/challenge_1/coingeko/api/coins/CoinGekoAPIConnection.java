package challenge_1.coingeko.api.coins;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CoinGekoAPIConnection {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite qual criptomoeda deseja saber a cotação: ");
        String criptomoeda = leitor.nextLine().toLowerCase();

        //String endereco = "https://api.coingecko.com/api/v3/coins/" + criptomoeda + "/tickers";
        String endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + criptomoeda + "&vs_currencies=usd";


        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }
}
