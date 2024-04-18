/**
 * Question:
 * three types of action: insert, remove and replace a character
 * 
 * Example:
 * ple, pale -> true
 * bale, pale -> true
 * pale, ple -> true
 * pale, bake -> false
 * sleam, meals -> false
 * 
 * brute force / quick solution:
 * if same string return true
 * if mod(len(word1) - len(word2)) >= 2 return false
 * countDistance = 0
 * bigWord 
 * if len(word1) > len(word2):
 *  bigWord = word1
 *  smallWord = word2
 * else:
 *  bigWord = word2
 *  smallWord = word1
 * 
 * bigIndex 
 * j = 0
 * for i in range(len(bigWord)):
 *  if bigWord[i] == smallWord[j]:
 *      j += 1;
 *      continue:
 *  else:
 *      countDistance += 1;
 *      i += 1;
 *  if countDistance >= 2:
 *      return false:
 *
 * return true;
 * 
 * Time complexity:
 *  
 *      
 *  
 * 
 * 
 * 
 * word1[26] = 0
 * word2[26] = 0
 * for char in word1:
 *  index = ord(char)     
 *  word1[index] += 1
 * 
 * for char in word2:
 *  index = ord(char)
 *  word2[index] += 1
 * 
 * for i in range(26):
 *  if word1i and word2i not same:
 *      countDistance += 1
 * 
 * if countDistance < 2:
 *  return true
 * 
 * return false:
 * 
 * time complexity:
 * O(Len(word1) + Len(word2))
 * 
 * Space complexity:
 * O(1) 
 * 
 * pale, ple -> true
 */


public class OneAway{

    public static boolean oneEditAway(String s1, String s2){
        if(s1.equals(s2)){
            return true;
        }
        if(Math.abs(s1.length() - s2.length()) > 1){
            return false;
        }

        String bigWord = s1.length() > s2.length() ? s1 : s2;
        String smallWord = s1.length() > s2.length() ? s2 : s1;

        System.out.println("Big Word: "+ bigWord);
        System.out.println("Small Word: "+ smallWord);

       int index1 = 0;
       int index2 = 0;
       boolean foundDifference = false;

       while(index1 < bigWord.length() && index2 < smallWord.length()){
            if(bigWord.charAt(index1) != smallWord.charAt(index2)){
                if(foundDifference){
                    return false;
                }
                foundDifference = true;
                if(bigWord.length() == smallWord.length()){
                    index1 += 1;
                    index2 += 1;
                }else{
                    index1 += 1;
                }
            }else{
                index1 += 1;
                index2 += 1;
            }
       }
       return true;
    }

    public static void main(String[] args){
        System.out.println(OneAway.oneEditAway("pale", "ple"));
        System.out.println(OneAway.oneEditAway("pale", "bale"));
        System.out.println(OneAway.oneEditAway("pale", "bake"));
        System.out.println(OneAway.oneEditAway("pales", "pale"));
    }
}