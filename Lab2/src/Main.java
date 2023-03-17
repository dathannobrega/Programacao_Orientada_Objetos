import entity.ReadFiles;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int count=0;
        System.out.println("Hello world!");
        ReadFiles rd = new ReadFiles("/home/dathan/IdeaProjects/Lab2/src/textos/original.txt");
        try {
            count = rd.fazLeitura();
        }catch (IOException e){
            System.out.println("ERROR: "+ e);
        }
        System.out.println("Existe "+ count + " linhas");
    }
}