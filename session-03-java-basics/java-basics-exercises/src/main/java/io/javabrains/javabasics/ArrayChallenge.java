package io.javabrains.javabasics;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        Integer[] nums = {1,2,3,4,5,6,7};


        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        Integer sum = 0, largest = Integer.MIN_VALUE;
        
        for(Integer num : nums){
            sum+=num;
            if(largest < num) {
                largest = num;
            }
        }
        
        Double average = sum/Double.valueOf(nums.length);
        System.out.println("Sum of elements are " + sum);
        System.out.println("Average of elements are " + average);
        System.out.println("Largest element is " + largest);
    }
}
