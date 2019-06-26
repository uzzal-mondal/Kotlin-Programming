package FeburaryJAVA;

import java.util.Scanner;

public class UserInput {

    public static void main(String args[]){

        double number ;
        Scanner st  = new Scanner(System.in);
        System.out.println("Please double number");
        number  = st.nextDouble();
        System.out.println("this double number : "+number);

          String name ;
        Scanner  sc = new Scanner(System.in);
        System.out.println("please your name");
        name = sc.nextLine();
        System.out.println("name = "+name);

        int i ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please your number");
        i = scanner.nextInt();

        System.out.println("your numb is: "+i);

    }
}
