package entity;

import java.util.Scanner;

/*
Interface Criada para Padronizar todos as outras classes e forcar usar a função Run.
* */
public interface Runnebled {
    public void run();
    Scanner sc = new Scanner(System.in); // Scanner para eu usar em todas as classes
}
