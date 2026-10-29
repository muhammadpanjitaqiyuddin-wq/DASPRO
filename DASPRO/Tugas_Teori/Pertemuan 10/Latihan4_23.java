import java.util.Scanner;

public class Latihan4_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahProduk, jumlahHari;
        int totalSemua = 0;

        do {
            System.out.print("Masukkan jumlah produk: ");
            jumlahProduk = input.nextInt();

            if (jumlahProduk < 1) {
                System.out.println("Jumlah produk minimal 1!");
            }
        } while (jumlahProduk < 1);

        do {
            System.out.print("Masukkan jumlah hari: ");
            jumlahHari = input.nextInt();

            if (jumlahHari < 1) {
                System.out.println("Jumlah hari minimal 1!");
            }
        } while (jumlahHari < 1);

        int p = 1;

        while (p <= jumlahProduk) {
            int totalProduk = 0;

            System.out.println("\nProduk ke-" + p);

            for (int h = 1; h <= jumlahHari; h++) {
                int terjual;

                do {
                    System.out.print(
                        "Penjualan hari ke-" + h + ": "
                    );
                    terjual = input.nextInt();

                    if (terjual < 0) {
                        System.out.println(
                            "Penjualan tidak boleh negatif!"
                        );
                    }
                } while (terjual < 0);

                totalProduk += terjual;
            }

            double rataRata = (double) totalProduk / jumlahHari;

            System.out.println("Total produk ke-" + p
                    + " = " + totalProduk);
            System.out.println("Rata-rata harian = " + rataRata);

            totalSemua += totalProduk;
            p++;
        }

        System.out.println("\nTotal seluruh produk = " + totalSemua);

    }
}