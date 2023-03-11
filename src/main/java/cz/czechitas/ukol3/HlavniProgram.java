package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        System.out.println("Program spuštěn.");

        // vytvoření počítače, procesoru, paměti a disku
        Pocitac pocitacPeti = new Pocitac();
        System.out.println(pocitacPeti.toString());
        pocitacPeti.zapniSe();

        Procesor procesorPeti = new Procesor();
        procesorPeti.setRychlost((2_000_000_000_000L));
        procesorPeti.setVyrobce("Intel");

        Pamet pametPeti = new Pamet();
        pametPeti.setKapacita(8_000_000_000L);


        Disk diskPeti = new Disk();
        diskPeti.setKapacita(12_125_000_000L);
        diskPeti.setVyuziteMisto(8_250_000L);


        pocitacPeti.setCpu(procesorPeti);
        pocitacPeti.setRam(pametPeti);
        pocitacPeti.setPevnyDisk(diskPeti);

        // testování zapni se a vypni se.
        System.out.println(pocitacPeti.toString());

        pocitacPeti.zapniSe();
        pocitacPeti.zapniSe();
        System.out.println(pocitacPeti.toString());
        pocitacPeti.vypniSe();

        pocitacPeti.vypniSe();
        pocitacPeti.vypniSe();

        System.out.println(diskPeti.toString());
    }
}
