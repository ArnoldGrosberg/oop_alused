public class Test_22_01_ul2 {
    public static void main(String[] args) {
        KahanevLoendur loendur = new KahanevLoendur(100);

        loendur.valjastaVaartus();

        loendur.kahane();
        loendur.valjastaVaartus();

        loendur.kahane();
        loendur.valjastaVaartus();

        loendur.reset();
        loendur.valjastaVaartus();

        loendur.algvaartusta();
        loendur.valjastaVaartus();
    }
}