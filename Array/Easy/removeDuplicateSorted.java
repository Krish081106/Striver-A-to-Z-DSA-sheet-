import java.util.*;

public class removeDuplicateSorted {

    public static int removeDuplicate_Sorted(int nums[]) {
        int write = 0;
        int read = 1;

        while(read < nums.length) {
           if(nums[write] != nums[read]) { //Both are different
            write++;
            nums[write] = nums[read];
           }
           read++;
        }
        return write + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = {1,1,1,2,2,3,3,3,3,4,4};

       System.out.println(removeDuplicate_Sorted(nums));
    }
}