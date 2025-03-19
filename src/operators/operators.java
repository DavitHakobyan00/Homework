package operators;
public class operators {


    //Arithmetic Operators//

    /**
     * 1.Ստեղծել 2 փոփոխական(int a = 8, int b = 6), տպել console -ում  հետևյալը․
     *
     * @param a
     * @param b
     */
    public static void operations1(int a, int b) {
        System.out.println(a * b);
        System.out.println(a + b);
        System.out.println(a / b);
        System.out.println(a - b);
        System.out.println(a % b);
    }

    /**
     * 2․Ստեղծել 2 փոփոխական(double c = 6.4, double d = 0.03), տպել  console -ում հետևյալը.
     *
     * @param c
     * @param d
     */
    public static void operations2(double c, double d) {
        System.out.println(c + d);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(c - d);
        System.out.println(c % d);
    }

    public static void main(String[] args) {
        operations1(8, 6);
        operations2(6.4, 0.03);
        operations3();
        operations4(10, -88, true);
        operations6(10, 20);
        operations7(8, 3);
    }

    /**
     * 3․Տպել  console -ում  հետևյալ արտահայտությունների պատասխանները
     */
    public static void operations3() {
    }

    int x = 2 * ((5 + 3) * (4 - 8));
    int y = 2 * 5 + 3 * 4 - 8;


    //Unary Operators//

    /**
     * 4․Ստեղծել 2 փոփոխական(int e = 10,  int f = -88, boolean n1 = true),
     * տպել console -ում  հետևյալը․
     *
     * @param e
     * @param f
     * @param n1
     */
    public static void operations4(int e, int f, boolean n1) {
        System.out.println(-e);
        System.out.println(-f);
        System.out.println(+e);
        System.out.println(-e + 92);
        System.out.println(!n1);
        System.out.println(!(!n1));
        System.out.println(e++);
        System.out.println(--f);
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);

    }


    //Assignment Operator//
    /**
     * 5․Տպել  console -ում  հետևյալ արտահայտությունների պատասխանները
     */
    int x = (float) 1.0;
    short y = (short) 1921222;
    System.out.print(2147483647+1);
    long y = (x = 3);
    boolean a = false;
    boolean b = (y = true);
    System.out.println(x)


    //Relational Operators//

    /**
     * 6․Ստեղծել 2 փոփոխական(int x = 10, int y = 20), տպել console -ում  հետևյալը․
     *
     * @param x
     * @param y
     */
    public static void operations6(int x, int y) {
        System.out.println(x < y);
        System.out.println(x <= y);
        System.out.println(x >= y);
        System.out.println(x > y);
    }


    //Additional  tasks//

    /**
     * 7.Գտնե և ուղղել սխալը.
     *
     * @param x
     * @param y
     * @param z
     */
    // 1)
    float y = 2.1f;

    // 2)
    byte x = 5;
    byte y = 10;
    byte z = (byte) (x + y);

    // 3)
    short x = 10;
    short y = 3;
    short z = (short) (x * y);

    // 4)
    long x = 10;
    int y = 5;
    y =(int)(y *x);


    /**
     * 8․Հայտարարել երկու int տիպի փոփոխականներ,վերագրել 10 և 5 այնուհետև
     * փոփոխականի արժեքները տեղերով փոխել։
     */
    int g = 10;
    int h = 5;
    int k = 10;
    int g = h;
    int h = k;


    /**
     * 9․Փորձեք 8-րդ խնդիրը լուծել առանց երրորդ փոփոխական օգտագործելու։
     */

    /**
     * 10․ Գրել ծրագիր, որը հաշվում է  1-100 թվերի գումարը։ (ցիկլ չoգտագործել)
     */
    public class SumNumbers {
        public static void main(String[] args) {
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
            System.out.println("1-ից 100 թվերի գումարը: " + sum);
        }
    }

    //Bitwise & Logical Operators//

    /**
     * 1.Ստեղծել 2 փոփոխական(int a = 8, int b = 3), տպել console -ում  հետևյալը․
     *
     * @param a
     * @param b
     */
    public static void operations7(int a, int b) {
        System.out.println(a & b);
        System.out.println(a ^ b);
        System.out.println(a | b);
        System.out.println(~a);
        System.out.println(true || (a < 4));
        System.out.println((b >= 6) || (++a <= 7));
        System.out.println((a < b) ? a : b);
        System.out.println(b ^ b);
    }

    //Shift Operator//

    /**
     * 1․Տպել console -ում  հետևյալը․
     */
    public class ShiftOperators {
    public static void main(String[] args) {
        System.out.println(10 << 2);     // 1) 10 << 2 = 101000
        System.out.println(-10 << 3);    // 2)-10 << 3 =
        System.out.println(20 >> 2);     // 3) 20 >> 2 = 101
        System.out.println(15 >> 3);     // 4) 15 >> 3 = 1
    }
}

}