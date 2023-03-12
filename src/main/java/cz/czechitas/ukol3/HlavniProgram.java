package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        System.out.println("Program spuštěn.");

        // vytvoření počítače, zatím bez procesoru, paměti a disku
        Pocitac pocitacPeti = new Pocitac();
        System.out.println(pocitacPeti.toString());
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
        System.out.println(pocitacPeti.toString());

        pocitacPeti.zapniSe();
        pocitacPeti.zapniSe();
        System.out.println(pocitacPeti.toString());
        System.out.println(pametPeti.toString());
        System.out.println(procesorPeti.toString());
        System.out.println(diskPeti.toString());
        pocitacPeti.vypniSe();

        pocitacPeti.vypniSe();
        pocitacPeti.vypniSe();


        System.out.println(diskPeti.toString());

        // cast 2
        pocitacPeti.zapniSe();
        pocitacPeti.vytvorSouborOVelikosti(100_000L);
        System.out.println("Po pozadavku na vytvoreni/smazani souboru: " + pocitacPeti.toString());

        pocitacPeti.vymazSouboryOVelikosti(100_000L);
        System.out.println("Po pozadavku na vytvoreni/smazani souboru: " + pocitacPeti.toString());


        pocitacPeti.vytvorSouborOVelikosti(555L);
        System.out.println("Po pozadavku na vytvoreni/smazani souboru: " + pocitacPeti.toString());

        pocitacPeti.vymazSouboryOVelikosti(111L);
        System.out.println("Po pozadavku na vytvoreni/smazani souboru: " + pocitacPeti.toString());
        }
}
