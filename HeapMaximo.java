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
        insertOrdenado(arreglo.size()-1);//devuelve el número de elmentos antes de hacer la inserción
    }

    private void swap(int i, int j) {
        T temp = arreglo.get(i);
        arreglo.set(i, arreglo.get(j));
        arreglo.set(j, temp);
    }
    public void insertOrdenado(int index){
        int ParentIndex =(index-1)/2; //Sirve para hallar la ubicación del padre del elemento
        //Si el index es mayor que 0 es la raíz no se debe cambiar posiciones
        while(index > 0 && arreglo.get(index).compareTo(arreglo.get(ParentIndex))>0){
            swap(index, ParentIndex);//Intercambia el padre con el hijo, para recorrer el arbol.
            index = ParentIndex;
            ParentIndex= (index - 1) / 2;
        }
    }
    public void eliminar(ArrayList<T> arreglo ) {
       

    }
}