import java.util.*;

public class ErrorCode{
    public static void main(String[] args){
        int[] errorCode = {9, 8, 2, 5};
        int p = 3, q = 1;
        System.out.println(minProjects(errorCode, p, q));
    }


    public static int minProjects(int[] errors, int P, int Q){
        // int ans = 0;
        // int n = errorcode.length;
        // int maxError = 0;
        // int totalError = 0;
        // int globalReduction = 0;

        // for(int error : errorcode){
        //     maxError = Math.max(error, maxError);
        //     totalError += error;
        // }


        // while(maxError > 0){
        //     ans += 1;
        //     int reduction = p - q;
        //     maxError -= reduction;
        //     globalReduction += q;

        //     if (totalError <= n * globalReduction){
        //         return ans;
        //     }
        // }

        // int remainError = totalError - n * globalReduction;
        // ans += (remainError + q - 1) / q;
        // return ans;

        // This is not working
        int N = errors.length;
        int maxError = 0;
        long totalError = 0;
        
        // Find the maximum error and calculate total error
        for (int error : errors) {
            maxError = Math.max(maxError, error);
            totalError += error;
        }
        
        int projects = 0;
        int globalReduction = 0;
        
        while (maxError > 0) {
            projects++;
            int reduction = P - Q;
            maxError -= reduction;
            globalReduction += Q;
            
            // If total error becomes 0 or negative, we're done
            if (totalError <= (long)N * globalReduction) {
                return projects;
            }
        }
        
        // If we exit the loop, it means we need additional projects to cover the remaining error
        long remainingError = totalError - (long)N * globalReduction;
        projects += (remainingError + Q - 1) / Q;  // Ceiling division
        
        return projects;
    }

    // This is working

    // public static int minprojectsHeap(int[] errorcode, int p, int q){
    //     int ans = 0;
    //     int n = errorcode.length;
    //     // arrays.sort(errorcode);
    //     // arrays.sort(errorcode, collections.reverseorder());
    //     queue<integer> maxheap = new priorityqueue<>(collections.reverseorder());

    //     for(int val : errorcode){
    //         maxheap.offer(val);
    //     }

    //     while(!maxheap.isempty() && maxheap.peek() > 0){
    //         int highesterror = maxheap.poll();
    //         ans += 1;

    //         int reducederror = Math.max(0, highesterror - (p - q));
    //         if (reducederror > 0){
    //             maxheap.offer(reducederror);
    //         }

    //         list<integer> templist = new arraylist<>();
    //         while(!maxheap.isempty()){
    //             int error = maxheap.poll();
    //             int newerror = math.max(0, error - q);
    //             if (newerror > 0){
    //                 templist.add(newerror);
    //             }
    //         }
    //         maxheap.addall(templist);
    //     }
    //     return ans;
    // }
}