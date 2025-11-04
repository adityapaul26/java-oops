import java.util.*;
// use of interface
interface shape1{
    double rad = 2;
    void calculate();
}

interface shape2{
    int length = 4;
    int breadth = 6;
    void calculate();
}

class Compute1 implements shape1{
    public void calculate(){
        double area = Math.PI * rad * rad;
        System.out.println("The area of the circle is :"+ area);
    }
}

class Compute2 implements shape2{
    public void calculate(){
        double area = length * breadth;
        System.out.println("The area of the rectangle is :"+ area);
    }
}

public class InterfaceApplication {
    static void main(String args[]) {
        shape1 p1;
        p1 = new Compute1();
        p1.calculate();

        shape2 p2;
        p2 = new Compute2();
        p2.calculate();
    }
}
