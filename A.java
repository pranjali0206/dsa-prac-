import java.util.*;
public class A {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("give target");
        int target = sc.nextInt();

        int[] arr = new int[]{2,3,6,8, 12,20};

        int [] result = targetSum(arr, target);

       System.out.println("Indices: " + Arrays.toString(result));
    }

    public static int[] targetSum(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;

        while(left<right){
            
            int currentsum =  arr[left] + arr[right] ;
            if (currentsum == target){
                return new int[]{left,right};

            }
            else if (currentsum < target){
                left++;
            }
            else {
                right --;
            }
        }
        return new int[] {-1, -1};

    }
}
