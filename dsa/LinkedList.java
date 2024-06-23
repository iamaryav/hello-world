public class LinkedList{
    // constructor
    // printList
    // append
    // Remove Last
    // prepend
    // Remove first
    // get 
    // set <--
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

    public Node get(int index){
        Node currNode = head;
        if(index > length - 1 || index < 0){
            return null;
        }
        for(int i = 0; i < index; i++){
            currNode = currNode.next;
        }
        return currNode;
    }

    public boolean set(int index, int value){
        Node currNode = get(index);

        if(currNode != null){
            currNode.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if(index < 0 || index > length){
            return false;
        }
        if(index == 0){
            prepend(value);
            return true;
        }else if(index == length){
            append(value);
            return true;
        }else{
            Node prevNode = get(index - 1);
            Node newNode = new Node(value);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
            length += 1;
            return true;
        }
    }

    public Node remove(int index){

        if(index < 0 || index >= length){
            return null;
        }

        if(index == 0){
            return removeFirst();
        }else if(index == length - 1){
            return remove();
        }
        Node prev = get(index - 1);
        Node curr = prev.next;
        prev.next = curr.next;
        curr.next = null;
        length -= 1;
        return curr;
    }

    public void reverse(){
        Node curr = head;
        head = tail;
        tail = curr;
        Node prev = null;
        Node nextNode = curr.next;


        while(nextNode != null){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
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

        System.out.println("Get the value at the Index: ");
        System.out.println("value at index 3 is: " + list.get(3).value);
        
        System.out.println("set the value at the Index: ");
        System.out.println("set the value at index 2 is: " + list.set(2, 16));
        list.printList();

        System.out.println("Insert the value at the Index: ");
        System.out.println("Insert the value at index 3 is: " + list.insert(3, 36));
        list.printList();

        System.out.println("Remove form the value at the Index: ");
        System.out.println("Remove the value at index 3 is: " + list.remove(3).value);
        list.printList();


        System.out.println("Reverse the linked list: ");
        list.reverse();
        list.printList();


        


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