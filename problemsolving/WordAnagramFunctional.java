import java.util.Arrays;
import java.util.stream.IntStream;


public class WordAnagramFunctional{
    public static void main(String[] args){
        String city = "bengaluru";
        int[] wordAnagram = new int[26];

       city.chars()
       .forEach(c -> {
        wordAnagram[c - 'a'] += 1;
        });

       System.out.println("Actual word: " + city);
       IntStream.range(0, wordAnagram.length)
       .forEach(index -> {
           int val = wordAnagram[index];
           if(val > 0){
            char letter = (char)('a' + index);
            System.out.println(letter + "= " + val);
       }
       });
    }
}