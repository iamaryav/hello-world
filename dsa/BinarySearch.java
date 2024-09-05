import java.util.*;

class A {

    static boolean exists(int[] ints, int k) {

        int lb = 0;
        int ub = ints.length - 1;

        while(lb < ub){
            int mid = (lb + ub) / 2;
            if(ints[mid] == k){
                return mid;
            }else if (k < ints[mid]){
                ub = mid -1;
            }else{
                lb = mid + 1;
            }
        }
        return -1;
	}
}