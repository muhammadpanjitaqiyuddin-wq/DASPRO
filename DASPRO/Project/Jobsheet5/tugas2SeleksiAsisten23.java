import java.util.Scanner;

public class tugas2SeleksiAsisten23 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEM SELEKSI CALON ASISTEN PRAKTIKUM ===");

        System.out.print("Apakah mahasiswa berstatus aktif? (true/false): ");
        boolean statusAktif = sc.nextBoolean();

        System.out.print("Apakah mahasiswa sedang mendapatkan sanksi akademik? (true/false): ");
        boolean sanksiAkademik = sc.nextBoolean();

        if (statusAktif && !sanksiAkademik) {

            System.out.println("\nTahap 1: Lolos syarat status mahasiswa.");

            System.out.print("Masukkan nilai Dasar Pemrograman: ");
            double nilaiDasarPemrograman = sc.nextDouble();

            System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
            boolean sertifikat = sc.nextBoolean();

            if (nilaiDasarPemrograman >= 80 || sertifikat) {

                System.out.println("Tahap 2: Lolos syarat kompetensi pemrograman.");

                System.out.print("Masukkan nilai wawancara: ");
                double nilaiWawancara = sc.nextDouble();

                if (nilaiWawancara >= 75) {
                    System.out.println("\n=== HASIL SELEKSI ===");
                    System.out.println("Mahasiswa DITERIMA sebagai asisten praktikum.");
                } else {
                    System.out.println("\n=== HASIL SELEKSI ===");
                    System.out.println("Mahasiswa GAGAL pada tahap wawancara.");
                    System.out.println("Alasan: Nilai wawancara kurang dari 75.");
                }

            } else {
                System.out.println("\n=== HASIL SELEKSI ===");
                System.out.println("Mahasiswa GAGAL pada tahap kompetensi pemrograman.");
                System.out.println("Alasan: Nilai Dasar Pemrograman kurang dari 80 "
                        + "dan tidak memiliki sertifikat kompetensi pemrograman.");
            }

        } else {
            System.out.println("\n=== HASIL SELEKSI ===");
            System.out.println("Mahasiswa GAGAL pada tahap status mahasiswa.");

            if (!statusAktif && sanksiAkademik) {
                System.out.println("Alasan: Mahasiswa tidak berstatus aktif "
                        + "dan sedang mendapatkan sanksi akademik.");
            } else if (!statusAktif) {
                System.out.println("Alasan: Mahasiswa tidak berstatus aktif.");
            } else {
                System.out.println("Alasan: Mahasiswa sedang mendapatkan sanksi akademik.");
            }
        }

        sc.close();
    }
}