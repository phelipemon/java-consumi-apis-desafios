package challenge_4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("arquivo.txt");
        writer.write("Conteúdo a ser gravado no arquivo.");


        System.out.println("Conteudo adicionado no arquivo ");

        System.out.println("-------------- FIM DO PRIMEIRO DESAFIO -------------------");

        Titulo titulo = new Titulo();
        titulo.setNome("Avatar");
        titulo.setDescricao("Jake Sully (Sam Worthington) ficou paraplégico após um combate na Terra. Quando seu irmão morre, Jake é selecionado para substituí-lo no programa Avatar e viaja a Pandora, uma lua extraterrestre, onde encontra diversas formas de vida.");

        Gson serializer = new GsonBuilder().setPrettyPrinting().create();
        String converted = serializer.toJson(titulo);
        System.out.println(converted);

        writer.write(converted);
        writer.close();

        System.out.println("--------------- FIM DO SEGUNDO DESAFIO ------------------");

        Veiculo veiculo = new Veiculo();
        veiculo.setModelo("Punto");
        veiculo.setAno(2013);

        var veiculoConvertido = serializer.toJson(veiculo);
        System.out.println(veiculoConvertido);



    }
}
