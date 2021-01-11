/*
 * Ül 5.1
 * */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class test {
    public static void main(String[] args) {
        try {
            System.out.println("Katsetamine failist lugemine.");
            File fail = new File("C:\\Users\\arnold\\IdeaProjects\\oop_alused\\src\\vastuvoetud.txt");
            Scanner sisendFailist = new Scanner(fail);
            while (sisendFailist.hasNextLine()) {
                String data = sisendFailist.nextLine();
                System.out.println(data);
            }
            sisendFailist.close();
        } catch (FileNotFoundException e) {
            System.out.println("Faili pole.");
            e.printStackTrace();
        }
    }
}

/*
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
*/
/*
import java.util.Scanner;

public class test {
    // meetod
    static String tervitus(int kord) {
        String kordStr = Integer.toString(kord);
        kordStr = ("Võõrustaja: \"Tere!\"\n" +
                "Täna " + kordStr + ". kord tervitada, mõtiskleb võõrustaja.\n" +
                "Külaline: \"Tere, suur tänu kutse eest!\"");
        return kordStr;
    }

    //main meetod
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        // defineerime muutujad
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisestage külaliste arv: ");
        //lubame kasutajale sisestada midagi
        int külaliste_arv = sisend.nextInt();
        // salvestame kasutaja sisestatud väärtus
        // väljastamine
        int kord = 1;
        while (külaliste_arv >= kord && külaliste_arv < 4) {
            System.out.println(tervitus(kord));
            kord++;
        }
        while (3 >= kord & külaliste_arv > 4) {
            System.out.println(tervitus(kord));
            kord++;
        }


    }
}
*/
