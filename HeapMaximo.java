import java.util.*;
public class HeapMaximo<T extends Comparable<T>>{
    private ArrayList<T> arreglo;

    public HeapMaximo(){
        this.arreglo=new ArrayList<>();
    }
    public ArrayList<T> getArreglo(){
        return this.arreglo;
    }
    public boolean isEmpty(){
        return this.arreglo == null;
    }
    public void insertElemento(T elemento){
        arreglo.add(elemento);
        insertOrdenado(arreglo.size()-1);//devuelve el número de elementos antes de hacer la inserción
    }
    private void swap(int i, int j) {
        T temp = arreglo.get(i);
        arreglo.set(i, arreglo.get(j));
        arreglo.set(j, temp);
    }
    public void insertOrdenado(int index){
        int ParentIndex =(index-1)/2; //Sirve para hallar la ubicación del padre del elemento
        //Si el index es mayor que 0 es la raíz no se debe cambiar posiciones
        while(index > 0 && arreglo.get(index).compareTo(arreglo.get(ParentIndex))>0){ //Si el hijo es mayor que el padre deben cambiar de lugar para que sea un arbol máximo.
            swap(index, ParentIndex);//Intercambia el padre con el hijo, para recorrer el arbol.
            index = ParentIndex;
            ParentIndex= (index - 1) / 2;
        }
    }
    public T eliminar() {
       if (isEmpty()) {
            throw new IllegalStateException("Arreglo vacio");
        }
        T max = arreglo.get(0);
        int lastIndex = arreglo.size() - 1;
        arreglo.set(0, arreglo.get(lastIndex));//reemplaza el menor de todos los elementos por la raiz para reconstruir el Heap
        arreglo.remove(lastIndex);//se elimina el elemento removido del arreglo
        eliminar(0);// en este arreglo siempre se elimina el mayor de todos lo elementos
        return max;
    }
    private void eliminar(int index) {
        int hijoIzquierdo = 2 * index + 1;
        int hijoDerecho = 2 * index + 2;
        int largestIndex = index;

        if (hijoIzquierdo< arreglo.size() && arreglo.get(hijoIzquierdo).compareTo(arreglo.get(largestIndex)) > 0) {//Si el hijo izquierdo es mayor se intercambia
            largestIndex = hijoIzquierdo;
        }
        if (hijoDerecho< arreglo.size() && arreglo.get(hijoDerecho).compareTo(arreglo.get(largestIndex)) > 0) {//Si el hijo derecho es mayor se intercambia
            largestIndex = hijoDerecho;
        }
        if (largestIndex != index) {
            swap(index, largestIndex);//Se intercambian los valores para ordenar el arbol
            eliminar(largestIndex);//se continua evaluando desde la posición que se cambio
        }
    }
    public int size(){
        return arreglo.size();
    }
    public T peek() {
        return this.arreglo.get(0);
    }
    public T getMax(){ //Metodo que devuelve el mayor elemento del heap
        return arreglo.get(0);
    }
    public T getMin() throws ExceptionIsEmpty { //Método que devuelve el mínimo valor del heap
        if (isEmpty()) {
            throw new ExceptionIsEmpty("El heap está vacío");
        }
        T minItem = arreglo.get(0);
        for (int i = 1; i < arreglo.size(); i++) {
            T currentItem = arreglo.get(i);
            if (currentItem.compareTo(minItem) < 0) {
                minItem = currentItem;
            }
        }
        return minItem;
    }
    public String toString(){
        return arreglo.toString();
    }
}