/*
 * massiivid
 * ülesanne 5.4c Tahvlijuurde
 * */

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sisesnd = new Scanner(System.in);
        // massiiv faili sisu hoidmisekskont
        ArrayList<String> opilased = new ArrayList<>();
        // määrame fail ja kontrollime, kas on võiamlik lugeda andmed
        File fail = new File("C:\\Users\\arnold\\IdeaProjects\\oop_alused\\src\\nimekiri.txt");
        Scanner sisendFailist = null;
        try {
            sisendFailist = new Scanner(fail);
        } catch (Exception e) {
            System.out.println("Faili pole - " + e.getMessage());
        }
        // loeme failist
        while (sisendFailist.hasNextLine()) {
            String rida = sisendFailist.nextLine();
            opilased.add(rida); // lisame loetud väärtus nimekirja sisse
        }
        sisendFailist.close();
        // loome tänase kuupäeva
        LocalDateTime tänaneKuupäev = LocalDateTime.now();
        System.out.println("Tänane kuupäev ilma vorminduseta " + tänaneKuupäev);
        DateTimeFormatter kuupäevaVormindus = DateTimeFormatter.ofPattern("dd");
        String tänaneKuupäevVormindatud = tänaneKuupäev.format(kuupäevaVormindus);
        System.out.println("Tänane vormindatud kuupäev " + tänaneKuupäevVormindatud);
        /*// vaatame nimekirja sisu
        for (int i = 0; i < opilased.size(); i++) {
            System.out.println(i + " " + opilased.get(i));*/

        // otsime vajalik inimene nimekirjast
        int indeks = Integer.parseInt(tänaneKuupäevVormindatud);
        System.out.println(opilased.get(indeks - 1));

    }
    }

