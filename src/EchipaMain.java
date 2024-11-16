import java.util.ArrayList;
import java.util.List;

class Echipa {
    private String nume;
    private static int ID = 0;
    private int meciuriJucate;
    List<Jucator> jucatori;

    public Echipa(String nume, int meciuriJucate) {
        this.nume = nume;
        this.ID++;
        this.meciuriJucate = meciuriJucate;
        this.jucatori = new ArrayList<>();
    }

    public void adaugareJucator(Jucator j) {
        this.jucatori.add(j);
    }

    public void joacaMeci() {
        this.meciuriJucate++;
    }

    public void extragereJucator(String nume) {
        for (Jucator j : jucatori) {
            if (j.getNume().equals(nume)) {
                jucatori.remove(j);
            }
        }
    }
}

abstract class Jucator {
    private String nume;
    private int nrTricou;

    public Jucator(String nume, int nrTricou) {
        this.nume = nume;
        this.nrTricou = nrTricou;
    }

    public String getNume() {
        return nume;
    }
}

class JucatorFotbal extends Jucator {
    public JucatorFotbal(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    public void suteaza() {
        System.out.println(this.getNume() + " suteaza la poarta");
    }
}

class JucatorBaschet extends Jucator {
    public JucatorBaschet(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    public void aruncaLaCos() {
        System.out.println(this.getNume() + " arunca la cos");
    }

}

public class EchipaMain {
    public static void main(String[] args) {
        Echipa fotbal = new Echipa("Fotbal1", 10);
        Echipa baschet = new Echipa("Baschet1", 5);
        JucatorFotbal alex = new JucatorFotbal("Alex", 4);
        JucatorFotbal mario = new JucatorFotbal("Mario", 6);
        JucatorBaschet valentin = new JucatorBaschet("Valentin", 1);
        JucatorBaschet mihai = new JucatorBaschet("Mihai", 2);
        fotbal.adaugareJucator(alex);
        fotbal.adaugareJucator(mario);
        baschet.adaugareJucator(valentin);
        baschet.adaugareJucator(mihai);
        alex.suteaza();
        valentin.aruncaLaCos();
    }
}
