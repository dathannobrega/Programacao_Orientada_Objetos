package usecases;

import entity.Runnebled;

import java.util.Random;

import static java.lang.Math.abs;

public class Exercicio3 implements Runnebled {
    @Override
    public void run() {
        Random rand = new Random();
        int numRand,intIn;

        numRand = rand.nextInt(100)+1;//Gera numero de 1 a 100

        do {
            System.out.println("Digite um Numero: ");
            intIn = sc.nextInt();
            if(abs( intIn - numRand)  <= 10){
                System.out.println("Tá Pelando");
            } else if (abs( intIn - numRand)  < 20) {
                System.out.println("Tá Quente");
            }else if (abs( intIn - numRand) >= 20){
                System.out.println("Tá Frio");
            }else{
                System.out.println("Acertou!");
            }

        }while (numRand != intIn);
    }
}
