public class Test {
    public static void main(String[] args) {
        Restoraan restoraan = new Restoraan();
        restoraan.setRestoraaniNimi("Burgeri");
        System.out.println(restoraan.avaRestoraan());
        System.out.println("Tere tulemast " + restoraan.getRestoraaniNimi() + " restoraani! " + "Meil on täna menüüs: " + restoraan.getSoogiTyyp());
        Restoraan restoraan2 = new Restoraan();
        restoraan.setRestoraaniNimi("Burgeri2");
        System.out.println(restoraan.avaRestoraan());
        System.out.println("Tere tulemast " + restoraan.getRestoraaniNimi() + " restoraani! " + "Meil on täna menüüs: " + restoraan.getSoogiTyyp());
        Restoraan restoraan3 = new Restoraan();
        restoraan.setRestoraaniNimi("Burgeri3");
        System.out.println(restoraan.avaRestoraan());
        System.out.println("Tere tulemast " + restoraan.getRestoraaniNimi() + " restoraani! " + "Meil on täna menüüs: " + restoraan.getSoogiTyyp());
    }
}
