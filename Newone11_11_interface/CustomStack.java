package Newone11_11_interface;

import java.util.EmptyStackException;

public class CustomStack<T> {
    private Node<T> top = null;
    private int size = 0;

    public void push(T value) {
        top = new Node<T>(value, top);
        size++;
    }

    public T pop() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException();
        T value = top.value;
        top = top.next;
        size--;
        return value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private static class Node<T> {
        private final T value;
        private final Node<T> next;

        private Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }
}