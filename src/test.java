/*
 * massiivid
 * ülesanne 5.1
 * */

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // massiiv faili sisu hoidmiseks
        ArrayList<Double> kontosisu = new ArrayList<>();
        // määrame fail ja kontrollime, kas on võiamlik lugeda andmed
        File fail = new File("C:\\Users\\arnold\\IdeaProjects\\oop_alused\\src\\konto.txt");
        Scanner sisendFailist = null;
        try {
            sisendFailist = new Scanner(fail);
        } catch (Exception e) {
            System.out.println("Faili pole - " + e.getMessage());
        }
        // loeme failist
        while (sisendFailist.hasNextLine()) {
            Double rida = sisendFailist.nextDouble();
            kontosisu.add(rida); // lisame loetud väärtus nimekirja sisse
        }
        sisendFailist.close();
        // vaatame nimekirja sisu positiivsete arvutega
        for (int i = 0; i < kontosisu.size(); i++) {
            if (kontosisu.get(i) > 0) {
                System.out.println(kontosisu.get(i));

            }
        }
    }
}