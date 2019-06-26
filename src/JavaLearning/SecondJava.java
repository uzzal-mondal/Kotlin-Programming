package JavaLearning;


//        Data type  and variable..

public class SecondJava {

    public static void main(String args[]) {
        int num = 10;
        float point = (float) 10.25;
        double result = 100.20;
        boolean go = true;

        // variable declear, variable intilize korbo.
        char c;
        char ca = 'a'; //dynamic initlize.
        int i;
        double d;
        float f;
        short s;
        byte b=127;
        boolean b1;
        long l;


        /*byte variable:  8 bit,  min -128, max 127, default 0;  */

        byte by = 127;
        byte byt = -128;
        System.out.println("Byte = "+by);
        System.out.println("Byte = "+byt);

        /*short variable 16 bit,# max 32,768 # min -32767 */
        short sh = 32767;
        short sho = -32768;
        System.out.println("short "+sh);
        System.out.println("short "+sho);

        /*Int variable 32 bit - #max 2147483647  #min -2147483648*/
          int i1 = 2147483647;
          int i2 = -2147483648;
          System.out.println("Int : "+i1);
          System.out.println("Int : "+i2);

          /* long 64 bit #max9,223,372,036,854,775,807   min -9,223,372,036,854,775,808(-2^63)

           */

          /**/
         long lo = 1000L;
         long lon = 2000L;
         System.out.println("Long varibale "+lo);
         System.out.println("Long varibale "+lon);

         /*float 32 bit.  754 floating point
         * float f1 = 10.25f*/
         float folat  =  10.25f;
         System.out.println("Float : "+folat);

         /*double 64bit, 754 floating point*/

         double db = 120.45;
         System.out.println("Double value is a "+db);


         /*boolean return to true and false.*/
        boolean one = false;
        System.out.println("Boolean value is  a : "+one);


        /*character is a 16 bit */

        char ch = 'a';
        System.out.println("Character : "+ch);
    }
}
