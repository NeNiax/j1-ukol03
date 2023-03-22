package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        System.out.println("Program spuštěn.");

        // vytvoření počítače, zatím bez procesoru, paměti a disku
        Pocitac pocitacPeti = new Pocitac();
        System.out.println(pocitacPeti);
        pocitacPeti.zapniSe();

        // přiřazení procesoru, paměti a disku k výše vytvořenému počítači
        Procesor procesorPeti = new Procesor();
        procesorPeti.setRychlost((2_222L));
        procesorPeti.setVyrobce("Intel");

        Pamet pametPeti = new Pamet();
        pametPeti.setKapacita(8_000L);


        Disk diskPeti = new Disk();
        diskPeti.setKapacita(12_000L);
        diskPeti.setVyuziteMisto(2_000L);


        pocitacPeti.setCpu(procesorPeti);
        pocitacPeti.setRam(pametPeti);
        pocitacPeti.setPevnyDisk(diskPeti);

        // testování zapni se a vypni se.
        System.out.println(pocitacPeti);

        pocitacPeti.zapniSe();
        pocitacPeti.zapniSe();
        System.out.println(pocitacPeti);
        System.out.println(pametPeti);
        System.out.println(procesorPeti);
        System.out.println(diskPeti);
        pocitacPeti.vypniSe();

        pocitacPeti.vypniSe();
        pocitacPeti.vypniSe();


        System.out.println(diskPeti);

        // cast 2
        pocitacPeti.zapniSe();
        pocitacPeti.vytvorSouborOVelikosti(100_000L);
        System.out.println("Po pozadavku na vytvoreni/smazani souboru: " + pocitacPeti);

        pocitacPeti.vymazSouboryOVelikosti(100_000L);
        System.out.println("Po pozadavku na vytvoreni/smazani souboru: " + pocitacPeti);


        pocitacPeti.vytvorSouborOVelikosti(555L);
        System.out.println("Po pozadavku na vytvoreni/smazani souboru: " + pocitacPeti);

        pocitacPeti.vymazSouboryOVelikosti(111L);
        System.out.println("Po pozadavku na vytvoreni/smazani souboru: " + pocitacPeti);
        }
}
