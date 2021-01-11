/*
 * Ül 5.1
 * */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] vastuvoetud = {2803, 2626, 2359, 1927, 2236, 2281, 2394, 2484, 2468};
        Scanner sisend = new Scanner(System.in);
        System.out.println("Sisesta aasta: ");
        int aasta = sisend.nextInt();
        int massiiviIndeks = aasta - 2011;
        System.out.println("Vastuvõetud on " + vastuvoetud[massiiviIndeks]);

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
