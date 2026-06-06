import java.util.*;

public class checkSorted {

    public static boolean isSorted(int nums[]) {

        int n = nums.length;

        if(n == 1 || n == 0) { //Ensure if the array size is zero or one then it is by default sortee in it
            return true;
        }
        for(int i = 0; i<nums.length-1; i++) {
            if(nums[i] > nums[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = {1,2,8,4,5};

        System.out.println(isSorted(nums));
    }
}