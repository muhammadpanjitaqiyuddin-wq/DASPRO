import java.util.Scanner;

public class Latihan2_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jamKerja;
        double gajiHarian, bonus;

        for (int pegawai = 1; ; pegawai++) {

            System.out.print("Masukkan jumlah jam kerja: ");
            jamKerja = sc.nextInt();

            if (jamKerja < 0) {
                System.out.println("Program berhenti.");
                break;
            }

            System.out.print("Masukkan gaji harian: ");
            gajiHarian = sc.nextDouble();

            if (jamKerja > 8) {
                bonus = gajiHarian * 20 / 100;
            } else {
                bonus = 0;
            }

            System.out.println("Jam kerja   : " + jamKerja);
            System.out.println("Gaji harian : Rp. " + gajiHarian);
            System.out.println("Bonus       : Rp. " + bonus);
        }

        sc.close();
    }
}