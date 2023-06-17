import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PriorityQueueHeap<Integer> lista= new PriorityQueueHeap<>();
        lista.Enqueue(12,0);
        lista.Enqueue(10,1);
        lista.Enqueue(13,2);
        lista.Enqueue(15,3);
        lista.Enqueue(16,4);
        System.out.println("Elemento de inicio: "+lista.Front());
        System.out.println("Elemento de final: "+lista.Back());
        lista.Dequeue();
        lista.Dequeue();
        System.out.println("Elemento de inicio: "+lista.Front());
    }
}