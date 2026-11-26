// PROGRAM B, SETELAH MODIFIKASI
// jumlah layanan dan jumlah hari dibaca dari input pengguna

import java.util.Scanner;

public class modifikasiRekapLaundry23 {

    static void tampilData(String[] nama, int[][] data, int hari) {
        System.out.println("\n=== TABEL REKAP LAUNDRY ===");

        System.out.printf("%-18s", "Layanan");

        for (int j = 0; j < hari; j++) {
            System.out.printf("%-12s", "Hari ke-" + (j + 1));
        }

        System.out.println();

        for (int i = 0; i < nama.length; i++) {
            System.out.printf("%-18s", nama[i]);

            for (int j = 0; j < hari; j++) {
                System.out.printf("%-12d", data[i][j]);
            }

            System.out.println();
        }
    }

    static int totalPerLayanan(int[][] data, int idxLayanan) {
        int total = 0;

        for (int j = 0; j < data[idxLayanan].length; j++) {
            total += data[idxLayanan][j];
        }

        return total;
    }

    static int hariTersibuk(int[][] data) {
        int indeksTerbesar = 0;
        int totalTerbesar = 0;

        for (int j = 0; j < data[0].length; j++) {
            int total = 0;

            for (int i = 0; i < data.length; i++) {
                total += data[i][j];
            }

            if (total > totalTerbesar) {
                totalTerbesar = total;
                indeksTerbesar = j;
            }
        }

        return indeksTerbesar;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM REKAP LAUNDRY DINAMIS ===");

        System.out.print("Masukkan jumlah layanan: ");
        int n = input.nextInt();

        System.out.print("Masukkan jumlah hari: ");
        int m = input.nextInt();

        if (n <= 0 || m <= 0) {
            System.out.println("Jumlah layanan dan hari harus lebih dari 0.");
            input.close();
            return;
        }

        String[] nama = new String[n];
        int[] harga = new int[n];
        int[][] data = new int[n][m];

        // Input nama dan harga layanan
        for (int i = 0; i < n; i++) {
            input.nextLine();

            System.out.print("\nNama layanan ke-" + (i + 1) + ": ");
            nama[i] = input.nextLine();

            System.out.print("Harga per kg: Rp");
            harga[i] = input.nextInt();
        }

        // Input berat cucian
        System.out.println("\n=== INPUT BERAT CUCIAN ===");

        for (int i = 0; i < n; i++) {
            System.out.println("\nLayanan: " + nama[i]);

            for (int j = 0; j < m; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                data[i][j] = input.nextInt();
            }
        }

        tampilData(nama, data, m);

        System.out.println("\n=== TOTAL BERAT PER LAYANAN ===");

        int indeksTerbesar = 0;
        double totalPendapatan = 0;

        for (int i = 0; i < n; i++) {

            int totalBerat = totalPerLayanan(data, i);

            double pendapatan = (double) totalBerat * harga[i];

            System.out.println(nama[i] + " : "
                    + totalBerat + " kg");

            System.out.println("Pendapatan: Rp" + pendapatan);

            totalPendapatan += pendapatan;

            if (totalBerat
                    > totalPerLayanan(data, indeksTerbesar)) {
                indeksTerbesar = i;
            }
        }

        System.out.println("\n=== HASIL AKHIR ===");

        System.out.println("Layanan terlaris: "
                + nama[indeksTerbesar]);

        System.out.println("Total berat tertinggi: "
                + totalPerLayanan(data, indeksTerbesar) + " kg");

        int hari = hariTersibuk(data);

        System.out.println("Hari tersibuk: Hari ke-" + (hari + 1));

        System.out.println("Total pendapatan: Rp" + totalPendapatan);

    }
}
