public class PriorityQueueElement<T extends Comparable<T>> implements Comparable<PriorityQueueElement<T>> {
    private T element;
    private int priority;

    public PriorityQueueElement(T element, int priority) {
        this.element = element;
        this.priority = priority;
    }

    public T getElement() {
        return element;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(PriorityQueueElement<T> o) {
        return 0;
    }
}
