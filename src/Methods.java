public class Methods {

    // 1.Write a method which has two input parameters:: type  int and return 0.
    public static int methodWithTwoInts(int a, int b) {
        return 0;
    }

    // 2.Write a method which has  no input parameters   and returns nothing.
    public static void methodWithoutParams() {
        // Ничего не делает
    }

    // 3.Write a method which has boolean input parameters  and print “Hello World
    public static void methodWithBoolean(boolean flag) {
        System.out.println("Hello World");
    }

    // 4.Write a method which has a char input parameter  and return this  input parameter.
    public static char methodWithChar(char c) {
        return c;
    }

    // 5.Write a method which has  two float input parameters  and return  one of them
    public static float methodWithFloats(float x, float y) {
        return x; // Можно вернуть y, в зависимости от условий
    }


}
