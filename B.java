class B {
    public static void main(String[] args) {

        A obj = new A();{

            obj.Multi_Array();

        
        }
        
    }
}


class A {
    void Multi_Array(){
        int[][] ages =  { {11,12} , {13,14} , {15,16} ,    };


        System.err.println(ages[0][1]);
        System.err.println(ages[0][0]);
        System.err.println(ages[1][0]);
        System.err.println(ages[1][1]);
        System.err.println(ages[2][0]);

    }
}