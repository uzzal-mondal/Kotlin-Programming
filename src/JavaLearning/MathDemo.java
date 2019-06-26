package JavaLearning;

public class MathDemo {

    public static void main(String args[]){


      int x = 2, y = 3;


      int max = Math.max(x,y);
      int min = Math.min(x,y);
      System.out.println("Maximum value = "+max);
      System.out.println("Minium  value = "+min);

      // absulate value.
        int abs = Math.abs(y);
        System.out.println("Absoulate value = "+abs);

        // power class
        double pow = Math.pow(x, y);
        System.out.println("Power  = "+pow);

        //round class
        float ro = Math.round(5.5f);
        System.out.println("Round class = "+ro);

        // pi class
        double pi = Math.PI;
        System.out.println("pi valu of :-"+pi);

    }
}
