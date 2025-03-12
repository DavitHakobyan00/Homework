package java.operators;

public class operators {
    public static void main(String[] args) {


                             //Arithmetic Operators//

        // 1.Ստեղծել 2 փոփոխական(int a = 8, int b = 6), տպել console -ում  հետևյալը․
        int a = 8;
        int b = 6;
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a - b);
        System.out.println(a % b);
        // 2․Ստեղծել 2 փոփոխական(double c = 6.4, double d = 0.03), տպել  console -ում հետևյալը.
        double c = 6.4;
        double d = 0.03;
        System.out.println(c + d);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(c - d);
        System.out.println(c % d);
        // 3․Տպել  console -ում  հետևյալ արտահայտությունների պատասխանները
        int x = 2 * ((5 + 3) * (4 - 8));
        int y = 2 * 5 + 3 * 4 - 8;


                             //Unary Operators//

        /** 4․Ստեղծել 2 փոփոխական(int e = 10,  int f = -88, boolean n1 = true),
         *  տպել console -ում  հետևյալը․*/
        int e = 10;
        int f = -88;
        boolean n1 = true;
        System.out.println(-e);            //-10
        System.out.println(-f);            //88
        System.out.println(+e);            //10
        System.out.println(-e + 92);       //82
        System.out.println(!n1);           //false
        System.out.println(!(!n1));        //true
        System.out.println(e++);           //10
        System.out.println(--f);           //-89


                             //Assignment Operator//

        /** 5․Տպել  console -ում  հետևյալ արտահայտությունների պատասխանները
         1)	int x = (int)1.0;
         2)	short y = (short)1921222;
         3)	System.out.print(2147483647+1);
         4)	long y = (x=3);
         5)   boolean a = false;
         boolean b = (y = true);
         System.out.println(x
         ???????????????????????????????????????
         */


                             //Relational Operators//

        // 6․Ստեղծել 2 փոփոխական(int x = 10, int y = 20), տպել console -ում  հետևյալը․
        int o = 10;
        int p = 20;

        System.out.println(o < p);     //true
        System.out.println(o <= p);    //true
        System.out.println(o >= p);    //false
        System.out.println(o > p);     //false


                           //Additional  tasks//

        // 7.Գտնե և ուղղել սխալը.

        // 1)
        float w = 2.1f;

        // 2)
        byte u = 5;
        byte r = 10;
        byte k = (byte) (x + y);    /** arefmetic gorcoxutyunneri jamanak minchev int e
                                      * ev ayn neraryal, dranic hetevum e vor byte@ ev
                                      * short@ chen karox ogtagorcven avtomat dzevov, petq e
                                      * havasaric heto grel (byte) kam (short) vor ashxati.
                                      */

        // 3)
        short v = 10;
        short q = 3;
        short m = (short) (v * q);

        // 4)
        long t = 10;
        int z = 5;
        z = (int) (z * t);




        /**8․Հայտարարել երկու int տիպի փոփոխականներ,վերագրել 10 և 5 այնուհետև
          փոփոխականի արժեքները տեղերով փոխել։
         */
        int g = 10;
        int h = 5;

        /**9․Փորձեք 8-րդ խնդիրը լուծել առանց երրորդ փոփոխական օգտագործելու։
         *   10․ Գրել ծրագիր, որը հաշվում է  1-100 թվերի գումարը։ (ցիկլ չoգտագործել)
         */


                             //Bitwise & Logical Operators//

        // 1.Ստեղծել 2 փոփոխական(int a = 8, int b = 3), տպել console -ում  հետևյալը․

        int j = 8;               //8=(binary)1000
        int s = 3;               //3=(binary)0011

        System.out.println(j & s);
        System.out.println(j ^ s);
        System.out.println(j | s);
        System.out.println(~j);
        System.out.println(true || (j < 4));
        System.out.println((s >= 6) || (++j <= 7));
        System.out.println((j<s)?j:s);
        System.out.println(s^s);

        /** j & s =  1000  =  0000           ete erku tex@ ka 1 apa 1 ete che apa 0
        *            0011
        *
        *  j ^ s =  1000  =  1011           ete erku texum iraric tarbervox en apa 1 ete che 0
        *           0011
        *
        *  j | s =  1000  =  1011           ete erkusic mekum 1 e apa 1 ete che 0
        *           0011
        *
        *     ~j =  1000  =  0111           invertacia e katarvum
        *
        *  true || (j < 4)  =
        *
        *
        *  (s >= 6) || (++j <= 7)  =
        *
        *
        *  (j<bs)?j:s  =
        *
        *
        *  s^s  =  0011  =  0000            ete erku texum iraric tarbervox en apa 1 ete che 0
        *          0011
        */


                                  //Shift Operator//

        // 1․Տպել console -ում  հետևյալը․

        /**
        *    10=1010
        *   -10=
        *    20=10100
        *    15=1111
        */

         System.out.println(10<<2);     // 1) 10 << 2 = 101000
         System.out.println(-10<<3);    // 2)-10 << 3 =
         System.out.println(20>>2);     // 3) 20 >> 2 = 101
         System.out.println(15>>3);     // 4) 15 >> 3 = 1

        //2․ Տրված փոփոխականը բազմապատկեք 8-ով և 16-ով առանց օգտագործելու *-նշանը։

    }

}