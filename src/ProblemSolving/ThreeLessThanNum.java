package ProblemSolving;

import java.util.Scanner;

public class ThreeLessThanNum {

    public static void main(String args[]){

        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("input for a");
        a = sc.nextInt();
        System.out.println("input for b");
        b = sc.nextInt();
        System.out.println("input for c");
        c = sc.nextInt();

        if (a<b && a<c){

            System.out.println("a Less than num : "+a);
        }

       else if (b<a && b<c){

            System.out.println("b Less than num : "+b);
        }


       else if (c<a && c<b){

            System.out.println("c Less than num : "+c);
        }

        else{

            System.out.println("wrong answer");
        }


    }
}
