package entity; //classe existe com a inteção de manipular diretorios, bem como files e acessos a pastas externas.

import Exceptions.NotFoundException;

import java.io.File;
import java.io.IOException;

public class ManipuleDirectorie {

    private File[] findDirectorie() throws NotFoundException { // esse programa retorna todos os arquivos da pasta textos, retorna nulo se nao achar
        File f = new File(".\\");// Procura pela pasta principal
        File []novo = f.listFiles(); // recebe todos os arquivos do programa.

        for (int i = 0; i < novo.length; i++) {
            if(novo[i].getName() == "textos"){
                return novo[i].listFiles();
            }
        }
        throw new NotFoundException();
    }


    public void contabilizaTodos() throws NotFoundException {
        File []f = findDirectorie();
        for (int i = 0; i < f.length; i++) {

        }

    }
}
