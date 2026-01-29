import java.util.Scanner;


class D {
    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);

        System.out.println("Enetr the size of array");

        int n = sc.nextInt();
        
        int [] arr = new int[n];

        System.out.println("Enter the elements of array");

        for(int i=0;i<arr.length;i++){

            arr[i] =sc.nextInt();




        }

        for (int i = 0; i< n ; i++){
            System.out.print(arr[i] + "");
        }




    }
}