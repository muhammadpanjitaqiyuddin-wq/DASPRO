import java.util.Scanner;

public class Latihan2_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diskon = 0;

        System.out.print("Masukan Hari membeli buku (contoh: senin) : ");
        String hari = sc.nextLine();

        System.out.print("Jenis Buku:\n1. Kamus\n2. Novel\nMasukkan jenis buku yang dibeli (contoh: novel) : ");
        String jenisBuku = sc.nextLine();

        System.out.print("Jumlah buku yang dibeli: ");
        int jumlahBuku = sc.nextInt();

        jenisBuku = jenisBuku.toLowerCase();
        hari = hari.toLowerCase();

        if (hari.equals("rabu")) {
            if (jenisBuku.equals("kamus")) {
                diskon = 10;
                if (jumlahBuku > 2) {
                    diskon += 2;
                }
            } else if (jenisBuku.equals("novel")) {
                diskon = 7;
                if (jumlahBuku > 3) {
                    diskon += 2;
                } else if (jumlahBuku <= 3) {
                    diskon += 1;
                }
            } else {
                if (jumlahBuku > 3) {
                    diskon = 5;
                } else {
                    System.out.println("Kamu tidak mendapatkan diskon jika pembelian bukan kamus atau novel dan kurang dari 4");
                    return;
                }
            }

        } else {
            System.out.println("Anda tidak mendapatkan diskon karena tidak membeli di hari rabu");
            return;
        }

        System.out.println("Diskon yang kamu dapatkan adalah " + diskon + "%");
    }
}