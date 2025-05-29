package generics;

public class Printer <T extends Object> {
    T t;
    public Printer(T t){
        this.t=t;
    }

    public void print(){
        System.out.println(t.toString());
    }
}
