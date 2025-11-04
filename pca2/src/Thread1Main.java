class A extends Thread{
    public void run(){
        for( int i = 0 ; i < 5 ; i++ ) {
            System.out.println("A: "+ i);
        }
    }
}

class B extends Thread{
    public void run(){
        for( int i = 0 ; i < 6 ; i++ ) {
            System.out.println("B: "+ i);
        }
    }
}

class C extends Thread{
    public void run(){
        for( int i = 0 ; i < 12 ; i++ ) {
            System.out.println("C: "+ i);
        }
    }
}

public class Thread1Main {
    public static void main() {
        new A().start();
        new B().start();
        new C().start();
    }
}

//public class Thread1Main {
//    public static void main() {
//        new A().run();
//        new B().start();
//        new C().start();
//    }
//}  don't do this. this will run the code but not threads.
