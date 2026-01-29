class A {
    public static void main(String[] args){

        B obj = new B();

        obj.Arraydemo();

    }
}

class B {
    void Arraydemo(){

        int[] ages = new int[5];

        float [] weight = new  float [55];


        ages [1] = 22;
        ages [2] = 33;
        ages [4] = 44;
        ages [0] = 11;

        weight[2] = 44;
        weight[4] = 88;

        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);

        System.out.println(weight[2]);

        
    }
}