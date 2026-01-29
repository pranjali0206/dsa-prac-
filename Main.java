class A {

    void demoArray(){

        int[]ages = new int[3];
        float[] weights = new float[5];

        ages[1] = 10;
        ages[2] = 22;
        ages[0] = 55;

        System.out.println(ages[0]);

        System.out.println(ages[1]);


        System.out.println(ages[2]);



    }


    

}

public class Main{
    public static void main(String[] args) {
        A obj = new A();

        obj.demoArray();

    }
}