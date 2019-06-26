package JavaLearning;

public class LogicalOperator {

    public static void main(String args[]){

        //Logical operator..

        int num1 = 1, num2 = 5, num3 = 10;
        boolean result;

       result =   ((num1>=num2) || (num2>=num3) || (num3>=num1));


            System.out.println(result);

            result = ((num2<=num1) || (num3<=num2) || (num3<=num1));
            System.out.println(result);


    }
}
