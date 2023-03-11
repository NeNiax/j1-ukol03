package cz.czechitas.ukol3;

public class Pocitac {

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }


    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    public boolean jeZapnuty;
    public Procesor cpu;
    public Pamet ram;
    public Disk pevnyDisk;


    public String toString() {
        return ("Pocitac je zapnuty " + jeZapnuty + ".  Ma procesor: "
                + cpu + " , pamet: " + ram + ", a disk:  " + pevnyDisk);
    }


    public void zapniSe() {
        // kontrola, že má počítač procesor, paměť a disk.
        if (ram == null || cpu == null || pevnyDisk == null) {
            System.err.println("Pocitac nema procesor, pamet nebo disk.");
            return;
        }

        if (!jeZapnuty) {
            jeZapnuty = true;
            System.out.println("Pocitac je zapnuty, tzn. jeZapnuty = " + jeZapnuty);
        } else {
            System.err.println("Pocitac nejde zapnout 2x, tzn. jeZapnuty = " + jeZapnuty);
        }
    }

    public void vypniSe() {
        if (jeZapnuty) {
            jeZapnuty = false;
            System.out.println("Pocitac je vypnuty, tzn. jeZapnuty = " + jeZapnuty);
        }
    }
}
