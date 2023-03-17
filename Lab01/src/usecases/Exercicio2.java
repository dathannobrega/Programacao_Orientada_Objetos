package usecases;

import entity.Runnebled;

import java.util.HashMap;
import java.util.Scanner;

public class Exercicio2 implements Runnebled {

    @Override
    public void run() {
        HashMap <Character,Integer> HM = new HashMap<Character, Integer>();
        String str1;
        System.out.print("Digite uma Palavra: ");
        str1 = sc.nextLine();

        for (int i = 0; i < str1.length(); i++) { // inicializar o HashMap
            HM.put(str1.charAt(i),0);
        }
        for (char c :str1.toCharArray()) { // faz a contagem dos caracteres
            HM.put(c,HM.get(c)+1);
        }

        System.out.println(HM.toString());
    }
}
