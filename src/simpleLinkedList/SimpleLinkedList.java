package simpleLinkedList;

public class SimpleLinkedList<E> implements Linked<E> {

    private Node<E> lastNode;
    private Node<E> firstNode;
    private int size = 0;

    public SimpleLinkedList() {
        lastNode = new Node<E>(null, null, firstNode);
        firstNode = new Node<E>(null, lastNode, null);
    }

    @Override
    public void addLast(E e) {
        Node<E> prev = lastNode;
        prev.setCurrentElement(e);
        lastNode = new Node<>(null, null, prev);
        prev.setNextElement(lastNode);
        size++;
    }

    @Override
    public void addFirst(E e) {
        Node<E> next = firstNode;
        next.setCurrentElement(e);
        firstNode = new Node<>(null, next, null);
        next.setPreviousElement(firstNode);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getElementByIndex(int index) {
        Node<E> target = firstNode.getNextElement();
        for (int i = 0; i < index; i++) {
            target = getNextElementForIndex(target);
        }
        return target.getCurrentElement();
    }

    // Helper method for search an element by index
    private Node<E> getNextElementForIndex(Node<E> current) {
        return current.getNextElement();
    }

    private class Node<E> {
        private E currentElement;
        private Node<E> nextElement;
        private Node<E> previousElement;

        public Node(E currentElement, Node<E> nextElement, Node<E> previousElement) {
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.previousElement = previousElement;
        }

        public E getCurrentElement() {
            return currentElement;
        }

        public void setCurrentElement(E currentElement) {
            this.currentElement = currentElement;
        }

        public Node<E> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<E> nextElement) {
            this.nextElement = nextElement;
        }

        public Node<E> getPreviousElement() {
            return previousElement;
        }

        public void setPreviousElement(Node<E> previousElement) {
            this.previousElement = previousElement;
        }
    }
}
