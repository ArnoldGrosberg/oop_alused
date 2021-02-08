import java.util.ArrayList;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        yl7_omaeesnimi_perenimi tuba = new yl7_omaeesnimi_perenimi();
        Scanner skanni = new Scanner(System.in);
        System.out.println("Lisa täpne toa Pikkus: ");
        Double sisestus = skanni.nextDouble();
        tuba.setPikkus(sisestus);
        Scanner skanni1 = new Scanner(System.in);
        System.out.println("Lisa täpne toa laius: ");
        Double sisestus4 = skanni1.nextDouble();
        tuba.setLaius(sisestus4);
        Scanner skanni2 = new Scanner(System.in);
        System.out.println("Lisa täpne toa Kõrgus: ");
        Double sisestus5 = skanni2.nextDouble();
        tuba.setKõrgus(sisestus5);
        System.out.println("Toa pindala on: " + tuba.pindala());

        Scanner sisestustapeet = new Scanner(System.in);
        System.out.println("Mis on tapeedirulli laius? ");
        Double laius = sisestustapeet.nextDouble();
        Scanner sisestustapeet2 = new Scanner(System.in);
        System.out.println("Mis on tapeedirulli pikkus? ");
        Double pikkus = sisestustapeet2.nextDouble();
        System.out.println("On vaja: " + tuba.tapeedirull(laius, pikkus) + " tapeedirulli, mille laius on " + laius + " ja pikkus on " + pikkus + ", et katta toa seinad.");

        while (true) {
            Scanner skanni3 = new Scanner(System.in);
            System.out.println("Tahad lisada aknaid ja uksi?(Jah/Ei) ");
            String sisestus7 = skanni3.nextLine();
            if (sisestus7.equals("Jah") == true) {
                Scanner skanni0 = new Scanner(System.in);
                System.out.println("Mis on ukse või akna laius? ");
                Double sisestus00 = skanni0.nextDouble();
                Scanner skanni000 = new Scanner(System.in);
                System.out.println("Mis on ukse või akna pikkus? ");
                Double sisestus0000 = skanni000.nextDouble();
                tuba.lisaAkkenUks(sisestus00, sisestus0000);
                System.out.println("Toa seinade pindala (tööpindala): " + tuba.tööPind());
                System.out.println("On vaja: " + tuba.tapeedirull(laius, pikkus) + " tapeedirulli, mille laius on " + laius + " ja pikkus on " + pikkus + ", et katta toa seinad.");

            }

        }
    }
    /* public static void main(String[] args) {
        Restoraan restoraan = new Restoraan();
        restoraan.setRestoraaniNimi("Burgeri");
        restoraan.teenindatudKylalisedPaevas(10);
        System.out.println(restoraan.avaRestoraan());
        System.out.println("Tere tulemast " + restoraan.getRestoraaniNimi() + " restoraani! " + "Meil on täna menüüs: " + restoraan.getSoogiTyyp() + " Täna on meil " + restoraan.getKylalisteArv() + " külalist.");
        restoraan.teenindatudKylalisedPaevas(9);
        System.out.println(" Täna on meil nüüd " + restoraan.getKylalisteArv() + " külalist.");


        Restoraan restoraan2 = new Restoraan();
        restoraan2.setRestoraaniNimi("Burgeri2");
        restoraan2.teenindatudKylalisedPaevas(20);
        System.out.println(restoraan2.avaRestoraan());
        System.out.println("Tere tulemast " + restoraan2.getRestoraaniNimi() + " restoraani! " + "Meil on täna menüüs: " + restoraan2.getSoogiTyyp() + " Täna on meil " + restoraan2.getKylalisteArv() + " külalist.");
        restoraan2.teenindatudKylalisedPaevas(3);
        System.out.println(" Täna on meil nüüd " + restoraan2.getKylalisteArv() + " külalist.");


        Restoraan restoraan3 = new Restoraan();
        restoraan3.setRestoraaniNimi("Burgeri3");
        restoraan3.teenindatudKylalisedPaevas(90);
        System.out.println(restoraan3.avaRestoraan());
        System.out.println("Tere tulemast " + restoraan3.getRestoraaniNimi() + " restoraani! " + "Meil on täna menüüs: " + restoraan3.getSoogiTyyp() + " Täna on meil " + restoraan3.getKylalisteArv() + " külalist.");
        restoraan3.teenindatudKylalisedPaevas(90);
        System.out.println(" Täna on meil nüüd " + restoraan3.getKylalisteArv() + " külalist.");

        JaatiseKiosk restoraan4 = new JaatiseKiosk();
        restoraan4.setRestoraaniNimi("Jäätise Kiosk");
        restoraan4.teenindatudKylalisedPaevas(90);
        System.out.println(restoraan4.avaRestoraan());
        restoraan4.lisaJaatiseValik("Mango");
        restoraan4.lisaJaatiseValik("Maasika");
        System.out.println("Tere tulemast " + restoraan4.getRestoraaniNimi() + " restoraani! " + "Meil on täna menüüs: " + restoraan4.jaatiseValik() + " Täna on meil " + restoraan4.getKylalisteArv() + " külalist.");
        restoraan4.teenindatudKylalisedPaevas(90);
        System.out.println(" Täna on meil nüüd " + restoraan4.getKylalisteArv() + " külalist.");


    }

     */
}
