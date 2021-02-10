import java.util.ArrayList;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        // Ülesande Tuba classi objeckt
        yl7_omaeesnimi_perenimi tuba = new yl7_omaeesnimi_perenimi();
        // Scanner andmete jaoks
        Scanner skanni = new Scanner(System.in);
        // Küsin kasutajalt andmeid
        System.out.println("Lisa täpne toa Pikkus: ");
        // Salvestan kasutaja andmed
        Double sisestus = skanni.nextDouble();
        // Kasutan kasutaja andmeid
        tuba.setPikkus(sisestus);
        System.out.println("Lisa täpne toa laius: ");
        Double sisestus4 = skanni.nextDouble();
        tuba.setLaius(sisestus4);
        System.out.println("Lisa täpne toa Kõrgus: ");
        Double sisestus5 = skanni.nextDouble();
        tuba.setKõrgus(sisestus5);
        // Väljastan toa pindala andmete järgi
        System.out.println("Toa pindala on: " + tuba.pindala());
        // Tapeedirullid
        System.out.println("Mis on tapeedirulli laius? ");
        Double laius = skanni.nextDouble();
        System.out.println("Mis on tapeedirulli pikkus? ");
        Double pikkus = skanni.nextDouble();
        // Väljastan tapeedirullide arvu andmete järgi
        System.out.println("On vaja: " + tuba.tapeedirull(laius, pikkus) + " tapeedirulli, mille laius on " + laius + " ja pikkus on " + pikkus + ", et katta toa seinad.");
        // Tsükkel, et lisada aknaid ja uksi, kui tahad.
        while (true) {
            Scanner skanni1 = new Scanner(System.in);
            System.out.println("Tahad lisada aknaid ja uksi?(Jah/Ei) ");
            String sisestus7 = skanni1.nextLine();
            if (sisestus7.equals("Jah") == true) {
                System.out.println("Mis on ukse või akna laius? ");
                Double sisestus00 = skanni.nextDouble();
                System.out.println("Mis on ukse või akna pikkus? ");
                Double sisestus0000 = skanni.nextDouble();
                tuba.lisaAkkenUks(sisestus00, sisestus0000);
                // väljastan tööpindala ja mitu tapeedirulli on vaja
                System.out.println("Toa seinade pindala (tööpindala): " + tuba.tööPind());
                System.out.println("On vaja: " + tuba.tapeedirull(laius, pikkus) + " tapeedirulli, mille laius on " + laius + " ja pikkus on " + pikkus + ", et katta toa seinad.");
            }
        }
    }
}
