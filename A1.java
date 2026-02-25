import java.util.Arrays;

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        return Arrays.stream(nums)
                     .boxed()
                     .sorted((a, b) -> (a % 2) - (b % 2))
                     .mapToInt(Integer::intValue)
                     .toArray();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {3,1,2,4};
        int[] result = sol.sortArrayByParity(nums);
        System.out.println(Arrays.toString(result)); // Output: [2,4,3,1]
    }
}