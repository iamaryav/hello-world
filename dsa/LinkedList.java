public class LinkedList{
    // constructor
    // printList
    // append
    // Remove Last
    // prepend
    // Remove first
    // get
    // set
    // insert
    // remove
    // reverse

    Node head;
    Node tail;
    int length;

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;

    }

    public void prepend(int value){
        Node newNode = new Node(value);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        length += 1;
    }

    public Node removeFirst(){
        Node firstNode;

        if(length == 0){
            return null;
        }
        firstNode = head;
        head = head.next;
        firstNode.next = null;
        length -= 1;
        if(length == 0){
            tail = null;
        }
        return firstNode;
    }

    public void append(int value){
        Node newNode = new Node(value);

        if(length == 0){
            head = newNode;
            tail = newNode;
            length = 1;
        }else{
            tail.next = newNode;
            tail = newNode;
            length += 1;
        }
    }

    public Node remove(){
        Node currNode = head;
        Node lastNode;
        Node pre = head;

        if(length == 0){
            return null;
        }
        while(currNode.next != null){
            pre = currNode;
            currNode = currNode.next;
        }
        lastNode = currNode;
        tail = pre;
        pre.next = null;
        length -= 1;
        if(length == 0){
            head = null;
            tail = null;
        }
        return lastNode;
    }

    public void printList(){
        Node currNode = head;

        while(currNode != null){
            int val = currNode.value;
            System.out.print(val + " -> ");
            currNode = currNode.next;
        }
        System.out.println("");
    }


    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList(2);
        System.out.println("Append: ");
        list.append(6);
        list.append(3);
        list.append(2);
        list.append(8);
        list.printList();
        list.getHead();
        list.getTail();
        list.getLength();
        System.out.println("Remove: ");

        System.out.println("removed: " + list.remove().value);
        list.printList();
        list.getHead();
        list.getTail();
        list.getLength();

        LinkedList list1 = new LinkedList(1);
        list1.printList();
        list1.getHead();
        list1.getTail();
        list1.getLength();
        System.out.println("removed: " + list1.remove().value);
        list1.printList();
        System.out.println("removed: " + list1.remove());
        System.out.println("Prepend: ");

        list.prepend(10);
        list.printList();
        list.getHead();
        list.getTail();
        list.getLength();

        System.out.println("Remove first: ");

        System.out.println("removed first: " + list.removeFirst().value);
        list.printList();
        list.getHead();
        list.getTail();
        list.getLength();



    }

    public void getHead(){
        System.out.println("head: " + head.value);
    }

    public void getTail(){
        System.out.println("tail: " + tail.value);
    }

    public void getLength(){
        System.out.println("length: " + length);
    }
}