public class Opetaja {
    private String nimi;

    public Opetaja(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    public void opetab(Opilane nimi, String teema) {
        nimi.opib(teema);
    }
}
