package oops_concepts.operators;

public class EqualsAndEqualtoOperator {
    private int num;
    private String str;
    private EqualsAndEqualtoOperator(int num, String str) {
        this.num = num;
        this.str = str;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getStr() {
        return str;
    }
    public void setStr(String str) {
        this.str = str;
    }

    public static void main(String[] args) {
        EqualsAndEqualtoOperator obj1 = new EqualsAndEqualtoOperator(5,"abc");
        EqualsAndEqualtoOperator obj2 = obj1;
        obj2.setNum(10);
        obj2.setStr("ABC");
        System.out.println(obj1.num+ " " + obj1.str); // Output: 10 ABC
    }
}
