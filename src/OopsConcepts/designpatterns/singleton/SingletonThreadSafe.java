package OopsConcepts.designpatterns.singleton;

public class SingletonThreadSafe {
    private static SingletonThreadSafe instance;

    private SingletonThreadSafe(){

    }

    public synchronized SingletonThreadSafe getInstance(){
        if(instance == null){
            synchronized (SingletonThreadSafe.class){
                instance= new SingletonThreadSafe();
            }
        }
        return instance;
    }
}
