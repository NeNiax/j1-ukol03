package cz.czechitas.ukol3.model;

public class Procesor {

    private String vyrobce;
    private long rychlost;

    public void setVyrobce(String vyrobce) {
        this.vyrobce = vyrobce;
    }

    public void setRychlost(long rychlost) {
        this.rychlost = rychlost;
    }

    public String toString() {
        return ("Procesor je od vyrobce " + vyrobce + " a ma rychlost " + rychlost + "Hz");
    }
}
