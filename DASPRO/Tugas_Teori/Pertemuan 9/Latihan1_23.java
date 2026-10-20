import java.util.Scanner;

public class Latihan1_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jamBelajar;
        int totalJam = 0;

        for (int hari = 1; hari <= 7; hari++) {
            System.out.println("Hari ke-" + hari);

            System.out.print("Masukkan jam belajar: ");
            jamBelajar = sc.nextInt();

            if (jamBelajar < 0 || jamBelajar > 10) {
                System.out.println("Input tidak valid!");
                System.out.println("Masukkan ulang maksimal 10 jam.");

                hari--;
                continue;
            }

            totalJam += jamBelajar;
        }

        System.out.println("");
        System.out.println("Total jam belajar selama seminggu: "
                + totalJam + " jam");

        sc.close();
    }
}