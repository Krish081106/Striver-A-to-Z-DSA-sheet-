import java.util.*; // Rotate the array by D places according to left and right

public class rotateByD {
//this is the brute force solution 
    public static void left_Rotate_By_D(int nums[], int k) {

        k = k % nums.length; //This will bound the value of the k in the length of array
        /*
         * Store the first k elements in the temp array and copy the rest n - k elements
         * from the array nums
         */
        int temp[] = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = nums[i]; // Copying first two elements in the temp array
        }
        // Shifting
        for (int i = k; i < nums.length; i++) {
            nums[i - k] = nums[i];
        }
        // Putting rest of the elements
        for (int i = 0; i < k; i++) {
            nums[nums.length - k + i] = temp[i];
        }

        printArray(nums);
    }

    public static void right_Rotate_By_D(int nums[], int k) {

        // store the last k elements in the temp array
        int[] temp = Arrays.copyOfRange(nums, nums.length - k, nums.length);

        //Shifing rest elements to the right by k places
        for(int i = nums.length - k - 1; i>=0; i--) {
            nums[i+k] = nums[i];
        }

        //Copying elements from temp
        for(int i = 0; i<k; i++) {
            nums[i] = temp[i];
        }

        printArray(nums);
    }

    public static void optimal_Rotation_By_D_Right(int nums[], int k) { //For the right rotation
        k = k % nums.length; 

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

        printArray(nums);
    }

    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void reverse(int nums[], int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 2;
        String direction = "right";

        // if (direction.equals("right")) {
        //     right_Rotate_By_D(nums, k);// Right rotate
        // } else {
        //     left_Rotate_By_D(nums, k); // Left Rotate
        // }

        optimal_Rotation_By_D_Right(nums, k);
    }
}