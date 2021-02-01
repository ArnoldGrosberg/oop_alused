public class yl4_omaeesnimi_perenimi {
    private int jk = 0;

    public void Inimene() {
        int id = ++yl4_omaeesnimi_perenimi.this.jk;
        this.jk++;
        this.setJK(id);
        System.out.println(id);
        System.out.println(jk);
    }
}
