package cz.czechitas.ukol3;

public class Disk {
    public long kapacita;

    public long vyuziteMisto;

    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }

    public String toString() {
        return ("Kapacita disku je " + kapacita + " bajtu" + " a vyuzite misto disku je " + vyuziteMisto + " bajtu");
    }
}
