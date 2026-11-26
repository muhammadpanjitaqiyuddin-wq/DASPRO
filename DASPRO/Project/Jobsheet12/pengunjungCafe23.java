// public class pengunjungCafe23 {
//     static void daftarPengunjung(String... namaPengunjung) {
//         System.out.println("Daftar Nama Pengunjung:");
//         // for (int i = 0; i < namaPengunjung.length; i++) {
//         //     System.out.println("- " + namaPengunjung[i]);
//         // }

// // a.) Modifikasi fungsi daftarPengunjung menggunakan perulangan for-each.
//         for (String nama : namaPengunjung) {
//             System.out.println(nama);
// }

//     }



//     public static void main(String[] args) {
//         // daftarPengunjung();

// // b.) Jalankan pemanggilan pada potongan tersebut
//         String[] tamu = {
//         "Ali",
//         "Budi",
//         "Citra"
//     };

//     daftarPengunjung(tamu);

//         // Setelah ditambahkan
//         daftarPengunjung("Andi");
//         daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
//     }
// }




// MODIFIKASI SOAL NO. 3 PERCOBAAN 4
// Ubah fungsi menjadi daftarPengunjung(int nomorMeja, String... namaPengunjung
public class pengunjungCafe23 {

    static void daftarPengunjung (int nomorMeja, String... namaPengunjung){
        System.out.println("Meja Nomor " + nomorMeja);
        System.out.println("Daftar Nama Pengunjung : ");

// a.) ubah (String... namaPengunjung, int nomorMeja)
    // static void daftarPengunjung (String... namaPengunjung, int nomorMeja){
    //     System.out.println("Meja Nomor " + nomorMeja);
    //     System.out.println("Daftar Nama Pengunjung : ");

// b.) (String... namaPengunjung, int... nomorMeja)
        // static void daftarPengunjung (String... namaPengunjung, int... nomorMeja){
        //     System.out.println("Meja Nomor " + nomorMeja);
        //     System.out.println("Daftar Nama Pengunjung : ");


        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

//         public static void main(String[] args) {
//         daftarPengunjung(1, "Ali","Budi", "Citra");
//     }
// }


// PERTANYAAN 4 :
// Buat fungsi hitungTotalBelanja(int... harga)
    public static void main(String[] args) {
        daftarPengunjung(1, "Ali","Budi", "Citra");

        // Uji fungsi tersebut dengan 1, 3, dan 5 argumen
        System.out.println("1 argumen: " + hitungTotalBelanja(10000));

        System.out.println("3 argumen: " + hitungTotalBelanja(10000, 15000, 20000));

        System.out.println("5 argumen: " + hitungTotalBelanja(1000, 2000, 3000, 4000, 5000));

    }

    public static int hitungTotalBelanja(int... harga) {
        int total = 0;

        for (int nilai : harga) {
            total += nilai;
        }

        return total;
    }
}
