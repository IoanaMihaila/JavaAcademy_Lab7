class Pereche{
    private Object obj1;
    private Object obj2;

    public Pereche(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public Object getObj1() {
        return obj1;
    }

    public void setObj1(Object obj1) {
        this.obj1 = obj1;
    }

    public Object getObj2() {
        return obj2;
    }

    public void setObj2(Object obj2) {
        this.obj2 = obj2;
    }
}

class Angajat{
    private String nume;

    public Angajat(String nume) {
        this.nume = nume;
    }
    public void reparaMasina(Masina masina){
        System.out.println("Repar masina "+masina);
    }
}

class Masina{
    private String marca;
    private String motor;

    public Masina(String marca, String motor) {
        this.marca = marca;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "marca='" + marca + '\'' +
                ", motor='" + motor + '\'' +
                '}';
    }
}

public class Main {
    //alg care asociaza un angajat unei masini pentru a o repara
    static Pereche generatePereche(){
        Angajat marco=new Angajat("Marco");
        Masina dacia=new Masina("Dacia","Logan");
        Pereche pereche=new Pereche(marco,dacia);
        return pereche;
    }
    static Pereche generatePereche2(){
        return new Pereche("","");
    }
    public static void main(String[] args) {
        Pereche pereche=generatePereche();
        //marco sa apeleze repara(masina)
        //pereche.getObj1().reparaMasina(pereche.getObj2());
        //cast:
        ((Angajat)pereche.getObj1()).reparaMasina((Masina)pereche.getObj2());

        Pereche pereche2=generatePereche2();
        //((Angajat)pereche.getObj1()).reparaMasina((Masina)pereche.getObj2());

        if(pereche2.getObj1() instanceof Angajat && pereche2.getObj2() instanceof Masina){
            ((Angajat)pereche.getObj1()).reparaMasina((Masina)pereche.getObj2());
        }
        //niciodata nu facem cast fara sa verificam tipul in prealabil
    }
}
