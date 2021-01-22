import java.util.ArrayList;

public class Menyy {

    private ArrayList<String> soogid;

    public Menyy() {
        this.soogid = new ArrayList<String>();
    }

    public void lisaSook(String sook) {
        if (!soogid.contains(sook)) {
            soogid.add(sook);
        }
    }

    // lisa meetodid siia
}

