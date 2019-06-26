package JavaProblemSolving;

import java.util.Scanner;

public class NumInput {

    public static void main(String args[]){

        int sum = 0, i=1;

        Scanner sc = new Scanner(System.in);
        System.out.println("input data: ");
        int n = sc.nextInt();

        for ( i=1; i<=n; i++){

            sum = sum+i;

        }

        System.out.println(sum);


    }
}
