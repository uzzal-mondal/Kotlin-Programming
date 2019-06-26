package JavaLearning;

public class PrimeTest {

    public static void main(String ars[]){



        int c = 2, n=3, t ;

         while (c>n/2){

             if (n>3){

                  t = n%c;

                  if (t==0){

                      System.out.println("Not prime num");
                  }
                  else{

                      System.out.println("Prime num ");
                  }


             }

             c++;

         }




    }
}
