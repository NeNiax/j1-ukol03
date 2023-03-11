package cz.czechitas.ukol3;

public class Disk {
    public long kapacita;
    public long vyuziteMisto;

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }

    public String toString() {
        return ("Pocitac ma kapacitu " + kapacita + " bajtu" + " a vyuzite misto " + vyuziteMisto + " bajtu.");
    }
}
