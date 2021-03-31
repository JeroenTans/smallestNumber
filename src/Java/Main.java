package Java;

import java.util.Scanner;

public class Main {

    /* 1. Write a Java method to find the smallest number among three numbers. Go to the editor
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:

The smallest value is 25.0 */

    public static void smallestNumber (int numberOneEx, int numberTwoEx, int numberThreeEx) {

        if (numberOneEx < numberTwoEx && numberOneEx < numberThreeEx) {
            System.out.println(numberOneEx);
        }
        if (numberTwoEx < numberOneEx && numberTwoEx < numberThreeEx) {
            System.out.println(numberTwoEx);
        }
        else if (numberThreeEx < numberOneEx && numberThreeEx < numberTwoEx) {
            System.out.println(numberThreeEx);
        }

    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

            System.out.println("Geef het eerste getal op: ");
            int numberOne = input.nextInt();

            System.out.println("Geef het tweede getal op: ");
            int numberTwo = input.nextInt();

            System.out.println("Geef het derde getal op: ");
            int numberThree = input.nextInt();

            System.out.println("Het kleinste getal is: ");
            smallestNumber(numberOne, numberTwo, numberThree);


    }
}
