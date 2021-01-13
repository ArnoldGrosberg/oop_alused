/*
 * massiivid
 * ülesanne 6.4b Mündid
 * */

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
public class test {

    public static void main(String[] args) {
        Scanner sisesnd = new Scanner(System.in);
        System.out.println("Palun sisestage failinimi: ");
        String failinimi = sisesnd.nextLine();
        // massiiv faili sisu hoidmisekskont
        ArrayList<Integer> mündid = new ArrayList<>();
        // määrame fail ja kontrollime, kas on võiamlik lugeda andmed
        File fail = new File("C:\\Users\\arnold\\IdeaProjects\\oop_alused\\src\\" + failinimi);
        Scanner sisendFailist = null;
        try {
            sisendFailist = new Scanner(fail);
        } catch (Exception e) {
            System.out.println("Faili pole - " + e.getMessage());
        }
        // loeme failist
        while (sisendFailist.hasNextInt()) {
            int rida = sisendFailist.nextInt();
            mündid.add(rida); // lisame loetud väärtus nimekirja sisse
        }
        sisendFailist.close();
        int summa = pronksikarva_summa(mündid);
        System.out.println(summa);
    }

    // funktsioon(meetod)
    static int pronksikarva_summa(ArrayList mündid) {
        int summa = 0;
        for (int i = 0; i < mündid.size(); i++) {
            if ((int) mündid.get(i) == 1 || (int) mündid.get(i) == 2 || (int) mündid.get(i) == 5) {
                summa += (int) mündid.get(i);
            }
        }
        return summa;
    }
}
