public class Sodur extends Inimene {
    private int armeeNr;

    public Sodur(int armeeNr) {
        this.armeeNr = armeeNr;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Armee nr = " + this.armeeNr);
    }
}