public class Test_22_01 {
    public static void main(String[] args) {
        KahanevLoendur loendur = new KahanevLoendur(10);

        loendur.valjastaVaartus();

        loendur.kahane();
        loendur.valjastaVaartus();

        loendur.kahane();
        loendur.valjastaVaartus();
    }


    /*
    public static void main(String[] args) {
        Toode banaan = new Toode("Banaan", 1.1, 13);
        banaan.valjastaToode();
    }
    */
}
