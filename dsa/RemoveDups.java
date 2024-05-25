import java.util.*;



public class RemoveDups{

    public static void main(String[] args){

        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 4, 5, 1, 2, 6, 7, 8));

        // with buffer
        LinkedList<Integer> uniqueNumbers = removeDupliateWithBuffer(numbers);
        numbers.stream().forEach(System.out::println);

    }

    // Time complexity O(N)
    public static LinkedList<Integer> removeDupliateWithBuffer(LinkedList<Integer> head){
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        LinkedListNode n = head;
        LinkedListNode prev = null;

        
        while(n != null){
            if(uniquenumbers.contains(n.data)){
               prev.next = n.next; 
            }else{
                uniqueNumbers.add(n.data);
                prev = n;
            }
            n = n.next;
        }
        return numbers;
    }

    // Time O(N^2)
    // space O(1)

    public static LinkedList<Integer> removeDupliateWithoutBuffer(LinkedList<Integer> head){
        
        LinkedListNode current = head;

        while(current != null){

            LinkedListNode runner = current;
            while(runner.next != null){
                if(runner.next.data == current.data){
                    runner.next = runner.next.next;
                }else{
                    runner = runner.next;
                }
                runner = runner.next;
            }
            current = current.next;
        }
    }

}