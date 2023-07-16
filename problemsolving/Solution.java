import java.util.HashMap;
import java.util.Map;

public class Solution{
    public static void main(String[] args){
        
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Aryav");
        hm.put(2, "Rahul");

        for(Map.Entry<Integer, String> el : hm.entrySet()){
            System.out.println("key: " + el.getKey());
            System.out.println("value: " + el.getValue());
        }

        hm.forEach((k, v) -> {
            System.out.println("key: " + k);
            System.out.println("value: " + v);
        });

    }
}
