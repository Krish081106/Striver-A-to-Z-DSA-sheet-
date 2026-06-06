import java.util.*;

public class moveZeroes {

    public static void move_Zeroes_End(int nums[]) {
        int read = 0;
        int write = 0;

        while(read < nums.length) {
            if(nums[read] != 0) {
                int temp = nums[read];
                nums[read] = nums[write];
                nums[write] = temp;

                write++;
            }
            read++;
        }

        printArray(nums);
    }

    public static void printArray(int nums[]) {
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = {0,1,0,3,12};
       
        move_Zeroes_End(nums);
    }
}