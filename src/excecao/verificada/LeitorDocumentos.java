package excecao.verificada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDocumentos {
    public static void main(String[] args) {

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(
                    new FileReader("C:\\Users\\danil\\OneDrive\\Área de Trabalho\\texto.txt"));

            //Ler linha por linha
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }


        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo" + e.getMessage());
            throw new RuntimeException(e);
        }



    }
}
