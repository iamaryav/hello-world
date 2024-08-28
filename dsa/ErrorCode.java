import java.util.*;

public class ErrorCode{
    public static void main(String[] args){
        int[] errorCode = {9, 8, 2, 5};
        int p = 3, q = 1;
        System.out.println(minProjects(errorCode, p, q));
    }

    public static int minProjects(int[] errorCode, int p, int q){
        int ans = 0;
        int N = errorCode.length;
        // Arrays.sort(errorCode);
        // Arrays.sort(errorCode, Collections.reverseOrder());
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int val : errorCode){
            maxHeap.add(val);
        }
        System.out.println("peek: " + maxHeap.peek());

        while (maxHeap.peek() > 0){
            maxHeap.add(maxHeap.poll() - p);
            ans += 1;
        }
        return ans;
    }
}