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
        ArrayList<String> aastad = new ArrayList<>();
        // määrame fail ja kontrollime, kas on võiamlik lugeda andmed
        File fail = new File("C:\\Users\\anna\\IdeaProjects\\oop_alused\\src\\vastuvoetud.txt");
        Scanner sisendFailist = null;
        try {
            sisendFailist = new Scanner(fail);
        } catch (Exception e) {
            System.out.println("Faili pole - " + e.getMessage());
        }
        // loeme failist
        while (sisendFailist.hasNextLine()) {
            String rida = sisendFailist.nextLine();
            aastad.add(rida); // lisame loetud väärtus nimekirja sisse
        }
        sisendFailist.close();
        // vaatame nimekirja sisu
        for (int i = 0; i < aastad.size(); i++) {
            System.out.println(aastad.get(i));
        }
        // küsime andmed kasutaja käest
        Scanner sisendKasutajalt = new Scanner(System.in);
        System.out.println("Sisesta aasta: ");
        int aasta = sisendKasutajalt.nextInt();
        sisendKasutajalt.close();
        System.out.println("2011 aastas vastu võetud " + aastad.get(aasta - 2011));
    }
}