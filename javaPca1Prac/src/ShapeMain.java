import java.util.*;

class Shape{
    void displayShape(){
        System.out.println("Display shape and area.");
    }

    void computeArea(){
        System.out.println("Computer the area of the shape.");
    }
}

class Rectangle extends Shape{
    double area;
    double length,breadth;
    Rectangle(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    void displayShape(){
        System.out.println("The area of the Rectangle is:"+area);
    }
    @Override
    void computeArea(){
        area = length * breadth;
    }
}

class Triangle extends Shape{
    double area;
    double base,height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    void displayShape(){
        System.out.println("The area of the triangle is:"+area);
    }
    @Override
    void computeArea(){
        area= 0.5* base * height;
    }
}

class Circle extends Shape{
    double area;
    double radius;

    Circle(double radius){
        this.radius=radius;
    }

    @Override
    void displayShape(){
        System.out.println("The area of the Circle is:"+area);
    }
    @Override
    void computeArea(){
        area = Math.PI * radius * radius;
    }
}

public class ShapeMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShapeMain object = new ShapeMain();

        object.driver(sc);
    }

    public void driver(Scanner sc){
        int choice;
        Shape obj;
        System.out.println("Shapes and their area");
        System.out.println("Enter \n 1. circle \n 2. rectangle \n 3. triangle");
        choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("You opted for circle \n Enter the radius:");
                double radius= sc.nextDouble();
                obj= new Circle(radius);
                obj.computeArea();
                obj.displayShape();
                break;
            case 2:
                System.out.println("You opted for rectangle \n Enter the length:");
                double length= sc.nextDouble();
                System.out.println("\nEnter the breadth:");
                double breadth= sc.nextDouble();
                obj= new Rectangle(length,breadth);
                obj.computeArea();
                obj.displayShape();
                break;
            case 3:
                System.out.println("You opted for triangle \n Enter the base:");
                double base= sc.nextDouble();
                System.out.println("\nEnter the height:");
                double height= sc.nextDouble();
                obj= new Triangle(base,height);
                obj.computeArea();
                obj.displayShape();
                break;
        }
    }
}
