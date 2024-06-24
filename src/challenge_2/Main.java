package challenge_2;

import challenge_2.model.Livro;
import challenge_2.model.Pessoa;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {

        String json = "{" +
                "\"nome\"   :\"Rodrigo\"," +
                "\"idade\"  :20," +
                "\"cidade\" :\"Brasília\"," +
                "\"pais\"   :\"Brasil\"}";

        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);

        System.out.println(pessoa);



        String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";

        Gson gsonLivro = new Gson();
        Livro livro = gsonLivro.fromJson(jsonLivro, Livro.class);

        System.out.println(livro);




    }
}
