import java.util.*;

public class HashTable{

    private int size = 7;
    private Node[] dataMap;

    class Node{
        String key;
        int value;
        Node next;
        
        public Node(String key, int value){
            this.key = key;
            this.value = value;
        }
    }

    public HashTable(){
        dataMap = new Node[size];
    }

    private int get(String key){
        int index = hash(key);
        Node temp = dataMap[index];

        while(temp != null){
            if(temp.key == key){
                return temp.value;
            }
            temp = temp.next;
        }
        return 0;
    }

    private boolean set(String key, int value){
        Node newNode = new Node(key, value);
        int hash = hash(key);
        if(dataMap[hash]== null){
            dataMap[hash] = newNode;
        }else{
            Node temp = dataMap[hash];
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return true;
    }

    private List<String> keys(){
        List<String> allKeys = new ArrayList<>();

        for(int i = 0; i < dataMap.length; i++){
            Node temp = dataMap[i];
            while(temp != null){
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }

        return allKeys;
    }
    private int hash(String key){
        int hash = 0;
        char[] keyChars = key.toCharArray();

        for(int i = 0; i < keyChars.length; i++){
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    public void printHashTable(){
        for(int i = 0; i < dataMap.length; i++){
            Node temp = dataMap[i];
            System.out.println(i + ":");
            while(temp != null){
                System.out.println(" {" + temp.key + "= "+ temp.value + "}");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args){
        HashTable map = new HashTable();
        map.set("hi", 1);
        map.set("bye", 2);
        map.printHashTable();
        System.out.println(map.get("hi"));
        System.out.println(map.keys());
        
    }

}