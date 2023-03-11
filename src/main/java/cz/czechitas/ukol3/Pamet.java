package cz.czechitas.ukol3;

public class Pamet {

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public long kapacita;

    public String toString() {
        return ("Kapacita pameti je " + kapacita + " bajtu.");
    }
}
