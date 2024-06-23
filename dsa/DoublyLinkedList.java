public class DoublyLinkedList{
    Node head;
    Node tail;
    int length;


    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node get(int index){
        if(index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        if(index < length / 2){
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
        }else{
            temp = tail;
            for(int i = length - 1; i > index; i--){
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value){

        Node temp = get(index);

        if(temp != null){
            temp.value = value;
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
            Node before = get(index - 1);
            Node newNode = new Node(value);
            // 1 -> 2 -> 3 -> 4
            Node after = before.next;
            newNode.next = after;
            newNode.prev = before;
            after.prev = newNode;
            before.next = newNode;
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
        Node temp = get(index);
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp.prev = null;
        temp.next = null;
        length -= 1;
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length += 1;
    }

    public Node removeFirst(){

        if(length == 0){
            return null;
        }
        Node temp = head;

        if(length == 1){
            head = null;
            tail = null;
        }else{
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length -= 1;
        return temp;
    }

    public void append(int value){
        Node newNode = new Node(value);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length += 1;
    }

    public Node remove(){

        if(length == 0){
            return null;
        }

        Node temp = tail;
        if(length == 1){
            head = null;
            tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length -= 1;
        return temp;
    }

    public void printList(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void getHead(){
        System.out.println("Head: " + head.value);
    }

    public void getTail(){
        System.out.println("Tail: " + tail.value);
    }

    public void getLength(){
        System.out.println("Length: " + length);
    }


    class Node{
        Node prev;
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public static void main(String[] args){

        DoublyLinkedList list = new DoublyLinkedList(3);
        list.printList();
        list.append(2);
        list.append(4);
        list.append(6);
        list.printList();
        System.out.println("Deleted Node is: " +  list.remove().value);
        list.printList();
        list.getLength();
        System.out.println("Prepend: ");
        list.prepend(21);
        list.printList();
        list.getLength();
        System.out.println("Deleted Node is: " +  list.removeFirst().value);
        list.printList();
        list.getLength();
        System.out.println("Get: ");
        System.out.println("value at 1 is: " + list.get(1).value);
        list.printList();
        System.out.println("set value at index 2: " + list.set(2, 10));
        list.printList();
        list.insert(3, 11);
        list.printList();
        list.insert(2, 17);
        list.printList();
        list.remove(4);
        list.printList();

    }
}