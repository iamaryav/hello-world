import java.util.*;


public class Dynamic{

    // Top down recursively

    public static int fib(int n){
        if(n <= 1){
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static HashMap<Integer, Integer> memo = new HashMap<>();
    public static int fibMemo(int n){
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        if(n <= 1){
            return n;
        }
        int result = fib(n-1) + fib(n-2);
        memo.put(n, result); 
        return result;
    }

    // bottom up means iteratively for start

    public static int fibBottomUp(int n){
        int[] fibList = new int[n + 1];
        fibList[0] = 0;
        fibList[1] = 1;

        for(int index = 2; index <= n; index++){
            fibList[index] = fibList[index - 1] + fibList[index - 2];
        }
        return fibList[n];
    }


    public static void main(String[] args){

        System.out.println(fib(10));
        System.out.println(fibMemo(10));
        System.out.println(fibBottomUp(10));

    }
}