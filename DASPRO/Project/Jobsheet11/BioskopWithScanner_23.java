//MOdifikasi Soal No. 2
// import java.util.Scanner;

// public class ModifikasiBioskopWithScanner_23 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int baris, kolom, menu;
//         String nama;

//         String[][] penonton = new String[4][2];

//         do {
//             System.out.println("\n=== MENU BIOSKOP ===");
//             System.out.println("1. Input data penonton");
//             System.out.println("2. Tampilkan daftar penonton");
//             System.out.println("3. Exit");
//             System.out.print("Pilih menu: ");
//             menu = sc.nextInt();
//             sc.nextLine();

//             switch (menu) {
//                 case 1:
//                     System.out.print("Masukkan nama: ");
//                     nama = sc.nextLine();

//                     System.out.print("Masukkan baris: ");
//                     baris = sc.nextInt();

//                     System.out.print("Masukkan kolom: ");
//                     kolom = sc.nextInt();
//                     sc.nextLine();

//                     penonton[baris - 1][kolom - 1] = nama;
//                     break;

//                 case 2:
//                     System.out.println("\nDaftar Penonton:");

//                     for (int i = 0; i < penonton.length; i++) {
//                         for (int j = 0; j < penonton[i].length; j++) {
//                             System.out.print(penonton[i][j] + "\t");
//                         }
//                         System.out.println();
//                     }
//                     break;

//                 case 3:
//                     System.out.println("Program selesai.");
//                     break;

//                 default:
//                     System.out.println("Menu tidak tersedia!");
//             }

//         } while (menu != 3);

//     }
// }

//Modifikasi Soal no. 3
// import java.util.Scanner;

// public class BioskopWithScanner_23 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int baris, kolom, menu;
//         String nama;

//         String[][] penonton = new String[4][2];

//         do {
//             System.out.println("\n=== MENU BIOSKOP ===");
//             System.out.println("1. Input data penonton");
//             System.out.println("2. Tampilkan daftar penonton");
//             System.out.println("3. Exit");
//             System.out.print("Pilih menu: ");
//             menu = sc.nextInt();
//             sc.nextLine();

//             switch (menu) {
//                 case 1:
//                 System.out.print("Masukkan nama: ");
//                 nama = sc.nextLine();

//                 System.out.print("Masukkan baris: ");
//                 baris = sc.nextInt();

//                 System.out.print("Masukkan kolom: ");
//                 kolom = sc.nextInt();
//                 sc.nextLine();

//                 if (baris < 1 || baris > penonton.length ||
//                     kolom < 1 || kolom > penonton[baris - 1].length) {

//                     System.out.println("Nomor baris atau kolom tidak tersedia!");

//                 } else {
//                     penonton[baris - 1][kolom - 1] = nama;
//                     System.out.println("Data penonton berhasil ditambahkan.");
//                 }
//                 break;

//                 case 2:
//                     System.out.println("\nDaftar Penonton:");

//                     for (int i = 0; i < penonton.length; i++) {
//                         for (int j = 0; j < penonton[i].length; j++) {
//                             System.out.print(penonton[i][j] + "\t");
//                         }
//                         System.out.println();
//                     }
//                     break;

//                 case 3:
//                     System.out.println("Program selesai.");
//                     break;

//                 default:
//                     System.out.println("Menu tidak tersedia!");
//             }

//         } while (menu != 3);

//     }
// }

//Modifikasi Soal No. 4
// import java.util.Scanner;

// public class BioskopWithScanner_23 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int baris, kolom, menu;
//         String nama;

//         String[][] penonton = new String[4][2];

//         do {
//             System.out.println("\n=== MENU BIOSKOP ===");
//             System.out.println("1. Input data penonton");
//             System.out.println("2. Tampilkan daftar penonton");
//             System.out.println("3. Exit");
//             System.out.print("Pilih menu: ");
//             menu = sc.nextInt();
//             sc.nextLine();

//             switch (menu) {
//                 case 1:
//                     System.out.print("Masukkan nama: ");
//                     nama = sc.nextLine();

//                     while (true) {
//                         System.out.print("Masukkan baris: ");
//                         baris = sc.nextInt();

//                         System.out.print("Masukkan kolom: ");
//                         kolom = sc.nextInt();
//                         sc.nextLine();

//                         if (baris < 1 || baris > penonton.length ||
//                             kolom < 1 || kolom > penonton[baris - 1].length) {

//                             System.out.println("Nomor baris atau kolom tidak tersedia!");

//                         } else if (penonton[baris - 1][kolom - 1] != null) {

//                             System.out.println("Kursi sudah terisi! Silakan pilih kursi lain.");

//                         } else {
//                             penonton[baris - 1][kolom - 1] = nama;
//                             System.out.println("Data penonton berhasil ditambahkan.");
//                             break;
//                         }
//                     }
//                     break;

//                 case 2:
//                     System.out.println("\nDaftar Penonton:");

//                     for (int i = 0; i < penonton.length; i++) {
//                         for (int j = 0; j < penonton[i].length; j++) {
//                             System.out.print(penonton[i][j] + "\t");
//                         }
//                         System.out.println();
//                     }
//                     break;

//                 case 3:
//                     System.out.println("Program selesai.");
//                     break;

//                 default:
//                     System.out.println("Menu tidak tersedia!");
//             }

//         } while (menu != 3);

//     }
// }


//Modifikasi Soal No.5
import java.util.Scanner;

public class BioskopWithScanner_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama;

        String[][] penonton = new String[4][2];

        do {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();

                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > penonton.length ||
                            kolom < 1 || kolom > penonton[baris - 1].length) {

                            System.out.println("Nomor baris atau kolom tidak tersedia!");

                        } else if (penonton[baris - 1][kolom - 1] != null) {

                            System.out.println("Kursi sudah terisi! Silakan pilih kursi lain.");

                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil ditambahkan.");
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nDaftar Penonton:");

                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {

                            if (penonton[i][j] == null) {
                                System.out.print("***\t");
                            } else {
                                System.out.print(penonton[i][j] + "\t");
                            }

                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (menu != 3);

    }
}