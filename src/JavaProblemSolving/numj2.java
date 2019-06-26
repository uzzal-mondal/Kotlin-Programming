package JavaProblemSolving;

import java.util.Scanner;

public class numj2 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum=0, i =2;

        for (i=2; i<=n; i=i+2){

            sum = sum+i;
        }

        System.out.println(sum);

    }
}
