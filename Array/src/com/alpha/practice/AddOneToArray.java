package com.alpha.practice;

public class AddOneToArray {
    public static int[] addOne(int[] digits) {
        int n = digits.length;
        
        // Traverse the array from the end to the beginning
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, increment it by 1 and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            // If the current digit is 9, set it to 0
            digits[i] = 0;
        }
        
        // If all digits are 9, we need to add 1 at the beginning of the array
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        
        return newNumber;
    }

    public static void main(String[] args) {
        // Test cases
        int[] result1 = addOne(new int[]{1, 1, 2});
        int[] result2 = addOne(new int[]{1, 2, 9});
        int[] result3 = addOne(new int[]{9, 9, 9});
        
        // Print results
        printArray(result1); // Output: [1, 1, 3]
        printArray(result2); // Output: [1, 3, 0]
        printArray(result3); // Output: [1, 0, 0, 0]
    }
    
    // Helper method to print array
    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

