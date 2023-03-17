package usecases.Atleta;

import entity.Atleta;

public class Corredor extends Atleta {
    public Corredor(String nome, int idade, double peso, double altura) {
        super(nome, idade, peso, altura);
    }

    @Override
    protected void jogar() {
        System.out.println("Correndo uma maratona");
    }


}
