/**
 * example:
 * aabcccccaaa -> a2b1c5a3
 * 
 * create an anagram of the word in array
 * 
 * if len of new string is less than actual string
 * return new string 
 * else return old string
 * 
 * Time complexity: 
 * O(n)
 * Space complexity:
 * O(1)
 * 
 * 
 */

import java.util.List;

public class StringCompression{
    public static void main(String[] args){
        
        List<String> listOfWords = List.of("aabcccccaaa", "aabbccddeeA", "abcdefghi");

        for(String word : listOfWords){
            System.out.println(word);
            int[] wordAnagram = wordAnagram(word);
            String compressedString = compressString(wordAnagram);
            for(int i = 0; i < wordAnagram.length; i++){
                System.out.print(wordAnagram[i]);
            }
            System.out.println();
            System.out.println(compressedString);
            String finalString = isStringCompressed(word, compressedString);
            System.out.println(finalString);
        }
                
    }

    public static int[] wordAnagram(String word){
        int[] anagram = new int[26];

        word = word.toLowerCase();
        for(int i = 0; i < word.length(); i++){
            int index = word.charAt(i) - 'a';
            anagram[index] += 1;
        }
        return anagram;
    }

    public static String compressString(int[] wordAnagram){

        String compressedString = "";
        for(int i = 0; i < wordAnagram.length; i++){
            if(wordAnagram[i] > 0){
                System.out.println(String.valueOf(Character.forDigit(('a' + i), 10)));
                String currentChar = String.valueOf(Character.forDigit(('a' + i), 10)) + String.valueOf(wordAnagram[i]);
            }
        }
        return compressedString;
    }

    public static String isStringCompressed(String word, String compressedString){
        
        if(word.length() <= compressedString.length()){
            return word;
        }
        return compressedString;
    }
}