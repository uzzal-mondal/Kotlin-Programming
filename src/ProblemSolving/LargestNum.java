package ProblemSolving;

import java.util.Scanner;

public class LargestNum {

    public static void main(String args[]){


        int a,b,c;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter input Person");
        a = sc.nextInt();
        System.out.println("Enter input B");
        b = sc.nextInt();
        System.out.println("Enter input C");
        c  = sc.nextInt();

        if (a>b && a>c){
            System.out.println("Person is largest :  "+a);
        }


        else if (b>a && b>c){
            System.out.println("B is largest :  "+b);
        }


       else  if (c>a && c>b){
            System.out.println("C is largest :  "+c);
        }


        else  if (a==b && b==c && c==a){
            System.out.printf("a-%d , b-%d , c-%d = same input here ",a,b,c);
        }

        else{
            System.out.println("wrong Input");
        }

    }
}
