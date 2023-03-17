package entity;

import usecases.Atleta.Corredor;

import java.util.ArrayList;

public abstract class Atleta implements Comparable,Ordenabled {
    //EXERCICIO 4
    private String nome;
    private int idade;
    private  double peso;
    private  double altura;

    public Atleta(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void aquecer(int minutos){
        System.out.println("O Atleta "+ nome + "aqueceu por " + minutos +"m.");
    }

    protected abstract void jogar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    //EXERCICIO 5

    @Override
    public String toString() {
        return "Atleta{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Atleta item = (Atleta)o;
        if((this.nome.compareTo(item.nome))<0){
            return -1;
        } else if ((this.nome.compareTo(item.nome)==0)) {
            return 0;
        } else { // caso seja maior
            return 1;
        }
    }

}
