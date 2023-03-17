package entity;
//Classe Criada com o proposito de fazer leitura e escrita de arquivos no geral.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {
    private String file;

    public ReadFiles(String file){
        this.file = file;
    }
    public int readAll() throws IOException { // é nessesario fazer tratamento de erro quando faz leitura de TXTiii
        BufferedReader br = new BufferedReader(new FileReader(file)); // cria o buffer de leitura
        int count = 0;
        while(br.readLine() != null){
            count++;
        }
        return count;
    }
}
