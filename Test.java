public class Test {
    public static void main(String[]args){
        HeapMaximo<Integer> arbol= new HeapMaximo<>();
        arbol.insertElemento(12);
        arbol.insertElemento(10);
        arbol.insertElemento(13);
        arbol.insertElemento(15);
        arbol.insertElemento(16);
        for (Integer p : arbol.getArreglo()) {
            System.out.println(p);
        
        }
    }
}