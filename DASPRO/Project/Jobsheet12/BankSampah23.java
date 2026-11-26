import java.util.Scanner;

public class BankSampah23 {

    static Scanner input = new Scanner(System.in);

    static double[] inputSetoran(int n) {
        double[] setoran = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Berat setoran nasabah ke-" + (i + 1) + " (kg): ");
            setoran[i] = input.nextDouble();
        }

        return setoran;
    }

    static void tampilSetoran(double[] setoran) {
        System.out.println("\n=== DATA SETORAN NASABAH ===");

        for (int i = 0; i < setoran.length; i++) {
            System.out.println("Nasabah ke-" + (i + 1)
                    + " : " + setoran[i] + " kg");
        }
    }

    static double totalSetoran(double[] setoran) {
        double total = 0;

        for (int i = 0; i < setoran.length; i++) {
            total += setoran[i];
        }

        return total;
    }

    static double hitungSaldo(double berat, double harga) {
        return berat * harga;
    }

    static int nasabahTerbanyak(double[] setoran) {
        int indeksTerbesar = 0;

        for (int i = 1; i < setoran.length; i++) {
            if (setoran[i] > setoran[indeksTerbesar]) {
                indeksTerbesar = i;
            }
        }

        return indeksTerbesar;
    }

    public static void main(String[] args) {

        System.out.println("=== PROGRAM BANK SAMPAH ===");

        System.out.print("Masukkan jumlah nasabah: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Jumlah nasabah harus lebih dari 0.");
            input.close();
            return;
        }

        double[] setoran = inputSetoran(n);

        tampilSetoran(setoran);

        System.out.println("\n=== SALDO SETIAP NASABAH ===");

        double hargaPerKg = 3000;

        for (int i = 0; i < setoran.length; i++) {
            double saldo = hitungSaldo(setoran[i], hargaPerKg);

            System.out.println("Nasabah ke-" + (i + 1)
                    + " : Rp" + saldo);
        }

        double total = totalSetoran(setoran);

        System.out.println("\nTotal seluruh setoran: "
                + total + " kg");

        System.out.println("Nasabah dengan setoran terbesar: Nasabah ke-"
                + (nasabahTerbanyak(setoran) + 1));

        System.out.println("Berat setoran terbesar: "
                + setoran[nasabahTerbanyak(setoran)] + " kg");

    }
}
