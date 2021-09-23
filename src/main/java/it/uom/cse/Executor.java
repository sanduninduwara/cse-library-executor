package it.uom.cse;

import java.util.Arrays;
import java.util.Scanner;

import static it.uom.cse.util.StringUtil.operandArray;

public class Executor
{

    private static final Scanner scanner = new Scanner(System.in);

    public static void main( String[] args )
    {
        System.out.println( "====== CSE WORKSHOP - EXECUTOR ======" );
        execute();
        System.out.println( "====== CSE WORKSHOP - EXECUTOR ======" );
    }

    private static void execute()
    {
        while (true)
        {
            System.out.println("Please enter the operation: ");
            String operation = scanner.nextLine();
            if (operation.equalsIgnoreCase(OperationType.EXIT.getOpeartionString())) break;
            else if (operation.equalsIgnoreCase(OperationType.ADD.getOpeartionString()))
            {
                System.out.println("Enter operands as a list (e.g. 1,2,3,4)");
                String operands = scanner.nextLine();
                double[] operandArray = operandArray(operands);
                System.out.printf("Sum: %f%n", Arrays.stream(operandArray).sum());
            }
            else if (operation.equalsIgnoreCase(OperationType.MULT.getOpeartionString()))
            {
                System.out.println("Enter the two operands as a list (e.g. 2,5)");
                String operands = scanner.nextLine();
                double[] operandArray = operandArray(operands);
                System.out.printf("Multiplication: %f%n", Arrays.stream(operandArray).reduce(1, (a,b) -> a*b));
            }
            else if (operation.equalsIgnoreCase(OperationType.SUM_OF_INTEGERS.getOpeartionString()))
            {
                // use MathOperation class within library project to implement this case
                System.err.println("Functionality is not implemented yet.");
            }
            else if (operation.equalsIgnoreCase(OperationType.FIBONACCI.getOpeartionString()))
            {
                // use MathOperation class within library project to implement this case
                System.err.println("Functionality is not implemented yet.");
            }
            else if (operation.equalsIgnoreCase(OperationType.FACTORIAL.getOpeartionString()))
            {
                // use MathOperation class within library project to implement this case
                System.err.println("Functionality is not implemented yet.");
            }
            else if (operation.equalsIgnoreCase(OperationType.SUM_OF_PRIMES.getOpeartionString()))
            {
                // use MathOperation class within library project to implement this case
                System.err.println("Functionality is not implemented yet.");
            }
            else
            {
                System.err.println("Please enter valid operation type.");
            }
        }
    }

}
