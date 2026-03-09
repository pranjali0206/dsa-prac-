<<<<<<< HEAD
import java.util.Scanner;
class A {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        int pow = 1;

        for(int i =1; i <=b; i++){

            pow *=a;
        }



        System.out.println(pow);




=======
class A {
    public static void main(String[] args){

        for( int line=1; line<=4; line++){
            for(int star=1; star<= line; star++) {

                System.out.print("*");
                
            }

            System.out.println();

               
        }
>>>>>>> 22cee95e3816676ead0ae4be85557f9bde1b78cb
    }
}