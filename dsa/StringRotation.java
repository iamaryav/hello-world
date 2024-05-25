public class StringRotation{
    public static void main(String[] args){
        /*
        * Algo 1: 
        * shif the string and match if matches then rotation else not
        * 
        * time - O(n^2)
        * 
        * Algo 2: 
        * 
        * Anagram -> this won't work
        * 
        * Algo 3: 
        * 
        *  xy -> s1
        *  yx -> s2
        * 
        * xyxy = {yx}
        *
        * 
        */

       String s1 = "waterbottle";
       String s2 = "erbottlewat";

       System.out.println("Is Rotation: " + isRotation(s1, s2));
    }

    public static boolean isRotation(String s1, String s2){
        int len = s1.length();
        if(len == s2.length() && len > 0){
            StringBuilder s1s1 = new StringBuilder(s1);
            String s1a = s1s1.append(s1).toString();
            return s1a.contains(s2);
        }
        return false;
    }
}