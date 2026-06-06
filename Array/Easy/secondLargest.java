import java.util.*; //We have to return second largest and second smallest element from the array

public class secondLargest {

    public static void second_Largest(int nums[]) {
        /* int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;  IT IS BETTER SOLUTION

        //finding largest and smallest element
        for(int i = 0; i<nums.length; i++ ) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        int secondLargestElement = -1;
        int secondSmallestElement = Integer.MAX_VALUE;

        //Find the second largest element
        for(int i =0; i<nums.length; i++) {
            if(nums[i] > secondLargestElement && nums[i] < max){
                secondLargestElement = nums[i];
            }
        }

        //Finding the second smallest element
        for(int i = 0; i< nums.length; i++) {
            if(nums[i] < secondSmallestElement && nums[i] > min) {
                secondSmallestElement = nums[i];
            }
        }
        System.out.println("Second largest element is : " + secondLargestElement);
        System.out.println("Second Smallest element is : " + secondSmallestElement); */


        // OPTIMAL SOLUTION
        int largest = nums[0];
        int second_largest = Integer.MIN_VALUE;

        //Second largest
        for(int i = 1; i< nums.length; i++) {
            if(nums[i] > largest) {
                second_largest = largest;
                largest = nums[i];
            }
            else if(nums[i] < largest && nums[i] > second_largest){
                second_largest = nums[i]; 
            }
        }

        //Second Smallest
        int smallest = nums[0];
        int second_smallest = Integer.MAX_VALUE;

        for(int i = 1; i< nums.length; i++) {
            if(nums[i] < smallest) {
                second_smallest = smallest;
                smallest = nums[i];
            }
            else if(nums[i] > smallest && nums[i] < second_smallest) {
                second_smallest = nums[i];
            }
        }


        System.out.println("Second largest element is : " + second_largest);
        System.out.println("Second smallest element is : " + second_smallest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = { 1, 2, 4, 7, 7, 5 };

        second_Largest(nums);
    }
}