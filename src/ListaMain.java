import java.util.Arrays;

class Lista<Type> {
    private Type[] lista;
    private int dimensiune;
    private Type[] elemente;

    public Lista() {
        this.lista = (Type[]) new Object[100];
        /*this.dimensiune=cautareDupaElement(null);
        if(dimensiune==-1){
            dimensiune=lista.length;
        }*/
        this.dimensiune=0;
    }

    public Lista(Type[] lista) {
        this.lista = lista;
        /*this.dimensiune=cautareDupaElement(null);
        if(dimensiune==-1){
            dimensiune=lista.length;
        }*/
        this.dimensiune=0;
    }

    public void adauga(Type t) {
        lista[dimensiune++] = t;
    }

    public void afisare() {
        for (int i = 0; i < dimensiune; i++) {
            System.out.println(lista[i]);
        }
    }

    public Lista<Type> stergere(Type element) {
        boolean found = false;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].equals(element)) {
                found = true;
                for (int j = i; j < lista.length - 1; j++) {
                    lista[j] = lista[j + 1];
                }
                break;
            }
        }

        if (found) {
            lista = Arrays.copyOf(lista, lista.length - 1);
        }
        return new Lista<Type>(lista);
    }

    public int cautareDupaElement(Type t) {
        int poz = 0;
        boolean found = false;
        for (int i = 0; i < dimensiune; i++) {
            if (lista[i] == t) {
                poz = i;
                found = true;
            }
        }
        if (found) {
            return poz;
        } else {
            return -1;
        }
    }

    public Type cautareDupaIndex(int index) {
        for (int i = 0; i < dimensiune; i++) {
            if (i == index) {
                return lista[i];
            }
        }
        return null;
    }

    public int getDimensiune() {
        return dimensiune;
    }
}

public class ListaMain {
    public static void main(String[] args) {
        Lista<Integer> numereIntregi = new Lista<>();
        numereIntregi.adauga(10);
        numereIntregi.adauga(3);
        numereIntregi.adauga(2);
        numereIntregi.adauga(24);
        numereIntregi.adauga(5);
        System.out.println("Dupa adaugare: ");
        numereIntregi.afisare();
        System.out.println();
        System.out.println("Tabloul dupa stergerea elementului 3: "+numereIntregi.stergere(3));
        //System.out.println("Tabloul dupa stergerea elementului 3:");
        numereIntregi.afisare();
        System.out.println("Elementul 5 se gaseste la pozitia: " + numereIntregi.cautareDupaElement(5));
        System.out.println("Elementul de la indexul 1: "+numereIntregi.cautareDupaIndex(1));
    }
    //Sa returneze elementul, nu sa-l afiseze
    //returnare in caz ca nu se gaseste
}
