public class Ulem extends Inimene {
    private int tase = 1;

    public int getTase() {
        return tase;
    }

    public void setTase(int tase) {
        this.tase = tase;
    }

    public void tostaTase() {
        this.tase++;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Ülema tase = " + getTase());
    }
}