package MultiThreadOptimized;

public class Singleton1 {
    // Eager initialization of the singleton instance
    private static Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World from MultiThreadOptimized Singleton1!");
    }
}
