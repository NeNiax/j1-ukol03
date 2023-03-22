package cz.czechitas.ukol3.model;

public class Pocitac {

    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;



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

    public void vytvorSouborOVelikosti(long velikost) {
        if (jeZapnuty) {
            if (pevnyDisk.getVyuziteMisto() + velikost > pevnyDisk.getKapacita()) {
                System.err.println("Nejde provest, protoze nove vytvareny soubor se nevleze na disk.");
            } else {
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() + velikost);
                // System.out.println("Soubor vytvoren.");
            }
        }
    }

    public void vymazSouboryOVelikosti(long velikost) {
        if (jeZapnuty) {
            if (pevnyDisk.getVyuziteMisto() - velikost < 0) {
                System.err.println("Nejde provest, protoze velikost mazaneho souboru je nesmysl.");
            } else {
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - velikost);
                // System.out.println("Soubor smazany.");
            }
        }
    }


    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    public String toString() {
        return ("Pocitac je zapnuty " + jeZapnuty + ".  Procesor: "
                + cpu + " . Pamet: " + ram + ". Disk: " + pevnyDisk) + ".";
    }
}
