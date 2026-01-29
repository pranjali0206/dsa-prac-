class M {

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swap function: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        int[] arr = {1, 2, 3, 4, 5};
        swap(a, b);
        System.out.println("After swap function: a = " + a + ", b = " + b);
    }
}

