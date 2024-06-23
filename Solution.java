public class Solution{
    private static Solution solution = null;

    private Solution(){}


    public static Solution getInstance(){
        if(solution == null){
            solution = new Solution();
        }
        return solution;
    }
}