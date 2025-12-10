
// Create an abstract class Shape with:
//
// an abstract method double area()
//
// a non-abstract method void display() that prints "Calculating area"
//
// Then create two subclasses:
//
// Circle (with radius)
//
// Rectangle (with length and width)
//
// Write a main method to:
//
// Create objects of Circle and Rectangle using dynamic method dispatch (Shape
// reference).
//
// Call the display() method and print their area.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

abstract class Shape {
    abstract public double area();

    void display() {
        System.out.println("Calculating area");
    }
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    int length, width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}

public class Abs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the radius:");
        String radS = br.readLine();

        int rad = Integer.parseInt(radS);

        System.out.println("Enter the length and breadth:");

        String lenS = br.readLine();
        String widS = br.readLine();

        int len = Integer.parseInt(lenS);
        int wid = Integer.parseInt(widS);

        Shape obj1 = new Circle(rad);
        Shape obj2 = new Rectangle(len, wid);

        System.out.println("Circle:" + obj1.area());
        System.out.println("Rectangle:" + obj2.area());
    }
}
