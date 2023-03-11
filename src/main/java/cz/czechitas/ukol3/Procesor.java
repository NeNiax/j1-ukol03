package cz.czechitas.ukol3;

public class Procesor {

    public void setVyrobce(String vyrobce) {
        this.vyrobce = vyrobce;
    }

    public void setRychlost(long rychlost) {
        this.rychlost = rychlost;
    }

    public String vyrobce;
    public long rychlost;

    public String toString() {
        return ("Procesor je od vyrobce " + vyrobce + " a ma rychlost " + rychlost + "Hz.");
    }
}
