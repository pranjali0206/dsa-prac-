import java.util.Scanner;

class I {

    // Method to count pairs that sum up to target
    static int Target(int[] arr, int target) {
        int ans = 0;
        int n = arr.length;

        // Loop to find pairs
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array length
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();

        // Initialize array
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target value
        System.out.println("Enter the target:");
        int target = sc.nextInt();

        // Call method and print result
        int result = Target(arr, target);
        System.out.println("Number of pairs with sum " + target + " is: " + result);
    }
}
