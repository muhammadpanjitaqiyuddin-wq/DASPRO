import java.util.Scanner;

public class RekapLaundry23{

    static Scanner input = new Scanner(System.in);

    static String[] namaLayanan = {
        "Cuci Kering",
        "Cuci Setrika",
        "Setrika Saja",
        "Express"
    };

    static String[] namaHari = {
        "Senin", "Selasa", "Rabu",
        "Kamis", "Jumat", "Sabtu"
    };

    static int[] harga = {6000, 8000, 5000, 12000};

    static int[][] inputData() {
        int[][] data = new int[4][6];

        System.out.println("=== INPUT BERAT CUCIAN ===");

        for (int i = 0; i < 4; i++) {
            System.out.println("\nLayanan: " + namaLayanan[i]);

            for (int j = 0; j < 6; j++) {
                System.out.print("Berat hari " + namaHari[j] + ": ");
                data[i][j] = input.nextInt();
            }
        }

        return data;
    }

    static void tampilData(int[][] data) {
        System.out.println("\n=== TABEL REKAP LAUNDRY ===");

        System.out.printf("%-18s", "Layanan");

        for (int j = 0; j < 6; j++) {
            System.out.printf("%-9s", namaHari[j]);
        }

        System.out.println();

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-18s", namaLayanan[i]);

            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%-9d", data[i][j]);
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

    static void layananTerbesar(int[][] data) {
        int indeksTerbesar = 0;

        for (int i = 1; i < data.length; i++) {
            if (totalPerLayanan(data, i)
                    > totalPerLayanan(data, indeksTerbesar)) {
                indeksTerbesar = i;
            }
        }

        System.out.println("\n=== LAYANAN TERBESAR ===");
        System.out.println("Nama layanan: " + namaLayanan[indeksTerbesar]);
        System.out.println("Total berat: "
                + totalPerLayanan(data, indeksTerbesar) + " kg");
    }

    static int hariTersibuk(int[][] data) {
        int indeksHari = 0;
        int totalTerbesar = 0;

        for (int j = 0; j < data[0].length; j++) {
            int total = 0;

            for (int i = 0; i < data.length; i++) {
                total += data[i][j];
            }

            if (total > totalTerbesar) {
                totalTerbesar = total;
                indeksHari = j;
            }
        }

        return indeksHari;
    }

    static void hitungPendapatan(int[][] data) {
        double totalPendapatan = 0;

        System.out.println("\n=== PENDAPATAN LAUNDRY ===");

        for (int i = 0; i < data.length; i++) {
            int totalBerat = totalPerLayanan(data, i);

            double pendapatan = (double) totalBerat * harga[i];

            System.out.println(namaLayanan[i]);
            System.out.println("Total berat: " + totalBerat + " kg");
            System.out.println("Pendapatan: Rp" + pendapatan);

            totalPendapatan += pendapatan;
        }

        System.out.println("\nTotal seluruh pendapatan: Rp"
                + totalPendapatan);
    }

    public static void main(String[] args) {

        int[][] data = inputData();

        tampilData(data);

        System.out.println("\n=== TOTAL BERAT PER LAYANAN ===");

        for (int i = 0; i < data.length; i++) {
            System.out.println(namaLayanan[i] + " : "
                    + totalPerLayanan(data, i) + " kg");
        }

        layananTerbesar(data);

        int hari = hariTersibuk(data);

        System.out.println("\nHari tersibuk: " + namaHari[hari]);

        hitungPendapatan(data);

    }
}
