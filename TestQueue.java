public class TestQueue {
    public static void main(String[] args) throws ExceptionIsEmpty {
        PriorityQueueHeap<String> colaPrio= new PriorityQueueHeap<>();
        colaPrio.enqueue("Juan", 2);
        colaPrio.enqueue("Marco", 1);
        colaPrio.enqueue("Lucas", 3);
        colaPrio.enqueue("Pedro", 6);
        colaPrio.enqueue("Henry", 5);
        colaPrio.enqueue("Alberto", 7);
        System.out.println("Cola de prioridad : " + colaPrio);
        System.out.println("Front: " + colaPrio.front());
        System.out.println("Back: " + colaPrio.back());
        System.out.println("Elemento eliminado: " + colaPrio.dequeue());
        System.out.println("Cola de prioridad después de eliminar: " + colaPrio);
    }
}