public class StatementsUtil {

    /**
     * 1․Գրել method, որը ստուգում է տրված x ամբողջ  թիվը զույգ է թե կենտ.
     *
     * @param x
     * @return
     */
    public static boolean check1(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * 2.Գրել method, որը ստուգում է տրված  x ամբողջ  թիվը դրական է թե բացասական.
     *
     * @param x
     * @return
     */
    public static boolean check2(int x) {
        if (x > 0) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * 3․Գրել method, որը ստուգում է տրված x ամբողջ  թիվը  ՝ կամ փոքր 8 ից  և մեծ 5 ից
     * Կամ փոքր  20 ից և մեծ 15 ից ․
     *
     * @param x
     * @return
     */
    public static boolean check3(int x) {
        if ((x < 8) && (x > 5) || (x < 20) && (x > 15)) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * 4.Գրել method, որը ստուգում է տրվածղ ամբողջ թիվը
     * կարող է բաժանվել 5-ի և 7-ի վրա առանց մնացորդի.
     *
     * @param x
     * @return
     */
    public static boolean check4(int x) {
        if ((x % 5 == 0) && (x % 7 == 0)) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * 5․Գրել method, որը ստուգում է տրված եռանիշ թվի
     * երկրորդ թվանշանը 7 է թե ոչ։
     */
    public static boolean check5(int x) {

    }


    /**
     * 6․Գրել method, որը ստուգում է (x,y) կորդինատներով
     * կետը գտնվում է արդյոք K(0,5) շրջանի մեջ թե ոչ։
     *
     * @param x
     * @return
     */
    public static boolean check6(int x) {

    }


    /**
     * 7.Գրել method, որը գտնում է տրված 3 թվերից մեծագույնը։
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int findTheBiggest(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }


    /**
     * 8․Գրե՛ք method, որը ստուգում է տրված տարին համարվում
     * է արդյոք նահանջ։ (նահանջ է համարվում այն տարին որը
     * բաժանվում է 4, բայց բացառություն է արվում այն տարիների
     * համար, որոնք 100-ի բաժանվող են։ Այդ տարիները նահանջ են
     * միայն, եթե նաև բաժանվում են 400-ի։)
     *
     * @param x
     * @return
     */
    public static boolean check8(int x) {
        if ((x % 4 == 0 && x % 100 != 0) && (x % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 9.Գրել method, որը console -ում  տպում է  1 ից  200 թվերը․
     */
    public static void printNumbers() {
        for (int i = 1; i <= 200; i++) {
            System.out.println(i);
        }
    }


    /**
     * 10.Տրված են int x = 1, int y = 0.  Քանի դեռ x < 5 ից
     * և  y < 10  տպել  x+y արտահայտությունը
     */
    public static void printSumXY() {
        int x = 1, y = 0;
        while (x < 5 && y < 10) {
            System.out.println(x + y);


        }
    }


    /**
     * 11.Գրել method, որը console -ում տպում է քառակուսի,
     *    օգտագործեք * սիմվոլը.
     * @param n
     */
    public static void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*".repeat(n));
        }
    }


    /**
     *  12.Գրել method, որը console -ից ստանում է  N թիվը
     *     և հաշվում է [1-N] բոլոր 5 -ի բաժանվող թվերի գումարը
     * @param n
     * @return
     */

    public static int sumDivisibleBy5(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }


    /**
     * 13.Գրել method, որը հաշվում է [1-N]  բոլոր  երկնիշ զույգ թվերի արտադրյալը։
     * @param n
     * @return
     */
    public static int productOfEvenTwoDigit(int n) {
        int product = 1;
        for (int i = 10; i <= Math.min(n, 99); i += 2) {
            product *= i;
        }
        return product;
    }


    /**
     * 14․Գրել method, որը [1-N] հաջորդական  թվերի մ
     *    եջ գտնում է  մեծագույն և փոքրագույն տարրերը և
     *    հաշվում նրանց թվաբանական միջինը։
     * @param n
     * @return
     */
    public static double[] minMaxAverage(int n) {
        int min = 1;
        int max = n;
        double avg = (n + 1) / 2.0;
        return new double[]{min, max, avg};
    }

    
    /**
     * 15.Գրել method, որը  ստանում է 5 - անիշ ամբողջ թիվ
     *    և հաշվում  այդ թվի թվանշանների գումարը։
     * @param n
     * @return
     */
    public static int sumOfDigits(int n) {
        int sum = 0;
        n = Math.abs(n);
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}








