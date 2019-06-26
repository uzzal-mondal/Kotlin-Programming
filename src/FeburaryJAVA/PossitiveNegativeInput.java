package FeburaryJAVA;

import java.util.Scanner;

public class PossitiveNegativeInput {

    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);



        int i=1;
        int p=0;
        int n = 0;

        while(i<5){

            int num = sc.nextInt();

            if (num>0){
                p++;
            }
            else{
                n++;
            }
        }

    }
}
