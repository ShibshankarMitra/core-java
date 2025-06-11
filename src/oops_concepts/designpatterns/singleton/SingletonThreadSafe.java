package oops_concepts.designpatterns.singleton;

public class SingletonThreadSafe {
    private static SingletonThreadSafe instance;

    private SingletonThreadSafe(){

    }

    public synchronized SingletonThreadSafe getInstance(){
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
