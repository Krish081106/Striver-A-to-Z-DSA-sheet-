import java.util.*;

public class largest {

    public static int largestNumber(int nums[]) {
        int max = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = {8,10,5,7,9};

        System.out.print("The largest Number is : " + largestNumber(nums));
    }
}