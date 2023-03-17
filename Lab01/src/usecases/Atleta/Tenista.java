package usecases.Atleta;

import entity.Atleta;

public class Tenista extends Atleta {
    public Tenista(String nome, int idade, double peso, double altura) {
        super(nome, idade, peso, altura);
    }

    @Override
    protected void jogar() {
        System.out.println("Jogando Tênis");
    }

}
