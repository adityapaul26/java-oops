
class AgeValidator{
    public static void checkAge(int age){
        try{
            if(age < 18){
                throw new ArithmeticException("Access denied!");
            }
        }catch (ArithmeticException e){
            System.out.println("cant vote");
        }
    }
}

public class err1Main {
        public static void main(String[] args) {
            try {
                AgeValidator.checkAge(15);  // Change this value to test
            }
            catch (ArithmeticException e) {
                System.out.println("Exception Caught: " + e.getMessage());
            }

            System.out.println("Program continues after exception handling...");
        }
}
