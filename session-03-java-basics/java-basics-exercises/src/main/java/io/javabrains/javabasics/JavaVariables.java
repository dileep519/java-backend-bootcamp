package io.javabrains.javabasics;

public class JavaVariables {

    public static void main(String[] args) {
        // Step 1: Declare and initialize variables of different data types
        // int variable to store an integer value
        int num = 10;

        // long variable to store a long value
        long lNum = 11234567890L;
        
        // float variable to store a floating-point value
        float fNum = 2.34f;

        // double variable to store a double value
        double d = 3.1431234555;

        // char variable to store a single character
        char c = 's';

        // boolean variable to store a boolean value
        boolean b = true;

        // String variable to store a string of characters
        String str = "Sample String";

        // Step 2: Print the values of the variables to the console 
        System.out.println("Integer= " + num + " Long int= " + lNum + " Float= " + fNum + " Double= " + d + " Char= " + c + " String= " + str);
        
        // Step 3: Modify the values of the variables and print the updated values
        num += 10;
        lNum+=1000000000;
        fNum+= 2.34f;
        d+=d;
        c='u';
        str="Updated String";
        System.out.println("Integer= " + num + " Long int= " + lNum + " Float= " + fNum + " Double= " + d + " Char= " + c + " String= " + str);

    }
}
