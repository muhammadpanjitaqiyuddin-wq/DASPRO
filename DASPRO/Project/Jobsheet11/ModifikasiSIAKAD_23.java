//Soal No.1 

// import java.util.Scanner;

// public class ModifikasiSIAKAD_23 {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Masukkan jumlah mahasiswa: ");
//         int jumlahMahasiswa = sc.nextInt();

//         System.out.print("Masukkan jumlah mata kuliah: ");
//         int jumlahMataKuliah = sc.nextInt();

//         int[][] nilai = new int[jumlahMahasiswa][jumlahMataKuliah];

//         for (int i = 0; i < nilai.length; i++) {

//             System.out.println("\nInput nilai mahasiswa ke-" + (i + 1));

//             double totalPerSiswa = 0;

//             for (int j = 0; j < nilai[i].length; j++) {

//                 System.out.print("Nilai mata kuliah ke-" + (j + 1) + ": ");
//                 nilai[i][j] = sc.nextInt();

//                 totalPerSiswa += nilai[i][j];
//             }

//             double rataRata = totalPerSiswa / nilai[i].length;

//             System.out.println("Rata-rata mahasiswa ke-" + (i + 1)
//                     + ": " + rataRata);
//         }

//         System.out.println("\n================================");
//         System.out.println("RATA-RATA SETIAP MATA KULIAH");

//         for (int j = 0; j < nilai[0].length; j++) {

//             double totalPerMatkul = 0;

//             for (int i = 0; i < nilai.length; i++) {
//                 totalPerMatkul += nilai[i][j];
//             }

//             double rataRata = totalPerMatkul / nilai.length;

//             System.out.println("Mata kuliah ke-" + (j + 1)
//                     + ": " + rataRata);
//         }

//     }
// }

//Contoh Pertanyaan Diskusi 1

import java.util.Scanner;

public class ModifikasiSIAKAD_23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] nilai = new int[4][3];

        double totalPerSiswa = 0;

        for (int i = 0; i < nilai.length; i++) {

            System.out.println("\nMahasiswa ke-" + (i + 1));

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();

                totalPerSiswa += nilai[i][j];
            }

            double rataRata = totalPerSiswa / nilai[i].length;

            System.out.println("Total nilai: " + totalPerSiswa);
            System.out.println("Rata-rata: " + rataRata);
        }

    }
}