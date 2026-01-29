import java.util.*;

class G {

    // Occurrence function moved outside main method
    static int Last_index(int arr[], int x) {
        int last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                last = i;
            }
        }
        return last;
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

        int result = Last_index(arr, x);
        System.out.println("The number " + x + " occurred last time on index no." + result + " times.");
    }
}
