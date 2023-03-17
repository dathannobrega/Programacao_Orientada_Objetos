import entity.Atleta;
import entity.Ordenabled;
import usecases.Atleta.Corredor;
import usecases.Atleta.Futebolista;
import usecases.Atleta.Tenista;
import usecases.Exercicio1;
import usecases.Exercicio2;
import usecases.Exercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.time.Period;

//ALUNO: DATHAN VITOR SANTANA DA NOBREGA
//ID: 12111BSI292
public class Main {
    public static void main(String[] args) {

        System.out.println("Exercicio 1: ");
        Exercicio1 ex1 = new Exercicio1();
        ex1.run();

        System.out.println("\nExercicio 2: ");
        Exercicio2 ex2 = new Exercicio2();
        ex2.run();

        System.out.println("\nExercicio 3: ");
        Exercicio3 ex3 = new Exercicio3();
        ex3.run();

        System.out.println("\nExercicio 4: ");

        ArrayList<Atleta> at = new ArrayList<>();
        Atleta[] at1 = new Atleta[3];
        //começa a ordenação
        at1[0] = new Corredor("Usain St. Leo Bolt",36,86.0,1.96);
        at1[1] = new Futebolista("Cristiano Ronaldo dos Santos Aveiro",38,83.0,1.85);
        at1[2] = new Tenista("Carlos Alberto Kirmayr",72,68.0,1.73);

        at.add(new Corredor("Guye Adola Idemo",32,54,1.75));
        at.add(new Futebolista("Neymar da Silva Santos Júnior",31,75,1.75));
        at.add(new Tenista("Novak Djokovic",35,90,1.86));

        //Exercicio 7
        System.out.println("\nExercicio 7: ");
        Ordenabled.Ordena(at1);
        Ordenabled.Ordena(at);

        System.out.println("Imprimindo Lista de Jogadores : ");
        for (int i = 0; i < 3; i++) {
            System.out.println(at1[i].toString());
        }
        System.out.println("\nImprimindo ArrayList de Jogadores : ");
        for (int i = 0; i < 3; i++) {
            System.out.println(at.get(i).toString());
        }

        System.out.println("\nExercicio 8: ");
        LocalDate today = LocalDate.now();
        LocalDate now = LocalDate.of(2024, 6,26);

        Period periodo = Period.between(today,now);
        System.out.println("Falta "+ (periodo.getDays()+periodo.getMonths()*31+periodo.getYears()*365) +" dias paras as Proximas Olimpiadas");

    }
}