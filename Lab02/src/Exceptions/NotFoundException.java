package Exceptions;

import java.io.IOException;

//Criado para tratar erros na classe entity.ManipuleDirectorie
public class NotFoundException extends IOException {
    public NotFoundException(){
        super("Arquivo ./textos/ não encontrado!");
    }
}
