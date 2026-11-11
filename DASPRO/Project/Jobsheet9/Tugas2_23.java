import java.util.Scanner;

public class Tugas2_23 {

    // linear search: balikin indeks menu, atau -1 kalau tidak ada
    static int cariMenu(String[] menu, String yangDicari) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(yangDicari.trim())) {
                return i;
            }
        }
        return -1;
    }

    static String rupiah(int angka) {
        return "Rp" + String.format("%,d", angka).replace(',', '.');
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("===== KAFE KAMPUS =====");
        System.out.println("Daftar menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - " + rupiah(harga[i]));
        }

        // fitur pencarian menu
        String lagi = "y";
        while (lagi.equalsIgnoreCase("y")) {
            System.out.print("\nCari menu: ");
            String cari = input.nextLine();
            int idx = cariMenu(menu, cari);

            if (idx != -1) {
                System.out.println(menu[idx] + " tersedia, harganya " + rupiah(harga[idx]));
            } else {
                System.out.println("Maaf, menu \"" + cari + "\" tidak tersedia.");
            }

            System.out.print("Cari menu lain? (y/t): ");
            lagi = input.nextLine();
        }

        // fitur pemesanan
        int jumlahPesanan;
        while (true) {
            System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
            try {
                jumlahPesanan = Integer.parseInt(input.nextLine().trim());
                if (jumlahPesanan > 0) break;
            } catch (NumberFormatException e) {
                // abaikan, nanti diulang
            }
            System.out.println("Jumlah tidak valid, coba lagi.");
        }

        String[] pesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];
        int total = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            int idx;
            do {
                System.out.print("Pesanan ke-" + (i + 1) + " (nama menu): ");
                String nama = input.nextLine();
                idx = cariMenu(menu, nama);
                if (idx == -1) {
                    System.out.println("Menu tidak ada di daftar, silakan masukkan lagi.");
                }
            } while (idx == -1);

            pesanan[i] = menu[idx];
            hargaPesanan[i] = harga[idx];
            total += harga[idx];
        }

        // tampilkan daftar pesanan
        System.out.println("\n========== DAFTAR PESANAN ==========");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.printf("%d. %-16s %12s%n", (i + 1), pesanan[i], rupiah(hargaPesanan[i]));
        }
        System.out.println("------------------------------------");
        System.out.printf("   %-16s %12s%n", "TOTAL", rupiah(total));
        System.out.println("====================================");
    }
}
