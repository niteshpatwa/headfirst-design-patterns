package MultiThreadOptimized;

public class SingletonClient {
    public static void main(String[] args) {
        // Eager initialization
        Singleton1 singleton = Singleton1.getInstance();
        singleton.showMessage();

        // Double-checked locking initialization (more optimal for multithreading)
        Singleton2 singleton2 = Singleton2.getInstance();
        singleton2.showMessage();

        // Enum-based singleton (best practice for singletons in Java)
        Singleton3 singleton3 = Singleton3.UNIQUE_INSTANCE;
        singleton3.showMessage();
    }
}
