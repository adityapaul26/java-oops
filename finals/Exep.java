import java.util.*;

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

class Age {
    int age;

    Age(int age) {
        this.age = age;
    }

    public void verifyVoteAge() throws MyException {
        if (age < 18) {
            throw new MyException("hobe na!");
        } else {
            System.out.println("lessgoo!");
        }
    }
}

public class Exep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Age person1 = new Age(16);
        try {
            person1.verifyVoteAge();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // person1.verifyVoteAge();
    }
}
