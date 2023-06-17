public class PriorityQueueHeap<T extends Comparable<T>> {
    private HeapMaximo <PriorityQueueElement<T>> heapMax;
    public PriorityQueueHeap() {
        heapMax = new HeapMaximo<>();
    }
    public void Enqueue(T element, int priority) {
        PriorityQueueElement<T> queueElement = new PriorityQueueElement<>(element, priority);
        heapMax.insertarElemento(queueElement);
    }
    public T Dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola de prioridad está vacía.");
        }
        return heapMax.eliminarElemento().getElement();
    }

    public T Front() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola de prioridad está vacía.");
        }

        return heapMax.mayor().getElement();
    }
    public T Back() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola de prioridad está vacía.");
        }

        int lastElementIndex = heapMax.getCantidad() - 1;
        return heapMax.get(lastElementIndex).getElement();
    }
    public boolean isEmpty() {
        return heapMax.isEmpty();
    }
}
