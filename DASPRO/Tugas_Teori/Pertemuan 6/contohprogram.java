import java.util.Scanner; // library agar bisa ngetik dengan keyboard

public class contohprogram {

    public static void main(String[] args) {  //methode
        Scanner sc = new Scanner(System.in);
    int total;
    int diskon;
    int bayar;
    String kartu;

    System.out.print("Apakah pelanggan mempunyai kartu anggota (y atau t)? ");
    kartu = sc.nextLine();
    System.out.print("Berapa total harga barang belanjaan? Rp ");
    total = sc.nextInt();

    if (kartu.equals("y")) {
      if (total > 500000) {
        diskon = 50000;
      } else {
        diskon = 25000;
      }
    } else {
      if (total > 200000) {
        diskon = 10000;
      } else {
        diskon = 0;
      }
    }

    bayar = total - diskon;
    System.out.println("Total yang harus dibayar: Rp " + bayar);
    sc.close();

    }
}