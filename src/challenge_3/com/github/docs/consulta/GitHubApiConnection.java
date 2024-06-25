package challenge_3.com.github.docs.consulta;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GitHubApiConnection {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o usuário do GitHub que deseja encontrar:");
        String user = scanner.nextLine();
        String endereco = "https://api.github.com/users/" + user;

        try {
            HttpClient client = HttpClient.newBuilder().build();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado no GitHub.");
            }
            System.out.println(response.body());

        }catch (ErroConsultaGitHubException ex){
            System.out.println(ex.getMessage());
        }catch (IllegalArgumentException ex){
            System.out.println("Username digitado incorretamente! ");
        }

        System.out.println("Busca finalizada !");

    }
}


//{"message":"Not Found","documentation_url":"https://docs.github.com/rest/users/users#get-a-user","status":"404"}