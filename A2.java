import java.util.Arrays;

class A2 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums); // Sort ascending
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(sol.findKthLargest(nums, k)); // Output: 5
    }
}