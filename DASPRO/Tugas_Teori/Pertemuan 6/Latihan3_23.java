import java.util.Scanner;

public class Latihan3_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kategori = "";
        int harga = 0, ukuran = 0;

        System.out.println("Daftar Merk Sepatu:\n1. Converse\n2. Sketcher\n3. Nike ");
        System.out.print("Merk sepatu yang diinginkan: ");
        String merk = sc.nextLine();

        merk = merk.toLowerCase().trim();

        if (merk.equals("converse")) {

            System.out.println("Daftar Kategori:\n1. Slip On\n2. High Top ");
            System.out.print("Pilih kategori: ");
            kategori = sc.nextLine();

            kategori = kategori.toLowerCase().trim();

            if (kategori.equals("slip on")) {
                System.out.print("Masukan ukuran sepatu: ");
                ukuran = sc.nextInt();

                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 800000;
                    } else {
                        System.out.println("Ukuran tidak tersedia");
                        return;
                    }
                } else {
                    System.out.println("Ukuran tidak tersedia");
                    return;
                }

            } else if (kategori.equals("high top")) {

                System.out.print("Masukan ukuran sepatu: ");
                ukuran = sc.nextInt();

                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1200000;
                    } else {
                        System.out.println("Ukuran tidak tersedia");
                        return;
                    }
                } else {
                    System.out.println("Ukuran tidak tersedia");
                    return;
                }

            } else {
                System.out.println("Kategori tidak tersedia");
                return;
            }

        } else if (merk.equals("sketcher")) {

            System.out.println("Daftar Kategori:\n1. Woman\n2. Man ");
            System.out.print("Pilih kategori: ");
            kategori = sc.nextLine();

            kategori = kategori.toLowerCase().trim();

            if (kategori.equals("woman")) {
                System.out.print("Masukan ukuran sepatu: ");
                ukuran = sc.nextInt();

                if (ukuran >= 36) {
                    if (ukuran <= 41) {
                        harga = 1000000;
                    } else {
                        System.out.println("Ukuran tidak tersedia");
                        return;
                    }
                } else {
                    System.out.println("Ukuran tidak tersedia");
                    return;
                }

            } else if (kategori.equals("man")) {

                System.out.print("Masukan ukuran sepatu: ");
                ukuran = sc.nextInt();

                if (ukuran >= 41) {
                    if (ukuran <= 44) {
                        harga = 1800000;
                    } else {
                        System.out.println("Ukuran tidak tersedia");
                        return;
                    }
                } else {
                    System.out.println("Ukuran tidak tersedia");
                    return;
                }

            } else {
                System.out.println("Kategori tidak tersedia");
                return;
            }

        } else if (merk.equals("nike")) {

            System.out.println("Daftar Kategori:\n1. Kids\n2. Adult ");
            System.out.print("Pilih kategori: ");
            kategori = sc.nextLine();

            kategori = kategori.toLowerCase().trim();

            if (kategori.equals("kids")) {
                System.out.print("Masukan ukuran sepatu: ");
                ukuran = sc.nextInt();

                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 750000;
                    } else {
                        System.out.println("Ukuran tidak tersedia");
                        return;
                    }
                } else {
                    System.out.println("Ukuran tidak tersedia");
                    return;
                }

            } else if (kategori.equals("adult")) {

                System.out.print("Masukan ukuran sepatu: ");
                ukuran = sc.nextInt();

                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1500000;
                    } else {
                        System.out.println("Ukuran tidak tersedia");
                        return;
                    }
                } else {
                    System.out.println("Ukuran tidak tersedia");
                    return;
                }

            } else {
                System.out.println("Kategori tidak tersedia");
                return;
            }

        } else {
            System.out.println("Merk tidak tersedia");
            return;
        }

        System.out.println("***************************************");
        System.out.println("Sepatu yang dibeli: " + merk);
        System.out.println("Kategori yang dipilih: " + kategori);
        System.out.println("Ukuran sepatu: " + ukuran);
        System.out.println("Harga sepatu: Rp." + harga);
    }
}