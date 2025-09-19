import java.util.Scanner;

public class AdvancedShapeCalculator {
    int calculate(int side){
        return side *side;
    }

    int calculate(int length,int breadth, boolean isPerimeter){
        if(isPerimeter)
            return 2*(length+breadth);
        return length * breadth;
    }

    double calculate(double radius,boolean isPerimeter){
        if(isPerimeter)
            return 2*Math.PI*radius;
        return Math.PI*radius *radius;
    }

    double calculate(double[] sides){
        double perimeter=0;
        for (double side : sides) perimeter += side;
        return perimeter;
    }

    public static void main(String[] args) {
        AdvancedShapeCalculator obj = new AdvancedShapeCalculator();

        // Square
        System.out.println("Area of square (side=5): " + obj.calculate(5));

        // Rectangle
        System.out.println("Area of rectangle (4x6): " + obj.calculate(4, 6, false));
        System.out.println("Perimeter of rectangle (4x6): " + obj.calculate(4, 6, true));

        // Circle
        System.out.println("Area of circle (radius=3): " + obj.calculate(3.0, false));
        System.out.println("Circumference of circle (radius=3): " + obj.calculate(3.0, true));

        // Polygon
        double[] sides = {3.0, 4.0, 5.0, 6.0};  // quadrilateral
        System.out.println("Perimeter of polygon (3,4,5,6): " + obj.calculate(sides));
    }

}


