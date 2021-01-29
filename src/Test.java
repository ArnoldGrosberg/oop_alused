/*
 * Ristkülik kapseldus
 *
 */
public class Test {
    public static void main(String[] args) {
        Inimene matti = new Inimene("Matti");
        Inimene john = new Inimene("John");

        matti.setPikkus(1.80);
        matti.setMass(69.0);
        System.out.println(matti.getNimi() + " on " + matti.getPikkus() + "m pikk ja kaalub " + matti.getMass() + " kg");
        System.out.println("kmi = " + matti.kmi());
        System.out.printf("kmi = %.2f\n", matti.kmi());

        matti.suurendakaal();
        System.out.println(matti.getNimi() + " on " + matti.getPikkus() + "m pikk ja kaalub " + matti.getMass() + " kg");
        System.out.printf("kmi = %.2f\n", matti.kmi());

        matti.suurendakaal(5.0);
        System.out.println(matti.getNimi() + " on " + matti.getPikkus() + "m pikk ja kaalub " + matti.getMass() + " kg");
        System.out.printf("kmi = %.2f\n", matti.kmi());

        matti.suurendakaal(Math.random() * 100);
        System.out.println(matti.getNimi() + " on " + matti.getPikkus() + "m pikk ja kaalub " + matti.getMass() + " kg");
        System.out.printf("kmi = %.2f\n", matti.kmi());

        matti.normaalkaal();

        System.out.println(matti.getNimi() + " on " + matti.getPikkus() + "m pikk ja kaalub " + matti.getMass() + " kg");
        System.out.printf("kmi = %.2f\n", matti.kmi());


        john.setPikkus(175);
        john.setMass(64);

        System.out.printf(matti.getNimi() + ", kehamassiindeks: " + "%5.2f%n", matti.kmi());
        System.out.printf(john.getNimi() + ", kehamassiindeks: " + "%5.2f%n", john.kmi());
    }
}