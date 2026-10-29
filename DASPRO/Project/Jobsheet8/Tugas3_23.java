import java.util.Scanner;

public class Tugas3_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int totalSemua = 0;
            int barangTertinggi = -1;
            int tokoTerbanyak = 0;
            String[] ringkasan = new String[jumlahToko];

            for (int t = 1; t <= jumlahToko; t++) {
                int jumlahPelanggan;
                do {
                    System.out.print("Toko " + t + " - jumlah pelanggan: ");
                    jumlahPelanggan = sc.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.println("Tidak boleh negatif. Ulangi input!");
                    }
                } while (jumlahPelanggan < 0);

                int totalBarangToko = 0;
                for (int p = 1; p <= jumlahPelanggan; p++) {
                    int barang;
                    do {
                        System.out.print("  Pelanggan " + p + " - jumlah barang: ");
                        barang = sc.nextInt();
                        if (barang < 0) {
                            System.out.println("  Tidak boleh negatif. Ulangi input!");
                        }
                    } while (barang < 0);
                    totalBarangToko += barang;
                }

                ringkasan[t - 1] = "Toko " + t + " - pelanggan: " + jumlahPelanggan
                        + ", total barang: " + totalBarangToko;
                totalSemua += totalBarangToko;

                if (totalBarangToko > barangTertinggi) {
                    barangTertinggi = totalBarangToko;
                    tokoTerbanyak = t;
                }
            }

            System.out.println();
            for (int t = 0; t < jumlahToko; t++) {
                System.out.println(ringkasan[t]);
            }
            System.out.println("Total barang seluruh toko: " + totalSemua);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        sc.close();
    }
}