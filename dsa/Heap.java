import java.util.*;

public class Heap{

    private List<Integer> heap;

    public Heap(){
        this.heap = new ArrayList<Integer>();
    }

    private List<Integer> getHeap(){
        return new ArrayList<>(heap);
    }

    private int leftChild(int index){
        return 2 * index + 1;
    }

    private int rightChild(int index){
        return 2 * index + 2;
    }

    private int parent(int index){
        return (index - 1) / 2;
    }

    private void swap(int index1, int index2){
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value){
        heap.add(value);
        int current = heap.size() - 1;

        while(current > 0 && heap.get(current) > heap.get(parent(current))){
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public Integer remove(){
        if(heap.size() == 0){
            return null;
        }

        if(heap.size() == 1){
            return heap.remove(0);
        }

        int maxValue = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        sinkDown(0);

        return maxValue; 
    }

    private void sinkDown(int index){

        int maxIndex = index;

        while(true){

            int leftIndex = leftChild(index);
            int rightIndex = rightChild(index);

            if(leftIndex < heap.size() && heap.get(leftIndex) > heap.get(rightIndex)){
                maxIndex = leftIndex;
            }

            if(rightIndex < heap.size() && heap.get(rightIndex) > heap.get(leftIndex)){
                maxIndex = rightIndex;
            }

            if(maxIndex != index){
                swap(index, maxIndex);
                index = maxIndex;
            }else{
                return;
            }
        }
    }

    public static void main(String[] args){
        Heap heap = new Heap();
        heap.insert(99);
        heap.insert(72);
        heap.insert(61);
        heap.insert(58);
        System.out.println(heap.getHeap());
        heap.insert(100);
        System.out.println(heap.getHeap());
        heap.insert(75);
        System.out.println(heap.getHeap());
        System.out.println(heap.remove());
        System.out.println(heap.getHeap());
    }
}