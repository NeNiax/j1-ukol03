package cz.czechitas.ukol3.model;

public class Disk {
    private long kapacita;
    private long vyuziteMisto;


    public long getKapacita() {
        return kapacita;
    }
    public long getVyuziteMisto() {
        return vyuziteMisto;
    }


    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }
    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }


    public String toString() {
        return ("Kapacita disku je " + kapacita + " bajtu" + " a vyuzite misto disku je " + vyuziteMisto + " bajtu");
    }
}
