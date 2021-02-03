import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Sodur> armee1 = new ArrayList<>();
        ArrayList<Sodur> armee2 = new ArrayList<>();
        for (int kord = 1; kord <= 20; kord++) {
            int armeeNr = (int) Math.round(Math.random() * 2);
            if (armeeNr == 1) {
                armee1.add(new Sodur(armeeNr));
            }
            if (armeeNr == 2) {
                armee2.add(new Sodur(armeeNr));
            }
        }

        for (Sodur sodur : armee1) {
            sodur.info();
        }
        for (Sodur sodur : armee2) {
            sodur.info();
        }
        //armee1.add(new Sodur(1));
        //armee1.add(new Sodur(2));
        //armee2.add(sodur2);
        //System.out.println(armee1);
        //System.out.println(armee2);
        //Sodur sodur1 = new Sodur(1);
        //Sodur sodur2 = new Sodur(2);
        //Sodur sodur3 = new Sodur(1);
        //Sodur sodur4 = new Sodur(2);
        //Sodur1.info();
        //Sodur2.info();
        //Sodur3.info();
        //Sodur4.info();

    }
}