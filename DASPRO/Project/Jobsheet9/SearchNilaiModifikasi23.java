import java.util.Scanner;

public class SearchNilaiModifikasi23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Soal 2: banyak elemen, isi array, dan key dari user
        System.out.print("Masukkan banyaknya elemen array: ");
        int n = input.nextInt();
        int[] nilai = new int[n];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = input.nextInt();
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }

        // Soal 3: pesan tidak ditemukan yang lebih informatif
        if (!ditemukan) {
            System.out.println("Nilai yang dicari tidak ditemukan: " + key
                    + " tidak ada di dalam array yang berisi " + nilai.length + " elemen.");
        }
    }
}
