/*
 * massiivid
 * ülesanne 5.4a Jukebox
 * */
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sisesnd = new Scanner(System.in);
        System.out.println("Palun sisestage failinimi: ");
        String koht = sisesnd.nextLine();
        // massiiv faili sisu hoidmisekskont
        ArrayList<String> kontosisu = new ArrayList<>();
        // määrame fail ja kontrollime, kas on võiamlik lugeda andmed
        File fail = new File("C:\\Users\\arnold\\IdeaProjects\\oop_alused\\src\\" + koht);
        Scanner sisendFailist = null;
        try {
            sisendFailist = new Scanner(fail);
        } catch (Exception e) {
            System.out.println("Faili pole - " + e.getMessage());
        }
        // loeme failist
        while (sisendFailist.hasNextLine()) {
            String rida = sisendFailist.nextLine();
            kontosisu.add(rida); // lisame loetud väärtus nimekirja sisse
        }
        System.out.println("Muusikapalade valik:");
        int loop = 0;
        while (loop < kontosisu.size()) {
            System.out.println((loop + 1) + ". " + kontosisu.get(loop));
            loop++;
        }
        System.out.println("Valige laulu järjekorranumber: ");
        int number = sisesnd.nextInt();
        System.out.println("Mängitav muusikapala on " + kontosisu.get(number - 1));
        sisendFailist.close();
    }
    }

