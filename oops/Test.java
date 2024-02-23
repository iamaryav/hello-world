import java.util.Map;
import java.util.HashMap;


public class Test{
    public static void main(String[] args){
        System.out.println("Hello, World!");
        Map<String, String> map = new HashMap<>();
        map.put(null, "Accessing null key in hashmap");
        map.get(null);
        System.out.println(map.get(null));
    }
}