
class Operation{
    static void divByZero(int a)throws ArithmeticException{
        int result = a/0; //deliberately trying to cause an error
        System.out.println("result is:"+result);
    }
}

public class err2Main {
    static void main() {
        try{
            Operation.divByZero(7);
        }catch(Exception e){
            System.out.println("Actually div by zero is not allowed!");
        }
    }
}
