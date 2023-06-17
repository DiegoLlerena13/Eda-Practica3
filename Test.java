public class Test {
    public static void main(String[]args){
        HeapMaximo<Integer> arbol= new HeapMaximo<>();
        arbol.insertElemento(14);
        arbol.insertElemento(8);
        arbol.insertElemento(2);
        arbol.insertElemento(10);
        arbol.insertElemento(9);
        arbol.insertElemento(7);
        arbol.insertElemento(4);
        arbol.insertElemento(3);
        arbol.insertElemento(1);
        arbol.insertElemento(16); 
        for (Integer p : arbol.getArreglo()) {
            System.out.print(p+", ");
        }
        System.out.println();
        arbol.eliminar();
        for (Integer p : arbol.getArreglo()) {
            System.out.print(p+ ", ");
        }
    }
}