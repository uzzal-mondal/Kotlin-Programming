package JavaLearning;

import java.util.Scanner;

public class PossitiveNegative {

    public static void main (String args[]){

        Scanner sc  = new Scanner(System.in);
        System.out.println("enter input");




       int i = 1;
       int p =0, n =0;


       while (i<5){

           int x = sc.nextInt();

           if (x>0){

               p++;
           }else{

               n++;
           }

           i++;
       }

       System.out.println("possitive    " +p);
       System.out.println("Negative     " +n);


    }
}
