package MultiThreadOptimized;

public class Singleton2 {
    // Lazy initialization with double-checked locking
    private static volatile Singleton2 instance;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World from MultiThreadOptimized Singleton2!");
    }
}
