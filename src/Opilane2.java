import java.util.ArrayList;

public class Opilane2 {
    private String nimi;
    private ArrayList<String> teadmised;

    public Opilane2(String nimi) {
        this.nimi = nimi;
        teadmised = new ArrayList<>();
    }

    public void opib(String teema) {
        teadmised.add(teema);
    }

    public void unusta(String teema) {
        for (int i = 0; i < teadmised.size(); i++) {
            String jooksevTeema = teadmised.get(i);
            teadmised.remove(i);
        }
    }
}
/*private void naitaTeadmised() {
    for (String teadmine : teadmised) {
        System.out.println(teadmine);
    }
}
*/