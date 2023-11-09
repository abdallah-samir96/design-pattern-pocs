package creational.singleton.withclass;
public class Singleton {
    private static Singleton instance;
    private Singleton(){
        if(instance != null)
            throw new RuntimeException("could not create more than one object");
    }
    public static  Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }

    public void run(Runnable runnable){
        runnable.run();
    }
}