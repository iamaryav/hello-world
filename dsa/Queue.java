public class Queue{
    private Node first;
    private Node last;
    private int length;
    
    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void enqueu(int value){
        Node newNode = new Node(value);
        if(length == 0){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
        length += 1;
   }

   public Node dequeue(){
        if(length == 0){
            return null;
        }
        Node temp = first;
        if(length == 1){
            first = null;
            last = null;
        }else{
            first = first.next;
            temp.next = null;
        }
        length -= 1;
        return temp;
   }

    public void printQueue(){
        Node temp = first;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println();
    }

    public void getFirst(){
        System.out.println("Top: " + first.value);
    }

    public void getLast(){
        System.out.println("Top: " + last.value);
    }

    public void getLength(){
        System.out.println("Length: " + length);
    }

    public static void main(String[] args){
        Queue queue = new Queue(7);
        queue.printQueue();
        queue.enqueu(10);
        queue.enqueu(20);
        queue.enqueu(21);
        queue.enqueu(22);
        System.out.println();
        queue.printQueue();
        queue.dequeue();
        queue.dequeue();
        System.out.println();
        queue.printQueue();
    }
}