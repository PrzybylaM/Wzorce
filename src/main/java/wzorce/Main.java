package wzorce;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Singleton singleton = new Singleton().getSingleton();
        Singleton singleton2 = new Singleton().getSingleton();

        singleton.getId();
        singleton2.getId();
    }
}
