/*
 * Ül 6.3
 * */
import java.util.Scanner;

public class test {
    // meetod
    static double eelarve(double kulalistearv) {
        double number = (55 + kulalistearv * 10);
        return number;
    }

    //main meetod
    public static void main(String[] args) {
        // defineerime muutujad
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Mitu inimest on kutsutud? ");
        //lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // salvestame kasutaja sisestatud väärtus
        double kutsutud = sisend.nextDouble();
        System.out.println("Mitu inimest tuleb? ");
        //lubame kasutajale sisestada midagi
        sisend = new Scanner(System.in);
        // salvestame kasutaja sisestatud väärtus
        double kulalistearv = sisend.nextDouble();
        // arvutamine meetotiga
        System.out.println("Max: " + eelarve(kutsutud) + "€");
        System.out.println("Min: " + eelarve(kulalistearv) + "€");
    }
}