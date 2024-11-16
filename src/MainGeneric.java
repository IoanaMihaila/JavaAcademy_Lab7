class Pair<T1,T2>{
    private T1 ob1;
    private T2 ob2;

    public Pair(T1 ob1, T2 ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    public T1 getOb1() {
        return ob1;
    }

    public void setOb1(T1 ob1) {
        this.ob1 = ob1;
    }

    public T2 getOb2() {
        return ob2;
    }

    public void setOb2(T2 ob2) {
        this.ob2 = ob2;
    }
}

public class MainGeneric {
    public static void main(String[] args) {
        Pair<String,String> pair1=new Pair<>("Marco","Mihai");
        String ob1= pair1.getOb1();
        String ob2= pair1.getOb1();
        System.out.println(ob1);
    }
}
