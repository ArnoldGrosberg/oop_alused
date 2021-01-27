/*
 * Ristkülik kapseldus
 *
 */
public class Test {
    public static void main(String[] args) {
        Inimene matti = new Inimene("Matti");
        Inimene john = new Inimene("John");

        matti.setPikkus(180);
        matti.setMass(86);

        john.setPikkus(175);
        john.setMass(64);

        System.out.println(matti.getNimi() + ", kehamassiindeks: " + matti.kmi());
        System.out.println(john.getNimi() + ", kehamassiindeks: " + john.kmi());
    }
}