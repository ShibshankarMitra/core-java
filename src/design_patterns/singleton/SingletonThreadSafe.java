package design_patterns.singleton;

public class SingletonThreadSafe {
    private static SingletonThreadSafe instance;

    private SingletonThreadSafe(){
    }

    //double-checked locking
    //first check is for acquiring the lock, and the second check is for creating the instance
    public static SingletonThreadSafe getInstance(){
        if(instance == null){
            synchronized (SingletonThreadSafe.class){
                if(instance == null){
                instance= new SingletonThreadSafe();
                }
            }
        }
        return instance;
    }
}
