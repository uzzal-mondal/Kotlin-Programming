package FeburaryJAVA;

import java.util.Scanner;

public class PrimeTotal {


    public static void main(String args[]){

        System.out.println("user input");
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        int  i= 2;

        for (i =2; i<=num-1; i++){

            if (num%i==0){

                System.out.println("Not a Prime - "+num);
                break;
            }
        }

        if (i==num){
            System.out.println("Prime num - "+i);
        }
    }
}




