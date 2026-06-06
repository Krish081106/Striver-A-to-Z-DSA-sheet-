import java.util.*;

public class leftRotateByOne {

    public static void rotateByOne(int nums[]) {
        int res[] = new int[nums.length];

        int temp = nums[0];

        for(int i = 0; i < res.length-1; i++) {
            res[i] = nums[i+1];
        }
        res[res.length-1] = temp;

        printArray(res);
    }

    public static void printArray(int res[]) {
        for(int i = 0; i<res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = {1,2,3,4,5};

        rotateByOne(nums);
    }
}