package design_patterns.singleton;

public class SingletonEager {
    //thread safe in nature but takes more load time
    private static final SingletonEager instance= new SingletonEager();

    private SingletonEager(){
    }

    public static SingletonEager getInstance(){
        return instance;
    }
}
