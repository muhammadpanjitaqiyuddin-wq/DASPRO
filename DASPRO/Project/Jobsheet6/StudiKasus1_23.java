package DASPRO.Project.Jobsheet6;

import java.util.Scanner;

public class StudiKasus1_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar = 0;
        int kembalian, kurang;

        System.out.println("Masukkan Jumlah Cup : ");
        jumlahCup = sc.nextInt();
        System.out.println("Masukkan Uang yang dibayarkan : ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10/100;
            totalBayar = totalHarga - diskon;
        }else {
            totalBayar = totalHarga;
        }

        System.out.println("Total Harga : Rp "+ totalHarga);
        System.out.println("Diskon      : Rp "+ diskon);
        System.out.println("Total Bayar : Rp 2"+ totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian   : Rp " + kembalian);
        }else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang Tidak Cukup, kurang Rp "+ kurang);
        }
        sc.close();
    }
}
