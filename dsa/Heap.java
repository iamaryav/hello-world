public class Heap{

    private List<Integer> heap;

    public Heap(){
        heap = new ArrayList<Integer>();
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

    private int parent(int index){
        return (index - 1) / 2;
    }

    public static void main(String[] args){
        Heap heap = new Heap();

    }
}