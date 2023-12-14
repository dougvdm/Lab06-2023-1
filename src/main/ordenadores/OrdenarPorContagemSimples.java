package ordenadores;

public class OrdenarPorContagemSimples implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        return array;
    }

    int max = array[0];
    for(int i = 1; i < array.length; i++){
        if(array[i] > max){
            max = array[i];
        }
    }
    int [] contagem =  new int[max + 1];
    for (int numero : array){
        contagem[numero]++;
    }
    int aux = 0;
    for (int j = 0; i < contagem.length; j++){
        while (contagem [j] > 0 ){
            array[aux++] = j;
            contagem[j]--;
        }
    }
        return array;

}
}