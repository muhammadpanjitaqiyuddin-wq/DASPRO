// public class hitungTotalHarga23 {
//     public static void Menu(String namaPelanggan, boolean isMember) {
//         System.out.println("Selamat datang, " + namaPelanggan + "!");

//         if (isMember) {
//             System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
//         }

//         System.out.println("===== MENU RESTO KAFE =====");
//         System.out.println("1. Kopi Hitam - Rp 15,000");
//         System.out.println("2. Cappuccino - Rp 20,000");
//         System.out.println("3. Latte - Rp 22,000");
//         System.out.println("4. Teh Tarik - Rp 12,000");
//         System.out.println("5. Roti Bakar - Rp 10,000");
//         System.out.println("6. Mie Goreng - Rp 18,000");
//         System.out.println("===========================");
//         System.out.println("Silakan pilih menu yang Anda inginkan.");
//     }

//     public static int hitungTotalHargaNoAbsen(int pilihanMenu, int banyakItem) {
//         int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

//         int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
//         return hargaTotal;
//     }

//     public static void main(String[] args) {
//         Menu("Andi", true);
//     }
// }


//MODIFIKASI

import java.util.Scanner;

public class hitungTotalHarga23 {
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");



        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam   - Rp 15,000");
        System.out.println("2. Cappuccino   - Rp 20,000");
        System.out.println("3. Latte        - Rp 22,000");
        System.out.println("4. Teh Tarik    - Rp 12,000");
        System.out.println("5. Roti Bakar   - Rp 10,000");
        System.out.println("6. Mie Goreng   - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga23(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

// PERTANYAAN 4 :
// a.) Jika kodePromo adalah "DISKON50", diskonnya 50%. Jika "DISKON30", diskonnya 30%.
    public static int hitungDiskon(int total, String kodePromo, boolean isMember) {

    double persentaseDiskon = 0;

    if (kodePromo.equalsIgnoreCase("DISKON50")) {
        persentaseDiskon += 0.50;
    } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
        persentaseDiskon += 0.30;
    } else {
        System.out.println("Kode promo invalid");
    }

// b.) Member mendapatkan tambahan diskon 10%
    if (isMember) {
        persentaseDiskon += 0.10;
    }

    int diskon = (int) (total * persentaseDiskon);

    return diskon;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true);

        // System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        // int pilihanMenu = sc.nextInt();
        // System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        // int banyakItem = sc.nextInt();

        // int totalBayar = hitungTotalHarga23(pilihanMenu, banyakItem);
        // System.out.println("Total harga untuk pesanan Anda: Rp " + totalBayar);

//MOdifikasi
        // int totalBayar = hitungTotalHarga23(pilihanMenu, banyakItem);
        // System.out.println("Total harga untuk pesanan Anda: Rp " + totalBayar);


//Modifikasi    
    int totalBayar = 0;
    String lanjut;

    do {
    System.out.print("Masukkan nomor menu (1-6): ");
    int pilihanMenu = sc.nextInt();

    System.out.print("Masukkan jumlah item: ");
    int banyakItem = sc.nextInt();

    if (pilihanMenu < 1 || pilihanMenu > 6) {
        System.out.println("Menu tidak tersedia");
    } else if (banyakItem <= 0) {
        System.out.println("Jumlah item harus lebih dari 0");
    } else {
        int harga = hitungTotalHarga23(
            pilihanMenu, banyakItem
        );

        totalBayar += harga;
        System.out.println("Harga pesanan: Rp" + harga);
    }

    System.out.print("Tambah pesanan? (y/n): ");
    lanjut = sc.next();

    } while (lanjut.equalsIgnoreCase("y"));

// c.) Menampilkan hasil perhitungan
    int diskon = hitungDiskon(totalBayar, "DISKON30", true);

    System.out.println("\n==========================");
    System.out.println("Total harga: Rp " + totalBayar);
    System.out.println("Besar diskon: Rp " + diskon);
    System.out.println("Total bayar: Rp " + (totalBayar - diskon));



    // System.out.println("Total seluruh pesanan: Rp" + totalBayar);

    }
}



