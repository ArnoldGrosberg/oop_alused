public class Restoraan {
    private static String restoraaniNimi = "pole";
    private static String soogiTyyp = "pole";

    public static String getRestoraaniNimi() {
        return restoraaniNimi;
    }

    public static void setRestoraaniNimi(String restoraaniNimi) {
        Restoraan.restoraaniNimi = restoraaniNimi;
    }

    public static String getSoogiTyyp() {
        return soogiTyyp;
    }

    public static void setSoogiTyyp(String soogiTyyp) {
        Restoraan.soogiTyyp = soogiTyyp;
    }

    public static String avaRestoraan() {
        return "Restoraan on lahti!";
    }

    @Override
    public String toString() {
        return "Tulid restoraani " + this.restoraaniNimi + " ja menüüs on " + this.soogiTyyp;
    }
}
