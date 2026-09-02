import java.util.Scanner;

public class tugas1_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        double gajiPokok;
        int jumlahAnak;
        double tunjanganPerAnak = 100000;   // Rp100.000 per anak
        double persenPensiun = 0.10;        // potongan dana pensiun 10%
        double totalTunjangan;
        double potonganPensiun;
        double gajiBersih;

        // Input
        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = input.nextDouble();

        System.out.print("Masukkan jumlah anak: ");
        jumlahAnak = input.nextInt();

        // Proses
        totalTunjangan = jumlahAnak * tunjanganPerAnak;
        potonganPensiun = persenPensiun * gajiPokok;
        gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;

        // Output
        System.out.println("Total tunjangan anak : Rp" + totalTunjangan);
        System.out.println("Potongan pensiun     : Rp" + potonganPensiun);
        System.out.println("Gaji bersih Pak Danur: Rp" + gajiBersih);

        input.close();
    }
}


// Tidak Menggunakan Scanner

// public class tugas1_23 {
//     public static void main(String[] args) {
//         // Deklarasi & Inisialisasi Statis
//         double gajiPokok = 5000000;
//         int jumlahAnak = 4;
//         double tunjanganPerAnak = 100000;
//         double persenPensiun = 0.10;

//         // Proses
//         double totalTunjangan = jumlahAnak * tunjanganPerAnak;
//         double potonganPensiun = persenPensiun * gajiPokok;
//         double gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;

//         // Output
//         System.out.println("Gaji Pokok            : Rp" + gajiPokok);
//         System.out.println("Jumlah Anak           : " + jumlahAnak);
//         System.out.println("Total Tunjangan Anak  : Rp" + totalTunjangan);
//         System.out.println("Potongan Pensiun (10%): Rp" + potonganPensiun);
//         System.out.println("Gaji Bersih Pak Danur : Rp" + gajiBersih);
//     }
// }