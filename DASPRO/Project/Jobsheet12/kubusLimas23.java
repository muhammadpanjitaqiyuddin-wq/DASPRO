import java.util.Scanner;

public class kubusLimas23 {
    static int luasPersegi(int s) {
        return s * s;
    }

    static int volumeKubus(int s) {
        return s * s * s;
    }

    static int luasPermukaanKubus(int s) {
        return 6 * luasPersegi(s);
    }

    static double volumeLimasPersegi(int s, int t) {
        return (luasPersegi(s) * (double) t) / 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU KUBUS & LIMAS PERSEGI ===");
            System.out.println("1. Luas Persegi");
            System.out.println("2. Volume Kubus");
            System.out.println("3. Luas Permukaan Kubus");
            System.out.println("4. Volume Limas Persegi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            int s, t;
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan sisi (s): ");
                    s = sc.nextInt();
                    System.out.println("Luas Persegi = " + luasPersegi(s));
                    break;
                case 2:
                    System.out.print("Masukkan sisi (s): ");
                    s = sc.nextInt();
                    System.out.println("Volume Kubus = " + volumeKubus(s));
                    break;
                case 3:
                    System.out.print("Masukkan sisi (s): ");
                    s = sc.nextInt();
                    System.out.println("Luas Permukaan Kubus = " + luasPermukaanKubus(s));
                    break;
                case 4:
                    System.out.print("Masukkan sisi alas (s): ");
                    s = sc.nextInt();
                    System.out.print("Masukkan tinggi (t): ");
                    t = sc.nextInt();
                    System.out.println("Volume Limas Persegi = " + volumeLimasPersegi(s, t));
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}