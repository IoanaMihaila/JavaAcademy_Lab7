import java.util.List;

class Pairr<T1, T2> {
    private T1 ob1;
    private T2 ob2;

    public Pairr(T1 ob1, T2 ob2) {
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

    @Override
    public String toString() {
        return "Obiectul 1 de tip " + ob1.getClass().getSimpleName() + " este: " + ob1 + "\nObiectul 2 de tipul " + ob2.getClass().getSimpleName() + " este: " + ob2;
    }
}

public class PairMain {
    public static void main(String[] args) {
        Pairr<String,Integer>pereche=new Pairr<>("Ioana",21);
        System.out.println(pereche);

        List<String>listaStringuri=List.of("e1","e2","e3","e4","e5");
        List<Integer>listaNumere=List.of(10,20,30,40,50);
        System.out.println("Afisare lista de string-uri: ");
        afisare(listaStringuri);
        System.out.println("Afisare lista de intregi: ");
        afisare(listaNumere);
    }
    public static <T> void afisare(List<T> list){
        for(T element:list){
            System.out.println(element);
        }
    }
}
