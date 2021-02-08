import java.sql.SQLOutput;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Tuba tuba = new Tuba();
        tuba.setPikkus(6.0);
        tuba.setLaius(3.0);
        tuba.setKõrgus(2.7);
        System.out.println(tuba.getPindala());
        tuba.lisaAkkenUks(1.0, 1.0);
        tuba.lisaAkkenUks(1.0, 1.0);
        tuba.lisaAkkenUks(1.0, 1.0);
        System.out.println(tuba.tööPind());
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
