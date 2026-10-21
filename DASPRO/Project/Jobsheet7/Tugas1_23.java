import java.util.Scanner;

public class Tugas1_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int tiket, totalTiket = 0;
        double totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            tiket = sc.nextInt();

            if (tiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan ulang!");
                continue;
            }

            if (tiket == 0) {
                break;
            }

            int subtotal = tiket * hargaTiket;
            double diskon = 0;

            if (tiket >= 10) {
                diskon = 0.15;
            } else if (tiket >= 4) {
                diskon = 0.10;
            }

            double totalBayar = subtotal - (subtotal * diskon);

            totalTiket += tiket;
            totalPenjualan += totalBayar;

            System.out.println("Subtotal    : Rp " + subtotal);
            System.out.println("Diskon      : " + (diskon * 100) + "%");
            System.out.println("Total bayar : Rp " + totalBayar);
            System.out.println();
        }

        System.out.println("===== RINGKASAN PENJUALAN =====");
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total penjualan     : Rp " + totalPenjualan);

        sc.close();
    }
}