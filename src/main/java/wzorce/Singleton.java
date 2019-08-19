package wzorce;

import java.util.Random;

public class Singleton {
    private static Singleton instancja = null;
    private int id;


    protected Singleton() {
        this.id = new Random().nextInt();
        System.out.println("new singleton id: "+id);
    }

    public static Singleton getSingleton(){
        if(instancja == null){
            synchronized (Singleton.class){
                instancja = new Singleton();
            }
        }
        return instancja;
    }

    public void getId(){
        System.out.println("Singleton id: "+id);
    }
}
