import java.util.*;

class A3 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.get(merged.size()-1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.get(merged.size()-1)[1] = 
                    Math.max(merged.get(merged.size()-1)[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = sol.merge(intervals);
        for (int[] arr : result)
            System.out.println(Arrays.toString(arr)); // Output: [1,6],[8,10],[15,18]
    }
}