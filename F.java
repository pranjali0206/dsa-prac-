import java.util.*;

class E {

    // Occurrence function moved outside main method
    static int occur(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();

        int result = occur(arr, x);
        System.out.println("The number " + x + " occurred " + result + " times.");
    }
}
