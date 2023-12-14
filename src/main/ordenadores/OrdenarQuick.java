package ordenadores;
public class OrdenarQuick implements Ordenador{

    @Override
    public int[] ordene(int[] array) {

        return array;
    }

    public int quickParticio(int[] array, int inicio, int fim){
        int metade = (inicio + fim)/2;
        int pivo = array[metade];
        int i = inicio - 1;
        int j = fim + 1;
        while (i < j && array[i] < pivo) {
            i++;
        }
        
        while (i < j && array[j] > pivo) {
            j--;
        }
        
        if (i >= j) {
            return j;
        }
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
        return j;
    }
}
