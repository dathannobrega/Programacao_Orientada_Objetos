package usecases.Atleta;

import entity.Atleta;

public class Futebolista extends Atleta {
    public Futebolista(String nome, int idade, double peso, double altura) {
        super(nome, idade, peso, altura);
    }

    @Override
    protected void jogar() {
        System.out.println("Fazendo um Gol!");

    }

}
