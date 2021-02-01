public class Inimene {
    private static int kasutatudJk;
    private int jk = 0;
    private int id;

    public Inimene() {
        this.id = kasutatudJk;
        this.jk = this.id;
        this.id = ++kasutatudJk;
    }

}
