package io.javabrains.javabasics;

import java.util.ArrayList;
import java.util.List;

public class Operators {
    public static void main(String[] args) {
        // Step 1: Declare variables
        Integer age1 = 20, age2 = 30; 

        // Step 2: Perform arithmetic operations
        Integer sum = age1 + age2;

        // Step 3: Print the results of the arithmetic operations
        System.out.println("Sum of ages are " + sum);


        // Step 4: Perform increment and decrement operations
        age1++;
        age2--;


        // Step 5: Print the results of the increment and decrement operations
        System.out.println("Modified ages are age1 " + age1 + " age2 " + age2);

        // Step 6: Perform comparison operations
        
        Boolean isYounger = age1 < age2;


        // Step 7: Print the results of the comparison operations
        System.out.println("Is first person younger " + isYounger);


        // Step 8: Perform logical operations
        Boolean isInMidAge = age1 < 40 && age2 < 40;

        // Step 9: Print the results of the logical operations
        System.out.println("Is in mid age " + isInMidAge);


    }
}
