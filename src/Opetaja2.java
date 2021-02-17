public class Opetaja2 {
    private String nimi;

    public Opetaja2(String nimi) {
        this.nimi = nimi;
    }

    public void opetab(Opilane opilane, String teema) {
        opilane.opib(teema);
    }
}
