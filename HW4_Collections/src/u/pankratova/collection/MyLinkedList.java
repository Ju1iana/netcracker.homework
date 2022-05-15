package u.pankratova.collection;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements ILinkedList<E> {

    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

    public MyLinkedList() {
    }

    private class ListIterator implements Iterator<E> {

        private Node<E> lastReturned;
        private Node<E> next;
        private int nextIndex;

        @Override
        public boolean hasNext() {
            return nextIndex < size;
        }

        @Override
        public E next() {
            if (!hasNext())
                throw new NoSuchElementException();

            lastReturned = next;
            next = next.nextNode;
            nextIndex++;
            return lastReturned.element;
        }
    }

    void linkBefore(E element, Node<E> succ) {
        final Node<E> pred = succ.prevNode;
        final Node<E> newNode = new Node<>(pred, element, succ);
        succ.prevNode = newNode;
        if (pred == null)
            firstNode = newNode;
        else
            pred.nextNode = newNode;
        size++;
    }

    void linkLast(E element) {
        final Node<E> l = lastNode;
        final Node<E> newNode = new Node<>(l, element, null);
        lastNode = newNode;
        if (l == null)
            firstNode = newNode;
        else
            l.nextNode = newNode;
        size++;
    }

    E unlink(Node<E> x) {
        final E element = x.element;
        final Node<E> next = x.nextNode;
        final Node<E> prev = x.prevNode;

        if (prev == null) {
            firstNode = next;
        } else {
            prev.nextNode = next;
            x.prevNode = null;
        }

        if (next == null) {
            lastNode = prev;
        } else {
            next.prevNode = prev;
            x.nextNode = null;
        }

        x.element = null;
        size--;
        return element;
    }

    @Override
    public void add(E element) {
        linkLast(element);
    }

    @Override
    public void add(int index, E element) {
        checkPositionIndex(index);

        if (index == size)
            linkLast(element);
        else
            linkBefore(element, node(index));
    }

    @Override
    public void clear() {
        for (Node<E> x = firstNode; x != null; ) {
            Node<E> next = x.nextNode;
            x.element = null;
            x.nextNode = null;
            x.prevNode = null;
            x = next;
        }
        firstNode = lastNode = null;
        size = 0;
    }

    @Override
    public E get(int i) {
        checkElementIndex(i);
        return node(i).element;
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node<E> x = firstNode; x != null; x = x.nextNode) {
                if (x.element == null)
                    return index;
                index++;
            }
        } else {
            for (Node<E> x = firstNode; x != null; x = x.nextNode) {
                if (o.equals(x.element))
                    return index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        checkElementIndex(index);
        return unlink(node(index));
    }

    @Override
    public E set(int index, E element) {
        checkElementIndex(index);
        Node<E> x = node(index);
        E oldVal = x.element;
        x.element = element;
        return oldVal;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (Node<E> x = firstNode; x != null; x = x.nextNode)
            result[i++] = x.element;
        return result;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < size)
            a = (T[]) Array.newInstance(a.getClass().getComponentType(), size);
        int i = 0;
        Object[] result = a;
        for (Node<E> x = firstNode; x != null; x = x.nextNode)
            result[i++] = x.element;

        if (a.length > size)
            a[size] = null;

        return a;
    }

    @Override
    public Iterator<E> iterator() {
        return new ListIterator();
    }


    private static class Node<E> {
        private E element;
        private Node<E> nextNode;
        private Node<E> prevNode;

        public Node(Node<E> prevNode, E element, Node<E> nextNode) {
            this.element = element;
            this.nextNode = nextNode;
            this.prevNode = prevNode;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node<E> nextNode) {
            this.nextNode = nextNode;
        }

        public Node<E> getPrevNode() {
            return prevNode;
        }

        public void setPrevNode(Node<E> prevNode) {
            this.prevNode = prevNode;
        }

    }


    private void checkPositionIndex(int index) {
        if (!(index >= 0 && index <= size))
            throw new IndexOutOfBoundsException("index: " + index);
    }

    private void checkElementIndex(int index) {
        if (!(index >= 0 && index < size))
            throw new IndexOutOfBoundsException();
    }

    Node<E> node(int index) {

        if (index < (size >> 1)) {
            Node<E> x = firstNode;
            for (int i = 0; i < index; i++)
                x = x.nextNode;
            return x;
        } else {
            Node<E> x = lastNode;
            for (int i = size - 1; i > index; i--)
                x = x.prevNode;
            return x;
        }
    }

    @Override
    public String toString() {
        String s = "[";
        Node<E> x = firstNode;

        for (int i = 0; i < size; i++) {
            s = s + " " + x.element;
            x = x.nextNode;

            if (i == size - 1)
                s = s + "]";
        }

        if (s.equals("[")){
            return null;
        } else
            return s;
    }
}
