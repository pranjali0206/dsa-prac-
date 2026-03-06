public class W{
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        int max = 8;

        int[] count = new int[max + 1];

        for (int num : arr)
            count[num]++;

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }

        for (int num : arr)
            System.out.print(num + " ");
    }
}