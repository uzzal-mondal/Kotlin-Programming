package FeburaryJAVA;

import java.util.Scanner;

public class LoopCl {

    public static void main(String args[]){

        int num;

        Scanner sc  = new Scanner(System.in);
        System.out.println("your input num:-");
        num = sc.nextInt();
        System.out.println("YOur Data:- ");


        for (int i=0; i<=num; i++){

            if (num%2==0){

                System.out.println("even num - "+i);
            }else if (num%2!=0){

                System.out.println("Odd num - "+i);
            }else {

                System.out.println("Num is existing");
            }

           // System.out.println(i);
        }




    }
}
