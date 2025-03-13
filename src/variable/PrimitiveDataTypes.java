package variable;

public class primitiv_data_types {
    public static void main(String[] args) {

        /** 1․Ստեղծել 2 փոփոխական(byte a և byte b ),  վերագրել
         * կամայական արժեքներ և տպել  console
         */
        byte a = 1;
        byte b = 2;
        System.out.println(a);
        System.out.println(b);
        /** 2.Ստեղծել 2 փոփոխական(short c և short d ),
        *  վերագրել կամայական արժեքներ և տպել console -ում
        */
        short c = 100;
        short d = 200;
        System.out.println(c);
        System.out.println(d);
        /** 3.Ստեղծել 2 փոփոխական(int e և int f ),  վերագրել
        * կամայական արժեքներ և տպել console -ում
        */
        int e = 1000;
        int f = 2000;
        System.out.println(e);
        System.out.println(f);
        /** 4.Ստեղծել 2 փոփոխական(long g և long h ),
        * վերագրել կամայական արժեքներ և տպել console -ում
        */
        long g = 10000;
        long h = 20000;
        System.out.println(g);
        System.out.println(h);
        /**5. Տպել  byte, short, int և long
         * Max & Min  արժեքները
         */
        System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE + " " + Long.MAX_VALUE);

        /** 6. Ստեղծել 2  փոփոխական (byte և int ) , վերագրել կամայական արժեքներ
        *2-ական տեսքով  և տպել   console -ում
        */
         byte binByte = 0b1101;
        int binInt = 0b101010;
        System.out.println(binByte);
        System.out.println(binInt);

        /** 7.Ստեղծել 2 փոփոխական(float j և float k ),
        *վերագրել կամայական արժեքներ և տպել console -ում
        */
        float j = 3.14f;
        float k = 2.71f;
        System.out.println(j);
        System.out.println(k);

        /** 8.Ստեղծել 2 փոփոխական(double l և double m ),
        *վերագրել կամայական արժեքներ և տպել console -ում․
        */
         double l = 3.1415926535;
        double m = 2.7182818284;
        System.out.println(l);
        System.out.println(m);

        // 9.Տպել float և double  Max & Min  արժեքները
        System.out.println(Float.MIN_VALUE + " " + Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE + " " + Double.MAX_VALUE);

        /** 10. ․ Ստեղծել 2 փոփոխական(char n և char o ),
        *  վերագրել կամայական արժեքներ և տպել   console -ում
        */
         char n = 'A';
        char o = 'B';
        System.out.println(n);
        System.out.println(o);

        // 11.Տպել char s = 77;  և char w = 109;  արժեքները
        char s = 77;
        char w = 109;
        System.out.println(s);
        System.out.println(w);

        /** 12.Ստեղծել 2 փոփոխական(boolean p և boolean q ),
         *վերագրել կամայական արժեքներ և տպել console -ում․
         */
        boolean p = true;
        boolean q = false;
        System.out.println(p);
        System.out.println(q);

        // 13. Type casting (widening)
        int aa = 7;
        long bb = aa;
        System.out.println(bb);

        int myInt = 7;
        double myDouble = myInt;
        System.out.println(myDouble);

        // 14. Type casting
        double dd = 9.78;
        int ii = (int) dd;
        System.out.println(ii);

        int ff = 9999;
        byte gg = (byte) ff;
        System.out.println(gg);

        // 15. Fixing errors

    }
}
