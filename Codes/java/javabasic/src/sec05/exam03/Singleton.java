package sec05.exam03;

public class Singleton {
    private static Singleton singLeton = new Singleton();
    
    private Singleton() {}
    
    static Singleton getInstance() {
        return singLeton;
    }
}
