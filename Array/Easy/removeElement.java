import java.util.*; //Leetcode - 27 "Remove Element"

public class removeElement {

    public static int remove_Element(int nums[], int val) {
        int n = nums.length;

        int idx = 0;
        int i = 0;

        while(i < nums.length) {
            if(nums[i] != val) {
                nums[idx] = nums[i];
                idx++;
            }
            i++;
        }

        return idx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int nums[] = {0,1,2,2,3,0,4,2};
        int nums[] = {3,2,2,3};
        int val = 3;
        // int val = 2;

       System.out.println(remove_Element(nums, val));
    }
}