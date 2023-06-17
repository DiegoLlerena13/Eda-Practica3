public class PriorityQueueHeap<T extends Comparable<T>> {
   private HeapMaximo<PriorityItem<T>> heap;
    public PriorityQueueHeap() {
        heap = new HeapMaximo<>();
    }

    public void enqueue(T item, int priority) { //Agrega los elmentos de mayor a menor porque es un arbol maximo
        PriorityItem<T> priorityItem = new PriorityItem<>(item, priority);
        heap.insertElemento(priorityItem);
    }

    public boolean isEmpty() {// metdo para saber si el arreglo esta vacio
        return heap.isEmpty();
    }

    public T dequeue() throws ExceptionIsEmpty { //Elimina y regresa el elemnto de mayor prioridad siempre, además ordena nuevamente el heap
        if (isEmpty()) {
            throw new ExceptionIsEmpty("la cola esta vacia");
        }
        PriorityItem<T> priorityItem = heap.eliminar();
        return priorityItem.getItem();
    }

    public T back() throws ExceptionIsEmpty { //Devuelve el elemento de menor prioridad
        if (isEmpty()) {
            throw new ExceptionIsEmpty("la cola esta vacia");
        }
        PriorityItem<T> priorityItem = heap.getMax();
        return priorityItem.getItem();
    }

    public T front() throws ExceptionIsEmpty { //Devuelve el elemento de mayor proridad
        if (isEmpty()) {
            throw new ExceptionIsEmpty("la cola esta vacia");
        }
        PriorityItem<T> priorityItem = heap.getMin();
        return priorityItem.getItem();
    }

    public String toString() {
        return heap.toString();
    }

    private class PriorityItem<T extends Comparable<T>> implements Comparable<PriorityItem<T>> { //Clase de elemento de prioridad
        private T item;
        private int priority;

        public PriorityItem(T item, int priority) {
            this.item = item;
            this.priority = priority;
        }

        public T getItem() {
            return this.item;
        }

        public int compareTo(PriorityItem<T> other) {
            return Integer.compare(priority, other.priority);
        }

        public String toString() {
            return item.toString() + " (Prioridad: " + priority + ")";
        }
    }
}
