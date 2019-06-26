package JavaLearning;

public class PrimeBest {

    public static void main(String args[]){

        int i =2;

        int num = 11;

        for ( i= 2; i<num; i++){

            if (num%i == 0){

                System.out.println("Not prime");
                break;
            }
        }

        if (i==num){

            System.out.println("Prime no");
        }
    }
}
