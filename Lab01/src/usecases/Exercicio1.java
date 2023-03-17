package usecases;
import entity.Runnebled;
public class Exercicio1 implements Runnebled {

    @Override
    public void run() {
        String str1,str2;
        System.out.println("Digite a primeira palavra:");
        str1 = sc.nextLine();

        System.out.println("Digite a segunda palavra:");
        str2 = sc.nextLine();
        if(str1.endsWith(str2)){
            System.out.println("Termina:");
        } else {
            System.out.println("Não Termina");
        }
    }
}
