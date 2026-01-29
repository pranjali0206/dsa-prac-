import java.util.Scanner;

public class K {
    static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;  // should be MIN_VALUE
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static int findSecondMax(int[] arr) {
        int mx = findMax(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE; // mark max elements
            }
        }
        int secondMax = findMax(arr); // now find max again
        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE SIZE OF ARRAY:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements in array of size " + n + ":");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int secondMax = findSecondMax(arr);
        System.out.println("The second maximum number in the array is: " + secondMax);
        
        sc.close();
    }
}
