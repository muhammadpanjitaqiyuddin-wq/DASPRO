// import java.util.Scanner;

// public class Tugas2_23 {
//     public static void main(String[] args) {

//         String[] kota = {"Tokyo", "Osaka", "Sapporo",
//                 "Fukuoka", "Naha"};
// double[][] suhu = new double[5][7];  // baris = kota, kolom = hari
// Scanner sc = new Scanner(System.in);
// for (int i = 0; i < suhu.length; i++) {
//     for (int j = 0; j < suhu[i].length; j++) {
//         System.out.print(kota[i] + " hari " + (j + 1) + ": ");
//         suhu[i][j] = sc.nextDouble();
//             }
//         }
//     }
// }


//MODIFIKASIIIIII

import java.util.Scanner;

public class ContohTugas2_23 {
    public static void main(String[] args) {
        String[] kota = {"Tokyo", "Osaka", "Sapporo",
                         "Fukuoka", "Naha"};
        double[][] suhu = new double[5][7]; 
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < suhu.length; i++) {
            for (int j = 0; j < suhu[i].length; j++) {
                System.out.print(kota[i] + " hari " + (j + 1) + ": ");
                suhu[i][j] = sc.nextDouble();
            }
        }

        double minSuhu = suhu[0][0];
        int minBaris = 0, minKolom = 0;

        double maxSuhu = suhu[0][0];
        int maxBaris = 0, maxKolom = 0;

        for (int i = 0; i < suhu.length; i++) {
            for (int j = 0; j < suhu[i].length; j++) {
                if (suhu[i][j] < minSuhu) {
                    minSuhu = suhu[i][j];
                    minBaris = i;
                    minKolom = j;
                }
                if (suhu[i][j] > maxSuhu) {
                    maxSuhu = suhu[i][j];
                    maxBaris = i;
                    maxKolom = j;
                }
            }
        }

        System.out.println("Suhu terendah di kota " + kota[minBaris] + " hari ke-" + (minKolom + 1));
        System.out.println("Suhu tertinggi di kota " + kota[maxBaris] + " hari ke-" + (maxKolom + 1));
    }
}