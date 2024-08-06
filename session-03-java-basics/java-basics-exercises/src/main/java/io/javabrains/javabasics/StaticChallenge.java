package io.javabrains.javabasics;

/*
Create a class `Rectangle` with the following attributes: `width`, `height`, and a static variable `numOfRectangles` which will keep track of the number of rectangles created.

1.  Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
2.  Create a method `getArea` that calculates and returns the area of the rectangle.
3.  Create a method `getPerimeter` that calculates and returns the perimeter of the rectangle.
4.  Create a method `getNumOfRectangles` that returns the value of the `numOfRectangles` static variable.
5.  In this main method, create several `Rectangle` objects, calculate and print their area and perimeter, and finally print the number of rectangles created without keeping count in this class.
 */

class Rectangle {
    private Integer width;
    private Integer height;
    public static Integer numOfRectangles = 0;

    public Rectangle(Integer newWidth, Integer newHeight) {
        width = newWidth;
        height = newHeight;
        numOfRectangles+=1;
    }

    public Integer getArea () {
        return width * height;
    }

    public Integer getPerimeter () {
        return width * height * 2;
    }

    public Integer getNumOfRectangles () {
        return numOfRectangles;
    }
}

public class StaticChallenge {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,20);
        Rectangle r2 = new Rectangle(10,20);
        Rectangle r3 = new Rectangle(10,20);
        System.out.println("Area " + r1.getArea());
        System.out.println("Perimeter " + r1.getPerimeter());
        System.out.println("No of Rectangles " + r1.getNumOfRectangles());
    }
}
