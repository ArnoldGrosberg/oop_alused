/*
 * Ristkülik kapseldus
 *
 */
public class Test {
    public static void main(String[] args) {
        Ristkylik r1 = new Ristkylik();
        r1.setKorgus(4.6);
        r1.setLaius(7.2);
        System.out.println(r1);
        System.out.println("==================");
        Ristkylik r2 = new Ristkylik();
        r2.setKorgus(5.0);
        r2.setLaius(9.2);
        System.out.println(r2);
        System.out.println("==================");
        Ristkylik r3 = new Ristkylik();
        r3.setKorgus(2.5);
        r3.setLaius(1.2);
        System.out.println(r3);
        System.out.println("==================");
    }
}