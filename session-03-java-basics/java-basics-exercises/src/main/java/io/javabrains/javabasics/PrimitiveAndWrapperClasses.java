package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int radius = 360;
        boolean isNumberEven = true;

        // Step 2: Convert primitive variables to wrapper objects
        Integer radiusObj = radius;
        Boolean isNumberObj = isNumberEven;
       
        // Step 3: Print the values of the wrapper objects
       System.out.println("Integer object " + radiusObj + " Boolean object " + isNumberObj);
       
        // Step 4: Convert wrapper objects back to primitive variables
        int newRadius = radiusObj; // or  radiusObj.intValue()
        boolean newBoolean = isNumberObj;
        
        // Step 5: Print the values of the primitive variables
        System.out.println("Integer is " + newRadius + " Boolean is " + newBoolean);
    }
}
