import java.util.ArrayList;
import java.util.List;

public class HeapMaximo <T extends Comparable<T>> {
    private ArrayList<T> lista;

    public int getCantidad(){
        return lista.size();
    }
    public T get(int i){
        return lista.get(i);
    }
    public ArrayList<T> getLista() {
        return lista;
    }
    public HeapMaximo() {
        this.lista = new ArrayList<>();
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }
    public void insertarElemento(T element) {
        lista.add(element);
        insertar(lista.size() - 1);
    }
    private void insertar(int index) {
        //Por fórmula del ordenamiento
        int indicePadre = (index - 1) / 2;
        while (index > 0 && lista.get(index).compareTo(lista.get(indicePadre)) > 0) {
            swap(index, indicePadre);
            index = indicePadre;
            indicePadre = (index - 1) / 2;
        }
    }
    public T eliminarElemento() {
        if (isEmpty()) {
            throw new IllegalStateException("El Max Heap está vacío.");
        }
        T max = lista.get(0);
        T lastElement = lista.remove(lista.size() - 1);

        if (!isEmpty()) {
            lista.set(0, lastElement);
            moverAbajo(0);
        }
        return max;
    }

    private void moverAbajo(int index) {
        int leftChildIndex = (2 * index) + 1;
        int rightChildIndex = (2 * index) + 2;
        int largestIndex = index;

        if (leftChildIndex < lista.size() && lista.get(leftChildIndex).compareTo(lista.get(largestIndex)) > 0) {
            largestIndex = leftChildIndex;
        }

        if (rightChildIndex < lista.size() && lista.get(rightChildIndex).compareTo(lista.get(largestIndex)) > 0) {
            largestIndex = rightChildIndex;
        }

        if (largestIndex != index) {
            swap(index, largestIndex);
            moverAbajo(largestIndex);
        }
    }

    public T mayor(){
        if (isEmpty()) {
            throw new IllegalStateException("El Max Heap está vacío.");
        }
        return lista.get(0);
    }

    private void swap(int i, int j) {
        T temp = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, temp);
    }
}
