package datastructures;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomizedQueue<Item> implements Iterable<Item> {

    private Item[] randomQueue;
    private int noOfItems;

    public RandomizedQueue() {
        randomQueue = (Item[]) new Object[1];
        noOfItems = 0;
    }

    public boolean isEmpty() {
        return noOfItems == 0;
    }

    public int size() {
        return noOfItems;
    }

    public void enqueue(Item item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }

        if (noOfItems == randomQueue.length) {
            resize(2 * randomQueue.length);
        }

        randomQueue[noOfItems] = item;
        noOfItems++;
    }

    public Item dequeue(){
        if(noOfItems == 0){
            throw new NoSuchElementException();
        }
        int index = new Random().nextInt(noOfItems);
        Item deletedItem = randomQueue[index];

        if(index != noOfItems-1){
            randomQueue[index] = randomQueue[noOfItems - 1];
        }
        randomQueue[noOfItems - 1] = null;
        noOfItems--;

        if(noOfItems < randomQueue.length/4){
            resize(randomQueue.length/4);
        }
        return deletedItem;
    }

    public Item sample() {
        if (noOfItems == 0) {
            throw new NoSuchElementException();
        }
        int random = new Random().nextInt(noOfItems);
        return randomQueue[random];
    }

    public void resize(int newSize) {

        Item[] tempRandom = (Item[]) new Object[newSize];
        for (int i = 0; i < noOfItems; i++) {
            tempRandom[i] = randomQueue[i];
        }
        randomQueue = tempRandom;
    }

    // Iterator
    public Iterator<Item> iterator() {
        return new RQIterator();
    }

    private class RQIterator implements Iterator<Item> {

        private final Item[] copiedRandomQueue;
        private int index;

        public RQIterator() {
            copiedRandomQueue = (Item[]) new Object[noOfItems];
            for (int i = 0; i < noOfItems; i++) {
                copiedRandomQueue[i] = randomQueue[i];
            }
            StdRandom.shuffle(copiedRandomQueue);
        }

        public boolean hasNext() {
            return index != copiedRandomQueue.length;
        }

        public void remove(){
            throw new UnsupportedOperationException();
        }

        public Item next(){
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            index++;
            return copiedRandomQueue[index-1];
        }
    }

    // unit testing

    public static void main(String[] args){

        RandomizedQueue<Integer> rq = new RandomizedQueue<>();
        rq.enqueue(5);
        rq.enqueue(6);
        rq.enqueue(7);

        StdOut.println(rq.sample());
        rq.enqueue(8);
        rq.enqueue(9);
        rq.dequeue();
        rq.dequeue();
        rq.dequeue();

        for (Object i : rq){
            StdOut.println(i);
        }
    }
}