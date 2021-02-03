public class Inimene {
    private static int kasutatudJk = 0;
    private int jk = 0;
    private int id;

    public Inimene() {
        this.id = Inimene.kasutatudJk;
        this.jk = this.id;
        this.id = ++Inimene.kasutatudJk;
        System.out.println("ID = " + this.id + " jk = " + this.jk);
    }

}
