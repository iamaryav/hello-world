package datastructures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {

    private Node front;
    private Node back;
    private int size;

    public Deque() {
        front = null;
        back = null;
        size = 0;
    }

    public boolean isEmpty() {
        return (front == null && back == null);
    }

    public int size() {
        return size;
    }

    public void addFirst(Item item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }
        Node newNode = new Node();
        newNode.item = item;
        if (size == 0) {
            front = newNode;
            back = newNode;
        } else if (size == 1) {
            newNode.next = back;
            back.prev = newNode;
        } else {
            front.prev = newNode;
            newNode.next = front;
        }
        front = newNode;
        size++;
    }

    public void addLast(Item item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }
        Node newNode = new Node();
        newNode.item = item;
        if (size == 0) {
            front = newNode;
        } else if (size == 1) {
            newNode.prev = front;
            front.next = newNode;
        } else {
            back.next = newNode;
            newNode.prev = back;
        }
        back = newNode;
        size++;
    }

    public Item removeFirst() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        Item removedItem = front.item;
        if (size == 1) {
            front = null;
            back = null;
        } else {
            front.next.prev = null;
            front = front.next;
        }
        size--;
        return removedItem;
    }

    public Item removeLast() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        Item removedItem = back.item;
        if (size == 1) {
            front = null;
            back = null;
        } else {
            back.prev.next = null;
            back = back.prev;
        }
        size--;
        return removedItem;
    }

    public DequeIterator iterator() {
        return new DequeIterator();
    }

    private class DequeIterator implements Iterator<Item> {

        private Node current = front;

        public boolean hasNext() {
            return current != null;
        }

        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Item currenItem = current.item;
            current = current.next;
            return currenItem;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

    }

    private class Node {
        Item item;
        Node prev;
        Node next;
    }

    public static void main(String[] args) {
        Deque<Integer> dq = new Deque<>();
        System.out.println(dq.isEmpty());
        dq.addFirst(7);
        dq.addLast(6);
        dq.addLast(5);
        dq.addFirst(4);
        for (int i : dq) {
            System.out.println(i);
        }

        dq.removeFirst();
        dq.removeLast();
        dq.removeLast();
        dq.removeFirst();
        for (int i : dq) {
            System.out.println(i);
        }
    }
}
