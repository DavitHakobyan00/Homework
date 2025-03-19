package methods;

public class Methods {

    /**
     *   1.Write a method which has two input parameters:: type  int and return 0.
     */
    public static float withTwoInts(int a, int b) {
        return 5.5f;
    }

    /**
     * 2.Write a method which has  no input parameters   and returns nothing.
     * @param a
     * @param b
     */
    public static void withoutParams(int a, int b ) {
        // Ничего не делает
    return;
    }


    /**
     * 3.Write a method which has boolean input parameters  and print “Hello World"
     * @param flag
     */
    public static void withBoolean(boolean flag) {
        System.out.println("Hello World");
    }

    /**
     * 4.Write a method which has a char input parameter  and return this  input parameter.
     * @param c
     * @return
     */
    public static char withChar(char c) {
        return c;
    }

    /**
     * 5.Write a method which has  two float input parameters  and return  one of them
     * @param x
     * @param y
     * @return
     */
    public static float withFloats(float x, float y) {
        return x; // Можно вернуть y, в зависимости от условий
    }
}
