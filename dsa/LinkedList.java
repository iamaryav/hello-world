public class LinkedList{

    Node head;


    public void addFirst(int data){

        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    public class Node{

        Node prev;
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }
}