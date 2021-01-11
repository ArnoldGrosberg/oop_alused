/*
 * Ül 6.3a
 * */

import java.sql.SQLOutput;

public class test {
    public static void main(String[] args) {
        int[] numbrid = new int[10];
        numbrid[0] = 1;
        numbrid[1] = 2;
        numbrid[2] = 3;
        numbrid[3] = 4;
        numbrid[4] = 5;

        System.out.println(numbrid.length);
        System.out.println(numbrid[0]);
        System.out.println(numbrid[1]);
        System.out.println(numbrid[2]);
        System.out.println(numbrid[3]);
        System.out.println(numbrid[4]);


    }


}

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
