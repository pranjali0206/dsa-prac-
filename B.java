import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // ✅ FIX 1: Declare array FIRST
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        
        System.out.println("Original array: " + Arrays.toString(nums));
        
        // ✅ FIX 2: Call method correctly (no 'int[]' in parameter)
        int uniqueCount = removeDuplicates(nums);
        
        // ✅ FIX 3: Print the modified array and count
        System.out.println("Modified array: " + Arrays.toString(nums));
        System.out.println("Number of unique elements: " + uniqueCount);
        
        // ✅ FIX 4: Show only the unique part
        System.out.print("Unique elements: [");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(nums[i]);
            if (i < uniqueCount - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    // ✅ FIX 5: Add 'static' to call from main method
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int uniquePointer = 0; // Tracks position for next unique element
        
        for (int current = 1; current < nums.length; current++) {
            if (nums[current] != nums[uniquePointer]) {
                uniquePointer++;
                nums[uniquePointer] = nums[current];
            }
        }
        return uniquePointer + 1; // Length of unique elements
    }
}