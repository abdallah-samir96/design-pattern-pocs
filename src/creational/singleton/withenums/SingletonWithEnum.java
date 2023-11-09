package creational.singleton.withenums;

public enum SingletonWithEnum {
    INSTANCE;
    public void run(Runnable runnable){
        runnable.run();
    }
    public void doSomething(){
        System.out.println(this.getClass().getName());
    }
}
