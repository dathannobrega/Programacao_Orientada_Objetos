package entity;


import java.util.ArrayList;

///INTERFACE CRIADA PARA COLOCAR TODOS AS Funções das listas de Atleta.
public interface Ordenabled {

    static void  Ordena(Atleta at[]){
        Atleta aux;
        int trocas;
        for (int i = 0; i< at.length;i++) {
            trocas = 0;
            for (int j = 0; j < at.length-i-1 ; j++) {
                if((at[j].compareTo(at[j+1]))==1){
                    aux = at[j];
                    at[j] = at[j+1];
                    at[j+1] = aux;
                    trocas++;
                }
                if(trocas==0)// se nao for feita nenhuma troca ele entende que ja esta ordenado.
                    return;
            }
        }
    }

    static void Ordena(ArrayList<Atleta> at){
        Atleta aux;
        int trocas;
        for (int i = 0; i< at.size();i++) {
            trocas = 0;
            for (int j = 0; j < at.size()-i-1 ; j++) {
                if((at.get(j).compareTo(at.get(j+1)))==1){
                    aux = at.get(j);
                    at.set(j,at.get(j+1));
                    at.set(j+1,aux);
                    trocas++;
                }
                if(trocas==0)// se nao for feita nenhuma troca ele entende que ja esta ordenado.
                    return;
            }
        }
    }
}
