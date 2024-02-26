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
 * Instead of string use string builder
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
            System.out.println("word: " + word);
            // check the compressed length in advance to avoid the string creation
            // If we have length in advance we can initiate string builder in advance
            // Avoid String concatenation
            int[] wordAnagram = wordAnagram(word);
            String compressedString = compressString(wordAnagram);
            System.out.println("compressed word : " + compressedString);
            String finalString = isStringCompressed(word, compressedString);
            System.out.println("Final String: " + finalString);
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

        // String compressedString = "";
        StringBuilder compressedString = new StringBuilder();
        for(int i = 0; i < wordAnagram.length; i++){
            if(wordAnagram[i] > 0){
                // compressedString += String.valueOf((char)('a' + i)) + String.valueOf(wordAnagram[i]);
                compressedString.append(String.valueOf((char)('a' + i)));
                compressedString.append(String.valueOf(wordAnagram[i]));
            }
        }
        return compressedString.toString();
    }

    public static String isStringCompressed(String word, String compressedString){
        
        if(word.length() <= compressedString.length()){
            return word;
        }
        return compressedString;
    }
}