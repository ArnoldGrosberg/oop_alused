import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Vajutage Enter klahv");
        Scanner readinput = new Scanner(System.in);
        String enterkey = readinput.nextLine();
        System.out.print(enterkey);
        if (enterkey.equals("")) {
            ArrayList<Sodur> armee1 = new ArrayList<>();
            ArrayList<Sodur> armee2 = new ArrayList<>();
            ArrayList<Ulem> armee1U = new ArrayList<>();
            ArrayList<Ulem> armee2U = new ArrayList<>();
            for (int kord = 1; kord <= 20; kord++) {
                int armeeNr = (int) Math.round(Math.random() * 2);
                if (armeeNr == 1) {
                    armee1.add(new Sodur(armeeNr));
                    armee1U.add(new Ulem());
                }
                if (armeeNr == 2) {
                    armee2.add(new Sodur(armeeNr));
                    armee2U.add(new Ulem());
                }
            }

        /*for (Sodur sodur : armee1) {
            sodur.info();
        }
        for (Sodur sodur : armee2) {
            sodur.info();
        }*/
            for (Ulem ulem : armee1U) {
                ulem.info();
            }
            for (Ulem ulem : armee2U) {
                ulem.info();
            }
            System.out.println("==============tostaTase================");
            for (Ulem ulem : armee2U) {
                ulem.tostaTase();
            }
            for (Ulem ulem : armee1U) {
                ulem.tostaTase();
            }
            for (Ulem ulem : armee1U) {
                ulem.info();
            }
            for (Ulem ulem : armee2U) {
                ulem.info();
            }
            System.out.println("==============Armee pikkem siis tostaTase===============");
            if (armee1.size() > armee2.size()) {
                for (Ulem ulem : armee1U) {
                    ulem.tostaTase();
                }
            } else {
                for (Ulem ulem : armee2U) {
                    ulem.tostaTase();
                }
            }

            for (Ulem ulem : armee1U) {
                ulem.info();
            }
            for (Ulem ulem : armee2U) {
                ulem.info();
            }
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
