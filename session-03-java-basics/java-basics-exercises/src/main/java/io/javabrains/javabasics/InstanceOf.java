package io.javabrains.javabasics;

public class InstanceOf {

    public static void main(String[] args) {
        Object[] objects = {
                10,
                "Hello",
                true,
                20.5
        };

        // Challenge: Use instanceof to determine the type of each object in the array
        
        for (Object prop : objects){
            if(prop instanceof Integer){
                System.out.println("Property " + prop + " is instance of Integer");
            } else if(prop instanceof String){
                System.out.println("Property " + prop + " is instance of String");
            } else if(prop instanceof Boolean){
                System.out.println("Property " + prop + " is instance of Boolean");
            } else{
                System.out.println("Property " + prop + " is instance of Double");
            }
        }

    }
}
